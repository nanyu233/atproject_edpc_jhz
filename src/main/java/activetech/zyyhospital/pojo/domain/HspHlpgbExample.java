package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspHlpgbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspHlpgbExample() {
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

        public Criteria andOprDatIsNull() {
            addCriterion("OPR_DAT is null");
            return (Criteria) this;
        }

        public Criteria andOprDatIsNotNull() {
            addCriterion("OPR_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andOprDatEqualTo(Date value) {
            addCriterion("OPR_DAT =", value, "oprDat");
            return (Criteria) this;
        }

        public Criteria andOprDatNotEqualTo(Date value) {
            addCriterion("OPR_DAT <>", value, "oprDat");
            return (Criteria) this;
        }

        public Criteria andOprDatGreaterThan(Date value) {
            addCriterion("OPR_DAT >", value, "oprDat");
            return (Criteria) this;
        }

        public Criteria andOprDatGreaterThanOrEqualTo(Date value) {
            addCriterion("OPR_DAT >=", value, "oprDat");
            return (Criteria) this;
        }

        public Criteria andOprDatLessThan(Date value) {
            addCriterion("OPR_DAT <", value, "oprDat");
            return (Criteria) this;
        }

        public Criteria andOprDatLessThanOrEqualTo(Date value) {
            addCriterion("OPR_DAT <=", value, "oprDat");
            return (Criteria) this;
        }

        public Criteria andOprDatIn(List<Date> values) {
            addCriterion("OPR_DAT in", values, "oprDat");
            return (Criteria) this;
        }

        public Criteria andOprDatNotIn(List<Date> values) {
            addCriterion("OPR_DAT not in", values, "oprDat");
            return (Criteria) this;
        }

        public Criteria andOprDatBetween(Date value1, Date value2) {
            addCriterion("OPR_DAT between", value1, value2, "oprDat");
            return (Criteria) this;
        }

        public Criteria andOprDatNotBetween(Date value1, Date value2) {
            addCriterion("OPR_DAT not between", value1, value2, "oprDat");
            return (Criteria) this;
        }

        public Criteria andPbgNbrIsNull() {
            addCriterion("PBG_NBR is null");
            return (Criteria) this;
        }

        public Criteria andPbgNbrIsNotNull() {
            addCriterion("PBG_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andPbgNbrEqualTo(String value) {
            addCriterion("PBG_NBR =", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrNotEqualTo(String value) {
            addCriterion("PBG_NBR <>", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrGreaterThan(String value) {
            addCriterion("PBG_NBR >", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrGreaterThanOrEqualTo(String value) {
            addCriterion("PBG_NBR >=", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrLessThan(String value) {
            addCriterion("PBG_NBR <", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrLessThanOrEqualTo(String value) {
            addCriterion("PBG_NBR <=", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrLike(String value) {
            addCriterion("PBG_NBR like", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrNotLike(String value) {
            addCriterion("PBG_NBR not like", value, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrIn(List<String> values) {
            addCriterion("PBG_NBR in", values, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrNotIn(List<String> values) {
            addCriterion("PBG_NBR not in", values, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrBetween(String value1, String value2) {
            addCriterion("PBG_NBR between", value1, value2, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andPbgNbrNotBetween(String value1, String value2) {
            addCriterion("PBG_NBR not between", value1, value2, "pbgNbr");
            return (Criteria) this;
        }

        public Criteria andQdCodIsNull() {
            addCriterion("QD_COD is null");
            return (Criteria) this;
        }

        public Criteria andQdCodIsNotNull() {
            addCriterion("QD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andQdCodEqualTo(String value) {
            addCriterion("QD_COD =", value, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdCodNotEqualTo(String value) {
            addCriterion("QD_COD <>", value, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdCodGreaterThan(String value) {
            addCriterion("QD_COD >", value, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdCodGreaterThanOrEqualTo(String value) {
            addCriterion("QD_COD >=", value, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdCodLessThan(String value) {
            addCriterion("QD_COD <", value, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdCodLessThanOrEqualTo(String value) {
            addCriterion("QD_COD <=", value, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdCodLike(String value) {
            addCriterion("QD_COD like", value, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdCodNotLike(String value) {
            addCriterion("QD_COD not like", value, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdCodIn(List<String> values) {
            addCriterion("QD_COD in", values, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdCodNotIn(List<String> values) {
            addCriterion("QD_COD not in", values, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdCodBetween(String value1, String value2) {
            addCriterion("QD_COD between", value1, value2, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdCodNotBetween(String value1, String value2) {
            addCriterion("QD_COD not between", value1, value2, "qdCod");
            return (Criteria) this;
        }

        public Criteria andQdOtherIsNull() {
            addCriterion("QD_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andQdOtherIsNotNull() {
            addCriterion("QD_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andQdOtherEqualTo(String value) {
            addCriterion("QD_OTHER =", value, "qdOther");
            return (Criteria) this;
        }

        public Criteria andQdOtherNotEqualTo(String value) {
            addCriterion("QD_OTHER <>", value, "qdOther");
            return (Criteria) this;
        }

        public Criteria andQdOtherGreaterThan(String value) {
            addCriterion("QD_OTHER >", value, "qdOther");
            return (Criteria) this;
        }

        public Criteria andQdOtherGreaterThanOrEqualTo(String value) {
            addCriterion("QD_OTHER >=", value, "qdOther");
            return (Criteria) this;
        }

        public Criteria andQdOtherLessThan(String value) {
            addCriterion("QD_OTHER <", value, "qdOther");
            return (Criteria) this;
        }

        public Criteria andQdOtherLessThanOrEqualTo(String value) {
            addCriterion("QD_OTHER <=", value, "qdOther");
            return (Criteria) this;
        }

        public Criteria andQdOtherLike(String value) {
            addCriterion("QD_OTHER like", value, "qdOther");
            return (Criteria) this;
        }

        public Criteria andQdOtherNotLike(String value) {
            addCriterion("QD_OTHER not like", value, "qdOther");
            return (Criteria) this;
        }

        public Criteria andQdOtherIn(List<String> values) {
            addCriterion("QD_OTHER in", values, "qdOther");
            return (Criteria) this;
        }

        public Criteria andQdOtherNotIn(List<String> values) {
            addCriterion("QD_OTHER not in", values, "qdOther");
            return (Criteria) this;
        }

        public Criteria andQdOtherBetween(String value1, String value2) {
            addCriterion("QD_OTHER between", value1, value2, "qdOther");
            return (Criteria) this;
        }

        public Criteria andQdOtherNotBetween(String value1, String value2) {
            addCriterion("QD_OTHER not between", value1, value2, "qdOther");
            return (Criteria) this;
        }

        public Criteria andHxCodIsNull() {
            addCriterion("HX_COD is null");
            return (Criteria) this;
        }

        public Criteria andHxCodIsNotNull() {
            addCriterion("HX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHxCodEqualTo(String value) {
            addCriterion("HX_COD =", value, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxCodNotEqualTo(String value) {
            addCriterion("HX_COD <>", value, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxCodGreaterThan(String value) {
            addCriterion("HX_COD >", value, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxCodGreaterThanOrEqualTo(String value) {
            addCriterion("HX_COD >=", value, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxCodLessThan(String value) {
            addCriterion("HX_COD <", value, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxCodLessThanOrEqualTo(String value) {
            addCriterion("HX_COD <=", value, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxCodLike(String value) {
            addCriterion("HX_COD like", value, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxCodNotLike(String value) {
            addCriterion("HX_COD not like", value, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxCodIn(List<String> values) {
            addCriterion("HX_COD in", values, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxCodNotIn(List<String> values) {
            addCriterion("HX_COD not in", values, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxCodBetween(String value1, String value2) {
            addCriterion("HX_COD between", value1, value2, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxCodNotBetween(String value1, String value2) {
            addCriterion("HX_COD not between", value1, value2, "hxCod");
            return (Criteria) this;
        }

        public Criteria andHxOtherIsNull() {
            addCriterion("HX_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andHxOtherIsNotNull() {
            addCriterion("HX_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andHxOtherEqualTo(String value) {
            addCriterion("HX_OTHER =", value, "hxOther");
            return (Criteria) this;
        }

        public Criteria andHxOtherNotEqualTo(String value) {
            addCriterion("HX_OTHER <>", value, "hxOther");
            return (Criteria) this;
        }

        public Criteria andHxOtherGreaterThan(String value) {
            addCriterion("HX_OTHER >", value, "hxOther");
            return (Criteria) this;
        }

        public Criteria andHxOtherGreaterThanOrEqualTo(String value) {
            addCriterion("HX_OTHER >=", value, "hxOther");
            return (Criteria) this;
        }

        public Criteria andHxOtherLessThan(String value) {
            addCriterion("HX_OTHER <", value, "hxOther");
            return (Criteria) this;
        }

        public Criteria andHxOtherLessThanOrEqualTo(String value) {
            addCriterion("HX_OTHER <=", value, "hxOther");
            return (Criteria) this;
        }

        public Criteria andHxOtherLike(String value) {
            addCriterion("HX_OTHER like", value, "hxOther");
            return (Criteria) this;
        }

        public Criteria andHxOtherNotLike(String value) {
            addCriterion("HX_OTHER not like", value, "hxOther");
            return (Criteria) this;
        }

        public Criteria andHxOtherIn(List<String> values) {
            addCriterion("HX_OTHER in", values, "hxOther");
            return (Criteria) this;
        }

        public Criteria andHxOtherNotIn(List<String> values) {
            addCriterion("HX_OTHER not in", values, "hxOther");
            return (Criteria) this;
        }

        public Criteria andHxOtherBetween(String value1, String value2) {
            addCriterion("HX_OTHER between", value1, value2, "hxOther");
            return (Criteria) this;
        }

        public Criteria andHxOtherNotBetween(String value1, String value2) {
            addCriterion("HX_OTHER not between", value1, value2, "hxOther");
            return (Criteria) this;
        }

        public Criteria andXhCodIsNull() {
            addCriterion("XH_COD is null");
            return (Criteria) this;
        }

        public Criteria andXhCodIsNotNull() {
            addCriterion("XH_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXhCodEqualTo(String value) {
            addCriterion("XH_COD =", value, "xhCod");
            return (Criteria) this;
        }

        public Criteria andXhCodNotEqualTo(String value) {
            addCriterion("XH_COD <>", value, "xhCod");
            return (Criteria) this;
        }

        public Criteria andXhCodGreaterThan(String value) {
            addCriterion("XH_COD >", value, "xhCod");
            return (Criteria) this;
        }

        public Criteria andXhCodGreaterThanOrEqualTo(String value) {
            addCriterion("XH_COD >=", value, "xhCod");
            return (Criteria) this;
        }

        public Criteria andXhCodLessThan(String value) {
            addCriterion("XH_COD <", value, "xhCod");
            return (Criteria) this;
        }

        public Criteria andXhCodLessThanOrEqualTo(String value) {
            addCriterion("XH_COD <=", value, "xhCod");
            return (Criteria) this;
        }

        public Criteria andXhCodLike(String value) {
            addCriterion("XH_COD like", value, "xhCod");
            return (Criteria) this;
        }

        public Criteria andXhCodNotLike(String value) {
            addCriterion("XH_COD not like", value, "xhCod");
            return (Criteria) this;
        }

        public Criteria andXhCodIn(List<String> values) {
            addCriterion("XH_COD in", values, "xhCod");
            return (Criteria) this;
        }

        public Criteria andXhCodNotIn(List<String> values) {
            addCriterion("XH_COD not in", values, "xhCod");
            return (Criteria) this;
        }

        public Criteria andXhCodBetween(String value1, String value2) {
            addCriterion("XH_COD between", value1, value2, "xhCod");
            return (Criteria) this;
        }

        public Criteria andXhCodNotBetween(String value1, String value2) {
            addCriterion("XH_COD not between", value1, value2, "xhCod");
            return (Criteria) this;
        }

        public Criteria andCxCodIsNull() {
            addCriterion("CX_COD is null");
            return (Criteria) this;
        }

        public Criteria andCxCodIsNotNull() {
            addCriterion("CX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCxCodEqualTo(String value) {
            addCriterion("CX_COD =", value, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxCodNotEqualTo(String value) {
            addCriterion("CX_COD <>", value, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxCodGreaterThan(String value) {
            addCriterion("CX_COD >", value, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxCodGreaterThanOrEqualTo(String value) {
            addCriterion("CX_COD >=", value, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxCodLessThan(String value) {
            addCriterion("CX_COD <", value, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxCodLessThanOrEqualTo(String value) {
            addCriterion("CX_COD <=", value, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxCodLike(String value) {
            addCriterion("CX_COD like", value, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxCodNotLike(String value) {
            addCriterion("CX_COD not like", value, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxCodIn(List<String> values) {
            addCriterion("CX_COD in", values, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxCodNotIn(List<String> values) {
            addCriterion("CX_COD not in", values, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxCodBetween(String value1, String value2) {
            addCriterion("CX_COD between", value1, value2, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxCodNotBetween(String value1, String value2) {
            addCriterion("CX_COD not between", value1, value2, "cxCod");
            return (Criteria) this;
        }

        public Criteria andCxQtbwIsNull() {
            addCriterion("CX_QTBW is null");
            return (Criteria) this;
        }

        public Criteria andCxQtbwIsNotNull() {
            addCriterion("CX_QTBW is not null");
            return (Criteria) this;
        }

        public Criteria andCxQtbwEqualTo(String value) {
            addCriterion("CX_QTBW =", value, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andCxQtbwNotEqualTo(String value) {
            addCriterion("CX_QTBW <>", value, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andCxQtbwGreaterThan(String value) {
            addCriterion("CX_QTBW >", value, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andCxQtbwGreaterThanOrEqualTo(String value) {
            addCriterion("CX_QTBW >=", value, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andCxQtbwLessThan(String value) {
            addCriterion("CX_QTBW <", value, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andCxQtbwLessThanOrEqualTo(String value) {
            addCriterion("CX_QTBW <=", value, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andCxQtbwLike(String value) {
            addCriterion("CX_QTBW like", value, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andCxQtbwNotLike(String value) {
            addCriterion("CX_QTBW not like", value, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andCxQtbwIn(List<String> values) {
            addCriterion("CX_QTBW in", values, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andCxQtbwNotIn(List<String> values) {
            addCriterion("CX_QTBW not in", values, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andCxQtbwBetween(String value1, String value2) {
            addCriterion("CX_QTBW between", value1, value2, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andCxQtbwNotBetween(String value1, String value2) {
            addCriterion("CX_QTBW not between", value1, value2, "cxQtbw");
            return (Criteria) this;
        }

        public Criteria andNsCodIsNull() {
            addCriterion("NS_COD is null");
            return (Criteria) this;
        }

        public Criteria andNsCodIsNotNull() {
            addCriterion("NS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andNsCodEqualTo(String value) {
            addCriterion("NS_COD =", value, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsCodNotEqualTo(String value) {
            addCriterion("NS_COD <>", value, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsCodGreaterThan(String value) {
            addCriterion("NS_COD >", value, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsCodGreaterThanOrEqualTo(String value) {
            addCriterion("NS_COD >=", value, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsCodLessThan(String value) {
            addCriterion("NS_COD <", value, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsCodLessThanOrEqualTo(String value) {
            addCriterion("NS_COD <=", value, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsCodLike(String value) {
            addCriterion("NS_COD like", value, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsCodNotLike(String value) {
            addCriterion("NS_COD not like", value, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsCodIn(List<String> values) {
            addCriterion("NS_COD in", values, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsCodNotIn(List<String> values) {
            addCriterion("NS_COD not in", values, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsCodBetween(String value1, String value2) {
            addCriterion("NS_COD between", value1, value2, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsCodNotBetween(String value1, String value2) {
            addCriterion("NS_COD not between", value1, value2, "nsCod");
            return (Criteria) this;
        }

        public Criteria andNsDaqtIsNull() {
            addCriterion("NS_DAQT is null");
            return (Criteria) this;
        }

        public Criteria andNsDaqtIsNotNull() {
            addCriterion("NS_DAQT is not null");
            return (Criteria) this;
        }

        public Criteria andNsDaqtEqualTo(String value) {
            addCriterion("NS_DAQT =", value, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsDaqtNotEqualTo(String value) {
            addCriterion("NS_DAQT <>", value, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsDaqtGreaterThan(String value) {
            addCriterion("NS_DAQT >", value, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsDaqtGreaterThanOrEqualTo(String value) {
            addCriterion("NS_DAQT >=", value, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsDaqtLessThan(String value) {
            addCriterion("NS_DAQT <", value, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsDaqtLessThanOrEqualTo(String value) {
            addCriterion("NS_DAQT <=", value, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsDaqtLike(String value) {
            addCriterion("NS_DAQT like", value, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsDaqtNotLike(String value) {
            addCriterion("NS_DAQT not like", value, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsDaqtIn(List<String> values) {
            addCriterion("NS_DAQT in", values, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsDaqtNotIn(List<String> values) {
            addCriterion("NS_DAQT not in", values, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsDaqtBetween(String value1, String value2) {
            addCriterion("NS_DAQT between", value1, value2, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsDaqtNotBetween(String value1, String value2) {
            addCriterion("NS_DAQT not between", value1, value2, "nsDaqt");
            return (Criteria) this;
        }

        public Criteria andNsTtcjIsNull() {
            addCriterion("NS_TTCJ is null");
            return (Criteria) this;
        }

        public Criteria andNsTtcjIsNotNull() {
            addCriterion("NS_TTCJ is not null");
            return (Criteria) this;
        }

        public Criteria andNsTtcjEqualTo(String value) {
            addCriterion("NS_TTCJ =", value, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsTtcjNotEqualTo(String value) {
            addCriterion("NS_TTCJ <>", value, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsTtcjGreaterThan(String value) {
            addCriterion("NS_TTCJ >", value, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsTtcjGreaterThanOrEqualTo(String value) {
            addCriterion("NS_TTCJ >=", value, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsTtcjLessThan(String value) {
            addCriterion("NS_TTCJ <", value, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsTtcjLessThanOrEqualTo(String value) {
            addCriterion("NS_TTCJ <=", value, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsTtcjLike(String value) {
            addCriterion("NS_TTCJ like", value, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsTtcjNotLike(String value) {
            addCriterion("NS_TTCJ not like", value, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsTtcjIn(List<String> values) {
            addCriterion("NS_TTCJ in", values, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsTtcjNotIn(List<String> values) {
            addCriterion("NS_TTCJ not in", values, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsTtcjBetween(String value1, String value2) {
            addCriterion("NS_TTCJ between", value1, value2, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsTtcjNotBetween(String value1, String value2) {
            addCriterion("NS_TTCJ not between", value1, value2, "nsTtcj");
            return (Criteria) this;
        }

        public Criteria andNsThztIsNull() {
            addCriterion("NS_THZT is null");
            return (Criteria) this;
        }

        public Criteria andNsThztIsNotNull() {
            addCriterion("NS_THZT is not null");
            return (Criteria) this;
        }

        public Criteria andNsThztEqualTo(String value) {
            addCriterion("NS_THZT =", value, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztNotEqualTo(String value) {
            addCriterion("NS_THZT <>", value, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztGreaterThan(String value) {
            addCriterion("NS_THZT >", value, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztGreaterThanOrEqualTo(String value) {
            addCriterion("NS_THZT >=", value, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztLessThan(String value) {
            addCriterion("NS_THZT <", value, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztLessThanOrEqualTo(String value) {
            addCriterion("NS_THZT <=", value, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztLike(String value) {
            addCriterion("NS_THZT like", value, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztNotLike(String value) {
            addCriterion("NS_THZT not like", value, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztIn(List<String> values) {
            addCriterion("NS_THZT in", values, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztNotIn(List<String> values) {
            addCriterion("NS_THZT not in", values, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztBetween(String value1, String value2) {
            addCriterion("NS_THZT between", value1, value2, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztNotBetween(String value1, String value2) {
            addCriterion("NS_THZT not between", value1, value2, "nsThzt");
            return (Criteria) this;
        }

        public Criteria andNsThztDesIsNull() {
            addCriterion("NS_THZT_DES is null");
            return (Criteria) this;
        }

        public Criteria andNsThztDesIsNotNull() {
            addCriterion("NS_THZT_DES is not null");
            return (Criteria) this;
        }

        public Criteria andNsThztDesEqualTo(String value) {
            addCriterion("NS_THZT_DES =", value, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andNsThztDesNotEqualTo(String value) {
            addCriterion("NS_THZT_DES <>", value, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andNsThztDesGreaterThan(String value) {
            addCriterion("NS_THZT_DES >", value, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andNsThztDesGreaterThanOrEqualTo(String value) {
            addCriterion("NS_THZT_DES >=", value, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andNsThztDesLessThan(String value) {
            addCriterion("NS_THZT_DES <", value, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andNsThztDesLessThanOrEqualTo(String value) {
            addCriterion("NS_THZT_DES <=", value, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andNsThztDesLike(String value) {
            addCriterion("NS_THZT_DES like", value, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andNsThztDesNotLike(String value) {
            addCriterion("NS_THZT_DES not like", value, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andNsThztDesIn(List<String> values) {
            addCriterion("NS_THZT_DES in", values, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andNsThztDesNotIn(List<String> values) {
            addCriterion("NS_THZT_DES not in", values, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andNsThztDesBetween(String value1, String value2) {
            addCriterion("NS_THZT_DES between", value1, value2, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andNsThztDesNotBetween(String value1, String value2) {
            addCriterion("NS_THZT_DES not between", value1, value2, "nsThztDes");
            return (Criteria) this;
        }

        public Criteria andTkLeftIsNull() {
            addCriterion("TK_LEFT is null");
            return (Criteria) this;
        }

        public Criteria andTkLeftIsNotNull() {
            addCriterion("TK_LEFT is not null");
            return (Criteria) this;
        }

        public Criteria andTkLeftEqualTo(String value) {
            addCriterion("TK_LEFT =", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftNotEqualTo(String value) {
            addCriterion("TK_LEFT <>", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftGreaterThan(String value) {
            addCriterion("TK_LEFT >", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftGreaterThanOrEqualTo(String value) {
            addCriterion("TK_LEFT >=", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftLessThan(String value) {
            addCriterion("TK_LEFT <", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftLessThanOrEqualTo(String value) {
            addCriterion("TK_LEFT <=", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftLike(String value) {
            addCriterion("TK_LEFT like", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftNotLike(String value) {
            addCriterion("TK_LEFT not like", value, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftIn(List<String> values) {
            addCriterion("TK_LEFT in", values, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftNotIn(List<String> values) {
            addCriterion("TK_LEFT not in", values, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftBetween(String value1, String value2) {
            addCriterion("TK_LEFT between", value1, value2, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftNotBetween(String value1, String value2) {
            addCriterion("TK_LEFT not between", value1, value2, "tkLeft");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodIsNull() {
            addCriterion("TK_LEFT_COD is null");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodIsNotNull() {
            addCriterion("TK_LEFT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodEqualTo(String value) {
            addCriterion("TK_LEFT_COD =", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodNotEqualTo(String value) {
            addCriterion("TK_LEFT_COD <>", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodGreaterThan(String value) {
            addCriterion("TK_LEFT_COD >", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodGreaterThanOrEqualTo(String value) {
            addCriterion("TK_LEFT_COD >=", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodLessThan(String value) {
            addCriterion("TK_LEFT_COD <", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodLessThanOrEqualTo(String value) {
            addCriterion("TK_LEFT_COD <=", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodLike(String value) {
            addCriterion("TK_LEFT_COD like", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodNotLike(String value) {
            addCriterion("TK_LEFT_COD not like", value, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodIn(List<String> values) {
            addCriterion("TK_LEFT_COD in", values, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodNotIn(List<String> values) {
            addCriterion("TK_LEFT_COD not in", values, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodBetween(String value1, String value2) {
            addCriterion("TK_LEFT_COD between", value1, value2, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkLeftCodNotBetween(String value1, String value2) {
            addCriterion("TK_LEFT_COD not between", value1, value2, "tkLeftCod");
            return (Criteria) this;
        }

        public Criteria andTkRightIsNull() {
            addCriterion("TK_RIGHT is null");
            return (Criteria) this;
        }

        public Criteria andTkRightIsNotNull() {
            addCriterion("TK_RIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andTkRightEqualTo(String value) {
            addCriterion("TK_RIGHT =", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightNotEqualTo(String value) {
            addCriterion("TK_RIGHT <>", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightGreaterThan(String value) {
            addCriterion("TK_RIGHT >", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightGreaterThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT >=", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightLessThan(String value) {
            addCriterion("TK_RIGHT <", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightLessThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT <=", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightLike(String value) {
            addCriterion("TK_RIGHT like", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightNotLike(String value) {
            addCriterion("TK_RIGHT not like", value, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightIn(List<String> values) {
            addCriterion("TK_RIGHT in", values, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightNotIn(List<String> values) {
            addCriterion("TK_RIGHT not in", values, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightBetween(String value1, String value2) {
            addCriterion("TK_RIGHT between", value1, value2, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightNotBetween(String value1, String value2) {
            addCriterion("TK_RIGHT not between", value1, value2, "tkRight");
            return (Criteria) this;
        }

        public Criteria andTkRightCodIsNull() {
            addCriterion("TK_RIGHT_COD is null");
            return (Criteria) this;
        }

        public Criteria andTkRightCodIsNotNull() {
            addCriterion("TK_RIGHT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTkRightCodEqualTo(String value) {
            addCriterion("TK_RIGHT_COD =", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodNotEqualTo(String value) {
            addCriterion("TK_RIGHT_COD <>", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodGreaterThan(String value) {
            addCriterion("TK_RIGHT_COD >", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodGreaterThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT_COD >=", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodLessThan(String value) {
            addCriterion("TK_RIGHT_COD <", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodLessThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT_COD <=", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodLike(String value) {
            addCriterion("TK_RIGHT_COD like", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodNotLike(String value) {
            addCriterion("TK_RIGHT_COD not like", value, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodIn(List<String> values) {
            addCriterion("TK_RIGHT_COD in", values, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodNotIn(List<String> values) {
            addCriterion("TK_RIGHT_COD not in", values, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodBetween(String value1, String value2) {
            addCriterion("TK_RIGHT_COD between", value1, value2, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andTkRightCodNotBetween(String value1, String value2) {
            addCriterion("TK_RIGHT_COD not between", value1, value2, "tkRightCod");
            return (Criteria) this;
        }

        public Criteria andFbCodIsNull() {
            addCriterion("FB_COD is null");
            return (Criteria) this;
        }

        public Criteria andFbCodIsNotNull() {
            addCriterion("FB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFbCodEqualTo(String value) {
            addCriterion("FB_COD =", value, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbCodNotEqualTo(String value) {
            addCriterion("FB_COD <>", value, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbCodGreaterThan(String value) {
            addCriterion("FB_COD >", value, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbCodGreaterThanOrEqualTo(String value) {
            addCriterion("FB_COD >=", value, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbCodLessThan(String value) {
            addCriterion("FB_COD <", value, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbCodLessThanOrEqualTo(String value) {
            addCriterion("FB_COD <=", value, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbCodLike(String value) {
            addCriterion("FB_COD like", value, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbCodNotLike(String value) {
            addCriterion("FB_COD not like", value, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbCodIn(List<String> values) {
            addCriterion("FB_COD in", values, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbCodNotIn(List<String> values) {
            addCriterion("FB_COD not in", values, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbCodBetween(String value1, String value2) {
            addCriterion("FB_COD between", value1, value2, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbCodNotBetween(String value1, String value2) {
            addCriterion("FB_COD not between", value1, value2, "fbCod");
            return (Criteria) this;
        }

        public Criteria andFbFcIsNull() {
            addCriterion("FB_FC is null");
            return (Criteria) this;
        }

        public Criteria andFbFcIsNotNull() {
            addCriterion("FB_FC is not null");
            return (Criteria) this;
        }

        public Criteria andFbFcEqualTo(String value) {
            addCriterion("FB_FC =", value, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcNotEqualTo(String value) {
            addCriterion("FB_FC <>", value, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcGreaterThan(String value) {
            addCriterion("FB_FC >", value, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcGreaterThanOrEqualTo(String value) {
            addCriterion("FB_FC >=", value, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcLessThan(String value) {
            addCriterion("FB_FC <", value, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcLessThanOrEqualTo(String value) {
            addCriterion("FB_FC <=", value, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcLike(String value) {
            addCriterion("FB_FC like", value, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcNotLike(String value) {
            addCriterion("FB_FC not like", value, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcIn(List<String> values) {
            addCriterion("FB_FC in", values, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcNotIn(List<String> values) {
            addCriterion("FB_FC not in", values, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcBetween(String value1, String value2) {
            addCriterion("FB_FC between", value1, value2, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcNotBetween(String value1, String value2) {
            addCriterion("FB_FC not between", value1, value2, "fbFc");
            return (Criteria) this;
        }

        public Criteria andFbFcDesIsNull() {
            addCriterion("FB_FC_DES is null");
            return (Criteria) this;
        }

        public Criteria andFbFcDesIsNotNull() {
            addCriterion("FB_FC_DES is not null");
            return (Criteria) this;
        }

        public Criteria andFbFcDesEqualTo(String value) {
            addCriterion("FB_FC_DES =", value, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbFcDesNotEqualTo(String value) {
            addCriterion("FB_FC_DES <>", value, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbFcDesGreaterThan(String value) {
            addCriterion("FB_FC_DES >", value, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbFcDesGreaterThanOrEqualTo(String value) {
            addCriterion("FB_FC_DES >=", value, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbFcDesLessThan(String value) {
            addCriterion("FB_FC_DES <", value, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbFcDesLessThanOrEqualTo(String value) {
            addCriterion("FB_FC_DES <=", value, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbFcDesLike(String value) {
            addCriterion("FB_FC_DES like", value, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbFcDesNotLike(String value) {
            addCriterion("FB_FC_DES not like", value, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbFcDesIn(List<String> values) {
            addCriterion("FB_FC_DES in", values, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbFcDesNotIn(List<String> values) {
            addCriterion("FB_FC_DES not in", values, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbFcDesBetween(String value1, String value2) {
            addCriterion("FB_FC_DES between", value1, value2, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbFcDesNotBetween(String value1, String value2) {
            addCriterion("FB_FC_DES not between", value1, value2, "fbFcDes");
            return (Criteria) this;
        }

        public Criteria andFbOtherIsNull() {
            addCriterion("FB_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andFbOtherIsNotNull() {
            addCriterion("FB_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andFbOtherEqualTo(String value) {
            addCriterion("FB_OTHER =", value, "fbOther");
            return (Criteria) this;
        }

        public Criteria andFbOtherNotEqualTo(String value) {
            addCriterion("FB_OTHER <>", value, "fbOther");
            return (Criteria) this;
        }

        public Criteria andFbOtherGreaterThan(String value) {
            addCriterion("FB_OTHER >", value, "fbOther");
            return (Criteria) this;
        }

        public Criteria andFbOtherGreaterThanOrEqualTo(String value) {
            addCriterion("FB_OTHER >=", value, "fbOther");
            return (Criteria) this;
        }

        public Criteria andFbOtherLessThan(String value) {
            addCriterion("FB_OTHER <", value, "fbOther");
            return (Criteria) this;
        }

        public Criteria andFbOtherLessThanOrEqualTo(String value) {
            addCriterion("FB_OTHER <=", value, "fbOther");
            return (Criteria) this;
        }

        public Criteria andFbOtherLike(String value) {
            addCriterion("FB_OTHER like", value, "fbOther");
            return (Criteria) this;
        }

        public Criteria andFbOtherNotLike(String value) {
            addCriterion("FB_OTHER not like", value, "fbOther");
            return (Criteria) this;
        }

        public Criteria andFbOtherIn(List<String> values) {
            addCriterion("FB_OTHER in", values, "fbOther");
            return (Criteria) this;
        }

        public Criteria andFbOtherNotIn(List<String> values) {
            addCriterion("FB_OTHER not in", values, "fbOther");
            return (Criteria) this;
        }

        public Criteria andFbOtherBetween(String value1, String value2) {
            addCriterion("FB_OTHER between", value1, value2, "fbOther");
            return (Criteria) this;
        }

        public Criteria andFbOtherNotBetween(String value1, String value2) {
            addCriterion("FB_OTHER not between", value1, value2, "fbOther");
            return (Criteria) this;
        }

        public Criteria andPfCodIsNull() {
            addCriterion("PF_COD is null");
            return (Criteria) this;
        }

        public Criteria andPfCodIsNotNull() {
            addCriterion("PF_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPfCodEqualTo(String value) {
            addCriterion("PF_COD =", value, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfCodNotEqualTo(String value) {
            addCriterion("PF_COD <>", value, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfCodGreaterThan(String value) {
            addCriterion("PF_COD >", value, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfCodGreaterThanOrEqualTo(String value) {
            addCriterion("PF_COD >=", value, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfCodLessThan(String value) {
            addCriterion("PF_COD <", value, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfCodLessThanOrEqualTo(String value) {
            addCriterion("PF_COD <=", value, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfCodLike(String value) {
            addCriterion("PF_COD like", value, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfCodNotLike(String value) {
            addCriterion("PF_COD not like", value, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfCodIn(List<String> values) {
            addCriterion("PF_COD in", values, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfCodNotIn(List<String> values) {
            addCriterion("PF_COD not in", values, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfCodBetween(String value1, String value2) {
            addCriterion("PF_COD between", value1, value2, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfCodNotBetween(String value1, String value2) {
            addCriterion("PF_COD not between", value1, value2, "pfCod");
            return (Criteria) this;
        }

        public Criteria andPfFwIsNull() {
            addCriterion("PF_FW is null");
            return (Criteria) this;
        }

        public Criteria andPfFwIsNotNull() {
            addCriterion("PF_FW is not null");
            return (Criteria) this;
        }

        public Criteria andPfFwEqualTo(String value) {
            addCriterion("PF_FW =", value, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwNotEqualTo(String value) {
            addCriterion("PF_FW <>", value, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwGreaterThan(String value) {
            addCriterion("PF_FW >", value, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwGreaterThanOrEqualTo(String value) {
            addCriterion("PF_FW >=", value, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwLessThan(String value) {
            addCriterion("PF_FW <", value, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwLessThanOrEqualTo(String value) {
            addCriterion("PF_FW <=", value, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwLike(String value) {
            addCriterion("PF_FW like", value, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwNotLike(String value) {
            addCriterion("PF_FW not like", value, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwIn(List<String> values) {
            addCriterion("PF_FW in", values, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwNotIn(List<String> values) {
            addCriterion("PF_FW not in", values, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwBetween(String value1, String value2) {
            addCriterion("PF_FW between", value1, value2, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwNotBetween(String value1, String value2) {
            addCriterion("PF_FW not between", value1, value2, "pfFw");
            return (Criteria) this;
        }

        public Criteria andPfFwDesIsNull() {
            addCriterion("PF_FW_DES is null");
            return (Criteria) this;
        }

        public Criteria andPfFwDesIsNotNull() {
            addCriterion("PF_FW_DES is not null");
            return (Criteria) this;
        }

        public Criteria andPfFwDesEqualTo(String value) {
            addCriterion("PF_FW_DES =", value, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andPfFwDesNotEqualTo(String value) {
            addCriterion("PF_FW_DES <>", value, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andPfFwDesGreaterThan(String value) {
            addCriterion("PF_FW_DES >", value, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andPfFwDesGreaterThanOrEqualTo(String value) {
            addCriterion("PF_FW_DES >=", value, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andPfFwDesLessThan(String value) {
            addCriterion("PF_FW_DES <", value, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andPfFwDesLessThanOrEqualTo(String value) {
            addCriterion("PF_FW_DES <=", value, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andPfFwDesLike(String value) {
            addCriterion("PF_FW_DES like", value, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andPfFwDesNotLike(String value) {
            addCriterion("PF_FW_DES not like", value, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andPfFwDesIn(List<String> values) {
            addCriterion("PF_FW_DES in", values, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andPfFwDesNotIn(List<String> values) {
            addCriterion("PF_FW_DES not in", values, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andPfFwDesBetween(String value1, String value2) {
            addCriterion("PF_FW_DES between", value1, value2, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andPfFwDesNotBetween(String value1, String value2) {
            addCriterion("PF_FW_DES not between", value1, value2, "pfFwDes");
            return (Criteria) this;
        }

        public Criteria andClbzCodIsNull() {
            addCriterion("CLBZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andClbzCodIsNotNull() {
            addCriterion("CLBZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andClbzCodEqualTo(String value) {
            addCriterion("CLBZ_COD =", value, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andClbzCodNotEqualTo(String value) {
            addCriterion("CLBZ_COD <>", value, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andClbzCodGreaterThan(String value) {
            addCriterion("CLBZ_COD >", value, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andClbzCodGreaterThanOrEqualTo(String value) {
            addCriterion("CLBZ_COD >=", value, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andClbzCodLessThan(String value) {
            addCriterion("CLBZ_COD <", value, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andClbzCodLessThanOrEqualTo(String value) {
            addCriterion("CLBZ_COD <=", value, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andClbzCodLike(String value) {
            addCriterion("CLBZ_COD like", value, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andClbzCodNotLike(String value) {
            addCriterion("CLBZ_COD not like", value, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andClbzCodIn(List<String> values) {
            addCriterion("CLBZ_COD in", values, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andClbzCodNotIn(List<String> values) {
            addCriterion("CLBZ_COD not in", values, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andClbzCodBetween(String value1, String value2) {
            addCriterion("CLBZ_COD between", value1, value2, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andClbzCodNotBetween(String value1, String value2) {
            addCriterion("CLBZ_COD not between", value1, value2, "clbzCod");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsIsNull() {
            addCriterion("QT_QMS_RS is null");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsIsNotNull() {
            addCriterion("QT_QMS_RS is not null");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsEqualTo(String value) {
            addCriterion("QT_QMS_RS =", value, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsNotEqualTo(String value) {
            addCriterion("QT_QMS_RS <>", value, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsGreaterThan(String value) {
            addCriterion("QT_QMS_RS >", value, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsGreaterThanOrEqualTo(String value) {
            addCriterion("QT_QMS_RS >=", value, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsLessThan(String value) {
            addCriterion("QT_QMS_RS <", value, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsLessThanOrEqualTo(String value) {
            addCriterion("QT_QMS_RS <=", value, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsLike(String value) {
            addCriterion("QT_QMS_RS like", value, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsNotLike(String value) {
            addCriterion("QT_QMS_RS not like", value, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsIn(List<String> values) {
            addCriterion("QT_QMS_RS in", values, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsNotIn(List<String> values) {
            addCriterion("QT_QMS_RS not in", values, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsBetween(String value1, String value2) {
            addCriterion("QT_QMS_RS between", value1, value2, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsRsNotBetween(String value1, String value2) {
            addCriterion("QT_QMS_RS not between", value1, value2, "qtQmsRs");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatIsNull() {
            addCriterion("QT_QMS_DAT is null");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatIsNotNull() {
            addCriterion("QT_QMS_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatEqualTo(Date value) {
            addCriterion("QT_QMS_DAT =", value, "qtQmsDat");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatNotEqualTo(Date value) {
            addCriterion("QT_QMS_DAT <>", value, "qtQmsDat");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatGreaterThan(Date value) {
            addCriterion("QT_QMS_DAT >", value, "qtQmsDat");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatGreaterThanOrEqualTo(Date value) {
            addCriterion("QT_QMS_DAT >=", value, "qtQmsDat");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatLessThan(Date value) {
            addCriterion("QT_QMS_DAT <", value, "qtQmsDat");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatLessThanOrEqualTo(Date value) {
            addCriterion("QT_QMS_DAT <=", value, "qtQmsDat");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatIn(List<Date> values) {
            addCriterion("QT_QMS_DAT in", values, "qtQmsDat");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatNotIn(List<Date> values) {
            addCriterion("QT_QMS_DAT not in", values, "qtQmsDat");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatBetween(Date value1, Date value2) {
            addCriterion("QT_QMS_DAT between", value1, value2, "qtQmsDat");
            return (Criteria) this;
        }

        public Criteria andQtQmsDatNotBetween(Date value1, Date value2) {
            addCriterion("QT_QMS_DAT not between", value1, value2, "qtQmsDat");
            return (Criteria) this;
        }

        public Criteria andQtTatRsIsNull() {
            addCriterion("QT_TAT_RS is null");
            return (Criteria) this;
        }

        public Criteria andQtTatRsIsNotNull() {
            addCriterion("QT_TAT_RS is not null");
            return (Criteria) this;
        }

        public Criteria andQtTatRsEqualTo(String value) {
            addCriterion("QT_TAT_RS =", value, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatRsNotEqualTo(String value) {
            addCriterion("QT_TAT_RS <>", value, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatRsGreaterThan(String value) {
            addCriterion("QT_TAT_RS >", value, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatRsGreaterThanOrEqualTo(String value) {
            addCriterion("QT_TAT_RS >=", value, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatRsLessThan(String value) {
            addCriterion("QT_TAT_RS <", value, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatRsLessThanOrEqualTo(String value) {
            addCriterion("QT_TAT_RS <=", value, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatRsLike(String value) {
            addCriterion("QT_TAT_RS like", value, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatRsNotLike(String value) {
            addCriterion("QT_TAT_RS not like", value, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatRsIn(List<String> values) {
            addCriterion("QT_TAT_RS in", values, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatRsNotIn(List<String> values) {
            addCriterion("QT_TAT_RS not in", values, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatRsBetween(String value1, String value2) {
            addCriterion("QT_TAT_RS between", value1, value2, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatRsNotBetween(String value1, String value2) {
            addCriterion("QT_TAT_RS not between", value1, value2, "qtTatRs");
            return (Criteria) this;
        }

        public Criteria andQtTatDatIsNull() {
            addCriterion("QT_TAT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andQtTatDatIsNotNull() {
            addCriterion("QT_TAT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andQtTatDatEqualTo(Date value) {
            addCriterion("QT_TAT_DAT =", value, "qtTatDat");
            return (Criteria) this;
        }

        public Criteria andQtTatDatNotEqualTo(Date value) {
            addCriterion("QT_TAT_DAT <>", value, "qtTatDat");
            return (Criteria) this;
        }

        public Criteria andQtTatDatGreaterThan(Date value) {
            addCriterion("QT_TAT_DAT >", value, "qtTatDat");
            return (Criteria) this;
        }

        public Criteria andQtTatDatGreaterThanOrEqualTo(Date value) {
            addCriterion("QT_TAT_DAT >=", value, "qtTatDat");
            return (Criteria) this;
        }

        public Criteria andQtTatDatLessThan(Date value) {
            addCriterion("QT_TAT_DAT <", value, "qtTatDat");
            return (Criteria) this;
        }

        public Criteria andQtTatDatLessThanOrEqualTo(Date value) {
            addCriterion("QT_TAT_DAT <=", value, "qtTatDat");
            return (Criteria) this;
        }

        public Criteria andQtTatDatIn(List<Date> values) {
            addCriterion("QT_TAT_DAT in", values, "qtTatDat");
            return (Criteria) this;
        }

        public Criteria andQtTatDatNotIn(List<Date> values) {
            addCriterion("QT_TAT_DAT not in", values, "qtTatDat");
            return (Criteria) this;
        }

        public Criteria andQtTatDatBetween(Date value1, Date value2) {
            addCriterion("QT_TAT_DAT between", value1, value2, "qtTatDat");
            return (Criteria) this;
        }

        public Criteria andQtTatDatNotBetween(Date value1, Date value2) {
            addCriterion("QT_TAT_DAT not between", value1, value2, "qtTatDat");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsIsNull() {
            addCriterion("QT_OBJ1_RS is null");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsIsNotNull() {
            addCriterion("QT_OBJ1_RS is not null");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsEqualTo(String value) {
            addCriterion("QT_OBJ1_RS =", value, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsNotEqualTo(String value) {
            addCriterion("QT_OBJ1_RS <>", value, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsGreaterThan(String value) {
            addCriterion("QT_OBJ1_RS >", value, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsGreaterThanOrEqualTo(String value) {
            addCriterion("QT_OBJ1_RS >=", value, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsLessThan(String value) {
            addCriterion("QT_OBJ1_RS <", value, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsLessThanOrEqualTo(String value) {
            addCriterion("QT_OBJ1_RS <=", value, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsLike(String value) {
            addCriterion("QT_OBJ1_RS like", value, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsNotLike(String value) {
            addCriterion("QT_OBJ1_RS not like", value, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsIn(List<String> values) {
            addCriterion("QT_OBJ1_RS in", values, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsNotIn(List<String> values) {
            addCriterion("QT_OBJ1_RS not in", values, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsBetween(String value1, String value2) {
            addCriterion("QT_OBJ1_RS between", value1, value2, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1RsNotBetween(String value1, String value2) {
            addCriterion("QT_OBJ1_RS not between", value1, value2, "qtObj1Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatIsNull() {
            addCriterion("QT_OBJ1_DAT is null");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatIsNotNull() {
            addCriterion("QT_OBJ1_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatEqualTo(Date value) {
            addCriterion("QT_OBJ1_DAT =", value, "qtObj1Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatNotEqualTo(Date value) {
            addCriterion("QT_OBJ1_DAT <>", value, "qtObj1Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatGreaterThan(Date value) {
            addCriterion("QT_OBJ1_DAT >", value, "qtObj1Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatGreaterThanOrEqualTo(Date value) {
            addCriterion("QT_OBJ1_DAT >=", value, "qtObj1Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatLessThan(Date value) {
            addCriterion("QT_OBJ1_DAT <", value, "qtObj1Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatLessThanOrEqualTo(Date value) {
            addCriterion("QT_OBJ1_DAT <=", value, "qtObj1Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatIn(List<Date> values) {
            addCriterion("QT_OBJ1_DAT in", values, "qtObj1Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatNotIn(List<Date> values) {
            addCriterion("QT_OBJ1_DAT not in", values, "qtObj1Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatBetween(Date value1, Date value2) {
            addCriterion("QT_OBJ1_DAT between", value1, value2, "qtObj1Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj1DatNotBetween(Date value1, Date value2) {
            addCriterion("QT_OBJ1_DAT not between", value1, value2, "qtObj1Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsIsNull() {
            addCriterion("QT_OBJ2_RS is null");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsIsNotNull() {
            addCriterion("QT_OBJ2_RS is not null");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsEqualTo(String value) {
            addCriterion("QT_OBJ2_RS =", value, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsNotEqualTo(String value) {
            addCriterion("QT_OBJ2_RS <>", value, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsGreaterThan(String value) {
            addCriterion("QT_OBJ2_RS >", value, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsGreaterThanOrEqualTo(String value) {
            addCriterion("QT_OBJ2_RS >=", value, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsLessThan(String value) {
            addCriterion("QT_OBJ2_RS <", value, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsLessThanOrEqualTo(String value) {
            addCriterion("QT_OBJ2_RS <=", value, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsLike(String value) {
            addCriterion("QT_OBJ2_RS like", value, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsNotLike(String value) {
            addCriterion("QT_OBJ2_RS not like", value, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsIn(List<String> values) {
            addCriterion("QT_OBJ2_RS in", values, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsNotIn(List<String> values) {
            addCriterion("QT_OBJ2_RS not in", values, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsBetween(String value1, String value2) {
            addCriterion("QT_OBJ2_RS between", value1, value2, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2RsNotBetween(String value1, String value2) {
            addCriterion("QT_OBJ2_RS not between", value1, value2, "qtObj2Rs");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatIsNull() {
            addCriterion("QT_OBJ2_DAT is null");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatIsNotNull() {
            addCriterion("QT_OBJ2_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatEqualTo(Date value) {
            addCriterion("QT_OBJ2_DAT =", value, "qtObj2Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatNotEqualTo(Date value) {
            addCriterion("QT_OBJ2_DAT <>", value, "qtObj2Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatGreaterThan(Date value) {
            addCriterion("QT_OBJ2_DAT >", value, "qtObj2Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatGreaterThanOrEqualTo(Date value) {
            addCriterion("QT_OBJ2_DAT >=", value, "qtObj2Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatLessThan(Date value) {
            addCriterion("QT_OBJ2_DAT <", value, "qtObj2Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatLessThanOrEqualTo(Date value) {
            addCriterion("QT_OBJ2_DAT <=", value, "qtObj2Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatIn(List<Date> values) {
            addCriterion("QT_OBJ2_DAT in", values, "qtObj2Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatNotIn(List<Date> values) {
            addCriterion("QT_OBJ2_DAT not in", values, "qtObj2Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatBetween(Date value1, Date value2) {
            addCriterion("QT_OBJ2_DAT between", value1, value2, "qtObj2Dat");
            return (Criteria) this;
        }

        public Criteria andQtObj2DatNotBetween(Date value1, Date value2) {
            addCriterion("QT_OBJ2_DAT not between", value1, value2, "qtObj2Dat");
            return (Criteria) this;
        }

        public Criteria andHlAddrIsNull() {
            addCriterion("HL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andHlAddrIsNotNull() {
            addCriterion("HL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andHlAddrEqualTo(String value) {
            addCriterion("HL_ADDR =", value, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andHlAddrNotEqualTo(String value) {
            addCriterion("HL_ADDR <>", value, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andHlAddrGreaterThan(String value) {
            addCriterion("HL_ADDR >", value, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andHlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("HL_ADDR >=", value, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andHlAddrLessThan(String value) {
            addCriterion("HL_ADDR <", value, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andHlAddrLessThanOrEqualTo(String value) {
            addCriterion("HL_ADDR <=", value, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andHlAddrLike(String value) {
            addCriterion("HL_ADDR like", value, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andHlAddrNotLike(String value) {
            addCriterion("HL_ADDR not like", value, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andHlAddrIn(List<String> values) {
            addCriterion("HL_ADDR in", values, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andHlAddrNotIn(List<String> values) {
            addCriterion("HL_ADDR not in", values, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andHlAddrBetween(String value1, String value2) {
            addCriterion("HL_ADDR between", value1, value2, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andHlAddrNotBetween(String value1, String value2) {
            addCriterion("HL_ADDR not between", value1, value2, "hlAddr");
            return (Criteria) this;
        }

        public Criteria andJjlxNamIsNull() {
            addCriterion("JJLX_NAM is null");
            return (Criteria) this;
        }

        public Criteria andJjlxNamIsNotNull() {
            addCriterion("JJLX_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andJjlxNamEqualTo(String value) {
            addCriterion("JJLX_NAM =", value, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxNamNotEqualTo(String value) {
            addCriterion("JJLX_NAM <>", value, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxNamGreaterThan(String value) {
            addCriterion("JJLX_NAM >", value, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxNamGreaterThanOrEqualTo(String value) {
            addCriterion("JJLX_NAM >=", value, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxNamLessThan(String value) {
            addCriterion("JJLX_NAM <", value, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxNamLessThanOrEqualTo(String value) {
            addCriterion("JJLX_NAM <=", value, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxNamLike(String value) {
            addCriterion("JJLX_NAM like", value, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxNamNotLike(String value) {
            addCriterion("JJLX_NAM not like", value, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxNamIn(List<String> values) {
            addCriterion("JJLX_NAM in", values, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxNamNotIn(List<String> values) {
            addCriterion("JJLX_NAM not in", values, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxNamBetween(String value1, String value2) {
            addCriterion("JJLX_NAM between", value1, value2, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxNamNotBetween(String value1, String value2) {
            addCriterion("JJLX_NAM not between", value1, value2, "jjlxNam");
            return (Criteria) this;
        }

        public Criteria andJjlxTelIsNull() {
            addCriterion("JJLX_TEL is null");
            return (Criteria) this;
        }

        public Criteria andJjlxTelIsNotNull() {
            addCriterion("JJLX_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andJjlxTelEqualTo(String value) {
            addCriterion("JJLX_TEL =", value, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andJjlxTelNotEqualTo(String value) {
            addCriterion("JJLX_TEL <>", value, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andJjlxTelGreaterThan(String value) {
            addCriterion("JJLX_TEL >", value, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andJjlxTelGreaterThanOrEqualTo(String value) {
            addCriterion("JJLX_TEL >=", value, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andJjlxTelLessThan(String value) {
            addCriterion("JJLX_TEL <", value, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andJjlxTelLessThanOrEqualTo(String value) {
            addCriterion("JJLX_TEL <=", value, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andJjlxTelLike(String value) {
            addCriterion("JJLX_TEL like", value, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andJjlxTelNotLike(String value) {
            addCriterion("JJLX_TEL not like", value, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andJjlxTelIn(List<String> values) {
            addCriterion("JJLX_TEL in", values, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andJjlxTelNotIn(List<String> values) {
            addCriterion("JJLX_TEL not in", values, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andJjlxTelBetween(String value1, String value2) {
            addCriterion("JJLX_TEL between", value1, value2, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andJjlxTelNotBetween(String value1, String value2) {
            addCriterion("JJLX_TEL not between", value1, value2, "jjlxTel");
            return (Criteria) this;
        }

        public Criteria andQkCodIsNull() {
            addCriterion("QK_COD is null");
            return (Criteria) this;
        }

        public Criteria andQkCodIsNotNull() {
            addCriterion("QK_COD is not null");
            return (Criteria) this;
        }

        public Criteria andQkCodEqualTo(String value) {
            addCriterion("QK_COD =", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodNotEqualTo(String value) {
            addCriterion("QK_COD <>", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodGreaterThan(String value) {
            addCriterion("QK_COD >", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodGreaterThanOrEqualTo(String value) {
            addCriterion("QK_COD >=", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodLessThan(String value) {
            addCriterion("QK_COD <", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodLessThanOrEqualTo(String value) {
            addCriterion("QK_COD <=", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodLike(String value) {
            addCriterion("QK_COD like", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodNotLike(String value) {
            addCriterion("QK_COD not like", value, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodIn(List<String> values) {
            addCriterion("QK_COD in", values, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodNotIn(List<String> values) {
            addCriterion("QK_COD not in", values, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodBetween(String value1, String value2) {
            addCriterion("QK_COD between", value1, value2, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQkCodNotBetween(String value1, String value2) {
            addCriterion("QK_COD not between", value1, value2, "qkCod");
            return (Criteria) this;
        }

        public Criteria andQxBfIsNull() {
            addCriterion("QX_BF is null");
            return (Criteria) this;
        }

        public Criteria andQxBfIsNotNull() {
            addCriterion("QX_BF is not null");
            return (Criteria) this;
        }

        public Criteria andQxBfEqualTo(String value) {
            addCriterion("QX_BF =", value, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxBfNotEqualTo(String value) {
            addCriterion("QX_BF <>", value, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxBfGreaterThan(String value) {
            addCriterion("QX_BF >", value, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxBfGreaterThanOrEqualTo(String value) {
            addCriterion("QX_BF >=", value, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxBfLessThan(String value) {
            addCriterion("QX_BF <", value, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxBfLessThanOrEqualTo(String value) {
            addCriterion("QX_BF <=", value, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxBfLike(String value) {
            addCriterion("QX_BF like", value, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxBfNotLike(String value) {
            addCriterion("QX_BF not like", value, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxBfIn(List<String> values) {
            addCriterion("QX_BF in", values, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxBfNotIn(List<String> values) {
            addCriterion("QX_BF not in", values, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxBfBetween(String value1, String value2) {
            addCriterion("QX_BF between", value1, value2, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxBfNotBetween(String value1, String value2) {
            addCriterion("QX_BF not between", value1, value2, "qxBf");
            return (Criteria) this;
        }

        public Criteria andQxZyhIsNull() {
            addCriterion("QX_ZYH is null");
            return (Criteria) this;
        }

        public Criteria andQxZyhIsNotNull() {
            addCriterion("QX_ZYH is not null");
            return (Criteria) this;
        }

        public Criteria andQxZyhEqualTo(String value) {
            addCriterion("QX_ZYH =", value, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andQxZyhNotEqualTo(String value) {
            addCriterion("QX_ZYH <>", value, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andQxZyhGreaterThan(String value) {
            addCriterion("QX_ZYH >", value, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andQxZyhGreaterThanOrEqualTo(String value) {
            addCriterion("QX_ZYH >=", value, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andQxZyhLessThan(String value) {
            addCriterion("QX_ZYH <", value, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andQxZyhLessThanOrEqualTo(String value) {
            addCriterion("QX_ZYH <=", value, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andQxZyhLike(String value) {
            addCriterion("QX_ZYH like", value, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andQxZyhNotLike(String value) {
            addCriterion("QX_ZYH not like", value, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andQxZyhIn(List<String> values) {
            addCriterion("QX_ZYH in", values, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andQxZyhNotIn(List<String> values) {
            addCriterion("QX_ZYH not in", values, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andQxZyhBetween(String value1, String value2) {
            addCriterion("QX_ZYH between", value1, value2, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andQxZyhNotBetween(String value1, String value2) {
            addCriterion("QX_ZYH not between", value1, value2, "qxZyh");
            return (Criteria) this;
        }

        public Criteria andPreAssNamIsNull() {
            addCriterion("PRE_ASS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andPreAssNamIsNotNull() {
            addCriterion("PRE_ASS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andPreAssNamEqualTo(String value) {
            addCriterion("PRE_ASS_NAM =", value, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andPreAssNamNotEqualTo(String value) {
            addCriterion("PRE_ASS_NAM <>", value, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andPreAssNamGreaterThan(String value) {
            addCriterion("PRE_ASS_NAM >", value, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andPreAssNamGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_ASS_NAM >=", value, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andPreAssNamLessThan(String value) {
            addCriterion("PRE_ASS_NAM <", value, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andPreAssNamLessThanOrEqualTo(String value) {
            addCriterion("PRE_ASS_NAM <=", value, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andPreAssNamLike(String value) {
            addCriterion("PRE_ASS_NAM like", value, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andPreAssNamNotLike(String value) {
            addCriterion("PRE_ASS_NAM not like", value, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andPreAssNamIn(List<String> values) {
            addCriterion("PRE_ASS_NAM in", values, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andPreAssNamNotIn(List<String> values) {
            addCriterion("PRE_ASS_NAM not in", values, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andPreAssNamBetween(String value1, String value2) {
            addCriterion("PRE_ASS_NAM between", value1, value2, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andPreAssNamNotBetween(String value1, String value2) {
            addCriterion("PRE_ASS_NAM not between", value1, value2, "preAssNam");
            return (Criteria) this;
        }

        public Criteria andQtNamIsNull() {
            addCriterion("QT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andQtNamIsNotNull() {
            addCriterion("QT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andQtNamEqualTo(String value) {
            addCriterion("QT_NAM =", value, "qtNam");
            return (Criteria) this;
        }

        public Criteria andQtNamNotEqualTo(String value) {
            addCriterion("QT_NAM <>", value, "qtNam");
            return (Criteria) this;
        }

        public Criteria andQtNamGreaterThan(String value) {
            addCriterion("QT_NAM >", value, "qtNam");
            return (Criteria) this;
        }

        public Criteria andQtNamGreaterThanOrEqualTo(String value) {
            addCriterion("QT_NAM >=", value, "qtNam");
            return (Criteria) this;
        }

        public Criteria andQtNamLessThan(String value) {
            addCriterion("QT_NAM <", value, "qtNam");
            return (Criteria) this;
        }

        public Criteria andQtNamLessThanOrEqualTo(String value) {
            addCriterion("QT_NAM <=", value, "qtNam");
            return (Criteria) this;
        }

        public Criteria andQtNamLike(String value) {
            addCriterion("QT_NAM like", value, "qtNam");
            return (Criteria) this;
        }

        public Criteria andQtNamNotLike(String value) {
            addCriterion("QT_NAM not like", value, "qtNam");
            return (Criteria) this;
        }

        public Criteria andQtNamIn(List<String> values) {
            addCriterion("QT_NAM in", values, "qtNam");
            return (Criteria) this;
        }

        public Criteria andQtNamNotIn(List<String> values) {
            addCriterion("QT_NAM not in", values, "qtNam");
            return (Criteria) this;
        }

        public Criteria andQtNamBetween(String value1, String value2) {
            addCriterion("QT_NAM between", value1, value2, "qtNam");
            return (Criteria) this;
        }

        public Criteria andQtNamNotBetween(String value1, String value2) {
            addCriterion("QT_NAM not between", value1, value2, "qtNam");
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

        public Criteria andCreateNbrIsNull() {
            addCriterion("CREATE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andCreateNbrIsNotNull() {
            addCriterion("CREATE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNbrEqualTo(String value) {
            addCriterion("CREATE_NBR =", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrNotEqualTo(String value) {
            addCriterion("CREATE_NBR <>", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrGreaterThan(String value) {
            addCriterion("CREATE_NBR >", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_NBR >=", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrLessThan(String value) {
            addCriterion("CREATE_NBR <", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrLessThanOrEqualTo(String value) {
            addCriterion("CREATE_NBR <=", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrLike(String value) {
            addCriterion("CREATE_NBR like", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrNotLike(String value) {
            addCriterion("CREATE_NBR not like", value, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrIn(List<String> values) {
            addCriterion("CREATE_NBR in", values, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrNotIn(List<String> values) {
            addCriterion("CREATE_NBR not in", values, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrBetween(String value1, String value2) {
            addCriterion("CREATE_NBR between", value1, value2, "createNbr");
            return (Criteria) this;
        }

        public Criteria andCreateNbrNotBetween(String value1, String value2) {
            addCriterion("CREATE_NBR not between", value1, value2, "createNbr");
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

        public Criteria andUpdateNbrIsNull() {
            addCriterion("UPDATE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrIsNotNull() {
            addCriterion("UPDATE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrEqualTo(String value) {
            addCriterion("UPDATE_NBR =", value, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrNotEqualTo(String value) {
            addCriterion("UPDATE_NBR <>", value, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrGreaterThan(String value) {
            addCriterion("UPDATE_NBR >", value, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_NBR >=", value, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrLessThan(String value) {
            addCriterion("UPDATE_NBR <", value, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_NBR <=", value, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrLike(String value) {
            addCriterion("UPDATE_NBR like", value, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrNotLike(String value) {
            addCriterion("UPDATE_NBR not like", value, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrIn(List<String> values) {
            addCriterion("UPDATE_NBR in", values, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrNotIn(List<String> values) {
            addCriterion("UPDATE_NBR not in", values, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrBetween(String value1, String value2) {
            addCriterion("UPDATE_NBR between", value1, value2, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andUpdateNbrNotBetween(String value1, String value2) {
            addCriterion("UPDATE_NBR not between", value1, value2, "updateNbr");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamIsNull() {
            addCriterion("QT_OBJ1_NAM is null");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamIsNotNull() {
            addCriterion("QT_OBJ1_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamEqualTo(String value) {
            addCriterion("QT_OBJ1_NAM =", value, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamNotEqualTo(String value) {
            addCriterion("QT_OBJ1_NAM <>", value, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamGreaterThan(String value) {
            addCriterion("QT_OBJ1_NAM >", value, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamGreaterThanOrEqualTo(String value) {
            addCriterion("QT_OBJ1_NAM >=", value, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamLessThan(String value) {
            addCriterion("QT_OBJ1_NAM <", value, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamLessThanOrEqualTo(String value) {
            addCriterion("QT_OBJ1_NAM <=", value, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamLike(String value) {
            addCriterion("QT_OBJ1_NAM like", value, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamNotLike(String value) {
            addCriterion("QT_OBJ1_NAM not like", value, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamIn(List<String> values) {
            addCriterion("QT_OBJ1_NAM in", values, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamNotIn(List<String> values) {
            addCriterion("QT_OBJ1_NAM not in", values, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamBetween(String value1, String value2) {
            addCriterion("QT_OBJ1_NAM between", value1, value2, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj1NamNotBetween(String value1, String value2) {
            addCriterion("QT_OBJ1_NAM not between", value1, value2, "qtObj1Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamIsNull() {
            addCriterion("QT_OBJ2_NAM is null");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamIsNotNull() {
            addCriterion("QT_OBJ2_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamEqualTo(String value) {
            addCriterion("QT_OBJ2_NAM =", value, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamNotEqualTo(String value) {
            addCriterion("QT_OBJ2_NAM <>", value, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamGreaterThan(String value) {
            addCriterion("QT_OBJ2_NAM >", value, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamGreaterThanOrEqualTo(String value) {
            addCriterion("QT_OBJ2_NAM >=", value, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamLessThan(String value) {
            addCriterion("QT_OBJ2_NAM <", value, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamLessThanOrEqualTo(String value) {
            addCriterion("QT_OBJ2_NAM <=", value, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamLike(String value) {
            addCriterion("QT_OBJ2_NAM like", value, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamNotLike(String value) {
            addCriterion("QT_OBJ2_NAM not like", value, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamIn(List<String> values) {
            addCriterion("QT_OBJ2_NAM in", values, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamNotIn(List<String> values) {
            addCriterion("QT_OBJ2_NAM not in", values, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamBetween(String value1, String value2) {
            addCriterion("QT_OBJ2_NAM between", value1, value2, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andQtObj2NamNotBetween(String value1, String value2) {
            addCriterion("QT_OBJ2_NAM not between", value1, value2, "qtObj2Nam");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgIsNull() {
            addCriterion("PBG_NBR_FLG is null");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgIsNotNull() {
            addCriterion("PBG_NBR_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgEqualTo(String value) {
            addCriterion("PBG_NBR_FLG =", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgNotEqualTo(String value) {
            addCriterion("PBG_NBR_FLG <>", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgGreaterThan(String value) {
            addCriterion("PBG_NBR_FLG >", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgGreaterThanOrEqualTo(String value) {
            addCriterion("PBG_NBR_FLG >=", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgLessThan(String value) {
            addCriterion("PBG_NBR_FLG <", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgLessThanOrEqualTo(String value) {
            addCriterion("PBG_NBR_FLG <=", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgLike(String value) {
            addCriterion("PBG_NBR_FLG like", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgNotLike(String value) {
            addCriterion("PBG_NBR_FLG not like", value, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgIn(List<String> values) {
            addCriterion("PBG_NBR_FLG in", values, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgNotIn(List<String> values) {
            addCriterion("PBG_NBR_FLG not in", values, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgBetween(String value1, String value2) {
            addCriterion("PBG_NBR_FLG between", value1, value2, "pbgNbrFlg");
            return (Criteria) this;
        }

        public Criteria andPbgNbrFlgNotBetween(String value1, String value2) {
            addCriterion("PBG_NBR_FLG not between", value1, value2, "pbgNbrFlg");
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

        public Criteria andTkLeftOtherIsNull() {
            addCriterion("TK_LEFT_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherIsNotNull() {
            addCriterion("TK_LEFT_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherEqualTo(String value) {
            addCriterion("TK_LEFT_OTHER =", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherNotEqualTo(String value) {
            addCriterion("TK_LEFT_OTHER <>", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherGreaterThan(String value) {
            addCriterion("TK_LEFT_OTHER >", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherGreaterThanOrEqualTo(String value) {
            addCriterion("TK_LEFT_OTHER >=", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherLessThan(String value) {
            addCriterion("TK_LEFT_OTHER <", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherLessThanOrEqualTo(String value) {
            addCriterion("TK_LEFT_OTHER <=", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherLike(String value) {
            addCriterion("TK_LEFT_OTHER like", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherNotLike(String value) {
            addCriterion("TK_LEFT_OTHER not like", value, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherIn(List<String> values) {
            addCriterion("TK_LEFT_OTHER in", values, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherNotIn(List<String> values) {
            addCriterion("TK_LEFT_OTHER not in", values, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherBetween(String value1, String value2) {
            addCriterion("TK_LEFT_OTHER between", value1, value2, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkLeftOtherNotBetween(String value1, String value2) {
            addCriterion("TK_LEFT_OTHER not between", value1, value2, "tkLeftOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherIsNull() {
            addCriterion("TK_RIGHT_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherIsNotNull() {
            addCriterion("TK_RIGHT_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherEqualTo(String value) {
            addCriterion("TK_RIGHT_OTHER =", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherNotEqualTo(String value) {
            addCriterion("TK_RIGHT_OTHER <>", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherGreaterThan(String value) {
            addCriterion("TK_RIGHT_OTHER >", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherGreaterThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT_OTHER >=", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherLessThan(String value) {
            addCriterion("TK_RIGHT_OTHER <", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherLessThanOrEqualTo(String value) {
            addCriterion("TK_RIGHT_OTHER <=", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherLike(String value) {
            addCriterion("TK_RIGHT_OTHER like", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherNotLike(String value) {
            addCriterion("TK_RIGHT_OTHER not like", value, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherIn(List<String> values) {
            addCriterion("TK_RIGHT_OTHER in", values, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherNotIn(List<String> values) {
            addCriterion("TK_RIGHT_OTHER not in", values, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherBetween(String value1, String value2) {
            addCriterion("TK_RIGHT_OTHER between", value1, value2, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andTkRightOtherNotBetween(String value1, String value2) {
            addCriterion("TK_RIGHT_OTHER not between", value1, value2, "tkRightOther");
            return (Criteria) this;
        }

        public Criteria andBradenSeqIsNull() {
            addCriterion("BRADEN_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBradenSeqIsNotNull() {
            addCriterion("BRADEN_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBradenSeqEqualTo(String value) {
            addCriterion("BRADEN_SEQ =", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqNotEqualTo(String value) {
            addCriterion("BRADEN_SEQ <>", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqGreaterThan(String value) {
            addCriterion("BRADEN_SEQ >", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqGreaterThanOrEqualTo(String value) {
            addCriterion("BRADEN_SEQ >=", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqLessThan(String value) {
            addCriterion("BRADEN_SEQ <", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqLessThanOrEqualTo(String value) {
            addCriterion("BRADEN_SEQ <=", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqLike(String value) {
            addCriterion("BRADEN_SEQ like", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqNotLike(String value) {
            addCriterion("BRADEN_SEQ not like", value, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqIn(List<String> values) {
            addCriterion("BRADEN_SEQ in", values, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqNotIn(List<String> values) {
            addCriterion("BRADEN_SEQ not in", values, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqBetween(String value1, String value2) {
            addCriterion("BRADEN_SEQ between", value1, value2, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andBradenSeqNotBetween(String value1, String value2) {
            addCriterion("BRADEN_SEQ not between", value1, value2, "bradenSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqIsNull() {
            addCriterion("FALLD_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFalldSeqIsNotNull() {
            addCriterion("FALLD_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFalldSeqEqualTo(String value) {
            addCriterion("FALLD_SEQ =", value, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqNotEqualTo(String value) {
            addCriterion("FALLD_SEQ <>", value, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqGreaterThan(String value) {
            addCriterion("FALLD_SEQ >", value, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FALLD_SEQ >=", value, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqLessThan(String value) {
            addCriterion("FALLD_SEQ <", value, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqLessThanOrEqualTo(String value) {
            addCriterion("FALLD_SEQ <=", value, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqLike(String value) {
            addCriterion("FALLD_SEQ like", value, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqNotLike(String value) {
            addCriterion("FALLD_SEQ not like", value, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqIn(List<String> values) {
            addCriterion("FALLD_SEQ in", values, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqNotIn(List<String> values) {
            addCriterion("FALLD_SEQ not in", values, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqBetween(String value1, String value2) {
            addCriterion("FALLD_SEQ between", value1, value2, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andFalldSeqNotBetween(String value1, String value2) {
            addCriterion("FALLD_SEQ not between", value1, value2, "falldSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqIsNull() {
            addCriterion("ADL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andAdlSeqIsNotNull() {
            addCriterion("ADL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andAdlSeqEqualTo(String value) {
            addCriterion("ADL_SEQ =", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqNotEqualTo(String value) {
            addCriterion("ADL_SEQ <>", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqGreaterThan(String value) {
            addCriterion("ADL_SEQ >", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ADL_SEQ >=", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqLessThan(String value) {
            addCriterion("ADL_SEQ <", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqLessThanOrEqualTo(String value) {
            addCriterion("ADL_SEQ <=", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqLike(String value) {
            addCriterion("ADL_SEQ like", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqNotLike(String value) {
            addCriterion("ADL_SEQ not like", value, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqIn(List<String> values) {
            addCriterion("ADL_SEQ in", values, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqNotIn(List<String> values) {
            addCriterion("ADL_SEQ not in", values, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqBetween(String value1, String value2) {
            addCriterion("ADL_SEQ between", value1, value2, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andAdlSeqNotBetween(String value1, String value2) {
            addCriterion("ADL_SEQ not between", value1, value2, "adlSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqIsNull() {
            addCriterion("FALLRISK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqIsNotNull() {
            addCriterion("FALLRISK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqEqualTo(String value) {
            addCriterion("FALLRISK_SEQ =", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqNotEqualTo(String value) {
            addCriterion("FALLRISK_SEQ <>", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqGreaterThan(String value) {
            addCriterion("FALLRISK_SEQ >", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FALLRISK_SEQ >=", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqLessThan(String value) {
            addCriterion("FALLRISK_SEQ <", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqLessThanOrEqualTo(String value) {
            addCriterion("FALLRISK_SEQ <=", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqLike(String value) {
            addCriterion("FALLRISK_SEQ like", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqNotLike(String value) {
            addCriterion("FALLRISK_SEQ not like", value, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqIn(List<String> values) {
            addCriterion("FALLRISK_SEQ in", values, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqNotIn(List<String> values) {
            addCriterion("FALLRISK_SEQ not in", values, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqBetween(String value1, String value2) {
            addCriterion("FALLRISK_SEQ between", value1, value2, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andFallriskSeqNotBetween(String value1, String value2) {
            addCriterion("FALLRISK_SEQ not between", value1, value2, "fallriskSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqIsNull() {
            addCriterion("ZYFXPF_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqIsNotNull() {
            addCriterion("ZYFXPF_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqEqualTo(String value) {
            addCriterion("ZYFXPF_SEQ =", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqNotEqualTo(String value) {
            addCriterion("ZYFXPF_SEQ <>", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqGreaterThan(String value) {
            addCriterion("ZYFXPF_SEQ >", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ZYFXPF_SEQ >=", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqLessThan(String value) {
            addCriterion("ZYFXPF_SEQ <", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqLessThanOrEqualTo(String value) {
            addCriterion("ZYFXPF_SEQ <=", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqLike(String value) {
            addCriterion("ZYFXPF_SEQ like", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqNotLike(String value) {
            addCriterion("ZYFXPF_SEQ not like", value, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqIn(List<String> values) {
            addCriterion("ZYFXPF_SEQ in", values, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqNotIn(List<String> values) {
            addCriterion("ZYFXPF_SEQ not in", values, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqBetween(String value1, String value2) {
            addCriterion("ZYFXPF_SEQ between", value1, value2, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andZyfxpfSeqNotBetween(String value1, String value2) {
            addCriterion("ZYFXPF_SEQ not between", value1, value2, "zyfxpfSeq");
            return (Criteria) this;
        }

        public Criteria andSzCodIsNull() {
            addCriterion("SZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andSzCodIsNotNull() {
            addCriterion("SZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSzCodEqualTo(String value) {
            addCriterion("SZ_COD =", value, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzCodNotEqualTo(String value) {
            addCriterion("SZ_COD <>", value, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzCodGreaterThan(String value) {
            addCriterion("SZ_COD >", value, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzCodGreaterThanOrEqualTo(String value) {
            addCriterion("SZ_COD >=", value, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzCodLessThan(String value) {
            addCriterion("SZ_COD <", value, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzCodLessThanOrEqualTo(String value) {
            addCriterion("SZ_COD <=", value, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzCodLike(String value) {
            addCriterion("SZ_COD like", value, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzCodNotLike(String value) {
            addCriterion("SZ_COD not like", value, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzCodIn(List<String> values) {
            addCriterion("SZ_COD in", values, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzCodNotIn(List<String> values) {
            addCriterion("SZ_COD not in", values, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzCodBetween(String value1, String value2) {
            addCriterion("SZ_COD between", value1, value2, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzCodNotBetween(String value1, String value2) {
            addCriterion("SZ_COD not between", value1, value2, "szCod");
            return (Criteria) this;
        }

        public Criteria andSzOtherIsNull() {
            addCriterion("SZ_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andSzOtherIsNotNull() {
            addCriterion("SZ_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andSzOtherEqualTo(String value) {
            addCriterion("SZ_OTHER =", value, "szOther");
            return (Criteria) this;
        }

        public Criteria andSzOtherNotEqualTo(String value) {
            addCriterion("SZ_OTHER <>", value, "szOther");
            return (Criteria) this;
        }

        public Criteria andSzOtherGreaterThan(String value) {
            addCriterion("SZ_OTHER >", value, "szOther");
            return (Criteria) this;
        }

        public Criteria andSzOtherGreaterThanOrEqualTo(String value) {
            addCriterion("SZ_OTHER >=", value, "szOther");
            return (Criteria) this;
        }

        public Criteria andSzOtherLessThan(String value) {
            addCriterion("SZ_OTHER <", value, "szOther");
            return (Criteria) this;
        }

        public Criteria andSzOtherLessThanOrEqualTo(String value) {
            addCriterion("SZ_OTHER <=", value, "szOther");
            return (Criteria) this;
        }

        public Criteria andSzOtherLike(String value) {
            addCriterion("SZ_OTHER like", value, "szOther");
            return (Criteria) this;
        }

        public Criteria andSzOtherNotLike(String value) {
            addCriterion("SZ_OTHER not like", value, "szOther");
            return (Criteria) this;
        }

        public Criteria andSzOtherIn(List<String> values) {
            addCriterion("SZ_OTHER in", values, "szOther");
            return (Criteria) this;
        }

        public Criteria andSzOtherNotIn(List<String> values) {
            addCriterion("SZ_OTHER not in", values, "szOther");
            return (Criteria) this;
        }

        public Criteria andSzOtherBetween(String value1, String value2) {
            addCriterion("SZ_OTHER between", value1, value2, "szOther");
            return (Criteria) this;
        }

        public Criteria andSzOtherNotBetween(String value1, String value2) {
            addCriterion("SZ_OTHER not between", value1, value2, "szOther");
            return (Criteria) this;
        }

        public Criteria andWcdCodIsNull() {
            addCriterion("WCD_COD is null");
            return (Criteria) this;
        }

        public Criteria andWcdCodIsNotNull() {
            addCriterion("WCD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andWcdCodEqualTo(String value) {
            addCriterion("WCD_COD =", value, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdCodNotEqualTo(String value) {
            addCriterion("WCD_COD <>", value, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdCodGreaterThan(String value) {
            addCriterion("WCD_COD >", value, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdCodGreaterThanOrEqualTo(String value) {
            addCriterion("WCD_COD >=", value, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdCodLessThan(String value) {
            addCriterion("WCD_COD <", value, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdCodLessThanOrEqualTo(String value) {
            addCriterion("WCD_COD <=", value, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdCodLike(String value) {
            addCriterion("WCD_COD like", value, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdCodNotLike(String value) {
            addCriterion("WCD_COD not like", value, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdCodIn(List<String> values) {
            addCriterion("WCD_COD in", values, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdCodNotIn(List<String> values) {
            addCriterion("WCD_COD not in", values, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdCodBetween(String value1, String value2) {
            addCriterion("WCD_COD between", value1, value2, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdCodNotBetween(String value1, String value2) {
            addCriterion("WCD_COD not between", value1, value2, "wcdCod");
            return (Criteria) this;
        }

        public Criteria andWcdOtherIsNull() {
            addCriterion("WCD_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andWcdOtherIsNotNull() {
            addCriterion("WCD_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andWcdOtherEqualTo(String value) {
            addCriterion("WCD_OTHER =", value, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andWcdOtherNotEqualTo(String value) {
            addCriterion("WCD_OTHER <>", value, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andWcdOtherGreaterThan(String value) {
            addCriterion("WCD_OTHER >", value, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andWcdOtherGreaterThanOrEqualTo(String value) {
            addCriterion("WCD_OTHER >=", value, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andWcdOtherLessThan(String value) {
            addCriterion("WCD_OTHER <", value, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andWcdOtherLessThanOrEqualTo(String value) {
            addCriterion("WCD_OTHER <=", value, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andWcdOtherLike(String value) {
            addCriterion("WCD_OTHER like", value, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andWcdOtherNotLike(String value) {
            addCriterion("WCD_OTHER not like", value, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andWcdOtherIn(List<String> values) {
            addCriterion("WCD_OTHER in", values, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andWcdOtherNotIn(List<String> values) {
            addCriterion("WCD_OTHER not in", values, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andWcdOtherBetween(String value1, String value2) {
            addCriterion("WCD_OTHER between", value1, value2, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andWcdOtherNotBetween(String value1, String value2) {
            addCriterion("WCD_OTHER not between", value1, value2, "wcdOther");
            return (Criteria) this;
        }

        public Criteria andTtCodIsNull() {
            addCriterion("TT_COD is null");
            return (Criteria) this;
        }

        public Criteria andTtCodIsNotNull() {
            addCriterion("TT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTtCodEqualTo(String value) {
            addCriterion("TT_COD =", value, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtCodNotEqualTo(String value) {
            addCriterion("TT_COD <>", value, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtCodGreaterThan(String value) {
            addCriterion("TT_COD >", value, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtCodGreaterThanOrEqualTo(String value) {
            addCriterion("TT_COD >=", value, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtCodLessThan(String value) {
            addCriterion("TT_COD <", value, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtCodLessThanOrEqualTo(String value) {
            addCriterion("TT_COD <=", value, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtCodLike(String value) {
            addCriterion("TT_COD like", value, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtCodNotLike(String value) {
            addCriterion("TT_COD not like", value, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtCodIn(List<String> values) {
            addCriterion("TT_COD in", values, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtCodNotIn(List<String> values) {
            addCriterion("TT_COD not in", values, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtCodBetween(String value1, String value2) {
            addCriterion("TT_COD between", value1, value2, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtCodNotBetween(String value1, String value2) {
            addCriterion("TT_COD not between", value1, value2, "ttCod");
            return (Criteria) this;
        }

        public Criteria andTtBwIsNull() {
            addCriterion("TT_BW is null");
            return (Criteria) this;
        }

        public Criteria andTtBwIsNotNull() {
            addCriterion("TT_BW is not null");
            return (Criteria) this;
        }

        public Criteria andTtBwEqualTo(String value) {
            addCriterion("TT_BW =", value, "ttBw");
            return (Criteria) this;
        }

        public Criteria andTtBwNotEqualTo(String value) {
            addCriterion("TT_BW <>", value, "ttBw");
            return (Criteria) this;
        }

        public Criteria andTtBwGreaterThan(String value) {
            addCriterion("TT_BW >", value, "ttBw");
            return (Criteria) this;
        }

        public Criteria andTtBwGreaterThanOrEqualTo(String value) {
            addCriterion("TT_BW >=", value, "ttBw");
            return (Criteria) this;
        }

        public Criteria andTtBwLessThan(String value) {
            addCriterion("TT_BW <", value, "ttBw");
            return (Criteria) this;
        }

        public Criteria andTtBwLessThanOrEqualTo(String value) {
            addCriterion("TT_BW <=", value, "ttBw");
            return (Criteria) this;
        }

        public Criteria andTtBwLike(String value) {
            addCriterion("TT_BW like", value, "ttBw");
            return (Criteria) this;
        }

        public Criteria andTtBwNotLike(String value) {
            addCriterion("TT_BW not like", value, "ttBw");
            return (Criteria) this;
        }

        public Criteria andTtBwIn(List<String> values) {
            addCriterion("TT_BW in", values, "ttBw");
            return (Criteria) this;
        }

        public Criteria andTtBwNotIn(List<String> values) {
            addCriterion("TT_BW not in", values, "ttBw");
            return (Criteria) this;
        }

        public Criteria andTtBwBetween(String value1, String value2) {
            addCriterion("TT_BW between", value1, value2, "ttBw");
            return (Criteria) this;
        }

        public Criteria andTtBwNotBetween(String value1, String value2) {
            addCriterion("TT_BW not between", value1, value2, "ttBw");
            return (Criteria) this;
        }

        public Criteria andSzydCodIsNull() {
            addCriterion("SZYD_COD is null");
            return (Criteria) this;
        }

        public Criteria andSzydCodIsNotNull() {
            addCriterion("SZYD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSzydCodEqualTo(String value) {
            addCriterion("SZYD_COD =", value, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydCodNotEqualTo(String value) {
            addCriterion("SZYD_COD <>", value, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydCodGreaterThan(String value) {
            addCriterion("SZYD_COD >", value, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydCodGreaterThanOrEqualTo(String value) {
            addCriterion("SZYD_COD >=", value, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydCodLessThan(String value) {
            addCriterion("SZYD_COD <", value, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydCodLessThanOrEqualTo(String value) {
            addCriterion("SZYD_COD <=", value, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydCodLike(String value) {
            addCriterion("SZYD_COD like", value, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydCodNotLike(String value) {
            addCriterion("SZYD_COD not like", value, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydCodIn(List<String> values) {
            addCriterion("SZYD_COD in", values, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydCodNotIn(List<String> values) {
            addCriterion("SZYD_COD not in", values, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydCodBetween(String value1, String value2) {
            addCriterion("SZYD_COD between", value1, value2, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydCodNotBetween(String value1, String value2) {
            addCriterion("SZYD_COD not between", value1, value2, "szydCod");
            return (Criteria) this;
        }

        public Criteria andSzydOtherIsNull() {
            addCriterion("SZYD_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andSzydOtherIsNotNull() {
            addCriterion("SZYD_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andSzydOtherEqualTo(String value) {
            addCriterion("SZYD_OTHER =", value, "szydOther");
            return (Criteria) this;
        }

        public Criteria andSzydOtherNotEqualTo(String value) {
            addCriterion("SZYD_OTHER <>", value, "szydOther");
            return (Criteria) this;
        }

        public Criteria andSzydOtherGreaterThan(String value) {
            addCriterion("SZYD_OTHER >", value, "szydOther");
            return (Criteria) this;
        }

        public Criteria andSzydOtherGreaterThanOrEqualTo(String value) {
            addCriterion("SZYD_OTHER >=", value, "szydOther");
            return (Criteria) this;
        }

        public Criteria andSzydOtherLessThan(String value) {
            addCriterion("SZYD_OTHER <", value, "szydOther");
            return (Criteria) this;
        }

        public Criteria andSzydOtherLessThanOrEqualTo(String value) {
            addCriterion("SZYD_OTHER <=", value, "szydOther");
            return (Criteria) this;
        }

        public Criteria andSzydOtherLike(String value) {
            addCriterion("SZYD_OTHER like", value, "szydOther");
            return (Criteria) this;
        }

        public Criteria andSzydOtherNotLike(String value) {
            addCriterion("SZYD_OTHER not like", value, "szydOther");
            return (Criteria) this;
        }

        public Criteria andSzydOtherIn(List<String> values) {
            addCriterion("SZYD_OTHER in", values, "szydOther");
            return (Criteria) this;
        }

        public Criteria andSzydOtherNotIn(List<String> values) {
            addCriterion("SZYD_OTHER not in", values, "szydOther");
            return (Criteria) this;
        }

        public Criteria andSzydOtherBetween(String value1, String value2) {
            addCriterion("SZYD_OTHER between", value1, value2, "szydOther");
            return (Criteria) this;
        }

        public Criteria andSzydOtherNotBetween(String value1, String value2) {
            addCriterion("SZYD_OTHER not between", value1, value2, "szydOther");
            return (Criteria) this;
        }

        public Criteria andJbsCodIsNull() {
            addCriterion("JBS_COD is null");
            return (Criteria) this;
        }

        public Criteria andJbsCodIsNotNull() {
            addCriterion("JBS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJbsCodEqualTo(String value) {
            addCriterion("JBS_COD =", value, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsCodNotEqualTo(String value) {
            addCriterion("JBS_COD <>", value, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsCodGreaterThan(String value) {
            addCriterion("JBS_COD >", value, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsCodGreaterThanOrEqualTo(String value) {
            addCriterion("JBS_COD >=", value, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsCodLessThan(String value) {
            addCriterion("JBS_COD <", value, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsCodLessThanOrEqualTo(String value) {
            addCriterion("JBS_COD <=", value, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsCodLike(String value) {
            addCriterion("JBS_COD like", value, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsCodNotLike(String value) {
            addCriterion("JBS_COD not like", value, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsCodIn(List<String> values) {
            addCriterion("JBS_COD in", values, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsCodNotIn(List<String> values) {
            addCriterion("JBS_COD not in", values, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsCodBetween(String value1, String value2) {
            addCriterion("JBS_COD between", value1, value2, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsCodNotBetween(String value1, String value2) {
            addCriterion("JBS_COD not between", value1, value2, "jbsCod");
            return (Criteria) this;
        }

        public Criteria andJbsDesIsNull() {
            addCriterion("JBS_DES is null");
            return (Criteria) this;
        }

        public Criteria andJbsDesIsNotNull() {
            addCriterion("JBS_DES is not null");
            return (Criteria) this;
        }

        public Criteria andJbsDesEqualTo(String value) {
            addCriterion("JBS_DES =", value, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andJbsDesNotEqualTo(String value) {
            addCriterion("JBS_DES <>", value, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andJbsDesGreaterThan(String value) {
            addCriterion("JBS_DES >", value, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andJbsDesGreaterThanOrEqualTo(String value) {
            addCriterion("JBS_DES >=", value, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andJbsDesLessThan(String value) {
            addCriterion("JBS_DES <", value, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andJbsDesLessThanOrEqualTo(String value) {
            addCriterion("JBS_DES <=", value, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andJbsDesLike(String value) {
            addCriterion("JBS_DES like", value, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andJbsDesNotLike(String value) {
            addCriterion("JBS_DES not like", value, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andJbsDesIn(List<String> values) {
            addCriterion("JBS_DES in", values, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andJbsDesNotIn(List<String> values) {
            addCriterion("JBS_DES not in", values, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andJbsDesBetween(String value1, String value2) {
            addCriterion("JBS_DES between", value1, value2, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andJbsDesNotBetween(String value1, String value2) {
            addCriterion("JBS_DES not between", value1, value2, "jbsDes");
            return (Criteria) this;
        }

        public Criteria andSssCodIsNull() {
            addCriterion("SSS_COD is null");
            return (Criteria) this;
        }

        public Criteria andSssCodIsNotNull() {
            addCriterion("SSS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSssCodEqualTo(String value) {
            addCriterion("SSS_COD =", value, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssCodNotEqualTo(String value) {
            addCriterion("SSS_COD <>", value, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssCodGreaterThan(String value) {
            addCriterion("SSS_COD >", value, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssCodGreaterThanOrEqualTo(String value) {
            addCriterion("SSS_COD >=", value, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssCodLessThan(String value) {
            addCriterion("SSS_COD <", value, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssCodLessThanOrEqualTo(String value) {
            addCriterion("SSS_COD <=", value, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssCodLike(String value) {
            addCriterion("SSS_COD like", value, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssCodNotLike(String value) {
            addCriterion("SSS_COD not like", value, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssCodIn(List<String> values) {
            addCriterion("SSS_COD in", values, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssCodNotIn(List<String> values) {
            addCriterion("SSS_COD not in", values, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssCodBetween(String value1, String value2) {
            addCriterion("SSS_COD between", value1, value2, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssCodNotBetween(String value1, String value2) {
            addCriterion("SSS_COD not between", value1, value2, "sssCod");
            return (Criteria) this;
        }

        public Criteria andSssDesIsNull() {
            addCriterion("SSS_DES is null");
            return (Criteria) this;
        }

        public Criteria andSssDesIsNotNull() {
            addCriterion("SSS_DES is not null");
            return (Criteria) this;
        }

        public Criteria andSssDesEqualTo(String value) {
            addCriterion("SSS_DES =", value, "sssDes");
            return (Criteria) this;
        }

        public Criteria andSssDesNotEqualTo(String value) {
            addCriterion("SSS_DES <>", value, "sssDes");
            return (Criteria) this;
        }

        public Criteria andSssDesGreaterThan(String value) {
            addCriterion("SSS_DES >", value, "sssDes");
            return (Criteria) this;
        }

        public Criteria andSssDesGreaterThanOrEqualTo(String value) {
            addCriterion("SSS_DES >=", value, "sssDes");
            return (Criteria) this;
        }

        public Criteria andSssDesLessThan(String value) {
            addCriterion("SSS_DES <", value, "sssDes");
            return (Criteria) this;
        }

        public Criteria andSssDesLessThanOrEqualTo(String value) {
            addCriterion("SSS_DES <=", value, "sssDes");
            return (Criteria) this;
        }

        public Criteria andSssDesLike(String value) {
            addCriterion("SSS_DES like", value, "sssDes");
            return (Criteria) this;
        }

        public Criteria andSssDesNotLike(String value) {
            addCriterion("SSS_DES not like", value, "sssDes");
            return (Criteria) this;
        }

        public Criteria andSssDesIn(List<String> values) {
            addCriterion("SSS_DES in", values, "sssDes");
            return (Criteria) this;
        }

        public Criteria andSssDesNotIn(List<String> values) {
            addCriterion("SSS_DES not in", values, "sssDes");
            return (Criteria) this;
        }

        public Criteria andSssDesBetween(String value1, String value2) {
            addCriterion("SSS_DES between", value1, value2, "sssDes");
            return (Criteria) this;
        }

        public Criteria andSssDesNotBetween(String value1, String value2) {
            addCriterion("SSS_DES not between", value1, value2, "sssDes");
            return (Criteria) this;
        }

        public Criteria andGmsCodIsNull() {
            addCriterion("GMS_COD is null");
            return (Criteria) this;
        }

        public Criteria andGmsCodIsNotNull() {
            addCriterion("GMS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGmsCodEqualTo(String value) {
            addCriterion("GMS_COD =", value, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsCodNotEqualTo(String value) {
            addCriterion("GMS_COD <>", value, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsCodGreaterThan(String value) {
            addCriterion("GMS_COD >", value, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsCodGreaterThanOrEqualTo(String value) {
            addCriterion("GMS_COD >=", value, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsCodLessThan(String value) {
            addCriterion("GMS_COD <", value, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsCodLessThanOrEqualTo(String value) {
            addCriterion("GMS_COD <=", value, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsCodLike(String value) {
            addCriterion("GMS_COD like", value, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsCodNotLike(String value) {
            addCriterion("GMS_COD not like", value, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsCodIn(List<String> values) {
            addCriterion("GMS_COD in", values, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsCodNotIn(List<String> values) {
            addCriterion("GMS_COD not in", values, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsCodBetween(String value1, String value2) {
            addCriterion("GMS_COD between", value1, value2, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsCodNotBetween(String value1, String value2) {
            addCriterion("GMS_COD not between", value1, value2, "gmsCod");
            return (Criteria) this;
        }

        public Criteria andGmsDesIsNull() {
            addCriterion("GMS_DES is null");
            return (Criteria) this;
        }

        public Criteria andGmsDesIsNotNull() {
            addCriterion("GMS_DES is not null");
            return (Criteria) this;
        }

        public Criteria andGmsDesEqualTo(String value) {
            addCriterion("GMS_DES =", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesNotEqualTo(String value) {
            addCriterion("GMS_DES <>", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesGreaterThan(String value) {
            addCriterion("GMS_DES >", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesGreaterThanOrEqualTo(String value) {
            addCriterion("GMS_DES >=", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesLessThan(String value) {
            addCriterion("GMS_DES <", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesLessThanOrEqualTo(String value) {
            addCriterion("GMS_DES <=", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesLike(String value) {
            addCriterion("GMS_DES like", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesNotLike(String value) {
            addCriterion("GMS_DES not like", value, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesIn(List<String> values) {
            addCriterion("GMS_DES in", values, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesNotIn(List<String> values) {
            addCriterion("GMS_DES not in", values, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesBetween(String value1, String value2) {
            addCriterion("GMS_DES between", value1, value2, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGmsDesNotBetween(String value1, String value2) {
            addCriterion("GMS_DES not between", value1, value2, "gmsDes");
            return (Criteria) this;
        }

        public Criteria andGcsSeqIsNull() {
            addCriterion("GCS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andGcsSeqIsNotNull() {
            addCriterion("GCS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andGcsSeqEqualTo(String value) {
            addCriterion("GCS_SEQ =", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqNotEqualTo(String value) {
            addCriterion("GCS_SEQ <>", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqGreaterThan(String value) {
            addCriterion("GCS_SEQ >", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqGreaterThanOrEqualTo(String value) {
            addCriterion("GCS_SEQ >=", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqLessThan(String value) {
            addCriterion("GCS_SEQ <", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqLessThanOrEqualTo(String value) {
            addCriterion("GCS_SEQ <=", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqLike(String value) {
            addCriterion("GCS_SEQ like", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqNotLike(String value) {
            addCriterion("GCS_SEQ not like", value, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqIn(List<String> values) {
            addCriterion("GCS_SEQ in", values, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqNotIn(List<String> values) {
            addCriterion("GCS_SEQ not in", values, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqBetween(String value1, String value2) {
            addCriterion("GCS_SEQ between", value1, value2, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andGcsSeqNotBetween(String value1, String value2) {
            addCriterion("GCS_SEQ not between", value1, value2, "gcsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqIsNull() {
            addCriterion("NRS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andNrsSeqIsNotNull() {
            addCriterion("NRS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andNrsSeqEqualTo(String value) {
            addCriterion("NRS_SEQ =", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqNotEqualTo(String value) {
            addCriterion("NRS_SEQ <>", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqGreaterThan(String value) {
            addCriterion("NRS_SEQ >", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqGreaterThanOrEqualTo(String value) {
            addCriterion("NRS_SEQ >=", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqLessThan(String value) {
            addCriterion("NRS_SEQ <", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqLessThanOrEqualTo(String value) {
            addCriterion("NRS_SEQ <=", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqLike(String value) {
            addCriterion("NRS_SEQ like", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqNotLike(String value) {
            addCriterion("NRS_SEQ not like", value, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqIn(List<String> values) {
            addCriterion("NRS_SEQ in", values, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqNotIn(List<String> values) {
            addCriterion("NRS_SEQ not in", values, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqBetween(String value1, String value2) {
            addCriterion("NRS_SEQ between", value1, value2, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andNrsSeqNotBetween(String value1, String value2) {
            addCriterion("NRS_SEQ not between", value1, value2, "nrsSeq");
            return (Criteria) this;
        }

        public Criteria andGmsTypeIsNull() {
            addCriterion("GMS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGmsTypeIsNotNull() {
            addCriterion("GMS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGmsTypeEqualTo(String value) {
            addCriterion("GMS_TYPE =", value, "gmsType");
            return (Criteria) this;
        }

        public Criteria andGmsTypeNotEqualTo(String value) {
            addCriterion("GMS_TYPE <>", value, "gmsType");
            return (Criteria) this;
        }

        public Criteria andGmsTypeGreaterThan(String value) {
            addCriterion("GMS_TYPE >", value, "gmsType");
            return (Criteria) this;
        }

        public Criteria andGmsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GMS_TYPE >=", value, "gmsType");
            return (Criteria) this;
        }

        public Criteria andGmsTypeLessThan(String value) {
            addCriterion("GMS_TYPE <", value, "gmsType");
            return (Criteria) this;
        }

        public Criteria andGmsTypeLessThanOrEqualTo(String value) {
            addCriterion("GMS_TYPE <=", value, "gmsType");
            return (Criteria) this;
        }

        public Criteria andGmsTypeLike(String value) {
            addCriterion("GMS_TYPE like", value, "gmsType");
            return (Criteria) this;
        }

        public Criteria andGmsTypeNotLike(String value) {
            addCriterion("GMS_TYPE not like", value, "gmsType");
            return (Criteria) this;
        }

        public Criteria andGmsTypeIn(List<String> values) {
            addCriterion("GMS_TYPE in", values, "gmsType");
            return (Criteria) this;
        }

        public Criteria andGmsTypeNotIn(List<String> values) {
            addCriterion("GMS_TYPE not in", values, "gmsType");
            return (Criteria) this;
        }

        public Criteria andGmsTypeBetween(String value1, String value2) {
            addCriterion("GMS_TYPE between", value1, value2, "gmsType");
            return (Criteria) this;
        }

        public Criteria andGmsTypeNotBetween(String value1, String value2) {
            addCriterion("GMS_TYPE not between", value1, value2, "gmsType");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqIsNull() {
            addCriterion("DDFXPGB_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqIsNotNull() {
            addCriterion("DDFXPGB_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqEqualTo(String value) {
            addCriterion("DDFXPGB_SEQ =", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqNotEqualTo(String value) {
            addCriterion("DDFXPGB_SEQ <>", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqGreaterThan(String value) {
            addCriterion("DDFXPGB_SEQ >", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqGreaterThanOrEqualTo(String value) {
            addCriterion("DDFXPGB_SEQ >=", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqLessThan(String value) {
            addCriterion("DDFXPGB_SEQ <", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqLessThanOrEqualTo(String value) {
            addCriterion("DDFXPGB_SEQ <=", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqLike(String value) {
            addCriterion("DDFXPGB_SEQ like", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqNotLike(String value) {
            addCriterion("DDFXPGB_SEQ not like", value, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqIn(List<String> values) {
            addCriterion("DDFXPGB_SEQ in", values, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqNotIn(List<String> values) {
            addCriterion("DDFXPGB_SEQ not in", values, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqBetween(String value1, String value2) {
            addCriterion("DDFXPGB_SEQ between", value1, value2, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andDdfxpgbSeqNotBetween(String value1, String value2) {
            addCriterion("DDFXPGB_SEQ not between", value1, value2, "ddfxpgbSeq");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2IsNull() {
            addCriterion("JJLX_NAM2 is null");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2IsNotNull() {
            addCriterion("JJLX_NAM2 is not null");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2EqualTo(String value) {
            addCriterion("JJLX_NAM2 =", value, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2NotEqualTo(String value) {
            addCriterion("JJLX_NAM2 <>", value, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2GreaterThan(String value) {
            addCriterion("JJLX_NAM2 >", value, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2GreaterThanOrEqualTo(String value) {
            addCriterion("JJLX_NAM2 >=", value, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2LessThan(String value) {
            addCriterion("JJLX_NAM2 <", value, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2LessThanOrEqualTo(String value) {
            addCriterion("JJLX_NAM2 <=", value, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2Like(String value) {
            addCriterion("JJLX_NAM2 like", value, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2NotLike(String value) {
            addCriterion("JJLX_NAM2 not like", value, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2In(List<String> values) {
            addCriterion("JJLX_NAM2 in", values, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2NotIn(List<String> values) {
            addCriterion("JJLX_NAM2 not in", values, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2Between(String value1, String value2) {
            addCriterion("JJLX_NAM2 between", value1, value2, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxNam2NotBetween(String value1, String value2) {
            addCriterion("JJLX_NAM2 not between", value1, value2, "jjlxNam2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2IsNull() {
            addCriterion("JJLX_TEL2 is null");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2IsNotNull() {
            addCriterion("JJLX_TEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2EqualTo(String value) {
            addCriterion("JJLX_TEL2 =", value, "jjlxTel2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2NotEqualTo(String value) {
            addCriterion("JJLX_TEL2 <>", value, "jjlxTel2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2GreaterThan(String value) {
            addCriterion("JJLX_TEL2 >", value, "jjlxTel2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2GreaterThanOrEqualTo(String value) {
            addCriterion("JJLX_TEL2 >=", value, "jjlxTel2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2LessThan(String value) {
            addCriterion("JJLX_TEL2 <", value, "jjlxTel2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2LessThanOrEqualTo(String value) {
            addCriterion("JJLX_TEL2 <=", value, "jjlxTel2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2Like(String value) {
            addCriterion("JJLX_TEL2 like", value, "jjlxTel2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2NotLike(String value) {
            addCriterion("JJLX_TEL2 not like", value, "jjlxTel2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2In(List<String> values) {
            addCriterion("JJLX_TEL2 in", values, "jjlxTel2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2NotIn(List<String> values) {
            addCriterion("JJLX_TEL2 not in", values, "jjlxTel2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2Between(String value1, String value2) {
            addCriterion("JJLX_TEL2 between", value1, value2, "jjlxTel2");
            return (Criteria) this;
        }

        public Criteria andJjlxTel2NotBetween(String value1, String value2) {
            addCriterion("JJLX_TEL2 not between", value1, value2, "jjlxTel2");
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

        public Criteria andHlAddrOtherIsNull() {
            addCriterion("HL_ADDR_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherIsNotNull() {
            addCriterion("HL_ADDR_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherEqualTo(String value) {
            addCriterion("HL_ADDR_OTHER =", value, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherNotEqualTo(String value) {
            addCriterion("HL_ADDR_OTHER <>", value, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherGreaterThan(String value) {
            addCriterion("HL_ADDR_OTHER >", value, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherGreaterThanOrEqualTo(String value) {
            addCriterion("HL_ADDR_OTHER >=", value, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherLessThan(String value) {
            addCriterion("HL_ADDR_OTHER <", value, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherLessThanOrEqualTo(String value) {
            addCriterion("HL_ADDR_OTHER <=", value, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherLike(String value) {
            addCriterion("HL_ADDR_OTHER like", value, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherNotLike(String value) {
            addCriterion("HL_ADDR_OTHER not like", value, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherIn(List<String> values) {
            addCriterion("HL_ADDR_OTHER in", values, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherNotIn(List<String> values) {
            addCriterion("HL_ADDR_OTHER not in", values, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherBetween(String value1, String value2) {
            addCriterion("HL_ADDR_OTHER between", value1, value2, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlAddrOtherNotBetween(String value1, String value2) {
            addCriterion("HL_ADDR_OTHER not between", value1, value2, "hlAddrOther");
            return (Criteria) this;
        }

        public Criteria andHlbzCodIsNull() {
            addCriterion("HLBZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andHlbzCodIsNotNull() {
            addCriterion("HLBZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHlbzCodEqualTo(String value) {
            addCriterion("HLBZ_COD =", value, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzCodNotEqualTo(String value) {
            addCriterion("HLBZ_COD <>", value, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzCodGreaterThan(String value) {
            addCriterion("HLBZ_COD >", value, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzCodGreaterThanOrEqualTo(String value) {
            addCriterion("HLBZ_COD >=", value, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzCodLessThan(String value) {
            addCriterion("HLBZ_COD <", value, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzCodLessThanOrEqualTo(String value) {
            addCriterion("HLBZ_COD <=", value, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzCodLike(String value) {
            addCriterion("HLBZ_COD like", value, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzCodNotLike(String value) {
            addCriterion("HLBZ_COD not like", value, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzCodIn(List<String> values) {
            addCriterion("HLBZ_COD in", values, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzCodNotIn(List<String> values) {
            addCriterion("HLBZ_COD not in", values, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzCodBetween(String value1, String value2) {
            addCriterion("HLBZ_COD between", value1, value2, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzCodNotBetween(String value1, String value2) {
            addCriterion("HLBZ_COD not between", value1, value2, "hlbzCod");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherIsNull() {
            addCriterion("HLBZ_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherIsNotNull() {
            addCriterion("HLBZ_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherEqualTo(String value) {
            addCriterion("HLBZ_OTHER =", value, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherNotEqualTo(String value) {
            addCriterion("HLBZ_OTHER <>", value, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherGreaterThan(String value) {
            addCriterion("HLBZ_OTHER >", value, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherGreaterThanOrEqualTo(String value) {
            addCriterion("HLBZ_OTHER >=", value, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherLessThan(String value) {
            addCriterion("HLBZ_OTHER <", value, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherLessThanOrEqualTo(String value) {
            addCriterion("HLBZ_OTHER <=", value, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherLike(String value) {
            addCriterion("HLBZ_OTHER like", value, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherNotLike(String value) {
            addCriterion("HLBZ_OTHER not like", value, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherIn(List<String> values) {
            addCriterion("HLBZ_OTHER in", values, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherNotIn(List<String> values) {
            addCriterion("HLBZ_OTHER not in", values, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherBetween(String value1, String value2) {
            addCriterion("HLBZ_OTHER between", value1, value2, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andHlbzOtherNotBetween(String value1, String value2) {
            addCriterion("HLBZ_OTHER not between", value1, value2, "hlbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherIsNull() {
            addCriterion("CLBZ_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andClbzOtherIsNotNull() {
            addCriterion("CLBZ_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andClbzOtherEqualTo(String value) {
            addCriterion("CLBZ_OTHER =", value, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherNotEqualTo(String value) {
            addCriterion("CLBZ_OTHER <>", value, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherGreaterThan(String value) {
            addCriterion("CLBZ_OTHER >", value, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherGreaterThanOrEqualTo(String value) {
            addCriterion("CLBZ_OTHER >=", value, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherLessThan(String value) {
            addCriterion("CLBZ_OTHER <", value, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherLessThanOrEqualTo(String value) {
            addCriterion("CLBZ_OTHER <=", value, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherLike(String value) {
            addCriterion("CLBZ_OTHER like", value, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherNotLike(String value) {
            addCriterion("CLBZ_OTHER not like", value, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherIn(List<String> values) {
            addCriterion("CLBZ_OTHER in", values, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherNotIn(List<String> values) {
            addCriterion("CLBZ_OTHER not in", values, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherBetween(String value1, String value2) {
            addCriterion("CLBZ_OTHER between", value1, value2, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andClbzOtherNotBetween(String value1, String value2) {
            addCriterion("CLBZ_OTHER not between", value1, value2, "clbzOther");
            return (Criteria) this;
        }

        public Criteria andXyDesIsNull() {
            addCriterion("XY_DES is null");
            return (Criteria) this;
        }

        public Criteria andXyDesIsNotNull() {
            addCriterion("XY_DES is not null");
            return (Criteria) this;
        }

        public Criteria andXyDesEqualTo(String value) {
            addCriterion("XY_DES =", value, "xyDes");
            return (Criteria) this;
        }

        public Criteria andXyDesNotEqualTo(String value) {
            addCriterion("XY_DES <>", value, "xyDes");
            return (Criteria) this;
        }

        public Criteria andXyDesGreaterThan(String value) {
            addCriterion("XY_DES >", value, "xyDes");
            return (Criteria) this;
        }

        public Criteria andXyDesGreaterThanOrEqualTo(String value) {
            addCriterion("XY_DES >=", value, "xyDes");
            return (Criteria) this;
        }

        public Criteria andXyDesLessThan(String value) {
            addCriterion("XY_DES <", value, "xyDes");
            return (Criteria) this;
        }

        public Criteria andXyDesLessThanOrEqualTo(String value) {
            addCriterion("XY_DES <=", value, "xyDes");
            return (Criteria) this;
        }

        public Criteria andXyDesLike(String value) {
            addCriterion("XY_DES like", value, "xyDes");
            return (Criteria) this;
        }

        public Criteria andXyDesNotLike(String value) {
            addCriterion("XY_DES not like", value, "xyDes");
            return (Criteria) this;
        }

        public Criteria andXyDesIn(List<String> values) {
            addCriterion("XY_DES in", values, "xyDes");
            return (Criteria) this;
        }

        public Criteria andXyDesNotIn(List<String> values) {
            addCriterion("XY_DES not in", values, "xyDes");
            return (Criteria) this;
        }

        public Criteria andXyDesBetween(String value1, String value2) {
            addCriterion("XY_DES between", value1, value2, "xyDes");
            return (Criteria) this;
        }

        public Criteria andXyDesNotBetween(String value1, String value2) {
            addCriterion("XY_DES not between", value1, value2, "xyDes");
            return (Criteria) this;
        }

        public Criteria andInformDocDatIsNull() {
            addCriterion("INFORM_DOC_DAT is null");
            return (Criteria) this;
        }

        public Criteria andInformDocDatIsNotNull() {
            addCriterion("INFORM_DOC_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andInformDocDatEqualTo(Date value) {
            addCriterion("INFORM_DOC_DAT =", value, "informDocDat");
            return (Criteria) this;
        }

        public Criteria andInformDocDatNotEqualTo(Date value) {
            addCriterion("INFORM_DOC_DAT <>", value, "informDocDat");
            return (Criteria) this;
        }

        public Criteria andInformDocDatGreaterThan(Date value) {
            addCriterion("INFORM_DOC_DAT >", value, "informDocDat");
            return (Criteria) this;
        }

        public Criteria andInformDocDatGreaterThanOrEqualTo(Date value) {
            addCriterion("INFORM_DOC_DAT >=", value, "informDocDat");
            return (Criteria) this;
        }

        public Criteria andInformDocDatLessThan(Date value) {
            addCriterion("INFORM_DOC_DAT <", value, "informDocDat");
            return (Criteria) this;
        }

        public Criteria andInformDocDatLessThanOrEqualTo(Date value) {
            addCriterion("INFORM_DOC_DAT <=", value, "informDocDat");
            return (Criteria) this;
        }

        public Criteria andInformDocDatIn(List<Date> values) {
            addCriterion("INFORM_DOC_DAT in", values, "informDocDat");
            return (Criteria) this;
        }

        public Criteria andInformDocDatNotIn(List<Date> values) {
            addCriterion("INFORM_DOC_DAT not in", values, "informDocDat");
            return (Criteria) this;
        }

        public Criteria andInformDocDatBetween(Date value1, Date value2) {
            addCriterion("INFORM_DOC_DAT between", value1, value2, "informDocDat");
            return (Criteria) this;
        }

        public Criteria andInformDocDatNotBetween(Date value1, Date value2) {
            addCriterion("INFORM_DOC_DAT not between", value1, value2, "informDocDat");
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

        public Criteria andPreHospitalTreatmentIsNull() {
            addCriterion("PRE_HOSPITAL_TREATMENT is null");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentIsNotNull() {
            addCriterion("PRE_HOSPITAL_TREATMENT is not null");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentEqualTo(String value) {
            addCriterion("PRE_HOSPITAL_TREATMENT =", value, "preHospitalTreatment");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentNotEqualTo(String value) {
            addCriterion("PRE_HOSPITAL_TREATMENT <>", value, "preHospitalTreatment");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentGreaterThan(String value) {
            addCriterion("PRE_HOSPITAL_TREATMENT >", value, "preHospitalTreatment");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_HOSPITAL_TREATMENT >=", value, "preHospitalTreatment");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentLessThan(String value) {
            addCriterion("PRE_HOSPITAL_TREATMENT <", value, "preHospitalTreatment");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentLessThanOrEqualTo(String value) {
            addCriterion("PRE_HOSPITAL_TREATMENT <=", value, "preHospitalTreatment");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentLike(String value) {
            addCriterion("PRE_HOSPITAL_TREATMENT like", value, "preHospitalTreatment");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentNotLike(String value) {
            addCriterion("PRE_HOSPITAL_TREATMENT not like", value, "preHospitalTreatment");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentIn(List<String> values) {
            addCriterion("PRE_HOSPITAL_TREATMENT in", values, "preHospitalTreatment");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentNotIn(List<String> values) {
            addCriterion("PRE_HOSPITAL_TREATMENT not in", values, "preHospitalTreatment");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentBetween(String value1, String value2) {
            addCriterion("PRE_HOSPITAL_TREATMENT between", value1, value2, "preHospitalTreatment");
            return (Criteria) this;
        }

        public Criteria andPreHospitalTreatmentNotBetween(String value1, String value2) {
            addCriterion("PRE_HOSPITAL_TREATMENT not between", value1, value2, "preHospitalTreatment");
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

        public Criteria andTmpNbrEqualTo(String value) {
            addCriterion("TMP_NBR =", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotEqualTo(String value) {
            addCriterion("TMP_NBR <>", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrGreaterThan(String value) {
            addCriterion("TMP_NBR >", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrGreaterThanOrEqualTo(String value) {
            addCriterion("TMP_NBR >=", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLessThan(String value) {
            addCriterion("TMP_NBR <", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLessThanOrEqualTo(String value) {
            addCriterion("TMP_NBR <=", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrLike(String value) {
            addCriterion("TMP_NBR like", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotLike(String value) {
            addCriterion("TMP_NBR not like", value, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrIn(List<String> values) {
            addCriterion("TMP_NBR in", values, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotIn(List<String> values) {
            addCriterion("TMP_NBR not in", values, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrBetween(String value1, String value2) {
            addCriterion("TMP_NBR between", value1, value2, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andTmpNbrNotBetween(String value1, String value2) {
            addCriterion("TMP_NBR not between", value1, value2, "tmpNbr");
            return (Criteria) this;
        }

        public Criteria andPulseIsNull() {
            addCriterion("PULSE is null");
            return (Criteria) this;
        }

        public Criteria andPulseIsNotNull() {
            addCriterion("PULSE is not null");
            return (Criteria) this;
        }

        public Criteria andPulseEqualTo(String value) {
            addCriterion("PULSE =", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotEqualTo(String value) {
            addCriterion("PULSE <>", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseGreaterThan(String value) {
            addCriterion("PULSE >", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseGreaterThanOrEqualTo(String value) {
            addCriterion("PULSE >=", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLessThan(String value) {
            addCriterion("PULSE <", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLessThanOrEqualTo(String value) {
            addCriterion("PULSE <=", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLike(String value) {
            addCriterion("PULSE like", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotLike(String value) {
            addCriterion("PULSE not like", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseIn(List<String> values) {
            addCriterion("PULSE in", values, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotIn(List<String> values) {
            addCriterion("PULSE not in", values, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseBetween(String value1, String value2) {
            addCriterion("PULSE between", value1, value2, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotBetween(String value1, String value2) {
            addCriterion("PULSE not between", value1, value2, "pulse");
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

        public Criteria andBreNbrEqualTo(String value) {
            addCriterion("BRE_NBR =", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotEqualTo(String value) {
            addCriterion("BRE_NBR <>", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThan(String value) {
            addCriterion("BRE_NBR >", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThanOrEqualTo(String value) {
            addCriterion("BRE_NBR >=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThan(String value) {
            addCriterion("BRE_NBR <", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThanOrEqualTo(String value) {
            addCriterion("BRE_NBR <=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLike(String value) {
            addCriterion("BRE_NBR like", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotLike(String value) {
            addCriterion("BRE_NBR not like", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrIn(List<String> values) {
            addCriterion("BRE_NBR in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotIn(List<String> values) {
            addCriterion("BRE_NBR not in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrBetween(String value1, String value2) {
            addCriterion("BRE_NBR between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotBetween(String value1, String value2) {
            addCriterion("BRE_NBR not between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIsNull() {
            addCriterion("SBP_UP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIsNotNull() {
            addCriterion("SBP_UP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrEqualTo(String value) {
            addCriterion("SBP_UP_NBR =", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotEqualTo(String value) {
            addCriterion("SBP_UP_NBR <>", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrGreaterThan(String value) {
            addCriterion("SBP_UP_NBR >", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrGreaterThanOrEqualTo(String value) {
            addCriterion("SBP_UP_NBR >=", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLessThan(String value) {
            addCriterion("SBP_UP_NBR <", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLessThanOrEqualTo(String value) {
            addCriterion("SBP_UP_NBR <=", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLike(String value) {
            addCriterion("SBP_UP_NBR like", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotLike(String value) {
            addCriterion("SBP_UP_NBR not like", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIn(List<String> values) {
            addCriterion("SBP_UP_NBR in", values, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotIn(List<String> values) {
            addCriterion("SBP_UP_NBR not in", values, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrBetween(String value1, String value2) {
            addCriterion("SBP_UP_NBR between", value1, value2, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotBetween(String value1, String value2) {
            addCriterion("SBP_UP_NBR not between", value1, value2, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIsNull() {
            addCriterion("SBP_DOWN_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIsNotNull() {
            addCriterion("SBP_DOWN_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR =", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR <>", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrGreaterThan(String value) {
            addCriterion("SBP_DOWN_NBR >", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrGreaterThanOrEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR >=", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLessThan(String value) {
            addCriterion("SBP_DOWN_NBR <", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLessThanOrEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR <=", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLike(String value) {
            addCriterion("SBP_DOWN_NBR like", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotLike(String value) {
            addCriterion("SBP_DOWN_NBR not like", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIn(List<String> values) {
            addCriterion("SBP_DOWN_NBR in", values, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotIn(List<String> values) {
            addCriterion("SBP_DOWN_NBR not in", values, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrBetween(String value1, String value2) {
            addCriterion("SBP_DOWN_NBR between", value1, value2, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotBetween(String value1, String value2) {
            addCriterion("SBP_DOWN_NBR not between", value1, value2, "sbpDownNbr");
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

        public Criteria andOxyNbrEqualTo(String value) {
            addCriterion("OXY_NBR =", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotEqualTo(String value) {
            addCriterion("OXY_NBR <>", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrGreaterThan(String value) {
            addCriterion("OXY_NBR >", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrGreaterThanOrEqualTo(String value) {
            addCriterion("OXY_NBR >=", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrLessThan(String value) {
            addCriterion("OXY_NBR <", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrLessThanOrEqualTo(String value) {
            addCriterion("OXY_NBR <=", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrLike(String value) {
            addCriterion("OXY_NBR like", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotLike(String value) {
            addCriterion("OXY_NBR not like", value, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrIn(List<String> values) {
            addCriterion("OXY_NBR in", values, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotIn(List<String> values) {
            addCriterion("OXY_NBR not in", values, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrBetween(String value1, String value2) {
            addCriterion("OXY_NBR between", value1, value2, "oxyNbr");
            return (Criteria) this;
        }

        public Criteria andOxyNbrNotBetween(String value1, String value2) {
            addCriterion("OXY_NBR not between", value1, value2, "oxyNbr");
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

        public Criteria andHrtRteEqualTo(String value) {
            addCriterion("HRT_RTE =", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotEqualTo(String value) {
            addCriterion("HRT_RTE <>", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThan(String value) {
            addCriterion("HRT_RTE >", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThanOrEqualTo(String value) {
            addCriterion("HRT_RTE >=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThan(String value) {
            addCriterion("HRT_RTE <", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThanOrEqualTo(String value) {
            addCriterion("HRT_RTE <=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLike(String value) {
            addCriterion("HRT_RTE like", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotLike(String value) {
            addCriterion("HRT_RTE not like", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteIn(List<String> values) {
            addCriterion("HRT_RTE in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotIn(List<String> values) {
            addCriterion("HRT_RTE not in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteBetween(String value1, String value2) {
            addCriterion("HRT_RTE between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotBetween(String value1, String value2) {
            addCriterion("HRT_RTE not between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNull() {
            addCriterion("WORK_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNotNull() {
            addCriterion("WORK_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressEqualTo(String value) {
            addCriterion("WORK_ADDRESS =", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotEqualTo(String value) {
            addCriterion("WORK_ADDRESS <>", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThan(String value) {
            addCriterion("WORK_ADDRESS >", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_ADDRESS >=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThan(String value) {
            addCriterion("WORK_ADDRESS <", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThanOrEqualTo(String value) {
            addCriterion("WORK_ADDRESS <=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLike(String value) {
            addCriterion("WORK_ADDRESS like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotLike(String value) {
            addCriterion("WORK_ADDRESS not like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIn(List<String> values) {
            addCriterion("WORK_ADDRESS in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotIn(List<String> values) {
            addCriterion("WORK_ADDRESS not in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressBetween(String value1, String value2) {
            addCriterion("WORK_ADDRESS between", value1, value2, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotBetween(String value1, String value2) {
            addCriterion("WORK_ADDRESS not between", value1, value2, "workAddress");
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

        public Criteria andTmpNbrFlgIsNull() {
            addCriterion("TMP_NBR_FLG is null");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgIsNotNull() {
            addCriterion("TMP_NBR_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgEqualTo(String value) {
            addCriterion("TMP_NBR_FLG =", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgNotEqualTo(String value) {
            addCriterion("TMP_NBR_FLG <>", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgGreaterThan(String value) {
            addCriterion("TMP_NBR_FLG >", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgGreaterThanOrEqualTo(String value) {
            addCriterion("TMP_NBR_FLG >=", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgLessThan(String value) {
            addCriterion("TMP_NBR_FLG <", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgLessThanOrEqualTo(String value) {
            addCriterion("TMP_NBR_FLG <=", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgLike(String value) {
            addCriterion("TMP_NBR_FLG like", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgNotLike(String value) {
            addCriterion("TMP_NBR_FLG not like", value, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgIn(List<String> values) {
            addCriterion("TMP_NBR_FLG in", values, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgNotIn(List<String> values) {
            addCriterion("TMP_NBR_FLG not in", values, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgBetween(String value1, String value2) {
            addCriterion("TMP_NBR_FLG between", value1, value2, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andTmpNbrFlgNotBetween(String value1, String value2) {
            addCriterion("TMP_NBR_FLG not between", value1, value2, "tmpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgIsNull() {
            addCriterion("BRE_NBR_FLG is null");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgIsNotNull() {
            addCriterion("BRE_NBR_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgEqualTo(String value) {
            addCriterion("BRE_NBR_FLG =", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotEqualTo(String value) {
            addCriterion("BRE_NBR_FLG <>", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgGreaterThan(String value) {
            addCriterion("BRE_NBR_FLG >", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgGreaterThanOrEqualTo(String value) {
            addCriterion("BRE_NBR_FLG >=", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgLessThan(String value) {
            addCriterion("BRE_NBR_FLG <", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgLessThanOrEqualTo(String value) {
            addCriterion("BRE_NBR_FLG <=", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgLike(String value) {
            addCriterion("BRE_NBR_FLG like", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotLike(String value) {
            addCriterion("BRE_NBR_FLG not like", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgIn(List<String> values) {
            addCriterion("BRE_NBR_FLG in", values, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotIn(List<String> values) {
            addCriterion("BRE_NBR_FLG not in", values, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgBetween(String value1, String value2) {
            addCriterion("BRE_NBR_FLG between", value1, value2, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotBetween(String value1, String value2) {
            addCriterion("BRE_NBR_FLG not between", value1, value2, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgIsNull() {
            addCriterion("SBP_NBR_FLG is null");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgIsNotNull() {
            addCriterion("SBP_NBR_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgEqualTo(String value) {
            addCriterion("SBP_NBR_FLG =", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotEqualTo(String value) {
            addCriterion("SBP_NBR_FLG <>", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgGreaterThan(String value) {
            addCriterion("SBP_NBR_FLG >", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgGreaterThanOrEqualTo(String value) {
            addCriterion("SBP_NBR_FLG >=", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgLessThan(String value) {
            addCriterion("SBP_NBR_FLG <", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgLessThanOrEqualTo(String value) {
            addCriterion("SBP_NBR_FLG <=", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgLike(String value) {
            addCriterion("SBP_NBR_FLG like", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotLike(String value) {
            addCriterion("SBP_NBR_FLG not like", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgIn(List<String> values) {
            addCriterion("SBP_NBR_FLG in", values, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotIn(List<String> values) {
            addCriterion("SBP_NBR_FLG not in", values, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgBetween(String value1, String value2) {
            addCriterion("SBP_NBR_FLG between", value1, value2, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotBetween(String value1, String value2) {
            addCriterion("SBP_NBR_FLG not between", value1, value2, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgIsNull() {
            addCriterion("XY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXyFlgIsNotNull() {
            addCriterion("XY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXyFlgEqualTo(String value) {
            addCriterion("XY_FLG =", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotEqualTo(String value) {
            addCriterion("XY_FLG <>", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgGreaterThan(String value) {
            addCriterion("XY_FLG >", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XY_FLG >=", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgLessThan(String value) {
            addCriterion("XY_FLG <", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgLessThanOrEqualTo(String value) {
            addCriterion("XY_FLG <=", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgLike(String value) {
            addCriterion("XY_FLG like", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotLike(String value) {
            addCriterion("XY_FLG not like", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgIn(List<String> values) {
            addCriterion("XY_FLG in", values, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotIn(List<String> values) {
            addCriterion("XY_FLG not in", values, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgBetween(String value1, String value2) {
            addCriterion("XY_FLG between", value1, value2, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotBetween(String value1, String value2) {
            addCriterion("XY_FLG not between", value1, value2, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatIsNull() {
            addCriterion("ASSESSMENT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatIsNotNull() {
            addCriterion("ASSESSMENT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatEqualTo(Date value) {
            addCriterion("ASSESSMENT_DAT =", value, "assessmentDat");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatNotEqualTo(Date value) {
            addCriterion("ASSESSMENT_DAT <>", value, "assessmentDat");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatGreaterThan(Date value) {
            addCriterion("ASSESSMENT_DAT >", value, "assessmentDat");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatGreaterThanOrEqualTo(Date value) {
            addCriterion("ASSESSMENT_DAT >=", value, "assessmentDat");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatLessThan(Date value) {
            addCriterion("ASSESSMENT_DAT <", value, "assessmentDat");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatLessThanOrEqualTo(Date value) {
            addCriterion("ASSESSMENT_DAT <=", value, "assessmentDat");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatIn(List<Date> values) {
            addCriterion("ASSESSMENT_DAT in", values, "assessmentDat");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatNotIn(List<Date> values) {
            addCriterion("ASSESSMENT_DAT not in", values, "assessmentDat");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatBetween(Date value1, Date value2) {
            addCriterion("ASSESSMENT_DAT between", value1, value2, "assessmentDat");
            return (Criteria) this;
        }

        public Criteria andAssessmentDatNotBetween(Date value1, Date value2) {
            addCriterion("ASSESSMENT_DAT not between", value1, value2, "assessmentDat");
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

        public Criteria andSeeDocDatIsNull() {
            addCriterion("SEE_DOC_DAT is null");
            return (Criteria) this;
        }

        public Criteria andSeeDocDatIsNotNull() {
            addCriterion("SEE_DOC_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andSeeDocDatEqualTo(Date value) {
            addCriterion("SEE_DOC_DAT =", value, "seeDocDat");
            return (Criteria) this;
        }

        public Criteria andSeeDocDatNotEqualTo(Date value) {
            addCriterion("SEE_DOC_DAT <>", value, "seeDocDat");
            return (Criteria) this;
        }

        public Criteria andSeeDocDatGreaterThan(Date value) {
            addCriterion("SEE_DOC_DAT >", value, "seeDocDat");
            return (Criteria) this;
        }

        public Criteria andSeeDocDatGreaterThanOrEqualTo(Date value) {
            addCriterion("SEE_DOC_DAT >=", value, "seeDocDat");
            return (Criteria) this;
        }

        public Criteria andSeeDocDatLessThan(Date value) {
            addCriterion("SEE_DOC_DAT <", value, "seeDocDat");
            return (Criteria) this;
        }

        public Criteria andSeeDocDatLessThanOrEqualTo(Date value) {
            addCriterion("SEE_DOC_DAT <=", value, "seeDocDat");
            return (Criteria) this;
        }

        public Criteria andSeeDocDatIn(List<Date> values) {
            addCriterion("SEE_DOC_DAT in", values, "seeDocDat");
            return (Criteria) this;
        }

        public Criteria andSeeDocDatNotIn(List<Date> values) {
            addCriterion("SEE_DOC_DAT not in", values, "seeDocDat");
            return (Criteria) this;
        }

        public Criteria andSeeDocDatBetween(Date value1, Date value2) {
            addCriterion("SEE_DOC_DAT between", value1, value2, "seeDocDat");
            return (Criteria) this;
        }

        public Criteria andSeeDocDatNotBetween(Date value1, Date value2) {
            addCriterion("SEE_DOC_DAT not between", value1, value2, "seeDocDat");
            return (Criteria) this;
        }

        public Criteria andPulseFlgIsNull() {
            addCriterion("PULSE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andPulseFlgIsNotNull() {
            addCriterion("PULSE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andPulseFlgEqualTo(String value) {
            addCriterion("PULSE_FLG =", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgNotEqualTo(String value) {
            addCriterion("PULSE_FLG <>", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgGreaterThan(String value) {
            addCriterion("PULSE_FLG >", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgGreaterThanOrEqualTo(String value) {
            addCriterion("PULSE_FLG >=", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgLessThan(String value) {
            addCriterion("PULSE_FLG <", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgLessThanOrEqualTo(String value) {
            addCriterion("PULSE_FLG <=", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgLike(String value) {
            addCriterion("PULSE_FLG like", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgNotLike(String value) {
            addCriterion("PULSE_FLG not like", value, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgIn(List<String> values) {
            addCriterion("PULSE_FLG in", values, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgNotIn(List<String> values) {
            addCriterion("PULSE_FLG not in", values, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgBetween(String value1, String value2) {
            addCriterion("PULSE_FLG between", value1, value2, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andPulseFlgNotBetween(String value1, String value2) {
            addCriterion("PULSE_FLG not between", value1, value2, "pulseFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgIsNull() {
            addCriterion("HRT_RTE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgIsNotNull() {
            addCriterion("HRT_RTE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgEqualTo(String value) {
            addCriterion("HRT_RTE_FLG =", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgNotEqualTo(String value) {
            addCriterion("HRT_RTE_FLG <>", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgGreaterThan(String value) {
            addCriterion("HRT_RTE_FLG >", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgGreaterThanOrEqualTo(String value) {
            addCriterion("HRT_RTE_FLG >=", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgLessThan(String value) {
            addCriterion("HRT_RTE_FLG <", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgLessThanOrEqualTo(String value) {
            addCriterion("HRT_RTE_FLG <=", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgLike(String value) {
            addCriterion("HRT_RTE_FLG like", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgNotLike(String value) {
            addCriterion("HRT_RTE_FLG not like", value, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgIn(List<String> values) {
            addCriterion("HRT_RTE_FLG in", values, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgNotIn(List<String> values) {
            addCriterion("HRT_RTE_FLG not in", values, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgBetween(String value1, String value2) {
            addCriterion("HRT_RTE_FLG between", value1, value2, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andHrtRteFlgNotBetween(String value1, String value2) {
            addCriterion("HRT_RTE_FLG not between", value1, value2, "hrtRteFlg");
            return (Criteria) this;
        }

        public Criteria andYlxssDesIsNull() {
            addCriterion("YLXSS_DES is null");
            return (Criteria) this;
        }

        public Criteria andYlxssDesIsNotNull() {
            addCriterion("YLXSS_DES is not null");
            return (Criteria) this;
        }

        public Criteria andYlxssDesEqualTo(String value) {
            addCriterion("YLXSS_DES =", value, "ylxssDes");
            return (Criteria) this;
        }

        public Criteria andYlxssDesNotEqualTo(String value) {
            addCriterion("YLXSS_DES <>", value, "ylxssDes");
            return (Criteria) this;
        }

        public Criteria andYlxssDesGreaterThan(String value) {
            addCriterion("YLXSS_DES >", value, "ylxssDes");
            return (Criteria) this;
        }

        public Criteria andYlxssDesGreaterThanOrEqualTo(String value) {
            addCriterion("YLXSS_DES >=", value, "ylxssDes");
            return (Criteria) this;
        }

        public Criteria andYlxssDesLessThan(String value) {
            addCriterion("YLXSS_DES <", value, "ylxssDes");
            return (Criteria) this;
        }

        public Criteria andYlxssDesLessThanOrEqualTo(String value) {
            addCriterion("YLXSS_DES <=", value, "ylxssDes");
            return (Criteria) this;
        }

        public Criteria andYlxssDesLike(String value) {
            addCriterion("YLXSS_DES like", value, "ylxssDes");
            return (Criteria) this;
        }

        public Criteria andYlxssDesNotLike(String value) {
            addCriterion("YLXSS_DES not like", value, "ylxssDes");
            return (Criteria) this;
        }

        public Criteria andYlxssDesIn(List<String> values) {
            addCriterion("YLXSS_DES in", values, "ylxssDes");
            return (Criteria) this;
        }

        public Criteria andYlxssDesNotIn(List<String> values) {
            addCriterion("YLXSS_DES not in", values, "ylxssDes");
            return (Criteria) this;
        }

        public Criteria andYlxssDesBetween(String value1, String value2) {
            addCriterion("YLXSS_DES between", value1, value2, "ylxssDes");
            return (Criteria) this;
        }

        public Criteria andYlxssDesNotBetween(String value1, String value2) {
            addCriterion("YLXSS_DES not between", value1, value2, "ylxssDes");
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