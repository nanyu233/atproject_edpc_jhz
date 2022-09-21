package activetech.zyyhospital.dao.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspNczrslchcbInf;
import activetech.zyyhospital.pojo.domain.HspNczrslchcbInfExample;

public interface HspNczrslchcbInfMapper {
    long countByExample(HspNczrslchcbInfExample example);

    int deleteByExample(HspNczrslchcbInfExample example);

    int deleteByPrimaryKey(String seqno);

    int insert(HspNczrslchcbInf record);

    int insertSelective(HspNczrslchcbInf record);

    List<HspNczrslchcbInf> selectByExample(HspNczrslchcbInfExample example);

    HspNczrslchcbInf selectByPrimaryKey(String seqno);

    int updateByExampleSelective(@Param("record") HspNczrslchcbInf record, @Param("example") HspNczrslchcbInfExample example);

    int updateByExample(@Param("record") HspNczrslchcbInf record, @Param("example") HspNczrslchcbInfExample example);

    int updateByPrimaryKeySelective(HspNczrslchcbInf record);

    int updateByPrimaryKey(HspNczrslchcbInf record);
}