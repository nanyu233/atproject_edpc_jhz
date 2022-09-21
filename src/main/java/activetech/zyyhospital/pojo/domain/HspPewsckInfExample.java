package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspPewsckInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspPewsckInfExample() {
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

        public Criteria andActionCodIsNull() {
            addCriterion("ACTION_COD is null");
            return (Criteria) this;
        }

        public Criteria andActionCodIsNotNull() {
            addCriterion("ACTION_COD is not null");
            return (Criteria) this;
        }

        public Criteria andActionCodEqualTo(String value) {
            addCriterion("ACTION_COD =", value, "actionCod");
            return (Criteria) this;
        }

        public Criteria andActionCodNotEqualTo(String value) {
            addCriterion("ACTION_COD <>", value, "actionCod");
            return (Criteria) this;
        }

        public Criteria andActionCodGreaterThan(String value) {
            addCriterion("ACTION_COD >", value, "actionCod");
            return (Criteria) this;
        }

        public Criteria andActionCodGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_COD >=", value, "actionCod");
            return (Criteria) this;
        }

        public Criteria andActionCodLessThan(String value) {
            addCriterion("ACTION_COD <", value, "actionCod");
            return (Criteria) this;
        }

        public Criteria andActionCodLessThanOrEqualTo(String value) {
            addCriterion("ACTION_COD <=", value, "actionCod");
            return (Criteria) this;
        }

        public Criteria andActionCodLike(String value) {
            addCriterion("ACTION_COD like", value, "actionCod");
            return (Criteria) this;
        }

        public Criteria andActionCodNotLike(String value) {
            addCriterion("ACTION_COD not like", value, "actionCod");
            return (Criteria) this;
        }

        public Criteria andActionCodIn(List<String> values) {
            addCriterion("ACTION_COD in", values, "actionCod");
            return (Criteria) this;
        }

        public Criteria andActionCodNotIn(List<String> values) {
            addCriterion("ACTION_COD not in", values, "actionCod");
            return (Criteria) this;
        }

        public Criteria andActionCodBetween(String value1, String value2) {
            addCriterion("ACTION_COD between", value1, value2, "actionCod");
            return (Criteria) this;
        }

        public Criteria andActionCodNotBetween(String value1, String value2) {
            addCriterion("ACTION_COD not between", value1, value2, "actionCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodIsNull() {
            addCriterion("XXG_SKIN_COD is null");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodIsNotNull() {
            addCriterion("XXG_SKIN_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodEqualTo(String value) {
            addCriterion("XXG_SKIN_COD =", value, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodNotEqualTo(String value) {
            addCriterion("XXG_SKIN_COD <>", value, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodGreaterThan(String value) {
            addCriterion("XXG_SKIN_COD >", value, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodGreaterThanOrEqualTo(String value) {
            addCriterion("XXG_SKIN_COD >=", value, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodLessThan(String value) {
            addCriterion("XXG_SKIN_COD <", value, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodLessThanOrEqualTo(String value) {
            addCriterion("XXG_SKIN_COD <=", value, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodLike(String value) {
            addCriterion("XXG_SKIN_COD like", value, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodNotLike(String value) {
            addCriterion("XXG_SKIN_COD not like", value, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodIn(List<String> values) {
            addCriterion("XXG_SKIN_COD in", values, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodNotIn(List<String> values) {
            addCriterion("XXG_SKIN_COD not in", values, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodBetween(String value1, String value2) {
            addCriterion("XXG_SKIN_COD between", value1, value2, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgSkinCodNotBetween(String value1, String value2) {
            addCriterion("XXG_SKIN_COD not between", value1, value2, "xxgSkinCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodIsNull() {
            addCriterion("XXG_CRT_COD is null");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodIsNotNull() {
            addCriterion("XXG_CRT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodEqualTo(String value) {
            addCriterion("XXG_CRT_COD =", value, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodNotEqualTo(String value) {
            addCriterion("XXG_CRT_COD <>", value, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodGreaterThan(String value) {
            addCriterion("XXG_CRT_COD >", value, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodGreaterThanOrEqualTo(String value) {
            addCriterion("XXG_CRT_COD >=", value, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodLessThan(String value) {
            addCriterion("XXG_CRT_COD <", value, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodLessThanOrEqualTo(String value) {
            addCriterion("XXG_CRT_COD <=", value, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodLike(String value) {
            addCriterion("XXG_CRT_COD like", value, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodNotLike(String value) {
            addCriterion("XXG_CRT_COD not like", value, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodIn(List<String> values) {
            addCriterion("XXG_CRT_COD in", values, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodNotIn(List<String> values) {
            addCriterion("XXG_CRT_COD not in", values, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodBetween(String value1, String value2) {
            addCriterion("XXG_CRT_COD between", value1, value2, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgCrtCodNotBetween(String value1, String value2) {
            addCriterion("XXG_CRT_COD not between", value1, value2, "xxgCrtCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodIsNull() {
            addCriterion("XXG_XL_COD is null");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodIsNotNull() {
            addCriterion("XXG_XL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodEqualTo(String value) {
            addCriterion("XXG_XL_COD =", value, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodNotEqualTo(String value) {
            addCriterion("XXG_XL_COD <>", value, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodGreaterThan(String value) {
            addCriterion("XXG_XL_COD >", value, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodGreaterThanOrEqualTo(String value) {
            addCriterion("XXG_XL_COD >=", value, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodLessThan(String value) {
            addCriterion("XXG_XL_COD <", value, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodLessThanOrEqualTo(String value) {
            addCriterion("XXG_XL_COD <=", value, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodLike(String value) {
            addCriterion("XXG_XL_COD like", value, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodNotLike(String value) {
            addCriterion("XXG_XL_COD not like", value, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodIn(List<String> values) {
            addCriterion("XXG_XL_COD in", values, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodNotIn(List<String> values) {
            addCriterion("XXG_XL_COD not in", values, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodBetween(String value1, String value2) {
            addCriterion("XXG_XL_COD between", value1, value2, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andXxgXlCodNotBetween(String value1, String value2) {
            addCriterion("XXG_XL_COD not between", value1, value2, "xxgXlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodIsNull() {
            addCriterion("HX_PL_COD is null");
            return (Criteria) this;
        }

        public Criteria andHxPlCodIsNotNull() {
            addCriterion("HX_PL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHxPlCodEqualTo(String value) {
            addCriterion("HX_PL_COD =", value, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodNotEqualTo(String value) {
            addCriterion("HX_PL_COD <>", value, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodGreaterThan(String value) {
            addCriterion("HX_PL_COD >", value, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodGreaterThanOrEqualTo(String value) {
            addCriterion("HX_PL_COD >=", value, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodLessThan(String value) {
            addCriterion("HX_PL_COD <", value, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodLessThanOrEqualTo(String value) {
            addCriterion("HX_PL_COD <=", value, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodLike(String value) {
            addCriterion("HX_PL_COD like", value, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodNotLike(String value) {
            addCriterion("HX_PL_COD not like", value, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodIn(List<String> values) {
            addCriterion("HX_PL_COD in", values, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodNotIn(List<String> values) {
            addCriterion("HX_PL_COD not in", values, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodBetween(String value1, String value2) {
            addCriterion("HX_PL_COD between", value1, value2, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxPlCodNotBetween(String value1, String value2) {
            addCriterion("HX_PL_COD not between", value1, value2, "hxPlCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodIsNull() {
            addCriterion("HX_XH_COD is null");
            return (Criteria) this;
        }

        public Criteria andHxXhCodIsNotNull() {
            addCriterion("HX_XH_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHxXhCodEqualTo(String value) {
            addCriterion("HX_XH_COD =", value, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodNotEqualTo(String value) {
            addCriterion("HX_XH_COD <>", value, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodGreaterThan(String value) {
            addCriterion("HX_XH_COD >", value, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodGreaterThanOrEqualTo(String value) {
            addCriterion("HX_XH_COD >=", value, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodLessThan(String value) {
            addCriterion("HX_XH_COD <", value, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodLessThanOrEqualTo(String value) {
            addCriterion("HX_XH_COD <=", value, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodLike(String value) {
            addCriterion("HX_XH_COD like", value, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodNotLike(String value) {
            addCriterion("HX_XH_COD not like", value, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodIn(List<String> values) {
            addCriterion("HX_XH_COD in", values, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodNotIn(List<String> values) {
            addCriterion("HX_XH_COD not in", values, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodBetween(String value1, String value2) {
            addCriterion("HX_XH_COD between", value1, value2, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxXhCodNotBetween(String value1, String value2) {
            addCriterion("HX_XH_COD not between", value1, value2, "hxXhCod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodIsNull() {
            addCriterion("HX_FIO2_COD is null");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodIsNotNull() {
            addCriterion("HX_FIO2_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodEqualTo(String value) {
            addCriterion("HX_FIO2_COD =", value, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodNotEqualTo(String value) {
            addCriterion("HX_FIO2_COD <>", value, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodGreaterThan(String value) {
            addCriterion("HX_FIO2_COD >", value, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodGreaterThanOrEqualTo(String value) {
            addCriterion("HX_FIO2_COD >=", value, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodLessThan(String value) {
            addCriterion("HX_FIO2_COD <", value, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodLessThanOrEqualTo(String value) {
            addCriterion("HX_FIO2_COD <=", value, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodLike(String value) {
            addCriterion("HX_FIO2_COD like", value, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodNotLike(String value) {
            addCriterion("HX_FIO2_COD not like", value, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodIn(List<String> values) {
            addCriterion("HX_FIO2_COD in", values, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodNotIn(List<String> values) {
            addCriterion("HX_FIO2_COD not in", values, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodBetween(String value1, String value2) {
            addCriterion("HX_FIO2_COD between", value1, value2, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andHxFio2CodNotBetween(String value1, String value2) {
            addCriterion("HX_FIO2_COD not between", value1, value2, "hxFio2Cod");
            return (Criteria) this;
        }

        public Criteria andPewsScoIsNull() {
            addCriterion("PEWS_SCO is null");
            return (Criteria) this;
        }

        public Criteria andPewsScoIsNotNull() {
            addCriterion("PEWS_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andPewsScoEqualTo(Short value) {
            addCriterion("PEWS_SCO =", value, "pewsSco");
            return (Criteria) this;
        }

        public Criteria andPewsScoNotEqualTo(Short value) {
            addCriterion("PEWS_SCO <>", value, "pewsSco");
            return (Criteria) this;
        }

        public Criteria andPewsScoGreaterThan(Short value) {
            addCriterion("PEWS_SCO >", value, "pewsSco");
            return (Criteria) this;
        }

        public Criteria andPewsScoGreaterThanOrEqualTo(Short value) {
            addCriterion("PEWS_SCO >=", value, "pewsSco");
            return (Criteria) this;
        }

        public Criteria andPewsScoLessThan(Short value) {
            addCriterion("PEWS_SCO <", value, "pewsSco");
            return (Criteria) this;
        }

        public Criteria andPewsScoLessThanOrEqualTo(Short value) {
            addCriterion("PEWS_SCO <=", value, "pewsSco");
            return (Criteria) this;
        }

        public Criteria andPewsScoIn(List<Short> values) {
            addCriterion("PEWS_SCO in", values, "pewsSco");
            return (Criteria) this;
        }

        public Criteria andPewsScoNotIn(List<Short> values) {
            addCriterion("PEWS_SCO not in", values, "pewsSco");
            return (Criteria) this;
        }

        public Criteria andPewsScoBetween(Short value1, Short value2) {
            addCriterion("PEWS_SCO between", value1, value2, "pewsSco");
            return (Criteria) this;
        }

        public Criteria andPewsScoNotBetween(Short value1, Short value2) {
            addCriterion("PEWS_SCO not between", value1, value2, "pewsSco");
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