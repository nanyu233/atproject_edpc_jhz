package activetech.eicu.dao.mapper;

import java.util.List;

import activetech.eicu.pojo.domain.Dstparameter;

public interface DstparameterCustomMapper {
	
	/**
	 * 批量新增修改dstparameter
	 * @param list
	 */
	void mergeParameter(List<Dstparameter> list);
    
}