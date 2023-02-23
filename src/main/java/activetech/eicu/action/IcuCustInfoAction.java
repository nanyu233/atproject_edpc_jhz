package activetech.eicu.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import activetech.eicu.pojo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.eicu.service.IcuCustInfoService;
import activetech.eicu.service.IcuScoreService;
import activetech.external.pojo.dto.HspJyjgCustom;
import activetech.external.pojo.dto.HspJyjgQueryDto;
import activetech.external.service.HspJyjgService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspObsvtfstInfCustom;
import activetech.zyyhospital.service.HspHljldInfService;
import activetech.zyyhospital.service.ZyyHspemginfService;

import javax.servlet.http.HttpSession;

/**
 * ICU患者管理
 * <p>Title: IcuCustInfoAction.java IcuCustInfoAction</p>
 * <p>Description: </p>
 * <p>Company: activetech</p>
 * @author 
 * @date 2019年2月21日 上午9:27:52
 *
 */
@Controller
@RequestMapping("/icucust")
public class IcuCustInfoAction {

	@Autowired
	private IcuCustInfoService icuCustInfoService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private IcuScoreService icuScoreService;			
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
//	@Autowired
//	private ZyyLqblService zyyLqblService;
	@Autowired
	private HspHljldInfService hspHljldInfService;
	@Autowired
	private HspJyjgService hspJyjgService;
			
	/**
	 * ICU获取相关公共参数
	 * ①评分风险度列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryIcuBasicDef")
	@SuppressWarnings("rawtypes")
	public @ResponseBody SubmitResultInfo queryIcuBasicDef(String liveNo) throws Exception{
		/*//返回对象
		Map<String, Object> result = new HashMap<String, Object>();
		//获取评分风险度列表
		Map<String, List<IcuGradeRiskCustom>> riskMap = icuScoreService.queryGradeRisk(null);
		result.put("riskMap", riskMap);
		List riskColorList = systemConfigService.findDictinfoByType("RISK_COLOR");
		result.put("riskColorList", riskColorList);
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		resultInfo.setSysdata(result);
		return ResultUtil.createSubmitResult(resultInfo);*/

		//返回对象
		Map<String, Object> result = new HashMap<String, Object>();
		//获取评分风险度列表
		Map<String, IcuGradeRiskCustom> riskMap = icuScoreService.queryGradeRisk(null);
		result.put("riskMap", riskMap);


		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		resultInfo.setSysdata(result);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转全览图主页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/toOverview")
	public String toOverview(String liveNo,String cstNam,Model model) throws Exception{
		model.addAttribute("liveNo", liveNo);
		model.addAttribute("cstNam", cstNam);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(liveNo);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/eicu/icucust/overview";
	}
	
