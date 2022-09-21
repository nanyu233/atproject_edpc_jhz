package activetech.hospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspHljldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspHljldExample() {
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

        public Criteria andHljlSeqIsNull() {
            addCriterion("HLJL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andHljlSeqIsNotNull() {
            addCriterion("HLJL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andHljlSeqEqualTo(String value) {
            addCriterion("HLJL_SEQ =", value, "hljlSeq");
            return (Criteria) this;
        }

        public Criteria andHljlSeqNotEqualTo(String value) {
            addCriterion("HLJL_SEQ <>", value, "hljlSeq");
            return (Criteria) this;
        }

        public Criteria andHljlSeqGreaterThan(String value) {
            addCriterion("HLJL_SEQ >", value, "hljlSeq");
            return (Criteria) this;
        }

        public Criteria andHljlSeqGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_SEQ >=", value, "hljlSeq");
            return (Criteria) this;
        }

        public Criteria andHljlSeqLessThan(String value) {
            addCriterion("HLJL_SEQ <", value, "hljlSeq");
            return (Criteria) this;
        }

        public Criteria andHljlSeqLessThanOrEqualTo(String value) {
            addCriterion("HLJL_SEQ <=", value, "hljlSeq");
            return (Criteria) this;
        }

        public Criteria andHljlSeqLike(String value) {
            addCriterion("HLJL_SEQ like", value, "hljlSeq");
            return (Criteria) this;
        }

        public Criteria andHljlSeqNotLike(String value) {
            addCriterion("HLJL_SEQ not like", value, "hljlSeq");
            return (Criteria) this;
        }

        public Criteria andHljlSeqIn(List<String> values) {
            addCriterion("HLJL_SEQ in", values, "hljlSeq");
            return (Criteria) this;
        }

        public Criteria andHljlSeqNotIn(List<String> values) {
            addCriterion("HLJL_SEQ not in", values, "hljlSeq");
            return (Criteria) this;
        }

        public Criteria andHljlSeqBetween(String value1, String value2) {
            addCriterion("HLJL_SEQ between", value1, value2, "hljlSeq");
            return (Criteria) this;
        }

        public Criteria andHljlSeqNotBetween(String value1, String value2) {
            addCriterion("HLJL_SEQ not between", value1, value2, "hljlSeq");
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

        public Criteria andHljlDatIsNull() {
            addCriterion("HLJL_DAT is null");
            return (Criteria) this;
        }

        public Criteria andHljlDatIsNotNull() {
            addCriterion("HLJL_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andHljlDatEqualTo(Date value) {
            addCriterion("HLJL_DAT =", value, "hljlDat");
            return (Criteria) this;
        }

        public Criteria andHljlDatNotEqualTo(Date value) {
            addCriterion("HLJL_DAT <>", value, "hljlDat");
            return (Criteria) this;
        }

        public Criteria andHljlDatGreaterThan(Date value) {
            addCriterion("HLJL_DAT >", value, "hljlDat");
            return (Criteria) this;
        }

        public Criteria andHljlDatGreaterThanOrEqualTo(Date value) {
            addCriterion("HLJL_DAT >=", value, "hljlDat");
            return (Criteria) this;
        }

        public Criteria andHljlDatLessThan(Date value) {
            addCriterion("HLJL_DAT <", value, "hljlDat");
            return (Criteria) this;
        }

        public Criteria andHljlDatLessThanOrEqualTo(Date value) {
            addCriterion("HLJL_DAT <=", value, "hljlDat");
            return (Criteria) this;
        }

        public Criteria andHljlDatIn(List<Date> values) {
            addCriterion("HLJL_DAT in", values, "hljlDat");
            return (Criteria) this;
        }

        public Criteria andHljlDatNotIn(List<Date> values) {
            addCriterion("HLJL_DAT not in", values, "hljlDat");
            return (Criteria) this;
        }

        public Criteria andHljlDatBetween(Date value1, Date value2) {
            addCriterion("HLJL_DAT between", value1, value2, "hljlDat");
            return (Criteria) this;
        }

        public Criteria andHljlDatNotBetween(Date value1, Date value2) {
            addCriterion("HLJL_DAT not between", value1, value2, "hljlDat");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodIsNull() {
            addCriterion("HLJL_SZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodIsNotNull() {
            addCriterion("HLJL_SZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodEqualTo(String value) {
            addCriterion("HLJL_SZ_COD =", value, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodNotEqualTo(String value) {
            addCriterion("HLJL_SZ_COD <>", value, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodGreaterThan(String value) {
            addCriterion("HLJL_SZ_COD >", value, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_SZ_COD >=", value, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodLessThan(String value) {
            addCriterion("HLJL_SZ_COD <", value, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodLessThanOrEqualTo(String value) {
            addCriterion("HLJL_SZ_COD <=", value, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodLike(String value) {
            addCriterion("HLJL_SZ_COD like", value, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodNotLike(String value) {
            addCriterion("HLJL_SZ_COD not like", value, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodIn(List<String> values) {
            addCriterion("HLJL_SZ_COD in", values, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodNotIn(List<String> values) {
            addCriterion("HLJL_SZ_COD not in", values, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodBetween(String value1, String value2) {
            addCriterion("HLJL_SZ_COD between", value1, value2, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlSzCodNotBetween(String value1, String value2) {
            addCriterion("HLJL_SZ_COD not between", value1, value2, "hljlSzCod");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftIsNull() {
            addCriterion("HLJL_TK_LEFT is null");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftIsNotNull() {
            addCriterion("HLJL_TK_LEFT is not null");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftEqualTo(String value) {
            addCriterion("HLJL_TK_LEFT =", value, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftNotEqualTo(String value) {
            addCriterion("HLJL_TK_LEFT <>", value, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftGreaterThan(String value) {
            addCriterion("HLJL_TK_LEFT >", value, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_TK_LEFT >=", value, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftLessThan(String value) {
            addCriterion("HLJL_TK_LEFT <", value, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftLessThanOrEqualTo(String value) {
            addCriterion("HLJL_TK_LEFT <=", value, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftLike(String value) {
            addCriterion("HLJL_TK_LEFT like", value, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftNotLike(String value) {
            addCriterion("HLJL_TK_LEFT not like", value, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftIn(List<String> values) {
            addCriterion("HLJL_TK_LEFT in", values, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftNotIn(List<String> values) {
            addCriterion("HLJL_TK_LEFT not in", values, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftBetween(String value1, String value2) {
            addCriterion("HLJL_TK_LEFT between", value1, value2, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkLeftNotBetween(String value1, String value2) {
            addCriterion("HLJL_TK_LEFT not between", value1, value2, "hljlTkLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightIsNull() {
            addCriterion("HLJL_TK_RIGHT is null");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightIsNotNull() {
            addCriterion("HLJL_TK_RIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightEqualTo(String value) {
            addCriterion("HLJL_TK_RIGHT =", value, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightNotEqualTo(String value) {
            addCriterion("HLJL_TK_RIGHT <>", value, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightGreaterThan(String value) {
            addCriterion("HLJL_TK_RIGHT >", value, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_TK_RIGHT >=", value, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightLessThan(String value) {
            addCriterion("HLJL_TK_RIGHT <", value, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightLessThanOrEqualTo(String value) {
            addCriterion("HLJL_TK_RIGHT <=", value, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightLike(String value) {
            addCriterion("HLJL_TK_RIGHT like", value, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightNotLike(String value) {
            addCriterion("HLJL_TK_RIGHT not like", value, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightIn(List<String> values) {
            addCriterion("HLJL_TK_RIGHT in", values, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightNotIn(List<String> values) {
            addCriterion("HLJL_TK_RIGHT not in", values, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightBetween(String value1, String value2) {
            addCriterion("HLJL_TK_RIGHT between", value1, value2, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkRightNotBetween(String value1, String value2) {
            addCriterion("HLJL_TK_RIGHT not between", value1, value2, "hljlTkRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftIsNull() {
            addCriterion("HLJL_TKFY_LEFT is null");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftIsNotNull() {
            addCriterion("HLJL_TKFY_LEFT is not null");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftEqualTo(String value) {
            addCriterion("HLJL_TKFY_LEFT =", value, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftNotEqualTo(String value) {
            addCriterion("HLJL_TKFY_LEFT <>", value, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftGreaterThan(String value) {
            addCriterion("HLJL_TKFY_LEFT >", value, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_TKFY_LEFT >=", value, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftLessThan(String value) {
            addCriterion("HLJL_TKFY_LEFT <", value, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftLessThanOrEqualTo(String value) {
            addCriterion("HLJL_TKFY_LEFT <=", value, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftLike(String value) {
            addCriterion("HLJL_TKFY_LEFT like", value, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftNotLike(String value) {
            addCriterion("HLJL_TKFY_LEFT not like", value, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftIn(List<String> values) {
            addCriterion("HLJL_TKFY_LEFT in", values, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftNotIn(List<String> values) {
            addCriterion("HLJL_TKFY_LEFT not in", values, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftBetween(String value1, String value2) {
            addCriterion("HLJL_TKFY_LEFT between", value1, value2, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyLeftNotBetween(String value1, String value2) {
            addCriterion("HLJL_TKFY_LEFT not between", value1, value2, "hljlTkfyLeft");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightIsNull() {
            addCriterion("HLJL_TKFY_RIGHT is null");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightIsNotNull() {
            addCriterion("HLJL_TKFY_RIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightEqualTo(String value) {
            addCriterion("HLJL_TKFY_RIGHT =", value, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightNotEqualTo(String value) {
            addCriterion("HLJL_TKFY_RIGHT <>", value, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightGreaterThan(String value) {
            addCriterion("HLJL_TKFY_RIGHT >", value, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_TKFY_RIGHT >=", value, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightLessThan(String value) {
            addCriterion("HLJL_TKFY_RIGHT <", value, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightLessThanOrEqualTo(String value) {
            addCriterion("HLJL_TKFY_RIGHT <=", value, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightLike(String value) {
            addCriterion("HLJL_TKFY_RIGHT like", value, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightNotLike(String value) {
            addCriterion("HLJL_TKFY_RIGHT not like", value, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightIn(List<String> values) {
            addCriterion("HLJL_TKFY_RIGHT in", values, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightNotIn(List<String> values) {
            addCriterion("HLJL_TKFY_RIGHT not in", values, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightBetween(String value1, String value2) {
            addCriterion("HLJL_TKFY_RIGHT between", value1, value2, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTkfyRightNotBetween(String value1, String value2) {
            addCriterion("HLJL_TKFY_RIGHT not between", value1, value2, "hljlTkfyRight");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrIsNull() {
            addCriterion("HLJL_TMP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrIsNotNull() {
            addCriterion("HLJL_TMP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrEqualTo(BigDecimal value) {
            addCriterion("HLJL_TMP_NBR =", value, "hljlTmpNbr");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrNotEqualTo(BigDecimal value) {
            addCriterion("HLJL_TMP_NBR <>", value, "hljlTmpNbr");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrGreaterThan(BigDecimal value) {
            addCriterion("HLJL_TMP_NBR >", value, "hljlTmpNbr");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HLJL_TMP_NBR >=", value, "hljlTmpNbr");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrLessThan(BigDecimal value) {
            addCriterion("HLJL_TMP_NBR <", value, "hljlTmpNbr");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HLJL_TMP_NBR <=", value, "hljlTmpNbr");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrIn(List<BigDecimal> values) {
            addCriterion("HLJL_TMP_NBR in", values, "hljlTmpNbr");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrNotIn(List<BigDecimal> values) {
            addCriterion("HLJL_TMP_NBR not in", values, "hljlTmpNbr");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HLJL_TMP_NBR between", value1, value2, "hljlTmpNbr");
            return (Criteria) this;
        }

        public Criteria andHljlTmpNbrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HLJL_TMP_NBR not between", value1, value2, "hljlTmpNbr");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatIsNull() {
            addCriterion("HLJL_HRT_BAT is null");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatIsNotNull() {
            addCriterion("HLJL_HRT_BAT is not null");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatEqualTo(Short value) {
            addCriterion("HLJL_HRT_BAT =", value, "hljlHrtBat");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatNotEqualTo(Short value) {
            addCriterion("HLJL_HRT_BAT <>", value, "hljlHrtBat");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatGreaterThan(Short value) {
            addCriterion("HLJL_HRT_BAT >", value, "hljlHrtBat");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatGreaterThanOrEqualTo(Short value) {
            addCriterion("HLJL_HRT_BAT >=", value, "hljlHrtBat");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatLessThan(Short value) {
            addCriterion("HLJL_HRT_BAT <", value, "hljlHrtBat");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatLessThanOrEqualTo(Short value) {
            addCriterion("HLJL_HRT_BAT <=", value, "hljlHrtBat");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatIn(List<Short> values) {
            addCriterion("HLJL_HRT_BAT in", values, "hljlHrtBat");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatNotIn(List<Short> values) {
            addCriterion("HLJL_HRT_BAT not in", values, "hljlHrtBat");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatBetween(Short value1, Short value2) {
            addCriterion("HLJL_HRT_BAT between", value1, value2, "hljlHrtBat");
            return (Criteria) this;
        }

        public Criteria andHljlHrtBatNotBetween(Short value1, Short value2) {
            addCriterion("HLJL_HRT_BAT not between", value1, value2, "hljlHrtBat");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatIsNull() {
            addCriterion("HLJL_BRT_RAT is null");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatIsNotNull() {
            addCriterion("HLJL_BRT_RAT is not null");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatEqualTo(Short value) {
            addCriterion("HLJL_BRT_RAT =", value, "hljlBrtRat");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatNotEqualTo(Short value) {
            addCriterion("HLJL_BRT_RAT <>", value, "hljlBrtRat");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatGreaterThan(Short value) {
            addCriterion("HLJL_BRT_RAT >", value, "hljlBrtRat");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatGreaterThanOrEqualTo(Short value) {
            addCriterion("HLJL_BRT_RAT >=", value, "hljlBrtRat");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatLessThan(Short value) {
            addCriterion("HLJL_BRT_RAT <", value, "hljlBrtRat");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatLessThanOrEqualTo(Short value) {
            addCriterion("HLJL_BRT_RAT <=", value, "hljlBrtRat");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatIn(List<Short> values) {
            addCriterion("HLJL_BRT_RAT in", values, "hljlBrtRat");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatNotIn(List<Short> values) {
            addCriterion("HLJL_BRT_RAT not in", values, "hljlBrtRat");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatBetween(Short value1, Short value2) {
            addCriterion("HLJL_BRT_RAT between", value1, value2, "hljlBrtRat");
            return (Criteria) this;
        }

        public Criteria andHljlBrtRatNotBetween(Short value1, Short value2) {
            addCriterion("HLJL_BRT_RAT not between", value1, value2, "hljlBrtRat");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpIsNull() {
            addCriterion("HLJL_BLDPRE_UP is null");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpIsNotNull() {
            addCriterion("HLJL_BLDPRE_UP is not null");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpEqualTo(Short value) {
            addCriterion("HLJL_BLDPRE_UP =", value, "hljlBldpreUp");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpNotEqualTo(Short value) {
            addCriterion("HLJL_BLDPRE_UP <>", value, "hljlBldpreUp");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpGreaterThan(Short value) {
            addCriterion("HLJL_BLDPRE_UP >", value, "hljlBldpreUp");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpGreaterThanOrEqualTo(Short value) {
            addCriterion("HLJL_BLDPRE_UP >=", value, "hljlBldpreUp");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpLessThan(Short value) {
            addCriterion("HLJL_BLDPRE_UP <", value, "hljlBldpreUp");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpLessThanOrEqualTo(Short value) {
            addCriterion("HLJL_BLDPRE_UP <=", value, "hljlBldpreUp");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpIn(List<Short> values) {
            addCriterion("HLJL_BLDPRE_UP in", values, "hljlBldpreUp");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpNotIn(List<Short> values) {
            addCriterion("HLJL_BLDPRE_UP not in", values, "hljlBldpreUp");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpBetween(Short value1, Short value2) {
            addCriterion("HLJL_BLDPRE_UP between", value1, value2, "hljlBldpreUp");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreUpNotBetween(Short value1, Short value2) {
            addCriterion("HLJL_BLDPRE_UP not between", value1, value2, "hljlBldpreUp");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownIsNull() {
            addCriterion("HLJL_BLDPRE_DOWN is null");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownIsNotNull() {
            addCriterion("HLJL_BLDPRE_DOWN is not null");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownEqualTo(Short value) {
            addCriterion("HLJL_BLDPRE_DOWN =", value, "hljlBldpreDown");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownNotEqualTo(Short value) {
            addCriterion("HLJL_BLDPRE_DOWN <>", value, "hljlBldpreDown");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownGreaterThan(Short value) {
            addCriterion("HLJL_BLDPRE_DOWN >", value, "hljlBldpreDown");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownGreaterThanOrEqualTo(Short value) {
            addCriterion("HLJL_BLDPRE_DOWN >=", value, "hljlBldpreDown");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownLessThan(Short value) {
            addCriterion("HLJL_BLDPRE_DOWN <", value, "hljlBldpreDown");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownLessThanOrEqualTo(Short value) {
            addCriterion("HLJL_BLDPRE_DOWN <=", value, "hljlBldpreDown");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownIn(List<Short> values) {
            addCriterion("HLJL_BLDPRE_DOWN in", values, "hljlBldpreDown");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownNotIn(List<Short> values) {
            addCriterion("HLJL_BLDPRE_DOWN not in", values, "hljlBldpreDown");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownBetween(Short value1, Short value2) {
            addCriterion("HLJL_BLDPRE_DOWN between", value1, value2, "hljlBldpreDown");
            return (Criteria) this;
        }

        public Criteria andHljlBldpreDownNotBetween(Short value1, Short value2) {
            addCriterion("HLJL_BLDPRE_DOWN not between", value1, value2, "hljlBldpreDown");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldIsNull() {
            addCriterion("HLJL_OXY_BLD is null");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldIsNotNull() {
            addCriterion("HLJL_OXY_BLD is not null");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldEqualTo(String value) {
            addCriterion("HLJL_OXY_BLD =", value, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldNotEqualTo(String value) {
            addCriterion("HLJL_OXY_BLD <>", value, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldGreaterThan(String value) {
            addCriterion("HLJL_OXY_BLD >", value, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_OXY_BLD >=", value, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldLessThan(String value) {
            addCriterion("HLJL_OXY_BLD <", value, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldLessThanOrEqualTo(String value) {
            addCriterion("HLJL_OXY_BLD <=", value, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldLike(String value) {
            addCriterion("HLJL_OXY_BLD like", value, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldNotLike(String value) {
            addCriterion("HLJL_OXY_BLD not like", value, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldIn(List<String> values) {
            addCriterion("HLJL_OXY_BLD in", values, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldNotIn(List<String> values) {
            addCriterion("HLJL_OXY_BLD not in", values, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldBetween(String value1, String value2) {
            addCriterion("HLJL_OXY_BLD between", value1, value2, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyBldNotBetween(String value1, String value2) {
            addCriterion("HLJL_OXY_BLD not between", value1, value2, "hljlOxyBld");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkIsNull() {
            addCriterion("HLJL_OXY_UPTK is null");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkIsNotNull() {
            addCriterion("HLJL_OXY_UPTK is not null");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkEqualTo(String value) {
            addCriterion("HLJL_OXY_UPTK =", value, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkNotEqualTo(String value) {
            addCriterion("HLJL_OXY_UPTK <>", value, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkGreaterThan(String value) {
            addCriterion("HLJL_OXY_UPTK >", value, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_OXY_UPTK >=", value, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkLessThan(String value) {
            addCriterion("HLJL_OXY_UPTK <", value, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkLessThanOrEqualTo(String value) {
            addCriterion("HLJL_OXY_UPTK <=", value, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkLike(String value) {
            addCriterion("HLJL_OXY_UPTK like", value, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkNotLike(String value) {
            addCriterion("HLJL_OXY_UPTK not like", value, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkIn(List<String> values) {
            addCriterion("HLJL_OXY_UPTK in", values, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkNotIn(List<String> values) {
            addCriterion("HLJL_OXY_UPTK not in", values, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkBetween(String value1, String value2) {
            addCriterion("HLJL_OXY_UPTK between", value1, value2, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlOxyUptkNotBetween(String value1, String value2) {
            addCriterion("HLJL_OXY_UPTK not between", value1, value2, "hljlOxyUptk");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceIsNull() {
            addCriterion("HLJL_PRE_SCE is null");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceIsNotNull() {
            addCriterion("HLJL_PRE_SCE is not null");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceEqualTo(String value) {
            addCriterion("HLJL_PRE_SCE =", value, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceNotEqualTo(String value) {
            addCriterion("HLJL_PRE_SCE <>", value, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceGreaterThan(String value) {
            addCriterion("HLJL_PRE_SCE >", value, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_PRE_SCE >=", value, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceLessThan(String value) {
            addCriterion("HLJL_PRE_SCE <", value, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceLessThanOrEqualTo(String value) {
            addCriterion("HLJL_PRE_SCE <=", value, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceLike(String value) {
            addCriterion("HLJL_PRE_SCE like", value, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceNotLike(String value) {
            addCriterion("HLJL_PRE_SCE not like", value, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceIn(List<String> values) {
            addCriterion("HLJL_PRE_SCE in", values, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceNotIn(List<String> values) {
            addCriterion("HLJL_PRE_SCE not in", values, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceBetween(String value1, String value2) {
            addCriterion("HLJL_PRE_SCE between", value1, value2, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlPreSceNotBetween(String value1, String value2) {
            addCriterion("HLJL_PRE_SCE not between", value1, value2, "hljlPreSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceIsNull() {
            addCriterion("HLJL_FALL_SCE is null");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceIsNotNull() {
            addCriterion("HLJL_FALL_SCE is not null");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceEqualTo(String value) {
            addCriterion("HLJL_FALL_SCE =", value, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceNotEqualTo(String value) {
            addCriterion("HLJL_FALL_SCE <>", value, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceGreaterThan(String value) {
            addCriterion("HLJL_FALL_SCE >", value, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_FALL_SCE >=", value, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceLessThan(String value) {
            addCriterion("HLJL_FALL_SCE <", value, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceLessThanOrEqualTo(String value) {
            addCriterion("HLJL_FALL_SCE <=", value, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceLike(String value) {
            addCriterion("HLJL_FALL_SCE like", value, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceNotLike(String value) {
            addCriterion("HLJL_FALL_SCE not like", value, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceIn(List<String> values) {
            addCriterion("HLJL_FALL_SCE in", values, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceNotIn(List<String> values) {
            addCriterion("HLJL_FALL_SCE not in", values, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceBetween(String value1, String value2) {
            addCriterion("HLJL_FALL_SCE between", value1, value2, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlFallSceNotBetween(String value1, String value2) {
            addCriterion("HLJL_FALL_SCE not between", value1, value2, "hljlFallSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceIsNull() {
            addCriterion("HLJL_PAIN_SCE is null");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceIsNotNull() {
            addCriterion("HLJL_PAIN_SCE is not null");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceEqualTo(String value) {
            addCriterion("HLJL_PAIN_SCE =", value, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceNotEqualTo(String value) {
            addCriterion("HLJL_PAIN_SCE <>", value, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceGreaterThan(String value) {
            addCriterion("HLJL_PAIN_SCE >", value, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_PAIN_SCE >=", value, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceLessThan(String value) {
            addCriterion("HLJL_PAIN_SCE <", value, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceLessThanOrEqualTo(String value) {
            addCriterion("HLJL_PAIN_SCE <=", value, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceLike(String value) {
            addCriterion("HLJL_PAIN_SCE like", value, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceNotLike(String value) {
            addCriterion("HLJL_PAIN_SCE not like", value, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceIn(List<String> values) {
            addCriterion("HLJL_PAIN_SCE in", values, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceNotIn(List<String> values) {
            addCriterion("HLJL_PAIN_SCE not in", values, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceBetween(String value1, String value2) {
            addCriterion("HLJL_PAIN_SCE between", value1, value2, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlPainSceNotBetween(String value1, String value2) {
            addCriterion("HLJL_PAIN_SCE not between", value1, value2, "hljlPainSce");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugIsNull() {
            addCriterion("HLJL_BLD_SUG is null");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugIsNotNull() {
            addCriterion("HLJL_BLD_SUG is not null");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugEqualTo(String value) {
            addCriterion("HLJL_BLD_SUG =", value, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugNotEqualTo(String value) {
            addCriterion("HLJL_BLD_SUG <>", value, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugGreaterThan(String value) {
            addCriterion("HLJL_BLD_SUG >", value, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_BLD_SUG >=", value, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugLessThan(String value) {
            addCriterion("HLJL_BLD_SUG <", value, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugLessThanOrEqualTo(String value) {
            addCriterion("HLJL_BLD_SUG <=", value, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugLike(String value) {
            addCriterion("HLJL_BLD_SUG like", value, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugNotLike(String value) {
            addCriterion("HLJL_BLD_SUG not like", value, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugIn(List<String> values) {
            addCriterion("HLJL_BLD_SUG in", values, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugNotIn(List<String> values) {
            addCriterion("HLJL_BLD_SUG not in", values, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugBetween(String value1, String value2) {
            addCriterion("HLJL_BLD_SUG between", value1, value2, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlBldSugNotBetween(String value1, String value2) {
            addCriterion("HLJL_BLD_SUG not between", value1, value2, "hljlBldSug");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamIsNull() {
            addCriterion("HLJL_JMSRW_NAM is null");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamIsNotNull() {
            addCriterion("HLJL_JMSRW_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamEqualTo(String value) {
            addCriterion("HLJL_JMSRW_NAM =", value, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamNotEqualTo(String value) {
            addCriterion("HLJL_JMSRW_NAM <>", value, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamGreaterThan(String value) {
            addCriterion("HLJL_JMSRW_NAM >", value, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_JMSRW_NAM >=", value, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamLessThan(String value) {
            addCriterion("HLJL_JMSRW_NAM <", value, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamLessThanOrEqualTo(String value) {
            addCriterion("HLJL_JMSRW_NAM <=", value, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamLike(String value) {
            addCriterion("HLJL_JMSRW_NAM like", value, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamNotLike(String value) {
            addCriterion("HLJL_JMSRW_NAM not like", value, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamIn(List<String> values) {
            addCriterion("HLJL_JMSRW_NAM in", values, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamNotIn(List<String> values) {
            addCriterion("HLJL_JMSRW_NAM not in", values, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamBetween(String value1, String value2) {
            addCriterion("HLJL_JMSRW_NAM between", value1, value2, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNamNotBetween(String value1, String value2) {
            addCriterion("HLJL_JMSRW_NAM not between", value1, value2, "hljlJmsrwNam");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrIsNull() {
            addCriterion("HLJL_JMSRW_NBR is null");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrIsNotNull() {
            addCriterion("HLJL_JMSRW_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrEqualTo(String value) {
            addCriterion("HLJL_JMSRW_NBR =", value, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrNotEqualTo(String value) {
            addCriterion("HLJL_JMSRW_NBR <>", value, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrGreaterThan(String value) {
            addCriterion("HLJL_JMSRW_NBR >", value, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_JMSRW_NBR >=", value, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrLessThan(String value) {
            addCriterion("HLJL_JMSRW_NBR <", value, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrLessThanOrEqualTo(String value) {
            addCriterion("HLJL_JMSRW_NBR <=", value, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrLike(String value) {
            addCriterion("HLJL_JMSRW_NBR like", value, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrNotLike(String value) {
            addCriterion("HLJL_JMSRW_NBR not like", value, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrIn(List<String> values) {
            addCriterion("HLJL_JMSRW_NBR in", values, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrNotIn(List<String> values) {
            addCriterion("HLJL_JMSRW_NBR not in", values, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrBetween(String value1, String value2) {
            addCriterion("HLJL_JMSRW_NBR between", value1, value2, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlJmsrwNbrNotBetween(String value1, String value2) {
            addCriterion("HLJL_JMSRW_NBR not between", value1, value2, "hljlJmsrwNbr");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodIsNull() {
            addCriterion("HLJL_QJCS_COD is null");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodIsNotNull() {
            addCriterion("HLJL_QJCS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodEqualTo(String value) {
            addCriterion("HLJL_QJCS_COD =", value, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodNotEqualTo(String value) {
            addCriterion("HLJL_QJCS_COD <>", value, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodGreaterThan(String value) {
            addCriterion("HLJL_QJCS_COD >", value, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_QJCS_COD >=", value, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodLessThan(String value) {
            addCriterion("HLJL_QJCS_COD <", value, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodLessThanOrEqualTo(String value) {
            addCriterion("HLJL_QJCS_COD <=", value, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodLike(String value) {
            addCriterion("HLJL_QJCS_COD like", value, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodNotLike(String value) {
            addCriterion("HLJL_QJCS_COD not like", value, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodIn(List<String> values) {
            addCriterion("HLJL_QJCS_COD in", values, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodNotIn(List<String> values) {
            addCriterion("HLJL_QJCS_COD not in", values, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodBetween(String value1, String value2) {
            addCriterion("HLJL_QJCS_COD between", value1, value2, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlQjcsCodNotBetween(String value1, String value2) {
            addCriterion("HLJL_QJCS_COD not between", value1, value2, "hljlQjcsCod");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssIsNull() {
            addCriterion("HLJL_HZFY_ASS is null");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssIsNotNull() {
            addCriterion("HLJL_HZFY_ASS is not null");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssEqualTo(String value) {
            addCriterion("HLJL_HZFY_ASS =", value, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssNotEqualTo(String value) {
            addCriterion("HLJL_HZFY_ASS <>", value, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssGreaterThan(String value) {
            addCriterion("HLJL_HZFY_ASS >", value, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_HZFY_ASS >=", value, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssLessThan(String value) {
            addCriterion("HLJL_HZFY_ASS <", value, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssLessThanOrEqualTo(String value) {
            addCriterion("HLJL_HZFY_ASS <=", value, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssLike(String value) {
            addCriterion("HLJL_HZFY_ASS like", value, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssNotLike(String value) {
            addCriterion("HLJL_HZFY_ASS not like", value, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssIn(List<String> values) {
            addCriterion("HLJL_HZFY_ASS in", values, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssNotIn(List<String> values) {
            addCriterion("HLJL_HZFY_ASS not in", values, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssBetween(String value1, String value2) {
            addCriterion("HLJL_HZFY_ASS between", value1, value2, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlHzfyAssNotBetween(String value1, String value2) {
            addCriterion("HLJL_HZFY_ASS not between", value1, value2, "hljlHzfyAss");
            return (Criteria) this;
        }

        public Criteria andHljlNamIsNull() {
            addCriterion("HLJL_NAM is null");
            return (Criteria) this;
        }

        public Criteria andHljlNamIsNotNull() {
            addCriterion("HLJL_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andHljlNamEqualTo(String value) {
            addCriterion("HLJL_NAM =", value, "hljlNam");
            return (Criteria) this;
        }

        public Criteria andHljlNamNotEqualTo(String value) {
            addCriterion("HLJL_NAM <>", value, "hljlNam");
            return (Criteria) this;
        }

        public Criteria andHljlNamGreaterThan(String value) {
            addCriterion("HLJL_NAM >", value, "hljlNam");
            return (Criteria) this;
        }

        public Criteria andHljlNamGreaterThanOrEqualTo(String value) {
            addCriterion("HLJL_NAM >=", value, "hljlNam");
            return (Criteria) this;
        }

        public Criteria andHljlNamLessThan(String value) {
            addCriterion("HLJL_NAM <", value, "hljlNam");
            return (Criteria) this;
        }

        public Criteria andHljlNamLessThanOrEqualTo(String value) {
            addCriterion("HLJL_NAM <=", value, "hljlNam");
            return (Criteria) this;
        }

        public Criteria andHljlNamLike(String value) {
            addCriterion("HLJL_NAM like", value, "hljlNam");
            return (Criteria) this;
        }

        public Criteria andHljlNamNotLike(String value) {
            addCriterion("HLJL_NAM not like", value, "hljlNam");
            return (Criteria) this;
        }

        public Criteria andHljlNamIn(List<String> values) {
            addCriterion("HLJL_NAM in", values, "hljlNam");
            return (Criteria) this;
        }

        public Criteria andHljlNamNotIn(List<String> values) {
            addCriterion("HLJL_NAM not in", values, "hljlNam");
            return (Criteria) this;
        }

        public Criteria andHljlNamBetween(String value1, String value2) {
            addCriterion("HLJL_NAM between", value1, value2, "hljlNam");
            return (Criteria) this;
        }

        public Criteria andHljlNamNotBetween(String value1, String value2) {
            addCriterion("HLJL_NAM not between", value1, value2, "hljlNam");
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

        public Criteria andCrtNamIsNull() {
            addCriterion("CRT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCrtNamIsNotNull() {
            addCriterion("CRT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNamEqualTo(String value) {
            addCriterion("CRT_NAM =", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotEqualTo(String value) {
            addCriterion("CRT_NAM <>", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamGreaterThan(String value) {
            addCriterion("CRT_NAM >", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NAM >=", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLessThan(String value) {
            addCriterion("CRT_NAM <", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLessThanOrEqualTo(String value) {
            addCriterion("CRT_NAM <=", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLike(String value) {
            addCriterion("CRT_NAM like", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotLike(String value) {
            addCriterion("CRT_NAM not like", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamIn(List<String> values) {
            addCriterion("CRT_NAM in", values, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotIn(List<String> values) {
            addCriterion("CRT_NAM not in", values, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamBetween(String value1, String value2) {
            addCriterion("CRT_NAM between", value1, value2, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotBetween(String value1, String value2) {
            addCriterion("CRT_NAM not between", value1, value2, "crtNam");
            return (Criteria) this;
        }

        public Criteria andUpdDatIsNull() {
            addCriterion("UPD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andUpdDatIsNotNull() {
            addCriterion("UPD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdDatEqualTo(Date value) {
            addCriterion("UPD_DAT =", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatNotEqualTo(Date value) {
            addCriterion("UPD_DAT <>", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatGreaterThan(Date value) {
            addCriterion("UPD_DAT >", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPD_DAT >=", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatLessThan(Date value) {
            addCriterion("UPD_DAT <", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatLessThanOrEqualTo(Date value) {
            addCriterion("UPD_DAT <=", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatIn(List<Date> values) {
            addCriterion("UPD_DAT in", values, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatNotIn(List<Date> values) {
            addCriterion("UPD_DAT not in", values, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatBetween(Date value1, Date value2) {
            addCriterion("UPD_DAT between", value1, value2, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatNotBetween(Date value1, Date value2) {
            addCriterion("UPD_DAT not between", value1, value2, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdNamIsNull() {
            addCriterion("UPD_NAM is null");
            return (Criteria) this;
        }

        public Criteria andUpdNamIsNotNull() {
            addCriterion("UPD_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdNamEqualTo(String value) {
            addCriterion("UPD_NAM =", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotEqualTo(String value) {
            addCriterion("UPD_NAM <>", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamGreaterThan(String value) {
            addCriterion("UPD_NAM >", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_NAM >=", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamLessThan(String value) {
            addCriterion("UPD_NAM <", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamLessThanOrEqualTo(String value) {
            addCriterion("UPD_NAM <=", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamLike(String value) {
            addCriterion("UPD_NAM like", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotLike(String value) {
            addCriterion("UPD_NAM not like", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamIn(List<String> values) {
            addCriterion("UPD_NAM in", values, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotIn(List<String> values) {
            addCriterion("UPD_NAM not in", values, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamBetween(String value1, String value2) {
            addCriterion("UPD_NAM between", value1, value2, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotBetween(String value1, String value2) {
            addCriterion("UPD_NAM not between", value1, value2, "updNam");
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