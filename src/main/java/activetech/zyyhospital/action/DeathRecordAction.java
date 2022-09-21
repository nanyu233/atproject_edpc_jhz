package activetech.zyyhospital.action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.annotation.FormToken;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.service.HspCstInfService;
import activetech.zyyhospital.pojo.dto.HspDeathRecordCustom;
import activetech.zyyhospital.pojo.dto.HspDeathRecordQueryDto;
import activetech.zyyhospital.pojo.dto.HspLqblInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.service.HspDeathRecordService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyLqblService;

/**
 * <p>Title:DeathRecordAction</p>
 * <p>Description死亡记录</p>
 * <p>activetech</p>
 * @date 2018年1月31日
 */
@Controller
@RequestMapping("/deathRecord")
public class DeathRecordAction {

	@Autowired
	private HspDeathRecordService hspDeathRecordService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private ZyyLqblService zyyLqblService;
	
	/**
	 * 跳转死亡记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryMainDeathRecord")
	@FormToken(save=true)
	public String queryMainDeathRecord(Model model,HspDeathRecordQueryDto hspDeathRecordQueryDto
			) throws Exception{
		String emgSeqDr = hspDeathRecordQueryDto.getHspDeathRecordCustom().getEmgSeqDr();
		HspDeathRecordCustom hspDeathRecordCustom = hspDeathRecordService.findDeathRecord(hspDeathRecordQueryDto);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeqDr);
		HspLqblInfCustom hspLqblInfCustom = zyyLqblService.findLqblForDisease(emgSeqDr);
		model.addAttribute("hspDeathRecordCustom", hspDeathRecordCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("hspLqblInfCustom", hspLqblInfCustom);
		return "/hzszyyhospital/hzszyydoctor/deathRecord/queryMainDeathRecord";
	}
	
	/**
	 * 跳转死亡记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryDeathRecord")
	public String querydiseaseCourse(Model model,String emgSeqDr) throws Exception{
		model.addAttribute("emgSeqDr", emgSeqDr);
		return "/hzszyyhospital/hzszyydoctor/deathRecord/queryDeathRecord";
	}
	
	/**
	 * 死亡记录新增或修改提交
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addOrEditFirstSubmit")
	@FormToken(remove=true)
	public @ResponseBody SubmitResultInfo addOrEditFirstSubmit(Model model,HspDeathRecordQueryDto hspDeathRecordQueryDto,
			HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspDeathRecordService.saveOrUpdateFirst(hspDeathRecordQueryDto,hspLqbljlQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	

	/**
	 * 删除提交
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delDeathRecord")
	public @ResponseBody SubmitResultInfo delDeathRecord(String deathRecordSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspDeathRecordService.deleteDeathRecord(deathRecordSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
}
