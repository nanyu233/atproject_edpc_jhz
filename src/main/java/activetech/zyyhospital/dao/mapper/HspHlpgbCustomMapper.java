package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.domain.HspHlpgb;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbQueryDto;


public interface HspHlpgbCustomMapper {
    public HspHlpgbCustom findHlpgbByEmgSeq(@Param("emgSeq")String emgSeq) throws Exception;
    /**
	 * 获取入院护理评估表数据
	 * @param emgSeq
	 * @return
	 */
	public HspemginfCustom findEmgInfByEmgSeq(@Param("emgSeq")String emgSeq);
	
	public HspHlpgb findQxZyhEmgSeq(String emgSeq);
	
	/**
	 * 护士站病种统计
	 * @param hspHlpgbQueryDto
	 * @return
	 */
	public List<HspHlpgbCustom> getcountFromHspHlpgbToBz(HspHlpgbQueryDto hspHlpgbQueryDto);
	
	/**
	 * 导入生命体征
	 * @param hspHlpgbQueryDto
	 * @return
	 */
	List<HspHlpgbCustom> exportVitalSigns(HspHlpgbQueryDto hspHlpgbQueryDto) throws Exception;
}