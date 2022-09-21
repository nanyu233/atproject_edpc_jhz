package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspDeathRecord {
    private String deathRecordSeq;

    private String emgSeqDr;

    private Date comeTime;

    private Date deathTime;

    private String causeDeath;

    private Date courseDate;

    private Date createTime;

    private String createDoc;

    private Date updateTime;

    private String updateDoc;

    private String createNam;

    private String updateNam;

    public String getDeathRecordSeq() {
        return deathRecordSeq;
    }

    public void setDeathRecordSeq(String deathRecordSeq) {
        this.deathRecordSeq = deathRecordSeq == null ? null : deathRecordSeq.trim();
    }

    public String getEmgSeqDr() {
        return emgSeqDr;
    }

    public void setEmgSeqDr(String emgSeqDr) {
        this.emgSeqDr = emgSeqDr == null ? null : emgSeqDr.trim();
    }

    public Date getComeTime() {
        return comeTime;
    }

    public void setComeTime(Date comeTime) {
        this.comeTime = comeTime;
    }

    public Date getDeathTime() {
        return deathTime;
    }

    public void setDeathTime(Date deathTime) {
        this.deathTime = deathTime;
    }

    public String getCauseDeath() {
        return causeDeath;
    }

    public void setCauseDeath(String causeDeath) {
        this.causeDeath = causeDeath == null ? null : causeDeath.trim();
    }

    public Date getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(Date courseDate) {
        this.courseDate = courseDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateDoc() {
        return createDoc;
    }

    public void setCreateDoc(String createDoc) {
        this.createDoc = createDoc == null ? null : createDoc.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateDoc() {
        return updateDoc;
    }

    public void setUpdateDoc(String updateDoc) {
        this.updateDoc = updateDoc == null ? null : updateDoc.trim();
    }

    public String getCreateNam() {
        return createNam;
    }

    public void setCreateNam(String createNam) {
        this.createNam = createNam == null ? null : createNam.trim();
    }

    public String getUpdateNam() {
        return updateNam;
    }

    public void setUpdateNam(String updateNam) {
        this.updateNam = updateNam == null ? null : updateNam.trim();
    }
}