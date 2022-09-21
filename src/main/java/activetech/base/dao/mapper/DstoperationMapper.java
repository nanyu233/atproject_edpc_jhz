package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstoperation;
import activetech.base.pojo.domain.DstoperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstoperationMapper {
    int countByExample(DstoperationExample example);

    int deleteByExample(DstoperationExample example);

    int deleteByPrimaryKey(String operateid);

    int insert(Dstoperation record);

    int insertSelective(Dstoperation record);

    List<Dstoperation> selectByExample(DstoperationExample example);

    Dstoperation selectByPrimaryKey(String operateid);

    int updateByExampleSelective(@Param("record") Dstoperation record, @Param("example") DstoperationExample example);

    int updateByExample(@Param("record") Dstoperation record, @Param("example") DstoperationExample example);

    int updateByPrimaryKeySelective(Dstoperation record);

    int updateByPrimaryKey(Dstoperation record);
}