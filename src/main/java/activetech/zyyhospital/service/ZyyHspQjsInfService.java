package activetech.zyyhospital.service;

import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.zyyhospital.pojo.dto.QjsCountCustom;

public interface ZyyHspQjsInfService {

	/**
	 * 诊断录入保存
	 * @param hspemginfQueryDto
	 * @param jbzdSeqList
	 * @throws Exception
	 */
	HspsqlinfCustom updateLqxxdj(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	/**
	 * 抢救室相关统计
	 * @param hspemginfQueryDto
	 * @return
	 */
	QjsCountCustom getqjsDataCount(HspemginfQueryDto hspemginfQueryDto);
	void sendLgxx(HspemginfQueryDto hspemginfQueryDto) throws Exception;
}
