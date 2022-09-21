package activetech.edpc.action;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.edpc.pojo.domain.VHemsJyjgs;
import activetech.edpc.pojo.dto.VHemsJcjgHzCustomJson;
import activetech.edpc.pojo.dto.VHemsJyjgHzCustom;
import activetech.edpc.pojo.dto.VHemsJyjgHzCustomJson;
import activetech.edpc.service.SysIntergratingService;
import activetech.external.pojo.domain.VHemsJyjg;

/**
 * 系统对接action
 * 路径下请求不过权限
 * @author wuh
 *
 */
@Controller
@RequestMapping("/sysIntergrating")
public class SysIntergratingAction {
	
	@Autowired
	private SysIntergratingService sysIntergratingService;
	
	
	@RequestMapping("/receiveVHemsJyjgHz")
	@ResponseBody
	public String receiveVHemsJyjgHz(@RequestBody VHemsJyjgHzCustomJson vHemsJyjgList){
		List<VHemsJyjgHzCustom> list = vHemsJyjgList.getvHemsJyjgList();
		for (VHemsJyjgHzCustom vHemsJyjgHzCustom : list) {
			sysIntergratingService.JyjgIntergrat(vHemsJyjgHzCustom);
		}
		return "0|success";
		
	}
	
	@RequestMapping("/receiveVHemsJyjg")
	@ResponseBody
	public String receiveVHemsJyjg(@RequestBody VHemsJyjgs vHemsJyjgs){
		List<VHemsJyjg> list = vHemsJyjgs.getJyjgList();
		for (VHemsJyjg vHemsJyjg : list) {
			sysIntergratingService.JyjgIntergratSt(vHemsJyjg);
		}
		return "0|success";
		
	}
	
	@RequestMapping("/receiveVHemsJcjgHz")
	@ResponseBody
	public String receiveVHemsJcjgHz(@RequestBody VHemsJcjgHzCustomJson vHemsJcjgHzCustomJson){
		sysIntergratingService.JcjgIntergrat(vHemsJcjgHzCustomJson.getvHemsJcjg());
		return "0|success";
	}
	
	@RequestMapping("/receiveEcgXml")
	@ResponseBody
	public String receiveEcgXml(HttpServletRequest request){
		try {
			ServletInputStream inputStream = request.getInputStream();
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			byte[] rs = new byte[1024];
			int len = 0;
            byte[] req = null;
            while ((len = inputStream.read(rs)) != -1) {
                outputStream.write(rs, 0, len);
                req = outputStream.toByteArray();
            }
            String result = new String(req, "UTF-8");
            System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
		}
		
		return "11";
	}
	
}
