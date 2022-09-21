package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspCxfxpgb;
import activetech.zyyhospital.pojo.domain.HspCxfxpgbExample;

public interface HspCxfxpgbMapper {
    int countByExample(HspCxfxpgbExample example);

    int deleteByExample(HspCxfxpgbExample example);

    int deleteByPrimaryKey(String riskSeq);

    int insert(HspCxfxpgb record);

    int insertSelective(HspCxfxpgb record);

    List<HspCxfxpgb> selectByExample(HspCxfxpgbExample example);

    HspCxfxpgb selectByPrimaryKey(String riskSeq);

    int updateByExampleSelective(@Param("record") HspCxfxpgb record, @Param("example") HspCxfxpgbExample example);

    int updateByExample(@Param("record") HspCxfxpgb record, @Param("example") HspCxfxpgbExample example);

    int updateByPrimaryKeySelective(HspCxfxpgb record);

    int updateByPrimaryKey(HspCxfxpgb record);
}