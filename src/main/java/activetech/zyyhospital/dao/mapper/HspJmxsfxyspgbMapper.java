package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspJmxsfxyspgb;
import activetech.zyyhospital.pojo.domain.HspJmxsfxyspgbExample;

public interface HspJmxsfxyspgbMapper {
    int countByExample(HspJmxsfxyspgbExample example);

    int deleteByExample(HspJmxsfxyspgbExample example);

    int deleteByPrimaryKey(String riskSeq);

    int insert(HspJmxsfxyspgb record);

    int insertSelective(HspJmxsfxyspgb record);

    List<HspJmxsfxyspgb> selectByExample(HspJmxsfxyspgbExample example);

    HspJmxsfxyspgb selectByPrimaryKey(String riskSeq);

    int updateByExampleSelective(@Param("record") HspJmxsfxyspgb record, @Param("example") HspJmxsfxyspgbExample example);

    int updateByExample(@Param("record") HspJmxsfxyspgb record, @Param("example") HspJmxsfxyspgbExample example);

    int updateByPrimaryKeySelective(HspJmxsfxyspgb record);

    int updateByPrimaryKey(HspJmxsfxyspgb record);
}