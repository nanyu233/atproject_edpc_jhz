package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.domain.HspNczrslchcbInf;
import activetech.zyyhospital.pojo.dto.HspNczrslchcbInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspNrsconsentInfCustom;
import activetech.zyyhospital.pojo.dto.HspNrsconsentInfQueryDto;

public interface ZyyNrsconsentService {
	/**
	 * 根据id查找文书
	 *@param seqno
	 *@return
	 *@throws Exception
	 */
	HspNrsconsentInfCustom findHspNrsconsentInfBySeqno(String seqno) throws Exception;

	/**
	 * 保存文书
	 *@param model
	 *@param hspNrsConsentInfQueryDto
	 *@param activeUser
	 *@return
	 *@throws Exception
	 */
	HspNrsconsentInfCustom updateDocumentBySeqno(HspNrsconsentInfQueryDto hspNrsConsentInfQueryDto,
			ActiveUser activeUser) throws Exception;
	
	/**
	 * 查询文书总数
	 *@param model
	 *@param refseqno
	 *@return
	 *@throws Exception
	 */
	int findDocumentTotal(HspNrsconsentInfQueryDto hspNrsconsentInfQueryDto);

	/**
	 * 查询文书集合
	 *@param model
	 *@param refseqno
	 *@return
	 *@throws Exception
	 */
	List<HspNrsconsentInfCustom> findfindDocumentList(HspNrsconsentInfQueryDto hspNrsconsentInfQueryDto);
	/**
	 * 根据id删除文书
	 *@param seqno
	 *@return
	 *@throws Exception
	 */
	void deleteDocumentBySeqno(String seqno);

	/**
	 * 根据患者关联号REFSEQNO查询急诊科脑卒中溶栓流程核查表列表数据
	 *@param hspNczrslchcbInfQueryDto
	 *@return
	 *@throws Exception
	 */
	List<HspNczrslchcbInf> findNczrslchcbListByRefseqno(HspNczrslchcbInfQueryDto hspNczrslchcbInfQueryDto) throws Exception;

	HspNczrslchcbInf findNczrslchcbBySeqno(String seqno) throws Exception;

	String addNczrslchcbTable(HspNczrslchcbInfQueryDto hspNczrslchcbInfQueryDto) throws Exception;

	void delNczrslchcbTable(String seqno) throws Exception;

}
