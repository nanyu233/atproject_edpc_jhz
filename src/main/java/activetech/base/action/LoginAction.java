package activetech.base.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import activetech.base.config.DingTalkConfig;
import activetech.base.process.result.ResultInfo;
import activetech.base.util.DingTalkUtil;
import com.dingtalk.api.response.OapiSnsGetuserinfoBycodeResponse;
import com.dingtalk.api.response.OapiV2UserGetuserinfoResponse;
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
	public @ResponseBody SubmitResultInfo loginsubmit(HttpSession session,String userid, String pwd,String validateCode,ActiveUser activeUser,HttpServletRequest request,String hospitalCategory ) throws Throwable{
		String ip=getIpAddr(request);
		if(activeUser==null || !activeUser.getUsrno().equals(userid)){
			activeUser = userService.checkUserInfo(userid,pwd);
		}
		// 将用户身份信息写入session
		activeUser.setHospitalCategory(hospitalCategory);
		activeUser.setIp(ip);
		session.setAttribute(Config.ACTIVEUSER_KEY, activeUser);
		System.out.println(">>>>>>>>>>>>>>>>acativeUser-ip:"+activeUser.getIp());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 107, new Object[] { "" }));
	}

	@RequestMapping("/loginDing")
	@ResponseBody
	public
	SubmitResultInfo
//	String
	loginDing(HttpSession session, String authCode, String hospitalCategory, ActiveUser activeUser) throws Exception{
		System.out.println("免登授权码："+ authCode);
		//1、判断accessToken是否在有效期内 获取企业accessToken
		String accessToken = systemConfigService.queryDingAccessToken(DingTalkConfig.getAppKey());
		//2、获取用户id
		OapiV2UserGetuserinfoResponse.UserGetByCodeResponse dingUser = DingTalkUtil.getUserinfo(accessToken, authCode);
		activeUser = userService.loginDing(dingUser.getUnionid(), dingUser.getUserid());
		// 将用户身份信息写入session
		activeUser.setHospitalCategory(hospitalCategory);
		session.setAttribute(Config.ACTIVEUSER_KEY, activeUser);
		System.out.println(">>>>>>>>>>>>>>>>acativeUser-ip:"+activeUser.getIp());

		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 107, new Object[] { "" }));
//		return View.toBase("/login/dinglogintmp");
	}

	@RequestMapping("/loginDingSns")
//	@ResponseBody
	public
//	SubmitResultInfo
	String
	loginDingSns(HttpSession session, String code, String state, ActiveUser activeUser) throws Exception{
		OapiSnsGetuserinfoBycodeResponse.UserInfo dingUser = DingTalkUtil.getUserinfoByCode(code);
		activeUser = userService.loginDing(dingUser.getUnionid(), null);
		activeUser.setHospitalCategory("1");
		session.setAttribute(Config.ACTIVEUSER_KEY, activeUser);
//		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 107, new Object[] { "" }));
		return View.toBase("/login/dinglogintmp");
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
