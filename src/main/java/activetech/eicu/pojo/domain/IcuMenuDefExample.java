package activetech.eicu.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class IcuMenuDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcuMenuDefExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("MENU_ID like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("MENU_ID not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuStatIsNull() {
            addCriterion("MENU_STAT is null");
            return (Criteria) this;
        }

        public Criteria andMenuStatIsNotNull() {
            addCriterion("MENU_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andMenuStatEqualTo(String value) {
            addCriterion("MENU_STAT =", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatNotEqualTo(String value) {
            addCriterion("MENU_STAT <>", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatGreaterThan(String value) {
            addCriterion("MENU_STAT >", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_STAT >=", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatLessThan(String value) {
            addCriterion("MENU_STAT <", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatLessThanOrEqualTo(String value) {
            addCriterion("MENU_STAT <=", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatLike(String value) {
            addCriterion("MENU_STAT like", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatNotLike(String value) {
            addCriterion("MENU_STAT not like", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatIn(List<String> values) {
            addCriterion("MENU_STAT in", values, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatNotIn(List<String> values) {
            addCriterion("MENU_STAT not in", values, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatBetween(String value1, String value2) {
            addCriterion("MENU_STAT between", value1, value2, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatNotBetween(String value1, String value2) {
            addCriterion("MENU_STAT not between", value1, value2, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("MENU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("MENU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("MENU_TYPE =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("MENU_TYPE <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("MENU_TYPE >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("MENU_TYPE <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("MENU_TYPE like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("MENU_TYPE not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("MENU_TYPE in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("MENU_TYPE not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("MENU_TYPE between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("MENU_TYPE not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andOvFlagIsNull() {
            addCriterion("OV_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOvFlagIsNotNull() {
            addCriterion("OV_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOvFlagEqualTo(String value) {
            addCriterion("OV_FLAG =", value, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andOvFlagNotEqualTo(String value) {
            addCriterion("OV_FLAG <>", value, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andOvFlagGreaterThan(String value) {
            addCriterion("OV_FLAG >", value, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andOvFlagGreaterThanOrEqualTo(String value) {
            addCriterion("OV_FLAG >=", value, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andOvFlagLessThan(String value) {
            addCriterion("OV_FLAG <", value, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andOvFlagLessThanOrEqualTo(String value) {
            addCriterion("OV_FLAG <=", value, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andOvFlagLike(String value) {
            addCriterion("OV_FLAG like", value, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andOvFlagNotLike(String value) {
            addCriterion("OV_FLAG not like", value, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andOvFlagIn(List<String> values) {
            addCriterion("OV_FLAG in", values, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andOvFlagNotIn(List<String> values) {
            addCriterion("OV_FLAG not in", values, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andOvFlagBetween(String value1, String value2) {
            addCriterion("OV_FLAG between", value1, value2, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andOvFlagNotBetween(String value1, String value2) {
            addCriterion("OV_FLAG not between", value1, value2, "ovFlag");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNull() {
            addCriterion("MENU_URL is null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNotNull() {
            addCriterion("MENU_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("MENU_URL =", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("MENU_URL <>", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("MENU_URL >", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_URL >=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("MENU_URL <", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("MENU_URL <=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLike(String value) {
            addCriterion("MENU_URL like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("MENU_URL not like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("MENU_URL in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("MENU_URL not in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("MENU_URL between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("MENU_URL not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuRootIsNull() {
            addCriterion("MENU_ROOT is null");
            return (Criteria) this;
        }

        public Criteria andMenuRootIsNotNull() {
            addCriterion("MENU_ROOT is not null");
            return (Criteria) this;
        }

        public Criteria andMenuRootEqualTo(String value) {
            addCriterion("MENU_ROOT =", value, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuRootNotEqualTo(String value) {
            addCriterion("MENU_ROOT <>", value, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuRootGreaterThan(String value) {
            addCriterion("MENU_ROOT >", value, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuRootGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ROOT >=", value, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuRootLessThan(String value) {
            addCriterion("MENU_ROOT <", value, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuRootLessThanOrEqualTo(String value) {
            addCriterion("MENU_ROOT <=", value, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuRootLike(String value) {
            addCriterion("MENU_ROOT like", value, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuRootNotLike(String value) {
            addCriterion("MENU_ROOT not like", value, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuRootIn(List<String> values) {
            addCriterion("MENU_ROOT in", values, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuRootNotIn(List<String> values) {
            addCriterion("MENU_ROOT not in", values, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuRootBetween(String value1, String value2) {
            addCriterion("MENU_ROOT between", value1, value2, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuRootNotBetween(String value1, String value2) {
            addCriterion("MENU_ROOT not between", value1, value2, "menuRoot");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNull() {
            addCriterion("MENU_SORT is null");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNotNull() {
            addCriterion("MENU_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSortEqualTo(Integer value) {
            addCriterion("MENU_SORT =", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotEqualTo(Integer value) {
            addCriterion("MENU_SORT <>", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThan(Integer value) {
            addCriterion("MENU_SORT >", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_SORT >=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThan(Integer value) {
            addCriterion("MENU_SORT <", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_SORT <=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortIn(List<Integer> values) {
            addCriterion("MENU_SORT in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotIn(List<Integer> values) {
            addCriterion("MENU_SORT not in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortBetween(Integer value1, Integer value2) {
            addCriterion("MENU_SORT between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_SORT not between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuKindIsNull() {
            addCriterion("MENU_KIND is null");
            return (Criteria) this;
        }

        public Criteria andMenuKindIsNotNull() {
            addCriterion("MENU_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andMenuKindEqualTo(String value) {
            addCriterion("MENU_KIND =", value, "menuKind");
            return (Criteria) this;
        }

        public Criteria andMenuKindNotEqualTo(String value) {
            addCriterion("MENU_KIND <>", value, "menuKind");
            return (Criteria) this;
        }

        public Criteria andMenuKindGreaterThan(String value) {
            addCriterion("MENU_KIND >", value, "menuKind");
            return (Criteria) this;
        }

        public Criteria andMenuKindGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_KIND >=", value, "menuKind");
            return (Criteria) this;
        }

        public Criteria andMenuKindLessThan(String value) {
            addCriterion("MENU_KIND <", value, "menuKind");
            return (Criteria) this;
        }

        public Criteria andMenuKindLessThanOrEqualTo(String value) {
            addCriterion("MENU_KIND <=", value, "menuKind");
            return (Criteria) this;
        }

        public Criteria andMenuKindLike(String value) {
            addCriterion("MENU_KIND like", value, "menuKind");
            return (Criteria) this;
        }

        public Criteria andMenuKindNotLike(String value) {
            addCriterion("MENU_KIND not like", value, "menuKind");
            return (Criteria) this;
        }

        public Criteria andMenuKindIn(List<String> values) {
            addCriterion("MENU_KIND in", values, "menuKind");
            return (Criteria) this;
        }

        public Criteria andMenuKindNotIn(List<String> values) {
            addCriterion("MENU_KIND not in", values, "menuKind");
            return (Criteria) this;
        }

        public Criteria andMenuKindBetween(String value1, String value2) {
            addCriterion("MENU_KIND between", value1, value2, "menuKind");
            return (Criteria) this;
        }

        public Criteria andMenuKindNotBetween(String value1, String value2) {
            addCriterion("MENU_KIND not between", value1, value2, "menuKind");
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