package activetech.base.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspJbzdLzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJbzdLzExample() {
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

        public Criteria andJbbcIsNull() {
            addCriterion("JBBC is null");
            return (Criteria) this;
        }

        public Criteria andJbbcIsNotNull() {
            addCriterion("JBBC is not null");
            return (Criteria) this;
        }

        public Criteria andJbbcEqualTo(String value) {
            addCriterion("JBBC =", value, "jbbc");
            return (Criteria) this;
        }

        public Criteria andJbbcNotEqualTo(String value) {
            addCriterion("JBBC <>", value, "jbbc");
            return (Criteria) this;
        }

        public Criteria andJbbcGreaterThan(String value) {
            addCriterion("JBBC >", value, "jbbc");
            return (Criteria) this;
        }

        public Criteria andJbbcGreaterThanOrEqualTo(String value) {
            addCriterion("JBBC >=", value, "jbbc");
            return (Criteria) this;
        }

        public Criteria andJbbcLessThan(String value) {
            addCriterion("JBBC <", value, "jbbc");
            return (Criteria) this;
        }

        public Criteria andJbbcLessThanOrEqualTo(String value) {
            addCriterion("JBBC <=", value, "jbbc");
            return (Criteria) this;
        }

        public Criteria andJbbcLike(String value) {
            addCriterion("JBBC like", value, "jbbc");
            return (Criteria) this;
        }

        public Criteria andJbbcNotLike(String value) {
            addCriterion("JBBC not like", value, "jbbc");
            return (Criteria) this;
        }

        public Criteria andJbbcIn(List<String> values) {
            addCriterion("JBBC in", values, "jbbc");
            return (Criteria) this;
        }

        public Criteria andJbbcNotIn(List<String> values) {
            addCriterion("JBBC not in", values, "jbbc");
            return (Criteria) this;
        }

        public Criteria andJbbcBetween(String value1, String value2) {
            addCriterion("JBBC between", value1, value2, "jbbc");
            return (Criteria) this;
        }

        public Criteria andJbbcNotBetween(String value1, String value2) {
            addCriterion("JBBC not between", value1, value2, "jbbc");
            return (Criteria) this;
        }

        public Criteria andIcd10IsNull() {
            addCriterion("ICD10 is null");
            return (Criteria) this;
        }

        public Criteria andIcd10IsNotNull() {
            addCriterion("ICD10 is not null");
            return (Criteria) this;
        }

        public Criteria andIcd10EqualTo(String value) {
            addCriterion("ICD10 =", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotEqualTo(String value) {
            addCriterion("ICD10 <>", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10GreaterThan(String value) {
            addCriterion("ICD10 >", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10GreaterThanOrEqualTo(String value) {
            addCriterion("ICD10 >=", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10LessThan(String value) {
            addCriterion("ICD10 <", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10LessThanOrEqualTo(String value) {
            addCriterion("ICD10 <=", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10Like(String value) {
            addCriterion("ICD10 like", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotLike(String value) {
            addCriterion("ICD10 not like", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10In(List<String> values) {
            addCriterion("ICD10 in", values, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotIn(List<String> values) {
            addCriterion("ICD10 not in", values, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10Between(String value1, String value2) {
            addCriterion("ICD10 between", value1, value2, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotBetween(String value1, String value2) {
            addCriterion("ICD10 not between", value1, value2, "icd10");
            return (Criteria) this;
        }

        public Criteria andPysmIsNull() {
            addCriterion("PYSM is null");
            return (Criteria) this;
        }

        public Criteria andPysmIsNotNull() {
            addCriterion("PYSM is not null");
            return (Criteria) this;
        }

        public Criteria andPysmEqualTo(String value) {
            addCriterion("PYSM =", value, "pysm");
            return (Criteria) this;
        }

        public Criteria andPysmNotEqualTo(String value) {
            addCriterion("PYSM <>", value, "pysm");
            return (Criteria) this;
        }

        public Criteria andPysmGreaterThan(String value) {
            addCriterion("PYSM >", value, "pysm");
            return (Criteria) this;
        }

        public Criteria andPysmGreaterThanOrEqualTo(String value) {
            addCriterion("PYSM >=", value, "pysm");
            return (Criteria) this;
        }

        public Criteria andPysmLessThan(String value) {
            addCriterion("PYSM <", value, "pysm");
            return (Criteria) this;
        }

        public Criteria andPysmLessThanOrEqualTo(String value) {
            addCriterion("PYSM <=", value, "pysm");
            return (Criteria) this;
        }

        public Criteria andPysmLike(String value) {
            addCriterion("PYSM like", value, "pysm");
            return (Criteria) this;
        }

        public Criteria andPysmNotLike(String value) {
            addCriterion("PYSM not like", value, "pysm");
            return (Criteria) this;
        }

        public Criteria andPysmIn(List<String> values) {
            addCriterion("PYSM in", values, "pysm");
            return (Criteria) this;
        }

        public Criteria andPysmNotIn(List<String> values) {
            addCriterion("PYSM not in", values, "pysm");
            return (Criteria) this;
        }

        public Criteria andPysmBetween(String value1, String value2) {
            addCriterion("PYSM between", value1, value2, "pysm");
            return (Criteria) this;
        }

        public Criteria andPysmNotBetween(String value1, String value2) {
            addCriterion("PYSM not between", value1, value2, "pysm");
            return (Criteria) this;
        }

        public Criteria andSrm2IsNull() {
            addCriterion("SRM2 is null");
            return (Criteria) this;
        }

        public Criteria andSrm2IsNotNull() {
            addCriterion("SRM2 is not null");
            return (Criteria) this;
        }

        public Criteria andSrm2EqualTo(String value) {
            addCriterion("SRM2 =", value, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm2NotEqualTo(String value) {
            addCriterion("SRM2 <>", value, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm2GreaterThan(String value) {
            addCriterion("SRM2 >", value, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm2GreaterThanOrEqualTo(String value) {
            addCriterion("SRM2 >=", value, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm2LessThan(String value) {
            addCriterion("SRM2 <", value, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm2LessThanOrEqualTo(String value) {
            addCriterion("SRM2 <=", value, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm2Like(String value) {
            addCriterion("SRM2 like", value, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm2NotLike(String value) {
            addCriterion("SRM2 not like", value, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm2In(List<String> values) {
            addCriterion("SRM2 in", values, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm2NotIn(List<String> values) {
            addCriterion("SRM2 not in", values, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm2Between(String value1, String value2) {
            addCriterion("SRM2 between", value1, value2, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm2NotBetween(String value1, String value2) {
            addCriterion("SRM2 not between", value1, value2, "srm2");
            return (Criteria) this;
        }

        public Criteria andSrm3IsNull() {
            addCriterion("SRM3 is null");
            return (Criteria) this;
        }

        public Criteria andSrm3IsNotNull() {
            addCriterion("SRM3 is not null");
            return (Criteria) this;
        }

        public Criteria andSrm3EqualTo(String value) {
            addCriterion("SRM3 =", value, "srm3");
            return (Criteria) this;
        }

        public Criteria andSrm3NotEqualTo(String value) {
            addCriterion("SRM3 <>", value, "srm3");
            return (Criteria) this;
        }

        public Criteria andSrm3GreaterThan(String value) {
            addCriterion("SRM3 >", value, "srm3");
            return (Criteria) this;
        }

        public Criteria andSrm3GreaterThanOrEqualTo(String value) {
            addCriterion("SRM3 >=", value, "srm3");
            return (Criteria) this;
        }

        public Criteria andSrm3LessThan(String value) {
            addCriterion("SRM3 <", value, "srm3");
            return (Criteria) this;
        }

        public Criteria andSrm3LessThanOrEqualTo(String value) {
            addCriterion("SRM3 <=", value, "srm3");
            return (Criteria) this;
        }

        public Criteria andSrm3Like(String value) {
            addCriterion("SRM3 like", value, "srm3");
            return (Criteria) this;
        }

        public Criteria andSrm3NotLike(String value) {
            addCriterion("SRM3 not like", value, "srm3");
            return (Criteria) this;
        }

        public Criteria andSrm3In(List<String> values) {
            addCriterion("SRM3 in", values, "srm3");
            return (Criteria) this;
        }

        public Criteria andSrm3NotIn(List<String> values) {
            addCriterion("SRM3 not in", values, "srm3");
            return (Criteria) this;
        }

        public Criteria andSrm3Between(String value1, String value2) {
            addCriterion("SRM3 between", value1, value2, "srm3");
            return (Criteria) this;
        }

        public Criteria andSrm3NotBetween(String value1, String value2) {
            addCriterion("SRM3 not between", value1, value2, "srm3");
            return (Criteria) this;
        }

        public Criteria andJibingtypeIsNull() {
            addCriterion("JIBINGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andJibingtypeIsNotNull() {
            addCriterion("JIBINGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andJibingtypeEqualTo(String value) {
            addCriterion("JIBINGTYPE =", value, "jibingtype");
            return (Criteria) this;
        }

        public Criteria andJibingtypeNotEqualTo(String value) {
            addCriterion("JIBINGTYPE <>", value, "jibingtype");
            return (Criteria) this;
        }

        public Criteria andJibingtypeGreaterThan(String value) {
            addCriterion("JIBINGTYPE >", value, "jibingtype");
            return (Criteria) this;
        }

        public Criteria andJibingtypeGreaterThanOrEqualTo(String value) {
            addCriterion("JIBINGTYPE >=", value, "jibingtype");
            return (Criteria) this;
        }

        public Criteria andJibingtypeLessThan(String value) {
            addCriterion("JIBINGTYPE <", value, "jibingtype");
            return (Criteria) this;
        }

        public Criteria andJibingtypeLessThanOrEqualTo(String value) {
            addCriterion("JIBINGTYPE <=", value, "jibingtype");
            return (Criteria) this;
        }

        public Criteria andJibingtypeLike(String value) {
            addCriterion("JIBINGTYPE like", value, "jibingtype");
            return (Criteria) this;
        }

        public Criteria andJibingtypeNotLike(String value) {
            addCriterion("JIBINGTYPE not like", value, "jibingtype");
            return (Criteria) this;
        }

        public Criteria andJibingtypeIn(List<String> values) {
            addCriterion("JIBINGTYPE in", values, "jibingtype");
            return (Criteria) this;
        }

        public Criteria andJibingtypeNotIn(List<String> values) {
            addCriterion("JIBINGTYPE not in", values, "jibingtype");
            return (Criteria) this;
        }

        public Criteria andJibingtypeBetween(String value1, String value2) {
            addCriterion("JIBINGTYPE between", value1, value2, "jibingtype");
            return (Criteria) this;
        }

        public Criteria andJibingtypeNotBetween(String value1, String value2) {
            addCriterion("JIBINGTYPE not between", value1, value2, "jibingtype");
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