package activetech.hospital.pojo.domain;

import java.math.BigDecimal;

public class HspMewsInf {
    private String emgSeq;

    private Short hrtRte;

    private Short sbpupNbr;

    private Short breNbr;

    private BigDecimal tmpNbr;

    private String senRctCod;

    private Long totSco;

    private String chkLvlCod;

    private String modLvlCod;

    private String modLvlDes;

    private Short sbpdownNbr;

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Short getHrtRte() {
        return hrtRte;
    }

    public void setHrtRte(Short hrtRte) {
        this.hrtRte = hrtRte;
    }

    public Short getSbpupNbr() {
        return sbpupNbr;
    }

    public void setSbpupNbr(Short sbpupNbr) {
        this.sbpupNbr = sbpupNbr;
    }

    public Short getBreNbr() {
        return breNbr;
    }

    public void setBreNbr(Short breNbr) {
        this.breNbr = breNbr;
    }

    public BigDecimal getTmpNbr() {
        return tmpNbr;
    }

    public void setTmpNbr(BigDecimal tmpNbr) {
        this.tmpNbr = tmpNbr;
    }

    public String getSenRctCod() {
        return senRctCod;
    }

    public void setSenRctCod(String senRctCod) {
        this.senRctCod = senRctCod == null ? null : senRctCod.trim();
    }

    public Long getTotSco() {
        return totSco;
    }

    public void setTotSco(Long totSco) {
        this.totSco = totSco;
    }

    public String getChkLvlCod() {
        return chkLvlCod;
    }

    public void setChkLvlCod(String chkLvlCod) {
        this.chkLvlCod = chkLvlCod == null ? null : chkLvlCod.trim();
    }

    public String getModLvlCod() {
        return modLvlCod;
    }

    public void setModLvlCod(String modLvlCod) {
        this.modLvlCod = modLvlCod == null ? null : modLvlCod.trim();
    }

    public String getModLvlDes() {
        return modLvlDes;
    }

    public void setModLvlDes(String modLvlDes) {
        this.modLvlDes = modLvlDes == null ? null : modLvlDes.trim();
    }

    public Short getSbpdownNbr() {
        return sbpdownNbr;
    }

    public void setSbpdownNbr(Short sbpdownNbr) {
        this.sbpdownNbr = sbpdownNbr;
    }
}