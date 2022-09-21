package activetech.webservice.server;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import activetech.websocket.action.WebSocketHz;
import activetech.websocket.action.WebSocketXT;

@WebService
public class NoticeProxyWebServiceImpl implements NoticeProxyWebService{
	

	@Override
	public void notice(PushMessageDto pushMessageDto) {
		// webService 传递map类型的有难度
		/**
		 * 本方法接收了aidServer 要推送的消息，要区分aidServer 要推送给哪个页面的webSocket，具体有首页，胸痛中心页，创伤中心页
		 * 由targetPage参数区分
		 */
		try {
			
			Map<String,Object> map = new HashMap<>();
			map.put("emgSeq", pushMessageDto.getEmgSeq());
			map.put("greenNodeId", pushMessageDto.getGreenNodeId());
			map.put("status", pushMessageDto.getStatus());
			map.put("time", pushMessageDto.getTime());
			map.put("messageCode",pushMessageDto.getMessageCode());
			map.put("message",pushMessageDto.getMessage());
			
			if("xt".equals(pushMessageDto.getTargetPage())) {
				WebSocketXT.sendMessageToAllAwaiting(map);
			}else if("firstPage".equals(pushMessageDto.getTargetPage())) {
				WebSocketHz.sendMessageToAllAwaiting(map);
			}else if("cz".equals(pushMessageDto.getTargetPage())) {
				WebSocketHz.sendMessageToAllAwaiting(map);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
