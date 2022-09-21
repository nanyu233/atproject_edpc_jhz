package activetech.aid.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AidPatientXtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AidPatientXtExample() {
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

        public Criteria andXtSeqIsNull() {
            addCriterion("XT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andXtSeqIsNotNull() {
            addCriterion("XT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andXtSeqEqualTo(String value) {
            addCriterion("XT_SEQ =", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqNotEqualTo(String value) {
            addCriterion("XT_SEQ <>", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqGreaterThan(String value) {
            addCriterion("XT_SEQ >", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqGreaterThanOrEqualTo(String value) {
            addCriterion("XT_SEQ >=", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqLessThan(String value) {
            addCriterion("XT_SEQ <", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqLessThanOrEqualTo(String value) {
            addCriterion("XT_SEQ <=", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqLike(String value) {
            addCriterion("XT_SEQ like", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqNotLike(String value) {
            addCriterion("XT_SEQ not like", value, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqIn(List<String> values) {
            addCriterion("XT_SEQ in", values, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqNotIn(List<String> values) {
            addCriterion("XT_SEQ not in", values, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqBetween(String value1, String value2) {
            addCriterion("XT_SEQ between", value1, value2, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andXtSeqNotBetween(String value1, String value2) {
            addCriterion("XT_SEQ not between", value1, value2, "xtSeq");
            return (Criteria) this;
        }

        public Criteria andBqpgIsNull() {
            addCriterion("BQPG is null");
            return (Criteria) this;
        }

        public Criteria andBqpgIsNotNull() {
            addCriterion("BQPG is not null");
            return (Criteria) this;
        }

        public Criteria andBqpgEqualTo(String value) {
            addCriterion("BQPG =", value, "bqpg");
            return (Criteria) this;
        }

        public Criteria andBqpgNotEqualTo(String value) {
            addCriterion("BQPG <>", value, "bqpg");
            return (Criteria) this;
        }

        public Criteria andBqpgGreaterThan(String value) {
            addCriterion("BQPG >", value, "bqpg");
            return (Criteria) this;
        }

        public Criteria andBqpgGreaterThanOrEqualTo(String value) {
            addCriterion("BQPG >=", value, "bqpg");
            return (Criteria) this;
        }

        public Criteria andBqpgLessThan(String value) {
            addCriterion("BQPG <", value, "bqpg");
            return (Criteria) this;
        }

        public Criteria andBqpgLessThanOrEqualTo(String value) {
            addCriterion("BQPG <=", value, "bqpg");
            return (Criteria) this;
        }

        public Criteria andBqpgLike(String value) {
            addCriterion("BQPG like", value, "bqpg");
            return (Criteria) this;
        }

        public Criteria andBqpgNotLike(String value) {
            addCriterion("BQPG not like", value, "bqpg");
            return (Criteria) this;
        }

        public Criteria andBqpgIn(List<String> values) {
            addCriterion("BQPG in", values, "bqpg");
            return (Criteria) this;
        }

        public Criteria andBqpgNotIn(List<String> values) {
            addCriterion("BQPG not in", values, "bqpg");
            return (Criteria) this;
        }

        public Criteria andBqpgBetween(String value1, String value2) {
            addCriterion("BQPG between", value1, value2, "bqpg");
            return (Criteria) this;
        }

        public Criteria andBqpgNotBetween(String value1, String value2) {
            addCriterion("BQPG not between", value1, value2, "bqpg");
            return (Criteria) this;
        }

        public Criteria andScyljcIsNull() {
            addCriterion("SCYLJC is null");
            return (Criteria) this;
        }

        public Criteria andScyljcIsNotNull() {
            addCriterion("SCYLJC is not null");
            return (Criteria) this;
        }

        public Criteria andScyljcEqualTo(Date value) {
            addCriterion("SCYLJC =", value, "scyljc");
            return (Criteria) this;
        }

        public Criteria andScyljcNotEqualTo(Date value) {
            addCriterion("SCYLJC <>", value, "scyljc");
            return (Criteria) this;
        }

        public Criteria andScyljcGreaterThan(Date value) {
            addCriterion("SCYLJC >", value, "scyljc");
            return (Criteria) this;
        }

        public Criteria andScyljcGreaterThanOrEqualTo(Date value) {
            addCriterion("SCYLJC >=", value, "scyljc");
            return (Criteria) this;
        }

        public Criteria andScyljcLessThan(Date value) {
            addCriterion("SCYLJC <", value, "scyljc");
            return (Criteria) this;
        }

        public Criteria andScyljcLessThanOrEqualTo(Date value) {
            addCriterion("SCYLJC <=", value, "scyljc");
            return (Criteria) this;
        }

        public Criteria andScyljcIn(List<Date> values) {
            addCriterion("SCYLJC in", values, "scyljc");
            return (Criteria) this;
        }

        public Criteria andScyljcNotIn(List<Date> values) {
            addCriterion("SCYLJC not in", values, "scyljc");
            return (Criteria) this;
        }

        public Criteria andScyljcBetween(Date value1, Date value2) {
            addCriterion("SCYLJC between", value1, value2, "scyljc");
            return (Criteria) this;
        }

        public Criteria andScyljcNotBetween(Date value1, Date value2) {
            addCriterion("SCYLJC not between", value1, value2, "scyljc");
            return (Criteria) this;
        }

        public Criteria andWlyyryIsNull() {
            addCriterion("WLYYRY is null");
            return (Criteria) this;
        }

        public Criteria andWlyyryIsNotNull() {
            addCriterion("WLYYRY is not null");
            return (Criteria) this;
        }

        public Criteria andWlyyryEqualTo(Date value) {
            addCriterion("WLYYRY =", value, "wlyyry");
            return (Criteria) this;
        }

        public Criteria andWlyyryNotEqualTo(Date value) {
            addCriterion("WLYYRY <>", value, "wlyyry");
            return (Criteria) this;
        }

        public Criteria andWlyyryGreaterThan(Date value) {
            addCriterion("WLYYRY >", value, "wlyyry");
            return (Criteria) this;
        }

        public Criteria andWlyyryGreaterThanOrEqualTo(Date value) {
            addCriterion("WLYYRY >=", value, "wlyyry");
            return (Criteria) this;
        }

        public Criteria andWlyyryLessThan(Date value) {
            addCriterion("WLYYRY <", value, "wlyyry");
            return (Criteria) this;
        }

        public Criteria andWlyyryLessThanOrEqualTo(Date value) {
            addCriterion("WLYYRY <=", value, "wlyyry");
            return (Criteria) this;
        }

        public Criteria andWlyyryIn(List<Date> values) {
            addCriterion("WLYYRY in", values, "wlyyry");
            return (Criteria) this;
        }

        public Criteria andWlyyryNotIn(List<Date> values) {
            addCriterion("WLYYRY not in", values, "wlyyry");
            return (Criteria) this;
        }

        public Criteria andWlyyryBetween(Date value1, Date value2) {
            addCriterion("WLYYRY between", value1, value2, "wlyyry");
            return (Criteria) this;
        }

        public Criteria andWlyyryNotBetween(Date value1, Date value2) {
            addCriterion("WLYYRY not between", value1, value2, "wlyyry");
            return (Criteria) this;
        }

        public Criteria andZzcmIsNull() {
            addCriterion("ZZCM is null");
            return (Criteria) this;
        }

        public Criteria andZzcmIsNotNull() {
            addCriterion("ZZCM is not null");
            return (Criteria) this;
        }

        public Criteria andZzcmEqualTo(Date value) {
            addCriterion("ZZCM =", value, "zzcm");
            return (Criteria) this;
        }

        public Criteria andZzcmNotEqualTo(Date value) {
            addCriterion("ZZCM <>", value, "zzcm");
            return (Criteria) this;
        }

        public Criteria andZzcmGreaterThan(Date value) {
            addCriterion("ZZCM >", value, "zzcm");
            return (Criteria) this;
        }

        public Criteria andZzcmGreaterThanOrEqualTo(Date value) {
            addCriterion("ZZCM >=", value, "zzcm");
            return (Criteria) this;
        }

        public Criteria andZzcmLessThan(Date value) {
            addCriterion("ZZCM <", value, "zzcm");
            return (Criteria) this;
        }

        public Criteria andZzcmLessThanOrEqualTo(Date value) {
            addCriterion("ZZCM <=", value, "zzcm");
            return (Criteria) this;
        }

        public Criteria andZzcmIn(List<Date> values) {
            addCriterion("ZZCM in", values, "zzcm");
            return (Criteria) this;
        }

        public Criteria andZzcmNotIn(List<Date> values) {
            addCriterion("ZZCM not in", values, "zzcm");
            return (Criteria) this;
        }

        public Criteria andZzcmBetween(Date value1, Date value2) {
            addCriterion("ZZCM between", value1, value2, "zzcm");
            return (Criteria) this;
        }

        public Criteria andZzcmNotBetween(Date value1, Date value2) {
            addCriterion("ZZCM not between", value1, value2, "zzcm");
            return (Criteria) this;
        }

        public Criteria andSfxdtIsNull() {
            addCriterion("SFXDT is null");
            return (Criteria) this;
        }

        public Criteria andSfxdtIsNotNull() {
            addCriterion("SFXDT is not null");
            return (Criteria) this;
        }

        public Criteria andSfxdtEqualTo(Date value) {
            addCriterion("SFXDT =", value, "sfxdt");
            return (Criteria) this;
        }

        public Criteria andSfxdtNotEqualTo(Date value) {
            addCriterion("SFXDT <>", value, "sfxdt");
            return (Criteria) this;
        }

        public Criteria andSfxdtGreaterThan(Date value) {
            addCriterion("SFXDT >", value, "sfxdt");
            return (Criteria) this;
        }

        public Criteria andSfxdtGreaterThanOrEqualTo(Date value) {
            addCriterion("SFXDT >=", value, "sfxdt");
            return (Criteria) this;
        }

        public Criteria andSfxdtLessThan(Date value) {
            addCriterion("SFXDT <", value, "sfxdt");
            return (Criteria) this;
        }

        public Criteria andSfxdtLessThanOrEqualTo(Date value) {
            addCriterion("SFXDT <=", value, "sfxdt");
            return (Criteria) this;
        }

        public Criteria andSfxdtIn(List<Date> values) {
            addCriterion("SFXDT in", values, "sfxdt");
            return (Criteria) this;
        }

        public Criteria andSfxdtNotIn(List<Date> values) {
            addCriterion("SFXDT not in", values, "sfxdt");
            return (Criteria) this;
        }

        public Criteria andSfxdtBetween(Date value1, Date value2) {
            addCriterion("SFXDT between", value1, value2, "sfxdt");
            return (Criteria) this;
        }

        public Criteria andSfxdtNotBetween(Date value1, Date value2) {
            addCriterion("SFXDT not between", value1, value2, "sfxdt");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsIsNull() {
            addCriterion("YCXDTCS is null");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsIsNotNull() {
            addCriterion("YCXDTCS is not null");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsEqualTo(String value) {
            addCriterion("YCXDTCS =", value, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsNotEqualTo(String value) {
            addCriterion("YCXDTCS <>", value, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsGreaterThan(String value) {
            addCriterion("YCXDTCS >", value, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsGreaterThanOrEqualTo(String value) {
            addCriterion("YCXDTCS >=", value, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsLessThan(String value) {
            addCriterion("YCXDTCS <", value, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsLessThanOrEqualTo(String value) {
            addCriterion("YCXDTCS <=", value, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsLike(String value) {
            addCriterion("YCXDTCS like", value, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsNotLike(String value) {
            addCriterion("YCXDTCS not like", value, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsIn(List<String> values) {
            addCriterion("YCXDTCS in", values, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsNotIn(List<String> values) {
            addCriterion("YCXDTCS not in", values, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsBetween(String value1, String value2) {
            addCriterion("YCXDTCS between", value1, value2, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andYcxdtcsNotBetween(String value1, String value2) {
            addCriterion("YCXDTCS not between", value1, value2, "ycxdtcs");
            return (Criteria) this;
        }

        public Criteria andCsfsIsNull() {
            addCriterion("CSFS is null");
            return (Criteria) this;
        }

        public Criteria andCsfsIsNotNull() {
            addCriterion("CSFS is not null");
            return (Criteria) this;
        }

        public Criteria andCsfsEqualTo(String value) {
            addCriterion("CSFS =", value, "csfs");
            return (Criteria) this;
        }

        public Criteria andCsfsNotEqualTo(String value) {
            addCriterion("CSFS <>", value, "csfs");
            return (Criteria) this;
        }

        public Criteria andCsfsGreaterThan(String value) {
            addCriterion("CSFS >", value, "csfs");
            return (Criteria) this;
        }

        public Criteria andCsfsGreaterThanOrEqualTo(String value) {
            addCriterion("CSFS >=", value, "csfs");
            return (Criteria) this;
        }

        public Criteria andCsfsLessThan(String value) {
            addCriterion("CSFS <", value, "csfs");
            return (Criteria) this;
        }

        public Criteria andCsfsLessThanOrEqualTo(String value) {
            addCriterion("CSFS <=", value, "csfs");
            return (Criteria) this;
        }

        public Criteria andCsfsLike(String value) {
            addCriterion("CSFS like", value, "csfs");
            return (Criteria) this;
        }

        public Criteria andCsfsNotLike(String value) {
            addCriterion("CSFS not like", value, "csfs");
            return (Criteria) this;
        }

        public Criteria andCsfsIn(List<String> values) {
            addCriterion("CSFS in", values, "csfs");
            return (Criteria) this;
        }

        public Criteria andCsfsNotIn(List<String> values) {
            addCriterion("CSFS not in", values, "csfs");
            return (Criteria) this;
        }

        public Criteria andCsfsBetween(String value1, String value2) {
            addCriterion("CSFS between", value1, value2, "csfs");
            return (Criteria) this;
        }

        public Criteria andCsfsNotBetween(String value1, String value2) {
            addCriterion("CSFS not between", value1, value2, "csfs");
            return (Criteria) this;
        }

        public Criteria andCssjIsNull() {
            addCriterion("CSSJ is null");
            return (Criteria) this;
        }

        public Criteria andCssjIsNotNull() {
            addCriterion("CSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCssjEqualTo(Date value) {
            addCriterion("CSSJ =", value, "cssj");
            return (Criteria) this;
        }

        public Criteria andCssjNotEqualTo(Date value) {
            addCriterion("CSSJ <>", value, "cssj");
            return (Criteria) this;
        }

        public Criteria andCssjGreaterThan(Date value) {
            addCriterion("CSSJ >", value, "cssj");
            return (Criteria) this;
        }

        public Criteria andCssjGreaterThanOrEqualTo(Date value) {
            addCriterion("CSSJ >=", value, "cssj");
            return (Criteria) this;
        }

        public Criteria andCssjLessThan(Date value) {
            addCriterion("CSSJ <", value, "cssj");
            return (Criteria) this;
        }

        public Criteria andCssjLessThanOrEqualTo(Date value) {
            addCriterion("CSSJ <=", value, "cssj");
            return (Criteria) this;
        }

        public Criteria andCssjIn(List<Date> values) {
            addCriterion("CSSJ in", values, "cssj");
            return (Criteria) this;
        }

        public Criteria andCssjNotIn(List<Date> values) {
            addCriterion("CSSJ not in", values, "cssj");
            return (Criteria) this;
        }

        public Criteria andCssjBetween(Date value1, Date value2) {
            addCriterion("CSSJ between", value1, value2, "cssj");
            return (Criteria) this;
        }

        public Criteria andCssjNotBetween(Date value1, Date value2) {
            addCriterion("CSSJ not between", value1, value2, "cssj");
            return (Criteria) this;
        }

        public Criteria andKxxbgyIsNull() {
            addCriterion("KXXBGY is null");
            return (Criteria) this;
        }

        public Criteria andKxxbgyIsNotNull() {
            addCriterion("KXXBGY is not null");
            return (Criteria) this;
        }

        public Criteria andKxxbgyEqualTo(String value) {
            addCriterion("KXXBGY =", value, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andKxxbgyNotEqualTo(String value) {
            addCriterion("KXXBGY <>", value, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andKxxbgyGreaterThan(String value) {
            addCriterion("KXXBGY >", value, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andKxxbgyGreaterThanOrEqualTo(String value) {
            addCriterion("KXXBGY >=", value, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andKxxbgyLessThan(String value) {
            addCriterion("KXXBGY <", value, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andKxxbgyLessThanOrEqualTo(String value) {
            addCriterion("KXXBGY <=", value, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andKxxbgyLike(String value) {
            addCriterion("KXXBGY like", value, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andKxxbgyNotLike(String value) {
            addCriterion("KXXBGY not like", value, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andKxxbgyIn(List<String> values) {
            addCriterion("KXXBGY in", values, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andKxxbgyNotIn(List<String> values) {
            addCriterion("KXXBGY not in", values, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andKxxbgyBetween(String value1, String value2) {
            addCriterion("KXXBGY between", value1, value2, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andKxxbgyNotBetween(String value1, String value2) {
            addCriterion("KXXBGY not between", value1, value2, "kxxbgy");
            return (Criteria) this;
        }

        public Criteria andGysjIsNull() {
            addCriterion("GYSJ is null");
            return (Criteria) this;
        }

        public Criteria andGysjIsNotNull() {
            addCriterion("GYSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGysjEqualTo(Date value) {
            addCriterion("GYSJ =", value, "gysj");
            return (Criteria) this;
        }

        public Criteria andGysjNotEqualTo(Date value) {
            addCriterion("GYSJ <>", value, "gysj");
            return (Criteria) this;
        }

        public Criteria andGysjGreaterThan(Date value) {
            addCriterion("GYSJ >", value, "gysj");
            return (Criteria) this;
        }

        public Criteria andGysjGreaterThanOrEqualTo(Date value) {
            addCriterion("GYSJ >=", value, "gysj");
            return (Criteria) this;
        }

        public Criteria andGysjLessThan(Date value) {
            addCriterion("GYSJ <", value, "gysj");
            return (Criteria) this;
        }

        public Criteria andGysjLessThanOrEqualTo(Date value) {
            addCriterion("GYSJ <=", value, "gysj");
            return (Criteria) this;
        }

        public Criteria andGysjIn(List<Date> values) {
            addCriterion("GYSJ in", values, "gysj");
            return (Criteria) this;
        }

        public Criteria andGysjNotIn(List<Date> values) {
            addCriterion("GYSJ not in", values, "gysj");
            return (Criteria) this;
        }

        public Criteria andGysjBetween(Date value1, Date value2) {
            addCriterion("GYSJ between", value1, value2, "gysj");
            return (Criteria) this;
        }

        public Criteria andGysjNotBetween(Date value1, Date value2) {
            addCriterion("GYSJ not between", value1, value2, "gysj");
            return (Criteria) this;
        }

        public Criteria andAsplIsNull() {
            addCriterion("ASPL is null");
            return (Criteria) this;
        }

        public Criteria andAsplIsNotNull() {
            addCriterion("ASPL is not null");
            return (Criteria) this;
        }

        public Criteria andAsplEqualTo(BigDecimal value) {
            addCriterion("ASPL =", value, "aspl");
            return (Criteria) this;
        }

        public Criteria andAsplNotEqualTo(BigDecimal value) {
            addCriterion("ASPL <>", value, "aspl");
            return (Criteria) this;
        }

        public Criteria andAsplGreaterThan(BigDecimal value) {
            addCriterion("ASPL >", value, "aspl");
            return (Criteria) this;
        }

        public Criteria andAsplGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ASPL >=", value, "aspl");
            return (Criteria) this;
        }

        public Criteria andAsplLessThan(BigDecimal value) {
            addCriterion("ASPL <", value, "aspl");
            return (Criteria) this;
        }

        public Criteria andAsplLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ASPL <=", value, "aspl");
            return (Criteria) this;
        }

        public Criteria andAsplIn(List<BigDecimal> values) {
            addCriterion("ASPL in", values, "aspl");
            return (Criteria) this;
        }

        public Criteria andAsplNotIn(List<BigDecimal> values) {
            addCriterion("ASPL not in", values, "aspl");
            return (Criteria) this;
        }

        public Criteria andAsplBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASPL between", value1, value2, "aspl");
            return (Criteria) this;
        }

        public Criteria andAsplNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASPL not between", value1, value2, "aspl");
            return (Criteria) this;
        }

        public Criteria andTgrlIsNull() {
            addCriterion("TGRL is null");
            return (Criteria) this;
        }

        public Criteria andTgrlIsNotNull() {
            addCriterion("TGRL is not null");
            return (Criteria) this;
        }

        public Criteria andTgrlEqualTo(BigDecimal value) {
            addCriterion("TGRL =", value, "tgrl");
            return (Criteria) this;
        }

        public Criteria andTgrlNotEqualTo(BigDecimal value) {
            addCriterion("TGRL <>", value, "tgrl");
            return (Criteria) this;
        }

        public Criteria andTgrlGreaterThan(BigDecimal value) {
            addCriterion("TGRL >", value, "tgrl");
            return (Criteria) this;
        }

        public Criteria andTgrlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TGRL >=", value, "tgrl");
            return (Criteria) this;
        }

        public Criteria andTgrlLessThan(BigDecimal value) {
            addCriterion("TGRL <", value, "tgrl");
            return (Criteria) this;
        }

        public Criteria andTgrlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TGRL <=", value, "tgrl");
            return (Criteria) this;
        }

        public Criteria andTgrlIn(List<BigDecimal> values) {
            addCriterion("TGRL in", values, "tgrl");
            return (Criteria) this;
        }

        public Criteria andTgrlNotIn(List<BigDecimal> values) {
            addCriterion("TGRL not in", values, "tgrl");
            return (Criteria) this;
        }

        public Criteria andTgrlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TGRL between", value1, value2, "tgrl");
            return (Criteria) this;
        }

        public Criteria andTgrlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TGRL not between", value1, value2, "tgrl");
            return (Criteria) this;
        }

        public Criteria andLpglIsNull() {
            addCriterion("LPGL is null");
            return (Criteria) this;
        }

        public Criteria andLpglIsNotNull() {
            addCriterion("LPGL is not null");
            return (Criteria) this;
        }

        public Criteria andLpglEqualTo(BigDecimal value) {
            addCriterion("LPGL =", value, "lpgl");
            return (Criteria) this;
        }

        public Criteria andLpglNotEqualTo(BigDecimal value) {
            addCriterion("LPGL <>", value, "lpgl");
            return (Criteria) this;
        }

        public Criteria andLpglGreaterThan(BigDecimal value) {
            addCriterion("LPGL >", value, "lpgl");
            return (Criteria) this;
        }

        public Criteria andLpglGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LPGL >=", value, "lpgl");
            return (Criteria) this;
        }

        public Criteria andLpglLessThan(BigDecimal value) {
            addCriterion("LPGL <", value, "lpgl");
            return (Criteria) this;
        }

        public Criteria andLpglLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LPGL <=", value, "lpgl");
            return (Criteria) this;
        }

        public Criteria andLpglIn(List<BigDecimal> values) {
            addCriterion("LPGL in", values, "lpgl");
            return (Criteria) this;
        }

        public Criteria andLpglNotIn(List<BigDecimal> values) {
            addCriterion("LPGL not in", values, "lpgl");
            return (Criteria) this;
        }

        public Criteria andLpglBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LPGL between", value1, value2, "lpgl");
            return (Criteria) this;
        }

        public Criteria andLpglNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LPGL not between", value1, value2, "lpgl");
            return (Criteria) this;
        }

        public Criteria andZdIsNull() {
            addCriterion("ZD is null");
            return (Criteria) this;
        }

        public Criteria andZdIsNotNull() {
            addCriterion("ZD is not null");
            return (Criteria) this;
        }

        public Criteria andZdEqualTo(String value) {
            addCriterion("ZD =", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotEqualTo(String value) {
            addCriterion("ZD <>", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdGreaterThan(String value) {
            addCriterion("ZD >", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdGreaterThanOrEqualTo(String value) {
            addCriterion("ZD >=", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdLessThan(String value) {
            addCriterion("ZD <", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdLessThanOrEqualTo(String value) {
            addCriterion("ZD <=", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdLike(String value) {
            addCriterion("ZD like", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotLike(String value) {
            addCriterion("ZD not like", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdIn(List<String> values) {
            addCriterion("ZD in", values, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotIn(List<String> values) {
            addCriterion("ZD not in", values, "zd");
            return (Criteria) this;
        }

        public Criteria andZdBetween(String value1, String value2) {
            addCriterion("ZD between", value1, value2, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotBetween(String value1, String value2) {
            addCriterion("ZD not between", value1, value2, "zd");
            return (Criteria) this;
        }

        public Criteria andYqrsscIsNull() {
            addCriterion("YQRSSC is null");
            return (Criteria) this;
        }

        public Criteria andYqrsscIsNotNull() {
            addCriterion("YQRSSC is not null");
            return (Criteria) this;
        }

        public Criteria andYqrsscEqualTo(String value) {
            addCriterion("YQRSSC =", value, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsscNotEqualTo(String value) {
            addCriterion("YQRSSC <>", value, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsscGreaterThan(String value) {
            addCriterion("YQRSSC >", value, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsscGreaterThanOrEqualTo(String value) {
            addCriterion("YQRSSC >=", value, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsscLessThan(String value) {
            addCriterion("YQRSSC <", value, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsscLessThanOrEqualTo(String value) {
            addCriterion("YQRSSC <=", value, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsscLike(String value) {
            addCriterion("YQRSSC like", value, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsscNotLike(String value) {
            addCriterion("YQRSSC not like", value, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsscIn(List<String> values) {
            addCriterion("YQRSSC in", values, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsscNotIn(List<String> values) {
            addCriterion("YQRSSC not in", values, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsscBetween(String value1, String value2) {
            addCriterion("YQRSSC between", value1, value2, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsscNotBetween(String value1, String value2) {
            addCriterion("YQRSSC not between", value1, value2, "yqrssc");
            return (Criteria) this;
        }

        public Criteria andYqrsIsNull() {
            addCriterion("YQRS is null");
            return (Criteria) this;
        }

        public Criteria andYqrsIsNotNull() {
            addCriterion("YQRS is not null");
            return (Criteria) this;
        }

        public Criteria andYqrsEqualTo(String value) {
            addCriterion("YQRS =", value, "yqrs");
            return (Criteria) this;
        }

        public Criteria andYqrsNotEqualTo(String value) {
            addCriterion("YQRS <>", value, "yqrs");
            return (Criteria) this;
        }

        public Criteria andYqrsGreaterThan(String value) {
            addCriterion("YQRS >", value, "yqrs");
            return (Criteria) this;
        }

        public Criteria andYqrsGreaterThanOrEqualTo(String value) {
            addCriterion("YQRS >=", value, "yqrs");
            return (Criteria) this;
        }

        public Criteria andYqrsLessThan(String value) {
            addCriterion("YQRS <", value, "yqrs");
            return (Criteria) this;
        }

        public Criteria andYqrsLessThanOrEqualTo(String value) {
            addCriterion("YQRS <=", value, "yqrs");
            return (Criteria) this;
        }

        public Criteria andYqrsLike(String value) {
            addCriterion("YQRS like", value, "yqrs");
            return (Criteria) this;
        }

        public Criteria andYqrsNotLike(String value) {
            addCriterion("YQRS not like", value, "yqrs");
            return (Criteria) this;
        }

        public Criteria andYqrsIn(List<String> values) {
            addCriterion("YQRS in", values, "yqrs");
            return (Criteria) this;
        }

        public Criteria andYqrsNotIn(List<String> values) {
            addCriterion("YQRS not in", values, "yqrs");
            return (Criteria) this;
        }

        public Criteria andYqrsBetween(String value1, String value2) {
            addCriterion("YQRS between", value1, value2, "yqrs");
            return (Criteria) this;
        }

        public Criteria andYqrsNotBetween(String value1, String value2) {
            addCriterion("YQRS not between", value1, value2, "yqrs");
            return (Criteria) this;
        }

        public Criteria andRscsIsNull() {
            addCriterion("RSCS is null");
            return (Criteria) this;
        }

        public Criteria andRscsIsNotNull() {
            addCriterion("RSCS is not null");
            return (Criteria) this;
        }

        public Criteria andRscsEqualTo(String value) {
            addCriterion("RSCS =", value, "rscs");
            return (Criteria) this;
        }

        public Criteria andRscsNotEqualTo(String value) {
            addCriterion("RSCS <>", value, "rscs");
            return (Criteria) this;
        }

        public Criteria andRscsGreaterThan(String value) {
            addCriterion("RSCS >", value, "rscs");
            return (Criteria) this;
        }

        public Criteria andRscsGreaterThanOrEqualTo(String value) {
            addCriterion("RSCS >=", value, "rscs");
            return (Criteria) this;
        }

        public Criteria andRscsLessThan(String value) {
            addCriterion("RSCS <", value, "rscs");
            return (Criteria) this;
        }

        public Criteria andRscsLessThanOrEqualTo(String value) {
            addCriterion("RSCS <=", value, "rscs");
            return (Criteria) this;
        }

        public Criteria andRscsLike(String value) {
            addCriterion("RSCS like", value, "rscs");
            return (Criteria) this;
        }

        public Criteria andRscsNotLike(String value) {
            addCriterion("RSCS not like", value, "rscs");
            return (Criteria) this;
        }

        public Criteria andRscsIn(List<String> values) {
            addCriterion("RSCS in", values, "rscs");
            return (Criteria) this;
        }

        public Criteria andRscsNotIn(List<String> values) {
            addCriterion("RSCS not in", values, "rscs");
            return (Criteria) this;
        }

        public Criteria andRscsBetween(String value1, String value2) {
            addCriterion("RSCS between", value1, value2, "rscs");
            return (Criteria) this;
        }

        public Criteria andRscsNotBetween(String value1, String value2) {
            addCriterion("RSCS not between", value1, value2, "rscs");
            return (Criteria) this;
        }

        public Criteria andZqtyksIsNull() {
            addCriterion("ZQTYKS is null");
            return (Criteria) this;
        }

        public Criteria andZqtyksIsNotNull() {
            addCriterion("ZQTYKS is not null");
            return (Criteria) this;
        }

        public Criteria andZqtyksEqualTo(Date value) {
            addCriterion("ZQTYKS =", value, "zqtyks");
            return (Criteria) this;
        }

        public Criteria andZqtyksNotEqualTo(Date value) {
            addCriterion("ZQTYKS <>", value, "zqtyks");
            return (Criteria) this;
        }

        public Criteria andZqtyksGreaterThan(Date value) {
            addCriterion("ZQTYKS >", value, "zqtyks");
            return (Criteria) this;
        }

        public Criteria andZqtyksGreaterThanOrEqualTo(Date value) {
            addCriterion("ZQTYKS >=", value, "zqtyks");
            return (Criteria) this;
        }

        public Criteria andZqtyksLessThan(Date value) {
            addCriterion("ZQTYKS <", value, "zqtyks");
            return (Criteria) this;
        }

        public Criteria andZqtyksLessThanOrEqualTo(Date value) {
            addCriterion("ZQTYKS <=", value, "zqtyks");
            return (Criteria) this;
        }

        public Criteria andZqtyksIn(List<Date> values) {
            addCriterion("ZQTYKS in", values, "zqtyks");
            return (Criteria) this;
        }

        public Criteria andZqtyksNotIn(List<Date> values) {
            addCriterion("ZQTYKS not in", values, "zqtyks");
            return (Criteria) this;
        }

        public Criteria andZqtyksBetween(Date value1, Date value2) {
            addCriterion("ZQTYKS between", value1, value2, "zqtyks");
            return (Criteria) this;
        }

        public Criteria andZqtyksNotBetween(Date value1, Date value2) {
            addCriterion("ZQTYKS not between", value1, value2, "zqtyks");
            return (Criteria) this;
        }

        public Criteria andQszqtyIsNull() {
            addCriterion("QSZQTY is null");
            return (Criteria) this;
        }

        public Criteria andQszqtyIsNotNull() {
            addCriterion("QSZQTY is not null");
            return (Criteria) this;
        }

        public Criteria andQszqtyEqualTo(Date value) {
            addCriterion("QSZQTY =", value, "qszqty");
            return (Criteria) this;
        }

        public Criteria andQszqtyNotEqualTo(Date value) {
            addCriterion("QSZQTY <>", value, "qszqty");
            return (Criteria) this;
        }

        public Criteria andQszqtyGreaterThan(Date value) {
            addCriterion("QSZQTY >", value, "qszqty");
            return (Criteria) this;
        }

        public Criteria andQszqtyGreaterThanOrEqualTo(Date value) {
            addCriterion("QSZQTY >=", value, "qszqty");
            return (Criteria) this;
        }

        public Criteria andQszqtyLessThan(Date value) {
            addCriterion("QSZQTY <", value, "qszqty");
            return (Criteria) this;
        }

        public Criteria andQszqtyLessThanOrEqualTo(Date value) {
            addCriterion("QSZQTY <=", value, "qszqty");
            return (Criteria) this;
        }

        public Criteria andQszqtyIn(List<Date> values) {
            addCriterion("QSZQTY in", values, "qszqty");
            return (Criteria) this;
        }

        public Criteria andQszqtyNotIn(List<Date> values) {
            addCriterion("QSZQTY not in", values, "qszqty");
            return (Criteria) this;
        }

        public Criteria andQszqtyBetween(Date value1, Date value2) {
            addCriterion("QSZQTY between", value1, value2, "qszqty");
            return (Criteria) this;
        }

        public Criteria andQszqtyNotBetween(Date value1, Date value2) {
            addCriterion("QSZQTY not between", value1, value2, "qszqty");
            return (Criteria) this;
        }

        public Criteria andRsksIsNull() {
            addCriterion("RSKS is null");
            return (Criteria) this;
        }

        public Criteria andRsksIsNotNull() {
            addCriterion("RSKS is not null");
            return (Criteria) this;
        }

        public Criteria andRsksEqualTo(Date value) {
            addCriterion("RSKS =", value, "rsks");
            return (Criteria) this;
        }

        public Criteria andRsksNotEqualTo(Date value) {
            addCriterion("RSKS <>", value, "rsks");
            return (Criteria) this;
        }

        public Criteria andRsksGreaterThan(Date value) {
            addCriterion("RSKS >", value, "rsks");
            return (Criteria) this;
        }

        public Criteria andRsksGreaterThanOrEqualTo(Date value) {
            addCriterion("RSKS >=", value, "rsks");
            return (Criteria) this;
        }

        public Criteria andRsksLessThan(Date value) {
            addCriterion("RSKS <", value, "rsks");
            return (Criteria) this;
        }

        public Criteria andRsksLessThanOrEqualTo(Date value) {
            addCriterion("RSKS <=", value, "rsks");
            return (Criteria) this;
        }

        public Criteria andRsksIn(List<Date> values) {
            addCriterion("RSKS in", values, "rsks");
            return (Criteria) this;
        }

        public Criteria andRsksNotIn(List<Date> values) {
            addCriterion("RSKS not in", values, "rsks");
            return (Criteria) this;
        }

        public Criteria andRsksBetween(Date value1, Date value2) {
            addCriterion("RSKS between", value1, value2, "rsks");
            return (Criteria) this;
        }

        public Criteria andRsksNotBetween(Date value1, Date value2) {
            addCriterion("RSKS not between", value1, value2, "rsks");
            return (Criteria) this;
        }

        public Criteria andRsjsIsNull() {
            addCriterion("RSJS is null");
            return (Criteria) this;
        }

        public Criteria andRsjsIsNotNull() {
            addCriterion("RSJS is not null");
            return (Criteria) this;
        }

        public Criteria andRsjsEqualTo(Date value) {
            addCriterion("RSJS =", value, "rsjs");
            return (Criteria) this;
        }

        public Criteria andRsjsNotEqualTo(Date value) {
            addCriterion("RSJS <>", value, "rsjs");
            return (Criteria) this;
        }

        public Criteria andRsjsGreaterThan(Date value) {
            addCriterion("RSJS >", value, "rsjs");
            return (Criteria) this;
        }

        public Criteria andRsjsGreaterThanOrEqualTo(Date value) {
            addCriterion("RSJS >=", value, "rsjs");
            return (Criteria) this;
        }

        public Criteria andRsjsLessThan(Date value) {
            addCriterion("RSJS <", value, "rsjs");
            return (Criteria) this;
        }

        public Criteria andRsjsLessThanOrEqualTo(Date value) {
            addCriterion("RSJS <=", value, "rsjs");
            return (Criteria) this;
        }

        public Criteria andRsjsIn(List<Date> values) {
            addCriterion("RSJS in", values, "rsjs");
            return (Criteria) this;
        }

        public Criteria andRsjsNotIn(List<Date> values) {
            addCriterion("RSJS not in", values, "rsjs");
            return (Criteria) this;
        }

        public Criteria andRsjsBetween(Date value1, Date value2) {
            addCriterion("RSJS between", value1, value2, "rsjs");
            return (Criteria) this;
        }

        public Criteria andRsjsNotBetween(Date value1, Date value2) {
            addCriterion("RSJS not between", value1, value2, "rsjs");
            return (Criteria) this;
        }

        public Criteria andRshzyIsNull() {
            addCriterion("RSHZY is null");
            return (Criteria) this;
        }

        public Criteria andRshzyIsNotNull() {
            addCriterion("RSHZY is not null");
            return (Criteria) this;
        }

        public Criteria andRshzyEqualTo(Date value) {
            addCriterion("RSHZY =", value, "rshzy");
            return (Criteria) this;
        }

        public Criteria andRshzyNotEqualTo(Date value) {
            addCriterion("RSHZY <>", value, "rshzy");
            return (Criteria) this;
        }

        public Criteria andRshzyGreaterThan(Date value) {
            addCriterion("RSHZY >", value, "rshzy");
            return (Criteria) this;
        }

        public Criteria andRshzyGreaterThanOrEqualTo(Date value) {
            addCriterion("RSHZY >=", value, "rshzy");
            return (Criteria) this;
        }

        public Criteria andRshzyLessThan(Date value) {
            addCriterion("RSHZY <", value, "rshzy");
            return (Criteria) this;
        }

        public Criteria andRshzyLessThanOrEqualTo(Date value) {
            addCriterion("RSHZY <=", value, "rshzy");
            return (Criteria) this;
        }

        public Criteria andRshzyIn(List<Date> values) {
            addCriterion("RSHZY in", values, "rshzy");
            return (Criteria) this;
        }

        public Criteria andRshzyNotIn(List<Date> values) {
            addCriterion("RSHZY not in", values, "rshzy");
            return (Criteria) this;
        }

        public Criteria andRshzyBetween(Date value1, Date value2) {
            addCriterion("RSHZY between", value1, value2, "rshzy");
            return (Criteria) this;
        }

        public Criteria andRshzyNotBetween(Date value1, Date value2) {
            addCriterion("RSHZY not between", value1, value2, "rshzy");
            return (Criteria) this;
        }

        public Criteria andRsywIsNull() {
            addCriterion("RSYW is null");
            return (Criteria) this;
        }

        public Criteria andRsywIsNotNull() {
            addCriterion("RSYW is not null");
            return (Criteria) this;
        }

        public Criteria andRsywEqualTo(String value) {
            addCriterion("RSYW =", value, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywNotEqualTo(String value) {
            addCriterion("RSYW <>", value, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywGreaterThan(String value) {
            addCriterion("RSYW >", value, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywGreaterThanOrEqualTo(String value) {
            addCriterion("RSYW >=", value, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywLessThan(String value) {
            addCriterion("RSYW <", value, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywLessThanOrEqualTo(String value) {
            addCriterion("RSYW <=", value, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywLike(String value) {
            addCriterion("RSYW like", value, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywNotLike(String value) {
            addCriterion("RSYW not like", value, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywIn(List<String> values) {
            addCriterion("RSYW in", values, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywNotIn(List<String> values) {
            addCriterion("RSYW not in", values, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywBetween(String value1, String value2) {
            addCriterion("RSYW between", value1, value2, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywNotBetween(String value1, String value2) {
            addCriterion("RSYW not between", value1, value2, "rsyw");
            return (Criteria) this;
        }

        public Criteria andRsywjlIsNull() {
            addCriterion("RSYWJL is null");
            return (Criteria) this;
        }

        public Criteria andRsywjlIsNotNull() {
            addCriterion("RSYWJL is not null");
            return (Criteria) this;
        }

        public Criteria andRsywjlEqualTo(String value) {
            addCriterion("RSYWJL =", value, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsywjlNotEqualTo(String value) {
            addCriterion("RSYWJL <>", value, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsywjlGreaterThan(String value) {
            addCriterion("RSYWJL >", value, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsywjlGreaterThanOrEqualTo(String value) {
            addCriterion("RSYWJL >=", value, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsywjlLessThan(String value) {
            addCriterion("RSYWJL <", value, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsywjlLessThanOrEqualTo(String value) {
            addCriterion("RSYWJL <=", value, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsywjlLike(String value) {
            addCriterion("RSYWJL like", value, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsywjlNotLike(String value) {
            addCriterion("RSYWJL not like", value, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsywjlIn(List<String> values) {
            addCriterion("RSYWJL in", values, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsywjlNotIn(List<String> values) {
            addCriterion("RSYWJL not in", values, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsywjlBetween(String value1, String value2) {
            addCriterion("RSYWJL between", value1, value2, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsywjlNotBetween(String value1, String value2) {
            addCriterion("RSYWJL not between", value1, value2, "rsywjl");
            return (Criteria) this;
        }

        public Criteria andRsztIsNull() {
            addCriterion("RSZT is null");
            return (Criteria) this;
        }

        public Criteria andRsztIsNotNull() {
            addCriterion("RSZT is not null");
            return (Criteria) this;
        }

        public Criteria andRsztEqualTo(String value) {
            addCriterion("RSZT =", value, "rszt");
            return (Criteria) this;
        }

        public Criteria andRsztNotEqualTo(String value) {
            addCriterion("RSZT <>", value, "rszt");
            return (Criteria) this;
        }

        public Criteria andRsztGreaterThan(String value) {
            addCriterion("RSZT >", value, "rszt");
            return (Criteria) this;
        }

        public Criteria andRsztGreaterThanOrEqualTo(String value) {
            addCriterion("RSZT >=", value, "rszt");
            return (Criteria) this;
        }

        public Criteria andRsztLessThan(String value) {
            addCriterion("RSZT <", value, "rszt");
            return (Criteria) this;
        }

        public Criteria andRsztLessThanOrEqualTo(String value) {
            addCriterion("RSZT <=", value, "rszt");
            return (Criteria) this;
        }

        public Criteria andRsztLike(String value) {
            addCriterion("RSZT like", value, "rszt");
            return (Criteria) this;
        }

        public Criteria andRsztNotLike(String value) {
            addCriterion("RSZT not like", value, "rszt");
            return (Criteria) this;
        }

        public Criteria andRsztIn(List<String> values) {
            addCriterion("RSZT in", values, "rszt");
            return (Criteria) this;
        }

        public Criteria andRsztNotIn(List<String> values) {
            addCriterion("RSZT not in", values, "rszt");
            return (Criteria) this;
        }

        public Criteria andRsztBetween(String value1, String value2) {
            addCriterion("RSZT between", value1, value2, "rszt");
            return (Criteria) this;
        }

        public Criteria andRsztNotBetween(String value1, String value2) {
            addCriterion("RSZT not between", value1, value2, "rszt");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzIsNull() {
            addCriterion("SFXDTQZ is null");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzIsNotNull() {
            addCriterion("SFXDTQZ is not null");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzEqualTo(Date value) {
            addCriterion("SFXDTQZ =", value, "sfxdtqz");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzNotEqualTo(Date value) {
            addCriterion("SFXDTQZ <>", value, "sfxdtqz");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzGreaterThan(Date value) {
            addCriterion("SFXDTQZ >", value, "sfxdtqz");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzGreaterThanOrEqualTo(Date value) {
            addCriterion("SFXDTQZ >=", value, "sfxdtqz");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzLessThan(Date value) {
            addCriterion("SFXDTQZ <", value, "sfxdtqz");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzLessThanOrEqualTo(Date value) {
            addCriterion("SFXDTQZ <=", value, "sfxdtqz");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzIn(List<Date> values) {
            addCriterion("SFXDTQZ in", values, "sfxdtqz");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzNotIn(List<Date> values) {
            addCriterion("SFXDTQZ not in", values, "sfxdtqz");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzBetween(Date value1, Date value2) {
            addCriterion("SFXDTQZ between", value1, value2, "sfxdtqz");
            return (Criteria) this;
        }

        public Criteria andSfxdtqzNotBetween(Date value1, Date value2) {
            addCriterion("SFXDTQZ not between", value1, value2, "sfxdtqz");
            return (Criteria) this;
        }

        public Criteria andBqpgmxIsNull() {
            addCriterion("BQPGMX is null");
            return (Criteria) this;
        }

        public Criteria andBqpgmxIsNotNull() {
            addCriterion("BQPGMX is not null");
            return (Criteria) this;
        }

        public Criteria andBqpgmxEqualTo(String value) {
            addCriterion("BQPGMX =", value, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andBqpgmxNotEqualTo(String value) {
            addCriterion("BQPGMX <>", value, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andBqpgmxGreaterThan(String value) {
            addCriterion("BQPGMX >", value, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andBqpgmxGreaterThanOrEqualTo(String value) {
            addCriterion("BQPGMX >=", value, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andBqpgmxLessThan(String value) {
            addCriterion("BQPGMX <", value, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andBqpgmxLessThanOrEqualTo(String value) {
            addCriterion("BQPGMX <=", value, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andBqpgmxLike(String value) {
            addCriterion("BQPGMX like", value, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andBqpgmxNotLike(String value) {
            addCriterion("BQPGMX not like", value, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andBqpgmxIn(List<String> values) {
            addCriterion("BQPGMX in", values, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andBqpgmxNotIn(List<String> values) {
            addCriterion("BQPGMX not in", values, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andBqpgmxBetween(String value1, String value2) {
            addCriterion("BQPGMX between", value1, value2, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andBqpgmxNotBetween(String value1, String value2) {
            addCriterion("BQPGMX not between", value1, value2, "bqpgmx");
            return (Criteria) this;
        }

        public Criteria andZycsIsNull() {
            addCriterion("ZYCS is null");
            return (Criteria) this;
        }

        public Criteria andZycsIsNotNull() {
            addCriterion("ZYCS is not null");
            return (Criteria) this;
        }

        public Criteria andZycsEqualTo(String value) {
            addCriterion("ZYCS =", value, "zycs");
            return (Criteria) this;
        }

        public Criteria andZycsNotEqualTo(String value) {
            addCriterion("ZYCS <>", value, "zycs");
            return (Criteria) this;
        }

        public Criteria andZycsGreaterThan(String value) {
            addCriterion("ZYCS >", value, "zycs");
            return (Criteria) this;
        }

        public Criteria andZycsGreaterThanOrEqualTo(String value) {
            addCriterion("ZYCS >=", value, "zycs");
            return (Criteria) this;
        }

        public Criteria andZycsLessThan(String value) {
            addCriterion("ZYCS <", value, "zycs");
            return (Criteria) this;
        }

        public Criteria andZycsLessThanOrEqualTo(String value) {
            addCriterion("ZYCS <=", value, "zycs");
            return (Criteria) this;
        }

        public Criteria andZycsLike(String value) {
            addCriterion("ZYCS like", value, "zycs");
            return (Criteria) this;
        }

        public Criteria andZycsNotLike(String value) {
            addCriterion("ZYCS not like", value, "zycs");
            return (Criteria) this;
        }

        public Criteria andZycsIn(List<String> values) {
            addCriterion("ZYCS in", values, "zycs");
            return (Criteria) this;
        }

        public Criteria andZycsNotIn(List<String> values) {
            addCriterion("ZYCS not in", values, "zycs");
            return (Criteria) this;
        }

        public Criteria andZycsBetween(String value1, String value2) {
            addCriterion("ZYCS between", value1, value2, "zycs");
            return (Criteria) this;
        }

        public Criteria andZycsNotBetween(String value1, String value2) {
            addCriterion("ZYCS not between", value1, value2, "zycs");
            return (Criteria) this;
        }

        public Criteria andDjryIsNull() {
            addCriterion("DJRY is null");
            return (Criteria) this;
        }

        public Criteria andDjryIsNotNull() {
            addCriterion("DJRY is not null");
            return (Criteria) this;
        }

        public Criteria andDjryEqualTo(String value) {
            addCriterion("DJRY =", value, "djry");
            return (Criteria) this;
        }

        public Criteria andDjryNotEqualTo(String value) {
            addCriterion("DJRY <>", value, "djry");
            return (Criteria) this;
        }

        public Criteria andDjryGreaterThan(String value) {
            addCriterion("DJRY >", value, "djry");
            return (Criteria) this;
        }

        public Criteria andDjryGreaterThanOrEqualTo(String value) {
            addCriterion("DJRY >=", value, "djry");
            return (Criteria) this;
        }

        public Criteria andDjryLessThan(String value) {
            addCriterion("DJRY <", value, "djry");
            return (Criteria) this;
        }

        public Criteria andDjryLessThanOrEqualTo(String value) {
            addCriterion("DJRY <=", value, "djry");
            return (Criteria) this;
        }

        public Criteria andDjryLike(String value) {
            addCriterion("DJRY like", value, "djry");
            return (Criteria) this;
        }

        public Criteria andDjryNotLike(String value) {
            addCriterion("DJRY not like", value, "djry");
            return (Criteria) this;
        }

        public Criteria andDjryIn(List<String> values) {
            addCriterion("DJRY in", values, "djry");
            return (Criteria) this;
        }

        public Criteria andDjryNotIn(List<String> values) {
            addCriterion("DJRY not in", values, "djry");
            return (Criteria) this;
        }

        public Criteria andDjryBetween(String value1, String value2) {
            addCriterion("DJRY between", value1, value2, "djry");
            return (Criteria) this;
        }

        public Criteria andDjryNotBetween(String value1, String value2) {
            addCriterion("DJRY not between", value1, value2, "djry");
            return (Criteria) this;
        }

        public Criteria andDjrymcIsNull() {
            addCriterion("DJRYMC is null");
            return (Criteria) this;
        }

        public Criteria andDjrymcIsNotNull() {
            addCriterion("DJRYMC is not null");
            return (Criteria) this;
        }

        public Criteria andDjrymcEqualTo(String value) {
            addCriterion("DJRYMC =", value, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjrymcNotEqualTo(String value) {
            addCriterion("DJRYMC <>", value, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjrymcGreaterThan(String value) {
            addCriterion("DJRYMC >", value, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjrymcGreaterThanOrEqualTo(String value) {
            addCriterion("DJRYMC >=", value, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjrymcLessThan(String value) {
            addCriterion("DJRYMC <", value, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjrymcLessThanOrEqualTo(String value) {
            addCriterion("DJRYMC <=", value, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjrymcLike(String value) {
            addCriterion("DJRYMC like", value, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjrymcNotLike(String value) {
            addCriterion("DJRYMC not like", value, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjrymcIn(List<String> values) {
            addCriterion("DJRYMC in", values, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjrymcNotIn(List<String> values) {
            addCriterion("DJRYMC not in", values, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjrymcBetween(String value1, String value2) {
            addCriterion("DJRYMC between", value1, value2, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjrymcNotBetween(String value1, String value2) {
            addCriterion("DJRYMC not between", value1, value2, "djrymc");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNull() {
            addCriterion("DJSJ is null");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNotNull() {
            addCriterion("DJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDjsjEqualTo(Date value) {
            addCriterion("DJSJ =", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotEqualTo(Date value) {
            addCriterion("DJSJ <>", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThan(Date value) {
            addCriterion("DJSJ >", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("DJSJ >=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThan(Date value) {
            addCriterion("DJSJ <", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThanOrEqualTo(Date value) {
            addCriterion("DJSJ <=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjIn(List<Date> values) {
            addCriterion("DJSJ in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotIn(List<Date> values) {
            addCriterion("DJSJ not in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjBetween(Date value1, Date value2) {
            addCriterion("DJSJ between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotBetween(Date value1, Date value2) {
            addCriterion("DJSJ not between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjIsNull() {
            addCriterion("DDYYDMSJ is null");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjIsNotNull() {
            addCriterion("DDYYDMSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjEqualTo(Date value) {
            addCriterion("DDYYDMSJ =", value, "ddyydmsj");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjNotEqualTo(Date value) {
            addCriterion("DDYYDMSJ <>", value, "ddyydmsj");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjGreaterThan(Date value) {
            addCriterion("DDYYDMSJ >", value, "ddyydmsj");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjGreaterThanOrEqualTo(Date value) {
            addCriterion("DDYYDMSJ >=", value, "ddyydmsj");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjLessThan(Date value) {
            addCriterion("DDYYDMSJ <", value, "ddyydmsj");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjLessThanOrEqualTo(Date value) {
            addCriterion("DDYYDMSJ <=", value, "ddyydmsj");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjIn(List<Date> values) {
            addCriterion("DDYYDMSJ in", values, "ddyydmsj");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjNotIn(List<Date> values) {
            addCriterion("DDYYDMSJ not in", values, "ddyydmsj");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjBetween(Date value1, Date value2) {
            addCriterion("DDYYDMSJ between", value1, value2, "ddyydmsj");
            return (Criteria) this;
        }

        public Criteria andDdyydmsjNotBetween(Date value1, Date value2) {
            addCriterion("DDYYDMSJ not between", value1, value2, "ddyydmsj");
            return (Criteria) this;
        }

        public Criteria andDdfsIsNull() {
            addCriterion("DDFS is null");
            return (Criteria) this;
        }

        public Criteria andDdfsIsNotNull() {
            addCriterion("DDFS is not null");
            return (Criteria) this;
        }

        public Criteria andDdfsEqualTo(String value) {
            addCriterion("DDFS =", value, "ddfs");
            return (Criteria) this;
        }

        public Criteria andDdfsNotEqualTo(String value) {
            addCriterion("DDFS <>", value, "ddfs");
            return (Criteria) this;
        }

        public Criteria andDdfsGreaterThan(String value) {
            addCriterion("DDFS >", value, "ddfs");
            return (Criteria) this;
        }

        public Criteria andDdfsGreaterThanOrEqualTo(String value) {
            addCriterion("DDFS >=", value, "ddfs");
            return (Criteria) this;
        }

        public Criteria andDdfsLessThan(String value) {
            addCriterion("DDFS <", value, "ddfs");
            return (Criteria) this;
        }

        public Criteria andDdfsLessThanOrEqualTo(String value) {
            addCriterion("DDFS <=", value, "ddfs");
            return (Criteria) this;
        }

        public Criteria andDdfsLike(String value) {
            addCriterion("DDFS like", value, "ddfs");
            return (Criteria) this;
        }

        public Criteria andDdfsNotLike(String value) {
            addCriterion("DDFS not like", value, "ddfs");
            return (Criteria) this;
        }

        public Criteria andDdfsIn(List<String> values) {
            addCriterion("DDFS in", values, "ddfs");
            return (Criteria) this;
        }

        public Criteria andDdfsNotIn(List<String> values) {
            addCriterion("DDFS not in", values, "ddfs");
            return (Criteria) this;
        }

        public Criteria andDdfsBetween(String value1, String value2) {
            addCriterion("DDFS between", value1, value2, "ddfs");
            return (Criteria) this;
        }

        public Criteria andDdfsNotBetween(String value1, String value2) {
            addCriterion("DDFS not between", value1, value2, "ddfs");
            return (Criteria) this;
        }

        public Criteria andWlyyIsNull() {
            addCriterion("WLYY is null");
            return (Criteria) this;
        }

        public Criteria andWlyyIsNotNull() {
            addCriterion("WLYY is not null");
            return (Criteria) this;
        }

        public Criteria andWlyyEqualTo(String value) {
            addCriterion("WLYY =", value, "wlyy");
            return (Criteria) this;
        }

        public Criteria andWlyyNotEqualTo(String value) {
            addCriterion("WLYY <>", value, "wlyy");
            return (Criteria) this;
        }

        public Criteria andWlyyGreaterThan(String value) {
            addCriterion("WLYY >", value, "wlyy");
            return (Criteria) this;
        }

        public Criteria andWlyyGreaterThanOrEqualTo(String value) {
            addCriterion("WLYY >=", value, "wlyy");
            return (Criteria) this;
        }

        public Criteria andWlyyLessThan(String value) {
            addCriterion("WLYY <", value, "wlyy");
            return (Criteria) this;
        }

        public Criteria andWlyyLessThanOrEqualTo(String value) {
            addCriterion("WLYY <=", value, "wlyy");
            return (Criteria) this;
        }

        public Criteria andWlyyLike(String value) {
            addCriterion("WLYY like", value, "wlyy");
            return (Criteria) this;
        }

        public Criteria andWlyyNotLike(String value) {
            addCriterion("WLYY not like", value, "wlyy");
            return (Criteria) this;
        }

        public Criteria andWlyyIn(List<String> values) {
            addCriterion("WLYY in", values, "wlyy");
            return (Criteria) this;
        }

        public Criteria andWlyyNotIn(List<String> values) {
            addCriterion("WLYY not in", values, "wlyy");
            return (Criteria) this;
        }

        public Criteria andWlyyBetween(String value1, String value2) {
            addCriterion("WLYY between", value1, value2, "wlyy");
            return (Criteria) this;
        }

        public Criteria andWlyyNotBetween(String value1, String value2) {
            addCriterion("WLYY not between", value1, value2, "wlyy");
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