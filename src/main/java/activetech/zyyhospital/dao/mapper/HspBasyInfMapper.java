package activetech.zyyhospital.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspBasyInf;
import activetech.zyyhospital.pojo.domain.HspBasyInfExample;

public interface HspBasyInfMapper {
    long countByExample(HspBasyInfExample example);

    int deleteByExample(HspBasyInfExample example);

    int deleteByPrimaryKey(String basySeq);

    int insert(HspBasyInf record);

    int insertSelective(HspBasyInf record);

    List<HspBasyInf> selectByExample(HspBasyInfExample example);

    HspBasyInf selectByPrimaryKey(String basySeq);

    int updateByExampleSelective(@Param("record") HspBasyInf record, @Param("example") HspBasyInfExample example);

    int updateByExample(@Param("record") HspBasyInf record, @Param("example") HspBasyInfExample example);

    int updateByPrimaryKeySelective(HspBasyInf record);

    int updateByPrimaryKey(HspBasyInf record);
}