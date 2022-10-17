package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import org.apache.ibatis.annotations.Param;

import activetech.edpc.pojo.domain.HspXtAdd;
import activetech.edpc.pojo.domain.HspXtzlInf;
import activetech.edpc.pojo.dto.HspXtzlInfCustom;
import activetech.edpc.pojo.dto.XtHspEmgInfQueryDto;
import activetech.hospital.pojo.domain.HspEmgInf;

public interface HspXtzlInfCustomMapper {
	/**
	 * 
	 * @param hspXtzlInfCustom
	 */
	public void mergeHspXtzlInf(HspXtzlInfCustom hspXtzlInfCustom);
	
	List<HspXtzlInfCustom> getHspXtzlInfByEmgSeqAndStep(@Param(value="emgSeq")String emgSeq,@Param(value="nodeId")String nodeId);

	List<HspXtzlInf> getHspXtzlInfByEmgSeqAndProCodeList(@Param(value="emgSeq")String emgSeq,@Param(value="list")List<String> list);
	
	List<HspXtzlInfCustom> getCpcTimeline(String emgSeq);
	
	List<HspXtzlInfCustom> findXtPatientWithCod(@Param(value="busSteps")List<String> busSteps,@Param(value="emgNo")String emgNo);
	
//	int countXtPatientList(XtHspEmgInfQueryDto xtHspEmgInfQueryDto);
//
//	List<XtHspEmgInfQueryDto> getXtPatientList(XtHspEmgInfQueryDto xtHspEmgInfQueryDto);

	/**
	 * 统计胸痛患者数目
	 * @param hspDbzlBasQueryDto
	 * @return
	 */
	int countXtPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto);
	/**
	 * 查询hspDbzlBas的胸痛患者列表请求
	 * @param hspDbzlBasQueryDto
	 * @return
	 */
	List<HspDbzlBasCustom> getXtPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto);
	
	String getD2W(@Param(value="emgSeq")String emgSeq);
	
	HspEmgInf getXtPatientDetail2(String emgSeq);
	
	List<HspXtzlInfCustom> getHspXtzlInfByEmgSeq(String emgSeq);
	
}
