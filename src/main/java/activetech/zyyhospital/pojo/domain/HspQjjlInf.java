package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspQjjlInf {
    /**
     * 抢救记录号       | 
     */
    private String qjjlSeq;

    /**
     * 预检号           | 
     */
    private String emgSeq;

    /**
     * 抢救开始时间
     */
    private Date qjjlDatStart;

    /**
     * 医生签名
     */
    private String docSign;

    /**
     * 创建日期         | 
     */
    private Date createDat;

    /**
     * 修改日期         | 
     */
    private Date updateDat;

    /**
     * 修改人编号       | 
     */
    private String updateNum;

    /**
     * 修改人姓名       | 
     */
    private String updateNam;

    /**
     * 记录日期
     */
    private Date qjjlJldat;

    /**
     * 参与抢救人员
     */
    private String qjjlJlnam;

    /**
     * 续打控制FLG
     */
    private String isprint;

    /**
     * 抢救结束时间
     */
    private Date qjjlDatEnd;

    /**
     * 经管医生
     */
    private String manageDoc;

    /**
     * 上级医生
     */
    private String superiorDoc;

    /**
     * 记录内容
     */
    private String qjjlContent;

    public String getQjjlSeq() {
        return qjjlSeq;
    }

    public void setQjjlSeq(String qjjlSeq) {
        this.qjjlSeq = qjjlSeq == null ? null : qjjlSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Date getQjjlDatStart() {
        return qjjlDatStart;
    }

    public void setQjjlDatStart(Date qjjlDatStart) {
        this.qjjlDatStart = qjjlDatStart;
    }

    public String getDocSign() {
        return docSign;
    }

    public void setDocSign(String docSign) {
        this.docSign = docSign == null ? null : docSign.trim();
    }

    public Date getCreateDat() {
        return createDat;
    }

    public void setCreateDat(Date createDat) {
        this.createDat = createDat;
    }

    public Date getUpdateDat() {
        return updateDat;
    }

    public void setUpdateDat(Date updateDat) {
        this.updateDat = updateDat;
    }

    public String getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(String updateNum) {
        this.updateNum = updateNum == null ? null : updateNum.trim();
    }

    public String getUpdateNam() {
        return updateNam;
    }

    public void setUpdateNam(String updateNam) {
        this.updateNam = updateNam == null ? null : updateNam.trim();
    }

    public Date getQjjlJldat() {
        return qjjlJldat;
    }

    public void setQjjlJldat(Date qjjlJldat) {
        this.qjjlJldat = qjjlJldat;
    }

    public String getQjjlJlnam() {
        return qjjlJlnam;
    }

    public void setQjjlJlnam(String qjjlJlnam) {
        this.qjjlJlnam = qjjlJlnam == null ? null : qjjlJlnam.trim();
    }

    public String getIsprint() {
        return isprint;
    }

    public void setIsprint(String isprint) {
        this.isprint = isprint == null ? null : isprint.trim();
    }

    public Date getQjjlDatEnd() {
        return qjjlDatEnd;
    }

    public void setQjjlDatEnd(Date qjjlDatEnd) {
        this.qjjlDatEnd = qjjlDatEnd;
    }

    public String getManageDoc() {
        return manageDoc;
    }

    public void setManageDoc(String manageDoc) {
        this.manageDoc = manageDoc == null ? null : manageDoc.trim();
    }

    public String getSuperiorDoc() {
        return superiorDoc;
    }

    public void setSuperiorDoc(String superiorDoc) {
        this.superiorDoc = superiorDoc == null ? null : superiorDoc.trim();
    }

    public String getQjjlContent() {
        return qjjlContent;
    }

    public void setQjjlContent(String qjjlContent) {
        this.qjjlContent = qjjlContent == null ? null : qjjlContent.trim();
    }
}