	/**
	 * 获取患者主页面相关数据
	 * @param icuCustInfoCustom
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getOverviewInfo")
	public @ResponseBody SubmitResultInfo getOverviewInfo(@RequestBody IcuCustInfoQueryDto icuCustInfoQueryDto) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> map = icuCustInfoService.getOverviewInfo(icuCustInfoQueryDto);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转生命体征分析页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toVitlChart")
	public String toVitlChart(String liveNo,Model model) throws Exception {
		model.addAttribute("liveNo", liveNo);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(liveNo);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/eicu/icuVsIo/vitlChart";
	}
	
	/**
	 * 体征分析获取数据
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryVitlChartInfo")
	public @ResponseBody SubmitResultInfo queryVitlChartInfo(@RequestBody IcuVitlIoQueryDto icuVitlIoQueryDto) throws Exception{
		ResultInfo result = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		//需要多一天的数据
		icuVitlIoQueryDto.setEndDate(DateUtil.getNextDay(icuVitlIoQueryDto.getEndDate()));
		Map<String, Object> map = icuCustInfoService.queryVitlChartInfo(icuVitlIoQueryDto);
		result.setSysdata(map);
		return ResultUtil.createSubmitResult(result);
	}
	
	/**
	 * 跳转出入量分析页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toIoChart")
	public String toIoChart(String liveNo,Model model) throws Exception {
		model.addAttribute("liveNo", liveNo);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(liveNo);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/eicu/icuVsIo/ioChart";
	}
	
	/**
	 * 出入量分析获取数据
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryIoChartInfo")
	public @ResponseBody SubmitResultInfo queryIoChartInfo(@RequestBody IcuVitlIoQueryDto icuVitlIoQueryDto) throws Exception{
		ResultInfo result = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		//需要多一天的数据
		icuVitlIoQueryDto.setEndDate(DateUtil.getNextDay(icuVitlIoQueryDto.getEndDate()));
		List<HspHljldInfCustom> ioList = icuCustInfoService.queryIoChartInfo(icuVitlIoQueryDto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ioList",ioList);
		result.setSysdata(map);
		return ResultUtil.createSubmitResult(result);
	}
	
	/**
	 * 跳转评分总览页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toTotalScoChart")
	public String toTotalScoChart(String liveNo,Model model) throws Exception {
		model.addAttribute("liveNo", liveNo);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(liveNo);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/eicu/icuScore/totalScoChart";
	}
	
	/**
	 * 评分总览获取数据
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryTotalScoChartInfo")
	public @ResponseBody SubmitResultInfo queryTotalScoChartInfo(@RequestBody IcuVitlIoQueryDto icuVitlIoQueryDto) throws Exception{
		ResultInfo result = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		IcuScoreQueryDto icuScoreQueryDto = new IcuScoreQueryDto();
		icuScoreQueryDto.setStartDate(icuVitlIoQueryDto.getStartDate());
		//需要多一天的数据
		icuScoreQueryDto.setEndDate(DateUtil.getNextDay(icuVitlIoQueryDto.getEndDate()));
		icuScoreQueryDto.setLiveNo(icuVitlIoQueryDto.getLiveNo());
		Map<String, Object> map = icuCustInfoService.queryTotalScoChartInfo(icuScoreQueryDto);
		result.setSysdata(map);
		return ResultUtil.createSubmitResult(result);
	}
	
	/**
	 * 跳转留抢病历护理记录列表
	 *@param model
	 *@return
	 *@throws Exception
	 */
//	@RequestMapping("/icuquerynote")
//	public String lqblquerynote(Model model,String emgSeq,String moduleid,String enterSource) throws Exception{
//		model.addAttribute("emgSeq", emgSeq);
//		model.addAttribute("enterSource", enterSource);
//		model.addAttribute("moduleid", moduleid);
//		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
//		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
//		model.addAttribute("cstNam", hspemginfCustom.getCstNam());
//		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
//		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
//		return "/eicu/icucust/icuquerynote";
//	}
	
