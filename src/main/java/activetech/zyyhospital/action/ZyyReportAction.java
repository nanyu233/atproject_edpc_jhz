package activetech.zyyhospital.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beust.jcommander.internal.Console;

import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.HighChartsDemoCustomDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.AjaxInfo;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.CompctlService;
import activetech.base.service.SystemConfigService;
import activetech.hospital.pojo.dto.HspBrbzCustom;
import activetech.hospital.pojo.dto.HspBrbzQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfQueryDto;
import activetech.util.DateUtil;
import activetech.util.ExcelExportSXXSSF;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.dto.HspBasyInfCustom;
import activetech.zyyhospital.pojo.dto.HspBasyInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsQueryDto;
import activetech.zyyhospital.pojo.dto.HspFrbrInfCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbQueryDto;
import activetech.zyyhospital.pojo.dto.HspOperateInfCustom;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyHspreportService;

@Controller
@RequestMapping("/zyyreport")
public class ZyyReportAction {
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private ZyyHspreportService zyyHspreportService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private CompctlService compctlService;
	
	/**
	 *急诊住院人数报表跳转(中医院)
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zjzyrs")
	public String zjzyrs(Model model) throws Exception{
		return "/hzszyyhospital/hzszyyreport/zjzyrs";
	}
	
	/**
	 * 跳转急诊患者诊断结果
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryzdjgtj")
	public String queryzdjgtj(Model model) throws Exception{
		return "/hzszyyhospital/hzszyyreport/queryzdjgtj";
	}
	
	/**
	 * 急诊患者预检信息统计结果导出
	 * @param hspCstInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportzdjgtj_result")
	public @ResponseBody SubmitResultInfo exportzdjgtj_result(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		hspemginfQueryDto.setSort("emgdat");
		hspemginfQueryDto.setOrder("desc");
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "zdjgtj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("收治日期");
		fieldNames.add("门诊号码");
		fieldNames.add("病人姓名");
		fieldNames.add("年龄");
		fieldNames.add("年龄单位");
		fieldNames.add("性别");
		fieldNames.add("到院方式");
		fieldNames.add("初步印象");
		fieldNames.add("急诊分级");
		fieldNames.add("首诊状态");
		fieldNames.add("转归");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("emgDatStr");
		fieldCodes.add("vstCad");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstAge");
		fieldCodes.add("cstAgeCod");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("arvChlCod");
		fieldCodes.add("preDgnCod");
		fieldCodes.add("emgDepCod");
		fieldCodes.add("cstDspCod");
		fieldCodes.add("cstDspCodNameNew");


		String hb="急诊患者预检信息统计报表";
		String gd="查询范围：";
			   gd += DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(),"yyyy/MM/dd")+"-"+
		            DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(),"yyyy/MM/dd");
			   gd = gd+" 选择：";
			   if(!StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getLqflag())){
				   gd = gd + "全部患者";
			   }else if(hspemginfQueryDto.getLqflag().equals("0")){
				   gd = gd + "留抢患者";
			   }
			   else if(hspemginfQueryDto.getLqflag().equals("1")){
				   gd = gd + "非留抢患者";
			   }
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
		hspemginfQueryDto.setEnddate(endDate);
		List<HspemginfCustom>  list =zyyHspemginfService.findHspemginfList(hspemginfQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"急诊患者预检信息统计报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 转院汇总统计列表跳转
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryzytj")
	public String queryzytj(Model model,String moduleid) throws Exception {
		// 将页面所需数据取出传到页面
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyyreport/zytjbb";
	}
	
	/**
	 * 转院患者明细列表
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryzhuan")
	public String queryzhuan(Model model, HspsqlinfQueryDto hspsqlinfQueryDto)throws Exception {
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);
		model.addAttribute("pageName",hspsqlinfQueryDto.getPageName());
		model.addAttribute("querytype",hspsqlinfQueryDto.getQuerytype());
		model.addAttribute("startdate", DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy/MM/dd"));
		model.addAttribute("enddate", DateUtil.formatDateByFormat(hspsqlinfQueryDto.getEnddate(), "yyyy/MM/dd"));
		return "/hospital/report/emergencyPatientList";
	}
	
	/**
	 * 急诊各级患者统计跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjzgjhzbl")
	public String queryjzgjhzbl(Model model) throws Exception{
		return "/hzszyyhospital/hzszyyreport/jzgjhzbl";
	}
	
	/**
	 * 跳转抢救措施统计图(中医院)
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/brbzxgtjt")
	public String brbzxgtjt(Model model) throws Exception{
		return "/hzszyyhospital/hzszyyreport/brbzxgtjt";
	}
	
	/**
	 * 跳转120到院统计图
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toDytj")
	public String toDytj(Model model) throws Exception{
		return "/hzszyyhospital/hzszyyreport/120dytj";
	}
	
	/**
	 * 120到院统计列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getDytjList")
	public @ResponseBody DataGridResultInfo getDytjList(HspemginfQueryDto hspemginfQueryDto)throws Exception{
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		List<HspemginfCustom> hspemginfCustomList = zyyHspreportService.getDytjList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(hspemginfCustomList);
		return dataGridResultInfo;
	}
	
	/**
	 * 120到院患者明细列表跳转
	 * @param hspemginfQueryDto
	 * @param tjfsType
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/dytjhzmx")
	public String bzhzlbmx(Model model, HspemginfQueryDto hspemginfQueryDto,String tjfsType) throws Exception {
		model.addAttribute("querytype",hspemginfQueryDto.getQuerytype());
		model.addAttribute("pageName",hspemginfQueryDto.getPageName());
		model.addAttribute("tjfsType",tjfsType);
		model.addAttribute("startdate", DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd"));
		model.addAttribute("enddate", DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(), "yyyy/MM/dd"));
		return "/hzszyyhospital/hzszyyreport/120dyhzmxList";
	}
	
	/**
	 * 120到院统计列表明细 
	 * @param hspemginfQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getdytjmx")
	public @ResponseBody DataGridResultInfo getdytjmx(
			HspemginfQueryDto hspemginfQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			)throws Exception{
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		//查询方式为驾驶员
		if("jsy".equals(hspemginfQueryDto.getQuerytype())) {
			hspemginfQueryDto.setQuerytype("ABN_DRIVER");
		//查询方式为120医生
		}else if("ys".equals(hspemginfQueryDto.getQuerytype())) {
			hspemginfQueryDto.setQuerytype("ABN_DOCTOR");
		}
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		int total = zyyHspreportService.findDytjmxCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list = zyyHspreportService.getfindDytjmxList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	
	/**
	 * 120到院统计图导出
	 * @param emgSeq
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping ("/exportDytjSubmit")
	public @ResponseBody SubmitResultInfo exportDytjSubmit(HspemginfQueryDto hspemginfQueryDto)throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		//导出文件的前缀
		String filePrefix = "120dytj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("时间");
		if("jsy".equals(hspemginfQueryDto.getQuerytype())) {
			fieldNames.add("驾驶员");
		}else if("ys".equals(hspemginfQueryDto.getQuerytype())) {
			fieldNames.add("120医生");
		}
		fieldNames.add("送入人数");
		fieldNames.add("住院人数");
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("querydate");
		fieldCodes.add("dytjName");
		fieldCodes.add("srcount");
		fieldCodes.add("zycount");
		//导出的数据通过service取出
		String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
		String endStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(), "yyyy/MM/dd");
		String hb = "120到院统计表";
		
		String gd = "查询时间：" + startStr + "至" + endStr;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		List<HspemginfCustom> hspemginfCustomList = zyyHspreportService.getDytjList(hspemginfQueryDto);
		//执行导出
		excelExportSXXSSF.writeDatasByObjectSy(hspemginfCustomList);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"120到院统计表",
						hspemginfCustomList.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 120到院统计患者列表导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/dytjhzlbExport")
	public  SubmitResultInfo dytjhzlbExport(HspemginfQueryDto hspemginfQueryDto) throws Exception {	
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		String querytype = hspemginfQueryDto.getQuerytype();
		//查询方式为驾驶员
		if("jsy".equals(querytype)) {
			hspemginfQueryDto.setQuerytype("ABN_DRIVER");
		//查询方式为120医生
		}else if("ys".equals(querytype)) {
			hspemginfQueryDto.setQuerytype("ABN_DOCTOR");
		}
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		List<HspemginfCustom> list = zyyHspreportService.getfindDytjmxList(hspemginfQueryDto);
		
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "dytjhzlb";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();		
		if("jsy".equals(querytype)) {
			fieldNames.add("驾驶员");
		}else if("ys".equals(querytype)) {
			fieldNames.add("120医生");
		}
		fieldNames.add("收治日期");
		fieldNames.add("病历号");
		fieldNames.add("病人姓名");
		fieldNames.add("性别");
		fieldNames.add("年龄");		
		fieldNames.add("急诊分级");
		fieldNames.add("首诊状态");
		fieldNames.add("分科");
		fieldNames.add("就诊时间");
		fieldNames.add("就诊次数");
		fieldNames.add("首诊医生");
		fieldNames.add("诊断");		
		fieldNames.add("转归去向");
		fieldNames.add("转归时间");
		if("jsy".equals(querytype)) {
			fieldNames.add("120医生");
		}else if("ys".equals(querytype)) {
			fieldNames.add("驾驶员");
		}
		fieldNames.add("绿通");
		fieldNames.add("分诊护士");	
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();		
		if("jsy".equals(querytype)) {
			fieldCodes.add("abnDriver");
		}else if("ys".equals(querytype)) {
			fieldCodes.add("abnDoctor");
		}
		fieldCodes.add("emgDatStr");
		fieldCodes.add("mpi");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("cstAge");
		fieldCodes.add("emgDepCod");
		fieldCodes.add("cstDspCod");
		fieldCodes.add("emgFkName");
		fieldCodes.add("docDatStr");
		fieldCodes.add("jzxh");
		fieldCodes.add("sqlDctNbr");
		fieldCodes.add("jbzdDes");
		fieldCodes.add("cstDspCodNameNew");
		fieldCodes.add("sqlDat");
		if("jsy".equals(querytype)) {
			fieldCodes.add("abnDoctor");
		}else if("ys".equals(querytype)) {
			fieldCodes.add("abnDriver");
		}
		fieldCodes.add("grnChl");
		fieldCodes.add("preUsrNam");
		
		String hb = "120到院统计患者明细列表";
		String gb = "查询范围: ";
		String startTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getStartdate(), "yyyy/MM/dd");
		String endTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getEnddate(), "yyyy/MM/dd");
		gb +=  startTime + "-" + endTime;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gb);		
		
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"120到院统计患者明细列表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 跳转病种及操作技术统计图
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/bzjczjstj")
	public String bzjczjstj(Model model) throws Exception{
		return "/hzszyyhospital/hzszyyreport/bzjczjstj";
	}
	
	/**
	 * 病种统计患者明细列表跳转
	 * @param hspemginfQueryDto
	 * @param List<String> scoIdArr
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/bzhzlbmx")
	public String bzhzlbmx(Model model, HspemginfQueryDto hspemginfQueryDto,@RequestParam("scoIdArr[]") List<String> scoIdArr) throws Exception {
		model.addAttribute("querytype",hspemginfQueryDto.getQuerytype());
		model.addAttribute("pageName",hspemginfQueryDto.getPageName());
		model.addAttribute("startdate", DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd"));
		model.addAttribute("enddate", DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(), "yyyy/MM/dd"));
		model.addAttribute("scoIdArr", scoIdArr);
		return "/hzszyyhospital/hzszyyreport/bzhzlbList";
	}
	
	/**
	 * 抢救措施患者明细列表跳转
	 * @param hspemginfQueryDto
	 * @param List<String> scoIdArr
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/qjcshzmx")
	public String qjcshzmx(Model model, HspemginfQueryDto hspemginfQueryDto,@RequestParam("scoIdArr[]") List<String> scoIdArr) throws Exception {
		model.addAttribute("querytype",hspemginfQueryDto.getQuerytype());
		model.addAttribute("pageName",hspemginfQueryDto.getPageName());
		model.addAttribute("startdate", DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd"));
		model.addAttribute("enddate", DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(), "yyyy/MM/dd"));
		model.addAttribute("scoIdArr", scoIdArr);
		return "/hzszyyhospital/hzszyyreport/qjcshzmx";
	}
	
	/**
	 * 操作技术统计患者明细列表跳转
	 * @param hspemginfQueryDto
	 * @param List<String> scoIdArr
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/czjshzlbmx")
	public String czjshzlbmx(Model model, HspemginfQueryDto hspemginfQueryDto,@RequestParam("scoIdArr[]") List<String> scoIdArr) throws Exception {
		model.addAttribute("querytype",hspemginfQueryDto.getQuerytype());
		model.addAttribute("pageName",hspemginfQueryDto.getPageName());
		model.addAttribute("startdate", DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd"));
		model.addAttribute("enddate", DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(), "yyyy/MM/dd"));
		model.addAttribute("scoIdArr", scoIdArr);
		return "/hzszyyhospital/hzszyyreport/czjshzlbList";
	}
	
	/**
	 * 病种及操作技术统计列表
	 * @param hspBasyInfQueryDto
	 * @param List<String> scoIdArr
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getbzjqczjstj")
	public @ResponseBody DataGridResultInfo  getbzjqczjstj(HspBasyInfQueryDto hspBasyInfQueryDto ,
			@RequestParam("scoIdArr[]") List<String> scoIdArr
			)throws Exception{
		hspBasyInfQueryDto.setScoIdList(scoIdArr); 
		if(hspBasyInfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspBasyInfQueryDto.getEnddate());
			hspBasyInfQueryDto.setEnddate(endDate);
		}
		List<HspBasyInfCustom> hspBasyInfCustomList =  zyyHspreportService.getcountFromHspBasyInf(hspBasyInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(hspBasyInfCustomList);
		return dataGridResultInfo;
	}
	
	/**
	 * 病种统计列表明细 
	 * @param hspemginfQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getbztjmx")
	public @ResponseBody DataGridResultInfo getbztjmx(
			HspemginfQueryDto hspemginfQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			)throws Exception{
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		List<Dstdictinfo> czjsCodList = systemConfigService.findDictinfoByType("BZ_COD");
		if (StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getHspemginfCustom().getScoIdArr())) {
			String scoIdArr = hspemginfQueryDto.getHspemginfCustom().getScoIdArr();
			String subString = scoIdArr.substring(scoIdArr.indexOf("[")+1, scoIdArr.indexOf("]"));
			String[] strings = subString.split(",");
			if (0 != strings.length) {
				List<String> list = Arrays.asList(strings);
				Map<String, String> map = new LinkedHashMap<String, String>();
				for (String string : list) {
					for (Dstdictinfo dstdictinfo : czjsCodList) {
						if (dstdictinfo.getInfocode().equals(string.trim())) {
							map.put(dstdictinfo.getInfo(), dstdictinfo.getInfocode());
						}
					}					
				}
				hspemginfQueryDto.setScoIdMap(map);
			}
		}
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		int total = zyyHspreportService.findBztjmxCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list = zyyHspreportService.getfindBztjmxList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	
	/**
	 * 抢救措施列表明细 
	 * @param hspemginfQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getqjcshzmx")
	public @ResponseBody DataGridResultInfo getqjcshzmx(
			HspemginfQueryDto hspemginfQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			)throws Exception{
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		List<Dstdictinfo> qjcsCodList = systemConfigService.findDictinfoByType("CLBZ_COD");
		if (StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getHspemginfCustom().getScoIdArr())) {
			String scoIdArr = hspemginfQueryDto.getHspemginfCustom().getScoIdArr();
			String subString = scoIdArr.substring(scoIdArr.indexOf("[")+1, scoIdArr.indexOf("]"));
			String[] strings = subString.split(",");
			if (0 != strings.length) {
				List<String> list = Arrays.asList(strings);
				Map<String, String> map = new LinkedHashMap<String, String>();
				for (String string : list) {
					for (Dstdictinfo dstdictinfo : qjcsCodList) {
						if (dstdictinfo.getInfocode().equals(string.trim())) {
							map.put(dstdictinfo.getInfo(), dstdictinfo.getInfocode());
						}
					}					
				}
				hspemginfQueryDto.setScoIdMap(map);
			}
		}
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		int total = zyyHspreportService.findQjcshzmxCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list = zyyHspreportService.getfindQjcshzmxList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	
	/**
	 * 操作技术统计列表明细 
	 * @param hspemginfQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getczjstjmx")
	public @ResponseBody DataGridResultInfo getczjstjmx(
			HspemginfQueryDto hspemginfQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			)throws Exception{
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		List<Dstdictinfo> czjsCodList = systemConfigService.findDictinfoByType("CZJS_COD");
		if (StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getHspemginfCustom().getScoIdArr())) {
			String scoIdArr = hspemginfQueryDto.getHspemginfCustom().getScoIdArr();
			String subString = scoIdArr.substring(scoIdArr.indexOf("[")+1, scoIdArr.indexOf("]"));
			String[] strings = subString.split(",");
			if (0 != strings.length) {
				List<String> list = Arrays.asList(strings);
				Map<String, String> map = new LinkedHashMap<String, String>();
				for (String string : list) {
					for (Dstdictinfo dstdictinfo : czjsCodList) {
						if (dstdictinfo.getInfocode().equals(string.trim())) {
							map.put(dstdictinfo.getInfo(), dstdictinfo.getInfocode());
						}
					}
				}
				hspemginfQueryDto.setScoIdMap(map);
			}
		}
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		int total = zyyHspreportService.findCzjstjmxCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list = zyyHspreportService.getfindCzjstjmxList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	
	/**
	 * 护士站病种统计列表明细 
	 * @param hspemginfQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/gethszbztjmx")
	public @ResponseBody DataGridResultInfo gethszbztjmx(
			HspemginfQueryDto hspemginfQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			)throws Exception{
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		List<Dstdictinfo> czjsCodList = systemConfigService.findDictinfoByType("HLBZ_COD");
		if (StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getHspemginfCustom().getScoIdArr())) {
			String scoIdArr = hspemginfQueryDto.getHspemginfCustom().getScoIdArr();
			String subString = scoIdArr.substring(scoIdArr.indexOf("[")+1, scoIdArr.indexOf("]"));
			String[] strings = subString.split(",");
			if (0 != strings.length) {
				List<String> list = Arrays.asList(strings);
				Map<String, String> map = new LinkedHashMap<String, String>();
				for (String string : list) {
					for (Dstdictinfo dstdictinfo : czjsCodList) {
						if (dstdictinfo.getInfocode().equals(string.trim())) {
							map.put(dstdictinfo.getInfo(), dstdictinfo.getInfocode());
						}
					}					
				}
				hspemginfQueryDto.setScoIdMap(map);
			}
		}
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		int total = zyyHspreportService.findHszbztjmxCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list = zyyHspreportService.getfindHszbztjmxList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	
	/**
	 * 病种及操作技术统计导出
	 * @param hspBasyInfQueryDto
	 * @param List<String> scoIdArr
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping ("/exportbzjqczjstjSubmit")
	public @ResponseBody SubmitResultInfo exportbzjqczjstjSubmit(
			HspBasyInfQueryDto  hspBasyInfQueryDto,
			@RequestParam("scoIdArr[]") List<String> scoIdArr)throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		//导出文件的前缀
		String filePrefix = "bzjqczjstj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("时间");
		if ("bz".equals(hspBasyInfQueryDto.getQuerytype())) {
			fieldNames.add("病种");
		}else if ("czjs".equals(hspBasyInfQueryDto.getQuerytype())) {
			fieldNames.add("操作技术");
		}	
		fieldNames.add("人数");
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("querydate");
		fieldCodes.add("info");
		fieldCodes.add("count");
		//导出的数据通过service取出
		String startStr = DateUtil.formatDateByFormat(hspBasyInfQueryDto.getStartdate(), "yyyy/MM/dd");
		String endStr = DateUtil.formatDateByFormat(hspBasyInfQueryDto.getEnddate(), "yyyy/MM/dd");
		String hb = "病种及操作技术统计表";
		if ("bz".equals(hspBasyInfQueryDto.getQuerytype())) {
			hb = "病种统计表";
		}else if ("czjs".equals(hspBasyInfQueryDto.getQuerytype())) {
			hb = "操作技术统计表";
		}
		String gd = "查询时间：" + startStr + "至" + endStr;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		if(hspBasyInfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspBasyInfQueryDto.getEnddate());
			hspBasyInfQueryDto.setEnddate(endDate);
		}
		hspBasyInfQueryDto.setScoIdList(scoIdArr); 
		List<HspBasyInfCustom> hspBasyInfCustomList = zyyHspreportService.getcountFromHspBasyInf(hspBasyInfQueryDto);
		//执行导出
		excelExportSXXSSF.writeDatasByObjectSy(hspBasyInfCustomList);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"病种及操作技术统计表",
						hspBasyInfCustomList.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 病种患者列表导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/bzhzlbExport")
	public  SubmitResultInfo bzhzlbExport(
			HspemginfQueryDto hspemginfQueryDto
			) throws Exception {	
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		List<Dstdictinfo> bzCodList = systemConfigService.findDictinfoByType("BZ_COD");
		if (StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getHspemginfCustom().getScoIdArr())) {
			String scoIdArr = hspemginfQueryDto.getHspemginfCustom().getScoIdArr();
			String subString = scoIdArr.substring(scoIdArr.indexOf("[")+1, scoIdArr.indexOf("]"));
			String[] strings = subString.split(",");
			if (0 != strings.length) {
				List<String> list = Arrays.asList(strings);
				Map<String, String> map = new LinkedHashMap<String, String>();
				for (String string : list) {
					for (Dstdictinfo dstdictinfo : bzCodList) {
						if (dstdictinfo.getInfocode().equals(string.trim())) {
							map.put(dstdictinfo.getInfo(), dstdictinfo.getInfocode());
						}
					}
				}
				hspemginfQueryDto.setScoIdMap(map);
			}
		}
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		List<HspemginfCustom> list = zyyHspreportService.getfindBztjmxList(hspemginfQueryDto);			
		
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "bzhzlb";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();		
		fieldNames.add("病种");
		fieldNames.add("收治日期");
		fieldNames.add("病历号");
		fieldNames.add("病人姓名");
		fieldNames.add("性别");
		fieldNames.add("年龄");		
		fieldNames.add("急诊分级");
		fieldNames.add("首诊状态");
		fieldNames.add("分科");
		fieldNames.add("就诊时间");
		fieldNames.add("就诊次数");
		fieldNames.add("首诊医生");
		fieldNames.add("诊断");		
		fieldNames.add("转归去向");
		fieldNames.add("转归时间");
		fieldNames.add("120医生");
		fieldNames.add("120驾驶员");
		fieldNames.add("绿通");
		fieldNames.add("分诊护士");	
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();		
		fieldCodes.add("bzName");
		fieldCodes.add("emgDatStr");
		fieldCodes.add("mpi");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("cstAge");
		fieldCodes.add("emgDepCod");
		fieldCodes.add("cstDspCod");
		fieldCodes.add("emgFkName");
		fieldCodes.add("docDatStr");
		fieldCodes.add("jzxh");
		fieldCodes.add("sqlDctNbr");
		fieldCodes.add("jbzdDes");
		fieldCodes.add("cstDspCodNameNew");
		fieldCodes.add("sqlDat");
		fieldCodes.add("abnDoctor");
		fieldCodes.add("abnDriver");
		fieldCodes.add("grnChl");
		fieldCodes.add("preUsrNam");
		
		String hb = "病种统计患者明细列表";
		String gb = "查询范围: ";
		String startTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getStartdate(), "yyyy/MM/dd");
		String endTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getEnddate(), "yyyy/MM/dd");
		gb +=  startTime + "-" + endTime;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gb);		
		
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"病种统计患者明细列表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 操作技术患者列表导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/czjshzlbExport")
	public  SubmitResultInfo czjshzlbExport(
			HspemginfQueryDto hspemginfQueryDto
			) throws Exception {	
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		List<Dstdictinfo> czjsCodList = systemConfigService.findDictinfoByType("CZJS_COD");
		if (StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getHspemginfCustom().getScoIdArr())) {
			String scoIdArr = hspemginfQueryDto.getHspemginfCustom().getScoIdArr();
			String subString = scoIdArr.substring(scoIdArr.indexOf("[")+1, scoIdArr.indexOf("]"));
			String[] strings = subString.split(",");
			if (0 != strings.length) {
				List<String> list = Arrays.asList(strings);
				Map<String, String> map = new LinkedHashMap<String, String>();
				for (String string : list) {
					for (Dstdictinfo dstdictinfo : czjsCodList) {
						if (dstdictinfo.getInfocode().equals(string.trim())) {
							map.put(dstdictinfo.getInfo(), dstdictinfo.getInfocode());
						}
					}
				}
				hspemginfQueryDto.setScoIdMap(map);
			}
		}
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		List<HspemginfCustom> list = zyyHspreportService.getfindCzjstjmxList(hspemginfQueryDto);			
		
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "czjshzlb";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();		
		fieldNames.add("操作技术");
		fieldNames.add("操作医生");
		fieldNames.add("收治日期");
		fieldNames.add("病历号");
		fieldNames.add("病人姓名");
		fieldNames.add("性别");
		fieldNames.add("年龄");		
		fieldNames.add("急诊分级");
		fieldNames.add("首诊状态");
		fieldNames.add("分科");
		fieldNames.add("就诊时间");
		fieldNames.add("就诊次数");
		fieldNames.add("首诊医生");
		fieldNames.add("诊断");		
		fieldNames.add("转归去向");
		fieldNames.add("转归时间");
		fieldNames.add("120医生");
		fieldNames.add("120驾驶员");
		fieldNames.add("绿通");
		fieldNames.add("分诊护士");	
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();		
		fieldCodes.add("czjsName");
		fieldCodes.add("czysName");
		fieldCodes.add("emgDatStr");
		fieldCodes.add("mpi");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("cstAge");
		fieldCodes.add("emgDepCod");
		fieldCodes.add("cstDspCod");
		fieldCodes.add("emgFkName");
		fieldCodes.add("docDatStr");
		fieldCodes.add("jzxh");
		fieldCodes.add("sqlDctNbr");
		fieldCodes.add("jbzdDes");
		fieldCodes.add("cstDspCodNameNew");
		fieldCodes.add("sqlDat");
		fieldCodes.add("abnDoctor");
		fieldCodes.add("abnDriver");
		fieldCodes.add("grnChl");
		fieldCodes.add("preUsrNam");
		
		String hb = "操作技术统计患者明细列表";
		String gb = "查询范围: ";
		String startTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getStartdate(), "yyyy/MM/dd");
		String endTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getEnddate(), "yyyy/MM/dd");
		gb +=  startTime + "-" + endTime;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gb);		
		
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"操作技术统计患者明细列表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 护士站病种患者列表导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/hszbzhzlbExport")
	public  SubmitResultInfo hszbzhzlbExport(
			HspemginfQueryDto hspemginfQueryDto
			) throws Exception {	
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		List<Dstdictinfo> hlbzCodList = systemConfigService.findDictinfoByType("HLBZ_COD");
		if (StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getHspemginfCustom().getScoIdArr())) {
			String scoIdArr = hspemginfQueryDto.getHspemginfCustom().getScoIdArr();
			String subString = scoIdArr.substring(scoIdArr.indexOf("[")+1, scoIdArr.indexOf("]"));
			String[] strings = subString.split(",");
			if (0 != strings.length) {
				List<String> list = Arrays.asList(strings);
				Map<String, String> map = new LinkedHashMap<String, String>();
				for (String string : list) {
					for (Dstdictinfo dstdictinfo : hlbzCodList) {
						if (dstdictinfo.getInfocode().equals(string.trim())) {
							map.put(dstdictinfo.getInfo(), dstdictinfo.getInfocode());
						}
					}
				}
				hspemginfQueryDto.setScoIdMap(map);
			}
		}
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		List<HspemginfCustom> list = zyyHspreportService.getfindHszbztjmxList(hspemginfQueryDto);			
		
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "hszbzhzlb";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();		
		fieldNames.add("病种");
		fieldNames.add("收治日期");
		fieldNames.add("病历号");
		fieldNames.add("病人姓名");
		fieldNames.add("性别");
		fieldNames.add("年龄");		
		fieldNames.add("急诊分级");
		fieldNames.add("首诊状态");
		fieldNames.add("分科");
		fieldNames.add("就诊时间");
		fieldNames.add("就诊次数");
		fieldNames.add("首诊医生");
		fieldNames.add("诊断");		
		fieldNames.add("转归去向");
		fieldNames.add("转归时间");
		fieldNames.add("120医生");
		fieldNames.add("120驾驶员");
		fieldNames.add("绿通");
		fieldNames.add("分诊护士");	
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();		
		fieldCodes.add("bzName");
		fieldCodes.add("emgDatStr");
		fieldCodes.add("mpi");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("cstAge");
		fieldCodes.add("emgDepCod");
		fieldCodes.add("cstDspCod");
		fieldCodes.add("emgFkName");
		fieldCodes.add("docDatStr");
		fieldCodes.add("jzxh");
		fieldCodes.add("sqlDctNbr");
		fieldCodes.add("jbzdDes");
		fieldCodes.add("cstDspCodNameNew");
		fieldCodes.add("sqlDat");
		fieldCodes.add("abnDoctor");
		fieldCodes.add("abnDriver");
		fieldCodes.add("grnChl");
		fieldCodes.add("preUsrNam");
		
		String hb = "护士站病种统计患者明细列表";
		String gb = "查询范围: ";
		String startTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getStartdate(), "yyyy/MM/dd");
		String endTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getEnddate(), "yyyy/MM/dd");
		gb +=  startTime + "-" + endTime;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gb);		
		
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"护士站病种统计患者明细列表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 抢救措施患者列表导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/qjcstjlbSubmit")
	public  SubmitResultInfo qjcstjlbExport(
			HspemginfQueryDto hspemginfQueryDto
			) throws Exception {	
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		List<Dstdictinfo> bzCodList = systemConfigService.findDictinfoByType("CLBZ_COD");
		if (StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getHspemginfCustom().getScoIdArr())) {
			String scoIdArr = hspemginfQueryDto.getHspemginfCustom().getScoIdArr();
			String subString = scoIdArr.substring(scoIdArr.indexOf("[")+1, scoIdArr.indexOf("]"));
			String[] strings = subString.split(",");
			if (0 != strings.length) {
				List<String> list = Arrays.asList(strings);
				Map<String, String> map = new LinkedHashMap<String, String>();
				for (String string : list) {
					for (Dstdictinfo dstdictinfo : bzCodList) {
						if (dstdictinfo.getInfocode().equals(string.trim())) {
							map.put(dstdictinfo.getInfo(), dstdictinfo.getInfocode());
						}
					}
				}
				hspemginfQueryDto.setScoIdMap(map);
			}
		}
		if(hspemginfQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(endDate);
		}
		List<HspemginfCustom> list = zyyHspreportService.getfindQjcshzmxList(hspemginfQueryDto);
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "qjcshzlb";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();		
		fieldNames.add("抢救措施");
		fieldNames.add("收治日期");
		fieldNames.add("病历号");
		fieldNames.add("病人姓名");
		fieldNames.add("性别");
		fieldNames.add("年龄");		
		fieldNames.add("急诊分级");
		fieldNames.add("首诊状态");
		fieldNames.add("分科");
		fieldNames.add("就诊时间");
		fieldNames.add("就诊次数");
		fieldNames.add("首诊医生");
		fieldNames.add("诊断");		
		fieldNames.add("转归去向");
		fieldNames.add("转归时间");
		fieldNames.add("120医生");
		fieldNames.add("120驾驶员");
		fieldNames.add("绿通");
		fieldNames.add("分诊护士");	
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();		
		fieldCodes.add("bzName");
		fieldCodes.add("emgDatStr");
		fieldCodes.add("mpi");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("cstAge");
		fieldCodes.add("emgDepCod");
		fieldCodes.add("cstDspCod");
		fieldCodes.add("emgFkName");
		fieldCodes.add("docDatStr");
		fieldCodes.add("jzxh");
		fieldCodes.add("sqlDctNbr");
		fieldCodes.add("jbzdDes");
		fieldCodes.add("cstDspCodNameNew");
		fieldCodes.add("sqlDat");
		fieldCodes.add("abnDoctor");
		fieldCodes.add("abnDriver");
		fieldCodes.add("grnChl");
		fieldCodes.add("preUsrNam");
		
		String hb = "抢救措施统计患者明细列表";
		String gb = "查询范围: ";
		String startTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getStartdate(), "yyyy/MM/dd");
		String endTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getEnddate(), "yyyy/MM/dd");
		gb +=  startTime + "-" + endTime;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gb);		
		
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"抢救措施统计患者明细列表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 跳转护士站病种统计图
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/hszbztj")
	public String hszbztj(Model model) throws Exception{
		return "/hzszyyhospital/hzszyyreport/hszbztj";
	}
	
	/**
	 * 护士站病种统计图列表
	 * @param hspBrbzQueryDto
	 * @param scoIdArr
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/gethszbztj")
	public @ResponseBody DataGridResultInfo  gethszbztj(HspHlpgbQueryDto hspHlpgbQueryDto ,
			@RequestParam("scoIdArr[]") List<String> scoIdArr
			)throws Exception{
		if(hspHlpgbQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspHlpgbQueryDto.getEnddate());
			hspHlpgbQueryDto.setEnddate(endDate);
		}
		hspHlpgbQueryDto.setScoIdList(scoIdArr); 
		List<HspHlpgbCustom> hspHlpgbCustomList =  zyyHspreportService.getcountFromHspHlpgb(hspHlpgbQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(hspHlpgbCustomList);
		return dataGridResultInfo;
	}
	
	/**
	 * 护士站病种统计图导出
	 * @param emgSeq
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping ("/exporthszbztjSubmit")
	public @ResponseBody SubmitResultInfo exporthszbztjSubmit(
			HspHlpgbQueryDto  hspHlpgbQueryDto,
			@RequestParam("scoIdArr[]") List<String> scoIdArr)throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		//导出文件的前缀
		String filePrefix = "hszbztj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("时间");
		fieldNames.add("病种");
		fieldNames.add("人数");
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("querydate");
		fieldCodes.add("info");
		fieldCodes.add("count");
		//导出的数据通过service取出
		String startStr = DateUtil.formatDateByFormat(hspHlpgbQueryDto.getStartdate(), "yyyy/MM/dd");
		String endStr = DateUtil.formatDateByFormat(hspHlpgbQueryDto.getEnddate(), "yyyy/MM/dd");
		String hb = "护士站病种统计表";
		
		String gd = "查询时间：" + startStr + "至" + endStr;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		if(hspHlpgbQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspHlpgbQueryDto.getEnddate());
			hspHlpgbQueryDto.setEnddate(endDate);
		}
		hspHlpgbQueryDto.setScoIdList(scoIdArr); 
		List<HspHlpgbCustom> hspHlpgbCustomList =  zyyHspreportService.getcountFromHspHlpgb(hspHlpgbQueryDto);
		//执行导出
		excelExportSXXSSF.writeDatasByObjectSy(hspHlpgbCustomList);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"护士站病种统计表",
						hspHlpgbCustomList.size(),
						webpath//下载地址
				}));
	}

	/**
	 * 获取抢救措施人数统计(中医院)
	 * @param userimportfile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getbrbzxgtjt")
	public  @ResponseBody DataGridResultInfo getBrbzxgtjt(HspBrbzQueryDto hspBrbzQueryDto ,@RequestParam("scoIdArr[]") List<String> scoIdArr)throws Exception{
		hspBrbzQueryDto.setBrbzIdList(scoIdArr);
		if(hspBrbzQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspBrbzQueryDto.getEnddate());
			hspBrbzQueryDto.setEnddate(endDate);
		}
		List<HspBrbzCustom> hspBrbzCustomlist =  zyyHspreportService.getcountFromHlpgb(hspBrbzQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		if(hspBrbzCustomlist!=null&&hspBrbzCustomlist.size()>0){
			dataGridResultInfo.setRows(hspBrbzCustomlist);
		}
		return dataGridResultInfo;
	}
	
	/**
	 * 抢救措施统计列表(中医院)
	 * @param hspBrbzQueryDto
	 * @param scoIdArr
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getbrbzxgtjtb")
	public @ResponseBody DataGridResultInfo  getbrbzxgtjtb(HspBrbzQueryDto hspBrbzQueryDto ,
			@RequestParam("scoIdArr[]") List<String> scoIdArr
			)throws Exception{
		hspBrbzQueryDto.setBrbzIdList(scoIdArr); 
		if(hspBrbzQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspBrbzQueryDto.getEnddate());
			hspBrbzQueryDto.setEnddate(endDate);
		}
		List<HspBrbzCustom> hspBrbzCustomlist =  zyyHspreportService.getcountFromHlpgb(hspBrbzQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(hspBrbzCustomlist);
		return dataGridResultInfo;
	}
	
	/**
	 * 病人病症导出(中医院)--抢救措施导出
	 * @param emgSeq
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 *//*
	@RequestMapping ("/exportbrbzSubmit")
	public @ResponseBody SubmitResultInfo exportbrbzSubmit(
		HighChartsDemoCustomDto  highChartsDemoCustomDto,
			@RequestParam("scoIdArr[]") List<String> scoIdArr)throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		//导出文件的前缀
		String filePrefix = "qjcs";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("抢救措施");
		fieldNames.add("人数");
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("info");
		fieldCodes.add("count");
		//导出的数据通过service取出
		String endStr = DateUtil.formatDateByFormat(highChartsDemoCustomDto.getEndtime(), "yyyy/MM/dd");
		String hb="抢救措施统计表";
		String gd = "查询条件：" +endStr;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		
		HspBrbzQueryDto hspBrbzQueryDto = new HspBrbzQueryDto();
		hspBrbzQueryDto.setBrbzIdList(scoIdArr);
		List<HspBrbzCustom> hspBrbzCustomlist =  zyyHspreportService.getcountFromHlpgb(hspBrbzQueryDto);
		//执行导出
		excelExportSXXSSF.writeDatasByObjectSy(hspBrbzCustomlist);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"抢救措施统计表",
						hspBrbzCustomlist.size(),
						webpath//下载地址
				}));
	}*/
	
