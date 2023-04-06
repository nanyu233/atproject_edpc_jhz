package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspConsentFormImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspConsentFormImgExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andConsentFormSeqIsNull() {
            addCriterion("CONSENT_FORM_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqIsNotNull() {
            addCriterion("CONSENT_FORM_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqEqualTo(String value) {
            addCriterion("CONSENT_FORM_SEQ =", value, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqNotEqualTo(String value) {
            addCriterion("CONSENT_FORM_SEQ <>", value, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqGreaterThan(String value) {
            addCriterion("CONSENT_FORM_SEQ >", value, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqGreaterThanOrEqualTo(String value) {
            addCriterion("CONSENT_FORM_SEQ >=", value, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqLessThan(String value) {
            addCriterion("CONSENT_FORM_SEQ <", value, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqLessThanOrEqualTo(String value) {
            addCriterion("CONSENT_FORM_SEQ <=", value, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqLike(String value) {
            addCriterion("CONSENT_FORM_SEQ like", value, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqNotLike(String value) {
            addCriterion("CONSENT_FORM_SEQ not like", value, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqIn(List<String> values) {
            addCriterion("CONSENT_FORM_SEQ in", values, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqNotIn(List<String> values) {
            addCriterion("CONSENT_FORM_SEQ not in", values, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqBetween(String value1, String value2) {
            addCriterion("CONSENT_FORM_SEQ between", value1, value2, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormSeqNotBetween(String value1, String value2) {
            addCriterion("CONSENT_FORM_SEQ not between", value1, value2, "consentFormSeq");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdIsNull() {
            addCriterion("CONSENT_FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdIsNotNull() {
            addCriterion("CONSENT_FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdEqualTo(String value) {
            addCriterion("CONSENT_FORM_ID =", value, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdNotEqualTo(String value) {
            addCriterion("CONSENT_FORM_ID <>", value, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdGreaterThan(String value) {
            addCriterion("CONSENT_FORM_ID >", value, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONSENT_FORM_ID >=", value, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdLessThan(String value) {
            addCriterion("CONSENT_FORM_ID <", value, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdLessThanOrEqualTo(String value) {
            addCriterion("CONSENT_FORM_ID <=", value, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdLike(String value) {
            addCriterion("CONSENT_FORM_ID like", value, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdNotLike(String value) {
            addCriterion("CONSENT_FORM_ID not like", value, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdIn(List<String> values) {
            addCriterion("CONSENT_FORM_ID in", values, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdNotIn(List<String> values) {
            addCriterion("CONSENT_FORM_ID not in", values, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdBetween(String value1, String value2) {
            addCriterion("CONSENT_FORM_ID between", value1, value2, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormIdNotBetween(String value1, String value2) {
            addCriterion("CONSENT_FORM_ID not between", value1, value2, "consentFormId");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameIsNull() {
            addCriterion("CONSENT_FORM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameIsNotNull() {
            addCriterion("CONSENT_FORM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameEqualTo(String value) {
            addCriterion("CONSENT_FORM_NAME =", value, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameNotEqualTo(String value) {
            addCriterion("CONSENT_FORM_NAME <>", value, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameGreaterThan(String value) {
            addCriterion("CONSENT_FORM_NAME >", value, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONSENT_FORM_NAME >=", value, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameLessThan(String value) {
            addCriterion("CONSENT_FORM_NAME <", value, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameLessThanOrEqualTo(String value) {
            addCriterion("CONSENT_FORM_NAME <=", value, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameLike(String value) {
            addCriterion("CONSENT_FORM_NAME like", value, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameNotLike(String value) {
            addCriterion("CONSENT_FORM_NAME not like", value, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameIn(List<String> values) {
            addCriterion("CONSENT_FORM_NAME in", values, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameNotIn(List<String> values) {
            addCriterion("CONSENT_FORM_NAME not in", values, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameBetween(String value1, String value2) {
            addCriterion("CONSENT_FORM_NAME between", value1, value2, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormNameNotBetween(String value1, String value2) {
            addCriterion("CONSENT_FORM_NAME not between", value1, value2, "consentFormName");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeIsNull() {
            addCriterion("CONSENT_FORM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeIsNotNull() {
            addCriterion("CONSENT_FORM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeEqualTo(String value) {
            addCriterion("CONSENT_FORM_TYPE =", value, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeNotEqualTo(String value) {
            addCriterion("CONSENT_FORM_TYPE <>", value, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeGreaterThan(String value) {
            addCriterion("CONSENT_FORM_TYPE >", value, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONSENT_FORM_TYPE >=", value, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeLessThan(String value) {
            addCriterion("CONSENT_FORM_TYPE <", value, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeLessThanOrEqualTo(String value) {
            addCriterion("CONSENT_FORM_TYPE <=", value, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeLike(String value) {
            addCriterion("CONSENT_FORM_TYPE like", value, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeNotLike(String value) {
            addCriterion("CONSENT_FORM_TYPE not like", value, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeIn(List<String> values) {
            addCriterion("CONSENT_FORM_TYPE in", values, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeNotIn(List<String> values) {
            addCriterion("CONSENT_FORM_TYPE not in", values, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeBetween(String value1, String value2) {
            addCriterion("CONSENT_FORM_TYPE between", value1, value2, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andConsentFormTypeNotBetween(String value1, String value2) {
            addCriterion("CONSENT_FORM_TYPE not between", value1, value2, "consentFormType");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIsNull() {
            addCriterion("SAVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIsNotNull() {
            addCriterion("SAVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSaveTimeEqualTo(Date value) {
            addCriterion("SAVE_TIME =", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotEqualTo(Date value) {
            addCriterion("SAVE_TIME <>", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeGreaterThan(Date value) {
            addCriterion("SAVE_TIME >", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SAVE_TIME >=", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeLessThan(Date value) {
            addCriterion("SAVE_TIME <", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("SAVE_TIME <=", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIn(List<Date> values) {
            addCriterion("SAVE_TIME in", values, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotIn(List<Date> values) {
            addCriterion("SAVE_TIME not in", values, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeBetween(Date value1, Date value2) {
            addCriterion("SAVE_TIME between", value1, value2, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("SAVE_TIME not between", value1, value2, "saveTime");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaIsNull() {
            addCriterion("HOSPITAL_AREA is null");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaIsNotNull() {
            addCriterion("HOSPITAL_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaEqualTo(String value) {
            addCriterion("HOSPITAL_AREA =", value, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaNotEqualTo(String value) {
            addCriterion("HOSPITAL_AREA <>", value, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaGreaterThan(String value) {
            addCriterion("HOSPITAL_AREA >", value, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_AREA >=", value, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaLessThan(String value) {
            addCriterion("HOSPITAL_AREA <", value, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaLessThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_AREA <=", value, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaLike(String value) {
            addCriterion("HOSPITAL_AREA like", value, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaNotLike(String value) {
            addCriterion("HOSPITAL_AREA not like", value, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaIn(List<String> values) {
            addCriterion("HOSPITAL_AREA in", values, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaNotIn(List<String> values) {
            addCriterion("HOSPITAL_AREA not in", values, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaBetween(String value1, String value2) {
            addCriterion("HOSPITAL_AREA between", value1, value2, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andHospitalAreaNotBetween(String value1, String value2) {
            addCriterion("HOSPITAL_AREA not between", value1, value2, "hospitalArea");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(String value) {
            addCriterion("SYSTEM_ID =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(String value) {
            addCriterion("SYSTEM_ID <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(String value) {
            addCriterion("SYSTEM_ID >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(String value) {
            addCriterion("SYSTEM_ID <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLike(String value) {
            addCriterion("SYSTEM_ID like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotLike(String value) {
            addCriterion("SYSTEM_ID not like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<String> values) {
            addCriterion("SYSTEM_ID in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<String> values) {
            addCriterion("SYSTEM_ID not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("UPDATED_BY =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("UPDATED_BY <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("UPDATED_BY >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("UPDATED_BY <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("UPDATED_BY like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("UPDATED_BY not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("UPDATED_BY in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("UPDATED_BY not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("UPDATED_BY between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("UPDATED_BY not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "updatedTime");
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