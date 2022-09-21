package activetech.base.action.converters;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
/**
 * 
 * <p>Title:UserArgumentResolver</p>
 * <p>Description:用户Session的解析器</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-2-4 下午4:33:02
 *
 */
public class UserArgumentResolver implements WebArgumentResolver {

	/**
	 * methodParameter存储action方法的参数信息
	 * webRequest是springmvc封装对象，通过此对象获取request和session等域的值
	 */
	public Object resolveArgument(MethodParameter methodParameter,
			NativeWebRequest webRequest) throws Exception {		
		//如果参数的类型是activeUser从session中取当前用户信息设置到action方法形参上
		if(methodParameter.getParameterType().equals(ActiveUser.class)){
			//从session中取当前用户信息
			ActiveUser activeUser = (ActiveUser) webRequest.getAttribute(Config.ACTIVEUSER_KEY, WebRequest.SCOPE_SESSION);
			
			return activeUser;//将参数值向action的方法形参赋值
		}
		
		return UNRESOLVED;
	}

}
