package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspDgpgInf;
import activetech.zyyhospital.pojo.domain.HspDgpgInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspDgpgInfMapper {
    int countByExample(HspDgpgInfExample example);

    int deleteByExample(HspDgpgInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspDgpgInf record);

    int insertSelective(HspDgpgInf record);

    List<HspDgpgInf> selectByExample(HspDgpgInfExample example);

    HspDgpgInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspDgpgInf record, @Param("example") HspDgpgInfExample example);

    int updateByExample(@Param("record") HspDgpgInf record, @Param("example") HspDgpgInfExample example);

    int updateByPrimaryKeySelective(HspDgpgInf record);

    int updateByPrimaryKey(HspDgpgInf record);
}