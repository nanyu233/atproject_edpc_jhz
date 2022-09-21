package activetech.eicu.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class IcuVsDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcuVsDefExample() {
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

        public Criteria andVsTypeIsNull() {
            addCriterion("VS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVsTypeIsNotNull() {
            addCriterion("VS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVsTypeEqualTo(String value) {
            addCriterion("VS_TYPE =", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeNotEqualTo(String value) {
            addCriterion("VS_TYPE <>", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeGreaterThan(String value) {
            addCriterion("VS_TYPE >", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VS_TYPE >=", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeLessThan(String value) {
            addCriterion("VS_TYPE <", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeLessThanOrEqualTo(String value) {
            addCriterion("VS_TYPE <=", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeLike(String value) {
            addCriterion("VS_TYPE like", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeNotLike(String value) {
            addCriterion("VS_TYPE not like", value, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeIn(List<String> values) {
            addCriterion("VS_TYPE in", values, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeNotIn(List<String> values) {
            addCriterion("VS_TYPE not in", values, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeBetween(String value1, String value2) {
            addCriterion("VS_TYPE between", value1, value2, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsTypeNotBetween(String value1, String value2) {
            addCriterion("VS_TYPE not between", value1, value2, "vsType");
            return (Criteria) this;
        }

        public Criteria andVsCodeIsNull() {
            addCriterion("VS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVsCodeIsNotNull() {
            addCriterion("VS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVsCodeEqualTo(String value) {
            addCriterion("VS_CODE =", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeNotEqualTo(String value) {
            addCriterion("VS_CODE <>", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeGreaterThan(String value) {
            addCriterion("VS_CODE >", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VS_CODE >=", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeLessThan(String value) {
            addCriterion("VS_CODE <", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeLessThanOrEqualTo(String value) {
            addCriterion("VS_CODE <=", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeLike(String value) {
            addCriterion("VS_CODE like", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeNotLike(String value) {
            addCriterion("VS_CODE not like", value, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeIn(List<String> values) {
            addCriterion("VS_CODE in", values, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeNotIn(List<String> values) {
            addCriterion("VS_CODE not in", values, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeBetween(String value1, String value2) {
            addCriterion("VS_CODE between", value1, value2, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsCodeNotBetween(String value1, String value2) {
            addCriterion("VS_CODE not between", value1, value2, "vsCode");
            return (Criteria) this;
        }

        public Criteria andVsNameIsNull() {
            addCriterion("VS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVsNameIsNotNull() {
            addCriterion("VS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVsNameEqualTo(String value) {
            addCriterion("VS_NAME =", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameNotEqualTo(String value) {
            addCriterion("VS_NAME <>", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameGreaterThan(String value) {
            addCriterion("VS_NAME >", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameGreaterThanOrEqualTo(String value) {
            addCriterion("VS_NAME >=", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameLessThan(String value) {
            addCriterion("VS_NAME <", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameLessThanOrEqualTo(String value) {
            addCriterion("VS_NAME <=", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameLike(String value) {
            addCriterion("VS_NAME like", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameNotLike(String value) {
            addCriterion("VS_NAME not like", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameIn(List<String> values) {
            addCriterion("VS_NAME in", values, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameNotIn(List<String> values) {
            addCriterion("VS_NAME not in", values, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameBetween(String value1, String value2) {
            addCriterion("VS_NAME between", value1, value2, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameNotBetween(String value1, String value2) {
            addCriterion("VS_NAME not between", value1, value2, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsUnitIsNull() {
            addCriterion("VS_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andVsUnitIsNotNull() {
            addCriterion("VS_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andVsUnitEqualTo(String value) {
            addCriterion("VS_UNIT =", value, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andVsUnitNotEqualTo(String value) {
            addCriterion("VS_UNIT <>", value, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andVsUnitGreaterThan(String value) {
            addCriterion("VS_UNIT >", value, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andVsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("VS_UNIT >=", value, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andVsUnitLessThan(String value) {
            addCriterion("VS_UNIT <", value, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andVsUnitLessThanOrEqualTo(String value) {
            addCriterion("VS_UNIT <=", value, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andVsUnitLike(String value) {
            addCriterion("VS_UNIT like", value, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andVsUnitNotLike(String value) {
            addCriterion("VS_UNIT not like", value, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andVsUnitIn(List<String> values) {
            addCriterion("VS_UNIT in", values, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andVsUnitNotIn(List<String> values) {
            addCriterion("VS_UNIT not in", values, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andVsUnitBetween(String value1, String value2) {
            addCriterion("VS_UNIT between", value1, value2, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andVsUnitNotBetween(String value1, String value2) {
            addCriterion("VS_UNIT not between", value1, value2, "vsUnit");
            return (Criteria) this;
        }

        public Criteria andRsltModeIsNull() {
            addCriterion("RSLT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andRsltModeIsNotNull() {
            addCriterion("RSLT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andRsltModeEqualTo(String value) {
            addCriterion("RSLT_MODE =", value, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltModeNotEqualTo(String value) {
            addCriterion("RSLT_MODE <>", value, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltModeGreaterThan(String value) {
            addCriterion("RSLT_MODE >", value, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltModeGreaterThanOrEqualTo(String value) {
            addCriterion("RSLT_MODE >=", value, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltModeLessThan(String value) {
            addCriterion("RSLT_MODE <", value, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltModeLessThanOrEqualTo(String value) {
            addCriterion("RSLT_MODE <=", value, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltModeLike(String value) {
            addCriterion("RSLT_MODE like", value, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltModeNotLike(String value) {
            addCriterion("RSLT_MODE not like", value, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltModeIn(List<String> values) {
            addCriterion("RSLT_MODE in", values, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltModeNotIn(List<String> values) {
            addCriterion("RSLT_MODE not in", values, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltModeBetween(String value1, String value2) {
            addCriterion("RSLT_MODE between", value1, value2, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltModeNotBetween(String value1, String value2) {
            addCriterion("RSLT_MODE not between", value1, value2, "rsltMode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeIsNull() {
            addCriterion("RSLT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRsltCodeIsNotNull() {
            addCriterion("RSLT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRsltCodeEqualTo(String value) {
            addCriterion("RSLT_CODE =", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeNotEqualTo(String value) {
            addCriterion("RSLT_CODE <>", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeGreaterThan(String value) {
            addCriterion("RSLT_CODE >", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RSLT_CODE >=", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeLessThan(String value) {
            addCriterion("RSLT_CODE <", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeLessThanOrEqualTo(String value) {
            addCriterion("RSLT_CODE <=", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeLike(String value) {
            addCriterion("RSLT_CODE like", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeNotLike(String value) {
            addCriterion("RSLT_CODE not like", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeIn(List<String> values) {
            addCriterion("RSLT_CODE in", values, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeNotIn(List<String> values) {
            addCriterion("RSLT_CODE not in", values, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeBetween(String value1, String value2) {
            addCriterion("RSLT_CODE between", value1, value2, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeNotBetween(String value1, String value2) {
            addCriterion("RSLT_CODE not between", value1, value2, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andUdefFlagIsNull() {
            addCriterion("UDEF_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andUdefFlagIsNotNull() {
            addCriterion("UDEF_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andUdefFlagEqualTo(String value) {
            addCriterion("UDEF_FLAG =", value, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andUdefFlagNotEqualTo(String value) {
            addCriterion("UDEF_FLAG <>", value, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andUdefFlagGreaterThan(String value) {
            addCriterion("UDEF_FLAG >", value, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andUdefFlagGreaterThanOrEqualTo(String value) {
            addCriterion("UDEF_FLAG >=", value, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andUdefFlagLessThan(String value) {
            addCriterion("UDEF_FLAG <", value, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andUdefFlagLessThanOrEqualTo(String value) {
            addCriterion("UDEF_FLAG <=", value, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andUdefFlagLike(String value) {
            addCriterion("UDEF_FLAG like", value, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andUdefFlagNotLike(String value) {
            addCriterion("UDEF_FLAG not like", value, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andUdefFlagIn(List<String> values) {
            addCriterion("UDEF_FLAG in", values, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andUdefFlagNotIn(List<String> values) {
            addCriterion("UDEF_FLAG not in", values, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andUdefFlagBetween(String value1, String value2) {
            addCriterion("UDEF_FLAG between", value1, value2, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andUdefFlagNotBetween(String value1, String value2) {
            addCriterion("UDEF_FLAG not between", value1, value2, "udefFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagIsNull() {
            addCriterion("LMT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLmtFlagIsNotNull() {
            addCriterion("LMT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLmtFlagEqualTo(String value) {
            addCriterion("LMT_FLAG =", value, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagNotEqualTo(String value) {
            addCriterion("LMT_FLAG <>", value, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagGreaterThan(String value) {
            addCriterion("LMT_FLAG >", value, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagGreaterThanOrEqualTo(String value) {
            addCriterion("LMT_FLAG >=", value, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagLessThan(String value) {
            addCriterion("LMT_FLAG <", value, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagLessThanOrEqualTo(String value) {
            addCriterion("LMT_FLAG <=", value, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagLike(String value) {
            addCriterion("LMT_FLAG like", value, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagNotLike(String value) {
            addCriterion("LMT_FLAG not like", value, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagIn(List<String> values) {
            addCriterion("LMT_FLAG in", values, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagNotIn(List<String> values) {
            addCriterion("LMT_FLAG not in", values, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagBetween(String value1, String value2) {
            addCriterion("LMT_FLAG between", value1, value2, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andLmtFlagNotBetween(String value1, String value2) {
            addCriterion("LMT_FLAG not between", value1, value2, "lmtFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagIsNull() {
            addCriterion("CG_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCgFlagIsNotNull() {
            addCriterion("CG_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCgFlagEqualTo(String value) {
            addCriterion("CG_FLAG =", value, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagNotEqualTo(String value) {
            addCriterion("CG_FLAG <>", value, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagGreaterThan(String value) {
            addCriterion("CG_FLAG >", value, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CG_FLAG >=", value, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagLessThan(String value) {
            addCriterion("CG_FLAG <", value, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagLessThanOrEqualTo(String value) {
            addCriterion("CG_FLAG <=", value, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagLike(String value) {
            addCriterion("CG_FLAG like", value, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagNotLike(String value) {
            addCriterion("CG_FLAG not like", value, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagIn(List<String> values) {
            addCriterion("CG_FLAG in", values, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagNotIn(List<String> values) {
            addCriterion("CG_FLAG not in", values, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagBetween(String value1, String value2) {
            addCriterion("CG_FLAG between", value1, value2, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCgFlagNotBetween(String value1, String value2) {
            addCriterion("CG_FLAG not between", value1, value2, "cgFlag");
            return (Criteria) this;
        }

        public Criteria andCustShowIsNull() {
            addCriterion("CUST_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andCustShowIsNotNull() {
            addCriterion("CUST_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andCustShowEqualTo(String value) {
            addCriterion("CUST_SHOW =", value, "custShow");
            return (Criteria) this;
        }

        public Criteria andCustShowNotEqualTo(String value) {
            addCriterion("CUST_SHOW <>", value, "custShow");
            return (Criteria) this;
        }

        public Criteria andCustShowGreaterThan(String value) {
            addCriterion("CUST_SHOW >", value, "custShow");
            return (Criteria) this;
        }

        public Criteria andCustShowGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_SHOW >=", value, "custShow");
            return (Criteria) this;
        }

        public Criteria andCustShowLessThan(String value) {
            addCriterion("CUST_SHOW <", value, "custShow");
            return (Criteria) this;
        }

        public Criteria andCustShowLessThanOrEqualTo(String value) {
            addCriterion("CUST_SHOW <=", value, "custShow");
            return (Criteria) this;
        }

        public Criteria andCustShowLike(String value) {
            addCriterion("CUST_SHOW like", value, "custShow");
            return (Criteria) this;
        }

        public Criteria andCustShowNotLike(String value) {
            addCriterion("CUST_SHOW not like", value, "custShow");
            return (Criteria) this;
        }

        public Criteria andCustShowIn(List<String> values) {
            addCriterion("CUST_SHOW in", values, "custShow");
            return (Criteria) this;
        }

        public Criteria andCustShowNotIn(List<String> values) {
            addCriterion("CUST_SHOW not in", values, "custShow");
            return (Criteria) this;
        }

        public Criteria andCustShowBetween(String value1, String value2) {
            addCriterion("CUST_SHOW between", value1, value2, "custShow");
            return (Criteria) this;
        }

        public Criteria andCustShowNotBetween(String value1, String value2) {
            addCriterion("CUST_SHOW not between", value1, value2, "custShow");
            return (Criteria) this;
        }

        public Criteria andWholMainIsNull() {
            addCriterion("WHOL_MAIN is null");
            return (Criteria) this;
        }

        public Criteria andWholMainIsNotNull() {
            addCriterion("WHOL_MAIN is not null");
            return (Criteria) this;
        }

        public Criteria andWholMainEqualTo(String value) {
            addCriterion("WHOL_MAIN =", value, "wholMain");
            return (Criteria) this;
        }

        public Criteria andWholMainNotEqualTo(String value) {
            addCriterion("WHOL_MAIN <>", value, "wholMain");
            return (Criteria) this;
        }

        public Criteria andWholMainGreaterThan(String value) {
            addCriterion("WHOL_MAIN >", value, "wholMain");
            return (Criteria) this;
        }

        public Criteria andWholMainGreaterThanOrEqualTo(String value) {
            addCriterion("WHOL_MAIN >=", value, "wholMain");
            return (Criteria) this;
        }

        public Criteria andWholMainLessThan(String value) {
            addCriterion("WHOL_MAIN <", value, "wholMain");
            return (Criteria) this;
        }

        public Criteria andWholMainLessThanOrEqualTo(String value) {
            addCriterion("WHOL_MAIN <=", value, "wholMain");
            return (Criteria) this;
        }

        public Criteria andWholMainLike(String value) {
            addCriterion("WHOL_MAIN like", value, "wholMain");
            return (Criteria) this;
        }

        public Criteria andWholMainNotLike(String value) {
            addCriterion("WHOL_MAIN not like", value, "wholMain");
            return (Criteria) this;
        }

        public Criteria andWholMainIn(List<String> values) {
            addCriterion("WHOL_MAIN in", values, "wholMain");
            return (Criteria) this;
        }

        public Criteria andWholMainNotIn(List<String> values) {
            addCriterion("WHOL_MAIN not in", values, "wholMain");
            return (Criteria) this;
        }

        public Criteria andWholMainBetween(String value1, String value2) {
            addCriterion("WHOL_MAIN between", value1, value2, "wholMain");
            return (Criteria) this;
        }

        public Criteria andWholMainNotBetween(String value1, String value2) {
            addCriterion("WHOL_MAIN not between", value1, value2, "wholMain");
            return (Criteria) this;
        }

        public Criteria andColNumbIsNull() {
            addCriterion("COL_NUMB is null");
            return (Criteria) this;
        }

        public Criteria andColNumbIsNotNull() {
            addCriterion("COL_NUMB is not null");
            return (Criteria) this;
        }

        public Criteria andColNumbEqualTo(Integer value) {
            addCriterion("COL_NUMB =", value, "colNumb");
            return (Criteria) this;
        }

        public Criteria andColNumbNotEqualTo(Integer value) {
            addCriterion("COL_NUMB <>", value, "colNumb");
            return (Criteria) this;
        }

        public Criteria andColNumbGreaterThan(Integer value) {
            addCriterion("COL_NUMB >", value, "colNumb");
            return (Criteria) this;
        }

        public Criteria andColNumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("COL_NUMB >=", value, "colNumb");
            return (Criteria) this;
        }

        public Criteria andColNumbLessThan(Integer value) {
            addCriterion("COL_NUMB <", value, "colNumb");
            return (Criteria) this;
        }

        public Criteria andColNumbLessThanOrEqualTo(Integer value) {
            addCriterion("COL_NUMB <=", value, "colNumb");
            return (Criteria) this;
        }

        public Criteria andColNumbIn(List<Integer> values) {
            addCriterion("COL_NUMB in", values, "colNumb");
            return (Criteria) this;
        }

        public Criteria andColNumbNotIn(List<Integer> values) {
            addCriterion("COL_NUMB not in", values, "colNumb");
            return (Criteria) this;
        }

        public Criteria andColNumbBetween(Integer value1, Integer value2) {
            addCriterion("COL_NUMB between", value1, value2, "colNumb");
            return (Criteria) this;
        }

        public Criteria andColNumbNotBetween(Integer value1, Integer value2) {
            addCriterion("COL_NUMB not between", value1, value2, "colNumb");
            return (Criteria) this;
        }

        public Criteria andVsSortIsNull() {
            addCriterion("VS_SORT is null");
            return (Criteria) this;
        }

        public Criteria andVsSortIsNotNull() {
            addCriterion("VS_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andVsSortEqualTo(Integer value) {
            addCriterion("VS_SORT =", value, "vsSort");
            return (Criteria) this;
        }

        public Criteria andVsSortNotEqualTo(Integer value) {
            addCriterion("VS_SORT <>", value, "vsSort");
            return (Criteria) this;
        }

        public Criteria andVsSortGreaterThan(Integer value) {
            addCriterion("VS_SORT >", value, "vsSort");
            return (Criteria) this;
        }

        public Criteria andVsSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("VS_SORT >=", value, "vsSort");
            return (Criteria) this;
        }

        public Criteria andVsSortLessThan(Integer value) {
            addCriterion("VS_SORT <", value, "vsSort");
            return (Criteria) this;
        }

        public Criteria andVsSortLessThanOrEqualTo(Integer value) {
            addCriterion("VS_SORT <=", value, "vsSort");
            return (Criteria) this;
        }

        public Criteria andVsSortIn(List<Integer> values) {
            addCriterion("VS_SORT in", values, "vsSort");
            return (Criteria) this;
        }

        public Criteria andVsSortNotIn(List<Integer> values) {
            addCriterion("VS_SORT not in", values, "vsSort");
            return (Criteria) this;
        }

        public Criteria andVsSortBetween(Integer value1, Integer value2) {
            addCriterion("VS_SORT between", value1, value2, "vsSort");
            return (Criteria) this;
        }

        public Criteria andVsSortNotBetween(Integer value1, Integer value2) {
            addCriterion("VS_SORT not between", value1, value2, "vsSort");
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