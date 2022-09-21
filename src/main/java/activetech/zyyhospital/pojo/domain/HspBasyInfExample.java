package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspBasyInfExample {
    /**
     * ZJYY.HSP_BASY_INF
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_BASY_INF
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_BASY_INF
     */
    protected List<Criteria> oredCriteria;

    public HspBasyInfExample() {
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

    /**
     * ZJYY.HSP_BASY_INF 2020-08-10
     */
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

        public Criteria andBasySeqIsNull() {
            addCriterion("BASY_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBasySeqIsNotNull() {
            addCriterion("BASY_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBasySeqEqualTo(String value) {
            addCriterion("BASY_SEQ =", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqNotEqualTo(String value) {
            addCriterion("BASY_SEQ <>", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqGreaterThan(String value) {
            addCriterion("BASY_SEQ >", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqGreaterThanOrEqualTo(String value) {
            addCriterion("BASY_SEQ >=", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqLessThan(String value) {
            addCriterion("BASY_SEQ <", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqLessThanOrEqualTo(String value) {
            addCriterion("BASY_SEQ <=", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqLike(String value) {
            addCriterion("BASY_SEQ like", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqNotLike(String value) {
            addCriterion("BASY_SEQ not like", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqIn(List<String> values) {
            addCriterion("BASY_SEQ in", values, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqNotIn(List<String> values) {
            addCriterion("BASY_SEQ not in", values, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqBetween(String value1, String value2) {
            addCriterion("BASY_SEQ between", value1, value2, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqNotBetween(String value1, String value2) {
            addCriterion("BASY_SEQ not between", value1, value2, "basySeq");
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

        public Criteria andYljgIsNull() {
            addCriterion("YLJG is null");
            return (Criteria) this;
        }

        public Criteria andYljgIsNotNull() {
            addCriterion("YLJG is not null");
            return (Criteria) this;
        }

        public Criteria andYljgEqualTo(String value) {
            addCriterion("YLJG =", value, "yljg");
            return (Criteria) this;
        }

        public Criteria andYljgNotEqualTo(String value) {
            addCriterion("YLJG <>", value, "yljg");
            return (Criteria) this;
        }

        public Criteria andYljgGreaterThan(String value) {
            addCriterion("YLJG >", value, "yljg");
            return (Criteria) this;
        }

        public Criteria andYljgGreaterThanOrEqualTo(String value) {
            addCriterion("YLJG >=", value, "yljg");
            return (Criteria) this;
        }

        public Criteria andYljgLessThan(String value) {
            addCriterion("YLJG <", value, "yljg");
            return (Criteria) this;
        }

        public Criteria andYljgLessThanOrEqualTo(String value) {
            addCriterion("YLJG <=", value, "yljg");
            return (Criteria) this;
        }

        public Criteria andYljgLike(String value) {
            addCriterion("YLJG like", value, "yljg");
            return (Criteria) this;
        }

        public Criteria andYljgNotLike(String value) {
            addCriterion("YLJG not like", value, "yljg");
            return (Criteria) this;
        }

        public Criteria andYljgIn(List<String> values) {
            addCriterion("YLJG in", values, "yljg");
            return (Criteria) this;
        }

        public Criteria andYljgNotIn(List<String> values) {
            addCriterion("YLJG not in", values, "yljg");
            return (Criteria) this;
        }

        public Criteria andYljgBetween(String value1, String value2) {
            addCriterion("YLJG between", value1, value2, "yljg");
            return (Criteria) this;
        }

        public Criteria andYljgNotBetween(String value1, String value2) {
            addCriterion("YLJG not between", value1, value2, "yljg");
            return (Criteria) this;
        }

        public Criteria andZzjgCodIsNull() {
            addCriterion("ZZJG_COD is null");
            return (Criteria) this;
        }

        public Criteria andZzjgCodIsNotNull() {
            addCriterion("ZZJG_COD is not null");
            return (Criteria) this;
        }

        public Criteria andZzjgCodEqualTo(String value) {
            addCriterion("ZZJG_COD =", value, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andZzjgCodNotEqualTo(String value) {
            addCriterion("ZZJG_COD <>", value, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andZzjgCodGreaterThan(String value) {
            addCriterion("ZZJG_COD >", value, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andZzjgCodGreaterThanOrEqualTo(String value) {
            addCriterion("ZZJG_COD >=", value, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andZzjgCodLessThan(String value) {
            addCriterion("ZZJG_COD <", value, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andZzjgCodLessThanOrEqualTo(String value) {
            addCriterion("ZZJG_COD <=", value, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andZzjgCodLike(String value) {
            addCriterion("ZZJG_COD like", value, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andZzjgCodNotLike(String value) {
            addCriterion("ZZJG_COD not like", value, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andZzjgCodIn(List<String> values) {
            addCriterion("ZZJG_COD in", values, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andZzjgCodNotIn(List<String> values) {
            addCriterion("ZZJG_COD not in", values, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andZzjgCodBetween(String value1, String value2) {
            addCriterion("ZZJG_COD between", value1, value2, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andZzjgCodNotBetween(String value1, String value2) {
            addCriterion("ZZJG_COD not between", value1, value2, "zzjgCod");
            return (Criteria) this;
        }

        public Criteria andYlffTypeIsNull() {
            addCriterion("YLFF_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andYlffTypeIsNotNull() {
            addCriterion("YLFF_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andYlffTypeEqualTo(String value) {
            addCriterion("YLFF_TYPE =", value, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffTypeNotEqualTo(String value) {
            addCriterion("YLFF_TYPE <>", value, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffTypeGreaterThan(String value) {
            addCriterion("YLFF_TYPE >", value, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffTypeGreaterThanOrEqualTo(String value) {
            addCriterion("YLFF_TYPE >=", value, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffTypeLessThan(String value) {
            addCriterion("YLFF_TYPE <", value, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffTypeLessThanOrEqualTo(String value) {
            addCriterion("YLFF_TYPE <=", value, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffTypeLike(String value) {
            addCriterion("YLFF_TYPE like", value, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffTypeNotLike(String value) {
            addCriterion("YLFF_TYPE not like", value, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffTypeIn(List<String> values) {
            addCriterion("YLFF_TYPE in", values, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffTypeNotIn(List<String> values) {
            addCriterion("YLFF_TYPE not in", values, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffTypeBetween(String value1, String value2) {
            addCriterion("YLFF_TYPE between", value1, value2, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffTypeNotBetween(String value1, String value2) {
            addCriterion("YLFF_TYPE not between", value1, value2, "ylffType");
            return (Criteria) this;
        }

        public Criteria andYlffOtherIsNull() {
            addCriterion("YLFF_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andYlffOtherIsNotNull() {
            addCriterion("YLFF_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andYlffOtherEqualTo(String value) {
            addCriterion("YLFF_OTHER =", value, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andYlffOtherNotEqualTo(String value) {
            addCriterion("YLFF_OTHER <>", value, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andYlffOtherGreaterThan(String value) {
            addCriterion("YLFF_OTHER >", value, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andYlffOtherGreaterThanOrEqualTo(String value) {
            addCriterion("YLFF_OTHER >=", value, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andYlffOtherLessThan(String value) {
            addCriterion("YLFF_OTHER <", value, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andYlffOtherLessThanOrEqualTo(String value) {
            addCriterion("YLFF_OTHER <=", value, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andYlffOtherLike(String value) {
            addCriterion("YLFF_OTHER like", value, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andYlffOtherNotLike(String value) {
            addCriterion("YLFF_OTHER not like", value, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andYlffOtherIn(List<String> values) {
            addCriterion("YLFF_OTHER in", values, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andYlffOtherNotIn(List<String> values) {
            addCriterion("YLFF_OTHER not in", values, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andYlffOtherBetween(String value1, String value2) {
            addCriterion("YLFF_OTHER between", value1, value2, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andYlffOtherNotBetween(String value1, String value2) {
            addCriterion("YLFF_OTHER not between", value1, value2, "ylffOther");
            return (Criteria) this;
        }

        public Criteria andLqNumIsNull() {
            addCriterion("LQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLqNumIsNotNull() {
            addCriterion("LQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLqNumEqualTo(String value) {
            addCriterion("LQ_NUM =", value, "lqNum");
            return (Criteria) this;
        }

        public Criteria andLqNumNotEqualTo(String value) {
            addCriterion("LQ_NUM <>", value, "lqNum");
            return (Criteria) this;
        }

        public Criteria andLqNumGreaterThan(String value) {
            addCriterion("LQ_NUM >", value, "lqNum");
            return (Criteria) this;
        }

        public Criteria andLqNumGreaterThanOrEqualTo(String value) {
            addCriterion("LQ_NUM >=", value, "lqNum");
            return (Criteria) this;
        }

        public Criteria andLqNumLessThan(String value) {
            addCriterion("LQ_NUM <", value, "lqNum");
            return (Criteria) this;
        }

        public Criteria andLqNumLessThanOrEqualTo(String value) {
            addCriterion("LQ_NUM <=", value, "lqNum");
            return (Criteria) this;
        }

        public Criteria andLqNumLike(String value) {
            addCriterion("LQ_NUM like", value, "lqNum");
            return (Criteria) this;
        }

        public Criteria andLqNumNotLike(String value) {
            addCriterion("LQ_NUM not like", value, "lqNum");
            return (Criteria) this;
        }

        public Criteria andLqNumIn(List<String> values) {
            addCriterion("LQ_NUM in", values, "lqNum");
            return (Criteria) this;
        }

        public Criteria andLqNumNotIn(List<String> values) {
            addCriterion("LQ_NUM not in", values, "lqNum");
            return (Criteria) this;
        }

        public Criteria andLqNumBetween(String value1, String value2) {
            addCriterion("LQ_NUM between", value1, value2, "lqNum");
            return (Criteria) this;
        }

        public Criteria andLqNumNotBetween(String value1, String value2) {
            addCriterion("LQ_NUM not between", value1, value2, "lqNum");
            return (Criteria) this;
        }

        public Criteria andGxrNamIsNull() {
            addCriterion("GXR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andGxrNamIsNotNull() {
            addCriterion("GXR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andGxrNamEqualTo(String value) {
            addCriterion("GXR_NAM =", value, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxrNamNotEqualTo(String value) {
            addCriterion("GXR_NAM <>", value, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxrNamGreaterThan(String value) {
            addCriterion("GXR_NAM >", value, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxrNamGreaterThanOrEqualTo(String value) {
            addCriterion("GXR_NAM >=", value, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxrNamLessThan(String value) {
            addCriterion("GXR_NAM <", value, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxrNamLessThanOrEqualTo(String value) {
            addCriterion("GXR_NAM <=", value, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxrNamLike(String value) {
            addCriterion("GXR_NAM like", value, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxrNamNotLike(String value) {
            addCriterion("GXR_NAM not like", value, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxrNamIn(List<String> values) {
            addCriterion("GXR_NAM in", values, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxrNamNotIn(List<String> values) {
            addCriterion("GXR_NAM not in", values, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxrNamBetween(String value1, String value2) {
            addCriterion("GXR_NAM between", value1, value2, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxrNamNotBetween(String value1, String value2) {
            addCriterion("GXR_NAM not between", value1, value2, "gxrNam");
            return (Criteria) this;
        }

        public Criteria andGxIsNull() {
            addCriterion("GX is null");
            return (Criteria) this;
        }

        public Criteria andGxIsNotNull() {
            addCriterion("GX is not null");
            return (Criteria) this;
        }

        public Criteria andGxEqualTo(String value) {
            addCriterion("GX =", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotEqualTo(String value) {
            addCriterion("GX <>", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxGreaterThan(String value) {
            addCriterion("GX >", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxGreaterThanOrEqualTo(String value) {
            addCriterion("GX >=", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxLessThan(String value) {
            addCriterion("GX <", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxLessThanOrEqualTo(String value) {
            addCriterion("GX <=", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxLike(String value) {
            addCriterion("GX like", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotLike(String value) {
            addCriterion("GX not like", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxIn(List<String> values) {
            addCriterion("GX in", values, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotIn(List<String> values) {
            addCriterion("GX not in", values, "gx");
            return (Criteria) this;
        }

        public Criteria andGxBetween(String value1, String value2) {
            addCriterion("GX between", value1, value2, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotBetween(String value1, String value2) {
            addCriterion("GX not between", value1, value2, "gx");
            return (Criteria) this;
        }

        public Criteria andGxrAddresIsNull() {
            addCriterion("GXR_ADDRES is null");
            return (Criteria) this;
        }

        public Criteria andGxrAddresIsNotNull() {
            addCriterion("GXR_ADDRES is not null");
            return (Criteria) this;
        }

        public Criteria andGxrAddresEqualTo(String value) {
            addCriterion("GXR_ADDRES =", value, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrAddresNotEqualTo(String value) {
            addCriterion("GXR_ADDRES <>", value, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrAddresGreaterThan(String value) {
            addCriterion("GXR_ADDRES >", value, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrAddresGreaterThanOrEqualTo(String value) {
            addCriterion("GXR_ADDRES >=", value, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrAddresLessThan(String value) {
            addCriterion("GXR_ADDRES <", value, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrAddresLessThanOrEqualTo(String value) {
            addCriterion("GXR_ADDRES <=", value, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrAddresLike(String value) {
            addCriterion("GXR_ADDRES like", value, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrAddresNotLike(String value) {
            addCriterion("GXR_ADDRES not like", value, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrAddresIn(List<String> values) {
            addCriterion("GXR_ADDRES in", values, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrAddresNotIn(List<String> values) {
            addCriterion("GXR_ADDRES not in", values, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrAddresBetween(String value1, String value2) {
            addCriterion("GXR_ADDRES between", value1, value2, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrAddresNotBetween(String value1, String value2) {
            addCriterion("GXR_ADDRES not between", value1, value2, "gxrAddres");
            return (Criteria) this;
        }

        public Criteria andGxrTelIsNull() {
            addCriterion("GXR_TEL is null");
            return (Criteria) this;
        }

        public Criteria andGxrTelIsNotNull() {
            addCriterion("GXR_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andGxrTelEqualTo(String value) {
            addCriterion("GXR_TEL =", value, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andGxrTelNotEqualTo(String value) {
            addCriterion("GXR_TEL <>", value, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andGxrTelGreaterThan(String value) {
            addCriterion("GXR_TEL >", value, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andGxrTelGreaterThanOrEqualTo(String value) {
            addCriterion("GXR_TEL >=", value, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andGxrTelLessThan(String value) {
            addCriterion("GXR_TEL <", value, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andGxrTelLessThanOrEqualTo(String value) {
            addCriterion("GXR_TEL <=", value, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andGxrTelLike(String value) {
            addCriterion("GXR_TEL like", value, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andGxrTelNotLike(String value) {
            addCriterion("GXR_TEL not like", value, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andGxrTelIn(List<String> values) {
            addCriterion("GXR_TEL in", values, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andGxrTelNotIn(List<String> values) {
            addCriterion("GXR_TEL not in", values, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andGxrTelBetween(String value1, String value2) {
            addCriterion("GXR_TEL between", value1, value2, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andGxrTelNotBetween(String value1, String value2) {
            addCriterion("GXR_TEL not between", value1, value2, "gxrTel");
            return (Criteria) this;
        }

        public Criteria andLqDatIsNull() {
            addCriterion("LQ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andLqDatIsNotNull() {
            addCriterion("LQ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andLqDatEqualTo(Date value) {
            addCriterion("LQ_DAT =", value, "lqDat");
            return (Criteria) this;
        }

        public Criteria andLqDatNotEqualTo(Date value) {
            addCriterion("LQ_DAT <>", value, "lqDat");
            return (Criteria) this;
        }

        public Criteria andLqDatGreaterThan(Date value) {
            addCriterion("LQ_DAT >", value, "lqDat");
            return (Criteria) this;
        }

        public Criteria andLqDatGreaterThanOrEqualTo(Date value) {
            addCriterion("LQ_DAT >=", value, "lqDat");
            return (Criteria) this;
        }

        public Criteria andLqDatLessThan(Date value) {
            addCriterion("LQ_DAT <", value, "lqDat");
            return (Criteria) this;
        }

        public Criteria andLqDatLessThanOrEqualTo(Date value) {
            addCriterion("LQ_DAT <=", value, "lqDat");
            return (Criteria) this;
        }

        public Criteria andLqDatIn(List<Date> values) {
            addCriterion("LQ_DAT in", values, "lqDat");
            return (Criteria) this;
        }

        public Criteria andLqDatNotIn(List<Date> values) {
            addCriterion("LQ_DAT not in", values, "lqDat");
            return (Criteria) this;
        }

        public Criteria andLqDatBetween(Date value1, Date value2) {
            addCriterion("LQ_DAT between", value1, value2, "lqDat");
            return (Criteria) this;
        }

        public Criteria andLqDatNotBetween(Date value1, Date value2) {
            addCriterion("LQ_DAT not between", value1, value2, "lqDat");
            return (Criteria) this;
        }

        public Criteria andLqkbIsNull() {
            addCriterion("LQKB is null");
            return (Criteria) this;
        }

        public Criteria andLqkbIsNotNull() {
            addCriterion("LQKB is not null");
            return (Criteria) this;
        }

        public Criteria andLqkbEqualTo(String value) {
            addCriterion("LQKB =", value, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqkbNotEqualTo(String value) {
            addCriterion("LQKB <>", value, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqkbGreaterThan(String value) {
            addCriterion("LQKB >", value, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqkbGreaterThanOrEqualTo(String value) {
            addCriterion("LQKB >=", value, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqkbLessThan(String value) {
            addCriterion("LQKB <", value, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqkbLessThanOrEqualTo(String value) {
            addCriterion("LQKB <=", value, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqkbLike(String value) {
            addCriterion("LQKB like", value, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqkbNotLike(String value) {
            addCriterion("LQKB not like", value, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqkbIn(List<String> values) {
            addCriterion("LQKB in", values, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqkbNotIn(List<String> values) {
            addCriterion("LQKB not in", values, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqkbBetween(String value1, String value2) {
            addCriterion("LQKB between", value1, value2, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqkbNotBetween(String value1, String value2) {
            addCriterion("LQKB not between", value1, value2, "lqkb");
            return (Criteria) this;
        }

        public Criteria andLqscIsNull() {
            addCriterion("LQSC is null");
            return (Criteria) this;
        }

        public Criteria andLqscIsNotNull() {
            addCriterion("LQSC is not null");
            return (Criteria) this;
        }

        public Criteria andLqscEqualTo(String value) {
            addCriterion("LQSC =", value, "lqsc");
            return (Criteria) this;
        }

        public Criteria andLqscNotEqualTo(String value) {
            addCriterion("LQSC <>", value, "lqsc");
            return (Criteria) this;
        }

        public Criteria andLqscGreaterThan(String value) {
            addCriterion("LQSC >", value, "lqsc");
            return (Criteria) this;
        }

        public Criteria andLqscGreaterThanOrEqualTo(String value) {
            addCriterion("LQSC >=", value, "lqsc");
            return (Criteria) this;
        }

        public Criteria andLqscLessThan(String value) {
            addCriterion("LQSC <", value, "lqsc");
            return (Criteria) this;
        }

        public Criteria andLqscLessThanOrEqualTo(String value) {
            addCriterion("LQSC <=", value, "lqsc");
            return (Criteria) this;
        }

        public Criteria andLqscLike(String value) {
            addCriterion("LQSC like", value, "lqsc");
            return (Criteria) this;
        }

        public Criteria andLqscNotLike(String value) {
            addCriterion("LQSC not like", value, "lqsc");
            return (Criteria) this;
        }

        public Criteria andLqscIn(List<String> values) {
            addCriterion("LQSC in", values, "lqsc");
            return (Criteria) this;
        }

        public Criteria andLqscNotIn(List<String> values) {
            addCriterion("LQSC not in", values, "lqsc");
            return (Criteria) this;
        }

        public Criteria andLqscBetween(String value1, String value2) {
            addCriterion("LQSC between", value1, value2, "lqsc");
            return (Criteria) this;
        }

        public Criteria andLqscNotBetween(String value1, String value2) {
            addCriterion("LQSC not between", value1, value2, "lqsc");
            return (Criteria) this;
        }

        public Criteria andSqlDatIsNull() {
            addCriterion("SQL_DAT is null");
            return (Criteria) this;
        }

        public Criteria andSqlDatIsNotNull() {
            addCriterion("SQL_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDatEqualTo(Date value) {
            addCriterion("SQL_DAT =", value, "sqlDat");
            return (Criteria) this;
        }

        public Criteria andSqlDatNotEqualTo(Date value) {
            addCriterion("SQL_DAT <>", value, "sqlDat");
            return (Criteria) this;
        }

        public Criteria andSqlDatGreaterThan(Date value) {
            addCriterion("SQL_DAT >", value, "sqlDat");
            return (Criteria) this;
        }

        public Criteria andSqlDatGreaterThanOrEqualTo(Date value) {
            addCriterion("SQL_DAT >=", value, "sqlDat");
            return (Criteria) this;
        }

        public Criteria andSqlDatLessThan(Date value) {
            addCriterion("SQL_DAT <", value, "sqlDat");
            return (Criteria) this;
        }

        public Criteria andSqlDatLessThanOrEqualTo(Date value) {
            addCriterion("SQL_DAT <=", value, "sqlDat");
            return (Criteria) this;
        }

        public Criteria andSqlDatIn(List<Date> values) {
            addCriterion("SQL_DAT in", values, "sqlDat");
            return (Criteria) this;
        }

        public Criteria andSqlDatNotIn(List<Date> values) {
            addCriterion("SQL_DAT not in", values, "sqlDat");
            return (Criteria) this;
        }

        public Criteria andSqlDatBetween(Date value1, Date value2) {
            addCriterion("SQL_DAT between", value1, value2, "sqlDat");
            return (Criteria) this;
        }

        public Criteria andSqlDatNotBetween(Date value1, Date value2) {
            addCriterion("SQL_DAT not between", value1, value2, "sqlDat");
            return (Criteria) this;
        }

        public Criteria andSqlTypeIsNull() {
            addCriterion("SQL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSqlTypeIsNotNull() {
            addCriterion("SQL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSqlTypeEqualTo(String value) {
            addCriterion("SQL_TYPE =", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeNotEqualTo(String value) {
            addCriterion("SQL_TYPE <>", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeGreaterThan(String value) {
            addCriterion("SQL_TYPE >", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_TYPE >=", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeLessThan(String value) {
            addCriterion("SQL_TYPE <", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeLessThanOrEqualTo(String value) {
            addCriterion("SQL_TYPE <=", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeLike(String value) {
            addCriterion("SQL_TYPE like", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeNotLike(String value) {
            addCriterion("SQL_TYPE not like", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeIn(List<String> values) {
            addCriterion("SQL_TYPE in", values, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeNotIn(List<String> values) {
            addCriterion("SQL_TYPE not in", values, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeBetween(String value1, String value2) {
            addCriterion("SQL_TYPE between", value1, value2, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeNotBetween(String value1, String value2) {
            addCriterion("SQL_TYPE not between", value1, value2, "sqlType");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamIsNull() {
            addCriterion("JSYLJG_NAM is null");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamIsNotNull() {
            addCriterion("JSYLJG_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamEqualTo(String value) {
            addCriterion("JSYLJG_NAM =", value, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamNotEqualTo(String value) {
            addCriterion("JSYLJG_NAM <>", value, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamGreaterThan(String value) {
            addCriterion("JSYLJG_NAM >", value, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamGreaterThanOrEqualTo(String value) {
            addCriterion("JSYLJG_NAM >=", value, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamLessThan(String value) {
            addCriterion("JSYLJG_NAM <", value, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamLessThanOrEqualTo(String value) {
            addCriterion("JSYLJG_NAM <=", value, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamLike(String value) {
            addCriterion("JSYLJG_NAM like", value, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamNotLike(String value) {
            addCriterion("JSYLJG_NAM not like", value, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamIn(List<String> values) {
            addCriterion("JSYLJG_NAM in", values, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamNotIn(List<String> values) {
            addCriterion("JSYLJG_NAM not in", values, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamBetween(String value1, String value2) {
            addCriterion("JSYLJG_NAM between", value1, value2, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andJsyljgNamNotBetween(String value1, String value2) {
            addCriterion("JSYLJG_NAM not between", value1, value2, "jsyljgNam");
            return (Criteria) this;
        }

        public Criteria andZytjIsNull() {
            addCriterion("ZYTJ is null");
            return (Criteria) this;
        }

        public Criteria andZytjIsNotNull() {
            addCriterion("ZYTJ is not null");
            return (Criteria) this;
        }

        public Criteria andZytjEqualTo(String value) {
            addCriterion("ZYTJ =", value, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjNotEqualTo(String value) {
            addCriterion("ZYTJ <>", value, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjGreaterThan(String value) {
            addCriterion("ZYTJ >", value, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjGreaterThanOrEqualTo(String value) {
            addCriterion("ZYTJ >=", value, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjLessThan(String value) {
            addCriterion("ZYTJ <", value, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjLessThanOrEqualTo(String value) {
            addCriterion("ZYTJ <=", value, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjLike(String value) {
            addCriterion("ZYTJ like", value, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjNotLike(String value) {
            addCriterion("ZYTJ not like", value, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjIn(List<String> values) {
            addCriterion("ZYTJ in", values, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjNotIn(List<String> values) {
            addCriterion("ZYTJ not in", values, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjBetween(String value1, String value2) {
            addCriterion("ZYTJ between", value1, value2, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjNotBetween(String value1, String value2) {
            addCriterion("ZYTJ not between", value1, value2, "zytj");
            return (Criteria) this;
        }

        public Criteria andZytjOtherIsNull() {
            addCriterion("ZYTJ_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andZytjOtherIsNotNull() {
            addCriterion("ZYTJ_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andZytjOtherEqualTo(String value) {
            addCriterion("ZYTJ_OTHER =", value, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andZytjOtherNotEqualTo(String value) {
            addCriterion("ZYTJ_OTHER <>", value, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andZytjOtherGreaterThan(String value) {
            addCriterion("ZYTJ_OTHER >", value, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andZytjOtherGreaterThanOrEqualTo(String value) {
            addCriterion("ZYTJ_OTHER >=", value, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andZytjOtherLessThan(String value) {
            addCriterion("ZYTJ_OTHER <", value, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andZytjOtherLessThanOrEqualTo(String value) {
            addCriterion("ZYTJ_OTHER <=", value, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andZytjOtherLike(String value) {
            addCriterion("ZYTJ_OTHER like", value, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andZytjOtherNotLike(String value) {
            addCriterion("ZYTJ_OTHER not like", value, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andZytjOtherIn(List<String> values) {
            addCriterion("ZYTJ_OTHER in", values, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andZytjOtherNotIn(List<String> values) {
            addCriterion("ZYTJ_OTHER not in", values, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andZytjOtherBetween(String value1, String value2) {
            addCriterion("ZYTJ_OTHER between", value1, value2, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andZytjOtherNotBetween(String value1, String value2) {
            addCriterion("ZYTJ_OTHER not between", value1, value2, "zytjOther");
            return (Criteria) this;
        }

        public Criteria andYwgmIsNull() {
            addCriterion("YWGM is null");
            return (Criteria) this;
        }

        public Criteria andYwgmIsNotNull() {
            addCriterion("YWGM is not null");
            return (Criteria) this;
        }

        public Criteria andYwgmEqualTo(String value) {
            addCriterion("YWGM =", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmNotEqualTo(String value) {
            addCriterion("YWGM <>", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmGreaterThan(String value) {
            addCriterion("YWGM >", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmGreaterThanOrEqualTo(String value) {
            addCriterion("YWGM >=", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmLessThan(String value) {
            addCriterion("YWGM <", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmLessThanOrEqualTo(String value) {
            addCriterion("YWGM <=", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmLike(String value) {
            addCriterion("YWGM like", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmNotLike(String value) {
            addCriterion("YWGM not like", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmIn(List<String> values) {
            addCriterion("YWGM in", values, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmNotIn(List<String> values) {
            addCriterion("YWGM not in", values, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmBetween(String value1, String value2) {
            addCriterion("YWGM between", value1, value2, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmNotBetween(String value1, String value2) {
            addCriterion("YWGM not between", value1, value2, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherIsNull() {
            addCriterion("YWGM_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherIsNotNull() {
            addCriterion("YWGM_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherEqualTo(String value) {
            addCriterion("YWGM_OTHER =", value, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherNotEqualTo(String value) {
            addCriterion("YWGM_OTHER <>", value, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherGreaterThan(String value) {
            addCriterion("YWGM_OTHER >", value, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherGreaterThanOrEqualTo(String value) {
            addCriterion("YWGM_OTHER >=", value, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherLessThan(String value) {
            addCriterion("YWGM_OTHER <", value, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherLessThanOrEqualTo(String value) {
            addCriterion("YWGM_OTHER <=", value, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherLike(String value) {
            addCriterion("YWGM_OTHER like", value, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherNotLike(String value) {
            addCriterion("YWGM_OTHER not like", value, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherIn(List<String> values) {
            addCriterion("YWGM_OTHER in", values, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherNotIn(List<String> values) {
            addCriterion("YWGM_OTHER not in", values, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherBetween(String value1, String value2) {
            addCriterion("YWGM_OTHER between", value1, value2, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andYwgmOtherNotBetween(String value1, String value2) {
            addCriterion("YWGM_OTHER not between", value1, value2, "ywgmOther");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNull() {
            addCriterion("BLOOD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNotNull() {
            addCriterion("BLOOD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeEqualTo(String value) {
            addCriterion("BLOOD_TYPE =", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotEqualTo(String value) {
            addCriterion("BLOOD_TYPE <>", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThan(String value) {
            addCriterion("BLOOD_TYPE >", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BLOOD_TYPE >=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThan(String value) {
            addCriterion("BLOOD_TYPE <", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThanOrEqualTo(String value) {
            addCriterion("BLOOD_TYPE <=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLike(String value) {
            addCriterion("BLOOD_TYPE like", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotLike(String value) {
            addCriterion("BLOOD_TYPE not like", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIn(List<String> values) {
            addCriterion("BLOOD_TYPE in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotIn(List<String> values) {
            addCriterion("BLOOD_TYPE not in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeBetween(String value1, String value2) {
            addCriterion("BLOOD_TYPE between", value1, value2, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotBetween(String value1, String value2) {
            addCriterion("BLOOD_TYPE not between", value1, value2, "bloodType");
            return (Criteria) this;
        }

        public Criteria andRhIsNull() {
            addCriterion("RH is null");
            return (Criteria) this;
        }

        public Criteria andRhIsNotNull() {
            addCriterion("RH is not null");
            return (Criteria) this;
        }

        public Criteria andRhEqualTo(String value) {
            addCriterion("RH =", value, "rh");
            return (Criteria) this;
        }

        public Criteria andRhNotEqualTo(String value) {
            addCriterion("RH <>", value, "rh");
            return (Criteria) this;
        }

        public Criteria andRhGreaterThan(String value) {
            addCriterion("RH >", value, "rh");
            return (Criteria) this;
        }

        public Criteria andRhGreaterThanOrEqualTo(String value) {
            addCriterion("RH >=", value, "rh");
            return (Criteria) this;
        }

        public Criteria andRhLessThan(String value) {
            addCriterion("RH <", value, "rh");
            return (Criteria) this;
        }

        public Criteria andRhLessThanOrEqualTo(String value) {
            addCriterion("RH <=", value, "rh");
            return (Criteria) this;
        }

        public Criteria andRhLike(String value) {
            addCriterion("RH like", value, "rh");
            return (Criteria) this;
        }

        public Criteria andRhNotLike(String value) {
            addCriterion("RH not like", value, "rh");
            return (Criteria) this;
        }

        public Criteria andRhIn(List<String> values) {
            addCriterion("RH in", values, "rh");
            return (Criteria) this;
        }

        public Criteria andRhNotIn(List<String> values) {
            addCriterion("RH not in", values, "rh");
            return (Criteria) this;
        }

        public Criteria andRhBetween(String value1, String value2) {
            addCriterion("RH between", value1, value2, "rh");
            return (Criteria) this;
        }

        public Criteria andRhNotBetween(String value1, String value2) {
            addCriterion("RH not between", value1, value2, "rh");
            return (Criteria) this;
        }

        public Criteria andZgysCodIsNull() {
            addCriterion("ZGYS_COD is null");
            return (Criteria) this;
        }

        public Criteria andZgysCodIsNotNull() {
            addCriterion("ZGYS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andZgysCodEqualTo(String value) {
            addCriterion("ZGYS_COD =", value, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysCodNotEqualTo(String value) {
            addCriterion("ZGYS_COD <>", value, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysCodGreaterThan(String value) {
            addCriterion("ZGYS_COD >", value, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysCodGreaterThanOrEqualTo(String value) {
            addCriterion("ZGYS_COD >=", value, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysCodLessThan(String value) {
            addCriterion("ZGYS_COD <", value, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysCodLessThanOrEqualTo(String value) {
            addCriterion("ZGYS_COD <=", value, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysCodLike(String value) {
            addCriterion("ZGYS_COD like", value, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysCodNotLike(String value) {
            addCriterion("ZGYS_COD not like", value, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysCodIn(List<String> values) {
            addCriterion("ZGYS_COD in", values, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysCodNotIn(List<String> values) {
            addCriterion("ZGYS_COD not in", values, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysCodBetween(String value1, String value2) {
            addCriterion("ZGYS_COD between", value1, value2, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysCodNotBetween(String value1, String value2) {
            addCriterion("ZGYS_COD not between", value1, value2, "zgysCod");
            return (Criteria) this;
        }

        public Criteria andZgysNamIsNull() {
            addCriterion("ZGYS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andZgysNamIsNotNull() {
            addCriterion("ZGYS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andZgysNamEqualTo(String value) {
            addCriterion("ZGYS_NAM =", value, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andZgysNamNotEqualTo(String value) {
            addCriterion("ZGYS_NAM <>", value, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andZgysNamGreaterThan(String value) {
            addCriterion("ZGYS_NAM >", value, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andZgysNamGreaterThanOrEqualTo(String value) {
            addCriterion("ZGYS_NAM >=", value, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andZgysNamLessThan(String value) {
            addCriterion("ZGYS_NAM <", value, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andZgysNamLessThanOrEqualTo(String value) {
            addCriterion("ZGYS_NAM <=", value, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andZgysNamLike(String value) {
            addCriterion("ZGYS_NAM like", value, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andZgysNamNotLike(String value) {
            addCriterion("ZGYS_NAM not like", value, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andZgysNamIn(List<String> values) {
            addCriterion("ZGYS_NAM in", values, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andZgysNamNotIn(List<String> values) {
            addCriterion("ZGYS_NAM not in", values, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andZgysNamBetween(String value1, String value2) {
            addCriterion("ZGYS_NAM between", value1, value2, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andZgysNamNotBetween(String value1, String value2) {
            addCriterion("ZGYS_NAM not between", value1, value2, "zgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysCodIsNull() {
            addCriterion("JGYS_COD is null");
            return (Criteria) this;
        }

        public Criteria andJgysCodIsNotNull() {
            addCriterion("JGYS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJgysCodEqualTo(String value) {
            addCriterion("JGYS_COD =", value, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysCodNotEqualTo(String value) {
            addCriterion("JGYS_COD <>", value, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysCodGreaterThan(String value) {
            addCriterion("JGYS_COD >", value, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysCodGreaterThanOrEqualTo(String value) {
            addCriterion("JGYS_COD >=", value, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysCodLessThan(String value) {
            addCriterion("JGYS_COD <", value, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysCodLessThanOrEqualTo(String value) {
            addCriterion("JGYS_COD <=", value, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysCodLike(String value) {
            addCriterion("JGYS_COD like", value, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysCodNotLike(String value) {
            addCriterion("JGYS_COD not like", value, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysCodIn(List<String> values) {
            addCriterion("JGYS_COD in", values, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysCodNotIn(List<String> values) {
            addCriterion("JGYS_COD not in", values, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysCodBetween(String value1, String value2) {
            addCriterion("JGYS_COD between", value1, value2, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysCodNotBetween(String value1, String value2) {
            addCriterion("JGYS_COD not between", value1, value2, "jgysCod");
            return (Criteria) this;
        }

        public Criteria andJgysNamIsNull() {
            addCriterion("JGYS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andJgysNamIsNotNull() {
            addCriterion("JGYS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andJgysNamEqualTo(String value) {
            addCriterion("JGYS_NAM =", value, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysNamNotEqualTo(String value) {
            addCriterion("JGYS_NAM <>", value, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysNamGreaterThan(String value) {
            addCriterion("JGYS_NAM >", value, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysNamGreaterThanOrEqualTo(String value) {
            addCriterion("JGYS_NAM >=", value, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysNamLessThan(String value) {
            addCriterion("JGYS_NAM <", value, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysNamLessThanOrEqualTo(String value) {
            addCriterion("JGYS_NAM <=", value, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysNamLike(String value) {
            addCriterion("JGYS_NAM like", value, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysNamNotLike(String value) {
            addCriterion("JGYS_NAM not like", value, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysNamIn(List<String> values) {
            addCriterion("JGYS_NAM in", values, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysNamNotIn(List<String> values) {
            addCriterion("JGYS_NAM not in", values, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysNamBetween(String value1, String value2) {
            addCriterion("JGYS_NAM between", value1, value2, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andJgysNamNotBetween(String value1, String value2) {
            addCriterion("JGYS_NAM not between", value1, value2, "jgysNam");
            return (Criteria) this;
        }

        public Criteria andZrhsCodIsNull() {
            addCriterion("ZRHS_COD is null");
            return (Criteria) this;
        }

        public Criteria andZrhsCodIsNotNull() {
            addCriterion("ZRHS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andZrhsCodEqualTo(String value) {
            addCriterion("ZRHS_COD =", value, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsCodNotEqualTo(String value) {
            addCriterion("ZRHS_COD <>", value, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsCodGreaterThan(String value) {
            addCriterion("ZRHS_COD >", value, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsCodGreaterThanOrEqualTo(String value) {
            addCriterion("ZRHS_COD >=", value, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsCodLessThan(String value) {
            addCriterion("ZRHS_COD <", value, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsCodLessThanOrEqualTo(String value) {
            addCriterion("ZRHS_COD <=", value, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsCodLike(String value) {
            addCriterion("ZRHS_COD like", value, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsCodNotLike(String value) {
            addCriterion("ZRHS_COD not like", value, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsCodIn(List<String> values) {
            addCriterion("ZRHS_COD in", values, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsCodNotIn(List<String> values) {
            addCriterion("ZRHS_COD not in", values, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsCodBetween(String value1, String value2) {
            addCriterion("ZRHS_COD between", value1, value2, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsCodNotBetween(String value1, String value2) {
            addCriterion("ZRHS_COD not between", value1, value2, "zrhsCod");
            return (Criteria) this;
        }

        public Criteria andZrhsNamIsNull() {
            addCriterion("ZRHS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andZrhsNamIsNotNull() {
            addCriterion("ZRHS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andZrhsNamEqualTo(String value) {
            addCriterion("ZRHS_NAM =", value, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andZrhsNamNotEqualTo(String value) {
            addCriterion("ZRHS_NAM <>", value, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andZrhsNamGreaterThan(String value) {
            addCriterion("ZRHS_NAM >", value, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andZrhsNamGreaterThanOrEqualTo(String value) {
            addCriterion("ZRHS_NAM >=", value, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andZrhsNamLessThan(String value) {
            addCriterion("ZRHS_NAM <", value, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andZrhsNamLessThanOrEqualTo(String value) {
            addCriterion("ZRHS_NAM <=", value, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andZrhsNamLike(String value) {
            addCriterion("ZRHS_NAM like", value, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andZrhsNamNotLike(String value) {
            addCriterion("ZRHS_NAM not like", value, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andZrhsNamIn(List<String> values) {
            addCriterion("ZRHS_NAM in", values, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andZrhsNamNotIn(List<String> values) {
            addCriterion("ZRHS_NAM not in", values, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andZrhsNamBetween(String value1, String value2) {
            addCriterion("ZRHS_NAM between", value1, value2, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andZrhsNamNotBetween(String value1, String value2) {
            addCriterion("ZRHS_NAM not between", value1, value2, "zrhsNam");
            return (Criteria) this;
        }

        public Criteria andByzd1IsNull() {
            addCriterion("BYZD1 is null");
            return (Criteria) this;
        }

        public Criteria andByzd1IsNotNull() {
            addCriterion("BYZD1 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd1EqualTo(String value) {
            addCriterion("BYZD1 =", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotEqualTo(String value) {
            addCriterion("BYZD1 <>", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1GreaterThan(String value) {
            addCriterion("BYZD1 >", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1GreaterThanOrEqualTo(String value) {
            addCriterion("BYZD1 >=", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1LessThan(String value) {
            addCriterion("BYZD1 <", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1LessThanOrEqualTo(String value) {
            addCriterion("BYZD1 <=", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1Like(String value) {
            addCriterion("BYZD1 like", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotLike(String value) {
            addCriterion("BYZD1 not like", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1In(List<String> values) {
            addCriterion("BYZD1 in", values, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotIn(List<String> values) {
            addCriterion("BYZD1 not in", values, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1Between(String value1, String value2) {
            addCriterion("BYZD1 between", value1, value2, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotBetween(String value1, String value2) {
            addCriterion("BYZD1 not between", value1, value2, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd2IsNull() {
            addCriterion("BYZD2 is null");
            return (Criteria) this;
        }

        public Criteria andByzd2IsNotNull() {
            addCriterion("BYZD2 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd2EqualTo(String value) {
            addCriterion("BYZD2 =", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotEqualTo(String value) {
            addCriterion("BYZD2 <>", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2GreaterThan(String value) {
            addCriterion("BYZD2 >", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2GreaterThanOrEqualTo(String value) {
            addCriterion("BYZD2 >=", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2LessThan(String value) {
            addCriterion("BYZD2 <", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2LessThanOrEqualTo(String value) {
            addCriterion("BYZD2 <=", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2Like(String value) {
            addCriterion("BYZD2 like", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotLike(String value) {
            addCriterion("BYZD2 not like", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2In(List<String> values) {
            addCriterion("BYZD2 in", values, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotIn(List<String> values) {
            addCriterion("BYZD2 not in", values, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2Between(String value1, String value2) {
            addCriterion("BYZD2 between", value1, value2, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotBetween(String value1, String value2) {
            addCriterion("BYZD2 not between", value1, value2, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd3IsNull() {
            addCriterion("BYZD3 is null");
            return (Criteria) this;
        }

        public Criteria andByzd3IsNotNull() {
            addCriterion("BYZD3 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd3EqualTo(String value) {
            addCriterion("BYZD3 =", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3NotEqualTo(String value) {
            addCriterion("BYZD3 <>", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3GreaterThan(String value) {
            addCriterion("BYZD3 >", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3GreaterThanOrEqualTo(String value) {
            addCriterion("BYZD3 >=", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3LessThan(String value) {
            addCriterion("BYZD3 <", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3LessThanOrEqualTo(String value) {
            addCriterion("BYZD3 <=", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3Like(String value) {
            addCriterion("BYZD3 like", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3NotLike(String value) {
            addCriterion("BYZD3 not like", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3In(List<String> values) {
            addCriterion("BYZD3 in", values, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3NotIn(List<String> values) {
            addCriterion("BYZD3 not in", values, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3Between(String value1, String value2) {
            addCriterion("BYZD3 between", value1, value2, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3NotBetween(String value1, String value2) {
            addCriterion("BYZD3 not between", value1, value2, "byzd3");
            return (Criteria) this;
        }

        public Criteria andCreDatIsNull() {
            addCriterion("CRE_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCreDatIsNotNull() {
            addCriterion("CRE_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCreDatEqualTo(Date value) {
            addCriterion("CRE_DAT =", value, "creDat");
            return (Criteria) this;
        }

        public Criteria andCreDatNotEqualTo(Date value) {
            addCriterion("CRE_DAT <>", value, "creDat");
            return (Criteria) this;
        }

        public Criteria andCreDatGreaterThan(Date value) {
            addCriterion("CRE_DAT >", value, "creDat");
            return (Criteria) this;
        }

        public Criteria andCreDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CRE_DAT >=", value, "creDat");
            return (Criteria) this;
        }

        public Criteria andCreDatLessThan(Date value) {
            addCriterion("CRE_DAT <", value, "creDat");
            return (Criteria) this;
        }

        public Criteria andCreDatLessThanOrEqualTo(Date value) {
            addCriterion("CRE_DAT <=", value, "creDat");
            return (Criteria) this;
        }

        public Criteria andCreDatIn(List<Date> values) {
            addCriterion("CRE_DAT in", values, "creDat");
            return (Criteria) this;
        }

        public Criteria andCreDatNotIn(List<Date> values) {
            addCriterion("CRE_DAT not in", values, "creDat");
            return (Criteria) this;
        }

        public Criteria andCreDatBetween(Date value1, Date value2) {
            addCriterion("CRE_DAT between", value1, value2, "creDat");
            return (Criteria) this;
        }

        public Criteria andCreDatNotBetween(Date value1, Date value2) {
            addCriterion("CRE_DAT not between", value1, value2, "creDat");
            return (Criteria) this;
        }

        public Criteria andCreCodIsNull() {
            addCriterion("CRE_COD is null");
            return (Criteria) this;
        }

        public Criteria andCreCodIsNotNull() {
            addCriterion("CRE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCreCodEqualTo(String value) {
            addCriterion("CRE_COD =", value, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreCodNotEqualTo(String value) {
            addCriterion("CRE_COD <>", value, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreCodGreaterThan(String value) {
            addCriterion("CRE_COD >", value, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreCodGreaterThanOrEqualTo(String value) {
            addCriterion("CRE_COD >=", value, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreCodLessThan(String value) {
            addCriterion("CRE_COD <", value, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreCodLessThanOrEqualTo(String value) {
            addCriterion("CRE_COD <=", value, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreCodLike(String value) {
            addCriterion("CRE_COD like", value, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreCodNotLike(String value) {
            addCriterion("CRE_COD not like", value, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreCodIn(List<String> values) {
            addCriterion("CRE_COD in", values, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreCodNotIn(List<String> values) {
            addCriterion("CRE_COD not in", values, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreCodBetween(String value1, String value2) {
            addCriterion("CRE_COD between", value1, value2, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreCodNotBetween(String value1, String value2) {
            addCriterion("CRE_COD not between", value1, value2, "creCod");
            return (Criteria) this;
        }

        public Criteria andCreNamIsNull() {
            addCriterion("CRE_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCreNamIsNotNull() {
            addCriterion("CRE_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCreNamEqualTo(String value) {
            addCriterion("CRE_NAM =", value, "creNam");
            return (Criteria) this;
        }

        public Criteria andCreNamNotEqualTo(String value) {
            addCriterion("CRE_NAM <>", value, "creNam");
            return (Criteria) this;
        }

        public Criteria andCreNamGreaterThan(String value) {
            addCriterion("CRE_NAM >", value, "creNam");
            return (Criteria) this;
        }

        public Criteria andCreNamGreaterThanOrEqualTo(String value) {
            addCriterion("CRE_NAM >=", value, "creNam");
            return (Criteria) this;
        }

        public Criteria andCreNamLessThan(String value) {
            addCriterion("CRE_NAM <", value, "creNam");
            return (Criteria) this;
        }

        public Criteria andCreNamLessThanOrEqualTo(String value) {
            addCriterion("CRE_NAM <=", value, "creNam");
            return (Criteria) this;
        }

        public Criteria andCreNamLike(String value) {
            addCriterion("CRE_NAM like", value, "creNam");
            return (Criteria) this;
        }

        public Criteria andCreNamNotLike(String value) {
            addCriterion("CRE_NAM not like", value, "creNam");
            return (Criteria) this;
        }

        public Criteria andCreNamIn(List<String> values) {
            addCriterion("CRE_NAM in", values, "creNam");
            return (Criteria) this;
        }

        public Criteria andCreNamNotIn(List<String> values) {
            addCriterion("CRE_NAM not in", values, "creNam");
            return (Criteria) this;
        }

        public Criteria andCreNamBetween(String value1, String value2) {
            addCriterion("CRE_NAM between", value1, value2, "creNam");
            return (Criteria) this;
        }

        public Criteria andCreNamNotBetween(String value1, String value2) {
            addCriterion("CRE_NAM not between", value1, value2, "creNam");
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

        public Criteria andUpdCodIsNull() {
            addCriterion("UPD_COD is null");
            return (Criteria) this;
        }

        public Criteria andUpdCodIsNotNull() {
            addCriterion("UPD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andUpdCodEqualTo(String value) {
            addCriterion("UPD_COD =", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodNotEqualTo(String value) {
            addCriterion("UPD_COD <>", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodGreaterThan(String value) {
            addCriterion("UPD_COD >", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_COD >=", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodLessThan(String value) {
            addCriterion("UPD_COD <", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodLessThanOrEqualTo(String value) {
            addCriterion("UPD_COD <=", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodLike(String value) {
            addCriterion("UPD_COD like", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodNotLike(String value) {
            addCriterion("UPD_COD not like", value, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodIn(List<String> values) {
            addCriterion("UPD_COD in", values, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodNotIn(List<String> values) {
            addCriterion("UPD_COD not in", values, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodBetween(String value1, String value2) {
            addCriterion("UPD_COD between", value1, value2, "updCod");
            return (Criteria) this;
        }

        public Criteria andUpdCodNotBetween(String value1, String value2) {
            addCriterion("UPD_COD not between", value1, value2, "updCod");
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

        public Criteria andLqscTypeIsNull() {
            addCriterion("LQSC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLqscTypeIsNotNull() {
            addCriterion("LQSC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLqscTypeEqualTo(String value) {
            addCriterion("LQSC_TYPE =", value, "lqscType");
            return (Criteria) this;
        }

        public Criteria andLqscTypeNotEqualTo(String value) {
            addCriterion("LQSC_TYPE <>", value, "lqscType");
            return (Criteria) this;
        }

        public Criteria andLqscTypeGreaterThan(String value) {
            addCriterion("LQSC_TYPE >", value, "lqscType");
            return (Criteria) this;
        }

        public Criteria andLqscTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LQSC_TYPE >=", value, "lqscType");
            return (Criteria) this;
        }

        public Criteria andLqscTypeLessThan(String value) {
            addCriterion("LQSC_TYPE <", value, "lqscType");
            return (Criteria) this;
        }

        public Criteria andLqscTypeLessThanOrEqualTo(String value) {
            addCriterion("LQSC_TYPE <=", value, "lqscType");
            return (Criteria) this;
        }

        public Criteria andLqscTypeLike(String value) {
            addCriterion("LQSC_TYPE like", value, "lqscType");
            return (Criteria) this;
        }

        public Criteria andLqscTypeNotLike(String value) {
            addCriterion("LQSC_TYPE not like", value, "lqscType");
            return (Criteria) this;
        }

        public Criteria andLqscTypeIn(List<String> values) {
            addCriterion("LQSC_TYPE in", values, "lqscType");
            return (Criteria) this;
        }

        public Criteria andLqscTypeNotIn(List<String> values) {
            addCriterion("LQSC_TYPE not in", values, "lqscType");
            return (Criteria) this;
        }

        public Criteria andLqscTypeBetween(String value1, String value2) {
            addCriterion("LQSC_TYPE between", value1, value2, "lqscType");
            return (Criteria) this;
        }

        public Criteria andLqscTypeNotBetween(String value1, String value2) {
            addCriterion("LQSC_TYPE not between", value1, value2, "lqscType");
            return (Criteria) this;
        }

        public Criteria andBzCodIsNull() {
            addCriterion("BZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andBzCodIsNotNull() {
            addCriterion("BZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBzCodEqualTo(String value) {
            addCriterion("BZ_COD =", value, "bzCod");
            return (Criteria) this;
        }

        public Criteria andBzCodNotEqualTo(String value) {
            addCriterion("BZ_COD <>", value, "bzCod");
            return (Criteria) this;
        }

        public Criteria andBzCodGreaterThan(String value) {
            addCriterion("BZ_COD >", value, "bzCod");
            return (Criteria) this;
        }

        public Criteria andBzCodGreaterThanOrEqualTo(String value) {
            addCriterion("BZ_COD >=", value, "bzCod");
            return (Criteria) this;
        }

        public Criteria andBzCodLessThan(String value) {
            addCriterion("BZ_COD <", value, "bzCod");
            return (Criteria) this;
        }

        public Criteria andBzCodLessThanOrEqualTo(String value) {
            addCriterion("BZ_COD <=", value, "bzCod");
            return (Criteria) this;
        }

        public Criteria andBzCodLike(String value) {
            addCriterion("BZ_COD like", value, "bzCod");
            return (Criteria) this;
        }

        public Criteria andBzCodNotLike(String value) {
            addCriterion("BZ_COD not like", value, "bzCod");
            return (Criteria) this;
        }

        public Criteria andBzCodIn(List<String> values) {
            addCriterion("BZ_COD in", values, "bzCod");
            return (Criteria) this;
        }

        public Criteria andBzCodNotIn(List<String> values) {
            addCriterion("BZ_COD not in", values, "bzCod");
            return (Criteria) this;
        }

        public Criteria andBzCodBetween(String value1, String value2) {
            addCriterion("BZ_COD between", value1, value2, "bzCod");
            return (Criteria) this;
        }

        public Criteria andBzCodNotBetween(String value1, String value2) {
            addCriterion("BZ_COD not between", value1, value2, "bzCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodIsNull() {
            addCriterion("CZJS_COD is null");
            return (Criteria) this;
        }

        public Criteria andCzjsCodIsNotNull() {
            addCriterion("CZJS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCzjsCodEqualTo(String value) {
            addCriterion("CZJS_COD =", value, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodNotEqualTo(String value) {
            addCriterion("CZJS_COD <>", value, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodGreaterThan(String value) {
            addCriterion("CZJS_COD >", value, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodGreaterThanOrEqualTo(String value) {
            addCriterion("CZJS_COD >=", value, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodLessThan(String value) {
            addCriterion("CZJS_COD <", value, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodLessThanOrEqualTo(String value) {
            addCriterion("CZJS_COD <=", value, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodLike(String value) {
            addCriterion("CZJS_COD like", value, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodNotLike(String value) {
            addCriterion("CZJS_COD not like", value, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodIn(List<String> values) {
            addCriterion("CZJS_COD in", values, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodNotIn(List<String> values) {
            addCriterion("CZJS_COD not in", values, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodBetween(String value1, String value2) {
            addCriterion("CZJS_COD between", value1, value2, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andCzjsCodNotBetween(String value1, String value2) {
            addCriterion("CZJS_COD not between", value1, value2, "czjsCod");
            return (Criteria) this;
        }

        public Criteria andSqlDesIsNull() {
            addCriterion("SQL_DES is null");
            return (Criteria) this;
        }

        public Criteria andSqlDesIsNotNull() {
            addCriterion("SQL_DES is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDesEqualTo(String value) {
            addCriterion("SQL_DES =", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesNotEqualTo(String value) {
            addCriterion("SQL_DES <>", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesGreaterThan(String value) {
            addCriterion("SQL_DES >", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_DES >=", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesLessThan(String value) {
            addCriterion("SQL_DES <", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesLessThanOrEqualTo(String value) {
            addCriterion("SQL_DES <=", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesLike(String value) {
            addCriterion("SQL_DES like", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesNotLike(String value) {
            addCriterion("SQL_DES not like", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesIn(List<String> values) {
            addCriterion("SQL_DES in", values, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesNotIn(List<String> values) {
            addCriterion("SQL_DES not in", values, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesBetween(String value1, String value2) {
            addCriterion("SQL_DES between", value1, value2, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesNotBetween(String value1, String value2) {
            addCriterion("SQL_DES not between", value1, value2, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodIsNull() {
            addCriterion("SQL_DEP_COD is null");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodIsNotNull() {
            addCriterion("SQL_DEP_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodEqualTo(String value) {
            addCriterion("SQL_DEP_COD =", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodNotEqualTo(String value) {
            addCriterion("SQL_DEP_COD <>", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodGreaterThan(String value) {
            addCriterion("SQL_DEP_COD >", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_DEP_COD >=", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodLessThan(String value) {
            addCriterion("SQL_DEP_COD <", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodLessThanOrEqualTo(String value) {
            addCriterion("SQL_DEP_COD <=", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodLike(String value) {
            addCriterion("SQL_DEP_COD like", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodNotLike(String value) {
            addCriterion("SQL_DEP_COD not like", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodIn(List<String> values) {
            addCriterion("SQL_DEP_COD in", values, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodNotIn(List<String> values) {
            addCriterion("SQL_DEP_COD not in", values, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodBetween(String value1, String value2) {
            addCriterion("SQL_DEP_COD between", value1, value2, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodNotBetween(String value1, String value2) {
            addCriterion("SQL_DEP_COD not between", value1, value2, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodIsNull() {
            addCriterion("ARV_CHL_COD is null");
            return (Criteria) this;
        }

        public Criteria andArvChlCodIsNotNull() {
            addCriterion("ARV_CHL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andArvChlCodEqualTo(String value) {
            addCriterion("ARV_CHL_COD =", value, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodNotEqualTo(String value) {
            addCriterion("ARV_CHL_COD <>", value, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodGreaterThan(String value) {
            addCriterion("ARV_CHL_COD >", value, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodGreaterThanOrEqualTo(String value) {
            addCriterion("ARV_CHL_COD >=", value, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodLessThan(String value) {
            addCriterion("ARV_CHL_COD <", value, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodLessThanOrEqualTo(String value) {
            addCriterion("ARV_CHL_COD <=", value, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodLike(String value) {
            addCriterion("ARV_CHL_COD like", value, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodNotLike(String value) {
            addCriterion("ARV_CHL_COD not like", value, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodIn(List<String> values) {
            addCriterion("ARV_CHL_COD in", values, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodNotIn(List<String> values) {
            addCriterion("ARV_CHL_COD not in", values, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodBetween(String value1, String value2) {
            addCriterion("ARV_CHL_COD between", value1, value2, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andArvChlCodNotBetween(String value1, String value2) {
            addCriterion("ARV_CHL_COD not between", value1, value2, "arvChlCod");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeIsNull() {
            addCriterion("ABN_SCO_NME is null");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeIsNotNull() {
            addCriterion("ABN_SCO_NME is not null");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeEqualTo(String value) {
            addCriterion("ABN_SCO_NME =", value, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeNotEqualTo(String value) {
            addCriterion("ABN_SCO_NME <>", value, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeGreaterThan(String value) {
            addCriterion("ABN_SCO_NME >", value, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeGreaterThanOrEqualTo(String value) {
            addCriterion("ABN_SCO_NME >=", value, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeLessThan(String value) {
            addCriterion("ABN_SCO_NME <", value, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeLessThanOrEqualTo(String value) {
            addCriterion("ABN_SCO_NME <=", value, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeLike(String value) {
            addCriterion("ABN_SCO_NME like", value, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeNotLike(String value) {
            addCriterion("ABN_SCO_NME not like", value, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeIn(List<String> values) {
            addCriterion("ABN_SCO_NME in", values, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeNotIn(List<String> values) {
            addCriterion("ABN_SCO_NME not in", values, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeBetween(String value1, String value2) {
            addCriterion("ABN_SCO_NME between", value1, value2, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnScoNmeNotBetween(String value1, String value2) {
            addCriterion("ABN_SCO_NME not between", value1, value2, "abnScoNme");
            return (Criteria) this;
        }

        public Criteria andAbnDriverIsNull() {
            addCriterion("ABN_DRIVER is null");
            return (Criteria) this;
        }

        public Criteria andAbnDriverIsNotNull() {
            addCriterion("ABN_DRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andAbnDriverEqualTo(String value) {
            addCriterion("ABN_DRIVER =", value, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDriverNotEqualTo(String value) {
            addCriterion("ABN_DRIVER <>", value, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDriverGreaterThan(String value) {
            addCriterion("ABN_DRIVER >", value, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDriverGreaterThanOrEqualTo(String value) {
            addCriterion("ABN_DRIVER >=", value, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDriverLessThan(String value) {
            addCriterion("ABN_DRIVER <", value, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDriverLessThanOrEqualTo(String value) {
            addCriterion("ABN_DRIVER <=", value, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDriverLike(String value) {
            addCriterion("ABN_DRIVER like", value, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDriverNotLike(String value) {
            addCriterion("ABN_DRIVER not like", value, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDriverIn(List<String> values) {
            addCriterion("ABN_DRIVER in", values, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDriverNotIn(List<String> values) {
            addCriterion("ABN_DRIVER not in", values, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDriverBetween(String value1, String value2) {
            addCriterion("ABN_DRIVER between", value1, value2, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDriverNotBetween(String value1, String value2) {
            addCriterion("ABN_DRIVER not between", value1, value2, "abnDriver");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorIsNull() {
            addCriterion("ABN_DOCTOR is null");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorIsNotNull() {
            addCriterion("ABN_DOCTOR is not null");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorEqualTo(String value) {
            addCriterion("ABN_DOCTOR =", value, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorNotEqualTo(String value) {
            addCriterion("ABN_DOCTOR <>", value, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorGreaterThan(String value) {
            addCriterion("ABN_DOCTOR >", value, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("ABN_DOCTOR >=", value, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorLessThan(String value) {
            addCriterion("ABN_DOCTOR <", value, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorLessThanOrEqualTo(String value) {
            addCriterion("ABN_DOCTOR <=", value, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorLike(String value) {
            addCriterion("ABN_DOCTOR like", value, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorNotLike(String value) {
            addCriterion("ABN_DOCTOR not like", value, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorIn(List<String> values) {
            addCriterion("ABN_DOCTOR in", values, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorNotIn(List<String> values) {
            addCriterion("ABN_DOCTOR not in", values, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorBetween(String value1, String value2) {
            addCriterion("ABN_DOCTOR between", value1, value2, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andAbnDoctorNotBetween(String value1, String value2) {
            addCriterion("ABN_DOCTOR not between", value1, value2, "abnDoctor");
            return (Criteria) this;
        }

        public Criteria andLqfyIsNull() {
            addCriterion("LQFY is null");
            return (Criteria) this;
        }

        public Criteria andLqfyIsNotNull() {
            addCriterion("LQFY is not null");
            return (Criteria) this;
        }

        public Criteria andLqfyEqualTo(BigDecimal value) {
            addCriterion("LQFY =", value, "lqfy");
            return (Criteria) this;
        }

        public Criteria andLqfyNotEqualTo(BigDecimal value) {
            addCriterion("LQFY <>", value, "lqfy");
            return (Criteria) this;
        }

        public Criteria andLqfyGreaterThan(BigDecimal value) {
            addCriterion("LQFY >", value, "lqfy");
            return (Criteria) this;
        }

        public Criteria andLqfyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LQFY >=", value, "lqfy");
            return (Criteria) this;
        }

        public Criteria andLqfyLessThan(BigDecimal value) {
            addCriterion("LQFY <", value, "lqfy");
            return (Criteria) this;
        }

        public Criteria andLqfyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LQFY <=", value, "lqfy");
            return (Criteria) this;
        }

        public Criteria andLqfyIn(List<BigDecimal> values) {
            addCriterion("LQFY in", values, "lqfy");
            return (Criteria) this;
        }

        public Criteria andLqfyNotIn(List<BigDecimal> values) {
            addCriterion("LQFY not in", values, "lqfy");
            return (Criteria) this;
        }

        public Criteria andLqfyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LQFY between", value1, value2, "lqfy");
            return (Criteria) this;
        }

        public Criteria andLqfyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LQFY not between", value1, value2, "lqfy");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_BASY_INF
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_BASY_INF 2020-08-10
     */
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