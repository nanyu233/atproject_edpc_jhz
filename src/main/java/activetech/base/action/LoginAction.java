package activetech.base.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import activetech.base.process.result.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.base.service.UserService;

import java.io.IOException;

/**
 * 
 * <p>Title:LoginAction</p>
 * <p>Description:用户认证</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2016-11-28 下午1:19:54
 * 
 */
@Controller
public class LoginAction {

	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private UserService userService;
	
	/**
	 * 登录页
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/login")
	public String loginyy(Model model)throws Exception{
		return View.toBase("/login/login");
	}
	
	
	/**
	 * 登录提交交易
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/loginsubmit")
	public @ResponseBody SubmitResultInfo loginsubmit(HttpSession session,String userid, String pwd,String validateCode,ActiveUser activeUser,HttpServletRequest request) throws Throwable{
		String ip=getIpAddr(request);
		if(activeUser==null || !activeUser.getUsrno().equals(userid)){
			activeUser = userService.checkUserInfo(userid,pwd);
		}
		// 将用户身份信息写入session
		activeUser.setIp(ip);
		session.setAttribute(Config.ACTIVEUSER_KEY, activeUser);
		System.out.println(">>>>>>>>>>>>>>>>acativeUser-ip:"+activeUser.getIp());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 107, new Object[] { "" }));
	}
	
	/**
	 * 登出交易
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception{
		//session过期
		session.invalidate();
		return View.redirect("login.do");
	}
	
	/**
	 * 查询IP地址
	 *@param request
	 *@return
	 *@author liulj @date 2017年11月23日 上午9:46:59
	 */
	public String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		System.out.println("Ip="+ip);
		return ip;
	}

	@RequestMapping("/getPasswordRule")
	@ResponseBody
	public SubmitResultInfo getPasswordRule() throws IOException {
		ResultInfo resultInfo = systemConfigService.getPasswordRule();
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
