package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspBedInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspBedInfExample() {
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

        public Criteria andBedidIsNull() {
            addCriterion("BEDID is null");
            return (Criteria) this;
        }

        public Criteria andBedidIsNotNull() {
            addCriterion("BEDID is not null");
            return (Criteria) this;
        }

        public Criteria andBedidEqualTo(String value) {
            addCriterion("BEDID =", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidNotEqualTo(String value) {
            addCriterion("BEDID <>", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidGreaterThan(String value) {
            addCriterion("BEDID >", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidGreaterThanOrEqualTo(String value) {
            addCriterion("BEDID >=", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidLessThan(String value) {
            addCriterion("BEDID <", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidLessThanOrEqualTo(String value) {
            addCriterion("BEDID <=", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidLike(String value) {
            addCriterion("BEDID like", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidNotLike(String value) {
            addCriterion("BEDID not like", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidIn(List<String> values) {
            addCriterion("BEDID in", values, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidNotIn(List<String> values) {
            addCriterion("BEDID not in", values, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidBetween(String value1, String value2) {
            addCriterion("BEDID between", value1, value2, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidNotBetween(String value1, String value2) {
            addCriterion("BEDID not between", value1, value2, "bedid");
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

        public Criteria andBedPlaceIsNull() {
            addCriterion("BED_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andBedPlaceIsNotNull() {
            addCriterion("BED_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andBedPlaceEqualTo(String value) {
            addCriterion("BED_PLACE =", value, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedPlaceNotEqualTo(String value) {
            addCriterion("BED_PLACE <>", value, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedPlaceGreaterThan(String value) {
            addCriterion("BED_PLACE >", value, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("BED_PLACE >=", value, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedPlaceLessThan(String value) {
            addCriterion("BED_PLACE <", value, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedPlaceLessThanOrEqualTo(String value) {
            addCriterion("BED_PLACE <=", value, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedPlaceLike(String value) {
            addCriterion("BED_PLACE like", value, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedPlaceNotLike(String value) {
            addCriterion("BED_PLACE not like", value, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedPlaceIn(List<String> values) {
            addCriterion("BED_PLACE in", values, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedPlaceNotIn(List<String> values) {
            addCriterion("BED_PLACE not in", values, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedPlaceBetween(String value1, String value2) {
            addCriterion("BED_PLACE between", value1, value2, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedPlaceNotBetween(String value1, String value2) {
            addCriterion("BED_PLACE not between", value1, value2, "bedPlace");
            return (Criteria) this;
        }

        public Criteria andBedNumIsNull() {
            addCriterion("BED_NUM is null");
            return (Criteria) this;
        }

        public Criteria andBedNumIsNotNull() {
            addCriterion("BED_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andBedNumEqualTo(String value) {
            addCriterion("BED_NUM =", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotEqualTo(String value) {
            addCriterion("BED_NUM <>", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumGreaterThan(String value) {
            addCriterion("BED_NUM >", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumGreaterThanOrEqualTo(String value) {
            addCriterion("BED_NUM >=", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLessThan(String value) {
            addCriterion("BED_NUM <", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLessThanOrEqualTo(String value) {
            addCriterion("BED_NUM <=", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLike(String value) {
            addCriterion("BED_NUM like", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotLike(String value) {
            addCriterion("BED_NUM not like", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumIn(List<String> values) {
            addCriterion("BED_NUM in", values, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotIn(List<String> values) {
            addCriterion("BED_NUM not in", values, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumBetween(String value1, String value2) {
            addCriterion("BED_NUM between", value1, value2, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotBetween(String value1, String value2) {
            addCriterion("BED_NUM not between", value1, value2, "bedNum");
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

        public Criteria andCrtNamIsNull() {
            addCriterion("CRT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCrtNamIsNotNull() {
            addCriterion("CRT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNamEqualTo(String value) {
            addCriterion("CRT_NAM =", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotEqualTo(String value) {
            addCriterion("CRT_NAM <>", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamGreaterThan(String value) {
            addCriterion("CRT_NAM >", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NAM >=", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLessThan(String value) {
            addCriterion("CRT_NAM <", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLessThanOrEqualTo(String value) {
            addCriterion("CRT_NAM <=", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLike(String value) {
            addCriterion("CRT_NAM like", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotLike(String value) {
            addCriterion("CRT_NAM not like", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamIn(List<String> values) {
            addCriterion("CRT_NAM in", values, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotIn(List<String> values) {
            addCriterion("CRT_NAM not in", values, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamBetween(String value1, String value2) {
            addCriterion("CRT_NAM between", value1, value2, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotBetween(String value1, String value2) {
            addCriterion("CRT_NAM not between", value1, value2, "crtNam");
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

        public Criteria andUpdNamIsNull() {
            addCriterion("UPD_NAM is null");
            return (Criteria) this;
        }

        public Criteria andUpdNamIsNotNull() {
            addCriterion("UPD_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdNamEqualTo(String value) {
            addCriterion("UPD_NAM =", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotEqualTo(String value) {
            addCriterion("UPD_NAM <>", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamGreaterThan(String value) {
            addCriterion("UPD_NAM >", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_NAM >=", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamLessThan(String value) {
            addCriterion("UPD_NAM <", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamLessThanOrEqualTo(String value) {
            addCriterion("UPD_NAM <=", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamLike(String value) {
            addCriterion("UPD_NAM like", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotLike(String value) {
            addCriterion("UPD_NAM not like", value, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamIn(List<String> values) {
            addCriterion("UPD_NAM in", values, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotIn(List<String> values) {
            addCriterion("UPD_NAM not in", values, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamBetween(String value1, String value2) {
            addCriterion("UPD_NAM between", value1, value2, "updNam");
            return (Criteria) this;
        }

        public Criteria andUpdNamNotBetween(String value1, String value2) {
            addCriterion("UPD_NAM not between", value1, value2, "updNam");
            return (Criteria) this;
        }

        public Criteria andBedStatusIsNull() {
            addCriterion("BED_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBedStatusIsNotNull() {
            addCriterion("BED_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBedStatusEqualTo(String value) {
            addCriterion("BED_STATUS =", value, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andBedStatusNotEqualTo(String value) {
            addCriterion("BED_STATUS <>", value, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andBedStatusGreaterThan(String value) {
            addCriterion("BED_STATUS >", value, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andBedStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BED_STATUS >=", value, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andBedStatusLessThan(String value) {
            addCriterion("BED_STATUS <", value, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andBedStatusLessThanOrEqualTo(String value) {
            addCriterion("BED_STATUS <=", value, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andBedStatusLike(String value) {
            addCriterion("BED_STATUS like", value, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andBedStatusNotLike(String value) {
            addCriterion("BED_STATUS not like", value, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andBedStatusIn(List<String> values) {
            addCriterion("BED_STATUS in", values, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andBedStatusNotIn(List<String> values) {
            addCriterion("BED_STATUS not in", values, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andBedStatusBetween(String value1, String value2) {
            addCriterion("BED_STATUS between", value1, value2, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andBedStatusNotBetween(String value1, String value2) {
            addCriterion("BED_STATUS not between", value1, value2, "bedStatus");
            return (Criteria) this;
        }

        public Criteria andShoworderIsNull() {
            addCriterion("SHOWORDER is null");
            return (Criteria) this;
        }

        public Criteria andShoworderIsNotNull() {
            addCriterion("SHOWORDER is not null");
            return (Criteria) this;
        }

        public Criteria andShoworderEqualTo(String value) {
            addCriterion("SHOWORDER =", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotEqualTo(String value) {
            addCriterion("SHOWORDER <>", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThan(String value) {
            addCriterion("SHOWORDER >", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWORDER >=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThan(String value) {
            addCriterion("SHOWORDER <", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThanOrEqualTo(String value) {
            addCriterion("SHOWORDER <=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLike(String value) {
            addCriterion("SHOWORDER like", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotLike(String value) {
            addCriterion("SHOWORDER not like", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderIn(List<String> values) {
            addCriterion("SHOWORDER in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotIn(List<String> values) {
            addCriterion("SHOWORDER not in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderBetween(String value1, String value2) {
            addCriterion("SHOWORDER between", value1, value2, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotBetween(String value1, String value2) {
            addCriterion("SHOWORDER not between", value1, value2, "showorder");
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