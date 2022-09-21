package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspConsultationRecords;
import activetech.zyyhospital.pojo.domain.HspConsultationRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspConsultationRecordsMapper {
    long countByExample(HspConsultationRecordsExample example);

    int deleteByExample(HspConsultationRecordsExample example);

    int deleteByPrimaryKey(String consultationRecordsSeq);

    int insert(HspConsultationRecords record);

    int insertSelective(HspConsultationRecords record);

    List<HspConsultationRecords> selectByExampleWithBLOBs(HspConsultationRecordsExample example);

    List<HspConsultationRecords> selectByExample(HspConsultationRecordsExample example);

    HspConsultationRecords selectByPrimaryKey(String consultationRecordsSeq);

    int updateByExampleSelective(@Param("record") HspConsultationRecords record, @Param("example") HspConsultationRecordsExample example);

    int updateByExampleWithBLOBs(@Param("record") HspConsultationRecords record, @Param("example") HspConsultationRecordsExample example);

    int updateByExample(@Param("record") HspConsultationRecords record, @Param("example") HspConsultationRecordsExample example);

    int updateByPrimaryKeySelective(HspConsultationRecords record);

    int updateByPrimaryKeyWithBLOBs(HspConsultationRecords record);

    int updateByPrimaryKey(HspConsultationRecords record);
}