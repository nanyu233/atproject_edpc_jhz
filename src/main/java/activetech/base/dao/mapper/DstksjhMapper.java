package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstksjh;
import activetech.base.pojo.domain.DstksjhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstksjhMapper {
    int countByExample(DstksjhExample example);

    int deleteByExample(DstksjhExample example);

    int deleteByPrimaryKey(String id);

    int insert(Dstksjh record);

    int insertSelective(Dstksjh record);

    List<Dstksjh> selectByExample(DstksjhExample example);

    Dstksjh selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Dstksjh record, @Param("example") DstksjhExample example);

    int updateByExample(@Param("record") Dstksjh record, @Param("example") DstksjhExample example);

    int updateByPrimaryKeySelective(Dstksjh record);

    int updateByPrimaryKey(Dstksjh record);
}