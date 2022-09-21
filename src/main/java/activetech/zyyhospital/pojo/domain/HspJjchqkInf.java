package activetech.zyyhospital.pojo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HspJjchqkInf {
    private String chqkId;

    private String emgSeq;

    private String jzcsId;

    private String ksNam;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date hjDat;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date ddDat;

    private String callerNbr;

    private String callerNam;

    private String indexNum;

    public String getChqkId() {
        return chqkId;
    }

    public void setChqkId(String chqkId) {
        this.chqkId = chqkId == null ? null : chqkId.trim();
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

    public String getKsNam() {
        return ksNam;
    }

    public void setKsNam(String ksNam) {
        this.ksNam = ksNam == null ? null : ksNam.trim();
    }

    public Date getHjDat() {
        return hjDat;
    }

    public void setHjDat(Date hjDat) {
        this.hjDat = hjDat;
    }

    public Date getDdDat() {
        return ddDat;
    }

    public void setDdDat(Date ddDat) {
        this.ddDat = ddDat;
    }

    public String getCallerNbr() {
        return callerNbr;
    }

    public void setCallerNbr(String callerNbr) {
        this.callerNbr = callerNbr == null ? null : callerNbr.trim();
    }

    public String getCallerNam() {
        return callerNam;
    }

    public void setCallerNam(String callerNam) {
        this.callerNam = callerNam == null ? null : callerNam.trim();
    }

    public String getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(String indexNum) {
        this.indexNum = indexNum == null ? null : indexNum.trim();
    }
}