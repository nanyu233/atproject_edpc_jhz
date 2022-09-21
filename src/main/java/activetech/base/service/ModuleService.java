package activetech.base.service;

import java.util.List;
import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.dto.DstmoduleCustom;
import activetech.base.pojo.dto.DstmoduleQueryDto;
/**
 * 
 * <p>Title:AuthorityService</p>
 * <p>Description:权限分配Service</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-6 上午10:58:25
 *
 */
public interface ModuleService {
	/**
	 * 角色分配模块操作树（一次加载）
	 * @param roleId
	 * @return
	 * @throws Exception
	 */
	public List<TreeNode> loadAuthModuleTree(String roleId) throws Exception;

	/**
	 * 分布加载模块操作树（分布加载）
	 * @param nodeid
	 * @return
	 * @throws Exception
	 */
	public List<TreeNode> loadModuleTreeElement(String nodeid) throws Exception;
	
	
	/**
	 * 全量加载模块操作树（一次加载）
	 * @return
	 * @throws Exception
	 */
	public List<TreeNode> loadModuleTree() throws Exception;
	
	/**
	 * 根据parentid查询模块管理总数
	 * @param parentid
	 * @param dstmoduleQueryDto
	 * @return int
	 * @throws Exception
	 */
	public int findModuleCount(DstmoduleQueryDto dstmoduleQueryDto) throws Exception;
	
	/**
	 * 根据parentid查询模块列表
	 * @param parentid
	 * @param dstmoduleQueryDto
	 * @return List<DstmoduleCustom>
	 */
	public List<DstmoduleCustom> findModuleList(DstmoduleQueryDto dstmoduleQueryDto) throws Exception;
	
	/**
	 * 新增模块
	 * @param parentid
	 * @param dstmoduleCustom
	 * @throws Exception
	 */
	public void insertModule(String parentid,DstmoduleCustom dstmoduleCustom)throws Exception;
	
	/**
	 * 修改模块
	 * @param moduleid
	 * @param dstmoduleCustom
	 * @throws Exception
	 */
	public void updateModule(DstmoduleQueryDto dstmoduleQueryDto)throws Exception;
	
	/**
	 * 删除模块
	 * @param moduleid
	 * @throws Exception
	 */
	public void deleteModule(String moduleid)throws Exception;
	
	/**
	 * 根据moduleid查询用户信息
	 * @param moduleid
	 * @return
	 * @throws Exception
	 */
	public DstmoduleCustom findModuleByModuleid(String moduleid) throws Exception;
	/**
	 * 角色授权
	 * @param roleid
	 * @param ids
	 */
	public void insertroleauth(String roleid, String[] ids);
	/**
	 * 根据roleid删除操作表
	 * @param roleid
	 */
	public void deleteDstroleoperateByRoleid(String roleid);
	/**
	 * 删除模块表
	 * @param roleid
	 */
	public void deleteDstrolemodule(String roleid);
	
    /**
	 * 根据parentid查询showorder最大值
	 */
	public int getMaxShowOrderByParentid(String parentid);
}
