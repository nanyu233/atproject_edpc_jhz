package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.dto.HspCerebralCourseCustom;
import activetech.zyyhospital.pojo.dto.HspCerebralQueryDto;

import java.util.List;

public interface HspCerebralCourseCustomMapper {
    int getCerebralCourseCountByEmgSeq(HspCerebralQueryDto hspCerebralQueryDto);

    List<HspCerebralCourseCustom> findCerebralCourseListByEmgSeq(HspCerebralQueryDto hspCerebralQueryDto);
    
    HspCerebralCourseCustom getCerebralCourseByEmgSeq(String emgSeq);

}