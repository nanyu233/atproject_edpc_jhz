package activetech.edpc.action;

import java.util.Date;
import java.util.List;

import activetech.base.pojo.dto.PageQuery;
import activetech.edpc.pojo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.action.View;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.domain.HspCsampInf;
import activetech.edpc.pojo.domain.HspSbarInf;
import activetech.edpc.service.CsService;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.DateUtil;

@Controller
@RequestMapping("/cs")
public class CsAction {
	
	@Autowired
	private CsService csService;
	
	/**
	 * 跳转创伤中心患者列表
	 * @return
	 */
	@RequestMapping("/toCsListPage")
	public String toCsListPage(){
		return View.toEDPC("/cs/csList");
	}
	
	/**
	 * 跳转创伤中心患者列表(上报)
	 * @return
	 */
	@RequestMapping("/toCsSbListPage")
	public String toCsSbListPage(){
		return View.toEDPC("/cs/csSbList");
	}
	
	/**
	 * 跳转创伤中心患者详情(上报)
	 * @return
	 */
	@RequestMapping("/toCsSbDtlPage")
	public String toCsSbDtlPage(Model model,String emgSeq, String regSeq, ActiveUser activeUser){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("regSeq", regSeq);
		model.addAttribute("usrno", activeUser.getUsrno());
		model.addAttribute("usrname", activeUser.getUsrname());
		return View.toEDPC("/cs/csSbDtlPage");
	}
	
	
	/**
	 * 跳转创伤中心首页
	 * @return
	 */
	@RequestMapping("/toCsHomePage")
	public String toCsHomePage(Model model,String emgSeq, ActiveUser activeUser){
		
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("usrno", activeUser.getUsrno());
		model.addAttribute("usrname", activeUser.getUsrname());
		return View.toEDPC("/cs/csHome");
	}
	
	/**
	 * 跳转ISS/AIS评分
	 * @return
	 */
	@RequestMapping("/toAisIss")
	public String toAisIss(Model model,String emgSeq, String regSeq, ActiveUser activeUser){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("regSeq", regSeq);
		return View.toEDPC("/cs/AisIss");
	}


	/*跳转TASH评分**/
	@RequestMapping("/toTash")
	public String toTash(Model model,String emgSeq, ActiveUser activeUser){
		model.addAttribute("emgSeq", emgSeq);
		return View.toEDPC("/cs/Tash");
	}

	
	/**
	 * 跳转创伤时间轴页面
	 * @description TODO
	 * @return
	 */
	@RequestMapping("/toCsTimeline")
	public String toCzTimeline(String emgSeq, String regSeq, Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("regSeq", regSeq);
		return View.toEDPC("/cs/csTimeline");
	}
	
