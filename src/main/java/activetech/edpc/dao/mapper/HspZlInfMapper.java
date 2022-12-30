package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspZlInf;
import activetech.edpc.pojo.domain.HspZlInfExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspZlInfMapper {
    int countByExample(HspZlInfExample example);

    int deleteByExample(HspZlInfExample example);

    int deleteByPrimaryKey(String seqNo);

    int insert(HspZlInf record);

    int insertSelective(HspZlInf record);

    List<HspZlInf> selectByExample(HspZlInfExample example);

    HspZlInf selectByPrimaryKey(String seqNo);

    int updateByExampleSelective(@Param("record") HspZlInf record, @Param("example") HspZlInfExample example);

    int updateByExample(@Param("record") HspZlInf record, @Param("example") HspZlInfExample example);

    int updateByPrimaryKeySelective(HspZlInf record);

    int updateByPrimaryKey(HspZlInf record);
}