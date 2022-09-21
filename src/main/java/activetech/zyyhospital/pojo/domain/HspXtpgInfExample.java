package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspXtpgInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspXtpgInfExample() {
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

        public Criteria andXtpgSeqIsNull() {
            addCriterion("XTPG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIsNotNull() {
            addCriterion("XTPG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqEqualTo(String value) {
            addCriterion("XTPG_SEQ =", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotEqualTo(String value) {
            addCriterion("XTPG_SEQ <>", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThan(String value) {
            addCriterion("XTPG_SEQ >", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ >=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThan(String value) {
            addCriterion("XTPG_SEQ <", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ <=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLike(String value) {
            addCriterion("XTPG_SEQ like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotLike(String value) {
            addCriterion("XTPG_SEQ not like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIn(List<String> values) {
            addCriterion("XTPG_SEQ in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotIn(List<String> values) {
            addCriterion("XTPG_SEQ not in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ between", value1, value2, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ not between", value1, value2, "xtpgSeq");
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

        public Criteria andXtpgSxIsNull() {
            addCriterion("XTPG_SX is null");
            return (Criteria) this;
        }

        public Criteria andXtpgSxIsNotNull() {
            addCriterion("XTPG_SX is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgSxEqualTo(String value) {
            addCriterion("XTPG_SX =", value, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgSxNotEqualTo(String value) {
            addCriterion("XTPG_SX <>", value, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgSxGreaterThan(String value) {
            addCriterion("XTPG_SX >", value, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgSxGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_SX >=", value, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgSxLessThan(String value) {
            addCriterion("XTPG_SX <", value, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgSxLessThanOrEqualTo(String value) {
            addCriterion("XTPG_SX <=", value, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgSxLike(String value) {
            addCriterion("XTPG_SX like", value, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgSxNotLike(String value) {
            addCriterion("XTPG_SX not like", value, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgSxIn(List<String> values) {
            addCriterion("XTPG_SX in", values, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgSxNotIn(List<String> values) {
            addCriterion("XTPG_SX not in", values, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgSxBetween(String value1, String value2) {
            addCriterion("XTPG_SX between", value1, value2, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgSxNotBetween(String value1, String value2) {
            addCriterion("XTPG_SX not between", value1, value2, "xtpgSx");
            return (Criteria) this;
        }

        public Criteria andXtpgStIsNull() {
            addCriterion("XTPG_ST is null");
            return (Criteria) this;
        }

        public Criteria andXtpgStIsNotNull() {
            addCriterion("XTPG_ST is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgStEqualTo(String value) {
            addCriterion("XTPG_ST =", value, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgStNotEqualTo(String value) {
            addCriterion("XTPG_ST <>", value, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgStGreaterThan(String value) {
            addCriterion("XTPG_ST >", value, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgStGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_ST >=", value, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgStLessThan(String value) {
            addCriterion("XTPG_ST <", value, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgStLessThanOrEqualTo(String value) {
            addCriterion("XTPG_ST <=", value, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgStLike(String value) {
            addCriterion("XTPG_ST like", value, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgStNotLike(String value) {
            addCriterion("XTPG_ST not like", value, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgStIn(List<String> values) {
            addCriterion("XTPG_ST in", values, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgStNotIn(List<String> values) {
            addCriterion("XTPG_ST not in", values, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgStBetween(String value1, String value2) {
            addCriterion("XTPG_ST between", value1, value2, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgStNotBetween(String value1, String value2) {
            addCriterion("XTPG_ST not between", value1, value2, "xtpgSt");
            return (Criteria) this;
        }

        public Criteria andXtpgMxIsNull() {
            addCriterion("XTPG_MX is null");
            return (Criteria) this;
        }

        public Criteria andXtpgMxIsNotNull() {
            addCriterion("XTPG_MX is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgMxEqualTo(String value) {
            addCriterion("XTPG_MX =", value, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgMxNotEqualTo(String value) {
            addCriterion("XTPG_MX <>", value, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgMxGreaterThan(String value) {
            addCriterion("XTPG_MX >", value, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgMxGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_MX >=", value, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgMxLessThan(String value) {
            addCriterion("XTPG_MX <", value, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgMxLessThanOrEqualTo(String value) {
            addCriterion("XTPG_MX <=", value, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgMxLike(String value) {
            addCriterion("XTPG_MX like", value, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgMxNotLike(String value) {
            addCriterion("XTPG_MX not like", value, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgMxIn(List<String> values) {
            addCriterion("XTPG_MX in", values, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgMxNotIn(List<String> values) {
            addCriterion("XTPG_MX not in", values, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgMxBetween(String value1, String value2) {
            addCriterion("XTPG_MX between", value1, value2, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgMxNotBetween(String value1, String value2) {
            addCriterion("XTPG_MX not between", value1, value2, "xtpgMx");
            return (Criteria) this;
        }

        public Criteria andXtpgBmIsNull() {
            addCriterion("XTPG_BM is null");
            return (Criteria) this;
        }

        public Criteria andXtpgBmIsNotNull() {
            addCriterion("XTPG_BM is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgBmEqualTo(String value) {
            addCriterion("XTPG_BM =", value, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgBmNotEqualTo(String value) {
            addCriterion("XTPG_BM <>", value, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgBmGreaterThan(String value) {
            addCriterion("XTPG_BM >", value, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgBmGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_BM >=", value, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgBmLessThan(String value) {
            addCriterion("XTPG_BM <", value, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgBmLessThanOrEqualTo(String value) {
            addCriterion("XTPG_BM <=", value, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgBmLike(String value) {
            addCriterion("XTPG_BM like", value, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgBmNotLike(String value) {
            addCriterion("XTPG_BM not like", value, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgBmIn(List<String> values) {
            addCriterion("XTPG_BM in", values, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgBmNotIn(List<String> values) {
            addCriterion("XTPG_BM not in", values, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgBmBetween(String value1, String value2) {
            addCriterion("XTPG_BM between", value1, value2, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgBmNotBetween(String value1, String value2) {
            addCriterion("XTPG_BM not between", value1, value2, "xtpgBm");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodIsNull() {
            addCriterion("XTPG_AQCS_COD is null");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodIsNotNull() {
            addCriterion("XTPG_AQCS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodEqualTo(String value) {
            addCriterion("XTPG_AQCS_COD =", value, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodNotEqualTo(String value) {
            addCriterion("XTPG_AQCS_COD <>", value, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodGreaterThan(String value) {
            addCriterion("XTPG_AQCS_COD >", value, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_AQCS_COD >=", value, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodLessThan(String value) {
            addCriterion("XTPG_AQCS_COD <", value, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodLessThanOrEqualTo(String value) {
            addCriterion("XTPG_AQCS_COD <=", value, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodLike(String value) {
            addCriterion("XTPG_AQCS_COD like", value, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodNotLike(String value) {
            addCriterion("XTPG_AQCS_COD not like", value, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodIn(List<String> values) {
            addCriterion("XTPG_AQCS_COD in", values, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodNotIn(List<String> values) {
            addCriterion("XTPG_AQCS_COD not in", values, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodBetween(String value1, String value2) {
            addCriterion("XTPG_AQCS_COD between", value1, value2, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgAqcsCodNotBetween(String value1, String value2) {
            addCriterion("XTPG_AQCS_COD not between", value1, value2, "xtpgAqcsCod");
            return (Criteria) this;
        }

        public Criteria andXtpgHsIsNull() {
            addCriterion("XTPG_HS is null");
            return (Criteria) this;
        }

        public Criteria andXtpgHsIsNotNull() {
            addCriterion("XTPG_HS is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgHsEqualTo(String value) {
            addCriterion("XTPG_HS =", value, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgHsNotEqualTo(String value) {
            addCriterion("XTPG_HS <>", value, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgHsGreaterThan(String value) {
            addCriterion("XTPG_HS >", value, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgHsGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_HS >=", value, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgHsLessThan(String value) {
            addCriterion("XTPG_HS <", value, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgHsLessThanOrEqualTo(String value) {
            addCriterion("XTPG_HS <=", value, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgHsLike(String value) {
            addCriterion("XTPG_HS like", value, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgHsNotLike(String value) {
            addCriterion("XTPG_HS not like", value, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgHsIn(List<String> values) {
            addCriterion("XTPG_HS in", values, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgHsNotIn(List<String> values) {
            addCriterion("XTPG_HS not in", values, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgHsBetween(String value1, String value2) {
            addCriterion("XTPG_HS between", value1, value2, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgHsNotBetween(String value1, String value2) {
            addCriterion("XTPG_HS not between", value1, value2, "xtpgHs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsIsNull() {
            addCriterion("XTPG_SJHS is null");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsIsNotNull() {
            addCriterion("XTPG_SJHS is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsEqualTo(String value) {
            addCriterion("XTPG_SJHS =", value, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsNotEqualTo(String value) {
            addCriterion("XTPG_SJHS <>", value, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsGreaterThan(String value) {
            addCriterion("XTPG_SJHS >", value, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_SJHS >=", value, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsLessThan(String value) {
            addCriterion("XTPG_SJHS <", value, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsLessThanOrEqualTo(String value) {
            addCriterion("XTPG_SJHS <=", value, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsLike(String value) {
            addCriterion("XTPG_SJHS like", value, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsNotLike(String value) {
            addCriterion("XTPG_SJHS not like", value, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsIn(List<String> values) {
            addCriterion("XTPG_SJHS in", values, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsNotIn(List<String> values) {
            addCriterion("XTPG_SJHS not in", values, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsBetween(String value1, String value2) {
            addCriterion("XTPG_SJHS between", value1, value2, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgSjhsNotBetween(String value1, String value2) {
            addCriterion("XTPG_SJHS not between", value1, value2, "xtpgSjhs");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoIsNull() {
            addCriterion("XTPG_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoIsNotNull() {
            addCriterion("XTPG_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoEqualTo(String value) {
            addCriterion("XTPG_MEMO =", value, "xtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoNotEqualTo(String value) {
            addCriterion("XTPG_MEMO <>", value, "xtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoGreaterThan(String value) {
            addCriterion("XTPG_MEMO >", value, "xtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_MEMO >=", value, "xtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoLessThan(String value) {
            addCriterion("XTPG_MEMO <", value, "xtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoLessThanOrEqualTo(String value) {
            addCriterion("XTPG_MEMO <=", value, "xtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoLike(String value) {
            addCriterion("XTPG_MEMO like", value, "xtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoNotLike(String value) {
            addCriterion("XTPG_MEMO not like", value, "xtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoIn(List<String> values) {
            addCriterion("XTPG_MEMO in", values, "xtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoNotIn(List<String> values) {
            addCriterion("XTPG_MEMO not in", values, "xtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoBetween(String value1, String value2) {
            addCriterion("XTPG_MEMO between", value1, value2, "xtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXtpgMemoNotBetween(String value1, String value2) {
            addCriterion("XTPG_MEMO not between", value1, value2, "xtpgMemo");
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

        public Criteria andXtpgSjFlgIsNull() {
            addCriterion("XTPG_SJ_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgIsNotNull() {
            addCriterion("XTPG_SJ_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgEqualTo(String value) {
            addCriterion("XTPG_SJ_FLG =", value, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgNotEqualTo(String value) {
            addCriterion("XTPG_SJ_FLG <>", value, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgGreaterThan(String value) {
            addCriterion("XTPG_SJ_FLG >", value, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_SJ_FLG >=", value, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgLessThan(String value) {
            addCriterion("XTPG_SJ_FLG <", value, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgLessThanOrEqualTo(String value) {
            addCriterion("XTPG_SJ_FLG <=", value, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgLike(String value) {
            addCriterion("XTPG_SJ_FLG like", value, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgNotLike(String value) {
            addCriterion("XTPG_SJ_FLG not like", value, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgIn(List<String> values) {
            addCriterion("XTPG_SJ_FLG in", values, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgNotIn(List<String> values) {
            addCriterion("XTPG_SJ_FLG not in", values, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgBetween(String value1, String value2) {
            addCriterion("XTPG_SJ_FLG between", value1, value2, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgSjFlgNotBetween(String value1, String value2) {
            addCriterion("XTPG_SJ_FLG not between", value1, value2, "xtpgSjFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgIsNull() {
            addCriterion("XTPG_HX_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgIsNotNull() {
            addCriterion("XTPG_HX_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgEqualTo(String value) {
            addCriterion("XTPG_HX_FLG =", value, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgNotEqualTo(String value) {
            addCriterion("XTPG_HX_FLG <>", value, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgGreaterThan(String value) {
            addCriterion("XTPG_HX_FLG >", value, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_HX_FLG >=", value, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgLessThan(String value) {
            addCriterion("XTPG_HX_FLG <", value, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgLessThanOrEqualTo(String value) {
            addCriterion("XTPG_HX_FLG <=", value, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgLike(String value) {
            addCriterion("XTPG_HX_FLG like", value, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgNotLike(String value) {
            addCriterion("XTPG_HX_FLG not like", value, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgIn(List<String> values) {
            addCriterion("XTPG_HX_FLG in", values, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgNotIn(List<String> values) {
            addCriterion("XTPG_HX_FLG not in", values, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgBetween(String value1, String value2) {
            addCriterion("XTPG_HX_FLG between", value1, value2, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgHxFlgNotBetween(String value1, String value2) {
            addCriterion("XTPG_HX_FLG not between", value1, value2, "xtpgHxFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgIsNull() {
            addCriterion("XTPG_XXG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgIsNotNull() {
            addCriterion("XTPG_XXG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgEqualTo(String value) {
            addCriterion("XTPG_XXG_FLG =", value, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgNotEqualTo(String value) {
            addCriterion("XTPG_XXG_FLG <>", value, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgGreaterThan(String value) {
            addCriterion("XTPG_XXG_FLG >", value, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_XXG_FLG >=", value, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgLessThan(String value) {
            addCriterion("XTPG_XXG_FLG <", value, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgLessThanOrEqualTo(String value) {
            addCriterion("XTPG_XXG_FLG <=", value, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgLike(String value) {
            addCriterion("XTPG_XXG_FLG like", value, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgNotLike(String value) {
            addCriterion("XTPG_XXG_FLG not like", value, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgIn(List<String> values) {
            addCriterion("XTPG_XXG_FLG in", values, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgNotIn(List<String> values) {
            addCriterion("XTPG_XXG_FLG not in", values, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgBetween(String value1, String value2) {
            addCriterion("XTPG_XXG_FLG between", value1, value2, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXxgFlgNotBetween(String value1, String value2) {
            addCriterion("XTPG_XXG_FLG not between", value1, value2, "xtpgXxgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgIsNull() {
            addCriterion("XTPG_XH_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgIsNotNull() {
            addCriterion("XTPG_XH_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgEqualTo(String value) {
            addCriterion("XTPG_XH_FLG =", value, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgNotEqualTo(String value) {
            addCriterion("XTPG_XH_FLG <>", value, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgGreaterThan(String value) {
            addCriterion("XTPG_XH_FLG >", value, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_XH_FLG >=", value, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgLessThan(String value) {
            addCriterion("XTPG_XH_FLG <", value, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgLessThanOrEqualTo(String value) {
            addCriterion("XTPG_XH_FLG <=", value, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgLike(String value) {
            addCriterion("XTPG_XH_FLG like", value, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgNotLike(String value) {
            addCriterion("XTPG_XH_FLG not like", value, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgIn(List<String> values) {
            addCriterion("XTPG_XH_FLG in", values, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgNotIn(List<String> values) {
            addCriterion("XTPG_XH_FLG not in", values, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgBetween(String value1, String value2) {
            addCriterion("XTPG_XH_FLG between", value1, value2, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXhFlgNotBetween(String value1, String value2) {
            addCriterion("XTPG_XH_FLG not between", value1, value2, "xtpgXhFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgIsNull() {
            addCriterion("XTPG_MN_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgIsNotNull() {
            addCriterion("XTPG_MN_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgEqualTo(String value) {
            addCriterion("XTPG_MN_FLG =", value, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgNotEqualTo(String value) {
            addCriterion("XTPG_MN_FLG <>", value, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgGreaterThan(String value) {
            addCriterion("XTPG_MN_FLG >", value, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_MN_FLG >=", value, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgLessThan(String value) {
            addCriterion("XTPG_MN_FLG <", value, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgLessThanOrEqualTo(String value) {
            addCriterion("XTPG_MN_FLG <=", value, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgLike(String value) {
            addCriterion("XTPG_MN_FLG like", value, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgNotLike(String value) {
            addCriterion("XTPG_MN_FLG not like", value, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgIn(List<String> values) {
            addCriterion("XTPG_MN_FLG in", values, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgNotIn(List<String> values) {
            addCriterion("XTPG_MN_FLG not in", values, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgBetween(String value1, String value2) {
            addCriterion("XTPG_MN_FLG between", value1, value2, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgMnFlgNotBetween(String value1, String value2) {
            addCriterion("XTPG_MN_FLG not between", value1, value2, "xtpgMnFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgIsNull() {
            addCriterion("XTPG_GG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgIsNotNull() {
            addCriterion("XTPG_GG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgEqualTo(String value) {
            addCriterion("XTPG_GG_FLG =", value, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgNotEqualTo(String value) {
            addCriterion("XTPG_GG_FLG <>", value, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgGreaterThan(String value) {
            addCriterion("XTPG_GG_FLG >", value, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_GG_FLG >=", value, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgLessThan(String value) {
            addCriterion("XTPG_GG_FLG <", value, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgLessThanOrEqualTo(String value) {
            addCriterion("XTPG_GG_FLG <=", value, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgLike(String value) {
            addCriterion("XTPG_GG_FLG like", value, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgNotLike(String value) {
            addCriterion("XTPG_GG_FLG not like", value, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgIn(List<String> values) {
            addCriterion("XTPG_GG_FLG in", values, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgNotIn(List<String> values) {
            addCriterion("XTPG_GG_FLG not in", values, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgBetween(String value1, String value2) {
            addCriterion("XTPG_GG_FLG between", value1, value2, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgGgFlgNotBetween(String value1, String value2) {
            addCriterion("XTPG_GG_FLG not between", value1, value2, "xtpgGgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgIsNull() {
            addCriterion("XTPG_XL_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgIsNotNull() {
            addCriterion("XTPG_XL_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgEqualTo(String value) {
            addCriterion("XTPG_XL_FLG =", value, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgNotEqualTo(String value) {
            addCriterion("XTPG_XL_FLG <>", value, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgGreaterThan(String value) {
            addCriterion("XTPG_XL_FLG >", value, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_XL_FLG >=", value, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgLessThan(String value) {
            addCriterion("XTPG_XL_FLG <", value, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgLessThanOrEqualTo(String value) {
            addCriterion("XTPG_XL_FLG <=", value, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgLike(String value) {
            addCriterion("XTPG_XL_FLG like", value, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgNotLike(String value) {
            addCriterion("XTPG_XL_FLG not like", value, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgIn(List<String> values) {
            addCriterion("XTPG_XL_FLG in", values, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgNotIn(List<String> values) {
            addCriterion("XTPG_XL_FLG not in", values, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgBetween(String value1, String value2) {
            addCriterion("XTPG_XL_FLG between", value1, value2, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgXlFlgNotBetween(String value1, String value2) {
            addCriterion("XTPG_XL_FLG not between", value1, value2, "xtpgXlFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgIsNull() {
            addCriterion("XTPG_DG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgIsNotNull() {
            addCriterion("XTPG_DG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgEqualTo(String value) {
            addCriterion("XTPG_DG_FLG =", value, "xtpgDgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgNotEqualTo(String value) {
            addCriterion("XTPG_DG_FLG <>", value, "xtpgDgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgGreaterThan(String value) {
            addCriterion("XTPG_DG_FLG >", value, "xtpgDgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_DG_FLG >=", value, "xtpgDgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgLessThan(String value) {
            addCriterion("XTPG_DG_FLG <", value, "xtpgDgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgLessThanOrEqualTo(String value) {
            addCriterion("XTPG_DG_FLG <=", value, "xtpgDgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgLike(String value) {
            addCriterion("XTPG_DG_FLG like", value, "xtpgDgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgNotLike(String value) {
            addCriterion("XTPG_DG_FLG not like", value, "xtpgDgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgIn(List<String> values) {
            addCriterion("XTPG_DG_FLG in", values, "xtpgDgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgNotIn(List<String> values) {
            addCriterion("XTPG_DG_FLG not in", values, "xtpgDgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgBetween(String value1, String value2) {
            addCriterion("XTPG_DG_FLG between", value1, value2, "xtpgDgFlg");
            return (Criteria) this;
        }

        public Criteria andXtpgDgFlgNotBetween(String value1, String value2) {
            addCriterion("XTPG_DG_FLG not between", value1, value2, "xtpgDgFlg");
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