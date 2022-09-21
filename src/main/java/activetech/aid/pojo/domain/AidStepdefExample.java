package activetech.aid.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class AidStepdefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AidStepdefExample() {
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

        public Criteria andStepseqIsNull() {
            addCriterion("STEPSEQ is null");
            return (Criteria) this;
        }

        public Criteria andStepseqIsNotNull() {
            addCriterion("STEPSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andStepseqEqualTo(String value) {
            addCriterion("STEPSEQ =", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqNotEqualTo(String value) {
            addCriterion("STEPSEQ <>", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqGreaterThan(String value) {
            addCriterion("STEPSEQ >", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqGreaterThanOrEqualTo(String value) {
            addCriterion("STEPSEQ >=", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqLessThan(String value) {
            addCriterion("STEPSEQ <", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqLessThanOrEqualTo(String value) {
            addCriterion("STEPSEQ <=", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqLike(String value) {
            addCriterion("STEPSEQ like", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqNotLike(String value) {
            addCriterion("STEPSEQ not like", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqIn(List<String> values) {
            addCriterion("STEPSEQ in", values, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqNotIn(List<String> values) {
            addCriterion("STEPSEQ not in", values, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqBetween(String value1, String value2) {
            addCriterion("STEPSEQ between", value1, value2, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqNotBetween(String value1, String value2) {
            addCriterion("STEPSEQ not between", value1, value2, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepnameIsNull() {
            addCriterion("STEPNAME is null");
            return (Criteria) this;
        }

        public Criteria andStepnameIsNotNull() {
            addCriterion("STEPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStepnameEqualTo(String value) {
            addCriterion("STEPNAME =", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotEqualTo(String value) {
            addCriterion("STEPNAME <>", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameGreaterThan(String value) {
            addCriterion("STEPNAME >", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameGreaterThanOrEqualTo(String value) {
            addCriterion("STEPNAME >=", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameLessThan(String value) {
            addCriterion("STEPNAME <", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameLessThanOrEqualTo(String value) {
            addCriterion("STEPNAME <=", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameLike(String value) {
            addCriterion("STEPNAME like", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotLike(String value) {
            addCriterion("STEPNAME not like", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameIn(List<String> values) {
            addCriterion("STEPNAME in", values, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotIn(List<String> values) {
            addCriterion("STEPNAME not in", values, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameBetween(String value1, String value2) {
            addCriterion("STEPNAME between", value1, value2, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotBetween(String value1, String value2) {
            addCriterion("STEPNAME not between", value1, value2, "stepname");
            return (Criteria) this;
        }

        public Criteria andSteptypeIsNull() {
            addCriterion("STEPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSteptypeIsNotNull() {
            addCriterion("STEPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSteptypeEqualTo(String value) {
            addCriterion("STEPTYPE =", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeNotEqualTo(String value) {
            addCriterion("STEPTYPE <>", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeGreaterThan(String value) {
            addCriterion("STEPTYPE >", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeGreaterThanOrEqualTo(String value) {
            addCriterion("STEPTYPE >=", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeLessThan(String value) {
            addCriterion("STEPTYPE <", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeLessThanOrEqualTo(String value) {
            addCriterion("STEPTYPE <=", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeLike(String value) {
            addCriterion("STEPTYPE like", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeNotLike(String value) {
            addCriterion("STEPTYPE not like", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeIn(List<String> values) {
            addCriterion("STEPTYPE in", values, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeNotIn(List<String> values) {
            addCriterion("STEPTYPE not in", values, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeBetween(String value1, String value2) {
            addCriterion("STEPTYPE between", value1, value2, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeNotBetween(String value1, String value2) {
            addCriterion("STEPTYPE not between", value1, value2, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteprangeIsNull() {
            addCriterion("STEPRANGE is null");
            return (Criteria) this;
        }

        public Criteria andSteprangeIsNotNull() {
            addCriterion("STEPRANGE is not null");
            return (Criteria) this;
        }

        public Criteria andSteprangeEqualTo(String value) {
            addCriterion("STEPRANGE =", value, "steprange");
            return (Criteria) this;
        }

        public Criteria andSteprangeNotEqualTo(String value) {
            addCriterion("STEPRANGE <>", value, "steprange");
            return (Criteria) this;
        }

        public Criteria andSteprangeGreaterThan(String value) {
            addCriterion("STEPRANGE >", value, "steprange");
            return (Criteria) this;
        }

        public Criteria andSteprangeGreaterThanOrEqualTo(String value) {
            addCriterion("STEPRANGE >=", value, "steprange");
            return (Criteria) this;
        }

        public Criteria andSteprangeLessThan(String value) {
            addCriterion("STEPRANGE <", value, "steprange");
            return (Criteria) this;
        }

        public Criteria andSteprangeLessThanOrEqualTo(String value) {
            addCriterion("STEPRANGE <=", value, "steprange");
            return (Criteria) this;
        }

        public Criteria andSteprangeLike(String value) {
            addCriterion("STEPRANGE like", value, "steprange");
            return (Criteria) this;
        }

        public Criteria andSteprangeNotLike(String value) {
            addCriterion("STEPRANGE not like", value, "steprange");
            return (Criteria) this;
        }

        public Criteria andSteprangeIn(List<String> values) {
            addCriterion("STEPRANGE in", values, "steprange");
            return (Criteria) this;
        }

        public Criteria andSteprangeNotIn(List<String> values) {
            addCriterion("STEPRANGE not in", values, "steprange");
            return (Criteria) this;
        }

        public Criteria andSteprangeBetween(String value1, String value2) {
            addCriterion("STEPRANGE between", value1, value2, "steprange");
            return (Criteria) this;
        }

        public Criteria andSteprangeNotBetween(String value1, String value2) {
            addCriterion("STEPRANGE not between", value1, value2, "steprange");
            return (Criteria) this;
        }

        public Criteria andStepflagIsNull() {
            addCriterion("STEPFLAG is null");
            return (Criteria) this;
        }

        public Criteria andStepflagIsNotNull() {
            addCriterion("STEPFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andStepflagEqualTo(String value) {
            addCriterion("STEPFLAG =", value, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepflagNotEqualTo(String value) {
            addCriterion("STEPFLAG <>", value, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepflagGreaterThan(String value) {
            addCriterion("STEPFLAG >", value, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepflagGreaterThanOrEqualTo(String value) {
            addCriterion("STEPFLAG >=", value, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepflagLessThan(String value) {
            addCriterion("STEPFLAG <", value, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepflagLessThanOrEqualTo(String value) {
            addCriterion("STEPFLAG <=", value, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepflagLike(String value) {
            addCriterion("STEPFLAG like", value, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepflagNotLike(String value) {
            addCriterion("STEPFLAG not like", value, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepflagIn(List<String> values) {
            addCriterion("STEPFLAG in", values, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepflagNotIn(List<String> values) {
            addCriterion("STEPFLAG not in", values, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepflagBetween(String value1, String value2) {
            addCriterion("STEPFLAG between", value1, value2, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepflagNotBetween(String value1, String value2) {
            addCriterion("STEPFLAG not between", value1, value2, "stepflag");
            return (Criteria) this;
        }

        public Criteria andStepsortIsNull() {
            addCriterion("STEPSORT is null");
            return (Criteria) this;
        }

        public Criteria andStepsortIsNotNull() {
            addCriterion("STEPSORT is not null");
            return (Criteria) this;
        }

        public Criteria andStepsortEqualTo(Short value) {
            addCriterion("STEPSORT =", value, "stepsort");
            return (Criteria) this;
        }

        public Criteria andStepsortNotEqualTo(Short value) {
            addCriterion("STEPSORT <>", value, "stepsort");
            return (Criteria) this;
        }

        public Criteria andStepsortGreaterThan(Short value) {
            addCriterion("STEPSORT >", value, "stepsort");
            return (Criteria) this;
        }

        public Criteria andStepsortGreaterThanOrEqualTo(Short value) {
            addCriterion("STEPSORT >=", value, "stepsort");
            return (Criteria) this;
        }

        public Criteria andStepsortLessThan(Short value) {
            addCriterion("STEPSORT <", value, "stepsort");
            return (Criteria) this;
        }

        public Criteria andStepsortLessThanOrEqualTo(Short value) {
            addCriterion("STEPSORT <=", value, "stepsort");
            return (Criteria) this;
        }

        public Criteria andStepsortIn(List<Short> values) {
            addCriterion("STEPSORT in", values, "stepsort");
            return (Criteria) this;
        }

        public Criteria andStepsortNotIn(List<Short> values) {
            addCriterion("STEPSORT not in", values, "stepsort");
            return (Criteria) this;
        }

        public Criteria andStepsortBetween(Short value1, Short value2) {
            addCriterion("STEPSORT between", value1, value2, "stepsort");
            return (Criteria) this;
        }

        public Criteria andStepsortNotBetween(Short value1, Short value2) {
            addCriterion("STEPSORT not between", value1, value2, "stepsort");
            return (Criteria) this;
        }

        public Criteria andSetpmemoIsNull() {
            addCriterion("SETPMEMO is null");
            return (Criteria) this;
        }

        public Criteria andSetpmemoIsNotNull() {
            addCriterion("SETPMEMO is not null");
            return (Criteria) this;
        }

        public Criteria andSetpmemoEqualTo(String value) {
            addCriterion("SETPMEMO =", value, "setpmemo");
            return (Criteria) this;
        }

        public Criteria andSetpmemoNotEqualTo(String value) {
            addCriterion("SETPMEMO <>", value, "setpmemo");
            return (Criteria) this;
        }

        public Criteria andSetpmemoGreaterThan(String value) {
            addCriterion("SETPMEMO >", value, "setpmemo");
            return (Criteria) this;
        }

        public Criteria andSetpmemoGreaterThanOrEqualTo(String value) {
            addCriterion("SETPMEMO >=", value, "setpmemo");
            return (Criteria) this;
        }

        public Criteria andSetpmemoLessThan(String value) {
            addCriterion("SETPMEMO <", value, "setpmemo");
            return (Criteria) this;
        }

        public Criteria andSetpmemoLessThanOrEqualTo(String value) {
            addCriterion("SETPMEMO <=", value, "setpmemo");
            return (Criteria) this;
        }

        public Criteria andSetpmemoLike(String value) {
            addCriterion("SETPMEMO like", value, "setpmemo");
            return (Criteria) this;
        }

        public Criteria andSetpmemoNotLike(String value) {
            addCriterion("SETPMEMO not like", value, "setpmemo");
            return (Criteria) this;
        }

        public Criteria andSetpmemoIn(List<String> values) {
            addCriterion("SETPMEMO in", values, "setpmemo");
            return (Criteria) this;
        }

        public Criteria andSetpmemoNotIn(List<String> values) {
            addCriterion("SETPMEMO not in", values, "setpmemo");
            return (Criteria) this;
        }

        public Criteria andSetpmemoBetween(String value1, String value2) {
            addCriterion("SETPMEMO between", value1, value2, "setpmemo");
            return (Criteria) this;
        }

        public Criteria andSetpmemoNotBetween(String value1, String value2) {
            addCriterion("SETPMEMO not between", value1, value2, "setpmemo");
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