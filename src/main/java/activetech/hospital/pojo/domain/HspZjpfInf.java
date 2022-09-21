package activetech.hospital.pojo.domain;

import java.util.Date;

public class HspZjpfInf {
    private String zjpfSeq;

    private String emgSeq;

    private Date jlDat;

    private String zjpfnrx;

    private Long zjpfZf;

    private String memo;

    private String pfType;

    private Date cratDat;

    private String crtUsrNo;

    private String crtUsrNme;

    public String getZjpfSeq() {
        return zjpfSeq;
    }

    public void setZjpfSeq(String zjpfSeq) {
        this.zjpfSeq = zjpfSeq == null ? null : zjpfSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Date getJlDat() {
        return jlDat;
    }

    public void setJlDat(Date jlDat) {
        this.jlDat = jlDat;
    }

    public String getZjpfnrx() {
        return zjpfnrx;
    }

    public void setZjpfnrx(String zjpfnrx) {
        this.zjpfnrx = zjpfnrx == null ? null : zjpfnrx.trim();
    }

    public Long getZjpfZf() {
        return zjpfZf;
    }

    public void setZjpfZf(Long zjpfZf) {
        this.zjpfZf = zjpfZf;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getPfType() {
        return pfType;
    }

    public void setPfType(String pfType) {
        this.pfType = pfType == null ? null : pfType.trim();
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
}