package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspOperationDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspOperationDictExample() {
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

        public Criteria andOperationCodeIsNull() {
            addCriterion("OPERATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOperationCodeIsNotNull() {
            addCriterion("OPERATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperationCodeEqualTo(String value) {
            addCriterion("OPERATION_CODE =", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotEqualTo(String value) {
            addCriterion("OPERATION_CODE <>", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeGreaterThan(String value) {
            addCriterion("OPERATION_CODE >", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_CODE >=", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeLessThan(String value) {
            addCriterion("OPERATION_CODE <", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_CODE <=", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeLike(String value) {
            addCriterion("OPERATION_CODE like", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotLike(String value) {
            addCriterion("OPERATION_CODE not like", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeIn(List<String> values) {
            addCriterion("OPERATION_CODE in", values, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotIn(List<String> values) {
            addCriterion("OPERATION_CODE not in", values, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeBetween(String value1, String value2) {
            addCriterion("OPERATION_CODE between", value1, value2, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotBetween(String value1, String value2) {
            addCriterion("OPERATION_CODE not between", value1, value2, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNull() {
            addCriterion("OPERATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNotNull() {
            addCriterion("OPERATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperationNameEqualTo(String value) {
            addCriterion("OPERATION_NAME =", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotEqualTo(String value) {
            addCriterion("OPERATION_NAME <>", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThan(String value) {
            addCriterion("OPERATION_NAME >", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_NAME >=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThan(String value) {
            addCriterion("OPERATION_NAME <", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_NAME <=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLike(String value) {
            addCriterion("OPERATION_NAME like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotLike(String value) {
            addCriterion("OPERATION_NAME not like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameIn(List<String> values) {
            addCriterion("OPERATION_NAME in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotIn(List<String> values) {
            addCriterion("OPERATION_NAME not in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameBetween(String value1, String value2) {
            addCriterion("OPERATION_NAME between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotBetween(String value1, String value2) {
            addCriterion("OPERATION_NAME not between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationGradeIsNull() {
            addCriterion("OPERATION_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andOperationGradeIsNotNull() {
            addCriterion("OPERATION_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andOperationGradeEqualTo(String value) {
            addCriterion("OPERATION_GRADE =", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeNotEqualTo(String value) {
            addCriterion("OPERATION_GRADE <>", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeGreaterThan(String value) {
            addCriterion("OPERATION_GRADE >", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_GRADE >=", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeLessThan(String value) {
            addCriterion("OPERATION_GRADE <", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_GRADE <=", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeLike(String value) {
            addCriterion("OPERATION_GRADE like", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeNotLike(String value) {
            addCriterion("OPERATION_GRADE not like", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeIn(List<String> values) {
            addCriterion("OPERATION_GRADE in", values, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeNotIn(List<String> values) {
            addCriterion("OPERATION_GRADE not in", values, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeBetween(String value1, String value2) {
            addCriterion("OPERATION_GRADE between", value1, value2, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeNotBetween(String value1, String value2) {
            addCriterion("OPERATION_GRADE not between", value1, value2, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("OPERATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("OPERATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(String value) {
            addCriterion("OPERATION_TYPE =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(String value) {
            addCriterion("OPERATION_TYPE <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(String value) {
            addCriterion("OPERATION_TYPE >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_TYPE >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(String value) {
            addCriterion("OPERATION_TYPE <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_TYPE <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLike(String value) {
            addCriterion("OPERATION_TYPE like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotLike(String value) {
            addCriterion("OPERATION_TYPE not like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<String> values) {
            addCriterion("OPERATION_TYPE in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<String> values) {
            addCriterion("OPERATION_TYPE not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(String value1, String value2) {
            addCriterion("OPERATION_TYPE between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(String value1, String value2) {
            addCriterion("OPERATION_TYPE not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeIsNull() {
            addCriterion("PINYIN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeIsNotNull() {
            addCriterion("PINYIN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeEqualTo(String value) {
            addCriterion("PINYIN_CODE =", value, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeNotEqualTo(String value) {
            addCriterion("PINYIN_CODE <>", value, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeGreaterThan(String value) {
            addCriterion("PINYIN_CODE >", value, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PINYIN_CODE >=", value, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeLessThan(String value) {
            addCriterion("PINYIN_CODE <", value, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeLessThanOrEqualTo(String value) {
            addCriterion("PINYIN_CODE <=", value, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeLike(String value) {
            addCriterion("PINYIN_CODE like", value, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeNotLike(String value) {
            addCriterion("PINYIN_CODE not like", value, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeIn(List<String> values) {
            addCriterion("PINYIN_CODE in", values, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeNotIn(List<String> values) {
            addCriterion("PINYIN_CODE not in", values, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeBetween(String value1, String value2) {
            addCriterion("PINYIN_CODE between", value1, value2, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andPinyinCodeNotBetween(String value1, String value2) {
            addCriterion("PINYIN_CODE not between", value1, value2, "pinyinCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeIsNull() {
            addCriterion("WUBI_CODE is null");
            return (Criteria) this;
        }

        public Criteria andWubiCodeIsNotNull() {
            addCriterion("WUBI_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andWubiCodeEqualTo(String value) {
            addCriterion("WUBI_CODE =", value, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeNotEqualTo(String value) {
            addCriterion("WUBI_CODE <>", value, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeGreaterThan(String value) {
            addCriterion("WUBI_CODE >", value, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("WUBI_CODE >=", value, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeLessThan(String value) {
            addCriterion("WUBI_CODE <", value, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeLessThanOrEqualTo(String value) {
            addCriterion("WUBI_CODE <=", value, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeLike(String value) {
            addCriterion("WUBI_CODE like", value, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeNotLike(String value) {
            addCriterion("WUBI_CODE not like", value, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeIn(List<String> values) {
            addCriterion("WUBI_CODE in", values, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeNotIn(List<String> values) {
            addCriterion("WUBI_CODE not in", values, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeBetween(String value1, String value2) {
            addCriterion("WUBI_CODE between", value1, value2, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andWubiCodeNotBetween(String value1, String value2) {
            addCriterion("WUBI_CODE not between", value1, value2, "wubiCode");
            return (Criteria) this;
        }

        public Criteria andDescnIsNull() {
            addCriterion("DESCN is null");
            return (Criteria) this;
        }

        public Criteria andDescnIsNotNull() {
            addCriterion("DESCN is not null");
            return (Criteria) this;
        }

        public Criteria andDescnEqualTo(String value) {
            addCriterion("DESCN =", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotEqualTo(String value) {
            addCriterion("DESCN <>", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnGreaterThan(String value) {
            addCriterion("DESCN >", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnGreaterThanOrEqualTo(String value) {
            addCriterion("DESCN >=", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnLessThan(String value) {
            addCriterion("DESCN <", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnLessThanOrEqualTo(String value) {
            addCriterion("DESCN <=", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnLike(String value) {
            addCriterion("DESCN like", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotLike(String value) {
            addCriterion("DESCN not like", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnIn(List<String> values) {
            addCriterion("DESCN in", values, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotIn(List<String> values) {
            addCriterion("DESCN not in", values, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnBetween(String value1, String value2) {
            addCriterion("DESCN between", value1, value2, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotBetween(String value1, String value2) {
            addCriterion("DESCN not between", value1, value2, "descn");
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