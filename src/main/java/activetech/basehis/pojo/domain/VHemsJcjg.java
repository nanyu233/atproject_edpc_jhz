package activetech.basehis.pojo.domain;

import java.util.Date;

public class VHemsJcjg {
    private String zyh;

    private String xm;

    private String ylmc;

    private String jcjg;

    private String see;

    private String jcysxm;

    private Date shrq;

    public String getZyh() {
        return zyh;
    }

    public void setZyh(String zyh) {
        this.zyh = zyh == null ? null : zyh.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getYlmc() {
        return ylmc;
    }

    public void setYlmc(String ylmc) {
        this.ylmc = ylmc == null ? null : ylmc.trim();
    }

    public String getJcjg() {
        return jcjg;
    }

    public void setJcjg(String jcjg) {
        this.jcjg = jcjg == null ? null : jcjg.trim();
    }

    public String getSee() {
        return see;
    }

    public void setSee(String see) {
        this.see = see == null ? null : see.trim();
    }

    public String getJcysxm() {
        return jcysxm;
    }

    public void setJcysxm(String jcysxm) {
        this.jcysxm = jcysxm == null ? null : jcysxm.trim();
    }

    public Date getShrq() {
        return shrq;
    }

    public void setShrq(Date shrq) {
        this.shrq = shrq;
    }
}