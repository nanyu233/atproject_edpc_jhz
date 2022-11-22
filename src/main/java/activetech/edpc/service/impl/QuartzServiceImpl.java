package activetech.edpc.service.impl;

import activetech.edpc.service.QuartzService;
import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

public class QuartzServiceImpl implements QuartzService {
    private static final Logger logger = LoggerFactory.getLogger(QuartzServiceImpl.class);
    @Resource
    private SchedulerFactoryBean schedulerFactoryBean;

    @Override
    public Boolean updateQuartzCron(String triggerName, String jobCron) {
        try {
            return updateQuartzTrigger(triggerName, jobCron);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Map<String, String> gitAllQuartz() {
        Scheduler scheduler = schedulerFactoryBean.getScheduler();
        Map<String, String> map = new HashMap<>();
        try {
            //获取定时任务工作组
            for (String groupName : scheduler.getJobGroupNames()) {
                //获取工作组里的  triggerKey
                for (TriggerKey triggerKey : scheduler.getTriggerKeys(GroupMatcher.triggerGroupEquals(groupName))) {
                    map.put(triggerKey.getName(), triggerKey.getGroup());
                }
            }
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 修改目标触发器的 cron 表达式
     *
     * @param triggerName triggerName
     * @param cron        cron
     * @return java.lang.Boolean
     * @throws Exception exception
     * @author chenys
     * @date 2022/11/21 16:58
     */
    public Boolean updateQuartzTrigger(String triggerName, String cron) throws Exception {
        Scheduler scheduler = schedulerFactoryBean.getScheduler();
        TriggerKey triggerKey = TriggerKey.triggerKey(triggerName, Scheduler.DEFAULT_GROUP);
        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
        if (trigger == null) {
            return false;
        }
        //旧的cron表达式
        String oldTime = trigger.getCronExpression();
        if (!oldTime.equalsIgnoreCase(cron)) {
            // 触发器
            TriggerBuilder<Trigger> triggerBuilder = TriggerBuilder.newTrigger();
            // 触发器名,触发器组 （默认的组）
            triggerBuilder.withIdentity(triggerName, Scheduler.DEFAULT_GROUP);
            triggerBuilder.startNow();
            // 触发器时间设定
            triggerBuilder.withSchedule(CronScheduleBuilder.cronSchedule(cron));
            // 创建Trigger对象
            trigger = (CronTrigger) triggerBuilder.build();
            // 修改一个任务的触发时间 原理删除就的触发器绑定一个作业相同的新触发器
            scheduler.rescheduleJob(triggerKey, trigger);
            logger.info("任务[---{}---]更新成功", triggerKey.getName());
        }
        return true;
    }
}
