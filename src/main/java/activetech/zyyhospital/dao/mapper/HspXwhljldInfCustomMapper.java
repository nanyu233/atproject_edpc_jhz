package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspXwhljldInfCustom;
import activetech.zyyhospital.pojo.dto.ZyyTshljlQueryDto;

public interface HspXwhljldInfCustomMapper {
	
	/**
	 * 根据预检号查询洗胃护理记录单列表总数
	 *@param zyyTshljlQueryDto
	 *@return
	 *@throws Exception
	 */
	public int findXwhljldCount(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception;
	
	/**
	 * 根据预检号查询洗胃护理记录单列表
	 *@param zyyTshljlQueryDto
	 *@return
	 *@throws Exception
	 */
	public List<HspXwhljldInfCustom> findXwhljldList(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception;
}
