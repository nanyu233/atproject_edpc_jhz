package activetech.external.dao.mapper;

import java.util.List;

import activetech.external.pojo.dto.VHemsJyjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;

public interface VHemsJyjgMapperCustom {
    
	public String getJgdbDate(String regSeq);
	
	public int findvhemsjyjgcount(VHemsJyjgQueryDto vHemsJyjgQueryDto);
	
	public List<VHemsJyjgCustom> findvhemsjyjgList(VHemsJyjgQueryDto vHemsJyjgQueryDto);
	
	public int findvhemsjyjginfocount(VHemsJyjgQueryDto vHemsJyjgQueryDto);
	
	public List<VHemsJyjgCustom> findvhemsjyjginfoList(VHemsJyjgQueryDto vHemsJyjgQueryDto);
	
	public List<VHemsJyjgCustom> findvhemsjyjginfoListqfy(VHemsJyjgQueryDto vHemsJyjgQueryDto);
	
}