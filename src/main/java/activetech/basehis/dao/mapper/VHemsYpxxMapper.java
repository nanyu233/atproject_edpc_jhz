package activetech.basehis.dao.mapper;

import java.util.List;

import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.zyyhospital.pojo.dto.HspDocadviceInfCustom;



public interface VHemsYpxxMapper {
	public  List<HspDocadviceInfCustom> findvhemsypxxinfoanddocadviceList(VHemsJyjgQueryDto vHemsJyjgQueryDto);
		
}
