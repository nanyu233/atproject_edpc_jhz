package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCsmicDef;
import activetech.edpc.pojo.domain.HspCsmicDefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCsmicDefMapper {
    int countByExample(HspCsmicDefExample example);

    int deleteByExample(HspCsmicDefExample example);

    int insert(HspCsmicDef record);

    int insertSelective(HspCsmicDef record);

    List<HspCsmicDef> selectByExample(HspCsmicDefExample example);

    int updateByExampleSelective(@Param("record") HspCsmicDef record, @Param("example") HspCsmicDefExample example);

    int updateByExample(@Param("record") HspCsmicDef record, @Param("example") HspCsmicDefExample example);
}