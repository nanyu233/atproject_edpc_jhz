package activetech.aid.pojo.dto;

import activetech.aid.pojo.domain.AidApk;

public class AidApkCustom extends AidApk {

    private String crtUsrName;

    public String getCrtUsrName() {
        return crtUsrName;
    }

    public void setCrtUsrName(String crtUsrName) {
        this.crtUsrName = crtUsrName;
    }
}
