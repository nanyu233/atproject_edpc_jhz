package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspSjxtpgInf;
import activetech.zyyhospital.pojo.domain.HspSjxtpgInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspSjxtpgInfMapper {
    int countByExample(HspSjxtpgInfExample example);

    int deleteByExample(HspSjxtpgInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspSjxtpgInf record);

    int insertSelective(HspSjxtpgInf record);

    List<HspSjxtpgInf> selectByExample(HspSjxtpgInfExample example);

    HspSjxtpgInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspSjxtpgInf record, @Param("example") HspSjxtpgInfExample example);

    int updateByExample(@Param("record") HspSjxtpgInf record, @Param("example") HspSjxtpgInfExample example);

    int updateByPrimaryKeySelective(HspSjxtpgInf record);

    int updateByPrimaryKey(HspSjxtpgInf record);
}