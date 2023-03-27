package activetech.base.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DstarchivesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DstarchivesExample() {
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

        public Criteria andFileSeqIsNull() {
            addCriterion("FILE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFileSeqIsNotNull() {
            addCriterion("FILE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFileSeqEqualTo(String value) {
            addCriterion("FILE_SEQ =", value, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andFileSeqNotEqualTo(String value) {
            addCriterion("FILE_SEQ <>", value, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andFileSeqGreaterThan(String value) {
            addCriterion("FILE_SEQ >", value, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andFileSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_SEQ >=", value, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andFileSeqLessThan(String value) {
            addCriterion("FILE_SEQ <", value, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andFileSeqLessThanOrEqualTo(String value) {
            addCriterion("FILE_SEQ <=", value, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andFileSeqLike(String value) {
            addCriterion("FILE_SEQ like", value, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andFileSeqNotLike(String value) {
            addCriterion("FILE_SEQ not like", value, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andFileSeqIn(List<String> values) {
            addCriterion("FILE_SEQ in", values, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andFileSeqNotIn(List<String> values) {
            addCriterion("FILE_SEQ not in", values, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andFileSeqBetween(String value1, String value2) {
            addCriterion("FILE_SEQ between", value1, value2, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andFileSeqNotBetween(String value1, String value2) {
            addCriterion("FILE_SEQ not between", value1, value2, "fileSeq");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNull() {
            addCriterion("REF_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("REF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(String value) {
            addCriterion("REF_ID =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(String value) {
            addCriterion("REF_ID <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(String value) {
            addCriterion("REF_ID >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("REF_ID >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(String value) {
            addCriterion("REF_ID <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(String value) {
            addCriterion("REF_ID <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLike(String value) {
            addCriterion("REF_ID like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotLike(String value) {
            addCriterion("REF_ID not like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<String> values) {
            addCriterion("REF_ID in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<String> values) {
            addCriterion("REF_ID not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(String value1, String value2) {
            addCriterion("REF_ID between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(String value1, String value2) {
            addCriterion("REF_ID not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNull() {
            addCriterion("CRT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNotNull() {
            addCriterion("CRT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDateEqualTo(Date value) {
            addCriterion("CRT_DATE =", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotEqualTo(Date value) {
            addCriterion("CRT_DATE <>", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThan(Date value) {
            addCriterion("CRT_DATE >", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_DATE >=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThan(Date value) {
            addCriterion("CRT_DATE <", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThanOrEqualTo(Date value) {
            addCriterion("CRT_DATE <=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateIn(List<Date> values) {
            addCriterion("CRT_DATE in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotIn(List<Date> values) {
            addCriterion("CRT_DATE not in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateBetween(Date value1, Date value2) {
            addCriterion("CRT_DATE between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotBetween(Date value1, Date value2) {
            addCriterion("CRT_DATE not between", value1, value2, "crtDate");
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

        public Criteria andFileTypeIsNull() {
            addCriterion("FILE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("FILE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("FILE_TYPE =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("FILE_TYPE <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("FILE_TYPE >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_TYPE >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("FILE_TYPE <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("FILE_TYPE <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("FILE_TYPE like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("FILE_TYPE not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("FILE_TYPE in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("FILE_TYPE not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("FILE_TYPE between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("FILE_TYPE not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andVoiceSecIsNull() {
            addCriterion("VOICE_SEC is null");
            return (Criteria) this;
        }

        public Criteria andVoiceSecIsNotNull() {
            addCriterion("VOICE_SEC is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceSecEqualTo(BigDecimal value) {
            addCriterion("VOICE_SEC =", value, "voiceSec");
            return (Criteria) this;
        }

        public Criteria andVoiceSecNotEqualTo(BigDecimal value) {
            addCriterion("VOICE_SEC <>", value, "voiceSec");
            return (Criteria) this;
        }

        public Criteria andVoiceSecGreaterThan(BigDecimal value) {
            addCriterion("VOICE_SEC >", value, "voiceSec");
            return (Criteria) this;
        }

        public Criteria andVoiceSecGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOICE_SEC >=", value, "voiceSec");
            return (Criteria) this;
        }

        public Criteria andVoiceSecLessThan(BigDecimal value) {
            addCriterion("VOICE_SEC <", value, "voiceSec");
            return (Criteria) this;
        }

        public Criteria andVoiceSecLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOICE_SEC <=", value, "voiceSec");
            return (Criteria) this;
        }

        public Criteria andVoiceSecIn(List<BigDecimal> values) {
            addCriterion("VOICE_SEC in", values, "voiceSec");
            return (Criteria) this;
        }

        public Criteria andVoiceSecNotIn(List<BigDecimal> values) {
            addCriterion("VOICE_SEC not in", values, "voiceSec");
            return (Criteria) this;
        }

        public Criteria andVoiceSecBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOICE_SEC between", value1, value2, "voiceSec");
            return (Criteria) this;
        }

        public Criteria andVoiceSecNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOICE_SEC not between", value1, value2, "voiceSec");
            return (Criteria) this;
        }

        public Criteria andValidsIsNull() {
            addCriterion("VALIDS is null");
            return (Criteria) this;
        }

        public Criteria andValidsIsNotNull() {
            addCriterion("VALIDS is not null");
            return (Criteria) this;
        }

        public Criteria andValidsEqualTo(String value) {
            addCriterion("VALIDS =", value, "valids");
            return (Criteria) this;
        }

        public Criteria andValidsNotEqualTo(String value) {
            addCriterion("VALIDS <>", value, "valids");
            return (Criteria) this;
        }

        public Criteria andValidsGreaterThan(String value) {
            addCriterion("VALIDS >", value, "valids");
            return (Criteria) this;
        }

        public Criteria andValidsGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDS >=", value, "valids");
            return (Criteria) this;
        }

        public Criteria andValidsLessThan(String value) {
            addCriterion("VALIDS <", value, "valids");
            return (Criteria) this;
        }

        public Criteria andValidsLessThanOrEqualTo(String value) {
            addCriterion("VALIDS <=", value, "valids");
            return (Criteria) this;
        }

        public Criteria andValidsLike(String value) {
            addCriterion("VALIDS like", value, "valids");
            return (Criteria) this;
        }

        public Criteria andValidsNotLike(String value) {
            addCriterion("VALIDS not like", value, "valids");
            return (Criteria) this;
        }

        public Criteria andValidsIn(List<String> values) {
            addCriterion("VALIDS in", values, "valids");
            return (Criteria) this;
        }

        public Criteria andValidsNotIn(List<String> values) {
            addCriterion("VALIDS not in", values, "valids");
            return (Criteria) this;
        }

        public Criteria andValidsBetween(String value1, String value2) {
            addCriterion("VALIDS between", value1, value2, "valids");
            return (Criteria) this;
        }

        public Criteria andValidsNotBetween(String value1, String value2) {
            addCriterion("VALIDS not between", value1, value2, "valids");
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