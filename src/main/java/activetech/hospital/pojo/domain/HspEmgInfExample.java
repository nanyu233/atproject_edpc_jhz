package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspEmgInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspEmgInfExample() {
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

        public Criteria andVstCadIsNull() {
            addCriterion("VST_CAD is null");
            return (Criteria) this;
        }

        public Criteria andVstCadIsNotNull() {
            addCriterion("VST_CAD is not null");
            return (Criteria) this;
        }

        public Criteria andVstCadEqualTo(String value) {
            addCriterion("VST_CAD =", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotEqualTo(String value) {
            addCriterion("VST_CAD <>", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadGreaterThan(String value) {
            addCriterion("VST_CAD >", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadGreaterThanOrEqualTo(String value) {
            addCriterion("VST_CAD >=", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLessThan(String value) {
            addCriterion("VST_CAD <", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLessThanOrEqualTo(String value) {
            addCriterion("VST_CAD <=", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLike(String value) {
            addCriterion("VST_CAD like", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotLike(String value) {
            addCriterion("VST_CAD not like", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadIn(List<String> values) {
            addCriterion("VST_CAD in", values, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotIn(List<String> values) {
            addCriterion("VST_CAD not in", values, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadBetween(String value1, String value2) {
            addCriterion("VST_CAD between", value1, value2, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotBetween(String value1, String value2) {
            addCriterion("VST_CAD not between", value1, value2, "vstCad");
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

        public Criteria andBthDatIsNull() {
            addCriterion("BTH_DAT is null");
            return (Criteria) this;
        }

        public Criteria andBthDatIsNotNull() {
            addCriterion("BTH_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andBthDatEqualTo(Date value) {
            addCriterion("BTH_DAT =", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatNotEqualTo(Date value) {
            addCriterion("BTH_DAT <>", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatGreaterThan(Date value) {
            addCriterion("BTH_DAT >", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatGreaterThanOrEqualTo(Date value) {
            addCriterion("BTH_DAT >=", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatLessThan(Date value) {
            addCriterion("BTH_DAT <", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatLessThanOrEqualTo(Date value) {
            addCriterion("BTH_DAT <=", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatIn(List<Date> values) {
            addCriterion("BTH_DAT in", values, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatNotIn(List<Date> values) {
            addCriterion("BTH_DAT not in", values, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatBetween(Date value1, Date value2) {
            addCriterion("BTH_DAT between", value1, value2, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatNotBetween(Date value1, Date value2) {
            addCriterion("BTH_DAT not between", value1, value2, "bthDat");
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

        public Criteria andPheNbrIsNull() {
            addCriterion("PHE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andPheNbrIsNotNull() {
            addCriterion("PHE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andPheNbrEqualTo(String value) {
            addCriterion("PHE_NBR =", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrNotEqualTo(String value) {
            addCriterion("PHE_NBR <>", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrGreaterThan(String value) {
            addCriterion("PHE_NBR >", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrGreaterThanOrEqualTo(String value) {
            addCriterion("PHE_NBR >=", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrLessThan(String value) {
            addCriterion("PHE_NBR <", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrLessThanOrEqualTo(String value) {
            addCriterion("PHE_NBR <=", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrLike(String value) {
            addCriterion("PHE_NBR like", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrNotLike(String value) {
            addCriterion("PHE_NBR not like", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrIn(List<String> values) {
            addCriterion("PHE_NBR in", values, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrNotIn(List<String> values) {
            addCriterion("PHE_NBR not in", values, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrBetween(String value1, String value2) {
            addCriterion("PHE_NBR between", value1, value2, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrNotBetween(String value1, String value2) {
            addCriterion("PHE_NBR not between", value1, value2, "pheNbr");
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

        public Criteria andGrnChlIsNull() {
            addCriterion("GRN_CHL is null");
            return (Criteria) this;
        }

        public Criteria andGrnChlIsNotNull() {
            addCriterion("GRN_CHL is not null");
            return (Criteria) this;
        }

        public Criteria andGrnChlEqualTo(String value) {
            addCriterion("GRN_CHL =", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlNotEqualTo(String value) {
            addCriterion("GRN_CHL <>", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlGreaterThan(String value) {
            addCriterion("GRN_CHL >", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlGreaterThanOrEqualTo(String value) {
            addCriterion("GRN_CHL >=", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlLessThan(String value) {
            addCriterion("GRN_CHL <", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlLessThanOrEqualTo(String value) {
            addCriterion("GRN_CHL <=", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlLike(String value) {
            addCriterion("GRN_CHL like", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlNotLike(String value) {
            addCriterion("GRN_CHL not like", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlIn(List<String> values) {
            addCriterion("GRN_CHL in", values, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlNotIn(List<String> values) {
            addCriterion("GRN_CHL not in", values, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlBetween(String value1, String value2) {
            addCriterion("GRN_CHL between", value1, value2, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlNotBetween(String value1, String value2) {
            addCriterion("GRN_CHL not between", value1, value2, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnIsNull() {
            addCriterion("GRN_CHL_RSN is null");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnIsNotNull() {
            addCriterion("GRN_CHL_RSN is not null");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnEqualTo(String value) {
            addCriterion("GRN_CHL_RSN =", value, "grnChlRsn");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnNotEqualTo(String value) {
            addCriterion("GRN_CHL_RSN <>", value, "grnChlRsn");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnGreaterThan(String value) {
            addCriterion("GRN_CHL_RSN >", value, "grnChlRsn");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnGreaterThanOrEqualTo(String value) {
            addCriterion("GRN_CHL_RSN >=", value, "grnChlRsn");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnLessThan(String value) {
            addCriterion("GRN_CHL_RSN <", value, "grnChlRsn");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnLessThanOrEqualTo(String value) {
            addCriterion("GRN_CHL_RSN <=", value, "grnChlRsn");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnLike(String value) {
            addCriterion("GRN_CHL_RSN like", value, "grnChlRsn");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnNotLike(String value) {
            addCriterion("GRN_CHL_RSN not like", value, "grnChlRsn");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnIn(List<String> values) {
            addCriterion("GRN_CHL_RSN in", values, "grnChlRsn");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnNotIn(List<String> values) {
            addCriterion("GRN_CHL_RSN not in", values, "grnChlRsn");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnBetween(String value1, String value2) {
            addCriterion("GRN_CHL_RSN between", value1, value2, "grnChlRsn");
            return (Criteria) this;
        }

        public Criteria andGrnChlRsnNotBetween(String value1, String value2) {
            addCriterion("GRN_CHL_RSN not between", value1, value2, "grnChlRsn");
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

        public Criteria andCmpPsnCodIsNull() {
            addCriterion("CMP_PSN_COD is null");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodIsNotNull() {
            addCriterion("CMP_PSN_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodEqualTo(String value) {
            addCriterion("CMP_PSN_COD =", value, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodNotEqualTo(String value) {
            addCriterion("CMP_PSN_COD <>", value, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodGreaterThan(String value) {
            addCriterion("CMP_PSN_COD >", value, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodGreaterThanOrEqualTo(String value) {
            addCriterion("CMP_PSN_COD >=", value, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodLessThan(String value) {
            addCriterion("CMP_PSN_COD <", value, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodLessThanOrEqualTo(String value) {
            addCriterion("CMP_PSN_COD <=", value, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodLike(String value) {
            addCriterion("CMP_PSN_COD like", value, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodNotLike(String value) {
            addCriterion("CMP_PSN_COD not like", value, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodIn(List<String> values) {
            addCriterion("CMP_PSN_COD in", values, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodNotIn(List<String> values) {
            addCriterion("CMP_PSN_COD not in", values, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodBetween(String value1, String value2) {
            addCriterion("CMP_PSN_COD between", value1, value2, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andCmpPsnCodNotBetween(String value1, String value2) {
            addCriterion("CMP_PSN_COD not between", value1, value2, "cmpPsnCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodIsNull() {
            addCriterion("EMG_ARE_COD is null");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodIsNotNull() {
            addCriterion("EMG_ARE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodEqualTo(String value) {
            addCriterion("EMG_ARE_COD =", value, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodNotEqualTo(String value) {
            addCriterion("EMG_ARE_COD <>", value, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodGreaterThan(String value) {
            addCriterion("EMG_ARE_COD >", value, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_ARE_COD >=", value, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodLessThan(String value) {
            addCriterion("EMG_ARE_COD <", value, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodLessThanOrEqualTo(String value) {
            addCriterion("EMG_ARE_COD <=", value, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodLike(String value) {
            addCriterion("EMG_ARE_COD like", value, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodNotLike(String value) {
            addCriterion("EMG_ARE_COD not like", value, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodIn(List<String> values) {
            addCriterion("EMG_ARE_COD in", values, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodNotIn(List<String> values) {
            addCriterion("EMG_ARE_COD not in", values, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodBetween(String value1, String value2) {
            addCriterion("EMG_ARE_COD between", value1, value2, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgAreCodNotBetween(String value1, String value2) {
            addCriterion("EMG_ARE_COD not between", value1, value2, "emgAreCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodIsNull() {
            addCriterion("EMG_DEP_COD is null");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodIsNotNull() {
            addCriterion("EMG_DEP_COD is not null");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodEqualTo(String value) {
            addCriterion("EMG_DEP_COD =", value, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodNotEqualTo(String value) {
            addCriterion("EMG_DEP_COD <>", value, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodGreaterThan(String value) {
            addCriterion("EMG_DEP_COD >", value, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_DEP_COD >=", value, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodLessThan(String value) {
            addCriterion("EMG_DEP_COD <", value, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodLessThanOrEqualTo(String value) {
            addCriterion("EMG_DEP_COD <=", value, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodLike(String value) {
            addCriterion("EMG_DEP_COD like", value, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodNotLike(String value) {
            addCriterion("EMG_DEP_COD not like", value, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodIn(List<String> values) {
            addCriterion("EMG_DEP_COD in", values, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodNotIn(List<String> values) {
            addCriterion("EMG_DEP_COD not in", values, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodBetween(String value1, String value2) {
            addCriterion("EMG_DEP_COD between", value1, value2, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andEmgDepCodNotBetween(String value1, String value2) {
            addCriterion("EMG_DEP_COD not between", value1, value2, "emgDepCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodIsNull() {
            addCriterion("PRE_DGN_COD is null");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodIsNotNull() {
            addCriterion("PRE_DGN_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodEqualTo(String value) {
            addCriterion("PRE_DGN_COD =", value, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodNotEqualTo(String value) {
            addCriterion("PRE_DGN_COD <>", value, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodGreaterThan(String value) {
            addCriterion("PRE_DGN_COD >", value, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_DGN_COD >=", value, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodLessThan(String value) {
            addCriterion("PRE_DGN_COD <", value, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodLessThanOrEqualTo(String value) {
            addCriterion("PRE_DGN_COD <=", value, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodLike(String value) {
            addCriterion("PRE_DGN_COD like", value, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodNotLike(String value) {
            addCriterion("PRE_DGN_COD not like", value, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodIn(List<String> values) {
            addCriterion("PRE_DGN_COD in", values, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodNotIn(List<String> values) {
            addCriterion("PRE_DGN_COD not in", values, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodBetween(String value1, String value2) {
            addCriterion("PRE_DGN_COD between", value1, value2, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreDgnCodNotBetween(String value1, String value2) {
            addCriterion("PRE_DGN_COD not between", value1, value2, "preDgnCod");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrIsNull() {
            addCriterion("PRE_USR_NBR is null");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrIsNotNull() {
            addCriterion("PRE_USR_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrEqualTo(String value) {
            addCriterion("PRE_USR_NBR =", value, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrNotEqualTo(String value) {
            addCriterion("PRE_USR_NBR <>", value, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrGreaterThan(String value) {
            addCriterion("PRE_USR_NBR >", value, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_USR_NBR >=", value, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrLessThan(String value) {
            addCriterion("PRE_USR_NBR <", value, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrLessThanOrEqualTo(String value) {
            addCriterion("PRE_USR_NBR <=", value, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrLike(String value) {
            addCriterion("PRE_USR_NBR like", value, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrNotLike(String value) {
            addCriterion("PRE_USR_NBR not like", value, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrIn(List<String> values) {
            addCriterion("PRE_USR_NBR in", values, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrNotIn(List<String> values) {
            addCriterion("PRE_USR_NBR not in", values, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrBetween(String value1, String value2) {
            addCriterion("PRE_USR_NBR between", value1, value2, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNbrNotBetween(String value1, String value2) {
            addCriterion("PRE_USR_NBR not between", value1, value2, "preUsrNbr");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamIsNull() {
            addCriterion("PRE_USR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamIsNotNull() {
            addCriterion("PRE_USR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamEqualTo(String value) {
            addCriterion("PRE_USR_NAM =", value, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamNotEqualTo(String value) {
            addCriterion("PRE_USR_NAM <>", value, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamGreaterThan(String value) {
            addCriterion("PRE_USR_NAM >", value, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_USR_NAM >=", value, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamLessThan(String value) {
            addCriterion("PRE_USR_NAM <", value, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamLessThanOrEqualTo(String value) {
            addCriterion("PRE_USR_NAM <=", value, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamLike(String value) {
            addCriterion("PRE_USR_NAM like", value, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamNotLike(String value) {
            addCriterion("PRE_USR_NAM not like", value, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamIn(List<String> values) {
            addCriterion("PRE_USR_NAM in", values, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamNotIn(List<String> values) {
            addCriterion("PRE_USR_NAM not in", values, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamBetween(String value1, String value2) {
            addCriterion("PRE_USR_NAM between", value1, value2, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andPreUsrNamNotBetween(String value1, String value2) {
            addCriterion("PRE_USR_NAM not between", value1, value2, "preUsrNam");
            return (Criteria) this;
        }

        public Criteria andModGdnCodIsNull() {
            addCriterion("MOD_GDN_COD is null");
            return (Criteria) this;
        }

        public Criteria andModGdnCodIsNotNull() {
            addCriterion("MOD_GDN_COD is not null");
            return (Criteria) this;
        }

        public Criteria andModGdnCodEqualTo(String value) {
            addCriterion("MOD_GDN_COD =", value, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModGdnCodNotEqualTo(String value) {
            addCriterion("MOD_GDN_COD <>", value, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModGdnCodGreaterThan(String value) {
            addCriterion("MOD_GDN_COD >", value, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModGdnCodGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_GDN_COD >=", value, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModGdnCodLessThan(String value) {
            addCriterion("MOD_GDN_COD <", value, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModGdnCodLessThanOrEqualTo(String value) {
            addCriterion("MOD_GDN_COD <=", value, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModGdnCodLike(String value) {
            addCriterion("MOD_GDN_COD like", value, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModGdnCodNotLike(String value) {
            addCriterion("MOD_GDN_COD not like", value, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModGdnCodIn(List<String> values) {
            addCriterion("MOD_GDN_COD in", values, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModGdnCodNotIn(List<String> values) {
            addCriterion("MOD_GDN_COD not in", values, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModGdnCodBetween(String value1, String value2) {
            addCriterion("MOD_GDN_COD between", value1, value2, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModGdnCodNotBetween(String value1, String value2) {
            addCriterion("MOD_GDN_COD not between", value1, value2, "modGdnCod");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrIsNull() {
            addCriterion("MOD_USR_NBR is null");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrIsNotNull() {
            addCriterion("MOD_USR_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrEqualTo(String value) {
            addCriterion("MOD_USR_NBR =", value, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrNotEqualTo(String value) {
            addCriterion("MOD_USR_NBR <>", value, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrGreaterThan(String value) {
            addCriterion("MOD_USR_NBR >", value, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USR_NBR >=", value, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrLessThan(String value) {
            addCriterion("MOD_USR_NBR <", value, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrLessThanOrEqualTo(String value) {
            addCriterion("MOD_USR_NBR <=", value, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrLike(String value) {
            addCriterion("MOD_USR_NBR like", value, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrNotLike(String value) {
            addCriterion("MOD_USR_NBR not like", value, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrIn(List<String> values) {
            addCriterion("MOD_USR_NBR in", values, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrNotIn(List<String> values) {
            addCriterion("MOD_USR_NBR not in", values, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrBetween(String value1, String value2) {
            addCriterion("MOD_USR_NBR between", value1, value2, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNbrNotBetween(String value1, String value2) {
            addCriterion("MOD_USR_NBR not between", value1, value2, "modUsrNbr");
            return (Criteria) this;
        }

        public Criteria andModUsrNamIsNull() {
            addCriterion("MOD_USR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andModUsrNamIsNotNull() {
            addCriterion("MOD_USR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andModUsrNamEqualTo(String value) {
            addCriterion("MOD_USR_NAM =", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamNotEqualTo(String value) {
            addCriterion("MOD_USR_NAM <>", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamGreaterThan(String value) {
            addCriterion("MOD_USR_NAM >", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USR_NAM >=", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamLessThan(String value) {
            addCriterion("MOD_USR_NAM <", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamLessThanOrEqualTo(String value) {
            addCriterion("MOD_USR_NAM <=", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamLike(String value) {
            addCriterion("MOD_USR_NAM like", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamNotLike(String value) {
            addCriterion("MOD_USR_NAM not like", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamIn(List<String> values) {
            addCriterion("MOD_USR_NAM in", values, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamNotIn(List<String> values) {
            addCriterion("MOD_USR_NAM not in", values, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamBetween(String value1, String value2) {
            addCriterion("MOD_USR_NAM between", value1, value2, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamNotBetween(String value1, String value2) {
            addCriterion("MOD_USR_NAM not between", value1, value2, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andCstDspCodIsNull() {
            addCriterion("CST_DSP_COD is null");
            return (Criteria) this;
        }

        public Criteria andCstDspCodIsNotNull() {
            addCriterion("CST_DSP_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCstDspCodEqualTo(String value) {
            addCriterion("CST_DSP_COD =", value, "cstDspCod");
            return (Criteria) this;
        }

        public Criteria andCstDspCodNotEqualTo(String value) {
            addCriterion("CST_DSP_COD <>", value, "cstDspCod");
            return (Criteria) this;
        }

        public Criteria andCstDspCodGreaterThan(String value) {
            addCriterion("CST_DSP_COD >", value, "cstDspCod");
            return (Criteria) this;
        }

        public Criteria andCstDspCodGreaterThanOrEqualTo(String value) {
            addCriterion("CST_DSP_COD >=", value, "cstDspCod");
            return (Criteria) this;
        }

        public Criteria andCstDspCodLessThan(String value) {
            addCriterion("CST_DSP_COD <", value, "cstDspCod");
            return (Criteria) this;
        }

        public Criteria andCstDspCodLessThanOrEqualTo(String value) {
            addCriterion("CST_DSP_COD <=", value, "cstDspCod");
            return (Criteria) this;
        }

        public Criteria andCstDspCodLike(String value) {
            addCriterion("CST_DSP_COD like", value, "cstDspCod");
            return (Criteria) this;
        }

        public Criteria andCstDspCodNotLike(String value) {
            addCriterion("CST_DSP_COD not like", value, "cstDspCod");
            return (Criteria) this;
        }

        public Criteria andCstDspCodIn(List<String> values) {
            addCriterion("CST_DSP_COD in", values, "cstDspCod");
            return (Criteria) this;
        }

        public Criteria andCstDspCodNotIn(List<String> values) {
            addCriterion("CST_DSP_COD not in", values, "cstDspCod");
            return (Criteria) this;
        }

        public Criteria andCstDspCodBetween(String value1, String value2) {
            addCriterion("CST_DSP_COD between", value1, value2, "cstDspCod");
            return (Criteria) this;
        }

        public Criteria andCstDspCodNotBetween(String value1, String value2) {
            addCriterion("CST_DSP_COD not between", value1, value2, "cstDspCod");
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

        public Criteria andPaiLvlCodIsNull() {
            addCriterion("PAI_LVL_COD is null");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodIsNotNull() {
            addCriterion("PAI_LVL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodEqualTo(String value) {
            addCriterion("PAI_LVL_COD =", value, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodNotEqualTo(String value) {
            addCriterion("PAI_LVL_COD <>", value, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodGreaterThan(String value) {
            addCriterion("PAI_LVL_COD >", value, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodGreaterThanOrEqualTo(String value) {
            addCriterion("PAI_LVL_COD >=", value, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodLessThan(String value) {
            addCriterion("PAI_LVL_COD <", value, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodLessThanOrEqualTo(String value) {
            addCriterion("PAI_LVL_COD <=", value, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodLike(String value) {
            addCriterion("PAI_LVL_COD like", value, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodNotLike(String value) {
            addCriterion("PAI_LVL_COD not like", value, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodIn(List<String> values) {
            addCriterion("PAI_LVL_COD in", values, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodNotIn(List<String> values) {
            addCriterion("PAI_LVL_COD not in", values, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodBetween(String value1, String value2) {
            addCriterion("PAI_LVL_COD between", value1, value2, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andPaiLvlCodNotBetween(String value1, String value2) {
            addCriterion("PAI_LVL_COD not between", value1, value2, "paiLvlCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodIsNull() {
            addCriterion("FAL_ASS_COD is null");
            return (Criteria) this;
        }

        public Criteria andFalAssCodIsNotNull() {
            addCriterion("FAL_ASS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFalAssCodEqualTo(String value) {
            addCriterion("FAL_ASS_COD =", value, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodNotEqualTo(String value) {
            addCriterion("FAL_ASS_COD <>", value, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodGreaterThan(String value) {
            addCriterion("FAL_ASS_COD >", value, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodGreaterThanOrEqualTo(String value) {
            addCriterion("FAL_ASS_COD >=", value, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodLessThan(String value) {
            addCriterion("FAL_ASS_COD <", value, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodLessThanOrEqualTo(String value) {
            addCriterion("FAL_ASS_COD <=", value, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodLike(String value) {
            addCriterion("FAL_ASS_COD like", value, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodNotLike(String value) {
            addCriterion("FAL_ASS_COD not like", value, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodIn(List<String> values) {
            addCriterion("FAL_ASS_COD in", values, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodNotIn(List<String> values) {
            addCriterion("FAL_ASS_COD not in", values, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodBetween(String value1, String value2) {
            addCriterion("FAL_ASS_COD between", value1, value2, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andFalAssCodNotBetween(String value1, String value2) {
            addCriterion("FAL_ASS_COD not between", value1, value2, "falAssCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodIsNull() {
            addCriterion("MNS_SIT_COD is null");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodIsNotNull() {
            addCriterion("MNS_SIT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodEqualTo(String value) {
            addCriterion("MNS_SIT_COD =", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodNotEqualTo(String value) {
            addCriterion("MNS_SIT_COD <>", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodGreaterThan(String value) {
            addCriterion("MNS_SIT_COD >", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodGreaterThanOrEqualTo(String value) {
            addCriterion("MNS_SIT_COD >=", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodLessThan(String value) {
            addCriterion("MNS_SIT_COD <", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodLessThanOrEqualTo(String value) {
            addCriterion("MNS_SIT_COD <=", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodLike(String value) {
            addCriterion("MNS_SIT_COD like", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodNotLike(String value) {
            addCriterion("MNS_SIT_COD not like", value, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodIn(List<String> values) {
            addCriterion("MNS_SIT_COD in", values, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodNotIn(List<String> values) {
            addCriterion("MNS_SIT_COD not in", values, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodBetween(String value1, String value2) {
            addCriterion("MNS_SIT_COD between", value1, value2, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsSitCodNotBetween(String value1, String value2) {
            addCriterion("MNS_SIT_COD not between", value1, value2, "mnsSitCod");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatIsNull() {
            addCriterion("MNS_LST_DAT is null");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatIsNotNull() {
            addCriterion("MNS_LST_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatEqualTo(Date value) {
            addCriterion("MNS_LST_DAT =", value, "mnsLstDat");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatNotEqualTo(Date value) {
            addCriterion("MNS_LST_DAT <>", value, "mnsLstDat");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatGreaterThan(Date value) {
            addCriterion("MNS_LST_DAT >", value, "mnsLstDat");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatGreaterThanOrEqualTo(Date value) {
            addCriterion("MNS_LST_DAT >=", value, "mnsLstDat");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatLessThan(Date value) {
            addCriterion("MNS_LST_DAT <", value, "mnsLstDat");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatLessThanOrEqualTo(Date value) {
            addCriterion("MNS_LST_DAT <=", value, "mnsLstDat");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatIn(List<Date> values) {
            addCriterion("MNS_LST_DAT in", values, "mnsLstDat");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatNotIn(List<Date> values) {
            addCriterion("MNS_LST_DAT not in", values, "mnsLstDat");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatBetween(Date value1, Date value2) {
            addCriterion("MNS_LST_DAT between", value1, value2, "mnsLstDat");
            return (Criteria) this;
        }

        public Criteria andMnsLstDatNotBetween(Date value1, Date value2) {
            addCriterion("MNS_LST_DAT not between", value1, value2, "mnsLstDat");
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

        public Criteria andSymSitDesIsNull() {
            addCriterion("SYM_SIT_DES is null");
            return (Criteria) this;
        }

        public Criteria andSymSitDesIsNotNull() {
            addCriterion("SYM_SIT_DES is not null");
            return (Criteria) this;
        }

        public Criteria andSymSitDesEqualTo(String value) {
            addCriterion("SYM_SIT_DES =", value, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSymSitDesNotEqualTo(String value) {
            addCriterion("SYM_SIT_DES <>", value, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSymSitDesGreaterThan(String value) {
            addCriterion("SYM_SIT_DES >", value, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSymSitDesGreaterThanOrEqualTo(String value) {
            addCriterion("SYM_SIT_DES >=", value, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSymSitDesLessThan(String value) {
            addCriterion("SYM_SIT_DES <", value, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSymSitDesLessThanOrEqualTo(String value) {
            addCriterion("SYM_SIT_DES <=", value, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSymSitDesLike(String value) {
            addCriterion("SYM_SIT_DES like", value, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSymSitDesNotLike(String value) {
            addCriterion("SYM_SIT_DES not like", value, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSymSitDesIn(List<String> values) {
            addCriterion("SYM_SIT_DES in", values, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSymSitDesNotIn(List<String> values) {
            addCriterion("SYM_SIT_DES not in", values, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSymSitDesBetween(String value1, String value2) {
            addCriterion("SYM_SIT_DES between", value1, value2, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSymSitDesNotBetween(String value1, String value2) {
            addCriterion("SYM_SIT_DES not between", value1, value2, "symSitDes");
            return (Criteria) this;
        }

        public Criteria andSavMngCodIsNull() {
            addCriterion("SAV_MNG_COD is null");
            return (Criteria) this;
        }

        public Criteria andSavMngCodIsNotNull() {
            addCriterion("SAV_MNG_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSavMngCodEqualTo(String value) {
            addCriterion("SAV_MNG_COD =", value, "savMngCod");
            return (Criteria) this;
        }

        public Criteria andSavMngCodNotEqualTo(String value) {
            addCriterion("SAV_MNG_COD <>", value, "savMngCod");
            return (Criteria) this;
        }

        public Criteria andSavMngCodGreaterThan(String value) {
            addCriterion("SAV_MNG_COD >", value, "savMngCod");
            return (Criteria) this;
        }

        public Criteria andSavMngCodGreaterThanOrEqualTo(String value) {
            addCriterion("SAV_MNG_COD >=", value, "savMngCod");
            return (Criteria) this;
        }

        public Criteria andSavMngCodLessThan(String value) {
            addCriterion("SAV_MNG_COD <", value, "savMngCod");
            return (Criteria) this;
        }

        public Criteria andSavMngCodLessThanOrEqualTo(String value) {
            addCriterion("SAV_MNG_COD <=", value, "savMngCod");
            return (Criteria) this;
        }

        public Criteria andSavMngCodLike(String value) {
            addCriterion("SAV_MNG_COD like", value, "savMngCod");
            return (Criteria) this;
        }

        public Criteria andSavMngCodNotLike(String value) {
            addCriterion("SAV_MNG_COD not like", value, "savMngCod");
            return (Criteria) this;
        }

        public Criteria andSavMngCodIn(List<String> values) {
            addCriterion("SAV_MNG_COD in", values, "savMngCod");
            return (Criteria) this;
        }

        public Criteria andSavMngCodNotIn(List<String> values) {
            addCriterion("SAV_MNG_COD not in", values, "savMngCod");
            return (Criteria) this;
        }

        public Criteria andSavMngCodBetween(String value1, String value2) {
            addCriterion("SAV_MNG_COD between", value1, value2, "savMngCod");
            return (Criteria) this;
        }

        public Criteria andSavMngCodNotBetween(String value1, String value2) {
            addCriterion("SAV_MNG_COD not between", value1, value2, "savMngCod");
            return (Criteria) this;
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

        public Criteria andOxyNbrIsNull() {
            addCriterion("OXY_NBR is null");
            return (Criteria) this;
        }

        public Criteria andOxyNbrIsNotNull() {
            addCriterion("OXY_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andOxyNbrEqualTo(Short value) {
            addCriterion("OXY_NBR =", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotEqualTo(Short value) {
            addCriterion("OXY_NBR <>", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrGreaterThan(Short value) {
            addCriterion("OXY_NBR >", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("OXY_NBR >=", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrLessThan(Short value) {
            addCriterion("OXY_NBR <", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrLessThanOrEqualTo(Short value) {
            addCriterion("OXY_NBR <=", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrIn(List<Short> values) {
            addCriterion("OXY_NBR in", values, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotIn(List<Short> values) {
            addCriterion("OXY_NBR not in", values, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrBetween(Short value1, Short value2) {
            addCriterion("OXY_NBR between", value1, value2, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotBetween(Short value1, Short value2) {
            addCriterion("OXY_NBR not between", value1, value2, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andSenStuCodIsNull() {
            addCriterion("SEN_STU_COD is null");
            return (Criteria) this;
        }

        public Criteria andSenStuCodIsNotNull() {
            addCriterion("SEN_STU_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSenStuCodEqualTo(String value) {
            addCriterion("SEN_STU_COD =", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodNotEqualTo(String value) {
            addCriterion("SEN_STU_COD <>", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodGreaterThan(String value) {
            addCriterion("SEN_STU_COD >", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodGreaterThanOrEqualTo(String value) {
            addCriterion("SEN_STU_COD >=", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodLessThan(String value) {
            addCriterion("SEN_STU_COD <", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodLessThanOrEqualTo(String value) {
            addCriterion("SEN_STU_COD <=", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodLike(String value) {
            addCriterion("SEN_STU_COD like", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodNotLike(String value) {
            addCriterion("SEN_STU_COD not like", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodIn(List<String> values) {
            addCriterion("SEN_STU_COD in", values, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodNotIn(List<String> values) {
            addCriterion("SEN_STU_COD not in", values, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodBetween(String value1, String value2) {
            addCriterion("SEN_STU_COD between", value1, value2, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodNotBetween(String value1, String value2) {
            addCriterion("SEN_STU_COD not between", value1, value2, "senStuCod");
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

        public Criteria andPastHisCodIsNull() {
            addCriterion("PAST_HIS_COD is null");
            return (Criteria) this;
        }

        public Criteria andPastHisCodIsNotNull() {
            addCriterion("PAST_HIS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPastHisCodEqualTo(String value) {
            addCriterion("PAST_HIS_COD =", value, "pastHisCod");
            return (Criteria) this;
        }

        public Criteria andPastHisCodNotEqualTo(String value) {
            addCriterion("PAST_HIS_COD <>", value, "pastHisCod");
            return (Criteria) this;
        }

        public Criteria andPastHisCodGreaterThan(String value) {
            addCriterion("PAST_HIS_COD >", value, "pastHisCod");
            return (Criteria) this;
        }

        public Criteria andPastHisCodGreaterThanOrEqualTo(String value) {
            addCriterion("PAST_HIS_COD >=", value, "pastHisCod");
            return (Criteria) this;
        }

        public Criteria andPastHisCodLessThan(String value) {
            addCriterion("PAST_HIS_COD <", value, "pastHisCod");
            return (Criteria) this;
        }

        public Criteria andPastHisCodLessThanOrEqualTo(String value) {
            addCriterion("PAST_HIS_COD <=", value, "pastHisCod");
            return (Criteria) this;
        }

        public Criteria andPastHisCodLike(String value) {
            addCriterion("PAST_HIS_COD like", value, "pastHisCod");
            return (Criteria) this;
        }

        public Criteria andPastHisCodNotLike(String value) {
            addCriterion("PAST_HIS_COD not like", value, "pastHisCod");
            return (Criteria) this;
        }

        public Criteria andPastHisCodIn(List<String> values) {
            addCriterion("PAST_HIS_COD in", values, "pastHisCod");
            return (Criteria) this;
        }

        public Criteria andPastHisCodNotIn(List<String> values) {
            addCriterion("PAST_HIS_COD not in", values, "pastHisCod");
            return (Criteria) this;
        }

        public Criteria andPastHisCodBetween(String value1, String value2) {
            addCriterion("PAST_HIS_COD between", value1, value2, "pastHisCod");
            return (Criteria) this;
        }

        public Criteria andPastHisCodNotBetween(String value1, String value2) {
            addCriterion("PAST_HIS_COD not between", value1, value2, "pastHisCod");
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

        public Criteria andRefusedSurveyIsNull() {
            addCriterion("REFUSED_SURVEY is null");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyIsNotNull() {
            addCriterion("REFUSED_SURVEY is not null");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyEqualTo(String value) {
            addCriterion("REFUSED_SURVEY =", value, "refusedSurvey");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyNotEqualTo(String value) {
            addCriterion("REFUSED_SURVEY <>", value, "refusedSurvey");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyGreaterThan(String value) {
            addCriterion("REFUSED_SURVEY >", value, "refusedSurvey");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyGreaterThanOrEqualTo(String value) {
            addCriterion("REFUSED_SURVEY >=", value, "refusedSurvey");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyLessThan(String value) {
            addCriterion("REFUSED_SURVEY <", value, "refusedSurvey");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyLessThanOrEqualTo(String value) {
            addCriterion("REFUSED_SURVEY <=", value, "refusedSurvey");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyLike(String value) {
            addCriterion("REFUSED_SURVEY like", value, "refusedSurvey");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyNotLike(String value) {
            addCriterion("REFUSED_SURVEY not like", value, "refusedSurvey");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyIn(List<String> values) {
            addCriterion("REFUSED_SURVEY in", values, "refusedSurvey");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyNotIn(List<String> values) {
            addCriterion("REFUSED_SURVEY not in", values, "refusedSurvey");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyBetween(String value1, String value2) {
            addCriterion("REFUSED_SURVEY between", value1, value2, "refusedSurvey");
            return (Criteria) this;
        }

        public Criteria andRefusedSurveyNotBetween(String value1, String value2) {
            addCriterion("REFUSED_SURVEY not between", value1, value2, "refusedSurvey");
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

        public Criteria andCspgFlgIsNull() {
            addCriterion("CSPG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCspgFlgIsNotNull() {
            addCriterion("CSPG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCspgFlgEqualTo(String value) {
            addCriterion("CSPG_FLG =", value, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgFlgNotEqualTo(String value) {
            addCriterion("CSPG_FLG <>", value, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgFlgGreaterThan(String value) {
            addCriterion("CSPG_FLG >", value, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("CSPG_FLG >=", value, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgFlgLessThan(String value) {
            addCriterion("CSPG_FLG <", value, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgFlgLessThanOrEqualTo(String value) {
            addCriterion("CSPG_FLG <=", value, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgFlgLike(String value) {
            addCriterion("CSPG_FLG like", value, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgFlgNotLike(String value) {
            addCriterion("CSPG_FLG not like", value, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgFlgIn(List<String> values) {
            addCriterion("CSPG_FLG in", values, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgFlgNotIn(List<String> values) {
            addCriterion("CSPG_FLG not in", values, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgFlgBetween(String value1, String value2) {
            addCriterion("CSPG_FLG between", value1, value2, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgFlgNotBetween(String value1, String value2) {
            addCriterion("CSPG_FLG not between", value1, value2, "cspgFlg");
            return (Criteria) this;
        }

        public Criteria andCspgCodIsNull() {
            addCriterion("CSPG_COD is null");
            return (Criteria) this;
        }

        public Criteria andCspgCodIsNotNull() {
            addCriterion("CSPG_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCspgCodEqualTo(String value) {
            addCriterion("CSPG_COD =", value, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andCspgCodNotEqualTo(String value) {
            addCriterion("CSPG_COD <>", value, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andCspgCodGreaterThan(String value) {
            addCriterion("CSPG_COD >", value, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andCspgCodGreaterThanOrEqualTo(String value) {
            addCriterion("CSPG_COD >=", value, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andCspgCodLessThan(String value) {
            addCriterion("CSPG_COD <", value, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andCspgCodLessThanOrEqualTo(String value) {
            addCriterion("CSPG_COD <=", value, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andCspgCodLike(String value) {
            addCriterion("CSPG_COD like", value, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andCspgCodNotLike(String value) {
            addCriterion("CSPG_COD not like", value, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andCspgCodIn(List<String> values) {
            addCriterion("CSPG_COD in", values, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andCspgCodNotIn(List<String> values) {
            addCriterion("CSPG_COD not in", values, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andCspgCodBetween(String value1, String value2) {
            addCriterion("CSPG_COD between", value1, value2, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andCspgCodNotBetween(String value1, String value2) {
            addCriterion("CSPG_COD not between", value1, value2, "cspgCod");
            return (Criteria) this;
        }

        public Criteria andHxknFlgIsNull() {
            addCriterion("HXKN_FLG is null");
            return (Criteria) this;
        }

        public Criteria andHxknFlgIsNotNull() {
            addCriterion("HXKN_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andHxknFlgEqualTo(String value) {
            addCriterion("HXKN_FLG =", value, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknFlgNotEqualTo(String value) {
            addCriterion("HXKN_FLG <>", value, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknFlgGreaterThan(String value) {
            addCriterion("HXKN_FLG >", value, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknFlgGreaterThanOrEqualTo(String value) {
            addCriterion("HXKN_FLG >=", value, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknFlgLessThan(String value) {
            addCriterion("HXKN_FLG <", value, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknFlgLessThanOrEqualTo(String value) {
            addCriterion("HXKN_FLG <=", value, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknFlgLike(String value) {
            addCriterion("HXKN_FLG like", value, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknFlgNotLike(String value) {
            addCriterion("HXKN_FLG not like", value, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknFlgIn(List<String> values) {
            addCriterion("HXKN_FLG in", values, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknFlgNotIn(List<String> values) {
            addCriterion("HXKN_FLG not in", values, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknFlgBetween(String value1, String value2) {
            addCriterion("HXKN_FLG between", value1, value2, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknFlgNotBetween(String value1, String value2) {
            addCriterion("HXKN_FLG not between", value1, value2, "hxknFlg");
            return (Criteria) this;
        }

        public Criteria andHxknCodIsNull() {
            addCriterion("HXKN_COD is null");
            return (Criteria) this;
        }

        public Criteria andHxknCodIsNotNull() {
            addCriterion("HXKN_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHxknCodEqualTo(String value) {
            addCriterion("HXKN_COD =", value, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknCodNotEqualTo(String value) {
            addCriterion("HXKN_COD <>", value, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknCodGreaterThan(String value) {
            addCriterion("HXKN_COD >", value, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknCodGreaterThanOrEqualTo(String value) {
            addCriterion("HXKN_COD >=", value, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknCodLessThan(String value) {
            addCriterion("HXKN_COD <", value, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknCodLessThanOrEqualTo(String value) {
            addCriterion("HXKN_COD <=", value, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknCodLike(String value) {
            addCriterion("HXKN_COD like", value, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknCodNotLike(String value) {
            addCriterion("HXKN_COD not like", value, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknCodIn(List<String> values) {
            addCriterion("HXKN_COD in", values, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknCodNotIn(List<String> values) {
            addCriterion("HXKN_COD not in", values, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknCodBetween(String value1, String value2) {
            addCriterion("HXKN_COD between", value1, value2, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknCodNotBetween(String value1, String value2) {
            addCriterion("HXKN_COD not between", value1, value2, "hxknCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodIsNull() {
            addCriterion("HXKN_SUB_COD is null");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodIsNotNull() {
            addCriterion("HXKN_SUB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodEqualTo(String value) {
            addCriterion("HXKN_SUB_COD =", value, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodNotEqualTo(String value) {
            addCriterion("HXKN_SUB_COD <>", value, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodGreaterThan(String value) {
            addCriterion("HXKN_SUB_COD >", value, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodGreaterThanOrEqualTo(String value) {
            addCriterion("HXKN_SUB_COD >=", value, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodLessThan(String value) {
            addCriterion("HXKN_SUB_COD <", value, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodLessThanOrEqualTo(String value) {
            addCriterion("HXKN_SUB_COD <=", value, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodLike(String value) {
            addCriterion("HXKN_SUB_COD like", value, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodNotLike(String value) {
            addCriterion("HXKN_SUB_COD not like", value, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodIn(List<String> values) {
            addCriterion("HXKN_SUB_COD in", values, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodNotIn(List<String> values) {
            addCriterion("HXKN_SUB_COD not in", values, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodBetween(String value1, String value2) {
            addCriterion("HXKN_SUB_COD between", value1, value2, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andHxknSubCodNotBetween(String value1, String value2) {
            addCriterion("HXKN_SUB_COD not between", value1, value2, "hxknSubCod");
            return (Criteria) this;
        }

        public Criteria andXtCodIsNull() {
            addCriterion("XT_COD is null");
            return (Criteria) this;
        }

        public Criteria andXtCodIsNotNull() {
            addCriterion("XT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXtCodEqualTo(String value) {
            addCriterion("XT_COD =", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodNotEqualTo(String value) {
            addCriterion("XT_COD <>", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodGreaterThan(String value) {
            addCriterion("XT_COD >", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodGreaterThanOrEqualTo(String value) {
            addCriterion("XT_COD >=", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodLessThan(String value) {
            addCriterion("XT_COD <", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodLessThanOrEqualTo(String value) {
            addCriterion("XT_COD <=", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodLike(String value) {
            addCriterion("XT_COD like", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodNotLike(String value) {
            addCriterion("XT_COD not like", value, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodIn(List<String> values) {
            addCriterion("XT_COD in", values, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodNotIn(List<String> values) {
            addCriterion("XT_COD not in", values, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodBetween(String value1, String value2) {
            addCriterion("XT_COD between", value1, value2, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtCodNotBetween(String value1, String value2) {
            addCriterion("XT_COD not between", value1, value2, "xtCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodIsNull() {
            addCriterion("XT_SUB_COD is null");
            return (Criteria) this;
        }

        public Criteria andXtSubCodIsNotNull() {
            addCriterion("XT_SUB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXtSubCodEqualTo(String value) {
            addCriterion("XT_SUB_COD =", value, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodNotEqualTo(String value) {
            addCriterion("XT_SUB_COD <>", value, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodGreaterThan(String value) {
            addCriterion("XT_SUB_COD >", value, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodGreaterThanOrEqualTo(String value) {
            addCriterion("XT_SUB_COD >=", value, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodLessThan(String value) {
            addCriterion("XT_SUB_COD <", value, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodLessThanOrEqualTo(String value) {
            addCriterion("XT_SUB_COD <=", value, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodLike(String value) {
            addCriterion("XT_SUB_COD like", value, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodNotLike(String value) {
            addCriterion("XT_SUB_COD not like", value, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodIn(List<String> values) {
            addCriterion("XT_SUB_COD in", values, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodNotIn(List<String> values) {
            addCriterion("XT_SUB_COD not in", values, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodBetween(String value1, String value2) {
            addCriterion("XT_SUB_COD between", value1, value2, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXtSubCodNotBetween(String value1, String value2) {
            addCriterion("XT_SUB_COD not between", value1, value2, "xtSubCod");
            return (Criteria) this;
        }

        public Criteria andXmCodIsNull() {
            addCriterion("XM_COD is null");
            return (Criteria) this;
        }

        public Criteria andXmCodIsNotNull() {
            addCriterion("XM_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXmCodEqualTo(String value) {
            addCriterion("XM_COD =", value, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmCodNotEqualTo(String value) {
            addCriterion("XM_COD <>", value, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmCodGreaterThan(String value) {
            addCriterion("XM_COD >", value, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmCodGreaterThanOrEqualTo(String value) {
            addCriterion("XM_COD >=", value, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmCodLessThan(String value) {
            addCriterion("XM_COD <", value, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmCodLessThanOrEqualTo(String value) {
            addCriterion("XM_COD <=", value, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmCodLike(String value) {
            addCriterion("XM_COD like", value, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmCodNotLike(String value) {
            addCriterion("XM_COD not like", value, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmCodIn(List<String> values) {
            addCriterion("XM_COD in", values, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmCodNotIn(List<String> values) {
            addCriterion("XM_COD not in", values, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmCodBetween(String value1, String value2) {
            addCriterion("XM_COD between", value1, value2, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmCodNotBetween(String value1, String value2) {
            addCriterion("XM_COD not between", value1, value2, "xmCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodIsNull() {
            addCriterion("XM_SUB_COD is null");
            return (Criteria) this;
        }

        public Criteria andXmSubCodIsNotNull() {
            addCriterion("XM_SUB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXmSubCodEqualTo(String value) {
            addCriterion("XM_SUB_COD =", value, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodNotEqualTo(String value) {
            addCriterion("XM_SUB_COD <>", value, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodGreaterThan(String value) {
            addCriterion("XM_SUB_COD >", value, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodGreaterThanOrEqualTo(String value) {
            addCriterion("XM_SUB_COD >=", value, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodLessThan(String value) {
            addCriterion("XM_SUB_COD <", value, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodLessThanOrEqualTo(String value) {
            addCriterion("XM_SUB_COD <=", value, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodLike(String value) {
            addCriterion("XM_SUB_COD like", value, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodNotLike(String value) {
            addCriterion("XM_SUB_COD not like", value, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodIn(List<String> values) {
            addCriterion("XM_SUB_COD in", values, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodNotIn(List<String> values) {
            addCriterion("XM_SUB_COD not in", values, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodBetween(String value1, String value2) {
            addCriterion("XM_SUB_COD between", value1, value2, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXmSubCodNotBetween(String value1, String value2) {
            addCriterion("XM_SUB_COD not between", value1, value2, "xmSubCod");
            return (Criteria) this;
        }

        public Criteria andXtFlgIsNull() {
            addCriterion("XT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXtFlgIsNotNull() {
            addCriterion("XT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtFlgEqualTo(String value) {
            addCriterion("XT_FLG =", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgNotEqualTo(String value) {
            addCriterion("XT_FLG <>", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgGreaterThan(String value) {
            addCriterion("XT_FLG >", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XT_FLG >=", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgLessThan(String value) {
            addCriterion("XT_FLG <", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgLessThanOrEqualTo(String value) {
            addCriterion("XT_FLG <=", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgLike(String value) {
            addCriterion("XT_FLG like", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgNotLike(String value) {
            addCriterion("XT_FLG not like", value, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgIn(List<String> values) {
            addCriterion("XT_FLG in", values, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgNotIn(List<String> values) {
            addCriterion("XT_FLG not in", values, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgBetween(String value1, String value2) {
            addCriterion("XT_FLG between", value1, value2, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXtFlgNotBetween(String value1, String value2) {
            addCriterion("XT_FLG not between", value1, value2, "xtFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgIsNull() {
            addCriterion("XM_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXmFlgIsNotNull() {
            addCriterion("XM_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXmFlgEqualTo(String value) {
            addCriterion("XM_FLG =", value, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgNotEqualTo(String value) {
            addCriterion("XM_FLG <>", value, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgGreaterThan(String value) {
            addCriterion("XM_FLG >", value, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XM_FLG >=", value, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgLessThan(String value) {
            addCriterion("XM_FLG <", value, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgLessThanOrEqualTo(String value) {
            addCriterion("XM_FLG <=", value, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgLike(String value) {
            addCriterion("XM_FLG like", value, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgNotLike(String value) {
            addCriterion("XM_FLG not like", value, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgIn(List<String> values) {
            addCriterion("XM_FLG in", values, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgNotIn(List<String> values) {
            addCriterion("XM_FLG not in", values, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgBetween(String value1, String value2) {
            addCriterion("XM_FLG between", value1, value2, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andXmFlgNotBetween(String value1, String value2) {
            addCriterion("XM_FLG not between", value1, value2, "xmFlg");
            return (Criteria) this;
        }

        public Criteria andSwChlIsNull() {
            addCriterion("SW_CHL is null");
            return (Criteria) this;
        }

        public Criteria andSwChlIsNotNull() {
            addCriterion("SW_CHL is not null");
            return (Criteria) this;
        }

        public Criteria andSwChlEqualTo(String value) {
            addCriterion("SW_CHL =", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlNotEqualTo(String value) {
            addCriterion("SW_CHL <>", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlGreaterThan(String value) {
            addCriterion("SW_CHL >", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlGreaterThanOrEqualTo(String value) {
            addCriterion("SW_CHL >=", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlLessThan(String value) {
            addCriterion("SW_CHL <", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlLessThanOrEqualTo(String value) {
            addCriterion("SW_CHL <=", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlLike(String value) {
            addCriterion("SW_CHL like", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlNotLike(String value) {
            addCriterion("SW_CHL not like", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlIn(List<String> values) {
            addCriterion("SW_CHL in", values, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlNotIn(List<String> values) {
            addCriterion("SW_CHL not in", values, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlBetween(String value1, String value2) {
            addCriterion("SW_CHL between", value1, value2, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlNotBetween(String value1, String value2) {
            addCriterion("SW_CHL not between", value1, value2, "swChl");
            return (Criteria) this;
        }

        public Criteria andEmgJobIsNull() {
            addCriterion("EMG_JOB is null");
            return (Criteria) this;
        }

        public Criteria andEmgJobIsNotNull() {
            addCriterion("EMG_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andEmgJobEqualTo(String value) {
            addCriterion("EMG_JOB =", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobNotEqualTo(String value) {
            addCriterion("EMG_JOB <>", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobGreaterThan(String value) {
            addCriterion("EMG_JOB >", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_JOB >=", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobLessThan(String value) {
            addCriterion("EMG_JOB <", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobLessThanOrEqualTo(String value) {
            addCriterion("EMG_JOB <=", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobLike(String value) {
            addCriterion("EMG_JOB like", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobNotLike(String value) {
            addCriterion("EMG_JOB not like", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobIn(List<String> values) {
            addCriterion("EMG_JOB in", values, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobNotIn(List<String> values) {
            addCriterion("EMG_JOB not in", values, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobBetween(String value1, String value2) {
            addCriterion("EMG_JOB between", value1, value2, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobNotBetween(String value1, String value2) {
            addCriterion("EMG_JOB not between", value1, value2, "emgJob");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("MARITAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("MARITAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("MARITAL_STATUS =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("MARITAL_STATUS <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("MARITAL_STATUS >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("MARITAL_STATUS <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("MARITAL_STATUS like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("MARITAL_STATUS not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("MARITAL_STATUS in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("MARITAL_STATUS not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmgBedIsNull() {
            addCriterion("EMG_BED is null");
            return (Criteria) this;
        }

        public Criteria andEmgBedIsNotNull() {
            addCriterion("EMG_BED is not null");
            return (Criteria) this;
        }

        public Criteria andEmgBedEqualTo(String value) {
            addCriterion("EMG_BED =", value, "emgBed");
            return (Criteria) this;
        }

        public Criteria andEmgBedNotEqualTo(String value) {
            addCriterion("EMG_BED <>", value, "emgBed");
            return (Criteria) this;
        }

        public Criteria andEmgBedGreaterThan(String value) {
            addCriterion("EMG_BED >", value, "emgBed");
            return (Criteria) this;
        }

        public Criteria andEmgBedGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_BED >=", value, "emgBed");
            return (Criteria) this;
        }

        public Criteria andEmgBedLessThan(String value) {
            addCriterion("EMG_BED <", value, "emgBed");
            return (Criteria) this;
        }

        public Criteria andEmgBedLessThanOrEqualTo(String value) {
            addCriterion("EMG_BED <=", value, "emgBed");
            return (Criteria) this;
        }

        public Criteria andEmgBedLike(String value) {
            addCriterion("EMG_BED like", value, "emgBed");
            return (Criteria) this;
        }

        public Criteria andEmgBedNotLike(String value) {
            addCriterion("EMG_BED not like", value, "emgBed");
            return (Criteria) this;
        }

        public Criteria andEmgBedIn(List<String> values) {
            addCriterion("EMG_BED in", values, "emgBed");
            return (Criteria) this;
        }

        public Criteria andEmgBedNotIn(List<String> values) {
            addCriterion("EMG_BED not in", values, "emgBed");
            return (Criteria) this;
        }

        public Criteria andEmgBedBetween(String value1, String value2) {
            addCriterion("EMG_BED between", value1, value2, "emgBed");
            return (Criteria) this;
        }

        public Criteria andEmgBedNotBetween(String value1, String value2) {
            addCriterion("EMG_BED not between", value1, value2, "emgBed");
            return (Criteria) this;
        }

        public Criteria andNowHisIsNull() {
            addCriterion("NOW_HIS is null");
            return (Criteria) this;
        }

        public Criteria andNowHisIsNotNull() {
            addCriterion("NOW_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andNowHisEqualTo(String value) {
            addCriterion("NOW_HIS =", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisNotEqualTo(String value) {
            addCriterion("NOW_HIS <>", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisGreaterThan(String value) {
            addCriterion("NOW_HIS >", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisGreaterThanOrEqualTo(String value) {
            addCriterion("NOW_HIS >=", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisLessThan(String value) {
            addCriterion("NOW_HIS <", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisLessThanOrEqualTo(String value) {
            addCriterion("NOW_HIS <=", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisLike(String value) {
            addCriterion("NOW_HIS like", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisNotLike(String value) {
            addCriterion("NOW_HIS not like", value, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisIn(List<String> values) {
            addCriterion("NOW_HIS in", values, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisNotIn(List<String> values) {
            addCriterion("NOW_HIS not in", values, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisBetween(String value1, String value2) {
            addCriterion("NOW_HIS between", value1, value2, "nowHis");
            return (Criteria) this;
        }

        public Criteria andNowHisNotBetween(String value1, String value2) {
            addCriterion("NOW_HIS not between", value1, value2, "nowHis");
            return (Criteria) this;
        }

        public Criteria andPastHisIsNull() {
            addCriterion("PAST_HIS is null");
            return (Criteria) this;
        }

        public Criteria andPastHisIsNotNull() {
            addCriterion("PAST_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andPastHisEqualTo(String value) {
            addCriterion("PAST_HIS =", value, "pastHis");
            return (Criteria) this;
        }

        public Criteria andPastHisNotEqualTo(String value) {
            addCriterion("PAST_HIS <>", value, "pastHis");
            return (Criteria) this;
        }

        public Criteria andPastHisGreaterThan(String value) {
            addCriterion("PAST_HIS >", value, "pastHis");
            return (Criteria) this;
        }

        public Criteria andPastHisGreaterThanOrEqualTo(String value) {
            addCriterion("PAST_HIS >=", value, "pastHis");
            return (Criteria) this;
        }

        public Criteria andPastHisLessThan(String value) {
            addCriterion("PAST_HIS <", value, "pastHis");
            return (Criteria) this;
        }

        public Criteria andPastHisLessThanOrEqualTo(String value) {
            addCriterion("PAST_HIS <=", value, "pastHis");
            return (Criteria) this;
        }

        public Criteria andPastHisLike(String value) {
            addCriterion("PAST_HIS like", value, "pastHis");
            return (Criteria) this;
        }

        public Criteria andPastHisNotLike(String value) {
            addCriterion("PAST_HIS not like", value, "pastHis");
            return (Criteria) this;
        }

        public Criteria andPastHisIn(List<String> values) {
            addCriterion("PAST_HIS in", values, "pastHis");
            return (Criteria) this;
        }

        public Criteria andPastHisNotIn(List<String> values) {
            addCriterion("PAST_HIS not in", values, "pastHis");
            return (Criteria) this;
        }

        public Criteria andPastHisBetween(String value1, String value2) {
            addCriterion("PAST_HIS between", value1, value2, "pastHis");
            return (Criteria) this;
        }

        public Criteria andPastHisNotBetween(String value1, String value2) {
            addCriterion("PAST_HIS not between", value1, value2, "pastHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisIsNull() {
            addCriterion("CASE_HIS is null");
            return (Criteria) this;
        }

        public Criteria andCaseHisIsNotNull() {
            addCriterion("CASE_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andCaseHisEqualTo(String value) {
            addCriterion("CASE_HIS =", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisNotEqualTo(String value) {
            addCriterion("CASE_HIS <>", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisGreaterThan(String value) {
            addCriterion("CASE_HIS >", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_HIS >=", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisLessThan(String value) {
            addCriterion("CASE_HIS <", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisLessThanOrEqualTo(String value) {
            addCriterion("CASE_HIS <=", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisLike(String value) {
            addCriterion("CASE_HIS like", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisNotLike(String value) {
            addCriterion("CASE_HIS not like", value, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisIn(List<String> values) {
            addCriterion("CASE_HIS in", values, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisNotIn(List<String> values) {
            addCriterion("CASE_HIS not in", values, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisBetween(String value1, String value2) {
            addCriterion("CASE_HIS between", value1, value2, "caseHis");
            return (Criteria) this;
        }

        public Criteria andCaseHisNotBetween(String value1, String value2) {
            addCriterion("CASE_HIS not between", value1, value2, "caseHis");
            return (Criteria) this;
        }

        public Criteria andIsFetationIsNull() {
            addCriterion("IS_FETATION is null");
            return (Criteria) this;
        }

        public Criteria andIsFetationIsNotNull() {
            addCriterion("IS_FETATION is not null");
            return (Criteria) this;
        }

        public Criteria andIsFetationEqualTo(String value) {
            addCriterion("IS_FETATION =", value, "isFetation");
            return (Criteria) this;
        }

        public Criteria andIsFetationNotEqualTo(String value) {
            addCriterion("IS_FETATION <>", value, "isFetation");
            return (Criteria) this;
        }

        public Criteria andIsFetationGreaterThan(String value) {
            addCriterion("IS_FETATION >", value, "isFetation");
            return (Criteria) this;
        }

        public Criteria andIsFetationGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FETATION >=", value, "isFetation");
            return (Criteria) this;
        }

        public Criteria andIsFetationLessThan(String value) {
            addCriterion("IS_FETATION <", value, "isFetation");
            return (Criteria) this;
        }

        public Criteria andIsFetationLessThanOrEqualTo(String value) {
            addCriterion("IS_FETATION <=", value, "isFetation");
            return (Criteria) this;
        }

        public Criteria andIsFetationLike(String value) {
            addCriterion("IS_FETATION like", value, "isFetation");
            return (Criteria) this;
        }

        public Criteria andIsFetationNotLike(String value) {
            addCriterion("IS_FETATION not like", value, "isFetation");
            return (Criteria) this;
        }

        public Criteria andIsFetationIn(List<String> values) {
            addCriterion("IS_FETATION in", values, "isFetation");
            return (Criteria) this;
        }

        public Criteria andIsFetationNotIn(List<String> values) {
            addCriterion("IS_FETATION not in", values, "isFetation");
            return (Criteria) this;
        }

        public Criteria andIsFetationBetween(String value1, String value2) {
            addCriterion("IS_FETATION between", value1, value2, "isFetation");
            return (Criteria) this;
        }

        public Criteria andIsFetationNotBetween(String value1, String value2) {
            addCriterion("IS_FETATION not between", value1, value2, "isFetation");
            return (Criteria) this;
        }

        public Criteria andKsfzIsNull() {
            addCriterion("KSFZ is null");
            return (Criteria) this;
        }

        public Criteria andKsfzIsNotNull() {
            addCriterion("KSFZ is not null");
            return (Criteria) this;
        }

        public Criteria andKsfzEqualTo(String value) {
            addCriterion("KSFZ =", value, "ksfz");
            return (Criteria) this;
        }

        public Criteria andKsfzNotEqualTo(String value) {
            addCriterion("KSFZ <>", value, "ksfz");
            return (Criteria) this;
        }

        public Criteria andKsfzGreaterThan(String value) {
            addCriterion("KSFZ >", value, "ksfz");
            return (Criteria) this;
        }

        public Criteria andKsfzGreaterThanOrEqualTo(String value) {
            addCriterion("KSFZ >=", value, "ksfz");
            return (Criteria) this;
        }

        public Criteria andKsfzLessThan(String value) {
            addCriterion("KSFZ <", value, "ksfz");
            return (Criteria) this;
        }

        public Criteria andKsfzLessThanOrEqualTo(String value) {
            addCriterion("KSFZ <=", value, "ksfz");
            return (Criteria) this;
        }

        public Criteria andKsfzLike(String value) {
            addCriterion("KSFZ like", value, "ksfz");
            return (Criteria) this;
        }

        public Criteria andKsfzNotLike(String value) {
            addCriterion("KSFZ not like", value, "ksfz");
            return (Criteria) this;
        }

        public Criteria andKsfzIn(List<String> values) {
            addCriterion("KSFZ in", values, "ksfz");
            return (Criteria) this;
        }

        public Criteria andKsfzNotIn(List<String> values) {
            addCriterion("KSFZ not in", values, "ksfz");
            return (Criteria) this;
        }

        public Criteria andKsfzBetween(String value1, String value2) {
            addCriterion("KSFZ between", value1, value2, "ksfz");
            return (Criteria) this;
        }

        public Criteria andKsfzNotBetween(String value1, String value2) {
            addCriterion("KSFZ not between", value1, value2, "ksfz");
            return (Criteria) this;
        }

        public Criteria andPatidIsNull() {
            addCriterion("PATID is null");
            return (Criteria) this;
        }

        public Criteria andPatidIsNotNull() {
            addCriterion("PATID is not null");
            return (Criteria) this;
        }

        public Criteria andPatidEqualTo(String value) {
            addCriterion("PATID =", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotEqualTo(String value) {
            addCriterion("PATID <>", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidGreaterThan(String value) {
            addCriterion("PATID >", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidGreaterThanOrEqualTo(String value) {
            addCriterion("PATID >=", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidLessThan(String value) {
            addCriterion("PATID <", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidLessThanOrEqualTo(String value) {
            addCriterion("PATID <=", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidLike(String value) {
            addCriterion("PATID like", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotLike(String value) {
            addCriterion("PATID not like", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidIn(List<String> values) {
            addCriterion("PATID in", values, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotIn(List<String> values) {
            addCriterion("PATID not in", values, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidBetween(String value1, String value2) {
            addCriterion("PATID between", value1, value2, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotBetween(String value1, String value2) {
            addCriterion("PATID not between", value1, value2, "patid");
            return (Criteria) this;
        }

        public Criteria andRyzdXyIsNull() {
            addCriterion("RYZD_XY is null");
            return (Criteria) this;
        }

        public Criteria andRyzdXyIsNotNull() {
            addCriterion("RYZD_XY is not null");
            return (Criteria) this;
        }

        public Criteria andRyzdXyEqualTo(String value) {
            addCriterion("RYZD_XY =", value, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andRyzdXyNotEqualTo(String value) {
            addCriterion("RYZD_XY <>", value, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andRyzdXyGreaterThan(String value) {
            addCriterion("RYZD_XY >", value, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andRyzdXyGreaterThanOrEqualTo(String value) {
            addCriterion("RYZD_XY >=", value, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andRyzdXyLessThan(String value) {
            addCriterion("RYZD_XY <", value, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andRyzdXyLessThanOrEqualTo(String value) {
            addCriterion("RYZD_XY <=", value, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andRyzdXyLike(String value) {
            addCriterion("RYZD_XY like", value, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andRyzdXyNotLike(String value) {
            addCriterion("RYZD_XY not like", value, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andRyzdXyIn(List<String> values) {
            addCriterion("RYZD_XY in", values, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andRyzdXyNotIn(List<String> values) {
            addCriterion("RYZD_XY not in", values, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andRyzdXyBetween(String value1, String value2) {
            addCriterion("RYZD_XY between", value1, value2, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andRyzdXyNotBetween(String value1, String value2) {
            addCriterion("RYZD_XY not between", value1, value2, "ryzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyIsNull() {
            addCriterion("CYZD_ZY is null");
            return (Criteria) this;
        }

        public Criteria andCyzdZyIsNotNull() {
            addCriterion("CYZD_ZY is not null");
            return (Criteria) this;
        }

        public Criteria andCyzdZyEqualTo(String value) {
            addCriterion("CYZD_ZY =", value, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyNotEqualTo(String value) {
            addCriterion("CYZD_ZY <>", value, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyGreaterThan(String value) {
            addCriterion("CYZD_ZY >", value, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyGreaterThanOrEqualTo(String value) {
            addCriterion("CYZD_ZY >=", value, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyLessThan(String value) {
            addCriterion("CYZD_ZY <", value, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyLessThanOrEqualTo(String value) {
            addCriterion("CYZD_ZY <=", value, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyLike(String value) {
            addCriterion("CYZD_ZY like", value, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyNotLike(String value) {
            addCriterion("CYZD_ZY not like", value, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyIn(List<String> values) {
            addCriterion("CYZD_ZY in", values, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyNotIn(List<String> values) {
            addCriterion("CYZD_ZY not in", values, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyBetween(String value1, String value2) {
            addCriterion("CYZD_ZY between", value1, value2, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdZyNotBetween(String value1, String value2) {
            addCriterion("CYZD_ZY not between", value1, value2, "cyzdZy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyIsNull() {
            addCriterion("CYZD_XY is null");
            return (Criteria) this;
        }

        public Criteria andCyzdXyIsNotNull() {
            addCriterion("CYZD_XY is not null");
            return (Criteria) this;
        }

        public Criteria andCyzdXyEqualTo(String value) {
            addCriterion("CYZD_XY =", value, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyNotEqualTo(String value) {
            addCriterion("CYZD_XY <>", value, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyGreaterThan(String value) {
            addCriterion("CYZD_XY >", value, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyGreaterThanOrEqualTo(String value) {
            addCriterion("CYZD_XY >=", value, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyLessThan(String value) {
            addCriterion("CYZD_XY <", value, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyLessThanOrEqualTo(String value) {
            addCriterion("CYZD_XY <=", value, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyLike(String value) {
            addCriterion("CYZD_XY like", value, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyNotLike(String value) {
            addCriterion("CYZD_XY not like", value, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyIn(List<String> values) {
            addCriterion("CYZD_XY in", values, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyNotIn(List<String> values) {
            addCriterion("CYZD_XY not in", values, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyBetween(String value1, String value2) {
            addCriterion("CYZD_XY between", value1, value2, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andCyzdXyNotBetween(String value1, String value2) {
            addCriterion("CYZD_XY not between", value1, value2, "cyzdXy");
            return (Criteria) this;
        }

        public Criteria andObservationCodeIsNull() {
            addCriterion("OBSERVATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andObservationCodeIsNotNull() {
            addCriterion("OBSERVATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andObservationCodeEqualTo(String value) {
            addCriterion("OBSERVATION_CODE =", value, "observationCode");
            return (Criteria) this;
        }

        public Criteria andObservationCodeNotEqualTo(String value) {
            addCriterion("OBSERVATION_CODE <>", value, "observationCode");
            return (Criteria) this;
        }

        public Criteria andObservationCodeGreaterThan(String value) {
            addCriterion("OBSERVATION_CODE >", value, "observationCode");
            return (Criteria) this;
        }

        public Criteria andObservationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OBSERVATION_CODE >=", value, "observationCode");
            return (Criteria) this;
        }

        public Criteria andObservationCodeLessThan(String value) {
            addCriterion("OBSERVATION_CODE <", value, "observationCode");
            return (Criteria) this;
        }

        public Criteria andObservationCodeLessThanOrEqualTo(String value) {
            addCriterion("OBSERVATION_CODE <=", value, "observationCode");
            return (Criteria) this;
        }

        public Criteria andObservationCodeLike(String value) {
            addCriterion("OBSERVATION_CODE like", value, "observationCode");
            return (Criteria) this;
        }

        public Criteria andObservationCodeNotLike(String value) {
            addCriterion("OBSERVATION_CODE not like", value, "observationCode");
            return (Criteria) this;
        }

        public Criteria andObservationCodeIn(List<String> values) {
            addCriterion("OBSERVATION_CODE in", values, "observationCode");
            return (Criteria) this;
        }

        public Criteria andObservationCodeNotIn(List<String> values) {
            addCriterion("OBSERVATION_CODE not in", values, "observationCode");
            return (Criteria) this;
        }

        public Criteria andObservationCodeBetween(String value1, String value2) {
            addCriterion("OBSERVATION_CODE between", value1, value2, "observationCode");
            return (Criteria) this;
        }

        public Criteria andObservationCodeNotBetween(String value1, String value2) {
            addCriterion("OBSERVATION_CODE not between", value1, value2, "observationCode");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisIsNull() {
            addCriterion("DEATH_DIAGNOSIS is null");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisIsNotNull() {
            addCriterion("DEATH_DIAGNOSIS is not null");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisEqualTo(String value) {
            addCriterion("DEATH_DIAGNOSIS =", value, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisNotEqualTo(String value) {
            addCriterion("DEATH_DIAGNOSIS <>", value, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisGreaterThan(String value) {
            addCriterion("DEATH_DIAGNOSIS >", value, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("DEATH_DIAGNOSIS >=", value, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisLessThan(String value) {
            addCriterion("DEATH_DIAGNOSIS <", value, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisLessThanOrEqualTo(String value) {
            addCriterion("DEATH_DIAGNOSIS <=", value, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisLike(String value) {
            addCriterion("DEATH_DIAGNOSIS like", value, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisNotLike(String value) {
            addCriterion("DEATH_DIAGNOSIS not like", value, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisIn(List<String> values) {
            addCriterion("DEATH_DIAGNOSIS in", values, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisNotIn(List<String> values) {
            addCriterion("DEATH_DIAGNOSIS not in", values, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisBetween(String value1, String value2) {
            addCriterion("DEATH_DIAGNOSIS between", value1, value2, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andDeathDiagnosisNotBetween(String value1, String value2) {
            addCriterion("DEATH_DIAGNOSIS not between", value1, value2, "deathDiagnosis");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherIsNull() {
            addCriterion("SPECIAL_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherIsNotNull() {
            addCriterion("SPECIAL_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherEqualTo(String value) {
            addCriterion("SPECIAL_OTHER =", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherNotEqualTo(String value) {
            addCriterion("SPECIAL_OTHER <>", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherGreaterThan(String value) {
            addCriterion("SPECIAL_OTHER >", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIAL_OTHER >=", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherLessThan(String value) {
            addCriterion("SPECIAL_OTHER <", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherLessThanOrEqualTo(String value) {
            addCriterion("SPECIAL_OTHER <=", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherLike(String value) {
            addCriterion("SPECIAL_OTHER like", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherNotLike(String value) {
            addCriterion("SPECIAL_OTHER not like", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherIn(List<String> values) {
            addCriterion("SPECIAL_OTHER in", values, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherNotIn(List<String> values) {
            addCriterion("SPECIAL_OTHER not in", values, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherBetween(String value1, String value2) {
            addCriterion("SPECIAL_OTHER between", value1, value2, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherNotBetween(String value1, String value2) {
            addCriterion("SPECIAL_OTHER not between", value1, value2, "specialOther");
            return (Criteria) this;
        }

        public Criteria andDocDatIsNull() {
            addCriterion("DOC_DAT is null");
            return (Criteria) this;
        }

        public Criteria andDocDatIsNotNull() {
            addCriterion("DOC_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andDocDatEqualTo(Date value) {
            addCriterion("DOC_DAT =", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatNotEqualTo(Date value) {
            addCriterion("DOC_DAT <>", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatGreaterThan(Date value) {
            addCriterion("DOC_DAT >", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatGreaterThanOrEqualTo(Date value) {
            addCriterion("DOC_DAT >=", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatLessThan(Date value) {
            addCriterion("DOC_DAT <", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatLessThanOrEqualTo(Date value) {
            addCriterion("DOC_DAT <=", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatIn(List<Date> values) {
            addCriterion("DOC_DAT in", values, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatNotIn(List<Date> values) {
            addCriterion("DOC_DAT not in", values, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatBetween(Date value1, Date value2) {
            addCriterion("DOC_DAT between", value1, value2, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatNotBetween(Date value1, Date value2) {
            addCriterion("DOC_DAT not between", value1, value2, "docDat");
            return (Criteria) this;
        }

        public Criteria andPatientTypIsNull() {
            addCriterion("PATIENT_TYP is null");
            return (Criteria) this;
        }

        public Criteria andPatientTypIsNotNull() {
            addCriterion("PATIENT_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andPatientTypEqualTo(String value) {
            addCriterion("PATIENT_TYP =", value, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPatientTypNotEqualTo(String value) {
            addCriterion("PATIENT_TYP <>", value, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPatientTypGreaterThan(String value) {
            addCriterion("PATIENT_TYP >", value, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPatientTypGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_TYP >=", value, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPatientTypLessThan(String value) {
            addCriterion("PATIENT_TYP <", value, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPatientTypLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_TYP <=", value, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPatientTypLike(String value) {
            addCriterion("PATIENT_TYP like", value, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPatientTypNotLike(String value) {
            addCriterion("PATIENT_TYP not like", value, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPatientTypIn(List<String> values) {
            addCriterion("PATIENT_TYP in", values, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPatientTypNotIn(List<String> values) {
            addCriterion("PATIENT_TYP not in", values, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPatientTypBetween(String value1, String value2) {
            addCriterion("PATIENT_TYP between", value1, value2, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPatientTypNotBetween(String value1, String value2) {
            addCriterion("PATIENT_TYP not between", value1, value2, "patientTyp");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodIsNull() {
            addCriterion("PREGNANT_YDCX_COD is null");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodIsNotNull() {
            addCriterion("PREGNANT_YDCX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodEqualTo(String value) {
            addCriterion("PREGNANT_YDCX_COD =", value, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodNotEqualTo(String value) {
            addCriterion("PREGNANT_YDCX_COD <>", value, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodGreaterThan(String value) {
            addCriterion("PREGNANT_YDCX_COD >", value, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodGreaterThanOrEqualTo(String value) {
            addCriterion("PREGNANT_YDCX_COD >=", value, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodLessThan(String value) {
            addCriterion("PREGNANT_YDCX_COD <", value, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodLessThanOrEqualTo(String value) {
            addCriterion("PREGNANT_YDCX_COD <=", value, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodLike(String value) {
            addCriterion("PREGNANT_YDCX_COD like", value, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodNotLike(String value) {
            addCriterion("PREGNANT_YDCX_COD not like", value, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodIn(List<String> values) {
            addCriterion("PREGNANT_YDCX_COD in", values, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodNotIn(List<String> values) {
            addCriterion("PREGNANT_YDCX_COD not in", values, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodBetween(String value1, String value2) {
            addCriterion("PREGNANT_YDCX_COD between", value1, value2, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantYdcxCodNotBetween(String value1, String value2) {
            addCriterion("PREGNANT_YDCX_COD not between", value1, value2, "pregnantYdcxCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodIsNull() {
            addCriterion("PREGNANT_GSPL_COD is null");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodIsNotNull() {
            addCriterion("PREGNANT_GSPL_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodEqualTo(String value) {
            addCriterion("PREGNANT_GSPL_COD =", value, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodNotEqualTo(String value) {
            addCriterion("PREGNANT_GSPL_COD <>", value, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodGreaterThan(String value) {
            addCriterion("PREGNANT_GSPL_COD >", value, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodGreaterThanOrEqualTo(String value) {
            addCriterion("PREGNANT_GSPL_COD >=", value, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodLessThan(String value) {
            addCriterion("PREGNANT_GSPL_COD <", value, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodLessThanOrEqualTo(String value) {
            addCriterion("PREGNANT_GSPL_COD <=", value, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodLike(String value) {
            addCriterion("PREGNANT_GSPL_COD like", value, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodNotLike(String value) {
            addCriterion("PREGNANT_GSPL_COD not like", value, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodIn(List<String> values) {
            addCriterion("PREGNANT_GSPL_COD in", values, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodNotIn(List<String> values) {
            addCriterion("PREGNANT_GSPL_COD not in", values, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodBetween(String value1, String value2) {
            addCriterion("PREGNANT_GSPL_COD between", value1, value2, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andPregnantGsplCodNotBetween(String value1, String value2) {
            addCriterion("PREGNANT_GSPL_COD not between", value1, value2, "pregnantGsplCod");
            return (Criteria) this;
        }

        public Criteria andJzxhIsNull() {
            addCriterion("JZXH is null");
            return (Criteria) this;
        }

        public Criteria andJzxhIsNotNull() {
            addCriterion("JZXH is not null");
            return (Criteria) this;
        }

        public Criteria andJzxhEqualTo(Long value) {
            addCriterion("JZXH =", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhNotEqualTo(Long value) {
            addCriterion("JZXH <>", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhGreaterThan(Long value) {
            addCriterion("JZXH >", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhGreaterThanOrEqualTo(Long value) {
            addCriterion("JZXH >=", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhLessThan(Long value) {
            addCriterion("JZXH <", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhLessThanOrEqualTo(Long value) {
            addCriterion("JZXH <=", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhIn(List<Long> values) {
            addCriterion("JZXH in", values, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhNotIn(List<Long> values) {
            addCriterion("JZXH not in", values, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhBetween(Long value1, Long value2) {
            addCriterion("JZXH between", value1, value2, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhNotBetween(Long value1, Long value2) {
            addCriterion("JZXH not between", value1, value2, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzysIsNull() {
            addCriterion("JZYS is null");
            return (Criteria) this;
        }

        public Criteria andJzysIsNotNull() {
            addCriterion("JZYS is not null");
            return (Criteria) this;
        }

        public Criteria andJzysEqualTo(String value) {
            addCriterion("JZYS =", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysNotEqualTo(String value) {
            addCriterion("JZYS <>", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysGreaterThan(String value) {
            addCriterion("JZYS >", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysGreaterThanOrEqualTo(String value) {
            addCriterion("JZYS >=", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysLessThan(String value) {
            addCriterion("JZYS <", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysLessThanOrEqualTo(String value) {
            addCriterion("JZYS <=", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysLike(String value) {
            addCriterion("JZYS like", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysNotLike(String value) {
            addCriterion("JZYS not like", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysIn(List<String> values) {
            addCriterion("JZYS in", values, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysNotIn(List<String> values) {
            addCriterion("JZYS not in", values, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysBetween(String value1, String value2) {
            addCriterion("JZYS between", value1, value2, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysNotBetween(String value1, String value2) {
            addCriterion("JZYS not between", value1, value2, "jzys");
            return (Criteria) this;
        }

        public Criteria andYsxmIsNull() {
            addCriterion("YSXM is null");
            return (Criteria) this;
        }

        public Criteria andYsxmIsNotNull() {
            addCriterion("YSXM is not null");
            return (Criteria) this;
        }

        public Criteria andYsxmEqualTo(String value) {
            addCriterion("YSXM =", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmNotEqualTo(String value) {
            addCriterion("YSXM <>", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmGreaterThan(String value) {
            addCriterion("YSXM >", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmGreaterThanOrEqualTo(String value) {
            addCriterion("YSXM >=", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmLessThan(String value) {
            addCriterion("YSXM <", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmLessThanOrEqualTo(String value) {
            addCriterion("YSXM <=", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmLike(String value) {
            addCriterion("YSXM like", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmNotLike(String value) {
            addCriterion("YSXM not like", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmIn(List<String> values) {
            addCriterion("YSXM in", values, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmNotIn(List<String> values) {
            addCriterion("YSXM not in", values, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmBetween(String value1, String value2) {
            addCriterion("YSXM between", value1, value2, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmNotBetween(String value1, String value2) {
            addCriterion("YSXM not between", value1, value2, "ysxm");
            return (Criteria) this;
        }

        public Criteria andKsdmIsNull() {
            addCriterion("KSDM is null");
            return (Criteria) this;
        }

        public Criteria andKsdmIsNotNull() {
            addCriterion("KSDM is not null");
            return (Criteria) this;
        }

        public Criteria andKsdmEqualTo(String value) {
            addCriterion("KSDM =", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotEqualTo(String value) {
            addCriterion("KSDM <>", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmGreaterThan(String value) {
            addCriterion("KSDM >", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmGreaterThanOrEqualTo(String value) {
            addCriterion("KSDM >=", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmLessThan(String value) {
            addCriterion("KSDM <", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmLessThanOrEqualTo(String value) {
            addCriterion("KSDM <=", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmLike(String value) {
            addCriterion("KSDM like", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotLike(String value) {
            addCriterion("KSDM not like", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmIn(List<String> values) {
            addCriterion("KSDM in", values, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotIn(List<String> values) {
            addCriterion("KSDM not in", values, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmBetween(String value1, String value2) {
            addCriterion("KSDM between", value1, value2, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotBetween(String value1, String value2) {
            addCriterion("KSDM not between", value1, value2, "ksdm");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorIsNull() {
            addCriterion("CHECK_DOCTOR is null");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorIsNotNull() {
            addCriterion("CHECK_DOCTOR is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorEqualTo(String value) {
            addCriterion("CHECK_DOCTOR =", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNotEqualTo(String value) {
            addCriterion("CHECK_DOCTOR <>", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorGreaterThan(String value) {
            addCriterion("CHECK_DOCTOR >", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_DOCTOR >=", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorLessThan(String value) {
            addCriterion("CHECK_DOCTOR <", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorLessThanOrEqualTo(String value) {
            addCriterion("CHECK_DOCTOR <=", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorLike(String value) {
            addCriterion("CHECK_DOCTOR like", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNotLike(String value) {
            addCriterion("CHECK_DOCTOR not like", value, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorIn(List<String> values) {
            addCriterion("CHECK_DOCTOR in", values, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNotIn(List<String> values) {
            addCriterion("CHECK_DOCTOR not in", values, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorBetween(String value1, String value2) {
            addCriterion("CHECK_DOCTOR between", value1, value2, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNotBetween(String value1, String value2) {
            addCriterion("CHECK_DOCTOR not between", value1, value2, "checkDoctor");
            return (Criteria) this;
        }

        public Criteria andCheckNurseIsNull() {
            addCriterion("CHECK_NURSE is null");
            return (Criteria) this;
        }

        public Criteria andCheckNurseIsNotNull() {
            addCriterion("CHECK_NURSE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNurseEqualTo(String value) {
            addCriterion("CHECK_NURSE =", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseNotEqualTo(String value) {
            addCriterion("CHECK_NURSE <>", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseGreaterThan(String value) {
            addCriterion("CHECK_NURSE >", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_NURSE >=", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseLessThan(String value) {
            addCriterion("CHECK_NURSE <", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseLessThanOrEqualTo(String value) {
            addCriterion("CHECK_NURSE <=", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseLike(String value) {
            addCriterion("CHECK_NURSE like", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseNotLike(String value) {
            addCriterion("CHECK_NURSE not like", value, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseIn(List<String> values) {
            addCriterion("CHECK_NURSE in", values, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseNotIn(List<String> values) {
            addCriterion("CHECK_NURSE not in", values, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseBetween(String value1, String value2) {
            addCriterion("CHECK_NURSE between", value1, value2, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckNurseNotBetween(String value1, String value2) {
            addCriterion("CHECK_NURSE not between", value1, value2, "checkNurse");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatIsNull() {
            addCriterion("CHECK_DOC_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatIsNotNull() {
            addCriterion("CHECK_DOC_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatEqualTo(Date value) {
            addCriterion("CHECK_DOC_DAT =", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatNotEqualTo(Date value) {
            addCriterion("CHECK_DOC_DAT <>", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatGreaterThan(Date value) {
            addCriterion("CHECK_DOC_DAT >", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_DOC_DAT >=", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatLessThan(Date value) {
            addCriterion("CHECK_DOC_DAT <", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_DOC_DAT <=", value, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatIn(List<Date> values) {
            addCriterion("CHECK_DOC_DAT in", values, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatNotIn(List<Date> values) {
            addCriterion("CHECK_DOC_DAT not in", values, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatBetween(Date value1, Date value2) {
            addCriterion("CHECK_DOC_DAT between", value1, value2, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocDatNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_DOC_DAT not between", value1, value2, "checkDocDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatIsNull() {
            addCriterion("CHECK_NURSE_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatIsNotNull() {
            addCriterion("CHECK_NURSE_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatEqualTo(Date value) {
            addCriterion("CHECK_NURSE_DAT =", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatNotEqualTo(Date value) {
            addCriterion("CHECK_NURSE_DAT <>", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatGreaterThan(Date value) {
            addCriterion("CHECK_NURSE_DAT >", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_NURSE_DAT >=", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatLessThan(Date value) {
            addCriterion("CHECK_NURSE_DAT <", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_NURSE_DAT <=", value, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatIn(List<Date> values) {
            addCriterion("CHECK_NURSE_DAT in", values, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatNotIn(List<Date> values) {
            addCriterion("CHECK_NURSE_DAT not in", values, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatBetween(Date value1, Date value2) {
            addCriterion("CHECK_NURSE_DAT between", value1, value2, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckNurseDatNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_NURSE_DAT not between", value1, value2, "checkNurseDat");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusIsNull() {
            addCriterion("CHECK_DOC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusIsNotNull() {
            addCriterion("CHECK_DOC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusEqualTo(String value) {
            addCriterion("CHECK_DOC_STATUS =", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusNotEqualTo(String value) {
            addCriterion("CHECK_DOC_STATUS <>", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusGreaterThan(String value) {
            addCriterion("CHECK_DOC_STATUS >", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_DOC_STATUS >=", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusLessThan(String value) {
            addCriterion("CHECK_DOC_STATUS <", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_DOC_STATUS <=", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusLike(String value) {
            addCriterion("CHECK_DOC_STATUS like", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusNotLike(String value) {
            addCriterion("CHECK_DOC_STATUS not like", value, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusIn(List<String> values) {
            addCriterion("CHECK_DOC_STATUS in", values, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusNotIn(List<String> values) {
            addCriterion("CHECK_DOC_STATUS not in", values, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusBetween(String value1, String value2) {
            addCriterion("CHECK_DOC_STATUS between", value1, value2, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckDocStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_DOC_STATUS not between", value1, value2, "checkDocStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusIsNull() {
            addCriterion("CHECK_NUR_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusIsNotNull() {
            addCriterion("CHECK_NUR_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusEqualTo(String value) {
            addCriterion("CHECK_NUR_STATUS =", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusNotEqualTo(String value) {
            addCriterion("CHECK_NUR_STATUS <>", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusGreaterThan(String value) {
            addCriterion("CHECK_NUR_STATUS >", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_NUR_STATUS >=", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusLessThan(String value) {
            addCriterion("CHECK_NUR_STATUS <", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_NUR_STATUS <=", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusLike(String value) {
            addCriterion("CHECK_NUR_STATUS like", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusNotLike(String value) {
            addCriterion("CHECK_NUR_STATUS not like", value, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusIn(List<String> values) {
            addCriterion("CHECK_NUR_STATUS in", values, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusNotIn(List<String> values) {
            addCriterion("CHECK_NUR_STATUS not in", values, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusBetween(String value1, String value2) {
            addCriterion("CHECK_NUR_STATUS between", value1, value2, "checkNurStatus");
            return (Criteria) this;
        }

        public Criteria andCheckNurStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_NUR_STATUS not between", value1, value2, "checkNurStatus");
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

        public Criteria andGhxhIsNull() {
            addCriterion("GHXH is null");
            return (Criteria) this;
        }

        public Criteria andGhxhIsNotNull() {
            addCriterion("GHXH is not null");
            return (Criteria) this;
        }

        public Criteria andGhxhEqualTo(String value) {
            addCriterion("GHXH =", value, "ghxh");
            return (Criteria) this;
        }

        public Criteria andGhxhNotEqualTo(String value) {
            addCriterion("GHXH <>", value, "ghxh");
            return (Criteria) this;
        }

        public Criteria andGhxhGreaterThan(String value) {
            addCriterion("GHXH >", value, "ghxh");
            return (Criteria) this;
        }

        public Criteria andGhxhGreaterThanOrEqualTo(String value) {
            addCriterion("GHXH >=", value, "ghxh");
            return (Criteria) this;
        }

        public Criteria andGhxhLessThan(String value) {
            addCriterion("GHXH <", value, "ghxh");
            return (Criteria) this;
        }

        public Criteria andGhxhLessThanOrEqualTo(String value) {
            addCriterion("GHXH <=", value, "ghxh");
            return (Criteria) this;
        }

        public Criteria andGhxhLike(String value) {
            addCriterion("GHXH like", value, "ghxh");
            return (Criteria) this;
        }

        public Criteria andGhxhNotLike(String value) {
            addCriterion("GHXH not like", value, "ghxh");
            return (Criteria) this;
        }

        public Criteria andGhxhIn(List<String> values) {
            addCriterion("GHXH in", values, "ghxh");
            return (Criteria) this;
        }

        public Criteria andGhxhNotIn(List<String> values) {
            addCriterion("GHXH not in", values, "ghxh");
            return (Criteria) this;
        }

        public Criteria andGhxhBetween(String value1, String value2) {
            addCriterion("GHXH between", value1, value2, "ghxh");
            return (Criteria) this;
        }

        public Criteria andGhxhNotBetween(String value1, String value2) {
            addCriterion("GHXH not between", value1, value2, "ghxh");
            return (Criteria) this;
        }

        public Criteria andRfidcodeIsNull() {
            addCriterion("RFIDCODE is null");
            return (Criteria) this;
        }

        public Criteria andRfidcodeIsNotNull() {
            addCriterion("RFIDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRfidcodeEqualTo(String value) {
            addCriterion("RFIDCODE =", value, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andRfidcodeNotEqualTo(String value) {
            addCriterion("RFIDCODE <>", value, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andRfidcodeGreaterThan(String value) {
            addCriterion("RFIDCODE >", value, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andRfidcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RFIDCODE >=", value, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andRfidcodeLessThan(String value) {
            addCriterion("RFIDCODE <", value, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andRfidcodeLessThanOrEqualTo(String value) {
            addCriterion("RFIDCODE <=", value, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andRfidcodeLike(String value) {
            addCriterion("RFIDCODE like", value, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andRfidcodeNotLike(String value) {
            addCriterion("RFIDCODE not like", value, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andRfidcodeIn(List<String> values) {
            addCriterion("RFIDCODE in", values, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andRfidcodeNotIn(List<String> values) {
            addCriterion("RFIDCODE not in", values, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andRfidcodeBetween(String value1, String value2) {
            addCriterion("RFIDCODE between", value1, value2, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andRfidcodeNotBetween(String value1, String value2) {
            addCriterion("RFIDCODE not between", value1, value2, "rfidcode");
            return (Criteria) this;
        }

        public Criteria andVaccineHisIsNull() {
            addCriterion("VACCINE_HIS is null");
            return (Criteria) this;
        }

        public Criteria andVaccineHisIsNotNull() {
            addCriterion("VACCINE_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineHisEqualTo(String value) {
            addCriterion("VACCINE_HIS =", value, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andVaccineHisNotEqualTo(String value) {
            addCriterion("VACCINE_HIS <>", value, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andVaccineHisGreaterThan(String value) {
            addCriterion("VACCINE_HIS >", value, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andVaccineHisGreaterThanOrEqualTo(String value) {
            addCriterion("VACCINE_HIS >=", value, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andVaccineHisLessThan(String value) {
            addCriterion("VACCINE_HIS <", value, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andVaccineHisLessThanOrEqualTo(String value) {
            addCriterion("VACCINE_HIS <=", value, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andVaccineHisLike(String value) {
            addCriterion("VACCINE_HIS like", value, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andVaccineHisNotLike(String value) {
            addCriterion("VACCINE_HIS not like", value, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andVaccineHisIn(List<String> values) {
            addCriterion("VACCINE_HIS in", values, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andVaccineHisNotIn(List<String> values) {
            addCriterion("VACCINE_HIS not in", values, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andVaccineHisBetween(String value1, String value2) {
            addCriterion("VACCINE_HIS between", value1, value2, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andVaccineHisNotBetween(String value1, String value2) {
            addCriterion("VACCINE_HIS not between", value1, value2, "vaccineHis");
            return (Criteria) this;
        }

        public Criteria andXfztFlgIsNull() {
            addCriterion("XFZT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXfztFlgIsNotNull() {
            addCriterion("XFZT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXfztFlgEqualTo(String value) {
            addCriterion("XFZT_FLG =", value, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andXfztFlgNotEqualTo(String value) {
            addCriterion("XFZT_FLG <>", value, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andXfztFlgGreaterThan(String value) {
            addCriterion("XFZT_FLG >", value, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andXfztFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XFZT_FLG >=", value, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andXfztFlgLessThan(String value) {
            addCriterion("XFZT_FLG <", value, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andXfztFlgLessThanOrEqualTo(String value) {
            addCriterion("XFZT_FLG <=", value, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andXfztFlgLike(String value) {
            addCriterion("XFZT_FLG like", value, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andXfztFlgNotLike(String value) {
            addCriterion("XFZT_FLG not like", value, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andXfztFlgIn(List<String> values) {
            addCriterion("XFZT_FLG in", values, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andXfztFlgNotIn(List<String> values) {
            addCriterion("XFZT_FLG not in", values, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andXfztFlgBetween(String value1, String value2) {
            addCriterion("XFZT_FLG between", value1, value2, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andXfztFlgNotBetween(String value1, String value2) {
            addCriterion("XFZT_FLG not between", value1, value2, "xfztFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgIsNull() {
            addCriterion("QTSJ_FLG is null");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgIsNotNull() {
            addCriterion("QTSJ_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgEqualTo(String value) {
            addCriterion("QTSJ_FLG =", value, "qtsjFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgNotEqualTo(String value) {
            addCriterion("QTSJ_FLG <>", value, "qtsjFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgGreaterThan(String value) {
            addCriterion("QTSJ_FLG >", value, "qtsjFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgGreaterThanOrEqualTo(String value) {
            addCriterion("QTSJ_FLG >=", value, "qtsjFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgLessThan(String value) {
            addCriterion("QTSJ_FLG <", value, "qtsjFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgLessThanOrEqualTo(String value) {
            addCriterion("QTSJ_FLG <=", value, "qtsjFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgLike(String value) {
            addCriterion("QTSJ_FLG like", value, "qtsjFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgNotLike(String value) {
            addCriterion("QTSJ_FLG not like", value, "qtsjFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgIn(List<String> values) {
            addCriterion("QTSJ_FLG in", values, "qtsjFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgNotIn(List<String> values) {
            addCriterion("QTSJ_FLG not in", values, "qtsjFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgBetween(String value1, String value2) {
            addCriterion("QTSJ_FLG between", value1, value2, "qtsjFlg");
            return (Criteria) this;
        }

        public Criteria andQtsjFlgNotBetween(String value1, String value2) {
            addCriterion("QTSJ_FLG not between", value1, value2, "qtsjFlg");
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

        public Criteria andBedLgsIsNull() {
            addCriterion("BED_LGS is null");
            return (Criteria) this;
        }

        public Criteria andBedLgsIsNotNull() {
            addCriterion("BED_LGS is not null");
            return (Criteria) this;
        }

        public Criteria andBedLgsEqualTo(String value) {
            addCriterion("BED_LGS =", value, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andBedLgsNotEqualTo(String value) {
            addCriterion("BED_LGS <>", value, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andBedLgsGreaterThan(String value) {
            addCriterion("BED_LGS >", value, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andBedLgsGreaterThanOrEqualTo(String value) {
            addCriterion("BED_LGS >=", value, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andBedLgsLessThan(String value) {
            addCriterion("BED_LGS <", value, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andBedLgsLessThanOrEqualTo(String value) {
            addCriterion("BED_LGS <=", value, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andBedLgsLike(String value) {
            addCriterion("BED_LGS like", value, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andBedLgsNotLike(String value) {
            addCriterion("BED_LGS not like", value, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andBedLgsIn(List<String> values) {
            addCriterion("BED_LGS in", values, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andBedLgsNotIn(List<String> values) {
            addCriterion("BED_LGS not in", values, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andBedLgsBetween(String value1, String value2) {
            addCriterion("BED_LGS between", value1, value2, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andBedLgsNotBetween(String value1, String value2) {
            addCriterion("BED_LGS not between", value1, value2, "bedLgs");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqIsNull() {
            addCriterion("FIRSTSQLSEQ is null");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqIsNotNull() {
            addCriterion("FIRSTSQLSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqEqualTo(String value) {
            addCriterion("FIRSTSQLSEQ =", value, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqNotEqualTo(String value) {
            addCriterion("FIRSTSQLSEQ <>", value, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqGreaterThan(String value) {
            addCriterion("FIRSTSQLSEQ >", value, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqGreaterThanOrEqualTo(String value) {
            addCriterion("FIRSTSQLSEQ >=", value, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqLessThan(String value) {
            addCriterion("FIRSTSQLSEQ <", value, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqLessThanOrEqualTo(String value) {
            addCriterion("FIRSTSQLSEQ <=", value, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqLike(String value) {
            addCriterion("FIRSTSQLSEQ like", value, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqNotLike(String value) {
            addCriterion("FIRSTSQLSEQ not like", value, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqIn(List<String> values) {
            addCriterion("FIRSTSQLSEQ in", values, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqNotIn(List<String> values) {
            addCriterion("FIRSTSQLSEQ not in", values, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqBetween(String value1, String value2) {
            addCriterion("FIRSTSQLSEQ between", value1, value2, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andFirstsqlseqNotBetween(String value1, String value2) {
            addCriterion("FIRSTSQLSEQ not between", value1, value2, "firstsqlseq");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoIsNull() {
            addCriterion("CLEANHZ_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoIsNotNull() {
            addCriterion("CLEANHZ_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoEqualTo(String value) {
            addCriterion("CLEANHZ_MEMO =", value, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoNotEqualTo(String value) {
            addCriterion("CLEANHZ_MEMO <>", value, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoGreaterThan(String value) {
            addCriterion("CLEANHZ_MEMO >", value, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoGreaterThanOrEqualTo(String value) {
            addCriterion("CLEANHZ_MEMO >=", value, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoLessThan(String value) {
            addCriterion("CLEANHZ_MEMO <", value, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoLessThanOrEqualTo(String value) {
            addCriterion("CLEANHZ_MEMO <=", value, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoLike(String value) {
            addCriterion("CLEANHZ_MEMO like", value, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoNotLike(String value) {
            addCriterion("CLEANHZ_MEMO not like", value, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoIn(List<String> values) {
            addCriterion("CLEANHZ_MEMO in", values, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoNotIn(List<String> values) {
            addCriterion("CLEANHZ_MEMO not in", values, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoBetween(String value1, String value2) {
            addCriterion("CLEANHZ_MEMO between", value1, value2, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andCleanhzMemoNotBetween(String value1, String value2) {
            addCriterion("CLEANHZ_MEMO not between", value1, value2, "cleanhzMemo");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqIsNull() {
            addCriterion("QTSJ_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqIsNotNull() {
            addCriterion("QTSJ_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqEqualTo(String value) {
            addCriterion("QTSJ_SEQ =", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqNotEqualTo(String value) {
            addCriterion("QTSJ_SEQ <>", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqGreaterThan(String value) {
            addCriterion("QTSJ_SEQ >", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqGreaterThanOrEqualTo(String value) {
            addCriterion("QTSJ_SEQ >=", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqLessThan(String value) {
            addCriterion("QTSJ_SEQ <", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqLessThanOrEqualTo(String value) {
            addCriterion("QTSJ_SEQ <=", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqLike(String value) {
            addCriterion("QTSJ_SEQ like", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqNotLike(String value) {
            addCriterion("QTSJ_SEQ not like", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqIn(List<String> values) {
            addCriterion("QTSJ_SEQ in", values, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqNotIn(List<String> values) {
            addCriterion("QTSJ_SEQ not in", values, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqBetween(String value1, String value2) {
            addCriterion("QTSJ_SEQ between", value1, value2, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqNotBetween(String value1, String value2) {
            addCriterion("QTSJ_SEQ not between", value1, value2, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andMysjIsNull() {
            addCriterion("MYSJ is null");
            return (Criteria) this;
        }

        public Criteria andMysjIsNotNull() {
            addCriterion("MYSJ is not null");
            return (Criteria) this;
        }

        public Criteria andMysjEqualTo(Date value) {
            addCriterion("MYSJ =", value, "mysj");
            return (Criteria) this;
        }

        public Criteria andMysjNotEqualTo(Date value) {
            addCriterion("MYSJ <>", value, "mysj");
            return (Criteria) this;
        }

        public Criteria andMysjGreaterThan(Date value) {
            addCriterion("MYSJ >", value, "mysj");
            return (Criteria) this;
        }

        public Criteria andMysjGreaterThanOrEqualTo(Date value) {
            addCriterion("MYSJ >=", value, "mysj");
            return (Criteria) this;
        }

        public Criteria andMysjLessThan(Date value) {
            addCriterion("MYSJ <", value, "mysj");
            return (Criteria) this;
        }

        public Criteria andMysjLessThanOrEqualTo(Date value) {
            addCriterion("MYSJ <=", value, "mysj");
            return (Criteria) this;
        }

        public Criteria andMysjIn(List<Date> values) {
            addCriterion("MYSJ in", values, "mysj");
            return (Criteria) this;
        }

        public Criteria andMysjNotIn(List<Date> values) {
            addCriterion("MYSJ not in", values, "mysj");
            return (Criteria) this;
        }

        public Criteria andMysjBetween(Date value1, Date value2) {
            addCriterion("MYSJ between", value1, value2, "mysj");
            return (Criteria) this;
        }

        public Criteria andMysjNotBetween(Date value1, Date value2) {
            addCriterion("MYSJ not between", value1, value2, "mysj");
            return (Criteria) this;
        }

        public Criteria andMqsjIsNull() {
            addCriterion("MQSJ is null");
            return (Criteria) this;
        }

        public Criteria andMqsjIsNotNull() {
            addCriterion("MQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andMqsjEqualTo(Date value) {
            addCriterion("MQSJ =", value, "mqsj");
            return (Criteria) this;
        }

        public Criteria andMqsjNotEqualTo(Date value) {
            addCriterion("MQSJ <>", value, "mqsj");
            return (Criteria) this;
        }

        public Criteria andMqsjGreaterThan(Date value) {
            addCriterion("MQSJ >", value, "mqsj");
            return (Criteria) this;
        }

        public Criteria andMqsjGreaterThanOrEqualTo(Date value) {
            addCriterion("MQSJ >=", value, "mqsj");
            return (Criteria) this;
        }

        public Criteria andMqsjLessThan(Date value) {
            addCriterion("MQSJ <", value, "mqsj");
            return (Criteria) this;
        }

        public Criteria andMqsjLessThanOrEqualTo(Date value) {
            addCriterion("MQSJ <=", value, "mqsj");
            return (Criteria) this;
        }

        public Criteria andMqsjIn(List<Date> values) {
            addCriterion("MQSJ in", values, "mqsj");
            return (Criteria) this;
        }

        public Criteria andMqsjNotIn(List<Date> values) {
            addCriterion("MQSJ not in", values, "mqsj");
            return (Criteria) this;
        }

        public Criteria andMqsjBetween(Date value1, Date value2) {
            addCriterion("MQSJ between", value1, value2, "mqsj");
            return (Criteria) this;
        }

        public Criteria andMqsjNotBetween(Date value1, Date value2) {
            addCriterion("MQSJ not between", value1, value2, "mqsj");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("CARD_TYPE like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("CARD_TYPE not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andTriageNumIsNull() {
            addCriterion("TRIAGE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTriageNumIsNotNull() {
            addCriterion("TRIAGE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTriageNumEqualTo(String value) {
            addCriterion("TRIAGE_NUM =", value, "triageNum");
            return (Criteria) this;
        }

        public Criteria andTriageNumNotEqualTo(String value) {
            addCriterion("TRIAGE_NUM <>", value, "triageNum");
            return (Criteria) this;
        }

        public Criteria andTriageNumGreaterThan(String value) {
            addCriterion("TRIAGE_NUM >", value, "triageNum");
            return (Criteria) this;
        }

        public Criteria andTriageNumGreaterThanOrEqualTo(String value) {
            addCriterion("TRIAGE_NUM >=", value, "triageNum");
            return (Criteria) this;
        }

        public Criteria andTriageNumLessThan(String value) {
            addCriterion("TRIAGE_NUM <", value, "triageNum");
            return (Criteria) this;
        }

        public Criteria andTriageNumLessThanOrEqualTo(String value) {
            addCriterion("TRIAGE_NUM <=", value, "triageNum");
            return (Criteria) this;
        }

        public Criteria andTriageNumLike(String value) {
            addCriterion("TRIAGE_NUM like", value, "triageNum");
            return (Criteria) this;
        }

        public Criteria andTriageNumNotLike(String value) {
            addCriterion("TRIAGE_NUM not like", value, "triageNum");
            return (Criteria) this;
        }

        public Criteria andTriageNumIn(List<String> values) {
            addCriterion("TRIAGE_NUM in", values, "triageNum");
            return (Criteria) this;
        }

        public Criteria andTriageNumNotIn(List<String> values) {
            addCriterion("TRIAGE_NUM not in", values, "triageNum");
            return (Criteria) this;
        }

        public Criteria andTriageNumBetween(String value1, String value2) {
            addCriterion("TRIAGE_NUM between", value1, value2, "triageNum");
            return (Criteria) this;
        }

        public Criteria andTriageNumNotBetween(String value1, String value2) {
            addCriterion("TRIAGE_NUM not between", value1, value2, "triageNum");
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

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
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

        public Criteria andGhidIsNull() {
            addCriterion("GHID is null");
            return (Criteria) this;
        }

        public Criteria andGhidIsNotNull() {
            addCriterion("GHID is not null");
            return (Criteria) this;
        }

        public Criteria andGhidEqualTo(String value) {
            addCriterion("GHID =", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidNotEqualTo(String value) {
            addCriterion("GHID <>", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidGreaterThan(String value) {
            addCriterion("GHID >", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidGreaterThanOrEqualTo(String value) {
            addCriterion("GHID >=", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidLessThan(String value) {
            addCriterion("GHID <", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidLessThanOrEqualTo(String value) {
            addCriterion("GHID <=", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidLike(String value) {
            addCriterion("GHID like", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidNotLike(String value) {
            addCriterion("GHID not like", value, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidIn(List<String> values) {
            addCriterion("GHID in", values, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidNotIn(List<String> values) {
            addCriterion("GHID not in", values, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidBetween(String value1, String value2) {
            addCriterion("GHID between", value1, value2, "ghid");
            return (Criteria) this;
        }

        public Criteria andGhidNotBetween(String value1, String value2) {
            addCriterion("GHID not between", value1, value2, "ghid");
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

        public Criteria andFirstemgseqIsNull() {
            addCriterion("FIRSTEMGSEQ is null");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqIsNotNull() {
            addCriterion("FIRSTEMGSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqEqualTo(String value) {
            addCriterion("FIRSTEMGSEQ =", value, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqNotEqualTo(String value) {
            addCriterion("FIRSTEMGSEQ <>", value, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqGreaterThan(String value) {
            addCriterion("FIRSTEMGSEQ >", value, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqGreaterThanOrEqualTo(String value) {
            addCriterion("FIRSTEMGSEQ >=", value, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqLessThan(String value) {
            addCriterion("FIRSTEMGSEQ <", value, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqLessThanOrEqualTo(String value) {
            addCriterion("FIRSTEMGSEQ <=", value, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqLike(String value) {
            addCriterion("FIRSTEMGSEQ like", value, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqNotLike(String value) {
            addCriterion("FIRSTEMGSEQ not like", value, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqIn(List<String> values) {
            addCriterion("FIRSTEMGSEQ in", values, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqNotIn(List<String> values) {
            addCriterion("FIRSTEMGSEQ not in", values, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqBetween(String value1, String value2) {
            addCriterion("FIRSTEMGSEQ between", value1, value2, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andFirstemgseqNotBetween(String value1, String value2) {
            addCriterion("FIRSTEMGSEQ not between", value1, value2, "firstemgseq");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamIsNull() {
            addCriterion("INFECTEDAREA_NAM is null");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamIsNotNull() {
            addCriterion("INFECTEDAREA_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamEqualTo(String value) {
            addCriterion("INFECTEDAREA_NAM =", value, "infectedareaNam");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamNotEqualTo(String value) {
            addCriterion("INFECTEDAREA_NAM <>", value, "infectedareaNam");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamGreaterThan(String value) {
            addCriterion("INFECTEDAREA_NAM >", value, "infectedareaNam");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamGreaterThanOrEqualTo(String value) {
            addCriterion("INFECTEDAREA_NAM >=", value, "infectedareaNam");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamLessThan(String value) {
            addCriterion("INFECTEDAREA_NAM <", value, "infectedareaNam");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamLessThanOrEqualTo(String value) {
            addCriterion("INFECTEDAREA_NAM <=", value, "infectedareaNam");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamLike(String value) {
            addCriterion("INFECTEDAREA_NAM like", value, "infectedareaNam");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamNotLike(String value) {
            addCriterion("INFECTEDAREA_NAM not like", value, "infectedareaNam");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamIn(List<String> values) {
            addCriterion("INFECTEDAREA_NAM in", values, "infectedareaNam");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamNotIn(List<String> values) {
            addCriterion("INFECTEDAREA_NAM not in", values, "infectedareaNam");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamBetween(String value1, String value2) {
            addCriterion("INFECTEDAREA_NAM between", value1, value2, "infectedareaNam");
            return (Criteria) this;
        }

        public Criteria andInfectedareaNamNotBetween(String value1, String value2) {
            addCriterion("INFECTEDAREA_NAM not between", value1, value2, "infectedareaNam");
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

        public Criteria andAdtA01IsNull() {
            addCriterion("ADT_A01 is null");
            return (Criteria) this;
        }

        public Criteria andAdtA01IsNotNull() {
            addCriterion("ADT_A01 is not null");
            return (Criteria) this;
        }

        public Criteria andAdtA01EqualTo(String value) {
            addCriterion("ADT_A01 =", value, "adtA01");
            return (Criteria) this;
        }

        public Criteria andAdtA01NotEqualTo(String value) {
            addCriterion("ADT_A01 <>", value, "adtA01");
            return (Criteria) this;
        }

        public Criteria andAdtA01GreaterThan(String value) {
            addCriterion("ADT_A01 >", value, "adtA01");
            return (Criteria) this;
        }

        public Criteria andAdtA01GreaterThanOrEqualTo(String value) {
            addCriterion("ADT_A01 >=", value, "adtA01");
            return (Criteria) this;
        }

        public Criteria andAdtA01LessThan(String value) {
            addCriterion("ADT_A01 <", value, "adtA01");
            return (Criteria) this;
        }

        public Criteria andAdtA01LessThanOrEqualTo(String value) {
            addCriterion("ADT_A01 <=", value, "adtA01");
            return (Criteria) this;
        }

        public Criteria andAdtA01Like(String value) {
            addCriterion("ADT_A01 like", value, "adtA01");
            return (Criteria) this;
        }

        public Criteria andAdtA01NotLike(String value) {
            addCriterion("ADT_A01 not like", value, "adtA01");
            return (Criteria) this;
        }

        public Criteria andAdtA01In(List<String> values) {
            addCriterion("ADT_A01 in", values, "adtA01");
            return (Criteria) this;
        }

        public Criteria andAdtA01NotIn(List<String> values) {
            addCriterion("ADT_A01 not in", values, "adtA01");
            return (Criteria) this;
        }

        public Criteria andAdtA01Between(String value1, String value2) {
            addCriterion("ADT_A01 between", value1, value2, "adtA01");
            return (Criteria) this;
        }

        public Criteria andAdtA01NotBetween(String value1, String value2) {
            addCriterion("ADT_A01 not between", value1, value2, "adtA01");
            return (Criteria) this;
        }

        public Criteria andGlsTypeIsNull() {
            addCriterion("GLS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGlsTypeIsNotNull() {
            addCriterion("GLS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGlsTypeEqualTo(String value) {
            addCriterion("GLS_TYPE =", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeNotEqualTo(String value) {
            addCriterion("GLS_TYPE <>", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeGreaterThan(String value) {
            addCriterion("GLS_TYPE >", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GLS_TYPE >=", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeLessThan(String value) {
            addCriterion("GLS_TYPE <", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeLessThanOrEqualTo(String value) {
            addCriterion("GLS_TYPE <=", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeLike(String value) {
            addCriterion("GLS_TYPE like", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeNotLike(String value) {
            addCriterion("GLS_TYPE not like", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeIn(List<String> values) {
            addCriterion("GLS_TYPE in", values, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeNotIn(List<String> values) {
            addCriterion("GLS_TYPE not in", values, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeBetween(String value1, String value2) {
            addCriterion("GLS_TYPE between", value1, value2, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeNotBetween(String value1, String value2) {
            addCriterion("GLS_TYPE not between", value1, value2, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsNumIsNull() {
            addCriterion("GLS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andGlsNumIsNotNull() {
            addCriterion("GLS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andGlsNumEqualTo(String value) {
            addCriterion("GLS_NUM =", value, "glsNum");
            return (Criteria) this;
        }

        public Criteria andGlsNumNotEqualTo(String value) {
            addCriterion("GLS_NUM <>", value, "glsNum");
            return (Criteria) this;
        }

        public Criteria andGlsNumGreaterThan(String value) {
            addCriterion("GLS_NUM >", value, "glsNum");
            return (Criteria) this;
        }

        public Criteria andGlsNumGreaterThanOrEqualTo(String value) {
            addCriterion("GLS_NUM >=", value, "glsNum");
            return (Criteria) this;
        }

        public Criteria andGlsNumLessThan(String value) {
            addCriterion("GLS_NUM <", value, "glsNum");
            return (Criteria) this;
        }

        public Criteria andGlsNumLessThanOrEqualTo(String value) {
            addCriterion("GLS_NUM <=", value, "glsNum");
            return (Criteria) this;
        }

        public Criteria andGlsNumLike(String value) {
            addCriterion("GLS_NUM like", value, "glsNum");
            return (Criteria) this;
        }

        public Criteria andGlsNumNotLike(String value) {
            addCriterion("GLS_NUM not like", value, "glsNum");
            return (Criteria) this;
        }

        public Criteria andGlsNumIn(List<String> values) {
            addCriterion("GLS_NUM in", values, "glsNum");
            return (Criteria) this;
        }

        public Criteria andGlsNumNotIn(List<String> values) {
            addCriterion("GLS_NUM not in", values, "glsNum");
            return (Criteria) this;
        }

        public Criteria andGlsNumBetween(String value1, String value2) {
            addCriterion("GLS_NUM between", value1, value2, "glsNum");
            return (Criteria) this;
        }

        public Criteria andGlsNumNotBetween(String value1, String value2) {
            addCriterion("GLS_NUM not between", value1, value2, "glsNum");
            return (Criteria) this;
        }

        public Criteria andCdxxIsNull() {
            addCriterion("CDXX is null");
            return (Criteria) this;
        }

        public Criteria andCdxxIsNotNull() {
            addCriterion("CDXX is not null");
            return (Criteria) this;
        }

        public Criteria andCdxxEqualTo(String value) {
            addCriterion("CDXX =", value, "cdxx");
            return (Criteria) this;
        }

        public Criteria andCdxxNotEqualTo(String value) {
            addCriterion("CDXX <>", value, "cdxx");
            return (Criteria) this;
        }

        public Criteria andCdxxGreaterThan(String value) {
            addCriterion("CDXX >", value, "cdxx");
            return (Criteria) this;
        }

        public Criteria andCdxxGreaterThanOrEqualTo(String value) {
            addCriterion("CDXX >=", value, "cdxx");
            return (Criteria) this;
        }

        public Criteria andCdxxLessThan(String value) {
            addCriterion("CDXX <", value, "cdxx");
            return (Criteria) this;
        }

        public Criteria andCdxxLessThanOrEqualTo(String value) {
            addCriterion("CDXX <=", value, "cdxx");
            return (Criteria) this;
        }

        public Criteria andCdxxLike(String value) {
            addCriterion("CDXX like", value, "cdxx");
            return (Criteria) this;
        }

        public Criteria andCdxxNotLike(String value) {
            addCriterion("CDXX not like", value, "cdxx");
            return (Criteria) this;
        }

        public Criteria andCdxxIn(List<String> values) {
            addCriterion("CDXX in", values, "cdxx");
            return (Criteria) this;
        }

        public Criteria andCdxxNotIn(List<String> values) {
            addCriterion("CDXX not in", values, "cdxx");
            return (Criteria) this;
        }

        public Criteria andCdxxBetween(String value1, String value2) {
            addCriterion("CDXX between", value1, value2, "cdxx");
            return (Criteria) this;
        }

        public Criteria andCdxxNotBetween(String value1, String value2) {
            addCriterion("CDXX not between", value1, value2, "cdxx");
            return (Criteria) this;
        }

        public Criteria andKhlxIsNull() {
            addCriterion("KHLX is null");
            return (Criteria) this;
        }

        public Criteria andKhlxIsNotNull() {
            addCriterion("KHLX is not null");
            return (Criteria) this;
        }

        public Criteria andKhlxEqualTo(String value) {
            addCriterion("KHLX =", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxNotEqualTo(String value) {
            addCriterion("KHLX <>", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxGreaterThan(String value) {
            addCriterion("KHLX >", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxGreaterThanOrEqualTo(String value) {
            addCriterion("KHLX >=", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxLessThan(String value) {
            addCriterion("KHLX <", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxLessThanOrEqualTo(String value) {
            addCriterion("KHLX <=", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxLike(String value) {
            addCriterion("KHLX like", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxNotLike(String value) {
            addCriterion("KHLX not like", value, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxIn(List<String> values) {
            addCriterion("KHLX in", values, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxNotIn(List<String> values) {
            addCriterion("KHLX not in", values, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxBetween(String value1, String value2) {
            addCriterion("KHLX between", value1, value2, "khlx");
            return (Criteria) this;
        }

        public Criteria andKhlxNotBetween(String value1, String value2) {
            addCriterion("KHLX not between", value1, value2, "khlx");
            return (Criteria) this;
        }

        public Criteria andPsryqtIsNull() {
            addCriterion("PSRYQT is null");
            return (Criteria) this;
        }

        public Criteria andPsryqtIsNotNull() {
            addCriterion("PSRYQT is not null");
            return (Criteria) this;
        }

        public Criteria andPsryqtEqualTo(String value) {
            addCriterion("PSRYQT =", value, "psryqt");
            return (Criteria) this;
        }

        public Criteria andPsryqtNotEqualTo(String value) {
            addCriterion("PSRYQT <>", value, "psryqt");
            return (Criteria) this;
        }

        public Criteria andPsryqtGreaterThan(String value) {
            addCriterion("PSRYQT >", value, "psryqt");
            return (Criteria) this;
        }

        public Criteria andPsryqtGreaterThanOrEqualTo(String value) {
            addCriterion("PSRYQT >=", value, "psryqt");
            return (Criteria) this;
        }

        public Criteria andPsryqtLessThan(String value) {
            addCriterion("PSRYQT <", value, "psryqt");
            return (Criteria) this;
        }

        public Criteria andPsryqtLessThanOrEqualTo(String value) {
            addCriterion("PSRYQT <=", value, "psryqt");
            return (Criteria) this;
        }

        public Criteria andPsryqtLike(String value) {
            addCriterion("PSRYQT like", value, "psryqt");
            return (Criteria) this;
        }

        public Criteria andPsryqtNotLike(String value) {
            addCriterion("PSRYQT not like", value, "psryqt");
            return (Criteria) this;
        }

        public Criteria andPsryqtIn(List<String> values) {
            addCriterion("PSRYQT in", values, "psryqt");
            return (Criteria) this;
        }

        public Criteria andPsryqtNotIn(List<String> values) {
            addCriterion("PSRYQT not in", values, "psryqt");
            return (Criteria) this;
        }

        public Criteria andPsryqtBetween(String value1, String value2) {
            addCriterion("PSRYQT between", value1, value2, "psryqt");
            return (Criteria) this;
        }

        public Criteria andPsryqtNotBetween(String value1, String value2) {
            addCriterion("PSRYQT not between", value1, value2, "psryqt");
            return (Criteria) this;
        }

        public Criteria andGhbzIsNull() {
            addCriterion("GHBZ is null");
            return (Criteria) this;
        }

        public Criteria andGhbzIsNotNull() {
            addCriterion("GHBZ is not null");
            return (Criteria) this;
        }

        public Criteria andGhbzEqualTo(String value) {
            addCriterion("GHBZ =", value, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGhbzNotEqualTo(String value) {
            addCriterion("GHBZ <>", value, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGhbzGreaterThan(String value) {
            addCriterion("GHBZ >", value, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGhbzGreaterThanOrEqualTo(String value) {
            addCriterion("GHBZ >=", value, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGhbzLessThan(String value) {
            addCriterion("GHBZ <", value, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGhbzLessThanOrEqualTo(String value) {
            addCriterion("GHBZ <=", value, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGhbzLike(String value) {
            addCriterion("GHBZ like", value, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGhbzNotLike(String value) {
            addCriterion("GHBZ not like", value, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGhbzIn(List<String> values) {
            addCriterion("GHBZ in", values, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGhbzNotIn(List<String> values) {
            addCriterion("GHBZ not in", values, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGhbzBetween(String value1, String value2) {
            addCriterion("GHBZ between", value1, value2, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGhbzNotBetween(String value1, String value2) {
            addCriterion("GHBZ not between", value1, value2, "ghbz");
            return (Criteria) this;
        }

        public Criteria andGlsCodIsNull() {
            addCriterion("GLS_COD is null");
            return (Criteria) this;
        }

        public Criteria andGlsCodIsNotNull() {
            addCriterion("GLS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGlsCodEqualTo(String value) {
            addCriterion("GLS_COD =", value, "glsCod");
            return (Criteria) this;
        }

        public Criteria andGlsCodNotEqualTo(String value) {
            addCriterion("GLS_COD <>", value, "glsCod");
            return (Criteria) this;
        }

        public Criteria andGlsCodGreaterThan(String value) {
            addCriterion("GLS_COD >", value, "glsCod");
            return (Criteria) this;
        }

        public Criteria andGlsCodGreaterThanOrEqualTo(String value) {
            addCriterion("GLS_COD >=", value, "glsCod");
            return (Criteria) this;
        }

        public Criteria andGlsCodLessThan(String value) {
            addCriterion("GLS_COD <", value, "glsCod");
            return (Criteria) this;
        }

        public Criteria andGlsCodLessThanOrEqualTo(String value) {
            addCriterion("GLS_COD <=", value, "glsCod");
            return (Criteria) this;
        }

        public Criteria andGlsCodLike(String value) {
            addCriterion("GLS_COD like", value, "glsCod");
            return (Criteria) this;
        }

        public Criteria andGlsCodNotLike(String value) {
            addCriterion("GLS_COD not like", value, "glsCod");
            return (Criteria) this;
        }

        public Criteria andGlsCodIn(List<String> values) {
            addCriterion("GLS_COD in", values, "glsCod");
            return (Criteria) this;
        }

        public Criteria andGlsCodNotIn(List<String> values) {
            addCriterion("GLS_COD not in", values, "glsCod");
            return (Criteria) this;
        }

        public Criteria andGlsCodBetween(String value1, String value2) {
            addCriterion("GLS_COD between", value1, value2, "glsCod");
            return (Criteria) this;
        }

        public Criteria andGlsCodNotBetween(String value1, String value2) {
            addCriterion("GLS_COD not between", value1, value2, "glsCod");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgIsNull() {
            addCriterion("LABEL_PRINT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgIsNotNull() {
            addCriterion("LABEL_PRINT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgEqualTo(String value) {
            addCriterion("LABEL_PRINT_FLG =", value, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgNotEqualTo(String value) {
            addCriterion("LABEL_PRINT_FLG <>", value, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgGreaterThan(String value) {
            addCriterion("LABEL_PRINT_FLG >", value, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL_PRINT_FLG >=", value, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgLessThan(String value) {
            addCriterion("LABEL_PRINT_FLG <", value, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgLessThanOrEqualTo(String value) {
            addCriterion("LABEL_PRINT_FLG <=", value, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgLike(String value) {
            addCriterion("LABEL_PRINT_FLG like", value, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgNotLike(String value) {
            addCriterion("LABEL_PRINT_FLG not like", value, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgIn(List<String> values) {
            addCriterion("LABEL_PRINT_FLG in", values, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgNotIn(List<String> values) {
            addCriterion("LABEL_PRINT_FLG not in", values, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgBetween(String value1, String value2) {
            addCriterion("LABEL_PRINT_FLG between", value1, value2, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andLabelPrintFlgNotBetween(String value1, String value2) {
            addCriterion("LABEL_PRINT_FLG not between", value1, value2, "labelPrintFlg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgIsNull() {
            addCriterion("XTLCFLG is null");
            return (Criteria) this;
        }

        public Criteria andXtlcflgIsNotNull() {
            addCriterion("XTLCFLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtlcflgEqualTo(String value) {
            addCriterion("XTLCFLG =", value, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgNotEqualTo(String value) {
            addCriterion("XTLCFLG <>", value, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgGreaterThan(String value) {
            addCriterion("XTLCFLG >", value, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgGreaterThanOrEqualTo(String value) {
            addCriterion("XTLCFLG >=", value, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgLessThan(String value) {
            addCriterion("XTLCFLG <", value, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgLessThanOrEqualTo(String value) {
            addCriterion("XTLCFLG <=", value, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgLike(String value) {
            addCriterion("XTLCFLG like", value, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgNotLike(String value) {
            addCriterion("XTLCFLG not like", value, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgIn(List<String> values) {
            addCriterion("XTLCFLG in", values, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgNotIn(List<String> values) {
            addCriterion("XTLCFLG not in", values, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgBetween(String value1, String value2) {
            addCriterion("XTLCFLG between", value1, value2, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andXtlcflgNotBetween(String value1, String value2) {
            addCriterion("XTLCFLG not between", value1, value2, "xtlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgIsNull() {
            addCriterion("CZLCFLG is null");
            return (Criteria) this;
        }

        public Criteria andCzlcflgIsNotNull() {
            addCriterion("CZLCFLG is not null");
            return (Criteria) this;
        }

        public Criteria andCzlcflgEqualTo(String value) {
            addCriterion("CZLCFLG =", value, "czlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgNotEqualTo(String value) {
            addCriterion("CZLCFLG <>", value, "czlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgGreaterThan(String value) {
            addCriterion("CZLCFLG >", value, "czlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgGreaterThanOrEqualTo(String value) {
            addCriterion("CZLCFLG >=", value, "czlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgLessThan(String value) {
            addCriterion("CZLCFLG <", value, "czlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgLessThanOrEqualTo(String value) {
            addCriterion("CZLCFLG <=", value, "czlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgLike(String value) {
            addCriterion("CZLCFLG like", value, "czlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgNotLike(String value) {
            addCriterion("CZLCFLG not like", value, "czlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgIn(List<String> values) {
            addCriterion("CZLCFLG in", values, "czlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgNotIn(List<String> values) {
            addCriterion("CZLCFLG not in", values, "czlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgBetween(String value1, String value2) {
            addCriterion("CZLCFLG between", value1, value2, "czlcflg");
            return (Criteria) this;
        }

        public Criteria andCzlcflgNotBetween(String value1, String value2) {
            addCriterion("CZLCFLG not between", value1, value2, "czlcflg");
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