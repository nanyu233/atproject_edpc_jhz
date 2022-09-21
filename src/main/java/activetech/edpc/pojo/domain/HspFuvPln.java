package activetech.edpc.pojo.domain;

import java.util.Date;

public class HspFuvPln {
    private String plnSeq;

    private String patId;

    private String plnSta;

    private Date lstFuvTim;

    private Date plnFuvTim;

    private String almUsrNo;

    private String almUsrNme;

    private Date fuvAlmTim;

    private String almRedFlg;

    private Date almRedTim;

    private String crtUsrNo;

    private String crtUsrNme;

    private Date crtTim;

    private String plnFuvTyp;

    public String getPlnSeq() {
        return plnSeq;
    }

    public void setPlnSeq(String plnSeq) {
        this.plnSeq = plnSeq == null ? null : plnSeq.trim();
    }

    public String getPatId() {
        return patId;
    }

    public void setPatId(String patId) {
        this.patId = patId == null ? null : patId.trim();
    }

    public String getPlnSta() {
        return plnSta;
    }

    public void setPlnSta(String plnSta) {
        this.plnSta = plnSta == null ? null : plnSta.trim();
    }

    public Date getLstFuvTim() {
        return lstFuvTim;
    }

    public void setLstFuvTim(Date lstFuvTim) {
        this.lstFuvTim = lstFuvTim;
    }

    public Date getPlnFuvTim() {
        return plnFuvTim;
    }

    public void setPlnFuvTim(Date plnFuvTim) {
        this.plnFuvTim = plnFuvTim;
    }

    public String getAlmUsrNo() {
        return almUsrNo;
    }

    public void setAlmUsrNo(String almUsrNo) {
        this.almUsrNo = almUsrNo == null ? null : almUsrNo.trim();
    }

    public String getAlmUsrNme() {
        return almUsrNme;
    }

    public void setAlmUsrNme(String almUsrNme) {
        this.almUsrNme = almUsrNme == null ? null : almUsrNme.trim();
    }

    public Date getFuvAlmTim() {
        return fuvAlmTim;
    }

    public void setFuvAlmTim(Date fuvAlmTim) {
        this.fuvAlmTim = fuvAlmTim;
    }

    public String getAlmRedFlg() {
        return almRedFlg;
    }

    public void setAlmRedFlg(String almRedFlg) {
        this.almRedFlg = almRedFlg == null ? null : almRedFlg.trim();
    }

    public Date getAlmRedTim() {
        return almRedTim;
    }

    public void setAlmRedTim(Date almRedTim) {
        this.almRedTim = almRedTim;
    }

    public String getCrtUsrNo() {
        return crtUsrNo;
    }

    public void setCrtUsrNo(String crtUsrNo) {
        this.crtUsrNo = crtUsrNo == null ? null : crtUsrNo.trim();
    }

    public String getCrtUsrNme() {
        return crtUsrNme;
    }

    public void setCrtUsrNme(String crtUsrNme) {
        this.crtUsrNme = crtUsrNme == null ? null : crtUsrNme.trim();
    }

    public Date getCrtTim() {
        return crtTim;
    }

    public void setCrtTim(Date crtTim) {
        this.crtTim = crtTim;
    }

    public String getPlnFuvTyp() {
        return plnFuvTyp;
    }

    public void setPlnFuvTyp(String plnFuvTyp) {
        this.plnFuvTyp = plnFuvTyp == null ? null : plnFuvTyp.trim();
    }
}