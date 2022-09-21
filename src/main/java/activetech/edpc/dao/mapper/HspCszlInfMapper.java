package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCszlInf;
import activetech.edpc.pojo.domain.HspCszlInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCszlInfMapper {
    int countByExample(HspCszlInfExample example);

    int deleteByExample(HspCszlInfExample example);

    int deleteByPrimaryKey(String seqNo);

    int insert(HspCszlInf record);

    int insertSelective(HspCszlInf record);

    List<HspCszlInf> selectByExample(HspCszlInfExample example);

    HspCszlInf selectByPrimaryKey(String seqNo);

    int updateByExampleSelective(@Param("record") HspCszlInf record, @Param("example") HspCszlInfExample example);

    int updateByExample(@Param("record") HspCszlInf record, @Param("example") HspCszlInfExample example);

    int updateByPrimaryKeySelective(HspCszlInf record);

    int updateByPrimaryKey(HspCszlInf record);
}