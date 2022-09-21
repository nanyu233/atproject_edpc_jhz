package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspDiseaseCourse {
    private String diseaseCourseSeq;

    private String emgSeqDc;

    private Date courseDate;

    private String diseasePoint;

    private String treatmentPlan;

    private String reportingTime;

    private String treatmentMeasures;

    private Date createDate;

    private Date updateDate;

    private String createDoc;

    private String updateDoc;

    private String courseType;

    private String createNam;

    private String updateNam;

    private String isprint;

    public String getDiseaseCourseSeq() {
        return diseaseCourseSeq;
    }

    public void setDiseaseCourseSeq(String diseaseCourseSeq) {
        this.diseaseCourseSeq = diseaseCourseSeq == null ? null : diseaseCourseSeq.trim();
    }

    public String getEmgSeqDc() {
        return emgSeqDc;
    }

    public void setEmgSeqDc(String emgSeqDc) {
        this.emgSeqDc = emgSeqDc == null ? null : emgSeqDc.trim();
    }

    public Date getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(Date courseDate) {
        this.courseDate = courseDate;
    }

    public String getDiseasePoint() {
        return diseasePoint;
    }

    public void setDiseasePoint(String diseasePoint) {
        this.diseasePoint = diseasePoint == null ? null : diseasePoint.trim();
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan == null ? null : treatmentPlan.trim();
    }

    public String getReportingTime() {
        return reportingTime;
    }

    public void setReportingTime(String reportingTime) {
        this.reportingTime = reportingTime == null ? null : reportingTime.trim();
    }

    public String getTreatmentMeasures() {
        return treatmentMeasures;
    }

    public void setTreatmentMeasures(String treatmentMeasures) {
        this.treatmentMeasures = treatmentMeasures == null ? null : treatmentMeasures.trim();
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

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
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

    public String getIsprint() {
        return isprint;
    }

    public void setIsprint(String isprint) {
        this.isprint = isprint == null ? null : isprint.trim();
    }
}