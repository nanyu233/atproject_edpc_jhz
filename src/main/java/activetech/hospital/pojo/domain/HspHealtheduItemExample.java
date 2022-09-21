package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspHealtheduItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspHealtheduItemExample() {
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

        public Criteria andItemnoIsNull() {
            addCriterion("ITEMNO is null");
            return (Criteria) this;
        }

        public Criteria andItemnoIsNotNull() {
            addCriterion("ITEMNO is not null");
            return (Criteria) this;
        }

        public Criteria andItemnoEqualTo(String value) {
            addCriterion("ITEMNO =", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotEqualTo(String value) {
            addCriterion("ITEMNO <>", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoGreaterThan(String value) {
            addCriterion("ITEMNO >", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMNO >=", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLessThan(String value) {
            addCriterion("ITEMNO <", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLessThanOrEqualTo(String value) {
            addCriterion("ITEMNO <=", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLike(String value) {
            addCriterion("ITEMNO like", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotLike(String value) {
            addCriterion("ITEMNO not like", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoIn(List<String> values) {
            addCriterion("ITEMNO in", values, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotIn(List<String> values) {
            addCriterion("ITEMNO not in", values, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoBetween(String value1, String value2) {
            addCriterion("ITEMNO between", value1, value2, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotBetween(String value1, String value2) {
            addCriterion("ITEMNO not between", value1, value2, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemNamIsNull() {
            addCriterion("ITEM_NAM is null");
            return (Criteria) this;
        }

        public Criteria andItemNamIsNotNull() {
            addCriterion("ITEM_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andItemNamEqualTo(String value) {
            addCriterion("ITEM_NAM =", value, "itemNam");
            return (Criteria) this;
        }

        public Criteria andItemNamNotEqualTo(String value) {
            addCriterion("ITEM_NAM <>", value, "itemNam");
            return (Criteria) this;
        }

        public Criteria andItemNamGreaterThan(String value) {
            addCriterion("ITEM_NAM >", value, "itemNam");
            return (Criteria) this;
        }

        public Criteria andItemNamGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAM >=", value, "itemNam");
            return (Criteria) this;
        }

        public Criteria andItemNamLessThan(String value) {
            addCriterion("ITEM_NAM <", value, "itemNam");
            return (Criteria) this;
        }

        public Criteria andItemNamLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAM <=", value, "itemNam");
            return (Criteria) this;
        }

        public Criteria andItemNamLike(String value) {
            addCriterion("ITEM_NAM like", value, "itemNam");
            return (Criteria) this;
        }

        public Criteria andItemNamNotLike(String value) {
            addCriterion("ITEM_NAM not like", value, "itemNam");
            return (Criteria) this;
        }

        public Criteria andItemNamIn(List<String> values) {
            addCriterion("ITEM_NAM in", values, "itemNam");
            return (Criteria) this;
        }

        public Criteria andItemNamNotIn(List<String> values) {
            addCriterion("ITEM_NAM not in", values, "itemNam");
            return (Criteria) this;
        }

        public Criteria andItemNamBetween(String value1, String value2) {
            addCriterion("ITEM_NAM between", value1, value2, "itemNam");
            return (Criteria) this;
        }

        public Criteria andItemNamNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAM not between", value1, value2, "itemNam");
            return (Criteria) this;
        }

        public Criteria andParentnoIsNull() {
            addCriterion("PARENTNO is null");
            return (Criteria) this;
        }

        public Criteria andParentnoIsNotNull() {
            addCriterion("PARENTNO is not null");
            return (Criteria) this;
        }

        public Criteria andParentnoEqualTo(String value) {
            addCriterion("PARENTNO =", value, "parentno");
            return (Criteria) this;
        }

        public Criteria andParentnoNotEqualTo(String value) {
            addCriterion("PARENTNO <>", value, "parentno");
            return (Criteria) this;
        }

        public Criteria andParentnoGreaterThan(String value) {
            addCriterion("PARENTNO >", value, "parentno");
            return (Criteria) this;
        }

        public Criteria andParentnoGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTNO >=", value, "parentno");
            return (Criteria) this;
        }

        public Criteria andParentnoLessThan(String value) {
            addCriterion("PARENTNO <", value, "parentno");
            return (Criteria) this;
        }

        public Criteria andParentnoLessThanOrEqualTo(String value) {
            addCriterion("PARENTNO <=", value, "parentno");
            return (Criteria) this;
        }

        public Criteria andParentnoLike(String value) {
            addCriterion("PARENTNO like", value, "parentno");
            return (Criteria) this;
        }

        public Criteria andParentnoNotLike(String value) {
            addCriterion("PARENTNO not like", value, "parentno");
            return (Criteria) this;
        }

        public Criteria andParentnoIn(List<String> values) {
            addCriterion("PARENTNO in", values, "parentno");
            return (Criteria) this;
        }

        public Criteria andParentnoNotIn(List<String> values) {
            addCriterion("PARENTNO not in", values, "parentno");
            return (Criteria) this;
        }

        public Criteria andParentnoBetween(String value1, String value2) {
            addCriterion("PARENTNO between", value1, value2, "parentno");
            return (Criteria) this;
        }

        public Criteria andParentnoNotBetween(String value1, String value2) {
            addCriterion("PARENTNO not between", value1, value2, "parentno");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNull() {
            addCriterion("ISENABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNotNull() {
            addCriterion("ISENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsenableEqualTo(String value) {
            addCriterion("ISENABLE =", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotEqualTo(String value) {
            addCriterion("ISENABLE <>", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThan(String value) {
            addCriterion("ISENABLE >", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThanOrEqualTo(String value) {
            addCriterion("ISENABLE >=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThan(String value) {
            addCriterion("ISENABLE <", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThanOrEqualTo(String value) {
            addCriterion("ISENABLE <=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLike(String value) {
            addCriterion("ISENABLE like", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotLike(String value) {
            addCriterion("ISENABLE not like", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableIn(List<String> values) {
            addCriterion("ISENABLE in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotIn(List<String> values) {
            addCriterion("ISENABLE not in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableBetween(String value1, String value2) {
            addCriterion("ISENABLE between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotBetween(String value1, String value2) {
            addCriterion("ISENABLE not between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andSpellcodeIsNull() {
            addCriterion("SPELLCODE is null");
            return (Criteria) this;
        }

        public Criteria andSpellcodeIsNotNull() {
            addCriterion("SPELLCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSpellcodeEqualTo(String value) {
            addCriterion("SPELLCODE =", value, "spellcode");
            return (Criteria) this;
        }

        public Criteria andSpellcodeNotEqualTo(String value) {
            addCriterion("SPELLCODE <>", value, "spellcode");
            return (Criteria) this;
        }

        public Criteria andSpellcodeGreaterThan(String value) {
            addCriterion("SPELLCODE >", value, "spellcode");
            return (Criteria) this;
        }

        public Criteria andSpellcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SPELLCODE >=", value, "spellcode");
            return (Criteria) this;
        }

        public Criteria andSpellcodeLessThan(String value) {
            addCriterion("SPELLCODE <", value, "spellcode");
            return (Criteria) this;
        }

        public Criteria andSpellcodeLessThanOrEqualTo(String value) {
            addCriterion("SPELLCODE <=", value, "spellcode");
            return (Criteria) this;
        }

        public Criteria andSpellcodeLike(String value) {
            addCriterion("SPELLCODE like", value, "spellcode");
            return (Criteria) this;
        }

        public Criteria andSpellcodeNotLike(String value) {
            addCriterion("SPELLCODE not like", value, "spellcode");
            return (Criteria) this;
        }

        public Criteria andSpellcodeIn(List<String> values) {
            addCriterion("SPELLCODE in", values, "spellcode");
            return (Criteria) this;
        }

        public Criteria andSpellcodeNotIn(List<String> values) {
            addCriterion("SPELLCODE not in", values, "spellcode");
            return (Criteria) this;
        }

        public Criteria andSpellcodeBetween(String value1, String value2) {
            addCriterion("SPELLCODE between", value1, value2, "spellcode");
            return (Criteria) this;
        }

        public Criteria andSpellcodeNotBetween(String value1, String value2) {
            addCriterion("SPELLCODE not between", value1, value2, "spellcode");
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