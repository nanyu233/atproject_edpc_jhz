package activetech.base.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class DstuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DstuserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
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

        public Criteria andUsrpassIsNull() {
            addCriterion("USRPASS is null");
            return (Criteria) this;
        }

        public Criteria andUsrpassIsNotNull() {
            addCriterion("USRPASS is not null");
            return (Criteria) this;
        }

        public Criteria andUsrpassEqualTo(String value) {
            addCriterion("USRPASS =", value, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUsrpassNotEqualTo(String value) {
            addCriterion("USRPASS <>", value, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUsrpassGreaterThan(String value) {
            addCriterion("USRPASS >", value, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUsrpassGreaterThanOrEqualTo(String value) {
            addCriterion("USRPASS >=", value, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUsrpassLessThan(String value) {
            addCriterion("USRPASS <", value, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUsrpassLessThanOrEqualTo(String value) {
            addCriterion("USRPASS <=", value, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUsrpassLike(String value) {
            addCriterion("USRPASS like", value, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUsrpassNotLike(String value) {
            addCriterion("USRPASS not like", value, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUsrpassIn(List<String> values) {
            addCriterion("USRPASS in", values, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUsrpassNotIn(List<String> values) {
            addCriterion("USRPASS not in", values, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUsrpassBetween(String value1, String value2) {
            addCriterion("USRPASS between", value1, value2, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUsrpassNotBetween(String value1, String value2) {
            addCriterion("USRPASS not between", value1, value2, "usrpass");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("USERSTATE is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("USERSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(String value) {
            addCriterion("USERSTATE =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(String value) {
            addCriterion("USERSTATE <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(String value) {
            addCriterion("USERSTATE >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(String value) {
            addCriterion("USERSTATE >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(String value) {
            addCriterion("USERSTATE <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(String value) {
            addCriterion("USERSTATE <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLike(String value) {
            addCriterion("USERSTATE like", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotLike(String value) {
            addCriterion("USERSTATE not like", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<String> values) {
            addCriterion("USERSTATE in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<String> values) {
            addCriterion("USERSTATE not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(String value1, String value2) {
            addCriterion("USERSTATE between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(String value1, String value2) {
            addCriterion("USERSTATE not between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMovephoneIsNull() {
            addCriterion("MOVEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMovephoneIsNotNull() {
            addCriterion("MOVEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMovephoneEqualTo(String value) {
            addCriterion("MOVEPHONE =", value, "movephone");
            return (Criteria) this;
        }

        public Criteria andMovephoneNotEqualTo(String value) {
            addCriterion("MOVEPHONE <>", value, "movephone");
            return (Criteria) this;
        }

        public Criteria andMovephoneGreaterThan(String value) {
            addCriterion("MOVEPHONE >", value, "movephone");
            return (Criteria) this;
        }

        public Criteria andMovephoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOVEPHONE >=", value, "movephone");
            return (Criteria) this;
        }

        public Criteria andMovephoneLessThan(String value) {
            addCriterion("MOVEPHONE <", value, "movephone");
            return (Criteria) this;
        }

        public Criteria andMovephoneLessThanOrEqualTo(String value) {
            addCriterion("MOVEPHONE <=", value, "movephone");
            return (Criteria) this;
        }

        public Criteria andMovephoneLike(String value) {
            addCriterion("MOVEPHONE like", value, "movephone");
            return (Criteria) this;
        }

        public Criteria andMovephoneNotLike(String value) {
            addCriterion("MOVEPHONE not like", value, "movephone");
            return (Criteria) this;
        }

        public Criteria andMovephoneIn(List<String> values) {
            addCriterion("MOVEPHONE in", values, "movephone");
            return (Criteria) this;
        }

        public Criteria andMovephoneNotIn(List<String> values) {
            addCriterion("MOVEPHONE not in", values, "movephone");
            return (Criteria) this;
        }

        public Criteria andMovephoneBetween(String value1, String value2) {
            addCriterion("MOVEPHONE between", value1, value2, "movephone");
            return (Criteria) this;
        }

        public Criteria andMovephoneNotBetween(String value1, String value2) {
            addCriterion("MOVEPHONE not between", value1, value2, "movephone");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("ADDR =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("ADDR <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("ADDR >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("ADDR <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("ADDR <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("ADDR like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("ADDR not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("ADDR in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("ADDR not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("ADDR between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("ADDR not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("GROUPID is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("GROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("GROUPID =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("GROUPID <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("GROUPID >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPID >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("GROUPID <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("GROUPID <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("GROUPID like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("GROUPID not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("GROUPID in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("GROUPID not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("GROUPID between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("GROUPID not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andSysidIsNull() {
            addCriterion("SYSID is null");
            return (Criteria) this;
        }

        public Criteria andSysidIsNotNull() {
            addCriterion("SYSID is not null");
            return (Criteria) this;
        }

        public Criteria andSysidEqualTo(String value) {
            addCriterion("SYSID =", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotEqualTo(String value) {
            addCriterion("SYSID <>", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThan(String value) {
            addCriterion("SYSID >", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThanOrEqualTo(String value) {
            addCriterion("SYSID >=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThan(String value) {
            addCriterion("SYSID <", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThanOrEqualTo(String value) {
            addCriterion("SYSID <=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLike(String value) {
            addCriterion("SYSID like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotLike(String value) {
            addCriterion("SYSID not like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidIn(List<String> values) {
            addCriterion("SYSID in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotIn(List<String> values) {
            addCriterion("SYSID not in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidBetween(String value1, String value2) {
            addCriterion("SYSID between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotBetween(String value1, String value2) {
            addCriterion("SYSID not between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNull() {
            addCriterion("VCHAR1 is null");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNotNull() {
            addCriterion("VCHAR1 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar1EqualTo(String value) {
            addCriterion("VCHAR1 =", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotEqualTo(String value) {
            addCriterion("VCHAR1 <>", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThan(String value) {
            addCriterion("VCHAR1 >", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR1 >=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThan(String value) {
            addCriterion("VCHAR1 <", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThanOrEqualTo(String value) {
            addCriterion("VCHAR1 <=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Like(String value) {
            addCriterion("VCHAR1 like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotLike(String value) {
            addCriterion("VCHAR1 not like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1In(List<String> values) {
            addCriterion("VCHAR1 in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotIn(List<String> values) {
            addCriterion("VCHAR1 not in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Between(String value1, String value2) {
            addCriterion("VCHAR1 between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotBetween(String value1, String value2) {
            addCriterion("VCHAR1 not between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNull() {
            addCriterion("VCHAR2 is null");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNotNull() {
            addCriterion("VCHAR2 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar2EqualTo(String value) {
            addCriterion("VCHAR2 =", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotEqualTo(String value) {
            addCriterion("VCHAR2 <>", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThan(String value) {
            addCriterion("VCHAR2 >", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR2 >=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThan(String value) {
            addCriterion("VCHAR2 <", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThanOrEqualTo(String value) {
            addCriterion("VCHAR2 <=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Like(String value) {
            addCriterion("VCHAR2 like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotLike(String value) {
            addCriterion("VCHAR2 not like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2In(List<String> values) {
            addCriterion("VCHAR2 in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotIn(List<String> values) {
            addCriterion("VCHAR2 not in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Between(String value1, String value2) {
            addCriterion("VCHAR2 between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotBetween(String value1, String value2) {
            addCriterion("VCHAR2 not between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNull() {
            addCriterion("VCHAR3 is null");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNotNull() {
            addCriterion("VCHAR3 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar3EqualTo(String value) {
            addCriterion("VCHAR3 =", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotEqualTo(String value) {
            addCriterion("VCHAR3 <>", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThan(String value) {
            addCriterion("VCHAR3 >", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR3 >=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThan(String value) {
            addCriterion("VCHAR3 <", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThanOrEqualTo(String value) {
            addCriterion("VCHAR3 <=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Like(String value) {
            addCriterion("VCHAR3 like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotLike(String value) {
            addCriterion("VCHAR3 not like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3In(List<String> values) {
            addCriterion("VCHAR3 in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotIn(List<String> values) {
            addCriterion("VCHAR3 not in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Between(String value1, String value2) {
            addCriterion("VCHAR3 between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotBetween(String value1, String value2) {
            addCriterion("VCHAR3 not between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNull() {
            addCriterion("VCHAR4 is null");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNotNull() {
            addCriterion("VCHAR4 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar4EqualTo(String value) {
            addCriterion("VCHAR4 =", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotEqualTo(String value) {
            addCriterion("VCHAR4 <>", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThan(String value) {
            addCriterion("VCHAR4 >", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR4 >=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThan(String value) {
            addCriterion("VCHAR4 <", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThanOrEqualTo(String value) {
            addCriterion("VCHAR4 <=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Like(String value) {
            addCriterion("VCHAR4 like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotLike(String value) {
            addCriterion("VCHAR4 not like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4In(List<String> values) {
            addCriterion("VCHAR4 in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotIn(List<String> values) {
            addCriterion("VCHAR4 not in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Between(String value1, String value2) {
            addCriterion("VCHAR4 between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotBetween(String value1, String value2) {
            addCriterion("VCHAR4 not between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andOutCallIsNull() {
            addCriterion("OUT_CALL is null");
            return (Criteria) this;
        }

        public Criteria andOutCallIsNotNull() {
            addCriterion("OUT_CALL is not null");
            return (Criteria) this;
        }

        public Criteria andOutCallEqualTo(String value) {
            addCriterion("OUT_CALL =", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallNotEqualTo(String value) {
            addCriterion("OUT_CALL <>", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallGreaterThan(String value) {
            addCriterion("OUT_CALL >", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_CALL >=", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallLessThan(String value) {
            addCriterion("OUT_CALL <", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallLessThanOrEqualTo(String value) {
            addCriterion("OUT_CALL <=", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallLike(String value) {
            addCriterion("OUT_CALL like", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallNotLike(String value) {
            addCriterion("OUT_CALL not like", value, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallIn(List<String> values) {
            addCriterion("OUT_CALL in", values, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallNotIn(List<String> values) {
            addCriterion("OUT_CALL not in", values, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallBetween(String value1, String value2) {
            addCriterion("OUT_CALL between", value1, value2, "outCall");
            return (Criteria) this;
        }

        public Criteria andOutCallNotBetween(String value1, String value2) {
            addCriterion("OUT_CALL not between", value1, value2, "outCall");
            return (Criteria) this;
        }

        public Criteria andEmgsysidIsNull() {
            addCriterion("EMGSYSID is null");
            return (Criteria) this;
        }

        public Criteria andEmgsysidIsNotNull() {
            addCriterion("EMGSYSID is not null");
            return (Criteria) this;
        }

        public Criteria andEmgsysidEqualTo(String value) {
            addCriterion("EMGSYSID =", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidNotEqualTo(String value) {
            addCriterion("EMGSYSID <>", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidGreaterThan(String value) {
            addCriterion("EMGSYSID >", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidGreaterThanOrEqualTo(String value) {
            addCriterion("EMGSYSID >=", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidLessThan(String value) {
            addCriterion("EMGSYSID <", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidLessThanOrEqualTo(String value) {
            addCriterion("EMGSYSID <=", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidLike(String value) {
            addCriterion("EMGSYSID like", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidNotLike(String value) {
            addCriterion("EMGSYSID not like", value, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidIn(List<String> values) {
            addCriterion("EMGSYSID in", values, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidNotIn(List<String> values) {
            addCriterion("EMGSYSID not in", values, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidBetween(String value1, String value2) {
            addCriterion("EMGSYSID between", value1, value2, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andEmgsysidNotBetween(String value1, String value2) {
            addCriterion("EMGSYSID not between", value1, value2, "emgsysid");
            return (Criteria) this;
        }

        public Criteria andYshIsNull() {
            addCriterion("YSH is null");
            return (Criteria) this;
        }

        public Criteria andYshIsNotNull() {
            addCriterion("YSH is not null");
            return (Criteria) this;
        }

        public Criteria andYshEqualTo(String value) {
            addCriterion("YSH =", value, "ysh");
            return (Criteria) this;
        }

        public Criteria andYshNotEqualTo(String value) {
            addCriterion("YSH <>", value, "ysh");
            return (Criteria) this;
        }

        public Criteria andYshGreaterThan(String value) {
            addCriterion("YSH >", value, "ysh");
            return (Criteria) this;
        }

        public Criteria andYshGreaterThanOrEqualTo(String value) {
            addCriterion("YSH >=", value, "ysh");
            return (Criteria) this;
        }

        public Criteria andYshLessThan(String value) {
            addCriterion("YSH <", value, "ysh");
            return (Criteria) this;
        }

        public Criteria andYshLessThanOrEqualTo(String value) {
            addCriterion("YSH <=", value, "ysh");
            return (Criteria) this;
        }

        public Criteria andYshLike(String value) {
            addCriterion("YSH like", value, "ysh");
            return (Criteria) this;
        }

        public Criteria andYshNotLike(String value) {
            addCriterion("YSH not like", value, "ysh");
            return (Criteria) this;
        }

        public Criteria andYshIn(List<String> values) {
            addCriterion("YSH in", values, "ysh");
            return (Criteria) this;
        }

        public Criteria andYshNotIn(List<String> values) {
            addCriterion("YSH not in", values, "ysh");
            return (Criteria) this;
        }

        public Criteria andYshBetween(String value1, String value2) {
            addCriterion("YSH between", value1, value2, "ysh");
            return (Criteria) this;
        }

        public Criteria andYshNotBetween(String value1, String value2) {
            addCriterion("YSH not between", value1, value2, "ysh");
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