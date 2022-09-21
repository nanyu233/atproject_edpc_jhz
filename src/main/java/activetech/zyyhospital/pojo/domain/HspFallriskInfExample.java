package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HspFallriskInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspFallriskInfExample() {
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

        public Criteria andFallriskSeqIsNull() {
            addCriterion("FALLRISK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqIsNotNull() {
            addCriterion("FALLRISK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqEqualTo(String value) {
            addCriterion("FALLRISK_SEQ =", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqNotEqualTo(String value) {
            addCriterion("FALLRISK_SEQ <>", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqGreaterThan(String value) {
            addCriterion("FALLRISK_SEQ >", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FALLRISK_SEQ >=", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqLessThan(String value) {
            addCriterion("FALLRISK_SEQ <", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqLessThanOrEqualTo(String value) {
            addCriterion("FALLRISK_SEQ <=", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqLike(String value) {
            addCriterion("FALLRISK_SEQ like", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqNotLike(String value) {
            addCriterion("FALLRISK_SEQ not like", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqIn(List<String> values) {
            addCriterion("FALLRISK_SEQ in", values, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqNotIn(List<String> values) {
            addCriterion("FALLRISK_SEQ not in", values, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqBetween(String value1, String value2) {
            addCriterion("FALLRISK_SEQ between", value1, value2, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqNotBetween(String value1, String value2) {
            addCriterion("FALLRISK_SEQ not between", value1, value2, "fallriskSeq");
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

        public Criteria andRiskClassCodIsNull() {
            addCriterion("RISK_CLASS_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodIsNotNull() {
            addCriterion("RISK_CLASS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodEqualTo(String value) {
            addCriterion("RISK_CLASS_COD =", value, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodNotEqualTo(String value) {
            addCriterion("RISK_CLASS_COD <>", value, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodGreaterThan(String value) {
            addCriterion("RISK_CLASS_COD >", value, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_CLASS_COD >=", value, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodLessThan(String value) {
            addCriterion("RISK_CLASS_COD <", value, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_CLASS_COD <=", value, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodLike(String value) {
            addCriterion("RISK_CLASS_COD like", value, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodNotLike(String value) {
            addCriterion("RISK_CLASS_COD not like", value, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodIn(List<String> values) {
            addCriterion("RISK_CLASS_COD in", values, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodNotIn(List<String> values) {
            addCriterion("RISK_CLASS_COD not in", values, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodBetween(String value1, String value2) {
            addCriterion("RISK_CLASS_COD between", value1, value2, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskClassCodNotBetween(String value1, String value2) {
            addCriterion("RISK_CLASS_COD not between", value1, value2, "riskClassCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodIsNull() {
            addCriterion("RISK_AGE_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodIsNotNull() {
            addCriterion("RISK_AGE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodEqualTo(String value) {
            addCriterion("RISK_AGE_COD =", value, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodNotEqualTo(String value) {
            addCriterion("RISK_AGE_COD <>", value, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodGreaterThan(String value) {
            addCriterion("RISK_AGE_COD >", value, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_AGE_COD >=", value, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodLessThan(String value) {
            addCriterion("RISK_AGE_COD <", value, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_AGE_COD <=", value, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodLike(String value) {
            addCriterion("RISK_AGE_COD like", value, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodNotLike(String value) {
            addCriterion("RISK_AGE_COD not like", value, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodIn(List<String> values) {
            addCriterion("RISK_AGE_COD in", values, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodNotIn(List<String> values) {
            addCriterion("RISK_AGE_COD not in", values, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodBetween(String value1, String value2) {
            addCriterion("RISK_AGE_COD between", value1, value2, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskAgeCodNotBetween(String value1, String value2) {
            addCriterion("RISK_AGE_COD not between", value1, value2, "riskAgeCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodIsNull() {
            addCriterion("RISK_SEX_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodIsNotNull() {
            addCriterion("RISK_SEX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodEqualTo(String value) {
            addCriterion("RISK_SEX_COD =", value, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodNotEqualTo(String value) {
            addCriterion("RISK_SEX_COD <>", value, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodGreaterThan(String value) {
            addCriterion("RISK_SEX_COD >", value, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_SEX_COD >=", value, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodLessThan(String value) {
            addCriterion("RISK_SEX_COD <", value, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_SEX_COD <=", value, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodLike(String value) {
            addCriterion("RISK_SEX_COD like", value, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodNotLike(String value) {
            addCriterion("RISK_SEX_COD not like", value, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodIn(List<String> values) {
            addCriterion("RISK_SEX_COD in", values, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodNotIn(List<String> values) {
            addCriterion("RISK_SEX_COD not in", values, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodBetween(String value1, String value2) {
            addCriterion("RISK_SEX_COD between", value1, value2, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskSexCodNotBetween(String value1, String value2) {
            addCriterion("RISK_SEX_COD not between", value1, value2, "riskSexCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodIsNull() {
            addCriterion("RISK_HIS_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodIsNotNull() {
            addCriterion("RISK_HIS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodEqualTo(String value) {
            addCriterion("RISK_HIS_COD =", value, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodNotEqualTo(String value) {
            addCriterion("RISK_HIS_COD <>", value, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodGreaterThan(String value) {
            addCriterion("RISK_HIS_COD >", value, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_HIS_COD >=", value, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodLessThan(String value) {
            addCriterion("RISK_HIS_COD <", value, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_HIS_COD <=", value, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodLike(String value) {
            addCriterion("RISK_HIS_COD like", value, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodNotLike(String value) {
            addCriterion("RISK_HIS_COD not like", value, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodIn(List<String> values) {
            addCriterion("RISK_HIS_COD in", values, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodNotIn(List<String> values) {
            addCriterion("RISK_HIS_COD not in", values, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodBetween(String value1, String value2) {
            addCriterion("RISK_HIS_COD between", value1, value2, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskHisCodNotBetween(String value1, String value2) {
            addCriterion("RISK_HIS_COD not between", value1, value2, "riskHisCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodIsNull() {
            addCriterion("RISK_EXCRETE_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodIsNotNull() {
            addCriterion("RISK_EXCRETE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodEqualTo(String value) {
            addCriterion("RISK_EXCRETE_COD =", value, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodNotEqualTo(String value) {
            addCriterion("RISK_EXCRETE_COD <>", value, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodGreaterThan(String value) {
            addCriterion("RISK_EXCRETE_COD >", value, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_EXCRETE_COD >=", value, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodLessThan(String value) {
            addCriterion("RISK_EXCRETE_COD <", value, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_EXCRETE_COD <=", value, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodLike(String value) {
            addCriterion("RISK_EXCRETE_COD like", value, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodNotLike(String value) {
            addCriterion("RISK_EXCRETE_COD not like", value, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodIn(List<String> values) {
            addCriterion("RISK_EXCRETE_COD in", values, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodNotIn(List<String> values) {
            addCriterion("RISK_EXCRETE_COD not in", values, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodBetween(String value1, String value2) {
            addCriterion("RISK_EXCRETE_COD between", value1, value2, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskExcreteCodNotBetween(String value1, String value2) {
            addCriterion("RISK_EXCRETE_COD not between", value1, value2, "riskExcreteCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodIsNull() {
            addCriterion("RISK_DRUG_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodIsNotNull() {
            addCriterion("RISK_DRUG_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodEqualTo(String value) {
            addCriterion("RISK_DRUG_COD =", value, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodNotEqualTo(String value) {
            addCriterion("RISK_DRUG_COD <>", value, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodGreaterThan(String value) {
            addCriterion("RISK_DRUG_COD >", value, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_DRUG_COD >=", value, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodLessThan(String value) {
            addCriterion("RISK_DRUG_COD <", value, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_DRUG_COD <=", value, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodLike(String value) {
            addCriterion("RISK_DRUG_COD like", value, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodNotLike(String value) {
            addCriterion("RISK_DRUG_COD not like", value, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodIn(List<String> values) {
            addCriterion("RISK_DRUG_COD in", values, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodNotIn(List<String> values) {
            addCriterion("RISK_DRUG_COD not in", values, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodBetween(String value1, String value2) {
            addCriterion("RISK_DRUG_COD between", value1, value2, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskDrugCodNotBetween(String value1, String value2) {
            addCriterion("RISK_DRUG_COD not between", value1, value2, "riskDrugCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodIsNull() {
            addCriterion("RISK_MAC_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodIsNotNull() {
            addCriterion("RISK_MAC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodEqualTo(String value) {
            addCriterion("RISK_MAC_COD =", value, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodNotEqualTo(String value) {
            addCriterion("RISK_MAC_COD <>", value, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodGreaterThan(String value) {
            addCriterion("RISK_MAC_COD >", value, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_MAC_COD >=", value, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodLessThan(String value) {
            addCriterion("RISK_MAC_COD <", value, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_MAC_COD <=", value, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodLike(String value) {
            addCriterion("RISK_MAC_COD like", value, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodNotLike(String value) {
            addCriterion("RISK_MAC_COD not like", value, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodIn(List<String> values) {
            addCriterion("RISK_MAC_COD in", values, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodNotIn(List<String> values) {
            addCriterion("RISK_MAC_COD not in", values, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodBetween(String value1, String value2) {
            addCriterion("RISK_MAC_COD between", value1, value2, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskMacCodNotBetween(String value1, String value2) {
            addCriterion("RISK_MAC_COD not between", value1, value2, "riskMacCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodIsNull() {
            addCriterion("RISK_ACTION_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodIsNotNull() {
            addCriterion("RISK_ACTION_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodEqualTo(String value) {
            addCriterion("RISK_ACTION_COD =", value, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodNotEqualTo(String value) {
            addCriterion("RISK_ACTION_COD <>", value, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodGreaterThan(String value) {
            addCriterion("RISK_ACTION_COD >", value, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_ACTION_COD >=", value, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodLessThan(String value) {
            addCriterion("RISK_ACTION_COD <", value, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_ACTION_COD <=", value, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodLike(String value) {
            addCriterion("RISK_ACTION_COD like", value, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodNotLike(String value) {
            addCriterion("RISK_ACTION_COD not like", value, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodIn(List<String> values) {
            addCriterion("RISK_ACTION_COD in", values, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodNotIn(List<String> values) {
            addCriterion("RISK_ACTION_COD not in", values, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodBetween(String value1, String value2) {
            addCriterion("RISK_ACTION_COD between", value1, value2, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskActionCodNotBetween(String value1, String value2) {
            addCriterion("RISK_ACTION_COD not between", value1, value2, "riskActionCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodIsNull() {
            addCriterion("RISK_COGNIZE_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodIsNotNull() {
            addCriterion("RISK_COGNIZE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodEqualTo(String value) {
            addCriterion("RISK_COGNIZE_COD =", value, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodNotEqualTo(String value) {
            addCriterion("RISK_COGNIZE_COD <>", value, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodGreaterThan(String value) {
            addCriterion("RISK_COGNIZE_COD >", value, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_COGNIZE_COD >=", value, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodLessThan(String value) {
            addCriterion("RISK_COGNIZE_COD <", value, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_COGNIZE_COD <=", value, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodLike(String value) {
            addCriterion("RISK_COGNIZE_COD like", value, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodNotLike(String value) {
            addCriterion("RISK_COGNIZE_COD not like", value, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodIn(List<String> values) {
            addCriterion("RISK_COGNIZE_COD in", values, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodNotIn(List<String> values) {
            addCriterion("RISK_COGNIZE_COD not in", values, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodBetween(String value1, String value2) {
            addCriterion("RISK_COGNIZE_COD between", value1, value2, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskCognizeCodNotBetween(String value1, String value2) {
            addCriterion("RISK_COGNIZE_COD not between", value1, value2, "riskCognizeCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodIsNull() {
            addCriterion("RISK_DIAGNOSE_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodIsNotNull() {
            addCriterion("RISK_DIAGNOSE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodEqualTo(String value) {
            addCriterion("RISK_DIAGNOSE_COD =", value, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodNotEqualTo(String value) {
            addCriterion("RISK_DIAGNOSE_COD <>", value, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodGreaterThan(String value) {
            addCriterion("RISK_DIAGNOSE_COD >", value, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_DIAGNOSE_COD >=", value, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodLessThan(String value) {
            addCriterion("RISK_DIAGNOSE_COD <", value, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_DIAGNOSE_COD <=", value, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodLike(String value) {
            addCriterion("RISK_DIAGNOSE_COD like", value, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodNotLike(String value) {
            addCriterion("RISK_DIAGNOSE_COD not like", value, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodIn(List<String> values) {
            addCriterion("RISK_DIAGNOSE_COD in", values, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodNotIn(List<String> values) {
            addCriterion("RISK_DIAGNOSE_COD not in", values, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodBetween(String value1, String value2) {
            addCriterion("RISK_DIAGNOSE_COD between", value1, value2, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDiagnoseCodNotBetween(String value1, String value2) {
            addCriterion("RISK_DIAGNOSE_COD not between", value1, value2, "riskDiagnoseCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodIsNull() {
            addCriterion("RISK_HJYS_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodIsNotNull() {
            addCriterion("RISK_HJYS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodEqualTo(String value) {
            addCriterion("RISK_HJYS_COD =", value, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodNotEqualTo(String value) {
            addCriterion("RISK_HJYS_COD <>", value, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodGreaterThan(String value) {
            addCriterion("RISK_HJYS_COD >", value, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_HJYS_COD >=", value, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodLessThan(String value) {
            addCriterion("RISK_HJYS_COD <", value, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_HJYS_COD <=", value, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodLike(String value) {
            addCriterion("RISK_HJYS_COD like", value, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodNotLike(String value) {
            addCriterion("RISK_HJYS_COD not like", value, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodIn(List<String> values) {
            addCriterion("RISK_HJYS_COD in", values, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodNotIn(List<String> values) {
            addCriterion("RISK_HJYS_COD not in", values, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodBetween(String value1, String value2) {
            addCriterion("RISK_HJYS_COD between", value1, value2, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskHjysCodNotBetween(String value1, String value2) {
            addCriterion("RISK_HJYS_COD not between", value1, value2, "riskHjysCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodIsNull() {
            addCriterion("RISK_ZJMZH_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodIsNotNull() {
            addCriterion("RISK_ZJMZH_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodEqualTo(String value) {
            addCriterion("RISK_ZJMZH_COD =", value, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodNotEqualTo(String value) {
            addCriterion("RISK_ZJMZH_COD <>", value, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodGreaterThan(String value) {
            addCriterion("RISK_ZJMZH_COD >", value, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_ZJMZH_COD >=", value, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodLessThan(String value) {
            addCriterion("RISK_ZJMZH_COD <", value, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_ZJMZH_COD <=", value, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodLike(String value) {
            addCriterion("RISK_ZJMZH_COD like", value, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodNotLike(String value) {
            addCriterion("RISK_ZJMZH_COD not like", value, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodIn(List<String> values) {
            addCriterion("RISK_ZJMZH_COD in", values, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodNotIn(List<String> values) {
            addCriterion("RISK_ZJMZH_COD not in", values, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodBetween(String value1, String value2) {
            addCriterion("RISK_ZJMZH_COD between", value1, value2, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskZjmzhCodNotBetween(String value1, String value2) {
            addCriterion("RISK_ZJMZH_COD not between", value1, value2, "riskZjmzhCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodIsNull() {
            addCriterion("RISK_DRUGUSE_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodIsNotNull() {
            addCriterion("RISK_DRUGUSE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodEqualTo(String value) {
            addCriterion("RISK_DRUGUSE_COD =", value, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodNotEqualTo(String value) {
            addCriterion("RISK_DRUGUSE_COD <>", value, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodGreaterThan(String value) {
            addCriterion("RISK_DRUGUSE_COD >", value, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_DRUGUSE_COD >=", value, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodLessThan(String value) {
            addCriterion("RISK_DRUGUSE_COD <", value, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_DRUGUSE_COD <=", value, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodLike(String value) {
            addCriterion("RISK_DRUGUSE_COD like", value, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodNotLike(String value) {
            addCriterion("RISK_DRUGUSE_COD not like", value, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodIn(List<String> values) {
            addCriterion("RISK_DRUGUSE_COD in", values, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodNotIn(List<String> values) {
            addCriterion("RISK_DRUGUSE_COD not in", values, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodBetween(String value1, String value2) {
            addCriterion("RISK_DRUGUSE_COD between", value1, value2, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskDruguseCodNotBetween(String value1, String value2) {
            addCriterion("RISK_DRUGUSE_COD not between", value1, value2, "riskDruguseCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodIsNull() {
            addCriterion("RISK_OTHER_COD is null");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodIsNotNull() {
            addCriterion("RISK_OTHER_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodEqualTo(String value) {
            addCriterion("RISK_OTHER_COD =", value, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodNotEqualTo(String value) {
            addCriterion("RISK_OTHER_COD <>", value, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodGreaterThan(String value) {
            addCriterion("RISK_OTHER_COD >", value, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_OTHER_COD >=", value, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodLessThan(String value) {
            addCriterion("RISK_OTHER_COD <", value, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodLessThanOrEqualTo(String value) {
            addCriterion("RISK_OTHER_COD <=", value, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodLike(String value) {
            addCriterion("RISK_OTHER_COD like", value, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodNotLike(String value) {
            addCriterion("RISK_OTHER_COD not like", value, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodIn(List<String> values) {
            addCriterion("RISK_OTHER_COD in", values, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodNotIn(List<String> values) {
            addCriterion("RISK_OTHER_COD not in", values, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodBetween(String value1, String value2) {
            addCriterion("RISK_OTHER_COD between", value1, value2, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskOtherCodNotBetween(String value1, String value2) {
            addCriterion("RISK_OTHER_COD not between", value1, value2, "riskOtherCod");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1IsNull() {
            addCriterion("RISK_SPARE_1 is null");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1IsNotNull() {
            addCriterion("RISK_SPARE_1 is not null");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1EqualTo(String value) {
            addCriterion("RISK_SPARE_1 =", value, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1NotEqualTo(String value) {
            addCriterion("RISK_SPARE_1 <>", value, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1GreaterThan(String value) {
            addCriterion("RISK_SPARE_1 >", value, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1GreaterThanOrEqualTo(String value) {
            addCriterion("RISK_SPARE_1 >=", value, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1LessThan(String value) {
            addCriterion("RISK_SPARE_1 <", value, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1LessThanOrEqualTo(String value) {
            addCriterion("RISK_SPARE_1 <=", value, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1Like(String value) {
            addCriterion("RISK_SPARE_1 like", value, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1NotLike(String value) {
            addCriterion("RISK_SPARE_1 not like", value, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1In(List<String> values) {
            addCriterion("RISK_SPARE_1 in", values, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1NotIn(List<String> values) {
            addCriterion("RISK_SPARE_1 not in", values, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1Between(String value1, String value2) {
            addCriterion("RISK_SPARE_1 between", value1, value2, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare1NotBetween(String value1, String value2) {
            addCriterion("RISK_SPARE_1 not between", value1, value2, "riskSpare1");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2IsNull() {
            addCriterion("RISK_SPARE_2 is null");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2IsNotNull() {
            addCriterion("RISK_SPARE_2 is not null");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2EqualTo(String value) {
            addCriterion("RISK_SPARE_2 =", value, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2NotEqualTo(String value) {
            addCriterion("RISK_SPARE_2 <>", value, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2GreaterThan(String value) {
            addCriterion("RISK_SPARE_2 >", value, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2GreaterThanOrEqualTo(String value) {
            addCriterion("RISK_SPARE_2 >=", value, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2LessThan(String value) {
            addCriterion("RISK_SPARE_2 <", value, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2LessThanOrEqualTo(String value) {
            addCriterion("RISK_SPARE_2 <=", value, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2Like(String value) {
            addCriterion("RISK_SPARE_2 like", value, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2NotLike(String value) {
            addCriterion("RISK_SPARE_2 not like", value, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2In(List<String> values) {
            addCriterion("RISK_SPARE_2 in", values, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2NotIn(List<String> values) {
            addCriterion("RISK_SPARE_2 not in", values, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2Between(String value1, String value2) {
            addCriterion("RISK_SPARE_2 between", value1, value2, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskSpare2NotBetween(String value1, String value2) {
            addCriterion("RISK_SPARE_2 not between", value1, value2, "riskSpare2");
            return (Criteria) this;
        }

        public Criteria andRiskScoIsNull() {
            addCriterion("RISK_SCO is null");
            return (Criteria) this;
        }

        public Criteria andRiskScoIsNotNull() {
            addCriterion("RISK_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andRiskScoEqualTo(String value) {
            addCriterion("RISK_SCO =", value, "riskSco");
            return (Criteria) this;
        }

        public Criteria andRiskScoNotEqualTo(String value) {
            addCriterion("RISK_SCO <>", value, "riskSco");
            return (Criteria) this;
        }

        public Criteria andRiskScoGreaterThan(String value) {
            addCriterion("RISK_SCO >", value, "riskSco");
            return (Criteria) this;
        }

        public Criteria andRiskScoGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_SCO >=", value, "riskSco");
            return (Criteria) this;
        }

        public Criteria andRiskScoLessThan(String value) {
            addCriterion("RISK_SCO <", value, "riskSco");
            return (Criteria) this;
        }

        public Criteria andRiskScoLessThanOrEqualTo(String value) {
            addCriterion("RISK_SCO <=", value, "riskSco");
            return (Criteria) this;
        }

        public Criteria andRiskScoLike(String value) {
            addCriterion("RISK_SCO like", value, "riskSco");
            return (Criteria) this;
        }

        public Criteria andRiskScoNotLike(String value) {
            addCriterion("RISK_SCO not like", value, "riskSco");
            return (Criteria) this;
        }

        public Criteria andRiskScoIn(List<String> values) {
            addCriterion("RISK_SCO in", values, "riskSco");
            return (Criteria) this;
        }

        public Criteria andRiskScoNotIn(List<String> values) {
            addCriterion("RISK_SCO not in", values, "riskSco");
            return (Criteria) this;
        }

        public Criteria andRiskScoBetween(String value1, String value2) {
            addCriterion("RISK_SCO between", value1, value2, "riskSco");
            return (Criteria) this;
        }

        public Criteria andRiskScoNotBetween(String value1, String value2) {
            addCriterion("RISK_SCO not between", value1, value2, "riskSco");
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

        public Criteria andDanxScoIsNull() {
            addCriterion("DANX_SCO is null");
            return (Criteria) this;
        }

        public Criteria andDanxScoIsNotNull() {
            addCriterion("DANX_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andDanxScoEqualTo(String value) {
            addCriterion("DANX_SCO =", value, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDanxScoNotEqualTo(String value) {
            addCriterion("DANX_SCO <>", value, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDanxScoGreaterThan(String value) {
            addCriterion("DANX_SCO >", value, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDanxScoGreaterThanOrEqualTo(String value) {
            addCriterion("DANX_SCO >=", value, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDanxScoLessThan(String value) {
            addCriterion("DANX_SCO <", value, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDanxScoLessThanOrEqualTo(String value) {
            addCriterion("DANX_SCO <=", value, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDanxScoLike(String value) {
            addCriterion("DANX_SCO like", value, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDanxScoNotLike(String value) {
            addCriterion("DANX_SCO not like", value, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDanxScoIn(List<String> values) {
            addCriterion("DANX_SCO in", values, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDanxScoNotIn(List<String> values) {
            addCriterion("DANX_SCO not in", values, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDanxScoBetween(String value1, String value2) {
            addCriterion("DANX_SCO between", value1, value2, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDanxScoNotBetween(String value1, String value2) {
            addCriterion("DANX_SCO not between", value1, value2, "danxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoIsNull() {
            addCriterion("DUOX_SCO is null");
            return (Criteria) this;
        }

        public Criteria andDuoxScoIsNotNull() {
            addCriterion("DUOX_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andDuoxScoEqualTo(String value) {
            addCriterion("DUOX_SCO =", value, "duoxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoNotEqualTo(String value) {
            addCriterion("DUOX_SCO <>", value, "duoxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoGreaterThan(String value) {
            addCriterion("DUOX_SCO >", value, "duoxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoGreaterThanOrEqualTo(String value) {
            addCriterion("DUOX_SCO >=", value, "duoxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoLessThan(String value) {
            addCriterion("DUOX_SCO <", value, "duoxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoLessThanOrEqualTo(String value) {
            addCriterion("DUOX_SCO <=", value, "duoxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoLike(String value) {
            addCriterion("DUOX_SCO like", value, "duoxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoNotLike(String value) {
            addCriterion("DUOX_SCO not like", value, "duoxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoIn(List<String> values) {
            addCriterion("DUOX_SCO in", values, "duoxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoNotIn(List<String> values) {
            addCriterion("DUOX_SCO not in", values, "duoxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoBetween(String value1, String value2) {
            addCriterion("DUOX_SCO between", value1, value2, "duoxSco");
            return (Criteria) this;
        }

        public Criteria andDuoxScoNotBetween(String value1, String value2) {
            addCriterion("DUOX_SCO not between", value1, value2, "duoxSco");
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