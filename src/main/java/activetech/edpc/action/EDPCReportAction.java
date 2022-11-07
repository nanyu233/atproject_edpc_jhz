package activetech.edpc.action;

import activetech.base.action.View;
import activetech.base.dbconfig.ApplicationConfig;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.edpc.pojo.dto.ReportCondition;
import activetech.edpc.pojo.dto.ReportDataResult;
import activetech.edpc.service.CzService;
import activetech.edpc.service.EDPCReportService;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.ExcelExportSXXSSF;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/edpcReport")
public class EDPCReportAction {
	
	@Autowired
	private EDPCReportService eDPCReportService;
	
	@Autowired
	private SystemConfigService systemConfigService;
	
	@Autowired
	private CzService czService;
	
	@RequestMapping("/tohuzdtob")
	public String tohuzdtob(Model model) throws Exception {
		return "/edpc/report/xtReport/dtobtj";
	}
	
	@RequestMapping("/todgsjhsj")
	public String todgsjhsj(Model model) throws Exception {
		return "/edpc/report/xtReport/dgsjhsj";
	}
	
	@RequestMapping("/toecgqzsj")
	public String toecgqzsj(Model model) throws Exception {
		return "/edpc/report/xtReport/ecgqzsj";
	}

	/**
	 *
	 * @param model
	 * @return 跳转到转诊STEMI患者F2W时间统计图页面
	 * @throws Exception
	 */
	@RequestMapping("/tof2w")
	public String tof2w(Model model) throws Exception {
		return "/edpc/report/xtReport/dtobtj02";
	}
	
	/**
	 * 跳转抗血小板药物给药时间报表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tokxxbgysj")
	public String tokxxbgysj(Model model) throws Exception {
		return "/edpc/report/xtReport/kxxbgysj";
	}
	
	/**
	 * 跳转首份心电图时间报表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tosfxdtsj")
	public String tosfxdtsj(Model model) throws Exception {
		return "/edpc/report/xtReport/sfxdtsj";
	}
	
	
	/**
	 * 严重创伤患者到院后进行抢救的时间平均值报表
	 */
	@RequestMapping("/tocsyzhzdyqj")
	public String tocsyzhdyqj(Model model) throws Exception {
		return "/edpc/report/csReport/truamaavg";
	}
	
	
	/**
	 * 血化验时间
	 */
	@RequestMapping("/toxhysj")
	public String toxhysj(Model model) throws Exception {
		return "/edpc/report/xtReport/xhysj";
	}
	
	
	/**
	 * 导出严重创伤患者到院后进行抢救的时间平均值趋势图
	 * 
	 * @param hspsqlinfQueryDto 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportCshzdyqjsjSubmit.do")
	public @ResponseBody SubmitResultInfo exportCshzdyqjsjSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "csyzhzdyqj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均值(小时)");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "严重创伤患者到院后进行抢救的时间平均值统计报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsyzhzdyqjData(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"严重创伤患者到院后进行抢救的时间平均值统计表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	
	/**
	 * 获取严重创伤患者到院后进行抢救的时间平均值趋势图highcharts图表数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/querycsyzhzdyqj_result.do")
	public @ResponseBody DataGridResultInfo querycsyzhzdyqj_result(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsyzhzdyqjData(reportCondition);
		return dataGridResultInfo;
	}
	
	
	/**
	 * 跳转抗凝药给药时间报表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toknygysj")
	public String toknygysj(Model model) throws Exception {
		return "/edpc/report/xtReport/knygysj";
	}
	
	
	/**
	 * 跳转CTAJ激活时间报表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toctajhsj")
	public String toctajhsj(Model model) throws Exception {
		return "/edpc/report/xtReport/ctajhsj";
	}
	
	/**
	 * 卒中患者抵达急诊接受NIHSS评分的比例
	 * @description TODO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toCzNIHSSRatePage")
	public String toCzNIHSSRatePage(Model model) throws Exception {
		return "/edpc/report/czReport/czNIHSSRate";
	}
	
	
	@RequestMapping("/czNIHSSRate_result")
	@ResponseBody
	public DataGridResultInfo czNIHSSRate_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCzNIHSSRate(reportCondition);
		
		return dataGridResultInfo;
	}
	
	/**
	 * 缺血性卒中患者在溶栓时间窗内接受静脉溶栓患者的比例
	 * <4.5小时 rtpa  4.5~6小时  尿激酶
	 * @description TODO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/torsTimeUpToStandardRatePage")
	public String torsTimeInStandardRatePage(Model model) throws Exception {
		return "/edpc/report/czReport/rsTimeUpToStandardRate";
	}
	
	@RequestMapping("/rsTimeUpToStandardRate_result")
	@ResponseBody
	public DataGridResultInfo rsTimeUpToStandardRate_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getrsTimeUpToStandardRate(reportCondition);
		
		return dataGridResultInfo;
	}
	
	
	
	
	/**
	 * 抵达医院60分钟内，急性缺血性卒中患者在溶栓时间窗内接受静脉溶栓的比例
	 * @description TODO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toin60MinRsRatePage")
	public String toin60MinRsRatePage(Model model) throws Exception {
		return "/edpc/report/czReport/in60MinRsRate";
	}
	
	@RequestMapping("/in60MinRsRate_result")
	@ResponseBody
	public DataGridResultInfo in60MinRsRate_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getin60MinRsRate(reportCondition);
		
		return dataGridResultInfo;
	}
	
	
	
	/**
	 * 急性缺血性卒中患者，从到达急诊至开始做多模式头颅CT时间
	 * @description TODO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toctTimePage")
	public String ctTime(Model model) throws Exception {
		return "/edpc/report/czReport/ctTime";
	}
	
	@RequestMapping("/ctTime_result")
	@ResponseBody
	public DataGridResultInfo ctTime_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getctAvgTime(reportCondition);
		
		return dataGridResultInfo;
	}
	
	
	/**
	 * 急性缺血性卒中患者，从到达急诊至开始做多模式头颅CT时间<25分钟的比例
	 * @description TODO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toctTimeUpToStandardRatePage")
	public String toctTimeUpToStandardRatePage(Model model) throws Exception {
		return "/edpc/report/czReport/ctTimeUpToStandardRate";
	}
	
	@RequestMapping("/ctTimeUpToStandardRate_result")
	@ResponseBody
	public DataGridResultInfo ctTimeUpToStandardRate_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getctAvgTime(reportCondition);
		
		return dataGridResultInfo;
	}
	
	
	
	/**
	 * 完成头颅ct<25min的比例
	 * @description TODO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/ctLimit")
	public String ctLimit(Model model) throws Exception {
		return "/edpc/report/czReport/ctLimit";
	}
	
	
	
	/**
	 * 对急性缺血性卒中患者，从入院到开始血管内治疗的时间
	 * @description TODO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toD2dmqsPage")
	public String toD2dmqsPage(Model model) throws Exception {
		return "/edpc/report/czReport/d2dmqs";
	}
	
	
	@RequestMapping("/d2dmqs_result")
	@ResponseBody
	public DataGridResultInfo d2dmqs_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getD2dmqsTime(reportCondition);
		
		return dataGridResultInfo;
	}
	
	
	
	
	
	/**
	 * 胸痛部分报表获取报表数据统一接口
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/xtReport_result")
	@ResponseBody
	public DataGridResultInfo dtob_result(ReportCondition reportCondition){
		return eDPCReportService.getXtReport(reportCondition);
	}

	/**
	 * 胸痛部分报表获取报表数据统一接口02
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/xtReport_result02")
	@ResponseBody
	public DataGridResultInfo dtob_result02(ReportCondition reportCondition){

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getXtReport02(reportCondition);

		return dataGridResultInfo;
	}
	
	/**
	 *	D2B时间报表导出
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 * @date 2018年6月21日 下午6:04:10
	 */
	
