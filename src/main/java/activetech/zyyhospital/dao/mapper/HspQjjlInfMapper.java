package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspQjjlInf;
import activetech.zyyhospital.pojo.domain.HspQjjlInfExample;

public interface HspQjjlInfMapper {
    long countByExample(HspQjjlInfExample example);

    int deleteByExample(HspQjjlInfExample example);

    int deleteByPrimaryKey(String qjjlSeq);

    int insert(HspQjjlInf record);

    int insertSelective(HspQjjlInf record);

    List<HspQjjlInf> selectByExampleWithBLOBs(HspQjjlInfExample example);

    List<HspQjjlInf> selectByExample(HspQjjlInfExample example);

    HspQjjlInf selectByPrimaryKey(String qjjlSeq);

    int updateByExampleSelective(@Param("record") HspQjjlInf record, @Param("example") HspQjjlInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspQjjlInf record, @Param("example") HspQjjlInfExample example);

    int updateByExample(@Param("record") HspQjjlInf record, @Param("example") HspQjjlInfExample example);

    int updateByPrimaryKeySelective(HspQjjlInf record);

    int updateByPrimaryKeyWithBLOBs(HspQjjlInf record);

    int updateByPrimaryKey(HspQjjlInf record);
}