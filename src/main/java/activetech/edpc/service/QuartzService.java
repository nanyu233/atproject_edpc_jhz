package activetech.edpc.service;

import java.util.Map;

public interface QuartzService {
    //修改定时任务时间
    Boolean updateQuartzCron(String triggerName, String jobCron);

    //查看定时任务列表
    Map<String, String> gitAllQuartz();
}
