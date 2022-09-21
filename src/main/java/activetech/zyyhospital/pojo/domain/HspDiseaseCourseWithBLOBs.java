package activetech.zyyhospital.pojo.domain;

public class HspDiseaseCourseWithBLOBs extends HspDiseaseCourse {
    private String record;

    private String criticalSignificance;

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public String getCriticalSignificance() {
        return criticalSignificance;
    }

    public void setCriticalSignificance(String criticalSignificance) {
        this.criticalSignificance = criticalSignificance == null ? null : criticalSignificance.trim();
    }
}