package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCsabcInf;
import activetech.edpc.pojo.domain.HspCsabcInfExample;
import activetech.edpc.pojo.domain.HspCsabcInfKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCsabcInfMapper {
    int countByExample(HspCsabcInfExample example);

    int deleteByExample(HspCsabcInfExample example);

    int deleteByPrimaryKey(HspCsabcInfKey key);

    int insert(HspCsabcInf record);

    int insertSelective(HspCsabcInf record);

    List<HspCsabcInf> selectByExample(HspCsabcInfExample example);

    HspCsabcInf selectByPrimaryKey(HspCsabcInfKey key);

    int updateByExampleSelective(@Param("record") HspCsabcInf record, @Param("example") HspCsabcInfExample example);

    int updateByExample(@Param("record") HspCsabcInf record, @Param("example") HspCsabcInfExample example);

    int updateByPrimaryKeySelective(HspCsabcInf record);

    int updateByPrimaryKey(HspCsabcInf record);
}