package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspHljldInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspHljldInfExample() {
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

        public Criteria andBqhiSeqIsNull() {
            addCriterion("BQHI_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqIsNotNull() {
            addCriterion("BQHI_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqEqualTo(String value) {
            addCriterion("BQHI_SEQ =", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqNotEqualTo(String value) {
            addCriterion("BQHI_SEQ <>", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqGreaterThan(String value) {
            addCriterion("BQHI_SEQ >", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqGreaterThanOrEqualTo(String value) {
            addCriterion("BQHI_SEQ >=", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqLessThan(String value) {
            addCriterion("BQHI_SEQ <", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqLessThanOrEqualTo(String value) {
            addCriterion("BQHI_SEQ <=", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqLike(String value) {
            addCriterion("BQHI_SEQ like", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqNotLike(String value) {
            addCriterion("BQHI_SEQ not like", value, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqIn(List<String> values) {
            addCriterion("BQHI_SEQ in", values, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqNotIn(List<String> values) {
            addCriterion("BQHI_SEQ not in", values, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqBetween(String value1, String value2) {
            addCriterion("BQHI_SEQ between", value1, value2, "bqhiSeq");
            return (Criteria) this;
        }

        public Criteria andBqhiSeqNotBetween(String value1, String value2) {
            addCriterion("BQHI_SEQ not between", value1, value2, "bqhiSeq");
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

        public Criteria andTmpNbrIsNull() {
            addCriterion("TMP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andTmpNbrIsNotNull() {
            addCriterion("TMP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andTmpNbrEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR =", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR <>", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrGreaterThan(BigDecimal value) {
            addCriterion("TMP_NBR >", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR >=", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLessThan(BigDecimal value) {
            addCriterion("TMP_NBR <", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR <=", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrIn(List<BigDecimal> values) {
            addCriterion("TMP_NBR in", values, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotIn(List<BigDecimal> values) {
            addCriterion("TMP_NBR not in", values, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TMP_NBR between", value1, value2, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TMP_NBR not between", value1, value2, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNull() {
            addCriterion("HRT_RTE is null");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNotNull() {
            addCriterion("HRT_RTE is not null");
            return (Criteria) this;
        }

        public Criteria andHrtRteEqualTo(Short value) {
            addCriterion("HRT_RTE =", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotEqualTo(Short value) {
            addCriterion("HRT_RTE <>", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThan(Short value) {
            addCriterion("HRT_RTE >", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThanOrEqualTo(Short value) {
            addCriterion("HRT_RTE >=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThan(Short value) {
            addCriterion("HRT_RTE <", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThanOrEqualTo(Short value) {
            addCriterion("HRT_RTE <=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteIn(List<Short> values) {
            addCriterion("HRT_RTE in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotIn(List<Short> values) {
            addCriterion("HRT_RTE not in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteBetween(Short value1, Short value2) {
            addCriterion("HRT_RTE between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotBetween(Short value1, Short value2) {
            addCriterion("HRT_RTE not between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIsNull() {
            addCriterion("SBP_UP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIsNotNull() {
            addCriterion("SBP_UP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrEqualTo(Short value) {
            addCriterion("SBP_UP_NBR =", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotEqualTo(Short value) {
            addCriterion("SBP_UP_NBR <>", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrGreaterThan(Short value) {
            addCriterion("SBP_UP_NBR >", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("SBP_UP_NBR >=", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLessThan(Short value) {
            addCriterion("SBP_UP_NBR <", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLessThanOrEqualTo(Short value) {
            addCriterion("SBP_UP_NBR <=", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIn(List<Short> values) {
            addCriterion("SBP_UP_NBR in", values, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotIn(List<Short> values) {
            addCriterion("SBP_UP_NBR not in", values, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrBetween(Short value1, Short value2) {
            addCriterion("SBP_UP_NBR between", value1, value2, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotBetween(Short value1, Short value2) {
            addCriterion("SBP_UP_NBR not between", value1, value2, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIsNull() {
            addCriterion("SBP_DOWN_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIsNotNull() {
            addCriterion("SBP_DOWN_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrEqualTo(Short value) {
            addCriterion("SBP_DOWN_NBR =", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotEqualTo(Short value) {
            addCriterion("SBP_DOWN_NBR <>", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrGreaterThan(Short value) {
            addCriterion("SBP_DOWN_NBR >", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("SBP_DOWN_NBR >=", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLessThan(Short value) {
            addCriterion("SBP_DOWN_NBR <", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLessThanOrEqualTo(Short value) {
            addCriterion("SBP_DOWN_NBR <=", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIn(List<Short> values) {
            addCriterion("SBP_DOWN_NBR in", values, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotIn(List<Short> values) {
            addCriterion("SBP_DOWN_NBR not in", values, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrBetween(Short value1, Short value2) {
            addCriterion("SBP_DOWN_NBR between", value1, value2, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotBetween(Short value1, Short value2) {
            addCriterion("SBP_DOWN_NBR not between", value1, value2, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrIsNull() {
            addCriterion("BRE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andBreNbrIsNotNull() {
            addCriterion("BRE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andBreNbrEqualTo(Short value) {
            addCriterion("BRE_NBR =", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotEqualTo(Short value) {
            addCriterion("BRE_NBR <>", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThan(Short value) {
            addCriterion("BRE_NBR >", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("BRE_NBR >=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThan(Short value) {
            addCriterion("BRE_NBR <", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThanOrEqualTo(Short value) {
            addCriterion("BRE_NBR <=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrIn(List<Short> values) {
            addCriterion("BRE_NBR in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotIn(List<Short> values) {
            addCriterion("BRE_NBR not in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrBetween(Short value1, Short value2) {
            addCriterion("BRE_NBR between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotBetween(Short value1, Short value2) {
            addCriterion("BRE_NBR not between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andXtIsNull() {
            addCriterion("XT is null");
            return (Criteria) this;
        }

        public Criteria andXtIsNotNull() {
            addCriterion("XT is not null");
            return (Criteria) this;
        }

        public Criteria andXtEqualTo(BigDecimal value) {
            addCriterion("XT =", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtNotEqualTo(BigDecimal value) {
            addCriterion("XT <>", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtGreaterThan(BigDecimal value) {
            addCriterion("XT >", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XT >=", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtLessThan(BigDecimal value) {
            addCriterion("XT <", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XT <=", value, "xt");
            return (Criteria) this;
        }

        public Criteria andXtIn(List<BigDecimal> values) {
            addCriterion("XT in", values, "xt");
            return (Criteria) this;
        }

        public Criteria andXtNotIn(List<BigDecimal> values) {
            addCriterion("XT not in", values, "xt");
            return (Criteria) this;
        }

        public Criteria andXtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XT between", value1, value2, "xt");
            return (Criteria) this;
        }

        public Criteria andXtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XT not between", value1, value2, "xt");
            return (Criteria) this;
        }

        public Criteria andSenRctCodIsNull() {
            addCriterion("SEN_RCT_COD is null");
            return (Criteria) this;
        }

        public Criteria andSenRctCodIsNotNull() {
            addCriterion("SEN_RCT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSenRctCodEqualTo(String value) {
            addCriterion("SEN_RCT_COD =", value, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andSenRctCodNotEqualTo(String value) {
            addCriterion("SEN_RCT_COD <>", value, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andSenRctCodGreaterThan(String value) {
            addCriterion("SEN_RCT_COD >", value, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andSenRctCodGreaterThanOrEqualTo(String value) {
            addCriterion("SEN_RCT_COD >=", value, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andSenRctCodLessThan(String value) {
            addCriterion("SEN_RCT_COD <", value, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andSenRctCodLessThanOrEqualTo(String value) {
            addCriterion("SEN_RCT_COD <=", value, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andSenRctCodLike(String value) {
            addCriterion("SEN_RCT_COD like", value, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andSenRctCodNotLike(String value) {
            addCriterion("SEN_RCT_COD not like", value, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andSenRctCodIn(List<String> values) {
            addCriterion("SEN_RCT_COD in", values, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andSenRctCodNotIn(List<String> values) {
            addCriterion("SEN_RCT_COD not in", values, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andSenRctCodBetween(String value1, String value2) {
            addCriterion("SEN_RCT_COD between", value1, value2, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andSenRctCodNotBetween(String value1, String value2) {
            addCriterion("SEN_RCT_COD not between", value1, value2, "senRctCod");
            return (Criteria) this;
        }

        public Criteria andJchlIsNull() {
            addCriterion("JCHL is null");
            return (Criteria) this;
        }

        public Criteria andJchlIsNotNull() {
            addCriterion("JCHL is not null");
            return (Criteria) this;
        }

        public Criteria andJchlEqualTo(String value) {
            addCriterion("JCHL =", value, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlNotEqualTo(String value) {
            addCriterion("JCHL <>", value, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlGreaterThan(String value) {
            addCriterion("JCHL >", value, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlGreaterThanOrEqualTo(String value) {
            addCriterion("JCHL >=", value, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlLessThan(String value) {
            addCriterion("JCHL <", value, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlLessThanOrEqualTo(String value) {
            addCriterion("JCHL <=", value, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlLike(String value) {
            addCriterion("JCHL like", value, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlNotLike(String value) {
            addCriterion("JCHL not like", value, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlIn(List<String> values) {
            addCriterion("JCHL in", values, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlNotIn(List<String> values) {
            addCriterion("JCHL not in", values, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlBetween(String value1, String value2) {
            addCriterion("JCHL between", value1, value2, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlNotBetween(String value1, String value2) {
            addCriterion("JCHL not between", value1, value2, "jchl");
            return (Criteria) this;
        }

        public Criteria andJchlQtIsNull() {
            addCriterion("JCHL_QT is null");
            return (Criteria) this;
        }

        public Criteria andJchlQtIsNotNull() {
            addCriterion("JCHL_QT is not null");
            return (Criteria) this;
        }

        public Criteria andJchlQtEqualTo(String value) {
            addCriterion("JCHL_QT =", value, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andJchlQtNotEqualTo(String value) {
            addCriterion("JCHL_QT <>", value, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andJchlQtGreaterThan(String value) {
            addCriterion("JCHL_QT >", value, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andJchlQtGreaterThanOrEqualTo(String value) {
            addCriterion("JCHL_QT >=", value, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andJchlQtLessThan(String value) {
            addCriterion("JCHL_QT <", value, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andJchlQtLessThanOrEqualTo(String value) {
            addCriterion("JCHL_QT <=", value, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andJchlQtLike(String value) {
            addCriterion("JCHL_QT like", value, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andJchlQtNotLike(String value) {
            addCriterion("JCHL_QT not like", value, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andJchlQtIn(List<String> values) {
            addCriterion("JCHL_QT in", values, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andJchlQtNotIn(List<String> values) {
            addCriterion("JCHL_QT not in", values, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andJchlQtBetween(String value1, String value2) {
            addCriterion("JCHL_QT between", value1, value2, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andJchlQtNotBetween(String value1, String value2) {
            addCriterion("JCHL_QT not between", value1, value2, "jchlQt");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoIsNull() {
            addCriterion("HS_USRNO is null");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoIsNotNull() {
            addCriterion("HS_USRNO is not null");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoEqualTo(String value) {
            addCriterion("HS_USRNO =", value, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoNotEqualTo(String value) {
            addCriterion("HS_USRNO <>", value, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoGreaterThan(String value) {
            addCriterion("HS_USRNO >", value, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoGreaterThanOrEqualTo(String value) {
            addCriterion("HS_USRNO >=", value, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoLessThan(String value) {
            addCriterion("HS_USRNO <", value, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoLessThanOrEqualTo(String value) {
            addCriterion("HS_USRNO <=", value, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoLike(String value) {
            addCriterion("HS_USRNO like", value, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoNotLike(String value) {
            addCriterion("HS_USRNO not like", value, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoIn(List<String> values) {
            addCriterion("HS_USRNO in", values, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoNotIn(List<String> values) {
            addCriterion("HS_USRNO not in", values, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoBetween(String value1, String value2) {
            addCriterion("HS_USRNO between", value1, value2, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnoNotBetween(String value1, String value2) {
            addCriterion("HS_USRNO not between", value1, value2, "hsUsrno");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameIsNull() {
            addCriterion("HS_USRNAME is null");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameIsNotNull() {
            addCriterion("HS_USRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameEqualTo(String value) {
            addCriterion("HS_USRNAME =", value, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameNotEqualTo(String value) {
            addCriterion("HS_USRNAME <>", value, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameGreaterThan(String value) {
            addCriterion("HS_USRNAME >", value, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameGreaterThanOrEqualTo(String value) {
            addCriterion("HS_USRNAME >=", value, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameLessThan(String value) {
            addCriterion("HS_USRNAME <", value, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameLessThanOrEqualTo(String value) {
            addCriterion("HS_USRNAME <=", value, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameLike(String value) {
            addCriterion("HS_USRNAME like", value, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameNotLike(String value) {
            addCriterion("HS_USRNAME not like", value, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameIn(List<String> values) {
            addCriterion("HS_USRNAME in", values, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameNotIn(List<String> values) {
            addCriterion("HS_USRNAME not in", values, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameBetween(String value1, String value2) {
            addCriterion("HS_USRNAME between", value1, value2, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andHsUsrnameNotBetween(String value1, String value2) {
            addCriterion("HS_USRNAME not between", value1, value2, "hsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoIsNull() {
            addCriterion("SJHS_USRNO is null");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoIsNotNull() {
            addCriterion("SJHS_USRNO is not null");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoEqualTo(String value) {
            addCriterion("SJHS_USRNO =", value, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoNotEqualTo(String value) {
            addCriterion("SJHS_USRNO <>", value, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoGreaterThan(String value) {
            addCriterion("SJHS_USRNO >", value, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoGreaterThanOrEqualTo(String value) {
            addCriterion("SJHS_USRNO >=", value, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoLessThan(String value) {
            addCriterion("SJHS_USRNO <", value, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoLessThanOrEqualTo(String value) {
            addCriterion("SJHS_USRNO <=", value, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoLike(String value) {
            addCriterion("SJHS_USRNO like", value, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoNotLike(String value) {
            addCriterion("SJHS_USRNO not like", value, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoIn(List<String> values) {
            addCriterion("SJHS_USRNO in", values, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoNotIn(List<String> values) {
            addCriterion("SJHS_USRNO not in", values, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoBetween(String value1, String value2) {
            addCriterion("SJHS_USRNO between", value1, value2, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnoNotBetween(String value1, String value2) {
            addCriterion("SJHS_USRNO not between", value1, value2, "sjhsUsrno");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameIsNull() {
            addCriterion("SJHS_USRNAME is null");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameIsNotNull() {
            addCriterion("SJHS_USRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameEqualTo(String value) {
            addCriterion("SJHS_USRNAME =", value, "sjhsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameNotEqualTo(String value) {
            addCriterion("SJHS_USRNAME <>", value, "sjhsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameGreaterThan(String value) {
            addCriterion("SJHS_USRNAME >", value, "sjhsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameGreaterThanOrEqualTo(String value) {
            addCriterion("SJHS_USRNAME >=", value, "sjhsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameLessThan(String value) {
            addCriterion("SJHS_USRNAME <", value, "sjhsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameLessThanOrEqualTo(String value) {
            addCriterion("SJHS_USRNAME <=", value, "sjhsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameLike(String value) {
            addCriterion("SJHS_USRNAME like", value, "sjhsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameNotLike(String value) {
            addCriterion("SJHS_USRNAME not like", value, "sjhsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameIn(List<String> values) {
            addCriterion("SJHS_USRNAME in", values, "sjhsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameNotIn(List<String> values) {
            addCriterion("SJHS_USRNAME not in", values, "sjhsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameBetween(String value1, String value2) {
            addCriterion("SJHS_USRNAME between", value1, value2, "sjhsUsrname");
            return (Criteria) this;
        }

        public Criteria andSjhsUsrnameNotBetween(String value1, String value2) {
            addCriterion("SJHS_USRNAME not between", value1, value2, "sjhsUsrname");
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

        public Criteria andCrtNurIsNull() {
            addCriterion("CRT_NUR is null");
            return (Criteria) this;
        }

        public Criteria andCrtNurIsNotNull() {
            addCriterion("CRT_NUR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNurEqualTo(String value) {
            addCriterion("CRT_NUR =", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotEqualTo(String value) {
            addCriterion("CRT_NUR <>", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurGreaterThan(String value) {
            addCriterion("CRT_NUR >", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NUR >=", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurLessThan(String value) {
            addCriterion("CRT_NUR <", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurLessThanOrEqualTo(String value) {
            addCriterion("CRT_NUR <=", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurLike(String value) {
            addCriterion("CRT_NUR like", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotLike(String value) {
            addCriterion("CRT_NUR not like", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurIn(List<String> values) {
            addCriterion("CRT_NUR in", values, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotIn(List<String> values) {
            addCriterion("CRT_NUR not in", values, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurBetween(String value1, String value2) {
            addCriterion("CRT_NUR between", value1, value2, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotBetween(String value1, String value2) {
            addCriterion("CRT_NUR not between", value1, value2, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNameIsNull() {
            addCriterion("CRT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCrtNameIsNotNull() {
            addCriterion("CRT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNameEqualTo(String value) {
            addCriterion("CRT_NAME =", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotEqualTo(String value) {
            addCriterion("CRT_NAME <>", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameGreaterThan(String value) {
            addCriterion("CRT_NAME >", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NAME >=", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameLessThan(String value) {
            addCriterion("CRT_NAME <", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameLessThanOrEqualTo(String value) {
            addCriterion("CRT_NAME <=", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameLike(String value) {
            addCriterion("CRT_NAME like", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotLike(String value) {
            addCriterion("CRT_NAME not like", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameIn(List<String> values) {
            addCriterion("CRT_NAME in", values, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotIn(List<String> values) {
            addCriterion("CRT_NAME not in", values, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameBetween(String value1, String value2) {
            addCriterion("CRT_NAME between", value1, value2, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotBetween(String value1, String value2) {
            addCriterion("CRT_NAME not between", value1, value2, "crtName");
            return (Criteria) this;
        }

        public Criteria andUpDatIsNull() {
            addCriterion("UP_DAT is null");
            return (Criteria) this;
        }

        public Criteria andUpDatIsNotNull() {
            addCriterion("UP_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpDatEqualTo(Date value) {
            addCriterion("UP_DAT =", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatNotEqualTo(Date value) {
            addCriterion("UP_DAT <>", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatGreaterThan(Date value) {
            addCriterion("UP_DAT >", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatGreaterThanOrEqualTo(Date value) {
            addCriterion("UP_DAT >=", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatLessThan(Date value) {
            addCriterion("UP_DAT <", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatLessThanOrEqualTo(Date value) {
            addCriterion("UP_DAT <=", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatIn(List<Date> values) {
            addCriterion("UP_DAT in", values, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatNotIn(List<Date> values) {
            addCriterion("UP_DAT not in", values, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatBetween(Date value1, Date value2) {
            addCriterion("UP_DAT between", value1, value2, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatNotBetween(Date value1, Date value2) {
            addCriterion("UP_DAT not between", value1, value2, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpNurIsNull() {
            addCriterion("UP_NUR is null");
            return (Criteria) this;
        }

        public Criteria andUpNurIsNotNull() {
            addCriterion("UP_NUR is not null");
            return (Criteria) this;
        }

        public Criteria andUpNurEqualTo(String value) {
            addCriterion("UP_NUR =", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotEqualTo(String value) {
            addCriterion("UP_NUR <>", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurGreaterThan(String value) {
            addCriterion("UP_NUR >", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurGreaterThanOrEqualTo(String value) {
            addCriterion("UP_NUR >=", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurLessThan(String value) {
            addCriterion("UP_NUR <", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurLessThanOrEqualTo(String value) {
            addCriterion("UP_NUR <=", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurLike(String value) {
            addCriterion("UP_NUR like", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotLike(String value) {
            addCriterion("UP_NUR not like", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurIn(List<String> values) {
            addCriterion("UP_NUR in", values, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotIn(List<String> values) {
            addCriterion("UP_NUR not in", values, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurBetween(String value1, String value2) {
            addCriterion("UP_NUR between", value1, value2, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotBetween(String value1, String value2) {
            addCriterion("UP_NUR not between", value1, value2, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNull() {
            addCriterion("UP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNotNull() {
            addCriterion("UP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpNameEqualTo(String value) {
            addCriterion("UP_NAME =", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotEqualTo(String value) {
            addCriterion("UP_NAME <>", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThan(String value) {
            addCriterion("UP_NAME >", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThanOrEqualTo(String value) {
            addCriterion("UP_NAME >=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThan(String value) {
            addCriterion("UP_NAME <", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThanOrEqualTo(String value) {
            addCriterion("UP_NAME <=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLike(String value) {
            addCriterion("UP_NAME like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotLike(String value) {
            addCriterion("UP_NAME not like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameIn(List<String> values) {
            addCriterion("UP_NAME in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotIn(List<String> values) {
            addCriterion("UP_NAME not in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameBetween(String value1, String value2) {
            addCriterion("UP_NAME between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotBetween(String value1, String value2) {
            addCriterion("UP_NAME not between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andXyIsNull() {
            addCriterion("XY is null");
            return (Criteria) this;
        }

        public Criteria andXyIsNotNull() {
            addCriterion("XY is not null");
            return (Criteria) this;
        }

        public Criteria andXyEqualTo(Short value) {
            addCriterion("XY =", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotEqualTo(Short value) {
            addCriterion("XY <>", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyGreaterThan(Short value) {
            addCriterion("XY >", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyGreaterThanOrEqualTo(Short value) {
            addCriterion("XY >=", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLessThan(Short value) {
            addCriterion("XY <", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLessThanOrEqualTo(Short value) {
            addCriterion("XY <=", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyIn(List<Short> values) {
            addCriterion("XY in", values, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotIn(List<Short> values) {
            addCriterion("XY not in", values, "xy");
            return (Criteria) this;
        }

        public Criteria andXyBetween(Short value1, Short value2) {
            addCriterion("XY between", value1, value2, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotBetween(Short value1, Short value2) {
            addCriterion("XY not between", value1, value2, "xy");
            return (Criteria) this;
        }

        public Criteria andUpDat2IsNull() {
            addCriterion("UP_DAT2 is null");
            return (Criteria) this;
        }

        public Criteria andUpDat2IsNotNull() {
            addCriterion("UP_DAT2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpDat2EqualTo(Date value) {
            addCriterion("UP_DAT2 =", value, "upDat2");
            return (Criteria) this;
        }

        public Criteria andUpDat2NotEqualTo(Date value) {
            addCriterion("UP_DAT2 <>", value, "upDat2");
            return (Criteria) this;
        }

        public Criteria andUpDat2GreaterThan(Date value) {
            addCriterion("UP_DAT2 >", value, "upDat2");
            return (Criteria) this;
        }

        public Criteria andUpDat2GreaterThanOrEqualTo(Date value) {
            addCriterion("UP_DAT2 >=", value, "upDat2");
            return (Criteria) this;
        }

        public Criteria andUpDat2LessThan(Date value) {
            addCriterion("UP_DAT2 <", value, "upDat2");
            return (Criteria) this;
        }

        public Criteria andUpDat2LessThanOrEqualTo(Date value) {
            addCriterion("UP_DAT2 <=", value, "upDat2");
            return (Criteria) this;
        }

        public Criteria andUpDat2In(List<Date> values) {
            addCriterion("UP_DAT2 in", values, "upDat2");
            return (Criteria) this;
        }

        public Criteria andUpDat2NotIn(List<Date> values) {
            addCriterion("UP_DAT2 not in", values, "upDat2");
            return (Criteria) this;
        }

        public Criteria andUpDat2Between(Date value1, Date value2) {
            addCriterion("UP_DAT2 between", value1, value2, "upDat2");
            return (Criteria) this;
        }

        public Criteria andUpDat2NotBetween(Date value1, Date value2) {
            addCriterion("UP_DAT2 not between", value1, value2, "upDat2");
            return (Criteria) this;
        }

        public Criteria andUpNur2IsNull() {
            addCriterion("UP_NUR2 is null");
            return (Criteria) this;
        }

        public Criteria andUpNur2IsNotNull() {
            addCriterion("UP_NUR2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpNur2EqualTo(String value) {
            addCriterion("UP_NUR2 =", value, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpNur2NotEqualTo(String value) {
            addCriterion("UP_NUR2 <>", value, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpNur2GreaterThan(String value) {
            addCriterion("UP_NUR2 >", value, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpNur2GreaterThanOrEqualTo(String value) {
            addCriterion("UP_NUR2 >=", value, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpNur2LessThan(String value) {
            addCriterion("UP_NUR2 <", value, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpNur2LessThanOrEqualTo(String value) {
            addCriterion("UP_NUR2 <=", value, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpNur2Like(String value) {
            addCriterion("UP_NUR2 like", value, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpNur2NotLike(String value) {
            addCriterion("UP_NUR2 not like", value, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpNur2In(List<String> values) {
            addCriterion("UP_NUR2 in", values, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpNur2NotIn(List<String> values) {
            addCriterion("UP_NUR2 not in", values, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpNur2Between(String value1, String value2) {
            addCriterion("UP_NUR2 between", value1, value2, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpNur2NotBetween(String value1, String value2) {
            addCriterion("UP_NUR2 not between", value1, value2, "upNur2");
            return (Criteria) this;
        }

        public Criteria andUpName2IsNull() {
            addCriterion("UP_NAME2 is null");
            return (Criteria) this;
        }

        public Criteria andUpName2IsNotNull() {
            addCriterion("UP_NAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpName2EqualTo(String value) {
            addCriterion("UP_NAME2 =", value, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpName2NotEqualTo(String value) {
            addCriterion("UP_NAME2 <>", value, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpName2GreaterThan(String value) {
            addCriterion("UP_NAME2 >", value, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpName2GreaterThanOrEqualTo(String value) {
            addCriterion("UP_NAME2 >=", value, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpName2LessThan(String value) {
            addCriterion("UP_NAME2 <", value, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpName2LessThanOrEqualTo(String value) {
            addCriterion("UP_NAME2 <=", value, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpName2Like(String value) {
            addCriterion("UP_NAME2 like", value, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpName2NotLike(String value) {
            addCriterion("UP_NAME2 not like", value, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpName2In(List<String> values) {
            addCriterion("UP_NAME2 in", values, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpName2NotIn(List<String> values) {
            addCriterion("UP_NAME2 not in", values, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpName2Between(String value1, String value2) {
            addCriterion("UP_NAME2 between", value1, value2, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpName2NotBetween(String value1, String value2) {
            addCriterion("UP_NAME2 not between", value1, value2, "upName2");
            return (Criteria) this;
        }

        public Criteria andUpDat3IsNull() {
            addCriterion("UP_DAT3 is null");
            return (Criteria) this;
        }

        public Criteria andUpDat3IsNotNull() {
            addCriterion("UP_DAT3 is not null");
            return (Criteria) this;
        }

        public Criteria andUpDat3EqualTo(Date value) {
            addCriterion("UP_DAT3 =", value, "upDat3");
            return (Criteria) this;
        }

        public Criteria andUpDat3NotEqualTo(Date value) {
            addCriterion("UP_DAT3 <>", value, "upDat3");
            return (Criteria) this;
        }

        public Criteria andUpDat3GreaterThan(Date value) {
            addCriterion("UP_DAT3 >", value, "upDat3");
            return (Criteria) this;
        }

        public Criteria andUpDat3GreaterThanOrEqualTo(Date value) {
            addCriterion("UP_DAT3 >=", value, "upDat3");
            return (Criteria) this;
        }

        public Criteria andUpDat3LessThan(Date value) {
            addCriterion("UP_DAT3 <", value, "upDat3");
            return (Criteria) this;
        }

        public Criteria andUpDat3LessThanOrEqualTo(Date value) {
            addCriterion("UP_DAT3 <=", value, "upDat3");
            return (Criteria) this;
        }

        public Criteria andUpDat3In(List<Date> values) {
            addCriterion("UP_DAT3 in", values, "upDat3");
            return (Criteria) this;
        }

        public Criteria andUpDat3NotIn(List<Date> values) {
            addCriterion("UP_DAT3 not in", values, "upDat3");
            return (Criteria) this;
        }

        public Criteria andUpDat3Between(Date value1, Date value2) {
            addCriterion("UP_DAT3 between", value1, value2, "upDat3");
            return (Criteria) this;
        }

        public Criteria andUpDat3NotBetween(Date value1, Date value2) {
            addCriterion("UP_DAT3 not between", value1, value2, "upDat3");
            return (Criteria) this;
        }

        public Criteria andUpNur3IsNull() {
            addCriterion("UP_NUR3 is null");
            return (Criteria) this;
        }

        public Criteria andUpNur3IsNotNull() {
            addCriterion("UP_NUR3 is not null");
            return (Criteria) this;
        }

        public Criteria andUpNur3EqualTo(String value) {
            addCriterion("UP_NUR3 =", value, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpNur3NotEqualTo(String value) {
            addCriterion("UP_NUR3 <>", value, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpNur3GreaterThan(String value) {
            addCriterion("UP_NUR3 >", value, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpNur3GreaterThanOrEqualTo(String value) {
            addCriterion("UP_NUR3 >=", value, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpNur3LessThan(String value) {
            addCriterion("UP_NUR3 <", value, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpNur3LessThanOrEqualTo(String value) {
            addCriterion("UP_NUR3 <=", value, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpNur3Like(String value) {
            addCriterion("UP_NUR3 like", value, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpNur3NotLike(String value) {
            addCriterion("UP_NUR3 not like", value, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpNur3In(List<String> values) {
            addCriterion("UP_NUR3 in", values, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpNur3NotIn(List<String> values) {
            addCriterion("UP_NUR3 not in", values, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpNur3Between(String value1, String value2) {
            addCriterion("UP_NUR3 between", value1, value2, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpNur3NotBetween(String value1, String value2) {
            addCriterion("UP_NUR3 not between", value1, value2, "upNur3");
            return (Criteria) this;
        }

        public Criteria andUpName3IsNull() {
            addCriterion("UP_NAME3 is null");
            return (Criteria) this;
        }

        public Criteria andUpName3IsNotNull() {
            addCriterion("UP_NAME3 is not null");
            return (Criteria) this;
        }

        public Criteria andUpName3EqualTo(String value) {
            addCriterion("UP_NAME3 =", value, "upName3");
            return (Criteria) this;
        }

        public Criteria andUpName3NotEqualTo(String value) {
            addCriterion("UP_NAME3 <>", value, "upName3");
            return (Criteria) this;
        }

        public Criteria andUpName3GreaterThan(String value) {
            addCriterion("UP_NAME3 >", value, "upName3");
            return (Criteria) this;
        }

        public Criteria andUpName3GreaterThanOrEqualTo(String value) {
            addCriterion("UP_NAME3 >=", value, "upName3");
            return (Criteria) this;
        }

        public Criteria andUpName3LessThan(String value) {
            addCriterion("UP_NAME3 <", value, "upName3");
            return (Criteria) this;
        }

        public Criteria andUpName3LessThanOrEqualTo(String value) {
            addCriterion("UP_NAME3 <=", value, "upName3");
            return (Criteria) this;
        }

        public Criteria andUpName3Like(String value) {
            addCriterion("UP_NAME3 like", value, "upName3");
            return (Criteria) this;
        }

        public Criteria andUpName3NotLike(String value) {
            addCriterion("UP_NAME3 not like", value, "upName3");
            return (Criteria) this;
        }

        public Criteria andUpName3In(List<String> values) {
            addCriterion("UP_NAME3 in", values, "upName3");
            return (Criteria) this;
        }

        public Criteria andUpName3NotIn(List<String> values) {
            addCriterion("UP_NAME3 not in", values, "upName3");
            return (Criteria) this;
        }

        public Criteria andUpName3Between(String value1, String value2) {
            addCriterion("UP_NAME3 between", value1, value2, "upName3");
            return (Criteria) this;
        }

        public Criteria andUpName3NotBetween(String value1, String value2) {
            addCriterion("UP_NAME3 not between", value1, value2, "upName3");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgIsNull() {
            addCriterion("TMP_NBR_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgIsNotNull() {
            addCriterion("TMP_NBR_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgEqualTo(String value) {
            addCriterion("TMP_NBR_FLG =", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgNotEqualTo(String value) {
            addCriterion("TMP_NBR_FLG <>", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgGreaterThan(String value) {
            addCriterion("TMP_NBR_FLG >", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TMP_NBR_FLG >=", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgLessThan(String value) {
            addCriterion("TMP_NBR_FLG <", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgLessThanOrEqualTo(String value) {
            addCriterion("TMP_NBR_FLG <=", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgLike(String value) {
            addCriterion("TMP_NBR_FLG like", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgNotLike(String value) {
            addCriterion("TMP_NBR_FLG not like", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgIn(List<String> values) {
            addCriterion("TMP_NBR_FLG in", values, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgNotIn(List<String> values) {
            addCriterion("TMP_NBR_FLG not in", values, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgBetween(String value1, String value2) {
            addCriterion("TMP_NBR_FLG between", value1, value2, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgNotBetween(String value1, String value2) {
            addCriterion("TMP_NBR_FLG not between", value1, value2, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgIsNull() {
            addCriterion("BRE_NBR_FLG is null");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgIsNotNull() {
            addCriterion("BRE_NBR_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgEqualTo(String value) {
            addCriterion("BRE_NBR_FLG =", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotEqualTo(String value) {
            addCriterion("BRE_NBR_FLG <>", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgGreaterThan(String value) {
            addCriterion("BRE_NBR_FLG >", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgGreaterThanOrEqualTo(String value) {
            addCriterion("BRE_NBR_FLG >=", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgLessThan(String value) {
            addCriterion("BRE_NBR_FLG <", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgLessThanOrEqualTo(String value) {
            addCriterion("BRE_NBR_FLG <=", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgLike(String value) {
            addCriterion("BRE_NBR_FLG like", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotLike(String value) {
            addCriterion("BRE_NBR_FLG not like", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgIn(List<String> values) {
            addCriterion("BRE_NBR_FLG in", values, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotIn(List<String> values) {
            addCriterion("BRE_NBR_FLG not in", values, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgBetween(String value1, String value2) {
            addCriterion("BRE_NBR_FLG between", value1, value2, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotBetween(String value1, String value2) {
            addCriterion("BRE_NBR_FLG not between", value1, value2, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgIsNull() {
            addCriterion("SBP_NBR_FLG is null");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgIsNotNull() {
            addCriterion("SBP_NBR_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgEqualTo(String value) {
            addCriterion("SBP_NBR_FLG =", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotEqualTo(String value) {
            addCriterion("SBP_NBR_FLG <>", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgGreaterThan(String value) {
            addCriterion("SBP_NBR_FLG >", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgGreaterThanOrEqualTo(String value) {
            addCriterion("SBP_NBR_FLG >=", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgLessThan(String value) {
            addCriterion("SBP_NBR_FLG <", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgLessThanOrEqualTo(String value) {
            addCriterion("SBP_NBR_FLG <=", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgLike(String value) {
            addCriterion("SBP_NBR_FLG like", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotLike(String value) {
            addCriterion("SBP_NBR_FLG not like", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgIn(List<String> values) {
            addCriterion("SBP_NBR_FLG in", values, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotIn(List<String> values) {
            addCriterion("SBP_NBR_FLG not in", values, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgBetween(String value1, String value2) {
            addCriterion("SBP_NBR_FLG between", value1, value2, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotBetween(String value1, String value2) {
            addCriterion("SBP_NBR_FLG not between", value1, value2, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgIsNull() {
            addCriterion("XY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXyFlgIsNotNull() {
            addCriterion("XY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXyFlgEqualTo(String value) {
            addCriterion("XY_FLG =", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotEqualTo(String value) {
            addCriterion("XY_FLG <>", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgGreaterThan(String value) {
            addCriterion("XY_FLG >", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XY_FLG >=", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgLessThan(String value) {
            addCriterion("XY_FLG <", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgLessThanOrEqualTo(String value) {
            addCriterion("XY_FLG <=", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgLike(String value) {
            addCriterion("XY_FLG like", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotLike(String value) {
            addCriterion("XY_FLG not like", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgIn(List<String> values) {
            addCriterion("XY_FLG in", values, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotIn(List<String> values) {
            addCriterion("XY_FLG not in", values, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgBetween(String value1, String value2) {
            addCriterion("XY_FLG between", value1, value2, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotBetween(String value1, String value2) {
            addCriterion("XY_FLG not between", value1, value2, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgIsNull() {
            addCriterion("XT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXtFlgIsNotNull() {
            addCriterion("XT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtFlgEqualTo(String value) {
            addCriterion("XT_FLG =", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgNotEqualTo(String value) {
            addCriterion("XT_FLG <>", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgGreaterThan(String value) {
            addCriterion("XT_FLG >", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XT_FLG >=", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgLessThan(String value) {
            addCriterion("XT_FLG <", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgLessThanOrEqualTo(String value) {
            addCriterion("XT_FLG <=", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgLike(String value) {
            addCriterion("XT_FLG like", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgNotLike(String value) {
            addCriterion("XT_FLG not like", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgIn(List<String> values) {
            addCriterion("XT_FLG in", values, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgNotIn(List<String> values) {
            addCriterion("XT_FLG not in", values, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgBetween(String value1, String value2) {
            addCriterion("XT_FLG between", value1, value2, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgNotBetween(String value1, String value2) {
            addCriterion("XT_FLG not between", value1, value2, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andBradenSeqIsNull() {
            addCriterion("BRADEN_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBradenSeqIsNotNull() {
            addCriterion("BRADEN_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBradenSeqEqualTo(String value) {
            addCriterion("BRADEN_SEQ =", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqNotEqualTo(String value) {
            addCriterion("BRADEN_SEQ <>", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqGreaterThan(String value) {
            addCriterion("BRADEN_SEQ >", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqGreaterThanOrEqualTo(String value) {
            addCriterion("BRADEN_SEQ >=", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqLessThan(String value) {
            addCriterion("BRADEN_SEQ <", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqLessThanOrEqualTo(String value) {
            addCriterion("BRADEN_SEQ <=", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqLike(String value) {
            addCriterion("BRADEN_SEQ like", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqNotLike(String value) {
            addCriterion("BRADEN_SEQ not like", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqIn(List<String> values) {
            addCriterion("BRADEN_SEQ in", values, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqNotIn(List<String> values) {
            addCriterion("BRADEN_SEQ not in", values, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqBetween(String value1, String value2) {
            addCriterion("BRADEN_SEQ between", value1, value2, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqNotBetween(String value1, String value2) {
            addCriterion("BRADEN_SEQ not between", value1, value2, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqIsNull() {
            addCriterion("ADL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andAdlSeqIsNotNull() {
            addCriterion("ADL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andAdlSeqEqualTo(String value) {
            addCriterion("ADL_SEQ =", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqNotEqualTo(String value) {
            addCriterion("ADL_SEQ <>", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqGreaterThan(String value) {
            addCriterion("ADL_SEQ >", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_SEQ >=", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqLessThan(String value) {
            addCriterion("ADL_SEQ <", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqLessThanOrEqualTo(String value) {
            addCriterion("ADL_SEQ <=", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqLike(String value) {
            addCriterion("ADL_SEQ like", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqNotLike(String value) {
            addCriterion("ADL_SEQ not like", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqIn(List<String> values) {
            addCriterion("ADL_SEQ in", values, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqNotIn(List<String> values) {
            addCriterion("ADL_SEQ not in", values, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqBetween(String value1, String value2) {
            addCriterion("ADL_SEQ between", value1, value2, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqNotBetween(String value1, String value2) {
            addCriterion("ADL_SEQ not between", value1, value2, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqIsNull() {
            addCriterion("ZYFXPF_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqIsNotNull() {
            addCriterion("ZYFXPF_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqEqualTo(String value) {
            addCriterion("ZYFXPF_SEQ =", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqNotEqualTo(String value) {
            addCriterion("ZYFXPF_SEQ <>", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqGreaterThan(String value) {
            addCriterion("ZYFXPF_SEQ >", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ZYFXPF_SEQ >=", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqLessThan(String value) {
            addCriterion("ZYFXPF_SEQ <", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqLessThanOrEqualTo(String value) {
            addCriterion("ZYFXPF_SEQ <=", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqLike(String value) {
            addCriterion("ZYFXPF_SEQ like", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqNotLike(String value) {
            addCriterion("ZYFXPF_SEQ not like", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqIn(List<String> values) {
            addCriterion("ZYFXPF_SEQ in", values, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqNotIn(List<String> values) {
            addCriterion("ZYFXPF_SEQ not in", values, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqBetween(String value1, String value2) {
            addCriterion("ZYFXPF_SEQ between", value1, value2, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqNotBetween(String value1, String value2) {
            addCriterion("ZYFXPF_SEQ not between", value1, value2, "zyfxpfSeq");
            return (Criteria) this;
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

        public Criteria andGcsSeqIsNull() {
            addCriterion("GCS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andGcsSeqIsNotNull() {
            addCriterion("GCS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andGcsSeqEqualTo(String value) {
            addCriterion("GCS_SEQ =", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqNotEqualTo(String value) {
            addCriterion("GCS_SEQ <>", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqGreaterThan(String value) {
            addCriterion("GCS_SEQ >", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqGreaterThanOrEqualTo(String value) {
            addCriterion("GCS_SEQ >=", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqLessThan(String value) {
            addCriterion("GCS_SEQ <", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqLessThanOrEqualTo(String value) {
            addCriterion("GCS_SEQ <=", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqLike(String value) {
            addCriterion("GCS_SEQ like", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqNotLike(String value) {
            addCriterion("GCS_SEQ not like", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqIn(List<String> values) {
            addCriterion("GCS_SEQ in", values, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqNotIn(List<String> values) {
            addCriterion("GCS_SEQ not in", values, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqBetween(String value1, String value2) {
            addCriterion("GCS_SEQ between", value1, value2, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqNotBetween(String value1, String value2) {
            addCriterion("GCS_SEQ not between", value1, value2, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqIsNull() {
            addCriterion("NRS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andNrsSeqIsNotNull() {
            addCriterion("NRS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andNrsSeqEqualTo(String value) {
            addCriterion("NRS_SEQ =", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqNotEqualTo(String value) {
            addCriterion("NRS_SEQ <>", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqGreaterThan(String value) {
            addCriterion("NRS_SEQ >", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqGreaterThanOrEqualTo(String value) {
            addCriterion("NRS_SEQ >=", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqLessThan(String value) {
            addCriterion("NRS_SEQ <", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqLessThanOrEqualTo(String value) {
            addCriterion("NRS_SEQ <=", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqLike(String value) {
            addCriterion("NRS_SEQ like", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqNotLike(String value) {
            addCriterion("NRS_SEQ not like", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqIn(List<String> values) {
            addCriterion("NRS_SEQ in", values, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqNotIn(List<String> values) {
            addCriterion("NRS_SEQ not in", values, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqBetween(String value1, String value2) {
            addCriterion("NRS_SEQ between", value1, value2, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqNotBetween(String value1, String value2) {
            addCriterion("NRS_SEQ not between", value1, value2, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andRssjIsNull() {
            addCriterion("RSSJ is null");
            return (Criteria) this;
        }

        public Criteria andRssjIsNotNull() {
            addCriterion("RSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andRssjEqualTo(Date value) {
            addCriterion("RSSJ =", value, "rssj");
            return (Criteria) this;
        }

        public Criteria andRssjNotEqualTo(Date value) {
            addCriterion("RSSJ <>", value, "rssj");
            return (Criteria) this;
        }

        public Criteria andRssjGreaterThan(Date value) {
            addCriterion("RSSJ >", value, "rssj");
            return (Criteria) this;
        }

        public Criteria andRssjGreaterThanOrEqualTo(Date value) {
            addCriterion("RSSJ >=", value, "rssj");
            return (Criteria) this;
        }

        public Criteria andRssjLessThan(Date value) {
            addCriterion("RSSJ <", value, "rssj");
            return (Criteria) this;
        }

        public Criteria andRssjLessThanOrEqualTo(Date value) {
            addCriterion("RSSJ <=", value, "rssj");
            return (Criteria) this;
        }

        public Criteria andRssjIn(List<Date> values) {
            addCriterion("RSSJ in", values, "rssj");
            return (Criteria) this;
        }

        public Criteria andRssjNotIn(List<Date> values) {
            addCriterion("RSSJ not in", values, "rssj");
            return (Criteria) this;
        }

        public Criteria andRssjBetween(Date value1, Date value2) {
            addCriterion("RSSJ between", value1, value2, "rssj");
            return (Criteria) this;
        }

        public Criteria andRssjNotBetween(Date value1, Date value2) {
            addCriterion("RSSJ not between", value1, value2, "rssj");
            return (Criteria) this;
        }

        public Criteria andXtCodIsNull() {
            addCriterion("XT_COD is null");
            return (Criteria) this;
        }

        public Criteria andXtCodIsNotNull() {
            addCriterion("XT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXtCodEqualTo(String value) {
            addCriterion("XT_COD =", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodNotEqualTo(String value) {
            addCriterion("XT_COD <>", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodGreaterThan(String value) {
            addCriterion("XT_COD >", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodGreaterThanOrEqualTo(String value) {
            addCriterion("XT_COD >=", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodLessThan(String value) {
            addCriterion("XT_COD <", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodLessThanOrEqualTo(String value) {
            addCriterion("XT_COD <=", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodLike(String value) {
            addCriterion("XT_COD like", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodNotLike(String value) {
            addCriterion("XT_COD not like", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodIn(List<String> values) {
            addCriterion("XT_COD in", values, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodNotIn(List<String> values) {
            addCriterion("XT_COD not in", values, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodBetween(String value1, String value2) {
            addCriterion("XT_COD between", value1, value2, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodNotBetween(String value1, String value2) {
            addCriterion("XT_COD not between", value1, value2, "xtCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftIsNull() {
            addCriterion("TK_LEFT is null");
            return (Criteria) this;
        }

        public Criteria andTkLeftIsNotNull() {
            addCriterion("TK_LEFT is not null");
            return (Criteria) this;
        }

        public Criteria andTkLeftEqualTo(String value) {
            addCriterion("TK_LEFT =", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftNotEqualTo(String value) {
            addCriterion("TK_LEFT <>", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftGreaterThan(String value) {
            addCriterion("TK_LEFT >", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftGreaterThanOrEqualTo(String value) {
            addCriterion("TK_LEFT >=", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftLessThan(String value) {
            addCriterion("TK_LEFT <", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftLessThanOrEqualTo(String value) {
            addCriterion("TK_LEFT <=", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftLike(String value) {
            addCriterion("TK_LEFT like", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftNotLike(String value) {
            addCriterion("TK_LEFT not like", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftIn(List<String> values) {
            addCriterion("TK_LEFT in", values, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftNotIn(List<String> values) {
            addCriterion("TK_LEFT not in", values, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftBetween(String value1, String value2) {
            addCriterion("TK_LEFT between", value1, value2, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftNotBetween(String value1, String value2) {
            addCriterion("TK_LEFT not between", value1, value2, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodIsNull() {
            addCriterion("TK_LEFT_COD is null");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodIsNotNull() {
            addCriterion("TK_LEFT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodEqualTo(String value) {
            addCriterion("TK_LEFT_COD =", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodNotEqualTo(String value) {
            addCriterion("TK_LEFT_COD <>", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodGreaterThan(String value) {
            addCriterion("TK_LEFT_COD >", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodGreaterThanOrEqualTo(String value) {
            addCriterion("TK_LEFT_COD >=", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodLessThan(String value) {
            addCriterion("TK_LEFT_COD <", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodLessThanOrEqualTo(String value) {
            addCriterion("TK_LEFT_COD <=", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodLike(String value) {
            addCriterion("TK_LEFT_COD like", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodNotLike(String value) {
            addCriterion("TK_LEFT_COD not like", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodIn(List<String> values) {
            addCriterion("TK_LEFT_COD in", values, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodNotIn(List<String> values) {
            addCriterion("TK_LEFT_COD not in", values, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodBetween(String value1, String value2) {
            addCriterion("TK_LEFT_COD between", value1, value2, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodNotBetween(String value1, String value2) {
            addCriterion("TK_LEFT_COD not between", value1, value2, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkRightIsNull() {
            addCriterion("TK_RIGHT is null");
            return (Criteria) this;
        }

        public Criteria andTkRightIsNotNull() {
            addCriterion("TK_RIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andTkRightEqualTo(String value) {
            addCriterion("TK_RIGHT =", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightNotEqualTo(String value) {
            addCriterion("TK_RIGHT <>", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightGreaterThan(String value) {
            addCriterion("TK_RIGHT >", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightGreaterThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT >=", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightLessThan(String value) {
            addCriterion("TK_RIGHT <", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightLessThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT <=", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightLike(String value) {
            addCriterion("TK_RIGHT like", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightNotLike(String value) {
            addCriterion("TK_RIGHT not like", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightIn(List<String> values) {
            addCriterion("TK_RIGHT in", values, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightNotIn(List<String> values) {
            addCriterion("TK_RIGHT not in", values, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightBetween(String value1, String value2) {
            addCriterion("TK_RIGHT between", value1, value2, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightNotBetween(String value1, String value2) {
            addCriterion("TK_RIGHT not between", value1, value2, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightCodIsNull() {
            addCriterion("TK_RIGHT_COD is null");
            return (Criteria) this;
        }

        public Criteria andTkRightCodIsNotNull() {
            addCriterion("TK_RIGHT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTkRightCodEqualTo(String value) {
            addCriterion("TK_RIGHT_COD =", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodNotEqualTo(String value) {
            addCriterion("TK_RIGHT_COD <>", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodGreaterThan(String value) {
            addCriterion("TK_RIGHT_COD >", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodGreaterThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT_COD >=", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodLessThan(String value) {
            addCriterion("TK_RIGHT_COD <", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodLessThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT_COD <=", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodLike(String value) {
            addCriterion("TK_RIGHT_COD like", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodNotLike(String value) {
            addCriterion("TK_RIGHT_COD not like", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodIn(List<String> values) {
            addCriterion("TK_RIGHT_COD in", values, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodNotIn(List<String> values) {
            addCriterion("TK_RIGHT_COD not in", values, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodBetween(String value1, String value2) {
            addCriterion("TK_RIGHT_COD between", value1, value2, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodNotBetween(String value1, String value2) {
            addCriterion("TK_RIGHT_COD not between", value1, value2, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherIsNull() {
            addCriterion("TK_LEFT_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherIsNotNull() {
            addCriterion("TK_LEFT_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherEqualTo(String value) {
            addCriterion("TK_LEFT_OTHER =", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherNotEqualTo(String value) {
            addCriterion("TK_LEFT_OTHER <>", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherGreaterThan(String value) {
            addCriterion("TK_LEFT_OTHER >", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherGreaterThanOrEqualTo(String value) {
            addCriterion("TK_LEFT_OTHER >=", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherLessThan(String value) {
            addCriterion("TK_LEFT_OTHER <", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherLessThanOrEqualTo(String value) {
            addCriterion("TK_LEFT_OTHER <=", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherLike(String value) {
            addCriterion("TK_LEFT_OTHER like", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherNotLike(String value) {
            addCriterion("TK_LEFT_OTHER not like", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherIn(List<String> values) {
            addCriterion("TK_LEFT_OTHER in", values, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherNotIn(List<String> values) {
            addCriterion("TK_LEFT_OTHER not in", values, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherBetween(String value1, String value2) {
            addCriterion("TK_LEFT_OTHER between", value1, value2, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherNotBetween(String value1, String value2) {
            addCriterion("TK_LEFT_OTHER not between", value1, value2, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherIsNull() {
            addCriterion("TK_RIGHT_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherIsNotNull() {
            addCriterion("TK_RIGHT_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherEqualTo(String value) {
            addCriterion("TK_RIGHT_OTHER =", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherNotEqualTo(String value) {
            addCriterion("TK_RIGHT_OTHER <>", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherGreaterThan(String value) {
            addCriterion("TK_RIGHT_OTHER >", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherGreaterThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT_OTHER >=", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherLessThan(String value) {
            addCriterion("TK_RIGHT_OTHER <", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherLessThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT_OTHER <=", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherLike(String value) {
            addCriterion("TK_RIGHT_OTHER like", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherNotLike(String value) {
            addCriterion("TK_RIGHT_OTHER not like", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherIn(List<String> values) {
            addCriterion("TK_RIGHT_OTHER in", values, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherNotIn(List<String> values) {
            addCriterion("TK_RIGHT_OTHER not in", values, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherBetween(String value1, String value2) {
            addCriterion("TK_RIGHT_OTHER between", value1, value2, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherNotBetween(String value1, String value2) {
            addCriterion("TK_RIGHT_OTHER not between", value1, value2, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andPulseIsNull() {
            addCriterion("PULSE is null");
            return (Criteria) this;
        }

        public Criteria andPulseIsNotNull() {
            addCriterion("PULSE is not null");
            return (Criteria) this;
        }

        public Criteria andPulseEqualTo(Short value) {
            addCriterion("PULSE =", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotEqualTo(Short value) {
            addCriterion("PULSE <>", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseGreaterThan(Short value) {
            addCriterion("PULSE >", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseGreaterThanOrEqualTo(Short value) {
            addCriterion("PULSE >=", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLessThan(Short value) {
            addCriterion("PULSE <", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLessThanOrEqualTo(Short value) {
            addCriterion("PULSE <=", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseIn(List<Short> values) {
            addCriterion("PULSE in", values, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotIn(List<Short> values) {
            addCriterion("PULSE not in", values, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseBetween(Short value1, Short value2) {
            addCriterion("PULSE between", value1, value2, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotBetween(Short value1, Short value2) {
            addCriterion("PULSE not between", value1, value2, "pulse");
            return (Criteria) this;
        }

        public Criteria andCvpIsNull() {
            addCriterion("CVP is null");
            return (Criteria) this;
        }

        public Criteria andCvpIsNotNull() {
            addCriterion("CVP is not null");
            return (Criteria) this;
        }

        public Criteria andCvpEqualTo(Short value) {
            addCriterion("CVP =", value, "cvp");
            return (Criteria) this;
        }

        public Criteria andCvpNotEqualTo(Short value) {
            addCriterion("CVP <>", value, "cvp");
            return (Criteria) this;
        }

        public Criteria andCvpGreaterThan(Short value) {
            addCriterion("CVP >", value, "cvp");
            return (Criteria) this;
        }

        public Criteria andCvpGreaterThanOrEqualTo(Short value) {
            addCriterion("CVP >=", value, "cvp");
            return (Criteria) this;
        }

        public Criteria andCvpLessThan(Short value) {
            addCriterion("CVP <", value, "cvp");
            return (Criteria) this;
        }

        public Criteria andCvpLessThanOrEqualTo(Short value) {
            addCriterion("CVP <=", value, "cvp");
            return (Criteria) this;
        }

        public Criteria andCvpIn(List<Short> values) {
            addCriterion("CVP in", values, "cvp");
            return (Criteria) this;
        }

        public Criteria andCvpNotIn(List<Short> values) {
            addCriterion("CVP not in", values, "cvp");
            return (Criteria) this;
        }

        public Criteria andCvpBetween(Short value1, Short value2) {
            addCriterion("CVP between", value1, value2, "cvp");
            return (Criteria) this;
        }

        public Criteria andCvpNotBetween(Short value1, Short value2) {
            addCriterion("CVP not between", value1, value2, "cvp");
            return (Criteria) this;
        }

        public Criteria andPulseFlgIsNull() {
            addCriterion("PULSE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andPulseFlgIsNotNull() {
            addCriterion("PULSE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andPulseFlgEqualTo(String value) {
            addCriterion("PULSE_FLG =", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgNotEqualTo(String value) {
            addCriterion("PULSE_FLG <>", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgGreaterThan(String value) {
            addCriterion("PULSE_FLG >", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgGreaterThanOrEqualTo(String value) {
            addCriterion("PULSE_FLG >=", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgLessThan(String value) {
            addCriterion("PULSE_FLG <", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgLessThanOrEqualTo(String value) {
            addCriterion("PULSE_FLG <=", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgLike(String value) {
            addCriterion("PULSE_FLG like", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgNotLike(String value) {
            addCriterion("PULSE_FLG not like", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgIn(List<String> values) {
            addCriterion("PULSE_FLG in", values, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgNotIn(List<String> values) {
            addCriterion("PULSE_FLG not in", values, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgBetween(String value1, String value2) {
            addCriterion("PULSE_FLG between", value1, value2, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgNotBetween(String value1, String value2) {
            addCriterion("PULSE_FLG not between", value1, value2, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgIsNull() {
            addCriterion("HRT_RTE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgIsNotNull() {
            addCriterion("HRT_RTE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgEqualTo(String value) {
            addCriterion("HRT_RTE_FLG =", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgNotEqualTo(String value) {
            addCriterion("HRT_RTE_FLG <>", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgGreaterThan(String value) {
            addCriterion("HRT_RTE_FLG >", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgGreaterThanOrEqualTo(String value) {
            addCriterion("HRT_RTE_FLG >=", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgLessThan(String value) {
            addCriterion("HRT_RTE_FLG <", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgLessThanOrEqualTo(String value) {
            addCriterion("HRT_RTE_FLG <=", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgLike(String value) {
            addCriterion("HRT_RTE_FLG like", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgNotLike(String value) {
            addCriterion("HRT_RTE_FLG not like", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgIn(List<String> values) {
            addCriterion("HRT_RTE_FLG in", values, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgNotIn(List<String> values) {
            addCriterion("HRT_RTE_FLG not in", values, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgBetween(String value1, String value2) {
            addCriterion("HRT_RTE_FLG between", value1, value2, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgNotBetween(String value1, String value2) {
            addCriterion("HRT_RTE_FLG not between", value1, value2, "hrtRteFlg");
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