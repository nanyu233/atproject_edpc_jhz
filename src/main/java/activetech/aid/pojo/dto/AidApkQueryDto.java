package activetech.aid.pojo.dto;

import activetech.aid.pojo.domain.AidApk;
import activetech.base.pojo.domain.PageCond;

public class AidApkQueryDto extends PageCond {

    private AidApk aidApk;


    public AidApk getAidApk() {
        return aidApk;
    }

    public void setAidApk(AidApk aidApk) {
        this.aidApk = aidApk;
    }
}
