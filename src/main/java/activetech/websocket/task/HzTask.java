package activetech.websocket.task;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import activetech.basehis.service.OracleHisService;
import activetech.external.pojo.dto.HspMdyDatCustom;
import activetech.websocket.action.WebSocketJHY;
import activetech.websocket.action.WebSocketHz;

@Component
public class HzTask {
//	@Autowired
//	private WebSocketHz webSocketHz;
//	@Autowired
//	private OracleHisService oracleHisService;
//	
//	private static String emgSeq;
//	
//	public static void setEmgSeq(String emgSeq) {
//		HzTask.emgSeq = emgSeq;
//	}
//	
////    @Scheduled(cron = "0 0/1 * * * ?")
//    public void taskEmergency() throws Exception {
//    	/*System.out.println("--------------taskEmergency定时任务开始---------------");
//    	Map<String, Object> map = oracleHisService.findEmergencyOuttime("emergencyList");
//    	webSocketHz.sendMessageToAllAwaiting(map);*/
//    }
//	
////    @Scheduled(cron = "0 0/10 * * * ?")
//    public void taskSlow() throws Exception {
//    	System.out.println("--------------taskSlow定时任务开始---------------");
//    	Map<String, Object> map = oracleHisService.findEmergencyOuttime("slowList");
//    	webSocketHz.sendMessageToAllAwaiting(map);
//    }
//    
////    @Scheduled(cron = "0/10 * * * * ?")
//    public void getJHYData() throws Exception{
//		
//    	Map<String, Object> map = new HashMap<>();
//    	
//    	HspMdyDatCustom hmd = new HspMdyDatCustom();
//    	
//    	hmd.setEmgSeq(emgSeq);
//    	//舒张压
//    	hmd.setNibpDia((short) (Math.random()*40+60));
//    	//中间值
//    	hmd.setNibpMea((short) (Math.random()*50+75));
//    	//收缩压
//    	hmd.setNibpSys((short) (Math.random()*60+90));
//    	//心率|胸贴
//    	hmd.setHrtRtePr((short) (Math.random()*80+60));
//    	//脉率
//    	hmd.setHrtRteHr((short) (Math.random()*80+60));
//    	//血氧饱和度
//    	hmd.setSpo2((short) (Math.random()*4+96));
//    	//呼吸次数
//    	hmd.setResp((short) (Math.random()*12+19));
//    	
//    	map.put("hmd", hmd);
//    	
//    	WebSocketJHY.sendMessageToAllAwaiting(map);
//    }
    
}