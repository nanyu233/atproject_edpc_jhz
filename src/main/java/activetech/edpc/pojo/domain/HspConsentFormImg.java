package activetech.edpc.pojo.domain;

import java.io.Serializable;
import java.util.Date;

public class HspConsentFormImg implements Serializable {
    private String id;

    private String patientId;

    private String consentFormSeq;

    private String consentFormId;

    private String consentFormName;

    private String consentFormType;

    private Date saveTime;

    private String hospitalArea;

    private String systemId;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getConsentFormSeq() {
        return consentFormSeq;
    }

    public void setConsentFormSeq(String consentFormSeq) {
        this.consentFormSeq = consentFormSeq == null ? null : consentFormSeq.trim();
    }

    public String getConsentFormId() {
        return consentFormId;
    }

    public void setConsentFormId(String consentFormId) {
        this.consentFormId = consentFormId == null ? null : consentFormId.trim();
    }

    public String getConsentFormName() {
        return consentFormName;
    }

    public void setConsentFormName(String consentFormName) {
        this.consentFormName = consentFormName == null ? null : consentFormName.trim();
    }

    public String getConsentFormType() {
        return consentFormType;
    }

    public void setConsentFormType(String consentFormType) {
        this.consentFormType = consentFormType == null ? null : consentFormType.trim();
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    public String getHospitalArea() {
        return hospitalArea;
    }

    public void setHospitalArea(String hospitalArea) {
        this.hospitalArea = hospitalArea == null ? null : hospitalArea.trim();
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}