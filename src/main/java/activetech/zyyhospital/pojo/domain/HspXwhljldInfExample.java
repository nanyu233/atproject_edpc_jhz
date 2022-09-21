package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspXwhljldInfExample {
    /**
     * ZJYY.HSP_XWHLJLD_INF
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_XWHLJLD_INF
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_XWHLJLD_INF
     */
    protected List<Criteria> oredCriteria;

    public HspXwhljldInfExample() {
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
     * ZJYY.HSP_XWHLJLD_INF 2020-07-23
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

        public Criteria andXwhiSeqIsNull() {
            addCriterion("XWHI_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqIsNotNull() {
            addCriterion("XWHI_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqEqualTo(String value) {
            addCriterion("XWHI_SEQ =", value, "xwhiSeq");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqNotEqualTo(String value) {
            addCriterion("XWHI_SEQ <>", value, "xwhiSeq");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqGreaterThan(String value) {
            addCriterion("XWHI_SEQ >", value, "xwhiSeq");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqGreaterThanOrEqualTo(String value) {
            addCriterion("XWHI_SEQ >=", value, "xwhiSeq");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqLessThan(String value) {
            addCriterion("XWHI_SEQ <", value, "xwhiSeq");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqLessThanOrEqualTo(String value) {
            addCriterion("XWHI_SEQ <=", value, "xwhiSeq");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqLike(String value) {
            addCriterion("XWHI_SEQ like", value, "xwhiSeq");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqNotLike(String value) {
            addCriterion("XWHI_SEQ not like", value, "xwhiSeq");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqIn(List<String> values) {
            addCriterion("XWHI_SEQ in", values, "xwhiSeq");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqNotIn(List<String> values) {
            addCriterion("XWHI_SEQ not in", values, "xwhiSeq");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqBetween(String value1, String value2) {
            addCriterion("XWHI_SEQ between", value1, value2, "xwhiSeq");
            return (Criteria) this;
        }

        public Criteria andXwhiSeqNotBetween(String value1, String value2) {
            addCriterion("XWHI_SEQ not between", value1, value2, "xwhiSeq");
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

        public Criteria andAssDatIsNull() {
            addCriterion("ASS_DAT is null");
            return (Criteria) this;
        }

        public Criteria andAssDatIsNotNull() {
            addCriterion("ASS_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andAssDatEqualTo(Date value) {
            addCriterion("ASS_DAT =", value, "assDat");
            return (Criteria) this;
        }

        public Criteria andAssDatNotEqualTo(Date value) {
            addCriterion("ASS_DAT <>", value, "assDat");
            return (Criteria) this;
        }

        public Criteria andAssDatGreaterThan(Date value) {
            addCriterion("ASS_DAT >", value, "assDat");
            return (Criteria) this;
        }

        public Criteria andAssDatGreaterThanOrEqualTo(Date value) {
            addCriterion("ASS_DAT >=", value, "assDat");
            return (Criteria) this;
        }

        public Criteria andAssDatLessThan(Date value) {
            addCriterion("ASS_DAT <", value, "assDat");
            return (Criteria) this;
        }

        public Criteria andAssDatLessThanOrEqualTo(Date value) {
            addCriterion("ASS_DAT <=", value, "assDat");
            return (Criteria) this;
        }

        public Criteria andAssDatIn(List<Date> values) {
            addCriterion("ASS_DAT in", values, "assDat");
            return (Criteria) this;
        }

        public Criteria andAssDatNotIn(List<Date> values) {
            addCriterion("ASS_DAT not in", values, "assDat");
            return (Criteria) this;
        }

        public Criteria andAssDatBetween(Date value1, Date value2) {
            addCriterion("ASS_DAT between", value1, value2, "assDat");
            return (Criteria) this;
        }

        public Criteria andAssDatNotBetween(Date value1, Date value2) {
            addCriterion("ASS_DAT not between", value1, value2, "assDat");
            return (Criteria) this;
        }

        public Criteria andAssNameIsNull() {
            addCriterion("ASS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAssNameIsNotNull() {
            addCriterion("ASS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAssNameEqualTo(String value) {
            addCriterion("ASS_NAME =", value, "assName");
            return (Criteria) this;
        }

        public Criteria andAssNameNotEqualTo(String value) {
            addCriterion("ASS_NAME <>", value, "assName");
            return (Criteria) this;
        }

        public Criteria andAssNameGreaterThan(String value) {
            addCriterion("ASS_NAME >", value, "assName");
            return (Criteria) this;
        }

        public Criteria andAssNameGreaterThanOrEqualTo(String value) {
            addCriterion("ASS_NAME >=", value, "assName");
            return (Criteria) this;
        }

        public Criteria andAssNameLessThan(String value) {
            addCriterion("ASS_NAME <", value, "assName");
            return (Criteria) this;
        }

        public Criteria andAssNameLessThanOrEqualTo(String value) {
            addCriterion("ASS_NAME <=", value, "assName");
            return (Criteria) this;
        }

        public Criteria andAssNameLike(String value) {
            addCriterion("ASS_NAME like", value, "assName");
            return (Criteria) this;
        }

        public Criteria andAssNameNotLike(String value) {
            addCriterion("ASS_NAME not like", value, "assName");
            return (Criteria) this;
        }

        public Criteria andAssNameIn(List<String> values) {
            addCriterion("ASS_NAME in", values, "assName");
            return (Criteria) this;
        }

        public Criteria andAssNameNotIn(List<String> values) {
            addCriterion("ASS_NAME not in", values, "assName");
            return (Criteria) this;
        }

        public Criteria andAssNameBetween(String value1, String value2) {
            addCriterion("ASS_NAME between", value1, value2, "assName");
            return (Criteria) this;
        }

        public Criteria andAssNameNotBetween(String value1, String value2) {
            addCriterion("ASS_NAME not between", value1, value2, "assName");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNull() {
            addCriterion("HRT_RTE is null");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNotNull() {
            addCriterion("HRT_RTE is not null");
            return (Criteria) this;
        }

        public Criteria andHrtRteEqualTo(Short value) {
            addCriterion("HRT_RTE =", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotEqualTo(Short value) {
            addCriterion("HRT_RTE <>", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThan(Short value) {
            addCriterion("HRT_RTE >", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThanOrEqualTo(Short value) {
            addCriterion("HRT_RTE >=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThan(Short value) {
            addCriterion("HRT_RTE <", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThanOrEqualTo(Short value) {
            addCriterion("HRT_RTE <=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteIn(List<Short> values) {
            addCriterion("HRT_RTE in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotIn(List<Short> values) {
            addCriterion("HRT_RTE not in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteBetween(Short value1, Short value2) {
            addCriterion("HRT_RTE between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotBetween(Short value1, Short value2) {
            addCriterion("HRT_RTE not between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andBreNbrIsNull() {
            addCriterion("BRE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andBreNbrIsNotNull() {
            addCriterion("BRE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andBreNbrEqualTo(Short value) {
            addCriterion("BRE_NBR =", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotEqualTo(Short value) {
            addCriterion("BRE_NBR <>", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThan(Short value) {
            addCriterion("BRE_NBR >", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("BRE_NBR >=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThan(Short value) {
            addCriterion("BRE_NBR <", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThanOrEqualTo(Short value) {
            addCriterion("BRE_NBR <=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrIn(List<Short> values) {
            addCriterion("BRE_NBR in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotIn(List<Short> values) {
            addCriterion("BRE_NBR not in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrBetween(Short value1, Short value2) {
            addCriterion("BRE_NBR between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotBetween(Short value1, Short value2) {
            addCriterion("BRE_NBR not between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andSpo2IsNull() {
            addCriterion("SPO2 is null");
            return (Criteria) this;
        }

        public Criteria andSpo2IsNotNull() {
            addCriterion("SPO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpo2EqualTo(Short value) {
            addCriterion("SPO2 =", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2NotEqualTo(Short value) {
            addCriterion("SPO2 <>", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2GreaterThan(Short value) {
            addCriterion("SPO2 >", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2GreaterThanOrEqualTo(Short value) {
            addCriterion("SPO2 >=", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2LessThan(Short value) {
            addCriterion("SPO2 <", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2LessThanOrEqualTo(Short value) {
            addCriterion("SPO2 <=", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2In(List<Short> values) {
            addCriterion("SPO2 in", values, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2NotIn(List<Short> values) {
            addCriterion("SPO2 not in", values, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2Between(Short value1, Short value2) {
            addCriterion("SPO2 between", value1, value2, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2NotBetween(Short value1, Short value2) {
            addCriterion("SPO2 not between", value1, value2, "spo2");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIsNull() {
            addCriterion("SBP_UP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIsNotNull() {
            addCriterion("SBP_UP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrEqualTo(Short value) {
            addCriterion("SBP_UP_NBR =", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotEqualTo(Short value) {
            addCriterion("SBP_UP_NBR <>", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrGreaterThan(Short value) {
            addCriterion("SBP_UP_NBR >", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("SBP_UP_NBR >=", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLessThan(Short value) {
            addCriterion("SBP_UP_NBR <", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLessThanOrEqualTo(Short value) {
            addCriterion("SBP_UP_NBR <=", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIn(List<Short> values) {
            addCriterion("SBP_UP_NBR in", values, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotIn(List<Short> values) {
            addCriterion("SBP_UP_NBR not in", values, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrBetween(Short value1, Short value2) {
            addCriterion("SBP_UP_NBR between", value1, value2, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotBetween(Short value1, Short value2) {
            addCriterion("SBP_UP_NBR not between", value1, value2, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIsNull() {
            addCriterion("SBP_DOWN_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIsNotNull() {
            addCriterion("SBP_DOWN_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrEqualTo(Short value) {
            addCriterion("SBP_DOWN_NBR =", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotEqualTo(Short value) {
            addCriterion("SBP_DOWN_NBR <>", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrGreaterThan(Short value) {
            addCriterion("SBP_DOWN_NBR >", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("SBP_DOWN_NBR >=", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLessThan(Short value) {
            addCriterion("SBP_DOWN_NBR <", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLessThanOrEqualTo(Short value) {
            addCriterion("SBP_DOWN_NBR <=", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIn(List<Short> values) {
            addCriterion("SBP_DOWN_NBR in", values, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotIn(List<Short> values) {
            addCriterion("SBP_DOWN_NBR not in", values, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrBetween(Short value1, Short value2) {
            addCriterion("SBP_DOWN_NBR between", value1, value2, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotBetween(Short value1, Short value2) {
            addCriterion("SBP_DOWN_NBR not between", value1, value2, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andDwCodIsNull() {
            addCriterion("DW_COD is null");
            return (Criteria) this;
        }

        public Criteria andDwCodIsNotNull() {
            addCriterion("DW_COD is not null");
            return (Criteria) this;
        }

        public Criteria andDwCodEqualTo(String value) {
            addCriterion("DW_COD =", value, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwCodNotEqualTo(String value) {
            addCriterion("DW_COD <>", value, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwCodGreaterThan(String value) {
            addCriterion("DW_COD >", value, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwCodGreaterThanOrEqualTo(String value) {
            addCriterion("DW_COD >=", value, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwCodLessThan(String value) {
            addCriterion("DW_COD <", value, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwCodLessThanOrEqualTo(String value) {
            addCriterion("DW_COD <=", value, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwCodLike(String value) {
            addCriterion("DW_COD like", value, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwCodNotLike(String value) {
            addCriterion("DW_COD not like", value, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwCodIn(List<String> values) {
            addCriterion("DW_COD in", values, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwCodNotIn(List<String> values) {
            addCriterion("DW_COD not in", values, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwCodBetween(String value1, String value2) {
            addCriterion("DW_COD between", value1, value2, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwCodNotBetween(String value1, String value2) {
            addCriterion("DW_COD not between", value1, value2, "dwCod");
            return (Criteria) this;
        }

        public Criteria andDwYm1IsNull() {
            addCriterion("DW_YM1 is null");
            return (Criteria) this;
        }

        public Criteria andDwYm1IsNotNull() {
            addCriterion("DW_YM1 is not null");
            return (Criteria) this;
        }

        public Criteria andDwYm1EqualTo(String value) {
            addCriterion("DW_YM1 =", value, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm1NotEqualTo(String value) {
            addCriterion("DW_YM1 <>", value, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm1GreaterThan(String value) {
            addCriterion("DW_YM1 >", value, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm1GreaterThanOrEqualTo(String value) {
            addCriterion("DW_YM1 >=", value, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm1LessThan(String value) {
            addCriterion("DW_YM1 <", value, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm1LessThanOrEqualTo(String value) {
            addCriterion("DW_YM1 <=", value, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm1Like(String value) {
            addCriterion("DW_YM1 like", value, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm1NotLike(String value) {
            addCriterion("DW_YM1 not like", value, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm1In(List<String> values) {
            addCriterion("DW_YM1 in", values, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm1NotIn(List<String> values) {
            addCriterion("DW_YM1 not in", values, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm1Between(String value1, String value2) {
            addCriterion("DW_YM1 between", value1, value2, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm1NotBetween(String value1, String value2) {
            addCriterion("DW_YM1 not between", value1, value2, "dwYm1");
            return (Criteria) this;
        }

        public Criteria andDwYm2IsNull() {
            addCriterion("DW_YM2 is null");
            return (Criteria) this;
        }

        public Criteria andDwYm2IsNotNull() {
            addCriterion("DW_YM2 is not null");
            return (Criteria) this;
        }

        public Criteria andDwYm2EqualTo(String value) {
            addCriterion("DW_YM2 =", value, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm2NotEqualTo(String value) {
            addCriterion("DW_YM2 <>", value, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm2GreaterThan(String value) {
            addCriterion("DW_YM2 >", value, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm2GreaterThanOrEqualTo(String value) {
            addCriterion("DW_YM2 >=", value, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm2LessThan(String value) {
            addCriterion("DW_YM2 <", value, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm2LessThanOrEqualTo(String value) {
            addCriterion("DW_YM2 <=", value, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm2Like(String value) {
            addCriterion("DW_YM2 like", value, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm2NotLike(String value) {
            addCriterion("DW_YM2 not like", value, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm2In(List<String> values) {
            addCriterion("DW_YM2 in", values, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm2NotIn(List<String> values) {
            addCriterion("DW_YM2 not in", values, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm2Between(String value1, String value2) {
            addCriterion("DW_YM2 between", value1, value2, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm2NotBetween(String value1, String value2) {
            addCriterion("DW_YM2 not between", value1, value2, "dwYm2");
            return (Criteria) this;
        }

        public Criteria andDwYm3IsNull() {
            addCriterion("DW_YM3 is null");
            return (Criteria) this;
        }

        public Criteria andDwYm3IsNotNull() {
            addCriterion("DW_YM3 is not null");
            return (Criteria) this;
        }

        public Criteria andDwYm3EqualTo(String value) {
            addCriterion("DW_YM3 =", value, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andDwYm3NotEqualTo(String value) {
            addCriterion("DW_YM3 <>", value, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andDwYm3GreaterThan(String value) {
            addCriterion("DW_YM3 >", value, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andDwYm3GreaterThanOrEqualTo(String value) {
            addCriterion("DW_YM3 >=", value, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andDwYm3LessThan(String value) {
            addCriterion("DW_YM3 <", value, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andDwYm3LessThanOrEqualTo(String value) {
            addCriterion("DW_YM3 <=", value, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andDwYm3Like(String value) {
            addCriterion("DW_YM3 like", value, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andDwYm3NotLike(String value) {
            addCriterion("DW_YM3 not like", value, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andDwYm3In(List<String> values) {
            addCriterion("DW_YM3 in", values, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andDwYm3NotIn(List<String> values) {
            addCriterion("DW_YM3 not in", values, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andDwYm3Between(String value1, String value2) {
            addCriterion("DW_YM3 between", value1, value2, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andDwYm3NotBetween(String value1, String value2) {
            addCriterion("DW_YM3 not between", value1, value2, "dwYm3");
            return (Criteria) this;
        }

        public Criteria andXwyCodIsNull() {
            addCriterion("XWY_COD is null");
            return (Criteria) this;
        }

        public Criteria andXwyCodIsNotNull() {
            addCriterion("XWY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXwyCodEqualTo(String value) {
            addCriterion("XWY_COD =", value, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyCodNotEqualTo(String value) {
            addCriterion("XWY_COD <>", value, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyCodGreaterThan(String value) {
            addCriterion("XWY_COD >", value, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyCodGreaterThanOrEqualTo(String value) {
            addCriterion("XWY_COD >=", value, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyCodLessThan(String value) {
            addCriterion("XWY_COD <", value, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyCodLessThanOrEqualTo(String value) {
            addCriterion("XWY_COD <=", value, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyCodLike(String value) {
            addCriterion("XWY_COD like", value, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyCodNotLike(String value) {
            addCriterion("XWY_COD not like", value, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyCodIn(List<String> values) {
            addCriterion("XWY_COD in", values, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyCodNotIn(List<String> values) {
            addCriterion("XWY_COD not in", values, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyCodBetween(String value1, String value2) {
            addCriterion("XWY_COD between", value1, value2, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyCodNotBetween(String value1, String value2) {
            addCriterion("XWY_COD not between", value1, value2, "xwyCod");
            return (Criteria) this;
        }

        public Criteria andXwyWdIsNull() {
            addCriterion("XWY_WD is null");
            return (Criteria) this;
        }

        public Criteria andXwyWdIsNotNull() {
            addCriterion("XWY_WD is not null");
            return (Criteria) this;
        }

        public Criteria andXwyWdEqualTo(BigDecimal value) {
            addCriterion("XWY_WD =", value, "xwyWd");
            return (Criteria) this;
        }

        public Criteria andXwyWdNotEqualTo(BigDecimal value) {
            addCriterion("XWY_WD <>", value, "xwyWd");
            return (Criteria) this;
        }

        public Criteria andXwyWdGreaterThan(BigDecimal value) {
            addCriterion("XWY_WD >", value, "xwyWd");
            return (Criteria) this;
        }

        public Criteria andXwyWdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XWY_WD >=", value, "xwyWd");
            return (Criteria) this;
        }

        public Criteria andXwyWdLessThan(BigDecimal value) {
            addCriterion("XWY_WD <", value, "xwyWd");
            return (Criteria) this;
        }

        public Criteria andXwyWdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XWY_WD <=", value, "xwyWd");
            return (Criteria) this;
        }

        public Criteria andXwyWdIn(List<BigDecimal> values) {
            addCriterion("XWY_WD in", values, "xwyWd");
            return (Criteria) this;
        }

        public Criteria andXwyWdNotIn(List<BigDecimal> values) {
            addCriterion("XWY_WD not in", values, "xwyWd");
            return (Criteria) this;
        }

        public Criteria andXwyWdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XWY_WD between", value1, value2, "xwyWd");
            return (Criteria) this;
        }

        public Criteria andXwyWdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XWY_WD not between", value1, value2, "xwyWd");
            return (Criteria) this;
        }

        public Criteria andXwyRlIsNull() {
            addCriterion("XWY_RL is null");
            return (Criteria) this;
        }

        public Criteria andXwyRlIsNotNull() {
            addCriterion("XWY_RL is not null");
            return (Criteria) this;
        }

        public Criteria andXwyRlEqualTo(String value) {
            addCriterion("XWY_RL =", value, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXwyRlNotEqualTo(String value) {
            addCriterion("XWY_RL <>", value, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXwyRlGreaterThan(String value) {
            addCriterion("XWY_RL >", value, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXwyRlGreaterThanOrEqualTo(String value) {
            addCriterion("XWY_RL >=", value, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXwyRlLessThan(String value) {
            addCriterion("XWY_RL <", value, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXwyRlLessThanOrEqualTo(String value) {
            addCriterion("XWY_RL <=", value, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXwyRlLike(String value) {
            addCriterion("XWY_RL like", value, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXwyRlNotLike(String value) {
            addCriterion("XWY_RL not like", value, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXwyRlIn(List<String> values) {
            addCriterion("XWY_RL in", values, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXwyRlNotIn(List<String> values) {
            addCriterion("XWY_RL not in", values, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXwyRlBetween(String value1, String value2) {
            addCriterion("XWY_RL between", value1, value2, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXwyRlNotBetween(String value1, String value2) {
            addCriterion("XWY_RL not between", value1, value2, "xwyRl");
            return (Criteria) this;
        }

        public Criteria andXcyYsIsNull() {
            addCriterion("XCY_YS is null");
            return (Criteria) this;
        }

        public Criteria andXcyYsIsNotNull() {
            addCriterion("XCY_YS is not null");
            return (Criteria) this;
        }

        public Criteria andXcyYsEqualTo(String value) {
            addCriterion("XCY_YS =", value, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyYsNotEqualTo(String value) {
            addCriterion("XCY_YS <>", value, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyYsGreaterThan(String value) {
            addCriterion("XCY_YS >", value, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyYsGreaterThanOrEqualTo(String value) {
            addCriterion("XCY_YS >=", value, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyYsLessThan(String value) {
            addCriterion("XCY_YS <", value, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyYsLessThanOrEqualTo(String value) {
            addCriterion("XCY_YS <=", value, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyYsLike(String value) {
            addCriterion("XCY_YS like", value, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyYsNotLike(String value) {
            addCriterion("XCY_YS not like", value, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyYsIn(List<String> values) {
            addCriterion("XCY_YS in", values, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyYsNotIn(List<String> values) {
            addCriterion("XCY_YS not in", values, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyYsBetween(String value1, String value2) {
            addCriterion("XCY_YS between", value1, value2, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyYsNotBetween(String value1, String value2) {
            addCriterion("XCY_YS not between", value1, value2, "xcyYs");
            return (Criteria) this;
        }

        public Criteria andXcyXzIsNull() {
            addCriterion("XCY_XZ is null");
            return (Criteria) this;
        }

        public Criteria andXcyXzIsNotNull() {
            addCriterion("XCY_XZ is not null");
            return (Criteria) this;
        }

        public Criteria andXcyXzEqualTo(String value) {
            addCriterion("XCY_XZ =", value, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyXzNotEqualTo(String value) {
            addCriterion("XCY_XZ <>", value, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyXzGreaterThan(String value) {
            addCriterion("XCY_XZ >", value, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyXzGreaterThanOrEqualTo(String value) {
            addCriterion("XCY_XZ >=", value, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyXzLessThan(String value) {
            addCriterion("XCY_XZ <", value, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyXzLessThanOrEqualTo(String value) {
            addCriterion("XCY_XZ <=", value, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyXzLike(String value) {
            addCriterion("XCY_XZ like", value, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyXzNotLike(String value) {
            addCriterion("XCY_XZ not like", value, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyXzIn(List<String> values) {
            addCriterion("XCY_XZ in", values, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyXzNotIn(List<String> values) {
            addCriterion("XCY_XZ not in", values, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyXzBetween(String value1, String value2) {
            addCriterion("XCY_XZ between", value1, value2, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyXzNotBetween(String value1, String value2) {
            addCriterion("XCY_XZ not between", value1, value2, "xcyXz");
            return (Criteria) this;
        }

        public Criteria andXcyClIsNull() {
            addCriterion("XCY_CL is null");
            return (Criteria) this;
        }

        public Criteria andXcyClIsNotNull() {
            addCriterion("XCY_CL is not null");
            return (Criteria) this;
        }

        public Criteria andXcyClEqualTo(String value) {
            addCriterion("XCY_CL =", value, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andXcyClNotEqualTo(String value) {
            addCriterion("XCY_CL <>", value, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andXcyClGreaterThan(String value) {
            addCriterion("XCY_CL >", value, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andXcyClGreaterThanOrEqualTo(String value) {
            addCriterion("XCY_CL >=", value, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andXcyClLessThan(String value) {
            addCriterion("XCY_CL <", value, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andXcyClLessThanOrEqualTo(String value) {
            addCriterion("XCY_CL <=", value, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andXcyClLike(String value) {
            addCriterion("XCY_CL like", value, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andXcyClNotLike(String value) {
            addCriterion("XCY_CL not like", value, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andXcyClIn(List<String> values) {
            addCriterion("XCY_CL in", values, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andXcyClNotIn(List<String> values) {
            addCriterion("XCY_CL not in", values, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andXcyClBetween(String value1, String value2) {
            addCriterion("XCY_CL between", value1, value2, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andXcyClNotBetween(String value1, String value2) {
            addCriterion("XCY_CL not between", value1, value2, "xcyCl");
            return (Criteria) this;
        }

        public Criteria andMscbCodIsNull() {
            addCriterion("MSCB_COD is null");
            return (Criteria) this;
        }

        public Criteria andMscbCodIsNotNull() {
            addCriterion("MSCB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMscbCodEqualTo(String value) {
            addCriterion("MSCB_COD =", value, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andMscbCodNotEqualTo(String value) {
            addCriterion("MSCB_COD <>", value, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andMscbCodGreaterThan(String value) {
            addCriterion("MSCB_COD >", value, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andMscbCodGreaterThanOrEqualTo(String value) {
            addCriterion("MSCB_COD >=", value, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andMscbCodLessThan(String value) {
            addCriterion("MSCB_COD <", value, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andMscbCodLessThanOrEqualTo(String value) {
            addCriterion("MSCB_COD <=", value, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andMscbCodLike(String value) {
            addCriterion("MSCB_COD like", value, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andMscbCodNotLike(String value) {
            addCriterion("MSCB_COD not like", value, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andMscbCodIn(List<String> values) {
            addCriterion("MSCB_COD in", values, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andMscbCodNotIn(List<String> values) {
            addCriterion("MSCB_COD not in", values, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andMscbCodBetween(String value1, String value2) {
            addCriterion("MSCB_COD between", value1, value2, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andMscbCodNotBetween(String value1, String value2) {
            addCriterion("MSCB_COD not between", value1, value2, "mscbCod");
            return (Criteria) this;
        }

        public Criteria andExCodIsNull() {
            addCriterion("EX_COD is null");
            return (Criteria) this;
        }

        public Criteria andExCodIsNotNull() {
            addCriterion("EX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andExCodEqualTo(String value) {
            addCriterion("EX_COD =", value, "exCod");
            return (Criteria) this;
        }

        public Criteria andExCodNotEqualTo(String value) {
            addCriterion("EX_COD <>", value, "exCod");
            return (Criteria) this;
        }

        public Criteria andExCodGreaterThan(String value) {
            addCriterion("EX_COD >", value, "exCod");
            return (Criteria) this;
        }

        public Criteria andExCodGreaterThanOrEqualTo(String value) {
            addCriterion("EX_COD >=", value, "exCod");
            return (Criteria) this;
        }

        public Criteria andExCodLessThan(String value) {
            addCriterion("EX_COD <", value, "exCod");
            return (Criteria) this;
        }

        public Criteria andExCodLessThanOrEqualTo(String value) {
            addCriterion("EX_COD <=", value, "exCod");
            return (Criteria) this;
        }

        public Criteria andExCodLike(String value) {
            addCriterion("EX_COD like", value, "exCod");
            return (Criteria) this;
        }

        public Criteria andExCodNotLike(String value) {
            addCriterion("EX_COD not like", value, "exCod");
            return (Criteria) this;
        }

        public Criteria andExCodIn(List<String> values) {
            addCriterion("EX_COD in", values, "exCod");
            return (Criteria) this;
        }

        public Criteria andExCodNotIn(List<String> values) {
            addCriterion("EX_COD not in", values, "exCod");
            return (Criteria) this;
        }

        public Criteria andExCodBetween(String value1, String value2) {
            addCriterion("EX_COD between", value1, value2, "exCod");
            return (Criteria) this;
        }

        public Criteria andExCodNotBetween(String value1, String value2) {
            addCriterion("EX_COD not between", value1, value2, "exCod");
            return (Criteria) this;
        }

        public Criteria andOtCodIsNull() {
            addCriterion("OT_COD is null");
            return (Criteria) this;
        }

        public Criteria andOtCodIsNotNull() {
            addCriterion("OT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andOtCodEqualTo(String value) {
            addCriterion("OT_COD =", value, "otCod");
            return (Criteria) this;
        }

        public Criteria andOtCodNotEqualTo(String value) {
            addCriterion("OT_COD <>", value, "otCod");
            return (Criteria) this;
        }

        public Criteria andOtCodGreaterThan(String value) {
            addCriterion("OT_COD >", value, "otCod");
            return (Criteria) this;
        }

        public Criteria andOtCodGreaterThanOrEqualTo(String value) {
            addCriterion("OT_COD >=", value, "otCod");
            return (Criteria) this;
        }

        public Criteria andOtCodLessThan(String value) {
            addCriterion("OT_COD <", value, "otCod");
            return (Criteria) this;
        }

        public Criteria andOtCodLessThanOrEqualTo(String value) {
            addCriterion("OT_COD <=", value, "otCod");
            return (Criteria) this;
        }

        public Criteria andOtCodLike(String value) {
            addCriterion("OT_COD like", value, "otCod");
            return (Criteria) this;
        }

        public Criteria andOtCodNotLike(String value) {
            addCriterion("OT_COD not like", value, "otCod");
            return (Criteria) this;
        }

        public Criteria andOtCodIn(List<String> values) {
            addCriterion("OT_COD in", values, "otCod");
            return (Criteria) this;
        }

        public Criteria andOtCodNotIn(List<String> values) {
            addCriterion("OT_COD not in", values, "otCod");
            return (Criteria) this;
        }

        public Criteria andOtCodBetween(String value1, String value2) {
            addCriterion("OT_COD between", value1, value2, "otCod");
            return (Criteria) this;
        }

        public Criteria andOtCodNotBetween(String value1, String value2) {
            addCriterion("OT_COD not between", value1, value2, "otCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodIsNull() {
            addCriterion("FBPL_COD is null");
            return (Criteria) this;
        }

        public Criteria andFbplCodIsNotNull() {
            addCriterion("FBPL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFbplCodEqualTo(String value) {
            addCriterion("FBPL_COD =", value, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodNotEqualTo(String value) {
            addCriterion("FBPL_COD <>", value, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodGreaterThan(String value) {
            addCriterion("FBPL_COD >", value, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodGreaterThanOrEqualTo(String value) {
            addCriterion("FBPL_COD >=", value, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodLessThan(String value) {
            addCriterion("FBPL_COD <", value, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodLessThanOrEqualTo(String value) {
            addCriterion("FBPL_COD <=", value, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodLike(String value) {
            addCriterion("FBPL_COD like", value, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodNotLike(String value) {
            addCriterion("FBPL_COD not like", value, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodIn(List<String> values) {
            addCriterion("FBPL_COD in", values, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodNotIn(List<String> values) {
            addCriterion("FBPL_COD not in", values, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodBetween(String value1, String value2) {
            addCriterion("FBPL_COD between", value1, value2, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFbplCodNotBetween(String value1, String value2) {
            addCriterion("FBPL_COD not between", value1, value2, "fbplCod");
            return (Criteria) this;
        }

        public Criteria andFzCodIsNull() {
            addCriterion("FZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andFzCodIsNotNull() {
            addCriterion("FZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFzCodEqualTo(String value) {
            addCriterion("FZ_COD =", value, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFzCodNotEqualTo(String value) {
            addCriterion("FZ_COD <>", value, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFzCodGreaterThan(String value) {
            addCriterion("FZ_COD >", value, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFzCodGreaterThanOrEqualTo(String value) {
            addCriterion("FZ_COD >=", value, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFzCodLessThan(String value) {
            addCriterion("FZ_COD <", value, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFzCodLessThanOrEqualTo(String value) {
            addCriterion("FZ_COD <=", value, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFzCodLike(String value) {
            addCriterion("FZ_COD like", value, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFzCodNotLike(String value) {
            addCriterion("FZ_COD not like", value, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFzCodIn(List<String> values) {
            addCriterion("FZ_COD in", values, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFzCodNotIn(List<String> values) {
            addCriterion("FZ_COD not in", values, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFzCodBetween(String value1, String value2) {
            addCriterion("FZ_COD between", value1, value2, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFzCodNotBetween(String value1, String value2) {
            addCriterion("FZ_COD not between", value1, value2, "fzCod");
            return (Criteria) this;
        }

        public Criteria andFtCodIsNull() {
            addCriterion("FT_COD is null");
            return (Criteria) this;
        }

        public Criteria andFtCodIsNotNull() {
            addCriterion("FT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFtCodEqualTo(String value) {
            addCriterion("FT_COD =", value, "ftCod");
            return (Criteria) this;
        }

        public Criteria andFtCodNotEqualTo(String value) {
            addCriterion("FT_COD <>", value, "ftCod");
            return (Criteria) this;
        }

        public Criteria andFtCodGreaterThan(String value) {
            addCriterion("FT_COD >", value, "ftCod");
            return (Criteria) this;
        }

        public Criteria andFtCodGreaterThanOrEqualTo(String value) {
            addCriterion("FT_COD >=", value, "ftCod");
            return (Criteria) this;
        }

        public Criteria andFtCodLessThan(String value) {
            addCriterion("FT_COD <", value, "ftCod");
            return (Criteria) this;
        }

        public Criteria andFtCodLessThanOrEqualTo(String value) {
            addCriterion("FT_COD <=", value, "ftCod");
            return (Criteria) this;
        }

        public Criteria andFtCodLike(String value) {
            addCriterion("FT_COD like", value, "ftCod");
            return (Criteria) this;
        }

        public Criteria andFtCodNotLike(String value) {
            addCriterion("FT_COD not like", value, "ftCod");
            return (Criteria) this;
        }

        public Criteria andFtCodIn(List<String> values) {
            addCriterion("FT_COD in", values, "ftCod");
            return (Criteria) this;
        }

        public Criteria andFtCodNotIn(List<String> values) {
            addCriterion("FT_COD not in", values, "ftCod");
            return (Criteria) this;
        }

        public Criteria andFtCodBetween(String value1, String value2) {
            addCriterion("FT_COD between", value1, value2, "ftCod");
            return (Criteria) this;
        }

        public Criteria andFtCodNotBetween(String value1, String value2) {
            addCriterion("FT_COD not between", value1, value2, "ftCod");
            return (Criteria) this;
        }

        public Criteria andXwtzQtIsNull() {
            addCriterion("XWTZ_QT is null");
            return (Criteria) this;
        }

        public Criteria andXwtzQtIsNotNull() {
            addCriterion("XWTZ_QT is not null");
            return (Criteria) this;
        }

        public Criteria andXwtzQtEqualTo(String value) {
            addCriterion("XWTZ_QT =", value, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwtzQtNotEqualTo(String value) {
            addCriterion("XWTZ_QT <>", value, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwtzQtGreaterThan(String value) {
            addCriterion("XWTZ_QT >", value, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwtzQtGreaterThanOrEqualTo(String value) {
            addCriterion("XWTZ_QT >=", value, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwtzQtLessThan(String value) {
            addCriterion("XWTZ_QT <", value, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwtzQtLessThanOrEqualTo(String value) {
            addCriterion("XWTZ_QT <=", value, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwtzQtLike(String value) {
            addCriterion("XWTZ_QT like", value, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwtzQtNotLike(String value) {
            addCriterion("XWTZ_QT not like", value, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwtzQtIn(List<String> values) {
            addCriterion("XWTZ_QT in", values, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwtzQtNotIn(List<String> values) {
            addCriterion("XWTZ_QT not in", values, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwtzQtBetween(String value1, String value2) {
            addCriterion("XWTZ_QT between", value1, value2, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwtzQtNotBetween(String value1, String value2) {
            addCriterion("XWTZ_QT not between", value1, value2, "xwtzQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtIsNull() {
            addCriterion("XWY_QT is null");
            return (Criteria) this;
        }

        public Criteria andXwyQtIsNotNull() {
            addCriterion("XWY_QT is not null");
            return (Criteria) this;
        }

        public Criteria andXwyQtEqualTo(String value) {
            addCriterion("XWY_QT =", value, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtNotEqualTo(String value) {
            addCriterion("XWY_QT <>", value, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtGreaterThan(String value) {
            addCriterion("XWY_QT >", value, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtGreaterThanOrEqualTo(String value) {
            addCriterion("XWY_QT >=", value, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtLessThan(String value) {
            addCriterion("XWY_QT <", value, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtLessThanOrEqualTo(String value) {
            addCriterion("XWY_QT <=", value, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtLike(String value) {
            addCriterion("XWY_QT like", value, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtNotLike(String value) {
            addCriterion("XWY_QT not like", value, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtIn(List<String> values) {
            addCriterion("XWY_QT in", values, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtNotIn(List<String> values) {
            addCriterion("XWY_QT not in", values, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtBetween(String value1, String value2) {
            addCriterion("XWY_QT between", value1, value2, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andXwyQtNotBetween(String value1, String value2) {
            addCriterion("XWY_QT not between", value1, value2, "xwyQt");
            return (Criteria) this;
        }

        public Criteria andRecordDatIsNull() {
            addCriterion("RECORD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andRecordDatIsNotNull() {
            addCriterion("RECORD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDatEqualTo(Date value) {
            addCriterion("RECORD_DAT =", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatNotEqualTo(Date value) {
            addCriterion("RECORD_DAT <>", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatGreaterThan(Date value) {
            addCriterion("RECORD_DAT >", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatGreaterThanOrEqualTo(Date value) {
            addCriterion("RECORD_DAT >=", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatLessThan(Date value) {
            addCriterion("RECORD_DAT <", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatLessThanOrEqualTo(Date value) {
            addCriterion("RECORD_DAT <=", value, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatIn(List<Date> values) {
            addCriterion("RECORD_DAT in", values, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatNotIn(List<Date> values) {
            addCriterion("RECORD_DAT not in", values, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatBetween(Date value1, Date value2) {
            addCriterion("RECORD_DAT between", value1, value2, "recordDat");
            return (Criteria) this;
        }

        public Criteria andRecordDatNotBetween(Date value1, Date value2) {
            addCriterion("RECORD_DAT not between", value1, value2, "recordDat");
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

        public Criteria andCrtNurIsNull() {
            addCriterion("CRT_NUR is null");
            return (Criteria) this;
        }

        public Criteria andCrtNurIsNotNull() {
            addCriterion("CRT_NUR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNurEqualTo(String value) {
            addCriterion("CRT_NUR =", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotEqualTo(String value) {
            addCriterion("CRT_NUR <>", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurGreaterThan(String value) {
            addCriterion("CRT_NUR >", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NUR >=", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurLessThan(String value) {
            addCriterion("CRT_NUR <", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurLessThanOrEqualTo(String value) {
            addCriterion("CRT_NUR <=", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurLike(String value) {
            addCriterion("CRT_NUR like", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotLike(String value) {
            addCriterion("CRT_NUR not like", value, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurIn(List<String> values) {
            addCriterion("CRT_NUR in", values, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotIn(List<String> values) {
            addCriterion("CRT_NUR not in", values, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurBetween(String value1, String value2) {
            addCriterion("CRT_NUR between", value1, value2, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNurNotBetween(String value1, String value2) {
            addCriterion("CRT_NUR not between", value1, value2, "crtNur");
            return (Criteria) this;
        }

        public Criteria andCrtNameIsNull() {
            addCriterion("CRT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCrtNameIsNotNull() {
            addCriterion("CRT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNameEqualTo(String value) {
            addCriterion("CRT_NAME =", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotEqualTo(String value) {
            addCriterion("CRT_NAME <>", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameGreaterThan(String value) {
            addCriterion("CRT_NAME >", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NAME >=", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameLessThan(String value) {
            addCriterion("CRT_NAME <", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameLessThanOrEqualTo(String value) {
            addCriterion("CRT_NAME <=", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameLike(String value) {
            addCriterion("CRT_NAME like", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotLike(String value) {
            addCriterion("CRT_NAME not like", value, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameIn(List<String> values) {
            addCriterion("CRT_NAME in", values, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotIn(List<String> values) {
            addCriterion("CRT_NAME not in", values, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameBetween(String value1, String value2) {
            addCriterion("CRT_NAME between", value1, value2, "crtName");
            return (Criteria) this;
        }

        public Criteria andCrtNameNotBetween(String value1, String value2) {
            addCriterion("CRT_NAME not between", value1, value2, "crtName");
            return (Criteria) this;
        }

        public Criteria andUpDatIsNull() {
            addCriterion("UP_DAT is null");
            return (Criteria) this;
        }

        public Criteria andUpDatIsNotNull() {
            addCriterion("UP_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpDatEqualTo(Date value) {
            addCriterion("UP_DAT =", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatNotEqualTo(Date value) {
            addCriterion("UP_DAT <>", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatGreaterThan(Date value) {
            addCriterion("UP_DAT >", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatGreaterThanOrEqualTo(Date value) {
            addCriterion("UP_DAT >=", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatLessThan(Date value) {
            addCriterion("UP_DAT <", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatLessThanOrEqualTo(Date value) {
            addCriterion("UP_DAT <=", value, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatIn(List<Date> values) {
            addCriterion("UP_DAT in", values, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatNotIn(List<Date> values) {
            addCriterion("UP_DAT not in", values, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatBetween(Date value1, Date value2) {
            addCriterion("UP_DAT between", value1, value2, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpDatNotBetween(Date value1, Date value2) {
            addCriterion("UP_DAT not between", value1, value2, "upDat");
            return (Criteria) this;
        }

        public Criteria andUpNurIsNull() {
            addCriterion("UP_NUR is null");
            return (Criteria) this;
        }

        public Criteria andUpNurIsNotNull() {
            addCriterion("UP_NUR is not null");
            return (Criteria) this;
        }

        public Criteria andUpNurEqualTo(String value) {
            addCriterion("UP_NUR =", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotEqualTo(String value) {
            addCriterion("UP_NUR <>", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurGreaterThan(String value) {
            addCriterion("UP_NUR >", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurGreaterThanOrEqualTo(String value) {
            addCriterion("UP_NUR >=", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurLessThan(String value) {
            addCriterion("UP_NUR <", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurLessThanOrEqualTo(String value) {
            addCriterion("UP_NUR <=", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurLike(String value) {
            addCriterion("UP_NUR like", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotLike(String value) {
            addCriterion("UP_NUR not like", value, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurIn(List<String> values) {
            addCriterion("UP_NUR in", values, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotIn(List<String> values) {
            addCriterion("UP_NUR not in", values, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurBetween(String value1, String value2) {
            addCriterion("UP_NUR between", value1, value2, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNurNotBetween(String value1, String value2) {
            addCriterion("UP_NUR not between", value1, value2, "upNur");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNull() {
            addCriterion("UP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNotNull() {
            addCriterion("UP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpNameEqualTo(String value) {
            addCriterion("UP_NAME =", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotEqualTo(String value) {
            addCriterion("UP_NAME <>", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThan(String value) {
            addCriterion("UP_NAME >", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThanOrEqualTo(String value) {
            addCriterion("UP_NAME >=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThan(String value) {
            addCriterion("UP_NAME <", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThanOrEqualTo(String value) {
            addCriterion("UP_NAME <=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLike(String value) {
            addCriterion("UP_NAME like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotLike(String value) {
            addCriterion("UP_NAME not like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameIn(List<String> values) {
            addCriterion("UP_NAME in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotIn(List<String> values) {
            addCriterion("UP_NAME not in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameBetween(String value1, String value2) {
            addCriterion("UP_NAME between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotBetween(String value1, String value2) {
            addCriterion("UP_NAME not between", value1, value2, "upName");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_XWHLJLD_INF
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_XWHLJLD_INF 2020-07-23
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