package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspJxtqhljldInf {
    /**
     * 机械通气护理评估号
     */
    private String jxtqSeq;

    /**
     * 预检号
     */
    private String emgSeq;

    /**
     * 机械通气模式|dstdicttype(MS_COD)
     */
    private String msCod;

    /**
     * 氧浓度
     */
    private String jxtqYnd;

    /**
     * 潮气量
     */
    private String jxtqCql;

    /**
     * 频率
     */
    private String jxtqPl;

    /**
     * PEEP(cmH20)
     */
    private String jxtqPeep;

    /**
     * 呼吸比
     */
    private String jxtqHxb;

    /**
     * 记录时间
     */
    private Date recordDat;

    /**
     * 创建时间
     */
    private Date crtDat;

    /**
     * 创建人用户号
     */
    private String crtNur;

    /**
     * 创建人姓名
     */
    private String crtName;

    /**
     * 修改日期
     */
    private Date upDat;

    /**
     * 修改人用户号
     */
    private String upNur;

    /**
     * 修改人用户名
     */
    private String upName;

    public String getJxtqSeq() {
        return jxtqSeq;
    }

    public void setJxtqSeq(String jxtqSeq) {
        this.jxtqSeq = jxtqSeq == null ? null : jxtqSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getMsCod() {
        return msCod;
    }

    public void setMsCod(String msCod) {
        this.msCod = msCod == null ? null : msCod.trim();
    }

    public String getJxtqYnd() {
        return jxtqYnd;
    }

    public void setJxtqYnd(String jxtqYnd) {
        this.jxtqYnd = jxtqYnd == null ? null : jxtqYnd.trim();
    }

    public String getJxtqCql() {
        return jxtqCql;
    }

    public void setJxtqCql(String jxtqCql) {
        this.jxtqCql = jxtqCql == null ? null : jxtqCql.trim();
    }

    public String getJxtqPl() {
        return jxtqPl;
    }

    public void setJxtqPl(String jxtqPl) {
        this.jxtqPl = jxtqPl == null ? null : jxtqPl.trim();
    }

    public String getJxtqPeep() {
        return jxtqPeep;
    }

    public void setJxtqPeep(String jxtqPeep) {
        this.jxtqPeep = jxtqPeep == null ? null : jxtqPeep.trim();
    }

    public String getJxtqHxb() {
        return jxtqHxb;
    }

    public void setJxtqHxb(String jxtqHxb) {
        this.jxtqHxb = jxtqHxb == null ? null : jxtqHxb.trim();
    }

    public Date getRecordDat() {
        return recordDat;
    }

    public void setRecordDat(Date recordDat) {
        this.recordDat = recordDat;
    }

    public Date getCrtDat() {
        return crtDat;
    }

    public void setCrtDat(Date crtDat) {
        this.crtDat = crtDat;
    }

    public String getCrtNur() {
        return crtNur;
    }

    public void setCrtNur(String crtNur) {
        this.crtNur = crtNur == null ? null : crtNur.trim();
    }

    public String getCrtName() {
        return crtName;
    }

    public void setCrtName(String crtName) {
        this.crtName = crtName == null ? null : crtName.trim();
    }

    public Date getUpDat() {
        return upDat;
    }

    public void setUpDat(Date upDat) {
        this.upDat = upDat;
    }

    public String getUpNur() {
        return upNur;
    }

    public void setUpNur(String upNur) {
        this.upNur = upNur == null ? null : upNur.trim();
    }

    public String getUpName() {
        return upName;
    }

    public void setUpName(String upName) {
        this.upName = upName == null ? null : upName.trim();
    }
}