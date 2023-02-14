package activetech.base.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.JavaType;

import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.Dstrole;
import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstroleCustom;
import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.pojo.dto.DstuserQueryDto;
import activetech.base.pojo.dto.DstuserroleCustom;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.CompctlService;
import activetech.base.service.RoleService;
import activetech.base.service.SystemConfigService;
import activetech.base.service.UserService;
import activetech.base.service.UsrtrainfService;
import activetech.util.ExcelExportSXXSSF;
import activetech.util.HttpClientUtil;
import activetech.util.HxlsOptRowsInterface;
import activetech.util.HxlsRead;
import activetech.util.JacksonUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;

/**
 * 
 * <p>Title:UserAction</p>
 * <p>Description:用户管理</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月9日 上午11:09:43
 *
 */
@Controller
@RequestMapping("/user")
public class UserAction {
	@Autowired
	private UserService userService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired 
	private CompctlService compctlService;
	@Autowired
	private HxlsOptRowsInterface userImportService;
	@Autowired
	private UsrtrainfService usrtrainfService;
	@Autowired
	private RoleService roleService;
	/**
	 * 跳转用户管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryuser")
	public String queryuser(Model model,String sysid,String moduleid) throws Exception{
		model.addAttribute("sysid", sysid);
		model.addAttribute("moduleid", moduleid);
		//常用角色列表
		List<Dstrole> roleList = roleService.findRoleList();
		model.addAttribute("roleList", roleList);
		return View.toBase("/user/queryuser");
	}
	
	/**
	 * 用户管理列表查询结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryuser_result")
	public @ResponseBody DataGridResultInfo queryUser_result(
			DstuserQueryDto dstuserQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
		//非空校验
		dstuserQueryDto = dstuserQueryDto!=null?dstuserQueryDto:new DstuserQueryDto();
		//查询列表的总数
		int total = userService.findUserCount(dstuserQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		dstuserQueryDto.setPageQuery(pageQuery);
		List<DstuserCustom> list = userService.findUserList(dstuserQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 出诊管理列表查询结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryczgluser_result")
	public @ResponseBody DataGridResultInfo queryczgluser_result(
			DstuserQueryDto dstuserQueryDto,
			int page,//当前页码
			int rows,//每页显示个数
			String order,
			String sort
			) throws Exception{
		//非空校验
		dstuserQueryDto = dstuserQueryDto!=null?dstuserQueryDto:new DstuserQueryDto();
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			dstuserQueryDto.setSort("outCall");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			dstuserQueryDto.setOrder("asc");
		}
		
		int total = userService.findCZGLUserCount(dstuserQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		dstuserQueryDto.setPageQuery(pageQuery);
		List<DstuserCustom> list = userService.findCZGLUserList(dstuserQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 用户相关的角色
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryuserrole_result")
	public @ResponseBody DataGridResultInfo queryUserRole_result(
			DstuserQueryDto dstuserQueryDto
			) throws Exception{
		//非空校验
		dstuserQueryDto = dstuserQueryDto!=null?dstuserQueryDto:new DstuserQueryDto();
		//查询列表的总数
		List<DstuserroleCustom> list = userService.findUserroleList(dstuserQueryDto.getDstuserroleCustom().getUsrno());
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转用户新增界面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/adduser")
	public String adduser(Model model,String sysid) throws Exception{
		//将页面所需数据取出传到页面
		List<Dstdictinfo> groupList = systemConfigService.findDictinfoByType("USERGROUP");
		model.addAttribute("groupList", groupList);
		Dstcompctl dstcompctl=compctlService.findCompctlByComno(sysid);
		model.addAttribute("dstcompctl", dstcompctl);
		return View.toBase("/user/adduser");
	}
	
	/**
	 * 用户新增提交
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addusersubmit")
	public @ResponseBody SubmitResultInfo addsysusersubmit(DstuserQueryDto dstuserQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		userService.insertUser(dstuserQueryDto.getDstuserCustom());
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转用户修改界面
	 * @param model
	 * @param usrno
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/edituser")
	public String edituser(Model model,String userid) throws Exception{
		//根据userid获取角色信息并传回页面
		DstuserCustom dstuserCustom = userService.findUserByUserid(userid);
		model.addAttribute("dstuserCustom", dstuserCustom);
		//将页面所需数据取出传到页面
		List<Dstdictinfo> groupList = systemConfigService.findDictinfoByType("USERGROUP");
		model.addAttribute("groupList", groupList);
		//赋值所属机构
		Dstcompctl dstcompctl=compctlService.findCompctlByComno(dstuserCustom.getSysid());
		model.addAttribute("sysname", dstcompctl.getComcname());
		return View.toBase("/user/edituser");
		
	}
	
	/**
	 * 用户修改提交
	 * @param usrno
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editusersubmit")
	public @ResponseBody SubmitResultInfo editrolesubmit(String userid,DstuserQueryDto dstuserQueryDto)throws Exception{
		userService.updateUser(userid,dstuserQueryDto.getDstuserCustom());	
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}

	/**
	 * 删除用户
	 * @param usrno
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deleteuser")
	public @ResponseBody SubmitResultInfo deleteuser(String userid) throws Exception{
		userService.deleteUser(userid);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	/**
	 * 跳转修改密码界面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updatepwd")
	public String updatepwd(Model model,String usrno,String usrname,ActiveUser activeUser) throws Exception{
		if(org.apache.commons.lang3.StringUtils.isEmpty(usrno)){
			usrno = activeUser.getUsrno();
			usrname = activeUser.getUsrname();
		}
		model.addAttribute("usrno",usrno);
		model.addAttribute("usrname",usrname);
		return View.toBase("/user/updatepwd");
	}
	

	/**
	 * 跳转退出页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dropOut")
	public String dropOut(Model model) throws Exception{
		return View.toBase("/user/dropOut");
	}
	/**
	 * 修改密码提交
	 * @param usrno
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveapwd")
	public @ResponseBody SubmitResultInfo saveapwd(DstuserQueryDto dstuserQueryDto) throws Exception{
		userService.updatePwd(dstuserQueryDto);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906,null));
	}
	
	/**
	 * 跳转机构用户管理首页
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querycompctluser")
	public String querycompctluser(Model model,String moduleid) throws Exception{
		model.addAttribute("moduleid", moduleid);
		return View.toBase("/user/querycompctluser");
	}
	/**
	 * 跳转用户授权页面
	 * @param model
	 * @param usrno
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/roleauth")
	public String roleauth(Model model,String userid) throws Exception{
		//1.获取全部角色编码数据(剔除该用户存在的角色编码)
		List<DstroleCustom> roleList = userService.findRoleAllNoUsrno(userid);
		model.addAttribute("roleList", roleList);
		//2.获取用户关系角色编码数据
		List<DstuserroleCustom> userroleList = userService.findUserroleList(userid);
		model.addAttribute("userroleList", userroleList);
		model.addAttribute("userid", userid);
		return View.toBase("/user/roleauth");
	}
	
	/**
	 * 用户授权提交
	 * @param userid
	 * @param rolestrs 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/roleauthsubmit")
	public @ResponseBody SubmitResultInfo roleauthsubmit(String userid,String[] rolestrs)throws Exception{
		userService.insertUserroleList(userid, rolestrs);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	/**
	 * 	用户列表导出
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportUserSubmit")
	public @ResponseBody SubmitResultInfo exportUsesrSubmit(String sysid,DstuserQueryDto dstuserQueryDto) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "user";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("用户账号");
		fieldNames.add("用户名称");
		fieldNames.add("状态");
		fieldNames.add("移动电话");
		fieldNames.add("用户分组");
		fieldNames.add("所属单位");

		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("usrno");
		fieldCodes.add("usrname");
		fieldCodes.add("userstate");
		fieldCodes.add("movephone");
		fieldCodes.add("groupname");
		fieldCodes.add("dwmc");

		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows);

		// 导出的数据通过service取出
		dstuserQueryDto.getDstuserCustom().setSysid(sysid);
		List<DstuserCustom> list = userService.findUserList(dstuserQueryDto);

		// 执行导出
		excelExportSXXSSF.writeDatasByObject(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"用户列表",
						list.size(),
						webpath//下载地址
				}));
	}

	/**
	 * 跳转用户导入页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/importuser")
	public String importuser(Model model) throws Exception{
		return View.toBase("/user/importuser");
	}
	
	/**
	 * 用户信息导入
	 * @param userimportfile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/importusersubmit.do")
	public @ResponseBody SubmitResultInfo importusersubmit(MultipartFile userimportfile)throws Exception{
		//将上传的文件写到磁盘
		String originalFilename  = userimportfile.getOriginalFilename();
		//写入磁盘的文件
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		File file = new File(filePath+UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf(".")));
		if(!file.exists()){
			//如果文件目录 不存在则创建
			file.mkdirs();
		}
		
		//将内存中的文件写磁盘
		userimportfile.transferTo(file);
		//上传文件磁盘上路径 
		String absolutePath = file.getAbsolutePath();
		//调用工具类进行用户信息导入
		HxlsRead xls2csv = null;
		try {
			//第一个参数就是导入的文件
			//第二个参数就是导入文件中哪个sheet
			//第三个参数导入接口的实现类对象
			xls2csv = new HxlsRead(absolutePath,1,userImportService);
			xls2csv.process();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//提示导入成功条数
		long success_num = xls2csv.getOptRows_success();
		//导入失败数量
		long failure_num = xls2csv.getOptRows_failure();
		ResultInfo submitResultInfo = null;
		if(failure_num == 0){
			submitResultInfo = ResultUtil.createSuccess(Config.MESSAGE, 915, new Object[]{
					" 用户信息",success_num,failure_num
			});
		}else{
			//获取失败数据的EXCEL路径 供用户下载
			String failpath = getFailExcelPath(xls2csv);
			submitResultInfo = ResultUtil.createSuccess(Config.MESSAGE, 916, new Object[]{
					success_num,failure_num,failpath
			});
		}
		return ResultUtil.createSubmitResult(submitResultInfo);
	}

	/**
	 * 获取失败数据的EXCEL路径 供用户下载
	 * @param xls2csv
	 * @return
	 * @throws Exception 
	 */
	private String getFailExcelPath(HxlsRead xls2csv) throws Exception {
		//对导入失败记录处理
		//获取导入失败记录
		List<List<String>> failrows = xls2csv.getFailrows();
		//获取导入记录的title
		List<String> rowtitle = xls2csv.getRowtitle();
		//获取导入失败原因
		List<String> failmsgs = xls2csv.getFailmsgs();
		//生成excel
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = rowtitle;
		rowtitle.add("失败原因");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("usrno");
		fieldCodes.add("usrname");
		fieldCodes.add("groupid");
		fieldCodes.add("sysid");
		fieldCodes.add("phone");
		fieldCodes.add("movephone");
		fieldCodes.add("addr");
		fieldCodes.add("email");
		fieldCodes.add("fax");
		fieldCodes.add("errormsg");
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		// 导出文件的前缀
		String filePrefix = "usererror";
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows);	
		
