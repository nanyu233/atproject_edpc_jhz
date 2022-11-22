package activetech.edpc.action;

import activetech.base.process.context.Config;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.service.QuartzService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 修改定时任务接口,在修改配置时请求接口，立即生效，否则,配置表更新后重启项目生效
 */
@Controller
@RequestMapping("/quartz")
public class QuartzAction {

    @Resource
    private QuartzService quartzService;
    /**
     * triggerName  这里固定修改 随访提醒的触发器
     */
    private static final String TRIGGER_NAME = "followUpControlTrigger";

    /**
     * 改变 spring Quartz 的cron 来改变定时任务时间
     *
     * @param jobCron jobCron  Cron 表达式在线获取 https://cron.qqe2.com/
     * @return activetech.base.process.result.SubmitResultInfo
     * @author chenys
     * @date 2022/11/21 10:51
     */
    @RequestMapping("update")
    @ResponseBody
    public SubmitResultInfo updateQuartzCron(String jobCron) throws ExceptionResultInfo {
        boolean starts = quartzService.updateQuartzCron(TRIGGER_NAME, jobCron);
        ResultInfo resultInfo;
        if (!starts) {
            ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920, new Object[]{TRIGGER_NAME + "任务修改失败"}));
        }
        resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        return ResultUtil.createSubmitResult(resultInfo);
    }
}
