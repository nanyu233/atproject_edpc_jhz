package activetech.external.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ResultInfo;
import activetech.basehis.pojo.dto.*;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import activetech.external.pojo.domain.HspEcgInf;

import java.util.List;

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
	void insertHspDbzlBasForCust(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser);

	public List<VHemsJcjgCustom> findVHemsJcjgList(VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception;
	public  int findvhemsjyjginfocount(VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception;
	public List<VHemsJyjgCustom> findvhemsjyjginfoList(VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception;
	public List<VHemsJyjgCustom> findvhemsjyjginfoListWithNoPage(VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception;

	public  List<VHemsJyjgCustom> findjyCategoriesList(VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception;

	List<HspCfxxInfoCustom> findCfxxLocalAndHISList(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception;
}
