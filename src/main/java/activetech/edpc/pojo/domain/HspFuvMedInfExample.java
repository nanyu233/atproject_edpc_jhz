package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspFuvMedInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspFuvMedInfExample() {
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

        public Criteria andFmiSeqIsNull() {
            addCriterion("FMI_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFmiSeqIsNotNull() {
            addCriterion("FMI_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFmiSeqEqualTo(String value) {
            addCriterion("FMI_SEQ =", value, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andFmiSeqNotEqualTo(String value) {
            addCriterion("FMI_SEQ <>", value, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andFmiSeqGreaterThan(String value) {
            addCriterion("FMI_SEQ >", value, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andFmiSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FMI_SEQ >=", value, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andFmiSeqLessThan(String value) {
            addCriterion("FMI_SEQ <", value, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andFmiSeqLessThanOrEqualTo(String value) {
            addCriterion("FMI_SEQ <=", value, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andFmiSeqLike(String value) {
            addCriterion("FMI_SEQ like", value, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andFmiSeqNotLike(String value) {
            addCriterion("FMI_SEQ not like", value, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andFmiSeqIn(List<String> values) {
            addCriterion("FMI_SEQ in", values, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andFmiSeqNotIn(List<String> values) {
            addCriterion("FMI_SEQ not in", values, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andFmiSeqBetween(String value1, String value2) {
            addCriterion("FMI_SEQ between", value1, value2, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andFmiSeqNotBetween(String value1, String value2) {
            addCriterion("FMI_SEQ not between", value1, value2, "fmiSeq");
            return (Criteria) this;
        }

        public Criteria andMedNamIsNull() {
            addCriterion("MED_NAM is null");
            return (Criteria) this;
        }

        public Criteria andMedNamIsNotNull() {
            addCriterion("MED_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andMedNamEqualTo(String value) {
            addCriterion("MED_NAM =", value, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedNamNotEqualTo(String value) {
            addCriterion("MED_NAM <>", value, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedNamGreaterThan(String value) {
            addCriterion("MED_NAM >", value, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedNamGreaterThanOrEqualTo(String value) {
            addCriterion("MED_NAM >=", value, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedNamLessThan(String value) {
            addCriterion("MED_NAM <", value, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedNamLessThanOrEqualTo(String value) {
            addCriterion("MED_NAM <=", value, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedNamLike(String value) {
            addCriterion("MED_NAM like", value, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedNamNotLike(String value) {
            addCriterion("MED_NAM not like", value, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedNamIn(List<String> values) {
            addCriterion("MED_NAM in", values, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedNamNotIn(List<String> values) {
            addCriterion("MED_NAM not in", values, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedNamBetween(String value1, String value2) {
            addCriterion("MED_NAM between", value1, value2, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedNamNotBetween(String value1, String value2) {
            addCriterion("MED_NAM not between", value1, value2, "medNam");
            return (Criteria) this;
        }

        public Criteria andMedSpeIsNull() {
            addCriterion("MED_SPE is null");
            return (Criteria) this;
        }

        public Criteria andMedSpeIsNotNull() {
            addCriterion("MED_SPE is not null");
            return (Criteria) this;
        }

        public Criteria andMedSpeEqualTo(String value) {
            addCriterion("MED_SPE =", value, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedSpeNotEqualTo(String value) {
            addCriterion("MED_SPE <>", value, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedSpeGreaterThan(String value) {
            addCriterion("MED_SPE >", value, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedSpeGreaterThanOrEqualTo(String value) {
            addCriterion("MED_SPE >=", value, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedSpeLessThan(String value) {
            addCriterion("MED_SPE <", value, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedSpeLessThanOrEqualTo(String value) {
            addCriterion("MED_SPE <=", value, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedSpeLike(String value) {
            addCriterion("MED_SPE like", value, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedSpeNotLike(String value) {
            addCriterion("MED_SPE not like", value, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedSpeIn(List<String> values) {
            addCriterion("MED_SPE in", values, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedSpeNotIn(List<String> values) {
            addCriterion("MED_SPE not in", values, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedSpeBetween(String value1, String value2) {
            addCriterion("MED_SPE between", value1, value2, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedSpeNotBetween(String value1, String value2) {
            addCriterion("MED_SPE not between", value1, value2, "medSpe");
            return (Criteria) this;
        }

        public Criteria andMedQtyIsNull() {
            addCriterion("MED_QTY is null");
            return (Criteria) this;
        }

        public Criteria andMedQtyIsNotNull() {
            addCriterion("MED_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andMedQtyEqualTo(String value) {
            addCriterion("MED_QTY =", value, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedQtyNotEqualTo(String value) {
            addCriterion("MED_QTY <>", value, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedQtyGreaterThan(String value) {
            addCriterion("MED_QTY >", value, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedQtyGreaterThanOrEqualTo(String value) {
            addCriterion("MED_QTY >=", value, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedQtyLessThan(String value) {
            addCriterion("MED_QTY <", value, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedQtyLessThanOrEqualTo(String value) {
            addCriterion("MED_QTY <=", value, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedQtyLike(String value) {
            addCriterion("MED_QTY like", value, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedQtyNotLike(String value) {
            addCriterion("MED_QTY not like", value, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedQtyIn(List<String> values) {
            addCriterion("MED_QTY in", values, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedQtyNotIn(List<String> values) {
            addCriterion("MED_QTY not in", values, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedQtyBetween(String value1, String value2) {
            addCriterion("MED_QTY between", value1, value2, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedQtyNotBetween(String value1, String value2) {
            addCriterion("MED_QTY not between", value1, value2, "medQty");
            return (Criteria) this;
        }

        public Criteria andMedMtdIsNull() {
            addCriterion("MED_MTD is null");
            return (Criteria) this;
        }

        public Criteria andMedMtdIsNotNull() {
            addCriterion("MED_MTD is not null");
            return (Criteria) this;
        }

        public Criteria andMedMtdEqualTo(String value) {
            addCriterion("MED_MTD =", value, "medMtd");
            return (Criteria) this;
        }

        public Criteria andMedMtdNotEqualTo(String value) {
            addCriterion("MED_MTD <>", value, "medMtd");
            return (Criteria) this;
        }

        public Criteria andMedMtdGreaterThan(String value) {
            addCriterion("MED_MTD >", value, "medMtd");
            return (Criteria) this;
        }

        public Criteria andMedMtdGreaterThanOrEqualTo(String value) {
            addCriterion("MED_MTD >=", value, "medMtd");
            return (Criteria) this;
        }

        public Criteria andMedMtdLessThan(String value) {
            addCriterion("MED_MTD <", value, "medMtd");
            return (Criteria) this;
        }

        public Criteria andMedMtdLessThanOrEqualTo(String value) {
            addCriterion("MED_MTD <=", value, "medMtd");
            return (Criteria) this;
        }

        public Criteria andMedMtdLike(String value) {
            addCriterion("MED_MTD like", value, "medMtd");
            return (Criteria) this;
        }

        public Criteria andMedMtdNotLike(String value) {
            addCriterion("MED_MTD not like", value, "medMtd");
            return (Criteria) this;
        }

        public Criteria andMedMtdIn(List<String> values) {
            addCriterion("MED_MTD in", values, "medMtd");
            return (Criteria) this;
        }

        public Criteria andMedMtdNotIn(List<String> values) {
            addCriterion("MED_MTD not in", values, "medMtd");
            return (Criteria) this;
        }

        public Criteria andMedMtdBetween(String value1, String value2) {
            addCriterion("MED_MTD between", value1, value2, "medMtd");
            return (Criteria) this;
        }

        public Criteria andMedMtdNotBetween(String value1, String value2) {
            addCriterion("MED_MTD not between", value1, value2, "medMtd");
            return (Criteria) this;
        }

        public Criteria andFuvSeqIsNull() {
            addCriterion("FUV_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFuvSeqIsNotNull() {
            addCriterion("FUV_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFuvSeqEqualTo(String value) {
            addCriterion("FUV_SEQ =", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotEqualTo(String value) {
            addCriterion("FUV_SEQ <>", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqGreaterThan(String value) {
            addCriterion("FUV_SEQ >", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_SEQ >=", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqLessThan(String value) {
            addCriterion("FUV_SEQ <", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqLessThanOrEqualTo(String value) {
            addCriterion("FUV_SEQ <=", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqLike(String value) {
            addCriterion("FUV_SEQ like", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotLike(String value) {
            addCriterion("FUV_SEQ not like", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqIn(List<String> values) {
            addCriterion("FUV_SEQ in", values, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotIn(List<String> values) {
            addCriterion("FUV_SEQ not in", values, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqBetween(String value1, String value2) {
            addCriterion("FUV_SEQ between", value1, value2, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotBetween(String value1, String value2) {
            addCriterion("FUV_SEQ not between", value1, value2, "fuvSeq");
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