package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspXytxjjInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspXytxjjInfExample() {
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

        public Criteria andXytxSeqIsNull() {
            addCriterion("XYTX_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andXytxSeqIsNotNull() {
            addCriterion("XYTX_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andXytxSeqEqualTo(String value) {
            addCriterion("XYTX_SEQ =", value, "xytxSeq");
            return (Criteria) this;
        }

        public Criteria andXytxSeqNotEqualTo(String value) {
            addCriterion("XYTX_SEQ <>", value, "xytxSeq");
            return (Criteria) this;
        }

        public Criteria andXytxSeqGreaterThan(String value) {
            addCriterion("XYTX_SEQ >", value, "xytxSeq");
            return (Criteria) this;
        }

        public Criteria andXytxSeqGreaterThanOrEqualTo(String value) {
            addCriterion("XYTX_SEQ >=", value, "xytxSeq");
            return (Criteria) this;
        }

        public Criteria andXytxSeqLessThan(String value) {
            addCriterion("XYTX_SEQ <", value, "xytxSeq");
            return (Criteria) this;
        }

        public Criteria andXytxSeqLessThanOrEqualTo(String value) {
            addCriterion("XYTX_SEQ <=", value, "xytxSeq");
            return (Criteria) this;
        }

        public Criteria andXytxSeqLike(String value) {
            addCriterion("XYTX_SEQ like", value, "xytxSeq");
            return (Criteria) this;
        }

        public Criteria andXytxSeqNotLike(String value) {
            addCriterion("XYTX_SEQ not like", value, "xytxSeq");
            return (Criteria) this;
        }

        public Criteria andXytxSeqIn(List<String> values) {
            addCriterion("XYTX_SEQ in", values, "xytxSeq");
            return (Criteria) this;
        }

        public Criteria andXytxSeqNotIn(List<String> values) {
            addCriterion("XYTX_SEQ not in", values, "xytxSeq");
            return (Criteria) this;
        }

        public Criteria andXytxSeqBetween(String value1, String value2) {
            addCriterion("XYTX_SEQ between", value1, value2, "xytxSeq");
            return (Criteria) this;
        }

        public Criteria andXytxSeqNotBetween(String value1, String value2) {
            addCriterion("XYTX_SEQ not between", value1, value2, "xytxSeq");
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

        public Criteria andBfSzCodIsNull() {
            addCriterion("BF_SZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfSzCodIsNotNull() {
            addCriterion("BF_SZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfSzCodEqualTo(String value) {
            addCriterion("BF_SZ_COD =", value, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfSzCodNotEqualTo(String value) {
            addCriterion("BF_SZ_COD <>", value, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfSzCodGreaterThan(String value) {
            addCriterion("BF_SZ_COD >", value, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfSzCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_SZ_COD >=", value, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfSzCodLessThan(String value) {
            addCriterion("BF_SZ_COD <", value, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfSzCodLessThanOrEqualTo(String value) {
            addCriterion("BF_SZ_COD <=", value, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfSzCodLike(String value) {
            addCriterion("BF_SZ_COD like", value, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfSzCodNotLike(String value) {
            addCriterion("BF_SZ_COD not like", value, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfSzCodIn(List<String> values) {
            addCriterion("BF_SZ_COD in", values, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfSzCodNotIn(List<String> values) {
            addCriterion("BF_SZ_COD not in", values, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfSzCodBetween(String value1, String value2) {
            addCriterion("BF_SZ_COD between", value1, value2, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfSzCodNotBetween(String value1, String value2) {
            addCriterion("BF_SZ_COD not between", value1, value2, "bfSzCod");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftIsNull() {
            addCriterion("BF_TK_LEFT is null");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftIsNotNull() {
            addCriterion("BF_TK_LEFT is not null");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftEqualTo(String value) {
            addCriterion("BF_TK_LEFT =", value, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftNotEqualTo(String value) {
            addCriterion("BF_TK_LEFT <>", value, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftGreaterThan(String value) {
            addCriterion("BF_TK_LEFT >", value, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftGreaterThanOrEqualTo(String value) {
            addCriterion("BF_TK_LEFT >=", value, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftLessThan(String value) {
            addCriterion("BF_TK_LEFT <", value, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftLessThanOrEqualTo(String value) {
            addCriterion("BF_TK_LEFT <=", value, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftLike(String value) {
            addCriterion("BF_TK_LEFT like", value, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftNotLike(String value) {
            addCriterion("BF_TK_LEFT not like", value, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftIn(List<String> values) {
            addCriterion("BF_TK_LEFT in", values, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftNotIn(List<String> values) {
            addCriterion("BF_TK_LEFT not in", values, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftBetween(String value1, String value2) {
            addCriterion("BF_TK_LEFT between", value1, value2, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkLeftNotBetween(String value1, String value2) {
            addCriterion("BF_TK_LEFT not between", value1, value2, "bfTkLeft");
            return (Criteria) this;
        }

        public Criteria andBfTkRightIsNull() {
            addCriterion("BF_TK_RIGHT is null");
            return (Criteria) this;
        }

        public Criteria andBfTkRightIsNotNull() {
            addCriterion("BF_TK_RIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andBfTkRightEqualTo(String value) {
            addCriterion("BF_TK_RIGHT =", value, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkRightNotEqualTo(String value) {
            addCriterion("BF_TK_RIGHT <>", value, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkRightGreaterThan(String value) {
            addCriterion("BF_TK_RIGHT >", value, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkRightGreaterThanOrEqualTo(String value) {
            addCriterion("BF_TK_RIGHT >=", value, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkRightLessThan(String value) {
            addCriterion("BF_TK_RIGHT <", value, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkRightLessThanOrEqualTo(String value) {
            addCriterion("BF_TK_RIGHT <=", value, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkRightLike(String value) {
            addCriterion("BF_TK_RIGHT like", value, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkRightNotLike(String value) {
            addCriterion("BF_TK_RIGHT not like", value, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkRightIn(List<String> values) {
            addCriterion("BF_TK_RIGHT in", values, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkRightNotIn(List<String> values) {
            addCriterion("BF_TK_RIGHT not in", values, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkRightBetween(String value1, String value2) {
            addCriterion("BF_TK_RIGHT between", value1, value2, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkRightNotBetween(String value1, String value2) {
            addCriterion("BF_TK_RIGHT not between", value1, value2, "bfTkRight");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyIsNull() {
            addCriterion("BF_TK_DGFY is null");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyIsNotNull() {
            addCriterion("BF_TK_DGFY is not null");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyEqualTo(String value) {
            addCriterion("BF_TK_DGFY =", value, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyNotEqualTo(String value) {
            addCriterion("BF_TK_DGFY <>", value, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyGreaterThan(String value) {
            addCriterion("BF_TK_DGFY >", value, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyGreaterThanOrEqualTo(String value) {
            addCriterion("BF_TK_DGFY >=", value, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyLessThan(String value) {
            addCriterion("BF_TK_DGFY <", value, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyLessThanOrEqualTo(String value) {
            addCriterion("BF_TK_DGFY <=", value, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyLike(String value) {
            addCriterion("BF_TK_DGFY like", value, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyNotLike(String value) {
            addCriterion("BF_TK_DGFY not like", value, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyIn(List<String> values) {
            addCriterion("BF_TK_DGFY in", values, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyNotIn(List<String> values) {
            addCriterion("BF_TK_DGFY not in", values, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyBetween(String value1, String value2) {
            addCriterion("BF_TK_DGFY between", value1, value2, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfTkDgfyNotBetween(String value1, String value2) {
            addCriterion("BF_TK_DGFY not between", value1, value2, "bfTkDgfy");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwIsNull() {
            addCriterion("BF_SMTZ_TW is null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwIsNotNull() {
            addCriterion("BF_SMTZ_TW is not null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwEqualTo(BigDecimal value) {
            addCriterion("BF_SMTZ_TW =", value, "bfSmtzTw");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwNotEqualTo(BigDecimal value) {
            addCriterion("BF_SMTZ_TW <>", value, "bfSmtzTw");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwGreaterThan(BigDecimal value) {
            addCriterion("BF_SMTZ_TW >", value, "bfSmtzTw");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BF_SMTZ_TW >=", value, "bfSmtzTw");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwLessThan(BigDecimal value) {
            addCriterion("BF_SMTZ_TW <", value, "bfSmtzTw");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BF_SMTZ_TW <=", value, "bfSmtzTw");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwIn(List<BigDecimal> values) {
            addCriterion("BF_SMTZ_TW in", values, "bfSmtzTw");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwNotIn(List<BigDecimal> values) {
            addCriterion("BF_SMTZ_TW not in", values, "bfSmtzTw");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BF_SMTZ_TW between", value1, value2, "bfSmtzTw");
            return (Criteria) this;
        }

        public Criteria andBfSmtzTwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BF_SMTZ_TW not between", value1, value2, "bfSmtzTw");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxIsNull() {
            addCriterion("BF_SMTZ_HX is null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxIsNotNull() {
            addCriterion("BF_SMTZ_HX is not null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxEqualTo(Short value) {
            addCriterion("BF_SMTZ_HX =", value, "bfSmtzHx");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxNotEqualTo(Short value) {
            addCriterion("BF_SMTZ_HX <>", value, "bfSmtzHx");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxGreaterThan(Short value) {
            addCriterion("BF_SMTZ_HX >", value, "bfSmtzHx");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxGreaterThanOrEqualTo(Short value) {
            addCriterion("BF_SMTZ_HX >=", value, "bfSmtzHx");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxLessThan(Short value) {
            addCriterion("BF_SMTZ_HX <", value, "bfSmtzHx");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxLessThanOrEqualTo(Short value) {
            addCriterion("BF_SMTZ_HX <=", value, "bfSmtzHx");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxIn(List<Short> values) {
            addCriterion("BF_SMTZ_HX in", values, "bfSmtzHx");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxNotIn(List<Short> values) {
            addCriterion("BF_SMTZ_HX not in", values, "bfSmtzHx");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxBetween(Short value1, Short value2) {
            addCriterion("BF_SMTZ_HX between", value1, value2, "bfSmtzHx");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHxNotBetween(Short value1, Short value2) {
            addCriterion("BF_SMTZ_HX not between", value1, value2, "bfSmtzHx");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrIsNull() {
            addCriterion("BF_SMTZ_HR is null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrIsNotNull() {
            addCriterion("BF_SMTZ_HR is not null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrEqualTo(Short value) {
            addCriterion("BF_SMTZ_HR =", value, "bfSmtzHr");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrNotEqualTo(Short value) {
            addCriterion("BF_SMTZ_HR <>", value, "bfSmtzHr");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrGreaterThan(Short value) {
            addCriterion("BF_SMTZ_HR >", value, "bfSmtzHr");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrGreaterThanOrEqualTo(Short value) {
            addCriterion("BF_SMTZ_HR >=", value, "bfSmtzHr");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrLessThan(Short value) {
            addCriterion("BF_SMTZ_HR <", value, "bfSmtzHr");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrLessThanOrEqualTo(Short value) {
            addCriterion("BF_SMTZ_HR <=", value, "bfSmtzHr");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrIn(List<Short> values) {
            addCriterion("BF_SMTZ_HR in", values, "bfSmtzHr");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrNotIn(List<Short> values) {
            addCriterion("BF_SMTZ_HR not in", values, "bfSmtzHr");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrBetween(Short value1, Short value2) {
            addCriterion("BF_SMTZ_HR between", value1, value2, "bfSmtzHr");
            return (Criteria) this;
        }

        public Criteria andBfSmtzHrNotBetween(Short value1, Short value2) {
            addCriterion("BF_SMTZ_HR not between", value1, value2, "bfSmtzHr");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupIsNull() {
            addCriterion("BF_SMTZ_BPUP is null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupIsNotNull() {
            addCriterion("BF_SMTZ_BPUP is not null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupEqualTo(Short value) {
            addCriterion("BF_SMTZ_BPUP =", value, "bfSmtzBpup");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupNotEqualTo(Short value) {
            addCriterion("BF_SMTZ_BPUP <>", value, "bfSmtzBpup");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupGreaterThan(Short value) {
            addCriterion("BF_SMTZ_BPUP >", value, "bfSmtzBpup");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupGreaterThanOrEqualTo(Short value) {
            addCriterion("BF_SMTZ_BPUP >=", value, "bfSmtzBpup");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupLessThan(Short value) {
            addCriterion("BF_SMTZ_BPUP <", value, "bfSmtzBpup");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupLessThanOrEqualTo(Short value) {
            addCriterion("BF_SMTZ_BPUP <=", value, "bfSmtzBpup");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupIn(List<Short> values) {
            addCriterion("BF_SMTZ_BPUP in", values, "bfSmtzBpup");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupNotIn(List<Short> values) {
            addCriterion("BF_SMTZ_BPUP not in", values, "bfSmtzBpup");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupBetween(Short value1, Short value2) {
            addCriterion("BF_SMTZ_BPUP between", value1, value2, "bfSmtzBpup");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpupNotBetween(Short value1, Short value2) {
            addCriterion("BF_SMTZ_BPUP not between", value1, value2, "bfSmtzBpup");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownIsNull() {
            addCriterion("BF_SMTZ_BPDOWN is null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownIsNotNull() {
            addCriterion("BF_SMTZ_BPDOWN is not null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownEqualTo(Short value) {
            addCriterion("BF_SMTZ_BPDOWN =", value, "bfSmtzBpdown");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownNotEqualTo(Short value) {
            addCriterion("BF_SMTZ_BPDOWN <>", value, "bfSmtzBpdown");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownGreaterThan(Short value) {
            addCriterion("BF_SMTZ_BPDOWN >", value, "bfSmtzBpdown");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownGreaterThanOrEqualTo(Short value) {
            addCriterion("BF_SMTZ_BPDOWN >=", value, "bfSmtzBpdown");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownLessThan(Short value) {
            addCriterion("BF_SMTZ_BPDOWN <", value, "bfSmtzBpdown");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownLessThanOrEqualTo(Short value) {
            addCriterion("BF_SMTZ_BPDOWN <=", value, "bfSmtzBpdown");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownIn(List<Short> values) {
            addCriterion("BF_SMTZ_BPDOWN in", values, "bfSmtzBpdown");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownNotIn(List<Short> values) {
            addCriterion("BF_SMTZ_BPDOWN not in", values, "bfSmtzBpdown");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownBetween(Short value1, Short value2) {
            addCriterion("BF_SMTZ_BPDOWN between", value1, value2, "bfSmtzBpdown");
            return (Criteria) this;
        }

        public Criteria andBfSmtzBpdownNotBetween(Short value1, Short value2) {
            addCriterion("BF_SMTZ_BPDOWN not between", value1, value2, "bfSmtzBpdown");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2IsNull() {
            addCriterion("BF_SMTZ_SAO2 is null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2IsNotNull() {
            addCriterion("BF_SMTZ_SAO2 is not null");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2EqualTo(Short value) {
            addCriterion("BF_SMTZ_SAO2 =", value, "bfSmtzSao2");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2NotEqualTo(Short value) {
            addCriterion("BF_SMTZ_SAO2 <>", value, "bfSmtzSao2");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2GreaterThan(Short value) {
            addCriterion("BF_SMTZ_SAO2 >", value, "bfSmtzSao2");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2GreaterThanOrEqualTo(Short value) {
            addCriterion("BF_SMTZ_SAO2 >=", value, "bfSmtzSao2");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2LessThan(Short value) {
            addCriterion("BF_SMTZ_SAO2 <", value, "bfSmtzSao2");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2LessThanOrEqualTo(Short value) {
            addCriterion("BF_SMTZ_SAO2 <=", value, "bfSmtzSao2");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2In(List<Short> values) {
            addCriterion("BF_SMTZ_SAO2 in", values, "bfSmtzSao2");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2NotIn(List<Short> values) {
            addCriterion("BF_SMTZ_SAO2 not in", values, "bfSmtzSao2");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2Between(Short value1, Short value2) {
            addCriterion("BF_SMTZ_SAO2 between", value1, value2, "bfSmtzSao2");
            return (Criteria) this;
        }

        public Criteria andBfSmtzSao2NotBetween(Short value1, Short value2) {
            addCriterion("BF_SMTZ_SAO2 not between", value1, value2, "bfSmtzSao2");
            return (Criteria) this;
        }

        public Criteria andBfPfCodIsNull() {
            addCriterion("BF_PF_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfPfCodIsNotNull() {
            addCriterion("BF_PF_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfPfCodEqualTo(String value) {
            addCriterion("BF_PF_COD =", value, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfCodNotEqualTo(String value) {
            addCriterion("BF_PF_COD <>", value, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfCodGreaterThan(String value) {
            addCriterion("BF_PF_COD >", value, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_PF_COD >=", value, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfCodLessThan(String value) {
            addCriterion("BF_PF_COD <", value, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfCodLessThanOrEqualTo(String value) {
            addCriterion("BF_PF_COD <=", value, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfCodLike(String value) {
            addCriterion("BF_PF_COD like", value, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfCodNotLike(String value) {
            addCriterion("BF_PF_COD not like", value, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfCodIn(List<String> values) {
            addCriterion("BF_PF_COD in", values, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfCodNotIn(List<String> values) {
            addCriterion("BF_PF_COD not in", values, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfCodBetween(String value1, String value2) {
            addCriterion("BF_PF_COD between", value1, value2, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfCodNotBetween(String value1, String value2) {
            addCriterion("BF_PF_COD not between", value1, value2, "bfPfCod");
            return (Criteria) this;
        }

        public Criteria andBfPfBwIsNull() {
            addCriterion("BF_PF_BW is null");
            return (Criteria) this;
        }

        public Criteria andBfPfBwIsNotNull() {
            addCriterion("BF_PF_BW is not null");
            return (Criteria) this;
        }

        public Criteria andBfPfBwEqualTo(String value) {
            addCriterion("BF_PF_BW =", value, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwNotEqualTo(String value) {
            addCriterion("BF_PF_BW <>", value, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwGreaterThan(String value) {
            addCriterion("BF_PF_BW >", value, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwGreaterThanOrEqualTo(String value) {
            addCriterion("BF_PF_BW >=", value, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwLessThan(String value) {
            addCriterion("BF_PF_BW <", value, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwLessThanOrEqualTo(String value) {
            addCriterion("BF_PF_BW <=", value, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwLike(String value) {
            addCriterion("BF_PF_BW like", value, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwNotLike(String value) {
            addCriterion("BF_PF_BW not like", value, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwIn(List<String> values) {
            addCriterion("BF_PF_BW in", values, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwNotIn(List<String> values) {
            addCriterion("BF_PF_BW not in", values, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwBetween(String value1, String value2) {
            addCriterion("BF_PF_BW between", value1, value2, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwNotBetween(String value1, String value2) {
            addCriterion("BF_PF_BW not between", value1, value2, "bfPfBw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwIsNull() {
            addCriterion("BF_PF_BWFW is null");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwIsNotNull() {
            addCriterion("BF_PF_BWFW is not null");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwEqualTo(String value) {
            addCriterion("BF_PF_BWFW =", value, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwNotEqualTo(String value) {
            addCriterion("BF_PF_BWFW <>", value, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwGreaterThan(String value) {
            addCriterion("BF_PF_BWFW >", value, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwGreaterThanOrEqualTo(String value) {
            addCriterion("BF_PF_BWFW >=", value, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwLessThan(String value) {
            addCriterion("BF_PF_BWFW <", value, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwLessThanOrEqualTo(String value) {
            addCriterion("BF_PF_BWFW <=", value, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwLike(String value) {
            addCriterion("BF_PF_BWFW like", value, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwNotLike(String value) {
            addCriterion("BF_PF_BWFW not like", value, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwIn(List<String> values) {
            addCriterion("BF_PF_BWFW in", values, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwNotIn(List<String> values) {
            addCriterion("BF_PF_BWFW not in", values, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwBetween(String value1, String value2) {
            addCriterion("BF_PF_BWFW between", value1, value2, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfPfBwfwNotBetween(String value1, String value2) {
            addCriterion("BF_PF_BWFW not between", value1, value2, "bfPfBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodIsNull() {
            addCriterion("BF_YLG_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodIsNotNull() {
            addCriterion("BF_YLG_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodEqualTo(String value) {
            addCriterion("BF_YLG_COD =", value, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodNotEqualTo(String value) {
            addCriterion("BF_YLG_COD <>", value, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodGreaterThan(String value) {
            addCriterion("BF_YLG_COD >", value, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_YLG_COD >=", value, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodLessThan(String value) {
            addCriterion("BF_YLG_COD <", value, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodLessThanOrEqualTo(String value) {
            addCriterion("BF_YLG_COD <=", value, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodLike(String value) {
            addCriterion("BF_YLG_COD like", value, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodNotLike(String value) {
            addCriterion("BF_YLG_COD not like", value, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodIn(List<String> values) {
            addCriterion("BF_YLG_COD in", values, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodNotIn(List<String> values) {
            addCriterion("BF_YLG_COD not in", values, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodBetween(String value1, String value2) {
            addCriterion("BF_YLG_COD between", value1, value2, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgCodNotBetween(String value1, String value2) {
            addCriterion("BF_YLG_COD not between", value1, value2, "bfYlgCod");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwIsNull() {
            addCriterion("BF_YLG_BW is null");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwIsNotNull() {
            addCriterion("BF_YLG_BW is not null");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwEqualTo(String value) {
            addCriterion("BF_YLG_BW =", value, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwNotEqualTo(String value) {
            addCriterion("BF_YLG_BW <>", value, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwGreaterThan(String value) {
            addCriterion("BF_YLG_BW >", value, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwGreaterThanOrEqualTo(String value) {
            addCriterion("BF_YLG_BW >=", value, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwLessThan(String value) {
            addCriterion("BF_YLG_BW <", value, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwLessThanOrEqualTo(String value) {
            addCriterion("BF_YLG_BW <=", value, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwLike(String value) {
            addCriterion("BF_YLG_BW like", value, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwNotLike(String value) {
            addCriterion("BF_YLG_BW not like", value, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwIn(List<String> values) {
            addCriterion("BF_YLG_BW in", values, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwNotIn(List<String> values) {
            addCriterion("BF_YLG_BW not in", values, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwBetween(String value1, String value2) {
            addCriterion("BF_YLG_BW between", value1, value2, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwNotBetween(String value1, String value2) {
            addCriterion("BF_YLG_BW not between", value1, value2, "bfYlgBw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwIsNull() {
            addCriterion("BF_YLG_BWFW is null");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwIsNotNull() {
            addCriterion("BF_YLG_BWFW is not null");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwEqualTo(String value) {
            addCriterion("BF_YLG_BWFW =", value, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwNotEqualTo(String value) {
            addCriterion("BF_YLG_BWFW <>", value, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwGreaterThan(String value) {
            addCriterion("BF_YLG_BWFW >", value, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwGreaterThanOrEqualTo(String value) {
            addCriterion("BF_YLG_BWFW >=", value, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwLessThan(String value) {
            addCriterion("BF_YLG_BWFW <", value, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwLessThanOrEqualTo(String value) {
            addCriterion("BF_YLG_BWFW <=", value, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwLike(String value) {
            addCriterion("BF_YLG_BWFW like", value, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwNotLike(String value) {
            addCriterion("BF_YLG_BWFW not like", value, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwIn(List<String> values) {
            addCriterion("BF_YLG_BWFW in", values, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwNotIn(List<String> values) {
            addCriterion("BF_YLG_BWFW not in", values, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwBetween(String value1, String value2) {
            addCriterion("BF_YLG_BWFW between", value1, value2, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfYlgBwfwNotBetween(String value1, String value2) {
            addCriterion("BF_YLG_BWFW not between", value1, value2, "bfYlgBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodIsNull() {
            addCriterion("BF_CXQK_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodIsNotNull() {
            addCriterion("BF_CXQK_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodEqualTo(String value) {
            addCriterion("BF_CXQK_COD =", value, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodNotEqualTo(String value) {
            addCriterion("BF_CXQK_COD <>", value, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodGreaterThan(String value) {
            addCriterion("BF_CXQK_COD >", value, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_CXQK_COD >=", value, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodLessThan(String value) {
            addCriterion("BF_CXQK_COD <", value, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodLessThanOrEqualTo(String value) {
            addCriterion("BF_CXQK_COD <=", value, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodLike(String value) {
            addCriterion("BF_CXQK_COD like", value, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodNotLike(String value) {
            addCriterion("BF_CXQK_COD not like", value, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodIn(List<String> values) {
            addCriterion("BF_CXQK_COD in", values, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodNotIn(List<String> values) {
            addCriterion("BF_CXQK_COD not in", values, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodBetween(String value1, String value2) {
            addCriterion("BF_CXQK_COD between", value1, value2, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkCodNotBetween(String value1, String value2) {
            addCriterion("BF_CXQK_COD not between", value1, value2, "bfCxqkCod");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwIsNull() {
            addCriterion("BF_CXQK_BW is null");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwIsNotNull() {
            addCriterion("BF_CXQK_BW is not null");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwEqualTo(String value) {
            addCriterion("BF_CXQK_BW =", value, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwNotEqualTo(String value) {
            addCriterion("BF_CXQK_BW <>", value, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwGreaterThan(String value) {
            addCriterion("BF_CXQK_BW >", value, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwGreaterThanOrEqualTo(String value) {
            addCriterion("BF_CXQK_BW >=", value, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwLessThan(String value) {
            addCriterion("BF_CXQK_BW <", value, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwLessThanOrEqualTo(String value) {
            addCriterion("BF_CXQK_BW <=", value, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwLike(String value) {
            addCriterion("BF_CXQK_BW like", value, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwNotLike(String value) {
            addCriterion("BF_CXQK_BW not like", value, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwIn(List<String> values) {
            addCriterion("BF_CXQK_BW in", values, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwNotIn(List<String> values) {
            addCriterion("BF_CXQK_BW not in", values, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwBetween(String value1, String value2) {
            addCriterion("BF_CXQK_BW between", value1, value2, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwNotBetween(String value1, String value2) {
            addCriterion("BF_CXQK_BW not between", value1, value2, "bfCxqkBw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwIsNull() {
            addCriterion("BF_CXQK_BWFW is null");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwIsNotNull() {
            addCriterion("BF_CXQK_BWFW is not null");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwEqualTo(String value) {
            addCriterion("BF_CXQK_BWFW =", value, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwNotEqualTo(String value) {
            addCriterion("BF_CXQK_BWFW <>", value, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwGreaterThan(String value) {
            addCriterion("BF_CXQK_BWFW >", value, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwGreaterThanOrEqualTo(String value) {
            addCriterion("BF_CXQK_BWFW >=", value, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwLessThan(String value) {
            addCriterion("BF_CXQK_BWFW <", value, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwLessThanOrEqualTo(String value) {
            addCriterion("BF_CXQK_BWFW <=", value, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwLike(String value) {
            addCriterion("BF_CXQK_BWFW like", value, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwNotLike(String value) {
            addCriterion("BF_CXQK_BWFW not like", value, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwIn(List<String> values) {
            addCriterion("BF_CXQK_BWFW in", values, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwNotIn(List<String> values) {
            addCriterion("BF_CXQK_BWFW not in", values, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwBetween(String value1, String value2) {
            addCriterion("BF_CXQK_BWFW between", value1, value2, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfCxqkBwfwNotBetween(String value1, String value2) {
            addCriterion("BF_CXQK_BWFW not between", value1, value2, "bfCxqkBwfw");
            return (Criteria) this;
        }

        public Criteria andBfSyCodIsNull() {
            addCriterion("BF_SY_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfSyCodIsNotNull() {
            addCriterion("BF_SY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfSyCodEqualTo(String value) {
            addCriterion("BF_SY_COD =", value, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyCodNotEqualTo(String value) {
            addCriterion("BF_SY_COD <>", value, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyCodGreaterThan(String value) {
            addCriterion("BF_SY_COD >", value, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_SY_COD >=", value, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyCodLessThan(String value) {
            addCriterion("BF_SY_COD <", value, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyCodLessThanOrEqualTo(String value) {
            addCriterion("BF_SY_COD <=", value, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyCodLike(String value) {
            addCriterion("BF_SY_COD like", value, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyCodNotLike(String value) {
            addCriterion("BF_SY_COD not like", value, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyCodIn(List<String> values) {
            addCriterion("BF_SY_COD in", values, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyCodNotIn(List<String> values) {
            addCriterion("BF_SY_COD not in", values, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyCodBetween(String value1, String value2) {
            addCriterion("BF_SY_COD between", value1, value2, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyCodNotBetween(String value1, String value2) {
            addCriterion("BF_SY_COD not between", value1, value2, "bfSyCod");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgIsNull() {
            addCriterion("BF_SY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgIsNotNull() {
            addCriterion("BF_SY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgEqualTo(String value) {
            addCriterion("BF_SY_FLG =", value, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgNotEqualTo(String value) {
            addCriterion("BF_SY_FLG <>", value, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgGreaterThan(String value) {
            addCriterion("BF_SY_FLG >", value, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("BF_SY_FLG >=", value, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgLessThan(String value) {
            addCriterion("BF_SY_FLG <", value, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgLessThanOrEqualTo(String value) {
            addCriterion("BF_SY_FLG <=", value, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgLike(String value) {
            addCriterion("BF_SY_FLG like", value, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgNotLike(String value) {
            addCriterion("BF_SY_FLG not like", value, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgIn(List<String> values) {
            addCriterion("BF_SY_FLG in", values, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgNotIn(List<String> values) {
            addCriterion("BF_SY_FLG not in", values, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgBetween(String value1, String value2) {
            addCriterion("BF_SY_FLG between", value1, value2, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyFlgNotBetween(String value1, String value2) {
            addCriterion("BF_SY_FLG not between", value1, value2, "bfSyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesIsNull() {
            addCriterion("BF_SYQT_DES is null");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesIsNotNull() {
            addCriterion("BF_SYQT_DES is not null");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesEqualTo(String value) {
            addCriterion("BF_SYQT_DES =", value, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesNotEqualTo(String value) {
            addCriterion("BF_SYQT_DES <>", value, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesGreaterThan(String value) {
            addCriterion("BF_SYQT_DES >", value, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesGreaterThanOrEqualTo(String value) {
            addCriterion("BF_SYQT_DES >=", value, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesLessThan(String value) {
            addCriterion("BF_SYQT_DES <", value, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesLessThanOrEqualTo(String value) {
            addCriterion("BF_SYQT_DES <=", value, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesLike(String value) {
            addCriterion("BF_SYQT_DES like", value, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesNotLike(String value) {
            addCriterion("BF_SYQT_DES not like", value, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesIn(List<String> values) {
            addCriterion("BF_SYQT_DES in", values, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesNotIn(List<String> values) {
            addCriterion("BF_SYQT_DES not in", values, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesBetween(String value1, String value2) {
            addCriterion("BF_SYQT_DES between", value1, value2, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfSyqtDesNotBetween(String value1, String value2) {
            addCriterion("BF_SYQT_DES not between", value1, value2, "bfSyqtDes");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodIsNull() {
            addCriterion("BF_XTSYWFY_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodIsNotNull() {
            addCriterion("BF_XTSYWFY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodEqualTo(String value) {
            addCriterion("BF_XTSYWFY_COD =", value, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodNotEqualTo(String value) {
            addCriterion("BF_XTSYWFY_COD <>", value, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodGreaterThan(String value) {
            addCriterion("BF_XTSYWFY_COD >", value, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_XTSYWFY_COD >=", value, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodLessThan(String value) {
            addCriterion("BF_XTSYWFY_COD <", value, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodLessThanOrEqualTo(String value) {
            addCriterion("BF_XTSYWFY_COD <=", value, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodLike(String value) {
            addCriterion("BF_XTSYWFY_COD like", value, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodNotLike(String value) {
            addCriterion("BF_XTSYWFY_COD not like", value, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodIn(List<String> values) {
            addCriterion("BF_XTSYWFY_COD in", values, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodNotIn(List<String> values) {
            addCriterion("BF_XTSYWFY_COD not in", values, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodBetween(String value1, String value2) {
            addCriterion("BF_XTSYWFY_COD between", value1, value2, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyCodNotBetween(String value1, String value2) {
            addCriterion("BF_XTSYWFY_COD not between", value1, value2, "bfXtsywfyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamIsNull() {
            addCriterion("BF_XTSYWFY_NAM is null");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamIsNotNull() {
            addCriterion("BF_XTSYWFY_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamEqualTo(String value) {
            addCriterion("BF_XTSYWFY_NAM =", value, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamNotEqualTo(String value) {
            addCriterion("BF_XTSYWFY_NAM <>", value, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamGreaterThan(String value) {
            addCriterion("BF_XTSYWFY_NAM >", value, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamGreaterThanOrEqualTo(String value) {
            addCriterion("BF_XTSYWFY_NAM >=", value, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamLessThan(String value) {
            addCriterion("BF_XTSYWFY_NAM <", value, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamLessThanOrEqualTo(String value) {
            addCriterion("BF_XTSYWFY_NAM <=", value, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamLike(String value) {
            addCriterion("BF_XTSYWFY_NAM like", value, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamNotLike(String value) {
            addCriterion("BF_XTSYWFY_NAM not like", value, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamIn(List<String> values) {
            addCriterion("BF_XTSYWFY_NAM in", values, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamNotIn(List<String> values) {
            addCriterion("BF_XTSYWFY_NAM not in", values, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamBetween(String value1, String value2) {
            addCriterion("BF_XTSYWFY_NAM between", value1, value2, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywfyNamNotBetween(String value1, String value2) {
            addCriterion("BF_XTSYWFY_NAM not between", value1, value2, "bfXtsywfyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodIsNull() {
            addCriterion("BF_XTSYWZJY_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodIsNotNull() {
            addCriterion("BF_XTSYWZJY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodEqualTo(String value) {
            addCriterion("BF_XTSYWZJY_COD =", value, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodNotEqualTo(String value) {
            addCriterion("BF_XTSYWZJY_COD <>", value, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodGreaterThan(String value) {
            addCriterion("BF_XTSYWZJY_COD >", value, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_XTSYWZJY_COD >=", value, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodLessThan(String value) {
            addCriterion("BF_XTSYWZJY_COD <", value, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodLessThanOrEqualTo(String value) {
            addCriterion("BF_XTSYWZJY_COD <=", value, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodLike(String value) {
            addCriterion("BF_XTSYWZJY_COD like", value, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodNotLike(String value) {
            addCriterion("BF_XTSYWZJY_COD not like", value, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodIn(List<String> values) {
            addCriterion("BF_XTSYWZJY_COD in", values, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodNotIn(List<String> values) {
            addCriterion("BF_XTSYWZJY_COD not in", values, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodBetween(String value1, String value2) {
            addCriterion("BF_XTSYWZJY_COD between", value1, value2, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyCodNotBetween(String value1, String value2) {
            addCriterion("BF_XTSYWZJY_COD not between", value1, value2, "bfXtsywzjyCod");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamIsNull() {
            addCriterion("BF_XTSYWZJY_NAM is null");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamIsNotNull() {
            addCriterion("BF_XTSYWZJY_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamEqualTo(String value) {
            addCriterion("BF_XTSYWZJY_NAM =", value, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamNotEqualTo(String value) {
            addCriterion("BF_XTSYWZJY_NAM <>", value, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamGreaterThan(String value) {
            addCriterion("BF_XTSYWZJY_NAM >", value, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamGreaterThanOrEqualTo(String value) {
            addCriterion("BF_XTSYWZJY_NAM >=", value, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamLessThan(String value) {
            addCriterion("BF_XTSYWZJY_NAM <", value, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamLessThanOrEqualTo(String value) {
            addCriterion("BF_XTSYWZJY_NAM <=", value, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamLike(String value) {
            addCriterion("BF_XTSYWZJY_NAM like", value, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamNotLike(String value) {
            addCriterion("BF_XTSYWZJY_NAM not like", value, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamIn(List<String> values) {
            addCriterion("BF_XTSYWZJY_NAM in", values, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamNotIn(List<String> values) {
            addCriterion("BF_XTSYWZJY_NAM not in", values, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamBetween(String value1, String value2) {
            addCriterion("BF_XTSYWZJY_NAM between", value1, value2, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtsywzjyNamNotBetween(String value1, String value2) {
            addCriterion("BF_XTSYWZJY_NAM not between", value1, value2, "bfXtsywzjyNam");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodIsNull() {
            addCriterion("BF_XTSWP_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodIsNotNull() {
            addCriterion("BF_XTSWP_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodEqualTo(String value) {
            addCriterion("BF_XTSWP_COD =", value, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodNotEqualTo(String value) {
            addCriterion("BF_XTSWP_COD <>", value, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodGreaterThan(String value) {
            addCriterion("BF_XTSWP_COD >", value, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_XTSWP_COD >=", value, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodLessThan(String value) {
            addCriterion("BF_XTSWP_COD <", value, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodLessThanOrEqualTo(String value) {
            addCriterion("BF_XTSWP_COD <=", value, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodLike(String value) {
            addCriterion("BF_XTSWP_COD like", value, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodNotLike(String value) {
            addCriterion("BF_XTSWP_COD not like", value, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodIn(List<String> values) {
            addCriterion("BF_XTSWP_COD in", values, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodNotIn(List<String> values) {
            addCriterion("BF_XTSWP_COD not in", values, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodBetween(String value1, String value2) {
            addCriterion("BF_XTSWP_COD between", value1, value2, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpCodNotBetween(String value1, String value2) {
            addCriterion("BF_XTSWP_COD not between", value1, value2, "bfXtswpCod");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtIsNull() {
            addCriterion("BF_XTSWP_QT is null");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtIsNotNull() {
            addCriterion("BF_XTSWP_QT is not null");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtEqualTo(String value) {
            addCriterion("BF_XTSWP_QT =", value, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtNotEqualTo(String value) {
            addCriterion("BF_XTSWP_QT <>", value, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtGreaterThan(String value) {
            addCriterion("BF_XTSWP_QT >", value, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtGreaterThanOrEqualTo(String value) {
            addCriterion("BF_XTSWP_QT >=", value, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtLessThan(String value) {
            addCriterion("BF_XTSWP_QT <", value, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtLessThanOrEqualTo(String value) {
            addCriterion("BF_XTSWP_QT <=", value, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtLike(String value) {
            addCriterion("BF_XTSWP_QT like", value, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtNotLike(String value) {
            addCriterion("BF_XTSWP_QT not like", value, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtIn(List<String> values) {
            addCriterion("BF_XTSWP_QT in", values, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtNotIn(List<String> values) {
            addCriterion("BF_XTSWP_QT not in", values, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtBetween(String value1, String value2) {
            addCriterion("BF_XTSWP_QT between", value1, value2, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfXtswpQtNotBetween(String value1, String value2) {
            addCriterion("BF_XTSWP_QT not between", value1, value2, "bfXtswpQt");
            return (Criteria) this;
        }

        public Criteria andBfTsjbIsNull() {
            addCriterion("BF_TSJB is null");
            return (Criteria) this;
        }

        public Criteria andBfTsjbIsNotNull() {
            addCriterion("BF_TSJB is not null");
            return (Criteria) this;
        }

        public Criteria andBfTsjbEqualTo(String value) {
            addCriterion("BF_TSJB =", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbNotEqualTo(String value) {
            addCriterion("BF_TSJB <>", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbGreaterThan(String value) {
            addCriterion("BF_TSJB >", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbGreaterThanOrEqualTo(String value) {
            addCriterion("BF_TSJB >=", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbLessThan(String value) {
            addCriterion("BF_TSJB <", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbLessThanOrEqualTo(String value) {
            addCriterion("BF_TSJB <=", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbLike(String value) {
            addCriterion("BF_TSJB like", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbNotLike(String value) {
            addCriterion("BF_TSJB not like", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbIn(List<String> values) {
            addCriterion("BF_TSJB in", values, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbNotIn(List<String> values) {
            addCriterion("BF_TSJB not in", values, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbBetween(String value1, String value2) {
            addCriterion("BF_TSJB between", value1, value2, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbNotBetween(String value1, String value2) {
            addCriterion("BF_TSJB not between", value1, value2, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrIsNull() {
            addCriterion("BF_BFHS_NBR is null");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrIsNotNull() {
            addCriterion("BF_BFHS_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrEqualTo(String value) {
            addCriterion("BF_BFHS_NBR =", value, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrNotEqualTo(String value) {
            addCriterion("BF_BFHS_NBR <>", value, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrGreaterThan(String value) {
            addCriterion("BF_BFHS_NBR >", value, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrGreaterThanOrEqualTo(String value) {
            addCriterion("BF_BFHS_NBR >=", value, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrLessThan(String value) {
            addCriterion("BF_BFHS_NBR <", value, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrLessThanOrEqualTo(String value) {
            addCriterion("BF_BFHS_NBR <=", value, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrLike(String value) {
            addCriterion("BF_BFHS_NBR like", value, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrNotLike(String value) {
            addCriterion("BF_BFHS_NBR not like", value, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrIn(List<String> values) {
            addCriterion("BF_BFHS_NBR in", values, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrNotIn(List<String> values) {
            addCriterion("BF_BFHS_NBR not in", values, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrBetween(String value1, String value2) {
            addCriterion("BF_BFHS_NBR between", value1, value2, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNbrNotBetween(String value1, String value2) {
            addCriterion("BF_BFHS_NBR not between", value1, value2, "bfBfhsNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamIsNull() {
            addCriterion("BF_BFHS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamIsNotNull() {
            addCriterion("BF_BFHS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamEqualTo(String value) {
            addCriterion("BF_BFHS_NAM =", value, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamNotEqualTo(String value) {
            addCriterion("BF_BFHS_NAM <>", value, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamGreaterThan(String value) {
            addCriterion("BF_BFHS_NAM >", value, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamGreaterThanOrEqualTo(String value) {
            addCriterion("BF_BFHS_NAM >=", value, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamLessThan(String value) {
            addCriterion("BF_BFHS_NAM <", value, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamLessThanOrEqualTo(String value) {
            addCriterion("BF_BFHS_NAM <=", value, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamLike(String value) {
            addCriterion("BF_BFHS_NAM like", value, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamNotLike(String value) {
            addCriterion("BF_BFHS_NAM not like", value, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamIn(List<String> values) {
            addCriterion("BF_BFHS_NAM in", values, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamNotIn(List<String> values) {
            addCriterion("BF_BFHS_NAM not in", values, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamBetween(String value1, String value2) {
            addCriterion("BF_BFHS_NAM between", value1, value2, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsNamNotBetween(String value1, String value2) {
            addCriterion("BF_BFHS_NAM not between", value1, value2, "bfBfhsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrIsNull() {
            addCriterion("BF_XTHS_NBR is null");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrIsNotNull() {
            addCriterion("BF_XTHS_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrEqualTo(String value) {
            addCriterion("BF_XTHS_NBR =", value, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrNotEqualTo(String value) {
            addCriterion("BF_XTHS_NBR <>", value, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrGreaterThan(String value) {
            addCriterion("BF_XTHS_NBR >", value, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrGreaterThanOrEqualTo(String value) {
            addCriterion("BF_XTHS_NBR >=", value, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrLessThan(String value) {
            addCriterion("BF_XTHS_NBR <", value, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrLessThanOrEqualTo(String value) {
            addCriterion("BF_XTHS_NBR <=", value, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrLike(String value) {
            addCriterion("BF_XTHS_NBR like", value, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrNotLike(String value) {
            addCriterion("BF_XTHS_NBR not like", value, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrIn(List<String> values) {
            addCriterion("BF_XTHS_NBR in", values, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrNotIn(List<String> values) {
            addCriterion("BF_XTHS_NBR not in", values, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrBetween(String value1, String value2) {
            addCriterion("BF_XTHS_NBR between", value1, value2, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNbrNotBetween(String value1, String value2) {
            addCriterion("BF_XTHS_NBR not between", value1, value2, "bfXthsNbr");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamIsNull() {
            addCriterion("BF_XTHS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamIsNotNull() {
            addCriterion("BF_XTHS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamEqualTo(String value) {
            addCriterion("BF_XTHS_NAM =", value, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamNotEqualTo(String value) {
            addCriterion("BF_XTHS_NAM <>", value, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamGreaterThan(String value) {
            addCriterion("BF_XTHS_NAM >", value, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamGreaterThanOrEqualTo(String value) {
            addCriterion("BF_XTHS_NAM >=", value, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamLessThan(String value) {
            addCriterion("BF_XTHS_NAM <", value, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamLessThanOrEqualTo(String value) {
            addCriterion("BF_XTHS_NAM <=", value, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamLike(String value) {
            addCriterion("BF_XTHS_NAM like", value, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamNotLike(String value) {
            addCriterion("BF_XTHS_NAM not like", value, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamIn(List<String> values) {
            addCriterion("BF_XTHS_NAM in", values, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamNotIn(List<String> values) {
            addCriterion("BF_XTHS_NAM not in", values, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamBetween(String value1, String value2) {
            addCriterion("BF_XTHS_NAM between", value1, value2, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfXthsNamNotBetween(String value1, String value2) {
            addCriterion("BF_XTHS_NAM not between", value1, value2, "bfXthsNam");
            return (Criteria) this;
        }

        public Criteria andBfJbDatIsNull() {
            addCriterion("BF_JB_DAT is null");
            return (Criteria) this;
        }

        public Criteria andBfJbDatIsNotNull() {
            addCriterion("BF_JB_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andBfJbDatEqualTo(Date value) {
            addCriterion("BF_JB_DAT =", value, "bfJbDat");
            return (Criteria) this;
        }

        public Criteria andBfJbDatNotEqualTo(Date value) {
            addCriterion("BF_JB_DAT <>", value, "bfJbDat");
            return (Criteria) this;
        }

        public Criteria andBfJbDatGreaterThan(Date value) {
            addCriterion("BF_JB_DAT >", value, "bfJbDat");
            return (Criteria) this;
        }

        public Criteria andBfJbDatGreaterThanOrEqualTo(Date value) {
            addCriterion("BF_JB_DAT >=", value, "bfJbDat");
            return (Criteria) this;
        }

        public Criteria andBfJbDatLessThan(Date value) {
            addCriterion("BF_JB_DAT <", value, "bfJbDat");
            return (Criteria) this;
        }

        public Criteria andBfJbDatLessThanOrEqualTo(Date value) {
            addCriterion("BF_JB_DAT <=", value, "bfJbDat");
            return (Criteria) this;
        }

        public Criteria andBfJbDatIn(List<Date> values) {
            addCriterion("BF_JB_DAT in", values, "bfJbDat");
            return (Criteria) this;
        }

        public Criteria andBfJbDatNotIn(List<Date> values) {
            addCriterion("BF_JB_DAT not in", values, "bfJbDat");
            return (Criteria) this;
        }

        public Criteria andBfJbDatBetween(Date value1, Date value2) {
            addCriterion("BF_JB_DAT between", value1, value2, "bfJbDat");
            return (Criteria) this;
        }

        public Criteria andBfJbDatNotBetween(Date value1, Date value2) {
            addCriterion("BF_JB_DAT not between", value1, value2, "bfJbDat");
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

        public Criteria andCrtNbrIsNull() {
            addCriterion("CRT_NBR is null");
            return (Criteria) this;
        }

        public Criteria andCrtNbrIsNotNull() {
            addCriterion("CRT_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNbrEqualTo(String value) {
            addCriterion("CRT_NBR =", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrNotEqualTo(String value) {
            addCriterion("CRT_NBR <>", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrGreaterThan(String value) {
            addCriterion("CRT_NBR >", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NBR >=", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrLessThan(String value) {
            addCriterion("CRT_NBR <", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrLessThanOrEqualTo(String value) {
            addCriterion("CRT_NBR <=", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrLike(String value) {
            addCriterion("CRT_NBR like", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrNotLike(String value) {
            addCriterion("CRT_NBR not like", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrIn(List<String> values) {
            addCriterion("CRT_NBR in", values, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrNotIn(List<String> values) {
            addCriterion("CRT_NBR not in", values, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrBetween(String value1, String value2) {
            addCriterion("CRT_NBR between", value1, value2, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrNotBetween(String value1, String value2) {
            addCriterion("CRT_NBR not between", value1, value2, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdDatIsNull() {
            addCriterion("UPD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andUpdDatIsNotNull() {
            addCriterion("UPD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdDatEqualTo(Date value) {
            addCriterion("UPD_DAT =", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatNotEqualTo(Date value) {
            addCriterion("UPD_DAT <>", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatGreaterThan(Date value) {
            addCriterion("UPD_DAT >", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPD_DAT >=", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatLessThan(Date value) {
            addCriterion("UPD_DAT <", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatLessThanOrEqualTo(Date value) {
            addCriterion("UPD_DAT <=", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatIn(List<Date> values) {
            addCriterion("UPD_DAT in", values, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatNotIn(List<Date> values) {
            addCriterion("UPD_DAT not in", values, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatBetween(Date value1, Date value2) {
            addCriterion("UPD_DAT between", value1, value2, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatNotBetween(Date value1, Date value2) {
            addCriterion("UPD_DAT not between", value1, value2, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdNbrIsNull() {
            addCriterion("UPD_NBR is null");
            return (Criteria) this;
        }

        public Criteria andUpdNbrIsNotNull() {
            addCriterion("UPD_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andUpdNbrEqualTo(String value) {
            addCriterion("UPD_NBR =", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrNotEqualTo(String value) {
            addCriterion("UPD_NBR <>", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrGreaterThan(String value) {
            addCriterion("UPD_NBR >", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_NBR >=", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrLessThan(String value) {
            addCriterion("UPD_NBR <", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrLessThanOrEqualTo(String value) {
            addCriterion("UPD_NBR <=", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrLike(String value) {
            addCriterion("UPD_NBR like", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrNotLike(String value) {
            addCriterion("UPD_NBR not like", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrIn(List<String> values) {
            addCriterion("UPD_NBR in", values, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrNotIn(List<String> values) {
            addCriterion("UPD_NBR not in", values, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrBetween(String value1, String value2) {
            addCriterion("UPD_NBR between", value1, value2, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrNotBetween(String value1, String value2) {
            addCriterion("UPD_NBR not between", value1, value2, "updNbr");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatIsNull() {
            addCriterion("XYTXJJ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatIsNotNull() {
            addCriterion("XYTXJJ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatEqualTo(Date value) {
            addCriterion("XYTXJJ_DAT =", value, "xytxjjDat");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatNotEqualTo(Date value) {
            addCriterion("XYTXJJ_DAT <>", value, "xytxjjDat");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatGreaterThan(Date value) {
            addCriterion("XYTXJJ_DAT >", value, "xytxjjDat");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatGreaterThanOrEqualTo(Date value) {
            addCriterion("XYTXJJ_DAT >=", value, "xytxjjDat");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatLessThan(Date value) {
            addCriterion("XYTXJJ_DAT <", value, "xytxjjDat");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatLessThanOrEqualTo(Date value) {
            addCriterion("XYTXJJ_DAT <=", value, "xytxjjDat");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatIn(List<Date> values) {
            addCriterion("XYTXJJ_DAT in", values, "xytxjjDat");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatNotIn(List<Date> values) {
            addCriterion("XYTXJJ_DAT not in", values, "xytxjjDat");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatBetween(Date value1, Date value2) {
            addCriterion("XYTXJJ_DAT between", value1, value2, "xytxjjDat");
            return (Criteria) this;
        }

        public Criteria andXytxjjDatNotBetween(Date value1, Date value2) {
            addCriterion("XYTXJJ_DAT not between", value1, value2, "xytxjjDat");
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