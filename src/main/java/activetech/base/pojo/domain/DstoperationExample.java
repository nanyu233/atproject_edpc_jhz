package activetech.base.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class DstoperationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DstoperationExample() {
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

        public Criteria andOperateidIsNull() {
            addCriterion("OPERATEID is null");
            return (Criteria) this;
        }

        public Criteria andOperateidIsNotNull() {
            addCriterion("OPERATEID is not null");
            return (Criteria) this;
        }

        public Criteria andOperateidEqualTo(String value) {
            addCriterion("OPERATEID =", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidNotEqualTo(String value) {
            addCriterion("OPERATEID <>", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidGreaterThan(String value) {
            addCriterion("OPERATEID >", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATEID >=", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidLessThan(String value) {
            addCriterion("OPERATEID <", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidLessThanOrEqualTo(String value) {
            addCriterion("OPERATEID <=", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidLike(String value) {
            addCriterion("OPERATEID like", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidNotLike(String value) {
            addCriterion("OPERATEID not like", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidIn(List<String> values) {
            addCriterion("OPERATEID in", values, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidNotIn(List<String> values) {
            addCriterion("OPERATEID not in", values, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidBetween(String value1, String value2) {
            addCriterion("OPERATEID between", value1, value2, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidNotBetween(String value1, String value2) {
            addCriterion("OPERATEID not between", value1, value2, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperatenameIsNull() {
            addCriterion("OPERATENAME is null");
            return (Criteria) this;
        }

        public Criteria andOperatenameIsNotNull() {
            addCriterion("OPERATENAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatenameEqualTo(String value) {
            addCriterion("OPERATENAME =", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameNotEqualTo(String value) {
            addCriterion("OPERATENAME <>", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameGreaterThan(String value) {
            addCriterion("OPERATENAME >", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATENAME >=", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameLessThan(String value) {
            addCriterion("OPERATENAME <", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameLessThanOrEqualTo(String value) {
            addCriterion("OPERATENAME <=", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameLike(String value) {
            addCriterion("OPERATENAME like", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameNotLike(String value) {
            addCriterion("OPERATENAME not like", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameIn(List<String> values) {
            addCriterion("OPERATENAME in", values, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameNotIn(List<String> values) {
            addCriterion("OPERATENAME not in", values, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameBetween(String value1, String value2) {
            addCriterion("OPERATENAME between", value1, value2, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameNotBetween(String value1, String value2) {
            addCriterion("OPERATENAME not between", value1, value2, "operatename");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNull() {
            addCriterion("MODULEID is null");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNotNull() {
            addCriterion("MODULEID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleidEqualTo(String value) {
            addCriterion("MODULEID =", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotEqualTo(String value) {
            addCriterion("MODULEID <>", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThan(String value) {
            addCriterion("MODULEID >", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThanOrEqualTo(String value) {
            addCriterion("MODULEID >=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThan(String value) {
            addCriterion("MODULEID <", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThanOrEqualTo(String value) {
            addCriterion("MODULEID <=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLike(String value) {
            addCriterion("MODULEID like", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotLike(String value) {
            addCriterion("MODULEID not like", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidIn(List<String> values) {
            addCriterion("MODULEID in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotIn(List<String> values) {
            addCriterion("MODULEID not in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidBetween(String value1, String value2) {
            addCriterion("MODULEID between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotBetween(String value1, String value2) {
            addCriterion("MODULEID not between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andShoworderIsNull() {
            addCriterion("SHOWORDER is null");
            return (Criteria) this;
        }

        public Criteria andShoworderIsNotNull() {
            addCriterion("SHOWORDER is not null");
            return (Criteria) this;
        }

        public Criteria andShoworderEqualTo(Integer value) {
            addCriterion("SHOWORDER =", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotEqualTo(Integer value) {
            addCriterion("SHOWORDER <>", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThan(Integer value) {
            addCriterion("SHOWORDER >", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOWORDER >=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThan(Integer value) {
            addCriterion("SHOWORDER <", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThanOrEqualTo(Integer value) {
            addCriterion("SHOWORDER <=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderIn(List<Integer> values) {
            addCriterion("SHOWORDER in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotIn(List<Integer> values) {
            addCriterion("SHOWORDER not in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderBetween(Integer value1, Integer value2) {
            addCriterion("SHOWORDER between", value1, value2, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOWORDER not between", value1, value2, "showorder");
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

        public Criteria andOpertypeIsNull() {
            addCriterion("OPERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpertypeIsNotNull() {
            addCriterion("OPERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpertypeEqualTo(String value) {
            addCriterion("OPERTYPE =", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeNotEqualTo(String value) {
            addCriterion("OPERTYPE <>", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeGreaterThan(String value) {
            addCriterion("OPERTYPE >", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERTYPE >=", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeLessThan(String value) {
            addCriterion("OPERTYPE <", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeLessThanOrEqualTo(String value) {
            addCriterion("OPERTYPE <=", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeLike(String value) {
            addCriterion("OPERTYPE like", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeNotLike(String value) {
            addCriterion("OPERTYPE not like", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeIn(List<String> values) {
            addCriterion("OPERTYPE in", values, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeNotIn(List<String> values) {
            addCriterion("OPERTYPE not in", values, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeBetween(String value1, String value2) {
            addCriterion("OPERTYPE between", value1, value2, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeNotBetween(String value1, String value2) {
            addCriterion("OPERTYPE not between", value1, value2, "opertype");
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