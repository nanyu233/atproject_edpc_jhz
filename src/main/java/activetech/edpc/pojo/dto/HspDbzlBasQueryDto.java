package activetech.edpc.pojo.dto;

import activetech.base.pojo.domain.PageCond;

import java.util.Date;

public class HspDbzlBasQueryDto extends PageCond {

    private HspDbzlBasCustom hspDbzlBasCustom;

    public HspDbzlBasCustom getHspDbzlBasCustom() {
        return hspDbzlBasCustom;
    }

    public void setHspDbzlBasCustom(HspDbzlBasCustom hspDbzlBasCustom) {
        this.hspDbzlBasCustom = hspDbzlBasCustom;
    }
//开始时间

    private Date startDate;
    //结束时间

    private Date endDate;
    //初步诊断

    private String cbzd;
    //到院方式

    private String dyfs;
    //出车单位

    private String ccdw;
    //院前溶栓场所

    private	String yqrscs;
    //院前溶栓治疗

    private String yqrszl;
    //诊断

    private String zd;
    //诊断医生

    private String zdys;
    //患者类型
    private String patTyp;

    //患者姓名
    private String cstNam;

    //注册序号
    private String regSeq;

    //预检号
    private String emgSeq;


    public String getPatTyp() {
        return patTyp;
    }

    public void setPatTyp(String patTyp) {
        this.patTyp = patTyp;
    }



    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCbzd() {
        return cbzd;
    }

    public void setCbzd(String cbzd) {
        this.cbzd = cbzd;
    }

    public String getDyfs() {
        return dyfs;
    }

    public void setDyfs(String dyfs) {
        this.dyfs = dyfs;
    }

    public String getCcdw() {
        return ccdw;
    }

    public void setCcdw(String ccdw) {
        this.ccdw = ccdw;
    }

    public String getYqrscs() {
        return yqrscs;
    }

    public void setYqrscs(String yqrscs) {
        this.yqrscs = yqrscs;
    }

    public String getYqrszl() {
        return yqrszl;
    }

    public void setYqrszl(String yqrszl) {
        this.yqrszl = yqrszl;
    }

    public String getZd() {
        return zd;
    }

    public void setZd(String zd) {
        this.zd = zd;
    }

    public String getZdys() {
        return zdys;
    }

    public void setZdys(String zdys) {
        this.zdys = zdys;
    }

    public String getCstNam() {
        return cstNam;
    }

    public void setCstNam(String cstNam) {
        this.cstNam = cstNam;
    }

    public String getRegSeq() {
        return regSeq;
    }

    public void setRegSeq(String regSeq) {
        this.regSeq = regSeq;
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq;
    }
}
