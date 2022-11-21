package activetech.edpc.action;

import activetech.base.action.View;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.domain.HspBase64Pic;
import activetech.edpc.pojo.dto.HspCzzlInfQueryDto;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import activetech.edpc.pojo.dto.QueryDto;
import activetech.edpc.service.CzService;
import activetech.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cz")
public class CzAction {
	
	@Autowired
	private CzService czService;
	
	/**
	 * 跳转卒中中心首页
	 * @return
	 */
	@RequestMapping("/toCzHomePage")
	public String toCzHomePage(){
		return View.toEDPC("/cz/czHome");
	}
	
	/**
	 * 跳转卒中中心首页
	 * @return
	 */
	@RequestMapping("/toCzListPage")
	public String toCzListPage(Model model){
		Date date = new Date();
		int year = DateUtil.getYear(date);
		int month = DateUtil.getMonth(date);
		int today = DateUtil.getDay(date);
		String startdate = year + "/" + (month>9? month:"0"+month) + "/01";
		String enddate = year + "/" + (month>9? month:"0"+month) + "/" + (today>9? today:"0"+today);
		model.addAttribute("startdate", startdate);
		model.addAttribute("enddate", enddate);
		return View.toEDPC("/cz/czList");
	}

	/**
	 *
	 * @param emgSeq
	 * @param model
	 * @return
	 */
	@RequestMapping("/toCzxqPage")
	public String toXtxqPage(String emgSeq, String wayTyp, String regSeq, Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		model.addAttribute("regSeq", regSeq);
		return View.toEDPC("/cz/czxq");
	}

	/**
	 * 打印卒中核查表
	 * @return
	 */
	@RequestMapping("/toCzHcbPage")
	public String toCzHcbPage(Model model){
		Date date = new Date();
		int year = DateUtil.getYear(date);
		int month = DateUtil.getMonth(date);
		int today = DateUtil.getDay(date);
		String startdate = year + "/" + (month>9? month:"0"+month) + "/01";
		String enddate = year + "/" + (month>9? month:"0"+month) + "/" + (today>9? today:"0"+today);
		model.addAttribute("startdate", startdate);
		model.addAttribute("enddate", enddate);
		return View.toEDPC("/cz/czhcb");
	}
	
	/**
	 * 跳转卒中登记本页面
	 * @description TODO
	 * @return
	 */
	@RequestMapping("/toCzReportHelper")
	public String toCzdjbPage(String emgSeq,Model model){
		model.addAttribute("emgSeq", emgSeq);
		return View.toEDPC("/cz/czReportHelper");
	}
	
