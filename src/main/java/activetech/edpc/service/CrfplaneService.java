package activetech.edpc.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ResultInfo;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;

public interface CrfplaneService {
    /**
     * 审核提交(申请, 审核，驳回)
     * @param hspDbzlBasCustom hspDbzlBasCustom
     * @param activeUser activeUser
     * @return return
     * @throws Exception Exception
     */
    ResultInfo reviewSubmit(HspDbzlBasCustom hspDbzlBasCustom, ActiveUser activeUser) throws Exception;

    /**
     * 上报
     * @param hspDbzlBasCustom hspDbzlBasCustom
     * @param activeUser activeUser
     * @return return
     * @throws Exception Exception
     */
    ResultInfo reportSubmit(HspDbzlBasCustom hspDbzlBasCustom, ActiveUser activeUser) throws Exception;

    /**
     * 胸痛上报方法
     * @param regSeq regSeq
     * @return return
     * @throws Exception Exception
     */
    String registerInfoCrfplane(String regSeq) throws Exception;
}
