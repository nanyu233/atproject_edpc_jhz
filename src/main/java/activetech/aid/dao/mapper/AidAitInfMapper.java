package activetech.aid.dao.mapper;

import activetech.aid.pojo.domain.AidAitInf;
import activetech.aid.pojo.domain.AidAitInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AidAitInfMapper {
    long countByExample(AidAitInfExample example);

    int deleteByExample(AidAitInfExample example);

    int deleteByPrimaryKey(String aitSeq);

    int insert(AidAitInf record);

    int insertSelective(AidAitInf record);

    List<AidAitInf> selectByExample(AidAitInfExample example);

    AidAitInf selectByPrimaryKey(String aitSeq);

    int updateByExampleSelective(@Param("record") AidAitInf record, @Param("example") AidAitInfExample example);

    int updateByExample(@Param("record") AidAitInf record, @Param("example") AidAitInfExample example);

    int updateByPrimaryKeySelective(AidAitInf record);

    int updateByPrimaryKey(AidAitInf record);
}