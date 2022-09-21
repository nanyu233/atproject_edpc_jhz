package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspJzbrjjInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJzbrjjInfExample() {
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

        public Criteria andJzbrjjSeqIsNull() {
            addCriterion("JZBRJJ_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqIsNotNull() {
            addCriterion("JZBRJJ_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqEqualTo(String value) {
            addCriterion("JZBRJJ_SEQ =", value, "jzbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqNotEqualTo(String value) {
            addCriterion("JZBRJJ_SEQ <>", value, "jzbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqGreaterThan(String value) {
            addCriterion("JZBRJJ_SEQ >", value, "jzbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SEQ >=", value, "jzbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqLessThan(String value) {
            addCriterion("JZBRJJ_SEQ <", value, "jzbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SEQ <=", value, "jzbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqLike(String value) {
            addCriterion("JZBRJJ_SEQ like", value, "jzbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqNotLike(String value) {
            addCriterion("JZBRJJ_SEQ not like", value, "jzbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqIn(List<String> values) {
            addCriterion("JZBRJJ_SEQ in", values, "jzbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqNotIn(List<String> values) {
            addCriterion("JZBRJJ_SEQ not in", values, "jzbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SEQ between", value1, value2, "jzbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSeqNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SEQ not between", value1, value2, "jzbrjjSeq");
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

        public Criteria andJzbrjjDatIsNull() {
            addCriterion("JZBRJJ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDatIsNotNull() {
            addCriterion("JZBRJJ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDatEqualTo(Date value) {
            addCriterion("JZBRJJ_DAT =", value, "jzbrjjDat");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDatNotEqualTo(Date value) {
            addCriterion("JZBRJJ_DAT <>", value, "jzbrjjDat");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDatGreaterThan(Date value) {
            addCriterion("JZBRJJ_DAT >", value, "jzbrjjDat");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDatGreaterThanOrEqualTo(Date value) {
            addCriterion("JZBRJJ_DAT >=", value, "jzbrjjDat");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDatLessThan(Date value) {
            addCriterion("JZBRJJ_DAT <", value, "jzbrjjDat");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDatLessThanOrEqualTo(Date value) {
            addCriterion("JZBRJJ_DAT <=", value, "jzbrjjDat");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDatIn(List<Date> values) {
            addCriterion("JZBRJJ_DAT in", values, "jzbrjjDat");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDatNotIn(List<Date> values) {
            addCriterion("JZBRJJ_DAT not in", values, "jzbrjjDat");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDatBetween(Date value1, Date value2) {
            addCriterion("JZBRJJ_DAT between", value1, value2, "jzbrjjDat");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDatNotBetween(Date value1, Date value2) {
            addCriterion("JZBRJJ_DAT not between", value1, value2, "jzbrjjDat");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodIsNull() {
            addCriterion("JZBRJJ_SZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodIsNotNull() {
            addCriterion("JZBRJJ_SZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodEqualTo(String value) {
            addCriterion("JZBRJJ_SZ_COD =", value, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodNotEqualTo(String value) {
            addCriterion("JZBRJJ_SZ_COD <>", value, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodGreaterThan(String value) {
            addCriterion("JZBRJJ_SZ_COD >", value, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SZ_COD >=", value, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodLessThan(String value) {
            addCriterion("JZBRJJ_SZ_COD <", value, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SZ_COD <=", value, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodLike(String value) {
            addCriterion("JZBRJJ_SZ_COD like", value, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodNotLike(String value) {
            addCriterion("JZBRJJ_SZ_COD not like", value, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodIn(List<String> values) {
            addCriterion("JZBRJJ_SZ_COD in", values, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodNotIn(List<String> values) {
            addCriterion("JZBRJJ_SZ_COD not in", values, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SZ_COD between", value1, value2, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSzCodNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SZ_COD not between", value1, value2, "jzbrjjSzCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzIsNull() {
            addCriterion("JZBRJJ_TKZ is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzIsNotNull() {
            addCriterion("JZBRJJ_TKZ is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzEqualTo(String value) {
            addCriterion("JZBRJJ_TKZ =", value, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzNotEqualTo(String value) {
            addCriterion("JZBRJJ_TKZ <>", value, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzGreaterThan(String value) {
            addCriterion("JZBRJJ_TKZ >", value, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_TKZ >=", value, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzLessThan(String value) {
            addCriterion("JZBRJJ_TKZ <", value, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_TKZ <=", value, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzLike(String value) {
            addCriterion("JZBRJJ_TKZ like", value, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzNotLike(String value) {
            addCriterion("JZBRJJ_TKZ not like", value, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzIn(List<String> values) {
            addCriterion("JZBRJJ_TKZ in", values, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzNotIn(List<String> values) {
            addCriterion("JZBRJJ_TKZ not in", values, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzBetween(String value1, String value2) {
            addCriterion("JZBRJJ_TKZ between", value1, value2, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkzNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_TKZ not between", value1, value2, "jzbrjjTkz");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyIsNull() {
            addCriterion("JZBRJJ_TKY is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyIsNotNull() {
            addCriterion("JZBRJJ_TKY is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyEqualTo(String value) {
            addCriterion("JZBRJJ_TKY =", value, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyNotEqualTo(String value) {
            addCriterion("JZBRJJ_TKY <>", value, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyGreaterThan(String value) {
            addCriterion("JZBRJJ_TKY >", value, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_TKY >=", value, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyLessThan(String value) {
            addCriterion("JZBRJJ_TKY <", value, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_TKY <=", value, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyLike(String value) {
            addCriterion("JZBRJJ_TKY like", value, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyNotLike(String value) {
            addCriterion("JZBRJJ_TKY not like", value, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyIn(List<String> values) {
            addCriterion("JZBRJJ_TKY in", values, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyNotIn(List<String> values) {
            addCriterion("JZBRJJ_TKY not in", values, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyBetween(String value1, String value2) {
            addCriterion("JZBRJJ_TKY between", value1, value2, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTkyNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_TKY not between", value1, value2, "jzbrjjTky");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodIsNull() {
            addCriterion("JZBRJJ_DGFY_COD is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodIsNotNull() {
            addCriterion("JZBRJJ_DGFY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodEqualTo(String value) {
            addCriterion("JZBRJJ_DGFY_COD =", value, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodNotEqualTo(String value) {
            addCriterion("JZBRJJ_DGFY_COD <>", value, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodGreaterThan(String value) {
            addCriterion("JZBRJJ_DGFY_COD >", value, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_DGFY_COD >=", value, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodLessThan(String value) {
            addCriterion("JZBRJJ_DGFY_COD <", value, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_DGFY_COD <=", value, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodLike(String value) {
            addCriterion("JZBRJJ_DGFY_COD like", value, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodNotLike(String value) {
            addCriterion("JZBRJJ_DGFY_COD not like", value, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodIn(List<String> values) {
            addCriterion("JZBRJJ_DGFY_COD in", values, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodNotIn(List<String> values) {
            addCriterion("JZBRJJ_DGFY_COD not in", values, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodBetween(String value1, String value2) {
            addCriterion("JZBRJJ_DGFY_COD between", value1, value2, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDgfyCodNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_DGFY_COD not between", value1, value2, "jzbrjjDgfyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwIsNull() {
            addCriterion("JZBRJJ_TW is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwIsNotNull() {
            addCriterion("JZBRJJ_TW is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_TW =", value, "jzbrjjTw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwNotEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_TW <>", value, "jzbrjjTw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwGreaterThan(BigDecimal value) {
            addCriterion("JZBRJJ_TW >", value, "jzbrjjTw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_TW >=", value, "jzbrjjTw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwLessThan(BigDecimal value) {
            addCriterion("JZBRJJ_TW <", value, "jzbrjjTw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_TW <=", value, "jzbrjjTw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwIn(List<BigDecimal> values) {
            addCriterion("JZBRJJ_TW in", values, "jzbrjjTw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwNotIn(List<BigDecimal> values) {
            addCriterion("JZBRJJ_TW not in", values, "jzbrjjTw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZBRJJ_TW between", value1, value2, "jzbrjjTw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZBRJJ_TW not between", value1, value2, "jzbrjjTw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbIsNull() {
            addCriterion("JZBRJJ_MB is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbIsNotNull() {
            addCriterion("JZBRJJ_MB is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbEqualTo(Short value) {
            addCriterion("JZBRJJ_MB =", value, "jzbrjjMb");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbNotEqualTo(Short value) {
            addCriterion("JZBRJJ_MB <>", value, "jzbrjjMb");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbGreaterThan(Short value) {
            addCriterion("JZBRJJ_MB >", value, "jzbrjjMb");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbGreaterThanOrEqualTo(Short value) {
            addCriterion("JZBRJJ_MB >=", value, "jzbrjjMb");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbLessThan(Short value) {
            addCriterion("JZBRJJ_MB <", value, "jzbrjjMb");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbLessThanOrEqualTo(Short value) {
            addCriterion("JZBRJJ_MB <=", value, "jzbrjjMb");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbIn(List<Short> values) {
            addCriterion("JZBRJJ_MB in", values, "jzbrjjMb");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbNotIn(List<Short> values) {
            addCriterion("JZBRJJ_MB not in", values, "jzbrjjMb");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbBetween(Short value1, Short value2) {
            addCriterion("JZBRJJ_MB between", value1, value2, "jzbrjjMb");
            return (Criteria) this;
        }

        public Criteria andJzbrjjMbNotBetween(Short value1, Short value2) {
            addCriterion("JZBRJJ_MB not between", value1, value2, "jzbrjjMb");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxIsNull() {
            addCriterion("JZBRJJ_HX is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxIsNotNull() {
            addCriterion("JZBRJJ_HX is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxEqualTo(Short value) {
            addCriterion("JZBRJJ_HX =", value, "jzbrjjHx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxNotEqualTo(Short value) {
            addCriterion("JZBRJJ_HX <>", value, "jzbrjjHx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxGreaterThan(Short value) {
            addCriterion("JZBRJJ_HX >", value, "jzbrjjHx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxGreaterThanOrEqualTo(Short value) {
            addCriterion("JZBRJJ_HX >=", value, "jzbrjjHx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxLessThan(Short value) {
            addCriterion("JZBRJJ_HX <", value, "jzbrjjHx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxLessThanOrEqualTo(Short value) {
            addCriterion("JZBRJJ_HX <=", value, "jzbrjjHx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxIn(List<Short> values) {
            addCriterion("JZBRJJ_HX in", values, "jzbrjjHx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxNotIn(List<Short> values) {
            addCriterion("JZBRJJ_HX not in", values, "jzbrjjHx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxBetween(Short value1, Short value2) {
            addCriterion("JZBRJJ_HX between", value1, value2, "jzbrjjHx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjHxNotBetween(Short value1, Short value2) {
            addCriterion("JZBRJJ_HX not between", value1, value2, "jzbrjjHx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpIsNull() {
            addCriterion("JZBRJJ_BP_UP is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpIsNotNull() {
            addCriterion("JZBRJJ_BP_UP is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpEqualTo(Short value) {
            addCriterion("JZBRJJ_BP_UP =", value, "jzbrjjBpUp");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpNotEqualTo(Short value) {
            addCriterion("JZBRJJ_BP_UP <>", value, "jzbrjjBpUp");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpGreaterThan(Short value) {
            addCriterion("JZBRJJ_BP_UP >", value, "jzbrjjBpUp");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpGreaterThanOrEqualTo(Short value) {
            addCriterion("JZBRJJ_BP_UP >=", value, "jzbrjjBpUp");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpLessThan(Short value) {
            addCriterion("JZBRJJ_BP_UP <", value, "jzbrjjBpUp");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpLessThanOrEqualTo(Short value) {
            addCriterion("JZBRJJ_BP_UP <=", value, "jzbrjjBpUp");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpIn(List<Short> values) {
            addCriterion("JZBRJJ_BP_UP in", values, "jzbrjjBpUp");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpNotIn(List<Short> values) {
            addCriterion("JZBRJJ_BP_UP not in", values, "jzbrjjBpUp");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpBetween(Short value1, Short value2) {
            addCriterion("JZBRJJ_BP_UP between", value1, value2, "jzbrjjBpUp");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpUpNotBetween(Short value1, Short value2) {
            addCriterion("JZBRJJ_BP_UP not between", value1, value2, "jzbrjjBpUp");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2IsNull() {
            addCriterion("JZBRJJ_SAO2 is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2IsNotNull() {
            addCriterion("JZBRJJ_SAO2 is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2EqualTo(Short value) {
            addCriterion("JZBRJJ_SAO2 =", value, "jzbrjjSao2");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2NotEqualTo(Short value) {
            addCriterion("JZBRJJ_SAO2 <>", value, "jzbrjjSao2");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2GreaterThan(Short value) {
            addCriterion("JZBRJJ_SAO2 >", value, "jzbrjjSao2");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2GreaterThanOrEqualTo(Short value) {
            addCriterion("JZBRJJ_SAO2 >=", value, "jzbrjjSao2");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2LessThan(Short value) {
            addCriterion("JZBRJJ_SAO2 <", value, "jzbrjjSao2");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2LessThanOrEqualTo(Short value) {
            addCriterion("JZBRJJ_SAO2 <=", value, "jzbrjjSao2");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2In(List<Short> values) {
            addCriterion("JZBRJJ_SAO2 in", values, "jzbrjjSao2");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2NotIn(List<Short> values) {
            addCriterion("JZBRJJ_SAO2 not in", values, "jzbrjjSao2");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2Between(Short value1, Short value2) {
            addCriterion("JZBRJJ_SAO2 between", value1, value2, "jzbrjjSao2");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSao2NotBetween(Short value1, Short value2) {
            addCriterion("JZBRJJ_SAO2 not between", value1, value2, "jzbrjjSao2");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodIsNull() {
            addCriterion("JZBRJJ_YZJC_COD is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodIsNotNull() {
            addCriterion("JZBRJJ_YZJC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodEqualTo(String value) {
            addCriterion("JZBRJJ_YZJC_COD =", value, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodNotEqualTo(String value) {
            addCriterion("JZBRJJ_YZJC_COD <>", value, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodGreaterThan(String value) {
            addCriterion("JZBRJJ_YZJC_COD >", value, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZJC_COD >=", value, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodLessThan(String value) {
            addCriterion("JZBRJJ_YZJC_COD <", value, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZJC_COD <=", value, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodLike(String value) {
            addCriterion("JZBRJJ_YZJC_COD like", value, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodNotLike(String value) {
            addCriterion("JZBRJJ_YZJC_COD not like", value, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodIn(List<String> values) {
            addCriterion("JZBRJJ_YZJC_COD in", values, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodNotIn(List<String> values) {
            addCriterion("JZBRJJ_YZJC_COD not in", values, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZJC_COD between", value1, value2, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzjcCodNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZJC_COD not between", value1, value2, "jzbrjjYzjcCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgIsNull() {
            addCriterion("JZBRJJ_SPJBG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgIsNotNull() {
            addCriterion("JZBRJJ_SPJBG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgEqualTo(String value) {
            addCriterion("JZBRJJ_SPJBG_FLG =", value, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_SPJBG_FLG <>", value, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_SPJBG_FLG >", value, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SPJBG_FLG >=", value, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgLessThan(String value) {
            addCriterion("JZBRJJ_SPJBG_FLG <", value, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SPJBG_FLG <=", value, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgLike(String value) {
            addCriterion("JZBRJJ_SPJBG_FLG like", value, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgNotLike(String value) {
            addCriterion("JZBRJJ_SPJBG_FLG not like", value, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgIn(List<String> values) {
            addCriterion("JZBRJJ_SPJBG_FLG in", values, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_SPJBG_FLG not in", values, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SPJBG_FLG between", value1, value2, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SPJBG_FLG not between", value1, value2, "jzbrjjSpjbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZIsNull() {
            addCriterion("JZBRJJ_SPJBG_Z is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZIsNotNull() {
            addCriterion("JZBRJJ_SPJBG_Z is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_SPJBG_Z =", value, "jzbrjjSpjbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZNotEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_SPJBG_Z <>", value, "jzbrjjSpjbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZGreaterThan(BigDecimal value) {
            addCriterion("JZBRJJ_SPJBG_Z >", value, "jzbrjjSpjbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_SPJBG_Z >=", value, "jzbrjjSpjbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZLessThan(BigDecimal value) {
            addCriterion("JZBRJJ_SPJBG_Z <", value, "jzbrjjSpjbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_SPJBG_Z <=", value, "jzbrjjSpjbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZIn(List<BigDecimal> values) {
            addCriterion("JZBRJJ_SPJBG_Z in", values, "jzbrjjSpjbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZNotIn(List<BigDecimal> values) {
            addCriterion("JZBRJJ_SPJBG_Z not in", values, "jzbrjjSpjbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZBRJJ_SPJBG_Z between", value1, value2, "jzbrjjSpjbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSpjbgZNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZBRJJ_SPJBG_Z not between", value1, value2, "jzbrjjSpjbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodIsNull() {
            addCriterion("JZBRJJ_YZHY_COD is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodIsNotNull() {
            addCriterion("JZBRJJ_YZHY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodEqualTo(String value) {
            addCriterion("JZBRJJ_YZHY_COD =", value, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodNotEqualTo(String value) {
            addCriterion("JZBRJJ_YZHY_COD <>", value, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodGreaterThan(String value) {
            addCriterion("JZBRJJ_YZHY_COD >", value, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZHY_COD >=", value, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodLessThan(String value) {
            addCriterion("JZBRJJ_YZHY_COD <", value, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZHY_COD <=", value, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodLike(String value) {
            addCriterion("JZBRJJ_YZHY_COD like", value, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodNotLike(String value) {
            addCriterion("JZBRJJ_YZHY_COD not like", value, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodIn(List<String> values) {
            addCriterion("JZBRJJ_YZHY_COD in", values, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodNotIn(List<String> values) {
            addCriterion("JZBRJJ_YZHY_COD not in", values, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZHY_COD between", value1, value2, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyCodNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZHY_COD not between", value1, value2, "jzbrjjYzhyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtIsNull() {
            addCriterion("JZBRJJ_YZHY_QT is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtIsNotNull() {
            addCriterion("JZBRJJ_YZHY_QT is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtEqualTo(String value) {
            addCriterion("JZBRJJ_YZHY_QT =", value, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtNotEqualTo(String value) {
            addCriterion("JZBRJJ_YZHY_QT <>", value, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtGreaterThan(String value) {
            addCriterion("JZBRJJ_YZHY_QT >", value, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZHY_QT >=", value, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtLessThan(String value) {
            addCriterion("JZBRJJ_YZHY_QT <", value, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZHY_QT <=", value, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtLike(String value) {
            addCriterion("JZBRJJ_YZHY_QT like", value, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtNotLike(String value) {
            addCriterion("JZBRJJ_YZHY_QT not like", value, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtIn(List<String> values) {
            addCriterion("JZBRJJ_YZHY_QT in", values, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtNotIn(List<String> values) {
            addCriterion("JZBRJJ_YZHY_QT not in", values, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZHY_QT between", value1, value2, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzhyQtNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZHY_QT not between", value1, value2, "jzbrjjYzhyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgIsNull() {
            addCriterion("JZBRJJ_JGBG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgIsNotNull() {
            addCriterion("JZBRJJ_JGBG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgEqualTo(String value) {
            addCriterion("JZBRJJ_JGBG_FLG =", value, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_JGBG_FLG <>", value, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_JGBG_FLG >", value, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JGBG_FLG >=", value, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgLessThan(String value) {
            addCriterion("JZBRJJ_JGBG_FLG <", value, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JGBG_FLG <=", value, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgLike(String value) {
            addCriterion("JZBRJJ_JGBG_FLG like", value, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgNotLike(String value) {
            addCriterion("JZBRJJ_JGBG_FLG not like", value, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgIn(List<String> values) {
            addCriterion("JZBRJJ_JGBG_FLG in", values, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_JGBG_FLG not in", values, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JGBG_FLG between", value1, value2, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JGBG_FLG not between", value1, value2, "jzbrjjJgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZIsNull() {
            addCriterion("JZBRJJ_JGBG_Z is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZIsNotNull() {
            addCriterion("JZBRJJ_JGBG_Z is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_JGBG_Z =", value, "jzbrjjJgbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZNotEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_JGBG_Z <>", value, "jzbrjjJgbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZGreaterThan(BigDecimal value) {
            addCriterion("JZBRJJ_JGBG_Z >", value, "jzbrjjJgbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_JGBG_Z >=", value, "jzbrjjJgbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZLessThan(BigDecimal value) {
            addCriterion("JZBRJJ_JGBG_Z <", value, "jzbrjjJgbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JZBRJJ_JGBG_Z <=", value, "jzbrjjJgbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZIn(List<BigDecimal> values) {
            addCriterion("JZBRJJ_JGBG_Z in", values, "jzbrjjJgbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZNotIn(List<BigDecimal> values) {
            addCriterion("JZBRJJ_JGBG_Z not in", values, "jzbrjjJgbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZBRJJ_JGBG_Z between", value1, value2, "jzbrjjJgbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJgbgZNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZBRJJ_JGBG_Z not between", value1, value2, "jzbrjjJgbgZ");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyIsNull() {
            addCriterion("JZBRJJ_YZGMSY is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyIsNotNull() {
            addCriterion("JZBRJJ_YZGMSY is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyEqualTo(String value) {
            addCriterion("JZBRJJ_YZGMSY =", value, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyNotEqualTo(String value) {
            addCriterion("JZBRJJ_YZGMSY <>", value, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyGreaterThan(String value) {
            addCriterion("JZBRJJ_YZGMSY >", value, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZGMSY >=", value, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyLessThan(String value) {
            addCriterion("JZBRJJ_YZGMSY <", value, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZGMSY <=", value, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyLike(String value) {
            addCriterion("JZBRJJ_YZGMSY like", value, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyNotLike(String value) {
            addCriterion("JZBRJJ_YZGMSY not like", value, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyIn(List<String> values) {
            addCriterion("JZBRJJ_YZGMSY in", values, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyNotIn(List<String> values) {
            addCriterion("JZBRJJ_YZGMSY not in", values, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZGMSY between", value1, value2, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZGMSY not between", value1, value2, "jzbrjjYzgmsy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgIsNull() {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgIsNotNull() {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgEqualTo(String value) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG =", value, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG <>", value, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG >", value, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG >=", value, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgLessThan(String value) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG <", value, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG <=", value, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgLike(String value) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG like", value, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgNotLike(String value) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG not like", value, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgIn(List<String> values) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG in", values, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG not in", values, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG between", value1, value2, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgmsyJgFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZGMSY_JG_FLG not between", value1, value2, "jzbrjjYzgmsyJgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodIsNull() {
            addCriterion("JZBRJJ_YZGCZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodIsNotNull() {
            addCriterion("JZBRJJ_YZGCZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodEqualTo(String value) {
            addCriterion("JZBRJJ_YZGCZ_COD =", value, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodNotEqualTo(String value) {
            addCriterion("JZBRJJ_YZGCZ_COD <>", value, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodGreaterThan(String value) {
            addCriterion("JZBRJJ_YZGCZ_COD >", value, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZGCZ_COD >=", value, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodLessThan(String value) {
            addCriterion("JZBRJJ_YZGCZ_COD <", value, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZGCZ_COD <=", value, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodLike(String value) {
            addCriterion("JZBRJJ_YZGCZ_COD like", value, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodNotLike(String value) {
            addCriterion("JZBRJJ_YZGCZ_COD not like", value, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodIn(List<String> values) {
            addCriterion("JZBRJJ_YZGCZ_COD in", values, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodNotIn(List<String> values) {
            addCriterion("JZBRJJ_YZGCZ_COD not in", values, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZGCZ_COD between", value1, value2, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczCodNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZGCZ_COD not between", value1, value2, "jzbrjjYzgczCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtIsNull() {
            addCriterion("JZBRJJ_YZGCZ_QT is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtIsNotNull() {
            addCriterion("JZBRJJ_YZGCZ_QT is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtEqualTo(String value) {
            addCriterion("JZBRJJ_YZGCZ_QT =", value, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtNotEqualTo(String value) {
            addCriterion("JZBRJJ_YZGCZ_QT <>", value, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtGreaterThan(String value) {
            addCriterion("JZBRJJ_YZGCZ_QT >", value, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZGCZ_QT >=", value, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtLessThan(String value) {
            addCriterion("JZBRJJ_YZGCZ_QT <", value, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YZGCZ_QT <=", value, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtLike(String value) {
            addCriterion("JZBRJJ_YZGCZ_QT like", value, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtNotLike(String value) {
            addCriterion("JZBRJJ_YZGCZ_QT not like", value, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtIn(List<String> values) {
            addCriterion("JZBRJJ_YZGCZ_QT in", values, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtNotIn(List<String> values) {
            addCriterion("JZBRJJ_YZGCZ_QT not in", values, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZGCZ_QT between", value1, value2, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYzgczQtNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YZGCZ_QT not between", value1, value2, "jzbrjjYzgczQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgIsNull() {
            addCriterion("JZBRJJ_SY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgIsNotNull() {
            addCriterion("JZBRJJ_SY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgEqualTo(String value) {
            addCriterion("JZBRJJ_SY_FLG =", value, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_SY_FLG <>", value, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_SY_FLG >", value, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SY_FLG >=", value, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgLessThan(String value) {
            addCriterion("JZBRJJ_SY_FLG <", value, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SY_FLG <=", value, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgLike(String value) {
            addCriterion("JZBRJJ_SY_FLG like", value, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgNotLike(String value) {
            addCriterion("JZBRJJ_SY_FLG not like", value, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgIn(List<String> values) {
            addCriterion("JZBRJJ_SY_FLG in", values, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_SY_FLG not in", values, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SY_FLG between", value1, value2, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SY_FLG not between", value1, value2, "jzbrjjSyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodIsNull() {
            addCriterion("JZBRJJ_SY_COD is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodIsNotNull() {
            addCriterion("JZBRJJ_SY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodEqualTo(String value) {
            addCriterion("JZBRJJ_SY_COD =", value, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodNotEqualTo(String value) {
            addCriterion("JZBRJJ_SY_COD <>", value, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodGreaterThan(String value) {
            addCriterion("JZBRJJ_SY_COD >", value, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SY_COD >=", value, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodLessThan(String value) {
            addCriterion("JZBRJJ_SY_COD <", value, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SY_COD <=", value, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodLike(String value) {
            addCriterion("JZBRJJ_SY_COD like", value, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodNotLike(String value) {
            addCriterion("JZBRJJ_SY_COD not like", value, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodIn(List<String> values) {
            addCriterion("JZBRJJ_SY_COD in", values, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodNotIn(List<String> values) {
            addCriterion("JZBRJJ_SY_COD not in", values, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SY_COD between", value1, value2, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyCodNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SY_COD not between", value1, value2, "jzbrjjSyCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtIsNull() {
            addCriterion("JZBRJJ_SY_QT is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtIsNotNull() {
            addCriterion("JZBRJJ_SY_QT is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtEqualTo(String value) {
            addCriterion("JZBRJJ_SY_QT =", value, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtNotEqualTo(String value) {
            addCriterion("JZBRJJ_SY_QT <>", value, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtGreaterThan(String value) {
            addCriterion("JZBRJJ_SY_QT >", value, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SY_QT >=", value, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtLessThan(String value) {
            addCriterion("JZBRJJ_SY_QT <", value, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SY_QT <=", value, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtLike(String value) {
            addCriterion("JZBRJJ_SY_QT like", value, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtNotLike(String value) {
            addCriterion("JZBRJJ_SY_QT not like", value, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtIn(List<String> values) {
            addCriterion("JZBRJJ_SY_QT in", values, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtNotIn(List<String> values) {
            addCriterion("JZBRJJ_SY_QT not in", values, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SY_QT between", value1, value2, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSyQtNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SY_QT not between", value1, value2, "jzbrjjSyQt");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgIsNull() {
            addCriterion("JZBRJJ_KFY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgIsNotNull() {
            addCriterion("JZBRJJ_KFY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgEqualTo(String value) {
            addCriterion("JZBRJJ_KFY_FLG =", value, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_KFY_FLG <>", value, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_KFY_FLG >", value, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_KFY_FLG >=", value, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgLessThan(String value) {
            addCriterion("JZBRJJ_KFY_FLG <", value, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_KFY_FLG <=", value, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgLike(String value) {
            addCriterion("JZBRJJ_KFY_FLG like", value, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgNotLike(String value) {
            addCriterion("JZBRJJ_KFY_FLG not like", value, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgIn(List<String> values) {
            addCriterion("JZBRJJ_KFY_FLG in", values, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_KFY_FLG not in", values, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_KFY_FLG between", value1, value2, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_KFY_FLG not between", value1, value2, "jzbrjjKfyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmIsNull() {
            addCriterion("JZBRJJ_KFY_YM is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmIsNotNull() {
            addCriterion("JZBRJJ_KFY_YM is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmEqualTo(String value) {
            addCriterion("JZBRJJ_KFY_YM =", value, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmNotEqualTo(String value) {
            addCriterion("JZBRJJ_KFY_YM <>", value, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmGreaterThan(String value) {
            addCriterion("JZBRJJ_KFY_YM >", value, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_KFY_YM >=", value, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmLessThan(String value) {
            addCriterion("JZBRJJ_KFY_YM <", value, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_KFY_YM <=", value, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmLike(String value) {
            addCriterion("JZBRJJ_KFY_YM like", value, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmNotLike(String value) {
            addCriterion("JZBRJJ_KFY_YM not like", value, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmIn(List<String> values) {
            addCriterion("JZBRJJ_KFY_YM in", values, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmNotIn(List<String> values) {
            addCriterion("JZBRJJ_KFY_YM not in", values, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmBetween(String value1, String value2) {
            addCriterion("JZBRJJ_KFY_YM between", value1, value2, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKfyYmNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_KFY_YM not between", value1, value2, "jzbrjjKfyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgIsNull() {
            addCriterion("JZBRJJ_ZJY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgIsNotNull() {
            addCriterion("JZBRJJ_ZJY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgEqualTo(String value) {
            addCriterion("JZBRJJ_ZJY_FLG =", value, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_ZJY_FLG <>", value, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_ZJY_FLG >", value, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_ZJY_FLG >=", value, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgLessThan(String value) {
            addCriterion("JZBRJJ_ZJY_FLG <", value, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_ZJY_FLG <=", value, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgLike(String value) {
            addCriterion("JZBRJJ_ZJY_FLG like", value, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgNotLike(String value) {
            addCriterion("JZBRJJ_ZJY_FLG not like", value, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgIn(List<String> values) {
            addCriterion("JZBRJJ_ZJY_FLG in", values, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_ZJY_FLG not in", values, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_ZJY_FLG between", value1, value2, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_ZJY_FLG not between", value1, value2, "jzbrjjZjyFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmIsNull() {
            addCriterion("JZBRJJ_ZJY_YM is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmIsNotNull() {
            addCriterion("JZBRJJ_ZJY_YM is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmEqualTo(String value) {
            addCriterion("JZBRJJ_ZJY_YM =", value, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmNotEqualTo(String value) {
            addCriterion("JZBRJJ_ZJY_YM <>", value, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmGreaterThan(String value) {
            addCriterion("JZBRJJ_ZJY_YM >", value, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_ZJY_YM >=", value, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmLessThan(String value) {
            addCriterion("JZBRJJ_ZJY_YM <", value, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_ZJY_YM <=", value, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmLike(String value) {
            addCriterion("JZBRJJ_ZJY_YM like", value, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmNotLike(String value) {
            addCriterion("JZBRJJ_ZJY_YM not like", value, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmIn(List<String> values) {
            addCriterion("JZBRJJ_ZJY_YM in", values, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmNotIn(List<String> values) {
            addCriterion("JZBRJJ_ZJY_YM not in", values, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmBetween(String value1, String value2) {
            addCriterion("JZBRJJ_ZJY_YM between", value1, value2, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjZjyYmNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_ZJY_YM not between", value1, value2, "jzbrjjZjyYm");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgIsNull() {
            addCriterion("JZBRJJ_QGCG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgIsNotNull() {
            addCriterion("JZBRJJ_QGCG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_FLG =", value, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_FLG <>", value, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_QGCG_FLG >", value, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_FLG >=", value, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgLessThan(String value) {
            addCriterion("JZBRJJ_QGCG_FLG <", value, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_FLG <=", value, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgLike(String value) {
            addCriterion("JZBRJJ_QGCG_FLG like", value, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgNotLike(String value) {
            addCriterion("JZBRJJ_QGCG_FLG not like", value, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgIn(List<String> values) {
            addCriterion("JZBRJJ_QGCG_FLG in", values, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_QGCG_FLG not in", values, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_QGCG_FLG between", value1, value2, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_QGCG_FLG not between", value1, value2, "jzbrjjQgcgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhIsNull() {
            addCriterion("JZBRJJ_QGCG_XH is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhIsNotNull() {
            addCriterion("JZBRJJ_QGCG_XH is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_XH =", value, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhNotEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_XH <>", value, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhGreaterThan(String value) {
            addCriterion("JZBRJJ_QGCG_XH >", value, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_XH >=", value, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhLessThan(String value) {
            addCriterion("JZBRJJ_QGCG_XH <", value, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_XH <=", value, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhLike(String value) {
            addCriterion("JZBRJJ_QGCG_XH like", value, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhNotLike(String value) {
            addCriterion("JZBRJJ_QGCG_XH not like", value, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhIn(List<String> values) {
            addCriterion("JZBRJJ_QGCG_XH in", values, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhNotIn(List<String> values) {
            addCriterion("JZBRJJ_QGCG_XH not in", values, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhBetween(String value1, String value2) {
            addCriterion("JZBRJJ_QGCG_XH between", value1, value2, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgXhNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_QGCG_XH not between", value1, value2, "jzbrjjQgcgXh");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdIsNull() {
            addCriterion("JZBRJJ_QGCG_SD is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdIsNotNull() {
            addCriterion("JZBRJJ_QGCG_SD is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_SD =", value, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdNotEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_SD <>", value, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdGreaterThan(String value) {
            addCriterion("JZBRJJ_QGCG_SD >", value, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_SD >=", value, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdLessThan(String value) {
            addCriterion("JZBRJJ_QGCG_SD <", value, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_QGCG_SD <=", value, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdLike(String value) {
            addCriterion("JZBRJJ_QGCG_SD like", value, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdNotLike(String value) {
            addCriterion("JZBRJJ_QGCG_SD not like", value, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdIn(List<String> values) {
            addCriterion("JZBRJJ_QGCG_SD in", values, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdNotIn(List<String> values) {
            addCriterion("JZBRJJ_QGCG_SD not in", values, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdBetween(String value1, String value2) {
            addCriterion("JZBRJJ_QGCG_SD between", value1, value2, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjQgcgSdNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_QGCG_SD not between", value1, value2, "jzbrjjQgcgSd");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgIsNull() {
            addCriterion("JZBRJJ_YLG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgIsNotNull() {
            addCriterion("JZBRJJ_YLG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_FLG =", value, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_FLG <>", value, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_YLG_FLG >", value, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_FLG >=", value, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgLessThan(String value) {
            addCriterion("JZBRJJ_YLG_FLG <", value, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_FLG <=", value, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgLike(String value) {
            addCriterion("JZBRJJ_YLG_FLG like", value, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgNotLike(String value) {
            addCriterion("JZBRJJ_YLG_FLG not like", value, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgIn(List<String> values) {
            addCriterion("JZBRJJ_YLG_FLG in", values, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_YLG_FLG not in", values, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YLG_FLG between", value1, value2, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YLG_FLG not between", value1, value2, "jzbrjjYlgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxIsNull() {
            addCriterion("JZBRJJ_YLG_LX is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxIsNotNull() {
            addCriterion("JZBRJJ_YLG_LX is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_LX =", value, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxNotEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_LX <>", value, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxGreaterThan(String value) {
            addCriterion("JZBRJJ_YLG_LX >", value, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_LX >=", value, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxLessThan(String value) {
            addCriterion("JZBRJJ_YLG_LX <", value, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_LX <=", value, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxLike(String value) {
            addCriterion("JZBRJJ_YLG_LX like", value, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxNotLike(String value) {
            addCriterion("JZBRJJ_YLG_LX not like", value, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxIn(List<String> values) {
            addCriterion("JZBRJJ_YLG_LX in", values, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxNotIn(List<String> values) {
            addCriterion("JZBRJJ_YLG_LX not in", values, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YLG_LX between", value1, value2, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgLxNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YLG_LX not between", value1, value2, "jzbrjjYlgLx");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgIsNull() {
            addCriterion("JZBRJJ_YLG_TC_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgIsNotNull() {
            addCriterion("JZBRJJ_YLG_TC_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_TC_FLG =", value, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_TC_FLG <>", value, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_YLG_TC_FLG >", value, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_TC_FLG >=", value, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgLessThan(String value) {
            addCriterion("JZBRJJ_YLG_TC_FLG <", value, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YLG_TC_FLG <=", value, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgLike(String value) {
            addCriterion("JZBRJJ_YLG_TC_FLG like", value, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgNotLike(String value) {
            addCriterion("JZBRJJ_YLG_TC_FLG not like", value, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgIn(List<String> values) {
            addCriterion("JZBRJJ_YLG_TC_FLG in", values, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_YLG_TC_FLG not in", values, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YLG_TC_FLG between", value1, value2, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYlgTcFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YLG_TC_FLG not between", value1, value2, "jzbrjjYlgTcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodIsNull() {
            addCriterion("JZBRJJ_PF_COD is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodIsNotNull() {
            addCriterion("JZBRJJ_PF_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodEqualTo(String value) {
            addCriterion("JZBRJJ_PF_COD =", value, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodNotEqualTo(String value) {
            addCriterion("JZBRJJ_PF_COD <>", value, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodGreaterThan(String value) {
            addCriterion("JZBRJJ_PF_COD >", value, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_PF_COD >=", value, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodLessThan(String value) {
            addCriterion("JZBRJJ_PF_COD <", value, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_PF_COD <=", value, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodLike(String value) {
            addCriterion("JZBRJJ_PF_COD like", value, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodNotLike(String value) {
            addCriterion("JZBRJJ_PF_COD not like", value, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodIn(List<String> values) {
            addCriterion("JZBRJJ_PF_COD in", values, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodNotIn(List<String> values) {
            addCriterion("JZBRJJ_PF_COD not in", values, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodBetween(String value1, String value2) {
            addCriterion("JZBRJJ_PF_COD between", value1, value2, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjPfCodNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_PF_COD not between", value1, value2, "jzbrjjPfCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgIsNull() {
            addCriterion("JZBRJJ_GWXS_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgIsNotNull() {
            addCriterion("JZBRJJ_GWXS_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgEqualTo(String value) {
            addCriterion("JZBRJJ_GWXS_FLG =", value, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_GWXS_FLG <>", value, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_GWXS_FLG >", value, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_GWXS_FLG >=", value, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgLessThan(String value) {
            addCriterion("JZBRJJ_GWXS_FLG <", value, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_GWXS_FLG <=", value, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgLike(String value) {
            addCriterion("JZBRJJ_GWXS_FLG like", value, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgNotLike(String value) {
            addCriterion("JZBRJJ_GWXS_FLG not like", value, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgIn(List<String> values) {
            addCriterion("JZBRJJ_GWXS_FLG in", values, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_GWXS_FLG not in", values, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_GWXS_FLG between", value1, value2, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjGwxsFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_GWXS_FLG not between", value1, value2, "jzbrjjGwxsFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgIsNull() {
            addCriterion("JZBRJJ_SGBG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgIsNotNull() {
            addCriterion("JZBRJJ_SGBG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgEqualTo(String value) {
            addCriterion("JZBRJJ_SGBG_FLG =", value, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_SGBG_FLG <>", value, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_SGBG_FLG >", value, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SGBG_FLG >=", value, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgLessThan(String value) {
            addCriterion("JZBRJJ_SGBG_FLG <", value, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_SGBG_FLG <=", value, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgLike(String value) {
            addCriterion("JZBRJJ_SGBG_FLG like", value, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgNotLike(String value) {
            addCriterion("JZBRJJ_SGBG_FLG not like", value, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgIn(List<String> values) {
            addCriterion("JZBRJJ_SGBG_FLG in", values, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_SGBG_FLG not in", values, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SGBG_FLG between", value1, value2, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjSgbgFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_SGBG_FLG not between", value1, value2, "jzbrjjSgbgFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgIsNull() {
            addCriterion("JZBRJJ_YC_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgIsNotNull() {
            addCriterion("JZBRJJ_YC_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgEqualTo(String value) {
            addCriterion("JZBRJJ_YC_FLG =", value, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_YC_FLG <>", value, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_YC_FLG >", value, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YC_FLG >=", value, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgLessThan(String value) {
            addCriterion("JZBRJJ_YC_FLG <", value, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YC_FLG <=", value, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgLike(String value) {
            addCriterion("JZBRJJ_YC_FLG like", value, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgNotLike(String value) {
            addCriterion("JZBRJJ_YC_FLG not like", value, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgIn(List<String> values) {
            addCriterion("JZBRJJ_YC_FLG in", values, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_YC_FLG not in", values, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YC_FLG between", value1, value2, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YC_FLG not between", value1, value2, "jzbrjjYcFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwIsNull() {
            addCriterion("JZBRJJ_YC_FW is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwIsNotNull() {
            addCriterion("JZBRJJ_YC_FW is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwEqualTo(String value) {
            addCriterion("JZBRJJ_YC_FW =", value, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwNotEqualTo(String value) {
            addCriterion("JZBRJJ_YC_FW <>", value, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwGreaterThan(String value) {
            addCriterion("JZBRJJ_YC_FW >", value, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YC_FW >=", value, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwLessThan(String value) {
            addCriterion("JZBRJJ_YC_FW <", value, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YC_FW <=", value, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwLike(String value) {
            addCriterion("JZBRJJ_YC_FW like", value, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwNotLike(String value) {
            addCriterion("JZBRJJ_YC_FW not like", value, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwIn(List<String> values) {
            addCriterion("JZBRJJ_YC_FW in", values, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwNotIn(List<String> values) {
            addCriterion("JZBRJJ_YC_FW not in", values, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YC_FW between", value1, value2, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYcFwNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YC_FW not between", value1, value2, "jzbrjjYcFw");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodIsNull() {
            addCriterion("JZBRJJ_KQNM_COD is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodIsNotNull() {
            addCriterion("JZBRJJ_KQNM_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodEqualTo(String value) {
            addCriterion("JZBRJJ_KQNM_COD =", value, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodNotEqualTo(String value) {
            addCriterion("JZBRJJ_KQNM_COD <>", value, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodGreaterThan(String value) {
            addCriterion("JZBRJJ_KQNM_COD >", value, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_KQNM_COD >=", value, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodLessThan(String value) {
            addCriterion("JZBRJJ_KQNM_COD <", value, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_KQNM_COD <=", value, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodLike(String value) {
            addCriterion("JZBRJJ_KQNM_COD like", value, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodNotLike(String value) {
            addCriterion("JZBRJJ_KQNM_COD not like", value, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodIn(List<String> values) {
            addCriterion("JZBRJJ_KQNM_COD in", values, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodNotIn(List<String> values) {
            addCriterion("JZBRJJ_KQNM_COD not in", values, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodBetween(String value1, String value2) {
            addCriterion("JZBRJJ_KQNM_COD between", value1, value2, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjKqnmCodNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_KQNM_COD not between", value1, value2, "jzbrjjKqnmCod");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgIsNull() {
            addCriterion("JZBRJJ_DXB_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgIsNotNull() {
            addCriterion("JZBRJJ_DXB_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgEqualTo(String value) {
            addCriterion("JZBRJJ_DXB_FLG =", value, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgNotEqualTo(String value) {
            addCriterion("JZBRJJ_DXB_FLG <>", value, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgGreaterThan(String value) {
            addCriterion("JZBRJJ_DXB_FLG >", value, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_DXB_FLG >=", value, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgLessThan(String value) {
            addCriterion("JZBRJJ_DXB_FLG <", value, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_DXB_FLG <=", value, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgLike(String value) {
            addCriterion("JZBRJJ_DXB_FLG like", value, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgNotLike(String value) {
            addCriterion("JZBRJJ_DXB_FLG not like", value, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgIn(List<String> values) {
            addCriterion("JZBRJJ_DXB_FLG in", values, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgNotIn(List<String> values) {
            addCriterion("JZBRJJ_DXB_FLG not in", values, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgBetween(String value1, String value2) {
            addCriterion("JZBRJJ_DXB_FLG between", value1, value2, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjDxbFlgNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_DXB_FLG not between", value1, value2, "jzbrjjDxbFlg");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcIsNull() {
            addCriterion("JZBRJJ_YYYSWJC is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcIsNotNull() {
            addCriterion("JZBRJJ_YYYSWJC is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcEqualTo(String value) {
            addCriterion("JZBRJJ_YYYSWJC =", value, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcNotEqualTo(String value) {
            addCriterion("JZBRJJ_YYYSWJC <>", value, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcGreaterThan(String value) {
            addCriterion("JZBRJJ_YYYSWJC >", value, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YYYSWJC >=", value, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcLessThan(String value) {
            addCriterion("JZBRJJ_YYYSWJC <", value, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_YYYSWJC <=", value, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcLike(String value) {
            addCriterion("JZBRJJ_YYYSWJC like", value, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcNotLike(String value) {
            addCriterion("JZBRJJ_YYYSWJC not like", value, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcIn(List<String> values) {
            addCriterion("JZBRJJ_YYYSWJC in", values, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcNotIn(List<String> values) {
            addCriterion("JZBRJJ_YYYSWJC not in", values, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YYYSWJC between", value1, value2, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjYyyswjcNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_YYYSWJC not between", value1, value2, "jzbrjjYyyswjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcIsNull() {
            addCriterion("JZBRJJ_WWCJC is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcIsNotNull() {
            addCriterion("JZBRJJ_WWCJC is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcEqualTo(String value) {
            addCriterion("JZBRJJ_WWCJC =", value, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcNotEqualTo(String value) {
            addCriterion("JZBRJJ_WWCJC <>", value, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcGreaterThan(String value) {
            addCriterion("JZBRJJ_WWCJC >", value, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_WWCJC >=", value, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcLessThan(String value) {
            addCriterion("JZBRJJ_WWCJC <", value, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_WWCJC <=", value, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcLike(String value) {
            addCriterion("JZBRJJ_WWCJC like", value, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcNotLike(String value) {
            addCriterion("JZBRJJ_WWCJC not like", value, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcIn(List<String> values) {
            addCriterion("JZBRJJ_WWCJC in", values, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcNotIn(List<String> values) {
            addCriterion("JZBRJJ_WWCJC not in", values, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcBetween(String value1, String value2) {
            addCriterion("JZBRJJ_WWCJC between", value1, value2, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjWwcjcNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_WWCJC not between", value1, value2, "jzbrjjWwcjc");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyIsNull() {
            addCriterion("JZBRJJ_TBZY is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyIsNotNull() {
            addCriterion("JZBRJJ_TBZY is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyEqualTo(String value) {
            addCriterion("JZBRJJ_TBZY =", value, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyNotEqualTo(String value) {
            addCriterion("JZBRJJ_TBZY <>", value, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyGreaterThan(String value) {
            addCriterion("JZBRJJ_TBZY >", value, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_TBZY >=", value, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyLessThan(String value) {
            addCriterion("JZBRJJ_TBZY <", value, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_TBZY <=", value, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyLike(String value) {
            addCriterion("JZBRJJ_TBZY like", value, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyNotLike(String value) {
            addCriterion("JZBRJJ_TBZY not like", value, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyIn(List<String> values) {
            addCriterion("JZBRJJ_TBZY in", values, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyNotIn(List<String> values) {
            addCriterion("JZBRJJ_TBZY not in", values, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyBetween(String value1, String value2) {
            addCriterion("JZBRJJ_TBZY between", value1, value2, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjTbzyNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_TBZY not between", value1, value2, "jzbrjjTbzy");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrIsNull() {
            addCriterion("JZBRJJ_JBHS_NBR is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrIsNotNull() {
            addCriterion("JZBRJJ_JBHS_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrEqualTo(String value) {
            addCriterion("JZBRJJ_JBHS_NBR =", value, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrNotEqualTo(String value) {
            addCriterion("JZBRJJ_JBHS_NBR <>", value, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrGreaterThan(String value) {
            addCriterion("JZBRJJ_JBHS_NBR >", value, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JBHS_NBR >=", value, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrLessThan(String value) {
            addCriterion("JZBRJJ_JBHS_NBR <", value, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JBHS_NBR <=", value, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrLike(String value) {
            addCriterion("JZBRJJ_JBHS_NBR like", value, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrNotLike(String value) {
            addCriterion("JZBRJJ_JBHS_NBR not like", value, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrIn(List<String> values) {
            addCriterion("JZBRJJ_JBHS_NBR in", values, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrNotIn(List<String> values) {
            addCriterion("JZBRJJ_JBHS_NBR not in", values, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JBHS_NBR between", value1, value2, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNbrNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JBHS_NBR not between", value1, value2, "jzbrjjJbhsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamIsNull() {
            addCriterion("JZBRJJ_JBHS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamIsNotNull() {
            addCriterion("JZBRJJ_JBHS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamEqualTo(String value) {
            addCriterion("JZBRJJ_JBHS_NAM =", value, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamNotEqualTo(String value) {
            addCriterion("JZBRJJ_JBHS_NAM <>", value, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamGreaterThan(String value) {
            addCriterion("JZBRJJ_JBHS_NAM >", value, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JBHS_NAM >=", value, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamLessThan(String value) {
            addCriterion("JZBRJJ_JBHS_NAM <", value, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JBHS_NAM <=", value, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamLike(String value) {
            addCriterion("JZBRJJ_JBHS_NAM like", value, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamNotLike(String value) {
            addCriterion("JZBRJJ_JBHS_NAM not like", value, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamIn(List<String> values) {
            addCriterion("JZBRJJ_JBHS_NAM in", values, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamNotIn(List<String> values) {
            addCriterion("JZBRJJ_JBHS_NAM not in", values, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JBHS_NAM between", value1, value2, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbhsNamNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JBHS_NAM not between", value1, value2, "jzbrjjJbhsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrIsNull() {
            addCriterion("JZBRJJ_JBBF_NBR is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrIsNotNull() {
            addCriterion("JZBRJJ_JBBF_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrEqualTo(String value) {
            addCriterion("JZBRJJ_JBBF_NBR =", value, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrNotEqualTo(String value) {
            addCriterion("JZBRJJ_JBBF_NBR <>", value, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrGreaterThan(String value) {
            addCriterion("JZBRJJ_JBBF_NBR >", value, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JBBF_NBR >=", value, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrLessThan(String value) {
            addCriterion("JZBRJJ_JBBF_NBR <", value, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JBBF_NBR <=", value, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrLike(String value) {
            addCriterion("JZBRJJ_JBBF_NBR like", value, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrNotLike(String value) {
            addCriterion("JZBRJJ_JBBF_NBR not like", value, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrIn(List<String> values) {
            addCriterion("JZBRJJ_JBBF_NBR in", values, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrNotIn(List<String> values) {
            addCriterion("JZBRJJ_JBBF_NBR not in", values, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JBBF_NBR between", value1, value2, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNbrNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JBBF_NBR not between", value1, value2, "jzbrjjJbbfNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfIsNull() {
            addCriterion("JZBRJJ_JBBF is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfIsNotNull() {
            addCriterion("JZBRJJ_JBBF is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfEqualTo(String value) {
            addCriterion("JZBRJJ_JBBF =", value, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNotEqualTo(String value) {
            addCriterion("JZBRJJ_JBBF <>", value, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfGreaterThan(String value) {
            addCriterion("JZBRJJ_JBBF >", value, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JBBF >=", value, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfLessThan(String value) {
            addCriterion("JZBRJJ_JBBF <", value, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JBBF <=", value, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfLike(String value) {
            addCriterion("JZBRJJ_JBBF like", value, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNotLike(String value) {
            addCriterion("JZBRJJ_JBBF not like", value, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfIn(List<String> values) {
            addCriterion("JZBRJJ_JBBF in", values, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNotIn(List<String> values) {
            addCriterion("JZBRJJ_JBBF not in", values, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JBBF between", value1, value2, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbbfNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JBBF not between", value1, value2, "jzbrjjJbbf");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrIsNull() {
            addCriterion("JZBRJJ_JCHS_NBR is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrIsNotNull() {
            addCriterion("JZBRJJ_JCHS_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrEqualTo(String value) {
            addCriterion("JZBRJJ_JCHS_NBR =", value, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrNotEqualTo(String value) {
            addCriterion("JZBRJJ_JCHS_NBR <>", value, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrGreaterThan(String value) {
            addCriterion("JZBRJJ_JCHS_NBR >", value, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JCHS_NBR >=", value, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrLessThan(String value) {
            addCriterion("JZBRJJ_JCHS_NBR <", value, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JCHS_NBR <=", value, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrLike(String value) {
            addCriterion("JZBRJJ_JCHS_NBR like", value, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrNotLike(String value) {
            addCriterion("JZBRJJ_JCHS_NBR not like", value, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrIn(List<String> values) {
            addCriterion("JZBRJJ_JCHS_NBR in", values, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrNotIn(List<String> values) {
            addCriterion("JZBRJJ_JCHS_NBR not in", values, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JCHS_NBR between", value1, value2, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNbrNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JCHS_NBR not between", value1, value2, "jzbrjjJchsNbr");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamIsNull() {
            addCriterion("JZBRJJ_JCHS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamIsNotNull() {
            addCriterion("JZBRJJ_JCHS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamEqualTo(String value) {
            addCriterion("JZBRJJ_JCHS_NAM =", value, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamNotEqualTo(String value) {
            addCriterion("JZBRJJ_JCHS_NAM <>", value, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamGreaterThan(String value) {
            addCriterion("JZBRJJ_JCHS_NAM >", value, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamGreaterThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JCHS_NAM >=", value, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamLessThan(String value) {
            addCriterion("JZBRJJ_JCHS_NAM <", value, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamLessThanOrEqualTo(String value) {
            addCriterion("JZBRJJ_JCHS_NAM <=", value, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamLike(String value) {
            addCriterion("JZBRJJ_JCHS_NAM like", value, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamNotLike(String value) {
            addCriterion("JZBRJJ_JCHS_NAM not like", value, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamIn(List<String> values) {
            addCriterion("JZBRJJ_JCHS_NAM in", values, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamNotIn(List<String> values) {
            addCriterion("JZBRJJ_JCHS_NAM not in", values, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JCHS_NAM between", value1, value2, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJchsNamNotBetween(String value1, String value2) {
            addCriterion("JZBRJJ_JCHS_NAM not between", value1, value2, "jzbrjjJchsNam");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjIsNull() {
            addCriterion("JZBRJJ_JBSJ is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjIsNotNull() {
            addCriterion("JZBRJJ_JBSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjEqualTo(Date value) {
            addCriterion("JZBRJJ_JBSJ =", value, "jzbrjjJbsj");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjNotEqualTo(Date value) {
            addCriterion("JZBRJJ_JBSJ <>", value, "jzbrjjJbsj");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjGreaterThan(Date value) {
            addCriterion("JZBRJJ_JBSJ >", value, "jzbrjjJbsj");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjGreaterThanOrEqualTo(Date value) {
            addCriterion("JZBRJJ_JBSJ >=", value, "jzbrjjJbsj");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjLessThan(Date value) {
            addCriterion("JZBRJJ_JBSJ <", value, "jzbrjjJbsj");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjLessThanOrEqualTo(Date value) {
            addCriterion("JZBRJJ_JBSJ <=", value, "jzbrjjJbsj");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjIn(List<Date> values) {
            addCriterion("JZBRJJ_JBSJ in", values, "jzbrjjJbsj");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjNotIn(List<Date> values) {
            addCriterion("JZBRJJ_JBSJ not in", values, "jzbrjjJbsj");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjBetween(Date value1, Date value2) {
            addCriterion("JZBRJJ_JBSJ between", value1, value2, "jzbrjjJbsj");
            return (Criteria) this;
        }

        public Criteria andJzbrjjJbsjNotBetween(Date value1, Date value2) {
            addCriterion("JZBRJJ_JBSJ not between", value1, value2, "jzbrjjJbsj");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownIsNull() {
            addCriterion("JZBRJJ_BP_DOWN is null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownIsNotNull() {
            addCriterion("JZBRJJ_BP_DOWN is not null");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownEqualTo(Short value) {
            addCriterion("JZBRJJ_BP_DOWN =", value, "jzbrjjBpDown");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownNotEqualTo(Short value) {
            addCriterion("JZBRJJ_BP_DOWN <>", value, "jzbrjjBpDown");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownGreaterThan(Short value) {
            addCriterion("JZBRJJ_BP_DOWN >", value, "jzbrjjBpDown");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownGreaterThanOrEqualTo(Short value) {
            addCriterion("JZBRJJ_BP_DOWN >=", value, "jzbrjjBpDown");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownLessThan(Short value) {
            addCriterion("JZBRJJ_BP_DOWN <", value, "jzbrjjBpDown");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownLessThanOrEqualTo(Short value) {
            addCriterion("JZBRJJ_BP_DOWN <=", value, "jzbrjjBpDown");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownIn(List<Short> values) {
            addCriterion("JZBRJJ_BP_DOWN in", values, "jzbrjjBpDown");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownNotIn(List<Short> values) {
            addCriterion("JZBRJJ_BP_DOWN not in", values, "jzbrjjBpDown");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownBetween(Short value1, Short value2) {
            addCriterion("JZBRJJ_BP_DOWN between", value1, value2, "jzbrjjBpDown");
            return (Criteria) this;
        }

        public Criteria andJzbrjjBpDownNotBetween(Short value1, Short value2) {
            addCriterion("JZBRJJ_BP_DOWN not between", value1, value2, "jzbrjjBpDown");
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

        public Criteria andCretNbrIsNull() {
            addCriterion("CRET_NBR is null");
            return (Criteria) this;
        }

        public Criteria andCretNbrIsNotNull() {
            addCriterion("CRET_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andCretNbrEqualTo(String value) {
            addCriterion("CRET_NBR =", value, "cretNbr");
            return (Criteria) this;
        }

        public Criteria andCretNbrNotEqualTo(String value) {
            addCriterion("CRET_NBR <>", value, "cretNbr");
            return (Criteria) this;
        }

        public Criteria andCretNbrGreaterThan(String value) {
            addCriterion("CRET_NBR >", value, "cretNbr");
            return (Criteria) this;
        }

        public Criteria andCretNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CRET_NBR >=", value, "cretNbr");
            return (Criteria) this;
        }

        public Criteria andCretNbrLessThan(String value) {
            addCriterion("CRET_NBR <", value, "cretNbr");
            return (Criteria) this;
        }

        public Criteria andCretNbrLessThanOrEqualTo(String value) {
            addCriterion("CRET_NBR <=", value, "cretNbr");
            return (Criteria) this;
        }

        public Criteria andCretNbrLike(String value) {
            addCriterion("CRET_NBR like", value, "cretNbr");
            return (Criteria) this;
        }

        public Criteria andCretNbrNotLike(String value) {
            addCriterion("CRET_NBR not like", value, "cretNbr");
            return (Criteria) this;
        }

        public Criteria andCretNbrIn(List<String> values) {
            addCriterion("CRET_NBR in", values, "cretNbr");
            return (Criteria) this;
        }

        public Criteria andCretNbrNotIn(List<String> values) {
            addCriterion("CRET_NBR not in", values, "cretNbr");
            return (Criteria) this;
        }

        public Criteria andCretNbrBetween(String value1, String value2) {
            addCriterion("CRET_NBR between", value1, value2, "cretNbr");
            return (Criteria) this;
        }

        public Criteria andCretNbrNotBetween(String value1, String value2) {
            addCriterion("CRET_NBR not between", value1, value2, "cretNbr");
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