package activetech.pda.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.pda.pojo.domain.HspCfxxRecord;
import activetech.pda.pojo.domain.HspCfxxRecordExample;

public interface HspCfxxRecordMapper {
    long countByExample(HspCfxxRecordExample example);

    int deleteByExample(HspCfxxRecordExample example);

    int deleteByPrimaryKey(String recordSeq);

    int insert(HspCfxxRecord record);

    int insertSelective(HspCfxxRecord record);

    List<HspCfxxRecord> selectByExample(HspCfxxRecordExample example);

    HspCfxxRecord selectByPrimaryKey(String recordSeq);

    int updateByExampleSelective(@Param("record") HspCfxxRecord record, @Param("example") HspCfxxRecordExample example);

    int updateByExample(@Param("record") HspCfxxRecord record, @Param("example") HspCfxxRecordExample example);

    int updateByPrimaryKeySelective(HspCfxxRecord record);

    int updateByPrimaryKey(HspCfxxRecord record);
}