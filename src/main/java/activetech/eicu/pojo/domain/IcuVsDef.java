package activetech.eicu.pojo.domain;

public class IcuVsDef extends IcuVsDefKey {
    private String vsName;

    private String vsUnit;

    private String rsltMode;

    private String rsltCode;

    private String udefFlag;

    private String lmtFlag;

    private String cgFlag;

    private String custShow;

    private String wholMain;

    private Integer colNumb;

    private Integer vsSort;

    public String getVsName() {
        return vsName;
    }

    public void setVsName(String vsName) {
        this.vsName = vsName == null ? null : vsName.trim();
    }

    public String getVsUnit() {
        return vsUnit;
    }

    public void setVsUnit(String vsUnit) {
        this.vsUnit = vsUnit == null ? null : vsUnit.trim();
    }

    public String getRsltMode() {
        return rsltMode;
    }

    public void setRsltMode(String rsltMode) {
        this.rsltMode = rsltMode == null ? null : rsltMode.trim();
    }

    public String getRsltCode() {
        return rsltCode;
    }

    public void setRsltCode(String rsltCode) {
        this.rsltCode = rsltCode == null ? null : rsltCode.trim();
    }

    public String getUdefFlag() {
        return udefFlag;
    }

    public void setUdefFlag(String udefFlag) {
        this.udefFlag = udefFlag == null ? null : udefFlag.trim();
    }

    public String getLmtFlag() {
        return lmtFlag;
    }

    public void setLmtFlag(String lmtFlag) {
        this.lmtFlag = lmtFlag == null ? null : lmtFlag.trim();
    }

    public String getCgFlag() {
        return cgFlag;
    }

    public void setCgFlag(String cgFlag) {
        this.cgFlag = cgFlag == null ? null : cgFlag.trim();
    }

    public String getCustShow() {
        return custShow;
    }

    public void setCustShow(String custShow) {
        this.custShow = custShow == null ? null : custShow.trim();
    }

    public String getWholMain() {
        return wholMain;
    }

    public void setWholMain(String wholMain) {
        this.wholMain = wholMain == null ? null : wholMain.trim();
    }

    public Integer getColNumb() {
        return colNumb;
    }

    public void setColNumb(Integer colNumb) {
        this.colNumb = colNumb;
    }

    public Integer getVsSort() {
        return vsSort;
    }

    public void setVsSort(Integer vsSort) {
        this.vsSort = vsSort;
    }
}