package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspFallassInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspFallassInfExample() {
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

        public Criteria andFallassSeqIsNull() {
            addCriterion("FALLASS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFallassSeqIsNotNull() {
            addCriterion("FALLASS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFallassSeqEqualTo(String value) {
            addCriterion("FALLASS_SEQ =", value, "fallassSeq");
            return (Criteria) this;
        }

        public Criteria andFallassSeqNotEqualTo(String value) {
            addCriterion("FALLASS_SEQ <>", value, "fallassSeq");
            return (Criteria) this;
        }

        public Criteria andFallassSeqGreaterThan(String value) {
            addCriterion("FALLASS_SEQ >", value, "fallassSeq");
            return (Criteria) this;
        }

        public Criteria andFallassSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FALLASS_SEQ >=", value, "fallassSeq");
            return (Criteria) this;
        }

        public Criteria andFallassSeqLessThan(String value) {
            addCriterion("FALLASS_SEQ <", value, "fallassSeq");
            return (Criteria) this;
        }

        public Criteria andFallassSeqLessThanOrEqualTo(String value) {
            addCriterion("FALLASS_SEQ <=", value, "fallassSeq");
            return (Criteria) this;
        }

        public Criteria andFallassSeqLike(String value) {
            addCriterion("FALLASS_SEQ like", value, "fallassSeq");
            return (Criteria) this;
        }

        public Criteria andFallassSeqNotLike(String value) {
            addCriterion("FALLASS_SEQ not like", value, "fallassSeq");
            return (Criteria) this;
        }

        public Criteria andFallassSeqIn(List<String> values) {
            addCriterion("FALLASS_SEQ in", values, "fallassSeq");
            return (Criteria) this;
        }

        public Criteria andFallassSeqNotIn(List<String> values) {
            addCriterion("FALLASS_SEQ not in", values, "fallassSeq");
            return (Criteria) this;
        }

        public Criteria andFallassSeqBetween(String value1, String value2) {
            addCriterion("FALLASS_SEQ between", value1, value2, "fallassSeq");
            return (Criteria) this;
        }

        public Criteria andFallassSeqNotBetween(String value1, String value2) {
            addCriterion("FALLASS_SEQ not between", value1, value2, "fallassSeq");
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

        public Criteria andFallAssCodIsNull() {
            addCriterion("FALL_ASS_COD is null");
            return (Criteria) this;
        }

        public Criteria andFallAssCodIsNotNull() {
            addCriterion("FALL_ASS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFallAssCodEqualTo(String value) {
            addCriterion("FALL_ASS_COD =", value, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssCodNotEqualTo(String value) {
            addCriterion("FALL_ASS_COD <>", value, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssCodGreaterThan(String value) {
            addCriterion("FALL_ASS_COD >", value, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssCodGreaterThanOrEqualTo(String value) {
            addCriterion("FALL_ASS_COD >=", value, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssCodLessThan(String value) {
            addCriterion("FALL_ASS_COD <", value, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssCodLessThanOrEqualTo(String value) {
            addCriterion("FALL_ASS_COD <=", value, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssCodLike(String value) {
            addCriterion("FALL_ASS_COD like", value, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssCodNotLike(String value) {
            addCriterion("FALL_ASS_COD not like", value, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssCodIn(List<String> values) {
            addCriterion("FALL_ASS_COD in", values, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssCodNotIn(List<String> values) {
            addCriterion("FALL_ASS_COD not in", values, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssCodBetween(String value1, String value2) {
            addCriterion("FALL_ASS_COD between", value1, value2, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssCodNotBetween(String value1, String value2) {
            addCriterion("FALL_ASS_COD not between", value1, value2, "fallAssCod");
            return (Criteria) this;
        }

        public Criteria andFallAssessIsNull() {
            addCriterion("FALL_ASSESS is null");
            return (Criteria) this;
        }

        public Criteria andFallAssessIsNotNull() {
            addCriterion("FALL_ASSESS is not null");
            return (Criteria) this;
        }

        public Criteria andFallAssessEqualTo(String value) {
            addCriterion("FALL_ASSESS =", value, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallAssessNotEqualTo(String value) {
            addCriterion("FALL_ASSESS <>", value, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallAssessGreaterThan(String value) {
            addCriterion("FALL_ASSESS >", value, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallAssessGreaterThanOrEqualTo(String value) {
            addCriterion("FALL_ASSESS >=", value, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallAssessLessThan(String value) {
            addCriterion("FALL_ASSESS <", value, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallAssessLessThanOrEqualTo(String value) {
            addCriterion("FALL_ASSESS <=", value, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallAssessLike(String value) {
            addCriterion("FALL_ASSESS like", value, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallAssessNotLike(String value) {
            addCriterion("FALL_ASSESS not like", value, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallAssessIn(List<String> values) {
            addCriterion("FALL_ASSESS in", values, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallAssessNotIn(List<String> values) {
            addCriterion("FALL_ASSESS not in", values, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallAssessBetween(String value1, String value2) {
            addCriterion("FALL_ASSESS between", value1, value2, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallAssessNotBetween(String value1, String value2) {
            addCriterion("FALL_ASSESS not between", value1, value2, "fallAssess");
            return (Criteria) this;
        }

        public Criteria andFallMemoIsNull() {
            addCriterion("FALL_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andFallMemoIsNotNull() {
            addCriterion("FALL_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andFallMemoEqualTo(String value) {
            addCriterion("FALL_MEMO =", value, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallMemoNotEqualTo(String value) {
            addCriterion("FALL_MEMO <>", value, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallMemoGreaterThan(String value) {
            addCriterion("FALL_MEMO >", value, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallMemoGreaterThanOrEqualTo(String value) {
            addCriterion("FALL_MEMO >=", value, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallMemoLessThan(String value) {
            addCriterion("FALL_MEMO <", value, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallMemoLessThanOrEqualTo(String value) {
            addCriterion("FALL_MEMO <=", value, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallMemoLike(String value) {
            addCriterion("FALL_MEMO like", value, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallMemoNotLike(String value) {
            addCriterion("FALL_MEMO not like", value, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallMemoIn(List<String> values) {
            addCriterion("FALL_MEMO in", values, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallMemoNotIn(List<String> values) {
            addCriterion("FALL_MEMO not in", values, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallMemoBetween(String value1, String value2) {
            addCriterion("FALL_MEMO between", value1, value2, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallMemoNotBetween(String value1, String value2) {
            addCriterion("FALL_MEMO not between", value1, value2, "fallMemo");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoIsNull() {
            addCriterion("FALL_USRNO is null");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoIsNotNull() {
            addCriterion("FALL_USRNO is not null");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoEqualTo(String value) {
            addCriterion("FALL_USRNO =", value, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoNotEqualTo(String value) {
            addCriterion("FALL_USRNO <>", value, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoGreaterThan(String value) {
            addCriterion("FALL_USRNO >", value, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoGreaterThanOrEqualTo(String value) {
            addCriterion("FALL_USRNO >=", value, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoLessThan(String value) {
            addCriterion("FALL_USRNO <", value, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoLessThanOrEqualTo(String value) {
            addCriterion("FALL_USRNO <=", value, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoLike(String value) {
            addCriterion("FALL_USRNO like", value, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoNotLike(String value) {
            addCriterion("FALL_USRNO not like", value, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoIn(List<String> values) {
            addCriterion("FALL_USRNO in", values, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoNotIn(List<String> values) {
            addCriterion("FALL_USRNO not in", values, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoBetween(String value1, String value2) {
            addCriterion("FALL_USRNO between", value1, value2, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnoNotBetween(String value1, String value2) {
            addCriterion("FALL_USRNO not between", value1, value2, "fallUsrno");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamIsNull() {
            addCriterion("FALL_USRNAM is null");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamIsNotNull() {
            addCriterion("FALL_USRNAM is not null");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamEqualTo(String value) {
            addCriterion("FALL_USRNAM =", value, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamNotEqualTo(String value) {
            addCriterion("FALL_USRNAM <>", value, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamGreaterThan(String value) {
            addCriterion("FALL_USRNAM >", value, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamGreaterThanOrEqualTo(String value) {
            addCriterion("FALL_USRNAM >=", value, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamLessThan(String value) {
            addCriterion("FALL_USRNAM <", value, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamLessThanOrEqualTo(String value) {
            addCriterion("FALL_USRNAM <=", value, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamLike(String value) {
            addCriterion("FALL_USRNAM like", value, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamNotLike(String value) {
            addCriterion("FALL_USRNAM not like", value, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamIn(List<String> values) {
            addCriterion("FALL_USRNAM in", values, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamNotIn(List<String> values) {
            addCriterion("FALL_USRNAM not in", values, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamBetween(String value1, String value2) {
            addCriterion("FALL_USRNAM between", value1, value2, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallUsrnamNotBetween(String value1, String value2) {
            addCriterion("FALL_USRNAM not between", value1, value2, "fallUsrnam");
            return (Criteria) this;
        }

        public Criteria andFallDateIsNull() {
            addCriterion("FALL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFallDateIsNotNull() {
            addCriterion("FALL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFallDateEqualTo(Date value) {
            addCriterion("FALL_DATE =", value, "fallDate");
            return (Criteria) this;
        }

        public Criteria andFallDateNotEqualTo(Date value) {
            addCriterion("FALL_DATE <>", value, "fallDate");
            return (Criteria) this;
        }

        public Criteria andFallDateGreaterThan(Date value) {
            addCriterion("FALL_DATE >", value, "fallDate");
            return (Criteria) this;
        }

        public Criteria andFallDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FALL_DATE >=", value, "fallDate");
            return (Criteria) this;
        }

        public Criteria andFallDateLessThan(Date value) {
            addCriterion("FALL_DATE <", value, "fallDate");
            return (Criteria) this;
        }

        public Criteria andFallDateLessThanOrEqualTo(Date value) {
            addCriterion("FALL_DATE <=", value, "fallDate");
            return (Criteria) this;
        }

        public Criteria andFallDateIn(List<Date> values) {
            addCriterion("FALL_DATE in", values, "fallDate");
            return (Criteria) this;
        }

        public Criteria andFallDateNotIn(List<Date> values) {
            addCriterion("FALL_DATE not in", values, "fallDate");
            return (Criteria) this;
        }

        public Criteria andFallDateBetween(Date value1, Date value2) {
            addCriterion("FALL_DATE between", value1, value2, "fallDate");
            return (Criteria) this;
        }

        public Criteria andFallDateNotBetween(Date value1, Date value2) {
            addCriterion("FALL_DATE not between", value1, value2, "fallDate");
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