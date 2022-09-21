package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspHzzyjjInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspHzzyjjInfExample() {
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

        public Criteria andHzzyjjSeqIsNull() {
            addCriterion("HZZYJJ_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqIsNotNull() {
            addCriterion("HZZYJJ_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqEqualTo(String value) {
            addCriterion("HZZYJJ_SEQ =", value, "hzzyjjSeq");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqNotEqualTo(String value) {
            addCriterion("HZZYJJ_SEQ <>", value, "hzzyjjSeq");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqGreaterThan(String value) {
            addCriterion("HZZYJJ_SEQ >", value, "hzzyjjSeq");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqGreaterThanOrEqualTo(String value) {
            addCriterion("HZZYJJ_SEQ >=", value, "hzzyjjSeq");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqLessThan(String value) {
            addCriterion("HZZYJJ_SEQ <", value, "hzzyjjSeq");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqLessThanOrEqualTo(String value) {
            addCriterion("HZZYJJ_SEQ <=", value, "hzzyjjSeq");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqLike(String value) {
            addCriterion("HZZYJJ_SEQ like", value, "hzzyjjSeq");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqNotLike(String value) {
            addCriterion("HZZYJJ_SEQ not like", value, "hzzyjjSeq");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqIn(List<String> values) {
            addCriterion("HZZYJJ_SEQ in", values, "hzzyjjSeq");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqNotIn(List<String> values) {
            addCriterion("HZZYJJ_SEQ not in", values, "hzzyjjSeq");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqBetween(String value1, String value2) {
            addCriterion("HZZYJJ_SEQ between", value1, value2, "hzzyjjSeq");
            return (Criteria) this;
        }

        public Criteria andHzzyjjSeqNotBetween(String value1, String value2) {
            addCriterion("HZZYJJ_SEQ not between", value1, value2, "hzzyjjSeq");
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

        public Criteria andZyjjCodIsNull() {
            addCriterion("ZYJJ_COD is null");
            return (Criteria) this;
        }

        public Criteria andZyjjCodIsNotNull() {
            addCriterion("ZYJJ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andZyjjCodEqualTo(String value) {
            addCriterion("ZYJJ_COD =", value, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andZyjjCodNotEqualTo(String value) {
            addCriterion("ZYJJ_COD <>", value, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andZyjjCodGreaterThan(String value) {
            addCriterion("ZYJJ_COD >", value, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andZyjjCodGreaterThanOrEqualTo(String value) {
            addCriterion("ZYJJ_COD >=", value, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andZyjjCodLessThan(String value) {
            addCriterion("ZYJJ_COD <", value, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andZyjjCodLessThanOrEqualTo(String value) {
            addCriterion("ZYJJ_COD <=", value, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andZyjjCodLike(String value) {
            addCriterion("ZYJJ_COD like", value, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andZyjjCodNotLike(String value) {
            addCriterion("ZYJJ_COD not like", value, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andZyjjCodIn(List<String> values) {
            addCriterion("ZYJJ_COD in", values, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andZyjjCodNotIn(List<String> values) {
            addCriterion("ZYJJ_COD not in", values, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andZyjjCodBetween(String value1, String value2) {
            addCriterion("ZYJJ_COD between", value1, value2, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andZyjjCodNotBetween(String value1, String value2) {
            addCriterion("ZYJJ_COD not between", value1, value2, "zyjjCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodIsNull() {
            addCriterion("DGLX_COD is null");
            return (Criteria) this;
        }

        public Criteria andDglxCodIsNotNull() {
            addCriterion("DGLX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andDglxCodEqualTo(String value) {
            addCriterion("DGLX_COD =", value, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodNotEqualTo(String value) {
            addCriterion("DGLX_COD <>", value, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodGreaterThan(String value) {
            addCriterion("DGLX_COD >", value, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodGreaterThanOrEqualTo(String value) {
            addCriterion("DGLX_COD >=", value, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodLessThan(String value) {
            addCriterion("DGLX_COD <", value, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodLessThanOrEqualTo(String value) {
            addCriterion("DGLX_COD <=", value, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodLike(String value) {
            addCriterion("DGLX_COD like", value, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodNotLike(String value) {
            addCriterion("DGLX_COD not like", value, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodIn(List<String> values) {
            addCriterion("DGLX_COD in", values, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodNotIn(List<String> values) {
            addCriterion("DGLX_COD not in", values, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodBetween(String value1, String value2) {
            addCriterion("DGLX_COD between", value1, value2, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andDglxCodNotBetween(String value1, String value2) {
            addCriterion("DGLX_COD not between", value1, value2, "dglxCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodIsNull() {
            addCriterion("QGDG_COD is null");
            return (Criteria) this;
        }

        public Criteria andQgdgCodIsNotNull() {
            addCriterion("QGDG_COD is not null");
            return (Criteria) this;
        }

        public Criteria andQgdgCodEqualTo(String value) {
            addCriterion("QGDG_COD =", value, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodNotEqualTo(String value) {
            addCriterion("QGDG_COD <>", value, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodGreaterThan(String value) {
            addCriterion("QGDG_COD >", value, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodGreaterThanOrEqualTo(String value) {
            addCriterion("QGDG_COD >=", value, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodLessThan(String value) {
            addCriterion("QGDG_COD <", value, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodLessThanOrEqualTo(String value) {
            addCriterion("QGDG_COD <=", value, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodLike(String value) {
            addCriterion("QGDG_COD like", value, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodNotLike(String value) {
            addCriterion("QGDG_COD not like", value, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodIn(List<String> values) {
            addCriterion("QGDG_COD in", values, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodNotIn(List<String> values) {
            addCriterion("QGDG_COD not in", values, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodBetween(String value1, String value2) {
            addCriterion("QGDG_COD between", value1, value2, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andQgdgCodNotBetween(String value1, String value2) {
            addCriterion("QGDG_COD not between", value1, value2, "qgdgCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodIsNull() {
            addCriterion("CYMZJC_COD is null");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodIsNotNull() {
            addCriterion("CYMZJC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodEqualTo(String value) {
            addCriterion("CYMZJC_COD =", value, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodNotEqualTo(String value) {
            addCriterion("CYMZJC_COD <>", value, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodGreaterThan(String value) {
            addCriterion("CYMZJC_COD >", value, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodGreaterThanOrEqualTo(String value) {
            addCriterion("CYMZJC_COD >=", value, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodLessThan(String value) {
            addCriterion("CYMZJC_COD <", value, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodLessThanOrEqualTo(String value) {
            addCriterion("CYMZJC_COD <=", value, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodLike(String value) {
            addCriterion("CYMZJC_COD like", value, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodNotLike(String value) {
            addCriterion("CYMZJC_COD not like", value, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodIn(List<String> values) {
            addCriterion("CYMZJC_COD in", values, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodNotIn(List<String> values) {
            addCriterion("CYMZJC_COD not in", values, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodBetween(String value1, String value2) {
            addCriterion("CYMZJC_COD between", value1, value2, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andCymzjcCodNotBetween(String value1, String value2) {
            addCriterion("CYMZJC_COD not between", value1, value2, "cymzjcCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodIsNull() {
            addCriterion("HXQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andHxqCodIsNotNull() {
            addCriterion("HXQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHxqCodEqualTo(String value) {
            addCriterion("HXQ_COD =", value, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodNotEqualTo(String value) {
            addCriterion("HXQ_COD <>", value, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodGreaterThan(String value) {
            addCriterion("HXQ_COD >", value, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodGreaterThanOrEqualTo(String value) {
            addCriterion("HXQ_COD >=", value, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodLessThan(String value) {
            addCriterion("HXQ_COD <", value, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodLessThanOrEqualTo(String value) {
            addCriterion("HXQ_COD <=", value, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodLike(String value) {
            addCriterion("HXQ_COD like", value, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodNotLike(String value) {
            addCriterion("HXQ_COD not like", value, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodIn(List<String> values) {
            addCriterion("HXQ_COD in", values, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodNotIn(List<String> values) {
            addCriterion("HXQ_COD not in", values, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodBetween(String value1, String value2) {
            addCriterion("HXQ_COD between", value1, value2, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andHxqCodNotBetween(String value1, String value2) {
            addCriterion("HXQ_COD not between", value1, value2, "hxqCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodIsNull() {
            addCriterion("JHY_COD is null");
            return (Criteria) this;
        }

        public Criteria andJhyCodIsNotNull() {
            addCriterion("JHY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJhyCodEqualTo(String value) {
            addCriterion("JHY_COD =", value, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodNotEqualTo(String value) {
            addCriterion("JHY_COD <>", value, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodGreaterThan(String value) {
            addCriterion("JHY_COD >", value, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodGreaterThanOrEqualTo(String value) {
            addCriterion("JHY_COD >=", value, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodLessThan(String value) {
            addCriterion("JHY_COD <", value, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodLessThanOrEqualTo(String value) {
            addCriterion("JHY_COD <=", value, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodLike(String value) {
            addCriterion("JHY_COD like", value, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodNotLike(String value) {
            addCriterion("JHY_COD not like", value, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodIn(List<String> values) {
            addCriterion("JHY_COD in", values, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodNotIn(List<String> values) {
            addCriterion("JHY_COD not in", values, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodBetween(String value1, String value2) {
            addCriterion("JHY_COD between", value1, value2, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andJhyCodNotBetween(String value1, String value2) {
            addCriterion("JHY_COD not between", value1, value2, "jhyCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodIsNull() {
            addCriterion("GDTC_COD is null");
            return (Criteria) this;
        }

        public Criteria andGdtcCodIsNotNull() {
            addCriterion("GDTC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGdtcCodEqualTo(String value) {
            addCriterion("GDTC_COD =", value, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodNotEqualTo(String value) {
            addCriterion("GDTC_COD <>", value, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodGreaterThan(String value) {
            addCriterion("GDTC_COD >", value, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodGreaterThanOrEqualTo(String value) {
            addCriterion("GDTC_COD >=", value, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodLessThan(String value) {
            addCriterion("GDTC_COD <", value, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodLessThanOrEqualTo(String value) {
            addCriterion("GDTC_COD <=", value, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodLike(String value) {
            addCriterion("GDTC_COD like", value, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodNotLike(String value) {
            addCriterion("GDTC_COD not like", value, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodIn(List<String> values) {
            addCriterion("GDTC_COD in", values, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodNotIn(List<String> values) {
            addCriterion("GDTC_COD not in", values, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodBetween(String value1, String value2) {
            addCriterion("GDTC_COD between", value1, value2, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andGdtcCodNotBetween(String value1, String value2) {
            addCriterion("GDTC_COD not between", value1, value2, "gdtcCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodIsNull() {
            addCriterion("JGGD_COD is null");
            return (Criteria) this;
        }

        public Criteria andJggdCodIsNotNull() {
            addCriterion("JGGD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJggdCodEqualTo(String value) {
            addCriterion("JGGD_COD =", value, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodNotEqualTo(String value) {
            addCriterion("JGGD_COD <>", value, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodGreaterThan(String value) {
            addCriterion("JGGD_COD >", value, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodGreaterThanOrEqualTo(String value) {
            addCriterion("JGGD_COD >=", value, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodLessThan(String value) {
            addCriterion("JGGD_COD <", value, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodLessThanOrEqualTo(String value) {
            addCriterion("JGGD_COD <=", value, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodLike(String value) {
            addCriterion("JGGD_COD like", value, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodNotLike(String value) {
            addCriterion("JGGD_COD not like", value, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodIn(List<String> values) {
            addCriterion("JGGD_COD in", values, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodNotIn(List<String> values) {
            addCriterion("JGGD_COD not in", values, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodBetween(String value1, String value2) {
            addCriterion("JGGD_COD between", value1, value2, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andJggdCodNotBetween(String value1, String value2) {
            addCriterion("JGGD_COD not between", value1, value2, "jggdCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodIsNull() {
            addCriterion("WBDL_COD is null");
            return (Criteria) this;
        }

        public Criteria andWbdlCodIsNotNull() {
            addCriterion("WBDL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andWbdlCodEqualTo(String value) {
            addCriterion("WBDL_COD =", value, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodNotEqualTo(String value) {
            addCriterion("WBDL_COD <>", value, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodGreaterThan(String value) {
            addCriterion("WBDL_COD >", value, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodGreaterThanOrEqualTo(String value) {
            addCriterion("WBDL_COD >=", value, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodLessThan(String value) {
            addCriterion("WBDL_COD <", value, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodLessThanOrEqualTo(String value) {
            addCriterion("WBDL_COD <=", value, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodLike(String value) {
            addCriterion("WBDL_COD like", value, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodNotLike(String value) {
            addCriterion("WBDL_COD not like", value, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodIn(List<String> values) {
            addCriterion("WBDL_COD in", values, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodNotIn(List<String> values) {
            addCriterion("WBDL_COD not in", values, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodBetween(String value1, String value2) {
            addCriterion("WBDL_COD between", value1, value2, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andWbdlCodNotBetween(String value1, String value2) {
            addCriterion("WBDL_COD not between", value1, value2, "wbdlCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodIsNull() {
            addCriterion("JMSYL_COD is null");
            return (Criteria) this;
        }

        public Criteria andJmsylCodIsNotNull() {
            addCriterion("JMSYL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJmsylCodEqualTo(String value) {
            addCriterion("JMSYL_COD =", value, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodNotEqualTo(String value) {
            addCriterion("JMSYL_COD <>", value, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodGreaterThan(String value) {
            addCriterion("JMSYL_COD >", value, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodGreaterThanOrEqualTo(String value) {
            addCriterion("JMSYL_COD >=", value, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodLessThan(String value) {
            addCriterion("JMSYL_COD <", value, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodLessThanOrEqualTo(String value) {
            addCriterion("JMSYL_COD <=", value, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodLike(String value) {
            addCriterion("JMSYL_COD like", value, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodNotLike(String value) {
            addCriterion("JMSYL_COD not like", value, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodIn(List<String> values) {
            addCriterion("JMSYL_COD in", values, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodNotIn(List<String> values) {
            addCriterion("JMSYL_COD not in", values, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodBetween(String value1, String value2) {
            addCriterion("JMSYL_COD between", value1, value2, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andJmsylCodNotBetween(String value1, String value2) {
            addCriterion("JMSYL_COD not between", value1, value2, "jmsylCod");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesIsNull() {
            addCriterion("WB1_YW_DES is null");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesIsNotNull() {
            addCriterion("WB1_YW_DES is not null");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesEqualTo(String value) {
            addCriterion("WB1_YW_DES =", value, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesNotEqualTo(String value) {
            addCriterion("WB1_YW_DES <>", value, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesGreaterThan(String value) {
            addCriterion("WB1_YW_DES >", value, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesGreaterThanOrEqualTo(String value) {
            addCriterion("WB1_YW_DES >=", value, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesLessThan(String value) {
            addCriterion("WB1_YW_DES <", value, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesLessThanOrEqualTo(String value) {
            addCriterion("WB1_YW_DES <=", value, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesLike(String value) {
            addCriterion("WB1_YW_DES like", value, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesNotLike(String value) {
            addCriterion("WB1_YW_DES not like", value, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesIn(List<String> values) {
            addCriterion("WB1_YW_DES in", values, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesNotIn(List<String> values) {
            addCriterion("WB1_YW_DES not in", values, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesBetween(String value1, String value2) {
            addCriterion("WB1_YW_DES between", value1, value2, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1YwDesNotBetween(String value1, String value2) {
            addCriterion("WB1_YW_DES not between", value1, value2, "wb1YwDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesIsNull() {
            addCriterion("WB1_ZL_DES is null");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesIsNotNull() {
            addCriterion("WB1_ZL_DES is not null");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesEqualTo(Short value) {
            addCriterion("WB1_ZL_DES =", value, "wb1ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesNotEqualTo(Short value) {
            addCriterion("WB1_ZL_DES <>", value, "wb1ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesGreaterThan(Short value) {
            addCriterion("WB1_ZL_DES >", value, "wb1ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesGreaterThanOrEqualTo(Short value) {
            addCriterion("WB1_ZL_DES >=", value, "wb1ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesLessThan(Short value) {
            addCriterion("WB1_ZL_DES <", value, "wb1ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesLessThanOrEqualTo(Short value) {
            addCriterion("WB1_ZL_DES <=", value, "wb1ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesIn(List<Short> values) {
            addCriterion("WB1_ZL_DES in", values, "wb1ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesNotIn(List<Short> values) {
            addCriterion("WB1_ZL_DES not in", values, "wb1ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesBetween(Short value1, Short value2) {
            addCriterion("WB1_ZL_DES between", value1, value2, "wb1ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZlDesNotBetween(Short value1, Short value2) {
            addCriterion("WB1_ZL_DES not between", value1, value2, "wb1ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesIsNull() {
            addCriterion("WB1_ZS_DES is null");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesIsNotNull() {
            addCriterion("WB1_ZS_DES is not null");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesEqualTo(Short value) {
            addCriterion("WB1_ZS_DES =", value, "wb1ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesNotEqualTo(Short value) {
            addCriterion("WB1_ZS_DES <>", value, "wb1ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesGreaterThan(Short value) {
            addCriterion("WB1_ZS_DES >", value, "wb1ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesGreaterThanOrEqualTo(Short value) {
            addCriterion("WB1_ZS_DES >=", value, "wb1ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesLessThan(Short value) {
            addCriterion("WB1_ZS_DES <", value, "wb1ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesLessThanOrEqualTo(Short value) {
            addCriterion("WB1_ZS_DES <=", value, "wb1ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesIn(List<Short> values) {
            addCriterion("WB1_ZS_DES in", values, "wb1ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesNotIn(List<Short> values) {
            addCriterion("WB1_ZS_DES not in", values, "wb1ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesBetween(Short value1, Short value2) {
            addCriterion("WB1_ZS_DES between", value1, value2, "wb1ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb1ZsDesNotBetween(Short value1, Short value2) {
            addCriterion("WB1_ZS_DES not between", value1, value2, "wb1ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesIsNull() {
            addCriterion("WB2_YW_DES is null");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesIsNotNull() {
            addCriterion("WB2_YW_DES is not null");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesEqualTo(String value) {
            addCriterion("WB2_YW_DES =", value, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesNotEqualTo(String value) {
            addCriterion("WB2_YW_DES <>", value, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesGreaterThan(String value) {
            addCriterion("WB2_YW_DES >", value, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesGreaterThanOrEqualTo(String value) {
            addCriterion("WB2_YW_DES >=", value, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesLessThan(String value) {
            addCriterion("WB2_YW_DES <", value, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesLessThanOrEqualTo(String value) {
            addCriterion("WB2_YW_DES <=", value, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesLike(String value) {
            addCriterion("WB2_YW_DES like", value, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesNotLike(String value) {
            addCriterion("WB2_YW_DES not like", value, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesIn(List<String> values) {
            addCriterion("WB2_YW_DES in", values, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesNotIn(List<String> values) {
            addCriterion("WB2_YW_DES not in", values, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesBetween(String value1, String value2) {
            addCriterion("WB2_YW_DES between", value1, value2, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2YwDesNotBetween(String value1, String value2) {
            addCriterion("WB2_YW_DES not between", value1, value2, "wb2YwDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesIsNull() {
            addCriterion("WB2_ZL_DES is null");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesIsNotNull() {
            addCriterion("WB2_ZL_DES is not null");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesEqualTo(Short value) {
            addCriterion("WB2_ZL_DES =", value, "wb2ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesNotEqualTo(Short value) {
            addCriterion("WB2_ZL_DES <>", value, "wb2ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesGreaterThan(Short value) {
            addCriterion("WB2_ZL_DES >", value, "wb2ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesGreaterThanOrEqualTo(Short value) {
            addCriterion("WB2_ZL_DES >=", value, "wb2ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesLessThan(Short value) {
            addCriterion("WB2_ZL_DES <", value, "wb2ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesLessThanOrEqualTo(Short value) {
            addCriterion("WB2_ZL_DES <=", value, "wb2ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesIn(List<Short> values) {
            addCriterion("WB2_ZL_DES in", values, "wb2ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesNotIn(List<Short> values) {
            addCriterion("WB2_ZL_DES not in", values, "wb2ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesBetween(Short value1, Short value2) {
            addCriterion("WB2_ZL_DES between", value1, value2, "wb2ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZlDesNotBetween(Short value1, Short value2) {
            addCriterion("WB2_ZL_DES not between", value1, value2, "wb2ZlDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesIsNull() {
            addCriterion("WB2_ZS_DES is null");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesIsNotNull() {
            addCriterion("WB2_ZS_DES is not null");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesEqualTo(Short value) {
            addCriterion("WB2_ZS_DES =", value, "wb2ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesNotEqualTo(Short value) {
            addCriterion("WB2_ZS_DES <>", value, "wb2ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesGreaterThan(Short value) {
            addCriterion("WB2_ZS_DES >", value, "wb2ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesGreaterThanOrEqualTo(Short value) {
            addCriterion("WB2_ZS_DES >=", value, "wb2ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesLessThan(Short value) {
            addCriterion("WB2_ZS_DES <", value, "wb2ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesLessThanOrEqualTo(Short value) {
            addCriterion("WB2_ZS_DES <=", value, "wb2ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesIn(List<Short> values) {
            addCriterion("WB2_ZS_DES in", values, "wb2ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesNotIn(List<Short> values) {
            addCriterion("WB2_ZS_DES not in", values, "wb2ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesBetween(Short value1, Short value2) {
            addCriterion("WB2_ZS_DES between", value1, value2, "wb2ZsDes");
            return (Criteria) this;
        }

        public Criteria andWb2ZsDesNotBetween(Short value1, Short value2) {
            addCriterion("WB2_ZS_DES not between", value1, value2, "wb2ZsDes");
            return (Criteria) this;
        }

        public Criteria andYwzsCodIsNull() {
            addCriterion("YWZS_COD is null");
            return (Criteria) this;
        }

        public Criteria andYwzsCodIsNotNull() {
            addCriterion("YWZS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andYwzsCodEqualTo(String value) {
            addCriterion("YWZS_COD =", value, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andYwzsCodNotEqualTo(String value) {
            addCriterion("YWZS_COD <>", value, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andYwzsCodGreaterThan(String value) {
            addCriterion("YWZS_COD >", value, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andYwzsCodGreaterThanOrEqualTo(String value) {
            addCriterion("YWZS_COD >=", value, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andYwzsCodLessThan(String value) {
            addCriterion("YWZS_COD <", value, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andYwzsCodLessThanOrEqualTo(String value) {
            addCriterion("YWZS_COD <=", value, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andYwzsCodLike(String value) {
            addCriterion("YWZS_COD like", value, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andYwzsCodNotLike(String value) {
            addCriterion("YWZS_COD not like", value, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andYwzsCodIn(List<String> values) {
            addCriterion("YWZS_COD in", values, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andYwzsCodNotIn(List<String> values) {
            addCriterion("YWZS_COD not in", values, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andYwzsCodBetween(String value1, String value2) {
            addCriterion("YWZS_COD between", value1, value2, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andYwzsCodNotBetween(String value1, String value2) {
            addCriterion("YWZS_COD not between", value1, value2, "ywzsCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodIsNull() {
            addCriterion("CLGN_COD is null");
            return (Criteria) this;
        }

        public Criteria andClgnCodIsNotNull() {
            addCriterion("CLGN_COD is not null");
            return (Criteria) this;
        }

        public Criteria andClgnCodEqualTo(String value) {
            addCriterion("CLGN_COD =", value, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodNotEqualTo(String value) {
            addCriterion("CLGN_COD <>", value, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodGreaterThan(String value) {
            addCriterion("CLGN_COD >", value, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodGreaterThanOrEqualTo(String value) {
            addCriterion("CLGN_COD >=", value, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodLessThan(String value) {
            addCriterion("CLGN_COD <", value, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodLessThanOrEqualTo(String value) {
            addCriterion("CLGN_COD <=", value, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodLike(String value) {
            addCriterion("CLGN_COD like", value, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodNotLike(String value) {
            addCriterion("CLGN_COD not like", value, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodIn(List<String> values) {
            addCriterion("CLGN_COD in", values, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodNotIn(List<String> values) {
            addCriterion("CLGN_COD not in", values, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodBetween(String value1, String value2) {
            addCriterion("CLGN_COD between", value1, value2, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andClgnCodNotBetween(String value1, String value2) {
            addCriterion("CLGN_COD not between", value1, value2, "clgnCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodIsNull() {
            addCriterion("YLWJ_COD is null");
            return (Criteria) this;
        }

        public Criteria andYlwjCodIsNotNull() {
            addCriterion("YLWJ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andYlwjCodEqualTo(String value) {
            addCriterion("YLWJ_COD =", value, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodNotEqualTo(String value) {
            addCriterion("YLWJ_COD <>", value, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodGreaterThan(String value) {
            addCriterion("YLWJ_COD >", value, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodGreaterThanOrEqualTo(String value) {
            addCriterion("YLWJ_COD >=", value, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodLessThan(String value) {
            addCriterion("YLWJ_COD <", value, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodLessThanOrEqualTo(String value) {
            addCriterion("YLWJ_COD <=", value, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodLike(String value) {
            addCriterion("YLWJ_COD like", value, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodNotLike(String value) {
            addCriterion("YLWJ_COD not like", value, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodIn(List<String> values) {
            addCriterion("YLWJ_COD in", values, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodNotIn(List<String> values) {
            addCriterion("YLWJ_COD not in", values, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodBetween(String value1, String value2) {
            addCriterion("YLWJ_COD between", value1, value2, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjCodNotBetween(String value1, String value2) {
            addCriterion("YLWJ_COD not between", value1, value2, "ylwjCod");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesIsNull() {
            addCriterion("YLWJ_QT_DES is null");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesIsNotNull() {
            addCriterion("YLWJ_QT_DES is not null");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesEqualTo(String value) {
            addCriterion("YLWJ_QT_DES =", value, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesNotEqualTo(String value) {
            addCriterion("YLWJ_QT_DES <>", value, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesGreaterThan(String value) {
            addCriterion("YLWJ_QT_DES >", value, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesGreaterThanOrEqualTo(String value) {
            addCriterion("YLWJ_QT_DES >=", value, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesLessThan(String value) {
            addCriterion("YLWJ_QT_DES <", value, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesLessThanOrEqualTo(String value) {
            addCriterion("YLWJ_QT_DES <=", value, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesLike(String value) {
            addCriterion("YLWJ_QT_DES like", value, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesNotLike(String value) {
            addCriterion("YLWJ_QT_DES not like", value, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesIn(List<String> values) {
            addCriterion("YLWJ_QT_DES in", values, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesNotIn(List<String> values) {
            addCriterion("YLWJ_QT_DES not in", values, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesBetween(String value1, String value2) {
            addCriterion("YLWJ_QT_DES between", value1, value2, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjQtDesNotBetween(String value1, String value2) {
            addCriterion("YLWJ_QT_DES not between", value1, value2, "ylwjQtDes");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgIsNull() {
            addCriterion("YLWJ_FLG is null");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgIsNotNull() {
            addCriterion("YLWJ_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgEqualTo(String value) {
            addCriterion("YLWJ_FLG =", value, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgNotEqualTo(String value) {
            addCriterion("YLWJ_FLG <>", value, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgGreaterThan(String value) {
            addCriterion("YLWJ_FLG >", value, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgGreaterThanOrEqualTo(String value) {
            addCriterion("YLWJ_FLG >=", value, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgLessThan(String value) {
            addCriterion("YLWJ_FLG <", value, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgLessThanOrEqualTo(String value) {
            addCriterion("YLWJ_FLG <=", value, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgLike(String value) {
            addCriterion("YLWJ_FLG like", value, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgNotLike(String value) {
            addCriterion("YLWJ_FLG not like", value, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgIn(List<String> values) {
            addCriterion("YLWJ_FLG in", values, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgNotIn(List<String> values) {
            addCriterion("YLWJ_FLG not in", values, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgBetween(String value1, String value2) {
            addCriterion("YLWJ_FLG between", value1, value2, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andYlwjFlgNotBetween(String value1, String value2) {
            addCriterion("YLWJ_FLG not between", value1, value2, "ylwjFlg");
            return (Criteria) this;
        }

        public Criteria andPtryCodIsNull() {
            addCriterion("PTRY_COD is null");
            return (Criteria) this;
        }

        public Criteria andPtryCodIsNotNull() {
            addCriterion("PTRY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPtryCodEqualTo(String value) {
            addCriterion("PTRY_COD =", value, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryCodNotEqualTo(String value) {
            addCriterion("PTRY_COD <>", value, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryCodGreaterThan(String value) {
            addCriterion("PTRY_COD >", value, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryCodGreaterThanOrEqualTo(String value) {
            addCriterion("PTRY_COD >=", value, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryCodLessThan(String value) {
            addCriterion("PTRY_COD <", value, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryCodLessThanOrEqualTo(String value) {
            addCriterion("PTRY_COD <=", value, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryCodLike(String value) {
            addCriterion("PTRY_COD like", value, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryCodNotLike(String value) {
            addCriterion("PTRY_COD not like", value, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryCodIn(List<String> values) {
            addCriterion("PTRY_COD in", values, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryCodNotIn(List<String> values) {
            addCriterion("PTRY_COD not in", values, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryCodBetween(String value1, String value2) {
            addCriterion("PTRY_COD between", value1, value2, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryCodNotBetween(String value1, String value2) {
            addCriterion("PTRY_COD not between", value1, value2, "ptryCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodIsNull() {
            addCriterion("PTRY_QR_COD is null");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodIsNotNull() {
            addCriterion("PTRY_QR_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodEqualTo(String value) {
            addCriterion("PTRY_QR_COD =", value, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodNotEqualTo(String value) {
            addCriterion("PTRY_QR_COD <>", value, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodGreaterThan(String value) {
            addCriterion("PTRY_QR_COD >", value, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodGreaterThanOrEqualTo(String value) {
            addCriterion("PTRY_QR_COD >=", value, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodLessThan(String value) {
            addCriterion("PTRY_QR_COD <", value, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodLessThanOrEqualTo(String value) {
            addCriterion("PTRY_QR_COD <=", value, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodLike(String value) {
            addCriterion("PTRY_QR_COD like", value, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodNotLike(String value) {
            addCriterion("PTRY_QR_COD not like", value, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodIn(List<String> values) {
            addCriterion("PTRY_QR_COD in", values, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodNotIn(List<String> values) {
            addCriterion("PTRY_QR_COD not in", values, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodBetween(String value1, String value2) {
            addCriterion("PTRY_QR_COD between", value1, value2, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andPtryQrCodNotBetween(String value1, String value2) {
            addCriterion("PTRY_QR_COD not between", value1, value2, "ptryQrCod");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrIsNull() {
            addCriterion("SRJCSH1_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrIsNotNull() {
            addCriterion("SRJCSH1_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrEqualTo(String value) {
            addCriterion("SRJCSH1_NBR =", value, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrNotEqualTo(String value) {
            addCriterion("SRJCSH1_NBR <>", value, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrGreaterThan(String value) {
            addCriterion("SRJCSH1_NBR >", value, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrGreaterThanOrEqualTo(String value) {
            addCriterion("SRJCSH1_NBR >=", value, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrLessThan(String value) {
            addCriterion("SRJCSH1_NBR <", value, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrLessThanOrEqualTo(String value) {
            addCriterion("SRJCSH1_NBR <=", value, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrLike(String value) {
            addCriterion("SRJCSH1_NBR like", value, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrNotLike(String value) {
            addCriterion("SRJCSH1_NBR not like", value, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrIn(List<String> values) {
            addCriterion("SRJCSH1_NBR in", values, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrNotIn(List<String> values) {
            addCriterion("SRJCSH1_NBR not in", values, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrBetween(String value1, String value2) {
            addCriterion("SRJCSH1_NBR between", value1, value2, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NbrNotBetween(String value1, String value2) {
            addCriterion("SRJCSH1_NBR not between", value1, value2, "srjcsh1Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamIsNull() {
            addCriterion("SRJCSH1_NAM is null");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamIsNotNull() {
            addCriterion("SRJCSH1_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamEqualTo(String value) {
            addCriterion("SRJCSH1_NAM =", value, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamNotEqualTo(String value) {
            addCriterion("SRJCSH1_NAM <>", value, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamGreaterThan(String value) {
            addCriterion("SRJCSH1_NAM >", value, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamGreaterThanOrEqualTo(String value) {
            addCriterion("SRJCSH1_NAM >=", value, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamLessThan(String value) {
            addCriterion("SRJCSH1_NAM <", value, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamLessThanOrEqualTo(String value) {
            addCriterion("SRJCSH1_NAM <=", value, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamLike(String value) {
            addCriterion("SRJCSH1_NAM like", value, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamNotLike(String value) {
            addCriterion("SRJCSH1_NAM not like", value, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamIn(List<String> values) {
            addCriterion("SRJCSH1_NAM in", values, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamNotIn(List<String> values) {
            addCriterion("SRJCSH1_NAM not in", values, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamBetween(String value1, String value2) {
            addCriterion("SRJCSH1_NAM between", value1, value2, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh1NamNotBetween(String value1, String value2) {
            addCriterion("SRJCSH1_NAM not between", value1, value2, "srjcsh1Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrIsNull() {
            addCriterion("SRJCSH2_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrIsNotNull() {
            addCriterion("SRJCSH2_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrEqualTo(String value) {
            addCriterion("SRJCSH2_NBR =", value, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrNotEqualTo(String value) {
            addCriterion("SRJCSH2_NBR <>", value, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrGreaterThan(String value) {
            addCriterion("SRJCSH2_NBR >", value, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrGreaterThanOrEqualTo(String value) {
            addCriterion("SRJCSH2_NBR >=", value, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrLessThan(String value) {
            addCriterion("SRJCSH2_NBR <", value, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrLessThanOrEqualTo(String value) {
            addCriterion("SRJCSH2_NBR <=", value, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrLike(String value) {
            addCriterion("SRJCSH2_NBR like", value, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrNotLike(String value) {
            addCriterion("SRJCSH2_NBR not like", value, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrIn(List<String> values) {
            addCriterion("SRJCSH2_NBR in", values, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrNotIn(List<String> values) {
            addCriterion("SRJCSH2_NBR not in", values, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrBetween(String value1, String value2) {
            addCriterion("SRJCSH2_NBR between", value1, value2, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NbrNotBetween(String value1, String value2) {
            addCriterion("SRJCSH2_NBR not between", value1, value2, "srjcsh2Nbr");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamIsNull() {
            addCriterion("SRJCSH2_NAM is null");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamIsNotNull() {
            addCriterion("SRJCSH2_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamEqualTo(String value) {
            addCriterion("SRJCSH2_NAM =", value, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamNotEqualTo(String value) {
            addCriterion("SRJCSH2_NAM <>", value, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamGreaterThan(String value) {
            addCriterion("SRJCSH2_NAM >", value, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamGreaterThanOrEqualTo(String value) {
            addCriterion("SRJCSH2_NAM >=", value, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamLessThan(String value) {
            addCriterion("SRJCSH2_NAM <", value, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamLessThanOrEqualTo(String value) {
            addCriterion("SRJCSH2_NAM <=", value, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamLike(String value) {
            addCriterion("SRJCSH2_NAM like", value, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamNotLike(String value) {
            addCriterion("SRJCSH2_NAM not like", value, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamIn(List<String> values) {
            addCriterion("SRJCSH2_NAM in", values, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamNotIn(List<String> values) {
            addCriterion("SRJCSH2_NAM not in", values, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamBetween(String value1, String value2) {
            addCriterion("SRJCSH2_NAM between", value1, value2, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcsh2NamNotBetween(String value1, String value2) {
            addCriterion("SRJCSH2_NAM not between", value1, value2, "srjcsh2Nam");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodIsNull() {
            addCriterion("SRJCSH_COD is null");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodIsNotNull() {
            addCriterion("SRJCSH_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodEqualTo(String value) {
            addCriterion("SRJCSH_COD =", value, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodNotEqualTo(String value) {
            addCriterion("SRJCSH_COD <>", value, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodGreaterThan(String value) {
            addCriterion("SRJCSH_COD >", value, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodGreaterThanOrEqualTo(String value) {
            addCriterion("SRJCSH_COD >=", value, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodLessThan(String value) {
            addCriterion("SRJCSH_COD <", value, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodLessThanOrEqualTo(String value) {
            addCriterion("SRJCSH_COD <=", value, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodLike(String value) {
            addCriterion("SRJCSH_COD like", value, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodNotLike(String value) {
            addCriterion("SRJCSH_COD not like", value, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodIn(List<String> values) {
            addCriterion("SRJCSH_COD in", values, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodNotIn(List<String> values) {
            addCriterion("SRJCSH_COD not in", values, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodBetween(String value1, String value2) {
            addCriterion("SRJCSH_COD between", value1, value2, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andSrjcshCodNotBetween(String value1, String value2) {
            addCriterion("SRJCSH_COD not between", value1, value2, "srjcshCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodIsNull() {
            addCriterion("ZYPBL_COD is null");
            return (Criteria) this;
        }

        public Criteria andZypblCodIsNotNull() {
            addCriterion("ZYPBL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andZypblCodEqualTo(String value) {
            addCriterion("ZYPBL_COD =", value, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodNotEqualTo(String value) {
            addCriterion("ZYPBL_COD <>", value, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodGreaterThan(String value) {
            addCriterion("ZYPBL_COD >", value, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodGreaterThanOrEqualTo(String value) {
            addCriterion("ZYPBL_COD >=", value, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodLessThan(String value) {
            addCriterion("ZYPBL_COD <", value, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodLessThanOrEqualTo(String value) {
            addCriterion("ZYPBL_COD <=", value, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodLike(String value) {
            addCriterion("ZYPBL_COD like", value, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodNotLike(String value) {
            addCriterion("ZYPBL_COD not like", value, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodIn(List<String> values) {
            addCriterion("ZYPBL_COD in", values, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodNotIn(List<String> values) {
            addCriterion("ZYPBL_COD not in", values, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodBetween(String value1, String value2) {
            addCriterion("ZYPBL_COD between", value1, value2, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblCodNotBetween(String value1, String value2) {
            addCriterion("ZYPBL_COD not between", value1, value2, "zypblCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodIsNull() {
            addCriterion("ZYPBL_DES_COD is null");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodIsNotNull() {
            addCriterion("ZYPBL_DES_COD is not null");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodEqualTo(String value) {
            addCriterion("ZYPBL_DES_COD =", value, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodNotEqualTo(String value) {
            addCriterion("ZYPBL_DES_COD <>", value, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodGreaterThan(String value) {
            addCriterion("ZYPBL_DES_COD >", value, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodGreaterThanOrEqualTo(String value) {
            addCriterion("ZYPBL_DES_COD >=", value, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodLessThan(String value) {
            addCriterion("ZYPBL_DES_COD <", value, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodLessThanOrEqualTo(String value) {
            addCriterion("ZYPBL_DES_COD <=", value, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodLike(String value) {
            addCriterion("ZYPBL_DES_COD like", value, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodNotLike(String value) {
            addCriterion("ZYPBL_DES_COD not like", value, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodIn(List<String> values) {
            addCriterion("ZYPBL_DES_COD in", values, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodNotIn(List<String> values) {
            addCriterion("ZYPBL_DES_COD not in", values, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodBetween(String value1, String value2) {
            addCriterion("ZYPBL_DES_COD between", value1, value2, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andZypblDesCodNotBetween(String value1, String value2) {
            addCriterion("ZYPBL_DES_COD not between", value1, value2, "zypblDesCod");
            return (Criteria) this;
        }

        public Criteria andSmtzTwIsNull() {
            addCriterion("SMTZ_TW is null");
            return (Criteria) this;
        }

        public Criteria andSmtzTwIsNotNull() {
            addCriterion("SMTZ_TW is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzTwEqualTo(BigDecimal value) {
            addCriterion("SMTZ_TW =", value, "smtzTw");
            return (Criteria) this;
        }

        public Criteria andSmtzTwNotEqualTo(BigDecimal value) {
            addCriterion("SMTZ_TW <>", value, "smtzTw");
            return (Criteria) this;
        }

        public Criteria andSmtzTwGreaterThan(BigDecimal value) {
            addCriterion("SMTZ_TW >", value, "smtzTw");
            return (Criteria) this;
        }

        public Criteria andSmtzTwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SMTZ_TW >=", value, "smtzTw");
            return (Criteria) this;
        }

        public Criteria andSmtzTwLessThan(BigDecimal value) {
            addCriterion("SMTZ_TW <", value, "smtzTw");
            return (Criteria) this;
        }

        public Criteria andSmtzTwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SMTZ_TW <=", value, "smtzTw");
            return (Criteria) this;
        }

        public Criteria andSmtzTwIn(List<BigDecimal> values) {
            addCriterion("SMTZ_TW in", values, "smtzTw");
            return (Criteria) this;
        }

        public Criteria andSmtzTwNotIn(List<BigDecimal> values) {
            addCriterion("SMTZ_TW not in", values, "smtzTw");
            return (Criteria) this;
        }

        public Criteria andSmtzTwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMTZ_TW between", value1, value2, "smtzTw");
            return (Criteria) this;
        }

        public Criteria andSmtzTwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMTZ_TW not between", value1, value2, "smtzTw");
            return (Criteria) this;
        }

        public Criteria andSmtzHrIsNull() {
            addCriterion("SMTZ_HR is null");
            return (Criteria) this;
        }

        public Criteria andSmtzHrIsNotNull() {
            addCriterion("SMTZ_HR is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzHrEqualTo(Short value) {
            addCriterion("SMTZ_HR =", value, "smtzHr");
            return (Criteria) this;
        }

        public Criteria andSmtzHrNotEqualTo(Short value) {
            addCriterion("SMTZ_HR <>", value, "smtzHr");
            return (Criteria) this;
        }

        public Criteria andSmtzHrGreaterThan(Short value) {
            addCriterion("SMTZ_HR >", value, "smtzHr");
            return (Criteria) this;
        }

        public Criteria andSmtzHrGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_HR >=", value, "smtzHr");
            return (Criteria) this;
        }

        public Criteria andSmtzHrLessThan(Short value) {
            addCriterion("SMTZ_HR <", value, "smtzHr");
            return (Criteria) this;
        }

        public Criteria andSmtzHrLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_HR <=", value, "smtzHr");
            return (Criteria) this;
        }

        public Criteria andSmtzHrIn(List<Short> values) {
            addCriterion("SMTZ_HR in", values, "smtzHr");
            return (Criteria) this;
        }

        public Criteria andSmtzHrNotIn(List<Short> values) {
            addCriterion("SMTZ_HR not in", values, "smtzHr");
            return (Criteria) this;
        }

        public Criteria andSmtzHrBetween(Short value1, Short value2) {
            addCriterion("SMTZ_HR between", value1, value2, "smtzHr");
            return (Criteria) this;
        }

        public Criteria andSmtzHrNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_HR not between", value1, value2, "smtzHr");
            return (Criteria) this;
        }

        public Criteria andSmtzHxIsNull() {
            addCriterion("SMTZ_HX is null");
            return (Criteria) this;
        }

        public Criteria andSmtzHxIsNotNull() {
            addCriterion("SMTZ_HX is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzHxEqualTo(Short value) {
            addCriterion("SMTZ_HX =", value, "smtzHx");
            return (Criteria) this;
        }

        public Criteria andSmtzHxNotEqualTo(Short value) {
            addCriterion("SMTZ_HX <>", value, "smtzHx");
            return (Criteria) this;
        }

        public Criteria andSmtzHxGreaterThan(Short value) {
            addCriterion("SMTZ_HX >", value, "smtzHx");
            return (Criteria) this;
        }

        public Criteria andSmtzHxGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_HX >=", value, "smtzHx");
            return (Criteria) this;
        }

        public Criteria andSmtzHxLessThan(Short value) {
            addCriterion("SMTZ_HX <", value, "smtzHx");
            return (Criteria) this;
        }

        public Criteria andSmtzHxLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_HX <=", value, "smtzHx");
            return (Criteria) this;
        }

        public Criteria andSmtzHxIn(List<Short> values) {
            addCriterion("SMTZ_HX in", values, "smtzHx");
            return (Criteria) this;
        }

        public Criteria andSmtzHxNotIn(List<Short> values) {
            addCriterion("SMTZ_HX not in", values, "smtzHx");
            return (Criteria) this;
        }

        public Criteria andSmtzHxBetween(Short value1, Short value2) {
            addCriterion("SMTZ_HX between", value1, value2, "smtzHx");
            return (Criteria) this;
        }

        public Criteria andSmtzHxNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_HX not between", value1, value2, "smtzHx");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpIsNull() {
            addCriterion("SMTZ_BP_UP is null");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpIsNotNull() {
            addCriterion("SMTZ_BP_UP is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpEqualTo(Short value) {
            addCriterion("SMTZ_BP_UP =", value, "smtzBpUp");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpNotEqualTo(Short value) {
            addCriterion("SMTZ_BP_UP <>", value, "smtzBpUp");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpGreaterThan(Short value) {
            addCriterion("SMTZ_BP_UP >", value, "smtzBpUp");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_BP_UP >=", value, "smtzBpUp");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpLessThan(Short value) {
            addCriterion("SMTZ_BP_UP <", value, "smtzBpUp");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_BP_UP <=", value, "smtzBpUp");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpIn(List<Short> values) {
            addCriterion("SMTZ_BP_UP in", values, "smtzBpUp");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpNotIn(List<Short> values) {
            addCriterion("SMTZ_BP_UP not in", values, "smtzBpUp");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpBetween(Short value1, Short value2) {
            addCriterion("SMTZ_BP_UP between", value1, value2, "smtzBpUp");
            return (Criteria) this;
        }

        public Criteria andSmtzBpUpNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_BP_UP not between", value1, value2, "smtzBpUp");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownIsNull() {
            addCriterion("SMTZ_BP_DOWN is null");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownIsNotNull() {
            addCriterion("SMTZ_BP_DOWN is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownEqualTo(Short value) {
            addCriterion("SMTZ_BP_DOWN =", value, "smtzBpDown");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownNotEqualTo(Short value) {
            addCriterion("SMTZ_BP_DOWN <>", value, "smtzBpDown");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownGreaterThan(Short value) {
            addCriterion("SMTZ_BP_DOWN >", value, "smtzBpDown");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_BP_DOWN >=", value, "smtzBpDown");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownLessThan(Short value) {
            addCriterion("SMTZ_BP_DOWN <", value, "smtzBpDown");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_BP_DOWN <=", value, "smtzBpDown");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownIn(List<Short> values) {
            addCriterion("SMTZ_BP_DOWN in", values, "smtzBpDown");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownNotIn(List<Short> values) {
            addCriterion("SMTZ_BP_DOWN not in", values, "smtzBpDown");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownBetween(Short value1, Short value2) {
            addCriterion("SMTZ_BP_DOWN between", value1, value2, "smtzBpDown");
            return (Criteria) this;
        }

        public Criteria andSmtzBpDownNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_BP_DOWN not between", value1, value2, "smtzBpDown");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2IsNull() {
            addCriterion("SMTZ_SPO2 is null");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2IsNotNull() {
            addCriterion("SMTZ_SPO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2EqualTo(Short value) {
            addCriterion("SMTZ_SPO2 =", value, "smtzSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2NotEqualTo(Short value) {
            addCriterion("SMTZ_SPO2 <>", value, "smtzSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2GreaterThan(Short value) {
            addCriterion("SMTZ_SPO2 >", value, "smtzSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2GreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SPO2 >=", value, "smtzSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2LessThan(Short value) {
            addCriterion("SMTZ_SPO2 <", value, "smtzSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2LessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SPO2 <=", value, "smtzSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2In(List<Short> values) {
            addCriterion("SMTZ_SPO2 in", values, "smtzSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2NotIn(List<Short> values) {
            addCriterion("SMTZ_SPO2 not in", values, "smtzSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2Between(Short value1, Short value2) {
            addCriterion("SMTZ_SPO2 between", value1, value2, "smtzSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSpo2NotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_SPO2 not between", value1, value2, "smtzSpo2");
            return (Criteria) this;
        }

        public Criteria andYsztCodIsNull() {
            addCriterion("YSZT_COD is null");
            return (Criteria) this;
        }

        public Criteria andYsztCodIsNotNull() {
            addCriterion("YSZT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andYsztCodEqualTo(String value) {
            addCriterion("YSZT_COD =", value, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andYsztCodNotEqualTo(String value) {
            addCriterion("YSZT_COD <>", value, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andYsztCodGreaterThan(String value) {
            addCriterion("YSZT_COD >", value, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andYsztCodGreaterThanOrEqualTo(String value) {
            addCriterion("YSZT_COD >=", value, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andYsztCodLessThan(String value) {
            addCriterion("YSZT_COD <", value, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andYsztCodLessThanOrEqualTo(String value) {
            addCriterion("YSZT_COD <=", value, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andYsztCodLike(String value) {
            addCriterion("YSZT_COD like", value, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andYsztCodNotLike(String value) {
            addCriterion("YSZT_COD not like", value, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andYsztCodIn(List<String> values) {
            addCriterion("YSZT_COD in", values, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andYsztCodNotIn(List<String> values) {
            addCriterion("YSZT_COD not in", values, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andYsztCodBetween(String value1, String value2) {
            addCriterion("YSZT_COD between", value1, value2, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andYsztCodNotBetween(String value1, String value2) {
            addCriterion("YSZT_COD not between", value1, value2, "ysztCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenIsNull() {
            addCriterion("TK_LEFT_LEN is null");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenIsNotNull() {
            addCriterion("TK_LEFT_LEN is not null");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenEqualTo(String value) {
            addCriterion("TK_LEFT_LEN =", value, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenNotEqualTo(String value) {
            addCriterion("TK_LEFT_LEN <>", value, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenGreaterThan(String value) {
            addCriterion("TK_LEFT_LEN >", value, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenGreaterThanOrEqualTo(String value) {
            addCriterion("TK_LEFT_LEN >=", value, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenLessThan(String value) {
            addCriterion("TK_LEFT_LEN <", value, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenLessThanOrEqualTo(String value) {
            addCriterion("TK_LEFT_LEN <=", value, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenLike(String value) {
            addCriterion("TK_LEFT_LEN like", value, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenNotLike(String value) {
            addCriterion("TK_LEFT_LEN not like", value, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenIn(List<String> values) {
            addCriterion("TK_LEFT_LEN in", values, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenNotIn(List<String> values) {
            addCriterion("TK_LEFT_LEN not in", values, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenBetween(String value1, String value2) {
            addCriterion("TK_LEFT_LEN between", value1, value2, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkLeftLenNotBetween(String value1, String value2) {
            addCriterion("TK_LEFT_LEN not between", value1, value2, "tkLeftLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenIsNull() {
            addCriterion("TK_RIGHT_LEN is null");
            return (Criteria) this;
        }

        public Criteria andTkRightLenIsNotNull() {
            addCriterion("TK_RIGHT_LEN is not null");
            return (Criteria) this;
        }

        public Criteria andTkRightLenEqualTo(String value) {
            addCriterion("TK_RIGHT_LEN =", value, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenNotEqualTo(String value) {
            addCriterion("TK_RIGHT_LEN <>", value, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenGreaterThan(String value) {
            addCriterion("TK_RIGHT_LEN >", value, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenGreaterThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT_LEN >=", value, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenLessThan(String value) {
            addCriterion("TK_RIGHT_LEN <", value, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenLessThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT_LEN <=", value, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenLike(String value) {
            addCriterion("TK_RIGHT_LEN like", value, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenNotLike(String value) {
            addCriterion("TK_RIGHT_LEN not like", value, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenIn(List<String> values) {
            addCriterion("TK_RIGHT_LEN in", values, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenNotIn(List<String> values) {
            addCriterion("TK_RIGHT_LEN not in", values, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenBetween(String value1, String value2) {
            addCriterion("TK_RIGHT_LEN between", value1, value2, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkRightLenNotBetween(String value1, String value2) {
            addCriterion("TK_RIGHT_LEN not between", value1, value2, "tkRightLen");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodIsNull() {
            addCriterion("TK_DGFY_COD is null");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodIsNotNull() {
            addCriterion("TK_DGFY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodEqualTo(String value) {
            addCriterion("TK_DGFY_COD =", value, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodNotEqualTo(String value) {
            addCriterion("TK_DGFY_COD <>", value, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodGreaterThan(String value) {
            addCriterion("TK_DGFY_COD >", value, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodGreaterThanOrEqualTo(String value) {
            addCriterion("TK_DGFY_COD >=", value, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodLessThan(String value) {
            addCriterion("TK_DGFY_COD <", value, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodLessThanOrEqualTo(String value) {
            addCriterion("TK_DGFY_COD <=", value, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodLike(String value) {
            addCriterion("TK_DGFY_COD like", value, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodNotLike(String value) {
            addCriterion("TK_DGFY_COD not like", value, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodIn(List<String> values) {
            addCriterion("TK_DGFY_COD in", values, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodNotIn(List<String> values) {
            addCriterion("TK_DGFY_COD not in", values, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodBetween(String value1, String value2) {
            addCriterion("TK_DGFY_COD between", value1, value2, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andTkDgfyCodNotBetween(String value1, String value2) {
            addCriterion("TK_DGFY_COD not between", value1, value2, "tkDgfyCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodIsNull() {
            addCriterion("PFQK_COD is null");
            return (Criteria) this;
        }

        public Criteria andPfqkCodIsNotNull() {
            addCriterion("PFQK_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPfqkCodEqualTo(String value) {
            addCriterion("PFQK_COD =", value, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodNotEqualTo(String value) {
            addCriterion("PFQK_COD <>", value, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodGreaterThan(String value) {
            addCriterion("PFQK_COD >", value, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodGreaterThanOrEqualTo(String value) {
            addCriterion("PFQK_COD >=", value, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodLessThan(String value) {
            addCriterion("PFQK_COD <", value, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodLessThanOrEqualTo(String value) {
            addCriterion("PFQK_COD <=", value, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodLike(String value) {
            addCriterion("PFQK_COD like", value, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodNotLike(String value) {
            addCriterion("PFQK_COD not like", value, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodIn(List<String> values) {
            addCriterion("PFQK_COD in", values, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodNotIn(List<String> values) {
            addCriterion("PFQK_COD not in", values, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodBetween(String value1, String value2) {
            addCriterion("PFQK_COD between", value1, value2, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andPfqkCodNotBetween(String value1, String value2) {
            addCriterion("PFQK_COD not between", value1, value2, "pfqkCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodIsNull() {
            addCriterion("XYFS_COD is null");
            return (Criteria) this;
        }

        public Criteria andXyfsCodIsNotNull() {
            addCriterion("XYFS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXyfsCodEqualTo(String value) {
            addCriterion("XYFS_COD =", value, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodNotEqualTo(String value) {
            addCriterion("XYFS_COD <>", value, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodGreaterThan(String value) {
            addCriterion("XYFS_COD >", value, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodGreaterThanOrEqualTo(String value) {
            addCriterion("XYFS_COD >=", value, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodLessThan(String value) {
            addCriterion("XYFS_COD <", value, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodLessThanOrEqualTo(String value) {
            addCriterion("XYFS_COD <=", value, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodLike(String value) {
            addCriterion("XYFS_COD like", value, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodNotLike(String value) {
            addCriterion("XYFS_COD not like", value, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodIn(List<String> values) {
            addCriterion("XYFS_COD in", values, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodNotIn(List<String> values) {
            addCriterion("XYFS_COD not in", values, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodBetween(String value1, String value2) {
            addCriterion("XYFS_COD between", value1, value2, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andXyfsCodNotBetween(String value1, String value2) {
            addCriterion("XYFS_COD not between", value1, value2, "xyfsCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodIsNull() {
            addCriterion("RGQD_COD is null");
            return (Criteria) this;
        }

        public Criteria andRgqdCodIsNotNull() {
            addCriterion("RGQD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRgqdCodEqualTo(String value) {
            addCriterion("RGQD_COD =", value, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodNotEqualTo(String value) {
            addCriterion("RGQD_COD <>", value, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodGreaterThan(String value) {
            addCriterion("RGQD_COD >", value, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodGreaterThanOrEqualTo(String value) {
            addCriterion("RGQD_COD >=", value, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodLessThan(String value) {
            addCriterion("RGQD_COD <", value, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodLessThanOrEqualTo(String value) {
            addCriterion("RGQD_COD <=", value, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodLike(String value) {
            addCriterion("RGQD_COD like", value, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodNotLike(String value) {
            addCriterion("RGQD_COD not like", value, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodIn(List<String> values) {
            addCriterion("RGQD_COD in", values, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodNotIn(List<String> values) {
            addCriterion("RGQD_COD not in", values, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodBetween(String value1, String value2) {
            addCriterion("RGQD_COD between", value1, value2, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdCodNotBetween(String value1, String value2) {
            addCriterion("RGQD_COD not between", value1, value2, "rgqdCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodIsNull() {
            addCriterion("RGQD_ORAL_COD is null");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodIsNotNull() {
            addCriterion("RGQD_ORAL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodEqualTo(String value) {
            addCriterion("RGQD_ORAL_COD =", value, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodNotEqualTo(String value) {
            addCriterion("RGQD_ORAL_COD <>", value, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodGreaterThan(String value) {
            addCriterion("RGQD_ORAL_COD >", value, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodGreaterThanOrEqualTo(String value) {
            addCriterion("RGQD_ORAL_COD >=", value, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodLessThan(String value) {
            addCriterion("RGQD_ORAL_COD <", value, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodLessThanOrEqualTo(String value) {
            addCriterion("RGQD_ORAL_COD <=", value, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodLike(String value) {
            addCriterion("RGQD_ORAL_COD like", value, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodNotLike(String value) {
            addCriterion("RGQD_ORAL_COD not like", value, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodIn(List<String> values) {
            addCriterion("RGQD_ORAL_COD in", values, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodNotIn(List<String> values) {
            addCriterion("RGQD_ORAL_COD not in", values, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodBetween(String value1, String value2) {
            addCriterion("RGQD_ORAL_COD between", value1, value2, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andRgqdOralCodNotBetween(String value1, String value2) {
            addCriterion("RGQD_ORAL_COD not between", value1, value2, "rgqdOralCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodIsNull() {
            addCriterion("GLCS_COD is null");
            return (Criteria) this;
        }

        public Criteria andGlcsCodIsNotNull() {
            addCriterion("GLCS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGlcsCodEqualTo(String value) {
            addCriterion("GLCS_COD =", value, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodNotEqualTo(String value) {
            addCriterion("GLCS_COD <>", value, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodGreaterThan(String value) {
            addCriterion("GLCS_COD >", value, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodGreaterThanOrEqualTo(String value) {
            addCriterion("GLCS_COD >=", value, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodLessThan(String value) {
            addCriterion("GLCS_COD <", value, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodLessThanOrEqualTo(String value) {
            addCriterion("GLCS_COD <=", value, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodLike(String value) {
            addCriterion("GLCS_COD like", value, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodNotLike(String value) {
            addCriterion("GLCS_COD not like", value, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodIn(List<String> values) {
            addCriterion("GLCS_COD in", values, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodNotIn(List<String> values) {
            addCriterion("GLCS_COD not in", values, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodBetween(String value1, String value2) {
            addCriterion("GLCS_COD between", value1, value2, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andGlcsCodNotBetween(String value1, String value2) {
            addCriterion("GLCS_COD not between", value1, value2, "glcsCod");
            return (Criteria) this;
        }

        public Criteria andZcksNbrIsNull() {
            addCriterion("ZCKS_NBR is null");
            return (Criteria) this;
        }

        public Criteria andZcksNbrIsNotNull() {
            addCriterion("ZCKS_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andZcksNbrEqualTo(String value) {
            addCriterion("ZCKS_NBR =", value, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNbrNotEqualTo(String value) {
            addCriterion("ZCKS_NBR <>", value, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNbrGreaterThan(String value) {
            addCriterion("ZCKS_NBR >", value, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNbrGreaterThanOrEqualTo(String value) {
            addCriterion("ZCKS_NBR >=", value, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNbrLessThan(String value) {
            addCriterion("ZCKS_NBR <", value, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNbrLessThanOrEqualTo(String value) {
            addCriterion("ZCKS_NBR <=", value, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNbrLike(String value) {
            addCriterion("ZCKS_NBR like", value, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNbrNotLike(String value) {
            addCriterion("ZCKS_NBR not like", value, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNbrIn(List<String> values) {
            addCriterion("ZCKS_NBR in", values, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNbrNotIn(List<String> values) {
            addCriterion("ZCKS_NBR not in", values, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNbrBetween(String value1, String value2) {
            addCriterion("ZCKS_NBR between", value1, value2, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNbrNotBetween(String value1, String value2) {
            addCriterion("ZCKS_NBR not between", value1, value2, "zcksNbr");
            return (Criteria) this;
        }

        public Criteria andZcksNamIsNull() {
            addCriterion("ZCKS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andZcksNamIsNotNull() {
            addCriterion("ZCKS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andZcksNamEqualTo(String value) {
            addCriterion("ZCKS_NAM =", value, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andZcksNamNotEqualTo(String value) {
            addCriterion("ZCKS_NAM <>", value, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andZcksNamGreaterThan(String value) {
            addCriterion("ZCKS_NAM >", value, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andZcksNamGreaterThanOrEqualTo(String value) {
            addCriterion("ZCKS_NAM >=", value, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andZcksNamLessThan(String value) {
            addCriterion("ZCKS_NAM <", value, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andZcksNamLessThanOrEqualTo(String value) {
            addCriterion("ZCKS_NAM <=", value, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andZcksNamLike(String value) {
            addCriterion("ZCKS_NAM like", value, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andZcksNamNotLike(String value) {
            addCriterion("ZCKS_NAM not like", value, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andZcksNamIn(List<String> values) {
            addCriterion("ZCKS_NAM in", values, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andZcksNamNotIn(List<String> values) {
            addCriterion("ZCKS_NAM not in", values, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andZcksNamBetween(String value1, String value2) {
            addCriterion("ZCKS_NAM between", value1, value2, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andZcksNamNotBetween(String value1, String value2) {
            addCriterion("ZCKS_NAM not between", value1, value2, "zcksNam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrIsNull() {
            addCriterion("HSQM1_NBR is null");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrIsNotNull() {
            addCriterion("HSQM1_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrEqualTo(String value) {
            addCriterion("HSQM1_NBR =", value, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrNotEqualTo(String value) {
            addCriterion("HSQM1_NBR <>", value, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrGreaterThan(String value) {
            addCriterion("HSQM1_NBR >", value, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrGreaterThanOrEqualTo(String value) {
            addCriterion("HSQM1_NBR >=", value, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrLessThan(String value) {
            addCriterion("HSQM1_NBR <", value, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrLessThanOrEqualTo(String value) {
            addCriterion("HSQM1_NBR <=", value, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrLike(String value) {
            addCriterion("HSQM1_NBR like", value, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrNotLike(String value) {
            addCriterion("HSQM1_NBR not like", value, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrIn(List<String> values) {
            addCriterion("HSQM1_NBR in", values, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrNotIn(List<String> values) {
            addCriterion("HSQM1_NBR not in", values, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrBetween(String value1, String value2) {
            addCriterion("HSQM1_NBR between", value1, value2, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NbrNotBetween(String value1, String value2) {
            addCriterion("HSQM1_NBR not between", value1, value2, "hsqm1Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamIsNull() {
            addCriterion("HSQM1_NAM is null");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamIsNotNull() {
            addCriterion("HSQM1_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamEqualTo(String value) {
            addCriterion("HSQM1_NAM =", value, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamNotEqualTo(String value) {
            addCriterion("HSQM1_NAM <>", value, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamGreaterThan(String value) {
            addCriterion("HSQM1_NAM >", value, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamGreaterThanOrEqualTo(String value) {
            addCriterion("HSQM1_NAM >=", value, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamLessThan(String value) {
            addCriterion("HSQM1_NAM <", value, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamLessThanOrEqualTo(String value) {
            addCriterion("HSQM1_NAM <=", value, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamLike(String value) {
            addCriterion("HSQM1_NAM like", value, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamNotLike(String value) {
            addCriterion("HSQM1_NAM not like", value, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamIn(List<String> values) {
            addCriterion("HSQM1_NAM in", values, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamNotIn(List<String> values) {
            addCriterion("HSQM1_NAM not in", values, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamBetween(String value1, String value2) {
            addCriterion("HSQM1_NAM between", value1, value2, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm1NamNotBetween(String value1, String value2) {
            addCriterion("HSQM1_NAM not between", value1, value2, "hsqm1Nam");
            return (Criteria) this;
        }

        public Criteria andZcDatIsNull() {
            addCriterion("ZC_DAT is null");
            return (Criteria) this;
        }

        public Criteria andZcDatIsNotNull() {
            addCriterion("ZC_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andZcDatEqualTo(Date value) {
            addCriterion("ZC_DAT =", value, "zcDat");
            return (Criteria) this;
        }

        public Criteria andZcDatNotEqualTo(Date value) {
            addCriterion("ZC_DAT <>", value, "zcDat");
            return (Criteria) this;
        }

        public Criteria andZcDatGreaterThan(Date value) {
            addCriterion("ZC_DAT >", value, "zcDat");
            return (Criteria) this;
        }

        public Criteria andZcDatGreaterThanOrEqualTo(Date value) {
            addCriterion("ZC_DAT >=", value, "zcDat");
            return (Criteria) this;
        }

        public Criteria andZcDatLessThan(Date value) {
            addCriterion("ZC_DAT <", value, "zcDat");
            return (Criteria) this;
        }

        public Criteria andZcDatLessThanOrEqualTo(Date value) {
            addCriterion("ZC_DAT <=", value, "zcDat");
            return (Criteria) this;
        }

        public Criteria andZcDatIn(List<Date> values) {
            addCriterion("ZC_DAT in", values, "zcDat");
            return (Criteria) this;
        }

        public Criteria andZcDatNotIn(List<Date> values) {
            addCriterion("ZC_DAT not in", values, "zcDat");
            return (Criteria) this;
        }

        public Criteria andZcDatBetween(Date value1, Date value2) {
            addCriterion("ZC_DAT between", value1, value2, "zcDat");
            return (Criteria) this;
        }

        public Criteria andZcDatNotBetween(Date value1, Date value2) {
            addCriterion("ZC_DAT not between", value1, value2, "zcDat");
            return (Criteria) this;
        }

        public Criteria andJsksNbrIsNull() {
            addCriterion("JSKS_NBR is null");
            return (Criteria) this;
        }

        public Criteria andJsksNbrIsNotNull() {
            addCriterion("JSKS_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andJsksNbrEqualTo(String value) {
            addCriterion("JSKS_NBR =", value, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNbrNotEqualTo(String value) {
            addCriterion("JSKS_NBR <>", value, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNbrGreaterThan(String value) {
            addCriterion("JSKS_NBR >", value, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNbrGreaterThanOrEqualTo(String value) {
            addCriterion("JSKS_NBR >=", value, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNbrLessThan(String value) {
            addCriterion("JSKS_NBR <", value, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNbrLessThanOrEqualTo(String value) {
            addCriterion("JSKS_NBR <=", value, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNbrLike(String value) {
            addCriterion("JSKS_NBR like", value, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNbrNotLike(String value) {
            addCriterion("JSKS_NBR not like", value, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNbrIn(List<String> values) {
            addCriterion("JSKS_NBR in", values, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNbrNotIn(List<String> values) {
            addCriterion("JSKS_NBR not in", values, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNbrBetween(String value1, String value2) {
            addCriterion("JSKS_NBR between", value1, value2, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNbrNotBetween(String value1, String value2) {
            addCriterion("JSKS_NBR not between", value1, value2, "jsksNbr");
            return (Criteria) this;
        }

        public Criteria andJsksNamIsNull() {
            addCriterion("JSKS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andJsksNamIsNotNull() {
            addCriterion("JSKS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andJsksNamEqualTo(String value) {
            addCriterion("JSKS_NAM =", value, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andJsksNamNotEqualTo(String value) {
            addCriterion("JSKS_NAM <>", value, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andJsksNamGreaterThan(String value) {
            addCriterion("JSKS_NAM >", value, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andJsksNamGreaterThanOrEqualTo(String value) {
            addCriterion("JSKS_NAM >=", value, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andJsksNamLessThan(String value) {
            addCriterion("JSKS_NAM <", value, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andJsksNamLessThanOrEqualTo(String value) {
            addCriterion("JSKS_NAM <=", value, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andJsksNamLike(String value) {
            addCriterion("JSKS_NAM like", value, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andJsksNamNotLike(String value) {
            addCriterion("JSKS_NAM not like", value, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andJsksNamIn(List<String> values) {
            addCriterion("JSKS_NAM in", values, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andJsksNamNotIn(List<String> values) {
            addCriterion("JSKS_NAM not in", values, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andJsksNamBetween(String value1, String value2) {
            addCriterion("JSKS_NAM between", value1, value2, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andJsksNamNotBetween(String value1, String value2) {
            addCriterion("JSKS_NAM not between", value1, value2, "jsksNam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrIsNull() {
            addCriterion("HSQM2_NBR is null");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrIsNotNull() {
            addCriterion("HSQM2_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrEqualTo(String value) {
            addCriterion("HSQM2_NBR =", value, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrNotEqualTo(String value) {
            addCriterion("HSQM2_NBR <>", value, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrGreaterThan(String value) {
            addCriterion("HSQM2_NBR >", value, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrGreaterThanOrEqualTo(String value) {
            addCriterion("HSQM2_NBR >=", value, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrLessThan(String value) {
            addCriterion("HSQM2_NBR <", value, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrLessThanOrEqualTo(String value) {
            addCriterion("HSQM2_NBR <=", value, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrLike(String value) {
            addCriterion("HSQM2_NBR like", value, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrNotLike(String value) {
            addCriterion("HSQM2_NBR not like", value, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrIn(List<String> values) {
            addCriterion("HSQM2_NBR in", values, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrNotIn(List<String> values) {
            addCriterion("HSQM2_NBR not in", values, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrBetween(String value1, String value2) {
            addCriterion("HSQM2_NBR between", value1, value2, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NbrNotBetween(String value1, String value2) {
            addCriterion("HSQM2_NBR not between", value1, value2, "hsqm2Nbr");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamIsNull() {
            addCriterion("HSQM2_NAM is null");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamIsNotNull() {
            addCriterion("HSQM2_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamEqualTo(String value) {
            addCriterion("HSQM2_NAM =", value, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamNotEqualTo(String value) {
            addCriterion("HSQM2_NAM <>", value, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamGreaterThan(String value) {
            addCriterion("HSQM2_NAM >", value, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamGreaterThanOrEqualTo(String value) {
            addCriterion("HSQM2_NAM >=", value, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamLessThan(String value) {
            addCriterion("HSQM2_NAM <", value, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamLessThanOrEqualTo(String value) {
            addCriterion("HSQM2_NAM <=", value, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamLike(String value) {
            addCriterion("HSQM2_NAM like", value, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamNotLike(String value) {
            addCriterion("HSQM2_NAM not like", value, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamIn(List<String> values) {
            addCriterion("HSQM2_NAM in", values, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamNotIn(List<String> values) {
            addCriterion("HSQM2_NAM not in", values, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamBetween(String value1, String value2) {
            addCriterion("HSQM2_NAM between", value1, value2, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andHsqm2NamNotBetween(String value1, String value2) {
            addCriterion("HSQM2_NAM not between", value1, value2, "hsqm2Nam");
            return (Criteria) this;
        }

        public Criteria andJsDatIsNull() {
            addCriterion("JS_DAT is null");
            return (Criteria) this;
        }

        public Criteria andJsDatIsNotNull() {
            addCriterion("JS_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andJsDatEqualTo(Date value) {
            addCriterion("JS_DAT =", value, "jsDat");
            return (Criteria) this;
        }

        public Criteria andJsDatNotEqualTo(Date value) {
            addCriterion("JS_DAT <>", value, "jsDat");
            return (Criteria) this;
        }

        public Criteria andJsDatGreaterThan(Date value) {
            addCriterion("JS_DAT >", value, "jsDat");
            return (Criteria) this;
        }

        public Criteria andJsDatGreaterThanOrEqualTo(Date value) {
            addCriterion("JS_DAT >=", value, "jsDat");
            return (Criteria) this;
        }

        public Criteria andJsDatLessThan(Date value) {
            addCriterion("JS_DAT <", value, "jsDat");
            return (Criteria) this;
        }

        public Criteria andJsDatLessThanOrEqualTo(Date value) {
            addCriterion("JS_DAT <=", value, "jsDat");
            return (Criteria) this;
        }

        public Criteria andJsDatIn(List<Date> values) {
            addCriterion("JS_DAT in", values, "jsDat");
            return (Criteria) this;
        }

        public Criteria andJsDatNotIn(List<Date> values) {
            addCriterion("JS_DAT not in", values, "jsDat");
            return (Criteria) this;
        }

        public Criteria andJsDatBetween(Date value1, Date value2) {
            addCriterion("JS_DAT between", value1, value2, "jsDat");
            return (Criteria) this;
        }

        public Criteria andJsDatNotBetween(Date value1, Date value2) {
            addCriterion("JS_DAT not between", value1, value2, "jsDat");
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

        public Criteria andCratNbrIsNull() {
            addCriterion("CRAT_NBR is null");
            return (Criteria) this;
        }

        public Criteria andCratNbrIsNotNull() {
            addCriterion("CRAT_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andCratNbrEqualTo(String value) {
            addCriterion("CRAT_NBR =", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotEqualTo(String value) {
            addCriterion("CRAT_NBR <>", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrGreaterThan(String value) {
            addCriterion("CRAT_NBR >", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CRAT_NBR >=", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrLessThan(String value) {
            addCriterion("CRAT_NBR <", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrLessThanOrEqualTo(String value) {
            addCriterion("CRAT_NBR <=", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrLike(String value) {
            addCriterion("CRAT_NBR like", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotLike(String value) {
            addCriterion("CRAT_NBR not like", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrIn(List<String> values) {
            addCriterion("CRAT_NBR in", values, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotIn(List<String> values) {
            addCriterion("CRAT_NBR not in", values, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrBetween(String value1, String value2) {
            addCriterion("CRAT_NBR between", value1, value2, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotBetween(String value1, String value2) {
            addCriterion("CRAT_NBR not between", value1, value2, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtDatIsNull() {
            addCriterion("UPDT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andUpdtDatIsNotNull() {
            addCriterion("UPDT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtDatEqualTo(Date value) {
            addCriterion("UPDT_DAT =", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatNotEqualTo(Date value) {
            addCriterion("UPDT_DAT <>", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatGreaterThan(Date value) {
            addCriterion("UPDT_DAT >", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT >=", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatLessThan(Date value) {
            addCriterion("UPDT_DAT <", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatLessThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT <=", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatIn(List<Date> values) {
            addCriterion("UPDT_DAT in", values, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatNotIn(List<Date> values) {
            addCriterion("UPDT_DAT not in", values, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatBetween(Date value1, Date value2) {
            addCriterion("UPDT_DAT between", value1, value2, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatNotBetween(Date value1, Date value2) {
            addCriterion("UPDT_DAT not between", value1, value2, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrIsNull() {
            addCriterion("UPDT_NBR is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrIsNotNull() {
            addCriterion("UPDT_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrEqualTo(String value) {
            addCriterion("UPDT_NBR =", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotEqualTo(String value) {
            addCriterion("UPDT_NBR <>", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrGreaterThan(String value) {
            addCriterion("UPDT_NBR >", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR >=", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrLessThan(String value) {
            addCriterion("UPDT_NBR <", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrLessThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR <=", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrLike(String value) {
            addCriterion("UPDT_NBR like", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotLike(String value) {
            addCriterion("UPDT_NBR not like", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrIn(List<String> values) {
            addCriterion("UPDT_NBR in", values, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotIn(List<String> values) {
            addCriterion("UPDT_NBR not in", values, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrBetween(String value1, String value2) {
            addCriterion("UPDT_NBR between", value1, value2, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotBetween(String value1, String value2) {
            addCriterion("UPDT_NBR not between", value1, value2, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatIsNull() {
            addCriterion("HZZYJJ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatIsNotNull() {
            addCriterion("HZZYJJ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatEqualTo(Date value) {
            addCriterion("HZZYJJ_DAT =", value, "hzzyjjDat");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatNotEqualTo(Date value) {
            addCriterion("HZZYJJ_DAT <>", value, "hzzyjjDat");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatGreaterThan(Date value) {
            addCriterion("HZZYJJ_DAT >", value, "hzzyjjDat");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatGreaterThanOrEqualTo(Date value) {
            addCriterion("HZZYJJ_DAT >=", value, "hzzyjjDat");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatLessThan(Date value) {
            addCriterion("HZZYJJ_DAT <", value, "hzzyjjDat");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatLessThanOrEqualTo(Date value) {
            addCriterion("HZZYJJ_DAT <=", value, "hzzyjjDat");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatIn(List<Date> values) {
            addCriterion("HZZYJJ_DAT in", values, "hzzyjjDat");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatNotIn(List<Date> values) {
            addCriterion("HZZYJJ_DAT not in", values, "hzzyjjDat");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatBetween(Date value1, Date value2) {
            addCriterion("HZZYJJ_DAT between", value1, value2, "hzzyjjDat");
            return (Criteria) this;
        }

        public Criteria andHzzyjjDatNotBetween(Date value1, Date value2) {
            addCriterion("HZZYJJ_DAT not between", value1, value2, "hzzyjjDat");
            return (Criteria) this;
        }

        public Criteria andPfqkQtIsNull() {
            addCriterion("PFQK_QT is null");
            return (Criteria) this;
        }

        public Criteria andPfqkQtIsNotNull() {
            addCriterion("PFQK_QT is not null");
            return (Criteria) this;
        }

        public Criteria andPfqkQtEqualTo(String value) {
            addCriterion("PFQK_QT =", value, "pfqkQt");
            return (Criteria) this;
        }

        public Criteria andPfqkQtNotEqualTo(String value) {
            addCriterion("PFQK_QT <>", value, "pfqkQt");
            return (Criteria) this;
        }

        public Criteria andPfqkQtGreaterThan(String value) {
            addCriterion("PFQK_QT >", value, "pfqkQt");
            return (Criteria) this;
        }

        public Criteria andPfqkQtGreaterThanOrEqualTo(String value) {
            addCriterion("PFQK_QT >=", value, "pfqkQt");
            return (Criteria) this;
        }

        public Criteria andPfqkQtLessThan(String value) {
            addCriterion("PFQK_QT <", value, "pfqkQt");
            return (Criteria) this;
        }

        public Criteria andPfqkQtLessThanOrEqualTo(String value) {
            addCriterion("PFQK_QT <=", value, "pfqkQt");
            return (Criteria) this;
        }

        public Criteria andPfqkQtLike(String value) {
            addCriterion("PFQK_QT like", value, "pfqkQt");
            return (Criteria) this;
        }

        public Criteria andPfqkQtNotLike(String value) {
            addCriterion("PFQK_QT not like", value, "pfqkQt");
            return (Criteria) this;
        }

        public Criteria andPfqkQtIn(List<String> values) {
            addCriterion("PFQK_QT in", values, "pfqkQt");
            return (Criteria) this;
        }

        public Criteria andPfqkQtNotIn(List<String> values) {
            addCriterion("PFQK_QT not in", values, "pfqkQt");
            return (Criteria) this;
        }

        public Criteria andPfqkQtBetween(String value1, String value2) {
            addCriterion("PFQK_QT between", value1, value2, "pfqkQt");
            return (Criteria) this;
        }

        public Criteria andPfqkQtNotBetween(String value1, String value2) {
            addCriterion("PFQK_QT not between", value1, value2, "pfqkQt");
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