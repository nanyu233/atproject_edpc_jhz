package activetech.zyyhospital.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.hospital.pojo.dto.HspJbzdInfCustom;
//import activetech.hospital.service.HspCstInfService;
import activetech.zyyhospital.service.HspJbzdInfNewService;

/**
 * 
 * 诊断相关 诊断数据都来自接口，急诊系统只做展示，不做录入和修改
 *
 */
@Controller
@RequestMapping("/zyyjbzd")
public class ZyyJbzdNewAction {
	@Autowired
	private HspJbzdInfNewService hspJbzdInfNewService;
//	@Autowired
//	private HspCstInfService hspCstInfService;
	
	/**
	 * 患者疾病信息获取
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zyyGetJbzdInfList")
	public@ResponseBody Map<String, Object> getJbzdInfList(HspJbzdInfCustom hspJbzdInfCustom)throws Exception{
		Map<String, Object> map=new HashMap<String, Object>(10);
		List<HspJbzdInfCustom> hspJbzdInfCustomList = hspJbzdInfNewService.findJbzdListByEmgSeq(hspJbzdInfCustom);
		//HspJbzdInfCustom jbzdCommCustom = hspCstInfService.findHspJbzdInfComm(hspJbzdInfCustom.getEmgSeq(),hspJbzdInfCustom.getJbzdType()); //会诊的备注
		map.put("hspJbzdInfCustomList", hspJbzdInfCustomList);
		//map.put("jbzdCommCustom", jbzdCommCustom);
		return map;
	}
	
	/**
	 * 诊断录入保存(新模式，诊断直接保存)
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zyySubmitJbzd")
	public @ResponseBody SubmitResultInfo zyySubmitJbzd(@RequestBody List<HspJbzdInfCustom> jbzdList,ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String jbzdDes=hspJbzdInfNewService.submitJbzdList(jbzdList,activeUser);
		resultInfo.setMessage(jbzdDes);
		return ResultUtil.createSubmitResult(resultInfo);
	}

}
