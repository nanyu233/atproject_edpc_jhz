package activetech.basehis.pojo.domain;

import java.util.Date;

public class HspAotographInfo {
    private String aotographId;

    private String relevanceId;

    private String documentType;

    private Date aotographTime;

    private String aotographReturn;

    private String docNo;

    private String docName;

    private String documentTable;

    private String remark;

    private String docImg;

    public String getAotographId() {
        return aotographId;
    }

    public void setAotographId(String aotographId) {
        this.aotographId = aotographId == null ? null : aotographId.trim();
    }

    public String getRelevanceId() {
        return relevanceId;
    }

    public void setRelevanceId(String relevanceId) {
        this.relevanceId = relevanceId == null ? null : relevanceId.trim();
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType == null ? null : documentType.trim();
    }

    public Date getAotographTime() {
        return aotographTime;
    }

    public void setAotographTime(Date aotographTime) {
        this.aotographTime = aotographTime;
    }

    public String getAotographReturn() {
        return aotographReturn;
    }

    public void setAotographReturn(String aotographReturn) {
        this.aotographReturn = aotographReturn == null ? null : aotographReturn.trim();
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo == null ? null : docNo.trim();
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName == null ? null : docName.trim();
    }

    public String getDocumentTable() {
        return documentTable;
    }

    public void setDocumentTable(String documentTable) {
        this.documentTable = documentTable == null ? null : documentTable.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDocImg() {
        return docImg;
    }

    public void setDocImg(String docImg) {
        this.docImg = docImg == null ? null : docImg.trim();
    }
}