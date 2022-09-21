package activetech.edpc.pojo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HspCsampInf {
    private String emgSeq;

    private String itmAls;

    private String itmAqt;

    private String itmMls;

    private String itmMqt;

    private String itmPls;

    private String itmPqt;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date itmLtm;

    private String itmLfd;

    private String itmEme;

    private String usrNo;

    private String usrNme;

    private Date crtTim;

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getItmAls() {
        return itmAls;
    }

    public void setItmAls(String itmAls) {
        this.itmAls = itmAls == null ? null : itmAls.trim();
    }

    public String getItmAqt() {
        return itmAqt;
    }

    public void setItmAqt(String itmAqt) {
        this.itmAqt = itmAqt == null ? null : itmAqt.trim();
    }

    public String getItmMls() {
        return itmMls;
    }

    public void setItmMls(String itmMls) {
        this.itmMls = itmMls == null ? null : itmMls.trim();
    }

    public String getItmMqt() {
        return itmMqt;
    }

    public void setItmMqt(String itmMqt) {
        this.itmMqt = itmMqt == null ? null : itmMqt.trim();
    }

    public String getItmPls() {
        return itmPls;
    }

    public void setItmPls(String itmPls) {
        this.itmPls = itmPls == null ? null : itmPls.trim();
    }

    public String getItmPqt() {
        return itmPqt;
    }

    public void setItmPqt(String itmPqt) {
        this.itmPqt = itmPqt == null ? null : itmPqt.trim();
    }

    public Date getItmLtm() {
        return itmLtm;
    }

    public void setItmLtm(Date itmLtm) {
        this.itmLtm = itmLtm;
    }

    public String getItmLfd() {
        return itmLfd;
    }

    public void setItmLfd(String itmLfd) {
        this.itmLfd = itmLfd == null ? null : itmLfd.trim();
    }

    public String getItmEme() {
        return itmEme;
    }

    public void setItmEme(String itmEme) {
        this.itmEme = itmEme == null ? null : itmEme.trim();
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