package activetech.aid.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AidPatientXt {
    private String xtSeq;

    private String bqpg;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date scyljc;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date wlyyry;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date zzcm;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date sfxdt;

    private String ycxdtcs;

    private String csfs;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date cssj;

    private String kxxbgy;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date gysj;

    private BigDecimal aspl;

    private BigDecimal tgrl;

    private BigDecimal lpgl;

    private String zd;

    private String yqrssc;

    private String yqrs;

    private String rscs;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date zqtyks;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date qszqty;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date rsks;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date rsjs;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date rshzy;

    private String rsyw;

    private String rsywjl;

    private String rszt;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date sfxdtqz;

    private String bqpgmx;

    private String zycs;

    private String djry;

    private String djrymc;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date djsj;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date ddyydmsj;
    
    private String ddfs;

    private String wlyy;

    public String getXtSeq() {
        return xtSeq;
    }

    public void setXtSeq(String xtSeq) {
        this.xtSeq = xtSeq == null ? null : xtSeq.trim();
    }

    public String getBqpg() {
        return bqpg;
    }

    public void setBqpg(String bqpg) {
        this.bqpg = bqpg == null ? null : bqpg.trim();
    }

    public Date getScyljc() {
        return scyljc;
    }

    public void setScyljc(Date scyljc) {
        this.scyljc = scyljc;
    }

    public Date getWlyyry() {
        return wlyyry;
    }

    public void setWlyyry(Date wlyyry) {
        this.wlyyry = wlyyry;
    }

    public Date getZzcm() {
        return zzcm;
    }

    public void setZzcm(Date zzcm) {
        this.zzcm = zzcm;
    }

    public Date getSfxdt() {
        return sfxdt;
    }

    public void setSfxdt(Date sfxdt) {
        this.sfxdt = sfxdt;
    }

    public String getYcxdtcs() {
        return ycxdtcs;
    }

    public void setYcxdtcs(String ycxdtcs) {
        this.ycxdtcs = ycxdtcs == null ? null : ycxdtcs.trim();
    }

    public String getCsfs() {
        return csfs;
    }

    public void setCsfs(String csfs) {
        this.csfs = csfs == null ? null : csfs.trim();
    }

    public Date getCssj() {
        return cssj;
    }

    public void setCssj(Date cssj) {
        this.cssj = cssj;
    }

    public String getKxxbgy() {
        return kxxbgy;
    }

    public void setKxxbgy(String kxxbgy) {
        this.kxxbgy = kxxbgy == null ? null : kxxbgy.trim();
    }

    public Date getGysj() {
        return gysj;
    }

    public void setGysj(Date gysj) {
        this.gysj = gysj;
    }

    public BigDecimal getAspl() {
        return aspl;
    }

    public void setAspl(BigDecimal aspl) {
        this.aspl = aspl;
    }

    public BigDecimal getTgrl() {
        return tgrl;
    }

    public void setTgrl(BigDecimal tgrl) {
        this.tgrl = tgrl;
    }

    public BigDecimal getLpgl() {
        return lpgl;
    }

    public void setLpgl(BigDecimal lpgl) {
        this.lpgl = lpgl;
    }

    public String getZd() {
        return zd;
    }

    public void setZd(String zd) {
        this.zd = zd == null ? null : zd.trim();
    }

    public String getYqrssc() {
        return yqrssc;
    }

    public void setYqrssc(String yqrssc) {
        this.yqrssc = yqrssc == null ? null : yqrssc.trim();
    }

    public String getYqrs() {
        return yqrs;
    }

    public void setYqrs(String yqrs) {
        this.yqrs = yqrs == null ? null : yqrs.trim();
    }

    public String getRscs() {
        return rscs;
    }

    public void setRscs(String rscs) {
        this.rscs = rscs == null ? null : rscs.trim();
    }

    public Date getZqtyks() {
        return zqtyks;
    }

    public void setZqtyks(Date zqtyks) {
        this.zqtyks = zqtyks;
    }

    public Date getQszqty() {
        return qszqty;
    }

    public void setQszqty(Date qszqty) {
        this.qszqty = qszqty;
    }

    public Date getRsks() {
        return rsks;
    }

    public void setRsks(Date rsks) {
        this.rsks = rsks;
    }

    public Date getRsjs() {
        return rsjs;
    }

    public void setRsjs(Date rsjs) {
        this.rsjs = rsjs;
    }

    public Date getRshzy() {
        return rshzy;
    }

    public void setRshzy(Date rshzy) {
        this.rshzy = rshzy;
    }

    public String getRsyw() {
        return rsyw;
    }

    public void setRsyw(String rsyw) {
        this.rsyw = rsyw == null ? null : rsyw.trim();
    }

    public String getRsywjl() {
        return rsywjl;
    }

    public void setRsywjl(String rsywjl) {
        this.rsywjl = rsywjl == null ? null : rsywjl.trim();
    }

    public String getRszt() {
        return rszt;
    }

    public void setRszt(String rszt) {
        this.rszt = rszt == null ? null : rszt.trim();
    }

    public Date getSfxdtqz() {
        return sfxdtqz;
    }

    public void setSfxdtqz(Date sfxdtqz) {
        this.sfxdtqz = sfxdtqz;
    }

    public String getBqpgmx() {
        return bqpgmx;
    }

    public void setBqpgmx(String bqpgmx) {
        this.bqpgmx = bqpgmx == null ? null : bqpgmx.trim();
    }

    public String getZycs() {
        return zycs;
    }

    public void setZycs(String zycs) {
        this.zycs = zycs == null ? null : zycs.trim();
    }

    public String getDjry() {
        return djry;
    }

    public void setDjry(String djry) {
        this.djry = djry == null ? null : djry.trim();
    }

    public String getDjrymc() {
        return djrymc;
    }

    public void setDjrymc(String djrymc) {
        this.djrymc = djrymc == null ? null : djrymc.trim();
    }

    public Date getDjsj() {
        return djsj;
    }

    public void setDjsj(Date djsj) {
        this.djsj = djsj;
    }

    public Date getDdyydmsj() {
        return ddyydmsj;
    }

    public void setDdyydmsj(Date ddyydmsj) {
        this.ddyydmsj = ddyydmsj;
    }

    public String getDdfs() {
        return ddfs;
    }

    public void setDdfs(String ddfs) {
        this.ddfs = ddfs == null ? null : ddfs.trim();
    }

    public String getWlyy() {
        return wlyy;
    }

    public void setWlyy(String wlyy) {
        this.wlyy = wlyy == null ? null : wlyy.trim();
    }
}