package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspTashInf;
import activetech.edpc.pojo.domain.HspTashInfExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspTashInfMapper {
    int countByExample(HspTashInfExample example);

    int deleteByExample(HspTashInfExample example);

    int deleteByPrimaryKey(String tashSeq);

    int insert(HspTashInf record);

    int insertSelective(HspTashInf record);

    List<HspTashInf> selectByExample(HspTashInfExample example);

    HspTashInf selectByPrimaryKey(String tashSeq);

    int updateByExampleSelective(@Param("record") HspTashInf record, @Param("example") HspTashInfExample example);

    int updateByExample(@Param("record") HspTashInf record, @Param("example") HspTashInfExample example);

    int updateByPrimaryKeySelective(HspTashInf record);

    int updateByPrimaryKey(HspTashInf record);
}