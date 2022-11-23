package activetech.structtext.pojo.domain;

import java.util.Date;

public class Dsttemplate {
    private String tempSeq;

    private String sysId;

    private String tempCode;

    private String tempName;

    private String tempStat;

    private String tempPaper;

    private String tempPrint;

    private Date crtTime;

    private String crtUser;

    private Date modTime;

    private String modUser;

    private String tempMargins;

    public String getTempSeq() {
        return tempSeq;
    }

    public void setTempSeq(String tempSeq) {
        this.tempSeq = tempSeq == null ? null : tempSeq.trim();
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public String getTempCode() {
        return tempCode;
    }

    public void setTempCode(String tempCode) {
        this.tempCode = tempCode == null ? null : tempCode.trim();
    }

    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName == null ? null : tempName.trim();
    }

    public String getTempStat() {
        return tempStat;
    }

    public void setTempStat(String tempStat) {
        this.tempStat = tempStat == null ? null : tempStat.trim();
    }

    public String getTempPaper() {
        return tempPaper;
    }

    public void setTempPaper(String tempPaper) {
        this.tempPaper = tempPaper == null ? null : tempPaper.trim();
    }

    public String getTempPrint() {
        return tempPrint;
    }

    public void setTempPrint(String tempPrint) {
        this.tempPrint = tempPrint == null ? null : tempPrint.trim();
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

    public String getTempMargins() {
        return tempMargins;
    }

    public void setTempMargins(String tempMargins) {
        this.tempMargins = tempMargins == null ? null : tempMargins.trim();
    }
}