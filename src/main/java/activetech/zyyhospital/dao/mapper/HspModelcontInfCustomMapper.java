package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspModelInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspModelcontInfCustom;

public interface HspModelcontInfCustomMapper {
	
	public List<HspModelcontInfCustom> findMajorClsByModelSeq(String modelSeq);
	
	public List<HspModelcontInfCustom> findSubClsByMajor(HspModelInfQueryDto hspModelInfQueryDto);
	
	public int findSubClsByMajorCount(HspModelInfQueryDto hspModelInfQueryDto);
	
	public List<HspModelcontInfCustom> finddocadviceconList(HspModelInfQueryDto hspModelInfQueryDto);
	
	public int finddocadviceconListCount(HspModelInfQueryDto hspModelInfQueryDto);
	
	public List<HspModelcontInfCustom> finddocadviceconallList(HspModelInfQueryDto hspModelInfQueryDto);
	
	public int finddocadviceconListallCount(HspModelInfQueryDto hspModelInfQueryDto);
}
