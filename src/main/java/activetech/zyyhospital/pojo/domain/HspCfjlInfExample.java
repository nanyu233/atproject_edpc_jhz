package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCfjlInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCfjlInfExample() {
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

        public Criteria andCfjlSeqIsNull() {
            addCriterion("CFJL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqIsNotNull() {
            addCriterion("CFJL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqEqualTo(String value) {
            addCriterion("CFJL_SEQ =", value, "cfjlSeq");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqNotEqualTo(String value) {
            addCriterion("CFJL_SEQ <>", value, "cfjlSeq");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqGreaterThan(String value) {
            addCriterion("CFJL_SEQ >", value, "cfjlSeq");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqGreaterThanOrEqualTo(String value) {
            addCriterion("CFJL_SEQ >=", value, "cfjlSeq");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqLessThan(String value) {
            addCriterion("CFJL_SEQ <", value, "cfjlSeq");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqLessThanOrEqualTo(String value) {
            addCriterion("CFJL_SEQ <=", value, "cfjlSeq");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqLike(String value) {
            addCriterion("CFJL_SEQ like", value, "cfjlSeq");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqNotLike(String value) {
            addCriterion("CFJL_SEQ not like", value, "cfjlSeq");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqIn(List<String> values) {
            addCriterion("CFJL_SEQ in", values, "cfjlSeq");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqNotIn(List<String> values) {
            addCriterion("CFJL_SEQ not in", values, "cfjlSeq");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqBetween(String value1, String value2) {
            addCriterion("CFJL_SEQ between", value1, value2, "cfjlSeq");
            return (Criteria) this;
        }

        public Criteria andCfjlSeqNotBetween(String value1, String value2) {
            addCriterion("CFJL_SEQ not between", value1, value2, "cfjlSeq");
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

        public Criteria andCfjlDatIsNull() {
            addCriterion("CFJL_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCfjlDatIsNotNull() {
            addCriterion("CFJL_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCfjlDatEqualTo(Date value) {
            addCriterion("CFJL_DAT =", value, "cfjlDat");
            return (Criteria) this;
        }

        public Criteria andCfjlDatNotEqualTo(Date value) {
            addCriterion("CFJL_DAT <>", value, "cfjlDat");
            return (Criteria) this;
        }

        public Criteria andCfjlDatGreaterThan(Date value) {
            addCriterion("CFJL_DAT >", value, "cfjlDat");
            return (Criteria) this;
        }

        public Criteria andCfjlDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CFJL_DAT >=", value, "cfjlDat");
            return (Criteria) this;
        }

        public Criteria andCfjlDatLessThan(Date value) {
            addCriterion("CFJL_DAT <", value, "cfjlDat");
            return (Criteria) this;
        }

        public Criteria andCfjlDatLessThanOrEqualTo(Date value) {
            addCriterion("CFJL_DAT <=", value, "cfjlDat");
            return (Criteria) this;
        }

        public Criteria andCfjlDatIn(List<Date> values) {
            addCriterion("CFJL_DAT in", values, "cfjlDat");
            return (Criteria) this;
        }

        public Criteria andCfjlDatNotIn(List<Date> values) {
            addCriterion("CFJL_DAT not in", values, "cfjlDat");
            return (Criteria) this;
        }

        public Criteria andCfjlDatBetween(Date value1, Date value2) {
            addCriterion("CFJL_DAT between", value1, value2, "cfjlDat");
            return (Criteria) this;
        }

        public Criteria andCfjlDatNotBetween(Date value1, Date value2) {
            addCriterion("CFJL_DAT not between", value1, value2, "cfjlDat");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeIsNull() {
            addCriterion("CFJL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeIsNotNull() {
            addCriterion("CFJL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeEqualTo(String value) {
            addCriterion("CFJL_TYPE =", value, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeNotEqualTo(String value) {
            addCriterion("CFJL_TYPE <>", value, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeGreaterThan(String value) {
            addCriterion("CFJL_TYPE >", value, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CFJL_TYPE >=", value, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeLessThan(String value) {
            addCriterion("CFJL_TYPE <", value, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeLessThanOrEqualTo(String value) {
            addCriterion("CFJL_TYPE <=", value, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeLike(String value) {
            addCriterion("CFJL_TYPE like", value, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeNotLike(String value) {
            addCriterion("CFJL_TYPE not like", value, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeIn(List<String> values) {
            addCriterion("CFJL_TYPE in", values, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeNotIn(List<String> values) {
            addCriterion("CFJL_TYPE not in", values, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeBetween(String value1, String value2) {
            addCriterion("CFJL_TYPE between", value1, value2, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlTypeNotBetween(String value1, String value2) {
            addCriterion("CFJL_TYPE not between", value1, value2, "cfjlType");
            return (Criteria) this;
        }

        public Criteria andCfjlNumIsNull() {
            addCriterion("CFJL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCfjlNumIsNotNull() {
            addCriterion("CFJL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCfjlNumEqualTo(String value) {
            addCriterion("CFJL_NUM =", value, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNumNotEqualTo(String value) {
            addCriterion("CFJL_NUM <>", value, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNumGreaterThan(String value) {
            addCriterion("CFJL_NUM >", value, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNumGreaterThanOrEqualTo(String value) {
            addCriterion("CFJL_NUM >=", value, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNumLessThan(String value) {
            addCriterion("CFJL_NUM <", value, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNumLessThanOrEqualTo(String value) {
            addCriterion("CFJL_NUM <=", value, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNumLike(String value) {
            addCriterion("CFJL_NUM like", value, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNumNotLike(String value) {
            addCriterion("CFJL_NUM not like", value, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNumIn(List<String> values) {
            addCriterion("CFJL_NUM in", values, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNumNotIn(List<String> values) {
            addCriterion("CFJL_NUM not in", values, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNumBetween(String value1, String value2) {
            addCriterion("CFJL_NUM between", value1, value2, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNumNotBetween(String value1, String value2) {
            addCriterion("CFJL_NUM not between", value1, value2, "cfjlNum");
            return (Criteria) this;
        }

        public Criteria andCfjlNamIsNull() {
            addCriterion("CFJL_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCfjlNamIsNotNull() {
            addCriterion("CFJL_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCfjlNamEqualTo(String value) {
            addCriterion("CFJL_NAM =", value, "cfjlNam");
            return (Criteria) this;
        }

        public Criteria andCfjlNamNotEqualTo(String value) {
            addCriterion("CFJL_NAM <>", value, "cfjlNam");
            return (Criteria) this;
        }

        public Criteria andCfjlNamGreaterThan(String value) {
            addCriterion("CFJL_NAM >", value, "cfjlNam");
            return (Criteria) this;
        }

        public Criteria andCfjlNamGreaterThanOrEqualTo(String value) {
            addCriterion("CFJL_NAM >=", value, "cfjlNam");
            return (Criteria) this;
        }

        public Criteria andCfjlNamLessThan(String value) {
            addCriterion("CFJL_NAM <", value, "cfjlNam");
            return (Criteria) this;
        }

        public Criteria andCfjlNamLessThanOrEqualTo(String value) {
            addCriterion("CFJL_NAM <=", value, "cfjlNam");
            return (Criteria) this;
        }

        public Criteria andCfjlNamLike(String value) {
            addCriterion("CFJL_NAM like", value, "cfjlNam");
            return (Criteria) this;
        }

        public Criteria andCfjlNamNotLike(String value) {
            addCriterion("CFJL_NAM not like", value, "cfjlNam");
            return (Criteria) this;
        }

        public Criteria andCfjlNamIn(List<String> values) {
            addCriterion("CFJL_NAM in", values, "cfjlNam");
            return (Criteria) this;
        }

        public Criteria andCfjlNamNotIn(List<String> values) {
            addCriterion("CFJL_NAM not in", values, "cfjlNam");
            return (Criteria) this;
        }

        public Criteria andCfjlNamBetween(String value1, String value2) {
            addCriterion("CFJL_NAM between", value1, value2, "cfjlNam");
            return (Criteria) this;
        }

        public Criteria andCfjlNamNotBetween(String value1, String value2) {
            addCriterion("CFJL_NAM not between", value1, value2, "cfjlNam");
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

        public Criteria andCheckNamIsNull() {
            addCriterion("CHECK_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCheckNamIsNotNull() {
            addCriterion("CHECK_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNamEqualTo(String value) {
            addCriterion("CHECK_NAM =", value, "checkNam");
            return (Criteria) this;
        }

        public Criteria andCheckNamNotEqualTo(String value) {
            addCriterion("CHECK_NAM <>", value, "checkNam");
            return (Criteria) this;
        }

        public Criteria andCheckNamGreaterThan(String value) {
            addCriterion("CHECK_NAM >", value, "checkNam");
            return (Criteria) this;
        }

        public Criteria andCheckNamGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_NAM >=", value, "checkNam");
            return (Criteria) this;
        }

        public Criteria andCheckNamLessThan(String value) {
            addCriterion("CHECK_NAM <", value, "checkNam");
            return (Criteria) this;
        }

        public Criteria andCheckNamLessThanOrEqualTo(String value) {
            addCriterion("CHECK_NAM <=", value, "checkNam");
            return (Criteria) this;
        }

        public Criteria andCheckNamLike(String value) {
            addCriterion("CHECK_NAM like", value, "checkNam");
            return (Criteria) this;
        }

        public Criteria andCheckNamNotLike(String value) {
            addCriterion("CHECK_NAM not like", value, "checkNam");
            return (Criteria) this;
        }

        public Criteria andCheckNamIn(List<String> values) {
            addCriterion("CHECK_NAM in", values, "checkNam");
            return (Criteria) this;
        }

        public Criteria andCheckNamNotIn(List<String> values) {
            addCriterion("CHECK_NAM not in", values, "checkNam");
            return (Criteria) this;
        }

        public Criteria andCheckNamBetween(String value1, String value2) {
            addCriterion("CHECK_NAM between", value1, value2, "checkNam");
            return (Criteria) this;
        }

        public Criteria andCheckNamNotBetween(String value1, String value2) {
            addCriterion("CHECK_NAM not between", value1, value2, "checkNam");
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