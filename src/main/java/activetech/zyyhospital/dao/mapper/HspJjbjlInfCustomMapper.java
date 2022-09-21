package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspDiseaseCourseQueryDto;
import activetech.zyyhospital.pojo.dto.HspJjbjlInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;

public interface HspJjbjlInfCustomMapper {
	
	public int findhspJjbjlInfcount(HspLqbljlQueryDto hspLqbljlQueryDto);
	
	public List<HspJjbjlInfCustom> findhspJjbjlInfList(HspLqbljlQueryDto hspLqbljlQueryDto);

	public void updJjbjlAfterPrint(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto);

}
