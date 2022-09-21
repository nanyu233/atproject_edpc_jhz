package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspJzpsInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJzpsInfExample() {
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

        public Criteria andJzpsIdIsNull() {
            addCriterion("JZPS_ID is null");
            return (Criteria) this;
        }

        public Criteria andJzpsIdIsNotNull() {
            addCriterion("JZPS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJzpsIdEqualTo(String value) {
            addCriterion("JZPS_ID =", value, "jzpsId");
            return (Criteria) this;
        }

        public Criteria andJzpsIdNotEqualTo(String value) {
            addCriterion("JZPS_ID <>", value, "jzpsId");
            return (Criteria) this;
        }

        public Criteria andJzpsIdGreaterThan(String value) {
            addCriterion("JZPS_ID >", value, "jzpsId");
            return (Criteria) this;
        }

        public Criteria andJzpsIdGreaterThanOrEqualTo(String value) {
            addCriterion("JZPS_ID >=", value, "jzpsId");
            return (Criteria) this;
        }

        public Criteria andJzpsIdLessThan(String value) {
            addCriterion("JZPS_ID <", value, "jzpsId");
            return (Criteria) this;
        }

        public Criteria andJzpsIdLessThanOrEqualTo(String value) {
            addCriterion("JZPS_ID <=", value, "jzpsId");
            return (Criteria) this;
        }

        public Criteria andJzpsIdLike(String value) {
            addCriterion("JZPS_ID like", value, "jzpsId");
            return (Criteria) this;
        }

        public Criteria andJzpsIdNotLike(String value) {
            addCriterion("JZPS_ID not like", value, "jzpsId");
            return (Criteria) this;
        }

        public Criteria andJzpsIdIn(List<String> values) {
            addCriterion("JZPS_ID in", values, "jzpsId");
            return (Criteria) this;
        }

        public Criteria andJzpsIdNotIn(List<String> values) {
            addCriterion("JZPS_ID not in", values, "jzpsId");
            return (Criteria) this;
        }

        public Criteria andJzpsIdBetween(String value1, String value2) {
            addCriterion("JZPS_ID between", value1, value2, "jzpsId");
            return (Criteria) this;
        }

        public Criteria andJzpsIdNotBetween(String value1, String value2) {
            addCriterion("JZPS_ID not between", value1, value2, "jzpsId");
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

        public Criteria andZsDatIsNull() {
            addCriterion("ZS_DAT is null");
            return (Criteria) this;
        }

        public Criteria andZsDatIsNotNull() {
            addCriterion("ZS_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andZsDatEqualTo(Date value) {
            addCriterion("ZS_DAT =", value, "zsDat");
            return (Criteria) this;
        }

        public Criteria andZsDatNotEqualTo(Date value) {
            addCriterion("ZS_DAT <>", value, "zsDat");
            return (Criteria) this;
        }

        public Criteria andZsDatGreaterThan(Date value) {
            addCriterion("ZS_DAT >", value, "zsDat");
            return (Criteria) this;
        }

        public Criteria andZsDatGreaterThanOrEqualTo(Date value) {
            addCriterion("ZS_DAT >=", value, "zsDat");
            return (Criteria) this;
        }

        public Criteria andZsDatLessThan(Date value) {
            addCriterion("ZS_DAT <", value, "zsDat");
            return (Criteria) this;
        }

        public Criteria andZsDatLessThanOrEqualTo(Date value) {
            addCriterion("ZS_DAT <=", value, "zsDat");
            return (Criteria) this;
        }

        public Criteria andZsDatIn(List<Date> values) {
            addCriterion("ZS_DAT in", values, "zsDat");
            return (Criteria) this;
        }

        public Criteria andZsDatNotIn(List<Date> values) {
            addCriterion("ZS_DAT not in", values, "zsDat");
            return (Criteria) this;
        }

        public Criteria andZsDatBetween(Date value1, Date value2) {
            addCriterion("ZS_DAT between", value1, value2, "zsDat");
            return (Criteria) this;
        }

        public Criteria andZsDatNotBetween(Date value1, Date value2) {
            addCriterion("ZS_DAT not between", value1, value2, "zsDat");
            return (Criteria) this;
        }

        public Criteria andJgDatIsNull() {
            addCriterion("JG_DAT is null");
            return (Criteria) this;
        }

        public Criteria andJgDatIsNotNull() {
            addCriterion("JG_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andJgDatEqualTo(Date value) {
            addCriterion("JG_DAT =", value, "jgDat");
            return (Criteria) this;
        }

        public Criteria andJgDatNotEqualTo(Date value) {
            addCriterion("JG_DAT <>", value, "jgDat");
            return (Criteria) this;
        }

        public Criteria andJgDatGreaterThan(Date value) {
            addCriterion("JG_DAT >", value, "jgDat");
            return (Criteria) this;
        }

        public Criteria andJgDatGreaterThanOrEqualTo(Date value) {
            addCriterion("JG_DAT >=", value, "jgDat");
            return (Criteria) this;
        }

        public Criteria andJgDatLessThan(Date value) {
            addCriterion("JG_DAT <", value, "jgDat");
            return (Criteria) this;
        }

        public Criteria andJgDatLessThanOrEqualTo(Date value) {
            addCriterion("JG_DAT <=", value, "jgDat");
            return (Criteria) this;
        }

        public Criteria andJgDatIn(List<Date> values) {
            addCriterion("JG_DAT in", values, "jgDat");
            return (Criteria) this;
        }

        public Criteria andJgDatNotIn(List<Date> values) {
            addCriterion("JG_DAT not in", values, "jgDat");
            return (Criteria) this;
        }

        public Criteria andJgDatBetween(Date value1, Date value2) {
            addCriterion("JG_DAT between", value1, value2, "jgDat");
            return (Criteria) this;
        }

        public Criteria andJgDatNotBetween(Date value1, Date value2) {
            addCriterion("JG_DAT not between", value1, value2, "jgDat");
            return (Criteria) this;
        }

        public Criteria andYwNamIsNull() {
            addCriterion("YW_NAM is null");
            return (Criteria) this;
        }

        public Criteria andYwNamIsNotNull() {
            addCriterion("YW_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andYwNamEqualTo(String value) {
            addCriterion("YW_NAM =", value, "ywNam");
            return (Criteria) this;
        }

        public Criteria andYwNamNotEqualTo(String value) {
            addCriterion("YW_NAM <>", value, "ywNam");
            return (Criteria) this;
        }

        public Criteria andYwNamGreaterThan(String value) {
            addCriterion("YW_NAM >", value, "ywNam");
            return (Criteria) this;
        }

        public Criteria andYwNamGreaterThanOrEqualTo(String value) {
            addCriterion("YW_NAM >=", value, "ywNam");
            return (Criteria) this;
        }

        public Criteria andYwNamLessThan(String value) {
            addCriterion("YW_NAM <", value, "ywNam");
            return (Criteria) this;
        }

        public Criteria andYwNamLessThanOrEqualTo(String value) {
            addCriterion("YW_NAM <=", value, "ywNam");
            return (Criteria) this;
        }

        public Criteria andYwNamLike(String value) {
            addCriterion("YW_NAM like", value, "ywNam");
            return (Criteria) this;
        }

        public Criteria andYwNamNotLike(String value) {
            addCriterion("YW_NAM not like", value, "ywNam");
            return (Criteria) this;
        }

        public Criteria andYwNamIn(List<String> values) {
            addCriterion("YW_NAM in", values, "ywNam");
            return (Criteria) this;
        }

        public Criteria andYwNamNotIn(List<String> values) {
            addCriterion("YW_NAM not in", values, "ywNam");
            return (Criteria) this;
        }

        public Criteria andYwNamBetween(String value1, String value2) {
            addCriterion("YW_NAM between", value1, value2, "ywNam");
            return (Criteria) this;
        }

        public Criteria andYwNamNotBetween(String value1, String value2) {
            addCriterion("YW_NAM not between", value1, value2, "ywNam");
            return (Criteria) this;
        }

        public Criteria andJgIsNull() {
            addCriterion("JG is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("JG is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(String value) {
            addCriterion("JG =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(String value) {
            addCriterion("JG <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(String value) {
            addCriterion("JG >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(String value) {
            addCriterion("JG >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(String value) {
            addCriterion("JG <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(String value) {
            addCriterion("JG <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLike(String value) {
            addCriterion("JG like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotLike(String value) {
            addCriterion("JG not like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<String> values) {
            addCriterion("JG in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<String> values) {
            addCriterion("JG not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(String value1, String value2) {
            addCriterion("JG between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(String value1, String value2) {
            addCriterion("JG not between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andSigNbrIsNull() {
            addCriterion("SIG_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSigNbrIsNotNull() {
            addCriterion("SIG_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSigNbrEqualTo(String value) {
            addCriterion("SIG_NBR =", value, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNbrNotEqualTo(String value) {
            addCriterion("SIG_NBR <>", value, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNbrGreaterThan(String value) {
            addCriterion("SIG_NBR >", value, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNbrGreaterThanOrEqualTo(String value) {
            addCriterion("SIG_NBR >=", value, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNbrLessThan(String value) {
            addCriterion("SIG_NBR <", value, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNbrLessThanOrEqualTo(String value) {
            addCriterion("SIG_NBR <=", value, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNbrLike(String value) {
            addCriterion("SIG_NBR like", value, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNbrNotLike(String value) {
            addCriterion("SIG_NBR not like", value, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNbrIn(List<String> values) {
            addCriterion("SIG_NBR in", values, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNbrNotIn(List<String> values) {
            addCriterion("SIG_NBR not in", values, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNbrBetween(String value1, String value2) {
            addCriterion("SIG_NBR between", value1, value2, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNbrNotBetween(String value1, String value2) {
            addCriterion("SIG_NBR not between", value1, value2, "sigNbr");
            return (Criteria) this;
        }

        public Criteria andSigNamIsNull() {
            addCriterion("SIG_NAM is null");
            return (Criteria) this;
        }

        public Criteria andSigNamIsNotNull() {
            addCriterion("SIG_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andSigNamEqualTo(String value) {
            addCriterion("SIG_NAM =", value, "sigNam");
            return (Criteria) this;
        }

        public Criteria andSigNamNotEqualTo(String value) {
            addCriterion("SIG_NAM <>", value, "sigNam");
            return (Criteria) this;
        }

        public Criteria andSigNamGreaterThan(String value) {
            addCriterion("SIG_NAM >", value, "sigNam");
            return (Criteria) this;
        }

        public Criteria andSigNamGreaterThanOrEqualTo(String value) {
            addCriterion("SIG_NAM >=", value, "sigNam");
            return (Criteria) this;
        }

        public Criteria andSigNamLessThan(String value) {
            addCriterion("SIG_NAM <", value, "sigNam");
            return (Criteria) this;
        }

        public Criteria andSigNamLessThanOrEqualTo(String value) {
            addCriterion("SIG_NAM <=", value, "sigNam");
            return (Criteria) this;
        }

        public Criteria andSigNamLike(String value) {
            addCriterion("SIG_NAM like", value, "sigNam");
            return (Criteria) this;
        }

        public Criteria andSigNamNotLike(String value) {
            addCriterion("SIG_NAM not like", value, "sigNam");
            return (Criteria) this;
        }

        public Criteria andSigNamIn(List<String> values) {
            addCriterion("SIG_NAM in", values, "sigNam");
            return (Criteria) this;
        }

        public Criteria andSigNamNotIn(List<String> values) {
            addCriterion("SIG_NAM not in", values, "sigNam");
            return (Criteria) this;
        }

        public Criteria andSigNamBetween(String value1, String value2) {
            addCriterion("SIG_NAM between", value1, value2, "sigNam");
            return (Criteria) this;
        }

        public Criteria andSigNamNotBetween(String value1, String value2) {
            addCriterion("SIG_NAM not between", value1, value2, "sigNam");
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