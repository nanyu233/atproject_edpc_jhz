package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspCramsInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCramsInfExample() {
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

        public Criteria andEmgSeqIsNull() {
            addCriterion("EMG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqIsNotNull() {
            addCriterion("EMG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqEqualTo(String value) {
            addCriterion("EMG_SEQ =", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotEqualTo(String value) {
            addCriterion("EMG_SEQ <>", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqGreaterThan(String value) {
            addCriterion("EMG_SEQ >", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ >=", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqLessThan(String value) {
            addCriterion("EMG_SEQ <", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqLessThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ <=", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqLike(String value) {
            addCriterion("EMG_SEQ like", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotLike(String value) {
            addCriterion("EMG_SEQ not like", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqIn(List<String> values) {
            addCriterion("EMG_SEQ in", values, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotIn(List<String> values) {
            addCriterion("EMG_SEQ not in", values, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqBetween(String value1, String value2) {
            addCriterion("EMG_SEQ between", value1, value2, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotBetween(String value1, String value2) {
            addCriterion("EMG_SEQ not between", value1, value2, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodIsNull() {
            addCriterion("CIR_LVL_COD is null");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodIsNotNull() {
            addCriterion("CIR_LVL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodEqualTo(String value) {
            addCriterion("CIR_LVL_COD =", value, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodNotEqualTo(String value) {
            addCriterion("CIR_LVL_COD <>", value, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodGreaterThan(String value) {
            addCriterion("CIR_LVL_COD >", value, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodGreaterThanOrEqualTo(String value) {
            addCriterion("CIR_LVL_COD >=", value, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodLessThan(String value) {
            addCriterion("CIR_LVL_COD <", value, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodLessThanOrEqualTo(String value) {
            addCriterion("CIR_LVL_COD <=", value, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodLike(String value) {
            addCriterion("CIR_LVL_COD like", value, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodNotLike(String value) {
            addCriterion("CIR_LVL_COD not like", value, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodIn(List<String> values) {
            addCriterion("CIR_LVL_COD in", values, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodNotIn(List<String> values) {
            addCriterion("CIR_LVL_COD not in", values, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodBetween(String value1, String value2) {
            addCriterion("CIR_LVL_COD between", value1, value2, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andCirLvlCodNotBetween(String value1, String value2) {
            addCriterion("CIR_LVL_COD not between", value1, value2, "cirLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodIsNull() {
            addCriterion("BRE_LVL_COD is null");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodIsNotNull() {
            addCriterion("BRE_LVL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodEqualTo(String value) {
            addCriterion("BRE_LVL_COD =", value, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodNotEqualTo(String value) {
            addCriterion("BRE_LVL_COD <>", value, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodGreaterThan(String value) {
            addCriterion("BRE_LVL_COD >", value, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodGreaterThanOrEqualTo(String value) {
            addCriterion("BRE_LVL_COD >=", value, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodLessThan(String value) {
            addCriterion("BRE_LVL_COD <", value, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodLessThanOrEqualTo(String value) {
            addCriterion("BRE_LVL_COD <=", value, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodLike(String value) {
            addCriterion("BRE_LVL_COD like", value, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodNotLike(String value) {
            addCriterion("BRE_LVL_COD not like", value, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodIn(List<String> values) {
            addCriterion("BRE_LVL_COD in", values, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodNotIn(List<String> values) {
            addCriterion("BRE_LVL_COD not in", values, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodBetween(String value1, String value2) {
            addCriterion("BRE_LVL_COD between", value1, value2, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBreLvlCodNotBetween(String value1, String value2) {
            addCriterion("BRE_LVL_COD not between", value1, value2, "breLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodIsNull() {
            addCriterion("BDY_LVL_COD is null");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodIsNotNull() {
            addCriterion("BDY_LVL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodEqualTo(String value) {
            addCriterion("BDY_LVL_COD =", value, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodNotEqualTo(String value) {
            addCriterion("BDY_LVL_COD <>", value, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodGreaterThan(String value) {
            addCriterion("BDY_LVL_COD >", value, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodGreaterThanOrEqualTo(String value) {
            addCriterion("BDY_LVL_COD >=", value, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodLessThan(String value) {
            addCriterion("BDY_LVL_COD <", value, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodLessThanOrEqualTo(String value) {
            addCriterion("BDY_LVL_COD <=", value, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodLike(String value) {
            addCriterion("BDY_LVL_COD like", value, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodNotLike(String value) {
            addCriterion("BDY_LVL_COD not like", value, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodIn(List<String> values) {
            addCriterion("BDY_LVL_COD in", values, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodNotIn(List<String> values) {
            addCriterion("BDY_LVL_COD not in", values, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodBetween(String value1, String value2) {
            addCriterion("BDY_LVL_COD between", value1, value2, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andBdyLvlCodNotBetween(String value1, String value2) {
            addCriterion("BDY_LVL_COD not between", value1, value2, "bdyLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodIsNull() {
            addCriterion("SPT_LVL_COD is null");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodIsNotNull() {
            addCriterion("SPT_LVL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodEqualTo(String value) {
            addCriterion("SPT_LVL_COD =", value, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodNotEqualTo(String value) {
            addCriterion("SPT_LVL_COD <>", value, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodGreaterThan(String value) {
            addCriterion("SPT_LVL_COD >", value, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodGreaterThanOrEqualTo(String value) {
            addCriterion("SPT_LVL_COD >=", value, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodLessThan(String value) {
            addCriterion("SPT_LVL_COD <", value, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodLessThanOrEqualTo(String value) {
            addCriterion("SPT_LVL_COD <=", value, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodLike(String value) {
            addCriterion("SPT_LVL_COD like", value, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodNotLike(String value) {
            addCriterion("SPT_LVL_COD not like", value, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodIn(List<String> values) {
            addCriterion("SPT_LVL_COD in", values, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodNotIn(List<String> values) {
            addCriterion("SPT_LVL_COD not in", values, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodBetween(String value1, String value2) {
            addCriterion("SPT_LVL_COD between", value1, value2, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andSptLvlCodNotBetween(String value1, String value2) {
            addCriterion("SPT_LVL_COD not between", value1, value2, "sptLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodIsNull() {
            addCriterion("LAN_LVL_COD is null");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodIsNotNull() {
            addCriterion("LAN_LVL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodEqualTo(String value) {
            addCriterion("LAN_LVL_COD =", value, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodNotEqualTo(String value) {
            addCriterion("LAN_LVL_COD <>", value, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodGreaterThan(String value) {
            addCriterion("LAN_LVL_COD >", value, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodGreaterThanOrEqualTo(String value) {
            addCriterion("LAN_LVL_COD >=", value, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodLessThan(String value) {
            addCriterion("LAN_LVL_COD <", value, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodLessThanOrEqualTo(String value) {
            addCriterion("LAN_LVL_COD <=", value, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodLike(String value) {
            addCriterion("LAN_LVL_COD like", value, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodNotLike(String value) {
            addCriterion("LAN_LVL_COD not like", value, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodIn(List<String> values) {
            addCriterion("LAN_LVL_COD in", values, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodNotIn(List<String> values) {
            addCriterion("LAN_LVL_COD not in", values, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodBetween(String value1, String value2) {
            addCriterion("LAN_LVL_COD between", value1, value2, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andLanLvlCodNotBetween(String value1, String value2) {
            addCriterion("LAN_LVL_COD not between", value1, value2, "lanLvlCod");
            return (Criteria) this;
        }

        public Criteria andTotScoIsNull() {
            addCriterion("TOT_SCO is null");
            return (Criteria) this;
        }

        public Criteria andTotScoIsNotNull() {
            addCriterion("TOT_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andTotScoEqualTo(Long value) {
            addCriterion("TOT_SCO =", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoNotEqualTo(Long value) {
            addCriterion("TOT_SCO <>", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoGreaterThan(Long value) {
            addCriterion("TOT_SCO >", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoGreaterThanOrEqualTo(Long value) {
            addCriterion("TOT_SCO >=", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoLessThan(Long value) {
            addCriterion("TOT_SCO <", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoLessThanOrEqualTo(Long value) {
            addCriterion("TOT_SCO <=", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoIn(List<Long> values) {
            addCriterion("TOT_SCO in", values, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoNotIn(List<Long> values) {
            addCriterion("TOT_SCO not in", values, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoBetween(Long value1, Long value2) {
            addCriterion("TOT_SCO between", value1, value2, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoNotBetween(Long value1, Long value2) {
            addCriterion("TOT_SCO not between", value1, value2, "totSco");
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