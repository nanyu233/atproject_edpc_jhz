package activetech.basehis.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
import activetech.basehems.service.BaseHspemgInfService;
import activetech.basehis.pojo.domain.VHemsEmpi;
import activetech.basehis.pojo.dto.HemshisDto;
import activetech.basehis.pojo.dto.VHemsGhlbCustom;
import activetech.basehis.pojo.dto.VHemsGhlbQueryDto;
import activetech.basehis.pojo.dto.VHemsRczCustom;
import activetech.basehis.pojo.dto.VHemsSfxxCustom;
import activetech.basehis.pojo.dto.VHemsSfxxDto;
import activetech.basehis.service.OracleHisService;
import activetech.basehis.service.SqlServerHisService;
import activetech.external.pojo.dto.VHemsJcjgCustom;
import activetech.external.pojo.dto.VHemsJyjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.util.BeanUtil;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.websocket.action.WebSocketHz;

/**
 * 
 * Title:Oracle对接公用Controller
 * Description:
 * activetech
 * @author chenkb
 * @date 2018-3-28
 * 
 */
@Controller
@RequestMapping("/his")
public class HisAction {
	private static Logger logger = Logger.getLogger(HisAction.class);

	@Autowired
	private OracleHisService oracleHisService;
	@Autowired
	private SqlServerHisService sqlServerHisService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private WebSocketHz webSocketHz;
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;
	/////////////////////////////////患者信息//////////////////////////////////////
	/**
	 * 预检页-查询患者信息-HIS
	 * 
	 * @param
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getPatientInf")
	public @ResponseBody
	SubmitResultInfo getPatientInf(String cardNo,String cardType,String trackData) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		VHemsEmpi vHemsEmpi = oracleHisService.findvHemsEmpi(cardNo, cardType, trackData);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("vHemsEmpi", vHemsEmpi);
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/////////////////////////////////检验信息//////////////////////////////////////
	/**
	 * 检验信息结果集
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryexamine_result")
	public @ResponseBody DataGridResultInfo queryexamine_result(Model mode, 
			                VHemsJyjgQueryDto vHemsJyjgQueryDto,
							String sort,
							String order
		) throws Exception{
		//首次查询时默认赋值系统当天日期
		if(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate());
			vHemsJyjgQueryDto.getvHemsJyjgCustom().setEnddate(endDate);
		}
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			vHemsJyjgQueryDto.setSort("resultDateTime");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			vHemsJyjgQueryDto.setOrder("asc");
		}
		
		int total =oracleHisService.findvhemsjyjgcount(vHemsJyjgQueryDto);	
		List<VHemsJyjgCustom> list =oracleHisService.findvhemsjyjgList(vHemsJyjgQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 检验信息详细结果集
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryexamineinfo_result")
	public @ResponseBody DataGridResultInfo queryexamineinfo_result(Model mode, 
			                VHemsJyjgQueryDto vHemsJyjgQueryDto,
							int page,//当前页码
							int rows//每页显示个数
		) throws Exception{
		//首次查询时默认赋值系统当天日期
		if(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate());
			vHemsJyjgQueryDto.getvHemsJyjgCustom().setEnddate(endDate);
		}
		int total =oracleHisService.findvhemsjyjginfocount(vHemsJyjgQueryDto);	
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		vHemsJyjgQueryDto.setPageQuery(pageQuery);
		List<VHemsJyjgCustom> list =oracleHisService.findvhemsjyjginfoList(vHemsJyjgQueryDto);
	
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 检验信息详细结果集去分页
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryexamineinfoqfy_result")
	public @ResponseBody DataGridResultInfo queryexamineinfoqfy_result(Model mode, 
			                VHemsJyjgQueryDto vHemsJyjgQueryDto
		) throws Exception{
		//首次查询时默认赋值系统当天日期
		if(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate());
			vHemsJyjgQueryDto.getvHemsJyjgCustom().setEnddate(endDate);
		}
		int total =oracleHisService.findvhemsjyjginfocount(vHemsJyjgQueryDto);	
		List<VHemsJyjgCustom> list =oracleHisService.findvhemsjyjginfoListqfy(vHemsJyjgQueryDto);
	
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}

	
	/**
	 * ajax获取检验信息打印(新)
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/ajaxexaminenew")
	public @ResponseBody SubmitResultInfo ajaxexaminenew(VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		List<VHemsJyjgCustom> list =oracleHisService.findvhemsjyjginfoListajaxnew(vHemsJyjgQueryDto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/////////////////////////////////挂号信息//////////////////////////////////////
	/**
	 * 获取已挂号列表
	 * @param vHemsGhlbCustomDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryregisteredlist")
	public @ResponseBody DataGridResultInfo querybed_result(VHemsGhlbQueryDto vHemsGhlbQueryDto,
			int page,int rows) throws Exception{
		vHemsGhlbQueryDto = vHemsGhlbQueryDto!=null? vHemsGhlbQueryDto:new VHemsGhlbQueryDto();
		int total = oracleHisService.getRegisteredCount(vHemsGhlbQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		vHemsGhlbQueryDto.setPageQuery(pageQuery);
		List<VHemsGhlbCustom> list = oracleHisService.getRegisteredList(vHemsGhlbQueryDto);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	
	/**
	 * 获取检验信息
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/ajaxjyinfo")
	public @ResponseBody List<VHemsJyjgCustom> ajaxjyinfo(VHemsJyjgQueryDto vHemsJyjgQueryDto)throws Exception{
		List<VHemsJyjgCustom> list =oracleHisService.findvhemsjyjgList(vHemsJyjgQueryDto);
		return list;
	}
	
	
	/////////////////////////////////检查信息//////////////////////////////////////
	/**
	 * 检查报告结果集
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjcbg_result")
	public @ResponseBody DataGridResultInfo queryjcbg_result( 
			                VHemsJyjgQueryDto vHemsJyjgQueryDto,
							String sort,
							String order
		) throws Exception{
		//首次查询时默认赋值系统当天日期
		if(vHemsJyjgQueryDto.getvHemsJcjgCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getvHemsJcjgCustom().getEnddate());
			vHemsJyjgQueryDto.getvHemsJcjgCustom().setEnddate(endDate);
		}
		List<VHemsJcjgCustom> list =sqlServerHisService.findVHemsJcjgList(vHemsJyjgQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(list.size());
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 获取检查信息
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/ajaxjcinfo")
	public @ResponseBody List<VHemsJcjgCustom> ajaxjcinfo(VHemsJyjgQueryDto vHemsJyjgQueryDto)throws Exception{
		List<VHemsJcjgCustom> list =sqlServerHisService.findVHemsJcjgList(vHemsJyjgQueryDto);
		return list;
	}
	
	
	/////////////////////////////////医嘱信息//////////////////////////////////////
	/**
	 * 医嘱结果集
	 * @param model
	 * @param HspCfxxInfoQueryDto
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/querycfxx_result")
	public  DataGridResultInfo querycfxx_result(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		if(null != hspCfxxInfoQueryDto.getHspCfxxInfoCustom()) {
			if(!BeanUtil.validated(hspCfxxInfoQueryDto.getHspCfxxInfoCustom().getMpi())) {
				return dataGridResultInfo;
			}
		}
		List<HspCfxxInfoCustom> list =oracleHisService.findCfxxLocalAndHISList(hspCfxxInfoQueryDto);	
		//填充total
		dataGridResultInfo.setTotal(list.size());
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/////////////////////////////////收费信息//////////////////////////////////////

	@RequestMapping(value = "/sfjl")
	public String getSfjlList(String vstCad, Date emgDat, Model model,
			String emgSeq) {
		model.addAttribute("vstCad", vstCad);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("emgDat",
				DateUtil.formatDateByFormat(emgDat, "yyyy/MM/dd"));
		
		HspemginfCustom  hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
		model.addAttribute("cyrqDat",DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
		return "/hzszyyhospital/hzszyynurse/his/sfjl";
	}
	
	/**
	 * 查询患者收费信息-HIS
	 * 
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/querySfmx_result", method = RequestMethod.POST)
	public @ResponseBody DataGridResultInfo querySfmx_result(VHemsSfxxDto vHemsSfxxDto) {
		//首次查询时默认赋值系统当天日期
		if(vHemsSfxxDto.getvHemsSfxxCustom().getEndDate() != null){
			Date endDate = DateUtil.getNextDay(vHemsSfxxDto.getvHemsSfxxCustom().getEndDate());
			vHemsSfxxDto.getvHemsSfxxCustom().setEndDate(endDate);
		}
		List<VHemsSfxxCustom> list = oracleHisService.getVHemsSfxxList(vHemsSfxxDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(list.size());
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
		
	}
	
	
	/////////////////////////////////候诊超时//////////////////////////////////////
	/**
	 * 候诊超时列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toOutime")
	public String jzjl(Model model, String moduleid) throws Exception{
		//将页面所需数据取出传到页面
		List<Dstdictinfo> stateList = systemConfigService.findDictinfoByType("CST_DSP_COD");
		model.addAttribute("stateList", stateList);
		model.addAttribute("moduleid", moduleid);
		return "/hospital/nurse/queryOutime";
	}
	
	/**
	 * 查询候诊超时列表
	 * @param hemshisDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryOutime")
	public @ResponseBody
	DataGridResultInfo getOutTime(HemshisDto hemshisDto, int page, int rows) throws Exception {
		Map<String, Object> map = oracleHisService.findOutTimeList(hemshisDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<HspemginfCustom> list = (List<HspemginfCustom>) map.remove("hspemginfCustomList");
		//填充total
		dataGridResultInfo.setTotal(list.size());
		//list分页
		list = list.stream().skip((page-1) * rows).limit(rows).collect(Collectors.toList());
		//填充rows
		dataGridResultInfo.setRows(list);
		if("1".equals(hemshisDto.getQueryFlag())) {
			webSocketHz.sendMessageToAllAwaiting(map);
		}
		return dataGridResultInfo;
	}
	
	@RequestMapping("/cleanListHz")
	public @ResponseBody SubmitResultInfo cleanListHz(@RequestBody HemshisDto hemshisDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		oracleHisService.updateCleanListHz(hemshisDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转移除候诊列表
	 * @param hemshisDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/forwardCleanHz")
	public String forwardCleanHz() throws Exception{
		return "/hospital/nurse/cleanHz";
	}
	
	/**
	 * 跳转入出转挂号信息页面
	 * @param hemshisDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toRczGhxx")
	public String toRczGhxx(Model model,String emgSeq,String mpi,String jzxhOld,String cstNam) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("mpi", mpi);
		model.addAttribute("jzxhOld", jzxhOld);
		model.addAttribute("cstNam", cstNam);
		return "/hzszyyhospital/hzszyynurse/precheckPage/boxPage/ghbdBox";
	}
	
	@RequestMapping("/findRczGhxx")
	public @ResponseBody
	DataGridResultInfo findRczGhxx(HemshisDto hemshisDto,int page,
			int rows) throws Exception {
		hemshisDto.setEnddate(DateUtil.getNextDay(hemshisDto.getEnddate()));
		int total =oracleHisService.findRczGhxxCount(hemshisDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hemshisDto.setPageQuery(pageQuery);
		List<VHemsRczCustom> vHemsRczCustomList =  oracleHisService.findRczGhxx(hemshisDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(vHemsRczCustomList);
		return dataGridResultInfo;
	}
	
}
