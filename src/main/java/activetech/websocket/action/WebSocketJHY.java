package activetech.websocket.action;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.util.JacksonUtil;
import activetech.websocket.task.HzTask;

public class WebSocketJHY extends TextWebSocketHandler{
	
	private static Logger logger = Logger.getLogger(WebSocketJHY.class); 
	
    // 保存所有的连接信息的容器
    private static final Map<String, WebSocketSession> webSocketSessions;

    static {
    	webSocketSessions = new ConcurrentHashMap<String, WebSocketSession>();
    }

	public static Map<String, WebSocketSession> getWebsocketsessions() {
		return webSocketSessions;
	}


	/**
	 * 给单个session 推送消息
	 * @param clientIp
	 * @param map
	 * @throws Exception
	 */
	public static void sendMessageToOneAwaiting(String usrno,Map<String, Object> map) throws Exception {
    	if(webSocketSessions.size() > 0 ){
        	
        	ResultInfo resultInfo =  ResultUtil.createSuccess(Config.MESSAGE, 906,null);
        	resultInfo.setSysdata(map);
        	resultInfo.setMessageCode(333);
		    TextMessage awaitingMsg = new TextMessage(JacksonUtil.obj2Json(resultInfo));
		    
		    
        	WebSocketSession webSocketSession = webSocketSessions.get(usrno);
        	if(null != webSocketSession && webSocketSession.isOpen()){
        		webSocketSession.sendMessage(awaitingMsg);
        	}
        }
    }
	
	
	/**
	 * 给所有连接的客户端推送消息
	 * @param map
	 * @throws Exception
	 */
	public static void sendMessageToAllAwaiting(Map<String, Object> map) throws Exception {
    	if(webSocketSessions.size() > 0 ){
    		// 生成要推送的消息
        	ResultInfo resultInfo =  ResultUtil.createSuccess(Config.MESSAGE, 906,null);
        	resultInfo.setSysdata(map);
		    TextMessage awaitingMsg = new TextMessage(JacksonUtil.obj2Json(resultInfo));
		    
		    Set<String> usrnos = webSocketSessions.keySet();
        	WebSocketSession webSocketSession = null;
        	for (String userno : usrnos) {
        		webSocketSession = webSocketSessions.get(userno);
    			if (webSocketSession.isOpen()) {
    				webSocketSession.sendMessage(awaitingMsg);
    			}
        	}
        }
    }
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		//logger.info("成功建立连接");
		ActiveUser activeUser = (ActiveUser) session.getAttributes().get(Config.ACTIVEUSER_KEY);
		String usrno = activeUser.getUsrno();
		logger.info("webSocket 用户号："+usrno);
		webSocketSessions.put(usrno, session);
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		logger.info("成功接收数据:"+message.getPayload());
		
//		HzTask.setEmgSeq(message.getPayload());
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		if (session.isOpen()) {
            session.close();
        }
        //logger.error("连接出错", exception);
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		//logger.info(session.getId() + "连接已关闭：" + status);
		webSocketSessions.remove(session.getId());
	}
	
	
	

}
