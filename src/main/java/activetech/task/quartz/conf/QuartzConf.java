package activetech.task.quartz.conf;

import activetech.base.dbconfig.ApplicationConfig;
import activetech.edpc.service.QuartzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.Resource;

public class QuartzConf implements InitializingBean {

    private final static Logger logger = LoggerFactory.getLogger(QuartzConf.class);

    @Resource
    private QuartzService quartzService;
    /**
     * 数据库配置 followUpControlTrigger 定时任务的 optKey
     */
    private static final String FOLLOW_CONFIG_KEY = "FOLLOWUP_CRON";
    /**
     * triggerName  这里固定修改 随访提醒的触发器
     */
    private static final String TRIGGER_NAME = "followUpControlTrigger";

    @Override
    public void afterPropertiesSet() throws Exception {
        boolean starts;
        if (ApplicationConfig.getConfig().containsKey(FOLLOW_CONFIG_KEY)) {
            starts = quartzService.updateQuartzCron(TRIGGER_NAME, ApplicationConfig.getConfig().get("FOLLOWUP_CRON"));
            logger.info("任务{}更改{}", TRIGGER_NAME, starts ? "成功" : "失败");
        } else {
            logger.info("{}任务配置 key:{}不存在将使用默认配置", TRIGGER_NAME, FOLLOW_CONFIG_KEY);
        }
    }
}
