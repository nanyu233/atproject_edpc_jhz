package activetech.edpc.pojo.domain;

import java.io.Serializable;
import java.util.Date;

public class HspYjqdInf implements Serializable {
    private String yjqdSeq;

    private String regSeq;

    private Date yjqdTime;

    private String noticeType;

    private String crtUser;

    private Date crtTime;

    private String modUser;

    private Date modTime;

    private String noticeContent;

    private static final long serialVersionUID = 1L;

    public String getYjqdSeq() {
        return yjqdSeq;
    }

    public void setYjqdSeq(String yjqdSeq) {
        this.yjqdSeq = yjqdSeq == null ? null : yjqdSeq.trim();
    }

    public String getRegSeq() {
        return regSeq;
    }

    public void setRegSeq(String regSeq) {
        this.regSeq = regSeq == null ? null : regSeq.trim();
    }

    public Date getYjqdTime() {
        return yjqdTime;
    }

    public void setYjqdTime(Date yjqdTime) {
        this.yjqdTime = yjqdTime;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType == null ? null : noticeType.trim();
    }

    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser == null ? null : crtUser.trim();
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getModUser() {
        return modUser;
    }

    public void setModUser(String modUser) {
        this.modUser = modUser == null ? null : modUser.trim();
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }
}