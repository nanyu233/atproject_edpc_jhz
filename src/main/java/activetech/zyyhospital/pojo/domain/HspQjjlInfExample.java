package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspQjjlInfExample {
    /**
     * ZJYY.HSP_QJJL_INF
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_QJJL_INF
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_QJJL_INF
     */
    protected List<Criteria> oredCriteria;

    public HspQjjlInfExample() {
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
     * ZJYY.HSP_QJJL_INF 2020-08-13
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

        public Criteria andQjjlSeqIsNull() {
            addCriterion("QJJL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqIsNotNull() {
            addCriterion("QJJL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqEqualTo(String value) {
            addCriterion("QJJL_SEQ =", value, "qjjlSeq");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqNotEqualTo(String value) {
            addCriterion("QJJL_SEQ <>", value, "qjjlSeq");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqGreaterThan(String value) {
            addCriterion("QJJL_SEQ >", value, "qjjlSeq");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqGreaterThanOrEqualTo(String value) {
            addCriterion("QJJL_SEQ >=", value, "qjjlSeq");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqLessThan(String value) {
            addCriterion("QJJL_SEQ <", value, "qjjlSeq");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqLessThanOrEqualTo(String value) {
            addCriterion("QJJL_SEQ <=", value, "qjjlSeq");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqLike(String value) {
            addCriterion("QJJL_SEQ like", value, "qjjlSeq");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqNotLike(String value) {
            addCriterion("QJJL_SEQ not like", value, "qjjlSeq");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqIn(List<String> values) {
            addCriterion("QJJL_SEQ in", values, "qjjlSeq");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqNotIn(List<String> values) {
            addCriterion("QJJL_SEQ not in", values, "qjjlSeq");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqBetween(String value1, String value2) {
            addCriterion("QJJL_SEQ between", value1, value2, "qjjlSeq");
            return (Criteria) this;
        }

        public Criteria andQjjlSeqNotBetween(String value1, String value2) {
            addCriterion("QJJL_SEQ not between", value1, value2, "qjjlSeq");
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

        public Criteria andQjjlDatStartIsNull() {
            addCriterion("QJJL_DAT_START is null");
            return (Criteria) this;
        }

        public Criteria andQjjlDatStartIsNotNull() {
            addCriterion("QJJL_DAT_START is not null");
            return (Criteria) this;
        }

        public Criteria andQjjlDatStartEqualTo(Date value) {
            addCriterion("QJJL_DAT_START =", value, "qjjlDatStart");
            return (Criteria) this;
        }

        public Criteria andQjjlDatStartNotEqualTo(Date value) {
            addCriterion("QJJL_DAT_START <>", value, "qjjlDatStart");
            return (Criteria) this;
        }

        public Criteria andQjjlDatStartGreaterThan(Date value) {
            addCriterion("QJJL_DAT_START >", value, "qjjlDatStart");
            return (Criteria) this;
        }

        public Criteria andQjjlDatStartGreaterThanOrEqualTo(Date value) {
            addCriterion("QJJL_DAT_START >=", value, "qjjlDatStart");
            return (Criteria) this;
        }

        public Criteria andQjjlDatStartLessThan(Date value) {
            addCriterion("QJJL_DAT_START <", value, "qjjlDatStart");
            return (Criteria) this;
        }

        public Criteria andQjjlDatStartLessThanOrEqualTo(Date value) {
            addCriterion("QJJL_DAT_START <=", value, "qjjlDatStart");
            return (Criteria) this;
        }

        public Criteria andQjjlDatStartIn(List<Date> values) {
            addCriterion("QJJL_DAT_START in", values, "qjjlDatStart");
            return (Criteria) this;
        }

        public Criteria andQjjlDatStartNotIn(List<Date> values) {
            addCriterion("QJJL_DAT_START not in", values, "qjjlDatStart");
            return (Criteria) this;
        }

        public Criteria andQjjlDatStartBetween(Date value1, Date value2) {
            addCriterion("QJJL_DAT_START between", value1, value2, "qjjlDatStart");
            return (Criteria) this;
        }

        public Criteria andQjjlDatStartNotBetween(Date value1, Date value2) {
            addCriterion("QJJL_DAT_START not between", value1, value2, "qjjlDatStart");
            return (Criteria) this;
        }

        public Criteria andDocSignIsNull() {
            addCriterion("DOC_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andDocSignIsNotNull() {
            addCriterion("DOC_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andDocSignEqualTo(String value) {
            addCriterion("DOC_SIGN =", value, "docSign");
            return (Criteria) this;
        }

        public Criteria andDocSignNotEqualTo(String value) {
            addCriterion("DOC_SIGN <>", value, "docSign");
            return (Criteria) this;
        }

        public Criteria andDocSignGreaterThan(String value) {
            addCriterion("DOC_SIGN >", value, "docSign");
            return (Criteria) this;
        }

        public Criteria andDocSignGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_SIGN >=", value, "docSign");
            return (Criteria) this;
        }

        public Criteria andDocSignLessThan(String value) {
            addCriterion("DOC_SIGN <", value, "docSign");
            return (Criteria) this;
        }

        public Criteria andDocSignLessThanOrEqualTo(String value) {
            addCriterion("DOC_SIGN <=", value, "docSign");
            return (Criteria) this;
        }

        public Criteria andDocSignLike(String value) {
            addCriterion("DOC_SIGN like", value, "docSign");
            return (Criteria) this;
        }

        public Criteria andDocSignNotLike(String value) {
            addCriterion("DOC_SIGN not like", value, "docSign");
            return (Criteria) this;
        }

        public Criteria andDocSignIn(List<String> values) {
            addCriterion("DOC_SIGN in", values, "docSign");
            return (Criteria) this;
        }

        public Criteria andDocSignNotIn(List<String> values) {
            addCriterion("DOC_SIGN not in", values, "docSign");
            return (Criteria) this;
        }

        public Criteria andDocSignBetween(String value1, String value2) {
            addCriterion("DOC_SIGN between", value1, value2, "docSign");
            return (Criteria) this;
        }

        public Criteria andDocSignNotBetween(String value1, String value2) {
            addCriterion("DOC_SIGN not between", value1, value2, "docSign");
            return (Criteria) this;
        }

        public Criteria andCreateDatIsNull() {
            addCriterion("CREATE_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatIsNotNull() {
            addCriterion("CREATE_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatEqualTo(Date value) {
            addCriterion("CREATE_DAT =", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatNotEqualTo(Date value) {
            addCriterion("CREATE_DAT <>", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatGreaterThan(Date value) {
            addCriterion("CREATE_DAT >", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DAT >=", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatLessThan(Date value) {
            addCriterion("CREATE_DAT <", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DAT <=", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatIn(List<Date> values) {
            addCriterion("CREATE_DAT in", values, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatNotIn(List<Date> values) {
            addCriterion("CREATE_DAT not in", values, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatBetween(Date value1, Date value2) {
            addCriterion("CREATE_DAT between", value1, value2, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DAT not between", value1, value2, "createDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatIsNull() {
            addCriterion("UPDATE_DAT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatIsNotNull() {
            addCriterion("UPDATE_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatEqualTo(Date value) {
            addCriterion("UPDATE_DAT =", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatNotEqualTo(Date value) {
            addCriterion("UPDATE_DAT <>", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatGreaterThan(Date value) {
            addCriterion("UPDATE_DAT >", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DAT >=", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatLessThan(Date value) {
            addCriterion("UPDATE_DAT <", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DAT <=", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatIn(List<Date> values) {
            addCriterion("UPDATE_DAT in", values, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatNotIn(List<Date> values) {
            addCriterion("UPDATE_DAT not in", values, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DAT between", value1, value2, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DAT not between", value1, value2, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateNumIsNull() {
            addCriterion("UPDATE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNumIsNotNull() {
            addCriterion("UPDATE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNumEqualTo(String value) {
            addCriterion("UPDATE_NUM =", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumNotEqualTo(String value) {
            addCriterion("UPDATE_NUM <>", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumGreaterThan(String value) {
            addCriterion("UPDATE_NUM >", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_NUM >=", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumLessThan(String value) {
            addCriterion("UPDATE_NUM <", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_NUM <=", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumLike(String value) {
            addCriterion("UPDATE_NUM like", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumNotLike(String value) {
            addCriterion("UPDATE_NUM not like", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumIn(List<String> values) {
            addCriterion("UPDATE_NUM in", values, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumNotIn(List<String> values) {
            addCriterion("UPDATE_NUM not in", values, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumBetween(String value1, String value2) {
            addCriterion("UPDATE_NUM between", value1, value2, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumNotBetween(String value1, String value2) {
            addCriterion("UPDATE_NUM not between", value1, value2, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIsNull() {
            addCriterion("UPDATE_NAM is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIsNotNull() {
            addCriterion("UPDATE_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNamEqualTo(String value) {
            addCriterion("UPDATE_NAM =", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotEqualTo(String value) {
            addCriterion("UPDATE_NAM <>", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamGreaterThan(String value) {
            addCriterion("UPDATE_NAM >", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAM >=", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLessThan(String value) {
            addCriterion("UPDATE_NAM <", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAM <=", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLike(String value) {
            addCriterion("UPDATE_NAM like", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotLike(String value) {
            addCriterion("UPDATE_NAM not like", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIn(List<String> values) {
            addCriterion("UPDATE_NAM in", values, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotIn(List<String> values) {
            addCriterion("UPDATE_NAM not in", values, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamBetween(String value1, String value2) {
            addCriterion("UPDATE_NAM between", value1, value2, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotBetween(String value1, String value2) {
            addCriterion("UPDATE_NAM not between", value1, value2, "updateNam");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatIsNull() {
            addCriterion("QJJL_JLDAT is null");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatIsNotNull() {
            addCriterion("QJJL_JLDAT is not null");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatEqualTo(Date value) {
            addCriterion("QJJL_JLDAT =", value, "qjjlJldat");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatNotEqualTo(Date value) {
            addCriterion("QJJL_JLDAT <>", value, "qjjlJldat");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatGreaterThan(Date value) {
            addCriterion("QJJL_JLDAT >", value, "qjjlJldat");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatGreaterThanOrEqualTo(Date value) {
            addCriterion("QJJL_JLDAT >=", value, "qjjlJldat");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatLessThan(Date value) {
            addCriterion("QJJL_JLDAT <", value, "qjjlJldat");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatLessThanOrEqualTo(Date value) {
            addCriterion("QJJL_JLDAT <=", value, "qjjlJldat");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatIn(List<Date> values) {
            addCriterion("QJJL_JLDAT in", values, "qjjlJldat");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatNotIn(List<Date> values) {
            addCriterion("QJJL_JLDAT not in", values, "qjjlJldat");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatBetween(Date value1, Date value2) {
            addCriterion("QJJL_JLDAT between", value1, value2, "qjjlJldat");
            return (Criteria) this;
        }

        public Criteria andQjjlJldatNotBetween(Date value1, Date value2) {
            addCriterion("QJJL_JLDAT not between", value1, value2, "qjjlJldat");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamIsNull() {
            addCriterion("QJJL_JLNAM is null");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamIsNotNull() {
            addCriterion("QJJL_JLNAM is not null");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamEqualTo(String value) {
            addCriterion("QJJL_JLNAM =", value, "qjjlJlnam");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamNotEqualTo(String value) {
            addCriterion("QJJL_JLNAM <>", value, "qjjlJlnam");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamGreaterThan(String value) {
            addCriterion("QJJL_JLNAM >", value, "qjjlJlnam");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamGreaterThanOrEqualTo(String value) {
            addCriterion("QJJL_JLNAM >=", value, "qjjlJlnam");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamLessThan(String value) {
            addCriterion("QJJL_JLNAM <", value, "qjjlJlnam");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamLessThanOrEqualTo(String value) {
            addCriterion("QJJL_JLNAM <=", value, "qjjlJlnam");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamLike(String value) {
            addCriterion("QJJL_JLNAM like", value, "qjjlJlnam");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamNotLike(String value) {
            addCriterion("QJJL_JLNAM not like", value, "qjjlJlnam");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamIn(List<String> values) {
            addCriterion("QJJL_JLNAM in", values, "qjjlJlnam");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamNotIn(List<String> values) {
            addCriterion("QJJL_JLNAM not in", values, "qjjlJlnam");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamBetween(String value1, String value2) {
            addCriterion("QJJL_JLNAM between", value1, value2, "qjjlJlnam");
            return (Criteria) this;
        }

        public Criteria andQjjlJlnamNotBetween(String value1, String value2) {
            addCriterion("QJJL_JLNAM not between", value1, value2, "qjjlJlnam");
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

        public Criteria andQjjlDatEndIsNull() {
            addCriterion("QJJL_DAT_END is null");
            return (Criteria) this;
        }

        public Criteria andQjjlDatEndIsNotNull() {
            addCriterion("QJJL_DAT_END is not null");
            return (Criteria) this;
        }

        public Criteria andQjjlDatEndEqualTo(Date value) {
            addCriterion("QJJL_DAT_END =", value, "qjjlDatEnd");
            return (Criteria) this;
        }

        public Criteria andQjjlDatEndNotEqualTo(Date value) {
            addCriterion("QJJL_DAT_END <>", value, "qjjlDatEnd");
            return (Criteria) this;
        }

        public Criteria andQjjlDatEndGreaterThan(Date value) {
            addCriterion("QJJL_DAT_END >", value, "qjjlDatEnd");
            return (Criteria) this;
        }

        public Criteria andQjjlDatEndGreaterThanOrEqualTo(Date value) {
            addCriterion("QJJL_DAT_END >=", value, "qjjlDatEnd");
            return (Criteria) this;
        }

        public Criteria andQjjlDatEndLessThan(Date value) {
            addCriterion("QJJL_DAT_END <", value, "qjjlDatEnd");
            return (Criteria) this;
        }

        public Criteria andQjjlDatEndLessThanOrEqualTo(Date value) {
            addCriterion("QJJL_DAT_END <=", value, "qjjlDatEnd");
            return (Criteria) this;
        }

        public Criteria andQjjlDatEndIn(List<Date> values) {
            addCriterion("QJJL_DAT_END in", values, "qjjlDatEnd");
            return (Criteria) this;
        }

        public Criteria andQjjlDatEndNotIn(List<Date> values) {
            addCriterion("QJJL_DAT_END not in", values, "qjjlDatEnd");
            return (Criteria) this;
        }

        public Criteria andQjjlDatEndBetween(Date value1, Date value2) {
            addCriterion("QJJL_DAT_END between", value1, value2, "qjjlDatEnd");
            return (Criteria) this;
        }

        public Criteria andQjjlDatEndNotBetween(Date value1, Date value2) {
            addCriterion("QJJL_DAT_END not between", value1, value2, "qjjlDatEnd");
            return (Criteria) this;
        }

        public Criteria andManageDocIsNull() {
            addCriterion("MANAGE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andManageDocIsNotNull() {
            addCriterion("MANAGE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andManageDocEqualTo(String value) {
            addCriterion("MANAGE_DOC =", value, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andManageDocNotEqualTo(String value) {
            addCriterion("MANAGE_DOC <>", value, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andManageDocGreaterThan(String value) {
            addCriterion("MANAGE_DOC >", value, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andManageDocGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGE_DOC >=", value, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andManageDocLessThan(String value) {
            addCriterion("MANAGE_DOC <", value, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andManageDocLessThanOrEqualTo(String value) {
            addCriterion("MANAGE_DOC <=", value, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andManageDocLike(String value) {
            addCriterion("MANAGE_DOC like", value, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andManageDocNotLike(String value) {
            addCriterion("MANAGE_DOC not like", value, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andManageDocIn(List<String> values) {
            addCriterion("MANAGE_DOC in", values, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andManageDocNotIn(List<String> values) {
            addCriterion("MANAGE_DOC not in", values, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andManageDocBetween(String value1, String value2) {
            addCriterion("MANAGE_DOC between", value1, value2, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andManageDocNotBetween(String value1, String value2) {
            addCriterion("MANAGE_DOC not between", value1, value2, "manageDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocIsNull() {
            addCriterion("SUPERIOR_DOC is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocIsNotNull() {
            addCriterion("SUPERIOR_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocEqualTo(String value) {
            addCriterion("SUPERIOR_DOC =", value, "superiorDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocNotEqualTo(String value) {
            addCriterion("SUPERIOR_DOC <>", value, "superiorDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocGreaterThan(String value) {
            addCriterion("SUPERIOR_DOC >", value, "superiorDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERIOR_DOC >=", value, "superiorDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocLessThan(String value) {
            addCriterion("SUPERIOR_DOC <", value, "superiorDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocLessThanOrEqualTo(String value) {
            addCriterion("SUPERIOR_DOC <=", value, "superiorDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocLike(String value) {
            addCriterion("SUPERIOR_DOC like", value, "superiorDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocNotLike(String value) {
            addCriterion("SUPERIOR_DOC not like", value, "superiorDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocIn(List<String> values) {
            addCriterion("SUPERIOR_DOC in", values, "superiorDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocNotIn(List<String> values) {
            addCriterion("SUPERIOR_DOC not in", values, "superiorDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocBetween(String value1, String value2) {
            addCriterion("SUPERIOR_DOC between", value1, value2, "superiorDoc");
            return (Criteria) this;
        }

        public Criteria andSuperiorDocNotBetween(String value1, String value2) {
            addCriterion("SUPERIOR_DOC not between", value1, value2, "superiorDoc");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_QJJL_INF
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_QJJL_INF 2020-08-13
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