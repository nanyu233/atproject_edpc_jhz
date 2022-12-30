package activetech.edpc.service;

import java.util.List;

import activetech.edpc.pojo.domain.VHemsJcjgHz;
import activetech.edpc.pojo.domain.VHemsJyjgHz;
import activetech.edpc.pojo.dto.HspZlInfCustom;
import activetech.edpc.pojo.dto.VHemsJyjgHzCustom;
import activetech.external.pojo.domain.VHemsJyjg;

public interface SysIntergratingService {
	
	List<VHemsJyjgHzCustom> getJyjgListBySampleno(VHemsJyjgHz vHemsJyjgHz);
	
	void mergeHspXtzlInf(HspZlInfCustom hspZlInfCustom);
	
	void JyjgIntergrat(VHemsJyjgHzCustom vHemsJyjgHzCustom);
	
	void JcjgIntergrat(VHemsJcjgHz vHemsJcjgHz);
	/**
	 * 视图模式接收处理
	 */
	void JyjgIntergratSt(VHemsJyjg vHemsJyjg);
	
	void vHemsJyjgInsert(VHemsJyjg vHemsJyjg);
}
