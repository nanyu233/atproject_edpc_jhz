package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.domain.HspFlowChartInf;
import activetech.edpc.pojo.dto.HspFlowChartInfCustom;

public interface HspFlowChartInfMapperCustom {
	
	int mergeFlowChartInf(HspFlowChartInf record);
	
	List<HspFlowChartInfCustom> getHspFlowChartInfCustomList(HspFlowChartInf record);
	
}