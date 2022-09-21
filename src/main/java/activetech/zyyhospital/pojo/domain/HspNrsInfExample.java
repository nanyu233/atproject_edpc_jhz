package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspNrsInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspNrsInfExample() {
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

        public Criteria andNrsTtbwIsNull() {
            addCriterion("NRS_TTBW is null");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwIsNotNull() {
            addCriterion("NRS_TTBW is not null");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwEqualTo(String value) {
            addCriterion("NRS_TTBW =", value, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwNotEqualTo(String value) {
            addCriterion("NRS_TTBW <>", value, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwGreaterThan(String value) {
            addCriterion("NRS_TTBW >", value, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwGreaterThanOrEqualTo(String value) {
            addCriterion("NRS_TTBW >=", value, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwLessThan(String value) {
            addCriterion("NRS_TTBW <", value, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwLessThanOrEqualTo(String value) {
            addCriterion("NRS_TTBW <=", value, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwLike(String value) {
            addCriterion("NRS_TTBW like", value, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwNotLike(String value) {
            addCriterion("NRS_TTBW not like", value, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwIn(List<String> values) {
            addCriterion("NRS_TTBW in", values, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwNotIn(List<String> values) {
            addCriterion("NRS_TTBW not in", values, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwBetween(String value1, String value2) {
            addCriterion("NRS_TTBW between", value1, value2, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwNotBetween(String value1, String value2) {
            addCriterion("NRS_TTBW not between", value1, value2, "nrsTtbw");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtIsNull() {
            addCriterion("NRS_TTBW_QT is null");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtIsNotNull() {
            addCriterion("NRS_TTBW_QT is not null");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtEqualTo(String value) {
            addCriterion("NRS_TTBW_QT =", value, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtNotEqualTo(String value) {
            addCriterion("NRS_TTBW_QT <>", value, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtGreaterThan(String value) {
            addCriterion("NRS_TTBW_QT >", value, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtGreaterThanOrEqualTo(String value) {
            addCriterion("NRS_TTBW_QT >=", value, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtLessThan(String value) {
            addCriterion("NRS_TTBW_QT <", value, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtLessThanOrEqualTo(String value) {
            addCriterion("NRS_TTBW_QT <=", value, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtLike(String value) {
            addCriterion("NRS_TTBW_QT like", value, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtNotLike(String value) {
            addCriterion("NRS_TTBW_QT not like", value, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtIn(List<String> values) {
            addCriterion("NRS_TTBW_QT in", values, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtNotIn(List<String> values) {
            addCriterion("NRS_TTBW_QT not in", values, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtBetween(String value1, String value2) {
            addCriterion("NRS_TTBW_QT between", value1, value2, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtbwQtNotBetween(String value1, String value2) {
            addCriterion("NRS_TTBW_QT not between", value1, value2, "nrsTtbwQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzIsNull() {
            addCriterion("NRS_TTXZ is null");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzIsNotNull() {
            addCriterion("NRS_TTXZ is not null");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzEqualTo(String value) {
            addCriterion("NRS_TTXZ =", value, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzNotEqualTo(String value) {
            addCriterion("NRS_TTXZ <>", value, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzGreaterThan(String value) {
            addCriterion("NRS_TTXZ >", value, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzGreaterThanOrEqualTo(String value) {
            addCriterion("NRS_TTXZ >=", value, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzLessThan(String value) {
            addCriterion("NRS_TTXZ <", value, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzLessThanOrEqualTo(String value) {
            addCriterion("NRS_TTXZ <=", value, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzLike(String value) {
            addCriterion("NRS_TTXZ like", value, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzNotLike(String value) {
            addCriterion("NRS_TTXZ not like", value, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzIn(List<String> values) {
            addCriterion("NRS_TTXZ in", values, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzNotIn(List<String> values) {
            addCriterion("NRS_TTXZ not in", values, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzBetween(String value1, String value2) {
            addCriterion("NRS_TTXZ between", value1, value2, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzNotBetween(String value1, String value2) {
            addCriterion("NRS_TTXZ not between", value1, value2, "nrsTtxz");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtIsNull() {
            addCriterion("NRS_TTXZ_QT is null");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtIsNotNull() {
            addCriterion("NRS_TTXZ_QT is not null");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtEqualTo(String value) {
            addCriterion("NRS_TTXZ_QT =", value, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtNotEqualTo(String value) {
            addCriterion("NRS_TTXZ_QT <>", value, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtGreaterThan(String value) {
            addCriterion("NRS_TTXZ_QT >", value, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtGreaterThanOrEqualTo(String value) {
            addCriterion("NRS_TTXZ_QT >=", value, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtLessThan(String value) {
            addCriterion("NRS_TTXZ_QT <", value, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtLessThanOrEqualTo(String value) {
            addCriterion("NRS_TTXZ_QT <=", value, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtLike(String value) {
            addCriterion("NRS_TTXZ_QT like", value, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtNotLike(String value) {
            addCriterion("NRS_TTXZ_QT not like", value, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtIn(List<String> values) {
            addCriterion("NRS_TTXZ_QT in", values, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtNotIn(List<String> values) {
            addCriterion("NRS_TTXZ_QT not in", values, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtBetween(String value1, String value2) {
            addCriterion("NRS_TTXZ_QT between", value1, value2, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtxzQtNotBetween(String value1, String value2) {
            addCriterion("NRS_TTXZ_QT not between", value1, value2, "nrsTtxzQt");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjIsNull() {
            addCriterion("NRS_TTSJ is null");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjIsNotNull() {
            addCriterion("NRS_TTSJ is not null");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjEqualTo(String value) {
            addCriterion("NRS_TTSJ =", value, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjNotEqualTo(String value) {
            addCriterion("NRS_TTSJ <>", value, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjGreaterThan(String value) {
            addCriterion("NRS_TTSJ >", value, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjGreaterThanOrEqualTo(String value) {
            addCriterion("NRS_TTSJ >=", value, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjLessThan(String value) {
            addCriterion("NRS_TTSJ <", value, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjLessThanOrEqualTo(String value) {
            addCriterion("NRS_TTSJ <=", value, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjLike(String value) {
            addCriterion("NRS_TTSJ like", value, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjNotLike(String value) {
            addCriterion("NRS_TTSJ not like", value, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjIn(List<String> values) {
            addCriterion("NRS_TTSJ in", values, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjNotIn(List<String> values) {
            addCriterion("NRS_TTSJ not in", values, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjBetween(String value1, String value2) {
            addCriterion("NRS_TTSJ between", value1, value2, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsTtsjNotBetween(String value1, String value2) {
            addCriterion("NRS_TTSJ not between", value1, value2, "nrsTtsj");
            return (Criteria) this;
        }

        public Criteria andNrsScoIsNull() {
            addCriterion("NRS_SCO is null");
            return (Criteria) this;
        }

        public Criteria andNrsScoIsNotNull() {
            addCriterion("NRS_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andNrsScoEqualTo(Long value) {
            addCriterion("NRS_SCO =", value, "nrsSco");
            return (Criteria) this;
        }

        public Criteria andNrsScoNotEqualTo(Long value) {
            addCriterion("NRS_SCO <>", value, "nrsSco");
            return (Criteria) this;
        }

        public Criteria andNrsScoGreaterThan(Long value) {
            addCriterion("NRS_SCO >", value, "nrsSco");
            return (Criteria) this;
        }

        public Criteria andNrsScoGreaterThanOrEqualTo(Long value) {
            addCriterion("NRS_SCO >=", value, "nrsSco");
            return (Criteria) this;
        }

        public Criteria andNrsScoLessThan(Long value) {
            addCriterion("NRS_SCO <", value, "nrsSco");
            return (Criteria) this;
        }

        public Criteria andNrsScoLessThanOrEqualTo(Long value) {
            addCriterion("NRS_SCO <=", value, "nrsSco");
            return (Criteria) this;
        }

        public Criteria andNrsScoIn(List<Long> values) {
            addCriterion("NRS_SCO in", values, "nrsSco");
            return (Criteria) this;
        }

        public Criteria andNrsScoNotIn(List<Long> values) {
            addCriterion("NRS_SCO not in", values, "nrsSco");
            return (Criteria) this;
        }

        public Criteria andNrsScoBetween(Long value1, Long value2) {
            addCriterion("NRS_SCO between", value1, value2, "nrsSco");
            return (Criteria) this;
        }

        public Criteria andNrsScoNotBetween(Long value1, Long value2) {
            addCriterion("NRS_SCO not between", value1, value2, "nrsSco");
            return (Criteria) this;
        }

        public Criteria andNrsMemoIsNull() {
            addCriterion("NRS_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andNrsMemoIsNotNull() {
            addCriterion("NRS_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andNrsMemoEqualTo(String value) {
            addCriterion("NRS_MEMO =", value, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsMemoNotEqualTo(String value) {
            addCriterion("NRS_MEMO <>", value, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsMemoGreaterThan(String value) {
            addCriterion("NRS_MEMO >", value, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsMemoGreaterThanOrEqualTo(String value) {
            addCriterion("NRS_MEMO >=", value, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsMemoLessThan(String value) {
            addCriterion("NRS_MEMO <", value, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsMemoLessThanOrEqualTo(String value) {
            addCriterion("NRS_MEMO <=", value, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsMemoLike(String value) {
            addCriterion("NRS_MEMO like", value, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsMemoNotLike(String value) {
            addCriterion("NRS_MEMO not like", value, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsMemoIn(List<String> values) {
            addCriterion("NRS_MEMO in", values, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsMemoNotIn(List<String> values) {
            addCriterion("NRS_MEMO not in", values, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsMemoBetween(String value1, String value2) {
            addCriterion("NRS_MEMO between", value1, value2, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsMemoNotBetween(String value1, String value2) {
            addCriterion("NRS_MEMO not between", value1, value2, "nrsMemo");
            return (Criteria) this;
        }

        public Criteria andNrsDatIsNull() {
            addCriterion("NRS_DAT is null");
            return (Criteria) this;
        }

        public Criteria andNrsDatIsNotNull() {
            addCriterion("NRS_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andNrsDatEqualTo(Date value) {
            addCriterion("NRS_DAT =", value, "nrsDat");
            return (Criteria) this;
        }

        public Criteria andNrsDatNotEqualTo(Date value) {
            addCriterion("NRS_DAT <>", value, "nrsDat");
            return (Criteria) this;
        }

        public Criteria andNrsDatGreaterThan(Date value) {
            addCriterion("NRS_DAT >", value, "nrsDat");
            return (Criteria) this;
        }

        public Criteria andNrsDatGreaterThanOrEqualTo(Date value) {
            addCriterion("NRS_DAT >=", value, "nrsDat");
            return (Criteria) this;
        }

        public Criteria andNrsDatLessThan(Date value) {
            addCriterion("NRS_DAT <", value, "nrsDat");
            return (Criteria) this;
        }

        public Criteria andNrsDatLessThanOrEqualTo(Date value) {
            addCriterion("NRS_DAT <=", value, "nrsDat");
            return (Criteria) this;
        }

        public Criteria andNrsDatIn(List<Date> values) {
            addCriterion("NRS_DAT in", values, "nrsDat");
            return (Criteria) this;
        }

        public Criteria andNrsDatNotIn(List<Date> values) {
            addCriterion("NRS_DAT not in", values, "nrsDat");
            return (Criteria) this;
        }

        public Criteria andNrsDatBetween(Date value1, Date value2) {
            addCriterion("NRS_DAT between", value1, value2, "nrsDat");
            return (Criteria) this;
        }

        public Criteria andNrsDatNotBetween(Date value1, Date value2) {
            addCriterion("NRS_DAT not between", value1, value2, "nrsDat");
            return (Criteria) this;
        }

        public Criteria andNrsStatusIsNull() {
            addCriterion("NRS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andNrsStatusIsNotNull() {
            addCriterion("NRS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andNrsStatusEqualTo(String value) {
            addCriterion("NRS_STATUS =", value, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsStatusNotEqualTo(String value) {
            addCriterion("NRS_STATUS <>", value, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsStatusGreaterThan(String value) {
            addCriterion("NRS_STATUS >", value, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("NRS_STATUS >=", value, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsStatusLessThan(String value) {
            addCriterion("NRS_STATUS <", value, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsStatusLessThanOrEqualTo(String value) {
            addCriterion("NRS_STATUS <=", value, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsStatusLike(String value) {
            addCriterion("NRS_STATUS like", value, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsStatusNotLike(String value) {
            addCriterion("NRS_STATUS not like", value, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsStatusIn(List<String> values) {
            addCriterion("NRS_STATUS in", values, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsStatusNotIn(List<String> values) {
            addCriterion("NRS_STATUS not in", values, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsStatusBetween(String value1, String value2) {
            addCriterion("NRS_STATUS between", value1, value2, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsStatusNotBetween(String value1, String value2) {
            addCriterion("NRS_STATUS not between", value1, value2, "nrsStatus");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzIsNull() {
            addCriterion("NRS_TTKZ is null");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzIsNotNull() {
            addCriterion("NRS_TTKZ is not null");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzEqualTo(String value) {
            addCriterion("NRS_TTKZ =", value, "nrsTtkz");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzNotEqualTo(String value) {
            addCriterion("NRS_TTKZ <>", value, "nrsTtkz");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzGreaterThan(String value) {
            addCriterion("NRS_TTKZ >", value, "nrsTtkz");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzGreaterThanOrEqualTo(String value) {
            addCriterion("NRS_TTKZ >=", value, "nrsTtkz");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzLessThan(String value) {
            addCriterion("NRS_TTKZ <", value, "nrsTtkz");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzLessThanOrEqualTo(String value) {
            addCriterion("NRS_TTKZ <=", value, "nrsTtkz");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzLike(String value) {
            addCriterion("NRS_TTKZ like", value, "nrsTtkz");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzNotLike(String value) {
            addCriterion("NRS_TTKZ not like", value, "nrsTtkz");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzIn(List<String> values) {
            addCriterion("NRS_TTKZ in", values, "nrsTtkz");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzNotIn(List<String> values) {
            addCriterion("NRS_TTKZ not in", values, "nrsTtkz");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzBetween(String value1, String value2) {
            addCriterion("NRS_TTKZ between", value1, value2, "nrsTtkz");
            return (Criteria) this;
        }

        public Criteria andNrsTtkzNotBetween(String value1, String value2) {
            addCriterion("NRS_TTKZ not between", value1, value2, "nrsTtkz");
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

        public Criteria andTtpfTypeCodIsNull() {
            addCriterion("TTPF_TYPE_COD is null");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodIsNotNull() {
            addCriterion("TTPF_TYPE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodEqualTo(String value) {
            addCriterion("TTPF_TYPE_COD =", value, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodNotEqualTo(String value) {
            addCriterion("TTPF_TYPE_COD <>", value, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodGreaterThan(String value) {
            addCriterion("TTPF_TYPE_COD >", value, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodGreaterThanOrEqualTo(String value) {
            addCriterion("TTPF_TYPE_COD >=", value, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodLessThan(String value) {
            addCriterion("TTPF_TYPE_COD <", value, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodLessThanOrEqualTo(String value) {
            addCriterion("TTPF_TYPE_COD <=", value, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodLike(String value) {
            addCriterion("TTPF_TYPE_COD like", value, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodNotLike(String value) {
            addCriterion("TTPF_TYPE_COD not like", value, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodIn(List<String> values) {
            addCriterion("TTPF_TYPE_COD in", values, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodNotIn(List<String> values) {
            addCriterion("TTPF_TYPE_COD not in", values, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodBetween(String value1, String value2) {
            addCriterion("TTPF_TYPE_COD between", value1, value2, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfTypeCodNotBetween(String value1, String value2) {
            addCriterion("TTPF_TYPE_COD not between", value1, value2, "ttpfTypeCod");
            return (Criteria) this;
        }

        public Criteria andTtpfNrIsNull() {
            addCriterion("TTPF_NR is null");
            return (Criteria) this;
        }

        public Criteria andTtpfNrIsNotNull() {
            addCriterion("TTPF_NR is not null");
            return (Criteria) this;
        }

        public Criteria andTtpfNrEqualTo(String value) {
            addCriterion("TTPF_NR =", value, "ttpfNr");
            return (Criteria) this;
        }

        public Criteria andTtpfNrNotEqualTo(String value) {
            addCriterion("TTPF_NR <>", value, "ttpfNr");
            return (Criteria) this;
        }

        public Criteria andTtpfNrGreaterThan(String value) {
            addCriterion("TTPF_NR >", value, "ttpfNr");
            return (Criteria) this;
        }

        public Criteria andTtpfNrGreaterThanOrEqualTo(String value) {
            addCriterion("TTPF_NR >=", value, "ttpfNr");
            return (Criteria) this;
        }

        public Criteria andTtpfNrLessThan(String value) {
            addCriterion("TTPF_NR <", value, "ttpfNr");
            return (Criteria) this;
        }

        public Criteria andTtpfNrLessThanOrEqualTo(String value) {
            addCriterion("TTPF_NR <=", value, "ttpfNr");
            return (Criteria) this;
        }

        public Criteria andTtpfNrLike(String value) {
            addCriterion("TTPF_NR like", value, "ttpfNr");
            return (Criteria) this;
        }

        public Criteria andTtpfNrNotLike(String value) {
            addCriterion("TTPF_NR not like", value, "ttpfNr");
            return (Criteria) this;
        }

        public Criteria andTtpfNrIn(List<String> values) {
            addCriterion("TTPF_NR in", values, "ttpfNr");
            return (Criteria) this;
        }

        public Criteria andTtpfNrNotIn(List<String> values) {
            addCriterion("TTPF_NR not in", values, "ttpfNr");
            return (Criteria) this;
        }

        public Criteria andTtpfNrBetween(String value1, String value2) {
            addCriterion("TTPF_NR between", value1, value2, "ttpfNr");
            return (Criteria) this;
        }

        public Criteria andTtpfNrNotBetween(String value1, String value2) {
            addCriterion("TTPF_NR not between", value1, value2, "ttpfNr");
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