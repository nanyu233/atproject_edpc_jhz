package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspFrbrInf;
import activetech.zyyhospital.pojo.domain.HspFrbrInfExample;

public interface HspFrbrInfMapper {
    long countByExample(HspFrbrInfExample example);

    int deleteByExample(HspFrbrInfExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspFrbrInf record);

    int insertSelective(HspFrbrInf record);

    List<HspFrbrInf> selectByExample(HspFrbrInfExample example);

    HspFrbrInf selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspFrbrInf record, @Param("example") HspFrbrInfExample example);

    int updateByExample(@Param("record") HspFrbrInf record, @Param("example") HspFrbrInfExample example);

    int updateByPrimaryKeySelective(HspFrbrInf record);

    int updateByPrimaryKey(HspFrbrInf record);
}