package activetech.basehis.dao.mapper;

import java.util.List;

import activetech.basehis.pojo.domain.VHemsJyjg;
import activetech.external.pojo.dto.VHemsJyjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;


public interface VHemsJyjgMapperSi {
	/**
	 * 5分钟轮询，查询约14分钟内未入库检验
	 * @return
	 */
	public  List<VHemsJyjg> findRecentJyjg();

	int findJyxxCount(VHemsJyjgQueryDto vHemsJyjgQueryDto);

	List<VHemsJyjgCustom> findJyxx(VHemsJyjgQueryDto vHemsJyjgQueryDto);

	int findJyxxInfoCount(VHemsJyjgQueryDto vHemsJyjgQueryDto);
	List<VHemsJyjgCustom> findJyxxInfo(VHemsJyjgQueryDto vHemsJyjgQueryDto);
}
