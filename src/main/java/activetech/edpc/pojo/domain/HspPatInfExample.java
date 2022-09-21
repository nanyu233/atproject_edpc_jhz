package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HspPatInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspPatInfExample() {
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

        public Criteria andPatIdIsNull() {
            addCriterion("PAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatIdIsNotNull() {
            addCriterion("PAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatIdEqualTo(String value) {
            addCriterion("PAT_ID =", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotEqualTo(String value) {
            addCriterion("PAT_ID <>", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdGreaterThan(String value) {
            addCriterion("PAT_ID >", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_ID >=", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLessThan(String value) {
            addCriterion("PAT_ID <", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLessThanOrEqualTo(String value) {
            addCriterion("PAT_ID <=", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLike(String value) {
            addCriterion("PAT_ID like", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotLike(String value) {
            addCriterion("PAT_ID not like", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdIn(List<String> values) {
            addCriterion("PAT_ID in", values, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotIn(List<String> values) {
            addCriterion("PAT_ID not in", values, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdBetween(String value1, String value2) {
            addCriterion("PAT_ID between", value1, value2, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotBetween(String value1, String value2) {
            addCriterion("PAT_ID not between", value1, value2, "patId");
            return (Criteria) this;
        }

        public Criteria andPatNamIsNull() {
            addCriterion("PAT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andPatNamIsNotNull() {
            addCriterion("PAT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andPatNamEqualTo(String value) {
            addCriterion("PAT_NAM =", value, "patNam");
            return (Criteria) this;
        }

        public Criteria andPatNamNotEqualTo(String value) {
            addCriterion("PAT_NAM <>", value, "patNam");
            return (Criteria) this;
        }

        public Criteria andPatNamGreaterThan(String value) {
            addCriterion("PAT_NAM >", value, "patNam");
            return (Criteria) this;
        }

        public Criteria andPatNamGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_NAM >=", value, "patNam");
            return (Criteria) this;
        }

        public Criteria andPatNamLessThan(String value) {
            addCriterion("PAT_NAM <", value, "patNam");
            return (Criteria) this;
        }

        public Criteria andPatNamLessThanOrEqualTo(String value) {
            addCriterion("PAT_NAM <=", value, "patNam");
            return (Criteria) this;
        }

        public Criteria andPatNamLike(String value) {
            addCriterion("PAT_NAM like", value, "patNam");
            return (Criteria) this;
        }

        public Criteria andPatNamNotLike(String value) {
            addCriterion("PAT_NAM not like", value, "patNam");
            return (Criteria) this;
        }

        public Criteria andPatNamIn(List<String> values) {
            addCriterion("PAT_NAM in", values, "patNam");
            return (Criteria) this;
        }

        public Criteria andPatNamNotIn(List<String> values) {
            addCriterion("PAT_NAM not in", values, "patNam");
            return (Criteria) this;
        }

        public Criteria andPatNamBetween(String value1, String value2) {
            addCriterion("PAT_NAM between", value1, value2, "patNam");
            return (Criteria) this;
        }

        public Criteria andPatNamNotBetween(String value1, String value2) {
            addCriterion("PAT_NAM not between", value1, value2, "patNam");
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

        public Criteria andLnkNbrIsNull() {
            addCriterion("LNK_NBR is null");
            return (Criteria) this;
        }

        public Criteria andLnkNbrIsNotNull() {
            addCriterion("LNK_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andLnkNbrEqualTo(String value) {
            addCriterion("LNK_NBR =", value, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andLnkNbrNotEqualTo(String value) {
            addCriterion("LNK_NBR <>", value, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andLnkNbrGreaterThan(String value) {
            addCriterion("LNK_NBR >", value, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andLnkNbrGreaterThanOrEqualTo(String value) {
            addCriterion("LNK_NBR >=", value, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andLnkNbrLessThan(String value) {
            addCriterion("LNK_NBR <", value, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andLnkNbrLessThanOrEqualTo(String value) {
            addCriterion("LNK_NBR <=", value, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andLnkNbrLike(String value) {
            addCriterion("LNK_NBR like", value, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andLnkNbrNotLike(String value) {
            addCriterion("LNK_NBR not like", value, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andLnkNbrIn(List<String> values) {
            addCriterion("LNK_NBR in", values, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andLnkNbrNotIn(List<String> values) {
            addCriterion("LNK_NBR not in", values, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andLnkNbrBetween(String value1, String value2) {
            addCriterion("LNK_NBR between", value1, value2, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andLnkNbrNotBetween(String value1, String value2) {
            addCriterion("LNK_NBR not between", value1, value2, "lnkNbr");
            return (Criteria) this;
        }

        public Criteria andPatNatCodIsNull() {
            addCriterion("PAT_NAT_COD is null");
            return (Criteria) this;
        }

        public Criteria andPatNatCodIsNotNull() {
            addCriterion("PAT_NAT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPatNatCodEqualTo(String value) {
            addCriterion("PAT_NAT_COD =", value, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andPatNatCodNotEqualTo(String value) {
            addCriterion("PAT_NAT_COD <>", value, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andPatNatCodGreaterThan(String value) {
            addCriterion("PAT_NAT_COD >", value, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andPatNatCodGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_NAT_COD >=", value, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andPatNatCodLessThan(String value) {
            addCriterion("PAT_NAT_COD <", value, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andPatNatCodLessThanOrEqualTo(String value) {
            addCriterion("PAT_NAT_COD <=", value, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andPatNatCodLike(String value) {
            addCriterion("PAT_NAT_COD like", value, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andPatNatCodNotLike(String value) {
            addCriterion("PAT_NAT_COD not like", value, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andPatNatCodIn(List<String> values) {
            addCriterion("PAT_NAT_COD in", values, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andPatNatCodNotIn(List<String> values) {
            addCriterion("PAT_NAT_COD not in", values, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andPatNatCodBetween(String value1, String value2) {
            addCriterion("PAT_NAT_COD between", value1, value2, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andPatNatCodNotBetween(String value1, String value2) {
            addCriterion("PAT_NAT_COD not between", value1, value2, "patNatCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodIsNull() {
            addCriterion("MAR_STA_COD is null");
            return (Criteria) this;
        }

        public Criteria andMarStaCodIsNotNull() {
            addCriterion("MAR_STA_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMarStaCodEqualTo(String value) {
            addCriterion("MAR_STA_COD =", value, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodNotEqualTo(String value) {
            addCriterion("MAR_STA_COD <>", value, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodGreaterThan(String value) {
            addCriterion("MAR_STA_COD >", value, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodGreaterThanOrEqualTo(String value) {
            addCriterion("MAR_STA_COD >=", value, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodLessThan(String value) {
            addCriterion("MAR_STA_COD <", value, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodLessThanOrEqualTo(String value) {
            addCriterion("MAR_STA_COD <=", value, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodLike(String value) {
            addCriterion("MAR_STA_COD like", value, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodNotLike(String value) {
            addCriterion("MAR_STA_COD not like", value, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodIn(List<String> values) {
            addCriterion("MAR_STA_COD in", values, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodNotIn(List<String> values) {
            addCriterion("MAR_STA_COD not in", values, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodBetween(String value1, String value2) {
            addCriterion("MAR_STA_COD between", value1, value2, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andMarStaCodNotBetween(String value1, String value2) {
            addCriterion("MAR_STA_COD not between", value1, value2, "marStaCod");
            return (Criteria) this;
        }

        public Criteria andPatJobIsNull() {
            addCriterion("PAT_JOB is null");
            return (Criteria) this;
        }

        public Criteria andPatJobIsNotNull() {
            addCriterion("PAT_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andPatJobEqualTo(String value) {
            addCriterion("PAT_JOB =", value, "patJob");
            return (Criteria) this;
        }

        public Criteria andPatJobNotEqualTo(String value) {
            addCriterion("PAT_JOB <>", value, "patJob");
            return (Criteria) this;
        }

        public Criteria andPatJobGreaterThan(String value) {
            addCriterion("PAT_JOB >", value, "patJob");
            return (Criteria) this;
        }

        public Criteria andPatJobGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_JOB >=", value, "patJob");
            return (Criteria) this;
        }

        public Criteria andPatJobLessThan(String value) {
            addCriterion("PAT_JOB <", value, "patJob");
            return (Criteria) this;
        }

        public Criteria andPatJobLessThanOrEqualTo(String value) {
            addCriterion("PAT_JOB <=", value, "patJob");
            return (Criteria) this;
        }

        public Criteria andPatJobLike(String value) {
            addCriterion("PAT_JOB like", value, "patJob");
            return (Criteria) this;
        }

        public Criteria andPatJobNotLike(String value) {
            addCriterion("PAT_JOB not like", value, "patJob");
            return (Criteria) this;
        }

        public Criteria andPatJobIn(List<String> values) {
            addCriterion("PAT_JOB in", values, "patJob");
            return (Criteria) this;
        }

        public Criteria andPatJobNotIn(List<String> values) {
            addCriterion("PAT_JOB not in", values, "patJob");
            return (Criteria) this;
        }

        public Criteria andPatJobBetween(String value1, String value2) {
            addCriterion("PAT_JOB between", value1, value2, "patJob");
            return (Criteria) this;
        }

        public Criteria andPatJobNotBetween(String value1, String value2) {
            addCriterion("PAT_JOB not between", value1, value2, "patJob");
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

        public Criteria andPatAdrIsNull() {
            addCriterion("PAT_ADR is null");
            return (Criteria) this;
        }

        public Criteria andPatAdrIsNotNull() {
            addCriterion("PAT_ADR is not null");
            return (Criteria) this;
        }

        public Criteria andPatAdrEqualTo(String value) {
            addCriterion("PAT_ADR =", value, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatAdrNotEqualTo(String value) {
            addCriterion("PAT_ADR <>", value, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatAdrGreaterThan(String value) {
            addCriterion("PAT_ADR >", value, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatAdrGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_ADR >=", value, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatAdrLessThan(String value) {
            addCriterion("PAT_ADR <", value, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatAdrLessThanOrEqualTo(String value) {
            addCriterion("PAT_ADR <=", value, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatAdrLike(String value) {
            addCriterion("PAT_ADR like", value, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatAdrNotLike(String value) {
            addCriterion("PAT_ADR not like", value, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatAdrIn(List<String> values) {
            addCriterion("PAT_ADR in", values, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatAdrNotIn(List<String> values) {
            addCriterion("PAT_ADR not in", values, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatAdrBetween(String value1, String value2) {
            addCriterion("PAT_ADR between", value1, value2, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatAdrNotBetween(String value1, String value2) {
            addCriterion("PAT_ADR not between", value1, value2, "patAdr");
            return (Criteria) this;
        }

        public Criteria andPatTelIsNull() {
            addCriterion("PAT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andPatTelIsNotNull() {
            addCriterion("PAT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andPatTelEqualTo(String value) {
            addCriterion("PAT_TEL =", value, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatTelNotEqualTo(String value) {
            addCriterion("PAT_TEL <>", value, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatTelGreaterThan(String value) {
            addCriterion("PAT_TEL >", value, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatTelGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_TEL >=", value, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatTelLessThan(String value) {
            addCriterion("PAT_TEL <", value, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatTelLessThanOrEqualTo(String value) {
            addCriterion("PAT_TEL <=", value, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatTelLike(String value) {
            addCriterion("PAT_TEL like", value, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatTelNotLike(String value) {
            addCriterion("PAT_TEL not like", value, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatTelIn(List<String> values) {
            addCriterion("PAT_TEL in", values, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatTelNotIn(List<String> values) {
            addCriterion("PAT_TEL not in", values, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatTelBetween(String value1, String value2) {
            addCriterion("PAT_TEL between", value1, value2, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatTelNotBetween(String value1, String value2) {
            addCriterion("PAT_TEL not between", value1, value2, "patTel");
            return (Criteria) this;
        }

        public Criteria andPatLngIsNull() {
            addCriterion("PAT_LNG is null");
            return (Criteria) this;
        }

        public Criteria andPatLngIsNotNull() {
            addCriterion("PAT_LNG is not null");
            return (Criteria) this;
        }

        public Criteria andPatLngEqualTo(String value) {
            addCriterion("PAT_LNG =", value, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatLngNotEqualTo(String value) {
            addCriterion("PAT_LNG <>", value, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatLngGreaterThan(String value) {
            addCriterion("PAT_LNG >", value, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatLngGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_LNG >=", value, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatLngLessThan(String value) {
            addCriterion("PAT_LNG <", value, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatLngLessThanOrEqualTo(String value) {
            addCriterion("PAT_LNG <=", value, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatLngLike(String value) {
            addCriterion("PAT_LNG like", value, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatLngNotLike(String value) {
            addCriterion("PAT_LNG not like", value, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatLngIn(List<String> values) {
            addCriterion("PAT_LNG in", values, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatLngNotIn(List<String> values) {
            addCriterion("PAT_LNG not in", values, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatLngBetween(String value1, String value2) {
            addCriterion("PAT_LNG between", value1, value2, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatLngNotBetween(String value1, String value2) {
            addCriterion("PAT_LNG not between", value1, value2, "patLng");
            return (Criteria) this;
        }

        public Criteria andPatNatIsNull() {
            addCriterion("PAT_NAT is null");
            return (Criteria) this;
        }

        public Criteria andPatNatIsNotNull() {
            addCriterion("PAT_NAT is not null");
            return (Criteria) this;
        }

        public Criteria andPatNatEqualTo(String value) {
            addCriterion("PAT_NAT =", value, "patNat");
            return (Criteria) this;
        }

        public Criteria andPatNatNotEqualTo(String value) {
            addCriterion("PAT_NAT <>", value, "patNat");
            return (Criteria) this;
        }

        public Criteria andPatNatGreaterThan(String value) {
            addCriterion("PAT_NAT >", value, "patNat");
            return (Criteria) this;
        }

        public Criteria andPatNatGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_NAT >=", value, "patNat");
            return (Criteria) this;
        }

        public Criteria andPatNatLessThan(String value) {
            addCriterion("PAT_NAT <", value, "patNat");
            return (Criteria) this;
        }

        public Criteria andPatNatLessThanOrEqualTo(String value) {
            addCriterion("PAT_NAT <=", value, "patNat");
            return (Criteria) this;
        }

        public Criteria andPatNatLike(String value) {
            addCriterion("PAT_NAT like", value, "patNat");
            return (Criteria) this;
        }

        public Criteria andPatNatNotLike(String value) {
            addCriterion("PAT_NAT not like", value, "patNat");
            return (Criteria) this;
        }

        public Criteria andPatNatIn(List<String> values) {
            addCriterion("PAT_NAT in", values, "patNat");
            return (Criteria) this;
        }

        public Criteria andPatNatNotIn(List<String> values) {
            addCriterion("PAT_NAT not in", values, "patNat");
            return (Criteria) this;
        }

        public Criteria andPatNatBetween(String value1, String value2) {
            addCriterion("PAT_NAT between", value1, value2, "patNat");
            return (Criteria) this;
        }

        public Criteria andPatNatNotBetween(String value1, String value2) {
            addCriterion("PAT_NAT not between", value1, value2, "patNat");
            return (Criteria) this;
        }

        public Criteria andBthAdrIsNull() {
            addCriterion("BTH_ADR is null");
            return (Criteria) this;
        }

        public Criteria andBthAdrIsNotNull() {
            addCriterion("BTH_ADR is not null");
            return (Criteria) this;
        }

        public Criteria andBthAdrEqualTo(String value) {
            addCriterion("BTH_ADR =", value, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andBthAdrNotEqualTo(String value) {
            addCriterion("BTH_ADR <>", value, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andBthAdrGreaterThan(String value) {
            addCriterion("BTH_ADR >", value, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andBthAdrGreaterThanOrEqualTo(String value) {
            addCriterion("BTH_ADR >=", value, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andBthAdrLessThan(String value) {
            addCriterion("BTH_ADR <", value, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andBthAdrLessThanOrEqualTo(String value) {
            addCriterion("BTH_ADR <=", value, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andBthAdrLike(String value) {
            addCriterion("BTH_ADR like", value, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andBthAdrNotLike(String value) {
            addCriterion("BTH_ADR not like", value, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andBthAdrIn(List<String> values) {
            addCriterion("BTH_ADR in", values, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andBthAdrNotIn(List<String> values) {
            addCriterion("BTH_ADR not in", values, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andBthAdrBetween(String value1, String value2) {
            addCriterion("BTH_ADR between", value1, value2, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andBthAdrNotBetween(String value1, String value2) {
            addCriterion("BTH_ADR not between", value1, value2, "bthAdr");
            return (Criteria) this;
        }

        public Criteria andPatRelIsNull() {
            addCriterion("PAT_REL is null");
            return (Criteria) this;
        }

        public Criteria andPatRelIsNotNull() {
            addCriterion("PAT_REL is not null");
            return (Criteria) this;
        }

        public Criteria andPatRelEqualTo(String value) {
            addCriterion("PAT_REL =", value, "patRel");
            return (Criteria) this;
        }

        public Criteria andPatRelNotEqualTo(String value) {
            addCriterion("PAT_REL <>", value, "patRel");
            return (Criteria) this;
        }

        public Criteria andPatRelGreaterThan(String value) {
            addCriterion("PAT_REL >", value, "patRel");
            return (Criteria) this;
        }

        public Criteria andPatRelGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_REL >=", value, "patRel");
            return (Criteria) this;
        }

        public Criteria andPatRelLessThan(String value) {
            addCriterion("PAT_REL <", value, "patRel");
            return (Criteria) this;
        }

        public Criteria andPatRelLessThanOrEqualTo(String value) {
            addCriterion("PAT_REL <=", value, "patRel");
            return (Criteria) this;
        }

        public Criteria andPatRelLike(String value) {
            addCriterion("PAT_REL like", value, "patRel");
            return (Criteria) this;
        }

        public Criteria andPatRelNotLike(String value) {
            addCriterion("PAT_REL not like", value, "patRel");
            return (Criteria) this;
        }

        public Criteria andPatRelIn(List<String> values) {
            addCriterion("PAT_REL in", values, "patRel");
            return (Criteria) this;
        }

        public Criteria andPatRelNotIn(List<String> values) {
            addCriterion("PAT_REL not in", values, "patRel");
            return (Criteria) this;
        }

        public Criteria andPatRelBetween(String value1, String value2) {
            addCriterion("PAT_REL between", value1, value2, "patRel");
            return (Criteria) this;
        }

        public Criteria andPatRelNotBetween(String value1, String value2) {
            addCriterion("PAT_REL not between", value1, value2, "patRel");
            return (Criteria) this;
        }

        public Criteria andFuvSeqIsNull() {
            addCriterion("FUV_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFuvSeqIsNotNull() {
            addCriterion("FUV_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFuvSeqEqualTo(String value) {
            addCriterion("FUV_SEQ =", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotEqualTo(String value) {
            addCriterion("FUV_SEQ <>", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqGreaterThan(String value) {
            addCriterion("FUV_SEQ >", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_SEQ >=", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqLessThan(String value) {
            addCriterion("FUV_SEQ <", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqLessThanOrEqualTo(String value) {
            addCriterion("FUV_SEQ <=", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqLike(String value) {
            addCriterion("FUV_SEQ like", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotLike(String value) {
            addCriterion("FUV_SEQ not like", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqIn(List<String> values) {
            addCriterion("FUV_SEQ in", values, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotIn(List<String> values) {
            addCriterion("FUV_SEQ not in", values, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqBetween(String value1, String value2) {
            addCriterion("FUV_SEQ between", value1, value2, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotBetween(String value1, String value2) {
            addCriterion("FUV_SEQ not between", value1, value2, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqIsNull() {
            addCriterion("PLN_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPlnSeqIsNotNull() {
            addCriterion("PLN_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPlnSeqEqualTo(String value) {
            addCriterion("PLN_SEQ =", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqNotEqualTo(String value) {
            addCriterion("PLN_SEQ <>", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqGreaterThan(String value) {
            addCriterion("PLN_SEQ >", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqGreaterThanOrEqualTo(String value) {
            addCriterion("PLN_SEQ >=", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqLessThan(String value) {
            addCriterion("PLN_SEQ <", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqLessThanOrEqualTo(String value) {
            addCriterion("PLN_SEQ <=", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqLike(String value) {
            addCriterion("PLN_SEQ like", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqNotLike(String value) {
            addCriterion("PLN_SEQ not like", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqIn(List<String> values) {
            addCriterion("PLN_SEQ in", values, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqNotIn(List<String> values) {
            addCriterion("PLN_SEQ not in", values, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqBetween(String value1, String value2) {
            addCriterion("PLN_SEQ between", value1, value2, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqNotBetween(String value1, String value2) {
            addCriterion("PLN_SEQ not between", value1, value2, "plnSeq");
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

        public Criteria andCzFlagIsNull() {
            addCriterion("CZ_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCzFlagIsNotNull() {
            addCriterion("CZ_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCzFlagEqualTo(String value) {
            addCriterion("CZ_FLAG =", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagNotEqualTo(String value) {
            addCriterion("CZ_FLAG <>", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagGreaterThan(String value) {
            addCriterion("CZ_FLAG >", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CZ_FLAG >=", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagLessThan(String value) {
            addCriterion("CZ_FLAG <", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagLessThanOrEqualTo(String value) {
            addCriterion("CZ_FLAG <=", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagLike(String value) {
            addCriterion("CZ_FLAG like", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagNotLike(String value) {
            addCriterion("CZ_FLAG not like", value, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagIn(List<String> values) {
            addCriterion("CZ_FLAG in", values, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagNotIn(List<String> values) {
            addCriterion("CZ_FLAG not in", values, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagBetween(String value1, String value2) {
            addCriterion("CZ_FLAG between", value1, value2, "czFlag");
            return (Criteria) this;
        }

        public Criteria andCzFlagNotBetween(String value1, String value2) {
            addCriterion("CZ_FLAG not between", value1, value2, "czFlag");
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