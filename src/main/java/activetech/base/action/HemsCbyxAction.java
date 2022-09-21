package activetech.base.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.HspCbyxgl;
import activetech.base.pojo.dto.HspCbyxglInfCustom;
import activetech.base.pojo.dto.HspCbyxglInfQueryDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.CompctlService;
import activetech.base.service.HspCbyxglService;
import activetech.base.service.SystemConfigService;

@Controller
@RequestMapping("/firstimp")
public class HemsCbyxAction {
	@Autowired
	private HspCbyxglService hspCbyxglService;
	@Autowired
	private CompctlService compctlService;
	@Autowired
	private SystemConfigService systemConfigService;
	@RequestMapping("/queryfirstimp")
	public String queryHspJbzd(Model model, String moduleid)throws Exception{
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);
		model.addAttribute("moduleid", moduleid);
		return "/base/cbyxgl/queryCbyxgl";
	}
	
	@RequestMapping("/queryCbyxgl_result")
	public @ResponseBody DataGridResultInfo findHspJbzd_result(HspCbyxglInfQueryDto hspCbyxglInfQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			)throws Exception{
		hspCbyxglInfQueryDto = hspCbyxglInfQueryDto!=null?hspCbyxglInfQueryDto:new HspCbyxglInfQueryDto();
		int total=hspCbyxglService.findHspCbyxglCount(hspCbyxglInfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspCbyxglInfQueryDto.setPageQuery(pageQuery);
		List<HspCbyxglInfCustom> list=hspCbyxglService.findHspCbyxglByCbyx(hspCbyxglInfQueryDto);
		if(hspCbyxglInfQueryDto.getHspCbyxglInfCustom()!=null&&hspCbyxglInfQueryDto.getHspCbyxglInfCustom().getPysm()!=""
				&&hspCbyxglInfQueryDto.getHspCbyxglInfCustom().getPysm()!=null){
			list=hspCbyxglService.findHspCbyxglByPysm(hspCbyxglInfQueryDto);
		}
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);		
		return dataGridResultInfo;
	}
	@RequestMapping("/toadd")
	public String toAdd(Model model)throws Exception{
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);
		// 查询分级列表与去向列表
		Map<String, String> params = new HashMap<String, String>(60);
		params.put("MOD_LVL_COD", "emgDepCodList");
		params.put("CST_DSP_COD", "cstDspCodList");
		Map<String, List<Dstdictinfo>> maps = systemConfigService.findDstdictinfos(params);
		model.addAttribute("chkLvlCodList", maps.get("emgDepCodList"));
		model.addAttribute("cstDspCodList", maps.get("cstDspCodList"));
		return "/base/cbyxgl/addcbyx";
	}
	
	@RequestMapping("/addcbyx")
	public @ResponseBody SubmitResultInfo addHspJbzd(HspCbyxglInfQueryDto HspCbyxglInfQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspCbyxglService.addHspCbyxgl(HspCbyxglInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@RequestMapping("/toupdate")
	public String toUpdate(HspCbyxglInfQueryDto hspCbyxglInfQueryDto,Model model)throws Exception{
		HspCbyxgl hspCbyxgl=hspCbyxglService.findById(hspCbyxglInfQueryDto);
		model.addAttribute("hspCbyxgl", hspCbyxgl);
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);
		// 查询分级列表与去向列表
		Map<String, String> params = new HashMap<String, String>(60);
		params.put("MOD_LVL_COD", "emgDepCodList");
		params.put("CST_DSP_COD", "cstDspCodList");
		Map<String, List<Dstdictinfo>> maps = systemConfigService.findDstdictinfos(params);
		model.addAttribute("chkLvlCodList", maps.get("emgDepCodList"));
		model.addAttribute("cstDspCodList", maps.get("cstDspCodList"));
		return "/base/cbyxgl/updatehspcbyx";
	}
	
	@RequestMapping("/updatehspcbyx")
	public @ResponseBody SubmitResultInfo updateHspJbzd(HspCbyxglInfQueryDto hspCbyxglInfQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspCbyxglService.updateHspCbyxgl(hspCbyxglInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@RequestMapping("/deletehspcbyx")
	public @ResponseBody SubmitResultInfo deleteHspJbzd(HspCbyxglInfCustom hspCbyxglInfCustom)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspCbyxglService.deleteHspCbyxglById(hspCbyxglInfCustom.getId());
		return ResultUtil.createSubmitResult(resultInfo);
	}
	@RequestMapping("/queryCbyxgl_resultLike")
	public @ResponseBody DataGridResultInfo findHspJbzd_result(HspCbyxglInfQueryDto hspCbyxglInfQueryDto)throws Exception{
		List<HspCbyxglInfCustom> list=null;
		if(hspCbyxglInfQueryDto.getHspCbyxglInfCustom()!=null&&hspCbyxglInfQueryDto.getHspCbyxglInfCustom().getPysm()!=""
				&&hspCbyxglInfQueryDto.getHspCbyxglInfCustom().getPysm()!=null){
			list=hspCbyxglService.findHspCbyxglByPysm(hspCbyxglInfQueryDto);
		}
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转知识库界面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toZsk")
	public String toZsk(Model model)throws Exception{
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);
		return "/base/cbyxgl/queryzsk";
	}
	
	@RequestMapping("/queryZsk_result")
	public @ResponseBody DataGridResultInfo queryZsk_result(HspCbyxglInfQueryDto hspCbyxglInfQueryDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order)throws Exception{

		hspCbyxglInfQueryDto = hspCbyxglInfQueryDto!=null?hspCbyxglInfQueryDto:new HspCbyxglInfQueryDto();
		int total =hspCbyxglService.queryZsk_resultCount(hspCbyxglInfQueryDto);
		
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspCbyxglInfQueryDto.setPageQuery(pageQuery);
		List<HspCbyxglInfCustom> list = hspCbyxglService.queryZsk_result(hspCbyxglInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
		
	}

}
