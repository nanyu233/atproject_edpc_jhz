package activetech.eicu.pojo.domain;

public class IcuGradeSubitemKey {
    private String gradeSeq;

    private String gradeType;

    private String itemField;

    public String getGradeSeq() {
        return gradeSeq;
    }

    public void setGradeSeq(String gradeSeq) {
        this.gradeSeq = gradeSeq == null ? null : gradeSeq.trim();
    }

    public String getGradeType() {
        return gradeType;
    }

    public void setGradeType(String gradeType) {
        this.gradeType = gradeType == null ? null : gradeType.trim();
    }

    public String getItemField() {
        return itemField;
    }

    public void setItemField(String itemField) {
        this.itemField = itemField == null ? null : itemField.trim();
    }
}