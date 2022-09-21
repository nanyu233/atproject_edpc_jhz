package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspDgpgclrInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDgpgclrInfExample() {
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

        public Criteria andXtpgSeqIsNull() {
            addCriterion("XTPG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIsNotNull() {
            addCriterion("XTPG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqEqualTo(String value) {
            addCriterion("XTPG_SEQ =", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotEqualTo(String value) {
            addCriterion("XTPG_SEQ <>", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThan(String value) {
            addCriterion("XTPG_SEQ >", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ >=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThan(String value) {
            addCriterion("XTPG_SEQ <", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ <=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLike(String value) {
            addCriterion("XTPG_SEQ like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotLike(String value) {
            addCriterion("XTPG_SEQ not like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIn(List<String> values) {
            addCriterion("XTPG_SEQ in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotIn(List<String> values) {
            addCriterion("XTPG_SEQ not in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ between", value1, value2, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ not between", value1, value2, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodIsNull() {
            addCriterion("YLG_DGMC_COD is null");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodIsNotNull() {
            addCriterion("YLG_DGMC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodEqualTo(String value) {
            addCriterion("YLG_DGMC_COD =", value, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodNotEqualTo(String value) {
            addCriterion("YLG_DGMC_COD <>", value, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodGreaterThan(String value) {
            addCriterion("YLG_DGMC_COD >", value, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodGreaterThanOrEqualTo(String value) {
            addCriterion("YLG_DGMC_COD >=", value, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodLessThan(String value) {
            addCriterion("YLG_DGMC_COD <", value, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodLessThanOrEqualTo(String value) {
            addCriterion("YLG_DGMC_COD <=", value, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodLike(String value) {
            addCriterion("YLG_DGMC_COD like", value, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodNotLike(String value) {
            addCriterion("YLG_DGMC_COD not like", value, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodIn(List<String> values) {
            addCriterion("YLG_DGMC_COD in", values, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodNotIn(List<String> values) {
            addCriterion("YLG_DGMC_COD not in", values, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodBetween(String value1, String value2) {
            addCriterion("YLG_DGMC_COD between", value1, value2, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andYlgDgmcCodNotBetween(String value1, String value2) {
            addCriterion("YLG_DGMC_COD not between", value1, value2, "ylgDgmcCod");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdIsNull() {
            addCriterion("DGPGCLR_DGSD is null");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdIsNotNull() {
            addCriterion("DGPGCLR_DGSD is not null");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdEqualTo(String value) {
            addCriterion("DGPGCLR_DGSD =", value, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdNotEqualTo(String value) {
            addCriterion("DGPGCLR_DGSD <>", value, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdGreaterThan(String value) {
            addCriterion("DGPGCLR_DGSD >", value, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdGreaterThanOrEqualTo(String value) {
            addCriterion("DGPGCLR_DGSD >=", value, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdLessThan(String value) {
            addCriterion("DGPGCLR_DGSD <", value, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdLessThanOrEqualTo(String value) {
            addCriterion("DGPGCLR_DGSD <=", value, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdLike(String value) {
            addCriterion("DGPGCLR_DGSD like", value, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdNotLike(String value) {
            addCriterion("DGPGCLR_DGSD not like", value, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdIn(List<String> values) {
            addCriterion("DGPGCLR_DGSD in", values, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdNotIn(List<String> values) {
            addCriterion("DGPGCLR_DGSD not in", values, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdBetween(String value1, String value2) {
            addCriterion("DGPGCLR_DGSD between", value1, value2, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrDgsdNotBetween(String value1, String value2) {
            addCriterion("DGPGCLR_DGSD not between", value1, value2, "dgpgclrDgsd");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcIsNull() {
            addCriterion("DGPGCLR_TC is null");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcIsNotNull() {
            addCriterion("DGPGCLR_TC is not null");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcEqualTo(String value) {
            addCriterion("DGPGCLR_TC =", value, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcNotEqualTo(String value) {
            addCriterion("DGPGCLR_TC <>", value, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcGreaterThan(String value) {
            addCriterion("DGPGCLR_TC >", value, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcGreaterThanOrEqualTo(String value) {
            addCriterion("DGPGCLR_TC >=", value, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcLessThan(String value) {
            addCriterion("DGPGCLR_TC <", value, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcLessThanOrEqualTo(String value) {
            addCriterion("DGPGCLR_TC <=", value, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcLike(String value) {
            addCriterion("DGPGCLR_TC like", value, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcNotLike(String value) {
            addCriterion("DGPGCLR_TC not like", value, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcIn(List<String> values) {
            addCriterion("DGPGCLR_TC in", values, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcNotIn(List<String> values) {
            addCriterion("DGPGCLR_TC not in", values, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcBetween(String value1, String value2) {
            addCriterion("DGPGCLR_TC between", value1, value2, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTcNotBetween(String value1, String value2) {
            addCriterion("DGPGCLR_TC not between", value1, value2, "dgpgclrTc");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysIsNull() {
            addCriterion("DGPGCLR_YLYYS is null");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysIsNotNull() {
            addCriterion("DGPGCLR_YLYYS is not null");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysEqualTo(String value) {
            addCriterion("DGPGCLR_YLYYS =", value, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysNotEqualTo(String value) {
            addCriterion("DGPGCLR_YLYYS <>", value, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysGreaterThan(String value) {
            addCriterion("DGPGCLR_YLYYS >", value, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysGreaterThanOrEqualTo(String value) {
            addCriterion("DGPGCLR_YLYYS >=", value, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysLessThan(String value) {
            addCriterion("DGPGCLR_YLYYS <", value, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysLessThanOrEqualTo(String value) {
            addCriterion("DGPGCLR_YLYYS <=", value, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysLike(String value) {
            addCriterion("DGPGCLR_YLYYS like", value, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysNotLike(String value) {
            addCriterion("DGPGCLR_YLYYS not like", value, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysIn(List<String> values) {
            addCriterion("DGPGCLR_YLYYS in", values, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysNotIn(List<String> values) {
            addCriterion("DGPGCLR_YLYYS not in", values, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysBetween(String value1, String value2) {
            addCriterion("DGPGCLR_YLYYS between", value1, value2, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrYlyysNotBetween(String value1, String value2) {
            addCriterion("DGPGCLR_YLYYS not between", value1, value2, "dgpgclrYlyys");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeIsNull() {
            addCriterion("DGPGCLR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeIsNotNull() {
            addCriterion("DGPGCLR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeEqualTo(String value) {
            addCriterion("DGPGCLR_TYPE =", value, "dgpgclrType");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeNotEqualTo(String value) {
            addCriterion("DGPGCLR_TYPE <>", value, "dgpgclrType");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeGreaterThan(String value) {
            addCriterion("DGPGCLR_TYPE >", value, "dgpgclrType");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DGPGCLR_TYPE >=", value, "dgpgclrType");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeLessThan(String value) {
            addCriterion("DGPGCLR_TYPE <", value, "dgpgclrType");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeLessThanOrEqualTo(String value) {
            addCriterion("DGPGCLR_TYPE <=", value, "dgpgclrType");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeLike(String value) {
            addCriterion("DGPGCLR_TYPE like", value, "dgpgclrType");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeNotLike(String value) {
            addCriterion("DGPGCLR_TYPE not like", value, "dgpgclrType");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeIn(List<String> values) {
            addCriterion("DGPGCLR_TYPE in", values, "dgpgclrType");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeNotIn(List<String> values) {
            addCriterion("DGPGCLR_TYPE not in", values, "dgpgclrType");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeBetween(String value1, String value2) {
            addCriterion("DGPGCLR_TYPE between", value1, value2, "dgpgclrType");
            return (Criteria) this;
        }

        public Criteria andDgpgclrTypeNotBetween(String value1, String value2) {
            addCriterion("DGPGCLR_TYPE not between", value1, value2, "dgpgclrType");
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