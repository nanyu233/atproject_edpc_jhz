package activetech.external.dao.mapper;

import java.util.List;

import activetech.external.pojo.dto.HspJyjgCustom;
import activetech.external.pojo.dto.HspJyjgQueryDto;

public interface HspJyjgCustomMapper {
	public List<HspJyjgCustom> inBedJyInfGet(); 
	
	public int insert(HspJyjgCustom hspJyjgCustom);
	
	//===========================================================================================
	public int findhspjyjgcount(HspJyjgQueryDto hspJyjgQueryDto);
	
	public List<HspJyjgCustom> findhspjyjgList(HspJyjgQueryDto hspJyjgQueryDto);
	
	public int findhspjyjginfocount(HspJyjgQueryDto hspJyjgQueryDto);
	
	public List<HspJyjgCustom> findhspjyjginfoList(HspJyjgQueryDto hspJyjgQueryDto);
	
	public List<HspJyjgCustom> findhspjyjginfoListqfy(HspJyjgQueryDto hspJyjgQueryDto);
	
	public List<HspJyjgCustom> findhspjyjginfoListajax(HspJyjgQueryDto hspJyjgQueryDto);
	//===========================================================================================
}
