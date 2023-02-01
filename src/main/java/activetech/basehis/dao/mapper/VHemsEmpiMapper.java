package activetech.basehis.dao.mapper;

import java.util.Map;

import activetech.basehis.pojo.domain.VHemsEmpi;



public interface VHemsEmpiMapper {
	public  VHemsEmpi findvHemsEmpi(Map<String, Object> map);

	public  VHemsEmpi selectEmpiByHis(Map<String, Object> map);
	
}
