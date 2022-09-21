package activetech.aid.dao.mapper;

import activetech.aid.pojo.domain.AidPatientXt;
import activetech.aid.pojo.domain.AidPatientXtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AidPatientXtMapper {
    int countByExample(AidPatientXtExample example);

    int deleteByExample(AidPatientXtExample example);

    int deleteByPrimaryKey(String xtSeq);

    int insert(AidPatientXt record);

    int insertSelective(AidPatientXt record);

    List<AidPatientXt> selectByExample(AidPatientXtExample example);

    AidPatientXt selectByPrimaryKey(String xtSeq);

    int updateByExampleSelective(@Param("record") AidPatientXt record, @Param("example") AidPatientXtExample example);

    int updateByExample(@Param("record") AidPatientXt record, @Param("example") AidPatientXtExample example);

    int updateByPrimaryKeySelective(AidPatientXt record);

    int updateByPrimaryKey(AidPatientXt record);
}