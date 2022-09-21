package activetech.base.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.DstmoduleCustom;
import activetech.base.pojo.dto.DstoperationCustom;
import activetech.base.pojo.dto.DstoperationQueryDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.ModuleService;
import activetech.base.service.OperationService;
import activetech.base.service.SystemConfigService;
/**
 * 
 * <p>Title:OperationAction</p>
 * <p>Description:操作管理</p>
 * <p>activetech</p>
 * @author lpp
 * @date 2017-1-5 下午4:19:57
 *
 */
@Controller
@RequestMapping("/operation")
public class OperationAction {
	@Autowired
	private OperationService operationService;
	@Autowired
	private ModuleService moduleService;
	@Autowired
	private SystemConfigService systemConfigService;
	
	
	/**
	 * 跳转操作管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryoperation")
	public String queryoperation(Model model,String moduleid) throws Exception{
		model.addAttribute("moduleid", moduleid);
		return View.toBase("/operation/queryoperation");
	}
	/**
	 * 操作管理查询结果集
	 * @param dstoperationQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryoperation_result")
	public @ResponseBody DataGridResultInfo queryOperation_result(
			DstoperationQueryDto dstoperationQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
		//非空校验
		dstoperationQueryDto = dstoperationQueryDto!=null?dstoperationQueryDto:new DstoperationQueryDto();
		//查询列表的总数
		DstoperationCustom dstoperationCustom = dstoperationQueryDto.getDstoperationCustom();
		dstoperationQueryDto.setDstoperationCustom(dstoperationCustom);
		int total = operationService.findOperationCount(dstoperationCustom.getModuleid());
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		dstoperationQueryDto.setPageQuery(pageQuery);
		List<DstoperationCustom> list = operationService.findOperationList(dstoperationQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转操作新增
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addoperation")
	public String addoperation(Model model,String moduleid) throws Exception{
		DstmoduleCustom dstmoduleCustom = moduleService.findModuleByModuleid(moduleid);
		int dstoperations = operationService.findOperationCount(moduleid);
		model.addAttribute("modulename", dstmoduleCustom.getModulename());
		model.addAttribute("moduleid", moduleid);
		List<Dstdictinfo> opertypeList = systemConfigService.findDictinfoByType("OPERATION_TYPE");
		model.addAttribute("opertypeList", opertypeList);
		model.addAttribute("dstoperations", dstoperations+1);
		return View.toBase("/operation/addoperation");
	}
	
	/**
	 * 操作新增提交（提交结果转json输出到页面、提交表单数据统一使用包装类）
	 * @param dstoperationQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addoperationsubmit")
	public @ResponseBody SubmitResultInfo addoperationsubmit(String moduleid,DstoperationQueryDto dstoperationQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		operationService.insertOperation(moduleid, dstoperationQueryDto.getDstoperationCustom());
		return ResultUtil.createSubmitResult(resultInfo);
		
	}
	
	/**
	 * 跳转操作修改
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editoperation")
	public String editoperation(Model model,String operateid) throws Exception{
		//根据operateid获取操作信息并传回页面
		DstoperationCustom dstoperationCustom = operationService.findOperationByOperateid(operateid);
		String moduleid = dstoperationCustom.getModuleid();
		DstmoduleCustom dstmoduleCustom = moduleService.findModuleByModuleid(moduleid);
		model.addAttribute("modulename", dstmoduleCustom.getModulename());
		model.addAttribute("dstoperationCustom", dstoperationCustom);
		List<Dstdictinfo> opertypeList = systemConfigService.findDictinfoByType("OPERATION_TYPE");
		model.addAttribute("opertypeList", opertypeList);
		return View.toBase("/operation/editoperation");
	}
	/**
	 * 操作修改提交
	 * @param operateid
	 * @param dstoperationQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editoperationsubmit")
	public @ResponseBody SubmitResultInfo editoperationsubmit(String operateid, DstoperationQueryDto dstoperationQueryDto)throws Exception{
		operateid = dstoperationQueryDto.getDstoperationCustom().getOperateid();
		operationService.updateOperation(operateid,dstoperationQueryDto.getDstoperationCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	/**
	 * 删除操作
	 * @param operateid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deleteoperation")
	public @ResponseBody SubmitResultInfo deleteoperation(String operateid) throws Exception{
		operationService.deleteOperation(operateid);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}

}
