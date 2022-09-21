package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspGgjpfxtInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspGgjpfxtInfExample() {
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

        public Criteria andXtpgSeqIsNull() {
            addCriterion("XTPG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIsNotNull() {
            addCriterion("XTPG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqEqualTo(String value) {
            addCriterion("XTPG_SEQ =", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotEqualTo(String value) {
            addCriterion("XTPG_SEQ <>", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThan(String value) {
            addCriterion("XTPG_SEQ >", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ >=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThan(String value) {
            addCriterion("XTPG_SEQ <", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ <=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLike(String value) {
            addCriterion("XTPG_SEQ like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotLike(String value) {
            addCriterion("XTPG_SEQ not like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIn(List<String> values) {
            addCriterion("XTPG_SEQ in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotIn(List<String> values) {
            addCriterion("XTPG_SEQ not in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ between", value1, value2, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ not between", value1, value2, "xtpgSeq");
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

        public Criteria andGgjpfxtPfysCodIsNull() {
            addCriterion("GGJPFXT_PFYS_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodIsNotNull() {
            addCriterion("GGJPFXT_PFYS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodEqualTo(String value) {
            addCriterion("GGJPFXT_PFYS_COD =", value, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_PFYS_COD <>", value, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodGreaterThan(String value) {
            addCriterion("GGJPFXT_PFYS_COD >", value, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_PFYS_COD >=", value, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodLessThan(String value) {
            addCriterion("GGJPFXT_PFYS_COD <", value, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_PFYS_COD <=", value, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodLike(String value) {
            addCriterion("GGJPFXT_PFYS_COD like", value, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodNotLike(String value) {
            addCriterion("GGJPFXT_PFYS_COD not like", value, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodIn(List<String> values) {
            addCriterion("GGJPFXT_PFYS_COD in", values, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_PFYS_COD not in", values, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_PFYS_COD between", value1, value2, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfysCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_PFYS_COD not between", value1, value2, "ggjpfxtPfysCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodIsNull() {
            addCriterion("GGJPFXT_PFWD_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodIsNotNull() {
            addCriterion("GGJPFXT_PFWD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodEqualTo(String value) {
            addCriterion("GGJPFXT_PFWD_COD =", value, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_PFWD_COD <>", value, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodGreaterThan(String value) {
            addCriterion("GGJPFXT_PFWD_COD >", value, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_PFWD_COD >=", value, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodLessThan(String value) {
            addCriterion("GGJPFXT_PFWD_COD <", value, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_PFWD_COD <=", value, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodLike(String value) {
            addCriterion("GGJPFXT_PFWD_COD like", value, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodNotLike(String value) {
            addCriterion("GGJPFXT_PFWD_COD not like", value, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodIn(List<String> values) {
            addCriterion("GGJPFXT_PFWD_COD in", values, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_PFWD_COD not in", values, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_PFWD_COD between", value1, value2, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_PFWD_COD not between", value1, value2, "ggjpfxtPfwdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodIsNull() {
            addCriterion("GGJPFXT_SZFW_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodIsNotNull() {
            addCriterion("GGJPFXT_SZFW_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodEqualTo(String value) {
            addCriterion("GGJPFXT_SZFW_COD =", value, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_SZFW_COD <>", value, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodGreaterThan(String value) {
            addCriterion("GGJPFXT_SZFW_COD >", value, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SZFW_COD >=", value, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodLessThan(String value) {
            addCriterion("GGJPFXT_SZFW_COD <", value, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SZFW_COD <=", value, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodLike(String value) {
            addCriterion("GGJPFXT_SZFW_COD like", value, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodNotLike(String value) {
            addCriterion("GGJPFXT_SZFW_COD not like", value, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodIn(List<String> values) {
            addCriterion("GGJPFXT_SZFW_COD in", values, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_SZFW_COD not in", values, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SZFW_COD between", value1, value2, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SZFW_COD not between", value1, value2, "ggjpfxtSzfwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtIsNull() {
            addCriterion("GGJPFXT_SZFW_QT is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtIsNotNull() {
            addCriterion("GGJPFXT_SZFW_QT is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtEqualTo(String value) {
            addCriterion("GGJPFXT_SZFW_QT =", value, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtNotEqualTo(String value) {
            addCriterion("GGJPFXT_SZFW_QT <>", value, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtGreaterThan(String value) {
            addCriterion("GGJPFXT_SZFW_QT >", value, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SZFW_QT >=", value, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtLessThan(String value) {
            addCriterion("GGJPFXT_SZFW_QT <", value, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SZFW_QT <=", value, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtLike(String value) {
            addCriterion("GGJPFXT_SZFW_QT like", value, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtNotLike(String value) {
            addCriterion("GGJPFXT_SZFW_QT not like", value, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtIn(List<String> values) {
            addCriterion("GGJPFXT_SZFW_QT in", values, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtNotIn(List<String> values) {
            addCriterion("GGJPFXT_SZFW_QT not in", values, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SZFW_QT between", value1, value2, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzfwQtNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SZFW_QT not between", value1, value2, "ggjpfxtSzfwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodIsNull() {
            addCriterion("GGJPFXT_SZXZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodIsNotNull() {
            addCriterion("GGJPFXT_SZXZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodEqualTo(String value) {
            addCriterion("GGJPFXT_SZXZ_COD =", value, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_SZXZ_COD <>", value, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodGreaterThan(String value) {
            addCriterion("GGJPFXT_SZXZ_COD >", value, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SZXZ_COD >=", value, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodLessThan(String value) {
            addCriterion("GGJPFXT_SZXZ_COD <", value, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SZXZ_COD <=", value, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodLike(String value) {
            addCriterion("GGJPFXT_SZXZ_COD like", value, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodNotLike(String value) {
            addCriterion("GGJPFXT_SZXZ_COD not like", value, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodIn(List<String> values) {
            addCriterion("GGJPFXT_SZXZ_COD in", values, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_SZXZ_COD not in", values, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SZXZ_COD between", value1, value2, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzxzCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SZXZ_COD not between", value1, value2, "ggjpfxtSzxzCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodIsNull() {
            addCriterion("GGJPFXT_SZCD_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodIsNotNull() {
            addCriterion("GGJPFXT_SZCD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodEqualTo(String value) {
            addCriterion("GGJPFXT_SZCD_COD =", value, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_SZCD_COD <>", value, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodGreaterThan(String value) {
            addCriterion("GGJPFXT_SZCD_COD >", value, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SZCD_COD >=", value, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodLessThan(String value) {
            addCriterion("GGJPFXT_SZCD_COD <", value, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SZCD_COD <=", value, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodLike(String value) {
            addCriterion("GGJPFXT_SZCD_COD like", value, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodNotLike(String value) {
            addCriterion("GGJPFXT_SZCD_COD not like", value, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodIn(List<String> values) {
            addCriterion("GGJPFXT_SZCD_COD in", values, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_SZCD_COD not in", values, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SZCD_COD between", value1, value2, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSzcdCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SZCD_COD not between", value1, value2, "ggjpfxtSzcdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodIsNull() {
            addCriterion("GGJPFXT_BTT_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodIsNotNull() {
            addCriterion("GGJPFXT_BTT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodEqualTo(String value) {
            addCriterion("GGJPFXT_BTT_COD =", value, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_BTT_COD <>", value, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodGreaterThan(String value) {
            addCriterion("GGJPFXT_BTT_COD >", value, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_BTT_COD >=", value, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodLessThan(String value) {
            addCriterion("GGJPFXT_BTT_COD <", value, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_BTT_COD <=", value, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodLike(String value) {
            addCriterion("GGJPFXT_BTT_COD like", value, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodNotLike(String value) {
            addCriterion("GGJPFXT_BTT_COD not like", value, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodIn(List<String> values) {
            addCriterion("GGJPFXT_BTT_COD in", values, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_BTT_COD not in", values, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_BTT_COD between", value1, value2, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBttCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_BTT_COD not between", value1, value2, "ggjpfxtBttCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodIsNull() {
            addCriterion("GGJPFXT_KQNM_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodIsNotNull() {
            addCriterion("GGJPFXT_KQNM_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodEqualTo(String value) {
            addCriterion("GGJPFXT_KQNM_COD =", value, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_KQNM_COD <>", value, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodGreaterThan(String value) {
            addCriterion("GGJPFXT_KQNM_COD >", value, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_KQNM_COD >=", value, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodLessThan(String value) {
            addCriterion("GGJPFXT_KQNM_COD <", value, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_KQNM_COD <=", value, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodLike(String value) {
            addCriterion("GGJPFXT_KQNM_COD like", value, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodNotLike(String value) {
            addCriterion("GGJPFXT_KQNM_COD not like", value, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodIn(List<String> values) {
            addCriterion("GGJPFXT_KQNM_COD in", values, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_KQNM_COD not in", values, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_KQNM_COD between", value1, value2, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqnmCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_KQNM_COD not between", value1, value2, "ggjpfxtKqnmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodIsNull() {
            addCriterion("GGJPFXT_ZKNM_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodIsNotNull() {
            addCriterion("GGJPFXT_ZKNM_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodEqualTo(String value) {
            addCriterion("GGJPFXT_ZKNM_COD =", value, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_ZKNM_COD <>", value, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodGreaterThan(String value) {
            addCriterion("GGJPFXT_ZKNM_COD >", value, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_ZKNM_COD >=", value, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodLessThan(String value) {
            addCriterion("GGJPFXT_ZKNM_COD <", value, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_ZKNM_COD <=", value, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodLike(String value) {
            addCriterion("GGJPFXT_ZKNM_COD like", value, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodNotLike(String value) {
            addCriterion("GGJPFXT_ZKNM_COD not like", value, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodIn(List<String> values) {
            addCriterion("GGJPFXT_ZKNM_COD in", values, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_ZKNM_COD not in", values, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_ZKNM_COD between", value1, value2, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtZknmCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_ZKNM_COD not between", value1, value2, "ggjpfxtZknmCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgIsNull() {
            addCriterion("GGJPFXT_BH_FLG is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgIsNotNull() {
            addCriterion("GGJPFXT_BH_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgEqualTo(String value) {
            addCriterion("GGJPFXT_BH_FLG =", value, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgNotEqualTo(String value) {
            addCriterion("GGJPFXT_BH_FLG <>", value, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgGreaterThan(String value) {
            addCriterion("GGJPFXT_BH_FLG >", value, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_BH_FLG >=", value, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgLessThan(String value) {
            addCriterion("GGJPFXT_BH_FLG <", value, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_BH_FLG <=", value, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgLike(String value) {
            addCriterion("GGJPFXT_BH_FLG like", value, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgNotLike(String value) {
            addCriterion("GGJPFXT_BH_FLG not like", value, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgIn(List<String> values) {
            addCriterion("GGJPFXT_BH_FLG in", values, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgNotIn(List<String> values) {
            addCriterion("GGJPFXT_BH_FLG not in", values, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgBetween(String value1, String value2) {
            addCriterion("GGJPFXT_BH_FLG between", value1, value2, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtBhFlgNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_BH_FLG not between", value1, value2, "ggjpfxtBhFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodIsNull() {
            addCriterion("GGJPFXT_SKBW_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodIsNotNull() {
            addCriterion("GGJPFXT_SKBW_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodEqualTo(String value) {
            addCriterion("GGJPFXT_SKBW_COD =", value, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_SKBW_COD <>", value, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodGreaterThan(String value) {
            addCriterion("GGJPFXT_SKBW_COD >", value, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SKBW_COD >=", value, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodLessThan(String value) {
            addCriterion("GGJPFXT_SKBW_COD <", value, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SKBW_COD <=", value, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodLike(String value) {
            addCriterion("GGJPFXT_SKBW_COD like", value, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodNotLike(String value) {
            addCriterion("GGJPFXT_SKBW_COD not like", value, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodIn(List<String> values) {
            addCriterion("GGJPFXT_SKBW_COD in", values, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_SKBW_COD not in", values, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SKBW_COD between", value1, value2, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SKBW_COD not between", value1, value2, "ggjpfxtSkbwCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtIsNull() {
            addCriterion("GGJPFXT_SKBW_QT is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtIsNotNull() {
            addCriterion("GGJPFXT_SKBW_QT is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtEqualTo(String value) {
            addCriterion("GGJPFXT_SKBW_QT =", value, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtNotEqualTo(String value) {
            addCriterion("GGJPFXT_SKBW_QT <>", value, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtGreaterThan(String value) {
            addCriterion("GGJPFXT_SKBW_QT >", value, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SKBW_QT >=", value, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtLessThan(String value) {
            addCriterion("GGJPFXT_SKBW_QT <", value, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SKBW_QT <=", value, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtLike(String value) {
            addCriterion("GGJPFXT_SKBW_QT like", value, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtNotLike(String value) {
            addCriterion("GGJPFXT_SKBW_QT not like", value, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtIn(List<String> values) {
            addCriterion("GGJPFXT_SKBW_QT in", values, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtNotIn(List<String> values) {
            addCriterion("GGJPFXT_SKBW_QT not in", values, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SKBW_QT between", value1, value2, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkbwQtNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SKBW_QT not between", value1, value2, "ggjpfxtSkbwQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodIsNull() {
            addCriterion("GGJPFXT_SK_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodIsNotNull() {
            addCriterion("GGJPFXT_SK_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodEqualTo(String value) {
            addCriterion("GGJPFXT_SK_COD =", value, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_SK_COD <>", value, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodGreaterThan(String value) {
            addCriterion("GGJPFXT_SK_COD >", value, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SK_COD >=", value, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodLessThan(String value) {
            addCriterion("GGJPFXT_SK_COD <", value, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_SK_COD <=", value, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodLike(String value) {
            addCriterion("GGJPFXT_SK_COD like", value, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodNotLike(String value) {
            addCriterion("GGJPFXT_SK_COD not like", value, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodIn(List<String> values) {
            addCriterion("GGJPFXT_SK_COD in", values, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_SK_COD not in", values, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SK_COD between", value1, value2, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtSkCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_SK_COD not between", value1, value2, "ggjpfxtSkCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcIsNull() {
            addCriterion("GGJPFXT_YC is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcIsNotNull() {
            addCriterion("GGJPFXT_YC is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcEqualTo(String value) {
            addCriterion("GGJPFXT_YC =", value, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcNotEqualTo(String value) {
            addCriterion("GGJPFXT_YC <>", value, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcGreaterThan(String value) {
            addCriterion("GGJPFXT_YC >", value, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_YC >=", value, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcLessThan(String value) {
            addCriterion("GGJPFXT_YC <", value, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_YC <=", value, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcLike(String value) {
            addCriterion("GGJPFXT_YC like", value, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcNotLike(String value) {
            addCriterion("GGJPFXT_YC not like", value, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcIn(List<String> values) {
            addCriterion("GGJPFXT_YC in", values, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcNotIn(List<String> values) {
            addCriterion("GGJPFXT_YC not in", values, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcBetween(String value1, String value2) {
            addCriterion("GGJPFXT_YC between", value1, value2, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtYcNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_YC not between", value1, value2, "ggjpfxtYc");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgIsNull() {
            addCriterion("GGJPFXT_JZ_FLG is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgIsNotNull() {
            addCriterion("GGJPFXT_JZ_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgEqualTo(String value) {
            addCriterion("GGJPFXT_JZ_FLG =", value, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgNotEqualTo(String value) {
            addCriterion("GGJPFXT_JZ_FLG <>", value, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgGreaterThan(String value) {
            addCriterion("GGJPFXT_JZ_FLG >", value, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_JZ_FLG >=", value, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgLessThan(String value) {
            addCriterion("GGJPFXT_JZ_FLG <", value, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_JZ_FLG <=", value, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgLike(String value) {
            addCriterion("GGJPFXT_JZ_FLG like", value, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgNotLike(String value) {
            addCriterion("GGJPFXT_JZ_FLG not like", value, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgIn(List<String> values) {
            addCriterion("GGJPFXT_JZ_FLG in", values, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgNotIn(List<String> values) {
            addCriterion("GGJPFXT_JZ_FLG not in", values, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgBetween(String value1, String value2) {
            addCriterion("GGJPFXT_JZ_FLG between", value1, value2, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtJzFlgNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_JZ_FLG not between", value1, value2, "ggjpfxtJzFlg");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodIsNull() {
            addCriterion("GGJPFXT_GD_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodIsNotNull() {
            addCriterion("GGJPFXT_GD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodEqualTo(String value) {
            addCriterion("GGJPFXT_GD_COD =", value, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_GD_COD <>", value, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodGreaterThan(String value) {
            addCriterion("GGJPFXT_GD_COD >", value, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_GD_COD >=", value, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodLessThan(String value) {
            addCriterion("GGJPFXT_GD_COD <", value, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_GD_COD <=", value, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodLike(String value) {
            addCriterion("GGJPFXT_GD_COD like", value, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodNotLike(String value) {
            addCriterion("GGJPFXT_GD_COD not like", value, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodIn(List<String> values) {
            addCriterion("GGJPFXT_GD_COD in", values, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_GD_COD not in", values, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_GD_COD between", value1, value2, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_GD_COD not between", value1, value2, "ggjpfxtGdCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtIsNull() {
            addCriterion("GGJPFXT_GD_QT is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtIsNotNull() {
            addCriterion("GGJPFXT_GD_QT is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtEqualTo(String value) {
            addCriterion("GGJPFXT_GD_QT =", value, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtNotEqualTo(String value) {
            addCriterion("GGJPFXT_GD_QT <>", value, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtGreaterThan(String value) {
            addCriterion("GGJPFXT_GD_QT >", value, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_GD_QT >=", value, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtLessThan(String value) {
            addCriterion("GGJPFXT_GD_QT <", value, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_GD_QT <=", value, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtLike(String value) {
            addCriterion("GGJPFXT_GD_QT like", value, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtNotLike(String value) {
            addCriterion("GGJPFXT_GD_QT not like", value, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtIn(List<String> values) {
            addCriterion("GGJPFXT_GD_QT in", values, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtNotIn(List<String> values) {
            addCriterion("GGJPFXT_GD_QT not in", values, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtBetween(String value1, String value2) {
            addCriterion("GGJPFXT_GD_QT between", value1, value2, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtGdQtNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_GD_QT not between", value1, value2, "ggjpfxtGdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodIsNull() {
            addCriterion("GGJPFXT_HDFS_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodIsNotNull() {
            addCriterion("GGJPFXT_HDFS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodEqualTo(String value) {
            addCriterion("GGJPFXT_HDFS_COD =", value, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_HDFS_COD <>", value, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodGreaterThan(String value) {
            addCriterion("GGJPFXT_HDFS_COD >", value, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_HDFS_COD >=", value, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodLessThan(String value) {
            addCriterion("GGJPFXT_HDFS_COD <", value, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_HDFS_COD <=", value, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodLike(String value) {
            addCriterion("GGJPFXT_HDFS_COD like", value, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodNotLike(String value) {
            addCriterion("GGJPFXT_HDFS_COD not like", value, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodIn(List<String> values) {
            addCriterion("GGJPFXT_HDFS_COD in", values, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_HDFS_COD not in", values, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_HDFS_COD between", value1, value2, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_HDFS_COD not between", value1, value2, "ggjpfxtHdfsCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtIsNull() {
            addCriterion("GGJPFXT_HDFS_QT is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtIsNotNull() {
            addCriterion("GGJPFXT_HDFS_QT is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtEqualTo(String value) {
            addCriterion("GGJPFXT_HDFS_QT =", value, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtNotEqualTo(String value) {
            addCriterion("GGJPFXT_HDFS_QT <>", value, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtGreaterThan(String value) {
            addCriterion("GGJPFXT_HDFS_QT >", value, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_HDFS_QT >=", value, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtLessThan(String value) {
            addCriterion("GGJPFXT_HDFS_QT <", value, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_HDFS_QT <=", value, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtLike(String value) {
            addCriterion("GGJPFXT_HDFS_QT like", value, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtNotLike(String value) {
            addCriterion("GGJPFXT_HDFS_QT not like", value, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtIn(List<String> values) {
            addCriterion("GGJPFXT_HDFS_QT in", values, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtNotIn(List<String> values) {
            addCriterion("GGJPFXT_HDFS_QT not in", values, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtBetween(String value1, String value2) {
            addCriterion("GGJPFXT_HDFS_QT between", value1, value2, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtHdfsQtNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_HDFS_QT not between", value1, value2, "ggjpfxtHdfsQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodIsNull() {
            addCriterion("GGJPFXT_KQY_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodIsNotNull() {
            addCriterion("GGJPFXT_KQY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodEqualTo(String value) {
            addCriterion("GGJPFXT_KQY_COD =", value, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodNotEqualTo(String value) {
            addCriterion("GGJPFXT_KQY_COD <>", value, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodGreaterThan(String value) {
            addCriterion("GGJPFXT_KQY_COD >", value, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_KQY_COD >=", value, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodLessThan(String value) {
            addCriterion("GGJPFXT_KQY_COD <", value, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_KQY_COD <=", value, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodLike(String value) {
            addCriterion("GGJPFXT_KQY_COD like", value, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodNotLike(String value) {
            addCriterion("GGJPFXT_KQY_COD not like", value, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodIn(List<String> values) {
            addCriterion("GGJPFXT_KQY_COD in", values, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodNotIn(List<String> values) {
            addCriterion("GGJPFXT_KQY_COD not in", values, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodBetween(String value1, String value2) {
            addCriterion("GGJPFXT_KQY_COD between", value1, value2, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtKqyCodNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_KQY_COD not between", value1, value2, "ggjpfxtKqyCod");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoIsNull() {
            addCriterion("GGJPFXT_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoIsNotNull() {
            addCriterion("GGJPFXT_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoEqualTo(String value) {
            addCriterion("GGJPFXT_MEMO =", value, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoNotEqualTo(String value) {
            addCriterion("GGJPFXT_MEMO <>", value, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoGreaterThan(String value) {
            addCriterion("GGJPFXT_MEMO >", value, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_MEMO >=", value, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoLessThan(String value) {
            addCriterion("GGJPFXT_MEMO <", value, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_MEMO <=", value, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoLike(String value) {
            addCriterion("GGJPFXT_MEMO like", value, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoNotLike(String value) {
            addCriterion("GGJPFXT_MEMO not like", value, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoIn(List<String> values) {
            addCriterion("GGJPFXT_MEMO in", values, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoNotIn(List<String> values) {
            addCriterion("GGJPFXT_MEMO not in", values, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoBetween(String value1, String value2) {
            addCriterion("GGJPFXT_MEMO between", value1, value2, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtMemoNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_MEMO not between", value1, value2, "ggjpfxtMemo");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtIsNull() {
            addCriterion("GGJPFXT_PFWD_QT is null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtIsNotNull() {
            addCriterion("GGJPFXT_PFWD_QT is not null");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtEqualTo(String value) {
            addCriterion("GGJPFXT_PFWD_QT =", value, "ggjpfxtPfwdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtNotEqualTo(String value) {
            addCriterion("GGJPFXT_PFWD_QT <>", value, "ggjpfxtPfwdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtGreaterThan(String value) {
            addCriterion("GGJPFXT_PFWD_QT >", value, "ggjpfxtPfwdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtGreaterThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_PFWD_QT >=", value, "ggjpfxtPfwdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtLessThan(String value) {
            addCriterion("GGJPFXT_PFWD_QT <", value, "ggjpfxtPfwdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtLessThanOrEqualTo(String value) {
            addCriterion("GGJPFXT_PFWD_QT <=", value, "ggjpfxtPfwdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtLike(String value) {
            addCriterion("GGJPFXT_PFWD_QT like", value, "ggjpfxtPfwdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtNotLike(String value) {
            addCriterion("GGJPFXT_PFWD_QT not like", value, "ggjpfxtPfwdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtIn(List<String> values) {
            addCriterion("GGJPFXT_PFWD_QT in", values, "ggjpfxtPfwdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtNotIn(List<String> values) {
            addCriterion("GGJPFXT_PFWD_QT not in", values, "ggjpfxtPfwdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtBetween(String value1, String value2) {
            addCriterion("GGJPFXT_PFWD_QT between", value1, value2, "ggjpfxtPfwdQt");
            return (Criteria) this;
        }

        public Criteria andGgjpfxtPfwdQtNotBetween(String value1, String value2) {
            addCriterion("GGJPFXT_PFWD_QT not between", value1, value2, "ggjpfxtPfwdQt");
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