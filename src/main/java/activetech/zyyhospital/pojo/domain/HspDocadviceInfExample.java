package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspDocadviceInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDocadviceInfExample() {
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

        public Criteria andDocadviceSeqIsNull() {
            addCriterion("DOCADVICE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqIsNotNull() {
            addCriterion("DOCADVICE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqEqualTo(String value) {
            addCriterion("DOCADVICE_SEQ =", value, "docadviceSeq");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqNotEqualTo(String value) {
            addCriterion("DOCADVICE_SEQ <>", value, "docadviceSeq");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqGreaterThan(String value) {
            addCriterion("DOCADVICE_SEQ >", value, "docadviceSeq");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_SEQ >=", value, "docadviceSeq");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqLessThan(String value) {
            addCriterion("DOCADVICE_SEQ <", value, "docadviceSeq");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_SEQ <=", value, "docadviceSeq");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqLike(String value) {
            addCriterion("DOCADVICE_SEQ like", value, "docadviceSeq");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqNotLike(String value) {
            addCriterion("DOCADVICE_SEQ not like", value, "docadviceSeq");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqIn(List<String> values) {
            addCriterion("DOCADVICE_SEQ in", values, "docadviceSeq");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqNotIn(List<String> values) {
            addCriterion("DOCADVICE_SEQ not in", values, "docadviceSeq");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqBetween(String value1, String value2) {
            addCriterion("DOCADVICE_SEQ between", value1, value2, "docadviceSeq");
            return (Criteria) this;
        }

        public Criteria andDocadviceSeqNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_SEQ not between", value1, value2, "docadviceSeq");
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

        public Criteria andDocadviceIsdatIsNull() {
            addCriterion("DOCADVICE_ISDAT is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceIsdatIsNotNull() {
            addCriterion("DOCADVICE_ISDAT is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceIsdatEqualTo(Date value) {
            addCriterion("DOCADVICE_ISDAT =", value, "docadviceIsdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceIsdatNotEqualTo(Date value) {
            addCriterion("DOCADVICE_ISDAT <>", value, "docadviceIsdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceIsdatGreaterThan(Date value) {
            addCriterion("DOCADVICE_ISDAT >", value, "docadviceIsdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceIsdatGreaterThanOrEqualTo(Date value) {
            addCriterion("DOCADVICE_ISDAT >=", value, "docadviceIsdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceIsdatLessThan(Date value) {
            addCriterion("DOCADVICE_ISDAT <", value, "docadviceIsdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceIsdatLessThanOrEqualTo(Date value) {
            addCriterion("DOCADVICE_ISDAT <=", value, "docadviceIsdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceIsdatIn(List<Date> values) {
            addCriterion("DOCADVICE_ISDAT in", values, "docadviceIsdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceIsdatNotIn(List<Date> values) {
            addCriterion("DOCADVICE_ISDAT not in", values, "docadviceIsdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceIsdatBetween(Date value1, Date value2) {
            addCriterion("DOCADVICE_ISDAT between", value1, value2, "docadviceIsdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceIsdatNotBetween(Date value1, Date value2) {
            addCriterion("DOCADVICE_ISDAT not between", value1, value2, "docadviceIsdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatIsNull() {
            addCriterion("DOCADVICE_BEDAT is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatIsNotNull() {
            addCriterion("DOCADVICE_BEDAT is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatEqualTo(Date value) {
            addCriterion("DOCADVICE_BEDAT =", value, "docadviceBedat");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatNotEqualTo(Date value) {
            addCriterion("DOCADVICE_BEDAT <>", value, "docadviceBedat");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatGreaterThan(Date value) {
            addCriterion("DOCADVICE_BEDAT >", value, "docadviceBedat");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatGreaterThanOrEqualTo(Date value) {
            addCriterion("DOCADVICE_BEDAT >=", value, "docadviceBedat");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatLessThan(Date value) {
            addCriterion("DOCADVICE_BEDAT <", value, "docadviceBedat");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatLessThanOrEqualTo(Date value) {
            addCriterion("DOCADVICE_BEDAT <=", value, "docadviceBedat");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatIn(List<Date> values) {
            addCriterion("DOCADVICE_BEDAT in", values, "docadviceBedat");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatNotIn(List<Date> values) {
            addCriterion("DOCADVICE_BEDAT not in", values, "docadviceBedat");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatBetween(Date value1, Date value2) {
            addCriterion("DOCADVICE_BEDAT between", value1, value2, "docadviceBedat");
            return (Criteria) this;
        }

        public Criteria andDocadviceBedatNotBetween(Date value1, Date value2) {
            addCriterion("DOCADVICE_BEDAT not between", value1, value2, "docadviceBedat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamIsNull() {
            addCriterion("DOCADVICE_NAM is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamIsNotNull() {
            addCriterion("DOCADVICE_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamEqualTo(String value) {
            addCriterion("DOCADVICE_NAM =", value, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamNotEqualTo(String value) {
            addCriterion("DOCADVICE_NAM <>", value, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamGreaterThan(String value) {
            addCriterion("DOCADVICE_NAM >", value, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_NAM >=", value, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamLessThan(String value) {
            addCriterion("DOCADVICE_NAM <", value, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_NAM <=", value, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamLike(String value) {
            addCriterion("DOCADVICE_NAM like", value, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamNotLike(String value) {
            addCriterion("DOCADVICE_NAM not like", value, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamIn(List<String> values) {
            addCriterion("DOCADVICE_NAM in", values, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamNotIn(List<String> values) {
            addCriterion("DOCADVICE_NAM not in", values, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamBetween(String value1, String value2) {
            addCriterion("DOCADVICE_NAM between", value1, value2, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNamNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_NAM not between", value1, value2, "docadviceNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatIsNull() {
            addCriterion("DOCADVICE_NUIMDAT is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatIsNotNull() {
            addCriterion("DOCADVICE_NUIMDAT is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatEqualTo(Date value) {
            addCriterion("DOCADVICE_NUIMDAT =", value, "docadviceNuimdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatNotEqualTo(Date value) {
            addCriterion("DOCADVICE_NUIMDAT <>", value, "docadviceNuimdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatGreaterThan(Date value) {
            addCriterion("DOCADVICE_NUIMDAT >", value, "docadviceNuimdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatGreaterThanOrEqualTo(Date value) {
            addCriterion("DOCADVICE_NUIMDAT >=", value, "docadviceNuimdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatLessThan(Date value) {
            addCriterion("DOCADVICE_NUIMDAT <", value, "docadviceNuimdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatLessThanOrEqualTo(Date value) {
            addCriterion("DOCADVICE_NUIMDAT <=", value, "docadviceNuimdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatIn(List<Date> values) {
            addCriterion("DOCADVICE_NUIMDAT in", values, "docadviceNuimdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatNotIn(List<Date> values) {
            addCriterion("DOCADVICE_NUIMDAT not in", values, "docadviceNuimdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatBetween(Date value1, Date value2) {
            addCriterion("DOCADVICE_NUIMDAT between", value1, value2, "docadviceNuimdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimdatNotBetween(Date value1, Date value2) {
            addCriterion("DOCADVICE_NUIMDAT not between", value1, value2, "docadviceNuimdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamIsNull() {
            addCriterion("DOCADVICE_NUIMNAM is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamIsNotNull() {
            addCriterion("DOCADVICE_NUIMNAM is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamEqualTo(String value) {
            addCriterion("DOCADVICE_NUIMNAM =", value, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamNotEqualTo(String value) {
            addCriterion("DOCADVICE_NUIMNAM <>", value, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamGreaterThan(String value) {
            addCriterion("DOCADVICE_NUIMNAM >", value, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_NUIMNAM >=", value, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamLessThan(String value) {
            addCriterion("DOCADVICE_NUIMNAM <", value, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_NUIMNAM <=", value, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamLike(String value) {
            addCriterion("DOCADVICE_NUIMNAM like", value, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamNotLike(String value) {
            addCriterion("DOCADVICE_NUIMNAM not like", value, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamIn(List<String> values) {
            addCriterion("DOCADVICE_NUIMNAM in", values, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamNotIn(List<String> values) {
            addCriterion("DOCADVICE_NUIMNAM not in", values, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamBetween(String value1, String value2) {
            addCriterion("DOCADVICE_NUIMNAM between", value1, value2, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnamNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_NUIMNAM not between", value1, value2, "docadviceNuimnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatIsNull() {
            addCriterion("DOCADVICE_DOCSTDAT is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatIsNotNull() {
            addCriterion("DOCADVICE_DOCSTDAT is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatEqualTo(Date value) {
            addCriterion("DOCADVICE_DOCSTDAT =", value, "docadviceDocstdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatNotEqualTo(Date value) {
            addCriterion("DOCADVICE_DOCSTDAT <>", value, "docadviceDocstdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatGreaterThan(Date value) {
            addCriterion("DOCADVICE_DOCSTDAT >", value, "docadviceDocstdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatGreaterThanOrEqualTo(Date value) {
            addCriterion("DOCADVICE_DOCSTDAT >=", value, "docadviceDocstdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatLessThan(Date value) {
            addCriterion("DOCADVICE_DOCSTDAT <", value, "docadviceDocstdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatLessThanOrEqualTo(Date value) {
            addCriterion("DOCADVICE_DOCSTDAT <=", value, "docadviceDocstdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatIn(List<Date> values) {
            addCriterion("DOCADVICE_DOCSTDAT in", values, "docadviceDocstdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatNotIn(List<Date> values) {
            addCriterion("DOCADVICE_DOCSTDAT not in", values, "docadviceDocstdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatBetween(Date value1, Date value2) {
            addCriterion("DOCADVICE_DOCSTDAT between", value1, value2, "docadviceDocstdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstdatNotBetween(Date value1, Date value2) {
            addCriterion("DOCADVICE_DOCSTDAT not between", value1, value2, "docadviceDocstdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamIsNull() {
            addCriterion("DOCADVICE_DOCSTNAM is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamIsNotNull() {
            addCriterion("DOCADVICE_DOCSTNAM is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamEqualTo(String value) {
            addCriterion("DOCADVICE_DOCSTNAM =", value, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamNotEqualTo(String value) {
            addCriterion("DOCADVICE_DOCSTNAM <>", value, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamGreaterThan(String value) {
            addCriterion("DOCADVICE_DOCSTNAM >", value, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_DOCSTNAM >=", value, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamLessThan(String value) {
            addCriterion("DOCADVICE_DOCSTNAM <", value, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_DOCSTNAM <=", value, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamLike(String value) {
            addCriterion("DOCADVICE_DOCSTNAM like", value, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamNotLike(String value) {
            addCriterion("DOCADVICE_DOCSTNAM not like", value, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamIn(List<String> values) {
            addCriterion("DOCADVICE_DOCSTNAM in", values, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamNotIn(List<String> values) {
            addCriterion("DOCADVICE_DOCSTNAM not in", values, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamBetween(String value1, String value2) {
            addCriterion("DOCADVICE_DOCSTNAM between", value1, value2, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceDocstnamNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_DOCSTNAM not between", value1, value2, "docadviceDocstnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatIsNull() {
            addCriterion("DOCADVICE_NUSTDAT is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatIsNotNull() {
            addCriterion("DOCADVICE_NUSTDAT is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatEqualTo(Date value) {
            addCriterion("DOCADVICE_NUSTDAT =", value, "docadviceNustdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatNotEqualTo(Date value) {
            addCriterion("DOCADVICE_NUSTDAT <>", value, "docadviceNustdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatGreaterThan(Date value) {
            addCriterion("DOCADVICE_NUSTDAT >", value, "docadviceNustdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatGreaterThanOrEqualTo(Date value) {
            addCriterion("DOCADVICE_NUSTDAT >=", value, "docadviceNustdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatLessThan(Date value) {
            addCriterion("DOCADVICE_NUSTDAT <", value, "docadviceNustdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatLessThanOrEqualTo(Date value) {
            addCriterion("DOCADVICE_NUSTDAT <=", value, "docadviceNustdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatIn(List<Date> values) {
            addCriterion("DOCADVICE_NUSTDAT in", values, "docadviceNustdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatNotIn(List<Date> values) {
            addCriterion("DOCADVICE_NUSTDAT not in", values, "docadviceNustdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatBetween(Date value1, Date value2) {
            addCriterion("DOCADVICE_NUSTDAT between", value1, value2, "docadviceNustdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustdatNotBetween(Date value1, Date value2) {
            addCriterion("DOCADVICE_NUSTDAT not between", value1, value2, "docadviceNustdat");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamIsNull() {
            addCriterion("DOCADVICE_NUSTNAM is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamIsNotNull() {
            addCriterion("DOCADVICE_NUSTNAM is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamEqualTo(String value) {
            addCriterion("DOCADVICE_NUSTNAM =", value, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamNotEqualTo(String value) {
            addCriterion("DOCADVICE_NUSTNAM <>", value, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamGreaterThan(String value) {
            addCriterion("DOCADVICE_NUSTNAM >", value, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_NUSTNAM >=", value, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamLessThan(String value) {
            addCriterion("DOCADVICE_NUSTNAM <", value, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_NUSTNAM <=", value, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamLike(String value) {
            addCriterion("DOCADVICE_NUSTNAM like", value, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamNotLike(String value) {
            addCriterion("DOCADVICE_NUSTNAM not like", value, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamIn(List<String> values) {
            addCriterion("DOCADVICE_NUSTNAM in", values, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamNotIn(List<String> values) {
            addCriterion("DOCADVICE_NUSTNAM not in", values, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamBetween(String value1, String value2) {
            addCriterion("DOCADVICE_NUSTNAM between", value1, value2, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNustnamNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_NUSTNAM not between", value1, value2, "docadviceNustnam");
            return (Criteria) this;
        }

        public Criteria andCreateDatIsNull() {
            addCriterion("CREATE_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatIsNotNull() {
            addCriterion("CREATE_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatEqualTo(Date value) {
            addCriterion("CREATE_DAT =", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatNotEqualTo(Date value) {
            addCriterion("CREATE_DAT <>", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatGreaterThan(Date value) {
            addCriterion("CREATE_DAT >", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DAT >=", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatLessThan(Date value) {
            addCriterion("CREATE_DAT <", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DAT <=", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatIn(List<Date> values) {
            addCriterion("CREATE_DAT in", values, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatNotIn(List<Date> values) {
            addCriterion("CREATE_DAT not in", values, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatBetween(Date value1, Date value2) {
            addCriterion("CREATE_DAT between", value1, value2, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DAT not between", value1, value2, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateNumIsNull() {
            addCriterion("CREATE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCreateNumIsNotNull() {
            addCriterion("CREATE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNumEqualTo(String value) {
            addCriterion("CREATE_NUM =", value, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNumNotEqualTo(String value) {
            addCriterion("CREATE_NUM <>", value, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNumGreaterThan(String value) {
            addCriterion("CREATE_NUM >", value, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNumGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_NUM >=", value, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNumLessThan(String value) {
            addCriterion("CREATE_NUM <", value, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNumLessThanOrEqualTo(String value) {
            addCriterion("CREATE_NUM <=", value, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNumLike(String value) {
            addCriterion("CREATE_NUM like", value, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNumNotLike(String value) {
            addCriterion("CREATE_NUM not like", value, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNumIn(List<String> values) {
            addCriterion("CREATE_NUM in", values, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNumNotIn(List<String> values) {
            addCriterion("CREATE_NUM not in", values, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNumBetween(String value1, String value2) {
            addCriterion("CREATE_NUM between", value1, value2, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNumNotBetween(String value1, String value2) {
            addCriterion("CREATE_NUM not between", value1, value2, "createNum");
            return (Criteria) this;
        }

        public Criteria andCreateNamIsNull() {
            addCriterion("CREATE_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCreateNamIsNotNull() {
            addCriterion("CREATE_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNamEqualTo(String value) {
            addCriterion("CREATE_NAM =", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotEqualTo(String value) {
            addCriterion("CREATE_NAM <>", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamGreaterThan(String value) {
            addCriterion("CREATE_NAM >", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_NAM >=", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamLessThan(String value) {
            addCriterion("CREATE_NAM <", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamLessThanOrEqualTo(String value) {
            addCriterion("CREATE_NAM <=", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamLike(String value) {
            addCriterion("CREATE_NAM like", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotLike(String value) {
            addCriterion("CREATE_NAM not like", value, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamIn(List<String> values) {
            addCriterion("CREATE_NAM in", values, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotIn(List<String> values) {
            addCriterion("CREATE_NAM not in", values, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamBetween(String value1, String value2) {
            addCriterion("CREATE_NAM between", value1, value2, "createNam");
            return (Criteria) this;
        }

        public Criteria andCreateNamNotBetween(String value1, String value2) {
            addCriterion("CREATE_NAM not between", value1, value2, "createNam");
            return (Criteria) this;
        }

        public Criteria andUpdateDatIsNull() {
            addCriterion("UPDATE_DAT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatIsNotNull() {
            addCriterion("UPDATE_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatEqualTo(Date value) {
            addCriterion("UPDATE_DAT =", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatNotEqualTo(Date value) {
            addCriterion("UPDATE_DAT <>", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatGreaterThan(Date value) {
            addCriterion("UPDATE_DAT >", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DAT >=", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatLessThan(Date value) {
            addCriterion("UPDATE_DAT <", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DAT <=", value, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatIn(List<Date> values) {
            addCriterion("UPDATE_DAT in", values, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatNotIn(List<Date> values) {
            addCriterion("UPDATE_DAT not in", values, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DAT between", value1, value2, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateDatNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DAT not between", value1, value2, "updateDat");
            return (Criteria) this;
        }

        public Criteria andUpdateNumIsNull() {
            addCriterion("UPDATE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNumIsNotNull() {
            addCriterion("UPDATE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNumEqualTo(String value) {
            addCriterion("UPDATE_NUM =", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumNotEqualTo(String value) {
            addCriterion("UPDATE_NUM <>", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumGreaterThan(String value) {
            addCriterion("UPDATE_NUM >", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_NUM >=", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumLessThan(String value) {
            addCriterion("UPDATE_NUM <", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_NUM <=", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumLike(String value) {
            addCriterion("UPDATE_NUM like", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumNotLike(String value) {
            addCriterion("UPDATE_NUM not like", value, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumIn(List<String> values) {
            addCriterion("UPDATE_NUM in", values, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumNotIn(List<String> values) {
            addCriterion("UPDATE_NUM not in", values, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumBetween(String value1, String value2) {
            addCriterion("UPDATE_NUM between", value1, value2, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNumNotBetween(String value1, String value2) {
            addCriterion("UPDATE_NUM not between", value1, value2, "updateNum");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIsNull() {
            addCriterion("UPDATE_NAM is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIsNotNull() {
            addCriterion("UPDATE_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNamEqualTo(String value) {
            addCriterion("UPDATE_NAM =", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotEqualTo(String value) {
            addCriterion("UPDATE_NAM <>", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamGreaterThan(String value) {
            addCriterion("UPDATE_NAM >", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAM >=", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLessThan(String value) {
            addCriterion("UPDATE_NAM <", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAM <=", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamLike(String value) {
            addCriterion("UPDATE_NAM like", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotLike(String value) {
            addCriterion("UPDATE_NAM not like", value, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamIn(List<String> values) {
            addCriterion("UPDATE_NAM in", values, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotIn(List<String> values) {
            addCriterion("UPDATE_NAM not in", values, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamBetween(String value1, String value2) {
            addCriterion("UPDATE_NAM between", value1, value2, "updateNam");
            return (Criteria) this;
        }

        public Criteria andUpdateNamNotBetween(String value1, String value2) {
            addCriterion("UPDATE_NAM not between", value1, value2, "updateNam");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayIsNull() {
            addCriterion("DOCADVICE_WAY is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayIsNotNull() {
            addCriterion("DOCADVICE_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayEqualTo(String value) {
            addCriterion("DOCADVICE_WAY =", value, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayNotEqualTo(String value) {
            addCriterion("DOCADVICE_WAY <>", value, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayGreaterThan(String value) {
            addCriterion("DOCADVICE_WAY >", value, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_WAY >=", value, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayLessThan(String value) {
            addCriterion("DOCADVICE_WAY <", value, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_WAY <=", value, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayLike(String value) {
            addCriterion("DOCADVICE_WAY like", value, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayNotLike(String value) {
            addCriterion("DOCADVICE_WAY not like", value, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayIn(List<String> values) {
            addCriterion("DOCADVICE_WAY in", values, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayNotIn(List<String> values) {
            addCriterion("DOCADVICE_WAY not in", values, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayBetween(String value1, String value2) {
            addCriterion("DOCADVICE_WAY between", value1, value2, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceWayNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_WAY not between", value1, value2, "docadviceWay");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeIsNull() {
            addCriterion("DOCADVICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeIsNotNull() {
            addCriterion("DOCADVICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeEqualTo(String value) {
            addCriterion("DOCADVICE_TYPE =", value, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeNotEqualTo(String value) {
            addCriterion("DOCADVICE_TYPE <>", value, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeGreaterThan(String value) {
            addCriterion("DOCADVICE_TYPE >", value, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_TYPE >=", value, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeLessThan(String value) {
            addCriterion("DOCADVICE_TYPE <", value, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_TYPE <=", value, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeLike(String value) {
            addCriterion("DOCADVICE_TYPE like", value, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeNotLike(String value) {
            addCriterion("DOCADVICE_TYPE not like", value, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeIn(List<String> values) {
            addCriterion("DOCADVICE_TYPE in", values, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeNotIn(List<String> values) {
            addCriterion("DOCADVICE_TYPE not in", values, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeBetween(String value1, String value2) {
            addCriterion("DOCADVICE_TYPE between", value1, value2, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceTypeNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_TYPE not between", value1, value2, "docadviceType");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagIsNull() {
            addCriterion("DOCADVICE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagIsNotNull() {
            addCriterion("DOCADVICE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagEqualTo(String value) {
            addCriterion("DOCADVICE_FLAG =", value, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagNotEqualTo(String value) {
            addCriterion("DOCADVICE_FLAG <>", value, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagGreaterThan(String value) {
            addCriterion("DOCADVICE_FLAG >", value, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_FLAG >=", value, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagLessThan(String value) {
            addCriterion("DOCADVICE_FLAG <", value, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_FLAG <=", value, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagLike(String value) {
            addCriterion("DOCADVICE_FLAG like", value, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagNotLike(String value) {
            addCriterion("DOCADVICE_FLAG not like", value, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagIn(List<String> values) {
            addCriterion("DOCADVICE_FLAG in", values, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagNotIn(List<String> values) {
            addCriterion("DOCADVICE_FLAG not in", values, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagBetween(String value1, String value2) {
            addCriterion("DOCADVICE_FLAG between", value1, value2, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceFlagNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_FLAG not between", value1, value2, "docadviceFlag");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlIsNull() {
            addCriterion("DOCADVICE_YYJL is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlIsNotNull() {
            addCriterion("DOCADVICE_YYJL is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlEqualTo(String value) {
            addCriterion("DOCADVICE_YYJL =", value, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlNotEqualTo(String value) {
            addCriterion("DOCADVICE_YYJL <>", value, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlGreaterThan(String value) {
            addCriterion("DOCADVICE_YYJL >", value, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_YYJL >=", value, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlLessThan(String value) {
            addCriterion("DOCADVICE_YYJL <", value, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_YYJL <=", value, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlLike(String value) {
            addCriterion("DOCADVICE_YYJL like", value, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlNotLike(String value) {
            addCriterion("DOCADVICE_YYJL not like", value, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlIn(List<String> values) {
            addCriterion("DOCADVICE_YYJL in", values, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlNotIn(List<String> values) {
            addCriterion("DOCADVICE_YYJL not in", values, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlBetween(String value1, String value2) {
            addCriterion("DOCADVICE_YYJL between", value1, value2, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceYyjlNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_YYJL not between", value1, value2, "docadviceYyjl");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzIsNull() {
            addCriterion("DOCADVICE_BZ is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzIsNotNull() {
            addCriterion("DOCADVICE_BZ is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzEqualTo(String value) {
            addCriterion("DOCADVICE_BZ =", value, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzNotEqualTo(String value) {
            addCriterion("DOCADVICE_BZ <>", value, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzGreaterThan(String value) {
            addCriterion("DOCADVICE_BZ >", value, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_BZ >=", value, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzLessThan(String value) {
            addCriterion("DOCADVICE_BZ <", value, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_BZ <=", value, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzLike(String value) {
            addCriterion("DOCADVICE_BZ like", value, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzNotLike(String value) {
            addCriterion("DOCADVICE_BZ not like", value, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzIn(List<String> values) {
            addCriterion("DOCADVICE_BZ in", values, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzNotIn(List<String> values) {
            addCriterion("DOCADVICE_BZ not in", values, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzBetween(String value1, String value2) {
            addCriterion("DOCADVICE_BZ between", value1, value2, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceBzNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_BZ not between", value1, value2, "docadviceBz");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgIsNull() {
            addCriterion("DOCADVICE_MAINFLG is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgIsNotNull() {
            addCriterion("DOCADVICE_MAINFLG is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgEqualTo(String value) {
            addCriterion("DOCADVICE_MAINFLG =", value, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgNotEqualTo(String value) {
            addCriterion("DOCADVICE_MAINFLG <>", value, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgGreaterThan(String value) {
            addCriterion("DOCADVICE_MAINFLG >", value, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_MAINFLG >=", value, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgLessThan(String value) {
            addCriterion("DOCADVICE_MAINFLG <", value, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_MAINFLG <=", value, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgLike(String value) {
            addCriterion("DOCADVICE_MAINFLG like", value, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgNotLike(String value) {
            addCriterion("DOCADVICE_MAINFLG not like", value, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgIn(List<String> values) {
            addCriterion("DOCADVICE_MAINFLG in", values, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgNotIn(List<String> values) {
            addCriterion("DOCADVICE_MAINFLG not in", values, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgBetween(String value1, String value2) {
            addCriterion("DOCADVICE_MAINFLG between", value1, value2, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andDocadviceMainflgNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_MAINFLG not between", value1, value2, "docadviceMainflg");
            return (Criteria) this;
        }

        public Criteria andPxIsNull() {
            addCriterion("PX is null");
            return (Criteria) this;
        }

        public Criteria andPxIsNotNull() {
            addCriterion("PX is not null");
            return (Criteria) this;
        }

        public Criteria andPxEqualTo(String value) {
            addCriterion("PX =", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxNotEqualTo(String value) {
            addCriterion("PX <>", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxGreaterThan(String value) {
            addCriterion("PX >", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxGreaterThanOrEqualTo(String value) {
            addCriterion("PX >=", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxLessThan(String value) {
            addCriterion("PX <", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxLessThanOrEqualTo(String value) {
            addCriterion("PX <=", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxLike(String value) {
            addCriterion("PX like", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxNotLike(String value) {
            addCriterion("PX not like", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxIn(List<String> values) {
            addCriterion("PX in", values, "px");
            return (Criteria) this;
        }

        public Criteria andPxNotIn(List<String> values) {
            addCriterion("PX not in", values, "px");
            return (Criteria) this;
        }

        public Criteria andPxBetween(String value1, String value2) {
            addCriterion("PX between", value1, value2, "px");
            return (Criteria) this;
        }

        public Criteria andPxNotBetween(String value1, String value2) {
            addCriterion("PX not between", value1, value2, "px");
            return (Criteria) this;
        }

        public Criteria andGyfsmcIsNull() {
            addCriterion("GYFSMC is null");
            return (Criteria) this;
        }

        public Criteria andGyfsmcIsNotNull() {
            addCriterion("GYFSMC is not null");
            return (Criteria) this;
        }

        public Criteria andGyfsmcEqualTo(String value) {
            addCriterion("GYFSMC =", value, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andGyfsmcNotEqualTo(String value) {
            addCriterion("GYFSMC <>", value, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andGyfsmcGreaterThan(String value) {
            addCriterion("GYFSMC >", value, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andGyfsmcGreaterThanOrEqualTo(String value) {
            addCriterion("GYFSMC >=", value, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andGyfsmcLessThan(String value) {
            addCriterion("GYFSMC <", value, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andGyfsmcLessThanOrEqualTo(String value) {
            addCriterion("GYFSMC <=", value, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andGyfsmcLike(String value) {
            addCriterion("GYFSMC like", value, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andGyfsmcNotLike(String value) {
            addCriterion("GYFSMC not like", value, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andGyfsmcIn(List<String> values) {
            addCriterion("GYFSMC in", values, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andGyfsmcNotIn(List<String> values) {
            addCriterion("GYFSMC not in", values, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andGyfsmcBetween(String value1, String value2) {
            addCriterion("GYFSMC between", value1, value2, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andGyfsmcNotBetween(String value1, String value2) {
            addCriterion("GYFSMC not between", value1, value2, "gyfsmc");
            return (Criteria) this;
        }

        public Criteria andSlIsNull() {
            addCriterion("SL is null");
            return (Criteria) this;
        }

        public Criteria andSlIsNotNull() {
            addCriterion("SL is not null");
            return (Criteria) this;
        }

        public Criteria andSlEqualTo(String value) {
            addCriterion("SL =", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotEqualTo(String value) {
            addCriterion("SL <>", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThan(String value) {
            addCriterion("SL >", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThanOrEqualTo(String value) {
            addCriterion("SL >=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThan(String value) {
            addCriterion("SL <", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThanOrEqualTo(String value) {
            addCriterion("SL <=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLike(String value) {
            addCriterion("SL like", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotLike(String value) {
            addCriterion("SL not like", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlIn(List<String> values) {
            addCriterion("SL in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotIn(List<String> values) {
            addCriterion("SL not in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlBetween(String value1, String value2) {
            addCriterion("SL between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotBetween(String value1, String value2) {
            addCriterion("SL not between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusIsNull() {
            addCriterion("DOCADVICE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusIsNotNull() {
            addCriterion("DOCADVICE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusEqualTo(String value) {
            addCriterion("DOCADVICE_STATUS =", value, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusNotEqualTo(String value) {
            addCriterion("DOCADVICE_STATUS <>", value, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusGreaterThan(String value) {
            addCriterion("DOCADVICE_STATUS >", value, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_STATUS >=", value, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusLessThan(String value) {
            addCriterion("DOCADVICE_STATUS <", value, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_STATUS <=", value, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusLike(String value) {
            addCriterion("DOCADVICE_STATUS like", value, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusNotLike(String value) {
            addCriterion("DOCADVICE_STATUS not like", value, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusIn(List<String> values) {
            addCriterion("DOCADVICE_STATUS in", values, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusNotIn(List<String> values) {
            addCriterion("DOCADVICE_STATUS not in", values, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusBetween(String value1, String value2) {
            addCriterion("DOCADVICE_STATUS between", value1, value2, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceStatusNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_STATUS not between", value1, value2, "docadviceStatus");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamIsNull() {
            addCriterion("DOCADVICE_CHECKNAM is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamIsNotNull() {
            addCriterion("DOCADVICE_CHECKNAM is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamEqualTo(String value) {
            addCriterion("DOCADVICE_CHECKNAM =", value, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamNotEqualTo(String value) {
            addCriterion("DOCADVICE_CHECKNAM <>", value, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamGreaterThan(String value) {
            addCriterion("DOCADVICE_CHECKNAM >", value, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamGreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_CHECKNAM >=", value, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamLessThan(String value) {
            addCriterion("DOCADVICE_CHECKNAM <", value, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamLessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_CHECKNAM <=", value, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamLike(String value) {
            addCriterion("DOCADVICE_CHECKNAM like", value, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamNotLike(String value) {
            addCriterion("DOCADVICE_CHECKNAM not like", value, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamIn(List<String> values) {
            addCriterion("DOCADVICE_CHECKNAM in", values, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamNotIn(List<String> values) {
            addCriterion("DOCADVICE_CHECKNAM not in", values, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamBetween(String value1, String value2) {
            addCriterion("DOCADVICE_CHECKNAM between", value1, value2, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceChecknamNotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_CHECKNAM not between", value1, value2, "docadviceChecknam");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2IsNull() {
            addCriterion("DOCADVICE_NUIMNAM2 is null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2IsNotNull() {
            addCriterion("DOCADVICE_NUIMNAM2 is not null");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2EqualTo(String value) {
            addCriterion("DOCADVICE_NUIMNAM2 =", value, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2NotEqualTo(String value) {
            addCriterion("DOCADVICE_NUIMNAM2 <>", value, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2GreaterThan(String value) {
            addCriterion("DOCADVICE_NUIMNAM2 >", value, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2GreaterThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_NUIMNAM2 >=", value, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2LessThan(String value) {
            addCriterion("DOCADVICE_NUIMNAM2 <", value, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2LessThanOrEqualTo(String value) {
            addCriterion("DOCADVICE_NUIMNAM2 <=", value, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2Like(String value) {
            addCriterion("DOCADVICE_NUIMNAM2 like", value, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2NotLike(String value) {
            addCriterion("DOCADVICE_NUIMNAM2 not like", value, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2In(List<String> values) {
            addCriterion("DOCADVICE_NUIMNAM2 in", values, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2NotIn(List<String> values) {
            addCriterion("DOCADVICE_NUIMNAM2 not in", values, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2Between(String value1, String value2) {
            addCriterion("DOCADVICE_NUIMNAM2 between", value1, value2, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andDocadviceNuimnam2NotBetween(String value1, String value2) {
            addCriterion("DOCADVICE_NUIMNAM2 not between", value1, value2, "docadviceNuimnam2");
            return (Criteria) this;
        }

        public Criteria andIsprintIsNull() {
            addCriterion("ISPRINT is null");
            return (Criteria) this;
        }

        public Criteria andIsprintIsNotNull() {
            addCriterion("ISPRINT is not null");
            return (Criteria) this;
        }

        public Criteria andIsprintEqualTo(String value) {
            addCriterion("ISPRINT =", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotEqualTo(String value) {
            addCriterion("ISPRINT <>", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintGreaterThan(String value) {
            addCriterion("ISPRINT >", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintGreaterThanOrEqualTo(String value) {
            addCriterion("ISPRINT >=", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLessThan(String value) {
            addCriterion("ISPRINT <", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLessThanOrEqualTo(String value) {
            addCriterion("ISPRINT <=", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintLike(String value) {
            addCriterion("ISPRINT like", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotLike(String value) {
            addCriterion("ISPRINT not like", value, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintIn(List<String> values) {
            addCriterion("ISPRINT in", values, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotIn(List<String> values) {
            addCriterion("ISPRINT not in", values, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintBetween(String value1, String value2) {
            addCriterion("ISPRINT between", value1, value2, "isprint");
            return (Criteria) this;
        }

        public Criteria andIsprintNotBetween(String value1, String value2) {
            addCriterion("ISPRINT not between", value1, value2, "isprint");
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