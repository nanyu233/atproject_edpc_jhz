package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspJmxsfxyspgbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJmxsfxyspgbExample() {
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

        public Criteria andRiskSeqIsNull() {
            addCriterion("RISK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andRiskSeqIsNotNull() {
            addCriterion("RISK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRiskSeqEqualTo(String value) {
            addCriterion("RISK_SEQ =", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqNotEqualTo(String value) {
            addCriterion("RISK_SEQ <>", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqGreaterThan(String value) {
            addCriterion("RISK_SEQ >", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_SEQ >=", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqLessThan(String value) {
            addCriterion("RISK_SEQ <", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqLessThanOrEqualTo(String value) {
            addCriterion("RISK_SEQ <=", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqLike(String value) {
            addCriterion("RISK_SEQ like", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqNotLike(String value) {
            addCriterion("RISK_SEQ not like", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqIn(List<String> values) {
            addCriterion("RISK_SEQ in", values, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqNotIn(List<String> values) {
            addCriterion("RISK_SEQ not in", values, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqBetween(String value1, String value2) {
            addCriterion("RISK_SEQ between", value1, value2, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqNotBetween(String value1, String value2) {
            addCriterion("RISK_SEQ not between", value1, value2, "riskSeq");
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

        public Criteria andMgwxysACodIsNull() {
            addCriterion("MGWXYS_A_COD is null");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodIsNotNull() {
            addCriterion("MGWXYS_A_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodEqualTo(String value) {
            addCriterion("MGWXYS_A_COD =", value, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodNotEqualTo(String value) {
            addCriterion("MGWXYS_A_COD <>", value, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodGreaterThan(String value) {
            addCriterion("MGWXYS_A_COD >", value, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodGreaterThanOrEqualTo(String value) {
            addCriterion("MGWXYS_A_COD >=", value, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodLessThan(String value) {
            addCriterion("MGWXYS_A_COD <", value, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodLessThanOrEqualTo(String value) {
            addCriterion("MGWXYS_A_COD <=", value, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodLike(String value) {
            addCriterion("MGWXYS_A_COD like", value, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodNotLike(String value) {
            addCriterion("MGWXYS_A_COD not like", value, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodIn(List<String> values) {
            addCriterion("MGWXYS_A_COD in", values, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodNotIn(List<String> values) {
            addCriterion("MGWXYS_A_COD not in", values, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodBetween(String value1, String value2) {
            addCriterion("MGWXYS_A_COD between", value1, value2, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysACodNotBetween(String value1, String value2) {
            addCriterion("MGWXYS_A_COD not between", value1, value2, "mgwxysACod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodIsNull() {
            addCriterion("MGWXYS_B_COD is null");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodIsNotNull() {
            addCriterion("MGWXYS_B_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodEqualTo(String value) {
            addCriterion("MGWXYS_B_COD =", value, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodNotEqualTo(String value) {
            addCriterion("MGWXYS_B_COD <>", value, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodGreaterThan(String value) {
            addCriterion("MGWXYS_B_COD >", value, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodGreaterThanOrEqualTo(String value) {
            addCriterion("MGWXYS_B_COD >=", value, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodLessThan(String value) {
            addCriterion("MGWXYS_B_COD <", value, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodLessThanOrEqualTo(String value) {
            addCriterion("MGWXYS_B_COD <=", value, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodLike(String value) {
            addCriterion("MGWXYS_B_COD like", value, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodNotLike(String value) {
            addCriterion("MGWXYS_B_COD not like", value, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodIn(List<String> values) {
            addCriterion("MGWXYS_B_COD in", values, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodNotIn(List<String> values) {
            addCriterion("MGWXYS_B_COD not in", values, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodBetween(String value1, String value2) {
            addCriterion("MGWXYS_B_COD between", value1, value2, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysBCodNotBetween(String value1, String value2) {
            addCriterion("MGWXYS_B_COD not between", value1, value2, "mgwxysBCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodIsNull() {
            addCriterion("MGWXYS_C_COD is null");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodIsNotNull() {
            addCriterion("MGWXYS_C_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodEqualTo(String value) {
            addCriterion("MGWXYS_C_COD =", value, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodNotEqualTo(String value) {
            addCriterion("MGWXYS_C_COD <>", value, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodGreaterThan(String value) {
            addCriterion("MGWXYS_C_COD >", value, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodGreaterThanOrEqualTo(String value) {
            addCriterion("MGWXYS_C_COD >=", value, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodLessThan(String value) {
            addCriterion("MGWXYS_C_COD <", value, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodLessThanOrEqualTo(String value) {
            addCriterion("MGWXYS_C_COD <=", value, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodLike(String value) {
            addCriterion("MGWXYS_C_COD like", value, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodNotLike(String value) {
            addCriterion("MGWXYS_C_COD not like", value, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodIn(List<String> values) {
            addCriterion("MGWXYS_C_COD in", values, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodNotIn(List<String> values) {
            addCriterion("MGWXYS_C_COD not in", values, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodBetween(String value1, String value2) {
            addCriterion("MGWXYS_C_COD between", value1, value2, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysCCodNotBetween(String value1, String value2) {
            addCriterion("MGWXYS_C_COD not between", value1, value2, "mgwxysCCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodIsNull() {
            addCriterion("MGWXYS_D_COD is null");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodIsNotNull() {
            addCriterion("MGWXYS_D_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodEqualTo(String value) {
            addCriterion("MGWXYS_D_COD =", value, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodNotEqualTo(String value) {
            addCriterion("MGWXYS_D_COD <>", value, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodGreaterThan(String value) {
            addCriterion("MGWXYS_D_COD >", value, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodGreaterThanOrEqualTo(String value) {
            addCriterion("MGWXYS_D_COD >=", value, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodLessThan(String value) {
            addCriterion("MGWXYS_D_COD <", value, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodLessThanOrEqualTo(String value) {
            addCriterion("MGWXYS_D_COD <=", value, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodLike(String value) {
            addCriterion("MGWXYS_D_COD like", value, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodNotLike(String value) {
            addCriterion("MGWXYS_D_COD not like", value, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodIn(List<String> values) {
            addCriterion("MGWXYS_D_COD in", values, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodNotIn(List<String> values) {
            addCriterion("MGWXYS_D_COD not in", values, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodBetween(String value1, String value2) {
            addCriterion("MGWXYS_D_COD between", value1, value2, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andMgwxysDCodNotBetween(String value1, String value2) {
            addCriterion("MGWXYS_D_COD not between", value1, value2, "mgwxysDCod");
            return (Criteria) this;
        }

        public Criteria andTotalScoIsNull() {
            addCriterion("TOTAL_SCO is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoIsNotNull() {
            addCriterion("TOTAL_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SCO =", value, "totalSco");
            return (Criteria) this;
        }

        public Criteria andTotalScoNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SCO <>", value, "totalSco");
            return (Criteria) this;
        }

        public Criteria andTotalScoGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_SCO >", value, "totalSco");
            return (Criteria) this;
        }

        public Criteria andTotalScoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SCO >=", value, "totalSco");
            return (Criteria) this;
        }

        public Criteria andTotalScoLessThan(BigDecimal value) {
            addCriterion("TOTAL_SCO <", value, "totalSco");
            return (Criteria) this;
        }

        public Criteria andTotalScoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SCO <=", value, "totalSco");
            return (Criteria) this;
        }

        public Criteria andTotalScoIn(List<BigDecimal> values) {
            addCriterion("TOTAL_SCO in", values, "totalSco");
            return (Criteria) this;
        }

        public Criteria andTotalScoNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_SCO not in", values, "totalSco");
            return (Criteria) this;
        }

        public Criteria andTotalScoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_SCO between", value1, value2, "totalSco");
            return (Criteria) this;
        }

        public Criteria andTotalScoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_SCO not between", value1, value2, "totalSco");
            return (Criteria) this;
        }

        public Criteria andAssessDocIsNull() {
            addCriterion("ASSESS_DOC is null");
            return (Criteria) this;
        }

        public Criteria andAssessDocIsNotNull() {
            addCriterion("ASSESS_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andAssessDocEqualTo(String value) {
            addCriterion("ASSESS_DOC =", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotEqualTo(String value) {
            addCriterion("ASSESS_DOC <>", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocGreaterThan(String value) {
            addCriterion("ASSESS_DOC >", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_DOC >=", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocLessThan(String value) {
            addCriterion("ASSESS_DOC <", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_DOC <=", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocLike(String value) {
            addCriterion("ASSESS_DOC like", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotLike(String value) {
            addCriterion("ASSESS_DOC not like", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocIn(List<String> values) {
            addCriterion("ASSESS_DOC in", values, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotIn(List<String> values) {
            addCriterion("ASSESS_DOC not in", values, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocBetween(String value1, String value2) {
            addCriterion("ASSESS_DOC between", value1, value2, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotBetween(String value1, String value2) {
            addCriterion("ASSESS_DOC not between", value1, value2, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDateIsNull() {
            addCriterion("ASSESS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAssessDateIsNotNull() {
            addCriterion("ASSESS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAssessDateEqualTo(String value) {
            addCriterion("ASSESS_DATE =", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotEqualTo(String value) {
            addCriterion("ASSESS_DATE <>", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateGreaterThan(String value) {
            addCriterion("ASSESS_DATE >", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_DATE >=", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateLessThan(String value) {
            addCriterion("ASSESS_DATE <", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_DATE <=", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateLike(String value) {
            addCriterion("ASSESS_DATE like", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotLike(String value) {
            addCriterion("ASSESS_DATE not like", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateIn(List<String> values) {
            addCriterion("ASSESS_DATE in", values, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotIn(List<String> values) {
            addCriterion("ASSESS_DATE not in", values, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateBetween(String value1, String value2) {
            addCriterion("ASSESS_DATE between", value1, value2, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotBetween(String value1, String value2) {
            addCriterion("ASSESS_DATE not between", value1, value2, "assessDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreateDocIsNull() {
            addCriterion("CREATE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andCreateDocIsNotNull() {
            addCriterion("CREATE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDocEqualTo(String value) {
            addCriterion("CREATE_DOC =", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotEqualTo(String value) {
            addCriterion("CREATE_DOC <>", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocGreaterThan(String value) {
            addCriterion("CREATE_DOC >", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DOC >=", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLessThan(String value) {
            addCriterion("CREATE_DOC <", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DOC <=", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLike(String value) {
            addCriterion("CREATE_DOC like", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotLike(String value) {
            addCriterion("CREATE_DOC not like", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocIn(List<String> values) {
            addCriterion("CREATE_DOC in", values, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotIn(List<String> values) {
            addCriterion("CREATE_DOC not in", values, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocBetween(String value1, String value2) {
            addCriterion("CREATE_DOC between", value1, value2, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotBetween(String value1, String value2) {
            addCriterion("CREATE_DOC not between", value1, value2, "createDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIsNull() {
            addCriterion("UPDATE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIsNotNull() {
            addCriterion("UPDATE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDocEqualTo(String value) {
            addCriterion("UPDATE_DOC =", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotEqualTo(String value) {
            addCriterion("UPDATE_DOC <>", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocGreaterThan(String value) {
            addCriterion("UPDATE_DOC >", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DOC >=", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLessThan(String value) {
            addCriterion("UPDATE_DOC <", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DOC <=", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLike(String value) {
            addCriterion("UPDATE_DOC like", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotLike(String value) {
            addCriterion("UPDATE_DOC not like", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIn(List<String> values) {
            addCriterion("UPDATE_DOC in", values, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotIn(List<String> values) {
            addCriterion("UPDATE_DOC not in", values, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocBetween(String value1, String value2) {
            addCriterion("UPDATE_DOC between", value1, value2, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DOC not between", value1, value2, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamIsNull() {
            addCriterion("ASSESS_DOC_NAM is null");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamIsNotNull() {
            addCriterion("ASSESS_DOC_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamEqualTo(String value) {
            addCriterion("ASSESS_DOC_NAM =", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamNotEqualTo(String value) {
            addCriterion("ASSESS_DOC_NAM <>", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamGreaterThan(String value) {
            addCriterion("ASSESS_DOC_NAM >", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_DOC_NAM >=", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamLessThan(String value) {
            addCriterion("ASSESS_DOC_NAM <", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_DOC_NAM <=", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamLike(String value) {
            addCriterion("ASSESS_DOC_NAM like", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamNotLike(String value) {
            addCriterion("ASSESS_DOC_NAM not like", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamIn(List<String> values) {
            addCriterion("ASSESS_DOC_NAM in", values, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamNotIn(List<String> values) {
            addCriterion("ASSESS_DOC_NAM not in", values, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamBetween(String value1, String value2) {
            addCriterion("ASSESS_DOC_NAM between", value1, value2, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamNotBetween(String value1, String value2) {
            addCriterion("ASSESS_DOC_NAM not between", value1, value2, "assessDocNam");
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