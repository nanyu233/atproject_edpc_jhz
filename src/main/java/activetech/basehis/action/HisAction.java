package activetech.basehis.action;

import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.basehis.pojo.domain.VHemsEmpi;
import activetech.basehis.pojo.dto.*;
import activetech.external.service.EsbService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.BeanUtil;
import activetech.util.DateUtil;
import activetech.util.HttpClientUtil;
import activetech.util.StringUtils;
import activetech.webService.WebServiceClient;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	private BaseHspemgInfService baseHspemgInfService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private EsbService esbService;


	/**
	 * 跳转入出转挂号信息页面
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

		//int total =oracleHisService.findvhemsjyjgcount(vHemsJyjgQueryDto);
		//List<VHemsJyjgCustom> list =oracleHisService.findvhemsjyjgList(vHemsJyjgQueryDto);
		List<VHemsJyjgCustom> list = esbService.findjyCategoriesList(vHemsJyjgQueryDto);

		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(list.size());
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
		//int total = oracleHisService.findvhemsjyjginfocount(vHemsJyjgQueryDto);
		int total = esbService.findvhemsjyjginfocount(vHemsJyjgQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		vHemsJyjgQueryDto.setPageQuery(pageQuery);
		//List<VHemsJyjgCustom> list =oracleHisService.findvhemsjyjginfoList(vHemsJyjgQueryDto);
		List<VHemsJyjgCustom> list =esbService.findvhemsjyjginfoList(vHemsJyjgQueryDto);
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
		//int total =oracleHisService.findvhemsjyjginfocount(vHemsJyjgQueryDto);
		//List<VHemsJyjgCustom> list =oracleHisService.findvhemsjyjginfoListqfy(vHemsJyjgQueryDto);
		int total = esbService.findvhemsjyjginfocount(vHemsJyjgQueryDto);
		List<VHemsJyjgCustom> list =esbService.findvhemsjyjginfoListWithNoPage(vHemsJyjgQueryDto);

		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}

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
		//List<VHemsJcjgCustom> list =sqlServerHisService.findVHemsJcjgList(vHemsJyjgQueryDto);
		List<VHemsJcjgCustom> list = esbService.findVHemsJcjgList(vHemsJyjgQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(list.size());
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}

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
			if(!BeanUtil.validated(hspCfxxInfoQueryDto.getHspCfxxInfoCustom().getVstCad())) {
				return dataGridResultInfo;
			}
		}
		List<HspCfxxInfoCustom> list =esbService.findCfxxLocalAndHISList(hspCfxxInfoQueryDto);
		//填充total
		dataGridResultInfo.setTotal(list.size());
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}


	private ResultInfo getPatientInf_jk(String cardNo) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String JKXM_IP = systemConfigService.findAppoptionByOptkey("JKXM_IP").getOptvalue();
		String url = JKXM_IP+"his/getPatientInfo.do";
		JSONObject param = new JSONObject();
		param.put("cardNo", cardNo);
		logger.info("患者信息请求："+param);
		String reVal = HttpClientUtil.doPostJson(url, param.toJSONString(),10*1000);
		logger.info("患者信息返回："+reVal);
		if(reVal != null){
			JSONObject dataObject = JSONObject.parseObject(reVal).getJSONObject("resultInfo");
			String code = dataObject.getString("code");
			if("200".equals(code)){
				JSONObject data = dataObject.getJSONObject("data");
				JSONObject sysdata = new JSONObject();
				sysdata.put("vHemsEmpi", data);
				resultInfo.setSysdata(sysdata);
			}else if(code != null) {
				String msg = dataObject.getString("msg");
				logger.info("患者信息报错："+msg);
			}
		}
		return resultInfo;
	}



}
