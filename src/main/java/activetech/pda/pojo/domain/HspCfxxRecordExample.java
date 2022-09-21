package activetech.pda.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCfxxRecordExample {
    /**
     * ZJYY.HSP_CFXX_RECORD
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_CFXX_RECORD
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_CFXX_RECORD
     */
    protected List<Criteria> oredCriteria;

    public HspCfxxRecordExample() {
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
     * ZJYY.HSP_CFXX_RECORD 2020-06-10
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

        public Criteria andRecordSeqIsNull() {
            addCriterion("RECORD_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andRecordSeqIsNotNull() {
            addCriterion("RECORD_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRecordSeqEqualTo(String value) {
            addCriterion("RECORD_SEQ =", value, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andRecordSeqNotEqualTo(String value) {
            addCriterion("RECORD_SEQ <>", value, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andRecordSeqGreaterThan(String value) {
            addCriterion("RECORD_SEQ >", value, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andRecordSeqGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_SEQ >=", value, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andRecordSeqLessThan(String value) {
            addCriterion("RECORD_SEQ <", value, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andRecordSeqLessThanOrEqualTo(String value) {
            addCriterion("RECORD_SEQ <=", value, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andRecordSeqLike(String value) {
            addCriterion("RECORD_SEQ like", value, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andRecordSeqNotLike(String value) {
            addCriterion("RECORD_SEQ not like", value, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andRecordSeqIn(List<String> values) {
            addCriterion("RECORD_SEQ in", values, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andRecordSeqNotIn(List<String> values) {
            addCriterion("RECORD_SEQ not in", values, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andRecordSeqBetween(String value1, String value2) {
            addCriterion("RECORD_SEQ between", value1, value2, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andRecordSeqNotBetween(String value1, String value2) {
            addCriterion("RECORD_SEQ not between", value1, value2, "recordSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqIsNull() {
            addCriterion("DISPOSAL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqIsNotNull() {
            addCriterion("DISPOSAL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqEqualTo(String value) {
            addCriterion("DISPOSAL_SEQ =", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqNotEqualTo(String value) {
            addCriterion("DISPOSAL_SEQ <>", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqGreaterThan(String value) {
            addCriterion("DISPOSAL_SEQ >", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqGreaterThanOrEqualTo(String value) {
            addCriterion("DISPOSAL_SEQ >=", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqLessThan(String value) {
            addCriterion("DISPOSAL_SEQ <", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqLessThanOrEqualTo(String value) {
            addCriterion("DISPOSAL_SEQ <=", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqLike(String value) {
            addCriterion("DISPOSAL_SEQ like", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqNotLike(String value) {
            addCriterion("DISPOSAL_SEQ not like", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqIn(List<String> values) {
            addCriterion("DISPOSAL_SEQ in", values, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqNotIn(List<String> values) {
            addCriterion("DISPOSAL_SEQ not in", values, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqBetween(String value1, String value2) {
            addCriterion("DISPOSAL_SEQ between", value1, value2, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqNotBetween(String value1, String value2) {
            addCriterion("DISPOSAL_SEQ not between", value1, value2, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andMpiIsNull() {
            addCriterion("MPI is null");
            return (Criteria) this;
        }

        public Criteria andMpiIsNotNull() {
            addCriterion("MPI is not null");
            return (Criteria) this;
        }

        public Criteria andMpiEqualTo(String value) {
            addCriterion("MPI =", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotEqualTo(String value) {
            addCriterion("MPI <>", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiGreaterThan(String value) {
            addCriterion("MPI >", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiGreaterThanOrEqualTo(String value) {
            addCriterion("MPI >=", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLessThan(String value) {
            addCriterion("MPI <", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLessThanOrEqualTo(String value) {
            addCriterion("MPI <=", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLike(String value) {
            addCriterion("MPI like", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotLike(String value) {
            addCriterion("MPI not like", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiIn(List<String> values) {
            addCriterion("MPI in", values, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotIn(List<String> values) {
            addCriterion("MPI not in", values, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiBetween(String value1, String value2) {
            addCriterion("MPI between", value1, value2, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotBetween(String value1, String value2) {
            addCriterion("MPI not between", value1, value2, "mpi");
            return (Criteria) this;
        }

        public Criteria andSituationIsNull() {
            addCriterion("SITUATION is null");
            return (Criteria) this;
        }

        public Criteria andSituationIsNotNull() {
            addCriterion("SITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andSituationEqualTo(String value) {
            addCriterion("SITUATION =", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotEqualTo(String value) {
            addCriterion("SITUATION <>", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationGreaterThan(String value) {
            addCriterion("SITUATION >", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationGreaterThanOrEqualTo(String value) {
            addCriterion("SITUATION >=", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLessThan(String value) {
            addCriterion("SITUATION <", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLessThanOrEqualTo(String value) {
            addCriterion("SITUATION <=", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLike(String value) {
            addCriterion("SITUATION like", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotLike(String value) {
            addCriterion("SITUATION not like", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationIn(List<String> values) {
            addCriterion("SITUATION in", values, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotIn(List<String> values) {
            addCriterion("SITUATION not in", values, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationBetween(String value1, String value2) {
            addCriterion("SITUATION between", value1, value2, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotBetween(String value1, String value2) {
            addCriterion("SITUATION not between", value1, value2, "situation");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIsNull() {
            addCriterion("DRUG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIsNotNull() {
            addCriterion("DRUG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDrugTypeEqualTo(String value) {
            addCriterion("DRUG_TYPE =", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotEqualTo(String value) {
            addCriterion("DRUG_TYPE <>", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeGreaterThan(String value) {
            addCriterion("DRUG_TYPE >", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_TYPE >=", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLessThan(String value) {
            addCriterion("DRUG_TYPE <", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLessThanOrEqualTo(String value) {
            addCriterion("DRUG_TYPE <=", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLike(String value) {
            addCriterion("DRUG_TYPE like", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotLike(String value) {
            addCriterion("DRUG_TYPE not like", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIn(List<String> values) {
            addCriterion("DRUG_TYPE in", values, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotIn(List<String> values) {
            addCriterion("DRUG_TYPE not in", values, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeBetween(String value1, String value2) {
            addCriterion("DRUG_TYPE between", value1, value2, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotBetween(String value1, String value2) {
            addCriterion("DRUG_TYPE not between", value1, value2, "drugType");
            return (Criteria) this;
        }

        public Criteria andDripRateIsNull() {
            addCriterion("DRIP_RATE is null");
            return (Criteria) this;
        }

        public Criteria andDripRateIsNotNull() {
            addCriterion("DRIP_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andDripRateEqualTo(String value) {
            addCriterion("DRIP_RATE =", value, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateNotEqualTo(String value) {
            addCriterion("DRIP_RATE <>", value, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateGreaterThan(String value) {
            addCriterion("DRIP_RATE >", value, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateGreaterThanOrEqualTo(String value) {
            addCriterion("DRIP_RATE >=", value, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateLessThan(String value) {
            addCriterion("DRIP_RATE <", value, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateLessThanOrEqualTo(String value) {
            addCriterion("DRIP_RATE <=", value, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateLike(String value) {
            addCriterion("DRIP_RATE like", value, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateNotLike(String value) {
            addCriterion("DRIP_RATE not like", value, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateIn(List<String> values) {
            addCriterion("DRIP_RATE in", values, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateNotIn(List<String> values) {
            addCriterion("DRIP_RATE not in", values, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateBetween(String value1, String value2) {
            addCriterion("DRIP_RATE between", value1, value2, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateNotBetween(String value1, String value2) {
            addCriterion("DRIP_RATE not between", value1, value2, "dripRate");
            return (Criteria) this;
        }

        public Criteria andDripRateDropIsNull() {
            addCriterion("DRIP_RATE_DROP is null");
            return (Criteria) this;
        }

        public Criteria andDripRateDropIsNotNull() {
            addCriterion("DRIP_RATE_DROP is not null");
            return (Criteria) this;
        }

        public Criteria andDripRateDropEqualTo(String value) {
            addCriterion("DRIP_RATE_DROP =", value, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andDripRateDropNotEqualTo(String value) {
            addCriterion("DRIP_RATE_DROP <>", value, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andDripRateDropGreaterThan(String value) {
            addCriterion("DRIP_RATE_DROP >", value, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andDripRateDropGreaterThanOrEqualTo(String value) {
            addCriterion("DRIP_RATE_DROP >=", value, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andDripRateDropLessThan(String value) {
            addCriterion("DRIP_RATE_DROP <", value, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andDripRateDropLessThanOrEqualTo(String value) {
            addCriterion("DRIP_RATE_DROP <=", value, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andDripRateDropLike(String value) {
            addCriterion("DRIP_RATE_DROP like", value, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andDripRateDropNotLike(String value) {
            addCriterion("DRIP_RATE_DROP not like", value, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andDripRateDropIn(List<String> values) {
            addCriterion("DRIP_RATE_DROP in", values, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andDripRateDropNotIn(List<String> values) {
            addCriterion("DRIP_RATE_DROP not in", values, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andDripRateDropBetween(String value1, String value2) {
            addCriterion("DRIP_RATE_DROP between", value1, value2, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andDripRateDropNotBetween(String value1, String value2) {
            addCriterion("DRIP_RATE_DROP not between", value1, value2, "dripRateDrop");
            return (Criteria) this;
        }

        public Criteria andMarginIsNull() {
            addCriterion("MARGIN is null");
            return (Criteria) this;
        }

        public Criteria andMarginIsNotNull() {
            addCriterion("MARGIN is not null");
            return (Criteria) this;
        }

        public Criteria andMarginEqualTo(String value) {
            addCriterion("MARGIN =", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotEqualTo(String value) {
            addCriterion("MARGIN <>", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginGreaterThan(String value) {
            addCriterion("MARGIN >", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginGreaterThanOrEqualTo(String value) {
            addCriterion("MARGIN >=", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginLessThan(String value) {
            addCriterion("MARGIN <", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginLessThanOrEqualTo(String value) {
            addCriterion("MARGIN <=", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginLike(String value) {
            addCriterion("MARGIN like", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotLike(String value) {
            addCriterion("MARGIN not like", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginIn(List<String> values) {
            addCriterion("MARGIN in", values, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotIn(List<String> values) {
            addCriterion("MARGIN not in", values, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginBetween(String value1, String value2) {
            addCriterion("MARGIN between", value1, value2, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotBetween(String value1, String value2) {
            addCriterion("MARGIN not between", value1, value2, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginDropIsNull() {
            addCriterion("MARGIN_DROP is null");
            return (Criteria) this;
        }

        public Criteria andMarginDropIsNotNull() {
            addCriterion("MARGIN_DROP is not null");
            return (Criteria) this;
        }

        public Criteria andMarginDropEqualTo(String value) {
            addCriterion("MARGIN_DROP =", value, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andMarginDropNotEqualTo(String value) {
            addCriterion("MARGIN_DROP <>", value, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andMarginDropGreaterThan(String value) {
            addCriterion("MARGIN_DROP >", value, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andMarginDropGreaterThanOrEqualTo(String value) {
            addCriterion("MARGIN_DROP >=", value, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andMarginDropLessThan(String value) {
            addCriterion("MARGIN_DROP <", value, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andMarginDropLessThanOrEqualTo(String value) {
            addCriterion("MARGIN_DROP <=", value, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andMarginDropLike(String value) {
            addCriterion("MARGIN_DROP like", value, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andMarginDropNotLike(String value) {
            addCriterion("MARGIN_DROP not like", value, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andMarginDropIn(List<String> values) {
            addCriterion("MARGIN_DROP in", values, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andMarginDropNotIn(List<String> values) {
            addCriterion("MARGIN_DROP not in", values, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andMarginDropBetween(String value1, String value2) {
            addCriterion("MARGIN_DROP between", value1, value2, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andMarginDropNotBetween(String value1, String value2) {
            addCriterion("MARGIN_DROP not between", value1, value2, "marginDrop");
            return (Criteria) this;
        }

        public Criteria andDisposeWayIsNull() {
            addCriterion("DISPOSE_WAY is null");
            return (Criteria) this;
        }

        public Criteria andDisposeWayIsNotNull() {
            addCriterion("DISPOSE_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeWayEqualTo(String value) {
            addCriterion("DISPOSE_WAY =", value, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeWayNotEqualTo(String value) {
            addCriterion("DISPOSE_WAY <>", value, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeWayGreaterThan(String value) {
            addCriterion("DISPOSE_WAY >", value, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeWayGreaterThanOrEqualTo(String value) {
            addCriterion("DISPOSE_WAY >=", value, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeWayLessThan(String value) {
            addCriterion("DISPOSE_WAY <", value, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeWayLessThanOrEqualTo(String value) {
            addCriterion("DISPOSE_WAY <=", value, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeWayLike(String value) {
            addCriterion("DISPOSE_WAY like", value, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeWayNotLike(String value) {
            addCriterion("DISPOSE_WAY not like", value, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeWayIn(List<String> values) {
            addCriterion("DISPOSE_WAY in", values, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeWayNotIn(List<String> values) {
            addCriterion("DISPOSE_WAY not in", values, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeWayBetween(String value1, String value2) {
            addCriterion("DISPOSE_WAY between", value1, value2, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeWayNotBetween(String value1, String value2) {
            addCriterion("DISPOSE_WAY not between", value1, value2, "disposeWay");
            return (Criteria) this;
        }

        public Criteria andDisposeResultIsNull() {
            addCriterion("DISPOSE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andDisposeResultIsNotNull() {
            addCriterion("DISPOSE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeResultEqualTo(String value) {
            addCriterion("DISPOSE_RESULT =", value, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andDisposeResultNotEqualTo(String value) {
            addCriterion("DISPOSE_RESULT <>", value, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andDisposeResultGreaterThan(String value) {
            addCriterion("DISPOSE_RESULT >", value, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andDisposeResultGreaterThanOrEqualTo(String value) {
            addCriterion("DISPOSE_RESULT >=", value, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andDisposeResultLessThan(String value) {
            addCriterion("DISPOSE_RESULT <", value, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andDisposeResultLessThanOrEqualTo(String value) {
            addCriterion("DISPOSE_RESULT <=", value, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andDisposeResultLike(String value) {
            addCriterion("DISPOSE_RESULT like", value, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andDisposeResultNotLike(String value) {
            addCriterion("DISPOSE_RESULT not like", value, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andDisposeResultIn(List<String> values) {
            addCriterion("DISPOSE_RESULT in", values, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andDisposeResultNotIn(List<String> values) {
            addCriterion("DISPOSE_RESULT not in", values, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andDisposeResultBetween(String value1, String value2) {
            addCriterion("DISPOSE_RESULT between", value1, value2, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andDisposeResultNotBetween(String value1, String value2) {
            addCriterion("DISPOSE_RESULT not between", value1, value2, "disposeResult");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNull() {
            addCriterion("RECORD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNotNull() {
            addCriterion("RECORD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDateEqualTo(Date value) {
            addCriterion("RECORD_DATE =", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotEqualTo(Date value) {
            addCriterion("RECORD_DATE <>", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThan(Date value) {
            addCriterion("RECORD_DATE >", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RECORD_DATE >=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThan(Date value) {
            addCriterion("RECORD_DATE <", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThanOrEqualTo(Date value) {
            addCriterion("RECORD_DATE <=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateIn(List<Date> values) {
            addCriterion("RECORD_DATE in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotIn(List<Date> values) {
            addCriterion("RECORD_DATE not in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateBetween(Date value1, Date value2) {
            addCriterion("RECORD_DATE between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotBetween(Date value1, Date value2) {
            addCriterion("RECORD_DATE not between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoIsNull() {
            addCriterion("RECORD_USRNO is null");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoIsNotNull() {
            addCriterion("RECORD_USRNO is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoEqualTo(String value) {
            addCriterion("RECORD_USRNO =", value, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoNotEqualTo(String value) {
            addCriterion("RECORD_USRNO <>", value, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoGreaterThan(String value) {
            addCriterion("RECORD_USRNO >", value, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_USRNO >=", value, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoLessThan(String value) {
            addCriterion("RECORD_USRNO <", value, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoLessThanOrEqualTo(String value) {
            addCriterion("RECORD_USRNO <=", value, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoLike(String value) {
            addCriterion("RECORD_USRNO like", value, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoNotLike(String value) {
            addCriterion("RECORD_USRNO not like", value, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoIn(List<String> values) {
            addCriterion("RECORD_USRNO in", values, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoNotIn(List<String> values) {
            addCriterion("RECORD_USRNO not in", values, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoBetween(String value1, String value2) {
            addCriterion("RECORD_USRNO between", value1, value2, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnoNotBetween(String value1, String value2) {
            addCriterion("RECORD_USRNO not between", value1, value2, "recordUsrno");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamIsNull() {
            addCriterion("RECORD_USRNAM is null");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamIsNotNull() {
            addCriterion("RECORD_USRNAM is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamEqualTo(String value) {
            addCriterion("RECORD_USRNAM =", value, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamNotEqualTo(String value) {
            addCriterion("RECORD_USRNAM <>", value, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamGreaterThan(String value) {
            addCriterion("RECORD_USRNAM >", value, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_USRNAM >=", value, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamLessThan(String value) {
            addCriterion("RECORD_USRNAM <", value, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamLessThanOrEqualTo(String value) {
            addCriterion("RECORD_USRNAM <=", value, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamLike(String value) {
            addCriterion("RECORD_USRNAM like", value, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamNotLike(String value) {
            addCriterion("RECORD_USRNAM not like", value, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamIn(List<String> values) {
            addCriterion("RECORD_USRNAM in", values, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamNotIn(List<String> values) {
            addCriterion("RECORD_USRNAM not in", values, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamBetween(String value1, String value2) {
            addCriterion("RECORD_USRNAM between", value1, value2, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordUsrnamNotBetween(String value1, String value2) {
            addCriterion("RECORD_USRNAM not between", value1, value2, "recordUsrnam");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNull() {
            addCriterion("RECORD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNotNull() {
            addCriterion("RECORD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusEqualTo(String value) {
            addCriterion("RECORD_STATUS =", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotEqualTo(String value) {
            addCriterion("RECORD_STATUS <>", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThan(String value) {
            addCriterion("RECORD_STATUS >", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_STATUS >=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThan(String value) {
            addCriterion("RECORD_STATUS <", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThanOrEqualTo(String value) {
            addCriterion("RECORD_STATUS <=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLike(String value) {
            addCriterion("RECORD_STATUS like", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotLike(String value) {
            addCriterion("RECORD_STATUS not like", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIn(List<String> values) {
            addCriterion("RECORD_STATUS in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotIn(List<String> values) {
            addCriterion("RECORD_STATUS not in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusBetween(String value1, String value2) {
            addCriterion("RECORD_STATUS between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotBetween(String value1, String value2) {
            addCriterion("RECORD_STATUS not between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRemakerIsNull() {
            addCriterion("REMAKER is null");
            return (Criteria) this;
        }

        public Criteria andRemakerIsNotNull() {
            addCriterion("REMAKER is not null");
            return (Criteria) this;
        }

        public Criteria andRemakerEqualTo(String value) {
            addCriterion("REMAKER =", value, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemakerNotEqualTo(String value) {
            addCriterion("REMAKER <>", value, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemakerGreaterThan(String value) {
            addCriterion("REMAKER >", value, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemakerGreaterThanOrEqualTo(String value) {
            addCriterion("REMAKER >=", value, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemakerLessThan(String value) {
            addCriterion("REMAKER <", value, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemakerLessThanOrEqualTo(String value) {
            addCriterion("REMAKER <=", value, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemakerLike(String value) {
            addCriterion("REMAKER like", value, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemakerNotLike(String value) {
            addCriterion("REMAKER not like", value, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemakerIn(List<String> values) {
            addCriterion("REMAKER in", values, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemakerNotIn(List<String> values) {
            addCriterion("REMAKER not in", values, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemakerBetween(String value1, String value2) {
            addCriterion("REMAKER between", value1, value2, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemakerNotBetween(String value1, String value2) {
            addCriterion("REMAKER not between", value1, value2, "remaker");
            return (Criteria) this;
        }

        public Criteria andRemaker1IsNull() {
            addCriterion("REMAKER1 is null");
            return (Criteria) this;
        }

        public Criteria andRemaker1IsNotNull() {
            addCriterion("REMAKER1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemaker1EqualTo(String value) {
            addCriterion("REMAKER1 =", value, "remaker1");
            return (Criteria) this;
        }

        public Criteria andRemaker1NotEqualTo(String value) {
            addCriterion("REMAKER1 <>", value, "remaker1");
            return (Criteria) this;
        }

        public Criteria andRemaker1GreaterThan(String value) {
            addCriterion("REMAKER1 >", value, "remaker1");
            return (Criteria) this;
        }

        public Criteria andRemaker1GreaterThanOrEqualTo(String value) {
            addCriterion("REMAKER1 >=", value, "remaker1");
            return (Criteria) this;
        }

        public Criteria andRemaker1LessThan(String value) {
            addCriterion("REMAKER1 <", value, "remaker1");
            return (Criteria) this;
        }

        public Criteria andRemaker1LessThanOrEqualTo(String value) {
            addCriterion("REMAKER1 <=", value, "remaker1");
            return (Criteria) this;
        }

        public Criteria andRemaker1Like(String value) {
            addCriterion("REMAKER1 like", value, "remaker1");
            return (Criteria) this;
        }

        public Criteria andRemaker1NotLike(String value) {
            addCriterion("REMAKER1 not like", value, "remaker1");
            return (Criteria) this;
        }

        public Criteria andRemaker1In(List<String> values) {
            addCriterion("REMAKER1 in", values, "remaker1");
            return (Criteria) this;
        }

        public Criteria andRemaker1NotIn(List<String> values) {
            addCriterion("REMAKER1 not in", values, "remaker1");
            return (Criteria) this;
        }

        public Criteria andRemaker1Between(String value1, String value2) {
            addCriterion("REMAKER1 between", value1, value2, "remaker1");
            return (Criteria) this;
        }

        public Criteria andRemaker1NotBetween(String value1, String value2) {
            addCriterion("REMAKER1 not between", value1, value2, "remaker1");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_CFXX_RECORD
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_CFXX_RECORD 2020-06-10
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