package activetech.edpc.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspBodyPartsInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspBodyPartsInfExample() {
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

        public Criteria andPartSeqIsNull() {
            addCriterion("PART_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPartSeqIsNotNull() {
            addCriterion("PART_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPartSeqEqualTo(String value) {
            addCriterion("PART_SEQ =", value, "partSeq");
            return (Criteria) this;
        }

        public Criteria andPartSeqNotEqualTo(String value) {
            addCriterion("PART_SEQ <>", value, "partSeq");
            return (Criteria) this;
        }

        public Criteria andPartSeqGreaterThan(String value) {
            addCriterion("PART_SEQ >", value, "partSeq");
            return (Criteria) this;
        }

        public Criteria andPartSeqGreaterThanOrEqualTo(String value) {
            addCriterion("PART_SEQ >=", value, "partSeq");
            return (Criteria) this;
        }

        public Criteria andPartSeqLessThan(String value) {
            addCriterion("PART_SEQ <", value, "partSeq");
            return (Criteria) this;
        }

        public Criteria andPartSeqLessThanOrEqualTo(String value) {
            addCriterion("PART_SEQ <=", value, "partSeq");
            return (Criteria) this;
        }

        public Criteria andPartSeqLike(String value) {
            addCriterion("PART_SEQ like", value, "partSeq");
            return (Criteria) this;
        }

        public Criteria andPartSeqNotLike(String value) {
            addCriterion("PART_SEQ not like", value, "partSeq");
            return (Criteria) this;
        }

        public Criteria andPartSeqIn(List<String> values) {
            addCriterion("PART_SEQ in", values, "partSeq");
            return (Criteria) this;
        }

        public Criteria andPartSeqNotIn(List<String> values) {
            addCriterion("PART_SEQ not in", values, "partSeq");
            return (Criteria) this;
        }

        public Criteria andPartSeqBetween(String value1, String value2) {
            addCriterion("PART_SEQ between", value1, value2, "partSeq");
            return (Criteria) this;
        }

        public Criteria andPartSeqNotBetween(String value1, String value2) {
            addCriterion("PART_SEQ not between", value1, value2, "partSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqIsNull() {
            addCriterion("EMG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqIsNotNull() {
            addCriterion("EMG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqEqualTo(String value) {
            addCriterion("EMG_SEQ =", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotEqualTo(String value) {
            addCriterion("EMG_SEQ <>", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqGreaterThan(String value) {
            addCriterion("EMG_SEQ >", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ >=", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqLessThan(String value) {
            addCriterion("EMG_SEQ <", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqLessThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ <=", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqLike(String value) {
            addCriterion("EMG_SEQ like", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotLike(String value) {
            addCriterion("EMG_SEQ not like", value, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqIn(List<String> values) {
            addCriterion("EMG_SEQ in", values, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotIn(List<String> values) {
            addCriterion("EMG_SEQ not in", values, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqBetween(String value1, String value2) {
            addCriterion("EMG_SEQ between", value1, value2, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqNotBetween(String value1, String value2) {
            addCriterion("EMG_SEQ not between", value1, value2, "emgSeq");
            return (Criteria) this;
        }

        public Criteria andClickAxisXIsNull() {
            addCriterion("CLICK_AXIS_X is null");
            return (Criteria) this;
        }

        public Criteria andClickAxisXIsNotNull() {
            addCriterion("CLICK_AXIS_X is not null");
            return (Criteria) this;
        }

        public Criteria andClickAxisXEqualTo(BigDecimal value) {
            addCriterion("CLICK_AXIS_X =", value, "clickAxisX");
            return (Criteria) this;
        }

        public Criteria andClickAxisXNotEqualTo(BigDecimal value) {
            addCriterion("CLICK_AXIS_X <>", value, "clickAxisX");
            return (Criteria) this;
        }

        public Criteria andClickAxisXGreaterThan(BigDecimal value) {
            addCriterion("CLICK_AXIS_X >", value, "clickAxisX");
            return (Criteria) this;
        }

        public Criteria andClickAxisXGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLICK_AXIS_X >=", value, "clickAxisX");
            return (Criteria) this;
        }

        public Criteria andClickAxisXLessThan(BigDecimal value) {
            addCriterion("CLICK_AXIS_X <", value, "clickAxisX");
            return (Criteria) this;
        }

        public Criteria andClickAxisXLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLICK_AXIS_X <=", value, "clickAxisX");
            return (Criteria) this;
        }

        public Criteria andClickAxisXIn(List<BigDecimal> values) {
            addCriterion("CLICK_AXIS_X in", values, "clickAxisX");
            return (Criteria) this;
        }

        public Criteria andClickAxisXNotIn(List<BigDecimal> values) {
            addCriterion("CLICK_AXIS_X not in", values, "clickAxisX");
            return (Criteria) this;
        }

        public Criteria andClickAxisXBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLICK_AXIS_X between", value1, value2, "clickAxisX");
            return (Criteria) this;
        }

        public Criteria andClickAxisXNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLICK_AXIS_X not between", value1, value2, "clickAxisX");
            return (Criteria) this;
        }

        public Criteria andClickAxisYIsNull() {
            addCriterion("CLICK_AXIS_Y is null");
            return (Criteria) this;
        }

        public Criteria andClickAxisYIsNotNull() {
            addCriterion("CLICK_AXIS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andClickAxisYEqualTo(BigDecimal value) {
            addCriterion("CLICK_AXIS_Y =", value, "clickAxisY");
            return (Criteria) this;
        }

        public Criteria andClickAxisYNotEqualTo(BigDecimal value) {
            addCriterion("CLICK_AXIS_Y <>", value, "clickAxisY");
            return (Criteria) this;
        }

        public Criteria andClickAxisYGreaterThan(BigDecimal value) {
            addCriterion("CLICK_AXIS_Y >", value, "clickAxisY");
            return (Criteria) this;
        }

        public Criteria andClickAxisYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLICK_AXIS_Y >=", value, "clickAxisY");
            return (Criteria) this;
        }

        public Criteria andClickAxisYLessThan(BigDecimal value) {
            addCriterion("CLICK_AXIS_Y <", value, "clickAxisY");
            return (Criteria) this;
        }

        public Criteria andClickAxisYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLICK_AXIS_Y <=", value, "clickAxisY");
            return (Criteria) this;
        }

        public Criteria andClickAxisYIn(List<BigDecimal> values) {
            addCriterion("CLICK_AXIS_Y in", values, "clickAxisY");
            return (Criteria) this;
        }

        public Criteria andClickAxisYNotIn(List<BigDecimal> values) {
            addCriterion("CLICK_AXIS_Y not in", values, "clickAxisY");
            return (Criteria) this;
        }

        public Criteria andClickAxisYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLICK_AXIS_Y between", value1, value2, "clickAxisY");
            return (Criteria) this;
        }

        public Criteria andClickAxisYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLICK_AXIS_Y not between", value1, value2, "clickAxisY");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNull() {
            addCriterion("PART_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNotNull() {
            addCriterion("PART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartIdEqualTo(String value) {
            addCriterion("PART_ID =", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotEqualTo(String value) {
            addCriterion("PART_ID <>", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThan(String value) {
            addCriterion("PART_ID >", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThanOrEqualTo(String value) {
            addCriterion("PART_ID >=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThan(String value) {
            addCriterion("PART_ID <", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThanOrEqualTo(String value) {
            addCriterion("PART_ID <=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLike(String value) {
            addCriterion("PART_ID like", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotLike(String value) {
            addCriterion("PART_ID not like", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdIn(List<String> values) {
            addCriterion("PART_ID in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotIn(List<String> values) {
            addCriterion("PART_ID not in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdBetween(String value1, String value2) {
            addCriterion("PART_ID between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotBetween(String value1, String value2) {
            addCriterion("PART_ID not between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("CRT_TIME =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("CRT_TIME <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("CRT_TIME >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("CRT_TIME <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("CRT_TIME in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("CRT_TIME not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNull() {
            addCriterion("CRT_USER is null");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNotNull() {
            addCriterion("CRT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUserEqualTo(String value) {
            addCriterion("CRT_USER =", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotEqualTo(String value) {
            addCriterion("CRT_USER <>", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThan(String value) {
            addCriterion("CRT_USER >", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USER >=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThan(String value) {
            addCriterion("CRT_USER <", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThanOrEqualTo(String value) {
            addCriterion("CRT_USER <=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLike(String value) {
            addCriterion("CRT_USER like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotLike(String value) {
            addCriterion("CRT_USER not like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserIn(List<String> values) {
            addCriterion("CRT_USER in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotIn(List<String> values) {
            addCriterion("CRT_USER not in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserBetween(String value1, String value2) {
            addCriterion("CRT_USER between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotBetween(String value1, String value2) {
            addCriterion("CRT_USER not between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("MOD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("MOD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("MOD_TIME =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("MOD_TIME <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("MOD_TIME >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("MOD_TIME <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("MOD_TIME in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("MOD_TIME not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModUserIsNull() {
            addCriterion("MOD_USER is null");
            return (Criteria) this;
        }

        public Criteria andModUserIsNotNull() {
            addCriterion("MOD_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModUserEqualTo(String value) {
            addCriterion("MOD_USER =", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotEqualTo(String value) {
            addCriterion("MOD_USER <>", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserGreaterThan(String value) {
            addCriterion("MOD_USER >", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USER >=", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLessThan(String value) {
            addCriterion("MOD_USER <", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLessThanOrEqualTo(String value) {
            addCriterion("MOD_USER <=", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLike(String value) {
            addCriterion("MOD_USER like", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotLike(String value) {
            addCriterion("MOD_USER not like", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserIn(List<String> values) {
            addCriterion("MOD_USER in", values, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotIn(List<String> values) {
            addCriterion("MOD_USER not in", values, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserBetween(String value1, String value2) {
            addCriterion("MOD_USER between", value1, value2, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotBetween(String value1, String value2) {
            addCriterion("MOD_USER not between", value1, value2, "modUser");
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