package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspAdlInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspAdlInfExample() {
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

        public Criteria andAdlHlylcdIsNull() {
            addCriterion("ADL_HLYLCD is null");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdIsNotNull() {
            addCriterion("ADL_HLYLCD is not null");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdEqualTo(String value) {
            addCriterion("ADL_HLYLCD =", value, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdNotEqualTo(String value) {
            addCriterion("ADL_HLYLCD <>", value, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdGreaterThan(String value) {
            addCriterion("ADL_HLYLCD >", value, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_HLYLCD >=", value, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdLessThan(String value) {
            addCriterion("ADL_HLYLCD <", value, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdLessThanOrEqualTo(String value) {
            addCriterion("ADL_HLYLCD <=", value, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdLike(String value) {
            addCriterion("ADL_HLYLCD like", value, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdNotLike(String value) {
            addCriterion("ADL_HLYLCD not like", value, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdIn(List<String> values) {
            addCriterion("ADL_HLYLCD in", values, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdNotIn(List<String> values) {
            addCriterion("ADL_HLYLCD not in", values, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdBetween(String value1, String value2) {
            addCriterion("ADL_HLYLCD between", value1, value2, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlHlylcdNotBetween(String value1, String value2) {
            addCriterion("ADL_HLYLCD not between", value1, value2, "adlHlylcd");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoIsNull() {
            addCriterion("ADL_JS_SCO is null");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoIsNotNull() {
            addCriterion("ADL_JS_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoEqualTo(String value) {
            addCriterion("ADL_JS_SCO =", value, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNotEqualTo(String value) {
            addCriterion("ADL_JS_SCO <>", value, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoGreaterThan(String value) {
            addCriterion("ADL_JS_SCO >", value, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_JS_SCO >=", value, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoLessThan(String value) {
            addCriterion("ADL_JS_SCO <", value, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoLessThanOrEqualTo(String value) {
            addCriterion("ADL_JS_SCO <=", value, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoLike(String value) {
            addCriterion("ADL_JS_SCO like", value, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNotLike(String value) {
            addCriterion("ADL_JS_SCO not like", value, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoIn(List<String> values) {
            addCriterion("ADL_JS_SCO in", values, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNotIn(List<String> values) {
            addCriterion("ADL_JS_SCO not in", values, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoBetween(String value1, String value2) {
            addCriterion("ADL_JS_SCO between", value1, value2, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNotBetween(String value1, String value2) {
            addCriterion("ADL_JS_SCO not between", value1, value2, "adlJsSco");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewIsNull() {
            addCriterion("ADL_JS_SCO_NEW is null");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewIsNotNull() {
            addCriterion("ADL_JS_SCO_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewEqualTo(Long value) {
            addCriterion("ADL_JS_SCO_NEW =", value, "adlJsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewNotEqualTo(Long value) {
            addCriterion("ADL_JS_SCO_NEW <>", value, "adlJsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewGreaterThan(Long value) {
            addCriterion("ADL_JS_SCO_NEW >", value, "adlJsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewGreaterThanOrEqualTo(Long value) {
            addCriterion("ADL_JS_SCO_NEW >=", value, "adlJsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewLessThan(Long value) {
            addCriterion("ADL_JS_SCO_NEW <", value, "adlJsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewLessThanOrEqualTo(Long value) {
            addCriterion("ADL_JS_SCO_NEW <=", value, "adlJsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewIn(List<Long> values) {
            addCriterion("ADL_JS_SCO_NEW in", values, "adlJsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewNotIn(List<Long> values) {
            addCriterion("ADL_JS_SCO_NEW not in", values, "adlJsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewBetween(Long value1, Long value2) {
            addCriterion("ADL_JS_SCO_NEW between", value1, value2, "adlJsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlJsScoNewNotBetween(Long value1, Long value2) {
            addCriterion("ADL_JS_SCO_NEW not between", value1, value2, "adlJsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoIsNull() {
            addCriterion("ADL_XIZ_SCO is null");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoIsNotNull() {
            addCriterion("ADL_XIZ_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoEqualTo(String value) {
            addCriterion("ADL_XIZ_SCO =", value, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNotEqualTo(String value) {
            addCriterion("ADL_XIZ_SCO <>", value, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoGreaterThan(String value) {
            addCriterion("ADL_XIZ_SCO >", value, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_XIZ_SCO >=", value, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoLessThan(String value) {
            addCriterion("ADL_XIZ_SCO <", value, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoLessThanOrEqualTo(String value) {
            addCriterion("ADL_XIZ_SCO <=", value, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoLike(String value) {
            addCriterion("ADL_XIZ_SCO like", value, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNotLike(String value) {
            addCriterion("ADL_XIZ_SCO not like", value, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoIn(List<String> values) {
            addCriterion("ADL_XIZ_SCO in", values, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNotIn(List<String> values) {
            addCriterion("ADL_XIZ_SCO not in", values, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoBetween(String value1, String value2) {
            addCriterion("ADL_XIZ_SCO between", value1, value2, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNotBetween(String value1, String value2) {
            addCriterion("ADL_XIZ_SCO not between", value1, value2, "adlXizSco");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewIsNull() {
            addCriterion("ADL_XIZ_SCO_NEW is null");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewIsNotNull() {
            addCriterion("ADL_XIZ_SCO_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewEqualTo(Long value) {
            addCriterion("ADL_XIZ_SCO_NEW =", value, "adlXizScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewNotEqualTo(Long value) {
            addCriterion("ADL_XIZ_SCO_NEW <>", value, "adlXizScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewGreaterThan(Long value) {
            addCriterion("ADL_XIZ_SCO_NEW >", value, "adlXizScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewGreaterThanOrEqualTo(Long value) {
            addCriterion("ADL_XIZ_SCO_NEW >=", value, "adlXizScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewLessThan(Long value) {
            addCriterion("ADL_XIZ_SCO_NEW <", value, "adlXizScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewLessThanOrEqualTo(Long value) {
            addCriterion("ADL_XIZ_SCO_NEW <=", value, "adlXizScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewIn(List<Long> values) {
            addCriterion("ADL_XIZ_SCO_NEW in", values, "adlXizScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewNotIn(List<Long> values) {
            addCriterion("ADL_XIZ_SCO_NEW not in", values, "adlXizScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewBetween(Long value1, Long value2) {
            addCriterion("ADL_XIZ_SCO_NEW between", value1, value2, "adlXizScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXizScoNewNotBetween(Long value1, Long value2) {
            addCriterion("ADL_XIZ_SCO_NEW not between", value1, value2, "adlXizScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoIsNull() {
            addCriterion("ADL_XS_SCO is null");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoIsNotNull() {
            addCriterion("ADL_XS_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoEqualTo(String value) {
            addCriterion("ADL_XS_SCO =", value, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNotEqualTo(String value) {
            addCriterion("ADL_XS_SCO <>", value, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoGreaterThan(String value) {
            addCriterion("ADL_XS_SCO >", value, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_XS_SCO >=", value, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoLessThan(String value) {
            addCriterion("ADL_XS_SCO <", value, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoLessThanOrEqualTo(String value) {
            addCriterion("ADL_XS_SCO <=", value, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoLike(String value) {
            addCriterion("ADL_XS_SCO like", value, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNotLike(String value) {
            addCriterion("ADL_XS_SCO not like", value, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoIn(List<String> values) {
            addCriterion("ADL_XS_SCO in", values, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNotIn(List<String> values) {
            addCriterion("ADL_XS_SCO not in", values, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoBetween(String value1, String value2) {
            addCriterion("ADL_XS_SCO between", value1, value2, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNotBetween(String value1, String value2) {
            addCriterion("ADL_XS_SCO not between", value1, value2, "adlXsSco");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewIsNull() {
            addCriterion("ADL_XS_SCO_NEW is null");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewIsNotNull() {
            addCriterion("ADL_XS_SCO_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewEqualTo(Long value) {
            addCriterion("ADL_XS_SCO_NEW =", value, "adlXsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewNotEqualTo(Long value) {
            addCriterion("ADL_XS_SCO_NEW <>", value, "adlXsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewGreaterThan(Long value) {
            addCriterion("ADL_XS_SCO_NEW >", value, "adlXsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewGreaterThanOrEqualTo(Long value) {
            addCriterion("ADL_XS_SCO_NEW >=", value, "adlXsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewLessThan(Long value) {
            addCriterion("ADL_XS_SCO_NEW <", value, "adlXsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewLessThanOrEqualTo(Long value) {
            addCriterion("ADL_XS_SCO_NEW <=", value, "adlXsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewIn(List<Long> values) {
            addCriterion("ADL_XS_SCO_NEW in", values, "adlXsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewNotIn(List<Long> values) {
            addCriterion("ADL_XS_SCO_NEW not in", values, "adlXsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewBetween(Long value1, Long value2) {
            addCriterion("ADL_XS_SCO_NEW between", value1, value2, "adlXsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXsScoNewNotBetween(Long value1, Long value2) {
            addCriterion("ADL_XS_SCO_NEW not between", value1, value2, "adlXsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoIsNull() {
            addCriterion("ADL_CY_SCO is null");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoIsNotNull() {
            addCriterion("ADL_CY_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoEqualTo(String value) {
            addCriterion("ADL_CY_SCO =", value, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNotEqualTo(String value) {
            addCriterion("ADL_CY_SCO <>", value, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoGreaterThan(String value) {
            addCriterion("ADL_CY_SCO >", value, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_CY_SCO >=", value, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoLessThan(String value) {
            addCriterion("ADL_CY_SCO <", value, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoLessThanOrEqualTo(String value) {
            addCriterion("ADL_CY_SCO <=", value, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoLike(String value) {
            addCriterion("ADL_CY_SCO like", value, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNotLike(String value) {
            addCriterion("ADL_CY_SCO not like", value, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoIn(List<String> values) {
            addCriterion("ADL_CY_SCO in", values, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNotIn(List<String> values) {
            addCriterion("ADL_CY_SCO not in", values, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoBetween(String value1, String value2) {
            addCriterion("ADL_CY_SCO between", value1, value2, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNotBetween(String value1, String value2) {
            addCriterion("ADL_CY_SCO not between", value1, value2, "adlCySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewIsNull() {
            addCriterion("ADL_CY_SCO_NEW is null");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewIsNotNull() {
            addCriterion("ADL_CY_SCO_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewEqualTo(Long value) {
            addCriterion("ADL_CY_SCO_NEW =", value, "adlCyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewNotEqualTo(Long value) {
            addCriterion("ADL_CY_SCO_NEW <>", value, "adlCyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewGreaterThan(Long value) {
            addCriterion("ADL_CY_SCO_NEW >", value, "adlCyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewGreaterThanOrEqualTo(Long value) {
            addCriterion("ADL_CY_SCO_NEW >=", value, "adlCyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewLessThan(Long value) {
            addCriterion("ADL_CY_SCO_NEW <", value, "adlCyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewLessThanOrEqualTo(Long value) {
            addCriterion("ADL_CY_SCO_NEW <=", value, "adlCyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewIn(List<Long> values) {
            addCriterion("ADL_CY_SCO_NEW in", values, "adlCyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewNotIn(List<Long> values) {
            addCriterion("ADL_CY_SCO_NEW not in", values, "adlCyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewBetween(Long value1, Long value2) {
            addCriterion("ADL_CY_SCO_NEW between", value1, value2, "adlCyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyScoNewNotBetween(Long value1, Long value2) {
            addCriterion("ADL_CY_SCO_NEW not between", value1, value2, "adlCyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoIsNull() {
            addCriterion("ADL_KZDB_SCO is null");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoIsNotNull() {
            addCriterion("ADL_KZDB_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoEqualTo(String value) {
            addCriterion("ADL_KZDB_SCO =", value, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNotEqualTo(String value) {
            addCriterion("ADL_KZDB_SCO <>", value, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoGreaterThan(String value) {
            addCriterion("ADL_KZDB_SCO >", value, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_KZDB_SCO >=", value, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoLessThan(String value) {
            addCriterion("ADL_KZDB_SCO <", value, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoLessThanOrEqualTo(String value) {
            addCriterion("ADL_KZDB_SCO <=", value, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoLike(String value) {
            addCriterion("ADL_KZDB_SCO like", value, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNotLike(String value) {
            addCriterion("ADL_KZDB_SCO not like", value, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoIn(List<String> values) {
            addCriterion("ADL_KZDB_SCO in", values, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNotIn(List<String> values) {
            addCriterion("ADL_KZDB_SCO not in", values, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoBetween(String value1, String value2) {
            addCriterion("ADL_KZDB_SCO between", value1, value2, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNotBetween(String value1, String value2) {
            addCriterion("ADL_KZDB_SCO not between", value1, value2, "adlKzdbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewIsNull() {
            addCriterion("ADL_KZDB_SCO_NEW is null");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewIsNotNull() {
            addCriterion("ADL_KZDB_SCO_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewEqualTo(Long value) {
            addCriterion("ADL_KZDB_SCO_NEW =", value, "adlKzdbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewNotEqualTo(Long value) {
            addCriterion("ADL_KZDB_SCO_NEW <>", value, "adlKzdbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewGreaterThan(Long value) {
            addCriterion("ADL_KZDB_SCO_NEW >", value, "adlKzdbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewGreaterThanOrEqualTo(Long value) {
            addCriterion("ADL_KZDB_SCO_NEW >=", value, "adlKzdbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewLessThan(Long value) {
            addCriterion("ADL_KZDB_SCO_NEW <", value, "adlKzdbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewLessThanOrEqualTo(Long value) {
            addCriterion("ADL_KZDB_SCO_NEW <=", value, "adlKzdbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewIn(List<Long> values) {
            addCriterion("ADL_KZDB_SCO_NEW in", values, "adlKzdbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewNotIn(List<Long> values) {
            addCriterion("ADL_KZDB_SCO_NEW not in", values, "adlKzdbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewBetween(Long value1, Long value2) {
            addCriterion("ADL_KZDB_SCO_NEW between", value1, value2, "adlKzdbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzdbScoNewNotBetween(Long value1, Long value2) {
            addCriterion("ADL_KZDB_SCO_NEW not between", value1, value2, "adlKzdbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoIsNull() {
            addCriterion("ADL_KZXB_SCO is null");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoIsNotNull() {
            addCriterion("ADL_KZXB_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoEqualTo(String value) {
            addCriterion("ADL_KZXB_SCO =", value, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNotEqualTo(String value) {
            addCriterion("ADL_KZXB_SCO <>", value, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoGreaterThan(String value) {
            addCriterion("ADL_KZXB_SCO >", value, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_KZXB_SCO >=", value, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoLessThan(String value) {
            addCriterion("ADL_KZXB_SCO <", value, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoLessThanOrEqualTo(String value) {
            addCriterion("ADL_KZXB_SCO <=", value, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoLike(String value) {
            addCriterion("ADL_KZXB_SCO like", value, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNotLike(String value) {
            addCriterion("ADL_KZXB_SCO not like", value, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoIn(List<String> values) {
            addCriterion("ADL_KZXB_SCO in", values, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNotIn(List<String> values) {
            addCriterion("ADL_KZXB_SCO not in", values, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoBetween(String value1, String value2) {
            addCriterion("ADL_KZXB_SCO between", value1, value2, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNotBetween(String value1, String value2) {
            addCriterion("ADL_KZXB_SCO not between", value1, value2, "adlKzxbSco");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewIsNull() {
            addCriterion("ADL_KZXB_SCO_NEW is null");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewIsNotNull() {
            addCriterion("ADL_KZXB_SCO_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewEqualTo(Long value) {
            addCriterion("ADL_KZXB_SCO_NEW =", value, "adlKzxbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewNotEqualTo(Long value) {
            addCriterion("ADL_KZXB_SCO_NEW <>", value, "adlKzxbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewGreaterThan(Long value) {
            addCriterion("ADL_KZXB_SCO_NEW >", value, "adlKzxbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewGreaterThanOrEqualTo(Long value) {
            addCriterion("ADL_KZXB_SCO_NEW >=", value, "adlKzxbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewLessThan(Long value) {
            addCriterion("ADL_KZXB_SCO_NEW <", value, "adlKzxbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewLessThanOrEqualTo(Long value) {
            addCriterion("ADL_KZXB_SCO_NEW <=", value, "adlKzxbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewIn(List<Long> values) {
            addCriterion("ADL_KZXB_SCO_NEW in", values, "adlKzxbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewNotIn(List<Long> values) {
            addCriterion("ADL_KZXB_SCO_NEW not in", values, "adlKzxbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewBetween(Long value1, Long value2) {
            addCriterion("ADL_KZXB_SCO_NEW between", value1, value2, "adlKzxbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlKzxbScoNewNotBetween(Long value1, Long value2) {
            addCriterion("ADL_KZXB_SCO_NEW not between", value1, value2, "adlKzxbScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoIsNull() {
            addCriterion("ADL_SCS_SCO is null");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoIsNotNull() {
            addCriterion("ADL_SCS_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoEqualTo(String value) {
            addCriterion("ADL_SCS_SCO =", value, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNotEqualTo(String value) {
            addCriterion("ADL_SCS_SCO <>", value, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoGreaterThan(String value) {
            addCriterion("ADL_SCS_SCO >", value, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_SCS_SCO >=", value, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoLessThan(String value) {
            addCriterion("ADL_SCS_SCO <", value, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoLessThanOrEqualTo(String value) {
            addCriterion("ADL_SCS_SCO <=", value, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoLike(String value) {
            addCriterion("ADL_SCS_SCO like", value, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNotLike(String value) {
            addCriterion("ADL_SCS_SCO not like", value, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoIn(List<String> values) {
            addCriterion("ADL_SCS_SCO in", values, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNotIn(List<String> values) {
            addCriterion("ADL_SCS_SCO not in", values, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoBetween(String value1, String value2) {
            addCriterion("ADL_SCS_SCO between", value1, value2, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNotBetween(String value1, String value2) {
            addCriterion("ADL_SCS_SCO not between", value1, value2, "adlScsSco");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewIsNull() {
            addCriterion("ADL_SCS_SCO_NEW is null");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewIsNotNull() {
            addCriterion("ADL_SCS_SCO_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewEqualTo(Long value) {
            addCriterion("ADL_SCS_SCO_NEW =", value, "adlScsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewNotEqualTo(Long value) {
            addCriterion("ADL_SCS_SCO_NEW <>", value, "adlScsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewGreaterThan(Long value) {
            addCriterion("ADL_SCS_SCO_NEW >", value, "adlScsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewGreaterThanOrEqualTo(Long value) {
            addCriterion("ADL_SCS_SCO_NEW >=", value, "adlScsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewLessThan(Long value) {
            addCriterion("ADL_SCS_SCO_NEW <", value, "adlScsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewLessThanOrEqualTo(Long value) {
            addCriterion("ADL_SCS_SCO_NEW <=", value, "adlScsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewIn(List<Long> values) {
            addCriterion("ADL_SCS_SCO_NEW in", values, "adlScsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewNotIn(List<Long> values) {
            addCriterion("ADL_SCS_SCO_NEW not in", values, "adlScsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewBetween(Long value1, Long value2) {
            addCriterion("ADL_SCS_SCO_NEW between", value1, value2, "adlScsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlScsScoNewNotBetween(Long value1, Long value2) {
            addCriterion("ADL_SCS_SCO_NEW not between", value1, value2, "adlScsScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoIsNull() {
            addCriterion("ADL_CYZY_SCO is null");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoIsNotNull() {
            addCriterion("ADL_CYZY_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoEqualTo(String value) {
            addCriterion("ADL_CYZY_SCO =", value, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNotEqualTo(String value) {
            addCriterion("ADL_CYZY_SCO <>", value, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoGreaterThan(String value) {
            addCriterion("ADL_CYZY_SCO >", value, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_CYZY_SCO >=", value, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoLessThan(String value) {
            addCriterion("ADL_CYZY_SCO <", value, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoLessThanOrEqualTo(String value) {
            addCriterion("ADL_CYZY_SCO <=", value, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoLike(String value) {
            addCriterion("ADL_CYZY_SCO like", value, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNotLike(String value) {
            addCriterion("ADL_CYZY_SCO not like", value, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoIn(List<String> values) {
            addCriterion("ADL_CYZY_SCO in", values, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNotIn(List<String> values) {
            addCriterion("ADL_CYZY_SCO not in", values, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoBetween(String value1, String value2) {
            addCriterion("ADL_CYZY_SCO between", value1, value2, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNotBetween(String value1, String value2) {
            addCriterion("ADL_CYZY_SCO not between", value1, value2, "adlCyzySco");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewIsNull() {
            addCriterion("ADL_CYZY_SCO_NEW is null");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewIsNotNull() {
            addCriterion("ADL_CYZY_SCO_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewEqualTo(Long value) {
            addCriterion("ADL_CYZY_SCO_NEW =", value, "adlCyzyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewNotEqualTo(Long value) {
            addCriterion("ADL_CYZY_SCO_NEW <>", value, "adlCyzyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewGreaterThan(Long value) {
            addCriterion("ADL_CYZY_SCO_NEW >", value, "adlCyzyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewGreaterThanOrEqualTo(Long value) {
            addCriterion("ADL_CYZY_SCO_NEW >=", value, "adlCyzyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewLessThan(Long value) {
            addCriterion("ADL_CYZY_SCO_NEW <", value, "adlCyzyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewLessThanOrEqualTo(Long value) {
            addCriterion("ADL_CYZY_SCO_NEW <=", value, "adlCyzyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewIn(List<Long> values) {
            addCriterion("ADL_CYZY_SCO_NEW in", values, "adlCyzyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewNotIn(List<Long> values) {
            addCriterion("ADL_CYZY_SCO_NEW not in", values, "adlCyzyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewBetween(Long value1, Long value2) {
            addCriterion("ADL_CYZY_SCO_NEW between", value1, value2, "adlCyzyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlCyzyScoNewNotBetween(Long value1, Long value2) {
            addCriterion("ADL_CYZY_SCO_NEW not between", value1, value2, "adlCyzyScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoIsNull() {
            addCriterion("ADL_XINGZ_SCO is null");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoIsNotNull() {
            addCriterion("ADL_XINGZ_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoEqualTo(String value) {
            addCriterion("ADL_XINGZ_SCO =", value, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNotEqualTo(String value) {
            addCriterion("ADL_XINGZ_SCO <>", value, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoGreaterThan(String value) {
            addCriterion("ADL_XINGZ_SCO >", value, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_XINGZ_SCO >=", value, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoLessThan(String value) {
            addCriterion("ADL_XINGZ_SCO <", value, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoLessThanOrEqualTo(String value) {
            addCriterion("ADL_XINGZ_SCO <=", value, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoLike(String value) {
            addCriterion("ADL_XINGZ_SCO like", value, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNotLike(String value) {
            addCriterion("ADL_XINGZ_SCO not like", value, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoIn(List<String> values) {
            addCriterion("ADL_XINGZ_SCO in", values, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNotIn(List<String> values) {
            addCriterion("ADL_XINGZ_SCO not in", values, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoBetween(String value1, String value2) {
            addCriterion("ADL_XINGZ_SCO between", value1, value2, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNotBetween(String value1, String value2) {
            addCriterion("ADL_XINGZ_SCO not between", value1, value2, "adlXingzSco");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewIsNull() {
            addCriterion("ADL_XINGZ_SCO_NEW is null");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewIsNotNull() {
            addCriterion("ADL_XINGZ_SCO_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewEqualTo(Long value) {
            addCriterion("ADL_XINGZ_SCO_NEW =", value, "adlXingzScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewNotEqualTo(Long value) {
            addCriterion("ADL_XINGZ_SCO_NEW <>", value, "adlXingzScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewGreaterThan(Long value) {
            addCriterion("ADL_XINGZ_SCO_NEW >", value, "adlXingzScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewGreaterThanOrEqualTo(Long value) {
            addCriterion("ADL_XINGZ_SCO_NEW >=", value, "adlXingzScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewLessThan(Long value) {
            addCriterion("ADL_XINGZ_SCO_NEW <", value, "adlXingzScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewLessThanOrEqualTo(Long value) {
            addCriterion("ADL_XINGZ_SCO_NEW <=", value, "adlXingzScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewIn(List<Long> values) {
            addCriterion("ADL_XINGZ_SCO_NEW in", values, "adlXingzScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewNotIn(List<Long> values) {
            addCriterion("ADL_XINGZ_SCO_NEW not in", values, "adlXingzScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewBetween(Long value1, Long value2) {
            addCriterion("ADL_XINGZ_SCO_NEW between", value1, value2, "adlXingzScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlXingzScoNewNotBetween(Long value1, Long value2) {
            addCriterion("ADL_XINGZ_SCO_NEW not between", value1, value2, "adlXingzScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoIsNull() {
            addCriterion("ADL_SXLT_SCO is null");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoIsNotNull() {
            addCriterion("ADL_SXLT_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoEqualTo(String value) {
            addCriterion("ADL_SXLT_SCO =", value, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNotEqualTo(String value) {
            addCriterion("ADL_SXLT_SCO <>", value, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoGreaterThan(String value) {
            addCriterion("ADL_SXLT_SCO >", value, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_SXLT_SCO >=", value, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoLessThan(String value) {
            addCriterion("ADL_SXLT_SCO <", value, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoLessThanOrEqualTo(String value) {
            addCriterion("ADL_SXLT_SCO <=", value, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoLike(String value) {
            addCriterion("ADL_SXLT_SCO like", value, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNotLike(String value) {
            addCriterion("ADL_SXLT_SCO not like", value, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoIn(List<String> values) {
            addCriterion("ADL_SXLT_SCO in", values, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNotIn(List<String> values) {
            addCriterion("ADL_SXLT_SCO not in", values, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoBetween(String value1, String value2) {
            addCriterion("ADL_SXLT_SCO between", value1, value2, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNotBetween(String value1, String value2) {
            addCriterion("ADL_SXLT_SCO not between", value1, value2, "adlSxltSco");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewIsNull() {
            addCriterion("ADL_SXLT_SCO_NEW is null");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewIsNotNull() {
            addCriterion("ADL_SXLT_SCO_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewEqualTo(Long value) {
            addCriterion("ADL_SXLT_SCO_NEW =", value, "adlSxltScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewNotEqualTo(Long value) {
            addCriterion("ADL_SXLT_SCO_NEW <>", value, "adlSxltScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewGreaterThan(Long value) {
            addCriterion("ADL_SXLT_SCO_NEW >", value, "adlSxltScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewGreaterThanOrEqualTo(Long value) {
            addCriterion("ADL_SXLT_SCO_NEW >=", value, "adlSxltScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewLessThan(Long value) {
            addCriterion("ADL_SXLT_SCO_NEW <", value, "adlSxltScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewLessThanOrEqualTo(Long value) {
            addCriterion("ADL_SXLT_SCO_NEW <=", value, "adlSxltScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewIn(List<Long> values) {
            addCriterion("ADL_SXLT_SCO_NEW in", values, "adlSxltScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewNotIn(List<Long> values) {
            addCriterion("ADL_SXLT_SCO_NEW not in", values, "adlSxltScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewBetween(Long value1, Long value2) {
            addCriterion("ADL_SXLT_SCO_NEW between", value1, value2, "adlSxltScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlSxltScoNewNotBetween(Long value1, Long value2) {
            addCriterion("ADL_SXLT_SCO_NEW not between", value1, value2, "adlSxltScoNew");
            return (Criteria) this;
        }

        public Criteria andAdlScoIsNull() {
            addCriterion("ADL_SCO is null");
            return (Criteria) this;
        }

        public Criteria andAdlScoIsNotNull() {
            addCriterion("ADL_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlScoEqualTo(Long value) {
            addCriterion("ADL_SCO =", value, "adlSco");
            return (Criteria) this;
        }

        public Criteria andAdlScoNotEqualTo(Long value) {
            addCriterion("ADL_SCO <>", value, "adlSco");
            return (Criteria) this;
        }

        public Criteria andAdlScoGreaterThan(Long value) {
            addCriterion("ADL_SCO >", value, "adlSco");
            return (Criteria) this;
        }

        public Criteria andAdlScoGreaterThanOrEqualTo(Long value) {
            addCriterion("ADL_SCO >=", value, "adlSco");
            return (Criteria) this;
        }

        public Criteria andAdlScoLessThan(Long value) {
            addCriterion("ADL_SCO <", value, "adlSco");
            return (Criteria) this;
        }

        public Criteria andAdlScoLessThanOrEqualTo(Long value) {
            addCriterion("ADL_SCO <=", value, "adlSco");
            return (Criteria) this;
        }

        public Criteria andAdlScoIn(List<Long> values) {
            addCriterion("ADL_SCO in", values, "adlSco");
            return (Criteria) this;
        }

        public Criteria andAdlScoNotIn(List<Long> values) {
            addCriterion("ADL_SCO not in", values, "adlSco");
            return (Criteria) this;
        }

        public Criteria andAdlScoBetween(Long value1, Long value2) {
            addCriterion("ADL_SCO between", value1, value2, "adlSco");
            return (Criteria) this;
        }

        public Criteria andAdlScoNotBetween(Long value1, Long value2) {
            addCriterion("ADL_SCO not between", value1, value2, "adlSco");
            return (Criteria) this;
        }

        public Criteria andAdlMemoIsNull() {
            addCriterion("ADL_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andAdlMemoIsNotNull() {
            addCriterion("ADL_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andAdlMemoEqualTo(String value) {
            addCriterion("ADL_MEMO =", value, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andAdlMemoNotEqualTo(String value) {
            addCriterion("ADL_MEMO <>", value, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andAdlMemoGreaterThan(String value) {
            addCriterion("ADL_MEMO >", value, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andAdlMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_MEMO >=", value, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andAdlMemoLessThan(String value) {
            addCriterion("ADL_MEMO <", value, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andAdlMemoLessThanOrEqualTo(String value) {
            addCriterion("ADL_MEMO <=", value, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andAdlMemoLike(String value) {
            addCriterion("ADL_MEMO like", value, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andAdlMemoNotLike(String value) {
            addCriterion("ADL_MEMO not like", value, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andAdlMemoIn(List<String> values) {
            addCriterion("ADL_MEMO in", values, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andAdlMemoNotIn(List<String> values) {
            addCriterion("ADL_MEMO not in", values, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andAdlMemoBetween(String value1, String value2) {
            addCriterion("ADL_MEMO between", value1, value2, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andAdlMemoNotBetween(String value1, String value2) {
            addCriterion("ADL_MEMO not between", value1, value2, "adlMemo");
            return (Criteria) this;
        }

        public Criteria andCratDatIsNull() {
            addCriterion("CRAT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCratDatIsNotNull() {
            addCriterion("CRAT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCratDatEqualTo(Date value) {
            addCriterion("CRAT_DAT =", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatNotEqualTo(Date value) {
            addCriterion("CRAT_DAT <>", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatGreaterThan(Date value) {
            addCriterion("CRAT_DAT >", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CRAT_DAT >=", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatLessThan(Date value) {
            addCriterion("CRAT_DAT <", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatLessThanOrEqualTo(Date value) {
            addCriterion("CRAT_DAT <=", value, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatIn(List<Date> values) {
            addCriterion("CRAT_DAT in", values, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatNotIn(List<Date> values) {
            addCriterion("CRAT_DAT not in", values, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatBetween(Date value1, Date value2) {
            addCriterion("CRAT_DAT between", value1, value2, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCratDatNotBetween(Date value1, Date value2) {
            addCriterion("CRAT_DAT not between", value1, value2, "cratDat");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoIsNull() {
            addCriterion("CRT_USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoIsNotNull() {
            addCriterion("CRT_USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoEqualTo(String value) {
            addCriterion("CRT_USR_NO =", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotEqualTo(String value) {
            addCriterion("CRT_USR_NO <>", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoGreaterThan(String value) {
            addCriterion("CRT_USR_NO >", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NO >=", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLessThan(String value) {
            addCriterion("CRT_USR_NO <", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NO <=", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLike(String value) {
            addCriterion("CRT_USR_NO like", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotLike(String value) {
            addCriterion("CRT_USR_NO not like", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoIn(List<String> values) {
            addCriterion("CRT_USR_NO in", values, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotIn(List<String> values) {
            addCriterion("CRT_USR_NO not in", values, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoBetween(String value1, String value2) {
            addCriterion("CRT_USR_NO between", value1, value2, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_NO not between", value1, value2, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeIsNull() {
            addCriterion("CRT_USR_NME is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeIsNotNull() {
            addCriterion("CRT_USR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeEqualTo(String value) {
            addCriterion("CRT_USR_NME =", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotEqualTo(String value) {
            addCriterion("CRT_USR_NME <>", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeGreaterThan(String value) {
            addCriterion("CRT_USR_NME >", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NME >=", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLessThan(String value) {
            addCriterion("CRT_USR_NME <", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NME <=", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLike(String value) {
            addCriterion("CRT_USR_NME like", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotLike(String value) {
            addCriterion("CRT_USR_NME not like", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeIn(List<String> values) {
            addCriterion("CRT_USR_NME in", values, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotIn(List<String> values) {
            addCriterion("CRT_USR_NME not in", values, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeBetween(String value1, String value2) {
            addCriterion("CRT_USR_NME between", value1, value2, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_NME not between", value1, value2, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoIsNull() {
            addCriterion("UPD_USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoIsNotNull() {
            addCriterion("UPD_USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoEqualTo(String value) {
            addCriterion("UPD_USR_NO =", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotEqualTo(String value) {
            addCriterion("UPD_USR_NO <>", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoGreaterThan(String value) {
            addCriterion("UPD_USR_NO >", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NO >=", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoLessThan(String value) {
            addCriterion("UPD_USR_NO <", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoLessThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NO <=", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoLike(String value) {
            addCriterion("UPD_USR_NO like", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotLike(String value) {
            addCriterion("UPD_USR_NO not like", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoIn(List<String> values) {
            addCriterion("UPD_USR_NO in", values, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotIn(List<String> values) {
            addCriterion("UPD_USR_NO not in", values, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoBetween(String value1, String value2) {
            addCriterion("UPD_USR_NO between", value1, value2, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotBetween(String value1, String value2) {
            addCriterion("UPD_USR_NO not between", value1, value2, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeIsNull() {
            addCriterion("UPD_USR_NME is null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeIsNotNull() {
            addCriterion("UPD_USR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeEqualTo(String value) {
            addCriterion("UPD_USR_NME =", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeNotEqualTo(String value) {
            addCriterion("UPD_USR_NME <>", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeGreaterThan(String value) {
            addCriterion("UPD_USR_NME >", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NME >=", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeLessThan(String value) {
            addCriterion("UPD_USR_NME <", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeLessThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NME <=", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeLike(String value) {
            addCriterion("UPD_USR_NME like", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeNotLike(String value) {
            addCriterion("UPD_USR_NME not like", value, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeIn(List<String> values) {
            addCriterion("UPD_USR_NME in", values, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeNotIn(List<String> values) {
            addCriterion("UPD_USR_NME not in", values, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeBetween(String value1, String value2) {
            addCriterion("UPD_USR_NME between", value1, value2, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNmeNotBetween(String value1, String value2) {
            addCriterion("UPD_USR_NME not between", value1, value2, "updUsrNme");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Date value) {
            addCriterion("UPD_TIME =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("UPD_TIME <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("UPD_TIME >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPD_TIME >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("UPD_TIME <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPD_TIME <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Date> values) {
            addCriterion("UPD_TIME in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Date> values) {
            addCriterion("UPD_TIME not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Date value1, Date value2) {
            addCriterion("UPD_TIME between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPD_TIME not between", value1, value2, "updTime");
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