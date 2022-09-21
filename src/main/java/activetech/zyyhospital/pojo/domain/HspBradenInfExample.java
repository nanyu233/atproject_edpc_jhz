package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspBradenInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspBradenInfExample() {
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

        public Criteria andBradenGjCodIsNull() {
            addCriterion("BRADEN_GJ_COD is null");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodIsNotNull() {
            addCriterion("BRADEN_GJ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodEqualTo(String value) {
            addCriterion("BRADEN_GJ_COD =", value, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodNotEqualTo(String value) {
            addCriterion("BRADEN_GJ_COD <>", value, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodGreaterThan(String value) {
            addCriterion("BRADEN_GJ_COD >", value, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodGreaterThanOrEqualTo(String value) {
            addCriterion("BRADEN_GJ_COD >=", value, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodLessThan(String value) {
            addCriterion("BRADEN_GJ_COD <", value, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodLessThanOrEqualTo(String value) {
            addCriterion("BRADEN_GJ_COD <=", value, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodLike(String value) {
            addCriterion("BRADEN_GJ_COD like", value, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodNotLike(String value) {
            addCriterion("BRADEN_GJ_COD not like", value, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodIn(List<String> values) {
            addCriterion("BRADEN_GJ_COD in", values, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodNotIn(List<String> values) {
            addCriterion("BRADEN_GJ_COD not in", values, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodBetween(String value1, String value2) {
            addCriterion("BRADEN_GJ_COD between", value1, value2, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenGjCodNotBetween(String value1, String value2) {
            addCriterion("BRADEN_GJ_COD not between", value1, value2, "bradenGjCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodIsNull() {
            addCriterion("BRADEN_CS_COD is null");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodIsNotNull() {
            addCriterion("BRADEN_CS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodEqualTo(String value) {
            addCriterion("BRADEN_CS_COD =", value, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodNotEqualTo(String value) {
            addCriterion("BRADEN_CS_COD <>", value, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodGreaterThan(String value) {
            addCriterion("BRADEN_CS_COD >", value, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodGreaterThanOrEqualTo(String value) {
            addCriterion("BRADEN_CS_COD >=", value, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodLessThan(String value) {
            addCriterion("BRADEN_CS_COD <", value, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodLessThanOrEqualTo(String value) {
            addCriterion("BRADEN_CS_COD <=", value, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodLike(String value) {
            addCriterion("BRADEN_CS_COD like", value, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodNotLike(String value) {
            addCriterion("BRADEN_CS_COD not like", value, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodIn(List<String> values) {
            addCriterion("BRADEN_CS_COD in", values, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodNotIn(List<String> values) {
            addCriterion("BRADEN_CS_COD not in", values, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodBetween(String value1, String value2) {
            addCriterion("BRADEN_CS_COD between", value1, value2, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenCsCodNotBetween(String value1, String value2) {
            addCriterion("BRADEN_CS_COD not between", value1, value2, "bradenCsCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodIsNull() {
            addCriterion("BRADEN_HDNL_COD is null");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodIsNotNull() {
            addCriterion("BRADEN_HDNL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodEqualTo(String value) {
            addCriterion("BRADEN_HDNL_COD =", value, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodNotEqualTo(String value) {
            addCriterion("BRADEN_HDNL_COD <>", value, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodGreaterThan(String value) {
            addCriterion("BRADEN_HDNL_COD >", value, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodGreaterThanOrEqualTo(String value) {
            addCriterion("BRADEN_HDNL_COD >=", value, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodLessThan(String value) {
            addCriterion("BRADEN_HDNL_COD <", value, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodLessThanOrEqualTo(String value) {
            addCriterion("BRADEN_HDNL_COD <=", value, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodLike(String value) {
            addCriterion("BRADEN_HDNL_COD like", value, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodNotLike(String value) {
            addCriterion("BRADEN_HDNL_COD not like", value, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodIn(List<String> values) {
            addCriterion("BRADEN_HDNL_COD in", values, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodNotIn(List<String> values) {
            addCriterion("BRADEN_HDNL_COD not in", values, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodBetween(String value1, String value2) {
            addCriterion("BRADEN_HDNL_COD between", value1, value2, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenHdnlCodNotBetween(String value1, String value2) {
            addCriterion("BRADEN_HDNL_COD not between", value1, value2, "bradenHdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodIsNull() {
            addCriterion("BRADEN_YDNL_COD is null");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodIsNotNull() {
            addCriterion("BRADEN_YDNL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodEqualTo(String value) {
            addCriterion("BRADEN_YDNL_COD =", value, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodNotEqualTo(String value) {
            addCriterion("BRADEN_YDNL_COD <>", value, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodGreaterThan(String value) {
            addCriterion("BRADEN_YDNL_COD >", value, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodGreaterThanOrEqualTo(String value) {
            addCriterion("BRADEN_YDNL_COD >=", value, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodLessThan(String value) {
            addCriterion("BRADEN_YDNL_COD <", value, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodLessThanOrEqualTo(String value) {
            addCriterion("BRADEN_YDNL_COD <=", value, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodLike(String value) {
            addCriterion("BRADEN_YDNL_COD like", value, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodNotLike(String value) {
            addCriterion("BRADEN_YDNL_COD not like", value, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodIn(List<String> values) {
            addCriterion("BRADEN_YDNL_COD in", values, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodNotIn(List<String> values) {
            addCriterion("BRADEN_YDNL_COD not in", values, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodBetween(String value1, String value2) {
            addCriterion("BRADEN_YDNL_COD between", value1, value2, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYdnlCodNotBetween(String value1, String value2) {
            addCriterion("BRADEN_YDNL_COD not between", value1, value2, "bradenYdnlCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodIsNull() {
            addCriterion("BRADEN_YY_COD is null");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodIsNotNull() {
            addCriterion("BRADEN_YY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodEqualTo(String value) {
            addCriterion("BRADEN_YY_COD =", value, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodNotEqualTo(String value) {
            addCriterion("BRADEN_YY_COD <>", value, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodGreaterThan(String value) {
            addCriterion("BRADEN_YY_COD >", value, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodGreaterThanOrEqualTo(String value) {
            addCriterion("BRADEN_YY_COD >=", value, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodLessThan(String value) {
            addCriterion("BRADEN_YY_COD <", value, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodLessThanOrEqualTo(String value) {
            addCriterion("BRADEN_YY_COD <=", value, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodLike(String value) {
            addCriterion("BRADEN_YY_COD like", value, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodNotLike(String value) {
            addCriterion("BRADEN_YY_COD not like", value, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodIn(List<String> values) {
            addCriterion("BRADEN_YY_COD in", values, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodNotIn(List<String> values) {
            addCriterion("BRADEN_YY_COD not in", values, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodBetween(String value1, String value2) {
            addCriterion("BRADEN_YY_COD between", value1, value2, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenYyCodNotBetween(String value1, String value2) {
            addCriterion("BRADEN_YY_COD not between", value1, value2, "bradenYyCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodIsNull() {
            addCriterion("BRADEN_MCHJQL_COD is null");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodIsNotNull() {
            addCriterion("BRADEN_MCHJQL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodEqualTo(String value) {
            addCriterion("BRADEN_MCHJQL_COD =", value, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodNotEqualTo(String value) {
            addCriterion("BRADEN_MCHJQL_COD <>", value, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodGreaterThan(String value) {
            addCriterion("BRADEN_MCHJQL_COD >", value, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodGreaterThanOrEqualTo(String value) {
            addCriterion("BRADEN_MCHJQL_COD >=", value, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodLessThan(String value) {
            addCriterion("BRADEN_MCHJQL_COD <", value, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodLessThanOrEqualTo(String value) {
            addCriterion("BRADEN_MCHJQL_COD <=", value, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodLike(String value) {
            addCriterion("BRADEN_MCHJQL_COD like", value, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodNotLike(String value) {
            addCriterion("BRADEN_MCHJQL_COD not like", value, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodIn(List<String> values) {
            addCriterion("BRADEN_MCHJQL_COD in", values, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodNotIn(List<String> values) {
            addCriterion("BRADEN_MCHJQL_COD not in", values, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodBetween(String value1, String value2) {
            addCriterion("BRADEN_MCHJQL_COD between", value1, value2, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenMchjqlCodNotBetween(String value1, String value2) {
            addCriterion("BRADEN_MCHJQL_COD not between", value1, value2, "bradenMchjqlCod");
            return (Criteria) this;
        }

        public Criteria andBradenScoIsNull() {
            addCriterion("BRADEN_SCO is null");
            return (Criteria) this;
        }

        public Criteria andBradenScoIsNotNull() {
            addCriterion("BRADEN_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andBradenScoEqualTo(Long value) {
            addCriterion("BRADEN_SCO =", value, "bradenSco");
            return (Criteria) this;
        }

        public Criteria andBradenScoNotEqualTo(Long value) {
            addCriterion("BRADEN_SCO <>", value, "bradenSco");
            return (Criteria) this;
        }

        public Criteria andBradenScoGreaterThan(Long value) {
            addCriterion("BRADEN_SCO >", value, "bradenSco");
            return (Criteria) this;
        }

        public Criteria andBradenScoGreaterThanOrEqualTo(Long value) {
            addCriterion("BRADEN_SCO >=", value, "bradenSco");
            return (Criteria) this;
        }

        public Criteria andBradenScoLessThan(Long value) {
            addCriterion("BRADEN_SCO <", value, "bradenSco");
            return (Criteria) this;
        }

        public Criteria andBradenScoLessThanOrEqualTo(Long value) {
            addCriterion("BRADEN_SCO <=", value, "bradenSco");
            return (Criteria) this;
        }

        public Criteria andBradenScoIn(List<Long> values) {
            addCriterion("BRADEN_SCO in", values, "bradenSco");
            return (Criteria) this;
        }

        public Criteria andBradenScoNotIn(List<Long> values) {
            addCriterion("BRADEN_SCO not in", values, "bradenSco");
            return (Criteria) this;
        }

        public Criteria andBradenScoBetween(Long value1, Long value2) {
            addCriterion("BRADEN_SCO between", value1, value2, "bradenSco");
            return (Criteria) this;
        }

        public Criteria andBradenScoNotBetween(Long value1, Long value2) {
            addCriterion("BRADEN_SCO not between", value1, value2, "bradenSco");
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

        public Criteria andCratDatIsNull() {
            addCriterion("CRAT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCratDatIsNotNull() {
            addCriterion("CRAT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCratDatEqualTo(Date value) {
            addCriterion("CRAT_DAT =", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatNotEqualTo(Date value) {
            addCriterion("CRAT_DAT <>", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatGreaterThan(Date value) {
            addCriterion("CRAT_DAT >", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CRAT_DAT >=", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatLessThan(Date value) {
            addCriterion("CRAT_DAT <", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatLessThanOrEqualTo(Date value) {
            addCriterion("CRAT_DAT <=", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatIn(List<Date> values) {
            addCriterion("CRAT_DAT in", values, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatNotIn(List<Date> values) {
            addCriterion("CRAT_DAT not in", values, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatBetween(Date value1, Date value2) {
            addCriterion("CRAT_DAT between", value1, value2, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatNotBetween(Date value1, Date value2) {
            addCriterion("CRAT_DAT not between", value1, value2, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoIsNull() {
            addCriterion("CRT_USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoIsNotNull() {
            addCriterion("CRT_USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoEqualTo(String value) {
            addCriterion("CRT_USR_NO =", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotEqualTo(String value) {
            addCriterion("CRT_USR_NO <>", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoGreaterThan(String value) {
            addCriterion("CRT_USR_NO >", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NO >=", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLessThan(String value) {
            addCriterion("CRT_USR_NO <", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NO <=", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLike(String value) {
            addCriterion("CRT_USR_NO like", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotLike(String value) {
            addCriterion("CRT_USR_NO not like", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoIn(List<String> values) {
            addCriterion("CRT_USR_NO in", values, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotIn(List<String> values) {
            addCriterion("CRT_USR_NO not in", values, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoBetween(String value1, String value2) {
            addCriterion("CRT_USR_NO between", value1, value2, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_NO not between", value1, value2, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeIsNull() {
            addCriterion("CRT_USR_NME is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeIsNotNull() {
            addCriterion("CRT_USR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeEqualTo(String value) {
            addCriterion("CRT_USR_NME =", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotEqualTo(String value) {
            addCriterion("CRT_USR_NME <>", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeGreaterThan(String value) {
            addCriterion("CRT_USR_NME >", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NME >=", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLessThan(String value) {
            addCriterion("CRT_USR_NME <", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NME <=", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLike(String value) {
            addCriterion("CRT_USR_NME like", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotLike(String value) {
            addCriterion("CRT_USR_NME not like", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeIn(List<String> values) {
            addCriterion("CRT_USR_NME in", values, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotIn(List<String> values) {
            addCriterion("CRT_USR_NME not in", values, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeBetween(String value1, String value2) {
            addCriterion("CRT_USR_NME between", value1, value2, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_NME not between", value1, value2, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoIsNull() {
            addCriterion("UPD_USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoIsNotNull() {
            addCriterion("UPD_USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoEqualTo(String value) {
            addCriterion("UPD_USR_NO =", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotEqualTo(String value) {
            addCriterion("UPD_USR_NO <>", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoGreaterThan(String value) {
            addCriterion("UPD_USR_NO >", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NO >=", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoLessThan(String value) {
            addCriterion("UPD_USR_NO <", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoLessThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NO <=", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoLike(String value) {
            addCriterion("UPD_USR_NO like", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotLike(String value) {
            addCriterion("UPD_USR_NO not like", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoIn(List<String> values) {
            addCriterion("UPD_USR_NO in", values, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotIn(List<String> values) {
            addCriterion("UPD_USR_NO not in", values, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoBetween(String value1, String value2) {
            addCriterion("UPD_USR_NO between", value1, value2, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotBetween(String value1, String value2) {
            addCriterion("UPD_USR_NO not between", value1, value2, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeIsNull() {
            addCriterion("UPD_USR_NME is null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeIsNotNull() {
            addCriterion("UPD_USR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeEqualTo(String value) {
            addCriterion("UPD_USR_NME =", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeNotEqualTo(String value) {
            addCriterion("UPD_USR_NME <>", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeGreaterThan(String value) {
            addCriterion("UPD_USR_NME >", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NME >=", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeLessThan(String value) {
            addCriterion("UPD_USR_NME <", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeLessThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NME <=", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeLike(String value) {
            addCriterion("UPD_USR_NME like", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeNotLike(String value) {
            addCriterion("UPD_USR_NME not like", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeIn(List<String> values) {
            addCriterion("UPD_USR_NME in", values, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeNotIn(List<String> values) {
            addCriterion("UPD_USR_NME not in", values, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeBetween(String value1, String value2) {
            addCriterion("UPD_USR_NME between", value1, value2, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeNotBetween(String value1, String value2) {
            addCriterion("UPD_USR_NME not between", value1, value2, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Date value) {
            addCriterion("UPD_TIME =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("UPD_TIME <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("UPD_TIME >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPD_TIME >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("UPD_TIME <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPD_TIME <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Date> values) {
            addCriterion("UPD_TIME in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Date> values) {
            addCriterion("UPD_TIME not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Date value1, Date value2) {
            addCriterion("UPD_TIME between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPD_TIME not between", value1, value2, "updTime");
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