	/**
	 * 病人病症导出(中医院)--抢救措施导出
	 * @param emgSeq
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping ("/exportbrbzSubmit")
	public @ResponseBody SubmitResultInfo exportbrbzSubmit(
			HspBrbzQueryDto  hspBrbzQueryDto,
			@RequestParam("scoIdArr[]") List<String> scoIdArr)throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		//导出文件的前缀
		String filePrefix = "qjcs";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("时间");
		fieldNames.add("抢救措施");
		fieldNames.add("人数");
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("querydate");
		fieldCodes.add("info");
		fieldCodes.add("count");
		//导出的数据通过service取出
		String startStr = DateUtil.formatDateByFormat(hspBrbzQueryDto.getStartdate(), "yyyy/MM/dd");
		String endStr = DateUtil.formatDateByFormat(hspBrbzQueryDto.getEnddate(), "yyyy/MM/dd");
		String hb = "抢救措施统计表";
		String gd = "查询时间：" + startStr + "至" + endStr;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		hspBrbzQueryDto.setBrbzIdList(scoIdArr); 
		List<HspBrbzCustom> hspBrbzCustomlist =  zyyHspreportService.getcountFromHlpgb(hspBrbzQueryDto);
		//执行导出
		excelExportSXXSSF.writeDatasByObjectSy(hspBrbzCustomlist);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"抢救措施统计表",
						hspBrbzCustomlist.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 *120处置人数报表跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/query120tj")
	public String query120tj(Model model) throws Exception{
		return "/hospital/report/query120tj";
	}
	
	/**
	 *120处置统计报表结果值
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/query120tj_result")
	public @ResponseBody DataGridResultInfo query120tj_result(HspemginfQueryDto hspemginfQueryDto) throws Exception{
		List<HspemginfCustom> list =zyyHspreportService.find120tj(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 120处置统计报表导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/query120tjExport")
	public @ResponseBody SubmitResultInfo export120tjSubmit(HspemginfQueryDto hspemginfQueryDto
			) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "120tj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("查询时间");
		fieldNames.add("处置方式 ");
		fieldNames.add("人数 ");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("querydate");
		fieldCodes.add("savMngCodStr");
		fieldCodes.add("counts");
		String querytype = hspemginfQueryDto.getQuerytype();
		String gd ="查询范围：";
		if("year".equals(querytype)){
			String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy");
			hspemginfQueryDto.setEnddate(DateUtil.getNextYear(hspemginfQueryDto.getEnddate(), "yyyy"));
			gd = gd + startStr;
		}else if("halfyear".equals(querytype)){
			gd = gd + hspemginfQueryDto.getHalfdate();
		}else if("month".equals(querytype)){
			String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
			gd = gd + startStr;
		}else{
				String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
				gd = gd + startStr;
		}
		String hb = "120处置统计报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		List<HspemginfCustom> list =zyyHspreportService.find120tj(hspemginfQueryDto);
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"120处置统计报表",
						list.size(),
						webpath//下载地址
				}));
	}

	
	/**
	 *非计划重返抢救室率
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/returnQjs")
	public String returnQjs(Model model) throws Exception{
		return "/hzszyyhospital/hzszyyreport/returnQjs";
	}
	
	/**
	 * 非计划重返抢救室率结果集
	 * @param hspemginfQueryDto
	 * @param start
	 * @param end
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryReturnQjs_result")
	public @ResponseBody DataGridResultInfo queryReturnQjs_result(
			HspemginfQueryDto hspemginfQueryDto
			)throws Exception{
		//查询列表的总数
		List<HspemginfCustom> list =zyyHspreportService.getReturnQjsList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 非计划重返抢救室率导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportReturnQjsSubmit")
	public @ResponseBody SubmitResultInfo exportReturnQjsSubmit(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "returnQjs";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("年月");
		fieldNames.add("非计划重返抢救室率(单位:%)");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("mdate");
		fieldCodes.add("median");
		String gd ="查询范围：";
		String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
		String endStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(), "yyyy/MM");
		gd = gd + startStr + endStr;
		String hb = "非计划重返抢救室率";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		List<HspemginfCustom> list =zyyHspreportService.getReturnQjsList(hspemginfQueryDto);
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"非计划重返抢救室率",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 *急诊科会诊院内统计报表跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zyyjzkhzyntj")
	public String jzkhzyntj(Model model) throws Exception{
		return "/hzszyyhospital/hzszyyreport/zyyjzkhzyntj";
	}
	
	/**
	 *急诊科会诊院内统计报表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjzkhzyntj_result")
	public @ResponseBody AjaxInfo queryjzkhzyntj_result2(HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto) throws Exception{
		Map<String, List<HspConsultationRecordsCustom>> map =zyyHspreportService.findHspConsultationRecordsAvgList(hspConsultationRecordsQueryDto);
		AjaxInfo ajaxInfo =new AjaxInfo();
		ajaxInfo.setState("200");
		ajaxInfo.setMsg(map);
		return ajaxInfo;
	}
	
	/**
	 * 急诊科会诊院内统计报表导出
	 * @param hspCstInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/hspcstSubmit")
	public @ResponseBody SubmitResultInfo exportHspCstSubmit(HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto) throws Exception {
		Date enddate =hspConsultationRecordsQueryDto.getEnddate();
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "hspcstinfo";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("查询时间");
		fieldNames.add("会诊科室");
		fieldNames.add("会诊平均时间（分）");
		fieldNames.add("会诊次数");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("querydate");
		fieldCodes.add("invitationDep");
		fieldCodes.add("avgtime");
		fieldCodes.add("zgcount");
		String queryyear = hspConsultationRecordsQueryDto.getQuerytype();
		Date startdate = hspConsultationRecordsQueryDto.getStartdate();
		String hb="急诊科会诊平均时间统计报表";
		String gd="查询范围：";
		if("year".equals(queryyear)){
			gd = gd+DateUtil.getYear(startdate)+"-"+DateUtil.getYear(enddate);
		}else if("halfyear".equals(queryyear)){
			gd = gd+hspConsultationRecordsQueryDto.getHalfdate();
		}else if("day".equals(queryyear)){
			gd = gd+DateUtil.formatDateByFormat(hspConsultationRecordsQueryDto.getStartdate(),"yyyy/MM/dd");
		}else{
			gd = gd + DateUtil.formatDateByFormat(startdate, "yyyy/MM")+"-"+ DateUtil.formatDateByFormat(enddate, "yyyy/MM");
		}
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		Map<String, List<HspConsultationRecordsCustom>> map =zyyHspreportService.findHspConsultationRecordsAvgList(hspConsultationRecordsQueryDto);
		List<HspConsultationRecordsCustom> list=map.get("consultationlist");
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"急诊科会诊平均时间统计报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 急诊科会诊院内统计会诊明细列表
	 */
	@RequestMapping(value="/hzmxlb")
	public String hzmxlb(Model model, HspConsultationRecordsQueryDto consultationRecordsQueryDto,String moduleid) {
		model.addAttribute("startdate",consultationRecordsQueryDto.getStartdate());
		model.addAttribute("enddate",consultationRecordsQueryDto.getEnddate());
		model.addAttribute("queryType",consultationRecordsQueryDto.getQuerytype());
		model.addAttribute("pageName",consultationRecordsQueryDto.getPageName());
		model.addAttribute("moduleid", moduleid);
		return "/hospital/qjs/queryhzdjhz";
	}
	
	
	
