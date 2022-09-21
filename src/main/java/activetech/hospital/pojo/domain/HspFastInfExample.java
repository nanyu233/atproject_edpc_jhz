package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspFastInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspFastInfExample() {
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

        public Criteria andMtCodIsNull() {
            addCriterion("MT_COD is null");
            return (Criteria) this;
        }

        public Criteria andMtCodIsNotNull() {
            addCriterion("MT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMtCodEqualTo(String value) {
            addCriterion("MT_COD =", value, "mtCod");
            return (Criteria) this;
        }

        public Criteria andMtCodNotEqualTo(String value) {
            addCriterion("MT_COD <>", value, "mtCod");
            return (Criteria) this;
        }

        public Criteria andMtCodGreaterThan(String value) {
            addCriterion("MT_COD >", value, "mtCod");
            return (Criteria) this;
        }

        public Criteria andMtCodGreaterThanOrEqualTo(String value) {
            addCriterion("MT_COD >=", value, "mtCod");
            return (Criteria) this;
        }

        public Criteria andMtCodLessThan(String value) {
            addCriterion("MT_COD <", value, "mtCod");
            return (Criteria) this;
        }

        public Criteria andMtCodLessThanOrEqualTo(String value) {
            addCriterion("MT_COD <=", value, "mtCod");
            return (Criteria) this;
        }

        public Criteria andMtCodLike(String value) {
            addCriterion("MT_COD like", value, "mtCod");
            return (Criteria) this;
        }

        public Criteria andMtCodNotLike(String value) {
            addCriterion("MT_COD not like", value, "mtCod");
            return (Criteria) this;
        }

        public Criteria andMtCodIn(List<String> values) {
            addCriterion("MT_COD in", values, "mtCod");
            return (Criteria) this;
        }

        public Criteria andMtCodNotIn(List<String> values) {
            addCriterion("MT_COD not in", values, "mtCod");
            return (Criteria) this;
        }

        public Criteria andMtCodBetween(String value1, String value2) {
            addCriterion("MT_COD between", value1, value2, "mtCod");
            return (Criteria) this;
        }

        public Criteria andMtCodNotBetween(String value1, String value2) {
            addCriterion("MT_COD not between", value1, value2, "mtCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodIsNull() {
            addCriterion("SZTH_COD is null");
            return (Criteria) this;
        }

        public Criteria andSzthCodIsNotNull() {
            addCriterion("SZTH_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSzthCodEqualTo(String value) {
            addCriterion("SZTH_COD =", value, "szthCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodNotEqualTo(String value) {
            addCriterion("SZTH_COD <>", value, "szthCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodGreaterThan(String value) {
            addCriterion("SZTH_COD >", value, "szthCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodGreaterThanOrEqualTo(String value) {
            addCriterion("SZTH_COD >=", value, "szthCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodLessThan(String value) {
            addCriterion("SZTH_COD <", value, "szthCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodLessThanOrEqualTo(String value) {
            addCriterion("SZTH_COD <=", value, "szthCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodLike(String value) {
            addCriterion("SZTH_COD like", value, "szthCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodNotLike(String value) {
            addCriterion("SZTH_COD not like", value, "szthCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodIn(List<String> values) {
            addCriterion("SZTH_COD in", values, "szthCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodNotIn(List<String> values) {
            addCriterion("SZTH_COD not in", values, "szthCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodBetween(String value1, String value2) {
            addCriterion("SZTH_COD between", value1, value2, "szthCod");
            return (Criteria) this;
        }

        public Criteria andSzthCodNotBetween(String value1, String value2) {
            addCriterion("SZTH_COD not between", value1, value2, "szthCod");
            return (Criteria) this;
        }

        public Criteria andWlCodIsNull() {
            addCriterion("WL_COD is null");
            return (Criteria) this;
        }

        public Criteria andWlCodIsNotNull() {
            addCriterion("WL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andWlCodEqualTo(String value) {
            addCriterion("WL_COD =", value, "wlCod");
            return (Criteria) this;
        }

        public Criteria andWlCodNotEqualTo(String value) {
            addCriterion("WL_COD <>", value, "wlCod");
            return (Criteria) this;
        }

        public Criteria andWlCodGreaterThan(String value) {
            addCriterion("WL_COD >", value, "wlCod");
            return (Criteria) this;
        }

        public Criteria andWlCodGreaterThanOrEqualTo(String value) {
            addCriterion("WL_COD >=", value, "wlCod");
            return (Criteria) this;
        }

        public Criteria andWlCodLessThan(String value) {
            addCriterion("WL_COD <", value, "wlCod");
            return (Criteria) this;
        }

        public Criteria andWlCodLessThanOrEqualTo(String value) {
            addCriterion("WL_COD <=", value, "wlCod");
            return (Criteria) this;
        }

        public Criteria andWlCodLike(String value) {
            addCriterion("WL_COD like", value, "wlCod");
            return (Criteria) this;
        }

        public Criteria andWlCodNotLike(String value) {
            addCriterion("WL_COD not like", value, "wlCod");
            return (Criteria) this;
        }

        public Criteria andWlCodIn(List<String> values) {
            addCriterion("WL_COD in", values, "wlCod");
            return (Criteria) this;
        }

        public Criteria andWlCodNotIn(List<String> values) {
            addCriterion("WL_COD not in", values, "wlCod");
            return (Criteria) this;
        }

        public Criteria andWlCodBetween(String value1, String value2) {
            addCriterion("WL_COD between", value1, value2, "wlCod");
            return (Criteria) this;
        }

        public Criteria andWlCodNotBetween(String value1, String value2) {
            addCriterion("WL_COD not between", value1, value2, "wlCod");
            return (Criteria) this;
        }

        public Criteria andCzFlagIsNull() {
            addCriterion("CZ_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCzFlagIsNotNull() {
            addCriterion("CZ_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCzFlagEqualTo(String value) {
            addCriterion("CZ_FLAG =", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagNotEqualTo(String value) {
            addCriterion("CZ_FLAG <>", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagGreaterThan(String value) {
            addCriterion("CZ_FLAG >", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CZ_FLAG >=", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagLessThan(String value) {
            addCriterion("CZ_FLAG <", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagLessThanOrEqualTo(String value) {
            addCriterion("CZ_FLAG <=", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagLike(String value) {
            addCriterion("CZ_FLAG like", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagNotLike(String value) {
            addCriterion("CZ_FLAG not like", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagIn(List<String> values) {
            addCriterion("CZ_FLAG in", values, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagNotIn(List<String> values) {
            addCriterion("CZ_FLAG not in", values, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagBetween(String value1, String value2) {
            addCriterion("CZ_FLAG between", value1, value2, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagNotBetween(String value1, String value2) {
            addCriterion("CZ_FLAG not between", value1, value2, "czFlag");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatIsNull() {
            addCriterion("FASTCRT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatIsNotNull() {
            addCriterion("FASTCRT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatEqualTo(Date value) {
            addCriterion("FASTCRT_DAT =", value, "fastcrtDat");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatNotEqualTo(Date value) {
            addCriterion("FASTCRT_DAT <>", value, "fastcrtDat");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatGreaterThan(Date value) {
            addCriterion("FASTCRT_DAT >", value, "fastcrtDat");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("FASTCRT_DAT >=", value, "fastcrtDat");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatLessThan(Date value) {
            addCriterion("FASTCRT_DAT <", value, "fastcrtDat");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatLessThanOrEqualTo(Date value) {
            addCriterion("FASTCRT_DAT <=", value, "fastcrtDat");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatIn(List<Date> values) {
            addCriterion("FASTCRT_DAT in", values, "fastcrtDat");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatNotIn(List<Date> values) {
            addCriterion("FASTCRT_DAT not in", values, "fastcrtDat");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatBetween(Date value1, Date value2) {
            addCriterion("FASTCRT_DAT between", value1, value2, "fastcrtDat");
            return (Criteria) this;
        }

        public Criteria andFastcrtDatNotBetween(Date value1, Date value2) {
            addCriterion("FASTCRT_DAT not between", value1, value2, "fastcrtDat");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrIsNull() {
            addCriterion("FASTCRT_NBR is null");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrIsNotNull() {
            addCriterion("FASTCRT_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrEqualTo(String value) {
            addCriterion("FASTCRT_NBR =", value, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrNotEqualTo(String value) {
            addCriterion("FASTCRT_NBR <>", value, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrGreaterThan(String value) {
            addCriterion("FASTCRT_NBR >", value, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrGreaterThanOrEqualTo(String value) {
            addCriterion("FASTCRT_NBR >=", value, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrLessThan(String value) {
            addCriterion("FASTCRT_NBR <", value, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrLessThanOrEqualTo(String value) {
            addCriterion("FASTCRT_NBR <=", value, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrLike(String value) {
            addCriterion("FASTCRT_NBR like", value, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrNotLike(String value) {
            addCriterion("FASTCRT_NBR not like", value, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrIn(List<String> values) {
            addCriterion("FASTCRT_NBR in", values, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrNotIn(List<String> values) {
            addCriterion("FASTCRT_NBR not in", values, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrBetween(String value1, String value2) {
            addCriterion("FASTCRT_NBR between", value1, value2, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastcrtNbrNotBetween(String value1, String value2) {
            addCriterion("FASTCRT_NBR not between", value1, value2, "fastcrtNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdDatIsNull() {
            addCriterion("FASTUPD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andFastupdDatIsNotNull() {
            addCriterion("FASTUPD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andFastupdDatEqualTo(Date value) {
            addCriterion("FASTUPD_DAT =", value, "fastupdDat");
            return (Criteria) this;
        }

        public Criteria andFastupdDatNotEqualTo(Date value) {
            addCriterion("FASTUPD_DAT <>", value, "fastupdDat");
            return (Criteria) this;
        }

        public Criteria andFastupdDatGreaterThan(Date value) {
            addCriterion("FASTUPD_DAT >", value, "fastupdDat");
            return (Criteria) this;
        }

        public Criteria andFastupdDatGreaterThanOrEqualTo(Date value) {
            addCriterion("FASTUPD_DAT >=", value, "fastupdDat");
            return (Criteria) this;
        }

        public Criteria andFastupdDatLessThan(Date value) {
            addCriterion("FASTUPD_DAT <", value, "fastupdDat");
            return (Criteria) this;
        }

        public Criteria andFastupdDatLessThanOrEqualTo(Date value) {
            addCriterion("FASTUPD_DAT <=", value, "fastupdDat");
            return (Criteria) this;
        }

        public Criteria andFastupdDatIn(List<Date> values) {
            addCriterion("FASTUPD_DAT in", values, "fastupdDat");
            return (Criteria) this;
        }

        public Criteria andFastupdDatNotIn(List<Date> values) {
            addCriterion("FASTUPD_DAT not in", values, "fastupdDat");
            return (Criteria) this;
        }

        public Criteria andFastupdDatBetween(Date value1, Date value2) {
            addCriterion("FASTUPD_DAT between", value1, value2, "fastupdDat");
            return (Criteria) this;
        }

        public Criteria andFastupdDatNotBetween(Date value1, Date value2) {
            addCriterion("FASTUPD_DAT not between", value1, value2, "fastupdDat");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrIsNull() {
            addCriterion("FASTUPD_NBR is null");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrIsNotNull() {
            addCriterion("FASTUPD_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrEqualTo(String value) {
            addCriterion("FASTUPD_NBR =", value, "fastupdNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrNotEqualTo(String value) {
            addCriterion("FASTUPD_NBR <>", value, "fastupdNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrGreaterThan(String value) {
            addCriterion("FASTUPD_NBR >", value, "fastupdNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrGreaterThanOrEqualTo(String value) {
            addCriterion("FASTUPD_NBR >=", value, "fastupdNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrLessThan(String value) {
            addCriterion("FASTUPD_NBR <", value, "fastupdNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrLessThanOrEqualTo(String value) {
            addCriterion("FASTUPD_NBR <=", value, "fastupdNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrLike(String value) {
            addCriterion("FASTUPD_NBR like", value, "fastupdNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrNotLike(String value) {
            addCriterion("FASTUPD_NBR not like", value, "fastupdNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrIn(List<String> values) {
            addCriterion("FASTUPD_NBR in", values, "fastupdNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrNotIn(List<String> values) {
            addCriterion("FASTUPD_NBR not in", values, "fastupdNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrBetween(String value1, String value2) {
            addCriterion("FASTUPD_NBR between", value1, value2, "fastupdNbr");
            return (Criteria) this;
        }

        public Criteria andFastupdNbrNotBetween(String value1, String value2) {
            addCriterion("FASTUPD_NBR not between", value1, value2, "fastupdNbr");
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