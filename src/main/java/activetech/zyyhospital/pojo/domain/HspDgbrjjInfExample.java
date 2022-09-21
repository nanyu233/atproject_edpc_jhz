package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspDgbrjjInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDgbrjjInfExample() {
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

        public Criteria andDgbrjjSeqIsNull() {
            addCriterion("DGBRJJ_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqIsNotNull() {
            addCriterion("DGBRJJ_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqEqualTo(String value) {
            addCriterion("DGBRJJ_SEQ =", value, "dgbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqNotEqualTo(String value) {
            addCriterion("DGBRJJ_SEQ <>", value, "dgbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqGreaterThan(String value) {
            addCriterion("DGBRJJ_SEQ >", value, "dgbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqGreaterThanOrEqualTo(String value) {
            addCriterion("DGBRJJ_SEQ >=", value, "dgbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqLessThan(String value) {
            addCriterion("DGBRJJ_SEQ <", value, "dgbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqLessThanOrEqualTo(String value) {
            addCriterion("DGBRJJ_SEQ <=", value, "dgbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqLike(String value) {
            addCriterion("DGBRJJ_SEQ like", value, "dgbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqNotLike(String value) {
            addCriterion("DGBRJJ_SEQ not like", value, "dgbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqIn(List<String> values) {
            addCriterion("DGBRJJ_SEQ in", values, "dgbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqNotIn(List<String> values) {
            addCriterion("DGBRJJ_SEQ not in", values, "dgbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqBetween(String value1, String value2) {
            addCriterion("DGBRJJ_SEQ between", value1, value2, "dgbrjjSeq");
            return (Criteria) this;
        }

        public Criteria andDgbrjjSeqNotBetween(String value1, String value2) {
            addCriterion("DGBRJJ_SEQ not between", value1, value2, "dgbrjjSeq");
            return (Criteria) this;
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

        public Criteria andBfSqzdIsNull() {
            addCriterion("BF_SQZD is null");
            return (Criteria) this;
        }

        public Criteria andBfSqzdIsNotNull() {
            addCriterion("BF_SQZD is not null");
            return (Criteria) this;
        }

        public Criteria andBfSqzdEqualTo(String value) {
            addCriterion("BF_SQZD =", value, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzdNotEqualTo(String value) {
            addCriterion("BF_SQZD <>", value, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzdGreaterThan(String value) {
            addCriterion("BF_SQZD >", value, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzdGreaterThanOrEqualTo(String value) {
            addCriterion("BF_SQZD >=", value, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzdLessThan(String value) {
            addCriterion("BF_SQZD <", value, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzdLessThanOrEqualTo(String value) {
            addCriterion("BF_SQZD <=", value, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzdLike(String value) {
            addCriterion("BF_SQZD like", value, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzdNotLike(String value) {
            addCriterion("BF_SQZD not like", value, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzdIn(List<String> values) {
            addCriterion("BF_SQZD in", values, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzdNotIn(List<String> values) {
            addCriterion("BF_SQZD not in", values, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzdBetween(String value1, String value2) {
            addCriterion("BF_SQZD between", value1, value2, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzdNotBetween(String value1, String value2) {
            addCriterion("BF_SQZD not between", value1, value2, "bfSqzd");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodIsNull() {
            addCriterion("BF_SQZB_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodIsNotNull() {
            addCriterion("BF_SQZB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodEqualTo(String value) {
            addCriterion("BF_SQZB_COD =", value, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodNotEqualTo(String value) {
            addCriterion("BF_SQZB_COD <>", value, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodGreaterThan(String value) {
            addCriterion("BF_SQZB_COD >", value, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_SQZB_COD >=", value, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodLessThan(String value) {
            addCriterion("BF_SQZB_COD <", value, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodLessThanOrEqualTo(String value) {
            addCriterion("BF_SQZB_COD <=", value, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodLike(String value) {
            addCriterion("BF_SQZB_COD like", value, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodNotLike(String value) {
            addCriterion("BF_SQZB_COD not like", value, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodIn(List<String> values) {
            addCriterion("BF_SQZB_COD in", values, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodNotIn(List<String> values) {
            addCriterion("BF_SQZB_COD not in", values, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodBetween(String value1, String value2) {
            addCriterion("BF_SQZB_COD between", value1, value2, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqzbCodNotBetween(String value1, String value2) {
            addCriterion("BF_SQZB_COD not between", value1, value2, "bfSqzbCod");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgIsNull() {
            addCriterion("BF_SQYY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgIsNotNull() {
            addCriterion("BF_SQYY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgEqualTo(String value) {
            addCriterion("BF_SQYY_FLG =", value, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgNotEqualTo(String value) {
            addCriterion("BF_SQYY_FLG <>", value, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgGreaterThan(String value) {
            addCriterion("BF_SQYY_FLG >", value, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("BF_SQYY_FLG >=", value, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgLessThan(String value) {
            addCriterion("BF_SQYY_FLG <", value, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgLessThanOrEqualTo(String value) {
            addCriterion("BF_SQYY_FLG <=", value, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgLike(String value) {
            addCriterion("BF_SQYY_FLG like", value, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgNotLike(String value) {
            addCriterion("BF_SQYY_FLG not like", value, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgIn(List<String> values) {
            addCriterion("BF_SQYY_FLG in", values, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgNotIn(List<String> values) {
            addCriterion("BF_SQYY_FLG not in", values, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgBetween(String value1, String value2) {
            addCriterion("BF_SQYY_FLG between", value1, value2, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyFlgNotBetween(String value1, String value2) {
            addCriterion("BF_SQYY_FLG not between", value1, value2, "bfSqyyFlg");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfIsNull() {
            addCriterion("BF_SQYY_KF is null");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfIsNotNull() {
            addCriterion("BF_SQYY_KF is not null");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfEqualTo(String value) {
            addCriterion("BF_SQYY_KF =", value, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfNotEqualTo(String value) {
            addCriterion("BF_SQYY_KF <>", value, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfGreaterThan(String value) {
            addCriterion("BF_SQYY_KF >", value, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfGreaterThanOrEqualTo(String value) {
            addCriterion("BF_SQYY_KF >=", value, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfLessThan(String value) {
            addCriterion("BF_SQYY_KF <", value, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfLessThanOrEqualTo(String value) {
            addCriterion("BF_SQYY_KF <=", value, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfLike(String value) {
            addCriterion("BF_SQYY_KF like", value, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfNotLike(String value) {
            addCriterion("BF_SQYY_KF not like", value, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfIn(List<String> values) {
            addCriterion("BF_SQYY_KF in", values, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfNotIn(List<String> values) {
            addCriterion("BF_SQYY_KF not in", values, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfBetween(String value1, String value2) {
            addCriterion("BF_SQYY_KF between", value1, value2, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyKfNotBetween(String value1, String value2) {
            addCriterion("BF_SQYY_KF not between", value1, value2, "bfSqyyKf");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmIsNull() {
            addCriterion("BF_SQYY_JM is null");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmIsNotNull() {
            addCriterion("BF_SQYY_JM is not null");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmEqualTo(String value) {
            addCriterion("BF_SQYY_JM =", value, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmNotEqualTo(String value) {
            addCriterion("BF_SQYY_JM <>", value, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmGreaterThan(String value) {
            addCriterion("BF_SQYY_JM >", value, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmGreaterThanOrEqualTo(String value) {
            addCriterion("BF_SQYY_JM >=", value, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmLessThan(String value) {
            addCriterion("BF_SQYY_JM <", value, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmLessThanOrEqualTo(String value) {
            addCriterion("BF_SQYY_JM <=", value, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmLike(String value) {
            addCriterion("BF_SQYY_JM like", value, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmNotLike(String value) {
            addCriterion("BF_SQYY_JM not like", value, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmIn(List<String> values) {
            addCriterion("BF_SQYY_JM in", values, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmNotIn(List<String> values) {
            addCriterion("BF_SQYY_JM not in", values, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmBetween(String value1, String value2) {
            addCriterion("BF_SQYY_JM between", value1, value2, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyJmNotBetween(String value1, String value2) {
            addCriterion("BF_SQYY_JM not between", value1, value2, "bfSqyyJm");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyIsNull() {
            addCriterion("BF_SQYY_DRDGSYY is null");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyIsNotNull() {
            addCriterion("BF_SQYY_DRDGSYY is not null");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyEqualTo(String value) {
            addCriterion("BF_SQYY_DRDGSYY =", value, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyNotEqualTo(String value) {
            addCriterion("BF_SQYY_DRDGSYY <>", value, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyGreaterThan(String value) {
            addCriterion("BF_SQYY_DRDGSYY >", value, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyGreaterThanOrEqualTo(String value) {
            addCriterion("BF_SQYY_DRDGSYY >=", value, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyLessThan(String value) {
            addCriterion("BF_SQYY_DRDGSYY <", value, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyLessThanOrEqualTo(String value) {
            addCriterion("BF_SQYY_DRDGSYY <=", value, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyLike(String value) {
            addCriterion("BF_SQYY_DRDGSYY like", value, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyNotLike(String value) {
            addCriterion("BF_SQYY_DRDGSYY not like", value, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyIn(List<String> values) {
            addCriterion("BF_SQYY_DRDGSYY in", values, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyNotIn(List<String> values) {
            addCriterion("BF_SQYY_DRDGSYY not in", values, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyBetween(String value1, String value2) {
            addCriterion("BF_SQYY_DRDGSYY between", value1, value2, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfSqyyDrdgsyyNotBetween(String value1, String value2) {
            addCriterion("BF_SQYY_DRDGSYY not between", value1, value2, "bfSqyyDrdgsyy");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodIsNull() {
            addCriterion("BF_ZBDMBD_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodIsNotNull() {
            addCriterion("BF_ZBDMBD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodEqualTo(String value) {
            addCriterion("BF_ZBDMBD_COD =", value, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodNotEqualTo(String value) {
            addCriterion("BF_ZBDMBD_COD <>", value, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodGreaterThan(String value) {
            addCriterion("BF_ZBDMBD_COD >", value, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_ZBDMBD_COD >=", value, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodLessThan(String value) {
            addCriterion("BF_ZBDMBD_COD <", value, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodLessThanOrEqualTo(String value) {
            addCriterion("BF_ZBDMBD_COD <=", value, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodLike(String value) {
            addCriterion("BF_ZBDMBD_COD like", value, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodNotLike(String value) {
            addCriterion("BF_ZBDMBD_COD not like", value, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodIn(List<String> values) {
            addCriterion("BF_ZBDMBD_COD in", values, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodNotIn(List<String> values) {
            addCriterion("BF_ZBDMBD_COD not in", values, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodBetween(String value1, String value2) {
            addCriterion("BF_ZBDMBD_COD between", value1, value2, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfZbdmbdCodNotBetween(String value1, String value2) {
            addCriterion("BF_ZBDMBD_COD not between", value1, value2, "bfZbdmbdCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodIsNull() {
            addCriterion("BF_DRDGSWP_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodIsNotNull() {
            addCriterion("BF_DRDGSWP_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodEqualTo(String value) {
            addCriterion("BF_DRDGSWP_COD =", value, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodNotEqualTo(String value) {
            addCriterion("BF_DRDGSWP_COD <>", value, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodGreaterThan(String value) {
            addCriterion("BF_DRDGSWP_COD >", value, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_DRDGSWP_COD >=", value, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodLessThan(String value) {
            addCriterion("BF_DRDGSWP_COD <", value, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodLessThanOrEqualTo(String value) {
            addCriterion("BF_DRDGSWP_COD <=", value, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodLike(String value) {
            addCriterion("BF_DRDGSWP_COD like", value, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodNotLike(String value) {
            addCriterion("BF_DRDGSWP_COD not like", value, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodIn(List<String> values) {
            addCriterion("BF_DRDGSWP_COD in", values, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodNotIn(List<String> values) {
            addCriterion("BF_DRDGSWP_COD not in", values, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodBetween(String value1, String value2) {
            addCriterion("BF_DRDGSWP_COD between", value1, value2, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpCodNotBetween(String value1, String value2) {
            addCriterion("BF_DRDGSWP_COD not between", value1, value2, "bfDrdgswpCod");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtIsNull() {
            addCriterion("BF_DRDGSWP_QT is null");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtIsNotNull() {
            addCriterion("BF_DRDGSWP_QT is not null");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtEqualTo(String value) {
            addCriterion("BF_DRDGSWP_QT =", value, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtNotEqualTo(String value) {
            addCriterion("BF_DRDGSWP_QT <>", value, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtGreaterThan(String value) {
            addCriterion("BF_DRDGSWP_QT >", value, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtGreaterThanOrEqualTo(String value) {
            addCriterion("BF_DRDGSWP_QT >=", value, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtLessThan(String value) {
            addCriterion("BF_DRDGSWP_QT <", value, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtLessThanOrEqualTo(String value) {
            addCriterion("BF_DRDGSWP_QT <=", value, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtLike(String value) {
            addCriterion("BF_DRDGSWP_QT like", value, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtNotLike(String value) {
            addCriterion("BF_DRDGSWP_QT not like", value, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtIn(List<String> values) {
            addCriterion("BF_DRDGSWP_QT in", values, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtNotIn(List<String> values) {
            addCriterion("BF_DRDGSWP_QT not in", values, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtBetween(String value1, String value2) {
            addCriterion("BF_DRDGSWP_QT between", value1, value2, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfDrdgswpQtNotBetween(String value1, String value2) {
            addCriterion("BF_DRDGSWP_QT not between", value1, value2, "bfDrdgswpQt");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodIsNull() {
            addCriterion("BF_RDGSFS_COD is null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodIsNotNull() {
            addCriterion("BF_RDGSFS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodEqualTo(String value) {
            addCriterion("BF_RDGSFS_COD =", value, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodNotEqualTo(String value) {
            addCriterion("BF_RDGSFS_COD <>", value, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodGreaterThan(String value) {
            addCriterion("BF_RDGSFS_COD >", value, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodGreaterThanOrEqualTo(String value) {
            addCriterion("BF_RDGSFS_COD >=", value, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodLessThan(String value) {
            addCriterion("BF_RDGSFS_COD <", value, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodLessThanOrEqualTo(String value) {
            addCriterion("BF_RDGSFS_COD <=", value, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodLike(String value) {
            addCriterion("BF_RDGSFS_COD like", value, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodNotLike(String value) {
            addCriterion("BF_RDGSFS_COD not like", value, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodIn(List<String> values) {
            addCriterion("BF_RDGSFS_COD in", values, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodNotIn(List<String> values) {
            addCriterion("BF_RDGSFS_COD not in", values, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodBetween(String value1, String value2) {
            addCriterion("BF_RDGSFS_COD between", value1, value2, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsfsCodNotBetween(String value1, String value2) {
            addCriterion("BF_RDGSFS_COD not between", value1, value2, "bfRdgsfsCod");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwIsNull() {
            addCriterion("BF_RDGSQK_TW is null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwIsNotNull() {
            addCriterion("BF_RDGSQK_TW is not null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwEqualTo(BigDecimal value) {
            addCriterion("BF_RDGSQK_TW =", value, "bfRdgsqkTw");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwNotEqualTo(BigDecimal value) {
            addCriterion("BF_RDGSQK_TW <>", value, "bfRdgsqkTw");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwGreaterThan(BigDecimal value) {
            addCriterion("BF_RDGSQK_TW >", value, "bfRdgsqkTw");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BF_RDGSQK_TW >=", value, "bfRdgsqkTw");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwLessThan(BigDecimal value) {
            addCriterion("BF_RDGSQK_TW <", value, "bfRdgsqkTw");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BF_RDGSQK_TW <=", value, "bfRdgsqkTw");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwIn(List<BigDecimal> values) {
            addCriterion("BF_RDGSQK_TW in", values, "bfRdgsqkTw");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwNotIn(List<BigDecimal> values) {
            addCriterion("BF_RDGSQK_TW not in", values, "bfRdgsqkTw");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BF_RDGSQK_TW between", value1, value2, "bfRdgsqkTw");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkTwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BF_RDGSQK_TW not between", value1, value2, "bfRdgsqkTw");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbIsNull() {
            addCriterion("BF_RDGSQK_MB is null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbIsNotNull() {
            addCriterion("BF_RDGSQK_MB is not null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbEqualTo(Short value) {
            addCriterion("BF_RDGSQK_MB =", value, "bfRdgsqkMb");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbNotEqualTo(Short value) {
            addCriterion("BF_RDGSQK_MB <>", value, "bfRdgsqkMb");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbGreaterThan(Short value) {
            addCriterion("BF_RDGSQK_MB >", value, "bfRdgsqkMb");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbGreaterThanOrEqualTo(Short value) {
            addCriterion("BF_RDGSQK_MB >=", value, "bfRdgsqkMb");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbLessThan(Short value) {
            addCriterion("BF_RDGSQK_MB <", value, "bfRdgsqkMb");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbLessThanOrEqualTo(Short value) {
            addCriterion("BF_RDGSQK_MB <=", value, "bfRdgsqkMb");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbIn(List<Short> values) {
            addCriterion("BF_RDGSQK_MB in", values, "bfRdgsqkMb");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbNotIn(List<Short> values) {
            addCriterion("BF_RDGSQK_MB not in", values, "bfRdgsqkMb");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbBetween(Short value1, Short value2) {
            addCriterion("BF_RDGSQK_MB between", value1, value2, "bfRdgsqkMb");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkMbNotBetween(Short value1, Short value2) {
            addCriterion("BF_RDGSQK_MB not between", value1, value2, "bfRdgsqkMb");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxIsNull() {
            addCriterion("BF_RDGSQK_HX is null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxIsNotNull() {
            addCriterion("BF_RDGSQK_HX is not null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxEqualTo(Short value) {
            addCriterion("BF_RDGSQK_HX =", value, "bfRdgsqkHx");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxNotEqualTo(Short value) {
            addCriterion("BF_RDGSQK_HX <>", value, "bfRdgsqkHx");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxGreaterThan(Short value) {
            addCriterion("BF_RDGSQK_HX >", value, "bfRdgsqkHx");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxGreaterThanOrEqualTo(Short value) {
            addCriterion("BF_RDGSQK_HX >=", value, "bfRdgsqkHx");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxLessThan(Short value) {
            addCriterion("BF_RDGSQK_HX <", value, "bfRdgsqkHx");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxLessThanOrEqualTo(Short value) {
            addCriterion("BF_RDGSQK_HX <=", value, "bfRdgsqkHx");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxIn(List<Short> values) {
            addCriterion("BF_RDGSQK_HX in", values, "bfRdgsqkHx");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxNotIn(List<Short> values) {
            addCriterion("BF_RDGSQK_HX not in", values, "bfRdgsqkHx");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxBetween(Short value1, Short value2) {
            addCriterion("BF_RDGSQK_HX between", value1, value2, "bfRdgsqkHx");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkHxNotBetween(Short value1, Short value2) {
            addCriterion("BF_RDGSQK_HX not between", value1, value2, "bfRdgsqkHx");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpIsNull() {
            addCriterion("BF_RDGSQK_UPBP is null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpIsNotNull() {
            addCriterion("BF_RDGSQK_UPBP is not null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpEqualTo(Short value) {
            addCriterion("BF_RDGSQK_UPBP =", value, "bfRdgsqkUpbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpNotEqualTo(Short value) {
            addCriterion("BF_RDGSQK_UPBP <>", value, "bfRdgsqkUpbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpGreaterThan(Short value) {
            addCriterion("BF_RDGSQK_UPBP >", value, "bfRdgsqkUpbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpGreaterThanOrEqualTo(Short value) {
            addCriterion("BF_RDGSQK_UPBP >=", value, "bfRdgsqkUpbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpLessThan(Short value) {
            addCriterion("BF_RDGSQK_UPBP <", value, "bfRdgsqkUpbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpLessThanOrEqualTo(Short value) {
            addCriterion("BF_RDGSQK_UPBP <=", value, "bfRdgsqkUpbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpIn(List<Short> values) {
            addCriterion("BF_RDGSQK_UPBP in", values, "bfRdgsqkUpbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpNotIn(List<Short> values) {
            addCriterion("BF_RDGSQK_UPBP not in", values, "bfRdgsqkUpbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpBetween(Short value1, Short value2) {
            addCriterion("BF_RDGSQK_UPBP between", value1, value2, "bfRdgsqkUpbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkUpbpNotBetween(Short value1, Short value2) {
            addCriterion("BF_RDGSQK_UPBP not between", value1, value2, "bfRdgsqkUpbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpIsNull() {
            addCriterion("BF_RDGSQK_DOWNBP is null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpIsNotNull() {
            addCriterion("BF_RDGSQK_DOWNBP is not null");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpEqualTo(Short value) {
            addCriterion("BF_RDGSQK_DOWNBP =", value, "bfRdgsqkDownbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpNotEqualTo(Short value) {
            addCriterion("BF_RDGSQK_DOWNBP <>", value, "bfRdgsqkDownbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpGreaterThan(Short value) {
            addCriterion("BF_RDGSQK_DOWNBP >", value, "bfRdgsqkDownbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpGreaterThanOrEqualTo(Short value) {
            addCriterion("BF_RDGSQK_DOWNBP >=", value, "bfRdgsqkDownbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpLessThan(Short value) {
            addCriterion("BF_RDGSQK_DOWNBP <", value, "bfRdgsqkDownbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpLessThanOrEqualTo(Short value) {
            addCriterion("BF_RDGSQK_DOWNBP <=", value, "bfRdgsqkDownbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpIn(List<Short> values) {
            addCriterion("BF_RDGSQK_DOWNBP in", values, "bfRdgsqkDownbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpNotIn(List<Short> values) {
            addCriterion("BF_RDGSQK_DOWNBP not in", values, "bfRdgsqkDownbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpBetween(Short value1, Short value2) {
            addCriterion("BF_RDGSQK_DOWNBP between", value1, value2, "bfRdgsqkDownbp");
            return (Criteria) this;
        }

        public Criteria andBfRdgsqkDownbpNotBetween(Short value1, Short value2) {
            addCriterion("BF_RDGSQK_DOWNBP not between", value1, value2, "bfRdgsqkDownbp");
            return (Criteria) this;
        }

        public Criteria andBfTsjbIsNull() {
            addCriterion("BF_TSJB is null");
            return (Criteria) this;
        }

        public Criteria andBfTsjbIsNotNull() {
            addCriterion("BF_TSJB is not null");
            return (Criteria) this;
        }

        public Criteria andBfTsjbEqualTo(String value) {
            addCriterion("BF_TSJB =", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbNotEqualTo(String value) {
            addCriterion("BF_TSJB <>", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbGreaterThan(String value) {
            addCriterion("BF_TSJB >", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbGreaterThanOrEqualTo(String value) {
            addCriterion("BF_TSJB >=", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbLessThan(String value) {
            addCriterion("BF_TSJB <", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbLessThanOrEqualTo(String value) {
            addCriterion("BF_TSJB <=", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbLike(String value) {
            addCriterion("BF_TSJB like", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbNotLike(String value) {
            addCriterion("BF_TSJB not like", value, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbIn(List<String> values) {
            addCriterion("BF_TSJB in", values, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbNotIn(List<String> values) {
            addCriterion("BF_TSJB not in", values, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbBetween(String value1, String value2) {
            addCriterion("BF_TSJB between", value1, value2, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfTsjbNotBetween(String value1, String value2) {
            addCriterion("BF_TSJB not between", value1, value2, "bfTsjb");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrIsNull() {
            addCriterion("BF_BFHSQM_NBR is null");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrIsNotNull() {
            addCriterion("BF_BFHSQM_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrEqualTo(String value) {
            addCriterion("BF_BFHSQM_NBR =", value, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrNotEqualTo(String value) {
            addCriterion("BF_BFHSQM_NBR <>", value, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrGreaterThan(String value) {
            addCriterion("BF_BFHSQM_NBR >", value, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrGreaterThanOrEqualTo(String value) {
            addCriterion("BF_BFHSQM_NBR >=", value, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrLessThan(String value) {
            addCriterion("BF_BFHSQM_NBR <", value, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrLessThanOrEqualTo(String value) {
            addCriterion("BF_BFHSQM_NBR <=", value, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrLike(String value) {
            addCriterion("BF_BFHSQM_NBR like", value, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrNotLike(String value) {
            addCriterion("BF_BFHSQM_NBR not like", value, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrIn(List<String> values) {
            addCriterion("BF_BFHSQM_NBR in", values, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrNotIn(List<String> values) {
            addCriterion("BF_BFHSQM_NBR not in", values, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrBetween(String value1, String value2) {
            addCriterion("BF_BFHSQM_NBR between", value1, value2, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNbrNotBetween(String value1, String value2) {
            addCriterion("BF_BFHSQM_NBR not between", value1, value2, "bfBfhsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamIsNull() {
            addCriterion("BF_BFHSQM_NAM is null");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamIsNotNull() {
            addCriterion("BF_BFHSQM_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamEqualTo(String value) {
            addCriterion("BF_BFHSQM_NAM =", value, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamNotEqualTo(String value) {
            addCriterion("BF_BFHSQM_NAM <>", value, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamGreaterThan(String value) {
            addCriterion("BF_BFHSQM_NAM >", value, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamGreaterThanOrEqualTo(String value) {
            addCriterion("BF_BFHSQM_NAM >=", value, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamLessThan(String value) {
            addCriterion("BF_BFHSQM_NAM <", value, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamLessThanOrEqualTo(String value) {
            addCriterion("BF_BFHSQM_NAM <=", value, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamLike(String value) {
            addCriterion("BF_BFHSQM_NAM like", value, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamNotLike(String value) {
            addCriterion("BF_BFHSQM_NAM not like", value, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamIn(List<String> values) {
            addCriterion("BF_BFHSQM_NAM in", values, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamNotIn(List<String> values) {
            addCriterion("BF_BFHSQM_NAM not in", values, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamBetween(String value1, String value2) {
            addCriterion("BF_BFHSQM_NAM between", value1, value2, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfBfhsqmNamNotBetween(String value1, String value2) {
            addCriterion("BF_BFHSQM_NAM not between", value1, value2, "bfBfhsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrIsNull() {
            addCriterion("BF_DGHSQM_NBR is null");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrIsNotNull() {
            addCriterion("BF_DGHSQM_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrEqualTo(String value) {
            addCriterion("BF_DGHSQM_NBR =", value, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrNotEqualTo(String value) {
            addCriterion("BF_DGHSQM_NBR <>", value, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrGreaterThan(String value) {
            addCriterion("BF_DGHSQM_NBR >", value, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrGreaterThanOrEqualTo(String value) {
            addCriterion("BF_DGHSQM_NBR >=", value, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrLessThan(String value) {
            addCriterion("BF_DGHSQM_NBR <", value, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrLessThanOrEqualTo(String value) {
            addCriterion("BF_DGHSQM_NBR <=", value, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrLike(String value) {
            addCriterion("BF_DGHSQM_NBR like", value, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrNotLike(String value) {
            addCriterion("BF_DGHSQM_NBR not like", value, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrIn(List<String> values) {
            addCriterion("BF_DGHSQM_NBR in", values, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrNotIn(List<String> values) {
            addCriterion("BF_DGHSQM_NBR not in", values, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrBetween(String value1, String value2) {
            addCriterion("BF_DGHSQM_NBR between", value1, value2, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNbrNotBetween(String value1, String value2) {
            addCriterion("BF_DGHSQM_NBR not between", value1, value2, "bfDghsqmNbr");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamIsNull() {
            addCriterion("BF_DGHSQM_NAM is null");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamIsNotNull() {
            addCriterion("BF_DGHSQM_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamEqualTo(String value) {
            addCriterion("BF_DGHSQM_NAM =", value, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamNotEqualTo(String value) {
            addCriterion("BF_DGHSQM_NAM <>", value, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamGreaterThan(String value) {
            addCriterion("BF_DGHSQM_NAM >", value, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamGreaterThanOrEqualTo(String value) {
            addCriterion("BF_DGHSQM_NAM >=", value, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamLessThan(String value) {
            addCriterion("BF_DGHSQM_NAM <", value, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamLessThanOrEqualTo(String value) {
            addCriterion("BF_DGHSQM_NAM <=", value, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamLike(String value) {
            addCriterion("BF_DGHSQM_NAM like", value, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamNotLike(String value) {
            addCriterion("BF_DGHSQM_NAM not like", value, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamIn(List<String> values) {
            addCriterion("BF_DGHSQM_NAM in", values, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamNotIn(List<String> values) {
            addCriterion("BF_DGHSQM_NAM not in", values, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamBetween(String value1, String value2) {
            addCriterion("BF_DGHSQM_NAM between", value1, value2, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfDghsqmNamNotBetween(String value1, String value2) {
            addCriterion("BF_DGHSQM_NAM not between", value1, value2, "bfDghsqmNam");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatIsNull() {
            addCriterion("BF_JJB_DAT is null");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatIsNotNull() {
            addCriterion("BF_JJB_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatEqualTo(Date value) {
            addCriterion("BF_JJB_DAT =", value, "bfJjbDat");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatNotEqualTo(Date value) {
            addCriterion("BF_JJB_DAT <>", value, "bfJjbDat");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatGreaterThan(Date value) {
            addCriterion("BF_JJB_DAT >", value, "bfJjbDat");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatGreaterThanOrEqualTo(Date value) {
            addCriterion("BF_JJB_DAT >=", value, "bfJjbDat");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatLessThan(Date value) {
            addCriterion("BF_JJB_DAT <", value, "bfJjbDat");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatLessThanOrEqualTo(Date value) {
            addCriterion("BF_JJB_DAT <=", value, "bfJjbDat");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatIn(List<Date> values) {
            addCriterion("BF_JJB_DAT in", values, "bfJjbDat");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatNotIn(List<Date> values) {
            addCriterion("BF_JJB_DAT not in", values, "bfJjbDat");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatBetween(Date value1, Date value2) {
            addCriterion("BF_JJB_DAT between", value1, value2, "bfJjbDat");
            return (Criteria) this;
        }

        public Criteria andBfJjbDatNotBetween(Date value1, Date value2) {
            addCriterion("BF_JJB_DAT not between", value1, value2, "bfJjbDat");
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

        public Criteria andDgbrjjDatIsNull() {
            addCriterion("DGBRJJ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andDgbrjjDatIsNotNull() {
            addCriterion("DGBRJJ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andDgbrjjDatEqualTo(Date value) {
            addCriterion("DGBRJJ_DAT =", value, "dgbrjjDat");
            return (Criteria) this;
        }

        public Criteria andDgbrjjDatNotEqualTo(Date value) {
            addCriterion("DGBRJJ_DAT <>", value, "dgbrjjDat");
            return (Criteria) this;
        }

        public Criteria andDgbrjjDatGreaterThan(Date value) {
            addCriterion("DGBRJJ_DAT >", value, "dgbrjjDat");
            return (Criteria) this;
        }

        public Criteria andDgbrjjDatGreaterThanOrEqualTo(Date value) {
            addCriterion("DGBRJJ_DAT >=", value, "dgbrjjDat");
            return (Criteria) this;
        }

        public Criteria andDgbrjjDatLessThan(Date value) {
            addCriterion("DGBRJJ_DAT <", value, "dgbrjjDat");
            return (Criteria) this;
        }

        public Criteria andDgbrjjDatLessThanOrEqualTo(Date value) {
            addCriterion("DGBRJJ_DAT <=", value, "dgbrjjDat");
            return (Criteria) this;
        }

        public Criteria andDgbrjjDatIn(List<Date> values) {
            addCriterion("DGBRJJ_DAT in", values, "dgbrjjDat");
            return (Criteria) this;
        }

        public Criteria andDgbrjjDatNotIn(List<Date> values) {
            addCriterion("DGBRJJ_DAT not in", values, "dgbrjjDat");
            return (Criteria) this;
        }

        public Criteria andDgbrjjDatBetween(Date value1, Date value2) {
            addCriterion("DGBRJJ_DAT between", value1, value2, "dgbrjjDat");
            return (Criteria) this;
        }

        public Criteria andDgbrjjDatNotBetween(Date value1, Date value2) {
            addCriterion("DGBRJJ_DAT not between", value1, value2, "dgbrjjDat");
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