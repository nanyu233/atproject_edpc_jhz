package activetech.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import activetech.base.core.DatabaseContextHolder;

import java.lang.reflect.Method;


@Aspect
@Component
public class HandlerDataSourceAop {
	
	private static Logger logger = Logger.getLogger(HandlerDataSourceAop.class);
	
	/**
	 * @within 匹配类上的注解
	 * @annotation 匹配方法上的注解
	 */
	@Pointcut("@within(activetech.aop.DynamicRoutingDataSource)||@annotation(activetech.aop.DynamicRoutingDataSource)")
	public void pointcut(){}
	
	@Before(value = "pointcut()")
	public void beforeOpt(JoinPoint joinPoint) {
		Object target = joinPoint.getTarget();
		Class<?> clazz = target.getClass();
		Method[] methods = clazz.getMethods();
		DynamicRoutingDataSource annotation = null;
		for (Method method : methods) {
			if (joinPoint.getSignature().getName().equals(method.getName())) {
				//先查找方法上的注解，没有的话再去查找类上的注解
				annotation = method.getAnnotation(DynamicRoutingDataSource.class);
				if (annotation == null) {
					annotation = joinPoint.getTarget().getClass().getAnnotation(DynamicRoutingDataSource.class);
					if (annotation == null) {
						return;
					}
				}
			}
		}
		String dataSourceName = annotation.value();
		DatabaseContextHolder.setCustomerType(dataSourceName);
		logger.info("切到" + dataSourceName + "数据库");
	}

	@After(value="pointcut()")
	public void afterOpt(){
		DatabaseContextHolder.clearCustomerType();
		logger.info("切回默认数据库");
	}
	
}