	/**
	 *医患比/护患比报表跳转 新
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryDocNurseRatio")
	public String queryDocNurseRatio(Model model) throws Exception{
		return "/hospital/report/docNurseRatio";
	}
	
	/**
	 * 新-医患比/护患比
	 * @param hspemginfQueryDto
	 * @param start
	 * @param end
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryDocNurseRatio_result")
	public @ResponseBody SubmitResultInfo queryDocNurseRatio_result(HspemginfQueryDto hspemginfQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String, Object> map = new HashMap<String, Object>(70);
		HspemginfCustom hspemginfCustom = zyyHspreportService.findDocNurseRatio(hspemginfQueryDto);
		map.put("hspemginfCustom", hspemginfCustom);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 *非计划重返抢救室率  新
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryFjhcfqjsl")
	public String queryFjhcfqjsl(Model model) throws Exception{
		return "/hospital/report/unPlanEmergency";
	}
	
	/**
	 * 非计划重返抢救室率结果集 新
	 * @param hspemginfQueryDto
	 * @param start
	 * @param end
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryFjhcfqjsl_result")
	public @ResponseBody SubmitResultInfo queryFjhcfqjsl_result(HspemginfQueryDto hspemginfQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String, Object> map = new HashMap<String, Object>(70);
		HspemginfCustom hspemginfCustom = zyyHspreportService.findFjhcfqjsl(hspemginfQueryDto);
		List<HspemginfCustom> list = zyyHspreportService.findFjhcfqjslList(hspemginfQueryDto);
		map.put("hspemginfCustom", hspemginfCustom);
		map.put("emgList", list);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 非计划重返抢救室率导出 新
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportFjhcfqjslSubmit")
	public @ResponseBody SubmitResultInfo exportFjhcfqjslSubmit(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "Fjhcfqjsl";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("收治日期");
		fieldNames.add("门诊号码");
		fieldNames.add("病人姓名");
		fieldNames.add("性别");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("emgDatStr");
		fieldCodes.add("vstCad");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstSexCod");
		String gd ="查询条件：";
		String startStr = "";
		if("year".equals(hspemginfQueryDto.getQuerytype())){
			startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy");
		}else if("month".equals(hspemginfQueryDto.getQuerytype())){
			startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
		}else if("day".equals(hspemginfQueryDto.getQuerytype())){
			startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
		}
		gd = gd + startStr;
		String hb = "非计划重返抢救室率";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		List<HspemginfCustom> list =zyyHspreportService.findFjhcfqjslList(hspemginfQueryDto);
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"非计划重返抢救室率",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 门药时间、门球时间报表跳转
	 * @return
	 */
	@RequestMapping(value = "/averageDrug")
	public String averageDrug(Model model) {
		return "/hospital/report/averageDrug";
	}
	
	
	/**
	 * 门药报表、门球报表返回数据
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/averageDrug_result")
	public AjaxInfo averageDrug_result(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		Map<String,List<HspemginfCustom>> map = zyyHspreportService.findaverageDrugList(hspemginfQueryDto);
		AjaxInfo ajaxInfo =new AjaxInfo();
		ajaxInfo.setState("200");
		ajaxInfo.setMsg(map);
		return ajaxInfo;
	}
	
	
	/**
	 * 死亡率、Rosc成功率报表跳转
	 * @return
	 */
	@RequestMapping(value = "/mortalityRate")
	public String mortalityRate(Model model) {
		return "/hospital/report/surgeryDeathOrROSC";
	}
	
