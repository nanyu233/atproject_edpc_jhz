package activetech.edpc.pojo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HspCrivelInf {
    private String velSeq;

    private String emgSeq;

    private String xzcd;

    private String zystimixl;

    private String zjnxs;

    private String sffcbb;

    private String sfcto;

    private String ghbb;

    private String zfbb;

    private String pci;

    private String szcl;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date dstgsj;

    private String shtimixl;

    private String zrzjgs;

    private String zjzl;

    public String getVelSeq() {
        return velSeq;
    }

    public void setVelSeq(String velSeq) {
        this.velSeq = velSeq == null ? null : velSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getXzcd() {
        return xzcd;
    }

    public void setXzcd(String xzcd) {
        this.xzcd = xzcd == null ? null : xzcd.trim();
    }

    public String getZystimixl() {
        return zystimixl;
    }

    public void setZystimixl(String zystimixl) {
        this.zystimixl = zystimixl == null ? null : zystimixl.trim();
    }

    public String getZjnxs() {
        return zjnxs;
    }

    public void setZjnxs(String zjnxs) {
        this.zjnxs = zjnxs == null ? null : zjnxs.trim();
    }

    public String getSffcbb() {
        return sffcbb;
    }

    public void setSffcbb(String sffcbb) {
        this.sffcbb = sffcbb == null ? null : sffcbb.trim();
    }

    public String getSfcto() {
        return sfcto;
    }

    public void setSfcto(String sfcto) {
        this.sfcto = sfcto == null ? null : sfcto.trim();
    }

    public String getGhbb() {
        return ghbb;
    }

    public void setGhbb(String ghbb) {
        this.ghbb = ghbb == null ? null : ghbb.trim();
    }

    public String getZfbb() {
        return zfbb;
    }

    public void setZfbb(String zfbb) {
        this.zfbb = zfbb == null ? null : zfbb.trim();
    }

    public String getPci() {
        return pci;
    }

    public void setPci(String pci) {
        this.pci = pci == null ? null : pci.trim();
    }

    public String getSzcl() {
        return szcl;
    }

    public void setSzcl(String szcl) {
        this.szcl = szcl == null ? null : szcl.trim();
    }

    public Date getDstgsj() {
        return dstgsj;
    }

    public void setDstgsj(Date dstgsj) {
        this.dstgsj = dstgsj;
    }

    public String getShtimixl() {
        return shtimixl;
    }

    public void setShtimixl(String shtimixl) {
        this.shtimixl = shtimixl == null ? null : shtimixl.trim();
    }

    public String getZrzjgs() {
        return zrzjgs;
    }

    public void setZrzjgs(String zrzjgs) {
        this.zrzjgs = zrzjgs == null ? null : zrzjgs.trim();
    }

    public String getZjzl() {
        return zjzl;
    }

    public void setZjzl(String zjzl) {
        this.zjzl = zjzl == null ? null : zjzl.trim();
    }
}