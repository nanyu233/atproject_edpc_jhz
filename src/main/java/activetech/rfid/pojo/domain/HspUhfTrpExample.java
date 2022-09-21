package activetech.rfid.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspUhfTrpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspUhfTrpExample() {
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

        public Criteria andRdrSeqIsNull() {
            addCriterion("RDR_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andRdrSeqIsNotNull() {
            addCriterion("RDR_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRdrSeqEqualTo(String value) {
            addCriterion("RDR_SEQ =", value, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrSeqNotEqualTo(String value) {
            addCriterion("RDR_SEQ <>", value, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrSeqGreaterThan(String value) {
            addCriterion("RDR_SEQ >", value, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrSeqGreaterThanOrEqualTo(String value) {
            addCriterion("RDR_SEQ >=", value, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrSeqLessThan(String value) {
            addCriterion("RDR_SEQ <", value, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrSeqLessThanOrEqualTo(String value) {
            addCriterion("RDR_SEQ <=", value, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrSeqLike(String value) {
            addCriterion("RDR_SEQ like", value, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrSeqNotLike(String value) {
            addCriterion("RDR_SEQ not like", value, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrSeqIn(List<String> values) {
            addCriterion("RDR_SEQ in", values, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrSeqNotIn(List<String> values) {
            addCriterion("RDR_SEQ not in", values, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrSeqBetween(String value1, String value2) {
            addCriterion("RDR_SEQ between", value1, value2, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrSeqNotBetween(String value1, String value2) {
            addCriterion("RDR_SEQ not between", value1, value2, "rdrSeq");
            return (Criteria) this;
        }

        public Criteria andRdrIdIsNull() {
            addCriterion("RDR_ID is null");
            return (Criteria) this;
        }

        public Criteria andRdrIdIsNotNull() {
            addCriterion("RDR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRdrIdEqualTo(String value) {
            addCriterion("RDR_ID =", value, "rdrId");
            return (Criteria) this;
        }

        public Criteria andRdrIdNotEqualTo(String value) {
            addCriterion("RDR_ID <>", value, "rdrId");
            return (Criteria) this;
        }

        public Criteria andRdrIdGreaterThan(String value) {
            addCriterion("RDR_ID >", value, "rdrId");
            return (Criteria) this;
        }

        public Criteria andRdrIdGreaterThanOrEqualTo(String value) {
            addCriterion("RDR_ID >=", value, "rdrId");
            return (Criteria) this;
        }

        public Criteria andRdrIdLessThan(String value) {
            addCriterion("RDR_ID <", value, "rdrId");
            return (Criteria) this;
        }

        public Criteria andRdrIdLessThanOrEqualTo(String value) {
            addCriterion("RDR_ID <=", value, "rdrId");
            return (Criteria) this;
        }

        public Criteria andRdrIdLike(String value) {
            addCriterion("RDR_ID like", value, "rdrId");
            return (Criteria) this;
        }

        public Criteria andRdrIdNotLike(String value) {
            addCriterion("RDR_ID not like", value, "rdrId");
            return (Criteria) this;
        }

        public Criteria andRdrIdIn(List<String> values) {
            addCriterion("RDR_ID in", values, "rdrId");
            return (Criteria) this;
        }

        public Criteria andRdrIdNotIn(List<String> values) {
            addCriterion("RDR_ID not in", values, "rdrId");
            return (Criteria) this;
        }

        public Criteria andRdrIdBetween(String value1, String value2) {
            addCriterion("RDR_ID between", value1, value2, "rdrId");
            return (Criteria) this;
        }

        public Criteria andRdrIdNotBetween(String value1, String value2) {
            addCriterion("RDR_ID not between", value1, value2, "rdrId");
            return (Criteria) this;
        }

        public Criteria andTrpNamIsNull() {
            addCriterion("TRP_NAM is null");
            return (Criteria) this;
        }

        public Criteria andTrpNamIsNotNull() {
            addCriterion("TRP_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andTrpNamEqualTo(String value) {
            addCriterion("TRP_NAM =", value, "trpNam");
            return (Criteria) this;
        }

        public Criteria andTrpNamNotEqualTo(String value) {
            addCriterion("TRP_NAM <>", value, "trpNam");
            return (Criteria) this;
        }

        public Criteria andTrpNamGreaterThan(String value) {
            addCriterion("TRP_NAM >", value, "trpNam");
            return (Criteria) this;
        }

        public Criteria andTrpNamGreaterThanOrEqualTo(String value) {
            addCriterion("TRP_NAM >=", value, "trpNam");
            return (Criteria) this;
        }

        public Criteria andTrpNamLessThan(String value) {
            addCriterion("TRP_NAM <", value, "trpNam");
            return (Criteria) this;
        }

        public Criteria andTrpNamLessThanOrEqualTo(String value) {
            addCriterion("TRP_NAM <=", value, "trpNam");
            return (Criteria) this;
        }

        public Criteria andTrpNamLike(String value) {
            addCriterion("TRP_NAM like", value, "trpNam");
            return (Criteria) this;
        }

        public Criteria andTrpNamNotLike(String value) {
            addCriterion("TRP_NAM not like", value, "trpNam");
            return (Criteria) this;
        }

        public Criteria andTrpNamIn(List<String> values) {
            addCriterion("TRP_NAM in", values, "trpNam");
            return (Criteria) this;
        }

        public Criteria andTrpNamNotIn(List<String> values) {
            addCriterion("TRP_NAM not in", values, "trpNam");
            return (Criteria) this;
        }

        public Criteria andTrpNamBetween(String value1, String value2) {
            addCriterion("TRP_NAM between", value1, value2, "trpNam");
            return (Criteria) this;
        }

        public Criteria andTrpNamNotBetween(String value1, String value2) {
            addCriterion("TRP_NAM not between", value1, value2, "trpNam");
            return (Criteria) this;
        }

        public Criteria andRdrTypIsNull() {
            addCriterion("RDR_TYP is null");
            return (Criteria) this;
        }

        public Criteria andRdrTypIsNotNull() {
            addCriterion("RDR_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andRdrTypEqualTo(String value) {
            addCriterion("RDR_TYP =", value, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andRdrTypNotEqualTo(String value) {
            addCriterion("RDR_TYP <>", value, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andRdrTypGreaterThan(String value) {
            addCriterion("RDR_TYP >", value, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andRdrTypGreaterThanOrEqualTo(String value) {
            addCriterion("RDR_TYP >=", value, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andRdrTypLessThan(String value) {
            addCriterion("RDR_TYP <", value, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andRdrTypLessThanOrEqualTo(String value) {
            addCriterion("RDR_TYP <=", value, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andRdrTypLike(String value) {
            addCriterion("RDR_TYP like", value, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andRdrTypNotLike(String value) {
            addCriterion("RDR_TYP not like", value, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andRdrTypIn(List<String> values) {
            addCriterion("RDR_TYP in", values, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andRdrTypNotIn(List<String> values) {
            addCriterion("RDR_TYP not in", values, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andRdrTypBetween(String value1, String value2) {
            addCriterion("RDR_TYP between", value1, value2, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andRdrTypNotBetween(String value1, String value2) {
            addCriterion("RDR_TYP not between", value1, value2, "rdrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypIsNull() {
            addCriterion("MTR_TYP is null");
            return (Criteria) this;
        }

        public Criteria andMtrTypIsNotNull() {
            addCriterion("MTR_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andMtrTypEqualTo(String value) {
            addCriterion("MTR_TYP =", value, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypNotEqualTo(String value) {
            addCriterion("MTR_TYP <>", value, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypGreaterThan(String value) {
            addCriterion("MTR_TYP >", value, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypGreaterThanOrEqualTo(String value) {
            addCriterion("MTR_TYP >=", value, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypLessThan(String value) {
            addCriterion("MTR_TYP <", value, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypLessThanOrEqualTo(String value) {
            addCriterion("MTR_TYP <=", value, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypLike(String value) {
            addCriterion("MTR_TYP like", value, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypNotLike(String value) {
            addCriterion("MTR_TYP not like", value, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypIn(List<String> values) {
            addCriterion("MTR_TYP in", values, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypNotIn(List<String> values) {
            addCriterion("MTR_TYP not in", values, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypBetween(String value1, String value2) {
            addCriterion("MTR_TYP between", value1, value2, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrTypNotBetween(String value1, String value2) {
            addCriterion("MTR_TYP not between", value1, value2, "mtrTyp");
            return (Criteria) this;
        }

        public Criteria andMtrCodIsNull() {
            addCriterion("MTR_COD is null");
            return (Criteria) this;
        }

        public Criteria andMtrCodIsNotNull() {
            addCriterion("MTR_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMtrCodEqualTo(String value) {
            addCriterion("MTR_COD =", value, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andMtrCodNotEqualTo(String value) {
            addCriterion("MTR_COD <>", value, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andMtrCodGreaterThan(String value) {
            addCriterion("MTR_COD >", value, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andMtrCodGreaterThanOrEqualTo(String value) {
            addCriterion("MTR_COD >=", value, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andMtrCodLessThan(String value) {
            addCriterion("MTR_COD <", value, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andMtrCodLessThanOrEqualTo(String value) {
            addCriterion("MTR_COD <=", value, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andMtrCodLike(String value) {
            addCriterion("MTR_COD like", value, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andMtrCodNotLike(String value) {
            addCriterion("MTR_COD not like", value, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andMtrCodIn(List<String> values) {
            addCriterion("MTR_COD in", values, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andMtrCodNotIn(List<String> values) {
            addCriterion("MTR_COD not in", values, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andMtrCodBetween(String value1, String value2) {
            addCriterion("MTR_COD between", value1, value2, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andMtrCodNotBetween(String value1, String value2) {
            addCriterion("MTR_COD not between", value1, value2, "mtrCod");
            return (Criteria) this;
        }

        public Criteria andRdrLocIsNull() {
            addCriterion("RDR_LOC is null");
            return (Criteria) this;
        }

        public Criteria andRdrLocIsNotNull() {
            addCriterion("RDR_LOC is not null");
            return (Criteria) this;
        }

        public Criteria andRdrLocEqualTo(String value) {
            addCriterion("RDR_LOC =", value, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrLocNotEqualTo(String value) {
            addCriterion("RDR_LOC <>", value, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrLocGreaterThan(String value) {
            addCriterion("RDR_LOC >", value, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrLocGreaterThanOrEqualTo(String value) {
            addCriterion("RDR_LOC >=", value, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrLocLessThan(String value) {
            addCriterion("RDR_LOC <", value, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrLocLessThanOrEqualTo(String value) {
            addCriterion("RDR_LOC <=", value, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrLocLike(String value) {
            addCriterion("RDR_LOC like", value, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrLocNotLike(String value) {
            addCriterion("RDR_LOC not like", value, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrLocIn(List<String> values) {
            addCriterion("RDR_LOC in", values, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrLocNotIn(List<String> values) {
            addCriterion("RDR_LOC not in", values, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrLocBetween(String value1, String value2) {
            addCriterion("RDR_LOC between", value1, value2, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrLocNotBetween(String value1, String value2) {
            addCriterion("RDR_LOC not between", value1, value2, "rdrLoc");
            return (Criteria) this;
        }

        public Criteria andRdrStaIsNull() {
            addCriterion("RDR_STA is null");
            return (Criteria) this;
        }

        public Criteria andRdrStaIsNotNull() {
            addCriterion("RDR_STA is not null");
            return (Criteria) this;
        }

        public Criteria andRdrStaEqualTo(String value) {
            addCriterion("RDR_STA =", value, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrStaNotEqualTo(String value) {
            addCriterion("RDR_STA <>", value, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrStaGreaterThan(String value) {
            addCriterion("RDR_STA >", value, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrStaGreaterThanOrEqualTo(String value) {
            addCriterion("RDR_STA >=", value, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrStaLessThan(String value) {
            addCriterion("RDR_STA <", value, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrStaLessThanOrEqualTo(String value) {
            addCriterion("RDR_STA <=", value, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrStaLike(String value) {
            addCriterion("RDR_STA like", value, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrStaNotLike(String value) {
            addCriterion("RDR_STA not like", value, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrStaIn(List<String> values) {
            addCriterion("RDR_STA in", values, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrStaNotIn(List<String> values) {
            addCriterion("RDR_STA not in", values, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrStaBetween(String value1, String value2) {
            addCriterion("RDR_STA between", value1, value2, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrStaNotBetween(String value1, String value2) {
            addCriterion("RDR_STA not between", value1, value2, "rdrSta");
            return (Criteria) this;
        }

        public Criteria andRdrParIsNull() {
            addCriterion("RDR_PAR is null");
            return (Criteria) this;
        }

        public Criteria andRdrParIsNotNull() {
            addCriterion("RDR_PAR is not null");
            return (Criteria) this;
        }

        public Criteria andRdrParEqualTo(String value) {
            addCriterion("RDR_PAR =", value, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrParNotEqualTo(String value) {
            addCriterion("RDR_PAR <>", value, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrParGreaterThan(String value) {
            addCriterion("RDR_PAR >", value, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrParGreaterThanOrEqualTo(String value) {
            addCriterion("RDR_PAR >=", value, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrParLessThan(String value) {
            addCriterion("RDR_PAR <", value, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrParLessThanOrEqualTo(String value) {
            addCriterion("RDR_PAR <=", value, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrParLike(String value) {
            addCriterion("RDR_PAR like", value, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrParNotLike(String value) {
            addCriterion("RDR_PAR not like", value, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrParIn(List<String> values) {
            addCriterion("RDR_PAR in", values, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrParNotIn(List<String> values) {
            addCriterion("RDR_PAR not in", values, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrParBetween(String value1, String value2) {
            addCriterion("RDR_PAR between", value1, value2, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrParNotBetween(String value1, String value2) {
            addCriterion("RDR_PAR not between", value1, value2, "rdrPar");
            return (Criteria) this;
        }

        public Criteria andRdrDepIsNull() {
            addCriterion("RDR_DEP is null");
            return (Criteria) this;
        }

        public Criteria andRdrDepIsNotNull() {
            addCriterion("RDR_DEP is not null");
            return (Criteria) this;
        }

        public Criteria andRdrDepEqualTo(String value) {
            addCriterion("RDR_DEP =", value, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andRdrDepNotEqualTo(String value) {
            addCriterion("RDR_DEP <>", value, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andRdrDepGreaterThan(String value) {
            addCriterion("RDR_DEP >", value, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andRdrDepGreaterThanOrEqualTo(String value) {
            addCriterion("RDR_DEP >=", value, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andRdrDepLessThan(String value) {
            addCriterion("RDR_DEP <", value, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andRdrDepLessThanOrEqualTo(String value) {
            addCriterion("RDR_DEP <=", value, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andRdrDepLike(String value) {
            addCriterion("RDR_DEP like", value, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andRdrDepNotLike(String value) {
            addCriterion("RDR_DEP not like", value, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andRdrDepIn(List<String> values) {
            addCriterion("RDR_DEP in", values, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andRdrDepNotIn(List<String> values) {
            addCriterion("RDR_DEP not in", values, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andRdrDepBetween(String value1, String value2) {
            addCriterion("RDR_DEP between", value1, value2, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andRdrDepNotBetween(String value1, String value2) {
            addCriterion("RDR_DEP not between", value1, value2, "rdrDep");
            return (Criteria) this;
        }

        public Criteria andBuyDatIsNull() {
            addCriterion("BUY_DAT is null");
            return (Criteria) this;
        }

        public Criteria andBuyDatIsNotNull() {
            addCriterion("BUY_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andBuyDatEqualTo(Date value) {
            addCriterion("BUY_DAT =", value, "buyDat");
            return (Criteria) this;
        }

        public Criteria andBuyDatNotEqualTo(Date value) {
            addCriterion("BUY_DAT <>", value, "buyDat");
            return (Criteria) this;
        }

        public Criteria andBuyDatGreaterThan(Date value) {
            addCriterion("BUY_DAT >", value, "buyDat");
            return (Criteria) this;
        }

        public Criteria andBuyDatGreaterThanOrEqualTo(Date value) {
            addCriterion("BUY_DAT >=", value, "buyDat");
            return (Criteria) this;
        }

        public Criteria andBuyDatLessThan(Date value) {
            addCriterion("BUY_DAT <", value, "buyDat");
            return (Criteria) this;
        }

        public Criteria andBuyDatLessThanOrEqualTo(Date value) {
            addCriterion("BUY_DAT <=", value, "buyDat");
            return (Criteria) this;
        }

        public Criteria andBuyDatIn(List<Date> values) {
            addCriterion("BUY_DAT in", values, "buyDat");
            return (Criteria) this;
        }

        public Criteria andBuyDatNotIn(List<Date> values) {
            addCriterion("BUY_DAT not in", values, "buyDat");
            return (Criteria) this;
        }

        public Criteria andBuyDatBetween(Date value1, Date value2) {
            addCriterion("BUY_DAT between", value1, value2, "buyDat");
            return (Criteria) this;
        }

        public Criteria andBuyDatNotBetween(Date value1, Date value2) {
            addCriterion("BUY_DAT not between", value1, value2, "buyDat");
            return (Criteria) this;
        }

        public Criteria andFixDatIsNull() {
            addCriterion("FIX_DAT is null");
            return (Criteria) this;
        }

        public Criteria andFixDatIsNotNull() {
            addCriterion("FIX_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andFixDatEqualTo(Date value) {
            addCriterion("FIX_DAT =", value, "fixDat");
            return (Criteria) this;
        }

        public Criteria andFixDatNotEqualTo(Date value) {
            addCriterion("FIX_DAT <>", value, "fixDat");
            return (Criteria) this;
        }

        public Criteria andFixDatGreaterThan(Date value) {
            addCriterion("FIX_DAT >", value, "fixDat");
            return (Criteria) this;
        }

        public Criteria andFixDatGreaterThanOrEqualTo(Date value) {
            addCriterion("FIX_DAT >=", value, "fixDat");
            return (Criteria) this;
        }

        public Criteria andFixDatLessThan(Date value) {
            addCriterion("FIX_DAT <", value, "fixDat");
            return (Criteria) this;
        }

        public Criteria andFixDatLessThanOrEqualTo(Date value) {
            addCriterion("FIX_DAT <=", value, "fixDat");
            return (Criteria) this;
        }

        public Criteria andFixDatIn(List<Date> values) {
            addCriterion("FIX_DAT in", values, "fixDat");
            return (Criteria) this;
        }

        public Criteria andFixDatNotIn(List<Date> values) {
            addCriterion("FIX_DAT not in", values, "fixDat");
            return (Criteria) this;
        }

        public Criteria andFixDatBetween(Date value1, Date value2) {
            addCriterion("FIX_DAT between", value1, value2, "fixDat");
            return (Criteria) this;
        }

        public Criteria andFixDatNotBetween(Date value1, Date value2) {
            addCriterion("FIX_DAT not between", value1, value2, "fixDat");
            return (Criteria) this;
        }

        public Criteria andFixManIsNull() {
            addCriterion("FIX_MAN is null");
            return (Criteria) this;
        }

        public Criteria andFixManIsNotNull() {
            addCriterion("FIX_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andFixManEqualTo(String value) {
            addCriterion("FIX_MAN =", value, "fixMan");
            return (Criteria) this;
        }

        public Criteria andFixManNotEqualTo(String value) {
            addCriterion("FIX_MAN <>", value, "fixMan");
            return (Criteria) this;
        }

        public Criteria andFixManGreaterThan(String value) {
            addCriterion("FIX_MAN >", value, "fixMan");
            return (Criteria) this;
        }

        public Criteria andFixManGreaterThanOrEqualTo(String value) {
            addCriterion("FIX_MAN >=", value, "fixMan");
            return (Criteria) this;
        }

        public Criteria andFixManLessThan(String value) {
            addCriterion("FIX_MAN <", value, "fixMan");
            return (Criteria) this;
        }

        public Criteria andFixManLessThanOrEqualTo(String value) {
            addCriterion("FIX_MAN <=", value, "fixMan");
            return (Criteria) this;
        }

        public Criteria andFixManLike(String value) {
            addCriterion("FIX_MAN like", value, "fixMan");
            return (Criteria) this;
        }

        public Criteria andFixManNotLike(String value) {
            addCriterion("FIX_MAN not like", value, "fixMan");
            return (Criteria) this;
        }

        public Criteria andFixManIn(List<String> values) {
            addCriterion("FIX_MAN in", values, "fixMan");
            return (Criteria) this;
        }

        public Criteria andFixManNotIn(List<String> values) {
            addCriterion("FIX_MAN not in", values, "fixMan");
            return (Criteria) this;
        }

        public Criteria andFixManBetween(String value1, String value2) {
            addCriterion("FIX_MAN between", value1, value2, "fixMan");
            return (Criteria) this;
        }

        public Criteria andFixManNotBetween(String value1, String value2) {
            addCriterion("FIX_MAN not between", value1, value2, "fixMan");
            return (Criteria) this;
        }

        public Criteria andMntComIsNull() {
            addCriterion("MNT_COM is null");
            return (Criteria) this;
        }

        public Criteria andMntComIsNotNull() {
            addCriterion("MNT_COM is not null");
            return (Criteria) this;
        }

        public Criteria andMntComEqualTo(String value) {
            addCriterion("MNT_COM =", value, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntComNotEqualTo(String value) {
            addCriterion("MNT_COM <>", value, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntComGreaterThan(String value) {
            addCriterion("MNT_COM >", value, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntComGreaterThanOrEqualTo(String value) {
            addCriterion("MNT_COM >=", value, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntComLessThan(String value) {
            addCriterion("MNT_COM <", value, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntComLessThanOrEqualTo(String value) {
            addCriterion("MNT_COM <=", value, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntComLike(String value) {
            addCriterion("MNT_COM like", value, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntComNotLike(String value) {
            addCriterion("MNT_COM not like", value, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntComIn(List<String> values) {
            addCriterion("MNT_COM in", values, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntComNotIn(List<String> values) {
            addCriterion("MNT_COM not in", values, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntComBetween(String value1, String value2) {
            addCriterion("MNT_COM between", value1, value2, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntComNotBetween(String value1, String value2) {
            addCriterion("MNT_COM not between", value1, value2, "mntCom");
            return (Criteria) this;
        }

        public Criteria andMntManIsNull() {
            addCriterion("MNT_MAN is null");
            return (Criteria) this;
        }

        public Criteria andMntManIsNotNull() {
            addCriterion("MNT_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andMntManEqualTo(String value) {
            addCriterion("MNT_MAN =", value, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntManNotEqualTo(String value) {
            addCriterion("MNT_MAN <>", value, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntManGreaterThan(String value) {
            addCriterion("MNT_MAN >", value, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntManGreaterThanOrEqualTo(String value) {
            addCriterion("MNT_MAN >=", value, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntManLessThan(String value) {
            addCriterion("MNT_MAN <", value, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntManLessThanOrEqualTo(String value) {
            addCriterion("MNT_MAN <=", value, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntManLike(String value) {
            addCriterion("MNT_MAN like", value, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntManNotLike(String value) {
            addCriterion("MNT_MAN not like", value, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntManIn(List<String> values) {
            addCriterion("MNT_MAN in", values, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntManNotIn(List<String> values) {
            addCriterion("MNT_MAN not in", values, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntManBetween(String value1, String value2) {
            addCriterion("MNT_MAN between", value1, value2, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntManNotBetween(String value1, String value2) {
            addCriterion("MNT_MAN not between", value1, value2, "mntMan");
            return (Criteria) this;
        }

        public Criteria andMntTelIsNull() {
            addCriterion("MNT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andMntTelIsNotNull() {
            addCriterion("MNT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andMntTelEqualTo(String value) {
            addCriterion("MNT_TEL =", value, "mntTel");
            return (Criteria) this;
        }

        public Criteria andMntTelNotEqualTo(String value) {
            addCriterion("MNT_TEL <>", value, "mntTel");
            return (Criteria) this;
        }

        public Criteria andMntTelGreaterThan(String value) {
            addCriterion("MNT_TEL >", value, "mntTel");
            return (Criteria) this;
        }

        public Criteria andMntTelGreaterThanOrEqualTo(String value) {
            addCriterion("MNT_TEL >=", value, "mntTel");
            return (Criteria) this;
        }

        public Criteria andMntTelLessThan(String value) {
            addCriterion("MNT_TEL <", value, "mntTel");
            return (Criteria) this;
        }

        public Criteria andMntTelLessThanOrEqualTo(String value) {
            addCriterion("MNT_TEL <=", value, "mntTel");
            return (Criteria) this;
        }

        public Criteria andMntTelLike(String value) {
            addCriterion("MNT_TEL like", value, "mntTel");
            return (Criteria) this;
        }

        public Criteria andMntTelNotLike(String value) {
            addCriterion("MNT_TEL not like", value, "mntTel");
            return (Criteria) this;
        }

        public Criteria andMntTelIn(List<String> values) {
            addCriterion("MNT_TEL in", values, "mntTel");
            return (Criteria) this;
        }

        public Criteria andMntTelNotIn(List<String> values) {
            addCriterion("MNT_TEL not in", values, "mntTel");
            return (Criteria) this;
        }

        public Criteria andMntTelBetween(String value1, String value2) {
            addCriterion("MNT_TEL between", value1, value2, "mntTel");
            return (Criteria) this;
        }

        public Criteria andMntTelNotBetween(String value1, String value2) {
            addCriterion("MNT_TEL not between", value1, value2, "mntTel");
            return (Criteria) this;
        }

        public Criteria andTcpFlgIsNull() {
            addCriterion("TCP_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTcpFlgIsNotNull() {
            addCriterion("TCP_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTcpFlgEqualTo(String value) {
            addCriterion("TCP_FLG =", value, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andTcpFlgNotEqualTo(String value) {
            addCriterion("TCP_FLG <>", value, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andTcpFlgGreaterThan(String value) {
            addCriterion("TCP_FLG >", value, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andTcpFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TCP_FLG >=", value, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andTcpFlgLessThan(String value) {
            addCriterion("TCP_FLG <", value, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andTcpFlgLessThanOrEqualTo(String value) {
            addCriterion("TCP_FLG <=", value, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andTcpFlgLike(String value) {
            addCriterion("TCP_FLG like", value, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andTcpFlgNotLike(String value) {
            addCriterion("TCP_FLG not like", value, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andTcpFlgIn(List<String> values) {
            addCriterion("TCP_FLG in", values, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andTcpFlgNotIn(List<String> values) {
            addCriterion("TCP_FLG not in", values, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andTcpFlgBetween(String value1, String value2) {
            addCriterion("TCP_FLG between", value1, value2, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andTcpFlgNotBetween(String value1, String value2) {
            addCriterion("TCP_FLG not between", value1, value2, "tcpFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgIsNull() {
            addCriterion("WIF_FLG is null");
            return (Criteria) this;
        }

        public Criteria andWifFlgIsNotNull() {
            addCriterion("WIF_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andWifFlgEqualTo(String value) {
            addCriterion("WIF_FLG =", value, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgNotEqualTo(String value) {
            addCriterion("WIF_FLG <>", value, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgGreaterThan(String value) {
            addCriterion("WIF_FLG >", value, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgGreaterThanOrEqualTo(String value) {
            addCriterion("WIF_FLG >=", value, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgLessThan(String value) {
            addCriterion("WIF_FLG <", value, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgLessThanOrEqualTo(String value) {
            addCriterion("WIF_FLG <=", value, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgLike(String value) {
            addCriterion("WIF_FLG like", value, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgNotLike(String value) {
            addCriterion("WIF_FLG not like", value, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgIn(List<String> values) {
            addCriterion("WIF_FLG in", values, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgNotIn(List<String> values) {
            addCriterion("WIF_FLG not in", values, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgBetween(String value1, String value2) {
            addCriterion("WIF_FLG between", value1, value2, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andWifFlgNotBetween(String value1, String value2) {
            addCriterion("WIF_FLG not between", value1, value2, "wifFlg");
            return (Criteria) this;
        }

        public Criteria andRdrIpIsNull() {
            addCriterion("RDR_IP is null");
            return (Criteria) this;
        }

        public Criteria andRdrIpIsNotNull() {
            addCriterion("RDR_IP is not null");
            return (Criteria) this;
        }

        public Criteria andRdrIpEqualTo(String value) {
            addCriterion("RDR_IP =", value, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrIpNotEqualTo(String value) {
            addCriterion("RDR_IP <>", value, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrIpGreaterThan(String value) {
            addCriterion("RDR_IP >", value, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrIpGreaterThanOrEqualTo(String value) {
            addCriterion("RDR_IP >=", value, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrIpLessThan(String value) {
            addCriterion("RDR_IP <", value, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrIpLessThanOrEqualTo(String value) {
            addCriterion("RDR_IP <=", value, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrIpLike(String value) {
            addCriterion("RDR_IP like", value, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrIpNotLike(String value) {
            addCriterion("RDR_IP not like", value, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrIpIn(List<String> values) {
            addCriterion("RDR_IP in", values, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrIpNotIn(List<String> values) {
            addCriterion("RDR_IP not in", values, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrIpBetween(String value1, String value2) {
            addCriterion("RDR_IP between", value1, value2, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrIpNotBetween(String value1, String value2) {
            addCriterion("RDR_IP not between", value1, value2, "rdrIp");
            return (Criteria) this;
        }

        public Criteria andRdrPortIsNull() {
            addCriterion("RDR_PORT is null");
            return (Criteria) this;
        }

        public Criteria andRdrPortIsNotNull() {
            addCriterion("RDR_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andRdrPortEqualTo(Integer value) {
            addCriterion("RDR_PORT =", value, "rdrPort");
            return (Criteria) this;
        }

        public Criteria andRdrPortNotEqualTo(Integer value) {
            addCriterion("RDR_PORT <>", value, "rdrPort");
            return (Criteria) this;
        }

        public Criteria andRdrPortGreaterThan(Integer value) {
            addCriterion("RDR_PORT >", value, "rdrPort");
            return (Criteria) this;
        }

        public Criteria andRdrPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("RDR_PORT >=", value, "rdrPort");
            return (Criteria) this;
        }

        public Criteria andRdrPortLessThan(Integer value) {
            addCriterion("RDR_PORT <", value, "rdrPort");
            return (Criteria) this;
        }

        public Criteria andRdrPortLessThanOrEqualTo(Integer value) {
            addCriterion("RDR_PORT <=", value, "rdrPort");
            return (Criteria) this;
        }

        public Criteria andRdrPortIn(List<Integer> values) {
            addCriterion("RDR_PORT in", values, "rdrPort");
            return (Criteria) this;
        }

        public Criteria andRdrPortNotIn(List<Integer> values) {
            addCriterion("RDR_PORT not in", values, "rdrPort");
            return (Criteria) this;
        }

        public Criteria andRdrPortBetween(Integer value1, Integer value2) {
            addCriterion("RDR_PORT between", value1, value2, "rdrPort");
            return (Criteria) this;
        }

        public Criteria andRdrPortNotBetween(Integer value1, Integer value2) {
            addCriterion("RDR_PORT not between", value1, value2, "rdrPort");
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

        public Criteria andCrtUsrNamIsNull() {
            addCriterion("CRT_USR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamIsNotNull() {
            addCriterion("CRT_USR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamEqualTo(String value) {
            addCriterion("CRT_USR_NAM =", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamNotEqualTo(String value) {
            addCriterion("CRT_USR_NAM <>", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamGreaterThan(String value) {
            addCriterion("CRT_USR_NAM >", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NAM >=", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamLessThan(String value) {
            addCriterion("CRT_USR_NAM <", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NAM <=", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamLike(String value) {
            addCriterion("CRT_USR_NAM like", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamNotLike(String value) {
            addCriterion("CRT_USR_NAM not like", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamIn(List<String> values) {
            addCriterion("CRT_USR_NAM in", values, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamNotIn(List<String> values) {
            addCriterion("CRT_USR_NAM not in", values, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamBetween(String value1, String value2) {
            addCriterion("CRT_USR_NAM between", value1, value2, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_NAM not between", value1, value2, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtTimIsNull() {
            addCriterion("CRT_TIM is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimIsNotNull() {
            addCriterion("CRT_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimEqualTo(Date value) {
            addCriterion("CRT_TIM =", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotEqualTo(Date value) {
            addCriterion("CRT_TIM <>", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimGreaterThan(Date value) {
            addCriterion("CRT_TIM >", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIM >=", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimLessThan(Date value) {
            addCriterion("CRT_TIM <", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIM <=", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimIn(List<Date> values) {
            addCriterion("CRT_TIM in", values, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotIn(List<Date> values) {
            addCriterion("CRT_TIM not in", values, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimBetween(Date value1, Date value2) {
            addCriterion("CRT_TIM between", value1, value2, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIM not between", value1, value2, "crtTim");
            return (Criteria) this;
        }

        public Criteria andModUsrNoIsNull() {
            addCriterion("MOD_USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andModUsrNoIsNotNull() {
            addCriterion("MOD_USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andModUsrNoEqualTo(String value) {
            addCriterion("MOD_USR_NO =", value, "modUsrNo");
            return (Criteria) this;
        }

        public Criteria andModUsrNoNotEqualTo(String value) {
            addCriterion("MOD_USR_NO <>", value, "modUsrNo");
            return (Criteria) this;
        }

        public Criteria andModUsrNoGreaterThan(String value) {
            addCriterion("MOD_USR_NO >", value, "modUsrNo");
            return (Criteria) this;
        }

        public Criteria andModUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USR_NO >=", value, "modUsrNo");
            return (Criteria) this;
        }

        public Criteria andModUsrNoLessThan(String value) {
            addCriterion("MOD_USR_NO <", value, "modUsrNo");
            return (Criteria) this;
        }

        public Criteria andModUsrNoLessThanOrEqualTo(String value) {
            addCriterion("MOD_USR_NO <=", value, "modUsrNo");
            return (Criteria) this;
        }

        public Criteria andModUsrNoLike(String value) {
            addCriterion("MOD_USR_NO like", value, "modUsrNo");
            return (Criteria) this;
        }

        public Criteria andModUsrNoNotLike(String value) {
            addCriterion("MOD_USR_NO not like", value, "modUsrNo");
            return (Criteria) this;
        }

        public Criteria andModUsrNoIn(List<String> values) {
            addCriterion("MOD_USR_NO in", values, "modUsrNo");
            return (Criteria) this;
        }

        public Criteria andModUsrNoNotIn(List<String> values) {
            addCriterion("MOD_USR_NO not in", values, "modUsrNo");
            return (Criteria) this;
        }

        public Criteria andModUsrNoBetween(String value1, String value2) {
            addCriterion("MOD_USR_NO between", value1, value2, "modUsrNo");
            return (Criteria) this;
        }

        public Criteria andModUsrNoNotBetween(String value1, String value2) {
            addCriterion("MOD_USR_NO not between", value1, value2, "modUsrNo");
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

        public Criteria andModTimIsNull() {
            addCriterion("MOD_TIM is null");
            return (Criteria) this;
        }

        public Criteria andModTimIsNotNull() {
            addCriterion("MOD_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andModTimEqualTo(Date value) {
            addCriterion("MOD_TIM =", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotEqualTo(Date value) {
            addCriterion("MOD_TIM <>", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimGreaterThan(Date value) {
            addCriterion("MOD_TIM >", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimGreaterThanOrEqualTo(Date value) {
            addCriterion("MOD_TIM >=", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimLessThan(Date value) {
            addCriterion("MOD_TIM <", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimLessThanOrEqualTo(Date value) {
            addCriterion("MOD_TIM <=", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimIn(List<Date> values) {
            addCriterion("MOD_TIM in", values, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotIn(List<Date> values) {
            addCriterion("MOD_TIM not in", values, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimBetween(Date value1, Date value2) {
            addCriterion("MOD_TIM between", value1, value2, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotBetween(Date value1, Date value2) {
            addCriterion("MOD_TIM not between", value1, value2, "modTim");
            return (Criteria) this;
        }
    }

    /**
     */
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