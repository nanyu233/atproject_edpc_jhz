package activetech.hospital.pojo.domain;

import java.util.Date;

public class HspFastInf {
    private String emgSeq;

    private String mtCod;

    private String szthCod;

    private String wlCod;

    private String czFlag;

    private Date fastcrtDat;

    private String fastcrtNbr;

    private Date fastupdDat;

    private String fastupdNbr;

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getMtCod() {
        return mtCod;
    }

    public void setMtCod(String mtCod) {
        this.mtCod = mtCod == null ? null : mtCod.trim();
    }

    public String getSzthCod() {
        return szthCod;
    }

    public void setSzthCod(String szthCod) {
        this.szthCod = szthCod == null ? null : szthCod.trim();
    }

    public String getWlCod() {
        return wlCod;
    }

    public void setWlCod(String wlCod) {
        this.wlCod = wlCod == null ? null : wlCod.trim();
    }

    public String getCzFlag() {
        return czFlag;
    }

    public void setCzFlag(String czFlag) {
        this.czFlag = czFlag == null ? null : czFlag.trim();
    }

    public Date getFastcrtDat() {
        return fastcrtDat;
    }

    public void setFastcrtDat(Date fastcrtDat) {
        this.fastcrtDat = fastcrtDat;
    }

    public String getFastcrtNbr() {
        return fastcrtNbr;
    }

    public void setFastcrtNbr(String fastcrtNbr) {
        this.fastcrtNbr = fastcrtNbr == null ? null : fastcrtNbr.trim();
    }

    public Date getFastupdDat() {
        return fastupdDat;
    }

    public void setFastupdDat(Date fastupdDat) {
        this.fastupdDat = fastupdDat;
    }

    public String getFastupdNbr() {
        return fastupdNbr;
    }

    public void setFastupdNbr(String fastupdNbr) {
        this.fastupdNbr = fastupdNbr == null ? null : fastupdNbr.trim();
    }
}