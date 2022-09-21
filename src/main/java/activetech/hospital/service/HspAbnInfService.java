package activetech.hospital.service;

import java.util.List;

import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.pojo.dto.DstuserQueryDto;
import activetech.hospital.pojo.dto.HspScoCustom;

public interface HspAbnInfService {
	int findDoc(DstuserQueryDto dstuserQueryDto) throws Exception;

	List<DstuserCustom> findDocList(DstuserQueryDto dstuserQueryDto);

	List<HspScoCustom> findScoPysm(String pysm);
						

}