	/**
	 * 死亡率、Rosc成功率报表结果返回
	 * @param date
	 * @param type
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/mortalityRate_result")
	public AjaxInfo mortalityRate_result(String date,String type) {
		Map<String,List<Map<String,String>>> map = new HashMap<String,List<Map<String,String>>>(); 
		List<Map<String,String>> dataList = new ArrayList<Map<String,String>>();
		List<Map<String,String>> countList = new ArrayList<Map<String,String>>();
		Map<String,String> countMap = new HashMap<String,String>();
		String nameList []= {"张三","李四","王五","马六","陈七"};
		int Hours = 1;
		if("2019".equals(date) || "2019/09".equals(date) || "2019/09/05".equals(date)) {
			if("death".equals(type)) {
				for(int i = 0;i<5;i++) {
					Map<String,String> dataMap  = new HashMap<String,String>();
					dataMap.put("date","2019/09/05 0"+(Hours+i)+":46");
					dataMap.put("code","10"+i);
					dataMap.put("name",nameList[i]);
					dataMap.put("sex","男");
					dataList.add(dataMap);
				}
				countMap.put("alive", "5");
				countMap.put("death", "11");
			}else if("rosc".equals(type)){
				for(int i = 0;i<7;i++) {
					Map<String,String> dataMap  = new HashMap<String,String>();
					dataMap.put("date","2019/09/05 0"+(Hours+i)+":46");
					dataMap.put("code","10"+i);
					dataMap.put("name","测试"+i);
					dataMap.put("sex","女");
					dataList.add(dataMap);
				}
				countMap.put("alive", "7");
				countMap.put("death", "3");
			}
			countList.add(countMap);
		}
		
		
		map.put("columList", dataList);
		map.put("countList",countList);
		AjaxInfo ajaxInfo =new AjaxInfo();
		ajaxInfo.setState("200");
		ajaxInfo.setMsg(map);
		return ajaxInfo;
	}

	
	/**
	 * 分诊人员统计报表
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/triagePerson")
	public String triagePerson(Model model) {
		return "/hospital/report/triagePerson";
	}
	
	
	/**
	 * 分诊人员统计报表返回数据
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/triagePerson_result")
	public AjaxInfo triagePerson_resule(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		Map<String,List<HspemginfCustom>> map = zyyHspreportService.triagePersonList(hspemginfQueryDto);
		AjaxInfo ajaxInfo =new AjaxInfo();
		ajaxInfo.setState("200");
		ajaxInfo.setMsg(map);
		return ajaxInfo;
	}
	
	/**
	 * 分诊人员统计报表导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportTriagePersonSubmit")
	public @ResponseBody SubmitResultInfo exportTriagePersonSubmit(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "triagePerson";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("时间");
		fieldNames.add("姓名");
		fieldNames.add("预检人数");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("querydate");
		fieldCodes.add("preUsrNam");
		fieldCodes.add("triageCount");
		String gd ="查询条件：";
		String startStr = "";
		if("year".equals(hspemginfQueryDto.getQuerytype())){
			startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy");
		}else if("month".equals(hspemginfQueryDto.getQuerytype())){
			startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
		}else if("day".equals(hspemginfQueryDto.getQuerytype())){
			startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
		}
		gd = gd + startStr;
		String hb = "分诊人员统计";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		Map<String,List<HspemginfCustom>> map = zyyHspreportService.triagePersonList(hspemginfQueryDto);
		List<HspemginfCustom> list =map.get("list");
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"分诊人员统计报表",
						list.size(),
						webpath//下载地址
				}));
	}
	/**
	 * 手术操作统计跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/sscztj")
	public String sscztj(Model model) throws Exception{
		return "/hospital/report/sscztj";
	}
	/**
	 * 手术操作统计报表返回数据
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/operation_result")
	public AjaxInfo operation_result(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		Map<String, List<HspOperateInfCustom>> map = zyyHspreportService.operationList(hspemginfQueryDto);
		AjaxInfo ajaxInfo =new AjaxInfo();
		ajaxInfo.setState("200");
		ajaxInfo.setMsg(map);
		return ajaxInfo;
	}
	
	/**
	 * 手术操作报表导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportOperationSubmit")
	public @ResponseBody SubmitResultInfo exportOperationSubmit(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "operation";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("时间");
		fieldNames.add("手术名称");
		fieldNames.add("手术人数");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("querydate");
		fieldCodes.add("operNam");
		fieldCodes.add("operateCount");
		String gd ="查询条件：";
		String startStr = "";
		if("year".equals(hspemginfQueryDto.getQuerytype())){
			startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy");
		}else if("month".equals(hspemginfQueryDto.getQuerytype())){
			startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
		}else if("day".equals(hspemginfQueryDto.getQuerytype())){
			startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
		}
		gd = gd + startStr;
		String hb = "手术操作统计";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		Map<String, List<HspOperateInfCustom>> map = zyyHspreportService.operationList(hspemginfQueryDto);
		List<HspOperateInfCustom> list =map.get("list");
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"手术操作报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 跳转手术操作患者明细
	 * @param model
	 * @param hspmewsinfCustom
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/ssczhzlb")
	public String findsmtzhzlb(Model model, HspOperateInfCustom hspOperateInfCustom) throws Exception {
		model.addAttribute("startdate",hspOperateInfCustom.getStartdate());
		model.addAttribute("enddate",hspOperateInfCustom.getEnddate());
		model.addAttribute("querytype",hspOperateInfCustom.getQuerytype());
		model.addAttribute("pageName", hspOperateInfCustom.getPageName());
		return "/hospital/report/ssczemglist";
	}
	
	/**
	 * 手术操作统计	患者明细
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryEmgListBySscz")
	public @ResponseBody DataGridResultInfo queryEmgListBySscz(HspOperateInfCustom hspOperateInfCustom, int page, int rows) {
		int total = zyyHspreportService.queryEmgCountBySscz(hspOperateInfCustom);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspOperateInfCustom.setPageQuery(pageQuery);
		List<HspOperateInfCustom> list = zyyHspreportService.queryEmgListBySscz(hspOperateInfCustom);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
}
