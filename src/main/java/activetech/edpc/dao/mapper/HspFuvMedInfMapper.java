package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspFuvMedInf;
import activetech.edpc.pojo.domain.HspFuvMedInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFuvMedInfMapper {
    int countByExample(HspFuvMedInfExample example);

    int deleteByExample(HspFuvMedInfExample example);

    int deleteByPrimaryKey(String fmiSeq);

    int insert(HspFuvMedInf record);

    int insertSelective(HspFuvMedInf record);

    List<HspFuvMedInf> selectByExample(HspFuvMedInfExample example);

    HspFuvMedInf selectByPrimaryKey(String fmiSeq);

    int updateByExampleSelective(@Param("record") HspFuvMedInf record, @Param("example") HspFuvMedInfExample example);

    int updateByExample(@Param("record") HspFuvMedInf record, @Param("example") HspFuvMedInfExample example);

    int updateByPrimaryKeySelective(HspFuvMedInf record);

    int updateByPrimaryKey(HspFuvMedInf record);
}