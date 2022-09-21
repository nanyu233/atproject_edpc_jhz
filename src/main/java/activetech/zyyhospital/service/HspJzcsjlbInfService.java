package activetech.zyyhospital.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.dto.HspJzcsjlbInfQueryDto;

public interface HspJzcsjlbInfService {

	public HspJzcsjlbInfQueryDto getJzcsjlbByJzcsId(String emgSeq) throws Exception;

	public void updateJzcsjlb(HspJzcsjlbInfQueryDto hspJzcsjlbInfQueryDto) throws Exception;

}
