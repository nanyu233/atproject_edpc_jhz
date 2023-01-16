package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.dto.HomePageResult;
import activetech.edpc.pojo.dto.ReportCondition;
import activetech.edpc.pojo.dto.ReportDataResult;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;


public interface EDPCReportMapperCustom {

	List<ReportDataResult> getCzNIHSSRate(ReportCondition reportCondition);
	
	List<ReportDataResult> getD2dmqsTime(ReportCondition reportCondition);
	
	List<ReportDataResult> getctAvgTime(ReportCondition reportCondition);
	
	List<ReportDataResult> getrsTimeUpToStandardRate(ReportCondition reportCondition);
	
	List<ReportDataResult> getin60MinRsRate(ReportCondition reportCondition);
	
	List<ReportDataResult> getCpcTrendData(ReportCondition reportCondition);
	
	List<ReportDataResult> getCpcTrendGridData(ReportCondition reportCondition);
	
	List<ReportDataResult> getCpcPieData(ReportCondition reportCondition);
	
	List<ReportDataResult> getTruamaTrendData(ReportCondition reportCondition);
	
	List<ReportDataResult> getZlsjzwsData(ReportCondition reportCondition);
	
	List<ReportDataResult> getTruamaRescueRate(ReportCondition reportCondition);
		
	List<ReportDataResult> getCsyzhzdyqjData(ReportCondition reportCondition);
	
	/**
	 * 胸痛-报表综合
	 * @param reportCondition
	 * @return
	 */
	List<ReportDataResult> getXtReport(ReportCondition reportCondition);

	//	转诊STEMI患者F2W时间
	List<ReportDataResult> getXtReport02(ReportCondition reportCondition);
	/**
	 * 胸痛-院内死亡率
	 * @param reportCondition
	 * @return
	 */
	List<ReportDataResult> getYnswlReport(ReportCondition reportCondition);
	
	List<ReportDataResult> getACS24tatinReport(ReportCondition reportCondition);
	
	List<ReportDataResult> getRxccublReport(ReportCondition reportCondition);
	
	List<ReportDataResult> getRxjzkccublReport(ReportCondition reportCondition);
	
	List<ReportDataResult> getYccsxdtblReport(ReportCondition reportCondition);
	
	List<ReportDataResult> getStemi2HdyljcReport(ReportCondition reportCondition);
	
	List<ReportDataResult> getZgzblReport(ReportCondition reportCondition);
	
	List<ReportDataResult> getRshzyblReport(ReportCondition reportCondition);
	
	List<ReportDataResult> getS2fmcReport(ReportCondition reportCondition);
	
	HomePageResult getBlsltjData();
	
	List<HomePageResult> getBllstjData();
	
	List<HomePageResult> getLyfstjData();
	
	List<HomePageResult> getZgqktjData();
	
	List<ReportDataResult> getGjzkData(ReportCondition reportCondition);
	
	List<ReportDataResult> getDgsjhData(ReportCondition reportCondition); 
	
	List<ReportDataResult> getXdtqzData(ReportCondition reportCondition);
	
	List<HomePageResult> getWlyyData();
	
	// 心电图确诊时间
	List<ReportDataResult> getAvgXdtqzsj(ReportCondition reportCondition);
	
	// 首份心电图时间
	List<ReportDataResult> getSfxdtsj(ReportCondition reportCondition);
	
	// D2W时间
	List<ReportDataResult> getD2Wsj(ReportCondition reportCondition);

	// 血化验时间
	List<ReportDataResult> getXhysj(ReportCondition reportCondition);
	
	//获取卒中来院方式比例
	List<ReportDataResult> getLyfstCz(ReportCondition reportCondition);
	
	//获取卒中转归情况比例
	List<ReportDataResult> getZgqkCz(ReportCondition reportCondition);
	
	//获取卒中诊断统计比例
	List<ReportDataResult> getZdtjCz(ReportCondition reportCondition);
	
	//获取卒中患者趋势图
	List<ReportDataResult> getCzhzqst(ReportCondition reportCondition);
	
	/**
	 * 获取卒中关键质控趋势图
	 */
	List<ReportDataResult> getCzgjzkqst(ReportCondition reportCondition);
	
	//获取创伤院前急救转运时间 
	List<ReportDataResult> getYqjjzyRate(ReportCondition reportCondition);
	
	//获取创伤信息预警比例 
	List<ReportDataResult> getCsxxyjRate(ReportCondition reportCondition);
	
	//获取严重创伤患者门/急诊准备时间
	List<ReportDataResult> getYzcsbrmjzzbRate(ReportCondition reportCondition);
	
	//获取卒中发病6小时诊断为急性脑梗给予介入或溶栓的占比
	List<ReportDataResult> get6RSbRReport(ReportCondition reportCondition);
	
	//获取胸痛STEMI患者发病12小时内获得首次医疗接触的比例
	List<ReportDataResult> getStemi12HdyljcReport(ReportCondition reportCondition);
	
	//获取胸痛诊断为急性心肌梗死发病时间12小时内的病人
	List<ReportDataResult> getXjgs12HnbrReport(ReportCondition reportCondition);
	
	//获取胸痛发病12小时内诊断为STEMI的患者给予溶栓或介入的占比
	List<ReportDataResult> getStemiRSorJRReport(ReportCondition reportCondition);

	List<ReportDataResult> getPreHospitalFirstAidTransferTime(ReportCondition reportCondition);

	List<ReportDataResult> getPatientPreparationTime(ReportCondition reportCondition);

	List<ReportDataResult> getCsFastCtTime(ReportCondition reportCondition);

	List<ReportDataResult> getCsCompleteFullBodyChestXray(ReportCondition reportCondition);

	List<ReportDataResult> getPenguXrayTime(ReportCondition reportCondition);

	List<ReportDataResult> getCsFastJcTime(ReportCondition reportCondition);

	List<ReportDataResult> getCsShuXueTime(ReportCondition reportCondition);

	List<ReportDataResult> getCsRenGongqdTime(ReportCondition reportCondition);

	List<ReportDataResult> getCsJingJissTime(ReportCondition reportCondition);

	List<ReportDataResult> getCsMjzTingliuTime(ReportCondition reportCondition);

	List<ReportDataResult> getCsyzZuhyTime(ReportCondition reportCondition);

	List<ReportDataResult> getCsyzICUTime(ReportCondition reportCondition);

	List<ReportDataResult> getCsPatientNum(ReportCondition reportCondition);

    List<ReportDataResult> getCsjztlMedianDate(ReportCondition reportCondition);

	List<ReportDataResult> getCsjzsxMedianDate(ReportCondition reportCondition);

	List<ReportDataResult> getCsyzbrMedianDate(ReportCondition reportCondition);

    List<ReportDataResult> getIssPffb(ReportCondition reportCondition);

	List<ReportDataResult> getCsMDTDDTime(ReportCondition reportCondition);

	List<ReportDataResult> getPfwcltj(ReportCondition reportCondition);

	List<HspemginfCustom> getCsswlMedianDate(HspemginfQueryDto hs);

	List<ReportDataResult> getQjcstj(ReportCondition reportCondition);

	List<HspemginfCustom> getMDTqdbl(ReportCondition reportCondition);

	ReportDataResult getlHzsltjData();

	List<ReportDataResult> getHzsltj(ReportCondition reportCondition);
}