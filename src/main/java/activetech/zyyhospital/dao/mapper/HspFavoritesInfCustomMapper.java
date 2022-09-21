package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspDzblDictCustom;
import activetech.zyyhospital.pojo.dto.HspFavoritesInfCustom;
import activetech.zyyhospital.pojo.dto.HspFavoritesInfCustomDto;

public interface HspFavoritesInfCustomMapper {
	
	/**
	 * 查询知识库列表数据
	 * @param hspLqbljlQueryDto
	 * @return
	 */
	List<HspFavoritesInfCustom> findHspFavoritesInfList(HspFavoritesInfCustomDto hspFavoritesInfCustomDto);

	/**
	 * 查询知识库列表数据总数
	 * @param hspLqbljlQueryDto
	 * @return
	 */
	int findHspFavoritesInfListCount(HspFavoritesInfCustomDto hspFavoritesInfCustomDto);

	/**
	 * 查询知识库列表（分页）
	 * @param hspLqbljlQueryDto
	 * @return
	 */
	List<HspFavoritesInfCustom> findHspFavoritesInfListFy(HspFavoritesInfCustomDto hspFavoritesInfCustomDto);

	/**
	 * 查询知识库模板
	 * @param hspLqbljlQueryDto
	 * @return
	 */
	List<HspDzblDictCustom> findHspDzblDictList(HspDzblDictCustom hspDzblDictCustom);
	
}
