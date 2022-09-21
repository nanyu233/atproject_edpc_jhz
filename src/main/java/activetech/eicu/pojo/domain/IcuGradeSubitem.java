package activetech.eicu.pojo.domain;

public class IcuGradeSubitem extends IcuGradeSubitemKey {
    private String itemValue;

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue == null ? null : itemValue.trim();
    }
}