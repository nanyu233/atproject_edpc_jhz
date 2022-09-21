package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspJjchqkInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJjchqkInfExample() {
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

        public Criteria andChqkIdIsNull() {
            addCriterion("CHQK_ID is null");
            return (Criteria) this;
        }

        public Criteria andChqkIdIsNotNull() {
            addCriterion("CHQK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChqkIdEqualTo(String value) {
            addCriterion("CHQK_ID =", value, "chqkId");
            return (Criteria) this;
        }

        public Criteria andChqkIdNotEqualTo(String value) {
            addCriterion("CHQK_ID <>", value, "chqkId");
            return (Criteria) this;
        }

        public Criteria andChqkIdGreaterThan(String value) {
            addCriterion("CHQK_ID >", value, "chqkId");
            return (Criteria) this;
        }

        public Criteria andChqkIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHQK_ID >=", value, "chqkId");
            return (Criteria) this;
        }

        public Criteria andChqkIdLessThan(String value) {
            addCriterion("CHQK_ID <", value, "chqkId");
            return (Criteria) this;
        }

        public Criteria andChqkIdLessThanOrEqualTo(String value) {
            addCriterion("CHQK_ID <=", value, "chqkId");
            return (Criteria) this;
        }

        public Criteria andChqkIdLike(String value) {
            addCriterion("CHQK_ID like", value, "chqkId");
            return (Criteria) this;
        }

        public Criteria andChqkIdNotLike(String value) {
            addCriterion("CHQK_ID not like", value, "chqkId");
            return (Criteria) this;
        }

        public Criteria andChqkIdIn(List<String> values) {
            addCriterion("CHQK_ID in", values, "chqkId");
            return (Criteria) this;
        }

        public Criteria andChqkIdNotIn(List<String> values) {
            addCriterion("CHQK_ID not in", values, "chqkId");
            return (Criteria) this;
        }

        public Criteria andChqkIdBetween(String value1, String value2) {
            addCriterion("CHQK_ID between", value1, value2, "chqkId");
            return (Criteria) this;
        }

        public Criteria andChqkIdNotBetween(String value1, String value2) {
            addCriterion("CHQK_ID not between", value1, value2, "chqkId");
            return (Criteria) this;
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

        public Criteria andJzcsIdIsNull() {
            addCriterion("JZCS_ID is null");
            return (Criteria) this;
        }

        public Criteria andJzcsIdIsNotNull() {
            addCriterion("JZCS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJzcsIdEqualTo(String value) {
            addCriterion("JZCS_ID =", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdNotEqualTo(String value) {
            addCriterion("JZCS_ID <>", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdGreaterThan(String value) {
            addCriterion("JZCS_ID >", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdGreaterThanOrEqualTo(String value) {
            addCriterion("JZCS_ID >=", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdLessThan(String value) {
            addCriterion("JZCS_ID <", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdLessThanOrEqualTo(String value) {
            addCriterion("JZCS_ID <=", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdLike(String value) {
            addCriterion("JZCS_ID like", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdNotLike(String value) {
            addCriterion("JZCS_ID not like", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdIn(List<String> values) {
            addCriterion("JZCS_ID in", values, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdNotIn(List<String> values) {
            addCriterion("JZCS_ID not in", values, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdBetween(String value1, String value2) {
            addCriterion("JZCS_ID between", value1, value2, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdNotBetween(String value1, String value2) {
            addCriterion("JZCS_ID not between", value1, value2, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andKsNamIsNull() {
            addCriterion("KS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andKsNamIsNotNull() {
            addCriterion("KS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andKsNamEqualTo(String value) {
            addCriterion("KS_NAM =", value, "ksNam");
            return (Criteria) this;
        }

        public Criteria andKsNamNotEqualTo(String value) {
            addCriterion("KS_NAM <>", value, "ksNam");
            return (Criteria) this;
        }

        public Criteria andKsNamGreaterThan(String value) {
            addCriterion("KS_NAM >", value, "ksNam");
            return (Criteria) this;
        }

        public Criteria andKsNamGreaterThanOrEqualTo(String value) {
            addCriterion("KS_NAM >=", value, "ksNam");
            return (Criteria) this;
        }

        public Criteria andKsNamLessThan(String value) {
            addCriterion("KS_NAM <", value, "ksNam");
            return (Criteria) this;
        }

        public Criteria andKsNamLessThanOrEqualTo(String value) {
            addCriterion("KS_NAM <=", value, "ksNam");
            return (Criteria) this;
        }

        public Criteria andKsNamLike(String value) {
            addCriterion("KS_NAM like", value, "ksNam");
            return (Criteria) this;
        }

        public Criteria andKsNamNotLike(String value) {
            addCriterion("KS_NAM not like", value, "ksNam");
            return (Criteria) this;
        }

        public Criteria andKsNamIn(List<String> values) {
            addCriterion("KS_NAM in", values, "ksNam");
            return (Criteria) this;
        }

        public Criteria andKsNamNotIn(List<String> values) {
            addCriterion("KS_NAM not in", values, "ksNam");
            return (Criteria) this;
        }

        public Criteria andKsNamBetween(String value1, String value2) {
            addCriterion("KS_NAM between", value1, value2, "ksNam");
            return (Criteria) this;
        }

        public Criteria andKsNamNotBetween(String value1, String value2) {
            addCriterion("KS_NAM not between", value1, value2, "ksNam");
            return (Criteria) this;
        }

        public Criteria andHjDatIsNull() {
            addCriterion("HJ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andHjDatIsNotNull() {
            addCriterion("HJ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andHjDatEqualTo(Date value) {
            addCriterion("HJ_DAT =", value, "hjDat");
            return (Criteria) this;
        }

        public Criteria andHjDatNotEqualTo(Date value) {
            addCriterion("HJ_DAT <>", value, "hjDat");
            return (Criteria) this;
        }

        public Criteria andHjDatGreaterThan(Date value) {
            addCriterion("HJ_DAT >", value, "hjDat");
            return (Criteria) this;
        }

        public Criteria andHjDatGreaterThanOrEqualTo(Date value) {
            addCriterion("HJ_DAT >=", value, "hjDat");
            return (Criteria) this;
        }

        public Criteria andHjDatLessThan(Date value) {
            addCriterion("HJ_DAT <", value, "hjDat");
            return (Criteria) this;
        }

        public Criteria andHjDatLessThanOrEqualTo(Date value) {
            addCriterion("HJ_DAT <=", value, "hjDat");
            return (Criteria) this;
        }

        public Criteria andHjDatIn(List<Date> values) {
            addCriterion("HJ_DAT in", values, "hjDat");
            return (Criteria) this;
        }

        public Criteria andHjDatNotIn(List<Date> values) {
            addCriterion("HJ_DAT not in", values, "hjDat");
            return (Criteria) this;
        }

        public Criteria andHjDatBetween(Date value1, Date value2) {
            addCriterion("HJ_DAT between", value1, value2, "hjDat");
            return (Criteria) this;
        }

        public Criteria andHjDatNotBetween(Date value1, Date value2) {
            addCriterion("HJ_DAT not between", value1, value2, "hjDat");
            return (Criteria) this;
        }

        public Criteria andDdDatIsNull() {
            addCriterion("DD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andDdDatIsNotNull() {
            addCriterion("DD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andDdDatEqualTo(Date value) {
            addCriterion("DD_DAT =", value, "ddDat");
            return (Criteria) this;
        }

        public Criteria andDdDatNotEqualTo(Date value) {
            addCriterion("DD_DAT <>", value, "ddDat");
            return (Criteria) this;
        }

        public Criteria andDdDatGreaterThan(Date value) {
            addCriterion("DD_DAT >", value, "ddDat");
            return (Criteria) this;
        }

        public Criteria andDdDatGreaterThanOrEqualTo(Date value) {
            addCriterion("DD_DAT >=", value, "ddDat");
            return (Criteria) this;
        }

        public Criteria andDdDatLessThan(Date value) {
            addCriterion("DD_DAT <", value, "ddDat");
            return (Criteria) this;
        }

        public Criteria andDdDatLessThanOrEqualTo(Date value) {
            addCriterion("DD_DAT <=", value, "ddDat");
            return (Criteria) this;
        }

        public Criteria andDdDatIn(List<Date> values) {
            addCriterion("DD_DAT in", values, "ddDat");
            return (Criteria) this;
        }

        public Criteria andDdDatNotIn(List<Date> values) {
            addCriterion("DD_DAT not in", values, "ddDat");
            return (Criteria) this;
        }

        public Criteria andDdDatBetween(Date value1, Date value2) {
            addCriterion("DD_DAT between", value1, value2, "ddDat");
            return (Criteria) this;
        }

        public Criteria andDdDatNotBetween(Date value1, Date value2) {
            addCriterion("DD_DAT not between", value1, value2, "ddDat");
            return (Criteria) this;
        }

        public Criteria andCallerNbrIsNull() {
            addCriterion("CALLER_NBR is null");
            return (Criteria) this;
        }

        public Criteria andCallerNbrIsNotNull() {
            addCriterion("CALLER_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andCallerNbrEqualTo(String value) {
            addCriterion("CALLER_NBR =", value, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNbrNotEqualTo(String value) {
            addCriterion("CALLER_NBR <>", value, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNbrGreaterThan(String value) {
            addCriterion("CALLER_NBR >", value, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CALLER_NBR >=", value, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNbrLessThan(String value) {
            addCriterion("CALLER_NBR <", value, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNbrLessThanOrEqualTo(String value) {
            addCriterion("CALLER_NBR <=", value, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNbrLike(String value) {
            addCriterion("CALLER_NBR like", value, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNbrNotLike(String value) {
            addCriterion("CALLER_NBR not like", value, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNbrIn(List<String> values) {
            addCriterion("CALLER_NBR in", values, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNbrNotIn(List<String> values) {
            addCriterion("CALLER_NBR not in", values, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNbrBetween(String value1, String value2) {
            addCriterion("CALLER_NBR between", value1, value2, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNbrNotBetween(String value1, String value2) {
            addCriterion("CALLER_NBR not between", value1, value2, "callerNbr");
            return (Criteria) this;
        }

        public Criteria andCallerNamIsNull() {
            addCriterion("CALLER_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCallerNamIsNotNull() {
            addCriterion("CALLER_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCallerNamEqualTo(String value) {
            addCriterion("CALLER_NAM =", value, "callerNam");
            return (Criteria) this;
        }

        public Criteria andCallerNamNotEqualTo(String value) {
            addCriterion("CALLER_NAM <>", value, "callerNam");
            return (Criteria) this;
        }

        public Criteria andCallerNamGreaterThan(String value) {
            addCriterion("CALLER_NAM >", value, "callerNam");
            return (Criteria) this;
        }

        public Criteria andCallerNamGreaterThanOrEqualTo(String value) {
            addCriterion("CALLER_NAM >=", value, "callerNam");
            return (Criteria) this;
        }

        public Criteria andCallerNamLessThan(String value) {
            addCriterion("CALLER_NAM <", value, "callerNam");
            return (Criteria) this;
        }

        public Criteria andCallerNamLessThanOrEqualTo(String value) {
            addCriterion("CALLER_NAM <=", value, "callerNam");
            return (Criteria) this;
        }

        public Criteria andCallerNamLike(String value) {
            addCriterion("CALLER_NAM like", value, "callerNam");
            return (Criteria) this;
        }

        public Criteria andCallerNamNotLike(String value) {
            addCriterion("CALLER_NAM not like", value, "callerNam");
            return (Criteria) this;
        }

        public Criteria andCallerNamIn(List<String> values) {
            addCriterion("CALLER_NAM in", values, "callerNam");
            return (Criteria) this;
        }

        public Criteria andCallerNamNotIn(List<String> values) {
            addCriterion("CALLER_NAM not in", values, "callerNam");
            return (Criteria) this;
        }

        public Criteria andCallerNamBetween(String value1, String value2) {
            addCriterion("CALLER_NAM between", value1, value2, "callerNam");
            return (Criteria) this;
        }

        public Criteria andCallerNamNotBetween(String value1, String value2) {
            addCriterion("CALLER_NAM not between", value1, value2, "callerNam");
            return (Criteria) this;
        }

        public Criteria andIndexNumIsNull() {
            addCriterion("INDEX_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIndexNumIsNotNull() {
            addCriterion("INDEX_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIndexNumEqualTo(String value) {
            addCriterion("INDEX_NUM =", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumNotEqualTo(String value) {
            addCriterion("INDEX_NUM <>", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumGreaterThan(String value) {
            addCriterion("INDEX_NUM >", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumGreaterThanOrEqualTo(String value) {
            addCriterion("INDEX_NUM >=", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumLessThan(String value) {
            addCriterion("INDEX_NUM <", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumLessThanOrEqualTo(String value) {
            addCriterion("INDEX_NUM <=", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumLike(String value) {
            addCriterion("INDEX_NUM like", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumNotLike(String value) {
            addCriterion("INDEX_NUM not like", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumIn(List<String> values) {
            addCriterion("INDEX_NUM in", values, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumNotIn(List<String> values) {
            addCriterion("INDEX_NUM not in", values, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumBetween(String value1, String value2) {
            addCriterion("INDEX_NUM between", value1, value2, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumNotBetween(String value1, String value2) {
            addCriterion("INDEX_NUM not between", value1, value2, "indexNum");
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