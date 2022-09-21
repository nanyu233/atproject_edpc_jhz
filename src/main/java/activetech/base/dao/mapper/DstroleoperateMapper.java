package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstroleoperate;
import activetech.base.pojo.domain.DstroleoperateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstroleoperateMapper {
    int countByExample(DstroleoperateExample example);

    int deleteByExample(DstroleoperateExample example);

    int deleteByPrimaryKey(String id);

    int insert(Dstroleoperate record);

    int insertSelective(Dstroleoperate record);

    List<Dstroleoperate> selectByExample(DstroleoperateExample example);

    Dstroleoperate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Dstroleoperate record, @Param("example") DstroleoperateExample example);

    int updateByExample(@Param("record") Dstroleoperate record, @Param("example") DstroleoperateExample example);

    int updateByPrimaryKeySelective(Dstroleoperate record);

    int updateByPrimaryKey(Dstroleoperate record);
}