package activetech.base.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspYsczlsjlInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspYsczlsjlInfExample() {
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

        public Criteria andLsSeqIsNull() {
            addCriterion("LS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andLsSeqIsNotNull() {
            addCriterion("LS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andLsSeqEqualTo(String value) {
            addCriterion("LS_SEQ =", value, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andLsSeqNotEqualTo(String value) {
            addCriterion("LS_SEQ <>", value, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andLsSeqGreaterThan(String value) {
            addCriterion("LS_SEQ >", value, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andLsSeqGreaterThanOrEqualTo(String value) {
            addCriterion("LS_SEQ >=", value, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andLsSeqLessThan(String value) {
            addCriterion("LS_SEQ <", value, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andLsSeqLessThanOrEqualTo(String value) {
            addCriterion("LS_SEQ <=", value, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andLsSeqLike(String value) {
            addCriterion("LS_SEQ like", value, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andLsSeqNotLike(String value) {
            addCriterion("LS_SEQ not like", value, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andLsSeqIn(List<String> values) {
            addCriterion("LS_SEQ in", values, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andLsSeqNotIn(List<String> values) {
            addCriterion("LS_SEQ not in", values, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andLsSeqBetween(String value1, String value2) {
            addCriterion("LS_SEQ between", value1, value2, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andLsSeqNotBetween(String value1, String value2) {
            addCriterion("LS_SEQ not between", value1, value2, "lsSeq");
            return (Criteria) this;
        }

        public Criteria andUsrnoIsNull() {
            addCriterion("USRNO is null");
            return (Criteria) this;
        }

        public Criteria andUsrnoIsNotNull() {
            addCriterion("USRNO is not null");
            return (Criteria) this;
        }

        public Criteria andUsrnoEqualTo(String value) {
            addCriterion("USRNO =", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoNotEqualTo(String value) {
            addCriterion("USRNO <>", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoGreaterThan(String value) {
            addCriterion("USRNO >", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoGreaterThanOrEqualTo(String value) {
            addCriterion("USRNO >=", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoLessThan(String value) {
            addCriterion("USRNO <", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoLessThanOrEqualTo(String value) {
            addCriterion("USRNO <=", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoLike(String value) {
            addCriterion("USRNO like", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoNotLike(String value) {
            addCriterion("USRNO not like", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoIn(List<String> values) {
            addCriterion("USRNO in", values, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoNotIn(List<String> values) {
            addCriterion("USRNO not in", values, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoBetween(String value1, String value2) {
            addCriterion("USRNO between", value1, value2, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoNotBetween(String value1, String value2) {
            addCriterion("USRNO not between", value1, value2, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnameIsNull() {
            addCriterion("USRNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsrnameIsNotNull() {
            addCriterion("USRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrnameEqualTo(String value) {
            addCriterion("USRNAME =", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotEqualTo(String value) {
            addCriterion("USRNAME <>", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameGreaterThan(String value) {
            addCriterion("USRNAME >", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameGreaterThanOrEqualTo(String value) {
            addCriterion("USRNAME >=", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameLessThan(String value) {
            addCriterion("USRNAME <", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameLessThanOrEqualTo(String value) {
            addCriterion("USRNAME <=", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameLike(String value) {
            addCriterion("USRNAME like", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotLike(String value) {
            addCriterion("USRNAME not like", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameIn(List<String> values) {
            addCriterion("USRNAME in", values, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotIn(List<String> values) {
            addCriterion("USRNAME not in", values, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameBetween(String value1, String value2) {
            addCriterion("USRNAME between", value1, value2, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotBetween(String value1, String value2) {
            addCriterion("USRNAME not between", value1, value2, "usrname");
            return (Criteria) this;
        }

        public Criteria andOutCallIsNull() {
            addCriterion("OUT_CALL is null");
            return (Criteria) this;
        }

        public Criteria andOutCallIsNotNull() {
            addCriterion("OUT_CALL is not null");
            return (Criteria) this;
        }

        public Criteria andOutCallEqualTo(String value) {
            addCriterion("OUT_CALL =", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallNotEqualTo(String value) {
            addCriterion("OUT_CALL <>", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallGreaterThan(String value) {
            addCriterion("OUT_CALL >", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_CALL >=", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallLessThan(String value) {
            addCriterion("OUT_CALL <", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallLessThanOrEqualTo(String value) {
            addCriterion("OUT_CALL <=", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallLike(String value) {
            addCriterion("OUT_CALL like", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallNotLike(String value) {
            addCriterion("OUT_CALL not like", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallIn(List<String> values) {
            addCriterion("OUT_CALL in", values, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallNotIn(List<String> values) {
            addCriterion("OUT_CALL not in", values, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallBetween(String value1, String value2) {
            addCriterion("OUT_CALL between", value1, value2, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallNotBetween(String value1, String value2) {
            addCriterion("OUT_CALL not between", value1, value2, "outCall");
            return (Criteria) this;
        }

        public Criteria andEmgsysidIsNull() {
            addCriterion("EMGSYSID is null");
            return (Criteria) this;
        }

        public Criteria andEmgsysidIsNotNull() {
            addCriterion("EMGSYSID is not null");
            return (Criteria) this;
        }

        public Criteria andEmgsysidEqualTo(String value) {
            addCriterion("EMGSYSID =", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidNotEqualTo(String value) {
            addCriterion("EMGSYSID <>", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidGreaterThan(String value) {
            addCriterion("EMGSYSID >", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidGreaterThanOrEqualTo(String value) {
            addCriterion("EMGSYSID >=", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidLessThan(String value) {
            addCriterion("EMGSYSID <", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidLessThanOrEqualTo(String value) {
            addCriterion("EMGSYSID <=", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidLike(String value) {
            addCriterion("EMGSYSID like", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidNotLike(String value) {
            addCriterion("EMGSYSID not like", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidIn(List<String> values) {
            addCriterion("EMGSYSID in", values, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidNotIn(List<String> values) {
            addCriterion("EMGSYSID not in", values, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidBetween(String value1, String value2) {
            addCriterion("EMGSYSID between", value1, value2, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidNotBetween(String value1, String value2) {
            addCriterion("EMGSYSID not between", value1, value2, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andOperateNoIsNull() {
            addCriterion("OPERATE_NO is null");
            return (Criteria) this;
        }

        public Criteria andOperateNoIsNotNull() {
            addCriterion("OPERATE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOperateNoEqualTo(String value) {
            addCriterion("OPERATE_NO =", value, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNoNotEqualTo(String value) {
            addCriterion("OPERATE_NO <>", value, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNoGreaterThan(String value) {
            addCriterion("OPERATE_NO >", value, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNoGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_NO >=", value, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNoLessThan(String value) {
            addCriterion("OPERATE_NO <", value, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNoLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_NO <=", value, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNoLike(String value) {
            addCriterion("OPERATE_NO like", value, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNoNotLike(String value) {
            addCriterion("OPERATE_NO not like", value, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNoIn(List<String> values) {
            addCriterion("OPERATE_NO in", values, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNoNotIn(List<String> values) {
            addCriterion("OPERATE_NO not in", values, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNoBetween(String value1, String value2) {
            addCriterion("OPERATE_NO between", value1, value2, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNoNotBetween(String value1, String value2) {
            addCriterion("OPERATE_NO not between", value1, value2, "operateNo");
            return (Criteria) this;
        }

        public Criteria andOperateNameIsNull() {
            addCriterion("OPERATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperateNameIsNotNull() {
            addCriterion("OPERATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperateNameEqualTo(String value) {
            addCriterion("OPERATE_NAME =", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotEqualTo(String value) {
            addCriterion("OPERATE_NAME <>", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameGreaterThan(String value) {
            addCriterion("OPERATE_NAME >", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_NAME >=", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameLessThan(String value) {
            addCriterion("OPERATE_NAME <", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_NAME <=", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameLike(String value) {
            addCriterion("OPERATE_NAME like", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotLike(String value) {
            addCriterion("OPERATE_NAME not like", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameIn(List<String> values) {
            addCriterion("OPERATE_NAME in", values, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotIn(List<String> values) {
            addCriterion("OPERATE_NAME not in", values, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameBetween(String value1, String value2) {
            addCriterion("OPERATE_NAME between", value1, value2, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotBetween(String value1, String value2) {
            addCriterion("OPERATE_NAME not between", value1, value2, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateDateIsNull() {
            addCriterion("OPERATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOperateDateIsNotNull() {
            addCriterion("OPERATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOperateDateEqualTo(Date value) {
            addCriterion("OPERATE_DATE =", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotEqualTo(Date value) {
            addCriterion("OPERATE_DATE <>", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThan(Date value) {
            addCriterion("OPERATE_DATE >", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATE_DATE >=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThan(Date value) {
            addCriterion("OPERATE_DATE <", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThanOrEqualTo(Date value) {
            addCriterion("OPERATE_DATE <=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateIn(List<Date> values) {
            addCriterion("OPERATE_DATE in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotIn(List<Date> values) {
            addCriterion("OPERATE_DATE not in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateBetween(Date value1, Date value2) {
            addCriterion("OPERATE_DATE between", value1, value2, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotBetween(Date value1, Date value2) {
            addCriterion("OPERATE_DATE not between", value1, value2, "operateDate");
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