package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspScoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspScoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andScoNameIsNull() {
            addCriterion("SCO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andScoNameIsNotNull() {
            addCriterion("SCO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andScoNameEqualTo(String value) {
            addCriterion("SCO_NAME =", value, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoNameNotEqualTo(String value) {
            addCriterion("SCO_NAME <>", value, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoNameGreaterThan(String value) {
            addCriterion("SCO_NAME >", value, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCO_NAME >=", value, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoNameLessThan(String value) {
            addCriterion("SCO_NAME <", value, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoNameLessThanOrEqualTo(String value) {
            addCriterion("SCO_NAME <=", value, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoNameLike(String value) {
            addCriterion("SCO_NAME like", value, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoNameNotLike(String value) {
            addCriterion("SCO_NAME not like", value, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoNameIn(List<String> values) {
            addCriterion("SCO_NAME in", values, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoNameNotIn(List<String> values) {
            addCriterion("SCO_NAME not in", values, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoNameBetween(String value1, String value2) {
            addCriterion("SCO_NAME between", value1, value2, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoNameNotBetween(String value1, String value2) {
            addCriterion("SCO_NAME not between", value1, value2, "scoName");
            return (Criteria) this;
        }

        public Criteria andScoPysmIsNull() {
            addCriterion("SCO_PYSM is null");
            return (Criteria) this;
        }

        public Criteria andScoPysmIsNotNull() {
            addCriterion("SCO_PYSM is not null");
            return (Criteria) this;
        }

        public Criteria andScoPysmEqualTo(String value) {
            addCriterion("SCO_PYSM =", value, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andScoPysmNotEqualTo(String value) {
            addCriterion("SCO_PYSM <>", value, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andScoPysmGreaterThan(String value) {
            addCriterion("SCO_PYSM >", value, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andScoPysmGreaterThanOrEqualTo(String value) {
            addCriterion("SCO_PYSM >=", value, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andScoPysmLessThan(String value) {
            addCriterion("SCO_PYSM <", value, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andScoPysmLessThanOrEqualTo(String value) {
            addCriterion("SCO_PYSM <=", value, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andScoPysmLike(String value) {
            addCriterion("SCO_PYSM like", value, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andScoPysmNotLike(String value) {
            addCriterion("SCO_PYSM not like", value, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andScoPysmIn(List<String> values) {
            addCriterion("SCO_PYSM in", values, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andScoPysmNotIn(List<String> values) {
            addCriterion("SCO_PYSM not in", values, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andScoPysmBetween(String value1, String value2) {
            addCriterion("SCO_PYSM between", value1, value2, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andScoPysmNotBetween(String value1, String value2) {
            addCriterion("SCO_PYSM not between", value1, value2, "scoPysm");
            return (Criteria) this;
        }

        public Criteria andIsTjIsNull() {
            addCriterion("IS_TJ is null");
            return (Criteria) this;
        }

        public Criteria andIsTjIsNotNull() {
            addCriterion("IS_TJ is not null");
            return (Criteria) this;
        }

        public Criteria andIsTjEqualTo(String value) {
            addCriterion("IS_TJ =", value, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsTjNotEqualTo(String value) {
            addCriterion("IS_TJ <>", value, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsTjGreaterThan(String value) {
            addCriterion("IS_TJ >", value, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsTjGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TJ >=", value, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsTjLessThan(String value) {
            addCriterion("IS_TJ <", value, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsTjLessThanOrEqualTo(String value) {
            addCriterion("IS_TJ <=", value, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsTjLike(String value) {
            addCriterion("IS_TJ like", value, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsTjNotLike(String value) {
            addCriterion("IS_TJ not like", value, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsTjIn(List<String> values) {
            addCriterion("IS_TJ in", values, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsTjNotIn(List<String> values) {
            addCriterion("IS_TJ not in", values, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsTjBetween(String value1, String value2) {
            addCriterion("IS_TJ between", value1, value2, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsTjNotBetween(String value1, String value2) {
            addCriterion("IS_TJ not between", value1, value2, "isTj");
            return (Criteria) this;
        }

        public Criteria andIsYxIsNull() {
            addCriterion("IS_YX is null");
            return (Criteria) this;
        }

        public Criteria andIsYxIsNotNull() {
            addCriterion("IS_YX is not null");
            return (Criteria) this;
        }

        public Criteria andIsYxEqualTo(String value) {
            addCriterion("IS_YX =", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxNotEqualTo(String value) {
            addCriterion("IS_YX <>", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxGreaterThan(String value) {
            addCriterion("IS_YX >", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxGreaterThanOrEqualTo(String value) {
            addCriterion("IS_YX >=", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxLessThan(String value) {
            addCriterion("IS_YX <", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxLessThanOrEqualTo(String value) {
            addCriterion("IS_YX <=", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxLike(String value) {
            addCriterion("IS_YX like", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxNotLike(String value) {
            addCriterion("IS_YX not like", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxIn(List<String> values) {
            addCriterion("IS_YX in", values, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxNotIn(List<String> values) {
            addCriterion("IS_YX not in", values, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxBetween(String value1, String value2) {
            addCriterion("IS_YX between", value1, value2, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxNotBetween(String value1, String value2) {
            addCriterion("IS_YX not between", value1, value2, "isYx");
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