package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspFrbrInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspFrbrInfExample() {
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

        public Criteria andMpiIsNull() {
            addCriterion("MPI is null");
            return (Criteria) this;
        }

        public Criteria andMpiIsNotNull() {
            addCriterion("MPI is not null");
            return (Criteria) this;
        }

        public Criteria andMpiEqualTo(String value) {
            addCriterion("MPI =", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotEqualTo(String value) {
            addCriterion("MPI <>", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiGreaterThan(String value) {
            addCriterion("MPI >", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiGreaterThanOrEqualTo(String value) {
            addCriterion("MPI >=", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLessThan(String value) {
            addCriterion("MPI <", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLessThanOrEqualTo(String value) {
            addCriterion("MPI <=", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLike(String value) {
            addCriterion("MPI like", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotLike(String value) {
            addCriterion("MPI not like", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiIn(List<String> values) {
            addCriterion("MPI in", values, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotIn(List<String> values) {
            addCriterion("MPI not in", values, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiBetween(String value1, String value2) {
            addCriterion("MPI between", value1, value2, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotBetween(String value1, String value2) {
            addCriterion("MPI not between", value1, value2, "mpi");
            return (Criteria) this;
        }

        public Criteria andFrDatIsNull() {
            addCriterion("FR_DAT is null");
            return (Criteria) this;
        }

        public Criteria andFrDatIsNotNull() {
            addCriterion("FR_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andFrDatEqualTo(Date value) {
            addCriterion("FR_DAT =", value, "frDat");
            return (Criteria) this;
        }

        public Criteria andFrDatNotEqualTo(Date value) {
            addCriterion("FR_DAT <>", value, "frDat");
            return (Criteria) this;
        }

        public Criteria andFrDatGreaterThan(Date value) {
            addCriterion("FR_DAT >", value, "frDat");
            return (Criteria) this;
        }

        public Criteria andFrDatGreaterThanOrEqualTo(Date value) {
            addCriterion("FR_DAT >=", value, "frDat");
            return (Criteria) this;
        }

        public Criteria andFrDatLessThan(Date value) {
            addCriterion("FR_DAT <", value, "frDat");
            return (Criteria) this;
        }

        public Criteria andFrDatLessThanOrEqualTo(Date value) {
            addCriterion("FR_DAT <=", value, "frDat");
            return (Criteria) this;
        }

        public Criteria andFrDatIn(List<Date> values) {
            addCriterion("FR_DAT in", values, "frDat");
            return (Criteria) this;
        }

        public Criteria andFrDatNotIn(List<Date> values) {
            addCriterion("FR_DAT not in", values, "frDat");
            return (Criteria) this;
        }

        public Criteria andFrDatBetween(Date value1, Date value2) {
            addCriterion("FR_DAT between", value1, value2, "frDat");
            return (Criteria) this;
        }

        public Criteria andFrDatNotBetween(Date value1, Date value2) {
            addCriterion("FR_DAT not between", value1, value2, "frDat");
            return (Criteria) this;
        }

        public Criteria andCstNamIsNull() {
            addCriterion("CST_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCstNamIsNotNull() {
            addCriterion("CST_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCstNamEqualTo(String value) {
            addCriterion("CST_NAM =", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamNotEqualTo(String value) {
            addCriterion("CST_NAM <>", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamGreaterThan(String value) {
            addCriterion("CST_NAM >", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamGreaterThanOrEqualTo(String value) {
            addCriterion("CST_NAM >=", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamLessThan(String value) {
            addCriterion("CST_NAM <", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamLessThanOrEqualTo(String value) {
            addCriterion("CST_NAM <=", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamLike(String value) {
            addCriterion("CST_NAM like", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamNotLike(String value) {
            addCriterion("CST_NAM not like", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamIn(List<String> values) {
            addCriterion("CST_NAM in", values, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamNotIn(List<String> values) {
            addCriterion("CST_NAM not in", values, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamBetween(String value1, String value2) {
            addCriterion("CST_NAM between", value1, value2, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamNotBetween(String value1, String value2) {
            addCriterion("CST_NAM not between", value1, value2, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstAgeIsNull() {
            addCriterion("CST_AGE is null");
            return (Criteria) this;
        }

        public Criteria andCstAgeIsNotNull() {
            addCriterion("CST_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andCstAgeEqualTo(String value) {
            addCriterion("CST_AGE =", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeNotEqualTo(String value) {
            addCriterion("CST_AGE <>", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeGreaterThan(String value) {
            addCriterion("CST_AGE >", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeGreaterThanOrEqualTo(String value) {
            addCriterion("CST_AGE >=", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeLessThan(String value) {
            addCriterion("CST_AGE <", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeLessThanOrEqualTo(String value) {
            addCriterion("CST_AGE <=", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeLike(String value) {
            addCriterion("CST_AGE like", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeNotLike(String value) {
            addCriterion("CST_AGE not like", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeIn(List<String> values) {
            addCriterion("CST_AGE in", values, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeNotIn(List<String> values) {
            addCriterion("CST_AGE not in", values, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeBetween(String value1, String value2) {
            addCriterion("CST_AGE between", value1, value2, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeNotBetween(String value1, String value2) {
            addCriterion("CST_AGE not between", value1, value2, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodIsNull() {
            addCriterion("CST_AGE_COD is null");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodIsNotNull() {
            addCriterion("CST_AGE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodEqualTo(String value) {
            addCriterion("CST_AGE_COD =", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodNotEqualTo(String value) {
            addCriterion("CST_AGE_COD <>", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodGreaterThan(String value) {
            addCriterion("CST_AGE_COD >", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodGreaterThanOrEqualTo(String value) {
            addCriterion("CST_AGE_COD >=", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodLessThan(String value) {
            addCriterion("CST_AGE_COD <", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodLessThanOrEqualTo(String value) {
            addCriterion("CST_AGE_COD <=", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodLike(String value) {
            addCriterion("CST_AGE_COD like", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodNotLike(String value) {
            addCriterion("CST_AGE_COD not like", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodIn(List<String> values) {
            addCriterion("CST_AGE_COD in", values, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodNotIn(List<String> values) {
            addCriterion("CST_AGE_COD not in", values, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodBetween(String value1, String value2) {
            addCriterion("CST_AGE_COD between", value1, value2, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodNotBetween(String value1, String value2) {
            addCriterion("CST_AGE_COD not between", value1, value2, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("NATIONALITY is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("NATIONALITY is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("NATIONALITY =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("NATIONALITY <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("NATIONALITY >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONALITY >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("NATIONALITY <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("NATIONALITY <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("NATIONALITY like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("NATIONALITY not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("NATIONALITY in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("NATIONALITY not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("NATIONALITY between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("NATIONALITY not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andGzdwIsNull() {
            addCriterion("GZDW is null");
            return (Criteria) this;
        }

        public Criteria andGzdwIsNotNull() {
            addCriterion("GZDW is not null");
            return (Criteria) this;
        }

        public Criteria andGzdwEqualTo(String value) {
            addCriterion("GZDW =", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotEqualTo(String value) {
            addCriterion("GZDW <>", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwGreaterThan(String value) {
            addCriterion("GZDW >", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwGreaterThanOrEqualTo(String value) {
            addCriterion("GZDW >=", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwLessThan(String value) {
            addCriterion("GZDW <", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwLessThanOrEqualTo(String value) {
            addCriterion("GZDW <=", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwLike(String value) {
            addCriterion("GZDW like", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotLike(String value) {
            addCriterion("GZDW not like", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwIn(List<String> values) {
            addCriterion("GZDW in", values, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotIn(List<String> values) {
            addCriterion("GZDW not in", values, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwBetween(String value1, String value2) {
            addCriterion("GZDW between", value1, value2, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotBetween(String value1, String value2) {
            addCriterion("GZDW not between", value1, value2, "gzdw");
            return (Criteria) this;
        }

        public Criteria andCstAdrIsNull() {
            addCriterion("CST_ADR is null");
            return (Criteria) this;
        }

        public Criteria andCstAdrIsNotNull() {
            addCriterion("CST_ADR is not null");
            return (Criteria) this;
        }

        public Criteria andCstAdrEqualTo(String value) {
            addCriterion("CST_ADR =", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotEqualTo(String value) {
            addCriterion("CST_ADR <>", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrGreaterThan(String value) {
            addCriterion("CST_ADR >", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrGreaterThanOrEqualTo(String value) {
            addCriterion("CST_ADR >=", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrLessThan(String value) {
            addCriterion("CST_ADR <", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrLessThanOrEqualTo(String value) {
            addCriterion("CST_ADR <=", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrLike(String value) {
            addCriterion("CST_ADR like", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotLike(String value) {
            addCriterion("CST_ADR not like", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrIn(List<String> values) {
            addCriterion("CST_ADR in", values, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotIn(List<String> values) {
            addCriterion("CST_ADR not in", values, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrBetween(String value1, String value2) {
            addCriterion("CST_ADR between", value1, value2, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotBetween(String value1, String value2) {
            addCriterion("CST_ADR not between", value1, value2, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andIdNbrIsNull() {
            addCriterion("ID_NBR is null");
            return (Criteria) this;
        }

        public Criteria andIdNbrIsNotNull() {
            addCriterion("ID_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andIdNbrEqualTo(String value) {
            addCriterion("ID_NBR =", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrNotEqualTo(String value) {
            addCriterion("ID_NBR <>", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrGreaterThan(String value) {
            addCriterion("ID_NBR >", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NBR >=", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrLessThan(String value) {
            addCriterion("ID_NBR <", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrLessThanOrEqualTo(String value) {
            addCriterion("ID_NBR <=", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrLike(String value) {
            addCriterion("ID_NBR like", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrNotLike(String value) {
            addCriterion("ID_NBR not like", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrIn(List<String> values) {
            addCriterion("ID_NBR in", values, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrNotIn(List<String> values) {
            addCriterion("ID_NBR not in", values, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrBetween(String value1, String value2) {
            addCriterion("ID_NBR between", value1, value2, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrNotBetween(String value1, String value2) {
            addCriterion("ID_NBR not between", value1, value2, "idNbr");
            return (Criteria) this;
        }

        public Criteria andCstSexCodIsNull() {
            addCriterion("CST_SEX_COD is null");
            return (Criteria) this;
        }

        public Criteria andCstSexCodIsNotNull() {
            addCriterion("CST_SEX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCstSexCodEqualTo(String value) {
            addCriterion("CST_SEX_COD =", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodNotEqualTo(String value) {
            addCriterion("CST_SEX_COD <>", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodGreaterThan(String value) {
            addCriterion("CST_SEX_COD >", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodGreaterThanOrEqualTo(String value) {
            addCriterion("CST_SEX_COD >=", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodLessThan(String value) {
            addCriterion("CST_SEX_COD <", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodLessThanOrEqualTo(String value) {
            addCriterion("CST_SEX_COD <=", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodLike(String value) {
            addCriterion("CST_SEX_COD like", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodNotLike(String value) {
            addCriterion("CST_SEX_COD not like", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodIn(List<String> values) {
            addCriterion("CST_SEX_COD in", values, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodNotIn(List<String> values) {
            addCriterion("CST_SEX_COD not in", values, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodBetween(String value1, String value2) {
            addCriterion("CST_SEX_COD between", value1, value2, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodNotBetween(String value1, String value2) {
            addCriterion("CST_SEX_COD not between", value1, value2, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andContactDesIsNull() {
            addCriterion("CONTACT_DES is null");
            return (Criteria) this;
        }

        public Criteria andContactDesIsNotNull() {
            addCriterion("CONTACT_DES is not null");
            return (Criteria) this;
        }

        public Criteria andContactDesEqualTo(String value) {
            addCriterion("CONTACT_DES =", value, "contactDes");
            return (Criteria) this;
        }

        public Criteria andContactDesNotEqualTo(String value) {
            addCriterion("CONTACT_DES <>", value, "contactDes");
            return (Criteria) this;
        }

        public Criteria andContactDesGreaterThan(String value) {
            addCriterion("CONTACT_DES >", value, "contactDes");
            return (Criteria) this;
        }

        public Criteria andContactDesGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_DES >=", value, "contactDes");
            return (Criteria) this;
        }

        public Criteria andContactDesLessThan(String value) {
            addCriterion("CONTACT_DES <", value, "contactDes");
            return (Criteria) this;
        }

        public Criteria andContactDesLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_DES <=", value, "contactDes");
            return (Criteria) this;
        }

        public Criteria andContactDesLike(String value) {
            addCriterion("CONTACT_DES like", value, "contactDes");
            return (Criteria) this;
        }

        public Criteria andContactDesNotLike(String value) {
            addCriterion("CONTACT_DES not like", value, "contactDes");
            return (Criteria) this;
        }

        public Criteria andContactDesIn(List<String> values) {
            addCriterion("CONTACT_DES in", values, "contactDes");
            return (Criteria) this;
        }

        public Criteria andContactDesNotIn(List<String> values) {
            addCriterion("CONTACT_DES not in", values, "contactDes");
            return (Criteria) this;
        }

        public Criteria andContactDesBetween(String value1, String value2) {
            addCriterion("CONTACT_DES between", value1, value2, "contactDes");
            return (Criteria) this;
        }

        public Criteria andContactDesNotBetween(String value1, String value2) {
            addCriterion("CONTACT_DES not between", value1, value2, "contactDes");
            return (Criteria) this;
        }

        public Criteria andFrCodIsNull() {
            addCriterion("FR_COD is null");
            return (Criteria) this;
        }

        public Criteria andFrCodIsNotNull() {
            addCriterion("FR_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFrCodEqualTo(String value) {
            addCriterion("FR_COD =", value, "frCod");
            return (Criteria) this;
        }

        public Criteria andFrCodNotEqualTo(String value) {
            addCriterion("FR_COD <>", value, "frCod");
            return (Criteria) this;
        }

        public Criteria andFrCodGreaterThan(String value) {
            addCriterion("FR_COD >", value, "frCod");
            return (Criteria) this;
        }

        public Criteria andFrCodGreaterThanOrEqualTo(String value) {
            addCriterion("FR_COD >=", value, "frCod");
            return (Criteria) this;
        }

        public Criteria andFrCodLessThan(String value) {
            addCriterion("FR_COD <", value, "frCod");
            return (Criteria) this;
        }

        public Criteria andFrCodLessThanOrEqualTo(String value) {
            addCriterion("FR_COD <=", value, "frCod");
            return (Criteria) this;
        }

        public Criteria andFrCodLike(String value) {
            addCriterion("FR_COD like", value, "frCod");
            return (Criteria) this;
        }

        public Criteria andFrCodNotLike(String value) {
            addCriterion("FR_COD not like", value, "frCod");
            return (Criteria) this;
        }

        public Criteria andFrCodIn(List<String> values) {
            addCriterion("FR_COD in", values, "frCod");
            return (Criteria) this;
        }

        public Criteria andFrCodNotIn(List<String> values) {
            addCriterion("FR_COD not in", values, "frCod");
            return (Criteria) this;
        }

        public Criteria andFrCodBetween(String value1, String value2) {
            addCriterion("FR_COD between", value1, value2, "frCod");
            return (Criteria) this;
        }

        public Criteria andFrCodNotBetween(String value1, String value2) {
            addCriterion("FR_COD not between", value1, value2, "frCod");
            return (Criteria) this;
        }

        public Criteria andDghdIsNull() {
            addCriterion("DGHD is null");
            return (Criteria) this;
        }

        public Criteria andDghdIsNotNull() {
            addCriterion("DGHD is not null");
            return (Criteria) this;
        }

        public Criteria andDghdEqualTo(String value) {
            addCriterion("DGHD =", value, "dghd");
            return (Criteria) this;
        }

        public Criteria andDghdNotEqualTo(String value) {
            addCriterion("DGHD <>", value, "dghd");
            return (Criteria) this;
        }

        public Criteria andDghdGreaterThan(String value) {
            addCriterion("DGHD >", value, "dghd");
            return (Criteria) this;
        }

        public Criteria andDghdGreaterThanOrEqualTo(String value) {
            addCriterion("DGHD >=", value, "dghd");
            return (Criteria) this;
        }

        public Criteria andDghdLessThan(String value) {
            addCriterion("DGHD <", value, "dghd");
            return (Criteria) this;
        }

        public Criteria andDghdLessThanOrEqualTo(String value) {
            addCriterion("DGHD <=", value, "dghd");
            return (Criteria) this;
        }

        public Criteria andDghdLike(String value) {
            addCriterion("DGHD like", value, "dghd");
            return (Criteria) this;
        }

        public Criteria andDghdNotLike(String value) {
            addCriterion("DGHD not like", value, "dghd");
            return (Criteria) this;
        }

        public Criteria andDghdIn(List<String> values) {
            addCriterion("DGHD in", values, "dghd");
            return (Criteria) this;
        }

        public Criteria andDghdNotIn(List<String> values) {
            addCriterion("DGHD not in", values, "dghd");
            return (Criteria) this;
        }

        public Criteria andDghdBetween(String value1, String value2) {
            addCriterion("DGHD between", value1, value2, "dghd");
            return (Criteria) this;
        }

        public Criteria andDghdNotBetween(String value1, String value2) {
            addCriterion("DGHD not between", value1, value2, "dghd");
            return (Criteria) this;
        }

        public Criteria andGgcsIsNull() {
            addCriterion("GGCS is null");
            return (Criteria) this;
        }

        public Criteria andGgcsIsNotNull() {
            addCriterion("GGCS is not null");
            return (Criteria) this;
        }

        public Criteria andGgcsEqualTo(String value) {
            addCriterion("GGCS =", value, "ggcs");
            return (Criteria) this;
        }

        public Criteria andGgcsNotEqualTo(String value) {
            addCriterion("GGCS <>", value, "ggcs");
            return (Criteria) this;
        }

        public Criteria andGgcsGreaterThan(String value) {
            addCriterion("GGCS >", value, "ggcs");
            return (Criteria) this;
        }

        public Criteria andGgcsGreaterThanOrEqualTo(String value) {
            addCriterion("GGCS >=", value, "ggcs");
            return (Criteria) this;
        }

        public Criteria andGgcsLessThan(String value) {
            addCriterion("GGCS <", value, "ggcs");
            return (Criteria) this;
        }

        public Criteria andGgcsLessThanOrEqualTo(String value) {
            addCriterion("GGCS <=", value, "ggcs");
            return (Criteria) this;
        }

        public Criteria andGgcsLike(String value) {
            addCriterion("GGCS like", value, "ggcs");
            return (Criteria) this;
        }

        public Criteria andGgcsNotLike(String value) {
            addCriterion("GGCS not like", value, "ggcs");
            return (Criteria) this;
        }

        public Criteria andGgcsIn(List<String> values) {
            addCriterion("GGCS in", values, "ggcs");
            return (Criteria) this;
        }

        public Criteria andGgcsNotIn(List<String> values) {
            addCriterion("GGCS not in", values, "ggcs");
            return (Criteria) this;
        }

        public Criteria andGgcsBetween(String value1, String value2) {
            addCriterion("GGCS between", value1, value2, "ggcs");
            return (Criteria) this;
        }

        public Criteria andGgcsNotBetween(String value1, String value2) {
            addCriterion("GGCS not between", value1, value2, "ggcs");
            return (Criteria) this;
        }

        public Criteria andJtgjIsNull() {
            addCriterion("JTGJ is null");
            return (Criteria) this;
        }

        public Criteria andJtgjIsNotNull() {
            addCriterion("JTGJ is not null");
            return (Criteria) this;
        }

        public Criteria andJtgjEqualTo(String value) {
            addCriterion("JTGJ =", value, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJtgjNotEqualTo(String value) {
            addCriterion("JTGJ <>", value, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJtgjGreaterThan(String value) {
            addCriterion("JTGJ >", value, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJtgjGreaterThanOrEqualTo(String value) {
            addCriterion("JTGJ >=", value, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJtgjLessThan(String value) {
            addCriterion("JTGJ <", value, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJtgjLessThanOrEqualTo(String value) {
            addCriterion("JTGJ <=", value, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJtgjLike(String value) {
            addCriterion("JTGJ like", value, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJtgjNotLike(String value) {
            addCriterion("JTGJ not like", value, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJtgjIn(List<String> values) {
            addCriterion("JTGJ in", values, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJtgjNotIn(List<String> values) {
            addCriterion("JTGJ not in", values, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJtgjBetween(String value1, String value2) {
            addCriterion("JTGJ between", value1, value2, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJtgjNotBetween(String value1, String value2) {
            addCriterion("JTGJ not between", value1, value2, "jtgj");
            return (Criteria) this;
        }

        public Criteria andJcdwIsNull() {
            addCriterion("JCDW is null");
            return (Criteria) this;
        }

        public Criteria andJcdwIsNotNull() {
            addCriterion("JCDW is not null");
            return (Criteria) this;
        }

        public Criteria andJcdwEqualTo(String value) {
            addCriterion("JCDW =", value, "jcdw");
            return (Criteria) this;
        }

        public Criteria andJcdwNotEqualTo(String value) {
            addCriterion("JCDW <>", value, "jcdw");
            return (Criteria) this;
        }

        public Criteria andJcdwGreaterThan(String value) {
            addCriterion("JCDW >", value, "jcdw");
            return (Criteria) this;
        }

        public Criteria andJcdwGreaterThanOrEqualTo(String value) {
            addCriterion("JCDW >=", value, "jcdw");
            return (Criteria) this;
        }

        public Criteria andJcdwLessThan(String value) {
            addCriterion("JCDW <", value, "jcdw");
            return (Criteria) this;
        }

        public Criteria andJcdwLessThanOrEqualTo(String value) {
            addCriterion("JCDW <=", value, "jcdw");
            return (Criteria) this;
        }

        public Criteria andJcdwLike(String value) {
            addCriterion("JCDW like", value, "jcdw");
            return (Criteria) this;
        }

        public Criteria andJcdwNotLike(String value) {
            addCriterion("JCDW not like", value, "jcdw");
            return (Criteria) this;
        }

        public Criteria andJcdwIn(List<String> values) {
            addCriterion("JCDW in", values, "jcdw");
            return (Criteria) this;
        }

        public Criteria andJcdwNotIn(List<String> values) {
            addCriterion("JCDW not in", values, "jcdw");
            return (Criteria) this;
        }

        public Criteria andJcdwBetween(String value1, String value2) {
            addCriterion("JCDW between", value1, value2, "jcdw");
            return (Criteria) this;
        }

        public Criteria andJcdwNotBetween(String value1, String value2) {
            addCriterion("JCDW not between", value1, value2, "jcdw");
            return (Criteria) this;
        }

        public Criteria andTmpNbrIsNull() {
            addCriterion("TMP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andTmpNbrIsNotNull() {
            addCriterion("TMP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andTmpNbrEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR =", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR <>", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrGreaterThan(BigDecimal value) {
            addCriterion("TMP_NBR >", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR >=", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLessThan(BigDecimal value) {
            addCriterion("TMP_NBR <", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TMP_NBR <=", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrIn(List<BigDecimal> values) {
            addCriterion("TMP_NBR in", values, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotIn(List<BigDecimal> values) {
            addCriterion("TMP_NBR not in", values, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TMP_NBR between", value1, value2, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TMP_NBR not between", value1, value2, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andBrqxIsNull() {
            addCriterion("BRQX is null");
            return (Criteria) this;
        }

        public Criteria andBrqxIsNotNull() {
            addCriterion("BRQX is not null");
            return (Criteria) this;
        }

        public Criteria andBrqxEqualTo(String value) {
            addCriterion("BRQX =", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxNotEqualTo(String value) {
            addCriterion("BRQX <>", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxGreaterThan(String value) {
            addCriterion("BRQX >", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxGreaterThanOrEqualTo(String value) {
            addCriterion("BRQX >=", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxLessThan(String value) {
            addCriterion("BRQX <", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxLessThanOrEqualTo(String value) {
            addCriterion("BRQX <=", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxLike(String value) {
            addCriterion("BRQX like", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxNotLike(String value) {
            addCriterion("BRQX not like", value, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxIn(List<String> values) {
            addCriterion("BRQX in", values, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxNotIn(List<String> values) {
            addCriterion("BRQX not in", values, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxBetween(String value1, String value2) {
            addCriterion("BRQX between", value1, value2, "brqx");
            return (Criteria) this;
        }

        public Criteria andBrqxNotBetween(String value1, String value2) {
            addCriterion("BRQX not between", value1, value2, "brqx");
            return (Criteria) this;
        }

        public Criteria andNycCodIsNull() {
            addCriterion("NYC_COD is null");
            return (Criteria) this;
        }

        public Criteria andNycCodIsNotNull() {
            addCriterion("NYC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andNycCodEqualTo(String value) {
            addCriterion("NYC_COD =", value, "nycCod");
            return (Criteria) this;
        }

        public Criteria andNycCodNotEqualTo(String value) {
            addCriterion("NYC_COD <>", value, "nycCod");
            return (Criteria) this;
        }

        public Criteria andNycCodGreaterThan(String value) {
            addCriterion("NYC_COD >", value, "nycCod");
            return (Criteria) this;
        }

        public Criteria andNycCodGreaterThanOrEqualTo(String value) {
            addCriterion("NYC_COD >=", value, "nycCod");
            return (Criteria) this;
        }

        public Criteria andNycCodLessThan(String value) {
            addCriterion("NYC_COD <", value, "nycCod");
            return (Criteria) this;
        }

        public Criteria andNycCodLessThanOrEqualTo(String value) {
            addCriterion("NYC_COD <=", value, "nycCod");
            return (Criteria) this;
        }

        public Criteria andNycCodLike(String value) {
            addCriterion("NYC_COD like", value, "nycCod");
            return (Criteria) this;
        }

        public Criteria andNycCodNotLike(String value) {
            addCriterion("NYC_COD not like", value, "nycCod");
            return (Criteria) this;
        }

        public Criteria andNycCodIn(List<String> values) {
            addCriterion("NYC_COD in", values, "nycCod");
            return (Criteria) this;
        }

        public Criteria andNycCodNotIn(List<String> values) {
            addCriterion("NYC_COD not in", values, "nycCod");
            return (Criteria) this;
        }

        public Criteria andNycCodBetween(String value1, String value2) {
            addCriterion("NYC_COD between", value1, value2, "nycCod");
            return (Criteria) this;
        }

        public Criteria andNycCodNotBetween(String value1, String value2) {
            addCriterion("NYC_COD not between", value1, value2, "nycCod");
            return (Criteria) this;
        }

        public Criteria andFdCodIsNull() {
            addCriterion("FD_COD is null");
            return (Criteria) this;
        }

        public Criteria andFdCodIsNotNull() {
            addCriterion("FD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFdCodEqualTo(String value) {
            addCriterion("FD_COD =", value, "fdCod");
            return (Criteria) this;
        }

        public Criteria andFdCodNotEqualTo(String value) {
            addCriterion("FD_COD <>", value, "fdCod");
            return (Criteria) this;
        }

        public Criteria andFdCodGreaterThan(String value) {
            addCriterion("FD_COD >", value, "fdCod");
            return (Criteria) this;
        }

        public Criteria andFdCodGreaterThanOrEqualTo(String value) {
            addCriterion("FD_COD >=", value, "fdCod");
            return (Criteria) this;
        }

        public Criteria andFdCodLessThan(String value) {
            addCriterion("FD_COD <", value, "fdCod");
            return (Criteria) this;
        }

        public Criteria andFdCodLessThanOrEqualTo(String value) {
            addCriterion("FD_COD <=", value, "fdCod");
            return (Criteria) this;
        }

        public Criteria andFdCodLike(String value) {
            addCriterion("FD_COD like", value, "fdCod");
            return (Criteria) this;
        }

        public Criteria andFdCodNotLike(String value) {
            addCriterion("FD_COD not like", value, "fdCod");
            return (Criteria) this;
        }

        public Criteria andFdCodIn(List<String> values) {
            addCriterion("FD_COD in", values, "fdCod");
            return (Criteria) this;
        }

        public Criteria andFdCodNotIn(List<String> values) {
            addCriterion("FD_COD not in", values, "fdCod");
            return (Criteria) this;
        }

        public Criteria andFdCodBetween(String value1, String value2) {
            addCriterion("FD_COD between", value1, value2, "fdCod");
            return (Criteria) this;
        }

        public Criteria andFdCodNotBetween(String value1, String value2) {
            addCriterion("FD_COD not between", value1, value2, "fdCod");
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

        public Criteria andCrtUsrNoIsNull() {
            addCriterion("CRT_USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoIsNotNull() {
            addCriterion("CRT_USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoEqualTo(String value) {
            addCriterion("CRT_USR_NO =", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotEqualTo(String value) {
            addCriterion("CRT_USR_NO <>", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoGreaterThan(String value) {
            addCriterion("CRT_USR_NO >", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NO >=", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLessThan(String value) {
            addCriterion("CRT_USR_NO <", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NO <=", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLike(String value) {
            addCriterion("CRT_USR_NO like", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotLike(String value) {
            addCriterion("CRT_USR_NO not like", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoIn(List<String> values) {
            addCriterion("CRT_USR_NO in", values, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotIn(List<String> values) {
            addCriterion("CRT_USR_NO not in", values, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoBetween(String value1, String value2) {
            addCriterion("CRT_USR_NO between", value1, value2, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_NO not between", value1, value2, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeIsNull() {
            addCriterion("CRT_USR_NME is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeIsNotNull() {
            addCriterion("CRT_USR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeEqualTo(String value) {
            addCriterion("CRT_USR_NME =", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotEqualTo(String value) {
            addCriterion("CRT_USR_NME <>", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeGreaterThan(String value) {
            addCriterion("CRT_USR_NME >", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NME >=", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLessThan(String value) {
            addCriterion("CRT_USR_NME <", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NME <=", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLike(String value) {
            addCriterion("CRT_USR_NME like", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotLike(String value) {
            addCriterion("CRT_USR_NME not like", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeIn(List<String> values) {
            addCriterion("CRT_USR_NME in", values, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotIn(List<String> values) {
            addCriterion("CRT_USR_NME not in", values, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeBetween(String value1, String value2) {
            addCriterion("CRT_USR_NME between", value1, value2, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_NME not between", value1, value2, "crtUsrNme");
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