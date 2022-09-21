package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspCfjlInf {
    private String cfjlSeq;

    private String emgSeq;

    private Date cfjlDat;

    private String cfjlType;

    private String cfjlNum;

    private String cfjlNam;

    private Date createDat;

    private Date updateDat;

    private String updateNum;

    private String updateNam;

    private String checkNam;

    private String isprint;

    private String cfjlContent;

    public String getCfjlSeq() {
        return cfjlSeq;
    }

    public void setCfjlSeq(String cfjlSeq) {
        this.cfjlSeq = cfjlSeq == null ? null : cfjlSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Date getCfjlDat() {
        return cfjlDat;
    }

    public void setCfjlDat(Date cfjlDat) {
        this.cfjlDat = cfjlDat;
    }

    public String getCfjlType() {
        return cfjlType;
    }

    public void setCfjlType(String cfjlType) {
        this.cfjlType = cfjlType == null ? null : cfjlType.trim();
    }

    public String getCfjlNum() {
        return cfjlNum;
    }

    public void setCfjlNum(String cfjlNum) {
        this.cfjlNum = cfjlNum == null ? null : cfjlNum.trim();
    }

    public String getCfjlNam() {
        return cfjlNam;
    }

    public void setCfjlNam(String cfjlNam) {
        this.cfjlNam = cfjlNam == null ? null : cfjlNam.trim();
    }

    public Date getCreateDat() {
        return createDat;
    }

    public void setCreateDat(Date createDat) {
        this.createDat = createDat;
    }

    public Date getUpdateDat() {
        return updateDat;
    }

    public void setUpdateDat(Date updateDat) {
        this.updateDat = updateDat;
    }

    public String getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(String updateNum) {
        this.updateNum = updateNum == null ? null : updateNum.trim();
    }

    public String getUpdateNam() {
        return updateNam;
    }

    public void setUpdateNam(String updateNam) {
        this.updateNam = updateNam == null ? null : updateNam.trim();
    }

    public String getCheckNam() {
        return checkNam;
    }

    public void setCheckNam(String checkNam) {
        this.checkNam = checkNam == null ? null : checkNam.trim();
    }

    public String getIsprint() {
        return isprint;
    }

    public void setIsprint(String isprint) {
        this.isprint = isprint == null ? null : isprint.trim();
    }

    public String getCfjlContent() {
        return cfjlContent;
    }

    public void setCfjlContent(String cfjlContent) {
        this.cfjlContent = cfjlContent == null ? null : cfjlContent.trim();
    }
}