package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspDbzlBas;

public class HspDbzlBasCustom extends HspDbzlBas {

    //发病时间
    private String fbsj;

    //首次医疗接触时间
    private String scyljcsj;

    //心内诊断
    private String cbzd;
    //病情评估
    private String bqpg;
    //病情评估明细
    private String bqpgmx;
    //lillip 心功能分级
    private String killip;
    //心率
    private String xinl;
    //血压
    private String xuey;
    //年龄类型
    private String cstAgeCodInf;
    //诊断医生
    private String zdys;

    private String mpi;

    public String getMpi() {
        return mpi;
    }

    public void setMpi(String mpi) {
        this.mpi = mpi;
    }


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

    public String getBqpg() {
        return bqpg;
    }

    public void setBqpg(String bqpg) {
        this.bqpg = bqpg;
    }

    public String getBqpgmx() {
        return bqpgmx;
    }

    public void setBqpgmx(String bqpgmx) {
        this.bqpgmx = bqpgmx;
    }

    public String getKillip() {
        return killip;
    }

    public void setKillip(String killip) {
        this.killip = killip;
    }

    public String getXinl() {
        return xinl;
    }

    public void setXinl(String xinl) {
        this.xinl = xinl;
    }

    public String getXuey() {
        return xuey;
    }

    public void setXuey(String xuey) {
        this.xuey = xuey;
    }

    public String getCstAgeCodInf() {
        return cstAgeCodInf;
    }

    public void setCstAgeCodInf(String cstAgeCodInf) {
        this.cstAgeCodInf = cstAgeCodInf;
    }

    public String getZdys() {
        return zdys;
    }

    public void setZdys(String zdys) {
        this.zdys = zdys;
    }
}
