package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCsampInf;
import activetech.edpc.pojo.domain.HspCsampInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCsampInfMapper {
    int countByExample(HspCsampInfExample example);

    int deleteByExample(HspCsampInfExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspCsampInf record);

    int insertSelective(HspCsampInf record);

    List<HspCsampInf> selectByExample(HspCsampInfExample example);

    HspCsampInf selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspCsampInf record, @Param("example") HspCsampInfExample example);

    int updateByExample(@Param("record") HspCsampInf record, @Param("example") HspCsampInfExample example);

    int updateByPrimaryKeySelective(HspCsampInf record);

    int updateByPrimaryKey(HspCsampInf record);
}