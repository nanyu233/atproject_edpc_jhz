package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HspConsentTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspConsentTempExample() {
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

        public Criteria andTempnoIsNull() {
            addCriterion("TEMPNO is null");
            return (Criteria) this;
        }

        public Criteria andTempnoIsNotNull() {
            addCriterion("TEMPNO is not null");
            return (Criteria) this;
        }

        public Criteria andTempnoEqualTo(String value) {
            addCriterion("TEMPNO =", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoNotEqualTo(String value) {
            addCriterion("TEMPNO <>", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoGreaterThan(String value) {
            addCriterion("TEMPNO >", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPNO >=", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoLessThan(String value) {
            addCriterion("TEMPNO <", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoLessThanOrEqualTo(String value) {
            addCriterion("TEMPNO <=", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoLike(String value) {
            addCriterion("TEMPNO like", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoNotLike(String value) {
            addCriterion("TEMPNO not like", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoIn(List<String> values) {
            addCriterion("TEMPNO in", values, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoNotIn(List<String> values) {
            addCriterion("TEMPNO not in", values, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoBetween(String value1, String value2) {
            addCriterion("TEMPNO between", value1, value2, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoNotBetween(String value1, String value2) {
            addCriterion("TEMPNO not between", value1, value2, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnameIsNull() {
            addCriterion("TEMPNAME is null");
            return (Criteria) this;
        }

        public Criteria andTempnameIsNotNull() {
            addCriterion("TEMPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTempnameEqualTo(String value) {
            addCriterion("TEMPNAME =", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameNotEqualTo(String value) {
            addCriterion("TEMPNAME <>", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameGreaterThan(String value) {
            addCriterion("TEMPNAME >", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPNAME >=", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameLessThan(String value) {
            addCriterion("TEMPNAME <", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameLessThanOrEqualTo(String value) {
            addCriterion("TEMPNAME <=", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameLike(String value) {
            addCriterion("TEMPNAME like", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameNotLike(String value) {
            addCriterion("TEMPNAME not like", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameIn(List<String> values) {
            addCriterion("TEMPNAME in", values, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameNotIn(List<String> values) {
            addCriterion("TEMPNAME not in", values, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameBetween(String value1, String value2) {
            addCriterion("TEMPNAME between", value1, value2, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameNotBetween(String value1, String value2) {
            addCriterion("TEMPNAME not between", value1, value2, "tempname");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andOrdnumbIsNull() {
            addCriterion("ORDNUMB is null");
            return (Criteria) this;
        }

        public Criteria andOrdnumbIsNotNull() {
            addCriterion("ORDNUMB is not null");
            return (Criteria) this;
        }

        public Criteria andOrdnumbEqualTo(BigDecimal value) {
            addCriterion("ORDNUMB =", value, "ordnumb");
            return (Criteria) this;
        }

        public Criteria andOrdnumbNotEqualTo(BigDecimal value) {
            addCriterion("ORDNUMB <>", value, "ordnumb");
            return (Criteria) this;
        }

        public Criteria andOrdnumbGreaterThan(BigDecimal value) {
            addCriterion("ORDNUMB >", value, "ordnumb");
            return (Criteria) this;
        }

        public Criteria andOrdnumbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDNUMB >=", value, "ordnumb");
            return (Criteria) this;
        }

        public Criteria andOrdnumbLessThan(BigDecimal value) {
            addCriterion("ORDNUMB <", value, "ordnumb");
            return (Criteria) this;
        }

        public Criteria andOrdnumbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDNUMB <=", value, "ordnumb");
            return (Criteria) this;
        }

        public Criteria andOrdnumbIn(List<BigDecimal> values) {
            addCriterion("ORDNUMB in", values, "ordnumb");
            return (Criteria) this;
        }

        public Criteria andOrdnumbNotIn(List<BigDecimal> values) {
            addCriterion("ORDNUMB not in", values, "ordnumb");
            return (Criteria) this;
        }

        public Criteria andOrdnumbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDNUMB between", value1, value2, "ordnumb");
            return (Criteria) this;
        }

        public Criteria andOrdnumbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDNUMB not between", value1, value2, "ordnumb");
            return (Criteria) this;
        }

        public Criteria andQmHashIsNull() {
            addCriterion("QM_HASH is null");
            return (Criteria) this;
        }

        public Criteria andQmHashIsNotNull() {
            addCriterion("QM_HASH is not null");
            return (Criteria) this;
        }

        public Criteria andQmHashEqualTo(String value) {
            addCriterion("QM_HASH =", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashNotEqualTo(String value) {
            addCriterion("QM_HASH <>", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashGreaterThan(String value) {
            addCriterion("QM_HASH >", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashGreaterThanOrEqualTo(String value) {
            addCriterion("QM_HASH >=", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashLessThan(String value) {
            addCriterion("QM_HASH <", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashLessThanOrEqualTo(String value) {
            addCriterion("QM_HASH <=", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashLike(String value) {
            addCriterion("QM_HASH like", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashNotLike(String value) {
            addCriterion("QM_HASH not like", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashIn(List<String> values) {
            addCriterion("QM_HASH in", values, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashNotIn(List<String> values) {
            addCriterion("QM_HASH not in", values, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashBetween(String value1, String value2) {
            addCriterion("QM_HASH between", value1, value2, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashNotBetween(String value1, String value2) {
            addCriterion("QM_HASH not between", value1, value2, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmTagIsNull() {
            addCriterion("QM_TAG is null");
            return (Criteria) this;
        }

        public Criteria andQmTagIsNotNull() {
            addCriterion("QM_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andQmTagEqualTo(String value) {
            addCriterion("QM_TAG =", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagNotEqualTo(String value) {
            addCriterion("QM_TAG <>", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagGreaterThan(String value) {
            addCriterion("QM_TAG >", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagGreaterThanOrEqualTo(String value) {
            addCriterion("QM_TAG >=", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagLessThan(String value) {
            addCriterion("QM_TAG <", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagLessThanOrEqualTo(String value) {
            addCriterion("QM_TAG <=", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagLike(String value) {
            addCriterion("QM_TAG like", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagNotLike(String value) {
            addCriterion("QM_TAG not like", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagIn(List<String> values) {
            addCriterion("QM_TAG in", values, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagNotIn(List<String> values) {
            addCriterion("QM_TAG not in", values, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagBetween(String value1, String value2) {
            addCriterion("QM_TAG between", value1, value2, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagNotBetween(String value1, String value2) {
            addCriterion("QM_TAG not between", value1, value2, "qmTag");
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