package activetech.base.dao.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.pojo.dto.DstuserQueryDto;
import activetech.base.pojo.dto.HighChartsDemoCustom;
import activetech.base.pojo.dto.Menu;
import activetech.base.pojo.dto.Operation;

/**
 * 
 * <p>Title:DstuserCustomMapper</p>
 * <p>Description:用户自定义Dao类</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2016-12-30 上午11:10:21
 * 、
 */
public interface DstuserCustomMapper {
	/**
	 * 根据角色id获取菜单
	 * @param roleid 角色编码
	 * @return Menu 角色的菜单模型类
	 */
	public List<Menu> findMenuByroleid(List<String> roles) throws Exception;
	
	/**
	 * 根据角色id获取操作权限
	 * @param roleid 角色编码
	 * @return Operation 角色的菜单模型类
	 */
	public List<Operation> findOperatByRoleid(List<String> roles) throws Exception;
	/**
	 * 查询用户列表
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findUserCount(DstuserQueryDto dstuserQueryDto) throws Exception;
	/**
	 * 查询用户列表
	 * @param dstuserQueryDto
	 * @return
	 */
	public List<DstuserCustom> findUserList(DstuserQueryDto dstuserQueryDto);
	
	/**
	 * 查询用户列表(用户号和用户名混合查询)
	 * @param dstuserQueryDto
	 * @return
	 */
	public List<DstuserCustom> findUserListByNameAndNo(DstuserQueryDto dstuserQueryDto);
	/**
	 * 查询用户列表(用户号和用户名混合查询)
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findCountByNameAndNo(DstuserQueryDto dstuserQueryDto) throws Exception;
   
	public List<HighChartsDemoCustom> getHighChartsUser();
	
	public void updateOutCall2Cz(String [] userIdList);
	public void updateOutCall2Wcz(String [] userIdList);

	public List<DstuserCustom> findDstuserCustomDriv(@Param("comcname")String comcname);

	public int findAbnUserCount(DstuserQueryDto dstuserQueryDto);

	public List<DstuserCustom> findAbnUserList(DstuserQueryDto dstuserQueryDto);
	
	/**
	 *  查询出诊管理用户列表
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findCZGLUserCount(DstuserQueryDto dstuserQueryDto) ;

	/**
	 * 查询用户列表
	 * @param dstroleQueryDto
	 * @return
	 */
	public List<DstuserCustom> findCZGLUserList(DstuserQueryDto dstuserQueryDto);

	List<Dstuser> findDstUserByQueryLike(@Param("queryLike")String queryLike, @Param("cstDepCod")String cstDepCod);
	
	 /**
	 * 为admin用户获取所有菜单
	 * @param roleid 角色编码
	 * @return Menu 角色的菜单模型类
	 */
	public List<Menu> findMenuForAdmin();
	/**
	 * 为admin用户获取所有操作权限
	 * @param roleid 角色编码
	 * @return Operation 角色的菜单模型类
	 */
	public List<Operation> findOperatForAdmin();


    List<DstuserCustom> findDstuserByPinyinLike(DstuserQueryDto dstuserQueryDto);

}