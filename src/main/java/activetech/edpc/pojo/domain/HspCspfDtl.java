package activetech.edpc.pojo.domain;

import java.util.Date;

public class HspCspfDtl extends HspCspfDtlKey {
    private Short optScoe;

    private Date crtTime;

    private String usrNo;

    private String usrName;

    public Short getOptScoe() {
        return optScoe;
    }

    public void setOptScoe(Short optScoe) {
        this.optScoe = optScoe;
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