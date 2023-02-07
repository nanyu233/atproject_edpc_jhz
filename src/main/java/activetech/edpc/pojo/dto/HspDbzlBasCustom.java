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

    //患者类型
    private String patTyp;

    //血氧
    private String xueyang;
    //初步印象
    private String cbyx;
    //病人主诉症状
    private String brzszz;
    //胸痛指标内涵
    private String xtzbnh;
    //体温
    private String tiw;
    //血糖
    private String xuet;
    //呼吸频率
    private String huxipl;
    //脉搏
    private String mb;

    public String getMb() {
        return mb;
    }

    public void setMb(String mb) {
        this.mb = mb;
    }

    public String getTiw() {
        return tiw;
    }

    public void setTiw(String tiw) {
        this.tiw = tiw;
    }

    public String getXuet() {
        return xuet;
    }

    public void setXuet(String xuet) {
        this.xuet = xuet;
    }

    public String getHuxipl() {
        return huxipl;
    }

    public void setHuxipl(String huxipl) {
        this.huxipl = huxipl;
    }

    public String getXueyang() {
        return xueyang;
    }

    public void setXueyang(String xueyang) {
        this.xueyang = xueyang;
    }

    public String getCbyx() {
        return cbyx;
    }

    public void setCbyx(String cbyx) {
        this.cbyx = cbyx;
    }

    public String getBrzszz() {
        return brzszz;
    }

    public void setBrzszz(String brzszz) {
        this.brzszz = brzszz;
    }

    public String getXtzbnh() {
        return xtzbnh;
    }

    public void setXtzbnh(String xtzbnh) {
        this.xtzbnh = xtzbnh;
    }

    @Override
    public String getPatTyp() {
        return patTyp;
    }

    @Override
    public void setPatTyp(String patTyp) {
        this.patTyp = patTyp;
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
