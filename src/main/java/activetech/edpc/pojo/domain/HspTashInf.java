package activetech.edpc.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

public class HspTashInf {
    private String tashSeq;

    private String emgSeq;

    private String xhdbCod;

    private String jsyCod;

    private String ssyCod;

    private String xlCod;

    private String isFqyly;

    private String isGpgz;

    private String isGggz;

    private String isSex;

    private String tashSco;

    private BigDecimal tashPr;

    private Date crtDat;

    private String crtUsr;

    private Date modTim;

    private String modUsr;

    public String getTashSeq() {
        return tashSeq;
    }

    public void setTashSeq(String tashSeq) {
        this.tashSeq = tashSeq == null ? null : tashSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getXhdbCod() {
        return xhdbCod;
    }

    public void setXhdbCod(String xhdbCod) {
        this.xhdbCod = xhdbCod == null ? null : xhdbCod.trim();
    }

    public String getJsyCod() {
        return jsyCod;
    }

    public void setJsyCod(String jsyCod) {
        this.jsyCod = jsyCod == null ? null : jsyCod.trim();
    }

    public String getSsyCod() {
        return ssyCod;
    }

    public void setSsyCod(String ssyCod) {
        this.ssyCod = ssyCod == null ? null : ssyCod.trim();
    }

    public String getXlCod() {
        return xlCod;
    }

    public void setXlCod(String xlCod) {
        this.xlCod = xlCod == null ? null : xlCod.trim();
    }

    public String getIsFqyly() {
        return isFqyly;
    }

    public void setIsFqyly(String isFqyly) {
        this.isFqyly = isFqyly == null ? null : isFqyly.trim();
    }

    public String getIsGpgz() {
        return isGpgz;
    }

    public void setIsGpgz(String isGpgz) {
        this.isGpgz = isGpgz == null ? null : isGpgz.trim();
    }

    public String getIsGggz() {
        return isGggz;
    }

    public void setIsGggz(String isGggz) {
        this.isGggz = isGggz == null ? null : isGggz.trim();
    }

    public String getIsSex() {
        return isSex;
    }

    public void setIsSex(String isSex) {
        this.isSex = isSex == null ? null : isSex.trim();
    }

    public String getTashSco() {
        return tashSco;
    }

    public void setTashSco(String tashSco) {
        this.tashSco = tashSco == null ? null : tashSco.trim();
    }

    public BigDecimal getTashPr() {
        return tashPr;
    }

    public void setTashPr(BigDecimal tashPr) {
        this.tashPr = tashPr;
    }

    public Date getCrtDat() {
        return crtDat;
    }

    public void setCrtDat(Date crtDat) {
        this.crtDat = crtDat;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr == null ? null : crtUsr.trim();
    }

    public Date getModTim() {
        return modTim;
    }

    public void setModTim(Date modTim) {
        this.modTim = modTim;
    }

    public String getModUsr() {
        return modUsr;
    }

    public void setModUsr(String modUsr) {
        this.modUsr = modUsr == null ? null : modUsr.trim();
    }
}