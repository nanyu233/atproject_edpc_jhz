package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCspfDef;
import activetech.edpc.pojo.domain.HspCspfDefExample;
import activetech.edpc.pojo.domain.HspCspfDefKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCspfDefMapper {
    int countByExample(HspCspfDefExample example);

    int deleteByExample(HspCspfDefExample example);

    int deleteByPrimaryKey(HspCspfDefKey key);

    int insert(HspCspfDef record);

    int insertSelective(HspCspfDef record);

    List<HspCspfDef> selectByExample(HspCspfDefExample example);

    HspCspfDef selectByPrimaryKey(HspCspfDefKey key);

    int updateByExampleSelective(@Param("record") HspCspfDef record, @Param("example") HspCspfDefExample example);

    int updateByExample(@Param("record") HspCspfDef record, @Param("example") HspCspfDefExample example);

    int updateByPrimaryKeySelective(HspCspfDef record);

    int updateByPrimaryKey(HspCspfDef record);
}