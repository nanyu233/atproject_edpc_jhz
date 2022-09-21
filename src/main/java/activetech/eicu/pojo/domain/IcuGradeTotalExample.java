package activetech.eicu.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IcuGradeTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcuGradeTotalExample() {
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

        public Criteria andGradeSeqIsNull() {
            addCriterion("GRADE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andGradeSeqIsNotNull() {
            addCriterion("GRADE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andGradeSeqEqualTo(String value) {
            addCriterion("GRADE_SEQ =", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqNotEqualTo(String value) {
            addCriterion("GRADE_SEQ <>", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqGreaterThan(String value) {
            addCriterion("GRADE_SEQ >", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_SEQ >=", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqLessThan(String value) {
            addCriterion("GRADE_SEQ <", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqLessThanOrEqualTo(String value) {
            addCriterion("GRADE_SEQ <=", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqLike(String value) {
            addCriterion("GRADE_SEQ like", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqNotLike(String value) {
            addCriterion("GRADE_SEQ not like", value, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqIn(List<String> values) {
            addCriterion("GRADE_SEQ in", values, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqNotIn(List<String> values) {
            addCriterion("GRADE_SEQ not in", values, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqBetween(String value1, String value2) {
            addCriterion("GRADE_SEQ between", value1, value2, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeSeqNotBetween(String value1, String value2) {
            addCriterion("GRADE_SEQ not between", value1, value2, "gradeSeq");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIsNull() {
            addCriterion("GRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIsNotNull() {
            addCriterion("GRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeEqualTo(String value) {
            addCriterion("GRADE_TYPE =", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotEqualTo(String value) {
            addCriterion("GRADE_TYPE <>", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThan(String value) {
            addCriterion("GRADE_TYPE >", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_TYPE >=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThan(String value) {
            addCriterion("GRADE_TYPE <", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThanOrEqualTo(String value) {
            addCriterion("GRADE_TYPE <=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLike(String value) {
            addCriterion("GRADE_TYPE like", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotLike(String value) {
            addCriterion("GRADE_TYPE not like", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIn(List<String> values) {
            addCriterion("GRADE_TYPE in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotIn(List<String> values) {
            addCriterion("GRADE_TYPE not in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeBetween(String value1, String value2) {
            addCriterion("GRADE_TYPE between", value1, value2, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotBetween(String value1, String value2) {
            addCriterion("GRADE_TYPE not between", value1, value2, "gradeType");
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

        public Criteria andGradeScoIsNull() {
            addCriterion("GRADE_SCO is null");
            return (Criteria) this;
        }

        public Criteria andGradeScoIsNotNull() {
            addCriterion("GRADE_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andGradeScoEqualTo(String value) {
            addCriterion("GRADE_SCO =", value, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeScoNotEqualTo(String value) {
            addCriterion("GRADE_SCO <>", value, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeScoGreaterThan(String value) {
            addCriterion("GRADE_SCO >", value, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeScoGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_SCO >=", value, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeScoLessThan(String value) {
            addCriterion("GRADE_SCO <", value, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeScoLessThanOrEqualTo(String value) {
            addCriterion("GRADE_SCO <=", value, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeScoLike(String value) {
            addCriterion("GRADE_SCO like", value, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeScoNotLike(String value) {
            addCriterion("GRADE_SCO not like", value, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeScoIn(List<String> values) {
            addCriterion("GRADE_SCO in", values, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeScoNotIn(List<String> values) {
            addCriterion("GRADE_SCO not in", values, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeScoBetween(String value1, String value2) {
            addCriterion("GRADE_SCO between", value1, value2, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeScoNotBetween(String value1, String value2) {
            addCriterion("GRADE_SCO not between", value1, value2, "gradeSco");
            return (Criteria) this;
        }

        public Criteria andGradeDetlIsNull() {
            addCriterion("GRADE_DETL is null");
            return (Criteria) this;
        }

        public Criteria andGradeDetlIsNotNull() {
            addCriterion("GRADE_DETL is not null");
            return (Criteria) this;
        }

        public Criteria andGradeDetlEqualTo(String value) {
            addCriterion("GRADE_DETL =", value, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeDetlNotEqualTo(String value) {
            addCriterion("GRADE_DETL <>", value, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeDetlGreaterThan(String value) {
            addCriterion("GRADE_DETL >", value, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeDetlGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_DETL >=", value, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeDetlLessThan(String value) {
            addCriterion("GRADE_DETL <", value, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeDetlLessThanOrEqualTo(String value) {
            addCriterion("GRADE_DETL <=", value, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeDetlLike(String value) {
            addCriterion("GRADE_DETL like", value, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeDetlNotLike(String value) {
            addCriterion("GRADE_DETL not like", value, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeDetlIn(List<String> values) {
            addCriterion("GRADE_DETL in", values, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeDetlNotIn(List<String> values) {
            addCriterion("GRADE_DETL not in", values, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeDetlBetween(String value1, String value2) {
            addCriterion("GRADE_DETL between", value1, value2, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeDetlNotBetween(String value1, String value2) {
            addCriterion("GRADE_DETL not between", value1, value2, "gradeDetl");
            return (Criteria) this;
        }

        public Criteria andGradeTimeIsNull() {
            addCriterion("GRADE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGradeTimeIsNotNull() {
            addCriterion("GRADE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTimeEqualTo(Date value) {
            addCriterion("GRADE_TIME =", value, "gradeTime");
            return (Criteria) this;
        }

        public Criteria andGradeTimeNotEqualTo(Date value) {
            addCriterion("GRADE_TIME <>", value, "gradeTime");
            return (Criteria) this;
        }

        public Criteria andGradeTimeGreaterThan(Date value) {
            addCriterion("GRADE_TIME >", value, "gradeTime");
            return (Criteria) this;
        }

        public Criteria andGradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GRADE_TIME >=", value, "gradeTime");
            return (Criteria) this;
        }

        public Criteria andGradeTimeLessThan(Date value) {
            addCriterion("GRADE_TIME <", value, "gradeTime");
            return (Criteria) this;
        }

        public Criteria andGradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("GRADE_TIME <=", value, "gradeTime");
            return (Criteria) this;
        }

        public Criteria andGradeTimeIn(List<Date> values) {
            addCriterion("GRADE_TIME in", values, "gradeTime");
            return (Criteria) this;
        }

        public Criteria andGradeTimeNotIn(List<Date> values) {
            addCriterion("GRADE_TIME not in", values, "gradeTime");
            return (Criteria) this;
        }

        public Criteria andGradeTimeBetween(Date value1, Date value2) {
            addCriterion("GRADE_TIME between", value1, value2, "gradeTime");
            return (Criteria) this;
        }

        public Criteria andGradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("GRADE_TIME not between", value1, value2, "gradeTime");
            return (Criteria) this;
        }

        public Criteria andGradeUserIsNull() {
            addCriterion("GRADE_USER is null");
            return (Criteria) this;
        }

        public Criteria andGradeUserIsNotNull() {
            addCriterion("GRADE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andGradeUserEqualTo(String value) {
            addCriterion("GRADE_USER =", value, "gradeUser");
            return (Criteria) this;
        }

        public Criteria andGradeUserNotEqualTo(String value) {
            addCriterion("GRADE_USER <>", value, "gradeUser");
            return (Criteria) this;
        }

        public Criteria andGradeUserGreaterThan(String value) {
            addCriterion("GRADE_USER >", value, "gradeUser");
            return (Criteria) this;
        }

        public Criteria andGradeUserGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_USER >=", value, "gradeUser");
            return (Criteria) this;
        }

        public Criteria andGradeUserLessThan(String value) {
            addCriterion("GRADE_USER <", value, "gradeUser");
            return (Criteria) this;
        }

        public Criteria andGradeUserLessThanOrEqualTo(String value) {
            addCriterion("GRADE_USER <=", value, "gradeUser");
            return (Criteria) this;
        }

        public Criteria andGradeUserLike(String value) {
            addCriterion("GRADE_USER like", value, "gradeUser");
            return (Criteria) this;
        }

        public Criteria andGradeUserNotLike(String value) {
            addCriterion("GRADE_USER not like", value, "gradeUser");
            return (Criteria) this;
        }

        public Criteria andGradeUserIn(List<String> values) {
            addCriterion("GRADE_USER in", values, "gradeUser");
            return (Criteria) this;
        }

        public Criteria andGradeUserNotIn(List<String> values) {
            addCriterion("GRADE_USER not in", values, "gradeUser");
            return (Criteria) this;
        }

        public Criteria andGradeUserBetween(String value1, String value2) {
            addCriterion("GRADE_USER between", value1, value2, "gradeUser");
            return (Criteria) this;
        }

        public Criteria andGradeUserNotBetween(String value1, String value2) {
            addCriterion("GRADE_USER not between", value1, value2, "gradeUser");
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