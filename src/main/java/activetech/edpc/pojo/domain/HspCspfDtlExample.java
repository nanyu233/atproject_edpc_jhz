package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HspCspfDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCspfDtlExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andPrtItemIsNull() {
            addCriterion("PRT_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andPrtItemIsNotNull() {
            addCriterion("PRT_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andPrtItemEqualTo(String value) {
            addCriterion("PRT_ITEM =", value, "prtItem");
            return (Criteria) this;
        }

        public Criteria andPrtItemNotEqualTo(String value) {
            addCriterion("PRT_ITEM <>", value, "prtItem");
            return (Criteria) this;
        }

        public Criteria andPrtItemGreaterThan(String value) {
            addCriterion("PRT_ITEM >", value, "prtItem");
            return (Criteria) this;
        }

        public Criteria andPrtItemGreaterThanOrEqualTo(String value) {
            addCriterion("PRT_ITEM >=", value, "prtItem");
            return (Criteria) this;
        }

        public Criteria andPrtItemLessThan(String value) {
            addCriterion("PRT_ITEM <", value, "prtItem");
            return (Criteria) this;
        }

        public Criteria andPrtItemLessThanOrEqualTo(String value) {
            addCriterion("PRT_ITEM <=", value, "prtItem");
            return (Criteria) this;
        }

        public Criteria andPrtItemLike(String value) {
            addCriterion("PRT_ITEM like", value, "prtItem");
            return (Criteria) this;
        }

        public Criteria andPrtItemNotLike(String value) {
            addCriterion("PRT_ITEM not like", value, "prtItem");
            return (Criteria) this;
        }

        public Criteria andPrtItemIn(List<String> values) {
            addCriterion("PRT_ITEM in", values, "prtItem");
            return (Criteria) this;
        }

        public Criteria andPrtItemNotIn(List<String> values) {
            addCriterion("PRT_ITEM not in", values, "prtItem");
            return (Criteria) this;
        }

        public Criteria andPrtItemBetween(String value1, String value2) {
            addCriterion("PRT_ITEM between", value1, value2, "prtItem");
            return (Criteria) this;
        }

        public Criteria andPrtItemNotBetween(String value1, String value2) {
            addCriterion("PRT_ITEM not between", value1, value2, "prtItem");
            return (Criteria) this;
        }

        public Criteria andSubItemIsNull() {
            addCriterion("SUB_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andSubItemIsNotNull() {
            addCriterion("SUB_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andSubItemEqualTo(String value) {
            addCriterion("SUB_ITEM =", value, "subItem");
            return (Criteria) this;
        }

        public Criteria andSubItemNotEqualTo(String value) {
            addCriterion("SUB_ITEM <>", value, "subItem");
            return (Criteria) this;
        }

        public Criteria andSubItemGreaterThan(String value) {
            addCriterion("SUB_ITEM >", value, "subItem");
            return (Criteria) this;
        }

        public Criteria andSubItemGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_ITEM >=", value, "subItem");
            return (Criteria) this;
        }

        public Criteria andSubItemLessThan(String value) {
            addCriterion("SUB_ITEM <", value, "subItem");
            return (Criteria) this;
        }

        public Criteria andSubItemLessThanOrEqualTo(String value) {
            addCriterion("SUB_ITEM <=", value, "subItem");
            return (Criteria) this;
        }

        public Criteria andSubItemLike(String value) {
            addCriterion("SUB_ITEM like", value, "subItem");
            return (Criteria) this;
        }

        public Criteria andSubItemNotLike(String value) {
            addCriterion("SUB_ITEM not like", value, "subItem");
            return (Criteria) this;
        }

        public Criteria andSubItemIn(List<String> values) {
            addCriterion("SUB_ITEM in", values, "subItem");
            return (Criteria) this;
        }

        public Criteria andSubItemNotIn(List<String> values) {
            addCriterion("SUB_ITEM not in", values, "subItem");
            return (Criteria) this;
        }

        public Criteria andSubItemBetween(String value1, String value2) {
            addCriterion("SUB_ITEM between", value1, value2, "subItem");
            return (Criteria) this;
        }

        public Criteria andSubItemNotBetween(String value1, String value2) {
            addCriterion("SUB_ITEM not between", value1, value2, "subItem");
            return (Criteria) this;
        }

        public Criteria andOptCodeIsNull() {
            addCriterion("OPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOptCodeIsNotNull() {
            addCriterion("OPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOptCodeEqualTo(String value) {
            addCriterion("OPT_CODE =", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeNotEqualTo(String value) {
            addCriterion("OPT_CODE <>", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeGreaterThan(String value) {
            addCriterion("OPT_CODE >", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_CODE >=", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeLessThan(String value) {
            addCriterion("OPT_CODE <", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeLessThanOrEqualTo(String value) {
            addCriterion("OPT_CODE <=", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeLike(String value) {
            addCriterion("OPT_CODE like", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeNotLike(String value) {
            addCriterion("OPT_CODE not like", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeIn(List<String> values) {
            addCriterion("OPT_CODE in", values, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeNotIn(List<String> values) {
            addCriterion("OPT_CODE not in", values, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeBetween(String value1, String value2) {
            addCriterion("OPT_CODE between", value1, value2, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeNotBetween(String value1, String value2) {
            addCriterion("OPT_CODE not between", value1, value2, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptScoeIsNull() {
            addCriterion("OPT_SCOE is null");
            return (Criteria) this;
        }

        public Criteria andOptScoeIsNotNull() {
            addCriterion("OPT_SCOE is not null");
            return (Criteria) this;
        }

        public Criteria andOptScoeEqualTo(Short value) {
            addCriterion("OPT_SCOE =", value, "optScoe");
            return (Criteria) this;
        }

        public Criteria andOptScoeNotEqualTo(Short value) {
            addCriterion("OPT_SCOE <>", value, "optScoe");
            return (Criteria) this;
        }

        public Criteria andOptScoeGreaterThan(Short value) {
            addCriterion("OPT_SCOE >", value, "optScoe");
            return (Criteria) this;
        }

        public Criteria andOptScoeGreaterThanOrEqualTo(Short value) {
            addCriterion("OPT_SCOE >=", value, "optScoe");
            return (Criteria) this;
        }

        public Criteria andOptScoeLessThan(Short value) {
            addCriterion("OPT_SCOE <", value, "optScoe");
            return (Criteria) this;
        }

        public Criteria andOptScoeLessThanOrEqualTo(Short value) {
            addCriterion("OPT_SCOE <=", value, "optScoe");
            return (Criteria) this;
        }

        public Criteria andOptScoeIn(List<Short> values) {
            addCriterion("OPT_SCOE in", values, "optScoe");
            return (Criteria) this;
        }

        public Criteria andOptScoeNotIn(List<Short> values) {
            addCriterion("OPT_SCOE not in", values, "optScoe");
            return (Criteria) this;
        }

        public Criteria andOptScoeBetween(Short value1, Short value2) {
            addCriterion("OPT_SCOE between", value1, value2, "optScoe");
            return (Criteria) this;
        }

        public Criteria andOptScoeNotBetween(Short value1, Short value2) {
            addCriterion("OPT_SCOE not between", value1, value2, "optScoe");
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
            addCriterionForJDBCDate("CRT_TIME =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIME <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CRT_TIME >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIME >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterionForJDBCDate("CRT_TIME <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIME <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_TIME in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_TIME not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_TIME between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_TIME not between", value1, value2, "crtTime");
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

        public Criteria andUsrNameIsNull() {
            addCriterion("USR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNotNull() {
            addCriterion("USR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNameEqualTo(String value) {
            addCriterion("USR_NAME =", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotEqualTo(String value) {
            addCriterion("USR_NAME <>", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThan(String value) {
            addCriterion("USR_NAME >", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NAME >=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThan(String value) {
            addCriterion("USR_NAME <", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThanOrEqualTo(String value) {
            addCriterion("USR_NAME <=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLike(String value) {
            addCriterion("USR_NAME like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotLike(String value) {
            addCriterion("USR_NAME not like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameIn(List<String> values) {
            addCriterion("USR_NAME in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotIn(List<String> values) {
            addCriterion("USR_NAME not in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameBetween(String value1, String value2) {
            addCriterion("USR_NAME between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotBetween(String value1, String value2) {
            addCriterion("USR_NAME not between", value1, value2, "usrName");
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