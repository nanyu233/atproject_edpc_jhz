package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspNihssInf;
import activetech.zyyhospital.pojo.domain.HspNihssInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspNihssInfMapper {
    int countByExample(HspNihssInfExample example);

    int deleteByExample(HspNihssInfExample example);

    int deleteByPrimaryKey(String cerebralCourseSeq);

    int insert(HspNihssInf record);

    int insertSelective(HspNihssInf record);

    List<HspNihssInf> selectByExample(HspNihssInfExample example);

    HspNihssInf selectByPrimaryKey(String cerebralCourseSeq);

    int updateByExampleSelective(@Param("record") HspNihssInf record, @Param("example") HspNihssInfExample example);

    int updateByExample(@Param("record") HspNihssInf record, @Param("example") HspNihssInfExample example);

    int updateByPrimaryKeySelective(HspNihssInf record);

    int updateByPrimaryKey(HspNihssInf record);
}