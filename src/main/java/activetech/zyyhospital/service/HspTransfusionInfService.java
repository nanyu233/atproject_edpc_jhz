package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.domain.HspTransfusionInf;
import activetech.zyyhospital.pojo.dto.HspTransfusionInfCustom;
import activetech.zyyhospital.pojo.dto.HspTransfusionInfQueryDto;

/**
 * 输血记录Service
 * @author machaofan
 *
 */
public interface HspTransfusionInfService {

	/**
	 * 查询输血记录条数
	 * @param hspTransfusionInfQueryDto
	 * @return
	 * @throws Exception
	 */
	int findTransfusionCountByEmgSeq(HspTransfusionInfQueryDto hspTransfusionInfQueryDto) throws Exception;
	
	/**
	 * 查询输血记录列表
	 * @param hspTransfusionInfQueryDto
	 * @return
	 * @throws Exception
	 */
	List<HspTransfusionInfCustom> findTransfusionListByEmgSeq(HspTransfusionInfQueryDto hspTransfusionInfQueryDto) throws Exception;
	
	/**
	 * 获取一条输血记录
	 * @param transfusionSeq
	 * @return
	 * @throws Exception
	 */
	HspTransfusionInf getTransfusionInf(String transfusionSeq) throws Exception;
	
	/**
	 * 保存输血记录
	 * @param hspTransfusionInfQueryDto
	 * @param activeUser
	 * @throws Exception
	 */
	String updateBloodTransRecord(HspTransfusionInfQueryDto hspTransfusionInfQueryDto, ActiveUser activeUser) throws Exception;
	
	/**
	 * 删除输血记录
	 * @param transfusionSeq
	 * @throws Exception
	 */
	void delBloodTransRecord(String transfusionSeq) throws Exception;
}
