package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspFuvGrpInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspFuvGrpInfExample() {
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

        public Criteria andFgiSeqIsNull() {
            addCriterion("FGI_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFgiSeqIsNotNull() {
            addCriterion("FGI_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFgiSeqEqualTo(String value) {
            addCriterion("FGI_SEQ =", value, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFgiSeqNotEqualTo(String value) {
            addCriterion("FGI_SEQ <>", value, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFgiSeqGreaterThan(String value) {
            addCriterion("FGI_SEQ >", value, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFgiSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FGI_SEQ >=", value, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFgiSeqLessThan(String value) {
            addCriterion("FGI_SEQ <", value, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFgiSeqLessThanOrEqualTo(String value) {
            addCriterion("FGI_SEQ <=", value, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFgiSeqLike(String value) {
            addCriterion("FGI_SEQ like", value, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFgiSeqNotLike(String value) {
            addCriterion("FGI_SEQ not like", value, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFgiSeqIn(List<String> values) {
            addCriterion("FGI_SEQ in", values, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFgiSeqNotIn(List<String> values) {
            addCriterion("FGI_SEQ not in", values, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFgiSeqBetween(String value1, String value2) {
            addCriterion("FGI_SEQ between", value1, value2, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFgiSeqNotBetween(String value1, String value2) {
            addCriterion("FGI_SEQ not between", value1, value2, "fgiSeq");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodIsNull() {
            addCriterion("FUV_GRP_COD is null");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodIsNotNull() {
            addCriterion("FUV_GRP_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodEqualTo(String value) {
            addCriterion("FUV_GRP_COD =", value, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodNotEqualTo(String value) {
            addCriterion("FUV_GRP_COD <>", value, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodGreaterThan(String value) {
            addCriterion("FUV_GRP_COD >", value, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_GRP_COD >=", value, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodLessThan(String value) {
            addCriterion("FUV_GRP_COD <", value, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodLessThanOrEqualTo(String value) {
            addCriterion("FUV_GRP_COD <=", value, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodLike(String value) {
            addCriterion("FUV_GRP_COD like", value, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodNotLike(String value) {
            addCriterion("FUV_GRP_COD not like", value, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodIn(List<String> values) {
            addCriterion("FUV_GRP_COD in", values, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodNotIn(List<String> values) {
            addCriterion("FUV_GRP_COD not in", values, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodBetween(String value1, String value2) {
            addCriterion("FUV_GRP_COD between", value1, value2, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpCodNotBetween(String value1, String value2) {
            addCriterion("FUV_GRP_COD not between", value1, value2, "fuvGrpCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamIsNull() {
            addCriterion("FUV_GRP_NAM is null");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamIsNotNull() {
            addCriterion("FUV_GRP_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamEqualTo(String value) {
            addCriterion("FUV_GRP_NAM =", value, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamNotEqualTo(String value) {
            addCriterion("FUV_GRP_NAM <>", value, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamGreaterThan(String value) {
            addCriterion("FUV_GRP_NAM >", value, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_GRP_NAM >=", value, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamLessThan(String value) {
            addCriterion("FUV_GRP_NAM <", value, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamLessThanOrEqualTo(String value) {
            addCriterion("FUV_GRP_NAM <=", value, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamLike(String value) {
            addCriterion("FUV_GRP_NAM like", value, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamNotLike(String value) {
            addCriterion("FUV_GRP_NAM not like", value, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamIn(List<String> values) {
            addCriterion("FUV_GRP_NAM in", values, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamNotIn(List<String> values) {
            addCriterion("FUV_GRP_NAM not in", values, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamBetween(String value1, String value2) {
            addCriterion("FUV_GRP_NAM between", value1, value2, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNamNotBetween(String value1, String value2) {
            addCriterion("FUV_GRP_NAM not between", value1, value2, "fuvGrpNam");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodIsNull() {
            addCriterion("FUV_GRP_FST_COD is null");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodIsNotNull() {
            addCriterion("FUV_GRP_FST_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodEqualTo(String value) {
            addCriterion("FUV_GRP_FST_COD =", value, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodNotEqualTo(String value) {
            addCriterion("FUV_GRP_FST_COD <>", value, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodGreaterThan(String value) {
            addCriterion("FUV_GRP_FST_COD >", value, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_GRP_FST_COD >=", value, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodLessThan(String value) {
            addCriterion("FUV_GRP_FST_COD <", value, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodLessThanOrEqualTo(String value) {
            addCriterion("FUV_GRP_FST_COD <=", value, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodLike(String value) {
            addCriterion("FUV_GRP_FST_COD like", value, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodNotLike(String value) {
            addCriterion("FUV_GRP_FST_COD not like", value, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodIn(List<String> values) {
            addCriterion("FUV_GRP_FST_COD in", values, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodNotIn(List<String> values) {
            addCriterion("FUV_GRP_FST_COD not in", values, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodBetween(String value1, String value2) {
            addCriterion("FUV_GRP_FST_COD between", value1, value2, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andFuvGrpFstCodNotBetween(String value1, String value2) {
            addCriterion("FUV_GRP_FST_COD not between", value1, value2, "fuvGrpFstCod");
            return (Criteria) this;
        }

        public Criteria andCurStaIsNull() {
            addCriterion("CUR_STA is null");
            return (Criteria) this;
        }

        public Criteria andCurStaIsNotNull() {
            addCriterion("CUR_STA is not null");
            return (Criteria) this;
        }

        public Criteria andCurStaEqualTo(String value) {
            addCriterion("CUR_STA =", value, "curSta");
            return (Criteria) this;
        }

        public Criteria andCurStaNotEqualTo(String value) {
            addCriterion("CUR_STA <>", value, "curSta");
            return (Criteria) this;
        }

        public Criteria andCurStaGreaterThan(String value) {
            addCriterion("CUR_STA >", value, "curSta");
            return (Criteria) this;
        }

        public Criteria andCurStaGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_STA >=", value, "curSta");
            return (Criteria) this;
        }

        public Criteria andCurStaLessThan(String value) {
            addCriterion("CUR_STA <", value, "curSta");
            return (Criteria) this;
        }

        public Criteria andCurStaLessThanOrEqualTo(String value) {
            addCriterion("CUR_STA <=", value, "curSta");
            return (Criteria) this;
        }

        public Criteria andCurStaLike(String value) {
            addCriterion("CUR_STA like", value, "curSta");
            return (Criteria) this;
        }

        public Criteria andCurStaNotLike(String value) {
            addCriterion("CUR_STA not like", value, "curSta");
            return (Criteria) this;
        }

        public Criteria andCurStaIn(List<String> values) {
            addCriterion("CUR_STA in", values, "curSta");
            return (Criteria) this;
        }

        public Criteria andCurStaNotIn(List<String> values) {
            addCriterion("CUR_STA not in", values, "curSta");
            return (Criteria) this;
        }

        public Criteria andCurStaBetween(String value1, String value2) {
            addCriterion("CUR_STA between", value1, value2, "curSta");
            return (Criteria) this;
        }

        public Criteria andCurStaNotBetween(String value1, String value2) {
            addCriterion("CUR_STA not between", value1, value2, "curSta");
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