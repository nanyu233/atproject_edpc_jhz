package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;

public class HspCerebralSheetKey {
    private String cerebralCourseSeq;

    private BigDecimal timeType;

    public String getCerebralCourseSeq() {
        return cerebralCourseSeq;
    }

    public void setCerebralCourseSeq(String cerebralCourseSeq) {
        this.cerebralCourseSeq = cerebralCourseSeq == null ? null : cerebralCourseSeq.trim();
    }

    public BigDecimal getTimeType() {
        return timeType;
    }

    public void setTimeType(BigDecimal timeType) {
        this.timeType = timeType;
    }
}