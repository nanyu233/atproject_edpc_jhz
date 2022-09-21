package activetech.aid.dao.mapper;

import activetech.aid.pojo.domain.AidPatientXt;
import activetech.aid.pojo.domain.AidPatientXtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AidPatientXtMapperCustom {
	
    int mergeAidPatientXt(AidPatientXt aidPatientXt);
    
    int insert(AidPatientXt record);
    			 
}