package activetech.hospital.service;

import java.util.List;
import activetech.hospital.pojo.dto.HspJbzdInfCustom;
import activetech.hospital.pojo.dto.HspJbzdInfQueryDto;
import activetech.hospital.pojo.dto.HspOperationDictCustom;

public interface HspCstInfService {

	void deleteHspjbzdinf(HspJbzdInfCustom hspJbzdInfCustom);

	List<HspJbzdInfCustom> findJbzdInfByPysm(HspJbzdInfQueryDto hspJbzdInfQueryDto);

	List<HspJbzdInfCustom> findHspJbzdInfHzzd(String emgSeq, String jbzdType);

	HspJbzdInfCustom findHspJbzdInfComm(String emgSeq, String jbzdType);
	
	List<HspOperationDictCustom> findOperationByPysm(HspJbzdInfQueryDto hspJbzdInfQueryDto);
}
