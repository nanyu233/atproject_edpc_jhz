package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspGcsInf;
import activetech.hospital.pojo.domain.HspGcsInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspGcsInfMapper {
    int countByExample(HspGcsInfExample example);

    int deleteByExample(HspGcsInfExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspGcsInf record);

    int insertSelective(HspGcsInf record);

    List<HspGcsInf> selectByExample(HspGcsInfExample example);

    HspGcsInf selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspGcsInf record, @Param("example") HspGcsInfExample example);

    int updateByExample(@Param("record") HspGcsInf record, @Param("example") HspGcsInfExample example);

    int updateByPrimaryKeySelective(HspGcsInf record);

    int updateByPrimaryKey(HspGcsInf record);
}