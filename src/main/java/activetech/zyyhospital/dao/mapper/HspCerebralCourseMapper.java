package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspCerebralCourse;
import activetech.zyyhospital.pojo.domain.HspCerebralCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCerebralCourseMapper {
    int countByExample(HspCerebralCourseExample example);

    int deleteByExample(HspCerebralCourseExample example);

    int deleteByPrimaryKey(String cerebralCourseSeq);

    int insert(HspCerebralCourse record);

    int insertSelective(HspCerebralCourse record);

    List<HspCerebralCourse> selectByExample(HspCerebralCourseExample example);

    HspCerebralCourse selectByPrimaryKey(String cerebralCourseSeq);

    int updateByExampleSelective(@Param("record") HspCerebralCourse record, @Param("example") HspCerebralCourseExample example);

    int updateByExample(@Param("record") HspCerebralCourse record, @Param("example") HspCerebralCourseExample example);

    int updateByPrimaryKeySelective(HspCerebralCourse record);

    int updateByPrimaryKey(HspCerebralCourse record);
}