package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCscpnDef;
import activetech.edpc.pojo.domain.HspCscpnDefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCscpnDefMapper {
    long countByExample(HspCscpnDefExample example);

    int deleteByExample(HspCscpnDefExample example);

    int insert(HspCscpnDef record);

    int insertSelective(HspCscpnDef record);

    List<HspCscpnDef> selectByExample(HspCscpnDefExample example);

    int updateByExampleSelective(@Param("record") HspCscpnDef record, @Param("example") HspCscpnDefExample example);

    int updateByExample(@Param("record") HspCscpnDef record, @Param("example") HspCscpnDefExample example);
}