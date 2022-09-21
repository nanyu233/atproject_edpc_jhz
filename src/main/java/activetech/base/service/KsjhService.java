package activetech.base.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstKsjhCustom;
import activetech.base.pojo.dto.DstKsjhQueryDto;

public interface KsjhService {
	/**
	 * 新增物资维护
	 * @param dstKsjhCustom
	 * @throws Exception
	 */
	 
	public void insertKsjh(ActiveUser activeUser,DstKsjhCustom dstKsjhCustom)throws Exception;
	
	/**
	 * 更新物资维护
	 * @param dstKsjhCustom
	 * @throws Exception
	 */
	 
	public void updateKsjh(ActiveUser activeUser,DstKsjhCustom dstKsjhCustom)throws Exception;
	
	/**
	 * 删除物资维护
	 * @param dstKsjhCustom
	 * @throws Exception
	 */
	 
	public void deleteKsjh(String id)throws Exception;
	
	/**
	 * 查询物资维护结果集
	 * @param dstKsjhCustom
	 * @throws Exception
	 */
	 
	public List<DstKsjhCustom> findKsjhList(DstKsjhQueryDto dstksjhQueryDto)throws Exception;
	
	/**
	 * 查询总数
	 * @param dstksjhQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findKsjhListCount(DstKsjhQueryDto dstksjhQueryDto)throws Exception;
	
	/**
	 * 根据ID查找物资维护 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public DstKsjhCustom findKsjhByid(String id)throws Exception;
	
	
	

}
