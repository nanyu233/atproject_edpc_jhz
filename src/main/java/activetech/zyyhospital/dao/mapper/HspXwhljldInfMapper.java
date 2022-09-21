package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspXwhljldInf;
import activetech.zyyhospital.pojo.domain.HspXwhljldInfExample;

public interface HspXwhljldInfMapper {
    long countByExample(HspXwhljldInfExample example);

    int deleteByExample(HspXwhljldInfExample example);

    int deleteByPrimaryKey(String xwhiSeq);

    int insert(HspXwhljldInf record);

    int insertSelective(HspXwhljldInf record);

    List<HspXwhljldInf> selectByExample(HspXwhljldInfExample example);

    HspXwhljldInf selectByPrimaryKey(String xwhiSeq);

    int updateByExampleSelective(@Param("record") HspXwhljldInf record, @Param("example") HspXwhljldInfExample example);

    int updateByExample(@Param("record") HspXwhljldInf record, @Param("example") HspXwhljldInfExample example);

    int updateByPrimaryKeySelective(HspXwhljldInf record);

    int updateByPrimaryKey(HspXwhljldInf record);
}