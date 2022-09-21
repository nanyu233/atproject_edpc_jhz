package activetech.edpc.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.edpc.pojo.domain.HspCszlInf;
import activetech.edpc.pojo.dto.HspCszlInfQueryDto;
import activetech.edpc.pojo.dto.HspCzzlInfCustom;

public interface HspCszlInfMapperCustom {
	/**
	 * 获取创伤患者总数
	 * @param hspCszlInfQueryDto
	 * @return
	 */
	public Integer countCsPatientList(HspCszlInfQueryDto hspCszlInfQueryDto);
	
	/**
	 * 获取创伤患者列表
	 * @param hspCszlInfQueryDto
	 * @return
	 */
	public List<HspCszlInfQueryDto> getCsPatientList(HspCszlInfQueryDto hspCszlInfQueryDto);
	
	/**
	 * 获取创伤时间轴
	 * @param emgSeq
	 * @return
	 */
	public List<HspCzzlInfCustom> getCzTimeline(@Param(value="emgSeq")String emgSeq);
	
	/**
	 * merge创伤数据
	 * @param hspCszlInf
	 */
	public void mergeHspCszlInf(HspCszlInf hspCszlInf);
}
