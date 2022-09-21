package activetech.base.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspAddrPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspAddrPostExample() {
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

        public Criteria andAddrCodeIsNull() {
            addCriterion("ADDR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAddrCodeIsNotNull() {
            addCriterion("ADDR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCodeEqualTo(String value) {
            addCriterion("ADDR_CODE =", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeNotEqualTo(String value) {
            addCriterion("ADDR_CODE <>", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeGreaterThan(String value) {
            addCriterion("ADDR_CODE >", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_CODE >=", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeLessThan(String value) {
            addCriterion("ADDR_CODE <", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeLessThanOrEqualTo(String value) {
            addCriterion("ADDR_CODE <=", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeLike(String value) {
            addCriterion("ADDR_CODE like", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeNotLike(String value) {
            addCriterion("ADDR_CODE not like", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeIn(List<String> values) {
            addCriterion("ADDR_CODE in", values, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeNotIn(List<String> values) {
            addCriterion("ADDR_CODE not in", values, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeBetween(String value1, String value2) {
            addCriterion("ADDR_CODE between", value1, value2, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeNotBetween(String value1, String value2) {
            addCriterion("ADDR_CODE not between", value1, value2, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrTypeIsNull() {
            addCriterion("ADDR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAddrTypeIsNotNull() {
            addCriterion("ADDR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAddrTypeEqualTo(String value) {
            addCriterion("ADDR_TYPE =", value, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrTypeNotEqualTo(String value) {
            addCriterion("ADDR_TYPE <>", value, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrTypeGreaterThan(String value) {
            addCriterion("ADDR_TYPE >", value, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_TYPE >=", value, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrTypeLessThan(String value) {
            addCriterion("ADDR_TYPE <", value, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrTypeLessThanOrEqualTo(String value) {
            addCriterion("ADDR_TYPE <=", value, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrTypeLike(String value) {
            addCriterion("ADDR_TYPE like", value, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrTypeNotLike(String value) {
            addCriterion("ADDR_TYPE not like", value, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrTypeIn(List<String> values) {
            addCriterion("ADDR_TYPE in", values, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrTypeNotIn(List<String> values) {
            addCriterion("ADDR_TYPE not in", values, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrTypeBetween(String value1, String value2) {
            addCriterion("ADDR_TYPE between", value1, value2, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrTypeNotBetween(String value1, String value2) {
            addCriterion("ADDR_TYPE not between", value1, value2, "addrType");
            return (Criteria) this;
        }

        public Criteria andAddrNameIsNull() {
            addCriterion("ADDR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddrNameIsNotNull() {
            addCriterion("ADDR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddrNameEqualTo(String value) {
            addCriterion("ADDR_NAME =", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotEqualTo(String value) {
            addCriterion("ADDR_NAME <>", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameGreaterThan(String value) {
            addCriterion("ADDR_NAME >", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_NAME >=", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameLessThan(String value) {
            addCriterion("ADDR_NAME <", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameLessThanOrEqualTo(String value) {
            addCriterion("ADDR_NAME <=", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameLike(String value) {
            addCriterion("ADDR_NAME like", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotLike(String value) {
            addCriterion("ADDR_NAME not like", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameIn(List<String> values) {
            addCriterion("ADDR_NAME in", values, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotIn(List<String> values) {
            addCriterion("ADDR_NAME not in", values, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameBetween(String value1, String value2) {
            addCriterion("ADDR_NAME between", value1, value2, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotBetween(String value1, String value2) {
            addCriterion("ADDR_NAME not between", value1, value2, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrStatIsNull() {
            addCriterion("ADDR_STAT is null");
            return (Criteria) this;
        }

        public Criteria andAddrStatIsNotNull() {
            addCriterion("ADDR_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andAddrStatEqualTo(String value) {
            addCriterion("ADDR_STAT =", value, "addrStat");
            return (Criteria) this;
        }

        public Criteria andAddrStatNotEqualTo(String value) {
            addCriterion("ADDR_STAT <>", value, "addrStat");
            return (Criteria) this;
        }

        public Criteria andAddrStatGreaterThan(String value) {
            addCriterion("ADDR_STAT >", value, "addrStat");
            return (Criteria) this;
        }

        public Criteria andAddrStatGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_STAT >=", value, "addrStat");
            return (Criteria) this;
        }

        public Criteria andAddrStatLessThan(String value) {
            addCriterion("ADDR_STAT <", value, "addrStat");
            return (Criteria) this;
        }

        public Criteria andAddrStatLessThanOrEqualTo(String value) {
            addCriterion("ADDR_STAT <=", value, "addrStat");
            return (Criteria) this;
        }

        public Criteria andAddrStatLike(String value) {
            addCriterion("ADDR_STAT like", value, "addrStat");
            return (Criteria) this;
        }

        public Criteria andAddrStatNotLike(String value) {
            addCriterion("ADDR_STAT not like", value, "addrStat");
            return (Criteria) this;
        }

        public Criteria andAddrStatIn(List<String> values) {
            addCriterion("ADDR_STAT in", values, "addrStat");
            return (Criteria) this;
        }

        public Criteria andAddrStatNotIn(List<String> values) {
            addCriterion("ADDR_STAT not in", values, "addrStat");
            return (Criteria) this;
        }

        public Criteria andAddrStatBetween(String value1, String value2) {
            addCriterion("ADDR_STAT between", value1, value2, "addrStat");
            return (Criteria) this;
        }

        public Criteria andAddrStatNotBetween(String value1, String value2) {
            addCriterion("ADDR_STAT not between", value1, value2, "addrStat");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("POST_CODE =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("POST_CODE <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("POST_CODE >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POST_CODE >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("POST_CODE <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("POST_CODE <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("POST_CODE like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("POST_CODE not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("POST_CODE in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("POST_CODE not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("POST_CODE between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("POST_CODE not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeIsNull() {
            addCriterion("PHE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPheCodeIsNotNull() {
            addCriterion("PHE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPheCodeEqualTo(String value) {
            addCriterion("PHE_CODE =", value, "pheCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeNotEqualTo(String value) {
            addCriterion("PHE_CODE <>", value, "pheCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeGreaterThan(String value) {
            addCriterion("PHE_CODE >", value, "pheCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PHE_CODE >=", value, "pheCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeLessThan(String value) {
            addCriterion("PHE_CODE <", value, "pheCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeLessThanOrEqualTo(String value) {
            addCriterion("PHE_CODE <=", value, "pheCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeLike(String value) {
            addCriterion("PHE_CODE like", value, "pheCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeNotLike(String value) {
            addCriterion("PHE_CODE not like", value, "pheCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeIn(List<String> values) {
            addCriterion("PHE_CODE in", values, "pheCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeNotIn(List<String> values) {
            addCriterion("PHE_CODE not in", values, "pheCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeBetween(String value1, String value2) {
            addCriterion("PHE_CODE between", value1, value2, "pheCode");
            return (Criteria) this;
        }

        public Criteria andPheCodeNotBetween(String value1, String value2) {
            addCriterion("PHE_CODE not between", value1, value2, "pheCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeIsNull() {
            addCriterion("SUPR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSuprCodeIsNotNull() {
            addCriterion("SUPR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSuprCodeEqualTo(String value) {
            addCriterion("SUPR_CODE =", value, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeNotEqualTo(String value) {
            addCriterion("SUPR_CODE <>", value, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeGreaterThan(String value) {
            addCriterion("SUPR_CODE >", value, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPR_CODE >=", value, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeLessThan(String value) {
            addCriterion("SUPR_CODE <", value, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeLessThanOrEqualTo(String value) {
            addCriterion("SUPR_CODE <=", value, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeLike(String value) {
            addCriterion("SUPR_CODE like", value, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeNotLike(String value) {
            addCriterion("SUPR_CODE not like", value, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeIn(List<String> values) {
            addCriterion("SUPR_CODE in", values, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeNotIn(List<String> values) {
            addCriterion("SUPR_CODE not in", values, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeBetween(String value1, String value2) {
            addCriterion("SUPR_CODE between", value1, value2, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprCodeNotBetween(String value1, String value2) {
            addCriterion("SUPR_CODE not between", value1, value2, "suprCode");
            return (Criteria) this;
        }

        public Criteria andSuprNameIsNull() {
            addCriterion("SUPR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSuprNameIsNotNull() {
            addCriterion("SUPR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSuprNameEqualTo(String value) {
            addCriterion("SUPR_NAME =", value, "suprName");
            return (Criteria) this;
        }

        public Criteria andSuprNameNotEqualTo(String value) {
            addCriterion("SUPR_NAME <>", value, "suprName");
            return (Criteria) this;
        }

        public Criteria andSuprNameGreaterThan(String value) {
            addCriterion("SUPR_NAME >", value, "suprName");
            return (Criteria) this;
        }

        public Criteria andSuprNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPR_NAME >=", value, "suprName");
            return (Criteria) this;
        }

        public Criteria andSuprNameLessThan(String value) {
            addCriterion("SUPR_NAME <", value, "suprName");
            return (Criteria) this;
        }

        public Criteria andSuprNameLessThanOrEqualTo(String value) {
            addCriterion("SUPR_NAME <=", value, "suprName");
            return (Criteria) this;
        }

        public Criteria andSuprNameLike(String value) {
            addCriterion("SUPR_NAME like", value, "suprName");
            return (Criteria) this;
        }

        public Criteria andSuprNameNotLike(String value) {
            addCriterion("SUPR_NAME not like", value, "suprName");
            return (Criteria) this;
        }

        public Criteria andSuprNameIn(List<String> values) {
            addCriterion("SUPR_NAME in", values, "suprName");
            return (Criteria) this;
        }

        public Criteria andSuprNameNotIn(List<String> values) {
            addCriterion("SUPR_NAME not in", values, "suprName");
            return (Criteria) this;
        }

        public Criteria andSuprNameBetween(String value1, String value2) {
            addCriterion("SUPR_NAME between", value1, value2, "suprName");
            return (Criteria) this;
        }

        public Criteria andSuprNameNotBetween(String value1, String value2) {
            addCriterion("SUPR_NAME not between", value1, value2, "suprName");
            return (Criteria) this;
        }

        public Criteria andProvCodeIsNull() {
            addCriterion("PROV_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvCodeIsNotNull() {
            addCriterion("PROV_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvCodeEqualTo(String value) {
            addCriterion("PROV_CODE =", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotEqualTo(String value) {
            addCriterion("PROV_CODE <>", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThan(String value) {
            addCriterion("PROV_CODE >", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROV_CODE >=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThan(String value) {
            addCriterion("PROV_CODE <", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThanOrEqualTo(String value) {
            addCriterion("PROV_CODE <=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLike(String value) {
            addCriterion("PROV_CODE like", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotLike(String value) {
            addCriterion("PROV_CODE not like", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeIn(List<String> values) {
            addCriterion("PROV_CODE in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotIn(List<String> values) {
            addCriterion("PROV_CODE not in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeBetween(String value1, String value2) {
            addCriterion("PROV_CODE between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotBetween(String value1, String value2) {
            addCriterion("PROV_CODE not between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNull() {
            addCriterion("PROV_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNotNull() {
            addCriterion("PROV_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvNameEqualTo(String value) {
            addCriterion("PROV_NAME =", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotEqualTo(String value) {
            addCriterion("PROV_NAME <>", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThan(String value) {
            addCriterion("PROV_NAME >", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROV_NAME >=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThan(String value) {
            addCriterion("PROV_NAME <", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThanOrEqualTo(String value) {
            addCriterion("PROV_NAME <=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLike(String value) {
            addCriterion("PROV_NAME like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotLike(String value) {
            addCriterion("PROV_NAME not like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameIn(List<String> values) {
            addCriterion("PROV_NAME in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotIn(List<String> values) {
            addCriterion("PROV_NAME not in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameBetween(String value1, String value2) {
            addCriterion("PROV_NAME between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotBetween(String value1, String value2) {
            addCriterion("PROV_NAME not between", value1, value2, "provName");
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