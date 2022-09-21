package activetech.zyyhospital.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbQueryDto;
import activetech.zyyhospital.pojo.dto.HspJzcsjlbInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspJzcspgInfQueryDto;
import activetech.zyyhospital.service.HspHlpgbService;
import activetech.zyyhospital.service.HspJzcsjlbInfService;
import activetech.zyyhospital.service.HspJzcspgInfService;

/**
 * 
 * <p>Title:BlbcAction</p>
 * <p>Description:护理评估表</p>
 * <p>activetech</p>
 * @date 2017年7月26日
 */

@Controller
@RequestMapping("/hlpgb")
public class HlpgbAction {
	@Autowired
	private HspHlpgbService hspHlpgbService;
	@Autowired
	private HspJzcspgInfService hspJzcspgInfService;
	@Autowired
	private HspJzcsjlbInfService hspJzcsjlbInfService;
	
	/**
	 * 入院护理评估表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryhlpgb")
	public String queryhlpgb(Model model, String emgSeq) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		return "/hospital/hlpgb/queryhlpgb";
	}
	
	/**
	 * 急诊创伤入院评估表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjzcsrypgb")
	public String queryjzcsrypgb(Model model, String emgSeq) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/hzszyynurse/hlpgb/queryjzcs";
	}
	
	/**
	 * 急诊创伤记录表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjzcsjlb")
	public String queryjzcsjlb(Model model, String emgSeq) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/hzszyynurse/traumaRecord/traumaRecord";
	}

	/**
	 * 入院护理评估表结果集
	 * @param pysm
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryhlpgb_result")
	public @ResponseBody Map<String, Object> queryhlpgb_result(String emgSeq) throws Exception{

		HspHlpgbQueryDto hspHlpgbQueryDto=hspHlpgbService.getHlpgbByEmgSeq(emgSeq);
		Map<String, Object> map = new HashMap<String, Object>();
		String symSitDes=hspHlpgbQueryDto.getHspemginfCustom().getSymSitDes();
		int zsFlag=0;
		if(StringUtils.isNotNullAndEmptyByTrim(symSitDes)){
			zsFlag=1;
		}
		map.put("zsFlag", zsFlag);
		map.put("hspemginfCustom", hspHlpgbQueryDto.getHspemginfCustom());
		map.put("hspHlpgbCustom", hspHlpgbQueryDto.getHspHlpgbCustom());
		map.put("hspsqlinfCustom", hspHlpgbQueryDto.getHspsqlinfCustom());
		return map;
	}
	
	/**
	 * 急诊创伤入院评估表结果集
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjzcsrypgb_result")
	public @ResponseBody Map<String, Object> queryjzcsrypgb_result(String emgSeq
			) throws Exception{
		HspJzcspgInfQueryDto hspJzcspgInfQueryDto = hspJzcspgInfService.getJzcsrypgbByEmgSeq(emgSeq);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hspemginfCustom", hspJzcspgInfQueryDto.getHspemginfCustom());
		map.put("hspJzcspgInfCustom", hspJzcspgInfQueryDto.getHspJzcspgInfCustom());
		map.put("hspsqlinfCustom", hspJzcspgInfQueryDto.getHspsqlinfCustom());
		return map;
	}
	
	/**
	 * 急诊创伤记录表结果集
	 * @param jzcsId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjzcsjlb_result")
	public @ResponseBody Map<String, Object> queryjzcsjlb_result(String emgSeq
			) throws Exception{
		HspJzcsjlbInfQueryDto hspJzcsjlbInfQueryDto = hspJzcsjlbInfService.getJzcsjlbByJzcsId(emgSeq);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hspemginfCustom", hspJzcsjlbInfQueryDto.getHspemginfCustom());
		map.put("hspJzcsjlbInfCustom", hspJzcsjlbInfQueryDto.getHspJzcsjlbInfCustom());
		map.put("hspJjchqkInfList", hspJzcsjlbInfQueryDto.getHspJjchqkInfList());
		map.put("hspJzpsInfList", hspJzcsjlbInfQueryDto.getHspJzpsInfList());
		return map;
	}
	
	/**
	 * 入院护理评估表braden评分提交
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitBradenScore")
	public @ResponseBody SubmitResultInfo addBradenScore(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String xtpgSeq=hspHlpgbService.submitBradenScore(hspHlpgbQueryDto,activeUser);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 创伤入院评估表braden评分提交
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitBradenScoreCS")
	public @ResponseBody SubmitResultInfo addBradenScoreCS(HspJzcspgInfQueryDto hspJzcspgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String xtpgSeq = hspJzcspgInfService.submitBradenScore(hspJzcspgInfQueryDto,activeUser);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 入院护理评估表adl评分提交
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitAdlScore")
	public @ResponseBody SubmitResultInfo addAdlScore(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String xtpgSeq=hspHlpgbService.submitAdlScore(hspHlpgbQueryDto,activeUser);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 创伤入院评估表adl评分提交
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitAdlScoreCS")
	public @ResponseBody SubmitResultInfo addAdlScoreCS(HspJzcspgInfQueryDto hspJzcspgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String xtpgSeq = hspJzcspgInfService.submitAdlScore(hspJzcspgInfQueryDto,activeUser);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 入院护理评估表坠床跌倒评分提交
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitFallDScore")
	public @ResponseBody SubmitResultInfo addFallDScore(HspHlpgbQueryDto hspHlpgbQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String xtpgSeq=hspHlpgbService.submitFallDScore(hspHlpgbQueryDto);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 入院护理评估表跌倒风险提交
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitFallRisk")
	public @ResponseBody SubmitResultInfo addFallRisk(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String xtpgSeq=hspHlpgbService.submitFallRisk(hspHlpgbQueryDto,activeUser);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 入院护理评估表提交
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updateHlpgb")
	public @ResponseBody SubmitResultInfo updateHlpgb(HspHlpgbQueryDto hspHlpgbQueryDto,
			ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		hspHlpgbService.updateHlpgb(hspHlpgbQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 急诊创伤入院评估表提交
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updateJzcsrypgb")
	public @ResponseBody SubmitResultInfo updateJzcsrypgb(HspJzcspgInfQueryDto hspJzcspgInfQueryDto,
			ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		hspJzcspgInfService.updateJzcsrypgb(hspJzcspgInfQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 急诊创伤记录表提交
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updateJzcsjlb")
	public @ResponseBody SubmitResultInfo updateJzcsjlb(@RequestBody HspJzcsjlbInfQueryDto hspJzcsjlbInfQueryDto,
			ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		hspJzcsjlbInfService.updateJzcsjlb(hspJzcsjlbInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 入院跳转braden评分
	 *@param model
	 *@return
	 *@throws Exception
	 *@author yhl @date 2018/9/19
	 */
	@RequestMapping("/toBradenSco")
	public String bradenSco(Model model,String typeSource) throws Exception{
		model.addAttribute("typeSource", typeSource);
		return "/hzszyyhospital/hzszyynurse/hlpgb/scoreBox/bradenSco";
	}
	/**
	 * 入院跳转坠床跌倒评分
	 *@param model
	 *@return
	 *@throws Exception
	 *@author yhl @date 2018/9/19
	 */
	@RequestMapping("/toFallOutBedSco")
	public String fallOutBedSco(Model model) throws Exception{
		return "/hzszyyhospital/hzszyynurse/hlpgb/scoreBox/FalloutbedGde";
	}
	/**
	 * 入院跳转adl评分
	 *@param model
	 *@return
	 *@throws Exception
	 *@author yhl @date 2018/9/19
	 */
	@RequestMapping("/toAdlSco")
	public String adlSco(Model model,String typeSource) throws Exception{
		model.addAttribute("typeSource", typeSource);
		return "/hzszyyhospital/hzszyynurse/hlpgb/scoreBox/adlSco";
	}
	
