package activetech.hospital.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.hospital.pojo.dto.HspDevSysCustom;
import activetech.hospital.pojo.dto.HspDevdataKmCustom;
import activetech.hospital.service.HspDevdataKmService;
import activetech.hospital.service.HspDeviceService;
import activetech.util.IpUtil;

@Controller
@RequestMapping("/hspDevdataKm")
public class HspDevdataKmAction {
	
	@Autowired
	private HspDeviceService hspDeviceService;
	@Autowired
	private HspDevdataKmService hspdevdataKmService;
	
	
	@ResponseBody
	@RequestMapping("setEmgSeq")
	public Map<String, Object> setEmgSeq(String emgSeq,HttpServletRequest request) throws Exception{
		String ipaddr = IpUtil.getClientIp(request);
		Map<String, Object> result = new HashMap<String, Object>();
		HspDevSysCustom hspDevSysCustom = new HspDevSysCustom();
		hspDevSysCustom.setDevtypCod("1");
		hspDevSysCustom.setIpaddr(ipaddr);
		HspDevSysCustom hSysCustom = null;
		//根据IP地址和监护仪类型 获取设备唯一号 床号
		hSysCustom =hspDeviceService.findByDevnoAndIpadd(hspDevSysCustom);
		
		if(hSysCustom!=null&&hSysCustom.getDevno()!=null){
			//插入记录
			HspDevdataKmCustom hspDevdataKmCustom = new HspDevdataKmCustom();
			hspDevdataKmCustom.setDevno(Integer.valueOf(hSysCustom.getDevno()));
			hspDevdataKmCustom.setEmgSeq(emgSeq);
			//根据预检号查询HSP_DEVDATA_KM 是否存在数据，若不存在，则先清空HSP_DEVDATA_KM_Temp临时表数据，再插入HSP_DEVDATA_KM
			if(hspdevdataKmService.selectHspDevdataKmCustomList(hspDevdataKmCustom).size()<1){
				hspDevdataKmCustom.setCrtDat(new Date());
				int i =hspdevdataKmService.insertSelective(hspDevdataKmCustom);
				if(i>0){
					result.put("flag", "success");
					result.put("msg", "开始记录记录监护仪数据,请开始进行血压测量！");
					
				}else{
					result.put("flag", "error");
					result.put("msg", "插入数据库失败");
				}
				
			}else{
				hspDevdataKmCustom.setCrtDat(new Date());
				//更新该数据时间
				hspdevdataKmService.updateCrtDat(hspDevdataKmCustom);
				result.put("flag", "success");
				result.put("msg", "重新开始获取监护数据");
			}
			
		}else{
			result.put("flag", "error");
			result.put("msg", "未找到相关设备，请到设备管理进行配置");
		}
		return result;
		
	}
	@ResponseBody
	@RequestMapping("getSmtz")
	public HspDevdataKmCustom getSmtz(String emgSeq) throws Exception{
		
		Map<String, Object> result = new HashMap<String, Object>();
		HspDevdataKmCustom hspDevdataKmCustom =	new HspDevdataKmCustom();
		hspDevdataKmCustom.setEmgSeq(emgSeq);
		List<HspDevdataKmCustom> hspDevdataKmCustomsList =hspdevdataKmService.selectHspDevdataKmCustomList(hspDevdataKmCustom);
		if(hspDevdataKmCustomsList.size()==1)
			return hspDevdataKmCustomsList.get(0);
		else
			return null;
	}
	
	

}
