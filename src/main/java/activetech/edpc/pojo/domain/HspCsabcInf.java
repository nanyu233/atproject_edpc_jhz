package activetech.edpc.pojo.domain;

import java.util.Date;

public class HspCsabcInf extends HspCsabcInfKey {
    private String fldVal;

    private String usrNo;

    private String usrNme;

    private Date crtTim;

    public String getFldVal() {
        return fldVal;
    }

    public void setFldVal(String fldVal) {
        this.fldVal = fldVal == null ? null : fldVal.trim();
    }

    public String getUsrNo() {
        return usrNo;
    }

    public void setUsrNo(String usrNo) {
        this.usrNo = usrNo == null ? null : usrNo.trim();
    }

    public String getUsrNme() {
        return usrNme;
    }

    public void setUsrNme(String usrNme) {
        this.usrNme = usrNme == null ? null : usrNme.trim();
    }

    public Date getCrtTim() {
        return crtTim;
    }

    public void setCrtTim(Date crtTim) {
        this.crtTim = crtTim;
    }
}