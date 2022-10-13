package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspDbzlBas;

public class HspDbzlBasCustom extends HspDbzlBas {

    //发病时间
    private String fbsj;

    //首次医疗接触时间
    private String scyljcsj;

    //心内诊断
    private String cbzd;

    public String getFbsj() {
        return fbsj;
    }

    public void setFbsj(String fbsj) {
        this.fbsj = fbsj;
    }

    public String getScyljcsj() {
        return scyljcsj;
    }

    public void setScyljcsj(String scyljcsj) {
        this.scyljcsj = scyljcsj;
    }

    public String getCbzd() {
        return cbzd;
    }

    public void setCbzd(String cbzd) {
        this.cbzd = cbzd;
    }
}
