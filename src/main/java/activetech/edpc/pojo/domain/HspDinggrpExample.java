package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspDinggrpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDinggrpExample() {
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

        public Criteria andChatidIsNull() {
            addCriterion("CHATID is null");
            return (Criteria) this;
        }

        public Criteria andChatidIsNotNull() {
            addCriterion("CHATID is not null");
            return (Criteria) this;
        }

        public Criteria andChatidEqualTo(String value) {
            addCriterion("CHATID =", value, "chatid");
            return (Criteria) this;
        }

        public Criteria andChatidNotEqualTo(String value) {
            addCriterion("CHATID <>", value, "chatid");
            return (Criteria) this;
        }

        public Criteria andChatidGreaterThan(String value) {
            addCriterion("CHATID >", value, "chatid");
            return (Criteria) this;
        }

        public Criteria andChatidGreaterThanOrEqualTo(String value) {
            addCriterion("CHATID >=", value, "chatid");
            return (Criteria) this;
        }

        public Criteria andChatidLessThan(String value) {
            addCriterion("CHATID <", value, "chatid");
            return (Criteria) this;
        }

        public Criteria andChatidLessThanOrEqualTo(String value) {
            addCriterion("CHATID <=", value, "chatid");
            return (Criteria) this;
        }

        public Criteria andChatidLike(String value) {
            addCriterion("CHATID like", value, "chatid");
            return (Criteria) this;
        }

        public Criteria andChatidNotLike(String value) {
            addCriterion("CHATID not like", value, "chatid");
            return (Criteria) this;
        }

        public Criteria andChatidIn(List<String> values) {
            addCriterion("CHATID in", values, "chatid");
            return (Criteria) this;
        }

        public Criteria andChatidNotIn(List<String> values) {
            addCriterion("CHATID not in", values, "chatid");
            return (Criteria) this;
        }

        public Criteria andChatidBetween(String value1, String value2) {
            addCriterion("CHATID between", value1, value2, "chatid");
            return (Criteria) this;
        }

        public Criteria andChatidNotBetween(String value1, String value2) {
            addCriterion("CHATID not between", value1, value2, "chatid");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdIsNull() {
            addCriterion("OPEN_CONVERSATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdIsNotNull() {
            addCriterion("OPEN_CONVERSATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdEqualTo(String value) {
            addCriterion("OPEN_CONVERSATION_ID =", value, "openConversationId");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdNotEqualTo(String value) {
            addCriterion("OPEN_CONVERSATION_ID <>", value, "openConversationId");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdGreaterThan(String value) {
            addCriterion("OPEN_CONVERSATION_ID >", value, "openConversationId");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_CONVERSATION_ID >=", value, "openConversationId");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdLessThan(String value) {
            addCriterion("OPEN_CONVERSATION_ID <", value, "openConversationId");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_CONVERSATION_ID <=", value, "openConversationId");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdLike(String value) {
            addCriterion("OPEN_CONVERSATION_ID like", value, "openConversationId");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdNotLike(String value) {
            addCriterion("OPEN_CONVERSATION_ID not like", value, "openConversationId");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdIn(List<String> values) {
            addCriterion("OPEN_CONVERSATION_ID in", values, "openConversationId");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdNotIn(List<String> values) {
            addCriterion("OPEN_CONVERSATION_ID not in", values, "openConversationId");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdBetween(String value1, String value2) {
            addCriterion("OPEN_CONVERSATION_ID between", value1, value2, "openConversationId");
            return (Criteria) this;
        }

        public Criteria andOpenConversationIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_CONVERSATION_ID not between", value1, value2, "openConversationId");
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