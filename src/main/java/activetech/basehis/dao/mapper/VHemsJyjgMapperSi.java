package activetech.basehis.dao.mapper;

import java.util.List;

import activetech.basehis.pojo.domain.VHemsJyjg;



public interface VHemsJyjgMapperSi {
	/**
	 * 5分钟轮询，查询约14分钟内未入库检验
	 * @return
	 */
	public  List<VHemsJyjg> findRecentJyjg();
	
}
