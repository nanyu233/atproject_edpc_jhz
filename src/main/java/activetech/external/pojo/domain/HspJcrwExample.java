package activetech.external.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspJcrwExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJcrwExample() {
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

        public Criteria andLshIsNull() {
            addCriterion("LSH is null");
            return (Criteria) this;
        }

        public Criteria andLshIsNotNull() {
            addCriterion("LSH is not null");
            return (Criteria) this;
        }

        public Criteria andLshEqualTo(String value) {
            addCriterion("LSH =", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotEqualTo(String value) {
            addCriterion("LSH <>", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshGreaterThan(String value) {
            addCriterion("LSH >", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshGreaterThanOrEqualTo(String value) {
            addCriterion("LSH >=", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLessThan(String value) {
            addCriterion("LSH <", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLessThanOrEqualTo(String value) {
            addCriterion("LSH <=", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLike(String value) {
            addCriterion("LSH like", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotLike(String value) {
            addCriterion("LSH not like", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshIn(List<String> values) {
            addCriterion("LSH in", values, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotIn(List<String> values) {
            addCriterion("LSH not in", values, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshBetween(String value1, String value2) {
            addCriterion("LSH between", value1, value2, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotBetween(String value1, String value2) {
            addCriterion("LSH not between", value1, value2, "lsh");
            return (Criteria) this;
        }

        public Criteria andJzkhIsNull() {
            addCriterion("JZKH is null");
            return (Criteria) this;
        }

        public Criteria andJzkhIsNotNull() {
            addCriterion("JZKH is not null");
            return (Criteria) this;
        }

        public Criteria andJzkhEqualTo(String value) {
            addCriterion("JZKH =", value, "jzkh");
            return (Criteria) this;
        }

        public Criteria andJzkhNotEqualTo(String value) {
            addCriterion("JZKH <>", value, "jzkh");
            return (Criteria) this;
        }

        public Criteria andJzkhGreaterThan(String value) {
            addCriterion("JZKH >", value, "jzkh");
            return (Criteria) this;
        }

        public Criteria andJzkhGreaterThanOrEqualTo(String value) {
            addCriterion("JZKH >=", value, "jzkh");
            return (Criteria) this;
        }

        public Criteria andJzkhLessThan(String value) {
            addCriterion("JZKH <", value, "jzkh");
            return (Criteria) this;
        }

        public Criteria andJzkhLessThanOrEqualTo(String value) {
            addCriterion("JZKH <=", value, "jzkh");
            return (Criteria) this;
        }

        public Criteria andJzkhLike(String value) {
            addCriterion("JZKH like", value, "jzkh");
            return (Criteria) this;
        }

        public Criteria andJzkhNotLike(String value) {
            addCriterion("JZKH not like", value, "jzkh");
            return (Criteria) this;
        }

        public Criteria andJzkhIn(List<String> values) {
            addCriterion("JZKH in", values, "jzkh");
            return (Criteria) this;
        }

        public Criteria andJzkhNotIn(List<String> values) {
            addCriterion("JZKH not in", values, "jzkh");
            return (Criteria) this;
        }

        public Criteria andJzkhBetween(String value1, String value2) {
            addCriterion("JZKH between", value1, value2, "jzkh");
            return (Criteria) this;
        }

        public Criteria andJzkhNotBetween(String value1, String value2) {
            addCriterion("JZKH not between", value1, value2, "jzkh");
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

        public Criteria andBgysxmIsNull() {
            addCriterion("BGYSXM is null");
            return (Criteria) this;
        }

        public Criteria andBgysxmIsNotNull() {
            addCriterion("BGYSXM is not null");
            return (Criteria) this;
        }

        public Criteria andBgysxmEqualTo(String value) {
            addCriterion("BGYSXM =", value, "bgysxm");
            return (Criteria) this;
        }

        public Criteria andBgysxmNotEqualTo(String value) {
            addCriterion("BGYSXM <>", value, "bgysxm");
            return (Criteria) this;
        }

        public Criteria andBgysxmGreaterThan(String value) {
            addCriterion("BGYSXM >", value, "bgysxm");
            return (Criteria) this;
        }

        public Criteria andBgysxmGreaterThanOrEqualTo(String value) {
            addCriterion("BGYSXM >=", value, "bgysxm");
            return (Criteria) this;
        }

        public Criteria andBgysxmLessThan(String value) {
            addCriterion("BGYSXM <", value, "bgysxm");
            return (Criteria) this;
        }

        public Criteria andBgysxmLessThanOrEqualTo(String value) {
            addCriterion("BGYSXM <=", value, "bgysxm");
            return (Criteria) this;
        }

        public Criteria andBgysxmLike(String value) {
            addCriterion("BGYSXM like", value, "bgysxm");
            return (Criteria) this;
        }

        public Criteria andBgysxmNotLike(String value) {
            addCriterion("BGYSXM not like", value, "bgysxm");
            return (Criteria) this;
        }

        public Criteria andBgysxmIn(List<String> values) {
            addCriterion("BGYSXM in", values, "bgysxm");
            return (Criteria) this;
        }

        public Criteria andBgysxmNotIn(List<String> values) {
            addCriterion("BGYSXM not in", values, "bgysxm");
            return (Criteria) this;
        }

        public Criteria andBgysxmBetween(String value1, String value2) {
            addCriterion("BGYSXM between", value1, value2, "bgysxm");
            return (Criteria) this;
        }

        public Criteria andBgysxmNotBetween(String value1, String value2) {
            addCriterion("BGYSXM not between", value1, value2, "bgysxm");
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

        public Criteria andShysxmIsNull() {
            addCriterion("SHYSXM is null");
            return (Criteria) this;
        }

        public Criteria andShysxmIsNotNull() {
            addCriterion("SHYSXM is not null");
            return (Criteria) this;
        }

        public Criteria andShysxmEqualTo(String value) {
            addCriterion("SHYSXM =", value, "shysxm");
            return (Criteria) this;
        }

        public Criteria andShysxmNotEqualTo(String value) {
            addCriterion("SHYSXM <>", value, "shysxm");
            return (Criteria) this;
        }

        public Criteria andShysxmGreaterThan(String value) {
            addCriterion("SHYSXM >", value, "shysxm");
            return (Criteria) this;
        }

        public Criteria andShysxmGreaterThanOrEqualTo(String value) {
            addCriterion("SHYSXM >=", value, "shysxm");
            return (Criteria) this;
        }

        public Criteria andShysxmLessThan(String value) {
            addCriterion("SHYSXM <", value, "shysxm");
            return (Criteria) this;
        }

        public Criteria andShysxmLessThanOrEqualTo(String value) {
            addCriterion("SHYSXM <=", value, "shysxm");
            return (Criteria) this;
        }

        public Criteria andShysxmLike(String value) {
            addCriterion("SHYSXM like", value, "shysxm");
            return (Criteria) this;
        }

        public Criteria andShysxmNotLike(String value) {
            addCriterion("SHYSXM not like", value, "shysxm");
            return (Criteria) this;
        }

        public Criteria andShysxmIn(List<String> values) {
            addCriterion("SHYSXM in", values, "shysxm");
            return (Criteria) this;
        }

        public Criteria andShysxmNotIn(List<String> values) {
            addCriterion("SHYSXM not in", values, "shysxm");
            return (Criteria) this;
        }

        public Criteria andShysxmBetween(String value1, String value2) {
            addCriterion("SHYSXM between", value1, value2, "shysxm");
            return (Criteria) this;
        }

        public Criteria andShysxmNotBetween(String value1, String value2) {
            addCriterion("SHYSXM not between", value1, value2, "shysxm");
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

        public Criteria andJcsjIsNull() {
            addCriterion("JCSJ is null");
            return (Criteria) this;
        }

        public Criteria andJcsjIsNotNull() {
            addCriterion("JCSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJcsjEqualTo(Date value) {
            addCriterion("JCSJ =", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotEqualTo(Date value) {
            addCriterion("JCSJ <>", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjGreaterThan(Date value) {
            addCriterion("JCSJ >", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjGreaterThanOrEqualTo(Date value) {
            addCriterion("JCSJ >=", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjLessThan(Date value) {
            addCriterion("JCSJ <", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjLessThanOrEqualTo(Date value) {
            addCriterion("JCSJ <=", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjIn(List<Date> values) {
            addCriterion("JCSJ in", values, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotIn(List<Date> values) {
            addCriterion("JCSJ not in", values, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjBetween(Date value1, Date value2) {
            addCriterion("JCSJ between", value1, value2, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotBetween(Date value1, Date value2) {
            addCriterion("JCSJ not between", value1, value2, "jcsj");
            return (Criteria) this;
        }

        public Criteria andKdysxmIsNull() {
            addCriterion("KDYSXM is null");
            return (Criteria) this;
        }

        public Criteria andKdysxmIsNotNull() {
            addCriterion("KDYSXM is not null");
            return (Criteria) this;
        }

        public Criteria andKdysxmEqualTo(String value) {
            addCriterion("KDYSXM =", value, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdysxmNotEqualTo(String value) {
            addCriterion("KDYSXM <>", value, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdysxmGreaterThan(String value) {
            addCriterion("KDYSXM >", value, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdysxmGreaterThanOrEqualTo(String value) {
            addCriterion("KDYSXM >=", value, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdysxmLessThan(String value) {
            addCriterion("KDYSXM <", value, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdysxmLessThanOrEqualTo(String value) {
            addCriterion("KDYSXM <=", value, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdysxmLike(String value) {
            addCriterion("KDYSXM like", value, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdysxmNotLike(String value) {
            addCriterion("KDYSXM not like", value, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdysxmIn(List<String> values) {
            addCriterion("KDYSXM in", values, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdysxmNotIn(List<String> values) {
            addCriterion("KDYSXM not in", values, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdysxmBetween(String value1, String value2) {
            addCriterion("KDYSXM between", value1, value2, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdysxmNotBetween(String value1, String value2) {
            addCriterion("KDYSXM not between", value1, value2, "kdysxm");
            return (Criteria) this;
        }

        public Criteria andKdsjIsNull() {
            addCriterion("KDSJ is null");
            return (Criteria) this;
        }

        public Criteria andKdsjIsNotNull() {
            addCriterion("KDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andKdsjEqualTo(Date value) {
            addCriterion("KDSJ =", value, "kdsj");
            return (Criteria) this;
        }

        public Criteria andKdsjNotEqualTo(Date value) {
            addCriterion("KDSJ <>", value, "kdsj");
            return (Criteria) this;
        }

        public Criteria andKdsjGreaterThan(Date value) {
            addCriterion("KDSJ >", value, "kdsj");
            return (Criteria) this;
        }

        public Criteria andKdsjGreaterThanOrEqualTo(Date value) {
            addCriterion("KDSJ >=", value, "kdsj");
            return (Criteria) this;
        }

        public Criteria andKdsjLessThan(Date value) {
            addCriterion("KDSJ <", value, "kdsj");
            return (Criteria) this;
        }

        public Criteria andKdsjLessThanOrEqualTo(Date value) {
            addCriterion("KDSJ <=", value, "kdsj");
            return (Criteria) this;
        }

        public Criteria andKdsjIn(List<Date> values) {
            addCriterion("KDSJ in", values, "kdsj");
            return (Criteria) this;
        }

        public Criteria andKdsjNotIn(List<Date> values) {
            addCriterion("KDSJ not in", values, "kdsj");
            return (Criteria) this;
        }

        public Criteria andKdsjBetween(Date value1, Date value2) {
            addCriterion("KDSJ between", value1, value2, "kdsj");
            return (Criteria) this;
        }

        public Criteria andKdsjNotBetween(Date value1, Date value2) {
            addCriterion("KDSJ not between", value1, value2, "kdsj");
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