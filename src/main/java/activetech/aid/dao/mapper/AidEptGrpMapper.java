package activetech.aid.dao.mapper;

import activetech.aid.pojo.domain.AidEptGrp;
import activetech.aid.pojo.domain.AidEptGrpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AidEptGrpMapper {
    long countByExample(AidEptGrpExample example);

    int deleteByExample(AidEptGrpExample example);

    int deleteByPrimaryKey(String grpSeq);

    int insert(AidEptGrp record);

    int insertSelective(AidEptGrp record);

    List<AidEptGrp> selectByExample(AidEptGrpExample example);

    AidEptGrp selectByPrimaryKey(String grpSeq);

    int updateByExampleSelective(@Param("record") AidEptGrp record, @Param("example") AidEptGrpExample example);

    int updateByExample(@Param("record") AidEptGrp record, @Param("example") AidEptGrpExample example);

    int updateByPrimaryKeySelective(AidEptGrp record);

    int updateByPrimaryKey(AidEptGrp record);
}