package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCsabcInf;
import activetech.edpc.pojo.domain.HspCsabcInfExample;
import activetech.edpc.pojo.dto.HspCsabcInfCustom;
import activetech.edpc.pojo.dto.HspCsabcInfQueryDto;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCsabcInfMapperCustom {
    
	int mergeHspCsabcInfBatch(List<HspCsabcInf> list);
	
	List<HspCsabcInfCustom> getHspCsabcInfList(HspCsabcInfQueryDto hspCsabcInfQueryDto);
	
}