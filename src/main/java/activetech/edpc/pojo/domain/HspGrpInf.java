package activetech.edpc.pojo.domain;

import java.io.Serializable;
import java.util.Date;

public class HspGrpInf implements Serializable {
    private String grpSeq;

    private String grpName;

    private String grpType;

    private String isenable;

    private String crtUser;

    private Date crtTime;

    private String modUser;

    private Date modTime;

    private Long showorder;

    private String remark;

    private String dingtalkChatid;

    private String wxworkChatid;

    private static final long serialVersionUID = 1L;

    public String getGrpSeq() {
        return grpSeq;
    }

    public void setGrpSeq(String grpSeq) {
        this.grpSeq = grpSeq == null ? null : grpSeq.trim();
    }

    public String getGrpName() {
        return grpName;
    }

    public void setGrpName(String grpName) {
        this.grpName = grpName == null ? null : grpName.trim();
    }

    public String getGrpType() {
        return grpType;
    }

    public void setGrpType(String grpType) {
        this.grpType = grpType == null ? null : grpType.trim();
    }

    public String getIsenable() {
        return isenable;
    }

    public void setIsenable(String isenable) {
        this.isenable = isenable == null ? null : isenable.trim();
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

    public Long getShoworder() {
        return showorder;
    }

    public void setShoworder(Long showorder) {
        this.showorder = showorder;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDingtalkChatid() {
        return dingtalkChatid;
    }

    public void setDingtalkChatid(String dingtalkChatid) {
        this.dingtalkChatid = dingtalkChatid == null ? null : dingtalkChatid.trim();
    }

    public String getWxworkChatid() {
        return wxworkChatid;
    }

    public void setWxworkChatid(String wxworkChatid) {
        this.wxworkChatid = wxworkChatid == null ? null : wxworkChatid.trim();
    }
}