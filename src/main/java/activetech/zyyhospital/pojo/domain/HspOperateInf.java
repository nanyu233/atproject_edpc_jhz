package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspOperateInf {
    /**
     * 手术操作id
     */
    private String operSeq;

    /**
     * 预检号
     */
    private String emgSeq;

    /**
     * 手术操作名称
     */
    private String operNam;

    /**
     * 手术操作日期
     */
    private Date operDat;

    /**
     * 手术操作医生
     */
    private String operYs;

    /**
     * 创建日期
     */
    private Date creDat;

    /**
     * 创建人号
     */
    private String creCod;

    /**
     * 创建人名
     */
    private String creNam;

    /**
     * 修改日期
     */
    private Date updDat;

    /**
     * 修改人号
     */
    private String updCod;

    /**
     * 修改人名
     */
    private String updNam;

    /**
     * 手术病程记录
     */
    private String operBcjl;

    /**
     * 手术操作码 关联定义表 hsp_operation_dict
     */
    private String operationCode;

    /**
     * 打印状态
     */
    private String isprint;

    public String getOperSeq() {
        return operSeq;
    }

    public void setOperSeq(String operSeq) {
        this.operSeq = operSeq == null ? null : operSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getOperNam() {
        return operNam;
    }

    public void setOperNam(String operNam) {
        this.operNam = operNam == null ? null : operNam.trim();
    }

    public Date getOperDat() {
        return operDat;
    }

    public void setOperDat(Date operDat) {
        this.operDat = operDat;
    }

    public String getOperYs() {
        return operYs;
    }

    public void setOperYs(String operYs) {
        this.operYs = operYs == null ? null : operYs.trim();
    }

    public Date getCreDat() {
        return creDat;
    }

    public void setCreDat(Date creDat) {
        this.creDat = creDat;
    }

    public String getCreCod() {
        return creCod;
    }

    public void setCreCod(String creCod) {
        this.creCod = creCod == null ? null : creCod.trim();
    }

    public String getCreNam() {
        return creNam;
    }

    public void setCreNam(String creNam) {
        this.creNam = creNam == null ? null : creNam.trim();
    }

    public Date getUpdDat() {
        return updDat;
    }

    public void setUpdDat(Date updDat) {
        this.updDat = updDat;
    }

    public String getUpdCod() {
        return updCod;
    }

    public void setUpdCod(String updCod) {
        this.updCod = updCod == null ? null : updCod.trim();
    }

    public String getUpdNam() {
        return updNam;
    }

    public void setUpdNam(String updNam) {
        this.updNam = updNam == null ? null : updNam.trim();
    }

    public String getOperBcjl() {
        return operBcjl;
    }

    public void setOperBcjl(String operBcjl) {
        this.operBcjl = operBcjl == null ? null : operBcjl.trim();
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    public String getIsprint() {
        return isprint;
    }

    public void setIsprint(String isprint) {
        this.isprint = isprint == null ? null : isprint.trim();
    }
}