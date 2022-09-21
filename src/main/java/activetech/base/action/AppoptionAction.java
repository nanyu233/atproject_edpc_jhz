package activetech.base.action;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.dto.DstappoptionQueryDto;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.AppoptionService;

/**
 * 
 * <p>Title:AppoptionAction</p>
 * <p>Description:基础配置表</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月17日 下午2:15:14
 *
 */
@Controller
@RequestMapping("/appoption")
public class AppoptionAction {
	@Autowired
	private AppoptionService appoptionService;
	/**
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryappoption")
	public String queryappoption(Model model) throws Exception{
		List<Dstappoption> list=appoptionService.findAppoptionList();
		model.addAttribute("appoptionlist", list);
		model.addAttribute("appoptionSize",list.size());
		return View.toBase("/appoption/queryappoption");
	}
	/**
	 * 基础信息表提交
	 * @param dstappoptionQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editappoptionsubmit")
	public @ResponseBody SubmitResultInfo editappoptionsubmit(DstappoptionQueryDto dstappoptionQueryDto)throws Exception{
		appoptionService.updateAppoption(dstappoptionQueryDto);	
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
}
