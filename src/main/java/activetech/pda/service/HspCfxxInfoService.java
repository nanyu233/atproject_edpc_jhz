package activetech.pda.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;

/**
 * 处方信息Service
 * @author machaofan
 *
 */
public interface HspCfxxInfoService {


	
	/**
	 * 获取患者数据
	 * @param emgSeq
	 * @return
	 */
	public HspemginfCustom getEmgInfData(String emgSeq) throws Exception;
	
	/**
	 * 获取处方信息（HIS视图+本地处方表）
	 * @param hspCfxxInfoQueryDto
	 */
	public List<HspCfxxInfoCustom> getCfxxDataAndHIS(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception;
	
	
	/**
	 * 医嘱核对
	 * @param hspCfxxInfoQueryDto
	 * @param activeUser
	 */
	public void saveDocAdcSubmit(HspCfxxInfoQueryDto hspCfxxInfoQueryDto, ActiveUser activeUser)  throws Exception;
	
}
