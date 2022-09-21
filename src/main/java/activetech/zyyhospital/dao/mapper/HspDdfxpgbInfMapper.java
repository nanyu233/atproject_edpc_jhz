package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspDdfxpgbInf;
import activetech.zyyhospital.pojo.domain.HspDdfxpgbInfExample;

public interface HspDdfxpgbInfMapper {
    long countByExample(HspDdfxpgbInfExample example);

    int deleteByExample(HspDdfxpgbInfExample example);

    int deleteByPrimaryKey(String ddfxpgbSeq);

    int insert(HspDdfxpgbInf record);

    int insertSelective(HspDdfxpgbInf record);

    List<HspDdfxpgbInf> selectByExample(HspDdfxpgbInfExample example);

    HspDdfxpgbInf selectByPrimaryKey(String ddfxpgbSeq);

    int updateByExampleSelective(@Param("record") HspDdfxpgbInf record, @Param("example") HspDdfxpgbInfExample example);

    int updateByExample(@Param("record") HspDdfxpgbInf record, @Param("example") HspDdfxpgbInfExample example);

    int updateByPrimaryKeySelective(HspDdfxpgbInf record);

    int updateByPrimaryKey(HspDdfxpgbInf record);
}