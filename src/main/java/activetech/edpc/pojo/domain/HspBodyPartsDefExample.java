package activetech.edpc.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HspBodyPartsDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspBodyPartsDefExample() {
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

        public Criteria andPartIdIsNull() {
            addCriterion("PART_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNotNull() {
            addCriterion("PART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartIdEqualTo(String value) {
            addCriterion("PART_ID =", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotEqualTo(String value) {
            addCriterion("PART_ID <>", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThan(String value) {
            addCriterion("PART_ID >", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThanOrEqualTo(String value) {
            addCriterion("PART_ID >=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThan(String value) {
            addCriterion("PART_ID <", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThanOrEqualTo(String value) {
            addCriterion("PART_ID <=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLike(String value) {
            addCriterion("PART_ID like", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotLike(String value) {
            addCriterion("PART_ID not like", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdIn(List<String> values) {
            addCriterion("PART_ID in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotIn(List<String> values) {
            addCriterion("PART_ID not in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdBetween(String value1, String value2) {
            addCriterion("PART_ID between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotBetween(String value1, String value2) {
            addCriterion("PART_ID not between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("PART_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("PART_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("PART_NAME =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("PART_NAME <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("PART_NAME >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("PART_NAME >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("PART_NAME <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("PART_NAME <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("PART_NAME like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("PART_NAME not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("PART_NAME in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("PART_NAME not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("PART_NAME between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("PART_NAME not between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXIsNull() {
            addCriterion("ORIGIN_AXIS_X is null");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXIsNotNull() {
            addCriterion("ORIGIN_AXIS_X is not null");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXEqualTo(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_X =", value, "originAxisX");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXNotEqualTo(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_X <>", value, "originAxisX");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXGreaterThan(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_X >", value, "originAxisX");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_X >=", value, "originAxisX");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXLessThan(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_X <", value, "originAxisX");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_X <=", value, "originAxisX");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXIn(List<BigDecimal> values) {
            addCriterion("ORIGIN_AXIS_X in", values, "originAxisX");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXNotIn(List<BigDecimal> values) {
            addCriterion("ORIGIN_AXIS_X not in", values, "originAxisX");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGIN_AXIS_X between", value1, value2, "originAxisX");
            return (Criteria) this;
        }

        public Criteria andOriginAxisXNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGIN_AXIS_X not between", value1, value2, "originAxisX");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYIsNull() {
            addCriterion("ORIGIN_AXIS_Y is null");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYIsNotNull() {
            addCriterion("ORIGIN_AXIS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYEqualTo(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_Y =", value, "originAxisY");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYNotEqualTo(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_Y <>", value, "originAxisY");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYGreaterThan(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_Y >", value, "originAxisY");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_Y >=", value, "originAxisY");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYLessThan(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_Y <", value, "originAxisY");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGIN_AXIS_Y <=", value, "originAxisY");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYIn(List<BigDecimal> values) {
            addCriterion("ORIGIN_AXIS_Y in", values, "originAxisY");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYNotIn(List<BigDecimal> values) {
            addCriterion("ORIGIN_AXIS_Y not in", values, "originAxisY");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGIN_AXIS_Y between", value1, value2, "originAxisY");
            return (Criteria) this;
        }

        public Criteria andOriginAxisYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGIN_AXIS_Y not between", value1, value2, "originAxisY");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("RADIUS is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("RADIUS is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(BigDecimal value) {
            addCriterion("RADIUS =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(BigDecimal value) {
            addCriterion("RADIUS <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(BigDecimal value) {
            addCriterion("RADIUS >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RADIUS >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(BigDecimal value) {
            addCriterion("RADIUS <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RADIUS <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<BigDecimal> values) {
            addCriterion("RADIUS in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<BigDecimal> values) {
            addCriterion("RADIUS not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RADIUS between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RADIUS not between", value1, value2, "radius");
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