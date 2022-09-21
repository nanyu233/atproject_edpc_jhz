package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspMediaInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspMediaInfExample() {
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

        public Criteria andMedSeqIsNull() {
            addCriterion("MED_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andMedSeqIsNotNull() {
            addCriterion("MED_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andMedSeqEqualTo(String value) {
            addCriterion("MED_SEQ =", value, "medSeq");
            return (Criteria) this;
        }

        public Criteria andMedSeqNotEqualTo(String value) {
            addCriterion("MED_SEQ <>", value, "medSeq");
            return (Criteria) this;
        }

        public Criteria andMedSeqGreaterThan(String value) {
            addCriterion("MED_SEQ >", value, "medSeq");
            return (Criteria) this;
        }

        public Criteria andMedSeqGreaterThanOrEqualTo(String value) {
            addCriterion("MED_SEQ >=", value, "medSeq");
            return (Criteria) this;
        }

        public Criteria andMedSeqLessThan(String value) {
            addCriterion("MED_SEQ <", value, "medSeq");
            return (Criteria) this;
        }

        public Criteria andMedSeqLessThanOrEqualTo(String value) {
            addCriterion("MED_SEQ <=", value, "medSeq");
            return (Criteria) this;
        }

        public Criteria andMedSeqLike(String value) {
            addCriterion("MED_SEQ like", value, "medSeq");
            return (Criteria) this;
        }

        public Criteria andMedSeqNotLike(String value) {
            addCriterion("MED_SEQ not like", value, "medSeq");
            return (Criteria) this;
        }

        public Criteria andMedSeqIn(List<String> values) {
            addCriterion("MED_SEQ in", values, "medSeq");
            return (Criteria) this;
        }

        public Criteria andMedSeqNotIn(List<String> values) {
            addCriterion("MED_SEQ not in", values, "medSeq");
            return (Criteria) this;
        }

        public Criteria andMedSeqBetween(String value1, String value2) {
            addCriterion("MED_SEQ between", value1, value2, "medSeq");
            return (Criteria) this;
        }

        public Criteria andMedSeqNotBetween(String value1, String value2) {
            addCriterion("MED_SEQ not between", value1, value2, "medSeq");
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

        public Criteria andMedClassIsNull() {
            addCriterion("MED_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andMedClassIsNotNull() {
            addCriterion("MED_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andMedClassEqualTo(String value) {
            addCriterion("MED_CLASS =", value, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedClassNotEqualTo(String value) {
            addCriterion("MED_CLASS <>", value, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedClassGreaterThan(String value) {
            addCriterion("MED_CLASS >", value, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedClassGreaterThanOrEqualTo(String value) {
            addCriterion("MED_CLASS >=", value, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedClassLessThan(String value) {
            addCriterion("MED_CLASS <", value, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedClassLessThanOrEqualTo(String value) {
            addCriterion("MED_CLASS <=", value, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedClassLike(String value) {
            addCriterion("MED_CLASS like", value, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedClassNotLike(String value) {
            addCriterion("MED_CLASS not like", value, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedClassIn(List<String> values) {
            addCriterion("MED_CLASS in", values, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedClassNotIn(List<String> values) {
            addCriterion("MED_CLASS not in", values, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedClassBetween(String value1, String value2) {
            addCriterion("MED_CLASS between", value1, value2, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedClassNotBetween(String value1, String value2) {
            addCriterion("MED_CLASS not between", value1, value2, "medClass");
            return (Criteria) this;
        }

        public Criteria andMedNameIsNull() {
            addCriterion("MED_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMedNameIsNotNull() {
            addCriterion("MED_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMedNameEqualTo(String value) {
            addCriterion("MED_NAME =", value, "medName");
            return (Criteria) this;
        }

        public Criteria andMedNameNotEqualTo(String value) {
            addCriterion("MED_NAME <>", value, "medName");
            return (Criteria) this;
        }

        public Criteria andMedNameGreaterThan(String value) {
            addCriterion("MED_NAME >", value, "medName");
            return (Criteria) this;
        }

        public Criteria andMedNameGreaterThanOrEqualTo(String value) {
            addCriterion("MED_NAME >=", value, "medName");
            return (Criteria) this;
        }

        public Criteria andMedNameLessThan(String value) {
            addCriterion("MED_NAME <", value, "medName");
            return (Criteria) this;
        }

        public Criteria andMedNameLessThanOrEqualTo(String value) {
            addCriterion("MED_NAME <=", value, "medName");
            return (Criteria) this;
        }

        public Criteria andMedNameLike(String value) {
            addCriterion("MED_NAME like", value, "medName");
            return (Criteria) this;
        }

        public Criteria andMedNameNotLike(String value) {
            addCriterion("MED_NAME not like", value, "medName");
            return (Criteria) this;
        }

        public Criteria andMedNameIn(List<String> values) {
            addCriterion("MED_NAME in", values, "medName");
            return (Criteria) this;
        }

        public Criteria andMedNameNotIn(List<String> values) {
            addCriterion("MED_NAME not in", values, "medName");
            return (Criteria) this;
        }

        public Criteria andMedNameBetween(String value1, String value2) {
            addCriterion("MED_NAME between", value1, value2, "medName");
            return (Criteria) this;
        }

        public Criteria andMedNameNotBetween(String value1, String value2) {
            addCriterion("MED_NAME not between", value1, value2, "medName");
            return (Criteria) this;
        }

        public Criteria andMedFileIsNull() {
            addCriterion("MED_FILE is null");
            return (Criteria) this;
        }

        public Criteria andMedFileIsNotNull() {
            addCriterion("MED_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andMedFileEqualTo(String value) {
            addCriterion("MED_FILE =", value, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedFileNotEqualTo(String value) {
            addCriterion("MED_FILE <>", value, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedFileGreaterThan(String value) {
            addCriterion("MED_FILE >", value, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedFileGreaterThanOrEqualTo(String value) {
            addCriterion("MED_FILE >=", value, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedFileLessThan(String value) {
            addCriterion("MED_FILE <", value, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedFileLessThanOrEqualTo(String value) {
            addCriterion("MED_FILE <=", value, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedFileLike(String value) {
            addCriterion("MED_FILE like", value, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedFileNotLike(String value) {
            addCriterion("MED_FILE not like", value, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedFileIn(List<String> values) {
            addCriterion("MED_FILE in", values, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedFileNotIn(List<String> values) {
            addCriterion("MED_FILE not in", values, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedFileBetween(String value1, String value2) {
            addCriterion("MED_FILE between", value1, value2, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedFileNotBetween(String value1, String value2) {
            addCriterion("MED_FILE not between", value1, value2, "medFile");
            return (Criteria) this;
        }

        public Criteria andMedExtendIsNull() {
            addCriterion("MED_EXTEND is null");
            return (Criteria) this;
        }

        public Criteria andMedExtendIsNotNull() {
            addCriterion("MED_EXTEND is not null");
            return (Criteria) this;
        }

        public Criteria andMedExtendEqualTo(String value) {
            addCriterion("MED_EXTEND =", value, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedExtendNotEqualTo(String value) {
            addCriterion("MED_EXTEND <>", value, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedExtendGreaterThan(String value) {
            addCriterion("MED_EXTEND >", value, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedExtendGreaterThanOrEqualTo(String value) {
            addCriterion("MED_EXTEND >=", value, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedExtendLessThan(String value) {
            addCriterion("MED_EXTEND <", value, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedExtendLessThanOrEqualTo(String value) {
            addCriterion("MED_EXTEND <=", value, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedExtendLike(String value) {
            addCriterion("MED_EXTEND like", value, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedExtendNotLike(String value) {
            addCriterion("MED_EXTEND not like", value, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedExtendIn(List<String> values) {
            addCriterion("MED_EXTEND in", values, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedExtendNotIn(List<String> values) {
            addCriterion("MED_EXTEND not in", values, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedExtendBetween(String value1, String value2) {
            addCriterion("MED_EXTEND between", value1, value2, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedExtendNotBetween(String value1, String value2) {
            addCriterion("MED_EXTEND not between", value1, value2, "medExtend");
            return (Criteria) this;
        }

        public Criteria andMedTypeIsNull() {
            addCriterion("MED_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMedTypeIsNotNull() {
            addCriterion("MED_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMedTypeEqualTo(String value) {
            addCriterion("MED_TYPE =", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeNotEqualTo(String value) {
            addCriterion("MED_TYPE <>", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeGreaterThan(String value) {
            addCriterion("MED_TYPE >", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MED_TYPE >=", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeLessThan(String value) {
            addCriterion("MED_TYPE <", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeLessThanOrEqualTo(String value) {
            addCriterion("MED_TYPE <=", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeLike(String value) {
            addCriterion("MED_TYPE like", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeNotLike(String value) {
            addCriterion("MED_TYPE not like", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeIn(List<String> values) {
            addCriterion("MED_TYPE in", values, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeNotIn(List<String> values) {
            addCriterion("MED_TYPE not in", values, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeBetween(String value1, String value2) {
            addCriterion("MED_TYPE between", value1, value2, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeNotBetween(String value1, String value2) {
            addCriterion("MED_TYPE not between", value1, value2, "medType");
            return (Criteria) this;
        }

        public Criteria andMedDateIsNull() {
            addCriterion("MED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMedDateIsNotNull() {
            addCriterion("MED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMedDateEqualTo(Date value) {
            addCriterion("MED_DATE =", value, "medDate");
            return (Criteria) this;
        }

        public Criteria andMedDateNotEqualTo(Date value) {
            addCriterion("MED_DATE <>", value, "medDate");
            return (Criteria) this;
        }

        public Criteria andMedDateGreaterThan(Date value) {
            addCriterion("MED_DATE >", value, "medDate");
            return (Criteria) this;
        }

        public Criteria andMedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MED_DATE >=", value, "medDate");
            return (Criteria) this;
        }

        public Criteria andMedDateLessThan(Date value) {
            addCriterion("MED_DATE <", value, "medDate");
            return (Criteria) this;
        }

        public Criteria andMedDateLessThanOrEqualTo(Date value) {
            addCriterion("MED_DATE <=", value, "medDate");
            return (Criteria) this;
        }

        public Criteria andMedDateIn(List<Date> values) {
            addCriterion("MED_DATE in", values, "medDate");
            return (Criteria) this;
        }

        public Criteria andMedDateNotIn(List<Date> values) {
            addCriterion("MED_DATE not in", values, "medDate");
            return (Criteria) this;
        }

        public Criteria andMedDateBetween(Date value1, Date value2) {
            addCriterion("MED_DATE between", value1, value2, "medDate");
            return (Criteria) this;
        }

        public Criteria andMedDateNotBetween(Date value1, Date value2) {
            addCriterion("MED_DATE not between", value1, value2, "medDate");
            return (Criteria) this;
        }

        public Criteria andMedSizeIsNull() {
            addCriterion("MED_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andMedSizeIsNotNull() {
            addCriterion("MED_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andMedSizeEqualTo(Long value) {
            addCriterion("MED_SIZE =", value, "medSize");
            return (Criteria) this;
        }

        public Criteria andMedSizeNotEqualTo(Long value) {
            addCriterion("MED_SIZE <>", value, "medSize");
            return (Criteria) this;
        }

        public Criteria andMedSizeGreaterThan(Long value) {
            addCriterion("MED_SIZE >", value, "medSize");
            return (Criteria) this;
        }

        public Criteria andMedSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("MED_SIZE >=", value, "medSize");
            return (Criteria) this;
        }

        public Criteria andMedSizeLessThan(Long value) {
            addCriterion("MED_SIZE <", value, "medSize");
            return (Criteria) this;
        }

        public Criteria andMedSizeLessThanOrEqualTo(Long value) {
            addCriterion("MED_SIZE <=", value, "medSize");
            return (Criteria) this;
        }

        public Criteria andMedSizeIn(List<Long> values) {
            addCriterion("MED_SIZE in", values, "medSize");
            return (Criteria) this;
        }

        public Criteria andMedSizeNotIn(List<Long> values) {
            addCriterion("MED_SIZE not in", values, "medSize");
            return (Criteria) this;
        }

        public Criteria andMedSizeBetween(Long value1, Long value2) {
            addCriterion("MED_SIZE between", value1, value2, "medSize");
            return (Criteria) this;
        }

        public Criteria andMedSizeNotBetween(Long value1, Long value2) {
            addCriterion("MED_SIZE not between", value1, value2, "medSize");
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