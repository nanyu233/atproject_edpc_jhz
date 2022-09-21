package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspSshzjjInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspSshzjjInfExample() {
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

        public Criteria andSshzjjSeqIsNull() {
            addCriterion("SSHZJJ_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqIsNotNull() {
            addCriterion("SSHZJJ_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqEqualTo(String value) {
            addCriterion("SSHZJJ_SEQ =", value, "sshzjjSeq");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqNotEqualTo(String value) {
            addCriterion("SSHZJJ_SEQ <>", value, "sshzjjSeq");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqGreaterThan(String value) {
            addCriterion("SSHZJJ_SEQ >", value, "sshzjjSeq");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqGreaterThanOrEqualTo(String value) {
            addCriterion("SSHZJJ_SEQ >=", value, "sshzjjSeq");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqLessThan(String value) {
            addCriterion("SSHZJJ_SEQ <", value, "sshzjjSeq");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqLessThanOrEqualTo(String value) {
            addCriterion("SSHZJJ_SEQ <=", value, "sshzjjSeq");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqLike(String value) {
            addCriterion("SSHZJJ_SEQ like", value, "sshzjjSeq");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqNotLike(String value) {
            addCriterion("SSHZJJ_SEQ not like", value, "sshzjjSeq");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqIn(List<String> values) {
            addCriterion("SSHZJJ_SEQ in", values, "sshzjjSeq");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqNotIn(List<String> values) {
            addCriterion("SSHZJJ_SEQ not in", values, "sshzjjSeq");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqBetween(String value1, String value2) {
            addCriterion("SSHZJJ_SEQ between", value1, value2, "sshzjjSeq");
            return (Criteria) this;
        }

        public Criteria andSshzjjSeqNotBetween(String value1, String value2) {
            addCriterion("SSHZJJ_SEQ not between", value1, value2, "sshzjjSeq");
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

        public Criteria andIsltCodIsNull() {
            addCriterion("ISLT_COD is null");
            return (Criteria) this;
        }

        public Criteria andIsltCodIsNotNull() {
            addCriterion("ISLT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andIsltCodEqualTo(String value) {
            addCriterion("ISLT_COD =", value, "isltCod");
            return (Criteria) this;
        }

        public Criteria andIsltCodNotEqualTo(String value) {
            addCriterion("ISLT_COD <>", value, "isltCod");
            return (Criteria) this;
        }

        public Criteria andIsltCodGreaterThan(String value) {
            addCriterion("ISLT_COD >", value, "isltCod");
            return (Criteria) this;
        }

        public Criteria andIsltCodGreaterThanOrEqualTo(String value) {
            addCriterion("ISLT_COD >=", value, "isltCod");
            return (Criteria) this;
        }

        public Criteria andIsltCodLessThan(String value) {
            addCriterion("ISLT_COD <", value, "isltCod");
            return (Criteria) this;
        }

        public Criteria andIsltCodLessThanOrEqualTo(String value) {
            addCriterion("ISLT_COD <=", value, "isltCod");
            return (Criteria) this;
        }

        public Criteria andIsltCodLike(String value) {
            addCriterion("ISLT_COD like", value, "isltCod");
            return (Criteria) this;
        }

        public Criteria andIsltCodNotLike(String value) {
            addCriterion("ISLT_COD not like", value, "isltCod");
            return (Criteria) this;
        }

        public Criteria andIsltCodIn(List<String> values) {
            addCriterion("ISLT_COD in", values, "isltCod");
            return (Criteria) this;
        }

        public Criteria andIsltCodNotIn(List<String> values) {
            addCriterion("ISLT_COD not in", values, "isltCod");
            return (Criteria) this;
        }

        public Criteria andIsltCodBetween(String value1, String value2) {
            addCriterion("ISLT_COD between", value1, value2, "isltCod");
            return (Criteria) this;
        }

        public Criteria andIsltCodNotBetween(String value1, String value2) {
            addCriterion("ISLT_COD not between", value1, value2, "isltCod");
            return (Criteria) this;
        }

        public Criteria andOprtNamIsNull() {
            addCriterion("OPRT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andOprtNamIsNotNull() {
            addCriterion("OPRT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andOprtNamEqualTo(String value) {
            addCriterion("OPRT_NAM =", value, "oprtNam");
            return (Criteria) this;
        }

        public Criteria andOprtNamNotEqualTo(String value) {
            addCriterion("OPRT_NAM <>", value, "oprtNam");
            return (Criteria) this;
        }

        public Criteria andOprtNamGreaterThan(String value) {
            addCriterion("OPRT_NAM >", value, "oprtNam");
            return (Criteria) this;
        }

        public Criteria andOprtNamGreaterThanOrEqualTo(String value) {
            addCriterion("OPRT_NAM >=", value, "oprtNam");
            return (Criteria) this;
        }

        public Criteria andOprtNamLessThan(String value) {
            addCriterion("OPRT_NAM <", value, "oprtNam");
            return (Criteria) this;
        }

        public Criteria andOprtNamLessThanOrEqualTo(String value) {
            addCriterion("OPRT_NAM <=", value, "oprtNam");
            return (Criteria) this;
        }

        public Criteria andOprtNamLike(String value) {
            addCriterion("OPRT_NAM like", value, "oprtNam");
            return (Criteria) this;
        }

        public Criteria andOprtNamNotLike(String value) {
            addCriterion("OPRT_NAM not like", value, "oprtNam");
            return (Criteria) this;
        }

        public Criteria andOprtNamIn(List<String> values) {
            addCriterion("OPRT_NAM in", values, "oprtNam");
            return (Criteria) this;
        }

        public Criteria andOprtNamNotIn(List<String> values) {
            addCriterion("OPRT_NAM not in", values, "oprtNam");
            return (Criteria) this;
        }

        public Criteria andOprtNamBetween(String value1, String value2) {
            addCriterion("OPRT_NAM between", value1, value2, "oprtNam");
            return (Criteria) this;
        }

        public Criteria andOprtNamNotBetween(String value1, String value2) {
            addCriterion("OPRT_NAM not between", value1, value2, "oprtNam");
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

        public Criteria andHzsfSqCodIsNull() {
            addCriterion("HZSF_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodIsNotNull() {
            addCriterion("HZSF_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodEqualTo(String value) {
            addCriterion("HZSF_SQ_COD =", value, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodNotEqualTo(String value) {
            addCriterion("HZSF_SQ_COD <>", value, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodGreaterThan(String value) {
            addCriterion("HZSF_SQ_COD >", value, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("HZSF_SQ_COD >=", value, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodLessThan(String value) {
            addCriterion("HZSF_SQ_COD <", value, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodLessThanOrEqualTo(String value) {
            addCriterion("HZSF_SQ_COD <=", value, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodLike(String value) {
            addCriterion("HZSF_SQ_COD like", value, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodNotLike(String value) {
            addCriterion("HZSF_SQ_COD not like", value, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodIn(List<String> values) {
            addCriterion("HZSF_SQ_COD in", values, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodNotIn(List<String> values) {
            addCriterion("HZSF_SQ_COD not in", values, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodBetween(String value1, String value2) {
            addCriterion("HZSF_SQ_COD between", value1, value2, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andHzsfSqCodNotBetween(String value1, String value2) {
            addCriterion("HZSF_SQ_COD not between", value1, value2, "hzsfSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodIsNull() {
            addCriterion("GMS_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodIsNotNull() {
            addCriterion("GMS_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodEqualTo(String value) {
            addCriterion("GMS_SQ_COD =", value, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodNotEqualTo(String value) {
            addCriterion("GMS_SQ_COD <>", value, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodGreaterThan(String value) {
            addCriterion("GMS_SQ_COD >", value, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("GMS_SQ_COD >=", value, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodLessThan(String value) {
            addCriterion("GMS_SQ_COD <", value, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodLessThanOrEqualTo(String value) {
            addCriterion("GMS_SQ_COD <=", value, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodLike(String value) {
            addCriterion("GMS_SQ_COD like", value, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodNotLike(String value) {
            addCriterion("GMS_SQ_COD not like", value, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodIn(List<String> values) {
            addCriterion("GMS_SQ_COD in", values, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodNotIn(List<String> values) {
            addCriterion("GMS_SQ_COD not in", values, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodBetween(String value1, String value2) {
            addCriterion("GMS_SQ_COD between", value1, value2, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andGmsSqCodNotBetween(String value1, String value2) {
            addCriterion("GMS_SQ_COD not between", value1, value2, "gmsSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodIsNull() {
            addCriterion("BX_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andBxSqCodIsNotNull() {
            addCriterion("BX_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBxSqCodEqualTo(String value) {
            addCriterion("BX_SQ_COD =", value, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodNotEqualTo(String value) {
            addCriterion("BX_SQ_COD <>", value, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodGreaterThan(String value) {
            addCriterion("BX_SQ_COD >", value, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("BX_SQ_COD >=", value, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodLessThan(String value) {
            addCriterion("BX_SQ_COD <", value, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodLessThanOrEqualTo(String value) {
            addCriterion("BX_SQ_COD <=", value, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodLike(String value) {
            addCriterion("BX_SQ_COD like", value, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodNotLike(String value) {
            addCriterion("BX_SQ_COD not like", value, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodIn(List<String> values) {
            addCriterion("BX_SQ_COD in", values, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodNotIn(List<String> values) {
            addCriterion("BX_SQ_COD not in", values, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodBetween(String value1, String value2) {
            addCriterion("BX_SQ_COD between", value1, value2, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBxSqCodNotBetween(String value1, String value2) {
            addCriterion("BX_SQ_COD not between", value1, value2, "bxSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodIsNull() {
            addCriterion("BP_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andBpSqCodIsNotNull() {
            addCriterion("BP_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBpSqCodEqualTo(String value) {
            addCriterion("BP_SQ_COD =", value, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodNotEqualTo(String value) {
            addCriterion("BP_SQ_COD <>", value, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodGreaterThan(String value) {
            addCriterion("BP_SQ_COD >", value, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("BP_SQ_COD >=", value, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodLessThan(String value) {
            addCriterion("BP_SQ_COD <", value, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodLessThanOrEqualTo(String value) {
            addCriterion("BP_SQ_COD <=", value, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodLike(String value) {
            addCriterion("BP_SQ_COD like", value, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodNotLike(String value) {
            addCriterion("BP_SQ_COD not like", value, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodIn(List<String> values) {
            addCriterion("BP_SQ_COD in", values, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodNotIn(List<String> values) {
            addCriterion("BP_SQ_COD not in", values, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodBetween(String value1, String value2) {
            addCriterion("BP_SQ_COD between", value1, value2, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andBpSqCodNotBetween(String value1, String value2) {
            addCriterion("BP_SQ_COD not between", value1, value2, "bpSqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodIsNull() {
            addCriterion("OPRTYY_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodIsNotNull() {
            addCriterion("OPRTYY_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodEqualTo(String value) {
            addCriterion("OPRTYY_SQ_COD =", value, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodNotEqualTo(String value) {
            addCriterion("OPRTYY_SQ_COD <>", value, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodGreaterThan(String value) {
            addCriterion("OPRTYY_SQ_COD >", value, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodGreaterThanOrEqualTo(String value) {
            addCriterion("OPRTYY_SQ_COD >=", value, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodLessThan(String value) {
            addCriterion("OPRTYY_SQ_COD <", value, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodLessThanOrEqualTo(String value) {
            addCriterion("OPRTYY_SQ_COD <=", value, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodLike(String value) {
            addCriterion("OPRTYY_SQ_COD like", value, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodNotLike(String value) {
            addCriterion("OPRTYY_SQ_COD not like", value, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodIn(List<String> values) {
            addCriterion("OPRTYY_SQ_COD in", values, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodNotIn(List<String> values) {
            addCriterion("OPRTYY_SQ_COD not in", values, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodBetween(String value1, String value2) {
            addCriterion("OPRTYY_SQ_COD between", value1, value2, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andOprtyySqCodNotBetween(String value1, String value2) {
            addCriterion("OPRTYY_SQ_COD not between", value1, value2, "oprtyySqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodIsNull() {
            addCriterion("PFWZX_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodIsNotNull() {
            addCriterion("PFWZX_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodEqualTo(String value) {
            addCriterion("PFWZX_SQ_COD =", value, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodNotEqualTo(String value) {
            addCriterion("PFWZX_SQ_COD <>", value, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodGreaterThan(String value) {
            addCriterion("PFWZX_SQ_COD >", value, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("PFWZX_SQ_COD >=", value, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodLessThan(String value) {
            addCriterion("PFWZX_SQ_COD <", value, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodLessThanOrEqualTo(String value) {
            addCriterion("PFWZX_SQ_COD <=", value, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodLike(String value) {
            addCriterion("PFWZX_SQ_COD like", value, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodNotLike(String value) {
            addCriterion("PFWZX_SQ_COD not like", value, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodIn(List<String> values) {
            addCriterion("PFWZX_SQ_COD in", values, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodNotIn(List<String> values) {
            addCriterion("PFWZX_SQ_COD not in", values, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodBetween(String value1, String value2) {
            addCriterion("PFWZX_SQ_COD between", value1, value2, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andPfwzxSqCodNotBetween(String value1, String value2) {
            addCriterion("PFWZX_SQ_COD not between", value1, value2, "pfwzxSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodIsNull() {
            addCriterion("GD_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andGdSqCodIsNotNull() {
            addCriterion("GD_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGdSqCodEqualTo(String value) {
            addCriterion("GD_SQ_COD =", value, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodNotEqualTo(String value) {
            addCriterion("GD_SQ_COD <>", value, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodGreaterThan(String value) {
            addCriterion("GD_SQ_COD >", value, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("GD_SQ_COD >=", value, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodLessThan(String value) {
            addCriterion("GD_SQ_COD <", value, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodLessThanOrEqualTo(String value) {
            addCriterion("GD_SQ_COD <=", value, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodLike(String value) {
            addCriterion("GD_SQ_COD like", value, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodNotLike(String value) {
            addCriterion("GD_SQ_COD not like", value, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodIn(List<String> values) {
            addCriterion("GD_SQ_COD in", values, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodNotIn(List<String> values) {
            addCriterion("GD_SQ_COD not in", values, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodBetween(String value1, String value2) {
            addCriterion("GD_SQ_COD between", value1, value2, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andGdSqCodNotBetween(String value1, String value2) {
            addCriterion("GD_SQ_COD not between", value1, value2, "gdSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodIsNull() {
            addCriterion("JS_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andJsSqCodIsNotNull() {
            addCriterion("JS_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJsSqCodEqualTo(String value) {
            addCriterion("JS_SQ_COD =", value, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodNotEqualTo(String value) {
            addCriterion("JS_SQ_COD <>", value, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodGreaterThan(String value) {
            addCriterion("JS_SQ_COD >", value, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("JS_SQ_COD >=", value, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodLessThan(String value) {
            addCriterion("JS_SQ_COD <", value, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodLessThanOrEqualTo(String value) {
            addCriterion("JS_SQ_COD <=", value, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodLike(String value) {
            addCriterion("JS_SQ_COD like", value, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodNotLike(String value) {
            addCriterion("JS_SQ_COD not like", value, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodIn(List<String> values) {
            addCriterion("JS_SQ_COD in", values, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodNotIn(List<String> values) {
            addCriterion("JS_SQ_COD not in", values, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodBetween(String value1, String value2) {
            addCriterion("JS_SQ_COD between", value1, value2, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andJsSqCodNotBetween(String value1, String value2) {
            addCriterion("JS_SQ_COD not between", value1, value2, "jsSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodIsNull() {
            addCriterion("PKPG_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodIsNotNull() {
            addCriterion("PKPG_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodEqualTo(String value) {
            addCriterion("PKPG_SQ_COD =", value, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodNotEqualTo(String value) {
            addCriterion("PKPG_SQ_COD <>", value, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodGreaterThan(String value) {
            addCriterion("PKPG_SQ_COD >", value, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("PKPG_SQ_COD >=", value, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodLessThan(String value) {
            addCriterion("PKPG_SQ_COD <", value, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodLessThanOrEqualTo(String value) {
            addCriterion("PKPG_SQ_COD <=", value, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodLike(String value) {
            addCriterion("PKPG_SQ_COD like", value, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodNotLike(String value) {
            addCriterion("PKPG_SQ_COD not like", value, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodIn(List<String> values) {
            addCriterion("PKPG_SQ_COD in", values, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodNotIn(List<String> values) {
            addCriterion("PKPG_SQ_COD not in", values, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodBetween(String value1, String value2) {
            addCriterion("PKPG_SQ_COD between", value1, value2, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andPkpgSqCodNotBetween(String value1, String value2) {
            addCriterion("PKPG_SQ_COD not between", value1, value2, "pkpgSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodIsNull() {
            addCriterion("BL_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andBlSqCodIsNotNull() {
            addCriterion("BL_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBlSqCodEqualTo(String value) {
            addCriterion("BL_SQ_COD =", value, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodNotEqualTo(String value) {
            addCriterion("BL_SQ_COD <>", value, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodGreaterThan(String value) {
            addCriterion("BL_SQ_COD >", value, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("BL_SQ_COD >=", value, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodLessThan(String value) {
            addCriterion("BL_SQ_COD <", value, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodLessThanOrEqualTo(String value) {
            addCriterion("BL_SQ_COD <=", value, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodLike(String value) {
            addCriterion("BL_SQ_COD like", value, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodNotLike(String value) {
            addCriterion("BL_SQ_COD not like", value, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodIn(List<String> values) {
            addCriterion("BL_SQ_COD in", values, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodNotIn(List<String> values) {
            addCriterion("BL_SQ_COD not in", values, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodBetween(String value1, String value2) {
            addCriterion("BL_SQ_COD between", value1, value2, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andBlSqCodNotBetween(String value1, String value2) {
            addCriterion("BL_SQ_COD not between", value1, value2, "blSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodIsNull() {
            addCriterion("ZQTYS_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodIsNotNull() {
            addCriterion("ZQTYS_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodEqualTo(String value) {
            addCriterion("ZQTYS_SQ_COD =", value, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodNotEqualTo(String value) {
            addCriterion("ZQTYS_SQ_COD <>", value, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodGreaterThan(String value) {
            addCriterion("ZQTYS_SQ_COD >", value, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("ZQTYS_SQ_COD >=", value, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodLessThan(String value) {
            addCriterion("ZQTYS_SQ_COD <", value, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodLessThanOrEqualTo(String value) {
            addCriterion("ZQTYS_SQ_COD <=", value, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodLike(String value) {
            addCriterion("ZQTYS_SQ_COD like", value, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodNotLike(String value) {
            addCriterion("ZQTYS_SQ_COD not like", value, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodIn(List<String> values) {
            addCriterion("ZQTYS_SQ_COD in", values, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodNotIn(List<String> values) {
            addCriterion("ZQTYS_SQ_COD not in", values, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodBetween(String value1, String value2) {
            addCriterion("ZQTYS_SQ_COD between", value1, value2, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andZqtysSqCodNotBetween(String value1, String value2) {
            addCriterion("ZQTYS_SQ_COD not between", value1, value2, "zqtysSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodIsNull() {
            addCriterion("SSBWBJ_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodIsNotNull() {
            addCriterion("SSBWBJ_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodEqualTo(String value) {
            addCriterion("SSBWBJ_SQ_COD =", value, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodNotEqualTo(String value) {
            addCriterion("SSBWBJ_SQ_COD <>", value, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodGreaterThan(String value) {
            addCriterion("SSBWBJ_SQ_COD >", value, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("SSBWBJ_SQ_COD >=", value, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodLessThan(String value) {
            addCriterion("SSBWBJ_SQ_COD <", value, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodLessThanOrEqualTo(String value) {
            addCriterion("SSBWBJ_SQ_COD <=", value, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodLike(String value) {
            addCriterion("SSBWBJ_SQ_COD like", value, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodNotLike(String value) {
            addCriterion("SSBWBJ_SQ_COD not like", value, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodIn(List<String> values) {
            addCriterion("SSBWBJ_SQ_COD in", values, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodNotIn(List<String> values) {
            addCriterion("SSBWBJ_SQ_COD not in", values, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodBetween(String value1, String value2) {
            addCriterion("SSBWBJ_SQ_COD between", value1, value2, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andSsbwbjSqCodNotBetween(String value1, String value2) {
            addCriterion("SSBWBJ_SQ_COD not between", value1, value2, "ssbwbjSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodIsNull() {
            addCriterion("XDWP_SQ_COD is null");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodIsNotNull() {
            addCriterion("XDWP_SQ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodEqualTo(String value) {
            addCriterion("XDWP_SQ_COD =", value, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodNotEqualTo(String value) {
            addCriterion("XDWP_SQ_COD <>", value, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodGreaterThan(String value) {
            addCriterion("XDWP_SQ_COD >", value, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodGreaterThanOrEqualTo(String value) {
            addCriterion("XDWP_SQ_COD >=", value, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodLessThan(String value) {
            addCriterion("XDWP_SQ_COD <", value, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodLessThanOrEqualTo(String value) {
            addCriterion("XDWP_SQ_COD <=", value, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodLike(String value) {
            addCriterion("XDWP_SQ_COD like", value, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodNotLike(String value) {
            addCriterion("XDWP_SQ_COD not like", value, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodIn(List<String> values) {
            addCriterion("XDWP_SQ_COD in", values, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodNotIn(List<String> values) {
            addCriterion("XDWP_SQ_COD not in", values, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodBetween(String value1, String value2) {
            addCriterion("XDWP_SQ_COD between", value1, value2, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andXdwpSqCodNotBetween(String value1, String value2) {
            addCriterion("XDWP_SQ_COD not between", value1, value2, "xdwpSqCod");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwIsNull() {
            addCriterion("SMTZ_SQ_TW is null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwIsNotNull() {
            addCriterion("SMTZ_SQ_TW is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwEqualTo(BigDecimal value) {
            addCriterion("SMTZ_SQ_TW =", value, "smtzSqTw");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwNotEqualTo(BigDecimal value) {
            addCriterion("SMTZ_SQ_TW <>", value, "smtzSqTw");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwGreaterThan(BigDecimal value) {
            addCriterion("SMTZ_SQ_TW >", value, "smtzSqTw");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SMTZ_SQ_TW >=", value, "smtzSqTw");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwLessThan(BigDecimal value) {
            addCriterion("SMTZ_SQ_TW <", value, "smtzSqTw");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SMTZ_SQ_TW <=", value, "smtzSqTw");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwIn(List<BigDecimal> values) {
            addCriterion("SMTZ_SQ_TW in", values, "smtzSqTw");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwNotIn(List<BigDecimal> values) {
            addCriterion("SMTZ_SQ_TW not in", values, "smtzSqTw");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMTZ_SQ_TW between", value1, value2, "smtzSqTw");
            return (Criteria) this;
        }

        public Criteria andSmtzSqTwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMTZ_SQ_TW not between", value1, value2, "smtzSqTw");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrIsNull() {
            addCriterion("SMTZ_SQ_HR is null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrIsNotNull() {
            addCriterion("SMTZ_SQ_HR is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrEqualTo(Short value) {
            addCriterion("SMTZ_SQ_HR =", value, "smtzSqHr");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrNotEqualTo(Short value) {
            addCriterion("SMTZ_SQ_HR <>", value, "smtzSqHr");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrGreaterThan(Short value) {
            addCriterion("SMTZ_SQ_HR >", value, "smtzSqHr");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SQ_HR >=", value, "smtzSqHr");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrLessThan(Short value) {
            addCriterion("SMTZ_SQ_HR <", value, "smtzSqHr");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SQ_HR <=", value, "smtzSqHr");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrIn(List<Short> values) {
            addCriterion("SMTZ_SQ_HR in", values, "smtzSqHr");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrNotIn(List<Short> values) {
            addCriterion("SMTZ_SQ_HR not in", values, "smtzSqHr");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrBetween(Short value1, Short value2) {
            addCriterion("SMTZ_SQ_HR between", value1, value2, "smtzSqHr");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHrNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_SQ_HR not between", value1, value2, "smtzSqHr");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxIsNull() {
            addCriterion("SMTZ_SQ_HX is null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxIsNotNull() {
            addCriterion("SMTZ_SQ_HX is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxEqualTo(Short value) {
            addCriterion("SMTZ_SQ_HX =", value, "smtzSqHx");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxNotEqualTo(Short value) {
            addCriterion("SMTZ_SQ_HX <>", value, "smtzSqHx");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxGreaterThan(Short value) {
            addCriterion("SMTZ_SQ_HX >", value, "smtzSqHx");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SQ_HX >=", value, "smtzSqHx");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxLessThan(Short value) {
            addCriterion("SMTZ_SQ_HX <", value, "smtzSqHx");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SQ_HX <=", value, "smtzSqHx");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxIn(List<Short> values) {
            addCriterion("SMTZ_SQ_HX in", values, "smtzSqHx");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxNotIn(List<Short> values) {
            addCriterion("SMTZ_SQ_HX not in", values, "smtzSqHx");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxBetween(Short value1, Short value2) {
            addCriterion("SMTZ_SQ_HX between", value1, value2, "smtzSqHx");
            return (Criteria) this;
        }

        public Criteria andSmtzSqHxNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_SQ_HX not between", value1, value2, "smtzSqHx");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupIsNull() {
            addCriterion("SMTZ_SQ_BPUP is null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupIsNotNull() {
            addCriterion("SMTZ_SQ_BPUP is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupEqualTo(Short value) {
            addCriterion("SMTZ_SQ_BPUP =", value, "smtzSqBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupNotEqualTo(Short value) {
            addCriterion("SMTZ_SQ_BPUP <>", value, "smtzSqBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupGreaterThan(Short value) {
            addCriterion("SMTZ_SQ_BPUP >", value, "smtzSqBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SQ_BPUP >=", value, "smtzSqBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupLessThan(Short value) {
            addCriterion("SMTZ_SQ_BPUP <", value, "smtzSqBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SQ_BPUP <=", value, "smtzSqBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupIn(List<Short> values) {
            addCriterion("SMTZ_SQ_BPUP in", values, "smtzSqBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupNotIn(List<Short> values) {
            addCriterion("SMTZ_SQ_BPUP not in", values, "smtzSqBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupBetween(Short value1, Short value2) {
            addCriterion("SMTZ_SQ_BPUP between", value1, value2, "smtzSqBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpupNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_SQ_BPUP not between", value1, value2, "smtzSqBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownIsNull() {
            addCriterion("SMTZ_SQ_BPDOWN is null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownIsNotNull() {
            addCriterion("SMTZ_SQ_BPDOWN is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownEqualTo(Short value) {
            addCriterion("SMTZ_SQ_BPDOWN =", value, "smtzSqBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownNotEqualTo(Short value) {
            addCriterion("SMTZ_SQ_BPDOWN <>", value, "smtzSqBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownGreaterThan(Short value) {
            addCriterion("SMTZ_SQ_BPDOWN >", value, "smtzSqBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SQ_BPDOWN >=", value, "smtzSqBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownLessThan(Short value) {
            addCriterion("SMTZ_SQ_BPDOWN <", value, "smtzSqBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SQ_BPDOWN <=", value, "smtzSqBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownIn(List<Short> values) {
            addCriterion("SMTZ_SQ_BPDOWN in", values, "smtzSqBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownNotIn(List<Short> values) {
            addCriterion("SMTZ_SQ_BPDOWN not in", values, "smtzSqBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownBetween(Short value1, Short value2) {
            addCriterion("SMTZ_SQ_BPDOWN between", value1, value2, "smtzSqBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzSqBpdownNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_SQ_BPDOWN not between", value1, value2, "smtzSqBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2IsNull() {
            addCriterion("SMTZ_SQ_SPO2 is null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2IsNotNull() {
            addCriterion("SMTZ_SQ_SPO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2EqualTo(Short value) {
            addCriterion("SMTZ_SQ_SPO2 =", value, "smtzSqSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2NotEqualTo(Short value) {
            addCriterion("SMTZ_SQ_SPO2 <>", value, "smtzSqSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2GreaterThan(Short value) {
            addCriterion("SMTZ_SQ_SPO2 >", value, "smtzSqSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2GreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SQ_SPO2 >=", value, "smtzSqSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2LessThan(Short value) {
            addCriterion("SMTZ_SQ_SPO2 <", value, "smtzSqSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2LessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_SQ_SPO2 <=", value, "smtzSqSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2In(List<Short> values) {
            addCriterion("SMTZ_SQ_SPO2 in", values, "smtzSqSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2NotIn(List<Short> values) {
            addCriterion("SMTZ_SQ_SPO2 not in", values, "smtzSqSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2Between(Short value1, Short value2) {
            addCriterion("SMTZ_SQ_SPO2 between", value1, value2, "smtzSqSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSqSpo2NotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_SQ_SPO2 not between", value1, value2, "smtzSqSpo2");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsIsNull() {
            addCriterion("SMTZ_SQ_YS is null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsIsNotNull() {
            addCriterion("SMTZ_SQ_YS is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsEqualTo(String value) {
            addCriterion("SMTZ_SQ_YS =", value, "smtzSqYs");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsNotEqualTo(String value) {
            addCriterion("SMTZ_SQ_YS <>", value, "smtzSqYs");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsGreaterThan(String value) {
            addCriterion("SMTZ_SQ_YS >", value, "smtzSqYs");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsGreaterThanOrEqualTo(String value) {
            addCriterion("SMTZ_SQ_YS >=", value, "smtzSqYs");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsLessThan(String value) {
            addCriterion("SMTZ_SQ_YS <", value, "smtzSqYs");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsLessThanOrEqualTo(String value) {
            addCriterion("SMTZ_SQ_YS <=", value, "smtzSqYs");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsLike(String value) {
            addCriterion("SMTZ_SQ_YS like", value, "smtzSqYs");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsNotLike(String value) {
            addCriterion("SMTZ_SQ_YS not like", value, "smtzSqYs");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsIn(List<String> values) {
            addCriterion("SMTZ_SQ_YS in", values, "smtzSqYs");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsNotIn(List<String> values) {
            addCriterion("SMTZ_SQ_YS not in", values, "smtzSqYs");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsBetween(String value1, String value2) {
            addCriterion("SMTZ_SQ_YS between", value1, value2, "smtzSqYs");
            return (Criteria) this;
        }

        public Criteria andSmtzSqYsNotBetween(String value1, String value2) {
            addCriterion("SMTZ_SQ_YS not between", value1, value2, "smtzSqYs");
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

        public Criteria andSshzjjDatIsNull() {
            addCriterion("SSHZJJ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andSshzjjDatIsNotNull() {
            addCriterion("SSHZJJ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andSshzjjDatEqualTo(Date value) {
            addCriterion("SSHZJJ_DAT =", value, "sshzjjDat");
            return (Criteria) this;
        }

        public Criteria andSshzjjDatNotEqualTo(Date value) {
            addCriterion("SSHZJJ_DAT <>", value, "sshzjjDat");
            return (Criteria) this;
        }

        public Criteria andSshzjjDatGreaterThan(Date value) {
            addCriterion("SSHZJJ_DAT >", value, "sshzjjDat");
            return (Criteria) this;
        }

        public Criteria andSshzjjDatGreaterThanOrEqualTo(Date value) {
            addCriterion("SSHZJJ_DAT >=", value, "sshzjjDat");
            return (Criteria) this;
        }

        public Criteria andSshzjjDatLessThan(Date value) {
            addCriterion("SSHZJJ_DAT <", value, "sshzjjDat");
            return (Criteria) this;
        }

        public Criteria andSshzjjDatLessThanOrEqualTo(Date value) {
            addCriterion("SSHZJJ_DAT <=", value, "sshzjjDat");
            return (Criteria) this;
        }

        public Criteria andSshzjjDatIn(List<Date> values) {
            addCriterion("SSHZJJ_DAT in", values, "sshzjjDat");
            return (Criteria) this;
        }

        public Criteria andSshzjjDatNotIn(List<Date> values) {
            addCriterion("SSHZJJ_DAT not in", values, "sshzjjDat");
            return (Criteria) this;
        }

        public Criteria andSshzjjDatBetween(Date value1, Date value2) {
            addCriterion("SSHZJJ_DAT between", value1, value2, "sshzjjDat");
            return (Criteria) this;
        }

        public Criteria andSshzjjDatNotBetween(Date value1, Date value2) {
            addCriterion("SSHZJJ_DAT not between", value1, value2, "sshzjjDat");
            return (Criteria) this;
        }

        public Criteria andSqbqDatIsNull() {
            addCriterion("SQBQ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andSqbqDatIsNotNull() {
            addCriterion("SQBQ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andSqbqDatEqualTo(Date value) {
            addCriterion("SQBQ_DAT =", value, "sqbqDat");
            return (Criteria) this;
        }

        public Criteria andSqbqDatNotEqualTo(Date value) {
            addCriterion("SQBQ_DAT <>", value, "sqbqDat");
            return (Criteria) this;
        }

        public Criteria andSqbqDatGreaterThan(Date value) {
            addCriterion("SQBQ_DAT >", value, "sqbqDat");
            return (Criteria) this;
        }

        public Criteria andSqbqDatGreaterThanOrEqualTo(Date value) {
            addCriterion("SQBQ_DAT >=", value, "sqbqDat");
            return (Criteria) this;
        }

        public Criteria andSqbqDatLessThan(Date value) {
            addCriterion("SQBQ_DAT <", value, "sqbqDat");
            return (Criteria) this;
        }

        public Criteria andSqbqDatLessThanOrEqualTo(Date value) {
            addCriterion("SQBQ_DAT <=", value, "sqbqDat");
            return (Criteria) this;
        }

        public Criteria andSqbqDatIn(List<Date> values) {
            addCriterion("SQBQ_DAT in", values, "sqbqDat");
            return (Criteria) this;
        }

        public Criteria andSqbqDatNotIn(List<Date> values) {
            addCriterion("SQBQ_DAT not in", values, "sqbqDat");
            return (Criteria) this;
        }

        public Criteria andSqbqDatBetween(Date value1, Date value2) {
            addCriterion("SQBQ_DAT between", value1, value2, "sqbqDat");
            return (Criteria) this;
        }

        public Criteria andSqbqDatNotBetween(Date value1, Date value2) {
            addCriterion("SQBQ_DAT not between", value1, value2, "sqbqDat");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatIsNull() {
            addCriterion("OPRT_ROOM_DAT is null");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatIsNotNull() {
            addCriterion("OPRT_ROOM_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatEqualTo(Date value) {
            addCriterion("OPRT_ROOM_DAT =", value, "oprtRoomDat");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatNotEqualTo(Date value) {
            addCriterion("OPRT_ROOM_DAT <>", value, "oprtRoomDat");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatGreaterThan(Date value) {
            addCriterion("OPRT_ROOM_DAT >", value, "oprtRoomDat");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatGreaterThanOrEqualTo(Date value) {
            addCriterion("OPRT_ROOM_DAT >=", value, "oprtRoomDat");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatLessThan(Date value) {
            addCriterion("OPRT_ROOM_DAT <", value, "oprtRoomDat");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatLessThanOrEqualTo(Date value) {
            addCriterion("OPRT_ROOM_DAT <=", value, "oprtRoomDat");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatIn(List<Date> values) {
            addCriterion("OPRT_ROOM_DAT in", values, "oprtRoomDat");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatNotIn(List<Date> values) {
            addCriterion("OPRT_ROOM_DAT not in", values, "oprtRoomDat");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatBetween(Date value1, Date value2) {
            addCriterion("OPRT_ROOM_DAT between", value1, value2, "oprtRoomDat");
            return (Criteria) this;
        }

        public Criteria andOprtRoomDatNotBetween(Date value1, Date value2) {
            addCriterion("OPRT_ROOM_DAT not between", value1, value2, "oprtRoomDat");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrIsNull() {
            addCriterion("NURSE1_NBR is null");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrIsNotNull() {
            addCriterion("NURSE1_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrEqualTo(String value) {
            addCriterion("NURSE1_NBR =", value, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrNotEqualTo(String value) {
            addCriterion("NURSE1_NBR <>", value, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrGreaterThan(String value) {
            addCriterion("NURSE1_NBR >", value, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrGreaterThanOrEqualTo(String value) {
            addCriterion("NURSE1_NBR >=", value, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrLessThan(String value) {
            addCriterion("NURSE1_NBR <", value, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrLessThanOrEqualTo(String value) {
            addCriterion("NURSE1_NBR <=", value, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrLike(String value) {
            addCriterion("NURSE1_NBR like", value, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrNotLike(String value) {
            addCriterion("NURSE1_NBR not like", value, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrIn(List<String> values) {
            addCriterion("NURSE1_NBR in", values, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrNotIn(List<String> values) {
            addCriterion("NURSE1_NBR not in", values, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrBetween(String value1, String value2) {
            addCriterion("NURSE1_NBR between", value1, value2, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NbrNotBetween(String value1, String value2) {
            addCriterion("NURSE1_NBR not between", value1, value2, "nurse1Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse1NamIsNull() {
            addCriterion("NURSE1_NAM is null");
            return (Criteria) this;
        }

        public Criteria andNurse1NamIsNotNull() {
            addCriterion("NURSE1_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andNurse1NamEqualTo(String value) {
            addCriterion("NURSE1_NAM =", value, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse1NamNotEqualTo(String value) {
            addCriterion("NURSE1_NAM <>", value, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse1NamGreaterThan(String value) {
            addCriterion("NURSE1_NAM >", value, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse1NamGreaterThanOrEqualTo(String value) {
            addCriterion("NURSE1_NAM >=", value, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse1NamLessThan(String value) {
            addCriterion("NURSE1_NAM <", value, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse1NamLessThanOrEqualTo(String value) {
            addCriterion("NURSE1_NAM <=", value, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse1NamLike(String value) {
            addCriterion("NURSE1_NAM like", value, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse1NamNotLike(String value) {
            addCriterion("NURSE1_NAM not like", value, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse1NamIn(List<String> values) {
            addCriterion("NURSE1_NAM in", values, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse1NamNotIn(List<String> values) {
            addCriterion("NURSE1_NAM not in", values, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse1NamBetween(String value1, String value2) {
            addCriterion("NURSE1_NAM between", value1, value2, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse1NamNotBetween(String value1, String value2) {
            addCriterion("NURSE1_NAM not between", value1, value2, "nurse1Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrIsNull() {
            addCriterion("NURSE2_NBR is null");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrIsNotNull() {
            addCriterion("NURSE2_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrEqualTo(String value) {
            addCriterion("NURSE2_NBR =", value, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrNotEqualTo(String value) {
            addCriterion("NURSE2_NBR <>", value, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrGreaterThan(String value) {
            addCriterion("NURSE2_NBR >", value, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrGreaterThanOrEqualTo(String value) {
            addCriterion("NURSE2_NBR >=", value, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrLessThan(String value) {
            addCriterion("NURSE2_NBR <", value, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrLessThanOrEqualTo(String value) {
            addCriterion("NURSE2_NBR <=", value, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrLike(String value) {
            addCriterion("NURSE2_NBR like", value, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrNotLike(String value) {
            addCriterion("NURSE2_NBR not like", value, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrIn(List<String> values) {
            addCriterion("NURSE2_NBR in", values, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrNotIn(List<String> values) {
            addCriterion("NURSE2_NBR not in", values, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrBetween(String value1, String value2) {
            addCriterion("NURSE2_NBR between", value1, value2, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NbrNotBetween(String value1, String value2) {
            addCriterion("NURSE2_NBR not between", value1, value2, "nurse2Nbr");
            return (Criteria) this;
        }

        public Criteria andNurse2NamIsNull() {
            addCriterion("NURSE2_NAM is null");
            return (Criteria) this;
        }

        public Criteria andNurse2NamIsNotNull() {
            addCriterion("NURSE2_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andNurse2NamEqualTo(String value) {
            addCriterion("NURSE2_NAM =", value, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NamNotEqualTo(String value) {
            addCriterion("NURSE2_NAM <>", value, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NamGreaterThan(String value) {
            addCriterion("NURSE2_NAM >", value, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NamGreaterThanOrEqualTo(String value) {
            addCriterion("NURSE2_NAM >=", value, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NamLessThan(String value) {
            addCriterion("NURSE2_NAM <", value, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NamLessThanOrEqualTo(String value) {
            addCriterion("NURSE2_NAM <=", value, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NamLike(String value) {
            addCriterion("NURSE2_NAM like", value, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NamNotLike(String value) {
            addCriterion("NURSE2_NAM not like", value, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NamIn(List<String> values) {
            addCriterion("NURSE2_NAM in", values, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NamNotIn(List<String> values) {
            addCriterion("NURSE2_NAM not in", values, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NamBetween(String value1, String value2) {
            addCriterion("NURSE2_NAM between", value1, value2, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andNurse2NamNotBetween(String value1, String value2) {
            addCriterion("NURSE2_NAM not between", value1, value2, "nurse2Nam");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwIsNull() {
            addCriterion("SMTZ_OPR_TW is null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwIsNotNull() {
            addCriterion("SMTZ_OPR_TW is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwEqualTo(BigDecimal value) {
            addCriterion("SMTZ_OPR_TW =", value, "smtzOprTw");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwNotEqualTo(BigDecimal value) {
            addCriterion("SMTZ_OPR_TW <>", value, "smtzOprTw");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwGreaterThan(BigDecimal value) {
            addCriterion("SMTZ_OPR_TW >", value, "smtzOprTw");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SMTZ_OPR_TW >=", value, "smtzOprTw");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwLessThan(BigDecimal value) {
            addCriterion("SMTZ_OPR_TW <", value, "smtzOprTw");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SMTZ_OPR_TW <=", value, "smtzOprTw");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwIn(List<BigDecimal> values) {
            addCriterion("SMTZ_OPR_TW in", values, "smtzOprTw");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwNotIn(List<BigDecimal> values) {
            addCriterion("SMTZ_OPR_TW not in", values, "smtzOprTw");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMTZ_OPR_TW between", value1, value2, "smtzOprTw");
            return (Criteria) this;
        }

        public Criteria andSmtzOprTwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMTZ_OPR_TW not between", value1, value2, "smtzOprTw");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrIsNull() {
            addCriterion("SMTZ_OPR_HR is null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrIsNotNull() {
            addCriterion("SMTZ_OPR_HR is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrEqualTo(Short value) {
            addCriterion("SMTZ_OPR_HR =", value, "smtzOprHr");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrNotEqualTo(Short value) {
            addCriterion("SMTZ_OPR_HR <>", value, "smtzOprHr");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrGreaterThan(Short value) {
            addCriterion("SMTZ_OPR_HR >", value, "smtzOprHr");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_OPR_HR >=", value, "smtzOprHr");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrLessThan(Short value) {
            addCriterion("SMTZ_OPR_HR <", value, "smtzOprHr");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_OPR_HR <=", value, "smtzOprHr");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrIn(List<Short> values) {
            addCriterion("SMTZ_OPR_HR in", values, "smtzOprHr");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrNotIn(List<Short> values) {
            addCriterion("SMTZ_OPR_HR not in", values, "smtzOprHr");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrBetween(Short value1, Short value2) {
            addCriterion("SMTZ_OPR_HR between", value1, value2, "smtzOprHr");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHrNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_OPR_HR not between", value1, value2, "smtzOprHr");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxIsNull() {
            addCriterion("SMTZ_OPR_HX is null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxIsNotNull() {
            addCriterion("SMTZ_OPR_HX is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxEqualTo(Short value) {
            addCriterion("SMTZ_OPR_HX =", value, "smtzOprHx");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxNotEqualTo(Short value) {
            addCriterion("SMTZ_OPR_HX <>", value, "smtzOprHx");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxGreaterThan(Short value) {
            addCriterion("SMTZ_OPR_HX >", value, "smtzOprHx");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_OPR_HX >=", value, "smtzOprHx");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxLessThan(Short value) {
            addCriterion("SMTZ_OPR_HX <", value, "smtzOprHx");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_OPR_HX <=", value, "smtzOprHx");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxIn(List<Short> values) {
            addCriterion("SMTZ_OPR_HX in", values, "smtzOprHx");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxNotIn(List<Short> values) {
            addCriterion("SMTZ_OPR_HX not in", values, "smtzOprHx");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxBetween(Short value1, Short value2) {
            addCriterion("SMTZ_OPR_HX between", value1, value2, "smtzOprHx");
            return (Criteria) this;
        }

        public Criteria andSmtzOprHxNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_OPR_HX not between", value1, value2, "smtzOprHx");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupIsNull() {
            addCriterion("SMTZ_OPR_BPUP is null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupIsNotNull() {
            addCriterion("SMTZ_OPR_BPUP is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupEqualTo(Short value) {
            addCriterion("SMTZ_OPR_BPUP =", value, "smtzOprBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupNotEqualTo(Short value) {
            addCriterion("SMTZ_OPR_BPUP <>", value, "smtzOprBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupGreaterThan(Short value) {
            addCriterion("SMTZ_OPR_BPUP >", value, "smtzOprBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_OPR_BPUP >=", value, "smtzOprBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupLessThan(Short value) {
            addCriterion("SMTZ_OPR_BPUP <", value, "smtzOprBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_OPR_BPUP <=", value, "smtzOprBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupIn(List<Short> values) {
            addCriterion("SMTZ_OPR_BPUP in", values, "smtzOprBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupNotIn(List<Short> values) {
            addCriterion("SMTZ_OPR_BPUP not in", values, "smtzOprBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupBetween(Short value1, Short value2) {
            addCriterion("SMTZ_OPR_BPUP between", value1, value2, "smtzOprBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpupNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_OPR_BPUP not between", value1, value2, "smtzOprBpup");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownIsNull() {
            addCriterion("SMTZ_OPR_BPDOWN is null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownIsNotNull() {
            addCriterion("SMTZ_OPR_BPDOWN is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownEqualTo(Short value) {
            addCriterion("SMTZ_OPR_BPDOWN =", value, "smtzOprBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownNotEqualTo(Short value) {
            addCriterion("SMTZ_OPR_BPDOWN <>", value, "smtzOprBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownGreaterThan(Short value) {
            addCriterion("SMTZ_OPR_BPDOWN >", value, "smtzOprBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownGreaterThanOrEqualTo(Short value) {
            addCriterion("SMTZ_OPR_BPDOWN >=", value, "smtzOprBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownLessThan(Short value) {
            addCriterion("SMTZ_OPR_BPDOWN <", value, "smtzOprBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownLessThanOrEqualTo(Short value) {
            addCriterion("SMTZ_OPR_BPDOWN <=", value, "smtzOprBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownIn(List<Short> values) {
            addCriterion("SMTZ_OPR_BPDOWN in", values, "smtzOprBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownNotIn(List<Short> values) {
            addCriterion("SMTZ_OPR_BPDOWN not in", values, "smtzOprBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownBetween(Short value1, Short value2) {
            addCriterion("SMTZ_OPR_BPDOWN between", value1, value2, "smtzOprBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzOprBpdownNotBetween(Short value1, Short value2) {
            addCriterion("SMTZ_OPR_BPDOWN not between", value1, value2, "smtzOprBpdown");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2IsNull() {
            addCriterion("SMTZ_OPR_SO2 is null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2IsNotNull() {
            addCriterion("SMTZ_OPR_SO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2EqualTo(BigDecimal value) {
            addCriterion("SMTZ_OPR_SO2 =", value, "smtzOprSo2");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2NotEqualTo(BigDecimal value) {
            addCriterion("SMTZ_OPR_SO2 <>", value, "smtzOprSo2");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2GreaterThan(BigDecimal value) {
            addCriterion("SMTZ_OPR_SO2 >", value, "smtzOprSo2");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SMTZ_OPR_SO2 >=", value, "smtzOprSo2");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2LessThan(BigDecimal value) {
            addCriterion("SMTZ_OPR_SO2 <", value, "smtzOprSo2");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SMTZ_OPR_SO2 <=", value, "smtzOprSo2");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2In(List<BigDecimal> values) {
            addCriterion("SMTZ_OPR_SO2 in", values, "smtzOprSo2");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2NotIn(List<BigDecimal> values) {
            addCriterion("SMTZ_OPR_SO2 not in", values, "smtzOprSo2");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMTZ_OPR_SO2 between", value1, value2, "smtzOprSo2");
            return (Criteria) this;
        }

        public Criteria andSmtzOprSo2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMTZ_OPR_SO2 not between", value1, value2, "smtzOprSo2");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsIsNull() {
            addCriterion("SMTZ_OPR_YS is null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsIsNotNull() {
            addCriterion("SMTZ_OPR_YS is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsEqualTo(String value) {
            addCriterion("SMTZ_OPR_YS =", value, "smtzOprYs");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsNotEqualTo(String value) {
            addCriterion("SMTZ_OPR_YS <>", value, "smtzOprYs");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsGreaterThan(String value) {
            addCriterion("SMTZ_OPR_YS >", value, "smtzOprYs");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsGreaterThanOrEqualTo(String value) {
            addCriterion("SMTZ_OPR_YS >=", value, "smtzOprYs");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsLessThan(String value) {
            addCriterion("SMTZ_OPR_YS <", value, "smtzOprYs");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsLessThanOrEqualTo(String value) {
            addCriterion("SMTZ_OPR_YS <=", value, "smtzOprYs");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsLike(String value) {
            addCriterion("SMTZ_OPR_YS like", value, "smtzOprYs");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsNotLike(String value) {
            addCriterion("SMTZ_OPR_YS not like", value, "smtzOprYs");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsIn(List<String> values) {
            addCriterion("SMTZ_OPR_YS in", values, "smtzOprYs");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsNotIn(List<String> values) {
            addCriterion("SMTZ_OPR_YS not in", values, "smtzOprYs");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsBetween(String value1, String value2) {
            addCriterion("SMTZ_OPR_YS between", value1, value2, "smtzOprYs");
            return (Criteria) this;
        }

        public Criteria andSmtzOprYsNotBetween(String value1, String value2) {
            addCriterion("SMTZ_OPR_YS not between", value1, value2, "smtzOprYs");
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