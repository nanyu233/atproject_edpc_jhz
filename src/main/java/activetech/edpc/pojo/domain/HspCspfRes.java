package activetech.edpc.pojo.domain;

import java.util.Date;

public class HspCspfRes {
    private String emgSeq;

    private Short aisScoe;

    private Short issScoe;

    private String resDesc;

    private Date crtTime;

    private String usrNo;

    private String usrName;

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Short getAisScoe() {
        return aisScoe;
    }

    public void setAisScoe(Short aisScoe) {
        this.aisScoe = aisScoe;
    }

    public Short getIssScoe() {
        return issScoe;
    }

    public void setIssScoe(Short issScoe) {
        this.issScoe = issScoe;
    }

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc == null ? null : resDesc.trim();
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getUsrNo() {
        return usrNo;
    }

    public void setUsrNo(String usrNo) {
        this.usrNo = usrNo == null ? null : usrNo.trim();
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName == null ? null : usrName.trim();
    }
}