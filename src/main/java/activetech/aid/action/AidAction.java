package activetech.aid.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.aid.pojo.dto.AidPatientQueryDto;
import activetech.aid.service.AidService;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;

@Controller
@RequestMapping("/aid")
public class AidAction {
	@Autowired
	private AidService aidService;
	/**
	 * 跳转院前信息
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/topatient")
	public String topatient (Model model,String patid,String emgSeq) throws Exception {
		/*
		AidPatient aidPatient = new AidPatient();
		AidPatientCustom aidPatientCustom = new AidPatientCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(patid)){
			aidPatient = aidPatientMapper.selectByPrimaryKey(patid);
			if(StringUtils.isNotNullAndEmptyByTrim(aidPatient.getPatid())){
				BeanUtils.copyProperties(aidPatient,aidPatientCustom);
			}
		}else{
			patid = systemConfigService.findSequences("AID_PATIENT_PATID", "8", null);
			aidPatientCustom.setPatid(patid);
		}
		*/
		// model.addAttribute("aidPatientCustom", aidPatientCustom);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("patid", patid);
		return "/hzszyyhospital/aid/aidPatient/patientinfo";
	}
	
	
	@RequestMapping("/getPatInfoByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getPatInfoByEmgSeq (@RequestBody(required=false) Map<String, Object> map) throws Exception {
		
		String patid = "";
		
		if(map.containsKey("patid")){
			patid = (String) map.get("patid");
		}
		
		ResultInfo resultInfo = aidService.getPatInfoByEmgSeq(patid);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	
	@RequestMapping("/getPatInfo")
	@ResponseBody
	public SubmitResultInfo getPatInfo(@RequestBody(required=false) Map<String, Object> map) throws Exception {
		
		String emgSeq = "";
		
		String wayTyp = "";
			
		if(map.containsKey("emgSeq")){
			emgSeq = (String) map.get("emgSeq");
		}
		if(map.containsKey("wayTyp")){
			wayTyp = (String) map.get("wayTyp");
		}
		
		ResultInfo resultInfo = aidService.getPatInfo(emgSeq,wayTyp);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 院前信息录入
	 * @param model
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("/mergeAidpatient")
	@ResponseBody
	public SubmitResultInfo mergeAidpatient(@RequestBody AidPatientQueryDto aidPatientQueryDto,ActiveUser activeUser) throws Exception {
		
		ResultInfo resultInfo = aidService.mergeAidpatient(aidPatientQueryDto, activeUser);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
}
