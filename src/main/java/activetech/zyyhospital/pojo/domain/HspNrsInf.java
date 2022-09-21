package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspNrsInf {
    private String xtpgSeq;

    private String emgSeq;

    private String nrsTtbw;

    private String nrsTtbwQt;

    private String nrsTtxz;

    private String nrsTtxzQt;

    private String nrsTtsj;

    private Long nrsSco;

    private String nrsMemo;

    private Date nrsDat;

    private String nrsStatus;

    private String nrsTtkz;

    private String crtUsrNo;

    private String crtUsrNme;

    private String updUsrNo;

    private String updUsrNme;

    private Date updTime;

    private String ttpfTypeCod;

    private String ttpfNr;

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

    public String getNrsTtbw() {
        return nrsTtbw;
    }

    public void setNrsTtbw(String nrsTtbw) {
        this.nrsTtbw = nrsTtbw == null ? null : nrsTtbw.trim();
    }

    public String getNrsTtbwQt() {
        return nrsTtbwQt;
    }

    public void setNrsTtbwQt(String nrsTtbwQt) {
        this.nrsTtbwQt = nrsTtbwQt == null ? null : nrsTtbwQt.trim();
    }

    public String getNrsTtxz() {
        return nrsTtxz;
    }

    public void setNrsTtxz(String nrsTtxz) {
        this.nrsTtxz = nrsTtxz == null ? null : nrsTtxz.trim();
    }

    public String getNrsTtxzQt() {
        return nrsTtxzQt;
    }

    public void setNrsTtxzQt(String nrsTtxzQt) {
        this.nrsTtxzQt = nrsTtxzQt == null ? null : nrsTtxzQt.trim();
    }

    public String getNrsTtsj() {
        return nrsTtsj;
    }

    public void setNrsTtsj(String nrsTtsj) {
        this.nrsTtsj = nrsTtsj == null ? null : nrsTtsj.trim();
    }

    public Long getNrsSco() {
        return nrsSco;
    }

    public void setNrsSco(Long nrsSco) {
        this.nrsSco = nrsSco;
    }

    public String getNrsMemo() {
        return nrsMemo;
    }

    public void setNrsMemo(String nrsMemo) {
        this.nrsMemo = nrsMemo == null ? null : nrsMemo.trim();
    }

    public Date getNrsDat() {
        return nrsDat;
    }

    public void setNrsDat(Date nrsDat) {
        this.nrsDat = nrsDat;
    }

    public String getNrsStatus() {
        return nrsStatus;
    }

    public void setNrsStatus(String nrsStatus) {
        this.nrsStatus = nrsStatus == null ? null : nrsStatus.trim();
    }

    public String getNrsTtkz() {
        return nrsTtkz;
    }

    public void setNrsTtkz(String nrsTtkz) {
        this.nrsTtkz = nrsTtkz == null ? null : nrsTtkz.trim();
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

    public String getTtpfTypeCod() {
        return ttpfTypeCod;
    }

    public void setTtpfTypeCod(String ttpfTypeCod) {
        this.ttpfTypeCod = ttpfTypeCod == null ? null : ttpfTypeCod.trim();
    }

    public String getTtpfNr() {
        return ttpfNr;
    }

    public void setTtpfNr(String ttpfNr) {
        this.ttpfNr = ttpfNr == null ? null : ttpfNr.trim();
    }
}