package activetech.external.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ResultInfo;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.external.pojo.domain.HspEcgInf;

public interface EsbService {
	
	public ResultInfo getJyjcInfo(String regSeq);
	
	public ResultInfo getECGInfo(String regSeq, String wayTyp);

	/**
	 * 添加或者更新心电图信息
	 * @param hspEcgInf
	 * @param activeUser
	 * @return
	 */
	public ResultInfo addOrUpdateEcgInf(HspEcgInf hspEcgInf, ActiveUser activeUser);
     /*
     * 插入三大中心基础信息表
     * */
	public void insertHspDbzlBasForCust(HspDbzlBasCustom hspDbzlBasCustom) throws Exception;

}
