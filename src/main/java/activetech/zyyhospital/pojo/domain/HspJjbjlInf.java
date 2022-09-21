package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspJjbjlInf {
    private String jjbjlSeq;

    private String emgSeq;

    private Date jjbjlDat;

    private String jjbjlType;

    private String jjbjlNum;

    private String jjbjlNam;

    private Date createDat;

    private Date updateDat;

    private String updateNum;

    private String updateNam;

    private String isprint;

    private String jjbjlContent;

    public String getJjbjlSeq() {
        return jjbjlSeq;
    }

    public void setJjbjlSeq(String jjbjlSeq) {
        this.jjbjlSeq = jjbjlSeq == null ? null : jjbjlSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Date getJjbjlDat() {
        return jjbjlDat;
    }

    public void setJjbjlDat(Date jjbjlDat) {
        this.jjbjlDat = jjbjlDat;
    }

    public String getJjbjlType() {
        return jjbjlType;
    }

    public void setJjbjlType(String jjbjlType) {
        this.jjbjlType = jjbjlType == null ? null : jjbjlType.trim();
    }

    public String getJjbjlNum() {
        return jjbjlNum;
    }

    public void setJjbjlNum(String jjbjlNum) {
        this.jjbjlNum = jjbjlNum == null ? null : jjbjlNum.trim();
    }

    public String getJjbjlNam() {
        return jjbjlNam;
    }

    public void setJjbjlNam(String jjbjlNam) {
        this.jjbjlNam = jjbjlNam == null ? null : jjbjlNam.trim();
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

    public String getIsprint() {
        return isprint;
    }

    public void setIsprint(String isprint) {
        this.isprint = isprint == null ? null : isprint.trim();
    }

    public String getJjbjlContent() {
        return jjbjlContent;
    }

    public void setJjbjlContent(String jjbjlContent) {
        this.jjbjlContent = jjbjlContent == null ? null : jjbjlContent.trim();
    }
}