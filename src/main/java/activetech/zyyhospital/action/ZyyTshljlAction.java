package activetech.zyyhospital.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.domain.HspJxtqhljldInf;
import activetech.zyyhospital.pojo.domain.HspXwhljldInf;
import activetech.zyyhospital.pojo.dto.HspJxtqhljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspXwhljldInfCustom;
import activetech.zyyhospital.pojo.dto.ZyyTshljlQueryDto;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyTshljlService;

/**
 * 
 * <p>Title:ZyyTshljlAction</p>
 * <p>Description:特殊护理记录单</p>
 * @author wzl
 * @date 2020年07月23日
 *
 */
@Controller
@RequestMapping("/zyytshljld")
public class ZyyTshljlAction {
	
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	
	@Autowired
	private ZyyTshljlService zyyTshljlService;

	/**
	 * 跳转洗胃护理记录单列表
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toXwList")
	public String toXwList(Model model,String emgSeq,String moduleid) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyyxtpg/xtpg/xwHljl/xwList";
	}
	
	/**
	 * 新增/修改洗胃护理记录单跳转
	 *@param model
	 *@param emgSeq
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toEditXwhljld")
	public String toEditXwhljld(Model model,String emgSeq,String xwhiSeq) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("xwhiSeq", xwhiSeq);
		return "/hzszyyhospital/hzszyyxtpg/xtpg/xwHljl/updateXw";
	}
	
	/**
	 * ajax根据xwhiSeq查询洗胃护理记录单数据
	 *@param xwhiSeq
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/findXwhljldByXwhiSeq")
	public @ResponseBody SubmitResultInfo findXwhljldByXwhiSeq(String xwhiSeq,String emgSeq) throws Exception{
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        //获取洗胃护理记录单信息
        HspXwhljldInf hspXwhljldInf =zyyTshljlService.findXwhljldByXwhiSeq(xwhiSeq);
        //获取预检数据
        HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);		
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hspXwhljldInf", hspXwhljldInf);
        map.put("hspemginfCustom", hspemginfCustom);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取洗胃护理记录单列表
	 * @param zyyTshljlQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/queryXwhljld_result")
	public DataGridResultInfo queryXwhljld_result(ZyyTshljlQueryDto zyyTshljlQueryDto, int page, int rows) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		zyyTshljlQueryDto = zyyTshljlQueryDto!=null?zyyTshljlQueryDto:new ZyyTshljlQueryDto();
		//查询列表的总数
		int total = zyyTshljlService.findXwhljldCount(zyyTshljlQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		zyyTshljlQueryDto.setPageQuery(pageQuery);
		List<HspXwhljldInfCustom> list = zyyTshljlService.findXwhljldList(zyyTshljlQueryDto);
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 查询洗胃病情护理记录单打印信息
	 * @param zyyTshljlQueryDto
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/findXwhljldPrint")
	public DataGridResultInfo findXwhljldPrint(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		zyyTshljlQueryDto = zyyTshljlQueryDto!=null?zyyTshljlQueryDto:new ZyyTshljlQueryDto();
		List<HspXwhljldInfCustom> list = zyyTshljlService.findXwhljldList(zyyTshljlQueryDto);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 洗胃护理记录单新增或修改提交
	 *@param zyyTshljlQueryDto
	 *@param activeuser
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/editXwhljldSubmit")
	public @ResponseBody SubmitResultInfo editXwhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto,ActiveUser activeuser
			) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);		
		zyyTshljlService.editXwhljldSubmit(zyyTshljlQueryDto,activeuser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 洗胃护理记录单删除
	 *@param zyyTshljlQueryDto
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/deleteXwhljldSubmit")
	public @ResponseBody SubmitResultInfo deleteXwhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);		
		zyyTshljlService.deleteXwhljldSubmit(zyyTshljlQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转机械通气护理记录单列表
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toJxtqList")
	public String toJxtqList(Model model,String emgSeq,String moduleid) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyynote/querynote";
	}
	
	/**
	 * 新增机械通气护理记录单跳转
	 *@param model
	 *@param emgSeq
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toAddJxtqhljld")
	public String toAddJxtqhljld(Model model,String emgSeq) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/hzszyynote/querynote";
	}
	
	/**
	 * 修改机械通气护理记录单跳转
	 *@param model
	 *@param emgSeq
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toEditJxtqhljld")
	public String toEditJxtqhljld(Model model,String jxtqSeq) throws Exception{
		model.addAttribute("jxtqSeq", jxtqSeq);
		return "/hzszyyhospital/hzszyynote/querynote";
	}
	
	/**
	 * ajax根据jxtqSeq查询机械通气护理记录单数据
	 *@param jxtqSeq
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/findJxtqhljldByJxtqSeq")
	public @ResponseBody SubmitResultInfo findJxtqhljldByJxtqSeq(String jxtqSeq) throws Exception{
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        //获取机械通气护理记录单信息
        HspJxtqhljldInf hspJxtqhljldInf = zyyTshljlService.findJxtqhljldByJxtqSeq(jxtqSeq);	
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hspJxtqhljldInf", hspJxtqhljldInf);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取机械通气护理记录单列表
	 * @param zyyTshljlQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/queryJxtqhljld_result")
	public DataGridResultInfo queryJxtqhljld_result(ZyyTshljlQueryDto zyyTshljlQueryDto, int page, int rows) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		zyyTshljlQueryDto = zyyTshljlQueryDto!=null?zyyTshljlQueryDto:new ZyyTshljlQueryDto();
		//查询列表的总数
		int total = zyyTshljlService.findJxtqhljldCount(zyyTshljlQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		zyyTshljlQueryDto.setPageQuery(pageQuery);
		List<HspJxtqhljldInfCustom> list = zyyTshljlService.findJxtqhljldList(zyyTshljlQueryDto);
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 查询机械通气病情护理记录单打印信息
	 * @param zyyTshljlQueryDto
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/findJxtqhljldPrint")
	public DataGridResultInfo findJxtqhljldPrint(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		zyyTshljlQueryDto = zyyTshljlQueryDto!=null?zyyTshljlQueryDto:new ZyyTshljlQueryDto();
		List<HspJxtqhljldInfCustom> list = zyyTshljlService.findJxtqhljldList(zyyTshljlQueryDto);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 机械通气护理记录单新增或修改提交
	 *@param zyyTshljlQueryDto
	 *@param activeuser
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/editJxtqhljldSubmit")
	public @ResponseBody SubmitResultInfo editJxtqhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto,ActiveUser activeuser
			) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);		
		zyyTshljlService.editJxtqhljldSubmit(zyyTshljlQueryDto,activeuser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 机械通气护理记录单删除
	 *@param zyyTshljlQueryDto
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/deleteJxtqhljldSubmit")
	public @ResponseBody SubmitResultInfo deleteJxtqhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);		
		zyyTshljlService.deleteJxtqhljldSubmit(zyyTshljlQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
