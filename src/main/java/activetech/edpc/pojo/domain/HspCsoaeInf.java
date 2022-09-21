package activetech.edpc.pojo.domain;

import java.util.Date;

public class HspCsoaeInf {
    private String emgSeq;

    private String fldCod;

    private String fldVal;

    private String usrNo;

    private String usrNme;

    private Date crtTim;

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getFldCod() {
        return fldCod;
    }

    public void setFldCod(String fldCod) {
        this.fldCod = fldCod == null ? null : fldCod.trim();
    }

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