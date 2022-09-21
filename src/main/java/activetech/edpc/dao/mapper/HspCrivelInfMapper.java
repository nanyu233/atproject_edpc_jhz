package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.domain.HspCrivelInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCrivelInfMapper {
    int countByExample(HspCrivelInfExample example);

    int deleteByExample(HspCrivelInfExample example);

    int deleteByPrimaryKey(String velSeq);

    int insert(HspCrivelInf record);

    int insertSelective(HspCrivelInf record);

    List<HspCrivelInf> selectByExample(HspCrivelInfExample example);

    HspCrivelInf selectByPrimaryKey(String velSeq);

    int updateByExampleSelective(@Param("record") HspCrivelInf record, @Param("example") HspCrivelInfExample example);

    int updateByExample(@Param("record") HspCrivelInf record, @Param("example") HspCrivelInfExample example);

    int updateByPrimaryKeySelective(HspCrivelInf record);

    int updateByPrimaryKey(HspCrivelInf record);
}