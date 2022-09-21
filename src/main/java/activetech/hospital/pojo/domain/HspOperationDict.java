package activetech.hospital.pojo.domain;

public class HspOperationDict {
    private String id;

    private String operationCode;

    private String operationName;

    private String operationGrade;

    private String operationType;

    private String pinyinCode;

    private String wubiCode;

    private String descn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }

    public String getOperationGrade() {
        return operationGrade;
    }

    public void setOperationGrade(String operationGrade) {
        this.operationGrade = operationGrade == null ? null : operationGrade.trim();
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
    }

    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode == null ? null : pinyinCode.trim();
    }

    public String getWubiCode() {
        return wubiCode;
    }

    public void setWubiCode(String wubiCode) {
        this.wubiCode = wubiCode == null ? null : wubiCode.trim();
    }

    public String getDescn() {
        return descn;
    }

    public void setDescn(String descn) {
        this.descn = descn == null ? null : descn.trim();
    }
}