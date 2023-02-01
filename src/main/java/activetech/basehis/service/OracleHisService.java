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
import activetech.external.pojo.dto.VHemsJcjgCustom;
import activetech.external.pojo.dto.VHemsJyjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;

public interface OracleHisService {

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

	public void updateRczGhxxBd(HspemginfQueryDto hspemginfQueryDto) throws Exception;

	public void updateCleanRcz(String emgSeq,String mpi, Long jzxh) throws Exception;

	public List<VHemsRczCustom> findRczGhxx(HemshisDto hemshisDto);

	public int findRczGhxxCount(HemshisDto hemshisDto);

	public void sendDjhc(HspemginfQueryDto hspemginfQueryDto) throws Exception;

	public List<VHemsJyjg> findRecentJyjg();

	int findJyxxCount(VHemsJyjgQueryDto vHemsJyjgQueryDto ) throws Exception;

	List<VHemsJyjgCustom> findJyxx(VHemsJyjgQueryDto vHemsJyjgQueryDto)throws Exception;

	int findJyxxInfoCount(VHemsJyjgQueryDto vHemsJyjgQueryDto ) throws Exception;

	List<VHemsJyjgCustom> findJyxxInfo(
			VHemsJyjgQueryDto vHemsJyjgQueryDto ) throws Exception;

	List<VHemsJcjgCustom> findJcjg(VHemsJyjgQueryDto vHemsJyjgQueryDto)throws Exception;

	List<HspCfxxInfoCustom> findCfxxLocalAndHISList(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception;

	/**
	 * 根据卡号获取患者信息
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public  VHemsEmpi selectEmpiByHis(String cardNo,String cardType,String trackData) throws Exception;
}
