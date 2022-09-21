package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HspModelInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspModelInfExample() {
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

        public Criteria andModelSeqIsNull() {
            addCriterion("MODEL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andModelSeqIsNotNull() {
            addCriterion("MODEL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andModelSeqEqualTo(String value) {
            addCriterion("MODEL_SEQ =", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqNotEqualTo(String value) {
            addCriterion("MODEL_SEQ <>", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqGreaterThan(String value) {
            addCriterion("MODEL_SEQ >", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_SEQ >=", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqLessThan(String value) {
            addCriterion("MODEL_SEQ <", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqLessThanOrEqualTo(String value) {
            addCriterion("MODEL_SEQ <=", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqLike(String value) {
            addCriterion("MODEL_SEQ like", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqNotLike(String value) {
            addCriterion("MODEL_SEQ not like", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqIn(List<String> values) {
            addCriterion("MODEL_SEQ in", values, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqNotIn(List<String> values) {
            addCriterion("MODEL_SEQ not in", values, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqBetween(String value1, String value2) {
            addCriterion("MODEL_SEQ between", value1, value2, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqNotBetween(String value1, String value2) {
            addCriterion("MODEL_SEQ not between", value1, value2, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelNamIsNull() {
            addCriterion("MODEL_NAM is null");
            return (Criteria) this;
        }

        public Criteria andModelNamIsNotNull() {
            addCriterion("MODEL_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andModelNamEqualTo(String value) {
            addCriterion("MODEL_NAM =", value, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelNamNotEqualTo(String value) {
            addCriterion("MODEL_NAM <>", value, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelNamGreaterThan(String value) {
            addCriterion("MODEL_NAM >", value, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelNamGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_NAM >=", value, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelNamLessThan(String value) {
            addCriterion("MODEL_NAM <", value, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelNamLessThanOrEqualTo(String value) {
            addCriterion("MODEL_NAM <=", value, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelNamLike(String value) {
            addCriterion("MODEL_NAM like", value, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelNamNotLike(String value) {
            addCriterion("MODEL_NAM not like", value, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelNamIn(List<String> values) {
            addCriterion("MODEL_NAM in", values, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelNamNotIn(List<String> values) {
            addCriterion("MODEL_NAM not in", values, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelNamBetween(String value1, String value2) {
            addCriterion("MODEL_NAM between", value1, value2, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelNamNotBetween(String value1, String value2) {
            addCriterion("MODEL_NAM not between", value1, value2, "modelNam");
            return (Criteria) this;
        }

        public Criteria andModelSortIsNull() {
            addCriterion("MODEL_SORT is null");
            return (Criteria) this;
        }

        public Criteria andModelSortIsNotNull() {
            addCriterion("MODEL_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andModelSortEqualTo(BigDecimal value) {
            addCriterion("MODEL_SORT =", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortNotEqualTo(BigDecimal value) {
            addCriterion("MODEL_SORT <>", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortGreaterThan(BigDecimal value) {
            addCriterion("MODEL_SORT >", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MODEL_SORT >=", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortLessThan(BigDecimal value) {
            addCriterion("MODEL_SORT <", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MODEL_SORT <=", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortIn(List<BigDecimal> values) {
            addCriterion("MODEL_SORT in", values, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortNotIn(List<BigDecimal> values) {
            addCriterion("MODEL_SORT not in", values, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODEL_SORT between", value1, value2, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODEL_SORT not between", value1, value2, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelContentIsNull() {
            addCriterion("MODEL_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andModelContentIsNotNull() {
            addCriterion("MODEL_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andModelContentEqualTo(String value) {
            addCriterion("MODEL_CONTENT =", value, "modelContent");
            return (Criteria) this;
        }

        public Criteria andModelContentNotEqualTo(String value) {
            addCriterion("MODEL_CONTENT <>", value, "modelContent");
            return (Criteria) this;
        }

        public Criteria andModelContentGreaterThan(String value) {
            addCriterion("MODEL_CONTENT >", value, "modelContent");
            return (Criteria) this;
        }

        public Criteria andModelContentGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_CONTENT >=", value, "modelContent");
            return (Criteria) this;
        }

        public Criteria andModelContentLessThan(String value) {
            addCriterion("MODEL_CONTENT <", value, "modelContent");
            return (Criteria) this;
        }

        public Criteria andModelContentLessThanOrEqualTo(String value) {
            addCriterion("MODEL_CONTENT <=", value, "modelContent");
            return (Criteria) this;
        }

        public Criteria andModelContentLike(String value) {
            addCriterion("MODEL_CONTENT like", value, "modelContent");
            return (Criteria) this;
        }

        public Criteria andModelContentNotLike(String value) {
            addCriterion("MODEL_CONTENT not like", value, "modelContent");
            return (Criteria) this;
        }

        public Criteria andModelContentIn(List<String> values) {
            addCriterion("MODEL_CONTENT in", values, "modelContent");
            return (Criteria) this;
        }

        public Criteria andModelContentNotIn(List<String> values) {
            addCriterion("MODEL_CONTENT not in", values, "modelContent");
            return (Criteria) this;
        }

        public Criteria andModelContentBetween(String value1, String value2) {
            addCriterion("MODEL_CONTENT between", value1, value2, "modelContent");
            return (Criteria) this;
        }

        public Criteria andModelContentNotBetween(String value1, String value2) {
            addCriterion("MODEL_CONTENT not between", value1, value2, "modelContent");
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