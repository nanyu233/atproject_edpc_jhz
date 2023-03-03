package activetech.notice;

import activetech.notice.pojo.NoticeInfo;
import activetech.notice.pojo.NoticeTarget;
import activetech.notice.pojo.domain.info.NoticeInfo01;
import activetech.notice.pojo.domain.target.Jzys;
import activetech.notice.strategy.NoticeContext;
import activetech.notice.strategy.NoticeStrategy;
import activetech.notice.strategy.impl.DingNoticeStrategy;
import org.simpleframework.xml.strategy.Strategy;

/**
 * TODO
 *
 * @author ROG
 * @description
 * @date 2023/3/1 15:10
 */
public class JgdbTest {
    
    public static void main(String[] args) {

        System.out.println("\"肌钙蛋白结果出来了\" = " + "肌钙蛋白结果出来了");

        String message = "肌钙蛋白结果";

        // 获取推送给钉钉的策略
        NoticeStrategy dingNoticeStrategy = new DingNoticeStrategy();
        NoticeContext noticeContext = new NoticeContext(dingNoticeStrategy);

        NoticeInfo noticeInfo01 = new NoticeInfo01();
        NoticeTarget jzys = new Jzys();
        noticeContext.notice(noticeInfo01,jzys);


    }
}
