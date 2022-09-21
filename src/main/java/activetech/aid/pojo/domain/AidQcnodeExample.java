package activetech.aid.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class AidQcnodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AidQcnodeExample() {
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

        public Criteria andNodeidIsNull() {
            addCriterion("NODEID is null");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNotNull() {
            addCriterion("NODEID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeidEqualTo(String value) {
            addCriterion("NODEID =", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotEqualTo(String value) {
            addCriterion("NODEID <>", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThan(String value) {
            addCriterion("NODEID >", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThanOrEqualTo(String value) {
            addCriterion("NODEID >=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThan(String value) {
            addCriterion("NODEID <", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThanOrEqualTo(String value) {
            addCriterion("NODEID <=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLike(String value) {
            addCriterion("NODEID like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotLike(String value) {
            addCriterion("NODEID not like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidIn(List<String> values) {
            addCriterion("NODEID in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotIn(List<String> values) {
            addCriterion("NODEID not in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidBetween(String value1, String value2) {
            addCriterion("NODEID between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotBetween(String value1, String value2) {
            addCriterion("NODEID not between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodetypeIsNull() {
            addCriterion("NODETYPE is null");
            return (Criteria) this;
        }

        public Criteria andNodetypeIsNotNull() {
            addCriterion("NODETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNodetypeEqualTo(String value) {
            addCriterion("NODETYPE =", value, "nodetype");
            return (Criteria) this;
        }

        public Criteria andNodetypeNotEqualTo(String value) {
            addCriterion("NODETYPE <>", value, "nodetype");
            return (Criteria) this;
        }

        public Criteria andNodetypeGreaterThan(String value) {
            addCriterion("NODETYPE >", value, "nodetype");
            return (Criteria) this;
        }

        public Criteria andNodetypeGreaterThanOrEqualTo(String value) {
            addCriterion("NODETYPE >=", value, "nodetype");
            return (Criteria) this;
        }

        public Criteria andNodetypeLessThan(String value) {
            addCriterion("NODETYPE <", value, "nodetype");
            return (Criteria) this;
        }

        public Criteria andNodetypeLessThanOrEqualTo(String value) {
            addCriterion("NODETYPE <=", value, "nodetype");
            return (Criteria) this;
        }

        public Criteria andNodetypeLike(String value) {
            addCriterion("NODETYPE like", value, "nodetype");
            return (Criteria) this;
        }

        public Criteria andNodetypeNotLike(String value) {
            addCriterion("NODETYPE not like", value, "nodetype");
            return (Criteria) this;
        }

        public Criteria andNodetypeIn(List<String> values) {
            addCriterion("NODETYPE in", values, "nodetype");
            return (Criteria) this;
        }

        public Criteria andNodetypeNotIn(List<String> values) {
            addCriterion("NODETYPE not in", values, "nodetype");
            return (Criteria) this;
        }

        public Criteria andNodetypeBetween(String value1, String value2) {
            addCriterion("NODETYPE between", value1, value2, "nodetype");
            return (Criteria) this;
        }

        public Criteria andNodetypeNotBetween(String value1, String value2) {
            addCriterion("NODETYPE not between", value1, value2, "nodetype");
            return (Criteria) this;
        }

        public Criteria andHeadnodeIsNull() {
            addCriterion("HEADNODE is null");
            return (Criteria) this;
        }

        public Criteria andHeadnodeIsNotNull() {
            addCriterion("HEADNODE is not null");
            return (Criteria) this;
        }

        public Criteria andHeadnodeEqualTo(String value) {
            addCriterion("HEADNODE =", value, "headnode");
            return (Criteria) this;
        }

        public Criteria andHeadnodeNotEqualTo(String value) {
            addCriterion("HEADNODE <>", value, "headnode");
            return (Criteria) this;
        }

        public Criteria andHeadnodeGreaterThan(String value) {
            addCriterion("HEADNODE >", value, "headnode");
            return (Criteria) this;
        }

        public Criteria andHeadnodeGreaterThanOrEqualTo(String value) {
            addCriterion("HEADNODE >=", value, "headnode");
            return (Criteria) this;
        }

        public Criteria andHeadnodeLessThan(String value) {
            addCriterion("HEADNODE <", value, "headnode");
            return (Criteria) this;
        }

        public Criteria andHeadnodeLessThanOrEqualTo(String value) {
            addCriterion("HEADNODE <=", value, "headnode");
            return (Criteria) this;
        }

        public Criteria andHeadnodeLike(String value) {
            addCriterion("HEADNODE like", value, "headnode");
            return (Criteria) this;
        }

        public Criteria andHeadnodeNotLike(String value) {
            addCriterion("HEADNODE not like", value, "headnode");
            return (Criteria) this;
        }

        public Criteria andHeadnodeIn(List<String> values) {
            addCriterion("HEADNODE in", values, "headnode");
            return (Criteria) this;
        }

        public Criteria andHeadnodeNotIn(List<String> values) {
            addCriterion("HEADNODE not in", values, "headnode");
            return (Criteria) this;
        }

        public Criteria andHeadnodeBetween(String value1, String value2) {
            addCriterion("HEADNODE between", value1, value2, "headnode");
            return (Criteria) this;
        }

        public Criteria andHeadnodeNotBetween(String value1, String value2) {
            addCriterion("HEADNODE not between", value1, value2, "headnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeIsNull() {
            addCriterion("TAILNODE is null");
            return (Criteria) this;
        }

        public Criteria andTailnodeIsNotNull() {
            addCriterion("TAILNODE is not null");
            return (Criteria) this;
        }

        public Criteria andTailnodeEqualTo(String value) {
            addCriterion("TAILNODE =", value, "tailnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeNotEqualTo(String value) {
            addCriterion("TAILNODE <>", value, "tailnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeGreaterThan(String value) {
            addCriterion("TAILNODE >", value, "tailnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAILNODE >=", value, "tailnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeLessThan(String value) {
            addCriterion("TAILNODE <", value, "tailnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeLessThanOrEqualTo(String value) {
            addCriterion("TAILNODE <=", value, "tailnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeLike(String value) {
            addCriterion("TAILNODE like", value, "tailnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeNotLike(String value) {
            addCriterion("TAILNODE not like", value, "tailnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeIn(List<String> values) {
            addCriterion("TAILNODE in", values, "tailnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeNotIn(List<String> values) {
            addCriterion("TAILNODE not in", values, "tailnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeBetween(String value1, String value2) {
            addCriterion("TAILNODE between", value1, value2, "tailnode");
            return (Criteria) this;
        }

        public Criteria andTailnodeNotBetween(String value1, String value2) {
            addCriterion("TAILNODE not between", value1, value2, "tailnode");
            return (Criteria) this;
        }

        public Criteria andQcnumbIsNull() {
            addCriterion("QCNUMB is null");
            return (Criteria) this;
        }

        public Criteria andQcnumbIsNotNull() {
            addCriterion("QCNUMB is not null");
            return (Criteria) this;
        }

        public Criteria andQcnumbEqualTo(Long value) {
            addCriterion("QCNUMB =", value, "qcnumb");
            return (Criteria) this;
        }

        public Criteria andQcnumbNotEqualTo(Long value) {
            addCriterion("QCNUMB <>", value, "qcnumb");
            return (Criteria) this;
        }

        public Criteria andQcnumbGreaterThan(Long value) {
            addCriterion("QCNUMB >", value, "qcnumb");
            return (Criteria) this;
        }

        public Criteria andQcnumbGreaterThanOrEqualTo(Long value) {
            addCriterion("QCNUMB >=", value, "qcnumb");
            return (Criteria) this;
        }

        public Criteria andQcnumbLessThan(Long value) {
            addCriterion("QCNUMB <", value, "qcnumb");
            return (Criteria) this;
        }

        public Criteria andQcnumbLessThanOrEqualTo(Long value) {
            addCriterion("QCNUMB <=", value, "qcnumb");
            return (Criteria) this;
        }

        public Criteria andQcnumbIn(List<Long> values) {
            addCriterion("QCNUMB in", values, "qcnumb");
            return (Criteria) this;
        }

        public Criteria andQcnumbNotIn(List<Long> values) {
            addCriterion("QCNUMB not in", values, "qcnumb");
            return (Criteria) this;
        }

        public Criteria andQcnumbBetween(Long value1, Long value2) {
            addCriterion("QCNUMB between", value1, value2, "qcnumb");
            return (Criteria) this;
        }

        public Criteria andQcnumbNotBetween(Long value1, Long value2) {
            addCriterion("QCNUMB not between", value1, value2, "qcnumb");
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