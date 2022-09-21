package activetech.basehis.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.basehis.service.SqlServerHisService;
import activetech.external.dao.mapper.VHemsJcjgMapperCustom;
import activetech.external.pojo.dto.VHemsJcjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.util.StringUtils;

public class SqlServerHisServiceImpl implements SqlServerHisService {
	
	@Autowired
	private VHemsJcjgMapperCustom vHemsJcjgMapperCustom;

	@Override
	public List<VHemsJcjgCustom> findVHemsJcjgList(
			VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception {
		List<VHemsJcjgCustom> list = new ArrayList<VHemsJcjgCustom>();
		if(vHemsJyjgQueryDto.getvHemsJcjgCustom() != null){
			if (StringUtils.isNotNullAndEmptyByTrim(vHemsJyjgQueryDto.getvHemsJcjgCustom().getZyh())) {
				list=vHemsJcjgMapperCustom.findVHemsJcjgList(vHemsJyjgQueryDto);
			}		
		}
		return list;
	}
}
