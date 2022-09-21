package activetech.basehis.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspAotographInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspAotographInfoExample() {
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

        public Criteria andAotographIdIsNull() {
            addCriterion("AOTOGRAPH_ID is null");
            return (Criteria) this;
        }

        public Criteria andAotographIdIsNotNull() {
            addCriterion("AOTOGRAPH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAotographIdEqualTo(String value) {
            addCriterion("AOTOGRAPH_ID =", value, "aotographId");
            return (Criteria) this;
        }

        public Criteria andAotographIdNotEqualTo(String value) {
            addCriterion("AOTOGRAPH_ID <>", value, "aotographId");
            return (Criteria) this;
        }

        public Criteria andAotographIdGreaterThan(String value) {
            addCriterion("AOTOGRAPH_ID >", value, "aotographId");
            return (Criteria) this;
        }

        public Criteria andAotographIdGreaterThanOrEqualTo(String value) {
            addCriterion("AOTOGRAPH_ID >=", value, "aotographId");
            return (Criteria) this;
        }

        public Criteria andAotographIdLessThan(String value) {
            addCriterion("AOTOGRAPH_ID <", value, "aotographId");
            return (Criteria) this;
        }

        public Criteria andAotographIdLessThanOrEqualTo(String value) {
            addCriterion("AOTOGRAPH_ID <=", value, "aotographId");
            return (Criteria) this;
        }

        public Criteria andAotographIdLike(String value) {
            addCriterion("AOTOGRAPH_ID like", value, "aotographId");
            return (Criteria) this;
        }

        public Criteria andAotographIdNotLike(String value) {
            addCriterion("AOTOGRAPH_ID not like", value, "aotographId");
            return (Criteria) this;
        }

        public Criteria andAotographIdIn(List<String> values) {
            addCriterion("AOTOGRAPH_ID in", values, "aotographId");
            return (Criteria) this;
        }

        public Criteria andAotographIdNotIn(List<String> values) {
            addCriterion("AOTOGRAPH_ID not in", values, "aotographId");
            return (Criteria) this;
        }

        public Criteria andAotographIdBetween(String value1, String value2) {
            addCriterion("AOTOGRAPH_ID between", value1, value2, "aotographId");
            return (Criteria) this;
        }

        public Criteria andAotographIdNotBetween(String value1, String value2) {
            addCriterion("AOTOGRAPH_ID not between", value1, value2, "aotographId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdIsNull() {
            addCriterion("RELEVANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdIsNotNull() {
            addCriterion("RELEVANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdEqualTo(String value) {
            addCriterion("RELEVANCE_ID =", value, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdNotEqualTo(String value) {
            addCriterion("RELEVANCE_ID <>", value, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdGreaterThan(String value) {
            addCriterion("RELEVANCE_ID >", value, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("RELEVANCE_ID >=", value, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdLessThan(String value) {
            addCriterion("RELEVANCE_ID <", value, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdLessThanOrEqualTo(String value) {
            addCriterion("RELEVANCE_ID <=", value, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdLike(String value) {
            addCriterion("RELEVANCE_ID like", value, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdNotLike(String value) {
            addCriterion("RELEVANCE_ID not like", value, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdIn(List<String> values) {
            addCriterion("RELEVANCE_ID in", values, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdNotIn(List<String> values) {
            addCriterion("RELEVANCE_ID not in", values, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdBetween(String value1, String value2) {
            addCriterion("RELEVANCE_ID between", value1, value2, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andRelevanceIdNotBetween(String value1, String value2) {
            addCriterion("RELEVANCE_ID not between", value1, value2, "relevanceId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNull() {
            addCriterion("DOCUMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNotNull() {
            addCriterion("DOCUMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE =", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE <>", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThan(String value) {
            addCriterion("DOCUMENT_TYPE >", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE >=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThan(String value) {
            addCriterion("DOCUMENT_TYPE <", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE <=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLike(String value) {
            addCriterion("DOCUMENT_TYPE like", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotLike(String value) {
            addCriterion("DOCUMENT_TYPE not like", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIn(List<String> values) {
            addCriterion("DOCUMENT_TYPE in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotIn(List<String> values) {
            addCriterion("DOCUMENT_TYPE not in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TYPE between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TYPE not between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andAotographTimeIsNull() {
            addCriterion("AOTOGRAPH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAotographTimeIsNotNull() {
            addCriterion("AOTOGRAPH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAotographTimeEqualTo(Date value) {
            addCriterion("AOTOGRAPH_TIME =", value, "aotographTime");
            return (Criteria) this;
        }

        public Criteria andAotographTimeNotEqualTo(Date value) {
            addCriterion("AOTOGRAPH_TIME <>", value, "aotographTime");
            return (Criteria) this;
        }

        public Criteria andAotographTimeGreaterThan(Date value) {
            addCriterion("AOTOGRAPH_TIME >", value, "aotographTime");
            return (Criteria) this;
        }

        public Criteria andAotographTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AOTOGRAPH_TIME >=", value, "aotographTime");
            return (Criteria) this;
        }

        public Criteria andAotographTimeLessThan(Date value) {
            addCriterion("AOTOGRAPH_TIME <", value, "aotographTime");
            return (Criteria) this;
        }

        public Criteria andAotographTimeLessThanOrEqualTo(Date value) {
            addCriterion("AOTOGRAPH_TIME <=", value, "aotographTime");
            return (Criteria) this;
        }

        public Criteria andAotographTimeIn(List<Date> values) {
            addCriterion("AOTOGRAPH_TIME in", values, "aotographTime");
            return (Criteria) this;
        }

        public Criteria andAotographTimeNotIn(List<Date> values) {
            addCriterion("AOTOGRAPH_TIME not in", values, "aotographTime");
            return (Criteria) this;
        }

        public Criteria andAotographTimeBetween(Date value1, Date value2) {
            addCriterion("AOTOGRAPH_TIME between", value1, value2, "aotographTime");
            return (Criteria) this;
        }

        public Criteria andAotographTimeNotBetween(Date value1, Date value2) {
            addCriterion("AOTOGRAPH_TIME not between", value1, value2, "aotographTime");
            return (Criteria) this;
        }

        public Criteria andAotographReturnIsNull() {
            addCriterion("AOTOGRAPH_RETURN is null");
            return (Criteria) this;
        }

        public Criteria andAotographReturnIsNotNull() {
            addCriterion("AOTOGRAPH_RETURN is not null");
            return (Criteria) this;
        }

        public Criteria andAotographReturnEqualTo(String value) {
            addCriterion("AOTOGRAPH_RETURN =", value, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andAotographReturnNotEqualTo(String value) {
            addCriterion("AOTOGRAPH_RETURN <>", value, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andAotographReturnGreaterThan(String value) {
            addCriterion("AOTOGRAPH_RETURN >", value, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andAotographReturnGreaterThanOrEqualTo(String value) {
            addCriterion("AOTOGRAPH_RETURN >=", value, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andAotographReturnLessThan(String value) {
            addCriterion("AOTOGRAPH_RETURN <", value, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andAotographReturnLessThanOrEqualTo(String value) {
            addCriterion("AOTOGRAPH_RETURN <=", value, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andAotographReturnLike(String value) {
            addCriterion("AOTOGRAPH_RETURN like", value, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andAotographReturnNotLike(String value) {
            addCriterion("AOTOGRAPH_RETURN not like", value, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andAotographReturnIn(List<String> values) {
            addCriterion("AOTOGRAPH_RETURN in", values, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andAotographReturnNotIn(List<String> values) {
            addCriterion("AOTOGRAPH_RETURN not in", values, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andAotographReturnBetween(String value1, String value2) {
            addCriterion("AOTOGRAPH_RETURN between", value1, value2, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andAotographReturnNotBetween(String value1, String value2) {
            addCriterion("AOTOGRAPH_RETURN not between", value1, value2, "aotographReturn");
            return (Criteria) this;
        }

        public Criteria andDocNoIsNull() {
            addCriterion("DOC_NO is null");
            return (Criteria) this;
        }

        public Criteria andDocNoIsNotNull() {
            addCriterion("DOC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDocNoEqualTo(String value) {
            addCriterion("DOC_NO =", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotEqualTo(String value) {
            addCriterion("DOC_NO <>", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoGreaterThan(String value) {
            addCriterion("DOC_NO >", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_NO >=", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLessThan(String value) {
            addCriterion("DOC_NO <", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLessThanOrEqualTo(String value) {
            addCriterion("DOC_NO <=", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLike(String value) {
            addCriterion("DOC_NO like", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotLike(String value) {
            addCriterion("DOC_NO not like", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoIn(List<String> values) {
            addCriterion("DOC_NO in", values, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotIn(List<String> values) {
            addCriterion("DOC_NO not in", values, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoBetween(String value1, String value2) {
            addCriterion("DOC_NO between", value1, value2, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotBetween(String value1, String value2) {
            addCriterion("DOC_NO not between", value1, value2, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNameIsNull() {
            addCriterion("DOC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDocNameIsNotNull() {
            addCriterion("DOC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDocNameEqualTo(String value) {
            addCriterion("DOC_NAME =", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotEqualTo(String value) {
            addCriterion("DOC_NAME <>", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameGreaterThan(String value) {
            addCriterion("DOC_NAME >", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_NAME >=", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameLessThan(String value) {
            addCriterion("DOC_NAME <", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameLessThanOrEqualTo(String value) {
            addCriterion("DOC_NAME <=", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameLike(String value) {
            addCriterion("DOC_NAME like", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotLike(String value) {
            addCriterion("DOC_NAME not like", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameIn(List<String> values) {
            addCriterion("DOC_NAME in", values, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotIn(List<String> values) {
            addCriterion("DOC_NAME not in", values, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameBetween(String value1, String value2) {
            addCriterion("DOC_NAME between", value1, value2, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotBetween(String value1, String value2) {
            addCriterion("DOC_NAME not between", value1, value2, "docName");
            return (Criteria) this;
        }

        public Criteria andDocumentTableIsNull() {
            addCriterion("DOCUMENT_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTableIsNotNull() {
            addCriterion("DOCUMENT_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTableEqualTo(String value) {
            addCriterion("DOCUMENT_TABLE =", value, "documentTable");
            return (Criteria) this;
        }

        public Criteria andDocumentTableNotEqualTo(String value) {
            addCriterion("DOCUMENT_TABLE <>", value, "documentTable");
            return (Criteria) this;
        }

        public Criteria andDocumentTableGreaterThan(String value) {
            addCriterion("DOCUMENT_TABLE >", value, "documentTable");
            return (Criteria) this;
        }

        public Criteria andDocumentTableGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TABLE >=", value, "documentTable");
            return (Criteria) this;
        }

        public Criteria andDocumentTableLessThan(String value) {
            addCriterion("DOCUMENT_TABLE <", value, "documentTable");
            return (Criteria) this;
        }

        public Criteria andDocumentTableLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TABLE <=", value, "documentTable");
            return (Criteria) this;
        }

        public Criteria andDocumentTableLike(String value) {
            addCriterion("DOCUMENT_TABLE like", value, "documentTable");
            return (Criteria) this;
        }

        public Criteria andDocumentTableNotLike(String value) {
            addCriterion("DOCUMENT_TABLE not like", value, "documentTable");
            return (Criteria) this;
        }

        public Criteria andDocumentTableIn(List<String> values) {
            addCriterion("DOCUMENT_TABLE in", values, "documentTable");
            return (Criteria) this;
        }

        public Criteria andDocumentTableNotIn(List<String> values) {
            addCriterion("DOCUMENT_TABLE not in", values, "documentTable");
            return (Criteria) this;
        }

        public Criteria andDocumentTableBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TABLE between", value1, value2, "documentTable");
            return (Criteria) this;
        }

        public Criteria andDocumentTableNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TABLE not between", value1, value2, "documentTable");
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