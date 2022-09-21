package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstlog;
import activetech.base.pojo.domain.DstlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstlogMapper {
    int countByExample(DstlogExample example);

    int deleteByExample(DstlogExample example);

    int deleteByPrimaryKey(String id);

    int insert(Dstlog record);

    int insertSelective(Dstlog record);

    List<Dstlog> selectByExample(DstlogExample example);

    Dstlog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Dstlog record, @Param("example") DstlogExample example);

    int updateByExample(@Param("record") Dstlog record, @Param("example") DstlogExample example);

    int updateByPrimaryKeySelective(Dstlog record);

    int updateByPrimaryKey(Dstlog record);
}