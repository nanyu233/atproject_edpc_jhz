package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.domain.DstappoptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstappoptionMapper {
    int countByExample(DstappoptionExample example);

    int deleteByExample(DstappoptionExample example);

    int deleteByPrimaryKey(String optkey);

    int insert(Dstappoption record);

    int insertSelective(Dstappoption record);

    List<Dstappoption> selectByExample(DstappoptionExample example);

    Dstappoption selectByPrimaryKey(String optkey);

    int updateByExampleSelective(@Param("record") Dstappoption record, @Param("example") DstappoptionExample example);

    int updateByExample(@Param("record") Dstappoption record, @Param("example") DstappoptionExample example);

    int updateByPrimaryKeySelective(Dstappoption record);

    int updateByPrimaryKey(Dstappoption record);
}