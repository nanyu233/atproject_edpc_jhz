package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IcuErInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcuErInfoExample() {
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

        public Criteria andErSeqIsNull() {
            addCriterion("ER_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andErSeqIsNotNull() {
            addCriterion("ER_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andErSeqEqualTo(String value) {
            addCriterion("ER_SEQ =", value, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErSeqNotEqualTo(String value) {
            addCriterion("ER_SEQ <>", value, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErSeqGreaterThan(String value) {
            addCriterion("ER_SEQ >", value, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ER_SEQ >=", value, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErSeqLessThan(String value) {
            addCriterion("ER_SEQ <", value, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErSeqLessThanOrEqualTo(String value) {
            addCriterion("ER_SEQ <=", value, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErSeqLike(String value) {
            addCriterion("ER_SEQ like", value, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErSeqNotLike(String value) {
            addCriterion("ER_SEQ not like", value, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErSeqIn(List<String> values) {
            addCriterion("ER_SEQ in", values, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErSeqNotIn(List<String> values) {
            addCriterion("ER_SEQ not in", values, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErSeqBetween(String value1, String value2) {
            addCriterion("ER_SEQ between", value1, value2, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErSeqNotBetween(String value1, String value2) {
            addCriterion("ER_SEQ not between", value1, value2, "erSeq");
            return (Criteria) this;
        }

        public Criteria andErStatIsNull() {
            addCriterion("ER_STAT is null");
            return (Criteria) this;
        }

        public Criteria andErStatIsNotNull() {
            addCriterion("ER_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andErStatEqualTo(String value) {
            addCriterion("ER_STAT =", value, "erStat");
            return (Criteria) this;
        }

        public Criteria andErStatNotEqualTo(String value) {
            addCriterion("ER_STAT <>", value, "erStat");
            return (Criteria) this;
        }

        public Criteria andErStatGreaterThan(String value) {
            addCriterion("ER_STAT >", value, "erStat");
            return (Criteria) this;
        }

        public Criteria andErStatGreaterThanOrEqualTo(String value) {
            addCriterion("ER_STAT >=", value, "erStat");
            return (Criteria) this;
        }

        public Criteria andErStatLessThan(String value) {
            addCriterion("ER_STAT <", value, "erStat");
            return (Criteria) this;
        }

        public Criteria andErStatLessThanOrEqualTo(String value) {
            addCriterion("ER_STAT <=", value, "erStat");
            return (Criteria) this;
        }

        public Criteria andErStatLike(String value) {
            addCriterion("ER_STAT like", value, "erStat");
            return (Criteria) this;
        }

        public Criteria andErStatNotLike(String value) {
            addCriterion("ER_STAT not like", value, "erStat");
            return (Criteria) this;
        }

        public Criteria andErStatIn(List<String> values) {
            addCriterion("ER_STAT in", values, "erStat");
            return (Criteria) this;
        }

        public Criteria andErStatNotIn(List<String> values) {
            addCriterion("ER_STAT not in", values, "erStat");
            return (Criteria) this;
        }

        public Criteria andErStatBetween(String value1, String value2) {
            addCriterion("ER_STAT between", value1, value2, "erStat");
            return (Criteria) this;
        }

        public Criteria andErStatNotBetween(String value1, String value2) {
            addCriterion("ER_STAT not between", value1, value2, "erStat");
            return (Criteria) this;
        }

        public Criteria andErTypeIsNull() {
            addCriterion("ER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andErTypeIsNotNull() {
            addCriterion("ER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andErTypeEqualTo(String value) {
            addCriterion("ER_TYPE =", value, "erType");
            return (Criteria) this;
        }

        public Criteria andErTypeNotEqualTo(String value) {
            addCriterion("ER_TYPE <>", value, "erType");
            return (Criteria) this;
        }

        public Criteria andErTypeGreaterThan(String value) {
            addCriterion("ER_TYPE >", value, "erType");
            return (Criteria) this;
        }

        public Criteria andErTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ER_TYPE >=", value, "erType");
            return (Criteria) this;
        }

        public Criteria andErTypeLessThan(String value) {
            addCriterion("ER_TYPE <", value, "erType");
            return (Criteria) this;
        }

        public Criteria andErTypeLessThanOrEqualTo(String value) {
            addCriterion("ER_TYPE <=", value, "erType");
            return (Criteria) this;
        }

        public Criteria andErTypeLike(String value) {
            addCriterion("ER_TYPE like", value, "erType");
            return (Criteria) this;
        }

        public Criteria andErTypeNotLike(String value) {
            addCriterion("ER_TYPE not like", value, "erType");
            return (Criteria) this;
        }

        public Criteria andErTypeIn(List<String> values) {
            addCriterion("ER_TYPE in", values, "erType");
            return (Criteria) this;
        }

        public Criteria andErTypeNotIn(List<String> values) {
            addCriterion("ER_TYPE not in", values, "erType");
            return (Criteria) this;
        }

        public Criteria andErTypeBetween(String value1, String value2) {
            addCriterion("ER_TYPE between", value1, value2, "erType");
            return (Criteria) this;
        }

        public Criteria andErTypeNotBetween(String value1, String value2) {
            addCriterion("ER_TYPE not between", value1, value2, "erType");
            return (Criteria) this;
        }

        public Criteria andErNameIsNull() {
            addCriterion("ER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andErNameIsNotNull() {
            addCriterion("ER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andErNameEqualTo(String value) {
            addCriterion("ER_NAME =", value, "erName");
            return (Criteria) this;
        }

        public Criteria andErNameNotEqualTo(String value) {
            addCriterion("ER_NAME <>", value, "erName");
            return (Criteria) this;
        }

        public Criteria andErNameGreaterThan(String value) {
            addCriterion("ER_NAME >", value, "erName");
            return (Criteria) this;
        }

        public Criteria andErNameGreaterThanOrEqualTo(String value) {
            addCriterion("ER_NAME >=", value, "erName");
            return (Criteria) this;
        }

        public Criteria andErNameLessThan(String value) {
            addCriterion("ER_NAME <", value, "erName");
            return (Criteria) this;
        }

        public Criteria andErNameLessThanOrEqualTo(String value) {
            addCriterion("ER_NAME <=", value, "erName");
            return (Criteria) this;
        }

        public Criteria andErNameLike(String value) {
            addCriterion("ER_NAME like", value, "erName");
            return (Criteria) this;
        }

        public Criteria andErNameNotLike(String value) {
            addCriterion("ER_NAME not like", value, "erName");
            return (Criteria) this;
        }

        public Criteria andErNameIn(List<String> values) {
            addCriterion("ER_NAME in", values, "erName");
            return (Criteria) this;
        }

        public Criteria andErNameNotIn(List<String> values) {
            addCriterion("ER_NAME not in", values, "erName");
            return (Criteria) this;
        }

        public Criteria andErNameBetween(String value1, String value2) {
            addCriterion("ER_NAME between", value1, value2, "erName");
            return (Criteria) this;
        }

        public Criteria andErNameNotBetween(String value1, String value2) {
            addCriterion("ER_NAME not between", value1, value2, "erName");
            return (Criteria) this;
        }

        public Criteria andErInfoIsNull() {
            addCriterion("ER_INFO is null");
            return (Criteria) this;
        }

        public Criteria andErInfoIsNotNull() {
            addCriterion("ER_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andErInfoEqualTo(String value) {
            addCriterion("ER_INFO =", value, "erInfo");
            return (Criteria) this;
        }

        public Criteria andErInfoNotEqualTo(String value) {
            addCriterion("ER_INFO <>", value, "erInfo");
            return (Criteria) this;
        }

        public Criteria andErInfoGreaterThan(String value) {
            addCriterion("ER_INFO >", value, "erInfo");
            return (Criteria) this;
        }

        public Criteria andErInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ER_INFO >=", value, "erInfo");
            return (Criteria) this;
        }

        public Criteria andErInfoLessThan(String value) {
            addCriterion("ER_INFO <", value, "erInfo");
            return (Criteria) this;
        }

        public Criteria andErInfoLessThanOrEqualTo(String value) {
            addCriterion("ER_INFO <=", value, "erInfo");
            return (Criteria) this;
        }

        public Criteria andErInfoLike(String value) {
            addCriterion("ER_INFO like", value, "erInfo");
            return (Criteria) this;
        }

        public Criteria andErInfoNotLike(String value) {
            addCriterion("ER_INFO not like", value, "erInfo");
            return (Criteria) this;
        }

        public Criteria andErInfoIn(List<String> values) {
            addCriterion("ER_INFO in", values, "erInfo");
            return (Criteria) this;
        }

        public Criteria andErInfoNotIn(List<String> values) {
            addCriterion("ER_INFO not in", values, "erInfo");
            return (Criteria) this;
        }

        public Criteria andErInfoBetween(String value1, String value2) {
            addCriterion("ER_INFO between", value1, value2, "erInfo");
            return (Criteria) this;
        }

        public Criteria andErInfoNotBetween(String value1, String value2) {
            addCriterion("ER_INFO not between", value1, value2, "erInfo");
            return (Criteria) this;
        }

        public Criteria andLiveNoIsNull() {
            addCriterion("LIVE_NO is null");
            return (Criteria) this;
        }

        public Criteria andLiveNoIsNotNull() {
            addCriterion("LIVE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLiveNoEqualTo(String value) {
            addCriterion("LIVE_NO =", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoNotEqualTo(String value) {
            addCriterion("LIVE_NO <>", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoGreaterThan(String value) {
            addCriterion("LIVE_NO >", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_NO >=", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoLessThan(String value) {
            addCriterion("LIVE_NO <", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoLessThanOrEqualTo(String value) {
            addCriterion("LIVE_NO <=", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoLike(String value) {
            addCriterion("LIVE_NO like", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoNotLike(String value) {
            addCriterion("LIVE_NO not like", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoIn(List<String> values) {
            addCriterion("LIVE_NO in", values, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoNotIn(List<String> values) {
            addCriterion("LIVE_NO not in", values, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoBetween(String value1, String value2) {
            addCriterion("LIVE_NO between", value1, value2, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoNotBetween(String value1, String value2) {
            addCriterion("LIVE_NO not between", value1, value2, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIsNull() {
            addCriterion("LINK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIsNotNull() {
            addCriterion("LINK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andLinkSeqEqualTo(String value) {
            addCriterion("LINK_SEQ =", value, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkSeqNotEqualTo(String value) {
            addCriterion("LINK_SEQ <>", value, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkSeqGreaterThan(String value) {
            addCriterion("LINK_SEQ >", value, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkSeqGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_SEQ >=", value, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkSeqLessThan(String value) {
            addCriterion("LINK_SEQ <", value, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkSeqLessThanOrEqualTo(String value) {
            addCriterion("LINK_SEQ <=", value, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkSeqLike(String value) {
            addCriterion("LINK_SEQ like", value, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkSeqNotLike(String value) {
            addCriterion("LINK_SEQ not like", value, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIn(List<String> values) {
            addCriterion("LINK_SEQ in", values, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkSeqNotIn(List<String> values) {
            addCriterion("LINK_SEQ not in", values, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkSeqBetween(String value1, String value2) {
            addCriterion("LINK_SEQ between", value1, value2, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkSeqNotBetween(String value1, String value2) {
            addCriterion("LINK_SEQ not between", value1, value2, "linkSeq");
            return (Criteria) this;
        }

        public Criteria andLinkTimeIsNull() {
            addCriterion("LINK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLinkTimeIsNotNull() {
            addCriterion("LINK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLinkTimeEqualTo(Date value) {
            addCriterion("LINK_TIME =", value, "linkTime");
            return (Criteria) this;
        }

        public Criteria andLinkTimeNotEqualTo(Date value) {
            addCriterion("LINK_TIME <>", value, "linkTime");
            return (Criteria) this;
        }

        public Criteria andLinkTimeGreaterThan(Date value) {
            addCriterion("LINK_TIME >", value, "linkTime");
            return (Criteria) this;
        }

        public Criteria andLinkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LINK_TIME >=", value, "linkTime");
            return (Criteria) this;
        }

        public Criteria andLinkTimeLessThan(Date value) {
            addCriterion("LINK_TIME <", value, "linkTime");
            return (Criteria) this;
        }

        public Criteria andLinkTimeLessThanOrEqualTo(Date value) {
            addCriterion("LINK_TIME <=", value, "linkTime");
            return (Criteria) this;
        }

        public Criteria andLinkTimeIn(List<Date> values) {
            addCriterion("LINK_TIME in", values, "linkTime");
            return (Criteria) this;
        }

        public Criteria andLinkTimeNotIn(List<Date> values) {
            addCriterion("LINK_TIME not in", values, "linkTime");
            return (Criteria) this;
        }

        public Criteria andLinkTimeBetween(Date value1, Date value2) {
            addCriterion("LINK_TIME between", value1, value2, "linkTime");
            return (Criteria) this;
        }

        public Criteria andLinkTimeNotBetween(Date value1, Date value2) {
            addCriterion("LINK_TIME not between", value1, value2, "linkTime");
            return (Criteria) this;
        }

        public Criteria andSkipUrlIsNull() {
            addCriterion("SKIP_URL is null");
            return (Criteria) this;
        }

        public Criteria andSkipUrlIsNotNull() {
            addCriterion("SKIP_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSkipUrlEqualTo(String value) {
            addCriterion("SKIP_URL =", value, "skipUrl");
            return (Criteria) this;
        }

        public Criteria andSkipUrlNotEqualTo(String value) {
            addCriterion("SKIP_URL <>", value, "skipUrl");
            return (Criteria) this;
        }

        public Criteria andSkipUrlGreaterThan(String value) {
            addCriterion("SKIP_URL >", value, "skipUrl");
            return (Criteria) this;
        }

        public Criteria andSkipUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SKIP_URL >=", value, "skipUrl");
            return (Criteria) this;
        }

        public Criteria andSkipUrlLessThan(String value) {
            addCriterion("SKIP_URL <", value, "skipUrl");
            return (Criteria) this;
        }

        public Criteria andSkipUrlLessThanOrEqualTo(String value) {
            addCriterion("SKIP_URL <=", value, "skipUrl");
            return (Criteria) this;
        }

        public Criteria andSkipUrlLike(String value) {
            addCriterion("SKIP_URL like", value, "skipUrl");
            return (Criteria) this;
        }

        public Criteria andSkipUrlNotLike(String value) {
            addCriterion("SKIP_URL not like", value, "skipUrl");
            return (Criteria) this;
        }

        public Criteria andSkipUrlIn(List<String> values) {
            addCriterion("SKIP_URL in", values, "skipUrl");
            return (Criteria) this;
        }

        public Criteria andSkipUrlNotIn(List<String> values) {
            addCriterion("SKIP_URL not in", values, "skipUrl");
            return (Criteria) this;
        }

        public Criteria andSkipUrlBetween(String value1, String value2) {
            addCriterion("SKIP_URL between", value1, value2, "skipUrl");
            return (Criteria) this;
        }

        public Criteria andSkipUrlNotBetween(String value1, String value2) {
            addCriterion("SKIP_URL not between", value1, value2, "skipUrl");
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