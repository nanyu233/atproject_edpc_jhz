package activetech.hospital.service;


import java.util.List;
import java.util.Map;

import activetech.base.pojo.dto.HighChartsDemoCustom;
import activetech.base.pojo.dto.HighChartsDemoCustomDto;
import activetech.base.process.result.HighChartsInfo;
import activetech.zyyhospital.pojo.dto.HspJjbglInfQueryDto;
import activetech.hospital.pojo.dto.HighChartsReportCustom;
import activetech.zyyhospital.pojo.dto.HspBchzhzReportCustom;
import activetech.hospital.pojo.dto.HspBrbzCustom;
import activetech.hospital.pojo.dto.HspBrbzQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspmewsinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfQueryDto;

public interface HspreportService {

	/**
	 * 获取急诊患者人数
	 * @param areano
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getHighChartsUser(HighChartsDemoCustomDto highChartsDemoCustomDto) throws Exception;
	/**
	 * 获取急诊患者人数表
	 * @param areano
	 * @return
	 * @throws Exception
	 */
	public List<HighChartsDemoCustom> getHighChartsUserb(HighChartsDemoCustomDto highChartsDemoCustomDto) throws Exception;
	/**
	 * 获取急诊患者人数
	 * @param areano
	 * @return
	 * @throws Exception
	 */
	public int getCountHighChartsUser(HighChartsDemoCustomDto highChartsDemoCustomDto) throws Exception;
	//end-----------------------------------------------------
	//--------------liu start
	/**
	 * 抢救死亡率查询
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HighChartsDemoCustom> getDeathRate(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	/**
	 * 根据年月查询死亡率列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom>  findDeathRate(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	//--------------end----------------------------------------
   //--------------chen start
	/**
	 * 根据年月日查询急诊各级患者列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HighChartsDemoCustom> getHighChartsEmg(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	public List<HighChartsDemoCustom> getHighChartsEmgAgeGroup(HighChartsDemoCustomDto highChartsDemoCustomDto) throws Exception;
	
		//--------end---------------------------------------------
		//--------------li start
	/**
	 * 获取中位数统计数据
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getMedian(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	/**
	 * 查询中位数列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> getMedianList(HspemginfQueryDto hspemginfQueryDto)throws Exception;
	
		//----------------------end--------------------------------
	/**
	 * 查询医患比列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> findpatient(HspemginfQueryDto hspemginfQueryDto);

	/**
	 * 获取月急诊人数
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getYjzrs(HighChartsDemoCustomDto highChartsDemoCustomDto);
	/**
	 * 获取月急诊抢救人数
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getYjzqjrs(HighChartsDemoCustomDto highChartsDemoCustomDto);
	
	/**
	 * 获取月急诊死亡人数
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getYjzswrs(HighChartsDemoCustomDto highChartsDemoCustomDto);
	/**
	 * 获取月急诊住院人数
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getYjzzyrs(HighChartsDemoCustomDto highChartsDemoCustomDto);
	/**
	 * 获取病人病症
	 * @param HspBrbzQueryDto
	 * @return
	 * @throws Exception
	 */
 
