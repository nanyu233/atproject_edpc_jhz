package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.dto.HspCerebralSheetCustom;

import java.util.List;

public interface HspCerebralSheetCustomMapper {

    List<HspCerebralSheetCustom> findSheetBySeq(HspCerebralSheetCustom hspCerebralSheetCustom);

}