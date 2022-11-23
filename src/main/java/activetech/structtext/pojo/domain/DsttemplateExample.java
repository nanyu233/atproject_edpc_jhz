package activetech.structtext.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DsttemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DsttemplateExample() {
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

        public Criteria andTempCodeIsNull() {
            addCriterion("TEMP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTempCodeIsNotNull() {
            addCriterion("TEMP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTempCodeEqualTo(String value) {
            addCriterion("TEMP_CODE =", value, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempCodeNotEqualTo(String value) {
            addCriterion("TEMP_CODE <>", value, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempCodeGreaterThan(String value) {
            addCriterion("TEMP_CODE >", value, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_CODE >=", value, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempCodeLessThan(String value) {
            addCriterion("TEMP_CODE <", value, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempCodeLessThanOrEqualTo(String value) {
            addCriterion("TEMP_CODE <=", value, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempCodeLike(String value) {
            addCriterion("TEMP_CODE like", value, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempCodeNotLike(String value) {
            addCriterion("TEMP_CODE not like", value, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempCodeIn(List<String> values) {
            addCriterion("TEMP_CODE in", values, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempCodeNotIn(List<String> values) {
            addCriterion("TEMP_CODE not in", values, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempCodeBetween(String value1, String value2) {
            addCriterion("TEMP_CODE between", value1, value2, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempCodeNotBetween(String value1, String value2) {
            addCriterion("TEMP_CODE not between", value1, value2, "tempCode");
            return (Criteria) this;
        }

        public Criteria andTempNameIsNull() {
            addCriterion("TEMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTempNameIsNotNull() {
            addCriterion("TEMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTempNameEqualTo(String value) {
            addCriterion("TEMP_NAME =", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameNotEqualTo(String value) {
            addCriterion("TEMP_NAME <>", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameGreaterThan(String value) {
            addCriterion("TEMP_NAME >", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_NAME >=", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameLessThan(String value) {
            addCriterion("TEMP_NAME <", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameLessThanOrEqualTo(String value) {
            addCriterion("TEMP_NAME <=", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameLike(String value) {
            addCriterion("TEMP_NAME like", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameNotLike(String value) {
            addCriterion("TEMP_NAME not like", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameIn(List<String> values) {
            addCriterion("TEMP_NAME in", values, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameNotIn(List<String> values) {
            addCriterion("TEMP_NAME not in", values, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameBetween(String value1, String value2) {
            addCriterion("TEMP_NAME between", value1, value2, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameNotBetween(String value1, String value2) {
            addCriterion("TEMP_NAME not between", value1, value2, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempStatIsNull() {
            addCriterion("TEMP_STAT is null");
            return (Criteria) this;
        }

        public Criteria andTempStatIsNotNull() {
            addCriterion("TEMP_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andTempStatEqualTo(String value) {
            addCriterion("TEMP_STAT =", value, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempStatNotEqualTo(String value) {
            addCriterion("TEMP_STAT <>", value, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempStatGreaterThan(String value) {
            addCriterion("TEMP_STAT >", value, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempStatGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_STAT >=", value, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempStatLessThan(String value) {
            addCriterion("TEMP_STAT <", value, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempStatLessThanOrEqualTo(String value) {
            addCriterion("TEMP_STAT <=", value, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempStatLike(String value) {
            addCriterion("TEMP_STAT like", value, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempStatNotLike(String value) {
            addCriterion("TEMP_STAT not like", value, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempStatIn(List<String> values) {
            addCriterion("TEMP_STAT in", values, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempStatNotIn(List<String> values) {
            addCriterion("TEMP_STAT not in", values, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempStatBetween(String value1, String value2) {
            addCriterion("TEMP_STAT between", value1, value2, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempStatNotBetween(String value1, String value2) {
            addCriterion("TEMP_STAT not between", value1, value2, "tempStat");
            return (Criteria) this;
        }

        public Criteria andTempPaperIsNull() {
            addCriterion("TEMP_PAPER is null");
            return (Criteria) this;
        }

        public Criteria andTempPaperIsNotNull() {
            addCriterion("TEMP_PAPER is not null");
            return (Criteria) this;
        }

        public Criteria andTempPaperEqualTo(String value) {
            addCriterion("TEMP_PAPER =", value, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPaperNotEqualTo(String value) {
            addCriterion("TEMP_PAPER <>", value, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPaperGreaterThan(String value) {
            addCriterion("TEMP_PAPER >", value, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPaperGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_PAPER >=", value, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPaperLessThan(String value) {
            addCriterion("TEMP_PAPER <", value, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPaperLessThanOrEqualTo(String value) {
            addCriterion("TEMP_PAPER <=", value, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPaperLike(String value) {
            addCriterion("TEMP_PAPER like", value, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPaperNotLike(String value) {
            addCriterion("TEMP_PAPER not like", value, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPaperIn(List<String> values) {
            addCriterion("TEMP_PAPER in", values, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPaperNotIn(List<String> values) {
            addCriterion("TEMP_PAPER not in", values, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPaperBetween(String value1, String value2) {
            addCriterion("TEMP_PAPER between", value1, value2, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPaperNotBetween(String value1, String value2) {
            addCriterion("TEMP_PAPER not between", value1, value2, "tempPaper");
            return (Criteria) this;
        }

        public Criteria andTempPrintIsNull() {
            addCriterion("TEMP_PRINT is null");
            return (Criteria) this;
        }

        public Criteria andTempPrintIsNotNull() {
            addCriterion("TEMP_PRINT is not null");
            return (Criteria) this;
        }

        public Criteria andTempPrintEqualTo(String value) {
            addCriterion("TEMP_PRINT =", value, "tempPrint");
            return (Criteria) this;
        }

        public Criteria andTempPrintNotEqualTo(String value) {
            addCriterion("TEMP_PRINT <>", value, "tempPrint");
            return (Criteria) this;
        }

        public Criteria andTempPrintGreaterThan(String value) {
            addCriterion("TEMP_PRINT >", value, "tempPrint");
            return (Criteria) this;
        }

        public Criteria andTempPrintGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_PRINT >=", value, "tempPrint");
            return (Criteria) this;
        }

        public Criteria andTempPrintLessThan(String value) {
            addCriterion("TEMP_PRINT <", value, "tempPrint");
            return (Criteria) this;
        }

        public Criteria andTempPrintLessThanOrEqualTo(String value) {
            addCriterion("TEMP_PRINT <=", value, "tempPrint");
            return (Criteria) this;
        }

        public Criteria andTempPrintLike(String value) {
            addCriterion("TEMP_PRINT like", value, "tempPrint");
            return (Criteria) this;
        }

        public Criteria andTempPrintNotLike(String value) {
            addCriterion("TEMP_PRINT not like", value, "tempPrint");
            return (Criteria) this;
        }

        public Criteria andTempPrintIn(List<String> values) {
            addCriterion("TEMP_PRINT in", values, "tempPrint");
            return (Criteria) this;
        }

        public Criteria andTempPrintNotIn(List<String> values) {
            addCriterion("TEMP_PRINT not in", values, "tempPrint");
            return (Criteria) this;
        }

        public Criteria andTempPrintBetween(String value1, String value2) {
            addCriterion("TEMP_PRINT between", value1, value2, "tempPrint");
            return (Criteria) this;
        }

        public Criteria andTempPrintNotBetween(String value1, String value2) {
            addCriterion("TEMP_PRINT not between", value1, value2, "tempPrint");
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

        public Criteria andTempMarginsIsNull() {
            addCriterion("TEMP_MARGINS is null");
            return (Criteria) this;
        }

        public Criteria andTempMarginsIsNotNull() {
            addCriterion("TEMP_MARGINS is not null");
            return (Criteria) this;
        }

        public Criteria andTempMarginsEqualTo(String value) {
            addCriterion("TEMP_MARGINS =", value, "tempMargins");
            return (Criteria) this;
        }

        public Criteria andTempMarginsNotEqualTo(String value) {
            addCriterion("TEMP_MARGINS <>", value, "tempMargins");
            return (Criteria) this;
        }

        public Criteria andTempMarginsGreaterThan(String value) {
            addCriterion("TEMP_MARGINS >", value, "tempMargins");
            return (Criteria) this;
        }

        public Criteria andTempMarginsGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_MARGINS >=", value, "tempMargins");
            return (Criteria) this;
        }

        public Criteria andTempMarginsLessThan(String value) {
            addCriterion("TEMP_MARGINS <", value, "tempMargins");
            return (Criteria) this;
        }

        public Criteria andTempMarginsLessThanOrEqualTo(String value) {
            addCriterion("TEMP_MARGINS <=", value, "tempMargins");
            return (Criteria) this;
        }

        public Criteria andTempMarginsLike(String value) {
            addCriterion("TEMP_MARGINS like", value, "tempMargins");
            return (Criteria) this;
        }

        public Criteria andTempMarginsNotLike(String value) {
            addCriterion("TEMP_MARGINS not like", value, "tempMargins");
            return (Criteria) this;
        }

        public Criteria andTempMarginsIn(List<String> values) {
            addCriterion("TEMP_MARGINS in", values, "tempMargins");
            return (Criteria) this;
        }

        public Criteria andTempMarginsNotIn(List<String> values) {
            addCriterion("TEMP_MARGINS not in", values, "tempMargins");
            return (Criteria) this;
        }

        public Criteria andTempMarginsBetween(String value1, String value2) {
            addCriterion("TEMP_MARGINS between", value1, value2, "tempMargins");
            return (Criteria) this;
        }

        public Criteria andTempMarginsNotBetween(String value1, String value2) {
            addCriterion("TEMP_MARGINS not between", value1, value2, "tempMargins");
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