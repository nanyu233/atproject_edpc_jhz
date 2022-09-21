package activetech.aid.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AidPatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AidPatientExample() {
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

        public Criteria andPatidIsNull() {
            addCriterion("PATID is null");
            return (Criteria) this;
        }

        public Criteria andPatidIsNotNull() {
            addCriterion("PATID is not null");
            return (Criteria) this;
        }

        public Criteria andPatidEqualTo(String value) {
            addCriterion("PATID =", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotEqualTo(String value) {
            addCriterion("PATID <>", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidGreaterThan(String value) {
            addCriterion("PATID >", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidGreaterThanOrEqualTo(String value) {
            addCriterion("PATID >=", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidLessThan(String value) {
            addCriterion("PATID <", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidLessThanOrEqualTo(String value) {
            addCriterion("PATID <=", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidLike(String value) {
            addCriterion("PATID like", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotLike(String value) {
            addCriterion("PATID not like", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidIn(List<String> values) {
            addCriterion("PATID in", values, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotIn(List<String> values) {
            addCriterion("PATID not in", values, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidBetween(String value1, String value2) {
            addCriterion("PATID between", value1, value2, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotBetween(String value1, String value2) {
            addCriterion("PATID not between", value1, value2, "patid");
            return (Criteria) this;
        }

        public Criteria andPatnameIsNull() {
            addCriterion("PATNAME is null");
            return (Criteria) this;
        }

        public Criteria andPatnameIsNotNull() {
            addCriterion("PATNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPatnameEqualTo(String value) {
            addCriterion("PATNAME =", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameNotEqualTo(String value) {
            addCriterion("PATNAME <>", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameGreaterThan(String value) {
            addCriterion("PATNAME >", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameGreaterThanOrEqualTo(String value) {
            addCriterion("PATNAME >=", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameLessThan(String value) {
            addCriterion("PATNAME <", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameLessThanOrEqualTo(String value) {
            addCriterion("PATNAME <=", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameLike(String value) {
            addCriterion("PATNAME like", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameNotLike(String value) {
            addCriterion("PATNAME not like", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameIn(List<String> values) {
            addCriterion("PATNAME in", values, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameNotIn(List<String> values) {
            addCriterion("PATNAME not in", values, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameBetween(String value1, String value2) {
            addCriterion("PATNAME between", value1, value2, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameNotBetween(String value1, String value2) {
            addCriterion("PATNAME not between", value1, value2, "patname");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andPatnatIsNull() {
            addCriterion("PATNAT is null");
            return (Criteria) this;
        }

        public Criteria andPatnatIsNotNull() {
            addCriterion("PATNAT is not null");
            return (Criteria) this;
        }

        public Criteria andPatnatEqualTo(String value) {
            addCriterion("PATNAT =", value, "patnat");
            return (Criteria) this;
        }

        public Criteria andPatnatNotEqualTo(String value) {
            addCriterion("PATNAT <>", value, "patnat");
            return (Criteria) this;
        }

        public Criteria andPatnatGreaterThan(String value) {
            addCriterion("PATNAT >", value, "patnat");
            return (Criteria) this;
        }

        public Criteria andPatnatGreaterThanOrEqualTo(String value) {
            addCriterion("PATNAT >=", value, "patnat");
            return (Criteria) this;
        }

        public Criteria andPatnatLessThan(String value) {
            addCriterion("PATNAT <", value, "patnat");
            return (Criteria) this;
        }

        public Criteria andPatnatLessThanOrEqualTo(String value) {
            addCriterion("PATNAT <=", value, "patnat");
            return (Criteria) this;
        }

        public Criteria andPatnatLike(String value) {
            addCriterion("PATNAT like", value, "patnat");
            return (Criteria) this;
        }

        public Criteria andPatnatNotLike(String value) {
            addCriterion("PATNAT not like", value, "patnat");
            return (Criteria) this;
        }

        public Criteria andPatnatIn(List<String> values) {
            addCriterion("PATNAT in", values, "patnat");
            return (Criteria) this;
        }

        public Criteria andPatnatNotIn(List<String> values) {
            addCriterion("PATNAT not in", values, "patnat");
            return (Criteria) this;
        }

        public Criteria andPatnatBetween(String value1, String value2) {
            addCriterion("PATNAT between", value1, value2, "patnat");
            return (Criteria) this;
        }

        public Criteria andPatnatNotBetween(String value1, String value2) {
            addCriterion("PATNAT not between", value1, value2, "patnat");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andPatsexIsNull() {
            addCriterion("PATSEX is null");
            return (Criteria) this;
        }

        public Criteria andPatsexIsNotNull() {
            addCriterion("PATSEX is not null");
            return (Criteria) this;
        }

        public Criteria andPatsexEqualTo(String value) {
            addCriterion("PATSEX =", value, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatsexNotEqualTo(String value) {
            addCriterion("PATSEX <>", value, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatsexGreaterThan(String value) {
            addCriterion("PATSEX >", value, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatsexGreaterThanOrEqualTo(String value) {
            addCriterion("PATSEX >=", value, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatsexLessThan(String value) {
            addCriterion("PATSEX <", value, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatsexLessThanOrEqualTo(String value) {
            addCriterion("PATSEX <=", value, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatsexLike(String value) {
            addCriterion("PATSEX like", value, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatsexNotLike(String value) {
            addCriterion("PATSEX not like", value, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatsexIn(List<String> values) {
            addCriterion("PATSEX in", values, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatsexNotIn(List<String> values) {
            addCriterion("PATSEX not in", values, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatsexBetween(String value1, String value2) {
            addCriterion("PATSEX between", value1, value2, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatsexNotBetween(String value1, String value2) {
            addCriterion("PATSEX not between", value1, value2, "patsex");
            return (Criteria) this;
        }

        public Criteria andPatageIsNull() {
            addCriterion("PATAGE is null");
            return (Criteria) this;
        }

        public Criteria andPatageIsNotNull() {
            addCriterion("PATAGE is not null");
            return (Criteria) this;
        }

        public Criteria andPatageEqualTo(String value) {
            addCriterion("PATAGE =", value, "patage");
            return (Criteria) this;
        }

        public Criteria andPatageNotEqualTo(String value) {
            addCriterion("PATAGE <>", value, "patage");
            return (Criteria) this;
        }

        public Criteria andPatageGreaterThan(String value) {
            addCriterion("PATAGE >", value, "patage");
            return (Criteria) this;
        }

        public Criteria andPatageGreaterThanOrEqualTo(String value) {
            addCriterion("PATAGE >=", value, "patage");
            return (Criteria) this;
        }

        public Criteria andPatageLessThan(String value) {
            addCriterion("PATAGE <", value, "patage");
            return (Criteria) this;
        }

        public Criteria andPatageLessThanOrEqualTo(String value) {
            addCriterion("PATAGE <=", value, "patage");
            return (Criteria) this;
        }

        public Criteria andPatageLike(String value) {
            addCriterion("PATAGE like", value, "patage");
            return (Criteria) this;
        }

        public Criteria andPatageNotLike(String value) {
            addCriterion("PATAGE not like", value, "patage");
            return (Criteria) this;
        }

        public Criteria andPatageIn(List<String> values) {
            addCriterion("PATAGE in", values, "patage");
            return (Criteria) this;
        }

        public Criteria andPatageNotIn(List<String> values) {
            addCriterion("PATAGE not in", values, "patage");
            return (Criteria) this;
        }

        public Criteria andPatageBetween(String value1, String value2) {
            addCriterion("PATAGE between", value1, value2, "patage");
            return (Criteria) this;
        }

        public Criteria andPatageNotBetween(String value1, String value2) {
            addCriterion("PATAGE not between", value1, value2, "patage");
            return (Criteria) this;
        }

        public Criteria andAgecodeIsNull() {
            addCriterion("AGECODE is null");
            return (Criteria) this;
        }

        public Criteria andAgecodeIsNotNull() {
            addCriterion("AGECODE is not null");
            return (Criteria) this;
        }

        public Criteria andAgecodeEqualTo(String value) {
            addCriterion("AGECODE =", value, "agecode");
            return (Criteria) this;
        }

        public Criteria andAgecodeNotEqualTo(String value) {
            addCriterion("AGECODE <>", value, "agecode");
            return (Criteria) this;
        }

        public Criteria andAgecodeGreaterThan(String value) {
            addCriterion("AGECODE >", value, "agecode");
            return (Criteria) this;
        }

        public Criteria andAgecodeGreaterThanOrEqualTo(String value) {
            addCriterion("AGECODE >=", value, "agecode");
            return (Criteria) this;
        }

        public Criteria andAgecodeLessThan(String value) {
            addCriterion("AGECODE <", value, "agecode");
            return (Criteria) this;
        }

        public Criteria andAgecodeLessThanOrEqualTo(String value) {
            addCriterion("AGECODE <=", value, "agecode");
            return (Criteria) this;
        }

        public Criteria andAgecodeLike(String value) {
            addCriterion("AGECODE like", value, "agecode");
            return (Criteria) this;
        }

        public Criteria andAgecodeNotLike(String value) {
            addCriterion("AGECODE not like", value, "agecode");
            return (Criteria) this;
        }

        public Criteria andAgecodeIn(List<String> values) {
            addCriterion("AGECODE in", values, "agecode");
            return (Criteria) this;
        }

        public Criteria andAgecodeNotIn(List<String> values) {
            addCriterion("AGECODE not in", values, "agecode");
            return (Criteria) this;
        }

        public Criteria andAgecodeBetween(String value1, String value2) {
            addCriterion("AGECODE between", value1, value2, "agecode");
            return (Criteria) this;
        }

        public Criteria andAgecodeNotBetween(String value1, String value2) {
            addCriterion("AGECODE not between", value1, value2, "agecode");
            return (Criteria) this;
        }

        public Criteria andPatmtelIsNull() {
            addCriterion("PATMTEL is null");
            return (Criteria) this;
        }

        public Criteria andPatmtelIsNotNull() {
            addCriterion("PATMTEL is not null");
            return (Criteria) this;
        }

        public Criteria andPatmtelEqualTo(String value) {
            addCriterion("PATMTEL =", value, "patmtel");
            return (Criteria) this;
        }

        public Criteria andPatmtelNotEqualTo(String value) {
            addCriterion("PATMTEL <>", value, "patmtel");
            return (Criteria) this;
        }

        public Criteria andPatmtelGreaterThan(String value) {
            addCriterion("PATMTEL >", value, "patmtel");
            return (Criteria) this;
        }

        public Criteria andPatmtelGreaterThanOrEqualTo(String value) {
            addCriterion("PATMTEL >=", value, "patmtel");
            return (Criteria) this;
        }

        public Criteria andPatmtelLessThan(String value) {
            addCriterion("PATMTEL <", value, "patmtel");
            return (Criteria) this;
        }

        public Criteria andPatmtelLessThanOrEqualTo(String value) {
            addCriterion("PATMTEL <=", value, "patmtel");
            return (Criteria) this;
        }

        public Criteria andPatmtelLike(String value) {
            addCriterion("PATMTEL like", value, "patmtel");
            return (Criteria) this;
        }

        public Criteria andPatmtelNotLike(String value) {
            addCriterion("PATMTEL not like", value, "patmtel");
            return (Criteria) this;
        }

        public Criteria andPatmtelIn(List<String> values) {
            addCriterion("PATMTEL in", values, "patmtel");
            return (Criteria) this;
        }

        public Criteria andPatmtelNotIn(List<String> values) {
            addCriterion("PATMTEL not in", values, "patmtel");
            return (Criteria) this;
        }

        public Criteria andPatmtelBetween(String value1, String value2) {
            addCriterion("PATMTEL between", value1, value2, "patmtel");
            return (Criteria) this;
        }

        public Criteria andPatmtelNotBetween(String value1, String value2) {
            addCriterion("PATMTEL not between", value1, value2, "patmtel");
            return (Criteria) this;
        }

        public Criteria andConntelIsNull() {
            addCriterion("CONNTEL is null");
            return (Criteria) this;
        }

        public Criteria andConntelIsNotNull() {
            addCriterion("CONNTEL is not null");
            return (Criteria) this;
        }

        public Criteria andConntelEqualTo(String value) {
            addCriterion("CONNTEL =", value, "conntel");
            return (Criteria) this;
        }

        public Criteria andConntelNotEqualTo(String value) {
            addCriterion("CONNTEL <>", value, "conntel");
            return (Criteria) this;
        }

        public Criteria andConntelGreaterThan(String value) {
            addCriterion("CONNTEL >", value, "conntel");
            return (Criteria) this;
        }

        public Criteria andConntelGreaterThanOrEqualTo(String value) {
            addCriterion("CONNTEL >=", value, "conntel");
            return (Criteria) this;
        }

        public Criteria andConntelLessThan(String value) {
            addCriterion("CONNTEL <", value, "conntel");
            return (Criteria) this;
        }

        public Criteria andConntelLessThanOrEqualTo(String value) {
            addCriterion("CONNTEL <=", value, "conntel");
            return (Criteria) this;
        }

        public Criteria andConntelLike(String value) {
            addCriterion("CONNTEL like", value, "conntel");
            return (Criteria) this;
        }

        public Criteria andConntelNotLike(String value) {
            addCriterion("CONNTEL not like", value, "conntel");
            return (Criteria) this;
        }

        public Criteria andConntelIn(List<String> values) {
            addCriterion("CONNTEL in", values, "conntel");
            return (Criteria) this;
        }

        public Criteria andConntelNotIn(List<String> values) {
            addCriterion("CONNTEL not in", values, "conntel");
            return (Criteria) this;
        }

        public Criteria andConntelBetween(String value1, String value2) {
            addCriterion("CONNTEL between", value1, value2, "conntel");
            return (Criteria) this;
        }

        public Criteria andConntelNotBetween(String value1, String value2) {
            addCriterion("CONNTEL not between", value1, value2, "conntel");
            return (Criteria) this;
        }

        public Criteria andPataddrIsNull() {
            addCriterion("PATADDR is null");
            return (Criteria) this;
        }

        public Criteria andPataddrIsNotNull() {
            addCriterion("PATADDR is not null");
            return (Criteria) this;
        }

        public Criteria andPataddrEqualTo(String value) {
            addCriterion("PATADDR =", value, "pataddr");
            return (Criteria) this;
        }

        public Criteria andPataddrNotEqualTo(String value) {
            addCriterion("PATADDR <>", value, "pataddr");
            return (Criteria) this;
        }

        public Criteria andPataddrGreaterThan(String value) {
            addCriterion("PATADDR >", value, "pataddr");
            return (Criteria) this;
        }

        public Criteria andPataddrGreaterThanOrEqualTo(String value) {
            addCriterion("PATADDR >=", value, "pataddr");
            return (Criteria) this;
        }

        public Criteria andPataddrLessThan(String value) {
            addCriterion("PATADDR <", value, "pataddr");
            return (Criteria) this;
        }

        public Criteria andPataddrLessThanOrEqualTo(String value) {
            addCriterion("PATADDR <=", value, "pataddr");
            return (Criteria) this;
        }

        public Criteria andPataddrLike(String value) {
            addCriterion("PATADDR like", value, "pataddr");
            return (Criteria) this;
        }

        public Criteria andPataddrNotLike(String value) {
            addCriterion("PATADDR not like", value, "pataddr");
            return (Criteria) this;
        }

        public Criteria andPataddrIn(List<String> values) {
            addCriterion("PATADDR in", values, "pataddr");
            return (Criteria) this;
        }

        public Criteria andPataddrNotIn(List<String> values) {
            addCriterion("PATADDR not in", values, "pataddr");
            return (Criteria) this;
        }

        public Criteria andPataddrBetween(String value1, String value2) {
            addCriterion("PATADDR between", value1, value2, "pataddr");
            return (Criteria) this;
        }

        public Criteria andPataddrNotBetween(String value1, String value2) {
            addCriterion("PATADDR not between", value1, value2, "pataddr");
            return (Criteria) this;
        }

        public Criteria andOcrflagIsNull() {
            addCriterion("OCRFLAG is null");
            return (Criteria) this;
        }

        public Criteria andOcrflagIsNotNull() {
            addCriterion("OCRFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOcrflagEqualTo(String value) {
            addCriterion("OCRFLAG =", value, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andOcrflagNotEqualTo(String value) {
            addCriterion("OCRFLAG <>", value, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andOcrflagGreaterThan(String value) {
            addCriterion("OCRFLAG >", value, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andOcrflagGreaterThanOrEqualTo(String value) {
            addCriterion("OCRFLAG >=", value, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andOcrflagLessThan(String value) {
            addCriterion("OCRFLAG <", value, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andOcrflagLessThanOrEqualTo(String value) {
            addCriterion("OCRFLAG <=", value, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andOcrflagLike(String value) {
            addCriterion("OCRFLAG like", value, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andOcrflagNotLike(String value) {
            addCriterion("OCRFLAG not like", value, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andOcrflagIn(List<String> values) {
            addCriterion("OCRFLAG in", values, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andOcrflagNotIn(List<String> values) {
            addCriterion("OCRFLAG not in", values, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andOcrflagBetween(String value1, String value2) {
            addCriterion("OCRFLAG between", value1, value2, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andOcrflagNotBetween(String value1, String value2) {
            addCriterion("OCRFLAG not between", value1, value2, "ocrflag");
            return (Criteria) this;
        }

        public Criteria andPattypeIsNull() {
            addCriterion("PATTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPattypeIsNotNull() {
            addCriterion("PATTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPattypeEqualTo(String value) {
            addCriterion("PATTYPE =", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeNotEqualTo(String value) {
            addCriterion("PATTYPE <>", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeGreaterThan(String value) {
            addCriterion("PATTYPE >", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeGreaterThanOrEqualTo(String value) {
            addCriterion("PATTYPE >=", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeLessThan(String value) {
            addCriterion("PATTYPE <", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeLessThanOrEqualTo(String value) {
            addCriterion("PATTYPE <=", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeLike(String value) {
            addCriterion("PATTYPE like", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeNotLike(String value) {
            addCriterion("PATTYPE not like", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeIn(List<String> values) {
            addCriterion("PATTYPE in", values, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeNotIn(List<String> values) {
            addCriterion("PATTYPE not in", values, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeBetween(String value1, String value2) {
            addCriterion("PATTYPE between", value1, value2, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeNotBetween(String value1, String value2) {
            addCriterion("PATTYPE not between", value1, value2, "pattype");
            return (Criteria) this;
        }

        public Criteria andPatmemoIsNull() {
            addCriterion("PATMEMO is null");
            return (Criteria) this;
        }

        public Criteria andPatmemoIsNotNull() {
            addCriterion("PATMEMO is not null");
            return (Criteria) this;
        }

        public Criteria andPatmemoEqualTo(String value) {
            addCriterion("PATMEMO =", value, "patmemo");
            return (Criteria) this;
        }

        public Criteria andPatmemoNotEqualTo(String value) {
            addCriterion("PATMEMO <>", value, "patmemo");
            return (Criteria) this;
        }

        public Criteria andPatmemoGreaterThan(String value) {
            addCriterion("PATMEMO >", value, "patmemo");
            return (Criteria) this;
        }

        public Criteria andPatmemoGreaterThanOrEqualTo(String value) {
            addCriterion("PATMEMO >=", value, "patmemo");
            return (Criteria) this;
        }

        public Criteria andPatmemoLessThan(String value) {
            addCriterion("PATMEMO <", value, "patmemo");
            return (Criteria) this;
        }

        public Criteria andPatmemoLessThanOrEqualTo(String value) {
            addCriterion("PATMEMO <=", value, "patmemo");
            return (Criteria) this;
        }

        public Criteria andPatmemoLike(String value) {
            addCriterion("PATMEMO like", value, "patmemo");
            return (Criteria) this;
        }

        public Criteria andPatmemoNotLike(String value) {
            addCriterion("PATMEMO not like", value, "patmemo");
            return (Criteria) this;
        }

        public Criteria andPatmemoIn(List<String> values) {
            addCriterion("PATMEMO in", values, "patmemo");
            return (Criteria) this;
        }

        public Criteria andPatmemoNotIn(List<String> values) {
            addCriterion("PATMEMO not in", values, "patmemo");
            return (Criteria) this;
        }

        public Criteria andPatmemoBetween(String value1, String value2) {
            addCriterion("PATMEMO between", value1, value2, "patmemo");
            return (Criteria) this;
        }

        public Criteria andPatmemoNotBetween(String value1, String value2) {
            addCriterion("PATMEMO not between", value1, value2, "patmemo");
            return (Criteria) this;
        }

        public Criteria andTmpNbrIsNull() {
            addCriterion("TMP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andTmpNbrIsNotNull() {
            addCriterion("TMP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andTmpNbrEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR =", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR <>", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrGreaterThan(BigDecimal value) {
            addCriterion("TMP_NBR >", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR >=", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLessThan(BigDecimal value) {
            addCriterion("TMP_NBR <", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR <=", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrIn(List<BigDecimal> values) {
            addCriterion("TMP_NBR in", values, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotIn(List<BigDecimal> values) {
            addCriterion("TMP_NBR not in", values, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TMP_NBR between", value1, value2, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TMP_NBR not between", value1, value2, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNull() {
            addCriterion("HRT_RTE is null");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNotNull() {
            addCriterion("HRT_RTE is not null");
            return (Criteria) this;
        }

        public Criteria andHrtRteEqualTo(Short value) {
            addCriterion("HRT_RTE =", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotEqualTo(Short value) {
            addCriterion("HRT_RTE <>", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThan(Short value) {
            addCriterion("HRT_RTE >", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThanOrEqualTo(Short value) {
            addCriterion("HRT_RTE >=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThan(Short value) {
            addCriterion("HRT_RTE <", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThanOrEqualTo(Short value) {
            addCriterion("HRT_RTE <=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteIn(List<Short> values) {
            addCriterion("HRT_RTE in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotIn(List<Short> values) {
            addCriterion("HRT_RTE not in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteBetween(Short value1, Short value2) {
            addCriterion("HRT_RTE between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotBetween(Short value1, Short value2) {
            addCriterion("HRT_RTE not between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andBreNbrIsNull() {
            addCriterion("BRE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andBreNbrIsNotNull() {
            addCriterion("BRE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andBreNbrEqualTo(Short value) {
            addCriterion("BRE_NBR =", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotEqualTo(Short value) {
            addCriterion("BRE_NBR <>", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThan(Short value) {
            addCriterion("BRE_NBR >", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("BRE_NBR >=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThan(Short value) {
            addCriterion("BRE_NBR <", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThanOrEqualTo(Short value) {
            addCriterion("BRE_NBR <=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrIn(List<Short> values) {
            addCriterion("BRE_NBR in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotIn(List<Short> values) {
            addCriterion("BRE_NBR not in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrBetween(Short value1, Short value2) {
            addCriterion("BRE_NBR between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotBetween(Short value1, Short value2) {
            addCriterion("BRE_NBR not between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrIsNull() {
            addCriterion("SBP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpNbrIsNotNull() {
            addCriterion("SBP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpNbrEqualTo(Short value) {
            addCriterion("SBP_NBR =", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrNotEqualTo(Short value) {
            addCriterion("SBP_NBR <>", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrGreaterThan(Short value) {
            addCriterion("SBP_NBR >", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("SBP_NBR >=", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrLessThan(Short value) {
            addCriterion("SBP_NBR <", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrLessThanOrEqualTo(Short value) {
            addCriterion("SBP_NBR <=", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrIn(List<Short> values) {
            addCriterion("SBP_NBR in", values, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrNotIn(List<Short> values) {
            addCriterion("SBP_NBR not in", values, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrBetween(Short value1, Short value2) {
            addCriterion("SBP_NBR between", value1, value2, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrNotBetween(Short value1, Short value2) {
            addCriterion("SBP_NBR not between", value1, value2, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSenRctIsNull() {
            addCriterion("SEN_RCT is null");
            return (Criteria) this;
        }

        public Criteria andSenRctIsNotNull() {
            addCriterion("SEN_RCT is not null");
            return (Criteria) this;
        }

        public Criteria andSenRctEqualTo(String value) {
            addCriterion("SEN_RCT =", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctNotEqualTo(String value) {
            addCriterion("SEN_RCT <>", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctGreaterThan(String value) {
            addCriterion("SEN_RCT >", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctGreaterThanOrEqualTo(String value) {
            addCriterion("SEN_RCT >=", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctLessThan(String value) {
            addCriterion("SEN_RCT <", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctLessThanOrEqualTo(String value) {
            addCriterion("SEN_RCT <=", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctLike(String value) {
            addCriterion("SEN_RCT like", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctNotLike(String value) {
            addCriterion("SEN_RCT not like", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctIn(List<String> values) {
            addCriterion("SEN_RCT in", values, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctNotIn(List<String> values) {
            addCriterion("SEN_RCT not in", values, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctBetween(String value1, String value2) {
            addCriterion("SEN_RCT between", value1, value2, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctNotBetween(String value1, String value2) {
            addCriterion("SEN_RCT not between", value1, value2, "senRct");
            return (Criteria) this;
        }

        public Criteria andDbpNbrIsNull() {
            addCriterion("DBP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andDbpNbrIsNotNull() {
            addCriterion("DBP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andDbpNbrEqualTo(Short value) {
            addCriterion("DBP_NBR =", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrNotEqualTo(Short value) {
            addCriterion("DBP_NBR <>", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrGreaterThan(Short value) {
            addCriterion("DBP_NBR >", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("DBP_NBR >=", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrLessThan(Short value) {
            addCriterion("DBP_NBR <", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrLessThanOrEqualTo(Short value) {
            addCriterion("DBP_NBR <=", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrIn(List<Short> values) {
            addCriterion("DBP_NBR in", values, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrNotIn(List<Short> values) {
            addCriterion("DBP_NBR not in", values, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrBetween(Short value1, Short value2) {
            addCriterion("DBP_NBR between", value1, value2, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrNotBetween(Short value1, Short value2) {
            addCriterion("DBP_NBR not between", value1, value2, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andBldOxyIsNull() {
            addCriterion("BLD_OXY is null");
            return (Criteria) this;
        }

        public Criteria andBldOxyIsNotNull() {
            addCriterion("BLD_OXY is not null");
            return (Criteria) this;
        }

        public Criteria andBldOxyEqualTo(Short value) {
            addCriterion("BLD_OXY =", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyNotEqualTo(Short value) {
            addCriterion("BLD_OXY <>", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyGreaterThan(Short value) {
            addCriterion("BLD_OXY >", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyGreaterThanOrEqualTo(Short value) {
            addCriterion("BLD_OXY >=", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyLessThan(Short value) {
            addCriterion("BLD_OXY <", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyLessThanOrEqualTo(Short value) {
            addCriterion("BLD_OXY <=", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyIn(List<Short> values) {
            addCriterion("BLD_OXY in", values, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyNotIn(List<Short> values) {
            addCriterion("BLD_OXY not in", values, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyBetween(Short value1, Short value2) {
            addCriterion("BLD_OXY between", value1, value2, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyNotBetween(Short value1, Short value2) {
            addCriterion("BLD_OXY not between", value1, value2, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andMewsscoIsNull() {
            addCriterion("MEWSSCO is null");
            return (Criteria) this;
        }

        public Criteria andMewsscoIsNotNull() {
            addCriterion("MEWSSCO is not null");
            return (Criteria) this;
        }

        public Criteria andMewsscoEqualTo(Short value) {
            addCriterion("MEWSSCO =", value, "mewssco");
            return (Criteria) this;
        }

        public Criteria andMewsscoNotEqualTo(Short value) {
            addCriterion("MEWSSCO <>", value, "mewssco");
            return (Criteria) this;
        }

        public Criteria andMewsscoGreaterThan(Short value) {
            addCriterion("MEWSSCO >", value, "mewssco");
            return (Criteria) this;
        }

        public Criteria andMewsscoGreaterThanOrEqualTo(Short value) {
            addCriterion("MEWSSCO >=", value, "mewssco");
            return (Criteria) this;
        }

        public Criteria andMewsscoLessThan(Short value) {
            addCriterion("MEWSSCO <", value, "mewssco");
            return (Criteria) this;
        }

        public Criteria andMewsscoLessThanOrEqualTo(Short value) {
            addCriterion("MEWSSCO <=", value, "mewssco");
            return (Criteria) this;
        }

        public Criteria andMewsscoIn(List<Short> values) {
            addCriterion("MEWSSCO in", values, "mewssco");
            return (Criteria) this;
        }

        public Criteria andMewsscoNotIn(List<Short> values) {
            addCriterion("MEWSSCO not in", values, "mewssco");
            return (Criteria) this;
        }

        public Criteria andMewsscoBetween(Short value1, Short value2) {
            addCriterion("MEWSSCO between", value1, value2, "mewssco");
            return (Criteria) this;
        }

        public Criteria andMewsscoNotBetween(Short value1, Short value2) {
            addCriterion("MEWSSCO not between", value1, value2, "mewssco");
            return (Criteria) this;
        }

        public Criteria andMewslvlIsNull() {
            addCriterion("MEWSLVL is null");
            return (Criteria) this;
        }

        public Criteria andMewslvlIsNotNull() {
            addCriterion("MEWSLVL is not null");
            return (Criteria) this;
        }

        public Criteria andMewslvlEqualTo(String value) {
            addCriterion("MEWSLVL =", value, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andMewslvlNotEqualTo(String value) {
            addCriterion("MEWSLVL <>", value, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andMewslvlGreaterThan(String value) {
            addCriterion("MEWSLVL >", value, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andMewslvlGreaterThanOrEqualTo(String value) {
            addCriterion("MEWSLVL >=", value, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andMewslvlLessThan(String value) {
            addCriterion("MEWSLVL <", value, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andMewslvlLessThanOrEqualTo(String value) {
            addCriterion("MEWSLVL <=", value, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andMewslvlLike(String value) {
            addCriterion("MEWSLVL like", value, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andMewslvlNotLike(String value) {
            addCriterion("MEWSLVL not like", value, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andMewslvlIn(List<String> values) {
            addCriterion("MEWSLVL in", values, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andMewslvlNotIn(List<String> values) {
            addCriterion("MEWSLVL not in", values, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andMewslvlBetween(String value1, String value2) {
            addCriterion("MEWSLVL between", value1, value2, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andMewslvlNotBetween(String value1, String value2) {
            addCriterion("MEWSLVL not between", value1, value2, "mewslvl");
            return (Criteria) this;
        }

        public Criteria andIsbindIsNull() {
            addCriterion("ISBIND is null");
            return (Criteria) this;
        }

        public Criteria andIsbindIsNotNull() {
            addCriterion("ISBIND is not null");
            return (Criteria) this;
        }

        public Criteria andIsbindEqualTo(String value) {
            addCriterion("ISBIND =", value, "isbind");
            return (Criteria) this;
        }

        public Criteria andIsbindNotEqualTo(String value) {
            addCriterion("ISBIND <>", value, "isbind");
            return (Criteria) this;
        }

        public Criteria andIsbindGreaterThan(String value) {
            addCriterion("ISBIND >", value, "isbind");
            return (Criteria) this;
        }

        public Criteria andIsbindGreaterThanOrEqualTo(String value) {
            addCriterion("ISBIND >=", value, "isbind");
            return (Criteria) this;
        }

        public Criteria andIsbindLessThan(String value) {
            addCriterion("ISBIND <", value, "isbind");
            return (Criteria) this;
        }

        public Criteria andIsbindLessThanOrEqualTo(String value) {
            addCriterion("ISBIND <=", value, "isbind");
            return (Criteria) this;
        }

        public Criteria andIsbindLike(String value) {
            addCriterion("ISBIND like", value, "isbind");
            return (Criteria) this;
        }

        public Criteria andIsbindNotLike(String value) {
            addCriterion("ISBIND not like", value, "isbind");
            return (Criteria) this;
        }

        public Criteria andIsbindIn(List<String> values) {
            addCriterion("ISBIND in", values, "isbind");
            return (Criteria) this;
        }

        public Criteria andIsbindNotIn(List<String> values) {
            addCriterion("ISBIND not in", values, "isbind");
            return (Criteria) this;
        }

        public Criteria andIsbindBetween(String value1, String value2) {
            addCriterion("ISBIND between", value1, value2, "isbind");
            return (Criteria) this;
        }

        public Criteria andIsbindNotBetween(String value1, String value2) {
            addCriterion("ISBIND not between", value1, value2, "isbind");
            return (Criteria) this;
        }

        public Criteria andCrtuseridIsNull() {
            addCriterion("CRTUSERID is null");
            return (Criteria) this;
        }

        public Criteria andCrtuseridIsNotNull() {
            addCriterion("CRTUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andCrtuseridEqualTo(String value) {
            addCriterion("CRTUSERID =", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridNotEqualTo(String value) {
            addCriterion("CRTUSERID <>", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridGreaterThan(String value) {
            addCriterion("CRTUSERID >", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CRTUSERID >=", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridLessThan(String value) {
            addCriterion("CRTUSERID <", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridLessThanOrEqualTo(String value) {
            addCriterion("CRTUSERID <=", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridLike(String value) {
            addCriterion("CRTUSERID like", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridNotLike(String value) {
            addCriterion("CRTUSERID not like", value, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridIn(List<String> values) {
            addCriterion("CRTUSERID in", values, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridNotIn(List<String> values) {
            addCriterion("CRTUSERID not in", values, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridBetween(String value1, String value2) {
            addCriterion("CRTUSERID between", value1, value2, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrtuseridNotBetween(String value1, String value2) {
            addCriterion("CRTUSERID not between", value1, value2, "crtuserid");
            return (Criteria) this;
        }

        public Criteria andCrttimeIsNull() {
            addCriterion("CRTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCrttimeIsNotNull() {
            addCriterion("CRTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrttimeEqualTo(Date value) {
            addCriterion("CRTTIME =", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeNotEqualTo(Date value) {
            addCriterion("CRTTIME <>", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeGreaterThan(Date value) {
            addCriterion("CRTTIME >", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRTTIME >=", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeLessThan(Date value) {
            addCriterion("CRTTIME <", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeLessThanOrEqualTo(Date value) {
            addCriterion("CRTTIME <=", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeIn(List<Date> values) {
            addCriterion("CRTTIME in", values, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeNotIn(List<Date> values) {
            addCriterion("CRTTIME not in", values, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeBetween(Date value1, Date value2) {
            addCriterion("CRTTIME between", value1, value2, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeNotBetween(Date value1, Date value2) {
            addCriterion("CRTTIME not between", value1, value2, "crttime");
            return (Criteria) this;
        }

        public Criteria andHavFmyIsNull() {
            addCriterion("HAV_FMY is null");
            return (Criteria) this;
        }

        public Criteria andHavFmyIsNotNull() {
            addCriterion("HAV_FMY is not null");
            return (Criteria) this;
        }

        public Criteria andHavFmyEqualTo(String value) {
            addCriterion("HAV_FMY =", value, "havFmy");
            return (Criteria) this;
        }

        public Criteria andHavFmyNotEqualTo(String value) {
            addCriterion("HAV_FMY <>", value, "havFmy");
            return (Criteria) this;
        }

        public Criteria andHavFmyGreaterThan(String value) {
            addCriterion("HAV_FMY >", value, "havFmy");
            return (Criteria) this;
        }

        public Criteria andHavFmyGreaterThanOrEqualTo(String value) {
            addCriterion("HAV_FMY >=", value, "havFmy");
            return (Criteria) this;
        }

        public Criteria andHavFmyLessThan(String value) {
            addCriterion("HAV_FMY <", value, "havFmy");
            return (Criteria) this;
        }

        public Criteria andHavFmyLessThanOrEqualTo(String value) {
            addCriterion("HAV_FMY <=", value, "havFmy");
            return (Criteria) this;
        }

        public Criteria andHavFmyLike(String value) {
            addCriterion("HAV_FMY like", value, "havFmy");
            return (Criteria) this;
        }

        public Criteria andHavFmyNotLike(String value) {
            addCriterion("HAV_FMY not like", value, "havFmy");
            return (Criteria) this;
        }

        public Criteria andHavFmyIn(List<String> values) {
            addCriterion("HAV_FMY in", values, "havFmy");
            return (Criteria) this;
        }

        public Criteria andHavFmyNotIn(List<String> values) {
            addCriterion("HAV_FMY not in", values, "havFmy");
            return (Criteria) this;
        }

        public Criteria andHavFmyBetween(String value1, String value2) {
            addCriterion("HAV_FMY between", value1, value2, "havFmy");
            return (Criteria) this;
        }

        public Criteria andHavFmyNotBetween(String value1, String value2) {
            addCriterion("HAV_FMY not between", value1, value2, "havFmy");
            return (Criteria) this;
        }

        public Criteria andCstOccCodIsNull() {
            addCriterion("CST_OCC_COD is null");
            return (Criteria) this;
        }

        public Criteria andCstOccCodIsNotNull() {
            addCriterion("CST_OCC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCstOccCodEqualTo(String value) {
            addCriterion("CST_OCC_COD =", value, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andCstOccCodNotEqualTo(String value) {
            addCriterion("CST_OCC_COD <>", value, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andCstOccCodGreaterThan(String value) {
            addCriterion("CST_OCC_COD >", value, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andCstOccCodGreaterThanOrEqualTo(String value) {
            addCriterion("CST_OCC_COD >=", value, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andCstOccCodLessThan(String value) {
            addCriterion("CST_OCC_COD <", value, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andCstOccCodLessThanOrEqualTo(String value) {
            addCriterion("CST_OCC_COD <=", value, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andCstOccCodLike(String value) {
            addCriterion("CST_OCC_COD like", value, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andCstOccCodNotLike(String value) {
            addCriterion("CST_OCC_COD not like", value, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andCstOccCodIn(List<String> values) {
            addCriterion("CST_OCC_COD in", values, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andCstOccCodNotIn(List<String> values) {
            addCriterion("CST_OCC_COD not in", values, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andCstOccCodBetween(String value1, String value2) {
            addCriterion("CST_OCC_COD between", value1, value2, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andCstOccCodNotBetween(String value1, String value2) {
            addCriterion("CST_OCC_COD not between", value1, value2, "cstOccCod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodIsNull() {
            addCriterion("SCE_AR1_COD is null");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodIsNotNull() {
            addCriterion("SCE_AR1_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodEqualTo(String value) {
            addCriterion("SCE_AR1_COD =", value, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodNotEqualTo(String value) {
            addCriterion("SCE_AR1_COD <>", value, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodGreaterThan(String value) {
            addCriterion("SCE_AR1_COD >", value, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodGreaterThanOrEqualTo(String value) {
            addCriterion("SCE_AR1_COD >=", value, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodLessThan(String value) {
            addCriterion("SCE_AR1_COD <", value, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodLessThanOrEqualTo(String value) {
            addCriterion("SCE_AR1_COD <=", value, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodLike(String value) {
            addCriterion("SCE_AR1_COD like", value, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodNotLike(String value) {
            addCriterion("SCE_AR1_COD not like", value, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodIn(List<String> values) {
            addCriterion("SCE_AR1_COD in", values, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodNotIn(List<String> values) {
            addCriterion("SCE_AR1_COD not in", values, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodBetween(String value1, String value2) {
            addCriterion("SCE_AR1_COD between", value1, value2, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr1CodNotBetween(String value1, String value2) {
            addCriterion("SCE_AR1_COD not between", value1, value2, "sceAr1Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodIsNull() {
            addCriterion("SCE_AR2_COD is null");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodIsNotNull() {
            addCriterion("SCE_AR2_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodEqualTo(String value) {
            addCriterion("SCE_AR2_COD =", value, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodNotEqualTo(String value) {
            addCriterion("SCE_AR2_COD <>", value, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodGreaterThan(String value) {
            addCriterion("SCE_AR2_COD >", value, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodGreaterThanOrEqualTo(String value) {
            addCriterion("SCE_AR2_COD >=", value, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodLessThan(String value) {
            addCriterion("SCE_AR2_COD <", value, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodLessThanOrEqualTo(String value) {
            addCriterion("SCE_AR2_COD <=", value, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodLike(String value) {
            addCriterion("SCE_AR2_COD like", value, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodNotLike(String value) {
            addCriterion("SCE_AR2_COD not like", value, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodIn(List<String> values) {
            addCriterion("SCE_AR2_COD in", values, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodNotIn(List<String> values) {
            addCriterion("SCE_AR2_COD not in", values, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodBetween(String value1, String value2) {
            addCriterion("SCE_AR2_COD between", value1, value2, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr2CodNotBetween(String value1, String value2) {
            addCriterion("SCE_AR2_COD not between", value1, value2, "sceAr2Cod");
            return (Criteria) this;
        }

        public Criteria andSceAdrIsNull() {
            addCriterion("SCE_ADR is null");
            return (Criteria) this;
        }

        public Criteria andSceAdrIsNotNull() {
            addCriterion("SCE_ADR is not null");
            return (Criteria) this;
        }

        public Criteria andSceAdrEqualTo(String value) {
            addCriterion("SCE_ADR =", value, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andSceAdrNotEqualTo(String value) {
            addCriterion("SCE_ADR <>", value, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andSceAdrGreaterThan(String value) {
            addCriterion("SCE_ADR >", value, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andSceAdrGreaterThanOrEqualTo(String value) {
            addCriterion("SCE_ADR >=", value, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andSceAdrLessThan(String value) {
            addCriterion("SCE_ADR <", value, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andSceAdrLessThanOrEqualTo(String value) {
            addCriterion("SCE_ADR <=", value, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andSceAdrLike(String value) {
            addCriterion("SCE_ADR like", value, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andSceAdrNotLike(String value) {
            addCriterion("SCE_ADR not like", value, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andSceAdrIn(List<String> values) {
            addCriterion("SCE_ADR in", values, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andSceAdrNotIn(List<String> values) {
            addCriterion("SCE_ADR not in", values, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andSceAdrBetween(String value1, String value2) {
            addCriterion("SCE_ADR between", value1, value2, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andSceAdrNotBetween(String value1, String value2) {
            addCriterion("SCE_ADR not between", value1, value2, "sceAdr");
            return (Criteria) this;
        }

        public Criteria andLnkManIsNull() {
            addCriterion("LNK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andLnkManIsNotNull() {
            addCriterion("LNK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andLnkManEqualTo(String value) {
            addCriterion("LNK_MAN =", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManNotEqualTo(String value) {
            addCriterion("LNK_MAN <>", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManGreaterThan(String value) {
            addCriterion("LNK_MAN >", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManGreaterThanOrEqualTo(String value) {
            addCriterion("LNK_MAN >=", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManLessThan(String value) {
            addCriterion("LNK_MAN <", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManLessThanOrEqualTo(String value) {
            addCriterion("LNK_MAN <=", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManLike(String value) {
            addCriterion("LNK_MAN like", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManNotLike(String value) {
            addCriterion("LNK_MAN not like", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManIn(List<String> values) {
            addCriterion("LNK_MAN in", values, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManNotIn(List<String> values) {
            addCriterion("LNK_MAN not in", values, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManBetween(String value1, String value2) {
            addCriterion("LNK_MAN between", value1, value2, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManNotBetween(String value1, String value2) {
            addCriterion("LNK_MAN not between", value1, value2, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andAlmSeqIsNull() {
            addCriterion("ALM_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andAlmSeqIsNotNull() {
            addCriterion("ALM_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andAlmSeqEqualTo(String value) {
            addCriterion("ALM_SEQ =", value, "almSeq");
            return (Criteria) this;
        }

        public Criteria andAlmSeqNotEqualTo(String value) {
            addCriterion("ALM_SEQ <>", value, "almSeq");
            return (Criteria) this;
        }

        public Criteria andAlmSeqGreaterThan(String value) {
            addCriterion("ALM_SEQ >", value, "almSeq");
            return (Criteria) this;
        }

        public Criteria andAlmSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ALM_SEQ >=", value, "almSeq");
            return (Criteria) this;
        }

        public Criteria andAlmSeqLessThan(String value) {
            addCriterion("ALM_SEQ <", value, "almSeq");
            return (Criteria) this;
        }

        public Criteria andAlmSeqLessThanOrEqualTo(String value) {
            addCriterion("ALM_SEQ <=", value, "almSeq");
            return (Criteria) this;
        }

        public Criteria andAlmSeqLike(String value) {
            addCriterion("ALM_SEQ like", value, "almSeq");
            return (Criteria) this;
        }

        public Criteria andAlmSeqNotLike(String value) {
            addCriterion("ALM_SEQ not like", value, "almSeq");
            return (Criteria) this;
        }

        public Criteria andAlmSeqIn(List<String> values) {
            addCriterion("ALM_SEQ in", values, "almSeq");
            return (Criteria) this;
        }

        public Criteria andAlmSeqNotIn(List<String> values) {
            addCriterion("ALM_SEQ not in", values, "almSeq");
            return (Criteria) this;
        }

        public Criteria andAlmSeqBetween(String value1, String value2) {
            addCriterion("ALM_SEQ between", value1, value2, "almSeq");
            return (Criteria) this;
        }

        public Criteria andAlmSeqNotBetween(String value1, String value2) {
            addCriterion("ALM_SEQ not between", value1, value2, "almSeq");
            return (Criteria) this;
        }

        public Criteria andDrrNoIsNull() {
            addCriterion("DRR_NO is null");
            return (Criteria) this;
        }

        public Criteria andDrrNoIsNotNull() {
            addCriterion("DRR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDrrNoEqualTo(String value) {
            addCriterion("DRR_NO =", value, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNoNotEqualTo(String value) {
            addCriterion("DRR_NO <>", value, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNoGreaterThan(String value) {
            addCriterion("DRR_NO >", value, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNoGreaterThanOrEqualTo(String value) {
            addCriterion("DRR_NO >=", value, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNoLessThan(String value) {
            addCriterion("DRR_NO <", value, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNoLessThanOrEqualTo(String value) {
            addCriterion("DRR_NO <=", value, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNoLike(String value) {
            addCriterion("DRR_NO like", value, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNoNotLike(String value) {
            addCriterion("DRR_NO not like", value, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNoIn(List<String> values) {
            addCriterion("DRR_NO in", values, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNoNotIn(List<String> values) {
            addCriterion("DRR_NO not in", values, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNoBetween(String value1, String value2) {
            addCriterion("DRR_NO between", value1, value2, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNoNotBetween(String value1, String value2) {
            addCriterion("DRR_NO not between", value1, value2, "drrNo");
            return (Criteria) this;
        }

        public Criteria andDrrNmeIsNull() {
            addCriterion("DRR_NME is null");
            return (Criteria) this;
        }

        public Criteria andDrrNmeIsNotNull() {
            addCriterion("DRR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andDrrNmeEqualTo(String value) {
            addCriterion("DRR_NME =", value, "drrNme");
            return (Criteria) this;
        }

        public Criteria andDrrNmeNotEqualTo(String value) {
            addCriterion("DRR_NME <>", value, "drrNme");
            return (Criteria) this;
        }

        public Criteria andDrrNmeGreaterThan(String value) {
            addCriterion("DRR_NME >", value, "drrNme");
            return (Criteria) this;
        }

        public Criteria andDrrNmeGreaterThanOrEqualTo(String value) {
            addCriterion("DRR_NME >=", value, "drrNme");
            return (Criteria) this;
        }

        public Criteria andDrrNmeLessThan(String value) {
            addCriterion("DRR_NME <", value, "drrNme");
            return (Criteria) this;
        }

        public Criteria andDrrNmeLessThanOrEqualTo(String value) {
            addCriterion("DRR_NME <=", value, "drrNme");
            return (Criteria) this;
        }

        public Criteria andDrrNmeLike(String value) {
            addCriterion("DRR_NME like", value, "drrNme");
            return (Criteria) this;
        }

        public Criteria andDrrNmeNotLike(String value) {
            addCriterion("DRR_NME not like", value, "drrNme");
            return (Criteria) this;
        }

        public Criteria andDrrNmeIn(List<String> values) {
            addCriterion("DRR_NME in", values, "drrNme");
            return (Criteria) this;
        }

        public Criteria andDrrNmeNotIn(List<String> values) {
            addCriterion("DRR_NME not in", values, "drrNme");
            return (Criteria) this;
        }

        public Criteria andDrrNmeBetween(String value1, String value2) {
            addCriterion("DRR_NME between", value1, value2, "drrNme");
            return (Criteria) this;
        }

        public Criteria andDrrNmeNotBetween(String value1, String value2) {
            addCriterion("DRR_NME not between", value1, value2, "drrNme");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNull() {
            addCriterion("CAR_NO is null");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNotNull() {
            addCriterion("CAR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCarNoEqualTo(String value) {
            addCriterion("CAR_NO =", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotEqualTo(String value) {
            addCriterion("CAR_NO <>", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThan(String value) {
            addCriterion("CAR_NO >", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_NO >=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThan(String value) {
            addCriterion("CAR_NO <", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThanOrEqualTo(String value) {
            addCriterion("CAR_NO <=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLike(String value) {
            addCriterion("CAR_NO like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotLike(String value) {
            addCriterion("CAR_NO not like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoIn(List<String> values) {
            addCriterion("CAR_NO in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotIn(List<String> values) {
            addCriterion("CAR_NO not in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoBetween(String value1, String value2) {
            addCriterion("CAR_NO between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotBetween(String value1, String value2) {
            addCriterion("CAR_NO not between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andDocNoIsNull() {
            addCriterion("DOC_NO is null");
            return (Criteria) this;
        }

        public Criteria andDocNoIsNotNull() {
            addCriterion("DOC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDocNoEqualTo(String value) {
            addCriterion("DOC_NO =", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotEqualTo(String value) {
            addCriterion("DOC_NO <>", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoGreaterThan(String value) {
            addCriterion("DOC_NO >", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_NO >=", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLessThan(String value) {
            addCriterion("DOC_NO <", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLessThanOrEqualTo(String value) {
            addCriterion("DOC_NO <=", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLike(String value) {
            addCriterion("DOC_NO like", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotLike(String value) {
            addCriterion("DOC_NO not like", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoIn(List<String> values) {
            addCriterion("DOC_NO in", values, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotIn(List<String> values) {
            addCriterion("DOC_NO not in", values, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoBetween(String value1, String value2) {
            addCriterion("DOC_NO between", value1, value2, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotBetween(String value1, String value2) {
            addCriterion("DOC_NO not between", value1, value2, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNmeIsNull() {
            addCriterion("DOC_NME is null");
            return (Criteria) this;
        }

        public Criteria andDocNmeIsNotNull() {
            addCriterion("DOC_NME is not null");
            return (Criteria) this;
        }

        public Criteria andDocNmeEqualTo(String value) {
            addCriterion("DOC_NME =", value, "docNme");
            return (Criteria) this;
        }

        public Criteria andDocNmeNotEqualTo(String value) {
            addCriterion("DOC_NME <>", value, "docNme");
            return (Criteria) this;
        }

        public Criteria andDocNmeGreaterThan(String value) {
            addCriterion("DOC_NME >", value, "docNme");
            return (Criteria) this;
        }

        public Criteria andDocNmeGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_NME >=", value, "docNme");
            return (Criteria) this;
        }

        public Criteria andDocNmeLessThan(String value) {
            addCriterion("DOC_NME <", value, "docNme");
            return (Criteria) this;
        }

        public Criteria andDocNmeLessThanOrEqualTo(String value) {
            addCriterion("DOC_NME <=", value, "docNme");
            return (Criteria) this;
        }

        public Criteria andDocNmeLike(String value) {
            addCriterion("DOC_NME like", value, "docNme");
            return (Criteria) this;
        }

        public Criteria andDocNmeNotLike(String value) {
            addCriterion("DOC_NME not like", value, "docNme");
            return (Criteria) this;
        }

        public Criteria andDocNmeIn(List<String> values) {
            addCriterion("DOC_NME in", values, "docNme");
            return (Criteria) this;
        }

        public Criteria andDocNmeNotIn(List<String> values) {
            addCriterion("DOC_NME not in", values, "docNme");
            return (Criteria) this;
        }

        public Criteria andDocNmeBetween(String value1, String value2) {
            addCriterion("DOC_NME between", value1, value2, "docNme");
            return (Criteria) this;
        }

        public Criteria andDocNmeNotBetween(String value1, String value2) {
            addCriterion("DOC_NME not between", value1, value2, "docNme");
            return (Criteria) this;
        }

        public Criteria andNurNoIsNull() {
            addCriterion("NUR_NO is null");
            return (Criteria) this;
        }

        public Criteria andNurNoIsNotNull() {
            addCriterion("NUR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNurNoEqualTo(String value) {
            addCriterion("NUR_NO =", value, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNoNotEqualTo(String value) {
            addCriterion("NUR_NO <>", value, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNoGreaterThan(String value) {
            addCriterion("NUR_NO >", value, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNoGreaterThanOrEqualTo(String value) {
            addCriterion("NUR_NO >=", value, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNoLessThan(String value) {
            addCriterion("NUR_NO <", value, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNoLessThanOrEqualTo(String value) {
            addCriterion("NUR_NO <=", value, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNoLike(String value) {
            addCriterion("NUR_NO like", value, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNoNotLike(String value) {
            addCriterion("NUR_NO not like", value, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNoIn(List<String> values) {
            addCriterion("NUR_NO in", values, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNoNotIn(List<String> values) {
            addCriterion("NUR_NO not in", values, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNoBetween(String value1, String value2) {
            addCriterion("NUR_NO between", value1, value2, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNoNotBetween(String value1, String value2) {
            addCriterion("NUR_NO not between", value1, value2, "nurNo");
            return (Criteria) this;
        }

        public Criteria andNurNmeIsNull() {
            addCriterion("NUR_NME is null");
            return (Criteria) this;
        }

        public Criteria andNurNmeIsNotNull() {
            addCriterion("NUR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andNurNmeEqualTo(String value) {
            addCriterion("NUR_NME =", value, "nurNme");
            return (Criteria) this;
        }

        public Criteria andNurNmeNotEqualTo(String value) {
            addCriterion("NUR_NME <>", value, "nurNme");
            return (Criteria) this;
        }

        public Criteria andNurNmeGreaterThan(String value) {
            addCriterion("NUR_NME >", value, "nurNme");
            return (Criteria) this;
        }

        public Criteria andNurNmeGreaterThanOrEqualTo(String value) {
            addCriterion("NUR_NME >=", value, "nurNme");
            return (Criteria) this;
        }

        public Criteria andNurNmeLessThan(String value) {
            addCriterion("NUR_NME <", value, "nurNme");
            return (Criteria) this;
        }

        public Criteria andNurNmeLessThanOrEqualTo(String value) {
            addCriterion("NUR_NME <=", value, "nurNme");
            return (Criteria) this;
        }

        public Criteria andNurNmeLike(String value) {
            addCriterion("NUR_NME like", value, "nurNme");
            return (Criteria) this;
        }

        public Criteria andNurNmeNotLike(String value) {
            addCriterion("NUR_NME not like", value, "nurNme");
            return (Criteria) this;
        }

        public Criteria andNurNmeIn(List<String> values) {
            addCriterion("NUR_NME in", values, "nurNme");
            return (Criteria) this;
        }

        public Criteria andNurNmeNotIn(List<String> values) {
            addCriterion("NUR_NME not in", values, "nurNme");
            return (Criteria) this;
        }

        public Criteria andNurNmeBetween(String value1, String value2) {
            addCriterion("NUR_NME between", value1, value2, "nurNme");
            return (Criteria) this;
        }

        public Criteria andNurNmeNotBetween(String value1, String value2) {
            addCriterion("NUR_NME not between", value1, value2, "nurNme");
            return (Criteria) this;
        }

        public Criteria andIllTimIsNull() {
            addCriterion("ILL_TIM is null");
            return (Criteria) this;
        }

        public Criteria andIllTimIsNotNull() {
            addCriterion("ILL_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andIllTimEqualTo(Date value) {
            addCriterion("ILL_TIM =", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimNotEqualTo(Date value) {
            addCriterion("ILL_TIM <>", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimGreaterThan(Date value) {
            addCriterion("ILL_TIM >", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimGreaterThanOrEqualTo(Date value) {
            addCriterion("ILL_TIM >=", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimLessThan(Date value) {
            addCriterion("ILL_TIM <", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimLessThanOrEqualTo(Date value) {
            addCriterion("ILL_TIM <=", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimIn(List<Date> values) {
            addCriterion("ILL_TIM in", values, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimNotIn(List<Date> values) {
            addCriterion("ILL_TIM not in", values, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimBetween(Date value1, Date value2) {
            addCriterion("ILL_TIM between", value1, value2, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimNotBetween(Date value1, Date value2) {
            addCriterion("ILL_TIM not between", value1, value2, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllperdIsNull() {
            addCriterion("ILLPERD is null");
            return (Criteria) this;
        }

        public Criteria andIllperdIsNotNull() {
            addCriterion("ILLPERD is not null");
            return (Criteria) this;
        }

        public Criteria andIllperdEqualTo(String value) {
            addCriterion("ILLPERD =", value, "illperd");
            return (Criteria) this;
        }

        public Criteria andIllperdNotEqualTo(String value) {
            addCriterion("ILLPERD <>", value, "illperd");
            return (Criteria) this;
        }

        public Criteria andIllperdGreaterThan(String value) {
            addCriterion("ILLPERD >", value, "illperd");
            return (Criteria) this;
        }

        public Criteria andIllperdGreaterThanOrEqualTo(String value) {
            addCriterion("ILLPERD >=", value, "illperd");
            return (Criteria) this;
        }

        public Criteria andIllperdLessThan(String value) {
            addCriterion("ILLPERD <", value, "illperd");
            return (Criteria) this;
        }

        public Criteria andIllperdLessThanOrEqualTo(String value) {
            addCriterion("ILLPERD <=", value, "illperd");
            return (Criteria) this;
        }

        public Criteria andIllperdLike(String value) {
            addCriterion("ILLPERD like", value, "illperd");
            return (Criteria) this;
        }

        public Criteria andIllperdNotLike(String value) {
            addCriterion("ILLPERD not like", value, "illperd");
            return (Criteria) this;
        }

        public Criteria andIllperdIn(List<String> values) {
            addCriterion("ILLPERD in", values, "illperd");
            return (Criteria) this;
        }

        public Criteria andIllperdNotIn(List<String> values) {
            addCriterion("ILLPERD not in", values, "illperd");
            return (Criteria) this;
        }

        public Criteria andIllperdBetween(String value1, String value2) {
            addCriterion("ILLPERD between", value1, value2, "illperd");
            return (Criteria) this;
        }

        public Criteria andIllperdNotBetween(String value1, String value2) {
            addCriterion("ILLPERD not between", value1, value2, "illperd");
            return (Criteria) this;
        }

        public Criteria andAlmtimeIsNull() {
            addCriterion("ALMTIME is null");
            return (Criteria) this;
        }

        public Criteria andAlmtimeIsNotNull() {
            addCriterion("ALMTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAlmtimeEqualTo(Date value) {
            addCriterion("ALMTIME =", value, "almtime");
            return (Criteria) this;
        }

        public Criteria andAlmtimeNotEqualTo(Date value) {
            addCriterion("ALMTIME <>", value, "almtime");
            return (Criteria) this;
        }

        public Criteria andAlmtimeGreaterThan(Date value) {
            addCriterion("ALMTIME >", value, "almtime");
            return (Criteria) this;
        }

        public Criteria andAlmtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ALMTIME >=", value, "almtime");
            return (Criteria) this;
        }

        public Criteria andAlmtimeLessThan(Date value) {
            addCriterion("ALMTIME <", value, "almtime");
            return (Criteria) this;
        }

        public Criteria andAlmtimeLessThanOrEqualTo(Date value) {
            addCriterion("ALMTIME <=", value, "almtime");
            return (Criteria) this;
        }

        public Criteria andAlmtimeIn(List<Date> values) {
            addCriterion("ALMTIME in", values, "almtime");
            return (Criteria) this;
        }

        public Criteria andAlmtimeNotIn(List<Date> values) {
            addCriterion("ALMTIME not in", values, "almtime");
            return (Criteria) this;
        }

        public Criteria andAlmtimeBetween(Date value1, Date value2) {
            addCriterion("ALMTIME between", value1, value2, "almtime");
            return (Criteria) this;
        }

        public Criteria andAlmtimeNotBetween(Date value1, Date value2) {
            addCriterion("ALMTIME not between", value1, value2, "almtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNull() {
            addCriterion("OUTTIME is null");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNotNull() {
            addCriterion("OUTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOuttimeEqualTo(Date value) {
            addCriterion("OUTTIME =", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotEqualTo(Date value) {
            addCriterion("OUTTIME <>", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThan(Date value) {
            addCriterion("OUTTIME >", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OUTTIME >=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThan(Date value) {
            addCriterion("OUTTIME <", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThanOrEqualTo(Date value) {
            addCriterion("OUTTIME <=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIn(List<Date> values) {
            addCriterion("OUTTIME in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotIn(List<Date> values) {
            addCriterion("OUTTIME not in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeBetween(Date value1, Date value2) {
            addCriterion("OUTTIME between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotBetween(Date value1, Date value2) {
            addCriterion("OUTTIME not between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andAastimeIsNull() {
            addCriterion("AASTIME is null");
            return (Criteria) this;
        }

        public Criteria andAastimeIsNotNull() {
            addCriterion("AASTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAastimeEqualTo(Date value) {
            addCriterion("AASTIME =", value, "aastime");
            return (Criteria) this;
        }

        public Criteria andAastimeNotEqualTo(Date value) {
            addCriterion("AASTIME <>", value, "aastime");
            return (Criteria) this;
        }

        public Criteria andAastimeGreaterThan(Date value) {
            addCriterion("AASTIME >", value, "aastime");
            return (Criteria) this;
        }

        public Criteria andAastimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AASTIME >=", value, "aastime");
            return (Criteria) this;
        }

        public Criteria andAastimeLessThan(Date value) {
            addCriterion("AASTIME <", value, "aastime");
            return (Criteria) this;
        }

        public Criteria andAastimeLessThanOrEqualTo(Date value) {
            addCriterion("AASTIME <=", value, "aastime");
            return (Criteria) this;
        }

        public Criteria andAastimeIn(List<Date> values) {
            addCriterion("AASTIME in", values, "aastime");
            return (Criteria) this;
        }

        public Criteria andAastimeNotIn(List<Date> values) {
            addCriterion("AASTIME not in", values, "aastime");
            return (Criteria) this;
        }

        public Criteria andAastimeBetween(Date value1, Date value2) {
            addCriterion("AASTIME between", value1, value2, "aastime");
            return (Criteria) this;
        }

        public Criteria andAastimeNotBetween(Date value1, Date value2) {
            addCriterion("AASTIME not between", value1, value2, "aastime");
            return (Criteria) this;
        }

        public Criteria andLestimeIsNull() {
            addCriterion("LESTIME is null");
            return (Criteria) this;
        }

        public Criteria andLestimeIsNotNull() {
            addCriterion("LESTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLestimeEqualTo(Date value) {
            addCriterion("LESTIME =", value, "lestime");
            return (Criteria) this;
        }

        public Criteria andLestimeNotEqualTo(Date value) {
            addCriterion("LESTIME <>", value, "lestime");
            return (Criteria) this;
        }

        public Criteria andLestimeGreaterThan(Date value) {
            addCriterion("LESTIME >", value, "lestime");
            return (Criteria) this;
        }

        public Criteria andLestimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LESTIME >=", value, "lestime");
            return (Criteria) this;
        }

        public Criteria andLestimeLessThan(Date value) {
            addCriterion("LESTIME <", value, "lestime");
            return (Criteria) this;
        }

        public Criteria andLestimeLessThanOrEqualTo(Date value) {
            addCriterion("LESTIME <=", value, "lestime");
            return (Criteria) this;
        }

        public Criteria andLestimeIn(List<Date> values) {
            addCriterion("LESTIME in", values, "lestime");
            return (Criteria) this;
        }

        public Criteria andLestimeNotIn(List<Date> values) {
            addCriterion("LESTIME not in", values, "lestime");
            return (Criteria) this;
        }

        public Criteria andLestimeBetween(Date value1, Date value2) {
            addCriterion("LESTIME between", value1, value2, "lestime");
            return (Criteria) this;
        }

        public Criteria andLestimeNotBetween(Date value1, Date value2) {
            addCriterion("LESTIME not between", value1, value2, "lestime");
            return (Criteria) this;
        }

        public Criteria andAahtimeIsNull() {
            addCriterion("AAHTIME is null");
            return (Criteria) this;
        }

        public Criteria andAahtimeIsNotNull() {
            addCriterion("AAHTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAahtimeEqualTo(Date value) {
            addCriterion("AAHTIME =", value, "aahtime");
            return (Criteria) this;
        }

        public Criteria andAahtimeNotEqualTo(Date value) {
            addCriterion("AAHTIME <>", value, "aahtime");
            return (Criteria) this;
        }

        public Criteria andAahtimeGreaterThan(Date value) {
            addCriterion("AAHTIME >", value, "aahtime");
            return (Criteria) this;
        }

        public Criteria andAahtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AAHTIME >=", value, "aahtime");
            return (Criteria) this;
        }

        public Criteria andAahtimeLessThan(Date value) {
            addCriterion("AAHTIME <", value, "aahtime");
            return (Criteria) this;
        }

        public Criteria andAahtimeLessThanOrEqualTo(Date value) {
            addCriterion("AAHTIME <=", value, "aahtime");
            return (Criteria) this;
        }

        public Criteria andAahtimeIn(List<Date> values) {
            addCriterion("AAHTIME in", values, "aahtime");
            return (Criteria) this;
        }

        public Criteria andAahtimeNotIn(List<Date> values) {
            addCriterion("AAHTIME not in", values, "aahtime");
            return (Criteria) this;
        }

        public Criteria andAahtimeBetween(Date value1, Date value2) {
            addCriterion("AAHTIME between", value1, value2, "aahtime");
            return (Criteria) this;
        }

        public Criteria andAahtimeNotBetween(Date value1, Date value2) {
            addCriterion("AAHTIME not between", value1, value2, "aahtime");
            return (Criteria) this;
        }

        public Criteria andSceLngIsNull() {
            addCriterion("SCE_LNG is null");
            return (Criteria) this;
        }

        public Criteria andSceLngIsNotNull() {
            addCriterion("SCE_LNG is not null");
            return (Criteria) this;
        }

        public Criteria andSceLngEqualTo(BigDecimal value) {
            addCriterion("SCE_LNG =", value, "sceLng");
            return (Criteria) this;
        }

        public Criteria andSceLngNotEqualTo(BigDecimal value) {
            addCriterion("SCE_LNG <>", value, "sceLng");
            return (Criteria) this;
        }

        public Criteria andSceLngGreaterThan(BigDecimal value) {
            addCriterion("SCE_LNG >", value, "sceLng");
            return (Criteria) this;
        }

        public Criteria andSceLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCE_LNG >=", value, "sceLng");
            return (Criteria) this;
        }

        public Criteria andSceLngLessThan(BigDecimal value) {
            addCriterion("SCE_LNG <", value, "sceLng");
            return (Criteria) this;
        }

        public Criteria andSceLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCE_LNG <=", value, "sceLng");
            return (Criteria) this;
        }

        public Criteria andSceLngIn(List<BigDecimal> values) {
            addCriterion("SCE_LNG in", values, "sceLng");
            return (Criteria) this;
        }

        public Criteria andSceLngNotIn(List<BigDecimal> values) {
            addCriterion("SCE_LNG not in", values, "sceLng");
            return (Criteria) this;
        }

        public Criteria andSceLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCE_LNG between", value1, value2, "sceLng");
            return (Criteria) this;
        }

        public Criteria andSceLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCE_LNG not between", value1, value2, "sceLng");
            return (Criteria) this;
        }

        public Criteria andSceLatIsNull() {
            addCriterion("SCE_LAT is null");
            return (Criteria) this;
        }

        public Criteria andSceLatIsNotNull() {
            addCriterion("SCE_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andSceLatEqualTo(BigDecimal value) {
            addCriterion("SCE_LAT =", value, "sceLat");
            return (Criteria) this;
        }

        public Criteria andSceLatNotEqualTo(BigDecimal value) {
            addCriterion("SCE_LAT <>", value, "sceLat");
            return (Criteria) this;
        }

        public Criteria andSceLatGreaterThan(BigDecimal value) {
            addCriterion("SCE_LAT >", value, "sceLat");
            return (Criteria) this;
        }

        public Criteria andSceLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCE_LAT >=", value, "sceLat");
            return (Criteria) this;
        }

        public Criteria andSceLatLessThan(BigDecimal value) {
            addCriterion("SCE_LAT <", value, "sceLat");
            return (Criteria) this;
        }

        public Criteria andSceLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCE_LAT <=", value, "sceLat");
            return (Criteria) this;
        }

        public Criteria andSceLatIn(List<BigDecimal> values) {
            addCriterion("SCE_LAT in", values, "sceLat");
            return (Criteria) this;
        }

        public Criteria andSceLatNotIn(List<BigDecimal> values) {
            addCriterion("SCE_LAT not in", values, "sceLat");
            return (Criteria) this;
        }

        public Criteria andSceLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCE_LAT between", value1, value2, "sceLat");
            return (Criteria) this;
        }

        public Criteria andSceLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCE_LAT not between", value1, value2, "sceLat");
            return (Criteria) this;
        }

        public Criteria andSceHgtIsNull() {
            addCriterion("SCE_HGT is null");
            return (Criteria) this;
        }

        public Criteria andSceHgtIsNotNull() {
            addCriterion("SCE_HGT is not null");
            return (Criteria) this;
        }

        public Criteria andSceHgtEqualTo(BigDecimal value) {
            addCriterion("SCE_HGT =", value, "sceHgt");
            return (Criteria) this;
        }

        public Criteria andSceHgtNotEqualTo(BigDecimal value) {
            addCriterion("SCE_HGT <>", value, "sceHgt");
            return (Criteria) this;
        }

        public Criteria andSceHgtGreaterThan(BigDecimal value) {
            addCriterion("SCE_HGT >", value, "sceHgt");
            return (Criteria) this;
        }

        public Criteria andSceHgtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCE_HGT >=", value, "sceHgt");
            return (Criteria) this;
        }

        public Criteria andSceHgtLessThan(BigDecimal value) {
            addCriterion("SCE_HGT <", value, "sceHgt");
            return (Criteria) this;
        }

        public Criteria andSceHgtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCE_HGT <=", value, "sceHgt");
            return (Criteria) this;
        }

        public Criteria andSceHgtIn(List<BigDecimal> values) {
            addCriterion("SCE_HGT in", values, "sceHgt");
            return (Criteria) this;
        }

        public Criteria andSceHgtNotIn(List<BigDecimal> values) {
            addCriterion("SCE_HGT not in", values, "sceHgt");
            return (Criteria) this;
        }

        public Criteria andSceHgtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCE_HGT between", value1, value2, "sceHgt");
            return (Criteria) this;
        }

        public Criteria andSceHgtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCE_HGT not between", value1, value2, "sceHgt");
            return (Criteria) this;
        }

        public Criteria andScePrvCodIsNull() {
            addCriterion("SCE_PRV_COD is null");
            return (Criteria) this;
        }

        public Criteria andScePrvCodIsNotNull() {
            addCriterion("SCE_PRV_COD is not null");
            return (Criteria) this;
        }

        public Criteria andScePrvCodEqualTo(String value) {
            addCriterion("SCE_PRV_COD =", value, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andScePrvCodNotEqualTo(String value) {
            addCriterion("SCE_PRV_COD <>", value, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andScePrvCodGreaterThan(String value) {
            addCriterion("SCE_PRV_COD >", value, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andScePrvCodGreaterThanOrEqualTo(String value) {
            addCriterion("SCE_PRV_COD >=", value, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andScePrvCodLessThan(String value) {
            addCriterion("SCE_PRV_COD <", value, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andScePrvCodLessThanOrEqualTo(String value) {
            addCriterion("SCE_PRV_COD <=", value, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andScePrvCodLike(String value) {
            addCriterion("SCE_PRV_COD like", value, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andScePrvCodNotLike(String value) {
            addCriterion("SCE_PRV_COD not like", value, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andScePrvCodIn(List<String> values) {
            addCriterion("SCE_PRV_COD in", values, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andScePrvCodNotIn(List<String> values) {
            addCriterion("SCE_PRV_COD not in", values, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andScePrvCodBetween(String value1, String value2) {
            addCriterion("SCE_PRV_COD between", value1, value2, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andScePrvCodNotBetween(String value1, String value2) {
            addCriterion("SCE_PRV_COD not between", value1, value2, "scePrvCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodIsNull() {
            addCriterion("SCE_CTY_COD is null");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodIsNotNull() {
            addCriterion("SCE_CTY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodEqualTo(String value) {
            addCriterion("SCE_CTY_COD =", value, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodNotEqualTo(String value) {
            addCriterion("SCE_CTY_COD <>", value, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodGreaterThan(String value) {
            addCriterion("SCE_CTY_COD >", value, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodGreaterThanOrEqualTo(String value) {
            addCriterion("SCE_CTY_COD >=", value, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodLessThan(String value) {
            addCriterion("SCE_CTY_COD <", value, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodLessThanOrEqualTo(String value) {
            addCriterion("SCE_CTY_COD <=", value, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodLike(String value) {
            addCriterion("SCE_CTY_COD like", value, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodNotLike(String value) {
            addCriterion("SCE_CTY_COD not like", value, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodIn(List<String> values) {
            addCriterion("SCE_CTY_COD in", values, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodNotIn(List<String> values) {
            addCriterion("SCE_CTY_COD not in", values, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodBetween(String value1, String value2) {
            addCriterion("SCE_CTY_COD between", value1, value2, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceCtyCodNotBetween(String value1, String value2) {
            addCriterion("SCE_CTY_COD not between", value1, value2, "sceCtyCod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodIsNull() {
            addCriterion("SCE_AR0_COD is null");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodIsNotNull() {
            addCriterion("SCE_AR0_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodEqualTo(String value) {
            addCriterion("SCE_AR0_COD =", value, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodNotEqualTo(String value) {
            addCriterion("SCE_AR0_COD <>", value, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodGreaterThan(String value) {
            addCriterion("SCE_AR0_COD >", value, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodGreaterThanOrEqualTo(String value) {
            addCriterion("SCE_AR0_COD >=", value, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodLessThan(String value) {
            addCriterion("SCE_AR0_COD <", value, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodLessThanOrEqualTo(String value) {
            addCriterion("SCE_AR0_COD <=", value, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodLike(String value) {
            addCriterion("SCE_AR0_COD like", value, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodNotLike(String value) {
            addCriterion("SCE_AR0_COD not like", value, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodIn(List<String> values) {
            addCriterion("SCE_AR0_COD in", values, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodNotIn(List<String> values) {
            addCriterion("SCE_AR0_COD not in", values, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodBetween(String value1, String value2) {
            addCriterion("SCE_AR0_COD between", value1, value2, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andSceAr0CodNotBetween(String value1, String value2) {
            addCriterion("SCE_AR0_COD not between", value1, value2, "sceAr0Cod");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgIsNull() {
            addCriterion("ILL_TIM_FLG is null");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgIsNotNull() {
            addCriterion("ILL_TIM_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgEqualTo(String value) {
            addCriterion("ILL_TIM_FLG =", value, "illTimFlg");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgNotEqualTo(String value) {
            addCriterion("ILL_TIM_FLG <>", value, "illTimFlg");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgGreaterThan(String value) {
            addCriterion("ILL_TIM_FLG >", value, "illTimFlg");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgGreaterThanOrEqualTo(String value) {
            addCriterion("ILL_TIM_FLG >=", value, "illTimFlg");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgLessThan(String value) {
            addCriterion("ILL_TIM_FLG <", value, "illTimFlg");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgLessThanOrEqualTo(String value) {
            addCriterion("ILL_TIM_FLG <=", value, "illTimFlg");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgLike(String value) {
            addCriterion("ILL_TIM_FLG like", value, "illTimFlg");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgNotLike(String value) {
            addCriterion("ILL_TIM_FLG not like", value, "illTimFlg");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgIn(List<String> values) {
            addCriterion("ILL_TIM_FLG in", values, "illTimFlg");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgNotIn(List<String> values) {
            addCriterion("ILL_TIM_FLG not in", values, "illTimFlg");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgBetween(String value1, String value2) {
            addCriterion("ILL_TIM_FLG between", value1, value2, "illTimFlg");
            return (Criteria) this;
        }

        public Criteria andIllTimFlgNotBetween(String value1, String value2) {
            addCriterion("ILL_TIM_FLG not between", value1, value2, "illTimFlg");
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