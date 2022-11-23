package activetech.structtext.pojo.domain;

import java.util.Date;

public class Dstcases {
    private String caseSeq;

    private String caseStat;

    private String sysId;

    private String patientId;

    private String patientName;

    private String tempSeq;

    private String caseDetl;

    private Date caseTime;

    private String caseUser;

    private String caseName;

    private Date crtTime;

    private String crtUser;

    private String crtUserName;

    private Date modTime;

    private String modUser;

    private String modUserName;

    public String getCaseSeq() {
        return caseSeq;
    }

    public void setCaseSeq(String caseSeq) {
        this.caseSeq = caseSeq == null ? null : caseSeq.trim();
    }

    public String getCaseStat() {
        return caseStat;
    }

    public void setCaseStat(String caseStat) {
        this.caseStat = caseStat == null ? null : caseStat.trim();
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getTempSeq() {
        return tempSeq;
    }

    public void setTempSeq(String tempSeq) {
        this.tempSeq = tempSeq == null ? null : tempSeq.trim();
    }

    public String getCaseDetl() {
        return caseDetl;
    }

    public void setCaseDetl(String caseDetl) {
        this.caseDetl = caseDetl == null ? null : caseDetl.trim();
    }

    public Date getCaseTime() {
        return caseTime;
    }

    public void setCaseTime(Date caseTime) {
        this.caseTime = caseTime;
    }

    public String getCaseUser() {
        return caseUser;
    }

    public void setCaseUser(String caseUser) {
        this.caseUser = caseUser == null ? null : caseUser.trim();
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName == null ? null : caseName.trim();
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser == null ? null : crtUser.trim();
    }

    public String getCrtUserName() {
        return crtUserName;
    }

    public void setCrtUserName(String crtUserName) {
        this.crtUserName = crtUserName == null ? null : crtUserName.trim();
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public String getModUser() {
        return modUser;
    }

    public void setModUser(String modUser) {
        this.modUser = modUser == null ? null : modUser.trim();
    }

    public String getModUserName() {
        return modUserName;
    }

    public void setModUserName(String modUserName) {
        this.modUserName = modUserName == null ? null : modUserName.trim();
    }
}