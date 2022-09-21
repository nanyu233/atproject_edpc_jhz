package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspDiseaseCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDiseaseCourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDiseaseCourseSeqIsNull() {
            addCriterion("DISEASE_COURSE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqIsNotNull() {
            addCriterion("DISEASE_COURSE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqEqualTo(String value) {
            addCriterion("DISEASE_COURSE_SEQ =", value, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqNotEqualTo(String value) {
            addCriterion("DISEASE_COURSE_SEQ <>", value, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqGreaterThan(String value) {
            addCriterion("DISEASE_COURSE_SEQ >", value, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqGreaterThanOrEqualTo(String value) {
            addCriterion("DISEASE_COURSE_SEQ >=", value, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqLessThan(String value) {
            addCriterion("DISEASE_COURSE_SEQ <", value, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqLessThanOrEqualTo(String value) {
            addCriterion("DISEASE_COURSE_SEQ <=", value, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqLike(String value) {
            addCriterion("DISEASE_COURSE_SEQ like", value, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqNotLike(String value) {
            addCriterion("DISEASE_COURSE_SEQ not like", value, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqIn(List<String> values) {
            addCriterion("DISEASE_COURSE_SEQ in", values, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqNotIn(List<String> values) {
            addCriterion("DISEASE_COURSE_SEQ not in", values, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqBetween(String value1, String value2) {
            addCriterion("DISEASE_COURSE_SEQ between", value1, value2, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andDiseaseCourseSeqNotBetween(String value1, String value2) {
            addCriterion("DISEASE_COURSE_SEQ not between", value1, value2, "diseaseCourseSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcIsNull() {
            addCriterion("EMG_SEQ_DC is null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcIsNotNull() {
            addCriterion("EMG_SEQ_DC is not null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcEqualTo(String value) {
            addCriterion("EMG_SEQ_DC =", value, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcNotEqualTo(String value) {
            addCriterion("EMG_SEQ_DC <>", value, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcGreaterThan(String value) {
            addCriterion("EMG_SEQ_DC >", value, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ_DC >=", value, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcLessThan(String value) {
            addCriterion("EMG_SEQ_DC <", value, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcLessThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ_DC <=", value, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcLike(String value) {
            addCriterion("EMG_SEQ_DC like", value, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcNotLike(String value) {
            addCriterion("EMG_SEQ_DC not like", value, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcIn(List<String> values) {
            addCriterion("EMG_SEQ_DC in", values, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcNotIn(List<String> values) {
            addCriterion("EMG_SEQ_DC not in", values, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcBetween(String value1, String value2) {
            addCriterion("EMG_SEQ_DC between", value1, value2, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDcNotBetween(String value1, String value2) {
            addCriterion("EMG_SEQ_DC not between", value1, value2, "emgSeqDc");
            return (Criteria) this;
        }

        public Criteria andCourseDateIsNull() {
            addCriterion("COURSE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCourseDateIsNotNull() {
            addCriterion("COURSE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDateEqualTo(Date value) {
            addCriterion("COURSE_DATE =", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotEqualTo(Date value) {
            addCriterion("COURSE_DATE <>", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateGreaterThan(Date value) {
            addCriterion("COURSE_DATE >", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("COURSE_DATE >=", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateLessThan(Date value) {
            addCriterion("COURSE_DATE <", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateLessThanOrEqualTo(Date value) {
            addCriterion("COURSE_DATE <=", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateIn(List<Date> values) {
            addCriterion("COURSE_DATE in", values, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotIn(List<Date> values) {
            addCriterion("COURSE_DATE not in", values, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateBetween(Date value1, Date value2) {
            addCriterion("COURSE_DATE between", value1, value2, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotBetween(Date value1, Date value2) {
            addCriterion("COURSE_DATE not between", value1, value2, "courseDate");
            return (Criteria) this;
        }

        public Criteria andDiseasePointIsNull() {
            addCriterion("DISEASE_POINT is null");
            return (Criteria) this;
        }

        public Criteria andDiseasePointIsNotNull() {
            addCriterion("DISEASE_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andDiseasePointEqualTo(String value) {
            addCriterion("DISEASE_POINT =", value, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andDiseasePointNotEqualTo(String value) {
            addCriterion("DISEASE_POINT <>", value, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andDiseasePointGreaterThan(String value) {
            addCriterion("DISEASE_POINT >", value, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andDiseasePointGreaterThanOrEqualTo(String value) {
            addCriterion("DISEASE_POINT >=", value, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andDiseasePointLessThan(String value) {
            addCriterion("DISEASE_POINT <", value, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andDiseasePointLessThanOrEqualTo(String value) {
            addCriterion("DISEASE_POINT <=", value, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andDiseasePointLike(String value) {
            addCriterion("DISEASE_POINT like", value, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andDiseasePointNotLike(String value) {
            addCriterion("DISEASE_POINT not like", value, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andDiseasePointIn(List<String> values) {
            addCriterion("DISEASE_POINT in", values, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andDiseasePointNotIn(List<String> values) {
            addCriterion("DISEASE_POINT not in", values, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andDiseasePointBetween(String value1, String value2) {
            addCriterion("DISEASE_POINT between", value1, value2, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andDiseasePointNotBetween(String value1, String value2) {
            addCriterion("DISEASE_POINT not between", value1, value2, "diseasePoint");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanIsNull() {
            addCriterion("TREATMENT_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanIsNotNull() {
            addCriterion("TREATMENT_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanEqualTo(String value) {
            addCriterion("TREATMENT_PLAN =", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanNotEqualTo(String value) {
            addCriterion("TREATMENT_PLAN <>", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanGreaterThan(String value) {
            addCriterion("TREATMENT_PLAN >", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanGreaterThanOrEqualTo(String value) {
            addCriterion("TREATMENT_PLAN >=", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanLessThan(String value) {
            addCriterion("TREATMENT_PLAN <", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanLessThanOrEqualTo(String value) {
            addCriterion("TREATMENT_PLAN <=", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanLike(String value) {
            addCriterion("TREATMENT_PLAN like", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanNotLike(String value) {
            addCriterion("TREATMENT_PLAN not like", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanIn(List<String> values) {
            addCriterion("TREATMENT_PLAN in", values, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanNotIn(List<String> values) {
            addCriterion("TREATMENT_PLAN not in", values, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanBetween(String value1, String value2) {
            addCriterion("TREATMENT_PLAN between", value1, value2, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanNotBetween(String value1, String value2) {
            addCriterion("TREATMENT_PLAN not between", value1, value2, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andReportingTimeIsNull() {
            addCriterion("REPORTING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReportingTimeIsNotNull() {
            addCriterion("REPORTING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReportingTimeEqualTo(String value) {
            addCriterion("REPORTING_TIME =", value, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andReportingTimeNotEqualTo(String value) {
            addCriterion("REPORTING_TIME <>", value, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andReportingTimeGreaterThan(String value) {
            addCriterion("REPORTING_TIME >", value, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andReportingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTING_TIME >=", value, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andReportingTimeLessThan(String value) {
            addCriterion("REPORTING_TIME <", value, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andReportingTimeLessThanOrEqualTo(String value) {
            addCriterion("REPORTING_TIME <=", value, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andReportingTimeLike(String value) {
            addCriterion("REPORTING_TIME like", value, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andReportingTimeNotLike(String value) {
            addCriterion("REPORTING_TIME not like", value, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andReportingTimeIn(List<String> values) {
            addCriterion("REPORTING_TIME in", values, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andReportingTimeNotIn(List<String> values) {
            addCriterion("REPORTING_TIME not in", values, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andReportingTimeBetween(String value1, String value2) {
            addCriterion("REPORTING_TIME between", value1, value2, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andReportingTimeNotBetween(String value1, String value2) {
            addCriterion("REPORTING_TIME not between", value1, value2, "reportingTime");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresIsNull() {
            addCriterion("TREATMENT_MEASURES is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresIsNotNull() {
            addCriterion("TREATMENT_MEASURES is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES =", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES <>", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresGreaterThan(String value) {
            addCriterion("TREATMENT_MEASURES >", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES >=", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresLessThan(String value) {
            addCriterion("TREATMENT_MEASURES <", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresLessThanOrEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES <=", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresLike(String value) {
            addCriterion("TREATMENT_MEASURES like", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotLike(String value) {
            addCriterion("TREATMENT_MEASURES not like", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresIn(List<String> values) {
            addCriterion("TREATMENT_MEASURES in", values, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotIn(List<String> values) {
            addCriterion("TREATMENT_MEASURES not in", values, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresBetween(String value1, String value2) {
            addCriterion("TREATMENT_MEASURES between", value1, value2, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotBetween(String value1, String value2) {
            addCriterion("TREATMENT_MEASURES not between", value1, value2, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreateDocIsNull() {
            addCriterion("CREATE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andCreateDocIsNotNull() {
            addCriterion("CREATE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDocEqualTo(String value) {
            addCriterion("CREATE_DOC =", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotEqualTo(String value) {
            addCriterion("CREATE_DOC <>", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocGreaterThan(String value) {
            addCriterion("CREATE_DOC >", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DOC >=", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLessThan(String value) {
            addCriterion("CREATE_DOC <", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DOC <=", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLike(String value) {
            addCriterion("CREATE_DOC like", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotLike(String value) {
            addCriterion("CREATE_DOC not like", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocIn(List<String> values) {
            addCriterion("CREATE_DOC in", values, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotIn(List<String> values) {
            addCriterion("CREATE_DOC not in", values, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocBetween(String value1, String value2) {
            addCriterion("CREATE_DOC between", value1, value2, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotBetween(String value1, String value2) {
            addCriterion("CREATE_DOC not between", value1, value2, "createDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIsNull() {
            addCriterion("UPDATE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIsNotNull() {
            addCriterion("UPDATE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDocEqualTo(String value) {
            addCriterion("UPDATE_DOC =", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotEqualTo(String value) {
            addCriterion("UPDATE_DOC <>", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocGreaterThan(String value) {
            addCriterion("UPDATE_DOC >", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DOC >=", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLessThan(String value) {
            addCriterion("UPDATE_DOC <", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DOC <=", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLike(String value) {
            addCriterion("UPDATE_DOC like", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotLike(String value) {
            addCriterion("UPDATE_DOC not like", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIn(List<String> values) {
            addCriterion("UPDATE_DOC in", values, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotIn(List<String> values) {
            addCriterion("UPDATE_DOC not in", values, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocBetween(String value1, String value2) {
            addCriterion("UPDATE_DOC between", value1, value2, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DOC not between", value1, value2, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNull() {
            addCriterion("COURSE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("COURSE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(String value) {
            addCriterion("COURSE_TYPE =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(String value) {
            addCriterion("COURSE_TYPE <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(String value) {
            addCriterion("COURSE_TYPE >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_TYPE >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(String value) {
            addCriterion("COURSE_TYPE <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(String value) {
            addCriterion("COURSE_TYPE <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLike(String value) {
            addCriterion("COURSE_TYPE like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotLike(String value) {
            addCriterion("COURSE_TYPE not like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<String> values) {
            addCriterion("COURSE_TYPE in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<String> values) {
            addCriterion("COURSE_TYPE not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(String value1, String value2) {
            addCriterion("COURSE_TYPE between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(String value1, String value2) {
            addCriterion("COURSE_TYPE not between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCreateNamIsNull() {
            addCriterion("CREATE_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCreateNamIsNotNull() {
            addCriterion("CREATE_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNamEqualTo(String value) {
            addCriterion("CREATE_NAM =", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotEqualTo(String value) {
            addCriterion("CREATE_NAM <>", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamGreaterThan(String value) {
            addCriterion("CREATE_NAM >", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_NAM >=", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamLessThan(String value) {
            addCriterion("CREATE_NAM <", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamLessThanOrEqualTo(String value) {
            addCriterion("CREATE_NAM <=", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamLike(String value) {
            addCriterion("CREATE_NAM like", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotLike(String value) {
            addCriterion("CREATE_NAM not like", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamIn(List<String> values) {
            addCriterion("CREATE_NAM in", values, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotIn(List<String> values) {
            addCriterion("CREATE_NAM not in", values, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamBetween(String value1, String value2) {
            addCriterion("CREATE_NAM between", value1, value2, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotBetween(String value1, String value2) {
            addCriterion("CREATE_NAM not between", value1, value2, "createNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIsNull() {
            addCriterion("UPDATE_NAM is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIsNotNull() {
            addCriterion("UPDATE_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNamEqualTo(String value) {
            addCriterion("UPDATE_NAM =", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotEqualTo(String value) {
            addCriterion("UPDATE_NAM <>", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamGreaterThan(String value) {
            addCriterion("UPDATE_NAM >", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAM >=", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLessThan(String value) {
            addCriterion("UPDATE_NAM <", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAM <=", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLike(String value) {
            addCriterion("UPDATE_NAM like", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotLike(String value) {
            addCriterion("UPDATE_NAM not like", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIn(List<String> values) {
            addCriterion("UPDATE_NAM in", values, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotIn(List<String> values) {
            addCriterion("UPDATE_NAM not in", values, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamBetween(String value1, String value2) {
            addCriterion("UPDATE_NAM between", value1, value2, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotBetween(String value1, String value2) {
            addCriterion("UPDATE_NAM not between", value1, value2, "updateNam");
            return (Criteria) this;
        }

        public Criteria andIsprintIsNull() {
            addCriterion("ISPRINT is null");
            return (Criteria) this;
        }

        public Criteria andIsprintIsNotNull() {
            addCriterion("ISPRINT is not null");
            return (Criteria) this;
        }

        public Criteria andIsprintEqualTo(String value) {
            addCriterion("ISPRINT =", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotEqualTo(String value) {
            addCriterion("ISPRINT <>", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintGreaterThan(String value) {
            addCriterion("ISPRINT >", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintGreaterThanOrEqualTo(String value) {
            addCriterion("ISPRINT >=", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLessThan(String value) {
            addCriterion("ISPRINT <", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLessThanOrEqualTo(String value) {
            addCriterion("ISPRINT <=", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLike(String value) {
            addCriterion("ISPRINT like", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotLike(String value) {
            addCriterion("ISPRINT not like", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintIn(List<String> values) {
            addCriterion("ISPRINT in", values, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotIn(List<String> values) {
            addCriterion("ISPRINT not in", values, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintBetween(String value1, String value2) {
            addCriterion("ISPRINT between", value1, value2, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotBetween(String value1, String value2) {
            addCriterion("ISPRINT not between", value1, value2, "isprint");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}