package activetech.aid.service;

import activetech.aid.pojo.dto.AidPatientQueryDto;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ResultInfo;


public interface AidService {

	ResultInfo mergeAidpatient(AidPatientQueryDto aidPatientQueryDto,ActiveUser activeUser);
	
	ResultInfo getPatInfoByEmgSeq(String patid);
	
	ResultInfo getPatInfo(String emgSeq,String wayTyp);

}
