package activetech.notice.strategy;

import activetech.notice.pojo.NoticeInfo;
import activetech.notice.pojo.NoticeTarget;

public interface NoticeStrategy {

    public void notice(NoticeInfo noticeInfo, NoticeTarget noticeTarget);
}
