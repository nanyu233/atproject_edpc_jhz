package activetech.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstuserCustomMapper;
import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.pojo.dto.DstuserQueryDto;
import activetech.base.service.SystemConfigService;
import activetech.hospital.dao.mapper.HspScoCustomMapper;
import activetech.hospital.pojo.dto.HspScoCustom;
import activetech.hospital.service.HspAbnInfService;
import activetech.util.StringUtils;

public class HspAbnInfServiceImpl implements HspAbnInfService {

	@Autowired
	private DstuserCustomMapper dstuserCustomMapper;
	@Autowired
	private HspScoCustomMapper hspScoCustomMapper; 

	@Override
	public int findDoc(DstuserQueryDto dstuserQueryDto) throws Exception {
		
		return dstuserCustomMapper.findAbnUserCount(dstuserQueryDto);
	}

	@Override
	public List<DstuserCustom> findDocList(DstuserQueryDto dstuserQueryDto) {
		return dstuserCustomMapper.findAbnUserList(dstuserQueryDto);
	}

	@Override
	public List<HspScoCustom> findScoPysm(String pysm) {
		if(StringUtils.isNotNullAndEmptyByTrim(pysm)){
			pysm = pysm.toLowerCase();
		}
		return hspScoCustomMapper.findScoPysm(pysm);
	}

	
	
	

}
