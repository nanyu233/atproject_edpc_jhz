package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.dto.HspCscpnInfCustom;

public interface HspCscpnInfMapperCustom {
    
    List<HspCscpnInfCustom> selectByExample(String emgSeq);

}