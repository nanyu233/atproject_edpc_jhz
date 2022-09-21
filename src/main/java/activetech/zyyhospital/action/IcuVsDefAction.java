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

import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.eicu.pojo.dto.IcuVsDefCustom;
import activetech.eicu.pojo.dto.IcuVsDefQueryDto;
import activetech.zyyhospital.service.IcuVsDefService;



/**
 * 生命体征
 * @author machaofan
 * @date 2020/02/26
 */
@Controller
@RequestMapping("/icuVsDef")
public class IcuVsDefAction {
	
	@Autowired
	private IcuVsDefService icuVsDefService;
	/**
	 * 跳转生命体征页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/toIcuVsDef")
	public String toIcuVsDef(Model model){
		return "/hzszyyhospital/hzszyyxtpg/xtpg/icuvsdef/editIcuVsDef";
	}
	
	
	/**
	 * 获取生命体征列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getIcuVsDefList")
	public SubmitResultInfo getIcuVsDefList(){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = new HashMap<>();
		List<IcuVsDefCustom> list = icuVsDefService.getIcuVsDefList();
		map.put("list", list);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 保存修改生命体征
	 * @param vsDefList
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/editVsDefSubmit")
	public SubmitResultInfo editVsDefSubmit(@RequestBody IcuVsDefQueryDto icuVsDefQueryDto) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		icuVsDefService.editVsDefSubmit(icuVsDefQueryDto.getVsDefList());
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
