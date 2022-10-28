package activetech.edpc.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import activetech.aid.pojo.dto.AidEptGrpCustom;
import activetech.aid.service.OndutyService;
import activetech.edpc.pojo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.action.View;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.domain.HspFuvDocInf;
import activetech.edpc.pojo.domain.HspFuvGrpInf;
import activetech.edpc.service.FollowUpService;
import activetech.util.StringUtils;


@Controller
@RequestMapping("/followup")
public class FollowUpAction {

	@Autowired
	private FollowUpService followUpService;
	@Autowired
	private OndutyService ondutyService;
	
	/**************************hspFuvPat 随访患者**************************************/
	
	/**
	 * 跳转胸痛随访信息管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryfuvXt")
	public String queryksjhXt(Model model, String moduleid,String patTyp) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("patTyp", patTyp);
		return View.toEDPC("/followup/queryfuvXt");
	}
	/**
	 * 跳转卒中随访信息管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryfuvCz")
	public String queryksjhCz(Model model, String moduleid,String patTyp) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("patTyp", patTyp);
		return View.toEDPC("/followup/queryfuvCz");
	}
	/**
	 * 跳转创伤随访信息管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryfuvCs")
	public String queryksjhCs(Model model, String moduleid,String patTyp) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("patTyp", patTyp);
		return View.toEDPC("/followup/queryfuvCs");
	}
	/**
	 * 添加跳转胸痛随访信息管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addfuvXt")
	public String queryaddXt(Model model,String moduleid,String patTyp) throws Exception{
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("patTyp", patTyp);
		return View.toEDPC("/followup/addfuvXt");
	}
	/**
	 * 添加跳转卒中随访信息管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addfuvCz")
	public String queryaddCz(Model model,String moduleid,String patTyp) throws Exception{
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("patTyp", patTyp);
		return View.toEDPC("/followup/addfuvCz");
	}
	/**
	 * 添加跳转创伤随访信息管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addfuvCs")
	public String queryaddCs(Model model,String moduleid,String patTyp) throws Exception{
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("patTyp", patTyp);
		return View.toEDPC("/followup/addfuvCs");
	}
	
	/**
	 * 跳转随访患者详情界面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tofuvpat")
	public String toupat(Model model,HspFuvPatQueryDto hspFuvPatQueryDto) throws Exception{
		HspFuvPatCustom hspFuvPatCustom = followUpService.selectOneByCondition(hspFuvPatQueryDto);
		model.addAttribute("hspFuvPatCustom", hspFuvPatCustom);
		return View.toEDPC("/followup/editfuv");
	}
	
	@RequestMapping("/querypat_result")
	@ResponseBody
	public DataGridResultInfo querypat_result(HspPatInfQueryDto hspPatInfQueryDto
			,int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = followUpService.queryCountfuvResult(hspPatInfQueryDto);		
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspPatInfQueryDto.setPageQuery(pageQuery);
		List<HspPatInfCustom> hspPatInfCustomList = followUpService.queryfuvResult(hspPatInfQueryDto);
		//填充rows
		dataGridResultInfo.setRows(hspPatInfCustomList);
		//填充total
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}

	@RequestMapping("/querypat_resultByType")
	@ResponseBody
	public DataGridResultInfo querypat_resultByType(String patTyp) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = followUpService.queryCountfuvResult(patTyp);
//		PageQuery pageQuery = new PageQuery();
//		pageQuery.setPageParams(total, rows, page);
//		.setPageQuery(pageQuery);
		List<HspDbzlBasCustom> hspPatInfCustomList = followUpService.selectHspDbzlBasPatient(patTyp);
		//填充rows
		dataGridResultInfo.setRows(hspPatInfCustomList);
		//填充total
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	
	@RequestMapping("/submitFuvPat")
	@ResponseBody
	public SubmitResultInfo submitFuvPat(HspFuvPatQueryDto hspFuvPatQueryDto, ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		followUpService.submitFuvPat(hspFuvPatQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转患者随访信息管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editfuv")
	public String queryedit(Model model,String moduleid,String patId) throws Exception{
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("patId", patId);
		return View.toEDPC("/followup/editfuv");
	}
	
	/**
	 * 患者信息列表加载
	 * @param hspPatInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryfuv_resultXt")
	@ResponseBody
	public DataGridResultInfo queryfuv_resultXt(HspFuvPatQueryDto hspFuvPatQueryDto
			,int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = followUpService.queryCountfuvResult(hspFuvPatQueryDto);		
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspFuvPatQueryDto.setPageQuery(pageQuery);
		List<HspFuvPatCustom> hspPatInfCustomList = followUpService.queryfuvResultXt(hspFuvPatQueryDto);
		//填充rows
		dataGridResultInfo.setRows(hspPatInfCustomList);	
		//填充total
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	/**
	 * 卒中患者信息列表加载
	 * @param hspPatInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryfuv_resultCz")
	@ResponseBody
	public DataGridResultInfo queryfuv_resultCz(HspFuvPatQueryDto hspFuvPatQueryDto
			,int page,//当前页码
											  int rows//每页显示个数
	) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = followUpService.queryCountfuvResult(hspFuvPatQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspFuvPatQueryDto.setPageQuery(pageQuery);
		List<HspFuvPatCustom> hspPatInfCustomList = followUpService.queryfuvResultCz(hspFuvPatQueryDto);
		//填充rows
		dataGridResultInfo.setRows(hspPatInfCustomList);
		//填充total
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	/**
	 * 创伤患者信息列表加载
	 * @param hspPatInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryfuv_resultCs")
	@ResponseBody
	public DataGridResultInfo queryfuv_resultCs(HspFuvPatQueryDto hspFuvPatQueryDto
			,int page,//当前页码
											  int rows//每页显示个数
	) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = followUpService.queryCountfuvResult(hspFuvPatQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspFuvPatQueryDto.setPageQuery(pageQuery);
		List<HspFuvPatCustom> hspPatInfCustomList = followUpService.queryfuvResultCs(hspFuvPatQueryDto);
		//填充rows
		dataGridResultInfo.setRows(hspPatInfCustomList);
		//填充total
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}

	/**************************hspfuvpln 随访计划**************************************/
	 
