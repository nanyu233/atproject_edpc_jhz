package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspSqlInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspSqlInfExample() {
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

        public Criteria andSqlSeqIsNull() {
            addCriterion("SQL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSqlSeqIsNotNull() {
            addCriterion("SQL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSqlSeqEqualTo(String value) {
            addCriterion("SQL_SEQ =", value, "sqlSeq");
            return (Criteria) this;
        }

        public Criteria andSqlSeqNotEqualTo(String value) {
            addCriterion("SQL_SEQ <>", value, "sqlSeq");
            return (Criteria) this;
        }

        public Criteria andSqlSeqGreaterThan(String value) {
            addCriterion("SQL_SEQ >", value, "sqlSeq");
            return (Criteria) this;
        }

        public Criteria andSqlSeqGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_SEQ >=", value, "sqlSeq");
            return (Criteria) this;
        }

        public Criteria andSqlSeqLessThan(String value) {
            addCriterion("SQL_SEQ <", value, "sqlSeq");
            return (Criteria) this;
        }

        public Criteria andSqlSeqLessThanOrEqualTo(String value) {
            addCriterion("SQL_SEQ <=", value, "sqlSeq");
            return (Criteria) this;
        }

        public Criteria andSqlSeqLike(String value) {
            addCriterion("SQL_SEQ like", value, "sqlSeq");
            return (Criteria) this;
        }

        public Criteria andSqlSeqNotLike(String value) {
            addCriterion("SQL_SEQ not like", value, "sqlSeq");
            return (Criteria) this;
        }

        public Criteria andSqlSeqIn(List<String> values) {
            addCriterion("SQL_SEQ in", values, "sqlSeq");
            return (Criteria) this;
        }

        public Criteria andSqlSeqNotIn(List<String> values) {
            addCriterion("SQL_SEQ not in", values, "sqlSeq");
            return (Criteria) this;
        }

        public Criteria andSqlSeqBetween(String value1, String value2) {
            addCriterion("SQL_SEQ between", value1, value2, "sqlSeq");
            return (Criteria) this;
        }

        public Criteria andSqlSeqNotBetween(String value1, String value2) {
            addCriterion("SQL_SEQ not between", value1, value2, "sqlSeq");
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

        public Criteria andRegDatIsNull() {
            addCriterion("REG_DAT is null");
            return (Criteria) this;
        }

        public Criteria andRegDatIsNotNull() {
            addCriterion("REG_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDatEqualTo(Date value) {
            addCriterion("REG_DAT =", value, "regDat");
            return (Criteria) this;
        }

        public Criteria andRegDatNotEqualTo(Date value) {
            addCriterion("REG_DAT <>", value, "regDat");
            return (Criteria) this;
        }

        public Criteria andRegDatGreaterThan(Date value) {
            addCriterion("REG_DAT >", value, "regDat");
            return (Criteria) this;
        }

        public Criteria andRegDatGreaterThanOrEqualTo(Date value) {
            addCriterion("REG_DAT >=", value, "regDat");
            return (Criteria) this;
        }

        public Criteria andRegDatLessThan(Date value) {
            addCriterion("REG_DAT <", value, "regDat");
            return (Criteria) this;
        }

        public Criteria andRegDatLessThanOrEqualTo(Date value) {
            addCriterion("REG_DAT <=", value, "regDat");
            return (Criteria) this;
        }

        public Criteria andRegDatIn(List<Date> values) {
            addCriterion("REG_DAT in", values, "regDat");
            return (Criteria) this;
        }

        public Criteria andRegDatNotIn(List<Date> values) {
            addCriterion("REG_DAT not in", values, "regDat");
            return (Criteria) this;
        }

        public Criteria andRegDatBetween(Date value1, Date value2) {
            addCriterion("REG_DAT between", value1, value2, "regDat");
            return (Criteria) this;
        }

        public Criteria andRegDatNotBetween(Date value1, Date value2) {
            addCriterion("REG_DAT not between", value1, value2, "regDat");
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

        public Criteria andSqlStaCodIsNull() {
            addCriterion("SQL_STA_COD is null");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodIsNotNull() {
            addCriterion("SQL_STA_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodEqualTo(String value) {
            addCriterion("SQL_STA_COD =", value, "sqlStaCod");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodNotEqualTo(String value) {
            addCriterion("SQL_STA_COD <>", value, "sqlStaCod");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodGreaterThan(String value) {
            addCriterion("SQL_STA_COD >", value, "sqlStaCod");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_STA_COD >=", value, "sqlStaCod");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodLessThan(String value) {
            addCriterion("SQL_STA_COD <", value, "sqlStaCod");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodLessThanOrEqualTo(String value) {
            addCriterion("SQL_STA_COD <=", value, "sqlStaCod");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodLike(String value) {
            addCriterion("SQL_STA_COD like", value, "sqlStaCod");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodNotLike(String value) {
            addCriterion("SQL_STA_COD not like", value, "sqlStaCod");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodIn(List<String> values) {
            addCriterion("SQL_STA_COD in", values, "sqlStaCod");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodNotIn(List<String> values) {
            addCriterion("SQL_STA_COD not in", values, "sqlStaCod");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodBetween(String value1, String value2) {
            addCriterion("SQL_STA_COD between", value1, value2, "sqlStaCod");
            return (Criteria) this;
        }

        public Criteria andSqlStaCodNotBetween(String value1, String value2) {
            addCriterion("SQL_STA_COD not between", value1, value2, "sqlStaCod");
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

        public Criteria andSqlDctNbrIsNull() {
            addCriterion("SQL_DCT_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrIsNotNull() {
            addCriterion("SQL_DCT_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrEqualTo(String value) {
            addCriterion("SQL_DCT_NBR =", value, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrNotEqualTo(String value) {
            addCriterion("SQL_DCT_NBR <>", value, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrGreaterThan(String value) {
            addCriterion("SQL_DCT_NBR >", value, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_DCT_NBR >=", value, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrLessThan(String value) {
            addCriterion("SQL_DCT_NBR <", value, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrLessThanOrEqualTo(String value) {
            addCriterion("SQL_DCT_NBR <=", value, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrLike(String value) {
            addCriterion("SQL_DCT_NBR like", value, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrNotLike(String value) {
            addCriterion("SQL_DCT_NBR not like", value, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrIn(List<String> values) {
            addCriterion("SQL_DCT_NBR in", values, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrNotIn(List<String> values) {
            addCriterion("SQL_DCT_NBR not in", values, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrBetween(String value1, String value2) {
            addCriterion("SQL_DCT_NBR between", value1, value2, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNbrNotBetween(String value1, String value2) {
            addCriterion("SQL_DCT_NBR not between", value1, value2, "sqlDctNbr");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamIsNull() {
            addCriterion("SQL_DCT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamIsNotNull() {
            addCriterion("SQL_DCT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamEqualTo(String value) {
            addCriterion("SQL_DCT_NAM =", value, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamNotEqualTo(String value) {
            addCriterion("SQL_DCT_NAM <>", value, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamGreaterThan(String value) {
            addCriterion("SQL_DCT_NAM >", value, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_DCT_NAM >=", value, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamLessThan(String value) {
            addCriterion("SQL_DCT_NAM <", value, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamLessThanOrEqualTo(String value) {
            addCriterion("SQL_DCT_NAM <=", value, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamLike(String value) {
            addCriterion("SQL_DCT_NAM like", value, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamNotLike(String value) {
            addCriterion("SQL_DCT_NAM not like", value, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamIn(List<String> values) {
            addCriterion("SQL_DCT_NAM in", values, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamNotIn(List<String> values) {
            addCriterion("SQL_DCT_NAM not in", values, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamBetween(String value1, String value2) {
            addCriterion("SQL_DCT_NAM between", value1, value2, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlDctNamNotBetween(String value1, String value2) {
            addCriterion("SQL_DCT_NAM not between", value1, value2, "sqlDctNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrIsNull() {
            addCriterion("SQL_NUR_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrIsNotNull() {
            addCriterion("SQL_NUR_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrEqualTo(String value) {
            addCriterion("SQL_NUR_NBR =", value, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrNotEqualTo(String value) {
            addCriterion("SQL_NUR_NBR <>", value, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrGreaterThan(String value) {
            addCriterion("SQL_NUR_NBR >", value, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_NUR_NBR >=", value, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrLessThan(String value) {
            addCriterion("SQL_NUR_NBR <", value, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrLessThanOrEqualTo(String value) {
            addCriterion("SQL_NUR_NBR <=", value, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrLike(String value) {
            addCriterion("SQL_NUR_NBR like", value, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrNotLike(String value) {
            addCriterion("SQL_NUR_NBR not like", value, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrIn(List<String> values) {
            addCriterion("SQL_NUR_NBR in", values, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrNotIn(List<String> values) {
            addCriterion("SQL_NUR_NBR not in", values, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrBetween(String value1, String value2) {
            addCriterion("SQL_NUR_NBR between", value1, value2, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNbrNotBetween(String value1, String value2) {
            addCriterion("SQL_NUR_NBR not between", value1, value2, "sqlNurNbr");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamIsNull() {
            addCriterion("SQL_NUR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamIsNotNull() {
            addCriterion("SQL_NUR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamEqualTo(String value) {
            addCriterion("SQL_NUR_NAM =", value, "sqlNurNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamNotEqualTo(String value) {
            addCriterion("SQL_NUR_NAM <>", value, "sqlNurNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamGreaterThan(String value) {
            addCriterion("SQL_NUR_NAM >", value, "sqlNurNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_NUR_NAM >=", value, "sqlNurNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamLessThan(String value) {
            addCriterion("SQL_NUR_NAM <", value, "sqlNurNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamLessThanOrEqualTo(String value) {
            addCriterion("SQL_NUR_NAM <=", value, "sqlNurNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamLike(String value) {
            addCriterion("SQL_NUR_NAM like", value, "sqlNurNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamNotLike(String value) {
            addCriterion("SQL_NUR_NAM not like", value, "sqlNurNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamIn(List<String> values) {
            addCriterion("SQL_NUR_NAM in", values, "sqlNurNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamNotIn(List<String> values) {
            addCriterion("SQL_NUR_NAM not in", values, "sqlNurNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamBetween(String value1, String value2) {
            addCriterion("SQL_NUR_NAM between", value1, value2, "sqlNurNam");
            return (Criteria) this;
        }

        public Criteria andSqlNurNamNotBetween(String value1, String value2) {
            addCriterion("SQL_NUR_NAM not between", value1, value2, "sqlNurNam");
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