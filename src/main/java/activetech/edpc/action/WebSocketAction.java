package activetech.edpc.action;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.edpc.dao.mapper.HspFlowChartInfMapperCustom;
import activetech.edpc.dao.mapper.HspZlInfCustomMapper;
import activetech.edpc.pojo.domain.HspZlInf;
import activetech.edpc.pojo.domain.HspFlowChartInf;
import activetech.edpc.pojo.dto.FlowChartNodeDef;
import activetech.edpc.pojo.dto.HspZlInfCustom;
import activetech.edpc.pojo.dto.ProCodeDef;
import activetech.util.DateUtil;
import activetech.websocket.action.WebSocketXT;

/**
 * 
 * @author ROG
 * 模拟发送webSocket通知
 */
@Controller
@RequestMapping("/testWebSocket")
public class WebSocketAction {
	
	@Autowired
	private HspFlowChartInfMapperCustom hspFlowChartInfMapperCustom;
	
	@Autowired
	private HspZlInfCustomMapper hspZlInfCustomMapper;
	
	
	/**
	 *   模拟通知胸痛心电图完成
	 * @throws Exception
	 */
	@RequestMapping("/noticeEcgComplete")
	@ResponseBody
	public String noticeEcgComplete(ActiveUser activeUser,@RequestBody(required=false) Map<String, Object> paraMap) throws Exception{
		
		
		String emgSeq = "";
		if(paraMap.containsKey("emgSeq")){
			emgSeq = (String) paraMap.get("emgSeq");
		}
		Date date = new Date();
		Map<String,Object> map = new HashMap<>();
		map.put("targetPage", "xt");
	    map.put("emgSeq", emgSeq);
	    map.put("greenNodeId", FlowChartNodeDef.XDT);
	    map.put("time", date);
	    // map.put("messageCode","xdt");
	    // 提取webSocket句柄，发送给所有的客户端
	    WebSocketXT.sendMessageToAllAwaiting(map);
	    
	    HspFlowChartInf record = new HspFlowChartInf();
	    record.setEmgSeq(emgSeq);
	    record.setNodeId(FlowChartNodeDef.XDT);
	    record.setStatus("1");
	    record.setFlowType("xt");
	    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
	    
	    HspZlInfCustom hspZlInfCustom = new HspZlInfCustom();
	    hspZlInfCustom.setEmgNo(emgSeq);
	    hspZlInfCustom.setCrtUser(activeUser.getUsrno());
	    
	    hspZlInfCustom.setProCode(ProCodeDef.YNSFXDTSJ);
	    hspZlInfCustom.setProVal(DateUtil.formatDateByFormat(date, DateUtil.DATETIME_FORMAT));
	    hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
		
		return null;
	}
	
	
	
	/**
	   *   模拟通知血化验完成,当检测到该急诊病人的检验检疫信息时，推送该消息给前端。
	   *   暂时不推送，小程序webSocket不稳定
	 * @throws Exception
	 */
	@RequestMapping("/noticeCheckComplete")
	@ResponseBody
	public String noticeCheckComplete(ActiveUser activeUser,@RequestBody(required=false) Map<String, Object> paraMap) throws Exception{
		String emgSeq = "";
		if(paraMap.containsKey("emgSeq")){
			emgSeq = (String) paraMap.get("emgSeq");
		}
		
		Date date = new Date();
		
		Map<String,Object> map = new HashMap<>();
		map.put("emgSeq", emgSeq);
		map.put("targetPage", "xt");
	    map.put("greenNodeId", FlowChartNodeDef.SYSJC);
	    map.put("time", date);

	    WebSocketXT.sendMessageToAllAwaiting(map);
	    
	    HspFlowChartInf record = new HspFlowChartInf();
	    record.setEmgSeq(emgSeq);
	    record.setNodeId(FlowChartNodeDef.SYSJC);
	    record.setStatus("1");
	    record.setFlowType("xt");
	    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);	
	    
	    
	    HspZlInfCustom hspZlInfCustom = new HspZlInfCustom();
	    hspZlInfCustom.setEmgNo(emgSeq);
	    hspZlInfCustom.setCrtUser(activeUser.getUsrno());
	    
	    hspZlInfCustom.setProCode(ProCodeDef.JGDBBGSJ);
	    hspZlInfCustom.setProVal(DateUtil.formatDateByFormat(date, DateUtil.DATETIME_FORMAT));
	    hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
	    
	    
	    
