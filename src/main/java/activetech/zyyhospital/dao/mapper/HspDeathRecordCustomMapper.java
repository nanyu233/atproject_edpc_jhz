package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.dto.HspDeathRecordCustom;
import activetech.zyyhospital.pojo.dto.HspDeathRecordQueryDto;

public interface HspDeathRecordCustomMapper {

	HspDeathRecordCustom findDeathRecord(HspDeathRecordQueryDto hspDeathRecordQueryDto);

}
