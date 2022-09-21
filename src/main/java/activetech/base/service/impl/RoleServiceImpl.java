package activetech.base.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstroleCustomMapper;
import activetech.base.dao.mapper.DstroleMapper;
import activetech.base.dao.mapper.DstuserroleMapper;
import activetech.base.pojo.domain.Dstrole;
import activetech.base.pojo.domain.DstroleExample;
import activetech.base.pojo.domain.Dstuserrole;
import activetech.base.pojo.domain.DstuserroleExample;
import activetech.base.pojo.dto.DstroleCustom;
import activetech.base.pojo.dto.DstroleQueryDto;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.ModuleService;
import activetech.base.service.RoleService;
import activetech.util.StringUtils;

/**
 * 
 * <p>Title:RoleServiceImpl</p>
 * <p>Description:角色管理实现类Service</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-4 上午10:54:03
 *
 */
public class RoleServiceImpl implements RoleService {

	@Autowired
	private DstroleMapper dstroleMapper;
	
	@Autowired
	private DstuserroleMapper dstuserroleMapper;
	
	@Autowired
	private DstroleCustomMapper dstroleCustomMapper;
	
	@Autowired
	private ModuleService moduleService;
	
	/**
	 * 根据角色名称查询角色
	 * @param dstroleCustom
	 * @return
	 */
	private Dstrole findRoleByRolename(String rolename) {
		DstroleExample dstroleExample = new DstroleExample();
		DstroleExample.Criteria criteria = dstroleExample.createCriteria();
		criteria.andRolenameEqualTo(rolename);
		List<Dstrole> list = dstroleMapper.selectByExample(dstroleExample);
		if(list != null && list.size() == 1){
			return list.get(0);
		}
		return null;	
	}
	
	/**
	 * 新增角色
	 * @param dstroleCustom
	 * @throws Exception
	 */
	public void insertRole(DstroleCustom dstroleCustom)throws Exception{
		//参数校验
		//1.非空校验
		String nullstr = this.insertRoleisNotNullAndEmptyByTrim(dstroleCustom);
		if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
			//抛出异常
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
		}
		
