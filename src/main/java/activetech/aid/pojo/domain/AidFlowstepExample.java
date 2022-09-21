package activetech.aid.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AidFlowstepExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AidFlowstepExample() {
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

        public Criteria andFlowseqIsNull() {
            addCriterion("FLOWSEQ is null");
            return (Criteria) this;
        }

        public Criteria andFlowseqIsNotNull() {
            addCriterion("FLOWSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFlowseqEqualTo(String value) {
            addCriterion("FLOWSEQ =", value, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowseqNotEqualTo(String value) {
            addCriterion("FLOWSEQ <>", value, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowseqGreaterThan(String value) {
            addCriterion("FLOWSEQ >", value, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowseqGreaterThanOrEqualTo(String value) {
            addCriterion("FLOWSEQ >=", value, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowseqLessThan(String value) {
            addCriterion("FLOWSEQ <", value, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowseqLessThanOrEqualTo(String value) {
            addCriterion("FLOWSEQ <=", value, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowseqLike(String value) {
            addCriterion("FLOWSEQ like", value, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowseqNotLike(String value) {
            addCriterion("FLOWSEQ not like", value, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowseqIn(List<String> values) {
            addCriterion("FLOWSEQ in", values, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowseqNotIn(List<String> values) {
            addCriterion("FLOWSEQ not in", values, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowseqBetween(String value1, String value2) {
            addCriterion("FLOWSEQ between", value1, value2, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowseqNotBetween(String value1, String value2) {
            addCriterion("FLOWSEQ not between", value1, value2, "flowseq");
            return (Criteria) this;
        }

        public Criteria andFlowentryIsNull() {
            addCriterion("FLOWENTRY is null");
            return (Criteria) this;
        }

        public Criteria andFlowentryIsNotNull() {
            addCriterion("FLOWENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andFlowentryEqualTo(String value) {
            addCriterion("FLOWENTRY =", value, "flowentry");
            return (Criteria) this;
        }

        public Criteria andFlowentryNotEqualTo(String value) {
            addCriterion("FLOWENTRY <>", value, "flowentry");
            return (Criteria) this;
        }

        public Criteria andFlowentryGreaterThan(String value) {
            addCriterion("FLOWENTRY >", value, "flowentry");
            return (Criteria) this;
        }

        public Criteria andFlowentryGreaterThanOrEqualTo(String value) {
            addCriterion("FLOWENTRY >=", value, "flowentry");
            return (Criteria) this;
        }

        public Criteria andFlowentryLessThan(String value) {
            addCriterion("FLOWENTRY <", value, "flowentry");
            return (Criteria) this;
        }

        public Criteria andFlowentryLessThanOrEqualTo(String value) {
            addCriterion("FLOWENTRY <=", value, "flowentry");
            return (Criteria) this;
        }

        public Criteria andFlowentryLike(String value) {
            addCriterion("FLOWENTRY like", value, "flowentry");
            return (Criteria) this;
        }

        public Criteria andFlowentryNotLike(String value) {
            addCriterion("FLOWENTRY not like", value, "flowentry");
            return (Criteria) this;
        }

        public Criteria andFlowentryIn(List<String> values) {
            addCriterion("FLOWENTRY in", values, "flowentry");
            return (Criteria) this;
        }

        public Criteria andFlowentryNotIn(List<String> values) {
            addCriterion("FLOWENTRY not in", values, "flowentry");
            return (Criteria) this;
        }

        public Criteria andFlowentryBetween(String value1, String value2) {
            addCriterion("FLOWENTRY between", value1, value2, "flowentry");
            return (Criteria) this;
        }

        public Criteria andFlowentryNotBetween(String value1, String value2) {
            addCriterion("FLOWENTRY not between", value1, value2, "flowentry");
            return (Criteria) this;
        }

        public Criteria andPatidIsNull() {
            addCriterion("PATID is null");
            return (Criteria) this;
        }

        public Criteria andPatidIsNotNull() {
            addCriterion("PATID is not null");
            return (Criteria) this;
        }

        public Criteria andPatidEqualTo(String value) {
            addCriterion("PATID =", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotEqualTo(String value) {
            addCriterion("PATID <>", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidGreaterThan(String value) {
            addCriterion("PATID >", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidGreaterThanOrEqualTo(String value) {
            addCriterion("PATID >=", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidLessThan(String value) {
            addCriterion("PATID <", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidLessThanOrEqualTo(String value) {
            addCriterion("PATID <=", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidLike(String value) {
            addCriterion("PATID like", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotLike(String value) {
            addCriterion("PATID not like", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidIn(List<String> values) {
            addCriterion("PATID in", values, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotIn(List<String> values) {
            addCriterion("PATID not in", values, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidBetween(String value1, String value2) {
            addCriterion("PATID between", value1, value2, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotBetween(String value1, String value2) {
            addCriterion("PATID not between", value1, value2, "patid");
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

        public Criteria andSteptypeIsNull() {
            addCriterion("STEPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSteptypeIsNotNull() {
            addCriterion("STEPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSteptypeEqualTo(String value) {
            addCriterion("STEPTYPE =", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeNotEqualTo(String value) {
            addCriterion("STEPTYPE <>", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeGreaterThan(String value) {
            addCriterion("STEPTYPE >", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeGreaterThanOrEqualTo(String value) {
            addCriterion("STEPTYPE >=", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeLessThan(String value) {
            addCriterion("STEPTYPE <", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeLessThanOrEqualTo(String value) {
            addCriterion("STEPTYPE <=", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeLike(String value) {
            addCriterion("STEPTYPE like", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeNotLike(String value) {
            addCriterion("STEPTYPE not like", value, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeIn(List<String> values) {
            addCriterion("STEPTYPE in", values, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeNotIn(List<String> values) {
            addCriterion("STEPTYPE not in", values, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeBetween(String value1, String value2) {
            addCriterion("STEPTYPE between", value1, value2, "steptype");
            return (Criteria) this;
        }

        public Criteria andSteptypeNotBetween(String value1, String value2) {
            addCriterion("STEPTYPE not between", value1, value2, "steptype");
            return (Criteria) this;
        }

        public Criteria andStepseqIsNull() {
            addCriterion("STEPSEQ is null");
            return (Criteria) this;
        }

        public Criteria andStepseqIsNotNull() {
            addCriterion("STEPSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andStepseqEqualTo(String value) {
            addCriterion("STEPSEQ =", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqNotEqualTo(String value) {
            addCriterion("STEPSEQ <>", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqGreaterThan(String value) {
            addCriterion("STEPSEQ >", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqGreaterThanOrEqualTo(String value) {
            addCriterion("STEPSEQ >=", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqLessThan(String value) {
            addCriterion("STEPSEQ <", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqLessThanOrEqualTo(String value) {
            addCriterion("STEPSEQ <=", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqLike(String value) {
            addCriterion("STEPSEQ like", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqNotLike(String value) {
            addCriterion("STEPSEQ not like", value, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqIn(List<String> values) {
            addCriterion("STEPSEQ in", values, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqNotIn(List<String> values) {
            addCriterion("STEPSEQ not in", values, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqBetween(String value1, String value2) {
            addCriterion("STEPSEQ between", value1, value2, "stepseq");
            return (Criteria) this;
        }

        public Criteria andStepseqNotBetween(String value1, String value2) {
            addCriterion("STEPSEQ not between", value1, value2, "stepseq");
            return (Criteria) this;
        }

        public Criteria andModflagIsNull() {
            addCriterion("MODFLAG is null");
            return (Criteria) this;
        }

        public Criteria andModflagIsNotNull() {
            addCriterion("MODFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andModflagEqualTo(String value) {
            addCriterion("MODFLAG =", value, "modflag");
            return (Criteria) this;
        }

        public Criteria andModflagNotEqualTo(String value) {
            addCriterion("MODFLAG <>", value, "modflag");
            return (Criteria) this;
        }

        public Criteria andModflagGreaterThan(String value) {
            addCriterion("MODFLAG >", value, "modflag");
            return (Criteria) this;
        }

        public Criteria andModflagGreaterThanOrEqualTo(String value) {
            addCriterion("MODFLAG >=", value, "modflag");
            return (Criteria) this;
        }

        public Criteria andModflagLessThan(String value) {
            addCriterion("MODFLAG <", value, "modflag");
            return (Criteria) this;
        }

        public Criteria andModflagLessThanOrEqualTo(String value) {
            addCriterion("MODFLAG <=", value, "modflag");
            return (Criteria) this;
        }

        public Criteria andModflagLike(String value) {
            addCriterion("MODFLAG like", value, "modflag");
            return (Criteria) this;
        }

        public Criteria andModflagNotLike(String value) {
            addCriterion("MODFLAG not like", value, "modflag");
            return (Criteria) this;
        }

        public Criteria andModflagIn(List<String> values) {
            addCriterion("MODFLAG in", values, "modflag");
            return (Criteria) this;
        }

        public Criteria andModflagNotIn(List<String> values) {
            addCriterion("MODFLAG not in", values, "modflag");
            return (Criteria) this;
        }

        public Criteria andModflagBetween(String value1, String value2) {
            addCriterion("MODFLAG between", value1, value2, "modflag");
            return (Criteria) this;
        }

        public Criteria andModflagNotBetween(String value1, String value2) {
            addCriterion("MODFLAG not between", value1, value2, "modflag");
            return (Criteria) this;
        }

        public Criteria andFlowtimeIsNull() {
            addCriterion("FLOWTIME is null");
            return (Criteria) this;
        }

        public Criteria andFlowtimeIsNotNull() {
            addCriterion("FLOWTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFlowtimeEqualTo(Date value) {
            addCriterion("FLOWTIME =", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeNotEqualTo(Date value) {
            addCriterion("FLOWTIME <>", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeGreaterThan(Date value) {
            addCriterion("FLOWTIME >", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FLOWTIME >=", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeLessThan(Date value) {
            addCriterion("FLOWTIME <", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeLessThanOrEqualTo(Date value) {
            addCriterion("FLOWTIME <=", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeIn(List<Date> values) {
            addCriterion("FLOWTIME in", values, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeNotIn(List<Date> values) {
            addCriterion("FLOWTIME not in", values, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeBetween(Date value1, Date value2) {
            addCriterion("FLOWTIME between", value1, value2, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeNotBetween(Date value1, Date value2) {
            addCriterion("FLOWTIME not between", value1, value2, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowmemoIsNull() {
            addCriterion("FLOWMEMO is null");
            return (Criteria) this;
        }

        public Criteria andFlowmemoIsNotNull() {
            addCriterion("FLOWMEMO is not null");
            return (Criteria) this;
        }

        public Criteria andFlowmemoEqualTo(String value) {
            addCriterion("FLOWMEMO =", value, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andFlowmemoNotEqualTo(String value) {
            addCriterion("FLOWMEMO <>", value, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andFlowmemoGreaterThan(String value) {
            addCriterion("FLOWMEMO >", value, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andFlowmemoGreaterThanOrEqualTo(String value) {
            addCriterion("FLOWMEMO >=", value, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andFlowmemoLessThan(String value) {
            addCriterion("FLOWMEMO <", value, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andFlowmemoLessThanOrEqualTo(String value) {
            addCriterion("FLOWMEMO <=", value, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andFlowmemoLike(String value) {
            addCriterion("FLOWMEMO like", value, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andFlowmemoNotLike(String value) {
            addCriterion("FLOWMEMO not like", value, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andFlowmemoIn(List<String> values) {
            addCriterion("FLOWMEMO in", values, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andFlowmemoNotIn(List<String> values) {
            addCriterion("FLOWMEMO not in", values, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andFlowmemoBetween(String value1, String value2) {
            addCriterion("FLOWMEMO between", value1, value2, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andFlowmemoNotBetween(String value1, String value2) {
            addCriterion("FLOWMEMO not between", value1, value2, "flowmemo");
            return (Criteria) this;
        }

        public Criteria andCrtuseridIsNull() {
            addCriterion("CRTUSERID is null");
            return (Criteria) this;
        }

        public Criteria andCrtuseridIsNotNull() {
            addCriterion("CRTUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andCrtuseridEqualTo(String value) {
            addCriterion("CRTUSERID =", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridNotEqualTo(String value) {
            addCriterion("CRTUSERID <>", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridGreaterThan(String value) {
            addCriterion("CRTUSERID >", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CRTUSERID >=", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridLessThan(String value) {
            addCriterion("CRTUSERID <", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridLessThanOrEqualTo(String value) {
            addCriterion("CRTUSERID <=", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridLike(String value) {
            addCriterion("CRTUSERID like", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridNotLike(String value) {
            addCriterion("CRTUSERID not like", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridIn(List<String> values) {
            addCriterion("CRTUSERID in", values, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridNotIn(List<String> values) {
            addCriterion("CRTUSERID not in", values, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridBetween(String value1, String value2) {
            addCriterion("CRTUSERID between", value1, value2, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridNotBetween(String value1, String value2) {
            addCriterion("CRTUSERID not between", value1, value2, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrttimeIsNull() {
            addCriterion("CRTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCrttimeIsNotNull() {
            addCriterion("CRTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrttimeEqualTo(Date value) {
            addCriterion("CRTTIME =", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeNotEqualTo(Date value) {
            addCriterion("CRTTIME <>", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeGreaterThan(Date value) {
            addCriterion("CRTTIME >", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRTTIME >=", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeLessThan(Date value) {
            addCriterion("CRTTIME <", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeLessThanOrEqualTo(Date value) {
            addCriterion("CRTTIME <=", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeIn(List<Date> values) {
            addCriterion("CRTTIME in", values, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeNotIn(List<Date> values) {
            addCriterion("CRTTIME not in", values, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeBetween(Date value1, Date value2) {
            addCriterion("CRTTIME between", value1, value2, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeNotBetween(Date value1, Date value2) {
            addCriterion("CRTTIME not between", value1, value2, "crttime");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNull() {
            addCriterion("MODTIME is null");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNotNull() {
            addCriterion("MODTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModtimeEqualTo(Date value) {
            addCriterion("MODTIME =", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotEqualTo(Date value) {
            addCriterion("MODTIME <>", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThan(Date value) {
            addCriterion("MODTIME >", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODTIME >=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThan(Date value) {
            addCriterion("MODTIME <", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThanOrEqualTo(Date value) {
            addCriterion("MODTIME <=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeIn(List<Date> values) {
            addCriterion("MODTIME in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotIn(List<Date> values) {
            addCriterion("MODTIME not in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeBetween(Date value1, Date value2) {
            addCriterion("MODTIME between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotBetween(Date value1, Date value2) {
            addCriterion("MODTIME not between", value1, value2, "modtime");
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