	    /*
	    HspXtzlInfCustom hspXtzlInfCustom = new HspXtzlInfCustom();
	    hspXtzlInfCustom.setEmgNo(emgSeq);
	    hspXtzlInfCustom.setCrtUser(activeUser.getUsrno());
	    
	    hspXtzlInfCustom.setProCode("CTNIBGSJ");
	    hspXtzlInfCustom.setProVal(DateUtil.getCurrentTime());
	    hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
	    
	    hspXtzlInfCustom.setProCode("CTNICXSJ");
	    // 获取当前时间3分钟前的时间
	    //Timestamp temp = new Timestamp(System.currentTimeMillis()-3*60*1000);
	    Timestamp temp = new Timestamp(System.currentTimeMillis());
	    hspXtzlInfCustom.setProVal(temp.toString().substring(0, 19));
	    
	    hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
	    
	    hspXtzlInfCustom.setProCode("CTNISZ");
	    hspXtzlInfCustom.setProVal("6");
	    hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
	    
	    hspXtzlInfCustom.setProCode("CTNIDW");
	    hspXtzlInfCustom.setProVal("ng/ml");
	    hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
	    
	    hspXtzlInfCustom.setProCode("XQJGZ");
	    hspXtzlInfCustom.setProVal("98");
	    hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
	    
	    hspXtzlInfCustom.setProCode("XQJGDW");
	    hspXtzlInfCustom.setProVal("μmol/L");
	    hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
	    
	    hspXtzlInfCustom.setProCode("DEJTJGSJ");
	    hspXtzlInfCustom.setProVal(DateUtil.getCurrentTime());
	    hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
	    
	    hspXtzlInfCustom.setProCode("BNPJCJGSJ");
	    hspXtzlInfCustom.setProVal(DateUtil.getCurrentTime());
	    hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
	    
		*/
		/*
		WebServiceDto webServiceDto = new WebServiceDto();
		webServiceDto.setEmgSeq(emgSeq);
		webServiceDto.setCode("2");
		webServiceDto.setMessage("血化验完成");
		webServiceDto.setDate(DateUtil.getCurrentTime());
		WebServiceClient.notice(webServiceDto);
		*/
		
