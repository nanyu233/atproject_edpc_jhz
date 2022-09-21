package activetech.edpc.pojo.domain;

public class HspXtzlDef extends HspXtzlDefKey {
    private String proType;

    private String proName;

    private String proUnit;

    private String proList;

    private String redFlag;

    private String autFlag;

    private String titFlag;

    private String preCode;

    private String preLitm;

    private String proMemo;

    private Short fldSort;

    private String nodeId;

    private String keyTime;

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType == null ? null : proType.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getProUnit() {
        return proUnit;
    }

    public void setProUnit(String proUnit) {
        this.proUnit = proUnit == null ? null : proUnit.trim();
    }

    public String getProList() {
        return proList;
    }

    public void setProList(String proList) {
        this.proList = proList == null ? null : proList.trim();
    }

    public String getRedFlag() {
        return redFlag;
    }

    public void setRedFlag(String redFlag) {
        this.redFlag = redFlag == null ? null : redFlag.trim();
    }

    public String getAutFlag() {
        return autFlag;
    }

    public void setAutFlag(String autFlag) {
        this.autFlag = autFlag == null ? null : autFlag.trim();
    }

    public String getTitFlag() {
        return titFlag;
    }

    public void setTitFlag(String titFlag) {
        this.titFlag = titFlag == null ? null : titFlag.trim();
    }

    public String getPreCode() {
        return preCode;
    }

    public void setPreCode(String preCode) {
        this.preCode = preCode == null ? null : preCode.trim();
    }

    public String getPreLitm() {
        return preLitm;
    }

    public void setPreLitm(String preLitm) {
        this.preLitm = preLitm == null ? null : preLitm.trim();
    }

    public String getProMemo() {
        return proMemo;
    }

    public void setProMemo(String proMemo) {
        this.proMemo = proMemo == null ? null : proMemo.trim();
    }

    public Short getFldSort() {
        return fldSort;
    }

    public void setFldSort(Short fldSort) {
        this.fldSort = fldSort;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public String getKeyTime() {
        return keyTime;
    }

    public void setKeyTime(String keyTime) {
        this.keyTime = keyTime == null ? null : keyTime.trim();
    }
}