package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.zyyhospital.pojo.dto.HspDocadviceInfCustom;

public interface HspDocadviceInfCustomMapper {

	public HspDocadviceInfCustom findyzxxbyid(String docadviceSeq);

	public void afterprint(VHemsJyjgQueryDto vHemsJyjgQueryDto);
	
	public List<HspDocadviceInfCustom> findvhemsypxxinfoanddocadviceList(VHemsJyjgQueryDto vHemsJyjgQueryDto);
	
}
