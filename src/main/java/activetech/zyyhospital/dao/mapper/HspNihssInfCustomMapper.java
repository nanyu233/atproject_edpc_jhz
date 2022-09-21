package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.dto.HspNihssInfCustom;

public interface HspNihssInfCustomMapper {

    HspNihssInfCustom findNihssInfByEmgSeq(String emgSeq);
}