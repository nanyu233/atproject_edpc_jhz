package activetech.base.service;

import java.util.List;

import activetech.base.pojo.domain.Dstrole;
import activetech.base.pojo.domain.Dstuserrole;
import activetech.base.pojo.dto.DstroleCustom;
import activetech.base.pojo.dto.DstroleQueryDto;

/**
 * 
 * <p>Title:RoleService</p>
 * <p>Description:角色管理Service</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-4 上午10:39:07
 * 
 */
public interface RoleService {
	/**
	 * 新增角色
	 * @param dstroleCustom
	 * @throws Exception
	 */
	public void insertRole(DstroleCustom dstroleCustom)throws Exception;
	
	/**
	 * 修改角色
	 * @param dstroleCustom
	 * @throws Exception
	 */
	public void updateRole(String roleid,DstroleCustom dstroleCustom)throws Exception;
	
	/**
	 * 删除角色
	 * @param roleid
	 * @throws Exception
	 */
	public void deleteRole(String roleid)throws Exception;
	
	/**
	 * 查询角色列表总数
	 * @param sysuserQueryVo
	 * @return
	 * @throws Exception
	 */
	public int findRoleCount(DstroleQueryDto dstroleQueryDto) throws Exception;

	/**
	 * 查询角色列表
	 * @param dstroleQueryDto
	 * @return
	 */
	public List<Dstrole> findRoleList(DstroleQueryDto dstroleQueryDto);
	
	/**
	 * 根据roleid获取角色数据
	 * @param roleid
	 * @return
	 */
	public DstroleCustom findRoleByRoleid(String roleid);
	
	/**
	 * 根据roleid查询用户角色表
	 * @param roleid
	 * @return
	 */
	public List<Dstuserrole> findUserRoleByRoleid(String roleid) ;
	
	/**
	 * 查询用户角色 并排除系统管理员
	 * @return
	 */
	public List<Dstrole> findRoleList();


}
