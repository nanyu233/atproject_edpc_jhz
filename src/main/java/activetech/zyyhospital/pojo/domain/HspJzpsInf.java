package activetech.zyyhospital.pojo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HspJzpsInf {
    private String jzpsId;

    private String emgSeq;

    private String jzcsId;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date zsDat;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date jgDat;

    private String ywNam;

    private String jg;

    private String sigNbr;

    private String sigNam;

    private String indexNum;

    public String getJzpsId() {
        return jzpsId;
    }

    public void setJzpsId(String jzpsId) {
        this.jzpsId = jzpsId == null ? null : jzpsId.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getJzcsId() {
        return jzcsId;
    }

    public void setJzcsId(String jzcsId) {
        this.jzcsId = jzcsId == null ? null : jzcsId.trim();
    }

    public Date getZsDat() {
        return zsDat;
    }

    public void setZsDat(Date zsDat) {
        this.zsDat = zsDat;
    }

    public Date getJgDat() {
        return jgDat;
    }

    public void setJgDat(Date jgDat) {
        this.jgDat = jgDat;
    }

    public String getYwNam() {
        return ywNam;
    }

    public void setYwNam(String ywNam) {
        this.ywNam = ywNam == null ? null : ywNam.trim();
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg == null ? null : jg.trim();
    }

    public String getSigNbr() {
        return sigNbr;
    }

    public void setSigNbr(String sigNbr) {
        this.sigNbr = sigNbr == null ? null : sigNbr.trim();
    }

    public String getSigNam() {
        return sigNam;
    }

    public void setSigNam(String sigNam) {
        this.sigNam = sigNam == null ? null : sigNam.trim();
    }

    public String getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(String indexNum) {
        this.indexNum = indexNum == null ? null : indexNum.trim();
    }
}