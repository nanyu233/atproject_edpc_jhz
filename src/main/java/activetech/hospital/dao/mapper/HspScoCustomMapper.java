package activetech.hospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.hospital.pojo.dto.HspScoCustom;
import activetech.hospital.pojo.dto.HspScoCustomDto;


public interface HspScoCustomMapper {

	List<HspScoCustom> findScoPysm(@Param("pysm")String pysm);
	
	int findHspScoCount(HspScoCustomDto hspScoCustomDto);
	
	 List<HspScoCustomDto> findHspScoList(HspScoCustomDto hspScoCustomDto );
	
	 HspScoCustom selectScoByid(@Param("id")String id);
	 
	 HspScoCustom findBySco(HspScoCustom hspScoCustom) throws Exception;
}