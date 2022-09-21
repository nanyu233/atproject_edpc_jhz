package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.dto.HspTpctInfCustom;
import activetech.zyyhospital.pojo.dto.HspTpctInfQueryDto;

public interface ZyyHspTpctInfService {

	public int findhspTpctInfcount(HspTpctInfQueryDto hspTpctInfQueryDto ) throws Exception;
	
	public List<HspTpctInfCustom> findhspTpctInfList(
			HspTpctInfQueryDto hspTpctInfQueryDto) throws Exception;
	
	public String submitzyytpct(HspTpctInfQueryDto hspTpctInfQueryDto,ActiveUser activeUser)throws Exception;
	
	public HspTpctInfCustom findzyytpctBySeq(HspTpctInfQueryDto hspTpctInfQueryDto) throws Exception;
	
	public void deletezyytpct(HspTpctInfQueryDto hspTpctInfQueryDto) throws Exception;
	public String findtpxtjson(String emfSeq) throws Exception;
	public void insertmedia(String imgStr,String emgSeq) throws Exception;
	public HspTpctInfCustom findtpct_csh(HspTpctInfQueryDto hspTpctInfQueryDto) throws Exception;
	
	public  HspTpctInfCustom leadtcpt(HspTpctInfQueryDto hspTpctInfQueryDto)throws Exception;
	
	public  HspTpctInfCustom  exporttcpt(HspTpctInfQueryDto hspTpctInfQueryDto,ActiveUser activeUser)throws Exception;
}

