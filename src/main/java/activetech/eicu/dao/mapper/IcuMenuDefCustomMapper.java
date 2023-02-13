package activetech.eicu.dao.mapper;

import java.util.List;

import activetech.eicu.pojo.dto.IcuMenuDefCustom;

public interface IcuMenuDefCustomMapper {
    /**
     * 获取ICU患者功能菜单
     * @return
     */
	public List<IcuMenuDefCustom> findIcuCustMenu(String moduleId);
}