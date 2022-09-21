package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HspXhxtpgInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspXhxtpgInfExample() {
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

        public Criteria andXhxtpgYsCodIsNull() {
            addCriterion("XHXTPG_YS_COD is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodIsNotNull() {
            addCriterion("XHXTPG_YS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodEqualTo(String value) {
            addCriterion("XHXTPG_YS_COD =", value, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodNotEqualTo(String value) {
            addCriterion("XHXTPG_YS_COD <>", value, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodGreaterThan(String value) {
            addCriterion("XHXTPG_YS_COD >", value, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_YS_COD >=", value, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodLessThan(String value) {
            addCriterion("XHXTPG_YS_COD <", value, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_YS_COD <=", value, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodLike(String value) {
            addCriterion("XHXTPG_YS_COD like", value, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodNotLike(String value) {
            addCriterion("XHXTPG_YS_COD not like", value, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodIn(List<String> values) {
            addCriterion("XHXTPG_YS_COD in", values, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodNotIn(List<String> values) {
            addCriterion("XHXTPG_YS_COD not in", values, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodBetween(String value1, String value2) {
            addCriterion("XHXTPG_YS_COD between", value1, value2, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgYsCodNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_YS_COD not between", value1, value2, "xhxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodIsNull() {
            addCriterion("XHXTPG_SY_COD is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodIsNotNull() {
            addCriterion("XHXTPG_SY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodEqualTo(String value) {
            addCriterion("XHXTPG_SY_COD =", value, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodNotEqualTo(String value) {
            addCriterion("XHXTPG_SY_COD <>", value, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodGreaterThan(String value) {
            addCriterion("XHXTPG_SY_COD >", value, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_SY_COD >=", value, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodLessThan(String value) {
            addCriterion("XHXTPG_SY_COD <", value, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_SY_COD <=", value, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodLike(String value) {
            addCriterion("XHXTPG_SY_COD like", value, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodNotLike(String value) {
            addCriterion("XHXTPG_SY_COD not like", value, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodIn(List<String> values) {
            addCriterion("XHXTPG_SY_COD in", values, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodNotIn(List<String> values) {
            addCriterion("XHXTPG_SY_COD not in", values, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodBetween(String value1, String value2) {
            addCriterion("XHXTPG_SY_COD between", value1, value2, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgSyCodNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_SY_COD not between", value1, value2, "xhxtpgSyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgIsNull() {
            addCriterion("XHXTPG_EX_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgIsNotNull() {
            addCriterion("XHXTPG_EX_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgEqualTo(String value) {
            addCriterion("XHXTPG_EX_FLG =", value, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgNotEqualTo(String value) {
            addCriterion("XHXTPG_EX_FLG <>", value, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgGreaterThan(String value) {
            addCriterion("XHXTPG_EX_FLG >", value, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_EX_FLG >=", value, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgLessThan(String value) {
            addCriterion("XHXTPG_EX_FLG <", value, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_EX_FLG <=", value, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgLike(String value) {
            addCriterion("XHXTPG_EX_FLG like", value, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgNotLike(String value) {
            addCriterion("XHXTPG_EX_FLG not like", value, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgIn(List<String> values) {
            addCriterion("XHXTPG_EX_FLG in", values, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgNotIn(List<String> values) {
            addCriterion("XHXTPG_EX_FLG not in", values, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgBetween(String value1, String value2) {
            addCriterion("XHXTPG_EX_FLG between", value1, value2, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgExFlgNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_EX_FLG not between", value1, value2, "xhxtpgExFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgIsNull() {
            addCriterion("XHXTPG_OT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgIsNotNull() {
            addCriterion("XHXTPG_OT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgEqualTo(String value) {
            addCriterion("XHXTPG_OT_FLG =", value, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgNotEqualTo(String value) {
            addCriterion("XHXTPG_OT_FLG <>", value, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgGreaterThan(String value) {
            addCriterion("XHXTPG_OT_FLG >", value, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_OT_FLG >=", value, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgLessThan(String value) {
            addCriterion("XHXTPG_OT_FLG <", value, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_OT_FLG <=", value, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgLike(String value) {
            addCriterion("XHXTPG_OT_FLG like", value, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgNotLike(String value) {
            addCriterion("XHXTPG_OT_FLG not like", value, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgIn(List<String> values) {
            addCriterion("XHXTPG_OT_FLG in", values, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgNotIn(List<String> values) {
            addCriterion("XHXTPG_OT_FLG not in", values, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgBetween(String value1, String value2) {
            addCriterion("XHXTPG_OT_FLG between", value1, value2, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtFlgNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_OT_FLG not between", value1, value2, "xhxtpgOtFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsIsNull() {
            addCriterion("XHXTPG_OT_YS is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsIsNotNull() {
            addCriterion("XHXTPG_OT_YS is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsEqualTo(String value) {
            addCriterion("XHXTPG_OT_YS =", value, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsNotEqualTo(String value) {
            addCriterion("XHXTPG_OT_YS <>", value, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsGreaterThan(String value) {
            addCriterion("XHXTPG_OT_YS >", value, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_OT_YS >=", value, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsLessThan(String value) {
            addCriterion("XHXTPG_OT_YS <", value, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_OT_YS <=", value, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsLike(String value) {
            addCriterion("XHXTPG_OT_YS like", value, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsNotLike(String value) {
            addCriterion("XHXTPG_OT_YS not like", value, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsIn(List<String> values) {
            addCriterion("XHXTPG_OT_YS in", values, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsNotIn(List<String> values) {
            addCriterion("XHXTPG_OT_YS not in", values, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsBetween(String value1, String value2) {
            addCriterion("XHXTPG_OT_YS between", value1, value2, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtYsNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_OT_YS not between", value1, value2, "xhxtpgOtYs");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLIsNull() {
            addCriterion("XHXTPG_OT_L is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLIsNotNull() {
            addCriterion("XHXTPG_OT_L is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_OT_L =", value, "xhxtpgOtL");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLNotEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_OT_L <>", value, "xhxtpgOtL");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLGreaterThan(BigDecimal value) {
            addCriterion("XHXTPG_OT_L >", value, "xhxtpgOtL");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_OT_L >=", value, "xhxtpgOtL");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLLessThan(BigDecimal value) {
            addCriterion("XHXTPG_OT_L <", value, "xhxtpgOtL");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_OT_L <=", value, "xhxtpgOtL");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLIn(List<BigDecimal> values) {
            addCriterion("XHXTPG_OT_L in", values, "xhxtpgOtL");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLNotIn(List<BigDecimal> values) {
            addCriterion("XHXTPG_OT_L not in", values, "xhxtpgOtL");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XHXTPG_OT_L between", value1, value2, "xhxtpgOtL");
            return (Criteria) this;
        }

        public Criteria andXhxtpgOtLNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XHXTPG_OT_L not between", value1, value2, "xhxtpgOtL");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzIsNull() {
            addCriterion("XHXTPG_FBPZ is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzIsNotNull() {
            addCriterion("XHXTPG_FBPZ is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzEqualTo(String value) {
            addCriterion("XHXTPG_FBPZ =", value, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzNotEqualTo(String value) {
            addCriterion("XHXTPG_FBPZ <>", value, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzGreaterThan(String value) {
            addCriterion("XHXTPG_FBPZ >", value, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FBPZ >=", value, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzLessThan(String value) {
            addCriterion("XHXTPG_FBPZ <", value, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FBPZ <=", value, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzLike(String value) {
            addCriterion("XHXTPG_FBPZ like", value, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzNotLike(String value) {
            addCriterion("XHXTPG_FBPZ not like", value, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzIn(List<String> values) {
            addCriterion("XHXTPG_FBPZ in", values, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzNotIn(List<String> values) {
            addCriterion("XHXTPG_FBPZ not in", values, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzBetween(String value1, String value2) {
            addCriterion("XHXTPG_FBPZ between", value1, value2, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbpzNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_FBPZ not between", value1, value2, "xhxtpgFbpz");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgIsNull() {
            addCriterion("XHXTPG_FBCG is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgIsNotNull() {
            addCriterion("XHXTPG_FBCG is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgEqualTo(String value) {
            addCriterion("XHXTPG_FBCG =", value, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgNotEqualTo(String value) {
            addCriterion("XHXTPG_FBCG <>", value, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgGreaterThan(String value) {
            addCriterion("XHXTPG_FBCG >", value, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FBCG >=", value, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgLessThan(String value) {
            addCriterion("XHXTPG_FBCG <", value, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FBCG <=", value, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgLike(String value) {
            addCriterion("XHXTPG_FBCG like", value, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgNotLike(String value) {
            addCriterion("XHXTPG_FBCG not like", value, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgIn(List<String> values) {
            addCriterion("XHXTPG_FBCG in", values, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgNotIn(List<String> values) {
            addCriterion("XHXTPG_FBCG not in", values, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgBetween(String value1, String value2) {
            addCriterion("XHXTPG_FBCG between", value1, value2, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbcgNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_FBCG not between", value1, value2, "xhxtpgFbcg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodIsNull() {
            addCriterion("XHXTPG_FZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodIsNotNull() {
            addCriterion("XHXTPG_FZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodEqualTo(String value) {
            addCriterion("XHXTPG_FZ_COD =", value, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodNotEqualTo(String value) {
            addCriterion("XHXTPG_FZ_COD <>", value, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodGreaterThan(String value) {
            addCriterion("XHXTPG_FZ_COD >", value, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FZ_COD >=", value, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodLessThan(String value) {
            addCriterion("XHXTPG_FZ_COD <", value, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FZ_COD <=", value, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodLike(String value) {
            addCriterion("XHXTPG_FZ_COD like", value, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodNotLike(String value) {
            addCriterion("XHXTPG_FZ_COD not like", value, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodIn(List<String> values) {
            addCriterion("XHXTPG_FZ_COD in", values, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodNotIn(List<String> values) {
            addCriterion("XHXTPG_FZ_COD not in", values, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodBetween(String value1, String value2) {
            addCriterion("XHXTPG_FZ_COD between", value1, value2, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFzCodNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_FZ_COD not between", value1, value2, "xhxtpgFzCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodIsNull() {
            addCriterion("XHXTPG_FBYT_COD is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodIsNotNull() {
            addCriterion("XHXTPG_FBYT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodEqualTo(String value) {
            addCriterion("XHXTPG_FBYT_COD =", value, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodNotEqualTo(String value) {
            addCriterion("XHXTPG_FBYT_COD <>", value, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodGreaterThan(String value) {
            addCriterion("XHXTPG_FBYT_COD >", value, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FBYT_COD >=", value, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodLessThan(String value) {
            addCriterion("XHXTPG_FBYT_COD <", value, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FBYT_COD <=", value, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodLike(String value) {
            addCriterion("XHXTPG_FBYT_COD like", value, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodNotLike(String value) {
            addCriterion("XHXTPG_FBYT_COD not like", value, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodIn(List<String> values) {
            addCriterion("XHXTPG_FBYT_COD in", values, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodNotIn(List<String> values) {
            addCriterion("XHXTPG_FBYT_COD not in", values, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodBetween(String value1, String value2) {
            addCriterion("XHXTPG_FBYT_COD between", value1, value2, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbytCodNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_FBYT_COD not between", value1, value2, "xhxtpgFbytCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgIsNull() {
            addCriterion("XHXTPG_FBFTT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgIsNotNull() {
            addCriterion("XHXTPG_FBFTT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgEqualTo(String value) {
            addCriterion("XHXTPG_FBFTT_FLG =", value, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgNotEqualTo(String value) {
            addCriterion("XHXTPG_FBFTT_FLG <>", value, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgGreaterThan(String value) {
            addCriterion("XHXTPG_FBFTT_FLG >", value, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FBFTT_FLG >=", value, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgLessThan(String value) {
            addCriterion("XHXTPG_FBFTT_FLG <", value, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FBFTT_FLG <=", value, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgLike(String value) {
            addCriterion("XHXTPG_FBFTT_FLG like", value, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgNotLike(String value) {
            addCriterion("XHXTPG_FBFTT_FLG not like", value, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgIn(List<String> values) {
            addCriterion("XHXTPG_FBFTT_FLG in", values, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgNotIn(List<String> values) {
            addCriterion("XHXTPG_FBFTT_FLG not in", values, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgBetween(String value1, String value2) {
            addCriterion("XHXTPG_FBFTT_FLG between", value1, value2, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFbfttFlgNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_FBFTT_FLG not between", value1, value2, "xhxtpgFbfttFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodIsNull() {
            addCriterion("XHXTPG_CMY_COD is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodIsNotNull() {
            addCriterion("XHXTPG_CMY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodEqualTo(String value) {
            addCriterion("XHXTPG_CMY_COD =", value, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodNotEqualTo(String value) {
            addCriterion("XHXTPG_CMY_COD <>", value, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodGreaterThan(String value) {
            addCriterion("XHXTPG_CMY_COD >", value, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_CMY_COD >=", value, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodLessThan(String value) {
            addCriterion("XHXTPG_CMY_COD <", value, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_CMY_COD <=", value, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodLike(String value) {
            addCriterion("XHXTPG_CMY_COD like", value, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodNotLike(String value) {
            addCriterion("XHXTPG_CMY_COD not like", value, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodIn(List<String> values) {
            addCriterion("XHXTPG_CMY_COD in", values, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodNotIn(List<String> values) {
            addCriterion("XHXTPG_CMY_COD not in", values, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodBetween(String value1, String value2) {
            addCriterion("XHXTPG_CMY_COD between", value1, value2, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgCmyCodNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_CMY_COD not between", value1, value2, "xhxtpgCmyCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodIsNull() {
            addCriterion("XHXTPG_PB_COD is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodIsNotNull() {
            addCriterion("XHXTPG_PB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodEqualTo(String value) {
            addCriterion("XHXTPG_PB_COD =", value, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodNotEqualTo(String value) {
            addCriterion("XHXTPG_PB_COD <>", value, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodGreaterThan(String value) {
            addCriterion("XHXTPG_PB_COD >", value, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_PB_COD >=", value, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodLessThan(String value) {
            addCriterion("XHXTPG_PB_COD <", value, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_PB_COD <=", value, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodLike(String value) {
            addCriterion("XHXTPG_PB_COD like", value, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodNotLike(String value) {
            addCriterion("XHXTPG_PB_COD not like", value, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodIn(List<String> values) {
            addCriterion("XHXTPG_PB_COD in", values, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodNotIn(List<String> values) {
            addCriterion("XHXTPG_PB_COD not in", values, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodBetween(String value1, String value2) {
            addCriterion("XHXTPG_PB_COD between", value1, value2, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPbCodNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_PB_COD not between", value1, value2, "xhxtpgPbCod");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgIsNull() {
            addCriterion("XHXTPG_FQCX_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgIsNotNull() {
            addCriterion("XHXTPG_FQCX_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgEqualTo(String value) {
            addCriterion("XHXTPG_FQCX_FLG =", value, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgNotEqualTo(String value) {
            addCriterion("XHXTPG_FQCX_FLG <>", value, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgGreaterThan(String value) {
            addCriterion("XHXTPG_FQCX_FLG >", value, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FQCX_FLG >=", value, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgLessThan(String value) {
            addCriterion("XHXTPG_FQCX_FLG <", value, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_FQCX_FLG <=", value, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgLike(String value) {
            addCriterion("XHXTPG_FQCX_FLG like", value, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgNotLike(String value) {
            addCriterion("XHXTPG_FQCX_FLG not like", value, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgIn(List<String> values) {
            addCriterion("XHXTPG_FQCX_FLG in", values, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgNotIn(List<String> values) {
            addCriterion("XHXTPG_FQCX_FLG not in", values, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgBetween(String value1, String value2) {
            addCriterion("XHXTPG_FQCX_FLG between", value1, value2, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFqcxFlgNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_FQCX_FLG not between", value1, value2, "xhxtpgFqcxFlg");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwIsNull() {
            addCriterion("XHXTPG_FW is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwIsNotNull() {
            addCriterion("XHXTPG_FW is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_FW =", value, "xhxtpgFw");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwNotEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_FW <>", value, "xhxtpgFw");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwGreaterThan(BigDecimal value) {
            addCriterion("XHXTPG_FW >", value, "xhxtpgFw");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_FW >=", value, "xhxtpgFw");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwLessThan(BigDecimal value) {
            addCriterion("XHXTPG_FW <", value, "xhxtpgFw");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_FW <=", value, "xhxtpgFw");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwIn(List<BigDecimal> values) {
            addCriterion("XHXTPG_FW in", values, "xhxtpgFw");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwNotIn(List<BigDecimal> values) {
            addCriterion("XHXTPG_FW not in", values, "xhxtpgFw");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XHXTPG_FW between", value1, value2, "xhxtpgFw");
            return (Criteria) this;
        }

        public Criteria andXhxtpgFwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XHXTPG_FW not between", value1, value2, "xhxtpgFw");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsIsNull() {
            addCriterion("XHXTPG_TPNDS is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsIsNotNull() {
            addCriterion("XHXTPG_TPNDS is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_TPNDS =", value, "xhxtpgTpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsNotEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_TPNDS <>", value, "xhxtpgTpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsGreaterThan(BigDecimal value) {
            addCriterion("XHXTPG_TPNDS >", value, "xhxtpgTpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_TPNDS >=", value, "xhxtpgTpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsLessThan(BigDecimal value) {
            addCriterion("XHXTPG_TPNDS <", value, "xhxtpgTpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_TPNDS <=", value, "xhxtpgTpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsIn(List<BigDecimal> values) {
            addCriterion("XHXTPG_TPNDS in", values, "xhxtpgTpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsNotIn(List<BigDecimal> values) {
            addCriterion("XHXTPG_TPNDS not in", values, "xhxtpgTpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XHXTPG_TPNDS between", value1, value2, "xhxtpgTpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgTpndsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XHXTPG_TPNDS not between", value1, value2, "xhxtpgTpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsIsNull() {
            addCriterion("XHXTPG_PPNDS is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsIsNotNull() {
            addCriterion("XHXTPG_PPNDS is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_PPNDS =", value, "xhxtpgPpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsNotEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_PPNDS <>", value, "xhxtpgPpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsGreaterThan(BigDecimal value) {
            addCriterion("XHXTPG_PPNDS >", value, "xhxtpgPpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_PPNDS >=", value, "xhxtpgPpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsLessThan(BigDecimal value) {
            addCriterion("XHXTPG_PPNDS <", value, "xhxtpgPpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XHXTPG_PPNDS <=", value, "xhxtpgPpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsIn(List<BigDecimal> values) {
            addCriterion("XHXTPG_PPNDS in", values, "xhxtpgPpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsNotIn(List<BigDecimal> values) {
            addCriterion("XHXTPG_PPNDS not in", values, "xhxtpgPpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XHXTPG_PPNDS between", value1, value2, "xhxtpgPpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgPpndsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XHXTPG_PPNDS not between", value1, value2, "xhxtpgPpnds");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoIsNull() {
            addCriterion("XHXTPG_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoIsNotNull() {
            addCriterion("XHXTPG_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoEqualTo(String value) {
            addCriterion("XHXTPG_MEMO =", value, "xhxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoNotEqualTo(String value) {
            addCriterion("XHXTPG_MEMO <>", value, "xhxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoGreaterThan(String value) {
            addCriterion("XHXTPG_MEMO >", value, "xhxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoGreaterThanOrEqualTo(String value) {
            addCriterion("XHXTPG_MEMO >=", value, "xhxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoLessThan(String value) {
            addCriterion("XHXTPG_MEMO <", value, "xhxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoLessThanOrEqualTo(String value) {
            addCriterion("XHXTPG_MEMO <=", value, "xhxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoLike(String value) {
            addCriterion("XHXTPG_MEMO like", value, "xhxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoNotLike(String value) {
            addCriterion("XHXTPG_MEMO not like", value, "xhxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoIn(List<String> values) {
            addCriterion("XHXTPG_MEMO in", values, "xhxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoNotIn(List<String> values) {
            addCriterion("XHXTPG_MEMO not in", values, "xhxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoBetween(String value1, String value2) {
            addCriterion("XHXTPG_MEMO between", value1, value2, "xhxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXhxtpgMemoNotBetween(String value1, String value2) {
            addCriterion("XHXTPG_MEMO not between", value1, value2, "xhxtpgMemo");
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