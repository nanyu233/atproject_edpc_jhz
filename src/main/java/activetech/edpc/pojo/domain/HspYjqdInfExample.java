package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspYjqdInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspYjqdInfExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andYjqdSeqIsNull() {
            addCriterion("YJQD_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqIsNotNull() {
            addCriterion("YJQD_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqEqualTo(String value) {
            addCriterion("YJQD_SEQ =", value, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqNotEqualTo(String value) {
            addCriterion("YJQD_SEQ <>", value, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqGreaterThan(String value) {
            addCriterion("YJQD_SEQ >", value, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqGreaterThanOrEqualTo(String value) {
            addCriterion("YJQD_SEQ >=", value, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqLessThan(String value) {
            addCriterion("YJQD_SEQ <", value, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqLessThanOrEqualTo(String value) {
            addCriterion("YJQD_SEQ <=", value, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqLike(String value) {
            addCriterion("YJQD_SEQ like", value, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqNotLike(String value) {
            addCriterion("YJQD_SEQ not like", value, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqIn(List<String> values) {
            addCriterion("YJQD_SEQ in", values, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqNotIn(List<String> values) {
            addCriterion("YJQD_SEQ not in", values, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqBetween(String value1, String value2) {
            addCriterion("YJQD_SEQ between", value1, value2, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdSeqNotBetween(String value1, String value2) {
            addCriterion("YJQD_SEQ not between", value1, value2, "yjqdSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqIsNull() {
            addCriterion("REG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andRegSeqIsNotNull() {
            addCriterion("REG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRegSeqEqualTo(String value) {
            addCriterion("REG_SEQ =", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqNotEqualTo(String value) {
            addCriterion("REG_SEQ <>", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqGreaterThan(String value) {
            addCriterion("REG_SEQ >", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqGreaterThanOrEqualTo(String value) {
            addCriterion("REG_SEQ >=", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqLessThan(String value) {
            addCriterion("REG_SEQ <", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqLessThanOrEqualTo(String value) {
            addCriterion("REG_SEQ <=", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqLike(String value) {
            addCriterion("REG_SEQ like", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqNotLike(String value) {
            addCriterion("REG_SEQ not like", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqIn(List<String> values) {
            addCriterion("REG_SEQ in", values, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqNotIn(List<String> values) {
            addCriterion("REG_SEQ not in", values, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqBetween(String value1, String value2) {
            addCriterion("REG_SEQ between", value1, value2, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqNotBetween(String value1, String value2) {
            addCriterion("REG_SEQ not between", value1, value2, "regSeq");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeIsNull() {
            addCriterion("YJQD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeIsNotNull() {
            addCriterion("YJQD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeEqualTo(Date value) {
            addCriterion("YJQD_TIME =", value, "yjqdTime");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeNotEqualTo(Date value) {
            addCriterion("YJQD_TIME <>", value, "yjqdTime");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeGreaterThan(Date value) {
            addCriterion("YJQD_TIME >", value, "yjqdTime");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("YJQD_TIME >=", value, "yjqdTime");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeLessThan(Date value) {
            addCriterion("YJQD_TIME <", value, "yjqdTime");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeLessThanOrEqualTo(Date value) {
            addCriterion("YJQD_TIME <=", value, "yjqdTime");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeIn(List<Date> values) {
            addCriterion("YJQD_TIME in", values, "yjqdTime");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeNotIn(List<Date> values) {
            addCriterion("YJQD_TIME not in", values, "yjqdTime");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeBetween(Date value1, Date value2) {
            addCriterion("YJQD_TIME between", value1, value2, "yjqdTime");
            return (Criteria) this;
        }

        public Criteria andYjqdTimeNotBetween(Date value1, Date value2) {
            addCriterion("YJQD_TIME not between", value1, value2, "yjqdTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIsNull() {
            addCriterion("NOTICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIsNotNull() {
            addCriterion("NOTICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeEqualTo(String value) {
            addCriterion("NOTICE_TYPE =", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotEqualTo(String value) {
            addCriterion("NOTICE_TYPE <>", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeGreaterThan(String value) {
            addCriterion("NOTICE_TYPE >", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE_TYPE >=", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeLessThan(String value) {
            addCriterion("NOTICE_TYPE <", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeLessThanOrEqualTo(String value) {
            addCriterion("NOTICE_TYPE <=", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeLike(String value) {
            addCriterion("NOTICE_TYPE like", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotLike(String value) {
            addCriterion("NOTICE_TYPE not like", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIn(List<String> values) {
            addCriterion("NOTICE_TYPE in", values, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotIn(List<String> values) {
            addCriterion("NOTICE_TYPE not in", values, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeBetween(String value1, String value2) {
            addCriterion("NOTICE_TYPE between", value1, value2, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotBetween(String value1, String value2) {
            addCriterion("NOTICE_TYPE not between", value1, value2, "noticeType");
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