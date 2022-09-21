package activetech.hospital.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.action.View;
import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.Series;
import activetech.base.pojo.dto.HighChartsDemoCustom;
import activetech.base.pojo.dto.HighChartsDemoCustomDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.AjaxInfo;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.HighChartsInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.CompctlService;
import activetech.base.service.FirstService;
import activetech.base.service.SystemConfigService;
import activetech.zyyhospital.pojo.dto.HspJjbglInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspOperateInfCustom;
import activetech.hospital.pojo.dto.HighChartsReportCustom;
import activetech.zyyhospital.pojo.dto.HspBchzhzReportCustom;
import activetech.hospital.pojo.dto.HspBrbzCustom;
import activetech.hospital.pojo.dto.HspBrbzQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspmewsinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfQueryDto;
import activetech.hospital.service.HspemginfService;
import activetech.hospital.service.HspreportService;
import activetech.hospital.service.HspsqlinfService;
import activetech.util.DateUtil;
import activetech.util.ExcelExportSXXSSF;
import activetech.util.MyConverter;
import activetech.util.StringUtils;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyHspreportService;

/**
 * 
 * <p>Title:ReportAction</p>
 * <p>Description:报表统计</p>
 * <p>activetech</p>
 */


@Controller
@RequestMapping("/report")
public class ReportAction {
	@Autowired
	private HspreportService hspreportService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspemginfService hspemginfService;
	@Autowired
	private HspsqlinfService hspsqlinfService;
	@Autowired
	public FirstService firstService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private CompctlService compctlService;
	@Autowired
	private ZyyHspreportService zyyHspreportService;
	/**
	 * 跳转急诊科大屏
	 * @param model
	 * @return
	 * @throws Throwable 
	 */
	@RequestMapping("/querybigscreen")
	public String queryjzkdp(Model model) throws Throwable{
		firstService.indexmng(model);
		return View.toBusiness("/BigScreen/bigScreen");
	}
	//-----------------------------------------
	/**
	 * 跳转急诊患者趋势图
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/jzhzqst")
	public String queryhighchartsLine_time(Model model) throws Exception{
		return "/hospital/report/jzhzqst";
	}
	
	
		
	/**
	 * 获取急诊患者趋势表
	 * @param userimportfile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getjzhzqst")
	public @ResponseBody HighChartsInfo getHighChartsUser(HighChartsDemoCustomDto highChartsDemoCustomDto)throws Exception{
		return hspreportService.getHighChartsUser(highChartsDemoCustomDto);
	}
	
	@RequestMapping("/getjzhzqstb")
	public @ResponseBody DataGridResultInfo  getHighChartsUserb(HighChartsDemoCustomDto highChartsDemoCustomDto,
			int page,//当前页码
			int rows
			)throws Exception{
		//首次查询时默认赋值系统当天日期
		Date endtime = DateUtil.getNextDay(highChartsDemoCustomDto.getEndtime());
		highChartsDemoCustomDto.setEndtime(endtime);
		PageQuery pageQuery = new PageQuery();
		int total = hspreportService.getCountHighChartsUser(highChartsDemoCustomDto);
		pageQuery.setPageParams(total, rows, page);
		highChartsDemoCustomDto.setPageQuery(pageQuery);
		List<HighChartsDemoCustom> list=hspreportService.getHighChartsUserb(highChartsDemoCustomDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
	    //填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 导出急诊患者趋势表
	 * @param userimportfile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportjhz")
	public @ResponseBody SubmitResultInfo exportjhz(HighChartsDemoCustomDto highChartsDemoCustomDto)throws Exception{
		String startStr =DateUtil.formatDateByFormat(highChartsDemoCustomDto.getStarttime(), "yyyy/MM/dd");
		String endStr = DateUtil.formatDateByFormat(highChartsDemoCustomDto.getEndtime(), "yyyy/MM/dd");
		//获取虚拟目录指向实际路径
		 //systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
				String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
				// 导出文件的前缀
				String filePrefix = "jzhzfbt";
				// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
				int flushRows = 100;
				// 定义导出数据的title
				List<String> fieldNames = new ArrayList<String>();
				fieldNames.add("日期");
				fieldNames.add("人数");
				//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
				//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
				List<String> fieldCodes = new ArrayList<String>();
				fieldCodes.add("name");
				fieldCodes.add("count");
				String hb = "急诊患者趋势表";
				String gd="查询条件："+startStr+"-" + endStr;
				// 开始导出，执行一些workbook及sheet等对象的初始创建
				ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
						"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
				//首次查询时默认赋值系统当天日期
				Date endtime = DateUtil.getNextDay(highChartsDemoCustomDto.getEndtime());
				highChartsDemoCustomDto.setEndtime(endtime);
				List<HighChartsDemoCustom> highChartsDtoList = hspreportService.getHighChartsUserb(highChartsDemoCustomDto);
				// 执行导出
				excelExportSXXSSF.writeDatasByObjectSy(highChartsDtoList);
				// 输出文件，返回下载文件的http地址，已经包括虚拟目录
				String webpath = excelExportSXXSSF.exportFile();
				System.out.println(webpath);
				return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
						Config.MESSAGE, 914, new Object[] {
								"急诊患者趋势表",
								highChartsDtoList.size(),
								webpath//下载地址
						}));
			}
	//end-----------------------------------------------------
	//--------------liu start
	/**
	 * 死亡率报表跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deathRate")
	public String deathRate(Model model) throws Exception{
		return "/hospital/report/death";
	}
	/**
	 * 死亡率报表查询数据
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getDeathRate")
	public @ResponseBody Map<String,Object> getDeathRate(HspemginfQueryDto hspemginfQueryDto) throws Exception{
		Map<String,Object> map = new HashMap<String, Object>();
		Date enddate =hspemginfQueryDto.getEnddate();
		hspemginfQueryDto.setEnddate(DateUtil.getNextMonth(enddate));
		List<String> zgzt = new ArrayList<String>();
		String swflag = hspemginfQueryDto.getSwflag();
		if(StringUtils.isNotNullAndEmptyByTrim(swflag)){
			if(swflag.equals("0")){
				zgzt.add("3");//死亡
			}else{
				zgzt.add("14");//来院已死亡
			}
		}else{
			zgzt.add("3");//死亡
			zgzt.add("14");//来院已死亡
		}
		hspemginfQueryDto.setZgztlist(zgzt);
		List<HighChartsDemoCustom> list=hspreportService.getDeathRate(hspemginfQueryDto);
		 map.put("list", list);
		 
		 List<HspemginfCustom> hspemginfCustomList = hspemginfService.findEmgDeathList(hspemginfQueryDto);
		 map.put("hspemginfCustomList", hspemginfCustomList);
		return map;
	}
	/**
	 * 死亡率查询结果列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querydeath_result")
	public @ResponseBody DataGridResultInfo querydeath_result(
			HspemginfQueryDto hspemginfQueryDto
			) throws Exception{
		Date enddate =hspemginfQueryDto.getEnddate();
		hspemginfQueryDto.setEnddate(DateUtil.getNextMonth(enddate));
		List<HspemginfCustom> list =hspreportService.findDeathRate(hspemginfQueryDto);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 死亡率导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deathSubmit")
	public @ResponseBody SubmitResultInfo exportDeathSubmit(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath =systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "deathRate";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("死亡率（单位：%）");
		fieldNames.add("存活率（单位：%）");
		fieldNames.add("死亡人数");
		fieldNames.add("患者总数");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("deathRate");
		fieldCodes.add("surRate");
		fieldCodes.add("deathNum");
		fieldCodes.add("allNum");
		// 导出的数据通过service取出
		String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
		String endStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(), "yyyy/MM");
		
		String hb="急诊抢救室患者死亡率";
		String gd = "查询条件："+startStr+"-" +endStr;
		
		if(StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getSwflag())){
			if(hspemginfQueryDto.getSwflag().equals("0")){
				gd = gd+"筛选条件：死亡";
			}else{
				gd = gd+"筛选条件：来院已死亡";
			}
		}else{
			gd = gd+"筛选条件：全部";
		}
		
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		Date endtime=DateUtil.getNextMonth(hspemginfQueryDto.getEnddate());
		hspemginfQueryDto.setEnddate(endtime);
		List<HspemginfCustom> list =hspreportService.findDeathRate(hspemginfQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"死亡率统计表",
						list.size(),
						webpath//下载地址
				}));
	}
	/**
	 * 死亡率导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deathhzSubmit")
	public @ResponseBody SubmitResultInfo deathhzSubmit(Date start,Date end,Date hz_start,Date hz_end,
			HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "deathhz";
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
		// 导出的数据通过service取出
		if(hz_start!=null){
			start=hz_start;
			end=hz_end;
		}
		String startStr = DateUtil.formatDateByFormat(start, "yyyy/MM");
		String endStr = DateUtil.formatDateByFormat(end, "yyyy/MM");
		
		String hb="急诊抢救室已死亡患者列表";
		String gd = "查询条件："+startStr+"-" +endStr;
		
		List<String> zgzt = new ArrayList<String>();
		if(StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getSwflag())){
			if(hspemginfQueryDto.getSwflag().equals("0")){
				gd = gd+"筛选条件：死亡";
				zgzt.add("3");//死亡
			}else{
				gd = gd+"筛选条件：来院已死亡";
				zgzt.add("14");//来院已死亡
			}
		}else{
			gd = gd+"筛选条件：全部";
			zgzt.add("3");//死亡
			zgzt.add("14");//来院已死亡
		}
		hspemginfQueryDto.setZgztlist(zgzt);
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);

		//结束时间加一个月
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		//首次查询时默认赋值系统当天日期
		hspemginfQueryDto.setStartdate(start);
		end=DateUtil.getNextMonth(end);
		hspemginfQueryDto.setEnddate(end);
		List<HspemginfCustom> list = hspemginfService.findEmgDeathList(hspemginfQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"已死亡患者列表",
						list.size(),
						webpath//下载地址
				}));
	}
	//--------------end----------------------------------------
    //--------------chen start
	/**
	 * 急诊各级患者统计跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/hcsebd")
	public String getHighChartsPie(Model model) throws Exception{
		return "/hospital/report/hcsebdPie";
	}
	
	/**
	 * 住院科室收住人数统计跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/keszrs")
	public String keszrs(Model model) throws Exception{
		return "/hospital/report/keszrs";
	}
	
	/**
	 * 跳转住院患者明细页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querypatient")
	public String querypatient(Model model,HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception{
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);
		model.addAttribute("startdate", DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy/MM/dd"));
		model.addAttribute("enddate", DateUtil.formatDateByFormat(hspsqlinfQueryDto.getEnddate(), "yyyy/MM/dd"));
		model.addAttribute("querytype", hspsqlinfQueryDto.getQuerytype());
		model.addAttribute("halfdate", hspsqlinfQueryDto.getHalfdate());
		model.addAttribute("pageName",hspsqlinfQueryDto.getPageName());
		return "/hospital/report/emergencyPatientList";
	}
	/**
	   * 查询科室住院患者明细
	   * @param dstuserQueryDto
	   * @param page
	   * @param rows
	   * @return
	   * @throws Exception
	   */
	  @RequestMapping("/patientList_result")
	  public @ResponseBody DataGridResultInfo patientList_result(
			  HspsqlinfQueryDto hspsqlinfQueryDto,
			    int page,//当前页码
				int rows,//每页显示个数
				String sort,
				String order
				) throws Exception{
		//查询列表的总数
		  if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			  hspsqlinfQueryDto.setSort("emgDat");
		  }
		  if(!StringUtils.isNotNullAndEmptyByTrim(order)){
		      hspsqlinfQueryDto.setOrder("desc");
		  }
		  //查询是否开启了留观室
		  String islgbed = systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue();
		  hspsqlinfQueryDto.getHspemginfCustom().setIslgbed(islgbed);
		  int total = hspreportService.findPatientsCount(hspsqlinfQueryDto);
		  PageQuery pageQuery = new PageQuery();
		  pageQuery.setPageParams(total, rows, page);
		  hspsqlinfQueryDto.setPageQuery(pageQuery);
		  List<HspemginfCustom> list =hspreportService.findPatientList(hspsqlinfQueryDto);
		  DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
		  dataGridResultInfo.setTotal(total);
			//填充rows
		  dataGridResultInfo.setRows(list);
		  return dataGridResultInfo;
	  }
	  
	  /**
		 * 住院患者明细导出
		 * @param hspemginfCustom
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/exportpatients")
		public @ResponseBody SubmitResultInfo exportpatients(HspsqlinfQueryDto hspsqlinfQueryDto,
				String sort,
				String order) throws Exception{
			if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
				 hspsqlinfQueryDto.setSort("emgDat");
			}
			if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			    hspsqlinfQueryDto.setOrder("desc");
			}
			String startStr= null;
			String endStr = null;
			String querytype = null;
			if("year".equals(hspsqlinfQueryDto.getQuerytype())){
				startStr=DateUtil.formatDateByFormat(hspsqlinfQueryDto.getHspemginfCustom().getStartdate(), "yyyy/MM/dd");
				endStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getHspemginfCustom().getEnddate(), "yyyy/MM/dd");
				querytype="按范围";
			}else if("month".equals(hspsqlinfQueryDto.getQuerytype())){
				startStr=DateUtil.formatDateByFormat(hspsqlinfQueryDto.getHspemginfCustom().getStartdate(), "yyyy/MM");
				querytype="按月";
			}else if("day".equals(hspsqlinfQueryDto.getQuerytype())){
				startStr=DateUtil.formatDateByFormat(hspsqlinfQueryDto.getHspemginfCustom().getStartdate(), "yyyy/MM/dd");
				querytype="按天";
			}
			//获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			// 导出文件的前缀
			String filePrefix = "zyhzmx";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("收治时间");
			fieldNames.add("预检卡号");
			fieldNames.add("病人姓名");
			fieldNames.add("性别");
			fieldNames.add("年龄");
			fieldNames.add("类型");
			fieldNames.add("主诉症状");
			fieldNames.add("急诊分级");
			fieldNames.add("首诊状态");
			fieldNames.add("分科");
			fieldNames.add("转归去向");
			fieldNames.add("转归时间");
			fieldNames.add("到院方式");
			fieldNames.add("绿色通道");
			fieldNames.add("分诊护士");

			//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("emgDatStr");
			fieldCodes.add("vstCad");
			fieldCodes.add("cstNam");
			fieldCodes.add("cstSexCod");
			fieldCodes.add("cstAge");
			fieldCodes.add("cstAgeCod");
			fieldCodes.add("preDgnCod");
			fieldCodes.add("emgDepCod");
			fieldCodes.add("cstDspCod");
			fieldCodes.add("emgFkCod");
			fieldCodes.add("cstDspCodNameNew");
			fieldCodes.add("sqlDat");
			fieldCodes.add("arvChlCod");
			fieldCodes.add("grnChl");
			fieldCodes.add("preUsrNam");
			
			// 导出的数据通过service取出
			List<HspemginfCustom> list =hspreportService.findPatientList(hspsqlinfQueryDto);
						
			String hb="患者明细";
			String gd = "查询方式："+querytype+"  查询时间:" +startStr + "-" + endStr;
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
					"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
			
			// 执行导出
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			System.out.println(webpath);
			return ResultUtil.createSubmitResult(
					ResultUtil.createSuccess(
					Config.MESSAGE, 914, new Object[] {
							"患者明细",
							list.size(),
							webpath//下载地址
					}));	
		}
	
	/**
	 * 急诊各级患者比例报表查询数据
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/gethcsebd")
	public @ResponseBody List<HighChartsDemoCustom> gethcsebd(
			HspemginfQueryDto hspemginfQueryDto) throws Exception{
		//获取linux上的日期
		//急诊大屏 当天
		if("bigscreen".equals(hspemginfQueryDto.getTimetype())){
			hspemginfQueryDto.setEnddate(new Date());
			hspemginfQueryDto.setStartdate(new Date());
		}
		//首页 最近一月
		if("index".equals(hspemginfQueryDto.getTimetype())){
			hspemginfQueryDto.setEnddate(new Date());
			Date startDate=DateUtil.getPreMonth(new Date());
			hspemginfQueryDto.setStartdate(startDate);
		}
	
		List<HighChartsDemoCustom> list=hspreportService.getHighChartsEmg(hspemginfQueryDto);
		List<HighChartsDemoCustom> list2=null;
		//查找下面每一个年龄组的数据
		HighChartsDemoCustomDto highChartsDemoCustomDto = new HighChartsDemoCustomDto();
		highChartsDemoCustomDto.setStarttime(hspemginfQueryDto.getStartdate());
		highChartsDemoCustomDto.setEndtime(hspemginfQueryDto.getEnddate());
		highChartsDemoCustomDto.setQuerytype(hspemginfQueryDto.getQuerytype());
		for (int i=0;i<list.size();i++) {
			highChartsDemoCustomDto.setHighChartsDemoCustom(new HighChartsDemoCustom(list.get(i).getName()));
			list2=hspreportService.getHighChartsEmgAgeGroup(highChartsDemoCustomDto);
			list.get(i).setAgeGroup(list2);
		}
		return list;
	}
	/**
	 * 查询急诊各级患者统计列表（按时间查询）
	 * <p>Title:ReportAction</p>
	 * <p>Description:急诊各级患者统计</p>
	 * <p>activetech</p>
	 */
	@RequestMapping("/gethcsebd_result")
	public @ResponseBody DataGridResultInfo getHighChartsEmgByDate(
			HspemginfQueryDto hspemginfQueryDto) throws Exception{
//		Date enddate=DateUtil.afterNDay(hspemginfQueryDto.getEnddate(), 1);
//		hspemginfQueryDto.setEnddate(enddate);
		List<HighChartsDemoCustom> list=hspreportService.getHighChartsEmg(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 急诊各级患者统计导出
	 * @param hspemginfCustom
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exporthspemgSubmit")
	public @ResponseBody SubmitResultInfo exporthspemgSubmit(HspemginfQueryDto hspemginfQueryDto) throws Exception{
		String startStr= DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
		String endStr =  DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(), "yyyy/MM/dd");
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "hcept";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("急诊分级");
		fieldNames.add("人数");

		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("name");
		fieldCodes.add("count");
		
		String hb="急诊各级患者比例";
		String gd = "查询条件："+startStr+"-" +endStr;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		
		// 导出的数据通过service取出
		Date enddate=DateUtil.afterNDay(hspemginfQueryDto.getEnddate(), 1);
		hspemginfQueryDto.setEnddate(enddate);
		List<HighChartsDemoCustom> list=hspreportService.getHighChartsEmg(hspemginfQueryDto);;

		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(
				ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"急诊各级患者统计列表",
						list.size(),
						webpath//下载地址
				}));	
	}
	//--------end---------------------------------------------
		//--------------li start
	/**
	 * 中位数报表跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/median")
	public String median(Model model) throws Exception{
		return "/hospital/report/median";
	}
	/**
	 * 中位数报表查询数据
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getMedian")
	public @ResponseBody HighChartsInfo getMedian(HspemginfQueryDto hspemginfQueryDto) throws Exception{
		return hspreportService.getMedian(hspemginfQueryDto);
	}
	/**
	 * 中位数查询结果集
	 * @param hspemginfQueryDto
	 * @param start
	 * @param end
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querymedian_result")
	public @ResponseBody DataGridResultInfo querymedian_result(
			HspemginfQueryDto hspemginfQueryDto
			)throws Exception{
		//查询列表的总数
		List<HspemginfCustom> list =hspreportService.getMedianList(hspemginfQueryDto);
		int total = list.size();
//		PageQuery pageQuery = new PageQuery();
//		pageQuery.setPageParams(total, rows, page);
//		hspemginfQueryDto.setPageQuery(pageQuery);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
//		List<HspemginfCustom> list1=new ArrayList<HspemginfCustom>();
//		if(rows*page<total){
//			for(int i=(page-1)*rows;i<rows*page;i++){
//				list1.add(list.get(i));
//			}
//		}else{
//			for(int i=(page-1)*rows;i<total;i++){
//				list1.add(list.get(i));
//			}
//		}
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 中位数列表导出
	 * @param emgSeq
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping ("/exportMedianSubmit")
	public @ResponseBody SubmitResultInfo exportMedianSubmit(
			HspemginfQueryDto hspemginfQueryDto)throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		//导出文件的前缀
		String filePrefix = "median";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("年月");
		fieldNames.add("中位数(时)");
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("mdate");
		fieldCodes.add("median");
		
		//导出的数据通过service取出
		String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
		String endStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(), "yyyy/MM");
		
		String hb="抢救室滞留时间中位数";
		String gd = "查询条件："+startStr+"-" +endStr;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		List<HspemginfCustom> list = hspreportService.getMedianList(hspemginfQueryDto);
		
		//执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"抢救室滞留时间中位数",
						list.size(),
						webpath//下载地址
				}));
	}
		//----------------------end--------------------------------
	
		/**
		 * IVa级患者达标率报表跳转
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/fourA")
		public String fourA(Model model) throws Exception{
			return "/hospital/report/fourAQualified";
		}
		/**
		 * IVa级患者达标率报表查询数据
		 * @param start
		 * @param end
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/getFourA")
		public @ResponseBody HighChartsInfo getFourA(HspemginfQueryDto hspemginfQueryDto) throws Exception{
			return hspreportService.getFourA(hspemginfQueryDto);
		}
		/**
		 * IVa级患者达标率查询结果集
		 * @param hspemginfQueryDto
		 * @param start
		 * @param end
		 * @param page
		 * @param rows
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryfourA_result")
		public @ResponseBody DataGridResultInfo queryfourA_result(
				HspemginfQueryDto hspemginfQueryDto
				)throws Exception{
			//查询列表的总数
			List<HspemginfCustom> list =hspreportService.getFourAList(hspemginfQueryDto);
			int total = list.size();
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
		/**
		 * IVa级患者达标率列表导出
		 * @param emgSeq
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping ("/exportFourASubmit")
		public @ResponseBody SubmitResultInfo exportFourASubmit(
				HspemginfQueryDto hspemginfQueryDto)throws Exception{
			//获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			//导出文件的前缀
			String filePrefix = "median";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("年月");
			fieldNames.add("达标率（%）");
			
			//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("mdate");
			fieldCodes.add("median");
			
			//导出的数据通过service取出
			String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
			String endStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(), "yyyy/MM");
			
			String hb="IVa级患者接诊达标率";
			String gd = "查询条件："+startStr+"-" +endStr;
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
					"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
			//首次查询时默认赋值系统当天日期
			List<HspemginfCustom> list = hspreportService.getFourAList(hspemginfQueryDto);
			
			//执行导出
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			System.out.println(webpath);
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
					Config.MESSAGE, 914, new Object[] {
							"IVa级患者接诊达标率",
							list.size(),
							webpath//下载地址
					}));
		}
			//----------------------end--------------------------------
		
	
	/**
	 * 医患比报表跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/patient")
	public String patient(Model model) throws Exception{
		return "/hospital/report/patient";
	}
	
	/**
	 * 医患比查询结果列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querypatient_result")
	public @ResponseBody DataGridResultInfo querypatient_result(HspemginfQueryDto hspemginfQueryDto) throws Exception{
		Date endtime = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
		hspemginfQueryDto.setEnddate(endtime);
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		//查询列表的总数
		List<HspemginfCustom> list =hspreportService.findpatient(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 医患比导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/patientSubmit")
	public @ResponseBody SubmitResultInfo exportPatientSubmit(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		Date endtime = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
		hspemginfQueryDto.setEnddate(endtime);
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "jzhzb";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("分科");
		fieldNames.add("医生");
		fieldNames.add("患者人数");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("emgFkName");
		fieldCodes.add("sqlDctNam");
		fieldCodes.add("hzcount");
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows);
		//首次查询时默认赋值系统当天日期
		
		
		List<HspemginfCustom> list = hspreportService.findpatient(hspemginfQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObject(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"急诊患者列表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	//-----------------------------------------
	
	/**
	 * 跳转月急诊趋势图
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/yjzfbt")
	public String yjzfbt(Model model) throws Exception{
		return "/hospital/report/yjzfbt";
	}
	
	/**
	 * 获取月急诊人数
	 * @param userimportfile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/yjzrs")
	public @ResponseBody HighChartsInfo getYjzrs(HighChartsDemoCustomDto highChartsDemoCustomDto)throws Exception{
		Date endtime = DateUtil.getNextMonth(highChartsDemoCustomDto.getEndtime());
		highChartsDemoCustomDto.setEndtime(endtime);
		return hspreportService.getYjzrs(highChartsDemoCustomDto);
	}
	
	/**
	 * 获取月急诊抢救人数
	 * @param userimportfile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/yjzqjrs")
	public @ResponseBody HighChartsInfo getYjzqjrs(HighChartsDemoCustomDto highChartsDemoCustomDto)throws Exception{
		Date endtime = DateUtil.getNextMonth(highChartsDemoCustomDto.getEndtime());
		highChartsDemoCustomDto.setEndtime(endtime);
		return hspreportService.getYjzqjrs(highChartsDemoCustomDto);
	}
	/**
	 * 获取月急诊死亡人数
	 * @param userimportfile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/yjzswrs")
	public @ResponseBody HighChartsInfo getYjzswrs(HighChartsDemoCustomDto highChartsDemoCustomDto)throws Exception{
		Date endtime = DateUtil.getNextMonth(highChartsDemoCustomDto.getEndtime());
		highChartsDemoCustomDto.setEndtime(endtime);
		return hspreportService.getYjzswrs(highChartsDemoCustomDto);
	}
	/**
	 * 获取月急诊住院人数
	 * @param userimportfile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/yjzzyrs")
	public @ResponseBody HighChartsInfo getYjzzyrs(HighChartsDemoCustomDto highChartsDemoCustomDto)throws Exception{
		Date endtime = DateUtil.getNextMonth(highChartsDemoCustomDto.getEndtime());
		highChartsDemoCustomDto.setEndtime(endtime);
		return hspreportService.getYjzzyrs(highChartsDemoCustomDto);
	}
	
	

	/**
	 * 跳病人病症相关统计
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/brbzxgtjt")
	public String brbzxgtjt(Model model) throws Exception{
		List<HspBrbzCustom> hspScoList= hspreportService.getbrbz();
		model.addAttribute("hspScoList", hspScoList);
		return "/hospital/report/brbzxgtjt";
	}
	
	/**
	 * 抢救措施统计图
	 * @param userimportfile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getbrbzxgtjt")
	public  @ResponseBody HighChartsInfo getBrbzxgtjt(HspBrbzQueryDto hspBrbzQueryDto ,@RequestParam("scoIdArr[]") List<String> scoIdArr)throws Exception{
		hspBrbzQueryDto.setBrbzIdList(scoIdArr);
		List<HspBrbzCustom> hspBrbzCustomlist =  hspreportService.getbrbzxgtjt(hspBrbzQueryDto);
		List<HspBrbzCustom> countList = hspreportService.getcountbrbzxgtjt(hspBrbzQueryDto);
		String aString =new String();
		StringBuffer buffer = new StringBuffer();
		for (HspBrbzCustom hspcount : countList) {
				String countString = hspcount.getSAV_MNG_COD();
				buffer.append(countString);
				buffer.append(",");
				aString = buffer.toString() ;
		}
		
		String[] aArr = aString.split(",");
		if(hspBrbzCustomlist!= null &&hspBrbzCustomlist.size()!= 0){
			for (HspBrbzCustom hspBrbz : hspBrbzCustomlist) {
				for (int i = 0;i < aArr.length; i ++) {
					if(hspBrbz.getInfocode().equals(aArr[i])){
						hspBrbz.setCount(hspBrbz.getCount()+1);
					}
				}	
			}
		}
		HighChartsInfo highChartsInfo = new HighChartsInfo();
		if(hspBrbzCustomlist!=null&&hspBrbzCustomlist.size()>0){
			String[] xcategories = new String[hspBrbzCustomlist.size()];
			double[] data = new double[hspBrbzCustomlist.size()];
			Series series = new Series();
			for(int i =0 ; i<hspBrbzCustomlist.size() ; i++){
					data[i] = (double)hspBrbzCustomlist.get(i).getCount();
					xcategories[i]=hspBrbzCustomlist.get(i).getInfo();
			}
			series.setData(data);
			List<Series> seriesList = new ArrayList<Series>();
			seriesList.add(series);
			highChartsInfo.setXcategories(xcategories);
			highChartsInfo.setSeries(seriesList);
		}
		return highChartsInfo;
	}
	
	
	@RequestMapping("/getbrbzxgtjtb")
	public @ResponseBody DataGridResultInfo  getbrbzxgtjtb(HspBrbzQueryDto hspBrbzQueryDto ,
			@RequestParam("scoIdArr[]") List<String> scoIdArr
			)throws Exception{
		hspBrbzQueryDto.setBrbzIdList(scoIdArr);
		List<HspBrbzCustom> hspBrbzCustomlist =  hspreportService.getbrbzxgtjt(hspBrbzQueryDto);
		List<HspBrbzCustom> countList = hspreportService.getcountbrbzxgtjt(hspBrbzQueryDto);
		String aString =new String();
		StringBuffer buffer = new StringBuffer();
		for (HspBrbzCustom hspcount : countList) {
				String countString = hspcount.getSAV_MNG_COD();
				buffer.append(countString);
				buffer.append(",");
				aString = buffer.toString() ;
		}
		
		String[] aArr = aString.split(",");
		if(hspBrbzCustomlist!= null &&hspBrbzCustomlist.size()!= 0){
			for (HspBrbzCustom hspBrbz : hspBrbzCustomlist) {
				for (int i = 0;i < aArr.length; i ++) {
					if(hspBrbz.getInfocode().equals(aArr[i])){
						hspBrbz.setCount(hspBrbz.getCount()+1);
					}
				}	
			}
		}
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(hspBrbzCustomlist);
		return dataGridResultInfo;
	}
	
		/**
		 * 病人病症导出
		 * @param emgSeq
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping ("/exportbrbzSubmit")
		public @ResponseBody SubmitResultInfo exportbrbzSubmit(
			HighChartsDemoCustomDto  highChartsDemoCustomDto,
				@RequestParam("scoIdArr[]") List<String> scoIdArr)throws Exception{
			//获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			//导出文件的前缀
			String filePrefix = "brbz";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("病人病症");
			fieldNames.add("人数");
			
			//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("info");
			fieldCodes.add("count");
			//导出的数据通过service取出
			String endStr = DateUtil.formatDateByFormat(highChartsDemoCustomDto.getEndtime(), "yyyy/MM");
			String hb="病人病症统计表";
			String gd = "查询条件：" +endStr;
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
					"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
			
			HspBrbzQueryDto hspBrbzQueryDto = new HspBrbzQueryDto();
			hspBrbzQueryDto.setBrbzIdList(scoIdArr);
			hspBrbzQueryDto.setTime(highChartsDemoCustomDto.getEndtime());
			List<HspBrbzCustom> hspBrbzCustomlist =  hspreportService.getbrbzxgtjt(hspBrbzQueryDto);
			List<HspBrbzCustom> countList = hspreportService.getcountbrbzxgtjt(hspBrbzQueryDto);
			String aString =new String();
			StringBuffer buffer = new StringBuffer();
			for (HspBrbzCustom hspcount : countList) {
					String countString = hspcount.getSAV_MNG_COD();
					buffer.append(countString);
					buffer.append(",");
					aString = buffer.toString() ;
			}
			
			String[] aArr = aString.split(",");
			if(hspBrbzCustomlist!= null &&hspBrbzCustomlist.size()!= 0){
				for (HspBrbzCustom hspBrbz : hspBrbzCustomlist) {
					for (int i = 0;i < aArr.length; i ++) {
						if(hspBrbz.getInfocode().equals(aArr[i])){
							hspBrbz.setCount(hspBrbz.getCount()+1);
						}
					}	
				
				}
			}
			
		
		//执行导出
		excelExportSXXSSF.writeDatasByObjectSy(hspBrbzCustomlist);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"病人病症统计表",
						hspBrbzCustomlist.size(),
						webpath//下载地址
				}));
	}
		
	

	/**
	 * 月急诊分布图导出
	 * @param userimportfile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/yjzfbtExport")
	public @ResponseBody SubmitResultInfo yjzfbtExport(HighChartsDemoCustomDto highChartsDemoCustomDto)throws Exception{
		String startStr = DateUtil.formatDateByFormat(highChartsDemoCustomDto.getStarttime(), "yyyy/MM");
		String endStr = DateUtil.formatDateByFormat(highChartsDemoCustomDto.getEndtime(), "yyyy/MM");
		//获取虚拟目录指向实际路径
		String filePath =systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		//导出文件的前缀
		String filePrefix = "yjzfbt";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("查询时间");
		fieldNames.add("人数");
		
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("name");
		fieldCodes.add("count");
		String hb = "月急诊人数";
		String gd ="查询范围："+startStr+"-"+endStr;
		
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
						"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		
		Date endtime = DateUtil.getNextMonth(highChartsDemoCustomDto.getEndtime());
		highChartsDemoCustomDto.setEndtime(endtime);
		List<HighChartsDemoCustom> list = hspreportService.getYjzrsList(highChartsDemoCustomDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		hb = "月急诊抢救人数";
		excelExportSXXSSF.addSheet(fieldNames,fieldCodes,hb,gd,excelExportSXXSSF);
		list = hspreportService.getYjzqjrsList(highChartsDemoCustomDto);
		excelExportSXXSSF.writeDatasByObjectSy(list);
		hb = "月急诊死亡人数";
		excelExportSXXSSF.addSheet(fieldNames,fieldCodes,hb,gd,excelExportSXXSSF);
		list = hspreportService.getYjzswrsList(highChartsDemoCustomDto);
		excelExportSXXSSF.writeDatasByObjectSy(list);
		hb = "月急诊住院人数";
		excelExportSXXSSF.addSheet(fieldNames,fieldCodes,hb,gd,excelExportSXXSSF);
		list = hspreportService.getYjzzyrsList(highChartsDemoCustomDto);
		excelExportSXXSSF.writeDatasByObjectSy(list);
		
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"月急诊人数列表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	
	@RequestMapping("/exportChart")  
    public String exportChart(HttpServletRequest request,HttpServletResponse response,
    		String type,
    		String svg,
    		float width,
    		String scale,
    		String filename
    		) throws Exception{  
		//第一步：将svg代码保存为svg文件
        // 打印获取的参数，确保可以获取值且中文不会乱码，如果出现乱码，请将你的Highcharts页面的编码设置为UTF-8
        // System.out.println(type + "\n" + filename + "\n" +svg + "\n" + width+"\n"+scale); 
        // 获取项目的绝对路径
        String WebRoot =request.getSession().getServletContext().getRealPath("WEB-INF/jsp/hospital/report/temp")+"/";   //request.getRealPath("")+"\\temp\\";
        // SVG临时文件名
        String temp = WebRoot+System.currentTimeMillis()+(int)(Math.random()*1000)+".svg";
        // 将svg代码写入到临时文件中，文件后缀的.svg
        File svgTempFile = new File(temp);
        //写入文件，注意文件编码
        OutputStreamWriter svgFileOsw = new OutputStreamWriter(new FileOutputStream(svgTempFile),"UTF-8");
        svgFileOsw.write(svg);
        svgFileOsw.flush();
        svgFileOsw.close();
         // 第三步：调用转换函数，生成目标文件
        MyConverter mc = new MyConverter();
        // 调用转换函数，返回目标文件名
        String downName = mc.conver(temp,WebRoot, type, width,filename);
        // 读取目标文件流，转换调用下载
        File resultFile = new File(WebRoot+downName);
        FileInputStream resultFileFi = new FileInputStream(resultFile);
        long l = resultFile.length();
        int k = 0;
        byte abyte0[] = new byte[65000];
         //第四步：调用浏览器下载
        response.setContentType("application/x-msdownload");
        response.setContentLength((int) l);
        response.setHeader("Content-Disposition", "attachment; filename=" +new  String(downName.getBytes("gbk"),"iso-8859-1"));
        while ((long) k < l) {
                int j;
                j = resultFileFi.read(abyte0, 0, 65000);
                k += j;
                response.getOutputStream().write(abyte0, 0, j);
        }
        resultFileFi.close();
        // 转换成功后，删除临时文件
        svgTempFile.delete();
        resultFile.delete();                
        return null;  
    }
	
	/**
	 *急诊住院人数报表跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zjzyrs")
	public String zjzyrs(Model model) throws Exception{
		return "/hospital/report/zjzyrs";
	}
	
	/**
	 *住院科室收住人数统计报表结果值
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zjzyrs_resultss")
	public @ResponseBody DataGridResultInfo zjzyrs_result(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception{
		List<HspsqlinfCustom> list =hspreportService.findZjzyrs(hspsqlinfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 急诊住院人数含危重病人和住院病人统计报表
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zjzyrsjz_result")
	public @ResponseBody DataGridResultInfo zjzyrsjz_result(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception{
		List<HspsqlinfCustom> list =hspreportService.findZjzyrsjz(hspsqlinfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 急诊科住院人数统计 患者明细
	 * @param model
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/findjzhzmx")
	public String findjzhzmx(Model model, HspemginfQueryDto hspemginfQueryDto) throws Exception {
		model.addAttribute("querytype",hspemginfQueryDto.getQuerytype());
		model.addAttribute("pageName",hspemginfQueryDto.getPageName());
		model.addAttribute("startdate",hspemginfQueryDto.getStartdate());
		model.addAttribute("enddate",hspemginfQueryDto.getEnddate());
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);
		return "/hospital/report/emergencyPatientList";
	}
	
	/**
	 * 急诊科住院人数统计 患者明细
	 * @param hspemginfQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value ="/findjzhzmx_result")
	public DataGridResultInfo findjzhzmx_result(HspemginfQueryDto hspemginfQueryDto, int page,// 当前页码
			int rows// 每页显示个数
			) throws Exception {
		hspemginfQueryDto.getHspemginfCustom().setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		int total = hspreportService.findjzhzmxCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list = hspreportService.findjzhzmx(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/findjzhzmxSubmit")
	public SubmitResultInfo findjzhzmxSubmit(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "jzhzmx";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("收治日期");
		fieldNames.add("门诊号码");
		fieldNames.add("病人姓名 ");
		fieldNames.add("性别");
		fieldNames.add("年龄");
		fieldNames.add("初步印象");
		fieldNames.add("急诊分级");
		fieldNames.add("首诊状态");
		fieldNames.add("分科");
		fieldNames.add("转归");
		fieldNames.add("转归时间");
		fieldNames.add("送入方式");
		fieldNames.add("绿色通道");
		fieldNames.add("分诊护士");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("emgDatStr");
		fieldCodes.add("vstCad");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("cstAge");
		fieldCodes.add("preDgnCod");
		fieldCodes.add("emgDepCod");
		fieldCodes.add("cstDspCod");
		fieldCodes.add("emgFkCod");
		fieldCodes.add("cstDspCodNameNew");
		fieldCodes.add("sqlDat");
		fieldCodes.add("arvChlCod");
		fieldCodes.add("grnChl");
		fieldCodes.add("preUsrNam");
		String querytype = hspemginfQueryDto.getQuerytype();
		String gd ="查询范围：";
		if("year".equals(querytype)){
			String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getStartdate(), "yyyy");
			hspemginfQueryDto.setEnddate(DateUtil.getNextYear(hspemginfQueryDto.getHspemginfCustom().getEnddate(), "yyyy"));
			gd = gd + startStr;
		}else if("month".equals(querytype)){
			String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getStartdate(), "yyyy/MM");
			gd = gd + startStr;
		}else{
			String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getStartdate(), "yyyy/MM/dd");
			gd = gd + startStr;
		}
		String hb = "急诊收住人数患者明细";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		List<HspemginfCustom> list = hspreportService.findjzhzmx(hspemginfQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"急诊收住人数患者明细",
						list.size(),
						webpath//下载地址
				}));		
	}
	
	
	
	/**
	 * 各科室收住人数统计报表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zjzyrsSubmit")
	public @ResponseBody SubmitResultInfo exportZjzyrsSubmit(HspsqlinfQueryDto hspsqlinfQueryDto
			) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "jzzyrs";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("查询时间");
		fieldNames.add("科室 ");
		fieldNames.add("人数 ");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("queryDate");
		fieldCodes.add("sqlDepName");
		fieldCodes.add("counts");
		String querytype = hspsqlinfQueryDto.getQuerytype();
		String gd ="查询范围：";
		if("year".equals(querytype)){
			String startStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy");
			gd = gd + startStr;
		}else if("halfyear".equals(querytype)){
			gd = gd + hspsqlinfQueryDto.getHalfdate();
		}else if("month".equals(querytype)){
			String startStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy/MM");
			gd = gd + startStr;
		}else{
				String startStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy/MM/dd");
				gd = gd + startStr;
		}
		String hb = "住院科室收住人数";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		List<HspsqlinfCustom> list =hspreportService.findZjzyrs(hspsqlinfQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"住院科室收住人数统计报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 急诊科住院人数统计报表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zjzyrsjzSubmit")
	public @ResponseBody SubmitResultInfo exportZjzyrsjzSubmitSubmit(HspsqlinfQueryDto hspsqlinfQueryDto
			) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath =systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "jzzyrs";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("时间");
		fieldNames.add("急诊科室 ");
		fieldNames.add("住院数 ");
		fieldNames.add("危重数 ");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("queryDate");
		fieldCodes.add("sqlDepCod");
		fieldCodes.add("zycounts");
		fieldCodes.add("wzcounts");
		String querytype = hspsqlinfQueryDto.getQuerytype();
		String gd ="查询范围：";
		if("year".equals(querytype)){
			String startStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy");
			Date enddate =DateUtil.getNextYear( hspsqlinfQueryDto.getEnddate(), "yyyy");
			String endStr = DateUtil.formatDateByFormat(enddate, "yyyy");
			gd = gd + startStr+"-" + endStr;
		}else if("halfyear".equals(querytype)){
			gd = gd + hspsqlinfQueryDto.getHalfdate();
		}else if("month".equals(querytype)){
			String startStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy/MM");
			Date nextMonth = DateUtil.getNextMonth(hspsqlinfQueryDto.getEnddate());
			hspsqlinfQueryDto.setEnddate(nextMonth);
			gd = gd + startStr;
		}else{
			String startStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy/MM/dd");
			gd = gd + startStr;
		}
		String hb = "急诊住院人数";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		List<HspsqlinfCustom> list =hspreportService.findZjzyrsjz(hspsqlinfQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"急诊住院人数统计报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 *急诊科工作量表结果
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/jzkgzl_result")
	public @ResponseBody AjaxInfo jzkgzl_result(HspemginfQueryDto hspemginfQueryDto) throws Exception{
		Map<String,Object> map = hspreportService.findJzkgzlResult(hspemginfQueryDto);
		AjaxInfo ajaxInfo =new AjaxInfo();
		ajaxInfo.setState("200");
		ajaxInfo.setMsg(map);
		return ajaxInfo;
	}
	

	
	/**
	 *跳转急诊科患者就诊统计图
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/gkhzjztjt")
	public String gkhzjztjt(Model model) throws Exception{
		return "/hospital/report/gkhzjztjt";
	}
	
	/**
	 * 各科患者就诊统计图查询列表
	 * @param hspemginfQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querygkhzjztjt_result")
	public @ResponseBody DataGridResultInfo querygkhzjztjt_result(
			HspemginfQueryDto hspemginfQueryDto
			){
		List<HspemginfCustom> list = hspreportService.findGkhzjztjList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 急诊科患者就诊报表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/gkhzjztjtSubmit")
	public @ResponseBody SubmitResultInfo exportGkhzjztjtSubmit(HspemginfQueryDto hspemginfQueryDto
			) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "gkhzjztjt";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("查询时间");
		fieldNames.add("科室 ");
		fieldNames.add("人数 ");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("querydate");
		fieldCodes.add("emgFkName");
		fieldCodes.add("hzcount");
		String querytype = hspemginfQueryDto.getQuerytype();
		String gd ="查询范围：";
		if("year".equals(querytype)){
			String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy");
			gd = gd + startStr;
		}else if("halfyear".equals(querytype)){
			gd = gd + hspemginfQueryDto.getHalfdate();
		}else if("day".equals(querytype)){
			gd = gd + DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
		}else{
			String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
			Date nextMonth = DateUtil.getNextMonth(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(nextMonth);
			gd = gd + startStr;
		}
		String hb = "急诊科患者就诊统计";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		List<HspemginfCustom> list =hspreportService.findGkhzjztjList(hspemginfQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"急诊科患者就诊统计报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 急诊科住院人数
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/jzkzyrs")
	public String jzkzyrs(Model model) throws Exception{
		return "/hospital/report/jzkzyrs";
	}
	
	/**
	 *急诊科会诊院内统计报表跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/jzkhzyntj")
	public String jzkhzyntj(Model model) throws Exception{
		return "/hospital/report/jzkhzyntj";
	}
	

	
	/**
	 * 跳转急诊患者诊断结果
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryzdjgtj")
	public String queryzdjgtj(Model model) throws Exception{
		return "/hospital/report/queryzdjgtj";
	}
	
		
	/**
	 * 跳转住院患者明细页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryZyhz")
	public String queryZyhz(Model model) throws Exception{
		return "/hospital/report/queryZyhz";
	}
	/**
	   * 查询住院患者列表
	   * @param dstuserQueryDto
	   * @param page
	   * @param rows
	   * @return
	   * @throws Exception
	   */
	  @RequestMapping("/queryZyhz_result")
	  public @ResponseBody DataGridResultInfo queryZyhz_result(
			  HspemginfQueryDto hspemginfQueryDto
				) throws Exception{
		  String querytype = hspemginfQueryDto.getQuerytype();
		  Date enddate;
			if("month".equals(querytype)){
				enddate = DateUtil.getNextMonth(hspemginfQueryDto.getStartdate());
			}else if("year".equals(querytype)){
				enddate = DateUtil.getNextYear(hspemginfQueryDto.getEnddate(),"yyyy");
			}else {
				enddate = DateUtil.getNextDay(hspemginfQueryDto.getEnddate());
			}
		  hspemginfQueryDto.setEnddate(enddate);
		  List<HspemginfCustom> list =hspemginfService.findZyhzList(hspemginfQueryDto);
		  
		  DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		  dataGridResultInfo.setRows(list);
		  return dataGridResultInfo;
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
			return "/hospital/report/zytjbb";
		}

		@RequestMapping("/queryzytj_result")
		public @ResponseBody
		DataGridResultInfo queryzytj(HspsqlinfQueryDto hspsqlinfQueryDto)
				throws Exception {
			List<HspsqlinfCustom> list = hspsqlinfService.findZyCount(hspsqlinfQueryDto);
			int total = list.size();
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			// 填充total
			dataGridResultInfo.setTotal(total);
			// 填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}

		/**
		 * 转院患者明细列表
		 * 
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryzhuan")
		public String queryzhuan(Model model, HspsqlinfQueryDto hspsqlinfQueryDto)
				throws Exception {
			model.addAttribute("sqlDes", hspsqlinfQueryDto.getHspsqlinfCustom()
					.getSqlDes());
			model.addAttribute("startdate", DateUtil.formatDateByFormat(
					hspsqlinfQueryDto.getStartdate(), "yyyy/MM/dd"));
			model.addAttribute("enddate", DateUtil.formatDateByFormat(
					hspsqlinfQueryDto.getEnddate(), "yyyy/MM/dd"));
			return "/hospital/report/queryzytj";
		}

		@RequestMapping("/queryzhuan_result")
		public @ResponseBody
		DataGridResultInfo queryzhuan_result(HspsqlinfQueryDto hspsqlinfQueryDto,
				int page,// 当前页码
				int rows,// 每页显示个数
				String sort, String order) throws Exception {
			
			hspsqlinfQueryDto.getHspemginfCustom().setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
			if("day".equals(hspsqlinfQueryDto.getQuerytype())) {
				hspsqlinfQueryDto.setStartdate(hspsqlinfQueryDto.getHspemginfCustom().getStartdate());
				hspsqlinfQueryDto.setEnddate(DateUtil.getNextDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
			}else {
				hspsqlinfQueryDto.setStartdate(DateUtil.getMonthFirstDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
				hspsqlinfQueryDto.setEnddate(DateUtil.getNextMonth(hspsqlinfQueryDto.getHspemginfCustom().getEnddate()));
			}
			// 查询列表的总数
			if (!StringUtils.isNotNullAndEmptyByTrim(sort)) {
				hspsqlinfQueryDto.setSort("sqlDat");
			}
			if (!StringUtils.isNotNullAndEmptyByTrim(order)) {
				hspsqlinfQueryDto.setOrder("desc");
			}
			int total = hspsqlinfService.findemginfByzhuanCount(hspsqlinfQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspsqlinfQueryDto.setPageQuery(pageQuery);
			List<HspemginfCustom> list = hspsqlinfService.findemginfByzhuan(hspsqlinfQueryDto);

			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			// 填充total
			dataGridResultInfo.setTotal(total);
			// 填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}

		/**
		 * 转院患者明细导出
		 */
		@ResponseBody
		@RequestMapping(value="/queryzhuanSubmit")
		public SubmitResultInfo queryzhuanSubmit(HspsqlinfQueryDto hspsqlinfQueryDto, String sort, String order) throws Exception {
			// 获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			// 导出文件的前缀
			String filePrefix = "zyhzmx";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();	
			fieldNames.add("预检卡号");
			fieldNames.add("预检时间");
			fieldNames.add("患者姓名");
			fieldNames.add("性别");
			fieldNames.add("年龄");
			fieldNames.add("主诉症状");
			fieldNames.add("急诊分级");
			fieldNames.add("绿色通道");
			fieldNames.add("到院方式");
			fieldNames.add("首诊状态");
			fieldNames.add("首诊科室");
			fieldNames.add("所转医院");
			fieldNames.add("转归时间");
			fieldNames.add("分诊护士");
			// 导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			// fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("vstCad");
			fieldCodes.add("emgDatStr");
			fieldCodes.add("cstNam");
			fieldCodes.add("cstSexCod");
			fieldCodes.add("cstAge");
			fieldCodes.add("preDgnCod");
			fieldCodes.add("emgDepCod");
			fieldCodes.add("grnChl");
			fieldCodes.add("arvChlCod");
			fieldCodes.add("cstDspCod");
			fieldCodes.add("emgFkCod");
			fieldCodes.add("sqlDes");
			fieldCodes.add("sqlDat");
			fieldCodes.add("preUsrNam");
			hspsqlinfQueryDto.getHspemginfCustom().setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
			hspsqlinfQueryDto.setStartdate(DateUtil.getMonthFirstDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
			hspsqlinfQueryDto.setEnddate(DateUtil.getNextMonth(hspsqlinfQueryDto.getHspemginfCustom().getEnddate()));
			// 查询列表的总数
			if (!StringUtils.isNotNullAndEmptyByTrim(sort)) {
				hspsqlinfQueryDto.setSort("sqlDat");
			}
			if (!StringUtils.isNotNullAndEmptyByTrim(order)) {
				hspsqlinfQueryDto.setOrder("desc");
			}
			List<HspemginfCustom> list = hspsqlinfService.findemginfByzhuan(hspsqlinfQueryDto);
			String startStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy/MM");
			String endStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getEnddate(), "yyyy/MM");
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			String hb = "转院患者明细";
			String gd = "查询条件：" + startStr + "至" + endStr;		
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath, "/export/", filePrefix, fieldNames, fieldCodes,flushRows, hb, gd);			
			// 执行导出
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
					Config.MESSAGE, 914, new Object[] { "转院患者明细", list.size(),
							webpath // 下载地址
					}));
		}
		
		
		/**
		 * 转院汇总统计报表导出
		 * 
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/zytjSubmit")
		public @ResponseBody SubmitResultInfo exportZytjSubmit(HspsqlinfQueryDto hspsqlinfQueryDto)
				throws Exception {
			// 获取虚拟目录指向实际路径
			String filePath = systemConfigService
					.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			String startStr = DateUtil.formatDateByFormat(
					hspsqlinfQueryDto.getStartdate(), "yyyy/MM");
			String endStr = DateUtil.formatDateByFormat(
					hspsqlinfQueryDto.getEnddate(), "yyyy/MM");
			// 导出文件的前缀
			String filePrefix = "zytjbb";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("所转医院");
			fieldNames.add("转院人数");
			// 导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			// fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("sqlDes");
			fieldCodes.add("zhuanycounts");
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			String hb = "转院汇总统计报表";
			String gd = "查询条件：" + startStr + "至" + endStr;
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(
					filePath, "/export/", filePrefix, fieldNames, fieldCodes,
					flushRows, hb, gd);
			// 首次查询时默认赋值系统当天日期
			List<HspsqlinfCustom> list = hspsqlinfService
					.findZyCount(hspsqlinfQueryDto);
			// 执行导出
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			System.out.println(webpath);
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
					Config.MESSAGE, 914, new Object[] { "转院汇总统计报表", list.size(),
							webpath // 下载地址
					}));
		}
		
		/**
		 * 病情汇总统计跳转
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/bqhztj")
		public String bqhztj(Model model) throws Exception{
			return "/hospital/report/bqhztj";
		}
	
		/**
		 * 病情汇总统计
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/bqhztj_resultss")
		public @ResponseBody DataGridResultInfo bqhztj_resultss(HspemginfQueryDto hspemginfQueryDto) throws Exception{
			List<HspemginfQueryDto> list =hspreportService.findBqhztj(hspemginfQueryDto);
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
		
		
		/**
		 * 病情统计 患者明细列表
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception 
		 */
		@RequestMapping(value = "/bqhztjhzmx")
		public String bqhztjhzmx(Model model, HspemginfQueryDto hspemginfQueryDto) throws Exception {
			model.addAttribute("querytype",hspemginfQueryDto.getQuerytype());
			model.addAttribute("pageName",hspemginfQueryDto.getPageName());
			model.addAttribute("startdate",hspemginfQueryDto.getStartdate());
			model.addAttribute("enddate",hspemginfQueryDto.getEnddate());
			// 急诊科室列表
			List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
			model.addAttribute("jzkscompctlList", jzkscompctlList);
			return "/hospital/report/emergencyPatientList";
		}
		
		/**
		 * 病情统计 患者明细列表数据
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception 
		 */
		@ResponseBody
		@RequestMapping(value = "/bqhztjhzmx_result")
		public DataGridResultInfo bqhztjhzmx_result(HspemginfQueryDto hspemginfQueryDto, int page,// 当前页码 
				int rows // 每页显示个数，
				) throws Exception {
			hspemginfQueryDto.getHspemginfCustom().setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
			int total = hspreportService.findBqhztjHzmxCount(hspemginfQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspemginfQueryDto.setPageQuery(pageQuery);
			List<HspemginfCustom> list =hspreportService.findBqhztjHzmx(hspemginfQueryDto);
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			// 填充total
			dataGridResultInfo.setTotal(total);
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
		
		@RequestMapping("/bqhztjhzmxSubmit")
		public @ResponseBody SubmitResultInfo bqhztjhzmxSubmit(HspemginfQueryDto hspemginfQueryDto)throws Exception {
			// 获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			String startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getStartdate(), "yyyy/MM");
			String endStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getEnddate(), "yyyy/MM");
			// 导出文件的前缀
			String filePrefix = "bqhztjmx";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("预检卡号");
			fieldNames.add("预检时间");
			fieldNames.add("患者姓名");
			fieldNames.add("性别");
			fieldNames.add("年龄");
			fieldNames.add("类型");
			fieldNames.add("初步印象");
			fieldNames.add("急诊分级");
			fieldNames.add("绿色通道");
			fieldNames.add("到院方式");
			fieldNames.add("首诊状态");
			fieldNames.add("转归去向");
			fieldNames.add("转归时间");
			fieldNames.add("分诊护士");
			// 导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			// fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("vstCad");
			fieldCodes.add("emgDatStr");
			fieldCodes.add("cstNam");
			fieldCodes.add("cstSexCod");
			fieldCodes.add("cstAge");
			fieldCodes.add("cstAgeCod");
			fieldCodes.add("preDgnCod");
			fieldCodes.add("emgDepCod");
			fieldCodes.add("grnChl");
			fieldCodes.add("arvChlCod");
			fieldCodes.add("cstDspCod");
			fieldCodes.add("cstDspCodNameNew");
			fieldCodes.add("sqlDat");
			fieldCodes.add("preUsrNam");
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			String hb = "病情统计患者明细";
			String gd = "查询条件：" + startStr + "至" + endStr;
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(
					filePath, "/export/", filePrefix, fieldNames, fieldCodes,
					flushRows, hb, gd);
			List<HspemginfCustom> list =hspreportService.findBqhztjHzmx(hspemginfQueryDto);
			// 执行导出
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			System.out.println(webpath);
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
					Config.MESSAGE, 914, new Object[] { "病情统计患者明细", list.size(),
							webpath // 下载地址
					}));
		}
		
		/**
		 * 病情汇总统计报表
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/bqhztjSubmit")
		public @ResponseBody SubmitResultInfo exportbqhztjSubmit(HspemginfQueryDto hspemginfQueryDto
				) throws Exception {
			//获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			// 导出文件的前缀
			String filePrefix = "bqhztj";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("查询时间");
			fieldNames.add("病情 ");
			fieldNames.add("人数 ");
			//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("querydate");
			fieldCodes.add("sqlDepCod");
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
			String hb = "病情汇总人数统计";
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
					"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
			//首次查询时默认赋值系统当天日期
			List<HspemginfQueryDto> list =hspreportService.findBqhztj(hspemginfQueryDto);
			// 执行导出
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			System.out.println(webpath);
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
					Config.MESSAGE, 914, new Object[] {
							"病情汇总人数统计报表",
							list.size(),
							webpath//下载地址
					}));
		}
		

	
		/**
		 *跳转就诊时间分布统计图
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryvisdat")
		public String queryvisdat(Model model) throws Exception{
			return "/hospital/report/queryvisdat";
		}
		
		/**
		 * 就诊时间分布统计图查询列表
		 * @param hspemginfQueryDto
		 * @param page
		 * @param rows
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryvisdat_result")
		public @ResponseBody DataGridResultInfo queryvisdat_result(
				HspemginfQueryDto hspemginfQueryDto
				){
			List<HspemginfCustom> list = hspreportService.findVisDatList(hspemginfQueryDto);
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
		
		/**
		 * 就诊时间分布统计导出
		 * @param hspCstInfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/exportvisdat_result")
		public @ResponseBody SubmitResultInfo exportvisdat_result(HspemginfQueryDto hspemginfQueryDto) throws Exception {
			//获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			// 导出文件的前缀
			String filePrefix = "visdat";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("查询时间");
			fieldNames.add("时间点");
			fieldNames.add("就诊人数");
			//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("querydate");
			fieldCodes.add("queryType");
			fieldCodes.add("counts");
			String timetype = hspemginfQueryDto.getTimetype().equals("0")?"1小时制":"2小时制";
			String querytype= hspemginfQueryDto.getQuerytype().equals("day")?"按天":"按月";
			String startStr =null;
			if("day".equals(hspemginfQueryDto.getQuerytype())){
				startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
			}else{
				startStr= DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
			}
			String gd ="查询方式：";
			gd = gd+ querytype + "，" +timetype+" 时间："+ startStr;
			String hb = "就诊时间分布统计表";
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
					"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
			//查询就诊时间分布列表
			List<HspemginfCustom> list =hspreportService.findVisDatList(hspemginfQueryDto);
			// 执行导出
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			System.out.println(webpath);
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
					Config.MESSAGE, 914, new Object[] {
							"就诊时间分布统计表",
							list.size(),
							webpath//下载地址
					}));
		}
		
		
		/**
		 * 死亡率报表跳转
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/basedeathRate")
		public String basedeathRate(Model model) throws Exception{
			return "/basehospital/report/death";
		}
		

		
	  /**
		 * 转院汇总统计列表跳转
		 * 
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/basequeryzytj")
		public String basequeryzytj(Model model,String moduleid) throws Exception {
			// 将页面所需数据取出传到页面
			model.addAttribute("moduleid", moduleid);
			return "/basehospital/report/zytjbb";
		}

		/**
		 * 转院患者明细列表
		 * 
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/basequeryzhuan")
		public String basequeryzhuan(Model model, HspsqlinfQueryDto hspsqlinfQueryDto)
				throws Exception {
			model.addAttribute("sqlDes", hspsqlinfQueryDto.getHspsqlinfCustom()
					.getSqlDes());
			model.addAttribute("startdate", DateUtil.formatDateByFormat(
					hspsqlinfQueryDto.getStartdate(), "yyyy/MM/dd"));
			model.addAttribute("enddate", DateUtil.formatDateByFormat(
					hspsqlinfQueryDto.getEnddate(), "yyyy/MM/dd"));
			return "/basehospital/report/queryzytj";
		}
		
		/**
		 * 跳转住院患者明细页面
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryXylghzmx")
		public String queryXylghzmx(Model model) throws Exception{
			return "/hospital/report/queryXylghzmx";
		}
		/**
		 * 跳转住院患者明细查询结果
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryXylghzmx_result")
		public @ResponseBody DataGridResultInfo queryXylghzmx_result(
				HspemginfQueryDto hspemginfQueryDto,
				int page,// 当前页码
				int rows,// 每页显示个数
				String sort, String order) throws Exception{
			//非空校验
			hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
			//查询列表的总数
			if(!StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getSort())){
				hspemginfQueryDto.setSort("emgDat");
			}
			if(!StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getOrder())){
				hspemginfQueryDto.setOrder("desc");
			}
			int total =hspemginfService.findHspemginfXylghzmxCount();
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspemginfQueryDto.setPageQuery(pageQuery);
			List<HspemginfCustom> list =hspemginfService.findXylghzmxList(hspemginfQueryDto);
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}	
		
		/**
		 * 
		 * @param hspemginfQueryDto startDate endDate 日期格式
		 * @return 
		 * @throws Exception
		 */
		@RequestMapping("/getfjtj")
		public @ResponseBody SubmitResultInfo getfjtj(HspemginfQueryDto hspemginfQueryDto) throws Exception {
			ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
	        Map<String, Object> map = new HashMap<String, Object>(70);
			List<HighChartsDemoCustom> fjtjlist=hspreportService.getHighChartsEmg(hspemginfQueryDto);
			HspemginfCustom hspemgInfCustom = new HspemginfCustom();
			hspemgInfCustom.setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
			hspemginfQueryDto.setHspemginfCustom(hspemgInfCustom);
			HspemginfCustom hspemginfCustomLstd = zyyHspemginfService.getGrnChlCount(hspemginfQueryDto);
			HspemginfCustom hspemginfCustomLq = zyyHspemginfService.getLqAndNotLqCount(hspemginfQueryDto);
			map.put("fjtjlist",fjtjlist);
			if(hspemginfCustomLstd==null) {
				hspemginfCustomLstd = new HspemginfCustom();
				hspemginfCustomLstd.setLstdCount("0");
			}
			if(hspemginfCustomLq==null) {
				hspemginfCustomLq = new HspemginfCustom();
				hspemginfCustomLq.setLqCount("0");
				hspemginfCustomLq.setNotLqCount("0");
			}
			map.put("lstdCount", hspemginfCustomLstd.getLstdCount());
			map.put("lqCount", hspemginfCustomLq.getLqCount());
			map.put("notLqCount", hspemginfCustomLq.getNotLqCount());	
			map.put("qtsjcount", hspemginfCustomLstd.getQtsjcount());
			resultInfo.setSysdata(map);
			return ResultUtil.createSubmitResult(resultInfo);
		}
		
		/**
		 *抢救室日报表跳转
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryqjsrbb")
		public String queryqjsrbb(Model model,String moduleid) throws Exception{
			model.addAttribute("moduleid", moduleid);
			return "/hospital/report/qjsrbb";
		}

		/**
		 * 抢救室日报表查询列表
		 * @param dstuserQueryDto
		 * @param page
		 * @param rows
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryqjsrbb_result")
		public @ResponseBody DataGridResultInfo queryqjsbb_result(
				HspsqlinfQueryDto hspsqlinfQueryDto 
				) throws Exception{
			List<HighChartsReportCustom> list;
			String querytype = hspsqlinfQueryDto.getQuerytype();
			if("day".equals(querytype)) {
				list = hspreportService.findqjsrbbList(hspsqlinfQueryDto);
			}else {
				Date enddate;
				if("month".equals(querytype)){
					enddate = DateUtil.getNextMonth(hspsqlinfQueryDto.getStartdate());
				}else if("year".equals(querytype)){
					enddate = DateUtil.getNextYear(hspsqlinfQueryDto.getStartdate(),"yyyy");
				}else {
					enddate = DateUtil.getNextDay(hspsqlinfQueryDto.getEnddate());
				}
				hspsqlinfQueryDto.setEnddate(enddate);
				list = hspreportService.findqjsrbbListRange(hspsqlinfQueryDto);
			}
			
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
		

		/**
		 * 急诊科日统计报表导出
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/qjsbbSubmit")
		public @ResponseBody SubmitResultInfo exportQjsbbSubmit(HspsqlinfQueryDto hspsqlinfQueryDto
				) throws Exception {
			String querytype = hspsqlinfQueryDto.getQuerytype();
			//获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			String startStr =DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy/MM/dd");
			String endStr;
			// 导出文件的前缀
			String filePrefix = "qjsbb";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			List<String> fieldCodes = new ArrayList<String>();
			List<HighChartsReportCustom> list;
			fieldNames.add("科室 ");
			fieldCodes.add("comcname");
			String gd = "查询条件："+startStr;
			if("day".equals(querytype)) {
				list =hspreportService.findqjsrbbList(hspsqlinfQueryDto);
				fieldNames.add("昨日留抢数 ");
				fieldNames.add("现有留抢数 ");
				fieldNames.add("今日入观数 ");
				fieldNames.add("今日总出观数 ");
				fieldCodes.add("zrlgcount");
				fieldCodes.add("xylgcount");
				fieldCodes.add("jrrgcount");
				fieldCodes.add("jrcgcount");
			}else {
				fieldNames.add("总入抢数 ");
				fieldNames.add("总出观数 ");
				fieldCodes.add("jrrgcount");
				fieldCodes.add("jrcgcount");
				Date enddate;
				if("month".equals(querytype)){
					enddate = DateUtil.getNextMonth(hspsqlinfQueryDto.getStartdate());
				}else if("year".equals(querytype)){
					enddate = DateUtil.getNextYear(hspsqlinfQueryDto.getEnddate(),"yyyy");
				}else {
					endStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getEnddate(), "yyyy/MM/dd");
					gd+="-"+endStr;
					enddate = DateUtil.getNextDay(hspsqlinfQueryDto.getEnddate());
				}
				hspsqlinfQueryDto.setEnddate(enddate);
				list = hspreportService.findqjsrbbListRange(hspsqlinfQueryDto);
			}
			fieldNames.add("出观数 ");
			fieldNames.add("住院数 ");
			fieldNames.add("回家数 ");
			fieldNames.add("死亡数 ");
			fieldNames.add("自动离院数 ");
			fieldNames.add("转门诊数 ");
			fieldNames.add("转留观室数 ");
			fieldNames.add("转输液室数 ");
			fieldNames.add("转院数 ");
			fieldCodes.add("cgcount");
			fieldCodes.add("cgzycount");
			fieldCodes.add("cghjcount");
			fieldCodes.add("cgswcount");
			fieldCodes.add("cgzdlycount");
			fieldCodes.add("zlgscount");
			fieldCodes.add("zyuancount");
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			String hb="急诊科日统计报表";
			ExcelExportSXXSSF excelExportSXXSSF =  ExcelExportSXXSSF.startHbGd(filePath,
					"/export/", filePrefix, fieldNames, fieldCodes, flushRows, hb, gd);
			// 执行导出
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			System.out.println(webpath);
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
					Config.MESSAGE, 914, new Object[] {
							"急诊科日统计报表",
							list.size(),
							webpath//下载地址
					}));
		}
		
		
		/**
		 * 抢救室平均滞留时间
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryqjszlsj")
		public String queryqjszlsj(Model model) throws Exception{
			return "/hospital/report/queryqjszlsj";
		}

		/**
		 * 抢救室平均滞留时间率--获取获取平均滞留时间和滞留率
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryqjszll_result")
		public @ResponseBody SubmitResultInfo queryqjszll_result(HspemginfQueryDto hspemginfQueryDto) throws Exception{
			ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
			Map<String, Object> map = new HashMap<String, Object>(70);
			String querytype = hspemginfQueryDto.getQuerytype();
			//获取抢救室平均滞留时间率
			HspemginfCustom back = hspreportService.findQjspjzlsj(hspemginfQueryDto);
			//获取抢救室平均滞留时间率
			HspemginfCustom hspemginfCustom = hspreportService.findQjszll(hspemginfQueryDto);
			map.put("pjzlhours", back.getPjzlhours());
			map.put("hspemginfCustom", hspemginfCustom);
			resultInfo.setSysdata(map);
			return ResultUtil.createSubmitResult(resultInfo);
		}
		
		@RequestMapping("/queryqjszlhz_result")
		public @ResponseBody DataGridResultInfo queryqjszlhz_result(
				HspemginfQueryDto hspemginfQueryDto,
				int page,//当前页码
				int rows//每页显示个数
				)throws Exception{
			int total =hspreportService.findQjszlhzCount(hspemginfQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);	
			hspemginfQueryDto.setPageQuery(pageQuery);
			//查询列表的总数
			List<HspemginfCustom> list =hspreportService.findQjszlhzList(hspemginfQueryDto);
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
		
		/**
		 * 抢救室滞留患者列表导出
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/exportQjszlhzSubmit")
		public @ResponseBody SubmitResultInfo exportQjszlhzSubmit(HspemginfQueryDto hspemginfQueryDto) throws Exception {
			//获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			// 导出文件的前缀
			String filePrefix = "qjszlhz";
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
			String hb = "抢救室大于"+hspemginfQueryDto.getTimetype()+"时滞留患者";
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
					"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
			//首次查询时默认赋值系统当天日期
			List<HspemginfCustom> list = hspreportService.findQjszlhzList(hspemginfQueryDto);
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			System.out.println(webpath);
			String title = "滞留患者";
			if(StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getTimetype())) {
				title = "抢救室大于"+hspemginfQueryDto.getTimetype()+"时滞留患者";
			}
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
					Config.MESSAGE, 914, new Object[] {
							title,
							list.size(),
							webpath//下载地址
					}));
		}

		
		
		/**
		 * 急诊患者统计列表报表
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping(value = "/jzhztjlb")
		public String jzhztjlb(Model model, String moduleid,HspemginfQueryDto hspemginfQueryDto,String[] scoIdArr) throws Exception {
			//将页面所需数据取出传到页面
			List<Dstdictinfo> stateList = systemConfigService.findDictinfoByType("CST_DSP_COD");
			// 急诊科室列表
			List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
			model.addAttribute("jzkscompctlList", jzkscompctlList);
			model.addAttribute("stateList", stateList);
			model.addAttribute("moduleid", moduleid);
			model.addAttribute("startdate", DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd"));
			model.addAttribute("enddate", DateUtil.formatDateByFormat(hspemginfQueryDto.getEnddate(), "yyyy/MM/dd"));
			model.addAttribute("pageName",hspemginfQueryDto.getPageName());
			model.addAttribute("querytype", hspemginfQueryDto.getQuerytype());
			model.addAttribute("swFlag", hspemginfQueryDto.getSwFlg());
			if (hspemginfQueryDto.getHspemginfCustom() != null) {
				model.addAttribute("emgDepCod", hspemginfQueryDto.getHspemginfCustom().getEmgDepCod());			
			}			
			if (scoIdArr != null) {
				if (scoIdArr.length != 0) {
					List<String> scoIdArrList = Arrays.asList(scoIdArr);
					model.addAttribute("scoIdType", hspemginfQueryDto.getHspemginfCustom().getScoIdType());
					model.addAttribute("scoIdArr", scoIdArrList);
				}
			}		
			return "/hospital/report/emergencyPatientList";
		}
		
		/**
		 * 急诊患者统计列表报表
		 * @param hspemginfQueryDto
		 * @param today
		 * @param page
		 * @param rows
		 * @param sort
		 * @param order
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryjzhztjlb_result")
		public @ResponseBody DataGridResultInfo queryjzjl_result(
				HspemginfQueryDto hspemginfQueryDto,
				int page,//当前页码
				int rows,//每页显示个数
				String sort,
				String order
				) throws Exception{
			//非空校验
			hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
			//查询列表的总数
			if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
				hspemginfQueryDto.setSort("emgdat");
			}
			if(!StringUtils.isNotNullAndEmptyByTrim(order)){
				hspemginfQueryDto.setOrder("desc");
			}
			//查询是否开启了留观室
			String islgbed = systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue(); 
			hspemginfQueryDto.getHspemginfCustom().setIslgbed(islgbed);
			//增加判断条件，pageName等于1 说明是急诊患者统计列表页面的请求
			hspemginfQueryDto.setPageName("1");
			int total =hspreportService.findJzhztjlbCount(hspemginfQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);	
			hspemginfQueryDto.setPageQuery(pageQuery);
			List<HspemginfCustom> list =hspreportService.findJzhztjlbList(hspemginfQueryDto);
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
		
		
		/**
		 * 急诊患者统计列表导出
		 * @param hspemginfQueryDto
		 * @param today
		 * @param sort
		 * @param order
		 * @return
		 * @throws Exception
		 */
		@ResponseBody
		@RequestMapping(value = "/jzhztjlbSubmit")
		public  SubmitResultInfo jzhztjlbSubmit(HspemginfQueryDto hspemginfQueryDto,
				Date today,
				String sort,
				String order
				) throws Exception {
			
			
			//非空校验
			hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
			//首次查询时默认赋值系统当天日期
			if(hspemginfQueryDto.getHspemginfCustom()==null){
				HspemginfCustom hspemginfCustom=new HspemginfCustom();
				hspemginfCustom.setStartdate(today);
				hspemginfCustom.setEnddate(today);
				hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
			}
			if(hspemginfQueryDto.getHspemginfCustom().getEnddate() != null){
				Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getHspemginfCustom().getEnddate());
				hspemginfQueryDto.getHspemginfCustom().setEnddate(endDate);
			}
			//查询列表的总数
			if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
				hspemginfQueryDto.setSort("emgdat");
			}
			if(!StringUtils.isNotNullAndEmptyByTrim(order)){
				hspemginfQueryDto.setOrder("desc");
			}
			//查询是否开启了留观室
			String islgbed = systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue(); 
			hspemginfQueryDto.getHspemginfCustom().setIslgbed(islgbed);
			List<HspemginfCustom> list =hspreportService.findJzhztjlbList(hspemginfQueryDto);		
			
			
			//获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			// 导出文件的前缀
			String filePrefix = "fzgllb";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("收治日期");
			fieldNames.add("门诊号码");
			fieldNames.add("病人姓名");
			fieldNames.add("性别");
			fieldNames.add("年龄");
			fieldNames.add("主诉症状");
			fieldNames.add("诊断");
			fieldNames.add("急诊分级");
			fieldNames.add("首诊状态");
			fieldNames.add("分科");
			fieldNames.add("转归去向");
			fieldNames.add("转归时间");
			fieldNames.add("送入方式");
			fieldNames.add("绿色通道");
			fieldNames.add("分诊护士");
			fieldNames.add("120驾驶员");
			fieldNames.add("120医生");
			//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("emgDatStr");
			fieldCodes.add("vstCad");
			fieldCodes.add("cstNam");
			fieldCodes.add("cstSexCod");
			fieldCodes.add("cstAge");
			fieldCodes.add("preDgnCod");
			fieldCodes.add("jbzdDes");
			fieldCodes.add("emgDepCod");
			fieldCodes.add("cstDspCod");
			fieldCodes.add("emgFkCod");
			fieldCodes.add("cstDspCodNameNew");
			fieldCodes.add("sqlDat");
			fieldCodes.add("arvChlCod");
			fieldCodes.add("grnChl");
			fieldCodes.add("preUsrNam");
			fieldCodes.add("abnDriver");
			fieldCodes.add("abnDoctor");
			
			String hb = "急诊患者统计列表";
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
							"急诊患者统计列表",
							list.size(),
							webpath//下载地址
					}));
		}
		
		/**
		 * 急诊科发热病人统计列表跳转
		 * 
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryfrbrtj") 
		public String queryfrbrtj(Model model,String moduleid) throws Exception {
			// 将页面所需数据取出传到页面
			model.addAttribute("moduleid", moduleid);
			return "/hospital/report/frbrtjbb";
		}
		
		@RequestMapping("/queryfrbrtj_result")
		public @ResponseBody DataGridResultInfo queryfrbrtj_result(HspemginfQueryDto hspemginfQueryDto)
				throws Exception {
			List<HspemginfCustom> list = hspreportService.findJzkfrbrtjList(hspemginfQueryDto); 
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
		
		/**
		 * 发热病人明细列表
		 * 
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryfrbrmx")
		public String queryfrbrmx(Model model, HspemginfQueryDto hspemginfQueryDto)
				throws Exception {
			String startStr = "";
			if(hspemginfQueryDto.getStartdate()!=null&&!"".equals(hspemginfQueryDto.getStartdate())){
				startStr=String.valueOf(hspemginfQueryDto.getStartdate().getTime());
			}
			String endStr = "";
			if(hspemginfQueryDto.getEnddate()!=null&&!"".equals(hspemginfQueryDto.getEnddate())){
				endStr=String.valueOf(hspemginfQueryDto.getEnddate().getTime());
			}
			model.addAttribute("startdate", startStr);
			model.addAttribute("enddate", endStr);
			model.addAttribute("childFlag", hspemginfQueryDto.getChildFlag());
			return "/hospital/report/queryfrbrtj";
		}
		
		@RequestMapping("/queryfrbrmx_result")
		public @ResponseBody
		DataGridResultInfo queryfrbrmx_result(HspemginfQueryDto hspemginfQueryDto,
				int page,// 当前页码
				int rows,// 每页显示个数
				String sort, String order) throws Exception {
			// 查询列表的总数
			if (!StringUtils.isNotNullAndEmptyByTrim(sort)) {
				hspemginfQueryDto.setSort("emg_dat");
			}
			if (!StringUtils.isNotNullAndEmptyByTrim(order)) {
				hspemginfQueryDto.setOrder("desc");
			}
			int total = hspemginfService.findemginfByfrCount(hspemginfQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspemginfQueryDto.setPageQuery(pageQuery);
			List<HspemginfCustom> list = hspemginfService.findemginfByfrList(hspemginfQueryDto);

			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			// 填充total
			dataGridResultInfo.setTotal(total);
			// 填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
		
		/**
		 * 急诊科发热病人统计报表导出
		 * 
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/frbrtjSubmit")
		public @ResponseBody
		SubmitResultInfo exportFrbrtjSubmit(HspemginfQueryDto hspemginfQueryDto)
				throws Exception {
			// 获取虚拟目录指向实际路径
			String filePath = systemConfigService
					.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			String startStr = DateUtil.formatDateByFormat(
					hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
			String endStr = DateUtil.formatDateByFormat(
					hspemginfQueryDto.getEnddate(), "yyyy/MM/dd");
			// 导出文件的前缀
			String filePrefix = "frbrtjbb";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("急诊科室");
			fieldNames.add("发热人数");
			// 导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			// fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("emgFkName");
			fieldCodes.add("hzcount");
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			String hb = "急诊科发热病人统计报表";
			String gd = "查询条件：" + startStr + "至" + endStr;
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(
					filePath, "/export/", filePrefix, fieldNames, fieldCodes,
					flushRows, hb, gd);
			// 首次查询时默认赋值系统当天日期
			List<HspemginfCustom> list = hspreportService.findJzkfrbrtjList(hspemginfQueryDto);
			// 执行导出
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			System.out.println(webpath);
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
					Config.MESSAGE, 914, new Object[] { "急诊科发热病人统计报表", list.size(),
							webpath // 下载地址
					}));
		}
		
		/**
		 * 发热病人明细导出
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/exportFrbrmxSubmit")
		public @ResponseBody
		SubmitResultInfo exportFrbrmxSubmit(HspemginfQueryDto hspemginfQueryDto)
				throws Exception{
			
			hspemginfQueryDto.setSort("emg_dat");
			hspemginfQueryDto.setOrder("desc");
			
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			String startStr = DateUtil.formatDateByFormat(
					hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
			String endStr = DateUtil.formatDateByFormat(
					hspemginfQueryDto.getEnddate(), "yyyy/MM/dd");
			
			//导出文件的前缀
			String filePrefix = "frbrmx";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("时间");
			fieldNames.add("病人姓名");
			fieldNames.add("性别");
			fieldNames.add("年龄");	
			fieldNames.add("国籍");
			fieldNames.add("职业");		
			fieldNames.add("体温℃");
			fieldNames.add("详细地址");
			fieldNames.add("电话号码");
			fieldNames.add("有无蚊虫叮咬");
			fieldNames.add("有无头痛、关节痛、皮疹及出血点");
			fieldNames.add("有无呼吸道症状");
			fieldNames.add("有无疫区疫情暴露史");
			fieldNames.add("有无禽类接触史及活禽市场暴露史");
			fieldNames.add("疫区名称");			
			fieldNames.add("发病日期");
			fieldNames.add("诊断和处理");			
			fieldNames.add("就诊去向");
						
			// 导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			// fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("emgDatStr");
			fieldCodes.add("cstNam");
			fieldCodes.add("cstSexCod");
			fieldCodes.add("cstAge");		
			fieldCodes.add("nationality");
			fieldCodes.add("emgJob");			
			fieldCodes.add("tmpNbr");
			fieldCodes.add("cstAdr");
			fieldCodes.add("pheNbr");
			fieldCodes.add("wcdyFlag");
			fieldCodes.add("ttgjcxFlag");
			fieldCodes.add("hxdzzFlag");
			fieldCodes.add("yqyqFlag");
			fieldCodes.add("qljcFlag");		
			fieldCodes.add("infectedareaNam");
			fieldCodes.add("frDatStr");
			fieldCodes.add("jbzdDes");
			fieldCodes.add("emgFkCod");		
			
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			String hb = "发热病人明细报表";
			String gd = "查询条件：" + startStr + "至" + endStr;
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(
						filePath, "/export/", filePrefix, fieldNames, fieldCodes,
						flushRows, hb, gd);
			// 首次查询时默认赋值系统当天日期
			List<HspemginfCustom> list = hspemginfService.findemginfByfrList(hspemginfQueryDto);
			// 执行导出
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			System.out.println(webpath);
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
						Config.MESSAGE, 914, new Object[] { "发热病人明细报表", list.size(),
								webpath // 下载地址
						}));
		}
		
	//-----------------------------------------
	/**
	 * 跳转急诊患者趋势图
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/24hjzfbt")
	public String queryHighchartsLine_24time(Model model) throws Exception{
		return "/hospital/report/24hjzfbt";
	}
	
	/**
	 * 24小时就诊分布统计导出
	 * @param hspCstInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/export24hjzfb_result")
	public @ResponseBody SubmitResultInfo export24hjzfb_result(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "24hjzfb";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("查询时间");
		fieldNames.add("时间点");
		fieldNames.add("诊间就诊人数");
		fieldNames.add("留抢人数");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("querydate");
		fieldCodes.add("queryType");
		fieldCodes.add("zjcounts");
		fieldCodes.add("lqcounts");
		String timetype = hspemginfQueryDto.getTimetype().equals("0")?"1小时制":"2小时制";
		String querytype= hspemginfQueryDto.getQuerytype().equals("day")?"按天":"按月";
		String startStr =null;
		if("day".equals(hspemginfQueryDto.getQuerytype())){
			startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
		}else{
			startStr= DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
		}
		String gd ="查询方式：";
		gd = gd+ querytype + "，" +timetype+" 时间："+ startStr;
		String hb = "24小时就诊分布统计表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//查询就诊时间分布列表
		List<HspemginfCustom> list =hspreportService.findVisDatList(hspemginfQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"24小时就诊分布统计表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 今日就诊年龄性别统计
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/toAgeAndSexTj")
	public String toAgeAndSexTj(Model model) {
		return "/hospital/report/ageAndSexTj";
	}
	
	/**
	 * 今日就诊年龄性别统计数据返回
	 * @param hspemginfQueryDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/toAgeAndSexTjList")
	public DataGridResultInfo toAgeAndSexTjList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<HspemginfCustom> columnList = hspreportService.findAgeAndSexTjList(hspemginfQueryDto);
		// 填充rows
		dataGridResultInfo.setRows(columnList);
		return dataGridResultInfo;
	}
		
	@RequestMapping("/exportAgeAndSexTj_result")
	public @ResponseBody SubmitResultInfo exportAgeAndSexTj_result(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "AgeAndSexTj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("年龄");
		fieldNames.add("男");
		fieldNames.add("女");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("inter");
		fieldCodes.add("zgcount");
		fieldCodes.add("hzcount");
		String querytype= hspemginfQueryDto.getQuerytype().equals("day")?"按天":"按月";
		String startStr =null;
		if("day".equals(hspemginfQueryDto.getQuerytype())){
			startStr = DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM/dd");
		}else{
			startStr= DateUtil.formatDateByFormat(hspemginfQueryDto.getStartdate(), "yyyy/MM");
		}
		String gd ="查询方式：";
		gd = gd+ querytype + "，" + " 时间："+ startStr;
		String hb = "今日就诊年龄性别统计";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//今日就诊年龄性别统计
		List<HspemginfCustom> list = hspreportService.findAgeAndSexTjList(hspemginfQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"今日就诊年龄性别统计",
						list.size(),
						webpath//下载地址
				}));
	}
	
	
	
	/**
	 * 急诊科患者生命体征完成情况统计跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/smtzwcqktj")
	public String smtzwcqktj(Model model) throws Exception{
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);
		return "/hospital/report/smtzwcqktj";
	}
	/**
	 * 急诊科患者生命体征完成情况统计查询结果
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querysmtzwcqktj")
	public @ResponseBody DataGridResultInfo querySmtzwcqktj(HspmewsinfCustom hspmewsinfCustom) {
		List<HspmewsinfCustom> list = hspreportService.querySmtzwcqktj(hspmewsinfCustom);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 急诊科患者就诊报表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportSmtzwcqktjlistSubmit")
	public @ResponseBody SubmitResultInfo exportSmtzwcqktjlistSubmit(HspmewsinfCustom hspmewsinfCustom) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "smtzwcqktj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("生命体征");
		fieldNames.add("已录入");
		fieldNames.add("未录入");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("info");
		fieldCodes.add("finished");
		fieldCodes.add("unfinished");

		String gd ="查询范围：";
		String startdateStr = DateUtil.formatDateByFormat(hspmewsinfCustom.getStartdate(), "yyyy/MM/dd HH:mm:ss");
		gd = gd + "时间：" + startdateStr;
		String enddateStr = DateUtil.formatDateByFormat(hspmewsinfCustom.getEnddate(), "yyyy/MM/dd HH:mm:ss");
		gd = gd + " 至 " + enddateStr;
		String emgFkName = hspmewsinfCustom.getEmgFkName();
		gd = gd + " 科室：" + emgFkName;
		String ksfz = hspmewsinfCustom.getKsfz();
		if("0".equals(ksfz)) {
			gd += "（不含快速分诊通道）";
		} else if("1".equals(ksfz)) {
			gd += "（包含快速分诊通道）";
		}
		String hb = "急诊科患者生命体征完成情况统计";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		List<HspmewsinfCustom> list =hspreportService.querySmtzwcqktj(hspmewsinfCustom);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"急诊科患者生命体征完成情况统计报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 急诊科患者生命体征完成情况统计	患者列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryEmgListBySmtz")
	public @ResponseBody DataGridResultInfo queryEmgListBySmtz(HspmewsinfCustom hspmewsinfCustom, int page, int rows) {
		int total = hspreportService.queryEmgCountBySmtz(hspmewsinfCustom);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspmewsinfCustom.setPageQuery(pageQuery);
		List<HspemginfCustom> list = hspreportService.queryEmgListBySmtz(hspmewsinfCustom);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转生命特征患者明细
	 * @param model
	 * @param hspmewsinfCustom
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/smtzhzlb")
	public String findsmtzhzlb(Model model, HspmewsinfCustom hspmewsinfCustom) throws Exception {
		model.addAttribute("startdate",hspmewsinfCustom.getStartdate());
		model.addAttribute("enddate",hspmewsinfCustom.getEnddate());
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);
		return "/hospital/report/smtzemglist";
	}
	
	/**
	 *班次患者汇总报表跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querybchzhz")
	public String querybzhzhz(Model model,String moduleid) throws Exception{
		model.addAttribute("moduleid", moduleid);
		return "/hospital/report/bchzhz";
	}
	
	
	/**
	 * 班次患者汇总报表查询列表
	 * @param dstuserQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querybchzhz_result")
	public @ResponseBody DataGridResultInfo querybchzhz_result(
			HspJjbglInfQueryDto hspJjbglinfQueryDto 
			) throws Exception{
		List<HspBchzhzReportCustom> list;
		String querytype = hspJjbglinfQueryDto.getQuerytype();
		if("day".equals(querytype)) {
			list = hspreportService.findbchzhzList(hspJjbglinfQueryDto);
		}else {
			Date enddate;
			if("month".equals(querytype)){
				enddate = DateUtil.getNextMonth(hspJjbglinfQueryDto.getStartdate());
			}else if("year".equals(querytype)){
				enddate = DateUtil.getNextYear(hspJjbglinfQueryDto.getStartdate(),"yyyy");
			}else {
				enddate = DateUtil.getNextDay(hspJjbglinfQueryDto.getEnddate());
			}
			hspJjbglinfQueryDto.setEnddate(enddate);
			list = hspreportService.findbchzhzListRange(hspJjbglinfQueryDto);
		}
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 班次患者汇总报表导出
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/bchzhzSubmit")
	public @ResponseBody SubmitResultInfo exportBchzhzSubmit(HspJjbglInfQueryDto hspJjbglInfQueryDto
			) throws Exception {
		String querytype = hspJjbglInfQueryDto.getQuerytype();
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		String startStr;
		
		if("month".equals(querytype)){
			startStr = DateUtil.formatDateByFormat(hspJjbglInfQueryDto.getStartdate(), "yyyy/MM");
		}else if("year".equals(querytype)){
			startStr = DateUtil.formatDateByFormat(hspJjbglInfQueryDto.getStartdate(), "yyyy");
		}else {
			startStr = DateUtil.formatDateByFormat(hspJjbglInfQueryDto.getStartdate(), "yyyy/MM/dd");
		}
		
		String endStr;
		// 导出文件的前缀
		String filePrefix = "bchzhz";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		List<String> fieldCodes = new ArrayList<String>();
		List<HspBchzhzReportCustom> list;
		fieldNames.add("班次");
		fieldCodes.add("jiaobc");
		String gd = "查询条件："+startStr;
		
		if("day".equals(querytype)) {
			list =hspreportService.findbchzhzList(hspJjbglInfQueryDto);
		}else {
			Date enddate;
			if("month".equals(querytype)){
				enddate = DateUtil.getNextMonth(hspJjbglInfQueryDto.getStartdate());
			}else if("year".equals(querytype)){
				enddate = DateUtil.getNextYear(hspJjbglInfQueryDto.getEnddate(),"yyyy");
			}else {
				endStr = DateUtil.formatDateByFormat(hspJjbglInfQueryDto.getEnddate(), "yyyy/MM/dd");
				gd+="-"+endStr;
				enddate = DateUtil.getNextDay(hspJjbglInfQueryDto.getEnddate());
			}
			hspJjbglInfQueryDto.setEnddate(enddate);
			list = hspreportService.findbchzhzListRange(hspJjbglInfQueryDto);
		}
		String type = hspJjbglInfQueryDto.getHspJjbglInfCustom().getJjbtype();
		if("H".equals(type)){
			gd += "    交接班类型：护士";
		}else if("Y".equals(type)){
			gd += "    交接班类型：医生";
		}
		fieldNames.add("交班次数 ");
		fieldNames.add("交班总人次数 ");
		fieldNames.add("普通患者总人次数 ");
		fieldNames.add("危重患者总人次数 ");
		fieldNames.add("新入抢总人次数 ");
		fieldNames.add("出观人次数 ");
		fieldNames.add("住院人次数 ");
		fieldNames.add("回家人次数");
		fieldNames.add("死亡人次数 ");
		fieldNames.add("自动离院人次数 ");
		fieldNames.add("转院人次数 ");
		fieldCodes.add("jbcs");
		fieldCodes.add("jbzrcs");
		fieldCodes.add("pthzzrcs");
		fieldCodes.add("wzhzzrcs");
		fieldCodes.add("xrqcount");
		fieldCodes.add("cgcount");
		fieldCodes.add("cgzycount");
		fieldCodes.add("cghjcount");
		fieldCodes.add("cgswcount");
		fieldCodes.add("cgzdlycount");
		fieldCodes.add("zyuancount");
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		String hb="班次患者汇总统计报表";
		ExcelExportSXXSSF excelExportSXXSSF =  ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows, hb, gd);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"班次患者汇总统计报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 *120收住院人数统计报表跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/query120")
	public String query120(Model model,String moduleid) throws Exception{
		model.addAttribute("moduleid", moduleid);
		return "/hospital/report/query120";
	}
	
	
	/**
	 * 120收住院人数统计报表列表查询
	 * @param dstuserQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/query120_result")
	public @ResponseBody DataGridResultInfo query120_result(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception{
		List<HspsqlinfCustom> list =hspreportService.find120szy(hspsqlinfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	   * 查询120住院患者明细
	   * @param dstuserQueryDto
	   * @param page
	   * @param rows
	   * @return
	   * @throws Exception
	   */
	  @RequestMapping("/query120patient")
	  public @ResponseBody DataGridResultInfo query120patient(
			  HspsqlinfQueryDto hspsqlinfQueryDto,
			    int page,//当前页码
				int rows,//每页显示个数
				String sort,
				String order
				) throws Exception{
		//查询列表的总数
		  if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			  hspsqlinfQueryDto.setSort("emgDat");
		  }
		  if(!StringUtils.isNotNullAndEmptyByTrim(order)){
		      hspsqlinfQueryDto.setOrder("desc");
		  }
		  //查询是否开启了留观室
		  String islgbed = systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue();
		  hspsqlinfQueryDto.getHspemginfCustom().setIslgbed(islgbed);
		  int total = hspreportService.find120PatientsCount(hspsqlinfQueryDto);
		  PageQuery pageQuery = new PageQuery();
		  pageQuery.setPageParams(total, rows, page);
		  hspsqlinfQueryDto.setPageQuery(pageQuery);
		  List<HspemginfCustom> list =hspreportService.find120PatientList(hspsqlinfQueryDto);
		  DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
		  dataGridResultInfo.setTotal(total);
			//填充rows
		  dataGridResultInfo.setRows(list);
		  return dataGridResultInfo;
	  }
	
	  /**
		 * 120收住患者明细导出
		 * @param hspemginfCustom
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/export120patients")
		public @ResponseBody SubmitResultInfo export120patients(HspsqlinfQueryDto hspsqlinfQueryDto
				) throws Exception {
			//获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			// 导出文件的前缀
			String filePrefix = "120szyrs";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("查询时间");
			fieldNames.add("科室 ");
			fieldNames.add("人数 ");
			//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("queryDate");
			fieldCodes.add("sqlDepName");
			fieldCodes.add("counts");
			String querytype = hspsqlinfQueryDto.getQuerytype();
			String gd ="查询范围：";
			if("year".equals(querytype)){
				String startStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy");
				gd = gd + startStr;
			}else if("halfyear".equals(querytype)){
				gd = gd + hspsqlinfQueryDto.getHalfdate();
			}else if("month".equals(querytype)){
				String startStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy/MM");
				gd = gd + startStr;
			}else{
					String startStr = DateUtil.formatDateByFormat(hspsqlinfQueryDto.getStartdate(), "yyyy/MM/dd");
					gd = gd + startStr;
			}
			String hb = "120收住院人数";
			// 开始导出，执行一些workbook及sheet等对象的初始创建
			ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
					"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
			List<HspsqlinfCustom> list =hspreportService.find120szy(hspsqlinfQueryDto);
			// 执行导出
			excelExportSXXSSF.writeDatasByObjectSy(list);
			// 输出文件，返回下载文件的http地址，已经包括虚拟目录
			String webpath = excelExportSXXSSF.exportFile();
			System.out.println(webpath);
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
					Config.MESSAGE, 914, new Object[] {
							"120收住院人数统计报表",
							list.size(),
							webpath//下载地址
					}));
		}
		
		/**
		 * 手术操作导出
		 * @param hspemginfQueryDto
		 * @param today
		 * @param sort
		 * @param order
		 * @return
		 * @throws Exception
		 */
		@ResponseBody
		@RequestMapping(value = "/ssczSubmit")
		public  SubmitResultInfo ssczSubmit(HspOperateInfCustom hspOperateInfCustom,
				Date today,
				String sort,
				String order
				) throws Exception {
			
			
			//非空校验
			hspOperateInfCustom = hspOperateInfCustom!=null?hspOperateInfCustom:new HspOperateInfCustom();
			//首次查询时默认赋值系统当天日期
			if(hspOperateInfCustom.getEnddate() != null){
				Date endDate = DateUtil.getNextDay(hspOperateInfCustom.getEnddate());
				hspOperateInfCustom.setEnddate(endDate);
			}
			//查询列表的总数
			if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
				hspOperateInfCustom.setSort("emgdat");
			}
			if(!StringUtils.isNotNullAndEmptyByTrim(order)){
				hspOperateInfCustom.setOrder("desc");
			}
			List<HspOperateInfCustom> list = zyyHspreportService.queryEmgListBySscz(hspOperateInfCustom);
			//获取虚拟目录指向实际路径
			String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
			// 导出文件的前缀
			String filePrefix = "sscz";
			// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
			int flushRows = 100;
			// 定义导出数据的title
			List<String> fieldNames = new ArrayList<String>();
			fieldNames.add("手术操作");
			fieldNames.add("预检日期");
			fieldNames.add("门诊号码");
			fieldNames.add("病人姓名");
			fieldNames.add("性别");
			fieldNames.add("年龄");
			fieldNames.add("主诉症状");
			fieldNames.add("急诊分级");
			fieldNames.add("首诊状态");
			fieldNames.add("分科");
			fieldNames.add("转归去向");
			fieldNames.add("转归时间");
			fieldNames.add("送入方式");
			fieldNames.add("绿色通道");
			fieldNames.add("分诊护士");
			//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
			//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
			List<String> fieldCodes = new ArrayList<String>();
			fieldCodes.add("operNam");
			fieldCodes.add("emgDatStr");
			fieldCodes.add("vstCad");
			fieldCodes.add("cstNam");
			fieldCodes.add("cstSexCod");
			fieldCodes.add("cstAge");
			fieldCodes.add("preDgnCod");
			fieldCodes.add("emgDepCod");
			fieldCodes.add("cstDspCod");
			fieldCodes.add("emgFkCod");
			fieldCodes.add("cstDspCodNameNew");
			fieldCodes.add("sqlDat");
			fieldCodes.add("arvChlCod");
			fieldCodes.add("grnChl");
			fieldCodes.add("preUsrNam");
			
			String hb = "手术操作患者列表";
			String gb = "查询范围: ";
			String startTime = DateUtil.formatDateByFormat(hspOperateInfCustom.getStartdate(), "yyyy/MM/dd");
			String endTime = DateUtil.formatDateByFormat(hspOperateInfCustom.getEnddate(), "yyyy/MM/dd");
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
							"手术操作患者列表",
							list.size(),
							webpath//下载地址
					}));
		}
}
