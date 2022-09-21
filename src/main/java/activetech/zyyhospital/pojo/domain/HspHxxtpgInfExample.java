package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HspHxxtpgInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspHxxtpgInfExample() {
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

        public Criteria andHxxtpgKsCodIsNull() {
            addCriterion("HXXTPG_KS_COD is null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodIsNotNull() {
            addCriterion("HXXTPG_KS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodEqualTo(String value) {
            addCriterion("HXXTPG_KS_COD =", value, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodNotEqualTo(String value) {
            addCriterion("HXXTPG_KS_COD <>", value, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodGreaterThan(String value) {
            addCriterion("HXXTPG_KS_COD >", value, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodGreaterThanOrEqualTo(String value) {
            addCriterion("HXXTPG_KS_COD >=", value, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodLessThan(String value) {
            addCriterion("HXXTPG_KS_COD <", value, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodLessThanOrEqualTo(String value) {
            addCriterion("HXXTPG_KS_COD <=", value, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodLike(String value) {
            addCriterion("HXXTPG_KS_COD like", value, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodNotLike(String value) {
            addCriterion("HXXTPG_KS_COD not like", value, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodIn(List<String> values) {
            addCriterion("HXXTPG_KS_COD in", values, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodNotIn(List<String> values) {
            addCriterion("HXXTPG_KS_COD not in", values, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodBetween(String value1, String value2) {
            addCriterion("HXXTPG_KS_COD between", value1, value2, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsCodNotBetween(String value1, String value2) {
            addCriterion("HXXTPG_KS_COD not between", value1, value2, "hxxtpgKsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtIsNull() {
            addCriterion("HXXTPG_KS_QT is null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtIsNotNull() {
            addCriterion("HXXTPG_KS_QT is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtEqualTo(String value) {
            addCriterion("HXXTPG_KS_QT =", value, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtNotEqualTo(String value) {
            addCriterion("HXXTPG_KS_QT <>", value, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtGreaterThan(String value) {
            addCriterion("HXXTPG_KS_QT >", value, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtGreaterThanOrEqualTo(String value) {
            addCriterion("HXXTPG_KS_QT >=", value, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtLessThan(String value) {
            addCriterion("HXXTPG_KS_QT <", value, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtLessThanOrEqualTo(String value) {
            addCriterion("HXXTPG_KS_QT <=", value, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtLike(String value) {
            addCriterion("HXXTPG_KS_QT like", value, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtNotLike(String value) {
            addCriterion("HXXTPG_KS_QT not like", value, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtIn(List<String> values) {
            addCriterion("HXXTPG_KS_QT in", values, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtNotIn(List<String> values) {
            addCriterion("HXXTPG_KS_QT not in", values, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtBetween(String value1, String value2) {
            addCriterion("HXXTPG_KS_QT between", value1, value2, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgKsQtNotBetween(String value1, String value2) {
            addCriterion("HXXTPG_KS_QT not between", value1, value2, "hxxtpgKsQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodIsNull() {
            addCriterion("HXXTPG_TXXZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodIsNotNull() {
            addCriterion("HXXTPG_TXXZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodEqualTo(String value) {
            addCriterion("HXXTPG_TXXZ_COD =", value, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodNotEqualTo(String value) {
            addCriterion("HXXTPG_TXXZ_COD <>", value, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodGreaterThan(String value) {
            addCriterion("HXXTPG_TXXZ_COD >", value, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodGreaterThanOrEqualTo(String value) {
            addCriterion("HXXTPG_TXXZ_COD >=", value, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodLessThan(String value) {
            addCriterion("HXXTPG_TXXZ_COD <", value, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodLessThanOrEqualTo(String value) {
            addCriterion("HXXTPG_TXXZ_COD <=", value, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodLike(String value) {
            addCriterion("HXXTPG_TXXZ_COD like", value, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodNotLike(String value) {
            addCriterion("HXXTPG_TXXZ_COD not like", value, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodIn(List<String> values) {
            addCriterion("HXXTPG_TXXZ_COD in", values, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodNotIn(List<String> values) {
            addCriterion("HXXTPG_TXXZ_COD not in", values, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodBetween(String value1, String value2) {
            addCriterion("HXXTPG_TXXZ_COD between", value1, value2, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzCodNotBetween(String value1, String value2) {
            addCriterion("HXXTPG_TXXZ_COD not between", value1, value2, "hxxtpgTxxzCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtIsNull() {
            addCriterion("HXXTPG_TXXZ_QT is null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtIsNotNull() {
            addCriterion("HXXTPG_TXXZ_QT is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtEqualTo(String value) {
            addCriterion("HXXTPG_TXXZ_QT =", value, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtNotEqualTo(String value) {
            addCriterion("HXXTPG_TXXZ_QT <>", value, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtGreaterThan(String value) {
            addCriterion("HXXTPG_TXXZ_QT >", value, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtGreaterThanOrEqualTo(String value) {
            addCriterion("HXXTPG_TXXZ_QT >=", value, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtLessThan(String value) {
            addCriterion("HXXTPG_TXXZ_QT <", value, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtLessThanOrEqualTo(String value) {
            addCriterion("HXXTPG_TXXZ_QT <=", value, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtLike(String value) {
            addCriterion("HXXTPG_TXXZ_QT like", value, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtNotLike(String value) {
            addCriterion("HXXTPG_TXXZ_QT not like", value, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtIn(List<String> values) {
            addCriterion("HXXTPG_TXXZ_QT in", values, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtNotIn(List<String> values) {
            addCriterion("HXXTPG_TXXZ_QT not in", values, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtBetween(String value1, String value2) {
            addCriterion("HXXTPG_TXXZ_QT between", value1, value2, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTxxzQtNotBetween(String value1, String value2) {
            addCriterion("HXXTPG_TXXZ_QT not between", value1, value2, "hxxtpgTxxzQt");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodIsNull() {
            addCriterion("HXXTPG_TL_COD is null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodIsNotNull() {
            addCriterion("HXXTPG_TL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodEqualTo(String value) {
            addCriterion("HXXTPG_TL_COD =", value, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodNotEqualTo(String value) {
            addCriterion("HXXTPG_TL_COD <>", value, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodGreaterThan(String value) {
            addCriterion("HXXTPG_TL_COD >", value, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodGreaterThanOrEqualTo(String value) {
            addCriterion("HXXTPG_TL_COD >=", value, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodLessThan(String value) {
            addCriterion("HXXTPG_TL_COD <", value, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodLessThanOrEqualTo(String value) {
            addCriterion("HXXTPG_TL_COD <=", value, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodLike(String value) {
            addCriterion("HXXTPG_TL_COD like", value, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodNotLike(String value) {
            addCriterion("HXXTPG_TL_COD not like", value, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodIn(List<String> values) {
            addCriterion("HXXTPG_TL_COD in", values, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodNotIn(List<String> values) {
            addCriterion("HXXTPG_TL_COD not in", values, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodBetween(String value1, String value2) {
            addCriterion("HXXTPG_TL_COD between", value1, value2, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgTlCodNotBetween(String value1, String value2) {
            addCriterion("HXXTPG_TL_COD not between", value1, value2, "hxxtpgTlCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodIsNull() {
            addCriterion("HXXTPG_GYFS_COD is null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodIsNotNull() {
            addCriterion("HXXTPG_GYFS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodEqualTo(String value) {
            addCriterion("HXXTPG_GYFS_COD =", value, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodNotEqualTo(String value) {
            addCriterion("HXXTPG_GYFS_COD <>", value, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodGreaterThan(String value) {
            addCriterion("HXXTPG_GYFS_COD >", value, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodGreaterThanOrEqualTo(String value) {
            addCriterion("HXXTPG_GYFS_COD >=", value, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodLessThan(String value) {
            addCriterion("HXXTPG_GYFS_COD <", value, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodLessThanOrEqualTo(String value) {
            addCriterion("HXXTPG_GYFS_COD <=", value, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodLike(String value) {
            addCriterion("HXXTPG_GYFS_COD like", value, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodNotLike(String value) {
            addCriterion("HXXTPG_GYFS_COD not like", value, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodIn(List<String> values) {
            addCriterion("HXXTPG_GYFS_COD in", values, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodNotIn(List<String> values) {
            addCriterion("HXXTPG_GYFS_COD not in", values, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodBetween(String value1, String value2) {
            addCriterion("HXXTPG_GYFS_COD between", value1, value2, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyfsCodNotBetween(String value1, String value2) {
            addCriterion("HXXTPG_GYFS_COD not between", value1, value2, "hxxtpgGyfsCod");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllIsNull() {
            addCriterion("HXXTPG_GYLL is null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllIsNotNull() {
            addCriterion("HXXTPG_GYLL is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllEqualTo(Short value) {
            addCriterion("HXXTPG_GYLL =", value, "hxxtpgGyll");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllNotEqualTo(Short value) {
            addCriterion("HXXTPG_GYLL <>", value, "hxxtpgGyll");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllGreaterThan(Short value) {
            addCriterion("HXXTPG_GYLL >", value, "hxxtpgGyll");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllGreaterThanOrEqualTo(Short value) {
            addCriterion("HXXTPG_GYLL >=", value, "hxxtpgGyll");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllLessThan(Short value) {
            addCriterion("HXXTPG_GYLL <", value, "hxxtpgGyll");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllLessThanOrEqualTo(Short value) {
            addCriterion("HXXTPG_GYLL <=", value, "hxxtpgGyll");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllIn(List<Short> values) {
            addCriterion("HXXTPG_GYLL in", values, "hxxtpgGyll");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllNotIn(List<Short> values) {
            addCriterion("HXXTPG_GYLL not in", values, "hxxtpgGyll");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllBetween(Short value1, Short value2) {
            addCriterion("HXXTPG_GYLL between", value1, value2, "hxxtpgGyll");
            return (Criteria) this;
        }

        public Criteria andHxxtpgGyllNotBetween(Short value1, Short value2) {
            addCriterion("HXXTPG_GYLL not between", value1, value2, "hxxtpgGyll");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndIsNull() {
            addCriterion("HXXTPG_YND is null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndIsNotNull() {
            addCriterion("HXXTPG_YND is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndEqualTo(Short value) {
            addCriterion("HXXTPG_YND =", value, "hxxtpgYnd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndNotEqualTo(Short value) {
            addCriterion("HXXTPG_YND <>", value, "hxxtpgYnd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndGreaterThan(Short value) {
            addCriterion("HXXTPG_YND >", value, "hxxtpgYnd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndGreaterThanOrEqualTo(Short value) {
            addCriterion("HXXTPG_YND >=", value, "hxxtpgYnd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndLessThan(Short value) {
            addCriterion("HXXTPG_YND <", value, "hxxtpgYnd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndLessThanOrEqualTo(Short value) {
            addCriterion("HXXTPG_YND <=", value, "hxxtpgYnd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndIn(List<Short> values) {
            addCriterion("HXXTPG_YND in", values, "hxxtpgYnd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndNotIn(List<Short> values) {
            addCriterion("HXXTPG_YND not in", values, "hxxtpgYnd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndBetween(Short value1, Short value2) {
            addCriterion("HXXTPG_YND between", value1, value2, "hxxtpgYnd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYndNotBetween(Short value1, Short value2) {
            addCriterion("HXXTPG_YND not between", value1, value2, "hxxtpgYnd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdIsNull() {
            addCriterion("HXXTPG_YBHD is null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdIsNotNull() {
            addCriterion("HXXTPG_YBHD is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdEqualTo(Short value) {
            addCriterion("HXXTPG_YBHD =", value, "hxxtpgYbhd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdNotEqualTo(Short value) {
            addCriterion("HXXTPG_YBHD <>", value, "hxxtpgYbhd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdGreaterThan(Short value) {
            addCriterion("HXXTPG_YBHD >", value, "hxxtpgYbhd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdGreaterThanOrEqualTo(Short value) {
            addCriterion("HXXTPG_YBHD >=", value, "hxxtpgYbhd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdLessThan(Short value) {
            addCriterion("HXXTPG_YBHD <", value, "hxxtpgYbhd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdLessThanOrEqualTo(Short value) {
            addCriterion("HXXTPG_YBHD <=", value, "hxxtpgYbhd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdIn(List<Short> values) {
            addCriterion("HXXTPG_YBHD in", values, "hxxtpgYbhd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdNotIn(List<Short> values) {
            addCriterion("HXXTPG_YBHD not in", values, "hxxtpgYbhd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdBetween(Short value1, Short value2) {
            addCriterion("HXXTPG_YBHD between", value1, value2, "hxxtpgYbhd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgYbhdNotBetween(Short value1, Short value2) {
            addCriterion("HXXTPG_YBHD not between", value1, value2, "hxxtpgYbhd");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcIsNull() {
            addCriterion("HXXTPG_HXJC is null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcIsNotNull() {
            addCriterion("HXXTPG_HXJC is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcEqualTo(String value) {
            addCriterion("HXXTPG_HXJC =", value, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcNotEqualTo(String value) {
            addCriterion("HXXTPG_HXJC <>", value, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcGreaterThan(String value) {
            addCriterion("HXXTPG_HXJC >", value, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcGreaterThanOrEqualTo(String value) {
            addCriterion("HXXTPG_HXJC >=", value, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcLessThan(String value) {
            addCriterion("HXXTPG_HXJC <", value, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcLessThanOrEqualTo(String value) {
            addCriterion("HXXTPG_HXJC <=", value, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcLike(String value) {
            addCriterion("HXXTPG_HXJC like", value, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcNotLike(String value) {
            addCriterion("HXXTPG_HXJC not like", value, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcIn(List<String> values) {
            addCriterion("HXXTPG_HXJC in", values, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcNotIn(List<String> values) {
            addCriterion("HXXTPG_HXJC not in", values, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcBetween(String value1, String value2) {
            addCriterion("HXXTPG_HXJC between", value1, value2, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andHxxtpgHxjcNotBetween(String value1, String value2) {
            addCriterion("HXXTPG_HXJC not between", value1, value2, "hxxtpgHxjc");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodIsNull() {
            addCriterion("LEFT_HXXTPG_HXY_COD is null");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodIsNotNull() {
            addCriterion("LEFT_HXXTPG_HXY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodEqualTo(String value) {
            addCriterion("LEFT_HXXTPG_HXY_COD =", value, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodNotEqualTo(String value) {
            addCriterion("LEFT_HXXTPG_HXY_COD <>", value, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodGreaterThan(String value) {
            addCriterion("LEFT_HXXTPG_HXY_COD >", value, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodGreaterThanOrEqualTo(String value) {
            addCriterion("LEFT_HXXTPG_HXY_COD >=", value, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodLessThan(String value) {
            addCriterion("LEFT_HXXTPG_HXY_COD <", value, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodLessThanOrEqualTo(String value) {
            addCriterion("LEFT_HXXTPG_HXY_COD <=", value, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodLike(String value) {
            addCriterion("LEFT_HXXTPG_HXY_COD like", value, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodNotLike(String value) {
            addCriterion("LEFT_HXXTPG_HXY_COD not like", value, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodIn(List<String> values) {
            addCriterion("LEFT_HXXTPG_HXY_COD in", values, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodNotIn(List<String> values) {
            addCriterion("LEFT_HXXTPG_HXY_COD not in", values, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodBetween(String value1, String value2) {
            addCriterion("LEFT_HXXTPG_HXY_COD between", value1, value2, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andLeftHxxtpgHxyCodNotBetween(String value1, String value2) {
            addCriterion("LEFT_HXXTPG_HXY_COD not between", value1, value2, "leftHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodIsNull() {
            addCriterion("RIGHT_HXXTPG_HXY_COD is null");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodIsNotNull() {
            addCriterion("RIGHT_HXXTPG_HXY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodEqualTo(String value) {
            addCriterion("RIGHT_HXXTPG_HXY_COD =", value, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodNotEqualTo(String value) {
            addCriterion("RIGHT_HXXTPG_HXY_COD <>", value, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodGreaterThan(String value) {
            addCriterion("RIGHT_HXXTPG_HXY_COD >", value, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHT_HXXTPG_HXY_COD >=", value, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodLessThan(String value) {
            addCriterion("RIGHT_HXXTPG_HXY_COD <", value, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodLessThanOrEqualTo(String value) {
            addCriterion("RIGHT_HXXTPG_HXY_COD <=", value, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodLike(String value) {
            addCriterion("RIGHT_HXXTPG_HXY_COD like", value, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodNotLike(String value) {
            addCriterion("RIGHT_HXXTPG_HXY_COD not like", value, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodIn(List<String> values) {
            addCriterion("RIGHT_HXXTPG_HXY_COD in", values, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodNotIn(List<String> values) {
            addCriterion("RIGHT_HXXTPG_HXY_COD not in", values, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodBetween(String value1, String value2) {
            addCriterion("RIGHT_HXXTPG_HXY_COD between", value1, value2, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andRightHxxtpgHxyCodNotBetween(String value1, String value2) {
            addCriterion("RIGHT_HXXTPG_HXY_COD not between", value1, value2, "rightHxxtpgHxyCod");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgIsNull() {
            addCriterion("QGQK_FLG is null");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgIsNotNull() {
            addCriterion("QGQK_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgEqualTo(String value) {
            addCriterion("QGQK_FLG =", value, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgNotEqualTo(String value) {
            addCriterion("QGQK_FLG <>", value, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgGreaterThan(String value) {
            addCriterion("QGQK_FLG >", value, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgGreaterThanOrEqualTo(String value) {
            addCriterion("QGQK_FLG >=", value, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgLessThan(String value) {
            addCriterion("QGQK_FLG <", value, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgLessThanOrEqualTo(String value) {
            addCriterion("QGQK_FLG <=", value, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgLike(String value) {
            addCriterion("QGQK_FLG like", value, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgNotLike(String value) {
            addCriterion("QGQK_FLG not like", value, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgIn(List<String> values) {
            addCriterion("QGQK_FLG in", values, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgNotIn(List<String> values) {
            addCriterion("QGQK_FLG not in", values, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgBetween(String value1, String value2) {
            addCriterion("QGQK_FLG between", value1, value2, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkFlgNotBetween(String value1, String value2) {
            addCriterion("QGQK_FLG not between", value1, value2, "qgqkFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhIsNull() {
            addCriterion("QGQK_QQTGXH is null");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhIsNotNull() {
            addCriterion("QGQK_QQTGXH is not null");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhEqualTo(String value) {
            addCriterion("QGQK_QQTGXH =", value, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhNotEqualTo(String value) {
            addCriterion("QGQK_QQTGXH <>", value, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhGreaterThan(String value) {
            addCriterion("QGQK_QQTGXH >", value, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhGreaterThanOrEqualTo(String value) {
            addCriterion("QGQK_QQTGXH >=", value, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhLessThan(String value) {
            addCriterion("QGQK_QQTGXH <", value, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhLessThanOrEqualTo(String value) {
            addCriterion("QGQK_QQTGXH <=", value, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhLike(String value) {
            addCriterion("QGQK_QQTGXH like", value, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhNotLike(String value) {
            addCriterion("QGQK_QQTGXH not like", value, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhIn(List<String> values) {
            addCriterion("QGQK_QQTGXH in", values, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhNotIn(List<String> values) {
            addCriterion("QGQK_QQTGXH not in", values, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhBetween(String value1, String value2) {
            addCriterion("QGQK_QQTGXH between", value1, value2, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQqtgxhNotBetween(String value1, String value2) {
            addCriterion("QGQK_QQTGXH not between", value1, value2, "qgqkQqtgxh");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgIsNull() {
            addCriterion("QGQK_QGCG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgIsNotNull() {
            addCriterion("QGQK_QGCG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgEqualTo(String value) {
            addCriterion("QGQK_QGCG_FLG =", value, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgNotEqualTo(String value) {
            addCriterion("QGQK_QGCG_FLG <>", value, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgGreaterThan(String value) {
            addCriterion("QGQK_QGCG_FLG >", value, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("QGQK_QGCG_FLG >=", value, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgLessThan(String value) {
            addCriterion("QGQK_QGCG_FLG <", value, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgLessThanOrEqualTo(String value) {
            addCriterion("QGQK_QGCG_FLG <=", value, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgLike(String value) {
            addCriterion("QGQK_QGCG_FLG like", value, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgNotLike(String value) {
            addCriterion("QGQK_QGCG_FLG not like", value, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgIn(List<String> values) {
            addCriterion("QGQK_QGCG_FLG in", values, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgNotIn(List<String> values) {
            addCriterion("QGQK_QGCG_FLG not in", values, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgBetween(String value1, String value2) {
            addCriterion("QGQK_QGCG_FLG between", value1, value2, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgcgFlgNotBetween(String value1, String value2) {
            addCriterion("QGQK_QGCG_FLG not between", value1, value2, "qgqkQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjIsNull() {
            addCriterion("QGQK_XDGDSJ is null");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjIsNotNull() {
            addCriterion("QGQK_XDGDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjEqualTo(String value) {
            addCriterion("QGQK_XDGDSJ =", value, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjNotEqualTo(String value) {
            addCriterion("QGQK_XDGDSJ <>", value, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjGreaterThan(String value) {
            addCriterion("QGQK_XDGDSJ >", value, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjGreaterThanOrEqualTo(String value) {
            addCriterion("QGQK_XDGDSJ >=", value, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjLessThan(String value) {
            addCriterion("QGQK_XDGDSJ <", value, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjLessThanOrEqualTo(String value) {
            addCriterion("QGQK_XDGDSJ <=", value, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjLike(String value) {
            addCriterion("QGQK_XDGDSJ like", value, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjNotLike(String value) {
            addCriterion("QGQK_XDGDSJ not like", value, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjIn(List<String> values) {
            addCriterion("QGQK_XDGDSJ in", values, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjNotIn(List<String> values) {
            addCriterion("QGQK_XDGDSJ not in", values, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjBetween(String value1, String value2) {
            addCriterion("QGQK_XDGDSJ between", value1, value2, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkXdgdsjNotBetween(String value1, String value2) {
            addCriterion("QGQK_XDGDSJ not between", value1, value2, "qgqkXdgdsj");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylIsNull() {
            addCriterion("QGQK_QNYL is null");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylIsNotNull() {
            addCriterion("QGQK_QNYL is not null");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylEqualTo(String value) {
            addCriterion("QGQK_QNYL =", value, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylNotEqualTo(String value) {
            addCriterion("QGQK_QNYL <>", value, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylGreaterThan(String value) {
            addCriterion("QGQK_QNYL >", value, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylGreaterThanOrEqualTo(String value) {
            addCriterion("QGQK_QNYL >=", value, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylLessThan(String value) {
            addCriterion("QGQK_QNYL <", value, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylLessThanOrEqualTo(String value) {
            addCriterion("QGQK_QNYL <=", value, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylLike(String value) {
            addCriterion("QGQK_QNYL like", value, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylNotLike(String value) {
            addCriterion("QGQK_QNYL not like", value, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylIn(List<String> values) {
            addCriterion("QGQK_QNYL in", values, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylNotIn(List<String> values) {
            addCriterion("QGQK_QNYL not in", values, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylBetween(String value1, String value2) {
            addCriterion("QGQK_QNYL between", value1, value2, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQnylNotBetween(String value1, String value2) {
            addCriterion("QGQK_QNYL not between", value1, value2, "qgqkQnyl");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgIsNull() {
            addCriterion("QGQK_QGQKCHY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgIsNotNull() {
            addCriterion("QGQK_QGQKCHY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgEqualTo(String value) {
            addCriterion("QGQK_QGQKCHY_FLG =", value, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgNotEqualTo(String value) {
            addCriterion("QGQK_QGQKCHY_FLG <>", value, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgGreaterThan(String value) {
            addCriterion("QGQK_QGQKCHY_FLG >", value, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("QGQK_QGQKCHY_FLG >=", value, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgLessThan(String value) {
            addCriterion("QGQK_QGQKCHY_FLG <", value, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgLessThanOrEqualTo(String value) {
            addCriterion("QGQK_QGQKCHY_FLG <=", value, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgLike(String value) {
            addCriterion("QGQK_QGQKCHY_FLG like", value, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgNotLike(String value) {
            addCriterion("QGQK_QGQKCHY_FLG not like", value, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgIn(List<String> values) {
            addCriterion("QGQK_QGQKCHY_FLG in", values, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgNotIn(List<String> values) {
            addCriterion("QGQK_QGQKCHY_FLG not in", values, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgBetween(String value1, String value2) {
            addCriterion("QGQK_QGQKCHY_FLG between", value1, value2, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkchyFlgNotBetween(String value1, String value2) {
            addCriterion("QGQK_QGQKCHY_FLG not between", value1, value2, "qgqkQgqkchyFlg");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzIsNull() {
            addCriterion("QGQK_QGQKBZ is null");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzIsNotNull() {
            addCriterion("QGQK_QGQKBZ is not null");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzEqualTo(String value) {
            addCriterion("QGQK_QGQKBZ =", value, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzNotEqualTo(String value) {
            addCriterion("QGQK_QGQKBZ <>", value, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzGreaterThan(String value) {
            addCriterion("QGQK_QGQKBZ >", value, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzGreaterThanOrEqualTo(String value) {
            addCriterion("QGQK_QGQKBZ >=", value, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzLessThan(String value) {
            addCriterion("QGQK_QGQKBZ <", value, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzLessThanOrEqualTo(String value) {
            addCriterion("QGQK_QGQKBZ <=", value, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzLike(String value) {
            addCriterion("QGQK_QGQKBZ like", value, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzNotLike(String value) {
            addCriterion("QGQK_QGQKBZ not like", value, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzIn(List<String> values) {
            addCriterion("QGQK_QGQKBZ in", values, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzNotIn(List<String> values) {
            addCriterion("QGQK_QGQKBZ not in", values, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzBetween(String value1, String value2) {
            addCriterion("QGQK_QGQKBZ between", value1, value2, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgqkQgqkbzNotBetween(String value1, String value2) {
            addCriterion("QGQK_QGQKBZ not between", value1, value2, "qgqkQgqkbz");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgIsNull() {
            addCriterion("QGCG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgIsNotNull() {
            addCriterion("QGCG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgEqualTo(String value) {
            addCriterion("QGCG_FLG =", value, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgNotEqualTo(String value) {
            addCriterion("QGCG_FLG <>", value, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgGreaterThan(String value) {
            addCriterion("QGCG_FLG >", value, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("QGCG_FLG >=", value, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgLessThan(String value) {
            addCriterion("QGCG_FLG <", value, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgLessThanOrEqualTo(String value) {
            addCriterion("QGCG_FLG <=", value, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgLike(String value) {
            addCriterion("QGCG_FLG like", value, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgNotLike(String value) {
            addCriterion("QGCG_FLG not like", value, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgIn(List<String> values) {
            addCriterion("QGCG_FLG in", values, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgNotIn(List<String> values) {
            addCriterion("QGCG_FLG not in", values, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgBetween(String value1, String value2) {
            addCriterion("QGCG_FLG between", value1, value2, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgFlgNotBetween(String value1, String value2) {
            addCriterion("QGCG_FLG not between", value1, value2, "qgcgFlg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhIsNull() {
            addCriterion("QGCG_QGDGXH is null");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhIsNotNull() {
            addCriterion("QGCG_QGDGXH is not null");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhEqualTo(String value) {
            addCriterion("QGCG_QGDGXH =", value, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhNotEqualTo(String value) {
            addCriterion("QGCG_QGDGXH <>", value, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhGreaterThan(String value) {
            addCriterion("QGCG_QGDGXH >", value, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhGreaterThanOrEqualTo(String value) {
            addCriterion("QGCG_QGDGXH >=", value, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhLessThan(String value) {
            addCriterion("QGCG_QGDGXH <", value, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhLessThanOrEqualTo(String value) {
            addCriterion("QGCG_QGDGXH <=", value, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhLike(String value) {
            addCriterion("QGCG_QGDGXH like", value, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhNotLike(String value) {
            addCriterion("QGCG_QGDGXH not like", value, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhIn(List<String> values) {
            addCriterion("QGCG_QGDGXH in", values, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhNotIn(List<String> values) {
            addCriterion("QGCG_QGDGXH not in", values, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhBetween(String value1, String value2) {
            addCriterion("QGCG_QGDGXH between", value1, value2, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgdgxhNotBetween(String value1, String value2) {
            addCriterion("QGCG_QGDGXH not between", value1, value2, "qgcgQgdgxh");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgIsNull() {
            addCriterion("QGCG_QGCG is null");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgIsNotNull() {
            addCriterion("QGCG_QGCG is not null");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgEqualTo(String value) {
            addCriterion("QGCG_QGCG =", value, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgNotEqualTo(String value) {
            addCriterion("QGCG_QGCG <>", value, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgGreaterThan(String value) {
            addCriterion("QGCG_QGCG >", value, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgGreaterThanOrEqualTo(String value) {
            addCriterion("QGCG_QGCG >=", value, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgLessThan(String value) {
            addCriterion("QGCG_QGCG <", value, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgLessThanOrEqualTo(String value) {
            addCriterion("QGCG_QGCG <=", value, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgLike(String value) {
            addCriterion("QGCG_QGCG like", value, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgNotLike(String value) {
            addCriterion("QGCG_QGCG not like", value, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgIn(List<String> values) {
            addCriterion("QGCG_QGCG in", values, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgNotIn(List<String> values) {
            addCriterion("QGCG_QGCG not in", values, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgBetween(String value1, String value2) {
            addCriterion("QGCG_QGCG between", value1, value2, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgQgcgNotBetween(String value1, String value2) {
            addCriterion("QGCG_QGCG not between", value1, value2, "qgcgQgcg");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtIsNull() {
            addCriterion("QGCG_GDT is null");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtIsNotNull() {
            addCriterion("QGCG_GDT is not null");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtEqualTo(String value) {
            addCriterion("QGCG_GDT =", value, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtNotEqualTo(String value) {
            addCriterion("QGCG_GDT <>", value, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtGreaterThan(String value) {
            addCriterion("QGCG_GDT >", value, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtGreaterThanOrEqualTo(String value) {
            addCriterion("QGCG_GDT >=", value, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtLessThan(String value) {
            addCriterion("QGCG_GDT <", value, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtLessThanOrEqualTo(String value) {
            addCriterion("QGCG_GDT <=", value, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtLike(String value) {
            addCriterion("QGCG_GDT like", value, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtNotLike(String value) {
            addCriterion("QGCG_GDT not like", value, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtIn(List<String> values) {
            addCriterion("QGCG_GDT in", values, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtNotIn(List<String> values) {
            addCriterion("QGCG_GDT not in", values, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtBetween(String value1, String value2) {
            addCriterion("QGCG_GDT between", value1, value2, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgGdtNotBetween(String value1, String value2) {
            addCriterion("QGCG_GDT not between", value1, value2, "qgcgGdt");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcIsNull() {
            addCriterion("QGCG_JMC is null");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcIsNotNull() {
            addCriterion("QGCG_JMC is not null");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcEqualTo(BigDecimal value) {
            addCriterion("QGCG_JMC =", value, "qgcgJmc");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcNotEqualTo(BigDecimal value) {
            addCriterion("QGCG_JMC <>", value, "qgcgJmc");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcGreaterThan(BigDecimal value) {
            addCriterion("QGCG_JMC >", value, "qgcgJmc");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QGCG_JMC >=", value, "qgcgJmc");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcLessThan(BigDecimal value) {
            addCriterion("QGCG_JMC <", value, "qgcgJmc");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QGCG_JMC <=", value, "qgcgJmc");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcIn(List<BigDecimal> values) {
            addCriterion("QGCG_JMC in", values, "qgcgJmc");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcNotIn(List<BigDecimal> values) {
            addCriterion("QGCG_JMC not in", values, "qgcgJmc");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QGCG_JMC between", value1, value2, "qgcgJmc");
            return (Criteria) this;
        }

        public Criteria andQgcgJmcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QGCG_JMC not between", value1, value2, "qgcgJmc");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgIsNull() {
            addCriterion("HXGNXL_FLG is null");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgIsNotNull() {
            addCriterion("HXGNXL_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgEqualTo(String value) {
            addCriterion("HXGNXL_FLG =", value, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgNotEqualTo(String value) {
            addCriterion("HXGNXL_FLG <>", value, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgGreaterThan(String value) {
            addCriterion("HXGNXL_FLG >", value, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgGreaterThanOrEqualTo(String value) {
            addCriterion("HXGNXL_FLG >=", value, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgLessThan(String value) {
            addCriterion("HXGNXL_FLG <", value, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgLessThanOrEqualTo(String value) {
            addCriterion("HXGNXL_FLG <=", value, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgLike(String value) {
            addCriterion("HXGNXL_FLG like", value, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgNotLike(String value) {
            addCriterion("HXGNXL_FLG not like", value, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgIn(List<String> values) {
            addCriterion("HXGNXL_FLG in", values, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgNotIn(List<String> values) {
            addCriterion("HXGNXL_FLG not in", values, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgBetween(String value1, String value2) {
            addCriterion("HXGNXL_FLG between", value1, value2, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxgnxlFlgNotBetween(String value1, String value2) {
            addCriterion("HXGNXL_FLG not between", value1, value2, "hxgnxlFlg");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoIsNull() {
            addCriterion("HXXTPG_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoIsNotNull() {
            addCriterion("HXXTPG_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoEqualTo(String value) {
            addCriterion("HXXTPG_MEMO =", value, "hxxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoNotEqualTo(String value) {
            addCriterion("HXXTPG_MEMO <>", value, "hxxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoGreaterThan(String value) {
            addCriterion("HXXTPG_MEMO >", value, "hxxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoGreaterThanOrEqualTo(String value) {
            addCriterion("HXXTPG_MEMO >=", value, "hxxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoLessThan(String value) {
            addCriterion("HXXTPG_MEMO <", value, "hxxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoLessThanOrEqualTo(String value) {
            addCriterion("HXXTPG_MEMO <=", value, "hxxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoLike(String value) {
            addCriterion("HXXTPG_MEMO like", value, "hxxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoNotLike(String value) {
            addCriterion("HXXTPG_MEMO not like", value, "hxxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoIn(List<String> values) {
            addCriterion("HXXTPG_MEMO in", values, "hxxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoNotIn(List<String> values) {
            addCriterion("HXXTPG_MEMO not in", values, "hxxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoBetween(String value1, String value2) {
            addCriterion("HXXTPG_MEMO between", value1, value2, "hxxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andHxxtpgMemoNotBetween(String value1, String value2) {
            addCriterion("HXXTPG_MEMO not between", value1, value2, "hxxtpgMemo");
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