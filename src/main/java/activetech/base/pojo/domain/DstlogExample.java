package activetech.base.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class DstlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DstlogExample() {
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

        public Criteria andComnoIsNull() {
            addCriterion("COMNO is null");
            return (Criteria) this;
        }

        public Criteria andComnoIsNotNull() {
            addCriterion("COMNO is not null");
            return (Criteria) this;
        }

        public Criteria andComnoEqualTo(String value) {
            addCriterion("COMNO =", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotEqualTo(String value) {
            addCriterion("COMNO <>", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoGreaterThan(String value) {
            addCriterion("COMNO >", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoGreaterThanOrEqualTo(String value) {
            addCriterion("COMNO >=", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLessThan(String value) {
            addCriterion("COMNO <", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLessThanOrEqualTo(String value) {
            addCriterion("COMNO <=", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLike(String value) {
            addCriterion("COMNO like", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotLike(String value) {
            addCriterion("COMNO not like", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoIn(List<String> values) {
            addCriterion("COMNO in", values, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotIn(List<String> values) {
            addCriterion("COMNO not in", values, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoBetween(String value1, String value2) {
            addCriterion("COMNO between", value1, value2, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotBetween(String value1, String value2) {
            addCriterion("COMNO not between", value1, value2, "comno");
            return (Criteria) this;
        }

        public Criteria andUsrHostIsNull() {
            addCriterion("USR_HOST is null");
            return (Criteria) this;
        }

        public Criteria andUsrHostIsNotNull() {
            addCriterion("USR_HOST is not null");
            return (Criteria) this;
        }

        public Criteria andUsrHostEqualTo(String value) {
            addCriterion("USR_HOST =", value, "usrHost");
            return (Criteria) this;
        }

        public Criteria andUsrHostNotEqualTo(String value) {
            addCriterion("USR_HOST <>", value, "usrHost");
            return (Criteria) this;
        }

        public Criteria andUsrHostGreaterThan(String value) {
            addCriterion("USR_HOST >", value, "usrHost");
            return (Criteria) this;
        }

        public Criteria andUsrHostGreaterThanOrEqualTo(String value) {
            addCriterion("USR_HOST >=", value, "usrHost");
            return (Criteria) this;
        }

        public Criteria andUsrHostLessThan(String value) {
            addCriterion("USR_HOST <", value, "usrHost");
            return (Criteria) this;
        }

        public Criteria andUsrHostLessThanOrEqualTo(String value) {
            addCriterion("USR_HOST <=", value, "usrHost");
            return (Criteria) this;
        }

        public Criteria andUsrHostLike(String value) {
            addCriterion("USR_HOST like", value, "usrHost");
            return (Criteria) this;
        }

        public Criteria andUsrHostNotLike(String value) {
            addCriterion("USR_HOST not like", value, "usrHost");
            return (Criteria) this;
        }

        public Criteria andUsrHostIn(List<String> values) {
            addCriterion("USR_HOST in", values, "usrHost");
            return (Criteria) this;
        }

        public Criteria andUsrHostNotIn(List<String> values) {
            addCriterion("USR_HOST not in", values, "usrHost");
            return (Criteria) this;
        }

        public Criteria andUsrHostBetween(String value1, String value2) {
            addCriterion("USR_HOST between", value1, value2, "usrHost");
            return (Criteria) this;
        }

        public Criteria andUsrHostNotBetween(String value1, String value2) {
            addCriterion("USR_HOST not between", value1, value2, "usrHost");
            return (Criteria) this;
        }

        public Criteria andOperUrlIsNull() {
            addCriterion("OPER_URL is null");
            return (Criteria) this;
        }

        public Criteria andOperUrlIsNotNull() {
            addCriterion("OPER_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOperUrlEqualTo(String value) {
            addCriterion("OPER_URL =", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotEqualTo(String value) {
            addCriterion("OPER_URL <>", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlGreaterThan(String value) {
            addCriterion("OPER_URL >", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_URL >=", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlLessThan(String value) {
            addCriterion("OPER_URL <", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlLessThanOrEqualTo(String value) {
            addCriterion("OPER_URL <=", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlLike(String value) {
            addCriterion("OPER_URL like", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotLike(String value) {
            addCriterion("OPER_URL not like", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlIn(List<String> values) {
            addCriterion("OPER_URL in", values, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotIn(List<String> values) {
            addCriterion("OPER_URL not in", values, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlBetween(String value1, String value2) {
            addCriterion("OPER_URL between", value1, value2, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotBetween(String value1, String value2) {
            addCriterion("OPER_URL not between", value1, value2, "operUrl");
            return (Criteria) this;
        }

        public Criteria andExceptionIsNull() {
            addCriterion("EXCEPTION is null");
            return (Criteria) this;
        }

        public Criteria andExceptionIsNotNull() {
            addCriterion("EXCEPTION is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionEqualTo(String value) {
            addCriterion("EXCEPTION =", value, "exception");
            return (Criteria) this;
        }

        public Criteria andExceptionNotEqualTo(String value) {
            addCriterion("EXCEPTION <>", value, "exception");
            return (Criteria) this;
        }

        public Criteria andExceptionGreaterThan(String value) {
            addCriterion("EXCEPTION >", value, "exception");
            return (Criteria) this;
        }

        public Criteria andExceptionGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION >=", value, "exception");
            return (Criteria) this;
        }

        public Criteria andExceptionLessThan(String value) {
            addCriterion("EXCEPTION <", value, "exception");
            return (Criteria) this;
        }

        public Criteria andExceptionLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION <=", value, "exception");
            return (Criteria) this;
        }

        public Criteria andExceptionLike(String value) {
            addCriterion("EXCEPTION like", value, "exception");
            return (Criteria) this;
        }

        public Criteria andExceptionNotLike(String value) {
            addCriterion("EXCEPTION not like", value, "exception");
            return (Criteria) this;
        }

        public Criteria andExceptionIn(List<String> values) {
            addCriterion("EXCEPTION in", values, "exception");
            return (Criteria) this;
        }

        public Criteria andExceptionNotIn(List<String> values) {
            addCriterion("EXCEPTION not in", values, "exception");
            return (Criteria) this;
        }

        public Criteria andExceptionBetween(String value1, String value2) {
            addCriterion("EXCEPTION between", value1, value2, "exception");
            return (Criteria) this;
        }

        public Criteria andExceptionNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION not between", value1, value2, "exception");
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

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(String value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(String value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(String value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(String value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(String value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLike(String value) {
            addCriterion("CREATEDATE like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotLike(String value) {
            addCriterion("CREATEDATE not like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<String> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<String> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(String value1, String value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(String value1, String value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
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