package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspGrpInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspGrpInfExample() {
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

        public Criteria andGrpSeqIsNull() {
            addCriterion("GRP_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andGrpSeqIsNotNull() {
            addCriterion("GRP_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andGrpSeqEqualTo(String value) {
            addCriterion("GRP_SEQ =", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqNotEqualTo(String value) {
            addCriterion("GRP_SEQ <>", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqGreaterThan(String value) {
            addCriterion("GRP_SEQ >", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqGreaterThanOrEqualTo(String value) {
            addCriterion("GRP_SEQ >=", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqLessThan(String value) {
            addCriterion("GRP_SEQ <", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqLessThanOrEqualTo(String value) {
            addCriterion("GRP_SEQ <=", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqLike(String value) {
            addCriterion("GRP_SEQ like", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqNotLike(String value) {
            addCriterion("GRP_SEQ not like", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqIn(List<String> values) {
            addCriterion("GRP_SEQ in", values, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqNotIn(List<String> values) {
            addCriterion("GRP_SEQ not in", values, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqBetween(String value1, String value2) {
            addCriterion("GRP_SEQ between", value1, value2, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqNotBetween(String value1, String value2) {
            addCriterion("GRP_SEQ not between", value1, value2, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpNameIsNull() {
            addCriterion("GRP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGrpNameIsNotNull() {
            addCriterion("GRP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGrpNameEqualTo(String value) {
            addCriterion("GRP_NAME =", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameNotEqualTo(String value) {
            addCriterion("GRP_NAME <>", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameGreaterThan(String value) {
            addCriterion("GRP_NAME >", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameGreaterThanOrEqualTo(String value) {
            addCriterion("GRP_NAME >=", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameLessThan(String value) {
            addCriterion("GRP_NAME <", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameLessThanOrEqualTo(String value) {
            addCriterion("GRP_NAME <=", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameLike(String value) {
            addCriterion("GRP_NAME like", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameNotLike(String value) {
            addCriterion("GRP_NAME not like", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameIn(List<String> values) {
            addCriterion("GRP_NAME in", values, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameNotIn(List<String> values) {
            addCriterion("GRP_NAME not in", values, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameBetween(String value1, String value2) {
            addCriterion("GRP_NAME between", value1, value2, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameNotBetween(String value1, String value2) {
            addCriterion("GRP_NAME not between", value1, value2, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpTypeIsNull() {
            addCriterion("GRP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGrpTypeIsNotNull() {
            addCriterion("GRP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGrpTypeEqualTo(String value) {
            addCriterion("GRP_TYPE =", value, "grpType");
            return (Criteria) this;
        }

        public Criteria andGrpTypeNotEqualTo(String value) {
            addCriterion("GRP_TYPE <>", value, "grpType");
            return (Criteria) this;
        }

        public Criteria andGrpTypeGreaterThan(String value) {
            addCriterion("GRP_TYPE >", value, "grpType");
            return (Criteria) this;
        }

        public Criteria andGrpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GRP_TYPE >=", value, "grpType");
            return (Criteria) this;
        }

        public Criteria andGrpTypeLessThan(String value) {
            addCriterion("GRP_TYPE <", value, "grpType");
            return (Criteria) this;
        }

        public Criteria andGrpTypeLessThanOrEqualTo(String value) {
            addCriterion("GRP_TYPE <=", value, "grpType");
            return (Criteria) this;
        }

        public Criteria andGrpTypeLike(String value) {
            addCriterion("GRP_TYPE like", value, "grpType");
            return (Criteria) this;
        }

        public Criteria andGrpTypeNotLike(String value) {
            addCriterion("GRP_TYPE not like", value, "grpType");
            return (Criteria) this;
        }

        public Criteria andGrpTypeIn(List<String> values) {
            addCriterion("GRP_TYPE in", values, "grpType");
            return (Criteria) this;
        }

        public Criteria andGrpTypeNotIn(List<String> values) {
            addCriterion("GRP_TYPE not in", values, "grpType");
            return (Criteria) this;
        }

        public Criteria andGrpTypeBetween(String value1, String value2) {
            addCriterion("GRP_TYPE between", value1, value2, "grpType");
            return (Criteria) this;
        }

        public Criteria andGrpTypeNotBetween(String value1, String value2) {
            addCriterion("GRP_TYPE not between", value1, value2, "grpType");
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

        public Criteria andShoworderIsNull() {
            addCriterion("SHOWORDER is null");
            return (Criteria) this;
        }

        public Criteria andShoworderIsNotNull() {
            addCriterion("SHOWORDER is not null");
            return (Criteria) this;
        }

        public Criteria andShoworderEqualTo(Long value) {
            addCriterion("SHOWORDER =", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotEqualTo(Long value) {
            addCriterion("SHOWORDER <>", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThan(Long value) {
            addCriterion("SHOWORDER >", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOWORDER >=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThan(Long value) {
            addCriterion("SHOWORDER <", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThanOrEqualTo(Long value) {
            addCriterion("SHOWORDER <=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderIn(List<Long> values) {
            addCriterion("SHOWORDER in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotIn(List<Long> values) {
            addCriterion("SHOWORDER not in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderBetween(Long value1, Long value2) {
            addCriterion("SHOWORDER between", value1, value2, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotBetween(Long value1, Long value2) {
            addCriterion("SHOWORDER not between", value1, value2, "showorder");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidIsNull() {
            addCriterion("DINGTALK_CHATID is null");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidIsNotNull() {
            addCriterion("DINGTALK_CHATID is not null");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidEqualTo(String value) {
            addCriterion("DINGTALK_CHATID =", value, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidNotEqualTo(String value) {
            addCriterion("DINGTALK_CHATID <>", value, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidGreaterThan(String value) {
            addCriterion("DINGTALK_CHATID >", value, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidGreaterThanOrEqualTo(String value) {
            addCriterion("DINGTALK_CHATID >=", value, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidLessThan(String value) {
            addCriterion("DINGTALK_CHATID <", value, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidLessThanOrEqualTo(String value) {
            addCriterion("DINGTALK_CHATID <=", value, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidLike(String value) {
            addCriterion("DINGTALK_CHATID like", value, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidNotLike(String value) {
            addCriterion("DINGTALK_CHATID not like", value, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidIn(List<String> values) {
            addCriterion("DINGTALK_CHATID in", values, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidNotIn(List<String> values) {
            addCriterion("DINGTALK_CHATID not in", values, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidBetween(String value1, String value2) {
            addCriterion("DINGTALK_CHATID between", value1, value2, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andDingtalkChatidNotBetween(String value1, String value2) {
            addCriterion("DINGTALK_CHATID not between", value1, value2, "dingtalkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidIsNull() {
            addCriterion("WXWORK_CHATID is null");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidIsNotNull() {
            addCriterion("WXWORK_CHATID is not null");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidEqualTo(String value) {
            addCriterion("WXWORK_CHATID =", value, "wxworkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidNotEqualTo(String value) {
            addCriterion("WXWORK_CHATID <>", value, "wxworkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidGreaterThan(String value) {
            addCriterion("WXWORK_CHATID >", value, "wxworkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidGreaterThanOrEqualTo(String value) {
            addCriterion("WXWORK_CHATID >=", value, "wxworkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidLessThan(String value) {
            addCriterion("WXWORK_CHATID <", value, "wxworkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidLessThanOrEqualTo(String value) {
            addCriterion("WXWORK_CHATID <=", value, "wxworkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidLike(String value) {
            addCriterion("WXWORK_CHATID like", value, "wxworkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidNotLike(String value) {
            addCriterion("WXWORK_CHATID not like", value, "wxworkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidIn(List<String> values) {
            addCriterion("WXWORK_CHATID in", values, "wxworkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidNotIn(List<String> values) {
            addCriterion("WXWORK_CHATID not in", values, "wxworkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidBetween(String value1, String value2) {
            addCriterion("WXWORK_CHATID between", value1, value2, "wxworkChatid");
            return (Criteria) this;
        }

        public Criteria andWxworkChatidNotBetween(String value1, String value2) {
            addCriterion("WXWORK_CHATID not between", value1, value2, "wxworkChatid");
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