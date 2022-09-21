package activetech.edpc.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.edpc.pojo.domain.HspXtzlDef;
import activetech.edpc.pojo.domain.HspXtzlDefExample;
import activetech.edpc.pojo.domain.HspXtzlDefKey;

public interface HspXtzlDefMapper {
    int countByExample(HspXtzlDefExample example);

    int deleteByExample(HspXtzlDefExample example);

    int deleteByPrimaryKey(HspXtzlDefKey key);

    int insert(HspXtzlDef record);

    int insertSelective(HspXtzlDef record);

    List<HspXtzlDef> selectByExample(HspXtzlDefExample example);

    HspXtzlDef selectByPrimaryKey(HspXtzlDefKey key);

    int updateByExampleSelective(@Param("record") HspXtzlDef record, @Param("example") HspXtzlDefExample example);

    int updateByExample(@Param("record") HspXtzlDef record, @Param("example") HspXtzlDefExample example);

    int updateByPrimaryKeySelective(HspXtzlDef record);

    int updateByPrimaryKey(HspXtzlDef record);
}