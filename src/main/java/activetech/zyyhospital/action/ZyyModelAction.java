package activetech.zyyhospital.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.zyyhospital.pojo.dto.HspModelInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspModelcontInfCustom;
import activetech.zyyhospital.service.HspModelInfService;

/**
 * 
 * <p>
 * Title:ZyyModelAction
 * </p>
 * <p>
 * Description:模板导入
 * </p>
 * <p>
 * activetech
 * </p>
 * 
 * @author ckb
 * @date 2018年1月3日
 * 
 */
@Controller
@RequestMapping("/zyymodel")
public class ZyyModelAction {
	@Autowired
	private HspModelInfService hspModelInfService;
	@Autowired
	private SystemConfigService systemConfigService;
	
	/**
	 * 跳转模板导入
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querymodel")
	public String querymodel(Model model) throws Exception {
		return "/hzszyyhospital/hzszyynote/disposal";
	}
	
	/**
	 * 根据模板号获取大类结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/majorCls_result")
	public @ResponseBody List<Dstdictinfo> majorCls_result()throws Exception{
		List<Dstdictinfo> list = systemConfigService.findDictinfoByType("CZDR");
		return list;
	}
	
	/**
	 * 大类子类内容列表结果集
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/modellist_result")
	public @ResponseBody DataGridResultInfo modellist_result(HspModelInfQueryDto hspModelInfQueryDto
			)throws Exception{
		hspModelInfQueryDto=hspModelInfQueryDto!=null?hspModelInfQueryDto:new HspModelInfQueryDto();
		int total=hspModelInfService.findSubClsByMajorCount(hspModelInfQueryDto);
		List<HspModelcontInfCustom> list=hspModelInfService.findSubClsByMajor(hspModelInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转新增模板内容
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toadd")
	public String toAdd(Model model,String modelcontSeq)throws Exception{
		List<Dstdictinfo> czdrlist = systemConfigService.findDictinfoByType("CZDR");
		model.addAttribute("czdrlist", czdrlist);
		return "/hzszyyhospital/hzszyymodel/addModel";
	}
	
	/**
	 * 新增模板内容
	 * @param hspModelcontInfCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addmodel")
	public @ResponseBody SubmitResultInfo addModel(HspModelcontInfCustom hspModelcontInfCustom,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspModelInfService.addModelContent(hspModelcontInfCustom, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转修改模板内容页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toupdate")
	public String toUpdate(Model model,String modelcontSeq)throws Exception{
		HspModelcontInfCustom hspModelcontInfCustom=hspModelInfService.findModelcontBySeq(modelcontSeq);
		List<Dstdictinfo> czdrlist = systemConfigService.findDictinfoByType("CZDR");
		model.addAttribute("hspModelcontInfCustom", hspModelcontInfCustom);
		model.addAttribute("czdrlist", czdrlist);
		return "/hzszyyhospital/hzszyymodel/editModel";
	}
	
	/**
	 * 修改模板内容
	 * @param hspModelcontInfCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editmodel")
	public @ResponseBody SubmitResultInfo updateModel(HspModelcontInfCustom hspModelcontInfCustom,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspModelInfService.editModelContent(hspModelcontInfCustom, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除模板内容
	 * @param hspModelcontInfCustom
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delmodel")
	public @ResponseBody SubmitResultInfo delmodel(HspModelcontInfCustom hspModelcontInfCustom)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspModelInfService.delModelContent(hspModelcontInfCustom);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转模板内容列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querymodelcont")
	public String querymodelcont(Model model, String moduleid)throws Exception{
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyymodel/queryModel";
	}
	
	/**
	 * 获取模板导入内容列表
	 * @param model
	 * @param hspModelInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querymodelcont_result")
	public @ResponseBody DataGridResultInfo querymodelcont_result(HspModelInfQueryDto hspModelInfQueryDto,
			int rows,int page)throws Exception{
		hspModelInfQueryDto=hspModelInfQueryDto!=null?hspModelInfQueryDto:new HspModelInfQueryDto();
		int total=hspModelInfService.findSubClsByMajorCount(hspModelInfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspModelInfQueryDto.setPageQuery(pageQuery);
		List<HspModelcontInfCustom> list=hspModelInfService.findSubClsByMajor(hspModelInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
		
	}
	
}
