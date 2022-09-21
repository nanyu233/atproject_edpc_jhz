package activetech.base.filter;

import java.lang.reflect.Method;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import activetech.base.annotation.FormToken;
import activetech.base.process.context.Config;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.util.StringUtils;

public class FormTokenInterceptor extends HandlerInterceptorAdapter {

	 @Override  
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {  
		 response.setHeader("Access-Control-Allow-Credentials", "true");
		 response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		 response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		 response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		 if (handler instanceof HandlerMethod) {  
            HandlerMethod handlerMethod = (HandlerMethod) handler;  
            Method method = handlerMethod.getMethod();  
            FormToken annotation = method.getAnnotation(FormToken.class);  
            if (annotation != null) {  
            	String tokenName = annotation.name();
                boolean needSaveSession = annotation.save();  
                if (needSaveSession) {  
                	String uuid = UUID.randomUUID().toString();
                	request.getSession(false).setAttribute(tokenName+"formToken", uuid);  
                    request.getSession(false).setAttribute("formToken", uuid);  
                }  
                boolean needRemoveSession = annotation.remove();  
                if (needRemoveSession) {  
                    if (isRepeatSubmit(request,tokenName)) {  
                    	ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 920, new Object[]{"数据处理中,请勿重复提交"}));
                        return false;  
                    }  
                    request.getSession(false).removeAttribute("formToken");
                    request.getSession(false).removeAttribute(tokenName+"formToken");  
                }  
            }  
            return true;  
        } else {  
            return super.preHandle(request, response, handler);  
        }  
    }  
  
    private boolean isRepeatSubmit(HttpServletRequest request,String tokenName) throws ExceptionResultInfo {  
        String serverToken = (String) request.getSession(false).getAttribute(tokenName+"formToken");  
        if (serverToken == null) {  
            return true;  
        }  
        String clinetToken = request.getParameter("formToken");  
        if (clinetToken == null) {  
        	Cookie[] cookies = request.getCookies();
        	for (Cookie cookie : cookies) {
    			if(("formToken").equals(cookie.getName())){
    				clinetToken = cookie.getValue();
    				cookie.setMaxAge(0);
    				if(!StringUtils.isNotNullAndEmptyByTrim(clinetToken) || "undefined".equals(clinetToken)) {
    					return true;  
    				}
    			}
    		}
        }  
        if (!serverToken.equals(clinetToken)) {
            return true;  
        }  
        return false;  
    }  
	
}
