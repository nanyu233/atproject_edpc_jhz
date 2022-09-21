package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspCramsInf;
import activetech.hospital.pojo.domain.HspCramsInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCramsInfMapper {
    int countByExample(HspCramsInfExample example);

    int deleteByExample(HspCramsInfExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspCramsInf record);

    int insertSelective(HspCramsInf record);

    List<HspCramsInf> selectByExample(HspCramsInfExample example);

    HspCramsInf selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspCramsInf record, @Param("example") HspCramsInfExample example);

    int updateByExample(@Param("record") HspCramsInf record, @Param("example") HspCramsInfExample example);

    int updateByPrimaryKeySelective(HspCramsInf record);

    int updateByPrimaryKey(HspCramsInf record);
}