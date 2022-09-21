package activetech.external.pojo.domain;

import java.util.Date;

public class HspJyjg {
    private String parentId;

    private String name;

    private String sampleno;

    private String result;

    private Date resultDateTime;

    private String upperLimit;

    private String lowerLimit;

    private String reportItemName;

    private String units;

    private String examinaim;

    private String sjys;

    private String jyz;

    private String shr;

    private String mark;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSampleno() {
        return sampleno;
    }

    public void setSampleno(String sampleno) {
        this.sampleno = sampleno == null ? null : sampleno.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Date getResultDateTime() {
        return resultDateTime;
    }

    public void setResultDateTime(Date resultDateTime) {
        this.resultDateTime = resultDateTime;
    }

    public String getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(String upperLimit) {
        this.upperLimit = upperLimit == null ? null : upperLimit.trim();
    }

    public String getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(String lowerLimit) {
        this.lowerLimit = lowerLimit == null ? null : lowerLimit.trim();
    }

    public String getReportItemName() {
        return reportItemName;
    }

    public void setReportItemName(String reportItemName) {
        this.reportItemName = reportItemName == null ? null : reportItemName.trim();
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units == null ? null : units.trim();
    }

    public String getExaminaim() {
        return examinaim;
    }

    public void setExaminaim(String examinaim) {
        this.examinaim = examinaim == null ? null : examinaim.trim();
    }

    public String getSjys() {
        return sjys;
    }

    public void setSjys(String sjys) {
        this.sjys = sjys == null ? null : sjys.trim();
    }

    public String getJyz() {
        return jyz;
    }

    public void setJyz(String jyz) {
        this.jyz = jyz == null ? null : jyz.trim();
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr == null ? null : shr.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}