	/**
	 * 入院跳转跌倒危险评分成人（新）
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/queryfallOutBedSco")
	public String queryfallOutBedSco(Model model) throws Exception{
		return "/hzszyyhospital/hzszyynurse/hlpgb/scoreBox/fallOutBedSco";
	}
	
	/**
	 * 入院跳转跌倒危险评分儿童（新）
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/queryfallOutChild")
	public String queryfallOutChild(Model model) throws Exception{
		return "/hzszyyhospital/hzszyynurse/hlpgb/scoreBox/fallOutChild";
	}
	
	/**
	 * 入院跳转转运风险评分表
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toZyfxpfSco")
	public String toZyfxpf(Model model,String typeSource) throws Exception{
		model.addAttribute("typeSource", typeSource);
		return "/hzszyyhospital/hzszyynurse/hlpgb/scoreBox/zyfxpfSco";
	}
	
	/**
	 * 入院转运风险评分表提交
	 * @param hspHlpgbQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitZyfxpfSco")
	public @ResponseBody SubmitResultInfo addZyfxpfSco(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String zyfxpfSeq=hspHlpgbService.submitZyfxpfScore(hspHlpgbQueryDto,activeUser);
		resultInfo.setMessage(zyfxpfSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 创伤入院评估表转运风险评分提交
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitZyfxpfScoCS")
	public @ResponseBody SubmitResultInfo addZyfxpfScoCS(HspJzcspgInfQueryDto hspJzcspgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String xtpgSeq = hspJzcspgInfService.submitZyfxpfScore(hspJzcspgInfQueryDto,activeUser);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 入院跳转GCS评分表
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toGcsSco")
	public String toGcsSco(Model model,String typeSource) throws Exception{
		model.addAttribute("typeSource", typeSource);
		return "/hzszyyhospital/hzszyynurse/hlpgb/scoreBox/GCSSco";
	}
	
	/**
	 * 入院GCS评分表提交
	 * @param hspHlpgbQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitGcsSco")
	public @ResponseBody SubmitResultInfo addGcsSco(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String gcsSeq = hspHlpgbService.submitGcsSco(hspHlpgbQueryDto,activeUser);
		resultInfo.setMessage(gcsSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 创伤入院评估表GCS评分表提交
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitGcsScoCS")
	public @ResponseBody SubmitResultInfo addGcsScoCS(HspJzcspgInfQueryDto hspJzcspgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String xtpgSeq = hspJzcspgInfService.submitGcsSco(hspJzcspgInfQueryDto,activeUser);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 入院护理评估表疼痛评分提交
	 * @param hspHlpgbQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitNrsScore")
	public @ResponseBody SubmitResultInfo addNrscore(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String xtpgSeq=hspHlpgbService.submitNrsScore(hspHlpgbQueryDto,activeUser);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 创伤入院评估表疼痛评分提交
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitNrsScoreCS")
	public @ResponseBody SubmitResultInfo addNrscoreCS(HspJzcspgInfQueryDto hspJzcspgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String xtpgSeq = hspJzcspgInfService.submitNrsScore(hspJzcspgInfQueryDto,activeUser);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 入院护理评估表Morse评分提交
	 * @param hspHlpgbQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitMorseScore")
	public @ResponseBody SubmitResultInfo addMorseScore(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		String xtpgSeq = hspHlpgbService.addMorseScore(hspHlpgbQueryDto,activeUser);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 创伤入院评估表Morse评分提交
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitMorseScoreCS")
	public @ResponseBody SubmitResultInfo addMorseScoreCS(HspJzcspgInfQueryDto hspJzcspgInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String xtpgSeq = hspJzcspgInfService.addMorseScore(hspJzcspgInfQueryDto,activeUser);
		resultInfo.setMessage(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 入院跳转疾病史查询弹窗
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toJbsQueryPage")
	public String toJbsQueryPage(Model model) throws Exception{
		return "/hzszyyhospital/hzszyynurse/hlpgb/popBox/jbsContent";
	}
	
	
	
	/**
	 * 跳转生命体征导入页面
	 * @param model
	 * @param cstNam
	 * @param typeSource 判断跳的哪一个页面
	 * @return
	 */
	@RequestMapping(value = "/to_vitalSigns")
	public String to_vitalSigns(Model model, String cstNam, String typeSource) {
		model.addAttribute("cstNam",cstNam);
		model.addAttribute("typeSource",typeSource);
		return "/hzszyyhospital/hzszyynurse/hlpgb/popBox/smtzBox";
	}
	
	/**
	 * 查询患者生命体征
	 * @param catNam
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/exportVitalSigns")
	public DataGridResultInfo exportVitalSigns(HspHlpgbQueryDto hspHlpgbQueryDto) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		try {
			List<HspHlpgbCustom> hspHlpgbCustomList = hspHlpgbService.exportVitalSigns(hspHlpgbQueryDto);
			dataGridResultInfo.setTotal(hspHlpgbCustomList.size());
			dataGridResultInfo.setRows(hspHlpgbCustomList);
			
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
		}
		dataGridResultInfo.setResultInfo(resultInfo);
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转TI创伤指数评分
	 *@param model
	 *@return
	 *@throws Exception
	 *@author wh
	 */
	@RequestMapping("/toTiSco")
	public String tiSco(Model model) throws Exception{
		return "/hzszyyhospital/hzszyynurse/hlpgb/scoreBox/tiSco";
	}
}
