package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstuserrole;
import activetech.base.pojo.domain.DstuserroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstuserroleMapper {
    int countByExample(DstuserroleExample example);

    int deleteByExample(DstuserroleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Dstuserrole record);

    int insertSelective(Dstuserrole record);

    List<Dstuserrole> selectByExample(DstuserroleExample example);

    Dstuserrole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Dstuserrole record, @Param("example") DstuserroleExample example);

    int updateByExample(@Param("record") Dstuserrole record, @Param("example") DstuserroleExample example);

    int updateByPrimaryKeySelective(Dstuserrole record);

    int updateByPrimaryKey(Dstuserrole record);
}