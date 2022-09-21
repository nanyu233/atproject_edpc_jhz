package activetech.hospital.service;

import java.util.List;

import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.pojo.dto.HspHealtheduInfCustom;
import activetech.hospital.pojo.dto.HspHealtheduInfQueryDto;
import activetech.hospital.pojo.dto.HspHealtheduItemCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;

public interface HspHealthEducateService {
	/**
	 * 抢救室病人列表
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findEmgListInQjs(HspHealtheduInfQueryDto hspHealtheduQueryDto);
	
	/**
	 * 病人健康教育项目列表
	 * @param hspemginfQueryDto emgSeq and eduDat
	 * @return
	 */
	public List<HspHealtheduInfCustom> findHealtheduListByEmgSeq(HspHealtheduInfQueryDto hspHealtheduQueryDto);
	
	/**
	 * 加载健康教育项目树
	 * @return
	 */
	public List<HspHealtheduItemCustom> getItemsListTree(HspHealtheduInfQueryDto hspHealtheduQueryDto)throws Exception;
	
	public void insertHealthEducate(HspHealtheduInfQueryDto hspHealtheduQueryDto,ActiveUser activeUser)throws Exception;
	
	public void deleteHealthEducate(String eduSeq)throws Exception;
	
	public List<TreeNode> loadHealthEducateTree(HspHealtheduItemCustom hspHealtheduItemCustom) throws Exception;
	
	/**
	 * 新增健康教育项目
	 * @param hspHealtheduQueryDto
	 * @param activeUser
	 */
	public void insertHealthEduItem(HspHealtheduInfQueryDto hspHealtheduQueryDto)throws Exception;
	
	/**
	 * 删除健康教育项目
	 * @param hspHealtheduQueryDto
	 * @param activeUser
	 */
	public void deleteHealthEduItem(String itemno)throws Exception;
	
	public HspHealtheduItemCustom findItemByItemNo(String itemno)throws Exception;
	
	public void editHealthEduItem(HspHealtheduInfQueryDto hspHealtheduQueryDto)throws Exception;
	
	public int getTreeLevel(String itemno)throws Exception;

}
