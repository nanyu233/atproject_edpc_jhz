package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspMnszxtpgInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspMnszxtpgInfExample() {
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

        public Criteria andMnszxtpgPnCodIsNull() {
            addCriterion("MNSZXTPG_PN_COD is null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodIsNotNull() {
            addCriterion("MNSZXTPG_PN_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodEqualTo(String value) {
            addCriterion("MNSZXTPG_PN_COD =", value, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodNotEqualTo(String value) {
            addCriterion("MNSZXTPG_PN_COD <>", value, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodGreaterThan(String value) {
            addCriterion("MNSZXTPG_PN_COD >", value, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodGreaterThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_PN_COD >=", value, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodLessThan(String value) {
            addCriterion("MNSZXTPG_PN_COD <", value, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodLessThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_PN_COD <=", value, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodLike(String value) {
            addCriterion("MNSZXTPG_PN_COD like", value, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodNotLike(String value) {
            addCriterion("MNSZXTPG_PN_COD not like", value, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodIn(List<String> values) {
            addCriterion("MNSZXTPG_PN_COD in", values, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodNotIn(List<String> values) {
            addCriterion("MNSZXTPG_PN_COD not in", values, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_PN_COD between", value1, value2, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPnCodNotBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_PN_COD not between", value1, value2, "mnszxtpgPnCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodIsNull() {
            addCriterion("MNSZXTPG_NYXZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodIsNotNull() {
            addCriterion("MNSZXTPG_NYXZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodEqualTo(String value) {
            addCriterion("MNSZXTPG_NYXZ_COD =", value, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodNotEqualTo(String value) {
            addCriterion("MNSZXTPG_NYXZ_COD <>", value, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodGreaterThan(String value) {
            addCriterion("MNSZXTPG_NYXZ_COD >", value, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodGreaterThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_NYXZ_COD >=", value, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodLessThan(String value) {
            addCriterion("MNSZXTPG_NYXZ_COD <", value, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodLessThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_NYXZ_COD <=", value, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodLike(String value) {
            addCriterion("MNSZXTPG_NYXZ_COD like", value, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodNotLike(String value) {
            addCriterion("MNSZXTPG_NYXZ_COD not like", value, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodIn(List<String> values) {
            addCriterion("MNSZXTPG_NYXZ_COD in", values, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodNotIn(List<String> values) {
            addCriterion("MNSZXTPG_NYXZ_COD not in", values, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_NYXZ_COD between", value1, value2, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgNyxzCodNotBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_NYXZ_COD not between", value1, value2, "mnszxtpgNyxzCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgIsNull() {
            addCriterion("MNSZXTPG_PGCX_FLG is null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgIsNotNull() {
            addCriterion("MNSZXTPG_PGCX_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgEqualTo(String value) {
            addCriterion("MNSZXTPG_PGCX_FLG =", value, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgNotEqualTo(String value) {
            addCriterion("MNSZXTPG_PGCX_FLG <>", value, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgGreaterThan(String value) {
            addCriterion("MNSZXTPG_PGCX_FLG >", value, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgGreaterThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_PGCX_FLG >=", value, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgLessThan(String value) {
            addCriterion("MNSZXTPG_PGCX_FLG <", value, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgLessThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_PGCX_FLG <=", value, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgLike(String value) {
            addCriterion("MNSZXTPG_PGCX_FLG like", value, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgNotLike(String value) {
            addCriterion("MNSZXTPG_PGCX_FLG not like", value, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgIn(List<String> values) {
            addCriterion("MNSZXTPG_PGCX_FLG in", values, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgNotIn(List<String> values) {
            addCriterion("MNSZXTPG_PGCX_FLG not in", values, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_PGCX_FLG between", value1, value2, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgPgcxFlgNotBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_PGCX_FLG not between", value1, value2, "mnszxtpgPgcxFlg");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodIsNull() {
            addCriterion("MNSZXTPG_TX_COD is null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodIsNotNull() {
            addCriterion("MNSZXTPG_TX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodEqualTo(String value) {
            addCriterion("MNSZXTPG_TX_COD =", value, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodNotEqualTo(String value) {
            addCriterion("MNSZXTPG_TX_COD <>", value, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodGreaterThan(String value) {
            addCriterion("MNSZXTPG_TX_COD >", value, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodGreaterThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_TX_COD >=", value, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodLessThan(String value) {
            addCriterion("MNSZXTPG_TX_COD <", value, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodLessThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_TX_COD <=", value, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodLike(String value) {
            addCriterion("MNSZXTPG_TX_COD like", value, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodNotLike(String value) {
            addCriterion("MNSZXTPG_TX_COD not like", value, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodIn(List<String> values) {
            addCriterion("MNSZXTPG_TX_COD in", values, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodNotIn(List<String> values) {
            addCriterion("MNSZXTPG_TX_COD not in", values, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_TX_COD between", value1, value2, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgTxCodNotBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_TX_COD not between", value1, value2, "mnszxtpgTxCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodIsNull() {
            addCriterion("MNSZXTPG_DJMW_COD is null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodIsNotNull() {
            addCriterion("MNSZXTPG_DJMW_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodEqualTo(String value) {
            addCriterion("MNSZXTPG_DJMW_COD =", value, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodNotEqualTo(String value) {
            addCriterion("MNSZXTPG_DJMW_COD <>", value, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodGreaterThan(String value) {
            addCriterion("MNSZXTPG_DJMW_COD >", value, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodGreaterThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_DJMW_COD >=", value, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodLessThan(String value) {
            addCriterion("MNSZXTPG_DJMW_COD <", value, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodLessThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_DJMW_COD <=", value, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodLike(String value) {
            addCriterion("MNSZXTPG_DJMW_COD like", value, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodNotLike(String value) {
            addCriterion("MNSZXTPG_DJMW_COD not like", value, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodIn(List<String> values) {
            addCriterion("MNSZXTPG_DJMW_COD in", values, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodNotIn(List<String> values) {
            addCriterion("MNSZXTPG_DJMW_COD not in", values, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_DJMW_COD between", value1, value2, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgDjmwCodNotBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_DJMW_COD not between", value1, value2, "mnszxtpgDjmwCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodIsNull() {
            addCriterion("MNSZXTPG_RSZT_COD is null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodIsNotNull() {
            addCriterion("MNSZXTPG_RSZT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodEqualTo(String value) {
            addCriterion("MNSZXTPG_RSZT_COD =", value, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodNotEqualTo(String value) {
            addCriterion("MNSZXTPG_RSZT_COD <>", value, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodGreaterThan(String value) {
            addCriterion("MNSZXTPG_RSZT_COD >", value, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodGreaterThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_RSZT_COD >=", value, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodLessThan(String value) {
            addCriterion("MNSZXTPG_RSZT_COD <", value, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodLessThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_RSZT_COD <=", value, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodLike(String value) {
            addCriterion("MNSZXTPG_RSZT_COD like", value, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodNotLike(String value) {
            addCriterion("MNSZXTPG_RSZT_COD not like", value, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodIn(List<String> values) {
            addCriterion("MNSZXTPG_RSZT_COD in", values, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodNotIn(List<String> values) {
            addCriterion("MNSZXTPG_RSZT_COD not in", values, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_RSZT_COD between", value1, value2, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgRsztCodNotBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_RSZT_COD not between", value1, value2, "mnszxtpgRsztCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodIsNull() {
            addCriterion("MNSZXTPG_YJ_COD is null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodIsNotNull() {
            addCriterion("MNSZXTPG_YJ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodEqualTo(String value) {
            addCriterion("MNSZXTPG_YJ_COD =", value, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodNotEqualTo(String value) {
            addCriterion("MNSZXTPG_YJ_COD <>", value, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodGreaterThan(String value) {
            addCriterion("MNSZXTPG_YJ_COD >", value, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodGreaterThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_YJ_COD >=", value, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodLessThan(String value) {
            addCriterion("MNSZXTPG_YJ_COD <", value, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodLessThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_YJ_COD <=", value, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodLike(String value) {
            addCriterion("MNSZXTPG_YJ_COD like", value, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodNotLike(String value) {
            addCriterion("MNSZXTPG_YJ_COD not like", value, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodIn(List<String> values) {
            addCriterion("MNSZXTPG_YJ_COD in", values, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodNotIn(List<String> values) {
            addCriterion("MNSZXTPG_YJ_COD not in", values, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_YJ_COD between", value1, value2, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgYjCodNotBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_YJ_COD not between", value1, value2, "mnszxtpgYjCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodIsNull() {
            addCriterion("MNSZXTPG_BD_COD is null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodIsNotNull() {
            addCriterion("MNSZXTPG_BD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodEqualTo(String value) {
            addCriterion("MNSZXTPG_BD_COD =", value, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodNotEqualTo(String value) {
            addCriterion("MNSZXTPG_BD_COD <>", value, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodGreaterThan(String value) {
            addCriterion("MNSZXTPG_BD_COD >", value, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodGreaterThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_BD_COD >=", value, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodLessThan(String value) {
            addCriterion("MNSZXTPG_BD_COD <", value, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodLessThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_BD_COD <=", value, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodLike(String value) {
            addCriterion("MNSZXTPG_BD_COD like", value, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodNotLike(String value) {
            addCriterion("MNSZXTPG_BD_COD not like", value, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodIn(List<String> values) {
            addCriterion("MNSZXTPG_BD_COD in", values, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodNotIn(List<String> values) {
            addCriterion("MNSZXTPG_BD_COD not in", values, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_BD_COD between", value1, value2, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdCodNotBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_BD_COD not between", value1, value2, "mnszxtpgBdCod");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtIsNull() {
            addCriterion("MNSZXTPG_BD_QT is null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtIsNotNull() {
            addCriterion("MNSZXTPG_BD_QT is not null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtEqualTo(String value) {
            addCriterion("MNSZXTPG_BD_QT =", value, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtNotEqualTo(String value) {
            addCriterion("MNSZXTPG_BD_QT <>", value, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtGreaterThan(String value) {
            addCriterion("MNSZXTPG_BD_QT >", value, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtGreaterThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_BD_QT >=", value, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtLessThan(String value) {
            addCriterion("MNSZXTPG_BD_QT <", value, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtLessThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_BD_QT <=", value, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtLike(String value) {
            addCriterion("MNSZXTPG_BD_QT like", value, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtNotLike(String value) {
            addCriterion("MNSZXTPG_BD_QT not like", value, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtIn(List<String> values) {
            addCriterion("MNSZXTPG_BD_QT in", values, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtNotIn(List<String> values) {
            addCriterion("MNSZXTPG_BD_QT not in", values, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_BD_QT between", value1, value2, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgBdQtNotBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_BD_QT not between", value1, value2, "mnszxtpgBdQt");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoIsNull() {
            addCriterion("MNSZXTPG_MENO is null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoIsNotNull() {
            addCriterion("MNSZXTPG_MENO is not null");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoEqualTo(String value) {
            addCriterion("MNSZXTPG_MENO =", value, "mnszxtpgMeno");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoNotEqualTo(String value) {
            addCriterion("MNSZXTPG_MENO <>", value, "mnszxtpgMeno");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoGreaterThan(String value) {
            addCriterion("MNSZXTPG_MENO >", value, "mnszxtpgMeno");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoGreaterThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_MENO >=", value, "mnszxtpgMeno");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoLessThan(String value) {
            addCriterion("MNSZXTPG_MENO <", value, "mnszxtpgMeno");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoLessThanOrEqualTo(String value) {
            addCriterion("MNSZXTPG_MENO <=", value, "mnszxtpgMeno");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoLike(String value) {
            addCriterion("MNSZXTPG_MENO like", value, "mnszxtpgMeno");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoNotLike(String value) {
            addCriterion("MNSZXTPG_MENO not like", value, "mnszxtpgMeno");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoIn(List<String> values) {
            addCriterion("MNSZXTPG_MENO in", values, "mnszxtpgMeno");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoNotIn(List<String> values) {
            addCriterion("MNSZXTPG_MENO not in", values, "mnszxtpgMeno");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_MENO between", value1, value2, "mnszxtpgMeno");
            return (Criteria) this;
        }

        public Criteria andMnszxtpgMenoNotBetween(String value1, String value2) {
            addCriterion("MNSZXTPG_MENO not between", value1, value2, "mnszxtpgMeno");
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