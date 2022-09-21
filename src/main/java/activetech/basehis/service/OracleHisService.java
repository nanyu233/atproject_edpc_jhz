package activetech.basehis.service;

import java.util.List;
import java.util.Map;

import activetech.base.pojo.dto.ActiveUser;
import activetech.basehis.pojo.domain.VHemsEmpi;
import activetech.basehis.pojo.domain.VHemsJyjg;
import activetech.basehis.pojo.domain.VHemsRcz;
import activetech.basehis.pojo.dto.HemshisDto;
import activetech.basehis.pojo.dto.VHemsGhlbCustom;
import activetech.basehis.pojo.dto.VHemsGhlbQueryDto;
import activetech.basehis.pojo.dto.VHemsRczCustom;
import activetech.basehis.pojo.dto.VHemsSfxxCustom;
import activetech.basehis.pojo.dto.VHemsSfxxDto;
import activetech.external.pojo.dto.VHemsJyjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;

public interface OracleHisService {
	//////////////////////////////////患者信息///////////////////////////////////////
	/**
	 * 根据卡号获取患者信息
	 * @param map
	 * @return
	 * @throws Exception 
	 */
	public  VHemsEmpi findvHemsEmpi(String cardNo,String cardType,String trackData) throws Exception;
	
	//////////////////////////////////检验信息///////////////////////////////////////
	/**
	 * 检验结果总数
	 */
	public int findvhemsjyjgcount(VHemsJyjgQueryDto vHemsJyjgQueryDto ) throws Exception;
	/**
	 * 检验结果列表
	 * @param vHemsJyjgQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<VHemsJyjgCustom> findvhemsjyjgList(
			VHemsJyjgQueryDto vHemsJyjgQueryDto ) throws Exception;
	
	public int findvhemsjyjginfocount(VHemsJyjgQueryDto vHemsJyjgQueryDto ) throws Exception;
	
	public List<VHemsJyjgCustom> findvhemsjyjginfoList(
			VHemsJyjgQueryDto vHemsJyjgQueryDto ) throws Exception;
	
	public List<VHemsJyjgCustom> findvhemsjyjginfoListqfy(
			VHemsJyjgQueryDto vHemsJyjgQueryDto ) throws Exception;
	
	
	public List<VHemsJyjgCustom> findvhemsjyjginfoListajaxnew(
			VHemsJyjgQueryDto vHemsJyjgQueryDto ) throws Exception;
	
	//////////////////////////////////挂号信息///////////////////////////////////////
	/**
	 * @param	vHemsGhlbQueryDto
	 * @return	已挂号患者列表总记录数 
	 * @throws	Exception
	 */
	public int getRegisteredCount(VHemsGhlbQueryDto vHemsGhlbQueryDto) throws Exception;
	
	/**
	 * @param	vHemsGhlbQueryDto
	 * @return	已挂号患者列表
	 * @throws	Exception
	 */
	public List<VHemsGhlbCustom> getRegisteredList(VHemsGhlbQueryDto vHemsGhlbQueryDto) throws Exception;
	
	//////////////////////////////////医嘱信息///////////////////////////////////////
	public List<HspCfxxInfoCustom> findCfxxLocalAndHISList(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception;	
	
	//////////////////////////////////收费信息///////////////////////////////////////
	/**
	 * 患者收费明细列表
	 * @param vstCad
	 * @param emgDat
	 * @param emgSeq
	 * @return
	 */
	public List<VHemsSfxxCustom> getVHemsSfxxList(VHemsSfxxDto vHemsSfxxDto);

	public Map<String, Object> findEmergencyOuttime(String string);

	public Map<String, Object> findOutTimeList(HemshisDto hemshisDto);

	public void updateCleanListHz(HemshisDto hemshisDto, ActiveUser activeUser);

	public int findRczGhxxCount(HemshisDto hemshisDto);

	public List<VHemsRczCustom> findRczGhxx(HemshisDto hemshisDto);

	public void updateRczGhxxBd(HspemginfQueryDto hspemginfQueryDto) throws Exception;

	public void updateCleanRcz(String emgSeq,String mpi, Long jzxh) throws Exception;

	public void sendDjhc(HspemginfQueryDto hspemginfQueryDto) throws Exception;

	void updateRczGhxxBdMz(HspemginfCustom hspemginfCustomXm) throws Exception;

	public void sendLgxxSd(String emgSeq, String string) throws Exception;

	public void updateRczGhxxBdMz(HspemginfQueryDto hspemginfQueryDto) throws Exception;

	public VHemsRcz selectForMz(String mpi, Long jzxh);
	
	public List<VHemsJyjg> findRecentJyjg();
}
