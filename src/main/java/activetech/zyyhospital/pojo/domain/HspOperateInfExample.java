package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspOperateInfExample {
    /**
     * ZJYY.HSP_OPERATE_INF
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_OPERATE_INF
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_OPERATE_INF
     */
    protected List<Criteria> oredCriteria;

    public HspOperateInfExample() {
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
     * ZJYY.HSP_OPERATE_INF 2020-06-30
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

        public Criteria andOperSeqIsNull() {
            addCriterion("OPER_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andOperSeqIsNotNull() {
            addCriterion("OPER_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andOperSeqEqualTo(String value) {
            addCriterion("OPER_SEQ =", value, "operSeq");
            return (Criteria) this;
        }

        public Criteria andOperSeqNotEqualTo(String value) {
            addCriterion("OPER_SEQ <>", value, "operSeq");
            return (Criteria) this;
        }

        public Criteria andOperSeqGreaterThan(String value) {
            addCriterion("OPER_SEQ >", value, "operSeq");
            return (Criteria) this;
        }

        public Criteria andOperSeqGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_SEQ >=", value, "operSeq");
            return (Criteria) this;
        }

        public Criteria andOperSeqLessThan(String value) {
            addCriterion("OPER_SEQ <", value, "operSeq");
            return (Criteria) this;
        }

        public Criteria andOperSeqLessThanOrEqualTo(String value) {
            addCriterion("OPER_SEQ <=", value, "operSeq");
            return (Criteria) this;
        }

        public Criteria andOperSeqLike(String value) {
            addCriterion("OPER_SEQ like", value, "operSeq");
            return (Criteria) this;
        }

        public Criteria andOperSeqNotLike(String value) {
            addCriterion("OPER_SEQ not like", value, "operSeq");
            return (Criteria) this;
        }

        public Criteria andOperSeqIn(List<String> values) {
            addCriterion("OPER_SEQ in", values, "operSeq");
            return (Criteria) this;
        }

        public Criteria andOperSeqNotIn(List<String> values) {
            addCriterion("OPER_SEQ not in", values, "operSeq");
            return (Criteria) this;
        }

        public Criteria andOperSeqBetween(String value1, String value2) {
            addCriterion("OPER_SEQ between", value1, value2, "operSeq");
            return (Criteria) this;
        }

        public Criteria andOperSeqNotBetween(String value1, String value2) {
            addCriterion("OPER_SEQ not between", value1, value2, "operSeq");
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

        public Criteria andOperNamIsNull() {
            addCriterion("OPER_NAM is null");
            return (Criteria) this;
        }

        public Criteria andOperNamIsNotNull() {
            addCriterion("OPER_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andOperNamEqualTo(String value) {
            addCriterion("OPER_NAM =", value, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperNamNotEqualTo(String value) {
            addCriterion("OPER_NAM <>", value, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperNamGreaterThan(String value) {
            addCriterion("OPER_NAM >", value, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperNamGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_NAM >=", value, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperNamLessThan(String value) {
            addCriterion("OPER_NAM <", value, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperNamLessThanOrEqualTo(String value) {
            addCriterion("OPER_NAM <=", value, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperNamLike(String value) {
            addCriterion("OPER_NAM like", value, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperNamNotLike(String value) {
            addCriterion("OPER_NAM not like", value, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperNamIn(List<String> values) {
            addCriterion("OPER_NAM in", values, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperNamNotIn(List<String> values) {
            addCriterion("OPER_NAM not in", values, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperNamBetween(String value1, String value2) {
            addCriterion("OPER_NAM between", value1, value2, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperNamNotBetween(String value1, String value2) {
            addCriterion("OPER_NAM not between", value1, value2, "operNam");
            return (Criteria) this;
        }

        public Criteria andOperDatIsNull() {
            addCriterion("OPER_DAT is null");
            return (Criteria) this;
        }

        public Criteria andOperDatIsNotNull() {
            addCriterion("OPER_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andOperDatEqualTo(Date value) {
            addCriterion("OPER_DAT =", value, "operDat");
            return (Criteria) this;
        }

        public Criteria andOperDatNotEqualTo(Date value) {
            addCriterion("OPER_DAT <>", value, "operDat");
            return (Criteria) this;
        }

        public Criteria andOperDatGreaterThan(Date value) {
            addCriterion("OPER_DAT >", value, "operDat");
            return (Criteria) this;
        }

        public Criteria andOperDatGreaterThanOrEqualTo(Date value) {
            addCriterion("OPER_DAT >=", value, "operDat");
            return (Criteria) this;
        }

        public Criteria andOperDatLessThan(Date value) {
            addCriterion("OPER_DAT <", value, "operDat");
            return (Criteria) this;
        }

        public Criteria andOperDatLessThanOrEqualTo(Date value) {
            addCriterion("OPER_DAT <=", value, "operDat");
            return (Criteria) this;
        }

        public Criteria andOperDatIn(List<Date> values) {
            addCriterion("OPER_DAT in", values, "operDat");
            return (Criteria) this;
        }

        public Criteria andOperDatNotIn(List<Date> values) {
            addCriterion("OPER_DAT not in", values, "operDat");
            return (Criteria) this;
        }

        public Criteria andOperDatBetween(Date value1, Date value2) {
            addCriterion("OPER_DAT between", value1, value2, "operDat");
            return (Criteria) this;
        }

        public Criteria andOperDatNotBetween(Date value1, Date value2) {
            addCriterion("OPER_DAT not between", value1, value2, "operDat");
            return (Criteria) this;
        }

        public Criteria andOperYsIsNull() {
            addCriterion("OPER_YS is null");
            return (Criteria) this;
        }

        public Criteria andOperYsIsNotNull() {
            addCriterion("OPER_YS is not null");
            return (Criteria) this;
        }

        public Criteria andOperYsEqualTo(String value) {
            addCriterion("OPER_YS =", value, "operYs");
            return (Criteria) this;
        }

        public Criteria andOperYsNotEqualTo(String value) {
            addCriterion("OPER_YS <>", value, "operYs");
            return (Criteria) this;
        }

        public Criteria andOperYsGreaterThan(String value) {
            addCriterion("OPER_YS >", value, "operYs");
            return (Criteria) this;
        }

        public Criteria andOperYsGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_YS >=", value, "operYs");
            return (Criteria) this;
        }

        public Criteria andOperYsLessThan(String value) {
            addCriterion("OPER_YS <", value, "operYs");
            return (Criteria) this;
        }

        public Criteria andOperYsLessThanOrEqualTo(String value) {
            addCriterion("OPER_YS <=", value, "operYs");
            return (Criteria) this;
        }

        public Criteria andOperYsLike(String value) {
            addCriterion("OPER_YS like", value, "operYs");
            return (Criteria) this;
        }

        public Criteria andOperYsNotLike(String value) {
            addCriterion("OPER_YS not like", value, "operYs");
            return (Criteria) this;
        }

        public Criteria andOperYsIn(List<String> values) {
            addCriterion("OPER_YS in", values, "operYs");
            return (Criteria) this;
        }

        public Criteria andOperYsNotIn(List<String> values) {
            addCriterion("OPER_YS not in", values, "operYs");
            return (Criteria) this;
        }

        public Criteria andOperYsBetween(String value1, String value2) {
            addCriterion("OPER_YS between", value1, value2, "operYs");
            return (Criteria) this;
        }

        public Criteria andOperYsNotBetween(String value1, String value2) {
            addCriterion("OPER_YS not between", value1, value2, "operYs");
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

        public Criteria andOperBcjlIsNull() {
            addCriterion("OPER_BCJL is null");
            return (Criteria) this;
        }

        public Criteria andOperBcjlIsNotNull() {
            addCriterion("OPER_BCJL is not null");
            return (Criteria) this;
        }

        public Criteria andOperBcjlEqualTo(String value) {
            addCriterion("OPER_BCJL =", value, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperBcjlNotEqualTo(String value) {
            addCriterion("OPER_BCJL <>", value, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperBcjlGreaterThan(String value) {
            addCriterion("OPER_BCJL >", value, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperBcjlGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_BCJL >=", value, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperBcjlLessThan(String value) {
            addCriterion("OPER_BCJL <", value, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperBcjlLessThanOrEqualTo(String value) {
            addCriterion("OPER_BCJL <=", value, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperBcjlLike(String value) {
            addCriterion("OPER_BCJL like", value, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperBcjlNotLike(String value) {
            addCriterion("OPER_BCJL not like", value, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperBcjlIn(List<String> values) {
            addCriterion("OPER_BCJL in", values, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperBcjlNotIn(List<String> values) {
            addCriterion("OPER_BCJL not in", values, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperBcjlBetween(String value1, String value2) {
            addCriterion("OPER_BCJL between", value1, value2, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperBcjlNotBetween(String value1, String value2) {
            addCriterion("OPER_BCJL not between", value1, value2, "operBcjl");
            return (Criteria) this;
        }

        public Criteria andOperationCodeIsNull() {
            addCriterion("OPERATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOperationCodeIsNotNull() {
            addCriterion("OPERATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperationCodeEqualTo(String value) {
            addCriterion("OPERATION_CODE =", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotEqualTo(String value) {
            addCriterion("OPERATION_CODE <>", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeGreaterThan(String value) {
            addCriterion("OPERATION_CODE >", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_CODE >=", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeLessThan(String value) {
            addCriterion("OPERATION_CODE <", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_CODE <=", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeLike(String value) {
            addCriterion("OPERATION_CODE like", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotLike(String value) {
            addCriterion("OPERATION_CODE not like", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeIn(List<String> values) {
            addCriterion("OPERATION_CODE in", values, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotIn(List<String> values) {
            addCriterion("OPERATION_CODE not in", values, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeBetween(String value1, String value2) {
            addCriterion("OPERATION_CODE between", value1, value2, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotBetween(String value1, String value2) {
            addCriterion("OPERATION_CODE not between", value1, value2, "operationCode");
            return (Criteria) this;
        }

        public Criteria andIsprintIsNull() {
            addCriterion("ISPRINT is null");
            return (Criteria) this;
        }

        public Criteria andIsprintIsNotNull() {
            addCriterion("ISPRINT is not null");
            return (Criteria) this;
        }

        public Criteria andIsprintEqualTo(String value) {
            addCriterion("ISPRINT =", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotEqualTo(String value) {
            addCriterion("ISPRINT <>", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintGreaterThan(String value) {
            addCriterion("ISPRINT >", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintGreaterThanOrEqualTo(String value) {
            addCriterion("ISPRINT >=", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLessThan(String value) {
            addCriterion("ISPRINT <", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLessThanOrEqualTo(String value) {
            addCriterion("ISPRINT <=", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLike(String value) {
            addCriterion("ISPRINT like", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotLike(String value) {
            addCriterion("ISPRINT not like", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintIn(List<String> values) {
            addCriterion("ISPRINT in", values, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotIn(List<String> values) {
            addCriterion("ISPRINT not in", values, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintBetween(String value1, String value2) {
            addCriterion("ISPRINT between", value1, value2, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotBetween(String value1, String value2) {
            addCriterion("ISPRINT not between", value1, value2, "isprint");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_OPERATE_INF
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_OPERATE_INF 2020-06-30
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