package activetech.eicu.pojo.domain;

import java.math.BigDecimal;

public class IcuGradeRisk {
    private String itemField;

    private String itemName;

    private String itemRoot;

    private BigDecimal lowValue;

    private BigDecimal uppValue;

    private String riskColor;

    private String riskDesc;

    private Integer riskSort;

    public String getItemField() {
        return itemField;
    }

    public void setItemField(String itemField) {
        this.itemField = itemField == null ? null : itemField.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemRoot() {
        return itemRoot;
    }

    public void setItemRoot(String itemRoot) {
        this.itemRoot = itemRoot == null ? null : itemRoot.trim();
    }

    public BigDecimal getLowValue() {
        return lowValue;
    }

    public void setLowValue(BigDecimal lowValue) {
        this.lowValue = lowValue;
    }

    public BigDecimal getUppValue() {
        return uppValue;
    }

    public void setUppValue(BigDecimal uppValue) {
        this.uppValue = uppValue;
    }

    public String getRiskColor() {
        return riskColor;
    }

    public void setRiskColor(String riskColor) {
        this.riskColor = riskColor == null ? null : riskColor.trim();
    }

    public String getRiskDesc() {
        return riskDesc;
    }

    public void setRiskDesc(String riskDesc) {
        this.riskDesc = riskDesc == null ? null : riskDesc.trim();
    }

    public Integer getRiskSort() {
        return riskSort;
    }

    public void setRiskSort(Integer riskSort) {
        this.riskSort = riskSort;
    }
}