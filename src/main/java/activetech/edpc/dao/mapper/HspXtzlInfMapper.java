package activetech.edpc.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.edpc.pojo.domain.HspXtzlInf;
import activetech.edpc.pojo.domain.HspXtzlInfExample;

public interface HspXtzlInfMapper {
    int countByExample(HspXtzlInfExample example);

    int deleteByExample(HspXtzlInfExample example);

    int deleteByPrimaryKey(String seqNo);

    int insert(HspXtzlInf record);

    int insertSelective(HspXtzlInf record);

    List<HspXtzlInf> selectByExample(HspXtzlInfExample example);

    HspXtzlInf selectByPrimaryKey(String seqNo);

    int updateByExampleSelective(@Param("record") HspXtzlInf record, @Param("example") HspXtzlInfExample example);

    int updateByExample(@Param("record") HspXtzlInf record, @Param("example") HspXtzlInfExample example);

    int updateByPrimaryKeySelective(HspXtzlInf record);

    int updateByPrimaryKey(HspXtzlInf record);
}