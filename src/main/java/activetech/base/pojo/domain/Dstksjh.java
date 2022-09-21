package activetech.base.pojo.domain;

import java.util.Date;

public class Dstksjh {
    private String id;

    private String oprtTyp;

    private String objt;

    private String lendDpm;

    private Date lendDat;

    private String borrowDpm;

    private String borrowUsr;

    private String borrowUsrTel;

    private String returnStatus;

    private String oprtUsr;

    private Date oprtDat;

    private String lnedUsr;

    private Integer deposit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOprtTyp() {
        return oprtTyp;
    }

    public void setOprtTyp(String oprtTyp) {
        this.oprtTyp = oprtTyp == null ? null : oprtTyp.trim();
    }

    public String getObjt() {
        return objt;
    }

    public void setObjt(String objt) {
        this.objt = objt == null ? null : objt.trim();
    }

    public String getLendDpm() {
        return lendDpm;
    }

    public void setLendDpm(String lendDpm) {
        this.lendDpm = lendDpm == null ? null : lendDpm.trim();
    }

    public Date getLendDat() {
        return lendDat;
    }

    public void setLendDat(Date lendDat) {
        this.lendDat = lendDat;
    }

    public String getBorrowDpm() {
        return borrowDpm;
    }

    public void setBorrowDpm(String borrowDpm) {
        this.borrowDpm = borrowDpm == null ? null : borrowDpm.trim();
    }

    public String getBorrowUsr() {
        return borrowUsr;
    }

    public void setBorrowUsr(String borrowUsr) {
        this.borrowUsr = borrowUsr == null ? null : borrowUsr.trim();
    }

    public String getBorrowUsrTel() {
        return borrowUsrTel;
    }

    public void setBorrowUsrTel(String borrowUsrTel) {
        this.borrowUsrTel = borrowUsrTel == null ? null : borrowUsrTel.trim();
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus == null ? null : returnStatus.trim();
    }

    public String getOprtUsr() {
        return oprtUsr;
    }

    public void setOprtUsr(String oprtUsr) {
        this.oprtUsr = oprtUsr == null ? null : oprtUsr.trim();
    }

    public Date getOprtDat() {
        return oprtDat;
    }

    public void setOprtDat(Date oprtDat) {
        this.oprtDat = oprtDat;
    }

    public String getLnedUsr() {
        return lnedUsr;
    }

    public void setLnedUsr(String lnedUsr) {
        this.lnedUsr = lnedUsr == null ? null : lnedUsr.trim();
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }
}