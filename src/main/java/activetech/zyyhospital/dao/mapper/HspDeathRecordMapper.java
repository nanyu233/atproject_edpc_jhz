package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspDeathRecord;
import activetech.zyyhospital.pojo.domain.HspDeathRecordExample;
import activetech.zyyhospital.pojo.domain.HspDeathRecordWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspDeathRecordMapper {
    int countByExample(HspDeathRecordExample example);

    int deleteByExample(HspDeathRecordExample example);

    int deleteByPrimaryKey(String deathRecordSeq);

    int insert(HspDeathRecordWithBLOBs record);

    int insertSelective(HspDeathRecordWithBLOBs record);

    List<HspDeathRecordWithBLOBs> selectByExampleWithBLOBs(HspDeathRecordExample example);

    List<HspDeathRecord> selectByExample(HspDeathRecordExample example);

    HspDeathRecordWithBLOBs selectByPrimaryKey(String deathRecordSeq);

    int updateByExampleSelective(@Param("record") HspDeathRecordWithBLOBs record, @Param("example") HspDeathRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") HspDeathRecordWithBLOBs record, @Param("example") HspDeathRecordExample example);

    int updateByExample(@Param("record") HspDeathRecord record, @Param("example") HspDeathRecordExample example);

    int updateByPrimaryKeySelective(HspDeathRecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HspDeathRecordWithBLOBs record);

    int updateByPrimaryKey(HspDeathRecord record);
}