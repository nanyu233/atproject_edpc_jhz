package activetech.base.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import activetech.base.pojo.domain.Dstlog;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.service.LogService;
import activetech.util.UUIDBuild;
@Aspect
public class ActiveAspect {
	private static Logger logger = Logger.getLogger(ActiveAspect.class);
	@Autowired
	private LogService logService;
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
    @Around("execution(* activetech.hospital.action.SqlAction.addsqlsubmit(..)) "
    		+ "or execution(* activetech.hospital.action.EmgAction.addareasubmit(..))")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable { 
    	String url;
    	String errormsg="";
    	RequestAttributes ra = RequestContextHolder.getRequestAttributes();  
        ServletRequestAttributes sra = (ServletRequestAttributes)ra;  
        HttpServletRequest request = sra.getRequest();
        String host = request.getRemoteHost();
        url=request.getRequestURI();
        HttpSession session = request.getSession();
        ActiveUser activeUser=(ActiveUser)session.getAttribute("activeUser");//session获取数据
        Object retVal=null;
        try{
        	retVal= pjp.proceed();
        }catch (Exception e) {
        	if(e.toString().matches(".*ExceptionResultInfo.*")){
        		errormsg=e.toString();
        	}else{
        		 StringBuffer stringBuffer = new StringBuffer(e.toString() + "\n");  
        	        StackTraceElement[] messages = e.getStackTrace();  
        	        int length = messages.length;  
        	        for (int i = 0; i < length; i++) {  
        	            stringBuffer.append("\t"+messages[i].toString()+"\n");  
        	        }  
        	        //异常信息最多2000字符
        	        errormsg = stringBuffer.toString();
        	}
			throw e;
		}finally{
			 Dstlog dstlog = new Dstlog();
	        dstlog.setComno(activeUser.getSysid());
	        dstlog.setUsrno(activeUser.getUsrno());
	        dstlog.setUsrname(activeUser.getUsrname());
	        dstlog.setId(UUIDBuild.getUUID());
	        dstlog.setOperUrl(url);
	        dstlog.setUsrHost(host);
	        dstlog.setCreatedate(new SimpleDateFormat("yyyyMMdd").format(new Date()));
	        dstlog.setCreatetime(new SimpleDateFormat("HHmmss").format(new Date()));
	        dstlog.setException(errormsg);
	        logger.debug("用户号："+activeUser.getUsrno() + "---请求URL：" + url);
	        logService.insertLog(dstlog);
		}
       
        return retVal;  
    }  
    /** 
     * 抛出异常后通知 ： 在方法抛出异常退出时执行的通知。 
     * @param jp 连接点：程序执行过程中的某一行为，例如，AServiceImpl.barA()的调用或者抛出的异常行为 
     */  
    public void doAfter(JoinPoint jp) {  
       
    }  
}
