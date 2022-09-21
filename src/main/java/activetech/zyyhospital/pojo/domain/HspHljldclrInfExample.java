package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspHljldclrInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspHljldclrInfExample() {
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

        public Criteria andBqhiSeqIsNull() {
            addCriterion("BQHI_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqIsNotNull() {
            addCriterion("BQHI_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqEqualTo(String value) {
            addCriterion("BQHI_SEQ =", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqNotEqualTo(String value) {
            addCriterion("BQHI_SEQ <>", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqGreaterThan(String value) {
            addCriterion("BQHI_SEQ >", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqGreaterThanOrEqualTo(String value) {
            addCriterion("BQHI_SEQ >=", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqLessThan(String value) {
            addCriterion("BQHI_SEQ <", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqLessThanOrEqualTo(String value) {
            addCriterion("BQHI_SEQ <=", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqLike(String value) {
            addCriterion("BQHI_SEQ like", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqNotLike(String value) {
            addCriterion("BQHI_SEQ not like", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqIn(List<String> values) {
            addCriterion("BQHI_SEQ in", values, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqNotIn(List<String> values) {
            addCriterion("BQHI_SEQ not in", values, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqBetween(String value1, String value2) {
            addCriterion("BQHI_SEQ between", value1, value2, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqNotBetween(String value1, String value2) {
            addCriterion("BQHI_SEQ not between", value1, value2, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCrlnameIsNull() {
            addCriterion("CRLNAME is null");
            return (Criteria) this;
        }

        public Criteria andCrlnameIsNotNull() {
            addCriterion("CRLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCrlnameEqualTo(String value) {
            addCriterion("CRLNAME =", value, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrlnameNotEqualTo(String value) {
            addCriterion("CRLNAME <>", value, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrlnameGreaterThan(String value) {
            addCriterion("CRLNAME >", value, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrlnameGreaterThanOrEqualTo(String value) {
            addCriterion("CRLNAME >=", value, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrlnameLessThan(String value) {
            addCriterion("CRLNAME <", value, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrlnameLessThanOrEqualTo(String value) {
            addCriterion("CRLNAME <=", value, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrlnameLike(String value) {
            addCriterion("CRLNAME like", value, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrlnameNotLike(String value) {
            addCriterion("CRLNAME not like", value, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrlnameIn(List<String> values) {
            addCriterion("CRLNAME in", values, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrlnameNotIn(List<String> values) {
            addCriterion("CRLNAME not in", values, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrlnameBetween(String value1, String value2) {
            addCriterion("CRLNAME between", value1, value2, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrlnameNotBetween(String value1, String value2) {
            addCriterion("CRLNAME not between", value1, value2, "crlname");
            return (Criteria) this;
        }

        public Criteria andCrllIsNull() {
            addCriterion("CRLL is null");
            return (Criteria) this;
        }

        public Criteria andCrllIsNotNull() {
            addCriterion("CRLL is not null");
            return (Criteria) this;
        }

        public Criteria andCrllEqualTo(String value) {
            addCriterion("CRLL =", value, "crll");
            return (Criteria) this;
        }

        public Criteria andCrllNotEqualTo(String value) {
            addCriterion("CRLL <>", value, "crll");
            return (Criteria) this;
        }

        public Criteria andCrllGreaterThan(String value) {
            addCriterion("CRLL >", value, "crll");
            return (Criteria) this;
        }

        public Criteria andCrllGreaterThanOrEqualTo(String value) {
            addCriterion("CRLL >=", value, "crll");
            return (Criteria) this;
        }

        public Criteria andCrllLessThan(String value) {
            addCriterion("CRLL <", value, "crll");
            return (Criteria) this;
        }

        public Criteria andCrllLessThanOrEqualTo(String value) {
            addCriterion("CRLL <=", value, "crll");
            return (Criteria) this;
        }

        public Criteria andCrllLike(String value) {
            addCriterion("CRLL like", value, "crll");
            return (Criteria) this;
        }

        public Criteria andCrllNotLike(String value) {
            addCriterion("CRLL not like", value, "crll");
            return (Criteria) this;
        }

        public Criteria andCrllIn(List<String> values) {
            addCriterion("CRLL in", values, "crll");
            return (Criteria) this;
        }

        public Criteria andCrllNotIn(List<String> values) {
            addCriterion("CRLL not in", values, "crll");
            return (Criteria) this;
        }

        public Criteria andCrllBetween(String value1, String value2) {
            addCriterion("CRLL between", value1, value2, "crll");
            return (Criteria) this;
        }

        public Criteria andCrllNotBetween(String value1, String value2) {
            addCriterion("CRLL not between", value1, value2, "crll");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("OTHER is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("OTHER =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("OTHER <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("OTHER >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("OTHER <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("OTHER <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("OTHER like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("OTHER not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("OTHER in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("OTHER not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("OTHER between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("OTHER not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andXzIsNull() {
            addCriterion("XZ is null");
            return (Criteria) this;
        }

        public Criteria andXzIsNotNull() {
            addCriterion("XZ is not null");
            return (Criteria) this;
        }

        public Criteria andXzEqualTo(String value) {
            addCriterion("XZ =", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotEqualTo(String value) {
            addCriterion("XZ <>", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThan(String value) {
            addCriterion("XZ >", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThanOrEqualTo(String value) {
            addCriterion("XZ >=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThan(String value) {
            addCriterion("XZ <", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThanOrEqualTo(String value) {
            addCriterion("XZ <=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLike(String value) {
            addCriterion("XZ like", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotLike(String value) {
            addCriterion("XZ not like", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzIn(List<String> values) {
            addCriterion("XZ in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotIn(List<String> values) {
            addCriterion("XZ not in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzBetween(String value1, String value2) {
            addCriterion("XZ between", value1, value2, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotBetween(String value1, String value2) {
            addCriterion("XZ not between", value1, value2, "xz");
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