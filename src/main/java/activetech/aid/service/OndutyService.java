package activetech.aid.service;

import activetech.aid.dao.mapper.AidEptGrpMapperCustom;
import activetech.aid.pojo.dto.AidEptGrpCustom;
import activetech.base.process.result.ResultInfo;

import java.util.List;

public interface OndutyService {
	
//	public List<HspOndutyCustom> getOndutyList(String date);
	
	public List<AidEptGrpCustom> getExpertGroupList();

	public List<AidEptGrpCustom> getExpertGrpList();

	public List<AidEptGrpCustom> getExpertDocList();
	
	public ResultInfo addExpertGroupSubmit(AidEptGrpCustom aidEptGrpCustom);
	
	public ResultInfo updateExpertGroupSubmit(AidEptGrpCustom aidEptGrpCustom);
	
	public ResultInfo deleteExpertGroupSubmit(AidEptGrpCustom aidEptGrpCustom);
	
	public ResultInfo addExpertGroupMemberSubmit(AidEptGrpCustom aidEptGrpCustom);
	
	public ResultInfo updateExpertGroupMemberSubmit(AidEptGrpCustom aidEptGrpCustom);
	
	public ResultInfo deleteExpertGroupMemberSubmit(AidEptGrpCustom aidEptGrpCustom);
	
	

}
