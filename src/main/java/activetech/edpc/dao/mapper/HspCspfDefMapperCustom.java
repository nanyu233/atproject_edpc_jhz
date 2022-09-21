package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.dto.HspCspfDefCustom;

public interface HspCspfDefMapperCustom {
   
    List<HspCspfDefCustom> getHspCsInfListWithChecked(String emgSeq);

   
}