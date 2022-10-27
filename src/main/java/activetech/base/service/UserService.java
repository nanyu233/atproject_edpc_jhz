package activetech.base.service;

import java.util.List;

import activetech.base.pojo.domain.Dstrole;
import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstroleCustom;
import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.pojo.dto.DstuserQueryDto;
import activetech.base.pojo.dto.DstuserroleCustom;
import activetech.base.pojo.dto.Menu;
import activetech.base.pojo.dto.Operation;
import activetech.base.process.result.ExceptionResultInfo;
/**
 * 
 * <p>Title:UserService</p>
 * <p>Description:用户操作Service 基础Service</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2016-12-30 上午9:28:01
 * 
 */
public interface UserService {
	/**
	 * 校验用户信息
	 * @param userno 用户帐号
	 * @param pwd 用户密码
	 * @return ActiveUser用户信息类 用来存储Session
	 * @throws Exception
	 */
	public ActiveUser checkUserInfo(String userno,String pwd)throws Exception;
	/**
	 * 根据用户号查找用户
	 * @param userno 用户帐号
	 * @return Dstuser
	 * @throws Exception
	 */
	public Dstuser findUserByUsrno(String usrno) throws Exception ;
	/**
	 * 根据角色id获取菜单
	 * @param roles 角色列表
	 * @return Menu 角色的菜单模型类-去重
	 */
	public List<Menu> findMenuByroleid(List<String> roles) throws Exception;
	
	/**
	 * 根据用户角色获取操作权限
	 * @param roleid 角色编码
	 * @return Operation 角色的操作类
	 */
	public List<Operation> findOperatByRoleid(List<String> roles) throws Exception;
	
	/**
	 * 根据用户帐号获取所属角色
	 * @param usrno 用户帐号
	 * @return Dstrole 
	 */
	public List<String> findRoleByUsrno(String usrno) throws Exception;
	/**
	 *  查询用户列表
	 * @param dstuserQueryDto 用户分装类
	 * @return
	 * @throws Exception
	 */
	
	public int findUserCount(DstuserQueryDto dstuserQueryDto) throws Exception;
	/**
	 * 查询用户列表
	 * @param dstuserQueryDto 用户分装类
	 * @return
	 */
	public List<DstuserCustom> findUserList(DstuserQueryDto dstuserQueryDto);
	/**
	 * 新增用户
	 * @param dstuserCustom
	 * @throws Exception
	 */
	 
	public void insertUser(DstuserCustom dstuserCustom)throws Exception;
	
	/**
	 * 修改用户
	 * @param usrno
	 * @param dstuserCustom
	 * @throws Exception
	 */
	
	public void updateUser(String userid,DstuserCustom dstuserCustom)throws Exception;
	
	/**
	 * 删除用户
	 * @param usrid
	 * @param usrno
	 * @throws Exception
	 */
	 
	public void deleteUser(String userid)throws Exception;
	
	/**
	 * 修改密码
	 * @param userid
	 * @param dstuserCustom
	 * @throws Exception
	 */
	public void updatePwd(DstuserQueryDto dstuserQueryDto)throws Exception;
	/**
	 * 修改用户密码密码
	 * @param userid
	 * @param dstuserCustom
	 * @throws Exception
	 */
	public void updatePassword(String usrno, DstuserCustom dstuserCustom)throws Exception;
	
	/**
	 * 根据userid查询用户信息
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	public DstuserCustom findUserByUserid(String userid) throws Exception;
	
	/**
	 * 获取角色关系编码表
	 * @return List<Dstrole>
	 * @exception Exception
	 * */
	public List<DstuserroleCustom> findUserroleList(String usrno) throws Exception;
	
	/**获取全部角色编码表
	 * @return List<Dstrole>
	 * */
	public List<Dstrole> findRoleAll();
	
	/**
	 * 获取全部角色编码表(剔除该用户存在的角色编码)
	 * @param usrno
	 * @return List<DstroleCustom>
	 * @throws Exception
	 */
	public List<DstroleCustom> findRoleAllNoUsrno(String usrno) throws Exception;
	
	/**
	 * 用户授权
	 * @param usrno 用户号
	 * @param List<String> 对应的角色列表
	 * @throws Exception 
	 * */
	public void insertUserroleList(String usrno,String[] roleids);
	/**
	 * 根据归属机构号查询用户
	 * @param sysid
	 * @return
	 */
	public List<Dstuser> findDstUserBySysid(String sysid) throws Exception;

	public List<Dstuser> findDstUserByEmgsysid(String emgsysid) throws Exception;
	
	public void updateOutCall2Cz(String [] userIdList);
	
	public void updateOutCall2Wcz(String [] userIdList);
	
	/**
	 * 修改出诊状态
	 * @param userid 用户表id
	 * @param emgsysid 出诊科室号
	 */
	public void updateOutCall(String userid, String emgsysid,String outcall)throws Exception;
	
	/**
	 * 查询出诊医生
	 * @param outCall 用户表是否出诊
	 * @throws ExceptionResultInfo 
	 */
	public List<Dstuser> findDstuserCustomByOutCall(String outCall) throws ExceptionResultInfo;
	/**
	 * 查询出诊医生
	 * @param string 驾驶员
	 */
	public List<DstuserCustom> findDstuserCustomDriv(String comcname);
	/**
	 * 查询出诊医生
	 * @param outCall 用户表是否出诊
	 * @throws ExceptionResultInfo 
	 */
	public List<Dstuser> findDstuserCustomBySysid(String sysid) throws ExceptionResultInfo;
	
	public int findUserroleListCount(String usrno);
	
	public void insertYsczlsjl(Dstuser dstuser,String outcall,ActiveUser activeUser) throws Exception;
	
	/**
	 *  查询出诊管理用户列表
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findCZGLUserCount(DstuserQueryDto dstuserQueryDto) throws Exception;
	
	/**
	 * 查询用户列表
	 * @param dstroleQueryDto
	 * @return
	 */
	public List<DstuserCustom> findCZGLUserList(DstuserQueryDto dstuserQueryDto) throws Exception;
	
	public List<Dstuser> findDstUserForCst(String emgsysid) throws Exception;
	
	public List<Dstuser> findDstUserByQueryLike(String queryLike, String cstDepCod);
	
	/**
	 * 查询用户列表总数(用户号和用户名混合查询)
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findCountByNameAndNo(DstuserQueryDto dstuserQueryDto) throws Exception;
	/**
	 * 查询用户列表(用户号和用户名混合查询)
	 * @param dstuserQueryDto
	 * @return
	 */
	public List<DstuserCustom> findUserListByNameAndNo(DstuserQueryDto dstuserQueryDto);
	public ActiveUser insertUserByHis(String usrno) throws Exception;
}
