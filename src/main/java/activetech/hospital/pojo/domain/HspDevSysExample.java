package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspDevSysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDevSysExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDevtypCodIsNull() {
            addCriterion("DEVTYP_COD is null");
            return (Criteria) this;
        }

        public Criteria andDevtypCodIsNotNull() {
            addCriterion("DEVTYP_COD is not null");
            return (Criteria) this;
        }

        public Criteria andDevtypCodEqualTo(String value) {
            addCriterion("DEVTYP_COD =", value, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andDevtypCodNotEqualTo(String value) {
            addCriterion("DEVTYP_COD <>", value, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andDevtypCodGreaterThan(String value) {
            addCriterion("DEVTYP_COD >", value, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andDevtypCodGreaterThanOrEqualTo(String value) {
            addCriterion("DEVTYP_COD >=", value, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andDevtypCodLessThan(String value) {
            addCriterion("DEVTYP_COD <", value, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andDevtypCodLessThanOrEqualTo(String value) {
            addCriterion("DEVTYP_COD <=", value, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andDevtypCodLike(String value) {
            addCriterion("DEVTYP_COD like", value, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andDevtypCodNotLike(String value) {
            addCriterion("DEVTYP_COD not like", value, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andDevtypCodIn(List<String> values) {
            addCriterion("DEVTYP_COD in", values, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andDevtypCodNotIn(List<String> values) {
            addCriterion("DEVTYP_COD not in", values, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andDevtypCodBetween(String value1, String value2) {
            addCriterion("DEVTYP_COD between", value1, value2, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andDevtypCodNotBetween(String value1, String value2) {
            addCriterion("DEVTYP_COD not between", value1, value2, "devtypCod");
            return (Criteria) this;
        }

        public Criteria andIpaddrIsNull() {
            addCriterion("IPADDR is null");
            return (Criteria) this;
        }

        public Criteria andIpaddrIsNotNull() {
            addCriterion("IPADDR is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddrEqualTo(String value) {
            addCriterion("IPADDR =", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotEqualTo(String value) {
            addCriterion("IPADDR <>", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThan(String value) {
            addCriterion("IPADDR >", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThanOrEqualTo(String value) {
            addCriterion("IPADDR >=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThan(String value) {
            addCriterion("IPADDR <", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThanOrEqualTo(String value) {
            addCriterion("IPADDR <=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLike(String value) {
            addCriterion("IPADDR like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotLike(String value) {
            addCriterion("IPADDR not like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrIn(List<String> values) {
            addCriterion("IPADDR in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotIn(List<String> values) {
            addCriterion("IPADDR not in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrBetween(String value1, String value2) {
            addCriterion("IPADDR between", value1, value2, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotBetween(String value1, String value2) {
            addCriterion("IPADDR not between", value1, value2, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andDevnoIsNull() {
            addCriterion("DEVNO is null");
            return (Criteria) this;
        }

        public Criteria andDevnoIsNotNull() {
            addCriterion("DEVNO is not null");
            return (Criteria) this;
        }

        public Criteria andDevnoEqualTo(String value) {
            addCriterion("DEVNO =", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoNotEqualTo(String value) {
            addCriterion("DEVNO <>", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoGreaterThan(String value) {
            addCriterion("DEVNO >", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoGreaterThanOrEqualTo(String value) {
            addCriterion("DEVNO >=", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoLessThan(String value) {
            addCriterion("DEVNO <", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoLessThanOrEqualTo(String value) {
            addCriterion("DEVNO <=", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoLike(String value) {
            addCriterion("DEVNO like", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoNotLike(String value) {
            addCriterion("DEVNO not like", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoIn(List<String> values) {
            addCriterion("DEVNO in", values, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoNotIn(List<String> values) {
            addCriterion("DEVNO not in", values, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoBetween(String value1, String value2) {
            addCriterion("DEVNO between", value1, value2, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoNotBetween(String value1, String value2) {
            addCriterion("DEVNO not between", value1, value2, "devno");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andCrtDatIsNull() {
            addCriterion("CRT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCrtDatIsNotNull() {
            addCriterion("CRT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDatEqualTo(Date value) {
            addCriterion("CRT_DAT =", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotEqualTo(Date value) {
            addCriterion("CRT_DAT <>", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatGreaterThan(Date value) {
            addCriterion("CRT_DAT >", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_DAT >=", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatLessThan(Date value) {
            addCriterion("CRT_DAT <", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatLessThanOrEqualTo(Date value) {
            addCriterion("CRT_DAT <=", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatIn(List<Date> values) {
            addCriterion("CRT_DAT in", values, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotIn(List<Date> values) {
            addCriterion("CRT_DAT not in", values, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatBetween(Date value1, Date value2) {
            addCriterion("CRT_DAT between", value1, value2, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotBetween(Date value1, Date value2) {
            addCriterion("CRT_DAT not between", value1, value2, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrIsNull() {
            addCriterion("CRT_USR_NBR is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrIsNotNull() {
            addCriterion("CRT_USR_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrEqualTo(String value) {
            addCriterion("CRT_USR_NBR =", value, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrNotEqualTo(String value) {
            addCriterion("CRT_USR_NBR <>", value, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrGreaterThan(String value) {
            addCriterion("CRT_USR_NBR >", value, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NBR >=", value, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrLessThan(String value) {
            addCriterion("CRT_USR_NBR <", value, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NBR <=", value, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrLike(String value) {
            addCriterion("CRT_USR_NBR like", value, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrNotLike(String value) {
            addCriterion("CRT_USR_NBR not like", value, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrIn(List<String> values) {
            addCriterion("CRT_USR_NBR in", values, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrNotIn(List<String> values) {
            addCriterion("CRT_USR_NBR not in", values, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrBetween(String value1, String value2) {
            addCriterion("CRT_USR_NBR between", value1, value2, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNbrNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_NBR not between", value1, value2, "crtUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdDatIsNull() {
            addCriterion("UPD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andUpdDatIsNotNull() {
            addCriterion("UPD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdDatEqualTo(Date value) {
            addCriterion("UPD_DAT =", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatNotEqualTo(Date value) {
            addCriterion("UPD_DAT <>", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatGreaterThan(Date value) {
            addCriterion("UPD_DAT >", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPD_DAT >=", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatLessThan(Date value) {
            addCriterion("UPD_DAT <", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatLessThanOrEqualTo(Date value) {
            addCriterion("UPD_DAT <=", value, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatIn(List<Date> values) {
            addCriterion("UPD_DAT in", values, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatNotIn(List<Date> values) {
            addCriterion("UPD_DAT not in", values, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatBetween(Date value1, Date value2) {
            addCriterion("UPD_DAT between", value1, value2, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdDatNotBetween(Date value1, Date value2) {
            addCriterion("UPD_DAT not between", value1, value2, "updDat");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrIsNull() {
            addCriterion("UPD_USR_NBR is null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrIsNotNull() {
            addCriterion("UPD_USR_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrEqualTo(String value) {
            addCriterion("UPD_USR_NBR =", value, "updUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrNotEqualTo(String value) {
            addCriterion("UPD_USR_NBR <>", value, "updUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrGreaterThan(String value) {
            addCriterion("UPD_USR_NBR >", value, "updUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NBR >=", value, "updUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrLessThan(String value) {
            addCriterion("UPD_USR_NBR <", value, "updUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrLessThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NBR <=", value, "updUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrLike(String value) {
            addCriterion("UPD_USR_NBR like", value, "updUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrNotLike(String value) {
            addCriterion("UPD_USR_NBR not like", value, "updUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrIn(List<String> values) {
            addCriterion("UPD_USR_NBR in", values, "updUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrNotIn(List<String> values) {
            addCriterion("UPD_USR_NBR not in", values, "updUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrBetween(String value1, String value2) {
            addCriterion("UPD_USR_NBR between", value1, value2, "updUsrNbr");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNbrNotBetween(String value1, String value2) {
            addCriterion("UPD_USR_NBR not between", value1, value2, "updUsrNbr");
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