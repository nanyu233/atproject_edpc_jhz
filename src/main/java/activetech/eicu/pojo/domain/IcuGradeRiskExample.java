package activetech.eicu.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IcuGradeRiskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcuGradeRiskExample() {
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

        public Criteria andItemFieldIsNull() {
            addCriterion("ITEM_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andItemFieldIsNotNull() {
            addCriterion("ITEM_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andItemFieldEqualTo(String value) {
            addCriterion("ITEM_FIELD =", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldNotEqualTo(String value) {
            addCriterion("ITEM_FIELD <>", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldGreaterThan(String value) {
            addCriterion("ITEM_FIELD >", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_FIELD >=", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldLessThan(String value) {
            addCriterion("ITEM_FIELD <", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldLessThanOrEqualTo(String value) {
            addCriterion("ITEM_FIELD <=", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldLike(String value) {
            addCriterion("ITEM_FIELD like", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldNotLike(String value) {
            addCriterion("ITEM_FIELD not like", value, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldIn(List<String> values) {
            addCriterion("ITEM_FIELD in", values, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldNotIn(List<String> values) {
            addCriterion("ITEM_FIELD not in", values, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldBetween(String value1, String value2) {
            addCriterion("ITEM_FIELD between", value1, value2, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemFieldNotBetween(String value1, String value2) {
            addCriterion("ITEM_FIELD not between", value1, value2, "itemField");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemRootIsNull() {
            addCriterion("ITEM_ROOT is null");
            return (Criteria) this;
        }

        public Criteria andItemRootIsNotNull() {
            addCriterion("ITEM_ROOT is not null");
            return (Criteria) this;
        }

        public Criteria andItemRootEqualTo(String value) {
            addCriterion("ITEM_ROOT =", value, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andItemRootNotEqualTo(String value) {
            addCriterion("ITEM_ROOT <>", value, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andItemRootGreaterThan(String value) {
            addCriterion("ITEM_ROOT >", value, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andItemRootGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_ROOT >=", value, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andItemRootLessThan(String value) {
            addCriterion("ITEM_ROOT <", value, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andItemRootLessThanOrEqualTo(String value) {
            addCriterion("ITEM_ROOT <=", value, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andItemRootLike(String value) {
            addCriterion("ITEM_ROOT like", value, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andItemRootNotLike(String value) {
            addCriterion("ITEM_ROOT not like", value, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andItemRootIn(List<String> values) {
            addCriterion("ITEM_ROOT in", values, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andItemRootNotIn(List<String> values) {
            addCriterion("ITEM_ROOT not in", values, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andItemRootBetween(String value1, String value2) {
            addCriterion("ITEM_ROOT between", value1, value2, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andItemRootNotBetween(String value1, String value2) {
            addCriterion("ITEM_ROOT not between", value1, value2, "itemRoot");
            return (Criteria) this;
        }

        public Criteria andLowValueIsNull() {
            addCriterion("LOW_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andLowValueIsNotNull() {
            addCriterion("LOW_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andLowValueEqualTo(BigDecimal value) {
            addCriterion("LOW_VALUE =", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueNotEqualTo(BigDecimal value) {
            addCriterion("LOW_VALUE <>", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueGreaterThan(BigDecimal value) {
            addCriterion("LOW_VALUE >", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOW_VALUE >=", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueLessThan(BigDecimal value) {
            addCriterion("LOW_VALUE <", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOW_VALUE <=", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueIn(List<BigDecimal> values) {
            addCriterion("LOW_VALUE in", values, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueNotIn(List<BigDecimal> values) {
            addCriterion("LOW_VALUE not in", values, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOW_VALUE between", value1, value2, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOW_VALUE not between", value1, value2, "lowValue");
            return (Criteria) this;
        }

        public Criteria andUppValueIsNull() {
            addCriterion("UPP_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andUppValueIsNotNull() {
            addCriterion("UPP_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andUppValueEqualTo(BigDecimal value) {
            addCriterion("UPP_VALUE =", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueNotEqualTo(BigDecimal value) {
            addCriterion("UPP_VALUE <>", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueGreaterThan(BigDecimal value) {
            addCriterion("UPP_VALUE >", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPP_VALUE >=", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueLessThan(BigDecimal value) {
            addCriterion("UPP_VALUE <", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPP_VALUE <=", value, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueIn(List<BigDecimal> values) {
            addCriterion("UPP_VALUE in", values, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueNotIn(List<BigDecimal> values) {
            addCriterion("UPP_VALUE not in", values, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPP_VALUE between", value1, value2, "uppValue");
            return (Criteria) this;
        }

        public Criteria andUppValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPP_VALUE not between", value1, value2, "uppValue");
            return (Criteria) this;
        }

        public Criteria andRiskColorIsNull() {
            addCriterion("RISK_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andRiskColorIsNotNull() {
            addCriterion("RISK_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andRiskColorEqualTo(String value) {
            addCriterion("RISK_COLOR =", value, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskColorNotEqualTo(String value) {
            addCriterion("RISK_COLOR <>", value, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskColorGreaterThan(String value) {
            addCriterion("RISK_COLOR >", value, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskColorGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_COLOR >=", value, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskColorLessThan(String value) {
            addCriterion("RISK_COLOR <", value, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskColorLessThanOrEqualTo(String value) {
            addCriterion("RISK_COLOR <=", value, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskColorLike(String value) {
            addCriterion("RISK_COLOR like", value, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskColorNotLike(String value) {
            addCriterion("RISK_COLOR not like", value, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskColorIn(List<String> values) {
            addCriterion("RISK_COLOR in", values, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskColorNotIn(List<String> values) {
            addCriterion("RISK_COLOR not in", values, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskColorBetween(String value1, String value2) {
            addCriterion("RISK_COLOR between", value1, value2, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskColorNotBetween(String value1, String value2) {
            addCriterion("RISK_COLOR not between", value1, value2, "riskColor");
            return (Criteria) this;
        }

        public Criteria andRiskDescIsNull() {
            addCriterion("RISK_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRiskDescIsNotNull() {
            addCriterion("RISK_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRiskDescEqualTo(String value) {
            addCriterion("RISK_DESC =", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotEqualTo(String value) {
            addCriterion("RISK_DESC <>", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescGreaterThan(String value) {
            addCriterion("RISK_DESC >", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_DESC >=", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescLessThan(String value) {
            addCriterion("RISK_DESC <", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescLessThanOrEqualTo(String value) {
            addCriterion("RISK_DESC <=", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescLike(String value) {
            addCriterion("RISK_DESC like", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotLike(String value) {
            addCriterion("RISK_DESC not like", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescIn(List<String> values) {
            addCriterion("RISK_DESC in", values, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotIn(List<String> values) {
            addCriterion("RISK_DESC not in", values, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescBetween(String value1, String value2) {
            addCriterion("RISK_DESC between", value1, value2, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotBetween(String value1, String value2) {
            addCriterion("RISK_DESC not between", value1, value2, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskSortIsNull() {
            addCriterion("RISK_SORT is null");
            return (Criteria) this;
        }

        public Criteria andRiskSortIsNotNull() {
            addCriterion("RISK_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andRiskSortEqualTo(Integer value) {
            addCriterion("RISK_SORT =", value, "riskSort");
            return (Criteria) this;
        }

        public Criteria andRiskSortNotEqualTo(Integer value) {
            addCriterion("RISK_SORT <>", value, "riskSort");
            return (Criteria) this;
        }

        public Criteria andRiskSortGreaterThan(Integer value) {
            addCriterion("RISK_SORT >", value, "riskSort");
            return (Criteria) this;
        }

        public Criteria andRiskSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("RISK_SORT >=", value, "riskSort");
            return (Criteria) this;
        }

        public Criteria andRiskSortLessThan(Integer value) {
            addCriterion("RISK_SORT <", value, "riskSort");
            return (Criteria) this;
        }

        public Criteria andRiskSortLessThanOrEqualTo(Integer value) {
            addCriterion("RISK_SORT <=", value, "riskSort");
            return (Criteria) this;
        }

        public Criteria andRiskSortIn(List<Integer> values) {
            addCriterion("RISK_SORT in", values, "riskSort");
            return (Criteria) this;
        }

        public Criteria andRiskSortNotIn(List<Integer> values) {
            addCriterion("RISK_SORT not in", values, "riskSort");
            return (Criteria) this;
        }

        public Criteria andRiskSortBetween(Integer value1, Integer value2) {
            addCriterion("RISK_SORT between", value1, value2, "riskSort");
            return (Criteria) this;
        }

        public Criteria andRiskSortNotBetween(Integer value1, Integer value2) {
            addCriterion("RISK_SORT not between", value1, value2, "riskSort");
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