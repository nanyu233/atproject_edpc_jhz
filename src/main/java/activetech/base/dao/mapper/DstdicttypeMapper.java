package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstdicttype;
import activetech.base.pojo.domain.DstdicttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstdicttypeMapper {
    int countByExample(DstdicttypeExample example);

    int deleteByExample(DstdicttypeExample example);

    int deleteByPrimaryKey(String typecode);

    int insert(Dstdicttype record);

    int insertSelective(Dstdicttype record);

    List<Dstdicttype> selectByExample(DstdicttypeExample example);

    Dstdicttype selectByPrimaryKey(String typecode);

    int updateByExampleSelective(@Param("record") Dstdicttype record, @Param("example") DstdicttypeExample example);

    int updateByExample(@Param("record") Dstdicttype record, @Param("example") DstdicttypeExample example);

    int updateByPrimaryKeySelective(Dstdicttype record);

    int updateByPrimaryKey(Dstdicttype record);
}