package activetech.eicu.pojo.domain;

import java.util.Date;

public class IcuVsInfo {
    private String vsSeq;

    private String liveNo;

    private String vsType;

    private String vsCode;

    private String vsSrc;

    private Date vsDate;

    private String vsHour;

    private String vsRslt;

    private String linkSeq;

    private Date crtTime;

    private String crtUser;

    private Date modTime;

    private String modUser;

    public String getVsSeq() {
        return vsSeq;
    }

    public void setVsSeq(String vsSeq) {
        this.vsSeq = vsSeq == null ? null : vsSeq.trim();
    }

    public String getLiveNo() {
        return liveNo;
    }

    public void setLiveNo(String liveNo) {
        this.liveNo = liveNo == null ? null : liveNo.trim();
    }

    public String getVsType() {
        return vsType;
    }

    public void setVsType(String vsType) {
        this.vsType = vsType == null ? null : vsType.trim();
    }

    public String getVsCode() {
        return vsCode;
    }

    public void setVsCode(String vsCode) {
        this.vsCode = vsCode == null ? null : vsCode.trim();
    }

    public String getVsSrc() {
        return vsSrc;
    }

    public void setVsSrc(String vsSrc) {
        this.vsSrc = vsSrc == null ? null : vsSrc.trim();
    }

    public Date getVsDate() {
        return vsDate;
    }

    public void setVsDate(Date vsDate) {
        this.vsDate = vsDate;
    }

    public String getVsHour() {
        return vsHour;
    }

    public void setVsHour(String vsHour) {
        this.vsHour = vsHour == null ? null : vsHour.trim();
    }

    public String getVsRslt() {
        return vsRslt;
    }

    public void setVsRslt(String vsRslt) {
        this.vsRslt = vsRslt == null ? null : vsRslt.trim();
    }

    public String getLinkSeq() {
        return linkSeq;
    }

    public void setLinkSeq(String linkSeq) {
        this.linkSeq = linkSeq == null ? null : linkSeq.trim();
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
}