package activetech.aid.dao.mapper;

import activetech.aid.pojo.domain.AidPatient;
import activetech.aid.pojo.domain.AidPatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AidPatientMapper {
    int countByExample(AidPatientExample example);

    int deleteByExample(AidPatientExample example);

    int deleteByPrimaryKey(String patid);

    int insert(AidPatient record);

    int insertSelective(AidPatient record);

    List<AidPatient> selectByExample(AidPatientExample example);

    AidPatient selectByPrimaryKey(String patid);

    int updateByExampleSelective(@Param("record") AidPatient record, @Param("example") AidPatientExample example);

    int updateByExample(@Param("record") AidPatient record, @Param("example") AidPatientExample example);

    int updateByPrimaryKeySelective(AidPatient record);

    int updateByPrimaryKey(AidPatient record);
    
    AidPatient updateByPrimarykey(String patid);
}