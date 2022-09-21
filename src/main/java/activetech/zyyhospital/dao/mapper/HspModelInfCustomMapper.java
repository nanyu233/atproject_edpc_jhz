package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspModelInfCustom;

public interface HspModelInfCustomMapper {
	
	public List<HspModelInfCustom> findModelList(String modelContent);
	
	public List<HspModelInfCustom> finddocadviceList();

}
