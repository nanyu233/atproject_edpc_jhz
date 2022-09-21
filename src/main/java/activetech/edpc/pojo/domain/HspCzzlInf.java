package activetech.edpc.pojo.domain;

import java.io.Serializable;
import java.util.Date;

public class HspCzzlInf implements Serializable {
    private String seqNo;

    private String emgNo;

    private String proCode;

    private String proVal;

    private Date crtTime;

    private String crtUser;

    private Date modTime;

    private String modUser;

    private static final long serialVersionUID = 1L;

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public String getEmgNo() {
        return emgNo;
    }

    public void setEmgNo(String emgNo) {
        this.emgNo = emgNo == null ? null : emgNo.trim();
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode == null ? null : proCode.trim();
    }

    public String getProVal() {
        return proVal;
    }

    public void setProVal(String proVal) {
        this.proVal = proVal == null ? null : proVal.trim();
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