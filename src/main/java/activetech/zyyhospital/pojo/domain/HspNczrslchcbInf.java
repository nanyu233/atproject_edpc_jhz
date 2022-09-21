package activetech.zyyhospital.pojo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HspNczrslchcbInf {
    private String seqno;

    private String refseqno;

    private String qrsjqszzbx;

    private String qrfbsjCod;

    private String qrfbsjQt;
    
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date ryDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date qdrslcDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date yzjhlDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date tzwqzygDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date sjnkrsxzddDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date wqddDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date wcffDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date wcsysxbbcjhsjDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date sctajcDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date fhqjsDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date xdtDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date sjnkrstyqzqrDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date rsywkssyDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date rsywjssyDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date fctlctDat;

    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date szryDat;

    private String ryzwclnctafhjzzys;

    private String ryzrsywkssyzys;

    private String memo;

    private String crtusrno;

    private String crtusrname;

    private Date crtdate;

    private String updusrno;

    private String updusrname;

    private Date upddate;

    private String texthtml;

    private String textparam;

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public String getRefseqno() {
        return refseqno;
    }

    public void setRefseqno(String refseqno) {
        this.refseqno = refseqno == null ? null : refseqno.trim();
    }

    public String getQrsjqszzbx() {
        return qrsjqszzbx;
    }

    public void setQrsjqszzbx(String qrsjqszzbx) {
        this.qrsjqszzbx = qrsjqszzbx == null ? null : qrsjqszzbx.trim();
    }

    public String getQrfbsjCod() {
        return qrfbsjCod;
    }

    public void setQrfbsjCod(String qrfbsjCod) {
        this.qrfbsjCod = qrfbsjCod == null ? null : qrfbsjCod.trim();
    }

    public String getQrfbsjQt() {
        return qrfbsjQt;
    }

    public void setQrfbsjQt(String qrfbsjQt) {
        this.qrfbsjQt = qrfbsjQt == null ? null : qrfbsjQt.trim();
    }

    public Date getRyDat() {
        return ryDat;
    }

    public void setRyDat(Date ryDat) {
        this.ryDat = ryDat;
    }

    public Date getQdrslcDat() {
        return qdrslcDat;
    }

    public void setQdrslcDat(Date qdrslcDat) {
        this.qdrslcDat = qdrslcDat;
    }

    public Date getYzjhlDat() {
        return yzjhlDat;
    }

    public void setYzjhlDat(Date yzjhlDat) {
        this.yzjhlDat = yzjhlDat;
    }

    public Date getTzwqzygDat() {
        return tzwqzygDat;
    }

    public void setTzwqzygDat(Date tzwqzygDat) {
        this.tzwqzygDat = tzwqzygDat;
    }

    public Date getSjnkrsxzddDat() {
        return sjnkrsxzddDat;
    }

    public void setSjnkrsxzddDat(Date sjnkrsxzddDat) {
        this.sjnkrsxzddDat = sjnkrsxzddDat;
    }

    public Date getWqddDat() {
        return wqddDat;
    }

    public void setWqddDat(Date wqddDat) {
        this.wqddDat = wqddDat;
    }

    public Date getWcffDat() {
        return wcffDat;
    }

    public void setWcffDat(Date wcffDat) {
        this.wcffDat = wcffDat;
    }

    public Date getWcsysxbbcjhsjDat() {
        return wcsysxbbcjhsjDat;
    }

    public void setWcsysxbbcjhsjDat(Date wcsysxbbcjhsjDat) {
        this.wcsysxbbcjhsjDat = wcsysxbbcjhsjDat;
    }

    public Date getSctajcDat() {
        return sctajcDat;
    }

    public void setSctajcDat(Date sctajcDat) {
        this.sctajcDat = sctajcDat;
    }

    public Date getFhqjsDat() {
        return fhqjsDat;
    }

    public void setFhqjsDat(Date fhqjsDat) {
        this.fhqjsDat = fhqjsDat;
    }

    public Date getXdtDat() {
        return xdtDat;
    }

    public void setXdtDat(Date xdtDat) {
        this.xdtDat = xdtDat;
    }

    public Date getSjnkrstyqzqrDat() {
        return sjnkrstyqzqrDat;
    }

    public void setSjnkrstyqzqrDat(Date sjnkrstyqzqrDat) {
        this.sjnkrstyqzqrDat = sjnkrstyqzqrDat;
    }

    public Date getRsywkssyDat() {
        return rsywkssyDat;
    }

    public void setRsywkssyDat(Date rsywkssyDat) {
        this.rsywkssyDat = rsywkssyDat;
    }

    public Date getRsywjssyDat() {
        return rsywjssyDat;
    }

    public void setRsywjssyDat(Date rsywjssyDat) {
        this.rsywjssyDat = rsywjssyDat;
    }

    public Date getFctlctDat() {
        return fctlctDat;
    }

    public void setFctlctDat(Date fctlctDat) {
        this.fctlctDat = fctlctDat;
    }

    public Date getSzryDat() {
        return szryDat;
    }

    public void setSzryDat(Date szryDat) {
        this.szryDat = szryDat;
    }

    public String getRyzwclnctafhjzzys() {
        return ryzwclnctafhjzzys;
    }

    public void setRyzwclnctafhjzzys(String ryzwclnctafhjzzys) {
        this.ryzwclnctafhjzzys = ryzwclnctafhjzzys == null ? null : ryzwclnctafhjzzys.trim();
    }

    public String getRyzrsywkssyzys() {
        return ryzrsywkssyzys;
    }

    public void setRyzrsywkssyzys(String ryzrsywkssyzys) {
        this.ryzrsywkssyzys = ryzrsywkssyzys == null ? null : ryzrsywkssyzys.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getCrtusrno() {
        return crtusrno;
    }

    public void setCrtusrno(String crtusrno) {
        this.crtusrno = crtusrno == null ? null : crtusrno.trim();
    }

    public String getCrtusrname() {
        return crtusrname;
    }

    public void setCrtusrname(String crtusrname) {
        this.crtusrname = crtusrname == null ? null : crtusrname.trim();
    }

    public Date getCrtdate() {
        return crtdate;
    }

    public void setCrtdate(Date crtdate) {
        this.crtdate = crtdate;
    }

    public String getUpdusrno() {
        return updusrno;
    }

    public void setUpdusrno(String updusrno) {
        this.updusrno = updusrno == null ? null : updusrno.trim();
    }

    public String getUpdusrname() {
        return updusrname;
    }

    public void setUpdusrname(String updusrname) {
        this.updusrname = updusrname == null ? null : updusrname.trim();
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    public String getTexthtml() {
        return texthtml;
    }

    public void setTexthtml(String texthtml) {
        this.texthtml = texthtml == null ? null : texthtml.trim();
    }

    public String getTextparam() {
        return textparam;
    }

    public void setTextparam(String textparam) {
        this.textparam = textparam == null ? null : textparam.trim();
    }
}