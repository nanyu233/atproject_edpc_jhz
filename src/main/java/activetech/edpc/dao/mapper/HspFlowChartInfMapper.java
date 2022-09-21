package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspFlowChartInf;
import activetech.edpc.pojo.domain.HspFlowChartInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFlowChartInfMapper {
    int countByExample(HspFlowChartInfExample example);

    int deleteByExample(HspFlowChartInfExample example);

    int deleteByPrimaryKey(String flowchartSeq);

    int insert(HspFlowChartInf record);

    int insertSelective(HspFlowChartInf record);

    List<HspFlowChartInf> selectByExample(HspFlowChartInfExample example);

    HspFlowChartInf selectByPrimaryKey(String flowchartSeq);

    int updateByExampleSelective(@Param("record") HspFlowChartInf record, @Param("example") HspFlowChartInfExample example);

    int updateByExample(@Param("record") HspFlowChartInf record, @Param("example") HspFlowChartInfExample example);

    int updateByPrimaryKeySelective(HspFlowChartInf record);

    int updateByPrimaryKey(HspFlowChartInf record);
}