	@RequestMapping("/exportXtReportSubmit")
	@ResponseBody
	public SubmitResultInfo exportD2BSJ(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");	

		// 导出文件的前缀
		String filePrefix = "";
		String flag = reportCondition.getReportTypeFlag();
		if("D2B".equals(flag)){
			filePrefix = "D2B时间统计报表";
		}else if("DGSJH".equals(flag)){
			filePrefix = "导管室启动时间报表";
		}else if("ECG_QZ".equals(flag)){
			filePrefix = "心电图确诊时间报表";
		}else if("KXXB".equals(flag)){
			filePrefix = "抗血小板药物给药时间报表";
		}else if("FIRST_ECG".equals(flag)){
			filePrefix = "首份心电图给药时间报表";
		}else if("KN".equals(flag)){
			filePrefix = "抗凝药给药时间报表";
		}else if("CTA".equals(flag)){
			filePrefix = "CTA激活时间报表";
		}
		
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("年月  ");
		fieldNames.add("平均时间（分钟）  ");
		fieldNames.add("最小值（分钟）  ");
		fieldNames.add("最大值（分钟）  ");
		fieldNames.add("总数      ");

		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");
		fieldCodes.add("minMin");
		fieldCodes.add("maxMin");
		fieldCodes.add("patNumb");

		String hb = filePrefix;
		String gd="";
		StringBuilder sb = new StringBuilder();
		sb.append("查询时间：");
		sb.append(reportCondition.getStartDate());
		sb.append(" - ");
		sb.append(reportCondition.getEndDate());
		gd+=sb.toString();
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);

