package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.domain.*;
import activetech.edpc.pojo.dto.*;
import activetech.hospital.pojo.dto.HspemginfCustom;
import org.apache.ibatis.annotations.Param;

import activetech.hospital.pojo.domain.HspEmgInf;

public interface HspZlInfCustomMapper {
	/**
	 * 
	 * @param hspZlInfCustom
	 */
	public void mergeHspXtzlInf(HspZlInfCustom hspZlInfCustom);
	
	List<HspZlInfCustom> getHspXtzlInfByEmgSeqAndStep(@Param(value="emgSeq")String emgSeq,@Param(value="nodeId")String nodeId);

	List<HspZlInf> getHspXtzlInfByEmgSeqAndProCodeList(@Param(value="regSeq")String regSeq, @Param(value="list")List<String> list);
	
	List<HspZlInfCustom> getCpcTimeline(String emgSeq);
	
	List<HspZlInfCustom> findXtPatientWithCod(@Param(value="busSteps")List<String> busSteps,@Param(value="emgNo")String emgNo);
	
	String getD2W(@Param(value="emgSeq")String emgSeq);
	
	HspEmgInf getXtPatientDetail2(String emgSeq);
	
	List<HspZlInfCustom> getHspXtzlInfByEmgSeq(String emgSeq);

	/**
	 * 获取创伤患者总数
	 * @param hspZlInfQueryDto
	 * @return
	 */
	public Integer countCsPatientList(HspZlInfQueryDto hspZlInfQueryDto);

	/**
	 * 获取创伤患者列表
	 * @param hspZlInfQueryDto
	 * @return
	 */
	public List<HspDbzlBasCustom> getCsPatientList(HspZlInfQueryDto hspZlInfQueryDto);

	/**
	 * 获取创伤时间轴
	 * @param emgSeq
	 * @return
	 */
	public List<HspZlInfCustom> getCsTimeline(@Param(value="emgSeq")String emgSeq);

	/**
	 * merge创伤数据
	 * @param hspCszlInf
	 */
	public void mergeHspCszlInf(HspZlInf hspZlInf);


	public void mergeHspCzzlInf(HspZlInf record);

	List<HspZlInf> getHspCzzlInfByEmgSeqAndProCodeList(@Param(value="emgSeq")String emgSeq,@Param(value="list")List<String> list);

	List<HspZlInfCustom> getHspCzzlInfByEmgSeqAndStep(@Param(value="emgSeq")String emgSeq,@Param(value="nodeId")String nodeId);

	List<HspemginfCustom> getCzPatientInfoList(QueryDto queryDto);

	List<HspZlInfCustom> getCzTimeline(String emgSeq);

	/**
	 * 统计hspDbzlBas的卒中患者数目
	 * @param hspDbzlBasQueryDto
	 * @return
	 */
	Integer countCzPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto);

	/**
	 * 查询hspDbzlBas的卒中患者列表
	 * @param hspDbzlBasQueryDto
	 * @return
	 */
	List<HspDbzlBasCustom> getCzPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto);

	HspemginfCustom getCzhcbInfoByEmgseq(@Param(value="emgSeq")String emgSeq);

	List<HspDbzlBasCustom> getCzPatientInfoListForDbzlBas(QueryDto queryDto);

	int getCzPatientInfoListCount(QueryDto queryDto);
	
}
