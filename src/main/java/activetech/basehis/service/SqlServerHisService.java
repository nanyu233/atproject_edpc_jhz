package activetech.basehis.service;

import java.util.List;

import activetech.external.pojo.dto.VHemsJcjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;

/**
 * 走Sqlserver视图-切换数据源
 * 
 * @author MoneyBlue
 *
 */
public interface SqlServerHisService {
	//检验信息表
	public List<VHemsJcjgCustom> findVHemsJcjgList(VHemsJyjgQueryDto vHemsJyjgQueryDto)throws Exception;

}
