package activetech.aid.pojo.domain;

import java.io.Serializable;
import java.util.Date;

public class AidAitInf implements Serializable {
    private String aitSeq;

    private Date sndTim;

    private String sndCom;

    private String sndComNam;

    private String sndUsr;

    private String sndUsrNam;

    private String aitTyp;

    private String aitCon;

    private String rsvTel;

    private String rsvCom;

    private String rsvComNam;

    private String rsvUsr;

    private String rsvUsrNam;

    private String retFlg;

    private String retMem;

    private String outPlt;

    private String outSeq;

    private String outUsr;

    private String sndFlg;

    private String busSeq;

    private String aitPar;

    private String chlTyp;

    private String aitSce;

    private String systemId;

    private static final long serialVersionUID = 1L;

    public String getAitSeq() {
        return aitSeq;
    }

    public void setAitSeq(String aitSeq) {
        this.aitSeq = aitSeq == null ? null : aitSeq.trim();
    }

    public Date getSndTim() {
        return sndTim;
    }

    public void setSndTim(Date sndTim) {
        this.sndTim = sndTim;
    }

    public String getSndCom() {
        return sndCom;
    }

    public void setSndCom(String sndCom) {
        this.sndCom = sndCom == null ? null : sndCom.trim();
    }

    public String getSndComNam() {
        return sndComNam;
    }

    public void setSndComNam(String sndComNam) {
        this.sndComNam = sndComNam == null ? null : sndComNam.trim();
    }

    public String getSndUsr() {
        return sndUsr;
    }

    public void setSndUsr(String sndUsr) {
        this.sndUsr = sndUsr == null ? null : sndUsr.trim();
    }

    public String getSndUsrNam() {
        return sndUsrNam;
    }

    public void setSndUsrNam(String sndUsrNam) {
        this.sndUsrNam = sndUsrNam == null ? null : sndUsrNam.trim();
    }

    public String getAitTyp() {
        return aitTyp;
    }

    public void setAitTyp(String aitTyp) {
        this.aitTyp = aitTyp == null ? null : aitTyp.trim();
    }

    public String getAitCon() {
        return aitCon;
    }

    public void setAitCon(String aitCon) {
        this.aitCon = aitCon == null ? null : aitCon.trim();
    }

    public String getRsvTel() {
        return rsvTel;
    }

    public void setRsvTel(String rsvTel) {
        this.rsvTel = rsvTel == null ? null : rsvTel.trim();
    }

    public String getRsvCom() {
        return rsvCom;
    }

    public void setRsvCom(String rsvCom) {
        this.rsvCom = rsvCom == null ? null : rsvCom.trim();
    }

    public String getRsvComNam() {
        return rsvComNam;
    }

    public void setRsvComNam(String rsvComNam) {
        this.rsvComNam = rsvComNam == null ? null : rsvComNam.trim();
    }

    public String getRsvUsr() {
        return rsvUsr;
    }

    public void setRsvUsr(String rsvUsr) {
        this.rsvUsr = rsvUsr == null ? null : rsvUsr.trim();
    }

    public String getRsvUsrNam() {
        return rsvUsrNam;
    }

    public void setRsvUsrNam(String rsvUsrNam) {
        this.rsvUsrNam = rsvUsrNam == null ? null : rsvUsrNam.trim();
    }

    public String getRetFlg() {
        return retFlg;
    }

    public void setRetFlg(String retFlg) {
        this.retFlg = retFlg == null ? null : retFlg.trim();
    }

    public String getRetMem() {
        return retMem;
    }

    public void setRetMem(String retMem) {
        this.retMem = retMem == null ? null : retMem.trim();
    }

    public String getOutPlt() {
        return outPlt;
    }

    public void setOutPlt(String outPlt) {
        this.outPlt = outPlt == null ? null : outPlt.trim();
    }

    public String getOutSeq() {
        return outSeq;
    }

    public void setOutSeq(String outSeq) {
        this.outSeq = outSeq == null ? null : outSeq.trim();
    }

    public String getOutUsr() {
        return outUsr;
    }

    public void setOutUsr(String outUsr) {
        this.outUsr = outUsr == null ? null : outUsr.trim();
    }

    public String getSndFlg() {
        return sndFlg;
    }

    public void setSndFlg(String sndFlg) {
        this.sndFlg = sndFlg == null ? null : sndFlg.trim();
    }

    public String getBusSeq() {
        return busSeq;
    }

    public void setBusSeq(String busSeq) {
        this.busSeq = busSeq == null ? null : busSeq.trim();
    }

    public String getAitPar() {
        return aitPar;
    }

    public void setAitPar(String aitPar) {
        this.aitPar = aitPar == null ? null : aitPar.trim();
    }

    public String getChlTyp() {
        return chlTyp;
    }

    public void setChlTyp(String chlTyp) {
        this.chlTyp = chlTyp == null ? null : chlTyp.trim();
    }

    public String getAitSce() {
        return aitSce;
    }

    public void setAitSce(String aitSce) {
        this.aitSce = aitSce == null ? null : aitSce.trim();
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }
}