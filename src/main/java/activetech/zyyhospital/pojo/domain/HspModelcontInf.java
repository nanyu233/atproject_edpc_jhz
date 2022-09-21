package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

public class HspModelcontInf {
    private String modelcontSeq;

    private String modelSeq;

    private String majorCls;

    private String subCls;

    private String clsCont;

    private BigDecimal clsSort;

    private String remark;

    private Date crtDat;

    private String crtNbr;

    private Date updDat;

    private String updNbr;

    public String getModelcontSeq() {
        return modelcontSeq;
    }

    public void setModelcontSeq(String modelcontSeq) {
        this.modelcontSeq = modelcontSeq == null ? null : modelcontSeq.trim();
    }

    public String getModelSeq() {
        return modelSeq;
    }

    public void setModelSeq(String modelSeq) {
        this.modelSeq = modelSeq == null ? null : modelSeq.trim();
    }

    public String getMajorCls() {
        return majorCls;
    }

    public void setMajorCls(String majorCls) {
        this.majorCls = majorCls == null ? null : majorCls.trim();
    }

    public String getSubCls() {
        return subCls;
    }

    public void setSubCls(String subCls) {
        this.subCls = subCls == null ? null : subCls.trim();
    }

    public String getClsCont() {
        return clsCont;
    }

    public void setClsCont(String clsCont) {
        this.clsCont = clsCont == null ? null : clsCont.trim();
    }

    public BigDecimal getClsSort() {
        return clsSort;
    }

    public void setClsSort(BigDecimal clsSort) {
        this.clsSort = clsSort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCrtDat() {
        return crtDat;
    }

    public void setCrtDat(Date crtDat) {
        this.crtDat = crtDat;
    }

    public String getCrtNbr() {
        return crtNbr;
    }

    public void setCrtNbr(String crtNbr) {
        this.crtNbr = crtNbr == null ? null : crtNbr.trim();
    }

    public Date getUpdDat() {
        return updDat;
    }

    public void setUpdDat(Date updDat) {
        this.updDat = updDat;
    }

    public String getUpdNbr() {
        return updNbr;
    }

    public void setUpdNbr(String updNbr) {
        this.updNbr = updNbr == null ? null : updNbr.trim();
    }
}