package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

public class HspJmxsfxyspgb {
    private String riskSeq;

    private String emgSeq;

    private String mgwxysACod;

    private String mgwxysBCod;

    private String mgwxysCCod;

    private String mgwxysDCod;

    private BigDecimal totalSco;

    private String assessDoc;

    private String assessDate;

    private Date createDate;

    private Date updateDate;

    private String createDoc;

    private String updateDoc;

    private String assessDocNam;

    public String getRiskSeq() {
        return riskSeq;
    }

    public void setRiskSeq(String riskSeq) {
        this.riskSeq = riskSeq == null ? null : riskSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getMgwxysACod() {
        return mgwxysACod;
    }

    public void setMgwxysACod(String mgwxysACod) {
        this.mgwxysACod = mgwxysACod == null ? null : mgwxysACod.trim();
    }

    public String getMgwxysBCod() {
        return mgwxysBCod;
    }

    public void setMgwxysBCod(String mgwxysBCod) {
        this.mgwxysBCod = mgwxysBCod == null ? null : mgwxysBCod.trim();
    }

    public String getMgwxysCCod() {
        return mgwxysCCod;
    }

    public void setMgwxysCCod(String mgwxysCCod) {
        this.mgwxysCCod = mgwxysCCod == null ? null : mgwxysCCod.trim();
    }

    public String getMgwxysDCod() {
        return mgwxysDCod;
    }

    public void setMgwxysDCod(String mgwxysDCod) {
        this.mgwxysDCod = mgwxysDCod == null ? null : mgwxysDCod.trim();
    }

    public BigDecimal getTotalSco() {
        return totalSco;
    }

    public void setTotalSco(BigDecimal totalSco) {
        this.totalSco = totalSco;
    }

    public String getAssessDoc() {
        return assessDoc;
    }

    public void setAssessDoc(String assessDoc) {
        this.assessDoc = assessDoc == null ? null : assessDoc.trim();
    }

    public String getAssessDate() {
        return assessDate;
    }

    public void setAssessDate(String assessDate) {
        this.assessDate = assessDate == null ? null : assessDate.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateDoc() {
        return createDoc;
    }

    public void setCreateDoc(String createDoc) {
        this.createDoc = createDoc == null ? null : createDoc.trim();
    }

    public String getUpdateDoc() {
        return updateDoc;
    }

    public void setUpdateDoc(String updateDoc) {
        this.updateDoc = updateDoc == null ? null : updateDoc.trim();
    }

    public String getAssessDocNam() {
        return assessDocNam;
    }

    public void setAssessDocNam(String assessDocNam) {
        this.assessDocNam = assessDocNam == null ? null : assessDocNam.trim();
    }
}