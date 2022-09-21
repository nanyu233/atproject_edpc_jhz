package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.domain.HspNrsInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspNrsInfMapper {
    int countByExample(HspNrsInfExample example);

    int deleteByExample(HspNrsInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspNrsInf record);

    int insertSelective(HspNrsInf record);

    List<HspNrsInf> selectByExample(HspNrsInfExample example);

    HspNrsInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspNrsInf record, @Param("example") HspNrsInfExample example);

    int updateByExample(@Param("record") HspNrsInf record, @Param("example") HspNrsInfExample example);

    int updateByPrimaryKeySelective(HspNrsInf record);

    int updateByPrimaryKey(HspNrsInf record);
}