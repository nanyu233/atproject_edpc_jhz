package activetech.eicu.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IcuVsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcuVsInfoExample() {
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

        public Criteria andVsSeqIsNull() {
            addCriterion("VS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andVsSeqIsNotNull() {
            addCriterion("VS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andVsSeqEqualTo(String value) {
            addCriterion("VS_SEQ =", value, "vsSeq");
            return (Criteria) this;
        }

        public Criteria andVsSeqNotEqualTo(String value) {
            addCriterion("VS_SEQ <>", value, "vsSeq");
            return (Criteria) this;
        }

        public Criteria andVsSeqGreaterThan(String value) {
            addCriterion("VS_SEQ >", value, "vsSeq");
            return (Criteria) this;
        }

        public Criteria andVsSeqGreaterThanOrEqualTo(String value) {
            addCriterion("VS_SEQ >=", value, "vsSeq");
            return (Criteria) this;
        }

        public Criteria andVsSeqLessThan(String value) {
            addCriterion("VS_SEQ <", value, "vsSeq");
            return (Criteria) this;
        }

        public Criteria andVsSeqLessThanOrEqualTo(String value) {
            addCriterion("VS_SEQ <=", value, "vsSeq");
            return (Criteria) this;
        }

        public Criteria andVsSeqLike(String value) {
            addCriterion("VS_SEQ like", value, "vsSeq");
            return (Criteria) this;
        }

        public Criteria andVsSeqNotLike(String value) {
            addCriterion("VS_SEQ not like", value, "vsSeq");
            return (Criteria) this;
        }

        public Criteria andVsSeqIn(List<String> values) {
            addCriterion("VS_SEQ in", values, "vsSeq");
            return (Criteria) this;
        }

        public Criteria andVsSeqNotIn(List<String> values) {
            addCriterion("VS_SEQ not in", values, "vsSeq");
            return (Criteria) this;
        }

        public Criteria andVsSeqBetween(String value1, String value2) {
            addCriterion("VS_SEQ between", value1, value2, "vsSeq");
            return (Criteria) this;
        }

        public Criteria andVsSeqNotBetween(String value1, String value2) {
            addCriterion("VS_SEQ not between", value1, value2, "vsSeq");
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

        public Criteria andVsTypeIsNull() {
            addCriterion("VS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVsTypeIsNotNull() {
            addCriterion("VS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVsTypeEqualTo(String value) {
            addCriterion("VS_TYPE =", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeNotEqualTo(String value) {
            addCriterion("VS_TYPE <>", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeGreaterThan(String value) {
            addCriterion("VS_TYPE >", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VS_TYPE >=", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeLessThan(String value) {
            addCriterion("VS_TYPE <", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeLessThanOrEqualTo(String value) {
            addCriterion("VS_TYPE <=", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeLike(String value) {
            addCriterion("VS_TYPE like", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeNotLike(String value) {
            addCriterion("VS_TYPE not like", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeIn(List<String> values) {
            addCriterion("VS_TYPE in", values, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeNotIn(List<String> values) {
            addCriterion("VS_TYPE not in", values, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeBetween(String value1, String value2) {
            addCriterion("VS_TYPE between", value1, value2, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeNotBetween(String value1, String value2) {
            addCriterion("VS_TYPE not between", value1, value2, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsCodeIsNull() {
            addCriterion("VS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVsCodeIsNotNull() {
            addCriterion("VS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVsCodeEqualTo(String value) {
            addCriterion("VS_CODE =", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeNotEqualTo(String value) {
            addCriterion("VS_CODE <>", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeGreaterThan(String value) {
            addCriterion("VS_CODE >", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VS_CODE >=", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeLessThan(String value) {
            addCriterion("VS_CODE <", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeLessThanOrEqualTo(String value) {
            addCriterion("VS_CODE <=", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeLike(String value) {
            addCriterion("VS_CODE like", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeNotLike(String value) {
            addCriterion("VS_CODE not like", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeIn(List<String> values) {
            addCriterion("VS_CODE in", values, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeNotIn(List<String> values) {
            addCriterion("VS_CODE not in", values, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeBetween(String value1, String value2) {
            addCriterion("VS_CODE between", value1, value2, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeNotBetween(String value1, String value2) {
            addCriterion("VS_CODE not between", value1, value2, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsSrcIsNull() {
            addCriterion("VS_SRC is null");
            return (Criteria) this;
        }

        public Criteria andVsSrcIsNotNull() {
            addCriterion("VS_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andVsSrcEqualTo(String value) {
            addCriterion("VS_SRC =", value, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsSrcNotEqualTo(String value) {
            addCriterion("VS_SRC <>", value, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsSrcGreaterThan(String value) {
            addCriterion("VS_SRC >", value, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsSrcGreaterThanOrEqualTo(String value) {
            addCriterion("VS_SRC >=", value, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsSrcLessThan(String value) {
            addCriterion("VS_SRC <", value, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsSrcLessThanOrEqualTo(String value) {
            addCriterion("VS_SRC <=", value, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsSrcLike(String value) {
            addCriterion("VS_SRC like", value, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsSrcNotLike(String value) {
            addCriterion("VS_SRC not like", value, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsSrcIn(List<String> values) {
            addCriterion("VS_SRC in", values, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsSrcNotIn(List<String> values) {
            addCriterion("VS_SRC not in", values, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsSrcBetween(String value1, String value2) {
            addCriterion("VS_SRC between", value1, value2, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsSrcNotBetween(String value1, String value2) {
            addCriterion("VS_SRC not between", value1, value2, "vsSrc");
            return (Criteria) this;
        }

        public Criteria andVsDateIsNull() {
            addCriterion("VS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVsDateIsNotNull() {
            addCriterion("VS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVsDateEqualTo(Date value) {
            addCriterion("VS_DATE =", value, "vsDate");
            return (Criteria) this;
        }

        public Criteria andVsDateNotEqualTo(Date value) {
            addCriterion("VS_DATE <>", value, "vsDate");
            return (Criteria) this;
        }

        public Criteria andVsDateGreaterThan(Date value) {
            addCriterion("VS_DATE >", value, "vsDate");
            return (Criteria) this;
        }

        public Criteria andVsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("VS_DATE >=", value, "vsDate");
            return (Criteria) this;
        }

        public Criteria andVsDateLessThan(Date value) {
            addCriterion("VS_DATE <", value, "vsDate");
            return (Criteria) this;
        }

        public Criteria andVsDateLessThanOrEqualTo(Date value) {
            addCriterion("VS_DATE <=", value, "vsDate");
            return (Criteria) this;
        }

        public Criteria andVsDateIn(List<Date> values) {
            addCriterion("VS_DATE in", values, "vsDate");
            return (Criteria) this;
        }

        public Criteria andVsDateNotIn(List<Date> values) {
            addCriterion("VS_DATE not in", values, "vsDate");
            return (Criteria) this;
        }

        public Criteria andVsDateBetween(Date value1, Date value2) {
            addCriterion("VS_DATE between", value1, value2, "vsDate");
            return (Criteria) this;
        }

        public Criteria andVsDateNotBetween(Date value1, Date value2) {
            addCriterion("VS_DATE not between", value1, value2, "vsDate");
            return (Criteria) this;
        }

        public Criteria andVsHourIsNull() {
            addCriterion("VS_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andVsHourIsNotNull() {
            addCriterion("VS_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andVsHourEqualTo(String value) {
            addCriterion("VS_HOUR =", value, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsHourNotEqualTo(String value) {
            addCriterion("VS_HOUR <>", value, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsHourGreaterThan(String value) {
            addCriterion("VS_HOUR >", value, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsHourGreaterThanOrEqualTo(String value) {
            addCriterion("VS_HOUR >=", value, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsHourLessThan(String value) {
            addCriterion("VS_HOUR <", value, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsHourLessThanOrEqualTo(String value) {
            addCriterion("VS_HOUR <=", value, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsHourLike(String value) {
            addCriterion("VS_HOUR like", value, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsHourNotLike(String value) {
            addCriterion("VS_HOUR not like", value, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsHourIn(List<String> values) {
            addCriterion("VS_HOUR in", values, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsHourNotIn(List<String> values) {
            addCriterion("VS_HOUR not in", values, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsHourBetween(String value1, String value2) {
            addCriterion("VS_HOUR between", value1, value2, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsHourNotBetween(String value1, String value2) {
            addCriterion("VS_HOUR not between", value1, value2, "vsHour");
            return (Criteria) this;
        }

        public Criteria andVsRsltIsNull() {
            addCriterion("VS_RSLT is null");
            return (Criteria) this;
        }

        public Criteria andVsRsltIsNotNull() {
            addCriterion("VS_RSLT is not null");
            return (Criteria) this;
        }

        public Criteria andVsRsltEqualTo(String value) {
            addCriterion("VS_RSLT =", value, "vsRslt");
            return (Criteria) this;
        }

        public Criteria andVsRsltNotEqualTo(String value) {
            addCriterion("VS_RSLT <>", value, "vsRslt");
            return (Criteria) this;
        }

        public Criteria andVsRsltGreaterThan(String value) {
            addCriterion("VS_RSLT >", value, "vsRslt");
            return (Criteria) this;
        }

        public Criteria andVsRsltGreaterThanOrEqualTo(String value) {
            addCriterion("VS_RSLT >=", value, "vsRslt");
            return (Criteria) this;
        }

        public Criteria andVsRsltLessThan(String value) {
            addCriterion("VS_RSLT <", value, "vsRslt");
            return (Criteria) this;
        }

        public Criteria andVsRsltLessThanOrEqualTo(String value) {
            addCriterion("VS_RSLT <=", value, "vsRslt");
            return (Criteria) this;
        }

        public Criteria andVsRsltLike(String value) {
            addCriterion("VS_RSLT like", value, "vsRslt");
            return (Criteria) this;
        }

        public Criteria andVsRsltNotLike(String value) {
            addCriterion("VS_RSLT not like", value, "vsRslt");
            return (Criteria) this;
        }

        public Criteria andVsRsltIn(List<String> values) {
            addCriterion("VS_RSLT in", values, "vsRslt");
            return (Criteria) this;
        }

        public Criteria andVsRsltNotIn(List<String> values) {
            addCriterion("VS_RSLT not in", values, "vsRslt");
            return (Criteria) this;
        }

        public Criteria andVsRsltBetween(String value1, String value2) {
            addCriterion("VS_RSLT between", value1, value2, "vsRslt");
            return (Criteria) this;
        }

        public Criteria andVsRsltNotBetween(String value1, String value2) {
            addCriterion("VS_RSLT not between", value1, value2, "vsRslt");
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