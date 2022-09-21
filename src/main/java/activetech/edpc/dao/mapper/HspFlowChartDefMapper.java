package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspFlowChartDef;
import activetech.edpc.pojo.domain.HspFlowChartDefExample;
import activetech.edpc.pojo.domain.HspFlowChartDefKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFlowChartDefMapper {
    int countByExample(HspFlowChartDefExample example);

    int deleteByExample(HspFlowChartDefExample example);

    int deleteByPrimaryKey(HspFlowChartDefKey key);

    int insert(HspFlowChartDef record);

    int insertSelective(HspFlowChartDef record);

    List<HspFlowChartDef> selectByExample(HspFlowChartDefExample example);

    HspFlowChartDef selectByPrimaryKey(HspFlowChartDefKey key);

    int updateByExampleSelective(@Param("record") HspFlowChartDef record, @Param("example") HspFlowChartDefExample example);

    int updateByExample(@Param("record") HspFlowChartDef record, @Param("example") HspFlowChartDefExample example);

    int updateByPrimaryKeySelective(HspFlowChartDef record);

    int updateByPrimaryKey(HspFlowChartDef record);
}