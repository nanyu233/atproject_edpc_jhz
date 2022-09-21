package activetech.hospital.dao.mapper;

import java.util.List;

import activetech.hospital.pojo.dto.HspHealtheduInfQueryDto;
import activetech.hospital.pojo.dto.HspHealtheduItemCustom;

public interface HspHealtheduItemCustomMapper {
	List<HspHealtheduItemCustom> getItemsListTree(HspHealtheduInfQueryDto hspHealtheduQueryDto);
	
	HspHealtheduItemCustom findItemByItemNo(String itemno);
	
	/**
	 * 获取当前节点的层数
	 * @param itemno
	 * @return
	 */
	int getTreeLevel(String itemno);
	
	/**
	 * tree4个节点以内适用
	 * @param hspHealtheduQueryDto
	 * @return
	 */
	List<HspHealtheduItemCustom> findItemTreeByItemNam(HspHealtheduInfQueryDto hspHealtheduQueryDto);
	
	/**
	 * 根据类名查询
	 * @param hspHealtheduQueryDto
	 * @return
	 */
	List<HspHealtheduItemCustom> findItemTreeByItemNamAndParentno(HspHealtheduItemCustom hspHealtheduItemCustom);

}
