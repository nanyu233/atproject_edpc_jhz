package activetech.eicu.action;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.eicu.pojo.domain.Dstparameter;
import activetech.eicu.pojo.dto.IcuGradeRiskCustom;
import activetech.eicu.pojo.dto.IcuGradeTotalCustom;
import activetech.eicu.pojo.dto.IcuMenuDefCustom;
import activetech.eicu.pojo.dto.IcuScoreQueryDto;
import activetech.eicu.service.DstparameterService;
import activetech.eicu.service.IcuScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ICU评分查询
 * <p>Title: IcuscoreAction.java IcuscoreAction</p>
 * <p>Description: </p>
 * <p>Company: activetech</p>
 * @author 
 * @date 2019年2月21日 下午4:35:26
 *
 */
@Controller
@RequestMapping("/icuscore")
public class IcuScoreAction {
	
	@Autowired
	public IcuScoreService icuScoreService;
	@Autowired
	private DstparameterService dstparameterService;
	@Autowired
	private SystemConfigService systemConfigService;
	
	/**
	 * 根据gradeType 跳转评分子页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toScoSubPage")
	public String toScoSubPage(Model model,String liveNo,String gradeType,String gradeSeq) throws Exception {
		model.addAttribute("liveNo", liveNo);
		model.addAttribute("gradeType", gradeType);
		model.addAttribute("gradeSeq", gradeSeq);
		return "/eicu/icuScore/";
	}
	
	/**
	 * 跳转统一评分子页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toBasicScoPage")
	public String toBasicScoPage(Model model,String gradeType,String gradeSeq, String liveNo) throws Exception {
		model.addAttribute("gradeType", gradeType);
		model.addAttribute("gradeSeq", gradeSeq);
		model.addAttribute("liveNo", liveNo);
		return "/eicu/icuScore/basicScoPage";
	}
	
	
	/**
	 * 获取评分列表
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryGrade_result")
	public @ResponseBody DataGridResultInfo queryGrade_result(IcuScoreQueryDto icuScoreQueryDto) throws Exception{
		icuScoreQueryDto = icuScoreQueryDto != null ? icuScoreQueryDto: new IcuScoreQueryDto();
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<IcuGradeTotalCustom> list = icuScoreService.queryGradeList(icuScoreQueryDto);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	/**
	 * 获取评分对应的信息
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findGradeInfoByParam")
	public @ResponseBody SubmitResultInfo findGradeInfoByParam(IcuScoreQueryDto icuScoreQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = icuScoreService.findGradeInfo(icuScoreQueryDto);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 评分修改提交
	 * @param icuScoreQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editGradeSco")
	public @ResponseBody SubmitResultInfo editGradeSco(@RequestBody IcuScoreQueryDto icuScoreQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		String gradeSeq = icuScoreService.editGradSco(icuScoreQueryDto,activeUser);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("gradeSeq", gradeSeq);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 评分修改提交
	 * @param icuScoreQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editGradeScoWithOth")
	public @ResponseBody SubmitResultInfo editGradeScoWithOth(@RequestBody IcuScoreQueryDto icuScoreQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		IcuGradeTotalCustom gradeTotalCustom = icuScoreService.editGradeScoWithOth(icuScoreQueryDto,activeUser);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("gradeTotalCustom", gradeTotalCustom);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除评分
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delGradeScore")
	public @ResponseBody SubmitResultInfo delGradeScore(IcuScoreQueryDto icuScoreQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		icuScoreService.delGradeScore(icuScoreQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取最近6次或根据时间获取评分数据(时间不存在则获取最近6次数据)
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryScoreInfo")
	public @ResponseBody SubmitResultInfo queryScoreInfo(@RequestBody IcuScoreQueryDto icuScoreQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = icuScoreService.queryScoreInfo(icuScoreQueryDto);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 跳转Apache2诊断类型权重页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toDiagTypePage")
	public String toApacheDtwPage(Model model) throws Exception{
		return "/eicu/icuScore/diagType";
	}
	
	/**
	 * 跳转显示最近6次评分公共页面
	 * @param model
	 * @param liveNo
	 * @param gradeType
	 * @return
	 * @throws Exception
	 */
	//前端 liveNo 删掉
	@RequestMapping("/toNewBasicPage")
	public String toNewBasePage(Model model,String gradeType) throws Exception {
		model.addAttribute("gradeType", gradeType);
		return "/eicu/icuScore/newBasicPage";
	}
	/**
	 * 跳转显示最近6次评分公共页面
	 * @param model model
	 * @param gradeType gradeType
	 * @return return
	 */
	@RequestMapping("/toBasicPage")
	public String toNewBasePage(Model model,String gradeType, String liveNo) {
		model.addAttribute("gradeType", gradeType);
		model.addAttribute("liveNo", liveNo);
		return "/eicu/icuScore/basicPage";
	}
	/**
	 * 跳转6次评分子页面
	 * @param model
	 * @param liveNo
	 * @param gradeType
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toNewSubPage")
	public String toNewSubPage(Model model,String liveNo,String gradeType) throws Exception {
		model.addAttribute("liveNo", liveNo);
		model.addAttribute("gradeType", gradeType);
		return "/eicu/icuScore/basicSub";
	}
	
	/**
	 * 获取评分项目定义表
	 * @param gradeType
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getGradeItemDef")
	public @ResponseBody SubmitResultInfo getGradeItemDef(@RequestParam(value="gradeType") String gradeType) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> map = icuScoreService.getGradeItemDef(gradeType);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
//	/**
//	 * 跳转评分护理单页面
//	 * @param model
//	 * @param liveNo
//	 * @param gardeType
//	 * @return
//	 * @throws Exception
//	 */
//	@RequestMapping("/toBasicSheet")
//	public String toBasicSheet(Model model, String liveNo,String gradeType) throws Exception{
//		model.addAttribute("liveNo", liveNo);
//		model.addAttribute("gradeType", gradeType);
//		return "/eicu/icuScore/basicSheet";
//	}
//	
	/**
	 * 获取9种评分最新的评分情况
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryTotalScoByMenu")
	public @ResponseBody SubmitResultInfo queryTotalScoByMenu(@RequestBody IcuScoreQueryDto icuScoreQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 920, null);
		//获取9种评分最近一条数据
		 Map<String, Object> map = icuScoreService.queryTotalScoByMenu(icuScoreQueryDto,activeUser);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转9种评分最新情况页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toTotalScoPage")
	public String toTotalScoPage(Model model,String liveNo,String gradeType,String yAxis) throws Exception{
		model.addAttribute("gradeType", gradeType);
		model.addAttribute("liveNo", liveNo);
		model.addAttribute("yAxis", yAxis);
		return "/eicu/icuScore/totalScoPage";
	}
	
	/**
	 * 跳转告知书页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toBasicDocPage")
	public String toBasicDocPage(Model model,String gradeType,String gradeSeq) throws Exception{	
		model.addAttribute("gradeType", gradeType);
		model.addAttribute("gradeSeq", gradeSeq);
		return "/eicu/icuScore/basicDocPage";
	}
	
	/**
	 * 获取文书相关下拉列表
	 * @param parCode
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryDocTypeList")
	public @ResponseBody SubmitResultInfo queryDocTypeList(@RequestParam(value="gradeType")String parCode) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> map = new HashMap<String, Object>();
		List<Dstparameter> docList = dstparameterService.getParamByTypeAndCode("BASIC_DOC", parCode, "parvalue1");
		map.put("docList", docList);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * ICU获取相关公共参数
	 * ①评分风险度列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryIcuBasicDef")
	@SuppressWarnings("rawtypes")
	public @ResponseBody SubmitResultInfo queryIcuBasicDef(String liveNo) throws Exception{
		//返回对象
		Map<String, Object> result = new HashMap<String, Object>();
		//获取评分风险度列表
		Map<String, List<IcuGradeRiskCustom>> riskMap = icuScoreService.queryGradeRisk(null);
		result.put("riskMap", riskMap);
		List riskColorList = systemConfigService.findDictinfoByType("RISK_COLOR");
		result.put("riskColorList", riskColorList);
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		resultInfo.setSysdata(result);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取Icu患者功能菜单
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findIcuCustMenu")
	public @ResponseBody SubmitResultInfo findIcuCustMenu(@RequestParam("moduleid") String moduleId) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		//获取ICU功能菜单
		List<IcuMenuDefCustom> menuList = icuScoreService.findIcuCustMenu(moduleId);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("menuList",menuList);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 跳转统一评分子页面
	 * @param model model
	 * @param gradeType gradeType
	 * @param gradeSeq gradeSeq
	 * @return return
	 */
	@RequestMapping("/toEditSco")
	public String toEditSco(Model model,String gradeType,String gradeSeq,String liveNo) {
		model.addAttribute("gradeType", gradeType);
		model.addAttribute("gradeSeq", gradeSeq);
		model.addAttribute("liveNo",liveNo);
		return "/eicu/icuScore/editSco";
	}
}