		//数据业务合法性校验
		//1.roleid不能已存在
		Dstrole dstrole_add = dstroleMapper.selectByPrimaryKey(dstroleCustom.getRoleid());
		if(dstrole_add != null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,new Object[] { "角色码",dstroleCustom.getRoleid() }));
		}
		//2.rolename不能重复
		Dstrole dstrole =  this.findRoleByRolename(dstroleCustom.getRolename());
		if(dstrole != null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,new Object[] { "角色名称",dstroleCustom.getRolename() }));
		}
		dstroleMapper.insert(dstroleCustom);
	}

	/**
	 * 角色管理必填字段项非空校验
	 * @param dstroleCustom
	 * @return
	 */
	private String insertRoleisNotNullAndEmptyByTrim(DstroleCustom dstroleCustom) {
		//角色名称
		if(!StringUtils.isNotNullAndEmptyByTrim(dstroleCustom.getRoleid())){
			return "角色码";
		}
		//角色名称
		if(!StringUtils.isNotNullAndEmptyByTrim(dstroleCustom.getRolename())){
			return "角色名称";
		}
		return null;
	}

	/**
	 * 修改角色
	 * @param dstroleCustom
	 * @throws Exception
	 */
	public void updateRole(String roleid,DstroleCustom dstroleCustom)throws Exception{
		//参数校验
		//1.非空校验
		dstroleCustom.setRoleid(roleid);
		String nullstr = this.updateRoleisNotNullAndEmptyByTrim(dstroleCustom);
		if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
		}
		
		//数据业务合法性校验
		//1.rolename不能重复
		Dstrole dstrole =  this.findRoleByRolename(dstroleCustom.getRolename());
		if(dstrole != null && !dstrole.getRoleid().equals(roleid)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,new Object[] { "角色名称",dstroleCustom.getRolename() }));
		}
		
		//数据操作
		Dstrole dstrole_update = dstroleMapper.selectByPrimaryKey(roleid);
		dstrole_update.setRoleid(roleid);
		dstrole_update.setRolename(dstroleCustom.getRolename());
		dstrole_update.setRoledes(dstroleCustom.getRoledes());
		dstrole_update.setIndexname(dstroleCustom.getIndexname());
		dstrole_update.setIndexurl(dstroleCustom.getIndexurl());
		dstroleMapper.updateByPrimaryKey(dstrole_update);
	}
	/**
	 * 角色管理必填字段项非空校验
	 * @param dstroleCustom
	 * @return
	 */
	private String updateRoleisNotNullAndEmptyByTrim(DstroleCustom dstroleCustom) {
		//角色id
		if(!StringUtils.isNotNullAndEmptyByTrim(dstroleCustom.getRoleid())){
			return  "角色Id";
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(dstroleCustom.getRolename())){
			return "角色名称";
		}
		return null;
	}
	
	/**
	 * 删除角色
	 * @param roleid
	 * @throws Exception
	 */
	public void deleteRole(String roleid)throws Exception{
		//参数校验
		//1.非空校验
		if(!StringUtils.isNotNullAndEmptyByTrim(roleid)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "角色Id" }));
		}
		//2.删除角色是否存在
		Dstrole dstrole_delete = dstroleMapper.selectByPrimaryKey(roleid);
		if(dstrole_delete == null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912, new Object[] { "角色信息","" }));
		}
		
		//数据业务合法性校验
		//1.角色是否有用户在用
		List<Dstuserrole> dstuserrole = this.findUserRoleByRoleid(roleid);
		if(dstuserrole != null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 125, null));
		}
		//2.如果没有人使用需要删除dstrolemodule和dstroleoperate表数据
		moduleService.deleteDstroleoperateByRoleid(roleid);
		moduleService.deleteDstrolemodule(roleid);
		dstroleMapper.deleteByPrimaryKey(roleid);
	}
	


	/**
	 * 查询角色列表总数
	 * @param sysuserQueryVo
	 * @return
	 * @throws Exception
	 */
	public int findRoleCount(DstroleQueryDto dstroleQueryDto) throws Exception{
		return dstroleCustomMapper.findRoleCount(dstroleQueryDto);
	}
	
	/**
	 * 查询角色列表
	 * @param dstroleQueryDto
	 * @return
	 */
	public List<Dstrole> findRoleList(DstroleQueryDto dstroleQueryDto){
		return dstroleCustomMapper.findRoleList(dstroleQueryDto);
	}
	
	/**
	 * 根据roleid获取角色数据
	 * @param roleid
	 * @return
	 */
	public DstroleCustom findRoleByRoleid(String roleid){
		Dstrole dstrole = dstroleMapper.selectByPrimaryKey(roleid);
		DstroleCustom dstroleCustom = new DstroleCustom();
		BeanUtils.copyProperties(dstrole, dstroleCustom);
		return dstroleCustom;
	}
	
	/**
	 * 根据roleid查询用户角色表
	 * @param roleid
	 * @return
	 */
	public List<Dstuserrole> findUserRoleByRoleid(String roleid) {
		DstuserroleExample dstuserroleExample = new DstuserroleExample();
		DstuserroleExample.Criteria criteria = dstuserroleExample.createCriteria();
		criteria.andRoleidEqualTo(roleid);
		List<Dstuserrole> list = dstuserroleMapper.selectByExample(dstuserroleExample);
		if(list != null && list.size() > 0){
			return list;
		}
		return null;
	}

	@Override
	public List<Dstrole> findRoleList() {
		DstroleExample dstroleExample = new DstroleExample();
		DstroleExample.Criteria criteria = dstroleExample.createCriteria();
		criteria.andRolenameNotEqualTo("系统管理员");//排除系统管理员角色
		dstroleExample.setOrderByClause("roleid asc");
		List<Dstrole> list = dstroleMapper.selectByExample(dstroleExample);
		if(list != null && list.size() > 0){
			return list;
		}
		return null;
	}

}
