package activetech.aid.dao.mapper;

import activetech.aid.pojo.domain.AidDingSendTask;
import activetech.aid.pojo.domain.AidDingSendTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AidDingSendTaskMapper {
    long countByExample(AidDingSendTaskExample example);

    int deleteByExample(AidDingSendTaskExample example);

    int deleteByPrimaryKey(String id);

    int insert(AidDingSendTask record);

    int insertSelective(AidDingSendTask record);

    List<AidDingSendTask> selectByExample(AidDingSendTaskExample example);

    AidDingSendTask selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AidDingSendTask record, @Param("example") AidDingSendTaskExample example);

    int updateByExample(@Param("record") AidDingSendTask record, @Param("example") AidDingSendTaskExample example);

    int updateByPrimaryKeySelective(AidDingSendTask record);

    int updateByPrimaryKey(AidDingSendTask record);
}