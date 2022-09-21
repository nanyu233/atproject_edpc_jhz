package activetech.zyyhospital.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import activetech.base.annotation.FormToken;
import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.service.HspHlpgbService;
/**
 * 
 * Title:ZyyJjdAction
 * <p>
 * Description:交接记录单
 * </p>
 * @author ckb
 * @date 2017年11月28日
 * 
 */
@Controller
@RequestMapping("/hzszyyjjd")
public class ZyyJjdAction {
	
	@Autowired
	private HspHlpgbService hspHlpgbService;
	
	/**
	 * 跳转系统评估单右侧页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toRightPage")
	public String toRightPage(Model model) throws Exception {
		return "/hzszyyhospital/hzszyyxtpg/rightxtpg";
	}
	
	/**
	 * 跳转系统评估入院评估单
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toxtpgRypgd")
	@FormToken(save=true)
	public String toxtpgRypgd(Model model, String emgSeq,ActiveUser activeUser) throws Exception {
		//首条入院护理评估单时对部分数据进行赋值操作
		hspHlpgbService.firstAssignment(emgSeq,activeUser);
		return "/hzszyyhospital/hzszyyxtpg/xtpg/xtpgRypgd";
	}
	
	/**
	 * 跳转系统评估病情护理
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toxtpgBqhljld")
	public String toxtpgBqhljld(Model model) throws Exception {
		return "/hzszyyhospital/hzszyyxtpg/xtpg/xtpgBqhljld";
	}
	
	/**
	 * 跳转系统评估系统评估
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toxtpgXtpg")
	public String toxtpgXtpg(Model model) throws Exception {
		return "/hzszyyhospital/hzszyyxtpg/xtpg/xtpgXtpg";
	}
	
}
