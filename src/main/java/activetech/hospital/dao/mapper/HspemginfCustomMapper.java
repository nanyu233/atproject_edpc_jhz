package activetech.hospital.dao.mapper;

import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.ibatis.annotations.Param;


import activetech.base.pojo.dto.HighChartsDemoCustom;
import activetech.base.pojo.dto.HighChartsDemoCustomDto;
import activetech.basehis.pojo.dto.HemshisDto;
import activetech.hospital.pojo.dto.HighChartsReportCustom;
import activetech.hospital.pojo.dto.HspBrbzCustom;
import activetech.hospital.pojo.dto.HspBrbzQueryDto;
import activetech.hospital.pojo.dto.HspcramsinfCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspgcsinfCustom;
import activetech.hospital.pojo.dto.HspmewsinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfQueryDto;

/**
 * 
 * <p>Title:HspemginfCustomMapper</p>
 * <p>Description:急诊记录 自定义Dao类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月21日 上午10:39:17
 *
 */
public interface HspemginfCustomMapper {

	/**
	 * 查询急诊患者分布
	 * @param highChartsDemoCustomDto
	 * @return
	 */
	public List<HighChartsDemoCustom> getHighChartsReportCount(HighChartsDemoCustomDto highChartsDemoCustomDto);
	/**
	 * 查询手术室死亡率
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findDeathList(HspemginfQueryDto hspemginfQueryDto);

	/**
	 * 急诊分级人数统计
	 * @param querymap
	 * @return
	 */
	public List<HighChartsDemoCustom> getHighChartsEmg(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 急诊分级人数统计细则(按年龄分组)
	 * @param querymap
	 * @return
	 */
	public List<HighChartsDemoCustom> getHighChartsEmgAgeGroup(HighChartsDemoCustomDto highChartsDemoCustomDto);
	
	/**
	 * 查询各月份抢救室滞留时间中位数
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findMedianList(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 患者分布天数统计
	 * @param highChartsDemoCustomDto
	 * @return
	 */
	public int findCount(HighChartsDemoCustomDto highChartsDemoCustomDto);
	/**
	 * 获取医患比数据
	 * @param highChartsDemoCustomDto
	 * @return
	 */
	public List<HspemginfCustom> findpatient(HspemginfQueryDto hspemginfQueryDto);


	/**
	    * 月急诊人数
	    * @param hspemginfQueryDto
	    * @return 
	    * @throws Exception
	    */
	public List<HighChartsDemoCustom> getYjzrsCount(HighChartsDemoCustomDto highChartsDemoCustomDto);
	/**
	    * 月急诊抢救人数
	    * @param hspemginfQueryDto
	    * @return 
	    * @throws Exception
	    */
	public List<HighChartsDemoCustom> getYjzqjrsCount(HighChartsDemoCustomDto highChartsDemoCustomDto);
	
	/**
	    * 月急诊死亡人数
	    * @param hspemginfQueryDto
	    * @return 
	    * @throws Exception
	    */
	public List<HighChartsDemoCustom> getYjzswrsCount(HighChartsDemoCustomDto highChartsDemoCustomDto);
	/**
	    * 月急诊住院人数
	    * @param hspemginfQueryDto
	    * @return 
	    * @throws Exception
	    */
	public List<HighChartsDemoCustom> getYjzzyrsCount(HighChartsDemoCustomDto highChartsDemoCustomDto);
	
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
	
	public HspemginfCustom findHspemginfCustom(@Param("emgSeq")String emgSeq);
	/**
	 * 根据预检号查询打印内容
	 * @param emgSeq
	 * @return
	 */
	public HspemginfCustom getEmginfForPrint(@Param("emgSeq")String emgSeq);
	/**
	 * 获取当日急诊人数
	 * @param HspBrbzQueryDto
	 * @return
	 * @throws Exception
	 */
	public int fingDrhzrs(@Param("datetime")Date datetime);
	
	
	public HspemginfCustom findHspemginfCustomLqxxdj(@Param("emgSeq")String emgSeq);
	/**
	 * 获取救护车出诊次数，急诊人数，死亡人数，留抢人数，住院人数
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	public HighChartsReportCustom findAllCount(HspemginfQueryDto hspemginfQueryDto);
	
	public HighChartsReportCustom findAllCountByDay(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 查询天的各科患者就诊统计图
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findGkhzjztjListByDay(HspemginfQueryDto hspemginfQueryDto);
	public List<HspemginfCustom> findGkhzjztjListByYear(
			HspemginfQueryDto hspemginfQueryDto);
	public List<HspemginfCustom> findGkhzjztjListByMonth(
			HspemginfQueryDto hspemginfQueryDto);
	public List<HspemginfCustom> findGkhzjztjListByHalfyear(
			HspemginfQueryDto hspemginfQueryDto);
	public HspemginfCustom findTimerEmg(@Param("emgSeq")String emgSeq);
	//获取病人详情信息
	public HspemginfCustom findhzxqByEmgSeq(@Param("emgSeq")String emgSeq);
	public HspgcsinfCustom findhzgcsByEmgSeq(@Param("emgSeq")String emgSeq);
	public HspcramsinfCustom findhzcramsByEmgSeq(@Param("emgSeq")String emgSeq);
	public HspmewsinfCustom findhzmewsByEmgSeq(@Param("emgSeq")String emgSeq);
	/**
	 * 获取月留抢人数
	 * @param HspBrbzQueryDto
	 * @return
	 * @throws Exception
	 */
	public int fingylqcount(@Param("startdate")Date startdate);
	public int fingrlqcount(@Param("startdate")Date startdate);
	public HspemginfCustom findHspemginfByemgSql_jzt(@Param("emgSeq")String emgSeq);
	/**
	 * 统计日发热人数
	 * @param startdate
	 * @return
	 */
	public int findDayHeatCount(@Param("startdate") Date startdate);
	
	/**
	 * 统计月胸痛、卒中、创伤人数
	 * @param startdate
	 * @return
	 */
	public HighChartsDemoCustom findXtAndCzAndCsCount(@Param("startdate") Date startdate);
	
	/**
	 * 查询患者的信息补充
	 * @param emgSeq
	 * @return
	 */
	public HspemginfCustom findEmmgxxbc(@Param("emgSeq")String emgSeq);

	/**
	 * 查询该改时间内某转归
	 * @param vstCad
	 * @return
	 */
	public List<HspemginfCustom> findEmgListByCsrtdspcod(HspemginfQueryDto hspemginfQueryDto);
	
	
	/**
	 * 查询住院患者列表
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findZyhzList(HspemginfQueryDto hspemginfQueryDto);
	
	
	/**
	 * 病情汇总统计
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfQueryDto> findBqhztjYear(HspemginfQueryDto hspemginfQueryDto);
	public List<HspemginfQueryDto> findBqhztjMonth(HspemginfQueryDto hspemginfQueryDto);
	public List<HspemginfQueryDto> findBqhztjHalfyear(HspemginfQueryDto hspemginfQueryDto);
	public List<HspemginfQueryDto> findBqhztjDay(HspemginfQueryDto hspemginfQueryDto);
	//患者明细
	public List<HspemginfCustom> findBqhztjHzmx(HspemginfQueryDto hspemginfQueryDto);
	//患者明细总数
	public int findBqhztjHzmxCount(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 病情记录单打印所需病人信息
	 *@param emgSeq
	 *@return
	 *@author liulj @date 2017年10月19日 下午3:18:25
	 */
	public HspemginfCustom findemghljldByemgSeq(@Param("emgSeq")String emgSeq);
		
	/**
	 * 就诊时间分布 隔一个小时
	 * findVisDatByTwoList
	 */
	public List<HspemginfCustom> findVisDatByOneList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 就诊时间分布 隔两个小时
	 * findVisDatByTwoList
	 */
	public List<HspemginfCustom> findVisDatByTwoList(HspemginfQueryDto hspemginfQueryDto);
	
	public CopyOnWriteArrayList<HspemginfCustom> findEmergencyOuttime(HemshisDto hemshisDto);
	public CopyOnWriteArrayList<HspemginfCustom> findSlowListOuttime(HemshisDto hemshisDto);
	public void updateDocDat(HspemginfCustom hspemginfCustom);
	public List<HspemginfCustom> getOutTimeList(@Param("emergencyList")CopyOnWriteArrayList<HspemginfCustom> emergencyList);
	public void updateCleanListHz(HemshisDto hemshisDto);
	/**
	 * 现有留观患者明细查询
	 */
	public List<HspemginfCustom> findXylghzmxList(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 现有留观患者明细数量
	 */
	public int findHspemginfXylghzmxCount();
	/**
	 *  门药门球录入时间
	 */
	public void updateMysjAndMqsj(HspemginfCustom hspemginfCustom);
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
	 * 根据群体事件号获取最大的分组序号
	 * @param qtsjSeq
	 * @return
	 */
	public Integer findMaxTriage(@Param("qtsjSeq")String qtsjSeq);
	
	/**
	 * 急诊科发热病人统计
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findJzkfrbrtjList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 查询发热患者数量
	 * @return
	 * @throws Exception
	 */
	public int findemginfByfrCount(HspemginfQueryDto hspemginfQueryDto)throws Exception;
	
	/**
	 * 查询发热患者明细
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> findemginfByfrList(HspemginfQueryDto hspemginfQueryDto)throws Exception;
	
	/**
	 * 今日就诊年龄性别统计
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findAgeAndSexTj(HspemginfQueryDto hspemginfQueryDto);
	
	public List<HspemginfCustom> findAgeAndSexTjList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 护士站病种统计患者明细
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findhszbztjHzmx(HspsqlinfQueryDto hspsqlinfQueryDto);
	
	/**
	 * IVa级患者达标率
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findQualifiedList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 根据mpi、jzxh获取患者信息
	 * @param hspemginfCustom
	 * @return
	 */
	public HspemginfCustom findEmgByMpiJzxh(HspemginfCustom hspemginfCustom);
	
	/**
	 * 根据门诊卡号获取最近的就诊记录
	 * @param hspemginfCustom
	 * @return
	 */
	public HspemginfCustom findRecentEmgByVstcad(HspemginfCustom hspemginfCustom);
	
	/**
	 * 根据sql条件查询患者数量
	 * @param con
	 * @return
	 */
	public Integer findEmgByCon(@Param("con")String con);
	
	/**
	 * 获取病人emg信息（创伤）
	 * @param hspemginfCustom
	 * @return
	 */
	public HspemginfCustom findEmgByEmgSeq(HspemginfCustom hspemginfCustom);
}
