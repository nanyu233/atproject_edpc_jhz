package activetech.base.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import activetech.base.pojo.domain.Dstrole;
import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.dto.DstmoduleCustom;
//import activetech.base.pojo.dto.DstroleQueryDto;
import activetech.base.pojo.dto.DstmoduleQueryDto;
//import activetech.base.pojo.dto.DstroleCustom;
//import activetech.base.pojo.dto.DstroleQueryDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.ModuleService;
import activetech.util.ResourcesUtil;
import activetech.util.StringUtils;
/**
 * 
 * <p>Title:ModuleAction</p>
 * <p>Description:模块管理</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-4 上午9:01:13
 * 、
 */
@Controller
@RequestMapping("/module")
public class ModuleAction {
	@Autowired
	private ModuleService moduleService;
	/**
	 * 跳转模块操作页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querymoduleoperate")
	public String querymoduleoperate(Model model) throws Exception{
		return View.toBase("/module/querymoduleoperate");
	}
	
	
	/**
	 * 跳转模块管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querymodule")
	public String querymodule(Model model,String moduleid) throws Exception{
		model.addAttribute("parentid",moduleid);
		return View.toBase("/module/querymodule");
	}
	
	/**
	 * 模块定义列表查询结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querymodule_result")
	public @ResponseBody DataGridResultInfo querymodule_result(
			DstmoduleQueryDto dstmoduleQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
		//非空校验
		dstmoduleQueryDto = dstmoduleQueryDto!=null?dstmoduleQueryDto:new DstmoduleQueryDto();
		//查询列表的总数
		int total = moduleService.findModuleCount(dstmoduleQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		dstmoduleQueryDto.setPageQuery(pageQuery);
		List<DstmoduleCustom> list = moduleService.findModuleList(dstmoduleQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转模块新增
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addmodule")
	public String addmodule(Model model,String parentid) throws Exception{
		int max=moduleService.getMaxShowOrderByParentid(parentid)+1;
		model.addAttribute("showorder", max);
		model.addAttribute("parentid", parentid);
		if("0".equals(parentid)){
			String parentname=ResourcesUtil.getValue(Config.MESSAGE, "title");
			model.addAttribute("parentname",parentname);
		}else{
			DstmoduleCustom dstmoduleCustom = moduleService.findModuleByModuleid(parentid);
			model.addAttribute("parentname",dstmoduleCustom.getModulename());
		}
		return View.toBase("/module/addmodule");
	}
	
	/**
	 * 模块新增提交(提交结果转json输出到页面、提交表单数据统一使用包装类)
	 * @param dstmoduleQueryDto
	 * @return
	 * @throws pyy
	 */
	@RequestMapping("/addmodulesubmit")
	public @ResponseBody SubmitResultInfo addmodulesubmit(DstmoduleQueryDto dstmoduleQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		moduleService.insertModule(dstmoduleQueryDto.getDstmoduleCustom().getParentid(),dstmoduleQueryDto.getDstmoduleCustom());
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 跳转模块修改
	 * @param model
	 * @param moduleid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editmodule")
	public String editmodule(Model model,String moduleid) throws Exception{
		//根据moduleid获取模块信息并传回页面
		DstmoduleCustom dstmoduleCustom = moduleService.findModuleByModuleid(moduleid);
		model.addAttribute("dstmoduleCustom", dstmoduleCustom);
		model.addAttribute("parentid", dstmoduleCustom.getParentid());
		if(StringUtils.isNotNullAndEmptyByTrim(dstmoduleCustom.getParentid()) 
			){
			if("0".equals(dstmoduleCustom.getParentid())){
				String parentname=ResourcesUtil.getValue(Config.MESSAGE, "title");
				model.addAttribute("parentname",parentname);
			}else{
				model.addAttribute("parentname",dstmoduleCustom.getParentname());
			}
		}
		return View.toBase("/module/editmodule");
	}
	
	/**
	 * 模块修改提交
	 * @param id
	 * @param dstmoduleQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editmodulesubmit")
	public @ResponseBody SubmitResultInfo editmodulesubmit(DstmoduleQueryDto dstmoduleQueryDto)throws Exception{
		moduleService.updateModule(dstmoduleQueryDto);		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}

	/**
	 * 删除模块
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletemodule")
	public @ResponseBody SubmitResultInfo deletemodule(String moduleid) throws Exception{
		moduleService.deleteModule(moduleid);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	/**
	 * 角色分配模块操作树（一次加载）
	 * @param roleid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/loadAuthModuleTree")
	public @ResponseBody List<TreeNode> loadAuthModuleTree(String roleid)throws Exception{
		return moduleService.loadAuthModuleTree(roleid);
	}
	
	/**
	 * 分布加载模块操作树（分布加载）
	 * @param nodeid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/loadModuleTreeElement")
	public @ResponseBody List<TreeNode> loadModuleTreeElement(String nodeid)throws Exception{
		return moduleService.loadModuleTreeElement(nodeid);
	}
	
	/**
	 * 全量加载模块操作树（一次加载）
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/loadModuleTree")
	public @ResponseBody List<TreeNode> loadModuleTree()throws Exception{
		return moduleService.loadModuleTree();
	}
	@RequestMapping("/roleauth")
	public @ResponseBody SubmitResultInfo roleauth(Model model,String roleid,String[] ids) throws Exception{
		moduleService.insertroleauth(roleid,ids);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
}
