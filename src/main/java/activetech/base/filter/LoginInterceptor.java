package activetech.base.filter;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import activetech.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import activetech.base.dao.mapper.DstuserCustomMapper;
import activetech.base.dao.mapper.DstuserMapper;
import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.domain.DstuserExample;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.Menu;
import activetech.base.pojo.dto.Operation;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.AppoptionService;
import activetech.util.MD5;
import activetech.util.ResourcesUtil;
import activetech.util.StringUtils;

/**
 * 
 * <p>Title:LoginInterceptor</p>
 * <p>Description:用户身份校验拦截器</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2016-11-28 下午5:08:46
 * 
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Autowired
	private DstuserMapper dstuserMapper;
	@Autowired
	private DstuserCustomMapper dstuserCustomMapper;
	@Autowired
	private AppoptionService appoptionService;
	@Autowired
	private UserService userService;

	//执行时机：进入action方法之前执行
	//使用场景：用于用户认证、用户授权拦截
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
	    response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		String url = request.getServletPath();
		//校验用户身份是否合法
		HttpSession session = request.getSession();
		ActiveUser activeUser = (ActiveUser) session.getAttribute(Config.ACTIVEUSER_KEY);
		String userid = request.getParameter("userid");
		if("/loginsubmit.do".equals(url) || "/jhj/loginsubmit.do".equals(url)){
			if(activeUser != null ){
				if(userid.equals(activeUser.getUsrno())){
					//用户已经登陆，放行
					return true;
				}else{
					if("admin".equals(userid)){
						String pwd = request.getParameter("pwd");
						if(userid != null && "admin".equals(userid)){
							Dstuser dstuser =  this.findUser(userid,pwd);
							if(dstuser == null){
								ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 114,null));
								return false;
							}else{
								ActiveUser adminUser= new ActiveUser();
								List<Dstappoption> list = appoptionService.findAppoptionList();
//								for (Dstappoption dstappoption : list) {
//									if ("HSPLP".equals(dstappoption.getOptkey())) {
//										adminUser.setHospitalCategory(dstappoption.getOptvalue());
//									}
//								}
								adminUser.setUsrno(userid);
								adminUser.setUsrname(dstuser.getUsrname());
								adminUser.setGroupid(dstuser.getGroupid());
								adminUser.setSysid(dstuser.getSysid());// 单位id（重要）
								List<Menu> menu_list = this.findMenuForAdmin();
								Menu menu = new Menu();
								menu.setMenus(menu_list);
								adminUser.setMenu(menu);//将用户菜单存入用户身份对象中 
								List<Operation> operations = this.findOperatForAdmin();
								adminUser.setOperationList(operations);//将用户操作权限存入用户身份对象中
								session.setAttribute(Config.ACTIVEUSER_KEY, adminUser);
								return true;
							}
						}
					}
				}
			}else{
				if("admin".equals(userid)){
					String pwd = request.getParameter("pwd");
					if(userid != null && "admin".equals(userid)){
						Dstuser dstuser =  this.findUser(userid,pwd);
						if(dstuser == null){
							ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 114,null));
							return false;
						}else{
							ActiveUser adminUser= new ActiveUser();
							List<Dstappoption> list = appoptionService.findAppoptionList();
//							for (Dstappoption dstappoption : list) {
//								if ("HSPLP".equals(dstappoption.getOptkey())) {
//									adminUser.setHospitalCategory(dstappoption.getOptvalue());
//								}
//							}
							adminUser.setUsrno(userid);
							adminUser.setUsrname(dstuser.getUsrname());
							adminUser.setGroupid(dstuser.getGroupid());
							adminUser.setSysid(dstuser.getSysid());// 单位id（重要）
							List<Menu> menu_list = this.findMenuForAdmin();
							Menu menu = new Menu();
							menu.setMenus(menu_list);
							adminUser.setMenu(menu);//将用户菜单存入用户身份对象中
							List<Operation> operations = this.findOperatForAdmin();
							adminUser.setOperationList(operations);//将用户操作权限存入用户身份对象中
							session.setAttribute(Config.ACTIVEUSER_KEY, adminUser);
							return true;
						}
					}
				}
			}
		}else{
			if(activeUser != null ){
					//用户已经登陆，放行
					return true;
			}
		}
		if ("/emisToEdpc.do".equals(url)){
			String usrno = request.getParameter("usrno");
			if (StringUtils.isNotNullAndEmptyByTrim(usrno)) {
				if (activeUser != null && usrno.equals(activeUser.getUsrno())) {
					return true;
				} else {
					ActiveUser user = userService.checkUser(usrno);
					// 将用户身份信息写入session
					session.setAttribute(Config.ACTIVEUSER_KEY, user);
					return true;
				}
			}
			return true;
		}

		//校验用户访问是否是公开资源 地址
		List<String> open_urls = ResourcesUtil.gekeyList(Config.ANONYMOUS_ACTIONS);
		
		//用户访问的url
		for(String open_url:open_urls){
			if(url.indexOf(open_url)>=0){
				//如果访问的是公开 地址则放行
				return true;
			}
		}
		
		//判断是否为ajax请求，默认不是  
        if(StringUtils.isNotNullAndEmptyByTrim(request.getHeader("x-requested-with")) && request.getHeader("x-requested-with").equals("XMLHttpRequest")){  
        	//抛出异常，异常代码106（需要登陆后继续操作）为了解决submit操作时候 session过期 的问题
			ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 109, null));
        }  else{
        	//获取当前配置的数据库所在医院
			request.getRequestDispatcher("/WEB-INF/jsp/base/login/login.jsp").forward(request, response);
        }
		return false;
	}

	private List<Operation> findOperatForAdmin() {
		return dstuserCustomMapper.findOperatForAdmin();
	}

	private List<Menu> findMenuForAdmin() {
		return dstuserCustomMapper.findMenuForAdmin();
	}

	private Dstuser findUser(String userid, String pwd) {
		String pwd_md5 = new MD5().getMD5ofStr(pwd);
		DstuserExample userExample = new DstuserExample();
		DstuserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsrnoEqualTo(userid);
		criteria.andUsrpassEqualTo(pwd_md5);
		List<Dstuser> list = dstuserMapper.selectByExample(userExample);
		if(list != null && list.size() == 1){
			return list.get(0);
		}
		return null;
	}

	//执行时机：进入action方法，在返回modelAndView之前执行
	//使用场景：在这里统一对返回数据进行处理，比如统一添加菜单 导航
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		
	}

	//执行时机:action方法执行完成，已经 返回modelAndView，执行。
	//使用场景：统一处理系统异常，在这里统一记录系统日志 ，监控action方法执行时间，在preHandle记录开始时间，在afterCompletion记录结束时间
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
	}

}
