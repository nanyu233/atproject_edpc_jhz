package activetech.base.service.impl;
import activetech.base.dao.mapper.*;
import activetech.base.pojo.domain.*;
import activetech.base.pojo.dto.*;
import activetech.base.process.context.Config;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.AppoptionService;
import activetech.base.service.SystemConfigService;
import activetech.base.service.UserService;
import activetech.basehis.dao.mapper.VHemsYhxxMapper;
import activetech.util.MD5;
import activetech.util.ResourcesUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import cn.hutool.core.date.DateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * 
 * <p>Title:UserServiceImpl</p>
 * <p>Description:用户管理实现类</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2016-12-30 下午3:25:02
 * 
 */
public class UserServiceImpl implements UserService {
	@Autowired
	private DstuserMapper dstuserMapper;
	
	@Autowired
	private DstuserCustomMapper dstuserCustomMapper;
	
	@Autowired
	protected DstcompctlMapper dstcompctlMapper;
	
	@Autowired
	protected DstuserroleMapper dstuserroleMapper;
	
	@Autowired
	SystemConfigService systemConfigService;//系统服务接口
	
	@Autowired
	private DstuserroleCustomMapper dstuserroleCustomMapper;
	
	@Autowired
	private DstroleMapper dstroleMapper;
	
	@Autowired
	private DstroleCustomMapper dstroleCustomMapper;
	
	@Autowired
	private HspYsczlsjlInfMapper hspYsczlsjlInfMapper;
	
	@Autowired
	private VHemsYhxxMapper vHemsYhxxMapper;
	
	@Autowired
	private AppoptionService appoptionService;
	
