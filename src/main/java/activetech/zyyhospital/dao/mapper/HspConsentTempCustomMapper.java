package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspConsentTempCustom;
import activetech.zyyhospital.pojo.dto.HspConsentTempCustomDto;

public interface HspConsentTempCustomMapper {
    public List<HspConsentTempCustom>  findHspConsentTemp(HspConsentTempCustomDto hspConsentTempCustomDto);
}
