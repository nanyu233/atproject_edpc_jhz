package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCsabcDef;
import activetech.edpc.pojo.domain.HspCsabcDefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCsabcDefMapper {
    long countByExample(HspCsabcDefExample example);

    int deleteByExample(HspCsabcDefExample example);

    int insert(HspCsabcDef record);

    int insertSelective(HspCsabcDef record);

    List<HspCsabcDef> selectByExample(HspCsabcDefExample example);

    int updateByExampleSelective(@Param("record") HspCsabcDef record, @Param("example") HspCsabcDefExample example);

    int updateByExample(@Param("record") HspCsabcDef record, @Param("example") HspCsabcDefExample example);
}