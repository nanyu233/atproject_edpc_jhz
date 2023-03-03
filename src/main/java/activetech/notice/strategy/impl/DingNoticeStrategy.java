package activetech.notice.strategy.impl;

import activetech.notice.pojo.NoticeInfo;
import activetech.notice.pojo.NoticeTarget;
import activetech.notice.strategy.NoticeStrategy;

/**
 * TODO
 *
 * @author ROG
 * @description
 * @date 2023/3/1 14:27
 */

/**
 * 实现钉钉通知
 */
public class DingNoticeStrategy implements NoticeStrategy {


    @Override
    public void notice(NoticeInfo noticeInfo, NoticeTarget noticeTarget) {
        // 直接调用钉钉接口
    }
}
