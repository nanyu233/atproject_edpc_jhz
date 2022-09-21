package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspCxfxpgb {
    private String riskSeq;

    private String emgSeq;

    private String highrisk1;

    private String highrisk2;

    private String assresult;

    private String assessDoc;

    private String assessDate;

    private Date createDate;

    private Date updateDate;

    private String createDoc;

    private String updateDoc;

    private String assessDocNam;

    public String getRiskSeq() {
        return riskSeq;
    }

    public void setRiskSeq(String riskSeq) {
        this.riskSeq = riskSeq == null ? null : riskSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getHighrisk1() {
        return highrisk1;
    }

    public void setHighrisk1(String highrisk1) {
        this.highrisk1 = highrisk1 == null ? null : highrisk1.trim();
    }

    public String getHighrisk2() {
        return highrisk2;
    }

    public void setHighrisk2(String highrisk2) {
        this.highrisk2 = highrisk2 == null ? null : highrisk2.trim();
    }

    public String getAssresult() {
        return assresult;
    }

    public void setAssresult(String assresult) {
        this.assresult = assresult == null ? null : assresult.trim();
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

    public String getAssessDocNam() {
        return assessDocNam;
    }

    public void setAssessDocNam(String assessDocNam) {
        this.assessDocNam = assessDocNam == null ? null : assessDocNam.trim();
    }
}