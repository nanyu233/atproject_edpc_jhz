package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.dto.HspJbzdInfQueryDto;
import activetech.hospital.pojo.dto.HspOperationDictCustom;

import java.util.List;

public interface HspOperationDictCustomMapper {

	List<HspOperationDictCustom> findOperationByPysm(HspJbzdInfQueryDto hspJbzdInfQueryDto);
}