package activetech.zyyhospital.dao.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspJzcspgInf;
import activetech.zyyhospital.pojo.domain.HspJzcspgInfExample;

public interface HspJzcspgInfMapper {
    long countByExample(HspJzcspgInfExample example);

    int deleteByExample(HspJzcspgInfExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspJzcspgInf record);

    int insertSelective(HspJzcspgInf record);

    List<HspJzcspgInf> selectByExample(HspJzcspgInfExample example);

    HspJzcspgInf selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspJzcspgInf record, @Param("example") HspJzcspgInfExample example);

    int updateByExample(@Param("record") HspJzcspgInf record, @Param("example") HspJzcspgInfExample example);

    int updateByPrimaryKeySelective(HspJzcspgInf record);

    int updateByPrimaryKey(HspJzcspgInf record);
}