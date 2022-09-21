package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspTpctInfCustom;
import activetech.zyyhospital.pojo.dto.HspTpctInfQueryDto;

public interface HspTpctInfCustomMapper {

	public int findhspTpctInfcount(HspTpctInfQueryDto hspTpctInfQueryDto);
	
	public List<HspTpctInfCustom> findhspTpctInfList(HspTpctInfQueryDto hspTpctInfQueryDto);
	
	public HspTpctInfCustom findzyytpctBySeq(HspTpctInfQueryDto hspTpctInfQueryDto);
	
	public void deletezyytpct(HspTpctInfQueryDto hspTpctInfQueryDto);
	
	public List<HspTpctInfCustom> findhspTpctInfDat(HspTpctInfQueryDto hspTpctInfQueryDto);
	
	public List<HspTpctInfCustom> findhspTpctInfDatandorder(HspTpctInfQueryDto hspTpctInfQueryDto);
	
	public List<HspTpctInfCustom> findhspTpctInfInAndOut(HspTpctInfQueryDto hspTpctInfQueryDto);
	
	public HspTpctInfCustom leadtcpt(HspTpctInfQueryDto hspTpctInfQueryDto);
	
	public List<HspTpctInfCustom> findhspTpctInfDatandordercrnl(HspTpctInfQueryDto hspTpctInfQueryDto);
	
}
