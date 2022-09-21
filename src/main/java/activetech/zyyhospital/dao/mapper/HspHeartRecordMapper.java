package activetech.zyyhospital.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspHeartRecord;
import activetech.zyyhospital.pojo.domain.HspHeartRecordExample;

public interface HspHeartRecordMapper {
    long countByExample(HspHeartRecordExample example);

    int deleteByExample(HspHeartRecordExample example);

    int deleteByPrimaryKey(String heartSeq);

    int insert(HspHeartRecord record);

    int insertSelective(HspHeartRecord record);

    List<HspHeartRecord> selectByExample(HspHeartRecordExample example);

    HspHeartRecord selectByPrimaryKey(String heartSeq);

    int updateByExampleSelective(@Param("record") HspHeartRecord record, @Param("example") HspHeartRecordExample example);

    int updateByExample(@Param("record") HspHeartRecord record, @Param("example") HspHeartRecordExample example);

    int updateByPrimaryKeySelective(HspHeartRecord record);

    int updateByPrimaryKey(HspHeartRecord record);
}