package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HspCspfResExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCspfResExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andAisScoeIsNull() {
            addCriterion("AIS_SCOE is null");
            return (Criteria) this;
        }

        public Criteria andAisScoeIsNotNull() {
            addCriterion("AIS_SCOE is not null");
            return (Criteria) this;
        }

        public Criteria andAisScoeEqualTo(Short value) {
            addCriterion("AIS_SCOE =", value, "aisScoe");
            return (Criteria) this;
        }

        public Criteria andAisScoeNotEqualTo(Short value) {
            addCriterion("AIS_SCOE <>", value, "aisScoe");
            return (Criteria) this;
        }

        public Criteria andAisScoeGreaterThan(Short value) {
            addCriterion("AIS_SCOE >", value, "aisScoe");
            return (Criteria) this;
        }

        public Criteria andAisScoeGreaterThanOrEqualTo(Short value) {
            addCriterion("AIS_SCOE >=", value, "aisScoe");
            return (Criteria) this;
        }

        public Criteria andAisScoeLessThan(Short value) {
            addCriterion("AIS_SCOE <", value, "aisScoe");
            return (Criteria) this;
        }

        public Criteria andAisScoeLessThanOrEqualTo(Short value) {
            addCriterion("AIS_SCOE <=", value, "aisScoe");
            return (Criteria) this;
        }

        public Criteria andAisScoeIn(List<Short> values) {
            addCriterion("AIS_SCOE in", values, "aisScoe");
            return (Criteria) this;
        }

        public Criteria andAisScoeNotIn(List<Short> values) {
            addCriterion("AIS_SCOE not in", values, "aisScoe");
            return (Criteria) this;
        }

        public Criteria andAisScoeBetween(Short value1, Short value2) {
            addCriterion("AIS_SCOE between", value1, value2, "aisScoe");
            return (Criteria) this;
        }

        public Criteria andAisScoeNotBetween(Short value1, Short value2) {
            addCriterion("AIS_SCOE not between", value1, value2, "aisScoe");
            return (Criteria) this;
        }

        public Criteria andIssScoeIsNull() {
            addCriterion("ISS_SCOE is null");
            return (Criteria) this;
        }

        public Criteria andIssScoeIsNotNull() {
            addCriterion("ISS_SCOE is not null");
            return (Criteria) this;
        }

        public Criteria andIssScoeEqualTo(Short value) {
            addCriterion("ISS_SCOE =", value, "issScoe");
            return (Criteria) this;
        }

        public Criteria andIssScoeNotEqualTo(Short value) {
            addCriterion("ISS_SCOE <>", value, "issScoe");
            return (Criteria) this;
        }

        public Criteria andIssScoeGreaterThan(Short value) {
            addCriterion("ISS_SCOE >", value, "issScoe");
            return (Criteria) this;
        }

        public Criteria andIssScoeGreaterThanOrEqualTo(Short value) {
            addCriterion("ISS_SCOE >=", value, "issScoe");
            return (Criteria) this;
        }

        public Criteria andIssScoeLessThan(Short value) {
            addCriterion("ISS_SCOE <", value, "issScoe");
            return (Criteria) this;
        }

        public Criteria andIssScoeLessThanOrEqualTo(Short value) {
            addCriterion("ISS_SCOE <=", value, "issScoe");
            return (Criteria) this;
        }

        public Criteria andIssScoeIn(List<Short> values) {
            addCriterion("ISS_SCOE in", values, "issScoe");
            return (Criteria) this;
        }

        public Criteria andIssScoeNotIn(List<Short> values) {
            addCriterion("ISS_SCOE not in", values, "issScoe");
            return (Criteria) this;
        }

        public Criteria andIssScoeBetween(Short value1, Short value2) {
            addCriterion("ISS_SCOE between", value1, value2, "issScoe");
            return (Criteria) this;
        }

        public Criteria andIssScoeNotBetween(Short value1, Short value2) {
            addCriterion("ISS_SCOE not between", value1, value2, "issScoe");
            return (Criteria) this;
        }

        public Criteria andResDescIsNull() {
            addCriterion("RES_DESC is null");
            return (Criteria) this;
        }

        public Criteria andResDescIsNotNull() {
            addCriterion("RES_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andResDescEqualTo(String value) {
            addCriterion("RES_DESC =", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotEqualTo(String value) {
            addCriterion("RES_DESC <>", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThan(String value) {
            addCriterion("RES_DESC >", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThanOrEqualTo(String value) {
            addCriterion("RES_DESC >=", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLessThan(String value) {
            addCriterion("RES_DESC <", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLessThanOrEqualTo(String value) {
            addCriterion("RES_DESC <=", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLike(String value) {
            addCriterion("RES_DESC like", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotLike(String value) {
            addCriterion("RES_DESC not like", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescIn(List<String> values) {
            addCriterion("RES_DESC in", values, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotIn(List<String> values) {
            addCriterion("RES_DESC not in", values, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescBetween(String value1, String value2) {
            addCriterion("RES_DESC between", value1, value2, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotBetween(String value1, String value2) {
            addCriterion("RES_DESC not between", value1, value2, "resDesc");
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
            addCriterionForJDBCDate("CRT_TIME =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIME <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CRT_TIME >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIME >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterionForJDBCDate("CRT_TIME <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIME <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_TIME in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_TIME not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_TIME between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_TIME not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andUsrNoIsNull() {
            addCriterion("USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andUsrNoIsNotNull() {
            addCriterion("USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNoEqualTo(String value) {
            addCriterion("USR_NO =", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotEqualTo(String value) {
            addCriterion("USR_NO <>", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoGreaterThan(String value) {
            addCriterion("USR_NO >", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NO >=", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoLessThan(String value) {
            addCriterion("USR_NO <", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoLessThanOrEqualTo(String value) {
            addCriterion("USR_NO <=", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoLike(String value) {
            addCriterion("USR_NO like", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotLike(String value) {
            addCriterion("USR_NO not like", value, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoIn(List<String> values) {
            addCriterion("USR_NO in", values, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotIn(List<String> values) {
            addCriterion("USR_NO not in", values, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoBetween(String value1, String value2) {
            addCriterion("USR_NO between", value1, value2, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNoNotBetween(String value1, String value2) {
            addCriterion("USR_NO not between", value1, value2, "usrNo");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNull() {
            addCriterion("USR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNotNull() {
            addCriterion("USR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNameEqualTo(String value) {
            addCriterion("USR_NAME =", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotEqualTo(String value) {
            addCriterion("USR_NAME <>", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThan(String value) {
            addCriterion("USR_NAME >", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NAME >=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThan(String value) {
            addCriterion("USR_NAME <", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThanOrEqualTo(String value) {
            addCriterion("USR_NAME <=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLike(String value) {
            addCriterion("USR_NAME like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotLike(String value) {
            addCriterion("USR_NAME not like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameIn(List<String> values) {
            addCriterion("USR_NAME in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotIn(List<String> values) {
            addCriterion("USR_NAME not in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameBetween(String value1, String value2) {
            addCriterion("USR_NAME between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotBetween(String value1, String value2) {
            addCriterion("USR_NAME not between", value1, value2, "usrName");
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