package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspGlcs {
    private String emgSeq;

    private String jcgl;

    private String kqgl;

    private String fmgl;

    private String bhxgl;

    private Date crtdat;

    private String crtnbr;

    private Date upddat;

    private String updnbr;

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getJcgl() {
        return jcgl;
    }

    public void setJcgl(String jcgl) {
        this.jcgl = jcgl == null ? null : jcgl.trim();
    }

    public String getKqgl() {
        return kqgl;
    }

    public void setKqgl(String kqgl) {
        this.kqgl = kqgl == null ? null : kqgl.trim();
    }

    public String getFmgl() {
        return fmgl;
    }

    public void setFmgl(String fmgl) {
        this.fmgl = fmgl == null ? null : fmgl.trim();
    }

    public String getBhxgl() {
        return bhxgl;
    }

    public void setBhxgl(String bhxgl) {
        this.bhxgl = bhxgl == null ? null : bhxgl.trim();
    }

    public Date getCrtdat() {
        return crtdat;
    }

    public void setCrtdat(Date crtdat) {
        this.crtdat = crtdat;
    }

    public String getCrtnbr() {
        return crtnbr;
    }

    public void setCrtnbr(String crtnbr) {
        this.crtnbr = crtnbr == null ? null : crtnbr.trim();
    }

    public Date getUpddat() {
        return upddat;
    }

    public void setUpddat(Date upddat) {
        this.upddat = upddat;
    }

    public String getUpdnbr() {
        return updnbr;
    }

    public void setUpdnbr(String updnbr) {
        this.updnbr = updnbr == null ? null : updnbr.trim();
    }
}