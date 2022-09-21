package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspObsvtfstInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspObsvtfstInfExample() {
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

        public Criteria andObsvtfstSeqIsNull() {
            addCriterion("OBSVTFST_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqIsNotNull() {
            addCriterion("OBSVTFST_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqEqualTo(String value) {
            addCriterion("OBSVTFST_SEQ =", value, "obsvtfstSeq");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqNotEqualTo(String value) {
            addCriterion("OBSVTFST_SEQ <>", value, "obsvtfstSeq");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqGreaterThan(String value) {
            addCriterion("OBSVTFST_SEQ >", value, "obsvtfstSeq");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqGreaterThanOrEqualTo(String value) {
            addCriterion("OBSVTFST_SEQ >=", value, "obsvtfstSeq");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqLessThan(String value) {
            addCriterion("OBSVTFST_SEQ <", value, "obsvtfstSeq");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqLessThanOrEqualTo(String value) {
            addCriterion("OBSVTFST_SEQ <=", value, "obsvtfstSeq");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqLike(String value) {
            addCriterion("OBSVTFST_SEQ like", value, "obsvtfstSeq");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqNotLike(String value) {
            addCriterion("OBSVTFST_SEQ not like", value, "obsvtfstSeq");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqIn(List<String> values) {
            addCriterion("OBSVTFST_SEQ in", values, "obsvtfstSeq");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqNotIn(List<String> values) {
            addCriterion("OBSVTFST_SEQ not in", values, "obsvtfstSeq");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqBetween(String value1, String value2) {
            addCriterion("OBSVTFST_SEQ between", value1, value2, "obsvtfstSeq");
            return (Criteria) this;
        }

        public Criteria andObsvtfstSeqNotBetween(String value1, String value2) {
            addCriterion("OBSVTFST_SEQ not between", value1, value2, "obsvtfstSeq");
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

        public Criteria andAdmtDatIsNull() {
            addCriterion("ADMT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andAdmtDatIsNotNull() {
            addCriterion("ADMT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andAdmtDatEqualTo(Date value) {
            addCriterion("ADMT_DAT =", value, "admtDat");
            return (Criteria) this;
        }

        public Criteria andAdmtDatNotEqualTo(Date value) {
            addCriterion("ADMT_DAT <>", value, "admtDat");
            return (Criteria) this;
        }

        public Criteria andAdmtDatGreaterThan(Date value) {
            addCriterion("ADMT_DAT >", value, "admtDat");
            return (Criteria) this;
        }

        public Criteria andAdmtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("ADMT_DAT >=", value, "admtDat");
            return (Criteria) this;
        }

        public Criteria andAdmtDatLessThan(Date value) {
            addCriterion("ADMT_DAT <", value, "admtDat");
            return (Criteria) this;
        }

        public Criteria andAdmtDatLessThanOrEqualTo(Date value) {
            addCriterion("ADMT_DAT <=", value, "admtDat");
            return (Criteria) this;
        }

        public Criteria andAdmtDatIn(List<Date> values) {
            addCriterion("ADMT_DAT in", values, "admtDat");
            return (Criteria) this;
        }

        public Criteria andAdmtDatNotIn(List<Date> values) {
            addCriterion("ADMT_DAT not in", values, "admtDat");
            return (Criteria) this;
        }

        public Criteria andAdmtDatBetween(Date value1, Date value2) {
            addCriterion("ADMT_DAT between", value1, value2, "admtDat");
            return (Criteria) this;
        }

        public Criteria andAdmtDatNotBetween(Date value1, Date value2) {
            addCriterion("ADMT_DAT not between", value1, value2, "admtDat");
            return (Criteria) this;
        }

        public Criteria andDscgDatIsNull() {
            addCriterion("DSCG_DAT is null");
            return (Criteria) this;
        }

        public Criteria andDscgDatIsNotNull() {
            addCriterion("DSCG_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andDscgDatEqualTo(Date value) {
            addCriterion("DSCG_DAT =", value, "dscgDat");
            return (Criteria) this;
        }

        public Criteria andDscgDatNotEqualTo(Date value) {
            addCriterion("DSCG_DAT <>", value, "dscgDat");
            return (Criteria) this;
        }

        public Criteria andDscgDatGreaterThan(Date value) {
            addCriterion("DSCG_DAT >", value, "dscgDat");
            return (Criteria) this;
        }

        public Criteria andDscgDatGreaterThanOrEqualTo(Date value) {
            addCriterion("DSCG_DAT >=", value, "dscgDat");
            return (Criteria) this;
        }

        public Criteria andDscgDatLessThan(Date value) {
            addCriterion("DSCG_DAT <", value, "dscgDat");
            return (Criteria) this;
        }

        public Criteria andDscgDatLessThanOrEqualTo(Date value) {
            addCriterion("DSCG_DAT <=", value, "dscgDat");
            return (Criteria) this;
        }

        public Criteria andDscgDatIn(List<Date> values) {
            addCriterion("DSCG_DAT in", values, "dscgDat");
            return (Criteria) this;
        }

        public Criteria andDscgDatNotIn(List<Date> values) {
            addCriterion("DSCG_DAT not in", values, "dscgDat");
            return (Criteria) this;
        }

        public Criteria andDscgDatBetween(Date value1, Date value2) {
            addCriterion("DSCG_DAT between", value1, value2, "dscgDat");
            return (Criteria) this;
        }

        public Criteria andDscgDatNotBetween(Date value1, Date value2) {
            addCriterion("DSCG_DAT not between", value1, value2, "dscgDat");
            return (Criteria) this;
        }

        public Criteria andObsvtLenIsNull() {
            addCriterion("OBSVT_LEN is null");
            return (Criteria) this;
        }

        public Criteria andObsvtLenIsNotNull() {
            addCriterion("OBSVT_LEN is not null");
            return (Criteria) this;
        }

        public Criteria andObsvtLenEqualTo(Short value) {
            addCriterion("OBSVT_LEN =", value, "obsvtLen");
            return (Criteria) this;
        }

        public Criteria andObsvtLenNotEqualTo(Short value) {
            addCriterion("OBSVT_LEN <>", value, "obsvtLen");
            return (Criteria) this;
        }

        public Criteria andObsvtLenGreaterThan(Short value) {
            addCriterion("OBSVT_LEN >", value, "obsvtLen");
            return (Criteria) this;
        }

        public Criteria andObsvtLenGreaterThanOrEqualTo(Short value) {
            addCriterion("OBSVT_LEN >=", value, "obsvtLen");
            return (Criteria) this;
        }

        public Criteria andObsvtLenLessThan(Short value) {
            addCriterion("OBSVT_LEN <", value, "obsvtLen");
            return (Criteria) this;
        }

        public Criteria andObsvtLenLessThanOrEqualTo(Short value) {
            addCriterion("OBSVT_LEN <=", value, "obsvtLen");
            return (Criteria) this;
        }

        public Criteria andObsvtLenIn(List<Short> values) {
            addCriterion("OBSVT_LEN in", values, "obsvtLen");
            return (Criteria) this;
        }

        public Criteria andObsvtLenNotIn(List<Short> values) {
            addCriterion("OBSVT_LEN not in", values, "obsvtLen");
            return (Criteria) this;
        }

        public Criteria andObsvtLenBetween(Short value1, Short value2) {
            addCriterion("OBSVT_LEN between", value1, value2, "obsvtLen");
            return (Criteria) this;
        }

        public Criteria andObsvtLenNotBetween(Short value1, Short value2) {
            addCriterion("OBSVT_LEN not between", value1, value2, "obsvtLen");
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

        public Criteria andCratNbrIsNull() {
            addCriterion("CRAT_NBR is null");
            return (Criteria) this;
        }

        public Criteria andCratNbrIsNotNull() {
            addCriterion("CRAT_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andCratNbrEqualTo(String value) {
            addCriterion("CRAT_NBR =", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotEqualTo(String value) {
            addCriterion("CRAT_NBR <>", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrGreaterThan(String value) {
            addCriterion("CRAT_NBR >", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CRAT_NBR >=", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrLessThan(String value) {
            addCriterion("CRAT_NBR <", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrLessThanOrEqualTo(String value) {
            addCriterion("CRAT_NBR <=", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrLike(String value) {
            addCriterion("CRAT_NBR like", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotLike(String value) {
            addCriterion("CRAT_NBR not like", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrIn(List<String> values) {
            addCriterion("CRAT_NBR in", values, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotIn(List<String> values) {
            addCriterion("CRAT_NBR not in", values, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrBetween(String value1, String value2) {
            addCriterion("CRAT_NBR between", value1, value2, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotBetween(String value1, String value2) {
            addCriterion("CRAT_NBR not between", value1, value2, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNamIsNull() {
            addCriterion("CRAT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCratNamIsNotNull() {
            addCriterion("CRAT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCratNamEqualTo(String value) {
            addCriterion("CRAT_NAM =", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotEqualTo(String value) {
            addCriterion("CRAT_NAM <>", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamGreaterThan(String value) {
            addCriterion("CRAT_NAM >", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamGreaterThanOrEqualTo(String value) {
            addCriterion("CRAT_NAM >=", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamLessThan(String value) {
            addCriterion("CRAT_NAM <", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamLessThanOrEqualTo(String value) {
            addCriterion("CRAT_NAM <=", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamLike(String value) {
            addCriterion("CRAT_NAM like", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotLike(String value) {
            addCriterion("CRAT_NAM not like", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamIn(List<String> values) {
            addCriterion("CRAT_NAM in", values, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotIn(List<String> values) {
            addCriterion("CRAT_NAM not in", values, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamBetween(String value1, String value2) {
            addCriterion("CRAT_NAM between", value1, value2, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotBetween(String value1, String value2) {
            addCriterion("CRAT_NAM not between", value1, value2, "cratNam");
            return (Criteria) this;
        }

        public Criteria andUpdtDatIsNull() {
            addCriterion("UPDT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andUpdtDatIsNotNull() {
            addCriterion("UPDT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtDatEqualTo(Date value) {
            addCriterion("UPDT_DAT =", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatNotEqualTo(Date value) {
            addCriterion("UPDT_DAT <>", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatGreaterThan(Date value) {
            addCriterion("UPDT_DAT >", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT >=", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatLessThan(Date value) {
            addCriterion("UPDT_DAT <", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatLessThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT <=", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatIn(List<Date> values) {
            addCriterion("UPDT_DAT in", values, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatNotIn(List<Date> values) {
            addCriterion("UPDT_DAT not in", values, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatBetween(Date value1, Date value2) {
            addCriterion("UPDT_DAT between", value1, value2, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatNotBetween(Date value1, Date value2) {
            addCriterion("UPDT_DAT not between", value1, value2, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrIsNull() {
            addCriterion("UPDT_NBR is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrIsNotNull() {
            addCriterion("UPDT_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrEqualTo(String value) {
            addCriterion("UPDT_NBR =", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotEqualTo(String value) {
            addCriterion("UPDT_NBR <>", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrGreaterThan(String value) {
            addCriterion("UPDT_NBR >", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR >=", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrLessThan(String value) {
            addCriterion("UPDT_NBR <", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrLessThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR <=", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrLike(String value) {
            addCriterion("UPDT_NBR like", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotLike(String value) {
            addCriterion("UPDT_NBR not like", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrIn(List<String> values) {
            addCriterion("UPDT_NBR in", values, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotIn(List<String> values) {
            addCriterion("UPDT_NBR not in", values, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrBetween(String value1, String value2) {
            addCriterion("UPDT_NBR between", value1, value2, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotBetween(String value1, String value2) {
            addCriterion("UPDT_NBR not between", value1, value2, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNamIsNull() {
            addCriterion("UPDT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNamIsNotNull() {
            addCriterion("UPDT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNamEqualTo(String value) {
            addCriterion("UPDT_NAM =", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotEqualTo(String value) {
            addCriterion("UPDT_NAM <>", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamGreaterThan(String value) {
            addCriterion("UPDT_NAM >", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamGreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM >=", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamLessThan(String value) {
            addCriterion("UPDT_NAM <", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamLessThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM <=", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamLike(String value) {
            addCriterion("UPDT_NAM like", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotLike(String value) {
            addCriterion("UPDT_NAM not like", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamIn(List<String> values) {
            addCriterion("UPDT_NAM in", values, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotIn(List<String> values) {
            addCriterion("UPDT_NAM not in", values, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamBetween(String value1, String value2) {
            addCriterion("UPDT_NAM between", value1, value2, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotBetween(String value1, String value2) {
            addCriterion("UPDT_NAM not between", value1, value2, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2IsNull() {
            addCriterion("UPDT_DAT2 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2IsNotNull() {
            addCriterion("UPDT_DAT2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2EqualTo(Date value) {
            addCriterion("UPDT_DAT2 =", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2NotEqualTo(Date value) {
            addCriterion("UPDT_DAT2 <>", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2GreaterThan(Date value) {
            addCriterion("UPDT_DAT2 >", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2GreaterThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT2 >=", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2LessThan(Date value) {
            addCriterion("UPDT_DAT2 <", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2LessThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT2 <=", value, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2In(List<Date> values) {
            addCriterion("UPDT_DAT2 in", values, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2NotIn(List<Date> values) {
            addCriterion("UPDT_DAT2 not in", values, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2Between(Date value1, Date value2) {
            addCriterion("UPDT_DAT2 between", value1, value2, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat2NotBetween(Date value1, Date value2) {
            addCriterion("UPDT_DAT2 not between", value1, value2, "updtDat2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2IsNull() {
            addCriterion("UPDT_NBR2 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2IsNotNull() {
            addCriterion("UPDT_NBR2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2EqualTo(String value) {
            addCriterion("UPDT_NBR2 =", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2NotEqualTo(String value) {
            addCriterion("UPDT_NBR2 <>", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2GreaterThan(String value) {
            addCriterion("UPDT_NBR2 >", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2GreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR2 >=", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2LessThan(String value) {
            addCriterion("UPDT_NBR2 <", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2LessThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR2 <=", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2Like(String value) {
            addCriterion("UPDT_NBR2 like", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2NotLike(String value) {
            addCriterion("UPDT_NBR2 not like", value, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2In(List<String> values) {
            addCriterion("UPDT_NBR2 in", values, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2NotIn(List<String> values) {
            addCriterion("UPDT_NBR2 not in", values, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2Between(String value1, String value2) {
            addCriterion("UPDT_NBR2 between", value1, value2, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr2NotBetween(String value1, String value2) {
            addCriterion("UPDT_NBR2 not between", value1, value2, "updtNbr2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2IsNull() {
            addCriterion("UPDT_NAM2 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2IsNotNull() {
            addCriterion("UPDT_NAM2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2EqualTo(String value) {
            addCriterion("UPDT_NAM2 =", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2NotEqualTo(String value) {
            addCriterion("UPDT_NAM2 <>", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2GreaterThan(String value) {
            addCriterion("UPDT_NAM2 >", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2GreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM2 >=", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2LessThan(String value) {
            addCriterion("UPDT_NAM2 <", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2LessThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM2 <=", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2Like(String value) {
            addCriterion("UPDT_NAM2 like", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2NotLike(String value) {
            addCriterion("UPDT_NAM2 not like", value, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2In(List<String> values) {
            addCriterion("UPDT_NAM2 in", values, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2NotIn(List<String> values) {
            addCriterion("UPDT_NAM2 not in", values, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2Between(String value1, String value2) {
            addCriterion("UPDT_NAM2 between", value1, value2, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtNam2NotBetween(String value1, String value2) {
            addCriterion("UPDT_NAM2 not between", value1, value2, "updtNam2");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3IsNull() {
            addCriterion("UPDT_DAT3 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3IsNotNull() {
            addCriterion("UPDT_DAT3 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3EqualTo(Date value) {
            addCriterion("UPDT_DAT3 =", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3NotEqualTo(Date value) {
            addCriterion("UPDT_DAT3 <>", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3GreaterThan(Date value) {
            addCriterion("UPDT_DAT3 >", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3GreaterThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT3 >=", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3LessThan(Date value) {
            addCriterion("UPDT_DAT3 <", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3LessThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT3 <=", value, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3In(List<Date> values) {
            addCriterion("UPDT_DAT3 in", values, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3NotIn(List<Date> values) {
            addCriterion("UPDT_DAT3 not in", values, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3Between(Date value1, Date value2) {
            addCriterion("UPDT_DAT3 between", value1, value2, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtDat3NotBetween(Date value1, Date value2) {
            addCriterion("UPDT_DAT3 not between", value1, value2, "updtDat3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3IsNull() {
            addCriterion("UPDT_NBR3 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3IsNotNull() {
            addCriterion("UPDT_NBR3 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3EqualTo(String value) {
            addCriterion("UPDT_NBR3 =", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3NotEqualTo(String value) {
            addCriterion("UPDT_NBR3 <>", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3GreaterThan(String value) {
            addCriterion("UPDT_NBR3 >", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3GreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR3 >=", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3LessThan(String value) {
            addCriterion("UPDT_NBR3 <", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3LessThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR3 <=", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3Like(String value) {
            addCriterion("UPDT_NBR3 like", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3NotLike(String value) {
            addCriterion("UPDT_NBR3 not like", value, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3In(List<String> values) {
            addCriterion("UPDT_NBR3 in", values, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3NotIn(List<String> values) {
            addCriterion("UPDT_NBR3 not in", values, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3Between(String value1, String value2) {
            addCriterion("UPDT_NBR3 between", value1, value2, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNbr3NotBetween(String value1, String value2) {
            addCriterion("UPDT_NBR3 not between", value1, value2, "updtNbr3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3IsNull() {
            addCriterion("UPDT_NAM3 is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3IsNotNull() {
            addCriterion("UPDT_NAM3 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3EqualTo(String value) {
            addCriterion("UPDT_NAM3 =", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3NotEqualTo(String value) {
            addCriterion("UPDT_NAM3 <>", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3GreaterThan(String value) {
            addCriterion("UPDT_NAM3 >", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3GreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM3 >=", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3LessThan(String value) {
            addCriterion("UPDT_NAM3 <", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3LessThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM3 <=", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3Like(String value) {
            addCriterion("UPDT_NAM3 like", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3NotLike(String value) {
            addCriterion("UPDT_NAM3 not like", value, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3In(List<String> values) {
            addCriterion("UPDT_NAM3 in", values, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3NotIn(List<String> values) {
            addCriterion("UPDT_NAM3 not in", values, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3Between(String value1, String value2) {
            addCriterion("UPDT_NAM3 between", value1, value2, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andUpdtNam3NotBetween(String value1, String value2) {
            addCriterion("UPDT_NAM3 not between", value1, value2, "updtNam3");
            return (Criteria) this;
        }

        public Criteria andOprtDatIsNull() {
            addCriterion("OPRT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andOprtDatIsNotNull() {
            addCriterion("OPRT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andOprtDatEqualTo(Date value) {
            addCriterion("OPRT_DAT =", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotEqualTo(Date value) {
            addCriterion("OPRT_DAT <>", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatGreaterThan(Date value) {
            addCriterion("OPRT_DAT >", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("OPRT_DAT >=", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatLessThan(Date value) {
            addCriterion("OPRT_DAT <", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatLessThanOrEqualTo(Date value) {
            addCriterion("OPRT_DAT <=", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatIn(List<Date> values) {
            addCriterion("OPRT_DAT in", values, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotIn(List<Date> values) {
            addCriterion("OPRT_DAT not in", values, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatBetween(Date value1, Date value2) {
            addCriterion("OPRT_DAT between", value1, value2, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotBetween(Date value1, Date value2) {
            addCriterion("OPRT_DAT not between", value1, value2, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andObsvtZgIsNull() {
            addCriterion("OBSVT_ZG is null");
            return (Criteria) this;
        }

        public Criteria andObsvtZgIsNotNull() {
            addCriterion("OBSVT_ZG is not null");
            return (Criteria) this;
        }

        public Criteria andObsvtZgEqualTo(String value) {
            addCriterion("OBSVT_ZG =", value, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtZgNotEqualTo(String value) {
            addCriterion("OBSVT_ZG <>", value, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtZgGreaterThan(String value) {
            addCriterion("OBSVT_ZG >", value, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtZgGreaterThanOrEqualTo(String value) {
            addCriterion("OBSVT_ZG >=", value, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtZgLessThan(String value) {
            addCriterion("OBSVT_ZG <", value, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtZgLessThanOrEqualTo(String value) {
            addCriterion("OBSVT_ZG <=", value, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtZgLike(String value) {
            addCriterion("OBSVT_ZG like", value, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtZgNotLike(String value) {
            addCriterion("OBSVT_ZG not like", value, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtZgIn(List<String> values) {
            addCriterion("OBSVT_ZG in", values, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtZgNotIn(List<String> values) {
            addCriterion("OBSVT_ZG not in", values, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtZgBetween(String value1, String value2) {
            addCriterion("OBSVT_ZG between", value1, value2, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtZgNotBetween(String value1, String value2) {
            addCriterion("OBSVT_ZG not between", value1, value2, "obsvtZg");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeIsNull() {
            addCriterion("OBSVT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeIsNotNull() {
            addCriterion("OBSVT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeEqualTo(String value) {
            addCriterion("OBSVT_TYPE =", value, "obsvtType");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeNotEqualTo(String value) {
            addCriterion("OBSVT_TYPE <>", value, "obsvtType");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeGreaterThan(String value) {
            addCriterion("OBSVT_TYPE >", value, "obsvtType");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBSVT_TYPE >=", value, "obsvtType");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeLessThan(String value) {
            addCriterion("OBSVT_TYPE <", value, "obsvtType");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeLessThanOrEqualTo(String value) {
            addCriterion("OBSVT_TYPE <=", value, "obsvtType");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeLike(String value) {
            addCriterion("OBSVT_TYPE like", value, "obsvtType");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeNotLike(String value) {
            addCriterion("OBSVT_TYPE not like", value, "obsvtType");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeIn(List<String> values) {
            addCriterion("OBSVT_TYPE in", values, "obsvtType");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeNotIn(List<String> values) {
            addCriterion("OBSVT_TYPE not in", values, "obsvtType");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeBetween(String value1, String value2) {
            addCriterion("OBSVT_TYPE between", value1, value2, "obsvtType");
            return (Criteria) this;
        }

        public Criteria andObsvtTypeNotBetween(String value1, String value2) {
            addCriterion("OBSVT_TYPE not between", value1, value2, "obsvtType");
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