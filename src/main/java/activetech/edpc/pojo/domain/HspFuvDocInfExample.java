package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspFuvDocInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspFuvDocInfExample() {
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

        public Criteria andFdiSeqIsNull() {
            addCriterion("FDI_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFdiSeqIsNotNull() {
            addCriterion("FDI_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFdiSeqEqualTo(String value) {
            addCriterion("FDI_SEQ =", value, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andFdiSeqNotEqualTo(String value) {
            addCriterion("FDI_SEQ <>", value, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andFdiSeqGreaterThan(String value) {
            addCriterion("FDI_SEQ >", value, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andFdiSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FDI_SEQ >=", value, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andFdiSeqLessThan(String value) {
            addCriterion("FDI_SEQ <", value, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andFdiSeqLessThanOrEqualTo(String value) {
            addCriterion("FDI_SEQ <=", value, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andFdiSeqLike(String value) {
            addCriterion("FDI_SEQ like", value, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andFdiSeqNotLike(String value) {
            addCriterion("FDI_SEQ not like", value, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andFdiSeqIn(List<String> values) {
            addCriterion("FDI_SEQ in", values, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andFdiSeqNotIn(List<String> values) {
            addCriterion("FDI_SEQ not in", values, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andFdiSeqBetween(String value1, String value2) {
            addCriterion("FDI_SEQ between", value1, value2, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andFdiSeqNotBetween(String value1, String value2) {
            addCriterion("FDI_SEQ not between", value1, value2, "fdiSeq");
            return (Criteria) this;
        }

        public Criteria andDocCodIsNull() {
            addCriterion("DOC_COD is null");
            return (Criteria) this;
        }

        public Criteria andDocCodIsNotNull() {
            addCriterion("DOC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andDocCodEqualTo(String value) {
            addCriterion("DOC_COD =", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodNotEqualTo(String value) {
            addCriterion("DOC_COD <>", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodGreaterThan(String value) {
            addCriterion("DOC_COD >", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_COD >=", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodLessThan(String value) {
            addCriterion("DOC_COD <", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodLessThanOrEqualTo(String value) {
            addCriterion("DOC_COD <=", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodLike(String value) {
            addCriterion("DOC_COD like", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodNotLike(String value) {
            addCriterion("DOC_COD not like", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodIn(List<String> values) {
            addCriterion("DOC_COD in", values, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodNotIn(List<String> values) {
            addCriterion("DOC_COD not in", values, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodBetween(String value1, String value2) {
            addCriterion("DOC_COD between", value1, value2, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodNotBetween(String value1, String value2) {
            addCriterion("DOC_COD not between", value1, value2, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocNamIsNull() {
            addCriterion("DOC_NAM is null");
            return (Criteria) this;
        }

        public Criteria andDocNamIsNotNull() {
            addCriterion("DOC_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andDocNamEqualTo(String value) {
            addCriterion("DOC_NAM =", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotEqualTo(String value) {
            addCriterion("DOC_NAM <>", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamGreaterThan(String value) {
            addCriterion("DOC_NAM >", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_NAM >=", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamLessThan(String value) {
            addCriterion("DOC_NAM <", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamLessThanOrEqualTo(String value) {
            addCriterion("DOC_NAM <=", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamLike(String value) {
            addCriterion("DOC_NAM like", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotLike(String value) {
            addCriterion("DOC_NAM not like", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamIn(List<String> values) {
            addCriterion("DOC_NAM in", values, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotIn(List<String> values) {
            addCriterion("DOC_NAM not in", values, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamBetween(String value1, String value2) {
            addCriterion("DOC_NAM between", value1, value2, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotBetween(String value1, String value2) {
            addCriterion("DOC_NAM not between", value1, value2, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocFstCodIsNull() {
            addCriterion("DOC_FST_COD is null");
            return (Criteria) this;
        }

        public Criteria andDocFstCodIsNotNull() {
            addCriterion("DOC_FST_COD is not null");
            return (Criteria) this;
        }

        public Criteria andDocFstCodEqualTo(String value) {
            addCriterion("DOC_FST_COD =", value, "docFstCod");
            return (Criteria) this;
        }

        public Criteria andDocFstCodNotEqualTo(String value) {
            addCriterion("DOC_FST_COD <>", value, "docFstCod");
            return (Criteria) this;
        }

        public Criteria andDocFstCodGreaterThan(String value) {
            addCriterion("DOC_FST_COD >", value, "docFstCod");
            return (Criteria) this;
        }

        public Criteria andDocFstCodGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_FST_COD >=", value, "docFstCod");
            return (Criteria) this;
        }

        public Criteria andDocFstCodLessThan(String value) {
            addCriterion("DOC_FST_COD <", value, "docFstCod");
            return (Criteria) this;
        }

        public Criteria andDocFstCodLessThanOrEqualTo(String value) {
            addCriterion("DOC_FST_COD <=", value, "docFstCod");
            return (Criteria) this;
        }

        public Criteria andDocFstCodLike(String value) {
            addCriterion("DOC_FST_COD like", value, "docFstCod");
            return (Criteria) this;
        }

        public Criteria andDocFstCodNotLike(String value) {
            addCriterion("DOC_FST_COD not like", value, "docFstCod");
            return (Criteria) this;
        }

        public Criteria andDocFstCodIn(List<String> values) {
            addCriterion("DOC_FST_COD in", values, "docFstCod");
            return (Criteria) this;
        }

        public Criteria andDocFstCodNotIn(List<String> values) {
            addCriterion("DOC_FST_COD not in", values, "docFstCod");
            return (Criteria) this;
        }

        public Criteria andDocFstCodBetween(String value1, String value2) {
            addCriterion("DOC_FST_COD between", value1, value2, "docFstCod");
            return (Criteria) this;
        }

        public Criteria andDocFstCodNotBetween(String value1, String value2) {
            addCriterion("DOC_FST_COD not between", value1, value2, "docFstCod");
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