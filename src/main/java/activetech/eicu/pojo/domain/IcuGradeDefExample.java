package activetech.eicu.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IcuGradeDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcuGradeDefExample() {
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

        public Criteria andItemFlagIsNull() {
            addCriterion("ITEM_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andItemFlagIsNotNull() {
            addCriterion("ITEM_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andItemFlagEqualTo(String value) {
            addCriterion("ITEM_FLAG =", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagNotEqualTo(String value) {
            addCriterion("ITEM_FLAG <>", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagGreaterThan(String value) {
            addCriterion("ITEM_FLAG >", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_FLAG >=", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagLessThan(String value) {
            addCriterion("ITEM_FLAG <", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagLessThanOrEqualTo(String value) {
            addCriterion("ITEM_FLAG <=", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagLike(String value) {
            addCriterion("ITEM_FLAG like", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagNotLike(String value) {
            addCriterion("ITEM_FLAG not like", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagIn(List<String> values) {
            addCriterion("ITEM_FLAG in", values, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagNotIn(List<String> values) {
            addCriterion("ITEM_FLAG not in", values, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagBetween(String value1, String value2) {
            addCriterion("ITEM_FLAG between", value1, value2, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagNotBetween(String value1, String value2) {
            addCriterion("ITEM_FLAG not between", value1, value2, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemGroupIsNull() {
            addCriterion("ITEM_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andItemGroupIsNotNull() {
            addCriterion("ITEM_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andItemGroupEqualTo(String value) {
            addCriterion("ITEM_GROUP =", value, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andItemGroupNotEqualTo(String value) {
            addCriterion("ITEM_GROUP <>", value, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andItemGroupGreaterThan(String value) {
            addCriterion("ITEM_GROUP >", value, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andItemGroupGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_GROUP >=", value, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andItemGroupLessThan(String value) {
            addCriterion("ITEM_GROUP <", value, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andItemGroupLessThanOrEqualTo(String value) {
            addCriterion("ITEM_GROUP <=", value, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andItemGroupLike(String value) {
            addCriterion("ITEM_GROUP like", value, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andItemGroupNotLike(String value) {
            addCriterion("ITEM_GROUP not like", value, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andItemGroupIn(List<String> values) {
            addCriterion("ITEM_GROUP in", values, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andItemGroupNotIn(List<String> values) {
            addCriterion("ITEM_GROUP not in", values, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andItemGroupBetween(String value1, String value2) {
            addCriterion("ITEM_GROUP between", value1, value2, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andItemGroupNotBetween(String value1, String value2) {
            addCriterion("ITEM_GROUP not between", value1, value2, "itemGroup");
            return (Criteria) this;
        }

        public Criteria andScoreMemoIsNull() {
            addCriterion("SCORE_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andScoreMemoIsNotNull() {
            addCriterion("SCORE_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andScoreMemoEqualTo(String value) {
            addCriterion("SCORE_MEMO =", value, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreMemoNotEqualTo(String value) {
            addCriterion("SCORE_MEMO <>", value, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreMemoGreaterThan(String value) {
            addCriterion("SCORE_MEMO >", value, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreMemoGreaterThanOrEqualTo(String value) {
            addCriterion("SCORE_MEMO >=", value, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreMemoLessThan(String value) {
            addCriterion("SCORE_MEMO <", value, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreMemoLessThanOrEqualTo(String value) {
            addCriterion("SCORE_MEMO <=", value, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreMemoLike(String value) {
            addCriterion("SCORE_MEMO like", value, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreMemoNotLike(String value) {
            addCriterion("SCORE_MEMO not like", value, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreMemoIn(List<String> values) {
            addCriterion("SCORE_MEMO in", values, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreMemoNotIn(List<String> values) {
            addCriterion("SCORE_MEMO not in", values, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreMemoBetween(String value1, String value2) {
            addCriterion("SCORE_MEMO between", value1, value2, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreMemoNotBetween(String value1, String value2) {
            addCriterion("SCORE_MEMO not between", value1, value2, "scoreMemo");
            return (Criteria) this;
        }

        public Criteria andScoreValueIsNull() {
            addCriterion("SCORE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andScoreValueIsNotNull() {
            addCriterion("SCORE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreValueEqualTo(String value) {
            addCriterion("SCORE_VALUE =", value, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreValueNotEqualTo(String value) {
            addCriterion("SCORE_VALUE <>", value, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreValueGreaterThan(String value) {
            addCriterion("SCORE_VALUE >", value, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreValueGreaterThanOrEqualTo(String value) {
            addCriterion("SCORE_VALUE >=", value, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreValueLessThan(String value) {
            addCriterion("SCORE_VALUE <", value, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreValueLessThanOrEqualTo(String value) {
            addCriterion("SCORE_VALUE <=", value, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreValueLike(String value) {
            addCriterion("SCORE_VALUE like", value, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreValueNotLike(String value) {
            addCriterion("SCORE_VALUE not like", value, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreValueIn(List<String> values) {
            addCriterion("SCORE_VALUE in", values, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreValueNotIn(List<String> values) {
            addCriterion("SCORE_VALUE not in", values, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreValueBetween(String value1, String value2) {
            addCriterion("SCORE_VALUE between", value1, value2, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreValueNotBetween(String value1, String value2) {
            addCriterion("SCORE_VALUE not between", value1, value2, "scoreValue");
            return (Criteria) this;
        }

        public Criteria andScoreColIsNull() {
            addCriterion("SCORE_COL is null");
            return (Criteria) this;
        }

        public Criteria andScoreColIsNotNull() {
            addCriterion("SCORE_COL is not null");
            return (Criteria) this;
        }

        public Criteria andScoreColEqualTo(Integer value) {
            addCriterion("SCORE_COL =", value, "scoreCol");
            return (Criteria) this;
        }

        public Criteria andScoreColNotEqualTo(Integer value) {
            addCriterion("SCORE_COL <>", value, "scoreCol");
            return (Criteria) this;
        }

        public Criteria andScoreColGreaterThan(Integer value) {
            addCriterion("SCORE_COL >", value, "scoreCol");
            return (Criteria) this;
        }

        public Criteria andScoreColGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE_COL >=", value, "scoreCol");
            return (Criteria) this;
        }

        public Criteria andScoreColLessThan(Integer value) {
            addCriterion("SCORE_COL <", value, "scoreCol");
            return (Criteria) this;
        }

        public Criteria andScoreColLessThanOrEqualTo(Integer value) {
            addCriterion("SCORE_COL <=", value, "scoreCol");
            return (Criteria) this;
        }

        public Criteria andScoreColIn(List<Integer> values) {
            addCriterion("SCORE_COL in", values, "scoreCol");
            return (Criteria) this;
        }

        public Criteria andScoreColNotIn(List<Integer> values) {
            addCriterion("SCORE_COL not in", values, "scoreCol");
            return (Criteria) this;
        }

        public Criteria andScoreColBetween(Integer value1, Integer value2) {
            addCriterion("SCORE_COL between", value1, value2, "scoreCol");
            return (Criteria) this;
        }

        public Criteria andScoreColNotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE_COL not between", value1, value2, "scoreCol");
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

        public Criteria andLmtValueIsNull() {
            addCriterion("LMT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andLmtValueIsNotNull() {
            addCriterion("LMT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andLmtValueEqualTo(BigDecimal value) {
            addCriterion("LMT_VALUE =", value, "lmtValue");
            return (Criteria) this;
        }

        public Criteria andLmtValueNotEqualTo(BigDecimal value) {
            addCriterion("LMT_VALUE <>", value, "lmtValue");
            return (Criteria) this;
        }

        public Criteria andLmtValueGreaterThan(BigDecimal value) {
            addCriterion("LMT_VALUE >", value, "lmtValue");
            return (Criteria) this;
        }

        public Criteria andLmtValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMT_VALUE >=", value, "lmtValue");
            return (Criteria) this;
        }

        public Criteria andLmtValueLessThan(BigDecimal value) {
            addCriterion("LMT_VALUE <", value, "lmtValue");
            return (Criteria) this;
        }

        public Criteria andLmtValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMT_VALUE <=", value, "lmtValue");
            return (Criteria) this;
        }

        public Criteria andLmtValueIn(List<BigDecimal> values) {
            addCriterion("LMT_VALUE in", values, "lmtValue");
            return (Criteria) this;
        }

        public Criteria andLmtValueNotIn(List<BigDecimal> values) {
            addCriterion("LMT_VALUE not in", values, "lmtValue");
            return (Criteria) this;
        }

        public Criteria andLmtValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMT_VALUE between", value1, value2, "lmtValue");
            return (Criteria) this;
        }

        public Criteria andLmtValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMT_VALUE not between", value1, value2, "lmtValue");
            return (Criteria) this;
        }

        public Criteria andItemUnitIsNull() {
            addCriterion("ITEM_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andItemUnitIsNotNull() {
            addCriterion("ITEM_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andItemUnitEqualTo(String value) {
            addCriterion("ITEM_UNIT =", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotEqualTo(String value) {
            addCriterion("ITEM_UNIT <>", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitGreaterThan(String value) {
            addCriterion("ITEM_UNIT >", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_UNIT >=", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLessThan(String value) {
            addCriterion("ITEM_UNIT <", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLessThanOrEqualTo(String value) {
            addCriterion("ITEM_UNIT <=", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLike(String value) {
            addCriterion("ITEM_UNIT like", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotLike(String value) {
            addCriterion("ITEM_UNIT not like", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitIn(List<String> values) {
            addCriterion("ITEM_UNIT in", values, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotIn(List<String> values) {
            addCriterion("ITEM_UNIT not in", values, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitBetween(String value1, String value2) {
            addCriterion("ITEM_UNIT between", value1, value2, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotBetween(String value1, String value2) {
            addCriterion("ITEM_UNIT not between", value1, value2, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemSortIsNull() {
            addCriterion("ITEM_SORT is null");
            return (Criteria) this;
        }

        public Criteria andItemSortIsNotNull() {
            addCriterion("ITEM_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andItemSortEqualTo(Integer value) {
            addCriterion("ITEM_SORT =", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortNotEqualTo(Integer value) {
            addCriterion("ITEM_SORT <>", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortGreaterThan(Integer value) {
            addCriterion("ITEM_SORT >", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_SORT >=", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortLessThan(Integer value) {
            addCriterion("ITEM_SORT <", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortLessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_SORT <=", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortIn(List<Integer> values) {
            addCriterion("ITEM_SORT in", values, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortNotIn(List<Integer> values) {
            addCriterion("ITEM_SORT not in", values, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_SORT between", value1, value2, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_SORT not between", value1, value2, "itemSort");
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