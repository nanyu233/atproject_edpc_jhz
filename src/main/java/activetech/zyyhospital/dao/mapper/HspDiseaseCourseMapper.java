package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspDiseaseCourse;
import activetech.zyyhospital.pojo.domain.HspDiseaseCourseExample;
import activetech.zyyhospital.pojo.domain.HspDiseaseCourseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspDiseaseCourseMapper {
    int countByExample(HspDiseaseCourseExample example);

    int deleteByExample(HspDiseaseCourseExample example);

    int deleteByPrimaryKey(String diseaseCourseSeq);

    int insert(HspDiseaseCourseWithBLOBs record);

    int insertSelective(HspDiseaseCourseWithBLOBs record);

    List<HspDiseaseCourseWithBLOBs> selectByExampleWithBLOBs(HspDiseaseCourseExample example);

    List<HspDiseaseCourse> selectByExample(HspDiseaseCourseExample example);

    HspDiseaseCourseWithBLOBs selectByPrimaryKey(String diseaseCourseSeq);

    int updateByExampleSelective(@Param("record") HspDiseaseCourseWithBLOBs record, @Param("example") HspDiseaseCourseExample example);

    int updateByExampleWithBLOBs(@Param("record") HspDiseaseCourseWithBLOBs record, @Param("example") HspDiseaseCourseExample example);

    int updateByExample(@Param("record") HspDiseaseCourse record, @Param("example") HspDiseaseCourseExample example);

    int updateByPrimaryKeySelective(HspDiseaseCourseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HspDiseaseCourseWithBLOBs record);

    int updateByPrimaryKey(HspDiseaseCourse record);
}