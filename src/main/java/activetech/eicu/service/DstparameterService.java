package activetech.eicu.service;

import java.util.List;

import activetech.eicu.pojo.domain.Dstparameter;

public interface DstparameterService {
	
	/**
	 * 根据partype 和 parcode 获取相关参数
	 * @param partype
	 * @param parcode
	 * @param order 排序
	 * @return
	 * @throws Exception
	 */
	List<Dstparameter> getParamByTypeAndCode(String partype, String parcode, String order) throws Exception;
	
	/**
	 * 根据partype 和 parcode 删除相关参数
	 * @param partype
	 * @param parcode
	 * @throws Exception
	 */
	void delParamByTypeAndCode(String partype, String parcode) throws Exception;
	
	/**
	 * 批量新增修改dstparameter
	 * @param paramList
	 * @throws Exception
	 */
	void mergeParameter(List<Dstparameter> paramList) throws Exception;
	/**
	 *根据partype 和 parcode 和 parvalue1 获取相关参数
	 * @param paramList
	 * @throws Exception
	 */
	Dstparameter getQualityGs(String partype, String parcode, String parvalue1);

}
