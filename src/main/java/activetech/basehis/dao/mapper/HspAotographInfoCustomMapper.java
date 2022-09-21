package activetech.basehis.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.basehis.pojo.dto.HspAotographInfoCustom;

public interface HspAotographInfoCustomMapper {

	List<HspAotographInfoCustom> findDzqmImg(HspAotographInfoCustom hspAotographInfoCustom);
	
}