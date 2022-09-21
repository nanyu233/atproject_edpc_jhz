package activetech.zyyhospital.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.zyyhospital.pojo.dto.HspGlcsCustom;
import activetech.zyyhospital.pojo.dto.HspGlcsCustomDto;
import activetech.zyyhospital.service.ZyyGlcsService;

@Controller
@RequestMapping("/gl")
public class GlcsAction {
	
	@Autowired
	private ZyyGlcsService zyyGlcsService;
	//跳转到隔离措施
	@RequestMapping("/toglcs")
	public String queryglcs(Model model,String emgSeq,String emgNam) throws Exception {
		HspGlcsCustom hspGlcsCustom=zyyGlcsService.findGlcs(emgSeq);
		model.addAttribute("hspGlcsCustom",hspGlcsCustom);
		model.addAttribute("emgNam",emgNam);
		model.addAttribute("emgSeq",emgSeq);
		return "/hzszyyhospital/hzszyyqjs/glcs";
	}
	
	//提交隔离措施
	@RequestMapping("/submitGlcs")
	public @ResponseBody SubmitResultInfo submitglcs(HspGlcsCustomDto hspGlcsCustomDto,ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyGlcsService.insertGlcs(hspGlcsCustomDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
		
}
