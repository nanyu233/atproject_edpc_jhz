package activetech.zyyhospital.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.dto.HspGlcsCustom;
import activetech.zyyhospital.pojo.dto.HspGlcsCustomDto;

public interface ZyyGlcsService {
	public HspGlcsCustom findGlcs(String emgSeq) throws Exception;

	public void insertGlcs(HspGlcsCustomDto hspGlcsCustomDto,ActiveUser activeUser) throws Exception;
}
