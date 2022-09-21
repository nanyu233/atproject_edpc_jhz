package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspJxtqhljldInfCustom;
import activetech.zyyhospital.pojo.dto.ZyyTshljlQueryDto;

public interface HspJxtqhljldInfCustomMapper {
	
	/**
	 * 根据预检号查询机械通气护理记录单列表总数
	 *@param zyyTshljlQueryDto
	 *@return
	 *@throws Exception
	 */
	public int findJxtqhljldCount(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception;

	/**
	 * 根据预检号查询机械通气护理记录单列表
	 *@param zyyTshljlQueryDto
	 *@return
	 *@throws Exception
	 */
	public List<HspJxtqhljldInfCustom> findJxtqhljldList(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception;
}
