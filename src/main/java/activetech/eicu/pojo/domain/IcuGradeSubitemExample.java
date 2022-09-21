package activetech.eicu.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class IcuGradeSubitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcuGradeSubitemExample() {
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

        public Criteria andGradeSeqIsNull() {
            addCriterion("GRADE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andGradeSeqIsNotNull() {
            addCriterion("GRADE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andGradeSeqEqualTo(String value) {
            addCriterion("GRADE_SEQ =", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqNotEqualTo(String value) {
            addCriterion("GRADE_SEQ <>", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqGreaterThan(String value) {
            addCriterion("GRADE_SEQ >", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_SEQ >=", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqLessThan(String value) {
            addCriterion("GRADE_SEQ <", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqLessThanOrEqualTo(String value) {
            addCriterion("GRADE_SEQ <=", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqLike(String value) {
            addCriterion("GRADE_SEQ like", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqNotLike(String value) {
            addCriterion("GRADE_SEQ not like", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqIn(List<String> values) {
            addCriterion("GRADE_SEQ in", values, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqNotIn(List<String> values) {
            addCriterion("GRADE_SEQ not in", values, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqBetween(String value1, String value2) {
            addCriterion("GRADE_SEQ between", value1, value2, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqNotBetween(String value1, String value2) {
            addCriterion("GRADE_SEQ not between", value1, value2, "gradeSeq");
            return (Criteria) this;
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

        public Criteria andItemFieldIsNull() {
            addCriterion("ITEM_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andItemFieldIsNotNull() {
            addCriterion("ITEM_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andItemFieldEqualTo(String value) {
            addCriterion("ITEM_FIELD =", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldNotEqualTo(String value) {
            addCriterion("ITEM_FIELD <>", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldGreaterThan(String value) {
            addCriterion("ITEM_FIELD >", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_FIELD >=", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldLessThan(String value) {
            addCriterion("ITEM_FIELD <", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldLessThanOrEqualTo(String value) {
            addCriterion("ITEM_FIELD <=", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldLike(String value) {
            addCriterion("ITEM_FIELD like", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldNotLike(String value) {
            addCriterion("ITEM_FIELD not like", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldIn(List<String> values) {
            addCriterion("ITEM_FIELD in", values, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldNotIn(List<String> values) {
            addCriterion("ITEM_FIELD not in", values, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldBetween(String value1, String value2) {
            addCriterion("ITEM_FIELD between", value1, value2, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldNotBetween(String value1, String value2) {
            addCriterion("ITEM_FIELD not between", value1, value2, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemValueIsNull() {
            addCriterion("ITEM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andItemValueIsNotNull() {
            addCriterion("ITEM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andItemValueEqualTo(String value) {
            addCriterion("ITEM_VALUE =", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotEqualTo(String value) {
            addCriterion("ITEM_VALUE <>", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueGreaterThan(String value) {
            addCriterion("ITEM_VALUE >", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_VALUE >=", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueLessThan(String value) {
            addCriterion("ITEM_VALUE <", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueLessThanOrEqualTo(String value) {
            addCriterion("ITEM_VALUE <=", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueLike(String value) {
            addCriterion("ITEM_VALUE like", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotLike(String value) {
            addCriterion("ITEM_VALUE not like", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueIn(List<String> values) {
            addCriterion("ITEM_VALUE in", values, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotIn(List<String> values) {
            addCriterion("ITEM_VALUE not in", values, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueBetween(String value1, String value2) {
            addCriterion("ITEM_VALUE between", value1, value2, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotBetween(String value1, String value2) {
            addCriterion("ITEM_VALUE not between", value1, value2, "itemValue");
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