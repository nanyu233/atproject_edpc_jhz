package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspModelcontInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspModelcontInfExample() {
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

        public Criteria andModelcontSeqIsNull() {
            addCriterion("MODELCONT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqIsNotNull() {
            addCriterion("MODELCONT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqEqualTo(String value) {
            addCriterion("MODELCONT_SEQ =", value, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqNotEqualTo(String value) {
            addCriterion("MODELCONT_SEQ <>", value, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqGreaterThan(String value) {
            addCriterion("MODELCONT_SEQ >", value, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqGreaterThanOrEqualTo(String value) {
            addCriterion("MODELCONT_SEQ >=", value, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqLessThan(String value) {
            addCriterion("MODELCONT_SEQ <", value, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqLessThanOrEqualTo(String value) {
            addCriterion("MODELCONT_SEQ <=", value, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqLike(String value) {
            addCriterion("MODELCONT_SEQ like", value, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqNotLike(String value) {
            addCriterion("MODELCONT_SEQ not like", value, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqIn(List<String> values) {
            addCriterion("MODELCONT_SEQ in", values, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqNotIn(List<String> values) {
            addCriterion("MODELCONT_SEQ not in", values, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqBetween(String value1, String value2) {
            addCriterion("MODELCONT_SEQ between", value1, value2, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelcontSeqNotBetween(String value1, String value2) {
            addCriterion("MODELCONT_SEQ not between", value1, value2, "modelcontSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqIsNull() {
            addCriterion("MODEL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andModelSeqIsNotNull() {
            addCriterion("MODEL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andModelSeqEqualTo(String value) {
            addCriterion("MODEL_SEQ =", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqNotEqualTo(String value) {
            addCriterion("MODEL_SEQ <>", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqGreaterThan(String value) {
            addCriterion("MODEL_SEQ >", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_SEQ >=", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqLessThan(String value) {
            addCriterion("MODEL_SEQ <", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqLessThanOrEqualTo(String value) {
            addCriterion("MODEL_SEQ <=", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqLike(String value) {
            addCriterion("MODEL_SEQ like", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqNotLike(String value) {
            addCriterion("MODEL_SEQ not like", value, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqIn(List<String> values) {
            addCriterion("MODEL_SEQ in", values, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqNotIn(List<String> values) {
            addCriterion("MODEL_SEQ not in", values, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqBetween(String value1, String value2) {
            addCriterion("MODEL_SEQ between", value1, value2, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andModelSeqNotBetween(String value1, String value2) {
            addCriterion("MODEL_SEQ not between", value1, value2, "modelSeq");
            return (Criteria) this;
        }

        public Criteria andMajorClsIsNull() {
            addCriterion("MAJOR_CLS is null");
            return (Criteria) this;
        }

        public Criteria andMajorClsIsNotNull() {
            addCriterion("MAJOR_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andMajorClsEqualTo(String value) {
            addCriterion("MAJOR_CLS =", value, "majorCls");
            return (Criteria) this;
        }

        public Criteria andMajorClsNotEqualTo(String value) {
            addCriterion("MAJOR_CLS <>", value, "majorCls");
            return (Criteria) this;
        }

        public Criteria andMajorClsGreaterThan(String value) {
            addCriterion("MAJOR_CLS >", value, "majorCls");
            return (Criteria) this;
        }

        public Criteria andMajorClsGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR_CLS >=", value, "majorCls");
            return (Criteria) this;
        }

        public Criteria andMajorClsLessThan(String value) {
            addCriterion("MAJOR_CLS <", value, "majorCls");
            return (Criteria) this;
        }

        public Criteria andMajorClsLessThanOrEqualTo(String value) {
            addCriterion("MAJOR_CLS <=", value, "majorCls");
            return (Criteria) this;
        }

        public Criteria andMajorClsLike(String value) {
            addCriterion("MAJOR_CLS like", value, "majorCls");
            return (Criteria) this;
        }

        public Criteria andMajorClsNotLike(String value) {
            addCriterion("MAJOR_CLS not like", value, "majorCls");
            return (Criteria) this;
        }

        public Criteria andMajorClsIn(List<String> values) {
            addCriterion("MAJOR_CLS in", values, "majorCls");
            return (Criteria) this;
        }

        public Criteria andMajorClsNotIn(List<String> values) {
            addCriterion("MAJOR_CLS not in", values, "majorCls");
            return (Criteria) this;
        }

        public Criteria andMajorClsBetween(String value1, String value2) {
            addCriterion("MAJOR_CLS between", value1, value2, "majorCls");
            return (Criteria) this;
        }

        public Criteria andMajorClsNotBetween(String value1, String value2) {
            addCriterion("MAJOR_CLS not between", value1, value2, "majorCls");
            return (Criteria) this;
        }

        public Criteria andSubClsIsNull() {
            addCriterion("SUB_CLS is null");
            return (Criteria) this;
        }

        public Criteria andSubClsIsNotNull() {
            addCriterion("SUB_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andSubClsEqualTo(String value) {
            addCriterion("SUB_CLS =", value, "subCls");
            return (Criteria) this;
        }

        public Criteria andSubClsNotEqualTo(String value) {
            addCriterion("SUB_CLS <>", value, "subCls");
            return (Criteria) this;
        }

        public Criteria andSubClsGreaterThan(String value) {
            addCriterion("SUB_CLS >", value, "subCls");
            return (Criteria) this;
        }

        public Criteria andSubClsGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_CLS >=", value, "subCls");
            return (Criteria) this;
        }

        public Criteria andSubClsLessThan(String value) {
            addCriterion("SUB_CLS <", value, "subCls");
            return (Criteria) this;
        }

        public Criteria andSubClsLessThanOrEqualTo(String value) {
            addCriterion("SUB_CLS <=", value, "subCls");
            return (Criteria) this;
        }

        public Criteria andSubClsLike(String value) {
            addCriterion("SUB_CLS like", value, "subCls");
            return (Criteria) this;
        }

        public Criteria andSubClsNotLike(String value) {
            addCriterion("SUB_CLS not like", value, "subCls");
            return (Criteria) this;
        }

        public Criteria andSubClsIn(List<String> values) {
            addCriterion("SUB_CLS in", values, "subCls");
            return (Criteria) this;
        }

        public Criteria andSubClsNotIn(List<String> values) {
            addCriterion("SUB_CLS not in", values, "subCls");
            return (Criteria) this;
        }

        public Criteria andSubClsBetween(String value1, String value2) {
            addCriterion("SUB_CLS between", value1, value2, "subCls");
            return (Criteria) this;
        }

        public Criteria andSubClsNotBetween(String value1, String value2) {
            addCriterion("SUB_CLS not between", value1, value2, "subCls");
            return (Criteria) this;
        }

        public Criteria andClsContIsNull() {
            addCriterion("CLS_CONT is null");
            return (Criteria) this;
        }

        public Criteria andClsContIsNotNull() {
            addCriterion("CLS_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andClsContEqualTo(String value) {
            addCriterion("CLS_CONT =", value, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsContNotEqualTo(String value) {
            addCriterion("CLS_CONT <>", value, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsContGreaterThan(String value) {
            addCriterion("CLS_CONT >", value, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsContGreaterThanOrEqualTo(String value) {
            addCriterion("CLS_CONT >=", value, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsContLessThan(String value) {
            addCriterion("CLS_CONT <", value, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsContLessThanOrEqualTo(String value) {
            addCriterion("CLS_CONT <=", value, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsContLike(String value) {
            addCriterion("CLS_CONT like", value, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsContNotLike(String value) {
            addCriterion("CLS_CONT not like", value, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsContIn(List<String> values) {
            addCriterion("CLS_CONT in", values, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsContNotIn(List<String> values) {
            addCriterion("CLS_CONT not in", values, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsContBetween(String value1, String value2) {
            addCriterion("CLS_CONT between", value1, value2, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsContNotBetween(String value1, String value2) {
            addCriterion("CLS_CONT not between", value1, value2, "clsCont");
            return (Criteria) this;
        }

        public Criteria andClsSortIsNull() {
            addCriterion("CLS_SORT is null");
            return (Criteria) this;
        }

        public Criteria andClsSortIsNotNull() {
            addCriterion("CLS_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andClsSortEqualTo(BigDecimal value) {
            addCriterion("CLS_SORT =", value, "clsSort");
            return (Criteria) this;
        }

        public Criteria andClsSortNotEqualTo(BigDecimal value) {
            addCriterion("CLS_SORT <>", value, "clsSort");
            return (Criteria) this;
        }

        public Criteria andClsSortGreaterThan(BigDecimal value) {
            addCriterion("CLS_SORT >", value, "clsSort");
            return (Criteria) this;
        }

        public Criteria andClsSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLS_SORT >=", value, "clsSort");
            return (Criteria) this;
        }

        public Criteria andClsSortLessThan(BigDecimal value) {
            addCriterion("CLS_SORT <", value, "clsSort");
            return (Criteria) this;
        }

        public Criteria andClsSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLS_SORT <=", value, "clsSort");
            return (Criteria) this;
        }

        public Criteria andClsSortIn(List<BigDecimal> values) {
            addCriterion("CLS_SORT in", values, "clsSort");
            return (Criteria) this;
        }

        public Criteria andClsSortNotIn(List<BigDecimal> values) {
            addCriterion("CLS_SORT not in", values, "clsSort");
            return (Criteria) this;
        }

        public Criteria andClsSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLS_SORT between", value1, value2, "clsSort");
            return (Criteria) this;
        }

        public Criteria andClsSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLS_SORT not between", value1, value2, "clsSort");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andCrtNbrIsNull() {
            addCriterion("CRT_NBR is null");
            return (Criteria) this;
        }

        public Criteria andCrtNbrIsNotNull() {
            addCriterion("CRT_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNbrEqualTo(String value) {
            addCriterion("CRT_NBR =", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrNotEqualTo(String value) {
            addCriterion("CRT_NBR <>", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrGreaterThan(String value) {
            addCriterion("CRT_NBR >", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NBR >=", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrLessThan(String value) {
            addCriterion("CRT_NBR <", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrLessThanOrEqualTo(String value) {
            addCriterion("CRT_NBR <=", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrLike(String value) {
            addCriterion("CRT_NBR like", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrNotLike(String value) {
            addCriterion("CRT_NBR not like", value, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrIn(List<String> values) {
            addCriterion("CRT_NBR in", values, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrNotIn(List<String> values) {
            addCriterion("CRT_NBR not in", values, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrBetween(String value1, String value2) {
            addCriterion("CRT_NBR between", value1, value2, "crtNbr");
            return (Criteria) this;
        }

        public Criteria andCrtNbrNotBetween(String value1, String value2) {
            addCriterion("CRT_NBR not between", value1, value2, "crtNbr");
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

        public Criteria andUpdNbrIsNull() {
            addCriterion("UPD_NBR is null");
            return (Criteria) this;
        }

        public Criteria andUpdNbrIsNotNull() {
            addCriterion("UPD_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andUpdNbrEqualTo(String value) {
            addCriterion("UPD_NBR =", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrNotEqualTo(String value) {
            addCriterion("UPD_NBR <>", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrGreaterThan(String value) {
            addCriterion("UPD_NBR >", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_NBR >=", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrLessThan(String value) {
            addCriterion("UPD_NBR <", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrLessThanOrEqualTo(String value) {
            addCriterion("UPD_NBR <=", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrLike(String value) {
            addCriterion("UPD_NBR like", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrNotLike(String value) {
            addCriterion("UPD_NBR not like", value, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrIn(List<String> values) {
            addCriterion("UPD_NBR in", values, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrNotIn(List<String> values) {
            addCriterion("UPD_NBR not in", values, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrBetween(String value1, String value2) {
            addCriterion("UPD_NBR between", value1, value2, "updNbr");
            return (Criteria) this;
        }

        public Criteria andUpdNbrNotBetween(String value1, String value2) {
            addCriterion("UPD_NBR not between", value1, value2, "updNbr");
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