package activetech.base.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DstksjhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DstksjhExample() {
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

        public Criteria andOprtTypIsNull() {
            addCriterion("OPRT_TYP is null");
            return (Criteria) this;
        }

        public Criteria andOprtTypIsNotNull() {
            addCriterion("OPRT_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andOprtTypEqualTo(String value) {
            addCriterion("OPRT_TYP =", value, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andOprtTypNotEqualTo(String value) {
            addCriterion("OPRT_TYP <>", value, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andOprtTypGreaterThan(String value) {
            addCriterion("OPRT_TYP >", value, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andOprtTypGreaterThanOrEqualTo(String value) {
            addCriterion("OPRT_TYP >=", value, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andOprtTypLessThan(String value) {
            addCriterion("OPRT_TYP <", value, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andOprtTypLessThanOrEqualTo(String value) {
            addCriterion("OPRT_TYP <=", value, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andOprtTypLike(String value) {
            addCriterion("OPRT_TYP like", value, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andOprtTypNotLike(String value) {
            addCriterion("OPRT_TYP not like", value, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andOprtTypIn(List<String> values) {
            addCriterion("OPRT_TYP in", values, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andOprtTypNotIn(List<String> values) {
            addCriterion("OPRT_TYP not in", values, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andOprtTypBetween(String value1, String value2) {
            addCriterion("OPRT_TYP between", value1, value2, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andOprtTypNotBetween(String value1, String value2) {
            addCriterion("OPRT_TYP not between", value1, value2, "oprtTyp");
            return (Criteria) this;
        }

        public Criteria andObjtIsNull() {
            addCriterion("OBJT is null");
            return (Criteria) this;
        }

        public Criteria andObjtIsNotNull() {
            addCriterion("OBJT is not null");
            return (Criteria) this;
        }

        public Criteria andObjtEqualTo(String value) {
            addCriterion("OBJT =", value, "objt");
            return (Criteria) this;
        }

        public Criteria andObjtNotEqualTo(String value) {
            addCriterion("OBJT <>", value, "objt");
            return (Criteria) this;
        }

        public Criteria andObjtGreaterThan(String value) {
            addCriterion("OBJT >", value, "objt");
            return (Criteria) this;
        }

        public Criteria andObjtGreaterThanOrEqualTo(String value) {
            addCriterion("OBJT >=", value, "objt");
            return (Criteria) this;
        }

        public Criteria andObjtLessThan(String value) {
            addCriterion("OBJT <", value, "objt");
            return (Criteria) this;
        }

        public Criteria andObjtLessThanOrEqualTo(String value) {
            addCriterion("OBJT <=", value, "objt");
            return (Criteria) this;
        }

        public Criteria andObjtLike(String value) {
            addCriterion("OBJT like", value, "objt");
            return (Criteria) this;
        }

        public Criteria andObjtNotLike(String value) {
            addCriterion("OBJT not like", value, "objt");
            return (Criteria) this;
        }

        public Criteria andObjtIn(List<String> values) {
            addCriterion("OBJT in", values, "objt");
            return (Criteria) this;
        }

        public Criteria andObjtNotIn(List<String> values) {
            addCriterion("OBJT not in", values, "objt");
            return (Criteria) this;
        }

        public Criteria andObjtBetween(String value1, String value2) {
            addCriterion("OBJT between", value1, value2, "objt");
            return (Criteria) this;
        }

        public Criteria andObjtNotBetween(String value1, String value2) {
            addCriterion("OBJT not between", value1, value2, "objt");
            return (Criteria) this;
        }

        public Criteria andLendDpmIsNull() {
            addCriterion("LEND_DPM is null");
            return (Criteria) this;
        }

        public Criteria andLendDpmIsNotNull() {
            addCriterion("LEND_DPM is not null");
            return (Criteria) this;
        }

        public Criteria andLendDpmEqualTo(String value) {
            addCriterion("LEND_DPM =", value, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDpmNotEqualTo(String value) {
            addCriterion("LEND_DPM <>", value, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDpmGreaterThan(String value) {
            addCriterion("LEND_DPM >", value, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDpmGreaterThanOrEqualTo(String value) {
            addCriterion("LEND_DPM >=", value, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDpmLessThan(String value) {
            addCriterion("LEND_DPM <", value, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDpmLessThanOrEqualTo(String value) {
            addCriterion("LEND_DPM <=", value, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDpmLike(String value) {
            addCriterion("LEND_DPM like", value, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDpmNotLike(String value) {
            addCriterion("LEND_DPM not like", value, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDpmIn(List<String> values) {
            addCriterion("LEND_DPM in", values, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDpmNotIn(List<String> values) {
            addCriterion("LEND_DPM not in", values, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDpmBetween(String value1, String value2) {
            addCriterion("LEND_DPM between", value1, value2, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDpmNotBetween(String value1, String value2) {
            addCriterion("LEND_DPM not between", value1, value2, "lendDpm");
            return (Criteria) this;
        }

        public Criteria andLendDatIsNull() {
            addCriterion("LEND_DAT is null");
            return (Criteria) this;
        }

        public Criteria andLendDatIsNotNull() {
            addCriterion("LEND_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andLendDatEqualTo(Date value) {
            addCriterion("LEND_DAT =", value, "lendDat");
            return (Criteria) this;
        }

        public Criteria andLendDatNotEqualTo(Date value) {
            addCriterion("LEND_DAT <>", value, "lendDat");
            return (Criteria) this;
        }

        public Criteria andLendDatGreaterThan(Date value) {
            addCriterion("LEND_DAT >", value, "lendDat");
            return (Criteria) this;
        }

        public Criteria andLendDatGreaterThanOrEqualTo(Date value) {
            addCriterion("LEND_DAT >=", value, "lendDat");
            return (Criteria) this;
        }

        public Criteria andLendDatLessThan(Date value) {
            addCriterion("LEND_DAT <", value, "lendDat");
            return (Criteria) this;
        }

        public Criteria andLendDatLessThanOrEqualTo(Date value) {
            addCriterion("LEND_DAT <=", value, "lendDat");
            return (Criteria) this;
        }

        public Criteria andLendDatIn(List<Date> values) {
            addCriterion("LEND_DAT in", values, "lendDat");
            return (Criteria) this;
        }

        public Criteria andLendDatNotIn(List<Date> values) {
            addCriterion("LEND_DAT not in", values, "lendDat");
            return (Criteria) this;
        }

        public Criteria andLendDatBetween(Date value1, Date value2) {
            addCriterion("LEND_DAT between", value1, value2, "lendDat");
            return (Criteria) this;
        }

        public Criteria andLendDatNotBetween(Date value1, Date value2) {
            addCriterion("LEND_DAT not between", value1, value2, "lendDat");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmIsNull() {
            addCriterion("BORROW_DPM is null");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmIsNotNull() {
            addCriterion("BORROW_DPM is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmEqualTo(String value) {
            addCriterion("BORROW_DPM =", value, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmNotEqualTo(String value) {
            addCriterion("BORROW_DPM <>", value, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmGreaterThan(String value) {
            addCriterion("BORROW_DPM >", value, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmGreaterThanOrEqualTo(String value) {
            addCriterion("BORROW_DPM >=", value, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmLessThan(String value) {
            addCriterion("BORROW_DPM <", value, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmLessThanOrEqualTo(String value) {
            addCriterion("BORROW_DPM <=", value, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmLike(String value) {
            addCriterion("BORROW_DPM like", value, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmNotLike(String value) {
            addCriterion("BORROW_DPM not like", value, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmIn(List<String> values) {
            addCriterion("BORROW_DPM in", values, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmNotIn(List<String> values) {
            addCriterion("BORROW_DPM not in", values, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmBetween(String value1, String value2) {
            addCriterion("BORROW_DPM between", value1, value2, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowDpmNotBetween(String value1, String value2) {
            addCriterion("BORROW_DPM not between", value1, value2, "borrowDpm");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrIsNull() {
            addCriterion("BORROW_USR is null");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrIsNotNull() {
            addCriterion("BORROW_USR is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrEqualTo(String value) {
            addCriterion("BORROW_USR =", value, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrNotEqualTo(String value) {
            addCriterion("BORROW_USR <>", value, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrGreaterThan(String value) {
            addCriterion("BORROW_USR >", value, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrGreaterThanOrEqualTo(String value) {
            addCriterion("BORROW_USR >=", value, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrLessThan(String value) {
            addCriterion("BORROW_USR <", value, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrLessThanOrEqualTo(String value) {
            addCriterion("BORROW_USR <=", value, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrLike(String value) {
            addCriterion("BORROW_USR like", value, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrNotLike(String value) {
            addCriterion("BORROW_USR not like", value, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrIn(List<String> values) {
            addCriterion("BORROW_USR in", values, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrNotIn(List<String> values) {
            addCriterion("BORROW_USR not in", values, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrBetween(String value1, String value2) {
            addCriterion("BORROW_USR between", value1, value2, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrNotBetween(String value1, String value2) {
            addCriterion("BORROW_USR not between", value1, value2, "borrowUsr");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelIsNull() {
            addCriterion("BORROW_USR_TEL is null");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelIsNotNull() {
            addCriterion("BORROW_USR_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelEqualTo(String value) {
            addCriterion("BORROW_USR_TEL =", value, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelNotEqualTo(String value) {
            addCriterion("BORROW_USR_TEL <>", value, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelGreaterThan(String value) {
            addCriterion("BORROW_USR_TEL >", value, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelGreaterThanOrEqualTo(String value) {
            addCriterion("BORROW_USR_TEL >=", value, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelLessThan(String value) {
            addCriterion("BORROW_USR_TEL <", value, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelLessThanOrEqualTo(String value) {
            addCriterion("BORROW_USR_TEL <=", value, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelLike(String value) {
            addCriterion("BORROW_USR_TEL like", value, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelNotLike(String value) {
            addCriterion("BORROW_USR_TEL not like", value, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelIn(List<String> values) {
            addCriterion("BORROW_USR_TEL in", values, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelNotIn(List<String> values) {
            addCriterion("BORROW_USR_TEL not in", values, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelBetween(String value1, String value2) {
            addCriterion("BORROW_USR_TEL between", value1, value2, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andBorrowUsrTelNotBetween(String value1, String value2) {
            addCriterion("BORROW_USR_TEL not between", value1, value2, "borrowUsrTel");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNull() {
            addCriterion("RETURN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNotNull() {
            addCriterion("RETURN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusEqualTo(String value) {
            addCriterion("RETURN_STATUS =", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotEqualTo(String value) {
            addCriterion("RETURN_STATUS <>", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThan(String value) {
            addCriterion("RETURN_STATUS >", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_STATUS >=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThan(String value) {
            addCriterion("RETURN_STATUS <", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThanOrEqualTo(String value) {
            addCriterion("RETURN_STATUS <=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLike(String value) {
            addCriterion("RETURN_STATUS like", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotLike(String value) {
            addCriterion("RETURN_STATUS not like", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIn(List<String> values) {
            addCriterion("RETURN_STATUS in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotIn(List<String> values) {
            addCriterion("RETURN_STATUS not in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusBetween(String value1, String value2) {
            addCriterion("RETURN_STATUS between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotBetween(String value1, String value2) {
            addCriterion("RETURN_STATUS not between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andOprtUsrIsNull() {
            addCriterion("OPRT_USR is null");
            return (Criteria) this;
        }

        public Criteria andOprtUsrIsNotNull() {
            addCriterion("OPRT_USR is not null");
            return (Criteria) this;
        }

        public Criteria andOprtUsrEqualTo(String value) {
            addCriterion("OPRT_USR =", value, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtUsrNotEqualTo(String value) {
            addCriterion("OPRT_USR <>", value, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtUsrGreaterThan(String value) {
            addCriterion("OPRT_USR >", value, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtUsrGreaterThanOrEqualTo(String value) {
            addCriterion("OPRT_USR >=", value, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtUsrLessThan(String value) {
            addCriterion("OPRT_USR <", value, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtUsrLessThanOrEqualTo(String value) {
            addCriterion("OPRT_USR <=", value, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtUsrLike(String value) {
            addCriterion("OPRT_USR like", value, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtUsrNotLike(String value) {
            addCriterion("OPRT_USR not like", value, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtUsrIn(List<String> values) {
            addCriterion("OPRT_USR in", values, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtUsrNotIn(List<String> values) {
            addCriterion("OPRT_USR not in", values, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtUsrBetween(String value1, String value2) {
            addCriterion("OPRT_USR between", value1, value2, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtUsrNotBetween(String value1, String value2) {
            addCriterion("OPRT_USR not between", value1, value2, "oprtUsr");
            return (Criteria) this;
        }

        public Criteria andOprtDatIsNull() {
            addCriterion("OPRT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andOprtDatIsNotNull() {
            addCriterion("OPRT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andOprtDatEqualTo(Date value) {
            addCriterion("OPRT_DAT =", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotEqualTo(Date value) {
            addCriterion("OPRT_DAT <>", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatGreaterThan(Date value) {
            addCriterion("OPRT_DAT >", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("OPRT_DAT >=", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatLessThan(Date value) {
            addCriterion("OPRT_DAT <", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatLessThanOrEqualTo(Date value) {
            addCriterion("OPRT_DAT <=", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatIn(List<Date> values) {
            addCriterion("OPRT_DAT in", values, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotIn(List<Date> values) {
            addCriterion("OPRT_DAT not in", values, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatBetween(Date value1, Date value2) {
            addCriterion("OPRT_DAT between", value1, value2, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotBetween(Date value1, Date value2) {
            addCriterion("OPRT_DAT not between", value1, value2, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andLnedUsrIsNull() {
            addCriterion("LNED_USR is null");
            return (Criteria) this;
        }

        public Criteria andLnedUsrIsNotNull() {
            addCriterion("LNED_USR is not null");
            return (Criteria) this;
        }

        public Criteria andLnedUsrEqualTo(String value) {
            addCriterion("LNED_USR =", value, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andLnedUsrNotEqualTo(String value) {
            addCriterion("LNED_USR <>", value, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andLnedUsrGreaterThan(String value) {
            addCriterion("LNED_USR >", value, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andLnedUsrGreaterThanOrEqualTo(String value) {
            addCriterion("LNED_USR >=", value, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andLnedUsrLessThan(String value) {
            addCriterion("LNED_USR <", value, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andLnedUsrLessThanOrEqualTo(String value) {
            addCriterion("LNED_USR <=", value, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andLnedUsrLike(String value) {
            addCriterion("LNED_USR like", value, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andLnedUsrNotLike(String value) {
            addCriterion("LNED_USR not like", value, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andLnedUsrIn(List<String> values) {
            addCriterion("LNED_USR in", values, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andLnedUsrNotIn(List<String> values) {
            addCriterion("LNED_USR not in", values, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andLnedUsrBetween(String value1, String value2) {
            addCriterion("LNED_USR between", value1, value2, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andLnedUsrNotBetween(String value1, String value2) {
            addCriterion("LNED_USR not between", value1, value2, "lnedUsr");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(BigDecimal value) {
            addCriterion("DEPOSIT >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(BigDecimal value) {
            addCriterion("DEPOSIT <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT not between", value1, value2, "deposit");
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