		// 导出的数据通过service取出
		if(reportCondition.getStartDate()!=null)
			reportCondition.setStartDate(reportCondition.getStartDate().replaceAll("-", ""));
		if(reportCondition.getEndDate()!=null)
			reportCondition.setEndDate(reportCondition.getEndDate().replaceAll("-", ""));
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getXtReport(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObject(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						filePrefix+" ",
						list.size()+"条数据 ",
						webpath//下载地址
				}));
	}
	
	/**
	 * 跳转胸痛患者趋势图
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tocpctrend.do")
	public String toCpcTrend(Model model) throws Exception {
		return "/edpc/report/xtReport/cpctrend";
	}
	/**
	 * 获取胸痛患者趋势图highcharts图表数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/querycpctrend_result.do")
	public @ResponseBody DataGridResultInfo querycpctrend_result(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCpcTrendData(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 获取胸痛患者趋势图datagrid列表数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/querycpctrenddatagrid_result.do")
	public @ResponseBody DataGridResultInfo querycpctrenddatagrid_result(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCpcTrendGridData(reportCondition);
		return dataGridResultInfo;
	}
	
	/**
	 * 导出胸痛患者趋势图
	 * 
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportCpcTrendSubmit.do")
	public @ResponseBody SubmitResultInfo exportZytjlistSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "cpctrend";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("STEMI");
		fieldNames.add("NSTEMI");
		fieldNames.add("UA");
		fieldNames.add("主动脉夹层");
		fieldNames.add("肺栓塞");
		fieldNames.add("非ACS胸痛");
		fieldNames.add("其他");
		fieldNames.add("当月总人数");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("stemi");
		fieldCodes.add("nstemi");
		fieldCodes.add("ua");
		fieldCodes.add("zdmjc");
		fieldCodes.add("fss");
		fieldCodes.add("nacs");
		fieldCodes.add("other");
		fieldCodes.add("total");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "胸痛患者趋势报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCpcTrendGridData(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		int stemiSum = 0, nstemiSum = 0, uaSum = 0, zdmjcSum = 0, fssSum = 0, nacsSum = 0, otherSum = 0, totalSum = 0;
		for(ReportDataResult reportDataResult : list) {
			stemiSum += reportDataResult.getStemi();
			nstemiSum += reportDataResult.getNstemi();
			uaSum += reportDataResult.getUa();
			zdmjcSum += reportDataResult.getZdmjc();
			fssSum += reportDataResult.getFss();
			nacsSum += reportDataResult.getNacs();
			otherSum += reportDataResult.getOther();
			totalSum +=reportDataResult.getTotal();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		sumReportDataResult.setYarmon("合计（人）");
		sumReportDataResult.setStemi(stemiSum);
		sumReportDataResult.setNstemi(nstemiSum);
		sumReportDataResult.setUa(uaSum);
		sumReportDataResult.setZdmjc(zdmjcSum);
		sumReportDataResult.setFss(fssSum);
		sumReportDataResult.setNacs(nacsSum);
		sumReportDataResult.setOther(otherSum);
		sumReportDataResult.setTotal(totalSum);
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"胸痛患者趋势报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 跳转胸痛病例统计图
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tocpcpie.do")
	public String toCpcPie(Model model) throws Exception {
		return "/edpc/report/xtReport/cpcpie";
	}
	
	/**
	 * 获取胸痛病例统计图数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/querycpcpie_result.do")
	public @ResponseBody DataGridResultInfo querycpcpie_result(ReportCondition reportCondition) throws Exception  {
		return eDPCReportService.getCpcPieData(reportCondition);
	}
	
	/**
	 * 导出胸痛患者趋势图
	 * 
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportCpcPieSubmit.do")
	public @ResponseBody SubmitResultInfo exportCpcPieSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "cpcpie";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("胸痛病因诊断");
		fieldNames.add("病例数");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("info");
		fieldCodes.add("total");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "胸痛病例统计报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCpcPieData(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		int sum = 0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getTotal();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		sumReportDataResult.setInfo("合计（例）");
		sumReportDataResult.setTotal(sum);
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"胸痛病例统计报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 跳转创伤患者趋势图
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/totruamatrend.do")
	public String toTruamaTrend(Model model) throws Exception {
		return "/edpc/report/csReport/truamatrend";
	}
	
	/**
	 * 获取创伤患者趋势图数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/querytruamatrend_result.do")
	public @ResponseBody DataGridResultInfo querytruamatrend_result(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getTruamaTrendData(reportCondition);
		return dataGridResultInfo;
	}
	
	/**
	 * 导出创伤患者趋势图
	 * 
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportTruamaTrendSubmit.do")
	public @ResponseBody SubmitResultInfo exportTruamaTrendSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "truamatrend";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("创伤患者数（人）");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("total");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "创伤患者趋势报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getTruamaTrendData(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		int sum = 0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getTotal();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		sumReportDataResult.setYarmon("合计（人）");
		sumReportDataResult.setTotal(sum);
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"创伤患者趋势报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 跳转创伤患者抢救室滞留时间中位数页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toTruamaMedian.do")
	public String toTruamaMedian(Model model) throws Exception {
		return "/edpc/report/csReport/truamamedian";
	}
	
	/**
	 * 获取创伤患者抢救室滞留时间中位数数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/queryTruamaMedian_result.do")
	public @ResponseBody DataGridResultInfo queryTruamaMedianResult(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getTruamaMedianData(reportCondition);
		return dataGridResultInfo;
	}
	
	/**
	 * 导出创伤患者抢救室滞留时间中位数
	 * 
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportTruamaMedianSubmit.do")
	public @ResponseBody SubmitResultInfo exportTruamaMedianSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "zlsjzws";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("抢救室滞留时间中位数（小时）");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("median");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "创伤患者抢救室滞留时间中位数报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getTruamaMedianData(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getMedian();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setMedian(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"创伤患者抢救室滞留时间中位数报表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 跳转严重创伤患者抢救成功率
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toTruamaRescueRate.do")
	public String toTruamaRescueRate(Model model) throws Exception {
		return "/edpc/report/csReport/truamaRescueRate";
	}
	
	/**
	 * 获取严重创伤患者抢救成功率数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/queryTruamaRescueRate_result.do")
	public @ResponseBody DataGridResultInfo queryTruamaRescueRateResult(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getTruamaRescueRate(reportCondition);
		return dataGridResultInfo;
	}
	
	/**
	 * 导出严重创伤患者抢救成功率
	 * 
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportTruamaRescueRateSubmit.do")
	public @ResponseBody SubmitResultInfo exportTruamaRescueRateSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "yzcshzqjcgl";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("抢救成功人数");
		fieldNames.add("总人数");
		fieldNames.add("抢救成功率");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("patNumb");
		fieldCodes.add("total");
		fieldCodes.add("rate");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "严重创伤患者（ISS ≥ 16）抢救成功率";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getTruamaRescueRate(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		int patNumbSum = 0, totalSum = 0;
		double totalRate = 0.0d;
		for(ReportDataResult reportDataResult : list) {
			patNumbSum += reportDataResult.getPatNumb();
			totalSum += reportDataResult.getTotal();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		if(totalSum > 0) {
			totalRate = (double) patNumbSum / (double) totalSum * 100;
			BigDecimal d = new BigDecimal(totalRate);
			sumReportDataResult.setRate(String.valueOf(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()) + "%");
		} else {
			sumReportDataResult.setRate("-");
		}
		
		
		sumReportDataResult.setYarmon(startdateStr + " - " + enddateStr);
		sumReportDataResult.setPatNumb(patNumbSum);
		sumReportDataResult.setTotal(totalSum);
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"严重创伤患者（ISS ≥ 16）抢救成功率",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 跳转院前急救转运时间平均值
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toYqjjzyRate.do")
	public String toYqjjzyRate(Model model) throws Exception {
		return "/edpc/report/csReport/YqjjzyRate";
	}
	
	/**
	 * 获取院前急救转运时间平均值
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/queryYqjjzyRate_result.do")
	public @ResponseBody DataGridResultInfo queryYqjjzyRateResult(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getYqjjzyRate(reportCondition);
		return dataGridResultInfo;
	}
	
	/**
	 * 导出院前急救转运时间平均值
	 * 
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportYqjjzyRateSubmit.do")
	public @ResponseBody SubmitResultInfo exportYqjjzyRateSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "cshzyqjjzysj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("时间(分钟)");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "创伤患者院前急救转运时间平均值";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getYqjjzyRate(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"创伤患者院前急救转运时间平均值",
						list.size(),
						webpath//下载地址
				}));
	}
	
	
	/**
	 * 跳转创伤患者信息预警比例
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/togetCsxxyjRate.do")
	public String togetCsxxyjRate(Model model) throws Exception {
		return "/edpc/report/csReport/CsxxyjRate";
	}
	
	/**
	 * 获取创伤患者信息预警比例
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/queryCsxxyjRate_result.do")
	public @ResponseBody DataGridResultInfo queryCsxxyjRateResult(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsxxyjRate(reportCondition);
		return dataGridResultInfo;
	}
	
	/**
	 * 导出创伤患者信息预警比例
	 * 
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportCsxxyjRateSubmit.do")
	public @ResponseBody SubmitResultInfo exportCsxxyjRateSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "cshzxxyj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("比例（%）");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("tumb");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "创伤患者信息预警比例";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsxxyjRate(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"创伤患者信息预警比例",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 跳转严重创伤病人门/急诊准备时间
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toYzcsbrmjzzbRate.do")
	public String toYzcsbrmjzzbRate(Model model) throws Exception {
		return "/edpc/report/csReport/YzcsbrmjzzbRate";
	}
	
	/**
	 * 获取严重创伤病人门/急诊准备时间
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/queryYzcsbrmjzzbRate_result.do")
	public @ResponseBody DataGridResultInfo queryYzcsbrmjzzbRateResult(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getYzcsbrmjzzbRate(reportCondition);
		return dataGridResultInfo;
	}
	
	/**
	 * 导出严重创伤病人门/急诊准备时间
	 * 
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportYzcsbrmjzzbRateSubmit.do")
	public @ResponseBody SubmitResultInfo exportYzcsbrmjzzbRateSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "csyzhzmjzzbsj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("时间（分钟）");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "严重创伤病人门/急诊准备时间";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsxxyjRate(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"严重创伤病人门/急诊准备时间",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/* -----------------------------------------------------------------------------------*/
	
	/**
	 * STEMI患者发病后2小时内获得首次医疗接触的比例/ 跳转     
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toStemi2Hdyljc")
	public String toStemi2Hdyljc(Model model) throws Exception {
		return View.toEDPC("/report/xtReport/stemi2hdyljc");
	}
	
	
	/**
	 * STEMI患者发病后3小时内获得首次医疗接触的比例/  查询 改3小时
	 * @param reportCondition reportCondition
	 * @return dataGridResultInfo
	 */
	@RequestMapping("/getStemi2Hdyljc_result")
	@ResponseBody
	public DataGridResultInfo getStemi2Hdyljc_result(ReportCondition reportCondition){
		return eDPCReportService.getStemi2HdyljcReport(reportCondition);
	}
	
	/**
	 * STEMI患者发病后2小时内获得首次医疗接触的比例/  导出
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getStemi2Hdyljc_export")
	public @ResponseBody SubmitResultInfo getStemi2Hdyljc_export(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		
		// 导出文件的前缀
		String filePrefix = "STEMI患者发病后3小时内获得首次医疗接触的比例";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("STEMI患者发病后2小时内获得首次医疗接触数");
		fieldNames.add("STEMI患者总数");
		fieldNames.add("比例");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("tnumb");
		fieldCodes.add("patNumb");
		fieldCodes.add("rate");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "STEMI患者发病后3小时内获得首次医疗接触的比例";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		// 首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getYnswlReport(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		int tnumb = 0, patNumb = 0;
		double rate = 0.0d;
		
		for(ReportDataResult reportDataResult : list) {
			tnumb = reportDataResult.getTnumb();
			patNumb = reportDataResult.getPatNumb();
			
			if(patNumb > 0) {
				rate = (double) tnumb / (double) patNumb * 100;
				BigDecimal d = new BigDecimal(rate);
				reportDataResult.setRate(String.valueOf(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()) + "%");
			} else {
				reportDataResult.setRate("-");
			}
			
		}
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"STEMI患者发病后3小时内获得首次医疗接触的比例",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 跳转胸痛中心院内死亡率报表页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toYnswl")
	public String toYnswl(Model model) throws Exception {
		return View.toEDPC("/report/xtReport/ynswl");
	}
	
	
	/**
	 * 胸痛中心院内死亡率报表查询接口
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/ynswl_result")
	@ResponseBody
	public DataGridResultInfo ynswl_result(ReportCondition reportCondition){
		return eDPCReportService.getYnswlReport(reportCondition);
	}
	
	
	@RequestMapping("/ynswl_export")
	public @ResponseBody SubmitResultInfo ynswl_export(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		
		// 导出文件的前缀
		String filePrefix = "STEMI患者院内死亡率";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("STEMI患者院内死亡数");
		fieldNames.add("STEMI患者总数");
		fieldNames.add("死亡率");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("tnumb");
		fieldCodes.add("patNumb");
		fieldCodes.add("rate");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "STEMI患者院内死亡率";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		// 首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getYnswlReport(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		int tnumb = 0, patNumb = 0;
		double rate = 0.0d;
		
		for(ReportDataResult reportDataResult : list) {
			tnumb = reportDataResult.getTnumb();
			patNumb = reportDataResult.getPatNumb();
			
			if(patNumb > 0) {
				rate = (double) tnumb / (double) patNumb * 100;
				BigDecimal d = new BigDecimal(rate);
				reportDataResult.setRate(String.valueOf(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()) + "%");
			} else {
				reportDataResult.setRate("-");
			}
			
		}
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"STEMI患者院内死亡率",
						list.size(),
						webpath//下载地址
				}));
	}
	
	
	/**
	 * 自行来院且接受PPCI治疗的STEMI患者，绕行CCU从急诊科直接送入导管室的比例不低于75%	 单绕
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/torxccubl")
	public String torxccubl(Model model) throws Exception {
		return View.toEDPC("/report/xtReport/rxccubl");
	}
	
	/**
	 * 自行来院且接受PPCI治疗的STEMI患者，绕行CCU从急诊科直接送入导管室的比例不低于75%
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/rxccubl_result")
	@ResponseBody
	public DataGridResultInfo rxccubl_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getRxccublReport(reportCondition);
		
		return dataGridResultInfo;
	}
	
	/**
	 * 经救护车入院（包括呼叫本地120入院及由非PCI医院转诊患者）且接受PPCI治疗的STEMI患者，绕行急诊和CCU直达导管室的比例不低于50%
	 * 双绕
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/torxjzkccubl")
	public String torxjzkccubl(Model model) throws Exception {
		return View.toEDPC("/report/xtReport/rxjzkccubl");
	}
	
	/**
	 * 经救护车入院（包括呼叫本地120入院及由非PCI医院转诊患者）且接受PPCI治疗的STEMI患者，绕行急诊和CCU直达导管室的比例不低于50%
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/rxjzkccubl_result")
	@ResponseBody
	public DataGridResultInfo rxjzkccubl_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getRxjzkccublReport(reportCondition);
		
		return dataGridResultInfo;
	}
	
	
	/**
	 * ACS患者FMC后24小时内接受他汀类药物的比例 / 跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toACS24tatin")
	public String toACS24tatin(Model model) throws Exception {
		return View.toEDPC("/report/xtReport/acs24tatin");
	}
	
	
	/**
	 * ACS患者FMC后24小时内接受他汀类药物的比例 / 获取数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/acs24tatin_result")
	@ResponseBody
	public DataGridResultInfo acs24tatin_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getACS24tatinReport(reportCondition);
		
		return dataGridResultInfo;
	}
	
	/**
	 * ACS患者FMC后24小时内接受他汀类药物的比例 / 导出
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/acs24tatin_export")
	public @ResponseBody SubmitResultInfo acs24tatin_export(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		
		// 导出文件的前缀
		String filePrefix = "ACS患者FMC后24小时内接受他汀类药物的比例";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("STEMI患者院内死亡数");
		fieldNames.add("STEMI患者总数");
		fieldNames.add("死亡率");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("tnumb");
		fieldCodes.add("patNumb");
		fieldCodes.add("rate");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "ACS患者FMC后24小时内接受他汀类药物的比例";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		// 首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getACS24tatinReport(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		int tnumb = 0, patNumb = 0;
		double rate = 0.0d;
		
		for(ReportDataResult reportDataResult : list) {
			tnumb = reportDataResult.getTnumb();
			patNumb = reportDataResult.getPatNumb();
			
			if(patNumb > 0) {
				rate = (double) tnumb / (double) patNumb * 100;
				BigDecimal d = new BigDecimal(rate);
				reportDataResult.setRate(String.valueOf(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()) + "%");
			} else {
				reportDataResult.setRate("-");
			}
			
		}
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"ACS患者FMC后24小时内接受他汀类药物的比例",
						list.size(),
						webpath//下载地址
				}));
	}
	
	
	
	
	/**
	 * 发病12小时内STEMI患者接收再灌注治疗的比例 / 跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toZgzblPage")
	public String toZgzblPage(Model model) throws Exception {
		return View.toEDPC("/report/xtReport/zgzbl");
	}
	
	/**
	 * 发病12小时内STEMI患者接收再灌注治疗的比例 / 获取数据
	 * @param reportCondition reportCondition
	 * @return DataGridResultInfo DataGridResultInfo
	 */
	@RequestMapping("/zgzbl_result")
	@ResponseBody
	public DataGridResultInfo zgzbl_result(ReportCondition reportCondition){
		return eDPCReportService.getZgzblReport(reportCondition);
	}
	
	/**
	 * 经救护车（包括呼叫本地120入院及由非PCI医院转诊患者）入院的STEMI患者，从急救现场或救护车远程传输心电图至胸痛中心
	 *（实时传输或微信等形式传输，但必须在云平台有客观记录）的比例不低于30%且在过去6个月内呈现增加趋势。
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toYccsxdtblPage")
	public String toYccsxdtblPage(Model model) throws Exception {
		return View.toEDPC("/report/xtReport/yccsxdtbl");
	}
	
	
	/**
	 * 经救护车（包括呼叫本地120入院及由非PCI医院转诊患者）入院的STEMI患者，从急救现场或救护车远程传输心电图至胸痛中心
	 *（实时传输或微信等形式传输，但必须在云平台有客观记录）的比例不低于30%且在过去6个月内呈现增加趋势。
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/yccsxdtbl_result")
	@ResponseBody
	public DataGridResultInfo yccsxdtbl_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getYccsxdtblReport(reportCondition);
		
		return dataGridResultInfo;
	}
	
	/**
	 * 溶栓后患者（包含网络医院，120及本院）24小时内早期造影的比例不低于75%
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toRshzyblPage")
	public String toRshzyblPage(Model model) throws Exception {
		return View.toEDPC("/report/xtReport/rshzybl");
	}
	
	
	/**
	 * 溶栓后患者（包含网络医院，120及本院）24小时内早期造影的比例不低于75%
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/rshzybl_result")
	@ResponseBody
	public DataGridResultInfo rshzybl_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getRshzyblReport(reportCondition);
		
		return dataGridResultInfo;
	}
	
	/**
	 * 发病12小时内STEMI患者接收再灌注治疗的比例 / 导出
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zgzbl_export")
	public @ResponseBody SubmitResultInfo zgzbl_export(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		
		// 导出文件的前缀
		String filePrefix = "发病12小时内STEMI患者接收再灌注治疗的比例";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("发病12小时内接受再灌注治疗措施的STEMI患者数");
		fieldNames.add("STEMI患者总数");
		fieldNames.add("比例");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("tnumb");
		fieldCodes.add("patNumb");
		fieldCodes.add("rate");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "发病12小时内STEMI患者接收再灌注治疗的比例";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		// 首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getACS24tatinReport(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		int tnumb = 0, patNumb = 0;
		double rate = 0.0d;
		
		for(ReportDataResult reportDataResult : list) {
			tnumb = reportDataResult.getTnumb();
			patNumb = reportDataResult.getPatNumb();
			
			if(patNumb > 0) {
				rate = (double) tnumb / (double) patNumb * 100;
				BigDecimal d = new BigDecimal(rate);
				reportDataResult.setRate(String.valueOf(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()) + "%");
			} else {
				reportDataResult.setRate("-");
			}
			
		}
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"发病12小时内STEMI患者接收再灌注治疗的比例",
						list.size(),
						webpath//下载地址
				}));
	}
	
	
	
	
	/**
	 * STEMI患者S2FMC时间 / 跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tos2fmcPage")
	public String tos2fmcPage(Model model) throws Exception {
		return View.toEDPC("/report/xtReport/s2fmc");
	}
	
	
	
	/**
	 * STEMI患者S2FMC时间 / 获取数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/s2fmc_result")
	@ResponseBody
	public DataGridResultInfo s2fmc_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getS2fmcReport(reportCondition);
		
		return dataGridResultInfo;
	}
	
	
	
	
	
	/**
	 * STEMI患者S2FMC时间 / 导出
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/s2fmc_export")
	public @ResponseBody SubmitResultInfo s2fmc_export(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		
		// 导出文件的前缀
		String filePrefix = "STEMI患者S2FMC时间";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均值");
		fieldNames.add("最小值");
		fieldNames.add("最大值");
		fieldNames.add("总数");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");
		fieldCodes.add("minMin");
		fieldCodes.add("maxMin");
		fieldCodes.add("patNumb");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "STEMI患者S2FMC时间";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		// 首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getS2fmcReport(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"STEMI患者S2FMC时间",
						list.size(),
						webpath//下载地址
				}));
	}
	/**
	 * 导出医疗机构脑卒中诊疗情况调查表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportYljgnczzlqkdcbZx")
	public @ResponseBody SubmitResultInfo exportYljgnczzlqkdcbZx(HttpServletRequest request,
			HspemginfQueryDto hspemginfQueryDto) throws Exception{
		InputStream excelIn = new FileInputStream(request.getSession().getServletContext().getRealPath("/")
					+"template/1.xls");
		Workbook workbook = WorkbookFactory.create(excelIn);
		Sheet sheet = workbook.getSheet("Sheet2");
		Row row3 = sheet.getRow(3);
		Map<Integer, String> map = czService.getYljgczzlqkdcb(hspemginfQueryDto);
		for(int i=0;i<map.size();i++){
			row3.createCell(i).setCellValue(map.get(i));
		}
		
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		String path = filePath + "附件1：医疗机构脑卒中诊疗情况调查表（在线填报）.xls";
		FileOutputStream out = new FileOutputStream(path);
		workbook.write(out);
		out.flush();
		out.close();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"附件1：医疗机构脑卒中诊疗情况调查表（在线填报）.xls",
						1,
						"export/附件1：医疗机构脑卒中诊疗情况调查表（在线填报）.xls"//下载地址
				}));
	}
	
	/**
	 * 导出急性缺血性卒中早期动脉内介入治疗病例登记表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportJxqxxczdcjmrsbldjb")
	public @ResponseBody SubmitResultInfo exportJxqxxczdcjmrsbldjb(HttpServletRequest request,
			HspemginfQueryDto hspemginfQueryDto) throws Exception{
		InputStream excelIn = new FileInputStream(request.getSession().getServletContext().getRealPath("/")
				+"template/3.xlsx");
		Workbook workbook = WorkbookFactory.create(excelIn);
		Sheet sheet = workbook.getSheet("Sheet2");
		Row row3 = sheet.getRow(3);
		Map<Integer, String> map = czService.getYljgczzlqkdcb(hspemginfQueryDto);
		for(int i=0;i<map.size();i++){
			row3.createCell(i).setCellValue(map.get(i));
		}
		
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		String path = filePath + "附件3：急性缺血性卒中单纯静脉溶栓病例登记表(在线填报).xlsx";
		FileOutputStream out = new FileOutputStream(path);
		workbook.write(out);
		out.flush();
		out.close();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"附件3：急性缺血性卒中单纯静脉溶栓病例登记表(在线填报).xlsx",
						1,
						"export/附件3：急性缺血性卒中单纯静脉溶栓病例登记表(在线填报).xlsx"//下载地址
				}));
	}
	
	/**
	 * 导出急性缺血性卒中早期动脉内介入治疗病例登记表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportYljgnczzlqkdcbSc")
	public @ResponseBody SubmitResultInfo exportYljgnczzlqkdcbSc(HttpServletRequest request,
			HspemginfQueryDto hspemginfQueryDto) throws Exception{
		InputStream excelIn = new FileInputStream(request.getSession().getServletContext().getRealPath("/")
				+"template/4.xls");
		Workbook workbook = WorkbookFactory.create(excelIn);
		Sheet sheet = workbook.getSheet("Sheet2");
		Row row3 = sheet.getRow(3);
		Map<Integer, String> map = czService.getYljgczzlqkdcb(hspemginfQueryDto);
		for(int i=0;i<map.size();i++){
			row3.createCell(i).setCellValue(map.get(i));
		}
		
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		String path = filePath + "附件4：医疗机构脑卒中诊疗情况调查表（上传扫描版）.xls";
		FileOutputStream out = new FileOutputStream(path);
		workbook.write(out);
		out.flush();
		out.close();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"附件4：医疗机构脑卒中诊疗情况调查表（上传扫描版）.xls",
						1,
						"export/附件4：医疗机构脑卒中诊疗情况调查表（上传扫描版）.xls"//下载地址
				}));
	}
	
	
	/**
	 * 导出急性缺血性卒中早期动脉内介入治疗病例登记表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportJxqxxczzqdmnjrzlbldjb")
	public @ResponseBody SubmitResultInfo exportJxqxxczzqdmnjrzlbldjb(HttpServletRequest request,
			HspemginfQueryDto hspemginfQueryDto) throws Exception{
		InputStream excelIn = new FileInputStream(request.getSession().getServletContext().getRealPath("/")
				+"template/2.xlsx");
		Workbook workbook = WorkbookFactory.create(excelIn);
		Sheet sheet = workbook.getSheet("Sheet2");
		Row row3 = sheet.getRow(3);
		Map<Integer, String> map = czService.getYljgczzlqkdcb(hspemginfQueryDto);
		for(int i=0;i<map.size();i++){
			row3.createCell(i).setCellValue(map.get(i));
		}
		
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		String path = filePath + "附件2：急性缺血性卒中早期动脉内介入治疗病例登记表(在线填报).xlsx";
		FileOutputStream out = new FileOutputStream(path);
		workbook.write(out);
		out.flush();
		out.close();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"附件2：急性缺血性卒中早期动脉内介入治疗病例登记表(在线填报).xlsx",
						1,
						"export/附件2：急性缺血性卒中早期动脉内介入治疗病例登记表(在线填报).xlsx"//下载地址
				}));
	}
	
	/**
	 * 获取卒中首页数据
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getCzFirstPageInfo")
	public @ResponseBody SubmitResultInfo getCzFirstPageInfo() throws Exception{
		ResultInfo resultInfo = czService.getCzFirstPageInfo();
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取卒中 来院方式比例
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getLyfstCz")
	public @ResponseBody DataGridResultInfo getLyfstCz(ReportCondition reportCondition) throws Exception{
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getLyfstCz(reportCondition);
		return dataGridResultInfo;
	}
	
	/**
	 * 获取 卒中 转归情况比例
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getZgqkCz")
	public @ResponseBody DataGridResultInfo getZgqkCz(ReportCondition reportCondition) throws Exception{
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getZgqkCz(reportCondition);
		return dataGridResultInfo;
	}
	
	/**
	 * 获取 卒中 诊断统计比例
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getZdtjCz")
	public @ResponseBody DataGridResultInfo getZdtjCz(ReportCondition reportCondition) throws Exception{
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getZdtjCz(reportCondition);
		return dataGridResultInfo;
	}
	
	/**
	 * 获取 卒中 患者趋势图
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getCzhzqst")
	public @ResponseBody DataGridResultInfo getCzhzqst(ReportCondition reportCondition) throws Exception{
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCzhzqst(reportCondition);
		return dataGridResultInfo;
	}
	
	/**
	 * 获取 卒中 关键质控趋势图
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getCzgjzkqst")
	public @ResponseBody DataGridResultInfo getCzgjzkqst(ReportCondition reportCondition) throws Exception{
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCzgjzkqst(reportCondition);
		return dataGridResultInfo;
	}
	
	/*------------------------------------------------------------------------------*/
	/**
	 * 卒中病人发病6小时内溶栓的病人/ 跳转     
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/6RSbR")
	public String toget6RSbRReport(Model model) throws Exception {
		return View.toEDPC("/report/xtReport/6RSbR");
	}
	
	
	/**
	 * 卒中病人发病6小时内溶栓的病人的比例/  查询
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/get6RSbR_result")
	@ResponseBody
	public DataGridResultInfo get6RSbR_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.get6RSbRReport(reportCondition);
		
		return dataGridResultInfo;
	}
	
	/**
	 * 卒中病人发病6小时内溶栓的病人的比例/  导出
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/get6RSbR_export")
	public @ResponseBody SubmitResultInfo get6RSbR_export(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		
		// 导出文件的前缀
		String filePrefix = "卒中病人发病6小时后的溶栓的病人比例";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("卒中病人发病6小时内溶栓的病人数");
		fieldNames.add("溶栓病人总数");
		fieldNames.add("比例");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("tnumb");
		fieldCodes.add("patNumb");
		fieldCodes.add("rate");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "卒中病人发病6小时内溶栓的病人的比例";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		// 首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.get6RSbRReport(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		int tnumb = 0, patNumb = 0;
		double rate = 0.0d;
		
		for(ReportDataResult reportDataResult : list) {
			tnumb = reportDataResult.getTnumb();
			patNumb = reportDataResult.getPatNumb();
			
			if(patNumb > 0) {
				rate = (double) tnumb / (double) patNumb * 100;
				BigDecimal d = new BigDecimal(rate);
				reportDataResult.setRate(String.valueOf(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()) + "%");
			} else {
				reportDataResult.setRate("-");
			}
			
		}
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"卒中病人发病6小时内的溶栓的病人的比例",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * STEMI患者发病后12小时内获得首次医疗接触的比例/ 跳转     
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toStemi12Hdyljc")
	public String toStemi12Hdyljc(Model model) throws Exception {
		return View.toEDPC("/report/xtReport/stemi12hdyljc");
	}
	
	
	/**
	 * STEMI患者发病后12小时内获得首次医疗接触的比例/  查询
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/getStemi12Hdyljc_result")
	@ResponseBody
	public DataGridResultInfo getStemi12Hdyljc_result(ReportCondition reportCondition){
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getStemi12HdyljcReport(reportCondition);
		
		return dataGridResultInfo;
	}
	
	/**
	 * STEMI患者发病后12小时内获得首次医疗接触的比例/  导出
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getStemi12Hdyljc_export")
	public @ResponseBody SubmitResultInfo getStemi12Hdyljc_export(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		
		// 导出文件的前缀
		String filePrefix = "STEMI患者发病后12小时内获得首次医疗接触的比例";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("STEMI患者发病后12小时内获得首次医疗接触数");
		fieldNames.add("STEMI患者总数");
		fieldNames.add("比例");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("tnumb");
		fieldCodes.add("patNumb");
		fieldCodes.add("rate");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "STEMI患者发病后12小时内获得首次医疗接触的比例";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		// 首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getStemi12HdyljcReport(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		int tnumb = 0, patNumb = 0;
		double rate = 0.0d;
		
		for(ReportDataResult reportDataResult : list) {
			tnumb = reportDataResult.getTnumb();
			patNumb = reportDataResult.getPatNumb();
			
			if(patNumb > 0) {
				rate = (double) tnumb / (double) patNumb * 100;
				BigDecimal d = new BigDecimal(rate);
				reportDataResult.setRate(String.valueOf(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()) + "%");
			} else {
				reportDataResult.setRate("-");
			}
			
		}
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"STEMI患者发病后12小时内获得首次医疗接触的比例",
						list.size(),
						webpath//下载地址
				}));
	}
	
//	/**
//	 * 胸痛诊断为急性心肌梗死发病时间12小时内的病人/ 跳转     
//	 * @param model
//	 * @return
//	 * @throws Exception
//	 */
//	@RequestMapping("/toXjgs12Hnbr")
//	public String togetXjgs12HnbrReport(Model model) throws Exception {
//		return View.toEDPC("/report/xtReport/6RSbR");
//	}
//	
//	
//	/**
//	 * 胸痛诊断为急性心肌梗死发病时间12小时内的病人的比例/  查询
//	 * @param reportCondition
//	 * @return
//	 */
//	@RequestMapping("/getXjgs12Hnbr_result")
//	@ResponseBody
//	public DataGridResultInfo getXjgs12HnbrReport_result(ReportCondition reportCondition){
//		
//		DataGridResultInfo dataGridResultInfo = eDPCReportService.getXjgs12HnbrReport(reportCondition);
//		
//		return dataGridResultInfo;
//	}
//	
//	/**
//	 * 胸痛诊断为急性心肌梗死发病时间12小时内的病人的比例/  导出
//	 * @param reportCondition
//	 * @return
//	 * @throws Exception
//	 */
//	@RequestMapping("/getXjgs12Hnbr_export")
//	public @ResponseBody SubmitResultInfo getXjgs12HnbrReport_export(ReportCondition reportCondition) throws Exception {
//		//获取虚拟目录指向实际路径
//		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
//		
//		// 导出文件的前缀
//		String filePrefix = "胸痛诊断为急性心肌梗死发病时间12小时内的病人比例";
//		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
//		int flushRows = 100;
//		// 定义导出数据的title
//		List<String> fieldNames = new ArrayList<String>();
//		fieldNames.add("月份");
//		fieldNames.add("胸痛诊断为急性心肌梗死发病时间12小时内的病人数");
//		fieldNames.add("胸痛病人总数");
//		fieldNames.add("比例");
//		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
//		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
//		List<String> fieldCodes = new ArrayList<String>();
//		fieldCodes.add("yarmon");
//		fieldCodes.add("tnumb");
//		fieldCodes.add("patNumb");
//		fieldCodes.add("rate");
//
//		String gd ="查询范围：";
//		String startdateStr = reportCondition.getStartDate();
//		gd = gd + "时间：" + startdateStr;
//		String enddateStr = reportCondition.getEndDate();
//		gd = gd + " 至 " + enddateStr;
//		String hb = "卒中病人发病6小时后溶栓的病人的比例";
//		// 开始导出，执行一些workbook及sheet等对象的初始创建
//		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
//				"export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
//		// 首次查询时默认赋值系统当天日期
//		
//		DataGridResultInfo dataGridResultInfo = eDPCReportService.get6RSbRReport(reportCondition);
//		
//		@SuppressWarnings("unchecked")
//		List<ReportDataResult> list = dataGridResultInfo.getRows();
//		int tnumb = 0, patNumb = 0;
//		double rate = 0.0d;
//		
//		for(ReportDataResult reportDataResult : list) {
//			tnumb = reportDataResult.getTnumb();
//			patNumb = reportDataResult.getPatNumb();
//			
//			if(patNumb > 0) {
//				rate = (double) tnumb / (double) patNumb * 100;
//				BigDecimal d = new BigDecimal(rate);
//				reportDataResult.setRate(String.valueOf(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()) + "%");
//			} else {
//				reportDataResult.setRate("-");
//			}
//			
//		}
//		
//		// 执行导出
//		excelExportSXXSSF.writeDatasByObjectSy(list);
//		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
//		String webpath = excelExportSXXSSF.exportFile();
//		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
//				Config.MESSAGE, 914, new Object[] {
//						"卒中病人发病6小时后的溶栓的病人的比例",
//						list.size(),
//						webpath//下载地址
//				}));
//	}
	
	/**
	 * 发病12小时内诊断为STEMI的患者给予溶栓或介入的占比/ 跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toStemiRSorJR")
	public String toStemiRSorJR(Model model) throws Exception {
       return View.toEDPC("/report/xtReport/stemirsorjr");
	}
	/**
	 * 发病12小时内诊断为STEMI的患者给予溶栓或介入的占比/ 查询
	 * @param reportCondition)
	 * @return
	 */
	@RequestMapping("/getStemiRSorJR_result")
	@ResponseBody
	public DataGridResultInfo getStemiRSorJR_result(ReportCondition reportCondition){

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getStemiRSorJRReport(reportCondition);

		return dataGridResultInfo;
	}
	
	/**
	 * 发病12小时内诊断为STEMI的患者给予溶栓或介入的占比/  导出
	 * @param reportCondition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getStemiRSorJR_export")
	public @ResponseBody SubmitResultInfo getStemiRSorJR_export(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		
		// 导出文件的前缀
		String filePrefix = "发病12小时内诊断为STEMI的患者给予溶栓或介入的占比";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("发病12小时内给予溶栓或介入的人数");
		fieldNames.add("STEMI患者总数");
		fieldNames.add("比例");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("tnumb");
		fieldCodes.add("patNumb");
		fieldCodes.add("rate");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "发病12小时内诊断为STEMI的患者给予溶栓或介入的占比";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		// 首次查询时默认赋值系统当天日期
		
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getStemiRSorJRReport(reportCondition);
		
		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		int tnumb = 0, patNumb = 0;
		double rate = 0.0d;
		
		for(ReportDataResult reportDataResult : list) {
			tnumb = reportDataResult.getTnumb();
			patNumb = reportDataResult.getPatNumb();
			
			if(patNumb > 0) {
				rate = (double) tnumb / (double) patNumb * 100;
				BigDecimal d = new BigDecimal(rate);
				reportDataResult.setRate(String.valueOf(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()) + "%");
			} else {
				reportDataResult.setRate("-");
			}
			
		}
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"发病12小时最后诊断为STEMI的患者给予溶栓或介入的占比",
						list.size(),
						webpath//下载地址
				}));
	}




	/*-------------院前急救转运时间-----------*/
	/**
	 * 跳转院前急救转运时间
	 * */
	@RequestMapping("/toPreHospitalFirstAidTransferTime")
	public String toPreHospitalFirstAidTransferTime(Model model ){
		return "/edpc/report/csReport/preHospitalFirstAidTransferTime";
	}

	@RequestMapping("/queryPreHospitalFirstAidTransferTime")
	public @ResponseBody DataGridResultInfo preHospitalFirstAidTransferTime(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getPreHospitalFirstAidTransferTime(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 导出院前急救转运时间数据
	 * */
	@RequestMapping("/exportPreHospitalFirstAidTransferTime")
	public @ResponseBody SubmitResultInfo exportPreHospitalFirstAidTransferTime(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "PreHospitalFirstAidTransferTime";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "院前急救转运时间报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getPreHospitalFirstAidTransferTime(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"院前急救转运时间报表",
						list.size(),
						webpath//下载地址
				}));

	}
	/*-------------------------门/急诊准备时间(严重创伤病人）----------------------------------*/
	/**
	 *  门/急诊准备时间(严重创伤病人）
	 * */
	@RequestMapping("/toPatientPreparationTime")
	public String toPatientPreparationTime(Model model){
		return "/edpc/report/csReport/patientpreparationtime";
	}
	/**
	 * 门/急诊准备时间(严重创伤病人）获取数据
	 * */
	@RequestMapping("/queryPatientPreparationTime")
	public @ResponseBody DataGridResultInfo getPatientPreparationTime(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getPatientPreparationTime(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 门/急诊准备时间(严重创伤病人）导出数据
	 * */
	@RequestMapping("/exportPatientPreparationTime")
	public @ResponseBody SubmitResultInfo exportPatientPreparationTime(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "PatientPreparationTime";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "准备时间(严重创伤病人）报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getPatientPreparationTime(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"准备时间(严重创伤病人）报表",
						list.size(),
						webpath//下载地址
				}));
	}

	/*------------------到达门/急诊科至完成全身快速CT时间(严重创伤病人）------------------------------------------*/
	/**
	 * 跳转到达门/急诊科至完成全身快速CT时间(严重创伤病人）
	 *
	 * */
	@RequestMapping("/toCsFastCtTime")
	public String toCsFastCtTime(Model model){
		return "/edpc/report/csReport/csfastcttime";
	}
	/**
	 * 获取到达门/急诊科至完成全身快速CT时间数据
	 * */
	@RequestMapping("/queryCsFastCtTime")
	public @ResponseBody DataGridResultInfo getCsFastCtTime(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsFastCtTime(reportCondition);
		return dataGridResultInfo;
	}
	@RequestMapping("/exportCsFastCtTime")
	public @ResponseBody SubmitResultInfo exportCsFastCtTime(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "CsFastCtTime";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "完成全身快速CT时间(严重创伤病人）报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsFastCtTime(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"完成全身快速CT时间(严重创伤病人）报表",
						list.size(),
						webpath//下载地址
				}));

	}
	/*----------------到达门/急诊科至完成全身胸部X片的时间(严重创伤病人）-----------------------------------------*/
	/**
	 *跳转到达门/急诊科至完成全身胸部x片的时间
	 **/
	@RequestMapping("/toCsCompleteFullBodyChestXray")
	public String toCsCompleteFullBodyChestXray(Model model ){
		return "/edpc/report/csReport/cscompletefullbodychestxray";
	}
	/**
	 * 获取数据
	 * */
	@RequestMapping("/queryCsCompleteFullBodyChestXray")
	public @ResponseBody DataGridResultInfo getCsCompleteFullBodyChestXray(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsCompleteFullBodyChestXray(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 导出数据
	 * */
	@RequestMapping("/exportCsCompleteFullBodyChestXray")
	public @ResponseBody SubmitResultInfo exportCsCompleteFUllBodyChestXray(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "CsCompleteFullBodyChestXray";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "完成全身胸部X片的时间(严重创伤病人）报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsCompleteFullBodyChestXray(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"完成全身胸部X片的时间(严重创伤病人）报表",
						list.size(),
						webpath//下载地址
				}));
	}

	/*------------------------------到达门/急诊科至完成全身骨盆X片时间(严重创伤病人）--------------------------------*/
	/**
	 * 跳转页面
	 * */
	@RequestMapping("/toCsPenguXrayTime")
	public String toCsPenguXrayTime(Model model){
		return "/edpc/report/csReport/cspenguxraytime";
	}
	/**
	 * 获取数据
	 * */
	@RequestMapping("/queryPenguXrayTime")
	public @ResponseBody DataGridResultInfo getPenguXrayTime(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getPenguXrayTime(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 导出数据
	 * */
	@RequestMapping("/exportPenguXrayTime")
	public @ResponseBody SubmitResultInfo exportPenguXrayTime(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "CsPenguXrayTime";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "完成全身骨盆X片时间(严重创伤病人）报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getPenguXrayTime(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"完成全身骨盆X片时间(严重创伤病人）报表",
						list.size(),
						webpath//下载地址
				}));
	}
	/*----------------------到达门/急诊科至完成FAST检查的时间(严重创伤病人）---------------------------------------*/
	/**
	 * 跳转页面
	 * */
	@RequestMapping("/toCsFastJcTime")
	public String toCsFastJcTime(Model model){
		return "/edpc/report/csReport/csfastjctime";
	}
	/**
	 * 获取数据
	 * */
	@RequestMapping("/queryCsFastJcTime")
	public @ResponseBody DataGridResultInfo getCsFastJcTime(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsFastJcTime(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 导出数据
	 * */
	@RequestMapping("/exportCsFastJcTime")
	public SubmitResultInfo exportCsFastJcTime(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "CsFastJcTime";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "完成FAST检查的时间(严重创伤病人）报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsFastJcTime(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"完成FAST检查的时间(严重创伤病人）报表",
						list.size(),
						webpath//下载地址
				}));
	}
	/*------------------------------------门/急诊输血准备时间(严重创伤病人）--------------------------------*/
	/**
	 * 跳转页面
	 * */
	@RequestMapping("/toCsShuXueTime")
	public String toCsShuXueTime(Model model){
		return "/edpc/report/csReport/csshuxuetime";
	}
	/**
	 * 获取数据
	 * */
	@RequestMapping("/queryCsShuXueTime")
	public @ResponseBody DataGridResultInfo getCsShuXueTime(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsShuXueTime(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 导出数据
	 * */
	@RequestMapping("/exportCsShuXueTime")
	public SubmitResultInfo exportCsShuXueTime(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "CsShuXueTime";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "输血准备时间(严重创伤病人）报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsShuXueTime(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"输血准备时间(严重创伤病人）报表",
						list.size(),
						webpath//下载地址
				}));
	}
	/*-----------------人工气道建立时间(严重创伤病人）------------------------------------*/
	/**
	 * 跳转页面
	 * */
	@RequestMapping("/toCsRenGongqdTime")
	public String toCsRenGongqdTime(){
		return "/edpc/report/csReport/csrengongqdtime";
	}
	/**
	 * 获取数据
	 * */
	@RequestMapping("/queryCsRenGongqdTime")
	public @ResponseBody DataGridResultInfo getCsRenGongqdTime(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsRenGongqdTime(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 导出数据
	 * */
	@RequestMapping("/exportCsRenGongqdTime")
	public SubmitResultInfo exportCsRenGongqdTime(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "rgqdjlsj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "人工气道建立时间(严重创伤病人）报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsRenGongqdTime(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"人工气道建立时间(严重创伤病人）报表",
						list.size(),
						webpath//下载地址
				}));
	}
	/*--------------紧急手术术前准备时间(严重创伤病人）----------------------*/
	/**
	 * 跳转页面
	 * */
	@RequestMapping("/toCsJingJissTime")
	public String toCsJingjissTime(Model model){
		return "/edpc/report/csReport/csjingjisstime";
	}
	/**
	 * 获取数据
	 * */
	@RequestMapping("/queryCsJingjissTime")
	public @ResponseBody DataGridResultInfo getCsJingJissTime(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsJingJissTime(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 导出数据
	 * */
	@RequestMapping("/exportCsJingjissTime")
	public SubmitResultInfo exportCsJingjissTime(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "jjsssqzb";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "紧急手术术前准备时间(严重创伤病人）报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsJingJissTime(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"紧急手术术前准备时间(严重创伤病人）报表",
						list.size(),
						webpath//下载地址
				}));
	}

	/*------------------门/急诊科停留时间-----------------*/
	/**
	 *跳转页面
	 * */
	@RequestMapping("/toCsMjzTingliuTime")
	public String toCsMjzTingliuTime(Model model){
		return "/edpc/report/csReport/csmjztingliutime";
	}
	/**
	 * 获取数据
	 * */
	@RequestMapping("/queryCsMjzTingliuTime")
	public @ResponseBody DataGridResultInfo getCsMjzTingliuTime(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsMjzTingliuTime(reportCondition);
		return dataGridResultInfo;
	}
	@RequestMapping("/exportCsMjzTingliuTime")
	public SubmitResultInfo exportCsMjzTingliuTime(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "tlsj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "病人停留时间报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsMjzTingliuTime(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"病人停留时间报表报表",
						list.size(),
						webpath//下载地址
				}));
	}
	/*---------------严重创伤病人平均住院时间----------------------------------*/
	/**
	 * 跳转页面
	 * */
	@RequestMapping("/toCsyzZhuyTime")
	public String toCsyzZhuyTime(Model model){
		return "/edpc/report/csReport/csyzzhuytime";
	}
	/**
	 * 获取数据
	 * */
	@RequestMapping("/queryCsyzZhuyTime")
	public @ResponseBody DataGridResultInfo getCsyzZuhyTime(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsyzZuhyTime(reportCondition);
		return dataGridResultInfo;
	}
	@RequestMapping("/exportCsyzZhuyTime")
	public SubmitResultInfo exportCsyzZhuyTime(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "pingjunzysj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "严重创伤病人平均住院时间";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsyzZuhyTime(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"严重创伤病人平均住院时间",
						list.size(),
						webpath//下载地址
				}));
	}
	/*--------------------严重创伤病人ICU住院时间--------------------------*/
	/**
	 * 跳转页面
	 * */
	@RequestMapping("/toCsyzICUTime")
	public String toCsyzICUTime(Model model){
		return "/edpc/report/csReport/CsyzICUTime";
	}
	/**
	 * 获取数据
	 * */
	@RequestMapping("/queryCsyzICUTime")
	public @ResponseBody DataGridResultInfo getCsyzICUTime(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsyzICUTime(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 导出数据
	 * */
	@RequestMapping("/exportCsyzICUTime")
	public SubmitResultInfo exportCsyzICUTime(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "yzbrIcuZhuyuan";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "严重创伤病人ICU住院时间";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsyzICUTime(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getAvgTime();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（小时）");
		sumReportDataResult.setAvgTime(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"严重创伤病人ICU住院时间",
						list.size(),
						webpath//下载地址
				}));
	}
	/*--------------------创伤病人数量---------------------------------------------*/
	@RequestMapping("/toCsPatientNum")
	public String toCsPatientNum(Model model){
		return "/edpc/report/csReport/cspatientnum";
	}
	@RequestMapping("/queryCsPatientNum")
	public @ResponseBody DataGridResultInfo getCsPatientNum(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsPatientNum(reportCondition);
		return dataGridResultInfo;
	}
	@RequestMapping("/exportCsPatientNum")
	public SubmitResultInfo exportCsPatientNum(ReportCondition reportCondition) throws Exception{
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "csbingrensl";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("平均时间");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("avgTime");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "创伤病人数量";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsPatientNum(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getTotal();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("人数");
		sumReportDataResult.setMedian(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"创伤病人数量",
						list.size(),
						webpath//下载地址
				}));
	}
	/**
	 * 跳转创伤患者急诊科停留时间中位数页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toCsjztlMedian.do")
	public String toCsjztlMedian(Model model) throws Exception {
		return "/edpc/report/csReport/csjztlmedian";
	}
	/**
	 * 获取创伤患者急诊科停留时间中位数数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/queryCsjztlMedian_result.do")
	public @ResponseBody DataGridResultInfo CsjztlMedianMedianResult(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsjztlMedianData(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 导出创伤患者急诊科停留时间中位数
	 *
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportCsjztlMedianSubmit.do")
	public @ResponseBody SubmitResultInfo exportCsjztlMedianSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "csjztl";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("创伤患者急诊科停留时间中位数（分钟）");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("median");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "创伤患者急诊科停留时间中位数报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsjztlMedianData(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getMedian();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（分钟）");
		sumReportDataResult.setMedian(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"创伤患者急诊科停留时间中位数报表",
						list.size(),
						webpath//下载地址
				}));
	}

	//-------------------------------------------------------
	/**
	 * 跳转创伤患者急诊输血准备时间中位数页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toCsjzxsMedian.do")
	public String toCsjzxsMedian(Model model) throws Exception {
		return "/edpc/report/csReport/csjzxsmedian";
	}

	/**
	 * 获取创伤患者急诊输血准备时间时间中位数数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/queryCsjzxsMedian_result.do")
	public @ResponseBody DataGridResultInfo CsjzxsMedianMedianResult(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsjzsxMedianDate(reportCondition);
		return dataGridResultInfo;
	}

	/**
	 * 导出创伤患者急诊科停留时间中位数
	 *
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportCsjzxsMedianSubmit.do")
	public @ResponseBody SubmitResultInfo exportCsjzxsMedianSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "csjzxs";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("创伤患者急诊输血准备时间中位数（分钟）");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("median");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "创伤患者急诊输血准备时间中位数报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsjzsxMedianDate(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getMedian();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("平均值（分钟）");
		sumReportDataResult.setMedian(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"创伤患者急诊输血准备时间中位数报表",
						list.size(),
						webpath//下载地址
				}));
	}
	//-------------------------------------------------------
	/**
	 * 跳转创伤患者严重创伤病人数量页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toCsyzbrMedian.do")
	public String toCsyzbrMedian(Model model) throws Exception {
		return "/edpc/report/csReport/csyzbrmedian";
	}

	/**
	 * 获取严重创伤病人数量数据
	 * @param reportCondition
	 * @return
	 */
	@RequestMapping("/queryCsyzbrMedian_result.do")
	public @ResponseBody DataGridResultInfo CsyzbrMedianMedianResult(ReportCondition reportCondition) throws Exception  {
		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsyzbrMedianDate(reportCondition);
		return dataGridResultInfo;
	}
	/**
	 * 导出严重创伤病人数量
	 *
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportCsyzbrMedianSubmit.do")
	public @ResponseBody SubmitResultInfo exportCsyzbrMedianSubmit(ReportCondition reportCondition) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");
		// 导出文件的前缀
		String filePrefix = "csyzbr";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("月份");
		fieldNames.add("严重创伤病人数");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("yarmon");
		fieldCodes.add("median");

		String gd ="查询范围：";
		String startdateStr = reportCondition.getStartDate();
		gd = gd + "时间：" + startdateStr;
		String enddateStr = reportCondition.getEndDate();
		gd = gd + " 至 " + enddateStr;
		String hb = "严重创伤病人数量报表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		//首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = eDPCReportService.getCsyzbrMedianDate(reportCondition);

		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();
		double sum = 0.0;
		for(ReportDataResult reportDataResult : list) {
			sum += reportDataResult.getMedian();
		}
		ReportDataResult sumReportDataResult = new ReportDataResult();
		double average = sum/(double)list.size();
		BigDecimal d = new BigDecimal(average);
		sumReportDataResult.setYarmon("人数");
		sumReportDataResult.setMedian(d.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		list.add(sumReportDataResult);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"严重创伤病人数量报表",
						list.size(),
						webpath//下载地址
				}));
	}
}
