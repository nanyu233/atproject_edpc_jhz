package activetech.base.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstroleCustom;
import activetech.base.service.FirstService;
import activetech.base.service.RoleService;
import activetech.base.service.SystemConfigService;
import activetech.base.service.UserService;
import activetech.hospital.dao.mapper.HspSqlInfMapper;
import activetech.hospital.pojo.domain.HspSqlInf;
import activetech.hospital.pojo.domain.HspSqlInfExample;
import activetech.hospital.pojo.domain.HspSqlInfExample.Criteria;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.service.HspreportService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
/**
 * 
 * <p>Title:AppoptionServiceImpl</p>
 * <p>Description:基础信息配置实现类Service</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月18日 上午10:51:26
 *
 */
public class FirstServiceImpl implements FirstService{
	@Autowired
	public SystemConfigService systemConfigService;
	@Autowired
	public UserService userService;
	@Autowired
	public HspreportService  hspreportService;
	@Autowired
	public RoleService roleService;
	
	@Autowired
	private HspSqlInfMapper hspSqlInfMapper;
	
	@Override
	public void indexmng(Model model) throws Exception {
		Map<String,Object> map = hspreportService.findDrhzrsZyy();
		model.addAttribute("highChartsDemoCustom", map.get("highChartsDemoCustom"));
		model.addAttribute("yjzzyrs", map.get("yjzzyrs"));
		model.addAttribute("yjzrs", map.get("yjzrs"));
	}
	
	@Override
	public Model first(Model model,ActiveUser activeUser) throws Exception {
		String pollpatient = systemConfigService.findAppoptionByOptkey("POLL_PATIENT").getOptvalue();
		String isdisplay_polling = "0";
		List<String> roles = userService.findRoleByUsrno(activeUser.getUsrno());
		if(roles != null && roles.size()>0) {
			DstroleCustom dstRole = roleService.findRoleByRoleid(roles.get(0).toString());
			//候诊提醒是否打开 0：不打开 1：打开
			if(pollpatient.equals("1")){
				if(roles.contains("1001")||activeUser.getUsrno().equals("admin")){
					isdisplay_polling = "1";
				}	
			}
			model.addAttribute("firstTitleName",dstRole.getIndexname());
			model.addAttribute("firstIdnexUrl", dstRole.getIndexurl());
			model.addAttribute("isdisplay_polling", isdisplay_polling);
		}
		return model;
	}
	
	/**
	 * HIS内嵌病历 跳转首页数据处理
	 * @param activeUser
	 * @param type 类型
	 * @return
	 */
	@Override
	public Model firstHis(Model model,ActiveUser activeUser,HspemginfCustom hspemginfCustom,String type) throws Exception {
		String pollpatient = systemConfigService.findAppoptionByOptkey("POLL_PATIENT").getOptvalue();
		String isdisplay_polling = "0";
		List<String> roles = userService.findRoleByUsrno(activeUser.getUsrno());
		if(roles != null && roles.size()>0) {
			DstroleCustom dstRole = roleService.findRoleByRoleid(roles.get(0).toString());
			//候诊提醒是否打开 0：不打开 1：打开
			if(pollpatient.equals("1")){
				if(roles.contains("1001")||activeUser.getUsrno().equals("admin")){
					isdisplay_polling = "1";
				}	
			}
			
			//内部页面URL拼接
			String hisIndex = "", hisTitle = ""; 
			//通过病历号和就诊次数查到患者数据 不替换首页URL 新加一个tab页
			if(null != hspemginfCustom && StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getEmgSeq())) {
				HspSqlInfExample hspSqlInfExample = new HspSqlInfExample();
				Criteria criteria = hspSqlInfExample.createCriteria();
				criteria.andEmgSeqEqualTo(hspemginfCustom.getEmgSeq());
				List<HspSqlInf> sqlList = hspSqlInfMapper.selectByExample(hspSqlInfExample);
				//过滤留抢状态的数据
				sqlList = sqlList.stream().filter(e ->"6".equals(e.getSqlStaCod())).collect(Collectors.toList());
				//不为空且大于0，说明有留抢数据
				if(StringUtils.isNotNullAndZero(sqlList)) {
					type = "qjsCase";
				}else {
					type = "qjsCaseMz";
				}
				if("qjsCase".equalsIgnoreCase(type)) {
					hisTitle = hspemginfCustom.getCstNam() + "-留抢病历记录";
				}else if("qjsCaseMz".equalsIgnoreCase(type)) {
					hisTitle = hspemginfCustom.getCstNam() + "-门诊病历记录";
				}
				//mpi jzxh 这两个字段为处理 MPI+JZXH未查到数据，通过名字来查询一小时内且 JZXH为空的数据，
			    //所以在 requestSource ！= HIS_NO_PATIENT 的情况下也要赋值
				hisIndex = "zyyxtpg/toLeftWrap.do.do?emgSeq="+hspemginfCustom.getEmgSeq() + "&mpi=" + hspemginfCustom.getMpi() + "&jzxh=" + hspemginfCustom.getJzxh() +"&cstNam="+hspemginfCustom.getCstNam()+"&zgcount="+hspemginfCustom.getZgcount()+"&pageSrc="+type;
			}else {
				//未查到患者数据
				
				//type不为空说明是传递了类型，则是留抢
				if(StringUtils.isNotNullAndEmptyByTrim(type)) {
					type = "qjsCase";
				}else {
					//没有传递参数，则是门诊
					type = "qjsCaseMz";
				}
				//时间
				String date = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
				//生成预检号
				String emgseq = systemConfigService.findSequences("HSPEMGINF_EMGSEQ","6", date);
				//院区
				String HSPLP = systemConfigService.findAppoptionByOptkey("HSPLP").getOptvalue();
				if("SD".equals(HSPLP)) {
					//三墩院区预检号标识 SD
					hspemginfCustom.setEmgSeq("SD"+emgseq);
				}else {
					//灵隐院区预检号标识 LY
					hspemginfCustom.setEmgSeq("LY"+emgseq);
				}
				//判断跳转页面 拼接URL
				if("qjsCase".equalsIgnoreCase(type)) {
					dstRole.setIndexname("留抢病历");
					dstRole.setIndexurl("zyyqjs/qjscase.do?requestSource=HIS_NO_PATIENT&reloadtype=1");
				}else if("qjsCaseMz".equalsIgnoreCase(type)){
					hisIndex = "hzszyyjzmz/queryjzmzbl.do?requestSource=HIS_NO_PATIENT&mpi=" + hspemginfCustom.getMpi() + "&jzxh=" + hspemginfCustom.getJzxh() + "&cstNam=" + hspemginfCustom.getCstNam() + "&emgSeq=" + hspemginfCustom.getEmgSeq() + "&reloadtype=1";
					hisTitle = "急诊门诊病历";
				}
			}
			
			model.addAttribute("firstTitleName",dstRole.getIndexname());
			model.addAttribute("firstIdnexUrl", dstRole.getIndexurl());
			model.addAttribute("isdisplay_polling", isdisplay_polling);
			model.addAttribute("hisIndex",hisIndex);
			model.addAttribute("hisTitle",hisTitle);
		}
		return model;
	}
}