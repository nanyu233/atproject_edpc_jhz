package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspJzcspgInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJzcspgInfExample() {
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

        public Criteria andTbCodIsNull() {
            addCriterion("TB_COD is null");
            return (Criteria) this;
        }

        public Criteria andTbCodIsNotNull() {
            addCriterion("TB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTbCodEqualTo(String value) {
            addCriterion("TB_COD =", value, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbCodNotEqualTo(String value) {
            addCriterion("TB_COD <>", value, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbCodGreaterThan(String value) {
            addCriterion("TB_COD >", value, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbCodGreaterThanOrEqualTo(String value) {
            addCriterion("TB_COD >=", value, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbCodLessThan(String value) {
            addCriterion("TB_COD <", value, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbCodLessThanOrEqualTo(String value) {
            addCriterion("TB_COD <=", value, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbCodLike(String value) {
            addCriterion("TB_COD like", value, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbCodNotLike(String value) {
            addCriterion("TB_COD not like", value, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbCodIn(List<String> values) {
            addCriterion("TB_COD in", values, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbCodNotIn(List<String> values) {
            addCriterion("TB_COD not in", values, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbCodBetween(String value1, String value2) {
            addCriterion("TB_COD between", value1, value2, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbCodNotBetween(String value1, String value2) {
            addCriterion("TB_COD not between", value1, value2, "tbCod");
            return (Criteria) this;
        }

        public Criteria andTbOtherIsNull() {
            addCriterion("TB_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andTbOtherIsNotNull() {
            addCriterion("TB_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andTbOtherEqualTo(String value) {
            addCriterion("TB_OTHER =", value, "tbOther");
            return (Criteria) this;
        }

        public Criteria andTbOtherNotEqualTo(String value) {
            addCriterion("TB_OTHER <>", value, "tbOther");
            return (Criteria) this;
        }

        public Criteria andTbOtherGreaterThan(String value) {
            addCriterion("TB_OTHER >", value, "tbOther");
            return (Criteria) this;
        }

        public Criteria andTbOtherGreaterThanOrEqualTo(String value) {
            addCriterion("TB_OTHER >=", value, "tbOther");
            return (Criteria) this;
        }

        public Criteria andTbOtherLessThan(String value) {
            addCriterion("TB_OTHER <", value, "tbOther");
            return (Criteria) this;
        }

        public Criteria andTbOtherLessThanOrEqualTo(String value) {
            addCriterion("TB_OTHER <=", value, "tbOther");
            return (Criteria) this;
        }

        public Criteria andTbOtherLike(String value) {
            addCriterion("TB_OTHER like", value, "tbOther");
            return (Criteria) this;
        }

        public Criteria andTbOtherNotLike(String value) {
            addCriterion("TB_OTHER not like", value, "tbOther");
            return (Criteria) this;
        }

        public Criteria andTbOtherIn(List<String> values) {
            addCriterion("TB_OTHER in", values, "tbOther");
            return (Criteria) this;
        }

        public Criteria andTbOtherNotIn(List<String> values) {
            addCriterion("TB_OTHER not in", values, "tbOther");
            return (Criteria) this;
        }

        public Criteria andTbOtherBetween(String value1, String value2) {
            addCriterion("TB_OTHER between", value1, value2, "tbOther");
            return (Criteria) this;
        }

        public Criteria andTbOtherNotBetween(String value1, String value2) {
            addCriterion("TB_OTHER not between", value1, value2, "tbOther");
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

        public Criteria andJbCodIsNull() {
            addCriterion("JB_COD is null");
            return (Criteria) this;
        }

        public Criteria andJbCodIsNotNull() {
            addCriterion("JB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJbCodEqualTo(String value) {
            addCriterion("JB_COD =", value, "jbCod");
            return (Criteria) this;
        }

        public Criteria andJbCodNotEqualTo(String value) {
            addCriterion("JB_COD <>", value, "jbCod");
            return (Criteria) this;
        }

        public Criteria andJbCodGreaterThan(String value) {
            addCriterion("JB_COD >", value, "jbCod");
            return (Criteria) this;
        }

        public Criteria andJbCodGreaterThanOrEqualTo(String value) {
            addCriterion("JB_COD >=", value, "jbCod");
            return (Criteria) this;
        }

        public Criteria andJbCodLessThan(String value) {
            addCriterion("JB_COD <", value, "jbCod");
            return (Criteria) this;
        }

        public Criteria andJbCodLessThanOrEqualTo(String value) {
            addCriterion("JB_COD <=", value, "jbCod");
            return (Criteria) this;
        }

        public Criteria andJbCodLike(String value) {
            addCriterion("JB_COD like", value, "jbCod");
            return (Criteria) this;
        }

        public Criteria andJbCodNotLike(String value) {
            addCriterion("JB_COD not like", value, "jbCod");
            return (Criteria) this;
        }

        public Criteria andJbCodIn(List<String> values) {
            addCriterion("JB_COD in", values, "jbCod");
            return (Criteria) this;
        }

        public Criteria andJbCodNotIn(List<String> values) {
            addCriterion("JB_COD not in", values, "jbCod");
            return (Criteria) this;
        }

        public Criteria andJbCodBetween(String value1, String value2) {
            addCriterion("JB_COD between", value1, value2, "jbCod");
            return (Criteria) this;
        }

        public Criteria andJbCodNotBetween(String value1, String value2) {
            addCriterion("JB_COD not between", value1, value2, "jbCod");
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

        public Criteria andXbCodIsNull() {
            addCriterion("XB_COD is null");
            return (Criteria) this;
        }

        public Criteria andXbCodIsNotNull() {
            addCriterion("XB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXbCodEqualTo(String value) {
            addCriterion("XB_COD =", value, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbCodNotEqualTo(String value) {
            addCriterion("XB_COD <>", value, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbCodGreaterThan(String value) {
            addCriterion("XB_COD >", value, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbCodGreaterThanOrEqualTo(String value) {
            addCriterion("XB_COD >=", value, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbCodLessThan(String value) {
            addCriterion("XB_COD <", value, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbCodLessThanOrEqualTo(String value) {
            addCriterion("XB_COD <=", value, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbCodLike(String value) {
            addCriterion("XB_COD like", value, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbCodNotLike(String value) {
            addCriterion("XB_COD not like", value, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbCodIn(List<String> values) {
            addCriterion("XB_COD in", values, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbCodNotIn(List<String> values) {
            addCriterion("XB_COD not in", values, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbCodBetween(String value1, String value2) {
            addCriterion("XB_COD between", value1, value2, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbCodNotBetween(String value1, String value2) {
            addCriterion("XB_COD not between", value1, value2, "xbCod");
            return (Criteria) this;
        }

        public Criteria andXbJyDesIsNull() {
            addCriterion("XB_JY_DES is null");
            return (Criteria) this;
        }

        public Criteria andXbJyDesIsNotNull() {
            addCriterion("XB_JY_DES is not null");
            return (Criteria) this;
        }

        public Criteria andXbJyDesEqualTo(String value) {
            addCriterion("XB_JY_DES =", value, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbJyDesNotEqualTo(String value) {
            addCriterion("XB_JY_DES <>", value, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbJyDesGreaterThan(String value) {
            addCriterion("XB_JY_DES >", value, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbJyDesGreaterThanOrEqualTo(String value) {
            addCriterion("XB_JY_DES >=", value, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbJyDesLessThan(String value) {
            addCriterion("XB_JY_DES <", value, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbJyDesLessThanOrEqualTo(String value) {
            addCriterion("XB_JY_DES <=", value, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbJyDesLike(String value) {
            addCriterion("XB_JY_DES like", value, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbJyDesNotLike(String value) {
            addCriterion("XB_JY_DES not like", value, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbJyDesIn(List<String> values) {
            addCriterion("XB_JY_DES in", values, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbJyDesNotIn(List<String> values) {
            addCriterion("XB_JY_DES not in", values, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbJyDesBetween(String value1, String value2) {
            addCriterion("XB_JY_DES between", value1, value2, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbJyDesNotBetween(String value1, String value2) {
            addCriterion("XB_JY_DES not between", value1, value2, "xbJyDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesIsNull() {
            addCriterion("XB_LEFT_DES is null");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesIsNotNull() {
            addCriterion("XB_LEFT_DES is not null");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesEqualTo(String value) {
            addCriterion("XB_LEFT_DES =", value, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesNotEqualTo(String value) {
            addCriterion("XB_LEFT_DES <>", value, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesGreaterThan(String value) {
            addCriterion("XB_LEFT_DES >", value, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesGreaterThanOrEqualTo(String value) {
            addCriterion("XB_LEFT_DES >=", value, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesLessThan(String value) {
            addCriterion("XB_LEFT_DES <", value, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesLessThanOrEqualTo(String value) {
            addCriterion("XB_LEFT_DES <=", value, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesLike(String value) {
            addCriterion("XB_LEFT_DES like", value, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesNotLike(String value) {
            addCriterion("XB_LEFT_DES not like", value, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesIn(List<String> values) {
            addCriterion("XB_LEFT_DES in", values, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesNotIn(List<String> values) {
            addCriterion("XB_LEFT_DES not in", values, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesBetween(String value1, String value2) {
            addCriterion("XB_LEFT_DES between", value1, value2, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbLeftDesNotBetween(String value1, String value2) {
            addCriterion("XB_LEFT_DES not between", value1, value2, "xbLeftDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesIsNull() {
            addCriterion("XB_RIGHT_DES is null");
            return (Criteria) this;
        }

        public Criteria andXbRightDesIsNotNull() {
            addCriterion("XB_RIGHT_DES is not null");
            return (Criteria) this;
        }

        public Criteria andXbRightDesEqualTo(String value) {
            addCriterion("XB_RIGHT_DES =", value, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesNotEqualTo(String value) {
            addCriterion("XB_RIGHT_DES <>", value, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesGreaterThan(String value) {
            addCriterion("XB_RIGHT_DES >", value, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesGreaterThanOrEqualTo(String value) {
            addCriterion("XB_RIGHT_DES >=", value, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesLessThan(String value) {
            addCriterion("XB_RIGHT_DES <", value, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesLessThanOrEqualTo(String value) {
            addCriterion("XB_RIGHT_DES <=", value, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesLike(String value) {
            addCriterion("XB_RIGHT_DES like", value, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesNotLike(String value) {
            addCriterion("XB_RIGHT_DES not like", value, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesIn(List<String> values) {
            addCriterion("XB_RIGHT_DES in", values, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesNotIn(List<String> values) {
            addCriterion("XB_RIGHT_DES not in", values, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesBetween(String value1, String value2) {
            addCriterion("XB_RIGHT_DES between", value1, value2, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbRightDesNotBetween(String value1, String value2) {
            addCriterion("XB_RIGHT_DES not between", value1, value2, "xbRightDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesIsNull() {
            addCriterion("XB_XC_DES is null");
            return (Criteria) this;
        }

        public Criteria andXbXcDesIsNotNull() {
            addCriterion("XB_XC_DES is not null");
            return (Criteria) this;
        }

        public Criteria andXbXcDesEqualTo(String value) {
            addCriterion("XB_XC_DES =", value, "xbXcDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesNotEqualTo(String value) {
            addCriterion("XB_XC_DES <>", value, "xbXcDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesGreaterThan(String value) {
            addCriterion("XB_XC_DES >", value, "xbXcDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesGreaterThanOrEqualTo(String value) {
            addCriterion("XB_XC_DES >=", value, "xbXcDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesLessThan(String value) {
            addCriterion("XB_XC_DES <", value, "xbXcDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesLessThanOrEqualTo(String value) {
            addCriterion("XB_XC_DES <=", value, "xbXcDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesLike(String value) {
            addCriterion("XB_XC_DES like", value, "xbXcDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesNotLike(String value) {
            addCriterion("XB_XC_DES not like", value, "xbXcDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesIn(List<String> values) {
            addCriterion("XB_XC_DES in", values, "xbXcDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesNotIn(List<String> values) {
            addCriterion("XB_XC_DES not in", values, "xbXcDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesBetween(String value1, String value2) {
            addCriterion("XB_XC_DES between", value1, value2, "xbXcDes");
            return (Criteria) this;
        }

        public Criteria andXbXcDesNotBetween(String value1, String value2) {
            addCriterion("XB_XC_DES not between", value1, value2, "xbXcDes");
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

        public Criteria andJzCodIsNull() {
            addCriterion("JZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andJzCodIsNotNull() {
            addCriterion("JZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andJzCodEqualTo(String value) {
            addCriterion("JZ_COD =", value, "jzCod");
            return (Criteria) this;
        }

        public Criteria andJzCodNotEqualTo(String value) {
            addCriterion("JZ_COD <>", value, "jzCod");
            return (Criteria) this;
        }

        public Criteria andJzCodGreaterThan(String value) {
            addCriterion("JZ_COD >", value, "jzCod");
            return (Criteria) this;
        }

        public Criteria andJzCodGreaterThanOrEqualTo(String value) {
            addCriterion("JZ_COD >=", value, "jzCod");
            return (Criteria) this;
        }

        public Criteria andJzCodLessThan(String value) {
            addCriterion("JZ_COD <", value, "jzCod");
            return (Criteria) this;
        }

        public Criteria andJzCodLessThanOrEqualTo(String value) {
            addCriterion("JZ_COD <=", value, "jzCod");
            return (Criteria) this;
        }

        public Criteria andJzCodLike(String value) {
            addCriterion("JZ_COD like", value, "jzCod");
            return (Criteria) this;
        }

        public Criteria andJzCodNotLike(String value) {
            addCriterion("JZ_COD not like", value, "jzCod");
            return (Criteria) this;
        }

        public Criteria andJzCodIn(List<String> values) {
            addCriterion("JZ_COD in", values, "jzCod");
            return (Criteria) this;
        }

        public Criteria andJzCodNotIn(List<String> values) {
            addCriterion("JZ_COD not in", values, "jzCod");
            return (Criteria) this;
        }

        public Criteria andJzCodBetween(String value1, String value2) {
            addCriterion("JZ_COD between", value1, value2, "jzCod");
            return (Criteria) this;
        }

        public Criteria andJzCodNotBetween(String value1, String value2) {
            addCriterion("JZ_COD not between", value1, value2, "jzCod");
            return (Criteria) this;
        }

        public Criteria andGpCodIsNull() {
            addCriterion("GP_COD is null");
            return (Criteria) this;
        }

        public Criteria andGpCodIsNotNull() {
            addCriterion("GP_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGpCodEqualTo(String value) {
            addCriterion("GP_COD =", value, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGpCodNotEqualTo(String value) {
            addCriterion("GP_COD <>", value, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGpCodGreaterThan(String value) {
            addCriterion("GP_COD >", value, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGpCodGreaterThanOrEqualTo(String value) {
            addCriterion("GP_COD >=", value, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGpCodLessThan(String value) {
            addCriterion("GP_COD <", value, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGpCodLessThanOrEqualTo(String value) {
            addCriterion("GP_COD <=", value, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGpCodLike(String value) {
            addCriterion("GP_COD like", value, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGpCodNotLike(String value) {
            addCriterion("GP_COD not like", value, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGpCodIn(List<String> values) {
            addCriterion("GP_COD in", values, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGpCodNotIn(List<String> values) {
            addCriterion("GP_COD not in", values, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGpCodBetween(String value1, String value2) {
            addCriterion("GP_COD between", value1, value2, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGpCodNotBetween(String value1, String value2) {
            addCriterion("GP_COD not between", value1, value2, "gpCod");
            return (Criteria) this;
        }

        public Criteria andGgCodIsNull() {
            addCriterion("GG_COD is null");
            return (Criteria) this;
        }

        public Criteria andGgCodIsNotNull() {
            addCriterion("GG_COD is not null");
            return (Criteria) this;
        }

        public Criteria andGgCodEqualTo(String value) {
            addCriterion("GG_COD =", value, "ggCod");
            return (Criteria) this;
        }

        public Criteria andGgCodNotEqualTo(String value) {
            addCriterion("GG_COD <>", value, "ggCod");
            return (Criteria) this;
        }

        public Criteria andGgCodGreaterThan(String value) {
            addCriterion("GG_COD >", value, "ggCod");
            return (Criteria) this;
        }

        public Criteria andGgCodGreaterThanOrEqualTo(String value) {
            addCriterion("GG_COD >=", value, "ggCod");
            return (Criteria) this;
        }

        public Criteria andGgCodLessThan(String value) {
            addCriterion("GG_COD <", value, "ggCod");
            return (Criteria) this;
        }

        public Criteria andGgCodLessThanOrEqualTo(String value) {
            addCriterion("GG_COD <=", value, "ggCod");
            return (Criteria) this;
        }

        public Criteria andGgCodLike(String value) {
            addCriterion("GG_COD like", value, "ggCod");
            return (Criteria) this;
        }

        public Criteria andGgCodNotLike(String value) {
            addCriterion("GG_COD not like", value, "ggCod");
            return (Criteria) this;
        }

        public Criteria andGgCodIn(List<String> values) {
            addCriterion("GG_COD in", values, "ggCod");
            return (Criteria) this;
        }

        public Criteria andGgCodNotIn(List<String> values) {
            addCriterion("GG_COD not in", values, "ggCod");
            return (Criteria) this;
        }

        public Criteria andGgCodBetween(String value1, String value2) {
            addCriterion("GG_COD between", value1, value2, "ggCod");
            return (Criteria) this;
        }

        public Criteria andGgCodNotBetween(String value1, String value2) {
            addCriterion("GG_COD not between", value1, value2, "ggCod");
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

        public Criteria andJmsyPvIsNull() {
            addCriterion("JMSY_PV is null");
            return (Criteria) this;
        }

        public Criteria andJmsyPvIsNotNull() {
            addCriterion("JMSY_PV is not null");
            return (Criteria) this;
        }

        public Criteria andJmsyPvEqualTo(String value) {
            addCriterion("JMSY_PV =", value, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyPvNotEqualTo(String value) {
            addCriterion("JMSY_PV <>", value, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyPvGreaterThan(String value) {
            addCriterion("JMSY_PV >", value, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyPvGreaterThanOrEqualTo(String value) {
            addCriterion("JMSY_PV >=", value, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyPvLessThan(String value) {
            addCriterion("JMSY_PV <", value, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyPvLessThanOrEqualTo(String value) {
            addCriterion("JMSY_PV <=", value, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyPvLike(String value) {
            addCriterion("JMSY_PV like", value, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyPvNotLike(String value) {
            addCriterion("JMSY_PV not like", value, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyPvIn(List<String> values) {
            addCriterion("JMSY_PV in", values, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyPvNotIn(List<String> values) {
            addCriterion("JMSY_PV not in", values, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyPvBetween(String value1, String value2) {
            addCriterion("JMSY_PV between", value1, value2, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyPvNotBetween(String value1, String value2) {
            addCriterion("JMSY_PV not between", value1, value2, "jmsyPv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvIsNull() {
            addCriterion("JMSY_CV is null");
            return (Criteria) this;
        }

        public Criteria andJmsyCvIsNotNull() {
            addCriterion("JMSY_CV is not null");
            return (Criteria) this;
        }

        public Criteria andJmsyCvEqualTo(String value) {
            addCriterion("JMSY_CV =", value, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvNotEqualTo(String value) {
            addCriterion("JMSY_CV <>", value, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvGreaterThan(String value) {
            addCriterion("JMSY_CV >", value, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvGreaterThanOrEqualTo(String value) {
            addCriterion("JMSY_CV >=", value, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvLessThan(String value) {
            addCriterion("JMSY_CV <", value, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvLessThanOrEqualTo(String value) {
            addCriterion("JMSY_CV <=", value, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvLike(String value) {
            addCriterion("JMSY_CV like", value, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvNotLike(String value) {
            addCriterion("JMSY_CV not like", value, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvIn(List<String> values) {
            addCriterion("JMSY_CV in", values, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvNotIn(List<String> values) {
            addCriterion("JMSY_CV not in", values, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvBetween(String value1, String value2) {
            addCriterion("JMSY_CV between", value1, value2, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andJmsyCvNotBetween(String value1, String value2) {
            addCriterion("JMSY_CV not between", value1, value2, "jmsyCv");
            return (Criteria) this;
        }

        public Criteria andXqylgCodIsNull() {
            addCriterion("XQYLG_COD is null");
            return (Criteria) this;
        }

        public Criteria andXqylgCodIsNotNull() {
            addCriterion("XQYLG_COD is not null");
            return (Criteria) this;
        }

        public Criteria andXqylgCodEqualTo(String value) {
            addCriterion("XQYLG_COD =", value, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andXqylgCodNotEqualTo(String value) {
            addCriterion("XQYLG_COD <>", value, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andXqylgCodGreaterThan(String value) {
            addCriterion("XQYLG_COD >", value, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andXqylgCodGreaterThanOrEqualTo(String value) {
            addCriterion("XQYLG_COD >=", value, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andXqylgCodLessThan(String value) {
            addCriterion("XQYLG_COD <", value, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andXqylgCodLessThanOrEqualTo(String value) {
            addCriterion("XQYLG_COD <=", value, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andXqylgCodLike(String value) {
            addCriterion("XQYLG_COD like", value, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andXqylgCodNotLike(String value) {
            addCriterion("XQYLG_COD not like", value, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andXqylgCodIn(List<String> values) {
            addCriterion("XQYLG_COD in", values, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andXqylgCodNotIn(List<String> values) {
            addCriterion("XQYLG_COD not in", values, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andXqylgCodBetween(String value1, String value2) {
            addCriterion("XQYLG_COD between", value1, value2, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andXqylgCodNotBetween(String value1, String value2) {
            addCriterion("XQYLG_COD not between", value1, value2, "xqylgCod");
            return (Criteria) this;
        }

        public Criteria andJybzBwIsNull() {
            addCriterion("JYBZ_BW is null");
            return (Criteria) this;
        }

        public Criteria andJybzBwIsNotNull() {
            addCriterion("JYBZ_BW is not null");
            return (Criteria) this;
        }

        public Criteria andJybzBwEqualTo(String value) {
            addCriterion("JYBZ_BW =", value, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJybzBwNotEqualTo(String value) {
            addCriterion("JYBZ_BW <>", value, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJybzBwGreaterThan(String value) {
            addCriterion("JYBZ_BW >", value, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJybzBwGreaterThanOrEqualTo(String value) {
            addCriterion("JYBZ_BW >=", value, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJybzBwLessThan(String value) {
            addCriterion("JYBZ_BW <", value, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJybzBwLessThanOrEqualTo(String value) {
            addCriterion("JYBZ_BW <=", value, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJybzBwLike(String value) {
            addCriterion("JYBZ_BW like", value, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJybzBwNotLike(String value) {
            addCriterion("JYBZ_BW not like", value, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJybzBwIn(List<String> values) {
            addCriterion("JYBZ_BW in", values, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJybzBwNotIn(List<String> values) {
            addCriterion("JYBZ_BW not in", values, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJybzBwBetween(String value1, String value2) {
            addCriterion("JYBZ_BW between", value1, value2, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJybzBwNotBetween(String value1, String value2) {
            addCriterion("JYBZ_BW not between", value1, value2, "jybzBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwIsNull() {
            addCriterion("JBGD_BW is null");
            return (Criteria) this;
        }

        public Criteria andJbgdBwIsNotNull() {
            addCriterion("JBGD_BW is not null");
            return (Criteria) this;
        }

        public Criteria andJbgdBwEqualTo(String value) {
            addCriterion("JBGD_BW =", value, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwNotEqualTo(String value) {
            addCriterion("JBGD_BW <>", value, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwGreaterThan(String value) {
            addCriterion("JBGD_BW >", value, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwGreaterThanOrEqualTo(String value) {
            addCriterion("JBGD_BW >=", value, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwLessThan(String value) {
            addCriterion("JBGD_BW <", value, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwLessThanOrEqualTo(String value) {
            addCriterion("JBGD_BW <=", value, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwLike(String value) {
            addCriterion("JBGD_BW like", value, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwNotLike(String value) {
            addCriterion("JBGD_BW not like", value, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwIn(List<String> values) {
            addCriterion("JBGD_BW in", values, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwNotIn(List<String> values) {
            addCriterion("JBGD_BW not in", values, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwBetween(String value1, String value2) {
            addCriterion("JBGD_BW between", value1, value2, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andJbgdBwNotBetween(String value1, String value2) {
            addCriterion("JBGD_BW not between", value1, value2, "jbgdBw");
            return (Criteria) this;
        }

        public Criteria andQyBwIsNull() {
            addCriterion("QY_BW is null");
            return (Criteria) this;
        }

        public Criteria andQyBwIsNotNull() {
            addCriterion("QY_BW is not null");
            return (Criteria) this;
        }

        public Criteria andQyBwEqualTo(String value) {
            addCriterion("QY_BW =", value, "qyBw");
            return (Criteria) this;
        }

        public Criteria andQyBwNotEqualTo(String value) {
            addCriterion("QY_BW <>", value, "qyBw");
            return (Criteria) this;
        }

        public Criteria andQyBwGreaterThan(String value) {
            addCriterion("QY_BW >", value, "qyBw");
            return (Criteria) this;
        }

        public Criteria andQyBwGreaterThanOrEqualTo(String value) {
            addCriterion("QY_BW >=", value, "qyBw");
            return (Criteria) this;
        }

        public Criteria andQyBwLessThan(String value) {
            addCriterion("QY_BW <", value, "qyBw");
            return (Criteria) this;
        }

        public Criteria andQyBwLessThanOrEqualTo(String value) {
            addCriterion("QY_BW <=", value, "qyBw");
            return (Criteria) this;
        }

        public Criteria andQyBwLike(String value) {
            addCriterion("QY_BW like", value, "qyBw");
            return (Criteria) this;
        }

        public Criteria andQyBwNotLike(String value) {
            addCriterion("QY_BW not like", value, "qyBw");
            return (Criteria) this;
        }

        public Criteria andQyBwIn(List<String> values) {
            addCriterion("QY_BW in", values, "qyBw");
            return (Criteria) this;
        }

        public Criteria andQyBwNotIn(List<String> values) {
            addCriterion("QY_BW not in", values, "qyBw");
            return (Criteria) this;
        }

        public Criteria andQyBwBetween(String value1, String value2) {
            addCriterion("QY_BW between", value1, value2, "qyBw");
            return (Criteria) this;
        }

        public Criteria andQyBwNotBetween(String value1, String value2) {
            addCriterion("QY_BW not between", value1, value2, "qyBw");
            return (Criteria) this;
        }

        public Criteria andXxDatIsNull() {
            addCriterion("XX_DAT is null");
            return (Criteria) this;
        }

        public Criteria andXxDatIsNotNull() {
            addCriterion("XX_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andXxDatEqualTo(Date value) {
            addCriterion("XX_DAT =", value, "xxDat");
            return (Criteria) this;
        }

        public Criteria andXxDatNotEqualTo(Date value) {
            addCriterion("XX_DAT <>", value, "xxDat");
            return (Criteria) this;
        }

        public Criteria andXxDatGreaterThan(Date value) {
            addCriterion("XX_DAT >", value, "xxDat");
            return (Criteria) this;
        }

        public Criteria andXxDatGreaterThanOrEqualTo(Date value) {
            addCriterion("XX_DAT >=", value, "xxDat");
            return (Criteria) this;
        }

        public Criteria andXxDatLessThan(Date value) {
            addCriterion("XX_DAT <", value, "xxDat");
            return (Criteria) this;
        }

        public Criteria andXxDatLessThanOrEqualTo(Date value) {
            addCriterion("XX_DAT <=", value, "xxDat");
            return (Criteria) this;
        }

        public Criteria andXxDatIn(List<Date> values) {
            addCriterion("XX_DAT in", values, "xxDat");
            return (Criteria) this;
        }

        public Criteria andXxDatNotIn(List<Date> values) {
            addCriterion("XX_DAT not in", values, "xxDat");
            return (Criteria) this;
        }

        public Criteria andXxDatBetween(Date value1, Date value2) {
            addCriterion("XX_DAT between", value1, value2, "xxDat");
            return (Criteria) this;
        }

        public Criteria andXxDatNotBetween(Date value1, Date value2) {
            addCriterion("XX_DAT not between", value1, value2, "xxDat");
            return (Criteria) this;
        }

        public Criteria andPxDatIsNull() {
            addCriterion("PX_DAT is null");
            return (Criteria) this;
        }

        public Criteria andPxDatIsNotNull() {
            addCriterion("PX_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andPxDatEqualTo(Date value) {
            addCriterion("PX_DAT =", value, "pxDat");
            return (Criteria) this;
        }

        public Criteria andPxDatNotEqualTo(Date value) {
            addCriterion("PX_DAT <>", value, "pxDat");
            return (Criteria) this;
        }

        public Criteria andPxDatGreaterThan(Date value) {
            addCriterion("PX_DAT >", value, "pxDat");
            return (Criteria) this;
        }

        public Criteria andPxDatGreaterThanOrEqualTo(Date value) {
            addCriterion("PX_DAT >=", value, "pxDat");
            return (Criteria) this;
        }

        public Criteria andPxDatLessThan(Date value) {
            addCriterion("PX_DAT <", value, "pxDat");
            return (Criteria) this;
        }

        public Criteria andPxDatLessThanOrEqualTo(Date value) {
            addCriterion("PX_DAT <=", value, "pxDat");
            return (Criteria) this;
        }

        public Criteria andPxDatIn(List<Date> values) {
            addCriterion("PX_DAT in", values, "pxDat");
            return (Criteria) this;
        }

        public Criteria andPxDatNotIn(List<Date> values) {
            addCriterion("PX_DAT not in", values, "pxDat");
            return (Criteria) this;
        }

        public Criteria andPxDatBetween(Date value1, Date value2) {
            addCriterion("PX_DAT between", value1, value2, "pxDat");
            return (Criteria) this;
        }

        public Criteria andPxDatNotBetween(Date value1, Date value2) {
            addCriterion("PX_DAT not between", value1, value2, "pxDat");
            return (Criteria) this;
        }

        public Criteria andSxDatIsNull() {
            addCriterion("SX_DAT is null");
            return (Criteria) this;
        }

        public Criteria andSxDatIsNotNull() {
            addCriterion("SX_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andSxDatEqualTo(Date value) {
            addCriterion("SX_DAT =", value, "sxDat");
            return (Criteria) this;
        }

        public Criteria andSxDatNotEqualTo(Date value) {
            addCriterion("SX_DAT <>", value, "sxDat");
            return (Criteria) this;
        }

        public Criteria andSxDatGreaterThan(Date value) {
            addCriterion("SX_DAT >", value, "sxDat");
            return (Criteria) this;
        }

        public Criteria andSxDatGreaterThanOrEqualTo(Date value) {
            addCriterion("SX_DAT >=", value, "sxDat");
            return (Criteria) this;
        }

        public Criteria andSxDatLessThan(Date value) {
            addCriterion("SX_DAT <", value, "sxDat");
            return (Criteria) this;
        }

        public Criteria andSxDatLessThanOrEqualTo(Date value) {
            addCriterion("SX_DAT <=", value, "sxDat");
            return (Criteria) this;
        }

        public Criteria andSxDatIn(List<Date> values) {
            addCriterion("SX_DAT in", values, "sxDat");
            return (Criteria) this;
        }

        public Criteria andSxDatNotIn(List<Date> values) {
            addCriterion("SX_DAT not in", values, "sxDat");
            return (Criteria) this;
        }

        public Criteria andSxDatBetween(Date value1, Date value2) {
            addCriterion("SX_DAT between", value1, value2, "sxDat");
            return (Criteria) this;
        }

        public Criteria andSxDatNotBetween(Date value1, Date value2) {
            addCriterion("SX_DAT not between", value1, value2, "sxDat");
            return (Criteria) this;
        }

        public Criteria andCbpgNamIsNull() {
            addCriterion("CBPG_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCbpgNamIsNotNull() {
            addCriterion("CBPG_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCbpgNamEqualTo(String value) {
            addCriterion("CBPG_NAM =", value, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andCbpgNamNotEqualTo(String value) {
            addCriterion("CBPG_NAM <>", value, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andCbpgNamGreaterThan(String value) {
            addCriterion("CBPG_NAM >", value, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andCbpgNamGreaterThanOrEqualTo(String value) {
            addCriterion("CBPG_NAM >=", value, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andCbpgNamLessThan(String value) {
            addCriterion("CBPG_NAM <", value, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andCbpgNamLessThanOrEqualTo(String value) {
            addCriterion("CBPG_NAM <=", value, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andCbpgNamLike(String value) {
            addCriterion("CBPG_NAM like", value, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andCbpgNamNotLike(String value) {
            addCriterion("CBPG_NAM not like", value, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andCbpgNamIn(List<String> values) {
            addCriterion("CBPG_NAM in", values, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andCbpgNamNotIn(List<String> values) {
            addCriterion("CBPG_NAM not in", values, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andCbpgNamBetween(String value1, String value2) {
            addCriterion("CBPG_NAM between", value1, value2, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andCbpgNamNotBetween(String value1, String value2) {
            addCriterion("CBPG_NAM not between", value1, value2, "cbpgNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamIsNull() {
            addCriterion("CLBZ_NAM is null");
            return (Criteria) this;
        }

        public Criteria andClbzNamIsNotNull() {
            addCriterion("CLBZ_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andClbzNamEqualTo(String value) {
            addCriterion("CLBZ_NAM =", value, "clbzNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamNotEqualTo(String value) {
            addCriterion("CLBZ_NAM <>", value, "clbzNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamGreaterThan(String value) {
            addCriterion("CLBZ_NAM >", value, "clbzNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamGreaterThanOrEqualTo(String value) {
            addCriterion("CLBZ_NAM >=", value, "clbzNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamLessThan(String value) {
            addCriterion("CLBZ_NAM <", value, "clbzNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamLessThanOrEqualTo(String value) {
            addCriterion("CLBZ_NAM <=", value, "clbzNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamLike(String value) {
            addCriterion("CLBZ_NAM like", value, "clbzNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamNotLike(String value) {
            addCriterion("CLBZ_NAM not like", value, "clbzNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamIn(List<String> values) {
            addCriterion("CLBZ_NAM in", values, "clbzNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamNotIn(List<String> values) {
            addCriterion("CLBZ_NAM not in", values, "clbzNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamBetween(String value1, String value2) {
            addCriterion("CLBZ_NAM between", value1, value2, "clbzNam");
            return (Criteria) this;
        }

        public Criteria andClbzNamNotBetween(String value1, String value2) {
            addCriterion("CLBZ_NAM not between", value1, value2, "clbzNam");
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

        public Criteria andHzDesIsNull() {
            addCriterion("HZ_DES is null");
            return (Criteria) this;
        }

        public Criteria andHzDesIsNotNull() {
            addCriterion("HZ_DES is not null");
            return (Criteria) this;
        }

        public Criteria andHzDesEqualTo(String value) {
            addCriterion("HZ_DES =", value, "hzDes");
            return (Criteria) this;
        }

        public Criteria andHzDesNotEqualTo(String value) {
            addCriterion("HZ_DES <>", value, "hzDes");
            return (Criteria) this;
        }

        public Criteria andHzDesGreaterThan(String value) {
            addCriterion("HZ_DES >", value, "hzDes");
            return (Criteria) this;
        }

        public Criteria andHzDesGreaterThanOrEqualTo(String value) {
            addCriterion("HZ_DES >=", value, "hzDes");
            return (Criteria) this;
        }

        public Criteria andHzDesLessThan(String value) {
            addCriterion("HZ_DES <", value, "hzDes");
            return (Criteria) this;
        }

        public Criteria andHzDesLessThanOrEqualTo(String value) {
            addCriterion("HZ_DES <=", value, "hzDes");
            return (Criteria) this;
        }

        public Criteria andHzDesLike(String value) {
            addCriterion("HZ_DES like", value, "hzDes");
            return (Criteria) this;
        }

        public Criteria andHzDesNotLike(String value) {
            addCriterion("HZ_DES not like", value, "hzDes");
            return (Criteria) this;
        }

        public Criteria andHzDesIn(List<String> values) {
            addCriterion("HZ_DES in", values, "hzDes");
            return (Criteria) this;
        }

        public Criteria andHzDesNotIn(List<String> values) {
            addCriterion("HZ_DES not in", values, "hzDes");
            return (Criteria) this;
        }

        public Criteria andHzDesBetween(String value1, String value2) {
            addCriterion("HZ_DES between", value1, value2, "hzDes");
            return (Criteria) this;
        }

        public Criteria andHzDesNotBetween(String value1, String value2) {
            addCriterion("HZ_DES not between", value1, value2, "hzDes");
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