package activetech.edpc.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HspXtAddExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspXtAddExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andXtSeqIsNull() {
            addCriterion("XT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andXtSeqIsNotNull() {
            addCriterion("XT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andXtSeqEqualTo(String value) {
            addCriterion("XT_SEQ =", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqNotEqualTo(String value) {
            addCriterion("XT_SEQ <>", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqGreaterThan(String value) {
            addCriterion("XT_SEQ >", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqGreaterThanOrEqualTo(String value) {
            addCriterion("XT_SEQ >=", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqLessThan(String value) {
            addCriterion("XT_SEQ <", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqLessThanOrEqualTo(String value) {
            addCriterion("XT_SEQ <=", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqLike(String value) {
            addCriterion("XT_SEQ like", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqNotLike(String value) {
            addCriterion("XT_SEQ not like", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqIn(List<String> values) {
            addCriterion("XT_SEQ in", values, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqNotIn(List<String> values) {
            addCriterion("XT_SEQ not in", values, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqBetween(String value1, String value2) {
            addCriterion("XT_SEQ between", value1, value2, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqNotBetween(String value1, String value2) {
            addCriterion("XT_SEQ not between", value1, value2, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andWayTypIsNull() {
            addCriterion("WAY_TYP is null");
            return (Criteria) this;
        }

        public Criteria andWayTypIsNotNull() {
            addCriterion("WAY_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andWayTypEqualTo(String value) {
            addCriterion("WAY_TYP =", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypNotEqualTo(String value) {
            addCriterion("WAY_TYP <>", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypGreaterThan(String value) {
            addCriterion("WAY_TYP >", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypGreaterThanOrEqualTo(String value) {
            addCriterion("WAY_TYP >=", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypLessThan(String value) {
            addCriterion("WAY_TYP <", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypLessThanOrEqualTo(String value) {
            addCriterion("WAY_TYP <=", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypLike(String value) {
            addCriterion("WAY_TYP like", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypNotLike(String value) {
            addCriterion("WAY_TYP not like", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypIn(List<String> values) {
            addCriterion("WAY_TYP in", values, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypNotIn(List<String> values) {
            addCriterion("WAY_TYP not in", values, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypBetween(String value1, String value2) {
            addCriterion("WAY_TYP between", value1, value2, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypNotBetween(String value1, String value2) {
            addCriterion("WAY_TYP not between", value1, value2, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andMpiNoIsNull() {
            addCriterion("MPI_NO is null");
            return (Criteria) this;
        }

        public Criteria andMpiNoIsNotNull() {
            addCriterion("MPI_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMpiNoEqualTo(String value) {
            addCriterion("MPI_NO =", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoNotEqualTo(String value) {
            addCriterion("MPI_NO <>", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoGreaterThan(String value) {
            addCriterion("MPI_NO >", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoGreaterThanOrEqualTo(String value) {
            addCriterion("MPI_NO >=", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoLessThan(String value) {
            addCriterion("MPI_NO <", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoLessThanOrEqualTo(String value) {
            addCriterion("MPI_NO <=", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoLike(String value) {
            addCriterion("MPI_NO like", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoNotLike(String value) {
            addCriterion("MPI_NO not like", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoIn(List<String> values) {
            addCriterion("MPI_NO in", values, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoNotIn(List<String> values) {
            addCriterion("MPI_NO not in", values, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoBetween(String value1, String value2) {
            addCriterion("MPI_NO between", value1, value2, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoNotBetween(String value1, String value2) {
            addCriterion("MPI_NO not between", value1, value2, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andSadIdIsNull() {
            addCriterion("SAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andSadIdIsNotNull() {
            addCriterion("SAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSadIdEqualTo(String value) {
            addCriterion("SAD_ID =", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdNotEqualTo(String value) {
            addCriterion("SAD_ID <>", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdGreaterThan(String value) {
            addCriterion("SAD_ID >", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdGreaterThanOrEqualTo(String value) {
            addCriterion("SAD_ID >=", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdLessThan(String value) {
            addCriterion("SAD_ID <", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdLessThanOrEqualTo(String value) {
            addCriterion("SAD_ID <=", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdLike(String value) {
            addCriterion("SAD_ID like", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdNotLike(String value) {
            addCriterion("SAD_ID not like", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdIn(List<String> values) {
            addCriterion("SAD_ID in", values, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdNotIn(List<String> values) {
            addCriterion("SAD_ID not in", values, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdBetween(String value1, String value2) {
            addCriterion("SAD_ID between", value1, value2, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdNotBetween(String value1, String value2) {
            addCriterion("SAD_ID not between", value1, value2, "sadId");
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

        public Criteria andAdmNbrIsNull() {
            addCriterion("ADM_NBR is null");
            return (Criteria) this;
        }

        public Criteria andAdmNbrIsNotNull() {
            addCriterion("ADM_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andAdmNbrEqualTo(String value) {
            addCriterion("ADM_NBR =", value, "admNbr");
            return (Criteria) this;
        }

        public Criteria andAdmNbrNotEqualTo(String value) {
            addCriterion("ADM_NBR <>", value, "admNbr");
            return (Criteria) this;
        }

        public Criteria andAdmNbrGreaterThan(String value) {
            addCriterion("ADM_NBR >", value, "admNbr");
            return (Criteria) this;
        }

        public Criteria andAdmNbrGreaterThanOrEqualTo(String value) {
            addCriterion("ADM_NBR >=", value, "admNbr");
            return (Criteria) this;
        }

        public Criteria andAdmNbrLessThan(String value) {
            addCriterion("ADM_NBR <", value, "admNbr");
            return (Criteria) this;
        }

        public Criteria andAdmNbrLessThanOrEqualTo(String value) {
            addCriterion("ADM_NBR <=", value, "admNbr");
            return (Criteria) this;
        }

        public Criteria andAdmNbrLike(String value) {
            addCriterion("ADM_NBR like", value, "admNbr");
            return (Criteria) this;
        }

        public Criteria andAdmNbrNotLike(String value) {
            addCriterion("ADM_NBR not like", value, "admNbr");
            return (Criteria) this;
        }

        public Criteria andAdmNbrIn(List<String> values) {
            addCriterion("ADM_NBR in", values, "admNbr");
            return (Criteria) this;
        }

        public Criteria andAdmNbrNotIn(List<String> values) {
            addCriterion("ADM_NBR not in", values, "admNbr");
            return (Criteria) this;
        }

        public Criteria andAdmNbrBetween(String value1, String value2) {
            addCriterion("ADM_NBR between", value1, value2, "admNbr");
            return (Criteria) this;
        }

        public Criteria andAdmNbrNotBetween(String value1, String value2) {
            addCriterion("ADM_NBR not between", value1, value2, "admNbr");
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
            addCriterionForJDBCDate("BTH_DAT =", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatNotEqualTo(Date value) {
            addCriterionForJDBCDate("BTH_DAT <>", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatGreaterThan(Date value) {
            addCriterionForJDBCDate("BTH_DAT >", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BTH_DAT >=", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatLessThan(Date value) {
            addCriterionForJDBCDate("BTH_DAT <", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BTH_DAT <=", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatIn(List<Date> values) {
            addCriterionForJDBCDate("BTH_DAT in", values, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatNotIn(List<Date> values) {
            addCriterionForJDBCDate("BTH_DAT not in", values, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BTH_DAT between", value1, value2, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BTH_DAT not between", value1, value2, "bthDat");
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

        public Criteria andSenRctIsNull() {
            addCriterion("SEN_RCT is null");
            return (Criteria) this;
        }

        public Criteria andSenRctIsNotNull() {
            addCriterion("SEN_RCT is not null");
            return (Criteria) this;
        }

        public Criteria andSenRctEqualTo(String value) {
            addCriterion("SEN_RCT =", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctNotEqualTo(String value) {
            addCriterion("SEN_RCT <>", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctGreaterThan(String value) {
            addCriterion("SEN_RCT >", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctGreaterThanOrEqualTo(String value) {
            addCriterion("SEN_RCT >=", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctLessThan(String value) {
            addCriterion("SEN_RCT <", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctLessThanOrEqualTo(String value) {
            addCriterion("SEN_RCT <=", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctLike(String value) {
            addCriterion("SEN_RCT like", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctNotLike(String value) {
            addCriterion("SEN_RCT not like", value, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctIn(List<String> values) {
            addCriterion("SEN_RCT in", values, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctNotIn(List<String> values) {
            addCriterion("SEN_RCT not in", values, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctBetween(String value1, String value2) {
            addCriterion("SEN_RCT between", value1, value2, "senRct");
            return (Criteria) this;
        }

        public Criteria andSenRctNotBetween(String value1, String value2) {
            addCriterion("SEN_RCT not between", value1, value2, "senRct");
            return (Criteria) this;
        }

        public Criteria andBreNbrIsNull() {
            addCriterion("BRE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andBreNbrIsNotNull() {
            addCriterion("BRE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andBreNbrEqualTo(Short value) {
            addCriterion("BRE_NBR =", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotEqualTo(Short value) {
            addCriterion("BRE_NBR <>", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThan(Short value) {
            addCriterion("BRE_NBR >", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("BRE_NBR >=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThan(Short value) {
            addCriterion("BRE_NBR <", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThanOrEqualTo(Short value) {
            addCriterion("BRE_NBR <=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrIn(List<Short> values) {
            addCriterion("BRE_NBR in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotIn(List<Short> values) {
            addCriterion("BRE_NBR not in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrBetween(Short value1, Short value2) {
            addCriterion("BRE_NBR between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotBetween(Short value1, Short value2) {
            addCriterion("BRE_NBR not between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andPulFqyIsNull() {
            addCriterion("PUL_FQY is null");
            return (Criteria) this;
        }

        public Criteria andPulFqyIsNotNull() {
            addCriterion("PUL_FQY is not null");
            return (Criteria) this;
        }

        public Criteria andPulFqyEqualTo(Short value) {
            addCriterion("PUL_FQY =", value, "pulFqy");
            return (Criteria) this;
        }

        public Criteria andPulFqyNotEqualTo(Short value) {
            addCriterion("PUL_FQY <>", value, "pulFqy");
            return (Criteria) this;
        }

        public Criteria andPulFqyGreaterThan(Short value) {
            addCriterion("PUL_FQY >", value, "pulFqy");
            return (Criteria) this;
        }

        public Criteria andPulFqyGreaterThanOrEqualTo(Short value) {
            addCriterion("PUL_FQY >=", value, "pulFqy");
            return (Criteria) this;
        }

        public Criteria andPulFqyLessThan(Short value) {
            addCriterion("PUL_FQY <", value, "pulFqy");
            return (Criteria) this;
        }

        public Criteria andPulFqyLessThanOrEqualTo(Short value) {
            addCriterion("PUL_FQY <=", value, "pulFqy");
            return (Criteria) this;
        }

        public Criteria andPulFqyIn(List<Short> values) {
            addCriterion("PUL_FQY in", values, "pulFqy");
            return (Criteria) this;
        }

        public Criteria andPulFqyNotIn(List<Short> values) {
            addCriterion("PUL_FQY not in", values, "pulFqy");
            return (Criteria) this;
        }

        public Criteria andPulFqyBetween(Short value1, Short value2) {
            addCriterion("PUL_FQY between", value1, value2, "pulFqy");
            return (Criteria) this;
        }

        public Criteria andPulFqyNotBetween(Short value1, Short value2) {
            addCriterion("PUL_FQY not between", value1, value2, "pulFqy");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNull() {
            addCriterion("HRT_RTE is null");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNotNull() {
            addCriterion("HRT_RTE is not null");
            return (Criteria) this;
        }

        public Criteria andHrtRteEqualTo(Short value) {
            addCriterion("HRT_RTE =", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotEqualTo(Short value) {
            addCriterion("HRT_RTE <>", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThan(Short value) {
            addCriterion("HRT_RTE >", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThanOrEqualTo(Short value) {
            addCriterion("HRT_RTE >=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThan(Short value) {
            addCriterion("HRT_RTE <", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThanOrEqualTo(Short value) {
            addCriterion("HRT_RTE <=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteIn(List<Short> values) {
            addCriterion("HRT_RTE in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotIn(List<Short> values) {
            addCriterion("HRT_RTE not in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteBetween(Short value1, Short value2) {
            addCriterion("HRT_RTE between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotBetween(Short value1, Short value2) {
            addCriterion("HRT_RTE not between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andSbpNbrIsNull() {
            addCriterion("SBP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpNbrIsNotNull() {
            addCriterion("SBP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpNbrEqualTo(Short value) {
            addCriterion("SBP_NBR =", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrNotEqualTo(Short value) {
            addCriterion("SBP_NBR <>", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrGreaterThan(Short value) {
            addCriterion("SBP_NBR >", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("SBP_NBR >=", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrLessThan(Short value) {
            addCriterion("SBP_NBR <", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrLessThanOrEqualTo(Short value) {
            addCriterion("SBP_NBR <=", value, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrIn(List<Short> values) {
            addCriterion("SBP_NBR in", values, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrNotIn(List<Short> values) {
            addCriterion("SBP_NBR not in", values, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrBetween(Short value1, Short value2) {
            addCriterion("SBP_NBR between", value1, value2, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpNbrNotBetween(Short value1, Short value2) {
            addCriterion("SBP_NBR not between", value1, value2, "sbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrIsNull() {
            addCriterion("DBP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andDbpNbrIsNotNull() {
            addCriterion("DBP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andDbpNbrEqualTo(Short value) {
            addCriterion("DBP_NBR =", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrNotEqualTo(Short value) {
            addCriterion("DBP_NBR <>", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrGreaterThan(Short value) {
            addCriterion("DBP_NBR >", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("DBP_NBR >=", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrLessThan(Short value) {
            addCriterion("DBP_NBR <", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrLessThanOrEqualTo(Short value) {
            addCriterion("DBP_NBR <=", value, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrIn(List<Short> values) {
            addCriterion("DBP_NBR in", values, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrNotIn(List<Short> values) {
            addCriterion("DBP_NBR not in", values, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrBetween(Short value1, Short value2) {
            addCriterion("DBP_NBR between", value1, value2, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andDbpNbrNotBetween(Short value1, Short value2) {
            addCriterion("DBP_NBR not between", value1, value2, "dbpNbr");
            return (Criteria) this;
        }

        public Criteria andBldOxyIsNull() {
            addCriterion("BLD_OXY is null");
            return (Criteria) this;
        }

        public Criteria andBldOxyIsNotNull() {
            addCriterion("BLD_OXY is not null");
            return (Criteria) this;
        }

        public Criteria andBldOxyEqualTo(Short value) {
            addCriterion("BLD_OXY =", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyNotEqualTo(Short value) {
            addCriterion("BLD_OXY <>", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyGreaterThan(Short value) {
            addCriterion("BLD_OXY >", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyGreaterThanOrEqualTo(Short value) {
            addCriterion("BLD_OXY >=", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyLessThan(Short value) {
            addCriterion("BLD_OXY <", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyLessThanOrEqualTo(Short value) {
            addCriterion("BLD_OXY <=", value, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyIn(List<Short> values) {
            addCriterion("BLD_OXY in", values, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyNotIn(List<Short> values) {
            addCriterion("BLD_OXY not in", values, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyBetween(Short value1, Short value2) {
            addCriterion("BLD_OXY between", value1, value2, "bldOxy");
            return (Criteria) this;
        }

        public Criteria andBldOxyNotBetween(Short value1, Short value2) {
            addCriterion("BLD_OXY not between", value1, value2, "bldOxy");
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

        public Criteria andRepDocIsNull() {
            addCriterion("REP_DOC is null");
            return (Criteria) this;
        }

        public Criteria andRepDocIsNotNull() {
            addCriterion("REP_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andRepDocEqualTo(String value) {
            addCriterion("REP_DOC =", value, "repDoc");
            return (Criteria) this;
        }

        public Criteria andRepDocNotEqualTo(String value) {
            addCriterion("REP_DOC <>", value, "repDoc");
            return (Criteria) this;
        }

        public Criteria andRepDocGreaterThan(String value) {
            addCriterion("REP_DOC >", value, "repDoc");
            return (Criteria) this;
        }

        public Criteria andRepDocGreaterThanOrEqualTo(String value) {
            addCriterion("REP_DOC >=", value, "repDoc");
            return (Criteria) this;
        }

        public Criteria andRepDocLessThan(String value) {
            addCriterion("REP_DOC <", value, "repDoc");
            return (Criteria) this;
        }

        public Criteria andRepDocLessThanOrEqualTo(String value) {
            addCriterion("REP_DOC <=", value, "repDoc");
            return (Criteria) this;
        }

        public Criteria andRepDocLike(String value) {
            addCriterion("REP_DOC like", value, "repDoc");
            return (Criteria) this;
        }

        public Criteria andRepDocNotLike(String value) {
            addCriterion("REP_DOC not like", value, "repDoc");
            return (Criteria) this;
        }

        public Criteria andRepDocIn(List<String> values) {
            addCriterion("REP_DOC in", values, "repDoc");
            return (Criteria) this;
        }

        public Criteria andRepDocNotIn(List<String> values) {
            addCriterion("REP_DOC not in", values, "repDoc");
            return (Criteria) this;
        }

        public Criteria andRepDocBetween(String value1, String value2) {
            addCriterion("REP_DOC between", value1, value2, "repDoc");
            return (Criteria) this;
        }

        public Criteria andRepDocNotBetween(String value1, String value2) {
            addCriterion("REP_DOC not between", value1, value2, "repDoc");
            return (Criteria) this;
        }

        public Criteria andDocDiaIsNull() {
            addCriterion("DOC_DIA is null");
            return (Criteria) this;
        }

        public Criteria andDocDiaIsNotNull() {
            addCriterion("DOC_DIA is not null");
            return (Criteria) this;
        }

        public Criteria andDocDiaEqualTo(String value) {
            addCriterion("DOC_DIA =", value, "docDia");
            return (Criteria) this;
        }

        public Criteria andDocDiaNotEqualTo(String value) {
            addCriterion("DOC_DIA <>", value, "docDia");
            return (Criteria) this;
        }

        public Criteria andDocDiaGreaterThan(String value) {
            addCriterion("DOC_DIA >", value, "docDia");
            return (Criteria) this;
        }

        public Criteria andDocDiaGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_DIA >=", value, "docDia");
            return (Criteria) this;
        }

        public Criteria andDocDiaLessThan(String value) {
            addCriterion("DOC_DIA <", value, "docDia");
            return (Criteria) this;
        }

        public Criteria andDocDiaLessThanOrEqualTo(String value) {
            addCriterion("DOC_DIA <=", value, "docDia");
            return (Criteria) this;
        }

        public Criteria andDocDiaLike(String value) {
            addCriterion("DOC_DIA like", value, "docDia");
            return (Criteria) this;
        }

        public Criteria andDocDiaNotLike(String value) {
            addCriterion("DOC_DIA not like", value, "docDia");
            return (Criteria) this;
        }

        public Criteria andDocDiaIn(List<String> values) {
            addCriterion("DOC_DIA in", values, "docDia");
            return (Criteria) this;
        }

        public Criteria andDocDiaNotIn(List<String> values) {
            addCriterion("DOC_DIA not in", values, "docDia");
            return (Criteria) this;
        }

        public Criteria andDocDiaBetween(String value1, String value2) {
            addCriterion("DOC_DIA between", value1, value2, "docDia");
            return (Criteria) this;
        }

        public Criteria andDocDiaNotBetween(String value1, String value2) {
            addCriterion("DOC_DIA not between", value1, value2, "docDia");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRegTimIsNull() {
            addCriterion("REG_TIM is null");
            return (Criteria) this;
        }

        public Criteria andRegTimIsNotNull() {
            addCriterion("REG_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimEqualTo(Date value) {
            addCriterionForJDBCDate("REG_TIM =", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimNotEqualTo(Date value) {
            addCriterionForJDBCDate("REG_TIM <>", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimGreaterThan(Date value) {
            addCriterionForJDBCDate("REG_TIM >", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REG_TIM >=", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimLessThan(Date value) {
            addCriterionForJDBCDate("REG_TIM <", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REG_TIM <=", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimIn(List<Date> values) {
            addCriterionForJDBCDate("REG_TIM in", values, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimNotIn(List<Date> values) {
            addCriterionForJDBCDate("REG_TIM not in", values, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REG_TIM between", value1, value2, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REG_TIM not between", value1, value2, "regTim");
            return (Criteria) this;
        }

        public Criteria andHspDepIsNull() {
            addCriterion("HSP_DEP is null");
            return (Criteria) this;
        }

        public Criteria andHspDepIsNotNull() {
            addCriterion("HSP_DEP is not null");
            return (Criteria) this;
        }

        public Criteria andHspDepEqualTo(String value) {
            addCriterion("HSP_DEP =", value, "hspDep");
            return (Criteria) this;
        }

        public Criteria andHspDepNotEqualTo(String value) {
            addCriterion("HSP_DEP <>", value, "hspDep");
            return (Criteria) this;
        }

        public Criteria andHspDepGreaterThan(String value) {
            addCriterion("HSP_DEP >", value, "hspDep");
            return (Criteria) this;
        }

        public Criteria andHspDepGreaterThanOrEqualTo(String value) {
            addCriterion("HSP_DEP >=", value, "hspDep");
            return (Criteria) this;
        }

        public Criteria andHspDepLessThan(String value) {
            addCriterion("HSP_DEP <", value, "hspDep");
            return (Criteria) this;
        }

        public Criteria andHspDepLessThanOrEqualTo(String value) {
            addCriterion("HSP_DEP <=", value, "hspDep");
            return (Criteria) this;
        }

        public Criteria andHspDepLike(String value) {
            addCriterion("HSP_DEP like", value, "hspDep");
            return (Criteria) this;
        }

        public Criteria andHspDepNotLike(String value) {
            addCriterion("HSP_DEP not like", value, "hspDep");
            return (Criteria) this;
        }

        public Criteria andHspDepIn(List<String> values) {
            addCriterion("HSP_DEP in", values, "hspDep");
            return (Criteria) this;
        }

        public Criteria andHspDepNotIn(List<String> values) {
            addCriterion("HSP_DEP not in", values, "hspDep");
            return (Criteria) this;
        }

        public Criteria andHspDepBetween(String value1, String value2) {
            addCriterion("HSP_DEP between", value1, value2, "hspDep");
            return (Criteria) this;
        }

        public Criteria andHspDepNotBetween(String value1, String value2) {
            addCriterion("HSP_DEP not between", value1, value2, "hspDep");
            return (Criteria) this;
        }

        public Criteria andIllDepIsNull() {
            addCriterion("ILL_DEP is null");
            return (Criteria) this;
        }

        public Criteria andIllDepIsNotNull() {
            addCriterion("ILL_DEP is not null");
            return (Criteria) this;
        }

        public Criteria andIllDepEqualTo(String value) {
            addCriterion("ILL_DEP =", value, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllDepNotEqualTo(String value) {
            addCriterion("ILL_DEP <>", value, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllDepGreaterThan(String value) {
            addCriterion("ILL_DEP >", value, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllDepGreaterThanOrEqualTo(String value) {
            addCriterion("ILL_DEP >=", value, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllDepLessThan(String value) {
            addCriterion("ILL_DEP <", value, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllDepLessThanOrEqualTo(String value) {
            addCriterion("ILL_DEP <=", value, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllDepLike(String value) {
            addCriterion("ILL_DEP like", value, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllDepNotLike(String value) {
            addCriterion("ILL_DEP not like", value, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllDepIn(List<String> values) {
            addCriterion("ILL_DEP in", values, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllDepNotIn(List<String> values) {
            addCriterion("ILL_DEP not in", values, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllDepBetween(String value1, String value2) {
            addCriterion("ILL_DEP between", value1, value2, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllDepNotBetween(String value1, String value2) {
            addCriterion("ILL_DEP not between", value1, value2, "illDep");
            return (Criteria) this;
        }

        public Criteria andIllTimIsNull() {
            addCriterion("ILL_TIM is null");
            return (Criteria) this;
        }

        public Criteria andIllTimIsNotNull() {
            addCriterion("ILL_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andIllTimEqualTo(Date value) {
            addCriterionForJDBCDate("ILL_TIM =", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimNotEqualTo(Date value) {
            addCriterionForJDBCDate("ILL_TIM <>", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimGreaterThan(Date value) {
            addCriterionForJDBCDate("ILL_TIM >", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ILL_TIM >=", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimLessThan(Date value) {
            addCriterionForJDBCDate("ILL_TIM <", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ILL_TIM <=", value, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimIn(List<Date> values) {
            addCriterionForJDBCDate("ILL_TIM in", values, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimNotIn(List<Date> values) {
            addCriterionForJDBCDate("ILL_TIM not in", values, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ILL_TIM between", value1, value2, "illTim");
            return (Criteria) this;
        }

        public Criteria andIllTimNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ILL_TIM not between", value1, value2, "illTim");
            return (Criteria) this;
        }

        public Criteria andCbpFlgIsNull() {
            addCriterion("CBP_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCbpFlgIsNotNull() {
            addCriterion("CBP_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCbpFlgEqualTo(String value) {
            addCriterion("CBP_FLG =", value, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andCbpFlgNotEqualTo(String value) {
            addCriterion("CBP_FLG <>", value, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andCbpFlgGreaterThan(String value) {
            addCriterion("CBP_FLG >", value, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andCbpFlgGreaterThanOrEqualTo(String value) {
            addCriterion("CBP_FLG >=", value, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andCbpFlgLessThan(String value) {
            addCriterion("CBP_FLG <", value, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andCbpFlgLessThanOrEqualTo(String value) {
            addCriterion("CBP_FLG <=", value, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andCbpFlgLike(String value) {
            addCriterion("CBP_FLG like", value, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andCbpFlgNotLike(String value) {
            addCriterion("CBP_FLG not like", value, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andCbpFlgIn(List<String> values) {
            addCriterion("CBP_FLG in", values, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andCbpFlgNotIn(List<String> values) {
            addCriterion("CBP_FLG not in", values, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andCbpFlgBetween(String value1, String value2) {
            addCriterion("CBP_FLG between", value1, value2, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andCbpFlgNotBetween(String value1, String value2) {
            addCriterion("CBP_FLG not between", value1, value2, "cbpFlg");
            return (Criteria) this;
        }

        public Criteria andIllPrdIsNull() {
            addCriterion("ILL_PRD is null");
            return (Criteria) this;
        }

        public Criteria andIllPrdIsNotNull() {
            addCriterion("ILL_PRD is not null");
            return (Criteria) this;
        }

        public Criteria andIllPrdEqualTo(String value) {
            addCriterion("ILL_PRD =", value, "illPrd");
            return (Criteria) this;
        }

        public Criteria andIllPrdNotEqualTo(String value) {
            addCriterion("ILL_PRD <>", value, "illPrd");
            return (Criteria) this;
        }

        public Criteria andIllPrdGreaterThan(String value) {
            addCriterion("ILL_PRD >", value, "illPrd");
            return (Criteria) this;
        }

        public Criteria andIllPrdGreaterThanOrEqualTo(String value) {
            addCriterion("ILL_PRD >=", value, "illPrd");
            return (Criteria) this;
        }

        public Criteria andIllPrdLessThan(String value) {
            addCriterion("ILL_PRD <", value, "illPrd");
            return (Criteria) this;
        }

        public Criteria andIllPrdLessThanOrEqualTo(String value) {
            addCriterion("ILL_PRD <=", value, "illPrd");
            return (Criteria) this;
        }

        public Criteria andIllPrdLike(String value) {
            addCriterion("ILL_PRD like", value, "illPrd");
            return (Criteria) this;
        }

        public Criteria andIllPrdNotLike(String value) {
            addCriterion("ILL_PRD not like", value, "illPrd");
            return (Criteria) this;
        }

        public Criteria andIllPrdIn(List<String> values) {
            addCriterion("ILL_PRD in", values, "illPrd");
            return (Criteria) this;
        }

        public Criteria andIllPrdNotIn(List<String> values) {
            addCriterion("ILL_PRD not in", values, "illPrd");
            return (Criteria) this;
        }

        public Criteria andIllPrdBetween(String value1, String value2) {
            addCriterion("ILL_PRD between", value1, value2, "illPrd");
            return (Criteria) this;
        }

        public Criteria andIllPrdNotBetween(String value1, String value2) {
            addCriterion("ILL_PRD not between", value1, value2, "illPrd");
            return (Criteria) this;
        }

        public Criteria andConAssIsNull() {
            addCriterion("CON_ASS is null");
            return (Criteria) this;
        }

        public Criteria andConAssIsNotNull() {
            addCriterion("CON_ASS is not null");
            return (Criteria) this;
        }

        public Criteria andConAssEqualTo(String value) {
            addCriterion("CON_ASS =", value, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssNotEqualTo(String value) {
            addCriterion("CON_ASS <>", value, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssGreaterThan(String value) {
            addCriterion("CON_ASS >", value, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssGreaterThanOrEqualTo(String value) {
            addCriterion("CON_ASS >=", value, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssLessThan(String value) {
            addCriterion("CON_ASS <", value, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssLessThanOrEqualTo(String value) {
            addCriterion("CON_ASS <=", value, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssLike(String value) {
            addCriterion("CON_ASS like", value, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssNotLike(String value) {
            addCriterion("CON_ASS not like", value, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssIn(List<String> values) {
            addCriterion("CON_ASS in", values, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssNotIn(List<String> values) {
            addCriterion("CON_ASS not in", values, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssBetween(String value1, String value2) {
            addCriterion("CON_ASS between", value1, value2, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssNotBetween(String value1, String value2) {
            addCriterion("CON_ASS not between", value1, value2, "conAss");
            return (Criteria) this;
        }

        public Criteria andConAssDtlIsNull() {
            addCriterion("CON_ASS_DTL is null");
            return (Criteria) this;
        }

        public Criteria andConAssDtlIsNotNull() {
            addCriterion("CON_ASS_DTL is not null");
            return (Criteria) this;
        }

        public Criteria andConAssDtlEqualTo(String value) {
            addCriterion("CON_ASS_DTL =", value, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andConAssDtlNotEqualTo(String value) {
            addCriterion("CON_ASS_DTL <>", value, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andConAssDtlGreaterThan(String value) {
            addCriterion("CON_ASS_DTL >", value, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andConAssDtlGreaterThanOrEqualTo(String value) {
            addCriterion("CON_ASS_DTL >=", value, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andConAssDtlLessThan(String value) {
            addCriterion("CON_ASS_DTL <", value, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andConAssDtlLessThanOrEqualTo(String value) {
            addCriterion("CON_ASS_DTL <=", value, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andConAssDtlLike(String value) {
            addCriterion("CON_ASS_DTL like", value, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andConAssDtlNotLike(String value) {
            addCriterion("CON_ASS_DTL not like", value, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andConAssDtlIn(List<String> values) {
            addCriterion("CON_ASS_DTL in", values, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andConAssDtlNotIn(List<String> values) {
            addCriterion("CON_ASS_DTL not in", values, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andConAssDtlBetween(String value1, String value2) {
            addCriterion("CON_ASS_DTL between", value1, value2, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andConAssDtlNotBetween(String value1, String value2) {
            addCriterion("CON_ASS_DTL not between", value1, value2, "conAssDtl");
            return (Criteria) this;
        }

        public Criteria andFstTimIsNull() {
            addCriterion("FST_TIM is null");
            return (Criteria) this;
        }

        public Criteria andFstTimIsNotNull() {
            addCriterion("FST_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andFstTimEqualTo(Date value) {
            addCriterionForJDBCDate("FST_TIM =", value, "fstTim");
            return (Criteria) this;
        }

        public Criteria andFstTimNotEqualTo(Date value) {
            addCriterionForJDBCDate("FST_TIM <>", value, "fstTim");
            return (Criteria) this;
        }

        public Criteria andFstTimGreaterThan(Date value) {
            addCriterionForJDBCDate("FST_TIM >", value, "fstTim");
            return (Criteria) this;
        }

        public Criteria andFstTimGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FST_TIM >=", value, "fstTim");
            return (Criteria) this;
        }

        public Criteria andFstTimLessThan(Date value) {
            addCriterionForJDBCDate("FST_TIM <", value, "fstTim");
            return (Criteria) this;
        }

        public Criteria andFstTimLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FST_TIM <=", value, "fstTim");
            return (Criteria) this;
        }

        public Criteria andFstTimIn(List<Date> values) {
            addCriterionForJDBCDate("FST_TIM in", values, "fstTim");
            return (Criteria) this;
        }

        public Criteria andFstTimNotIn(List<Date> values) {
            addCriterionForJDBCDate("FST_TIM not in", values, "fstTim");
            return (Criteria) this;
        }

        public Criteria andFstTimBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FST_TIM between", value1, value2, "fstTim");
            return (Criteria) this;
        }

        public Criteria andFstTimNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FST_TIM not between", value1, value2, "fstTim");
            return (Criteria) this;
        }

        public Criteria andLveTimIsNull() {
            addCriterion("LVE_TIM is null");
            return (Criteria) this;
        }

        public Criteria andLveTimIsNotNull() {
            addCriterion("LVE_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andLveTimEqualTo(Date value) {
            addCriterionForJDBCDate("LVE_TIM =", value, "lveTim");
            return (Criteria) this;
        }

        public Criteria andLveTimNotEqualTo(Date value) {
            addCriterionForJDBCDate("LVE_TIM <>", value, "lveTim");
            return (Criteria) this;
        }

        public Criteria andLveTimGreaterThan(Date value) {
            addCriterionForJDBCDate("LVE_TIM >", value, "lveTim");
            return (Criteria) this;
        }

        public Criteria andLveTimGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LVE_TIM >=", value, "lveTim");
            return (Criteria) this;
        }

        public Criteria andLveTimLessThan(Date value) {
            addCriterionForJDBCDate("LVE_TIM <", value, "lveTim");
            return (Criteria) this;
        }

        public Criteria andLveTimLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LVE_TIM <=", value, "lveTim");
            return (Criteria) this;
        }

        public Criteria andLveTimIn(List<Date> values) {
            addCriterionForJDBCDate("LVE_TIM in", values, "lveTim");
            return (Criteria) this;
        }

        public Criteria andLveTimNotIn(List<Date> values) {
            addCriterionForJDBCDate("LVE_TIM not in", values, "lveTim");
            return (Criteria) this;
        }

        public Criteria andLveTimBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LVE_TIM between", value1, value2, "lveTim");
            return (Criteria) this;
        }

        public Criteria andLveTimNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LVE_TIM not between", value1, value2, "lveTim");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIsNull() {
            addCriterion("CRT_USR is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIsNotNull() {
            addCriterion("CRT_USR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrEqualTo(String value) {
            addCriterion("CRT_USR =", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotEqualTo(String value) {
            addCriterion("CRT_USR <>", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrGreaterThan(String value) {
            addCriterion("CRT_USR >", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR >=", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLessThan(String value) {
            addCriterion("CRT_USR <", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR <=", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLike(String value) {
            addCriterion("CRT_USR like", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotLike(String value) {
            addCriterion("CRT_USR not like", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIn(List<String> values) {
            addCriterion("CRT_USR in", values, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotIn(List<String> values) {
            addCriterion("CRT_USR not in", values, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrBetween(String value1, String value2) {
            addCriterion("CRT_USR between", value1, value2, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotBetween(String value1, String value2) {
            addCriterion("CRT_USR not between", value1, value2, "crtUsr");
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
            addCriterionForJDBCDate("CRT_TIM =", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIM <>", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimGreaterThan(Date value) {
            addCriterionForJDBCDate("CRT_TIM >", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIM >=", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimLessThan(Date value) {
            addCriterionForJDBCDate("CRT_TIM <", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_TIM <=", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_TIM in", values, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_TIM not in", values, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_TIM between", value1, value2, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_TIM not between", value1, value2, "crtTim");
            return (Criteria) this;
        }

        public Criteria andModUsrIsNull() {
            addCriterion("MOD_USR is null");
            return (Criteria) this;
        }

        public Criteria andModUsrIsNotNull() {
            addCriterion("MOD_USR is not null");
            return (Criteria) this;
        }

        public Criteria andModUsrEqualTo(String value) {
            addCriterion("MOD_USR =", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotEqualTo(String value) {
            addCriterion("MOD_USR <>", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrGreaterThan(String value) {
            addCriterion("MOD_USR >", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USR >=", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrLessThan(String value) {
            addCriterion("MOD_USR <", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrLessThanOrEqualTo(String value) {
            addCriterion("MOD_USR <=", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrLike(String value) {
            addCriterion("MOD_USR like", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotLike(String value) {
            addCriterion("MOD_USR not like", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrIn(List<String> values) {
            addCriterion("MOD_USR in", values, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotIn(List<String> values) {
            addCriterion("MOD_USR not in", values, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrBetween(String value1, String value2) {
            addCriterion("MOD_USR between", value1, value2, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotBetween(String value1, String value2) {
            addCriterion("MOD_USR not between", value1, value2, "modUsr");
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
            addCriterionForJDBCDate("MOD_TIM =", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotEqualTo(Date value) {
            addCriterionForJDBCDate("MOD_TIM <>", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimGreaterThan(Date value) {
            addCriterionForJDBCDate("MOD_TIM >", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MOD_TIM >=", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimLessThan(Date value) {
            addCriterionForJDBCDate("MOD_TIM <", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MOD_TIM <=", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimIn(List<Date> values) {
            addCriterionForJDBCDate("MOD_TIM in", values, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotIn(List<Date> values) {
            addCriterionForJDBCDate("MOD_TIM not in", values, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MOD_TIM between", value1, value2, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MOD_TIM not between", value1, value2, "modTim");
            return (Criteria) this;
        }

        public Criteria andWayTypSubIsNull() {
            addCriterion("WAY_TYP_SUB is null");
            return (Criteria) this;
        }

        public Criteria andWayTypSubIsNotNull() {
            addCriterion("WAY_TYP_SUB is not null");
            return (Criteria) this;
        }

        public Criteria andWayTypSubEqualTo(String value) {
            addCriterion("WAY_TYP_SUB =", value, "wayTypSub");
            return (Criteria) this;
        }

        public Criteria andWayTypSubNotEqualTo(String value) {
            addCriterion("WAY_TYP_SUB <>", value, "wayTypSub");
            return (Criteria) this;
        }

        public Criteria andWayTypSubGreaterThan(String value) {
            addCriterion("WAY_TYP_SUB >", value, "wayTypSub");
            return (Criteria) this;
        }

        public Criteria andWayTypSubGreaterThanOrEqualTo(String value) {
            addCriterion("WAY_TYP_SUB >=", value, "wayTypSub");
            return (Criteria) this;
        }

        public Criteria andWayTypSubLessThan(String value) {
            addCriterion("WAY_TYP_SUB <", value, "wayTypSub");
            return (Criteria) this;
        }

        public Criteria andWayTypSubLessThanOrEqualTo(String value) {
            addCriterion("WAY_TYP_SUB <=", value, "wayTypSub");
            return (Criteria) this;
        }

        public Criteria andWayTypSubLike(String value) {
            addCriterion("WAY_TYP_SUB like", value, "wayTypSub");
            return (Criteria) this;
        }

        public Criteria andWayTypSubNotLike(String value) {
            addCriterion("WAY_TYP_SUB not like", value, "wayTypSub");
            return (Criteria) this;
        }

        public Criteria andWayTypSubIn(List<String> values) {
            addCriterion("WAY_TYP_SUB in", values, "wayTypSub");
            return (Criteria) this;
        }

        public Criteria andWayTypSubNotIn(List<String> values) {
            addCriterion("WAY_TYP_SUB not in", values, "wayTypSub");
            return (Criteria) this;
        }

        public Criteria andWayTypSubBetween(String value1, String value2) {
            addCriterion("WAY_TYP_SUB between", value1, value2, "wayTypSub");
            return (Criteria) this;
        }

        public Criteria andWayTypSubNotBetween(String value1, String value2) {
            addCriterion("WAY_TYP_SUB not between", value1, value2, "wayTypSub");
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