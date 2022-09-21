package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspGlcsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspGlcsExample() {
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

        public Criteria andEmgSeqIsNull() {
            addCriterion("EMG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqIsNotNull() {
            addCriterion("EMG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqEqualTo(String value) {
            addCriterion("EMG_SEQ =", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotEqualTo(String value) {
            addCriterion("EMG_SEQ <>", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqGreaterThan(String value) {
            addCriterion("EMG_SEQ >", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ >=", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqLessThan(String value) {
            addCriterion("EMG_SEQ <", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqLessThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ <=", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqLike(String value) {
            addCriterion("EMG_SEQ like", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotLike(String value) {
            addCriterion("EMG_SEQ not like", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqIn(List<String> values) {
            addCriterion("EMG_SEQ in", values, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotIn(List<String> values) {
            addCriterion("EMG_SEQ not in", values, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqBetween(String value1, String value2) {
            addCriterion("EMG_SEQ between", value1, value2, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotBetween(String value1, String value2) {
            addCriterion("EMG_SEQ not between", value1, value2, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andJcglIsNull() {
            addCriterion("JCGL is null");
            return (Criteria) this;
        }

        public Criteria andJcglIsNotNull() {
            addCriterion("JCGL is not null");
            return (Criteria) this;
        }

        public Criteria andJcglEqualTo(String value) {
            addCriterion("JCGL =", value, "jcgl");
            return (Criteria) this;
        }

        public Criteria andJcglNotEqualTo(String value) {
            addCriterion("JCGL <>", value, "jcgl");
            return (Criteria) this;
        }

        public Criteria andJcglGreaterThan(String value) {
            addCriterion("JCGL >", value, "jcgl");
            return (Criteria) this;
        }

        public Criteria andJcglGreaterThanOrEqualTo(String value) {
            addCriterion("JCGL >=", value, "jcgl");
            return (Criteria) this;
        }

        public Criteria andJcglLessThan(String value) {
            addCriterion("JCGL <", value, "jcgl");
            return (Criteria) this;
        }

        public Criteria andJcglLessThanOrEqualTo(String value) {
            addCriterion("JCGL <=", value, "jcgl");
            return (Criteria) this;
        }

        public Criteria andJcglLike(String value) {
            addCriterion("JCGL like", value, "jcgl");
            return (Criteria) this;
        }

        public Criteria andJcglNotLike(String value) {
            addCriterion("JCGL not like", value, "jcgl");
            return (Criteria) this;
        }

        public Criteria andJcglIn(List<String> values) {
            addCriterion("JCGL in", values, "jcgl");
            return (Criteria) this;
        }

        public Criteria andJcglNotIn(List<String> values) {
            addCriterion("JCGL not in", values, "jcgl");
            return (Criteria) this;
        }

        public Criteria andJcglBetween(String value1, String value2) {
            addCriterion("JCGL between", value1, value2, "jcgl");
            return (Criteria) this;
        }

        public Criteria andJcglNotBetween(String value1, String value2) {
            addCriterion("JCGL not between", value1, value2, "jcgl");
            return (Criteria) this;
        }

        public Criteria andKqglIsNull() {
            addCriterion("KQGL is null");
            return (Criteria) this;
        }

        public Criteria andKqglIsNotNull() {
            addCriterion("KQGL is not null");
            return (Criteria) this;
        }

        public Criteria andKqglEqualTo(String value) {
            addCriterion("KQGL =", value, "kqgl");
            return (Criteria) this;
        }

        public Criteria andKqglNotEqualTo(String value) {
            addCriterion("KQGL <>", value, "kqgl");
            return (Criteria) this;
        }

        public Criteria andKqglGreaterThan(String value) {
            addCriterion("KQGL >", value, "kqgl");
            return (Criteria) this;
        }

        public Criteria andKqglGreaterThanOrEqualTo(String value) {
            addCriterion("KQGL >=", value, "kqgl");
            return (Criteria) this;
        }

        public Criteria andKqglLessThan(String value) {
            addCriterion("KQGL <", value, "kqgl");
            return (Criteria) this;
        }

        public Criteria andKqglLessThanOrEqualTo(String value) {
            addCriterion("KQGL <=", value, "kqgl");
            return (Criteria) this;
        }

        public Criteria andKqglLike(String value) {
            addCriterion("KQGL like", value, "kqgl");
            return (Criteria) this;
        }

        public Criteria andKqglNotLike(String value) {
            addCriterion("KQGL not like", value, "kqgl");
            return (Criteria) this;
        }

        public Criteria andKqglIn(List<String> values) {
            addCriterion("KQGL in", values, "kqgl");
            return (Criteria) this;
        }

        public Criteria andKqglNotIn(List<String> values) {
            addCriterion("KQGL not in", values, "kqgl");
            return (Criteria) this;
        }

        public Criteria andKqglBetween(String value1, String value2) {
            addCriterion("KQGL between", value1, value2, "kqgl");
            return (Criteria) this;
        }

        public Criteria andKqglNotBetween(String value1, String value2) {
            addCriterion("KQGL not between", value1, value2, "kqgl");
            return (Criteria) this;
        }

        public Criteria andFmglIsNull() {
            addCriterion("FMGL is null");
            return (Criteria) this;
        }

        public Criteria andFmglIsNotNull() {
            addCriterion("FMGL is not null");
            return (Criteria) this;
        }

        public Criteria andFmglEqualTo(String value) {
            addCriterion("FMGL =", value, "fmgl");
            return (Criteria) this;
        }

        public Criteria andFmglNotEqualTo(String value) {
            addCriterion("FMGL <>", value, "fmgl");
            return (Criteria) this;
        }

        public Criteria andFmglGreaterThan(String value) {
            addCriterion("FMGL >", value, "fmgl");
            return (Criteria) this;
        }

        public Criteria andFmglGreaterThanOrEqualTo(String value) {
            addCriterion("FMGL >=", value, "fmgl");
            return (Criteria) this;
        }

        public Criteria andFmglLessThan(String value) {
            addCriterion("FMGL <", value, "fmgl");
            return (Criteria) this;
        }

        public Criteria andFmglLessThanOrEqualTo(String value) {
            addCriterion("FMGL <=", value, "fmgl");
            return (Criteria) this;
        }

        public Criteria andFmglLike(String value) {
            addCriterion("FMGL like", value, "fmgl");
            return (Criteria) this;
        }

        public Criteria andFmglNotLike(String value) {
            addCriterion("FMGL not like", value, "fmgl");
            return (Criteria) this;
        }

        public Criteria andFmglIn(List<String> values) {
            addCriterion("FMGL in", values, "fmgl");
            return (Criteria) this;
        }

        public Criteria andFmglNotIn(List<String> values) {
            addCriterion("FMGL not in", values, "fmgl");
            return (Criteria) this;
        }

        public Criteria andFmglBetween(String value1, String value2) {
            addCriterion("FMGL between", value1, value2, "fmgl");
            return (Criteria) this;
        }

        public Criteria andFmglNotBetween(String value1, String value2) {
            addCriterion("FMGL not between", value1, value2, "fmgl");
            return (Criteria) this;
        }

        public Criteria andBhxglIsNull() {
            addCriterion("BHXGL is null");
            return (Criteria) this;
        }

        public Criteria andBhxglIsNotNull() {
            addCriterion("BHXGL is not null");
            return (Criteria) this;
        }

        public Criteria andBhxglEqualTo(String value) {
            addCriterion("BHXGL =", value, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andBhxglNotEqualTo(String value) {
            addCriterion("BHXGL <>", value, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andBhxglGreaterThan(String value) {
            addCriterion("BHXGL >", value, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andBhxglGreaterThanOrEqualTo(String value) {
            addCriterion("BHXGL >=", value, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andBhxglLessThan(String value) {
            addCriterion("BHXGL <", value, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andBhxglLessThanOrEqualTo(String value) {
            addCriterion("BHXGL <=", value, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andBhxglLike(String value) {
            addCriterion("BHXGL like", value, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andBhxglNotLike(String value) {
            addCriterion("BHXGL not like", value, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andBhxglIn(List<String> values) {
            addCriterion("BHXGL in", values, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andBhxglNotIn(List<String> values) {
            addCriterion("BHXGL not in", values, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andBhxglBetween(String value1, String value2) {
            addCriterion("BHXGL between", value1, value2, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andBhxglNotBetween(String value1, String value2) {
            addCriterion("BHXGL not between", value1, value2, "bhxgl");
            return (Criteria) this;
        }

        public Criteria andCrtdatIsNull() {
            addCriterion("CRTDAT is null");
            return (Criteria) this;
        }

        public Criteria andCrtdatIsNotNull() {
            addCriterion("CRTDAT is not null");
            return (Criteria) this;
        }

        public Criteria andCrtdatEqualTo(Date value) {
            addCriterion("CRTDAT =", value, "crtdat");
            return (Criteria) this;
        }

        public Criteria andCrtdatNotEqualTo(Date value) {
            addCriterion("CRTDAT <>", value, "crtdat");
            return (Criteria) this;
        }

        public Criteria andCrtdatGreaterThan(Date value) {
            addCriterion("CRTDAT >", value, "crtdat");
            return (Criteria) this;
        }

        public Criteria andCrtdatGreaterThanOrEqualTo(Date value) {
            addCriterion("CRTDAT >=", value, "crtdat");
            return (Criteria) this;
        }

        public Criteria andCrtdatLessThan(Date value) {
            addCriterion("CRTDAT <", value, "crtdat");
            return (Criteria) this;
        }

        public Criteria andCrtdatLessThanOrEqualTo(Date value) {
            addCriterion("CRTDAT <=", value, "crtdat");
            return (Criteria) this;
        }

        public Criteria andCrtdatIn(List<Date> values) {
            addCriterion("CRTDAT in", values, "crtdat");
            return (Criteria) this;
        }

        public Criteria andCrtdatNotIn(List<Date> values) {
            addCriterion("CRTDAT not in", values, "crtdat");
            return (Criteria) this;
        }

        public Criteria andCrtdatBetween(Date value1, Date value2) {
            addCriterion("CRTDAT between", value1, value2, "crtdat");
            return (Criteria) this;
        }

        public Criteria andCrtdatNotBetween(Date value1, Date value2) {
            addCriterion("CRTDAT not between", value1, value2, "crtdat");
            return (Criteria) this;
        }

        public Criteria andCrtnbrIsNull() {
            addCriterion("CRTNBR is null");
            return (Criteria) this;
        }

        public Criteria andCrtnbrIsNotNull() {
            addCriterion("CRTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtnbrEqualTo(String value) {
            addCriterion("CRTNBR =", value, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andCrtnbrNotEqualTo(String value) {
            addCriterion("CRTNBR <>", value, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andCrtnbrGreaterThan(String value) {
            addCriterion("CRTNBR >", value, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andCrtnbrGreaterThanOrEqualTo(String value) {
            addCriterion("CRTNBR >=", value, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andCrtnbrLessThan(String value) {
            addCriterion("CRTNBR <", value, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andCrtnbrLessThanOrEqualTo(String value) {
            addCriterion("CRTNBR <=", value, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andCrtnbrLike(String value) {
            addCriterion("CRTNBR like", value, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andCrtnbrNotLike(String value) {
            addCriterion("CRTNBR not like", value, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andCrtnbrIn(List<String> values) {
            addCriterion("CRTNBR in", values, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andCrtnbrNotIn(List<String> values) {
            addCriterion("CRTNBR not in", values, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andCrtnbrBetween(String value1, String value2) {
            addCriterion("CRTNBR between", value1, value2, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andCrtnbrNotBetween(String value1, String value2) {
            addCriterion("CRTNBR not between", value1, value2, "crtnbr");
            return (Criteria) this;
        }

        public Criteria andUpddatIsNull() {
            addCriterion("UPDDAT is null");
            return (Criteria) this;
        }

        public Criteria andUpddatIsNotNull() {
            addCriterion("UPDDAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpddatEqualTo(Date value) {
            addCriterion("UPDDAT =", value, "upddat");
            return (Criteria) this;
        }

        public Criteria andUpddatNotEqualTo(Date value) {
            addCriterion("UPDDAT <>", value, "upddat");
            return (Criteria) this;
        }

        public Criteria andUpddatGreaterThan(Date value) {
            addCriterion("UPDDAT >", value, "upddat");
            return (Criteria) this;
        }

        public Criteria andUpddatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDDAT >=", value, "upddat");
            return (Criteria) this;
        }

        public Criteria andUpddatLessThan(Date value) {
            addCriterion("UPDDAT <", value, "upddat");
            return (Criteria) this;
        }

        public Criteria andUpddatLessThanOrEqualTo(Date value) {
            addCriterion("UPDDAT <=", value, "upddat");
            return (Criteria) this;
        }

        public Criteria andUpddatIn(List<Date> values) {
            addCriterion("UPDDAT in", values, "upddat");
            return (Criteria) this;
        }

        public Criteria andUpddatNotIn(List<Date> values) {
            addCriterion("UPDDAT not in", values, "upddat");
            return (Criteria) this;
        }

        public Criteria andUpddatBetween(Date value1, Date value2) {
            addCriterion("UPDDAT between", value1, value2, "upddat");
            return (Criteria) this;
        }

        public Criteria andUpddatNotBetween(Date value1, Date value2) {
            addCriterion("UPDDAT not between", value1, value2, "upddat");
            return (Criteria) this;
        }

        public Criteria andUpdnbrIsNull() {
            addCriterion("UPDNBR is null");
            return (Criteria) this;
        }

        public Criteria andUpdnbrIsNotNull() {
            addCriterion("UPDNBR is not null");
            return (Criteria) this;
        }

        public Criteria andUpdnbrEqualTo(String value) {
            addCriterion("UPDNBR =", value, "updnbr");
            return (Criteria) this;
        }

        public Criteria andUpdnbrNotEqualTo(String value) {
            addCriterion("UPDNBR <>", value, "updnbr");
            return (Criteria) this;
        }

        public Criteria andUpdnbrGreaterThan(String value) {
            addCriterion("UPDNBR >", value, "updnbr");
            return (Criteria) this;
        }

        public Criteria andUpdnbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPDNBR >=", value, "updnbr");
            return (Criteria) this;
        }

        public Criteria andUpdnbrLessThan(String value) {
            addCriterion("UPDNBR <", value, "updnbr");
            return (Criteria) this;
        }

        public Criteria andUpdnbrLessThanOrEqualTo(String value) {
            addCriterion("UPDNBR <=", value, "updnbr");
            return (Criteria) this;
        }

        public Criteria andUpdnbrLike(String value) {
            addCriterion("UPDNBR like", value, "updnbr");
            return (Criteria) this;
        }

        public Criteria andUpdnbrNotLike(String value) {
            addCriterion("UPDNBR not like", value, "updnbr");
            return (Criteria) this;
        }

        public Criteria andUpdnbrIn(List<String> values) {
            addCriterion("UPDNBR in", values, "updnbr");
            return (Criteria) this;
        }

        public Criteria andUpdnbrNotIn(List<String> values) {
            addCriterion("UPDNBR not in", values, "updnbr");
            return (Criteria) this;
        }

        public Criteria andUpdnbrBetween(String value1, String value2) {
            addCriterion("UPDNBR between", value1, value2, "updnbr");
            return (Criteria) this;
        }

        public Criteria andUpdnbrNotBetween(String value1, String value2) {
            addCriterion("UPDNBR not between", value1, value2, "updnbr");
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