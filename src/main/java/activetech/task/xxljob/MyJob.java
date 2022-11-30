package activetech.task.xxljob;

import com.xxl.job.core.biz.model.TriggerParam;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;

/**
 * 此类一定要注入到spring容器中！！！！！ 在xml配置bin
 * 或者配置扫描包 加上 Component 注解才会生效
 *  @ XxlJob("taskDemoHandler") value的值是
 *  任务调度中心--> 任务管理-->任务详情的JobHandler值
 */
//@Component
public class MyJob {
    @XxlJob("taskDemoHandler")
    public void execute() {
        String param = XxlJobHelper.getJobParam();
        System.out.println("hello_word");
        System.out.println(param + "参数");
        long jobId = XxlJobHelper.getJobId();
        TriggerParam triggerParam=new TriggerParam();
        triggerParam.setJobId((int) jobId);
        XxlJobHelper.handleSuccess("ack hello");
    }
}