	/**
	 * 跳转卒中登记本页面
	 * @description TODO
	 * @return
	 */
	@RequestMapping("/toCzTimeline")
	public String toCzTimeline(String emgSeq, String regSeq, Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("regSeq", regSeq);
		return View.toEDPC("/cz/czTimeline");
	}
	
	
	/**
	 * 根据病案号获取该卒中患者的信息
	 * @return
	 */
	@RequestMapping("/getCzInfoByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getCzInfoByEmgSeq(@RequestBody(required=false) Map<String,Object> map){
		ResultInfo resultInfo = null;
		String emgSeq = "";
		if(map!=null){
			emgSeq = (String) map.get("emgSeq");
			resultInfo = czService.getCzInfoByEmgSeq(emgSeq);
		}else{
			resultInfo = ResultUtil.createWarning(Config.MESSAGE, 901, null);
		}
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 根据病案号和流程节点编号获取节点信息
	 * @param map
	 * @return
	 */
	@RequestMapping("/getNodeInfoByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getNodeInfoByEmgSeq(@RequestBody(required=false) Map<String,Object> map){
		String emgSeq = "";
		String nodeId= "";
		if(map!=null){
			emgSeq = (String) map.get("emgSeq");
			nodeId = (String) map.get("nodeId");
		}
		ResultInfo resultInfo = czService.getCzNodeInfoByEmgSeq(emgSeq,nodeId);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 获取卒中患者列表
	 * @return
	 */
	@RequestMapping("/getCzPatientInfoList")
	@ResponseBody
	public DataGridResultInfo getCzPatientListInfo(QueryDto queryDto){

		int total = czService.getCzPatientInfoListCount(queryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, queryDto.getRows(), queryDto.getPage());
		queryDto.setPageQuery(pageQuery);
		List<HspDbzlBasCustom> list =czService.getCzPatientInfoListByPage(queryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/*public SubmitResultInfo getCzPatientListInfo(QueryDto queryDto){
		ResultInfo resultInfo = czService.getCzPatientInfoList(queryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}*/
	
	/**
	 * 保存卒中患者的分诊和护理记录单溶栓时候的页面截图base64编码数据
	 * @return
	 */
	@RequestMapping("/saveBase64pic")
	@ResponseBody
	public SubmitResultInfo saveBase64pic(@RequestBody HspBase64Pic hspBase64Pic){
		ResultInfo resultInfo = czService.saveBase64pic(hspBase64Pic);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 获取卒中患者的分诊和护理记录单溶栓时候的页面截图base64编码数据
	 * @return
	 * TODO 废弃 HSP_BASE64_PIC 不存在 相关service 可删除
	 */
	@RequestMapping("/getBase64pic")
	@ResponseBody
	public SubmitResultInfo getBase64pic(@RequestBody HspBase64Pic hspBase64Pic){
		ResultInfo resultInfo = czService.getBase64pic(hspBase64Pic);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 保存卒中患者的分诊和护理记录单溶栓时候的页面截图base64编码数据
	 * @return
	 */
	@RequestMapping("/getCzReportHelperData")
	@ResponseBody
	public SubmitResultInfo getCzReportHelperData(@RequestBody HspDbzlBasQueryDto hspDbzlBasQueryDto){
		ResultInfo resultInfo = czService.getCzReportHelperData(hspDbzlBasQueryDto.getEmgSeq());
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取卒中患者列表
	 * @return
	 */
	@RequestMapping("/getCzPatientList")
	@ResponseBody
	public DataGridResultInfo getCzPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto,
											   int page,//当前页码
											   int rows//每页显示个数
	){
		Date enddate = DateUtil.getDateAdd(hspDbzlBasQueryDto.getEndDate(), 24);
		hspDbzlBasQueryDto.setEndDate(enddate);
		DataGridResultInfo dataGridResultInfo = czService.getCzPatientList(hspDbzlBasQueryDto,page,rows);
		return dataGridResultInfo;
	}
	
	/**
	 * 获取卒中核查表信息
	 * @return
	 */
	@RequestMapping("/getCzhcbInfoByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getCzhcbInfo(@RequestBody(required=false) Map<String,Object> map){
		String emgSeq = "";
		if(map!=null){
			emgSeq = (String) map.get("emgSeq");
		}
		ResultInfo resultInfo = czService.getCzhcbInfoByEmgSeq(emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取卒中患者详情
	 * @return
	 */
	@RequestMapping("/getCzInfo")
	@ResponseBody
	public SubmitResultInfo getCzInfo(@RequestBody(required=false) Map<String,Object> map){
		String emgSeq = "";
		if(map!=null){
			emgSeq = (String) map.get("emgSeq");
		}
		ResultInfo resultInfo = czService.getCzPatientDetail(emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 胸痛登记页面基本信息提交
	 * @param hspDbzlBasQueryDto
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/czPatietBasicInfSubmit")
	@ResponseBody
	public SubmitResultInfo xtPatietBasicInfSubmit(@RequestBody HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser){
		ResultInfo resultInfo = czService.czPatietBasicInfSubmit(hspDbzlBasQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 卒中患者信息保存
	 * @param hspCzzlInfQueryDto
	 * @return
	 */
	@RequestMapping("/submitCzInfo")
	@ResponseBody
	public SubmitResultInfo submitCzInfo(@RequestBody HspCzzlInfQueryDto hspCzzlInfQueryDto,ActiveUser activeUser){
		ResultInfo resultInfo = czService.czPatientSubmit(
				hspCzzlInfQueryDto.getCzzlInfList(),hspCzzlInfQueryDto.getEmgSeq(),activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取卒中急救时间轴数据
	 * @return
	 */
	@RequestMapping("/queryCzTimeline")
	@ResponseBody
	public SubmitResultInfo queryCzTimeline(@RequestParam(required=true)String emgSeq){
		ResultInfo resultInfo = czService.getCzTimeline(emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 获取卒中急救时间轴数据2
	 * @return
	 */
	@RequestMapping("/queryCzTimelineother")
	@ResponseBody
	public SubmitResultInfo queryCzTimeline(@RequestBody Map<String,Object> params){
		String emgSeq = params.get("emgSeq").toString();
		ResultInfo resultInfo = czService.getCzTimeline(emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 获取卒中患者主表hsp_dbzl_bas信息数据
	 * @param map
	 * @return
	 */
	@RequestMapping("/getCzPatientBasicInfo")
	@ResponseBody
	public SubmitResultInfo getCzPatientDetail(@RequestBody(required=false) Map<String,Object> map){
		String regSeq = "";
		if(map.containsKey("regSeq")){
			regSeq = (String) map.get("regSeq");
		}

		ResultInfo resultInfo = czService.getCzPatientBasicInfo(regSeq);

		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取卒中患者院前信息数据
	 * TODO 表已废弃
	 * @param map
	 * @return
	 */
	@RequestMapping("/getAidPatientByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getAidPatientByEmgSeq(@RequestBody(required=false) Map<String,Object> map){
		
		String emgSeq = "";
		if(map.containsKey("emgSeq")){
			emgSeq = (String) map.get("emgSeq");
		}
		
		ResultInfo resultInfo = czService.getAidPatientByEmgSeq(emgSeq);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取检验检查信息
	 * @param map
	 * @return
	 */
	@RequestMapping("/getCzJyjcInfo")
	@ResponseBody
	public SubmitResultInfo getCzJyjcInfo(@RequestBody(required=false) Map<String, Object> map){
		
		String emgSeq = "";
		if(map.containsKey("emgSeq")){
			emgSeq = (String) map.get("emgSeq");
		}
		
		ResultInfo resultInfo = czService.getCzJyjcInfo(emgSeq);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 *跳转新增院内/绕行发病患者页面
	 * @return
	 */
	@RequestMapping("/toadd")
	public String toadd(String emgSeq,String wayTyp,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		return View.toEDPC("/cz/addNewPatient");
	}

	/**
	 * 查询新增院内发病患者
	 */
	@RequestMapping("/judgeNewPatient")
	@ResponseBody
	public SubmitResultInfo judgeNewPatient(String emgSeq){

		ResultInfo resultInfo = czService.judgeNewPatient(emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 新增院内发病患者
	 */
	@RequestMapping("/addNewPatient")
	@ResponseBody
	public SubmitResultInfo addNewPatient(HspDbzlBasQueryDto hspDbzlBasQueryDto,ActiveUser activeUser){

		ResultInfo resultInfo = czService.addNewPatient(hspDbzlBasQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
