package activetech.zyyhospital.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.zyyhospital.pojo.dto.HspModelInfCustom;
import activetech.zyyhospital.pojo.dto.HspModelInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspModelcontInfCustom;
import activetech.zyyhospital.service.HspModelInfService;


@Controller
@RequestMapping("/zyydoc")
public class ZyyDocadviceAction {
	@Autowired
	private HspModelInfService hspModelInfService;
	/**
	 * 跳转医嘱导入管理
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querydocadvice")
	public String querydocadvice(Model model,String moduleid) throws Exception {
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyydocadvice/querydocadvice";
	}
	
	/**
	 * 获取医嘱导入模板名结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querydocadvice_result")
	public @ResponseBody DataGridResultInfo querydocadvice_result()throws Exception{
		String modelContent="1";
		List<HspModelInfCustom> list=hspModelInfService.finddocadviceList(modelContent);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 根据医嘱模板名获取模板内容
	 * @param model
	 * @retu
	 * @throws Exception
	 */
	@RequestMapping("/querydocadvicecon_result")
	public @ResponseBody DataGridResultInfo querydocadvicecon_result(HspModelInfQueryDto hspModelInfQueryDto
			)throws Exception{
		hspModelInfQueryDto=hspModelInfQueryDto!=null?hspModelInfQueryDto:new HspModelInfQueryDto();
		
		int total=hspModelInfService.finddocadviceconListCount(hspModelInfQueryDto);
		List<HspModelcontInfCustom> list=hspModelInfService.finddocadviceconList(hspModelInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 跳珠新增模板
	 * @param model
	 * @retu
	 * @throws Exception
	 */
	@RequestMapping("/toadddoc")
	public String toadddoc(Model model)throws Exception{
		
		return "/hzszyyhospital/hzszyydocadvice/adddocadvice";
	}
	
	/**
	 * 新增模板提交
	 * @param hspModelcontInfCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/adddoc")
	public @ResponseBody SubmitResultInfo addDoc(HspModelInfCustom hspModelInfCustom,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspModelInfService.addDoc(hspModelInfCustom,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转修改模板
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toupdatedoc")
	public String toupdatedoc(Model model,String modelSeq)throws Exception{
		HspModelInfCustom hspModelInfCustom=hspModelInfService.finddocBySeq(modelSeq);
		model.addAttribute("hspModelInfCustom", hspModelInfCustom);
		return "/hzszyyhospital/hzszyydocadvice/editdocadvice";
	}
	
	/**
	 * 修改模板提交
	 * @param hspModelcontInfCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editdoc")
	public @ResponseBody SubmitResultInfo editdoc(HspModelInfQueryDto hspModelInfQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspModelInfService.editdoc(hspModelInfQueryDto.getHspModelInfCustom());
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除模板提交
	 * @param hspModelcontInfCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deldoc")
	public @ResponseBody SubmitResultInfo delDoc(HspModelInfQueryDto hspModelInfQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspModelInfService.delDoc(hspModelInfQueryDto.getHspModelInfCustom());
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 跳珠新增模板内容
	 * @param model
	 * @retu
	 * @throws Exception
	 */
	@RequestMapping("/toadddoccontent")
	public String toadddoccontent(Model model,String modelSeq)throws Exception{
		model.addAttribute("modelSeq", modelSeq);
		return "/hzszyyhospital/hzszyydocadvice/adddoccontent";
	}
	
	/**
	 * 新增模板内容提交
	 * @param hspModelcontInfCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/adddoccontent")
	public @ResponseBody SubmitResultInfo adddoccontent(HspModelcontInfCustom hspModelInfCustom,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspModelInfService.adddoccontent(hspModelInfCustom,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除模板内容提交
	 * @param hspModelcontInfCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deldoccontent")
	public @ResponseBody SubmitResultInfo deldoccontent(HspModelInfQueryDto hspModelInfQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspModelInfService.deldoccontent(hspModelInfQueryDto.getHspModelcontInfCustom());
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 跳转修改模板内容
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toupdatedoccontent")
	public String editdoccontent(Model model,String modelcontSeq)throws Exception{
		HspModelcontInfCustom hspModelcontInfCustom=hspModelInfService.finddoccontentBySeq(modelcontSeq);
		model.addAttribute("hspModelcontInfCustom", hspModelcontInfCustom);
		return "/hzszyyhospital/hzszyydocadvice/editdoccontent";
	}
	
	/**
	 * 修改模板内容提交
	 * @param hspModelcontInfCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editdoccontent")
	public @ResponseBody SubmitResultInfo editdoccontent(HspModelInfQueryDto hspModelInfQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspModelInfService.editdoccontent(hspModelInfQueryDto.getHspModelcontInfCustom(),activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
