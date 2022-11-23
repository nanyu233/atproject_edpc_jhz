package activetech.structtext.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DstcasesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DstcasesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCaseSeqIsNull() {
            addCriterion("CASE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andCaseSeqIsNotNull() {
            addCriterion("CASE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCaseSeqEqualTo(String value) {
            addCriterion("CASE_SEQ =", value, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseSeqNotEqualTo(String value) {
            addCriterion("CASE_SEQ <>", value, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseSeqGreaterThan(String value) {
            addCriterion("CASE_SEQ >", value, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseSeqGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_SEQ >=", value, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseSeqLessThan(String value) {
            addCriterion("CASE_SEQ <", value, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseSeqLessThanOrEqualTo(String value) {
            addCriterion("CASE_SEQ <=", value, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseSeqLike(String value) {
            addCriterion("CASE_SEQ like", value, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseSeqNotLike(String value) {
            addCriterion("CASE_SEQ not like", value, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseSeqIn(List<String> values) {
            addCriterion("CASE_SEQ in", values, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseSeqNotIn(List<String> values) {
            addCriterion("CASE_SEQ not in", values, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseSeqBetween(String value1, String value2) {
            addCriterion("CASE_SEQ between", value1, value2, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseSeqNotBetween(String value1, String value2) {
            addCriterion("CASE_SEQ not between", value1, value2, "caseSeq");
            return (Criteria) this;
        }

        public Criteria andCaseStatIsNull() {
            addCriterion("CASE_STAT is null");
            return (Criteria) this;
        }

        public Criteria andCaseStatIsNotNull() {
            addCriterion("CASE_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andCaseStatEqualTo(String value) {
            addCriterion("CASE_STAT =", value, "caseStat");
            return (Criteria) this;
        }

        public Criteria andCaseStatNotEqualTo(String value) {
            addCriterion("CASE_STAT <>", value, "caseStat");
            return (Criteria) this;
        }

        public Criteria andCaseStatGreaterThan(String value) {
            addCriterion("CASE_STAT >", value, "caseStat");
            return (Criteria) this;
        }

        public Criteria andCaseStatGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_STAT >=", value, "caseStat");
            return (Criteria) this;
        }

        public Criteria andCaseStatLessThan(String value) {
            addCriterion("CASE_STAT <", value, "caseStat");
            return (Criteria) this;
        }

        public Criteria andCaseStatLessThanOrEqualTo(String value) {
            addCriterion("CASE_STAT <=", value, "caseStat");
            return (Criteria) this;
        }

        public Criteria andCaseStatLike(String value) {
            addCriterion("CASE_STAT like", value, "caseStat");
            return (Criteria) this;
        }

        public Criteria andCaseStatNotLike(String value) {
            addCriterion("CASE_STAT not like", value, "caseStat");
            return (Criteria) this;
        }

        public Criteria andCaseStatIn(List<String> values) {
            addCriterion("CASE_STAT in", values, "caseStat");
            return (Criteria) this;
        }

        public Criteria andCaseStatNotIn(List<String> values) {
            addCriterion("CASE_STAT not in", values, "caseStat");
            return (Criteria) this;
        }

        public Criteria andCaseStatBetween(String value1, String value2) {
            addCriterion("CASE_STAT between", value1, value2, "caseStat");
            return (Criteria) this;
        }

        public Criteria andCaseStatNotBetween(String value1, String value2) {
            addCriterion("CASE_STAT not between", value1, value2, "caseStat");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNull() {
            addCriterion("SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(String value) {
            addCriterion("SYS_ID =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(String value) {
            addCriterion("SYS_ID <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(String value) {
            addCriterion("SYS_ID >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ID >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(String value) {
            addCriterion("SYS_ID <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(String value) {
            addCriterion("SYS_ID <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLike(String value) {
            addCriterion("SYS_ID like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotLike(String value) {
            addCriterion("SYS_ID not like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<String> values) {
            addCriterion("SYS_ID in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<String> values) {
            addCriterion("SYS_ID not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(String value1, String value2) {
            addCriterion("SYS_ID between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(String value1, String value2) {
            addCriterion("SYS_ID not between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNull() {
            addCriterion("PATIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("PATIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(String value) {
            addCriterion("PATIENT_ID =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(String value) {
            addCriterion("PATIENT_ID <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(String value) {
            addCriterion("PATIENT_ID >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_ID >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(String value) {
            addCriterion("PATIENT_ID <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_ID <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLike(String value) {
            addCriterion("PATIENT_ID like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotLike(String value) {
            addCriterion("PATIENT_ID not like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<String> values) {
            addCriterion("PATIENT_ID in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<String> values) {
            addCriterion("PATIENT_ID not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(String value1, String value2) {
            addCriterion("PATIENT_ID between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(String value1, String value2) {
            addCriterion("PATIENT_ID not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("PATIENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("PATIENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("PATIENT_NAME =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("PATIENT_NAME <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("PATIENT_NAME >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_NAME >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("PATIENT_NAME <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_NAME <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("PATIENT_NAME like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("PATIENT_NAME not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("PATIENT_NAME in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("PATIENT_NAME not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("PATIENT_NAME between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("PATIENT_NAME not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andTempSeqIsNull() {
            addCriterion("TEMP_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTempSeqIsNotNull() {
            addCriterion("TEMP_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTempSeqEqualTo(String value) {
            addCriterion("TEMP_SEQ =", value, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andTempSeqNotEqualTo(String value) {
            addCriterion("TEMP_SEQ <>", value, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andTempSeqGreaterThan(String value) {
            addCriterion("TEMP_SEQ >", value, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andTempSeqGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_SEQ >=", value, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andTempSeqLessThan(String value) {
            addCriterion("TEMP_SEQ <", value, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andTempSeqLessThanOrEqualTo(String value) {
            addCriterion("TEMP_SEQ <=", value, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andTempSeqLike(String value) {
            addCriterion("TEMP_SEQ like", value, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andTempSeqNotLike(String value) {
            addCriterion("TEMP_SEQ not like", value, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andTempSeqIn(List<String> values) {
            addCriterion("TEMP_SEQ in", values, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andTempSeqNotIn(List<String> values) {
            addCriterion("TEMP_SEQ not in", values, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andTempSeqBetween(String value1, String value2) {
            addCriterion("TEMP_SEQ between", value1, value2, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andTempSeqNotBetween(String value1, String value2) {
            addCriterion("TEMP_SEQ not between", value1, value2, "tempSeq");
            return (Criteria) this;
        }

        public Criteria andCaseDetlIsNull() {
            addCriterion("CASE_DETL is null");
            return (Criteria) this;
        }

        public Criteria andCaseDetlIsNotNull() {
            addCriterion("CASE_DETL is not null");
            return (Criteria) this;
        }

        public Criteria andCaseDetlEqualTo(String value) {
            addCriterion("CASE_DETL =", value, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseDetlNotEqualTo(String value) {
            addCriterion("CASE_DETL <>", value, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseDetlGreaterThan(String value) {
            addCriterion("CASE_DETL >", value, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseDetlGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_DETL >=", value, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseDetlLessThan(String value) {
            addCriterion("CASE_DETL <", value, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseDetlLessThanOrEqualTo(String value) {
            addCriterion("CASE_DETL <=", value, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseDetlLike(String value) {
            addCriterion("CASE_DETL like", value, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseDetlNotLike(String value) {
            addCriterion("CASE_DETL not like", value, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseDetlIn(List<String> values) {
            addCriterion("CASE_DETL in", values, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseDetlNotIn(List<String> values) {
            addCriterion("CASE_DETL not in", values, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseDetlBetween(String value1, String value2) {
            addCriterion("CASE_DETL between", value1, value2, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseDetlNotBetween(String value1, String value2) {
            addCriterion("CASE_DETL not between", value1, value2, "caseDetl");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIsNull() {
            addCriterion("CASE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIsNotNull() {
            addCriterion("CASE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CASE_TIME =", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CASE_TIME <>", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CASE_TIME >", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CASE_TIME >=", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeLessThan(Date value) {
            addCriterionForJDBCDate("CASE_TIME <", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CASE_TIME <=", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CASE_TIME in", values, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CASE_TIME not in", values, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CASE_TIME between", value1, value2, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CASE_TIME not between", value1, value2, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseUserIsNull() {
            addCriterion("CASE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCaseUserIsNotNull() {
            addCriterion("CASE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCaseUserEqualTo(String value) {
            addCriterion("CASE_USER =", value, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseUserNotEqualTo(String value) {
            addCriterion("CASE_USER <>", value, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseUserGreaterThan(String value) {
            addCriterion("CASE_USER >", value, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseUserGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_USER >=", value, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseUserLessThan(String value) {
            addCriterion("CASE_USER <", value, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseUserLessThanOrEqualTo(String value) {
            addCriterion("CASE_USER <=", value, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseUserLike(String value) {
            addCriterion("CASE_USER like", value, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseUserNotLike(String value) {
            addCriterion("CASE_USER not like", value, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseUserIn(List<String> values) {
            addCriterion("CASE_USER in", values, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseUserNotIn(List<String> values) {
            addCriterion("CASE_USER not in", values, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseUserBetween(String value1, String value2) {
            addCriterion("CASE_USER between", value1, value2, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseUserNotBetween(String value1, String value2) {
            addCriterion("CASE_USER not between", value1, value2, "caseUser");
            return (Criteria) this;
        }

        public Criteria andCaseNameIsNull() {
            addCriterion("CASE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCaseNameIsNotNull() {
            addCriterion("CASE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNameEqualTo(String value) {
            addCriterion("CASE_NAME =", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotEqualTo(String value) {
            addCriterion("CASE_NAME <>", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameGreaterThan(String value) {
            addCriterion("CASE_NAME >", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_NAME >=", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLessThan(String value) {
            addCriterion("CASE_NAME <", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLessThanOrEqualTo(String value) {
            addCriterion("CASE_NAME <=", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLike(String value) {
            addCriterion("CASE_NAME like", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotLike(String value) {
            addCriterion("CASE_NAME not like", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameIn(List<String> values) {
            addCriterion("CASE_NAME in", values, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotIn(List<String> values) {
            addCriterion("CASE_NAME not in", values, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameBetween(String value1, String value2) {
            addCriterion("CASE_NAME between", value1, value2, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotBetween(String value1, String value2) {
            addCriterion("CASE_NAME not between", value1, value2, "caseName");
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
            addCriterionForJDBCDate("CRT_TIME =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIME <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CRT_TIME >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIME >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterionForJDBCDate("CRT_TIME <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIME <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_TIME in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_TIME not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_TIME between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_TIME not between", value1, value2, "crtTime");
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

        public Criteria andCrtUserNameIsNull() {
            addCriterion("CRT_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameIsNotNull() {
            addCriterion("CRT_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameEqualTo(String value) {
            addCriterion("CRT_USER_NAME =", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameNotEqualTo(String value) {
            addCriterion("CRT_USER_NAME <>", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameGreaterThan(String value) {
            addCriterion("CRT_USER_NAME >", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USER_NAME >=", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameLessThan(String value) {
            addCriterion("CRT_USER_NAME <", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameLessThanOrEqualTo(String value) {
            addCriterion("CRT_USER_NAME <=", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameLike(String value) {
            addCriterion("CRT_USER_NAME like", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameNotLike(String value) {
            addCriterion("CRT_USER_NAME not like", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameIn(List<String> values) {
            addCriterion("CRT_USER_NAME in", values, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameNotIn(List<String> values) {
            addCriterion("CRT_USER_NAME not in", values, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameBetween(String value1, String value2) {
            addCriterion("CRT_USER_NAME between", value1, value2, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameNotBetween(String value1, String value2) {
            addCriterion("CRT_USER_NAME not between", value1, value2, "crtUserName");
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
            addCriterionForJDBCDate("MOD_TIME =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("MOD_TIME <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("MOD_TIME >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MOD_TIME >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterionForJDBCDate("MOD_TIME <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MOD_TIME <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterionForJDBCDate("MOD_TIME in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("MOD_TIME not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MOD_TIME between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MOD_TIME not between", value1, value2, "modTime");
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

        public Criteria andModUserNameIsNull() {
            addCriterion("MOD_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andModUserNameIsNotNull() {
            addCriterion("MOD_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andModUserNameEqualTo(String value) {
            addCriterion("MOD_USER_NAME =", value, "modUserName");
            return (Criteria) this;
        }

        public Criteria andModUserNameNotEqualTo(String value) {
            addCriterion("MOD_USER_NAME <>", value, "modUserName");
            return (Criteria) this;
        }

        public Criteria andModUserNameGreaterThan(String value) {
            addCriterion("MOD_USER_NAME >", value, "modUserName");
            return (Criteria) this;
        }

        public Criteria andModUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USER_NAME >=", value, "modUserName");
            return (Criteria) this;
        }

        public Criteria andModUserNameLessThan(String value) {
            addCriterion("MOD_USER_NAME <", value, "modUserName");
            return (Criteria) this;
        }

        public Criteria andModUserNameLessThanOrEqualTo(String value) {
            addCriterion("MOD_USER_NAME <=", value, "modUserName");
            return (Criteria) this;
        }

        public Criteria andModUserNameLike(String value) {
            addCriterion("MOD_USER_NAME like", value, "modUserName");
            return (Criteria) this;
        }

        public Criteria andModUserNameNotLike(String value) {
            addCriterion("MOD_USER_NAME not like", value, "modUserName");
            return (Criteria) this;
        }

        public Criteria andModUserNameIn(List<String> values) {
            addCriterion("MOD_USER_NAME in", values, "modUserName");
            return (Criteria) this;
        }

        public Criteria andModUserNameNotIn(List<String> values) {
            addCriterion("MOD_USER_NAME not in", values, "modUserName");
            return (Criteria) this;
        }

        public Criteria andModUserNameBetween(String value1, String value2) {
            addCriterion("MOD_USER_NAME between", value1, value2, "modUserName");
            return (Criteria) this;
        }

        public Criteria andModUserNameNotBetween(String value1, String value2) {
            addCriterion("MOD_USER_NAME not between", value1, value2, "modUserName");
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