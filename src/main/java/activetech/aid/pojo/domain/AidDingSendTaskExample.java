package activetech.aid.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AidDingSendTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AidDingSendTaskExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRecipientsIsNull() {
            addCriterion("RECIPIENTS is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsIsNotNull() {
            addCriterion("RECIPIENTS is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsEqualTo(String value) {
            addCriterion("RECIPIENTS =", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotEqualTo(String value) {
            addCriterion("RECIPIENTS <>", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsGreaterThan(String value) {
            addCriterion("RECIPIENTS >", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsGreaterThanOrEqualTo(String value) {
            addCriterion("RECIPIENTS >=", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsLessThan(String value) {
            addCriterion("RECIPIENTS <", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsLessThanOrEqualTo(String value) {
            addCriterion("RECIPIENTS <=", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsLike(String value) {
            addCriterion("RECIPIENTS like", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotLike(String value) {
            addCriterion("RECIPIENTS not like", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsIn(List<String> values) {
            addCriterion("RECIPIENTS in", values, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotIn(List<String> values) {
            addCriterion("RECIPIENTS not in", values, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsBetween(String value1, String value2) {
            addCriterion("RECIPIENTS between", value1, value2, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotBetween(String value1, String value2) {
            addCriterion("RECIPIENTS not between", value1, value2, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeIsNull() {
            addCriterion("RECIPIENTS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeIsNotNull() {
            addCriterion("RECIPIENTS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeEqualTo(String value) {
            addCriterion("RECIPIENTS_TYPE =", value, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeNotEqualTo(String value) {
            addCriterion("RECIPIENTS_TYPE <>", value, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeGreaterThan(String value) {
            addCriterion("RECIPIENTS_TYPE >", value, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RECIPIENTS_TYPE >=", value, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeLessThan(String value) {
            addCriterion("RECIPIENTS_TYPE <", value, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeLessThanOrEqualTo(String value) {
            addCriterion("RECIPIENTS_TYPE <=", value, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeLike(String value) {
            addCriterion("RECIPIENTS_TYPE like", value, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeNotLike(String value) {
            addCriterion("RECIPIENTS_TYPE not like", value, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeIn(List<String> values) {
            addCriterion("RECIPIENTS_TYPE in", values, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeNotIn(List<String> values) {
            addCriterion("RECIPIENTS_TYPE not in", values, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeBetween(String value1, String value2) {
            addCriterion("RECIPIENTS_TYPE between", value1, value2, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andRecipientsTypeNotBetween(String value1, String value2) {
            addCriterion("RECIPIENTS_TYPE not between", value1, value2, "recipientsType");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("SENDER is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("SENDER is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("SENDER =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("SENDER <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("SENDER >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("SENDER >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("SENDER <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("SENDER <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("SENDER like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("SENDER not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("SENDER in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("SENDER not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("SENDER between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("SENDER not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderTypeIsNull() {
            addCriterion("SENDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSenderTypeIsNotNull() {
            addCriterion("SENDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSenderTypeEqualTo(String value) {
            addCriterion("SENDER_TYPE =", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeNotEqualTo(String value) {
            addCriterion("SENDER_TYPE <>", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeGreaterThan(String value) {
            addCriterion("SENDER_TYPE >", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SENDER_TYPE >=", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeLessThan(String value) {
            addCriterion("SENDER_TYPE <", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeLessThanOrEqualTo(String value) {
            addCriterion("SENDER_TYPE <=", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeLike(String value) {
            addCriterion("SENDER_TYPE like", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeNotLike(String value) {
            addCriterion("SENDER_TYPE not like", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeIn(List<String> values) {
            addCriterion("SENDER_TYPE in", values, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeNotIn(List<String> values) {
            addCriterion("SENDER_TYPE not in", values, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeBetween(String value1, String value2) {
            addCriterion("SENDER_TYPE between", value1, value2, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeNotBetween(String value1, String value2) {
            addCriterion("SENDER_TYPE not between", value1, value2, "senderType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("MSG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("MSG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(String value) {
            addCriterion("MSG_TYPE =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(String value) {
            addCriterion("MSG_TYPE <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(String value) {
            addCriterion("MSG_TYPE >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_TYPE >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(String value) {
            addCriterion("MSG_TYPE <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(String value) {
            addCriterion("MSG_TYPE <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLike(String value) {
            addCriterion("MSG_TYPE like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotLike(String value) {
            addCriterion("MSG_TYPE not like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<String> values) {
            addCriterion("MSG_TYPE in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<String> values) {
            addCriterion("MSG_TYPE not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(String value1, String value2) {
            addCriterion("MSG_TYPE between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(String value1, String value2) {
            addCriterion("MSG_TYPE not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("TEXT is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("TEXT =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("TEXT <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("TEXT >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("TEXT >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("TEXT <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("TEXT <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("TEXT like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("TEXT not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("TEXT in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("TEXT not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("TEXT between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("TEXT not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNull() {
            addCriterion("MEDIA_ID is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("MEDIA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(String value) {
            addCriterion("MEDIA_ID =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(String value) {
            addCriterion("MEDIA_ID <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(String value) {
            addCriterion("MEDIA_ID >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIA_ID >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(String value) {
            addCriterion("MEDIA_ID <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(String value) {
            addCriterion("MEDIA_ID <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLike(String value) {
            addCriterion("MEDIA_ID like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotLike(String value) {
            addCriterion("MEDIA_ID not like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<String> values) {
            addCriterion("MEDIA_ID in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<String> values) {
            addCriterion("MEDIA_ID not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(String value1, String value2) {
            addCriterion("MEDIA_ID between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(String value1, String value2) {
            addCriterion("MEDIA_ID not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMessageUrlIsNull() {
            addCriterion("MESSAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andMessageUrlIsNotNull() {
            addCriterion("MESSAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUrlEqualTo(String value) {
            addCriterion("MESSAGE_URL =", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlNotEqualTo(String value) {
            addCriterion("MESSAGE_URL <>", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlGreaterThan(String value) {
            addCriterion("MESSAGE_URL >", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE_URL >=", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlLessThan(String value) {
            addCriterion("MESSAGE_URL <", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE_URL <=", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlLike(String value) {
            addCriterion("MESSAGE_URL like", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlNotLike(String value) {
            addCriterion("MESSAGE_URL not like", value, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlIn(List<String> values) {
            addCriterion("MESSAGE_URL in", values, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlNotIn(List<String> values) {
            addCriterion("MESSAGE_URL not in", values, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlBetween(String value1, String value2) {
            addCriterion("MESSAGE_URL between", value1, value2, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageUrlNotBetween(String value1, String value2) {
            addCriterion("MESSAGE_URL not between", value1, value2, "messageUrl");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNull() {
            addCriterion("MESSAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("MESSAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(String value) {
            addCriterion("MESSAGE_ID =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(String value) {
            addCriterion("MESSAGE_ID <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(String value) {
            addCriterion("MESSAGE_ID >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE_ID >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(String value) {
            addCriterion("MESSAGE_ID <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE_ID <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLike(String value) {
            addCriterion("MESSAGE_ID like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotLike(String value) {
            addCriterion("MESSAGE_ID not like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<String> values) {
            addCriterion("MESSAGE_ID in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<String> values) {
            addCriterion("MESSAGE_ID not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(String value1, String value2) {
            addCriterion("MESSAGE_ID between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(String value1, String value2) {
            addCriterion("MESSAGE_ID not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNull() {
            addCriterion("ERROR_MSG is null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNotNull() {
            addCriterion("ERROR_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgEqualTo(String value) {
            addCriterion("ERROR_MSG =", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotEqualTo(String value) {
            addCriterion("ERROR_MSG <>", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThan(String value) {
            addCriterion("ERROR_MSG >", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_MSG >=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThan(String value) {
            addCriterion("ERROR_MSG <", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThanOrEqualTo(String value) {
            addCriterion("ERROR_MSG <=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLike(String value) {
            addCriterion("ERROR_MSG like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotLike(String value) {
            addCriterion("ERROR_MSG not like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIn(List<String> values) {
            addCriterion("ERROR_MSG in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotIn(List<String> values) {
            addCriterion("ERROR_MSG not in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgBetween(String value1, String value2) {
            addCriterion("ERROR_MSG between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotBetween(String value1, String value2) {
            addCriterion("ERROR_MSG not between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andSendFlgIsNull() {
            addCriterion("SEND_FLG is null");
            return (Criteria) this;
        }

        public Criteria andSendFlgIsNotNull() {
            addCriterion("SEND_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andSendFlgEqualTo(String value) {
            addCriterion("SEND_FLG =", value, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andSendFlgNotEqualTo(String value) {
            addCriterion("SEND_FLG <>", value, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andSendFlgGreaterThan(String value) {
            addCriterion("SEND_FLG >", value, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andSendFlgGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_FLG >=", value, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andSendFlgLessThan(String value) {
            addCriterion("SEND_FLG <", value, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andSendFlgLessThanOrEqualTo(String value) {
            addCriterion("SEND_FLG <=", value, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andSendFlgLike(String value) {
            addCriterion("SEND_FLG like", value, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andSendFlgNotLike(String value) {
            addCriterion("SEND_FLG not like", value, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andSendFlgIn(List<String> values) {
            addCriterion("SEND_FLG in", values, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andSendFlgNotIn(List<String> values) {
            addCriterion("SEND_FLG not in", values, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andSendFlgBetween(String value1, String value2) {
            addCriterion("SEND_FLG between", value1, value2, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andSendFlgNotBetween(String value1, String value2) {
            addCriterion("SEND_FLG not between", value1, value2, "sendFlg");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("CREAT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("CREAT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("CREAT_TIME =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("CREAT_TIME <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("CREAT_TIME >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREAT_TIME >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("CREAT_TIME <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREAT_TIME <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("CREAT_TIME in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("CREAT_TIME not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("CREAT_TIME between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREAT_TIME not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(String value) {
            addCriterion("SYSTEM_ID =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(String value) {
            addCriterion("SYSTEM_ID <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(String value) {
            addCriterion("SYSTEM_ID >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(String value) {
            addCriterion("SYSTEM_ID <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLike(String value) {
            addCriterion("SYSTEM_ID like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotLike(String value) {
            addCriterion("SYSTEM_ID not like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<String> values) {
            addCriterion("SYSTEM_ID in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<String> values) {
            addCriterion("SYSTEM_ID not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID not between", value1, value2, "systemId");
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