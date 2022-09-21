package activetech.hospital.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.HspCbyxglInfCustom;
import activetech.base.pojo.dto.HspCbyxglInfQueryDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.hospital.service.HspFavoriteInfService;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.pojo.domain.HspFavoritesInf;
import activetech.zyyhospital.pojo.dto.HspDzblDictCustom;
import activetech.zyyhospital.pojo.dto.HspDzblDictDto;
import activetech.zyyhospital.pojo.dto.HspFavoritesInfCustom;
import activetech.zyyhospital.pojo.dto.HspFavoritesInfCustomDto;

@Controller
@RequestMapping("/favorite")
public class FavoriteAction {
	@Autowired
	private HspFavoriteInfService hspFavoriteInfService;
	@Autowired
	private SystemConfigService systemConfigService;

	/**
	 * 跳转知识库弹出框
	 * @idName 双击点击时的id @tempSeo 模板号 @typeFrm 哪个父层iframe @emgSeq 检验检查需要传值 @isCheckSource 是否选中检验面板
	 * @param [{string}] isImportTemp [是否从病历导入我的模板进去]
	 * @return
	 */
	@RequestMapping(value = "/toKnowledgeBase")
    public String toKnowledgeBase(Model model, String idName, String tempSeo, String typeFrm, String emgSeq, String isCheckSource, String isImportTemp) {
		model.addAttribute("idName", idName);
		model.addAttribute("tempSeo", tempSeo);
		model.addAttribute("typeFrm", typeFrm);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("isCheckSource", isCheckSource);
		model.addAttribute("isImportTemp", isImportTemp);
		return "/hzszyyhospital/hzszyydoctor/knowledgeBox/knowledgeBox";
	}
	
	/**
	 * 跳转知识库管理列表
	 * @return
	 */
	@RequestMapping("/toBlzskgl")
	public String toBlzskgl(Model model, String moduleid)throws Exception{
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("scTypeList",systemConfigService.findDictinfoByType("SCTYPE"));
		return "/base/blzskgl/queryBlzskgl";
	}
	
	/**
	 * 跳转知识库管理添加页面
	 * @return
	 */
	@RequestMapping("/toAdd")
	public String toAdd(Model model, String moduleid)throws Exception{
		model.addAttribute("scTypeList",systemConfigService.findDictinfoByType("SCTYPE"));
		return "/base/blzskgl/addblzsk";
	}
	
	/**
	 * 跳转知识库管理修改页面
	 * @return
	 */
	@RequestMapping("/toUpdate")
	public String toUpdate(Model model, String seqno)throws Exception{
		HspFavoritesInf hspFavoritesInf = hspFavoriteInfService.findHspFavoritesInfBySeqno(seqno);
		model.addAttribute("scTypeList",systemConfigService.findDictinfoByType("SCTYPE"));
		model.addAttribute("hspFavoritesInf",hspFavoritesInf);
		return "/base/blzskgl/updateblzsk";
	}
	
	/**
	 * 查询知识库列表数据
	 * @param hspLqbljlQueryDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findHspFavoritesInfList")
	public Map<String, Object> findHspFavoritesInfList(@RequestBody HspFavoritesInfCustomDto hspFavoritesInfCustomDto) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<HspFavoritesInfCustom> hspFavoritesInfList = hspFavoriteInfService.findHspFavoritesInfList(hspFavoritesInfCustomDto);
		map.put("scTypeList",systemConfigService.findDictinfoByType("SCTYPE"));
		map.put("hspFavoritesInfList",hspFavoritesInfList);
		return map;
	}
	
	/**
	 * 添加或修改知识库提交
	 * @param hspFavoritesInfCustom
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editFavoritesSubmit")
	public @ResponseBody SubmitResultInfo editFavoritesSubmit(HspFavoritesInfCustomDto hspFavoritesInfCustomDto,ActiveUser activeuser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspFavoriteInfService.editFavoritesSubmit(hspFavoritesInfCustomDto.getHspFavoritesInfCustom(), activeuser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除收藏提交
	 * @param hspFavoritesInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delFavoritessubmit")
	public @ResponseBody SubmitResultInfo delFavoritessubmit(HspFavoritesInfCustomDto hspFavoritesInfCustomDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspFavoriteInfService.delHspFavoritesInf(hspFavoritesInfCustomDto.getHspFavoritesInfCustom());
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 查询知识库列表（分页）
	 * @param hspLqbljlQueryDto
	 * @return
	 */
	@RequestMapping("/findHspFavoritesInfListFy")
	public @ResponseBody DataGridResultInfo findHspFavoritesInfListFy(HspFavoritesInfCustomDto hspFavoritesInfCustomDto,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception {
		hspFavoritesInfCustomDto = hspFavoritesInfCustomDto != null ? hspFavoritesInfCustomDto:new HspFavoritesInfCustomDto();
		int total = hspFavoriteInfService.findHspFavoritesInfListCount(hspFavoritesInfCustomDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspFavoritesInfCustomDto.setPageQuery(pageQuery);
		List<HspFavoritesInfCustom> hspFavoritesInfList = hspFavoriteInfService.findHspFavoritesInfListFy(hspFavoritesInfCustomDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(hspFavoritesInfList);		
		return dataGridResultInfo;
	}
	
	/**
	 * 查询知识库模板
	 * @param hspDzblDictDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findDictList")
	public DataGridResultInfo findDictList(HspDzblDictDto hspDzblDictDto,ActiveUser activeUser) throws Exception {
		List<HspDzblDictCustom> hspDzblDictList;
		if(hspDzblDictDto.getHspDzblDictCustom() != null && !"".equals(hspDzblDictDto.getHspDzblDictCustom())){
			hspDzblDictDto.getHspDzblDictCustom().setMbCrtUser(activeUser.getUsrno());
			hspDzblDictList = hspFavoriteInfService.findhspDzblDictList(hspDzblDictDto);
		}else{
			hspDzblDictList = hspFavoriteInfService.findAllDict();
		}
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		//填充rows
		dataGridResultInfo.setRows(hspDzblDictList);		
		return dataGridResultInfo;
	}
	
	/**
	 * 添加或修改知识库模板提交
	 * @param hspDzblDictCustom
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/editDictListSubmit")
	public SubmitResultInfo editDictListSubmit(@RequestBody HspDzblDictDto hspDzblDictDto,ActiveUser activeuser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspFavoriteInfService.editDictListSubmit(hspDzblDictDto, activeuser);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 删除知识库模板提交
	 * @param hspDzblDictDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delDictListsubmit")
	public @ResponseBody SubmitResultInfo delDictListsubmit(HspDzblDictDto hspDzblDictDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspFavoriteInfService.delHspDictList(hspDzblDictDto.getHspDzblDictCustom());
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
