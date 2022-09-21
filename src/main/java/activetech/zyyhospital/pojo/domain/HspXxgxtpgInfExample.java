package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspXxgxtpgInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspXxgxtpgInfExample() {
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

        public Criteria andXxgxtpgXdjhFlgIsNull() {
            addCriterion("XXGXTPG_XDJH_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgIsNotNull() {
            addCriterion("XXGXTPG_XDJH_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgEqualTo(String value) {
            addCriterion("XXGXTPG_XDJH_FLG =", value, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgNotEqualTo(String value) {
            addCriterion("XXGXTPG_XDJH_FLG <>", value, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgGreaterThan(String value) {
            addCriterion("XXGXTPG_XDJH_FLG >", value, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_XDJH_FLG >=", value, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgLessThan(String value) {
            addCriterion("XXGXTPG_XDJH_FLG <", value, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgLessThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_XDJH_FLG <=", value, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgLike(String value) {
            addCriterion("XXGXTPG_XDJH_FLG like", value, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgNotLike(String value) {
            addCriterion("XXGXTPG_XDJH_FLG not like", value, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgIn(List<String> values) {
            addCriterion("XXGXTPG_XDJH_FLG in", values, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgNotIn(List<String> values) {
            addCriterion("XXGXTPG_XDJH_FLG not in", values, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgBetween(String value1, String value2) {
            addCriterion("XXGXTPG_XDJH_FLG between", value1, value2, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXdjhFlgNotBetween(String value1, String value2) {
            addCriterion("XXGXTPG_XDJH_FLG not between", value1, value2, "xxgxtpgXdjhFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsIsNull() {
            addCriterion("XXGXTPG_XL_CS is null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsIsNotNull() {
            addCriterion("XXGXTPG_XL_CS is not null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsEqualTo(Short value) {
            addCriterion("XXGXTPG_XL_CS =", value, "xxgxtpgXlCs");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsNotEqualTo(Short value) {
            addCriterion("XXGXTPG_XL_CS <>", value, "xxgxtpgXlCs");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsGreaterThan(Short value) {
            addCriterion("XXGXTPG_XL_CS >", value, "xxgxtpgXlCs");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsGreaterThanOrEqualTo(Short value) {
            addCriterion("XXGXTPG_XL_CS >=", value, "xxgxtpgXlCs");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsLessThan(Short value) {
            addCriterion("XXGXTPG_XL_CS <", value, "xxgxtpgXlCs");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsLessThanOrEqualTo(Short value) {
            addCriterion("XXGXTPG_XL_CS <=", value, "xxgxtpgXlCs");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsIn(List<Short> values) {
            addCriterion("XXGXTPG_XL_CS in", values, "xxgxtpgXlCs");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsNotIn(List<Short> values) {
            addCriterion("XXGXTPG_XL_CS not in", values, "xxgxtpgXlCs");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsBetween(Short value1, Short value2) {
            addCriterion("XXGXTPG_XL_CS between", value1, value2, "xxgxtpgXlCs");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlCsNotBetween(Short value1, Short value2) {
            addCriterion("XXGXTPG_XL_CS not between", value1, value2, "xxgxtpgXlCs");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodIsNull() {
            addCriterion("XXGXTPG_XL_ZT_COD is null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodIsNotNull() {
            addCriterion("XXGXTPG_XL_ZT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodEqualTo(String value) {
            addCriterion("XXGXTPG_XL_ZT_COD =", value, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodNotEqualTo(String value) {
            addCriterion("XXGXTPG_XL_ZT_COD <>", value, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodGreaterThan(String value) {
            addCriterion("XXGXTPG_XL_ZT_COD >", value, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodGreaterThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_XL_ZT_COD >=", value, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodLessThan(String value) {
            addCriterion("XXGXTPG_XL_ZT_COD <", value, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodLessThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_XL_ZT_COD <=", value, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodLike(String value) {
            addCriterion("XXGXTPG_XL_ZT_COD like", value, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodNotLike(String value) {
            addCriterion("XXGXTPG_XL_ZT_COD not like", value, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodIn(List<String> values) {
            addCriterion("XXGXTPG_XL_ZT_COD in", values, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodNotIn(List<String> values) {
            addCriterion("XXGXTPG_XL_ZT_COD not in", values, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodBetween(String value1, String value2) {
            addCriterion("XXGXTPG_XL_ZT_COD between", value1, value2, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXlZtCodNotBetween(String value1, String value2) {
            addCriterion("XXGXTPG_XL_ZT_COD not between", value1, value2, "xxgxtpgXlZtCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgIsNull() {
            addCriterion("XXGXTPG_XM_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgIsNotNull() {
            addCriterion("XXGXTPG_XM_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgEqualTo(String value) {
            addCriterion("XXGXTPG_XM_FLG =", value, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgNotEqualTo(String value) {
            addCriterion("XXGXTPG_XM_FLG <>", value, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgGreaterThan(String value) {
            addCriterion("XXGXTPG_XM_FLG >", value, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_XM_FLG >=", value, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgLessThan(String value) {
            addCriterion("XXGXTPG_XM_FLG <", value, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgLessThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_XM_FLG <=", value, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgLike(String value) {
            addCriterion("XXGXTPG_XM_FLG like", value, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgNotLike(String value) {
            addCriterion("XXGXTPG_XM_FLG not like", value, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgIn(List<String> values) {
            addCriterion("XXGXTPG_XM_FLG in", values, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgNotIn(List<String> values) {
            addCriterion("XXGXTPG_XM_FLG not in", values, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgBetween(String value1, String value2) {
            addCriterion("XXGXTPG_XM_FLG between", value1, value2, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXmFlgNotBetween(String value1, String value2) {
            addCriterion("XXGXTPG_XM_FLG not between", value1, value2, "xxgxtpgXmFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgIsNull() {
            addCriterion("XXGXTPG_XT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgIsNotNull() {
            addCriterion("XXGXTPG_XT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgEqualTo(String value) {
            addCriterion("XXGXTPG_XT_FLG =", value, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgNotEqualTo(String value) {
            addCriterion("XXGXTPG_XT_FLG <>", value, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgGreaterThan(String value) {
            addCriterion("XXGXTPG_XT_FLG >", value, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_XT_FLG >=", value, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgLessThan(String value) {
            addCriterion("XXGXTPG_XT_FLG <", value, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgLessThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_XT_FLG <=", value, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgLike(String value) {
            addCriterion("XXGXTPG_XT_FLG like", value, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgNotLike(String value) {
            addCriterion("XXGXTPG_XT_FLG not like", value, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgIn(List<String> values) {
            addCriterion("XXGXTPG_XT_FLG in", values, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgNotIn(List<String> values) {
            addCriterion("XXGXTPG_XT_FLG not in", values, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgBetween(String value1, String value2) {
            addCriterion("XXGXTPG_XT_FLG between", value1, value2, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXtFlgNotBetween(String value1, String value2) {
            addCriterion("XXGXTPG_XT_FLG not between", value1, value2, "xxgxtpgXtFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgIsNull() {
            addCriterion("XXGXTPG_XJ_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgIsNotNull() {
            addCriterion("XXGXTPG_XJ_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgEqualTo(String value) {
            addCriterion("XXGXTPG_XJ_FLG =", value, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgNotEqualTo(String value) {
            addCriterion("XXGXTPG_XJ_FLG <>", value, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgGreaterThan(String value) {
            addCriterion("XXGXTPG_XJ_FLG >", value, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_XJ_FLG >=", value, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgLessThan(String value) {
            addCriterion("XXGXTPG_XJ_FLG <", value, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgLessThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_XJ_FLG <=", value, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgLike(String value) {
            addCriterion("XXGXTPG_XJ_FLG like", value, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgNotLike(String value) {
            addCriterion("XXGXTPG_XJ_FLG not like", value, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgIn(List<String> values) {
            addCriterion("XXGXTPG_XJ_FLG in", values, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgNotIn(List<String> values) {
            addCriterion("XXGXTPG_XJ_FLG not in", values, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgBetween(String value1, String value2) {
            addCriterion("XXGXTPG_XJ_FLG between", value1, value2, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgXjFlgNotBetween(String value1, String value2) {
            addCriterion("XXGXTPG_XJ_FLG not between", value1, value2, "xxgxtpgXjFlg");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodIsNull() {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD is null");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodIsNotNull() {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodEqualTo(String value) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD =", value, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodNotEqualTo(String value) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD <>", value, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodGreaterThan(String value) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD >", value, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodGreaterThanOrEqualTo(String value) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD >=", value, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodLessThan(String value) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD <", value, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodLessThanOrEqualTo(String value) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD <=", value, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodLike(String value) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD like", value, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodNotLike(String value) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD not like", value, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodIn(List<String> values) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD in", values, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodNotIn(List<String> values) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD not in", values, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodBetween(String value1, String value2) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD between", value1, value2, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZzXxgxtpgBdmbdCodNotBetween(String value1, String value2) {
            addCriterion("ZZ_XXGXTPG_BDMBD_COD not between", value1, value2, "zzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodIsNull() {
            addCriterion("YZ_XXGXTPG_BDMBD_COD is null");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodIsNotNull() {
            addCriterion("YZ_XXGXTPG_BDMBD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodEqualTo(String value) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD =", value, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodNotEqualTo(String value) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD <>", value, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodGreaterThan(String value) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD >", value, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodGreaterThanOrEqualTo(String value) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD >=", value, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodLessThan(String value) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD <", value, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodLessThanOrEqualTo(String value) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD <=", value, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodLike(String value) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD like", value, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodNotLike(String value) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD not like", value, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodIn(List<String> values) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD in", values, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodNotIn(List<String> values) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD not in", values, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodBetween(String value1, String value2) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD between", value1, value2, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYzXxgxtpgBdmbdCodNotBetween(String value1, String value2) {
            addCriterion("YZ_XXGXTPG_BDMBD_COD not between", value1, value2, "yzXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyIsNull() {
            addCriterion("XXGXTPG_MXXGCY is null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyIsNotNull() {
            addCriterion("XXGXTPG_MXXGCY is not null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyEqualTo(String value) {
            addCriterion("XXGXTPG_MXXGCY =", value, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyNotEqualTo(String value) {
            addCriterion("XXGXTPG_MXXGCY <>", value, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyGreaterThan(String value) {
            addCriterion("XXGXTPG_MXXGCY >", value, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyGreaterThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_MXXGCY >=", value, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyLessThan(String value) {
            addCriterion("XXGXTPG_MXXGCY <", value, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyLessThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_MXXGCY <=", value, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyLike(String value) {
            addCriterion("XXGXTPG_MXXGCY like", value, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyNotLike(String value) {
            addCriterion("XXGXTPG_MXXGCY not like", value, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyIn(List<String> values) {
            addCriterion("XXGXTPG_MXXGCY in", values, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyNotIn(List<String> values) {
            addCriterion("XXGXTPG_MXXGCY not in", values, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyBetween(String value1, String value2) {
            addCriterion("XXGXTPG_MXXGCY between", value1, value2, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMxxgcyNotBetween(String value1, String value2) {
            addCriterion("XXGXTPG_MXXGCY not between", value1, value2, "xxgxtpgMxxgcy");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoIsNull() {
            addCriterion("XXGXTPG_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoIsNotNull() {
            addCriterion("XXGXTPG_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoEqualTo(String value) {
            addCriterion("XXGXTPG_MEMO =", value, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoNotEqualTo(String value) {
            addCriterion("XXGXTPG_MEMO <>", value, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoGreaterThan(String value) {
            addCriterion("XXGXTPG_MEMO >", value, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoGreaterThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_MEMO >=", value, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoLessThan(String value) {
            addCriterion("XXGXTPG_MEMO <", value, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoLessThanOrEqualTo(String value) {
            addCriterion("XXGXTPG_MEMO <=", value, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoLike(String value) {
            addCriterion("XXGXTPG_MEMO like", value, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoNotLike(String value) {
            addCriterion("XXGXTPG_MEMO not like", value, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoIn(List<String> values) {
            addCriterion("XXGXTPG_MEMO in", values, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoNotIn(List<String> values) {
            addCriterion("XXGXTPG_MEMO not in", values, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoBetween(String value1, String value2) {
            addCriterion("XXGXTPG_MEMO between", value1, value2, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andXxgxtpgMemoNotBetween(String value1, String value2) {
            addCriterion("XXGXTPG_MEMO not between", value1, value2, "xxgxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodIsNull() {
            addCriterion("ZR_XXGXTPG_BDMBD_COD is null");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodIsNotNull() {
            addCriterion("ZR_XXGXTPG_BDMBD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodEqualTo(String value) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD =", value, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodNotEqualTo(String value) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD <>", value, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodGreaterThan(String value) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD >", value, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodGreaterThanOrEqualTo(String value) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD >=", value, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodLessThan(String value) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD <", value, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodLessThanOrEqualTo(String value) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD <=", value, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodLike(String value) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD like", value, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodNotLike(String value) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD not like", value, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodIn(List<String> values) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD in", values, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodNotIn(List<String> values) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD not in", values, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodBetween(String value1, String value2) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD between", value1, value2, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andZrXxgxtpgBdmbdCodNotBetween(String value1, String value2) {
            addCriterion("ZR_XXGXTPG_BDMBD_COD not between", value1, value2, "zrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodIsNull() {
            addCriterion("YR_XXGXTPG_BDMBD_COD is null");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodIsNotNull() {
            addCriterion("YR_XXGXTPG_BDMBD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodEqualTo(String value) {
            addCriterion("YR_XXGXTPG_BDMBD_COD =", value, "yrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodNotEqualTo(String value) {
            addCriterion("YR_XXGXTPG_BDMBD_COD <>", value, "yrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodGreaterThan(String value) {
            addCriterion("YR_XXGXTPG_BDMBD_COD >", value, "yrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodGreaterThanOrEqualTo(String value) {
            addCriterion("YR_XXGXTPG_BDMBD_COD >=", value, "yrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodLessThan(String value) {
            addCriterion("YR_XXGXTPG_BDMBD_COD <", value, "yrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodLessThanOrEqualTo(String value) {
            addCriterion("YR_XXGXTPG_BDMBD_COD <=", value, "yrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodLike(String value) {
            addCriterion("YR_XXGXTPG_BDMBD_COD like", value, "yrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodNotLike(String value) {
            addCriterion("YR_XXGXTPG_BDMBD_COD not like", value, "yrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodIn(List<String> values) {
            addCriterion("YR_XXGXTPG_BDMBD_COD in", values, "yrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodNotIn(List<String> values) {
            addCriterion("YR_XXGXTPG_BDMBD_COD not in", values, "yrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodBetween(String value1, String value2) {
            addCriterion("YR_XXGXTPG_BDMBD_COD between", value1, value2, "yrXxgxtpgBdmbdCod");
            return (Criteria) this;
        }

        public Criteria andYrXxgxtpgBdmbdCodNotBetween(String value1, String value2) {
            addCriterion("YR_XXGXTPG_BDMBD_COD not between", value1, value2, "yrXxgxtpgBdmbdCod");
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