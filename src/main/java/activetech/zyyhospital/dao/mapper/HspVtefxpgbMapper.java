package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspVtefxpgb;
import activetech.zyyhospital.pojo.domain.HspVtefxpgbExample;

public interface HspVtefxpgbMapper {
    int countByExample(HspVtefxpgbExample example);

    int deleteByExample(HspVtefxpgbExample example);

    int deleteByPrimaryKey(String riskSeq);

    int insert(HspVtefxpgb record);

    int insertSelective(HspVtefxpgb record);

    List<HspVtefxpgb> selectByExample(HspVtefxpgbExample example);

    HspVtefxpgb selectByPrimaryKey(String riskSeq);

    int updateByExampleSelective(@Param("record") HspVtefxpgb record, @Param("example") HspVtefxpgbExample example);

    int updateByExample(@Param("record") HspVtefxpgb record, @Param("example") HspVtefxpgbExample example);

    int updateByPrimaryKeySelective(HspVtefxpgb record);

    int updateByPrimaryKey(HspVtefxpgb record);
}