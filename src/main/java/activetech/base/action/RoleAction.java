package activetech.base.action;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstrole;
import activetech.base.pojo.dto.DstroleCustom;
import activetech.base.pojo.dto.DstroleQueryDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.RoleService;
/**
 * 
 * <p>Title:RoleAction</p>
 * <p>Description:角色定义</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-3 下午2:52:40
 * 
 */
@Controller
@RequestMapping("/role")
public class RoleAction {
	@Autowired
	private RoleService roleService;
	
	/**
	 * 跳转角色定义列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryrole")
	public String queryrole(Model model,String moduleid) throws Exception{
		model.addAttribute("moduleid", moduleid);
		return View.toBase("/role/queryrole");
	}
	
	/**
	 * 角色定义列表查询结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryrole_result")
	public @ResponseBody DataGridResultInfo queryRole_result(
			DstroleQueryDto dstroleQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
		//非空校验
		dstroleQueryDto = dstroleQueryDto!=null?dstroleQueryDto:new DstroleQueryDto();
		
		//查询列表的总数
		int total = roleService.findRoleCount(dstroleQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		dstroleQueryDto.setPageQuery(pageQuery);
		List<Dstrole> list = roleService.findRoleList(dstroleQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
		

	/**
	 * 跳转角色新增界面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addrole")
	public String addrole(Model model) throws Exception{
		return View.toBase("/role/addrole");
	}
	
	/**
	 * 角色新增提交(提交结果转json输出到页面、提交表单数据统一使用包装类)
	 * @param dstroleQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addrolesubmit")
	public @ResponseBody SubmitResultInfo addrolesubmit(DstroleQueryDto dstroleQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		roleService.insertRole(dstroleQueryDto.getDstroleCustom());
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转角色修改界面
	 * @param model
	 * @param roleid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editrole")
	public String editrole(Model model,String roleid) throws Exception{
		//根据roleid获取角色信息并传回页面
		DstroleCustom dstroleCustom = roleService.findRoleByRoleid(roleid);
		model.addAttribute("dstroleCustom", dstroleCustom);
		return View.toBase("/role/editrole");
	}
	
	/**
	 * 角色修改提交
	 * @param roleid
	 * @param dstroleQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editrolesubmit")
	public @ResponseBody SubmitResultInfo editrolesubmit(String roleid,DstroleQueryDto dstroleQueryDto)throws Exception{
		roleService.updateRole(roleid,dstroleQueryDto.getDstroleCustom());		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}

	/**
	 * 删除用户
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deleterole")
	public @ResponseBody SubmitResultInfo deleterole(String roleid) throws Exception{
		roleService.deleteRole(roleid);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	@RequestMapping("/allocaterole")
	public String allocaterole(Model model,String roleid) throws Exception{
		model.addAttribute("roleid", roleid);
		return View.toBase("/role/allocaterole");
	}

}
