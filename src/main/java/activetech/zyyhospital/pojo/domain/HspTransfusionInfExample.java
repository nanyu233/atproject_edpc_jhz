package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspTransfusionInfExample {
    /**
     * ZJYY.HSP_TRANSFUSION_INF
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_TRANSFUSION_INF
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_TRANSFUSION_INF
     */
    protected List<Criteria> oredCriteria;

    public HspTransfusionInfExample() {
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
     * ZJYY.HSP_TRANSFUSION_INF 2020-07-02
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

        public Criteria andTransfusionSeqIsNull() {
            addCriterion("TRANSFUSION_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqIsNotNull() {
            addCriterion("TRANSFUSION_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqEqualTo(String value) {
            addCriterion("TRANSFUSION_SEQ =", value, "transfusionSeq");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqNotEqualTo(String value) {
            addCriterion("TRANSFUSION_SEQ <>", value, "transfusionSeq");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqGreaterThan(String value) {
            addCriterion("TRANSFUSION_SEQ >", value, "transfusionSeq");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFUSION_SEQ >=", value, "transfusionSeq");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqLessThan(String value) {
            addCriterion("TRANSFUSION_SEQ <", value, "transfusionSeq");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqLessThanOrEqualTo(String value) {
            addCriterion("TRANSFUSION_SEQ <=", value, "transfusionSeq");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqLike(String value) {
            addCriterion("TRANSFUSION_SEQ like", value, "transfusionSeq");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqNotLike(String value) {
            addCriterion("TRANSFUSION_SEQ not like", value, "transfusionSeq");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqIn(List<String> values) {
            addCriterion("TRANSFUSION_SEQ in", values, "transfusionSeq");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqNotIn(List<String> values) {
            addCriterion("TRANSFUSION_SEQ not in", values, "transfusionSeq");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqBetween(String value1, String value2) {
            addCriterion("TRANSFUSION_SEQ between", value1, value2, "transfusionSeq");
            return (Criteria) this;
        }

        public Criteria andTransfusionSeqNotBetween(String value1, String value2) {
            addCriterion("TRANSFUSION_SEQ not between", value1, value2, "transfusionSeq");
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

        public Criteria andInfusionStartDatIsNull() {
            addCriterion("INFUSION_START_DAT is null");
            return (Criteria) this;
        }

        public Criteria andInfusionStartDatIsNotNull() {
            addCriterion("INFUSION_START_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andInfusionStartDatEqualTo(Date value) {
            addCriterion("INFUSION_START_DAT =", value, "infusionStartDat");
            return (Criteria) this;
        }

        public Criteria andInfusionStartDatNotEqualTo(Date value) {
            addCriterion("INFUSION_START_DAT <>", value, "infusionStartDat");
            return (Criteria) this;
        }

        public Criteria andInfusionStartDatGreaterThan(Date value) {
            addCriterion("INFUSION_START_DAT >", value, "infusionStartDat");
            return (Criteria) this;
        }

        public Criteria andInfusionStartDatGreaterThanOrEqualTo(Date value) {
            addCriterion("INFUSION_START_DAT >=", value, "infusionStartDat");
            return (Criteria) this;
        }

        public Criteria andInfusionStartDatLessThan(Date value) {
            addCriterion("INFUSION_START_DAT <", value, "infusionStartDat");
            return (Criteria) this;
        }

        public Criteria andInfusionStartDatLessThanOrEqualTo(Date value) {
            addCriterion("INFUSION_START_DAT <=", value, "infusionStartDat");
            return (Criteria) this;
        }

        public Criteria andInfusionStartDatIn(List<Date> values) {
            addCriterion("INFUSION_START_DAT in", values, "infusionStartDat");
            return (Criteria) this;
        }

        public Criteria andInfusionStartDatNotIn(List<Date> values) {
            addCriterion("INFUSION_START_DAT not in", values, "infusionStartDat");
            return (Criteria) this;
        }

        public Criteria andInfusionStartDatBetween(Date value1, Date value2) {
            addCriterion("INFUSION_START_DAT between", value1, value2, "infusionStartDat");
            return (Criteria) this;
        }

        public Criteria andInfusionStartDatNotBetween(Date value1, Date value2) {
            addCriterion("INFUSION_START_DAT not between", value1, value2, "infusionStartDat");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatIsNull() {
            addCriterion("INFUSION_END_DAT is null");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatIsNotNull() {
            addCriterion("INFUSION_END_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatEqualTo(Date value) {
            addCriterion("INFUSION_END_DAT =", value, "infusionEndDat");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatNotEqualTo(Date value) {
            addCriterion("INFUSION_END_DAT <>", value, "infusionEndDat");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatGreaterThan(Date value) {
            addCriterion("INFUSION_END_DAT >", value, "infusionEndDat");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatGreaterThanOrEqualTo(Date value) {
            addCriterion("INFUSION_END_DAT >=", value, "infusionEndDat");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatLessThan(Date value) {
            addCriterion("INFUSION_END_DAT <", value, "infusionEndDat");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatLessThanOrEqualTo(Date value) {
            addCriterion("INFUSION_END_DAT <=", value, "infusionEndDat");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatIn(List<Date> values) {
            addCriterion("INFUSION_END_DAT in", values, "infusionEndDat");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatNotIn(List<Date> values) {
            addCriterion("INFUSION_END_DAT not in", values, "infusionEndDat");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatBetween(Date value1, Date value2) {
            addCriterion("INFUSION_END_DAT between", value1, value2, "infusionEndDat");
            return (Criteria) this;
        }

        public Criteria andInfusionEndDatNotBetween(Date value1, Date value2) {
            addCriterion("INFUSION_END_DAT not between", value1, value2, "infusionEndDat");
            return (Criteria) this;
        }

        public Criteria andIndicationIsNull() {
            addCriterion("INDICATION is null");
            return (Criteria) this;
        }

        public Criteria andIndicationIsNotNull() {
            addCriterion("INDICATION is not null");
            return (Criteria) this;
        }

        public Criteria andIndicationEqualTo(String value) {
            addCriterion("INDICATION =", value, "indication");
            return (Criteria) this;
        }

        public Criteria andIndicationNotEqualTo(String value) {
            addCriterion("INDICATION <>", value, "indication");
            return (Criteria) this;
        }

        public Criteria andIndicationGreaterThan(String value) {
            addCriterion("INDICATION >", value, "indication");
            return (Criteria) this;
        }

        public Criteria andIndicationGreaterThanOrEqualTo(String value) {
            addCriterion("INDICATION >=", value, "indication");
            return (Criteria) this;
        }

        public Criteria andIndicationLessThan(String value) {
            addCriterion("INDICATION <", value, "indication");
            return (Criteria) this;
        }

        public Criteria andIndicationLessThanOrEqualTo(String value) {
            addCriterion("INDICATION <=", value, "indication");
            return (Criteria) this;
        }

        public Criteria andIndicationLike(String value) {
            addCriterion("INDICATION like", value, "indication");
            return (Criteria) this;
        }

        public Criteria andIndicationNotLike(String value) {
            addCriterion("INDICATION not like", value, "indication");
            return (Criteria) this;
        }

        public Criteria andIndicationIn(List<String> values) {
            addCriterion("INDICATION in", values, "indication");
            return (Criteria) this;
        }

        public Criteria andIndicationNotIn(List<String> values) {
            addCriterion("INDICATION not in", values, "indication");
            return (Criteria) this;
        }

        public Criteria andIndicationBetween(String value1, String value2) {
            addCriterion("INDICATION between", value1, value2, "indication");
            return (Criteria) this;
        }

        public Criteria andIndicationNotBetween(String value1, String value2) {
            addCriterion("INDICATION not between", value1, value2, "indication");
            return (Criteria) this;
        }

        public Criteria andCompositionIsNull() {
            addCriterion("COMPOSITION is null");
            return (Criteria) this;
        }

        public Criteria andCompositionIsNotNull() {
            addCriterion("COMPOSITION is not null");
            return (Criteria) this;
        }

        public Criteria andCompositionEqualTo(String value) {
            addCriterion("COMPOSITION =", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionNotEqualTo(String value) {
            addCriterion("COMPOSITION <>", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionGreaterThan(String value) {
            addCriterion("COMPOSITION >", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionGreaterThanOrEqualTo(String value) {
            addCriterion("COMPOSITION >=", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionLessThan(String value) {
            addCriterion("COMPOSITION <", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionLessThanOrEqualTo(String value) {
            addCriterion("COMPOSITION <=", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionLike(String value) {
            addCriterion("COMPOSITION like", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionNotLike(String value) {
            addCriterion("COMPOSITION not like", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionIn(List<String> values) {
            addCriterion("COMPOSITION in", values, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionNotIn(List<String> values) {
            addCriterion("COMPOSITION not in", values, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionBetween(String value1, String value2) {
            addCriterion("COMPOSITION between", value1, value2, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionNotBetween(String value1, String value2) {
            addCriterion("COMPOSITION not between", value1, value2, "composition");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("AMOUNT like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("AMOUNT not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAssessmentIsNull() {
            addCriterion("ASSESSMENT is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentIsNotNull() {
            addCriterion("ASSESSMENT is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentEqualTo(String value) {
            addCriterion("ASSESSMENT =", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentNotEqualTo(String value) {
            addCriterion("ASSESSMENT <>", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentGreaterThan(String value) {
            addCriterion("ASSESSMENT >", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESSMENT >=", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentLessThan(String value) {
            addCriterion("ASSESSMENT <", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentLessThanOrEqualTo(String value) {
            addCriterion("ASSESSMENT <=", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentLike(String value) {
            addCriterion("ASSESSMENT like", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentNotLike(String value) {
            addCriterion("ASSESSMENT not like", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentIn(List<String> values) {
            addCriterion("ASSESSMENT in", values, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentNotIn(List<String> values) {
            addCriterion("ASSESSMENT not in", values, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentBetween(String value1, String value2) {
            addCriterion("ASSESSMENT between", value1, value2, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentNotBetween(String value1, String value2) {
            addCriterion("ASSESSMENT not between", value1, value2, "assessment");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessIsNull() {
            addCriterion("INFUSION_PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessIsNotNull() {
            addCriterion("INFUSION_PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessEqualTo(String value) {
            addCriterion("INFUSION_PROCESS =", value, "infusionProcess");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessNotEqualTo(String value) {
            addCriterion("INFUSION_PROCESS <>", value, "infusionProcess");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessGreaterThan(String value) {
            addCriterion("INFUSION_PROCESS >", value, "infusionProcess");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessGreaterThanOrEqualTo(String value) {
            addCriterion("INFUSION_PROCESS >=", value, "infusionProcess");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessLessThan(String value) {
            addCriterion("INFUSION_PROCESS <", value, "infusionProcess");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessLessThanOrEqualTo(String value) {
            addCriterion("INFUSION_PROCESS <=", value, "infusionProcess");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessLike(String value) {
            addCriterion("INFUSION_PROCESS like", value, "infusionProcess");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessNotLike(String value) {
            addCriterion("INFUSION_PROCESS not like", value, "infusionProcess");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessIn(List<String> values) {
            addCriterion("INFUSION_PROCESS in", values, "infusionProcess");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessNotIn(List<String> values) {
            addCriterion("INFUSION_PROCESS not in", values, "infusionProcess");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessBetween(String value1, String value2) {
            addCriterion("INFUSION_PROCESS between", value1, value2, "infusionProcess");
            return (Criteria) this;
        }

        public Criteria andInfusionProcessNotBetween(String value1, String value2) {
            addCriterion("INFUSION_PROCESS not between", value1, value2, "infusionProcess");
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

        public Criteria andTmpNbrEqualTo(String value) {
            addCriterion("TMP_NBR =", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotEqualTo(String value) {
            addCriterion("TMP_NBR <>", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrGreaterThan(String value) {
            addCriterion("TMP_NBR >", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrGreaterThanOrEqualTo(String value) {
            addCriterion("TMP_NBR >=", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLessThan(String value) {
            addCriterion("TMP_NBR <", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLessThanOrEqualTo(String value) {
            addCriterion("TMP_NBR <=", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLike(String value) {
            addCriterion("TMP_NBR like", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotLike(String value) {
            addCriterion("TMP_NBR not like", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrIn(List<String> values) {
            addCriterion("TMP_NBR in", values, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotIn(List<String> values) {
            addCriterion("TMP_NBR not in", values, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrBetween(String value1, String value2) {
            addCriterion("TMP_NBR between", value1, value2, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotBetween(String value1, String value2) {
            addCriterion("TMP_NBR not between", value1, value2, "tmpNbr");
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

        public Criteria andPulseIsNull() {
            addCriterion("PULSE is null");
            return (Criteria) this;
        }

        public Criteria andPulseIsNotNull() {
            addCriterion("PULSE is not null");
            return (Criteria) this;
        }

        public Criteria andPulseEqualTo(String value) {
            addCriterion("PULSE =", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotEqualTo(String value) {
            addCriterion("PULSE <>", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseGreaterThan(String value) {
            addCriterion("PULSE >", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseGreaterThanOrEqualTo(String value) {
            addCriterion("PULSE >=", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLessThan(String value) {
            addCriterion("PULSE <", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLessThanOrEqualTo(String value) {
            addCriterion("PULSE <=", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLike(String value) {
            addCriterion("PULSE like", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotLike(String value) {
            addCriterion("PULSE not like", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseIn(List<String> values) {
            addCriterion("PULSE in", values, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotIn(List<String> values) {
            addCriterion("PULSE not in", values, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseBetween(String value1, String value2) {
            addCriterion("PULSE between", value1, value2, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotBetween(String value1, String value2) {
            addCriterion("PULSE not between", value1, value2, "pulse");
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

        public Criteria andBreNbrEqualTo(String value) {
            addCriterion("BRE_NBR =", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotEqualTo(String value) {
            addCriterion("BRE_NBR <>", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThan(String value) {
            addCriterion("BRE_NBR >", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThanOrEqualTo(String value) {
            addCriterion("BRE_NBR >=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThan(String value) {
            addCriterion("BRE_NBR <", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThanOrEqualTo(String value) {
            addCriterion("BRE_NBR <=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLike(String value) {
            addCriterion("BRE_NBR like", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotLike(String value) {
            addCriterion("BRE_NBR not like", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrIn(List<String> values) {
            addCriterion("BRE_NBR in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotIn(List<String> values) {
            addCriterion("BRE_NBR not in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrBetween(String value1, String value2) {
            addCriterion("BRE_NBR between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotBetween(String value1, String value2) {
            addCriterion("BRE_NBR not between", value1, value2, "breNbr");
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

        public Criteria andSbpUpNbrIsNull() {
            addCriterion("SBP_UP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIsNotNull() {
            addCriterion("SBP_UP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrEqualTo(String value) {
            addCriterion("SBP_UP_NBR =", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotEqualTo(String value) {
            addCriterion("SBP_UP_NBR <>", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrGreaterThan(String value) {
            addCriterion("SBP_UP_NBR >", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrGreaterThanOrEqualTo(String value) {
            addCriterion("SBP_UP_NBR >=", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLessThan(String value) {
            addCriterion("SBP_UP_NBR <", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLessThanOrEqualTo(String value) {
            addCriterion("SBP_UP_NBR <=", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLike(String value) {
            addCriterion("SBP_UP_NBR like", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotLike(String value) {
            addCriterion("SBP_UP_NBR not like", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIn(List<String> values) {
            addCriterion("SBP_UP_NBR in", values, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotIn(List<String> values) {
            addCriterion("SBP_UP_NBR not in", values, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrBetween(String value1, String value2) {
            addCriterion("SBP_UP_NBR between", value1, value2, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotBetween(String value1, String value2) {
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

        public Criteria andSbpDownNbrEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR =", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR <>", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrGreaterThan(String value) {
            addCriterion("SBP_DOWN_NBR >", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrGreaterThanOrEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR >=", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLessThan(String value) {
            addCriterion("SBP_DOWN_NBR <", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLessThanOrEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR <=", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLike(String value) {
            addCriterion("SBP_DOWN_NBR like", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotLike(String value) {
            addCriterion("SBP_DOWN_NBR not like", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIn(List<String> values) {
            addCriterion("SBP_DOWN_NBR in", values, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotIn(List<String> values) {
            addCriterion("SBP_DOWN_NBR not in", values, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrBetween(String value1, String value2) {
            addCriterion("SBP_DOWN_NBR between", value1, value2, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotBetween(String value1, String value2) {
            addCriterion("SBP_DOWN_NBR not between", value1, value2, "sbpDownNbr");
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

        public Criteria andOxyNbrIsNull() {
            addCriterion("OXY_NBR is null");
            return (Criteria) this;
        }

        public Criteria andOxyNbrIsNotNull() {
            addCriterion("OXY_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andOxyNbrEqualTo(String value) {
            addCriterion("OXY_NBR =", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotEqualTo(String value) {
            addCriterion("OXY_NBR <>", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrGreaterThan(String value) {
            addCriterion("OXY_NBR >", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrGreaterThanOrEqualTo(String value) {
            addCriterion("OXY_NBR >=", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrLessThan(String value) {
            addCriterion("OXY_NBR <", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrLessThanOrEqualTo(String value) {
            addCriterion("OXY_NBR <=", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrLike(String value) {
            addCriterion("OXY_NBR like", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotLike(String value) {
            addCriterion("OXY_NBR not like", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrIn(List<String> values) {
            addCriterion("OXY_NBR in", values, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotIn(List<String> values) {
            addCriterion("OXY_NBR not in", values, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrBetween(String value1, String value2) {
            addCriterion("OXY_NBR between", value1, value2, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotBetween(String value1, String value2) {
            addCriterion("OXY_NBR not between", value1, value2, "oxyNbr");
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

        public Criteria andPbgNbrIsNull() {
            addCriterion("PBG_NBR is null");
            return (Criteria) this;
        }

        public Criteria andPbgNbrIsNotNull() {
            addCriterion("PBG_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andPbgNbrEqualTo(String value) {
            addCriterion("PBG_NBR =", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrNotEqualTo(String value) {
            addCriterion("PBG_NBR <>", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrGreaterThan(String value) {
            addCriterion("PBG_NBR >", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrGreaterThanOrEqualTo(String value) {
            addCriterion("PBG_NBR >=", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrLessThan(String value) {
            addCriterion("PBG_NBR <", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrLessThanOrEqualTo(String value) {
            addCriterion("PBG_NBR <=", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrLike(String value) {
            addCriterion("PBG_NBR like", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrNotLike(String value) {
            addCriterion("PBG_NBR not like", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrIn(List<String> values) {
            addCriterion("PBG_NBR in", values, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrNotIn(List<String> values) {
            addCriterion("PBG_NBR not in", values, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrBetween(String value1, String value2) {
            addCriterion("PBG_NBR between", value1, value2, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrNotBetween(String value1, String value2) {
            addCriterion("PBG_NBR not between", value1, value2, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgIsNull() {
            addCriterion("PBG_NBR_FLG is null");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgIsNotNull() {
            addCriterion("PBG_NBR_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgEqualTo(String value) {
            addCriterion("PBG_NBR_FLG =", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgNotEqualTo(String value) {
            addCriterion("PBG_NBR_FLG <>", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgGreaterThan(String value) {
            addCriterion("PBG_NBR_FLG >", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgGreaterThanOrEqualTo(String value) {
            addCriterion("PBG_NBR_FLG >=", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgLessThan(String value) {
            addCriterion("PBG_NBR_FLG <", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgLessThanOrEqualTo(String value) {
            addCriterion("PBG_NBR_FLG <=", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgLike(String value) {
            addCriterion("PBG_NBR_FLG like", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgNotLike(String value) {
            addCriterion("PBG_NBR_FLG not like", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgIn(List<String> values) {
            addCriterion("PBG_NBR_FLG in", values, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgNotIn(List<String> values) {
            addCriterion("PBG_NBR_FLG not in", values, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgBetween(String value1, String value2) {
            addCriterion("PBG_NBR_FLG between", value1, value2, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgNotBetween(String value1, String value2) {
            addCriterion("PBG_NBR_FLG not between", value1, value2, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeIsNull() {
            addCriterion("PBG_NBR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeIsNotNull() {
            addCriterion("PBG_NBR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeEqualTo(String value) {
            addCriterion("PBG_NBR_TYPE =", value, "pbgNbrType");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeNotEqualTo(String value) {
            addCriterion("PBG_NBR_TYPE <>", value, "pbgNbrType");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeGreaterThan(String value) {
            addCriterion("PBG_NBR_TYPE >", value, "pbgNbrType");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PBG_NBR_TYPE >=", value, "pbgNbrType");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeLessThan(String value) {
            addCriterion("PBG_NBR_TYPE <", value, "pbgNbrType");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeLessThanOrEqualTo(String value) {
            addCriterion("PBG_NBR_TYPE <=", value, "pbgNbrType");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeLike(String value) {
            addCriterion("PBG_NBR_TYPE like", value, "pbgNbrType");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeNotLike(String value) {
            addCriterion("PBG_NBR_TYPE not like", value, "pbgNbrType");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeIn(List<String> values) {
            addCriterion("PBG_NBR_TYPE in", values, "pbgNbrType");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeNotIn(List<String> values) {
            addCriterion("PBG_NBR_TYPE not in", values, "pbgNbrType");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeBetween(String value1, String value2) {
            addCriterion("PBG_NBR_TYPE between", value1, value2, "pbgNbrType");
            return (Criteria) this;
        }

        public Criteria andPbgNbrTypeNotBetween(String value1, String value2) {
            addCriterion("PBG_NBR_TYPE not between", value1, value2, "pbgNbrType");
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

        public Criteria andHrtRteEqualTo(String value) {
            addCriterion("HRT_RTE =", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotEqualTo(String value) {
            addCriterion("HRT_RTE <>", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThan(String value) {
            addCriterion("HRT_RTE >", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThanOrEqualTo(String value) {
            addCriterion("HRT_RTE >=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThan(String value) {
            addCriterion("HRT_RTE <", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThanOrEqualTo(String value) {
            addCriterion("HRT_RTE <=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLike(String value) {
            addCriterion("HRT_RTE like", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotLike(String value) {
            addCriterion("HRT_RTE not like", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteIn(List<String> values) {
            addCriterion("HRT_RTE in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotIn(List<String> values) {
            addCriterion("HRT_RTE not in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteBetween(String value1, String value2) {
            addCriterion("HRT_RTE between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotBetween(String value1, String value2) {
            addCriterion("HRT_RTE not between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andReactionIsNull() {
            addCriterion("REACTION is null");
            return (Criteria) this;
        }

        public Criteria andReactionIsNotNull() {
            addCriterion("REACTION is not null");
            return (Criteria) this;
        }

        public Criteria andReactionEqualTo(String value) {
            addCriterion("REACTION =", value, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionNotEqualTo(String value) {
            addCriterion("REACTION <>", value, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionGreaterThan(String value) {
            addCriterion("REACTION >", value, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionGreaterThanOrEqualTo(String value) {
            addCriterion("REACTION >=", value, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionLessThan(String value) {
            addCriterion("REACTION <", value, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionLessThanOrEqualTo(String value) {
            addCriterion("REACTION <=", value, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionLike(String value) {
            addCriterion("REACTION like", value, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionNotLike(String value) {
            addCriterion("REACTION not like", value, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionIn(List<String> values) {
            addCriterion("REACTION in", values, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionNotIn(List<String> values) {
            addCriterion("REACTION not in", values, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionBetween(String value1, String value2) {
            addCriterion("REACTION between", value1, value2, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionNotBetween(String value1, String value2) {
            addCriterion("REACTION not between", value1, value2, "reaction");
            return (Criteria) this;
        }

        public Criteria andReactionContentIsNull() {
            addCriterion("REACTION_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andReactionContentIsNotNull() {
            addCriterion("REACTION_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andReactionContentEqualTo(String value) {
            addCriterion("REACTION_CONTENT =", value, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andReactionContentNotEqualTo(String value) {
            addCriterion("REACTION_CONTENT <>", value, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andReactionContentGreaterThan(String value) {
            addCriterion("REACTION_CONTENT >", value, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andReactionContentGreaterThanOrEqualTo(String value) {
            addCriterion("REACTION_CONTENT >=", value, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andReactionContentLessThan(String value) {
            addCriterion("REACTION_CONTENT <", value, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andReactionContentLessThanOrEqualTo(String value) {
            addCriterion("REACTION_CONTENT <=", value, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andReactionContentLike(String value) {
            addCriterion("REACTION_CONTENT like", value, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andReactionContentNotLike(String value) {
            addCriterion("REACTION_CONTENT not like", value, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andReactionContentIn(List<String> values) {
            addCriterion("REACTION_CONTENT in", values, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andReactionContentNotIn(List<String> values) {
            addCriterion("REACTION_CONTENT not in", values, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andReactionContentBetween(String value1, String value2) {
            addCriterion("REACTION_CONTENT between", value1, value2, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andReactionContentNotBetween(String value1, String value2) {
            addCriterion("REACTION_CONTENT not between", value1, value2, "reactionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanIsNull() {
            addCriterion("EVALUATION_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanIsNotNull() {
            addCriterion("EVALUATION_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanEqualTo(String value) {
            addCriterion("EVALUATION_PLAN =", value, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanNotEqualTo(String value) {
            addCriterion("EVALUATION_PLAN <>", value, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanGreaterThan(String value) {
            addCriterion("EVALUATION_PLAN >", value, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATION_PLAN >=", value, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanLessThan(String value) {
            addCriterion("EVALUATION_PLAN <", value, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanLessThanOrEqualTo(String value) {
            addCriterion("EVALUATION_PLAN <=", value, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanLike(String value) {
            addCriterion("EVALUATION_PLAN like", value, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanNotLike(String value) {
            addCriterion("EVALUATION_PLAN not like", value, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanIn(List<String> values) {
            addCriterion("EVALUATION_PLAN in", values, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanNotIn(List<String> values) {
            addCriterion("EVALUATION_PLAN not in", values, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanBetween(String value1, String value2) {
            addCriterion("EVALUATION_PLAN between", value1, value2, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andEvaluationPlanNotBetween(String value1, String value2) {
            addCriterion("EVALUATION_PLAN not between", value1, value2, "evaluationPlan");
            return (Criteria) this;
        }

        public Criteria andDocCodIsNull() {
            addCriterion("DOC_COD is null");
            return (Criteria) this;
        }

        public Criteria andDocCodIsNotNull() {
            addCriterion("DOC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andDocCodEqualTo(String value) {
            addCriterion("DOC_COD =", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodNotEqualTo(String value) {
            addCriterion("DOC_COD <>", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodGreaterThan(String value) {
            addCriterion("DOC_COD >", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_COD >=", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodLessThan(String value) {
            addCriterion("DOC_COD <", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodLessThanOrEqualTo(String value) {
            addCriterion("DOC_COD <=", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodLike(String value) {
            addCriterion("DOC_COD like", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodNotLike(String value) {
            addCriterion("DOC_COD not like", value, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodIn(List<String> values) {
            addCriterion("DOC_COD in", values, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodNotIn(List<String> values) {
            addCriterion("DOC_COD not in", values, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodBetween(String value1, String value2) {
            addCriterion("DOC_COD between", value1, value2, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocCodNotBetween(String value1, String value2) {
            addCriterion("DOC_COD not between", value1, value2, "docCod");
            return (Criteria) this;
        }

        public Criteria andDocNamIsNull() {
            addCriterion("DOC_NAM is null");
            return (Criteria) this;
        }

        public Criteria andDocNamIsNotNull() {
            addCriterion("DOC_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andDocNamEqualTo(String value) {
            addCriterion("DOC_NAM =", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotEqualTo(String value) {
            addCriterion("DOC_NAM <>", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamGreaterThan(String value) {
            addCriterion("DOC_NAM >", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_NAM >=", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamLessThan(String value) {
            addCriterion("DOC_NAM <", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamLessThanOrEqualTo(String value) {
            addCriterion("DOC_NAM <=", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamLike(String value) {
            addCriterion("DOC_NAM like", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotLike(String value) {
            addCriterion("DOC_NAM not like", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamIn(List<String> values) {
            addCriterion("DOC_NAM in", values, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotIn(List<String> values) {
            addCriterion("DOC_NAM not in", values, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamBetween(String value1, String value2) {
            addCriterion("DOC_NAM between", value1, value2, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotBetween(String value1, String value2) {
            addCriterion("DOC_NAM not between", value1, value2, "docNam");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatIsNull() {
            addCriterion("TRANSFUSION_DAT is null");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatIsNotNull() {
            addCriterion("TRANSFUSION_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatEqualTo(Date value) {
            addCriterion("TRANSFUSION_DAT =", value, "transfusionDat");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatNotEqualTo(Date value) {
            addCriterion("TRANSFUSION_DAT <>", value, "transfusionDat");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatGreaterThan(Date value) {
            addCriterion("TRANSFUSION_DAT >", value, "transfusionDat");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANSFUSION_DAT >=", value, "transfusionDat");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatLessThan(Date value) {
            addCriterion("TRANSFUSION_DAT <", value, "transfusionDat");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatLessThanOrEqualTo(Date value) {
            addCriterion("TRANSFUSION_DAT <=", value, "transfusionDat");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatIn(List<Date> values) {
            addCriterion("TRANSFUSION_DAT in", values, "transfusionDat");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatNotIn(List<Date> values) {
            addCriterion("TRANSFUSION_DAT not in", values, "transfusionDat");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatBetween(Date value1, Date value2) {
            addCriterion("TRANSFUSION_DAT between", value1, value2, "transfusionDat");
            return (Criteria) this;
        }

        public Criteria andTransfusionDatNotBetween(Date value1, Date value2) {
            addCriterion("TRANSFUSION_DAT not between", value1, value2, "transfusionDat");
            return (Criteria) this;
        }

        public Criteria andIsprintIsNull() {
            addCriterion("ISPRINT is null");
            return (Criteria) this;
        }

        public Criteria andIsprintIsNotNull() {
            addCriterion("ISPRINT is not null");
            return (Criteria) this;
        }

        public Criteria andIsprintEqualTo(String value) {
            addCriterion("ISPRINT =", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotEqualTo(String value) {
            addCriterion("ISPRINT <>", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintGreaterThan(String value) {
            addCriterion("ISPRINT >", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintGreaterThanOrEqualTo(String value) {
            addCriterion("ISPRINT >=", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLessThan(String value) {
            addCriterion("ISPRINT <", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLessThanOrEqualTo(String value) {
            addCriterion("ISPRINT <=", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLike(String value) {
            addCriterion("ISPRINT like", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotLike(String value) {
            addCriterion("ISPRINT not like", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintIn(List<String> values) {
            addCriterion("ISPRINT in", values, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotIn(List<String> values) {
            addCriterion("ISPRINT not in", values, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintBetween(String value1, String value2) {
            addCriterion("ISPRINT between", value1, value2, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotBetween(String value1, String value2) {
            addCriterion("ISPRINT not between", value1, value2, "isprint");
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

        public Criteria andCrtCodIsNull() {
            addCriterion("CRT_COD is null");
            return (Criteria) this;
        }

        public Criteria andCrtCodIsNotNull() {
            addCriterion("CRT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCrtCodEqualTo(String value) {
            addCriterion("CRT_COD =", value, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtCodNotEqualTo(String value) {
            addCriterion("CRT_COD <>", value, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtCodGreaterThan(String value) {
            addCriterion("CRT_COD >", value, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtCodGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_COD >=", value, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtCodLessThan(String value) {
            addCriterion("CRT_COD <", value, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtCodLessThanOrEqualTo(String value) {
            addCriterion("CRT_COD <=", value, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtCodLike(String value) {
            addCriterion("CRT_COD like", value, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtCodNotLike(String value) {
            addCriterion("CRT_COD not like", value, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtCodIn(List<String> values) {
            addCriterion("CRT_COD in", values, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtCodNotIn(List<String> values) {
            addCriterion("CRT_COD not in", values, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtCodBetween(String value1, String value2) {
            addCriterion("CRT_COD between", value1, value2, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtCodNotBetween(String value1, String value2) {
            addCriterion("CRT_COD not between", value1, value2, "crtCod");
            return (Criteria) this;
        }

        public Criteria andCrtNamIsNull() {
            addCriterion("CRT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCrtNamIsNotNull() {
            addCriterion("CRT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNamEqualTo(String value) {
            addCriterion("CRT_NAM =", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotEqualTo(String value) {
            addCriterion("CRT_NAM <>", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamGreaterThan(String value) {
            addCriterion("CRT_NAM >", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NAM >=", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLessThan(String value) {
            addCriterion("CRT_NAM <", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLessThanOrEqualTo(String value) {
            addCriterion("CRT_NAM <=", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLike(String value) {
            addCriterion("CRT_NAM like", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotLike(String value) {
            addCriterion("CRT_NAM not like", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamIn(List<String> values) {
            addCriterion("CRT_NAM in", values, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotIn(List<String> values) {
            addCriterion("CRT_NAM not in", values, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamBetween(String value1, String value2) {
            addCriterion("CRT_NAM between", value1, value2, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotBetween(String value1, String value2) {
            addCriterion("CRT_NAM not between", value1, value2, "crtNam");
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

        public Criteria andUpdCodIsNull() {
            addCriterion("UPD_COD is null");
            return (Criteria) this;
        }

        public Criteria andUpdCodIsNotNull() {
            addCriterion("UPD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andUpdCodEqualTo(String value) {
            addCriterion("UPD_COD =", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodNotEqualTo(String value) {
            addCriterion("UPD_COD <>", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodGreaterThan(String value) {
            addCriterion("UPD_COD >", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_COD >=", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodLessThan(String value) {
            addCriterion("UPD_COD <", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodLessThanOrEqualTo(String value) {
            addCriterion("UPD_COD <=", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodLike(String value) {
            addCriterion("UPD_COD like", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodNotLike(String value) {
            addCriterion("UPD_COD not like", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodIn(List<String> values) {
            addCriterion("UPD_COD in", values, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodNotIn(List<String> values) {
            addCriterion("UPD_COD not in", values, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodBetween(String value1, String value2) {
            addCriterion("UPD_COD between", value1, value2, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodNotBetween(String value1, String value2) {
            addCriterion("UPD_COD not between", value1, value2, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdNamIsNull() {
            addCriterion("UPD_NAM is null");
            return (Criteria) this;
        }

        public Criteria andUpdNamIsNotNull() {
            addCriterion("UPD_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdNamEqualTo(String value) {
            addCriterion("UPD_NAM =", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotEqualTo(String value) {
            addCriterion("UPD_NAM <>", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamGreaterThan(String value) {
            addCriterion("UPD_NAM >", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_NAM >=", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamLessThan(String value) {
            addCriterion("UPD_NAM <", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamLessThanOrEqualTo(String value) {
            addCriterion("UPD_NAM <=", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamLike(String value) {
            addCriterion("UPD_NAM like", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotLike(String value) {
            addCriterion("UPD_NAM not like", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamIn(List<String> values) {
            addCriterion("UPD_NAM in", values, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotIn(List<String> values) {
            addCriterion("UPD_NAM not in", values, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamBetween(String value1, String value2) {
            addCriterion("UPD_NAM between", value1, value2, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotBetween(String value1, String value2) {
            addCriterion("UPD_NAM not between", value1, value2, "updNam");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_TRANSFUSION_INF
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_TRANSFUSION_INF 2020-07-02
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