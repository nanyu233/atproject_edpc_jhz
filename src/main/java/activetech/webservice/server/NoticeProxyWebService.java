package activetech.webservice.server;

import javax.jws.WebService;

/**
 * 供小程序服务器aidServer 调用本系统的websocket使用。
 * 微信端一个操作传递到aidServer,aidServer调用本接口，本接口推送webSocket消息到页面
 * 
 * @author ROG
 *
 */
@WebService
public interface NoticeProxyWebService {
	
	public void notice(PushMessageDto pushMessageDto);

}
