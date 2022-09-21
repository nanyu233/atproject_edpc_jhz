package activetech.hospital.pojo.domain;

import java.util.Date;

public class HspHealtheduInf {
    private String eduSeq;

    private String emgSeq;

    private String eduObj;

    private String eduTime;

    private String eduCont;

    private String eduMethod;

    private Date eduDat;

    private String eduRes;

    private String eduOther;

    private String eduItem;

    private Date cratDat;

    private String cratNbr;

    private Date updtDat;

    private String updtNbr;

    public String getEduSeq() {
        return eduSeq;
    }

    public void setEduSeq(String eduSeq) {
        this.eduSeq = eduSeq == null ? null : eduSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getEduObj() {
        return eduObj;
    }

    public void setEduObj(String eduObj) {
        this.eduObj = eduObj == null ? null : eduObj.trim();
    }

    public String getEduTime() {
        return eduTime;
    }

    public void setEduTime(String eduTime) {
        this.eduTime = eduTime == null ? null : eduTime.trim();
    }

    public String getEduCont() {
        return eduCont;
    }

    public void setEduCont(String eduCont) {
        this.eduCont = eduCont == null ? null : eduCont.trim();
    }

    public String getEduMethod() {
        return eduMethod;
    }

    public void setEduMethod(String eduMethod) {
        this.eduMethod = eduMethod == null ? null : eduMethod.trim();
    }

    public Date getEduDat() {
        return eduDat;
    }

    public void setEduDat(Date eduDat) {
        this.eduDat = eduDat;
    }

    public String getEduRes() {
        return eduRes;
    }

    public void setEduRes(String eduRes) {
        this.eduRes = eduRes == null ? null : eduRes.trim();
    }

    public String getEduOther() {
        return eduOther;
    }

    public void setEduOther(String eduOther) {
        this.eduOther = eduOther == null ? null : eduOther.trim();
    }

    public String getEduItem() {
        return eduItem;
    }

    public void setEduItem(String eduItem) {
        this.eduItem = eduItem == null ? null : eduItem.trim();
    }

    public Date getCratDat() {
        return cratDat;
    }

    public void setCratDat(Date cratDat) {
        this.cratDat = cratDat;
    }

    public String getCratNbr() {
        return cratNbr;
    }

    public void setCratNbr(String cratNbr) {
        this.cratNbr = cratNbr == null ? null : cratNbr.trim();
    }

    public Date getUpdtDat() {
        return updtDat;
    }

    public void setUpdtDat(Date updtDat) {
        this.updtDat = updtDat;
    }

    public String getUpdtNbr() {
        return updtNbr;
    }

    public void setUpdtNbr(String updtNbr) {
        this.updtNbr = updtNbr == null ? null : updtNbr.trim();
    }
}