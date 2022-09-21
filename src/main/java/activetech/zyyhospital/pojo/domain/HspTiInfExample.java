package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspTiInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspTiInfExample() {
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

        public Criteria andTiSeqIsNull() {
            addCriterion("TI_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTiSeqIsNotNull() {
            addCriterion("TI_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTiSeqEqualTo(String value) {
            addCriterion("TI_SEQ =", value, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiSeqNotEqualTo(String value) {
            addCriterion("TI_SEQ <>", value, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiSeqGreaterThan(String value) {
            addCriterion("TI_SEQ >", value, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiSeqGreaterThanOrEqualTo(String value) {
            addCriterion("TI_SEQ >=", value, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiSeqLessThan(String value) {
            addCriterion("TI_SEQ <", value, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiSeqLessThanOrEqualTo(String value) {
            addCriterion("TI_SEQ <=", value, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiSeqLike(String value) {
            addCriterion("TI_SEQ like", value, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiSeqNotLike(String value) {
            addCriterion("TI_SEQ not like", value, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiSeqIn(List<String> values) {
            addCriterion("TI_SEQ in", values, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiSeqNotIn(List<String> values) {
            addCriterion("TI_SEQ not in", values, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiSeqBetween(String value1, String value2) {
            addCriterion("TI_SEQ between", value1, value2, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiSeqNotBetween(String value1, String value2) {
            addCriterion("TI_SEQ not between", value1, value2, "tiSeq");
            return (Criteria) this;
        }

        public Criteria andTiPartCodIsNull() {
            addCriterion("TI_PART_COD is null");
            return (Criteria) this;
        }

        public Criteria andTiPartCodIsNotNull() {
            addCriterion("TI_PART_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTiPartCodEqualTo(String value) {
            addCriterion("TI_PART_COD =", value, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiPartCodNotEqualTo(String value) {
            addCriterion("TI_PART_COD <>", value, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiPartCodGreaterThan(String value) {
            addCriterion("TI_PART_COD >", value, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiPartCodGreaterThanOrEqualTo(String value) {
            addCriterion("TI_PART_COD >=", value, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiPartCodLessThan(String value) {
            addCriterion("TI_PART_COD <", value, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiPartCodLessThanOrEqualTo(String value) {
            addCriterion("TI_PART_COD <=", value, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiPartCodLike(String value) {
            addCriterion("TI_PART_COD like", value, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiPartCodNotLike(String value) {
            addCriterion("TI_PART_COD not like", value, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiPartCodIn(List<String> values) {
            addCriterion("TI_PART_COD in", values, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiPartCodNotIn(List<String> values) {
            addCriterion("TI_PART_COD not in", values, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiPartCodBetween(String value1, String value2) {
            addCriterion("TI_PART_COD between", value1, value2, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiPartCodNotBetween(String value1, String value2) {
            addCriterion("TI_PART_COD not between", value1, value2, "tiPartCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodIsNull() {
            addCriterion("TI_TRM_COD is null");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodIsNotNull() {
            addCriterion("TI_TRM_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodEqualTo(String value) {
            addCriterion("TI_TRM_COD =", value, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodNotEqualTo(String value) {
            addCriterion("TI_TRM_COD <>", value, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodGreaterThan(String value) {
            addCriterion("TI_TRM_COD >", value, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodGreaterThanOrEqualTo(String value) {
            addCriterion("TI_TRM_COD >=", value, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodLessThan(String value) {
            addCriterion("TI_TRM_COD <", value, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodLessThanOrEqualTo(String value) {
            addCriterion("TI_TRM_COD <=", value, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodLike(String value) {
            addCriterion("TI_TRM_COD like", value, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodNotLike(String value) {
            addCriterion("TI_TRM_COD not like", value, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodIn(List<String> values) {
            addCriterion("TI_TRM_COD in", values, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodNotIn(List<String> values) {
            addCriterion("TI_TRM_COD not in", values, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodBetween(String value1, String value2) {
            addCriterion("TI_TRM_COD between", value1, value2, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiTrmCodNotBetween(String value1, String value2) {
            addCriterion("TI_TRM_COD not between", value1, value2, "tiTrmCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodIsNull() {
            addCriterion("TI_SBU_COD is null");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodIsNotNull() {
            addCriterion("TI_SBU_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodEqualTo(String value) {
            addCriterion("TI_SBU_COD =", value, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodNotEqualTo(String value) {
            addCriterion("TI_SBU_COD <>", value, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodGreaterThan(String value) {
            addCriterion("TI_SBU_COD >", value, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodGreaterThanOrEqualTo(String value) {
            addCriterion("TI_SBU_COD >=", value, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodLessThan(String value) {
            addCriterion("TI_SBU_COD <", value, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodLessThanOrEqualTo(String value) {
            addCriterion("TI_SBU_COD <=", value, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodLike(String value) {
            addCriterion("TI_SBU_COD like", value, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodNotLike(String value) {
            addCriterion("TI_SBU_COD not like", value, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodIn(List<String> values) {
            addCriterion("TI_SBU_COD in", values, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodNotIn(List<String> values) {
            addCriterion("TI_SBU_COD not in", values, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodBetween(String value1, String value2) {
            addCriterion("TI_SBU_COD between", value1, value2, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiSbuCodNotBetween(String value1, String value2) {
            addCriterion("TI_SBU_COD not between", value1, value2, "tiSbuCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodIsNull() {
            addCriterion("TI_PUL_COD is null");
            return (Criteria) this;
        }

        public Criteria andTiPulCodIsNotNull() {
            addCriterion("TI_PUL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTiPulCodEqualTo(String value) {
            addCriterion("TI_PUL_COD =", value, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodNotEqualTo(String value) {
            addCriterion("TI_PUL_COD <>", value, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodGreaterThan(String value) {
            addCriterion("TI_PUL_COD >", value, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodGreaterThanOrEqualTo(String value) {
            addCriterion("TI_PUL_COD >=", value, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodLessThan(String value) {
            addCriterion("TI_PUL_COD <", value, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodLessThanOrEqualTo(String value) {
            addCriterion("TI_PUL_COD <=", value, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodLike(String value) {
            addCriterion("TI_PUL_COD like", value, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodNotLike(String value) {
            addCriterion("TI_PUL_COD not like", value, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodIn(List<String> values) {
            addCriterion("TI_PUL_COD in", values, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodNotIn(List<String> values) {
            addCriterion("TI_PUL_COD not in", values, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodBetween(String value1, String value2) {
            addCriterion("TI_PUL_COD between", value1, value2, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiPulCodNotBetween(String value1, String value2) {
            addCriterion("TI_PUL_COD not between", value1, value2, "tiPulCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodIsNull() {
            addCriterion("TI_CSC_COD is null");
            return (Criteria) this;
        }

        public Criteria andTiCscCodIsNotNull() {
            addCriterion("TI_CSC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTiCscCodEqualTo(String value) {
            addCriterion("TI_CSC_COD =", value, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodNotEqualTo(String value) {
            addCriterion("TI_CSC_COD <>", value, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodGreaterThan(String value) {
            addCriterion("TI_CSC_COD >", value, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodGreaterThanOrEqualTo(String value) {
            addCriterion("TI_CSC_COD >=", value, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodLessThan(String value) {
            addCriterion("TI_CSC_COD <", value, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodLessThanOrEqualTo(String value) {
            addCriterion("TI_CSC_COD <=", value, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodLike(String value) {
            addCriterion("TI_CSC_COD like", value, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodNotLike(String value) {
            addCriterion("TI_CSC_COD not like", value, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodIn(List<String> values) {
            addCriterion("TI_CSC_COD in", values, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodNotIn(List<String> values) {
            addCriterion("TI_CSC_COD not in", values, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodBetween(String value1, String value2) {
            addCriterion("TI_CSC_COD between", value1, value2, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiCscCodNotBetween(String value1, String value2) {
            addCriterion("TI_CSC_COD not between", value1, value2, "tiCscCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodIsNull() {
            addCriterion("TI_BRE_COD is null");
            return (Criteria) this;
        }

        public Criteria andTiBreCodIsNotNull() {
            addCriterion("TI_BRE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTiBreCodEqualTo(String value) {
            addCriterion("TI_BRE_COD =", value, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodNotEqualTo(String value) {
            addCriterion("TI_BRE_COD <>", value, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodGreaterThan(String value) {
            addCriterion("TI_BRE_COD >", value, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodGreaterThanOrEqualTo(String value) {
            addCriterion("TI_BRE_COD >=", value, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodLessThan(String value) {
            addCriterion("TI_BRE_COD <", value, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodLessThanOrEqualTo(String value) {
            addCriterion("TI_BRE_COD <=", value, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodLike(String value) {
            addCriterion("TI_BRE_COD like", value, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodNotLike(String value) {
            addCriterion("TI_BRE_COD not like", value, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodIn(List<String> values) {
            addCriterion("TI_BRE_COD in", values, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodNotIn(List<String> values) {
            addCriterion("TI_BRE_COD not in", values, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodBetween(String value1, String value2) {
            addCriterion("TI_BRE_COD between", value1, value2, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiBreCodNotBetween(String value1, String value2) {
            addCriterion("TI_BRE_COD not between", value1, value2, "tiBreCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodIsNull() {
            addCriterion("TI_WCX_COD is null");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodIsNotNull() {
            addCriterion("TI_WCX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodEqualTo(String value) {
            addCriterion("TI_WCX_COD =", value, "tiWcxCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodNotEqualTo(String value) {
            addCriterion("TI_WCX_COD <>", value, "tiWcxCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodGreaterThan(String value) {
            addCriterion("TI_WCX_COD >", value, "tiWcxCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodGreaterThanOrEqualTo(String value) {
            addCriterion("TI_WCX_COD >=", value, "tiWcxCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodLessThan(String value) {
            addCriterion("TI_WCX_COD <", value, "tiWcxCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodLessThanOrEqualTo(String value) {
            addCriterion("TI_WCX_COD <=", value, "tiWcxCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodLike(String value) {
            addCriterion("TI_WCX_COD like", value, "tiWcxCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodNotLike(String value) {
            addCriterion("TI_WCX_COD not like", value, "tiWcxCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodIn(List<String> values) {
            addCriterion("TI_WCX_COD in", values, "tiWcxCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodNotIn(List<String> values) {
            addCriterion("TI_WCX_COD not in", values, "tiWcxCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodBetween(String value1, String value2) {
            addCriterion("TI_WCX_COD between", value1, value2, "tiWcxCod");
            return (Criteria) this;
        }

        public Criteria andTiWcxCodNotBetween(String value1, String value2) {
            addCriterion("TI_WCX_COD not between", value1, value2, "tiWcxCod");
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

        public Criteria andTiTrmOtherIsNull() {
            addCriterion("TI_TRM_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherIsNotNull() {
            addCriterion("TI_TRM_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherEqualTo(String value) {
            addCriterion("TI_TRM_OTHER =", value, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherNotEqualTo(String value) {
            addCriterion("TI_TRM_OTHER <>", value, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherGreaterThan(String value) {
            addCriterion("TI_TRM_OTHER >", value, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherGreaterThanOrEqualTo(String value) {
            addCriterion("TI_TRM_OTHER >=", value, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherLessThan(String value) {
            addCriterion("TI_TRM_OTHER <", value, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherLessThanOrEqualTo(String value) {
            addCriterion("TI_TRM_OTHER <=", value, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherLike(String value) {
            addCriterion("TI_TRM_OTHER like", value, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherNotLike(String value) {
            addCriterion("TI_TRM_OTHER not like", value, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherIn(List<String> values) {
            addCriterion("TI_TRM_OTHER in", values, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherNotIn(List<String> values) {
            addCriterion("TI_TRM_OTHER not in", values, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherBetween(String value1, String value2) {
            addCriterion("TI_TRM_OTHER between", value1, value2, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiTrmOtherNotBetween(String value1, String value2) {
            addCriterion("TI_TRM_OTHER not between", value1, value2, "tiTrmOther");
            return (Criteria) this;
        }

        public Criteria andTiScoIsNull() {
            addCriterion("TI_SCO is null");
            return (Criteria) this;
        }

        public Criteria andTiScoIsNotNull() {
            addCriterion("TI_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andTiScoEqualTo(String value) {
            addCriterion("TI_SCO =", value, "tiSco");
            return (Criteria) this;
        }

        public Criteria andTiScoNotEqualTo(String value) {
            addCriterion("TI_SCO <>", value, "tiSco");
            return (Criteria) this;
        }

        public Criteria andTiScoGreaterThan(String value) {
            addCriterion("TI_SCO >", value, "tiSco");
            return (Criteria) this;
        }

        public Criteria andTiScoGreaterThanOrEqualTo(String value) {
            addCriterion("TI_SCO >=", value, "tiSco");
            return (Criteria) this;
        }

        public Criteria andTiScoLessThan(String value) {
            addCriterion("TI_SCO <", value, "tiSco");
            return (Criteria) this;
        }

        public Criteria andTiScoLessThanOrEqualTo(String value) {
            addCriterion("TI_SCO <=", value, "tiSco");
            return (Criteria) this;
        }

        public Criteria andTiScoLike(String value) {
            addCriterion("TI_SCO like", value, "tiSco");
            return (Criteria) this;
        }

        public Criteria andTiScoNotLike(String value) {
            addCriterion("TI_SCO not like", value, "tiSco");
            return (Criteria) this;
        }

        public Criteria andTiScoIn(List<String> values) {
            addCriterion("TI_SCO in", values, "tiSco");
            return (Criteria) this;
        }

        public Criteria andTiScoNotIn(List<String> values) {
            addCriterion("TI_SCO not in", values, "tiSco");
            return (Criteria) this;
        }

        public Criteria andTiScoBetween(String value1, String value2) {
            addCriterion("TI_SCO between", value1, value2, "tiSco");
            return (Criteria) this;
        }

        public Criteria andTiScoNotBetween(String value1, String value2) {
            addCriterion("TI_SCO not between", value1, value2, "tiSco");
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