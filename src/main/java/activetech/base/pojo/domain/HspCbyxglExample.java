package activetech.base.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspCbyxglExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCbyxglExample() {
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

        public Criteria andCbyxIsNull() {
            addCriterion("CBYX is null");
            return (Criteria) this;
        }

        public Criteria andCbyxIsNotNull() {
            addCriterion("CBYX is not null");
            return (Criteria) this;
        }

        public Criteria andCbyxEqualTo(String value) {
            addCriterion("CBYX =", value, "cbyx");
            return (Criteria) this;
        }

        public Criteria andCbyxNotEqualTo(String value) {
            addCriterion("CBYX <>", value, "cbyx");
            return (Criteria) this;
        }

        public Criteria andCbyxGreaterThan(String value) {
            addCriterion("CBYX >", value, "cbyx");
            return (Criteria) this;
        }

        public Criteria andCbyxGreaterThanOrEqualTo(String value) {
            addCriterion("CBYX >=", value, "cbyx");
            return (Criteria) this;
        }

        public Criteria andCbyxLessThan(String value) {
            addCriterion("CBYX <", value, "cbyx");
            return (Criteria) this;
        }

        public Criteria andCbyxLessThanOrEqualTo(String value) {
            addCriterion("CBYX <=", value, "cbyx");
            return (Criteria) this;
        }

        public Criteria andCbyxLike(String value) {
            addCriterion("CBYX like", value, "cbyx");
            return (Criteria) this;
        }

        public Criteria andCbyxNotLike(String value) {
            addCriterion("CBYX not like", value, "cbyx");
            return (Criteria) this;
        }

        public Criteria andCbyxIn(List<String> values) {
            addCriterion("CBYX in", values, "cbyx");
            return (Criteria) this;
        }

        public Criteria andCbyxNotIn(List<String> values) {
            addCriterion("CBYX not in", values, "cbyx");
            return (Criteria) this;
        }

        public Criteria andCbyxBetween(String value1, String value2) {
            addCriterion("CBYX between", value1, value2, "cbyx");
            return (Criteria) this;
        }

        public Criteria andCbyxNotBetween(String value1, String value2) {
            addCriterion("CBYX not between", value1, value2, "cbyx");
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

        public Criteria andBrqxIsNull() {
            addCriterion("BRQX is null");
            return (Criteria) this;
        }

        public Criteria andBrqxIsNotNull() {
            addCriterion("BRQX is not null");
            return (Criteria) this;
        }

        public Criteria andBrqxEqualTo(String value) {
            addCriterion("BRQX =", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxNotEqualTo(String value) {
            addCriterion("BRQX <>", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxGreaterThan(String value) {
            addCriterion("BRQX >", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxGreaterThanOrEqualTo(String value) {
            addCriterion("BRQX >=", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxLessThan(String value) {
            addCriterion("BRQX <", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxLessThanOrEqualTo(String value) {
            addCriterion("BRQX <=", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxLike(String value) {
            addCriterion("BRQX like", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxNotLike(String value) {
            addCriterion("BRQX not like", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxIn(List<String> values) {
            addCriterion("BRQX in", values, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxNotIn(List<String> values) {
            addCriterion("BRQX not in", values, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxBetween(String value1, String value2) {
            addCriterion("BRQX between", value1, value2, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxNotBetween(String value1, String value2) {
            addCriterion("BRQX not between", value1, value2, "brqx");
            return (Criteria) this;
        }

        public Criteria andFzksIsNull() {
            addCriterion("FZKS is null");
            return (Criteria) this;
        }

        public Criteria andFzksIsNotNull() {
            addCriterion("FZKS is not null");
            return (Criteria) this;
        }

        public Criteria andFzksEqualTo(String value) {
            addCriterion("FZKS =", value, "fzks");
            return (Criteria) this;
        }

        public Criteria andFzksNotEqualTo(String value) {
            addCriterion("FZKS <>", value, "fzks");
            return (Criteria) this;
        }

        public Criteria andFzksGreaterThan(String value) {
            addCriterion("FZKS >", value, "fzks");
            return (Criteria) this;
        }

        public Criteria andFzksGreaterThanOrEqualTo(String value) {
            addCriterion("FZKS >=", value, "fzks");
            return (Criteria) this;
        }

        public Criteria andFzksLessThan(String value) {
            addCriterion("FZKS <", value, "fzks");
            return (Criteria) this;
        }

        public Criteria andFzksLessThanOrEqualTo(String value) {
            addCriterion("FZKS <=", value, "fzks");
            return (Criteria) this;
        }

        public Criteria andFzksLike(String value) {
            addCriterion("FZKS like", value, "fzks");
            return (Criteria) this;
        }

        public Criteria andFzksNotLike(String value) {
            addCriterion("FZKS not like", value, "fzks");
            return (Criteria) this;
        }

        public Criteria andFzksIn(List<String> values) {
            addCriterion("FZKS in", values, "fzks");
            return (Criteria) this;
        }

        public Criteria andFzksNotIn(List<String> values) {
            addCriterion("FZKS not in", values, "fzks");
            return (Criteria) this;
        }

        public Criteria andFzksBetween(String value1, String value2) {
            addCriterion("FZKS between", value1, value2, "fzks");
            return (Criteria) this;
        }

        public Criteria andFzksNotBetween(String value1, String value2) {
            addCriterion("FZKS not between", value1, value2, "fzks");
            return (Criteria) this;
        }

        public Criteria andYjdjIsNull() {
            addCriterion("YJDJ is null");
            return (Criteria) this;
        }

        public Criteria andYjdjIsNotNull() {
            addCriterion("YJDJ is not null");
            return (Criteria) this;
        }

        public Criteria andYjdjEqualTo(String value) {
            addCriterion("YJDJ =", value, "yjdj");
            return (Criteria) this;
        }

        public Criteria andYjdjNotEqualTo(String value) {
            addCriterion("YJDJ <>", value, "yjdj");
            return (Criteria) this;
        }

        public Criteria andYjdjGreaterThan(String value) {
            addCriterion("YJDJ >", value, "yjdj");
            return (Criteria) this;
        }

        public Criteria andYjdjGreaterThanOrEqualTo(String value) {
            addCriterion("YJDJ >=", value, "yjdj");
            return (Criteria) this;
        }

        public Criteria andYjdjLessThan(String value) {
            addCriterion("YJDJ <", value, "yjdj");
            return (Criteria) this;
        }

        public Criteria andYjdjLessThanOrEqualTo(String value) {
            addCriterion("YJDJ <=", value, "yjdj");
            return (Criteria) this;
        }

        public Criteria andYjdjLike(String value) {
            addCriterion("YJDJ like", value, "yjdj");
            return (Criteria) this;
        }

        public Criteria andYjdjNotLike(String value) {
            addCriterion("YJDJ not like", value, "yjdj");
            return (Criteria) this;
        }

        public Criteria andYjdjIn(List<String> values) {
            addCriterion("YJDJ in", values, "yjdj");
            return (Criteria) this;
        }

        public Criteria andYjdjNotIn(List<String> values) {
            addCriterion("YJDJ not in", values, "yjdj");
            return (Criteria) this;
        }

        public Criteria andYjdjBetween(String value1, String value2) {
            addCriterion("YJDJ between", value1, value2, "yjdj");
            return (Criteria) this;
        }

        public Criteria andYjdjNotBetween(String value1, String value2) {
            addCriterion("YJDJ not between", value1, value2, "yjdj");
            return (Criteria) this;
        }

        public Criteria andZbcsIsNull() {
            addCriterion("ZBCS is null");
            return (Criteria) this;
        }

        public Criteria andZbcsIsNotNull() {
            addCriterion("ZBCS is not null");
            return (Criteria) this;
        }

        public Criteria andZbcsEqualTo(String value) {
            addCriterion("ZBCS =", value, "zbcs");
            return (Criteria) this;
        }

        public Criteria andZbcsNotEqualTo(String value) {
            addCriterion("ZBCS <>", value, "zbcs");
            return (Criteria) this;
        }

        public Criteria andZbcsGreaterThan(String value) {
            addCriterion("ZBCS >", value, "zbcs");
            return (Criteria) this;
        }

        public Criteria andZbcsGreaterThanOrEqualTo(String value) {
            addCriterion("ZBCS >=", value, "zbcs");
            return (Criteria) this;
        }

        public Criteria andZbcsLessThan(String value) {
            addCriterion("ZBCS <", value, "zbcs");
            return (Criteria) this;
        }

        public Criteria andZbcsLessThanOrEqualTo(String value) {
            addCriterion("ZBCS <=", value, "zbcs");
            return (Criteria) this;
        }

        public Criteria andZbcsLike(String value) {
            addCriterion("ZBCS like", value, "zbcs");
            return (Criteria) this;
        }

        public Criteria andZbcsNotLike(String value) {
            addCriterion("ZBCS not like", value, "zbcs");
            return (Criteria) this;
        }

        public Criteria andZbcsIn(List<String> values) {
            addCriterion("ZBCS in", values, "zbcs");
            return (Criteria) this;
        }

        public Criteria andZbcsNotIn(List<String> values) {
            addCriterion("ZBCS not in", values, "zbcs");
            return (Criteria) this;
        }

        public Criteria andZbcsBetween(String value1, String value2) {
            addCriterion("ZBCS between", value1, value2, "zbcs");
            return (Criteria) this;
        }

        public Criteria andZbcsNotBetween(String value1, String value2) {
            addCriterion("ZBCS not between", value1, value2, "zbcs");
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