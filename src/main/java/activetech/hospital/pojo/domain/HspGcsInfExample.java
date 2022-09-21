package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HspGcsInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspGcsInfExample() {
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

        public Criteria andEyeRctCodIsNull() {
            addCriterion("EYE_RCT_COD is null");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodIsNotNull() {
            addCriterion("EYE_RCT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodEqualTo(String value) {
            addCriterion("EYE_RCT_COD =", value, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodNotEqualTo(String value) {
            addCriterion("EYE_RCT_COD <>", value, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodGreaterThan(String value) {
            addCriterion("EYE_RCT_COD >", value, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodGreaterThanOrEqualTo(String value) {
            addCriterion("EYE_RCT_COD >=", value, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodLessThan(String value) {
            addCriterion("EYE_RCT_COD <", value, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodLessThanOrEqualTo(String value) {
            addCriterion("EYE_RCT_COD <=", value, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodLike(String value) {
            addCriterion("EYE_RCT_COD like", value, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodNotLike(String value) {
            addCriterion("EYE_RCT_COD not like", value, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodIn(List<String> values) {
            addCriterion("EYE_RCT_COD in", values, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodNotIn(List<String> values) {
            addCriterion("EYE_RCT_COD not in", values, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodBetween(String value1, String value2) {
            addCriterion("EYE_RCT_COD between", value1, value2, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andEyeRctCodNotBetween(String value1, String value2) {
            addCriterion("EYE_RCT_COD not between", value1, value2, "eyeRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodIsNull() {
            addCriterion("LAN_RCT_COD is null");
            return (Criteria) this;
        }

        public Criteria andLanRctCodIsNotNull() {
            addCriterion("LAN_RCT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andLanRctCodEqualTo(String value) {
            addCriterion("LAN_RCT_COD =", value, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodNotEqualTo(String value) {
            addCriterion("LAN_RCT_COD <>", value, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodGreaterThan(String value) {
            addCriterion("LAN_RCT_COD >", value, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodGreaterThanOrEqualTo(String value) {
            addCriterion("LAN_RCT_COD >=", value, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodLessThan(String value) {
            addCriterion("LAN_RCT_COD <", value, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodLessThanOrEqualTo(String value) {
            addCriterion("LAN_RCT_COD <=", value, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodLike(String value) {
            addCriterion("LAN_RCT_COD like", value, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodNotLike(String value) {
            addCriterion("LAN_RCT_COD not like", value, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodIn(List<String> values) {
            addCriterion("LAN_RCT_COD in", values, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodNotIn(List<String> values) {
            addCriterion("LAN_RCT_COD not in", values, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodBetween(String value1, String value2) {
            addCriterion("LAN_RCT_COD between", value1, value2, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andLanRctCodNotBetween(String value1, String value2) {
            addCriterion("LAN_RCT_COD not between", value1, value2, "lanRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodIsNull() {
            addCriterion("ACT_RCT_COD is null");
            return (Criteria) this;
        }

        public Criteria andActRctCodIsNotNull() {
            addCriterion("ACT_RCT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andActRctCodEqualTo(String value) {
            addCriterion("ACT_RCT_COD =", value, "actRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodNotEqualTo(String value) {
            addCriterion("ACT_RCT_COD <>", value, "actRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodGreaterThan(String value) {
            addCriterion("ACT_RCT_COD >", value, "actRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_RCT_COD >=", value, "actRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodLessThan(String value) {
            addCriterion("ACT_RCT_COD <", value, "actRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodLessThanOrEqualTo(String value) {
            addCriterion("ACT_RCT_COD <=", value, "actRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodLike(String value) {
            addCriterion("ACT_RCT_COD like", value, "actRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodNotLike(String value) {
            addCriterion("ACT_RCT_COD not like", value, "actRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodIn(List<String> values) {
            addCriterion("ACT_RCT_COD in", values, "actRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodNotIn(List<String> values) {
            addCriterion("ACT_RCT_COD not in", values, "actRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodBetween(String value1, String value2) {
            addCriterion("ACT_RCT_COD between", value1, value2, "actRctCod");
            return (Criteria) this;
        }

        public Criteria andActRctCodNotBetween(String value1, String value2) {
            addCriterion("ACT_RCT_COD not between", value1, value2, "actRctCod");
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