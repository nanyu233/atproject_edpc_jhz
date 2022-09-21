package activetech.aid.dao.mapper;

import activetech.aid.pojo.domain.AidPatient;

public interface AidPatientMapperCustom {
		
	int mergeAidPatient(AidPatient aidPatient);
	
	int insertAidPatient(AidPatient aidPatient);
	
}