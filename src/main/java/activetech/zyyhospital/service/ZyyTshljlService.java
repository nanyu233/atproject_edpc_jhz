package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.domain.HspJxtqhljldInf;
import activetech.zyyhospital.pojo.domain.HspXwhljldInf;
import activetech.zyyhospital.pojo.dto.HspJxtqhljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspXwhljldInfCustom;
import activetech.zyyhospital.pojo.dto.ZyyTshljlQueryDto;

public interface ZyyTshljlService {

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

	/**
	 * 洗胃护理记录单新增或修改
	 *@param zyyTshljlQueryDto
	 *@param activeuser
	 *@return
	 *@throws Exception
	 */
	public void editXwhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto, ActiveUser activeuser) throws Exception;

	/**
	 * 洗胃护理记录单删除
	 *@param zyyTshljlQueryDto
	 *@return
	 *@throws Exception
	 */
	public void deleteXwhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception;

	/**
	 * 根据xwhiSeq查询洗胃护理记录单数据
	 *@param xwhiSeq
	 *@return
	 *@throws Exception
	 */
	public HspXwhljldInf findXwhljldByXwhiSeq(String xwhiSeq) throws Exception;
	
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

	/**
	 * 机械通气护理记录单新增或修改
	 *@param zyyTshljlQueryDto
	 *@param activeuser
	 *@return
	 *@throws Exception
	 */
	public void editJxtqhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto, ActiveUser activeuser) throws Exception;

	/**
	 * 机械通气护理记录单删除
	 *@param zyyTshljlQueryDto
	 *@return
	 *@throws Exception
	 */
	public void deleteJxtqhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception;
	
	/**
	 * 根据jxtqSeq查询机械通气护理记录单数据
	 *@param jxtqSeq
	 *@return
	 *@throws Exception
	 */
	public HspJxtqhljldInf findJxtqhljldByJxtqSeq(String jxtqSeq) throws Exception;	

}
