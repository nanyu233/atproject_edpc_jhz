package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspBradenInf {
    private String xtpgSeq;

    private String emgSeq;

    private String bradenGjCod;

    private String bradenCsCod;

    private String bradenHdnlCod;

    private String bradenYdnlCod;

    private String bradenYyCod;

    private String bradenMchjqlCod;

    private Long bradenSco;

    private String memo;

    private Date cratDat;

    private String crtUsrNo;

    private String crtUsrNme;

    private String updUsrNo;

    private String updUsrNme;

    private Date updTime;

    public String getXtpgSeq() {
        return xtpgSeq;
    }

    public void setXtpgSeq(String xtpgSeq) {
        this.xtpgSeq = xtpgSeq == null ? null : xtpgSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getBradenGjCod() {
        return bradenGjCod;
    }

    public void setBradenGjCod(String bradenGjCod) {
        this.bradenGjCod = bradenGjCod == null ? null : bradenGjCod.trim();
    }

    public String getBradenCsCod() {
        return bradenCsCod;
    }

    public void setBradenCsCod(String bradenCsCod) {
        this.bradenCsCod = bradenCsCod == null ? null : bradenCsCod.trim();
    }

    public String getBradenHdnlCod() {
        return bradenHdnlCod;
    }

    public void setBradenHdnlCod(String bradenHdnlCod) {
        this.bradenHdnlCod = bradenHdnlCod == null ? null : bradenHdnlCod.trim();
    }

    public String getBradenYdnlCod() {
        return bradenYdnlCod;
    }

    public void setBradenYdnlCod(String bradenYdnlCod) {
        this.bradenYdnlCod = bradenYdnlCod == null ? null : bradenYdnlCod.trim();
    }

    public String getBradenYyCod() {
        return bradenYyCod;
    }

    public void setBradenYyCod(String bradenYyCod) {
        this.bradenYyCod = bradenYyCod == null ? null : bradenYyCod.trim();
    }

    public String getBradenMchjqlCod() {
        return bradenMchjqlCod;
    }

    public void setBradenMchjqlCod(String bradenMchjqlCod) {
        this.bradenMchjqlCod = bradenMchjqlCod == null ? null : bradenMchjqlCod.trim();
    }

    public Long getBradenSco() {
        return bradenSco;
    }

    public void setBradenSco(Long bradenSco) {
        this.bradenSco = bradenSco;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getCratDat() {
        return cratDat;
    }

    public void setCratDat(Date cratDat) {
        this.cratDat = cratDat;
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