package activetech.pda.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.pda.pojo.domain.HspCfxxExec;
import activetech.pda.pojo.domain.HspCfxxExecExample;

public interface HspCfxxExecMapper {
    long countByExample(HspCfxxExecExample example);

    int deleteByExample(HspCfxxExecExample example);

    int deleteByPrimaryKey(String execSeq);

    int insert(HspCfxxExec record);

    int insertSelective(HspCfxxExec record);

    List<HspCfxxExec> selectByExample(HspCfxxExecExample example);

    HspCfxxExec selectByPrimaryKey(String execSeq);

    int updateByExampleSelective(@Param("record") HspCfxxExec record, @Param("example") HspCfxxExecExample example);

    int updateByExample(@Param("record") HspCfxxExec record, @Param("example") HspCfxxExecExample example);

    int updateByPrimaryKeySelective(HspCfxxExec record);

    int updateByPrimaryKey(HspCfxxExec record);
}