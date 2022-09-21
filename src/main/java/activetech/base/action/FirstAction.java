package activetech.base.action;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.Menu;
import activetech.base.service.FirstService;
import activetech.base.service.UserService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.service.HspreportService;
@Controller
public class FirstAction {
	
	@Autowired
	public HspreportService  hspreportService;
	@Autowired
	public UserService userService;
	@Autowired
	public FirstService firstService;
	
	/**
	 * 跳转首页
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/first")
	public String first(Model model,ActiveUser activeUser) throws Throwable{
		firstService.first(model, activeUser);
		return View.toBase("/first/firstXT");
	}
	
	/**
	 * HIS内嵌病历 跳转首页
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/firstHis")
	public String firstHis(Model model,ActiveUser activeUser,HspemginfCustom hspemginfCustom,String type) throws Throwable{
		firstService.firstHis(model, activeUser,hspemginfCustom,type);
		return View.toBase("/first/first");
	}

	
	/**
	 * 获取登录页
	 * @param model
	 * @return
	 * @throws Exception
	 */
	//欢迎页面
	@RequestMapping("welcome")
	public String welcome(){
		return View.toBase("/welcome");
	}
	
	/**
	 * 获取菜单
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/usermenu")
	public @ResponseBody Menu usermenu(HttpServletRequest request,ActiveUser activeUser )throws Exception{
		return activeUser.getMenu();
	}
	
	/**
	 * 首页数据获取公用方法
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/indexmng")
	public String indexmng(Model model) throws Throwable{
		firstService.indexmng(model);
		return View.toBase("/index/indexmng");
	}
	
	/**
	 * 首页数据获取公用方法_卒中
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/indexmng_cz")
	public String indexmng_cz(Model model) throws Throwable{
		firstService.indexmng(model);
		return View.toBase("/index/indexmng_cz");
	}
	
	/**
	 * 获取急诊大屏展示硬数据
	 * @return Map
	 * @throws Exception
	 */
	@RequestMapping("/getBigscreenMsg")
	public @ResponseBody Map<String, Object> getBigscreenMsg() throws Exception{
		Map<String,Object> map = hspreportService.findDrhzrsZyy();
		return map;
	}
}