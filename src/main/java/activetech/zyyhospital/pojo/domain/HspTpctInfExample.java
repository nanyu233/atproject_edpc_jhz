package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspTpctInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspTpctInfExample() {
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

        public Criteria andTemperatureChartSeqIsNull() {
            addCriterion("TEMPERATURE_CHART_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqIsNotNull() {
            addCriterion("TEMPERATURE_CHART_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqEqualTo(String value) {
            addCriterion("TEMPERATURE_CHART_SEQ =", value, "temperatureChartSeq");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqNotEqualTo(String value) {
            addCriterion("TEMPERATURE_CHART_SEQ <>", value, "temperatureChartSeq");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqGreaterThan(String value) {
            addCriterion("TEMPERATURE_CHART_SEQ >", value, "temperatureChartSeq");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPERATURE_CHART_SEQ >=", value, "temperatureChartSeq");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqLessThan(String value) {
            addCriterion("TEMPERATURE_CHART_SEQ <", value, "temperatureChartSeq");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqLessThanOrEqualTo(String value) {
            addCriterion("TEMPERATURE_CHART_SEQ <=", value, "temperatureChartSeq");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqLike(String value) {
            addCriterion("TEMPERATURE_CHART_SEQ like", value, "temperatureChartSeq");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqNotLike(String value) {
            addCriterion("TEMPERATURE_CHART_SEQ not like", value, "temperatureChartSeq");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqIn(List<String> values) {
            addCriterion("TEMPERATURE_CHART_SEQ in", values, "temperatureChartSeq");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqNotIn(List<String> values) {
            addCriterion("TEMPERATURE_CHART_SEQ not in", values, "temperatureChartSeq");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqBetween(String value1, String value2) {
            addCriterion("TEMPERATURE_CHART_SEQ between", value1, value2, "temperatureChartSeq");
            return (Criteria) this;
        }

        public Criteria andTemperatureChartSeqNotBetween(String value1, String value2) {
            addCriterion("TEMPERATURE_CHART_SEQ not between", value1, value2, "temperatureChartSeq");
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

        public Criteria andEnteringDatIsNull() {
            addCriterion("ENTERING_DAT is null");
            return (Criteria) this;
        }

        public Criteria andEnteringDatIsNotNull() {
            addCriterion("ENTERING_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andEnteringDatEqualTo(Date value) {
            addCriterion("ENTERING_DAT =", value, "enteringDat");
            return (Criteria) this;
        }

        public Criteria andEnteringDatNotEqualTo(Date value) {
            addCriterion("ENTERING_DAT <>", value, "enteringDat");
            return (Criteria) this;
        }

        public Criteria andEnteringDatGreaterThan(Date value) {
            addCriterion("ENTERING_DAT >", value, "enteringDat");
            return (Criteria) this;
        }

        public Criteria andEnteringDatGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTERING_DAT >=", value, "enteringDat");
            return (Criteria) this;
        }

        public Criteria andEnteringDatLessThan(Date value) {
            addCriterion("ENTERING_DAT <", value, "enteringDat");
            return (Criteria) this;
        }

        public Criteria andEnteringDatLessThanOrEqualTo(Date value) {
            addCriterion("ENTERING_DAT <=", value, "enteringDat");
            return (Criteria) this;
        }

        public Criteria andEnteringDatIn(List<Date> values) {
            addCriterion("ENTERING_DAT in", values, "enteringDat");
            return (Criteria) this;
        }

        public Criteria andEnteringDatNotIn(List<Date> values) {
            addCriterion("ENTERING_DAT not in", values, "enteringDat");
            return (Criteria) this;
        }

        public Criteria andEnteringDatBetween(Date value1, Date value2) {
            addCriterion("ENTERING_DAT between", value1, value2, "enteringDat");
            return (Criteria) this;
        }

        public Criteria andEnteringDatNotBetween(Date value1, Date value2) {
            addCriterion("ENTERING_DAT not between", value1, value2, "enteringDat");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodIsNull() {
            addCriterion("TPCT_TW_COD is null");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodIsNotNull() {
            addCriterion("TPCT_TW_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodEqualTo(String value) {
            addCriterion("TPCT_TW_COD =", value, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodNotEqualTo(String value) {
            addCriterion("TPCT_TW_COD <>", value, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodGreaterThan(String value) {
            addCriterion("TPCT_TW_COD >", value, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_TW_COD >=", value, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodLessThan(String value) {
            addCriterion("TPCT_TW_COD <", value, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodLessThanOrEqualTo(String value) {
            addCriterion("TPCT_TW_COD <=", value, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodLike(String value) {
            addCriterion("TPCT_TW_COD like", value, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodNotLike(String value) {
            addCriterion("TPCT_TW_COD not like", value, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodIn(List<String> values) {
            addCriterion("TPCT_TW_COD in", values, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodNotIn(List<String> values) {
            addCriterion("TPCT_TW_COD not in", values, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodBetween(String value1, String value2) {
            addCriterion("TPCT_TW_COD between", value1, value2, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwCodNotBetween(String value1, String value2) {
            addCriterion("TPCT_TW_COD not between", value1, value2, "tpctTwCod");
            return (Criteria) this;
        }

        public Criteria andTpctTwIsNull() {
            addCriterion("TPCT_TW is null");
            return (Criteria) this;
        }

        public Criteria andTpctTwIsNotNull() {
            addCriterion("TPCT_TW is not null");
            return (Criteria) this;
        }

        public Criteria andTpctTwEqualTo(String value) {
            addCriterion("TPCT_TW =", value, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctTwNotEqualTo(String value) {
            addCriterion("TPCT_TW <>", value, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctTwGreaterThan(String value) {
            addCriterion("TPCT_TW >", value, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctTwGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_TW >=", value, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctTwLessThan(String value) {
            addCriterion("TPCT_TW <", value, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctTwLessThanOrEqualTo(String value) {
            addCriterion("TPCT_TW <=", value, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctTwLike(String value) {
            addCriterion("TPCT_TW like", value, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctTwNotLike(String value) {
            addCriterion("TPCT_TW not like", value, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctTwIn(List<String> values) {
            addCriterion("TPCT_TW in", values, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctTwNotIn(List<String> values) {
            addCriterion("TPCT_TW not in", values, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctTwBetween(String value1, String value2) {
            addCriterion("TPCT_TW between", value1, value2, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctTwNotBetween(String value1, String value2) {
            addCriterion("TPCT_TW not between", value1, value2, "tpctTw");
            return (Criteria) this;
        }

        public Criteria andTpctJwhIsNull() {
            addCriterion("TPCT_JWH is null");
            return (Criteria) this;
        }

        public Criteria andTpctJwhIsNotNull() {
            addCriterion("TPCT_JWH is not null");
            return (Criteria) this;
        }

        public Criteria andTpctJwhEqualTo(String value) {
            addCriterion("TPCT_JWH =", value, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctJwhNotEqualTo(String value) {
            addCriterion("TPCT_JWH <>", value, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctJwhGreaterThan(String value) {
            addCriterion("TPCT_JWH >", value, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctJwhGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_JWH >=", value, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctJwhLessThan(String value) {
            addCriterion("TPCT_JWH <", value, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctJwhLessThanOrEqualTo(String value) {
            addCriterion("TPCT_JWH <=", value, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctJwhLike(String value) {
            addCriterion("TPCT_JWH like", value, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctJwhNotLike(String value) {
            addCriterion("TPCT_JWH not like", value, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctJwhIn(List<String> values) {
            addCriterion("TPCT_JWH in", values, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctJwhNotIn(List<String> values) {
            addCriterion("TPCT_JWH not in", values, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctJwhBetween(String value1, String value2) {
            addCriterion("TPCT_JWH between", value1, value2, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctJwhNotBetween(String value1, String value2) {
            addCriterion("TPCT_JWH not between", value1, value2, "tpctJwh");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodIsNull() {
            addCriterion("TPCT_MB_COD is null");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodIsNotNull() {
            addCriterion("TPCT_MB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodEqualTo(String value) {
            addCriterion("TPCT_MB_COD =", value, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodNotEqualTo(String value) {
            addCriterion("TPCT_MB_COD <>", value, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodGreaterThan(String value) {
            addCriterion("TPCT_MB_COD >", value, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_MB_COD >=", value, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodLessThan(String value) {
            addCriterion("TPCT_MB_COD <", value, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodLessThanOrEqualTo(String value) {
            addCriterion("TPCT_MB_COD <=", value, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodLike(String value) {
            addCriterion("TPCT_MB_COD like", value, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodNotLike(String value) {
            addCriterion("TPCT_MB_COD not like", value, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodIn(List<String> values) {
            addCriterion("TPCT_MB_COD in", values, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodNotIn(List<String> values) {
            addCriterion("TPCT_MB_COD not in", values, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodBetween(String value1, String value2) {
            addCriterion("TPCT_MB_COD between", value1, value2, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbCodNotBetween(String value1, String value2) {
            addCriterion("TPCT_MB_COD not between", value1, value2, "tpctMbCod");
            return (Criteria) this;
        }

        public Criteria andTpctMbIsNull() {
            addCriterion("TPCT_MB is null");
            return (Criteria) this;
        }

        public Criteria andTpctMbIsNotNull() {
            addCriterion("TPCT_MB is not null");
            return (Criteria) this;
        }

        public Criteria andTpctMbEqualTo(String value) {
            addCriterion("TPCT_MB =", value, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctMbNotEqualTo(String value) {
            addCriterion("TPCT_MB <>", value, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctMbGreaterThan(String value) {
            addCriterion("TPCT_MB >", value, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctMbGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_MB >=", value, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctMbLessThan(String value) {
            addCriterion("TPCT_MB <", value, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctMbLessThanOrEqualTo(String value) {
            addCriterion("TPCT_MB <=", value, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctMbLike(String value) {
            addCriterion("TPCT_MB like", value, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctMbNotLike(String value) {
            addCriterion("TPCT_MB not like", value, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctMbIn(List<String> values) {
            addCriterion("TPCT_MB in", values, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctMbNotIn(List<String> values) {
            addCriterion("TPCT_MB not in", values, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctMbBetween(String value1, String value2) {
            addCriterion("TPCT_MB between", value1, value2, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctMbNotBetween(String value1, String value2) {
            addCriterion("TPCT_MB not between", value1, value2, "tpctMb");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodIsNull() {
            addCriterion("TPCT_HX_COD is null");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodIsNotNull() {
            addCriterion("TPCT_HX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodEqualTo(String value) {
            addCriterion("TPCT_HX_COD =", value, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodNotEqualTo(String value) {
            addCriterion("TPCT_HX_COD <>", value, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodGreaterThan(String value) {
            addCriterion("TPCT_HX_COD >", value, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_HX_COD >=", value, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodLessThan(String value) {
            addCriterion("TPCT_HX_COD <", value, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodLessThanOrEqualTo(String value) {
            addCriterion("TPCT_HX_COD <=", value, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodLike(String value) {
            addCriterion("TPCT_HX_COD like", value, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodNotLike(String value) {
            addCriterion("TPCT_HX_COD not like", value, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodIn(List<String> values) {
            addCriterion("TPCT_HX_COD in", values, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodNotIn(List<String> values) {
            addCriterion("TPCT_HX_COD not in", values, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodBetween(String value1, String value2) {
            addCriterion("TPCT_HX_COD between", value1, value2, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxCodNotBetween(String value1, String value2) {
            addCriterion("TPCT_HX_COD not between", value1, value2, "tpctHxCod");
            return (Criteria) this;
        }

        public Criteria andTpctHxIsNull() {
            addCriterion("TPCT_HX is null");
            return (Criteria) this;
        }

        public Criteria andTpctHxIsNotNull() {
            addCriterion("TPCT_HX is not null");
            return (Criteria) this;
        }

        public Criteria andTpctHxEqualTo(String value) {
            addCriterion("TPCT_HX =", value, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctHxNotEqualTo(String value) {
            addCriterion("TPCT_HX <>", value, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctHxGreaterThan(String value) {
            addCriterion("TPCT_HX >", value, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctHxGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_HX >=", value, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctHxLessThan(String value) {
            addCriterion("TPCT_HX <", value, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctHxLessThanOrEqualTo(String value) {
            addCriterion("TPCT_HX <=", value, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctHxLike(String value) {
            addCriterion("TPCT_HX like", value, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctHxNotLike(String value) {
            addCriterion("TPCT_HX not like", value, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctHxIn(List<String> values) {
            addCriterion("TPCT_HX in", values, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctHxNotIn(List<String> values) {
            addCriterion("TPCT_HX not in", values, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctHxBetween(String value1, String value2) {
            addCriterion("TPCT_HX between", value1, value2, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctHxNotBetween(String value1, String value2) {
            addCriterion("TPCT_HX not between", value1, value2, "tpctHx");
            return (Criteria) this;
        }

        public Criteria andTpctXlIsNull() {
            addCriterion("TPCT_XL is null");
            return (Criteria) this;
        }

        public Criteria andTpctXlIsNotNull() {
            addCriterion("TPCT_XL is not null");
            return (Criteria) this;
        }

        public Criteria andTpctXlEqualTo(String value) {
            addCriterion("TPCT_XL =", value, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXlNotEqualTo(String value) {
            addCriterion("TPCT_XL <>", value, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXlGreaterThan(String value) {
            addCriterion("TPCT_XL >", value, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXlGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_XL >=", value, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXlLessThan(String value) {
            addCriterion("TPCT_XL <", value, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXlLessThanOrEqualTo(String value) {
            addCriterion("TPCT_XL <=", value, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXlLike(String value) {
            addCriterion("TPCT_XL like", value, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXlNotLike(String value) {
            addCriterion("TPCT_XL not like", value, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXlIn(List<String> values) {
            addCriterion("TPCT_XL in", values, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXlNotIn(List<String> values) {
            addCriterion("TPCT_XL not in", values, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXlBetween(String value1, String value2) {
            addCriterion("TPCT_XL between", value1, value2, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXlNotBetween(String value1, String value2) {
            addCriterion("TPCT_XL not between", value1, value2, "tpctXl");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodIsNull() {
            addCriterion("TPCT_XY_COD is null");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodIsNotNull() {
            addCriterion("TPCT_XY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodEqualTo(String value) {
            addCriterion("TPCT_XY_COD =", value, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodNotEqualTo(String value) {
            addCriterion("TPCT_XY_COD <>", value, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodGreaterThan(String value) {
            addCriterion("TPCT_XY_COD >", value, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_XY_COD >=", value, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodLessThan(String value) {
            addCriterion("TPCT_XY_COD <", value, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodLessThanOrEqualTo(String value) {
            addCriterion("TPCT_XY_COD <=", value, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodLike(String value) {
            addCriterion("TPCT_XY_COD like", value, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodNotLike(String value) {
            addCriterion("TPCT_XY_COD not like", value, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodIn(List<String> values) {
            addCriterion("TPCT_XY_COD in", values, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodNotIn(List<String> values) {
            addCriterion("TPCT_XY_COD not in", values, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodBetween(String value1, String value2) {
            addCriterion("TPCT_XY_COD between", value1, value2, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyCodNotBetween(String value1, String value2) {
            addCriterion("TPCT_XY_COD not between", value1, value2, "tpctXyCod");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpIsNull() {
            addCriterion("TPCT_XY_UP is null");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpIsNotNull() {
            addCriterion("TPCT_XY_UP is not null");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpEqualTo(String value) {
            addCriterion("TPCT_XY_UP =", value, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpNotEqualTo(String value) {
            addCriterion("TPCT_XY_UP <>", value, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpGreaterThan(String value) {
            addCriterion("TPCT_XY_UP >", value, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_XY_UP >=", value, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpLessThan(String value) {
            addCriterion("TPCT_XY_UP <", value, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpLessThanOrEqualTo(String value) {
            addCriterion("TPCT_XY_UP <=", value, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpLike(String value) {
            addCriterion("TPCT_XY_UP like", value, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpNotLike(String value) {
            addCriterion("TPCT_XY_UP not like", value, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpIn(List<String> values) {
            addCriterion("TPCT_XY_UP in", values, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpNotIn(List<String> values) {
            addCriterion("TPCT_XY_UP not in", values, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpBetween(String value1, String value2) {
            addCriterion("TPCT_XY_UP between", value1, value2, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyUpNotBetween(String value1, String value2) {
            addCriterion("TPCT_XY_UP not between", value1, value2, "tpctXyUp");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownIsNull() {
            addCriterion("TPCT_XY_DOWN is null");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownIsNotNull() {
            addCriterion("TPCT_XY_DOWN is not null");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownEqualTo(String value) {
            addCriterion("TPCT_XY_DOWN =", value, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownNotEqualTo(String value) {
            addCriterion("TPCT_XY_DOWN <>", value, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownGreaterThan(String value) {
            addCriterion("TPCT_XY_DOWN >", value, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_XY_DOWN >=", value, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownLessThan(String value) {
            addCriterion("TPCT_XY_DOWN <", value, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownLessThanOrEqualTo(String value) {
            addCriterion("TPCT_XY_DOWN <=", value, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownLike(String value) {
            addCriterion("TPCT_XY_DOWN like", value, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownNotLike(String value) {
            addCriterion("TPCT_XY_DOWN not like", value, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownIn(List<String> values) {
            addCriterion("TPCT_XY_DOWN in", values, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownNotIn(List<String> values) {
            addCriterion("TPCT_XY_DOWN not in", values, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownBetween(String value1, String value2) {
            addCriterion("TPCT_XY_DOWN between", value1, value2, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctXyDownNotBetween(String value1, String value2) {
            addCriterion("TPCT_XY_DOWN not between", value1, value2, "tpctXyDown");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfIsNull() {
            addCriterion("TPCT_TTPF is null");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfIsNotNull() {
            addCriterion("TPCT_TTPF is not null");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfEqualTo(String value) {
            addCriterion("TPCT_TTPF =", value, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfNotEqualTo(String value) {
            addCriterion("TPCT_TTPF <>", value, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfGreaterThan(String value) {
            addCriterion("TPCT_TTPF >", value, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_TTPF >=", value, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfLessThan(String value) {
            addCriterion("TPCT_TTPF <", value, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfLessThanOrEqualTo(String value) {
            addCriterion("TPCT_TTPF <=", value, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfLike(String value) {
            addCriterion("TPCT_TTPF like", value, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfNotLike(String value) {
            addCriterion("TPCT_TTPF not like", value, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfIn(List<String> values) {
            addCriterion("TPCT_TTPF in", values, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfNotIn(List<String> values) {
            addCriterion("TPCT_TTPF not in", values, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfBetween(String value1, String value2) {
            addCriterion("TPCT_TTPF between", value1, value2, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctTtpfNotBetween(String value1, String value2) {
            addCriterion("TPCT_TTPF not between", value1, value2, "tpctTtpf");
            return (Criteria) this;
        }

        public Criteria andTpctJthIsNull() {
            addCriterion("TPCT_JTH is null");
            return (Criteria) this;
        }

        public Criteria andTpctJthIsNotNull() {
            addCriterion("TPCT_JTH is not null");
            return (Criteria) this;
        }

        public Criteria andTpctJthEqualTo(String value) {
            addCriterion("TPCT_JTH =", value, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctJthNotEqualTo(String value) {
            addCriterion("TPCT_JTH <>", value, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctJthGreaterThan(String value) {
            addCriterion("TPCT_JTH >", value, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctJthGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_JTH >=", value, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctJthLessThan(String value) {
            addCriterion("TPCT_JTH <", value, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctJthLessThanOrEqualTo(String value) {
            addCriterion("TPCT_JTH <=", value, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctJthLike(String value) {
            addCriterion("TPCT_JTH like", value, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctJthNotLike(String value) {
            addCriterion("TPCT_JTH not like", value, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctJthIn(List<String> values) {
            addCriterion("TPCT_JTH in", values, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctJthNotIn(List<String> values) {
            addCriterion("TPCT_JTH not in", values, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctJthBetween(String value1, String value2) {
            addCriterion("TPCT_JTH between", value1, value2, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctJthNotBetween(String value1, String value2) {
            addCriterion("TPCT_JTH not between", value1, value2, "tpctJth");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodIsNull() {
            addCriterion("TPCT_DB_COD is null");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodIsNotNull() {
            addCriterion("TPCT_DB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodEqualTo(String value) {
            addCriterion("TPCT_DB_COD =", value, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodNotEqualTo(String value) {
            addCriterion("TPCT_DB_COD <>", value, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodGreaterThan(String value) {
            addCriterion("TPCT_DB_COD >", value, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_DB_COD >=", value, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodLessThan(String value) {
            addCriterion("TPCT_DB_COD <", value, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodLessThanOrEqualTo(String value) {
            addCriterion("TPCT_DB_COD <=", value, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodLike(String value) {
            addCriterion("TPCT_DB_COD like", value, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodNotLike(String value) {
            addCriterion("TPCT_DB_COD not like", value, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodIn(List<String> values) {
            addCriterion("TPCT_DB_COD in", values, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodNotIn(List<String> values) {
            addCriterion("TPCT_DB_COD not in", values, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodBetween(String value1, String value2) {
            addCriterion("TPCT_DB_COD between", value1, value2, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbCodNotBetween(String value1, String value2) {
            addCriterion("TPCT_DB_COD not between", value1, value2, "tpctDbCod");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtIsNull() {
            addCriterion("TPCT_DB_PT is null");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtIsNotNull() {
            addCriterion("TPCT_DB_PT is not null");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtEqualTo(String value) {
            addCriterion("TPCT_DB_PT =", value, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtNotEqualTo(String value) {
            addCriterion("TPCT_DB_PT <>", value, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtGreaterThan(String value) {
            addCriterion("TPCT_DB_PT >", value, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_DB_PT >=", value, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtLessThan(String value) {
            addCriterion("TPCT_DB_PT <", value, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtLessThanOrEqualTo(String value) {
            addCriterion("TPCT_DB_PT <=", value, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtLike(String value) {
            addCriterion("TPCT_DB_PT like", value, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtNotLike(String value) {
            addCriterion("TPCT_DB_PT not like", value, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtIn(List<String> values) {
            addCriterion("TPCT_DB_PT in", values, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtNotIn(List<String> values) {
            addCriterion("TPCT_DB_PT not in", values, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtBetween(String value1, String value2) {
            addCriterion("TPCT_DB_PT between", value1, value2, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbPtNotBetween(String value1, String value2) {
            addCriterion("TPCT_DB_PT not between", value1, value2, "tpctDbPt");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcIsNull() {
            addCriterion("TPCT_DB_GC is null");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcIsNotNull() {
            addCriterion("TPCT_DB_GC is not null");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcEqualTo(String value) {
            addCriterion("TPCT_DB_GC =", value, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcNotEqualTo(String value) {
            addCriterion("TPCT_DB_GC <>", value, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcGreaterThan(String value) {
            addCriterion("TPCT_DB_GC >", value, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_DB_GC >=", value, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcLessThan(String value) {
            addCriterion("TPCT_DB_GC <", value, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcLessThanOrEqualTo(String value) {
            addCriterion("TPCT_DB_GC <=", value, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcLike(String value) {
            addCriterion("TPCT_DB_GC like", value, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcNotLike(String value) {
            addCriterion("TPCT_DB_GC not like", value, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcIn(List<String> values) {
            addCriterion("TPCT_DB_GC in", values, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcNotIn(List<String> values) {
            addCriterion("TPCT_DB_GC not in", values, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcBetween(String value1, String value2) {
            addCriterion("TPCT_DB_GC between", value1, value2, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctDbGcNotBetween(String value1, String value2) {
            addCriterion("TPCT_DB_GC not between", value1, value2, "tpctDbGc");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodIsNull() {
            addCriterion("TPCT_NL_COD is null");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodIsNotNull() {
            addCriterion("TPCT_NL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodEqualTo(String value) {
            addCriterion("TPCT_NL_COD =", value, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodNotEqualTo(String value) {
            addCriterion("TPCT_NL_COD <>", value, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodGreaterThan(String value) {
            addCriterion("TPCT_NL_COD >", value, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_NL_COD >=", value, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodLessThan(String value) {
            addCriterion("TPCT_NL_COD <", value, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodLessThanOrEqualTo(String value) {
            addCriterion("TPCT_NL_COD <=", value, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodLike(String value) {
            addCriterion("TPCT_NL_COD like", value, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodNotLike(String value) {
            addCriterion("TPCT_NL_COD not like", value, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodIn(List<String> values) {
            addCriterion("TPCT_NL_COD in", values, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodNotIn(List<String> values) {
            addCriterion("TPCT_NL_COD not in", values, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodBetween(String value1, String value2) {
            addCriterion("TPCT_NL_COD between", value1, value2, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlCodNotBetween(String value1, String value2) {
            addCriterion("TPCT_NL_COD not between", value1, value2, "tpctNlCod");
            return (Criteria) this;
        }

        public Criteria andTpctNlIsNull() {
            addCriterion("TPCT_NL is null");
            return (Criteria) this;
        }

        public Criteria andTpctNlIsNotNull() {
            addCriterion("TPCT_NL is not null");
            return (Criteria) this;
        }

        public Criteria andTpctNlEqualTo(String value) {
            addCriterion("TPCT_NL =", value, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctNlNotEqualTo(String value) {
            addCriterion("TPCT_NL <>", value, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctNlGreaterThan(String value) {
            addCriterion("TPCT_NL >", value, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctNlGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_NL >=", value, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctNlLessThan(String value) {
            addCriterion("TPCT_NL <", value, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctNlLessThanOrEqualTo(String value) {
            addCriterion("TPCT_NL <=", value, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctNlLike(String value) {
            addCriterion("TPCT_NL like", value, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctNlNotLike(String value) {
            addCriterion("TPCT_NL not like", value, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctNlIn(List<String> values) {
            addCriterion("TPCT_NL in", values, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctNlNotIn(List<String> values) {
            addCriterion("TPCT_NL not in", values, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctNlBetween(String value1, String value2) {
            addCriterion("TPCT_NL between", value1, value2, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctNlNotBetween(String value1, String value2) {
            addCriterion("TPCT_NL not between", value1, value2, "tpctNl");
            return (Criteria) this;
        }

        public Criteria andTpctRlIsNull() {
            addCriterion("TPCT_RL is null");
            return (Criteria) this;
        }

        public Criteria andTpctRlIsNotNull() {
            addCriterion("TPCT_RL is not null");
            return (Criteria) this;
        }

        public Criteria andTpctRlEqualTo(String value) {
            addCriterion("TPCT_RL =", value, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctRlNotEqualTo(String value) {
            addCriterion("TPCT_RL <>", value, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctRlGreaterThan(String value) {
            addCriterion("TPCT_RL >", value, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctRlGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_RL >=", value, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctRlLessThan(String value) {
            addCriterion("TPCT_RL <", value, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctRlLessThanOrEqualTo(String value) {
            addCriterion("TPCT_RL <=", value, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctRlLike(String value) {
            addCriterion("TPCT_RL like", value, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctRlNotLike(String value) {
            addCriterion("TPCT_RL not like", value, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctRlIn(List<String> values) {
            addCriterion("TPCT_RL in", values, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctRlNotIn(List<String> values) {
            addCriterion("TPCT_RL not in", values, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctRlBetween(String value1, String value2) {
            addCriterion("TPCT_RL between", value1, value2, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctRlNotBetween(String value1, String value2) {
            addCriterion("TPCT_RL not between", value1, value2, "tpctRl");
            return (Criteria) this;
        }

        public Criteria andTpctClIsNull() {
            addCriterion("TPCT_CL is null");
            return (Criteria) this;
        }

        public Criteria andTpctClIsNotNull() {
            addCriterion("TPCT_CL is not null");
            return (Criteria) this;
        }

        public Criteria andTpctClEqualTo(String value) {
            addCriterion("TPCT_CL =", value, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctClNotEqualTo(String value) {
            addCriterion("TPCT_CL <>", value, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctClGreaterThan(String value) {
            addCriterion("TPCT_CL >", value, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctClGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_CL >=", value, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctClLessThan(String value) {
            addCriterion("TPCT_CL <", value, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctClLessThanOrEqualTo(String value) {
            addCriterion("TPCT_CL <=", value, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctClLike(String value) {
            addCriterion("TPCT_CL like", value, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctClNotLike(String value) {
            addCriterion("TPCT_CL not like", value, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctClIn(List<String> values) {
            addCriterion("TPCT_CL in", values, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctClNotIn(List<String> values) {
            addCriterion("TPCT_CL not in", values, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctClBetween(String value1, String value2) {
            addCriterion("TPCT_CL between", value1, value2, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctClNotBetween(String value1, String value2) {
            addCriterion("TPCT_CL not between", value1, value2, "tpctCl");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodIsNull() {
            addCriterion("TPCT_TZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodIsNotNull() {
            addCriterion("TPCT_TZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodEqualTo(String value) {
            addCriterion("TPCT_TZ_COD =", value, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodNotEqualTo(String value) {
            addCriterion("TPCT_TZ_COD <>", value, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodGreaterThan(String value) {
            addCriterion("TPCT_TZ_COD >", value, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_TZ_COD >=", value, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodLessThan(String value) {
            addCriterion("TPCT_TZ_COD <", value, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodLessThanOrEqualTo(String value) {
            addCriterion("TPCT_TZ_COD <=", value, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodLike(String value) {
            addCriterion("TPCT_TZ_COD like", value, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodNotLike(String value) {
            addCriterion("TPCT_TZ_COD not like", value, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodIn(List<String> values) {
            addCriterion("TPCT_TZ_COD in", values, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodNotIn(List<String> values) {
            addCriterion("TPCT_TZ_COD not in", values, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodBetween(String value1, String value2) {
            addCriterion("TPCT_TZ_COD between", value1, value2, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzCodNotBetween(String value1, String value2) {
            addCriterion("TPCT_TZ_COD not between", value1, value2, "tpctTzCod");
            return (Criteria) this;
        }

        public Criteria andTpctTzIsNull() {
            addCriterion("TPCT_TZ is null");
            return (Criteria) this;
        }

        public Criteria andTpctTzIsNotNull() {
            addCriterion("TPCT_TZ is not null");
            return (Criteria) this;
        }

        public Criteria andTpctTzEqualTo(String value) {
            addCriterion("TPCT_TZ =", value, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctTzNotEqualTo(String value) {
            addCriterion("TPCT_TZ <>", value, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctTzGreaterThan(String value) {
            addCriterion("TPCT_TZ >", value, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctTzGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_TZ >=", value, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctTzLessThan(String value) {
            addCriterion("TPCT_TZ <", value, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctTzLessThanOrEqualTo(String value) {
            addCriterion("TPCT_TZ <=", value, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctTzLike(String value) {
            addCriterion("TPCT_TZ like", value, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctTzNotLike(String value) {
            addCriterion("TPCT_TZ not like", value, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctTzIn(List<String> values) {
            addCriterion("TPCT_TZ in", values, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctTzNotIn(List<String> values) {
            addCriterion("TPCT_TZ not in", values, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctTzBetween(String value1, String value2) {
            addCriterion("TPCT_TZ between", value1, value2, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctTzNotBetween(String value1, String value2) {
            addCriterion("TPCT_TZ not between", value1, value2, "tpctTz");
            return (Criteria) this;
        }

        public Criteria andTpctSgIsNull() {
            addCriterion("TPCT_SG is null");
            return (Criteria) this;
        }

        public Criteria andTpctSgIsNotNull() {
            addCriterion("TPCT_SG is not null");
            return (Criteria) this;
        }

        public Criteria andTpctSgEqualTo(String value) {
            addCriterion("TPCT_SG =", value, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctSgNotEqualTo(String value) {
            addCriterion("TPCT_SG <>", value, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctSgGreaterThan(String value) {
            addCriterion("TPCT_SG >", value, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctSgGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_SG >=", value, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctSgLessThan(String value) {
            addCriterion("TPCT_SG <", value, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctSgLessThanOrEqualTo(String value) {
            addCriterion("TPCT_SG <=", value, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctSgLike(String value) {
            addCriterion("TPCT_SG like", value, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctSgNotLike(String value) {
            addCriterion("TPCT_SG not like", value, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctSgIn(List<String> values) {
            addCriterion("TPCT_SG in", values, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctSgNotIn(List<String> values) {
            addCriterion("TPCT_SG not in", values, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctSgBetween(String value1, String value2) {
            addCriterion("TPCT_SG between", value1, value2, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctSgNotBetween(String value1, String value2) {
            addCriterion("TPCT_SG not between", value1, value2, "tpctSg");
            return (Criteria) this;
        }

        public Criteria andTpctGmywIsNull() {
            addCriterion("TPCT_GMYW is null");
            return (Criteria) this;
        }

        public Criteria andTpctGmywIsNotNull() {
            addCriterion("TPCT_GMYW is not null");
            return (Criteria) this;
        }

        public Criteria andTpctGmywEqualTo(String value) {
            addCriterion("TPCT_GMYW =", value, "tpctGmyw");
            return (Criteria) this;
        }

        public Criteria andTpctGmywNotEqualTo(String value) {
            addCriterion("TPCT_GMYW <>", value, "tpctGmyw");
            return (Criteria) this;
        }

        public Criteria andTpctGmywGreaterThan(String value) {
            addCriterion("TPCT_GMYW >", value, "tpctGmyw");
            return (Criteria) this;
        }

        public Criteria andTpctGmywGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_GMYW >=", value, "tpctGmyw");
            return (Criteria) this;
        }

        public Criteria andTpctGmywLessThan(String value) {
            addCriterion("TPCT_GMYW <", value, "tpctGmyw");
            return (Criteria) this;
        }

        public Criteria andTpctGmywLessThanOrEqualTo(String value) {
            addCriterion("TPCT_GMYW <=", value, "tpctGmyw");
            return (Criteria) this;
        }

        public Criteria andTpctGmywLike(String value) {
            addCriterion("TPCT_GMYW like", value, "tpctGmyw");
            return (Criteria) this;
        }

        public Criteria andTpctGmywNotLike(String value) {
            addCriterion("TPCT_GMYW not like", value, "tpctGmyw");
            return (Criteria) this;
        }

        public Criteria andTpctGmywIn(List<String> values) {
            addCriterion("TPCT_GMYW in", values, "tpctGmyw");
            return (Criteria) this;
        }

        public Criteria andTpctGmywNotIn(List<String> values) {
            addCriterion("TPCT_GMYW not in", values, "tpctGmyw");
            return (Criteria) this;
        }

        public Criteria andTpctGmywBetween(String value1, String value2) {
            addCriterion("TPCT_GMYW between", value1, value2, "tpctGmyw");
            return (Criteria) this;
        }

        public Criteria andTpctGmywNotBetween(String value1, String value2) {
            addCriterion("TPCT_GMYW not between", value1, value2, "tpctGmyw");
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

        public Criteria andCratNamIsNull() {
            addCriterion("CRAT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCratNamIsNotNull() {
            addCriterion("CRAT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCratNamEqualTo(String value) {
            addCriterion("CRAT_NAM =", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotEqualTo(String value) {
            addCriterion("CRAT_NAM <>", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamGreaterThan(String value) {
            addCriterion("CRAT_NAM >", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamGreaterThanOrEqualTo(String value) {
            addCriterion("CRAT_NAM >=", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamLessThan(String value) {
            addCriterion("CRAT_NAM <", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamLessThanOrEqualTo(String value) {
            addCriterion("CRAT_NAM <=", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamLike(String value) {
            addCriterion("CRAT_NAM like", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotLike(String value) {
            addCriterion("CRAT_NAM not like", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamIn(List<String> values) {
            addCriterion("CRAT_NAM in", values, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotIn(List<String> values) {
            addCriterion("CRAT_NAM not in", values, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamBetween(String value1, String value2) {
            addCriterion("CRAT_NAM between", value1, value2, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotBetween(String value1, String value2) {
            addCriterion("CRAT_NAM not between", value1, value2, "cratNam");
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

        public Criteria andUpdtNamIsNull() {
            addCriterion("UPDT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNamIsNotNull() {
            addCriterion("UPDT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNamEqualTo(String value) {
            addCriterion("UPDT_NAM =", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotEqualTo(String value) {
            addCriterion("UPDT_NAM <>", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamGreaterThan(String value) {
            addCriterion("UPDT_NAM >", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamGreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM >=", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamLessThan(String value) {
            addCriterion("UPDT_NAM <", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamLessThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM <=", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamLike(String value) {
            addCriterion("UPDT_NAM like", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotLike(String value) {
            addCriterion("UPDT_NAM not like", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamIn(List<String> values) {
            addCriterion("UPDT_NAM in", values, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotIn(List<String> values) {
            addCriterion("UPDT_NAM not in", values, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamBetween(String value1, String value2) {
            addCriterion("UPDT_NAM between", value1, value2, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotBetween(String value1, String value2) {
            addCriterion("UPDT_NAM not between", value1, value2, "updtNam");
            return (Criteria) this;
        }

        public Criteria andTpctCataIsNull() {
            addCriterion("TPCT_CATA is null");
            return (Criteria) this;
        }

        public Criteria andTpctCataIsNotNull() {
            addCriterion("TPCT_CATA is not null");
            return (Criteria) this;
        }

        public Criteria andTpctCataEqualTo(String value) {
            addCriterion("TPCT_CATA =", value, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctCataNotEqualTo(String value) {
            addCriterion("TPCT_CATA <>", value, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctCataGreaterThan(String value) {
            addCriterion("TPCT_CATA >", value, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctCataGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_CATA >=", value, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctCataLessThan(String value) {
            addCriterion("TPCT_CATA <", value, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctCataLessThanOrEqualTo(String value) {
            addCriterion("TPCT_CATA <=", value, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctCataLike(String value) {
            addCriterion("TPCT_CATA like", value, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctCataNotLike(String value) {
            addCriterion("TPCT_CATA not like", value, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctCataIn(List<String> values) {
            addCriterion("TPCT_CATA in", values, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctCataNotIn(List<String> values) {
            addCriterion("TPCT_CATA not in", values, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctCataBetween(String value1, String value2) {
            addCriterion("TPCT_CATA between", value1, value2, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctCataNotBetween(String value1, String value2) {
            addCriterion("TPCT_CATA not between", value1, value2, "tpctCata");
            return (Criteria) this;
        }

        public Criteria andTpctValueIsNull() {
            addCriterion("TPCT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andTpctValueIsNotNull() {
            addCriterion("TPCT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTpctValueEqualTo(String value) {
            addCriterion("TPCT_VALUE =", value, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctValueNotEqualTo(String value) {
            addCriterion("TPCT_VALUE <>", value, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctValueGreaterThan(String value) {
            addCriterion("TPCT_VALUE >", value, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctValueGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_VALUE >=", value, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctValueLessThan(String value) {
            addCriterion("TPCT_VALUE <", value, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctValueLessThanOrEqualTo(String value) {
            addCriterion("TPCT_VALUE <=", value, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctValueLike(String value) {
            addCriterion("TPCT_VALUE like", value, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctValueNotLike(String value) {
            addCriterion("TPCT_VALUE not like", value, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctValueIn(List<String> values) {
            addCriterion("TPCT_VALUE in", values, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctValueNotIn(List<String> values) {
            addCriterion("TPCT_VALUE not in", values, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctValueBetween(String value1, String value2) {
            addCriterion("TPCT_VALUE between", value1, value2, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctValueNotBetween(String value1, String value2) {
            addCriterion("TPCT_VALUE not between", value1, value2, "tpctValue");
            return (Criteria) this;
        }

        public Criteria andTpctTypeIsNull() {
            addCriterion("TPCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTpctTypeIsNotNull() {
            addCriterion("TPCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTpctTypeEqualTo(String value) {
            addCriterion("TPCT_TYPE =", value, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctTypeNotEqualTo(String value) {
            addCriterion("TPCT_TYPE <>", value, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctTypeGreaterThan(String value) {
            addCriterion("TPCT_TYPE >", value, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_TYPE >=", value, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctTypeLessThan(String value) {
            addCriterion("TPCT_TYPE <", value, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctTypeLessThanOrEqualTo(String value) {
            addCriterion("TPCT_TYPE <=", value, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctTypeLike(String value) {
            addCriterion("TPCT_TYPE like", value, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctTypeNotLike(String value) {
            addCriterion("TPCT_TYPE not like", value, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctTypeIn(List<String> values) {
            addCriterion("TPCT_TYPE in", values, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctTypeNotIn(List<String> values) {
            addCriterion("TPCT_TYPE not in", values, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctTypeBetween(String value1, String value2) {
            addCriterion("TPCT_TYPE between", value1, value2, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctTypeNotBetween(String value1, String value2) {
            addCriterion("TPCT_TYPE not between", value1, value2, "tpctType");
            return (Criteria) this;
        }

        public Criteria andTpctJlrIsNull() {
            addCriterion("TPCT_JLR is null");
            return (Criteria) this;
        }

        public Criteria andTpctJlrIsNotNull() {
            addCriterion("TPCT_JLR is not null");
            return (Criteria) this;
        }

        public Criteria andTpctJlrEqualTo(String value) {
            addCriterion("TPCT_JLR =", value, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctJlrNotEqualTo(String value) {
            addCriterion("TPCT_JLR <>", value, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctJlrGreaterThan(String value) {
            addCriterion("TPCT_JLR >", value, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctJlrGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_JLR >=", value, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctJlrLessThan(String value) {
            addCriterion("TPCT_JLR <", value, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctJlrLessThanOrEqualTo(String value) {
            addCriterion("TPCT_JLR <=", value, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctJlrLike(String value) {
            addCriterion("TPCT_JLR like", value, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctJlrNotLike(String value) {
            addCriterion("TPCT_JLR not like", value, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctJlrIn(List<String> values) {
            addCriterion("TPCT_JLR in", values, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctJlrNotIn(List<String> values) {
            addCriterion("TPCT_JLR not in", values, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctJlrBetween(String value1, String value2) {
            addCriterion("TPCT_JLR between", value1, value2, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctJlrNotBetween(String value1, String value2) {
            addCriterion("TPCT_JLR not between", value1, value2, "tpctJlr");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgIsNull() {
            addCriterion("TPCT_DATEFLG is null");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgIsNotNull() {
            addCriterion("TPCT_DATEFLG is not null");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgEqualTo(String value) {
            addCriterion("TPCT_DATEFLG =", value, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgNotEqualTo(String value) {
            addCriterion("TPCT_DATEFLG <>", value, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgGreaterThan(String value) {
            addCriterion("TPCT_DATEFLG >", value, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_DATEFLG >=", value, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgLessThan(String value) {
            addCriterion("TPCT_DATEFLG <", value, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgLessThanOrEqualTo(String value) {
            addCriterion("TPCT_DATEFLG <=", value, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgLike(String value) {
            addCriterion("TPCT_DATEFLG like", value, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgNotLike(String value) {
            addCriterion("TPCT_DATEFLG not like", value, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgIn(List<String> values) {
            addCriterion("TPCT_DATEFLG in", values, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgNotIn(List<String> values) {
            addCriterion("TPCT_DATEFLG not in", values, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgBetween(String value1, String value2) {
            addCriterion("TPCT_DATEFLG between", value1, value2, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctDateflgNotBetween(String value1, String value2) {
            addCriterion("TPCT_DATEFLG not between", value1, value2, "tpctDateflg");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1IsNull() {
            addCriterion("TPCT_ZDY_TYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1IsNotNull() {
            addCriterion("TPCT_ZDY_TYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1EqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE1 =", value, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE1 <>", value, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1GreaterThan(String value) {
            addCriterion("TPCT_ZDY_TYPE1 >", value, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE1 >=", value, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1LessThan(String value) {
            addCriterion("TPCT_ZDY_TYPE1 <", value, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE1 <=", value, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1Like(String value) {
            addCriterion("TPCT_ZDY_TYPE1 like", value, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1NotLike(String value) {
            addCriterion("TPCT_ZDY_TYPE1 not like", value, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1In(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE1 in", values, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE1 not in", values, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE1 between", value1, value2, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType1NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE1 not between", value1, value2, "tpctZdyType1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1IsNull() {
            addCriterion("TPCT_ZDY_VALUE1 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1IsNotNull() {
            addCriterion("TPCT_ZDY_VALUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1EqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE1 =", value, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE1 <>", value, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1GreaterThan(String value) {
            addCriterion("TPCT_ZDY_VALUE1 >", value, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE1 >=", value, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1LessThan(String value) {
            addCriterion("TPCT_ZDY_VALUE1 <", value, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE1 <=", value, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1Like(String value) {
            addCriterion("TPCT_ZDY_VALUE1 like", value, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1NotLike(String value) {
            addCriterion("TPCT_ZDY_VALUE1 not like", value, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1In(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE1 in", values, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE1 not in", values, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE1 between", value1, value2, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue1NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE1 not between", value1, value2, "tpctZdyValue1");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2IsNull() {
            addCriterion("TPCT_ZDY_TYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2IsNotNull() {
            addCriterion("TPCT_ZDY_TYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2EqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE2 =", value, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE2 <>", value, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2GreaterThan(String value) {
            addCriterion("TPCT_ZDY_TYPE2 >", value, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE2 >=", value, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2LessThan(String value) {
            addCriterion("TPCT_ZDY_TYPE2 <", value, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE2 <=", value, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2Like(String value) {
            addCriterion("TPCT_ZDY_TYPE2 like", value, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2NotLike(String value) {
            addCriterion("TPCT_ZDY_TYPE2 not like", value, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2In(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE2 in", values, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE2 not in", values, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE2 between", value1, value2, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType2NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE2 not between", value1, value2, "tpctZdyType2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2IsNull() {
            addCriterion("TPCT_ZDY_VALUE2 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2IsNotNull() {
            addCriterion("TPCT_ZDY_VALUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2EqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE2 =", value, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE2 <>", value, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2GreaterThan(String value) {
            addCriterion("TPCT_ZDY_VALUE2 >", value, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE2 >=", value, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2LessThan(String value) {
            addCriterion("TPCT_ZDY_VALUE2 <", value, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE2 <=", value, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2Like(String value) {
            addCriterion("TPCT_ZDY_VALUE2 like", value, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2NotLike(String value) {
            addCriterion("TPCT_ZDY_VALUE2 not like", value, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2In(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE2 in", values, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE2 not in", values, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE2 between", value1, value2, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue2NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE2 not between", value1, value2, "tpctZdyValue2");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3IsNull() {
            addCriterion("TPCT_ZDY_TYPE3 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3IsNotNull() {
            addCriterion("TPCT_ZDY_TYPE3 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3EqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE3 =", value, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE3 <>", value, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3GreaterThan(String value) {
            addCriterion("TPCT_ZDY_TYPE3 >", value, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE3 >=", value, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3LessThan(String value) {
            addCriterion("TPCT_ZDY_TYPE3 <", value, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE3 <=", value, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3Like(String value) {
            addCriterion("TPCT_ZDY_TYPE3 like", value, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3NotLike(String value) {
            addCriterion("TPCT_ZDY_TYPE3 not like", value, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3In(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE3 in", values, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE3 not in", values, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE3 between", value1, value2, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType3NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE3 not between", value1, value2, "tpctZdyType3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3IsNull() {
            addCriterion("TPCT_ZDY_VALUE3 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3IsNotNull() {
            addCriterion("TPCT_ZDY_VALUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3EqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE3 =", value, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE3 <>", value, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3GreaterThan(String value) {
            addCriterion("TPCT_ZDY_VALUE3 >", value, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE3 >=", value, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3LessThan(String value) {
            addCriterion("TPCT_ZDY_VALUE3 <", value, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE3 <=", value, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3Like(String value) {
            addCriterion("TPCT_ZDY_VALUE3 like", value, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3NotLike(String value) {
            addCriterion("TPCT_ZDY_VALUE3 not like", value, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3In(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE3 in", values, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE3 not in", values, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE3 between", value1, value2, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue3NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE3 not between", value1, value2, "tpctZdyValue3");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4IsNull() {
            addCriterion("TPCT_ZDY_TYPE4 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4IsNotNull() {
            addCriterion("TPCT_ZDY_TYPE4 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4EqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE4 =", value, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE4 <>", value, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4GreaterThan(String value) {
            addCriterion("TPCT_ZDY_TYPE4 >", value, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE4 >=", value, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4LessThan(String value) {
            addCriterion("TPCT_ZDY_TYPE4 <", value, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE4 <=", value, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4Like(String value) {
            addCriterion("TPCT_ZDY_TYPE4 like", value, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4NotLike(String value) {
            addCriterion("TPCT_ZDY_TYPE4 not like", value, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4In(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE4 in", values, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE4 not in", values, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE4 between", value1, value2, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType4NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE4 not between", value1, value2, "tpctZdyType4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4IsNull() {
            addCriterion("TPCT_ZDY_VALUE4 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4IsNotNull() {
            addCriterion("TPCT_ZDY_VALUE4 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4EqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE4 =", value, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE4 <>", value, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4GreaterThan(String value) {
            addCriterion("TPCT_ZDY_VALUE4 >", value, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE4 >=", value, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4LessThan(String value) {
            addCriterion("TPCT_ZDY_VALUE4 <", value, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE4 <=", value, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4Like(String value) {
            addCriterion("TPCT_ZDY_VALUE4 like", value, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4NotLike(String value) {
            addCriterion("TPCT_ZDY_VALUE4 not like", value, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4In(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE4 in", values, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE4 not in", values, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE4 between", value1, value2, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue4NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE4 not between", value1, value2, "tpctZdyValue4");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5IsNull() {
            addCriterion("TPCT_ZDY_TYPE5 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5IsNotNull() {
            addCriterion("TPCT_ZDY_TYPE5 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5EqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE5 =", value, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE5 <>", value, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5GreaterThan(String value) {
            addCriterion("TPCT_ZDY_TYPE5 >", value, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE5 >=", value, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5LessThan(String value) {
            addCriterion("TPCT_ZDY_TYPE5 <", value, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE5 <=", value, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5Like(String value) {
            addCriterion("TPCT_ZDY_TYPE5 like", value, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5NotLike(String value) {
            addCriterion("TPCT_ZDY_TYPE5 not like", value, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5In(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE5 in", values, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE5 not in", values, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE5 between", value1, value2, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType5NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE5 not between", value1, value2, "tpctZdyType5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5IsNull() {
            addCriterion("TPCT_ZDY_VALUE5 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5IsNotNull() {
            addCriterion("TPCT_ZDY_VALUE5 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5EqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE5 =", value, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE5 <>", value, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5GreaterThan(String value) {
            addCriterion("TPCT_ZDY_VALUE5 >", value, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE5 >=", value, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5LessThan(String value) {
            addCriterion("TPCT_ZDY_VALUE5 <", value, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE5 <=", value, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5Like(String value) {
            addCriterion("TPCT_ZDY_VALUE5 like", value, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5NotLike(String value) {
            addCriterion("TPCT_ZDY_VALUE5 not like", value, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5In(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE5 in", values, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE5 not in", values, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE5 between", value1, value2, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue5NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE5 not between", value1, value2, "tpctZdyValue5");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodIsNull() {
            addCriterion("TPCT_XT_COD is null");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodIsNotNull() {
            addCriterion("TPCT_XT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodEqualTo(String value) {
            addCriterion("TPCT_XT_COD =", value, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodNotEqualTo(String value) {
            addCriterion("TPCT_XT_COD <>", value, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodGreaterThan(String value) {
            addCriterion("TPCT_XT_COD >", value, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_XT_COD >=", value, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodLessThan(String value) {
            addCriterion("TPCT_XT_COD <", value, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodLessThanOrEqualTo(String value) {
            addCriterion("TPCT_XT_COD <=", value, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodLike(String value) {
            addCriterion("TPCT_XT_COD like", value, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodNotLike(String value) {
            addCriterion("TPCT_XT_COD not like", value, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodIn(List<String> values) {
            addCriterion("TPCT_XT_COD in", values, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodNotIn(List<String> values) {
            addCriterion("TPCT_XT_COD not in", values, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodBetween(String value1, String value2) {
            addCriterion("TPCT_XT_COD between", value1, value2, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtCodNotBetween(String value1, String value2) {
            addCriterion("TPCT_XT_COD not between", value1, value2, "tpctXtCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgIsNull() {
            addCriterion("TPCT_XT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgIsNotNull() {
            addCriterion("TPCT_XT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgEqualTo(String value) {
            addCriterion("TPCT_XT_FLG =", value, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgNotEqualTo(String value) {
            addCriterion("TPCT_XT_FLG <>", value, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgGreaterThan(String value) {
            addCriterion("TPCT_XT_FLG >", value, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_XT_FLG >=", value, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgLessThan(String value) {
            addCriterion("TPCT_XT_FLG <", value, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgLessThanOrEqualTo(String value) {
            addCriterion("TPCT_XT_FLG <=", value, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgLike(String value) {
            addCriterion("TPCT_XT_FLG like", value, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgNotLike(String value) {
            addCriterion("TPCT_XT_FLG not like", value, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgIn(List<String> values) {
            addCriterion("TPCT_XT_FLG in", values, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgNotIn(List<String> values) {
            addCriterion("TPCT_XT_FLG not in", values, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgBetween(String value1, String value2) {
            addCriterion("TPCT_XT_FLG between", value1, value2, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXtFlgNotBetween(String value1, String value2) {
            addCriterion("TPCT_XT_FLG not between", value1, value2, "tpctXtFlg");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodIsNull() {
            addCriterion("TPCT_SJMC_COD is null");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodIsNotNull() {
            addCriterion("TPCT_SJMC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodEqualTo(String value) {
            addCriterion("TPCT_SJMC_COD =", value, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodNotEqualTo(String value) {
            addCriterion("TPCT_SJMC_COD <>", value, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodGreaterThan(String value) {
            addCriterion("TPCT_SJMC_COD >", value, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_SJMC_COD >=", value, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodLessThan(String value) {
            addCriterion("TPCT_SJMC_COD <", value, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodLessThanOrEqualTo(String value) {
            addCriterion("TPCT_SJMC_COD <=", value, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodLike(String value) {
            addCriterion("TPCT_SJMC_COD like", value, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodNotLike(String value) {
            addCriterion("TPCT_SJMC_COD not like", value, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodIn(List<String> values) {
            addCriterion("TPCT_SJMC_COD in", values, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodNotIn(List<String> values) {
            addCriterion("TPCT_SJMC_COD not in", values, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodBetween(String value1, String value2) {
            addCriterion("TPCT_SJMC_COD between", value1, value2, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctSjmcCodNotBetween(String value1, String value2) {
            addCriterion("TPCT_SJMC_COD not between", value1, value2, "tpctSjmcCod");
            return (Criteria) this;
        }

        public Criteria andTpctXtIsNull() {
            addCriterion("TPCT_XT is null");
            return (Criteria) this;
        }

        public Criteria andTpctXtIsNotNull() {
            addCriterion("TPCT_XT is not null");
            return (Criteria) this;
        }

        public Criteria andTpctXtEqualTo(BigDecimal value) {
            addCriterion("TPCT_XT =", value, "tpctXt");
            return (Criteria) this;
        }

        public Criteria andTpctXtNotEqualTo(BigDecimal value) {
            addCriterion("TPCT_XT <>", value, "tpctXt");
            return (Criteria) this;
        }

        public Criteria andTpctXtGreaterThan(BigDecimal value) {
            addCriterion("TPCT_XT >", value, "tpctXt");
            return (Criteria) this;
        }

        public Criteria andTpctXtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TPCT_XT >=", value, "tpctXt");
            return (Criteria) this;
        }

        public Criteria andTpctXtLessThan(BigDecimal value) {
            addCriterion("TPCT_XT <", value, "tpctXt");
            return (Criteria) this;
        }

        public Criteria andTpctXtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TPCT_XT <=", value, "tpctXt");
            return (Criteria) this;
        }

        public Criteria andTpctXtIn(List<BigDecimal> values) {
            addCriterion("TPCT_XT in", values, "tpctXt");
            return (Criteria) this;
        }

        public Criteria andTpctXtNotIn(List<BigDecimal> values) {
            addCriterion("TPCT_XT not in", values, "tpctXt");
            return (Criteria) this;
        }

        public Criteria andTpctXtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TPCT_XT between", value1, value2, "tpctXt");
            return (Criteria) this;
        }

        public Criteria andTpctXtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TPCT_XT not between", value1, value2, "tpctXt");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgIsNull() {
            addCriterion("TPCT_NL_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgIsNotNull() {
            addCriterion("TPCT_NL_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgEqualTo(String value) {
            addCriterion("TPCT_NL_FLG =", value, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgNotEqualTo(String value) {
            addCriterion("TPCT_NL_FLG <>", value, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgGreaterThan(String value) {
            addCriterion("TPCT_NL_FLG >", value, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_NL_FLG >=", value, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgLessThan(String value) {
            addCriterion("TPCT_NL_FLG <", value, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgLessThanOrEqualTo(String value) {
            addCriterion("TPCT_NL_FLG <=", value, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgLike(String value) {
            addCriterion("TPCT_NL_FLG like", value, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgNotLike(String value) {
            addCriterion("TPCT_NL_FLG not like", value, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgIn(List<String> values) {
            addCriterion("TPCT_NL_FLG in", values, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgNotIn(List<String> values) {
            addCriterion("TPCT_NL_FLG not in", values, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgBetween(String value1, String value2) {
            addCriterion("TPCT_NL_FLG between", value1, value2, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctNlFlgNotBetween(String value1, String value2) {
            addCriterion("TPCT_NL_FLG not between", value1, value2, "tpctNlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgIsNull() {
            addCriterion("TPCT_RL_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgIsNotNull() {
            addCriterion("TPCT_RL_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgEqualTo(String value) {
            addCriterion("TPCT_RL_FLG =", value, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgNotEqualTo(String value) {
            addCriterion("TPCT_RL_FLG <>", value, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgGreaterThan(String value) {
            addCriterion("TPCT_RL_FLG >", value, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_RL_FLG >=", value, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgLessThan(String value) {
            addCriterion("TPCT_RL_FLG <", value, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgLessThanOrEqualTo(String value) {
            addCriterion("TPCT_RL_FLG <=", value, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgLike(String value) {
            addCriterion("TPCT_RL_FLG like", value, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgNotLike(String value) {
            addCriterion("TPCT_RL_FLG not like", value, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgIn(List<String> values) {
            addCriterion("TPCT_RL_FLG in", values, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgNotIn(List<String> values) {
            addCriterion("TPCT_RL_FLG not in", values, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgBetween(String value1, String value2) {
            addCriterion("TPCT_RL_FLG between", value1, value2, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctRlFlgNotBetween(String value1, String value2) {
            addCriterion("TPCT_RL_FLG not between", value1, value2, "tpctRlFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgIsNull() {
            addCriterion("TPCT_CL_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgIsNotNull() {
            addCriterion("TPCT_CL_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgEqualTo(String value) {
            addCriterion("TPCT_CL_FLG =", value, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgNotEqualTo(String value) {
            addCriterion("TPCT_CL_FLG <>", value, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgGreaterThan(String value) {
            addCriterion("TPCT_CL_FLG >", value, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_CL_FLG >=", value, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgLessThan(String value) {
            addCriterion("TPCT_CL_FLG <", value, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgLessThanOrEqualTo(String value) {
            addCriterion("TPCT_CL_FLG <=", value, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgLike(String value) {
            addCriterion("TPCT_CL_FLG like", value, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgNotLike(String value) {
            addCriterion("TPCT_CL_FLG not like", value, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgIn(List<String> values) {
            addCriterion("TPCT_CL_FLG in", values, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgNotIn(List<String> values) {
            addCriterion("TPCT_CL_FLG not in", values, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgBetween(String value1, String value2) {
            addCriterion("TPCT_CL_FLG between", value1, value2, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctClFlgNotBetween(String value1, String value2) {
            addCriterion("TPCT_CL_FLG not between", value1, value2, "tpctClFlg");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodIsNull() {
            addCriterion("TPCT_XL_COD is null");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodIsNotNull() {
            addCriterion("TPCT_XL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodEqualTo(String value) {
            addCriterion("TPCT_XL_COD =", value, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodNotEqualTo(String value) {
            addCriterion("TPCT_XL_COD <>", value, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodGreaterThan(String value) {
            addCriterion("TPCT_XL_COD >", value, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodGreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_XL_COD >=", value, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodLessThan(String value) {
            addCriterion("TPCT_XL_COD <", value, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodLessThanOrEqualTo(String value) {
            addCriterion("TPCT_XL_COD <=", value, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodLike(String value) {
            addCriterion("TPCT_XL_COD like", value, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodNotLike(String value) {
            addCriterion("TPCT_XL_COD not like", value, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodIn(List<String> values) {
            addCriterion("TPCT_XL_COD in", values, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodNotIn(List<String> values) {
            addCriterion("TPCT_XL_COD not in", values, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodBetween(String value1, String value2) {
            addCriterion("TPCT_XL_COD between", value1, value2, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctXlCodNotBetween(String value1, String value2) {
            addCriterion("TPCT_XL_COD not between", value1, value2, "tpctXlCod");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6IsNull() {
            addCriterion("TPCT_ZDY_TYPE6 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6IsNotNull() {
            addCriterion("TPCT_ZDY_TYPE6 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6EqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE6 =", value, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE6 <>", value, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6GreaterThan(String value) {
            addCriterion("TPCT_ZDY_TYPE6 >", value, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE6 >=", value, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6LessThan(String value) {
            addCriterion("TPCT_ZDY_TYPE6 <", value, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_TYPE6 <=", value, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6Like(String value) {
            addCriterion("TPCT_ZDY_TYPE6 like", value, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6NotLike(String value) {
            addCriterion("TPCT_ZDY_TYPE6 not like", value, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6In(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE6 in", values, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_TYPE6 not in", values, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE6 between", value1, value2, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyType6NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_TYPE6 not between", value1, value2, "tpctZdyType6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6IsNull() {
            addCriterion("TPCT_ZDY_VALUE6 is null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6IsNotNull() {
            addCriterion("TPCT_ZDY_VALUE6 is not null");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6EqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE6 =", value, "tpctZdyValue6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6NotEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE6 <>", value, "tpctZdyValue6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6GreaterThan(String value) {
            addCriterion("TPCT_ZDY_VALUE6 >", value, "tpctZdyValue6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6GreaterThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE6 >=", value, "tpctZdyValue6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6LessThan(String value) {
            addCriterion("TPCT_ZDY_VALUE6 <", value, "tpctZdyValue6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6LessThanOrEqualTo(String value) {
            addCriterion("TPCT_ZDY_VALUE6 <=", value, "tpctZdyValue6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6Like(String value) {
            addCriterion("TPCT_ZDY_VALUE6 like", value, "tpctZdyValue6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6NotLike(String value) {
            addCriterion("TPCT_ZDY_VALUE6 not like", value, "tpctZdyValue6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6In(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE6 in", values, "tpctZdyValue6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6NotIn(List<String> values) {
            addCriterion("TPCT_ZDY_VALUE6 not in", values, "tpctZdyValue6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6Between(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE6 between", value1, value2, "tpctZdyValue6");
            return (Criteria) this;
        }

        public Criteria andTpctZdyValue6NotBetween(String value1, String value2) {
            addCriterion("TPCT_ZDY_VALUE6 not between", value1, value2, "tpctZdyValue6");
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