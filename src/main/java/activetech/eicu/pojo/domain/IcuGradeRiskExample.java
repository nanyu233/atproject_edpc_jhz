package activetech.eicu.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class IcuGradeRiskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcuGradeRiskExample() {
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

        public Criteria andGradeTypeIsNull() {
            addCriterion("GRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIsNotNull() {
            addCriterion("GRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeEqualTo(String value) {
            addCriterion("GRADE_TYPE =", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotEqualTo(String value) {
            addCriterion("GRADE_TYPE <>", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThan(String value) {
            addCriterion("GRADE_TYPE >", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_TYPE >=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThan(String value) {
            addCriterion("GRADE_TYPE <", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThanOrEqualTo(String value) {
            addCriterion("GRADE_TYPE <=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLike(String value) {
            addCriterion("GRADE_TYPE like", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotLike(String value) {
            addCriterion("GRADE_TYPE not like", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIn(List<String> values) {
            addCriterion("GRADE_TYPE in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotIn(List<String> values) {
            addCriterion("GRADE_TYPE not in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeBetween(String value1, String value2) {
            addCriterion("GRADE_TYPE between", value1, value2, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotBetween(String value1, String value2) {
            addCriterion("GRADE_TYPE not between", value1, value2, "gradeType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeIsNull() {
            addCriterion("RISK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRiskTypeIsNotNull() {
            addCriterion("RISK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRiskTypeEqualTo(String value) {
            addCriterion("RISK_TYPE =", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeNotEqualTo(String value) {
            addCriterion("RISK_TYPE <>", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeGreaterThan(String value) {
            addCriterion("RISK_TYPE >", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_TYPE >=", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeLessThan(String value) {
            addCriterion("RISK_TYPE <", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeLessThanOrEqualTo(String value) {
            addCriterion("RISK_TYPE <=", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeLike(String value) {
            addCriterion("RISK_TYPE like", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeNotLike(String value) {
            addCriterion("RISK_TYPE not like", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeIn(List<String> values) {
            addCriterion("RISK_TYPE in", values, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeNotIn(List<String> values) {
            addCriterion("RISK_TYPE not in", values, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeBetween(String value1, String value2) {
            addCriterion("RISK_TYPE between", value1, value2, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeNotBetween(String value1, String value2) {
            addCriterion("RISK_TYPE not between", value1, value2, "riskType");
            return (Criteria) this;
        }

        public Criteria andLowValueIsNull() {
            addCriterion("LOW_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andLowValueIsNotNull() {
            addCriterion("LOW_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andLowValueEqualTo(Long value) {
            addCriterion("LOW_VALUE =", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueNotEqualTo(Long value) {
            addCriterion("LOW_VALUE <>", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueGreaterThan(Long value) {
            addCriterion("LOW_VALUE >", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueGreaterThanOrEqualTo(Long value) {
            addCriterion("LOW_VALUE >=", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueLessThan(Long value) {
            addCriterion("LOW_VALUE <", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueLessThanOrEqualTo(Long value) {
            addCriterion("LOW_VALUE <=", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueIn(List<Long> values) {
            addCriterion("LOW_VALUE in", values, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueNotIn(List<Long> values) {
            addCriterion("LOW_VALUE not in", values, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueBetween(Long value1, Long value2) {
            addCriterion("LOW_VALUE between", value1, value2, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueNotBetween(Long value1, Long value2) {
            addCriterion("LOW_VALUE not between", value1, value2, "lowValue");
            return (Criteria) this;
        }

        public Criteria andUppValueIsNull() {
            addCriterion("UPP_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andUppValueIsNotNull() {
            addCriterion("UPP_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andUppValueEqualTo(Long value) {
            addCriterion("UPP_VALUE =", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueNotEqualTo(Long value) {
            addCriterion("UPP_VALUE <>", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueGreaterThan(Long value) {
            addCriterion("UPP_VALUE >", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueGreaterThanOrEqualTo(Long value) {
            addCriterion("UPP_VALUE >=", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueLessThan(Long value) {
            addCriterion("UPP_VALUE <", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueLessThanOrEqualTo(Long value) {
            addCriterion("UPP_VALUE <=", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueIn(List<Long> values) {
            addCriterion("UPP_VALUE in", values, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueNotIn(List<Long> values) {
            addCriterion("UPP_VALUE not in", values, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueBetween(Long value1, Long value2) {
            addCriterion("UPP_VALUE between", value1, value2, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueNotBetween(Long value1, Long value2) {
            addCriterion("UPP_VALUE not between", value1, value2, "uppValue");
            return (Criteria) this;
        }

        public Criteria andRiskDescIsNull() {
            addCriterion("RISK_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRiskDescIsNotNull() {
            addCriterion("RISK_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRiskDescEqualTo(String value) {
            addCriterion("RISK_DESC =", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotEqualTo(String value) {
            addCriterion("RISK_DESC <>", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescGreaterThan(String value) {
            addCriterion("RISK_DESC >", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_DESC >=", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescLessThan(String value) {
            addCriterion("RISK_DESC <", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescLessThanOrEqualTo(String value) {
            addCriterion("RISK_DESC <=", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescLike(String value) {
            addCriterion("RISK_DESC like", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotLike(String value) {
            addCriterion("RISK_DESC not like", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescIn(List<String> values) {
            addCriterion("RISK_DESC in", values, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotIn(List<String> values) {
            addCriterion("RISK_DESC not in", values, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescBetween(String value1, String value2) {
            addCriterion("RISK_DESC between", value1, value2, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotBetween(String value1, String value2) {
            addCriterion("RISK_DESC not between", value1, value2, "riskDesc");
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