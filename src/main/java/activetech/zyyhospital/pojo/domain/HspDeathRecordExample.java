package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspDeathRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDeathRecordExample() {
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

        public Criteria andDeathRecordSeqIsNull() {
            addCriterion("DEATH_RECORD_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqIsNotNull() {
            addCriterion("DEATH_RECORD_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqEqualTo(String value) {
            addCriterion("DEATH_RECORD_SEQ =", value, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqNotEqualTo(String value) {
            addCriterion("DEATH_RECORD_SEQ <>", value, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqGreaterThan(String value) {
            addCriterion("DEATH_RECORD_SEQ >", value, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqGreaterThanOrEqualTo(String value) {
            addCriterion("DEATH_RECORD_SEQ >=", value, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqLessThan(String value) {
            addCriterion("DEATH_RECORD_SEQ <", value, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqLessThanOrEqualTo(String value) {
            addCriterion("DEATH_RECORD_SEQ <=", value, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqLike(String value) {
            addCriterion("DEATH_RECORD_SEQ like", value, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqNotLike(String value) {
            addCriterion("DEATH_RECORD_SEQ not like", value, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqIn(List<String> values) {
            addCriterion("DEATH_RECORD_SEQ in", values, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqNotIn(List<String> values) {
            addCriterion("DEATH_RECORD_SEQ not in", values, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqBetween(String value1, String value2) {
            addCriterion("DEATH_RECORD_SEQ between", value1, value2, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andDeathRecordSeqNotBetween(String value1, String value2) {
            addCriterion("DEATH_RECORD_SEQ not between", value1, value2, "deathRecordSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrIsNull() {
            addCriterion("EMG_SEQ_DR is null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrIsNotNull() {
            addCriterion("EMG_SEQ_DR is not null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrEqualTo(String value) {
            addCriterion("EMG_SEQ_DR =", value, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrNotEqualTo(String value) {
            addCriterion("EMG_SEQ_DR <>", value, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrGreaterThan(String value) {
            addCriterion("EMG_SEQ_DR >", value, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ_DR >=", value, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrLessThan(String value) {
            addCriterion("EMG_SEQ_DR <", value, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrLessThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ_DR <=", value, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrLike(String value) {
            addCriterion("EMG_SEQ_DR like", value, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrNotLike(String value) {
            addCriterion("EMG_SEQ_DR not like", value, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrIn(List<String> values) {
            addCriterion("EMG_SEQ_DR in", values, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrNotIn(List<String> values) {
            addCriterion("EMG_SEQ_DR not in", values, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrBetween(String value1, String value2) {
            addCriterion("EMG_SEQ_DR between", value1, value2, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqDrNotBetween(String value1, String value2) {
            addCriterion("EMG_SEQ_DR not between", value1, value2, "emgSeqDr");
            return (Criteria) this;
        }

        public Criteria andComeTimeIsNull() {
            addCriterion("COME_TIME is null");
            return (Criteria) this;
        }

        public Criteria andComeTimeIsNotNull() {
            addCriterion("COME_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andComeTimeEqualTo(Date value) {
            addCriterion("COME_TIME =", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotEqualTo(Date value) {
            addCriterion("COME_TIME <>", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeGreaterThan(Date value) {
            addCriterion("COME_TIME >", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COME_TIME >=", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeLessThan(Date value) {
            addCriterion("COME_TIME <", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeLessThanOrEqualTo(Date value) {
            addCriterion("COME_TIME <=", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeIn(List<Date> values) {
            addCriterion("COME_TIME in", values, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotIn(List<Date> values) {
            addCriterion("COME_TIME not in", values, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeBetween(Date value1, Date value2) {
            addCriterion("COME_TIME between", value1, value2, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotBetween(Date value1, Date value2) {
            addCriterion("COME_TIME not between", value1, value2, "comeTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeIsNull() {
            addCriterion("DEATH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDeathTimeIsNotNull() {
            addCriterion("DEATH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeathTimeEqualTo(Date value) {
            addCriterion("DEATH_TIME =", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeNotEqualTo(Date value) {
            addCriterion("DEATH_TIME <>", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeGreaterThan(Date value) {
            addCriterion("DEATH_TIME >", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DEATH_TIME >=", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeLessThan(Date value) {
            addCriterion("DEATH_TIME <", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeLessThanOrEqualTo(Date value) {
            addCriterion("DEATH_TIME <=", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeIn(List<Date> values) {
            addCriterion("DEATH_TIME in", values, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeNotIn(List<Date> values) {
            addCriterion("DEATH_TIME not in", values, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeBetween(Date value1, Date value2) {
            addCriterion("DEATH_TIME between", value1, value2, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeNotBetween(Date value1, Date value2) {
            addCriterion("DEATH_TIME not between", value1, value2, "deathTime");
            return (Criteria) this;
        }

        public Criteria andCauseDeathIsNull() {
            addCriterion("CAUSE_DEATH is null");
            return (Criteria) this;
        }

        public Criteria andCauseDeathIsNotNull() {
            addCriterion("CAUSE_DEATH is not null");
            return (Criteria) this;
        }

        public Criteria andCauseDeathEqualTo(String value) {
            addCriterion("CAUSE_DEATH =", value, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCauseDeathNotEqualTo(String value) {
            addCriterion("CAUSE_DEATH <>", value, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCauseDeathGreaterThan(String value) {
            addCriterion("CAUSE_DEATH >", value, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCauseDeathGreaterThanOrEqualTo(String value) {
            addCriterion("CAUSE_DEATH >=", value, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCauseDeathLessThan(String value) {
            addCriterion("CAUSE_DEATH <", value, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCauseDeathLessThanOrEqualTo(String value) {
            addCriterion("CAUSE_DEATH <=", value, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCauseDeathLike(String value) {
            addCriterion("CAUSE_DEATH like", value, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCauseDeathNotLike(String value) {
            addCriterion("CAUSE_DEATH not like", value, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCauseDeathIn(List<String> values) {
            addCriterion("CAUSE_DEATH in", values, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCauseDeathNotIn(List<String> values) {
            addCriterion("CAUSE_DEATH not in", values, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCauseDeathBetween(String value1, String value2) {
            addCriterion("CAUSE_DEATH between", value1, value2, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCauseDeathNotBetween(String value1, String value2) {
            addCriterion("CAUSE_DEATH not between", value1, value2, "causeDeath");
            return (Criteria) this;
        }

        public Criteria andCourseDateIsNull() {
            addCriterion("COURSE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCourseDateIsNotNull() {
            addCriterion("COURSE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDateEqualTo(Date value) {
            addCriterion("COURSE_DATE =", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotEqualTo(Date value) {
            addCriterion("COURSE_DATE <>", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateGreaterThan(Date value) {
            addCriterion("COURSE_DATE >", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("COURSE_DATE >=", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateLessThan(Date value) {
            addCriterion("COURSE_DATE <", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateLessThanOrEqualTo(Date value) {
            addCriterion("COURSE_DATE <=", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateIn(List<Date> values) {
            addCriterion("COURSE_DATE in", values, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotIn(List<Date> values) {
            addCriterion("COURSE_DATE not in", values, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateBetween(Date value1, Date value2) {
            addCriterion("COURSE_DATE between", value1, value2, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotBetween(Date value1, Date value2) {
            addCriterion("COURSE_DATE not between", value1, value2, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateDocIsNull() {
            addCriterion("CREATE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andCreateDocIsNotNull() {
            addCriterion("CREATE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDocEqualTo(String value) {
            addCriterion("CREATE_DOC =", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotEqualTo(String value) {
            addCriterion("CREATE_DOC <>", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocGreaterThan(String value) {
            addCriterion("CREATE_DOC >", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DOC >=", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLessThan(String value) {
            addCriterion("CREATE_DOC <", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DOC <=", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLike(String value) {
            addCriterion("CREATE_DOC like", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotLike(String value) {
            addCriterion("CREATE_DOC not like", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocIn(List<String> values) {
            addCriterion("CREATE_DOC in", values, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotIn(List<String> values) {
            addCriterion("CREATE_DOC not in", values, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocBetween(String value1, String value2) {
            addCriterion("CREATE_DOC between", value1, value2, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotBetween(String value1, String value2) {
            addCriterion("CREATE_DOC not between", value1, value2, "createDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIsNull() {
            addCriterion("UPDATE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIsNotNull() {
            addCriterion("UPDATE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDocEqualTo(String value) {
            addCriterion("UPDATE_DOC =", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotEqualTo(String value) {
            addCriterion("UPDATE_DOC <>", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocGreaterThan(String value) {
            addCriterion("UPDATE_DOC >", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DOC >=", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLessThan(String value) {
            addCriterion("UPDATE_DOC <", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DOC <=", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLike(String value) {
            addCriterion("UPDATE_DOC like", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotLike(String value) {
            addCriterion("UPDATE_DOC not like", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIn(List<String> values) {
            addCriterion("UPDATE_DOC in", values, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotIn(List<String> values) {
            addCriterion("UPDATE_DOC not in", values, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocBetween(String value1, String value2) {
            addCriterion("UPDATE_DOC between", value1, value2, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DOC not between", value1, value2, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andCreateNamIsNull() {
            addCriterion("CREATE_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCreateNamIsNotNull() {
            addCriterion("CREATE_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNamEqualTo(String value) {
            addCriterion("CREATE_NAM =", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotEqualTo(String value) {
            addCriterion("CREATE_NAM <>", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamGreaterThan(String value) {
            addCriterion("CREATE_NAM >", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_NAM >=", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamLessThan(String value) {
            addCriterion("CREATE_NAM <", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamLessThanOrEqualTo(String value) {
            addCriterion("CREATE_NAM <=", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamLike(String value) {
            addCriterion("CREATE_NAM like", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotLike(String value) {
            addCriterion("CREATE_NAM not like", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamIn(List<String> values) {
            addCriterion("CREATE_NAM in", values, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotIn(List<String> values) {
            addCriterion("CREATE_NAM not in", values, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamBetween(String value1, String value2) {
            addCriterion("CREATE_NAM between", value1, value2, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotBetween(String value1, String value2) {
            addCriterion("CREATE_NAM not between", value1, value2, "createNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIsNull() {
            addCriterion("UPDATE_NAM is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIsNotNull() {
            addCriterion("UPDATE_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNamEqualTo(String value) {
            addCriterion("UPDATE_NAM =", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotEqualTo(String value) {
            addCriterion("UPDATE_NAM <>", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamGreaterThan(String value) {
            addCriterion("UPDATE_NAM >", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAM >=", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLessThan(String value) {
            addCriterion("UPDATE_NAM <", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAM <=", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLike(String value) {
            addCriterion("UPDATE_NAM like", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotLike(String value) {
            addCriterion("UPDATE_NAM not like", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIn(List<String> values) {
            addCriterion("UPDATE_NAM in", values, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotIn(List<String> values) {
            addCriterion("UPDATE_NAM not in", values, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamBetween(String value1, String value2) {
            addCriterion("UPDATE_NAM between", value1, value2, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotBetween(String value1, String value2) {
            addCriterion("UPDATE_NAM not between", value1, value2, "updateNam");
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