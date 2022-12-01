package activetech.task.xxljob;

import activetech.edpc.dao.mapper.HspFuvPlnMapper;
import activetech.edpc.dao.mapper.HspFuvPlnMapperCustom;
import activetech.edpc.pojo.domain.HspFuvPln;
import activetech.edpc.pojo.dto.HspFuvPlnCustom;
import activetech.edpc.pojo.dto.HspFuvPlnQueryDto;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 定时查询随访到期的人，给创建随访人发提醒
 */
@Component
public class FuvPlnJobHandler {

    private static final Logger logger = LoggerFactory.getLogger(FuvPlnJobHandler.class);
    @Resource
    private HspFuvPlnMapperCustom hspFuvPlnMapperCustom;
    @Resource
    private HspFuvPlnMapper hspFuvPlnMapper;
    public static HspFuvPlnQueryDto hspFuvPlnQueryDtoOne;
    public static HspFuvPlnQueryDto hspFuvPlnQueryDtoTwo;
    /**
     * 1
     */
    public static final String ONE = "1";
    /**
     * 未到期 0
     */
    public static final String PAT_STA_ZERO = "0";
    /**
     * 已提醒状态 1
     */
    public static final String PAT_STA_ONE = "1";
    /**
     * 已到期状态 2
     */
    public static final String PAT_STA_TWO = "2";


    //初始化静态查询条件
    static {
        hspFuvPlnQueryDtoOne = new HspFuvPlnQueryDto();
        hspFuvPlnQueryDtoOne.setBeforeWarnTim(ONE);
        hspFuvPlnQueryDtoOne.setPlnSta(PAT_STA_ZERO);

        hspFuvPlnQueryDtoTwo = new HspFuvPlnQueryDto();
        hspFuvPlnQueryDtoTwo.setPlnSta(PAT_STA_ONE);
        hspFuvPlnQueryDtoTwo.setExpireTim(ONE);
    }

    /**
     * 注册 xxl-job Handler
     * 任务中心调度执行
     */
    @XxlJob("fuvPlnJobHandler")
    public void execute() {
        logger.info("开始任务");
        //查询需要提醒的列表
        List<HspFuvPlnCustom> resList = hspFuvPlnMapperCustom.selectReminderDue(hspFuvPlnQueryDtoOne);
        //查询已过期的列表
        List<HspFuvPlnCustom> expireList = hspFuvPlnMapperCustom.selectReminderDue(hspFuvPlnQueryDtoTwo);
        //FIXME 批量发送ai短信和电话 待后续补充-----
        logger.info("发送ai通知");
        //修改提醒状态 用查询到的集合修改状态
        changeFuvSta(resList, PAT_STA_ONE);
        //对已过期的列表修改状态为已过期
        changeFuvSta(expireList, PAT_STA_TWO);
        logger.info("修改状态成功");
    }

    /**
     * 批量修改状态
     *
     * @param resList resList
     * @param plnSta  plnSta
     */
    private void changeFuvSta(List<HspFuvPlnCustom> resList, String plnSta) {
        resList.forEach(hspFuvPlnCustom -> {
            HspFuvPln hspFuvPln = new HspFuvPln();
            hspFuvPln.setPlnSeq(hspFuvPlnCustom.getPlnSeq());
            hspFuvPln.setPlnSta(plnSta);
            hspFuvPlnMapper.updateByPrimaryKeySelective(hspFuvPln);
        });
    }
}
