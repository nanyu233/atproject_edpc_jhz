package activetech.hospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.domain.HspFavoritesInf;
import activetech.zyyhospital.pojo.dto.HspDzblDictCustom;
import activetech.zyyhospital.pojo.dto.HspDzblDictDto;
import activetech.zyyhospital.pojo.dto.HspFavoritesInfCustom;
import activetech.zyyhospital.pojo.dto.HspFavoritesInfCustomDto;

public interface HspFavoriteInfService {
	
	public void editFavoritesSubmit(HspFavoritesInfCustom hspFavoritesInfCustom,ActiveUser activeUser)throws Exception;
	
	public void delHspFavoritesInf(HspFavoritesInfCustom hspFavoritesInfCustom)throws Exception;

	public List<HspFavoritesInfCustom> findHspFavoritesInfList(HspFavoritesInfCustomDto hspFavoritesInfCustomDto);

	public int findHspFavoritesInfListCount(HspFavoritesInfCustomDto hspFavoritesInfCustomDto);

	public List<HspFavoritesInfCustom> findHspFavoritesInfListFy(HspFavoritesInfCustomDto hspFavoritesInfCustomDto);
	
	public HspFavoritesInf findHspFavoritesInfBySeqno(String seqno);

	List<HspDzblDictCustom> findhspDzblDictList(HspDzblDictDto hspDzblDictDto);

	/**
	 * 添加或修改知识库模板
	 * @param hspDzblDictDto
	 * @param activeuser
	 */
	public void editDictListSubmit(HspDzblDictDto hspDzblDictDto, ActiveUser activeuser);

	/**
	 * 删除知识库模板
	 * @param hspDzblDictCustom
	 */
	public void delHspDictList(HspDzblDictCustom hspDzblDictCustom);

	/**
	 * 查询所有的模板
	 * @return
	 */
	public List<HspDzblDictCustom> findAllDict();

}
