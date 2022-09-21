package activetech.external.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HspJyjgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJyjgExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("PARENT_ID like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("PARENT_ID not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSamplenoIsNull() {
            addCriterion("SAMPLENO is null");
            return (Criteria) this;
        }

        public Criteria andSamplenoIsNotNull() {
            addCriterion("SAMPLENO is not null");
            return (Criteria) this;
        }

        public Criteria andSamplenoEqualTo(String value) {
            addCriterion("SAMPLENO =", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotEqualTo(String value) {
            addCriterion("SAMPLENO <>", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoGreaterThan(String value) {
            addCriterion("SAMPLENO >", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLENO >=", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoLessThan(String value) {
            addCriterion("SAMPLENO <", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoLessThanOrEqualTo(String value) {
            addCriterion("SAMPLENO <=", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoLike(String value) {
            addCriterion("SAMPLENO like", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotLike(String value) {
            addCriterion("SAMPLENO not like", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoIn(List<String> values) {
            addCriterion("SAMPLENO in", values, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotIn(List<String> values) {
            addCriterion("SAMPLENO not in", values, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoBetween(String value1, String value2) {
            addCriterion("SAMPLENO between", value1, value2, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotBetween(String value1, String value2) {
            addCriterion("SAMPLENO not between", value1, value2, "sampleno");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeIsNull() {
            addCriterion("RESULT_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeIsNotNull() {
            addCriterion("RESULT_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("RESULT_DATE_TIME =", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("RESULT_DATE_TIME <>", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("RESULT_DATE_TIME >", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RESULT_DATE_TIME >=", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeLessThan(Date value) {
            addCriterionForJDBCDate("RESULT_DATE_TIME <", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RESULT_DATE_TIME <=", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("RESULT_DATE_TIME in", values, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("RESULT_DATE_TIME not in", values, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RESULT_DATE_TIME between", value1, value2, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RESULT_DATE_TIME not between", value1, value2, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNull() {
            addCriterion("UPPER_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNotNull() {
            addCriterion("UPPER_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitEqualTo(String value) {
            addCriterion("UPPER_LIMIT =", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotEqualTo(String value) {
            addCriterion("UPPER_LIMIT <>", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThan(String value) {
            addCriterion("UPPER_LIMIT >", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThanOrEqualTo(String value) {
            addCriterion("UPPER_LIMIT >=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThan(String value) {
            addCriterion("UPPER_LIMIT <", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThanOrEqualTo(String value) {
            addCriterion("UPPER_LIMIT <=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLike(String value) {
            addCriterion("UPPER_LIMIT like", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotLike(String value) {
            addCriterion("UPPER_LIMIT not like", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIn(List<String> values) {
            addCriterion("UPPER_LIMIT in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotIn(List<String> values) {
            addCriterion("UPPER_LIMIT not in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitBetween(String value1, String value2) {
            addCriterion("UPPER_LIMIT between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotBetween(String value1, String value2) {
            addCriterion("UPPER_LIMIT not between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitIsNull() {
            addCriterion("LOWER_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitIsNotNull() {
            addCriterion("LOWER_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitEqualTo(String value) {
            addCriterion("LOWER_LIMIT =", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitNotEqualTo(String value) {
            addCriterion("LOWER_LIMIT <>", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitGreaterThan(String value) {
            addCriterion("LOWER_LIMIT >", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitGreaterThanOrEqualTo(String value) {
            addCriterion("LOWER_LIMIT >=", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitLessThan(String value) {
            addCriterion("LOWER_LIMIT <", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitLessThanOrEqualTo(String value) {
            addCriterion("LOWER_LIMIT <=", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitLike(String value) {
            addCriterion("LOWER_LIMIT like", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitNotLike(String value) {
            addCriterion("LOWER_LIMIT not like", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitIn(List<String> values) {
            addCriterion("LOWER_LIMIT in", values, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitNotIn(List<String> values) {
            addCriterion("LOWER_LIMIT not in", values, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitBetween(String value1, String value2) {
            addCriterion("LOWER_LIMIT between", value1, value2, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitNotBetween(String value1, String value2) {
            addCriterion("LOWER_LIMIT not between", value1, value2, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andReportItemNameIsNull() {
            addCriterion("REPORT_ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReportItemNameIsNotNull() {
            addCriterion("REPORT_ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReportItemNameEqualTo(String value) {
            addCriterion("REPORT_ITEM_NAME =", value, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andReportItemNameNotEqualTo(String value) {
            addCriterion("REPORT_ITEM_NAME <>", value, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andReportItemNameGreaterThan(String value) {
            addCriterion("REPORT_ITEM_NAME >", value, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andReportItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_ITEM_NAME >=", value, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andReportItemNameLessThan(String value) {
            addCriterion("REPORT_ITEM_NAME <", value, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andReportItemNameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_ITEM_NAME <=", value, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andReportItemNameLike(String value) {
            addCriterion("REPORT_ITEM_NAME like", value, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andReportItemNameNotLike(String value) {
            addCriterion("REPORT_ITEM_NAME not like", value, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andReportItemNameIn(List<String> values) {
            addCriterion("REPORT_ITEM_NAME in", values, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andReportItemNameNotIn(List<String> values) {
            addCriterion("REPORT_ITEM_NAME not in", values, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andReportItemNameBetween(String value1, String value2) {
            addCriterion("REPORT_ITEM_NAME between", value1, value2, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andReportItemNameNotBetween(String value1, String value2) {
            addCriterion("REPORT_ITEM_NAME not between", value1, value2, "reportItemName");
            return (Criteria) this;
        }

        public Criteria andUnitsIsNull() {
            addCriterion("UNITS is null");
            return (Criteria) this;
        }

        public Criteria andUnitsIsNotNull() {
            addCriterion("UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andUnitsEqualTo(String value) {
            addCriterion("UNITS =", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotEqualTo(String value) {
            addCriterion("UNITS <>", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsGreaterThan(String value) {
            addCriterion("UNITS >", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("UNITS >=", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLessThan(String value) {
            addCriterion("UNITS <", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLessThanOrEqualTo(String value) {
            addCriterion("UNITS <=", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLike(String value) {
            addCriterion("UNITS like", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotLike(String value) {
            addCriterion("UNITS not like", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsIn(List<String> values) {
            addCriterion("UNITS in", values, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotIn(List<String> values) {
            addCriterion("UNITS not in", values, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsBetween(String value1, String value2) {
            addCriterion("UNITS between", value1, value2, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotBetween(String value1, String value2) {
            addCriterion("UNITS not between", value1, value2, "units");
            return (Criteria) this;
        }

        public Criteria andExaminaimIsNull() {
            addCriterion("EXAMINAIM is null");
            return (Criteria) this;
        }

        public Criteria andExaminaimIsNotNull() {
            addCriterion("EXAMINAIM is not null");
            return (Criteria) this;
        }

        public Criteria andExaminaimEqualTo(String value) {
            addCriterion("EXAMINAIM =", value, "examinaim");
            return (Criteria) this;
        }

        public Criteria andExaminaimNotEqualTo(String value) {
            addCriterion("EXAMINAIM <>", value, "examinaim");
            return (Criteria) this;
        }

        public Criteria andExaminaimGreaterThan(String value) {
            addCriterion("EXAMINAIM >", value, "examinaim");
            return (Criteria) this;
        }

        public Criteria andExaminaimGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINAIM >=", value, "examinaim");
            return (Criteria) this;
        }

        public Criteria andExaminaimLessThan(String value) {
            addCriterion("EXAMINAIM <", value, "examinaim");
            return (Criteria) this;
        }

        public Criteria andExaminaimLessThanOrEqualTo(String value) {
            addCriterion("EXAMINAIM <=", value, "examinaim");
            return (Criteria) this;
        }

        public Criteria andExaminaimLike(String value) {
            addCriterion("EXAMINAIM like", value, "examinaim");
            return (Criteria) this;
        }

        public Criteria andExaminaimNotLike(String value) {
            addCriterion("EXAMINAIM not like", value, "examinaim");
            return (Criteria) this;
        }

        public Criteria andExaminaimIn(List<String> values) {
            addCriterion("EXAMINAIM in", values, "examinaim");
            return (Criteria) this;
        }

        public Criteria andExaminaimNotIn(List<String> values) {
            addCriterion("EXAMINAIM not in", values, "examinaim");
            return (Criteria) this;
        }

        public Criteria andExaminaimBetween(String value1, String value2) {
            addCriterion("EXAMINAIM between", value1, value2, "examinaim");
            return (Criteria) this;
        }

        public Criteria andExaminaimNotBetween(String value1, String value2) {
            addCriterion("EXAMINAIM not between", value1, value2, "examinaim");
            return (Criteria) this;
        }

        public Criteria andSjysIsNull() {
            addCriterion("SJYS is null");
            return (Criteria) this;
        }

        public Criteria andSjysIsNotNull() {
            addCriterion("SJYS is not null");
            return (Criteria) this;
        }

        public Criteria andSjysEqualTo(String value) {
            addCriterion("SJYS =", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysNotEqualTo(String value) {
            addCriterion("SJYS <>", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysGreaterThan(String value) {
            addCriterion("SJYS >", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysGreaterThanOrEqualTo(String value) {
            addCriterion("SJYS >=", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysLessThan(String value) {
            addCriterion("SJYS <", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysLessThanOrEqualTo(String value) {
            addCriterion("SJYS <=", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysLike(String value) {
            addCriterion("SJYS like", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysNotLike(String value) {
            addCriterion("SJYS not like", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysIn(List<String> values) {
            addCriterion("SJYS in", values, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysNotIn(List<String> values) {
            addCriterion("SJYS not in", values, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysBetween(String value1, String value2) {
            addCriterion("SJYS between", value1, value2, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysNotBetween(String value1, String value2) {
            addCriterion("SJYS not between", value1, value2, "sjys");
            return (Criteria) this;
        }

        public Criteria andJyzIsNull() {
            addCriterion("JYZ is null");
            return (Criteria) this;
        }

        public Criteria andJyzIsNotNull() {
            addCriterion("JYZ is not null");
            return (Criteria) this;
        }

        public Criteria andJyzEqualTo(String value) {
            addCriterion("JYZ =", value, "jyz");
            return (Criteria) this;
        }

        public Criteria andJyzNotEqualTo(String value) {
            addCriterion("JYZ <>", value, "jyz");
            return (Criteria) this;
        }

        public Criteria andJyzGreaterThan(String value) {
            addCriterion("JYZ >", value, "jyz");
            return (Criteria) this;
        }

        public Criteria andJyzGreaterThanOrEqualTo(String value) {
            addCriterion("JYZ >=", value, "jyz");
            return (Criteria) this;
        }

        public Criteria andJyzLessThan(String value) {
            addCriterion("JYZ <", value, "jyz");
            return (Criteria) this;
        }

        public Criteria andJyzLessThanOrEqualTo(String value) {
            addCriterion("JYZ <=", value, "jyz");
            return (Criteria) this;
        }

        public Criteria andJyzLike(String value) {
            addCriterion("JYZ like", value, "jyz");
            return (Criteria) this;
        }

        public Criteria andJyzNotLike(String value) {
            addCriterion("JYZ not like", value, "jyz");
            return (Criteria) this;
        }

        public Criteria andJyzIn(List<String> values) {
            addCriterion("JYZ in", values, "jyz");
            return (Criteria) this;
        }

        public Criteria andJyzNotIn(List<String> values) {
            addCriterion("JYZ not in", values, "jyz");
            return (Criteria) this;
        }

        public Criteria andJyzBetween(String value1, String value2) {
            addCriterion("JYZ between", value1, value2, "jyz");
            return (Criteria) this;
        }

        public Criteria andJyzNotBetween(String value1, String value2) {
            addCriterion("JYZ not between", value1, value2, "jyz");
            return (Criteria) this;
        }

        public Criteria andShrIsNull() {
            addCriterion("SHR is null");
            return (Criteria) this;
        }

        public Criteria andShrIsNotNull() {
            addCriterion("SHR is not null");
            return (Criteria) this;
        }

        public Criteria andShrEqualTo(String value) {
            addCriterion("SHR =", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotEqualTo(String value) {
            addCriterion("SHR <>", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThan(String value) {
            addCriterion("SHR >", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThanOrEqualTo(String value) {
            addCriterion("SHR >=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThan(String value) {
            addCriterion("SHR <", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThanOrEqualTo(String value) {
            addCriterion("SHR <=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLike(String value) {
            addCriterion("SHR like", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotLike(String value) {
            addCriterion("SHR not like", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrIn(List<String> values) {
            addCriterion("SHR in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotIn(List<String> values) {
            addCriterion("SHR not in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrBetween(String value1, String value2) {
            addCriterion("SHR between", value1, value2, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotBetween(String value1, String value2) {
            addCriterion("SHR not between", value1, value2, "shr");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("MARK is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("MARK is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("MARK =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("MARK <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("MARK >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("MARK >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("MARK <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("MARK <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("MARK like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("MARK not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("MARK in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("MARK not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("MARK between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("MARK not between", value1, value2, "mark");
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