		return null;
	}
	
	
	
	/**
	 * 模拟通知卒中血化验完成
	 * @throws Exception
	 */
	@RequestMapping("/noticeCZxhyComplete")
	@ResponseBody
	public String noticeCZxhyComplete(ActiveUser activeUser,@RequestBody(required=false) Map<String, Object> paraMap) throws Exception{
		
		String emgSeq = "";
		if(paraMap.containsKey("emgSeq")){
			emgSeq = (String) paraMap.get("emgSeq");
		}
		Date date = new Date();
		
    
		//1  更新节点记录表
	    HspFlowChartInf record = new HspFlowChartInf();
	    record.setEmgSeq(emgSeq);
	    record.setNodeId("xhy");
	    record.setFlowType("cz");
	    record.setStatus("1");
	    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
	    
	    //2  提取webSocket句柄，发送给所有的客户端
	    Map<String,Object> map = new HashMap<>();
	    map.put("targetPage", "cz");
	    map.put("emgSeq", emgSeq);	    
	    map.put("message", "血化验完成");
	    map.put("messageCode","xhy");
	    map.put("time", date);
	 	WebSocketXT.sendMessageToAllAwaiting(map);
	    
	    
	    //3  持久到卒中信息表
	 	HspZlInf hspZlInf = new HspZlInf();
	 	hspZlInf.setEmgNo(emgSeq);
	 	hspZlInf.setProCode("XHYSJ");
	 	String d = DateUtil.formatDateByFormat(date,"yyyy-MM-dd HH:mm:ss");
	 	hspZlInf.setProVal(d);
	 	hspZlInf.setCrtUser(activeUser.getUsrno());
	 	hspZlInf.setCrtTime(date);
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	      
	    hspZlInf.setProCode("HONGXB");
	    hspZlInf.setProVal("4.76");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    hspZlInf.setProCode("HONGXBFLG");
	    hspZlInf.setProVal("0");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("XHDB");
	    hspZlInf.setProVal("108");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("XHDBflg");
	    hspZlInf.setProVal("0");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("XXBJS");
	    hspZlInf.setProVal("215");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("XXBJSFLG");
	    hspZlInf.setProVal("0");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("HHBFNXHMSJ");
	    hspZlInf.setProVal("57.2");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("HHBFNXHMSJFLG");
	    hspZlInf.setProVal("2");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("NXMYSJ");
	    hspZlInf.setProVal("11.2");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("NXMYSJFLG");
	    hspZlInf.setProVal("0");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("NXMSJ");
	    hspZlInf.setProVal("122.5");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("NXMSJFLG");
	    hspZlInf.setProVal("2");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("GJBZBZ");
	    hspZlInf.setProVal("1.00");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("GJBZBZFLG");
	    hspZlInf.setProVal("0");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("DEJT");
	    hspZlInf.setProVal("0.14");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("DEJTFLG");
	    hspZlInf.setProVal("0");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("PUTT");
	    hspZlInf.setProVal("6.9");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("PUTTFLG");
	    hspZlInf.setProVal("2");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	     
	    hspZlInf.setProCode("XUEJG");
	    hspZlInf.setProVal("109");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("XUEJGFLG");
	    hspZlInf.setProVal("0");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("GCZAM");
	    hspZlInf.setProVal("25");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("GCZAMFLG");
	    hspZlInf.setProVal("0");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	    hspZlInf.setProCode("GBZAM");
	    hspZlInf.setProVal("28");
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	      
	    hspZlInf.setProCode("GBZAMFLG");
	    hspZlInf.setProVal("0");
	    
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    hspZlInf.setProCode("XTSJ");
	    hspZlInf.setProVal(d);
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    hspZlInf.setProCode("XCGSJ");
	    hspZlInf.setProVal(d);
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    hspZlInf.setProCode("NXGNSJ");
	    hspZlInf.setProVal(d);
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    hspZlInf.setProCode("GGNSJ");
	    hspZlInf.setProVal(d);
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    hspZlInf.setProCode("SGNSJ");
	    hspZlInf.setProVal(d);
	    
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
		return null;
	}
	
	
	/**
	 * 模拟通知卒中头颅CT完成
	 * @throws Exception
	 */
	@RequestMapping("/noticeCZtlCTComplete")
	@ResponseBody
	public String noticeCZtlCTComplete(ActiveUser activeUser,@RequestBody(required=false) Map<String, Object> paraMap) throws Exception{
		
		String emgSeq = "";
		if(paraMap.containsKey("emgSeq")){
			emgSeq = (String) paraMap.get("emgSeq");
		}
		Date date = new Date();
		
    
		//1  更新节点记录表
	    HspFlowChartInf record = new HspFlowChartInf();
	    record.setEmgSeq(emgSeq);
	    record.setNodeId("tlCT");
	    record.setFlowType("cz");
	    record.setStatus("1");
	    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
	    
	    //2  提取webSocket句柄，发送给所有的客户端
	    Map<String,Object> map = new HashMap<>();
	    map.put("targetPage", "cz");
	    map.put("emgSeq", emgSeq);	    
	    map.put("message", "头颅CT完成");
	    map.put("messageCode","tlCT");
	    map.put("time", date);
	 	WebSocketXT.sendMessageToAllAwaiting(map);
	    
	    
	    //3  持久到卒中信息表
	 	HspZlInf hspZlInf = new HspZlInf();
	 	hspZlInf.setEmgNo(emgSeq);
	 	hspZlInf.setCrtUser(activeUser.getUsrno());
	 	hspZlInf.setCrtTime(date);
	 	
	 	// 时间
	 	hspZlInf.setProCode("YXXJCSJ");
	 	hspZlInf.setProVal(DateUtil.formatDateByFormat(date,"yyyy-MM-dd HH:mm:ss"));
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
	  
		return null;
	}
	
	
	/**
	 * 模拟通知卒中心电图完成
	 * @throws Exception
	 */
	@RequestMapping("/noticeCZecgComplete")
	@ResponseBody
	public String noticeCZecgComplete(ActiveUser activeUser,@RequestBody(required=false) Map<String, Object> paraMap) throws Exception{
		
		String emgSeq = "";
		if(paraMap.containsKey("emgSeq")){
			emgSeq = (String) paraMap.get("emgSeq");
		}
		Date date = new Date();
		
    
		//1  更新节点记录表
	    HspFlowChartInf record = new HspFlowChartInf();
	    record.setEmgSeq(emgSeq);
	    record.setNodeId("xdt");
	    record.setFlowType("cz");
	    record.setStatus("1");
	    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
	    
	    //2  提取webSocket句柄，发送给所有的客户端
	    Map<String,Object> map = new HashMap<>();
	    map.put("targetPage", "cz");
	    map.put("emgSeq", emgSeq);	    
	    map.put("message", "心电图完成");
	    map.put("messageCode","xdt");
	    map.put("time", date);
	 	WebSocketXT.sendMessageToAllAwaiting(map);
	    
	    
	    //3  持久到卒中信息表
	 	HspZlInf hspZlInf = new HspZlInf();
	 	hspZlInf.setEmgNo(emgSeq);
	 	hspZlInf.setProCode("XDTSJ");
	 	hspZlInf.setProVal(DateUtil.formatDateByFormat(date,"yyyy-MM-dd HH:mm:ss"));
	 	hspZlInf.setCrtUser(activeUser.getUsrno());
	 	hspZlInf.setCrtTime(date);
	    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
	    
		return null;
	}
	
	
	
	
	
	
	
}
