package activetech.external.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ResultInfo;
import activetech.external.pojo.domain.HspEcgInf;

public interface EsbService {
	
	public ResultInfo getJyjcInfo(String emgSeq, String wayTyp);
	
	public ResultInfo getECGInfo(String emgSeq, String wayTyp);

	/**
	 * 添加或者更新心电图信息
	 * @param hspEcgInf
	 * @param activeUser
	 * @return
	 */
	public ResultInfo addOrUpdateEcgInf(HspEcgInf hspEcgInf, ActiveUser activeUser);

}
