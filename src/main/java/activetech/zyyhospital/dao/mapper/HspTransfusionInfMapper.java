package activetech.zyyhospital.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspTransfusionInf;
import activetech.zyyhospital.pojo.domain.HspTransfusionInfExample;

public interface HspTransfusionInfMapper {
    long countByExample(HspTransfusionInfExample example);

    int deleteByExample(HspTransfusionInfExample example);

    int deleteByPrimaryKey(String transfusionSeq);

    int insert(HspTransfusionInf record);

    int insertSelective(HspTransfusionInf record);

    List<HspTransfusionInf> selectByExample(HspTransfusionInfExample example);

    HspTransfusionInf selectByPrimaryKey(String transfusionSeq);

    int updateByExampleSelective(@Param("record") HspTransfusionInf record, @Param("example") HspTransfusionInfExample example);

    int updateByExample(@Param("record") HspTransfusionInf record, @Param("example") HspTransfusionInfExample example);

    int updateByPrimaryKeySelective(HspTransfusionInf record);

    int updateByPrimaryKey(HspTransfusionInf record);
}