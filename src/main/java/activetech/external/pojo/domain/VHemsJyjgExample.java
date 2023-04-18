package activetech.external.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VHemsJyjgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VHemsJyjgExample() {
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
            addCriterion("RESULT_DATE_TIME =", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeNotEqualTo(Date value) {
            addCriterion("RESULT_DATE_TIME <>", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeGreaterThan(Date value) {
            addCriterion("RESULT_DATE_TIME >", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RESULT_DATE_TIME >=", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeLessThan(Date value) {
            addCriterion("RESULT_DATE_TIME <", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("RESULT_DATE_TIME <=", value, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeIn(List<Date> values) {
            addCriterion("RESULT_DATE_TIME in", values, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeNotIn(List<Date> values) {
            addCriterion("RESULT_DATE_TIME not in", values, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeBetween(Date value1, Date value2) {
            addCriterion("RESULT_DATE_TIME between", value1, value2, "resultDateTime");
            return (Criteria) this;
        }

        public Criteria andResultDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("RESULT_DATE_TIME not between", value1, value2, "resultDateTime");
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

        public Criteria andReportDocIsNull() {
            addCriterion("REPORT_DOC is null");
            return (Criteria) this;
        }

        public Criteria andReportDocIsNotNull() {
            addCriterion("REPORT_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andReportDocEqualTo(String value) {
            addCriterion("REPORT_DOC =", value, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocNotEqualTo(String value) {
            addCriterion("REPORT_DOC <>", value, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocGreaterThan(String value) {
            addCriterion("REPORT_DOC >", value, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_DOC >=", value, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocLessThan(String value) {
            addCriterion("REPORT_DOC <", value, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocLessThanOrEqualTo(String value) {
            addCriterion("REPORT_DOC <=", value, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocLike(String value) {
            addCriterion("REPORT_DOC like", value, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocNotLike(String value) {
            addCriterion("REPORT_DOC not like", value, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocIn(List<String> values) {
            addCriterion("REPORT_DOC in", values, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocNotIn(List<String> values) {
            addCriterion("REPORT_DOC not in", values, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocBetween(String value1, String value2) {
            addCriterion("REPORT_DOC between", value1, value2, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocNotBetween(String value1, String value2) {
            addCriterion("REPORT_DOC not between", value1, value2, "reportDoc");
            return (Criteria) this;
        }

        public Criteria andReportDocNameIsNull() {
            addCriterion("REPORT_DOC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReportDocNameIsNotNull() {
            addCriterion("REPORT_DOC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReportDocNameEqualTo(String value) {
            addCriterion("REPORT_DOC_NAME =", value, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andReportDocNameNotEqualTo(String value) {
            addCriterion("REPORT_DOC_NAME <>", value, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andReportDocNameGreaterThan(String value) {
            addCriterion("REPORT_DOC_NAME >", value, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andReportDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_DOC_NAME >=", value, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andReportDocNameLessThan(String value) {
            addCriterion("REPORT_DOC_NAME <", value, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andReportDocNameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_DOC_NAME <=", value, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andReportDocNameLike(String value) {
            addCriterion("REPORT_DOC_NAME like", value, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andReportDocNameNotLike(String value) {
            addCriterion("REPORT_DOC_NAME not like", value, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andReportDocNameIn(List<String> values) {
            addCriterion("REPORT_DOC_NAME in", values, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andReportDocNameNotIn(List<String> values) {
            addCriterion("REPORT_DOC_NAME not in", values, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andReportDocNameBetween(String value1, String value2) {
            addCriterion("REPORT_DOC_NAME between", value1, value2, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andReportDocNameNotBetween(String value1, String value2) {
            addCriterion("REPORT_DOC_NAME not between", value1, value2, "reportDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameIsNull() {
            addCriterion("EXAMINE_DOC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameIsNotNull() {
            addCriterion("EXAMINE_DOC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameEqualTo(String value) {
            addCriterion("EXAMINE_DOC_NAME =", value, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameNotEqualTo(String value) {
            addCriterion("EXAMINE_DOC_NAME <>", value, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameGreaterThan(String value) {
            addCriterion("EXAMINE_DOC_NAME >", value, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_DOC_NAME >=", value, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameLessThan(String value) {
            addCriterion("EXAMINE_DOC_NAME <", value, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_DOC_NAME <=", value, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameLike(String value) {
            addCriterion("EXAMINE_DOC_NAME like", value, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameNotLike(String value) {
            addCriterion("EXAMINE_DOC_NAME not like", value, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameIn(List<String> values) {
            addCriterion("EXAMINE_DOC_NAME in", values, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameNotIn(List<String> values) {
            addCriterion("EXAMINE_DOC_NAME not in", values, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameBetween(String value1, String value2) {
            addCriterion("EXAMINE_DOC_NAME between", value1, value2, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andExamineDocNameNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_DOC_NAME not between", value1, value2, "examineDocName");
            return (Criteria) this;
        }

        public Criteria andPatientDeptIsNull() {
            addCriterion("PATIENT_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andPatientDeptIsNotNull() {
            addCriterion("PATIENT_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andPatientDeptEqualTo(String value) {
            addCriterion("PATIENT_DEPT =", value, "patientDept");
            return (Criteria) this;
        }

        public Criteria andPatientDeptNotEqualTo(String value) {
            addCriterion("PATIENT_DEPT <>", value, "patientDept");
            return (Criteria) this;
        }

        public Criteria andPatientDeptGreaterThan(String value) {
            addCriterion("PATIENT_DEPT >", value, "patientDept");
            return (Criteria) this;
        }

        public Criteria andPatientDeptGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_DEPT >=", value, "patientDept");
            return (Criteria) this;
        }

        public Criteria andPatientDeptLessThan(String value) {
            addCriterion("PATIENT_DEPT <", value, "patientDept");
            return (Criteria) this;
        }

        public Criteria andPatientDeptLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_DEPT <=", value, "patientDept");
            return (Criteria) this;
        }

        public Criteria andPatientDeptLike(String value) {
            addCriterion("PATIENT_DEPT like", value, "patientDept");
            return (Criteria) this;
        }

        public Criteria andPatientDeptNotLike(String value) {
            addCriterion("PATIENT_DEPT not like", value, "patientDept");
            return (Criteria) this;
        }

        public Criteria andPatientDeptIn(List<String> values) {
            addCriterion("PATIENT_DEPT in", values, "patientDept");
            return (Criteria) this;
        }

        public Criteria andPatientDeptNotIn(List<String> values) {
            addCriterion("PATIENT_DEPT not in", values, "patientDept");
            return (Criteria) this;
        }

        public Criteria andPatientDeptBetween(String value1, String value2) {
            addCriterion("PATIENT_DEPT between", value1, value2, "patientDept");
            return (Criteria) this;
        }

        public Criteria andPatientDeptNotBetween(String value1, String value2) {
            addCriterion("PATIENT_DEPT not between", value1, value2, "patientDept");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaIsNull() {
            addCriterion("INPATIENT_AREA is null");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaIsNotNull() {
            addCriterion("INPATIENT_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaEqualTo(String value) {
            addCriterion("INPATIENT_AREA =", value, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaNotEqualTo(String value) {
            addCriterion("INPATIENT_AREA <>", value, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaGreaterThan(String value) {
            addCriterion("INPATIENT_AREA >", value, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaGreaterThanOrEqualTo(String value) {
            addCriterion("INPATIENT_AREA >=", value, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaLessThan(String value) {
            addCriterion("INPATIENT_AREA <", value, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaLessThanOrEqualTo(String value) {
            addCriterion("INPATIENT_AREA <=", value, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaLike(String value) {
            addCriterion("INPATIENT_AREA like", value, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaNotLike(String value) {
            addCriterion("INPATIENT_AREA not like", value, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaIn(List<String> values) {
            addCriterion("INPATIENT_AREA in", values, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaNotIn(List<String> values) {
            addCriterion("INPATIENT_AREA not in", values, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaBetween(String value1, String value2) {
            addCriterion("INPATIENT_AREA between", value1, value2, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andInpatientAreaNotBetween(String value1, String value2) {
            addCriterion("INPATIENT_AREA not between", value1, value2, "inpatientArea");
            return (Criteria) this;
        }

        public Criteria andBedNoIsNull() {
            addCriterion("BED_NO is null");
            return (Criteria) this;
        }

        public Criteria andBedNoIsNotNull() {
            addCriterion("BED_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBedNoEqualTo(String value) {
            addCriterion("BED_NO =", value, "bedNo");
            return (Criteria) this;
        }

        public Criteria andBedNoNotEqualTo(String value) {
            addCriterion("BED_NO <>", value, "bedNo");
            return (Criteria) this;
        }

        public Criteria andBedNoGreaterThan(String value) {
            addCriterion("BED_NO >", value, "bedNo");
            return (Criteria) this;
        }

        public Criteria andBedNoGreaterThanOrEqualTo(String value) {
            addCriterion("BED_NO >=", value, "bedNo");
            return (Criteria) this;
        }

        public Criteria andBedNoLessThan(String value) {
            addCriterion("BED_NO <", value, "bedNo");
            return (Criteria) this;
        }

        public Criteria andBedNoLessThanOrEqualTo(String value) {
            addCriterion("BED_NO <=", value, "bedNo");
            return (Criteria) this;
        }

        public Criteria andBedNoLike(String value) {
            addCriterion("BED_NO like", value, "bedNo");
            return (Criteria) this;
        }

        public Criteria andBedNoNotLike(String value) {
            addCriterion("BED_NO not like", value, "bedNo");
            return (Criteria) this;
        }

        public Criteria andBedNoIn(List<String> values) {
            addCriterion("BED_NO in", values, "bedNo");
            return (Criteria) this;
        }

        public Criteria andBedNoNotIn(List<String> values) {
            addCriterion("BED_NO not in", values, "bedNo");
            return (Criteria) this;
        }

        public Criteria andBedNoBetween(String value1, String value2) {
            addCriterion("BED_NO between", value1, value2, "bedNo");
            return (Criteria) this;
        }

        public Criteria andBedNoNotBetween(String value1, String value2) {
            addCriterion("BED_NO not between", value1, value2, "bedNo");
            return (Criteria) this;
        }

        public Criteria andNursingUnitIsNull() {
            addCriterion("NURSING_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andNursingUnitIsNotNull() {
            addCriterion("NURSING_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andNursingUnitEqualTo(String value) {
            addCriterion("NURSING_UNIT =", value, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andNursingUnitNotEqualTo(String value) {
            addCriterion("NURSING_UNIT <>", value, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andNursingUnitGreaterThan(String value) {
            addCriterion("NURSING_UNIT >", value, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andNursingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("NURSING_UNIT >=", value, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andNursingUnitLessThan(String value) {
            addCriterion("NURSING_UNIT <", value, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andNursingUnitLessThanOrEqualTo(String value) {
            addCriterion("NURSING_UNIT <=", value, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andNursingUnitLike(String value) {
            addCriterion("NURSING_UNIT like", value, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andNursingUnitNotLike(String value) {
            addCriterion("NURSING_UNIT not like", value, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andNursingUnitIn(List<String> values) {
            addCriterion("NURSING_UNIT in", values, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andNursingUnitNotIn(List<String> values) {
            addCriterion("NURSING_UNIT not in", values, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andNursingUnitBetween(String value1, String value2) {
            addCriterion("NURSING_UNIT between", value1, value2, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andNursingUnitNotBetween(String value1, String value2) {
            addCriterion("NURSING_UNIT not between", value1, value2, "nursingUnit");
            return (Criteria) this;
        }

        public Criteria andAttendingDocIsNull() {
            addCriterion("ATTENDING_DOC is null");
            return (Criteria) this;
        }

        public Criteria andAttendingDocIsNotNull() {
            addCriterion("ATTENDING_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andAttendingDocEqualTo(String value) {
            addCriterion("ATTENDING_DOC =", value, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNotEqualTo(String value) {
            addCriterion("ATTENDING_DOC <>", value, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocGreaterThan(String value) {
            addCriterion("ATTENDING_DOC >", value, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocGreaterThanOrEqualTo(String value) {
            addCriterion("ATTENDING_DOC >=", value, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocLessThan(String value) {
            addCriterion("ATTENDING_DOC <", value, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocLessThanOrEqualTo(String value) {
            addCriterion("ATTENDING_DOC <=", value, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocLike(String value) {
            addCriterion("ATTENDING_DOC like", value, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNotLike(String value) {
            addCriterion("ATTENDING_DOC not like", value, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocIn(List<String> values) {
            addCriterion("ATTENDING_DOC in", values, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNotIn(List<String> values) {
            addCriterion("ATTENDING_DOC not in", values, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocBetween(String value1, String value2) {
            addCriterion("ATTENDING_DOC between", value1, value2, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNotBetween(String value1, String value2) {
            addCriterion("ATTENDING_DOC not between", value1, value2, "attendingDoc");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameIsNull() {
            addCriterion("ATTENDING_DOC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameIsNotNull() {
            addCriterion("ATTENDING_DOC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameEqualTo(String value) {
            addCriterion("ATTENDING_DOC_NAME =", value, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameNotEqualTo(String value) {
            addCriterion("ATTENDING_DOC_NAME <>", value, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameGreaterThan(String value) {
            addCriterion("ATTENDING_DOC_NAME >", value, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("ATTENDING_DOC_NAME >=", value, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameLessThan(String value) {
            addCriterion("ATTENDING_DOC_NAME <", value, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameLessThanOrEqualTo(String value) {
            addCriterion("ATTENDING_DOC_NAME <=", value, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameLike(String value) {
            addCriterion("ATTENDING_DOC_NAME like", value, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameNotLike(String value) {
            addCriterion("ATTENDING_DOC_NAME not like", value, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameIn(List<String> values) {
            addCriterion("ATTENDING_DOC_NAME in", values, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameNotIn(List<String> values) {
            addCriterion("ATTENDING_DOC_NAME not in", values, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameBetween(String value1, String value2) {
            addCriterion("ATTENDING_DOC_NAME between", value1, value2, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andAttendingDocNameNotBetween(String value1, String value2) {
            addCriterion("ATTENDING_DOC_NAME not between", value1, value2, "attendingDocName");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesIsNull() {
            addCriterion("SEEK_MEDICAL_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesIsNotNull() {
            addCriterion("SEEK_MEDICAL_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesEqualTo(String value) {
            addCriterion("SEEK_MEDICAL_TIMES =", value, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesNotEqualTo(String value) {
            addCriterion("SEEK_MEDICAL_TIMES <>", value, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesGreaterThan(String value) {
            addCriterion("SEEK_MEDICAL_TIMES >", value, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesGreaterThanOrEqualTo(String value) {
            addCriterion("SEEK_MEDICAL_TIMES >=", value, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesLessThan(String value) {
            addCriterion("SEEK_MEDICAL_TIMES <", value, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesLessThanOrEqualTo(String value) {
            addCriterion("SEEK_MEDICAL_TIMES <=", value, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesLike(String value) {
            addCriterion("SEEK_MEDICAL_TIMES like", value, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesNotLike(String value) {
            addCriterion("SEEK_MEDICAL_TIMES not like", value, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesIn(List<String> values) {
            addCriterion("SEEK_MEDICAL_TIMES in", values, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesNotIn(List<String> values) {
            addCriterion("SEEK_MEDICAL_TIMES not in", values, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesBetween(String value1, String value2) {
            addCriterion("SEEK_MEDICAL_TIMES between", value1, value2, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andSeekMedicalTimesNotBetween(String value1, String value2) {
            addCriterion("SEEK_MEDICAL_TIMES not between", value1, value2, "seekMedicalTimes");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationIsNull() {
            addCriterion("SERVICE_ORGANIZATION is null");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationIsNotNull() {
            addCriterion("SERVICE_ORGANIZATION is not null");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationEqualTo(String value) {
            addCriterion("SERVICE_ORGANIZATION =", value, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationNotEqualTo(String value) {
            addCriterion("SERVICE_ORGANIZATION <>", value, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationGreaterThan(String value) {
            addCriterion("SERVICE_ORGANIZATION >", value, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_ORGANIZATION >=", value, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationLessThan(String value) {
            addCriterion("SERVICE_ORGANIZATION <", value, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_ORGANIZATION <=", value, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationLike(String value) {
            addCriterion("SERVICE_ORGANIZATION like", value, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationNotLike(String value) {
            addCriterion("SERVICE_ORGANIZATION not like", value, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationIn(List<String> values) {
            addCriterion("SERVICE_ORGANIZATION in", values, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationNotIn(List<String> values) {
            addCriterion("SERVICE_ORGANIZATION not in", values, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationBetween(String value1, String value2) {
            addCriterion("SERVICE_ORGANIZATION between", value1, value2, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andServiceOrganizationNotBetween(String value1, String value2) {
            addCriterion("SERVICE_ORGANIZATION not between", value1, value2, "serviceOrganization");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedIsNull() {
            addCriterion("BE_HOSPITALIZED is null");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedIsNotNull() {
            addCriterion("BE_HOSPITALIZED is not null");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedEqualTo(Date value) {
            addCriterion("BE_HOSPITALIZED =", value, "beHospitalized");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedNotEqualTo(Date value) {
            addCriterion("BE_HOSPITALIZED <>", value, "beHospitalized");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedGreaterThan(Date value) {
            addCriterion("BE_HOSPITALIZED >", value, "beHospitalized");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedGreaterThanOrEqualTo(Date value) {
            addCriterion("BE_HOSPITALIZED >=", value, "beHospitalized");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedLessThan(Date value) {
            addCriterion("BE_HOSPITALIZED <", value, "beHospitalized");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedLessThanOrEqualTo(Date value) {
            addCriterion("BE_HOSPITALIZED <=", value, "beHospitalized");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedIn(List<Date> values) {
            addCriterion("BE_HOSPITALIZED in", values, "beHospitalized");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedNotIn(List<Date> values) {
            addCriterion("BE_HOSPITALIZED not in", values, "beHospitalized");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedBetween(Date value1, Date value2) {
            addCriterion("BE_HOSPITALIZED between", value1, value2, "beHospitalized");
            return (Criteria) this;
        }

        public Criteria andBeHospitalizedNotBetween(Date value1, Date value2) {
            addCriterion("BE_HOSPITALIZED not between", value1, value2, "beHospitalized");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("ORDER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("ORDER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("ORDER_CODE =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("ORDER_CODE <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("ORDER_CODE >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("ORDER_CODE <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("ORDER_CODE like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("ORDER_CODE not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("ORDER_CODE in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("ORDER_CODE not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("ORDER_CODE between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("ORDER_CODE not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("ORDER_TYPE =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("ORDER_TYPE <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("ORDER_TYPE >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("ORDER_TYPE <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("ORDER_TYPE like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("ORDER_TYPE not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("ORDER_TYPE in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("ORDER_TYPE not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andExamineDeptIsNull() {
            addCriterion("EXAMINE_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andExamineDeptIsNotNull() {
            addCriterion("EXAMINE_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andExamineDeptEqualTo(String value) {
            addCriterion("EXAMINE_DEPT =", value, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptNotEqualTo(String value) {
            addCriterion("EXAMINE_DEPT <>", value, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptGreaterThan(String value) {
            addCriterion("EXAMINE_DEPT >", value, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_DEPT >=", value, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptLessThan(String value) {
            addCriterion("EXAMINE_DEPT <", value, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_DEPT <=", value, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptLike(String value) {
            addCriterion("EXAMINE_DEPT like", value, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptNotLike(String value) {
            addCriterion("EXAMINE_DEPT not like", value, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptIn(List<String> values) {
            addCriterion("EXAMINE_DEPT in", values, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptNotIn(List<String> values) {
            addCriterion("EXAMINE_DEPT not in", values, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptBetween(String value1, String value2) {
            addCriterion("EXAMINE_DEPT between", value1, value2, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_DEPT not between", value1, value2, "examineDept");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeIsNull() {
            addCriterion("EXAMINE_DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeIsNotNull() {
            addCriterion("EXAMINE_DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeEqualTo(String value) {
            addCriterion("EXAMINE_DEPT_CODE =", value, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeNotEqualTo(String value) {
            addCriterion("EXAMINE_DEPT_CODE <>", value, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeGreaterThan(String value) {
            addCriterion("EXAMINE_DEPT_CODE >", value, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_DEPT_CODE >=", value, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeLessThan(String value) {
            addCriterion("EXAMINE_DEPT_CODE <", value, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_DEPT_CODE <=", value, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeLike(String value) {
            addCriterion("EXAMINE_DEPT_CODE like", value, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeNotLike(String value) {
            addCriterion("EXAMINE_DEPT_CODE not like", value, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeIn(List<String> values) {
            addCriterion("EXAMINE_DEPT_CODE in", values, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeNotIn(List<String> values) {
            addCriterion("EXAMINE_DEPT_CODE not in", values, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeBetween(String value1, String value2) {
            addCriterion("EXAMINE_DEPT_CODE between", value1, value2, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andExamineDeptCodeNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_DEPT_CODE not between", value1, value2, "examineDeptCode");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("XH like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("XH not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIsNull() {
            addCriterion("APPLICATION_NO is null");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIsNotNull() {
            addCriterion("APPLICATION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationNoEqualTo(String value) {
            addCriterion("APPLICATION_NO =", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotEqualTo(String value) {
            addCriterion("APPLICATION_NO <>", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoGreaterThan(String value) {
            addCriterion("APPLICATION_NO >", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NO >=", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLessThan(String value) {
            addCriterion("APPLICATION_NO <", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NO <=", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLike(String value) {
            addCriterion("APPLICATION_NO like", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotLike(String value) {
            addCriterion("APPLICATION_NO not like", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIn(List<String> values) {
            addCriterion("APPLICATION_NO in", values, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotIn(List<String> values) {
            addCriterion("APPLICATION_NO not in", values, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoBetween(String value1, String value2) {
            addCriterion("APPLICATION_NO between", value1, value2, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_NO not between", value1, value2, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andReportNoIsNull() {
            addCriterion("REPORT_NO is null");
            return (Criteria) this;
        }

        public Criteria andReportNoIsNotNull() {
            addCriterion("REPORT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andReportNoEqualTo(String value) {
            addCriterion("REPORT_NO =", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotEqualTo(String value) {
            addCriterion("REPORT_NO <>", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoGreaterThan(String value) {
            addCriterion("REPORT_NO >", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_NO >=", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLessThan(String value) {
            addCriterion("REPORT_NO <", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLessThanOrEqualTo(String value) {
            addCriterion("REPORT_NO <=", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLike(String value) {
            addCriterion("REPORT_NO like", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotLike(String value) {
            addCriterion("REPORT_NO not like", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoIn(List<String> values) {
            addCriterion("REPORT_NO in", values, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotIn(List<String> values) {
            addCriterion("REPORT_NO not in", values, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoBetween(String value1, String value2) {
            addCriterion("REPORT_NO between", value1, value2, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotBetween(String value1, String value2) {
            addCriterion("REPORT_NO not between", value1, value2, "reportNo");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeIsNull() {
            addCriterion("TREATMENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeIsNotNull() {
            addCriterion("TREATMENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeEqualTo(String value) {
            addCriterion("TREATMENT_CODE =", value, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeNotEqualTo(String value) {
            addCriterion("TREATMENT_CODE <>", value, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeGreaterThan(String value) {
            addCriterion("TREATMENT_CODE >", value, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TREATMENT_CODE >=", value, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeLessThan(String value) {
            addCriterion("TREATMENT_CODE <", value, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeLessThanOrEqualTo(String value) {
            addCriterion("TREATMENT_CODE <=", value, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeLike(String value) {
            addCriterion("TREATMENT_CODE like", value, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeNotLike(String value) {
            addCriterion("TREATMENT_CODE not like", value, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeIn(List<String> values) {
            addCriterion("TREATMENT_CODE in", values, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeNotIn(List<String> values) {
            addCriterion("TREATMENT_CODE not in", values, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeBetween(String value1, String value2) {
            addCriterion("TREATMENT_CODE between", value1, value2, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andTreatmentCodeNotBetween(String value1, String value2) {
            addCriterion("TREATMENT_CODE not between", value1, value2, "treatmentCode");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("RECEIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("RECEIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("RECEIVE_TIME =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("RECEIVE_TIME <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("RECEIVE_TIME >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_TIME >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("RECEIVE_TIME <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_TIME <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("RECEIVE_TIME in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("RECEIVE_TIME not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_TIME between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_TIME not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andSampleCodeIsNull() {
            addCriterion("SAMPLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSampleCodeIsNotNull() {
            addCriterion("SAMPLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSampleCodeEqualTo(String value) {
            addCriterion("SAMPLE_CODE =", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotEqualTo(String value) {
            addCriterion("SAMPLE_CODE <>", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeGreaterThan(String value) {
            addCriterion("SAMPLE_CODE >", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_CODE >=", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeLessThan(String value) {
            addCriterion("SAMPLE_CODE <", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_CODE <=", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeLike(String value) {
            addCriterion("SAMPLE_CODE like", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotLike(String value) {
            addCriterion("SAMPLE_CODE not like", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeIn(List<String> values) {
            addCriterion("SAMPLE_CODE in", values, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotIn(List<String> values) {
            addCriterion("SAMPLE_CODE not in", values, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeBetween(String value1, String value2) {
            addCriterion("SAMPLE_CODE between", value1, value2, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_CODE not between", value1, value2, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleNameIsNull() {
            addCriterion("SAMPLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSampleNameIsNotNull() {
            addCriterion("SAMPLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNameEqualTo(String value) {
            addCriterion("SAMPLE_NAME =", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotEqualTo(String value) {
            addCriterion("SAMPLE_NAME <>", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThan(String value) {
            addCriterion("SAMPLE_NAME >", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_NAME >=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThan(String value) {
            addCriterion("SAMPLE_NAME <", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_NAME <=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLike(String value) {
            addCriterion("SAMPLE_NAME like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotLike(String value) {
            addCriterion("SAMPLE_NAME not like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameIn(List<String> values) {
            addCriterion("SAMPLE_NAME in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotIn(List<String> values) {
            addCriterion("SAMPLE_NAME not in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameBetween(String value1, String value2) {
            addCriterion("SAMPLE_NAME between", value1, value2, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_NAME not between", value1, value2, "sampleName");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNull() {
            addCriterion("REPORT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNotNull() {
            addCriterion("REPORT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReportStatusEqualTo(String value) {
            addCriterion("REPORT_STATUS =", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotEqualTo(String value) {
            addCriterion("REPORT_STATUS <>", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThan(String value) {
            addCriterion("REPORT_STATUS >", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_STATUS >=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThan(String value) {
            addCriterion("REPORT_STATUS <", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThanOrEqualTo(String value) {
            addCriterion("REPORT_STATUS <=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLike(String value) {
            addCriterion("REPORT_STATUS like", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotLike(String value) {
            addCriterion("REPORT_STATUS not like", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusIn(List<String> values) {
            addCriterion("REPORT_STATUS in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotIn(List<String> values) {
            addCriterion("REPORT_STATUS not in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusBetween(String value1, String value2) {
            addCriterion("REPORT_STATUS between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotBetween(String value1, String value2) {
            addCriterion("REPORT_STATUS not between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameIsNull() {
            addCriterion("REPORT_SHEET_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameIsNotNull() {
            addCriterion("REPORT_SHEET_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameEqualTo(String value) {
            addCriterion("REPORT_SHEET_NAME =", value, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameNotEqualTo(String value) {
            addCriterion("REPORT_SHEET_NAME <>", value, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameGreaterThan(String value) {
            addCriterion("REPORT_SHEET_NAME >", value, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_SHEET_NAME >=", value, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameLessThan(String value) {
            addCriterion("REPORT_SHEET_NAME <", value, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_SHEET_NAME <=", value, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameLike(String value) {
            addCriterion("REPORT_SHEET_NAME like", value, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameNotLike(String value) {
            addCriterion("REPORT_SHEET_NAME not like", value, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameIn(List<String> values) {
            addCriterion("REPORT_SHEET_NAME in", values, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameNotIn(List<String> values) {
            addCriterion("REPORT_SHEET_NAME not in", values, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameBetween(String value1, String value2) {
            addCriterion("REPORT_SHEET_NAME between", value1, value2, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andReportSheetNameNotBetween(String value1, String value2) {
            addCriterion("REPORT_SHEET_NAME not between", value1, value2, "reportSheetName");
            return (Criteria) this;
        }

        public Criteria andErrorFlagIsNull() {
            addCriterion("ERROR_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andErrorFlagIsNotNull() {
            addCriterion("ERROR_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andErrorFlagEqualTo(String value) {
            addCriterion("ERROR_FLAG =", value, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andErrorFlagNotEqualTo(String value) {
            addCriterion("ERROR_FLAG <>", value, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andErrorFlagGreaterThan(String value) {
            addCriterion("ERROR_FLAG >", value, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andErrorFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_FLAG >=", value, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andErrorFlagLessThan(String value) {
            addCriterion("ERROR_FLAG <", value, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andErrorFlagLessThanOrEqualTo(String value) {
            addCriterion("ERROR_FLAG <=", value, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andErrorFlagLike(String value) {
            addCriterion("ERROR_FLAG like", value, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andErrorFlagNotLike(String value) {
            addCriterion("ERROR_FLAG not like", value, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andErrorFlagIn(List<String> values) {
            addCriterion("ERROR_FLAG in", values, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andErrorFlagNotIn(List<String> values) {
            addCriterion("ERROR_FLAG not in", values, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andErrorFlagBetween(String value1, String value2) {
            addCriterion("ERROR_FLAG between", value1, value2, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andErrorFlagNotBetween(String value1, String value2) {
            addCriterion("ERROR_FLAG not between", value1, value2, "errorFlag");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNull() {
            addCriterion("REPORT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNotNull() {
            addCriterion("REPORT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReportTypeEqualTo(String value) {
            addCriterion("REPORT_TYPE =", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotEqualTo(String value) {
            addCriterion("REPORT_TYPE <>", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThan(String value) {
            addCriterion("REPORT_TYPE >", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_TYPE >=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThan(String value) {
            addCriterion("REPORT_TYPE <", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThanOrEqualTo(String value) {
            addCriterion("REPORT_TYPE <=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLike(String value) {
            addCriterion("REPORT_TYPE like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotLike(String value) {
            addCriterion("REPORT_TYPE not like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIn(List<String> values) {
            addCriterion("REPORT_TYPE in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotIn(List<String> values) {
            addCriterion("REPORT_TYPE not in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeBetween(String value1, String value2) {
            addCriterion("REPORT_TYPE between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotBetween(String value1, String value2) {
            addCriterion("REPORT_TYPE not between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andExamineDocIsNull() {
            addCriterion("EXAMINE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andExamineDocIsNotNull() {
            addCriterion("EXAMINE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andExamineDocEqualTo(String value) {
            addCriterion("EXAMINE_DOC =", value, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andExamineDocNotEqualTo(String value) {
            addCriterion("EXAMINE_DOC <>", value, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andExamineDocGreaterThan(String value) {
            addCriterion("EXAMINE_DOC >", value, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andExamineDocGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_DOC >=", value, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andExamineDocLessThan(String value) {
            addCriterion("EXAMINE_DOC <", value, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andExamineDocLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_DOC <=", value, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andExamineDocLike(String value) {
            addCriterion("EXAMINE_DOC like", value, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andExamineDocNotLike(String value) {
            addCriterion("EXAMINE_DOC not like", value, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andExamineDocIn(List<String> values) {
            addCriterion("EXAMINE_DOC in", values, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andExamineDocNotIn(List<String> values) {
            addCriterion("EXAMINE_DOC not in", values, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andExamineDocBetween(String value1, String value2) {
            addCriterion("EXAMINE_DOC between", value1, value2, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andExamineDocNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_DOC not between", value1, value2, "examineDoc");
            return (Criteria) this;
        }

        public Criteria andJyjgIdIsNull() {
            addCriterion("JYJG_ID is null");
            return (Criteria) this;
        }

        public Criteria andJyjgIdIsNotNull() {
            addCriterion("JYJG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJyjgIdEqualTo(String value) {
            addCriterion("JYJG_ID =", value, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJyjgIdNotEqualTo(String value) {
            addCriterion("JYJG_ID <>", value, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJyjgIdGreaterThan(String value) {
            addCriterion("JYJG_ID >", value, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJyjgIdGreaterThanOrEqualTo(String value) {
            addCriterion("JYJG_ID >=", value, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJyjgIdLessThan(String value) {
            addCriterion("JYJG_ID <", value, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJyjgIdLessThanOrEqualTo(String value) {
            addCriterion("JYJG_ID <=", value, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJyjgIdLike(String value) {
            addCriterion("JYJG_ID like", value, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJyjgIdNotLike(String value) {
            addCriterion("JYJG_ID not like", value, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJyjgIdIn(List<String> values) {
            addCriterion("JYJG_ID in", values, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJyjgIdNotIn(List<String> values) {
            addCriterion("JYJG_ID not in", values, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJyjgIdBetween(String value1, String value2) {
            addCriterion("JYJG_ID between", value1, value2, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJyjgIdNotBetween(String value1, String value2) {
            addCriterion("JYJG_ID not between", value1, value2, "jyjgId");
            return (Criteria) this;
        }

        public Criteria andJylxIsNull() {
            addCriterion("JYLX is null");
            return (Criteria) this;
        }

        public Criteria andJylxIsNotNull() {
            addCriterion("JYLX is not null");
            return (Criteria) this;
        }

        public Criteria andJylxEqualTo(String value) {
            addCriterion("JYLX =", value, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxNotEqualTo(String value) {
            addCriterion("JYLX <>", value, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxGreaterThan(String value) {
            addCriterion("JYLX >", value, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxGreaterThanOrEqualTo(String value) {
            addCriterion("JYLX >=", value, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxLessThan(String value) {
            addCriterion("JYLX <", value, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxLessThanOrEqualTo(String value) {
            addCriterion("JYLX <=", value, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxLike(String value) {
            addCriterion("JYLX like", value, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxNotLike(String value) {
            addCriterion("JYLX not like", value, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxIn(List<String> values) {
            addCriterion("JYLX in", values, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxNotIn(List<String> values) {
            addCriterion("JYLX not in", values, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxBetween(String value1, String value2) {
            addCriterion("JYLX between", value1, value2, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxNotBetween(String value1, String value2) {
            addCriterion("JYLX not between", value1, value2, "jylx");
            return (Criteria) this;
        }

        public Criteria andJylxmcIsNull() {
            addCriterion("JYLXMC is null");
            return (Criteria) this;
        }

        public Criteria andJylxmcIsNotNull() {
            addCriterion("JYLXMC is not null");
            return (Criteria) this;
        }

        public Criteria andJylxmcEqualTo(String value) {
            addCriterion("JYLXMC =", value, "jylxmc");
            return (Criteria) this;
        }

        public Criteria andJylxmcNotEqualTo(String value) {
            addCriterion("JYLXMC <>", value, "jylxmc");
            return (Criteria) this;
        }

        public Criteria andJylxmcGreaterThan(String value) {
            addCriterion("JYLXMC >", value, "jylxmc");
            return (Criteria) this;
        }

        public Criteria andJylxmcGreaterThanOrEqualTo(String value) {
            addCriterion("JYLXMC >=", value, "jylxmc");
            return (Criteria) this;
        }

        public Criteria andJylxmcLessThan(String value) {
            addCriterion("JYLXMC <", value, "jylxmc");
            return (Criteria) this;
        }

        public Criteria andJylxmcLessThanOrEqualTo(String value) {
            addCriterion("JYLXMC <=", value, "jylxmc");
            return (Criteria) this;
        }

        public Criteria andJylxmcLike(String value) {
            addCriterion("JYLXMC like", value, "jylxmc");
            return (Criteria) this;
        }

        public Criteria andJylxmcNotLike(String value) {
            addCriterion("JYLXMC not like", value, "jylxmc");
            return (Criteria) this;
        }

        public Criteria andJylxmcIn(List<String> values) {
            addCriterion("JYLXMC in", values, "jylxmc");
            return (Criteria) this;
        }

        public Criteria andJylxmcNotIn(List<String> values) {
            addCriterion("JYLXMC not in", values, "jylxmc");
            return (Criteria) this;
        }

        public Criteria andJylxmcBetween(String value1, String value2) {
            addCriterion("JYLXMC between", value1, value2, "jylxmc");
            return (Criteria) this;
        }

        public Criteria andJylxmcNotBetween(String value1, String value2) {
            addCriterion("JYLXMC not between", value1, value2, "jylxmc");
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