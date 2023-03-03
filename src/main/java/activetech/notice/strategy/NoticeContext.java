package activetech.notice.strategy;

import activetech.notice.pojo.NoticeInfo;
import activetech.notice.pojo.NoticeTarget;

/**
 * TODO
 *
 * @author ROG
 * @description
 * @date 2023/3/1 14:43
 */
public class NoticeContext {

    private NoticeStrategy noticeStrategy;

    public NoticeContext(NoticeStrategy noticeStrategy) {
        this.noticeStrategy = noticeStrategy;
    }

    public void notice(NoticeInfo noticeInfo, NoticeTarget noticeTarget){
        noticeStrategy.notice(noticeInfo,noticeTarget);
    }


}
