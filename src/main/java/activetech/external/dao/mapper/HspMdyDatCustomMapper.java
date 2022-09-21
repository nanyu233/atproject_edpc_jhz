package activetech.external.dao.mapper;

import java.util.List;

import activetech.external.pojo.dto.HspMdyDatCustom;

public interface HspMdyDatCustomMapper {
	int updateSelective(HspMdyDatCustom hspMdyDatCustom);
	
	public List<HspMdyDatCustom> getAllMindrayData();
	
	HspMdyDatCustom getRecentData(HspMdyDatCustom hspMdyDatCustom);
	
	public HspMdyDatCustom getPatInfByEmgSeq(String emgSeq);
}
