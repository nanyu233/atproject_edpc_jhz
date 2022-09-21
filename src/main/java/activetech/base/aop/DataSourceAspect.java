package activetech.base.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.core.DatabaseContextHolder;
import activetech.base.core.DynamicDataSource;

public class DataSourceAspect {
	private static Logger logger = Logger.getLogger(DataSourceAspect.class);
	@Autowired
	private DynamicDataSource dynamicDataSource;
	 /** 
     * 前置通知：在某连接点之前执行的通知，但这个通知不能阻止连接点前的执行 
     * @param jp 连接点：程序执行过程中的某一行为，例如，AServiceImpl.barA()的调用或者抛出的异常行为 
     */  
    public void doBefore(JoinPoint jp) {  
    }  
    /** 
     * 环绕通知：包围一个连接点的通知，可以在方法的调用前后完成自定义的行为，也可以选择不执行 
     * 类似Web中Servlet规范中的Filter的doFilter方法。 
     * @param pjp 当前进程中的连接点 
     * @return 
     * @throws Throwable 
     */  
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable { 
    	/*Signature signature = pjp.getSignature();    
        MethodSignature methodSignature = (MethodSignature)signature;    
        Method targetMethod = methodSignature.getMethod();    
        String classname = targetMethod.getDeclaringClass().getName();
        String[] classnames = new String[]{"activetech.hospital.dao.mapper.YjmxkMapper"};
         for (String name : classnames) {
        	 if(classname.equals(name)){
        		 DatabaseContextHolder.setCustomerType("lsrmyy_mssql"); 
        	 }else{
        		 DatabaseContextHolder.setCustomerType("lsrmyy"); 
        	 }
		}*/
        DatabaseContextHolder.setCustomerType("hzszyy_mssql"); 
    	Object retVal = null;
    	try {
    		retVal=pjp.proceed();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("切换数据库失败");
		}finally{
			DatabaseContextHolder.setCustomerType("basedb"); 
		}
        return retVal;  
    }  
    
    public Object doCzAround(ProceedingJoinPoint pjp) throws Throwable { 
        DatabaseContextHolder.setCustomerType("hzszyy_czmssql"); 
    	Object retVal = null;
    	try {
    		retVal=pjp.proceed();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("切换数据库失败");
		}finally{
			DatabaseContextHolder.setCustomerType("basedb"); 
		}
        return retVal;  
    }  
    
    
    /** 
     * 抛出异常后通知 ： 在方法抛出异常退出时执行的通知。 
     * @param jp 连接点：程序执行过程中的某一行为，例如，AServiceImpl.barA()的调用或者抛出的异常行为 
     */  
    public void doAfter(JoinPoint jp) {  
    	DatabaseContextHolder.setCustomerType("basedb"); 
    }  
}
