package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspCheckCaseInf;
import activetech.zyyhospital.pojo.domain.HspCheckCaseInfExample;

public interface HspCheckCaseInfMapper {
    int countByExample(HspCheckCaseInfExample example);

    int deleteByExample(HspCheckCaseInfExample example);

    int deleteByPrimaryKey(String emgSeqCheck);

    int insert(HspCheckCaseInf record);

    int insertSelective(HspCheckCaseInf record);

    List<HspCheckCaseInf> selectByExample(HspCheckCaseInfExample example);

    HspCheckCaseInf selectByPrimaryKey(String emgSeqCheck);

    int updateByExampleSelective(@Param("record") HspCheckCaseInf record, @Param("example") HspCheckCaseInfExample example);

    int updateByExample(@Param("record") HspCheckCaseInf record, @Param("example") HspCheckCaseInfExample example);

    int updateByPrimaryKeySelective(HspCheckCaseInf record);

    int updateByPrimaryKey(HspCheckCaseInf record);
}