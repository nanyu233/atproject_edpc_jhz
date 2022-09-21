package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCgxjInfExample {
    /**
     * ZJYY.HSP_CGXJ_INF
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_CGXJ_INF
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_CGXJ_INF
     */
    protected List<Criteria> oredCriteria;

    public HspCgxjInfExample() {
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

    /**
     * ZJYY.HSP_CGXJ_INF 2020-08-13
     */
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

        public Criteria andCgxjSeqIsNull() {
            addCriterion("CGXJ_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqIsNotNull() {
            addCriterion("CGXJ_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqEqualTo(String value) {
            addCriterion("CGXJ_SEQ =", value, "cgxjSeq");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqNotEqualTo(String value) {
            addCriterion("CGXJ_SEQ <>", value, "cgxjSeq");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqGreaterThan(String value) {
            addCriterion("CGXJ_SEQ >", value, "cgxjSeq");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqGreaterThanOrEqualTo(String value) {
            addCriterion("CGXJ_SEQ >=", value, "cgxjSeq");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqLessThan(String value) {
            addCriterion("CGXJ_SEQ <", value, "cgxjSeq");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqLessThanOrEqualTo(String value) {
            addCriterion("CGXJ_SEQ <=", value, "cgxjSeq");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqLike(String value) {
            addCriterion("CGXJ_SEQ like", value, "cgxjSeq");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqNotLike(String value) {
            addCriterion("CGXJ_SEQ not like", value, "cgxjSeq");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqIn(List<String> values) {
            addCriterion("CGXJ_SEQ in", values, "cgxjSeq");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqNotIn(List<String> values) {
            addCriterion("CGXJ_SEQ not in", values, "cgxjSeq");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqBetween(String value1, String value2) {
            addCriterion("CGXJ_SEQ between", value1, value2, "cgxjSeq");
            return (Criteria) this;
        }

        public Criteria andCgxjSeqNotBetween(String value1, String value2) {
            addCriterion("CGXJ_SEQ not between", value1, value2, "cgxjSeq");
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

        public Criteria andRyrqDatIsNull() {
            addCriterion("RYRQ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andRyrqDatIsNotNull() {
            addCriterion("RYRQ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andRyrqDatEqualTo(Date value) {
            addCriterion("RYRQ_DAT =", value, "ryrqDat");
            return (Criteria) this;
        }

        public Criteria andRyrqDatNotEqualTo(Date value) {
            addCriterion("RYRQ_DAT <>", value, "ryrqDat");
            return (Criteria) this;
        }

        public Criteria andRyrqDatGreaterThan(Date value) {
            addCriterion("RYRQ_DAT >", value, "ryrqDat");
            return (Criteria) this;
        }

        public Criteria andRyrqDatGreaterThanOrEqualTo(Date value) {
            addCriterion("RYRQ_DAT >=", value, "ryrqDat");
            return (Criteria) this;
        }

        public Criteria andRyrqDatLessThan(Date value) {
            addCriterion("RYRQ_DAT <", value, "ryrqDat");
            return (Criteria) this;
        }

        public Criteria andRyrqDatLessThanOrEqualTo(Date value) {
            addCriterion("RYRQ_DAT <=", value, "ryrqDat");
            return (Criteria) this;
        }

        public Criteria andRyrqDatIn(List<Date> values) {
            addCriterion("RYRQ_DAT in", values, "ryrqDat");
            return (Criteria) this;
        }

        public Criteria andRyrqDatNotIn(List<Date> values) {
            addCriterion("RYRQ_DAT not in", values, "ryrqDat");
            return (Criteria) this;
        }

        public Criteria andRyrqDatBetween(Date value1, Date value2) {
            addCriterion("RYRQ_DAT between", value1, value2, "ryrqDat");
            return (Criteria) this;
        }

        public Criteria andRyrqDatNotBetween(Date value1, Date value2) {
            addCriterion("RYRQ_DAT not between", value1, value2, "ryrqDat");
            return (Criteria) this;
        }

        public Criteria andCyrqDatIsNull() {
            addCriterion("CYRQ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCyrqDatIsNotNull() {
            addCriterion("CYRQ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCyrqDatEqualTo(Date value) {
            addCriterion("CYRQ_DAT =", value, "cyrqDat");
            return (Criteria) this;
        }

        public Criteria andCyrqDatNotEqualTo(Date value) {
            addCriterion("CYRQ_DAT <>", value, "cyrqDat");
            return (Criteria) this;
        }

        public Criteria andCyrqDatGreaterThan(Date value) {
            addCriterion("CYRQ_DAT >", value, "cyrqDat");
            return (Criteria) this;
        }

        public Criteria andCyrqDatGreaterThanOrEqualTo(Date value) {
            addCriterion("CYRQ_DAT >=", value, "cyrqDat");
            return (Criteria) this;
        }

        public Criteria andCyrqDatLessThan(Date value) {
            addCriterion("CYRQ_DAT <", value, "cyrqDat");
            return (Criteria) this;
        }

        public Criteria andCyrqDatLessThanOrEqualTo(Date value) {
            addCriterion("CYRQ_DAT <=", value, "cyrqDat");
            return (Criteria) this;
        }

        public Criteria andCyrqDatIn(List<Date> values) {
            addCriterion("CYRQ_DAT in", values, "cyrqDat");
            return (Criteria) this;
        }

        public Criteria andCyrqDatNotIn(List<Date> values) {
            addCriterion("CYRQ_DAT not in", values, "cyrqDat");
            return (Criteria) this;
        }

        public Criteria andCyrqDatBetween(Date value1, Date value2) {
            addCriterion("CYRQ_DAT between", value1, value2, "cyrqDat");
            return (Criteria) this;
        }

        public Criteria andCyrqDatNotBetween(Date value1, Date value2) {
            addCriterion("CYRQ_DAT not between", value1, value2, "cyrqDat");
            return (Criteria) this;
        }

        public Criteria andLgscLenIsNull() {
            addCriterion("LGSC_LEN is null");
            return (Criteria) this;
        }

        public Criteria andLgscLenIsNotNull() {
            addCriterion("LGSC_LEN is not null");
            return (Criteria) this;
        }

        public Criteria andLgscLenEqualTo(Short value) {
            addCriterion("LGSC_LEN =", value, "lgscLen");
            return (Criteria) this;
        }

        public Criteria andLgscLenNotEqualTo(Short value) {
            addCriterion("LGSC_LEN <>", value, "lgscLen");
            return (Criteria) this;
        }

        public Criteria andLgscLenGreaterThan(Short value) {
            addCriterion("LGSC_LEN >", value, "lgscLen");
            return (Criteria) this;
        }

        public Criteria andLgscLenGreaterThanOrEqualTo(Short value) {
            addCriterion("LGSC_LEN >=", value, "lgscLen");
            return (Criteria) this;
        }

        public Criteria andLgscLenLessThan(Short value) {
            addCriterion("LGSC_LEN <", value, "lgscLen");
            return (Criteria) this;
        }

        public Criteria andLgscLenLessThanOrEqualTo(Short value) {
            addCriterion("LGSC_LEN <=", value, "lgscLen");
            return (Criteria) this;
        }

        public Criteria andLgscLenIn(List<Short> values) {
            addCriterion("LGSC_LEN in", values, "lgscLen");
            return (Criteria) this;
        }

        public Criteria andLgscLenNotIn(List<Short> values) {
            addCriterion("LGSC_LEN not in", values, "lgscLen");
            return (Criteria) this;
        }

        public Criteria andLgscLenBetween(Short value1, Short value2) {
            addCriterion("LGSC_LEN between", value1, value2, "lgscLen");
            return (Criteria) this;
        }

        public Criteria andLgscLenNotBetween(Short value1, Short value2) {
            addCriterion("LGSC_LEN not between", value1, value2, "lgscLen");
            return (Criteria) this;
        }

        public Criteria andRyqkDesIsNull() {
            addCriterion("RYQK_DES is null");
            return (Criteria) this;
        }

        public Criteria andRyqkDesIsNotNull() {
            addCriterion("RYQK_DES is not null");
            return (Criteria) this;
        }

        public Criteria andRyqkDesEqualTo(String value) {
            addCriterion("RYQK_DES =", value, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andRyqkDesNotEqualTo(String value) {
            addCriterion("RYQK_DES <>", value, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andRyqkDesGreaterThan(String value) {
            addCriterion("RYQK_DES >", value, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andRyqkDesGreaterThanOrEqualTo(String value) {
            addCriterion("RYQK_DES >=", value, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andRyqkDesLessThan(String value) {
            addCriterion("RYQK_DES <", value, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andRyqkDesLessThanOrEqualTo(String value) {
            addCriterion("RYQK_DES <=", value, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andRyqkDesLike(String value) {
            addCriterion("RYQK_DES like", value, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andRyqkDesNotLike(String value) {
            addCriterion("RYQK_DES not like", value, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andRyqkDesIn(List<String> values) {
            addCriterion("RYQK_DES in", values, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andRyqkDesNotIn(List<String> values) {
            addCriterion("RYQK_DES not in", values, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andRyqkDesBetween(String value1, String value2) {
            addCriterion("RYQK_DES between", value1, value2, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andRyqkDesNotBetween(String value1, String value2) {
            addCriterion("RYQK_DES not between", value1, value2, "ryqkDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesIsNull() {
            addCriterion("ZLJG_DES is null");
            return (Criteria) this;
        }

        public Criteria andZljgDesIsNotNull() {
            addCriterion("ZLJG_DES is not null");
            return (Criteria) this;
        }

        public Criteria andZljgDesEqualTo(String value) {
            addCriterion("ZLJG_DES =", value, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesNotEqualTo(String value) {
            addCriterion("ZLJG_DES <>", value, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesGreaterThan(String value) {
            addCriterion("ZLJG_DES >", value, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesGreaterThanOrEqualTo(String value) {
            addCriterion("ZLJG_DES >=", value, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesLessThan(String value) {
            addCriterion("ZLJG_DES <", value, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesLessThanOrEqualTo(String value) {
            addCriterion("ZLJG_DES <=", value, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesLike(String value) {
            addCriterion("ZLJG_DES like", value, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesNotLike(String value) {
            addCriterion("ZLJG_DES not like", value, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesIn(List<String> values) {
            addCriterion("ZLJG_DES in", values, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesNotIn(List<String> values) {
            addCriterion("ZLJG_DES not in", values, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesBetween(String value1, String value2) {
            addCriterion("ZLJG_DES between", value1, value2, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andZljgDesNotBetween(String value1, String value2) {
            addCriterion("ZLJG_DES not between", value1, value2, "zljgDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesIsNull() {
            addCriterion("CYQK_DES is null");
            return (Criteria) this;
        }

        public Criteria andCyqkDesIsNotNull() {
            addCriterion("CYQK_DES is not null");
            return (Criteria) this;
        }

        public Criteria andCyqkDesEqualTo(String value) {
            addCriterion("CYQK_DES =", value, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesNotEqualTo(String value) {
            addCriterion("CYQK_DES <>", value, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesGreaterThan(String value) {
            addCriterion("CYQK_DES >", value, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesGreaterThanOrEqualTo(String value) {
            addCriterion("CYQK_DES >=", value, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesLessThan(String value) {
            addCriterion("CYQK_DES <", value, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesLessThanOrEqualTo(String value) {
            addCriterion("CYQK_DES <=", value, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesLike(String value) {
            addCriterion("CYQK_DES like", value, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesNotLike(String value) {
            addCriterion("CYQK_DES not like", value, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesIn(List<String> values) {
            addCriterion("CYQK_DES in", values, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesNotIn(List<String> values) {
            addCriterion("CYQK_DES not in", values, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesBetween(String value1, String value2) {
            addCriterion("CYQK_DES between", value1, value2, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyqkDesNotBetween(String value1, String value2) {
            addCriterion("CYQK_DES not between", value1, value2, "cyqkDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesIsNull() {
            addCriterion("CYYZ_DES is null");
            return (Criteria) this;
        }

        public Criteria andCyyzDesIsNotNull() {
            addCriterion("CYYZ_DES is not null");
            return (Criteria) this;
        }

        public Criteria andCyyzDesEqualTo(String value) {
            addCriterion("CYYZ_DES =", value, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesNotEqualTo(String value) {
            addCriterion("CYYZ_DES <>", value, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesGreaterThan(String value) {
            addCriterion("CYYZ_DES >", value, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesGreaterThanOrEqualTo(String value) {
            addCriterion("CYYZ_DES >=", value, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesLessThan(String value) {
            addCriterion("CYYZ_DES <", value, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesLessThanOrEqualTo(String value) {
            addCriterion("CYYZ_DES <=", value, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesLike(String value) {
            addCriterion("CYYZ_DES like", value, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesNotLike(String value) {
            addCriterion("CYYZ_DES not like", value, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesIn(List<String> values) {
            addCriterion("CYYZ_DES in", values, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesNotIn(List<String> values) {
            addCriterion("CYYZ_DES not in", values, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesBetween(String value1, String value2) {
            addCriterion("CYYZ_DES between", value1, value2, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andCyyzDesNotBetween(String value1, String value2) {
            addCriterion("CYYZ_DES not between", value1, value2, "cyyzDes");
            return (Criteria) this;
        }

        public Criteria andOprtDatIsNull() {
            addCriterion("OPRT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andOprtDatIsNotNull() {
            addCriterion("OPRT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andOprtDatEqualTo(Date value) {
            addCriterion("OPRT_DAT =", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotEqualTo(Date value) {
            addCriterion("OPRT_DAT <>", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatGreaterThan(Date value) {
            addCriterion("OPRT_DAT >", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatGreaterThanOrEqualTo(Date value) {
            addCriterion("OPRT_DAT >=", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatLessThan(Date value) {
            addCriterion("OPRT_DAT <", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatLessThanOrEqualTo(Date value) {
            addCriterion("OPRT_DAT <=", value, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatIn(List<Date> values) {
            addCriterion("OPRT_DAT in", values, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotIn(List<Date> values) {
            addCriterion("OPRT_DAT not in", values, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatBetween(Date value1, Date value2) {
            addCriterion("OPRT_DAT between", value1, value2, "oprtDat");
            return (Criteria) this;
        }

        public Criteria andOprtDatNotBetween(Date value1, Date value2) {
            addCriterion("OPRT_DAT not between", value1, value2, "oprtDat");
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

        public Criteria andCratNamIsNull() {
            addCriterion("CRAT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCratNamIsNotNull() {
            addCriterion("CRAT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCratNamEqualTo(String value) {
            addCriterion("CRAT_NAM =", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotEqualTo(String value) {
            addCriterion("CRAT_NAM <>", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamGreaterThan(String value) {
            addCriterion("CRAT_NAM >", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamGreaterThanOrEqualTo(String value) {
            addCriterion("CRAT_NAM >=", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamLessThan(String value) {
            addCriterion("CRAT_NAM <", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamLessThanOrEqualTo(String value) {
            addCriterion("CRAT_NAM <=", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamLike(String value) {
            addCriterion("CRAT_NAM like", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotLike(String value) {
            addCriterion("CRAT_NAM not like", value, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamIn(List<String> values) {
            addCriterion("CRAT_NAM in", values, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotIn(List<String> values) {
            addCriterion("CRAT_NAM not in", values, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamBetween(String value1, String value2) {
            addCriterion("CRAT_NAM between", value1, value2, "cratNam");
            return (Criteria) this;
        }

        public Criteria andCratNamNotBetween(String value1, String value2) {
            addCriterion("CRAT_NAM not between", value1, value2, "cratNam");
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

        public Criteria andUpdtNamIsNull() {
            addCriterion("UPDT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andUpdtNamIsNotNull() {
            addCriterion("UPDT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtNamEqualTo(String value) {
            addCriterion("UPDT_NAM =", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotEqualTo(String value) {
            addCriterion("UPDT_NAM <>", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamGreaterThan(String value) {
            addCriterion("UPDT_NAM >", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamGreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM >=", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamLessThan(String value) {
            addCriterion("UPDT_NAM <", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamLessThanOrEqualTo(String value) {
            addCriterion("UPDT_NAM <=", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamLike(String value) {
            addCriterion("UPDT_NAM like", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotLike(String value) {
            addCriterion("UPDT_NAM not like", value, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamIn(List<String> values) {
            addCriterion("UPDT_NAM in", values, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotIn(List<String> values) {
            addCriterion("UPDT_NAM not in", values, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamBetween(String value1, String value2) {
            addCriterion("UPDT_NAM between", value1, value2, "updtNam");
            return (Criteria) this;
        }

        public Criteria andUpdtNamNotBetween(String value1, String value2) {
            addCriterion("UPDT_NAM not between", value1, value2, "updtNam");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypIsNull() {
            addCriterion("CGXJ_DAT_TYP is null");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypIsNotNull() {
            addCriterion("CGXJ_DAT_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypEqualTo(String value) {
            addCriterion("CGXJ_DAT_TYP =", value, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypNotEqualTo(String value) {
            addCriterion("CGXJ_DAT_TYP <>", value, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypGreaterThan(String value) {
            addCriterion("CGXJ_DAT_TYP >", value, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypGreaterThanOrEqualTo(String value) {
            addCriterion("CGXJ_DAT_TYP >=", value, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypLessThan(String value) {
            addCriterion("CGXJ_DAT_TYP <", value, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypLessThanOrEqualTo(String value) {
            addCriterion("CGXJ_DAT_TYP <=", value, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypLike(String value) {
            addCriterion("CGXJ_DAT_TYP like", value, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypNotLike(String value) {
            addCriterion("CGXJ_DAT_TYP not like", value, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypIn(List<String> values) {
            addCriterion("CGXJ_DAT_TYP in", values, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypNotIn(List<String> values) {
            addCriterion("CGXJ_DAT_TYP not in", values, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypBetween(String value1, String value2) {
            addCriterion("CGXJ_DAT_TYP between", value1, value2, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andCgxjDatTypNotBetween(String value1, String value2) {
            addCriterion("CGXJ_DAT_TYP not between", value1, value2, "cgxjDatTyp");
            return (Criteria) this;
        }

        public Criteria andSqlTypeIsNull() {
            addCriterion("SQL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSqlTypeIsNotNull() {
            addCriterion("SQL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSqlTypeEqualTo(String value) {
            addCriterion("SQL_TYPE =", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeNotEqualTo(String value) {
            addCriterion("SQL_TYPE <>", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeGreaterThan(String value) {
            addCriterion("SQL_TYPE >", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_TYPE >=", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeLessThan(String value) {
            addCriterion("SQL_TYPE <", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeLessThanOrEqualTo(String value) {
            addCriterion("SQL_TYPE <=", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeLike(String value) {
            addCriterion("SQL_TYPE like", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeNotLike(String value) {
            addCriterion("SQL_TYPE not like", value, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeIn(List<String> values) {
            addCriterion("SQL_TYPE in", values, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeNotIn(List<String> values) {
            addCriterion("SQL_TYPE not in", values, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeBetween(String value1, String value2) {
            addCriterion("SQL_TYPE between", value1, value2, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlTypeNotBetween(String value1, String value2) {
            addCriterion("SQL_TYPE not between", value1, value2, "sqlType");
            return (Criteria) this;
        }

        public Criteria andSqlDesIsNull() {
            addCriterion("SQL_DES is null");
            return (Criteria) this;
        }

        public Criteria andSqlDesIsNotNull() {
            addCriterion("SQL_DES is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDesEqualTo(String value) {
            addCriterion("SQL_DES =", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesNotEqualTo(String value) {
            addCriterion("SQL_DES <>", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesGreaterThan(String value) {
            addCriterion("SQL_DES >", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_DES >=", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesLessThan(String value) {
            addCriterion("SQL_DES <", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesLessThanOrEqualTo(String value) {
            addCriterion("SQL_DES <=", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesLike(String value) {
            addCriterion("SQL_DES like", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesNotLike(String value) {
            addCriterion("SQL_DES not like", value, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesIn(List<String> values) {
            addCriterion("SQL_DES in", values, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesNotIn(List<String> values) {
            addCriterion("SQL_DES not in", values, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesBetween(String value1, String value2) {
            addCriterion("SQL_DES between", value1, value2, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDesNotBetween(String value1, String value2) {
            addCriterion("SQL_DES not between", value1, value2, "sqlDes");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodIsNull() {
            addCriterion("SQL_DEP_COD is null");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodIsNotNull() {
            addCriterion("SQL_DEP_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodEqualTo(String value) {
            addCriterion("SQL_DEP_COD =", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodNotEqualTo(String value) {
            addCriterion("SQL_DEP_COD <>", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodGreaterThan(String value) {
            addCriterion("SQL_DEP_COD >", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_DEP_COD >=", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodLessThan(String value) {
            addCriterion("SQL_DEP_COD <", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodLessThanOrEqualTo(String value) {
            addCriterion("SQL_DEP_COD <=", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodLike(String value) {
            addCriterion("SQL_DEP_COD like", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodNotLike(String value) {
            addCriterion("SQL_DEP_COD not like", value, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodIn(List<String> values) {
            addCriterion("SQL_DEP_COD in", values, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodNotIn(List<String> values) {
            addCriterion("SQL_DEP_COD not in", values, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodBetween(String value1, String value2) {
            addCriterion("SQL_DEP_COD between", value1, value2, "sqlDepCod");
            return (Criteria) this;
        }

        public Criteria andSqlDepCodNotBetween(String value1, String value2) {
            addCriterion("SQL_DEP_COD not between", value1, value2, "sqlDepCod");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_CGXJ_INF
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_CGXJ_INF 2020-08-13
     */
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