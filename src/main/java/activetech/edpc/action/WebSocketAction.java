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
import activetech.edpc.dao.mapper.HspCzzlInfMapperCustom;
import activetech.edpc.dao.mapper.HspFlowChartInfMapperCustom;
import activetech.edpc.dao.mapper.HspXtzlInfCustomMapper;
import activetech.edpc.pojo.domain.HspCzzlInf;
import activetech.edpc.pojo.domain.HspFlowChartInf;
import activetech.edpc.pojo.dto.FlowChartNodeDef;
import activetech.edpc.pojo.dto.HspXtzlInfCustom;
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
	private HspXtzlInfCustomMapper hspXtzlInfCustomMapper;
	
	@Autowired
	private HspCzzlInfMapperCustom hspCzzlInfMapperCustom;
	
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
	    
	    HspXtzlInfCustom hspXtzlInfCustom = new HspXtzlInfCustom();
	    hspXtzlInfCustom.setEmgNo(emgSeq);
	    hspXtzlInfCustom.setCrtUser(activeUser.getUsrno());
	    
	    hspXtzlInfCustom.setProCode(ProCodeDef.YNSFXDTSJ);
	    hspXtzlInfCustom.setProVal(DateUtil.formatDateByFormat(date, DateUtil.DATETIME_FORMAT));
	    hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
		
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
	    
	    
	    HspXtzlInfCustom hspXtzlInfCustom = new HspXtzlInfCustom();
	    hspXtzlInfCustom.setEmgNo(emgSeq);
	    hspXtzlInfCustom.setCrtUser(activeUser.getUsrno());
	    
	    hspXtzlInfCustom.setProCode(ProCodeDef.JGDBBGSJ);
	    hspXtzlInfCustom.setProVal(DateUtil.formatDateByFormat(date, DateUtil.DATETIME_FORMAT));
	    hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
	    
	    
	    
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
	 	HspCzzlInf hspCzzlInf = new HspCzzlInf();
	 	hspCzzlInf.setEmgNo(emgSeq);
	 	hspCzzlInf.setProCode("XHYSJ");
	 	String d = DateUtil.formatDateByFormat(date,"yyyy-MM-dd HH:mm:ss");
	 	hspCzzlInf.setProVal(d);
	 	hspCzzlInf.setCrtUser(activeUser.getUsrno());
	 	hspCzzlInf.setCrtTime(date);
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	      
	    hspCzzlInf.setProCode("HONGXB");
	    hspCzzlInf.setProVal("4.76");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    hspCzzlInf.setProCode("HONGXBFLG");
	    hspCzzlInf.setProVal("0");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("XHDB");
	    hspCzzlInf.setProVal("108");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("XHDBflg");
	    hspCzzlInf.setProVal("0");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("XXBJS");
	    hspCzzlInf.setProVal("215");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("XXBJSFLG");
	    hspCzzlInf.setProVal("0");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("HHBFNXHMSJ");
	    hspCzzlInf.setProVal("57.2");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("HHBFNXHMSJFLG");
	    hspCzzlInf.setProVal("2");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("NXMYSJ");
	    hspCzzlInf.setProVal("11.2");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("NXMYSJFLG");
	    hspCzzlInf.setProVal("0");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("NXMSJ");
	    hspCzzlInf.setProVal("122.5");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("NXMSJFLG");
	    hspCzzlInf.setProVal("2");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("GJBZBZ");
	    hspCzzlInf.setProVal("1.00");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("GJBZBZFLG");
	    hspCzzlInf.setProVal("0");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("DEJT");
	    hspCzzlInf.setProVal("0.14");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("DEJTFLG");
	    hspCzzlInf.setProVal("0");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("PUTT");
	    hspCzzlInf.setProVal("6.9");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("PUTTFLG");
	    hspCzzlInf.setProVal("2");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	     
	    hspCzzlInf.setProCode("XUEJG");
	    hspCzzlInf.setProVal("109");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("XUEJGFLG");
	    hspCzzlInf.setProVal("0");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("GCZAM");
	    hspCzzlInf.setProVal("25");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("GCZAMFLG");
	    hspCzzlInf.setProVal("0");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    hspCzzlInf.setProCode("GBZAM");
	    hspCzzlInf.setProVal("28");
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	      
	    hspCzzlInf.setProCode("GBZAMFLG");
	    hspCzzlInf.setProVal("0");
	    
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    hspCzzlInf.setProCode("XTSJ");
	    hspCzzlInf.setProVal(d);
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    hspCzzlInf.setProCode("XCGSJ");
	    hspCzzlInf.setProVal(d);
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    hspCzzlInf.setProCode("NXGNSJ");
	    hspCzzlInf.setProVal(d);
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    hspCzzlInf.setProCode("GGNSJ");
	    hspCzzlInf.setProVal(d);
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    hspCzzlInf.setProCode("SGNSJ");
	    hspCzzlInf.setProVal(d);
	    
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
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
	 	HspCzzlInf hspCzzlInf = new HspCzzlInf();
	 	hspCzzlInf.setEmgNo(emgSeq);
	 	hspCzzlInf.setCrtUser(activeUser.getUsrno());
	 	hspCzzlInf.setCrtTime(date);
	 	
	 	// 时间
	 	hspCzzlInf.setProCode("YXXJCSJ");
	 	hspCzzlInf.setProVal(DateUtil.formatDateByFormat(date,"yyyy-MM-dd HH:mm:ss"));
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	  
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
	 	HspCzzlInf hspCzzlInf = new HspCzzlInf();
	 	hspCzzlInf.setEmgNo(emgSeq);
	 	hspCzzlInf.setProCode("XDTSJ");
	 	hspCzzlInf.setProVal(DateUtil.formatDateByFormat(date,"yyyy-MM-dd HH:mm:ss"));
	 	hspCzzlInf.setCrtUser(activeUser.getUsrno());
	 	hspCzzlInf.setCrtTime(date);
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
		return null;
	}
	
	
	
	
	
	
	
}
