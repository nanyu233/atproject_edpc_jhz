package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspDgpgclrInf;
import activetech.zyyhospital.pojo.domain.HspDgpgclrInfExample;

public interface HspDgpgclrInfMapper {
    long countByExample(HspDgpgclrInfExample example);

    int deleteByExample(HspDgpgclrInfExample example);

    int insert(HspDgpgclrInf record);

    int insertSelective(HspDgpgclrInf record);

    List<HspDgpgclrInf> selectByExample(HspDgpgclrInfExample example);

    int updateByExampleSelective(@Param("record") HspDgpgclrInf record, @Param("example") HspDgpgclrInfExample example);

    int updateByExample(@Param("record") HspDgpgclrInf record, @Param("example") HspDgpgclrInfExample example);
}