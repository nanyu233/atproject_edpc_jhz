package activetech.zyyhospital.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.dto.HspCxfxpgbCustom;
import activetech.zyyhospital.pojo.dto.HspCxfxpgbCustomDto;
import activetech.zyyhospital.pojo.dto.HspJmxsfxyspgbCustom;
import activetech.zyyhospital.pojo.dto.HspJmxsfxyspgbCustomDto;
import activetech.zyyhospital.pojo.dto.HspVtefxpgbCustom;
import activetech.zyyhospital.pojo.dto.HspVtefxpgbCustomDto;

public interface RiskAssSheetService {

	// -------------------------------出血风险评估------------------------------------

	public HspCxfxpgbCustom findCxfxpgbByEmgSeq(String emgSeq);

	/**
	 * 提交出血风险评估记录
	 * 
	 * @param HspCxfxpgbCustomDto
	 * @param activeUser
	 * @throws Exception
	 */
	public void submitCxfxpgb(HspCxfxpgbCustomDto hspCxfxpgbCustomDto, ActiveUser activeUser) throws Exception;

	/**
	 * 获取出血风险评估记录
	 * 
	 * @param HspCxfxpgbCustomDto
	 * @return
	 * @throws Exception
	 */
	public HspCxfxpgbCustomDto findCxfxpgbById(String riskSeq) throws Exception;

	// -------------------------------VTE评估-------------------------------------

	public HspVtefxpgbCustom findVtefxpgbByEmgSeq(String emgSeq);

	public void submitVtefxpgb(HspVtefxpgbCustomDto hspVtefxpgbCustomDto, ActiveUser activeUser);

	public HspVtefxpgbCustomDto findVtefxpgbById(String riskSeq) throws Exception;

	// -------------------------------静脉血栓评估------------------------------------

	public HspJmxsfxyspgbCustom findJmxsfxpgbByEmgSeq(String emgSeq);

	public void submitJmxsfxpgb(HspJmxsfxyspgbCustomDto hspJmxsfxyspgbCustomDto, ActiveUser activeUser);

	public HspJmxsfxyspgbCustomDto findJmxsfxpgbById(String emgSeq) throws Exception;
}
