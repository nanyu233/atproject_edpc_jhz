package activetech.base.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.domain.Dstlog;
import activetech.base.service.LogService;
import activetech.util.IpUtil;
import activetech.util.UUIDBuild;
@Aspect
public class ActiveAspectWgdzbl {
	private static Logger logger = Logger.getLogger(ActiveAspectWgdzbl.class);
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
    @Around("execution(* activetech.zyyhospital.action.ZyyQjsAction.qjscasenoteWg(..)) ")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable { 
    	Object[] argss = pjp.getArgs();
    	HttpServletRequest req = (HttpServletRequest) argss[0];
		Dstlog dstlog = new Dstlog();
        dstlog.setId(UUIDBuild.getUUID());
        dstlog.setOperUrl(req.getRequestURI());
        dstlog.setUsrHost(IpUtil.getClientIp(req));
        dstlog.setCreatedate(new SimpleDateFormat("yyyyMMdd").format(new Date()));
        dstlog.setCreatetime(new SimpleDateFormat("HHmmss").format(new Date()));
        String loginfo = "ip："+IpUtil.getClientIp(req);
        if(argss[5] != null) {
        	loginfo += ",工号："+argss[5].toString();
        	dstlog.setUsrno(argss[5].toString());
        }
        if(argss[4] != null) {
        	loginfo += ",挂号id："+argss[4].toString();
        }
        if(argss[6] != null) {
        	loginfo += ",登录外挂病历标志："+argss[6].toString();
        }
        if(argss[3] != null) {
        	loginfo += ",预检号："+argss[3].toString();
        }
        logger.info(loginfo);
        try {
        	Object rel = pjp.proceed();
        	dstlog.setMemo(rel.toString());
		} catch (Exception e) {
			return "/base/refuse";
		}finally {
			dstlog.setException(loginfo);
	        logService.insertLog(dstlog);
		}
        
        return pjp.proceed();  
    }  
    /** 
     * 抛出异常后通知 ： 在方法抛出异常退出时执行的通知。 
     * @param jp 连接点：程序执行过程中的某一行为，例如，AServiceImpl.barA()的调用或者抛出的异常行为 
     */  
    public void doAfter(JoinPoint jp) {  
       
    }  
}
