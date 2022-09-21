package activetech.base.dao.mapper;



import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.domain.Dstrole;
import activetech.base.pojo.domain.DstroleExample;

public interface DstroleMapper {
    long countByExample(DstroleExample example);

    int deleteByExample(DstroleExample example);

    int deleteByPrimaryKey(String roleid);

    int insert(Dstrole record);

    int insertSelective(Dstrole record);

    List<Dstrole> selectByExample(DstroleExample example);

    Dstrole selectByPrimaryKey(String roleid);

    int updateByExampleSelective(@Param("record") Dstrole record, @Param("example") DstroleExample example);

    int updateByExample(@Param("record") Dstrole record, @Param("example") DstroleExample example);

    int updateByPrimaryKeySelective(Dstrole record);

    int updateByPrimaryKey(Dstrole record);
}