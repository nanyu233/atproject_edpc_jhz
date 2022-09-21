package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

public class HspCerebralSheet extends HspCerebralSheetKey {
    private String emgSeqDc;

    private Date cerebralDate;

    private Short heartRate;

    private Short pressureUp;

    private Short oxyNbr;

    private BigDecimal nihssScore;

    private Date createDate;

    private Date updateDate;

    private String createDoc;

    private String updateDoc;

    private Short pressureDown;

    private String assessDoc;

    private String assessDate;

    private String relationDoc;

    private String relationDocnam;

    public String getEmgSeqDc() {
        return emgSeqDc;
    }

    public void setEmgSeqDc(String emgSeqDc) {
        this.emgSeqDc = emgSeqDc == null ? null : emgSeqDc.trim();
    }

    public Date getCerebralDate() {
        return cerebralDate;
    }

    public void setCerebralDate(Date cerebralDate) {
        this.cerebralDate = cerebralDate;
    }

    public Short getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Short heartRate) {
        this.heartRate = heartRate;
    }

    public Short getPressureUp() {
        return pressureUp;
    }

    public void setPressureUp(Short pressureUp) {
        this.pressureUp = pressureUp;
    }

    public Short getOxyNbr() {
        return oxyNbr;
    }

    public void setOxyNbr(Short oxyNbr) {
        this.oxyNbr = oxyNbr;
    }

    public BigDecimal getNihssScore() {
        return nihssScore;
    }

    public void setNihssScore(BigDecimal nihssScore) {
        this.nihssScore = nihssScore;
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

    public Short getPressureDown() {
        return pressureDown;
    }

    public void setPressureDown(Short pressureDown) {
        this.pressureDown = pressureDown;
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

    public String getRelationDoc() {
        return relationDoc;
    }

    public void setRelationDoc(String relationDoc) {
        this.relationDoc = relationDoc == null ? null : relationDoc.trim();
    }

    public String getRelationDocnam() {
        return relationDocnam;
    }

    public void setRelationDocnam(String relationDocnam) {
        this.relationDocnam = relationDocnam == null ? null : relationDocnam.trim();
    }
}