package activetech.websocket.filter;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;

public class WebSocketInterceptorHz extends  HttpSessionHandshakeInterceptor {
	
    @Override  
    public boolean beforeHandshake(ServerHttpRequest request,  
            ServerHttpResponse response, WebSocketHandler wsHandler,  
            Map<String, Object> attributes) throws Exception {  
    	HttpServletRequest servletRequest = ((ServletServerHttpRequest) request).getServletRequest();
    	HttpSession session =servletRequest.getSession();
    	ActiveUser activeUser = (ActiveUser) session.getAttribute(Config.ACTIVEUSER_KEY);
    	if(null == activeUser){
    		ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 106,null));
    	}
        // 解决The extension [x-webkit-deflate-frame] is not supported问题  
        if (request.getHeaders().containsKey("Sec-WebSocket-Extensions")) {  
            request.getHeaders().set("Sec-WebSocket-Extensions",  
                    "permessage-deflate");  
        }  
        return super.beforeHandshake(request, response, wsHandler, attributes);
    }  
  
    @Override  
    public void afterHandshake(ServerHttpRequest request,  
            ServerHttpResponse response, WebSocketHandler wsHandler,  
            Exception ex) {  
        super.afterHandshake(request, response, wsHandler, ex);  
    }  
}
