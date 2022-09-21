package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspZyfxpfInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspZyfxpfInfExample() {
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

        public Criteria andSmtzIsNull() {
            addCriterion("SMTZ is null");
            return (Criteria) this;
        }

        public Criteria andSmtzIsNotNull() {
            addCriterion("SMTZ is not null");
            return (Criteria) this;
        }

        public Criteria andSmtzEqualTo(String value) {
            addCriterion("SMTZ =", value, "smtz");
            return (Criteria) this;
        }

        public Criteria andSmtzNotEqualTo(String value) {
            addCriterion("SMTZ <>", value, "smtz");
            return (Criteria) this;
        }

        public Criteria andSmtzGreaterThan(String value) {
            addCriterion("SMTZ >", value, "smtz");
            return (Criteria) this;
        }

        public Criteria andSmtzGreaterThanOrEqualTo(String value) {
            addCriterion("SMTZ >=", value, "smtz");
            return (Criteria) this;
        }

        public Criteria andSmtzLessThan(String value) {
            addCriterion("SMTZ <", value, "smtz");
            return (Criteria) this;
        }

        public Criteria andSmtzLessThanOrEqualTo(String value) {
            addCriterion("SMTZ <=", value, "smtz");
            return (Criteria) this;
        }

        public Criteria andSmtzLike(String value) {
            addCriterion("SMTZ like", value, "smtz");
            return (Criteria) this;
        }

        public Criteria andSmtzNotLike(String value) {
            addCriterion("SMTZ not like", value, "smtz");
            return (Criteria) this;
        }

        public Criteria andSmtzIn(List<String> values) {
            addCriterion("SMTZ in", values, "smtz");
            return (Criteria) this;
        }

        public Criteria andSmtzNotIn(List<String> values) {
            addCriterion("SMTZ not in", values, "smtz");
            return (Criteria) this;
        }

        public Criteria andSmtzBetween(String value1, String value2) {
            addCriterion("SMTZ between", value1, value2, "smtz");
            return (Criteria) this;
        }

        public Criteria andSmtzNotBetween(String value1, String value2) {
            addCriterion("SMTZ not between", value1, value2, "smtz");
            return (Criteria) this;
        }

        public Criteria andSzIsNull() {
            addCriterion("SZ is null");
            return (Criteria) this;
        }

        public Criteria andSzIsNotNull() {
            addCriterion("SZ is not null");
            return (Criteria) this;
        }

        public Criteria andSzEqualTo(String value) {
            addCriterion("SZ =", value, "sz");
            return (Criteria) this;
        }

        public Criteria andSzNotEqualTo(String value) {
            addCriterion("SZ <>", value, "sz");
            return (Criteria) this;
        }

        public Criteria andSzGreaterThan(String value) {
            addCriterion("SZ >", value, "sz");
            return (Criteria) this;
        }

        public Criteria andSzGreaterThanOrEqualTo(String value) {
            addCriterion("SZ >=", value, "sz");
            return (Criteria) this;
        }

        public Criteria andSzLessThan(String value) {
            addCriterion("SZ <", value, "sz");
            return (Criteria) this;
        }

        public Criteria andSzLessThanOrEqualTo(String value) {
            addCriterion("SZ <=", value, "sz");
            return (Criteria) this;
        }

        public Criteria andSzLike(String value) {
            addCriterion("SZ like", value, "sz");
            return (Criteria) this;
        }

        public Criteria andSzNotLike(String value) {
            addCriterion("SZ not like", value, "sz");
            return (Criteria) this;
        }

        public Criteria andSzIn(List<String> values) {
            addCriterion("SZ in", values, "sz");
            return (Criteria) this;
        }

        public Criteria andSzNotIn(List<String> values) {
            addCriterion("SZ not in", values, "sz");
            return (Criteria) this;
        }

        public Criteria andSzBetween(String value1, String value2) {
            addCriterion("SZ between", value1, value2, "sz");
            return (Criteria) this;
        }

        public Criteria andSzNotBetween(String value1, String value2) {
            addCriterion("SZ not between", value1, value2, "sz");
            return (Criteria) this;
        }

        public Criteria andTkIsNull() {
            addCriterion("TK is null");
            return (Criteria) this;
        }

        public Criteria andTkIsNotNull() {
            addCriterion("TK is not null");
            return (Criteria) this;
        }

        public Criteria andTkEqualTo(String value) {
            addCriterion("TK =", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkNotEqualTo(String value) {
            addCriterion("TK <>", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkGreaterThan(String value) {
            addCriterion("TK >", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkGreaterThanOrEqualTo(String value) {
            addCriterion("TK >=", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkLessThan(String value) {
            addCriterion("TK <", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkLessThanOrEqualTo(String value) {
            addCriterion("TK <=", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkLike(String value) {
            addCriterion("TK like", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkNotLike(String value) {
            addCriterion("TK not like", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkIn(List<String> values) {
            addCriterion("TK in", values, "tk");
            return (Criteria) this;
        }

        public Criteria andTkNotIn(List<String> values) {
            addCriterion("TK not in", values, "tk");
            return (Criteria) this;
        }

        public Criteria andTkBetween(String value1, String value2) {
            addCriterion("TK between", value1, value2, "tk");
            return (Criteria) this;
        }

        public Criteria andTkNotBetween(String value1, String value2) {
            addCriterion("TK not between", value1, value2, "tk");
            return (Criteria) this;
        }

        public Criteria andJmtdIsNull() {
            addCriterion("JMTD is null");
            return (Criteria) this;
        }

        public Criteria andJmtdIsNotNull() {
            addCriterion("JMTD is not null");
            return (Criteria) this;
        }

        public Criteria andJmtdEqualTo(String value) {
            addCriterion("JMTD =", value, "jmtd");
            return (Criteria) this;
        }

        public Criteria andJmtdNotEqualTo(String value) {
            addCriterion("JMTD <>", value, "jmtd");
            return (Criteria) this;
        }

        public Criteria andJmtdGreaterThan(String value) {
            addCriterion("JMTD >", value, "jmtd");
            return (Criteria) this;
        }

        public Criteria andJmtdGreaterThanOrEqualTo(String value) {
            addCriterion("JMTD >=", value, "jmtd");
            return (Criteria) this;
        }

        public Criteria andJmtdLessThan(String value) {
            addCriterion("JMTD <", value, "jmtd");
            return (Criteria) this;
        }

        public Criteria andJmtdLessThanOrEqualTo(String value) {
            addCriterion("JMTD <=", value, "jmtd");
            return (Criteria) this;
        }

        public Criteria andJmtdLike(String value) {
            addCriterion("JMTD like", value, "jmtd");
            return (Criteria) this;
        }

        public Criteria andJmtdNotLike(String value) {
            addCriterion("JMTD not like", value, "jmtd");
            return (Criteria) this;
        }

        public Criteria andJmtdIn(List<String> values) {
            addCriterion("JMTD in", values, "jmtd");
            return (Criteria) this;
        }

        public Criteria andJmtdNotIn(List<String> values) {
            addCriterion("JMTD not in", values, "jmtd");
            return (Criteria) this;
        }

        public Criteria andJmtdBetween(String value1, String value2) {
            addCriterion("JMTD between", value1, value2, "jmtd");
            return (Criteria) this;
        }

        public Criteria andJmtdNotBetween(String value1, String value2) {
            addCriterion("JMTD not between", value1, value2, "jmtd");
            return (Criteria) this;
        }

        public Criteria andGldgIsNull() {
            addCriterion("GLDG is null");
            return (Criteria) this;
        }

        public Criteria andGldgIsNotNull() {
            addCriterion("GLDG is not null");
            return (Criteria) this;
        }

        public Criteria andGldgEqualTo(String value) {
            addCriterion("GLDG =", value, "gldg");
            return (Criteria) this;
        }

        public Criteria andGldgNotEqualTo(String value) {
            addCriterion("GLDG <>", value, "gldg");
            return (Criteria) this;
        }

        public Criteria andGldgGreaterThan(String value) {
            addCriterion("GLDG >", value, "gldg");
            return (Criteria) this;
        }

        public Criteria andGldgGreaterThanOrEqualTo(String value) {
            addCriterion("GLDG >=", value, "gldg");
            return (Criteria) this;
        }

        public Criteria andGldgLessThan(String value) {
            addCriterion("GLDG <", value, "gldg");
            return (Criteria) this;
        }

        public Criteria andGldgLessThanOrEqualTo(String value) {
            addCriterion("GLDG <=", value, "gldg");
            return (Criteria) this;
        }

        public Criteria andGldgLike(String value) {
            addCriterion("GLDG like", value, "gldg");
            return (Criteria) this;
        }

        public Criteria andGldgNotLike(String value) {
            addCriterion("GLDG not like", value, "gldg");
            return (Criteria) this;
        }

        public Criteria andGldgIn(List<String> values) {
            addCriterion("GLDG in", values, "gldg");
            return (Criteria) this;
        }

        public Criteria andGldgNotIn(List<String> values) {
            addCriterion("GLDG not in", values, "gldg");
            return (Criteria) this;
        }

        public Criteria andGldgBetween(String value1, String value2) {
            addCriterion("GLDG between", value1, value2, "gldg");
            return (Criteria) this;
        }

        public Criteria andGldgNotBetween(String value1, String value2) {
            addCriterion("GLDG not between", value1, value2, "gldg");
            return (Criteria) this;
        }

        public Criteria andHxzcIsNull() {
            addCriterion("HXZC is null");
            return (Criteria) this;
        }

        public Criteria andHxzcIsNotNull() {
            addCriterion("HXZC is not null");
            return (Criteria) this;
        }

        public Criteria andHxzcEqualTo(String value) {
            addCriterion("HXZC =", value, "hxzc");
            return (Criteria) this;
        }

        public Criteria andHxzcNotEqualTo(String value) {
            addCriterion("HXZC <>", value, "hxzc");
            return (Criteria) this;
        }

        public Criteria andHxzcGreaterThan(String value) {
            addCriterion("HXZC >", value, "hxzc");
            return (Criteria) this;
        }

        public Criteria andHxzcGreaterThanOrEqualTo(String value) {
            addCriterion("HXZC >=", value, "hxzc");
            return (Criteria) this;
        }

        public Criteria andHxzcLessThan(String value) {
            addCriterion("HXZC <", value, "hxzc");
            return (Criteria) this;
        }

        public Criteria andHxzcLessThanOrEqualTo(String value) {
            addCriterion("HXZC <=", value, "hxzc");
            return (Criteria) this;
        }

        public Criteria andHxzcLike(String value) {
            addCriterion("HXZC like", value, "hxzc");
            return (Criteria) this;
        }

        public Criteria andHxzcNotLike(String value) {
            addCriterion("HXZC not like", value, "hxzc");
            return (Criteria) this;
        }

        public Criteria andHxzcIn(List<String> values) {
            addCriterion("HXZC in", values, "hxzc");
            return (Criteria) this;
        }

        public Criteria andHxzcNotIn(List<String> values) {
            addCriterion("HXZC not in", values, "hxzc");
            return (Criteria) this;
        }

        public Criteria andHxzcBetween(String value1, String value2) {
            addCriterion("HXZC between", value1, value2, "hxzc");
            return (Criteria) this;
        }

        public Criteria andHxzcNotBetween(String value1, String value2) {
            addCriterion("HXZC not between", value1, value2, "hxzc");
            return (Criteria) this;
        }

        public Criteria andCxbwgdIsNull() {
            addCriterion("CXBWGD is null");
            return (Criteria) this;
        }

        public Criteria andCxbwgdIsNotNull() {
            addCriterion("CXBWGD is not null");
            return (Criteria) this;
        }

        public Criteria andCxbwgdEqualTo(String value) {
            addCriterion("CXBWGD =", value, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andCxbwgdNotEqualTo(String value) {
            addCriterion("CXBWGD <>", value, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andCxbwgdGreaterThan(String value) {
            addCriterion("CXBWGD >", value, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andCxbwgdGreaterThanOrEqualTo(String value) {
            addCriterion("CXBWGD >=", value, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andCxbwgdLessThan(String value) {
            addCriterion("CXBWGD <", value, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andCxbwgdLessThanOrEqualTo(String value) {
            addCriterion("CXBWGD <=", value, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andCxbwgdLike(String value) {
            addCriterion("CXBWGD like", value, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andCxbwgdNotLike(String value) {
            addCriterion("CXBWGD not like", value, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andCxbwgdIn(List<String> values) {
            addCriterion("CXBWGD in", values, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andCxbwgdNotIn(List<String> values) {
            addCriterion("CXBWGD not in", values, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andCxbwgdBetween(String value1, String value2) {
            addCriterion("CXBWGD between", value1, value2, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andCxbwgdNotBetween(String value1, String value2) {
            addCriterion("CXBWGD not between", value1, value2, "cxbwgd");
            return (Criteria) this;
        }

        public Criteria andWwIsNull() {
            addCriterion("WW is null");
            return (Criteria) this;
        }

        public Criteria andWwIsNotNull() {
            addCriterion("WW is not null");
            return (Criteria) this;
        }

        public Criteria andWwEqualTo(String value) {
            addCriterion("WW =", value, "ww");
            return (Criteria) this;
        }

        public Criteria andWwNotEqualTo(String value) {
            addCriterion("WW <>", value, "ww");
            return (Criteria) this;
        }

        public Criteria andWwGreaterThan(String value) {
            addCriterion("WW >", value, "ww");
            return (Criteria) this;
        }

        public Criteria andWwGreaterThanOrEqualTo(String value) {
            addCriterion("WW >=", value, "ww");
            return (Criteria) this;
        }

        public Criteria andWwLessThan(String value) {
            addCriterion("WW <", value, "ww");
            return (Criteria) this;
        }

        public Criteria andWwLessThanOrEqualTo(String value) {
            addCriterion("WW <=", value, "ww");
            return (Criteria) this;
        }

        public Criteria andWwLike(String value) {
            addCriterion("WW like", value, "ww");
            return (Criteria) this;
        }

        public Criteria andWwNotLike(String value) {
            addCriterion("WW not like", value, "ww");
            return (Criteria) this;
        }

        public Criteria andWwIn(List<String> values) {
            addCriterion("WW in", values, "ww");
            return (Criteria) this;
        }

        public Criteria andWwNotIn(List<String> values) {
            addCriterion("WW not in", values, "ww");
            return (Criteria) this;
        }

        public Criteria andWwBetween(String value1, String value2) {
            addCriterion("WW between", value1, value2, "ww");
            return (Criteria) this;
        }

        public Criteria andWwNotBetween(String value1, String value2) {
            addCriterion("WW not between", value1, value2, "ww");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhIsNull() {
            addCriterion("TBJZZTBH is null");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhIsNotNull() {
            addCriterion("TBJZZTBH is not null");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhEqualTo(String value) {
            addCriterion("TBJZZTBH =", value, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhNotEqualTo(String value) {
            addCriterion("TBJZZTBH <>", value, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhGreaterThan(String value) {
            addCriterion("TBJZZTBH >", value, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhGreaterThanOrEqualTo(String value) {
            addCriterion("TBJZZTBH >=", value, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhLessThan(String value) {
            addCriterion("TBJZZTBH <", value, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhLessThanOrEqualTo(String value) {
            addCriterion("TBJZZTBH <=", value, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhLike(String value) {
            addCriterion("TBJZZTBH like", value, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhNotLike(String value) {
            addCriterion("TBJZZTBH not like", value, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhIn(List<String> values) {
            addCriterion("TBJZZTBH in", values, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhNotIn(List<String> values) {
            addCriterion("TBJZZTBH not in", values, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhBetween(String value1, String value2) {
            addCriterion("TBJZZTBH between", value1, value2, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andTbjzztbhNotBetween(String value1, String value2) {
            addCriterion("TBJZZTBH not between", value1, value2, "tbjzztbh");
            return (Criteria) this;
        }

        public Criteria andYdbrfsIsNull() {
            addCriterion("YDBRFS is null");
            return (Criteria) this;
        }

        public Criteria andYdbrfsIsNotNull() {
            addCriterion("YDBRFS is not null");
            return (Criteria) this;
        }

        public Criteria andYdbrfsEqualTo(String value) {
            addCriterion("YDBRFS =", value, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andYdbrfsNotEqualTo(String value) {
            addCriterion("YDBRFS <>", value, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andYdbrfsGreaterThan(String value) {
            addCriterion("YDBRFS >", value, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andYdbrfsGreaterThanOrEqualTo(String value) {
            addCriterion("YDBRFS >=", value, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andYdbrfsLessThan(String value) {
            addCriterion("YDBRFS <", value, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andYdbrfsLessThanOrEqualTo(String value) {
            addCriterion("YDBRFS <=", value, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andYdbrfsLike(String value) {
            addCriterion("YDBRFS like", value, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andYdbrfsNotLike(String value) {
            addCriterion("YDBRFS not like", value, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andYdbrfsIn(List<String> values) {
            addCriterion("YDBRFS in", values, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andYdbrfsNotIn(List<String> values) {
            addCriterion("YDBRFS not in", values, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andYdbrfsBetween(String value1, String value2) {
            addCriterion("YDBRFS between", value1, value2, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andYdbrfsNotBetween(String value1, String value2) {
            addCriterion("YDBRFS not between", value1, value2, "ydbrfs");
            return (Criteria) this;
        }

        public Criteria andBraqIsNull() {
            addCriterion("BRAQ is null");
            return (Criteria) this;
        }

        public Criteria andBraqIsNotNull() {
            addCriterion("BRAQ is not null");
            return (Criteria) this;
        }

        public Criteria andBraqEqualTo(String value) {
            addCriterion("BRAQ =", value, "braq");
            return (Criteria) this;
        }

        public Criteria andBraqNotEqualTo(String value) {
            addCriterion("BRAQ <>", value, "braq");
            return (Criteria) this;
        }

        public Criteria andBraqGreaterThan(String value) {
            addCriterion("BRAQ >", value, "braq");
            return (Criteria) this;
        }

        public Criteria andBraqGreaterThanOrEqualTo(String value) {
            addCriterion("BRAQ >=", value, "braq");
            return (Criteria) this;
        }

        public Criteria andBraqLessThan(String value) {
            addCriterion("BRAQ <", value, "braq");
            return (Criteria) this;
        }

        public Criteria andBraqLessThanOrEqualTo(String value) {
            addCriterion("BRAQ <=", value, "braq");
            return (Criteria) this;
        }

        public Criteria andBraqLike(String value) {
            addCriterion("BRAQ like", value, "braq");
            return (Criteria) this;
        }

        public Criteria andBraqNotLike(String value) {
            addCriterion("BRAQ not like", value, "braq");
            return (Criteria) this;
        }

        public Criteria andBraqIn(List<String> values) {
            addCriterion("BRAQ in", values, "braq");
            return (Criteria) this;
        }

        public Criteria andBraqNotIn(List<String> values) {
            addCriterion("BRAQ not in", values, "braq");
            return (Criteria) this;
        }

        public Criteria andBraqBetween(String value1, String value2) {
            addCriterion("BRAQ between", value1, value2, "braq");
            return (Criteria) this;
        }

        public Criteria andBraqNotBetween(String value1, String value2) {
            addCriterion("BRAQ not between", value1, value2, "braq");
            return (Criteria) this;
        }

        public Criteria andHxjIsNull() {
            addCriterion("HXJ is null");
            return (Criteria) this;
        }

        public Criteria andHxjIsNotNull() {
            addCriterion("HXJ is not null");
            return (Criteria) this;
        }

        public Criteria andHxjEqualTo(String value) {
            addCriterion("HXJ =", value, "hxj");
            return (Criteria) this;
        }

        public Criteria andHxjNotEqualTo(String value) {
            addCriterion("HXJ <>", value, "hxj");
            return (Criteria) this;
        }

        public Criteria andHxjGreaterThan(String value) {
            addCriterion("HXJ >", value, "hxj");
            return (Criteria) this;
        }

        public Criteria andHxjGreaterThanOrEqualTo(String value) {
            addCriterion("HXJ >=", value, "hxj");
            return (Criteria) this;
        }

        public Criteria andHxjLessThan(String value) {
            addCriterion("HXJ <", value, "hxj");
            return (Criteria) this;
        }

        public Criteria andHxjLessThanOrEqualTo(String value) {
            addCriterion("HXJ <=", value, "hxj");
            return (Criteria) this;
        }

        public Criteria andHxjLike(String value) {
            addCriterion("HXJ like", value, "hxj");
            return (Criteria) this;
        }

        public Criteria andHxjNotLike(String value) {
            addCriterion("HXJ not like", value, "hxj");
            return (Criteria) this;
        }

        public Criteria andHxjIn(List<String> values) {
            addCriterion("HXJ in", values, "hxj");
            return (Criteria) this;
        }

        public Criteria andHxjNotIn(List<String> values) {
            addCriterion("HXJ not in", values, "hxj");
            return (Criteria) this;
        }

        public Criteria andHxjBetween(String value1, String value2) {
            addCriterion("HXJ between", value1, value2, "hxj");
            return (Criteria) this;
        }

        public Criteria andHxjNotBetween(String value1, String value2) {
            addCriterion("HXJ not between", value1, value2, "hxj");
            return (Criteria) this;
        }

        public Criteria andJhyIsNull() {
            addCriterion("JHY is null");
            return (Criteria) this;
        }

        public Criteria andJhyIsNotNull() {
            addCriterion("JHY is not null");
            return (Criteria) this;
        }

        public Criteria andJhyEqualTo(String value) {
            addCriterion("JHY =", value, "jhy");
            return (Criteria) this;
        }

        public Criteria andJhyNotEqualTo(String value) {
            addCriterion("JHY <>", value, "jhy");
            return (Criteria) this;
        }

        public Criteria andJhyGreaterThan(String value) {
            addCriterion("JHY >", value, "jhy");
            return (Criteria) this;
        }

        public Criteria andJhyGreaterThanOrEqualTo(String value) {
            addCriterion("JHY >=", value, "jhy");
            return (Criteria) this;
        }

        public Criteria andJhyLessThan(String value) {
            addCriterion("JHY <", value, "jhy");
            return (Criteria) this;
        }

        public Criteria andJhyLessThanOrEqualTo(String value) {
            addCriterion("JHY <=", value, "jhy");
            return (Criteria) this;
        }

        public Criteria andJhyLike(String value) {
            addCriterion("JHY like", value, "jhy");
            return (Criteria) this;
        }

        public Criteria andJhyNotLike(String value) {
            addCriterion("JHY not like", value, "jhy");
            return (Criteria) this;
        }

        public Criteria andJhyIn(List<String> values) {
            addCriterion("JHY in", values, "jhy");
            return (Criteria) this;
        }

        public Criteria andJhyNotIn(List<String> values) {
            addCriterion("JHY not in", values, "jhy");
            return (Criteria) this;
        }

        public Criteria andJhyBetween(String value1, String value2) {
            addCriterion("JHY between", value1, value2, "jhy");
            return (Criteria) this;
        }

        public Criteria andJhyNotBetween(String value1, String value2) {
            addCriterion("JHY not between", value1, value2, "jhy");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoIsNull() {
            addCriterion("ZYFXPF_SCO is null");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoIsNotNull() {
            addCriterion("ZYFXPF_SCO is not null");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoEqualTo(Long value) {
            addCriterion("ZYFXPF_SCO =", value, "zyfxpfSco");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoNotEqualTo(Long value) {
            addCriterion("ZYFXPF_SCO <>", value, "zyfxpfSco");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoGreaterThan(Long value) {
            addCriterion("ZYFXPF_SCO >", value, "zyfxpfSco");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoGreaterThanOrEqualTo(Long value) {
            addCriterion("ZYFXPF_SCO >=", value, "zyfxpfSco");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoLessThan(Long value) {
            addCriterion("ZYFXPF_SCO <", value, "zyfxpfSco");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoLessThanOrEqualTo(Long value) {
            addCriterion("ZYFXPF_SCO <=", value, "zyfxpfSco");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoIn(List<Long> values) {
            addCriterion("ZYFXPF_SCO in", values, "zyfxpfSco");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoNotIn(List<Long> values) {
            addCriterion("ZYFXPF_SCO not in", values, "zyfxpfSco");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoBetween(Long value1, Long value2) {
            addCriterion("ZYFXPF_SCO between", value1, value2, "zyfxpfSco");
            return (Criteria) this;
        }

        public Criteria andZyfxpfScoNotBetween(Long value1, Long value2) {
            addCriterion("ZYFXPF_SCO not between", value1, value2, "zyfxpfSco");
            return (Criteria) this;
        }

        public Criteria andXdyqjywIsNull() {
            addCriterion("XDYQJYW is null");
            return (Criteria) this;
        }

        public Criteria andXdyqjywIsNotNull() {
            addCriterion("XDYQJYW is not null");
            return (Criteria) this;
        }

        public Criteria andXdyqjywEqualTo(String value) {
            addCriterion("XDYQJYW =", value, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywNotEqualTo(String value) {
            addCriterion("XDYQJYW <>", value, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywGreaterThan(String value) {
            addCriterion("XDYQJYW >", value, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywGreaterThanOrEqualTo(String value) {
            addCriterion("XDYQJYW >=", value, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywLessThan(String value) {
            addCriterion("XDYQJYW <", value, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywLessThanOrEqualTo(String value) {
            addCriterion("XDYQJYW <=", value, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywLike(String value) {
            addCriterion("XDYQJYW like", value, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywNotLike(String value) {
            addCriterion("XDYQJYW not like", value, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywIn(List<String> values) {
            addCriterion("XDYQJYW in", values, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywNotIn(List<String> values) {
            addCriterion("XDYQJYW not in", values, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywBetween(String value1, String value2) {
            addCriterion("XDYQJYW between", value1, value2, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywNotBetween(String value1, String value2) {
            addCriterion("XDYQJYW not between", value1, value2, "xdyqjyw");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtIsNull() {
            addCriterion("XDYQJYWQT is null");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtIsNotNull() {
            addCriterion("XDYQJYWQT is not null");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtEqualTo(String value) {
            addCriterion("XDYQJYWQT =", value, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtNotEqualTo(String value) {
            addCriterion("XDYQJYWQT <>", value, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtGreaterThan(String value) {
            addCriterion("XDYQJYWQT >", value, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtGreaterThanOrEqualTo(String value) {
            addCriterion("XDYQJYWQT >=", value, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtLessThan(String value) {
            addCriterion("XDYQJYWQT <", value, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtLessThanOrEqualTo(String value) {
            addCriterion("XDYQJYWQT <=", value, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtLike(String value) {
            addCriterion("XDYQJYWQT like", value, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtNotLike(String value) {
            addCriterion("XDYQJYWQT not like", value, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtIn(List<String> values) {
            addCriterion("XDYQJYWQT in", values, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtNotIn(List<String> values) {
            addCriterion("XDYQJYWQT not in", values, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtBetween(String value1, String value2) {
            addCriterion("XDYQJYWQT between", value1, value2, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andXdyqjywqtNotBetween(String value1, String value2) {
            addCriterion("XDYQJYWQT not between", value1, value2, "xdyqjywqt");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoIsNull() {
            addCriterion("CRTUSRNO is null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoIsNotNull() {
            addCriterion("CRTUSRNO is not null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoEqualTo(String value) {
            addCriterion("CRTUSRNO =", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotEqualTo(String value) {
            addCriterion("CRTUSRNO <>", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoGreaterThan(String value) {
            addCriterion("CRTUSRNO >", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoGreaterThanOrEqualTo(String value) {
            addCriterion("CRTUSRNO >=", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoLessThan(String value) {
            addCriterion("CRTUSRNO <", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoLessThanOrEqualTo(String value) {
            addCriterion("CRTUSRNO <=", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoLike(String value) {
            addCriterion("CRTUSRNO like", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotLike(String value) {
            addCriterion("CRTUSRNO not like", value, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoIn(List<String> values) {
            addCriterion("CRTUSRNO in", values, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotIn(List<String> values) {
            addCriterion("CRTUSRNO not in", values, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoBetween(String value1, String value2) {
            addCriterion("CRTUSRNO between", value1, value2, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnoNotBetween(String value1, String value2) {
            addCriterion("CRTUSRNO not between", value1, value2, "crtusrno");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeIsNull() {
            addCriterion("CRTUSRNME is null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeIsNotNull() {
            addCriterion("CRTUSRNME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeEqualTo(String value) {
            addCriterion("CRTUSRNME =", value, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeNotEqualTo(String value) {
            addCriterion("CRTUSRNME <>", value, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeGreaterThan(String value) {
            addCriterion("CRTUSRNME >", value, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeGreaterThanOrEqualTo(String value) {
            addCriterion("CRTUSRNME >=", value, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeLessThan(String value) {
            addCriterion("CRTUSRNME <", value, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeLessThanOrEqualTo(String value) {
            addCriterion("CRTUSRNME <=", value, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeLike(String value) {
            addCriterion("CRTUSRNME like", value, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeNotLike(String value) {
            addCriterion("CRTUSRNME not like", value, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeIn(List<String> values) {
            addCriterion("CRTUSRNME in", values, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeNotIn(List<String> values) {
            addCriterion("CRTUSRNME not in", values, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeBetween(String value1, String value2) {
            addCriterion("CRTUSRNME between", value1, value2, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrtusrnmeNotBetween(String value1, String value2) {
            addCriterion("CRTUSRNME not between", value1, value2, "crtusrnme");
            return (Criteria) this;
        }

        public Criteria andCrttimeIsNull() {
            addCriterion("CRTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCrttimeIsNotNull() {
            addCriterion("CRTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrttimeEqualTo(Date value) {
            addCriterion("CRTTIME =", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeNotEqualTo(Date value) {
            addCriterion("CRTTIME <>", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeGreaterThan(Date value) {
            addCriterion("CRTTIME >", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRTTIME >=", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeLessThan(Date value) {
            addCriterion("CRTTIME <", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeLessThanOrEqualTo(Date value) {
            addCriterion("CRTTIME <=", value, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeIn(List<Date> values) {
            addCriterion("CRTTIME in", values, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeNotIn(List<Date> values) {
            addCriterion("CRTTIME not in", values, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeBetween(Date value1, Date value2) {
            addCriterion("CRTTIME between", value1, value2, "crttime");
            return (Criteria) this;
        }

        public Criteria andCrttimeNotBetween(Date value1, Date value2) {
            addCriterion("CRTTIME not between", value1, value2, "crttime");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoIsNull() {
            addCriterion("UPDUSRNO is null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoIsNotNull() {
            addCriterion("UPDUSRNO is not null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoEqualTo(String value) {
            addCriterion("UPDUSRNO =", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotEqualTo(String value) {
            addCriterion("UPDUSRNO <>", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoGreaterThan(String value) {
            addCriterion("UPDUSRNO >", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoGreaterThanOrEqualTo(String value) {
            addCriterion("UPDUSRNO >=", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoLessThan(String value) {
            addCriterion("UPDUSRNO <", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoLessThanOrEqualTo(String value) {
            addCriterion("UPDUSRNO <=", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoLike(String value) {
            addCriterion("UPDUSRNO like", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotLike(String value) {
            addCriterion("UPDUSRNO not like", value, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoIn(List<String> values) {
            addCriterion("UPDUSRNO in", values, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotIn(List<String> values) {
            addCriterion("UPDUSRNO not in", values, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoBetween(String value1, String value2) {
            addCriterion("UPDUSRNO between", value1, value2, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnoNotBetween(String value1, String value2) {
            addCriterion("UPDUSRNO not between", value1, value2, "updusrno");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeIsNull() {
            addCriterion("UPDUSRNME is null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeIsNotNull() {
            addCriterion("UPDUSRNME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeEqualTo(String value) {
            addCriterion("UPDUSRNME =", value, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeNotEqualTo(String value) {
            addCriterion("UPDUSRNME <>", value, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeGreaterThan(String value) {
            addCriterion("UPDUSRNME >", value, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDUSRNME >=", value, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeLessThan(String value) {
            addCriterion("UPDUSRNME <", value, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeLessThanOrEqualTo(String value) {
            addCriterion("UPDUSRNME <=", value, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeLike(String value) {
            addCriterion("UPDUSRNME like", value, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeNotLike(String value) {
            addCriterion("UPDUSRNME not like", value, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeIn(List<String> values) {
            addCriterion("UPDUSRNME in", values, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeNotIn(List<String> values) {
            addCriterion("UPDUSRNME not in", values, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeBetween(String value1, String value2) {
            addCriterion("UPDUSRNME between", value1, value2, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdusrnmeNotBetween(String value1, String value2) {
            addCriterion("UPDUSRNME not between", value1, value2, "updusrnme");
            return (Criteria) this;
        }

        public Criteria andUpdtimeIsNull() {
            addCriterion("UPDTIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdtimeIsNotNull() {
            addCriterion("UPDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtimeEqualTo(Date value) {
            addCriterion("UPDTIME =", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeNotEqualTo(Date value) {
            addCriterion("UPDTIME <>", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeGreaterThan(Date value) {
            addCriterion("UPDTIME >", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDTIME >=", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeLessThan(Date value) {
            addCriterion("UPDTIME <", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDTIME <=", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeIn(List<Date> values) {
            addCriterion("UPDTIME in", values, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeNotIn(List<Date> values) {
            addCriterion("UPDTIME not in", values, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeBetween(Date value1, Date value2) {
            addCriterion("UPDTIME between", value1, value2, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDTIME not between", value1, value2, "updtime");
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