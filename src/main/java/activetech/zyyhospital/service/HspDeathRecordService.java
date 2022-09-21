package activetech.zyyhospital.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.dto.HspDeathRecordCustom;
import activetech.zyyhospital.pojo.dto.HspDeathRecordQueryDto;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;

public interface HspDeathRecordService {

	HspDeathRecordCustom findDeathRecord(HspDeathRecordQueryDto hspDeathRecordQueryDto);

	void saveOrUpdateFirst(HspDeathRecordQueryDto hspDeathRecordQueryDto,
			HspLqbljlQueryDto hspLqbljlQueryDto, ActiveUser activeUser) throws Exception;

	void deleteDeathRecord(String deathRecordSeq);


}
