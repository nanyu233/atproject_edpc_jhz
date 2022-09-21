package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspDzblDict;
import activetech.zyyhospital.pojo.dto.HspDzblDictCustom;
import activetech.zyyhospital.pojo.dto.HspDzblDictDto;

import java.util.List;

public interface HspDzblDictCustomMapper {

	/**
	 * 查询通用(tytype=1)/个人(tytype=0)模板
	 * @param hspDzblDictDto
	 * @return
	 */
	List<HspDzblDictCustom> findHspDzblDictList(HspDzblDictDto hspDzblDictDto);

	/**
	 * 根据mbseq查询模板
	 * @param mbSeq
	 * @return
	 */
	HspDzblDict findHspDzblDict(String mbSeq);

	/**
	 * 修改模板
	 * @param hspDzblDict
	 */
	void updateByPrimaryKey(HspDzblDict hspDzblDict);

	/**
	 * 删除模板
	 * @param mbSeq
	 */
	void deleteByPrimaryKey(String mbSeq);

	/**
	 * 根据mbseq查询模板 倒序
	 * @param mbSeq
	 * @return
	 */
	List<HspDzblDictCustom> findHspDzblDictListByDesc(HspDzblDictDto hspDzblDictDto);

	/**
	 * 无传参，查询所有的数据
	 * @return
	 */
	List<HspDzblDictCustom> findAllDict();
    
}