package activetech.base.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DstusrtrainfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DstusrtrainfExample() {
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

        public Criteria andUsrnoIsNull() {
            addCriterion("USRNO is null");
            return (Criteria) this;
        }

        public Criteria andUsrnoIsNotNull() {
            addCriterion("USRNO is not null");
            return (Criteria) this;
        }

        public Criteria andUsrnoEqualTo(String value) {
            addCriterion("USRNO =", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoNotEqualTo(String value) {
            addCriterion("USRNO <>", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoGreaterThan(String value) {
            addCriterion("USRNO >", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoGreaterThanOrEqualTo(String value) {
            addCriterion("USRNO >=", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoLessThan(String value) {
            addCriterion("USRNO <", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoLessThanOrEqualTo(String value) {
            addCriterion("USRNO <=", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoLike(String value) {
            addCriterion("USRNO like", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoNotLike(String value) {
            addCriterion("USRNO not like", value, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoIn(List<String> values) {
            addCriterion("USRNO in", values, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoNotIn(List<String> values) {
            addCriterion("USRNO not in", values, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoBetween(String value1, String value2) {
            addCriterion("USRNO between", value1, value2, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnoNotBetween(String value1, String value2) {
            addCriterion("USRNO not between", value1, value2, "usrno");
            return (Criteria) this;
        }

        public Criteria andUsrnameIsNull() {
            addCriterion("USRNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsrnameIsNotNull() {
            addCriterion("USRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrnameEqualTo(String value) {
            addCriterion("USRNAME =", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotEqualTo(String value) {
            addCriterion("USRNAME <>", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameGreaterThan(String value) {
            addCriterion("USRNAME >", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameGreaterThanOrEqualTo(String value) {
            addCriterion("USRNAME >=", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameLessThan(String value) {
            addCriterion("USRNAME <", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameLessThanOrEqualTo(String value) {
            addCriterion("USRNAME <=", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameLike(String value) {
            addCriterion("USRNAME like", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotLike(String value) {
            addCriterion("USRNAME not like", value, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameIn(List<String> values) {
            addCriterion("USRNAME in", values, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotIn(List<String> values) {
            addCriterion("USRNAME not in", values, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameBetween(String value1, String value2) {
            addCriterion("USRNAME between", value1, value2, "usrname");
            return (Criteria) this;
        }

        public Criteria andUsrnameNotBetween(String value1, String value2) {
            addCriterion("USRNAME not between", value1, value2, "usrname");
            return (Criteria) this;
        }

        public Criteria andComnoAIsNull() {
            addCriterion("COMNO_A is null");
            return (Criteria) this;
        }

        public Criteria andComnoAIsNotNull() {
            addCriterion("COMNO_A is not null");
            return (Criteria) this;
        }

        public Criteria andComnoAEqualTo(String value) {
            addCriterion("COMNO_A =", value, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComnoANotEqualTo(String value) {
            addCriterion("COMNO_A <>", value, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComnoAGreaterThan(String value) {
            addCriterion("COMNO_A >", value, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComnoAGreaterThanOrEqualTo(String value) {
            addCriterion("COMNO_A >=", value, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComnoALessThan(String value) {
            addCriterion("COMNO_A <", value, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComnoALessThanOrEqualTo(String value) {
            addCriterion("COMNO_A <=", value, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComnoALike(String value) {
            addCriterion("COMNO_A like", value, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComnoANotLike(String value) {
            addCriterion("COMNO_A not like", value, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComnoAIn(List<String> values) {
            addCriterion("COMNO_A in", values, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComnoANotIn(List<String> values) {
            addCriterion("COMNO_A not in", values, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComnoABetween(String value1, String value2) {
            addCriterion("COMNO_A between", value1, value2, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComnoANotBetween(String value1, String value2) {
            addCriterion("COMNO_A not between", value1, value2, "comnoA");
            return (Criteria) this;
        }

        public Criteria andComcnameAIsNull() {
            addCriterion("COMCNAME_A is null");
            return (Criteria) this;
        }

        public Criteria andComcnameAIsNotNull() {
            addCriterion("COMCNAME_A is not null");
            return (Criteria) this;
        }

        public Criteria andComcnameAEqualTo(String value) {
            addCriterion("COMCNAME_A =", value, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComcnameANotEqualTo(String value) {
            addCriterion("COMCNAME_A <>", value, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComcnameAGreaterThan(String value) {
            addCriterion("COMCNAME_A >", value, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComcnameAGreaterThanOrEqualTo(String value) {
            addCriterion("COMCNAME_A >=", value, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComcnameALessThan(String value) {
            addCriterion("COMCNAME_A <", value, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComcnameALessThanOrEqualTo(String value) {
            addCriterion("COMCNAME_A <=", value, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComcnameALike(String value) {
            addCriterion("COMCNAME_A like", value, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComcnameANotLike(String value) {
            addCriterion("COMCNAME_A not like", value, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComcnameAIn(List<String> values) {
            addCriterion("COMCNAME_A in", values, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComcnameANotIn(List<String> values) {
            addCriterion("COMCNAME_A not in", values, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComcnameABetween(String value1, String value2) {
            addCriterion("COMCNAME_A between", value1, value2, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComcnameANotBetween(String value1, String value2) {
            addCriterion("COMCNAME_A not between", value1, value2, "comcnameA");
            return (Criteria) this;
        }

        public Criteria andComnoBIsNull() {
            addCriterion("COMNO_B is null");
            return (Criteria) this;
        }

        public Criteria andComnoBIsNotNull() {
            addCriterion("COMNO_B is not null");
            return (Criteria) this;
        }

        public Criteria andComnoBEqualTo(String value) {
            addCriterion("COMNO_B =", value, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComnoBNotEqualTo(String value) {
            addCriterion("COMNO_B <>", value, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComnoBGreaterThan(String value) {
            addCriterion("COMNO_B >", value, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComnoBGreaterThanOrEqualTo(String value) {
            addCriterion("COMNO_B >=", value, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComnoBLessThan(String value) {
            addCriterion("COMNO_B <", value, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComnoBLessThanOrEqualTo(String value) {
            addCriterion("COMNO_B <=", value, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComnoBLike(String value) {
            addCriterion("COMNO_B like", value, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComnoBNotLike(String value) {
            addCriterion("COMNO_B not like", value, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComnoBIn(List<String> values) {
            addCriterion("COMNO_B in", values, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComnoBNotIn(List<String> values) {
            addCriterion("COMNO_B not in", values, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComnoBBetween(String value1, String value2) {
            addCriterion("COMNO_B between", value1, value2, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComnoBNotBetween(String value1, String value2) {
            addCriterion("COMNO_B not between", value1, value2, "comnoB");
            return (Criteria) this;
        }

        public Criteria andComcnameBIsNull() {
            addCriterion("COMCNAME_B is null");
            return (Criteria) this;
        }

        public Criteria andComcnameBIsNotNull() {
            addCriterion("COMCNAME_B is not null");
            return (Criteria) this;
        }

        public Criteria andComcnameBEqualTo(String value) {
            addCriterion("COMCNAME_B =", value, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andComcnameBNotEqualTo(String value) {
            addCriterion("COMCNAME_B <>", value, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andComcnameBGreaterThan(String value) {
            addCriterion("COMCNAME_B >", value, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andComcnameBGreaterThanOrEqualTo(String value) {
            addCriterion("COMCNAME_B >=", value, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andComcnameBLessThan(String value) {
            addCriterion("COMCNAME_B <", value, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andComcnameBLessThanOrEqualTo(String value) {
            addCriterion("COMCNAME_B <=", value, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andComcnameBLike(String value) {
            addCriterion("COMCNAME_B like", value, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andComcnameBNotLike(String value) {
            addCriterion("COMCNAME_B not like", value, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andComcnameBIn(List<String> values) {
            addCriterion("COMCNAME_B in", values, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andComcnameBNotIn(List<String> values) {
            addCriterion("COMCNAME_B not in", values, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andComcnameBBetween(String value1, String value2) {
            addCriterion("COMCNAME_B between", value1, value2, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andComcnameBNotBetween(String value1, String value2) {
            addCriterion("COMCNAME_B not between", value1, value2, "comcnameB");
            return (Criteria) this;
        }

        public Criteria andDusrnoIsNull() {
            addCriterion("DUSRNO is null");
            return (Criteria) this;
        }

        public Criteria andDusrnoIsNotNull() {
            addCriterion("DUSRNO is not null");
            return (Criteria) this;
        }

        public Criteria andDusrnoEqualTo(String value) {
            addCriterion("DUSRNO =", value, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnoNotEqualTo(String value) {
            addCriterion("DUSRNO <>", value, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnoGreaterThan(String value) {
            addCriterion("DUSRNO >", value, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnoGreaterThanOrEqualTo(String value) {
            addCriterion("DUSRNO >=", value, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnoLessThan(String value) {
            addCriterion("DUSRNO <", value, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnoLessThanOrEqualTo(String value) {
            addCriterion("DUSRNO <=", value, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnoLike(String value) {
            addCriterion("DUSRNO like", value, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnoNotLike(String value) {
            addCriterion("DUSRNO not like", value, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnoIn(List<String> values) {
            addCriterion("DUSRNO in", values, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnoNotIn(List<String> values) {
            addCriterion("DUSRNO not in", values, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnoBetween(String value1, String value2) {
            addCriterion("DUSRNO between", value1, value2, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnoNotBetween(String value1, String value2) {
            addCriterion("DUSRNO not between", value1, value2, "dusrno");
            return (Criteria) this;
        }

        public Criteria andDusrnameIsNull() {
            addCriterion("DUSRNAME is null");
            return (Criteria) this;
        }

        public Criteria andDusrnameIsNotNull() {
            addCriterion("DUSRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDusrnameEqualTo(String value) {
            addCriterion("DUSRNAME =", value, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDusrnameNotEqualTo(String value) {
            addCriterion("DUSRNAME <>", value, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDusrnameGreaterThan(String value) {
            addCriterion("DUSRNAME >", value, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDusrnameGreaterThanOrEqualTo(String value) {
            addCriterion("DUSRNAME >=", value, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDusrnameLessThan(String value) {
            addCriterion("DUSRNAME <", value, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDusrnameLessThanOrEqualTo(String value) {
            addCriterion("DUSRNAME <=", value, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDusrnameLike(String value) {
            addCriterion("DUSRNAME like", value, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDusrnameNotLike(String value) {
            addCriterion("DUSRNAME not like", value, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDusrnameIn(List<String> values) {
            addCriterion("DUSRNAME in", values, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDusrnameNotIn(List<String> values) {
            addCriterion("DUSRNAME not in", values, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDusrnameBetween(String value1, String value2) {
            addCriterion("DUSRNAME between", value1, value2, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDusrnameNotBetween(String value1, String value2) {
            addCriterion("DUSRNAME not between", value1, value2, "dusrname");
            return (Criteria) this;
        }

        public Criteria andDcomnoIsNull() {
            addCriterion("DCOMNO is null");
            return (Criteria) this;
        }

        public Criteria andDcomnoIsNotNull() {
            addCriterion("DCOMNO is not null");
            return (Criteria) this;
        }

        public Criteria andDcomnoEqualTo(String value) {
            addCriterion("DCOMNO =", value, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomnoNotEqualTo(String value) {
            addCriterion("DCOMNO <>", value, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomnoGreaterThan(String value) {
            addCriterion("DCOMNO >", value, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomnoGreaterThanOrEqualTo(String value) {
            addCriterion("DCOMNO >=", value, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomnoLessThan(String value) {
            addCriterion("DCOMNO <", value, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomnoLessThanOrEqualTo(String value) {
            addCriterion("DCOMNO <=", value, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomnoLike(String value) {
            addCriterion("DCOMNO like", value, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomnoNotLike(String value) {
            addCriterion("DCOMNO not like", value, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomnoIn(List<String> values) {
            addCriterion("DCOMNO in", values, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomnoNotIn(List<String> values) {
            addCriterion("DCOMNO not in", values, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomnoBetween(String value1, String value2) {
            addCriterion("DCOMNO between", value1, value2, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomnoNotBetween(String value1, String value2) {
            addCriterion("DCOMNO not between", value1, value2, "dcomno");
            return (Criteria) this;
        }

        public Criteria andDcomcnameIsNull() {
            addCriterion("DCOMCNAME is null");
            return (Criteria) this;
        }

        public Criteria andDcomcnameIsNotNull() {
            addCriterion("DCOMCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDcomcnameEqualTo(String value) {
            addCriterion("DCOMCNAME =", value, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andDcomcnameNotEqualTo(String value) {
            addCriterion("DCOMCNAME <>", value, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andDcomcnameGreaterThan(String value) {
            addCriterion("DCOMCNAME >", value, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andDcomcnameGreaterThanOrEqualTo(String value) {
            addCriterion("DCOMCNAME >=", value, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andDcomcnameLessThan(String value) {
            addCriterion("DCOMCNAME <", value, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andDcomcnameLessThanOrEqualTo(String value) {
            addCriterion("DCOMCNAME <=", value, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andDcomcnameLike(String value) {
            addCriterion("DCOMCNAME like", value, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andDcomcnameNotLike(String value) {
            addCriterion("DCOMCNAME not like", value, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andDcomcnameIn(List<String> values) {
            addCriterion("DCOMCNAME in", values, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andDcomcnameNotIn(List<String> values) {
            addCriterion("DCOMCNAME not in", values, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andDcomcnameBetween(String value1, String value2) {
            addCriterion("DCOMCNAME between", value1, value2, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andDcomcnameNotBetween(String value1, String value2) {
            addCriterion("DCOMCNAME not between", value1, value2, "dcomcname");
            return (Criteria) this;
        }

        public Criteria andOptdateIsNull() {
            addCriterion("OPTDATE is null");
            return (Criteria) this;
        }

        public Criteria andOptdateIsNotNull() {
            addCriterion("OPTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOptdateEqualTo(Date value) {
            addCriterion("OPTDATE =", value, "optdate");
            return (Criteria) this;
        }

        public Criteria andOptdateNotEqualTo(Date value) {
            addCriterion("OPTDATE <>", value, "optdate");
            return (Criteria) this;
        }

        public Criteria andOptdateGreaterThan(Date value) {
            addCriterion("OPTDATE >", value, "optdate");
            return (Criteria) this;
        }

        public Criteria andOptdateGreaterThanOrEqualTo(Date value) {
            addCriterion("OPTDATE >=", value, "optdate");
            return (Criteria) this;
        }

        public Criteria andOptdateLessThan(Date value) {
            addCriterion("OPTDATE <", value, "optdate");
            return (Criteria) this;
        }

        public Criteria andOptdateLessThanOrEqualTo(Date value) {
            addCriterion("OPTDATE <=", value, "optdate");
            return (Criteria) this;
        }

        public Criteria andOptdateIn(List<Date> values) {
            addCriterion("OPTDATE in", values, "optdate");
            return (Criteria) this;
        }

        public Criteria andOptdateNotIn(List<Date> values) {
            addCriterion("OPTDATE not in", values, "optdate");
            return (Criteria) this;
        }

        public Criteria andOptdateBetween(Date value1, Date value2) {
            addCriterion("OPTDATE between", value1, value2, "optdate");
            return (Criteria) this;
        }

        public Criteria andOptdateNotBetween(Date value1, Date value2) {
            addCriterion("OPTDATE not between", value1, value2, "optdate");
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