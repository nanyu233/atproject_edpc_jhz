package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspJxtqhljldInfExample {
    /**
     * ZJYY.HSP_JXTQHLJLD_INF
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_JXTQHLJLD_INF
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_JXTQHLJLD_INF
     */
    protected List<Criteria> oredCriteria;

    public HspJxtqhljldInfExample() {
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

    /**
     * ZJYY.HSP_JXTQHLJLD_INF 2020-07-24
     */
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

        public Criteria andJxtqSeqIsNull() {
            addCriterion("JXTQ_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqIsNotNull() {
            addCriterion("JXTQ_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqEqualTo(String value) {
            addCriterion("JXTQ_SEQ =", value, "jxtqSeq");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqNotEqualTo(String value) {
            addCriterion("JXTQ_SEQ <>", value, "jxtqSeq");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqGreaterThan(String value) {
            addCriterion("JXTQ_SEQ >", value, "jxtqSeq");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqGreaterThanOrEqualTo(String value) {
            addCriterion("JXTQ_SEQ >=", value, "jxtqSeq");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqLessThan(String value) {
            addCriterion("JXTQ_SEQ <", value, "jxtqSeq");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqLessThanOrEqualTo(String value) {
            addCriterion("JXTQ_SEQ <=", value, "jxtqSeq");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqLike(String value) {
            addCriterion("JXTQ_SEQ like", value, "jxtqSeq");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqNotLike(String value) {
            addCriterion("JXTQ_SEQ not like", value, "jxtqSeq");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqIn(List<String> values) {
            addCriterion("JXTQ_SEQ in", values, "jxtqSeq");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqNotIn(List<String> values) {
            addCriterion("JXTQ_SEQ not in", values, "jxtqSeq");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqBetween(String value1, String value2) {
            addCriterion("JXTQ_SEQ between", value1, value2, "jxtqSeq");
            return (Criteria) this;
        }

        public Criteria andJxtqSeqNotBetween(String value1, String value2) {
            addCriterion("JXTQ_SEQ not between", value1, value2, "jxtqSeq");
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

        public Criteria andMsCodIsNull() {
            addCriterion("MS_COD is null");
            return (Criteria) this;
        }

        public Criteria andMsCodIsNotNull() {
            addCriterion("MS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMsCodEqualTo(String value) {
            addCriterion("MS_COD =", value, "msCod");
            return (Criteria) this;
        }

        public Criteria andMsCodNotEqualTo(String value) {
            addCriterion("MS_COD <>", value, "msCod");
            return (Criteria) this;
        }

        public Criteria andMsCodGreaterThan(String value) {
            addCriterion("MS_COD >", value, "msCod");
            return (Criteria) this;
        }

        public Criteria andMsCodGreaterThanOrEqualTo(String value) {
            addCriterion("MS_COD >=", value, "msCod");
            return (Criteria) this;
        }

        public Criteria andMsCodLessThan(String value) {
            addCriterion("MS_COD <", value, "msCod");
            return (Criteria) this;
        }

        public Criteria andMsCodLessThanOrEqualTo(String value) {
            addCriterion("MS_COD <=", value, "msCod");
            return (Criteria) this;
        }

        public Criteria andMsCodLike(String value) {
            addCriterion("MS_COD like", value, "msCod");
            return (Criteria) this;
        }

        public Criteria andMsCodNotLike(String value) {
            addCriterion("MS_COD not like", value, "msCod");
            return (Criteria) this;
        }

        public Criteria andMsCodIn(List<String> values) {
            addCriterion("MS_COD in", values, "msCod");
            return (Criteria) this;
        }

        public Criteria andMsCodNotIn(List<String> values) {
            addCriterion("MS_COD not in", values, "msCod");
            return (Criteria) this;
        }

        public Criteria andMsCodBetween(String value1, String value2) {
            addCriterion("MS_COD between", value1, value2, "msCod");
            return (Criteria) this;
        }

        public Criteria andMsCodNotBetween(String value1, String value2) {
            addCriterion("MS_COD not between", value1, value2, "msCod");
            return (Criteria) this;
        }

        public Criteria andJxtqYndIsNull() {
            addCriterion("JXTQ_YND is null");
            return (Criteria) this;
        }

        public Criteria andJxtqYndIsNotNull() {
            addCriterion("JXTQ_YND is not null");
            return (Criteria) this;
        }

        public Criteria andJxtqYndEqualTo(String value) {
            addCriterion("JXTQ_YND =", value, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqYndNotEqualTo(String value) {
            addCriterion("JXTQ_YND <>", value, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqYndGreaterThan(String value) {
            addCriterion("JXTQ_YND >", value, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqYndGreaterThanOrEqualTo(String value) {
            addCriterion("JXTQ_YND >=", value, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqYndLessThan(String value) {
            addCriterion("JXTQ_YND <", value, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqYndLessThanOrEqualTo(String value) {
            addCriterion("JXTQ_YND <=", value, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqYndLike(String value) {
            addCriterion("JXTQ_YND like", value, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqYndNotLike(String value) {
            addCriterion("JXTQ_YND not like", value, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqYndIn(List<String> values) {
            addCriterion("JXTQ_YND in", values, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqYndNotIn(List<String> values) {
            addCriterion("JXTQ_YND not in", values, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqYndBetween(String value1, String value2) {
            addCriterion("JXTQ_YND between", value1, value2, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqYndNotBetween(String value1, String value2) {
            addCriterion("JXTQ_YND not between", value1, value2, "jxtqYnd");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlIsNull() {
            addCriterion("JXTQ_CQL is null");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlIsNotNull() {
            addCriterion("JXTQ_CQL is not null");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlEqualTo(String value) {
            addCriterion("JXTQ_CQL =", value, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlNotEqualTo(String value) {
            addCriterion("JXTQ_CQL <>", value, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlGreaterThan(String value) {
            addCriterion("JXTQ_CQL >", value, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlGreaterThanOrEqualTo(String value) {
            addCriterion("JXTQ_CQL >=", value, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlLessThan(String value) {
            addCriterion("JXTQ_CQL <", value, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlLessThanOrEqualTo(String value) {
            addCriterion("JXTQ_CQL <=", value, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlLike(String value) {
            addCriterion("JXTQ_CQL like", value, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlNotLike(String value) {
            addCriterion("JXTQ_CQL not like", value, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlIn(List<String> values) {
            addCriterion("JXTQ_CQL in", values, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlNotIn(List<String> values) {
            addCriterion("JXTQ_CQL not in", values, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlBetween(String value1, String value2) {
            addCriterion("JXTQ_CQL between", value1, value2, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqCqlNotBetween(String value1, String value2) {
            addCriterion("JXTQ_CQL not between", value1, value2, "jxtqCql");
            return (Criteria) this;
        }

        public Criteria andJxtqPlIsNull() {
            addCriterion("JXTQ_PL is null");
            return (Criteria) this;
        }

        public Criteria andJxtqPlIsNotNull() {
            addCriterion("JXTQ_PL is not null");
            return (Criteria) this;
        }

        public Criteria andJxtqPlEqualTo(String value) {
            addCriterion("JXTQ_PL =", value, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPlNotEqualTo(String value) {
            addCriterion("JXTQ_PL <>", value, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPlGreaterThan(String value) {
            addCriterion("JXTQ_PL >", value, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPlGreaterThanOrEqualTo(String value) {
            addCriterion("JXTQ_PL >=", value, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPlLessThan(String value) {
            addCriterion("JXTQ_PL <", value, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPlLessThanOrEqualTo(String value) {
            addCriterion("JXTQ_PL <=", value, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPlLike(String value) {
            addCriterion("JXTQ_PL like", value, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPlNotLike(String value) {
            addCriterion("JXTQ_PL not like", value, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPlIn(List<String> values) {
            addCriterion("JXTQ_PL in", values, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPlNotIn(List<String> values) {
            addCriterion("JXTQ_PL not in", values, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPlBetween(String value1, String value2) {
            addCriterion("JXTQ_PL between", value1, value2, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPlNotBetween(String value1, String value2) {
            addCriterion("JXTQ_PL not between", value1, value2, "jxtqPl");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepIsNull() {
            addCriterion("JXTQ_PEEP is null");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepIsNotNull() {
            addCriterion("JXTQ_PEEP is not null");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepEqualTo(String value) {
            addCriterion("JXTQ_PEEP =", value, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepNotEqualTo(String value) {
            addCriterion("JXTQ_PEEP <>", value, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepGreaterThan(String value) {
            addCriterion("JXTQ_PEEP >", value, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepGreaterThanOrEqualTo(String value) {
            addCriterion("JXTQ_PEEP >=", value, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepLessThan(String value) {
            addCriterion("JXTQ_PEEP <", value, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepLessThanOrEqualTo(String value) {
            addCriterion("JXTQ_PEEP <=", value, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepLike(String value) {
            addCriterion("JXTQ_PEEP like", value, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepNotLike(String value) {
            addCriterion("JXTQ_PEEP not like", value, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepIn(List<String> values) {
            addCriterion("JXTQ_PEEP in", values, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepNotIn(List<String> values) {
            addCriterion("JXTQ_PEEP not in", values, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepBetween(String value1, String value2) {
            addCriterion("JXTQ_PEEP between", value1, value2, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqPeepNotBetween(String value1, String value2) {
            addCriterion("JXTQ_PEEP not between", value1, value2, "jxtqPeep");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbIsNull() {
            addCriterion("JXTQ_HXB is null");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbIsNotNull() {
            addCriterion("JXTQ_HXB is not null");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbEqualTo(String value) {
            addCriterion("JXTQ_HXB =", value, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbNotEqualTo(String value) {
            addCriterion("JXTQ_HXB <>", value, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbGreaterThan(String value) {
            addCriterion("JXTQ_HXB >", value, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbGreaterThanOrEqualTo(String value) {
            addCriterion("JXTQ_HXB >=", value, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbLessThan(String value) {
            addCriterion("JXTQ_HXB <", value, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbLessThanOrEqualTo(String value) {
            addCriterion("JXTQ_HXB <=", value, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbLike(String value) {
            addCriterion("JXTQ_HXB like", value, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbNotLike(String value) {
            addCriterion("JXTQ_HXB not like", value, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbIn(List<String> values) {
            addCriterion("JXTQ_HXB in", values, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbNotIn(List<String> values) {
            addCriterion("JXTQ_HXB not in", values, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbBetween(String value1, String value2) {
            addCriterion("JXTQ_HXB between", value1, value2, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andJxtqHxbNotBetween(String value1, String value2) {
            addCriterion("JXTQ_HXB not between", value1, value2, "jxtqHxb");
            return (Criteria) this;
        }

        public Criteria andRecordDatIsNull() {
            addCriterion("RECORD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andRecordDatIsNotNull() {
            addCriterion("RECORD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDatEqualTo(Date value) {
            addCriterion("RECORD_DAT =", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatNotEqualTo(Date value) {
            addCriterion("RECORD_DAT <>", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatGreaterThan(Date value) {
            addCriterion("RECORD_DAT >", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatGreaterThanOrEqualTo(Date value) {
            addCriterion("RECORD_DAT >=", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatLessThan(Date value) {
            addCriterion("RECORD_DAT <", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatLessThanOrEqualTo(Date value) {
            addCriterion("RECORD_DAT <=", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatIn(List<Date> values) {
            addCriterion("RECORD_DAT in", values, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatNotIn(List<Date> values) {
            addCriterion("RECORD_DAT not in", values, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatBetween(Date value1, Date value2) {
            addCriterion("RECORD_DAT between", value1, value2, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatNotBetween(Date value1, Date value2) {
            addCriterion("RECORD_DAT not between", value1, value2, "recordDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatIsNull() {
            addCriterion("CRT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCrtDatIsNotNull() {
            addCriterion("CRT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDatEqualTo(Date value) {
            addCriterion("CRT_DAT =", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotEqualTo(Date value) {
            addCriterion("CRT_DAT <>", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatGreaterThan(Date value) {
            addCriterion("CRT_DAT >", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_DAT >=", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatLessThan(Date value) {
            addCriterion("CRT_DAT <", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatLessThanOrEqualTo(Date value) {
            addCriterion("CRT_DAT <=", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatIn(List<Date> values) {
            addCriterion("CRT_DAT in", values, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotIn(List<Date> values) {
            addCriterion("CRT_DAT not in", values, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatBetween(Date value1, Date value2) {
            addCriterion("CRT_DAT between", value1, value2, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotBetween(Date value1, Date value2) {
            addCriterion("CRT_DAT not between", value1, value2, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtNurIsNull() {
            addCriterion("CRT_NUR is null");
            return (Criteria) this;
        }

        public Criteria andCrtNurIsNotNull() {
            addCriterion("CRT_NUR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNurEqualTo(String value) {
            addCriterion("CRT_NUR =", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotEqualTo(String value) {
            addCriterion("CRT_NUR <>", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurGreaterThan(String value) {
            addCriterion("CRT_NUR >", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NUR >=", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurLessThan(String value) {
            addCriterion("CRT_NUR <", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurLessThanOrEqualTo(String value) {
            addCriterion("CRT_NUR <=", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurLike(String value) {
            addCriterion("CRT_NUR like", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotLike(String value) {
            addCriterion("CRT_NUR not like", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurIn(List<String> values) {
            addCriterion("CRT_NUR in", values, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotIn(List<String> values) {
            addCriterion("CRT_NUR not in", values, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurBetween(String value1, String value2) {
            addCriterion("CRT_NUR between", value1, value2, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotBetween(String value1, String value2) {
            addCriterion("CRT_NUR not between", value1, value2, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNameIsNull() {
            addCriterion("CRT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCrtNameIsNotNull() {
            addCriterion("CRT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNameEqualTo(String value) {
            addCriterion("CRT_NAME =", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotEqualTo(String value) {
            addCriterion("CRT_NAME <>", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameGreaterThan(String value) {
            addCriterion("CRT_NAME >", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NAME >=", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameLessThan(String value) {
            addCriterion("CRT_NAME <", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameLessThanOrEqualTo(String value) {
            addCriterion("CRT_NAME <=", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameLike(String value) {
            addCriterion("CRT_NAME like", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotLike(String value) {
            addCriterion("CRT_NAME not like", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameIn(List<String> values) {
            addCriterion("CRT_NAME in", values, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotIn(List<String> values) {
            addCriterion("CRT_NAME not in", values, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameBetween(String value1, String value2) {
            addCriterion("CRT_NAME between", value1, value2, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotBetween(String value1, String value2) {
            addCriterion("CRT_NAME not between", value1, value2, "crtName");
            return (Criteria) this;
        }

        public Criteria andUpDatIsNull() {
            addCriterion("UP_DAT is null");
            return (Criteria) this;
        }

        public Criteria andUpDatIsNotNull() {
            addCriterion("UP_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpDatEqualTo(Date value) {
            addCriterion("UP_DAT =", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatNotEqualTo(Date value) {
            addCriterion("UP_DAT <>", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatGreaterThan(Date value) {
            addCriterion("UP_DAT >", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatGreaterThanOrEqualTo(Date value) {
            addCriterion("UP_DAT >=", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatLessThan(Date value) {
            addCriterion("UP_DAT <", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatLessThanOrEqualTo(Date value) {
            addCriterion("UP_DAT <=", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatIn(List<Date> values) {
            addCriterion("UP_DAT in", values, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatNotIn(List<Date> values) {
            addCriterion("UP_DAT not in", values, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatBetween(Date value1, Date value2) {
            addCriterion("UP_DAT between", value1, value2, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatNotBetween(Date value1, Date value2) {
            addCriterion("UP_DAT not between", value1, value2, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpNurIsNull() {
            addCriterion("UP_NUR is null");
            return (Criteria) this;
        }

        public Criteria andUpNurIsNotNull() {
            addCriterion("UP_NUR is not null");
            return (Criteria) this;
        }

        public Criteria andUpNurEqualTo(String value) {
            addCriterion("UP_NUR =", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotEqualTo(String value) {
            addCriterion("UP_NUR <>", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurGreaterThan(String value) {
            addCriterion("UP_NUR >", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurGreaterThanOrEqualTo(String value) {
            addCriterion("UP_NUR >=", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurLessThan(String value) {
            addCriterion("UP_NUR <", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurLessThanOrEqualTo(String value) {
            addCriterion("UP_NUR <=", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurLike(String value) {
            addCriterion("UP_NUR like", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotLike(String value) {
            addCriterion("UP_NUR not like", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurIn(List<String> values) {
            addCriterion("UP_NUR in", values, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotIn(List<String> values) {
            addCriterion("UP_NUR not in", values, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurBetween(String value1, String value2) {
            addCriterion("UP_NUR between", value1, value2, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotBetween(String value1, String value2) {
            addCriterion("UP_NUR not between", value1, value2, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNull() {
            addCriterion("UP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNotNull() {
            addCriterion("UP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpNameEqualTo(String value) {
            addCriterion("UP_NAME =", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotEqualTo(String value) {
            addCriterion("UP_NAME <>", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThan(String value) {
            addCriterion("UP_NAME >", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThanOrEqualTo(String value) {
            addCriterion("UP_NAME >=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThan(String value) {
            addCriterion("UP_NAME <", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThanOrEqualTo(String value) {
            addCriterion("UP_NAME <=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLike(String value) {
            addCriterion("UP_NAME like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotLike(String value) {
            addCriterion("UP_NAME not like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameIn(List<String> values) {
            addCriterion("UP_NAME in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotIn(List<String> values) {
            addCriterion("UP_NAME not in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameBetween(String value1, String value2) {
            addCriterion("UP_NAME between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotBetween(String value1, String value2) {
            addCriterion("UP_NAME not between", value1, value2, "upName");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_JXTQHLJLD_INF
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_JXTQHLJLD_INF 2020-07-24
     */
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