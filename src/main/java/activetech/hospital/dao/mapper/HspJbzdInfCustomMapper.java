package activetech.hospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.hospital.pojo.dto.HspHzjbzdCustom;
import activetech.hospital.pojo.dto.HspJbzdInfCustom;
import activetech.hospital.pojo.dto.HspJbzdInfQueryDto;

public interface HspJbzdInfCustomMapper {

//	public int findHsphzjbzdCount(HspJbzdInfQueryDto hspJbzdInfQueryDto);

//	public int findHsphzjbzdCount(@Param("jbbc")String jbbc,@Param("pysm") String pysm);

	public List<HspJbzdInfCustom> findJbzdInfByPysm(HspJbzdInfQueryDto hspJbzdInfQueryDto);

	public List<HspJbzdInfCustom> findHspJbzdInfHzzd(HspJbzdInfCustom hspJbzdInfCustom);

	public HspJbzdInfCustom findHspJbzdInfComm(@Param("emgSeq")String emgSeq, @Param("jbzdType")String jbzdType);

}
