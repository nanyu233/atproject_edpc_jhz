package activetech.eicu.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class DstparameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DstparameterExample() {
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

        public Criteria andPartypeIsNull() {
            addCriterion("PARTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPartypeIsNotNull() {
            addCriterion("PARTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPartypeEqualTo(String value) {
            addCriterion("PARTYPE =", value, "partype");
            return (Criteria) this;
        }

        public Criteria andPartypeNotEqualTo(String value) {
            addCriterion("PARTYPE <>", value, "partype");
            return (Criteria) this;
        }

        public Criteria andPartypeGreaterThan(String value) {
            addCriterion("PARTYPE >", value, "partype");
            return (Criteria) this;
        }

        public Criteria andPartypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARTYPE >=", value, "partype");
            return (Criteria) this;
        }

        public Criteria andPartypeLessThan(String value) {
            addCriterion("PARTYPE <", value, "partype");
            return (Criteria) this;
        }

        public Criteria andPartypeLessThanOrEqualTo(String value) {
            addCriterion("PARTYPE <=", value, "partype");
            return (Criteria) this;
        }

        public Criteria andPartypeLike(String value) {
            addCriterion("PARTYPE like", value, "partype");
            return (Criteria) this;
        }

        public Criteria andPartypeNotLike(String value) {
            addCriterion("PARTYPE not like", value, "partype");
            return (Criteria) this;
        }

        public Criteria andPartypeIn(List<String> values) {
            addCriterion("PARTYPE in", values, "partype");
            return (Criteria) this;
        }

        public Criteria andPartypeNotIn(List<String> values) {
            addCriterion("PARTYPE not in", values, "partype");
            return (Criteria) this;
        }

        public Criteria andPartypeBetween(String value1, String value2) {
            addCriterion("PARTYPE between", value1, value2, "partype");
            return (Criteria) this;
        }

        public Criteria andPartypeNotBetween(String value1, String value2) {
            addCriterion("PARTYPE not between", value1, value2, "partype");
            return (Criteria) this;
        }

        public Criteria andParcodeIsNull() {
            addCriterion("PARCODE is null");
            return (Criteria) this;
        }

        public Criteria andParcodeIsNotNull() {
            addCriterion("PARCODE is not null");
            return (Criteria) this;
        }

        public Criteria andParcodeEqualTo(String value) {
            addCriterion("PARCODE =", value, "parcode");
            return (Criteria) this;
        }

        public Criteria andParcodeNotEqualTo(String value) {
            addCriterion("PARCODE <>", value, "parcode");
            return (Criteria) this;
        }

        public Criteria andParcodeGreaterThan(String value) {
            addCriterion("PARCODE >", value, "parcode");
            return (Criteria) this;
        }

        public Criteria andParcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARCODE >=", value, "parcode");
            return (Criteria) this;
        }

        public Criteria andParcodeLessThan(String value) {
            addCriterion("PARCODE <", value, "parcode");
            return (Criteria) this;
        }

        public Criteria andParcodeLessThanOrEqualTo(String value) {
            addCriterion("PARCODE <=", value, "parcode");
            return (Criteria) this;
        }

        public Criteria andParcodeLike(String value) {
            addCriterion("PARCODE like", value, "parcode");
            return (Criteria) this;
        }

        public Criteria andParcodeNotLike(String value) {
            addCriterion("PARCODE not like", value, "parcode");
            return (Criteria) this;
        }

        public Criteria andParcodeIn(List<String> values) {
            addCriterion("PARCODE in", values, "parcode");
            return (Criteria) this;
        }

        public Criteria andParcodeNotIn(List<String> values) {
            addCriterion("PARCODE not in", values, "parcode");
            return (Criteria) this;
        }

        public Criteria andParcodeBetween(String value1, String value2) {
            addCriterion("PARCODE between", value1, value2, "parcode");
            return (Criteria) this;
        }

        public Criteria andParcodeNotBetween(String value1, String value2) {
            addCriterion("PARCODE not between", value1, value2, "parcode");
            return (Criteria) this;
        }

        public Criteria andParvalue1IsNull() {
            addCriterion("PARVALUE1 is null");
            return (Criteria) this;
        }

        public Criteria andParvalue1IsNotNull() {
            addCriterion("PARVALUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andParvalue1EqualTo(String value) {
            addCriterion("PARVALUE1 =", value, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParvalue1NotEqualTo(String value) {
            addCriterion("PARVALUE1 <>", value, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParvalue1GreaterThan(String value) {
            addCriterion("PARVALUE1 >", value, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParvalue1GreaterThanOrEqualTo(String value) {
            addCriterion("PARVALUE1 >=", value, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParvalue1LessThan(String value) {
            addCriterion("PARVALUE1 <", value, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParvalue1LessThanOrEqualTo(String value) {
            addCriterion("PARVALUE1 <=", value, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParvalue1Like(String value) {
            addCriterion("PARVALUE1 like", value, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParvalue1NotLike(String value) {
            addCriterion("PARVALUE1 not like", value, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParvalue1In(List<String> values) {
            addCriterion("PARVALUE1 in", values, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParvalue1NotIn(List<String> values) {
            addCriterion("PARVALUE1 not in", values, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParvalue1Between(String value1, String value2) {
            addCriterion("PARVALUE1 between", value1, value2, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParvalue1NotBetween(String value1, String value2) {
            addCriterion("PARVALUE1 not between", value1, value2, "parvalue1");
            return (Criteria) this;
        }

        public Criteria andParnameIsNull() {
            addCriterion("PARNAME is null");
            return (Criteria) this;
        }

        public Criteria andParnameIsNotNull() {
            addCriterion("PARNAME is not null");
            return (Criteria) this;
        }

        public Criteria andParnameEqualTo(String value) {
            addCriterion("PARNAME =", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameNotEqualTo(String value) {
            addCriterion("PARNAME <>", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameGreaterThan(String value) {
            addCriterion("PARNAME >", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameGreaterThanOrEqualTo(String value) {
            addCriterion("PARNAME >=", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameLessThan(String value) {
            addCriterion("PARNAME <", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameLessThanOrEqualTo(String value) {
            addCriterion("PARNAME <=", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameLike(String value) {
            addCriterion("PARNAME like", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameNotLike(String value) {
            addCriterion("PARNAME not like", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameIn(List<String> values) {
            addCriterion("PARNAME in", values, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameNotIn(List<String> values) {
            addCriterion("PARNAME not in", values, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameBetween(String value1, String value2) {
            addCriterion("PARNAME between", value1, value2, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameNotBetween(String value1, String value2) {
            addCriterion("PARNAME not between", value1, value2, "parname");
            return (Criteria) this;
        }

        public Criteria andParmemoIsNull() {
            addCriterion("PARMEMO is null");
            return (Criteria) this;
        }

        public Criteria andParmemoIsNotNull() {
            addCriterion("PARMEMO is not null");
            return (Criteria) this;
        }

        public Criteria andParmemoEqualTo(String value) {
            addCriterion("PARMEMO =", value, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParmemoNotEqualTo(String value) {
            addCriterion("PARMEMO <>", value, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParmemoGreaterThan(String value) {
            addCriterion("PARMEMO >", value, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParmemoGreaterThanOrEqualTo(String value) {
            addCriterion("PARMEMO >=", value, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParmemoLessThan(String value) {
            addCriterion("PARMEMO <", value, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParmemoLessThanOrEqualTo(String value) {
            addCriterion("PARMEMO <=", value, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParmemoLike(String value) {
            addCriterion("PARMEMO like", value, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParmemoNotLike(String value) {
            addCriterion("PARMEMO not like", value, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParmemoIn(List<String> values) {
            addCriterion("PARMEMO in", values, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParmemoNotIn(List<String> values) {
            addCriterion("PARMEMO not in", values, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParmemoBetween(String value1, String value2) {
            addCriterion("PARMEMO between", value1, value2, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParmemoNotBetween(String value1, String value2) {
            addCriterion("PARMEMO not between", value1, value2, "parmemo");
            return (Criteria) this;
        }

        public Criteria andParvalue2IsNull() {
            addCriterion("PARVALUE2 is null");
            return (Criteria) this;
        }

        public Criteria andParvalue2IsNotNull() {
            addCriterion("PARVALUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andParvalue2EqualTo(String value) {
            addCriterion("PARVALUE2 =", value, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue2NotEqualTo(String value) {
            addCriterion("PARVALUE2 <>", value, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue2GreaterThan(String value) {
            addCriterion("PARVALUE2 >", value, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue2GreaterThanOrEqualTo(String value) {
            addCriterion("PARVALUE2 >=", value, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue2LessThan(String value) {
            addCriterion("PARVALUE2 <", value, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue2LessThanOrEqualTo(String value) {
            addCriterion("PARVALUE2 <=", value, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue2Like(String value) {
            addCriterion("PARVALUE2 like", value, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue2NotLike(String value) {
            addCriterion("PARVALUE2 not like", value, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue2In(List<String> values) {
            addCriterion("PARVALUE2 in", values, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue2NotIn(List<String> values) {
            addCriterion("PARVALUE2 not in", values, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue2Between(String value1, String value2) {
            addCriterion("PARVALUE2 between", value1, value2, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue2NotBetween(String value1, String value2) {
            addCriterion("PARVALUE2 not between", value1, value2, "parvalue2");
            return (Criteria) this;
        }

        public Criteria andParvalue3IsNull() {
            addCriterion("PARVALUE3 is null");
            return (Criteria) this;
        }

        public Criteria andParvalue3IsNotNull() {
            addCriterion("PARVALUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andParvalue3EqualTo(String value) {
            addCriterion("PARVALUE3 =", value, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue3NotEqualTo(String value) {
            addCriterion("PARVALUE3 <>", value, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue3GreaterThan(String value) {
            addCriterion("PARVALUE3 >", value, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue3GreaterThanOrEqualTo(String value) {
            addCriterion("PARVALUE3 >=", value, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue3LessThan(String value) {
            addCriterion("PARVALUE3 <", value, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue3LessThanOrEqualTo(String value) {
            addCriterion("PARVALUE3 <=", value, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue3Like(String value) {
            addCriterion("PARVALUE3 like", value, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue3NotLike(String value) {
            addCriterion("PARVALUE3 not like", value, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue3In(List<String> values) {
            addCriterion("PARVALUE3 in", values, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue3NotIn(List<String> values) {
            addCriterion("PARVALUE3 not in", values, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue3Between(String value1, String value2) {
            addCriterion("PARVALUE3 between", value1, value2, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue3NotBetween(String value1, String value2) {
            addCriterion("PARVALUE3 not between", value1, value2, "parvalue3");
            return (Criteria) this;
        }

        public Criteria andParvalue4IsNull() {
            addCriterion("PARVALUE4 is null");
            return (Criteria) this;
        }

        public Criteria andParvalue4IsNotNull() {
            addCriterion("PARVALUE4 is not null");
            return (Criteria) this;
        }

        public Criteria andParvalue4EqualTo(String value) {
            addCriterion("PARVALUE4 =", value, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue4NotEqualTo(String value) {
            addCriterion("PARVALUE4 <>", value, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue4GreaterThan(String value) {
            addCriterion("PARVALUE4 >", value, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue4GreaterThanOrEqualTo(String value) {
            addCriterion("PARVALUE4 >=", value, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue4LessThan(String value) {
            addCriterion("PARVALUE4 <", value, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue4LessThanOrEqualTo(String value) {
            addCriterion("PARVALUE4 <=", value, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue4Like(String value) {
            addCriterion("PARVALUE4 like", value, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue4NotLike(String value) {
            addCriterion("PARVALUE4 not like", value, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue4In(List<String> values) {
            addCriterion("PARVALUE4 in", values, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue4NotIn(List<String> values) {
            addCriterion("PARVALUE4 not in", values, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue4Between(String value1, String value2) {
            addCriterion("PARVALUE4 between", value1, value2, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue4NotBetween(String value1, String value2) {
            addCriterion("PARVALUE4 not between", value1, value2, "parvalue4");
            return (Criteria) this;
        }

        public Criteria andParvalue5IsNull() {
            addCriterion("PARVALUE5 is null");
            return (Criteria) this;
        }

        public Criteria andParvalue5IsNotNull() {
            addCriterion("PARVALUE5 is not null");
            return (Criteria) this;
        }

        public Criteria andParvalue5EqualTo(String value) {
            addCriterion("PARVALUE5 =", value, "parvalue5");
            return (Criteria) this;
        }

        public Criteria andParvalue5NotEqualTo(String value) {
            addCriterion("PARVALUE5 <>", value, "parvalue5");
            return (Criteria) this;
        }

        public Criteria andParvalue5GreaterThan(String value) {
            addCriterion("PARVALUE5 >", value, "parvalue5");
            return (Criteria) this;
        }

        public Criteria andParvalue5GreaterThanOrEqualTo(String value) {
            addCriterion("PARVALUE5 >=", value, "parvalue5");
            return (Criteria) this;
        }

        public Criteria andParvalue5LessThan(String value) {
            addCriterion("PARVALUE5 <", value, "parvalue5");
            return (Criteria) this;
        }

        public Criteria andParvalue5LessThanOrEqualTo(String value) {
            addCriterion("PARVALUE5 <=", value, "parvalue5");
            return (Criteria) this;
        }

        public Criteria andParvalue5Like(String value) {
            addCriterion("PARVALUE5 like", value, "parvalue5");
            return (Criteria) this;
        }

        public Criteria andParvalue5NotLike(String value) {
            addCriterion("PARVALUE5 not like", value, "parvalue5");
            return (Criteria) this;
        }

        public Criteria andParvalue5In(List<String> values) {
            addCriterion("PARVALUE5 in", values, "parvalue5");
            return (Criteria) this;
        }

        public Criteria andParvalue5NotIn(List<String> values) {
            addCriterion("PARVALUE5 not in", values, "parvalue5");
            return (Criteria) this;
        }

        public Criteria andParvalue5Between(String value1, String value2) {
            addCriterion("PARVALUE5 between", value1, value2, "parvalue5");
            return (Criteria) this;
        }

        public Criteria andParvalue5NotBetween(String value1, String value2) {
            addCriterion("PARVALUE5 not between", value1, value2, "parvalue5");
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