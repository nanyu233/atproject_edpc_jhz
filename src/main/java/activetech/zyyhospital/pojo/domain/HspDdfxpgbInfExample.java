package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspDdfxpgbInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDdfxpgbInfExample() {
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

        public Criteria andDdfxpgbSeqIsNull() {
            addCriterion("DDFXPGB_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqIsNotNull() {
            addCriterion("DDFXPGB_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqEqualTo(String value) {
            addCriterion("DDFXPGB_SEQ =", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqNotEqualTo(String value) {
            addCriterion("DDFXPGB_SEQ <>", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqGreaterThan(String value) {
            addCriterion("DDFXPGB_SEQ >", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqGreaterThanOrEqualTo(String value) {
            addCriterion("DDFXPGB_SEQ >=", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqLessThan(String value) {
            addCriterion("DDFXPGB_SEQ <", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqLessThanOrEqualTo(String value) {
            addCriterion("DDFXPGB_SEQ <=", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqLike(String value) {
            addCriterion("DDFXPGB_SEQ like", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqNotLike(String value) {
            addCriterion("DDFXPGB_SEQ not like", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqIn(List<String> values) {
            addCriterion("DDFXPGB_SEQ in", values, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqNotIn(List<String> values) {
            addCriterion("DDFXPGB_SEQ not in", values, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqBetween(String value1, String value2) {
            addCriterion("DDFXPGB_SEQ between", value1, value2, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqNotBetween(String value1, String value2) {
            addCriterion("DDFXPGB_SEQ not between", value1, value2, "ddfxpgbSeq");
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

        public Criteria andJsgyywddCodIsNull() {
            addCriterion("JSGYYWDD_COD is null");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodIsNotNull() {
            addCriterion("JSGYYWDD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodEqualTo(String value) {
            addCriterion("JSGYYWDD_COD =", value, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodNotEqualTo(String value) {
            addCriterion("JSGYYWDD_COD <>", value, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodGreaterThan(String value) {
            addCriterion("JSGYYWDD_COD >", value, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodGreaterThanOrEqualTo(String value) {
            addCriterion("JSGYYWDD_COD >=", value, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodLessThan(String value) {
            addCriterion("JSGYYWDD_COD <", value, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodLessThanOrEqualTo(String value) {
            addCriterion("JSGYYWDD_COD <=", value, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodLike(String value) {
            addCriterion("JSGYYWDD_COD like", value, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodNotLike(String value) {
            addCriterion("JSGYYWDD_COD not like", value, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodIn(List<String> values) {
            addCriterion("JSGYYWDD_COD in", values, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodNotIn(List<String> values) {
            addCriterion("JSGYYWDD_COD not in", values, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodBetween(String value1, String value2) {
            addCriterion("JSGYYWDD_COD between", value1, value2, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andJsgyywddCodNotBetween(String value1, String value2) {
            addCriterion("JSGYYWDD_COD not between", value1, value2, "jsgyywddCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodIsNull() {
            addCriterion("DYYGJBPD_COD is null");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodIsNotNull() {
            addCriterion("DYYGJBPD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodEqualTo(String value) {
            addCriterion("DYYGJBPD_COD =", value, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodNotEqualTo(String value) {
            addCriterion("DYYGJBPD_COD <>", value, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodGreaterThan(String value) {
            addCriterion("DYYGJBPD_COD >", value, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodGreaterThanOrEqualTo(String value) {
            addCriterion("DYYGJBPD_COD >=", value, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodLessThan(String value) {
            addCriterion("DYYGJBPD_COD <", value, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodLessThanOrEqualTo(String value) {
            addCriterion("DYYGJBPD_COD <=", value, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodLike(String value) {
            addCriterion("DYYGJBPD_COD like", value, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodNotLike(String value) {
            addCriterion("DYYGJBPD_COD not like", value, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodIn(List<String> values) {
            addCriterion("DYYGJBPD_COD in", values, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodNotIn(List<String> values) {
            addCriterion("DYYGJBPD_COD not in", values, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodBetween(String value1, String value2) {
            addCriterion("DYYGJBPD_COD between", value1, value2, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andDyygjbpdCodNotBetween(String value1, String value2) {
            addCriterion("DYYGJBPD_COD not between", value1, value2, "dyygjbpdCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodIsNull() {
            addCriterion("XZFZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andXzfzCodIsNotNull() {
            addCriterion("XZFZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXzfzCodEqualTo(String value) {
            addCriterion("XZFZ_COD =", value, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodNotEqualTo(String value) {
            addCriterion("XZFZ_COD <>", value, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodGreaterThan(String value) {
            addCriterion("XZFZ_COD >", value, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodGreaterThanOrEqualTo(String value) {
            addCriterion("XZFZ_COD >=", value, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodLessThan(String value) {
            addCriterion("XZFZ_COD <", value, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodLessThanOrEqualTo(String value) {
            addCriterion("XZFZ_COD <=", value, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodLike(String value) {
            addCriterion("XZFZ_COD like", value, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodNotLike(String value) {
            addCriterion("XZFZ_COD not like", value, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodIn(List<String> values) {
            addCriterion("XZFZ_COD in", values, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodNotIn(List<String> values) {
            addCriterion("XZFZ_COD not in", values, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodBetween(String value1, String value2) {
            addCriterion("XZFZ_COD between", value1, value2, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andXzfzCodNotBetween(String value1, String value2) {
            addCriterion("XZFZ_COD not between", value1, value2, "xzfzCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodIsNull() {
            addCriterion("JMZLSYDDGFXY_COD is null");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodIsNotNull() {
            addCriterion("JMZLSYDDGFXY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodEqualTo(String value) {
            addCriterion("JMZLSYDDGFXY_COD =", value, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodNotEqualTo(String value) {
            addCriterion("JMZLSYDDGFXY_COD <>", value, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodGreaterThan(String value) {
            addCriterion("JMZLSYDDGFXY_COD >", value, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodGreaterThanOrEqualTo(String value) {
            addCriterion("JMZLSYDDGFXY_COD >=", value, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodLessThan(String value) {
            addCriterion("JMZLSYDDGFXY_COD <", value, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodLessThanOrEqualTo(String value) {
            addCriterion("JMZLSYDDGFXY_COD <=", value, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodLike(String value) {
            addCriterion("JMZLSYDDGFXY_COD like", value, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodNotLike(String value) {
            addCriterion("JMZLSYDDGFXY_COD not like", value, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodIn(List<String> values) {
            addCriterion("JMZLSYDDGFXY_COD in", values, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodNotIn(List<String> values) {
            addCriterion("JMZLSYDDGFXY_COD not in", values, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodBetween(String value1, String value2) {
            addCriterion("JMZLSYDDGFXY_COD between", value1, value2, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andJmzlsyddgfxyCodNotBetween(String value1, String value2) {
            addCriterion("JMZLSYDDGFXY_COD not between", value1, value2, "jmzlsyddgfxyCod");
            return (Criteria) this;
        }

        public Criteria andBtCodIsNull() {
            addCriterion("BT_COD is null");
            return (Criteria) this;
        }

        public Criteria andBtCodIsNotNull() {
            addCriterion("BT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBtCodEqualTo(String value) {
            addCriterion("BT_COD =", value, "btCod");
            return (Criteria) this;
        }

        public Criteria andBtCodNotEqualTo(String value) {
            addCriterion("BT_COD <>", value, "btCod");
            return (Criteria) this;
        }

        public Criteria andBtCodGreaterThan(String value) {
            addCriterion("BT_COD >", value, "btCod");
            return (Criteria) this;
        }

        public Criteria andBtCodGreaterThanOrEqualTo(String value) {
            addCriterion("BT_COD >=", value, "btCod");
            return (Criteria) this;
        }

        public Criteria andBtCodLessThan(String value) {
            addCriterion("BT_COD <", value, "btCod");
            return (Criteria) this;
        }

        public Criteria andBtCodLessThanOrEqualTo(String value) {
            addCriterion("BT_COD <=", value, "btCod");
            return (Criteria) this;
        }

        public Criteria andBtCodLike(String value) {
            addCriterion("BT_COD like", value, "btCod");
            return (Criteria) this;
        }

        public Criteria andBtCodNotLike(String value) {
            addCriterion("BT_COD not like", value, "btCod");
            return (Criteria) this;
        }

        public Criteria andBtCodIn(List<String> values) {
            addCriterion("BT_COD in", values, "btCod");
            return (Criteria) this;
        }

        public Criteria andBtCodNotIn(List<String> values) {
            addCriterion("BT_COD not in", values, "btCod");
            return (Criteria) this;
        }

        public Criteria andBtCodBetween(String value1, String value2) {
            addCriterion("BT_COD between", value1, value2, "btCod");
            return (Criteria) this;
        }

        public Criteria andBtCodNotBetween(String value1, String value2) {
            addCriterion("BT_COD not between", value1, value2, "btCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodIsNull() {
            addCriterion("RZNL_COD is null");
            return (Criteria) this;
        }

        public Criteria andRznlCodIsNotNull() {
            addCriterion("RZNL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRznlCodEqualTo(String value) {
            addCriterion("RZNL_COD =", value, "rznlCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodNotEqualTo(String value) {
            addCriterion("RZNL_COD <>", value, "rznlCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodGreaterThan(String value) {
            addCriterion("RZNL_COD >", value, "rznlCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodGreaterThanOrEqualTo(String value) {
            addCriterion("RZNL_COD >=", value, "rznlCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodLessThan(String value) {
            addCriterion("RZNL_COD <", value, "rznlCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodLessThanOrEqualTo(String value) {
            addCriterion("RZNL_COD <=", value, "rznlCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodLike(String value) {
            addCriterion("RZNL_COD like", value, "rznlCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodNotLike(String value) {
            addCriterion("RZNL_COD not like", value, "rznlCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodIn(List<String> values) {
            addCriterion("RZNL_COD in", values, "rznlCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodNotIn(List<String> values) {
            addCriterion("RZNL_COD not in", values, "rznlCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodBetween(String value1, String value2) {
            addCriterion("RZNL_COD between", value1, value2, "rznlCod");
            return (Criteria) this;
        }

        public Criteria andRznlCodNotBetween(String value1, String value2) {
            addCriterion("RZNL_COD not between", value1, value2, "rznlCod");
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

        public Criteria andZfIsNull() {
            addCriterion("ZF is null");
            return (Criteria) this;
        }

        public Criteria andZfIsNotNull() {
            addCriterion("ZF is not null");
            return (Criteria) this;
        }

        public Criteria andZfEqualTo(String value) {
            addCriterion("ZF =", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotEqualTo(String value) {
            addCriterion("ZF <>", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfGreaterThan(String value) {
            addCriterion("ZF >", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfGreaterThanOrEqualTo(String value) {
            addCriterion("ZF >=", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfLessThan(String value) {
            addCriterion("ZF <", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfLessThanOrEqualTo(String value) {
            addCriterion("ZF <=", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfLike(String value) {
            addCriterion("ZF like", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotLike(String value) {
            addCriterion("ZF not like", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfIn(List<String> values) {
            addCriterion("ZF in", values, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotIn(List<String> values) {
            addCriterion("ZF not in", values, "zf");
            return (Criteria) this;
        }

        public Criteria andZfBetween(String value1, String value2) {
            addCriterion("ZF between", value1, value2, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotBetween(String value1, String value2) {
            addCriterion("ZF not between", value1, value2, "zf");
            return (Criteria) this;
        }

        public Criteria andCretDatIsNull() {
            addCriterion("CRET_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCretDatIsNotNull() {
            addCriterion("CRET_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCretDatEqualTo(Date value) {
            addCriterion("CRET_DAT =", value, "cretDat");
            return (Criteria) this;
        }

        public Criteria andCretDatNotEqualTo(Date value) {
            addCriterion("CRET_DAT <>", value, "cretDat");
            return (Criteria) this;
        }

        public Criteria andCretDatGreaterThan(Date value) {
            addCriterion("CRET_DAT >", value, "cretDat");
            return (Criteria) this;
        }

        public Criteria andCretDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CRET_DAT >=", value, "cretDat");
            return (Criteria) this;
        }

        public Criteria andCretDatLessThan(Date value) {
            addCriterion("CRET_DAT <", value, "cretDat");
            return (Criteria) this;
        }

        public Criteria andCretDatLessThanOrEqualTo(Date value) {
            addCriterion("CRET_DAT <=", value, "cretDat");
            return (Criteria) this;
        }

        public Criteria andCretDatIn(List<Date> values) {
            addCriterion("CRET_DAT in", values, "cretDat");
            return (Criteria) this;
        }

        public Criteria andCretDatNotIn(List<Date> values) {
            addCriterion("CRET_DAT not in", values, "cretDat");
            return (Criteria) this;
        }

        public Criteria andCretDatBetween(Date value1, Date value2) {
            addCriterion("CRET_DAT between", value1, value2, "cretDat");
            return (Criteria) this;
        }

        public Criteria andCretDatNotBetween(Date value1, Date value2) {
            addCriterion("CRET_DAT not between", value1, value2, "cretDat");
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

        public Criteria andHlcsCodIsNull() {
            addCriterion("HLCS_COD is null");
            return (Criteria) this;
        }

        public Criteria andHlcsCodIsNotNull() {
            addCriterion("HLCS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHlcsCodEqualTo(String value) {
            addCriterion("HLCS_COD =", value, "hlcsCod");
            return (Criteria) this;
        }

        public Criteria andHlcsCodNotEqualTo(String value) {
            addCriterion("HLCS_COD <>", value, "hlcsCod");
            return (Criteria) this;
        }

        public Criteria andHlcsCodGreaterThan(String value) {
            addCriterion("HLCS_COD >", value, "hlcsCod");
            return (Criteria) this;
        }

        public Criteria andHlcsCodGreaterThanOrEqualTo(String value) {
            addCriterion("HLCS_COD >=", value, "hlcsCod");
            return (Criteria) this;
        }

        public Criteria andHlcsCodLessThan(String value) {
            addCriterion("HLCS_COD <", value, "hlcsCod");
            return (Criteria) this;
        }

        public Criteria andHlcsCodLessThanOrEqualTo(String value) {
            addCriterion("HLCS_COD <=", value, "hlcsCod");
            return (Criteria) this;
        }

        public Criteria andHlcsCodLike(String value) {
            addCriterion("HLCS_COD like", value, "hlcsCod");
            return (Criteria) this;
        }

        public Criteria andHlcsCodNotLike(String value) {
            addCriterion("HLCS_COD not like", value, "hlcsCod");
            return (Criteria) this;
        }

        public Criteria andHlcsCodIn(List<String> values) {
            addCriterion("HLCS_COD in", values, "hlcsCod");
            return (Criteria) this;
        }

        public Criteria andHlcsCodNotIn(List<String> values) {
            addCriterion("HLCS_COD not in", values, "hlcsCod");
            return (Criteria) this;
        }

        public Criteria andHlcsCodBetween(String value1, String value2) {
            addCriterion("HLCS_COD between", value1, value2, "hlcsCod");
            return (Criteria) this;
        }

        public Criteria andHlcsCodNotBetween(String value1, String value2) {
            addCriterion("HLCS_COD not between", value1, value2, "hlcsCod");
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