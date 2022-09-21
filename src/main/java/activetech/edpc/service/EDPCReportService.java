package activetech.edpc.service;

import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.edpc.pojo.dto.ReportCondition;

public interface EDPCReportService {
	
	public DataGridResultInfo getCzNIHSSRate(ReportCondition reportCondition);
	
	public DataGridResultInfo getD2dmqsTime(ReportCondition reportCondition);
	
	public DataGridResultInfo getctAvgTime(ReportCondition reportCondition);
	
	public DataGridResultInfo getrsTimeUpToStandardRate(ReportCondition reportCondition);
	
	public DataGridResultInfo getin60MinRsRate(ReportCondition reportCondition);
	
	public DataGridResultInfo getCpcTrendData(ReportCondition reportCondition);
	
	public DataGridResultInfo getCpcTrendGridData(ReportCondition reportCondition);
	
	public DataGridResultInfo getCpcPieData(ReportCondition reportCondition);
	
	public DataGridResultInfo getTruamaTrendData(ReportCondition reportCondition);
	
	public DataGridResultInfo getTruamaMedianData(ReportCondition reportCondition);
	
	public DataGridResultInfo getTruamaRescueRate(ReportCondition reportCondition);
	
	public DataGridResultInfo getCsyzhzdyqjData(ReportCondition reportCondition);//新加的
	
	public DataGridResultInfo getXtReport(ReportCondition reportCondition);

	public DataGridResultInfo getXtReport02(ReportCondition reportCondition); //转诊STEMI患者F2W时间
	/**
	 * 胸痛中心院内死亡率
	 * @param reportCondition  开始时间  结束时间
	 * @return
	 */
	public DataGridResultInfo getYnswlReport(ReportCondition reportCondition);
	
	public DataGridResultInfo getACS24tatinReport(ReportCondition reportCondition);
	
	/**
	 * 自行来院且接受PPCI治疗的STEMI患者，绕行CCU从急诊科直接送入导管室的比例不低于75%	
	 * @param reportCondition
	 * @return
	 */
	public DataGridResultInfo getRxccublReport(ReportCondition reportCondition);
	
	/**
	 * 经救护车入院（包括呼叫本地120入院及由非PCI医院转诊患者）且接受PPCI治疗的STEMI患者，绕行急诊和CCU直达导管室的比例不低于50%
	 * @param reportCondition
	 * @return
	 */
	public DataGridResultInfo getRxjzkccublReport(ReportCondition reportCondition);
	
	public DataGridResultInfo getStemi2HdyljcReport(ReportCondition reportCondition);
	
	public DataGridResultInfo getZgzblReport(ReportCondition reportCondition);
	
	/**
	 * 经救护车（包括呼叫本地120入院及由非PCI医院转诊患者）入院的STEMI患者，从急救现场或救护车远程传输心电图至胸痛中心
	 *（实时传输或微信等形式传输，但必须在云平台有客观记录）的比例不低于30%且在过去6个月内呈现增加趋势。
	 * @param reportCondition
	 * @return
	 */
	public DataGridResultInfo getYccsxdtblReport(ReportCondition reportCondition);
	
	public DataGridResultInfo getRshzyblReport(ReportCondition reportCondition);
	
	public DataGridResultInfo getS2fmcReport(ReportCondition reportCondition);
	
	// 首页数据
	public ResultInfo getZdtjData();
	
	// 病例数量统计
	public ResultInfo getBlsltjData();
	
	// 来院方式统计
	public ResultInfo getLyfstjData();
	
	// 转归情况统计
	public ResultInfo getZgqktjData();
	
	// 关键质控统计
	public ResultInfo getGjzktjData();
	
	// 网络医院
	public ResultInfo getWlyyData();
	
	//获取卒中 来院方式比例
	public DataGridResultInfo getLyfstCz(ReportCondition reportCondition);
	
	//获取卒中 转归情况比例
	public DataGridResultInfo getZgqkCz(ReportCondition reportCondition);
	
	//获取卒中 诊断统计比例
	public DataGridResultInfo getZdtjCz(ReportCondition reportCondition);
	
	//获取卒中 患者趋势图
	public DataGridResultInfo getCzhzqst(ReportCondition reportCondition);
	
	//获取卒中 患者关键质控趋势图
	public DataGridResultInfo getCzgjzkqst(ReportCondition reportCondition);
	
	//获取创伤 院前急救转运时间
	DataGridResultInfo getYqjjzyRate(ReportCondition reportCondition);
	
	//获取创伤 信息预警比例
	DataGridResultInfo getCsxxyjRate(ReportCondition reportCondition);
	
	//获取创伤 严重创伤病人门/急诊准备时间
	public DataGridResultInfo getYzcsbrmjzzbRate(ReportCondition reportCondition);
	
	DataGridResultInfo get6RSbRReport(ReportCondition reportCondition);

	DataGridResultInfo getStemi12HdyljcReport(ReportCondition reportCondition);

	DataGridResultInfo getXjgs12HnbrReport(ReportCondition reportCondition);

	public DataGridResultInfo getStemiRSorJRReport(ReportCondition reportCondition);

	DataGridResultInfo getPreHospitalFirstAidTransferTime(ReportCondition reportCondition);

	DataGridResultInfo getPatientPreparationTime(ReportCondition reportCondition);

	DataGridResultInfo getCsFastCtTime(ReportCondition reportCondition);

	DataGridResultInfo getCsCompleteFullBodyChestXray(ReportCondition reportCondition);

	DataGridResultInfo getPenguXrayTime(ReportCondition reportCondition);

	DataGridResultInfo getCsFastJcTime(ReportCondition reportCondition);

	DataGridResultInfo getCsShuXueTime(ReportCondition reportCondition);

	DataGridResultInfo getCsRenGongqdTime(ReportCondition reportCondition);

	DataGridResultInfo getCsJingJissTime(ReportCondition reportCondition);

	DataGridResultInfo getCsMjzTingliuTime(ReportCondition reportCondition);

	DataGridResultInfo getCsyzZuhyTime(ReportCondition reportCondition);

	DataGridResultInfo getCsyzICUTime(ReportCondition reportCondition);

	DataGridResultInfo getCsPatientNum(ReportCondition reportCondition);

	DataGridResultInfo getCsjztlMedianData(ReportCondition reportCondition);

	DataGridResultInfo getCsjzsxMedianDate(ReportCondition reportCondition);

	DataGridResultInfo getCsyzbrMedianDate(ReportCondition reportCondition);
}
