package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspNihssInf {
    private String cerebralCourseSeq;

    private String emgSeqDc;

    private String nihssContent;

    private String assessDoc;

    private String assessDate;

    private Date createDate;

    private Date updateDate;

    private String createDoc;

    private String updateDoc;

    private String createNam;

    private String updateNam;

    public String getCerebralCourseSeq() {
        return cerebralCourseSeq;
    }

    public void setCerebralCourseSeq(String cerebralCourseSeq) {
        this.cerebralCourseSeq = cerebralCourseSeq == null ? null : cerebralCourseSeq.trim();
    }

    public String getEmgSeqDc() {
        return emgSeqDc;
    }

    public void setEmgSeqDc(String emgSeqDc) {
        this.emgSeqDc = emgSeqDc == null ? null : emgSeqDc.trim();
    }

    public String getNihssContent() {
        return nihssContent;
    }

    public void setNihssContent(String nihssContent) {
        this.nihssContent = nihssContent == null ? null : nihssContent.trim();
    }

    public String getAssessDoc() {
        return assessDoc;
    }

    public void setAssessDoc(String assessDoc) {
        this.assessDoc = assessDoc == null ? null : assessDoc.trim();
    }

    public String getAssessDate() {
        return assessDate;
    }

    public void setAssessDate(String assessDate) {
        this.assessDate = assessDate == null ? null : assessDate.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateDoc() {
        return createDoc;
    }

    public void setCreateDoc(String createDoc) {
        this.createDoc = createDoc == null ? null : createDoc.trim();
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