	/**
	 * 跳转患者随访计划
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryfuvpln")
	public String queryfuvpln(Model model, String moduleid) throws Exception {
		model.addAttribute("moduleid", moduleid);
		return View.toEDPC("/followup/queryfuvpln");
	}
	
	/**
	 * 跳转创建计划
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addfuvpln")
	public String addfuvpln(Model model, String moduleid,HspFuvPatQueryDto hspFuvPatQueryDto) throws Exception {
		model.addAttribute("moduleid", moduleid);
		HspFuvPatCustom hspFuvPatCustom = followUpService.selectOneByCondition(hspFuvPatQueryDto);
		model.addAttribute("hspFuvPatCustom", hspFuvPatCustom);
		return View.toEDPC("/followup/addfuvpln");
	}
	
	/**
	 * 随访计划新增
	 * @param hspFuvInfCustom
	 * @return
	 */
	@RequestMapping("/fuvplnsubmit")
	@ResponseBody
	public SubmitResultInfo fuvplnSubmit(HspFuvPlnQueryDto hspFuvPlnQueryDto,ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		followUpService.submitFuvPln(hspFuvPlnQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转随访计划详情界面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tofuvpln")
	public String toupdate(Model model,HspFuvPlnQueryDto hspFuvPlnQueryDto) throws Exception{		
		HspFuvPlnCustom hspFuvPlnCustom = followUpService.selectPlnOneByCondition(hspFuvPlnQueryDto);		
		model.addAttribute("hspFuvPlnCustom", hspFuvPlnCustom);
		return View.toEDPC("/followup/editfuvpln");
	}	
	
	/**
	 * 删除随访计划
	 * @param plnSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deleteplnSeq")
	@ResponseBody
	public SubmitResultInfo delFuvpln(String plnSeq) throws Exception {
		ResultInfo resultInfo = followUpService.deletefuvpln(plnSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 随访计划列表加载
	 * @param hspPatInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryfuvpln_result")
	@ResponseBody
	public DataGridResultInfo queryfuvpln_result(HspFuvPlnQueryDto hspFuvPlnQueryDto
			,int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = followUpService.queryCountfuvplnResult(hspFuvPlnQueryDto);		
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspFuvPlnQueryDto.setPageQuery(pageQuery);
		List<HspFuvPlnCustom> hspPatInfCustomList = followUpService.queryfuvplnResult(hspFuvPlnQueryDto);
		//填充rows
		dataGridResultInfo.setRows(hspPatInfCustomList);	
		//填充total
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	
	/**************************hspfuvinf 随访记录**************************************/
	
	/**
	 * 随访记录列表加载
	 * @param hspPatInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryfuvinf_result")
	@ResponseBody
	public DataGridResultInfo queryfuvinf_result(HspFuvInfQueryDto hspFuvInfQueryDto
			,int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = followUpService.queryCountfuvInfResult(hspFuvInfQueryDto);		
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspFuvInfQueryDto.setPageQuery(pageQuery);
		List<HspFuvInfCustom> hspPatInfCustomList = followUpService.queryfuvInfResult(hspFuvInfQueryDto);
		//填充rows
		dataGridResultInfo.setRows(hspPatInfCustomList);	
		//填充total
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转随访记录列表
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryfuvinf")
	public String queryfuvInf(Model model, String moduleid) throws Exception {
		model.addAttribute("moduleid", moduleid);
		return View.toEDPC("/followup/queryfuvinf");
	}
	
	@RequestMapping("/tofuvadd")
	public String toFuvAdd(String patId, String plnSeq,String fuvSeq,String showSaveButton,Model model){
		model.addAttribute("patId",patId);
		model.addAttribute("plnSeq",plnSeq);
		model.addAttribute("fuvSeq",fuvSeq);
		model.addAttribute("showSaveButton",showSaveButton);
		return View.toEDPC("/followup/fuvadd");
	}
	
	
	@RequestMapping("/fuvsubmit")
	@ResponseBody
	public SubmitResultInfo fuvSubmit(HspFuvInfQueryDto hspFuvInfQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		followUpService.submitFuv(hspFuvInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@RequestMapping("/getFuv")
	@ResponseBody
	public SubmitResultInfo getFuv(HspFuvInfQueryDto hspFuvInfQueryDto,HspFuvPatQueryDto hspFuvPatQueryDto) throws Exception {				
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String, Object> map = new HashMap<String, Object>(70);
		
		HspFuvPatCustom hspFuvPatCustom = followUpService.selectOneByCondition(hspFuvPatQueryDto);
		map.put("hspFuvPatCustom", hspFuvPatCustom);
		HspFuvInfCustom hspFuvInfCustom = followUpService.selectInfOneByCondition(hspFuvInfQueryDto);
		map.put("hspFuvInfCustom", hspFuvInfCustom);
		Map<String, Object> mapList = new HashMap<String, Object>(70);
//		List<HspFuvDocInf> hspFuvDocInfs = followUpService.queryFuvDoc(hspFuvInfQueryDto);
		List<AidEptGrpCustom> list = ondutyService.getExpertGroupList();
//		List<HspFuvGrpInf> hspFuvGrpInfs = followUpService.queryFuvGrp(hspFuvInfQueryDto);
//		mapList.put("fuvDocArr", hspFuvDocInfs);
//		mapList.put("nxtFuvDocArr", hspFuvDocInfs);
//		mapList.put("fuvGrpArr", hspFuvGrpInfs);
//		mapList.put("nxtFuvGrpArr", hspFuvGrpInfs);
		mapList.put("fuvDocArr", list);
		mapList.put("nxtFuvDocArr", list);
		mapList.put("fuvGrpArr", list);
		mapList.put("nxtFuvGrpArr", list);
		map.put("mapList", mapList);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}	
	
	@RequestMapping("/checkUnFinishPln")
	 public @ResponseBody SubmitResultInfo checkPlnForFuvInf(HspFuvPlnQueryDto hspFuvPlnQueryDto,ActiveUser activeuser) throws Exception{
		 ResultInfo resultInfo=ResultUtil.createSuccess(Config.MESSAGE,906,null);
		 Integer result = followUpService.checkUnFinishPln(hspFuvPlnQueryDto);
		 resultInfo.setMessage(result.toString());
		 return ResultUtil.createSubmitResult(resultInfo);
	 }
	
}
