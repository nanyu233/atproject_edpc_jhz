package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCscpnInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCscpnInfExample() {
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

        public Criteria andFldCodIsNull() {
            addCriterion("FLD_COD is null");
            return (Criteria) this;
        }

        public Criteria andFldCodIsNotNull() {
            addCriterion("FLD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFldCodEqualTo(String value) {
            addCriterion("FLD_COD =", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodNotEqualTo(String value) {
            addCriterion("FLD_COD <>", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodGreaterThan(String value) {
            addCriterion("FLD_COD >", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_COD >=", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodLessThan(String value) {
            addCriterion("FLD_COD <", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodLessThanOrEqualTo(String value) {
            addCriterion("FLD_COD <=", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodLike(String value) {
            addCriterion("FLD_COD like", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodNotLike(String value) {
            addCriterion("FLD_COD not like", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodIn(List<String> values) {
            addCriterion("FLD_COD in", values, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodNotIn(List<String> values) {
            addCriterion("FLD_COD not in", values, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodBetween(String value1, String value2) {
            addCriterion("FLD_COD between", value1, value2, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodNotBetween(String value1, String value2) {
            addCriterion("FLD_COD not between", value1, value2, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldValIsNull() {
            addCriterion("FLD_VAL is null");
            return (Criteria) this;
        }

        public Criteria andFldValIsNotNull() {
            addCriterion("FLD_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andFldValEqualTo(String value) {
            addCriterion("FLD_VAL =", value, "fldVal");
            return (Criteria) this;
        }

        public Criteria andFldValNotEqualTo(String value) {
            addCriterion("FLD_VAL <>", value, "fldVal");
            return (Criteria) this;
        }

        public Criteria andFldValGreaterThan(String value) {
            addCriterion("FLD_VAL >", value, "fldVal");
            return (Criteria) this;
        }

        public Criteria andFldValGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_VAL >=", value, "fldVal");
            return (Criteria) this;
        }

        public Criteria andFldValLessThan(String value) {
            addCriterion("FLD_VAL <", value, "fldVal");
            return (Criteria) this;
        }

        public Criteria andFldValLessThanOrEqualTo(String value) {
            addCriterion("FLD_VAL <=", value, "fldVal");
            return (Criteria) this;
        }

        public Criteria andFldValLike(String value) {
            addCriterion("FLD_VAL like", value, "fldVal");
            return (Criteria) this;
        }

        public Criteria andFldValNotLike(String value) {
            addCriterion("FLD_VAL not like", value, "fldVal");
            return (Criteria) this;
        }

        public Criteria andFldValIn(List<String> values) {
            addCriterion("FLD_VAL in", values, "fldVal");
            return (Criteria) this;
        }

        public Criteria andFldValNotIn(List<String> values) {
            addCriterion("FLD_VAL not in", values, "fldVal");
            return (Criteria) this;
        }

        public Criteria andFldValBetween(String value1, String value2) {
            addCriterion("FLD_VAL between", value1, value2, "fldVal");
            return (Criteria) this;
        }

        public Criteria andFldValNotBetween(String value1, String value2) {
            addCriterion("FLD_VAL not between", value1, value2, "fldVal");
            return (Criteria) this;
        }

        public Criteria andUsrNoIsNull() {
            addCriterion("USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andUsrNoIsNotNull() {
            addCriterion("USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNoEqualTo(String value) {
            addCriterion("USR_NO =", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotEqualTo(String value) {
            addCriterion("USR_NO <>", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoGreaterThan(String value) {
            addCriterion("USR_NO >", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NO >=", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoLessThan(String value) {
            addCriterion("USR_NO <", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoLessThanOrEqualTo(String value) {
            addCriterion("USR_NO <=", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoLike(String value) {
            addCriterion("USR_NO like", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotLike(String value) {
            addCriterion("USR_NO not like", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoIn(List<String> values) {
            addCriterion("USR_NO in", values, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotIn(List<String> values) {
            addCriterion("USR_NO not in", values, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoBetween(String value1, String value2) {
            addCriterion("USR_NO between", value1, value2, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotBetween(String value1, String value2) {
            addCriterion("USR_NO not between", value1, value2, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNmeIsNull() {
            addCriterion("USR_NME is null");
            return (Criteria) this;
        }

        public Criteria andUsrNmeIsNotNull() {
            addCriterion("USR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNmeEqualTo(String value) {
            addCriterion("USR_NME =", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeNotEqualTo(String value) {
            addCriterion("USR_NME <>", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeGreaterThan(String value) {
            addCriterion("USR_NME >", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NME >=", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeLessThan(String value) {
            addCriterion("USR_NME <", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeLessThanOrEqualTo(String value) {
            addCriterion("USR_NME <=", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeLike(String value) {
            addCriterion("USR_NME like", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeNotLike(String value) {
            addCriterion("USR_NME not like", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeIn(List<String> values) {
            addCriterion("USR_NME in", values, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeNotIn(List<String> values) {
            addCriterion("USR_NME not in", values, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeBetween(String value1, String value2) {
            addCriterion("USR_NME between", value1, value2, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeNotBetween(String value1, String value2) {
            addCriterion("USR_NME not between", value1, value2, "usrNme");
            return (Criteria) this;
        }

        public Criteria andCrtTimIsNull() {
            addCriterion("CRT_TIM is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimIsNotNull() {
            addCriterion("CRT_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimEqualTo(Date value) {
            addCriterion("CRT_TIM =", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotEqualTo(Date value) {
            addCriterion("CRT_TIM <>", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimGreaterThan(Date value) {
            addCriterion("CRT_TIM >", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIM >=", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimLessThan(Date value) {
            addCriterion("CRT_TIM <", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIM <=", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimIn(List<Date> values) {
            addCriterion("CRT_TIM in", values, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotIn(List<Date> values) {
            addCriterion("CRT_TIM not in", values, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimBetween(Date value1, Date value2) {
            addCriterion("CRT_TIM between", value1, value2, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIM not between", value1, value2, "crtTim");
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