package activetech.zyyhospital.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import activetech.base.dao.mapper.DstuserroleMapper;
import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.domain.Dstuserrole;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.pojo.dto.Menu;
import activetech.base.pojo.dto.Operation;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.FirstService;
import activetech.base.service.SystemConfigService;
import activetech.base.service.UserService;
import activetech.basehis.dao.mapper.VHemsRczMapper;
import activetech.basehis.pojo.domain.VHemsRcz;
import activetech.basehis.service.OracleHisService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.service.ZyyHspemginfService;

/**
 *  HIS系统查询电子病历
 * @author machaofan
 *
 */
@Controller
public class HisElectronicMedical {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	protected DstuserroleMapper dstuserroleMapper;
	
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	
	@Autowired
	private SystemConfigService systemConfigService;
	
	@Autowired
	public FirstService firstService;
	@Autowired
	private VHemsRczMapper vHemsRczMapper;
	@Autowired
	private OracleHisService oracleHisService;
	
	/**
	 * HIS系统查询病历
	 * @param mpi 病历号
	 * @param userid 工号
	 * @param jzxh 就诊次数
	 * @param usrNam 医生名字
	 * @param cstNam 病人名字
	 * @param type 病历类型（留抢病历、门诊病历）
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/hisMedical")
	public void hisOutpatientMedical(HttpServletRequest request, HttpServletResponse response, HttpSession session, String mpi, String userid, String jzxh, String usrNam, String cstNam, String type) throws Throwable{
		//参数校验 除病历类型外，其他参数都不可为空，否则给出提示，HIS系统URL传参有误，请联系管理员
		if(StringUtils.isNotNullAndEmptyByTrim(mpi) && StringUtils.isNotNullAndEmptyByTrim(userid) 
				&& StringUtils.isNotNullAndEmptyByTrim(jzxh) && StringUtils.isNotNullAndEmptyByTrim(usrNam) 
				&& StringUtils.isNotNullAndEmptyByTrim(cstNam)) {
			//如果是超级管理员则无权限查看病历
			if("admin".equals(userid)) {
				ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 920, new Object [] {"无权限查看!"}));
			}
			HspemginfQueryDto hspemginfQueryDto = new HspemginfQueryDto();
			HspemginfCustom hspemginfCustom = new HspemginfCustom();
			hspemginfCustom.setMpi(mpi);
			hspemginfCustom.setJzxh(Long.valueOf(jzxh));
			hspemginfCustom.setCstNam(cstNam);
			hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
			hspemginfCustom = zyyHspemginfService.getEmgInfByMpiAndJzxh(hspemginfQueryDto);
			//如果通过MPI+JZXH未查到数据，则通过名字查询挂号时间在 （当前时间 -- (当前时间 - 1小时)）之内的，且消息字段为空得数据
			if(null == hspemginfCustom) {
				VHemsRcz vHemsRczReg = vHemsRczMapper.selectForMz(mpi,Long.valueOf(jzxh));
				if(vHemsRczReg != null){
					hspemginfQueryDto.getHspemginfCustom().setGhsj(vHemsRczReg.getGhsj());
					List<HspemginfCustom> hspemginfCustomList = zyyHspemginfService.getEmgInfByXm(hspemginfQueryDto);
					// 如果查到数据，且只有一条则将数据返回
					if(null != hspemginfCustomList  && hspemginfCustomList.size() == 1){
						if(hspemginfCustomList.get(0).getMpi() == null || mpi.equals(hspemginfCustomList.get(0).getMpi())){
							hspemginfCustom = hspemginfCustomList.get(0);
						}
					}else if(null != hspemginfCustomList  && hspemginfCustomList.size() > 1){
						for (HspemginfCustom hspemginfCustomXm : hspemginfCustomList) {
							if(vHemsRczReg.getGhks().equals(hspemginfCustomXm.getEmgFkCod()) && (hspemginfCustomXm.getMpi() == null || mpi.equals(hspemginfCustomXm.getMpi()))){
								hspemginfCustom = hspemginfCustomXm;
							}
						}
					}
				}/*else{
					ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 920, new Object [] {"未查询到相应挂号信息!"}));
				}*/
			}
			if(null != hspemginfCustom){
				hspemginfCustom.setMpi(mpi);
				hspemginfCustom.setCstNam(cstNam);
				hspemginfCustom.setJzxh(Long.valueOf(jzxh));
				oracleHisService.updateRczGhxxBdMz(hspemginfCustom);
			}
			mdeicalRequestDispatcher(request,response,session,hspemginfCustom,userid,usrNam);
		}else {
			ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 920, new Object [] {"HIS系统URL传参有误，请联系管理员!"}));
		}
		
	}
	
	/**
	 * HIS查询电子病历（身份验证、请求转发、页面跳转）
	 * @param request
	 * @param response
	 * @param session
	 * @param hspemginfCustom 预检患者信息
	 * @param userid 工号
	 * @throws Throwable
	 */
	private void mdeicalRequestDispatcher(HttpServletRequest request, HttpServletResponse response, HttpSession session, HspemginfCustom hspemginfCustom, String userid, String usrNam)throws Throwable {
		String index = "/firstHis.do";
		Dstuser dstuser = userService.findUserByUsrno(userid);
		if(null == dstuser || !StringUtils.isNotNullAndEmptyByTrim(dstuser.getUserid())) {
			// 用户不存在,新增用户
			DstuserCustom dstuserCustom = new DstuserCustom();
			dstuserCustom.setUsrno(userid);
			dstuserCustom.setUsrname(usrNam);
			dstuserCustom.setGroupid("1");
			dstuserCustom.setUserstate("1");
			dstuserCustom.setSysid("00100");
			userService.insertUser(dstuserCustom);
			dstuser = userService.findUserByUsrno(userid);
		}
		ActiveUser activeUser = new ActiveUser();
		activeUser.setUsrno(userid);
	   	activeUser.setUsrname(dstuser.getUsrname());
	   	activeUser.setGroupid(dstuser.getGroupid());
	   	activeUser.setSysid(dstuser.getSysid());// 单位id（重要）
	   	//取出用户所属的角色
		List<String> roles = userService.findRoleByUsrno(userid);
		//如果不包含 日常医生则赋予病历查看角色
		List<String> newRoles = new ArrayList<String>();
		//如果无角色则赋予病历查看角色
		if(null == roles) {
			roles = new ArrayList<String>();
			newRoles.add("1014");
			roles.addAll(newRoles);
		}else {
			//如果没有日常医生角色 则赋予病历查看角色
			if(!roles.contains("1009")) {
				if(!roles.contains("1014")) {
					newRoles.add("1014");
				}
				roles.add("1014");
			}
		}
		for (String string : newRoles) {
			Dstuserrole dstuserrole = new Dstuserrole();
			dstuserrole.setId(UUIDBuild.getUUID());
			dstuserrole.setUsrno(userid);
			dstuserrole.setRoleid(string);
			dstuserroleMapper.insert(dstuserrole);
		}	
		//角色对应菜单
	   	List<Menu> menu_list = userService.findMenuByroleid(roles);
		Menu menu = new Menu();
		menu.setMenus(menu_list);
		//将用户菜单存入用户身份对象中
		activeUser.setMenu(menu);
	   	activeUser.setDstroleList(roles);
	   	List<Operation> operations = userService.findOperatByRoleid(roles);
	   	//将用户操作权限存入用户身份对象中
		activeUser.setOperationList(operations);
		//院区
		String HSPLP = systemConfigService.findAppoptionByOptkey("HSPLP").getOptvalue();
		activeUser.setHospitalCategory(HSPLP);
		// 将用户身份信息写入session
		session.setAttribute(Config.ACTIVEUSER_KEY, activeUser);
		//请求url拼接
		//如果患者存在 则直接跳转内部 否则不做处理，跳转系统配置的列表页面
		if(null != hspemginfCustom) {
			index += "?emgSeq="+hspemginfCustom.getEmgSeq()+"&zgcount="+hspemginfCustom.getZgcount();
		}else {
			index +="?hspemginfCustom="+hspemginfCustom;
		}
		//转发请求
		request.getRequestDispatcher(index).forward(request, response);
	}

}
