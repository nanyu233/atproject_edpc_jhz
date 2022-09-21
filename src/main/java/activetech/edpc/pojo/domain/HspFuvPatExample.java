package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HspFuvPatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspFuvPatExample() {
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

        public Criteria andLstFuvTimIsNull() {
            addCriterion("LST_FUV_TIM is null");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimIsNotNull() {
            addCriterion("LST_FUV_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimEqualTo(Date value) {
            addCriterion("LST_FUV_TIM =", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimNotEqualTo(Date value) {
            addCriterion("LST_FUV_TIM <>", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimGreaterThan(Date value) {
            addCriterion("LST_FUV_TIM >", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimGreaterThanOrEqualTo(Date value) {
            addCriterion("LST_FUV_TIM >=", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimLessThan(Date value) {
            addCriterion("LST_FUV_TIM <", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimLessThanOrEqualTo(Date value) {
            addCriterion("LST_FUV_TIM <=", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimIn(List<Date> values) {
            addCriterion("LST_FUV_TIM in", values, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimNotIn(List<Date> values) {
            addCriterion("LST_FUV_TIM not in", values, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimBetween(Date value1, Date value2) {
            addCriterion("LST_FUV_TIM between", value1, value2, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimNotBetween(Date value1, Date value2) {
            addCriterion("LST_FUV_TIM not between", value1, value2, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimIsNull() {
            addCriterion("PLN_FUV_TIM is null");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimIsNotNull() {
            addCriterion("PLN_FUV_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimEqualTo(Date value) {
            addCriterion("PLN_FUV_TIM =", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimNotEqualTo(Date value) {
            addCriterion("PLN_FUV_TIM <>", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimGreaterThan(Date value) {
            addCriterion("PLN_FUV_TIM >", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimGreaterThanOrEqualTo(Date value) {
            addCriterion("PLN_FUV_TIM >=", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimLessThan(Date value) {
            addCriterion("PLN_FUV_TIM <", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimLessThanOrEqualTo(Date value) {
            addCriterion("PLN_FUV_TIM <=", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimIn(List<Date> values) {
            addCriterion("PLN_FUV_TIM in", values, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimNotIn(List<Date> values) {
            addCriterion("PLN_FUV_TIM not in", values, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimBetween(Date value1, Date value2) {
            addCriterion("PLN_FUV_TIM between", value1, value2, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimNotBetween(Date value1, Date value2) {
            addCriterion("PLN_FUV_TIM not between", value1, value2, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andFuvStaIsNull() {
            addCriterion("FUV_STA is null");
            return (Criteria) this;
        }

        public Criteria andFuvStaIsNotNull() {
            addCriterion("FUV_STA is not null");
            return (Criteria) this;
        }

        public Criteria andFuvStaEqualTo(String value) {
            addCriterion("FUV_STA =", value, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andFuvStaNotEqualTo(String value) {
            addCriterion("FUV_STA <>", value, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andFuvStaGreaterThan(String value) {
            addCriterion("FUV_STA >", value, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andFuvStaGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_STA >=", value, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andFuvStaLessThan(String value) {
            addCriterion("FUV_STA <", value, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andFuvStaLessThanOrEqualTo(String value) {
            addCriterion("FUV_STA <=", value, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andFuvStaLike(String value) {
            addCriterion("FUV_STA like", value, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andFuvStaNotLike(String value) {
            addCriterion("FUV_STA not like", value, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andFuvStaIn(List<String> values) {
            addCriterion("FUV_STA in", values, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andFuvStaNotIn(List<String> values) {
            addCriterion("FUV_STA not in", values, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andFuvStaBetween(String value1, String value2) {
            addCriterion("FUV_STA between", value1, value2, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andFuvStaNotBetween(String value1, String value2) {
            addCriterion("FUV_STA not between", value1, value2, "fuvSta");
            return (Criteria) this;
        }

        public Criteria andLftNumIsNull() {
            addCriterion("LFT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLftNumIsNotNull() {
            addCriterion("LFT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLftNumEqualTo(Short value) {
            addCriterion("LFT_NUM =", value, "lftNum");
            return (Criteria) this;
        }

        public Criteria andLftNumNotEqualTo(Short value) {
            addCriterion("LFT_NUM <>", value, "lftNum");
            return (Criteria) this;
        }

        public Criteria andLftNumGreaterThan(Short value) {
            addCriterion("LFT_NUM >", value, "lftNum");
            return (Criteria) this;
        }

        public Criteria andLftNumGreaterThanOrEqualTo(Short value) {
            addCriterion("LFT_NUM >=", value, "lftNum");
            return (Criteria) this;
        }

        public Criteria andLftNumLessThan(Short value) {
            addCriterion("LFT_NUM <", value, "lftNum");
            return (Criteria) this;
        }

        public Criteria andLftNumLessThanOrEqualTo(Short value) {
            addCriterion("LFT_NUM <=", value, "lftNum");
            return (Criteria) this;
        }

        public Criteria andLftNumIn(List<Short> values) {
            addCriterion("LFT_NUM in", values, "lftNum");
            return (Criteria) this;
        }

        public Criteria andLftNumNotIn(List<Short> values) {
            addCriterion("LFT_NUM not in", values, "lftNum");
            return (Criteria) this;
        }

        public Criteria andLftNumBetween(Short value1, Short value2) {
            addCriterion("LFT_NUM between", value1, value2, "lftNum");
            return (Criteria) this;
        }

        public Criteria andLftNumNotBetween(Short value1, Short value2) {
            addCriterion("LFT_NUM not between", value1, value2, "lftNum");
            return (Criteria) this;
        }

        public Criteria andXtfFlgIsNull() {
            addCriterion("XTF_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXtfFlgIsNotNull() {
            addCriterion("XTF_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXtfFlgEqualTo(String value) {
            addCriterion("XTF_FLG =", value, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andXtfFlgNotEqualTo(String value) {
            addCriterion("XTF_FLG <>", value, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andXtfFlgGreaterThan(String value) {
            addCriterion("XTF_FLG >", value, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andXtfFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XTF_FLG >=", value, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andXtfFlgLessThan(String value) {
            addCriterion("XTF_FLG <", value, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andXtfFlgLessThanOrEqualTo(String value) {
            addCriterion("XTF_FLG <=", value, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andXtfFlgLike(String value) {
            addCriterion("XTF_FLG like", value, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andXtfFlgNotLike(String value) {
            addCriterion("XTF_FLG not like", value, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andXtfFlgIn(List<String> values) {
            addCriterion("XTF_FLG in", values, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andXtfFlgNotIn(List<String> values) {
            addCriterion("XTF_FLG not in", values, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andXtfFlgBetween(String value1, String value2) {
            addCriterion("XTF_FLG between", value1, value2, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andXtfFlgNotBetween(String value1, String value2) {
            addCriterion("XTF_FLG not between", value1, value2, "xtfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgIsNull() {
            addCriterion("CZF_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCzfFlgIsNotNull() {
            addCriterion("CZF_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCzfFlgEqualTo(String value) {
            addCriterion("CZF_FLG =", value, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgNotEqualTo(String value) {
            addCriterion("CZF_FLG <>", value, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgGreaterThan(String value) {
            addCriterion("CZF_FLG >", value, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgGreaterThanOrEqualTo(String value) {
            addCriterion("CZF_FLG >=", value, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgLessThan(String value) {
            addCriterion("CZF_FLG <", value, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgLessThanOrEqualTo(String value) {
            addCriterion("CZF_FLG <=", value, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgLike(String value) {
            addCriterion("CZF_FLG like", value, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgNotLike(String value) {
            addCriterion("CZF_FLG not like", value, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgIn(List<String> values) {
            addCriterion("CZF_FLG in", values, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgNotIn(List<String> values) {
            addCriterion("CZF_FLG not in", values, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgBetween(String value1, String value2) {
            addCriterion("CZF_FLG between", value1, value2, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCzfFlgNotBetween(String value1, String value2) {
            addCriterion("CZF_FLG not between", value1, value2, "czfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgIsNull() {
            addCriterion("CSF_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCsfFlgIsNotNull() {
            addCriterion("CSF_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCsfFlgEqualTo(String value) {
            addCriterion("CSF_FLG =", value, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgNotEqualTo(String value) {
            addCriterion("CSF_FLG <>", value, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgGreaterThan(String value) {
            addCriterion("CSF_FLG >", value, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgGreaterThanOrEqualTo(String value) {
            addCriterion("CSF_FLG >=", value, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgLessThan(String value) {
            addCriterion("CSF_FLG <", value, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgLessThanOrEqualTo(String value) {
            addCriterion("CSF_FLG <=", value, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgLike(String value) {
            addCriterion("CSF_FLG like", value, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgNotLike(String value) {
            addCriterion("CSF_FLG not like", value, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgIn(List<String> values) {
            addCriterion("CSF_FLG in", values, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgNotIn(List<String> values) {
            addCriterion("CSF_FLG not in", values, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgBetween(String value1, String value2) {
            addCriterion("CSF_FLG between", value1, value2, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andCsfFlgNotBetween(String value1, String value2) {
            addCriterion("CSF_FLG not between", value1, value2, "csfFlg");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqIsNull() {
            addCriterion("LST_FUV_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqIsNotNull() {
            addCriterion("LST_FUV_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqEqualTo(String value) {
            addCriterion("LST_FUV_SEQ =", value, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqNotEqualTo(String value) {
            addCriterion("LST_FUV_SEQ <>", value, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqGreaterThan(String value) {
            addCriterion("LST_FUV_SEQ >", value, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqGreaterThanOrEqualTo(String value) {
            addCriterion("LST_FUV_SEQ >=", value, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqLessThan(String value) {
            addCriterion("LST_FUV_SEQ <", value, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqLessThanOrEqualTo(String value) {
            addCriterion("LST_FUV_SEQ <=", value, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqLike(String value) {
            addCriterion("LST_FUV_SEQ like", value, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqNotLike(String value) {
            addCriterion("LST_FUV_SEQ not like", value, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqIn(List<String> values) {
            addCriterion("LST_FUV_SEQ in", values, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqNotIn(List<String> values) {
            addCriterion("LST_FUV_SEQ not in", values, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqBetween(String value1, String value2) {
            addCriterion("LST_FUV_SEQ between", value1, value2, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andLstFuvSeqNotBetween(String value1, String value2) {
            addCriterion("LST_FUV_SEQ not between", value1, value2, "lstFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqIsNull() {
            addCriterion("PLN_FUV_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqIsNotNull() {
            addCriterion("PLN_FUV_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqEqualTo(String value) {
            addCriterion("PLN_FUV_SEQ =", value, "plnFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqNotEqualTo(String value) {
            addCriterion("PLN_FUV_SEQ <>", value, "plnFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqGreaterThan(String value) {
            addCriterion("PLN_FUV_SEQ >", value, "plnFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqGreaterThanOrEqualTo(String value) {
            addCriterion("PLN_FUV_SEQ >=", value, "plnFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqLessThan(String value) {
            addCriterion("PLN_FUV_SEQ <", value, "plnFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqLessThanOrEqualTo(String value) {
            addCriterion("PLN_FUV_SEQ <=", value, "plnFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqLike(String value) {
            addCriterion("PLN_FUV_SEQ like", value, "plnFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqNotLike(String value) {
            addCriterion("PLN_FUV_SEQ not like", value, "plnFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqIn(List<String> values) {
            addCriterion("PLN_FUV_SEQ in", values, "plnFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqNotIn(List<String> values) {
            addCriterion("PLN_FUV_SEQ not in", values, "plnFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqBetween(String value1, String value2) {
            addCriterion("PLN_FUV_SEQ between", value1, value2, "plnFuvSeq");
            return (Criteria) this;
        }

        public Criteria andPlnFuvSeqNotBetween(String value1, String value2) {
            addCriterion("PLN_FUV_SEQ not between", value1, value2, "plnFuvSeq");
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