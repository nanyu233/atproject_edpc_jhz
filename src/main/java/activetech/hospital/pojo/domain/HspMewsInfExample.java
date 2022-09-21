package activetech.hospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HspMewsInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspMewsInfExample() {
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

        public Criteria andSbpupNbrIsNull() {
            addCriterion("SBPUP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrIsNotNull() {
            addCriterion("SBPUP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrEqualTo(Short value) {
            addCriterion("SBPUP_NBR =", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrNotEqualTo(Short value) {
            addCriterion("SBPUP_NBR <>", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrGreaterThan(Short value) {
            addCriterion("SBPUP_NBR >", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("SBPUP_NBR >=", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrLessThan(Short value) {
            addCriterion("SBPUP_NBR <", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrLessThanOrEqualTo(Short value) {
            addCriterion("SBPUP_NBR <=", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrIn(List<Short> values) {
            addCriterion("SBPUP_NBR in", values, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrNotIn(List<Short> values) {
            addCriterion("SBPUP_NBR not in", values, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrBetween(Short value1, Short value2) {
            addCriterion("SBPUP_NBR between", value1, value2, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrNotBetween(Short value1, Short value2) {
            addCriterion("SBPUP_NBR not between", value1, value2, "sbpupNbr");
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

        public Criteria andTotScoIsNull() {
            addCriterion("TOT_SCO is null");
            return (Criteria) this;
        }

        public Criteria andTotScoIsNotNull() {
            addCriterion("TOT_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andTotScoEqualTo(Long value) {
            addCriterion("TOT_SCO =", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoNotEqualTo(Long value) {
            addCriterion("TOT_SCO <>", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoGreaterThan(Long value) {
            addCriterion("TOT_SCO >", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoGreaterThanOrEqualTo(Long value) {
            addCriterion("TOT_SCO >=", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoLessThan(Long value) {
            addCriterion("TOT_SCO <", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoLessThanOrEqualTo(Long value) {
            addCriterion("TOT_SCO <=", value, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoIn(List<Long> values) {
            addCriterion("TOT_SCO in", values, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoNotIn(List<Long> values) {
            addCriterion("TOT_SCO not in", values, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoBetween(Long value1, Long value2) {
            addCriterion("TOT_SCO between", value1, value2, "totSco");
            return (Criteria) this;
        }

        public Criteria andTotScoNotBetween(Long value1, Long value2) {
            addCriterion("TOT_SCO not between", value1, value2, "totSco");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodIsNull() {
            addCriterion("CHK_LVL_COD is null");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodIsNotNull() {
            addCriterion("CHK_LVL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodEqualTo(String value) {
            addCriterion("CHK_LVL_COD =", value, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodNotEqualTo(String value) {
            addCriterion("CHK_LVL_COD <>", value, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodGreaterThan(String value) {
            addCriterion("CHK_LVL_COD >", value, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_LVL_COD >=", value, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodLessThan(String value) {
            addCriterion("CHK_LVL_COD <", value, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodLessThanOrEqualTo(String value) {
            addCriterion("CHK_LVL_COD <=", value, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodLike(String value) {
            addCriterion("CHK_LVL_COD like", value, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodNotLike(String value) {
            addCriterion("CHK_LVL_COD not like", value, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodIn(List<String> values) {
            addCriterion("CHK_LVL_COD in", values, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodNotIn(List<String> values) {
            addCriterion("CHK_LVL_COD not in", values, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodBetween(String value1, String value2) {
            addCriterion("CHK_LVL_COD between", value1, value2, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andChkLvlCodNotBetween(String value1, String value2) {
            addCriterion("CHK_LVL_COD not between", value1, value2, "chkLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodIsNull() {
            addCriterion("MOD_LVL_COD is null");
            return (Criteria) this;
        }

        public Criteria andModLvlCodIsNotNull() {
            addCriterion("MOD_LVL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andModLvlCodEqualTo(String value) {
            addCriterion("MOD_LVL_COD =", value, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodNotEqualTo(String value) {
            addCriterion("MOD_LVL_COD <>", value, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodGreaterThan(String value) {
            addCriterion("MOD_LVL_COD >", value, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_LVL_COD >=", value, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodLessThan(String value) {
            addCriterion("MOD_LVL_COD <", value, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodLessThanOrEqualTo(String value) {
            addCriterion("MOD_LVL_COD <=", value, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodLike(String value) {
            addCriterion("MOD_LVL_COD like", value, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodNotLike(String value) {
            addCriterion("MOD_LVL_COD not like", value, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodIn(List<String> values) {
            addCriterion("MOD_LVL_COD in", values, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodNotIn(List<String> values) {
            addCriterion("MOD_LVL_COD not in", values, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodBetween(String value1, String value2) {
            addCriterion("MOD_LVL_COD between", value1, value2, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlCodNotBetween(String value1, String value2) {
            addCriterion("MOD_LVL_COD not between", value1, value2, "modLvlCod");
            return (Criteria) this;
        }

        public Criteria andModLvlDesIsNull() {
            addCriterion("MOD_LVL_DES is null");
            return (Criteria) this;
        }

        public Criteria andModLvlDesIsNotNull() {
            addCriterion("MOD_LVL_DES is not null");
            return (Criteria) this;
        }

        public Criteria andModLvlDesEqualTo(String value) {
            addCriterion("MOD_LVL_DES =", value, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andModLvlDesNotEqualTo(String value) {
            addCriterion("MOD_LVL_DES <>", value, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andModLvlDesGreaterThan(String value) {
            addCriterion("MOD_LVL_DES >", value, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andModLvlDesGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_LVL_DES >=", value, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andModLvlDesLessThan(String value) {
            addCriterion("MOD_LVL_DES <", value, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andModLvlDesLessThanOrEqualTo(String value) {
            addCriterion("MOD_LVL_DES <=", value, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andModLvlDesLike(String value) {
            addCriterion("MOD_LVL_DES like", value, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andModLvlDesNotLike(String value) {
            addCriterion("MOD_LVL_DES not like", value, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andModLvlDesIn(List<String> values) {
            addCriterion("MOD_LVL_DES in", values, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andModLvlDesNotIn(List<String> values) {
            addCriterion("MOD_LVL_DES not in", values, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andModLvlDesBetween(String value1, String value2) {
            addCriterion("MOD_LVL_DES between", value1, value2, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andModLvlDesNotBetween(String value1, String value2) {
            addCriterion("MOD_LVL_DES not between", value1, value2, "modLvlDes");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrIsNull() {
            addCriterion("SBPDOWN_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrIsNotNull() {
            addCriterion("SBPDOWN_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrEqualTo(Short value) {
            addCriterion("SBPDOWN_NBR =", value, "sbpdownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrNotEqualTo(Short value) {
            addCriterion("SBPDOWN_NBR <>", value, "sbpdownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrGreaterThan(Short value) {
            addCriterion("SBPDOWN_NBR >", value, "sbpdownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("SBPDOWN_NBR >=", value, "sbpdownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrLessThan(Short value) {
            addCriterion("SBPDOWN_NBR <", value, "sbpdownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrLessThanOrEqualTo(Short value) {
            addCriterion("SBPDOWN_NBR <=", value, "sbpdownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrIn(List<Short> values) {
            addCriterion("SBPDOWN_NBR in", values, "sbpdownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrNotIn(List<Short> values) {
            addCriterion("SBPDOWN_NBR not in", values, "sbpdownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrBetween(Short value1, Short value2) {
            addCriterion("SBPDOWN_NBR between", value1, value2, "sbpdownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpdownNbrNotBetween(Short value1, Short value2) {
            addCriterion("SBPDOWN_NBR not between", value1, value2, "sbpdownNbr");
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