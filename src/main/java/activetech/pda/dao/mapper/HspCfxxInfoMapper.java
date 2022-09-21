package activetech.pda.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.pda.pojo.domain.HspCfxxInfo;
import activetech.pda.pojo.domain.HspCfxxInfoExample;

public interface HspCfxxInfoMapper {
    long countByExample(HspCfxxInfoExample example);

    int deleteByExample(HspCfxxInfoExample example);

    int deleteByPrimaryKey(String daSeq);

    int insert(HspCfxxInfo record);

    int insertSelective(HspCfxxInfo record);

    List<HspCfxxInfo> selectByExample(HspCfxxInfoExample example);

    HspCfxxInfo selectByPrimaryKey(String daSeq);

    int updateByExampleSelective(@Param("record") HspCfxxInfo record, @Param("example") HspCfxxInfoExample example);

    int updateByExample(@Param("record") HspCfxxInfo record, @Param("example") HspCfxxInfoExample example);

    int updateByPrimaryKeySelective(HspCfxxInfo record);

    int updateByPrimaryKey(HspCfxxInfo record);
}