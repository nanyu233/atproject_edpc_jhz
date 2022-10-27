package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.domain.DstuserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstuserMapper {
    int countByExample(DstuserExample example);

    int deleteByExample(DstuserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Dstuser record);

    int insertSelective(Dstuser record);

    List<Dstuser> selectByExample(DstuserExample example);

    Dstuser selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Dstuser record, @Param("example") DstuserExample example);

    int updateByExample(@Param("record") Dstuser record, @Param("example") DstuserExample example);

    int updateByPrimaryKeySelective(Dstuser record);

    int updateByPrimaryKey(Dstuser record);
}