package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstrolemodule;
import activetech.base.pojo.domain.DstrolemoduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstrolemoduleMapper {
    int countByExample(DstrolemoduleExample example);

    int deleteByExample(DstrolemoduleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Dstrolemodule record);

    int insertSelective(Dstrolemodule record);

    List<Dstrolemodule> selectByExample(DstrolemoduleExample example);

    Dstrolemodule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Dstrolemodule record, @Param("example") DstrolemoduleExample example);

    int updateByExample(@Param("record") Dstrolemodule record, @Param("example") DstrolemoduleExample example);

    int updateByPrimaryKeySelective(Dstrolemodule record);

    int updateByPrimaryKey(Dstrolemodule record);
}