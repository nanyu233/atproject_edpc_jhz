package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspJjbhzmxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJjbhzmxExample() {
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

        public Criteria andJjbglSeqIsNull() {
            addCriterion("JJBGL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqIsNotNull() {
            addCriterion("JJBGL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqEqualTo(String value) {
            addCriterion("JJBGL_SEQ =", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqNotEqualTo(String value) {
            addCriterion("JJBGL_SEQ <>", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqGreaterThan(String value) {
            addCriterion("JJBGL_SEQ >", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqGreaterThanOrEqualTo(String value) {
            addCriterion("JJBGL_SEQ >=", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqLessThan(String value) {
            addCriterion("JJBGL_SEQ <", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqLessThanOrEqualTo(String value) {
            addCriterion("JJBGL_SEQ <=", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqLike(String value) {
            addCriterion("JJBGL_SEQ like", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqNotLike(String value) {
            addCriterion("JJBGL_SEQ not like", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqIn(List<String> values) {
            addCriterion("JJBGL_SEQ in", values, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqNotIn(List<String> values) {
            addCriterion("JJBGL_SEQ not in", values, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqBetween(String value1, String value2) {
            addCriterion("JJBGL_SEQ between", value1, value2, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqNotBetween(String value1, String value2) {
            addCriterion("JJBGL_SEQ not between", value1, value2, "jjbglSeq");
            return (Criteria) this;
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

        public Criteria andEmgTypeIsNull() {
            addCriterion("EMG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEmgTypeIsNotNull() {
            addCriterion("EMG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEmgTypeEqualTo(String value) {
            addCriterion("EMG_TYPE =", value, "emgType");
            return (Criteria) this;
        }

        public Criteria andEmgTypeNotEqualTo(String value) {
            addCriterion("EMG_TYPE <>", value, "emgType");
            return (Criteria) this;
        }

        public Criteria andEmgTypeGreaterThan(String value) {
            addCriterion("EMG_TYPE >", value, "emgType");
            return (Criteria) this;
        }

        public Criteria andEmgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_TYPE >=", value, "emgType");
            return (Criteria) this;
        }

        public Criteria andEmgTypeLessThan(String value) {
            addCriterion("EMG_TYPE <", value, "emgType");
            return (Criteria) this;
        }

        public Criteria andEmgTypeLessThanOrEqualTo(String value) {
            addCriterion("EMG_TYPE <=", value, "emgType");
            return (Criteria) this;
        }

        public Criteria andEmgTypeLike(String value) {
            addCriterion("EMG_TYPE like", value, "emgType");
            return (Criteria) this;
        }

        public Criteria andEmgTypeNotLike(String value) {
            addCriterion("EMG_TYPE not like", value, "emgType");
            return (Criteria) this;
        }

        public Criteria andEmgTypeIn(List<String> values) {
            addCriterion("EMG_TYPE in", values, "emgType");
            return (Criteria) this;
        }

        public Criteria andEmgTypeNotIn(List<String> values) {
            addCriterion("EMG_TYPE not in", values, "emgType");
            return (Criteria) this;
        }

        public Criteria andEmgTypeBetween(String value1, String value2) {
            addCriterion("EMG_TYPE between", value1, value2, "emgType");
            return (Criteria) this;
        }

        public Criteria andEmgTypeNotBetween(String value1, String value2) {
            addCriterion("EMG_TYPE not between", value1, value2, "emgType");
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