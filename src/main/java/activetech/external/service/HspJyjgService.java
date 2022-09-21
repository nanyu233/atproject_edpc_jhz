package activetech.external.service;

import java.util.List;

import activetech.external.pojo.dto.HspJyjgCustom;
import activetech.external.pojo.dto.HspJyjgQueryDto;

public interface HspJyjgService {
	public int findhspjyjgcount(HspJyjgQueryDto hspJyjgQueryDto ) throws Exception;
	
	public List<HspJyjgCustom> findhspjyjgList(HspJyjgQueryDto hspJyjgQueryDto ) throws Exception;
	
	public int findhspjyjginfocount(HspJyjgQueryDto hspJyjgQueryDto ) throws Exception;
	
	public List<HspJyjgCustom> findhspjyjginfoList(HspJyjgQueryDto hspJyjgQueryDto ) throws Exception;
	
	public List<HspJyjgCustom> findhspjyjginfoListqfy(HspJyjgQueryDto hspJyjgQueryDto ) throws Exception;	
	
	public List<HspJyjgCustom> findhspjyjginfoListajax(HspJyjgQueryDto hspJyjgQueryDto ) throws Exception;
	
	public List<HspJyjgCustom> findhspjyjginfoListajaxnew(HspJyjgQueryDto hspJyjgQueryDto ) throws Exception;
	
	public void updateHspJyjgBySelective(HspJyjgQueryDto hspJyjgQueryDto) throws Exception;
}
