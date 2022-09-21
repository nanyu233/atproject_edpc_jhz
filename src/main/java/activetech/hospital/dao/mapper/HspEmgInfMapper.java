package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspEmgInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspEmgInfMapper {
    int countByExample(HspEmgInfExample example);

    int deleteByExample(HspEmgInfExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspEmgInf record);

    int insertSelective(HspEmgInf record);

    List<HspEmgInf> selectByExample(HspEmgInfExample example);

    HspEmgInf selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspEmgInf record, @Param("example") HspEmgInfExample example);

    int updateByExample(@Param("record") HspEmgInf record, @Param("example") HspEmgInfExample example);

    int updateByPrimaryKeySelective(HspEmgInf record);

    int updateByPrimaryKey(HspEmgInf record);
}