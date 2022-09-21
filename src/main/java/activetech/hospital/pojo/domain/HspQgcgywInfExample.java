package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspQgcgywInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspQgcgywInfExample() {
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

        public Criteria andQgcgywSeqIsNull() {
            addCriterion("QGCGYW_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqIsNotNull() {
            addCriterion("QGCGYW_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqEqualTo(String value) {
            addCriterion("QGCGYW_SEQ =", value, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqNotEqualTo(String value) {
            addCriterion("QGCGYW_SEQ <>", value, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqGreaterThan(String value) {
            addCriterion("QGCGYW_SEQ >", value, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqGreaterThanOrEqualTo(String value) {
            addCriterion("QGCGYW_SEQ >=", value, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqLessThan(String value) {
            addCriterion("QGCGYW_SEQ <", value, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqLessThanOrEqualTo(String value) {
            addCriterion("QGCGYW_SEQ <=", value, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqLike(String value) {
            addCriterion("QGCGYW_SEQ like", value, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqNotLike(String value) {
            addCriterion("QGCGYW_SEQ not like", value, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqIn(List<String> values) {
            addCriterion("QGCGYW_SEQ in", values, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqNotIn(List<String> values) {
            addCriterion("QGCGYW_SEQ not in", values, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqBetween(String value1, String value2) {
            addCriterion("QGCGYW_SEQ between", value1, value2, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywSeqNotBetween(String value1, String value2) {
            addCriterion("QGCGYW_SEQ not between", value1, value2, "qgcgywSeq");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatIsNull() {
            addCriterion("QGCGYW_DAT is null");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatIsNotNull() {
            addCriterion("QGCGYW_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatEqualTo(Date value) {
            addCriterion("QGCGYW_DAT =", value, "qgcgywDat");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatNotEqualTo(Date value) {
            addCriterion("QGCGYW_DAT <>", value, "qgcgywDat");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatGreaterThan(Date value) {
            addCriterion("QGCGYW_DAT >", value, "qgcgywDat");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatGreaterThanOrEqualTo(Date value) {
            addCriterion("QGCGYW_DAT >=", value, "qgcgywDat");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatLessThan(Date value) {
            addCriterion("QGCGYW_DAT <", value, "qgcgywDat");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatLessThanOrEqualTo(Date value) {
            addCriterion("QGCGYW_DAT <=", value, "qgcgywDat");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatIn(List<Date> values) {
            addCriterion("QGCGYW_DAT in", values, "qgcgywDat");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatNotIn(List<Date> values) {
            addCriterion("QGCGYW_DAT not in", values, "qgcgywDat");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatBetween(Date value1, Date value2) {
            addCriterion("QGCGYW_DAT between", value1, value2, "qgcgywDat");
            return (Criteria) this;
        }

        public Criteria andQgcgywDatNotBetween(Date value1, Date value2) {
            addCriterion("QGCGYW_DAT not between", value1, value2, "qgcgywDat");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypIsNull() {
            addCriterion("QGCGYW_TYP is null");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypIsNotNull() {
            addCriterion("QGCGYW_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypEqualTo(String value) {
            addCriterion("QGCGYW_TYP =", value, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypNotEqualTo(String value) {
            addCriterion("QGCGYW_TYP <>", value, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypGreaterThan(String value) {
            addCriterion("QGCGYW_TYP >", value, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypGreaterThanOrEqualTo(String value) {
            addCriterion("QGCGYW_TYP >=", value, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypLessThan(String value) {
            addCriterion("QGCGYW_TYP <", value, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypLessThanOrEqualTo(String value) {
            addCriterion("QGCGYW_TYP <=", value, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypLike(String value) {
            addCriterion("QGCGYW_TYP like", value, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypNotLike(String value) {
            addCriterion("QGCGYW_TYP not like", value, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypIn(List<String> values) {
            addCriterion("QGCGYW_TYP in", values, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypNotIn(List<String> values) {
            addCriterion("QGCGYW_TYP not in", values, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypBetween(String value1, String value2) {
            addCriterion("QGCGYW_TYP between", value1, value2, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andQgcgywTypNotBetween(String value1, String value2) {
            addCriterion("QGCGYW_TYP not between", value1, value2, "qgcgywTyp");
            return (Criteria) this;
        }

        public Criteria andKshjCountIsNull() {
            addCriterion("KSHJ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andKshjCountIsNotNull() {
            addCriterion("KSHJ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andKshjCountEqualTo(Short value) {
            addCriterion("KSHJ_COUNT =", value, "kshjCount");
            return (Criteria) this;
        }

        public Criteria andKshjCountNotEqualTo(Short value) {
            addCriterion("KSHJ_COUNT <>", value, "kshjCount");
            return (Criteria) this;
        }

        public Criteria andKshjCountGreaterThan(Short value) {
            addCriterion("KSHJ_COUNT >", value, "kshjCount");
            return (Criteria) this;
        }

        public Criteria andKshjCountGreaterThanOrEqualTo(Short value) {
            addCriterion("KSHJ_COUNT >=", value, "kshjCount");
            return (Criteria) this;
        }

        public Criteria andKshjCountLessThan(Short value) {
            addCriterion("KSHJ_COUNT <", value, "kshjCount");
            return (Criteria) this;
        }

        public Criteria andKshjCountLessThanOrEqualTo(Short value) {
            addCriterion("KSHJ_COUNT <=", value, "kshjCount");
            return (Criteria) this;
        }

        public Criteria andKshjCountIn(List<Short> values) {
            addCriterion("KSHJ_COUNT in", values, "kshjCount");
            return (Criteria) this;
        }

        public Criteria andKshjCountNotIn(List<Short> values) {
            addCriterion("KSHJ_COUNT not in", values, "kshjCount");
            return (Criteria) this;
        }

        public Criteria andKshjCountBetween(Short value1, Short value2) {
            addCriterion("KSHJ_COUNT between", value1, value2, "kshjCount");
            return (Criteria) this;
        }

        public Criteria andKshjCountNotBetween(Short value1, Short value2) {
            addCriterion("KSHJ_COUNT not between", value1, value2, "kshjCount");
            return (Criteria) this;
        }

        public Criteria andDyxCountIsNull() {
            addCriterion("DYX_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andDyxCountIsNotNull() {
            addCriterion("DYX_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDyxCountEqualTo(Short value) {
            addCriterion("DYX_COUNT =", value, "dyxCount");
            return (Criteria) this;
        }

        public Criteria andDyxCountNotEqualTo(Short value) {
            addCriterion("DYX_COUNT <>", value, "dyxCount");
            return (Criteria) this;
        }

        public Criteria andDyxCountGreaterThan(Short value) {
            addCriterion("DYX_COUNT >", value, "dyxCount");
            return (Criteria) this;
        }

        public Criteria andDyxCountGreaterThanOrEqualTo(Short value) {
            addCriterion("DYX_COUNT >=", value, "dyxCount");
            return (Criteria) this;
        }

        public Criteria andDyxCountLessThan(Short value) {
            addCriterion("DYX_COUNT <", value, "dyxCount");
            return (Criteria) this;
        }

        public Criteria andDyxCountLessThanOrEqualTo(Short value) {
            addCriterion("DYX_COUNT <=", value, "dyxCount");
            return (Criteria) this;
        }

        public Criteria andDyxCountIn(List<Short> values) {
            addCriterion("DYX_COUNT in", values, "dyxCount");
            return (Criteria) this;
        }

        public Criteria andDyxCountNotIn(List<Short> values) {
            addCriterion("DYX_COUNT not in", values, "dyxCount");
            return (Criteria) this;
        }

        public Criteria andDyxCountBetween(Short value1, Short value2) {
            addCriterion("DYX_COUNT between", value1, value2, "dyxCount");
            return (Criteria) this;
        }

        public Criteria andDyxCountNotBetween(Short value1, Short value2) {
            addCriterion("DYX_COUNT not between", value1, value2, "dyxCount");
            return (Criteria) this;
        }

        public Criteria andGxCountIsNull() {
            addCriterion("GX_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andGxCountIsNotNull() {
            addCriterion("GX_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGxCountEqualTo(Short value) {
            addCriterion("GX_COUNT =", value, "gxCount");
            return (Criteria) this;
        }

        public Criteria andGxCountNotEqualTo(Short value) {
            addCriterion("GX_COUNT <>", value, "gxCount");
            return (Criteria) this;
        }

        public Criteria andGxCountGreaterThan(Short value) {
            addCriterion("GX_COUNT >", value, "gxCount");
            return (Criteria) this;
        }

        public Criteria andGxCountGreaterThanOrEqualTo(Short value) {
            addCriterion("GX_COUNT >=", value, "gxCount");
            return (Criteria) this;
        }

        public Criteria andGxCountLessThan(Short value) {
            addCriterion("GX_COUNT <", value, "gxCount");
            return (Criteria) this;
        }

        public Criteria andGxCountLessThanOrEqualTo(Short value) {
            addCriterion("GX_COUNT <=", value, "gxCount");
            return (Criteria) this;
        }

        public Criteria andGxCountIn(List<Short> values) {
            addCriterion("GX_COUNT in", values, "gxCount");
            return (Criteria) this;
        }

        public Criteria andGxCountNotIn(List<Short> values) {
            addCriterion("GX_COUNT not in", values, "gxCount");
            return (Criteria) this;
        }

        public Criteria andGxCountBetween(Short value1, Short value2) {
            addCriterion("GX_COUNT between", value1, value2, "gxCount");
            return (Criteria) this;
        }

        public Criteria andGxCountNotBetween(Short value1, Short value2) {
            addCriterion("GX_COUNT not between", value1, value2, "gxCount");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountIsNull() {
            addCriterion("YCXHJP_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountIsNotNull() {
            addCriterion("YCXHJP_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountEqualTo(Short value) {
            addCriterion("YCXHJP_COUNT =", value, "ycxhjpCount");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountNotEqualTo(Short value) {
            addCriterion("YCXHJP_COUNT <>", value, "ycxhjpCount");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountGreaterThan(Short value) {
            addCriterion("YCXHJP_COUNT >", value, "ycxhjpCount");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountGreaterThanOrEqualTo(Short value) {
            addCriterion("YCXHJP_COUNT >=", value, "ycxhjpCount");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountLessThan(Short value) {
            addCriterion("YCXHJP_COUNT <", value, "ycxhjpCount");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountLessThanOrEqualTo(Short value) {
            addCriterion("YCXHJP_COUNT <=", value, "ycxhjpCount");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountIn(List<Short> values) {
            addCriterion("YCXHJP_COUNT in", values, "ycxhjpCount");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountNotIn(List<Short> values) {
            addCriterion("YCXHJP_COUNT not in", values, "ycxhjpCount");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountBetween(Short value1, Short value2) {
            addCriterion("YCXHJP_COUNT between", value1, value2, "ycxhjpCount");
            return (Criteria) this;
        }

        public Criteria andYcxhjpCountNotBetween(Short value1, Short value2) {
            addCriterion("YCXHJP_COUNT not between", value1, value2, "ycxhjpCount");
            return (Criteria) this;
        }

        public Criteria andDyczFlgIsNull() {
            addCriterion("DYCZ_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDyczFlgIsNotNull() {
            addCriterion("DYCZ_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDyczFlgEqualTo(String value) {
            addCriterion("DYCZ_FLG =", value, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andDyczFlgNotEqualTo(String value) {
            addCriterion("DYCZ_FLG <>", value, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andDyczFlgGreaterThan(String value) {
            addCriterion("DYCZ_FLG >", value, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andDyczFlgGreaterThanOrEqualTo(String value) {
            addCriterion("DYCZ_FLG >=", value, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andDyczFlgLessThan(String value) {
            addCriterion("DYCZ_FLG <", value, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andDyczFlgLessThanOrEqualTo(String value) {
            addCriterion("DYCZ_FLG <=", value, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andDyczFlgLike(String value) {
            addCriterion("DYCZ_FLG like", value, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andDyczFlgNotLike(String value) {
            addCriterion("DYCZ_FLG not like", value, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andDyczFlgIn(List<String> values) {
            addCriterion("DYCZ_FLG in", values, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andDyczFlgNotIn(List<String> values) {
            addCriterion("DYCZ_FLG not in", values, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andDyczFlgBetween(String value1, String value2) {
            addCriterion("DYCZ_FLG between", value1, value2, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andDyczFlgNotBetween(String value1, String value2) {
            addCriterion("DYCZ_FLG not between", value1, value2, "dyczFlg");
            return (Criteria) this;
        }

        public Criteria andHjbCountIsNull() {
            addCriterion("HJB_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andHjbCountIsNotNull() {
            addCriterion("HJB_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHjbCountEqualTo(Short value) {
            addCriterion("HJB_COUNT =", value, "hjbCount");
            return (Criteria) this;
        }

        public Criteria andHjbCountNotEqualTo(Short value) {
            addCriterion("HJB_COUNT <>", value, "hjbCount");
            return (Criteria) this;
        }

        public Criteria andHjbCountGreaterThan(Short value) {
            addCriterion("HJB_COUNT >", value, "hjbCount");
            return (Criteria) this;
        }

        public Criteria andHjbCountGreaterThanOrEqualTo(Short value) {
            addCriterion("HJB_COUNT >=", value, "hjbCount");
            return (Criteria) this;
        }

        public Criteria andHjbCountLessThan(Short value) {
            addCriterion("HJB_COUNT <", value, "hjbCount");
            return (Criteria) this;
        }

        public Criteria andHjbCountLessThanOrEqualTo(Short value) {
            addCriterion("HJB_COUNT <=", value, "hjbCount");
            return (Criteria) this;
        }

        public Criteria andHjbCountIn(List<Short> values) {
            addCriterion("HJB_COUNT in", values, "hjbCount");
            return (Criteria) this;
        }

        public Criteria andHjbCountNotIn(List<Short> values) {
            addCriterion("HJB_COUNT not in", values, "hjbCount");
            return (Criteria) this;
        }

        public Criteria andHjbCountBetween(Short value1, Short value2) {
            addCriterion("HJB_COUNT between", value1, value2, "hjbCount");
            return (Criteria) this;
        }

        public Criteria andHjbCountNotBetween(Short value1, Short value2) {
            addCriterion("HJB_COUNT not between", value1, value2, "hjbCount");
            return (Criteria) this;
        }

        public Criteria andHjpdCountIsNull() {
            addCriterion("HJPD_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andHjpdCountIsNotNull() {
            addCriterion("HJPD_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHjpdCountEqualTo(Short value) {
            addCriterion("HJPD_COUNT =", value, "hjpdCount");
            return (Criteria) this;
        }

        public Criteria andHjpdCountNotEqualTo(Short value) {
            addCriterion("HJPD_COUNT <>", value, "hjpdCount");
            return (Criteria) this;
        }

        public Criteria andHjpdCountGreaterThan(Short value) {
            addCriterion("HJPD_COUNT >", value, "hjpdCount");
            return (Criteria) this;
        }

        public Criteria andHjpdCountGreaterThanOrEqualTo(Short value) {
            addCriterion("HJPD_COUNT >=", value, "hjpdCount");
            return (Criteria) this;
        }

        public Criteria andHjpdCountLessThan(Short value) {
            addCriterion("HJPD_COUNT <", value, "hjpdCount");
            return (Criteria) this;
        }

        public Criteria andHjpdCountLessThanOrEqualTo(Short value) {
            addCriterion("HJPD_COUNT <=", value, "hjpdCount");
            return (Criteria) this;
        }

        public Criteria andHjpdCountIn(List<Short> values) {
            addCriterion("HJPD_COUNT in", values, "hjpdCount");
            return (Criteria) this;
        }

        public Criteria andHjpdCountNotIn(List<Short> values) {
            addCriterion("HJPD_COUNT not in", values, "hjpdCount");
            return (Criteria) this;
        }

        public Criteria andHjpdCountBetween(Short value1, Short value2) {
            addCriterion("HJPD_COUNT between", value1, value2, "hjpdCount");
            return (Criteria) this;
        }

        public Criteria andHjpdCountNotBetween(Short value1, Short value2) {
            addCriterion("HJPD_COUNT not between", value1, value2, "hjpdCount");
            return (Criteria) this;
        }

        public Criteria andHjpzCountIsNull() {
            addCriterion("HJPZ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andHjpzCountIsNotNull() {
            addCriterion("HJPZ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHjpzCountEqualTo(Short value) {
            addCriterion("HJPZ_COUNT =", value, "hjpzCount");
            return (Criteria) this;
        }

        public Criteria andHjpzCountNotEqualTo(Short value) {
            addCriterion("HJPZ_COUNT <>", value, "hjpzCount");
            return (Criteria) this;
        }

        public Criteria andHjpzCountGreaterThan(Short value) {
            addCriterion("HJPZ_COUNT >", value, "hjpzCount");
            return (Criteria) this;
        }

        public Criteria andHjpzCountGreaterThanOrEqualTo(Short value) {
            addCriterion("HJPZ_COUNT >=", value, "hjpzCount");
            return (Criteria) this;
        }

        public Criteria andHjpzCountLessThan(Short value) {
            addCriterion("HJPZ_COUNT <", value, "hjpzCount");
            return (Criteria) this;
        }

        public Criteria andHjpzCountLessThanOrEqualTo(Short value) {
            addCriterion("HJPZ_COUNT <=", value, "hjpzCount");
            return (Criteria) this;
        }

        public Criteria andHjpzCountIn(List<Short> values) {
            addCriterion("HJPZ_COUNT in", values, "hjpzCount");
            return (Criteria) this;
        }

        public Criteria andHjpzCountNotIn(List<Short> values) {
            addCriterion("HJPZ_COUNT not in", values, "hjpzCount");
            return (Criteria) this;
        }

        public Criteria andHjpzCountBetween(Short value1, Short value2) {
            addCriterion("HJPZ_COUNT between", value1, value2, "hjpzCount");
            return (Criteria) this;
        }

        public Criteria andHjpzCountNotBetween(Short value1, Short value2) {
            addCriterion("HJPZ_COUNT not between", value1, value2, "hjpzCount");
            return (Criteria) this;
        }

        public Criteria andHjpxCountIsNull() {
            addCriterion("HJPX_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andHjpxCountIsNotNull() {
            addCriterion("HJPX_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHjpxCountEqualTo(Short value) {
            addCriterion("HJPX_COUNT =", value, "hjpxCount");
            return (Criteria) this;
        }

        public Criteria andHjpxCountNotEqualTo(Short value) {
            addCriterion("HJPX_COUNT <>", value, "hjpxCount");
            return (Criteria) this;
        }

        public Criteria andHjpxCountGreaterThan(Short value) {
            addCriterion("HJPX_COUNT >", value, "hjpxCount");
            return (Criteria) this;
        }

        public Criteria andHjpxCountGreaterThanOrEqualTo(Short value) {
            addCriterion("HJPX_COUNT >=", value, "hjpxCount");
            return (Criteria) this;
        }

        public Criteria andHjpxCountLessThan(Short value) {
            addCriterion("HJPX_COUNT <", value, "hjpxCount");
            return (Criteria) this;
        }

        public Criteria andHjpxCountLessThanOrEqualTo(Short value) {
            addCriterion("HJPX_COUNT <=", value, "hjpxCount");
            return (Criteria) this;
        }

        public Criteria andHjpxCountIn(List<Short> values) {
            addCriterion("HJPX_COUNT in", values, "hjpxCount");
            return (Criteria) this;
        }

        public Criteria andHjpxCountNotIn(List<Short> values) {
            addCriterion("HJPX_COUNT not in", values, "hjpxCount");
            return (Criteria) this;
        }

        public Criteria andHjpxCountBetween(Short value1, Short value2) {
            addCriterion("HJPX_COUNT between", value1, value2, "hjpxCount");
            return (Criteria) this;
        }

        public Criteria andHjpxCountNotBetween(Short value1, Short value2) {
            addCriterion("HJPX_COUNT not between", value1, value2, "hjpxCount");
            return (Criteria) this;
        }

        public Criteria andBydcCountIsNull() {
            addCriterion("BYDC_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andBydcCountIsNotNull() {
            addCriterion("BYDC_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBydcCountEqualTo(Short value) {
            addCriterion("BYDC_COUNT =", value, "bydcCount");
            return (Criteria) this;
        }

        public Criteria andBydcCountNotEqualTo(Short value) {
            addCriterion("BYDC_COUNT <>", value, "bydcCount");
            return (Criteria) this;
        }

        public Criteria andBydcCountGreaterThan(Short value) {
            addCriterion("BYDC_COUNT >", value, "bydcCount");
            return (Criteria) this;
        }

        public Criteria andBydcCountGreaterThanOrEqualTo(Short value) {
            addCriterion("BYDC_COUNT >=", value, "bydcCount");
            return (Criteria) this;
        }

        public Criteria andBydcCountLessThan(Short value) {
            addCriterion("BYDC_COUNT <", value, "bydcCount");
            return (Criteria) this;
        }

        public Criteria andBydcCountLessThanOrEqualTo(Short value) {
            addCriterion("BYDC_COUNT <=", value, "bydcCount");
            return (Criteria) this;
        }

        public Criteria andBydcCountIn(List<Short> values) {
            addCriterion("BYDC_COUNT in", values, "bydcCount");
            return (Criteria) this;
        }

        public Criteria andBydcCountNotIn(List<Short> values) {
            addCriterion("BYDC_COUNT not in", values, "bydcCount");
            return (Criteria) this;
        }

        public Criteria andBydcCountBetween(Short value1, Short value2) {
            addCriterion("BYDC_COUNT between", value1, value2, "bydcCount");
            return (Criteria) this;
        }

        public Criteria andBydcCountNotBetween(Short value1, Short value2) {
            addCriterion("BYDC_COUNT not between", value1, value2, "bydcCount");
            return (Criteria) this;
        }

        public Criteria andKytqgCountIsNull() {
            addCriterion("KYTQG_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andKytqgCountIsNotNull() {
            addCriterion("KYTQG_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andKytqgCountEqualTo(Short value) {
            addCriterion("KYTQG_COUNT =", value, "kytqgCount");
            return (Criteria) this;
        }

        public Criteria andKytqgCountNotEqualTo(Short value) {
            addCriterion("KYTQG_COUNT <>", value, "kytqgCount");
            return (Criteria) this;
        }

        public Criteria andKytqgCountGreaterThan(Short value) {
            addCriterion("KYTQG_COUNT >", value, "kytqgCount");
            return (Criteria) this;
        }

        public Criteria andKytqgCountGreaterThanOrEqualTo(Short value) {
            addCriterion("KYTQG_COUNT >=", value, "kytqgCount");
            return (Criteria) this;
        }

        public Criteria andKytqgCountLessThan(Short value) {
            addCriterion("KYTQG_COUNT <", value, "kytqgCount");
            return (Criteria) this;
        }

        public Criteria andKytqgCountLessThanOrEqualTo(Short value) {
            addCriterion("KYTQG_COUNT <=", value, "kytqgCount");
            return (Criteria) this;
        }

        public Criteria andKytqgCountIn(List<Short> values) {
            addCriterion("KYTQG_COUNT in", values, "kytqgCount");
            return (Criteria) this;
        }

        public Criteria andKytqgCountNotIn(List<Short> values) {
            addCriterion("KYTQG_COUNT not in", values, "kytqgCount");
            return (Criteria) this;
        }

        public Criteria andKytqgCountBetween(Short value1, Short value2) {
            addCriterion("KYTQG_COUNT between", value1, value2, "kytqgCount");
            return (Criteria) this;
        }

        public Criteria andKytqgCountNotBetween(Short value1, Short value2) {
            addCriterion("KYTQG_COUNT not between", value1, value2, "kytqgCount");
            return (Criteria) this;
        }

        public Criteria andYdCountIsNull() {
            addCriterion("YD_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andYdCountIsNotNull() {
            addCriterion("YD_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andYdCountEqualTo(Short value) {
            addCriterion("YD_COUNT =", value, "ydCount");
            return (Criteria) this;
        }

        public Criteria andYdCountNotEqualTo(Short value) {
            addCriterion("YD_COUNT <>", value, "ydCount");
            return (Criteria) this;
        }

        public Criteria andYdCountGreaterThan(Short value) {
            addCriterion("YD_COUNT >", value, "ydCount");
            return (Criteria) this;
        }

        public Criteria andYdCountGreaterThanOrEqualTo(Short value) {
            addCriterion("YD_COUNT >=", value, "ydCount");
            return (Criteria) this;
        }

        public Criteria andYdCountLessThan(Short value) {
            addCriterion("YD_COUNT <", value, "ydCount");
            return (Criteria) this;
        }

        public Criteria andYdCountLessThanOrEqualTo(Short value) {
            addCriterion("YD_COUNT <=", value, "ydCount");
            return (Criteria) this;
        }

        public Criteria andYdCountIn(List<Short> values) {
            addCriterion("YD_COUNT in", values, "ydCount");
            return (Criteria) this;
        }

        public Criteria andYdCountNotIn(List<Short> values) {
            addCriterion("YD_COUNT not in", values, "ydCount");
            return (Criteria) this;
        }

        public Criteria andYdCountBetween(Short value1, Short value2) {
            addCriterion("YD_COUNT between", value1, value2, "ydCount");
            return (Criteria) this;
        }

        public Criteria andYdCountNotBetween(Short value1, Short value2) {
            addCriterion("YD_COUNT not between", value1, value2, "ydCount");
            return (Criteria) this;
        }

        public Criteria andZsqCountIsNull() {
            addCriterion("ZSQ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andZsqCountIsNotNull() {
            addCriterion("ZSQ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andZsqCountEqualTo(Short value) {
            addCriterion("ZSQ_COUNT =", value, "zsqCount");
            return (Criteria) this;
        }

        public Criteria andZsqCountNotEqualTo(Short value) {
            addCriterion("ZSQ_COUNT <>", value, "zsqCount");
            return (Criteria) this;
        }

        public Criteria andZsqCountGreaterThan(Short value) {
            addCriterion("ZSQ_COUNT >", value, "zsqCount");
            return (Criteria) this;
        }

        public Criteria andZsqCountGreaterThanOrEqualTo(Short value) {
            addCriterion("ZSQ_COUNT >=", value, "zsqCount");
            return (Criteria) this;
        }

        public Criteria andZsqCountLessThan(Short value) {
            addCriterion("ZSQ_COUNT <", value, "zsqCount");
            return (Criteria) this;
        }

        public Criteria andZsqCountLessThanOrEqualTo(Short value) {
            addCriterion("ZSQ_COUNT <=", value, "zsqCount");
            return (Criteria) this;
        }

        public Criteria andZsqCountIn(List<Short> values) {
            addCriterion("ZSQ_COUNT in", values, "zsqCount");
            return (Criteria) this;
        }

        public Criteria andZsqCountNotIn(List<Short> values) {
            addCriterion("ZSQ_COUNT not in", values, "zsqCount");
            return (Criteria) this;
        }

        public Criteria andZsqCountBetween(Short value1, Short value2) {
            addCriterion("ZSQ_COUNT between", value1, value2, "zsqCount");
            return (Criteria) this;
        }

        public Criteria andZsqCountNotBetween(Short value1, Short value2) {
            addCriterion("ZSQ_COUNT not between", value1, value2, "zsqCount");
            return (Criteria) this;
        }

        public Criteria andYlbCountIsNull() {
            addCriterion("YLB_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andYlbCountIsNotNull() {
            addCriterion("YLB_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andYlbCountEqualTo(Short value) {
            addCriterion("YLB_COUNT =", value, "ylbCount");
            return (Criteria) this;
        }

        public Criteria andYlbCountNotEqualTo(Short value) {
            addCriterion("YLB_COUNT <>", value, "ylbCount");
            return (Criteria) this;
        }

        public Criteria andYlbCountGreaterThan(Short value) {
            addCriterion("YLB_COUNT >", value, "ylbCount");
            return (Criteria) this;
        }

        public Criteria andYlbCountGreaterThanOrEqualTo(Short value) {
            addCriterion("YLB_COUNT >=", value, "ylbCount");
            return (Criteria) this;
        }

        public Criteria andYlbCountLessThan(Short value) {
            addCriterion("YLB_COUNT <", value, "ylbCount");
            return (Criteria) this;
        }

        public Criteria andYlbCountLessThanOrEqualTo(Short value) {
            addCriterion("YLB_COUNT <=", value, "ylbCount");
            return (Criteria) this;
        }

        public Criteria andYlbCountIn(List<Short> values) {
            addCriterion("YLB_COUNT in", values, "ylbCount");
            return (Criteria) this;
        }

        public Criteria andYlbCountNotIn(List<Short> values) {
            addCriterion("YLB_COUNT not in", values, "ylbCount");
            return (Criteria) this;
        }

        public Criteria andYlbCountBetween(Short value1, Short value2) {
            addCriterion("YLB_COUNT between", value1, value2, "ylbCount");
            return (Criteria) this;
        }

        public Criteria andYlbCountNotBetween(Short value1, Short value2) {
            addCriterion("YLB_COUNT not between", value1, value2, "ylbCount");
            return (Criteria) this;
        }

        public Criteria andDg1CountIsNull() {
            addCriterion("DG1_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andDg1CountIsNotNull() {
            addCriterion("DG1_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDg1CountEqualTo(Short value) {
            addCriterion("DG1_COUNT =", value, "dg1Count");
            return (Criteria) this;
        }

        public Criteria andDg1CountNotEqualTo(Short value) {
            addCriterion("DG1_COUNT <>", value, "dg1Count");
            return (Criteria) this;
        }

        public Criteria andDg1CountGreaterThan(Short value) {
            addCriterion("DG1_COUNT >", value, "dg1Count");
            return (Criteria) this;
        }

        public Criteria andDg1CountGreaterThanOrEqualTo(Short value) {
            addCriterion("DG1_COUNT >=", value, "dg1Count");
            return (Criteria) this;
        }

        public Criteria andDg1CountLessThan(Short value) {
            addCriterion("DG1_COUNT <", value, "dg1Count");
            return (Criteria) this;
        }

        public Criteria andDg1CountLessThanOrEqualTo(Short value) {
            addCriterion("DG1_COUNT <=", value, "dg1Count");
            return (Criteria) this;
        }

        public Criteria andDg1CountIn(List<Short> values) {
            addCriterion("DG1_COUNT in", values, "dg1Count");
            return (Criteria) this;
        }

        public Criteria andDg1CountNotIn(List<Short> values) {
            addCriterion("DG1_COUNT not in", values, "dg1Count");
            return (Criteria) this;
        }

        public Criteria andDg1CountBetween(Short value1, Short value2) {
            addCriterion("DG1_COUNT between", value1, value2, "dg1Count");
            return (Criteria) this;
        }

        public Criteria andDg1CountNotBetween(Short value1, Short value2) {
            addCriterion("DG1_COUNT not between", value1, value2, "dg1Count");
            return (Criteria) this;
        }

        public Criteria andDg2CountIsNull() {
            addCriterion("DG2_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andDg2CountIsNotNull() {
            addCriterion("DG2_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDg2CountEqualTo(Short value) {
            addCriterion("DG2_COUNT =", value, "dg2Count");
            return (Criteria) this;
        }

        public Criteria andDg2CountNotEqualTo(Short value) {
            addCriterion("DG2_COUNT <>", value, "dg2Count");
            return (Criteria) this;
        }

        public Criteria andDg2CountGreaterThan(Short value) {
            addCriterion("DG2_COUNT >", value, "dg2Count");
            return (Criteria) this;
        }

        public Criteria andDg2CountGreaterThanOrEqualTo(Short value) {
            addCriterion("DG2_COUNT >=", value, "dg2Count");
            return (Criteria) this;
        }

        public Criteria andDg2CountLessThan(Short value) {
            addCriterion("DG2_COUNT <", value, "dg2Count");
            return (Criteria) this;
        }

        public Criteria andDg2CountLessThanOrEqualTo(Short value) {
            addCriterion("DG2_COUNT <=", value, "dg2Count");
            return (Criteria) this;
        }

        public Criteria andDg2CountIn(List<Short> values) {
            addCriterion("DG2_COUNT in", values, "dg2Count");
            return (Criteria) this;
        }

        public Criteria andDg2CountNotIn(List<Short> values) {
            addCriterion("DG2_COUNT not in", values, "dg2Count");
            return (Criteria) this;
        }

        public Criteria andDg2CountBetween(Short value1, Short value2) {
            addCriterion("DG2_COUNT between", value1, value2, "dg2Count");
            return (Criteria) this;
        }

        public Criteria andDg2CountNotBetween(Short value1, Short value2) {
            addCriterion("DG2_COUNT not between", value1, value2, "dg2Count");
            return (Criteria) this;
        }

        public Criteria andDg3CountIsNull() {
            addCriterion("DG3_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andDg3CountIsNotNull() {
            addCriterion("DG3_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDg3CountEqualTo(Short value) {
            addCriterion("DG3_COUNT =", value, "dg3Count");
            return (Criteria) this;
        }

        public Criteria andDg3CountNotEqualTo(Short value) {
            addCriterion("DG3_COUNT <>", value, "dg3Count");
            return (Criteria) this;
        }

        public Criteria andDg3CountGreaterThan(Short value) {
            addCriterion("DG3_COUNT >", value, "dg3Count");
            return (Criteria) this;
        }

        public Criteria andDg3CountGreaterThanOrEqualTo(Short value) {
            addCriterion("DG3_COUNT >=", value, "dg3Count");
            return (Criteria) this;
        }

        public Criteria andDg3CountLessThan(Short value) {
            addCriterion("DG3_COUNT <", value, "dg3Count");
            return (Criteria) this;
        }

        public Criteria andDg3CountLessThanOrEqualTo(Short value) {
            addCriterion("DG3_COUNT <=", value, "dg3Count");
            return (Criteria) this;
        }

        public Criteria andDg3CountIn(List<Short> values) {
            addCriterion("DG3_COUNT in", values, "dg3Count");
            return (Criteria) this;
        }

        public Criteria andDg3CountNotIn(List<Short> values) {
            addCriterion("DG3_COUNT not in", values, "dg3Count");
            return (Criteria) this;
        }

        public Criteria andDg3CountBetween(Short value1, Short value2) {
            addCriterion("DG3_COUNT between", value1, value2, "dg3Count");
            return (Criteria) this;
        }

        public Criteria andDg3CountNotBetween(Short value1, Short value2) {
            addCriterion("DG3_COUNT not between", value1, value2, "dg3Count");
            return (Criteria) this;
        }

        public Criteria andDg4CountIsNull() {
            addCriterion("DG4_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andDg4CountIsNotNull() {
            addCriterion("DG4_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDg4CountEqualTo(Short value) {
            addCriterion("DG4_COUNT =", value, "dg4Count");
            return (Criteria) this;
        }

        public Criteria andDg4CountNotEqualTo(Short value) {
            addCriterion("DG4_COUNT <>", value, "dg4Count");
            return (Criteria) this;
        }

        public Criteria andDg4CountGreaterThan(Short value) {
            addCriterion("DG4_COUNT >", value, "dg4Count");
            return (Criteria) this;
        }

        public Criteria andDg4CountGreaterThanOrEqualTo(Short value) {
            addCriterion("DG4_COUNT >=", value, "dg4Count");
            return (Criteria) this;
        }

        public Criteria andDg4CountLessThan(Short value) {
            addCriterion("DG4_COUNT <", value, "dg4Count");
            return (Criteria) this;
        }

        public Criteria andDg4CountLessThanOrEqualTo(Short value) {
            addCriterion("DG4_COUNT <=", value, "dg4Count");
            return (Criteria) this;
        }

        public Criteria andDg4CountIn(List<Short> values) {
            addCriterion("DG4_COUNT in", values, "dg4Count");
            return (Criteria) this;
        }

        public Criteria andDg4CountNotIn(List<Short> values) {
            addCriterion("DG4_COUNT not in", values, "dg4Count");
            return (Criteria) this;
        }

        public Criteria andDg4CountBetween(Short value1, Short value2) {
            addCriterion("DG4_COUNT between", value1, value2, "dg4Count");
            return (Criteria) this;
        }

        public Criteria andDg4CountNotBetween(Short value1, Short value2) {
            addCriterion("DG4_COUNT not between", value1, value2, "dg4Count");
            return (Criteria) this;
        }

        public Criteria andVachar1IsNull() {
            addCriterion("VACHAR1 is null");
            return (Criteria) this;
        }

        public Criteria andVachar1IsNotNull() {
            addCriterion("VACHAR1 is not null");
            return (Criteria) this;
        }

        public Criteria andVachar1EqualTo(Short value) {
            addCriterion("VACHAR1 =", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1NotEqualTo(Short value) {
            addCriterion("VACHAR1 <>", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1GreaterThan(Short value) {
            addCriterion("VACHAR1 >", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1GreaterThanOrEqualTo(Short value) {
            addCriterion("VACHAR1 >=", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1LessThan(Short value) {
            addCriterion("VACHAR1 <", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1LessThanOrEqualTo(Short value) {
            addCriterion("VACHAR1 <=", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1In(List<Short> values) {
            addCriterion("VACHAR1 in", values, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1NotIn(List<Short> values) {
            addCriterion("VACHAR1 not in", values, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1Between(Short value1, Short value2) {
            addCriterion("VACHAR1 between", value1, value2, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1NotBetween(Short value1, Short value2) {
            addCriterion("VACHAR1 not between", value1, value2, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar2IsNull() {
            addCriterion("VACHAR2 is null");
            return (Criteria) this;
        }

        public Criteria andVachar2IsNotNull() {
            addCriterion("VACHAR2 is not null");
            return (Criteria) this;
        }

        public Criteria andVachar2EqualTo(Short value) {
            addCriterion("VACHAR2 =", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2NotEqualTo(Short value) {
            addCriterion("VACHAR2 <>", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2GreaterThan(Short value) {
            addCriterion("VACHAR2 >", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2GreaterThanOrEqualTo(Short value) {
            addCriterion("VACHAR2 >=", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2LessThan(Short value) {
            addCriterion("VACHAR2 <", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2LessThanOrEqualTo(Short value) {
            addCriterion("VACHAR2 <=", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2In(List<Short> values) {
            addCriterion("VACHAR2 in", values, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2NotIn(List<Short> values) {
            addCriterion("VACHAR2 not in", values, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2Between(Short value1, Short value2) {
            addCriterion("VACHAR2 between", value1, value2, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2NotBetween(Short value1, Short value2) {
            addCriterion("VACHAR2 not between", value1, value2, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar3IsNull() {
            addCriterion("VACHAR3 is null");
            return (Criteria) this;
        }

        public Criteria andVachar3IsNotNull() {
            addCriterion("VACHAR3 is not null");
            return (Criteria) this;
        }

        public Criteria andVachar3EqualTo(Short value) {
            addCriterion("VACHAR3 =", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3NotEqualTo(Short value) {
            addCriterion("VACHAR3 <>", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3GreaterThan(Short value) {
            addCriterion("VACHAR3 >", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3GreaterThanOrEqualTo(Short value) {
            addCriterion("VACHAR3 >=", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3LessThan(Short value) {
            addCriterion("VACHAR3 <", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3LessThanOrEqualTo(Short value) {
            addCriterion("VACHAR3 <=", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3In(List<Short> values) {
            addCriterion("VACHAR3 in", values, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3NotIn(List<Short> values) {
            addCriterion("VACHAR3 not in", values, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3Between(Short value1, Short value2) {
            addCriterion("VACHAR3 between", value1, value2, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3NotBetween(Short value1, Short value2) {
            addCriterion("VACHAR3 not between", value1, value2, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar4IsNull() {
            addCriterion("VACHAR4 is null");
            return (Criteria) this;
        }

        public Criteria andVachar4IsNotNull() {
            addCriterion("VACHAR4 is not null");
            return (Criteria) this;
        }

        public Criteria andVachar4EqualTo(Short value) {
            addCriterion("VACHAR4 =", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4NotEqualTo(Short value) {
            addCriterion("VACHAR4 <>", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4GreaterThan(Short value) {
            addCriterion("VACHAR4 >", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4GreaterThanOrEqualTo(Short value) {
            addCriterion("VACHAR4 >=", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4LessThan(Short value) {
            addCriterion("VACHAR4 <", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4LessThanOrEqualTo(Short value) {
            addCriterion("VACHAR4 <=", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4In(List<Short> values) {
            addCriterion("VACHAR4 in", values, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4NotIn(List<Short> values) {
            addCriterion("VACHAR4 not in", values, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4Between(Short value1, Short value2) {
            addCriterion("VACHAR4 between", value1, value2, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4NotBetween(Short value1, Short value2) {
            addCriterion("VACHAR4 not between", value1, value2, "vachar4");
            return (Criteria) this;
        }

        public Criteria andQmNbrIsNull() {
            addCriterion("QM_NBR is null");
            return (Criteria) this;
        }

        public Criteria andQmNbrIsNotNull() {
            addCriterion("QM_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andQmNbrEqualTo(String value) {
            addCriterion("QM_NBR =", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrNotEqualTo(String value) {
            addCriterion("QM_NBR <>", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrGreaterThan(String value) {
            addCriterion("QM_NBR >", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrGreaterThanOrEqualTo(String value) {
            addCriterion("QM_NBR >=", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrLessThan(String value) {
            addCriterion("QM_NBR <", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrLessThanOrEqualTo(String value) {
            addCriterion("QM_NBR <=", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrLike(String value) {
            addCriterion("QM_NBR like", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrNotLike(String value) {
            addCriterion("QM_NBR not like", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrIn(List<String> values) {
            addCriterion("QM_NBR in", values, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrNotIn(List<String> values) {
            addCriterion("QM_NBR not in", values, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrBetween(String value1, String value2) {
            addCriterion("QM_NBR between", value1, value2, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrNotBetween(String value1, String value2) {
            addCriterion("QM_NBR not between", value1, value2, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNamIsNull() {
            addCriterion("QM_NAM is null");
            return (Criteria) this;
        }

        public Criteria andQmNamIsNotNull() {
            addCriterion("QM_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andQmNamEqualTo(String value) {
            addCriterion("QM_NAM =", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamNotEqualTo(String value) {
            addCriterion("QM_NAM <>", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamGreaterThan(String value) {
            addCriterion("QM_NAM >", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamGreaterThanOrEqualTo(String value) {
            addCriterion("QM_NAM >=", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamLessThan(String value) {
            addCriterion("QM_NAM <", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamLessThanOrEqualTo(String value) {
            addCriterion("QM_NAM <=", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamLike(String value) {
            addCriterion("QM_NAM like", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamNotLike(String value) {
            addCriterion("QM_NAM not like", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamIn(List<String> values) {
            addCriterion("QM_NAM in", values, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamNotIn(List<String> values) {
            addCriterion("QM_NAM not in", values, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamBetween(String value1, String value2) {
            addCriterion("QM_NAM between", value1, value2, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamNotBetween(String value1, String value2) {
            addCriterion("QM_NAM not between", value1, value2, "qmNam");
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

        public Criteria andCratNbrIsNull() {
            addCriterion("CRAT_NBR is null");
            return (Criteria) this;
        }

        public Criteria andCratNbrIsNotNull() {
            addCriterion("CRAT_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andCratNbrEqualTo(String value) {
            addCriterion("CRAT_NBR =", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotEqualTo(String value) {
            addCriterion("CRAT_NBR <>", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrGreaterThan(String value) {
            addCriterion("CRAT_NBR >", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CRAT_NBR >=", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrLessThan(String value) {
            addCriterion("CRAT_NBR <", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrLessThanOrEqualTo(String value) {
            addCriterion("CRAT_NBR <=", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrLike(String value) {
            addCriterion("CRAT_NBR like", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotLike(String value) {
            addCriterion("CRAT_NBR not like", value, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrIn(List<String> values) {
            addCriterion("CRAT_NBR in", values, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotIn(List<String> values) {
            addCriterion("CRAT_NBR not in", values, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrBetween(String value1, String value2) {
            addCriterion("CRAT_NBR between", value1, value2, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andCratNbrNotBetween(String value1, String value2) {
            addCriterion("CRAT_NBR not between", value1, value2, "cratNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtDatIsNull() {
            addCriterion("UPDT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andUpdtDatIsNotNull() {
            addCriterion("UPDT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtDatEqualTo(Date value) {
            addCriterion("UPDT_DAT =", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatNotEqualTo(Date value) {
            addCriterion("UPDT_DAT <>", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatGreaterThan(Date value) {
            addCriterion("UPDT_DAT >", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT >=", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatLessThan(Date value) {
            addCriterion("UPDT_DAT <", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatLessThanOrEqualTo(Date value) {
            addCriterion("UPDT_DAT <=", value, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatIn(List<Date> values) {
            addCriterion("UPDT_DAT in", values, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatNotIn(List<Date> values) {
            addCriterion("UPDT_DAT not in", values, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatBetween(Date value1, Date value2) {
            addCriterion("UPDT_DAT between", value1, value2, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtDatNotBetween(Date value1, Date value2) {
            addCriterion("UPDT_DAT not between", value1, value2, "updtDat");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrIsNull() {
            addCriterion("UPDT_NBR is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrIsNotNull() {
            addCriterion("UPDT_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrEqualTo(String value) {
            addCriterion("UPDT_NBR =", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotEqualTo(String value) {
            addCriterion("UPDT_NBR <>", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrGreaterThan(String value) {
            addCriterion("UPDT_NBR >", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR >=", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrLessThan(String value) {
            addCriterion("UPDT_NBR <", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrLessThanOrEqualTo(String value) {
            addCriterion("UPDT_NBR <=", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrLike(String value) {
            addCriterion("UPDT_NBR like", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotLike(String value) {
            addCriterion("UPDT_NBR not like", value, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrIn(List<String> values) {
            addCriterion("UPDT_NBR in", values, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotIn(List<String> values) {
            addCriterion("UPDT_NBR not in", values, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrBetween(String value1, String value2) {
            addCriterion("UPDT_NBR between", value1, value2, "updtNbr");
            return (Criteria) this;
        }

        public Criteria andUpdtNbrNotBetween(String value1, String value2) {
            addCriterion("UPDT_NBR not between", value1, value2, "updtNbr");
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