package activetech.zyyhospital.dao.mapper;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.ibatis.annotations.Param;



import activetech.hospital.pojo.dto.HspBrbzCustom;
import activetech.hospital.pojo.dto.HspBrbzQueryDto;
import activetech.hospital.pojo.dto.HspScoCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.zyyhospital.pojo.domain.THemsSjz;

/**
 * 
 * <p>Title:ZyyHspemginfCustomMapper</p>
 * <p>Description:(中医院)急诊记录 自定义Dao类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月21日 上午10:39:17
 *
 */
public interface ZyyHspemginfCustomMapper {

	/**
	 * 病情记录单打印所需病人信息
	 *@param emgSeq
	 *@return
	 *@author liulj @date 2017年10月19日 下午3:18:25
	 */
	public HspemginfCustom findemghljldByemgSeq(@Param("emgSeq")String emgSeq);
	public List<HspemginfCustom> findHspemginfQjsListZyy(
			HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 统计抢救措施人数（分别按年、月、日、半年查询）
	 * @param hspBrbzQueryDto
	 * @return
	 */
	//按年查询
	public List<HspBrbzCustom> getcountFromHlpgbToYear(HspBrbzQueryDto hspBrbzQueryDto);
	//按月查询
	public List<HspBrbzCustom> getcountFromHlpgbToMonth(HspBrbzQueryDto hspBrbzQueryDto);
	//按天查询
	public List<HspBrbzCustom> getcountFromHlpgbToDay(HspBrbzQueryDto hspBrbzQueryDto);
	//按半年查询
	public List<HspBrbzCustom> getcountFromHlpgbToHalfYear(HspBrbzQueryDto hspBrbzQueryDto);
	
	
	public List<HspemginfCustom> find120tj(HspemginfQueryDto hspemginfQueryDto);
	public List<HspemginfCustom> find120tjHalfYear(
			HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 急诊门诊记录查询总数
	 * 
	 * @param hstemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public int jzmzFindHspemginfCount(HspemginfQueryDto hspemginfQueryDto)
			throws Exception;
	
	/**
	 * 急诊门诊记录查询列表
	 * 
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> jzmzFindHspemginfList(
			HspemginfQueryDto hspemginfQueryDto) throws Exception;
	
	/**
	 * 急诊记录查询总数
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findHspemginfCount(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	/**
	 * 急诊记录查询列表
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findHspemginfList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 根据预检号获取急诊患者信息
	 * @param hspemginfQueryDto
	 * @return
	 */
	public HspemginfCustom findHspemginfByemgSql(@Param("emgSeq")String emgSeq);
	
	public int findHspemginfQjsCountzyy(HspemginfQueryDto hspemginfQueryDto);

	public List<HspemginfCustom> findReturnQjsList(HspemginfQueryDto hspemginfQueryDto);
	public CopyOnWriteArrayList<HspemginfCustom> findTimeoutEmgInf();
	public List<HspemginfCustom> findZylbtabList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 归档病历
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findAMRecordList(HspemginfQueryDto hspemginfQueryDto);
	
	public int findAMRecordListCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 
	 * @param hspemginfQueryDto acronym-首字母
	 * @return 送入医院list
	 */
	public List<HspScoCustom> findHspScoListBySzm(String acronym);
	
	/**
	 * 查询今日是否分诊
	 * @param map
	 * @return
	 */
	public List<HspemginfCustom> findEmgInfByCad(Map<String, Object> map);
	/**
	 * 获取急诊留抢病历数据
	 * 有填写留抢病历
	 * */
	public List<HspemginfCustom> findEmgInfByMpi(String mpi) throws Exception;
	
	/**
	 * 执行存储过程-时间轴
	 * @param emgSeq
	 * @throws Exception
	 */
	public void proc_getSjzData(@Param("emgSeq")String emgSeq) throws Exception;
	/**
	 * 获取时间轴列表
	 * @param emgSeq
	 * @return
	 */
	public List<THemsSjz> getSjzDataByEmgSeq(THemsSjz themsSjz);
	
	/**
	 * 抢救室列表相关统计
	 * @param hspemginfCustom
	 * @return
	 */
	public Map<String, Object> getqjsDataCount(Map<String, Object> paramMap);
	/**
	 * 获取最新的医患比/护患比
	 */
	public HspemginfCustom findDocNurseRatio(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 获取最新的非计划重返抢救室率
	 */
	public HspemginfCustom findFjhcfqjsl(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 获取最新的非计划重返抢救室率   患者列表
	 */
	public List<HspemginfCustom> findFjhcfqjslList(HspemginfQueryDto hspemginfQueryDto);
	
	
	

	/**
	 * 门药时间报表
	 * @param hspemginfQueryDto
	 * @return
	 */
	//柱状图
	public List<HspemginfCustom> findaverageDrugColumnList(HspemginfQueryDto hspemginfQueryDto);
	//饼图
	public List<HspemginfCustom> findaverageDrugPieList(HspemginfQueryDto hspemginfQueryDto);
	//平均时间
	public List<HspemginfCustom> findaverageDrugAvgTimeList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 急诊管理绿色通道人数
	 */
	public HspemginfCustom getGrnChlCount(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 急诊管理留抢非留抢人数
	 * @param hspemginfQueryDto
	 * @return
	 */
	public HspemginfCustom getLqAndNotLqCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 分诊人员统计
	 * @param heHspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> triagePersonList(HspemginfQueryDto heHspemginfQueryDto);
	
	/**
	 * 查询该就诊卡指定时间范围内的预检信息
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findEmgInfForRange_result(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 查询该就诊卡指定时间范围内的预检信息总记录数
	 * @param hspemginfQueryDto
	 * @return
	 */
	public int findEmgInfForRangeCount(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 根据挂号id查询预检信息
	 * @param hisjzid
	 * @return
	 */
	public HspemginfCustom findHspemginfByGhid(String ghid);
	
	/**
	 * 护理记录左侧患者列表总数
	 * @param hspemginfQueryDto
	 * @return
	 */
	public int leftWrapCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 护理记录左侧患者列表数据
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> leftWrapList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 查询驾驶员
	 * @param name
	 * @return
	 */
	public List<HspemginfCustom> findAbnDriverList(String name);
	
	/**
	 * 手术操作统计
	 * @param heHspemginfQueryDto
	 * @return
	 */
//	public List<HspOperateInfCustom> operationList(HspemginfQueryDto heHspemginfQueryDto);
//	public int queryEmgCountBySscz(HspOperateInfCustom hspOperateInfCustom);
//	public List<HspOperateInfCustom> queryEmgListBySscz(HspOperateInfCustom hspOperateInfCustom);
	
	/**
	 * 查询已预检待完善数据（新入病人）
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	List<HspemginfCustom> toBeImprovedList(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	
	/**
	 * 通过MPI和jzxh查询唯一预检号
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	HspemginfCustom getEmgInfByMpiAndJzxh(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	public HspemginfCustom selectEmgByGhsj(@Param("emgSeq") String emgSeq);
	
	/**
	 *病种明细统计数量
	 */
	public int findBztjmxCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *病种明细统计列表
	 */
	public List<HspemginfCustom> getfindBztjmxList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *操作技术明细统计数量
	 */
	public int findCzjstjmxCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *操作技术明细统计列表
	 */
	public List<HspemginfCustom> getfindCzjstjmxList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *护士站病种明细统计数量
	 */
	public int findHszbztjmxCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *护士站病种明细统计列表
	 */
	public List<HspemginfCustom> getfindHszbztjmxList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *抢救措施明细统计数量
	 */
	public int findQjcshzmxCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *抢救措施患者明细
	 */
	public List<HspemginfCustom> getfindQjcshzmxList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *抢救措施报表列表
	 */
	public List<HspBrbzCustom> getcountFromHlpgbToRange(HspBrbzQueryDto hspBrbzQueryDto);
	
	public List<HspemginfCustom> getEmgInfByXm(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *120到院统计统计列表
	 */
	public List<HspemginfCustom> getDytjFromHspEmgInf(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *120到院患者明细统计数量
	 */
	public int findDytjmxCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *120到院患者明细统计列表
	 */
	public List<HspemginfCustom> getfindDytjmxList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 修改页面检查胸痛流程标识
	 * @param emgSeq
	 * @return
	 */
	public int findXtlcCount(String emgSeq);
	
	/**
	 * 修改页面检查卒中流程标识
	 * @param emgSeq
	 * @return
	 */
	public int findCzlcCount(String emgSeq);
	
}
