package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspNczrslchcbInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspNczrslchcbInfExample() {
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

        public Criteria andSeqnoIsNull() {
            addCriterion("SEQNO is null");
            return (Criteria) this;
        }

        public Criteria andSeqnoIsNotNull() {
            addCriterion("SEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqnoEqualTo(String value) {
            addCriterion("SEQNO =", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotEqualTo(String value) {
            addCriterion("SEQNO <>", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThan(String value) {
            addCriterion("SEQNO >", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThanOrEqualTo(String value) {
            addCriterion("SEQNO >=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThan(String value) {
            addCriterion("SEQNO <", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThanOrEqualTo(String value) {
            addCriterion("SEQNO <=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLike(String value) {
            addCriterion("SEQNO like", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotLike(String value) {
            addCriterion("SEQNO not like", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoIn(List<String> values) {
            addCriterion("SEQNO in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotIn(List<String> values) {
            addCriterion("SEQNO not in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoBetween(String value1, String value2) {
            addCriterion("SEQNO between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotBetween(String value1, String value2) {
            addCriterion("SEQNO not between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoIsNull() {
            addCriterion("REFSEQNO is null");
            return (Criteria) this;
        }

        public Criteria andRefseqnoIsNotNull() {
            addCriterion("REFSEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andRefseqnoEqualTo(String value) {
            addCriterion("REFSEQNO =", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoNotEqualTo(String value) {
            addCriterion("REFSEQNO <>", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoGreaterThan(String value) {
            addCriterion("REFSEQNO >", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoGreaterThanOrEqualTo(String value) {
            addCriterion("REFSEQNO >=", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoLessThan(String value) {
            addCriterion("REFSEQNO <", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoLessThanOrEqualTo(String value) {
            addCriterion("REFSEQNO <=", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoLike(String value) {
            addCriterion("REFSEQNO like", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoNotLike(String value) {
            addCriterion("REFSEQNO not like", value, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoIn(List<String> values) {
            addCriterion("REFSEQNO in", values, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoNotIn(List<String> values) {
            addCriterion("REFSEQNO not in", values, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoBetween(String value1, String value2) {
            addCriterion("REFSEQNO between", value1, value2, "refseqno");
            return (Criteria) this;
        }

        public Criteria andRefseqnoNotBetween(String value1, String value2) {
            addCriterion("REFSEQNO not between", value1, value2, "refseqno");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxIsNull() {
            addCriterion("QRSJQSZZBX is null");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxIsNotNull() {
            addCriterion("QRSJQSZZBX is not null");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxEqualTo(String value) {
            addCriterion("QRSJQSZZBX =", value, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxNotEqualTo(String value) {
            addCriterion("QRSJQSZZBX <>", value, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxGreaterThan(String value) {
            addCriterion("QRSJQSZZBX >", value, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxGreaterThanOrEqualTo(String value) {
            addCriterion("QRSJQSZZBX >=", value, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxLessThan(String value) {
            addCriterion("QRSJQSZZBX <", value, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxLessThanOrEqualTo(String value) {
            addCriterion("QRSJQSZZBX <=", value, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxLike(String value) {
            addCriterion("QRSJQSZZBX like", value, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxNotLike(String value) {
            addCriterion("QRSJQSZZBX not like", value, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxIn(List<String> values) {
            addCriterion("QRSJQSZZBX in", values, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxNotIn(List<String> values) {
            addCriterion("QRSJQSZZBX not in", values, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxBetween(String value1, String value2) {
            addCriterion("QRSJQSZZBX between", value1, value2, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrsjqszzbxNotBetween(String value1, String value2) {
            addCriterion("QRSJQSZZBX not between", value1, value2, "qrsjqszzbx");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodIsNull() {
            addCriterion("QRFBSJ_COD is null");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodIsNotNull() {
            addCriterion("QRFBSJ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodEqualTo(String value) {
            addCriterion("QRFBSJ_COD =", value, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodNotEqualTo(String value) {
            addCriterion("QRFBSJ_COD <>", value, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodGreaterThan(String value) {
            addCriterion("QRFBSJ_COD >", value, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodGreaterThanOrEqualTo(String value) {
            addCriterion("QRFBSJ_COD >=", value, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodLessThan(String value) {
            addCriterion("QRFBSJ_COD <", value, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodLessThanOrEqualTo(String value) {
            addCriterion("QRFBSJ_COD <=", value, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodLike(String value) {
            addCriterion("QRFBSJ_COD like", value, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodNotLike(String value) {
            addCriterion("QRFBSJ_COD not like", value, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodIn(List<String> values) {
            addCriterion("QRFBSJ_COD in", values, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodNotIn(List<String> values) {
            addCriterion("QRFBSJ_COD not in", values, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodBetween(String value1, String value2) {
            addCriterion("QRFBSJ_COD between", value1, value2, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjCodNotBetween(String value1, String value2) {
            addCriterion("QRFBSJ_COD not between", value1, value2, "qrfbsjCod");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtIsNull() {
            addCriterion("QRFBSJ_QT is null");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtIsNotNull() {
            addCriterion("QRFBSJ_QT is not null");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtEqualTo(String value) {
            addCriterion("QRFBSJ_QT =", value, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtNotEqualTo(String value) {
            addCriterion("QRFBSJ_QT <>", value, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtGreaterThan(String value) {
            addCriterion("QRFBSJ_QT >", value, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtGreaterThanOrEqualTo(String value) {
            addCriterion("QRFBSJ_QT >=", value, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtLessThan(String value) {
            addCriterion("QRFBSJ_QT <", value, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtLessThanOrEqualTo(String value) {
            addCriterion("QRFBSJ_QT <=", value, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtLike(String value) {
            addCriterion("QRFBSJ_QT like", value, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtNotLike(String value) {
            addCriterion("QRFBSJ_QT not like", value, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtIn(List<String> values) {
            addCriterion("QRFBSJ_QT in", values, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtNotIn(List<String> values) {
            addCriterion("QRFBSJ_QT not in", values, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtBetween(String value1, String value2) {
            addCriterion("QRFBSJ_QT between", value1, value2, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andQrfbsjQtNotBetween(String value1, String value2) {
            addCriterion("QRFBSJ_QT not between", value1, value2, "qrfbsjQt");
            return (Criteria) this;
        }

        public Criteria andRyDatIsNull() {
            addCriterion("RY_DAT is null");
            return (Criteria) this;
        }

        public Criteria andRyDatIsNotNull() {
            addCriterion("RY_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andRyDatEqualTo(Date value) {
            addCriterion("RY_DAT =", value, "ryDat");
            return (Criteria) this;
        }

        public Criteria andRyDatNotEqualTo(Date value) {
            addCriterion("RY_DAT <>", value, "ryDat");
            return (Criteria) this;
        }

        public Criteria andRyDatGreaterThan(Date value) {
            addCriterion("RY_DAT >", value, "ryDat");
            return (Criteria) this;
        }

        public Criteria andRyDatGreaterThanOrEqualTo(Date value) {
            addCriterion("RY_DAT >=", value, "ryDat");
            return (Criteria) this;
        }

        public Criteria andRyDatLessThan(Date value) {
            addCriterion("RY_DAT <", value, "ryDat");
            return (Criteria) this;
        }

        public Criteria andRyDatLessThanOrEqualTo(Date value) {
            addCriterion("RY_DAT <=", value, "ryDat");
            return (Criteria) this;
        }

        public Criteria andRyDatIn(List<Date> values) {
            addCriterion("RY_DAT in", values, "ryDat");
            return (Criteria) this;
        }

        public Criteria andRyDatNotIn(List<Date> values) {
            addCriterion("RY_DAT not in", values, "ryDat");
            return (Criteria) this;
        }

        public Criteria andRyDatBetween(Date value1, Date value2) {
            addCriterion("RY_DAT between", value1, value2, "ryDat");
            return (Criteria) this;
        }

        public Criteria andRyDatNotBetween(Date value1, Date value2) {
            addCriterion("RY_DAT not between", value1, value2, "ryDat");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatIsNull() {
            addCriterion("QDRSLC_DAT is null");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatIsNotNull() {
            addCriterion("QDRSLC_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatEqualTo(Date value) {
            addCriterion("QDRSLC_DAT =", value, "qdrslcDat");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatNotEqualTo(Date value) {
            addCriterion("QDRSLC_DAT <>", value, "qdrslcDat");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatGreaterThan(Date value) {
            addCriterion("QDRSLC_DAT >", value, "qdrslcDat");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatGreaterThanOrEqualTo(Date value) {
            addCriterion("QDRSLC_DAT >=", value, "qdrslcDat");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatLessThan(Date value) {
            addCriterion("QDRSLC_DAT <", value, "qdrslcDat");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatLessThanOrEqualTo(Date value) {
            addCriterion("QDRSLC_DAT <=", value, "qdrslcDat");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatIn(List<Date> values) {
            addCriterion("QDRSLC_DAT in", values, "qdrslcDat");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatNotIn(List<Date> values) {
            addCriterion("QDRSLC_DAT not in", values, "qdrslcDat");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatBetween(Date value1, Date value2) {
            addCriterion("QDRSLC_DAT between", value1, value2, "qdrslcDat");
            return (Criteria) this;
        }

        public Criteria andQdrslcDatNotBetween(Date value1, Date value2) {
            addCriterion("QDRSLC_DAT not between", value1, value2, "qdrslcDat");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatIsNull() {
            addCriterion("YZJHL_DAT is null");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatIsNotNull() {
            addCriterion("YZJHL_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatEqualTo(Date value) {
            addCriterion("YZJHL_DAT =", value, "yzjhlDat");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatNotEqualTo(Date value) {
            addCriterion("YZJHL_DAT <>", value, "yzjhlDat");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatGreaterThan(Date value) {
            addCriterion("YZJHL_DAT >", value, "yzjhlDat");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatGreaterThanOrEqualTo(Date value) {
            addCriterion("YZJHL_DAT >=", value, "yzjhlDat");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatLessThan(Date value) {
            addCriterion("YZJHL_DAT <", value, "yzjhlDat");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatLessThanOrEqualTo(Date value) {
            addCriterion("YZJHL_DAT <=", value, "yzjhlDat");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatIn(List<Date> values) {
            addCriterion("YZJHL_DAT in", values, "yzjhlDat");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatNotIn(List<Date> values) {
            addCriterion("YZJHL_DAT not in", values, "yzjhlDat");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatBetween(Date value1, Date value2) {
            addCriterion("YZJHL_DAT between", value1, value2, "yzjhlDat");
            return (Criteria) this;
        }

        public Criteria andYzjhlDatNotBetween(Date value1, Date value2) {
            addCriterion("YZJHL_DAT not between", value1, value2, "yzjhlDat");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatIsNull() {
            addCriterion("TZWQZYG_DAT is null");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatIsNotNull() {
            addCriterion("TZWQZYG_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatEqualTo(Date value) {
            addCriterion("TZWQZYG_DAT =", value, "tzwqzygDat");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatNotEqualTo(Date value) {
            addCriterion("TZWQZYG_DAT <>", value, "tzwqzygDat");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatGreaterThan(Date value) {
            addCriterion("TZWQZYG_DAT >", value, "tzwqzygDat");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatGreaterThanOrEqualTo(Date value) {
            addCriterion("TZWQZYG_DAT >=", value, "tzwqzygDat");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatLessThan(Date value) {
            addCriterion("TZWQZYG_DAT <", value, "tzwqzygDat");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatLessThanOrEqualTo(Date value) {
            addCriterion("TZWQZYG_DAT <=", value, "tzwqzygDat");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatIn(List<Date> values) {
            addCriterion("TZWQZYG_DAT in", values, "tzwqzygDat");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatNotIn(List<Date> values) {
            addCriterion("TZWQZYG_DAT not in", values, "tzwqzygDat");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatBetween(Date value1, Date value2) {
            addCriterion("TZWQZYG_DAT between", value1, value2, "tzwqzygDat");
            return (Criteria) this;
        }

        public Criteria andTzwqzygDatNotBetween(Date value1, Date value2) {
            addCriterion("TZWQZYG_DAT not between", value1, value2, "tzwqzygDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatIsNull() {
            addCriterion("SJNKRSXZDD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatIsNotNull() {
            addCriterion("SJNKRSXZDD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatEqualTo(Date value) {
            addCriterion("SJNKRSXZDD_DAT =", value, "sjnkrsxzddDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatNotEqualTo(Date value) {
            addCriterion("SJNKRSXZDD_DAT <>", value, "sjnkrsxzddDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatGreaterThan(Date value) {
            addCriterion("SJNKRSXZDD_DAT >", value, "sjnkrsxzddDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatGreaterThanOrEqualTo(Date value) {
            addCriterion("SJNKRSXZDD_DAT >=", value, "sjnkrsxzddDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatLessThan(Date value) {
            addCriterion("SJNKRSXZDD_DAT <", value, "sjnkrsxzddDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatLessThanOrEqualTo(Date value) {
            addCriterion("SJNKRSXZDD_DAT <=", value, "sjnkrsxzddDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatIn(List<Date> values) {
            addCriterion("SJNKRSXZDD_DAT in", values, "sjnkrsxzddDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatNotIn(List<Date> values) {
            addCriterion("SJNKRSXZDD_DAT not in", values, "sjnkrsxzddDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatBetween(Date value1, Date value2) {
            addCriterion("SJNKRSXZDD_DAT between", value1, value2, "sjnkrsxzddDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrsxzddDatNotBetween(Date value1, Date value2) {
            addCriterion("SJNKRSXZDD_DAT not between", value1, value2, "sjnkrsxzddDat");
            return (Criteria) this;
        }

        public Criteria andWqddDatIsNull() {
            addCriterion("WQDD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andWqddDatIsNotNull() {
            addCriterion("WQDD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andWqddDatEqualTo(Date value) {
            addCriterion("WQDD_DAT =", value, "wqddDat");
            return (Criteria) this;
        }

        public Criteria andWqddDatNotEqualTo(Date value) {
            addCriterion("WQDD_DAT <>", value, "wqddDat");
            return (Criteria) this;
        }

        public Criteria andWqddDatGreaterThan(Date value) {
            addCriterion("WQDD_DAT >", value, "wqddDat");
            return (Criteria) this;
        }

        public Criteria andWqddDatGreaterThanOrEqualTo(Date value) {
            addCriterion("WQDD_DAT >=", value, "wqddDat");
            return (Criteria) this;
        }

        public Criteria andWqddDatLessThan(Date value) {
            addCriterion("WQDD_DAT <", value, "wqddDat");
            return (Criteria) this;
        }

        public Criteria andWqddDatLessThanOrEqualTo(Date value) {
            addCriterion("WQDD_DAT <=", value, "wqddDat");
            return (Criteria) this;
        }

        public Criteria andWqddDatIn(List<Date> values) {
            addCriterion("WQDD_DAT in", values, "wqddDat");
            return (Criteria) this;
        }

        public Criteria andWqddDatNotIn(List<Date> values) {
            addCriterion("WQDD_DAT not in", values, "wqddDat");
            return (Criteria) this;
        }

        public Criteria andWqddDatBetween(Date value1, Date value2) {
            addCriterion("WQDD_DAT between", value1, value2, "wqddDat");
            return (Criteria) this;
        }

        public Criteria andWqddDatNotBetween(Date value1, Date value2) {
            addCriterion("WQDD_DAT not between", value1, value2, "wqddDat");
            return (Criteria) this;
        }

        public Criteria andWcffDatIsNull() {
            addCriterion("WCFF_DAT is null");
            return (Criteria) this;
        }

        public Criteria andWcffDatIsNotNull() {
            addCriterion("WCFF_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andWcffDatEqualTo(Date value) {
            addCriterion("WCFF_DAT =", value, "wcffDat");
            return (Criteria) this;
        }

        public Criteria andWcffDatNotEqualTo(Date value) {
            addCriterion("WCFF_DAT <>", value, "wcffDat");
            return (Criteria) this;
        }

        public Criteria andWcffDatGreaterThan(Date value) {
            addCriterion("WCFF_DAT >", value, "wcffDat");
            return (Criteria) this;
        }

        public Criteria andWcffDatGreaterThanOrEqualTo(Date value) {
            addCriterion("WCFF_DAT >=", value, "wcffDat");
            return (Criteria) this;
        }

        public Criteria andWcffDatLessThan(Date value) {
            addCriterion("WCFF_DAT <", value, "wcffDat");
            return (Criteria) this;
        }

        public Criteria andWcffDatLessThanOrEqualTo(Date value) {
            addCriterion("WCFF_DAT <=", value, "wcffDat");
            return (Criteria) this;
        }

        public Criteria andWcffDatIn(List<Date> values) {
            addCriterion("WCFF_DAT in", values, "wcffDat");
            return (Criteria) this;
        }

        public Criteria andWcffDatNotIn(List<Date> values) {
            addCriterion("WCFF_DAT not in", values, "wcffDat");
            return (Criteria) this;
        }

        public Criteria andWcffDatBetween(Date value1, Date value2) {
            addCriterion("WCFF_DAT between", value1, value2, "wcffDat");
            return (Criteria) this;
        }

        public Criteria andWcffDatNotBetween(Date value1, Date value2) {
            addCriterion("WCFF_DAT not between", value1, value2, "wcffDat");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatIsNull() {
            addCriterion("WCSYSXBBCJHSJ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatIsNotNull() {
            addCriterion("WCSYSXBBCJHSJ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatEqualTo(Date value) {
            addCriterion("WCSYSXBBCJHSJ_DAT =", value, "wcsysxbbcjhsjDat");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatNotEqualTo(Date value) {
            addCriterion("WCSYSXBBCJHSJ_DAT <>", value, "wcsysxbbcjhsjDat");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatGreaterThan(Date value) {
            addCriterion("WCSYSXBBCJHSJ_DAT >", value, "wcsysxbbcjhsjDat");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatGreaterThanOrEqualTo(Date value) {
            addCriterion("WCSYSXBBCJHSJ_DAT >=", value, "wcsysxbbcjhsjDat");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatLessThan(Date value) {
            addCriterion("WCSYSXBBCJHSJ_DAT <", value, "wcsysxbbcjhsjDat");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatLessThanOrEqualTo(Date value) {
            addCriterion("WCSYSXBBCJHSJ_DAT <=", value, "wcsysxbbcjhsjDat");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatIn(List<Date> values) {
            addCriterion("WCSYSXBBCJHSJ_DAT in", values, "wcsysxbbcjhsjDat");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatNotIn(List<Date> values) {
            addCriterion("WCSYSXBBCJHSJ_DAT not in", values, "wcsysxbbcjhsjDat");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatBetween(Date value1, Date value2) {
            addCriterion("WCSYSXBBCJHSJ_DAT between", value1, value2, "wcsysxbbcjhsjDat");
            return (Criteria) this;
        }

        public Criteria andWcsysxbbcjhsjDatNotBetween(Date value1, Date value2) {
            addCriterion("WCSYSXBBCJHSJ_DAT not between", value1, value2, "wcsysxbbcjhsjDat");
            return (Criteria) this;
        }

        public Criteria andSctajcDatIsNull() {
            addCriterion("SCTAJC_DAT is null");
            return (Criteria) this;
        }

        public Criteria andSctajcDatIsNotNull() {
            addCriterion("SCTAJC_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andSctajcDatEqualTo(Date value) {
            addCriterion("SCTAJC_DAT =", value, "sctajcDat");
            return (Criteria) this;
        }

        public Criteria andSctajcDatNotEqualTo(Date value) {
            addCriterion("SCTAJC_DAT <>", value, "sctajcDat");
            return (Criteria) this;
        }

        public Criteria andSctajcDatGreaterThan(Date value) {
            addCriterion("SCTAJC_DAT >", value, "sctajcDat");
            return (Criteria) this;
        }

        public Criteria andSctajcDatGreaterThanOrEqualTo(Date value) {
            addCriterion("SCTAJC_DAT >=", value, "sctajcDat");
            return (Criteria) this;
        }

        public Criteria andSctajcDatLessThan(Date value) {
            addCriterion("SCTAJC_DAT <", value, "sctajcDat");
            return (Criteria) this;
        }

        public Criteria andSctajcDatLessThanOrEqualTo(Date value) {
            addCriterion("SCTAJC_DAT <=", value, "sctajcDat");
            return (Criteria) this;
        }

        public Criteria andSctajcDatIn(List<Date> values) {
            addCriterion("SCTAJC_DAT in", values, "sctajcDat");
            return (Criteria) this;
        }

        public Criteria andSctajcDatNotIn(List<Date> values) {
            addCriterion("SCTAJC_DAT not in", values, "sctajcDat");
            return (Criteria) this;
        }

        public Criteria andSctajcDatBetween(Date value1, Date value2) {
            addCriterion("SCTAJC_DAT between", value1, value2, "sctajcDat");
            return (Criteria) this;
        }

        public Criteria andSctajcDatNotBetween(Date value1, Date value2) {
            addCriterion("SCTAJC_DAT not between", value1, value2, "sctajcDat");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatIsNull() {
            addCriterion("FHQJS_DAT is null");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatIsNotNull() {
            addCriterion("FHQJS_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatEqualTo(Date value) {
            addCriterion("FHQJS_DAT =", value, "fhqjsDat");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatNotEqualTo(Date value) {
            addCriterion("FHQJS_DAT <>", value, "fhqjsDat");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatGreaterThan(Date value) {
            addCriterion("FHQJS_DAT >", value, "fhqjsDat");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatGreaterThanOrEqualTo(Date value) {
            addCriterion("FHQJS_DAT >=", value, "fhqjsDat");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatLessThan(Date value) {
            addCriterion("FHQJS_DAT <", value, "fhqjsDat");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatLessThanOrEqualTo(Date value) {
            addCriterion("FHQJS_DAT <=", value, "fhqjsDat");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatIn(List<Date> values) {
            addCriterion("FHQJS_DAT in", values, "fhqjsDat");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatNotIn(List<Date> values) {
            addCriterion("FHQJS_DAT not in", values, "fhqjsDat");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatBetween(Date value1, Date value2) {
            addCriterion("FHQJS_DAT between", value1, value2, "fhqjsDat");
            return (Criteria) this;
        }

        public Criteria andFhqjsDatNotBetween(Date value1, Date value2) {
            addCriterion("FHQJS_DAT not between", value1, value2, "fhqjsDat");
            return (Criteria) this;
        }

        public Criteria andXdtDatIsNull() {
            addCriterion("XDT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andXdtDatIsNotNull() {
            addCriterion("XDT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andXdtDatEqualTo(Date value) {
            addCriterion("XDT_DAT =", value, "xdtDat");
            return (Criteria) this;
        }

        public Criteria andXdtDatNotEqualTo(Date value) {
            addCriterion("XDT_DAT <>", value, "xdtDat");
            return (Criteria) this;
        }

        public Criteria andXdtDatGreaterThan(Date value) {
            addCriterion("XDT_DAT >", value, "xdtDat");
            return (Criteria) this;
        }

        public Criteria andXdtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("XDT_DAT >=", value, "xdtDat");
            return (Criteria) this;
        }

        public Criteria andXdtDatLessThan(Date value) {
            addCriterion("XDT_DAT <", value, "xdtDat");
            return (Criteria) this;
        }

        public Criteria andXdtDatLessThanOrEqualTo(Date value) {
            addCriterion("XDT_DAT <=", value, "xdtDat");
            return (Criteria) this;
        }

        public Criteria andXdtDatIn(List<Date> values) {
            addCriterion("XDT_DAT in", values, "xdtDat");
            return (Criteria) this;
        }

        public Criteria andXdtDatNotIn(List<Date> values) {
            addCriterion("XDT_DAT not in", values, "xdtDat");
            return (Criteria) this;
        }

        public Criteria andXdtDatBetween(Date value1, Date value2) {
            addCriterion("XDT_DAT between", value1, value2, "xdtDat");
            return (Criteria) this;
        }

        public Criteria andXdtDatNotBetween(Date value1, Date value2) {
            addCriterion("XDT_DAT not between", value1, value2, "xdtDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatIsNull() {
            addCriterion("SJNKRSTYQZQR_DAT is null");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatIsNotNull() {
            addCriterion("SJNKRSTYQZQR_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatEqualTo(Date value) {
            addCriterion("SJNKRSTYQZQR_DAT =", value, "sjnkrstyqzqrDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatNotEqualTo(Date value) {
            addCriterion("SJNKRSTYQZQR_DAT <>", value, "sjnkrstyqzqrDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatGreaterThan(Date value) {
            addCriterion("SJNKRSTYQZQR_DAT >", value, "sjnkrstyqzqrDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatGreaterThanOrEqualTo(Date value) {
            addCriterion("SJNKRSTYQZQR_DAT >=", value, "sjnkrstyqzqrDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatLessThan(Date value) {
            addCriterion("SJNKRSTYQZQR_DAT <", value, "sjnkrstyqzqrDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatLessThanOrEqualTo(Date value) {
            addCriterion("SJNKRSTYQZQR_DAT <=", value, "sjnkrstyqzqrDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatIn(List<Date> values) {
            addCriterion("SJNKRSTYQZQR_DAT in", values, "sjnkrstyqzqrDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatNotIn(List<Date> values) {
            addCriterion("SJNKRSTYQZQR_DAT not in", values, "sjnkrstyqzqrDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatBetween(Date value1, Date value2) {
            addCriterion("SJNKRSTYQZQR_DAT between", value1, value2, "sjnkrstyqzqrDat");
            return (Criteria) this;
        }

        public Criteria andSjnkrstyqzqrDatNotBetween(Date value1, Date value2) {
            addCriterion("SJNKRSTYQZQR_DAT not between", value1, value2, "sjnkrstyqzqrDat");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatIsNull() {
            addCriterion("RSYWKSSY_DAT is null");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatIsNotNull() {
            addCriterion("RSYWKSSY_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatEqualTo(Date value) {
            addCriterion("RSYWKSSY_DAT =", value, "rsywkssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatNotEqualTo(Date value) {
            addCriterion("RSYWKSSY_DAT <>", value, "rsywkssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatGreaterThan(Date value) {
            addCriterion("RSYWKSSY_DAT >", value, "rsywkssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatGreaterThanOrEqualTo(Date value) {
            addCriterion("RSYWKSSY_DAT >=", value, "rsywkssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatLessThan(Date value) {
            addCriterion("RSYWKSSY_DAT <", value, "rsywkssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatLessThanOrEqualTo(Date value) {
            addCriterion("RSYWKSSY_DAT <=", value, "rsywkssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatIn(List<Date> values) {
            addCriterion("RSYWKSSY_DAT in", values, "rsywkssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatNotIn(List<Date> values) {
            addCriterion("RSYWKSSY_DAT not in", values, "rsywkssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatBetween(Date value1, Date value2) {
            addCriterion("RSYWKSSY_DAT between", value1, value2, "rsywkssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywkssyDatNotBetween(Date value1, Date value2) {
            addCriterion("RSYWKSSY_DAT not between", value1, value2, "rsywkssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatIsNull() {
            addCriterion("RSYWJSSY_DAT is null");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatIsNotNull() {
            addCriterion("RSYWJSSY_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatEqualTo(Date value) {
            addCriterion("RSYWJSSY_DAT =", value, "rsywjssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatNotEqualTo(Date value) {
            addCriterion("RSYWJSSY_DAT <>", value, "rsywjssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatGreaterThan(Date value) {
            addCriterion("RSYWJSSY_DAT >", value, "rsywjssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatGreaterThanOrEqualTo(Date value) {
            addCriterion("RSYWJSSY_DAT >=", value, "rsywjssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatLessThan(Date value) {
            addCriterion("RSYWJSSY_DAT <", value, "rsywjssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatLessThanOrEqualTo(Date value) {
            addCriterion("RSYWJSSY_DAT <=", value, "rsywjssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatIn(List<Date> values) {
            addCriterion("RSYWJSSY_DAT in", values, "rsywjssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatNotIn(List<Date> values) {
            addCriterion("RSYWJSSY_DAT not in", values, "rsywjssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatBetween(Date value1, Date value2) {
            addCriterion("RSYWJSSY_DAT between", value1, value2, "rsywjssyDat");
            return (Criteria) this;
        }

        public Criteria andRsywjssyDatNotBetween(Date value1, Date value2) {
            addCriterion("RSYWJSSY_DAT not between", value1, value2, "rsywjssyDat");
            return (Criteria) this;
        }

        public Criteria andFctlctDatIsNull() {
            addCriterion("FCTLCT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andFctlctDatIsNotNull() {
            addCriterion("FCTLCT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andFctlctDatEqualTo(Date value) {
            addCriterion("FCTLCT_DAT =", value, "fctlctDat");
            return (Criteria) this;
        }

        public Criteria andFctlctDatNotEqualTo(Date value) {
            addCriterion("FCTLCT_DAT <>", value, "fctlctDat");
            return (Criteria) this;
        }

        public Criteria andFctlctDatGreaterThan(Date value) {
            addCriterion("FCTLCT_DAT >", value, "fctlctDat");
            return (Criteria) this;
        }

        public Criteria andFctlctDatGreaterThanOrEqualTo(Date value) {
            addCriterion("FCTLCT_DAT >=", value, "fctlctDat");
            return (Criteria) this;
        }

        public Criteria andFctlctDatLessThan(Date value) {
            addCriterion("FCTLCT_DAT <", value, "fctlctDat");
            return (Criteria) this;
        }

        public Criteria andFctlctDatLessThanOrEqualTo(Date value) {
            addCriterion("FCTLCT_DAT <=", value, "fctlctDat");
            return (Criteria) this;
        }

        public Criteria andFctlctDatIn(List<Date> values) {
            addCriterion("FCTLCT_DAT in", values, "fctlctDat");
            return (Criteria) this;
        }

        public Criteria andFctlctDatNotIn(List<Date> values) {
            addCriterion("FCTLCT_DAT not in", values, "fctlctDat");
            return (Criteria) this;
        }

        public Criteria andFctlctDatBetween(Date value1, Date value2) {
            addCriterion("FCTLCT_DAT between", value1, value2, "fctlctDat");
            return (Criteria) this;
        }

        public Criteria andFctlctDatNotBetween(Date value1, Date value2) {
            addCriterion("FCTLCT_DAT not between", value1, value2, "fctlctDat");
            return (Criteria) this;
        }

        public Criteria andSzryDatIsNull() {
            addCriterion("SZRY_DAT is null");
            return (Criteria) this;
        }

        public Criteria andSzryDatIsNotNull() {
            addCriterion("SZRY_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andSzryDatEqualTo(Date value) {
            addCriterion("SZRY_DAT =", value, "szryDat");
            return (Criteria) this;
        }

        public Criteria andSzryDatNotEqualTo(Date value) {
            addCriterion("SZRY_DAT <>", value, "szryDat");
            return (Criteria) this;
        }

        public Criteria andSzryDatGreaterThan(Date value) {
            addCriterion("SZRY_DAT >", value, "szryDat");
            return (Criteria) this;
        }

        public Criteria andSzryDatGreaterThanOrEqualTo(Date value) {
            addCriterion("SZRY_DAT >=", value, "szryDat");
            return (Criteria) this;
        }

        public Criteria andSzryDatLessThan(Date value) {
            addCriterion("SZRY_DAT <", value, "szryDat");
            return (Criteria) this;
        }

        public Criteria andSzryDatLessThanOrEqualTo(Date value) {
            addCriterion("SZRY_DAT <=", value, "szryDat");
            return (Criteria) this;
        }

        public Criteria andSzryDatIn(List<Date> values) {
            addCriterion("SZRY_DAT in", values, "szryDat");
            return (Criteria) this;
        }

        public Criteria andSzryDatNotIn(List<Date> values) {
            addCriterion("SZRY_DAT not in", values, "szryDat");
            return (Criteria) this;
        }

        public Criteria andSzryDatBetween(Date value1, Date value2) {
            addCriterion("SZRY_DAT between", value1, value2, "szryDat");
            return (Criteria) this;
        }

        public Criteria andSzryDatNotBetween(Date value1, Date value2) {
            addCriterion("SZRY_DAT not between", value1, value2, "szryDat");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysIsNull() {
            addCriterion("RYZWCLNCTAFHJZZYS is null");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysIsNotNull() {
            addCriterion("RYZWCLNCTAFHJZZYS is not null");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysEqualTo(String value) {
            addCriterion("RYZWCLNCTAFHJZZYS =", value, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysNotEqualTo(String value) {
            addCriterion("RYZWCLNCTAFHJZZYS <>", value, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysGreaterThan(String value) {
            addCriterion("RYZWCLNCTAFHJZZYS >", value, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysGreaterThanOrEqualTo(String value) {
            addCriterion("RYZWCLNCTAFHJZZYS >=", value, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysLessThan(String value) {
            addCriterion("RYZWCLNCTAFHJZZYS <", value, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysLessThanOrEqualTo(String value) {
            addCriterion("RYZWCLNCTAFHJZZYS <=", value, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysLike(String value) {
            addCriterion("RYZWCLNCTAFHJZZYS like", value, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysNotLike(String value) {
            addCriterion("RYZWCLNCTAFHJZZYS not like", value, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysIn(List<String> values) {
            addCriterion("RYZWCLNCTAFHJZZYS in", values, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysNotIn(List<String> values) {
            addCriterion("RYZWCLNCTAFHJZZYS not in", values, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysBetween(String value1, String value2) {
            addCriterion("RYZWCLNCTAFHJZZYS between", value1, value2, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzwclnctafhjzzysNotBetween(String value1, String value2) {
            addCriterion("RYZWCLNCTAFHJZZYS not between", value1, value2, "ryzwclnctafhjzzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysIsNull() {
            addCriterion("RYZRSYWKSSYZYS is null");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysIsNotNull() {
            addCriterion("RYZRSYWKSSYZYS is not null");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysEqualTo(String value) {
            addCriterion("RYZRSYWKSSYZYS =", value, "ryzrsywkssyzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysNotEqualTo(String value) {
            addCriterion("RYZRSYWKSSYZYS <>", value, "ryzrsywkssyzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysGreaterThan(String value) {
            addCriterion("RYZRSYWKSSYZYS >", value, "ryzrsywkssyzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysGreaterThanOrEqualTo(String value) {
            addCriterion("RYZRSYWKSSYZYS >=", value, "ryzrsywkssyzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysLessThan(String value) {
            addCriterion("RYZRSYWKSSYZYS <", value, "ryzrsywkssyzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysLessThanOrEqualTo(String value) {
            addCriterion("RYZRSYWKSSYZYS <=", value, "ryzrsywkssyzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysLike(String value) {
            addCriterion("RYZRSYWKSSYZYS like", value, "ryzrsywkssyzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysNotLike(String value) {
            addCriterion("RYZRSYWKSSYZYS not like", value, "ryzrsywkssyzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysIn(List<String> values) {
            addCriterion("RYZRSYWKSSYZYS in", values, "ryzrsywkssyzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysNotIn(List<String> values) {
            addCriterion("RYZRSYWKSSYZYS not in", values, "ryzrsywkssyzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysBetween(String value1, String value2) {
            addCriterion("RYZRSYWKSSYZYS between", value1, value2, "ryzrsywkssyzys");
            return (Criteria) this;
        }

        public Criteria andRyzrsywkssyzysNotBetween(String value1, String value2) {
            addCriterion("RYZRSYWKSSYZYS not between", value1, value2, "ryzrsywkssyzys");
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

        public Criteria andCrtusrnoIsNull() {
            addCriterion("CRTUSRNO is null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoIsNotNull() {
            addCriterion("CRTUSRNO is not null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoEqualTo(String value) {
            addCriterion("CRTUSRNO =", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotEqualTo(String value) {
            addCriterion("CRTUSRNO <>", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoGreaterThan(String value) {
            addCriterion("CRTUSRNO >", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoGreaterThanOrEqualTo(String value) {
            addCriterion("CRTUSRNO >=", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoLessThan(String value) {
            addCriterion("CRTUSRNO <", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoLessThanOrEqualTo(String value) {
            addCriterion("CRTUSRNO <=", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoLike(String value) {
            addCriterion("CRTUSRNO like", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotLike(String value) {
            addCriterion("CRTUSRNO not like", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoIn(List<String> values) {
            addCriterion("CRTUSRNO in", values, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotIn(List<String> values) {
            addCriterion("CRTUSRNO not in", values, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoBetween(String value1, String value2) {
            addCriterion("CRTUSRNO between", value1, value2, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotBetween(String value1, String value2) {
            addCriterion("CRTUSRNO not between", value1, value2, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameIsNull() {
            addCriterion("CRTUSRNAME is null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameIsNotNull() {
            addCriterion("CRTUSRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameEqualTo(String value) {
            addCriterion("CRTUSRNAME =", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameNotEqualTo(String value) {
            addCriterion("CRTUSRNAME <>", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameGreaterThan(String value) {
            addCriterion("CRTUSRNAME >", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameGreaterThanOrEqualTo(String value) {
            addCriterion("CRTUSRNAME >=", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameLessThan(String value) {
            addCriterion("CRTUSRNAME <", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameLessThanOrEqualTo(String value) {
            addCriterion("CRTUSRNAME <=", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameLike(String value) {
            addCriterion("CRTUSRNAME like", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameNotLike(String value) {
            addCriterion("CRTUSRNAME not like", value, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameIn(List<String> values) {
            addCriterion("CRTUSRNAME in", values, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameNotIn(List<String> values) {
            addCriterion("CRTUSRNAME not in", values, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameBetween(String value1, String value2) {
            addCriterion("CRTUSRNAME between", value1, value2, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtusrnameNotBetween(String value1, String value2) {
            addCriterion("CRTUSRNAME not between", value1, value2, "crtusrname");
            return (Criteria) this;
        }

        public Criteria andCrtdateIsNull() {
            addCriterion("CRTDATE is null");
            return (Criteria) this;
        }

        public Criteria andCrtdateIsNotNull() {
            addCriterion("CRTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCrtdateEqualTo(Date value) {
            addCriterion("CRTDATE =", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateNotEqualTo(Date value) {
            addCriterion("CRTDATE <>", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateGreaterThan(Date value) {
            addCriterion("CRTDATE >", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CRTDATE >=", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateLessThan(Date value) {
            addCriterion("CRTDATE <", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateLessThanOrEqualTo(Date value) {
            addCriterion("CRTDATE <=", value, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateIn(List<Date> values) {
            addCriterion("CRTDATE in", values, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateNotIn(List<Date> values) {
            addCriterion("CRTDATE not in", values, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateBetween(Date value1, Date value2) {
            addCriterion("CRTDATE between", value1, value2, "crtdate");
            return (Criteria) this;
        }

        public Criteria andCrtdateNotBetween(Date value1, Date value2) {
            addCriterion("CRTDATE not between", value1, value2, "crtdate");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoIsNull() {
            addCriterion("UPDUSRNO is null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoIsNotNull() {
            addCriterion("UPDUSRNO is not null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoEqualTo(String value) {
            addCriterion("UPDUSRNO =", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotEqualTo(String value) {
            addCriterion("UPDUSRNO <>", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoGreaterThan(String value) {
            addCriterion("UPDUSRNO >", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoGreaterThanOrEqualTo(String value) {
            addCriterion("UPDUSRNO >=", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoLessThan(String value) {
            addCriterion("UPDUSRNO <", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoLessThanOrEqualTo(String value) {
            addCriterion("UPDUSRNO <=", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoLike(String value) {
            addCriterion("UPDUSRNO like", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotLike(String value) {
            addCriterion("UPDUSRNO not like", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoIn(List<String> values) {
            addCriterion("UPDUSRNO in", values, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotIn(List<String> values) {
            addCriterion("UPDUSRNO not in", values, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoBetween(String value1, String value2) {
            addCriterion("UPDUSRNO between", value1, value2, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotBetween(String value1, String value2) {
            addCriterion("UPDUSRNO not between", value1, value2, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameIsNull() {
            addCriterion("UPDUSRNAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameIsNotNull() {
            addCriterion("UPDUSRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameEqualTo(String value) {
            addCriterion("UPDUSRNAME =", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameNotEqualTo(String value) {
            addCriterion("UPDUSRNAME <>", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameGreaterThan(String value) {
            addCriterion("UPDUSRNAME >", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDUSRNAME >=", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameLessThan(String value) {
            addCriterion("UPDUSRNAME <", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameLessThanOrEqualTo(String value) {
            addCriterion("UPDUSRNAME <=", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameLike(String value) {
            addCriterion("UPDUSRNAME like", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameNotLike(String value) {
            addCriterion("UPDUSRNAME not like", value, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameIn(List<String> values) {
            addCriterion("UPDUSRNAME in", values, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameNotIn(List<String> values) {
            addCriterion("UPDUSRNAME not in", values, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameBetween(String value1, String value2) {
            addCriterion("UPDUSRNAME between", value1, value2, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpdusrnameNotBetween(String value1, String value2) {
            addCriterion("UPDUSRNAME not between", value1, value2, "updusrname");
            return (Criteria) this;
        }

        public Criteria andUpddateIsNull() {
            addCriterion("UPDDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpddateIsNotNull() {
            addCriterion("UPDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpddateEqualTo(Date value) {
            addCriterion("UPDDATE =", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateNotEqualTo(Date value) {
            addCriterion("UPDDATE <>", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateGreaterThan(Date value) {
            addCriterion("UPDDATE >", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDDATE >=", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateLessThan(Date value) {
            addCriterion("UPDDATE <", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateLessThanOrEqualTo(Date value) {
            addCriterion("UPDDATE <=", value, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateIn(List<Date> values) {
            addCriterion("UPDDATE in", values, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateNotIn(List<Date> values) {
            addCriterion("UPDDATE not in", values, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateBetween(Date value1, Date value2) {
            addCriterion("UPDDATE between", value1, value2, "upddate");
            return (Criteria) this;
        }

        public Criteria andUpddateNotBetween(Date value1, Date value2) {
            addCriterion("UPDDATE not between", value1, value2, "upddate");
            return (Criteria) this;
        }

        public Criteria andTexthtmlIsNull() {
            addCriterion("TEXTHTML is null");
            return (Criteria) this;
        }

        public Criteria andTexthtmlIsNotNull() {
            addCriterion("TEXTHTML is not null");
            return (Criteria) this;
        }

        public Criteria andTexthtmlEqualTo(String value) {
            addCriterion("TEXTHTML =", value, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTexthtmlNotEqualTo(String value) {
            addCriterion("TEXTHTML <>", value, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTexthtmlGreaterThan(String value) {
            addCriterion("TEXTHTML >", value, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTexthtmlGreaterThanOrEqualTo(String value) {
            addCriterion("TEXTHTML >=", value, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTexthtmlLessThan(String value) {
            addCriterion("TEXTHTML <", value, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTexthtmlLessThanOrEqualTo(String value) {
            addCriterion("TEXTHTML <=", value, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTexthtmlLike(String value) {
            addCriterion("TEXTHTML like", value, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTexthtmlNotLike(String value) {
            addCriterion("TEXTHTML not like", value, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTexthtmlIn(List<String> values) {
            addCriterion("TEXTHTML in", values, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTexthtmlNotIn(List<String> values) {
            addCriterion("TEXTHTML not in", values, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTexthtmlBetween(String value1, String value2) {
            addCriterion("TEXTHTML between", value1, value2, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTexthtmlNotBetween(String value1, String value2) {
            addCriterion("TEXTHTML not between", value1, value2, "texthtml");
            return (Criteria) this;
        }

        public Criteria andTextparamIsNull() {
            addCriterion("TEXTPARAM is null");
            return (Criteria) this;
        }

        public Criteria andTextparamIsNotNull() {
            addCriterion("TEXTPARAM is not null");
            return (Criteria) this;
        }

        public Criteria andTextparamEqualTo(String value) {
            addCriterion("TEXTPARAM =", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamNotEqualTo(String value) {
            addCriterion("TEXTPARAM <>", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamGreaterThan(String value) {
            addCriterion("TEXTPARAM >", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamGreaterThanOrEqualTo(String value) {
            addCriterion("TEXTPARAM >=", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamLessThan(String value) {
            addCriterion("TEXTPARAM <", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamLessThanOrEqualTo(String value) {
            addCriterion("TEXTPARAM <=", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamLike(String value) {
            addCriterion("TEXTPARAM like", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamNotLike(String value) {
            addCriterion("TEXTPARAM not like", value, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamIn(List<String> values) {
            addCriterion("TEXTPARAM in", values, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamNotIn(List<String> values) {
            addCriterion("TEXTPARAM not in", values, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamBetween(String value1, String value2) {
            addCriterion("TEXTPARAM between", value1, value2, "textparam");
            return (Criteria) this;
        }

        public Criteria andTextparamNotBetween(String value1, String value2) {
            addCriterion("TEXTPARAM not between", value1, value2, "textparam");
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