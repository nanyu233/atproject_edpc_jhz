package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspJjchqkInf;
import activetech.zyyhospital.pojo.domain.HspJjchqkInfExample;

public interface HspJjchqkInfMapper {
    long countByExample(HspJjchqkInfExample example);

    int deleteByExample(HspJjchqkInfExample example);

    int deleteByPrimaryKey(String chqkId);

    int insert(HspJjchqkInf record);

    int insertSelective(HspJjchqkInf record);

    List<HspJjchqkInf> selectByExample(HspJjchqkInfExample example);

    HspJjchqkInf selectByPrimaryKey(String chqkId);

    int updateByExampleSelective(@Param("record") HspJjchqkInf record, @Param("example") HspJjchqkInfExample example);

    int updateByExample(@Param("record") HspJjchqkInf record, @Param("example") HspJjchqkInfExample example);

    int updateByPrimaryKeySelective(HspJjchqkInf record);

    int updateByPrimaryKey(HspJjchqkInf record);
}