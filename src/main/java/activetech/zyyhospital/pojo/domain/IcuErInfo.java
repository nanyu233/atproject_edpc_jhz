package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class IcuErInfo {
    private String erSeq;

    private String erStat;

    private String erType;

    private String erName;

    private String erInfo;

    private String liveNo;

    private String linkSeq;

    private Date linkTime;

    private String skipUrl;

    private Date crtTime;

    private String crtUser;

    private Date modTime;

    private String modUser;

    public String getErSeq() {
        return erSeq;
    }

    public void setErSeq(String erSeq) {
        this.erSeq = erSeq == null ? null : erSeq.trim();
    }

    public String getErStat() {
        return erStat;
    }

    public void setErStat(String erStat) {
        this.erStat = erStat == null ? null : erStat.trim();
    }

    public String getErType() {
        return erType;
    }

    public void setErType(String erType) {
        this.erType = erType == null ? null : erType.trim();
    }

    public String getErName() {
        return erName;
    }

    public void setErName(String erName) {
        this.erName = erName == null ? null : erName.trim();
    }

    public String getErInfo() {
        return erInfo;
    }

    public void setErInfo(String erInfo) {
        this.erInfo = erInfo == null ? null : erInfo.trim();
    }

    public String getLiveNo() {
        return liveNo;
    }

    public void setLiveNo(String liveNo) {
        this.liveNo = liveNo == null ? null : liveNo.trim();
    }

    public String getLinkSeq() {
        return linkSeq;
    }

    public void setLinkSeq(String linkSeq) {
        this.linkSeq = linkSeq == null ? null : linkSeq.trim();
    }

    public Date getLinkTime() {
        return linkTime;
    }

    public void setLinkTime(Date linkTime) {
        this.linkTime = linkTime;
    }

    public String getSkipUrl() {
        return skipUrl;
    }

    public void setSkipUrl(String skipUrl) {
        this.skipUrl = skipUrl == null ? null : skipUrl.trim();
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