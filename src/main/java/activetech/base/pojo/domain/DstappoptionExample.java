package activetech.base.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class DstappoptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DstappoptionExample() {
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

        public Criteria andOptkeyIsNull() {
            addCriterion("OPTKEY is null");
            return (Criteria) this;
        }

        public Criteria andOptkeyIsNotNull() {
            addCriterion("OPTKEY is not null");
            return (Criteria) this;
        }

        public Criteria andOptkeyEqualTo(String value) {
            addCriterion("OPTKEY =", value, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptkeyNotEqualTo(String value) {
            addCriterion("OPTKEY <>", value, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptkeyGreaterThan(String value) {
            addCriterion("OPTKEY >", value, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptkeyGreaterThanOrEqualTo(String value) {
            addCriterion("OPTKEY >=", value, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptkeyLessThan(String value) {
            addCriterion("OPTKEY <", value, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptkeyLessThanOrEqualTo(String value) {
            addCriterion("OPTKEY <=", value, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptkeyLike(String value) {
            addCriterion("OPTKEY like", value, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptkeyNotLike(String value) {
            addCriterion("OPTKEY not like", value, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptkeyIn(List<String> values) {
            addCriterion("OPTKEY in", values, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptkeyNotIn(List<String> values) {
            addCriterion("OPTKEY not in", values, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptkeyBetween(String value1, String value2) {
            addCriterion("OPTKEY between", value1, value2, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptkeyNotBetween(String value1, String value2) {
            addCriterion("OPTKEY not between", value1, value2, "optkey");
            return (Criteria) this;
        }

        public Criteria andOptnameIsNull() {
            addCriterion("OPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andOptnameIsNotNull() {
            addCriterion("OPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOptnameEqualTo(String value) {
            addCriterion("OPTNAME =", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotEqualTo(String value) {
            addCriterion("OPTNAME <>", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameGreaterThan(String value) {
            addCriterion("OPTNAME >", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameGreaterThanOrEqualTo(String value) {
            addCriterion("OPTNAME >=", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLessThan(String value) {
            addCriterion("OPTNAME <", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLessThanOrEqualTo(String value) {
            addCriterion("OPTNAME <=", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLike(String value) {
            addCriterion("OPTNAME like", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotLike(String value) {
            addCriterion("OPTNAME not like", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameIn(List<String> values) {
            addCriterion("OPTNAME in", values, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotIn(List<String> values) {
            addCriterion("OPTNAME not in", values, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameBetween(String value1, String value2) {
            addCriterion("OPTNAME between", value1, value2, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotBetween(String value1, String value2) {
            addCriterion("OPTNAME not between", value1, value2, "optname");
            return (Criteria) this;
        }

        public Criteria andOpttypeIsNull() {
            addCriterion("OPTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpttypeIsNotNull() {
            addCriterion("OPTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpttypeEqualTo(String value) {
            addCriterion("OPTTYPE =", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotEqualTo(String value) {
            addCriterion("OPTTYPE <>", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeGreaterThan(String value) {
            addCriterion("OPTTYPE >", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPTTYPE >=", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLessThan(String value) {
            addCriterion("OPTTYPE <", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLessThanOrEqualTo(String value) {
            addCriterion("OPTTYPE <=", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLike(String value) {
            addCriterion("OPTTYPE like", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotLike(String value) {
            addCriterion("OPTTYPE not like", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeIn(List<String> values) {
            addCriterion("OPTTYPE in", values, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotIn(List<String> values) {
            addCriterion("OPTTYPE not in", values, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeBetween(String value1, String value2) {
            addCriterion("OPTTYPE between", value1, value2, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotBetween(String value1, String value2) {
            addCriterion("OPTTYPE not between", value1, value2, "opttype");
            return (Criteria) this;
        }

        public Criteria andOptvalueIsNull() {
            addCriterion("OPTVALUE is null");
            return (Criteria) this;
        }

        public Criteria andOptvalueIsNotNull() {
            addCriterion("OPTVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andOptvalueEqualTo(String value) {
            addCriterion("OPTVALUE =", value, "optvalue");
            return (Criteria) this;
        }

        public Criteria andOptvalueNotEqualTo(String value) {
            addCriterion("OPTVALUE <>", value, "optvalue");
            return (Criteria) this;
        }

        public Criteria andOptvalueGreaterThan(String value) {
            addCriterion("OPTVALUE >", value, "optvalue");
            return (Criteria) this;
        }

        public Criteria andOptvalueGreaterThanOrEqualTo(String value) {
            addCriterion("OPTVALUE >=", value, "optvalue");
            return (Criteria) this;
        }

        public Criteria andOptvalueLessThan(String value) {
            addCriterion("OPTVALUE <", value, "optvalue");
            return (Criteria) this;
        }

        public Criteria andOptvalueLessThanOrEqualTo(String value) {
            addCriterion("OPTVALUE <=", value, "optvalue");
            return (Criteria) this;
        }

        public Criteria andOptvalueLike(String value) {
            addCriterion("OPTVALUE like", value, "optvalue");
            return (Criteria) this;
        }

        public Criteria andOptvalueNotLike(String value) {
            addCriterion("OPTVALUE not like", value, "optvalue");
            return (Criteria) this;
        }

        public Criteria andOptvalueIn(List<String> values) {
            addCriterion("OPTVALUE in", values, "optvalue");
            return (Criteria) this;
        }

        public Criteria andOptvalueNotIn(List<String> values) {
            addCriterion("OPTVALUE not in", values, "optvalue");
            return (Criteria) this;
        }

        public Criteria andOptvalueBetween(String value1, String value2) {
            addCriterion("OPTVALUE between", value1, value2, "optvalue");
            return (Criteria) this;
        }

        public Criteria andOptvalueNotBetween(String value1, String value2) {
            addCriterion("OPTVALUE not between", value1, value2, "optvalue");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNull() {
            addCriterion("VCHAR1 is null");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNotNull() {
            addCriterion("VCHAR1 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar1EqualTo(String value) {
            addCriterion("VCHAR1 =", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotEqualTo(String value) {
            addCriterion("VCHAR1 <>", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThan(String value) {
            addCriterion("VCHAR1 >", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR1 >=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThan(String value) {
            addCriterion("VCHAR1 <", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThanOrEqualTo(String value) {
            addCriterion("VCHAR1 <=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Like(String value) {
            addCriterion("VCHAR1 like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotLike(String value) {
            addCriterion("VCHAR1 not like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1In(List<String> values) {
            addCriterion("VCHAR1 in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotIn(List<String> values) {
            addCriterion("VCHAR1 not in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Between(String value1, String value2) {
            addCriterion("VCHAR1 between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotBetween(String value1, String value2) {
            addCriterion("VCHAR1 not between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNull() {
            addCriterion("VCHAR2 is null");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNotNull() {
            addCriterion("VCHAR2 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar2EqualTo(String value) {
            addCriterion("VCHAR2 =", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotEqualTo(String value) {
            addCriterion("VCHAR2 <>", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThan(String value) {
            addCriterion("VCHAR2 >", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR2 >=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThan(String value) {
            addCriterion("VCHAR2 <", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThanOrEqualTo(String value) {
            addCriterion("VCHAR2 <=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Like(String value) {
            addCriterion("VCHAR2 like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotLike(String value) {
            addCriterion("VCHAR2 not like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2In(List<String> values) {
            addCriterion("VCHAR2 in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotIn(List<String> values) {
            addCriterion("VCHAR2 not in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Between(String value1, String value2) {
            addCriterion("VCHAR2 between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotBetween(String value1, String value2) {
            addCriterion("VCHAR2 not between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNull() {
            addCriterion("VCHAR3 is null");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNotNull() {
            addCriterion("VCHAR3 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar3EqualTo(String value) {
            addCriterion("VCHAR3 =", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotEqualTo(String value) {
            addCriterion("VCHAR3 <>", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThan(String value) {
            addCriterion("VCHAR3 >", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR3 >=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThan(String value) {
            addCriterion("VCHAR3 <", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThanOrEqualTo(String value) {
            addCriterion("VCHAR3 <=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Like(String value) {
            addCriterion("VCHAR3 like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotLike(String value) {
            addCriterion("VCHAR3 not like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3In(List<String> values) {
            addCriterion("VCHAR3 in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotIn(List<String> values) {
            addCriterion("VCHAR3 not in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Between(String value1, String value2) {
            addCriterion("VCHAR3 between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotBetween(String value1, String value2) {
            addCriterion("VCHAR3 not between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNull() {
            addCriterion("VCHAR4 is null");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNotNull() {
            addCriterion("VCHAR4 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar4EqualTo(String value) {
            addCriterion("VCHAR4 =", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotEqualTo(String value) {
            addCriterion("VCHAR4 <>", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThan(String value) {
            addCriterion("VCHAR4 >", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR4 >=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThan(String value) {
            addCriterion("VCHAR4 <", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThanOrEqualTo(String value) {
            addCriterion("VCHAR4 <=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Like(String value) {
            addCriterion("VCHAR4 like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotLike(String value) {
            addCriterion("VCHAR4 not like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4In(List<String> values) {
            addCriterion("VCHAR4 in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotIn(List<String> values) {
            addCriterion("VCHAR4 not in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Between(String value1, String value2) {
            addCriterion("VCHAR4 between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotBetween(String value1, String value2) {
            addCriterion("VCHAR4 not between", value1, value2, "vchar4");
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