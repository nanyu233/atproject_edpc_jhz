package activetech.basehis.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCfxxInfoExample {
    /**
     * ZJYY.HSP_CFXX_INFO
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_CFXX_INFO
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_CFXX_INFO
     */
    protected List<Criteria> oredCriteria;

    public HspCfxxInfoExample() {
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

    /**
     * ZJYY.HSP_CFXX_INFO 2020-05-22
     */
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

        public Criteria andDaSeqIsNull() {
            addCriterion("DA_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDaSeqIsNotNull() {
            addCriterion("DA_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDaSeqEqualTo(String value) {
            addCriterion("DA_SEQ =", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqNotEqualTo(String value) {
            addCriterion("DA_SEQ <>", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqGreaterThan(String value) {
            addCriterion("DA_SEQ >", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqGreaterThanOrEqualTo(String value) {
            addCriterion("DA_SEQ >=", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqLessThan(String value) {
            addCriterion("DA_SEQ <", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqLessThanOrEqualTo(String value) {
            addCriterion("DA_SEQ <=", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqLike(String value) {
            addCriterion("DA_SEQ like", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqNotLike(String value) {
            addCriterion("DA_SEQ not like", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqIn(List<String> values) {
            addCriterion("DA_SEQ in", values, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqNotIn(List<String> values) {
            addCriterion("DA_SEQ not in", values, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqBetween(String value1, String value2) {
            addCriterion("DA_SEQ between", value1, value2, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqNotBetween(String value1, String value2) {
            addCriterion("DA_SEQ not between", value1, value2, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaNoIsNull() {
            addCriterion("DA_NO is null");
            return (Criteria) this;
        }

        public Criteria andDaNoIsNotNull() {
            addCriterion("DA_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDaNoEqualTo(String value) {
            addCriterion("DA_NO =", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoNotEqualTo(String value) {
            addCriterion("DA_NO <>", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoGreaterThan(String value) {
            addCriterion("DA_NO >", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoGreaterThanOrEqualTo(String value) {
            addCriterion("DA_NO >=", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoLessThan(String value) {
            addCriterion("DA_NO <", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoLessThanOrEqualTo(String value) {
            addCriterion("DA_NO <=", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoLike(String value) {
            addCriterion("DA_NO like", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoNotLike(String value) {
            addCriterion("DA_NO not like", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoIn(List<String> values) {
            addCriterion("DA_NO in", values, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoNotIn(List<String> values) {
            addCriterion("DA_NO not in", values, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoBetween(String value1, String value2) {
            addCriterion("DA_NO between", value1, value2, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoNotBetween(String value1, String value2) {
            addCriterion("DA_NO not between", value1, value2, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaSubIsNull() {
            addCriterion("DA_SUB is null");
            return (Criteria) this;
        }

        public Criteria andDaSubIsNotNull() {
            addCriterion("DA_SUB is not null");
            return (Criteria) this;
        }

        public Criteria andDaSubEqualTo(String value) {
            addCriterion("DA_SUB =", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubNotEqualTo(String value) {
            addCriterion("DA_SUB <>", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubGreaterThan(String value) {
            addCriterion("DA_SUB >", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubGreaterThanOrEqualTo(String value) {
            addCriterion("DA_SUB >=", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubLessThan(String value) {
            addCriterion("DA_SUB <", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubLessThanOrEqualTo(String value) {
            addCriterion("DA_SUB <=", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubLike(String value) {
            addCriterion("DA_SUB like", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubNotLike(String value) {
            addCriterion("DA_SUB not like", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubIn(List<String> values) {
            addCriterion("DA_SUB in", values, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubNotIn(List<String> values) {
            addCriterion("DA_SUB not in", values, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubBetween(String value1, String value2) {
            addCriterion("DA_SUB between", value1, value2, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubNotBetween(String value1, String value2) {
            addCriterion("DA_SUB not between", value1, value2, "daSub");
            return (Criteria) this;
        }

        public Criteria andVstCadIsNull() {
            addCriterion("VST_CAD is null");
            return (Criteria) this;
        }

        public Criteria andVstCadIsNotNull() {
            addCriterion("VST_CAD is not null");
            return (Criteria) this;
        }

        public Criteria andVstCadEqualTo(String value) {
            addCriterion("VST_CAD =", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotEqualTo(String value) {
            addCriterion("VST_CAD <>", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadGreaterThan(String value) {
            addCriterion("VST_CAD >", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadGreaterThanOrEqualTo(String value) {
            addCriterion("VST_CAD >=", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLessThan(String value) {
            addCriterion("VST_CAD <", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLessThanOrEqualTo(String value) {
            addCriterion("VST_CAD <=", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLike(String value) {
            addCriterion("VST_CAD like", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotLike(String value) {
            addCriterion("VST_CAD not like", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadIn(List<String> values) {
            addCriterion("VST_CAD in", values, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotIn(List<String> values) {
            addCriterion("VST_CAD not in", values, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadBetween(String value1, String value2) {
            addCriterion("VST_CAD between", value1, value2, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotBetween(String value1, String value2) {
            addCriterion("VST_CAD not between", value1, value2, "vstCad");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartDoctIsNull() {
            addCriterion("START_DOCT is null");
            return (Criteria) this;
        }

        public Criteria andStartDoctIsNotNull() {
            addCriterion("START_DOCT is not null");
            return (Criteria) this;
        }

        public Criteria andStartDoctEqualTo(String value) {
            addCriterion("START_DOCT =", value, "startDoct");
            return (Criteria) this;
        }

        public Criteria andStartDoctNotEqualTo(String value) {
            addCriterion("START_DOCT <>", value, "startDoct");
            return (Criteria) this;
        }

        public Criteria andStartDoctGreaterThan(String value) {
            addCriterion("START_DOCT >", value, "startDoct");
            return (Criteria) this;
        }

        public Criteria andStartDoctGreaterThanOrEqualTo(String value) {
            addCriterion("START_DOCT >=", value, "startDoct");
            return (Criteria) this;
        }

        public Criteria andStartDoctLessThan(String value) {
            addCriterion("START_DOCT <", value, "startDoct");
            return (Criteria) this;
        }

        public Criteria andStartDoctLessThanOrEqualTo(String value) {
            addCriterion("START_DOCT <=", value, "startDoct");
            return (Criteria) this;
        }

        public Criteria andStartDoctLike(String value) {
            addCriterion("START_DOCT like", value, "startDoct");
            return (Criteria) this;
        }

        public Criteria andStartDoctNotLike(String value) {
            addCriterion("START_DOCT not like", value, "startDoct");
            return (Criteria) this;
        }

        public Criteria andStartDoctIn(List<String> values) {
            addCriterion("START_DOCT in", values, "startDoct");
            return (Criteria) this;
        }

        public Criteria andStartDoctNotIn(List<String> values) {
            addCriterion("START_DOCT not in", values, "startDoct");
            return (Criteria) this;
        }

        public Criteria andStartDoctBetween(String value1, String value2) {
            addCriterion("START_DOCT between", value1, value2, "startDoct");
            return (Criteria) this;
        }

        public Criteria andStartDoctNotBetween(String value1, String value2) {
            addCriterion("START_DOCT not between", value1, value2, "startDoct");
            return (Criteria) this;
        }

        public Criteria andDaTypeIsNull() {
            addCriterion("DA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDaTypeIsNotNull() {
            addCriterion("DA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDaTypeEqualTo(String value) {
            addCriterion("DA_TYPE =", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotEqualTo(String value) {
            addCriterion("DA_TYPE <>", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeGreaterThan(String value) {
            addCriterion("DA_TYPE >", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DA_TYPE >=", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeLessThan(String value) {
            addCriterion("DA_TYPE <", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeLessThanOrEqualTo(String value) {
            addCriterion("DA_TYPE <=", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeLike(String value) {
            addCriterion("DA_TYPE like", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotLike(String value) {
            addCriterion("DA_TYPE not like", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeIn(List<String> values) {
            addCriterion("DA_TYPE in", values, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotIn(List<String> values) {
            addCriterion("DA_TYPE not in", values, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeBetween(String value1, String value2) {
            addCriterion("DA_TYPE between", value1, value2, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotBetween(String value1, String value2) {
            addCriterion("DA_TYPE not between", value1, value2, "daType");
            return (Criteria) this;
        }

        public Criteria andDaInfoIsNull() {
            addCriterion("DA_INFO is null");
            return (Criteria) this;
        }

        public Criteria andDaInfoIsNotNull() {
            addCriterion("DA_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andDaInfoEqualTo(String value) {
            addCriterion("DA_INFO =", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoNotEqualTo(String value) {
            addCriterion("DA_INFO <>", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoGreaterThan(String value) {
            addCriterion("DA_INFO >", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoGreaterThanOrEqualTo(String value) {
            addCriterion("DA_INFO >=", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoLessThan(String value) {
            addCriterion("DA_INFO <", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoLessThanOrEqualTo(String value) {
            addCriterion("DA_INFO <=", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoLike(String value) {
            addCriterion("DA_INFO like", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoNotLike(String value) {
            addCriterion("DA_INFO not like", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoIn(List<String> values) {
            addCriterion("DA_INFO in", values, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoNotIn(List<String> values) {
            addCriterion("DA_INFO not in", values, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoBetween(String value1, String value2) {
            addCriterion("DA_INFO between", value1, value2, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoNotBetween(String value1, String value2) {
            addCriterion("DA_INFO not between", value1, value2, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaDoseIsNull() {
            addCriterion("DA_DOSE is null");
            return (Criteria) this;
        }

        public Criteria andDaDoseIsNotNull() {
            addCriterion("DA_DOSE is not null");
            return (Criteria) this;
        }

        public Criteria andDaDoseEqualTo(String value) {
            addCriterion("DA_DOSE =", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseNotEqualTo(String value) {
            addCriterion("DA_DOSE <>", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseGreaterThan(String value) {
            addCriterion("DA_DOSE >", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseGreaterThanOrEqualTo(String value) {
            addCriterion("DA_DOSE >=", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseLessThan(String value) {
            addCriterion("DA_DOSE <", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseLessThanOrEqualTo(String value) {
            addCriterion("DA_DOSE <=", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseLike(String value) {
            addCriterion("DA_DOSE like", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseNotLike(String value) {
            addCriterion("DA_DOSE not like", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseIn(List<String> values) {
            addCriterion("DA_DOSE in", values, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseNotIn(List<String> values) {
            addCriterion("DA_DOSE not in", values, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseBetween(String value1, String value2) {
            addCriterion("DA_DOSE between", value1, value2, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseNotBetween(String value1, String value2) {
            addCriterion("DA_DOSE not between", value1, value2, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaUnitIsNull() {
            addCriterion("DA_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andDaUnitIsNotNull() {
            addCriterion("DA_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andDaUnitEqualTo(String value) {
            addCriterion("DA_UNIT =", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitNotEqualTo(String value) {
            addCriterion("DA_UNIT <>", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitGreaterThan(String value) {
            addCriterion("DA_UNIT >", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitGreaterThanOrEqualTo(String value) {
            addCriterion("DA_UNIT >=", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitLessThan(String value) {
            addCriterion("DA_UNIT <", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitLessThanOrEqualTo(String value) {
            addCriterion("DA_UNIT <=", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitLike(String value) {
            addCriterion("DA_UNIT like", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitNotLike(String value) {
            addCriterion("DA_UNIT not like", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitIn(List<String> values) {
            addCriterion("DA_UNIT in", values, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitNotIn(List<String> values) {
            addCriterion("DA_UNIT not in", values, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitBetween(String value1, String value2) {
            addCriterion("DA_UNIT between", value1, value2, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitNotBetween(String value1, String value2) {
            addCriterion("DA_UNIT not between", value1, value2, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaNumbIsNull() {
            addCriterion("DA_NUMB is null");
            return (Criteria) this;
        }

        public Criteria andDaNumbIsNotNull() {
            addCriterion("DA_NUMB is not null");
            return (Criteria) this;
        }

        public Criteria andDaNumbEqualTo(BigDecimal value) {
            addCriterion("DA_NUMB =", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbNotEqualTo(BigDecimal value) {
            addCriterion("DA_NUMB <>", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbGreaterThan(BigDecimal value) {
            addCriterion("DA_NUMB >", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DA_NUMB >=", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbLessThan(BigDecimal value) {
            addCriterion("DA_NUMB <", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DA_NUMB <=", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbIn(List<BigDecimal> values) {
            addCriterion("DA_NUMB in", values, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbNotIn(List<BigDecimal> values) {
            addCriterion("DA_NUMB not in", values, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DA_NUMB between", value1, value2, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DA_NUMB not between", value1, value2, "daNumb");
            return (Criteria) this;
        }

        public Criteria andYfdwIsNull() {
            addCriterion("YFDW is null");
            return (Criteria) this;
        }

        public Criteria andYfdwIsNotNull() {
            addCriterion("YFDW is not null");
            return (Criteria) this;
        }

        public Criteria andYfdwEqualTo(String value) {
            addCriterion("YFDW =", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwNotEqualTo(String value) {
            addCriterion("YFDW <>", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwGreaterThan(String value) {
            addCriterion("YFDW >", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwGreaterThanOrEqualTo(String value) {
            addCriterion("YFDW >=", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwLessThan(String value) {
            addCriterion("YFDW <", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwLessThanOrEqualTo(String value) {
            addCriterion("YFDW <=", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwLike(String value) {
            addCriterion("YFDW like", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwNotLike(String value) {
            addCriterion("YFDW not like", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwIn(List<String> values) {
            addCriterion("YFDW in", values, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwNotIn(List<String> values) {
            addCriterion("YFDW not in", values, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwBetween(String value1, String value2) {
            addCriterion("YFDW between", value1, value2, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwNotBetween(String value1, String value2) {
            addCriterion("YFDW not between", value1, value2, "yfdw");
            return (Criteria) this;
        }

        public Criteria andDaWayIsNull() {
            addCriterion("DA_WAY is null");
            return (Criteria) this;
        }

        public Criteria andDaWayIsNotNull() {
            addCriterion("DA_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andDaWayEqualTo(String value) {
            addCriterion("DA_WAY =", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayNotEqualTo(String value) {
            addCriterion("DA_WAY <>", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayGreaterThan(String value) {
            addCriterion("DA_WAY >", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayGreaterThanOrEqualTo(String value) {
            addCriterion("DA_WAY >=", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayLessThan(String value) {
            addCriterion("DA_WAY <", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayLessThanOrEqualTo(String value) {
            addCriterion("DA_WAY <=", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayLike(String value) {
            addCriterion("DA_WAY like", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayNotLike(String value) {
            addCriterion("DA_WAY not like", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayIn(List<String> values) {
            addCriterion("DA_WAY in", values, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayNotIn(List<String> values) {
            addCriterion("DA_WAY not in", values, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayBetween(String value1, String value2) {
            addCriterion("DA_WAY between", value1, value2, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayNotBetween(String value1, String value2) {
            addCriterion("DA_WAY not between", value1, value2, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaFreqIsNull() {
            addCriterion("DA_FREQ is null");
            return (Criteria) this;
        }

        public Criteria andDaFreqIsNotNull() {
            addCriterion("DA_FREQ is not null");
            return (Criteria) this;
        }

        public Criteria andDaFreqEqualTo(String value) {
            addCriterion("DA_FREQ =", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqNotEqualTo(String value) {
            addCriterion("DA_FREQ <>", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqGreaterThan(String value) {
            addCriterion("DA_FREQ >", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqGreaterThanOrEqualTo(String value) {
            addCriterion("DA_FREQ >=", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqLessThan(String value) {
            addCriterion("DA_FREQ <", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqLessThanOrEqualTo(String value) {
            addCriterion("DA_FREQ <=", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqLike(String value) {
            addCriterion("DA_FREQ like", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqNotLike(String value) {
            addCriterion("DA_FREQ not like", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqIn(List<String> values) {
            addCriterion("DA_FREQ in", values, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqNotIn(List<String> values) {
            addCriterion("DA_FREQ not in", values, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqBetween(String value1, String value2) {
            addCriterion("DA_FREQ between", value1, value2, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqNotBetween(String value1, String value2) {
            addCriterion("DA_FREQ not between", value1, value2, "daFreq");
            return (Criteria) this;
        }

        public Criteria andInfoSrcIsNull() {
            addCriterion("INFO_SRC is null");
            return (Criteria) this;
        }

        public Criteria andInfoSrcIsNotNull() {
            addCriterion("INFO_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andInfoSrcEqualTo(String value) {
            addCriterion("INFO_SRC =", value, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andInfoSrcNotEqualTo(String value) {
            addCriterion("INFO_SRC <>", value, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andInfoSrcGreaterThan(String value) {
            addCriterion("INFO_SRC >", value, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andInfoSrcGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_SRC >=", value, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andInfoSrcLessThan(String value) {
            addCriterion("INFO_SRC <", value, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andInfoSrcLessThanOrEqualTo(String value) {
            addCriterion("INFO_SRC <=", value, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andInfoSrcLike(String value) {
            addCriterion("INFO_SRC like", value, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andInfoSrcNotLike(String value) {
            addCriterion("INFO_SRC not like", value, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andInfoSrcIn(List<String> values) {
            addCriterion("INFO_SRC in", values, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andInfoSrcNotIn(List<String> values) {
            addCriterion("INFO_SRC not in", values, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andInfoSrcBetween(String value1, String value2) {
            addCriterion("INFO_SRC between", value1, value2, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andInfoSrcNotBetween(String value1, String value2) {
            addCriterion("INFO_SRC not between", value1, value2, "infoSrc");
            return (Criteria) this;
        }

        public Criteria andHddatIsNull() {
            addCriterion("HDDAT is null");
            return (Criteria) this;
        }

        public Criteria andHddatIsNotNull() {
            addCriterion("HDDAT is not null");
            return (Criteria) this;
        }

        public Criteria andHddatEqualTo(Date value) {
            addCriterion("HDDAT =", value, "hddat");
            return (Criteria) this;
        }

        public Criteria andHddatNotEqualTo(Date value) {
            addCriterion("HDDAT <>", value, "hddat");
            return (Criteria) this;
        }

        public Criteria andHddatGreaterThan(Date value) {
            addCriterion("HDDAT >", value, "hddat");
            return (Criteria) this;
        }

        public Criteria andHddatGreaterThanOrEqualTo(Date value) {
            addCriterion("HDDAT >=", value, "hddat");
            return (Criteria) this;
        }

        public Criteria andHddatLessThan(Date value) {
            addCriterion("HDDAT <", value, "hddat");
            return (Criteria) this;
        }

        public Criteria andHddatLessThanOrEqualTo(Date value) {
            addCriterion("HDDAT <=", value, "hddat");
            return (Criteria) this;
        }

        public Criteria andHddatIn(List<Date> values) {
            addCriterion("HDDAT in", values, "hddat");
            return (Criteria) this;
        }

        public Criteria andHddatNotIn(List<Date> values) {
            addCriterion("HDDAT not in", values, "hddat");
            return (Criteria) this;
        }

        public Criteria andHddatBetween(Date value1, Date value2) {
            addCriterion("HDDAT between", value1, value2, "hddat");
            return (Criteria) this;
        }

        public Criteria andHddatNotBetween(Date value1, Date value2) {
            addCriterion("HDDAT not between", value1, value2, "hddat");
            return (Criteria) this;
        }

        public Criteria andHdhsIsNull() {
            addCriterion("HDHS is null");
            return (Criteria) this;
        }

        public Criteria andHdhsIsNotNull() {
            addCriterion("HDHS is not null");
            return (Criteria) this;
        }

        public Criteria andHdhsEqualTo(String value) {
            addCriterion("HDHS =", value, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsNotEqualTo(String value) {
            addCriterion("HDHS <>", value, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsGreaterThan(String value) {
            addCriterion("HDHS >", value, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsGreaterThanOrEqualTo(String value) {
            addCriterion("HDHS >=", value, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsLessThan(String value) {
            addCriterion("HDHS <", value, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsLessThanOrEqualTo(String value) {
            addCriterion("HDHS <=", value, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsLike(String value) {
            addCriterion("HDHS like", value, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsNotLike(String value) {
            addCriterion("HDHS not like", value, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsIn(List<String> values) {
            addCriterion("HDHS in", values, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsNotIn(List<String> values) {
            addCriterion("HDHS not in", values, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsBetween(String value1, String value2) {
            addCriterion("HDHS between", value1, value2, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsNotBetween(String value1, String value2) {
            addCriterion("HDHS not between", value1, value2, "hdhs");
            return (Criteria) this;
        }

        public Criteria andHdhsxmIsNull() {
            addCriterion("HDHSXM is null");
            return (Criteria) this;
        }

        public Criteria andHdhsxmIsNotNull() {
            addCriterion("HDHSXM is not null");
            return (Criteria) this;
        }

        public Criteria andHdhsxmEqualTo(String value) {
            addCriterion("HDHSXM =", value, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andHdhsxmNotEqualTo(String value) {
            addCriterion("HDHSXM <>", value, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andHdhsxmGreaterThan(String value) {
            addCriterion("HDHSXM >", value, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andHdhsxmGreaterThanOrEqualTo(String value) {
            addCriterion("HDHSXM >=", value, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andHdhsxmLessThan(String value) {
            addCriterion("HDHSXM <", value, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andHdhsxmLessThanOrEqualTo(String value) {
            addCriterion("HDHSXM <=", value, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andHdhsxmLike(String value) {
            addCriterion("HDHSXM like", value, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andHdhsxmNotLike(String value) {
            addCriterion("HDHSXM not like", value, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andHdhsxmIn(List<String> values) {
            addCriterion("HDHSXM in", values, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andHdhsxmNotIn(List<String> values) {
            addCriterion("HDHSXM not in", values, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andHdhsxmBetween(String value1, String value2) {
            addCriterion("HDHSXM between", value1, value2, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andHdhsxmNotBetween(String value1, String value2) {
            addCriterion("HDHSXM not between", value1, value2, "hdhsxm");
            return (Criteria) this;
        }

        public Criteria andYzztIsNull() {
            addCriterion("YZZT is null");
            return (Criteria) this;
        }

        public Criteria andYzztIsNotNull() {
            addCriterion("YZZT is not null");
            return (Criteria) this;
        }

        public Criteria andYzztEqualTo(String value) {
            addCriterion("YZZT =", value, "yzzt");
            return (Criteria) this;
        }

        public Criteria andYzztNotEqualTo(String value) {
            addCriterion("YZZT <>", value, "yzzt");
            return (Criteria) this;
        }

        public Criteria andYzztGreaterThan(String value) {
            addCriterion("YZZT >", value, "yzzt");
            return (Criteria) this;
        }

        public Criteria andYzztGreaterThanOrEqualTo(String value) {
            addCriterion("YZZT >=", value, "yzzt");
            return (Criteria) this;
        }

        public Criteria andYzztLessThan(String value) {
            addCriterion("YZZT <", value, "yzzt");
            return (Criteria) this;
        }

        public Criteria andYzztLessThanOrEqualTo(String value) {
            addCriterion("YZZT <=", value, "yzzt");
            return (Criteria) this;
        }

        public Criteria andYzztLike(String value) {
            addCriterion("YZZT like", value, "yzzt");
            return (Criteria) this;
        }

        public Criteria andYzztNotLike(String value) {
            addCriterion("YZZT not like", value, "yzzt");
            return (Criteria) this;
        }

        public Criteria andYzztIn(List<String> values) {
            addCriterion("YZZT in", values, "yzzt");
            return (Criteria) this;
        }

        public Criteria andYzztNotIn(List<String> values) {
            addCriterion("YZZT not in", values, "yzzt");
            return (Criteria) this;
        }

        public Criteria andYzztBetween(String value1, String value2) {
            addCriterion("YZZT between", value1, value2, "yzzt");
            return (Criteria) this;
        }

        public Criteria andYzztNotBetween(String value1, String value2) {
            addCriterion("YZZT not between", value1, value2, "yzzt");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("CRT_TIME =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("CRT_TIME <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("CRT_TIME >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("CRT_TIME <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("CRT_TIME in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("CRT_TIME not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNull() {
            addCriterion("CRT_USER is null");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNotNull() {
            addCriterion("CRT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUserEqualTo(String value) {
            addCriterion("CRT_USER =", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotEqualTo(String value) {
            addCriterion("CRT_USER <>", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThan(String value) {
            addCriterion("CRT_USER >", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USER >=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThan(String value) {
            addCriterion("CRT_USER <", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThanOrEqualTo(String value) {
            addCriterion("CRT_USER <=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLike(String value) {
            addCriterion("CRT_USER like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotLike(String value) {
            addCriterion("CRT_USER not like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserIn(List<String> values) {
            addCriterion("CRT_USER in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotIn(List<String> values) {
            addCriterion("CRT_USER not in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserBetween(String value1, String value2) {
            addCriterion("CRT_USER between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotBetween(String value1, String value2) {
            addCriterion("CRT_USER not between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("MOD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("MOD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("MOD_TIME =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("MOD_TIME <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("MOD_TIME >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("MOD_TIME <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("MOD_TIME in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("MOD_TIME not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModUserIsNull() {
            addCriterion("MOD_USER is null");
            return (Criteria) this;
        }

        public Criteria andModUserIsNotNull() {
            addCriterion("MOD_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModUserEqualTo(String value) {
            addCriterion("MOD_USER =", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotEqualTo(String value) {
            addCriterion("MOD_USER <>", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserGreaterThan(String value) {
            addCriterion("MOD_USER >", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USER >=", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLessThan(String value) {
            addCriterion("MOD_USER <", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLessThanOrEqualTo(String value) {
            addCriterion("MOD_USER <=", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLike(String value) {
            addCriterion("MOD_USER like", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotLike(String value) {
            addCriterion("MOD_USER not like", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserIn(List<String> values) {
            addCriterion("MOD_USER in", values, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotIn(List<String> values) {
            addCriterion("MOD_USER not in", values, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserBetween(String value1, String value2) {
            addCriterion("MOD_USER between", value1, value2, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotBetween(String value1, String value2) {
            addCriterion("MOD_USER not between", value1, value2, "modUser");
            return (Criteria) this;
        }

        public Criteria andMpiIsNull() {
            addCriterion("MPI is null");
            return (Criteria) this;
        }

        public Criteria andMpiIsNotNull() {
            addCriterion("MPI is not null");
            return (Criteria) this;
        }

        public Criteria andMpiEqualTo(String value) {
            addCriterion("MPI =", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotEqualTo(String value) {
            addCriterion("MPI <>", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiGreaterThan(String value) {
            addCriterion("MPI >", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiGreaterThanOrEqualTo(String value) {
            addCriterion("MPI >=", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLessThan(String value) {
            addCriterion("MPI <", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLessThanOrEqualTo(String value) {
            addCriterion("MPI <=", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLike(String value) {
            addCriterion("MPI like", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotLike(String value) {
            addCriterion("MPI not like", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiIn(List<String> values) {
            addCriterion("MPI in", values, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotIn(List<String> values) {
            addCriterion("MPI not in", values, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiBetween(String value1, String value2) {
            addCriterion("MPI between", value1, value2, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotBetween(String value1, String value2) {
            addCriterion("MPI not between", value1, value2, "mpi");
            return (Criteria) this;
        }

        public Criteria andDaWayCodIsNull() {
            addCriterion("DA_WAY_COD is null");
            return (Criteria) this;
        }

        public Criteria andDaWayCodIsNotNull() {
            addCriterion("DA_WAY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andDaWayCodEqualTo(String value) {
            addCriterion("DA_WAY_COD =", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodNotEqualTo(String value) {
            addCriterion("DA_WAY_COD <>", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodGreaterThan(String value) {
            addCriterion("DA_WAY_COD >", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodGreaterThanOrEqualTo(String value) {
            addCriterion("DA_WAY_COD >=", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodLessThan(String value) {
            addCriterion("DA_WAY_COD <", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodLessThanOrEqualTo(String value) {
            addCriterion("DA_WAY_COD <=", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodLike(String value) {
            addCriterion("DA_WAY_COD like", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodNotLike(String value) {
            addCriterion("DA_WAY_COD not like", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodIn(List<String> values) {
            addCriterion("DA_WAY_COD in", values, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodNotIn(List<String> values) {
            addCriterion("DA_WAY_COD not in", values, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodBetween(String value1, String value2) {
            addCriterion("DA_WAY_COD between", value1, value2, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodNotBetween(String value1, String value2) {
            addCriterion("DA_WAY_COD not between", value1, value2, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andHighRiskIsNull() {
            addCriterion("HIGH_RISK is null");
            return (Criteria) this;
        }

        public Criteria andHighRiskIsNotNull() {
            addCriterion("HIGH_RISK is not null");
            return (Criteria) this;
        }

        public Criteria andHighRiskEqualTo(String value) {
            addCriterion("HIGH_RISK =", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskNotEqualTo(String value) {
            addCriterion("HIGH_RISK <>", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskGreaterThan(String value) {
            addCriterion("HIGH_RISK >", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskGreaterThanOrEqualTo(String value) {
            addCriterion("HIGH_RISK >=", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskLessThan(String value) {
            addCriterion("HIGH_RISK <", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskLessThanOrEqualTo(String value) {
            addCriterion("HIGH_RISK <=", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskLike(String value) {
            addCriterion("HIGH_RISK like", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskNotLike(String value) {
            addCriterion("HIGH_RISK not like", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskIn(List<String> values) {
            addCriterion("HIGH_RISK in", values, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskNotIn(List<String> values) {
            addCriterion("HIGH_RISK not in", values, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskBetween(String value1, String value2) {
            addCriterion("HIGH_RISK between", value1, value2, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskNotBetween(String value1, String value2) {
            addCriterion("HIGH_RISK not between", value1, value2, "highRisk");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNull() {
            addCriterion("ENTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNotNull() {
            addCriterion("ENTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeEqualTo(Date value) {
            addCriterion("ENTER_TIME =", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotEqualTo(Date value) {
            addCriterion("ENTER_TIME <>", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThan(Date value) {
            addCriterion("ENTER_TIME >", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTER_TIME >=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThan(Date value) {
            addCriterion("ENTER_TIME <", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThanOrEqualTo(Date value) {
            addCriterion("ENTER_TIME <=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIn(List<Date> values) {
            addCriterion("ENTER_TIME in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotIn(List<Date> values) {
            addCriterion("ENTER_TIME not in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeBetween(Date value1, Date value2) {
            addCriterion("ENTER_TIME between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotBetween(Date value1, Date value2) {
            addCriterion("ENTER_TIME not between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andSeriesIsNull() {
            addCriterion("SERIES is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIsNotNull() {
            addCriterion("SERIES is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesEqualTo(Short value) {
            addCriterion("SERIES =", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotEqualTo(Short value) {
            addCriterion("SERIES <>", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThan(Short value) {
            addCriterion("SERIES >", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThanOrEqualTo(Short value) {
            addCriterion("SERIES >=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThan(Short value) {
            addCriterion("SERIES <", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThanOrEqualTo(Short value) {
            addCriterion("SERIES <=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesIn(List<Short> values) {
            addCriterion("SERIES in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotIn(List<Short> values) {
            addCriterion("SERIES not in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesBetween(Short value1, Short value2) {
            addCriterion("SERIES between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotBetween(Short value1, Short value2) {
            addCriterion("SERIES not between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andMrnIsNull() {
            addCriterion("MRN is null");
            return (Criteria) this;
        }

        public Criteria andMrnIsNotNull() {
            addCriterion("MRN is not null");
            return (Criteria) this;
        }

        public Criteria andMrnEqualTo(String value) {
            addCriterion("MRN =", value, "mrn");
            return (Criteria) this;
        }

        public Criteria andMrnNotEqualTo(String value) {
            addCriterion("MRN <>", value, "mrn");
            return (Criteria) this;
        }

        public Criteria andMrnGreaterThan(String value) {
            addCriterion("MRN >", value, "mrn");
            return (Criteria) this;
        }

        public Criteria andMrnGreaterThanOrEqualTo(String value) {
            addCriterion("MRN >=", value, "mrn");
            return (Criteria) this;
        }

        public Criteria andMrnLessThan(String value) {
            addCriterion("MRN <", value, "mrn");
            return (Criteria) this;
        }

        public Criteria andMrnLessThanOrEqualTo(String value) {
            addCriterion("MRN <=", value, "mrn");
            return (Criteria) this;
        }

        public Criteria andMrnLike(String value) {
            addCriterion("MRN like", value, "mrn");
            return (Criteria) this;
        }

        public Criteria andMrnNotLike(String value) {
            addCriterion("MRN not like", value, "mrn");
            return (Criteria) this;
        }

        public Criteria andMrnIn(List<String> values) {
            addCriterion("MRN in", values, "mrn");
            return (Criteria) this;
        }

        public Criteria andMrnNotIn(List<String> values) {
            addCriterion("MRN not in", values, "mrn");
            return (Criteria) this;
        }

        public Criteria andMrnBetween(String value1, String value2) {
            addCriterion("MRN between", value1, value2, "mrn");
            return (Criteria) this;
        }

        public Criteria andMrnNotBetween(String value1, String value2) {
            addCriterion("MRN not between", value1, value2, "mrn");
            return (Criteria) this;
        }

        public Criteria andWardCodeIsNull() {
            addCriterion("WARD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andWardCodeIsNotNull() {
            addCriterion("WARD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andWardCodeEqualTo(String value) {
            addCriterion("WARD_CODE =", value, "wardCode");
            return (Criteria) this;
        }

        public Criteria andWardCodeNotEqualTo(String value) {
            addCriterion("WARD_CODE <>", value, "wardCode");
            return (Criteria) this;
        }

        public Criteria andWardCodeGreaterThan(String value) {
            addCriterion("WARD_CODE >", value, "wardCode");
            return (Criteria) this;
        }

        public Criteria andWardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("WARD_CODE >=", value, "wardCode");
            return (Criteria) this;
        }

        public Criteria andWardCodeLessThan(String value) {
            addCriterion("WARD_CODE <", value, "wardCode");
            return (Criteria) this;
        }

        public Criteria andWardCodeLessThanOrEqualTo(String value) {
            addCriterion("WARD_CODE <=", value, "wardCode");
            return (Criteria) this;
        }

        public Criteria andWardCodeLike(String value) {
            addCriterion("WARD_CODE like", value, "wardCode");
            return (Criteria) this;
        }

        public Criteria andWardCodeNotLike(String value) {
            addCriterion("WARD_CODE not like", value, "wardCode");
            return (Criteria) this;
        }

        public Criteria andWardCodeIn(List<String> values) {
            addCriterion("WARD_CODE in", values, "wardCode");
            return (Criteria) this;
        }

        public Criteria andWardCodeNotIn(List<String> values) {
            addCriterion("WARD_CODE not in", values, "wardCode");
            return (Criteria) this;
        }

        public Criteria andWardCodeBetween(String value1, String value2) {
            addCriterion("WARD_CODE between", value1, value2, "wardCode");
            return (Criteria) this;
        }

        public Criteria andWardCodeNotBetween(String value1, String value2) {
            addCriterion("WARD_CODE not between", value1, value2, "wardCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("DEPT_CODE =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("DEPT_CODE <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("DEPT_CODE >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("DEPT_CODE <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("DEPT_CODE like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("DEPT_CODE not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("DEPT_CODE in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("DEPT_CODE not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("DEPT_CODE between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_CODE not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderClassIsNull() {
            addCriterion("ORDER_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andOrderClassIsNotNull() {
            addCriterion("ORDER_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderClassEqualTo(String value) {
            addCriterion("ORDER_CLASS =", value, "orderClass");
            return (Criteria) this;
        }

        public Criteria andOrderClassNotEqualTo(String value) {
            addCriterion("ORDER_CLASS <>", value, "orderClass");
            return (Criteria) this;
        }

        public Criteria andOrderClassGreaterThan(String value) {
            addCriterion("ORDER_CLASS >", value, "orderClass");
            return (Criteria) this;
        }

        public Criteria andOrderClassGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CLASS >=", value, "orderClass");
            return (Criteria) this;
        }

        public Criteria andOrderClassLessThan(String value) {
            addCriterion("ORDER_CLASS <", value, "orderClass");
            return (Criteria) this;
        }

        public Criteria andOrderClassLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CLASS <=", value, "orderClass");
            return (Criteria) this;
        }

        public Criteria andOrderClassLike(String value) {
            addCriterion("ORDER_CLASS like", value, "orderClass");
            return (Criteria) this;
        }

        public Criteria andOrderClassNotLike(String value) {
            addCriterion("ORDER_CLASS not like", value, "orderClass");
            return (Criteria) this;
        }

        public Criteria andOrderClassIn(List<String> values) {
            addCriterion("ORDER_CLASS in", values, "orderClass");
            return (Criteria) this;
        }

        public Criteria andOrderClassNotIn(List<String> values) {
            addCriterion("ORDER_CLASS not in", values, "orderClass");
            return (Criteria) this;
        }

        public Criteria andOrderClassBetween(String value1, String value2) {
            addCriterion("ORDER_CLASS between", value1, value2, "orderClass");
            return (Criteria) this;
        }

        public Criteria andOrderClassNotBetween(String value1, String value2) {
            addCriterion("ORDER_CLASS not between", value1, value2, "orderClass");
            return (Criteria) this;
        }

        public Criteria andTodayTimesIsNull() {
            addCriterion("TODAY_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andTodayTimesIsNotNull() {
            addCriterion("TODAY_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andTodayTimesEqualTo(Short value) {
            addCriterion("TODAY_TIMES =", value, "todayTimes");
            return (Criteria) this;
        }

        public Criteria andTodayTimesNotEqualTo(Short value) {
            addCriterion("TODAY_TIMES <>", value, "todayTimes");
            return (Criteria) this;
        }

        public Criteria andTodayTimesGreaterThan(Short value) {
            addCriterion("TODAY_TIMES >", value, "todayTimes");
            return (Criteria) this;
        }

        public Criteria andTodayTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("TODAY_TIMES >=", value, "todayTimes");
            return (Criteria) this;
        }

        public Criteria andTodayTimesLessThan(Short value) {
            addCriterion("TODAY_TIMES <", value, "todayTimes");
            return (Criteria) this;
        }

        public Criteria andTodayTimesLessThanOrEqualTo(Short value) {
            addCriterion("TODAY_TIMES <=", value, "todayTimes");
            return (Criteria) this;
        }

        public Criteria andTodayTimesIn(List<Short> values) {
            addCriterion("TODAY_TIMES in", values, "todayTimes");
            return (Criteria) this;
        }

        public Criteria andTodayTimesNotIn(List<Short> values) {
            addCriterion("TODAY_TIMES not in", values, "todayTimes");
            return (Criteria) this;
        }

        public Criteria andTodayTimesBetween(Short value1, Short value2) {
            addCriterion("TODAY_TIMES between", value1, value2, "todayTimes");
            return (Criteria) this;
        }

        public Criteria andTodayTimesNotBetween(Short value1, Short value2) {
            addCriterion("TODAY_TIMES not between", value1, value2, "todayTimes");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfIsNull() {
            addCriterion("PROVIDE_BY_SELF is null");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfIsNotNull() {
            addCriterion("PROVIDE_BY_SELF is not null");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfEqualTo(Short value) {
            addCriterion("PROVIDE_BY_SELF =", value, "provideBySelf");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfNotEqualTo(Short value) {
            addCriterion("PROVIDE_BY_SELF <>", value, "provideBySelf");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfGreaterThan(Short value) {
            addCriterion("PROVIDE_BY_SELF >", value, "provideBySelf");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfGreaterThanOrEqualTo(Short value) {
            addCriterion("PROVIDE_BY_SELF >=", value, "provideBySelf");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfLessThan(Short value) {
            addCriterion("PROVIDE_BY_SELF <", value, "provideBySelf");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfLessThanOrEqualTo(Short value) {
            addCriterion("PROVIDE_BY_SELF <=", value, "provideBySelf");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfIn(List<Short> values) {
            addCriterion("PROVIDE_BY_SELF in", values, "provideBySelf");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfNotIn(List<Short> values) {
            addCriterion("PROVIDE_BY_SELF not in", values, "provideBySelf");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfBetween(Short value1, Short value2) {
            addCriterion("PROVIDE_BY_SELF between", value1, value2, "provideBySelf");
            return (Criteria) this;
        }

        public Criteria andProvideBySelfNotBetween(Short value1, Short value2) {
            addCriterion("PROVIDE_BY_SELF not between", value1, value2, "provideBySelf");
            return (Criteria) this;
        }

        public Criteria andIsAuxIsNull() {
            addCriterion("IS_AUX is null");
            return (Criteria) this;
        }

        public Criteria andIsAuxIsNotNull() {
            addCriterion("IS_AUX is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuxEqualTo(Short value) {
            addCriterion("IS_AUX =", value, "isAux");
            return (Criteria) this;
        }

        public Criteria andIsAuxNotEqualTo(Short value) {
            addCriterion("IS_AUX <>", value, "isAux");
            return (Criteria) this;
        }

        public Criteria andIsAuxGreaterThan(Short value) {
            addCriterion("IS_AUX >", value, "isAux");
            return (Criteria) this;
        }

        public Criteria andIsAuxGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_AUX >=", value, "isAux");
            return (Criteria) this;
        }

        public Criteria andIsAuxLessThan(Short value) {
            addCriterion("IS_AUX <", value, "isAux");
            return (Criteria) this;
        }

        public Criteria andIsAuxLessThanOrEqualTo(Short value) {
            addCriterion("IS_AUX <=", value, "isAux");
            return (Criteria) this;
        }

        public Criteria andIsAuxIn(List<Short> values) {
            addCriterion("IS_AUX in", values, "isAux");
            return (Criteria) this;
        }

        public Criteria andIsAuxNotIn(List<Short> values) {
            addCriterion("IS_AUX not in", values, "isAux");
            return (Criteria) this;
        }

        public Criteria andIsAuxBetween(Short value1, Short value2) {
            addCriterion("IS_AUX between", value1, value2, "isAux");
            return (Criteria) this;
        }

        public Criteria andIsAuxNotBetween(Short value1, Short value2) {
            addCriterion("IS_AUX not between", value1, value2, "isAux");
            return (Criteria) this;
        }

        public Criteria andExhortationIsNull() {
            addCriterion("EXHORTATION is null");
            return (Criteria) this;
        }

        public Criteria andExhortationIsNotNull() {
            addCriterion("EXHORTATION is not null");
            return (Criteria) this;
        }

        public Criteria andExhortationEqualTo(String value) {
            addCriterion("EXHORTATION =", value, "exhortation");
            return (Criteria) this;
        }

        public Criteria andExhortationNotEqualTo(String value) {
            addCriterion("EXHORTATION <>", value, "exhortation");
            return (Criteria) this;
        }

        public Criteria andExhortationGreaterThan(String value) {
            addCriterion("EXHORTATION >", value, "exhortation");
            return (Criteria) this;
        }

        public Criteria andExhortationGreaterThanOrEqualTo(String value) {
            addCriterion("EXHORTATION >=", value, "exhortation");
            return (Criteria) this;
        }

        public Criteria andExhortationLessThan(String value) {
            addCriterion("EXHORTATION <", value, "exhortation");
            return (Criteria) this;
        }

        public Criteria andExhortationLessThanOrEqualTo(String value) {
            addCriterion("EXHORTATION <=", value, "exhortation");
            return (Criteria) this;
        }

        public Criteria andExhortationLike(String value) {
            addCriterion("EXHORTATION like", value, "exhortation");
            return (Criteria) this;
        }

        public Criteria andExhortationNotLike(String value) {
            addCriterion("EXHORTATION not like", value, "exhortation");
            return (Criteria) this;
        }

        public Criteria andExhortationIn(List<String> values) {
            addCriterion("EXHORTATION in", values, "exhortation");
            return (Criteria) this;
        }

        public Criteria andExhortationNotIn(List<String> values) {
            addCriterion("EXHORTATION not in", values, "exhortation");
            return (Criteria) this;
        }

        public Criteria andExhortationBetween(String value1, String value2) {
            addCriterion("EXHORTATION between", value1, value2, "exhortation");
            return (Criteria) this;
        }

        public Criteria andExhortationNotBetween(String value1, String value2) {
            addCriterion("EXHORTATION not between", value1, value2, "exhortation");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDrugSpecIsNull() {
            addCriterion("DRUG_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andDrugSpecIsNotNull() {
            addCriterion("DRUG_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andDrugSpecEqualTo(String value) {
            addCriterion("DRUG_SPEC =", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecNotEqualTo(String value) {
            addCriterion("DRUG_SPEC <>", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecGreaterThan(String value) {
            addCriterion("DRUG_SPEC >", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_SPEC >=", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecLessThan(String value) {
            addCriterion("DRUG_SPEC <", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecLessThanOrEqualTo(String value) {
            addCriterion("DRUG_SPEC <=", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecLike(String value) {
            addCriterion("DRUG_SPEC like", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecNotLike(String value) {
            addCriterion("DRUG_SPEC not like", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecIn(List<String> values) {
            addCriterion("DRUG_SPEC in", values, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecNotIn(List<String> values) {
            addCriterion("DRUG_SPEC not in", values, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecBetween(String value1, String value2) {
            addCriterion("DRUG_SPEC between", value1, value2, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecNotBetween(String value1, String value2) {
            addCriterion("DRUG_SPEC not between", value1, value2, "drugSpec");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_CFXX_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_CFXX_INFO 2020-05-22
     */
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