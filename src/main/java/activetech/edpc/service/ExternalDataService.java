package activetech.edpc.service;

import java.util.List;

import activetech.edpc.pojo.dto.HspXtzlInfCustom;
import activetech.edpc.pojo.dto.HspZlInfCustom;


public interface ExternalDataService {
	
	public void mergeFzInf(List<HspZlInfCustom> list, String emgSeq, String regSeq,String crtUser);
	
	/**
	 * 获取B2W时间
	 * @param emgSeq
	 * @return
	 */
	public String getD2W(String emgSeq);

}
