package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.dto.QueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;

public interface CpcMapper {
	
	List<HspemginfCustom> getCpcPatientInfoList(QueryDto queryDto);
	
	List<HspemginfCustom> getCsPatientInfoList(QueryDto queryDto);
	

}
