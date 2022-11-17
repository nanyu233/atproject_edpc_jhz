package activetech.task.mq.consumer;

import activetech.websocket.action.WebSocketHz;
import activetech.websocket.action.WebSocketXT;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.util.Map;

/**
 * 供小程序服务器aidServer 调用本系统的websocket使用。
 * 微信端一个操作传递到aidServer,aidServer调用本接口，发送mq message 监听消费message
 * 然后推送webSocket消息到页面
 * implements MessageListener 自动应答
 * implements ChannelAwareMessageListener 处理手动应答
 */
public class AcceptMsgToPageListener implements MessageListener {
    private static final Logger logger = LoggerFactory.getLogger(AcceptMsgToPageListener.class);
    private static final String XT_FLG = "xt";
//    private static final String FIRST_PAGE_FLG = "firstPage";
//    private static final String CZ_FLG = "cz";

    @Override
    public void onMessage(Message message) {
        logger.info("AcceptMsgToPageListener 消费消息:{}", new String(message.getBody()));
        try {
            //直接转换map,给WebSocket,不转实体类了
            Map<String,Object> messageDate  = JSON.parseObject(message.getBody(), Map.class);
            sendMessageToPage(messageDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 本方法接收了aidServer 要推送的消息，要区分aidServer 要推送给哪个页面的webSocket，具体有首页，胸痛中心页，创伤中心页
     * 由targetPage参数区分
     */
    private void sendMessageToPage(Map<String,Object> map) throws Exception {
        if (map.containsKey("targetPage")){
            String targetPage = (String) map.get("targetPage");
            if (XT_FLG.equals(targetPage)) {
                WebSocketXT.sendMessageToAllAwaiting(map);
            } else {
                WebSocketHz.sendMessageToAllAwaiting(map);
            }
        }
    }
}
