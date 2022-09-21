package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.pojo.dto.HspJbzdInfCustom;

public interface HspJbzdInfNewService {
	
	public List<HspJbzdInfCustom> findJbzdListByEmgSeq(HspJbzdInfCustom hspJbzdInfCustom)throws Exception;
	
	public String submitJbzdList(List<HspJbzdInfCustom> jbzdList,ActiveUser activeUser)throws Exception;
	
}
