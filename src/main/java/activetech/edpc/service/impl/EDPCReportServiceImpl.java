package activetech.edpc.service.impl;

import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.edpc.dao.mapper.EDPCReportMapperCustom;
import activetech.edpc.pojo.dto.HomePageResult;
import activetech.edpc.pojo.dto.ProCode;
import activetech.edpc.pojo.dto.ReportCondition;
import activetech.edpc.pojo.dto.ReportDataResult;
import activetech.edpc.service.EDPCReportService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class EDPCReportServiceImpl implements EDPCReportService{
	
	@Autowired
	private EDPCReportMapperCustom eDPCReportMapperCustom;

	@Override
	public DataGridResultInfo getCzNIHSSRate(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCzNIHSSRate(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getD2dmqsTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getD2dmqsTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getctAvgTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getctAvgTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getrsTimeUpToStandardRate(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getrsTimeUpToStandardRate(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getin60MinRsRate(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getin60MinRsRate(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCpcTrendData(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCpcTrendData(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCpcTrendGridData(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCpcTrendGridData(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getCpcPieData(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCpcPieData(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getTruamaTrendData(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getTruamaTrendData(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getTruamaMedianData(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getZlsjzwsData(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getYqjjzyRate(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getYqjjzyRate(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getCsxxyjRate(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsxxyjRate(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getYzcsbrmjzzbRate(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getYzcsbrmjzzbRate(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getTruamaRescueRate(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getTruamaRescueRate(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	/**
	 * 新加
	 */
	@Override
	public DataGridResultInfo getCsyzhzdyqjData(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsyzhzdyqjData(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getXtReport(ReportCondition reportCondition) {
		String flag = reportCondition.getReportTypeFlag();
		List<ReportDataResult> list = null;
		if("DGSJH".equals(flag)){
			// 导管室激活
			reportCondition.setStartProCode(ProCode.QDDGSSJ);
			reportCondition.setEndProCode(ProCode.DGSJHSJ);
		}else if("KXXB".equals(flag)){
			// 抗血小板
			reportCondition.setStartProCode("CBZDSJ");
			reportCondition.setEndProCode(ProCode.KXXBYWGYSJ);
		}else if("KN".equals(flag)){
			// 抗凝
			reportCondition.setStartProCode("CBZDSJ");
			reportCondition.setEndProCode(ProCode.KNYWSJ);
		}
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();

		if("ECG_QZ".equals(flag)) {
			list = eDPCReportMapperCustom.getAvgXdtqzsj(reportCondition);
		}else if("FIRST_ECG".equals(flag)) {
			list = eDPCReportMapperCustom.getSfxdtsj(reportCondition);
		}else if("D2W".equals(flag)) {
//			reportCondition.setStartProCode("FZSJ");
//			reportCondition.setEndProCode(ProCode.DSTGSJ);
			list = eDPCReportMapperCustom.getD2Wsj(reportCondition);
		}else if("XHY".equals(flag)) {
			reportCondition.setStartProCode(ProCode.CXSJ);
			reportCondition.setEndProCode(ProCode.POCTSJ);
			list = eDPCReportMapperCustom.getXhysj(reportCondition);
		}else {
			list = eDPCReportMapperCustom.getXtReport(reportCondition);
		}

		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	//转诊STEMI患者F2W时间getXtReport02
	@Override
	public DataGridResultInfo getXtReport02(ReportCondition reportCondition) {
		String flag = reportCondition.getReportTypeFlag();
		List<ReportDataResult> list = null;
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		if ("DSTGSJ".equals(flag)) {
			reportCondition.setStartProCode("FZSJ");
			reportCondition.setEndProCode(ProCode.DSTGSJ);
			list = eDPCReportMapperCustom.getXtReport02(reportCondition);
		}
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getYnswlReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getYnswlReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getACS24tatinReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getACS24tatinReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getRxccublReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getRxccublReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getStemi2HdyljcReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getStemi2HdyljcReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getZgzblReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getZgzblReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getYccsxdtblReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getYccsxdtblReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getRshzyblReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getRshzyblReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getS2fmcReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getS2fmcReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public ResultInfo getZdtjData() {
		
		ResultInfo resultInfo = null;

		Map<String, Object> sysdata = new HashMap<>();
		JSONObject json = new JSONObject();
		json.put("stemi", 10);
		json.put("nstemi", 15);
		json.put("ua", 2);
		json.put("a", 3);
		json.put("b", 6);
		json.put("c", 56);
		json.put("d", 23);
		json.put("e", 3);
		sysdata.put("data", json);
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		resultInfo.setSysdata(sysdata);

		return resultInfo;
	}

	@Override
	public ResultInfo getBlsltjData() {
		
		ResultInfo resultInfo = null;
		HomePageResult homePageResult = eDPCReportMapperCustom.getBlsltjData();
		List<HomePageResult> list = eDPCReportMapperCustom.getBllstjData();
		Map<String, Object> sysdata = new HashMap<>();
		sysdata.put("hztj", homePageResult);
		sysdata.put("hzfl", list);
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		resultInfo.setSysdata(sysdata);
		
		return resultInfo;
	}

	@Override
	public ResultInfo getLyfstjData() {
		
		ResultInfo resultInfo = null;
		List<HomePageResult> list = eDPCReportMapperCustom.getLyfstjData();
		Map<String, Object> sysdata = new HashMap<>();
		sysdata.put("lyfs", list);
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		resultInfo.setSysdata(sysdata);
		
		return resultInfo;
	}

	@Override
	public ResultInfo getZgqktjData() {
		ResultInfo resultInfo = null;
		List<HomePageResult> list = eDPCReportMapperCustom.getZgqktjData();
		Map<String, Object> sysdata = new HashMap<>();
		sysdata.put("zgqk", list);
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public ResultInfo getGjzktjData() {
		
		ResultInfo resultInfo = null;
		
		Calendar c = Calendar.getInstance();

		ReportCondition reportCondition = new ReportCondition();
		Date date = c.getTime();
		reportCondition.setEndDate(DateUtil.formatDate(date, "yyyy/MM"));
		
		c.add(Calendar.YEAR, -1);
		reportCondition.setStartDate(DateUtil.formatDate(c.getTime() , "yyyy/MM"));
		
		reportCondition.setEndProCode(ProCode.POCTSJ);
		List<ReportDataResult> poctlist = eDPCReportMapperCustom.getGjzkData(reportCondition);
		
		reportCondition.setEndProCode(ProCode.KXXBYWGYSJ);
		List<ReportDataResult> kxxblist = eDPCReportMapperCustom.getGjzkData(reportCondition);
		
		reportCondition.setEndProCode(ProCode.DSTGSJ);
		List<ReportDataResult> dstglist = eDPCReportMapperCustom.getGjzkData(reportCondition);
		
		
		reportCondition.setEndProCode(ProCode.DGSJHSJ);
		reportCondition.setStartProCode(ProCode.QDDGSSJ);
		List<ReportDataResult> dgsjhlist = eDPCReportMapperCustom.getDgsjhData(reportCondition);
		
		List<ReportDataResult> xdtqzlist = eDPCReportMapperCustom.getXdtqzData(reportCondition);
		
		JSONArray jsonArray = new JSONArray();
		
		for(int i=0;i<poctlist.size();i++) {
			
			JSONObject json = new JSONObject();
			
			ReportDataResult poctResult = poctlist.get(i);
			ReportDataResult kxxbResult = kxxblist.get(i);
			ReportDataResult dstgResult = dstglist.get(i);
			ReportDataResult dgsjhResult = dgsjhlist.get(i);
			ReportDataResult xdtqzResult = xdtqzlist.get(i);
			json.put("yearmon", poctResult.getYarmon());
			json.put("poct", poctResult.getAvgTime());
			json.put("kxxb", kxxbResult.getAvgTime());
			json.put("dstg", dstgResult.getAvgTime());
			json.put("dgsjh", dgsjhResult.getAvgTime());
			json.put("xdtqz", xdtqzResult.getAvgTime());
			
			jsonArray.add(json);
			
		}
		Map<String, Object> sysdata = new HashMap<>();
		sysdata.put("list", jsonArray);
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public ResultInfo getWlyyData() {
		ResultInfo resultInfo = null;
		List<HomePageResult> list = eDPCReportMapperCustom.getWlyyData();
		Map<String, Object> sysdata = new HashMap<>();
		sysdata.put("wlyy", list);
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public DataGridResultInfo getRxjzkccublReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getRxjzkccublReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getLyfstCz(ReportCondition reportCondition){
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getLyfstCz(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getZgqkCz(ReportCondition reportCondition) {
		// TODO Auto-generated method stub
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getZgqkCz(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getZdtjCz(ReportCondition reportCondition) {
		// TODO Auto-generated method stub
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getZdtjCz(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCzhzqst(ReportCondition reportCondition) {
		// TODO Auto-generated method stub
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCzhzqst(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCzgjzkqst(ReportCondition reportCondition) {
		// TODO Auto-generated method stub
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		reportCondition.setEndProCode(ProCode.JYCXSJ);
		List<ReportDataResult> jycxsjlist = eDPCReportMapperCustom.getCzgjzkqst(reportCondition);
		
		reportCondition.setEndProCode(ProCode.JCJGSJ);
		List<ReportDataResult> jcjgsjlist = eDPCReportMapperCustom.getCzgjzkqst(reportCondition);
		
		reportCondition.setEndProCode(ProCode.ZDSJ);
		List<ReportDataResult> zdsjlist = eDPCReportMapperCustom.getCzgjzkqst(reportCondition);
		
		reportCondition.setEndProCode(ProCode.RSZLKSSJ);
		List<ReportDataResult> dntlist = eDPCReportMapperCustom.getCzgjzkqst(reportCondition);
		
		
		
		JSONArray jsonArray = new JSONArray();
		
		for(int i=0;i<jycxsjlist.size();i++) {
			
			JSONObject json = new JSONObject();
			
			json.put("yearmon", jycxsjlist.get(i).getYarmon());
			json.put("jycx", jycxsjlist.get(i).getAvgTime());
			json.put("jcjg", jcjgsjlist.get(i).getAvgTime());
			json.put("zd", zdsjlist.get(i).getAvgTime());
			json.put("dnt", dntlist.get(i).getAvgTime());
			
			jsonArray.add(json);
			
		}
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("jsonArray", jsonArray);
		resultInfo.setSysdata(sysdata);
		dataGridResultInfo.setResultInfo(resultInfo);
		return dataGridResultInfo;
		
	}
	
	@Override
	public DataGridResultInfo getStemi12HdyljcReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getStemi12HdyljcReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo get6RSbRReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.get6RSbRReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	
	@Override
	public DataGridResultInfo getXjgs12HnbrReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getXjgs12HnbrReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getStemiRSorJRReport(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getStemiRSorJRReport(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	@Override
	public DataGridResultInfo getPreHospitalFirstAidTransferTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getPreHospitalFirstAidTransferTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getPatientPreparationTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getPatientPreparationTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCsFastCtTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsFastCtTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCsCompleteFullBodyChestXray(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsCompleteFullBodyChestXray(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getPenguXrayTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getPenguXrayTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCsFastJcTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsFastJcTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCsShuXueTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsShuXueTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCsRenGongqdTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsRenGongqdTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCsJingJissTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsJingJissTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCsMjzTingliuTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsMjzTingliuTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCsyzZuhyTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsyzZuhyTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCsyzICUTime(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsyzICUTime(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}

	@Override
	public DataGridResultInfo getCsPatientNum(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsPatientNum(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	@Override
	public DataGridResultInfo getCsjztlMedianData(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsjztlMedianDate(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	@Override
	public DataGridResultInfo getCsjzsxMedianDate(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsjzsxMedianDate(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
	@Override
	public DataGridResultInfo getCsyzbrMedianDate(ReportCondition reportCondition) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<ReportDataResult> list = eDPCReportMapperCustom.getCsyzbrMedianDate(reportCondition);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(list.size());
		return dataGridResultInfo;
	}
}
