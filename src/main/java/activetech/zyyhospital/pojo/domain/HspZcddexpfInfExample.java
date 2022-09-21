package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspZcddexpfInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspZcddexpfInfExample() {
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

        public Criteria andXtpgSeqIsNull() {
            addCriterion("XTPG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIsNotNull() {
            addCriterion("XTPG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqEqualTo(String value) {
            addCriterion("XTPG_SEQ =", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotEqualTo(String value) {
            addCriterion("XTPG_SEQ <>", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThan(String value) {
            addCriterion("XTPG_SEQ >", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ >=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThan(String value) {
            addCriterion("XTPG_SEQ <", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ <=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLike(String value) {
            addCriterion("XTPG_SEQ like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotLike(String value) {
            addCriterion("XTPG_SEQ not like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIn(List<String> values) {
            addCriterion("XTPG_SEQ in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotIn(List<String> values) {
            addCriterion("XTPG_SEQ not in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ between", value1, value2, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ not between", value1, value2, "xtpgSeq");
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

        public Criteria andZcddexpfYnbmddIsNull() {
            addCriterion("ZCDDEXPF_YNBMDD is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYnbmddIsNotNull() {
            addCriterion("ZCDDEXPF_YNBMDD is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYnbmddEqualTo(Long value) {
            addCriterion("ZCDDEXPF_YNBMDD =", value, "zcddexpfYnbmdd");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYnbmddNotEqualTo(Long value) {
            addCriterion("ZCDDEXPF_YNBMDD <>", value, "zcddexpfYnbmdd");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYnbmddGreaterThan(Long value) {
            addCriterion("ZCDDEXPF_YNBMDD >", value, "zcddexpfYnbmdd");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYnbmddGreaterThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_YNBMDD >=", value, "zcddexpfYnbmdd");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYnbmddLessThan(Long value) {
            addCriterion("ZCDDEXPF_YNBMDD <", value, "zcddexpfYnbmdd");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYnbmddLessThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_YNBMDD <=", value, "zcddexpfYnbmdd");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYnbmddIn(List<Long> values) {
            addCriterion("ZCDDEXPF_YNBMDD in", values, "zcddexpfYnbmdd");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYnbmddNotIn(List<Long> values) {
            addCriterion("ZCDDEXPF_YNBMDD not in", values, "zcddexpfYnbmdd");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYnbmddBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_YNBMDD between", value1, value2, "zcddexpfYnbmdd");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYnbmddNotBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_YNBMDD not between", value1, value2, "zcddexpfYnbmdd");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaIsNull() {
            addCriterion("ZCDDEXPF_YSZA is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaIsNotNull() {
            addCriterion("ZCDDEXPF_YSZA is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaEqualTo(Long value) {
            addCriterion("ZCDDEXPF_YSZA =", value, "zcddexpfYsza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaNotEqualTo(Long value) {
            addCriterion("ZCDDEXPF_YSZA <>", value, "zcddexpfYsza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaGreaterThan(Long value) {
            addCriterion("ZCDDEXPF_YSZA >", value, "zcddexpfYsza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaGreaterThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_YSZA >=", value, "zcddexpfYsza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaLessThan(Long value) {
            addCriterion("ZCDDEXPF_YSZA <", value, "zcddexpfYsza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaLessThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_YSZA <=", value, "zcddexpfYsza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaIn(List<Long> values) {
            addCriterion("ZCDDEXPF_YSZA in", values, "zcddexpfYsza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaNotIn(List<Long> values) {
            addCriterion("ZCDDEXPF_YSZA not in", values, "zcddexpfYsza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_YSZA between", value1, value2, "zcddexpfYsza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfYszaNotBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_YSZA not between", value1, value2, "zcddexpfYsza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaIsNull() {
            addCriterion("ZCDDEXPF_SLZA is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaIsNotNull() {
            addCriterion("ZCDDEXPF_SLZA is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaEqualTo(Long value) {
            addCriterion("ZCDDEXPF_SLZA =", value, "zcddexpfSlza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaNotEqualTo(Long value) {
            addCriterion("ZCDDEXPF_SLZA <>", value, "zcddexpfSlza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaGreaterThan(Long value) {
            addCriterion("ZCDDEXPF_SLZA >", value, "zcddexpfSlza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaGreaterThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_SLZA >=", value, "zcddexpfSlza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaLessThan(Long value) {
            addCriterion("ZCDDEXPF_SLZA <", value, "zcddexpfSlza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaLessThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_SLZA <=", value, "zcddexpfSlza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaIn(List<Long> values) {
            addCriterion("ZCDDEXPF_SLZA in", values, "zcddexpfSlza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaNotIn(List<Long> values) {
            addCriterion("ZCDDEXPF_SLZA not in", values, "zcddexpfSlza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_SLZA between", value1, value2, "zcddexpfSlza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfSlzaNotBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_SLZA not between", value1, value2, "zcddexpfSlza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaIsNull() {
            addCriterion("ZCDDEXPF_HDZA is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaIsNotNull() {
            addCriterion("ZCDDEXPF_HDZA is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaEqualTo(Long value) {
            addCriterion("ZCDDEXPF_HDZA =", value, "zcddexpfHdza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaNotEqualTo(Long value) {
            addCriterion("ZCDDEXPF_HDZA <>", value, "zcddexpfHdza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaGreaterThan(Long value) {
            addCriterion("ZCDDEXPF_HDZA >", value, "zcddexpfHdza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaGreaterThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_HDZA >=", value, "zcddexpfHdza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaLessThan(Long value) {
            addCriterion("ZCDDEXPF_HDZA <", value, "zcddexpfHdza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaLessThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_HDZA <=", value, "zcddexpfHdza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaIn(List<Long> values) {
            addCriterion("ZCDDEXPF_HDZA in", values, "zcddexpfHdza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaNotIn(List<Long> values) {
            addCriterion("ZCDDEXPF_HDZA not in", values, "zcddexpfHdza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_HDZA between", value1, value2, "zcddexpfHdza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfHdzaNotBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_HDZA not between", value1, value2, "zcddexpfHdza");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlIsNull() {
            addCriterion("ZCDDEXPF_NL is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlIsNotNull() {
            addCriterion("ZCDDEXPF_NL is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlEqualTo(Long value) {
            addCriterion("ZCDDEXPF_NL =", value, "zcddexpfNl");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlNotEqualTo(Long value) {
            addCriterion("ZCDDEXPF_NL <>", value, "zcddexpfNl");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlGreaterThan(Long value) {
            addCriterion("ZCDDEXPF_NL >", value, "zcddexpfNl");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlGreaterThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_NL >=", value, "zcddexpfNl");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlLessThan(Long value) {
            addCriterion("ZCDDEXPF_NL <", value, "zcddexpfNl");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlLessThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_NL <=", value, "zcddexpfNl");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlIn(List<Long> values) {
            addCriterion("ZCDDEXPF_NL in", values, "zcddexpfNl");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlNotIn(List<Long> values) {
            addCriterion("ZCDDEXPF_NL not in", values, "zcddexpfNl");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_NL between", value1, value2, "zcddexpfNl");
            return (Criteria) this;
        }

        public Criteria andZcddexpfNlNotBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_NL not between", value1, value2, "zcddexpfNl");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrIsNull() {
            addCriterion("ZCDDEXPF_TNXR is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrIsNotNull() {
            addCriterion("ZCDDEXPF_TNXR is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_TNXR =", value, "zcddexpfTnxr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrNotEqualTo(Long value) {
            addCriterion("ZCDDEXPF_TNXR <>", value, "zcddexpfTnxr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrGreaterThan(Long value) {
            addCriterion("ZCDDEXPF_TNXR >", value, "zcddexpfTnxr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrGreaterThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_TNXR >=", value, "zcddexpfTnxr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrLessThan(Long value) {
            addCriterion("ZCDDEXPF_TNXR <", value, "zcddexpfTnxr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrLessThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_TNXR <=", value, "zcddexpfTnxr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrIn(List<Long> values) {
            addCriterion("ZCDDEXPF_TNXR in", values, "zcddexpfTnxr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrNotIn(List<Long> values) {
            addCriterion("ZCDDEXPF_TNXR not in", values, "zcddexpfTnxr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_TNXR between", value1, value2, "zcddexpfTnxr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTnxrNotBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_TNXR not between", value1, value2, "zcddexpfTnxr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyIsNull() {
            addCriterion("ZCDDEXPF_TYXY is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyIsNotNull() {
            addCriterion("ZCDDEXPF_TYXY is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyEqualTo(Long value) {
            addCriterion("ZCDDEXPF_TYXY =", value, "zcddexpfTyxy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyNotEqualTo(Long value) {
            addCriterion("ZCDDEXPF_TYXY <>", value, "zcddexpfTyxy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyGreaterThan(Long value) {
            addCriterion("ZCDDEXPF_TYXY >", value, "zcddexpfTyxy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyGreaterThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_TYXY >=", value, "zcddexpfTyxy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyLessThan(Long value) {
            addCriterion("ZCDDEXPF_TYXY <", value, "zcddexpfTyxy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyLessThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_TYXY <=", value, "zcddexpfTyxy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyIn(List<Long> values) {
            addCriterion("ZCDDEXPF_TYXY in", values, "zcddexpfTyxy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyNotIn(List<Long> values) {
            addCriterion("ZCDDEXPF_TYXY not in", values, "zcddexpfTyxy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_TYXY between", value1, value2, "zcddexpfTyxy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfTyxyNotBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_TYXY not between", value1, value2, "zcddexpfTyxy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrIsNull() {
            addCriterion("ZCDDEXPF_ZYYWJR is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrIsNotNull() {
            addCriterion("ZCDDEXPF_ZYYWJR is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_ZYYWJR =", value, "zcddexpfZyywjr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrNotEqualTo(Long value) {
            addCriterion("ZCDDEXPF_ZYYWJR <>", value, "zcddexpfZyywjr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrGreaterThan(Long value) {
            addCriterion("ZCDDEXPF_ZYYWJR >", value, "zcddexpfZyywjr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrGreaterThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_ZYYWJR >=", value, "zcddexpfZyywjr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrLessThan(Long value) {
            addCriterion("ZCDDEXPF_ZYYWJR <", value, "zcddexpfZyywjr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrLessThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_ZYYWJR <=", value, "zcddexpfZyywjr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrIn(List<Long> values) {
            addCriterion("ZCDDEXPF_ZYYWJR in", values, "zcddexpfZyywjr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrNotIn(List<Long> values) {
            addCriterion("ZCDDEXPF_ZYYWJR not in", values, "zcddexpfZyywjr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_ZYYWJR between", value1, value2, "zcddexpfZyywjr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfZyywjrNotBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_ZYYWJR not between", value1, value2, "zcddexpfZyywjr");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbIsNull() {
            addCriterion("ZCDDEXPF_JRPB is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbIsNotNull() {
            addCriterion("ZCDDEXPF_JRPB is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbEqualTo(Long value) {
            addCriterion("ZCDDEXPF_JRPB =", value, "zcddexpfJrpb");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbNotEqualTo(Long value) {
            addCriterion("ZCDDEXPF_JRPB <>", value, "zcddexpfJrpb");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbGreaterThan(Long value) {
            addCriterion("ZCDDEXPF_JRPB >", value, "zcddexpfJrpb");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbGreaterThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_JRPB >=", value, "zcddexpfJrpb");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbLessThan(Long value) {
            addCriterion("ZCDDEXPF_JRPB <", value, "zcddexpfJrpb");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbLessThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_JRPB <=", value, "zcddexpfJrpb");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbIn(List<Long> values) {
            addCriterion("ZCDDEXPF_JRPB in", values, "zcddexpfJrpb");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbNotIn(List<Long> values) {
            addCriterion("ZCDDEXPF_JRPB not in", values, "zcddexpfJrpb");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_JRPB between", value1, value2, "zcddexpfJrpb");
            return (Criteria) this;
        }

        public Criteria andZcddexpfJrpbNotBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_JRPB not between", value1, value2, "zcddexpfJrpb");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyIsNull() {
            addCriterion("ZCDDEXPF_MY is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyIsNotNull() {
            addCriterion("ZCDDEXPF_MY is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyEqualTo(Long value) {
            addCriterion("ZCDDEXPF_MY =", value, "zcddexpfMy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyNotEqualTo(Long value) {
            addCriterion("ZCDDEXPF_MY <>", value, "zcddexpfMy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyGreaterThan(Long value) {
            addCriterion("ZCDDEXPF_MY >", value, "zcddexpfMy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyGreaterThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_MY >=", value, "zcddexpfMy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyLessThan(Long value) {
            addCriterion("ZCDDEXPF_MY <", value, "zcddexpfMy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyLessThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_MY <=", value, "zcddexpfMy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyIn(List<Long> values) {
            addCriterion("ZCDDEXPF_MY in", values, "zcddexpfMy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyNotIn(List<Long> values) {
            addCriterion("ZCDDEXPF_MY not in", values, "zcddexpfMy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_MY between", value1, value2, "zcddexpfMy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMyNotBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_MY not between", value1, value2, "zcddexpfMy");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoIsNull() {
            addCriterion("ZCDDEXPF_SCO is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoIsNotNull() {
            addCriterion("ZCDDEXPF_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoEqualTo(Long value) {
            addCriterion("ZCDDEXPF_SCO =", value, "zcddexpfSco");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoNotEqualTo(Long value) {
            addCriterion("ZCDDEXPF_SCO <>", value, "zcddexpfSco");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoGreaterThan(Long value) {
            addCriterion("ZCDDEXPF_SCO >", value, "zcddexpfSco");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoGreaterThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_SCO >=", value, "zcddexpfSco");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoLessThan(Long value) {
            addCriterion("ZCDDEXPF_SCO <", value, "zcddexpfSco");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoLessThanOrEqualTo(Long value) {
            addCriterion("ZCDDEXPF_SCO <=", value, "zcddexpfSco");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoIn(List<Long> values) {
            addCriterion("ZCDDEXPF_SCO in", values, "zcddexpfSco");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoNotIn(List<Long> values) {
            addCriterion("ZCDDEXPF_SCO not in", values, "zcddexpfSco");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_SCO between", value1, value2, "zcddexpfSco");
            return (Criteria) this;
        }

        public Criteria andZcddexpfScoNotBetween(Long value1, Long value2) {
            addCriterion("ZCDDEXPF_SCO not between", value1, value2, "zcddexpfSco");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoIsNull() {
            addCriterion("ZCDDEXPF_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoIsNotNull() {
            addCriterion("ZCDDEXPF_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoEqualTo(String value) {
            addCriterion("ZCDDEXPF_MEMO =", value, "zcddexpfMemo");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoNotEqualTo(String value) {
            addCriterion("ZCDDEXPF_MEMO <>", value, "zcddexpfMemo");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoGreaterThan(String value) {
            addCriterion("ZCDDEXPF_MEMO >", value, "zcddexpfMemo");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ZCDDEXPF_MEMO >=", value, "zcddexpfMemo");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoLessThan(String value) {
            addCriterion("ZCDDEXPF_MEMO <", value, "zcddexpfMemo");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoLessThanOrEqualTo(String value) {
            addCriterion("ZCDDEXPF_MEMO <=", value, "zcddexpfMemo");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoLike(String value) {
            addCriterion("ZCDDEXPF_MEMO like", value, "zcddexpfMemo");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoNotLike(String value) {
            addCriterion("ZCDDEXPF_MEMO not like", value, "zcddexpfMemo");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoIn(List<String> values) {
            addCriterion("ZCDDEXPF_MEMO in", values, "zcddexpfMemo");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoNotIn(List<String> values) {
            addCriterion("ZCDDEXPF_MEMO not in", values, "zcddexpfMemo");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoBetween(String value1, String value2) {
            addCriterion("ZCDDEXPF_MEMO between", value1, value2, "zcddexpfMemo");
            return (Criteria) this;
        }

        public Criteria andZcddexpfMemoNotBetween(String value1, String value2) {
            addCriterion("ZCDDEXPF_MEMO not between", value1, value2, "zcddexpfMemo");
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