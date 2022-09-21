package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCerebralSheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCerebralSheetExample() {
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

        public Criteria andCerebralCourseSeqIsNull() {
            addCriterion("CEREBRAL_COURSE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqIsNotNull() {
            addCriterion("CEREBRAL_COURSE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqEqualTo(String value) {
            addCriterion("CEREBRAL_COURSE_SEQ =", value, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqNotEqualTo(String value) {
            addCriterion("CEREBRAL_COURSE_SEQ <>", value, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqGreaterThan(String value) {
            addCriterion("CEREBRAL_COURSE_SEQ >", value, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqGreaterThanOrEqualTo(String value) {
            addCriterion("CEREBRAL_COURSE_SEQ >=", value, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqLessThan(String value) {
            addCriterion("CEREBRAL_COURSE_SEQ <", value, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqLessThanOrEqualTo(String value) {
            addCriterion("CEREBRAL_COURSE_SEQ <=", value, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqLike(String value) {
            addCriterion("CEREBRAL_COURSE_SEQ like", value, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqNotLike(String value) {
            addCriterion("CEREBRAL_COURSE_SEQ not like", value, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqIn(List<String> values) {
            addCriterion("CEREBRAL_COURSE_SEQ in", values, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqNotIn(List<String> values) {
            addCriterion("CEREBRAL_COURSE_SEQ not in", values, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqBetween(String value1, String value2) {
            addCriterion("CEREBRAL_COURSE_SEQ between", value1, value2, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andCerebralCourseSeqNotBetween(String value1, String value2) {
            addCriterion("CEREBRAL_COURSE_SEQ not between", value1, value2, "cerebralCourseSeq");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNull() {
            addCriterion("TIME_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNotNull() {
            addCriterion("TIME_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeEqualTo(BigDecimal value) {
            addCriterion("TIME_TYPE =", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotEqualTo(BigDecimal value) {
            addCriterion("TIME_TYPE <>", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThan(BigDecimal value) {
            addCriterion("TIME_TYPE >", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIME_TYPE >=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThan(BigDecimal value) {
            addCriterion("TIME_TYPE <", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIME_TYPE <=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIn(List<BigDecimal> values) {
            addCriterion("TIME_TYPE in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotIn(List<BigDecimal> values) {
            addCriterion("TIME_TYPE not in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIME_TYPE between", value1, value2, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIME_TYPE not between", value1, value2, "timeType");
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

        public Criteria andCerebralDateIsNull() {
            addCriterion("CEREBRAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCerebralDateIsNotNull() {
            addCriterion("CEREBRAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCerebralDateEqualTo(Date value) {
            addCriterion("CEREBRAL_DATE =", value, "cerebralDate");
            return (Criteria) this;
        }

        public Criteria andCerebralDateNotEqualTo(Date value) {
            addCriterion("CEREBRAL_DATE <>", value, "cerebralDate");
            return (Criteria) this;
        }

        public Criteria andCerebralDateGreaterThan(Date value) {
            addCriterion("CEREBRAL_DATE >", value, "cerebralDate");
            return (Criteria) this;
        }

        public Criteria andCerebralDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CEREBRAL_DATE >=", value, "cerebralDate");
            return (Criteria) this;
        }

        public Criteria andCerebralDateLessThan(Date value) {
            addCriterion("CEREBRAL_DATE <", value, "cerebralDate");
            return (Criteria) this;
        }

        public Criteria andCerebralDateLessThanOrEqualTo(Date value) {
            addCriterion("CEREBRAL_DATE <=", value, "cerebralDate");
            return (Criteria) this;
        }

        public Criteria andCerebralDateIn(List<Date> values) {
            addCriterion("CEREBRAL_DATE in", values, "cerebralDate");
            return (Criteria) this;
        }

        public Criteria andCerebralDateNotIn(List<Date> values) {
            addCriterion("CEREBRAL_DATE not in", values, "cerebralDate");
            return (Criteria) this;
        }

        public Criteria andCerebralDateBetween(Date value1, Date value2) {
            addCriterion("CEREBRAL_DATE between", value1, value2, "cerebralDate");
            return (Criteria) this;
        }

        public Criteria andCerebralDateNotBetween(Date value1, Date value2) {
            addCriterion("CEREBRAL_DATE not between", value1, value2, "cerebralDate");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNull() {
            addCriterion("HEART_RATE is null");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNotNull() {
            addCriterion("HEART_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andHeartRateEqualTo(Short value) {
            addCriterion("HEART_RATE =", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotEqualTo(Short value) {
            addCriterion("HEART_RATE <>", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThan(Short value) {
            addCriterion("HEART_RATE >", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThanOrEqualTo(Short value) {
            addCriterion("HEART_RATE >=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThan(Short value) {
            addCriterion("HEART_RATE <", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThanOrEqualTo(Short value) {
            addCriterion("HEART_RATE <=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateIn(List<Short> values) {
            addCriterion("HEART_RATE in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotIn(List<Short> values) {
            addCriterion("HEART_RATE not in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateBetween(Short value1, Short value2) {
            addCriterion("HEART_RATE between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotBetween(Short value1, Short value2) {
            addCriterion("HEART_RATE not between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andPressureUpIsNull() {
            addCriterion("PRESSURE_UP is null");
            return (Criteria) this;
        }

        public Criteria andPressureUpIsNotNull() {
            addCriterion("PRESSURE_UP is not null");
            return (Criteria) this;
        }

        public Criteria andPressureUpEqualTo(Short value) {
            addCriterion("PRESSURE_UP =", value, "pressureUp");
            return (Criteria) this;
        }

        public Criteria andPressureUpNotEqualTo(Short value) {
            addCriterion("PRESSURE_UP <>", value, "pressureUp");
            return (Criteria) this;
        }

        public Criteria andPressureUpGreaterThan(Short value) {
            addCriterion("PRESSURE_UP >", value, "pressureUp");
            return (Criteria) this;
        }

        public Criteria andPressureUpGreaterThanOrEqualTo(Short value) {
            addCriterion("PRESSURE_UP >=", value, "pressureUp");
            return (Criteria) this;
        }

        public Criteria andPressureUpLessThan(Short value) {
            addCriterion("PRESSURE_UP <", value, "pressureUp");
            return (Criteria) this;
        }

        public Criteria andPressureUpLessThanOrEqualTo(Short value) {
            addCriterion("PRESSURE_UP <=", value, "pressureUp");
            return (Criteria) this;
        }

        public Criteria andPressureUpIn(List<Short> values) {
            addCriterion("PRESSURE_UP in", values, "pressureUp");
            return (Criteria) this;
        }

        public Criteria andPressureUpNotIn(List<Short> values) {
            addCriterion("PRESSURE_UP not in", values, "pressureUp");
            return (Criteria) this;
        }

        public Criteria andPressureUpBetween(Short value1, Short value2) {
            addCriterion("PRESSURE_UP between", value1, value2, "pressureUp");
            return (Criteria) this;
        }

        public Criteria andPressureUpNotBetween(Short value1, Short value2) {
            addCriterion("PRESSURE_UP not between", value1, value2, "pressureUp");
            return (Criteria) this;
        }

        public Criteria andOxyNbrIsNull() {
            addCriterion("OXY_NBR is null");
            return (Criteria) this;
        }

        public Criteria andOxyNbrIsNotNull() {
            addCriterion("OXY_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andOxyNbrEqualTo(Short value) {
            addCriterion("OXY_NBR =", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotEqualTo(Short value) {
            addCriterion("OXY_NBR <>", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrGreaterThan(Short value) {
            addCriterion("OXY_NBR >", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("OXY_NBR >=", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrLessThan(Short value) {
            addCriterion("OXY_NBR <", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrLessThanOrEqualTo(Short value) {
            addCriterion("OXY_NBR <=", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrIn(List<Short> values) {
            addCriterion("OXY_NBR in", values, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotIn(List<Short> values) {
            addCriterion("OXY_NBR not in", values, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrBetween(Short value1, Short value2) {
            addCriterion("OXY_NBR between", value1, value2, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotBetween(Short value1, Short value2) {
            addCriterion("OXY_NBR not between", value1, value2, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andNihssScoreIsNull() {
            addCriterion("NIHSS_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andNihssScoreIsNotNull() {
            addCriterion("NIHSS_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andNihssScoreEqualTo(BigDecimal value) {
            addCriterion("NIHSS_SCORE =", value, "nihssScore");
            return (Criteria) this;
        }

        public Criteria andNihssScoreNotEqualTo(BigDecimal value) {
            addCriterion("NIHSS_SCORE <>", value, "nihssScore");
            return (Criteria) this;
        }

        public Criteria andNihssScoreGreaterThan(BigDecimal value) {
            addCriterion("NIHSS_SCORE >", value, "nihssScore");
            return (Criteria) this;
        }

        public Criteria andNihssScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIHSS_SCORE >=", value, "nihssScore");
            return (Criteria) this;
        }

        public Criteria andNihssScoreLessThan(BigDecimal value) {
            addCriterion("NIHSS_SCORE <", value, "nihssScore");
            return (Criteria) this;
        }

        public Criteria andNihssScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIHSS_SCORE <=", value, "nihssScore");
            return (Criteria) this;
        }

        public Criteria andNihssScoreIn(List<BigDecimal> values) {
            addCriterion("NIHSS_SCORE in", values, "nihssScore");
            return (Criteria) this;
        }

        public Criteria andNihssScoreNotIn(List<BigDecimal> values) {
            addCriterion("NIHSS_SCORE not in", values, "nihssScore");
            return (Criteria) this;
        }

        public Criteria andNihssScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIHSS_SCORE between", value1, value2, "nihssScore");
            return (Criteria) this;
        }

        public Criteria andNihssScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIHSS_SCORE not between", value1, value2, "nihssScore");
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

        public Criteria andPressureDownIsNull() {
            addCriterion("PRESSURE_DOWN is null");
            return (Criteria) this;
        }

        public Criteria andPressureDownIsNotNull() {
            addCriterion("PRESSURE_DOWN is not null");
            return (Criteria) this;
        }

        public Criteria andPressureDownEqualTo(Short value) {
            addCriterion("PRESSURE_DOWN =", value, "pressureDown");
            return (Criteria) this;
        }

        public Criteria andPressureDownNotEqualTo(Short value) {
            addCriterion("PRESSURE_DOWN <>", value, "pressureDown");
            return (Criteria) this;
        }

        public Criteria andPressureDownGreaterThan(Short value) {
            addCriterion("PRESSURE_DOWN >", value, "pressureDown");
            return (Criteria) this;
        }

        public Criteria andPressureDownGreaterThanOrEqualTo(Short value) {
            addCriterion("PRESSURE_DOWN >=", value, "pressureDown");
            return (Criteria) this;
        }

        public Criteria andPressureDownLessThan(Short value) {
            addCriterion("PRESSURE_DOWN <", value, "pressureDown");
            return (Criteria) this;
        }

        public Criteria andPressureDownLessThanOrEqualTo(Short value) {
            addCriterion("PRESSURE_DOWN <=", value, "pressureDown");
            return (Criteria) this;
        }

        public Criteria andPressureDownIn(List<Short> values) {
            addCriterion("PRESSURE_DOWN in", values, "pressureDown");
            return (Criteria) this;
        }

        public Criteria andPressureDownNotIn(List<Short> values) {
            addCriterion("PRESSURE_DOWN not in", values, "pressureDown");
            return (Criteria) this;
        }

        public Criteria andPressureDownBetween(Short value1, Short value2) {
            addCriterion("PRESSURE_DOWN between", value1, value2, "pressureDown");
            return (Criteria) this;
        }

        public Criteria andPressureDownNotBetween(Short value1, Short value2) {
            addCriterion("PRESSURE_DOWN not between", value1, value2, "pressureDown");
            return (Criteria) this;
        }

        public Criteria andAssessDocIsNull() {
            addCriterion("ASSESS_DOC is null");
            return (Criteria) this;
        }

        public Criteria andAssessDocIsNotNull() {
            addCriterion("ASSESS_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andAssessDocEqualTo(String value) {
            addCriterion("ASSESS_DOC =", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotEqualTo(String value) {
            addCriterion("ASSESS_DOC <>", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocGreaterThan(String value) {
            addCriterion("ASSESS_DOC >", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_DOC >=", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocLessThan(String value) {
            addCriterion("ASSESS_DOC <", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_DOC <=", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocLike(String value) {
            addCriterion("ASSESS_DOC like", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotLike(String value) {
            addCriterion("ASSESS_DOC not like", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocIn(List<String> values) {
            addCriterion("ASSESS_DOC in", values, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotIn(List<String> values) {
            addCriterion("ASSESS_DOC not in", values, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocBetween(String value1, String value2) {
            addCriterion("ASSESS_DOC between", value1, value2, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotBetween(String value1, String value2) {
            addCriterion("ASSESS_DOC not between", value1, value2, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDateIsNull() {
            addCriterion("ASSESS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAssessDateIsNotNull() {
            addCriterion("ASSESS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAssessDateEqualTo(String value) {
            addCriterion("ASSESS_DATE =", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotEqualTo(String value) {
            addCriterion("ASSESS_DATE <>", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateGreaterThan(String value) {
            addCriterion("ASSESS_DATE >", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_DATE >=", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateLessThan(String value) {
            addCriterion("ASSESS_DATE <", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_DATE <=", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateLike(String value) {
            addCriterion("ASSESS_DATE like", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotLike(String value) {
            addCriterion("ASSESS_DATE not like", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateIn(List<String> values) {
            addCriterion("ASSESS_DATE in", values, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotIn(List<String> values) {
            addCriterion("ASSESS_DATE not in", values, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateBetween(String value1, String value2) {
            addCriterion("ASSESS_DATE between", value1, value2, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotBetween(String value1, String value2) {
            addCriterion("ASSESS_DATE not between", value1, value2, "assessDate");
            return (Criteria) this;
        }

        public Criteria andRelationDocIsNull() {
            addCriterion("RELATION_DOC is null");
            return (Criteria) this;
        }

        public Criteria andRelationDocIsNotNull() {
            addCriterion("RELATION_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andRelationDocEqualTo(String value) {
            addCriterion("RELATION_DOC =", value, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocNotEqualTo(String value) {
            addCriterion("RELATION_DOC <>", value, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocGreaterThan(String value) {
            addCriterion("RELATION_DOC >", value, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocGreaterThanOrEqualTo(String value) {
            addCriterion("RELATION_DOC >=", value, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocLessThan(String value) {
            addCriterion("RELATION_DOC <", value, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocLessThanOrEqualTo(String value) {
            addCriterion("RELATION_DOC <=", value, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocLike(String value) {
            addCriterion("RELATION_DOC like", value, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocNotLike(String value) {
            addCriterion("RELATION_DOC not like", value, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocIn(List<String> values) {
            addCriterion("RELATION_DOC in", values, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocNotIn(List<String> values) {
            addCriterion("RELATION_DOC not in", values, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocBetween(String value1, String value2) {
            addCriterion("RELATION_DOC between", value1, value2, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocNotBetween(String value1, String value2) {
            addCriterion("RELATION_DOC not between", value1, value2, "relationDoc");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamIsNull() {
            addCriterion("RELATION_DOCNAM is null");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamIsNotNull() {
            addCriterion("RELATION_DOCNAM is not null");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamEqualTo(String value) {
            addCriterion("RELATION_DOCNAM =", value, "relationDocnam");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamNotEqualTo(String value) {
            addCriterion("RELATION_DOCNAM <>", value, "relationDocnam");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamGreaterThan(String value) {
            addCriterion("RELATION_DOCNAM >", value, "relationDocnam");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamGreaterThanOrEqualTo(String value) {
            addCriterion("RELATION_DOCNAM >=", value, "relationDocnam");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamLessThan(String value) {
            addCriterion("RELATION_DOCNAM <", value, "relationDocnam");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamLessThanOrEqualTo(String value) {
            addCriterion("RELATION_DOCNAM <=", value, "relationDocnam");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamLike(String value) {
            addCriterion("RELATION_DOCNAM like", value, "relationDocnam");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamNotLike(String value) {
            addCriterion("RELATION_DOCNAM not like", value, "relationDocnam");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamIn(List<String> values) {
            addCriterion("RELATION_DOCNAM in", values, "relationDocnam");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamNotIn(List<String> values) {
            addCriterion("RELATION_DOCNAM not in", values, "relationDocnam");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamBetween(String value1, String value2) {
            addCriterion("RELATION_DOCNAM between", value1, value2, "relationDocnam");
            return (Criteria) this;
        }

        public Criteria andRelationDocnamNotBetween(String value1, String value2) {
            addCriterion("RELATION_DOCNAM not between", value1, value2, "relationDocnam");
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