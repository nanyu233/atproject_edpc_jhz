package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspFallassInf {
    private String fallassSeq;

    private String emgSeq;

    private String fallAssCod;

    private String fallAssess;

    private String fallMemo;

    private String fallUsrno;

    private String fallUsrnam;

    private Date fallDate;

    public String getFallassSeq() {
        return fallassSeq;
    }

    public void setFallassSeq(String fallassSeq) {
        this.fallassSeq = fallassSeq == null ? null : fallassSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getFallAssCod() {
        return fallAssCod;
    }

    public void setFallAssCod(String fallAssCod) {
        this.fallAssCod = fallAssCod == null ? null : fallAssCod.trim();
    }

    public String getFallAssess() {
        return fallAssess;
    }

    public void setFallAssess(String fallAssess) {
        this.fallAssess = fallAssess == null ? null : fallAssess.trim();
    }

    public String getFallMemo() {
        return fallMemo;
    }

    public void setFallMemo(String fallMemo) {
        this.fallMemo = fallMemo == null ? null : fallMemo.trim();
    }

    public String getFallUsrno() {
        return fallUsrno;
    }

    public void setFallUsrno(String fallUsrno) {
        this.fallUsrno = fallUsrno == null ? null : fallUsrno.trim();
    }

    public String getFallUsrnam() {
        return fallUsrnam;
    }

    public void setFallUsrnam(String fallUsrnam) {
        this.fallUsrnam = fallUsrnam == null ? null : fallUsrnam.trim();
    }

    public Date getFallDate() {
        return fallDate;
    }

    public void setFallDate(Date fallDate) {
        this.fallDate = fallDate;
    }
}