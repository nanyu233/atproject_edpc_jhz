package activetech.zyyhospital.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import activetech.edpc.pojo.domain.HspTashInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.AjaxInfo;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.hospital.pojo.domain.HspGcsInf;
import activetech.hospital.pojo.domain.HspZjpfInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.domain.HspAdlInf;
import activetech.zyyhospital.pojo.domain.HspBradenInf;
import activetech.zyyhospital.pojo.domain.HspDdfxpgbInf;
import activetech.zyyhospital.pojo.domain.HspFallriskInf;
import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.domain.HspTiInf;
import activetech.zyyhospital.pojo.domain.HspZcddexpfInf;
import activetech.zyyhospital.pojo.domain.HspZyfxpfInf;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
import activetech.zyyhospital.pojo.dto.HspXtpgInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspZyfxpfInfCustom;
import activetech.zyyhospital.service.ScoreQueryService;
import activetech.zyyhospital.service.ZyyHspemginfService;

/**
 * 评分查询
 * 
 * @author chenkb
 * @date 2018年5月02日
 */
@Controller
@RequestMapping("/scorequery")
public class ScoreQueryAction {
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private ScoreQueryService scoreQueryService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;

	/**
	 * 跳转评分查询大页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tobasicPage")
	public String toRightPage(Model model,String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom=zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyyScoreQuery/basicPage";
	}

	/**
	 * 跳转Braden评分
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toBradenGde")
	public String toBradenGde(Model model,String emgSeq,String xtpgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("xtpgSeq", xtpgSeq);
		return "/hzszyyhospital/hzszyyScoreQuery/BradenGde";
	}

	/**
	 * 获取braden评分列表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryBraden_result")
	public @ResponseBody
	DataGridResultInfo queryBraden_result(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		hspXtpgInfQueryDto = hspXtpgInfQueryDto != null ? hspXtpgInfQueryDto: new HspXtpgInfQueryDto();
		int total = 0;
		List<HspBradenInf> list = scoreQueryService.queryBradenList(hspXtpgInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充total
		dataGridResultInfo.setTotal(total);
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;

	}
	
	/**
	 * 评分查询——获取braden信息
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findBradenScoreByXtpgSeq")
	public @ResponseBody HspBradenInf findBradenScoreByXtpgSeq(String xtpgSeq) throws Exception{
		return scoreQueryService.findBradenScoreByXtpgSeq(xtpgSeq);
	}
	
	/**
	 * 评分查询——新增braden评分
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addBradenScore")
	public @ResponseBody SubmitResultInfo addBradenScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.addBradenScore(hspXtpgInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 评分查询——删除braden评分
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delBradenScore")
	public @ResponseBody SubmitResultInfo delBradenScore(String xtpgSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.delBradenScore(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	//--------------------ADL评分------------------------------
	/**
	 * 跳转AdlGde评分
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toAdlGde")
	public String toAdlGde(Model model,String emgSeq,String xtpgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("xtpgSeq", xtpgSeq);
		return "/hzszyyhospital/hzszyyScoreQuery/AdlGde";
	}
	
	/**
	 * 获取Adl评分列表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryAdl_result")
	public @ResponseBody
	DataGridResultInfo queryAdl_result(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		hspXtpgInfQueryDto = hspXtpgInfQueryDto != null ? hspXtpgInfQueryDto: new HspXtpgInfQueryDto();
		int total = 0;
		List<HspAdlInf> list = scoreQueryService.queryAdlList(hspXtpgInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充total
		dataGridResultInfo.setTotal(total);
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;

	}
	
	/**
	 * 评分查询——获取Adl信息
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findAdlScoreByXtpgSeq")
	public @ResponseBody HspAdlInf findAdlScoreByXtpgSeq(String xtpgSeq) throws Exception{
		return scoreQueryService.findAdlScoreByXtpgSeq(xtpgSeq);
	}
	
	/**
	 * 评分查询——新增Adl评分
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addAdlScore")
	public @ResponseBody SubmitResultInfo addAdlScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.addAdlScore(hspXtpgInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 评分查询——删除Adl评分
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delAdlScore")
	public @ResponseBody SubmitResultInfo delAdlScore(String xtpgSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.delAdlScore(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	//--------------------坠床跌倒评分------------------------------
	/**
	 * 跳转FalloutbedGde跌倒评分
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toFalloutbedGde")
	public String toFalloutbedGde(Model model,String emgSeq,String xtpgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("xtpgSeq", xtpgSeq);
		return "/hzszyyhospital/hzszyyScoreQuery/FalloutbedGde";
	}
	
	/**
	 * 获取坠床跌倒评分列表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryFalloutbed_result")
	public @ResponseBody
	DataGridResultInfo queryFalloutbed_result(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		hspXtpgInfQueryDto = hspXtpgInfQueryDto != null ? hspXtpgInfQueryDto: new HspXtpgInfQueryDto();
		int total = 0;
		List<HspZcddexpfInf> list = scoreQueryService.queryZcddList(hspXtpgInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充total
		dataGridResultInfo.setTotal(total);
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;

	}
	
	/**
	 * 评分查询——获取坠床跌倒信息
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findFalloutbedScoreByXtpgSeq")
	public @ResponseBody HspZcddexpfInf findFalloutbedScoreByXtpgSeq(String xtpgSeq) throws Exception{
		return scoreQueryService.findZcddScoreByXtpgSeq(xtpgSeq);
	}
	
	/**
	 * 评分查询——新增坠床跌倒评分
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addFalloutbedScore")
	public @ResponseBody SubmitResultInfo addFalloutbedScore(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.addZcddScore(hspXtpgInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 评分查询——删除Falloutbed评分
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delFalloutbedScore")
	public @ResponseBody SubmitResultInfo delFalloutbedScore(String xtpgSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.delZcddScore(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	//---------------------------nrs评分-------------------------
	/**
	 * 跳转nrsGde疼痛评分
	 * @param model
	 * @param typeSource preCheck:预检 grade:评分查询 hlpgb:入院护理评估表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toNrsGde")
	public String toNrsGde(Model model,String emgSeq,String xtpgSeq, String typeSource) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("xtpgSeq", xtpgSeq);
		model.addAttribute("typeSource", typeSource);
		return "/hzszyyhospital/hzszyyScoreQuery/NrsGde";
	}
	
	/**
	 * 获取Nrs评分列表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryNrs_result")
	public @ResponseBody
	DataGridResultInfo queryNrs_result(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		hspXtpgInfQueryDto = hspXtpgInfQueryDto != null ? hspXtpgInfQueryDto: new HspXtpgInfQueryDto();
		int total = 0;
		List<HspNrsInf> list = scoreQueryService.queryNrsList(hspXtpgInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充total
		dataGridResultInfo.setTotal(total);
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;

	}
	
	/**
	 * 评分查询——获取Nrs信息
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findNrsScoreByXtpgSeq")
	public @ResponseBody HspNrsInf findNrsScoreByXtpgSeq(String xtpgSeq) throws Exception{
		return scoreQueryService.findNrsScoreByXtpgSeq(xtpgSeq);
	}
	
	/**
	 * 评分查询——新增Nrs评分
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addNrsScore")
	public @ResponseBody SubmitResultInfo addNrsScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.addNrsScore(hspXtpgInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 评分查询——删除Nrs评分
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delNrsScore")
	public @ResponseBody SubmitResultInfo delNrsScore(String xtpgSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.delNrsScore(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	@RequestMapping("/findScopeQueryList")
	public @ResponseBody
	SubmitResultInfo findXtpgList() throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,
				null);
		List<String> types = new ArrayList<String>(20);

		// Braden评分数据字典
		types.add("BRADEN_GJ_COD");
		types.add("BRADEN_CS_COD");
		types.add("BRADEN_HDNL_COD");
		types.add("BRADEN_YDNL_COD");
		types.add("BRADEN_YY_COD");
		types.add("BRADEN_MCHJQL_COD");
		// 疼痛评估数据字典
		types.add("NRS_TTBW");
		types.add("NRS_TTXZ");
		types.add("NRS_TTSJ");
		types.add("NRS_TTKZ");
		// Morse跌倒数据字典
		types.add("JSGYYWDD_COD");// 近3月有无跌倒
        types.add("DYYGJBPD_COD");// 多于一个疾病诊断
        types.add("XZFZ_COD");// 行走辅助
        types.add("JMZLSYDDGFXY_COD");// 静脉治疗/使用跌倒高风险药
        types.add("BT_COD");// 步态
        types.add("RZNL_COD");// 认知能力
		// GCS评估数据字典
        types.add("EYE_RCT_COD");//睁眼反应
        types.add("LAN_RCT_COD");//语言反应
        types.add("ACT_RCT_COD");//肢体运动
        
		List<Dstdictinfo> dstdictinfos = systemConfigService
				.findDstdictinfos(types);
		Map<String, Object> map = new HashMap<String, Object>(20);

		// Braden评分数据字典6
		List<Dstdictinfo> bradenGjCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> bradenCsCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> bradenHdnlCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> bradenYdnlCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> bradenYyCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> bradenMchjqlCodList = new ArrayList<Dstdictinfo>();
		// 疼痛评估数据字典4
		List<Dstdictinfo> nrsTtbwList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> nrsTtxzList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> nrsTtsjList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> nrsTtkzList = new ArrayList<Dstdictinfo>();
		// Morse跌倒数据字典6
		List<Dstdictinfo> jsgyywddCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> dyygjbpdCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> xzfzCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> jmzlsyddgfxyCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> btCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> rznlCodList = new ArrayList<Dstdictinfo>();
		// GCS评估数据字典3
		List<Dstdictinfo> eyeRctCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> lanRctCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> actRctCodList = new ArrayList<Dstdictinfo>();
		
		if (dstdictinfos != null && dstdictinfos.size() != 0) {
			for (Dstdictinfo dstdictinfo : dstdictinfos) {
				// Braden评分数据字典
				if ("BRADEN_GJ_COD".equals(dstdictinfo.getTypecode())) {
					bradenGjCodList.add(dstdictinfo);
				} else if ("BRADEN_CS_COD".equals(dstdictinfo.getTypecode())) {
					bradenCsCodList.add(dstdictinfo);
				} else if ("BRADEN_HDNL_COD".equals(dstdictinfo.getTypecode())) {
					bradenHdnlCodList.add(dstdictinfo);
				} else if ("BRADEN_YDNL_COD".equals(dstdictinfo.getTypecode())) {
					bradenYdnlCodList.add(dstdictinfo);
				} else if ("BRADEN_YY_COD".equals(dstdictinfo.getTypecode())) {
					bradenYyCodList.add(dstdictinfo);
				} else if ("BRADEN_MCHJQL_COD"
						.equals(dstdictinfo.getTypecode())) {
					bradenMchjqlCodList.add(dstdictinfo);
				}
				// 疼痛评估数据字典
				else if ("NRS_TTBW".equals(dstdictinfo.getTypecode())) {
					nrsTtbwList.add(dstdictinfo);
				} else if ("NRS_TTXZ".equals(dstdictinfo.getTypecode())) {
					nrsTtxzList.add(dstdictinfo);
				} else if ("NRS_TTSJ".equals(dstdictinfo.getTypecode())) {
					nrsTtsjList.add(dstdictinfo);
				} else if ("NRS_TTKZ".equals(dstdictinfo.getTypecode())) {
					nrsTtkzList.add(dstdictinfo);
				}
				// Morse跌倒数据字典
				else if ("JSGYYWDD_COD".equals(dstdictinfo.getTypecode())) {
					jsgyywddCodList.add(dstdictinfo);
				} else if ("DYYGJBPD_COD".equals(dstdictinfo.getTypecode())) {
					dyygjbpdCodList.add(dstdictinfo);
				} else if ("XZFZ_COD".equals(dstdictinfo.getTypecode())) {
					xzfzCodList.add(dstdictinfo);
				} else if ("JMZLSYDDGFXY_COD".equals(dstdictinfo.getTypecode())) {
					jmzlsyddgfxyCodList.add(dstdictinfo);
				} else if ("BT_COD".equals(dstdictinfo.getTypecode())) {
					btCodList.add(dstdictinfo);
				} else if ("RZNL_COD".equals(dstdictinfo.getTypecode())) {
					rznlCodList.add(dstdictinfo);
				}
				// GCS评估数据字典
				else if ("EYE_RCT_COD".equals(dstdictinfo.getTypecode())) {
					eyeRctCodList.add(dstdictinfo);
				} else if ("LAN_RCT_COD".equals(dstdictinfo.getTypecode())) {
					lanRctCodList.add(dstdictinfo);
				} else if ("ACT_RCT_COD".equals(dstdictinfo.getTypecode())) {
					actRctCodList.add(dstdictinfo);
				}
			}
		}
		// Braden评分数据字典6
		map.put("bradenGjCodList", bradenGjCodList);
		map.put("bradenCsCodList", bradenCsCodList);
		map.put("bradenHdnlCodList", bradenHdnlCodList);
		map.put("bradenYdnlCodList", bradenYdnlCodList);
		map.put("bradenYyCodList", bradenYyCodList);
		map.put("bradenMchjqlCodList", bradenMchjqlCodList);
		// 疼痛评估数据字典4
		map.put("nrsTtbwList", nrsTtbwList);
		map.put("nrsTtxzList", nrsTtxzList);
		map.put("nrsTtsjList", nrsTtsjList);
		map.put("nrsTtkzList", nrsTtkzList);
		// Morse跌倒数据字典6
		map.put("jsgyywddCodList", jsgyywddCodList);
		map.put("dyygjbpdCodList", dyygjbpdCodList);
		map.put("xzfzCodList", xzfzCodList);
		map.put("jmzlsyddgfxyCodList", jmzlsyddgfxyCodList);
		map.put("btCodList", btCodList);
		map.put("rznlCodList", rznlCodList);
		// GCS评估数据字典3
		map.put("eyeRctCodList", eyeRctCodList);
		map.put("lanRctCodList", lanRctCodList);
		map.put("actRctCodList", actRctCodList);
		
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	

	//--------------------Gcs评分量表------------------------------
	/**
	 * 跳转Gcs评分量表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toGcs")
	public String toGcs(Model model,String emgSeq,String gcsSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("gcsSeq", gcsSeq);
		return "/hzszyyhospital/hzszyyScoreQuery/GCSGde";
	}
	/**
	 * 获取GCS评分列表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryGcs_result")
	public @ResponseBody
	DataGridResultInfo queryGcs_result(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		hspXtpgInfQueryDto = hspXtpgInfQueryDto != null ? hspXtpgInfQueryDto: new HspXtpgInfQueryDto();
		int total = 0;
		List<HspGcsInf> list = scoreQueryService.queryGcsList(hspXtpgInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充total
		dataGridResultInfo.setTotal(total);
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;

	}
	/**
	 * 评分查询——获取Gcs信息
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findGcsScoreByXtpgSeq")
	public @ResponseBody HspGcsInf findGcsScoreByXtpgSeq(String emgSeq) throws Exception{
		return scoreQueryService.findGcsScoreByXtpgSeq(emgSeq);
	}
	/**
	 * 评分查询——新增Gcs评分量表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addGcsScore")
	public @ResponseBody SubmitResultInfo addGcsScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.addGcsScore(hspXtpgInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 评分查询——删除Gcs评分量表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delGcsScore")
	public @ResponseBody SubmitResultInfo delGcsScore(String emgSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.delGcsScore(emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	//--------------------镇静评分量表------------------------------
		/**
		 * 跳转镇静评分量表
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/toZjpf")
		public String toZjpf(Model model,String emgSeq,String zjpfSeq) throws Exception {
			model.addAttribute("emgSeq", emgSeq);
			model.addAttribute("zjpfSeq", zjpfSeq);
			return "/hzszyyhospital/hzszyyScoreQuery/Zjpf";
		}
		
		/**
		 * 获取Zjpf评分列表
		 * @param hspXtpgInfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryZjpf_result")
		public @ResponseBody
		DataGridResultInfo queryZjpf_result(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
			hspXtpgInfQueryDto = hspXtpgInfQueryDto != null ? hspXtpgInfQueryDto: new HspXtpgInfQueryDto();
			int total = 0;
			List<HspZjpfInf> list = scoreQueryService.queryZjpfList(hspXtpgInfQueryDto);
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			// 填充total
			dataGridResultInfo.setTotal(total);
			// 填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;

		}
		
		/**
		 * 评分查询——获取镇静评分信息
		 * @param hspXtpgInfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/findZjpfScoreByXtpgSeq")
		public @ResponseBody HspZjpfInf findZjpfScoreByXtpgSeq(String zjpfSeq) throws Exception{
			return scoreQueryService.findZjpfScoreByXtpgSeq(zjpfSeq);
		}
		
	/**
	 * 评分查询——新增镇静评分量表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addZjpfScore")
	public @ResponseBody SubmitResultInfo addZjpfScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.addZjpfScore(hspXtpgInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 评分查询——删除Zjpf评分量表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delZjpfScore")
	public @ResponseBody SubmitResultInfo delZjpfScore(String zjpfSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.delZjpfScore(zjpfSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	//------------------------跌倒风险----------------------
	/**
	 * 评分查询——获取跌倒信息
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findFallriskById")
	public @ResponseBody HspFallriskInf findFallriskById(String fallriskSeq) throws Exception{
		return scoreQueryService.findFallriskById(fallriskSeq);
	}
	
	/**
	 * 跳转跌倒危险评分成人（新）
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/queryAdultFallRisk")
	public String queryAdultFallRisk(Model model,String emgSeq,String fallriskSeq) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("fallriskSeq", fallriskSeq);
		return "/hzszyyhospital/hzszyyScoreQuery/FallAdultGde";
	}
	
	/**
	 * 跳转跌倒危险评分儿童（新）
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/queryChildFallRisk")
	public String queryChildFallRisk(Model model,String emgSeq,String fallriskSeq) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("fallriskSeq", fallriskSeq);
		return "/hzszyyhospital/hzszyyScoreQuery/FallChildGde";
	}
	/**
	 * 获取坠床跌倒评分列表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryFallRisk_result")
	public @ResponseBody
	DataGridResultInfo queryFallRisk_result(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		hspXtpgInfQueryDto = hspXtpgInfQueryDto != null ? hspXtpgInfQueryDto: new HspXtpgInfQueryDto();
		int total = 0;
		List<HspFallriskInf> list = scoreQueryService.findFallriskListByEmgSeq(hspXtpgInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充total
		dataGridResultInfo.setTotal(total);
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;

	}
	/**
	 * 评分查询——新增跌倒风险
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addFallRisk")
	public @ResponseBody SubmitResultInfo addFallRisk(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.addFallRisk(hspXtpgInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 评分查询——删除跌倒风险
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delFallRisk")
	public @ResponseBody SubmitResultInfo delFallRisk(String fallriskSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.delFallRisk(fallriskSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	//--------------------转运风险评分------------------------------
	
	/**
	 * 评分查询——获取转运风险评分
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findZyfxpfScoreByZyfxpfSeq")
	public @ResponseBody HspZyfxpfInf findZyfxpfScoreByZyfxpfSeq(String zyfxpfSeq) throws Exception{
		return scoreQueryService.findZyfxpfScoreByZyfxpfSeq(zyfxpfSeq);
	}

	/**
	 * 评分查询——跳转转运风险评分
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toZyfxpf")
	public String toZyfxpf(Model model,String emgSeq,String zyfxpfSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("zyfxpfSeq", zyfxpfSeq);
		return "/hzszyyhospital/hzszyyScoreQuery/Zyfxpf";
	}
	
	/**
	 * 评分查询——获取转运风险评分列表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryZyfxpf_result")
	public @ResponseBody
	DataGridResultInfo queryZyfxpf_result(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		hspXtpgInfQueryDto = hspXtpgInfQueryDto != null ? hspXtpgInfQueryDto: new HspXtpgInfQueryDto();
		int total = 0;
		List<HspZyfxpfInf> list = scoreQueryService.queryZyfxpfList(hspXtpgInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充total
		dataGridResultInfo.setTotal(total);
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;

	}
	
	/**
	 * 评分查询——新增转运风险评分
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addZyfxpfScore")
	public @ResponseBody SubmitResultInfo addZyfxpfScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.addZyfxpfScore(hspXtpgInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 评分查询——转运风险评分打印
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/printfxpfScore")
	public AjaxInfo printfxpfScore(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		Map<String,Object> allMap = new HashMap<String,Object>(); 
		//获取最近4条记录
		List<HspZyfxpfInfCustom> list = scoreQueryService.printfxpfScoreList(hspXtpgInfQueryDto);
		//获取预检信息
		HspemginfCustom hspemginfCustom=zyyHspemginfService.findHspemginfByemgSeq(hspXtpgInfQueryDto.getHspZyfxpfInfCustom().getEmgSeq());
		List<Map<String,Object>> allList = new ArrayList<Map<String,Object>>();
		if(list != null ) {
			if(list.size()>=5) {
				list = list.subList(0, 4);
			}
			String projectList [] = {"时间","生命体征","神志","瞳孔","静脉通道","各类导管","呼吸支持","出血部位固定","卧位","头部脊柱肢体保护","移动病人方式","病人安全","呼吸机","监护仪","评估结果","评估携带仪器及药物","评估者"};
			String accordance_one [] = {"","稳定","清醒","正常","无","无","无","无","自动体位","自动体位","指导协助下挪动","防护床栏","正常运转/无","正常运转/无","","",""};
			String accordance_two [] = {"","仪器或药物维持稳定","昏睡或谵妄","不等大或光反应消失","头皮针或浅静脉留置针1-2条","1-2条","通气导管或面罩给杨或人工气道内给氧","普通止血包扎","限制体位","绝对卧床限制活动","2人或2人以上搬动","床栏及四肢约束","1项指导异常报警","1项指导异常报警","","",""};
			String accordance_three [] = {"","高危状态","昏迷","散大","深静脉置管或静脉通道≥3条","≥3条","人工气道接呼吸机辅助呼吸","加压包扎指血或血带止血","强迫体位","上颈托或脊柱板","3人或3人以上平行同轴搬动","床栏及全身约束","2项指导异常报警","2项指导异常报警","","",""};
			String allScore[][] = new String[4][];
			//将查询到的数据放置二维数组中
			for (int hsp = 0;hsp<list.size();hsp++) {
				String score [] = new String[projectList.length];
				for(int pro = 0;pro<projectList.length;pro++) {
					//创建时间
					if(pro==0) {
						score[pro] = list.get(hsp).getCrttimeStr();
					//生命体征分值
					}else if(pro==1) {
						score[pro] = list.get(hsp).getSmtz().toString();
					//神志分值
					}else if(pro==2){
						score[pro] = list.get(hsp).getSz();
					//瞳孔分值
					}else if(pro==3) {
						score[pro] = list.get(hsp).getTk();
					//静脉通道分值
					}else if(pro==4) {
						score[pro] = list.get(hsp).getJmtd();
					//各类导管分值
					}else if(pro==5) {
						score[pro] = list.get(hsp).getGldg();
					//呼吸支持分值
					}else if(pro==6) {
						score[pro] = list.get(hsp).getHxzc();
					//出血部位固定分值
					}else if(pro==7) {
						score[pro] = list.get(hsp).getCxbwgd();
					//卧位分值
					}else if(pro==8) {
						score[pro] = list.get(hsp).getWw();
					//头部脊柱肢体保护分值
					}else if(pro==9) {
						score[pro] = list.get(hsp).getTbjzztbh();
					//移动病人方式分值
					}else if(pro==10) {
						score[pro] = list.get(hsp).getYdbrfs();
					//病人安全分值
					}else if(pro==11) {
						score[pro] = list.get(hsp).getBraq();
					//呼吸机分值
					}else if(pro==12) {
						score[pro] = list.get(hsp).getHxj();
					//监护仪分值
					}else if(pro==13) {
						score[pro] = list.get(hsp).getJhy();
					//评估结果
					}else if(pro==14) {
						score[pro] = list.get(hsp).getZyfxpfSco().toString();
					//评估携带仪器及药物
					}else if(pro==15) {
						String info = "";
						//如果携带仪器及药物不为空
						if(StringUtils.isNotNullAndEmptyByTrim(list.get(hsp).getXdyqjyw())) {
							String [] infocode = list.get(hsp).getXdyqjyw().split(",");
							for(int i=0;i<infocode.length;i++) {
								Dstdictinfo dictinfo= systemConfigService.findDictinfoByInfocode("XDYQJYW", infocode[i]);
								info += dictinfo.getInfo()+",";
							}
							//如果携带仪器及药物其他不为空
							if(StringUtils.isNotNullAndEmptyByTrim(list.get(hsp).getXdyqjywqt())) {
								info += list.get(hsp).getXdyqjywqt();
							}
						}else {
							info = list.get(hsp).getXdyqjywqt();
						}
						score[pro] = info;
					//评估者
					}else if(pro==16) {
						score[pro] = list.get(hsp).getUpdusrnme();
					}
				}
				allScore[hsp] = score;
			}
			//从数据数组、和二维数组中取出数据
			for(int i=0;i<projectList.length;i++) {
				Map<String,Object> map = new HashMap<String,Object>();
				for(int s=0;s<list.size();s++) {
					map.put("projectName",projectList[i]);
					if(i==0) {
						map.put("crttime"+s, allScore[s][i]);
					}else if(i==14) {
						map.put("zyfxpfSco"+s, allScore[s][i]);
					}else if(i==15) {
						map.put("xdyqjyw"+s, allScore[s][i]);
					}else if(i==16) {
						map.put("name"+s, allScore[s][i]);
					}else {
						map.put("accordance_one",accordance_one[i]);
						map.put("accordance_two",accordance_two[i]);
						map.put("accordance_three",accordance_three[i]);
						map.put("score"+s, allScore[s][i]);
					}
				}
				allList.add(map);
			}	
		}
		
		allMap.put("printFxpfScoreList", allList);
		allMap.put("emginf",hspemginfCustom);
		AjaxInfo ajaxInfo = new AjaxInfo();
		ajaxInfo.setState("200");
		ajaxInfo.setMsg(allMap);
		return ajaxInfo;
	}
	
	/**
	 * 评分查询——转运风险评分删除
	 * @param zyfxpfSeq
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/delZyfxpgScore")
	public @ResponseBody SubmitResultInfo delZyfxpgScore(String zyfxpfSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.delZyfxpfScore(zyfxpfSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	//--------------------Morse跌倒评分------------------------------
	/**
	 * 评分查询——跳转Morse跌倒评分
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toMorseGde")
	public String toMorseGde(Model model,String emgSeq,String ddfxpgbSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("ddfxpgbSeq", ddfxpgbSeq);
		return "/hzszyyhospital/hzszyyScoreQuery/MorseGde";
	}
	
	/**
	 * 评分查询——获取Morse跌倒评分列表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryMorse_result")
	public @ResponseBody
	DataGridResultInfo queryMorse_result(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		hspXtpgInfQueryDto = hspXtpgInfQueryDto != null ? hspXtpgInfQueryDto: new HspXtpgInfQueryDto();
		int total = 0;
		List<HspDdfxpgbInf> list = scoreQueryService.findMorseListByEmgSeq(hspXtpgInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充total
		dataGridResultInfo.setTotal(total);
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 评分查询——获取Morse跌倒评分信息
	 * @param ddfxpgbSeq Morse跌倒评分唯一约束
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findMorseByDdfxpgbSeq")
	public @ResponseBody HspDdfxpgbInf findMorseByDdfxpgbSeq(String ddfxpgbSeq) throws Exception{
		return scoreQueryService.findMorseByDdfxpgbSeq(ddfxpgbSeq);
	}
	
	/**
	 * 评分查询——新增Morse跌倒评分
	 * @param hspXtpgInfQueryDto,activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addMorseScore")
	public @ResponseBody SubmitResultInfo addMorseScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.addMorseScore(hspXtpgInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 评分查询——Morse跌倒评分删除
	 * @param ddfxpgbSeq Morse跌倒评分唯一约束
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/delMorseScore")
	public @ResponseBody SubmitResultInfo delMorseScore(String ddfxpgbSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.delMorseScore(ddfxpgbSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 评分查询——获取Ti信息
	 * @param xtpgSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findTiScoreByXtpgSeq")
	public @ResponseBody HspTiInf findTiScoreByXtpgSeq(String xtpgSeq) throws Exception{
		return scoreQueryService.findTiScoreByXtpgSeq(xtpgSeq);
	}

	/**
	 * 评分查询——新增Ti创伤指数评分
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addTiScore")
	public @ResponseBody SubmitResultInfo addTiScore(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.addTiScore(hspXtpgInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**评分查询-获取Tash信息*/
	@RequestMapping("/findTashScoreByTashSeq")
	public @ResponseBody HspTashInf findTashScoreByTashSeq(String tashSeq) throws Exception{
		return scoreQueryService.findTashScoreByTashSeq(tashSeq);
	}
	/**
	 * 评分查询——新增Tash创伤指数评分
	 */
	@RequestMapping("/addTashScore")
	public @ResponseBody SubmitResultInfo addTashScore(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		scoreQueryService.addTashScore(hspXtpgInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}


	
}
