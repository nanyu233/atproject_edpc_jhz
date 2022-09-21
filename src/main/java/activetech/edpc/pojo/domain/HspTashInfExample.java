package activetech.edpc.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspTashInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspTashInfExample() {
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

        public Criteria andTashSeqIsNull() {
            addCriterion("TASH_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTashSeqIsNotNull() {
            addCriterion("TASH_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTashSeqEqualTo(String value) {
            addCriterion("TASH_SEQ =", value, "tashSeq");
            return (Criteria) this;
        }

        public Criteria andTashSeqNotEqualTo(String value) {
            addCriterion("TASH_SEQ <>", value, "tashSeq");
            return (Criteria) this;
        }

        public Criteria andTashSeqGreaterThan(String value) {
            addCriterion("TASH_SEQ >", value, "tashSeq");
            return (Criteria) this;
        }

        public Criteria andTashSeqGreaterThanOrEqualTo(String value) {
            addCriterion("TASH_SEQ >=", value, "tashSeq");
            return (Criteria) this;
        }

        public Criteria andTashSeqLessThan(String value) {
            addCriterion("TASH_SEQ <", value, "tashSeq");
            return (Criteria) this;
        }

        public Criteria andTashSeqLessThanOrEqualTo(String value) {
            addCriterion("TASH_SEQ <=", value, "tashSeq");
            return (Criteria) this;
        }

        public Criteria andTashSeqLike(String value) {
            addCriterion("TASH_SEQ like", value, "tashSeq");
            return (Criteria) this;
        }

        public Criteria andTashSeqNotLike(String value) {
            addCriterion("TASH_SEQ not like", value, "tashSeq");
            return (Criteria) this;
        }

        public Criteria andTashSeqIn(List<String> values) {
            addCriterion("TASH_SEQ in", values, "tashSeq");
            return (Criteria) this;
        }

        public Criteria andTashSeqNotIn(List<String> values) {
            addCriterion("TASH_SEQ not in", values, "tashSeq");
            return (Criteria) this;
        }

        public Criteria andTashSeqBetween(String value1, String value2) {
            addCriterion("TASH_SEQ between", value1, value2, "tashSeq");
            return (Criteria) this;
        }

        public Criteria andTashSeqNotBetween(String value1, String value2) {
            addCriterion("TASH_SEQ not between", value1, value2, "tashSeq");
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

        public Criteria andXhdbCodIsNull() {
            addCriterion("XHDB_COD is null");
            return (Criteria) this;
        }

        public Criteria andXhdbCodIsNotNull() {
            addCriterion("XHDB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXhdbCodEqualTo(String value) {
            addCriterion("XHDB_COD =", value, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andXhdbCodNotEqualTo(String value) {
            addCriterion("XHDB_COD <>", value, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andXhdbCodGreaterThan(String value) {
            addCriterion("XHDB_COD >", value, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andXhdbCodGreaterThanOrEqualTo(String value) {
            addCriterion("XHDB_COD >=", value, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andXhdbCodLessThan(String value) {
            addCriterion("XHDB_COD <", value, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andXhdbCodLessThanOrEqualTo(String value) {
            addCriterion("XHDB_COD <=", value, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andXhdbCodLike(String value) {
            addCriterion("XHDB_COD like", value, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andXhdbCodNotLike(String value) {
            addCriterion("XHDB_COD not like", value, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andXhdbCodIn(List<String> values) {
            addCriterion("XHDB_COD in", values, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andXhdbCodNotIn(List<String> values) {
            addCriterion("XHDB_COD not in", values, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andXhdbCodBetween(String value1, String value2) {
            addCriterion("XHDB_COD between", value1, value2, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andXhdbCodNotBetween(String value1, String value2) {
            addCriterion("XHDB_COD not between", value1, value2, "xhdbCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodIsNull() {
            addCriterion("JSY_COD is null");
            return (Criteria) this;
        }

        public Criteria andJsyCodIsNotNull() {
            addCriterion("JSY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJsyCodEqualTo(String value) {
            addCriterion("JSY_COD =", value, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodNotEqualTo(String value) {
            addCriterion("JSY_COD <>", value, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodGreaterThan(String value) {
            addCriterion("JSY_COD >", value, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodGreaterThanOrEqualTo(String value) {
            addCriterion("JSY_COD >=", value, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodLessThan(String value) {
            addCriterion("JSY_COD <", value, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodLessThanOrEqualTo(String value) {
            addCriterion("JSY_COD <=", value, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodLike(String value) {
            addCriterion("JSY_COD like", value, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodNotLike(String value) {
            addCriterion("JSY_COD not like", value, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodIn(List<String> values) {
            addCriterion("JSY_COD in", values, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodNotIn(List<String> values) {
            addCriterion("JSY_COD not in", values, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodBetween(String value1, String value2) {
            addCriterion("JSY_COD between", value1, value2, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andJsyCodNotBetween(String value1, String value2) {
            addCriterion("JSY_COD not between", value1, value2, "jsyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodIsNull() {
            addCriterion("SSY_COD is null");
            return (Criteria) this;
        }

        public Criteria andSsyCodIsNotNull() {
            addCriterion("SSY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSsyCodEqualTo(String value) {
            addCriterion("SSY_COD =", value, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodNotEqualTo(String value) {
            addCriterion("SSY_COD <>", value, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodGreaterThan(String value) {
            addCriterion("SSY_COD >", value, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodGreaterThanOrEqualTo(String value) {
            addCriterion("SSY_COD >=", value, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodLessThan(String value) {
            addCriterion("SSY_COD <", value, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodLessThanOrEqualTo(String value) {
            addCriterion("SSY_COD <=", value, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodLike(String value) {
            addCriterion("SSY_COD like", value, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodNotLike(String value) {
            addCriterion("SSY_COD not like", value, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodIn(List<String> values) {
            addCriterion("SSY_COD in", values, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodNotIn(List<String> values) {
            addCriterion("SSY_COD not in", values, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodBetween(String value1, String value2) {
            addCriterion("SSY_COD between", value1, value2, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andSsyCodNotBetween(String value1, String value2) {
            addCriterion("SSY_COD not between", value1, value2, "ssyCod");
            return (Criteria) this;
        }

        public Criteria andXlCodIsNull() {
            addCriterion("XL_COD is null");
            return (Criteria) this;
        }

        public Criteria andXlCodIsNotNull() {
            addCriterion("XL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXlCodEqualTo(String value) {
            addCriterion("XL_COD =", value, "xlCod");
            return (Criteria) this;
        }

        public Criteria andXlCodNotEqualTo(String value) {
            addCriterion("XL_COD <>", value, "xlCod");
            return (Criteria) this;
        }

        public Criteria andXlCodGreaterThan(String value) {
            addCriterion("XL_COD >", value, "xlCod");
            return (Criteria) this;
        }

        public Criteria andXlCodGreaterThanOrEqualTo(String value) {
            addCriterion("XL_COD >=", value, "xlCod");
            return (Criteria) this;
        }

        public Criteria andXlCodLessThan(String value) {
            addCriterion("XL_COD <", value, "xlCod");
            return (Criteria) this;
        }

        public Criteria andXlCodLessThanOrEqualTo(String value) {
            addCriterion("XL_COD <=", value, "xlCod");
            return (Criteria) this;
        }

        public Criteria andXlCodLike(String value) {
            addCriterion("XL_COD like", value, "xlCod");
            return (Criteria) this;
        }

        public Criteria andXlCodNotLike(String value) {
            addCriterion("XL_COD not like", value, "xlCod");
            return (Criteria) this;
        }

        public Criteria andXlCodIn(List<String> values) {
            addCriterion("XL_COD in", values, "xlCod");
            return (Criteria) this;
        }

        public Criteria andXlCodNotIn(List<String> values) {
            addCriterion("XL_COD not in", values, "xlCod");
            return (Criteria) this;
        }

        public Criteria andXlCodBetween(String value1, String value2) {
            addCriterion("XL_COD between", value1, value2, "xlCod");
            return (Criteria) this;
        }

        public Criteria andXlCodNotBetween(String value1, String value2) {
            addCriterion("XL_COD not between", value1, value2, "xlCod");
            return (Criteria) this;
        }

        public Criteria andIsFqylyIsNull() {
            addCriterion("IS_FQYLY is null");
            return (Criteria) this;
        }

        public Criteria andIsFqylyIsNotNull() {
            addCriterion("IS_FQYLY is not null");
            return (Criteria) this;
        }

        public Criteria andIsFqylyEqualTo(String value) {
            addCriterion("IS_FQYLY =", value, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsFqylyNotEqualTo(String value) {
            addCriterion("IS_FQYLY <>", value, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsFqylyGreaterThan(String value) {
            addCriterion("IS_FQYLY >", value, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsFqylyGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FQYLY >=", value, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsFqylyLessThan(String value) {
            addCriterion("IS_FQYLY <", value, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsFqylyLessThanOrEqualTo(String value) {
            addCriterion("IS_FQYLY <=", value, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsFqylyLike(String value) {
            addCriterion("IS_FQYLY like", value, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsFqylyNotLike(String value) {
            addCriterion("IS_FQYLY not like", value, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsFqylyIn(List<String> values) {
            addCriterion("IS_FQYLY in", values, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsFqylyNotIn(List<String> values) {
            addCriterion("IS_FQYLY not in", values, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsFqylyBetween(String value1, String value2) {
            addCriterion("IS_FQYLY between", value1, value2, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsFqylyNotBetween(String value1, String value2) {
            addCriterion("IS_FQYLY not between", value1, value2, "isFqyly");
            return (Criteria) this;
        }

        public Criteria andIsGpgzIsNull() {
            addCriterion("IS_GPGZ is null");
            return (Criteria) this;
        }

        public Criteria andIsGpgzIsNotNull() {
            addCriterion("IS_GPGZ is not null");
            return (Criteria) this;
        }

        public Criteria andIsGpgzEqualTo(String value) {
            addCriterion("IS_GPGZ =", value, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGpgzNotEqualTo(String value) {
            addCriterion("IS_GPGZ <>", value, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGpgzGreaterThan(String value) {
            addCriterion("IS_GPGZ >", value, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGpgzGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GPGZ >=", value, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGpgzLessThan(String value) {
            addCriterion("IS_GPGZ <", value, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGpgzLessThanOrEqualTo(String value) {
            addCriterion("IS_GPGZ <=", value, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGpgzLike(String value) {
            addCriterion("IS_GPGZ like", value, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGpgzNotLike(String value) {
            addCriterion("IS_GPGZ not like", value, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGpgzIn(List<String> values) {
            addCriterion("IS_GPGZ in", values, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGpgzNotIn(List<String> values) {
            addCriterion("IS_GPGZ not in", values, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGpgzBetween(String value1, String value2) {
            addCriterion("IS_GPGZ between", value1, value2, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGpgzNotBetween(String value1, String value2) {
            addCriterion("IS_GPGZ not between", value1, value2, "isGpgz");
            return (Criteria) this;
        }

        public Criteria andIsGggzIsNull() {
            addCriterion("IS_GGGZ is null");
            return (Criteria) this;
        }

        public Criteria andIsGggzIsNotNull() {
            addCriterion("IS_GGGZ is not null");
            return (Criteria) this;
        }

        public Criteria andIsGggzEqualTo(String value) {
            addCriterion("IS_GGGZ =", value, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsGggzNotEqualTo(String value) {
            addCriterion("IS_GGGZ <>", value, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsGggzGreaterThan(String value) {
            addCriterion("IS_GGGZ >", value, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsGggzGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GGGZ >=", value, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsGggzLessThan(String value) {
            addCriterion("IS_GGGZ <", value, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsGggzLessThanOrEqualTo(String value) {
            addCriterion("IS_GGGZ <=", value, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsGggzLike(String value) {
            addCriterion("IS_GGGZ like", value, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsGggzNotLike(String value) {
            addCriterion("IS_GGGZ not like", value, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsGggzIn(List<String> values) {
            addCriterion("IS_GGGZ in", values, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsGggzNotIn(List<String> values) {
            addCriterion("IS_GGGZ not in", values, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsGggzBetween(String value1, String value2) {
            addCriterion("IS_GGGZ between", value1, value2, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsGggzNotBetween(String value1, String value2) {
            addCriterion("IS_GGGZ not between", value1, value2, "isGggz");
            return (Criteria) this;
        }

        public Criteria andIsSexIsNull() {
            addCriterion("IS_SEX is null");
            return (Criteria) this;
        }

        public Criteria andIsSexIsNotNull() {
            addCriterion("IS_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andIsSexEqualTo(String value) {
            addCriterion("IS_SEX =", value, "isSex");
            return (Criteria) this;
        }

        public Criteria andIsSexNotEqualTo(String value) {
            addCriterion("IS_SEX <>", value, "isSex");
            return (Criteria) this;
        }

        public Criteria andIsSexGreaterThan(String value) {
            addCriterion("IS_SEX >", value, "isSex");
            return (Criteria) this;
        }

        public Criteria andIsSexGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SEX >=", value, "isSex");
            return (Criteria) this;
        }

        public Criteria andIsSexLessThan(String value) {
            addCriterion("IS_SEX <", value, "isSex");
            return (Criteria) this;
        }

        public Criteria andIsSexLessThanOrEqualTo(String value) {
            addCriterion("IS_SEX <=", value, "isSex");
            return (Criteria) this;
        }

        public Criteria andIsSexLike(String value) {
            addCriterion("IS_SEX like", value, "isSex");
            return (Criteria) this;
        }

        public Criteria andIsSexNotLike(String value) {
            addCriterion("IS_SEX not like", value, "isSex");
            return (Criteria) this;
        }

        public Criteria andIsSexIn(List<String> values) {
            addCriterion("IS_SEX in", values, "isSex");
            return (Criteria) this;
        }

        public Criteria andIsSexNotIn(List<String> values) {
            addCriterion("IS_SEX not in", values, "isSex");
            return (Criteria) this;
        }

        public Criteria andIsSexBetween(String value1, String value2) {
            addCriterion("IS_SEX between", value1, value2, "isSex");
            return (Criteria) this;
        }

        public Criteria andIsSexNotBetween(String value1, String value2) {
            addCriterion("IS_SEX not between", value1, value2, "isSex");
            return (Criteria) this;
        }

        public Criteria andTashScoIsNull() {
            addCriterion("TASH_SCO is null");
            return (Criteria) this;
        }

        public Criteria andTashScoIsNotNull() {
            addCriterion("TASH_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andTashScoEqualTo(String value) {
            addCriterion("TASH_SCO =", value, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashScoNotEqualTo(String value) {
            addCriterion("TASH_SCO <>", value, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashScoGreaterThan(String value) {
            addCriterion("TASH_SCO >", value, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashScoGreaterThanOrEqualTo(String value) {
            addCriterion("TASH_SCO >=", value, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashScoLessThan(String value) {
            addCriterion("TASH_SCO <", value, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashScoLessThanOrEqualTo(String value) {
            addCriterion("TASH_SCO <=", value, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashScoLike(String value) {
            addCriterion("TASH_SCO like", value, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashScoNotLike(String value) {
            addCriterion("TASH_SCO not like", value, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashScoIn(List<String> values) {
            addCriterion("TASH_SCO in", values, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashScoNotIn(List<String> values) {
            addCriterion("TASH_SCO not in", values, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashScoBetween(String value1, String value2) {
            addCriterion("TASH_SCO between", value1, value2, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashScoNotBetween(String value1, String value2) {
            addCriterion("TASH_SCO not between", value1, value2, "tashSco");
            return (Criteria) this;
        }

        public Criteria andTashPrIsNull() {
            addCriterion("TASH_PR is null");
            return (Criteria) this;
        }

        public Criteria andTashPrIsNotNull() {
            addCriterion("TASH_PR is not null");
            return (Criteria) this;
        }

        public Criteria andTashPrEqualTo(BigDecimal value) {
            addCriterion("TASH_PR =", value, "tashPr");
            return (Criteria) this;
        }

        public Criteria andTashPrNotEqualTo(BigDecimal value) {
            addCriterion("TASH_PR <>", value, "tashPr");
            return (Criteria) this;
        }

        public Criteria andTashPrGreaterThan(BigDecimal value) {
            addCriterion("TASH_PR >", value, "tashPr");
            return (Criteria) this;
        }

        public Criteria andTashPrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TASH_PR >=", value, "tashPr");
            return (Criteria) this;
        }

        public Criteria andTashPrLessThan(BigDecimal value) {
            addCriterion("TASH_PR <", value, "tashPr");
            return (Criteria) this;
        }

        public Criteria andTashPrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TASH_PR <=", value, "tashPr");
            return (Criteria) this;
        }

        public Criteria andTashPrIn(List<BigDecimal> values) {
            addCriterion("TASH_PR in", values, "tashPr");
            return (Criteria) this;
        }

        public Criteria andTashPrNotIn(List<BigDecimal> values) {
            addCriterion("TASH_PR not in", values, "tashPr");
            return (Criteria) this;
        }

        public Criteria andTashPrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TASH_PR between", value1, value2, "tashPr");
            return (Criteria) this;
        }

        public Criteria andTashPrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TASH_PR not between", value1, value2, "tashPr");
            return (Criteria) this;
        }

        public Criteria andCrtDatIsNull() {
            addCriterion("CRT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCrtDatIsNotNull() {
            addCriterion("CRT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDatEqualTo(Date value) {
            addCriterion("CRT_DAT =", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotEqualTo(Date value) {
            addCriterion("CRT_DAT <>", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatGreaterThan(Date value) {
            addCriterion("CRT_DAT >", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_DAT >=", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatLessThan(Date value) {
            addCriterion("CRT_DAT <", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatLessThanOrEqualTo(Date value) {
            addCriterion("CRT_DAT <=", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatIn(List<Date> values) {
            addCriterion("CRT_DAT in", values, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotIn(List<Date> values) {
            addCriterion("CRT_DAT not in", values, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatBetween(Date value1, Date value2) {
            addCriterion("CRT_DAT between", value1, value2, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotBetween(Date value1, Date value2) {
            addCriterion("CRT_DAT not between", value1, value2, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIsNull() {
            addCriterion("CRT_USR is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIsNotNull() {
            addCriterion("CRT_USR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrEqualTo(String value) {
            addCriterion("CRT_USR =", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotEqualTo(String value) {
            addCriterion("CRT_USR <>", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrGreaterThan(String value) {
            addCriterion("CRT_USR >", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR >=", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLessThan(String value) {
            addCriterion("CRT_USR <", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR <=", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLike(String value) {
            addCriterion("CRT_USR like", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotLike(String value) {
            addCriterion("CRT_USR not like", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIn(List<String> values) {
            addCriterion("CRT_USR in", values, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotIn(List<String> values) {
            addCriterion("CRT_USR not in", values, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrBetween(String value1, String value2) {
            addCriterion("CRT_USR between", value1, value2, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotBetween(String value1, String value2) {
            addCriterion("CRT_USR not between", value1, value2, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andModTimIsNull() {
            addCriterion("MOD_TIM is null");
            return (Criteria) this;
        }

        public Criteria andModTimIsNotNull() {
            addCriterion("MOD_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andModTimEqualTo(Date value) {
            addCriterion("MOD_TIM =", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotEqualTo(Date value) {
            addCriterion("MOD_TIM <>", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimGreaterThan(Date value) {
            addCriterion("MOD_TIM >", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimGreaterThanOrEqualTo(Date value) {
            addCriterion("MOD_TIM >=", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimLessThan(Date value) {
            addCriterion("MOD_TIM <", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimLessThanOrEqualTo(Date value) {
            addCriterion("MOD_TIM <=", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimIn(List<Date> values) {
            addCriterion("MOD_TIM in", values, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotIn(List<Date> values) {
            addCriterion("MOD_TIM not in", values, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimBetween(Date value1, Date value2) {
            addCriterion("MOD_TIM between", value1, value2, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotBetween(Date value1, Date value2) {
            addCriterion("MOD_TIM not between", value1, value2, "modTim");
            return (Criteria) this;
        }

        public Criteria andModUsrIsNull() {
            addCriterion("MOD_USR is null");
            return (Criteria) this;
        }

        public Criteria andModUsrIsNotNull() {
            addCriterion("MOD_USR is not null");
            return (Criteria) this;
        }

        public Criteria andModUsrEqualTo(String value) {
            addCriterion("MOD_USR =", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotEqualTo(String value) {
            addCriterion("MOD_USR <>", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrGreaterThan(String value) {
            addCriterion("MOD_USR >", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USR >=", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrLessThan(String value) {
            addCriterion("MOD_USR <", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrLessThanOrEqualTo(String value) {
            addCriterion("MOD_USR <=", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrLike(String value) {
            addCriterion("MOD_USR like", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotLike(String value) {
            addCriterion("MOD_USR not like", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrIn(List<String> values) {
            addCriterion("MOD_USR in", values, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotIn(List<String> values) {
            addCriterion("MOD_USR not in", values, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrBetween(String value1, String value2) {
            addCriterion("MOD_USR between", value1, value2, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotBetween(String value1, String value2) {
            addCriterion("MOD_USR not between", value1, value2, "modUsr");
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