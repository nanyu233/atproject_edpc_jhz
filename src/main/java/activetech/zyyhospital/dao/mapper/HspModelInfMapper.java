package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspModelInf;
import activetech.zyyhospital.pojo.domain.HspModelInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspModelInfMapper {
    int countByExample(HspModelInfExample example);

    int deleteByExample(HspModelInfExample example);

    int deleteByPrimaryKey(String modelSeq);

    int insert(HspModelInf record);

    int insertSelective(HspModelInf record);

    List<HspModelInf> selectByExample(HspModelInfExample example);

    HspModelInf selectByPrimaryKey(String modelSeq);

    int updateByExampleSelective(@Param("record") HspModelInf record, @Param("example") HspModelInfExample example);

    int updateByExample(@Param("record") HspModelInf record, @Param("example") HspModelInfExample example);

    int updateByPrimaryKeySelective(HspModelInf record);

    int updateByPrimaryKey(HspModelInf record);
}