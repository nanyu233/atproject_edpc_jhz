package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspNrsconsentInfCustom;
import activetech.zyyhospital.pojo.dto.HspNrsconsentInfQueryDto;

public interface HspNrsconsentInfCustomMapper {

	int findDocumentTotal(HspNrsconsentInfQueryDto hspNrsconsentInfQueryDto);

	List<HspNrsconsentInfCustom> findfindDocumentList(HspNrsconsentInfQueryDto hspNrsconsentInfQueryDto);

}
