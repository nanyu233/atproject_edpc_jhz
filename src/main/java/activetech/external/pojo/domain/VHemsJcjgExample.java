package activetech.external.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VHemsJcjgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VHemsJcjgExample() {
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

        public Criteria andZyhIsNull() {
            addCriterion("ZYH is null");
            return (Criteria) this;
        }

        public Criteria andZyhIsNotNull() {
            addCriterion("ZYH is not null");
            return (Criteria) this;
        }

        public Criteria andZyhEqualTo(String value) {
            addCriterion("ZYH =", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhNotEqualTo(String value) {
            addCriterion("ZYH <>", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhGreaterThan(String value) {
            addCriterion("ZYH >", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhGreaterThanOrEqualTo(String value) {
            addCriterion("ZYH >=", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhLessThan(String value) {
            addCriterion("ZYH <", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhLessThanOrEqualTo(String value) {
            addCriterion("ZYH <=", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhLike(String value) {
            addCriterion("ZYH like", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhNotLike(String value) {
            addCriterion("ZYH not like", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhIn(List<String> values) {
            addCriterion("ZYH in", values, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhNotIn(List<String> values) {
            addCriterion("ZYH not in", values, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhBetween(String value1, String value2) {
            addCriterion("ZYH between", value1, value2, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhNotBetween(String value1, String value2) {
            addCriterion("ZYH not between", value1, value2, "zyh");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("XM is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("XM is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("XM =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("XM <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("XM >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("XM >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("XM <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("XM <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("XM like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("XM not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("XM in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("XM not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("XM between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("XM not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andYlmcIsNull() {
            addCriterion("YLMC is null");
            return (Criteria) this;
        }

        public Criteria andYlmcIsNotNull() {
            addCriterion("YLMC is not null");
            return (Criteria) this;
        }

        public Criteria andYlmcEqualTo(String value) {
            addCriterion("YLMC =", value, "ylmc");
            return (Criteria) this;
        }

        public Criteria andYlmcNotEqualTo(String value) {
            addCriterion("YLMC <>", value, "ylmc");
            return (Criteria) this;
        }

        public Criteria andYlmcGreaterThan(String value) {
            addCriterion("YLMC >", value, "ylmc");
            return (Criteria) this;
        }

        public Criteria andYlmcGreaterThanOrEqualTo(String value) {
            addCriterion("YLMC >=", value, "ylmc");
            return (Criteria) this;
        }

        public Criteria andYlmcLessThan(String value) {
            addCriterion("YLMC <", value, "ylmc");
            return (Criteria) this;
        }

        public Criteria andYlmcLessThanOrEqualTo(String value) {
            addCriterion("YLMC <=", value, "ylmc");
            return (Criteria) this;
        }

        public Criteria andYlmcLike(String value) {
            addCriterion("YLMC like", value, "ylmc");
            return (Criteria) this;
        }

        public Criteria andYlmcNotLike(String value) {
            addCriterion("YLMC not like", value, "ylmc");
            return (Criteria) this;
        }

        public Criteria andYlmcIn(List<String> values) {
            addCriterion("YLMC in", values, "ylmc");
            return (Criteria) this;
        }

        public Criteria andYlmcNotIn(List<String> values) {
            addCriterion("YLMC not in", values, "ylmc");
            return (Criteria) this;
        }

        public Criteria andYlmcBetween(String value1, String value2) {
            addCriterion("YLMC between", value1, value2, "ylmc");
            return (Criteria) this;
        }

        public Criteria andYlmcNotBetween(String value1, String value2) {
            addCriterion("YLMC not between", value1, value2, "ylmc");
            return (Criteria) this;
        }

        public Criteria andSeeIsNull() {
            addCriterion("SEE is null");
            return (Criteria) this;
        }

        public Criteria andSeeIsNotNull() {
            addCriterion("SEE is not null");
            return (Criteria) this;
        }

        public Criteria andSeeEqualTo(String value) {
            addCriterion("SEE =", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeNotEqualTo(String value) {
            addCriterion("SEE <>", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeGreaterThan(String value) {
            addCriterion("SEE >", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeGreaterThanOrEqualTo(String value) {
            addCriterion("SEE >=", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeLessThan(String value) {
            addCriterion("SEE <", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeLessThanOrEqualTo(String value) {
            addCriterion("SEE <=", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeLike(String value) {
            addCriterion("SEE like", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeNotLike(String value) {
            addCriterion("SEE not like", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeIn(List<String> values) {
            addCriterion("SEE in", values, "see");
            return (Criteria) this;
        }

        public Criteria andSeeNotIn(List<String> values) {
            addCriterion("SEE not in", values, "see");
            return (Criteria) this;
        }

        public Criteria andSeeBetween(String value1, String value2) {
            addCriterion("SEE between", value1, value2, "see");
            return (Criteria) this;
        }

        public Criteria andSeeNotBetween(String value1, String value2) {
            addCriterion("SEE not between", value1, value2, "see");
            return (Criteria) this;
        }

        public Criteria andJcjgIsNull() {
            addCriterion("JCJG is null");
            return (Criteria) this;
        }

        public Criteria andJcjgIsNotNull() {
            addCriterion("JCJG is not null");
            return (Criteria) this;
        }

        public Criteria andJcjgEqualTo(String value) {
            addCriterion("JCJG =", value, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcjgNotEqualTo(String value) {
            addCriterion("JCJG <>", value, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcjgGreaterThan(String value) {
            addCriterion("JCJG >", value, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcjgGreaterThanOrEqualTo(String value) {
            addCriterion("JCJG >=", value, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcjgLessThan(String value) {
            addCriterion("JCJG <", value, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcjgLessThanOrEqualTo(String value) {
            addCriterion("JCJG <=", value, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcjgLike(String value) {
            addCriterion("JCJG like", value, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcjgNotLike(String value) {
            addCriterion("JCJG not like", value, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcjgIn(List<String> values) {
            addCriterion("JCJG in", values, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcjgNotIn(List<String> values) {
            addCriterion("JCJG not in", values, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcjgBetween(String value1, String value2) {
            addCriterion("JCJG between", value1, value2, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcjgNotBetween(String value1, String value2) {
            addCriterion("JCJG not between", value1, value2, "jcjg");
            return (Criteria) this;
        }

        public Criteria andJcysxmIsNull() {
            addCriterion("JCYSXM is null");
            return (Criteria) this;
        }

        public Criteria andJcysxmIsNotNull() {
            addCriterion("JCYSXM is not null");
            return (Criteria) this;
        }

        public Criteria andJcysxmEqualTo(String value) {
            addCriterion("JCYSXM =", value, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andJcysxmNotEqualTo(String value) {
            addCriterion("JCYSXM <>", value, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andJcysxmGreaterThan(String value) {
            addCriterion("JCYSXM >", value, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andJcysxmGreaterThanOrEqualTo(String value) {
            addCriterion("JCYSXM >=", value, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andJcysxmLessThan(String value) {
            addCriterion("JCYSXM <", value, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andJcysxmLessThanOrEqualTo(String value) {
            addCriterion("JCYSXM <=", value, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andJcysxmLike(String value) {
            addCriterion("JCYSXM like", value, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andJcysxmNotLike(String value) {
            addCriterion("JCYSXM not like", value, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andJcysxmIn(List<String> values) {
            addCriterion("JCYSXM in", values, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andJcysxmNotIn(List<String> values) {
            addCriterion("JCYSXM not in", values, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andJcysxmBetween(String value1, String value2) {
            addCriterion("JCYSXM between", value1, value2, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andJcysxmNotBetween(String value1, String value2) {
            addCriterion("JCYSXM not between", value1, value2, "jcysxm");
            return (Criteria) this;
        }

        public Criteria andShrqIsNull() {
            addCriterion("SHRQ is null");
            return (Criteria) this;
        }

        public Criteria andShrqIsNotNull() {
            addCriterion("SHRQ is not null");
            return (Criteria) this;
        }

        public Criteria andShrqEqualTo(Date value) {
            addCriterion("SHRQ =", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotEqualTo(Date value) {
            addCriterion("SHRQ <>", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqGreaterThan(Date value) {
            addCriterion("SHRQ >", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqGreaterThanOrEqualTo(Date value) {
            addCriterion("SHRQ >=", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqLessThan(Date value) {
            addCriterion("SHRQ <", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqLessThanOrEqualTo(Date value) {
            addCriterion("SHRQ <=", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqIn(List<Date> values) {
            addCriterion("SHRQ in", values, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotIn(List<Date> values) {
            addCriterion("SHRQ not in", values, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqBetween(Date value1, Date value2) {
            addCriterion("SHRQ between", value1, value2, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotBetween(Date value1, Date value2) {
            addCriterion("SHRQ not between", value1, value2, "shrq");
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

        public Criteria andExecutionNoIsNull() {
            addCriterion("EXECUTION_NO is null");
            return (Criteria) this;
        }

        public Criteria andExecutionNoIsNotNull() {
            addCriterion("EXECUTION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionNoEqualTo(String value) {
            addCriterion("EXECUTION_NO =", value, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionNoNotEqualTo(String value) {
            addCriterion("EXECUTION_NO <>", value, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionNoGreaterThan(String value) {
            addCriterion("EXECUTION_NO >", value, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionNoGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTION_NO >=", value, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionNoLessThan(String value) {
            addCriterion("EXECUTION_NO <", value, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionNoLessThanOrEqualTo(String value) {
            addCriterion("EXECUTION_NO <=", value, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionNoLike(String value) {
            addCriterion("EXECUTION_NO like", value, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionNoNotLike(String value) {
            addCriterion("EXECUTION_NO not like", value, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionNoIn(List<String> values) {
            addCriterion("EXECUTION_NO in", values, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionNoNotIn(List<String> values) {
            addCriterion("EXECUTION_NO not in", values, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionNoBetween(String value1, String value2) {
            addCriterion("EXECUTION_NO between", value1, value2, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionNoNotBetween(String value1, String value2) {
            addCriterion("EXECUTION_NO not between", value1, value2, "executionNo");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptIsNull() {
            addCriterion("EXECUTION_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptIsNotNull() {
            addCriterion("EXECUTION_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptEqualTo(String value) {
            addCriterion("EXECUTION_DEPT =", value, "executionDept");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptNotEqualTo(String value) {
            addCriterion("EXECUTION_DEPT <>", value, "executionDept");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptGreaterThan(String value) {
            addCriterion("EXECUTION_DEPT >", value, "executionDept");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTION_DEPT >=", value, "executionDept");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptLessThan(String value) {
            addCriterion("EXECUTION_DEPT <", value, "executionDept");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptLessThanOrEqualTo(String value) {
            addCriterion("EXECUTION_DEPT <=", value, "executionDept");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptLike(String value) {
            addCriterion("EXECUTION_DEPT like", value, "executionDept");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptNotLike(String value) {
            addCriterion("EXECUTION_DEPT not like", value, "executionDept");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptIn(List<String> values) {
            addCriterion("EXECUTION_DEPT in", values, "executionDept");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptNotIn(List<String> values) {
            addCriterion("EXECUTION_DEPT not in", values, "executionDept");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptBetween(String value1, String value2) {
            addCriterion("EXECUTION_DEPT between", value1, value2, "executionDept");
            return (Criteria) this;
        }

        public Criteria andExecutionDeptNotBetween(String value1, String value2) {
            addCriterion("EXECUTION_DEPT not between", value1, value2, "executionDept");
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