package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspLqblInfExample {
    /**
     * ZJYY.HSP_LQBL_INF
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_LQBL_INF
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_LQBL_INF
     */
    protected List<Criteria> oredCriteria;

    public HspLqblInfExample() {
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

    /**
     * ZJYY.HSP_LQBL_INF 2020-08-11
     */
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

        public Criteria andLqblSeqIsNull() {
            addCriterion("LQBL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andLqblSeqIsNotNull() {
            addCriterion("LQBL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andLqblSeqEqualTo(String value) {
            addCriterion("LQBL_SEQ =", value, "lqblSeq");
            return (Criteria) this;
        }

        public Criteria andLqblSeqNotEqualTo(String value) {
            addCriterion("LQBL_SEQ <>", value, "lqblSeq");
            return (Criteria) this;
        }

        public Criteria andLqblSeqGreaterThan(String value) {
            addCriterion("LQBL_SEQ >", value, "lqblSeq");
            return (Criteria) this;
        }

        public Criteria andLqblSeqGreaterThanOrEqualTo(String value) {
            addCriterion("LQBL_SEQ >=", value, "lqblSeq");
            return (Criteria) this;
        }

        public Criteria andLqblSeqLessThan(String value) {
            addCriterion("LQBL_SEQ <", value, "lqblSeq");
            return (Criteria) this;
        }

        public Criteria andLqblSeqLessThanOrEqualTo(String value) {
            addCriterion("LQBL_SEQ <=", value, "lqblSeq");
            return (Criteria) this;
        }

        public Criteria andLqblSeqLike(String value) {
            addCriterion("LQBL_SEQ like", value, "lqblSeq");
            return (Criteria) this;
        }

        public Criteria andLqblSeqNotLike(String value) {
            addCriterion("LQBL_SEQ not like", value, "lqblSeq");
            return (Criteria) this;
        }

        public Criteria andLqblSeqIn(List<String> values) {
            addCriterion("LQBL_SEQ in", values, "lqblSeq");
            return (Criteria) this;
        }

        public Criteria andLqblSeqNotIn(List<String> values) {
            addCriterion("LQBL_SEQ not in", values, "lqblSeq");
            return (Criteria) this;
        }

        public Criteria andLqblSeqBetween(String value1, String value2) {
            addCriterion("LQBL_SEQ between", value1, value2, "lqblSeq");
            return (Criteria) this;
        }

        public Criteria andLqblSeqNotBetween(String value1, String value2) {
            addCriterion("LQBL_SEQ not between", value1, value2, "lqblSeq");
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

        public Criteria andMedHisCodIsNull() {
            addCriterion("MED_HIS_COD is null");
            return (Criteria) this;
        }

        public Criteria andMedHisCodIsNotNull() {
            addCriterion("MED_HIS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMedHisCodEqualTo(String value) {
            addCriterion("MED_HIS_COD =", value, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisCodNotEqualTo(String value) {
            addCriterion("MED_HIS_COD <>", value, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisCodGreaterThan(String value) {
            addCriterion("MED_HIS_COD >", value, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisCodGreaterThanOrEqualTo(String value) {
            addCriterion("MED_HIS_COD >=", value, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisCodLessThan(String value) {
            addCriterion("MED_HIS_COD <", value, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisCodLessThanOrEqualTo(String value) {
            addCriterion("MED_HIS_COD <=", value, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisCodLike(String value) {
            addCriterion("MED_HIS_COD like", value, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisCodNotLike(String value) {
            addCriterion("MED_HIS_COD not like", value, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisCodIn(List<String> values) {
            addCriterion("MED_HIS_COD in", values, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisCodNotIn(List<String> values) {
            addCriterion("MED_HIS_COD not in", values, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisCodBetween(String value1, String value2) {
            addCriterion("MED_HIS_COD between", value1, value2, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisCodNotBetween(String value1, String value2) {
            addCriterion("MED_HIS_COD not between", value1, value2, "medHisCod");
            return (Criteria) this;
        }

        public Criteria andMedHisIsNull() {
            addCriterion("MED_HIS is null");
            return (Criteria) this;
        }

        public Criteria andMedHisIsNotNull() {
            addCriterion("MED_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andMedHisEqualTo(String value) {
            addCriterion("MED_HIS =", value, "medHis");
            return (Criteria) this;
        }

        public Criteria andMedHisNotEqualTo(String value) {
            addCriterion("MED_HIS <>", value, "medHis");
            return (Criteria) this;
        }

        public Criteria andMedHisGreaterThan(String value) {
            addCriterion("MED_HIS >", value, "medHis");
            return (Criteria) this;
        }

        public Criteria andMedHisGreaterThanOrEqualTo(String value) {
            addCriterion("MED_HIS >=", value, "medHis");
            return (Criteria) this;
        }

        public Criteria andMedHisLessThan(String value) {
            addCriterion("MED_HIS <", value, "medHis");
            return (Criteria) this;
        }

        public Criteria andMedHisLessThanOrEqualTo(String value) {
            addCriterion("MED_HIS <=", value, "medHis");
            return (Criteria) this;
        }

        public Criteria andMedHisLike(String value) {
            addCriterion("MED_HIS like", value, "medHis");
            return (Criteria) this;
        }

        public Criteria andMedHisNotLike(String value) {
            addCriterion("MED_HIS not like", value, "medHis");
            return (Criteria) this;
        }

        public Criteria andMedHisIn(List<String> values) {
            addCriterion("MED_HIS in", values, "medHis");
            return (Criteria) this;
        }

        public Criteria andMedHisNotIn(List<String> values) {
            addCriterion("MED_HIS not in", values, "medHis");
            return (Criteria) this;
        }

        public Criteria andMedHisBetween(String value1, String value2) {
            addCriterion("MED_HIS between", value1, value2, "medHis");
            return (Criteria) this;
        }

        public Criteria andMedHisNotBetween(String value1, String value2) {
            addCriterion("MED_HIS not between", value1, value2, "medHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodIsNull() {
            addCriterion("DRUG_HIS_COD is null");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodIsNotNull() {
            addCriterion("DRUG_HIS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodEqualTo(String value) {
            addCriterion("DRUG_HIS_COD =", value, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodNotEqualTo(String value) {
            addCriterion("DRUG_HIS_COD <>", value, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodGreaterThan(String value) {
            addCriterion("DRUG_HIS_COD >", value, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_HIS_COD >=", value, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodLessThan(String value) {
            addCriterion("DRUG_HIS_COD <", value, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodLessThanOrEqualTo(String value) {
            addCriterion("DRUG_HIS_COD <=", value, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodLike(String value) {
            addCriterion("DRUG_HIS_COD like", value, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodNotLike(String value) {
            addCriterion("DRUG_HIS_COD not like", value, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodIn(List<String> values) {
            addCriterion("DRUG_HIS_COD in", values, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodNotIn(List<String> values) {
            addCriterion("DRUG_HIS_COD not in", values, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodBetween(String value1, String value2) {
            addCriterion("DRUG_HIS_COD between", value1, value2, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisCodNotBetween(String value1, String value2) {
            addCriterion("DRUG_HIS_COD not between", value1, value2, "drugHisCod");
            return (Criteria) this;
        }

        public Criteria andDrugHisIsNull() {
            addCriterion("DRUG_HIS is null");
            return (Criteria) this;
        }

        public Criteria andDrugHisIsNotNull() {
            addCriterion("DRUG_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andDrugHisEqualTo(String value) {
            addCriterion("DRUG_HIS =", value, "drugHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisNotEqualTo(String value) {
            addCriterion("DRUG_HIS <>", value, "drugHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisGreaterThan(String value) {
            addCriterion("DRUG_HIS >", value, "drugHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_HIS >=", value, "drugHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisLessThan(String value) {
            addCriterion("DRUG_HIS <", value, "drugHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisLessThanOrEqualTo(String value) {
            addCriterion("DRUG_HIS <=", value, "drugHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisLike(String value) {
            addCriterion("DRUG_HIS like", value, "drugHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisNotLike(String value) {
            addCriterion("DRUG_HIS not like", value, "drugHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisIn(List<String> values) {
            addCriterion("DRUG_HIS in", values, "drugHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisNotIn(List<String> values) {
            addCriterion("DRUG_HIS not in", values, "drugHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisBetween(String value1, String value2) {
            addCriterion("DRUG_HIS between", value1, value2, "drugHis");
            return (Criteria) this;
        }

        public Criteria andDrugHisNotBetween(String value1, String value2) {
            addCriterion("DRUG_HIS not between", value1, value2, "drugHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodIsNull() {
            addCriterion("OPRT_HIS_COD is null");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodIsNotNull() {
            addCriterion("OPRT_HIS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodEqualTo(String value) {
            addCriterion("OPRT_HIS_COD =", value, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodNotEqualTo(String value) {
            addCriterion("OPRT_HIS_COD <>", value, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodGreaterThan(String value) {
            addCriterion("OPRT_HIS_COD >", value, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodGreaterThanOrEqualTo(String value) {
            addCriterion("OPRT_HIS_COD >=", value, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodLessThan(String value) {
            addCriterion("OPRT_HIS_COD <", value, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodLessThanOrEqualTo(String value) {
            addCriterion("OPRT_HIS_COD <=", value, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodLike(String value) {
            addCriterion("OPRT_HIS_COD like", value, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodNotLike(String value) {
            addCriterion("OPRT_HIS_COD not like", value, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodIn(List<String> values) {
            addCriterion("OPRT_HIS_COD in", values, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodNotIn(List<String> values) {
            addCriterion("OPRT_HIS_COD not in", values, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodBetween(String value1, String value2) {
            addCriterion("OPRT_HIS_COD between", value1, value2, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisCodNotBetween(String value1, String value2) {
            addCriterion("OPRT_HIS_COD not between", value1, value2, "oprtHisCod");
            return (Criteria) this;
        }

        public Criteria andOprtHisIsNull() {
            addCriterion("OPRT_HIS is null");
            return (Criteria) this;
        }

        public Criteria andOprtHisIsNotNull() {
            addCriterion("OPRT_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andOprtHisEqualTo(String value) {
            addCriterion("OPRT_HIS =", value, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisNotEqualTo(String value) {
            addCriterion("OPRT_HIS <>", value, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisGreaterThan(String value) {
            addCriterion("OPRT_HIS >", value, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisGreaterThanOrEqualTo(String value) {
            addCriterion("OPRT_HIS >=", value, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisLessThan(String value) {
            addCriterion("OPRT_HIS <", value, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisLessThanOrEqualTo(String value) {
            addCriterion("OPRT_HIS <=", value, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisLike(String value) {
            addCriterion("OPRT_HIS like", value, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisNotLike(String value) {
            addCriterion("OPRT_HIS not like", value, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisIn(List<String> values) {
            addCriterion("OPRT_HIS in", values, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisNotIn(List<String> values) {
            addCriterion("OPRT_HIS not in", values, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisBetween(String value1, String value2) {
            addCriterion("OPRT_HIS between", value1, value2, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andOprtHisNotBetween(String value1, String value2) {
            addCriterion("OPRT_HIS not between", value1, value2, "oprtHis");
            return (Criteria) this;
        }

        public Criteria andTramHisCodIsNull() {
            addCriterion("TRAM_HIS_COD is null");
            return (Criteria) this;
        }

        public Criteria andTramHisCodIsNotNull() {
            addCriterion("TRAM_HIS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTramHisCodEqualTo(String value) {
            addCriterion("TRAM_HIS_COD =", value, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisCodNotEqualTo(String value) {
            addCriterion("TRAM_HIS_COD <>", value, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisCodGreaterThan(String value) {
            addCriterion("TRAM_HIS_COD >", value, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisCodGreaterThanOrEqualTo(String value) {
            addCriterion("TRAM_HIS_COD >=", value, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisCodLessThan(String value) {
            addCriterion("TRAM_HIS_COD <", value, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisCodLessThanOrEqualTo(String value) {
            addCriterion("TRAM_HIS_COD <=", value, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisCodLike(String value) {
            addCriterion("TRAM_HIS_COD like", value, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisCodNotLike(String value) {
            addCriterion("TRAM_HIS_COD not like", value, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisCodIn(List<String> values) {
            addCriterion("TRAM_HIS_COD in", values, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisCodNotIn(List<String> values) {
            addCriterion("TRAM_HIS_COD not in", values, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisCodBetween(String value1, String value2) {
            addCriterion("TRAM_HIS_COD between", value1, value2, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisCodNotBetween(String value1, String value2) {
            addCriterion("TRAM_HIS_COD not between", value1, value2, "tramHisCod");
            return (Criteria) this;
        }

        public Criteria andTramHisIsNull() {
            addCriterion("TRAM_HIS is null");
            return (Criteria) this;
        }

        public Criteria andTramHisIsNotNull() {
            addCriterion("TRAM_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andTramHisEqualTo(String value) {
            addCriterion("TRAM_HIS =", value, "tramHis");
            return (Criteria) this;
        }

        public Criteria andTramHisNotEqualTo(String value) {
            addCriterion("TRAM_HIS <>", value, "tramHis");
            return (Criteria) this;
        }

        public Criteria andTramHisGreaterThan(String value) {
            addCriterion("TRAM_HIS >", value, "tramHis");
            return (Criteria) this;
        }

        public Criteria andTramHisGreaterThanOrEqualTo(String value) {
            addCriterion("TRAM_HIS >=", value, "tramHis");
            return (Criteria) this;
        }

        public Criteria andTramHisLessThan(String value) {
            addCriterion("TRAM_HIS <", value, "tramHis");
            return (Criteria) this;
        }

        public Criteria andTramHisLessThanOrEqualTo(String value) {
            addCriterion("TRAM_HIS <=", value, "tramHis");
            return (Criteria) this;
        }

        public Criteria andTramHisLike(String value) {
            addCriterion("TRAM_HIS like", value, "tramHis");
            return (Criteria) this;
        }

        public Criteria andTramHisNotLike(String value) {
            addCriterion("TRAM_HIS not like", value, "tramHis");
            return (Criteria) this;
        }

        public Criteria andTramHisIn(List<String> values) {
            addCriterion("TRAM_HIS in", values, "tramHis");
            return (Criteria) this;
        }

        public Criteria andTramHisNotIn(List<String> values) {
            addCriterion("TRAM_HIS not in", values, "tramHis");
            return (Criteria) this;
        }

        public Criteria andTramHisBetween(String value1, String value2) {
            addCriterion("TRAM_HIS between", value1, value2, "tramHis");
            return (Criteria) this;
        }

        public Criteria andTramHisNotBetween(String value1, String value2) {
            addCriterion("TRAM_HIS not between", value1, value2, "tramHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodIsNull() {
            addCriterion("CRB_HIS_COD is null");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodIsNotNull() {
            addCriterion("CRB_HIS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodEqualTo(String value) {
            addCriterion("CRB_HIS_COD =", value, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodNotEqualTo(String value) {
            addCriterion("CRB_HIS_COD <>", value, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodGreaterThan(String value) {
            addCriterion("CRB_HIS_COD >", value, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodGreaterThanOrEqualTo(String value) {
            addCriterion("CRB_HIS_COD >=", value, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodLessThan(String value) {
            addCriterion("CRB_HIS_COD <", value, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodLessThanOrEqualTo(String value) {
            addCriterion("CRB_HIS_COD <=", value, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodLike(String value) {
            addCriterion("CRB_HIS_COD like", value, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodNotLike(String value) {
            addCriterion("CRB_HIS_COD not like", value, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodIn(List<String> values) {
            addCriterion("CRB_HIS_COD in", values, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodNotIn(List<String> values) {
            addCriterion("CRB_HIS_COD not in", values, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodBetween(String value1, String value2) {
            addCriterion("CRB_HIS_COD between", value1, value2, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisCodNotBetween(String value1, String value2) {
            addCriterion("CRB_HIS_COD not between", value1, value2, "crbHisCod");
            return (Criteria) this;
        }

        public Criteria andCrbHisIsNull() {
            addCriterion("CRB_HIS is null");
            return (Criteria) this;
        }

        public Criteria andCrbHisIsNotNull() {
            addCriterion("CRB_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andCrbHisEqualTo(String value) {
            addCriterion("CRB_HIS =", value, "crbHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisNotEqualTo(String value) {
            addCriterion("CRB_HIS <>", value, "crbHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisGreaterThan(String value) {
            addCriterion("CRB_HIS >", value, "crbHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisGreaterThanOrEqualTo(String value) {
            addCriterion("CRB_HIS >=", value, "crbHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisLessThan(String value) {
            addCriterion("CRB_HIS <", value, "crbHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisLessThanOrEqualTo(String value) {
            addCriterion("CRB_HIS <=", value, "crbHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisLike(String value) {
            addCriterion("CRB_HIS like", value, "crbHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisNotLike(String value) {
            addCriterion("CRB_HIS not like", value, "crbHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisIn(List<String> values) {
            addCriterion("CRB_HIS in", values, "crbHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisNotIn(List<String> values) {
            addCriterion("CRB_HIS not in", values, "crbHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisBetween(String value1, String value2) {
            addCriterion("CRB_HIS between", value1, value2, "crbHis");
            return (Criteria) this;
        }

        public Criteria andCrbHisNotBetween(String value1, String value2) {
            addCriterion("CRB_HIS not between", value1, value2, "crbHis");
            return (Criteria) this;
        }

        public Criteria andObstHisIsNull() {
            addCriterion("OBST_HIS is null");
            return (Criteria) this;
        }

        public Criteria andObstHisIsNotNull() {
            addCriterion("OBST_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andObstHisEqualTo(String value) {
            addCriterion("OBST_HIS =", value, "obstHis");
            return (Criteria) this;
        }

        public Criteria andObstHisNotEqualTo(String value) {
            addCriterion("OBST_HIS <>", value, "obstHis");
            return (Criteria) this;
        }

        public Criteria andObstHisGreaterThan(String value) {
            addCriterion("OBST_HIS >", value, "obstHis");
            return (Criteria) this;
        }

        public Criteria andObstHisGreaterThanOrEqualTo(String value) {
            addCriterion("OBST_HIS >=", value, "obstHis");
            return (Criteria) this;
        }

        public Criteria andObstHisLessThan(String value) {
            addCriterion("OBST_HIS <", value, "obstHis");
            return (Criteria) this;
        }

        public Criteria andObstHisLessThanOrEqualTo(String value) {
            addCriterion("OBST_HIS <=", value, "obstHis");
            return (Criteria) this;
        }

        public Criteria andObstHisLike(String value) {
            addCriterion("OBST_HIS like", value, "obstHis");
            return (Criteria) this;
        }

        public Criteria andObstHisNotLike(String value) {
            addCriterion("OBST_HIS not like", value, "obstHis");
            return (Criteria) this;
        }

        public Criteria andObstHisIn(List<String> values) {
            addCriterion("OBST_HIS in", values, "obstHis");
            return (Criteria) this;
        }

        public Criteria andObstHisNotIn(List<String> values) {
            addCriterion("OBST_HIS not in", values, "obstHis");
            return (Criteria) this;
        }

        public Criteria andObstHisBetween(String value1, String value2) {
            addCriterion("OBST_HIS between", value1, value2, "obstHis");
            return (Criteria) this;
        }

        public Criteria andObstHisNotBetween(String value1, String value2) {
            addCriterion("OBST_HIS not between", value1, value2, "obstHis");
            return (Criteria) this;
        }

        public Criteria andMcyjDatIsNull() {
            addCriterion("MCYJ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andMcyjDatIsNotNull() {
            addCriterion("MCYJ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andMcyjDatEqualTo(Date value) {
            addCriterion("MCYJ_DAT =", value, "mcyjDat");
            return (Criteria) this;
        }

        public Criteria andMcyjDatNotEqualTo(Date value) {
            addCriterion("MCYJ_DAT <>", value, "mcyjDat");
            return (Criteria) this;
        }

        public Criteria andMcyjDatGreaterThan(Date value) {
            addCriterion("MCYJ_DAT >", value, "mcyjDat");
            return (Criteria) this;
        }

        public Criteria andMcyjDatGreaterThanOrEqualTo(Date value) {
            addCriterion("MCYJ_DAT >=", value, "mcyjDat");
            return (Criteria) this;
        }

        public Criteria andMcyjDatLessThan(Date value) {
            addCriterion("MCYJ_DAT <", value, "mcyjDat");
            return (Criteria) this;
        }

        public Criteria andMcyjDatLessThanOrEqualTo(Date value) {
            addCriterion("MCYJ_DAT <=", value, "mcyjDat");
            return (Criteria) this;
        }

        public Criteria andMcyjDatIn(List<Date> values) {
            addCriterion("MCYJ_DAT in", values, "mcyjDat");
            return (Criteria) this;
        }

        public Criteria andMcyjDatNotIn(List<Date> values) {
            addCriterion("MCYJ_DAT not in", values, "mcyjDat");
            return (Criteria) this;
        }

        public Criteria andMcyjDatBetween(Date value1, Date value2) {
            addCriterion("MCYJ_DAT between", value1, value2, "mcyjDat");
            return (Criteria) this;
        }

        public Criteria andMcyjDatNotBetween(Date value1, Date value2) {
            addCriterion("MCYJ_DAT not between", value1, value2, "mcyjDat");
            return (Criteria) this;
        }

        public Criteria andFamlHisIsNull() {
            addCriterion("FAML_HIS is null");
            return (Criteria) this;
        }

        public Criteria andFamlHisIsNotNull() {
            addCriterion("FAML_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andFamlHisEqualTo(String value) {
            addCriterion("FAML_HIS =", value, "famlHis");
            return (Criteria) this;
        }

        public Criteria andFamlHisNotEqualTo(String value) {
            addCriterion("FAML_HIS <>", value, "famlHis");
            return (Criteria) this;
        }

        public Criteria andFamlHisGreaterThan(String value) {
            addCriterion("FAML_HIS >", value, "famlHis");
            return (Criteria) this;
        }

        public Criteria andFamlHisGreaterThanOrEqualTo(String value) {
            addCriterion("FAML_HIS >=", value, "famlHis");
            return (Criteria) this;
        }

        public Criteria andFamlHisLessThan(String value) {
            addCriterion("FAML_HIS <", value, "famlHis");
            return (Criteria) this;
        }

        public Criteria andFamlHisLessThanOrEqualTo(String value) {
            addCriterion("FAML_HIS <=", value, "famlHis");
            return (Criteria) this;
        }

        public Criteria andFamlHisLike(String value) {
            addCriterion("FAML_HIS like", value, "famlHis");
            return (Criteria) this;
        }

        public Criteria andFamlHisNotLike(String value) {
            addCriterion("FAML_HIS not like", value, "famlHis");
            return (Criteria) this;
        }

        public Criteria andFamlHisIn(List<String> values) {
            addCriterion("FAML_HIS in", values, "famlHis");
            return (Criteria) this;
        }

        public Criteria andFamlHisNotIn(List<String> values) {
            addCriterion("FAML_HIS not in", values, "famlHis");
            return (Criteria) this;
        }

        public Criteria andFamlHisBetween(String value1, String value2) {
            addCriterion("FAML_HIS between", value1, value2, "famlHis");
            return (Criteria) this;
        }

        public Criteria andFamlHisNotBetween(String value1, String value2) {
            addCriterion("FAML_HIS not between", value1, value2, "famlHis");
            return (Criteria) this;
        }

        public Criteria andRsztCodIsNull() {
            addCriterion("RSZT_COD is null");
            return (Criteria) this;
        }

        public Criteria andRsztCodIsNotNull() {
            addCriterion("RSZT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRsztCodEqualTo(String value) {
            addCriterion("RSZT_COD =", value, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andRsztCodNotEqualTo(String value) {
            addCriterion("RSZT_COD <>", value, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andRsztCodGreaterThan(String value) {
            addCriterion("RSZT_COD >", value, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andRsztCodGreaterThanOrEqualTo(String value) {
            addCriterion("RSZT_COD >=", value, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andRsztCodLessThan(String value) {
            addCriterion("RSZT_COD <", value, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andRsztCodLessThanOrEqualTo(String value) {
            addCriterion("RSZT_COD <=", value, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andRsztCodLike(String value) {
            addCriterion("RSZT_COD like", value, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andRsztCodNotLike(String value) {
            addCriterion("RSZT_COD not like", value, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andRsztCodIn(List<String> values) {
            addCriterion("RSZT_COD in", values, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andRsztCodNotIn(List<String> values) {
            addCriterion("RSZT_COD not in", values, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andRsztCodBetween(String value1, String value2) {
            addCriterion("RSZT_COD between", value1, value2, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andRsztCodNotBetween(String value1, String value2) {
            addCriterion("RSZT_COD not between", value1, value2, "rsztCod");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgIsNull() {
            addCriterion("TGJC_XY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgIsNotNull() {
            addCriterion("TGJC_XY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgEqualTo(String value) {
            addCriterion("TGJC_XY_FLG =", value, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgNotEqualTo(String value) {
            addCriterion("TGJC_XY_FLG <>", value, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgGreaterThan(String value) {
            addCriterion("TGJC_XY_FLG >", value, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_XY_FLG >=", value, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgLessThan(String value) {
            addCriterion("TGJC_XY_FLG <", value, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgLessThanOrEqualTo(String value) {
            addCriterion("TGJC_XY_FLG <=", value, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgLike(String value) {
            addCriterion("TGJC_XY_FLG like", value, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgNotLike(String value) {
            addCriterion("TGJC_XY_FLG not like", value, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgIn(List<String> values) {
            addCriterion("TGJC_XY_FLG in", values, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgNotIn(List<String> values) {
            addCriterion("TGJC_XY_FLG not in", values, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgBetween(String value1, String value2) {
            addCriterion("TGJC_XY_FLG between", value1, value2, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyFlgNotBetween(String value1, String value2) {
            addCriterion("TGJC_XY_FLG not between", value1, value2, "tgjcXyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpIsNull() {
            addCriterion("TGJC_XY_UP is null");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpIsNotNull() {
            addCriterion("TGJC_XY_UP is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpEqualTo(String value) {
            addCriterion("TGJC_XY_UP =", value, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpNotEqualTo(String value) {
            addCriterion("TGJC_XY_UP <>", value, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpGreaterThan(String value) {
            addCriterion("TGJC_XY_UP >", value, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_XY_UP >=", value, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpLessThan(String value) {
            addCriterion("TGJC_XY_UP <", value, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpLessThanOrEqualTo(String value) {
            addCriterion("TGJC_XY_UP <=", value, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpLike(String value) {
            addCriterion("TGJC_XY_UP like", value, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpNotLike(String value) {
            addCriterion("TGJC_XY_UP not like", value, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpIn(List<String> values) {
            addCriterion("TGJC_XY_UP in", values, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpNotIn(List<String> values) {
            addCriterion("TGJC_XY_UP not in", values, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpBetween(String value1, String value2) {
            addCriterion("TGJC_XY_UP between", value1, value2, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyUpNotBetween(String value1, String value2) {
            addCriterion("TGJC_XY_UP not between", value1, value2, "tgjcXyUp");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownIsNull() {
            addCriterion("TGJC_XY_DOWN is null");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownIsNotNull() {
            addCriterion("TGJC_XY_DOWN is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownEqualTo(String value) {
            addCriterion("TGJC_XY_DOWN =", value, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownNotEqualTo(String value) {
            addCriterion("TGJC_XY_DOWN <>", value, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownGreaterThan(String value) {
            addCriterion("TGJC_XY_DOWN >", value, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_XY_DOWN >=", value, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownLessThan(String value) {
            addCriterion("TGJC_XY_DOWN <", value, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownLessThanOrEqualTo(String value) {
            addCriterion("TGJC_XY_DOWN <=", value, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownLike(String value) {
            addCriterion("TGJC_XY_DOWN like", value, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownNotLike(String value) {
            addCriterion("TGJC_XY_DOWN not like", value, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownIn(List<String> values) {
            addCriterion("TGJC_XY_DOWN in", values, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownNotIn(List<String> values) {
            addCriterion("TGJC_XY_DOWN not in", values, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownBetween(String value1, String value2) {
            addCriterion("TGJC_XY_DOWN between", value1, value2, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcXyDownNotBetween(String value1, String value2) {
            addCriterion("TGJC_XY_DOWN not between", value1, value2, "tgjcXyDown");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgIsNull() {
            addCriterion("TGJC_TW_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgIsNotNull() {
            addCriterion("TGJC_TW_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgEqualTo(String value) {
            addCriterion("TGJC_TW_FLG =", value, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgNotEqualTo(String value) {
            addCriterion("TGJC_TW_FLG <>", value, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgGreaterThan(String value) {
            addCriterion("TGJC_TW_FLG >", value, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_TW_FLG >=", value, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgLessThan(String value) {
            addCriterion("TGJC_TW_FLG <", value, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgLessThanOrEqualTo(String value) {
            addCriterion("TGJC_TW_FLG <=", value, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgLike(String value) {
            addCriterion("TGJC_TW_FLG like", value, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgNotLike(String value) {
            addCriterion("TGJC_TW_FLG not like", value, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgIn(List<String> values) {
            addCriterion("TGJC_TW_FLG in", values, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgNotIn(List<String> values) {
            addCriterion("TGJC_TW_FLG not in", values, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgBetween(String value1, String value2) {
            addCriterion("TGJC_TW_FLG between", value1, value2, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwFlgNotBetween(String value1, String value2) {
            addCriterion("TGJC_TW_FLG not between", value1, value2, "tgjcTwFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcTwIsNull() {
            addCriterion("TGJC_TW is null");
            return (Criteria) this;
        }

        public Criteria andTgjcTwIsNotNull() {
            addCriterion("TGJC_TW is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcTwEqualTo(String value) {
            addCriterion("TGJC_TW =", value, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcTwNotEqualTo(String value) {
            addCriterion("TGJC_TW <>", value, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcTwGreaterThan(String value) {
            addCriterion("TGJC_TW >", value, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcTwGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_TW >=", value, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcTwLessThan(String value) {
            addCriterion("TGJC_TW <", value, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcTwLessThanOrEqualTo(String value) {
            addCriterion("TGJC_TW <=", value, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcTwLike(String value) {
            addCriterion("TGJC_TW like", value, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcTwNotLike(String value) {
            addCriterion("TGJC_TW not like", value, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcTwIn(List<String> values) {
            addCriterion("TGJC_TW in", values, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcTwNotIn(List<String> values) {
            addCriterion("TGJC_TW not in", values, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcTwBetween(String value1, String value2) {
            addCriterion("TGJC_TW between", value1, value2, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcTwNotBetween(String value1, String value2) {
            addCriterion("TGJC_TW not between", value1, value2, "tgjcTw");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgIsNull() {
            addCriterion("TGJC_MB_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgIsNotNull() {
            addCriterion("TGJC_MB_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgEqualTo(String value) {
            addCriterion("TGJC_MB_FLG =", value, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgNotEqualTo(String value) {
            addCriterion("TGJC_MB_FLG <>", value, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgGreaterThan(String value) {
            addCriterion("TGJC_MB_FLG >", value, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_MB_FLG >=", value, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgLessThan(String value) {
            addCriterion("TGJC_MB_FLG <", value, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgLessThanOrEqualTo(String value) {
            addCriterion("TGJC_MB_FLG <=", value, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgLike(String value) {
            addCriterion("TGJC_MB_FLG like", value, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgNotLike(String value) {
            addCriterion("TGJC_MB_FLG not like", value, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgIn(List<String> values) {
            addCriterion("TGJC_MB_FLG in", values, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgNotIn(List<String> values) {
            addCriterion("TGJC_MB_FLG not in", values, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgBetween(String value1, String value2) {
            addCriterion("TGJC_MB_FLG between", value1, value2, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbFlgNotBetween(String value1, String value2) {
            addCriterion("TGJC_MB_FLG not between", value1, value2, "tgjcMbFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcMbIsNull() {
            addCriterion("TGJC_MB is null");
            return (Criteria) this;
        }

        public Criteria andTgjcMbIsNotNull() {
            addCriterion("TGJC_MB is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcMbEqualTo(String value) {
            addCriterion("TGJC_MB =", value, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcMbNotEqualTo(String value) {
            addCriterion("TGJC_MB <>", value, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcMbGreaterThan(String value) {
            addCriterion("TGJC_MB >", value, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcMbGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_MB >=", value, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcMbLessThan(String value) {
            addCriterion("TGJC_MB <", value, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcMbLessThanOrEqualTo(String value) {
            addCriterion("TGJC_MB <=", value, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcMbLike(String value) {
            addCriterion("TGJC_MB like", value, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcMbNotLike(String value) {
            addCriterion("TGJC_MB not like", value, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcMbIn(List<String> values) {
            addCriterion("TGJC_MB in", values, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcMbNotIn(List<String> values) {
            addCriterion("TGJC_MB not in", values, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcMbBetween(String value1, String value2) {
            addCriterion("TGJC_MB between", value1, value2, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcMbNotBetween(String value1, String value2) {
            addCriterion("TGJC_MB not between", value1, value2, "tgjcMb");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgIsNull() {
            addCriterion("TGJC_HX_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgIsNotNull() {
            addCriterion("TGJC_HX_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgEqualTo(String value) {
            addCriterion("TGJC_HX_FLG =", value, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgNotEqualTo(String value) {
            addCriterion("TGJC_HX_FLG <>", value, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgGreaterThan(String value) {
            addCriterion("TGJC_HX_FLG >", value, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_HX_FLG >=", value, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgLessThan(String value) {
            addCriterion("TGJC_HX_FLG <", value, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgLessThanOrEqualTo(String value) {
            addCriterion("TGJC_HX_FLG <=", value, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgLike(String value) {
            addCriterion("TGJC_HX_FLG like", value, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgNotLike(String value) {
            addCriterion("TGJC_HX_FLG not like", value, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgIn(List<String> values) {
            addCriterion("TGJC_HX_FLG in", values, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgNotIn(List<String> values) {
            addCriterion("TGJC_HX_FLG not in", values, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgBetween(String value1, String value2) {
            addCriterion("TGJC_HX_FLG between", value1, value2, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxFlgNotBetween(String value1, String value2) {
            addCriterion("TGJC_HX_FLG not between", value1, value2, "tgjcHxFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcHxIsNull() {
            addCriterion("TGJC_HX is null");
            return (Criteria) this;
        }

        public Criteria andTgjcHxIsNotNull() {
            addCriterion("TGJC_HX is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcHxEqualTo(String value) {
            addCriterion("TGJC_HX =", value, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcHxNotEqualTo(String value) {
            addCriterion("TGJC_HX <>", value, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcHxGreaterThan(String value) {
            addCriterion("TGJC_HX >", value, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcHxGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_HX >=", value, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcHxLessThan(String value) {
            addCriterion("TGJC_HX <", value, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcHxLessThanOrEqualTo(String value) {
            addCriterion("TGJC_HX <=", value, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcHxLike(String value) {
            addCriterion("TGJC_HX like", value, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcHxNotLike(String value) {
            addCriterion("TGJC_HX not like", value, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcHxIn(List<String> values) {
            addCriterion("TGJC_HX in", values, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcHxNotIn(List<String> values) {
            addCriterion("TGJC_HX not in", values, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcHxBetween(String value1, String value2) {
            addCriterion("TGJC_HX between", value1, value2, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcHxNotBetween(String value1, String value2) {
            addCriterion("TGJC_HX not between", value1, value2, "tgjcHx");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgIsNull() {
            addCriterion("TGJC_CBZY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgIsNotNull() {
            addCriterion("TGJC_CBZY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgEqualTo(String value) {
            addCriterion("TGJC_CBZY_FLG =", value, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgNotEqualTo(String value) {
            addCriterion("TGJC_CBZY_FLG <>", value, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgGreaterThan(String value) {
            addCriterion("TGJC_CBZY_FLG >", value, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_CBZY_FLG >=", value, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgLessThan(String value) {
            addCriterion("TGJC_CBZY_FLG <", value, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgLessThanOrEqualTo(String value) {
            addCriterion("TGJC_CBZY_FLG <=", value, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgLike(String value) {
            addCriterion("TGJC_CBZY_FLG like", value, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgNotLike(String value) {
            addCriterion("TGJC_CBZY_FLG not like", value, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgIn(List<String> values) {
            addCriterion("TGJC_CBZY_FLG in", values, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgNotIn(List<String> values) {
            addCriterion("TGJC_CBZY_FLG not in", values, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgBetween(String value1, String value2) {
            addCriterion("TGJC_CBZY_FLG between", value1, value2, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyFlgNotBetween(String value1, String value2) {
            addCriterion("TGJC_CBZY_FLG not between", value1, value2, "tgjcCbzyFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyIsNull() {
            addCriterion("TGJC_CBZY is null");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyIsNotNull() {
            addCriterion("TGJC_CBZY is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyEqualTo(String value) {
            addCriterion("TGJC_CBZY =", value, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyNotEqualTo(String value) {
            addCriterion("TGJC_CBZY <>", value, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyGreaterThan(String value) {
            addCriterion("TGJC_CBZY >", value, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_CBZY >=", value, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyLessThan(String value) {
            addCriterion("TGJC_CBZY <", value, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyLessThanOrEqualTo(String value) {
            addCriterion("TGJC_CBZY <=", value, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyLike(String value) {
            addCriterion("TGJC_CBZY like", value, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyNotLike(String value) {
            addCriterion("TGJC_CBZY not like", value, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyIn(List<String> values) {
            addCriterion("TGJC_CBZY in", values, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyNotIn(List<String> values) {
            addCriterion("TGJC_CBZY not in", values, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyBetween(String value1, String value2) {
            addCriterion("TGJC_CBZY between", value1, value2, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andTgjcCbzyNotBetween(String value1, String value2) {
            addCriterion("TGJC_CBZY not between", value1, value2, "tgjcCbzy");
            return (Criteria) this;
        }

        public Criteria andCtnrDesIsNull() {
            addCriterion("CTNR_DES is null");
            return (Criteria) this;
        }

        public Criteria andCtnrDesIsNotNull() {
            addCriterion("CTNR_DES is not null");
            return (Criteria) this;
        }

        public Criteria andCtnrDesEqualTo(String value) {
            addCriterion("CTNR_DES =", value, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andCtnrDesNotEqualTo(String value) {
            addCriterion("CTNR_DES <>", value, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andCtnrDesGreaterThan(String value) {
            addCriterion("CTNR_DES >", value, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andCtnrDesGreaterThanOrEqualTo(String value) {
            addCriterion("CTNR_DES >=", value, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andCtnrDesLessThan(String value) {
            addCriterion("CTNR_DES <", value, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andCtnrDesLessThanOrEqualTo(String value) {
            addCriterion("CTNR_DES <=", value, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andCtnrDesLike(String value) {
            addCriterion("CTNR_DES like", value, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andCtnrDesNotLike(String value) {
            addCriterion("CTNR_DES not like", value, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andCtnrDesIn(List<String> values) {
            addCriterion("CTNR_DES in", values, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andCtnrDesNotIn(List<String> values) {
            addCriterion("CTNR_DES not in", values, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andCtnrDesBetween(String value1, String value2) {
            addCriterion("CTNR_DES between", value1, value2, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andCtnrDesNotBetween(String value1, String value2) {
            addCriterion("CTNR_DES not between", value1, value2, "ctnrDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesIsNull() {
            addCriterion("FZJC_DES is null");
            return (Criteria) this;
        }

        public Criteria andFzjcDesIsNotNull() {
            addCriterion("FZJC_DES is not null");
            return (Criteria) this;
        }

        public Criteria andFzjcDesEqualTo(String value) {
            addCriterion("FZJC_DES =", value, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesNotEqualTo(String value) {
            addCriterion("FZJC_DES <>", value, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesGreaterThan(String value) {
            addCriterion("FZJC_DES >", value, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesGreaterThanOrEqualTo(String value) {
            addCriterion("FZJC_DES >=", value, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesLessThan(String value) {
            addCriterion("FZJC_DES <", value, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesLessThanOrEqualTo(String value) {
            addCriterion("FZJC_DES <=", value, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesLike(String value) {
            addCriterion("FZJC_DES like", value, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesNotLike(String value) {
            addCriterion("FZJC_DES not like", value, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesIn(List<String> values) {
            addCriterion("FZJC_DES in", values, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesNotIn(List<String> values) {
            addCriterion("FZJC_DES not in", values, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesBetween(String value1, String value2) {
            addCriterion("FZJC_DES between", value1, value2, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andFzjcDesNotBetween(String value1, String value2) {
            addCriterion("FZJC_DES not between", value1, value2, "fzjcDes");
            return (Criteria) this;
        }

        public Criteria andOprtDatIsNull() {
            addCriterion("OPRT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andOprtDatIsNotNull() {
            addCriterion("OPRT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andOprtDatEqualTo(Date value) {
            addCriterion("OPRT_DAT =", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotEqualTo(Date value) {
            addCriterion("OPRT_DAT <>", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatGreaterThan(Date value) {
            addCriterion("OPRT_DAT >", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("OPRT_DAT >=", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatLessThan(Date value) {
            addCriterion("OPRT_DAT <", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatLessThanOrEqualTo(Date value) {
            addCriterion("OPRT_DAT <=", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatIn(List<Date> values) {
            addCriterion("OPRT_DAT in", values, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotIn(List<Date> values) {
            addCriterion("OPRT_DAT not in", values, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatBetween(Date value1, Date value2) {
            addCriterion("OPRT_DAT between", value1, value2, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotBetween(Date value1, Date value2) {
            addCriterion("OPRT_DAT not between", value1, value2, "oprtDat");
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

        public Criteria andUpdtDat2IsNull() {
            addCriterion("UPDT_DAT2 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2IsNotNull() {
            addCriterion("UPDT_DAT2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2EqualTo(Date value) {
            addCriterion("UPDT_DAT2 =", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2NotEqualTo(Date value) {
            addCriterion("UPDT_DAT2 <>", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2GreaterThan(Date value) {
            addCriterion("UPDT_DAT2 >", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2GreaterThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT2 >=", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2LessThan(Date value) {
            addCriterion("UPDT_DAT2 <", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2LessThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT2 <=", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2In(List<Date> values) {
            addCriterion("UPDT_DAT2 in", values, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2NotIn(List<Date> values) {
            addCriterion("UPDT_DAT2 not in", values, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2Between(Date value1, Date value2) {
            addCriterion("UPDT_DAT2 between", value1, value2, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2NotBetween(Date value1, Date value2) {
            addCriterion("UPDT_DAT2 not between", value1, value2, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2IsNull() {
            addCriterion("UPDT_NBR2 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2IsNotNull() {
            addCriterion("UPDT_NBR2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2EqualTo(String value) {
            addCriterion("UPDT_NBR2 =", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2NotEqualTo(String value) {
            addCriterion("UPDT_NBR2 <>", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2GreaterThan(String value) {
            addCriterion("UPDT_NBR2 >", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2GreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR2 >=", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2LessThan(String value) {
            addCriterion("UPDT_NBR2 <", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2LessThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR2 <=", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2Like(String value) {
            addCriterion("UPDT_NBR2 like", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2NotLike(String value) {
            addCriterion("UPDT_NBR2 not like", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2In(List<String> values) {
            addCriterion("UPDT_NBR2 in", values, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2NotIn(List<String> values) {
            addCriterion("UPDT_NBR2 not in", values, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2Between(String value1, String value2) {
            addCriterion("UPDT_NBR2 between", value1, value2, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2NotBetween(String value1, String value2) {
            addCriterion("UPDT_NBR2 not between", value1, value2, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2IsNull() {
            addCriterion("UPDT_NAM2 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2IsNotNull() {
            addCriterion("UPDT_NAM2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2EqualTo(String value) {
            addCriterion("UPDT_NAM2 =", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2NotEqualTo(String value) {
            addCriterion("UPDT_NAM2 <>", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2GreaterThan(String value) {
            addCriterion("UPDT_NAM2 >", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2GreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM2 >=", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2LessThan(String value) {
            addCriterion("UPDT_NAM2 <", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2LessThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM2 <=", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2Like(String value) {
            addCriterion("UPDT_NAM2 like", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2NotLike(String value) {
            addCriterion("UPDT_NAM2 not like", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2In(List<String> values) {
            addCriterion("UPDT_NAM2 in", values, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2NotIn(List<String> values) {
            addCriterion("UPDT_NAM2 not in", values, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2Between(String value1, String value2) {
            addCriterion("UPDT_NAM2 between", value1, value2, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2NotBetween(String value1, String value2) {
            addCriterion("UPDT_NAM2 not between", value1, value2, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3IsNull() {
            addCriterion("UPDT_DAT3 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3IsNotNull() {
            addCriterion("UPDT_DAT3 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3EqualTo(Date value) {
            addCriterion("UPDT_DAT3 =", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3NotEqualTo(Date value) {
            addCriterion("UPDT_DAT3 <>", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3GreaterThan(Date value) {
            addCriterion("UPDT_DAT3 >", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3GreaterThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT3 >=", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3LessThan(Date value) {
            addCriterion("UPDT_DAT3 <", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3LessThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT3 <=", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3In(List<Date> values) {
            addCriterion("UPDT_DAT3 in", values, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3NotIn(List<Date> values) {
            addCriterion("UPDT_DAT3 not in", values, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3Between(Date value1, Date value2) {
            addCriterion("UPDT_DAT3 between", value1, value2, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3NotBetween(Date value1, Date value2) {
            addCriterion("UPDT_DAT3 not between", value1, value2, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3IsNull() {
            addCriterion("UPDT_NBR3 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3IsNotNull() {
            addCriterion("UPDT_NBR3 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3EqualTo(String value) {
            addCriterion("UPDT_NBR3 =", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3NotEqualTo(String value) {
            addCriterion("UPDT_NBR3 <>", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3GreaterThan(String value) {
            addCriterion("UPDT_NBR3 >", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3GreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR3 >=", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3LessThan(String value) {
            addCriterion("UPDT_NBR3 <", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3LessThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR3 <=", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3Like(String value) {
            addCriterion("UPDT_NBR3 like", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3NotLike(String value) {
            addCriterion("UPDT_NBR3 not like", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3In(List<String> values) {
            addCriterion("UPDT_NBR3 in", values, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3NotIn(List<String> values) {
            addCriterion("UPDT_NBR3 not in", values, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3Between(String value1, String value2) {
            addCriterion("UPDT_NBR3 between", value1, value2, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3NotBetween(String value1, String value2) {
            addCriterion("UPDT_NBR3 not between", value1, value2, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3IsNull() {
            addCriterion("UPDT_NAM3 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3IsNotNull() {
            addCriterion("UPDT_NAM3 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3EqualTo(String value) {
            addCriterion("UPDT_NAM3 =", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3NotEqualTo(String value) {
            addCriterion("UPDT_NAM3 <>", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3GreaterThan(String value) {
            addCriterion("UPDT_NAM3 >", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3GreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM3 >=", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3LessThan(String value) {
            addCriterion("UPDT_NAM3 <", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3LessThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM3 <=", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3Like(String value) {
            addCriterion("UPDT_NAM3 like", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3NotLike(String value) {
            addCriterion("UPDT_NAM3 not like", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3In(List<String> values) {
            addCriterion("UPDT_NAM3 in", values, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3NotIn(List<String> values) {
            addCriterion("UPDT_NAM3 not in", values, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3Between(String value1, String value2) {
            addCriterion("UPDT_NAM3 between", value1, value2, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3NotBetween(String value1, String value2) {
            addCriterion("UPDT_NAM3 not between", value1, value2, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andLqblDatIsNull() {
            addCriterion("LQBL_DAT is null");
            return (Criteria) this;
        }

        public Criteria andLqblDatIsNotNull() {
            addCriterion("LQBL_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andLqblDatEqualTo(Date value) {
            addCriterion("LQBL_DAT =", value, "lqblDat");
            return (Criteria) this;
        }

        public Criteria andLqblDatNotEqualTo(Date value) {
            addCriterion("LQBL_DAT <>", value, "lqblDat");
            return (Criteria) this;
        }

        public Criteria andLqblDatGreaterThan(Date value) {
            addCriterion("LQBL_DAT >", value, "lqblDat");
            return (Criteria) this;
        }

        public Criteria andLqblDatGreaterThanOrEqualTo(Date value) {
            addCriterion("LQBL_DAT >=", value, "lqblDat");
            return (Criteria) this;
        }

        public Criteria andLqblDatLessThan(Date value) {
            addCriterion("LQBL_DAT <", value, "lqblDat");
            return (Criteria) this;
        }

        public Criteria andLqblDatLessThanOrEqualTo(Date value) {
            addCriterion("LQBL_DAT <=", value, "lqblDat");
            return (Criteria) this;
        }

        public Criteria andLqblDatIn(List<Date> values) {
            addCriterion("LQBL_DAT in", values, "lqblDat");
            return (Criteria) this;
        }

        public Criteria andLqblDatNotIn(List<Date> values) {
            addCriterion("LQBL_DAT not in", values, "lqblDat");
            return (Criteria) this;
        }

        public Criteria andLqblDatBetween(Date value1, Date value2) {
            addCriterion("LQBL_DAT between", value1, value2, "lqblDat");
            return (Criteria) this;
        }

        public Criteria andLqblDatNotBetween(Date value1, Date value2) {
            addCriterion("LQBL_DAT not between", value1, value2, "lqblDat");
            return (Criteria) this;
        }

        public Criteria andGmsFlgIsNull() {
            addCriterion("GMS_FLG is null");
            return (Criteria) this;
        }

        public Criteria andGmsFlgIsNotNull() {
            addCriterion("GMS_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andGmsFlgEqualTo(String value) {
            addCriterion("GMS_FLG =", value, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsFlgNotEqualTo(String value) {
            addCriterion("GMS_FLG <>", value, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsFlgGreaterThan(String value) {
            addCriterion("GMS_FLG >", value, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsFlgGreaterThanOrEqualTo(String value) {
            addCriterion("GMS_FLG >=", value, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsFlgLessThan(String value) {
            addCriterion("GMS_FLG <", value, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsFlgLessThanOrEqualTo(String value) {
            addCriterion("GMS_FLG <=", value, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsFlgLike(String value) {
            addCriterion("GMS_FLG like", value, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsFlgNotLike(String value) {
            addCriterion("GMS_FLG not like", value, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsFlgIn(List<String> values) {
            addCriterion("GMS_FLG in", values, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsFlgNotIn(List<String> values) {
            addCriterion("GMS_FLG not in", values, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsFlgBetween(String value1, String value2) {
            addCriterion("GMS_FLG between", value1, value2, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsFlgNotBetween(String value1, String value2) {
            addCriterion("GMS_FLG not between", value1, value2, "gmsFlg");
            return (Criteria) this;
        }

        public Criteria andGmsDesIsNull() {
            addCriterion("GMS_DES is null");
            return (Criteria) this;
        }

        public Criteria andGmsDesIsNotNull() {
            addCriterion("GMS_DES is not null");
            return (Criteria) this;
        }

        public Criteria andGmsDesEqualTo(String value) {
            addCriterion("GMS_DES =", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesNotEqualTo(String value) {
            addCriterion("GMS_DES <>", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesGreaterThan(String value) {
            addCriterion("GMS_DES >", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesGreaterThanOrEqualTo(String value) {
            addCriterion("GMS_DES >=", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesLessThan(String value) {
            addCriterion("GMS_DES <", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesLessThanOrEqualTo(String value) {
            addCriterion("GMS_DES <=", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesLike(String value) {
            addCriterion("GMS_DES like", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesNotLike(String value) {
            addCriterion("GMS_DES not like", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesIn(List<String> values) {
            addCriterion("GMS_DES in", values, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesNotIn(List<String> values) {
            addCriterion("GMS_DES not in", values, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesBetween(String value1, String value2) {
            addCriterion("GMS_DES between", value1, value2, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesNotBetween(String value1, String value2) {
            addCriterion("GMS_DES not between", value1, value2, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesIsNull() {
            addCriterion("LQBL_DES is null");
            return (Criteria) this;
        }

        public Criteria andLqblDesIsNotNull() {
            addCriterion("LQBL_DES is not null");
            return (Criteria) this;
        }

        public Criteria andLqblDesEqualTo(String value) {
            addCriterion("LQBL_DES =", value, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesNotEqualTo(String value) {
            addCriterion("LQBL_DES <>", value, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesGreaterThan(String value) {
            addCriterion("LQBL_DES >", value, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesGreaterThanOrEqualTo(String value) {
            addCriterion("LQBL_DES >=", value, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesLessThan(String value) {
            addCriterion("LQBL_DES <", value, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesLessThanOrEqualTo(String value) {
            addCriterion("LQBL_DES <=", value, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesLike(String value) {
            addCriterion("LQBL_DES like", value, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesNotLike(String value) {
            addCriterion("LQBL_DES not like", value, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesIn(List<String> values) {
            addCriterion("LQBL_DES in", values, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesNotIn(List<String> values) {
            addCriterion("LQBL_DES not in", values, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesBetween(String value1, String value2) {
            addCriterion("LQBL_DES between", value1, value2, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblDesNotBetween(String value1, String value2) {
            addCriterion("LQBL_DES not between", value1, value2, "lqblDes");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxIsNull() {
            addCriterion("LQBL_BRQX is null");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxIsNotNull() {
            addCriterion("LQBL_BRQX is not null");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxEqualTo(String value) {
            addCriterion("LQBL_BRQX =", value, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxNotEqualTo(String value) {
            addCriterion("LQBL_BRQX <>", value, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxGreaterThan(String value) {
            addCriterion("LQBL_BRQX >", value, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxGreaterThanOrEqualTo(String value) {
            addCriterion("LQBL_BRQX >=", value, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxLessThan(String value) {
            addCriterion("LQBL_BRQX <", value, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxLessThanOrEqualTo(String value) {
            addCriterion("LQBL_BRQX <=", value, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxLike(String value) {
            addCriterion("LQBL_BRQX like", value, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxNotLike(String value) {
            addCriterion("LQBL_BRQX not like", value, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxIn(List<String> values) {
            addCriterion("LQBL_BRQX in", values, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxNotIn(List<String> values) {
            addCriterion("LQBL_BRQX not in", values, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxBetween(String value1, String value2) {
            addCriterion("LQBL_BRQX between", value1, value2, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andLqblBrqxNotBetween(String value1, String value2) {
            addCriterion("LQBL_BRQX not between", value1, value2, "lqblBrqx");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeIsNull() {
            addCriterion("MENOPS_AGE is null");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeIsNotNull() {
            addCriterion("MENOPS_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeEqualTo(String value) {
            addCriterion("MENOPS_AGE =", value, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeNotEqualTo(String value) {
            addCriterion("MENOPS_AGE <>", value, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeGreaterThan(String value) {
            addCriterion("MENOPS_AGE >", value, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeGreaterThanOrEqualTo(String value) {
            addCriterion("MENOPS_AGE >=", value, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeLessThan(String value) {
            addCriterion("MENOPS_AGE <", value, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeLessThanOrEqualTo(String value) {
            addCriterion("MENOPS_AGE <=", value, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeLike(String value) {
            addCriterion("MENOPS_AGE like", value, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeNotLike(String value) {
            addCriterion("MENOPS_AGE not like", value, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeIn(List<String> values) {
            addCriterion("MENOPS_AGE in", values, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeNotIn(List<String> values) {
            addCriterion("MENOPS_AGE not in", values, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeBetween(String value1, String value2) {
            addCriterion("MENOPS_AGE between", value1, value2, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMenopsAgeNotBetween(String value1, String value2) {
            addCriterion("MENOPS_AGE not between", value1, value2, "menopsAge");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodIsNull() {
            addCriterion("MNS_SIT_COD is null");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodIsNotNull() {
            addCriterion("MNS_SIT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodEqualTo(String value) {
            addCriterion("MNS_SIT_COD =", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodNotEqualTo(String value) {
            addCriterion("MNS_SIT_COD <>", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodGreaterThan(String value) {
            addCriterion("MNS_SIT_COD >", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodGreaterThanOrEqualTo(String value) {
            addCriterion("MNS_SIT_COD >=", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodLessThan(String value) {
            addCriterion("MNS_SIT_COD <", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodLessThanOrEqualTo(String value) {
            addCriterion("MNS_SIT_COD <=", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodLike(String value) {
            addCriterion("MNS_SIT_COD like", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodNotLike(String value) {
            addCriterion("MNS_SIT_COD not like", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodIn(List<String> values) {
            addCriterion("MNS_SIT_COD in", values, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodNotIn(List<String> values) {
            addCriterion("MNS_SIT_COD not in", values, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodBetween(String value1, String value2) {
            addCriterion("MNS_SIT_COD between", value1, value2, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodNotBetween(String value1, String value2) {
            addCriterion("MNS_SIT_COD not between", value1, value2, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andCaseHisIsNull() {
            addCriterion("CASE_HIS is null");
            return (Criteria) this;
        }

        public Criteria andCaseHisIsNotNull() {
            addCriterion("CASE_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andCaseHisEqualTo(String value) {
            addCriterion("CASE_HIS =", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisNotEqualTo(String value) {
            addCriterion("CASE_HIS <>", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisGreaterThan(String value) {
            addCriterion("CASE_HIS >", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_HIS >=", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisLessThan(String value) {
            addCriterion("CASE_HIS <", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisLessThanOrEqualTo(String value) {
            addCriterion("CASE_HIS <=", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisLike(String value) {
            addCriterion("CASE_HIS like", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisNotLike(String value) {
            addCriterion("CASE_HIS not like", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisIn(List<String> values) {
            addCriterion("CASE_HIS in", values, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisNotIn(List<String> values) {
            addCriterion("CASE_HIS not in", values, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisBetween(String value1, String value2) {
            addCriterion("CASE_HIS between", value1, value2, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisNotBetween(String value1, String value2) {
            addCriterion("CASE_HIS not between", value1, value2, "caseHis");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgIsNull() {
            addCriterion("TGJC_XT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgIsNotNull() {
            addCriterion("TGJC_XT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgEqualTo(String value) {
            addCriterion("TGJC_XT_FLG =", value, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgNotEqualTo(String value) {
            addCriterion("TGJC_XT_FLG <>", value, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgGreaterThan(String value) {
            addCriterion("TGJC_XT_FLG >", value, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_XT_FLG >=", value, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgLessThan(String value) {
            addCriterion("TGJC_XT_FLG <", value, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgLessThanOrEqualTo(String value) {
            addCriterion("TGJC_XT_FLG <=", value, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgLike(String value) {
            addCriterion("TGJC_XT_FLG like", value, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgNotLike(String value) {
            addCriterion("TGJC_XT_FLG not like", value, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgIn(List<String> values) {
            addCriterion("TGJC_XT_FLG in", values, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgNotIn(List<String> values) {
            addCriterion("TGJC_XT_FLG not in", values, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgBetween(String value1, String value2) {
            addCriterion("TGJC_XT_FLG between", value1, value2, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtFlgNotBetween(String value1, String value2) {
            addCriterion("TGJC_XT_FLG not between", value1, value2, "tgjcXtFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcXtIsNull() {
            addCriterion("TGJC_XT is null");
            return (Criteria) this;
        }

        public Criteria andTgjcXtIsNotNull() {
            addCriterion("TGJC_XT is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcXtEqualTo(String value) {
            addCriterion("TGJC_XT =", value, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcXtNotEqualTo(String value) {
            addCriterion("TGJC_XT <>", value, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcXtGreaterThan(String value) {
            addCriterion("TGJC_XT >", value, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcXtGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_XT >=", value, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcXtLessThan(String value) {
            addCriterion("TGJC_XT <", value, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcXtLessThanOrEqualTo(String value) {
            addCriterion("TGJC_XT <=", value, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcXtLike(String value) {
            addCriterion("TGJC_XT like", value, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcXtNotLike(String value) {
            addCriterion("TGJC_XT not like", value, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcXtIn(List<String> values) {
            addCriterion("TGJC_XT in", values, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcXtNotIn(List<String> values) {
            addCriterion("TGJC_XT not in", values, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcXtBetween(String value1, String value2) {
            addCriterion("TGJC_XT between", value1, value2, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcXtNotBetween(String value1, String value2) {
            addCriterion("TGJC_XT not between", value1, value2, "tgjcXt");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseIsNull() {
            addCriterion("TGJC_PULSE is null");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseIsNotNull() {
            addCriterion("TGJC_PULSE is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseEqualTo(String value) {
            addCriterion("TGJC_PULSE =", value, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseNotEqualTo(String value) {
            addCriterion("TGJC_PULSE <>", value, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseGreaterThan(String value) {
            addCriterion("TGJC_PULSE >", value, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_PULSE >=", value, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseLessThan(String value) {
            addCriterion("TGJC_PULSE <", value, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseLessThanOrEqualTo(String value) {
            addCriterion("TGJC_PULSE <=", value, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseLike(String value) {
            addCriterion("TGJC_PULSE like", value, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseNotLike(String value) {
            addCriterion("TGJC_PULSE not like", value, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseIn(List<String> values) {
            addCriterion("TGJC_PULSE in", values, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseNotIn(List<String> values) {
            addCriterion("TGJC_PULSE not in", values, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseBetween(String value1, String value2) {
            addCriterion("TGJC_PULSE between", value1, value2, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseNotBetween(String value1, String value2) {
            addCriterion("TGJC_PULSE not between", value1, value2, "tgjcPulse");
            return (Criteria) this;
        }

        public Criteria andBltypeIsNull() {
            addCriterion("BLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBltypeIsNotNull() {
            addCriterion("BLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBltypeEqualTo(String value) {
            addCriterion("BLTYPE =", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeNotEqualTo(String value) {
            addCriterion("BLTYPE <>", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeGreaterThan(String value) {
            addCriterion("BLTYPE >", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeGreaterThanOrEqualTo(String value) {
            addCriterion("BLTYPE >=", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeLessThan(String value) {
            addCriterion("BLTYPE <", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeLessThanOrEqualTo(String value) {
            addCriterion("BLTYPE <=", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeLike(String value) {
            addCriterion("BLTYPE like", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeNotLike(String value) {
            addCriterion("BLTYPE not like", value, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeIn(List<String> values) {
            addCriterion("BLTYPE in", values, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeNotIn(List<String> values) {
            addCriterion("BLTYPE not in", values, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeBetween(String value1, String value2) {
            addCriterion("BLTYPE between", value1, value2, "bltype");
            return (Criteria) this;
        }

        public Criteria andBltypeNotBetween(String value1, String value2) {
            addCriterion("BLTYPE not between", value1, value2, "bltype");
            return (Criteria) this;
        }

        public Criteria andZlyjIsNull() {
            addCriterion("ZLYJ is null");
            return (Criteria) this;
        }

        public Criteria andZlyjIsNotNull() {
            addCriterion("ZLYJ is not null");
            return (Criteria) this;
        }

        public Criteria andZlyjEqualTo(String value) {
            addCriterion("ZLYJ =", value, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZlyjNotEqualTo(String value) {
            addCriterion("ZLYJ <>", value, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZlyjGreaterThan(String value) {
            addCriterion("ZLYJ >", value, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZlyjGreaterThanOrEqualTo(String value) {
            addCriterion("ZLYJ >=", value, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZlyjLessThan(String value) {
            addCriterion("ZLYJ <", value, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZlyjLessThanOrEqualTo(String value) {
            addCriterion("ZLYJ <=", value, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZlyjLike(String value) {
            addCriterion("ZLYJ like", value, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZlyjNotLike(String value) {
            addCriterion("ZLYJ not like", value, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZlyjIn(List<String> values) {
            addCriterion("ZLYJ in", values, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZlyjNotIn(List<String> values) {
            addCriterion("ZLYJ not in", values, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZlyjBetween(String value1, String value2) {
            addCriterion("ZLYJ between", value1, value2, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZlyjNotBetween(String value1, String value2) {
            addCriterion("ZLYJ not between", value1, value2, "zlyj");
            return (Criteria) this;
        }

        public Criteria andZysxIsNull() {
            addCriterion("ZYSX is null");
            return (Criteria) this;
        }

        public Criteria andZysxIsNotNull() {
            addCriterion("ZYSX is not null");
            return (Criteria) this;
        }

        public Criteria andZysxEqualTo(String value) {
            addCriterion("ZYSX =", value, "zysx");
            return (Criteria) this;
        }

        public Criteria andZysxNotEqualTo(String value) {
            addCriterion("ZYSX <>", value, "zysx");
            return (Criteria) this;
        }

        public Criteria andZysxGreaterThan(String value) {
            addCriterion("ZYSX >", value, "zysx");
            return (Criteria) this;
        }

        public Criteria andZysxGreaterThanOrEqualTo(String value) {
            addCriterion("ZYSX >=", value, "zysx");
            return (Criteria) this;
        }

        public Criteria andZysxLessThan(String value) {
            addCriterion("ZYSX <", value, "zysx");
            return (Criteria) this;
        }

        public Criteria andZysxLessThanOrEqualTo(String value) {
            addCriterion("ZYSX <=", value, "zysx");
            return (Criteria) this;
        }

        public Criteria andZysxLike(String value) {
            addCriterion("ZYSX like", value, "zysx");
            return (Criteria) this;
        }

        public Criteria andZysxNotLike(String value) {
            addCriterion("ZYSX not like", value, "zysx");
            return (Criteria) this;
        }

        public Criteria andZysxIn(List<String> values) {
            addCriterion("ZYSX in", values, "zysx");
            return (Criteria) this;
        }

        public Criteria andZysxNotIn(List<String> values) {
            addCriterion("ZYSX not in", values, "zysx");
            return (Criteria) this;
        }

        public Criteria andZysxBetween(String value1, String value2) {
            addCriterion("ZYSX between", value1, value2, "zysx");
            return (Criteria) this;
        }

        public Criteria andZysxNotBetween(String value1, String value2) {
            addCriterion("ZYSX not between", value1, value2, "zysx");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeIsNull() {
            addCriterion("TGJC_XT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeIsNotNull() {
            addCriterion("TGJC_XT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeEqualTo(String value) {
            addCriterion("TGJC_XT_TYPE =", value, "tgjcXtType");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeNotEqualTo(String value) {
            addCriterion("TGJC_XT_TYPE <>", value, "tgjcXtType");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeGreaterThan(String value) {
            addCriterion("TGJC_XT_TYPE >", value, "tgjcXtType");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_XT_TYPE >=", value, "tgjcXtType");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeLessThan(String value) {
            addCriterion("TGJC_XT_TYPE <", value, "tgjcXtType");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeLessThanOrEqualTo(String value) {
            addCriterion("TGJC_XT_TYPE <=", value, "tgjcXtType");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeLike(String value) {
            addCriterion("TGJC_XT_TYPE like", value, "tgjcXtType");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeNotLike(String value) {
            addCriterion("TGJC_XT_TYPE not like", value, "tgjcXtType");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeIn(List<String> values) {
            addCriterion("TGJC_XT_TYPE in", values, "tgjcXtType");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeNotIn(List<String> values) {
            addCriterion("TGJC_XT_TYPE not in", values, "tgjcXtType");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeBetween(String value1, String value2) {
            addCriterion("TGJC_XT_TYPE between", value1, value2, "tgjcXtType");
            return (Criteria) this;
        }

        public Criteria andTgjcXtTypeNotBetween(String value1, String value2) {
            addCriterion("TGJC_XT_TYPE not between", value1, value2, "tgjcXtType");
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

        public Criteria andFallSeqIsNull() {
            addCriterion("FALL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFallSeqIsNotNull() {
            addCriterion("FALL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFallSeqEqualTo(String value) {
            addCriterion("FALL_SEQ =", value, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andFallSeqNotEqualTo(String value) {
            addCriterion("FALL_SEQ <>", value, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andFallSeqGreaterThan(String value) {
            addCriterion("FALL_SEQ >", value, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andFallSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FALL_SEQ >=", value, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andFallSeqLessThan(String value) {
            addCriterion("FALL_SEQ <", value, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andFallSeqLessThanOrEqualTo(String value) {
            addCriterion("FALL_SEQ <=", value, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andFallSeqLike(String value) {
            addCriterion("FALL_SEQ like", value, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andFallSeqNotLike(String value) {
            addCriterion("FALL_SEQ not like", value, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andFallSeqIn(List<String> values) {
            addCriterion("FALL_SEQ in", values, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andFallSeqNotIn(List<String> values) {
            addCriterion("FALL_SEQ not in", values, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andFallSeqBetween(String value1, String value2) {
            addCriterion("FALL_SEQ between", value1, value2, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andFallSeqNotBetween(String value1, String value2) {
            addCriterion("FALL_SEQ not between", value1, value2, "fallSeq");
            return (Criteria) this;
        }

        public Criteria andHealthEducationIsNull() {
            addCriterion("HEALTH_EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andHealthEducationIsNotNull() {
            addCriterion("HEALTH_EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andHealthEducationEqualTo(String value) {
            addCriterion("HEALTH_EDUCATION =", value, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andHealthEducationNotEqualTo(String value) {
            addCriterion("HEALTH_EDUCATION <>", value, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andHealthEducationGreaterThan(String value) {
            addCriterion("HEALTH_EDUCATION >", value, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andHealthEducationGreaterThanOrEqualTo(String value) {
            addCriterion("HEALTH_EDUCATION >=", value, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andHealthEducationLessThan(String value) {
            addCriterion("HEALTH_EDUCATION <", value, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andHealthEducationLessThanOrEqualTo(String value) {
            addCriterion("HEALTH_EDUCATION <=", value, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andHealthEducationLike(String value) {
            addCriterion("HEALTH_EDUCATION like", value, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andHealthEducationNotLike(String value) {
            addCriterion("HEALTH_EDUCATION not like", value, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andHealthEducationIn(List<String> values) {
            addCriterion("HEALTH_EDUCATION in", values, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andHealthEducationNotIn(List<String> values) {
            addCriterion("HEALTH_EDUCATION not in", values, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andHealthEducationBetween(String value1, String value2) {
            addCriterion("HEALTH_EDUCATION between", value1, value2, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andHealthEducationNotBetween(String value1, String value2) {
            addCriterion("HEALTH_EDUCATION not between", value1, value2, "healthEducation");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgIsNull() {
            addCriterion("TGJC_PULSE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgIsNotNull() {
            addCriterion("TGJC_PULSE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgEqualTo(String value) {
            addCriterion("TGJC_PULSE_FLG =", value, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgNotEqualTo(String value) {
            addCriterion("TGJC_PULSE_FLG <>", value, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgGreaterThan(String value) {
            addCriterion("TGJC_PULSE_FLG >", value, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TGJC_PULSE_FLG >=", value, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgLessThan(String value) {
            addCriterion("TGJC_PULSE_FLG <", value, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgLessThanOrEqualTo(String value) {
            addCriterion("TGJC_PULSE_FLG <=", value, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgLike(String value) {
            addCriterion("TGJC_PULSE_FLG like", value, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgNotLike(String value) {
            addCriterion("TGJC_PULSE_FLG not like", value, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgIn(List<String> values) {
            addCriterion("TGJC_PULSE_FLG in", values, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgNotIn(List<String> values) {
            addCriterion("TGJC_PULSE_FLG not in", values, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgBetween(String value1, String value2) {
            addCriterion("TGJC_PULSE_FLG between", value1, value2, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andTgjcPulseFlgNotBetween(String value1, String value2) {
            addCriterion("TGJC_PULSE_FLG not between", value1, value2, "tgjcPulseFlg");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessIsNull() {
            addCriterion("SPECIAL_ASSESS is null");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessIsNotNull() {
            addCriterion("SPECIAL_ASSESS is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessEqualTo(String value) {
            addCriterion("SPECIAL_ASSESS =", value, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessNotEqualTo(String value) {
            addCriterion("SPECIAL_ASSESS <>", value, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessGreaterThan(String value) {
            addCriterion("SPECIAL_ASSESS >", value, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIAL_ASSESS >=", value, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessLessThan(String value) {
            addCriterion("SPECIAL_ASSESS <", value, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessLessThanOrEqualTo(String value) {
            addCriterion("SPECIAL_ASSESS <=", value, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessLike(String value) {
            addCriterion("SPECIAL_ASSESS like", value, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessNotLike(String value) {
            addCriterion("SPECIAL_ASSESS not like", value, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessIn(List<String> values) {
            addCriterion("SPECIAL_ASSESS in", values, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessNotIn(List<String> values) {
            addCriterion("SPECIAL_ASSESS not in", values, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessBetween(String value1, String value2) {
            addCriterion("SPECIAL_ASSESS between", value1, value2, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialAssessNotBetween(String value1, String value2) {
            addCriterion("SPECIAL_ASSESS not between", value1, value2, "specialAssess");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestIsNull() {
            addCriterion("SPECIAL_SUGGEST is null");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestIsNotNull() {
            addCriterion("SPECIAL_SUGGEST is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestEqualTo(String value) {
            addCriterion("SPECIAL_SUGGEST =", value, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestNotEqualTo(String value) {
            addCriterion("SPECIAL_SUGGEST <>", value, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestGreaterThan(String value) {
            addCriterion("SPECIAL_SUGGEST >", value, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIAL_SUGGEST >=", value, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestLessThan(String value) {
            addCriterion("SPECIAL_SUGGEST <", value, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestLessThanOrEqualTo(String value) {
            addCriterion("SPECIAL_SUGGEST <=", value, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestLike(String value) {
            addCriterion("SPECIAL_SUGGEST like", value, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestNotLike(String value) {
            addCriterion("SPECIAL_SUGGEST not like", value, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestIn(List<String> values) {
            addCriterion("SPECIAL_SUGGEST in", values, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestNotIn(List<String> values) {
            addCriterion("SPECIAL_SUGGEST not in", values, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestBetween(String value1, String value2) {
            addCriterion("SPECIAL_SUGGEST between", value1, value2, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andSpecialSuggestNotBetween(String value1, String value2) {
            addCriterion("SPECIAL_SUGGEST not between", value1, value2, "specialSuggest");
            return (Criteria) this;
        }

        public Criteria andCstAdrIsNull() {
            addCriterion("CST_ADR is null");
            return (Criteria) this;
        }

        public Criteria andCstAdrIsNotNull() {
            addCriterion("CST_ADR is not null");
            return (Criteria) this;
        }

        public Criteria andCstAdrEqualTo(String value) {
            addCriterion("CST_ADR =", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotEqualTo(String value) {
            addCriterion("CST_ADR <>", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrGreaterThan(String value) {
            addCriterion("CST_ADR >", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrGreaterThanOrEqualTo(String value) {
            addCriterion("CST_ADR >=", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrLessThan(String value) {
            addCriterion("CST_ADR <", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrLessThanOrEqualTo(String value) {
            addCriterion("CST_ADR <=", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrLike(String value) {
            addCriterion("CST_ADR like", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotLike(String value) {
            addCriterion("CST_ADR not like", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrIn(List<String> values) {
            addCriterion("CST_ADR in", values, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotIn(List<String> values) {
            addCriterion("CST_ADR not in", values, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrBetween(String value1, String value2) {
            addCriterion("CST_ADR between", value1, value2, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotBetween(String value1, String value2) {
            addCriterion("CST_ADR not between", value1, value2, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andNowHisIsNull() {
            addCriterion("NOW_HIS is null");
            return (Criteria) this;
        }

        public Criteria andNowHisIsNotNull() {
            addCriterion("NOW_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andNowHisEqualTo(String value) {
            addCriterion("NOW_HIS =", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisNotEqualTo(String value) {
            addCriterion("NOW_HIS <>", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisGreaterThan(String value) {
            addCriterion("NOW_HIS >", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisGreaterThanOrEqualTo(String value) {
            addCriterion("NOW_HIS >=", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisLessThan(String value) {
            addCriterion("NOW_HIS <", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisLessThanOrEqualTo(String value) {
            addCriterion("NOW_HIS <=", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisLike(String value) {
            addCriterion("NOW_HIS like", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisNotLike(String value) {
            addCriterion("NOW_HIS not like", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisIn(List<String> values) {
            addCriterion("NOW_HIS in", values, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisNotIn(List<String> values) {
            addCriterion("NOW_HIS not in", values, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisBetween(String value1, String value2) {
            addCriterion("NOW_HIS between", value1, value2, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisNotBetween(String value1, String value2) {
            addCriterion("NOW_HIS not between", value1, value2, "nowHis");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanIsNull() {
            addCriterion("TREATMENT_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanIsNotNull() {
            addCriterion("TREATMENT_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanEqualTo(String value) {
            addCriterion("TREATMENT_PLAN =", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanNotEqualTo(String value) {
            addCriterion("TREATMENT_PLAN <>", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanGreaterThan(String value) {
            addCriterion("TREATMENT_PLAN >", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanGreaterThanOrEqualTo(String value) {
            addCriterion("TREATMENT_PLAN >=", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanLessThan(String value) {
            addCriterion("TREATMENT_PLAN <", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanLessThanOrEqualTo(String value) {
            addCriterion("TREATMENT_PLAN <=", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanLike(String value) {
            addCriterion("TREATMENT_PLAN like", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanNotLike(String value) {
            addCriterion("TREATMENT_PLAN not like", value, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanIn(List<String> values) {
            addCriterion("TREATMENT_PLAN in", values, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanNotIn(List<String> values) {
            addCriterion("TREATMENT_PLAN not in", values, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanBetween(String value1, String value2) {
            addCriterion("TREATMENT_PLAN between", value1, value2, "treatmentPlan");
            return (Criteria) this;
        }

        public Criteria andTreatmentPlanNotBetween(String value1, String value2) {
            addCriterion("TREATMENT_PLAN not between", value1, value2, "treatmentPlan");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_LQBL_INF
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_LQBL_INF 2020-08-11
     */
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