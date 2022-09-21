package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspDiseaseCourseQueryDto;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.pojo.dto.HspQjjlInfCustom;

public interface HspQjjlInfCustomMapper {

	public int findhspQjjlInfcount(HspLqbljlQueryDto hspLqbljlQueryDto);
	
	public List<HspQjjlInfCustom> findhspQjjlInfList(HspLqbljlQueryDto hspLqbljlQueryDto);

	public void updQjjlAfterPrint(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto);
}
