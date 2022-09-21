package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

public class HspXwhljldInf {
    /**
     * 洗胃护理评估号
     */
    private String xwhiSeq;

    /**
     * 预检号
     */
    private String emgSeq;

    /**
     * 评估时间
     */
    private Date assDat;

    /**
     * 评估人姓名
     */
    private String assName;

    /**
     * 心率
     */
    private Short hrtRte;

    /**
     * 呼吸
     */
    private Short breNbr;

    /**
     * 血氧
     */
    private Short spo2;

    /**
     * 收缩上压
     */
    private Short sbpUpNbr;

    /**
     * 收缩下压
     */
    private Short sbpDownNbr;

    /**
     * 毒物|dstdicttype(DW_COD)
     */
    private String dwCod;

    /**
     * 药名1
     */
    private String dwYm1;

    /**
     * 药名2
     */
    private String dwYm2;

    /**
     * 药名3
     */
    private String dwYm3;

    /**
     * 洗胃液种类|dstdicttype(XWE_COD)
     */
    private String xwyCod;

    /**
     * 洗胃液温度
     */
    private BigDecimal xwyWd;

    /**
     * 洗胃液入量
     */
    private String xwyRl;

    /**
     * 洗出液颜色
     */
    private String xcyYs;

    /**
     * 洗出液性质
     */
    private String xcyXz;

    /**
     * 洗出液出量
     */
    private String xcyCl;

    /**
     * 是否面色苍白（0：无；1：有）
     */
    private String mscbCod;

    /**
     * 是否恶心（0：无；1：有）
     */
    private String exCod;

    /**
     * 是否呕吐（0：无；1：有）
     */
    private String otCod;

    /**
     * 是否腹部膨隆（0：无；1：有）
     */
    private String fbplCod;

    /**
     * 是否腹胀（0：无；1：有）
     */
    private String fzCod;

    /**
     * 是否腹痛（0：无；1：有）
     */
    private String ftCod;

    /**
     * 洗胃体征其他
     */
    private String xwtzQt;

    /**
     * 洗胃液其他
     */
    private String xwyQt;

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

    public String getXwhiSeq() {
        return xwhiSeq;
    }

    public void setXwhiSeq(String xwhiSeq) {
        this.xwhiSeq = xwhiSeq == null ? null : xwhiSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Date getAssDat() {
        return assDat;
    }

    public void setAssDat(Date assDat) {
        this.assDat = assDat;
    }

    public String getAssName() {
        return assName;
    }

    public void setAssName(String assName) {
        this.assName = assName == null ? null : assName.trim();
    }

    public Short getHrtRte() {
        return hrtRte;
    }

    public void setHrtRte(Short hrtRte) {
        this.hrtRte = hrtRte;
    }

    public Short getBreNbr() {
        return breNbr;
    }

    public void setBreNbr(Short breNbr) {
        this.breNbr = breNbr;
    }

    public Short getSpo2() {
        return spo2;
    }

    public void setSpo2(Short spo2) {
        this.spo2 = spo2;
    }

    public Short getSbpUpNbr() {
        return sbpUpNbr;
    }

    public void setSbpUpNbr(Short sbpUpNbr) {
        this.sbpUpNbr = sbpUpNbr;
    }

    public Short getSbpDownNbr() {
        return sbpDownNbr;
    }

    public void setSbpDownNbr(Short sbpDownNbr) {
        this.sbpDownNbr = sbpDownNbr;
    }

    public String getDwCod() {
        return dwCod;
    }

    public void setDwCod(String dwCod) {
        this.dwCod = dwCod == null ? null : dwCod.trim();
    }

    public String getDwYm1() {
        return dwYm1;
    }

    public void setDwYm1(String dwYm1) {
        this.dwYm1 = dwYm1 == null ? null : dwYm1.trim();
    }

    public String getDwYm2() {
        return dwYm2;
    }

    public void setDwYm2(String dwYm2) {
        this.dwYm2 = dwYm2 == null ? null : dwYm2.trim();
    }

    public String getDwYm3() {
        return dwYm3;
    }

    public void setDwYm3(String dwYm3) {
        this.dwYm3 = dwYm3 == null ? null : dwYm3.trim();
    }

    public String getXwyCod() {
        return xwyCod;
    }

    public void setXwyCod(String xwyCod) {
        this.xwyCod = xwyCod == null ? null : xwyCod.trim();
    }

    public BigDecimal getXwyWd() {
        return xwyWd;
    }

    public void setXwyWd(BigDecimal xwyWd) {
        this.xwyWd = xwyWd;
    }

    public String getXwyRl() {
        return xwyRl;
    }

    public void setXwyRl(String xwyRl) {
        this.xwyRl = xwyRl == null ? null : xwyRl.trim();
    }

    public String getXcyYs() {
        return xcyYs;
    }

    public void setXcyYs(String xcyYs) {
        this.xcyYs = xcyYs == null ? null : xcyYs.trim();
    }

    public String getXcyXz() {
        return xcyXz;
    }

    public void setXcyXz(String xcyXz) {
        this.xcyXz = xcyXz == null ? null : xcyXz.trim();
    }

    public String getXcyCl() {
        return xcyCl;
    }

    public void setXcyCl(String xcyCl) {
        this.xcyCl = xcyCl == null ? null : xcyCl.trim();
    }

    public String getMscbCod() {
        return mscbCod;
    }

    public void setMscbCod(String mscbCod) {
        this.mscbCod = mscbCod == null ? null : mscbCod.trim();
    }

    public String getExCod() {
        return exCod;
    }

    public void setExCod(String exCod) {
        this.exCod = exCod == null ? null : exCod.trim();
    }

    public String getOtCod() {
        return otCod;
    }

    public void setOtCod(String otCod) {
        this.otCod = otCod == null ? null : otCod.trim();
    }

    public String getFbplCod() {
        return fbplCod;
    }

    public void setFbplCod(String fbplCod) {
        this.fbplCod = fbplCod == null ? null : fbplCod.trim();
    }

    public String getFzCod() {
        return fzCod;
    }

    public void setFzCod(String fzCod) {
        this.fzCod = fzCod == null ? null : fzCod.trim();
    }

    public String getFtCod() {
        return ftCod;
    }

    public void setFtCod(String ftCod) {
        this.ftCod = ftCod == null ? null : ftCod.trim();
    }

    public String getXwtzQt() {
        return xwtzQt;
    }

    public void setXwtzQt(String xwtzQt) {
        this.xwtzQt = xwtzQt == null ? null : xwtzQt.trim();
    }

    public String getXwyQt() {
        return xwyQt;
    }

    public void setXwyQt(String xwyQt) {
        this.xwyQt = xwyQt == null ? null : xwyQt.trim();
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