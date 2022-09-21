package activetech.pda.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCfxxExecExample {
    /**
     * ZJYY.HSP_CFXX_EXEC
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_CFXX_EXEC
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_CFXX_EXEC
     */
    protected List<Criteria> oredCriteria;

    public HspCfxxExecExample() {
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
     * ZJYY.HSP_CFXX_EXEC 2020-06-17
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

        public Criteria andExecSeqIsNull() {
            addCriterion("EXEC_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andExecSeqIsNotNull() {
            addCriterion("EXEC_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andExecSeqEqualTo(String value) {
            addCriterion("EXEC_SEQ =", value, "execSeq");
            return (Criteria) this;
        }

        public Criteria andExecSeqNotEqualTo(String value) {
            addCriterion("EXEC_SEQ <>", value, "execSeq");
            return (Criteria) this;
        }

        public Criteria andExecSeqGreaterThan(String value) {
            addCriterion("EXEC_SEQ >", value, "execSeq");
            return (Criteria) this;
        }

        public Criteria andExecSeqGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_SEQ >=", value, "execSeq");
            return (Criteria) this;
        }

        public Criteria andExecSeqLessThan(String value) {
            addCriterion("EXEC_SEQ <", value, "execSeq");
            return (Criteria) this;
        }

        public Criteria andExecSeqLessThanOrEqualTo(String value) {
            addCriterion("EXEC_SEQ <=", value, "execSeq");
            return (Criteria) this;
        }

        public Criteria andExecSeqLike(String value) {
            addCriterion("EXEC_SEQ like", value, "execSeq");
            return (Criteria) this;
        }

        public Criteria andExecSeqNotLike(String value) {
            addCriterion("EXEC_SEQ not like", value, "execSeq");
            return (Criteria) this;
        }

        public Criteria andExecSeqIn(List<String> values) {
            addCriterion("EXEC_SEQ in", values, "execSeq");
            return (Criteria) this;
        }

        public Criteria andExecSeqNotIn(List<String> values) {
            addCriterion("EXEC_SEQ not in", values, "execSeq");
            return (Criteria) this;
        }

        public Criteria andExecSeqBetween(String value1, String value2) {
            addCriterion("EXEC_SEQ between", value1, value2, "execSeq");
            return (Criteria) this;
        }

        public Criteria andExecSeqNotBetween(String value1, String value2) {
            addCriterion("EXEC_SEQ not between", value1, value2, "execSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqIsNull() {
            addCriterion("DISPOSAL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqIsNotNull() {
            addCriterion("DISPOSAL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqEqualTo(String value) {
            addCriterion("DISPOSAL_SEQ =", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqNotEqualTo(String value) {
            addCriterion("DISPOSAL_SEQ <>", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqGreaterThan(String value) {
            addCriterion("DISPOSAL_SEQ >", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqGreaterThanOrEqualTo(String value) {
            addCriterion("DISPOSAL_SEQ >=", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqLessThan(String value) {
            addCriterion("DISPOSAL_SEQ <", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqLessThanOrEqualTo(String value) {
            addCriterion("DISPOSAL_SEQ <=", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqLike(String value) {
            addCriterion("DISPOSAL_SEQ like", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqNotLike(String value) {
            addCriterion("DISPOSAL_SEQ not like", value, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqIn(List<String> values) {
            addCriterion("DISPOSAL_SEQ in", values, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqNotIn(List<String> values) {
            addCriterion("DISPOSAL_SEQ not in", values, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqBetween(String value1, String value2) {
            addCriterion("DISPOSAL_SEQ between", value1, value2, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDisposalSeqNotBetween(String value1, String value2) {
            addCriterion("DISPOSAL_SEQ not between", value1, value2, "disposalSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqIsNull() {
            addCriterion("DA_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDaSeqIsNotNull() {
            addCriterion("DA_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDaSeqEqualTo(String value) {
            addCriterion("DA_SEQ =", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqNotEqualTo(String value) {
            addCriterion("DA_SEQ <>", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqGreaterThan(String value) {
            addCriterion("DA_SEQ >", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqGreaterThanOrEqualTo(String value) {
            addCriterion("DA_SEQ >=", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqLessThan(String value) {
            addCriterion("DA_SEQ <", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqLessThanOrEqualTo(String value) {
            addCriterion("DA_SEQ <=", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqLike(String value) {
            addCriterion("DA_SEQ like", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqNotLike(String value) {
            addCriterion("DA_SEQ not like", value, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqIn(List<String> values) {
            addCriterion("DA_SEQ in", values, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqNotIn(List<String> values) {
            addCriterion("DA_SEQ not in", values, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqBetween(String value1, String value2) {
            addCriterion("DA_SEQ between", value1, value2, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaSeqNotBetween(String value1, String value2) {
            addCriterion("DA_SEQ not between", value1, value2, "daSeq");
            return (Criteria) this;
        }

        public Criteria andDaNoIsNull() {
            addCriterion("DA_NO is null");
            return (Criteria) this;
        }

        public Criteria andDaNoIsNotNull() {
            addCriterion("DA_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDaNoEqualTo(String value) {
            addCriterion("DA_NO =", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoNotEqualTo(String value) {
            addCriterion("DA_NO <>", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoGreaterThan(String value) {
            addCriterion("DA_NO >", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoGreaterThanOrEqualTo(String value) {
            addCriterion("DA_NO >=", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoLessThan(String value) {
            addCriterion("DA_NO <", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoLessThanOrEqualTo(String value) {
            addCriterion("DA_NO <=", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoLike(String value) {
            addCriterion("DA_NO like", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoNotLike(String value) {
            addCriterion("DA_NO not like", value, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoIn(List<String> values) {
            addCriterion("DA_NO in", values, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoNotIn(List<String> values) {
            addCriterion("DA_NO not in", values, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoBetween(String value1, String value2) {
            addCriterion("DA_NO between", value1, value2, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaNoNotBetween(String value1, String value2) {
            addCriterion("DA_NO not between", value1, value2, "daNo");
            return (Criteria) this;
        }

        public Criteria andDaSubIsNull() {
            addCriterion("DA_SUB is null");
            return (Criteria) this;
        }

        public Criteria andDaSubIsNotNull() {
            addCriterion("DA_SUB is not null");
            return (Criteria) this;
        }

        public Criteria andDaSubEqualTo(String value) {
            addCriterion("DA_SUB =", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubNotEqualTo(String value) {
            addCriterion("DA_SUB <>", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubGreaterThan(String value) {
            addCriterion("DA_SUB >", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubGreaterThanOrEqualTo(String value) {
            addCriterion("DA_SUB >=", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubLessThan(String value) {
            addCriterion("DA_SUB <", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubLessThanOrEqualTo(String value) {
            addCriterion("DA_SUB <=", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubLike(String value) {
            addCriterion("DA_SUB like", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubNotLike(String value) {
            addCriterion("DA_SUB not like", value, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubIn(List<String> values) {
            addCriterion("DA_SUB in", values, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubNotIn(List<String> values) {
            addCriterion("DA_SUB not in", values, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubBetween(String value1, String value2) {
            addCriterion("DA_SUB between", value1, value2, "daSub");
            return (Criteria) this;
        }

        public Criteria andDaSubNotBetween(String value1, String value2) {
            addCriterion("DA_SUB not between", value1, value2, "daSub");
            return (Criteria) this;
        }

        public Criteria andVstCadIsNull() {
            addCriterion("VST_CAD is null");
            return (Criteria) this;
        }

        public Criteria andVstCadIsNotNull() {
            addCriterion("VST_CAD is not null");
            return (Criteria) this;
        }

        public Criteria andVstCadEqualTo(String value) {
            addCriterion("VST_CAD =", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotEqualTo(String value) {
            addCriterion("VST_CAD <>", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadGreaterThan(String value) {
            addCriterion("VST_CAD >", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadGreaterThanOrEqualTo(String value) {
            addCriterion("VST_CAD >=", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLessThan(String value) {
            addCriterion("VST_CAD <", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLessThanOrEqualTo(String value) {
            addCriterion("VST_CAD <=", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLike(String value) {
            addCriterion("VST_CAD like", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotLike(String value) {
            addCriterion("VST_CAD not like", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadIn(List<String> values) {
            addCriterion("VST_CAD in", values, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotIn(List<String> values) {
            addCriterion("VST_CAD not in", values, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadBetween(String value1, String value2) {
            addCriterion("VST_CAD between", value1, value2, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotBetween(String value1, String value2) {
            addCriterion("VST_CAD not between", value1, value2, "vstCad");
            return (Criteria) this;
        }

        public Criteria andExecSrcIsNull() {
            addCriterion("EXEC_SRC is null");
            return (Criteria) this;
        }

        public Criteria andExecSrcIsNotNull() {
            addCriterion("EXEC_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andExecSrcEqualTo(String value) {
            addCriterion("EXEC_SRC =", value, "execSrc");
            return (Criteria) this;
        }

        public Criteria andExecSrcNotEqualTo(String value) {
            addCriterion("EXEC_SRC <>", value, "execSrc");
            return (Criteria) this;
        }

        public Criteria andExecSrcGreaterThan(String value) {
            addCriterion("EXEC_SRC >", value, "execSrc");
            return (Criteria) this;
        }

        public Criteria andExecSrcGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_SRC >=", value, "execSrc");
            return (Criteria) this;
        }

        public Criteria andExecSrcLessThan(String value) {
            addCriterion("EXEC_SRC <", value, "execSrc");
            return (Criteria) this;
        }

        public Criteria andExecSrcLessThanOrEqualTo(String value) {
            addCriterion("EXEC_SRC <=", value, "execSrc");
            return (Criteria) this;
        }

        public Criteria andExecSrcLike(String value) {
            addCriterion("EXEC_SRC like", value, "execSrc");
            return (Criteria) this;
        }

        public Criteria andExecSrcNotLike(String value) {
            addCriterion("EXEC_SRC not like", value, "execSrc");
            return (Criteria) this;
        }

        public Criteria andExecSrcIn(List<String> values) {
            addCriterion("EXEC_SRC in", values, "execSrc");
            return (Criteria) this;
        }

        public Criteria andExecSrcNotIn(List<String> values) {
            addCriterion("EXEC_SRC not in", values, "execSrc");
            return (Criteria) this;
        }

        public Criteria andExecSrcBetween(String value1, String value2) {
            addCriterion("EXEC_SRC between", value1, value2, "execSrc");
            return (Criteria) this;
        }

        public Criteria andExecSrcNotBetween(String value1, String value2) {
            addCriterion("EXEC_SRC not between", value1, value2, "execSrc");
            return (Criteria) this;
        }

        public Criteria andPlanTimeIsNull() {
            addCriterion("PLAN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanTimeIsNotNull() {
            addCriterion("PLAN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTimeEqualTo(Date value) {
            addCriterion("PLAN_TIME =", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotEqualTo(Date value) {
            addCriterion("PLAN_TIME <>", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeGreaterThan(Date value) {
            addCriterion("PLAN_TIME >", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_TIME >=", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeLessThan(Date value) {
            addCriterion("PLAN_TIME <", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_TIME <=", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeIn(List<Date> values) {
            addCriterion("PLAN_TIME in", values, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotIn(List<Date> values) {
            addCriterion("PLAN_TIME not in", values, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeBetween(Date value1, Date value2) {
            addCriterion("PLAN_TIME between", value1, value2, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_TIME not between", value1, value2, "planTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeIsNull() {
            addCriterion("EXEC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExecTimeIsNotNull() {
            addCriterion("EXEC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExecTimeEqualTo(Date value) {
            addCriterion("EXEC_TIME =", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotEqualTo(Date value) {
            addCriterion("EXEC_TIME <>", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeGreaterThan(Date value) {
            addCriterion("EXEC_TIME >", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXEC_TIME >=", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeLessThan(Date value) {
            addCriterion("EXEC_TIME <", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXEC_TIME <=", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeIn(List<Date> values) {
            addCriterion("EXEC_TIME in", values, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotIn(List<Date> values) {
            addCriterion("EXEC_TIME not in", values, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeBetween(Date value1, Date value2) {
            addCriterion("EXEC_TIME between", value1, value2, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXEC_TIME not between", value1, value2, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecUserIsNull() {
            addCriterion("EXEC_USER is null");
            return (Criteria) this;
        }

        public Criteria andExecUserIsNotNull() {
            addCriterion("EXEC_USER is not null");
            return (Criteria) this;
        }

        public Criteria andExecUserEqualTo(String value) {
            addCriterion("EXEC_USER =", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserNotEqualTo(String value) {
            addCriterion("EXEC_USER <>", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserGreaterThan(String value) {
            addCriterion("EXEC_USER >", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_USER >=", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserLessThan(String value) {
            addCriterion("EXEC_USER <", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserLessThanOrEqualTo(String value) {
            addCriterion("EXEC_USER <=", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserLike(String value) {
            addCriterion("EXEC_USER like", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserNotLike(String value) {
            addCriterion("EXEC_USER not like", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserIn(List<String> values) {
            addCriterion("EXEC_USER in", values, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserNotIn(List<String> values) {
            addCriterion("EXEC_USER not in", values, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserBetween(String value1, String value2) {
            addCriterion("EXEC_USER between", value1, value2, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserNotBetween(String value1, String value2) {
            addCriterion("EXEC_USER not between", value1, value2, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserxmIsNull() {
            addCriterion("EXEC_USERXM is null");
            return (Criteria) this;
        }

        public Criteria andExecUserxmIsNotNull() {
            addCriterion("EXEC_USERXM is not null");
            return (Criteria) this;
        }

        public Criteria andExecUserxmEqualTo(String value) {
            addCriterion("EXEC_USERXM =", value, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserxmNotEqualTo(String value) {
            addCriterion("EXEC_USERXM <>", value, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserxmGreaterThan(String value) {
            addCriterion("EXEC_USERXM >", value, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserxmGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_USERXM >=", value, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserxmLessThan(String value) {
            addCriterion("EXEC_USERXM <", value, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserxmLessThanOrEqualTo(String value) {
            addCriterion("EXEC_USERXM <=", value, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserxmLike(String value) {
            addCriterion("EXEC_USERXM like", value, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserxmNotLike(String value) {
            addCriterion("EXEC_USERXM not like", value, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserxmIn(List<String> values) {
            addCriterion("EXEC_USERXM in", values, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserxmNotIn(List<String> values) {
            addCriterion("EXEC_USERXM not in", values, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserxmBetween(String value1, String value2) {
            addCriterion("EXEC_USERXM between", value1, value2, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserxmNotBetween(String value1, String value2) {
            addCriterion("EXEC_USERXM not between", value1, value2, "execUserxm");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondIsNull() {
            addCriterion("EXEC_USER_SECOND is null");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondIsNotNull() {
            addCriterion("EXEC_USER_SECOND is not null");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondEqualTo(String value) {
            addCriterion("EXEC_USER_SECOND =", value, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondNotEqualTo(String value) {
            addCriterion("EXEC_USER_SECOND <>", value, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondGreaterThan(String value) {
            addCriterion("EXEC_USER_SECOND >", value, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_USER_SECOND >=", value, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondLessThan(String value) {
            addCriterion("EXEC_USER_SECOND <", value, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondLessThanOrEqualTo(String value) {
            addCriterion("EXEC_USER_SECOND <=", value, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondLike(String value) {
            addCriterion("EXEC_USER_SECOND like", value, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondNotLike(String value) {
            addCriterion("EXEC_USER_SECOND not like", value, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondIn(List<String> values) {
            addCriterion("EXEC_USER_SECOND in", values, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondNotIn(List<String> values) {
            addCriterion("EXEC_USER_SECOND not in", values, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondBetween(String value1, String value2) {
            addCriterion("EXEC_USER_SECOND between", value1, value2, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserSecondNotBetween(String value1, String value2) {
            addCriterion("EXEC_USER_SECOND not between", value1, value2, "execUserSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondIsNull() {
            addCriterion("EXEC_USERXM_SECOND is null");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondIsNotNull() {
            addCriterion("EXEC_USERXM_SECOND is not null");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondEqualTo(String value) {
            addCriterion("EXEC_USERXM_SECOND =", value, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondNotEqualTo(String value) {
            addCriterion("EXEC_USERXM_SECOND <>", value, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondGreaterThan(String value) {
            addCriterion("EXEC_USERXM_SECOND >", value, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_USERXM_SECOND >=", value, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondLessThan(String value) {
            addCriterion("EXEC_USERXM_SECOND <", value, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondLessThanOrEqualTo(String value) {
            addCriterion("EXEC_USERXM_SECOND <=", value, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondLike(String value) {
            addCriterion("EXEC_USERXM_SECOND like", value, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondNotLike(String value) {
            addCriterion("EXEC_USERXM_SECOND not like", value, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondIn(List<String> values) {
            addCriterion("EXEC_USERXM_SECOND in", values, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondNotIn(List<String> values) {
            addCriterion("EXEC_USERXM_SECOND not in", values, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondBetween(String value1, String value2) {
            addCriterion("EXEC_USERXM_SECOND between", value1, value2, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andExecUserxmSecondNotBetween(String value1, String value2) {
            addCriterion("EXEC_USERXM_SECOND not between", value1, value2, "execUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andFiniTimeIsNull() {
            addCriterion("FINI_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFiniTimeIsNotNull() {
            addCriterion("FINI_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFiniTimeEqualTo(Date value) {
            addCriterion("FINI_TIME =", value, "finiTime");
            return (Criteria) this;
        }

        public Criteria andFiniTimeNotEqualTo(Date value) {
            addCriterion("FINI_TIME <>", value, "finiTime");
            return (Criteria) this;
        }

        public Criteria andFiniTimeGreaterThan(Date value) {
            addCriterion("FINI_TIME >", value, "finiTime");
            return (Criteria) this;
        }

        public Criteria andFiniTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FINI_TIME >=", value, "finiTime");
            return (Criteria) this;
        }

        public Criteria andFiniTimeLessThan(Date value) {
            addCriterion("FINI_TIME <", value, "finiTime");
            return (Criteria) this;
        }

        public Criteria andFiniTimeLessThanOrEqualTo(Date value) {
            addCriterion("FINI_TIME <=", value, "finiTime");
            return (Criteria) this;
        }

        public Criteria andFiniTimeIn(List<Date> values) {
            addCriterion("FINI_TIME in", values, "finiTime");
            return (Criteria) this;
        }

        public Criteria andFiniTimeNotIn(List<Date> values) {
            addCriterion("FINI_TIME not in", values, "finiTime");
            return (Criteria) this;
        }

        public Criteria andFiniTimeBetween(Date value1, Date value2) {
            addCriterion("FINI_TIME between", value1, value2, "finiTime");
            return (Criteria) this;
        }

        public Criteria andFiniTimeNotBetween(Date value1, Date value2) {
            addCriterion("FINI_TIME not between", value1, value2, "finiTime");
            return (Criteria) this;
        }

        public Criteria andFiniUserIsNull() {
            addCriterion("FINI_USER is null");
            return (Criteria) this;
        }

        public Criteria andFiniUserIsNotNull() {
            addCriterion("FINI_USER is not null");
            return (Criteria) this;
        }

        public Criteria andFiniUserEqualTo(String value) {
            addCriterion("FINI_USER =", value, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserNotEqualTo(String value) {
            addCriterion("FINI_USER <>", value, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserGreaterThan(String value) {
            addCriterion("FINI_USER >", value, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserGreaterThanOrEqualTo(String value) {
            addCriterion("FINI_USER >=", value, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserLessThan(String value) {
            addCriterion("FINI_USER <", value, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserLessThanOrEqualTo(String value) {
            addCriterion("FINI_USER <=", value, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserLike(String value) {
            addCriterion("FINI_USER like", value, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserNotLike(String value) {
            addCriterion("FINI_USER not like", value, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserIn(List<String> values) {
            addCriterion("FINI_USER in", values, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserNotIn(List<String> values) {
            addCriterion("FINI_USER not in", values, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserBetween(String value1, String value2) {
            addCriterion("FINI_USER between", value1, value2, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserNotBetween(String value1, String value2) {
            addCriterion("FINI_USER not between", value1, value2, "finiUser");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmIsNull() {
            addCriterion("FINI_USERXM is null");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmIsNotNull() {
            addCriterion("FINI_USERXM is not null");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmEqualTo(String value) {
            addCriterion("FINI_USERXM =", value, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmNotEqualTo(String value) {
            addCriterion("FINI_USERXM <>", value, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmGreaterThan(String value) {
            addCriterion("FINI_USERXM >", value, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmGreaterThanOrEqualTo(String value) {
            addCriterion("FINI_USERXM >=", value, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmLessThan(String value) {
            addCriterion("FINI_USERXM <", value, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmLessThanOrEqualTo(String value) {
            addCriterion("FINI_USERXM <=", value, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmLike(String value) {
            addCriterion("FINI_USERXM like", value, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmNotLike(String value) {
            addCriterion("FINI_USERXM not like", value, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmIn(List<String> values) {
            addCriterion("FINI_USERXM in", values, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmNotIn(List<String> values) {
            addCriterion("FINI_USERXM not in", values, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmBetween(String value1, String value2) {
            addCriterion("FINI_USERXM between", value1, value2, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andFiniUserxmNotBetween(String value1, String value2) {
            addCriterion("FINI_USERXM not between", value1, value2, "finiUserxm");
            return (Criteria) this;
        }

        public Criteria andDaTypeIsNull() {
            addCriterion("DA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDaTypeIsNotNull() {
            addCriterion("DA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDaTypeEqualTo(String value) {
            addCriterion("DA_TYPE =", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotEqualTo(String value) {
            addCriterion("DA_TYPE <>", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeGreaterThan(String value) {
            addCriterion("DA_TYPE >", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DA_TYPE >=", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeLessThan(String value) {
            addCriterion("DA_TYPE <", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeLessThanOrEqualTo(String value) {
            addCriterion("DA_TYPE <=", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeLike(String value) {
            addCriterion("DA_TYPE like", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotLike(String value) {
            addCriterion("DA_TYPE not like", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeIn(List<String> values) {
            addCriterion("DA_TYPE in", values, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotIn(List<String> values) {
            addCriterion("DA_TYPE not in", values, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeBetween(String value1, String value2) {
            addCriterion("DA_TYPE between", value1, value2, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotBetween(String value1, String value2) {
            addCriterion("DA_TYPE not between", value1, value2, "daType");
            return (Criteria) this;
        }

        public Criteria andDaInfoIsNull() {
            addCriterion("DA_INFO is null");
            return (Criteria) this;
        }

        public Criteria andDaInfoIsNotNull() {
            addCriterion("DA_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andDaInfoEqualTo(String value) {
            addCriterion("DA_INFO =", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoNotEqualTo(String value) {
            addCriterion("DA_INFO <>", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoGreaterThan(String value) {
            addCriterion("DA_INFO >", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoGreaterThanOrEqualTo(String value) {
            addCriterion("DA_INFO >=", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoLessThan(String value) {
            addCriterion("DA_INFO <", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoLessThanOrEqualTo(String value) {
            addCriterion("DA_INFO <=", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoLike(String value) {
            addCriterion("DA_INFO like", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoNotLike(String value) {
            addCriterion("DA_INFO not like", value, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoIn(List<String> values) {
            addCriterion("DA_INFO in", values, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoNotIn(List<String> values) {
            addCriterion("DA_INFO not in", values, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoBetween(String value1, String value2) {
            addCriterion("DA_INFO between", value1, value2, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaInfoNotBetween(String value1, String value2) {
            addCriterion("DA_INFO not between", value1, value2, "daInfo");
            return (Criteria) this;
        }

        public Criteria andDaDoseIsNull() {
            addCriterion("DA_DOSE is null");
            return (Criteria) this;
        }

        public Criteria andDaDoseIsNotNull() {
            addCriterion("DA_DOSE is not null");
            return (Criteria) this;
        }

        public Criteria andDaDoseEqualTo(String value) {
            addCriterion("DA_DOSE =", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseNotEqualTo(String value) {
            addCriterion("DA_DOSE <>", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseGreaterThan(String value) {
            addCriterion("DA_DOSE >", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseGreaterThanOrEqualTo(String value) {
            addCriterion("DA_DOSE >=", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseLessThan(String value) {
            addCriterion("DA_DOSE <", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseLessThanOrEqualTo(String value) {
            addCriterion("DA_DOSE <=", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseLike(String value) {
            addCriterion("DA_DOSE like", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseNotLike(String value) {
            addCriterion("DA_DOSE not like", value, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseIn(List<String> values) {
            addCriterion("DA_DOSE in", values, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseNotIn(List<String> values) {
            addCriterion("DA_DOSE not in", values, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseBetween(String value1, String value2) {
            addCriterion("DA_DOSE between", value1, value2, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaDoseNotBetween(String value1, String value2) {
            addCriterion("DA_DOSE not between", value1, value2, "daDose");
            return (Criteria) this;
        }

        public Criteria andDaUnitIsNull() {
            addCriterion("DA_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andDaUnitIsNotNull() {
            addCriterion("DA_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andDaUnitEqualTo(String value) {
            addCriterion("DA_UNIT =", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitNotEqualTo(String value) {
            addCriterion("DA_UNIT <>", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitGreaterThan(String value) {
            addCriterion("DA_UNIT >", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitGreaterThanOrEqualTo(String value) {
            addCriterion("DA_UNIT >=", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitLessThan(String value) {
            addCriterion("DA_UNIT <", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitLessThanOrEqualTo(String value) {
            addCriterion("DA_UNIT <=", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitLike(String value) {
            addCriterion("DA_UNIT like", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitNotLike(String value) {
            addCriterion("DA_UNIT not like", value, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitIn(List<String> values) {
            addCriterion("DA_UNIT in", values, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitNotIn(List<String> values) {
            addCriterion("DA_UNIT not in", values, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitBetween(String value1, String value2) {
            addCriterion("DA_UNIT between", value1, value2, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaUnitNotBetween(String value1, String value2) {
            addCriterion("DA_UNIT not between", value1, value2, "daUnit");
            return (Criteria) this;
        }

        public Criteria andDaWayIsNull() {
            addCriterion("DA_WAY is null");
            return (Criteria) this;
        }

        public Criteria andDaWayIsNotNull() {
            addCriterion("DA_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andDaWayEqualTo(String value) {
            addCriterion("DA_WAY =", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayNotEqualTo(String value) {
            addCriterion("DA_WAY <>", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayGreaterThan(String value) {
            addCriterion("DA_WAY >", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayGreaterThanOrEqualTo(String value) {
            addCriterion("DA_WAY >=", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayLessThan(String value) {
            addCriterion("DA_WAY <", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayLessThanOrEqualTo(String value) {
            addCriterion("DA_WAY <=", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayLike(String value) {
            addCriterion("DA_WAY like", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayNotLike(String value) {
            addCriterion("DA_WAY not like", value, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayIn(List<String> values) {
            addCriterion("DA_WAY in", values, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayNotIn(List<String> values) {
            addCriterion("DA_WAY not in", values, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayBetween(String value1, String value2) {
            addCriterion("DA_WAY between", value1, value2, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayNotBetween(String value1, String value2) {
            addCriterion("DA_WAY not between", value1, value2, "daWay");
            return (Criteria) this;
        }

        public Criteria andDaWayCodIsNull() {
            addCriterion("DA_WAY_COD is null");
            return (Criteria) this;
        }

        public Criteria andDaWayCodIsNotNull() {
            addCriterion("DA_WAY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andDaWayCodEqualTo(String value) {
            addCriterion("DA_WAY_COD =", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodNotEqualTo(String value) {
            addCriterion("DA_WAY_COD <>", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodGreaterThan(String value) {
            addCriterion("DA_WAY_COD >", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodGreaterThanOrEqualTo(String value) {
            addCriterion("DA_WAY_COD >=", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodLessThan(String value) {
            addCriterion("DA_WAY_COD <", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodLessThanOrEqualTo(String value) {
            addCriterion("DA_WAY_COD <=", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodLike(String value) {
            addCriterion("DA_WAY_COD like", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodNotLike(String value) {
            addCriterion("DA_WAY_COD not like", value, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodIn(List<String> values) {
            addCriterion("DA_WAY_COD in", values, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodNotIn(List<String> values) {
            addCriterion("DA_WAY_COD not in", values, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodBetween(String value1, String value2) {
            addCriterion("DA_WAY_COD between", value1, value2, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaWayCodNotBetween(String value1, String value2) {
            addCriterion("DA_WAY_COD not between", value1, value2, "daWayCod");
            return (Criteria) this;
        }

        public Criteria andDaNumbIsNull() {
            addCriterion("DA_NUMB is null");
            return (Criteria) this;
        }

        public Criteria andDaNumbIsNotNull() {
            addCriterion("DA_NUMB is not null");
            return (Criteria) this;
        }

        public Criteria andDaNumbEqualTo(BigDecimal value) {
            addCriterion("DA_NUMB =", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbNotEqualTo(BigDecimal value) {
            addCriterion("DA_NUMB <>", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbGreaterThan(BigDecimal value) {
            addCriterion("DA_NUMB >", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DA_NUMB >=", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbLessThan(BigDecimal value) {
            addCriterion("DA_NUMB <", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DA_NUMB <=", value, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbIn(List<BigDecimal> values) {
            addCriterion("DA_NUMB in", values, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbNotIn(List<BigDecimal> values) {
            addCriterion("DA_NUMB not in", values, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DA_NUMB between", value1, value2, "daNumb");
            return (Criteria) this;
        }

        public Criteria andDaNumbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DA_NUMB not between", value1, value2, "daNumb");
            return (Criteria) this;
        }

        public Criteria andYfdwIsNull() {
            addCriterion("YFDW is null");
            return (Criteria) this;
        }

        public Criteria andYfdwIsNotNull() {
            addCriterion("YFDW is not null");
            return (Criteria) this;
        }

        public Criteria andYfdwEqualTo(String value) {
            addCriterion("YFDW =", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwNotEqualTo(String value) {
            addCriterion("YFDW <>", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwGreaterThan(String value) {
            addCriterion("YFDW >", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwGreaterThanOrEqualTo(String value) {
            addCriterion("YFDW >=", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwLessThan(String value) {
            addCriterion("YFDW <", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwLessThanOrEqualTo(String value) {
            addCriterion("YFDW <=", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwLike(String value) {
            addCriterion("YFDW like", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwNotLike(String value) {
            addCriterion("YFDW not like", value, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwIn(List<String> values) {
            addCriterion("YFDW in", values, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwNotIn(List<String> values) {
            addCriterion("YFDW not in", values, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwBetween(String value1, String value2) {
            addCriterion("YFDW between", value1, value2, "yfdw");
            return (Criteria) this;
        }

        public Criteria andYfdwNotBetween(String value1, String value2) {
            addCriterion("YFDW not between", value1, value2, "yfdw");
            return (Criteria) this;
        }

        public Criteria andDaFreqIsNull() {
            addCriterion("DA_FREQ is null");
            return (Criteria) this;
        }

        public Criteria andDaFreqIsNotNull() {
            addCriterion("DA_FREQ is not null");
            return (Criteria) this;
        }

        public Criteria andDaFreqEqualTo(String value) {
            addCriterion("DA_FREQ =", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqNotEqualTo(String value) {
            addCriterion("DA_FREQ <>", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqGreaterThan(String value) {
            addCriterion("DA_FREQ >", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqGreaterThanOrEqualTo(String value) {
            addCriterion("DA_FREQ >=", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqLessThan(String value) {
            addCriterion("DA_FREQ <", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqLessThanOrEqualTo(String value) {
            addCriterion("DA_FREQ <=", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqLike(String value) {
            addCriterion("DA_FREQ like", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqNotLike(String value) {
            addCriterion("DA_FREQ not like", value, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqIn(List<String> values) {
            addCriterion("DA_FREQ in", values, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqNotIn(List<String> values) {
            addCriterion("DA_FREQ not in", values, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqBetween(String value1, String value2) {
            addCriterion("DA_FREQ between", value1, value2, "daFreq");
            return (Criteria) this;
        }

        public Criteria andDaFreqNotBetween(String value1, String value2) {
            addCriterion("DA_FREQ not between", value1, value2, "daFreq");
            return (Criteria) this;
        }

        public Criteria andExecDoseIsNull() {
            addCriterion("EXEC_DOSE is null");
            return (Criteria) this;
        }

        public Criteria andExecDoseIsNotNull() {
            addCriterion("EXEC_DOSE is not null");
            return (Criteria) this;
        }

        public Criteria andExecDoseEqualTo(String value) {
            addCriterion("EXEC_DOSE =", value, "execDose");
            return (Criteria) this;
        }

        public Criteria andExecDoseNotEqualTo(String value) {
            addCriterion("EXEC_DOSE <>", value, "execDose");
            return (Criteria) this;
        }

        public Criteria andExecDoseGreaterThan(String value) {
            addCriterion("EXEC_DOSE >", value, "execDose");
            return (Criteria) this;
        }

        public Criteria andExecDoseGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_DOSE >=", value, "execDose");
            return (Criteria) this;
        }

        public Criteria andExecDoseLessThan(String value) {
            addCriterion("EXEC_DOSE <", value, "execDose");
            return (Criteria) this;
        }

        public Criteria andExecDoseLessThanOrEqualTo(String value) {
            addCriterion("EXEC_DOSE <=", value, "execDose");
            return (Criteria) this;
        }

        public Criteria andExecDoseLike(String value) {
            addCriterion("EXEC_DOSE like", value, "execDose");
            return (Criteria) this;
        }

        public Criteria andExecDoseNotLike(String value) {
            addCriterion("EXEC_DOSE not like", value, "execDose");
            return (Criteria) this;
        }

        public Criteria andExecDoseIn(List<String> values) {
            addCriterion("EXEC_DOSE in", values, "execDose");
            return (Criteria) this;
        }

        public Criteria andExecDoseNotIn(List<String> values) {
            addCriterion("EXEC_DOSE not in", values, "execDose");
            return (Criteria) this;
        }

        public Criteria andExecDoseBetween(String value1, String value2) {
            addCriterion("EXEC_DOSE between", value1, value2, "execDose");
            return (Criteria) this;
        }

        public Criteria andExecDoseNotBetween(String value1, String value2) {
            addCriterion("EXEC_DOSE not between", value1, value2, "execDose");
            return (Criteria) this;
        }

        public Criteria andZxdtypeIsNull() {
            addCriterion("ZXDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andZxdtypeIsNotNull() {
            addCriterion("ZXDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andZxdtypeEqualTo(String value) {
            addCriterion("ZXDTYPE =", value, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxdtypeNotEqualTo(String value) {
            addCriterion("ZXDTYPE <>", value, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxdtypeGreaterThan(String value) {
            addCriterion("ZXDTYPE >", value, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ZXDTYPE >=", value, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxdtypeLessThan(String value) {
            addCriterion("ZXDTYPE <", value, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxdtypeLessThanOrEqualTo(String value) {
            addCriterion("ZXDTYPE <=", value, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxdtypeLike(String value) {
            addCriterion("ZXDTYPE like", value, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxdtypeNotLike(String value) {
            addCriterion("ZXDTYPE not like", value, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxdtypeIn(List<String> values) {
            addCriterion("ZXDTYPE in", values, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxdtypeNotIn(List<String> values) {
            addCriterion("ZXDTYPE not in", values, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxdtypeBetween(String value1, String value2) {
            addCriterion("ZXDTYPE between", value1, value2, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxdtypeNotBetween(String value1, String value2) {
            addCriterion("ZXDTYPE not between", value1, value2, "zxdtype");
            return (Criteria) this;
        }

        public Criteria andZxddatIsNull() {
            addCriterion("ZXDDAT is null");
            return (Criteria) this;
        }

        public Criteria andZxddatIsNotNull() {
            addCriterion("ZXDDAT is not null");
            return (Criteria) this;
        }

        public Criteria andZxddatEqualTo(Date value) {
            addCriterion("ZXDDAT =", value, "zxddat");
            return (Criteria) this;
        }

        public Criteria andZxddatNotEqualTo(Date value) {
            addCriterion("ZXDDAT <>", value, "zxddat");
            return (Criteria) this;
        }

        public Criteria andZxddatGreaterThan(Date value) {
            addCriterion("ZXDDAT >", value, "zxddat");
            return (Criteria) this;
        }

        public Criteria andZxddatGreaterThanOrEqualTo(Date value) {
            addCriterion("ZXDDAT >=", value, "zxddat");
            return (Criteria) this;
        }

        public Criteria andZxddatLessThan(Date value) {
            addCriterion("ZXDDAT <", value, "zxddat");
            return (Criteria) this;
        }

        public Criteria andZxddatLessThanOrEqualTo(Date value) {
            addCriterion("ZXDDAT <=", value, "zxddat");
            return (Criteria) this;
        }

        public Criteria andZxddatIn(List<Date> values) {
            addCriterion("ZXDDAT in", values, "zxddat");
            return (Criteria) this;
        }

        public Criteria andZxddatNotIn(List<Date> values) {
            addCriterion("ZXDDAT not in", values, "zxddat");
            return (Criteria) this;
        }

        public Criteria andZxddatBetween(Date value1, Date value2) {
            addCriterion("ZXDDAT between", value1, value2, "zxddat");
            return (Criteria) this;
        }

        public Criteria andZxddatNotBetween(Date value1, Date value2) {
            addCriterion("ZXDDAT not between", value1, value2, "zxddat");
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

        public Criteria andPsjgIsNull() {
            addCriterion("PSJG is null");
            return (Criteria) this;
        }

        public Criteria andPsjgIsNotNull() {
            addCriterion("PSJG is not null");
            return (Criteria) this;
        }

        public Criteria andPsjgEqualTo(String value) {
            addCriterion("PSJG =", value, "psjg");
            return (Criteria) this;
        }

        public Criteria andPsjgNotEqualTo(String value) {
            addCriterion("PSJG <>", value, "psjg");
            return (Criteria) this;
        }

        public Criteria andPsjgGreaterThan(String value) {
            addCriterion("PSJG >", value, "psjg");
            return (Criteria) this;
        }

        public Criteria andPsjgGreaterThanOrEqualTo(String value) {
            addCriterion("PSJG >=", value, "psjg");
            return (Criteria) this;
        }

        public Criteria andPsjgLessThan(String value) {
            addCriterion("PSJG <", value, "psjg");
            return (Criteria) this;
        }

        public Criteria andPsjgLessThanOrEqualTo(String value) {
            addCriterion("PSJG <=", value, "psjg");
            return (Criteria) this;
        }

        public Criteria andPsjgLike(String value) {
            addCriterion("PSJG like", value, "psjg");
            return (Criteria) this;
        }

        public Criteria andPsjgNotLike(String value) {
            addCriterion("PSJG not like", value, "psjg");
            return (Criteria) this;
        }

        public Criteria andPsjgIn(List<String> values) {
            addCriterion("PSJG in", values, "psjg");
            return (Criteria) this;
        }

        public Criteria andPsjgNotIn(List<String> values) {
            addCriterion("PSJG not in", values, "psjg");
            return (Criteria) this;
        }

        public Criteria andPsjgBetween(String value1, String value2) {
            addCriterion("PSJG between", value1, value2, "psjg");
            return (Criteria) this;
        }

        public Criteria andPsjgNotBetween(String value1, String value2) {
            addCriterion("PSJG not between", value1, value2, "psjg");
            return (Criteria) this;
        }

        public Criteria andPstxrdatIsNull() {
            addCriterion("PSTXRDAT is null");
            return (Criteria) this;
        }

        public Criteria andPstxrdatIsNotNull() {
            addCriterion("PSTXRDAT is not null");
            return (Criteria) this;
        }

        public Criteria andPstxrdatEqualTo(Date value) {
            addCriterion("PSTXRDAT =", value, "pstxrdat");
            return (Criteria) this;
        }

        public Criteria andPstxrdatNotEqualTo(Date value) {
            addCriterion("PSTXRDAT <>", value, "pstxrdat");
            return (Criteria) this;
        }

        public Criteria andPstxrdatGreaterThan(Date value) {
            addCriterion("PSTXRDAT >", value, "pstxrdat");
            return (Criteria) this;
        }

        public Criteria andPstxrdatGreaterThanOrEqualTo(Date value) {
            addCriterion("PSTXRDAT >=", value, "pstxrdat");
            return (Criteria) this;
        }

        public Criteria andPstxrdatLessThan(Date value) {
            addCriterion("PSTXRDAT <", value, "pstxrdat");
            return (Criteria) this;
        }

        public Criteria andPstxrdatLessThanOrEqualTo(Date value) {
            addCriterion("PSTXRDAT <=", value, "pstxrdat");
            return (Criteria) this;
        }

        public Criteria andPstxrdatIn(List<Date> values) {
            addCriterion("PSTXRDAT in", values, "pstxrdat");
            return (Criteria) this;
        }

        public Criteria andPstxrdatNotIn(List<Date> values) {
            addCriterion("PSTXRDAT not in", values, "pstxrdat");
            return (Criteria) this;
        }

        public Criteria andPstxrdatBetween(Date value1, Date value2) {
            addCriterion("PSTXRDAT between", value1, value2, "pstxrdat");
            return (Criteria) this;
        }

        public Criteria andPstxrdatNotBetween(Date value1, Date value2) {
            addCriterion("PSTXRDAT not between", value1, value2, "pstxrdat");
            return (Criteria) this;
        }

        public Criteria andPstxrIsNull() {
            addCriterion("PSTXR is null");
            return (Criteria) this;
        }

        public Criteria andPstxrIsNotNull() {
            addCriterion("PSTXR is not null");
            return (Criteria) this;
        }

        public Criteria andPstxrEqualTo(String value) {
            addCriterion("PSTXR =", value, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrNotEqualTo(String value) {
            addCriterion("PSTXR <>", value, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrGreaterThan(String value) {
            addCriterion("PSTXR >", value, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrGreaterThanOrEqualTo(String value) {
            addCriterion("PSTXR >=", value, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrLessThan(String value) {
            addCriterion("PSTXR <", value, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrLessThanOrEqualTo(String value) {
            addCriterion("PSTXR <=", value, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrLike(String value) {
            addCriterion("PSTXR like", value, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrNotLike(String value) {
            addCriterion("PSTXR not like", value, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrIn(List<String> values) {
            addCriterion("PSTXR in", values, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrNotIn(List<String> values) {
            addCriterion("PSTXR not in", values, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrBetween(String value1, String value2) {
            addCriterion("PSTXR between", value1, value2, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrNotBetween(String value1, String value2) {
            addCriterion("PSTXR not between", value1, value2, "pstxr");
            return (Criteria) this;
        }

        public Criteria andPstxrxmIsNull() {
            addCriterion("PSTXRXM is null");
            return (Criteria) this;
        }

        public Criteria andPstxrxmIsNotNull() {
            addCriterion("PSTXRXM is not null");
            return (Criteria) this;
        }

        public Criteria andPstxrxmEqualTo(String value) {
            addCriterion("PSTXRXM =", value, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPstxrxmNotEqualTo(String value) {
            addCriterion("PSTXRXM <>", value, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPstxrxmGreaterThan(String value) {
            addCriterion("PSTXRXM >", value, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPstxrxmGreaterThanOrEqualTo(String value) {
            addCriterion("PSTXRXM >=", value, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPstxrxmLessThan(String value) {
            addCriterion("PSTXRXM <", value, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPstxrxmLessThanOrEqualTo(String value) {
            addCriterion("PSTXRXM <=", value, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPstxrxmLike(String value) {
            addCriterion("PSTXRXM like", value, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPstxrxmNotLike(String value) {
            addCriterion("PSTXRXM not like", value, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPstxrxmIn(List<String> values) {
            addCriterion("PSTXRXM in", values, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPstxrxmNotIn(List<String> values) {
            addCriterion("PSTXRXM not in", values, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPstxrxmBetween(String value1, String value2) {
            addCriterion("PSTXRXM between", value1, value2, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPstxrxmNotBetween(String value1, String value2) {
            addCriterion("PSTXRXM not between", value1, value2, "pstxrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrdatIsNull() {
            addCriterion("PSSHRDAT is null");
            return (Criteria) this;
        }

        public Criteria andPsshrdatIsNotNull() {
            addCriterion("PSSHRDAT is not null");
            return (Criteria) this;
        }

        public Criteria andPsshrdatEqualTo(Date value) {
            addCriterion("PSSHRDAT =", value, "psshrdat");
            return (Criteria) this;
        }

        public Criteria andPsshrdatNotEqualTo(Date value) {
            addCriterion("PSSHRDAT <>", value, "psshrdat");
            return (Criteria) this;
        }

        public Criteria andPsshrdatGreaterThan(Date value) {
            addCriterion("PSSHRDAT >", value, "psshrdat");
            return (Criteria) this;
        }

        public Criteria andPsshrdatGreaterThanOrEqualTo(Date value) {
            addCriterion("PSSHRDAT >=", value, "psshrdat");
            return (Criteria) this;
        }

        public Criteria andPsshrdatLessThan(Date value) {
            addCriterion("PSSHRDAT <", value, "psshrdat");
            return (Criteria) this;
        }

        public Criteria andPsshrdatLessThanOrEqualTo(Date value) {
            addCriterion("PSSHRDAT <=", value, "psshrdat");
            return (Criteria) this;
        }

        public Criteria andPsshrdatIn(List<Date> values) {
            addCriterion("PSSHRDAT in", values, "psshrdat");
            return (Criteria) this;
        }

        public Criteria andPsshrdatNotIn(List<Date> values) {
            addCriterion("PSSHRDAT not in", values, "psshrdat");
            return (Criteria) this;
        }

        public Criteria andPsshrdatBetween(Date value1, Date value2) {
            addCriterion("PSSHRDAT between", value1, value2, "psshrdat");
            return (Criteria) this;
        }

        public Criteria andPsshrdatNotBetween(Date value1, Date value2) {
            addCriterion("PSSHRDAT not between", value1, value2, "psshrdat");
            return (Criteria) this;
        }

        public Criteria andPsshrIsNull() {
            addCriterion("PSSHR is null");
            return (Criteria) this;
        }

        public Criteria andPsshrIsNotNull() {
            addCriterion("PSSHR is not null");
            return (Criteria) this;
        }

        public Criteria andPsshrEqualTo(String value) {
            addCriterion("PSSHR =", value, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrNotEqualTo(String value) {
            addCriterion("PSSHR <>", value, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrGreaterThan(String value) {
            addCriterion("PSSHR >", value, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrGreaterThanOrEqualTo(String value) {
            addCriterion("PSSHR >=", value, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrLessThan(String value) {
            addCriterion("PSSHR <", value, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrLessThanOrEqualTo(String value) {
            addCriterion("PSSHR <=", value, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrLike(String value) {
            addCriterion("PSSHR like", value, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrNotLike(String value) {
            addCriterion("PSSHR not like", value, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrIn(List<String> values) {
            addCriterion("PSSHR in", values, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrNotIn(List<String> values) {
            addCriterion("PSSHR not in", values, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrBetween(String value1, String value2) {
            addCriterion("PSSHR between", value1, value2, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrNotBetween(String value1, String value2) {
            addCriterion("PSSHR not between", value1, value2, "psshr");
            return (Criteria) this;
        }

        public Criteria andPsshrxmIsNull() {
            addCriterion("PSSHRXM is null");
            return (Criteria) this;
        }

        public Criteria andPsshrxmIsNotNull() {
            addCriterion("PSSHRXM is not null");
            return (Criteria) this;
        }

        public Criteria andPsshrxmEqualTo(String value) {
            addCriterion("PSSHRXM =", value, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrxmNotEqualTo(String value) {
            addCriterion("PSSHRXM <>", value, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrxmGreaterThan(String value) {
            addCriterion("PSSHRXM >", value, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrxmGreaterThanOrEqualTo(String value) {
            addCriterion("PSSHRXM >=", value, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrxmLessThan(String value) {
            addCriterion("PSSHRXM <", value, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrxmLessThanOrEqualTo(String value) {
            addCriterion("PSSHRXM <=", value, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrxmLike(String value) {
            addCriterion("PSSHRXM like", value, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrxmNotLike(String value) {
            addCriterion("PSSHRXM not like", value, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrxmIn(List<String> values) {
            addCriterion("PSSHRXM in", values, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrxmNotIn(List<String> values) {
            addCriterion("PSSHRXM not in", values, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrxmBetween(String value1, String value2) {
            addCriterion("PSSHRXM between", value1, value2, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andPsshrxmNotBetween(String value1, String value2) {
            addCriterion("PSSHRXM not between", value1, value2, "psshrxm");
            return (Criteria) this;
        }

        public Criteria andZxdztIsNull() {
            addCriterion("ZXDZT is null");
            return (Criteria) this;
        }

        public Criteria andZxdztIsNotNull() {
            addCriterion("ZXDZT is not null");
            return (Criteria) this;
        }

        public Criteria andZxdztEqualTo(String value) {
            addCriterion("ZXDZT =", value, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andZxdztNotEqualTo(String value) {
            addCriterion("ZXDZT <>", value, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andZxdztGreaterThan(String value) {
            addCriterion("ZXDZT >", value, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andZxdztGreaterThanOrEqualTo(String value) {
            addCriterion("ZXDZT >=", value, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andZxdztLessThan(String value) {
            addCriterion("ZXDZT <", value, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andZxdztLessThanOrEqualTo(String value) {
            addCriterion("ZXDZT <=", value, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andZxdztLike(String value) {
            addCriterion("ZXDZT like", value, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andZxdztNotLike(String value) {
            addCriterion("ZXDZT not like", value, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andZxdztIn(List<String> values) {
            addCriterion("ZXDZT in", values, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andZxdztNotIn(List<String> values) {
            addCriterion("ZXDZT not in", values, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andZxdztBetween(String value1, String value2) {
            addCriterion("ZXDZT between", value1, value2, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andZxdztNotBetween(String value1, String value2) {
            addCriterion("ZXDZT not between", value1, value2, "zxdzt");
            return (Criteria) this;
        }

        public Criteria andMpiIsNull() {
            addCriterion("MPI is null");
            return (Criteria) this;
        }

        public Criteria andMpiIsNotNull() {
            addCriterion("MPI is not null");
            return (Criteria) this;
        }

        public Criteria andMpiEqualTo(String value) {
            addCriterion("MPI =", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotEqualTo(String value) {
            addCriterion("MPI <>", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiGreaterThan(String value) {
            addCriterion("MPI >", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiGreaterThanOrEqualTo(String value) {
            addCriterion("MPI >=", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLessThan(String value) {
            addCriterion("MPI <", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLessThanOrEqualTo(String value) {
            addCriterion("MPI <=", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLike(String value) {
            addCriterion("MPI like", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotLike(String value) {
            addCriterion("MPI not like", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiIn(List<String> values) {
            addCriterion("MPI in", values, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotIn(List<String> values) {
            addCriterion("MPI not in", values, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiBetween(String value1, String value2) {
            addCriterion("MPI between", value1, value2, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotBetween(String value1, String value2) {
            addCriterion("MPI not between", value1, value2, "mpi");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("CRT_TIME =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("CRT_TIME <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("CRT_TIME >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("CRT_TIME <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("CRT_TIME in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("CRT_TIME not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNull() {
            addCriterion("CRT_USER is null");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNotNull() {
            addCriterion("CRT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUserEqualTo(String value) {
            addCriterion("CRT_USER =", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotEqualTo(String value) {
            addCriterion("CRT_USER <>", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThan(String value) {
            addCriterion("CRT_USER >", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USER >=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThan(String value) {
            addCriterion("CRT_USER <", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThanOrEqualTo(String value) {
            addCriterion("CRT_USER <=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLike(String value) {
            addCriterion("CRT_USER like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotLike(String value) {
            addCriterion("CRT_USER not like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserIn(List<String> values) {
            addCriterion("CRT_USER in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotIn(List<String> values) {
            addCriterion("CRT_USER not in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserBetween(String value1, String value2) {
            addCriterion("CRT_USER between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotBetween(String value1, String value2) {
            addCriterion("CRT_USER not between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("MOD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("MOD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("MOD_TIME =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("MOD_TIME <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("MOD_TIME >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("MOD_TIME <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("MOD_TIME in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("MOD_TIME not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModUserIsNull() {
            addCriterion("MOD_USER is null");
            return (Criteria) this;
        }

        public Criteria andModUserIsNotNull() {
            addCriterion("MOD_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModUserEqualTo(String value) {
            addCriterion("MOD_USER =", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotEqualTo(String value) {
            addCriterion("MOD_USER <>", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserGreaterThan(String value) {
            addCriterion("MOD_USER >", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USER >=", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLessThan(String value) {
            addCriterion("MOD_USER <", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLessThanOrEqualTo(String value) {
            addCriterion("MOD_USER <=", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLike(String value) {
            addCriterion("MOD_USER like", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotLike(String value) {
            addCriterion("MOD_USER not like", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserIn(List<String> values) {
            addCriterion("MOD_USER in", values, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotIn(List<String> values) {
            addCriterion("MOD_USER not in", values, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserBetween(String value1, String value2) {
            addCriterion("MOD_USER between", value1, value2, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotBetween(String value1, String value2) {
            addCriterion("MOD_USER not between", value1, value2, "modUser");
            return (Criteria) this;
        }

        public Criteria andDispenseDateIsNull() {
            addCriterion("DISPENSE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDispenseDateIsNotNull() {
            addCriterion("DISPENSE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDispenseDateEqualTo(Date value) {
            addCriterion("DISPENSE_DATE =", value, "dispenseDate");
            return (Criteria) this;
        }

        public Criteria andDispenseDateNotEqualTo(Date value) {
            addCriterion("DISPENSE_DATE <>", value, "dispenseDate");
            return (Criteria) this;
        }

        public Criteria andDispenseDateGreaterThan(Date value) {
            addCriterion("DISPENSE_DATE >", value, "dispenseDate");
            return (Criteria) this;
        }

        public Criteria andDispenseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DISPENSE_DATE >=", value, "dispenseDate");
            return (Criteria) this;
        }

        public Criteria andDispenseDateLessThan(Date value) {
            addCriterion("DISPENSE_DATE <", value, "dispenseDate");
            return (Criteria) this;
        }

        public Criteria andDispenseDateLessThanOrEqualTo(Date value) {
            addCriterion("DISPENSE_DATE <=", value, "dispenseDate");
            return (Criteria) this;
        }

        public Criteria andDispenseDateIn(List<Date> values) {
            addCriterion("DISPENSE_DATE in", values, "dispenseDate");
            return (Criteria) this;
        }

        public Criteria andDispenseDateNotIn(List<Date> values) {
            addCriterion("DISPENSE_DATE not in", values, "dispenseDate");
            return (Criteria) this;
        }

        public Criteria andDispenseDateBetween(Date value1, Date value2) {
            addCriterion("DISPENSE_DATE between", value1, value2, "dispenseDate");
            return (Criteria) this;
        }

        public Criteria andDispenseDateNotBetween(Date value1, Date value2) {
            addCriterion("DISPENSE_DATE not between", value1, value2, "dispenseDate");
            return (Criteria) this;
        }

        public Criteria andDispenseUserIsNull() {
            addCriterion("DISPENSE_USER is null");
            return (Criteria) this;
        }

        public Criteria andDispenseUserIsNotNull() {
            addCriterion("DISPENSE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andDispenseUserEqualTo(String value) {
            addCriterion("DISPENSE_USER =", value, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserNotEqualTo(String value) {
            addCriterion("DISPENSE_USER <>", value, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserGreaterThan(String value) {
            addCriterion("DISPENSE_USER >", value, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserGreaterThanOrEqualTo(String value) {
            addCriterion("DISPENSE_USER >=", value, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserLessThan(String value) {
            addCriterion("DISPENSE_USER <", value, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserLessThanOrEqualTo(String value) {
            addCriterion("DISPENSE_USER <=", value, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserLike(String value) {
            addCriterion("DISPENSE_USER like", value, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserNotLike(String value) {
            addCriterion("DISPENSE_USER not like", value, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserIn(List<String> values) {
            addCriterion("DISPENSE_USER in", values, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserNotIn(List<String> values) {
            addCriterion("DISPENSE_USER not in", values, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserBetween(String value1, String value2) {
            addCriterion("DISPENSE_USER between", value1, value2, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserNotBetween(String value1, String value2) {
            addCriterion("DISPENSE_USER not between", value1, value2, "dispenseUser");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmIsNull() {
            addCriterion("DISPENSE_USERXM is null");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmIsNotNull() {
            addCriterion("DISPENSE_USERXM is not null");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmEqualTo(String value) {
            addCriterion("DISPENSE_USERXM =", value, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmNotEqualTo(String value) {
            addCriterion("DISPENSE_USERXM <>", value, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmGreaterThan(String value) {
            addCriterion("DISPENSE_USERXM >", value, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmGreaterThanOrEqualTo(String value) {
            addCriterion("DISPENSE_USERXM >=", value, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmLessThan(String value) {
            addCriterion("DISPENSE_USERXM <", value, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmLessThanOrEqualTo(String value) {
            addCriterion("DISPENSE_USERXM <=", value, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmLike(String value) {
            addCriterion("DISPENSE_USERXM like", value, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmNotLike(String value) {
            addCriterion("DISPENSE_USERXM not like", value, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmIn(List<String> values) {
            addCriterion("DISPENSE_USERXM in", values, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmNotIn(List<String> values) {
            addCriterion("DISPENSE_USERXM not in", values, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmBetween(String value1, String value2) {
            addCriterion("DISPENSE_USERXM between", value1, value2, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmNotBetween(String value1, String value2) {
            addCriterion("DISPENSE_USERXM not between", value1, value2, "dispenseUserxm");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondIsNull() {
            addCriterion("DISPENSE_USER_SECOND is null");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondIsNotNull() {
            addCriterion("DISPENSE_USER_SECOND is not null");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondEqualTo(String value) {
            addCriterion("DISPENSE_USER_SECOND =", value, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondNotEqualTo(String value) {
            addCriterion("DISPENSE_USER_SECOND <>", value, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondGreaterThan(String value) {
            addCriterion("DISPENSE_USER_SECOND >", value, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondGreaterThanOrEqualTo(String value) {
            addCriterion("DISPENSE_USER_SECOND >=", value, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondLessThan(String value) {
            addCriterion("DISPENSE_USER_SECOND <", value, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondLessThanOrEqualTo(String value) {
            addCriterion("DISPENSE_USER_SECOND <=", value, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondLike(String value) {
            addCriterion("DISPENSE_USER_SECOND like", value, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondNotLike(String value) {
            addCriterion("DISPENSE_USER_SECOND not like", value, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondIn(List<String> values) {
            addCriterion("DISPENSE_USER_SECOND in", values, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondNotIn(List<String> values) {
            addCriterion("DISPENSE_USER_SECOND not in", values, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondBetween(String value1, String value2) {
            addCriterion("DISPENSE_USER_SECOND between", value1, value2, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserSecondNotBetween(String value1, String value2) {
            addCriterion("DISPENSE_USER_SECOND not between", value1, value2, "dispenseUserSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondIsNull() {
            addCriterion("DISPENSE_USERXM_SECOND is null");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondIsNotNull() {
            addCriterion("DISPENSE_USERXM_SECOND is not null");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondEqualTo(String value) {
            addCriterion("DISPENSE_USERXM_SECOND =", value, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondNotEqualTo(String value) {
            addCriterion("DISPENSE_USERXM_SECOND <>", value, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondGreaterThan(String value) {
            addCriterion("DISPENSE_USERXM_SECOND >", value, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondGreaterThanOrEqualTo(String value) {
            addCriterion("DISPENSE_USERXM_SECOND >=", value, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondLessThan(String value) {
            addCriterion("DISPENSE_USERXM_SECOND <", value, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondLessThanOrEqualTo(String value) {
            addCriterion("DISPENSE_USERXM_SECOND <=", value, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondLike(String value) {
            addCriterion("DISPENSE_USERXM_SECOND like", value, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondNotLike(String value) {
            addCriterion("DISPENSE_USERXM_SECOND not like", value, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondIn(List<String> values) {
            addCriterion("DISPENSE_USERXM_SECOND in", values, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondNotIn(List<String> values) {
            addCriterion("DISPENSE_USERXM_SECOND not in", values, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondBetween(String value1, String value2) {
            addCriterion("DISPENSE_USERXM_SECOND between", value1, value2, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andDispenseUserxmSecondNotBetween(String value1, String value2) {
            addCriterion("DISPENSE_USERXM_SECOND not between", value1, value2, "dispenseUserxmSecond");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andBookFlagIsNull() {
            addCriterion("BOOK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBookFlagIsNotNull() {
            addCriterion("BOOK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBookFlagEqualTo(String value) {
            addCriterion("BOOK_FLAG =", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagNotEqualTo(String value) {
            addCriterion("BOOK_FLAG <>", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagGreaterThan(String value) {
            addCriterion("BOOK_FLAG >", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_FLAG >=", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagLessThan(String value) {
            addCriterion("BOOK_FLAG <", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagLessThanOrEqualTo(String value) {
            addCriterion("BOOK_FLAG <=", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagLike(String value) {
            addCriterion("BOOK_FLAG like", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagNotLike(String value) {
            addCriterion("BOOK_FLAG not like", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagIn(List<String> values) {
            addCriterion("BOOK_FLAG in", values, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagNotIn(List<String> values) {
            addCriterion("BOOK_FLAG not in", values, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagBetween(String value1, String value2) {
            addCriterion("BOOK_FLAG between", value1, value2, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagNotBetween(String value1, String value2) {
            addCriterion("BOOK_FLAG not between", value1, value2, "bookFlag");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_CFXX_EXEC
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_CFXX_EXEC 2020-06-17
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