package activetech.hospital.dao.mapper;

import java.util.List;

import activetech.hospital.pojo.domain.HspSqlInf;
import org.apache.ibatis.annotations.Param;

import activetech.hospital.pojo.dto.HighChartsReportCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfQueryDto;

/**
 * 
 * <p>Title:HspsqlinfCustomMapper</p>
 * <p>Description:转归 用户自定义dao类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月20日 上午9:44:23
 *
 */
public interface HspsqlinfCustomMapper {
	/**
	 * 转归查询列表总数
	 * @param hspsqlinfQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findHspsqlinfCount(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception;
	/**
	 * 转归查询列表
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspsqlinfCustom> findHspsqlinfList(HspsqlinfQueryDto hspsqlinfQueryDto);
	
	/**
	 * 门诊病历转归查询列表
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspsqlinfCustom> mzblFindHspsqlinfList(HspsqlinfQueryDto hspsqlinfQueryDto);
	
	public void updateSqlDatByEmgSeq(HspsqlinfCustom hspsqlinfCustom);
	
	public List<HspsqlinfCustom> findZjzyrsYear(HspsqlinfQueryDto hspsqlinfQueryDto);
	
	public List<HspsqlinfCustom> findZjzyrsMonth(HspsqlinfQueryDto hspsqlinfQueryDto);
	
	public List<HspsqlinfCustom> findZjzyrsHalfyear(HspsqlinfQueryDto hspsqlinfQueryDto);

	/**
	 * 修改第一次的转归记录
	 * @param hspsqlinfCustom
	 * @return
	 */
	public void updateHspSqlinfCus(HspsqlinfCustom hspsqlinfCustom);
	public List<HspsqlinfCustom> findZYQueryCount(HspsqlinfQueryDto hspsqlinfQueryDto);
	public List<HspsqlinfCustom> findLQQueryCount(HspsqlinfQueryDto hspsqlinfQueryDto);
	public List<HspsqlinfCustom> findZjzyrsYearjz(HspsqlinfQueryDto hspsqlinfQueryDto);
	public List<HspsqlinfCustom> findZjzyrsMonthjz(HspsqlinfQueryDto hspsqlinfQueryDto);
	public List<HspsqlinfCustom> findZjzyrsHalfyearjz(HspsqlinfQueryDto hspsqlinfQueryDto);
	public List<HspsqlinfCustom> findZjzyrsdayjz(HspsqlinfQueryDto hspsqlinfQueryDto);
	public List<HspsqlinfCustom> findZjzyrsDay(
			HspsqlinfQueryDto hspsqlinfQueryDto);
		public HspsqlinfCustom findSql_jzt(@Param("sqlSeq")String sqlSeq);
	
	/**
	 * 记者科住院人数统计 患者明细总数
	 * @param hspemginfQueryDto
	 * @return
	 */
	int findjzhzmxCount(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 急诊科住院人数统计 患者明细
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findjzhzmx(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 查询转院人数统计
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspsqlinfCustom> findZyCount(HspsqlinfQueryDto hspsqlinfQueryDto);
	
	/**
	 * 查询转院患者明细
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findemginfByzhuan(HspsqlinfQueryDto hspsqlinfQueryDto);
	
	public int findemginfByzhuanCount(HspsqlinfQueryDto hspsqlinfQueryDto);
	
	/**
	 * 查询科室住院患者明细
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findPatients(HspsqlinfQueryDto hspsqlinfQueryDto);
	
	public int findPatientsCount(HspsqlinfQueryDto hspsqlinfQueryDto);
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
    * 获取最新一条转归记录
    * @param emgSeq
    * @return
    */
	public HspsqlinfCustom findLastSql(String emgSeq);
	
	/**
	 * 120收住院人数统计
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspsqlinfCustom> find120szyDay(HspsqlinfQueryDto hspsqlinfQueryDto);
	public List<HspsqlinfCustom> find120szyMonth(HspsqlinfQueryDto hspsqlinfQueryDto);
	public List<HspsqlinfCustom> find120szyYear(HspsqlinfQueryDto hspsqlinfQueryDto);
	public List<HspsqlinfCustom> find120szyHalfyear(HspsqlinfQueryDto hspsqlinfQueryDto);
	/**
	 * 120收住人数患者列表信息
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> find120Patients(HspsqlinfQueryDto hspsqlinfQueryDto);
	/**
	 * 120收住人数患者列表总数
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public int find120PatientsCount(HspsqlinfQueryDto hspsqlinfQueryDto);
	/**
	 * 护士站病种总数
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public int findhszbzCount(HspsqlinfQueryDto hspsqlinfQueryDto);
	/**
	 * 护士站病种统计患者明细列表
	 * @param hspsqlinfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findhszbzPatients(HspsqlinfQueryDto hspsqlinfQueryDto);
}