		List<DstuserCustom> errorlist = new ArrayList<DstuserCustom>();
		for(List<String> errorrow:failrows){
			DstuserCustom dstuserCustom = new DstuserCustom();
			dstuserCustom.setUsrno(errorrow.get(0));
			dstuserCustom.setUsrname(errorrow.get(1));
			dstuserCustom.setGroupid(errorrow.get(2));
			dstuserCustom.setSysid(errorrow.get(3));
			dstuserCustom.setPhone(errorrow.get(4));
			dstuserCustom.setMovephone(errorrow.get(5));
			dstuserCustom.setAddr(errorrow.get(6));
			dstuserCustom.setEmail(errorrow.get(7));
			dstuserCustom.setFax(errorrow.get(8));
			errorlist.add(dstuserCustom);
		}
		
		for(int i=0;i<errorlist.size();i++){
			DstuserCustom error_user = errorlist.get(i);
			error_user.setErrormsg(failmsgs.get(i));
		}
		// 执行导出
		excelExportSXXSSF.writeDatasByObject(errorlist);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		return webpath;
	}
	@RequestMapping("findDstUserBySysid")
	public @ResponseBody List<Dstuser> findDstUserBySysid(String sysid)throws Exception{
		return userService.findDstUserBySysid(sysid);
	}
	
	@RequestMapping("findDstUserByEmgsysid")
	public @ResponseBody List<Dstuser> findDstUserByEmgsysid(String emgsysid)throws Exception{
		return userService.findDstUserByEmgsysid(emgsysid);
	}
	
	/**
	 * 跳转出诊管理页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("outCallManage")
	public String outCallManage(Model model, String moduleid) throws Exception{
		model.addAttribute("moduleid", moduleid);
		return View.toBase("/user/outCallManage/outCallManage");
	}
	/**
	 * 跳转出诊管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/outCallList")
	public String outCallList(Model model,String sysid, String moduleid) throws Exception{
		model.addAttribute("sysid", sysid);
		//查询待出诊的急诊科室
		Dstappoption dstappotion=systemConfigService.findAppoptionByOptkey("TOP_COMNO");
		List<Dstcompctl> emgcompctllist = null ;
		if(dstappotion!=null){
			emgcompctllist = compctlService.getJzksCompctlList();
		}
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgcompctllist", emgcompctllist);
		return View.toBase("/user/outCallManage/outCallList");
	}
	/**
	 * 修改出诊状态
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/updateOutCall")
	public Map<String, Object> updateOutCall(String indexs,String outCall) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String flag = "error";
		String[] userIdList = indexs.split(",");
		if("1".equals(outCall))
			userService.updateOutCall2Cz(userIdList);
		else
			userService.updateOutCall2Wcz(userIdList);
		flag = "success";
		resultMap.put("flag", flag);
		
		return resultMap;
	}
	
	/**
	 * 修改出诊状态
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/setOutCall")
	public  SubmitResultInfo setOutCall(DstuserQueryDto dstuserQueryDto,String indexs,String outcall,ActiveUser activeUser) throws Exception{
		  // 页面提交的业务数据（多个），要处理的业务数据，页面中传入的参数
		  List<Dstuser> list = dstuserQueryDto.getDstuserCustoms();
		  String[] array=indexs.split(",");
	      // 处理数据的总数
		  int count = array.length;
		  // 处理成功的数量
		  int count_success = 0;
		  // 处理失败的数量
		  int count_error = 0;
		  // 处理失败的原因
		 List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
	     for (int i = 0; i < count; i++) {
			 ResultInfo resultInfo = null;
	         // 根据选中行的序号获取要处理的业务数据(单个)
			 Dstuser dstuser = list.get(Integer.parseInt(array[i]));
			 try {
				 userService.updateOutCall(dstuser.getUserid(),dstuser.getEmgsysid(),outcall);
				 
			} catch (Exception e) {
				e.printStackTrace();
				// 进行异常解析
				if (e instanceof ExceptionResultInfo) {
					resultInfo = ((ExceptionResultInfo) e).getResultInfo();
				 } else {
					// 构造未知错误异常
					resultInfo = ResultUtil.createFail(Config.MESSAGE, 900,
							null);
				}

			}
			if (resultInfo == null) {
				// 说明成功
				count_success++;
				userService.insertYsczlsjl(dstuser,outcall,activeUser);
			} else {
				count_error++;
				// 记录失败原因
				msgs_error.add(resultInfo);
			}
		 }
		 // 提示用户成功数量、失败数量、失败原因
		 // 改成返回详细信息
		 return ResultUtil.createSubmitResult(
				 ResultUtil.createSuccess(Config.MESSAGE, 907, new Object[] {
		 count_success, count_error }), msgs_error);
	}
	
	/**
	 * 用户调配
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/allocateuser")
	public String allocateuser(Model model,String userid) throws Exception{
		//根据userid获取角色信息并传回页面
		//根据userid获取角色信息并传回页面
		DstuserCustom dstuserCustom = userService.findUserByUserid(userid);
		model.addAttribute("dstuserCustom", dstuserCustom);
		
		//赋值所属机构
		Dstcompctl dstcompctl=compctlService.findCompctlByComno(dstuserCustom.getSysid());
		model.addAttribute("sysname", dstcompctl.getComcname());
		
			return View.toBase("/user/allocateuser");
	}
	
	
	/**
	 * 用户调配提交
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitallocateuser")
	public @ResponseBody SubmitResultInfo addabnsubmit(Model model, DstuserQueryDto dstuserQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		usrtrainfService.insertUsrtrainf(dstuserQueryDto.getDstuserCustom(),activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 模糊查询usrno或usrname
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryDoc")
	public @ResponseBody List<Dstuser> queryDoc(String queryLike,String cstDepCod) throws Exception {
		List<Dstuser> dstuserList = userService.findDstUserByQueryLike(queryLike,cstDepCod);
		return dstuserList;
	}
	
	/**
	 * 用户管理列表查询结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findUserByNameAndNo")
	public @ResponseBody List<DstuserCustom> findUserByNameAndNo(
			DstuserQueryDto dstuserQueryDto
			) throws Exception{
		//非空校验
		dstuserQueryDto = dstuserQueryDto!=null?dstuserQueryDto:new DstuserQueryDto();
		List<DstuserCustom> list = userService.findUserListByNameAndNo(dstuserQueryDto);
		return list;
	}
	/**
	 * 跳转修改密码界面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editPassword")
	public String editPassword(Model model,String userid) throws Exception{
		DstuserCustom dstuserCustom = userService.findUserByUserid(userid);
		model.addAttribute("dstuserCustom", dstuserCustom);
		return View.toBase("/user/updatePassword");
	}
	/**
	 * 修改密码提交
	 * @param usrno
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/savePassword")
	public @ResponseBody SubmitResultInfo savePassword(String usrno,DstuserQueryDto dstuserQueryDto) throws Exception{
		usrno = dstuserQueryDto.getDstuserCustom().getUsrno();
		userService.updatePassword(usrno, dstuserQueryDto.getDstuserCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906,null));
	}

	/**
	 * 用户名拼音首字母查询
	 * @param dstuserQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryUser_pinyinLike")
	public @ResponseBody SubmitResultInfo queryUser_pinyinLike(DstuserQueryDto dstuserQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createWarning(Config.MESSAGE, 906, null);
		List<DstuserCustom> userlist = userService.findDstuserByPinyinLike(dstuserQueryDto);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("userlist", userlist);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
}

