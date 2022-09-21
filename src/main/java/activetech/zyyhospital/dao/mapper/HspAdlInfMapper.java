package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspAdlInf;
import activetech.zyyhospital.pojo.domain.HspAdlInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspAdlInfMapper {
    int countByExample(HspAdlInfExample example);

    int deleteByExample(HspAdlInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspAdlInf record);

    int insertSelective(HspAdlInf record);

    List<HspAdlInf> selectByExample(HspAdlInfExample example);

    HspAdlInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspAdlInf record, @Param("example") HspAdlInfExample example);

    int updateByExample(@Param("record") HspAdlInf record, @Param("example") HspAdlInfExample example);

    int updateByPrimaryKeySelective(HspAdlInf record);

    int updateByPrimaryKey(HspAdlInf record);
}