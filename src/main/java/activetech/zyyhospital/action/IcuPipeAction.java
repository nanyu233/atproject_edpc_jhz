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

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.zyyhospital.pojo.dto.IcuPipeInfoCustom;
import activetech.zyyhospital.pojo.dto.IcuPipeInfoQueryDto;
import activetech.zyyhospital.service.IcuPipeInfoService;

@Controller
@RequestMapping("/icuPipe")
public class IcuPipeAction {
	@Autowired
	private IcuPipeInfoService icuPipeInfoService;
	@Autowired
	private SystemConfigService systemConfigService;

	/**
	 * 跳转管路信息页面
	 * @param model
	 * @param custNo
	 * @param moduleid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toIcuPipeInfo")
	public String toCustInfo(Model model,String emgSeq,String pagetype,String pageval,String moduleid) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("pagetype",pagetype);
		model.addAttribute("pageval", pageval);
		return "/hzszyyhospital/icuPipe/icuPipeInfo";
	}
	
	/**
	 * 跳转导管列表页面
	 * @param model
	 * @param custNo
	 * @param moduleid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toPipe")
	public String toPipeMain(Model model,String emgSeq) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/icuPipe/pipe";
	}
	
	/**
	 * 获取管路类型列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getPipeDictList")
	public @ResponseBody SubmitResultInfo getPipeInfoList() throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = new HashMap<>();
		List<Dstdictinfo> pipeDefList = systemConfigService.findDictinfoByType("PIPE_DEF");
		map.put("pipeDefList", pipeDefList);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	  * 查询管路管理列表
	 * @param icuPipeInfoQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querypipe_result")
	public @ResponseBody DataGridResultInfo querypipe_result(IcuPipeInfoQueryDto icuPipeInfoQueryDto, int page, int rows) throws Exception{
		int total = icuPipeInfoService.findPipeInfoCount(icuPipeInfoQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		icuPipeInfoQueryDto.setPageQuery(pageQuery);
		List<IcuPipeInfoCustom> list = icuPipeInfoService.findPipeInfoList(icuPipeInfoQueryDto);
		DataGridResultInfo resultInfo = new DataGridResultInfo();
		resultInfo.setRows(list);
		resultInfo.setTotal(total);
		return resultInfo;
	}
	
	/**
	 * 跳转导管修改页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toEditPipe")
	public String toEditPipe(Model model) throws Exception {
		return "/hzszyyhospital/icuPipe/editPipe";
	}
	
	/**
	 * 获取管路操作历史信息
	 * @param pipeSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findPipeInfoHis")
	public @ResponseBody DataGridResultInfo findPipeInfoHis(String pipeSeq) throws Exception{
		DataGridResultInfo resultInfo = new DataGridResultInfo();
		List<IcuPipeInfoCustom> hislist = icuPipeInfoService.findPipeInfoHis(pipeSeq);
		resultInfo.setTotal(hislist.size());
		resultInfo.setRows(hislist);
		return resultInfo;
	}
	
	/**
	 * 管路增加修改提交
	 * @param icuPipeInfoCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/mergePipeSubmit")
	public @ResponseBody SubmitResultInfo mergePipeSubmit(@RequestBody IcuPipeInfoQueryDto icuPipeInfoQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		String pipeSeq = icuPipeInfoService.savePipeSubmit(icuPipeInfoQueryDto,activeUser);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pipeSeq",pipeSeq);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 换管拔管提交
	 * @param icuPipeInfoQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editPipeSubmit")
	public @ResponseBody SubmitResultInfo editPipeSubmit(@RequestBody IcuPipeInfoQueryDto icuPipeInfoQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		icuPipeInfoService.editPipeSubmit(icuPipeInfoQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 管路管理删除
	 * @param pipeSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delpipeSubmit")
	public @ResponseBody SubmitResultInfo delpipeSubmit(String pipeSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		icuPipeInfoService.delpipeSubmit(pipeSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
