package activetech.eicu.pojo.domain;

import java.util.Date;

public class IcuGradeTotal {
    private String gradeSeq;

    private String gradeType;

    private String liveNo;

    private String gradeSco;

    private String gradeDetl;

    private Date gradeTime;

    private String gradeUser;

    private Date crtTime;

    private String crtUser;

    private Date modTime;

    private String modUser;

    private String htmlText;

    public String getGradeSeq() {
        return gradeSeq;
    }

    public void setGradeSeq(String gradeSeq) {
        this.gradeSeq = gradeSeq == null ? null : gradeSeq.trim();
    }

    public String getGradeType() {
        return gradeType;
    }

    public void setGradeType(String gradeType) {
        this.gradeType = gradeType == null ? null : gradeType.trim();
    }

    public String getLiveNo() {
        return liveNo;
    }

    public void setLiveNo(String liveNo) {
        this.liveNo = liveNo == null ? null : liveNo.trim();
    }

    public String getGradeSco() {
        return gradeSco;
    }

    public void setGradeSco(String gradeSco) {
        this.gradeSco = gradeSco == null ? null : gradeSco.trim();
    }

    public String getGradeDetl() {
        return gradeDetl;
    }

    public void setGradeDetl(String gradeDetl) {
        this.gradeDetl = gradeDetl == null ? null : gradeDetl.trim();
    }

    public Date getGradeTime() {
        return gradeTime;
    }

    public void setGradeTime(Date gradeTime) {
        this.gradeTime = gradeTime;
    }

    public String getGradeUser() {
        return gradeUser;
    }

    public void setGradeUser(String gradeUser) {
        this.gradeUser = gradeUser == null ? null : gradeUser.trim();
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

    public String getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText == null ? null : htmlText.trim();
    }
}