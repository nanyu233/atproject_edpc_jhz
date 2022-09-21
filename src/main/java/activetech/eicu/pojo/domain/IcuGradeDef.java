package activetech.eicu.pojo.domain;

import java.math.BigDecimal;

public class IcuGradeDef {
    private String itemField;

    private String itemName;

    private String itemRoot;

    private String itemFlag;

    private String itemGroup;

    private String scoreMemo;

    private String scoreValue;

    private Integer scoreCol;

    private String lmtFlag;

    private BigDecimal lmtValue;

    private String itemUnit;

    private Integer itemSort;

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

    public String getItemFlag() {
        return itemFlag;
    }

    public void setItemFlag(String itemFlag) {
        this.itemFlag = itemFlag == null ? null : itemFlag.trim();
    }

    public String getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(String itemGroup) {
        this.itemGroup = itemGroup == null ? null : itemGroup.trim();
    }

    public String getScoreMemo() {
        return scoreMemo;
    }

    public void setScoreMemo(String scoreMemo) {
        this.scoreMemo = scoreMemo == null ? null : scoreMemo.trim();
    }

    public String getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(String scoreValue) {
        this.scoreValue = scoreValue == null ? null : scoreValue.trim();
    }

    public Integer getScoreCol() {
        return scoreCol;
    }

    public void setScoreCol(Integer scoreCol) {
        this.scoreCol = scoreCol;
    }

    public String getLmtFlag() {
        return lmtFlag;
    }

    public void setLmtFlag(String lmtFlag) {
        this.lmtFlag = lmtFlag == null ? null : lmtFlag.trim();
    }

    public BigDecimal getLmtValue() {
        return lmtValue;
    }

    public void setLmtValue(BigDecimal lmtValue) {
        this.lmtValue = lmtValue;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit == null ? null : itemUnit.trim();
    }

    public Integer getItemSort() {
        return itemSort;
    }

    public void setItemSort(Integer itemSort) {
        this.itemSort = itemSort;
    }
}