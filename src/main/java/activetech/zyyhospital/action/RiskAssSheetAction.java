package activetech.zyyhospital.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.annotation.FormToken;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.dto.HspCxfxpgbCustom;
import activetech.zyyhospital.pojo.dto.HspCxfxpgbCustomDto;
import activetech.zyyhospital.pojo.dto.HspJmxsfxyspgbCustom;
import activetech.zyyhospital.pojo.dto.HspJmxsfxyspgbCustomDto;
import activetech.zyyhospital.pojo.dto.HspVtefxpgbCustom;
import activetech.zyyhospital.pojo.dto.HspVtefxpgbCustomDto;
import activetech.zyyhospital.service.RiskAssSheetService;
import activetech.zyyhospital.service.ZyyHspemginfService;

/**
 * <p>
 * Title:RiskAssSheetAction
 * </p>
 * <p>
 * Description:出血风险评估表
 * </p>
 * <p>
 * activetech
 * </p>
 * 
 */
@Controller
@RequestMapping("/riskAss")
public class RiskAssSheetAction {
	// 数据字典
	@Autowired
	private SystemConfigService systemConfigService;
	// 预检信息
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	// 出血评估
	@Autowired
	private RiskAssSheetService riskAssSheetService;
	

	/* 数据字典页面展示 */
	@RequestMapping("/findRiskAssSheetList")
	public @ResponseBody SubmitResultInfo findRiskAssSheetList(String emgSeq) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, String> params = new HashMap<String, String>(20);
		params.put("HIGHRISK1_COD", "highrisk1CodList");// 满足一项高出血
		params.put("HIGHRISK2_COD", "highrisk2CodList");// 满足二项高出血
		params.put("FXYZ_COD", "fxyzCodList");// VTE
		params.put("MGWXYS_A_COD", "mgwxysACodList");// A每个危险因素1分
		params.put("MGWXYS_B_COD", "mgwxysBCodList");// B每个危险因素2分
		params.put("MGWXYS_C_COD", "mgwxysCCodList");// C每个危险因素3分
		params.put("MGWXYS_D_COD", "mgwxysDCodList");// D每个危险因素5分

		Map<String, List<Dstdictinfo>> maps = systemConfigService.findDstdictinfos(params);
		Map<String, Object> map = new HashMap<String, Object>(20);
		map.putAll(maps);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/*---------------------------------出血风险------------------------------------------------------*/
	/**
	 * 跳转內科住院患者出血风险评估
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/riskAssSheet")
	@FormToken(save = true)
	public String riskAssSheet(Model model, String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspCxfxpgbCustom hspCxfxpgbCustom = riskAssSheetService.findCxfxpgbByEmgSeq(emgSeq);
		model.addAttribute("hspCxfxpgbCustom", hspCxfxpgbCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/riskAssSheet/patientBleed";
	}

	/**
	 * 出血风险提交
	 * 
	 * @param hspCxfxpgbCustomDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitriskAssSheet")
	public @ResponseBody SubmitResultInfo submitriskAssSheet(HspCxfxpgbCustomDto hspCxfxpgbCustomDto,
			ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		riskAssSheetService.submitCxfxpgb(hspCxfxpgbCustomDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 出血风险评估数据获取
	 * 
	 * @param cerebralCourseSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findriskAssSheet")
	public @ResponseBody HspCxfxpgbCustomDto riskAssSheet(String emgSeq) throws Exception {
		HspCxfxpgbCustomDto hspCxfxpgbCustomDto = riskAssSheetService.findCxfxpgbById(emgSeq);
		return hspCxfxpgbCustomDto;
	}

	/*---------------------------------vte------------------------------------------------------*/
	// 跳转到VTE评估
	@RequestMapping("/VteAssSheet")
	@FormToken(save = true)
	public String vteAssSheet(Model model, String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspVtefxpgbCustom hspVtefxpgbCustom = riskAssSheetService.findVtefxpgbByEmgSeq(emgSeq);
		model.addAttribute("hspVtefxpgbCustom", hspVtefxpgbCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/vteAssSheet/VteRisk";
	}

	// VTE提交
	@RequestMapping("/submitVteAssSheet")
	public @ResponseBody SubmitResultInfo submitVteAssSheet(HspVtefxpgbCustomDto hspVtefxpgbCustomDto,
			ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		riskAssSheetService.submitVtefxpgb(hspVtefxpgbCustomDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	// VTE获取
	@RequestMapping("/findVteAssSheet")
	public @ResponseBody HspVtefxpgbCustomDto findVteAssSheet(String emgSeq) throws Exception {
		HspVtefxpgbCustomDto hspVtefxpgbCustomDto = riskAssSheetService.findVtefxpgbById(emgSeq);
		return hspVtefxpgbCustomDto;
	}

	/*---------------------------------静脉血栓------------------------------------------------------*/
	// 跳转到静脉血栓评估
	@RequestMapping("/jmxsAssSheet")
	@FormToken(save = true)
	public String jmxsAssSheet(Model model, String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspJmxsfxyspgbCustom hspJmxsfxyspgbCustom = riskAssSheetService.findJmxsfxpgbByEmgSeq(emgSeq);
		model.addAttribute("hspJmxsfxyspgbCustom", hspJmxsfxyspgbCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/riskAssess/bloodRiskAssess";
	}

	// 静脉血栓提交
	@RequestMapping("/submitJmxsAssSheet")
	public @ResponseBody SubmitResultInfo submitJmxsAssSheet(HspJmxsfxyspgbCustomDto hspJmxsfxyspgbCustomDto,
			ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		riskAssSheetService.submitJmxsfxpgb(hspJmxsfxyspgbCustomDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	// 静脉血栓获取
	@RequestMapping("/findJmxsAssSheet")
	public @ResponseBody HspJmxsfxyspgbCustomDto findJmxsAssSheet(String emgSeq) throws Exception {
		HspJmxsfxyspgbCustomDto hspJmxsfxyspgbCustomDto = riskAssSheetService.findJmxsfxpgbById(emgSeq);
		return hspJmxsfxyspgbCustomDto;
	}
}
