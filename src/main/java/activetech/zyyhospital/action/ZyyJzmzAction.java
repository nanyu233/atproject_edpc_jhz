package activetech.zyyhospital.action;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.annotation.FormToken;
import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.AjaxInfo;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.CompctlService;
import activetech.base.service.UserService;
import activetech.basehis.pojo.domain.VHemsRcz;
import activetech.basehis.service.OracleHisService;
import activetech.hospital.pojo.dto.HspFastInfCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.BeanUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.dto.HspLqblInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.service.ZyyHspJzmzInfService;
import activetech.zyyhospital.service.ZyyHspemginfService;

/**
 * 
 * <p>
 * Title:EmgAction
 * </p>
 * <p>
 * Description:杭州市中医院急诊门诊
 * </p>
 * @author wzl
 * @date 2019年12月12日
 * 
 */

@Controller
@RequestMapping("/hzszyyjzmz")
public class ZyyJzmzAction {
	
	@Autowired
	private CompctlService compctlService;
	@Autowired
	private UserService userService;
	@Autowired
	private ZyyHspJzmzInfService zyyHspJzmzInfService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private OracleHisService oracleHisService;
	
	/**
	 * 急诊门诊病历列表跳转
	 * 
	 * @param model
	 * @param requestSource 请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 * @param mpi 病历号（HIS病历）
	 * @param cstNam 患者姓名（HIS病历用）
	 * @param emgSeq 预检号（HIS病历用）
	 * @param jzxh 就诊次数（HIS病历用）
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjzmzbl")
	public String jzmzblquery(Model model,ActiveUser activeUser, String moduleid,String requestSource, String mpi, String jzxh, String cstNam, String emgSeq) throws Exception {
		Dstuser dstuser = userService.findUserByUsrno(activeUser.getUsrno());		
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);		
		model.addAttribute("dstuser", dstuser);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("requestSource", requestSource);
		model.addAttribute("mpi", mpi);
		model.addAttribute("cstNam", cstNam);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("jzxh", jzxh);
		return "/hzszyyhospital/hzszyyclinic/clinicRecord";
	}
	
	/**
	 * 急诊门诊病历查询列表
	 * @param dstuserQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/jzmzquery_result")
	public @ResponseBody DataGridResultInfo jzmzquery_result(
			HspemginfQueryDto hspemginfQueryDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order,ActiveUser activeUser
			) throws Exception{
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspemginfQueryDto.setSort("emgdat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspemginfQueryDto.setOrder("desc");
		}
		hspemginfQueryDto.getHspemginfCustom().setJzys(activeUser.getUsrno());
		int total =zyyHspJzmzInfService.jzmzFindHspemginfCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list =zyyHspJzmzInfService.jzmzFindHspemginfList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	

	/**
	 * @Description * 门诊病历记录首页
	 * 两种情况：1、MPI+JZXH查到数据，2、通过姓名查到数据 但是挂号失败，MPI、JZXH会出现可能为空的情况，要重新赋值
	 * @author machaofan
	 * @date 2020年8月10日下午4:02:52
	 * @param model
	 * @param emgSeq 预检号
	 * @param requestSource 请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 * @param mpi 病历号
	 * @param cstNam 患者姓名
	 * @param jzxh 就诊次数
	 * @param relevanceModule 判断跳到哪个目录---病历菜单
	 * @param isHisType 判断是否是历史病历
	 * @param lqblSeq
	 * @return
	 * @throws Exception
	 * @return String
	 */
	@RequestMapping("/tomzblHome")
	public String tomzblHome(Model model, String moduleid,String emgSeq, String lqblSeq, String mpi, String jzxh, String cstNam, String requestSource, String relevanceModule, String isHisType) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findEmgInfByEmgSeq(emgSeq);
		if(null == hspemginfCustom) {
			hspemginfCustom = new HspemginfCustom();
			hspemginfCustom.setEmgSeq(emgSeq);
			hspemginfCustom.setCstNam(cstNam);
		}
		if(null != hspemginfCustom) {
			if(!StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getMpi())) {
				hspemginfCustom.setMpi(mpi);
			}
			if(null == hspemginfCustom.getJzxh()) {
				hspemginfCustom.setJzxh(Long.valueOf(jzxh));
			}
		}
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("relevanceModule", relevanceModule);
		model.addAttribute("requestSource",requestSource);
		model.addAttribute("isHisType", isHisType);
		model.addAttribute("lqblSeq", lqblSeq);
		return "/hzszyyhospital/hzszyyclinic/lxrecord/qjscasenote";
	}
	
	/**
	 * @Description 跳转门诊病历
	 * 两种情况：1、MPI+JZXH查到数据，2、通过姓名查到数据 但是挂号失败，MPI、JZXH会出现可能为空的情况，要重新赋值
	 * @author machaofan
	 * @date 2020年8月10日下午4:04:41
	 * @param model
	 * @param emgSeq
	 * @param mpi
	 * @param jzxh
	 * @param cstNam
	 * @param requestSource
	 * @return
	 * @throws Exception
	 * @return String
	 */
	@RequestMapping("/querymzbl")
	@FormToken(save=true)
	public String querymzbl(Model model, String emgSeq, String mpi, String jzxh, String cstNam, String requestSource) throws Exception {
		model.addAttribute("mpi",mpi);
		model.addAttribute("jzxh",jzxh);
		model.addAttribute("emgSeq",emgSeq);
		model.addAttribute("cstNam",cstNam);
		model.addAttribute("requestSource",requestSource);
		return "/hzszyyhospital/hzszyyclinic/lxrecord/recordnote";
	}
	
	
	/**
	 * 获取门诊病历
	 * 两种情况：1、MPI+JZXH查到数据，2、通过姓名查到数据 但是挂号失败，MPI、JZXH会出现可能为空的情况，要重新赋值
	 * @param emgSeq 预检号
	 * @param lqblSeq 病历主键
	 * @param activeUser 用户信息
	 * @param isHisType 病历类型(historyRecord：历史病历)
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/findMzbl")
	public SubmitResultInfo findLqbl(String emgSeq, String lqblSeq, String mpi, String jzxh, String cstNam, ActiveUser activeUser){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		try {
			Map<String, Object> resMap = zyyHspJzmzInfService.findMzblByEmgSeq(emgSeq, lqblSeq, mpi, jzxh, cstNam, activeUser);
			resultInfo.setSysdata(resMap);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900,null);
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 保存门诊病历
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/submitMzbl")
	public SubmitResultInfo submitMzbl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		/*
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String emgSeq = zyyHspJzmzInfService.submitMzbl(hspLqbljlQueryDto, activeUser);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("emgSeq", emgSeq);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);*/
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String requestSource = hspLqbljlQueryDto.getRequestSource();
		HspemginfQueryDto hspemginfQueryDto = new HspemginfQueryDto();
		HspemginfCustom hspemginfCustomXm = null;
		//新增预检数据
		//保存前再次通过MPI和JZXH查询预检数据
		hspemginfQueryDto.setHspemginfCustom(hspLqbljlQueryDto.getHspemginfCustom());
		HspemginfCustom hspemginfCustom = zyyHspemginfService.getEmgInfByMpiAndJzxh(hspemginfQueryDto);
		//未查到则新增预检数据,查到则替换 emgSeq
		if(null == hspemginfCustom) {
			VHemsRcz vHemsRczReg = oracleHisService.selectForMz(hspLqbljlQueryDto.getHspemginfCustom().getMpi(),Long.valueOf(hspLqbljlQueryDto.getHspemginfCustom().getJzxh()));
			if(vHemsRczReg != null){
				hspemginfQueryDto.getHspemginfCustom().setGhsj(vHemsRczReg.getGhsj());
				List<HspemginfCustom> hspemginfCustomList = zyyHspemginfService.getEmgInfByXm(hspemginfQueryDto);
				// 如果查到数据，且只有一条则将数据返回
				if(null != hspemginfCustomList  && hspemginfCustomList.size() == 1){
					if(hspemginfCustomList.get(0).getMpi() == null || hspLqbljlQueryDto.getHspemginfCustom().getMpi().equals(hspemginfCustomList.get(0).getMpi())){
						hspemginfCustomXm = hspemginfCustomList.get(0);
					}
				}else if(null != hspemginfCustomList  && hspemginfCustomList.size() > 1){
					for (HspemginfCustom hspemginfCustomXmDb : hspemginfCustomList) {
						if(vHemsRczReg.getGhks().equals(hspemginfCustomXmDb.getEmgFkCod()) && (hspemginfCustomXmDb.getMpi() == null || hspLqbljlQueryDto.getHspemginfCustom().getMpi().equals(hspemginfCustomXmDb.getMpi()))){
							hspemginfCustomXm = hspemginfCustomXmDb;
						}
					}
				}
			}
			
			if(null != hspemginfCustomXm) {
				//从URL进来时，MPI+JZXH没查到数据，这个参数是有值的，保存时在查,查到数据，这个参数就赋空值
				requestSource = "";
				String emgSeq = hspemginfCustomXm.getEmgSeq();
				hspLqbljlQueryDto.getHspemginfCustom().setEmgSeq(emgSeq);
				hspLqbljlQueryDto.getHspLqblInfCustom().setEmgSeq(emgSeq);
				hspLqbljlQueryDto.getHspNrsInfCustom().setEmgSeq(emgSeq);
				hspLqbljlQueryDto.getHspFallAssInfCustom().setEmgSeq(emgSeq);
				hspemginfCustomXm.setMpi(hspLqbljlQueryDto.getHspemginfCustom().getMpi());
				hspemginfCustomXm.setJzxh(hspLqbljlQueryDto.getHspemginfCustom().getJzxh());
				try {
					oracleHisService.updateRczGhxxBdMz(hspemginfCustomXm);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}else{
				//从URL进来查到数据，这个参数是空的，保存时在查没查到数据，这个参数要重新赋值，用来判断新增预检
				requestSource = "HIS_NO_PATIENT";
				//请求来源赋值为 HIS查询病历且未查到患者数据
				hspemginfQueryDto.setRequestSource("HIS_NO_PATIENT");
				//评分数据赋值
				hspemginfQueryDto.setHspNrsInfCustom(hspLqbljlQueryDto.getHspNrsInfCustom());
				hspemginfQueryDto.setHspFallAssInfCustom(hspLqbljlQueryDto.getHspFallAssInfCustom());
				hspemginfQueryDto.setHspFastInfCustom(new HspFastInfCustom());
				//生命体征赋值
				HspemginfCustom hspemginfCustomMews = hspemginfQueryDto.getHspemginfCustom();
				HspLqblInfCustom hspLqblInfCustom = hspLqbljlQueryDto.getHspLqblInfCustom();
				
				if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcPulse())) {
					hspemginfCustomMews.setHrtRte(Short.valueOf(hspLqblInfCustom.getTgjcPulse()));
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcXyUp())) {
					hspemginfCustomMews.setSbpUpNbr(Short.valueOf(hspLqblInfCustom.getTgjcXyUp()));
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcXyDown())) {
					hspemginfCustomMews.setSbpDownNbr(Short.valueOf(hspLqblInfCustom.getTgjcXyDown()));
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcHx())) {
					hspemginfCustomMews.setBreNbr(Short.valueOf(hspLqblInfCustom.getTgjcHx()));
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcTw())) {
					hspemginfCustomMews.setTmpNbr(new BigDecimal(hspLqblInfCustom.getTgjcTw()));
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcCbzy())) {
					hspemginfCustomMews.setOxyNbr(Short.valueOf(hspLqblInfCustom.getTgjcCbzy()));
				}
				hspemginfCustomMews.setGlsNum(hspLqblInfCustom.getTgjcXt());
				hspemginfCustomMews.setGlsCod(hspLqblInfCustom.getTgjcXtType());
				hspemginfCustomMews.setGlsType(hspLqblInfCustom.getTgjcXtFlg());
				try {
					oracleHisService.updateRczGhxxBdMz(hspemginfQueryDto);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}else {
			//替换emgSeq
			String emgSeq = hspemginfCustom.getEmgSeq();
			hspLqbljlQueryDto.getHspemginfCustom().setEmgSeq(emgSeq);
			hspLqbljlQueryDto.getHspLqblInfCustom().setEmgSeq(emgSeq);
			hspLqbljlQueryDto.getHspNrsInfCustom().setEmgSeq(emgSeq);
			hspLqbljlQueryDto.getHspFallAssInfCustom().setEmgSeq(emgSeq);
			//如果通过MPI+JZXH查到数据了，这个参数就赋空值，在后边病历保存方法submitMzbl中，就不在做预检数据的新增或修改的判断，直接保存病历
			requestSource = "";
			if(!StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getAdtA01())){
				try {
					oracleHisService.updateRczGhxxBdMz(hspemginfCustom);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}	
		String emgSeq = zyyHspJzmzInfService.submitMzbl(requestSource,hspLqbljlQueryDto, activeUser,hspemginfQueryDto,hspemginfCustomXm);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("emgSeq", emgSeq);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@ResponseBody
	@RequestMapping(value = "/findEmgTotalByMpi")
	public AjaxInfo findEmgTotalByVstCad(HspemginfQueryDto hspemginfQueryDto) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		AjaxInfo ajax = new AjaxInfo();
		if(null != hspemginfQueryDto.getHspemginfCustom()) {
			if(!BeanUtil.validated(hspemginfQueryDto.getHspemginfCustom().getMpi())) {
				map.put("total", 0);
				ajax.setMsg(map);
				return ajax;
			}
		}
		if(hspemginfQueryDto.getStartdate()==null) {
			Calendar calendar = Calendar.getInstance();  
		    calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - 2);  
		    Date enddate = calendar.getTime();  
		    hspemginfQueryDto.setStartdate(enddate);
		    hspemginfQueryDto.setEnddate(new Date());
		}
	    
		int total =zyyHspemginfService.findEmgInfForRangeCount(hspemginfQueryDto);
		
		map.put("total", total);
		ajax.setMsg(map);
		return ajax;
	}
	
	
	/**
	 * 导入今日留抢病历
	 * @param emgSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findLqblByEmgSeq")
	public ResultInfo findLqblByEmgSeq(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> map = new HashMap<String,Object>();
		try {
			HspLqblInfCustom hspLqblInfCustom = zyyHspJzmzInfService.findLqblByEmgSeq(emgSeq);
			map.put("hspLqblInfCustom", hspLqblInfCustom);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE,900, null);
			e.printStackTrace();
		}
		resultInfo.setSysdata(map);
		return resultInfo;
	}
	
	/**
	 * @Description 治疗意见刷新
	 * @author machaofan
	 * @date 2020年8月10日上午11:29:24
	 * @param emgSeq
	 * @param mpi
	 * @param jzxh
	 * @return
	 * @return SubmitResultInfo
	 */
	@ResponseBody
	@RequestMapping(value = "/refreshTreatmentOptions")
	public SubmitResultInfo refreshTreatmentOptions(String mpi, String jzxh) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String, Object> map = new HashMap<String,Object>();
		try {
			HspLqblInfCustom hspLqblInfCustom = zyyHspJzmzInfService.refreshTreatmentOptions(mpi,jzxh);
			map.put("hspLqblInfCustom", hspLqblInfCustom);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE,900, null);
			e.printStackTrace();
		}
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}


	/**
	 * @Description 更新门诊病历删除
	 * @author machaofan
	 * @date 2020年7月24日上午11:49:19
	 * @param lqblSeq
	 * @return
	 * @return SubmitResultInfo
	 */
	@ResponseBody
	@RequestMapping(value = "/delMzbl")
	public SubmitResultInfo delMzbl(String lqblSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		try {
			zyyHspJzmzInfService.delMzbl(lqblSeq);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE,900, null);
			e.printStackTrace();
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * @Description 查看患者是否挂号绑定、是否有留抢状态
	 * @author machaofan
	 * @date 2020年7月24日下午3:33:31
	 * @param mpi
	 * @param jzxh
	 * @return
	 * @return SubmitResultInfo
	 */
	@ResponseBody
	@RequestMapping(value = "/isRetention")
	public SubmitResultInfo isRetention(String mpi, String jzxh) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String, Object> map = new HashMap<String,Object>();
		try {
			map = zyyHspJzmzInfService.isRetention(mpi,jzxh);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE,900, null);
			e.printStackTrace();
		}
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
}
