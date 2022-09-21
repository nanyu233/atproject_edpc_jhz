package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCsampInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCsampInfExample() {
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

        public Criteria andItmAlsIsNull() {
            addCriterion("ITM_ALS is null");
            return (Criteria) this;
        }

        public Criteria andItmAlsIsNotNull() {
            addCriterion("ITM_ALS is not null");
            return (Criteria) this;
        }

        public Criteria andItmAlsEqualTo(String value) {
            addCriterion("ITM_ALS =", value, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAlsNotEqualTo(String value) {
            addCriterion("ITM_ALS <>", value, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAlsGreaterThan(String value) {
            addCriterion("ITM_ALS >", value, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAlsGreaterThanOrEqualTo(String value) {
            addCriterion("ITM_ALS >=", value, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAlsLessThan(String value) {
            addCriterion("ITM_ALS <", value, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAlsLessThanOrEqualTo(String value) {
            addCriterion("ITM_ALS <=", value, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAlsLike(String value) {
            addCriterion("ITM_ALS like", value, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAlsNotLike(String value) {
            addCriterion("ITM_ALS not like", value, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAlsIn(List<String> values) {
            addCriterion("ITM_ALS in", values, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAlsNotIn(List<String> values) {
            addCriterion("ITM_ALS not in", values, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAlsBetween(String value1, String value2) {
            addCriterion("ITM_ALS between", value1, value2, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAlsNotBetween(String value1, String value2) {
            addCriterion("ITM_ALS not between", value1, value2, "itmAls");
            return (Criteria) this;
        }

        public Criteria andItmAqtIsNull() {
            addCriterion("ITM_AQT is null");
            return (Criteria) this;
        }

        public Criteria andItmAqtIsNotNull() {
            addCriterion("ITM_AQT is not null");
            return (Criteria) this;
        }

        public Criteria andItmAqtEqualTo(String value) {
            addCriterion("ITM_AQT =", value, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmAqtNotEqualTo(String value) {
            addCriterion("ITM_AQT <>", value, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmAqtGreaterThan(String value) {
            addCriterion("ITM_AQT >", value, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmAqtGreaterThanOrEqualTo(String value) {
            addCriterion("ITM_AQT >=", value, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmAqtLessThan(String value) {
            addCriterion("ITM_AQT <", value, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmAqtLessThanOrEqualTo(String value) {
            addCriterion("ITM_AQT <=", value, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmAqtLike(String value) {
            addCriterion("ITM_AQT like", value, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmAqtNotLike(String value) {
            addCriterion("ITM_AQT not like", value, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmAqtIn(List<String> values) {
            addCriterion("ITM_AQT in", values, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmAqtNotIn(List<String> values) {
            addCriterion("ITM_AQT not in", values, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmAqtBetween(String value1, String value2) {
            addCriterion("ITM_AQT between", value1, value2, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmAqtNotBetween(String value1, String value2) {
            addCriterion("ITM_AQT not between", value1, value2, "itmAqt");
            return (Criteria) this;
        }

        public Criteria andItmMlsIsNull() {
            addCriterion("ITM_MLS is null");
            return (Criteria) this;
        }

        public Criteria andItmMlsIsNotNull() {
            addCriterion("ITM_MLS is not null");
            return (Criteria) this;
        }

        public Criteria andItmMlsEqualTo(String value) {
            addCriterion("ITM_MLS =", value, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMlsNotEqualTo(String value) {
            addCriterion("ITM_MLS <>", value, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMlsGreaterThan(String value) {
            addCriterion("ITM_MLS >", value, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMlsGreaterThanOrEqualTo(String value) {
            addCriterion("ITM_MLS >=", value, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMlsLessThan(String value) {
            addCriterion("ITM_MLS <", value, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMlsLessThanOrEqualTo(String value) {
            addCriterion("ITM_MLS <=", value, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMlsLike(String value) {
            addCriterion("ITM_MLS like", value, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMlsNotLike(String value) {
            addCriterion("ITM_MLS not like", value, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMlsIn(List<String> values) {
            addCriterion("ITM_MLS in", values, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMlsNotIn(List<String> values) {
            addCriterion("ITM_MLS not in", values, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMlsBetween(String value1, String value2) {
            addCriterion("ITM_MLS between", value1, value2, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMlsNotBetween(String value1, String value2) {
            addCriterion("ITM_MLS not between", value1, value2, "itmMls");
            return (Criteria) this;
        }

        public Criteria andItmMqtIsNull() {
            addCriterion("ITM_MQT is null");
            return (Criteria) this;
        }

        public Criteria andItmMqtIsNotNull() {
            addCriterion("ITM_MQT is not null");
            return (Criteria) this;
        }

        public Criteria andItmMqtEqualTo(String value) {
            addCriterion("ITM_MQT =", value, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmMqtNotEqualTo(String value) {
            addCriterion("ITM_MQT <>", value, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmMqtGreaterThan(String value) {
            addCriterion("ITM_MQT >", value, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmMqtGreaterThanOrEqualTo(String value) {
            addCriterion("ITM_MQT >=", value, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmMqtLessThan(String value) {
            addCriterion("ITM_MQT <", value, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmMqtLessThanOrEqualTo(String value) {
            addCriterion("ITM_MQT <=", value, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmMqtLike(String value) {
            addCriterion("ITM_MQT like", value, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmMqtNotLike(String value) {
            addCriterion("ITM_MQT not like", value, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmMqtIn(List<String> values) {
            addCriterion("ITM_MQT in", values, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmMqtNotIn(List<String> values) {
            addCriterion("ITM_MQT not in", values, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmMqtBetween(String value1, String value2) {
            addCriterion("ITM_MQT between", value1, value2, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmMqtNotBetween(String value1, String value2) {
            addCriterion("ITM_MQT not between", value1, value2, "itmMqt");
            return (Criteria) this;
        }

        public Criteria andItmPlsIsNull() {
            addCriterion("ITM_PLS is null");
            return (Criteria) this;
        }

        public Criteria andItmPlsIsNotNull() {
            addCriterion("ITM_PLS is not null");
            return (Criteria) this;
        }

        public Criteria andItmPlsEqualTo(String value) {
            addCriterion("ITM_PLS =", value, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPlsNotEqualTo(String value) {
            addCriterion("ITM_PLS <>", value, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPlsGreaterThan(String value) {
            addCriterion("ITM_PLS >", value, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPlsGreaterThanOrEqualTo(String value) {
            addCriterion("ITM_PLS >=", value, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPlsLessThan(String value) {
            addCriterion("ITM_PLS <", value, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPlsLessThanOrEqualTo(String value) {
            addCriterion("ITM_PLS <=", value, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPlsLike(String value) {
            addCriterion("ITM_PLS like", value, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPlsNotLike(String value) {
            addCriterion("ITM_PLS not like", value, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPlsIn(List<String> values) {
            addCriterion("ITM_PLS in", values, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPlsNotIn(List<String> values) {
            addCriterion("ITM_PLS not in", values, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPlsBetween(String value1, String value2) {
            addCriterion("ITM_PLS between", value1, value2, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPlsNotBetween(String value1, String value2) {
            addCriterion("ITM_PLS not between", value1, value2, "itmPls");
            return (Criteria) this;
        }

        public Criteria andItmPqtIsNull() {
            addCriterion("ITM_PQT is null");
            return (Criteria) this;
        }

        public Criteria andItmPqtIsNotNull() {
            addCriterion("ITM_PQT is not null");
            return (Criteria) this;
        }

        public Criteria andItmPqtEqualTo(String value) {
            addCriterion("ITM_PQT =", value, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmPqtNotEqualTo(String value) {
            addCriterion("ITM_PQT <>", value, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmPqtGreaterThan(String value) {
            addCriterion("ITM_PQT >", value, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmPqtGreaterThanOrEqualTo(String value) {
            addCriterion("ITM_PQT >=", value, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmPqtLessThan(String value) {
            addCriterion("ITM_PQT <", value, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmPqtLessThanOrEqualTo(String value) {
            addCriterion("ITM_PQT <=", value, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmPqtLike(String value) {
            addCriterion("ITM_PQT like", value, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmPqtNotLike(String value) {
            addCriterion("ITM_PQT not like", value, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmPqtIn(List<String> values) {
            addCriterion("ITM_PQT in", values, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmPqtNotIn(List<String> values) {
            addCriterion("ITM_PQT not in", values, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmPqtBetween(String value1, String value2) {
            addCriterion("ITM_PQT between", value1, value2, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmPqtNotBetween(String value1, String value2) {
            addCriterion("ITM_PQT not between", value1, value2, "itmPqt");
            return (Criteria) this;
        }

        public Criteria andItmLtmIsNull() {
            addCriterion("ITM_LTM is null");
            return (Criteria) this;
        }

        public Criteria andItmLtmIsNotNull() {
            addCriterion("ITM_LTM is not null");
            return (Criteria) this;
        }

        public Criteria andItmLtmEqualTo(Date value) {
            addCriterion("ITM_LTM =", value, "itmLtm");
            return (Criteria) this;
        }

        public Criteria andItmLtmNotEqualTo(Date value) {
            addCriterion("ITM_LTM <>", value, "itmLtm");
            return (Criteria) this;
        }

        public Criteria andItmLtmGreaterThan(Date value) {
            addCriterion("ITM_LTM >", value, "itmLtm");
            return (Criteria) this;
        }

        public Criteria andItmLtmGreaterThanOrEqualTo(Date value) {
            addCriterion("ITM_LTM >=", value, "itmLtm");
            return (Criteria) this;
        }

        public Criteria andItmLtmLessThan(Date value) {
            addCriterion("ITM_LTM <", value, "itmLtm");
            return (Criteria) this;
        }

        public Criteria andItmLtmLessThanOrEqualTo(Date value) {
            addCriterion("ITM_LTM <=", value, "itmLtm");
            return (Criteria) this;
        }

        public Criteria andItmLtmIn(List<Date> values) {
            addCriterion("ITM_LTM in", values, "itmLtm");
            return (Criteria) this;
        }

        public Criteria andItmLtmNotIn(List<Date> values) {
            addCriterion("ITM_LTM not in", values, "itmLtm");
            return (Criteria) this;
        }

        public Criteria andItmLtmBetween(Date value1, Date value2) {
            addCriterion("ITM_LTM between", value1, value2, "itmLtm");
            return (Criteria) this;
        }

        public Criteria andItmLtmNotBetween(Date value1, Date value2) {
            addCriterion("ITM_LTM not between", value1, value2, "itmLtm");
            return (Criteria) this;
        }

        public Criteria andItmLfdIsNull() {
            addCriterion("ITM_LFD is null");
            return (Criteria) this;
        }

        public Criteria andItmLfdIsNotNull() {
            addCriterion("ITM_LFD is not null");
            return (Criteria) this;
        }

        public Criteria andItmLfdEqualTo(String value) {
            addCriterion("ITM_LFD =", value, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmLfdNotEqualTo(String value) {
            addCriterion("ITM_LFD <>", value, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmLfdGreaterThan(String value) {
            addCriterion("ITM_LFD >", value, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmLfdGreaterThanOrEqualTo(String value) {
            addCriterion("ITM_LFD >=", value, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmLfdLessThan(String value) {
            addCriterion("ITM_LFD <", value, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmLfdLessThanOrEqualTo(String value) {
            addCriterion("ITM_LFD <=", value, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmLfdLike(String value) {
            addCriterion("ITM_LFD like", value, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmLfdNotLike(String value) {
            addCriterion("ITM_LFD not like", value, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmLfdIn(List<String> values) {
            addCriterion("ITM_LFD in", values, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmLfdNotIn(List<String> values) {
            addCriterion("ITM_LFD not in", values, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmLfdBetween(String value1, String value2) {
            addCriterion("ITM_LFD between", value1, value2, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmLfdNotBetween(String value1, String value2) {
            addCriterion("ITM_LFD not between", value1, value2, "itmLfd");
            return (Criteria) this;
        }

        public Criteria andItmEmeIsNull() {
            addCriterion("ITM_EME is null");
            return (Criteria) this;
        }

        public Criteria andItmEmeIsNotNull() {
            addCriterion("ITM_EME is not null");
            return (Criteria) this;
        }

        public Criteria andItmEmeEqualTo(String value) {
            addCriterion("ITM_EME =", value, "itmEme");
            return (Criteria) this;
        }

        public Criteria andItmEmeNotEqualTo(String value) {
            addCriterion("ITM_EME <>", value, "itmEme");
            return (Criteria) this;
        }

        public Criteria andItmEmeGreaterThan(String value) {
            addCriterion("ITM_EME >", value, "itmEme");
            return (Criteria) this;
        }

        public Criteria andItmEmeGreaterThanOrEqualTo(String value) {
            addCriterion("ITM_EME >=", value, "itmEme");
            return (Criteria) this;
        }

        public Criteria andItmEmeLessThan(String value) {
            addCriterion("ITM_EME <", value, "itmEme");
            return (Criteria) this;
        }

        public Criteria andItmEmeLessThanOrEqualTo(String value) {
            addCriterion("ITM_EME <=", value, "itmEme");
            return (Criteria) this;
        }

        public Criteria andItmEmeLike(String value) {
            addCriterion("ITM_EME like", value, "itmEme");
            return (Criteria) this;
        }

        public Criteria andItmEmeNotLike(String value) {
            addCriterion("ITM_EME not like", value, "itmEme");
            return (Criteria) this;
        }

        public Criteria andItmEmeIn(List<String> values) {
            addCriterion("ITM_EME in", values, "itmEme");
            return (Criteria) this;
        }

        public Criteria andItmEmeNotIn(List<String> values) {
            addCriterion("ITM_EME not in", values, "itmEme");
            return (Criteria) this;
        }

        public Criteria andItmEmeBetween(String value1, String value2) {
            addCriterion("ITM_EME between", value1, value2, "itmEme");
            return (Criteria) this;
        }

        public Criteria andItmEmeNotBetween(String value1, String value2) {
            addCriterion("ITM_EME not between", value1, value2, "itmEme");
            return (Criteria) this;
        }

        public Criteria andUsrNoIsNull() {
            addCriterion("USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andUsrNoIsNotNull() {
            addCriterion("USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNoEqualTo(String value) {
            addCriterion("USR_NO =", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotEqualTo(String value) {
            addCriterion("USR_NO <>", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoGreaterThan(String value) {
            addCriterion("USR_NO >", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NO >=", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoLessThan(String value) {
            addCriterion("USR_NO <", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoLessThanOrEqualTo(String value) {
            addCriterion("USR_NO <=", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoLike(String value) {
            addCriterion("USR_NO like", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotLike(String value) {
            addCriterion("USR_NO not like", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoIn(List<String> values) {
            addCriterion("USR_NO in", values, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotIn(List<String> values) {
            addCriterion("USR_NO not in", values, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoBetween(String value1, String value2) {
            addCriterion("USR_NO between", value1, value2, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotBetween(String value1, String value2) {
            addCriterion("USR_NO not between", value1, value2, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNmeIsNull() {
            addCriterion("USR_NME is null");
            return (Criteria) this;
        }

        public Criteria andUsrNmeIsNotNull() {
            addCriterion("USR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNmeEqualTo(String value) {
            addCriterion("USR_NME =", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeNotEqualTo(String value) {
            addCriterion("USR_NME <>", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeGreaterThan(String value) {
            addCriterion("USR_NME >", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NME >=", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeLessThan(String value) {
            addCriterion("USR_NME <", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeLessThanOrEqualTo(String value) {
            addCriterion("USR_NME <=", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeLike(String value) {
            addCriterion("USR_NME like", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeNotLike(String value) {
            addCriterion("USR_NME not like", value, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeIn(List<String> values) {
            addCriterion("USR_NME in", values, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeNotIn(List<String> values) {
            addCriterion("USR_NME not in", values, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeBetween(String value1, String value2) {
            addCriterion("USR_NME between", value1, value2, "usrNme");
            return (Criteria) this;
        }

        public Criteria andUsrNmeNotBetween(String value1, String value2) {
            addCriterion("USR_NME not between", value1, value2, "usrNme");
            return (Criteria) this;
        }

        public Criteria andCrtTimIsNull() {
            addCriterion("CRT_TIM is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimIsNotNull() {
            addCriterion("CRT_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimEqualTo(Date value) {
            addCriterion("CRT_TIM =", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotEqualTo(Date value) {
            addCriterion("CRT_TIM <>", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimGreaterThan(Date value) {
            addCriterion("CRT_TIM >", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIM >=", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimLessThan(Date value) {
            addCriterion("CRT_TIM <", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIM <=", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimIn(List<Date> values) {
            addCriterion("CRT_TIM in", values, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotIn(List<Date> values) {
            addCriterion("CRT_TIM not in", values, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimBetween(Date value1, Date value2) {
            addCriterion("CRT_TIM between", value1, value2, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIM not between", value1, value2, "crtTim");
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