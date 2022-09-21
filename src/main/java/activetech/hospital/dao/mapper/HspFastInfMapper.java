package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspFastInf;
import activetech.hospital.pojo.domain.HspFastInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFastInfMapper {
    int countByExample(HspFastInfExample example);

    int deleteByExample(HspFastInfExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspFastInf record);

    int insertSelective(HspFastInf record);

    List<HspFastInf> selectByExample(HspFastInfExample example);

    HspFastInf selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspFastInf record, @Param("example") HspFastInfExample example);

    int updateByExample(@Param("record") HspFastInf record, @Param("example") HspFastInfExample example);

    int updateByPrimaryKeySelective(HspFastInf record);

    int updateByPrimaryKey(HspFastInf record);
}