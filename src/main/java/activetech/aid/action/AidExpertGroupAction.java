package activetech.aid.action;

import activetech.aid.pojo.dto.AidEptGrpCustom;
import activetech.aid.service.OndutyService;
import activetech.base.action.View;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.process.result.TreeGridResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 专家组
 * @author ROG
 * @date 2019年1月11日 下午4:36:12
 * @Description: 120区域急救管理系统-专家组管理控制器类
 */
@Controller
@RequestMapping("/expertGroup")
public class AidExpertGroupAction {
	
	@Autowired
	private OndutyService ondutyService;
	
	
	/**
	 * 跳转专家组管理页面
	 * @param model
	 * @param moduleid
	 * @return
	 * @throws Exception
	 * @date 2019年1月11日 下午4:37:20
	 */
	@RequestMapping("/toExpertGroupPage")
	public String toExpertGroupPage(Model model, String moduleid) throws Exception{
		model.addAttribute("moduleid", moduleid);
		return View.toEDPC("/expertGroup/queryExpertGroup");
	}
	
	/**
	 * 获取专家组数据
	 * @return
	 * @date 2019年1月11日 下午4:38:59
	 */
	@RequestMapping("/getExpertGroupList")
	@ResponseBody
	public TreeGridResultInfo getExpertGroupList(){
		
		TreeGridResultInfo treeGridResultInfo = new TreeGridResultInfo();
		
		List<AidEptGrpCustom> list = ondutyService.getExpertGroupList();
		
		treeGridResultInfo.setTotal(list.size());
		
		treeGridResultInfo.setRows(list);
		
		return treeGridResultInfo;
		
	}
	
	
	/**
	 * 跳转新增专家组页面
	 * @param model
	 * @return
	 * @throws Exception
	 * @date 2019年1月11日 下午4:57:06
	 */
	@RequestMapping("/toAddExpertGroupPage")
	public String toAddExpertGroupPage(Model model) throws Exception{
		return View.toEDPC("/expertGroup/addExpertGroup");
	}
	
	
	/**
	 * 新增专家组提交
	 * @param activeUser
	 * @param aidEptGrpCustom
	 * @return
	 * @date 2019年1月11日 下午4:58:46
	 */
	@RequestMapping("/addExpertGroupSubmit")
	@ResponseBody
	public SubmitResultInfo addExpertGroupSubmit(ActiveUser activeUser,AidEptGrpCustom aidEptGrpCustom){

		aidEptGrpCustom.setCrtUsr(activeUser.getUsrno());
		
		ResultInfo resultInfo = ondutyService.addExpertGroupSubmit(aidEptGrpCustom);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 跳转修改专家组页面
	 * @param model
	 * @return
	 * @throws Exception
	 * @date 2019年1月11日 下午5:12:17
	 */
	@RequestMapping("/toUpdateExpertGroupPage")
	public String toUpdateExpertGroupPage(Model model,String groupseq,String groupname) throws Exception{
		model.addAttribute("groupseq", groupseq);
		model.addAttribute("groupname", groupname);
		return View.toEDPC("/expertGroup/updateExpertGroup");
	}
	
	/**
	 * 修改专家组提交
	 * @param activeUser
	 * @return
	 * @date 2019年1月11日 下午5:11:47
	 */
	@RequestMapping("/updateExpertGroupSubmit")
	@ResponseBody
	public SubmitResultInfo updateExpertGroupSubmit(ActiveUser activeUser,AidEptGrpCustom aidEptGrpCustom){

		aidEptGrpCustom.setModUsr(activeUser.getUsrno());
		
		ResultInfo resultInfo = ondutyService.updateExpertGroupSubmit(aidEptGrpCustom);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除专家组提交
	 * @param aidEptGrpCustom
	 * @return
	 * @date 2019年1月11日 下午5:15:02
	 */
	@RequestMapping("/deleteExpertGroupSubmit")
	@ResponseBody
	public SubmitResultInfo deleteExpertGroupSubmit(AidEptGrpCustom aidEptGrpCustom){
		
		ResultInfo resultInfo = ondutyService.deleteExpertGroupSubmit(aidEptGrpCustom);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	//////////----------------------------------------------------------------------------------------------
	
	
	/**
	 * 跳转新增专家页面
	 * @param model
	 * @return
	 * @throws Exception
	 * @date 2019年1月11日 下午4:57:06
	 */
	@RequestMapping("/toAddExpertGroupMemberPage")
	public String toAddExpertGroupMemberPage(Model model,String groupseq,String groupname) throws Exception{
		model.addAttribute("groupseq", groupseq);
		model.addAttribute("groupname", groupname);
		return View.toEDPC("/expertGroup/addExpertGroupMember");
	}
	
	
	/**
	 * 新增专家提交
	 * @param activeUser
	 * @param aidEptGrpCustom
	 * @return
	 * @date 2019年1月11日 下午4:58:46
	 */
	@RequestMapping("/addExpertGroupMemberSubmit")
	@ResponseBody
	public SubmitResultInfo addExpertGroupMemberSubmit(ActiveUser activeUser,AidEptGrpCustom aidEptGrpCustom){

		aidEptGrpCustom.setCrtUsr(activeUser.getUsrno());
		
		ResultInfo resultInfo = ondutyService.addExpertGroupMemberSubmit(aidEptGrpCustom);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 跳转修改专家页面
	 * @param model
	 * @return
	 * @throws Exception
	 * @date 2019年1月11日 下午5:12:17
	 */
	@RequestMapping("/toUpdateExpertGroupMemberPage")
	public String toUpdateExpertGroupMemberPage(Model model) throws Exception{
		return View.toEDPC("/expertGroup/updateExpertMemberGroup");
	}
	
	/**
	 * 修改专家组成员提交
	 * @param activeUser
	 * @param aidEptGrpCustom
	 * @return
	 * @date 2019年1月11日 下午5:11:47
	 */
	@RequestMapping("/updateExpertGroupMemberSubmit")
	@ResponseBody
	public SubmitResultInfo updateExpertGroupMemberSubmit(ActiveUser activeUser,AidEptGrpCustom aidEptGrpCustom){

		aidEptGrpCustom.setCrtUsr(activeUser.getUsrno());
		
		ResultInfo resultInfo = ondutyService.updateExpertGroupMemberSubmit(aidEptGrpCustom);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除专家组成员提交
	 * @param aidEptGrpCustom
	 * @return
	 * @date 2019年1月11日 下午5:15:02
	 */
	@RequestMapping("/deleteExpertGroupMemberSubmit")
	@ResponseBody
	public SubmitResultInfo deleteExpertGroupMemberSubmit(AidEptGrpCustom aidEptGrpCustom){
		
		ResultInfo resultInfo = ondutyService.deleteExpertGroupMemberSubmit(aidEptGrpCustom);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	
	

}
