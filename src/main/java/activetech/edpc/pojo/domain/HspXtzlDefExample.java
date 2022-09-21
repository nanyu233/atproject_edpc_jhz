package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspXtzlDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspXtzlDefExample() {
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

        public Criteria andBusStepIsNull() {
            addCriterion("BUS_STEP is null");
            return (Criteria) this;
        }

        public Criteria andBusStepIsNotNull() {
            addCriterion("BUS_STEP is not null");
            return (Criteria) this;
        }

        public Criteria andBusStepEqualTo(String value) {
            addCriterion("BUS_STEP =", value, "busStep");
            return (Criteria) this;
        }

        public Criteria andBusStepNotEqualTo(String value) {
            addCriterion("BUS_STEP <>", value, "busStep");
            return (Criteria) this;
        }

        public Criteria andBusStepGreaterThan(String value) {
            addCriterion("BUS_STEP >", value, "busStep");
            return (Criteria) this;
        }

        public Criteria andBusStepGreaterThanOrEqualTo(String value) {
            addCriterion("BUS_STEP >=", value, "busStep");
            return (Criteria) this;
        }

        public Criteria andBusStepLessThan(String value) {
            addCriterion("BUS_STEP <", value, "busStep");
            return (Criteria) this;
        }

        public Criteria andBusStepLessThanOrEqualTo(String value) {
            addCriterion("BUS_STEP <=", value, "busStep");
            return (Criteria) this;
        }

        public Criteria andBusStepLike(String value) {
            addCriterion("BUS_STEP like", value, "busStep");
            return (Criteria) this;
        }

        public Criteria andBusStepNotLike(String value) {
            addCriterion("BUS_STEP not like", value, "busStep");
            return (Criteria) this;
        }

        public Criteria andBusStepIn(List<String> values) {
            addCriterion("BUS_STEP in", values, "busStep");
            return (Criteria) this;
        }

        public Criteria andBusStepNotIn(List<String> values) {
            addCriterion("BUS_STEP not in", values, "busStep");
            return (Criteria) this;
        }

        public Criteria andBusStepBetween(String value1, String value2) {
            addCriterion("BUS_STEP between", value1, value2, "busStep");
            return (Criteria) this;
        }

        public Criteria andBusStepNotBetween(String value1, String value2) {
            addCriterion("BUS_STEP not between", value1, value2, "busStep");
            return (Criteria) this;
        }

        public Criteria andProCodeIsNull() {
            addCriterion("PRO_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProCodeIsNotNull() {
            addCriterion("PRO_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProCodeEqualTo(String value) {
            addCriterion("PRO_CODE =", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotEqualTo(String value) {
            addCriterion("PRO_CODE <>", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThan(String value) {
            addCriterion("PRO_CODE >", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_CODE >=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThan(String value) {
            addCriterion("PRO_CODE <", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThanOrEqualTo(String value) {
            addCriterion("PRO_CODE <=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLike(String value) {
            addCriterion("PRO_CODE like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotLike(String value) {
            addCriterion("PRO_CODE not like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeIn(List<String> values) {
            addCriterion("PRO_CODE in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotIn(List<String> values) {
            addCriterion("PRO_CODE not in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeBetween(String value1, String value2) {
            addCriterion("PRO_CODE between", value1, value2, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotBetween(String value1, String value2) {
            addCriterion("PRO_CODE not between", value1, value2, "proCode");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNull() {
            addCriterion("PRO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNotNull() {
            addCriterion("PRO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProTypeEqualTo(String value) {
            addCriterion("PRO_TYPE =", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotEqualTo(String value) {
            addCriterion("PRO_TYPE <>", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThan(String value) {
            addCriterion("PRO_TYPE >", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_TYPE >=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThan(String value) {
            addCriterion("PRO_TYPE <", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThanOrEqualTo(String value) {
            addCriterion("PRO_TYPE <=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLike(String value) {
            addCriterion("PRO_TYPE like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotLike(String value) {
            addCriterion("PRO_TYPE not like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeIn(List<String> values) {
            addCriterion("PRO_TYPE in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotIn(List<String> values) {
            addCriterion("PRO_TYPE not in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeBetween(String value1, String value2) {
            addCriterion("PRO_TYPE between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotBetween(String value1, String value2) {
            addCriterion("PRO_TYPE not between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("PRO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("PRO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("PRO_NAME =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("PRO_NAME <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("PRO_NAME >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_NAME >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("PRO_NAME <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("PRO_NAME <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("PRO_NAME like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("PRO_NAME not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("PRO_NAME in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("PRO_NAME not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("PRO_NAME between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("PRO_NAME not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProUnitIsNull() {
            addCriterion("PRO_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andProUnitIsNotNull() {
            addCriterion("PRO_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andProUnitEqualTo(String value) {
            addCriterion("PRO_UNIT =", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotEqualTo(String value) {
            addCriterion("PRO_UNIT <>", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitGreaterThan(String value) {
            addCriterion("PRO_UNIT >", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_UNIT >=", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitLessThan(String value) {
            addCriterion("PRO_UNIT <", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitLessThanOrEqualTo(String value) {
            addCriterion("PRO_UNIT <=", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitLike(String value) {
            addCriterion("PRO_UNIT like", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotLike(String value) {
            addCriterion("PRO_UNIT not like", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitIn(List<String> values) {
            addCriterion("PRO_UNIT in", values, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotIn(List<String> values) {
            addCriterion("PRO_UNIT not in", values, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitBetween(String value1, String value2) {
            addCriterion("PRO_UNIT between", value1, value2, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotBetween(String value1, String value2) {
            addCriterion("PRO_UNIT not between", value1, value2, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProListIsNull() {
            addCriterion("PRO_LIST is null");
            return (Criteria) this;
        }

        public Criteria andProListIsNotNull() {
            addCriterion("PRO_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andProListEqualTo(String value) {
            addCriterion("PRO_LIST =", value, "proList");
            return (Criteria) this;
        }

        public Criteria andProListNotEqualTo(String value) {
            addCriterion("PRO_LIST <>", value, "proList");
            return (Criteria) this;
        }

        public Criteria andProListGreaterThan(String value) {
            addCriterion("PRO_LIST >", value, "proList");
            return (Criteria) this;
        }

        public Criteria andProListGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_LIST >=", value, "proList");
            return (Criteria) this;
        }

        public Criteria andProListLessThan(String value) {
            addCriterion("PRO_LIST <", value, "proList");
            return (Criteria) this;
        }

        public Criteria andProListLessThanOrEqualTo(String value) {
            addCriterion("PRO_LIST <=", value, "proList");
            return (Criteria) this;
        }

        public Criteria andProListLike(String value) {
            addCriterion("PRO_LIST like", value, "proList");
            return (Criteria) this;
        }

        public Criteria andProListNotLike(String value) {
            addCriterion("PRO_LIST not like", value, "proList");
            return (Criteria) this;
        }

        public Criteria andProListIn(List<String> values) {
            addCriterion("PRO_LIST in", values, "proList");
            return (Criteria) this;
        }

        public Criteria andProListNotIn(List<String> values) {
            addCriterion("PRO_LIST not in", values, "proList");
            return (Criteria) this;
        }

        public Criteria andProListBetween(String value1, String value2) {
            addCriterion("PRO_LIST between", value1, value2, "proList");
            return (Criteria) this;
        }

        public Criteria andProListNotBetween(String value1, String value2) {
            addCriterion("PRO_LIST not between", value1, value2, "proList");
            return (Criteria) this;
        }

        public Criteria andRedFlagIsNull() {
            addCriterion("RED_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRedFlagIsNotNull() {
            addCriterion("RED_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRedFlagEqualTo(String value) {
            addCriterion("RED_FLAG =", value, "redFlag");
            return (Criteria) this;
        }

        public Criteria andRedFlagNotEqualTo(String value) {
            addCriterion("RED_FLAG <>", value, "redFlag");
            return (Criteria) this;
        }

        public Criteria andRedFlagGreaterThan(String value) {
            addCriterion("RED_FLAG >", value, "redFlag");
            return (Criteria) this;
        }

        public Criteria andRedFlagGreaterThanOrEqualTo(String value) {
            addCriterion("RED_FLAG >=", value, "redFlag");
            return (Criteria) this;
        }

        public Criteria andRedFlagLessThan(String value) {
            addCriterion("RED_FLAG <", value, "redFlag");
            return (Criteria) this;
        }

        public Criteria andRedFlagLessThanOrEqualTo(String value) {
            addCriterion("RED_FLAG <=", value, "redFlag");
            return (Criteria) this;
        }

        public Criteria andRedFlagLike(String value) {
            addCriterion("RED_FLAG like", value, "redFlag");
            return (Criteria) this;
        }

        public Criteria andRedFlagNotLike(String value) {
            addCriterion("RED_FLAG not like", value, "redFlag");
            return (Criteria) this;
        }

        public Criteria andRedFlagIn(List<String> values) {
            addCriterion("RED_FLAG in", values, "redFlag");
            return (Criteria) this;
        }

        public Criteria andRedFlagNotIn(List<String> values) {
            addCriterion("RED_FLAG not in", values, "redFlag");
            return (Criteria) this;
        }

        public Criteria andRedFlagBetween(String value1, String value2) {
            addCriterion("RED_FLAG between", value1, value2, "redFlag");
            return (Criteria) this;
        }

        public Criteria andRedFlagNotBetween(String value1, String value2) {
            addCriterion("RED_FLAG not between", value1, value2, "redFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagIsNull() {
            addCriterion("AUT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAutFlagIsNotNull() {
            addCriterion("AUT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAutFlagEqualTo(String value) {
            addCriterion("AUT_FLAG =", value, "autFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagNotEqualTo(String value) {
            addCriterion("AUT_FLAG <>", value, "autFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagGreaterThan(String value) {
            addCriterion("AUT_FLAG >", value, "autFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AUT_FLAG >=", value, "autFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagLessThan(String value) {
            addCriterion("AUT_FLAG <", value, "autFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagLessThanOrEqualTo(String value) {
            addCriterion("AUT_FLAG <=", value, "autFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagLike(String value) {
            addCriterion("AUT_FLAG like", value, "autFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagNotLike(String value) {
            addCriterion("AUT_FLAG not like", value, "autFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagIn(List<String> values) {
            addCriterion("AUT_FLAG in", values, "autFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagNotIn(List<String> values) {
            addCriterion("AUT_FLAG not in", values, "autFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagBetween(String value1, String value2) {
            addCriterion("AUT_FLAG between", value1, value2, "autFlag");
            return (Criteria) this;
        }

        public Criteria andAutFlagNotBetween(String value1, String value2) {
            addCriterion("AUT_FLAG not between", value1, value2, "autFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagIsNull() {
            addCriterion("TIT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTitFlagIsNotNull() {
            addCriterion("TIT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTitFlagEqualTo(String value) {
            addCriterion("TIT_FLAG =", value, "titFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagNotEqualTo(String value) {
            addCriterion("TIT_FLAG <>", value, "titFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagGreaterThan(String value) {
            addCriterion("TIT_FLAG >", value, "titFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagGreaterThanOrEqualTo(String value) {
            addCriterion("TIT_FLAG >=", value, "titFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagLessThan(String value) {
            addCriterion("TIT_FLAG <", value, "titFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagLessThanOrEqualTo(String value) {
            addCriterion("TIT_FLAG <=", value, "titFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagLike(String value) {
            addCriterion("TIT_FLAG like", value, "titFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagNotLike(String value) {
            addCriterion("TIT_FLAG not like", value, "titFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagIn(List<String> values) {
            addCriterion("TIT_FLAG in", values, "titFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagNotIn(List<String> values) {
            addCriterion("TIT_FLAG not in", values, "titFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagBetween(String value1, String value2) {
            addCriterion("TIT_FLAG between", value1, value2, "titFlag");
            return (Criteria) this;
        }

        public Criteria andTitFlagNotBetween(String value1, String value2) {
            addCriterion("TIT_FLAG not between", value1, value2, "titFlag");
            return (Criteria) this;
        }

        public Criteria andPreCodeIsNull() {
            addCriterion("PRE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPreCodeIsNotNull() {
            addCriterion("PRE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPreCodeEqualTo(String value) {
            addCriterion("PRE_CODE =", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeNotEqualTo(String value) {
            addCriterion("PRE_CODE <>", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeGreaterThan(String value) {
            addCriterion("PRE_CODE >", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_CODE >=", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeLessThan(String value) {
            addCriterion("PRE_CODE <", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeLessThanOrEqualTo(String value) {
            addCriterion("PRE_CODE <=", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeLike(String value) {
            addCriterion("PRE_CODE like", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeNotLike(String value) {
            addCriterion("PRE_CODE not like", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeIn(List<String> values) {
            addCriterion("PRE_CODE in", values, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeNotIn(List<String> values) {
            addCriterion("PRE_CODE not in", values, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeBetween(String value1, String value2) {
            addCriterion("PRE_CODE between", value1, value2, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeNotBetween(String value1, String value2) {
            addCriterion("PRE_CODE not between", value1, value2, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreLitmIsNull() {
            addCriterion("PRE_LITM is null");
            return (Criteria) this;
        }

        public Criteria andPreLitmIsNotNull() {
            addCriterion("PRE_LITM is not null");
            return (Criteria) this;
        }

        public Criteria andPreLitmEqualTo(String value) {
            addCriterion("PRE_LITM =", value, "preLitm");
            return (Criteria) this;
        }

        public Criteria andPreLitmNotEqualTo(String value) {
            addCriterion("PRE_LITM <>", value, "preLitm");
            return (Criteria) this;
        }

        public Criteria andPreLitmGreaterThan(String value) {
            addCriterion("PRE_LITM >", value, "preLitm");
            return (Criteria) this;
        }

        public Criteria andPreLitmGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_LITM >=", value, "preLitm");
            return (Criteria) this;
        }

        public Criteria andPreLitmLessThan(String value) {
            addCriterion("PRE_LITM <", value, "preLitm");
            return (Criteria) this;
        }

        public Criteria andPreLitmLessThanOrEqualTo(String value) {
            addCriterion("PRE_LITM <=", value, "preLitm");
            return (Criteria) this;
        }

        public Criteria andPreLitmLike(String value) {
            addCriterion("PRE_LITM like", value, "preLitm");
            return (Criteria) this;
        }

        public Criteria andPreLitmNotLike(String value) {
            addCriterion("PRE_LITM not like", value, "preLitm");
            return (Criteria) this;
        }

        public Criteria andPreLitmIn(List<String> values) {
            addCriterion("PRE_LITM in", values, "preLitm");
            return (Criteria) this;
        }

        public Criteria andPreLitmNotIn(List<String> values) {
            addCriterion("PRE_LITM not in", values, "preLitm");
            return (Criteria) this;
        }

        public Criteria andPreLitmBetween(String value1, String value2) {
            addCriterion("PRE_LITM between", value1, value2, "preLitm");
            return (Criteria) this;
        }

        public Criteria andPreLitmNotBetween(String value1, String value2) {
            addCriterion("PRE_LITM not between", value1, value2, "preLitm");
            return (Criteria) this;
        }

        public Criteria andProMemoIsNull() {
            addCriterion("PRO_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andProMemoIsNotNull() {
            addCriterion("PRO_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andProMemoEqualTo(String value) {
            addCriterion("PRO_MEMO =", value, "proMemo");
            return (Criteria) this;
        }

        public Criteria andProMemoNotEqualTo(String value) {
            addCriterion("PRO_MEMO <>", value, "proMemo");
            return (Criteria) this;
        }

        public Criteria andProMemoGreaterThan(String value) {
            addCriterion("PRO_MEMO >", value, "proMemo");
            return (Criteria) this;
        }

        public Criteria andProMemoGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_MEMO >=", value, "proMemo");
            return (Criteria) this;
        }

        public Criteria andProMemoLessThan(String value) {
            addCriterion("PRO_MEMO <", value, "proMemo");
            return (Criteria) this;
        }

        public Criteria andProMemoLessThanOrEqualTo(String value) {
            addCriterion("PRO_MEMO <=", value, "proMemo");
            return (Criteria) this;
        }

        public Criteria andProMemoLike(String value) {
            addCriterion("PRO_MEMO like", value, "proMemo");
            return (Criteria) this;
        }

        public Criteria andProMemoNotLike(String value) {
            addCriterion("PRO_MEMO not like", value, "proMemo");
            return (Criteria) this;
        }

        public Criteria andProMemoIn(List<String> values) {
            addCriterion("PRO_MEMO in", values, "proMemo");
            return (Criteria) this;
        }

        public Criteria andProMemoNotIn(List<String> values) {
            addCriterion("PRO_MEMO not in", values, "proMemo");
            return (Criteria) this;
        }

        public Criteria andProMemoBetween(String value1, String value2) {
            addCriterion("PRO_MEMO between", value1, value2, "proMemo");
            return (Criteria) this;
        }

        public Criteria andProMemoNotBetween(String value1, String value2) {
            addCriterion("PRO_MEMO not between", value1, value2, "proMemo");
            return (Criteria) this;
        }

        public Criteria andFldSortIsNull() {
            addCriterion("FLD_SORT is null");
            return (Criteria) this;
        }

        public Criteria andFldSortIsNotNull() {
            addCriterion("FLD_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andFldSortEqualTo(Short value) {
            addCriterion("FLD_SORT =", value, "fldSort");
            return (Criteria) this;
        }

        public Criteria andFldSortNotEqualTo(Short value) {
            addCriterion("FLD_SORT <>", value, "fldSort");
            return (Criteria) this;
        }

        public Criteria andFldSortGreaterThan(Short value) {
            addCriterion("FLD_SORT >", value, "fldSort");
            return (Criteria) this;
        }

        public Criteria andFldSortGreaterThanOrEqualTo(Short value) {
            addCriterion("FLD_SORT >=", value, "fldSort");
            return (Criteria) this;
        }

        public Criteria andFldSortLessThan(Short value) {
            addCriterion("FLD_SORT <", value, "fldSort");
            return (Criteria) this;
        }

        public Criteria andFldSortLessThanOrEqualTo(Short value) {
            addCriterion("FLD_SORT <=", value, "fldSort");
            return (Criteria) this;
        }

        public Criteria andFldSortIn(List<Short> values) {
            addCriterion("FLD_SORT in", values, "fldSort");
            return (Criteria) this;
        }

        public Criteria andFldSortNotIn(List<Short> values) {
            addCriterion("FLD_SORT not in", values, "fldSort");
            return (Criteria) this;
        }

        public Criteria andFldSortBetween(Short value1, Short value2) {
            addCriterion("FLD_SORT between", value1, value2, "fldSort");
            return (Criteria) this;
        }

        public Criteria andFldSortNotBetween(Short value1, Short value2) {
            addCriterion("FLD_SORT not between", value1, value2, "fldSort");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNull() {
            addCriterion("NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(String value) {
            addCriterion("NODE_ID =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(String value) {
            addCriterion("NODE_ID <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(String value) {
            addCriterion("NODE_ID >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_ID >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(String value) {
            addCriterion("NODE_ID <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(String value) {
            addCriterion("NODE_ID <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLike(String value) {
            addCriterion("NODE_ID like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotLike(String value) {
            addCriterion("NODE_ID not like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<String> values) {
            addCriterion("NODE_ID in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<String> values) {
            addCriterion("NODE_ID not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(String value1, String value2) {
            addCriterion("NODE_ID between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(String value1, String value2) {
            addCriterion("NODE_ID not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andKeyTimeIsNull() {
            addCriterion("KEY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andKeyTimeIsNotNull() {
            addCriterion("KEY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andKeyTimeEqualTo(String value) {
            addCriterion("KEY_TIME =", value, "keyTime");
            return (Criteria) this;
        }

        public Criteria andKeyTimeNotEqualTo(String value) {
            addCriterion("KEY_TIME <>", value, "keyTime");
            return (Criteria) this;
        }

        public Criteria andKeyTimeGreaterThan(String value) {
            addCriterion("KEY_TIME >", value, "keyTime");
            return (Criteria) this;
        }

        public Criteria andKeyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_TIME >=", value, "keyTime");
            return (Criteria) this;
        }

        public Criteria andKeyTimeLessThan(String value) {
            addCriterion("KEY_TIME <", value, "keyTime");
            return (Criteria) this;
        }

        public Criteria andKeyTimeLessThanOrEqualTo(String value) {
            addCriterion("KEY_TIME <=", value, "keyTime");
            return (Criteria) this;
        }

        public Criteria andKeyTimeLike(String value) {
            addCriterion("KEY_TIME like", value, "keyTime");
            return (Criteria) this;
        }

        public Criteria andKeyTimeNotLike(String value) {
            addCriterion("KEY_TIME not like", value, "keyTime");
            return (Criteria) this;
        }

        public Criteria andKeyTimeIn(List<String> values) {
            addCriterion("KEY_TIME in", values, "keyTime");
            return (Criteria) this;
        }

        public Criteria andKeyTimeNotIn(List<String> values) {
            addCriterion("KEY_TIME not in", values, "keyTime");
            return (Criteria) this;
        }

        public Criteria andKeyTimeBetween(String value1, String value2) {
            addCriterion("KEY_TIME between", value1, value2, "keyTime");
            return (Criteria) this;
        }

        public Criteria andKeyTimeNotBetween(String value1, String value2) {
            addCriterion("KEY_TIME not between", value1, value2, "keyTime");
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