package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspCfjlInfCustom;
import activetech.zyyhospital.pojo.dto.HspDiseaseCourseQueryDto;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;


public interface HspCfjlInfCustomMapper {

	public int findhspCfjlInfcount(HspLqbljlQueryDto hspLqbljlQueryDto);
	
	public List<HspCfjlInfCustom> findhspCfjlInfList(HspLqbljlQueryDto hspLqbljlQueryDto);

	public void updCfjlAfterPrint(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto);
	
}