	/**
	 * 获取创伤患者列表
	 * @return
	 */
	@RequestMapping("/getCsPatientInfoList")
	@ResponseBody
	public DataGridResultInfo getCsPatientInfoList(QueryDto queryDto){

		int total = csService.getCsPatientInfoListCount(queryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, queryDto.getRows(), queryDto.getPage());
		queryDto.setPageQuery(pageQuery);
		List<HspDbzlBasCustom> list =csService.getCsPatientInfoListByPage(queryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/*public SubmitResultInfo getCsPatientInfoList(QueryDto queryDto){
		ResultInfo resultInfo = csService.getCsPatientInfoList(queryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}*/
	
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/getHspBodyPartsDef")
	@ResponseBody
	public SubmitResultInfo getHspBodyPartsDef(){
		
		ResultInfo resultInfo = csService.getHspBodyPartsDef();
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	@RequestMapping("/getCsABCDEdefList")
	@ResponseBody
	public SubmitResultInfo getCsABCDEdefList(){
		ResultInfo resultInfo = csService.getCsABCDEdefList();
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	@RequestMapping("/getCsABCDEinfList")
	@ResponseBody
	public SubmitResultInfo getCsABCDEinfList(@RequestBody HspCsabcInfQueryDto hspCsabcInfQueryDto){
		ResultInfo resultInfo = csService.getCsABCDEinfList(hspCsabcInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * abcde 新增
	 * @description TODO
	 * @return
	 */
	@RequestMapping("/mergeCsABCDEinfSubmit")
	@ResponseBody
	public SubmitResultInfo mergeCsABCDEinfSubmit(@RequestBody HspCsabcInfQueryDto hspCsabcInfQueryDto,ActiveUser activeUser){
		ResultInfo resultInfo = csService.mergeCsABCDEinf(hspCsabcInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * ample 获取
	 * @description TODO
	 * @return
	 */
	@RequestMapping("/getAmpleSubmit")
	@ResponseBody
	public SubmitResultInfo getAmpleSubmit(@RequestBody HspCsampInf hspCsampInf){
		ResultInfo resultInfo = csService.getAmpleSubmit(hspCsampInf);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * ample 提交
	 * @description TODO
	 * @return
	 */
	@RequestMapping("/mergeAmpleSubmit")
	@ResponseBody
	public SubmitResultInfo mergeAmpleSubmit(@RequestBody HspCsampInf hspCsampInf,ActiveUser activeUser){
		hspCsampInf.setUsrNo(activeUser.getUsrno());
		ResultInfo resultInfo = csService.mergeAmpleSubmit(hspCsampInf);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 体格检查渲染表单查询
	 * @description TODO
	 * @return
	 */
	@RequestMapping("/getHspCsoaeDefList")
	@ResponseBody
	public SubmitResultInfo getHspCsoaeDefList(){
		ResultInfo resultInfo = csService.getHspCsoaeDefList();
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 体格检查 保存提交
	 * @description TODO
	 * @return
	 */
	@RequestMapping("/mergeHspCsoaeInf")
	@ResponseBody
	public SubmitResultInfo mergeHspCsoaeInf(@RequestBody HspCsoaeInfQueryDto hspCsoaeInfQueryDto,ActiveUser activeUser){
		ResultInfo resultInfo = csService.mergeHspCsoaeInf(hspCsoaeInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 体格检查 保存提交
	 * @description TODO
	 * @return
	 */
	@RequestMapping("/getHspCsoaeInfList")
	@ResponseBody
	public SubmitResultInfo getHspCsoaeInfList(@RequestBody HspCsoaeInfQueryDto hspCsoaeInfQueryDto){
		ResultInfo resultInfo = csService.getHspCsoaeInfList(hspCsoaeInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 全面的体格检查渲染表单查询
	 * @description TODO
	 * @return
	 */
	@RequestMapping("/getHspCscpnDefList")
	@ResponseBody
	public SubmitResultInfo getHspCscpnDefList(){
		ResultInfo resultInfo = csService.getHspCscpnDefList();
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 全面的体格检查保存提交
	 * @description TODO
	 * @param hspCsoaeInfQueryDto
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/mergeHspCscpnInf")
	@ResponseBody
	public SubmitResultInfo mergeHspCscpnInf(@RequestBody HspCscpnInfQueryDto hspCscpnInfQueryDto,ActiveUser activeUser){
		ResultInfo resultInfo = csService.mergeHspCscpnInf(hspCscpnInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 全面的体格检查查询
	 * @description TODO
	 * @param hspCsoaeInfQueryDto
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/getHspCscpnInfList")
	@ResponseBody
	public SubmitResultInfo getHspCscpnInfList(@RequestBody HspCscpnInfQueryDto hspCscpnInfQueryDto){
		ResultInfo resultInfo = csService.getHspCscpnInfList(hspCscpnInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * sbar交接班保存
	 * @description TODO
	 * @param hspCsoaeInfQueryDto
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/mergeHspSbarInf")
	@ResponseBody
	public SubmitResultInfo mergeHspSbarInf(@RequestBody HspSbarInf hspSbarInf ,ActiveUser activeUser){
		ResultInfo resultInfo = csService.mergeHspSbarInf(hspSbarInf,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取sbar交接班
	 * @description TODO
	 * @param hspCsoaeInfQueryDto
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/getHspSbarInfByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getHspSbarInfByEmgSeq(@RequestBody HspSbarInf hspSbarInf){
		ResultInfo resultInfo = csService.getHspSbarInfByEmgSeq(hspSbarInf);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取《浙江医院创伤诊疗流程核查表》定义列表
	 * @return
	 */
	@RequestMapping("/getCsmicDefList.do")
	@ResponseBody
	public SubmitResultInfo getCsmicDefList(){
		ResultInfo resultInfo = csService.getCsmicDefList();
		return ResultUtil.createSubmitResult(resultInfo);
	}	
	
	/**
	 * 获取创伤详情数据（上报）
	 * @param hspemginfCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getCsinf")
	@ResponseBody
	public SubmitResultInfo getCsinf(@RequestBody HspDbzlBasCustom hspDbzlBasCustom,
			ActiveUser activeUser) throws Exception{
		
		ResultInfo resultInfo = csService.getCsinf(hspDbzlBasCustom,activeUser);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	@RequestMapping("/getCsPatientList")
	@ResponseBody
	public DataGridResultInfo getCsPatientList(HspZlInfQueryDto hspZlInfQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			){
		DataGridResultInfo dataGridResultInfo = csService.getCsPatientList(hspZlInfQueryDto,page,rows);
		return dataGridResultInfo;		
	}
	
	/**
	 * 获取创伤详情数据（上报）
	 * @param hspemginfCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryCsTimeline")
	@ResponseBody
	public SubmitResultInfo queryCzTimeline(@RequestParam(required=true)String regSeq){
		ResultInfo resultInfo = csService.getCsTimeline(regSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 创伤数据提交
	 * @param hspZlInfQueryDto
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/submitCsInf")
	@ResponseBody
	public SubmitResultInfo submitCsInf(@RequestBody HspZlInfQueryDto hspZlInfQueryDto,ActiveUser activeUser){
		ResultInfo resultInfo = csService.submitCsInf(hspZlInfQueryDto.getZlInfList(),hspZlInfQueryDto.getEmgSeq(),activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取iss ais 评分项
	 * @description TODO
	 * @return
	 */
	@RequestMapping("/getHspCsfDef")
	@ResponseBody
	public SubmitResultInfo getHspCsfDef(@RequestBody HspEmgInf hspEmgInf){
		
		ResultInfo resultInfo = csService.getHspCsfDef(hspEmgInf.getEmgSeq());
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@RequestMapping("/addHspCspfDtl")
	@ResponseBody
	public SubmitResultInfo addHspCspfDtl(@RequestBody HspCspfDtlQueryDto hspCspfDtlQueryDto,
			ActiveUser activeUser){
		
		ResultInfo resultInfo = csService.addHspCspfDtl(hspCspfDtlQueryDto,activeUser);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 创伤登记页面基本信息提交
	 * @param hspDbzlBasQueryDto
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/csPatietBasicInfSubmit")
	@ResponseBody
	public SubmitResultInfo csPatietBasicInfSubmit(@RequestBody HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser){
		ResultInfo resultInfo = csService.csPatietBasicInfSubmit(hspDbzlBasQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
