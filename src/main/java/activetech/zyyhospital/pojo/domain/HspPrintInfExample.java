package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspPrintInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspPrintInfExample() {
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

        public Criteria andPrintIdIsNull() {
            addCriterion("PRINT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrintIdIsNotNull() {
            addCriterion("PRINT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrintIdEqualTo(String value) {
            addCriterion("PRINT_ID =", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdNotEqualTo(String value) {
            addCriterion("PRINT_ID <>", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdGreaterThan(String value) {
            addCriterion("PRINT_ID >", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRINT_ID >=", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdLessThan(String value) {
            addCriterion("PRINT_ID <", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdLessThanOrEqualTo(String value) {
            addCriterion("PRINT_ID <=", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdLike(String value) {
            addCriterion("PRINT_ID like", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdNotLike(String value) {
            addCriterion("PRINT_ID not like", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdIn(List<String> values) {
            addCriterion("PRINT_ID in", values, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdNotIn(List<String> values) {
            addCriterion("PRINT_ID not in", values, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdBetween(String value1, String value2) {
            addCriterion("PRINT_ID between", value1, value2, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdNotBetween(String value1, String value2) {
            addCriterion("PRINT_ID not between", value1, value2, "printId");
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

        public Criteria andPrintTypeIsNull() {
            addCriterion("PRINT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPrintTypeIsNotNull() {
            addCriterion("PRINT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTypeEqualTo(String value) {
            addCriterion("PRINT_TYPE =", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeNotEqualTo(String value) {
            addCriterion("PRINT_TYPE <>", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeGreaterThan(String value) {
            addCriterion("PRINT_TYPE >", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRINT_TYPE >=", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeLessThan(String value) {
            addCriterion("PRINT_TYPE <", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeLessThanOrEqualTo(String value) {
            addCriterion("PRINT_TYPE <=", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeLike(String value) {
            addCriterion("PRINT_TYPE like", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeNotLike(String value) {
            addCriterion("PRINT_TYPE not like", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeIn(List<String> values) {
            addCriterion("PRINT_TYPE in", values, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeNotIn(List<String> values) {
            addCriterion("PRINT_TYPE not in", values, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeBetween(String value1, String value2) {
            addCriterion("PRINT_TYPE between", value1, value2, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeNotBetween(String value1, String value2) {
            addCriterion("PRINT_TYPE not between", value1, value2, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintPageIsNull() {
            addCriterion("PRINT_PAGE is null");
            return (Criteria) this;
        }

        public Criteria andPrintPageIsNotNull() {
            addCriterion("PRINT_PAGE is not null");
            return (Criteria) this;
        }

        public Criteria andPrintPageEqualTo(String value) {
            addCriterion("PRINT_PAGE =", value, "printPage");
            return (Criteria) this;
        }

        public Criteria andPrintPageNotEqualTo(String value) {
            addCriterion("PRINT_PAGE <>", value, "printPage");
            return (Criteria) this;
        }

        public Criteria andPrintPageGreaterThan(String value) {
            addCriterion("PRINT_PAGE >", value, "printPage");
            return (Criteria) this;
        }

        public Criteria andPrintPageGreaterThanOrEqualTo(String value) {
            addCriterion("PRINT_PAGE >=", value, "printPage");
            return (Criteria) this;
        }

        public Criteria andPrintPageLessThan(String value) {
            addCriterion("PRINT_PAGE <", value, "printPage");
            return (Criteria) this;
        }

        public Criteria andPrintPageLessThanOrEqualTo(String value) {
            addCriterion("PRINT_PAGE <=", value, "printPage");
            return (Criteria) this;
        }

        public Criteria andPrintPageLike(String value) {
            addCriterion("PRINT_PAGE like", value, "printPage");
            return (Criteria) this;
        }

        public Criteria andPrintPageNotLike(String value) {
            addCriterion("PRINT_PAGE not like", value, "printPage");
            return (Criteria) this;
        }

        public Criteria andPrintPageIn(List<String> values) {
            addCriterion("PRINT_PAGE in", values, "printPage");
            return (Criteria) this;
        }

        public Criteria andPrintPageNotIn(List<String> values) {
            addCriterion("PRINT_PAGE not in", values, "printPage");
            return (Criteria) this;
        }

        public Criteria andPrintPageBetween(String value1, String value2) {
            addCriterion("PRINT_PAGE between", value1, value2, "printPage");
            return (Criteria) this;
        }

        public Criteria andPrintPageNotBetween(String value1, String value2) {
            addCriterion("PRINT_PAGE not between", value1, value2, "printPage");
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