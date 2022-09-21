package activetech.eicu.dao.mapper;

import java.util.List;

import activetech.eicu.pojo.dto.IcuVsDefCustom;

public interface IcuVsDefCustomMapper {

	List<IcuVsDefCustom> getSimpPipeDic() throws Exception;
	
	/**
	 * 获取生命体征列表
	 * @return
	 */
    List<IcuVsDefCustom> getIcuVsDefList();

}
