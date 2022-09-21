package activetech.zyyhospital.pojo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class IcuPipeInfo {
    private String pipeSeq;

    private String pipeName;

    private String pipeStat;

    private String emgSeq;

    private String pipeType;

    private String bodyPart;

    private String pipeModl;

    private String pipeLeng;

    private String pipeDpth;

    private String inType;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date inTime;

    private String inUser;

    private String inMemo;

    private Long chgNumb;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date chgTime;

    private String chgUser;

    private String chgMemo;

    private String outType;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date outTime;

    private String outUser;

    private String outMemo;

    private Long vldDay;

    private Date crtTime;

    private String crtUser;

    private Date modTime;

    private String modUser;

    private String pipeSeqHis;

    public String getPipeSeq() {
        return pipeSeq;
    }

    public void setPipeSeq(String pipeSeq) {
        this.pipeSeq = pipeSeq == null ? null : pipeSeq.trim();
    }

    public String getPipeName() {
        return pipeName;
    }

    public void setPipeName(String pipeName) {
        this.pipeName = pipeName == null ? null : pipeName.trim();
    }

    public String getPipeStat() {
        return pipeStat;
    }

    public void setPipeStat(String pipeStat) {
        this.pipeStat = pipeStat == null ? null : pipeStat.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getPipeType() {
        return pipeType;
    }

    public void setPipeType(String pipeType) {
        this.pipeType = pipeType == null ? null : pipeType.trim();
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart == null ? null : bodyPart.trim();
    }

    public String getPipeModl() {
        return pipeModl;
    }

    public void setPipeModl(String pipeModl) {
        this.pipeModl = pipeModl == null ? null : pipeModl.trim();
    }

    public String getPipeLeng() {
        return pipeLeng;
    }

    public void setPipeLeng(String pipeLeng) {
        this.pipeLeng = pipeLeng == null ? null : pipeLeng.trim();
    }

    public String getPipeDpth() {
        return pipeDpth;
    }

    public void setPipeDpth(String pipeDpth) {
        this.pipeDpth = pipeDpth == null ? null : pipeDpth.trim();
    }

    public String getInType() {
        return inType;
    }

    public void setInType(String inType) {
        this.inType = inType == null ? null : inType.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getInUser() {
        return inUser;
    }

    public void setInUser(String inUser) {
        this.inUser = inUser == null ? null : inUser.trim();
    }

    public String getInMemo() {
        return inMemo;
    }

    public void setInMemo(String inMemo) {
        this.inMemo = inMemo == null ? null : inMemo.trim();
    }

    public Long getChgNumb() {
        return chgNumb;
    }

    public void setChgNumb(Long chgNumb) {
        this.chgNumb = chgNumb;
    }

    public Date getChgTime() {
        return chgTime;
    }

    public void setChgTime(Date chgTime) {
        this.chgTime = chgTime;
    }

    public String getChgUser() {
        return chgUser;
    }

    public void setChgUser(String chgUser) {
        this.chgUser = chgUser == null ? null : chgUser.trim();
    }

    public String getChgMemo() {
        return chgMemo;
    }

    public void setChgMemo(String chgMemo) {
        this.chgMemo = chgMemo == null ? null : chgMemo.trim();
    }

    public String getOutType() {
        return outType;
    }

    public void setOutType(String outType) {
        this.outType = outType == null ? null : outType.trim();
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getOutUser() {
        return outUser;
    }

    public void setOutUser(String outUser) {
        this.outUser = outUser == null ? null : outUser.trim();
    }

    public String getOutMemo() {
        return outMemo;
    }

    public void setOutMemo(String outMemo) {
        this.outMemo = outMemo == null ? null : outMemo.trim();
    }

    public Long getVldDay() {
        return vldDay;
    }

    public void setVldDay(Long vldDay) {
        this.vldDay = vldDay;
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

    public String getPipeSeqHis() {
        return pipeSeqHis;
    }

    public void setPipeSeqHis(String pipeSeqHis) {
        this.pipeSeqHis = pipeSeqHis == null ? null : pipeSeqHis.trim();
    }
}