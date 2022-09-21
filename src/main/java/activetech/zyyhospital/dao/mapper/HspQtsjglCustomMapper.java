package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspQtsjglCustom;
import activetech.zyyhospital.pojo.dto.HspQtsjglQueryDto;


public interface HspQtsjglCustomMapper {
	/**
	 * 查询分页总记录数
	 * @param hspCbyxglInfQueryDto
	 * @return
	 */
	public int findHspQtsjglCount(HspQtsjglQueryDto hspQtsjglQueryDto);
	/**
	 * 分页查询群体事件（查询条件：时间区间）
	 * @param hspCbyxglInfQueryDto
	 * @return
	 */
	public List<HspQtsjglCustom> findHspQtsjglList(HspQtsjglQueryDto hspQtsjglQueryDto);
}
