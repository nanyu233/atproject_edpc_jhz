package activetech.hospital.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.process.result.TreeGridResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.hospital.pojo.dto.HspHealtheduInfCustom;
import activetech.hospital.pojo.dto.HspHealtheduInfQueryDto;
import activetech.hospital.pojo.dto.HspHealtheduItemCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.service.HspHealthEducateService;
import activetech.util.StringUtils;

@Controller
@RequestMapping("/healthedu")
public class HealthEducateAction {
	@Autowired
	private HspHealthEducateService hspHealthEducateService;
	@Autowired
	private SystemConfigService systemConfigService;
	
	private String startDat=null;
	private String endDat=null;
	/**
	 * 跳转健康教育项目
	 * @param model
	 * @param emgSeq
	 * @return
	 */
	@RequestMapping("/queryhealtheducate")
	public String queryhealtheducate(Model model,String emgSeq,String startDat,String endDat){
		model.addAttribute("emgSeq", emgSeq);
		this.startDat=startDat;
		this.endDat=endDat;
		return "/hospital/healtheducate/healtheducate";
	}
	/**
	 * 病人列表
	 * @param hspemginfQueryDto
	 * @return
	 */
	@RequestMapping("/findEmgListInQjs")
	public @ResponseBody DataGridResultInfo findEmgListInQjs(String emgSeq){
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		HspHealtheduInfCustom hspHealtheduInfCustom=new HspHealtheduInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq))
			hspHealtheduInfCustom.setEmgSeq(emgSeq);
		
		HspHealtheduInfQueryDto hspHealtheduQueryDto=new HspHealtheduInfQueryDto();
		hspHealtheduQueryDto.setHspHealtheduInfCustom(hspHealtheduInfCustom);
		hspHealtheduQueryDto.setStartdate(startDat);
		hspHealtheduQueryDto.setEnddate(endDat);
		List<HspemginfCustom> list=hspHealthEducateService.findEmgListInQjs(hspHealtheduQueryDto);
		dataGridResultInfo.setTotal(list.size());
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 病人健康项目列表
	 * @param hspHealtheduQueryDto
	 * @return
	 */
	@RequestMapping("/queryhealtheducate_result")
	public @ResponseBody DataGridResultInfo findHealtheduListByEmgSeq(
			HspHealtheduInfQueryDto hspHealtheduQueryDto,
			String sort,
			String order){
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		hspHealtheduQueryDto = hspHealtheduQueryDto!=null?hspHealtheduQueryDto:new HspHealtheduInfQueryDto();
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspHealtheduQueryDto.setSort("eduDatStr");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspHealtheduQueryDto.setOrder("desc");
		}
		hspHealtheduQueryDto.setStartdate(startDat);
		hspHealtheduQueryDto.setEnddate(endDat);
		List<HspHealtheduInfCustom> list=hspHealthEducateService.findHealtheduListByEmgSeq(hspHealtheduQueryDto);
		dataGridResultInfo.setTotal(list.size());
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转新增健康教育项目
	 * @param model
	 * @param emgSeq
	 * @return
	 */
	@RequestMapping("/toaddhealtheducate")
	public String toAdd(Model model,String emgSeq){
		model.addAttribute("emgSeq", emgSeq);
		return "/hospital/healtheducate/addhealtheducate";
	}
	
	/**
	 * 保存病人健康教育项目信息
	 * @param hspHealtheduQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/healtheducate_submit")
	public @ResponseBody SubmitResultInfo healtheducate_submit(HspHealtheduInfQueryDto hspHealtheduQueryDto,
			ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspHealthEducateService.insertHealthEducate(hspHealtheduQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除健康教育项目记录
	 * @param eduSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/healtheducate_delete")
	public @ResponseBody SubmitResultInfo healtheducate_delete(String eduSeq)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspHealthEducateService.deleteHealthEducate(eduSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 健康教育项目树加载
	 * @param roleid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/loadHealthEducateTree")
	public @ResponseBody List<TreeNode> loadHealthEducateTree(HspHealtheduItemCustom hspHealtheduItemCustom)throws Exception{
		return hspHealthEducateService.loadHealthEducateTree(hspHealtheduItemCustom);
	}
	
	@RequestMapping("/findEducateList") 
	public @ResponseBody SubmitResultInfo findEducateList(String emgSeq)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, String> params = new HashMap<String, String>(20);
		params.put("EDUCATE_OBJ_COD", "eduObjList");
        params.put("EDUCATE_TIME_COD", "eduTimeList");
        params.put("EDUCATE_CONT_COD", "eduContList");
        params.put("EDUCATE_METHOD_COD", "eduMethodList");
        params.put("EDUCATE_RESULT_COD", "eduResList");
        
        Map<String, List<Dstdictinfo>> maps = systemConfigService.findDstdictinfos(params);
        
        Map<String, Object> map = new HashMap<String, Object>(70);
        map.putAll(maps);
        resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	//---------------------------健康教育项目维护----------------------------------
	/**
	 * 跳转健康教育项目列表
	 * @param model
	 * @return
	 */
	@RequestMapping("/queryHealthEduItem") 
	public String queryHealthEduItem(Model model,String moduleid){
		model.addAttribute("moduleid", moduleid);
		return "/hospital/healtheducate/queryHealthEduItem";
	}
	/**
	 * 健康教育项目树加载datagrid
	 * @param roleid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/loadHealthEducateTreeGrid")
	public @ResponseBody TreeGridResultInfo loadHealthEducateTreeGrid(ActiveUser activeUser,HspHealtheduInfQueryDto hspHealtheduInfQueryDto)throws Exception{
		TreeGridResultInfo treeGridResultInfo = new TreeGridResultInfo();
		List<HspHealtheduItemCustom> list=hspHealthEducateService.getItemsListTree(hspHealtheduInfQueryDto);
		treeGridResultInfo.setTotal(list.size());
		treeGridResultInfo.setRows(list);
		return treeGridResultInfo;
	}
	
	/**
	 * 跳转新增健康教育项目
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/addhealtheduItem") 
	public String addhealtheduItem(Model model,String parentno,String parentname) throws Exception{
		String itemno=systemConfigService.findSequences("HSPHEALTHEDUITEM_ITEMNO","6",null);
		model.addAttribute("itemno", itemno);
		model.addAttribute("parentno", parentno);
		model.addAttribute("parentname", parentname);
		List<Dstdictinfo> stateList = systemConfigService.findDictinfoByType("USERSTAT");
		model.addAttribute("stateList", stateList);
		return "/hospital/healtheducate/addhealtheduItem";
	}
	
	/**
	 * 删除健康教育项目信息
	 * @param hspHealtheduQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addhealtheduItem_submit")
	public @ResponseBody SubmitResultInfo addhealtheduItem_submit(HspHealtheduInfQueryDto hspHealtheduQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspHealthEducateService.insertHealthEduItem(hspHealtheduQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转新增健康教育项目
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/edithealtheduItem") 
	public String edithealtheduItem(Model model,String itemno) throws Exception{
		HspHealtheduItemCustom hspHealtheduItemCustom=hspHealthEducateService.findItemByItemNo(itemno);
		List<Dstdictinfo> stateList = systemConfigService.findDictinfoByType("USERSTAT");
		model.addAttribute("stateList", stateList);
		model.addAttribute("hspHealtheduItemCustom", hspHealtheduItemCustom);
		return "/hospital/healtheducate/edithealtheduItem";
	}
	
	/**
	 * 删除健康教育项目信息
	 * @param hspHealtheduQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/edithealtheduItem_submit")
	public @ResponseBody SubmitResultInfo edithealtheduItem_submit(HspHealtheduInfQueryDto hspHealtheduQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspHealthEducateService.editHealthEduItem(hspHealtheduQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除健康教育项目信息
	 * @param hspHealtheduQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletehealtheduItem")
	public @ResponseBody SubmitResultInfo deletehealtheduItem(String itemno)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspHealthEducateService.deleteHealthEduItem(itemno);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	

	/**
	 * 获取当前节点层数
	 * @param model
	 * @param 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getTreeNodeLevel")
	 public @ResponseBody int getTreeNodeLevel(String itemno) throws Exception{
		return hspHealthEducateService.getTreeLevel(itemno);
	}

}
