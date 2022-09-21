package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspConsentInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspConsentInfExample() {
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

        public Criteria andSeqnoIsNull() {
            addCriterion("SEQNO is null");
            return (Criteria) this;
        }

        public Criteria andSeqnoIsNotNull() {
            addCriterion("SEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqnoEqualTo(String value) {
            addCriterion("SEQNO =", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotEqualTo(String value) {
            addCriterion("SEQNO <>", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThan(String value) {
            addCriterion("SEQNO >", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThanOrEqualTo(String value) {
            addCriterion("SEQNO >=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThan(String value) {
            addCriterion("SEQNO <", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThanOrEqualTo(String value) {
            addCriterion("SEQNO <=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLike(String value) {
            addCriterion("SEQNO like", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotLike(String value) {
            addCriterion("SEQNO not like", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoIn(List<String> values) {
            addCriterion("SEQNO in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotIn(List<String> values) {
            addCriterion("SEQNO not in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoBetween(String value1, String value2) {
            addCriterion("SEQNO between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotBetween(String value1, String value2) {
            addCriterion("SEQNO not between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoIsNull() {
            addCriterion("REFSEQNO is null");
            return (Criteria) this;
        }

        public Criteria andRefseqnoIsNotNull() {
            addCriterion("REFSEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andRefseqnoEqualTo(String value) {
            addCriterion("REFSEQNO =", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoNotEqualTo(String value) {
            addCriterion("REFSEQNO <>", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoGreaterThan(String value) {
            addCriterion("REFSEQNO >", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoGreaterThanOrEqualTo(String value) {
            addCriterion("REFSEQNO >=", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoLessThan(String value) {
            addCriterion("REFSEQNO <", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoLessThanOrEqualTo(String value) {
            addCriterion("REFSEQNO <=", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoLike(String value) {
            addCriterion("REFSEQNO like", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoNotLike(String value) {
            addCriterion("REFSEQNO not like", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoIn(List<String> values) {
            addCriterion("REFSEQNO in", values, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoNotIn(List<String> values) {
            addCriterion("REFSEQNO not in", values, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoBetween(String value1, String value2) {
            addCriterion("REFSEQNO between", value1, value2, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoNotBetween(String value1, String value2) {
            addCriterion("REFSEQNO not between", value1, value2, "refseqno");
            return (Criteria) this;
        }

        public Criteria andTempnoIsNull() {
            addCriterion("TEMPNO is null");
            return (Criteria) this;
        }

        public Criteria andTempnoIsNotNull() {
            addCriterion("TEMPNO is not null");
            return (Criteria) this;
        }

        public Criteria andTempnoEqualTo(String value) {
            addCriterion("TEMPNO =", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoNotEqualTo(String value) {
            addCriterion("TEMPNO <>", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoGreaterThan(String value) {
            addCriterion("TEMPNO >", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPNO >=", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoLessThan(String value) {
            addCriterion("TEMPNO <", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoLessThanOrEqualTo(String value) {
            addCriterion("TEMPNO <=", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoLike(String value) {
            addCriterion("TEMPNO like", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoNotLike(String value) {
            addCriterion("TEMPNO not like", value, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoIn(List<String> values) {
            addCriterion("TEMPNO in", values, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoNotIn(List<String> values) {
            addCriterion("TEMPNO not in", values, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoBetween(String value1, String value2) {
            addCriterion("TEMPNO between", value1, value2, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnoNotBetween(String value1, String value2) {
            addCriterion("TEMPNO not between", value1, value2, "tempno");
            return (Criteria) this;
        }

        public Criteria andTempnameIsNull() {
            addCriterion("TEMPNAME is null");
            return (Criteria) this;
        }

        public Criteria andTempnameIsNotNull() {
            addCriterion("TEMPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTempnameEqualTo(String value) {
            addCriterion("TEMPNAME =", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameNotEqualTo(String value) {
            addCriterion("TEMPNAME <>", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameGreaterThan(String value) {
            addCriterion("TEMPNAME >", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPNAME >=", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameLessThan(String value) {
            addCriterion("TEMPNAME <", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameLessThanOrEqualTo(String value) {
            addCriterion("TEMPNAME <=", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameLike(String value) {
            addCriterion("TEMPNAME like", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameNotLike(String value) {
            addCriterion("TEMPNAME not like", value, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameIn(List<String> values) {
            addCriterion("TEMPNAME in", values, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameNotIn(List<String> values) {
            addCriterion("TEMPNAME not in", values, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameBetween(String value1, String value2) {
            addCriterion("TEMPNAME between", value1, value2, "tempname");
            return (Criteria) this;
        }

        public Criteria andTempnameNotBetween(String value1, String value2) {
            addCriterion("TEMPNAME not between", value1, value2, "tempname");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoIsNull() {
            addCriterion("CRTUSRNO is null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoIsNotNull() {
            addCriterion("CRTUSRNO is not null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoEqualTo(String value) {
            addCriterion("CRTUSRNO =", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotEqualTo(String value) {
            addCriterion("CRTUSRNO <>", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoGreaterThan(String value) {
            addCriterion("CRTUSRNO >", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoGreaterThanOrEqualTo(String value) {
            addCriterion("CRTUSRNO >=", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoLessThan(String value) {
            addCriterion("CRTUSRNO <", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoLessThanOrEqualTo(String value) {
            addCriterion("CRTUSRNO <=", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoLike(String value) {
            addCriterion("CRTUSRNO like", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotLike(String value) {
            addCriterion("CRTUSRNO not like", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoIn(List<String> values) {
            addCriterion("CRTUSRNO in", values, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotIn(List<String> values) {
            addCriterion("CRTUSRNO not in", values, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoBetween(String value1, String value2) {
            addCriterion("CRTUSRNO between", value1, value2, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotBetween(String value1, String value2) {
            addCriterion("CRTUSRNO not between", value1, value2, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameIsNull() {
            addCriterion("CRTUSRNAME is null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameIsNotNull() {
            addCriterion("CRTUSRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameEqualTo(String value) {
            addCriterion("CRTUSRNAME =", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameNotEqualTo(String value) {
            addCriterion("CRTUSRNAME <>", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameGreaterThan(String value) {
            addCriterion("CRTUSRNAME >", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameGreaterThanOrEqualTo(String value) {
            addCriterion("CRTUSRNAME >=", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameLessThan(String value) {
            addCriterion("CRTUSRNAME <", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameLessThanOrEqualTo(String value) {
            addCriterion("CRTUSRNAME <=", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameLike(String value) {
            addCriterion("CRTUSRNAME like", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameNotLike(String value) {
            addCriterion("CRTUSRNAME not like", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameIn(List<String> values) {
            addCriterion("CRTUSRNAME in", values, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameNotIn(List<String> values) {
            addCriterion("CRTUSRNAME not in", values, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameBetween(String value1, String value2) {
            addCriterion("CRTUSRNAME between", value1, value2, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameNotBetween(String value1, String value2) {
            addCriterion("CRTUSRNAME not between", value1, value2, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtdateIsNull() {
            addCriterion("CRTDATE is null");
            return (Criteria) this;
        }

        public Criteria andCrtdateIsNotNull() {
            addCriterion("CRTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCrtdateEqualTo(Date value) {
            addCriterion("CRTDATE =", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateNotEqualTo(Date value) {
            addCriterion("CRTDATE <>", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateGreaterThan(Date value) {
            addCriterion("CRTDATE >", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CRTDATE >=", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateLessThan(Date value) {
            addCriterion("CRTDATE <", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateLessThanOrEqualTo(Date value) {
            addCriterion("CRTDATE <=", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateIn(List<Date> values) {
            addCriterion("CRTDATE in", values, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateNotIn(List<Date> values) {
            addCriterion("CRTDATE not in", values, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateBetween(Date value1, Date value2) {
            addCriterion("CRTDATE between", value1, value2, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateNotBetween(Date value1, Date value2) {
            addCriterion("CRTDATE not between", value1, value2, "crtdate");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoIsNull() {
            addCriterion("UPDUSRNO is null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoIsNotNull() {
            addCriterion("UPDUSRNO is not null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoEqualTo(String value) {
            addCriterion("UPDUSRNO =", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotEqualTo(String value) {
            addCriterion("UPDUSRNO <>", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoGreaterThan(String value) {
            addCriterion("UPDUSRNO >", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoGreaterThanOrEqualTo(String value) {
            addCriterion("UPDUSRNO >=", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoLessThan(String value) {
            addCriterion("UPDUSRNO <", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoLessThanOrEqualTo(String value) {
            addCriterion("UPDUSRNO <=", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoLike(String value) {
            addCriterion("UPDUSRNO like", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotLike(String value) {
            addCriterion("UPDUSRNO not like", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoIn(List<String> values) {
            addCriterion("UPDUSRNO in", values, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotIn(List<String> values) {
            addCriterion("UPDUSRNO not in", values, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoBetween(String value1, String value2) {
            addCriterion("UPDUSRNO between", value1, value2, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotBetween(String value1, String value2) {
            addCriterion("UPDUSRNO not between", value1, value2, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameIsNull() {
            addCriterion("UPDUSRNAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameIsNotNull() {
            addCriterion("UPDUSRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameEqualTo(String value) {
            addCriterion("UPDUSRNAME =", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameNotEqualTo(String value) {
            addCriterion("UPDUSRNAME <>", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameGreaterThan(String value) {
            addCriterion("UPDUSRNAME >", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDUSRNAME >=", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameLessThan(String value) {
            addCriterion("UPDUSRNAME <", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameLessThanOrEqualTo(String value) {
            addCriterion("UPDUSRNAME <=", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameLike(String value) {
            addCriterion("UPDUSRNAME like", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameNotLike(String value) {
            addCriterion("UPDUSRNAME not like", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameIn(List<String> values) {
            addCriterion("UPDUSRNAME in", values, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameNotIn(List<String> values) {
            addCriterion("UPDUSRNAME not in", values, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameBetween(String value1, String value2) {
            addCriterion("UPDUSRNAME between", value1, value2, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameNotBetween(String value1, String value2) {
            addCriterion("UPDUSRNAME not between", value1, value2, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpddateIsNull() {
            addCriterion("UPDDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpddateIsNotNull() {
            addCriterion("UPDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpddateEqualTo(Date value) {
            addCriterion("UPDDATE =", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateNotEqualTo(Date value) {
            addCriterion("UPDDATE <>", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateGreaterThan(Date value) {
            addCriterion("UPDDATE >", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDDATE >=", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateLessThan(Date value) {
            addCriterion("UPDDATE <", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateLessThanOrEqualTo(Date value) {
            addCriterion("UPDDATE <=", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateIn(List<Date> values) {
            addCriterion("UPDDATE in", values, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateNotIn(List<Date> values) {
            addCriterion("UPDDATE not in", values, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateBetween(Date value1, Date value2) {
            addCriterion("UPDDATE between", value1, value2, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateNotBetween(Date value1, Date value2) {
            addCriterion("UPDDATE not between", value1, value2, "upddate");
            return (Criteria) this;
        }

        public Criteria andTextparamIsNull() {
            addCriterion("TEXTPARAM is null");
            return (Criteria) this;
        }

        public Criteria andTextparamIsNotNull() {
            addCriterion("TEXTPARAM is not null");
            return (Criteria) this;
        }

        public Criteria andTextparamEqualTo(String value) {
            addCriterion("TEXTPARAM =", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamNotEqualTo(String value) {
            addCriterion("TEXTPARAM <>", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamGreaterThan(String value) {
            addCriterion("TEXTPARAM >", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamGreaterThanOrEqualTo(String value) {
            addCriterion("TEXTPARAM >=", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamLessThan(String value) {
            addCriterion("TEXTPARAM <", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamLessThanOrEqualTo(String value) {
            addCriterion("TEXTPARAM <=", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamLike(String value) {
            addCriterion("TEXTPARAM like", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamNotLike(String value) {
            addCriterion("TEXTPARAM not like", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamIn(List<String> values) {
            addCriterion("TEXTPARAM in", values, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamNotIn(List<String> values) {
            addCriterion("TEXTPARAM not in", values, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamBetween(String value1, String value2) {
            addCriterion("TEXTPARAM between", value1, value2, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamNotBetween(String value1, String value2) {
            addCriterion("TEXTPARAM not between", value1, value2, "textparam");
            return (Criteria) this;
        }

        public Criteria andQmHashIsNull() {
            addCriterion("QM_HASH is null");
            return (Criteria) this;
        }

        public Criteria andQmHashIsNotNull() {
            addCriterion("QM_HASH is not null");
            return (Criteria) this;
        }

        public Criteria andQmHashEqualTo(String value) {
            addCriterion("QM_HASH =", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashNotEqualTo(String value) {
            addCriterion("QM_HASH <>", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashGreaterThan(String value) {
            addCriterion("QM_HASH >", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashGreaterThanOrEqualTo(String value) {
            addCriterion("QM_HASH >=", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashLessThan(String value) {
            addCriterion("QM_HASH <", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashLessThanOrEqualTo(String value) {
            addCriterion("QM_HASH <=", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashLike(String value) {
            addCriterion("QM_HASH like", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashNotLike(String value) {
            addCriterion("QM_HASH not like", value, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashIn(List<String> values) {
            addCriterion("QM_HASH in", values, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashNotIn(List<String> values) {
            addCriterion("QM_HASH not in", values, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashBetween(String value1, String value2) {
            addCriterion("QM_HASH between", value1, value2, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmHashNotBetween(String value1, String value2) {
            addCriterion("QM_HASH not between", value1, value2, "qmHash");
            return (Criteria) this;
        }

        public Criteria andQmTagIsNull() {
            addCriterion("QM_TAG is null");
            return (Criteria) this;
        }

        public Criteria andQmTagIsNotNull() {
            addCriterion("QM_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andQmTagEqualTo(String value) {
            addCriterion("QM_TAG =", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagNotEqualTo(String value) {
            addCriterion("QM_TAG <>", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagGreaterThan(String value) {
            addCriterion("QM_TAG >", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagGreaterThanOrEqualTo(String value) {
            addCriterion("QM_TAG >=", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagLessThan(String value) {
            addCriterion("QM_TAG <", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagLessThanOrEqualTo(String value) {
            addCriterion("QM_TAG <=", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagLike(String value) {
            addCriterion("QM_TAG like", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagNotLike(String value) {
            addCriterion("QM_TAG not like", value, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagIn(List<String> values) {
            addCriterion("QM_TAG in", values, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagNotIn(List<String> values) {
            addCriterion("QM_TAG not in", values, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagBetween(String value1, String value2) {
            addCriterion("QM_TAG between", value1, value2, "qmTag");
            return (Criteria) this;
        }

        public Criteria andQmTagNotBetween(String value1, String value2) {
            addCriterion("QM_TAG not between", value1, value2, "qmTag");
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