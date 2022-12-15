package activetech.websocket.task;

import activetech.edpc.pojo.dto.HspTimDiffHisCustom;
import activetech.edpc.service.XtService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class QualityControlTask {
    private static Logger logger = Logger.getLogger(QualityControlTask.class);
    @Autowired
    private XtService xtService;
    @Scheduled(cron = "0 0 2 1 * ?")
    //@Scheduled(cron = "0 */1 * * * ?")
    public void taskMonth()throws Exception{
        logger.info("------------胸痛质控时间节点月平均，月中位计算--------------");
        //月中位
        xtService.addMedianMonthAndAverageMonth();
    }

    @Scheduled(cron = "0 0 0 25 12 ?")
    //@Scheduled(cron = "0 */1 * * * ?")
    public void taskYear()throws Exception{
        logger.info("------------胸痛质控时间节点年平均，年中位计算--------------");
        //年中位
        xtService.addMedianYearAndAverageYear();
    }

}
