package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspCspfDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCspfDefExample() {
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

        public Criteria andSubNameIsNull() {
            addCriterion("SUB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNotNull() {
            addCriterion("SUB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubNameEqualTo(String value) {
            addCriterion("SUB_NAME =", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotEqualTo(String value) {
            addCriterion("SUB_NAME <>", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThan(String value) {
            addCriterion("SUB_NAME >", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_NAME >=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThan(String value) {
            addCriterion("SUB_NAME <", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThanOrEqualTo(String value) {
            addCriterion("SUB_NAME <=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLike(String value) {
            addCriterion("SUB_NAME like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotLike(String value) {
            addCriterion("SUB_NAME not like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameIn(List<String> values) {
            addCriterion("SUB_NAME in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotIn(List<String> values) {
            addCriterion("SUB_NAME not in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameBetween(String value1, String value2) {
            addCriterion("SUB_NAME between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotBetween(String value1, String value2) {
            addCriterion("SUB_NAME not between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andOptNameIsNull() {
            addCriterion("OPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOptNameIsNotNull() {
            addCriterion("OPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOptNameEqualTo(String value) {
            addCriterion("OPT_NAME =", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotEqualTo(String value) {
            addCriterion("OPT_NAME <>", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameGreaterThan(String value) {
            addCriterion("OPT_NAME >", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_NAME >=", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameLessThan(String value) {
            addCriterion("OPT_NAME <", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameLessThanOrEqualTo(String value) {
            addCriterion("OPT_NAME <=", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameLike(String value) {
            addCriterion("OPT_NAME like", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotLike(String value) {
            addCriterion("OPT_NAME not like", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameIn(List<String> values) {
            addCriterion("OPT_NAME in", values, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotIn(List<String> values) {
            addCriterion("OPT_NAME not in", values, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameBetween(String value1, String value2) {
            addCriterion("OPT_NAME between", value1, value2, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotBetween(String value1, String value2) {
            addCriterion("OPT_NAME not between", value1, value2, "optName");
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

        public Criteria andPrtNameIsNull() {
            addCriterion("PRT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrtNameIsNotNull() {
            addCriterion("PRT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrtNameEqualTo(String value) {
            addCriterion("PRT_NAME =", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotEqualTo(String value) {
            addCriterion("PRT_NAME <>", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameGreaterThan(String value) {
            addCriterion("PRT_NAME >", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRT_NAME >=", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameLessThan(String value) {
            addCriterion("PRT_NAME <", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameLessThanOrEqualTo(String value) {
            addCriterion("PRT_NAME <=", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameLike(String value) {
            addCriterion("PRT_NAME like", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotLike(String value) {
            addCriterion("PRT_NAME not like", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameIn(List<String> values) {
            addCriterion("PRT_NAME in", values, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotIn(List<String> values) {
            addCriterion("PRT_NAME not in", values, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameBetween(String value1, String value2) {
            addCriterion("PRT_NAME between", value1, value2, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotBetween(String value1, String value2) {
            addCriterion("PRT_NAME not between", value1, value2, "prtName");
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