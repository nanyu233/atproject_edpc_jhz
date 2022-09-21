package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspXlshpgInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspXlshpgInfExample() {
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

        public Criteria andXtpgSeqIsNull() {
            addCriterion("XTPG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIsNotNull() {
            addCriterion("XTPG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqEqualTo(String value) {
            addCriterion("XTPG_SEQ =", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotEqualTo(String value) {
            addCriterion("XTPG_SEQ <>", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThan(String value) {
            addCriterion("XTPG_SEQ >", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ >=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThan(String value) {
            addCriterion("XTPG_SEQ <", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ <=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLike(String value) {
            addCriterion("XTPG_SEQ like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotLike(String value) {
            addCriterion("XTPG_SEQ not like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIn(List<String> values) {
            addCriterion("XTPG_SEQ in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotIn(List<String> values) {
            addCriterion("XTPG_SEQ not in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ between", value1, value2, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ not between", value1, value2, "xtpgSeq");
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

        public Criteria andXlshpgJsztCodIsNull() {
            addCriterion("XLSHPG_JSZT_COD is null");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodIsNotNull() {
            addCriterion("XLSHPG_JSZT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodEqualTo(String value) {
            addCriterion("XLSHPG_JSZT_COD =", value, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodNotEqualTo(String value) {
            addCriterion("XLSHPG_JSZT_COD <>", value, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodGreaterThan(String value) {
            addCriterion("XLSHPG_JSZT_COD >", value, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodGreaterThanOrEqualTo(String value) {
            addCriterion("XLSHPG_JSZT_COD >=", value, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodLessThan(String value) {
            addCriterion("XLSHPG_JSZT_COD <", value, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodLessThanOrEqualTo(String value) {
            addCriterion("XLSHPG_JSZT_COD <=", value, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodLike(String value) {
            addCriterion("XLSHPG_JSZT_COD like", value, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodNotLike(String value) {
            addCriterion("XLSHPG_JSZT_COD not like", value, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodIn(List<String> values) {
            addCriterion("XLSHPG_JSZT_COD in", values, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodNotIn(List<String> values) {
            addCriterion("XLSHPG_JSZT_COD not in", values, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodBetween(String value1, String value2) {
            addCriterion("XLSHPG_JSZT_COD between", value1, value2, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztCodNotBetween(String value1, String value2) {
            addCriterion("XLSHPG_JSZT_COD not between", value1, value2, "xlshpgJsztCod");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtIsNull() {
            addCriterion("XLSHPG_JSZT_QT is null");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtIsNotNull() {
            addCriterion("XLSHPG_JSZT_QT is not null");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtEqualTo(String value) {
            addCriterion("XLSHPG_JSZT_QT =", value, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtNotEqualTo(String value) {
            addCriterion("XLSHPG_JSZT_QT <>", value, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtGreaterThan(String value) {
            addCriterion("XLSHPG_JSZT_QT >", value, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtGreaterThanOrEqualTo(String value) {
            addCriterion("XLSHPG_JSZT_QT >=", value, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtLessThan(String value) {
            addCriterion("XLSHPG_JSZT_QT <", value, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtLessThanOrEqualTo(String value) {
            addCriterion("XLSHPG_JSZT_QT <=", value, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtLike(String value) {
            addCriterion("XLSHPG_JSZT_QT like", value, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtNotLike(String value) {
            addCriterion("XLSHPG_JSZT_QT not like", value, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtIn(List<String> values) {
            addCriterion("XLSHPG_JSZT_QT in", values, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtNotIn(List<String> values) {
            addCriterion("XLSHPG_JSZT_QT not in", values, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtBetween(String value1, String value2) {
            addCriterion("XLSHPG_JSZT_QT between", value1, value2, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgJsztQtNotBetween(String value1, String value2) {
            addCriterion("XLSHPG_JSZT_QT not between", value1, value2, "xlshpgJsztQt");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoIsNull() {
            addCriterion("XLSHPG_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoIsNotNull() {
            addCriterion("XLSHPG_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoEqualTo(String value) {
            addCriterion("XLSHPG_MEMO =", value, "xlshpgMemo");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoNotEqualTo(String value) {
            addCriterion("XLSHPG_MEMO <>", value, "xlshpgMemo");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoGreaterThan(String value) {
            addCriterion("XLSHPG_MEMO >", value, "xlshpgMemo");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoGreaterThanOrEqualTo(String value) {
            addCriterion("XLSHPG_MEMO >=", value, "xlshpgMemo");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoLessThan(String value) {
            addCriterion("XLSHPG_MEMO <", value, "xlshpgMemo");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoLessThanOrEqualTo(String value) {
            addCriterion("XLSHPG_MEMO <=", value, "xlshpgMemo");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoLike(String value) {
            addCriterion("XLSHPG_MEMO like", value, "xlshpgMemo");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoNotLike(String value) {
            addCriterion("XLSHPG_MEMO not like", value, "xlshpgMemo");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoIn(List<String> values) {
            addCriterion("XLSHPG_MEMO in", values, "xlshpgMemo");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoNotIn(List<String> values) {
            addCriterion("XLSHPG_MEMO not in", values, "xlshpgMemo");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoBetween(String value1, String value2) {
            addCriterion("XLSHPG_MEMO between", value1, value2, "xlshpgMemo");
            return (Criteria) this;
        }

        public Criteria andXlshpgMemoNotBetween(String value1, String value2) {
            addCriterion("XLSHPG_MEMO not between", value1, value2, "xlshpgMemo");
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