package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspJjbjlInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJjbjlInfExample() {
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

        public Criteria andJjbjlSeqIsNull() {
            addCriterion("JJBJL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqIsNotNull() {
            addCriterion("JJBJL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqEqualTo(String value) {
            addCriterion("JJBJL_SEQ =", value, "jjbjlSeq");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqNotEqualTo(String value) {
            addCriterion("JJBJL_SEQ <>", value, "jjbjlSeq");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqGreaterThan(String value) {
            addCriterion("JJBJL_SEQ >", value, "jjbjlSeq");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqGreaterThanOrEqualTo(String value) {
            addCriterion("JJBJL_SEQ >=", value, "jjbjlSeq");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqLessThan(String value) {
            addCriterion("JJBJL_SEQ <", value, "jjbjlSeq");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqLessThanOrEqualTo(String value) {
            addCriterion("JJBJL_SEQ <=", value, "jjbjlSeq");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqLike(String value) {
            addCriterion("JJBJL_SEQ like", value, "jjbjlSeq");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqNotLike(String value) {
            addCriterion("JJBJL_SEQ not like", value, "jjbjlSeq");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqIn(List<String> values) {
            addCriterion("JJBJL_SEQ in", values, "jjbjlSeq");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqNotIn(List<String> values) {
            addCriterion("JJBJL_SEQ not in", values, "jjbjlSeq");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqBetween(String value1, String value2) {
            addCriterion("JJBJL_SEQ between", value1, value2, "jjbjlSeq");
            return (Criteria) this;
        }

        public Criteria andJjbjlSeqNotBetween(String value1, String value2) {
            addCriterion("JJBJL_SEQ not between", value1, value2, "jjbjlSeq");
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

        public Criteria andJjbjlDatIsNull() {
            addCriterion("JJBJL_DAT is null");
            return (Criteria) this;
        }

        public Criteria andJjbjlDatIsNotNull() {
            addCriterion("JJBJL_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andJjbjlDatEqualTo(Date value) {
            addCriterion("JJBJL_DAT =", value, "jjbjlDat");
            return (Criteria) this;
        }

        public Criteria andJjbjlDatNotEqualTo(Date value) {
            addCriterion("JJBJL_DAT <>", value, "jjbjlDat");
            return (Criteria) this;
        }

        public Criteria andJjbjlDatGreaterThan(Date value) {
            addCriterion("JJBJL_DAT >", value, "jjbjlDat");
            return (Criteria) this;
        }

        public Criteria andJjbjlDatGreaterThanOrEqualTo(Date value) {
            addCriterion("JJBJL_DAT >=", value, "jjbjlDat");
            return (Criteria) this;
        }

        public Criteria andJjbjlDatLessThan(Date value) {
            addCriterion("JJBJL_DAT <", value, "jjbjlDat");
            return (Criteria) this;
        }

        public Criteria andJjbjlDatLessThanOrEqualTo(Date value) {
            addCriterion("JJBJL_DAT <=", value, "jjbjlDat");
            return (Criteria) this;
        }

        public Criteria andJjbjlDatIn(List<Date> values) {
            addCriterion("JJBJL_DAT in", values, "jjbjlDat");
            return (Criteria) this;
        }

        public Criteria andJjbjlDatNotIn(List<Date> values) {
            addCriterion("JJBJL_DAT not in", values, "jjbjlDat");
            return (Criteria) this;
        }

        public Criteria andJjbjlDatBetween(Date value1, Date value2) {
            addCriterion("JJBJL_DAT between", value1, value2, "jjbjlDat");
            return (Criteria) this;
        }

        public Criteria andJjbjlDatNotBetween(Date value1, Date value2) {
            addCriterion("JJBJL_DAT not between", value1, value2, "jjbjlDat");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeIsNull() {
            addCriterion("JJBJL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeIsNotNull() {
            addCriterion("JJBJL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeEqualTo(String value) {
            addCriterion("JJBJL_TYPE =", value, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeNotEqualTo(String value) {
            addCriterion("JJBJL_TYPE <>", value, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeGreaterThan(String value) {
            addCriterion("JJBJL_TYPE >", value, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("JJBJL_TYPE >=", value, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeLessThan(String value) {
            addCriterion("JJBJL_TYPE <", value, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeLessThanOrEqualTo(String value) {
            addCriterion("JJBJL_TYPE <=", value, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeLike(String value) {
            addCriterion("JJBJL_TYPE like", value, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeNotLike(String value) {
            addCriterion("JJBJL_TYPE not like", value, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeIn(List<String> values) {
            addCriterion("JJBJL_TYPE in", values, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeNotIn(List<String> values) {
            addCriterion("JJBJL_TYPE not in", values, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeBetween(String value1, String value2) {
            addCriterion("JJBJL_TYPE between", value1, value2, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlTypeNotBetween(String value1, String value2) {
            addCriterion("JJBJL_TYPE not between", value1, value2, "jjbjlType");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumIsNull() {
            addCriterion("JJBJL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumIsNotNull() {
            addCriterion("JJBJL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumEqualTo(String value) {
            addCriterion("JJBJL_NUM =", value, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumNotEqualTo(String value) {
            addCriterion("JJBJL_NUM <>", value, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumGreaterThan(String value) {
            addCriterion("JJBJL_NUM >", value, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumGreaterThanOrEqualTo(String value) {
            addCriterion("JJBJL_NUM >=", value, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumLessThan(String value) {
            addCriterion("JJBJL_NUM <", value, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumLessThanOrEqualTo(String value) {
            addCriterion("JJBJL_NUM <=", value, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumLike(String value) {
            addCriterion("JJBJL_NUM like", value, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumNotLike(String value) {
            addCriterion("JJBJL_NUM not like", value, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumIn(List<String> values) {
            addCriterion("JJBJL_NUM in", values, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumNotIn(List<String> values) {
            addCriterion("JJBJL_NUM not in", values, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumBetween(String value1, String value2) {
            addCriterion("JJBJL_NUM between", value1, value2, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNumNotBetween(String value1, String value2) {
            addCriterion("JJBJL_NUM not between", value1, value2, "jjbjlNum");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamIsNull() {
            addCriterion("JJBJL_NAM is null");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamIsNotNull() {
            addCriterion("JJBJL_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamEqualTo(String value) {
            addCriterion("JJBJL_NAM =", value, "jjbjlNam");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamNotEqualTo(String value) {
            addCriterion("JJBJL_NAM <>", value, "jjbjlNam");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamGreaterThan(String value) {
            addCriterion("JJBJL_NAM >", value, "jjbjlNam");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamGreaterThanOrEqualTo(String value) {
            addCriterion("JJBJL_NAM >=", value, "jjbjlNam");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamLessThan(String value) {
            addCriterion("JJBJL_NAM <", value, "jjbjlNam");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamLessThanOrEqualTo(String value) {
            addCriterion("JJBJL_NAM <=", value, "jjbjlNam");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamLike(String value) {
            addCriterion("JJBJL_NAM like", value, "jjbjlNam");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamNotLike(String value) {
            addCriterion("JJBJL_NAM not like", value, "jjbjlNam");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamIn(List<String> values) {
            addCriterion("JJBJL_NAM in", values, "jjbjlNam");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamNotIn(List<String> values) {
            addCriterion("JJBJL_NAM not in", values, "jjbjlNam");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamBetween(String value1, String value2) {
            addCriterion("JJBJL_NAM between", value1, value2, "jjbjlNam");
            return (Criteria) this;
        }

        public Criteria andJjbjlNamNotBetween(String value1, String value2) {
            addCriterion("JJBJL_NAM not between", value1, value2, "jjbjlNam");
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