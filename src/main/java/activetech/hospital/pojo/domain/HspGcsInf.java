package activetech.hospital.pojo.domain;

import java.util.Date;

public class HspGcsInf {
    private String emgSeq;

    private String eyeRctCod;

    private String lanRctCod;

    private String actRctCod;

    private Long totSco;

    private Date cratDat;

    private String gcsSeq;

    private String crtUsrNo;

    private String crtUsrNme;

    private String updUsrNo;

    private String updUsrNme;

    private Date updTime;

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getEyeRctCod() {
        return eyeRctCod;
    }

    public void setEyeRctCod(String eyeRctCod) {
        this.eyeRctCod = eyeRctCod == null ? null : eyeRctCod.trim();
    }

    public String getLanRctCod() {
        return lanRctCod;
    }

    public void setLanRctCod(String lanRctCod) {
        this.lanRctCod = lanRctCod == null ? null : lanRctCod.trim();
    }

    public String getActRctCod() {
        return actRctCod;
    }

    public void setActRctCod(String actRctCod) {
        this.actRctCod = actRctCod == null ? null : actRctCod.trim();
    }

    public Long getTotSco() {
        return totSco;
    }

    public void setTotSco(Long totSco) {
        this.totSco = totSco;
    }

    public Date getCratDat() {
        return cratDat;
    }

    public void setCratDat(Date cratDat) {
        this.cratDat = cratDat;
    }

    public String getGcsSeq() {
        return gcsSeq;
    }

    public void setGcsSeq(String gcsSeq) {
        this.gcsSeq = gcsSeq == null ? null : gcsSeq.trim();
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

    public String getUpdUsrNo() {
        return updUsrNo;
    }

    public void setUpdUsrNo(String updUsrNo) {
        this.updUsrNo = updUsrNo == null ? null : updUsrNo.trim();
    }

    public String getUpdUsrNme() {
        return updUsrNme;
    }

    public void setUpdUsrNme(String updUsrNme) {
        this.updUsrNme = updUsrNme == null ? null : updUsrNme.trim();
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }
}