	/**
	 * 校验用户信息
	 * @param userno 用户帐号
	 * @param pwd 用户密码
	 * @return ActiveUser用户信息类 用来存储Session
	 * @throws Exception
	 */
	public ActiveUser checkUserInfo(String usrno, String pwd) throws Exception {
		//非空校验
		String nullstr = this.loginUserisNotNullAndEmptyByTrim(usrno, pwd);
		if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911, new Object[] {nullstr}));
		}
		//校验用户是否存在
		Dstuser dstuser = this.findUserByUsrno(usrno);
	    if(dstuser == null){
		    // 用户不存在
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 101,null));
	    }
	    //判断登录用户是否有效
	    if(dstuser.getUserstate().equals("0")){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 108,null));
	    }
	  // 校验用户密码是否合法
	  String pwd_db = dstuser.getUsrpass();// md5密文
	  String pwd_md5 = new MD5().getMD5ofStr(pwd);
	  if (!pwd_db.equalsIgnoreCase(pwd_md5)) {
	    // 用户名或密码错误
		ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 114,null));
	   }
		//密码是否过期
		Dstappoption pwd_expired_switch = systemConfigService.findAppoptionByOptkey("PWD_EXPIRED_SWITCH");
		if(pwd_expired_switch!=null&&"1".equals(pwd_expired_switch.getOptvalue())){
			Date expDat = dstuser.getExpDat();
			if(expDat!=null){
				int compare = DateUtil.compare(new Date(), expDat);
				if (compare == 1) {
					ResultInfo fail = ResultUtil.createFail(Config.MESSAGE, 115, null);
					Map<String, Object> sysdata = new HashMap<>(16);
					Dstuser ret = new Dstuser();
					ret.setUsrno(dstuser.getUsrno());
					ret.setUsrname(dstuser.getUsrname());
					sysdata.put("dstuser", ret);
					fail.setSysdata(sysdata);
					ResultUtil.throwExcepion(fail);
				}
			}
		}
	   // 构建用户身份信息
	   ActiveUser activeUser = new ActiveUser();
	   List<Dstappoption> list = appoptionService.findAppoptionList();
		for (Dstappoption dstappoption : list) {
			if ("HSPLP".equals(dstappoption.getOptkey())) {
				activeUser.setHospitalCategory(dstappoption.getOptvalue());
			}
		}
	   activeUser.setUsrno(usrno);
	   activeUser.setUsrname(dstuser.getUsrname());
	   activeUser.setGroupid(dstuser.getGroupid());
	   activeUser.setSysid(dstuser.getSysid());// 单位id（重要）
	   String sysmc = null;// 单位名称
	   // 根据sysid查询单位名称
	   String groupid = dstuser.getGroupid();
	   String sysid = dstuser.getSysid();// 单位id
	   //每个用户根据用户分组区分，所属单位来源会不一致；其中系统管理员不归属任何单位
	   if (groupid.equals("1")) {
		//常规机构
		Dstcompctl dstcompctl = dstcompctlMapper.selectByPrimaryKey(sysid);
		if (dstcompctl == null) {
		  // 抛出异常，可预知异常
		  ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,204, null));
		}
		  sysmc = dstcompctl.getComcname();
	    }else{
		 //如果存在多个分组 
	   }
		activeUser.setSysmc(sysmc);// 单位名称
		//取出用户所属的角色
		List<String> roles = this.findRoleByUsrno(usrno);
		//如果用户不存在任何角色，则抛出异常
		if(roles == null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,102, null));
		}
		activeUser.setDstroleList(roles);//将用户角色存入用户身份对象中
		//根据角色id获取菜单（可能有多个）
		List<Menu> menu_list = this.findMenuByroleid(roles);
		Menu menu = new Menu();
		menu.setMenus(menu_list);
		activeUser.setMenu(menu);//将用户菜单存入用户身份对象中
		//根据用户角色获取操作权限
		List<Operation> operations = this.findOperatByRoleid(roles);
		activeUser.setOperationList(operations);//将用户操作权限存入用户身份对象中
		return activeUser;
	}
	
	/**
	 * 根据用户号查找用户
	 * @param userno 用户帐号
	 * @return Dstuser
	 * @throws Exception
	 */
	public Dstuser findUserByUsrno(String usrno) throws Exception {
		// TODO Auto-generated method stub
		DstuserExample userExample = new DstuserExample();
		DstuserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsrnoEqualTo(usrno);
		List<Dstuser> list = dstuserMapper.selectByExample(userExample);
		if(list != null && list.size() == 1){
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 根据角色id获取菜单
	 * @param roleid 角色编码
	 * @return Menu 角色的菜单模型类
	 */
	public List<Menu> findMenuByroleid(List<String> roles) throws Exception{
		return dstuserCustomMapper.findMenuByroleid(roles);
	}
	/**
	 * 根据用户角色获取操作权限
	 * @param roleid 角色编码
	 * @return Operation 角色的操作类
	 */
	public List<Operation> findOperatByRoleid(List<String> roles) throws Exception{
		return dstuserCustomMapper.findOperatByRoleid(roles);
	}
	
	/**
	 * 根据用户帐号获取所属角色
	 * @param usrno 用户帐号
	 * @return Dstrole 
	 */
	public List<String> findRoleByUsrno(String usrno) throws Exception{
	  List<DstuserroleCustom> roles = dstuserroleCustomMapper.findUserroleListOrderByVchar1(usrno);
	  if(roles != null && roles.size() != 0){
		List<String> list = new ArrayList<String>();
		for(DstuserroleCustom role:roles){
			list.add(role.getRoleid());	
		}
		return list;
	  }
	  return null;
	}

	/**
	 *  查询用户列表
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findUserCount(DstuserQueryDto dstuserQueryDto) throws Exception {
	  return dstuserCustomMapper.findUserCount(dstuserQueryDto);
	}

	/**
	 * 查询用户列表
	 * @param dstroleQueryDto
	 * @return
	 */
	public List<DstuserCustom> findUserList(DstuserQueryDto dstuserQueryDto) {
	  return dstuserCustomMapper.findUserList(dstuserQueryDto);
	}
	
	/**
	 *  查询出诊管理用户列表
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findCZGLUserCount(DstuserQueryDto dstuserQueryDto) throws Exception {
	  return dstuserCustomMapper.findCZGLUserCount(dstuserQueryDto);
	}

	/**
	 * 查询用户列表
	 * @param dstroleQueryDto
	 * @return
	 */
	public List<DstuserCustom> findCZGLUserList(DstuserQueryDto dstuserQueryDto) {
	  return dstuserCustomMapper.findCZGLUserList(dstuserQueryDto);
	}
	
	/**
	 * 新增用户
	 * @param dstuserCustom
	 * @throws Exception
	 */
	public void insertUser(DstuserCustom dstuserCustom) throws Exception {
	  //参数校验
	  //1.非空校验
	  String nullstr = this.insertUserisNotNullAndEmptyByTrim(dstuserCustom);
	  if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
	  //抛出异常
		ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
	   }
	   //数据业务合法性校验
	   //1.用户号不能存在
	   Dstuser dstuser =  this.findUserByUsrno(dstuserCustom.getUsrno());
	   if(dstuser != null && !dstuser.getUserstate().equals("3")){
		 ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,new Object[] { "用户号",dstuserCustom.getUsrno() }));
	   }
	   if(dstuser != null && dstuser.getUserstate().equals("3")){
		   dstuser.setUsrno(dstuserCustom.getUsrno());
		   dstuser.setUsrname(dstuserCustom.getUsrname());
		   dstuser.setUserstate(dstuserCustom.getUserstate());
		   dstuser.setPhone(dstuserCustom.getPhone());
		   dstuser.setMovephone(dstuserCustom.getMovephone());
		   dstuser.setAddr(dstuserCustom.getAddr());
		   dstuser.setEmail(dstuserCustom.getEmail());
		   dstuser.setFax(dstuserCustom.getFax());
		   dstuser.setGroupid(dstuserCustom.getGroupid());
		   dstuser.setSysid(dstuserCustom.getSysid());
		   dstuser.setExpDat(DateUtil.yesterday());
		   dstuserMapper.updateByPrimaryKey(dstuser);
		   return;
	   }
	   //数据操作
	   dstuserCustom.setUserid(UUIDBuild.getUUID());
	   dstuserCustom.setUsrpass(new MD5().getMD5ofStr(ResourcesUtil.getValue(Config.SYSCONFIG, "defautpassword")));
	   //默认不出诊
	   dstuserCustom.setOutCall("2");
	   dstuserCustom.setExpDat(DateUtil.yesterday());
	   dstuserMapper.insert(dstuserCustom);
	       
	}
	
	/**
	 * 修改用户
	 * @param userid
	 * @param dstuserCustom
	 * @throws Exception
	 */
	public void updateUser(String userid, DstuserCustom dstuserCustom)
			throws Exception {
	  //参数校验
	  //1.非空校验
	  dstuserCustom.setUserid(userid);
	  String nullstr = this.updateUserisNotNullAndEmptyByTrim(dstuserCustom);
	  if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
		 ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
	   }
	   //数据业务合法性校验
	   //1.usrno不能存在
	   Dstuser dstuser =  this.findUserByUsrno(dstuserCustom.getUsrno());
	   if(dstuser != null && !dstuser.getUserid().equals(dstuserCustom.getUserid())){
		  ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,new Object[] { "用户号",dstuserCustom.getUsrno() }));
	    }
		//数据操作
		Dstuser dstuser_update = dstuserMapper.selectByPrimaryKey(userid);
		dstuser_update.setUserid(userid);
		dstuser_update.setUsrno(dstuserCustom.getUsrno());
		dstuser_update.setUsrname(dstuserCustom.getUsrname());
		dstuser_update.setUserstate(dstuserCustom.getUserstate());
		dstuser_update.setPhone(dstuserCustom.getPhone());
		dstuser_update.setMovephone(dstuserCustom.getMovephone());
		dstuser_update.setAddr(dstuserCustom.getAddr());
		dstuser_update.setEmail(dstuserCustom.getEmail());
		dstuser_update.setFax(dstuserCustom.getFax());
		dstuser_update.setGroupid(dstuserCustom.getGroupid());
		dstuser_update.setSysid(dstuserCustom.getSysid());
		dstuserMapper.updateByPrimaryKey(dstuser_update);
	}
	
	/**
	 * 删除用户
	 * @param usrid
	 * @param usrno
	 * @throws Exception
	 */
	 public void deleteUser(String userid) throws Exception {
		//参数校验
		//1.非空校验
		if(!StringUtils.isNotNullAndEmptyByTrim(userid)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "用户Id"}));
		}
		//2.删除用户是否存在
		Dstuser dstuser_delete = dstuserMapper.selectByPrimaryKey(userid);
		if(dstuser_delete == null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912, new Object[] { "用户信息","" }));
		}
		//数据业务合法性校验
		dstuser_delete.setUserstate("3");
		dstuserMapper.updateByPrimaryKey(dstuser_delete);
		DstuserroleExample dstuserroleExample = new DstuserroleExample();
		DstuserroleExample.Criteria criteria = dstuserroleExample.createCriteria();
		criteria.andUsrnoEqualTo(dstuser_delete.getUsrno());
		dstuserroleMapper.deleteByExample(dstuserroleExample);
	}
	 	
	/**
	 * 修改密码
	 * @throws Exception
	 */
	@Override
	public void updatePwd(DstuserQueryDto dstuserQueryDto) throws Exception {
		//参数校验
		//1、非空校验
		DstuserCustom dstuserCustom = dstuserQueryDto.getDstuserCustom();

		// 3、校验旧密码输入是否正确
		Dstuser dstuser = this.findUserByUsrno(dstuserCustom.getUsrno());
		// md5密文
		String pwd_db = dstuser.getUsrpass();

		if (!pwd_db.equalsIgnoreCase(dstuserQueryDto.getUsrpass1())) {
			// 旧密码输入错误
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 124, null));
		}

		//数据操作
		dstuser.setUsrpass(dstuserQueryDto.getUpdatepwd11());
		int expired_days = 90;
		Dstappoption pwd_expired_days = systemConfigService.findAppoptionByOptkey("PWD_EXPIRED_DAYS");
		if(pwd_expired_days!=null){
			expired_days = Integer.valueOf(pwd_expired_days.getOptvalue());
		}
		dstuser.setExpDat(DateUtil.offsetDay(DateUtil.beginOfDay(new Date()),expired_days));
		int n = dstuserMapper.updateByPrimaryKey(dstuser);
	}
	/**
	 * 修改用户密码
	 * @param userid
	 * @param dstuserCustom
	 * @throws Exception
	 */
	public void updatePassword(String usrno, DstuserCustom dstuserCustom)throws Exception{
		//1、校验新密码与新密码确认是否相同
		String pwd1 = new MD5().getMD5ofStr(dstuserCustom.getUpdatepwd1());
		String pwd2 = new MD5().getMD5ofStr(dstuserCustom.getUpdatepwd2());
		if(!pwd1.equalsIgnoreCase(pwd2)) {
			//两次输入的新密码不一致
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 123, null));
		}
		//数据操作
		Dstuser pwd_update = this.findUserByUsrno(usrno);
		pwd_update.setUsrpass(pwd1);
		pwd_update.setExpDat(DateUtil.yesterday());
		int n = dstuserMapper.updateByPrimaryKey(pwd_update);
	}
	/**
	 * 用户登录必填字段项非空校验
	 * @param usrno
	 * @return
	 */
	protected String loginUserisNotNullAndEmptyByTrim(String usrno, String pwd){
		if(!StringUtils.isNotNullAndEmptyByTrim(usrno)){
			return "用户名";
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(pwd)){
			return "密码";
		}
		return null;
	}
	/**
	 * 用户管理必填字段项非空校验
	 * @param dstuserCustom
	 * @return
	 */
	 private String insertUserisNotNullAndEmptyByTrim(DstuserCustom dstuserCustom) {
		//用户号
		if(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getUsrno())){
			return "用户号";
		}
		//用户名
		if(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getUsrname())){
			return "用户名";
		}
		//用户状态
		if(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getUserstate())){
			return "用户状态";
		}
		//用户分组
		if(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getGroupid())){
			return "用户分组";
		}
		//所属单位
		if("1".equals(dstuserCustom.getGroupid())&&(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getSysid()))){
			return "所属机构";
		}
		return null;
	}
	/**
	 * 用户管理必填字段项非空校验
	 * @param dstuserCustom
	 * @return
	 */
	 private String updateUserisNotNullAndEmptyByTrim(DstuserCustom dstuserCustom) {
		//用户号
		if(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getUsrno())){
			return "用户号";
		}
		//用户名
		if(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getUsrname())){
			return "用户名";
		}
		//用户状态
		if(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getUserstate())){
			return "用户状态";
		}
		//用户分组
		if(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getGroupid())){
			return "用户分组";
		}
		//所属单位
		if("1".equals(dstuserCustom.getGroupid())&&(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getSysid()))){
			return "所属机构";
		}
		return null;
	}

	 /**
	  * 修改密码必填字段项非空校验
	  * @param dstuserCustom
	  * @return
	  */
	 private String updatePwdisNotNullAndEmptyByTrim(DstuserCustom dstuserCustom) {
		 //旧密码
		 if(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getUsrpass())){
			 return "旧密码";
		 }
		 //新密码
		 if(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getUpdatepwd1())){
			 return "新密码";
		 }
		 //确认新密码
		 if(!StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getUpdatepwd2())){
			 return "确认新密码";
		 }
		 return null;
	 }
	 
	/**
	 * 根据userid查询用户信息
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	public DstuserCustom findUserByUserid(String userid) throws Exception {
	  Dstuser dstuser = dstuserMapper.selectByPrimaryKey(userid);
	  DstuserCustom dstuserCustom = new DstuserCustom();
	  BeanUtils.copyProperties(dstuser, dstuserCustom);
	  return dstuserCustom;
	}
	/**
	 * 获取角色关系编码表
	 * @return List<Dstrole>
	 * @exception Exception
	 * */
	@Override
	public List<DstuserroleCustom> findUserroleList(String usrno)
			throws Exception {
		
		return dstuserroleCustomMapper.findUserroleList(usrno);
	}
	/**
	 * 用户授权
	 * @param usrno 用户号
	 * @param roleids 对应的角色列表
	 * @throws Exception 
	 * */
	public void insertUserroleList(String usrno, String[] roleids) {
		//1.先删除改用户的角色关系数据
		dstuserroleCustomMapper.deleteUserroleByUsrno(usrno);
		//2.在新增该用户的角色
		for(int i=0;i<roleids.length;i++){
			Dstuserrole dstuserrole = new Dstuserrole();
			dstuserrole.setId(UUIDBuild.getUUID());
			dstuserrole.setUsrno(usrno);
			dstuserrole.setRoleid(roleids[i]);
			dstuserroleMapper.insert(dstuserrole);
		}
	}
	/**获取全部角色编码表
	 * @return List<Dstrole>
	 * */
	public List<Dstrole> findRoleAll() {
		DstroleExample dstroleExample = new DstroleExample();
		DstroleExample.Criteria criteria = dstroleExample.createCriteria();
		List<Dstrole> list = dstroleMapper.selectByExample(dstroleExample);
		return list;
	}
	/**
	 * 获取全部角色编码表(剔除该用户存在的角色编码)
	 * @param usrno
	 * @return List<DstroleCustom>
	 * @throws Exception
	 */
	public List<DstroleCustom> findRoleAllNoUsrno(String usrno) throws Exception {
		return dstroleCustomMapper.findRoleAllNoUsrno(usrno);
	}

	/**
	 * 根据归属机构号查询用户
	 * @param sysid
	 * @return
	 */
	public List<Dstuser> findDstUserBySysid(String sysid) throws Exception {
		//非空验证
		if(!StringUtils.isNotNullAndEmptyByTrim(sysid)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "归属上级机构sysid"}));
		}
		DstuserExample dstusrExample=new DstuserExample();
		DstuserExample.Criteria criteria=dstusrExample.createCriteria();
		criteria.andSysidEqualTo(sysid);
		return dstuserMapper.selectByExample(dstusrExample) ;
	}
	public List<Dstuser> findDstUserByEmgsysid(String emgsysid) throws Exception {
		//非空验证
		if(!StringUtils.isNotNullAndEmptyByTrim(emgsysid)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "归属上级机构sysid"}));
		}
		DstuserExample dstusrExample=new DstuserExample();
		DstuserExample.Criteria criteria=dstusrExample.createCriteria();
		//如果是急诊耳鼻咽喉科、急诊眼科、急诊口腔科 则 医生列表一致
		if(StringUtils.isNotNullAndEmptyByTrim(emgsysid)){
			if(emgsysid.equals("253") || emgsysid.equals("294") || emgsysid.equals("295")){
				List<String> emgsysids = new ArrayList<String>();
				emgsysids.add("253");
				emgsysids.add("294");
				emgsysids.add("295");
				criteria.andEmgsysidIn(emgsysids);

			}else{
				criteria.andEmgsysidEqualTo(emgsysid);
			}
				
		}
		criteria.andOutCallEqualTo("1");
		criteria.andUserstateEqualTo("1");
		return dstuserMapper.selectByExample(dstusrExample) ;
	}


	@Override
	public void updateOutCall2Cz(String[] userIdList) {
		dstuserCustomMapper.updateOutCall2Cz(userIdList);
	}

	@Override
	public void updateOutCall2Wcz(String[] userIdList) {

		dstuserCustomMapper.updateOutCall2Wcz(userIdList);
	}

	@Override
	public void updateOutCall(String userid, String emgsysid,String outcall) throws ExceptionResultInfo {
		Dstuser dstuser = dstuserMapper.selectByPrimaryKey(userid);
		if(!StringUtils.isNotNullAndEmptyByTrim(emgsysid) &&!StringUtils.isNotNullAndEmptyByTrim(dstuser.getEmgsysid()) && outcall.equals("1")){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 501,new Object[] {dstuser.getUsrname()}));
		}
		if(StringUtils.isNotNullAndEmptyByTrim(emgsysid)){
			dstuser.setEmgsysid(emgsysid);
		}
		if ("2".equals(outcall)) {
			dstuser.setEmgsysid(null);
		}
		dstuser.setOutCall(outcall);
		dstuserMapper.updateByPrimaryKey(dstuser);
	}

	@Override
	public List<Dstuser> findDstuserCustomByOutCall(String outCall) throws ExceptionResultInfo {
		//非空验证
		if(!StringUtils.isNotNullAndEmptyByTrim(outCall)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "是否出诊outCall"}));
		}
		DstuserExample dstusrExample=new DstuserExample();
		DstuserExample.Criteria criteria=dstusrExample.createCriteria();
		criteria.andOutCallEqualTo(outCall);
		return dstuserMapper.selectByExample(dstusrExample) ;
	}
	
	@Override
	public List<Dstuser> findDstuserCustomBySysid(String sysid) throws ExceptionResultInfo {
		DstuserExample dstusrExample=new DstuserExample();
		DstuserExample.Criteria criteria=dstusrExample.createCriteria();
		criteria.andSysidEqualTo(sysid);
		criteria.andUserstateEqualTo("1");
		return dstuserMapper.selectByExample(dstusrExample) ;
	}

	@Override
	public List<DstuserCustom> findDstuserCustomDriv(String comcname) {
		return dstuserCustomMapper.findDstuserCustomDriv(comcname);
	}

	@Override
	public int findUserroleListCount(String usrno) {
		return dstuserroleCustomMapper.findUserroleListCount(usrno);
	}

	@Override
	public List<Dstuser> findDstUserForCst(String emgsysid) throws Exception {
		//非空验证
				if(!StringUtils.isNotNullAndEmptyByTrim(emgsysid)){
					ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "归属上级机构sysid"}));
				}
				DstuserExample dstusrExample=new DstuserExample();
				DstuserExample.Criteria criteria=dstusrExample.createCriteria();
				criteria.andSysidEqualTo(emgsysid);
				criteria.andUserstateEqualTo("1");
				return dstuserMapper.selectByExample(dstusrExample) ;
	}

	@Override
	public List<Dstuser> findDstUserByQueryLike(String queryLike, String cstDepCod) {
		List<Dstuser> dstuserList = dstuserCustomMapper.findDstUserByQueryLike(queryLike,cstDepCod);
		return dstuserList;
	}

	@Override
	public int findCountByNameAndNo(DstuserQueryDto dstuserQueryDto)
			throws Exception {
		DstuserCustom dstuserCustom = dstuserQueryDto.getDstuserCustom();
		if(dstuserCustom != null){
			if(StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getUsrno())){
				dstuserCustom.setUsrno(dstuserCustom.getUsrno().toUpperCase());
			}
		}
		int total=dstuserCustomMapper.findCountByNameAndNo(dstuserQueryDto);
		return total;
	}

	@Override
	public List<DstuserCustom> findUserListByNameAndNo(
			DstuserQueryDto dstuserQueryDto) {
		List<DstuserCustom> list=dstuserCustomMapper.findUserListByNameAndNo(dstuserQueryDto);
		return list;
	}

	@Override
	public void insertYsczlsjl(Dstuser dstuser,String outcall,ActiveUser activeUser) throws Exception {
		HspYsczlsjlInf hspYsczlsjlInf = null;
		if (dstuser != null) {
			if (StringUtils.isNotNullAndEmptyByTrim(dstuser.getUserid())) {
				Dstuser dstuserInf = dstuserMapper.selectByPrimaryKey(dstuser.getUserid());
				if (dstuserInf != null) {
					hspYsczlsjlInf = new HspYsczlsjlInf();
					hspYsczlsjlInf.setLsSeq(UUIDBuild.getUUID());
					hspYsczlsjlInf.setUsrno(dstuserInf.getUsrno());
					hspYsczlsjlInf.setUsrname(dstuserInf.getUsrname());
					hspYsczlsjlInf.setOutCall(outcall);
					hspYsczlsjlInf.setEmgsysid(dstuser.getEmgsysid()); 
					if (activeUser != null) {
						hspYsczlsjlInf.setOperateNo(activeUser.getUsrno());
						hspYsczlsjlInf.setOperateName(activeUser.getUsrname());
					}
					hspYsczlsjlInf.setOperateDate(new Date());
					hspYsczlsjlInfMapper.insertSelective(hspYsczlsjlInf);
				}
			}
		}		
	}
	
	@Override
	public ActiveUser insertUserByHis(String usrno) throws Exception {
		Dstuser dstuser = this.findUserByUsrno(usrno);
	    if(dstuser == null){
	    	dstuser = vHemsYhxxMapper.findUserByHis(usrno);
		    if(dstuser == null){
			    // 用户不存在
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 101,null));
		    }
		    dstuser.setGroupid("1");
		    dstuser.setUsrpass(new MD5().getMD5ofStr("111111"));
		    dstuser.setUserstate("1");
		    dstuserMapper.insert(dstuser);
	    }
	    ActiveUser activeUser = new ActiveUser();
	    activeUser.setUsrno(usrno);
	   	activeUser.setUsrname(dstuser.getUsrname());
	   	activeUser.setGroupid(dstuser.getGroupid());
	   	activeUser.setSysid(dstuser.getSysid());// 单位id（重要）
	   	List<String> roles = this.findRoleByUsrno(usrno);
	   	if(!StringUtils.isNotNullAndZero(roles) || !(roles.contains("1006")||roles.contains("1007")||roles.contains("1008")||roles.contains("1009"))) {
	   		Dstuserrole dstuserrole = new Dstuserrole();
			dstuserrole.setId(UUIDBuild.getUUID());
			dstuserrole.setUsrno(usrno);
			dstuserrole.setRoleid("1009");
			dstuserroleMapper.insert(dstuserrole);
	   	}
	   	roles=roles!=null?roles:new ArrayList<String>();
	   	roles.add("1188");
	   	roles.add("1009");
	   	List<Menu> menu_list = this.findMenuByroleid(roles);
		Menu menu = new Menu();
		menu.setMenus(menu_list);
		activeUser.setMenu(menu);//将用户菜单存入用户身份对象中
	   	activeUser.setDstroleList(roles);
	   	List<Operation> operations = this.findOperatByRoleid(roles);
		activeUser.setOperationList(operations);//将用户操作权限存入用户身份对象中
		return activeUser;
	}



	@Override
	public ActiveUser loginDing(String unionid, String userid) throws Exception {
		DstuserExample example = new DstuserExample();
		DstuserExample.Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		criteria.andUserstateEqualTo("1");
		List<Dstuser> userlist = dstuserMapper.selectByExample(example);

		if(userlist == null || userlist.size() == 0) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,101, null));
		}

		return login(userlist.get(0));
	}

	@Override
	public ActiveUser loginWeixin(String userid) throws Exception {
		System.out.println("userid="+userid);
		DstuserExample example = new DstuserExample();
		DstuserExample.Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		criteria.andUserstateEqualTo("1");
		List<Dstuser> userlist = dstuserMapper.selectByExample(example);

		if(userlist == null || userlist.size() == 0) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,101, null));
		}
		return login(userlist.get(0));
	}

	private ActiveUser login(Dstuser dstuser) throws Exception {
		ActiveUser activeUser = new ActiveUser();
		String usrno = dstuser.getUsrno();
		List<Dstappoption> list = appoptionService.findAppoptionList();
		for (Dstappoption dstappoption : list) {
			if ("HSPLP".equals(dstappoption.getOptkey())) {
				activeUser.setHospitalCategory(dstappoption.getOptvalue());
			}
		}
		activeUser.setUsrno(usrno);
		activeUser.setUsrname(dstuser.getUsrname());
		activeUser.setGroupid(dstuser.getGroupid());
		activeUser.setSysid(dstuser.getSysid());// 单位id（重要）
		String sysmc = null;// 单位名称
		// 根据sysid查询单位名称
		String groupid = dstuser.getGroupid();
		String sysid = dstuser.getSysid();// 单位id
		//每个用户根据用户分组区分，所属单位来源会不一致；其中系统管理员不归属任何单位
		if (groupid.equals("1")) {
			//常规机构
			Dstcompctl dstcompctl = dstcompctlMapper.selectByPrimaryKey(sysid);
			if (dstcompctl == null) {
				// 抛出异常，可预知异常
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,204, null));
			}
			sysmc = dstcompctl.getComcname();
		}else{
			//如果存在多个分组
		}
		activeUser.setSysmc(sysmc);// 单位名称
		//取出用户所属的角色
		List<String> roles = this.findRoleByUsrno(usrno);
		//如果用户不存在任何角色，则抛出异常
		if(roles == null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,102, null));
		}
		activeUser.setDstroleList(roles);//将用户角色存入用户身份对象中
		//根据角色id获取菜单（可能有多个）
		List<Menu> menu_list = this.findMenuByroleid(roles);
		Menu menu = new Menu();
		menu.setMenus(menu_list);
		activeUser.setMenu(menu);//将用户菜单存入用户身份对象中
		//根据用户角色获取操作权限
		List<Operation> operations = this.findOperatByRoleid(roles);
		activeUser.setOperationList(operations);//将用户操作权限存入用户身份对象中
		return activeUser;
	}

	@Override
	public List<DstuserCustom> findDstuserByPinyinLike(DstuserQueryDto dstuserQueryDto) {
		return dstuserCustomMapper.findDstuserByPinyinLike(dstuserQueryDto);
	}
}
