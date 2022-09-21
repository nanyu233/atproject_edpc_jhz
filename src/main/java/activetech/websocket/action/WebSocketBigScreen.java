package activetech.websocket.action;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.util.JacksonUtil;
import activetech.websocket.task.BigScreenTask;

public class WebSocketBigScreen extends  TextWebSocketHandler  {
	private static Logger logger = Logger.getLogger(WebSocketBigScreen.class); 
	
    //候诊session
    private static final Map<String, WebSocketSession> awaiting;
    @Autowired
    private BigScreenTask bigScreenTask;

    static {
        awaiting = new ConcurrentHashMap<String, WebSocketSession>();
    }
    
    /**
     * 握手后
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
    	logger.info("成功建立连接");
    	awaiting.put(session.getId(), session);
//    	bigScreenTask.taskBigScreenData();
    }

    /**
     * 接收前端数据
     */
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
    	logger.info("成功接收数据:"+message.getPayload());
    }
    
    /**
     * 连接出错时
     */
    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        if (session.isOpen()) {
            session.close();
        }
        logger.error("连接出错", exception);
    }

    /**
     * 连接关闭时
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		logger.info(session.getId() + "连接已关闭：" + status);
		awaiting.remove(session.getId());
    }
    
    /**
     * 发送某个信息(候诊)
     * @param deptno 科室
     * @param clientIp ip地址
     * @param map 候诊病人数据
     * @return
     * @throws Exception 
     */
    public void sendMessageToOneAwaiting(String clientIp,Map<String, Object> map) throws Exception {
    	if(awaiting != null && awaiting.size() > 0 ){
        	//查询候诊病人
        	ResultInfo resultInfo =  ResultUtil.createSuccess(Config.MESSAGE, 906,null);
        	resultInfo.setSysdata(map);
        	resultInfo.setMessageCode(333);
		    TextMessage awaitingMsg = new TextMessage(JacksonUtil.obj2Json(resultInfo));
        	WebSocketSession awaitingSession = awaiting.get(clientIp);
        	if(null != awaitingSession){
        		awaitingSession.sendMessage(awaitingMsg);
        	}
        }
    }
    
    /**
     * 广播信息(候诊)
     * @param deptno 科室
     * @param clientIp mac地址
     * @param map 候诊病人数据
     * @return
     * @throws Exception 
     */
    public void sendMessageToAllAwaiting(Map<String, Object> map) throws Exception {
    	if(awaiting != null && awaiting.size() > 0 ){
        	//查询候诊病人
        	ResultInfo resultInfo =  ResultUtil.createSuccess(Config.MESSAGE, 906,null);
        	resultInfo.setSysdata(map);
		    TextMessage awaitingMsg = new TextMessage(JacksonUtil.obj2Json(resultInfo));
		    Set<String> usrnos = awaiting.keySet();
        	WebSocketSession awaitingSession = null;
        	for (String userno : usrnos) {
    			awaitingSession = awaiting.get(userno);
    			if (awaitingSession.isOpen()) {
    				awaitingSession.sendMessage(awaitingMsg);
    			}
        	}
        }
    }

	public static Map<String, WebSocketSession> getAwaiting() {
		return awaiting;
	}
    
}