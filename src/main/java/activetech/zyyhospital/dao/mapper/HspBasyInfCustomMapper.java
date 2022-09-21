package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspBasyInf;
import activetech.zyyhospital.pojo.dto.HspBasyInfCustom;
import activetech.zyyhospital.pojo.dto.HspBasyInfQueryDto;

public interface HspBasyInfCustomMapper {
	
	/**
	 * 病案首页返回数据
	 * @param hspBasyQueryDto
	 * @return
	 */
	HspBasyInfQueryDto medicalRecord_result(HspBasyInfQueryDto hspBasyQueryDto);
	
	/**
	 * 通过emg_seq查询一条数据
	 * @param emgSeq
	 * @return
	 */
	HspBasyInf findBasyInfByEmgSeq(@Param("emgSeq") String emgSeq);

	/**
	 * 病种统计
	 * @param hspBasyInfQueryDto
	 * @return
	 */
	List<HspBasyInfCustom> getcountFromHspBasyInfToBz(HspBasyInfQueryDto hspBasyInfQueryDto);

	/**
	 * 操作技术统计
	 * @param hspBasyInfQueryDto
	 * @return
	 */
	List<HspBasyInfCustom> getcountFromHspBasyInfToCzjs(HspBasyInfQueryDto hspBasyInfQueryDto);
}