	/**
	 * 跳转护理记录单结果集
	 *@param hspHljldQueryDto
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月25日 下午6:47:26
	 */
	@RequestMapping("/query_icu_hljld_result")
	public @ResponseBody DataGridResultInfo query_icu_hljld_result(HspHljldInfQueryDto hspHljldInfQueryDto,
		int page,int rows) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		hspHljldInfQueryDto = hspHljldInfQueryDto!=null?hspHljldInfQueryDto:new HspHljldInfQueryDto();
		//时间加一天
		if(StringUtils.isNotNullAndEmptyByTrim(hspHljldInfQueryDto.getEnddate())){
		  hspHljldInfQueryDto.setEnddate(DateUtil.getNextDay(hspHljldInfQueryDto.getEnddate()));
		}
		//查询列表的总数
		int total = hspHljldInfService.findIcuHljldCount(hspHljldInfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspHljldInfQueryDto.setPageQuery(pageQuery);
		List<HspHljldInfCustom> list=hspHljldInfService.getIcuHljldListByemgseq(hspHljldInfQueryDto);
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
	
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转医嘱信息
	 * @param model 
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("/toquerycfxx")
//	public String toquerycfxx(Model model,String moduleid,String emgSeq) throws Exception {
//		model.addAttribute("emgSeq", emgSeq);
//		model.addAttribute("moduleid", moduleid);
//		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
//		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
//		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
//		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
//		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
//		model.addAttribute("hspemginfCustom", hspemginfCustom);
//		return "/eicu/icucust/queryyzxx";
//	}
	
	/**
	 * 跳转检验信息
	 * @param model 
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("/qjscaseexamine")
//	public String qjscaseexamine(Model model,String moduleid,String emgSeq) throws Exception {
//		model.addAttribute("emgSeq", emgSeq);
//		model.addAttribute("moduleid", moduleid);
//		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
//		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
//		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
//		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
//		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
//		model.addAttribute("hspemginfCustom", hspemginfCustom);
//		return "/eicu/icucust/qjscaseexamine";
//	}
	
	/**
	 * 检验信息结果集
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryexamine_result")
	public @ResponseBody DataGridResultInfo queryexamine_result(Model mode, HspJyjgQueryDto hspJyjgQueryDto, String sort, String order ) throws Exception{
		//首次查询时默认赋值系统当天日期
		if(hspJyjgQueryDto.getHspJyjgCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspJyjgQueryDto.getHspJyjgCustom().getEnddate());
			hspJyjgQueryDto.getHspJyjgCustom().setEnddate(endDate);
		}
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspJyjgQueryDto.setSort("resultDateTime");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspJyjgQueryDto.setOrder("asc");
		}
		
		int total =hspJyjgService.findhspjyjgcount(hspJyjgQueryDto);	
		List<HspJyjgCustom> list = hspJyjgService.findhspjyjgList(hspJyjgQueryDto);
	
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 检验信息详细结果集
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryexamineinfo_result")
	public @ResponseBody DataGridResultInfo queryexamineinfo_result(Model mode, HspJyjgQueryDto hspJyjgQueryDto,
							int page,//当前页码
							int rows//每页显示个数
		) throws Exception{
		//首次查询时默认赋值系统当天日期
		if(hspJyjgQueryDto.getHspJyjgCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspJyjgQueryDto.getHspJyjgCustom().getEnddate());
			hspJyjgQueryDto.getHspJyjgCustom().setEnddate(endDate);
		}
		int total =hspJyjgService.findhspjyjginfocount(hspJyjgQueryDto);	
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspJyjgQueryDto.setPageQuery(pageQuery);
		List<HspJyjgCustom> list =hspJyjgService.findhspjyjginfoList(hspJyjgQueryDto);
	
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 收藏检验信息
	 * @param model
	 * @param HspJyjgQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updateHspJyjgByMerge")
	public @ResponseBody SubmitResultInfo updateHspJyjgByMerge(Model mode,@RequestBody HspJyjgQueryDto hspJyjgQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspJyjgService.updateHspJyjgBySelective(hspJyjgQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * ajax获取检验信息打印
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/ajaxexamine")
	public @ResponseBody SubmitResultInfo ajaxexamine(HspJyjgQueryDto hspJyjgQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		List<HspJyjgCustom> list =hspJyjgService.findhspjyjginfoListajax(hspJyjgQueryDto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		//map.put("total", list.size());
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 跳转患者信息页面
	 *
	 * @param model     model
	 * @param pagetype  pagetype
	 * @param pageval   pageval
	 * @param moduleid  moduleid
	 * @param bgTimeStr bgTimeStr
	 * @return return
	 */
	@RequestMapping("/toCustInfo")
	public String toCustInfo(Model model, HttpSession session, String pagetype, String pageval, String moduleid,
							 String bgTimeStr,String liveNo) throws Exception {
		String sessionId = session.getId();
		model.addAttribute("sessionId", sessionId);
		String ippost = systemConfigService.findAppoptionByOptkey("IPPOST").getOptvalue();
		model.addAttribute("ippost", ippost);
		model.addAttribute("bgTimeStr", bgTimeStr);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("pagetype", pagetype);
		model.addAttribute("pageval", pageval);
		model.addAttribute("liveNo", liveNo);

		return "/eicu/icucust/custInfo";
	}
}
