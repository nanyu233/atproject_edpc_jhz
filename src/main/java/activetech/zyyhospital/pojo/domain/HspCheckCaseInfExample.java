package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCheckCaseInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCheckCaseInfExample() {
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

        public Criteria andEmgSeqCheckIsNull() {
            addCriterion("EMG_SEQ_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckIsNotNull() {
            addCriterion("EMG_SEQ_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckEqualTo(String value) {
            addCriterion("EMG_SEQ_CHECK =", value, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckNotEqualTo(String value) {
            addCriterion("EMG_SEQ_CHECK <>", value, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckGreaterThan(String value) {
            addCriterion("EMG_SEQ_CHECK >", value, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ_CHECK >=", value, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckLessThan(String value) {
            addCriterion("EMG_SEQ_CHECK <", value, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckLessThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ_CHECK <=", value, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckLike(String value) {
            addCriterion("EMG_SEQ_CHECK like", value, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckNotLike(String value) {
            addCriterion("EMG_SEQ_CHECK not like", value, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckIn(List<String> values) {
            addCriterion("EMG_SEQ_CHECK in", values, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckNotIn(List<String> values) {
            addCriterion("EMG_SEQ_CHECK not in", values, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckBetween(String value1, String value2) {
            addCriterion("EMG_SEQ_CHECK between", value1, value2, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCheckNotBetween(String value1, String value2) {
            addCriterion("EMG_SEQ_CHECK not between", value1, value2, "emgSeqCheck");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodIsNull() {
            addCriterion("CHECK_LGSY_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodIsNotNull() {
            addCriterion("CHECK_LGSY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodEqualTo(String value) {
            addCriterion("CHECK_LGSY_COD =", value, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodNotEqualTo(String value) {
            addCriterion("CHECK_LGSY_COD <>", value, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodGreaterThan(String value) {
            addCriterion("CHECK_LGSY_COD >", value, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_LGSY_COD >=", value, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodLessThan(String value) {
            addCriterion("CHECK_LGSY_COD <", value, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_LGSY_COD <=", value, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodLike(String value) {
            addCriterion("CHECK_LGSY_COD like", value, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodNotLike(String value) {
            addCriterion("CHECK_LGSY_COD not like", value, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodIn(List<String> values) {
            addCriterion("CHECK_LGSY_COD in", values, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodNotIn(List<String> values) {
            addCriterion("CHECK_LGSY_COD not in", values, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodBetween(String value1, String value2) {
            addCriterion("CHECK_LGSY_COD between", value1, value2, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLgsyCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_LGSY_COD not between", value1, value2, "checkLgsyCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodIsNull() {
            addCriterion("CHECK_LQBL_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodIsNotNull() {
            addCriterion("CHECK_LQBL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodEqualTo(String value) {
            addCriterion("CHECK_LQBL_COD =", value, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodNotEqualTo(String value) {
            addCriterion("CHECK_LQBL_COD <>", value, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodGreaterThan(String value) {
            addCriterion("CHECK_LQBL_COD >", value, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_LQBL_COD >=", value, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodLessThan(String value) {
            addCriterion("CHECK_LQBL_COD <", value, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_LQBL_COD <=", value, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodLike(String value) {
            addCriterion("CHECK_LQBL_COD like", value, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodNotLike(String value) {
            addCriterion("CHECK_LQBL_COD not like", value, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodIn(List<String> values) {
            addCriterion("CHECK_LQBL_COD in", values, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodNotIn(List<String> values) {
            addCriterion("CHECK_LQBL_COD not in", values, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodBetween(String value1, String value2) {
            addCriterion("CHECK_LQBL_COD between", value1, value2, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckLqblCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_LQBL_COD not between", value1, value2, "checkLqblCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodIsNull() {
            addCriterion("CHECK_BCJL_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodIsNotNull() {
            addCriterion("CHECK_BCJL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodEqualTo(String value) {
            addCriterion("CHECK_BCJL_COD =", value, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodNotEqualTo(String value) {
            addCriterion("CHECK_BCJL_COD <>", value, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodGreaterThan(String value) {
            addCriterion("CHECK_BCJL_COD >", value, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_BCJL_COD >=", value, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodLessThan(String value) {
            addCriterion("CHECK_BCJL_COD <", value, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_BCJL_COD <=", value, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodLike(String value) {
            addCriterion("CHECK_BCJL_COD like", value, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodNotLike(String value) {
            addCriterion("CHECK_BCJL_COD not like", value, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodIn(List<String> values) {
            addCriterion("CHECK_BCJL_COD in", values, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodNotIn(List<String> values) {
            addCriterion("CHECK_BCJL_COD not in", values, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodBetween(String value1, String value2) {
            addCriterion("CHECK_BCJL_COD between", value1, value2, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckBcjlCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_BCJL_COD not between", value1, value2, "checkBcjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodIsNull() {
            addCriterion("CHECK_SSCZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodIsNotNull() {
            addCriterion("CHECK_SSCZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodEqualTo(String value) {
            addCriterion("CHECK_SSCZ_COD =", value, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodNotEqualTo(String value) {
            addCriterion("CHECK_SSCZ_COD <>", value, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodGreaterThan(String value) {
            addCriterion("CHECK_SSCZ_COD >", value, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_SSCZ_COD >=", value, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodLessThan(String value) {
            addCriterion("CHECK_SSCZ_COD <", value, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_SSCZ_COD <=", value, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodLike(String value) {
            addCriterion("CHECK_SSCZ_COD like", value, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodNotLike(String value) {
            addCriterion("CHECK_SSCZ_COD not like", value, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodIn(List<String> values) {
            addCriterion("CHECK_SSCZ_COD in", values, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodNotIn(List<String> values) {
            addCriterion("CHECK_SSCZ_COD not in", values, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodBetween(String value1, String value2) {
            addCriterion("CHECK_SSCZ_COD between", value1, value2, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckSsczCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_SSCZ_COD not between", value1, value2, "checkSsczCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodIsNull() {
            addCriterion("CHECK_HZJL_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodIsNotNull() {
            addCriterion("CHECK_HZJL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodEqualTo(String value) {
            addCriterion("CHECK_HZJL_COD =", value, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodNotEqualTo(String value) {
            addCriterion("CHECK_HZJL_COD <>", value, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodGreaterThan(String value) {
            addCriterion("CHECK_HZJL_COD >", value, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_HZJL_COD >=", value, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodLessThan(String value) {
            addCriterion("CHECK_HZJL_COD <", value, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_HZJL_COD <=", value, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodLike(String value) {
            addCriterion("CHECK_HZJL_COD like", value, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodNotLike(String value) {
            addCriterion("CHECK_HZJL_COD not like", value, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodIn(List<String> values) {
            addCriterion("CHECK_HZJL_COD in", values, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodNotIn(List<String> values) {
            addCriterion("CHECK_HZJL_COD not in", values, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodBetween(String value1, String value2) {
            addCriterion("CHECK_HZJL_COD between", value1, value2, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHzjlCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_HZJL_COD not between", value1, value2, "checkHzjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodIsNull() {
            addCriterion("CHECK_SWJL_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodIsNotNull() {
            addCriterion("CHECK_SWJL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodEqualTo(String value) {
            addCriterion("CHECK_SWJL_COD =", value, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodNotEqualTo(String value) {
            addCriterion("CHECK_SWJL_COD <>", value, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodGreaterThan(String value) {
            addCriterion("CHECK_SWJL_COD >", value, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_SWJL_COD >=", value, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodLessThan(String value) {
            addCriterion("CHECK_SWJL_COD <", value, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_SWJL_COD <=", value, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodLike(String value) {
            addCriterion("CHECK_SWJL_COD like", value, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodNotLike(String value) {
            addCriterion("CHECK_SWJL_COD not like", value, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodIn(List<String> values) {
            addCriterion("CHECK_SWJL_COD in", values, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodNotIn(List<String> values) {
            addCriterion("CHECK_SWJL_COD not in", values, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodBetween(String value1, String value2) {
            addCriterion("CHECK_SWJL_COD between", value1, value2, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckSwjlCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_SWJL_COD not between", value1, value2, "checkSwjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodIsNull() {
            addCriterion("CHECK_CGJL_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodIsNotNull() {
            addCriterion("CHECK_CGJL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodEqualTo(String value) {
            addCriterion("CHECK_CGJL_COD =", value, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodNotEqualTo(String value) {
            addCriterion("CHECK_CGJL_COD <>", value, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodGreaterThan(String value) {
            addCriterion("CHECK_CGJL_COD >", value, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_CGJL_COD >=", value, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodLessThan(String value) {
            addCriterion("CHECK_CGJL_COD <", value, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_CGJL_COD <=", value, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodLike(String value) {
            addCriterion("CHECK_CGJL_COD like", value, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodNotLike(String value) {
            addCriterion("CHECK_CGJL_COD not like", value, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodIn(List<String> values) {
            addCriterion("CHECK_CGJL_COD in", values, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodNotIn(List<String> values) {
            addCriterion("CHECK_CGJL_COD not in", values, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodBetween(String value1, String value2) {
            addCriterion("CHECK_CGJL_COD between", value1, value2, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckCgjlCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_CGJL_COD not between", value1, value2, "checkCgjlCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodIsNull() {
            addCriterion("CHECK_ZQTY_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodIsNotNull() {
            addCriterion("CHECK_ZQTY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodEqualTo(String value) {
            addCriterion("CHECK_ZQTY_COD =", value, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodNotEqualTo(String value) {
            addCriterion("CHECK_ZQTY_COD <>", value, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodGreaterThan(String value) {
            addCriterion("CHECK_ZQTY_COD >", value, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_ZQTY_COD >=", value, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodLessThan(String value) {
            addCriterion("CHECK_ZQTY_COD <", value, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_ZQTY_COD <=", value, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodLike(String value) {
            addCriterion("CHECK_ZQTY_COD like", value, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodNotLike(String value) {
            addCriterion("CHECK_ZQTY_COD not like", value, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodIn(List<String> values) {
            addCriterion("CHECK_ZQTY_COD in", values, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodNotIn(List<String> values) {
            addCriterion("CHECK_ZQTY_COD not in", values, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodBetween(String value1, String value2) {
            addCriterion("CHECK_ZQTY_COD between", value1, value2, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckZqtyCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_ZQTY_COD not between", value1, value2, "checkZqtyCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodIsNull() {
            addCriterion("CHECK_YZXX_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodIsNotNull() {
            addCriterion("CHECK_YZXX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodEqualTo(String value) {
            addCriterion("CHECK_YZXX_COD =", value, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodNotEqualTo(String value) {
            addCriterion("CHECK_YZXX_COD <>", value, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodGreaterThan(String value) {
            addCriterion("CHECK_YZXX_COD >", value, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_YZXX_COD >=", value, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodLessThan(String value) {
            addCriterion("CHECK_YZXX_COD <", value, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_YZXX_COD <=", value, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodLike(String value) {
            addCriterion("CHECK_YZXX_COD like", value, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodNotLike(String value) {
            addCriterion("CHECK_YZXX_COD not like", value, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodIn(List<String> values) {
            addCriterion("CHECK_YZXX_COD in", values, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodNotIn(List<String> values) {
            addCriterion("CHECK_YZXX_COD not in", values, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodBetween(String value1, String value2) {
            addCriterion("CHECK_YZXX_COD between", value1, value2, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckYzxxCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_YZXX_COD not between", value1, value2, "checkYzxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodIsNull() {
            addCriterion("CHECK_JYXX_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodIsNotNull() {
            addCriterion("CHECK_JYXX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodEqualTo(String value) {
            addCriterion("CHECK_JYXX_COD =", value, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodNotEqualTo(String value) {
            addCriterion("CHECK_JYXX_COD <>", value, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodGreaterThan(String value) {
            addCriterion("CHECK_JYXX_COD >", value, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_JYXX_COD >=", value, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodLessThan(String value) {
            addCriterion("CHECK_JYXX_COD <", value, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_JYXX_COD <=", value, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodLike(String value) {
            addCriterion("CHECK_JYXX_COD like", value, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodNotLike(String value) {
            addCriterion("CHECK_JYXX_COD not like", value, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodIn(List<String> values) {
            addCriterion("CHECK_JYXX_COD in", values, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodNotIn(List<String> values) {
            addCriterion("CHECK_JYXX_COD not in", values, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodBetween(String value1, String value2) {
            addCriterion("CHECK_JYXX_COD between", value1, value2, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJyxxCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_JYXX_COD not between", value1, value2, "checkJyxxCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodIsNull() {
            addCriterion("CHECK_JCBG_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodIsNotNull() {
            addCriterion("CHECK_JCBG_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodEqualTo(String value) {
            addCriterion("CHECK_JCBG_COD =", value, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodNotEqualTo(String value) {
            addCriterion("CHECK_JCBG_COD <>", value, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodGreaterThan(String value) {
            addCriterion("CHECK_JCBG_COD >", value, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_JCBG_COD >=", value, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodLessThan(String value) {
            addCriterion("CHECK_JCBG_COD <", value, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_JCBG_COD <=", value, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodLike(String value) {
            addCriterion("CHECK_JCBG_COD like", value, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodNotLike(String value) {
            addCriterion("CHECK_JCBG_COD not like", value, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodIn(List<String> values) {
            addCriterion("CHECK_JCBG_COD in", values, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodNotIn(List<String> values) {
            addCriterion("CHECK_JCBG_COD not in", values, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodBetween(String value1, String value2) {
            addCriterion("CHECK_JCBG_COD between", value1, value2, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckJcbgCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_JCBG_COD not between", value1, value2, "checkJcbgCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodIsNull() {
            addCriterion("CHECK_TWD_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodIsNotNull() {
            addCriterion("CHECK_TWD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodEqualTo(String value) {
            addCriterion("CHECK_TWD_COD =", value, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodNotEqualTo(String value) {
            addCriterion("CHECK_TWD_COD <>", value, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodGreaterThan(String value) {
            addCriterion("CHECK_TWD_COD >", value, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_TWD_COD >=", value, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodLessThan(String value) {
            addCriterion("CHECK_TWD_COD <", value, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_TWD_COD <=", value, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodLike(String value) {
            addCriterion("CHECK_TWD_COD like", value, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodNotLike(String value) {
            addCriterion("CHECK_TWD_COD not like", value, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodIn(List<String> values) {
            addCriterion("CHECK_TWD_COD in", values, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodNotIn(List<String> values) {
            addCriterion("CHECK_TWD_COD not in", values, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodBetween(String value1, String value2) {
            addCriterion("CHECK_TWD_COD between", value1, value2, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckTwdCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_TWD_COD not between", value1, value2, "checkTwdCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodIsNull() {
            addCriterion("CHECK_HLJL_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodIsNotNull() {
            addCriterion("CHECK_HLJL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodEqualTo(String value) {
            addCriterion("CHECK_HLJL_COD =", value, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodNotEqualTo(String value) {
            addCriterion("CHECK_HLJL_COD <>", value, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodGreaterThan(String value) {
            addCriterion("CHECK_HLJL_COD >", value, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_HLJL_COD >=", value, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodLessThan(String value) {
            addCriterion("CHECK_HLJL_COD <", value, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_HLJL_COD <=", value, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodLike(String value) {
            addCriterion("CHECK_HLJL_COD like", value, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodNotLike(String value) {
            addCriterion("CHECK_HLJL_COD not like", value, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodIn(List<String> values) {
            addCriterion("CHECK_HLJL_COD in", values, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodNotIn(List<String> values) {
            addCriterion("CHECK_HLJL_COD not in", values, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodBetween(String value1, String value2) {
            addCriterion("CHECK_HLJL_COD between", value1, value2, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHljlCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_HLJL_COD not between", value1, value2, "checkHljlCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodIsNull() {
            addCriterion("CHECK_HLPG_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodIsNotNull() {
            addCriterion("CHECK_HLPG_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodEqualTo(String value) {
            addCriterion("CHECK_HLPG_COD =", value, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodNotEqualTo(String value) {
            addCriterion("CHECK_HLPG_COD <>", value, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodGreaterThan(String value) {
            addCriterion("CHECK_HLPG_COD >", value, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_HLPG_COD >=", value, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodLessThan(String value) {
            addCriterion("CHECK_HLPG_COD <", value, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_HLPG_COD <=", value, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodLike(String value) {
            addCriterion("CHECK_HLPG_COD like", value, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodNotLike(String value) {
            addCriterion("CHECK_HLPG_COD not like", value, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodIn(List<String> values) {
            addCriterion("CHECK_HLPG_COD in", values, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodNotIn(List<String> values) {
            addCriterion("CHECK_HLPG_COD not in", values, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodBetween(String value1, String value2) {
            addCriterion("CHECK_HLPG_COD between", value1, value2, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckHlpgCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_HLPG_COD not between", value1, value2, "checkHlpgCod");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorIsNull() {
            addCriterion("CHECK_DOCTOR is null");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorIsNotNull() {
            addCriterion("CHECK_DOCTOR is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorEqualTo(String value) {
            addCriterion("CHECK_DOCTOR =", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNotEqualTo(String value) {
            addCriterion("CHECK_DOCTOR <>", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorGreaterThan(String value) {
            addCriterion("CHECK_DOCTOR >", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_DOCTOR >=", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorLessThan(String value) {
            addCriterion("CHECK_DOCTOR <", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorLessThanOrEqualTo(String value) {
            addCriterion("CHECK_DOCTOR <=", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorLike(String value) {
            addCriterion("CHECK_DOCTOR like", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNotLike(String value) {
            addCriterion("CHECK_DOCTOR not like", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorIn(List<String> values) {
            addCriterion("CHECK_DOCTOR in", values, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNotIn(List<String> values) {
            addCriterion("CHECK_DOCTOR not in", values, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorBetween(String value1, String value2) {
            addCriterion("CHECK_DOCTOR between", value1, value2, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNotBetween(String value1, String value2) {
            addCriterion("CHECK_DOCTOR not between", value1, value2, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckNurseIsNull() {
            addCriterion("CHECK_NURSE is null");
            return (Criteria) this;
        }

        public Criteria andCheckNurseIsNotNull() {
            addCriterion("CHECK_NURSE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNurseEqualTo(String value) {
            addCriterion("CHECK_NURSE =", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseNotEqualTo(String value) {
            addCriterion("CHECK_NURSE <>", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseGreaterThan(String value) {
            addCriterion("CHECK_NURSE >", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_NURSE >=", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseLessThan(String value) {
            addCriterion("CHECK_NURSE <", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseLessThanOrEqualTo(String value) {
            addCriterion("CHECK_NURSE <=", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseLike(String value) {
            addCriterion("CHECK_NURSE like", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseNotLike(String value) {
            addCriterion("CHECK_NURSE not like", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseIn(List<String> values) {
            addCriterion("CHECK_NURSE in", values, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseNotIn(List<String> values) {
            addCriterion("CHECK_NURSE not in", values, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseBetween(String value1, String value2) {
            addCriterion("CHECK_NURSE between", value1, value2, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseNotBetween(String value1, String value2) {
            addCriterion("CHECK_NURSE not between", value1, value2, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatIsNull() {
            addCriterion("CHECK_DOC_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatIsNotNull() {
            addCriterion("CHECK_DOC_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatEqualTo(Date value) {
            addCriterion("CHECK_DOC_DAT =", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatNotEqualTo(Date value) {
            addCriterion("CHECK_DOC_DAT <>", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatGreaterThan(Date value) {
            addCriterion("CHECK_DOC_DAT >", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_DOC_DAT >=", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatLessThan(Date value) {
            addCriterion("CHECK_DOC_DAT <", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_DOC_DAT <=", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatIn(List<Date> values) {
            addCriterion("CHECK_DOC_DAT in", values, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatNotIn(List<Date> values) {
            addCriterion("CHECK_DOC_DAT not in", values, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatBetween(Date value1, Date value2) {
            addCriterion("CHECK_DOC_DAT between", value1, value2, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_DOC_DAT not between", value1, value2, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatIsNull() {
            addCriterion("CHECK_NURSE_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatIsNotNull() {
            addCriterion("CHECK_NURSE_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatEqualTo(Date value) {
            addCriterion("CHECK_NURSE_DAT =", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatNotEqualTo(Date value) {
            addCriterion("CHECK_NURSE_DAT <>", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatGreaterThan(Date value) {
            addCriterion("CHECK_NURSE_DAT >", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_NURSE_DAT >=", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatLessThan(Date value) {
            addCriterion("CHECK_NURSE_DAT <", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_NURSE_DAT <=", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatIn(List<Date> values) {
            addCriterion("CHECK_NURSE_DAT in", values, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatNotIn(List<Date> values) {
            addCriterion("CHECK_NURSE_DAT not in", values, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatBetween(Date value1, Date value2) {
            addCriterion("CHECK_NURSE_DAT between", value1, value2, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_NURSE_DAT not between", value1, value2, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusIsNull() {
            addCriterion("CHECK_DOC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusIsNotNull() {
            addCriterion("CHECK_DOC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusEqualTo(String value) {
            addCriterion("CHECK_DOC_STATUS =", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusNotEqualTo(String value) {
            addCriterion("CHECK_DOC_STATUS <>", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusGreaterThan(String value) {
            addCriterion("CHECK_DOC_STATUS >", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_DOC_STATUS >=", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusLessThan(String value) {
            addCriterion("CHECK_DOC_STATUS <", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_DOC_STATUS <=", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusLike(String value) {
            addCriterion("CHECK_DOC_STATUS like", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusNotLike(String value) {
            addCriterion("CHECK_DOC_STATUS not like", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusIn(List<String> values) {
            addCriterion("CHECK_DOC_STATUS in", values, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusNotIn(List<String> values) {
            addCriterion("CHECK_DOC_STATUS not in", values, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusBetween(String value1, String value2) {
            addCriterion("CHECK_DOC_STATUS between", value1, value2, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_DOC_STATUS not between", value1, value2, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusIsNull() {
            addCriterion("CHECK_NUR_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusIsNotNull() {
            addCriterion("CHECK_NUR_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusEqualTo(String value) {
            addCriterion("CHECK_NUR_STATUS =", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusNotEqualTo(String value) {
            addCriterion("CHECK_NUR_STATUS <>", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusGreaterThan(String value) {
            addCriterion("CHECK_NUR_STATUS >", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_NUR_STATUS >=", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusLessThan(String value) {
            addCriterion("CHECK_NUR_STATUS <", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_NUR_STATUS <=", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusLike(String value) {
            addCriterion("CHECK_NUR_STATUS like", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusNotLike(String value) {
            addCriterion("CHECK_NUR_STATUS not like", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusIn(List<String> values) {
            addCriterion("CHECK_NUR_STATUS in", values, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusNotIn(List<String> values) {
            addCriterion("CHECK_NUR_STATUS not in", values, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusBetween(String value1, String value2) {
            addCriterion("CHECK_NUR_STATUS between", value1, value2, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_NUR_STATUS not between", value1, value2, "checkNurStatus");
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

        public Criteria andCreateNbrIsNull() {
            addCriterion("CREATE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andCreateNbrIsNotNull() {
            addCriterion("CREATE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNbrEqualTo(String value) {
            addCriterion("CREATE_NBR =", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrNotEqualTo(String value) {
            addCriterion("CREATE_NBR <>", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrGreaterThan(String value) {
            addCriterion("CREATE_NBR >", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_NBR >=", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrLessThan(String value) {
            addCriterion("CREATE_NBR <", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrLessThanOrEqualTo(String value) {
            addCriterion("CREATE_NBR <=", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrLike(String value) {
            addCriterion("CREATE_NBR like", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrNotLike(String value) {
            addCriterion("CREATE_NBR not like", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrIn(List<String> values) {
            addCriterion("CREATE_NBR in", values, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrNotIn(List<String> values) {
            addCriterion("CREATE_NBR not in", values, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrBetween(String value1, String value2) {
            addCriterion("CREATE_NBR between", value1, value2, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrNotBetween(String value1, String value2) {
            addCriterion("CREATE_NBR not between", value1, value2, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgIsNull() {
            addCriterion("CHECK_DOC_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgIsNotNull() {
            addCriterion("CHECK_DOC_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgEqualTo(String value) {
            addCriterion("CHECK_DOC_FLG =", value, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgNotEqualTo(String value) {
            addCriterion("CHECK_DOC_FLG <>", value, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgGreaterThan(String value) {
            addCriterion("CHECK_DOC_FLG >", value, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_DOC_FLG >=", value, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgLessThan(String value) {
            addCriterion("CHECK_DOC_FLG <", value, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgLessThanOrEqualTo(String value) {
            addCriterion("CHECK_DOC_FLG <=", value, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgLike(String value) {
            addCriterion("CHECK_DOC_FLG like", value, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgNotLike(String value) {
            addCriterion("CHECK_DOC_FLG not like", value, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgIn(List<String> values) {
            addCriterion("CHECK_DOC_FLG in", values, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgNotIn(List<String> values) {
            addCriterion("CHECK_DOC_FLG not in", values, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgBetween(String value1, String value2) {
            addCriterion("CHECK_DOC_FLG between", value1, value2, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckDocFlgNotBetween(String value1, String value2) {
            addCriterion("CHECK_DOC_FLG not between", value1, value2, "checkDocFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgIsNull() {
            addCriterion("CHECK_NURSE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgIsNotNull() {
            addCriterion("CHECK_NURSE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgEqualTo(String value) {
            addCriterion("CHECK_NURSE_FLG =", value, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgNotEqualTo(String value) {
            addCriterion("CHECK_NURSE_FLG <>", value, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgGreaterThan(String value) {
            addCriterion("CHECK_NURSE_FLG >", value, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_NURSE_FLG >=", value, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgLessThan(String value) {
            addCriterion("CHECK_NURSE_FLG <", value, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgLessThanOrEqualTo(String value) {
            addCriterion("CHECK_NURSE_FLG <=", value, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgLike(String value) {
            addCriterion("CHECK_NURSE_FLG like", value, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgNotLike(String value) {
            addCriterion("CHECK_NURSE_FLG not like", value, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgIn(List<String> values) {
            addCriterion("CHECK_NURSE_FLG in", values, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgNotIn(List<String> values) {
            addCriterion("CHECK_NURSE_FLG not in", values, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgBetween(String value1, String value2) {
            addCriterion("CHECK_NURSE_FLG between", value1, value2, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckNurseFlgNotBetween(String value1, String value2) {
            addCriterion("CHECK_NURSE_FLG not between", value1, value2, "checkNurseFlg");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodIsNull() {
            addCriterion("CHECK_PFB_COD is null");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodIsNotNull() {
            addCriterion("CHECK_PFB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodEqualTo(String value) {
            addCriterion("CHECK_PFB_COD =", value, "checkPfbCod");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodNotEqualTo(String value) {
            addCriterion("CHECK_PFB_COD <>", value, "checkPfbCod");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodGreaterThan(String value) {
            addCriterion("CHECK_PFB_COD >", value, "checkPfbCod");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_PFB_COD >=", value, "checkPfbCod");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodLessThan(String value) {
            addCriterion("CHECK_PFB_COD <", value, "checkPfbCod");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodLessThanOrEqualTo(String value) {
            addCriterion("CHECK_PFB_COD <=", value, "checkPfbCod");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodLike(String value) {
            addCriterion("CHECK_PFB_COD like", value, "checkPfbCod");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodNotLike(String value) {
            addCriterion("CHECK_PFB_COD not like", value, "checkPfbCod");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodIn(List<String> values) {
            addCriterion("CHECK_PFB_COD in", values, "checkPfbCod");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodNotIn(List<String> values) {
            addCriterion("CHECK_PFB_COD not in", values, "checkPfbCod");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodBetween(String value1, String value2) {
            addCriterion("CHECK_PFB_COD between", value1, value2, "checkPfbCod");
            return (Criteria) this;
        }

        public Criteria andCheckPfbCodNotBetween(String value1, String value2) {
            addCriterion("CHECK_PFB_COD not between", value1, value2, "checkPfbCod");
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