	public List<HspBrbzCustom> getbrbzxgtjt(HspBrbzQueryDto hspBrbzQueryDto);
	/**
	 * 获取病人病症统计数量
	 * @param HspBrbzQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspBrbzCustom> getcountbrbzxgtjt(HspBrbzQueryDto hspBrbzQueryDto);
	/**
	 * 获取所有病人病症
	 * @param HspBrbzQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspBrbzCustom> getbrbz();

	/**
	 * 获取月急诊人数的集合
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HighChartsDemoCustom> getYjzrsList(HighChartsDemoCustomDto highChartsDemoCustomDto);
	/**
	 * 获取月急诊抢救人数的集合
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HighChartsDemoCustom> getYjzqjrsList(HighChartsDemoCustomDto highChartsDemoCustomDto);
	/**
	 * 获取月急诊死亡人数的集合
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HighChartsDemoCustom> getYjzswrsList(HighChartsDemoCustomDto highChartsDemoCustomDto);
	/**
	 * 获取月急诊住院人数的集合
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HighChartsDemoCustom> getYjzzyrsList(HighChartsDemoCustomDto highChartsDemoCustomDto);
	

	public List<HspsqlinfCustom> findZjzyrs(HspsqlinfQueryDto hspsqlinfQueryDto) ;
	public Map<String, Object> findJzkgzlResult(
			HspemginfQueryDto hspemginfQueryDto);	
	/**
	 * 急诊住院人数统计报表
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspsqlinfCustom> findZjzyrsjz(HspsqlinfQueryDto hspsqlinfQueryDto) ;
	
	/**
	 * 急诊科住院人数统计 患者明细总数
	 * @param hspemginfQueryDto
	 * @return
	 */
	int findjzhzmxCount(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 急诊住院人数统计 患者明细
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findjzhzmx(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 各科患者就诊统计图查询列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> findGkhzjztjList(HspemginfQueryDto hspemginfQueryDto);


	/**
	 * 急诊患者诊断数据
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findZdjgtj(HspemginfQueryDto hspemginfQueryDto);


	/**
	 * 病情汇总统计
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfQueryDto> findBqhztj(HspemginfQueryDto hspemginfQueryDto) ;
	
	public List<HspemginfCustom> findPatientList(HspsqlinfQueryDto hspsqlinfQueryDto) ;
	//患者明细
	public List<HspemginfCustom> findBqhztjHzmx(HspemginfQueryDto hspemginfQueryDto);
	public int findBqhztjHzmxCount(HspemginfQueryDto hspemginfQueryDto);
	/**
	  * 查询住院患者人数
	  * @param hstsqlinfQueryDto
	  * @return
	  */
	public int findPatientsCount(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception;
	/**
	 * 急诊分诊首页（新，中医院）
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> findDrhzrsZyy() throws Exception;
	
	/**
	 * 就诊时间分布
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> findVisDatList(HspemginfQueryDto hspemginfQueryDto) ;
	public List<HspemginfCustom> findZjzyrsPat(HspsqlinfQueryDto hspsqlinfQueryDto);
	/**
	 * 抢救室日报表
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HighChartsReportCustom> findqjsrbbList(HspsqlinfQueryDto hspsqlinfQueryDto);
	/**
	 * 抢救室日报表
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HighChartsReportCustom> findqjsrbbListRange(HspsqlinfQueryDto hspsqlinfQueryDto);
	
	/**
	 *  抢救室平均滞留时间率
	 */
	public HspemginfCustom findQjspjzlsj(HspemginfQueryDto hspemginfQueryDto) ;
	
	/**
	 *  抢救室滞留率
	 */
	public HspemginfCustom findQjszll(HspemginfQueryDto hspemginfQueryDto) ;
	
	/**
	 *  抢救室滞留患者总数
	 */
	public int findQjszlhzCount(HspemginfQueryDto hspemginfQueryDto) ;
	/**
	 *  抢救室滞留患者列表
	 */
	public List<HspemginfCustom> findQjszlhzList(HspemginfQueryDto hspemginfQueryDto) ;
	
	/**
	 * 急诊患者总数
	 * @param hspemginfQueryDto
	 * @return
	 */
	public int findJzhztjlbCount(HspemginfQueryDto hspemginfQueryDto) throws Exception ;
	
	/**
	 * 急诊患者列表 
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findJzhztjlbList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 急诊科发热病人查询列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> findJzkfrbrtjList(HspemginfQueryDto hspemginfQueryDto);

	/**
	 * 今日就诊年龄性别统计
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findAgeAndSexTjList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 急诊科患者生命体征完成情况统计
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspmewsinfCustom> querySmtzwcqktj(HspmewsinfCustom hspmewsinfCustom);
	
	public int queryEmgCountBySmtz(HspmewsinfCustom hspmewsinfCustom);
	/**
	 * 急诊科患者生命体征完成情况统计	患者列表
	 * @param hspmewsinfCustom
	 * @return
	 */
	public List<HspemginfCustom> queryEmgListBySmtz(HspmewsinfCustom hspmewsinfCustom);
	/**
	 * 班次报表汇总
	 */
	public List<HspBchzhzReportCustom> findbchzhzList(HspJjbglInfQueryDto hspJjbglinfQueryDto);
	public List<HspBchzhzReportCustom> findbchzhzListRange(HspJjbglInfQueryDto hspJjbglinfQueryDto);
	
	/**
	 * 120收住院人数统计
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	List<HspsqlinfCustom> find120szy(HspsqlinfQueryDto hspsqlinfQueryDto);
	/**
	 * 120收住人数患者列表明细
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	int find120PatientsCount(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception;
	/**
	 * 120收住患者列表总数
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	List<HspemginfCustom> find120PatientList(HspsqlinfQueryDto hspsqlinfQueryDto);
	/**
	 * 护士站病种统计患者明细列表
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findhszbzList(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception;
	
	/**
	 * 护士站病种统计患者明细总数
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public int findhszbzCount(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception;
	
	public List<HspemginfCustom> findhszbztjHzmx(HspsqlinfQueryDto hspsqlinfQueryDto);
	
	/**
	 * IVa级患者达标率
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception 
	 */
	public HighChartsInfo getFourA(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	
	/**
	 * IVa级患者达标率列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception 
	 */
	public List<HspemginfCustom> getFourAList(HspemginfQueryDto hspemginfQueryDto) throws Exception;
}
