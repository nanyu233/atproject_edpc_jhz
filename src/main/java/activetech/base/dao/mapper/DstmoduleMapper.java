package activetech.base.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.domain.Dstmodule;
import activetech.base.pojo.domain.DstmoduleExample;

public interface DstmoduleMapper {
    int countByExample(DstmoduleExample example);

    int deleteByExample(DstmoduleExample example);

    int deleteByPrimaryKey(String moduleid);

    int insert(Dstmodule record);

    int insertSelective(Dstmodule record);

    List<Dstmodule> selectByExample(DstmoduleExample example);

    Dstmodule selectByPrimaryKey(String moduleid);

    int updateByExampleSelective(@Param("record") Dstmodule record, @Param("example") DstmoduleExample example);

    int updateByExample(@Param("record") Dstmodule record, @Param("example") DstmoduleExample example);

    int updateByPrimaryKeySelective(Dstmodule record);

    int updateByPrimaryKey(Dstmodule record);
}