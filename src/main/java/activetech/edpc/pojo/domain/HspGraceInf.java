package activetech.edpc.pojo.domain;

import java.util.Date;

public class HspGraceInf {
    private String graceSeq;

    private String emgSeq;

    private String wxys;

    private String gracejgwtj;

    private String cstAge;

    private String jgdb;

    private String killip;

    private Short total;

    private Date crtDate;

    private String crtUser;

    private String graceType;

    private String mpi;

    private Integer jzxh;

    private Short hrtRte;

    private Short sbpupNbr;

    public String getGraceSeq() {
        return graceSeq;
    }

    public void setGraceSeq(String graceSeq) {
        this.graceSeq = graceSeq == null ? null : graceSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getWxys() {
        return wxys;
    }

    public void setWxys(String wxys) {
        this.wxys = wxys == null ? null : wxys.trim();
    }

    public String getGracejgwtj() {
        return gracejgwtj;
    }

    public void setGracejgwtj(String gracejgwtj) {
        this.gracejgwtj = gracejgwtj == null ? null : gracejgwtj.trim();
    }

    public String getCstAge() {
        return cstAge;
    }

    public void setCstAge(String cstAge) {
        this.cstAge = cstAge == null ? null : cstAge.trim();
    }

    public String getJgdb() {
        return jgdb;
    }

    public void setJgdb(String jgdb) {
        this.jgdb = jgdb == null ? null : jgdb.trim();
    }

    public String getKillip() {
        return killip;
    }

    public void setKillip(String killip) {
        this.killip = killip == null ? null : killip.trim();
    }

    public Short getTotal() {
        return total;
    }

    public void setTotal(Short total) {
        this.total = total;
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }

    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser == null ? null : crtUser.trim();
    }

    public String getGraceType() {
        return graceType;
    }

    public void setGraceType(String graceType) {
        this.graceType = graceType == null ? null : graceType.trim();
    }

    public String getMpi() {
        return mpi;
    }

    public void setMpi(String mpi) {
        this.mpi = mpi == null ? null : mpi.trim();
    }

    public Integer getJzxh() {
        return jzxh;
    }

    public void setJzxh(Integer jzxh) {
        this.jzxh = jzxh;
    }

    public Short getHrtRte() {
        return hrtRte;
    }

    public void setHrtRte(Short hrtRte) {
        this.hrtRte = hrtRte;
    }

    public Short getSbpupNbr() {
        return sbpupNbr;
    }

    public void setSbpupNbr(Short sbpupNbr) {
        this.sbpupNbr = sbpupNbr;
    }
}