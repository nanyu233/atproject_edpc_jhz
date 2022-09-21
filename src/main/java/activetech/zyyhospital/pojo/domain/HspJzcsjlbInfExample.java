package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspJzcsjlbInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJzcsjlbInfExample() {
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

        public Criteria andJzcsIdIsNull() {
            addCriterion("JZCS_ID is null");
            return (Criteria) this;
        }

        public Criteria andJzcsIdIsNotNull() {
            addCriterion("JZCS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJzcsIdEqualTo(String value) {
            addCriterion("JZCS_ID =", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdNotEqualTo(String value) {
            addCriterion("JZCS_ID <>", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdGreaterThan(String value) {
            addCriterion("JZCS_ID >", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdGreaterThanOrEqualTo(String value) {
            addCriterion("JZCS_ID >=", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdLessThan(String value) {
            addCriterion("JZCS_ID <", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdLessThanOrEqualTo(String value) {
            addCriterion("JZCS_ID <=", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdLike(String value) {
            addCriterion("JZCS_ID like", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdNotLike(String value) {
            addCriterion("JZCS_ID not like", value, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdIn(List<String> values) {
            addCriterion("JZCS_ID in", values, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdNotIn(List<String> values) {
            addCriterion("JZCS_ID not in", values, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdBetween(String value1, String value2) {
            addCriterion("JZCS_ID between", value1, value2, "jzcsId");
            return (Criteria) this;
        }

        public Criteria andJzcsIdNotBetween(String value1, String value2) {
            addCriterion("JZCS_ID not between", value1, value2, "jzcsId");
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

        public Criteria andEmgDatIsNull() {
            addCriterion("EMG_DAT is null");
            return (Criteria) this;
        }

        public Criteria andEmgDatIsNotNull() {
            addCriterion("EMG_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andEmgDatEqualTo(Date value) {
            addCriterion("EMG_DAT =", value, "emgDat");
            return (Criteria) this;
        }

        public Criteria andEmgDatNotEqualTo(Date value) {
            addCriterion("EMG_DAT <>", value, "emgDat");
            return (Criteria) this;
        }

        public Criteria andEmgDatGreaterThan(Date value) {
            addCriterion("EMG_DAT >", value, "emgDat");
            return (Criteria) this;
        }

        public Criteria andEmgDatGreaterThanOrEqualTo(Date value) {
            addCriterion("EMG_DAT >=", value, "emgDat");
            return (Criteria) this;
        }

        public Criteria andEmgDatLessThan(Date value) {
            addCriterion("EMG_DAT <", value, "emgDat");
            return (Criteria) this;
        }

        public Criteria andEmgDatLessThanOrEqualTo(Date value) {
            addCriterion("EMG_DAT <=", value, "emgDat");
            return (Criteria) this;
        }

        public Criteria andEmgDatIn(List<Date> values) {
            addCriterion("EMG_DAT in", values, "emgDat");
            return (Criteria) this;
        }

        public Criteria andEmgDatNotIn(List<Date> values) {
            addCriterion("EMG_DAT not in", values, "emgDat");
            return (Criteria) this;
        }

        public Criteria andEmgDatBetween(Date value1, Date value2) {
            addCriterion("EMG_DAT between", value1, value2, "emgDat");
            return (Criteria) this;
        }

        public Criteria andEmgDatNotBetween(Date value1, Date value2) {
            addCriterion("EMG_DAT not between", value1, value2, "emgDat");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodIsNull() {
            addCriterion("EMG_FK_COD is null");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodIsNotNull() {
            addCriterion("EMG_FK_COD is not null");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodEqualTo(String value) {
            addCriterion("EMG_FK_COD =", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodNotEqualTo(String value) {
            addCriterion("EMG_FK_COD <>", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodGreaterThan(String value) {
            addCriterion("EMG_FK_COD >", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_FK_COD >=", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodLessThan(String value) {
            addCriterion("EMG_FK_COD <", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodLessThanOrEqualTo(String value) {
            addCriterion("EMG_FK_COD <=", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodLike(String value) {
            addCriterion("EMG_FK_COD like", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodNotLike(String value) {
            addCriterion("EMG_FK_COD not like", value, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodIn(List<String> values) {
            addCriterion("EMG_FK_COD in", values, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodNotIn(List<String> values) {
            addCriterion("EMG_FK_COD not in", values, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodBetween(String value1, String value2) {
            addCriterion("EMG_FK_COD between", value1, value2, "emgFkCod");
            return (Criteria) this;
        }

        public Criteria andEmgFkCodNotBetween(String value1, String value2) {
            addCriterion("EMG_FK_COD not between", value1, value2, "emgFkCod");
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

        public Criteria andCsbwTIsNull() {
            addCriterion("CSBW_T is null");
            return (Criteria) this;
        }

        public Criteria andCsbwTIsNotNull() {
            addCriterion("CSBW_T is not null");
            return (Criteria) this;
        }

        public Criteria andCsbwTEqualTo(BigDecimal value) {
            addCriterion("CSBW_T =", value, "csbwT");
            return (Criteria) this;
        }

        public Criteria andCsbwTNotEqualTo(BigDecimal value) {
            addCriterion("CSBW_T <>", value, "csbwT");
            return (Criteria) this;
        }

        public Criteria andCsbwTGreaterThan(BigDecimal value) {
            addCriterion("CSBW_T >", value, "csbwT");
            return (Criteria) this;
        }

        public Criteria andCsbwTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSBW_T >=", value, "csbwT");
            return (Criteria) this;
        }

        public Criteria andCsbwTLessThan(BigDecimal value) {
            addCriterion("CSBW_T <", value, "csbwT");
            return (Criteria) this;
        }

        public Criteria andCsbwTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSBW_T <=", value, "csbwT");
            return (Criteria) this;
        }

        public Criteria andCsbwTIn(List<BigDecimal> values) {
            addCriterion("CSBW_T in", values, "csbwT");
            return (Criteria) this;
        }

        public Criteria andCsbwTNotIn(List<BigDecimal> values) {
            addCriterion("CSBW_T not in", values, "csbwT");
            return (Criteria) this;
        }

        public Criteria andCsbwTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSBW_T between", value1, value2, "csbwT");
            return (Criteria) this;
        }

        public Criteria andCsbwTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSBW_T not between", value1, value2, "csbwT");
            return (Criteria) this;
        }

        public Criteria andCsbwPIsNull() {
            addCriterion("CSBW_P is null");
            return (Criteria) this;
        }

        public Criteria andCsbwPIsNotNull() {
            addCriterion("CSBW_P is not null");
            return (Criteria) this;
        }

        public Criteria andCsbwPEqualTo(Long value) {
            addCriterion("CSBW_P =", value, "csbwP");
            return (Criteria) this;
        }

        public Criteria andCsbwPNotEqualTo(Long value) {
            addCriterion("CSBW_P <>", value, "csbwP");
            return (Criteria) this;
        }

        public Criteria andCsbwPGreaterThan(Long value) {
            addCriterion("CSBW_P >", value, "csbwP");
            return (Criteria) this;
        }

        public Criteria andCsbwPGreaterThanOrEqualTo(Long value) {
            addCriterion("CSBW_P >=", value, "csbwP");
            return (Criteria) this;
        }

        public Criteria andCsbwPLessThan(Long value) {
            addCriterion("CSBW_P <", value, "csbwP");
            return (Criteria) this;
        }

        public Criteria andCsbwPLessThanOrEqualTo(Long value) {
            addCriterion("CSBW_P <=", value, "csbwP");
            return (Criteria) this;
        }

        public Criteria andCsbwPIn(List<Long> values) {
            addCriterion("CSBW_P in", values, "csbwP");
            return (Criteria) this;
        }

        public Criteria andCsbwPNotIn(List<Long> values) {
            addCriterion("CSBW_P not in", values, "csbwP");
            return (Criteria) this;
        }

        public Criteria andCsbwPBetween(Long value1, Long value2) {
            addCriterion("CSBW_P between", value1, value2, "csbwP");
            return (Criteria) this;
        }

        public Criteria andCsbwPNotBetween(Long value1, Long value2) {
            addCriterion("CSBW_P not between", value1, value2, "csbwP");
            return (Criteria) this;
        }

        public Criteria andCsbwRIsNull() {
            addCriterion("CSBW_R is null");
            return (Criteria) this;
        }

        public Criteria andCsbwRIsNotNull() {
            addCriterion("CSBW_R is not null");
            return (Criteria) this;
        }

        public Criteria andCsbwREqualTo(Long value) {
            addCriterion("CSBW_R =", value, "csbwR");
            return (Criteria) this;
        }

        public Criteria andCsbwRNotEqualTo(Long value) {
            addCriterion("CSBW_R <>", value, "csbwR");
            return (Criteria) this;
        }

        public Criteria andCsbwRGreaterThan(Long value) {
            addCriterion("CSBW_R >", value, "csbwR");
            return (Criteria) this;
        }

        public Criteria andCsbwRGreaterThanOrEqualTo(Long value) {
            addCriterion("CSBW_R >=", value, "csbwR");
            return (Criteria) this;
        }

        public Criteria andCsbwRLessThan(Long value) {
            addCriterion("CSBW_R <", value, "csbwR");
            return (Criteria) this;
        }

        public Criteria andCsbwRLessThanOrEqualTo(Long value) {
            addCriterion("CSBW_R <=", value, "csbwR");
            return (Criteria) this;
        }

        public Criteria andCsbwRIn(List<Long> values) {
            addCriterion("CSBW_R in", values, "csbwR");
            return (Criteria) this;
        }

        public Criteria andCsbwRNotIn(List<Long> values) {
            addCriterion("CSBW_R not in", values, "csbwR");
            return (Criteria) this;
        }

        public Criteria andCsbwRBetween(Long value1, Long value2) {
            addCriterion("CSBW_R between", value1, value2, "csbwR");
            return (Criteria) this;
        }

        public Criteria andCsbwRNotBetween(Long value1, Long value2) {
            addCriterion("CSBW_R not between", value1, value2, "csbwR");
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

        public Criteria andJbzdDesIsNull() {
            addCriterion("JBZD_DES is null");
            return (Criteria) this;
        }

        public Criteria andJbzdDesIsNotNull() {
            addCriterion("JBZD_DES is not null");
            return (Criteria) this;
        }

        public Criteria andJbzdDesEqualTo(String value) {
            addCriterion("JBZD_DES =", value, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andJbzdDesNotEqualTo(String value) {
            addCriterion("JBZD_DES <>", value, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andJbzdDesGreaterThan(String value) {
            addCriterion("JBZD_DES >", value, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andJbzdDesGreaterThanOrEqualTo(String value) {
            addCriterion("JBZD_DES >=", value, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andJbzdDesLessThan(String value) {
            addCriterion("JBZD_DES <", value, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andJbzdDesLessThanOrEqualTo(String value) {
            addCriterion("JBZD_DES <=", value, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andJbzdDesLike(String value) {
            addCriterion("JBZD_DES like", value, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andJbzdDesNotLike(String value) {
            addCriterion("JBZD_DES not like", value, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andJbzdDesIn(List<String> values) {
            addCriterion("JBZD_DES in", values, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andJbzdDesNotIn(List<String> values) {
            addCriterion("JBZD_DES not in", values, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andJbzdDesBetween(String value1, String value2) {
            addCriterion("JBZD_DES between", value1, value2, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andJbzdDesNotBetween(String value1, String value2) {
            addCriterion("JBZD_DES not between", value1, value2, "jbzdDes");
            return (Criteria) this;
        }

        public Criteria andAlgHonIsNull() {
            addCriterion("ALG_HON is null");
            return (Criteria) this;
        }

        public Criteria andAlgHonIsNotNull() {
            addCriterion("ALG_HON is not null");
            return (Criteria) this;
        }

        public Criteria andAlgHonEqualTo(String value) {
            addCriterion("ALG_HON =", value, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgHonNotEqualTo(String value) {
            addCriterion("ALG_HON <>", value, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgHonGreaterThan(String value) {
            addCriterion("ALG_HON >", value, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgHonGreaterThanOrEqualTo(String value) {
            addCriterion("ALG_HON >=", value, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgHonLessThan(String value) {
            addCriterion("ALG_HON <", value, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgHonLessThanOrEqualTo(String value) {
            addCriterion("ALG_HON <=", value, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgHonLike(String value) {
            addCriterion("ALG_HON like", value, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgHonNotLike(String value) {
            addCriterion("ALG_HON not like", value, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgHonIn(List<String> values) {
            addCriterion("ALG_HON in", values, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgHonNotIn(List<String> values) {
            addCriterion("ALG_HON not in", values, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgHonBetween(String value1, String value2) {
            addCriterion("ALG_HON between", value1, value2, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgHonNotBetween(String value1, String value2) {
            addCriterion("ALG_HON not between", value1, value2, "algHon");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodIsNull() {
            addCriterion("ALG_TYP_COD is null");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodIsNotNull() {
            addCriterion("ALG_TYP_COD is not null");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodEqualTo(String value) {
            addCriterion("ALG_TYP_COD =", value, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodNotEqualTo(String value) {
            addCriterion("ALG_TYP_COD <>", value, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodGreaterThan(String value) {
            addCriterion("ALG_TYP_COD >", value, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodGreaterThanOrEqualTo(String value) {
            addCriterion("ALG_TYP_COD >=", value, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodLessThan(String value) {
            addCriterion("ALG_TYP_COD <", value, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodLessThanOrEqualTo(String value) {
            addCriterion("ALG_TYP_COD <=", value, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodLike(String value) {
            addCriterion("ALG_TYP_COD like", value, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodNotLike(String value) {
            addCriterion("ALG_TYP_COD not like", value, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodIn(List<String> values) {
            addCriterion("ALG_TYP_COD in", values, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodNotIn(List<String> values) {
            addCriterion("ALG_TYP_COD not in", values, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodBetween(String value1, String value2) {
            addCriterion("ALG_TYP_COD between", value1, value2, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypCodNotBetween(String value1, String value2) {
            addCriterion("ALG_TYP_COD not between", value1, value2, "algTypCod");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesIsNull() {
            addCriterion("ALG_TYP_DES is null");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesIsNotNull() {
            addCriterion("ALG_TYP_DES is not null");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesEqualTo(String value) {
            addCriterion("ALG_TYP_DES =", value, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesNotEqualTo(String value) {
            addCriterion("ALG_TYP_DES <>", value, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesGreaterThan(String value) {
            addCriterion("ALG_TYP_DES >", value, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesGreaterThanOrEqualTo(String value) {
            addCriterion("ALG_TYP_DES >=", value, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesLessThan(String value) {
            addCriterion("ALG_TYP_DES <", value, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesLessThanOrEqualTo(String value) {
            addCriterion("ALG_TYP_DES <=", value, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesLike(String value) {
            addCriterion("ALG_TYP_DES like", value, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesNotLike(String value) {
            addCriterion("ALG_TYP_DES not like", value, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesIn(List<String> values) {
            addCriterion("ALG_TYP_DES in", values, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesNotIn(List<String> values) {
            addCriterion("ALG_TYP_DES not in", values, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesBetween(String value1, String value2) {
            addCriterion("ALG_TYP_DES between", value1, value2, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andAlgTypDesNotBetween(String value1, String value2) {
            addCriterion("ALG_TYP_DES not between", value1, value2, "algTypDes");
            return (Criteria) this;
        }

        public Criteria andCszsfCodIsNull() {
            addCriterion("CSZSF_COD is null");
            return (Criteria) this;
        }

        public Criteria andCszsfCodIsNotNull() {
            addCriterion("CSZSF_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCszsfCodEqualTo(String value) {
            addCriterion("CSZSF_COD =", value, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCszsfCodNotEqualTo(String value) {
            addCriterion("CSZSF_COD <>", value, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCszsfCodGreaterThan(String value) {
            addCriterion("CSZSF_COD >", value, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCszsfCodGreaterThanOrEqualTo(String value) {
            addCriterion("CSZSF_COD >=", value, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCszsfCodLessThan(String value) {
            addCriterion("CSZSF_COD <", value, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCszsfCodLessThanOrEqualTo(String value) {
            addCriterion("CSZSF_COD <=", value, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCszsfCodLike(String value) {
            addCriterion("CSZSF_COD like", value, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCszsfCodNotLike(String value) {
            addCriterion("CSZSF_COD not like", value, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCszsfCodIn(List<String> values) {
            addCriterion("CSZSF_COD in", values, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCszsfCodNotIn(List<String> values) {
            addCriterion("CSZSF_COD not in", values, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCszsfCodBetween(String value1, String value2) {
            addCriterion("CSZSF_COD between", value1, value2, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCszsfCodNotBetween(String value1, String value2) {
            addCriterion("CSZSF_COD not between", value1, value2, "cszsfCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodIsNull() {
            addCriterion("CSYY_COD is null");
            return (Criteria) this;
        }

        public Criteria andCsyyCodIsNotNull() {
            addCriterion("CSYY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCsyyCodEqualTo(String value) {
            addCriterion("CSYY_COD =", value, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodNotEqualTo(String value) {
            addCriterion("CSYY_COD <>", value, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodGreaterThan(String value) {
            addCriterion("CSYY_COD >", value, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodGreaterThanOrEqualTo(String value) {
            addCriterion("CSYY_COD >=", value, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodLessThan(String value) {
            addCriterion("CSYY_COD <", value, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodLessThanOrEqualTo(String value) {
            addCriterion("CSYY_COD <=", value, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodLike(String value) {
            addCriterion("CSYY_COD like", value, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodNotLike(String value) {
            addCriterion("CSYY_COD not like", value, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodIn(List<String> values) {
            addCriterion("CSYY_COD in", values, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodNotIn(List<String> values) {
            addCriterion("CSYY_COD not in", values, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodBetween(String value1, String value2) {
            addCriterion("CSYY_COD between", value1, value2, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andCsyyCodNotBetween(String value1, String value2) {
            addCriterion("CSYY_COD not between", value1, value2, "csyyCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodIsNull() {
            addCriterion("FSDD_COD is null");
            return (Criteria) this;
        }

        public Criteria andFsddCodIsNotNull() {
            addCriterion("FSDD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFsddCodEqualTo(String value) {
            addCriterion("FSDD_COD =", value, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodNotEqualTo(String value) {
            addCriterion("FSDD_COD <>", value, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodGreaterThan(String value) {
            addCriterion("FSDD_COD >", value, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodGreaterThanOrEqualTo(String value) {
            addCriterion("FSDD_COD >=", value, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodLessThan(String value) {
            addCriterion("FSDD_COD <", value, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodLessThanOrEqualTo(String value) {
            addCriterion("FSDD_COD <=", value, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodLike(String value) {
            addCriterion("FSDD_COD like", value, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodNotLike(String value) {
            addCriterion("FSDD_COD not like", value, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodIn(List<String> values) {
            addCriterion("FSDD_COD in", values, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodNotIn(List<String> values) {
            addCriterion("FSDD_COD not in", values, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodBetween(String value1, String value2) {
            addCriterion("FSDD_COD between", value1, value2, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andFsddCodNotBetween(String value1, String value2) {
            addCriterion("FSDD_COD not between", value1, value2, "fsddCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodIsNull() {
            addCriterion("HSFS_COD is null");
            return (Criteria) this;
        }

        public Criteria andHsfsCodIsNotNull() {
            addCriterion("HSFS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHsfsCodEqualTo(String value) {
            addCriterion("HSFS_COD =", value, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodNotEqualTo(String value) {
            addCriterion("HSFS_COD <>", value, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodGreaterThan(String value) {
            addCriterion("HSFS_COD >", value, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodGreaterThanOrEqualTo(String value) {
            addCriterion("HSFS_COD >=", value, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodLessThan(String value) {
            addCriterion("HSFS_COD <", value, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodLessThanOrEqualTo(String value) {
            addCriterion("HSFS_COD <=", value, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodLike(String value) {
            addCriterion("HSFS_COD like", value, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodNotLike(String value) {
            addCriterion("HSFS_COD not like", value, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodIn(List<String> values) {
            addCriterion("HSFS_COD in", values, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodNotIn(List<String> values) {
            addCriterion("HSFS_COD not in", values, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodBetween(String value1, String value2) {
            addCriterion("HSFS_COD between", value1, value2, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsfsCodNotBetween(String value1, String value2) {
            addCriterion("HSFS_COD not between", value1, value2, "hsfsCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodIsNull() {
            addCriterion("HSR_COD is null");
            return (Criteria) this;
        }

        public Criteria andHsrCodIsNotNull() {
            addCriterion("HSR_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHsrCodEqualTo(String value) {
            addCriterion("HSR_COD =", value, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodNotEqualTo(String value) {
            addCriterion("HSR_COD <>", value, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodGreaterThan(String value) {
            addCriterion("HSR_COD >", value, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodGreaterThanOrEqualTo(String value) {
            addCriterion("HSR_COD >=", value, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodLessThan(String value) {
            addCriterion("HSR_COD <", value, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodLessThanOrEqualTo(String value) {
            addCriterion("HSR_COD <=", value, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodLike(String value) {
            addCriterion("HSR_COD like", value, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodNotLike(String value) {
            addCriterion("HSR_COD not like", value, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodIn(List<String> values) {
            addCriterion("HSR_COD in", values, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodNotIn(List<String> values) {
            addCriterion("HSR_COD not in", values, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodBetween(String value1, String value2) {
            addCriterion("HSR_COD between", value1, value2, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andHsrCodNotBetween(String value1, String value2) {
            addCriterion("HSR_COD not between", value1, value2, "hsrCod");
            return (Criteria) this;
        }

        public Criteria andLxrNamIsNull() {
            addCriterion("LXR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andLxrNamIsNotNull() {
            addCriterion("LXR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andLxrNamEqualTo(String value) {
            addCriterion("LXR_NAM =", value, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrNamNotEqualTo(String value) {
            addCriterion("LXR_NAM <>", value, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrNamGreaterThan(String value) {
            addCriterion("LXR_NAM >", value, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrNamGreaterThanOrEqualTo(String value) {
            addCriterion("LXR_NAM >=", value, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrNamLessThan(String value) {
            addCriterion("LXR_NAM <", value, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrNamLessThanOrEqualTo(String value) {
            addCriterion("LXR_NAM <=", value, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrNamLike(String value) {
            addCriterion("LXR_NAM like", value, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrNamNotLike(String value) {
            addCriterion("LXR_NAM not like", value, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrNamIn(List<String> values) {
            addCriterion("LXR_NAM in", values, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrNamNotIn(List<String> values) {
            addCriterion("LXR_NAM not in", values, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrNamBetween(String value1, String value2) {
            addCriterion("LXR_NAM between", value1, value2, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrNamNotBetween(String value1, String value2) {
            addCriterion("LXR_NAM not between", value1, value2, "lxrNam");
            return (Criteria) this;
        }

        public Criteria andLxrTelIsNull() {
            addCriterion("LXR_TEL is null");
            return (Criteria) this;
        }

        public Criteria andLxrTelIsNotNull() {
            addCriterion("LXR_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andLxrTelEqualTo(String value) {
            addCriterion("LXR_TEL =", value, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andLxrTelNotEqualTo(String value) {
            addCriterion("LXR_TEL <>", value, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andLxrTelGreaterThan(String value) {
            addCriterion("LXR_TEL >", value, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andLxrTelGreaterThanOrEqualTo(String value) {
            addCriterion("LXR_TEL >=", value, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andLxrTelLessThan(String value) {
            addCriterion("LXR_TEL <", value, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andLxrTelLessThanOrEqualTo(String value) {
            addCriterion("LXR_TEL <=", value, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andLxrTelLike(String value) {
            addCriterion("LXR_TEL like", value, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andLxrTelNotLike(String value) {
            addCriterion("LXR_TEL not like", value, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andLxrTelIn(List<String> values) {
            addCriterion("LXR_TEL in", values, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andLxrTelNotIn(List<String> values) {
            addCriterion("LXR_TEL not in", values, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andLxrTelBetween(String value1, String value2) {
            addCriterion("LXR_TEL between", value1, value2, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andLxrTelNotBetween(String value1, String value2) {
            addCriterion("LXR_TEL not between", value1, value2, "lxrTel");
            return (Criteria) this;
        }

        public Criteria andQkCodIsNull() {
            addCriterion("QK_COD is null");
            return (Criteria) this;
        }

        public Criteria andQkCodIsNotNull() {
            addCriterion("QK_COD is not null");
            return (Criteria) this;
        }

        public Criteria andQkCodEqualTo(String value) {
            addCriterion("QK_COD =", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodNotEqualTo(String value) {
            addCriterion("QK_COD <>", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodGreaterThan(String value) {
            addCriterion("QK_COD >", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodGreaterThanOrEqualTo(String value) {
            addCriterion("QK_COD >=", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodLessThan(String value) {
            addCriterion("QK_COD <", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodLessThanOrEqualTo(String value) {
            addCriterion("QK_COD <=", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodLike(String value) {
            addCriterion("QK_COD like", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodNotLike(String value) {
            addCriterion("QK_COD not like", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodIn(List<String> values) {
            addCriterion("QK_COD in", values, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodNotIn(List<String> values) {
            addCriterion("QK_COD not in", values, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodBetween(String value1, String value2) {
            addCriterion("QK_COD between", value1, value2, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodNotBetween(String value1, String value2) {
            addCriterion("QK_COD not between", value1, value2, "qkCod");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrIsNull() {
            addCriterion("RECORDER_NBR is null");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrIsNotNull() {
            addCriterion("RECORDER_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrEqualTo(String value) {
            addCriterion("RECORDER_NBR =", value, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrNotEqualTo(String value) {
            addCriterion("RECORDER_NBR <>", value, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrGreaterThan(String value) {
            addCriterion("RECORDER_NBR >", value, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrGreaterThanOrEqualTo(String value) {
            addCriterion("RECORDER_NBR >=", value, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrLessThan(String value) {
            addCriterion("RECORDER_NBR <", value, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrLessThanOrEqualTo(String value) {
            addCriterion("RECORDER_NBR <=", value, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrLike(String value) {
            addCriterion("RECORDER_NBR like", value, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrNotLike(String value) {
            addCriterion("RECORDER_NBR not like", value, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrIn(List<String> values) {
            addCriterion("RECORDER_NBR in", values, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrNotIn(List<String> values) {
            addCriterion("RECORDER_NBR not in", values, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrBetween(String value1, String value2) {
            addCriterion("RECORDER_NBR between", value1, value2, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNbrNotBetween(String value1, String value2) {
            addCriterion("RECORDER_NBR not between", value1, value2, "recorderNbr");
            return (Criteria) this;
        }

        public Criteria andRecorderNamIsNull() {
            addCriterion("RECORDER_NAM is null");
            return (Criteria) this;
        }

        public Criteria andRecorderNamIsNotNull() {
            addCriterion("RECORDER_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andRecorderNamEqualTo(String value) {
            addCriterion("RECORDER_NAM =", value, "recorderNam");
            return (Criteria) this;
        }

        public Criteria andRecorderNamNotEqualTo(String value) {
            addCriterion("RECORDER_NAM <>", value, "recorderNam");
            return (Criteria) this;
        }

        public Criteria andRecorderNamGreaterThan(String value) {
            addCriterion("RECORDER_NAM >", value, "recorderNam");
            return (Criteria) this;
        }

        public Criteria andRecorderNamGreaterThanOrEqualTo(String value) {
            addCriterion("RECORDER_NAM >=", value, "recorderNam");
            return (Criteria) this;
        }

        public Criteria andRecorderNamLessThan(String value) {
            addCriterion("RECORDER_NAM <", value, "recorderNam");
            return (Criteria) this;
        }

        public Criteria andRecorderNamLessThanOrEqualTo(String value) {
            addCriterion("RECORDER_NAM <=", value, "recorderNam");
            return (Criteria) this;
        }

        public Criteria andRecorderNamLike(String value) {
            addCriterion("RECORDER_NAM like", value, "recorderNam");
            return (Criteria) this;
        }

        public Criteria andRecorderNamNotLike(String value) {
            addCriterion("RECORDER_NAM not like", value, "recorderNam");
            return (Criteria) this;
        }

        public Criteria andRecorderNamIn(List<String> values) {
            addCriterion("RECORDER_NAM in", values, "recorderNam");
            return (Criteria) this;
        }

        public Criteria andRecorderNamNotIn(List<String> values) {
            addCriterion("RECORDER_NAM not in", values, "recorderNam");
            return (Criteria) this;
        }

        public Criteria andRecorderNamBetween(String value1, String value2) {
            addCriterion("RECORDER_NAM between", value1, value2, "recorderNam");
            return (Criteria) this;
        }

        public Criteria andRecorderNamNotBetween(String value1, String value2) {
            addCriterion("RECORDER_NAM not between", value1, value2, "recorderNam");
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

        public Criteria andCszsfOtherIsNull() {
            addCriterion("CSZSF_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherIsNotNull() {
            addCriterion("CSZSF_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherEqualTo(String value) {
            addCriterion("CSZSF_OTHER =", value, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherNotEqualTo(String value) {
            addCriterion("CSZSF_OTHER <>", value, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherGreaterThan(String value) {
            addCriterion("CSZSF_OTHER >", value, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherGreaterThanOrEqualTo(String value) {
            addCriterion("CSZSF_OTHER >=", value, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherLessThan(String value) {
            addCriterion("CSZSF_OTHER <", value, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherLessThanOrEqualTo(String value) {
            addCriterion("CSZSF_OTHER <=", value, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherLike(String value) {
            addCriterion("CSZSF_OTHER like", value, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherNotLike(String value) {
            addCriterion("CSZSF_OTHER not like", value, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherIn(List<String> values) {
            addCriterion("CSZSF_OTHER in", values, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherNotIn(List<String> values) {
            addCriterion("CSZSF_OTHER not in", values, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherBetween(String value1, String value2) {
            addCriterion("CSZSF_OTHER between", value1, value2, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andCszsfOtherNotBetween(String value1, String value2) {
            addCriterion("CSZSF_OTHER not between", value1, value2, "cszsfOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherIsNull() {
            addCriterion("FSDD_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andFsddOtherIsNotNull() {
            addCriterion("FSDD_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andFsddOtherEqualTo(String value) {
            addCriterion("FSDD_OTHER =", value, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherNotEqualTo(String value) {
            addCriterion("FSDD_OTHER <>", value, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherGreaterThan(String value) {
            addCriterion("FSDD_OTHER >", value, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherGreaterThanOrEqualTo(String value) {
            addCriterion("FSDD_OTHER >=", value, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherLessThan(String value) {
            addCriterion("FSDD_OTHER <", value, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherLessThanOrEqualTo(String value) {
            addCriterion("FSDD_OTHER <=", value, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherLike(String value) {
            addCriterion("FSDD_OTHER like", value, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherNotLike(String value) {
            addCriterion("FSDD_OTHER not like", value, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherIn(List<String> values) {
            addCriterion("FSDD_OTHER in", values, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherNotIn(List<String> values) {
            addCriterion("FSDD_OTHER not in", values, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherBetween(String value1, String value2) {
            addCriterion("FSDD_OTHER between", value1, value2, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andFsddOtherNotBetween(String value1, String value2) {
            addCriterion("FSDD_OTHER not between", value1, value2, "fsddOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherIsNull() {
            addCriterion("CSYY_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherIsNotNull() {
            addCriterion("CSYY_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherEqualTo(String value) {
            addCriterion("CSYY_OTHER =", value, "csyyOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherNotEqualTo(String value) {
            addCriterion("CSYY_OTHER <>", value, "csyyOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherGreaterThan(String value) {
            addCriterion("CSYY_OTHER >", value, "csyyOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherGreaterThanOrEqualTo(String value) {
            addCriterion("CSYY_OTHER >=", value, "csyyOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherLessThan(String value) {
            addCriterion("CSYY_OTHER <", value, "csyyOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherLessThanOrEqualTo(String value) {
            addCriterion("CSYY_OTHER <=", value, "csyyOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherLike(String value) {
            addCriterion("CSYY_OTHER like", value, "csyyOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherNotLike(String value) {
            addCriterion("CSYY_OTHER not like", value, "csyyOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherIn(List<String> values) {
            addCriterion("CSYY_OTHER in", values, "csyyOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherNotIn(List<String> values) {
            addCriterion("CSYY_OTHER not in", values, "csyyOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherBetween(String value1, String value2) {
            addCriterion("CSYY_OTHER between", value1, value2, "csyyOther");
            return (Criteria) this;
        }

        public Criteria andCsyyOtherNotBetween(String value1, String value2) {
            addCriterion("CSYY_OTHER not between", value1, value2, "csyyOther");
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