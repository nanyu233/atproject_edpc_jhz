package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspDzblDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDzblDictExample() {
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

        public Criteria andMbSeqIsNull() {
            addCriterion("MB_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andMbSeqIsNotNull() {
            addCriterion("MB_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andMbSeqEqualTo(String value) {
            addCriterion("MB_SEQ =", value, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbSeqNotEqualTo(String value) {
            addCriterion("MB_SEQ <>", value, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbSeqGreaterThan(String value) {
            addCriterion("MB_SEQ >", value, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbSeqGreaterThanOrEqualTo(String value) {
            addCriterion("MB_SEQ >=", value, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbSeqLessThan(String value) {
            addCriterion("MB_SEQ <", value, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbSeqLessThanOrEqualTo(String value) {
            addCriterion("MB_SEQ <=", value, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbSeqLike(String value) {
            addCriterion("MB_SEQ like", value, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbSeqNotLike(String value) {
            addCriterion("MB_SEQ not like", value, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbSeqIn(List<String> values) {
            addCriterion("MB_SEQ in", values, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbSeqNotIn(List<String> values) {
            addCriterion("MB_SEQ not in", values, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbSeqBetween(String value1, String value2) {
            addCriterion("MB_SEQ between", value1, value2, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbSeqNotBetween(String value1, String value2) {
            addCriterion("MB_SEQ not between", value1, value2, "mbSeq");
            return (Criteria) this;
        }

        public Criteria andMbTitleIsNull() {
            addCriterion("MB_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andMbTitleIsNotNull() {
            addCriterion("MB_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMbTitleEqualTo(String value) {
            addCriterion("MB_TITLE =", value, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTitleNotEqualTo(String value) {
            addCriterion("MB_TITLE <>", value, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTitleGreaterThan(String value) {
            addCriterion("MB_TITLE >", value, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTitleGreaterThanOrEqualTo(String value) {
            addCriterion("MB_TITLE >=", value, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTitleLessThan(String value) {
            addCriterion("MB_TITLE <", value, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTitleLessThanOrEqualTo(String value) {
            addCriterion("MB_TITLE <=", value, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTitleLike(String value) {
            addCriterion("MB_TITLE like", value, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTitleNotLike(String value) {
            addCriterion("MB_TITLE not like", value, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTitleIn(List<String> values) {
            addCriterion("MB_TITLE in", values, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTitleNotIn(List<String> values) {
            addCriterion("MB_TITLE not in", values, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTitleBetween(String value1, String value2) {
            addCriterion("MB_TITLE between", value1, value2, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTitleNotBetween(String value1, String value2) {
            addCriterion("MB_TITLE not between", value1, value2, "mbTitle");
            return (Criteria) this;
        }

        public Criteria andMbTypeIsNull() {
            addCriterion("MB_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMbTypeIsNotNull() {
            addCriterion("MB_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMbTypeEqualTo(String value) {
            addCriterion("MB_TYPE =", value, "mbType");
            return (Criteria) this;
        }

        public Criteria andMbTypeNotEqualTo(String value) {
            addCriterion("MB_TYPE <>", value, "mbType");
            return (Criteria) this;
        }

        public Criteria andMbTypeGreaterThan(String value) {
            addCriterion("MB_TYPE >", value, "mbType");
            return (Criteria) this;
        }

        public Criteria andMbTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MB_TYPE >=", value, "mbType");
            return (Criteria) this;
        }

        public Criteria andMbTypeLessThan(String value) {
            addCriterion("MB_TYPE <", value, "mbType");
            return (Criteria) this;
        }

        public Criteria andMbTypeLessThanOrEqualTo(String value) {
            addCriterion("MB_TYPE <=", value, "mbType");
            return (Criteria) this;
        }

        public Criteria andMbTypeLike(String value) {
            addCriterion("MB_TYPE like", value, "mbType");
            return (Criteria) this;
        }

        public Criteria andMbTypeNotLike(String value) {
            addCriterion("MB_TYPE not like", value, "mbType");
            return (Criteria) this;
        }

        public Criteria andMbTypeIn(List<String> values) {
            addCriterion("MB_TYPE in", values, "mbType");
            return (Criteria) this;
        }

        public Criteria andMbTypeNotIn(List<String> values) {
            addCriterion("MB_TYPE not in", values, "mbType");
            return (Criteria) this;
        }

        public Criteria andMbTypeBetween(String value1, String value2) {
            addCriterion("MB_TYPE between", value1, value2, "mbType");
            return (Criteria) this;
        }

        public Criteria andMbTypeNotBetween(String value1, String value2) {
            addCriterion("MB_TYPE not between", value1, value2, "mbType");
            return (Criteria) this;
        }

        public Criteria andTyTypeIsNull() {
            addCriterion("TY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTyTypeIsNotNull() {
            addCriterion("TY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTyTypeEqualTo(String value) {
            addCriterion("TY_TYPE =", value, "tyType");
            return (Criteria) this;
        }

        public Criteria andTyTypeNotEqualTo(String value) {
            addCriterion("TY_TYPE <>", value, "tyType");
            return (Criteria) this;
        }

        public Criteria andTyTypeGreaterThan(String value) {
            addCriterion("TY_TYPE >", value, "tyType");
            return (Criteria) this;
        }

        public Criteria andTyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TY_TYPE >=", value, "tyType");
            return (Criteria) this;
        }

        public Criteria andTyTypeLessThan(String value) {
            addCriterion("TY_TYPE <", value, "tyType");
            return (Criteria) this;
        }

        public Criteria andTyTypeLessThanOrEqualTo(String value) {
            addCriterion("TY_TYPE <=", value, "tyType");
            return (Criteria) this;
        }

        public Criteria andTyTypeLike(String value) {
            addCriterion("TY_TYPE like", value, "tyType");
            return (Criteria) this;
        }

        public Criteria andTyTypeNotLike(String value) {
            addCriterion("TY_TYPE not like", value, "tyType");
            return (Criteria) this;
        }

        public Criteria andTyTypeIn(List<String> values) {
            addCriterion("TY_TYPE in", values, "tyType");
            return (Criteria) this;
        }

        public Criteria andTyTypeNotIn(List<String> values) {
            addCriterion("TY_TYPE not in", values, "tyType");
            return (Criteria) this;
        }

        public Criteria andTyTypeBetween(String value1, String value2) {
            addCriterion("TY_TYPE between", value1, value2, "tyType");
            return (Criteria) this;
        }

        public Criteria andTyTypeNotBetween(String value1, String value2) {
            addCriterion("TY_TYPE not between", value1, value2, "tyType");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodIsNull() {
            addCriterion("EMG_FK_COD is null");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodIsNotNull() {
            addCriterion("EMG_FK_COD is not null");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodEqualTo(String value) {
            addCriterion("EMG_FK_COD =", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodNotEqualTo(String value) {
            addCriterion("EMG_FK_COD <>", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodGreaterThan(String value) {
            addCriterion("EMG_FK_COD >", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_FK_COD >=", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodLessThan(String value) {
            addCriterion("EMG_FK_COD <", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodLessThanOrEqualTo(String value) {
            addCriterion("EMG_FK_COD <=", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodLike(String value) {
            addCriterion("EMG_FK_COD like", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodNotLike(String value) {
            addCriterion("EMG_FK_COD not like", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodIn(List<String> values) {
            addCriterion("EMG_FK_COD in", values, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodNotIn(List<String> values) {
            addCriterion("EMG_FK_COD not in", values, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodBetween(String value1, String value2) {
            addCriterion("EMG_FK_COD between", value1, value2, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodNotBetween(String value1, String value2) {
            addCriterion("EMG_FK_COD not between", value1, value2, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andMbContentIsNull() {
            addCriterion("MB_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMbContentIsNotNull() {
            addCriterion("MB_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMbContentEqualTo(String value) {
            addCriterion("MB_CONTENT =", value, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbContentNotEqualTo(String value) {
            addCriterion("MB_CONTENT <>", value, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbContentGreaterThan(String value) {
            addCriterion("MB_CONTENT >", value, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbContentGreaterThanOrEqualTo(String value) {
            addCriterion("MB_CONTENT >=", value, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbContentLessThan(String value) {
            addCriterion("MB_CONTENT <", value, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbContentLessThanOrEqualTo(String value) {
            addCriterion("MB_CONTENT <=", value, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbContentLike(String value) {
            addCriterion("MB_CONTENT like", value, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbContentNotLike(String value) {
            addCriterion("MB_CONTENT not like", value, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbContentIn(List<String> values) {
            addCriterion("MB_CONTENT in", values, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbContentNotIn(List<String> values) {
            addCriterion("MB_CONTENT not in", values, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbContentBetween(String value1, String value2) {
            addCriterion("MB_CONTENT between", value1, value2, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbContentNotBetween(String value1, String value2) {
            addCriterion("MB_CONTENT not between", value1, value2, "mbContent");
            return (Criteria) this;
        }

        public Criteria andMbSortIsNull() {
            addCriterion("MB_SORT is null");
            return (Criteria) this;
        }

        public Criteria andMbSortIsNotNull() {
            addCriterion("MB_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andMbSortEqualTo(Integer value) {
            addCriterion("MB_SORT =", value, "mbSort");
            return (Criteria) this;
        }

        public Criteria andMbSortNotEqualTo(Integer value) {
            addCriterion("MB_SORT <>", value, "mbSort");
            return (Criteria) this;
        }

        public Criteria andMbSortGreaterThan(Integer value) {
            addCriterion("MB_SORT >", value, "mbSort");
            return (Criteria) this;
        }

        public Criteria andMbSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("MB_SORT >=", value, "mbSort");
            return (Criteria) this;
        }

        public Criteria andMbSortLessThan(Integer value) {
            addCriterion("MB_SORT <", value, "mbSort");
            return (Criteria) this;
        }

        public Criteria andMbSortLessThanOrEqualTo(Integer value) {
            addCriterion("MB_SORT <=", value, "mbSort");
            return (Criteria) this;
        }

        public Criteria andMbSortIn(List<Integer> values) {
            addCriterion("MB_SORT in", values, "mbSort");
            return (Criteria) this;
        }

        public Criteria andMbSortNotIn(List<Integer> values) {
            addCriterion("MB_SORT not in", values, "mbSort");
            return (Criteria) this;
        }

        public Criteria andMbSortBetween(Integer value1, Integer value2) {
            addCriterion("MB_SORT between", value1, value2, "mbSort");
            return (Criteria) this;
        }

        public Criteria andMbSortNotBetween(Integer value1, Integer value2) {
            addCriterion("MB_SORT not between", value1, value2, "mbSort");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserIsNull() {
            addCriterion("MB_CRT_USER is null");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserIsNotNull() {
            addCriterion("MB_CRT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserEqualTo(String value) {
            addCriterion("MB_CRT_USER =", value, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserNotEqualTo(String value) {
            addCriterion("MB_CRT_USER <>", value, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserGreaterThan(String value) {
            addCriterion("MB_CRT_USER >", value, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserGreaterThanOrEqualTo(String value) {
            addCriterion("MB_CRT_USER >=", value, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserLessThan(String value) {
            addCriterion("MB_CRT_USER <", value, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserLessThanOrEqualTo(String value) {
            addCriterion("MB_CRT_USER <=", value, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserLike(String value) {
            addCriterion("MB_CRT_USER like", value, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserNotLike(String value) {
            addCriterion("MB_CRT_USER not like", value, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserIn(List<String> values) {
            addCriterion("MB_CRT_USER in", values, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserNotIn(List<String> values) {
            addCriterion("MB_CRT_USER not in", values, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserBetween(String value1, String value2) {
            addCriterion("MB_CRT_USER between", value1, value2, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtUserNotBetween(String value1, String value2) {
            addCriterion("MB_CRT_USER not between", value1, value2, "mbCrtUser");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeIsNull() {
            addCriterion("MB_CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeIsNotNull() {
            addCriterion("MB_CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeEqualTo(Date value) {
            addCriterion("MB_CRT_TIME =", value, "mbCrtTime");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeNotEqualTo(Date value) {
            addCriterion("MB_CRT_TIME <>", value, "mbCrtTime");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeGreaterThan(Date value) {
            addCriterion("MB_CRT_TIME >", value, "mbCrtTime");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MB_CRT_TIME >=", value, "mbCrtTime");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeLessThan(Date value) {
            addCriterion("MB_CRT_TIME <", value, "mbCrtTime");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("MB_CRT_TIME <=", value, "mbCrtTime");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeIn(List<Date> values) {
            addCriterion("MB_CRT_TIME in", values, "mbCrtTime");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeNotIn(List<Date> values) {
            addCriterion("MB_CRT_TIME not in", values, "mbCrtTime");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeBetween(Date value1, Date value2) {
            addCriterion("MB_CRT_TIME between", value1, value2, "mbCrtTime");
            return (Criteria) this;
        }

        public Criteria andMbCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("MB_CRT_TIME not between", value1, value2, "mbCrtTime");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameIsNull() {
            addCriterion("MB_CRT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameIsNotNull() {
            addCriterion("MB_CRT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameEqualTo(String value) {
            addCriterion("MB_CRT_NAME =", value, "mbCrtName");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameNotEqualTo(String value) {
            addCriterion("MB_CRT_NAME <>", value, "mbCrtName");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameGreaterThan(String value) {
            addCriterion("MB_CRT_NAME >", value, "mbCrtName");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameGreaterThanOrEqualTo(String value) {
            addCriterion("MB_CRT_NAME >=", value, "mbCrtName");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameLessThan(String value) {
            addCriterion("MB_CRT_NAME <", value, "mbCrtName");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameLessThanOrEqualTo(String value) {
            addCriterion("MB_CRT_NAME <=", value, "mbCrtName");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameLike(String value) {
            addCriterion("MB_CRT_NAME like", value, "mbCrtName");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameNotLike(String value) {
            addCriterion("MB_CRT_NAME not like", value, "mbCrtName");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameIn(List<String> values) {
            addCriterion("MB_CRT_NAME in", values, "mbCrtName");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameNotIn(List<String> values) {
            addCriterion("MB_CRT_NAME not in", values, "mbCrtName");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameBetween(String value1, String value2) {
            addCriterion("MB_CRT_NAME between", value1, value2, "mbCrtName");
            return (Criteria) this;
        }

        public Criteria andMbCrtNameNotBetween(String value1, String value2) {
            addCriterion("MB_CRT_NAME not between", value1, value2, "mbCrtName");
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