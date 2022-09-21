package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCerebralCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCerebralCourseExample() {
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

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
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

        public Criteria andErectDoseIsNull() {
            addCriterion("ERECT_DOSE is null");
            return (Criteria) this;
        }

        public Criteria andErectDoseIsNotNull() {
            addCriterion("ERECT_DOSE is not null");
            return (Criteria) this;
        }

        public Criteria andErectDoseEqualTo(String value) {
            addCriterion("ERECT_DOSE =", value, "erectDose");
            return (Criteria) this;
        }

        public Criteria andErectDoseNotEqualTo(String value) {
            addCriterion("ERECT_DOSE <>", value, "erectDose");
            return (Criteria) this;
        }

        public Criteria andErectDoseGreaterThan(String value) {
            addCriterion("ERECT_DOSE >", value, "erectDose");
            return (Criteria) this;
        }

        public Criteria andErectDoseGreaterThanOrEqualTo(String value) {
            addCriterion("ERECT_DOSE >=", value, "erectDose");
            return (Criteria) this;
        }

        public Criteria andErectDoseLessThan(String value) {
            addCriterion("ERECT_DOSE <", value, "erectDose");
            return (Criteria) this;
        }

        public Criteria andErectDoseLessThanOrEqualTo(String value) {
            addCriterion("ERECT_DOSE <=", value, "erectDose");
            return (Criteria) this;
        }

        public Criteria andErectDoseLike(String value) {
            addCriterion("ERECT_DOSE like", value, "erectDose");
            return (Criteria) this;
        }

        public Criteria andErectDoseNotLike(String value) {
            addCriterion("ERECT_DOSE not like", value, "erectDose");
            return (Criteria) this;
        }

        public Criteria andErectDoseIn(List<String> values) {
            addCriterion("ERECT_DOSE in", values, "erectDose");
            return (Criteria) this;
        }

        public Criteria andErectDoseNotIn(List<String> values) {
            addCriterion("ERECT_DOSE not in", values, "erectDose");
            return (Criteria) this;
        }

        public Criteria andErectDoseBetween(String value1, String value2) {
            addCriterion("ERECT_DOSE between", value1, value2, "erectDose");
            return (Criteria) this;
        }

        public Criteria andErectDoseNotBetween(String value1, String value2) {
            addCriterion("ERECT_DOSE not between", value1, value2, "erectDose");
            return (Criteria) this;
        }

        public Criteria andCerebralIndIsNull() {
            addCriterion("CEREBRAL_IND is null");
            return (Criteria) this;
        }

        public Criteria andCerebralIndIsNotNull() {
            addCriterion("CEREBRAL_IND is not null");
            return (Criteria) this;
        }

        public Criteria andCerebralIndEqualTo(String value) {
            addCriterion("CEREBRAL_IND =", value, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralIndNotEqualTo(String value) {
            addCriterion("CEREBRAL_IND <>", value, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralIndGreaterThan(String value) {
            addCriterion("CEREBRAL_IND >", value, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralIndGreaterThanOrEqualTo(String value) {
            addCriterion("CEREBRAL_IND >=", value, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralIndLessThan(String value) {
            addCriterion("CEREBRAL_IND <", value, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralIndLessThanOrEqualTo(String value) {
            addCriterion("CEREBRAL_IND <=", value, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralIndLike(String value) {
            addCriterion("CEREBRAL_IND like", value, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralIndNotLike(String value) {
            addCriterion("CEREBRAL_IND not like", value, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralIndIn(List<String> values) {
            addCriterion("CEREBRAL_IND in", values, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralIndNotIn(List<String> values) {
            addCriterion("CEREBRAL_IND not in", values, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralIndBetween(String value1, String value2) {
            addCriterion("CEREBRAL_IND between", value1, value2, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralIndNotBetween(String value1, String value2) {
            addCriterion("CEREBRAL_IND not between", value1, value2, "cerebralInd");
            return (Criteria) this;
        }

        public Criteria andCerebralContIsNull() {
            addCriterion("CEREBRAL_CONT is null");
            return (Criteria) this;
        }

        public Criteria andCerebralContIsNotNull() {
            addCriterion("CEREBRAL_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andCerebralContEqualTo(String value) {
            addCriterion("CEREBRAL_CONT =", value, "cerebralCont");
            return (Criteria) this;
        }

        public Criteria andCerebralContNotEqualTo(String value) {
            addCriterion("CEREBRAL_CONT <>", value, "cerebralCont");
            return (Criteria) this;
        }

        public Criteria andCerebralContGreaterThan(String value) {
            addCriterion("CEREBRAL_CONT >", value, "cerebralCont");
            return (Criteria) this;
        }

        public Criteria andCerebralContGreaterThanOrEqualTo(String value) {
            addCriterion("CEREBRAL_CONT >=", value, "cerebralCont");
            return (Criteria) this;
        }

        public Criteria andCerebralContLessThan(String value) {
            addCriterion("CEREBRAL_CONT <", value, "cerebralCont");
            return (Criteria) this;
        }

        public Criteria andCerebralContLessThanOrEqualTo(String value) {
            addCriterion("CEREBRAL_CONT <=", value, "cerebralCont");
            return (Criteria) this;
        }

        public Criteria andCerebralContLike(String value) {
            addCriterion("CEREBRAL_CONT like", value, "cerebralCont");
            return (Criteria) this;
        }

        public Criteria andCerebralContNotLike(String value) {
            addCriterion("CEREBRAL_CONT not like", value, "cerebralCont");
            return (Criteria) this;
        }

        public Criteria andCerebralContIn(List<String> values) {
            addCriterion("CEREBRAL_CONT in", values, "cerebralCont");
            return (Criteria) this;
        }

        public Criteria andCerebralContNotIn(List<String> values) {
            addCriterion("CEREBRAL_CONT not in", values, "cerebralCont");
            return (Criteria) this;
        }

        public Criteria andCerebralContBetween(String value1, String value2) {
            addCriterion("CEREBRAL_CONT between", value1, value2, "cerebralCont");
            return (Criteria) this;
        }

        public Criteria andCerebralContNotBetween(String value1, String value2) {
            addCriterion("CEREBRAL_CONT not between", value1, value2, "cerebralCont");
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

        public Criteria andCerebralDntIsNull() {
            addCriterion("CEREBRAL_DNT is null");
            return (Criteria) this;
        }

        public Criteria andCerebralDntIsNotNull() {
            addCriterion("CEREBRAL_DNT is not null");
            return (Criteria) this;
        }

        public Criteria andCerebralDntEqualTo(String value) {
            addCriterion("CEREBRAL_DNT =", value, "cerebralDnt");
            return (Criteria) this;
        }

        public Criteria andCerebralDntNotEqualTo(String value) {
            addCriterion("CEREBRAL_DNT <>", value, "cerebralDnt");
            return (Criteria) this;
        }

        public Criteria andCerebralDntGreaterThan(String value) {
            addCriterion("CEREBRAL_DNT >", value, "cerebralDnt");
            return (Criteria) this;
        }

        public Criteria andCerebralDntGreaterThanOrEqualTo(String value) {
            addCriterion("CEREBRAL_DNT >=", value, "cerebralDnt");
            return (Criteria) this;
        }

        public Criteria andCerebralDntLessThan(String value) {
            addCriterion("CEREBRAL_DNT <", value, "cerebralDnt");
            return (Criteria) this;
        }

        public Criteria andCerebralDntLessThanOrEqualTo(String value) {
            addCriterion("CEREBRAL_DNT <=", value, "cerebralDnt");
            return (Criteria) this;
        }

        public Criteria andCerebralDntLike(String value) {
            addCriterion("CEREBRAL_DNT like", value, "cerebralDnt");
            return (Criteria) this;
        }

        public Criteria andCerebralDntNotLike(String value) {
            addCriterion("CEREBRAL_DNT not like", value, "cerebralDnt");
            return (Criteria) this;
        }

        public Criteria andCerebralDntIn(List<String> values) {
            addCriterion("CEREBRAL_DNT in", values, "cerebralDnt");
            return (Criteria) this;
        }

        public Criteria andCerebralDntNotIn(List<String> values) {
            addCriterion("CEREBRAL_DNT not in", values, "cerebralDnt");
            return (Criteria) this;
        }

        public Criteria andCerebralDntBetween(String value1, String value2) {
            addCriterion("CEREBRAL_DNT between", value1, value2, "cerebralDnt");
            return (Criteria) this;
        }

        public Criteria andCerebralDntNotBetween(String value1, String value2) {
            addCriterion("CEREBRAL_DNT not between", value1, value2, "cerebralDnt");
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