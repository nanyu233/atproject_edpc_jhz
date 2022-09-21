package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

public class HspCerebralCourse {
    private String cerebralCourseSeq;

    private String emgSeqDc;

    private BigDecimal weight;

    private Date cerebralDate;

    private String erectDose;

    private String cerebralInd;

    private String cerebralCont;

    private String assessDoc;

    private String assessDate;

    private Date createDate;

    private Date updateDate;

    private String createDoc;

    private String updateDoc;

    private String cerebralDnt;

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

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Date getCerebralDate() {
        return cerebralDate;
    }

    public void setCerebralDate(Date cerebralDate) {
        this.cerebralDate = cerebralDate;
    }

    public String getErectDose() {
        return erectDose;
    }

    public void setErectDose(String erectDose) {
        this.erectDose = erectDose == null ? null : erectDose.trim();
    }

    public String getCerebralInd() {
        return cerebralInd;
    }

    public void setCerebralInd(String cerebralInd) {
        this.cerebralInd = cerebralInd == null ? null : cerebralInd.trim();
    }

    public String getCerebralCont() {
        return cerebralCont;
    }

    public void setCerebralCont(String cerebralCont) {
        this.cerebralCont = cerebralCont == null ? null : cerebralCont.trim();
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

    public String getCerebralDnt() {
        return cerebralDnt;
    }

    public void setCerebralDnt(String cerebralDnt) {
        this.cerebralDnt = cerebralDnt == null ? null : cerebralDnt.trim();
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