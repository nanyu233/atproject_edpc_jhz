package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCrivelInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCrivelInfExample() {
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

        public Criteria andVelSeqIsNull() {
            addCriterion("VEL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andVelSeqIsNotNull() {
            addCriterion("VEL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andVelSeqEqualTo(String value) {
            addCriterion("VEL_SEQ =", value, "velSeq");
            return (Criteria) this;
        }

        public Criteria andVelSeqNotEqualTo(String value) {
            addCriterion("VEL_SEQ <>", value, "velSeq");
            return (Criteria) this;
        }

        public Criteria andVelSeqGreaterThan(String value) {
            addCriterion("VEL_SEQ >", value, "velSeq");
            return (Criteria) this;
        }

        public Criteria andVelSeqGreaterThanOrEqualTo(String value) {
            addCriterion("VEL_SEQ >=", value, "velSeq");
            return (Criteria) this;
        }

        public Criteria andVelSeqLessThan(String value) {
            addCriterion("VEL_SEQ <", value, "velSeq");
            return (Criteria) this;
        }

        public Criteria andVelSeqLessThanOrEqualTo(String value) {
            addCriterion("VEL_SEQ <=", value, "velSeq");
            return (Criteria) this;
        }

        public Criteria andVelSeqLike(String value) {
            addCriterion("VEL_SEQ like", value, "velSeq");
            return (Criteria) this;
        }

        public Criteria andVelSeqNotLike(String value) {
            addCriterion("VEL_SEQ not like", value, "velSeq");
            return (Criteria) this;
        }

        public Criteria andVelSeqIn(List<String> values) {
            addCriterion("VEL_SEQ in", values, "velSeq");
            return (Criteria) this;
        }

        public Criteria andVelSeqNotIn(List<String> values) {
            addCriterion("VEL_SEQ not in", values, "velSeq");
            return (Criteria) this;
        }

        public Criteria andVelSeqBetween(String value1, String value2) {
            addCriterion("VEL_SEQ between", value1, value2, "velSeq");
            return (Criteria) this;
        }

        public Criteria andVelSeqNotBetween(String value1, String value2) {
            addCriterion("VEL_SEQ not between", value1, value2, "velSeq");
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

        public Criteria andXzcdIsNull() {
            addCriterion("XZCD is null");
            return (Criteria) this;
        }

        public Criteria andXzcdIsNotNull() {
            addCriterion("XZCD is not null");
            return (Criteria) this;
        }

        public Criteria andXzcdEqualTo(String value) {
            addCriterion("XZCD =", value, "xzcd");
            return (Criteria) this;
        }

        public Criteria andXzcdNotEqualTo(String value) {
            addCriterion("XZCD <>", value, "xzcd");
            return (Criteria) this;
        }

        public Criteria andXzcdGreaterThan(String value) {
            addCriterion("XZCD >", value, "xzcd");
            return (Criteria) this;
        }

        public Criteria andXzcdGreaterThanOrEqualTo(String value) {
            addCriterion("XZCD >=", value, "xzcd");
            return (Criteria) this;
        }

        public Criteria andXzcdLessThan(String value) {
            addCriterion("XZCD <", value, "xzcd");
            return (Criteria) this;
        }

        public Criteria andXzcdLessThanOrEqualTo(String value) {
            addCriterion("XZCD <=", value, "xzcd");
            return (Criteria) this;
        }

        public Criteria andXzcdLike(String value) {
            addCriterion("XZCD like", value, "xzcd");
            return (Criteria) this;
        }

        public Criteria andXzcdNotLike(String value) {
            addCriterion("XZCD not like", value, "xzcd");
            return (Criteria) this;
        }

        public Criteria andXzcdIn(List<String> values) {
            addCriterion("XZCD in", values, "xzcd");
            return (Criteria) this;
        }

        public Criteria andXzcdNotIn(List<String> values) {
            addCriterion("XZCD not in", values, "xzcd");
            return (Criteria) this;
        }

        public Criteria andXzcdBetween(String value1, String value2) {
            addCriterion("XZCD between", value1, value2, "xzcd");
            return (Criteria) this;
        }

        public Criteria andXzcdNotBetween(String value1, String value2) {
            addCriterion("XZCD not between", value1, value2, "xzcd");
            return (Criteria) this;
        }

        public Criteria andZystimixlIsNull() {
            addCriterion("ZYSTIMIXL is null");
            return (Criteria) this;
        }

        public Criteria andZystimixlIsNotNull() {
            addCriterion("ZYSTIMIXL is not null");
            return (Criteria) this;
        }

        public Criteria andZystimixlEqualTo(String value) {
            addCriterion("ZYSTIMIXL =", value, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZystimixlNotEqualTo(String value) {
            addCriterion("ZYSTIMIXL <>", value, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZystimixlGreaterThan(String value) {
            addCriterion("ZYSTIMIXL >", value, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZystimixlGreaterThanOrEqualTo(String value) {
            addCriterion("ZYSTIMIXL >=", value, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZystimixlLessThan(String value) {
            addCriterion("ZYSTIMIXL <", value, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZystimixlLessThanOrEqualTo(String value) {
            addCriterion("ZYSTIMIXL <=", value, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZystimixlLike(String value) {
            addCriterion("ZYSTIMIXL like", value, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZystimixlNotLike(String value) {
            addCriterion("ZYSTIMIXL not like", value, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZystimixlIn(List<String> values) {
            addCriterion("ZYSTIMIXL in", values, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZystimixlNotIn(List<String> values) {
            addCriterion("ZYSTIMIXL not in", values, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZystimixlBetween(String value1, String value2) {
            addCriterion("ZYSTIMIXL between", value1, value2, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZystimixlNotBetween(String value1, String value2) {
            addCriterion("ZYSTIMIXL not between", value1, value2, "zystimixl");
            return (Criteria) this;
        }

        public Criteria andZjnxsIsNull() {
            addCriterion("ZJNXS is null");
            return (Criteria) this;
        }

        public Criteria andZjnxsIsNotNull() {
            addCriterion("ZJNXS is not null");
            return (Criteria) this;
        }

        public Criteria andZjnxsEqualTo(String value) {
            addCriterion("ZJNXS =", value, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andZjnxsNotEqualTo(String value) {
            addCriterion("ZJNXS <>", value, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andZjnxsGreaterThan(String value) {
            addCriterion("ZJNXS >", value, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andZjnxsGreaterThanOrEqualTo(String value) {
            addCriterion("ZJNXS >=", value, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andZjnxsLessThan(String value) {
            addCriterion("ZJNXS <", value, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andZjnxsLessThanOrEqualTo(String value) {
            addCriterion("ZJNXS <=", value, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andZjnxsLike(String value) {
            addCriterion("ZJNXS like", value, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andZjnxsNotLike(String value) {
            addCriterion("ZJNXS not like", value, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andZjnxsIn(List<String> values) {
            addCriterion("ZJNXS in", values, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andZjnxsNotIn(List<String> values) {
            addCriterion("ZJNXS not in", values, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andZjnxsBetween(String value1, String value2) {
            addCriterion("ZJNXS between", value1, value2, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andZjnxsNotBetween(String value1, String value2) {
            addCriterion("ZJNXS not between", value1, value2, "zjnxs");
            return (Criteria) this;
        }

        public Criteria andSffcbbIsNull() {
            addCriterion("SFFCBB is null");
            return (Criteria) this;
        }

        public Criteria andSffcbbIsNotNull() {
            addCriterion("SFFCBB is not null");
            return (Criteria) this;
        }

        public Criteria andSffcbbEqualTo(String value) {
            addCriterion("SFFCBB =", value, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSffcbbNotEqualTo(String value) {
            addCriterion("SFFCBB <>", value, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSffcbbGreaterThan(String value) {
            addCriterion("SFFCBB >", value, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSffcbbGreaterThanOrEqualTo(String value) {
            addCriterion("SFFCBB >=", value, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSffcbbLessThan(String value) {
            addCriterion("SFFCBB <", value, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSffcbbLessThanOrEqualTo(String value) {
            addCriterion("SFFCBB <=", value, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSffcbbLike(String value) {
            addCriterion("SFFCBB like", value, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSffcbbNotLike(String value) {
            addCriterion("SFFCBB not like", value, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSffcbbIn(List<String> values) {
            addCriterion("SFFCBB in", values, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSffcbbNotIn(List<String> values) {
            addCriterion("SFFCBB not in", values, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSffcbbBetween(String value1, String value2) {
            addCriterion("SFFCBB between", value1, value2, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSffcbbNotBetween(String value1, String value2) {
            addCriterion("SFFCBB not between", value1, value2, "sffcbb");
            return (Criteria) this;
        }

        public Criteria andSfctoIsNull() {
            addCriterion("SFCTO is null");
            return (Criteria) this;
        }

        public Criteria andSfctoIsNotNull() {
            addCriterion("SFCTO is not null");
            return (Criteria) this;
        }

        public Criteria andSfctoEqualTo(String value) {
            addCriterion("SFCTO =", value, "sfcto");
            return (Criteria) this;
        }

        public Criteria andSfctoNotEqualTo(String value) {
            addCriterion("SFCTO <>", value, "sfcto");
            return (Criteria) this;
        }

        public Criteria andSfctoGreaterThan(String value) {
            addCriterion("SFCTO >", value, "sfcto");
            return (Criteria) this;
        }

        public Criteria andSfctoGreaterThanOrEqualTo(String value) {
            addCriterion("SFCTO >=", value, "sfcto");
            return (Criteria) this;
        }

        public Criteria andSfctoLessThan(String value) {
            addCriterion("SFCTO <", value, "sfcto");
            return (Criteria) this;
        }

        public Criteria andSfctoLessThanOrEqualTo(String value) {
            addCriterion("SFCTO <=", value, "sfcto");
            return (Criteria) this;
        }

        public Criteria andSfctoLike(String value) {
            addCriterion("SFCTO like", value, "sfcto");
            return (Criteria) this;
        }

        public Criteria andSfctoNotLike(String value) {
            addCriterion("SFCTO not like", value, "sfcto");
            return (Criteria) this;
        }

        public Criteria andSfctoIn(List<String> values) {
            addCriterion("SFCTO in", values, "sfcto");
            return (Criteria) this;
        }

        public Criteria andSfctoNotIn(List<String> values) {
            addCriterion("SFCTO not in", values, "sfcto");
            return (Criteria) this;
        }

        public Criteria andSfctoBetween(String value1, String value2) {
            addCriterion("SFCTO between", value1, value2, "sfcto");
            return (Criteria) this;
        }

        public Criteria andSfctoNotBetween(String value1, String value2) {
            addCriterion("SFCTO not between", value1, value2, "sfcto");
            return (Criteria) this;
        }

        public Criteria andGhbbIsNull() {
            addCriterion("GHBB is null");
            return (Criteria) this;
        }

        public Criteria andGhbbIsNotNull() {
            addCriterion("GHBB is not null");
            return (Criteria) this;
        }

        public Criteria andGhbbEqualTo(String value) {
            addCriterion("GHBB =", value, "ghbb");
            return (Criteria) this;
        }

        public Criteria andGhbbNotEqualTo(String value) {
            addCriterion("GHBB <>", value, "ghbb");
            return (Criteria) this;
        }

        public Criteria andGhbbGreaterThan(String value) {
            addCriterion("GHBB >", value, "ghbb");
            return (Criteria) this;
        }

        public Criteria andGhbbGreaterThanOrEqualTo(String value) {
            addCriterion("GHBB >=", value, "ghbb");
            return (Criteria) this;
        }

        public Criteria andGhbbLessThan(String value) {
            addCriterion("GHBB <", value, "ghbb");
            return (Criteria) this;
        }

        public Criteria andGhbbLessThanOrEqualTo(String value) {
            addCriterion("GHBB <=", value, "ghbb");
            return (Criteria) this;
        }

        public Criteria andGhbbLike(String value) {
            addCriterion("GHBB like", value, "ghbb");
            return (Criteria) this;
        }

        public Criteria andGhbbNotLike(String value) {
            addCriterion("GHBB not like", value, "ghbb");
            return (Criteria) this;
        }

        public Criteria andGhbbIn(List<String> values) {
            addCriterion("GHBB in", values, "ghbb");
            return (Criteria) this;
        }

        public Criteria andGhbbNotIn(List<String> values) {
            addCriterion("GHBB not in", values, "ghbb");
            return (Criteria) this;
        }

        public Criteria andGhbbBetween(String value1, String value2) {
            addCriterion("GHBB between", value1, value2, "ghbb");
            return (Criteria) this;
        }

        public Criteria andGhbbNotBetween(String value1, String value2) {
            addCriterion("GHBB not between", value1, value2, "ghbb");
            return (Criteria) this;
        }

        public Criteria andZfbbIsNull() {
            addCriterion("ZFBB is null");
            return (Criteria) this;
        }

        public Criteria andZfbbIsNotNull() {
            addCriterion("ZFBB is not null");
            return (Criteria) this;
        }

        public Criteria andZfbbEqualTo(String value) {
            addCriterion("ZFBB =", value, "zfbb");
            return (Criteria) this;
        }

        public Criteria andZfbbNotEqualTo(String value) {
            addCriterion("ZFBB <>", value, "zfbb");
            return (Criteria) this;
        }

        public Criteria andZfbbGreaterThan(String value) {
            addCriterion("ZFBB >", value, "zfbb");
            return (Criteria) this;
        }

        public Criteria andZfbbGreaterThanOrEqualTo(String value) {
            addCriterion("ZFBB >=", value, "zfbb");
            return (Criteria) this;
        }

        public Criteria andZfbbLessThan(String value) {
            addCriterion("ZFBB <", value, "zfbb");
            return (Criteria) this;
        }

        public Criteria andZfbbLessThanOrEqualTo(String value) {
            addCriterion("ZFBB <=", value, "zfbb");
            return (Criteria) this;
        }

        public Criteria andZfbbLike(String value) {
            addCriterion("ZFBB like", value, "zfbb");
            return (Criteria) this;
        }

        public Criteria andZfbbNotLike(String value) {
            addCriterion("ZFBB not like", value, "zfbb");
            return (Criteria) this;
        }

        public Criteria andZfbbIn(List<String> values) {
            addCriterion("ZFBB in", values, "zfbb");
            return (Criteria) this;
        }

        public Criteria andZfbbNotIn(List<String> values) {
            addCriterion("ZFBB not in", values, "zfbb");
            return (Criteria) this;
        }

        public Criteria andZfbbBetween(String value1, String value2) {
            addCriterion("ZFBB between", value1, value2, "zfbb");
            return (Criteria) this;
        }

        public Criteria andZfbbNotBetween(String value1, String value2) {
            addCriterion("ZFBB not between", value1, value2, "zfbb");
            return (Criteria) this;
        }

        public Criteria andPciIsNull() {
            addCriterion("PCI is null");
            return (Criteria) this;
        }

        public Criteria andPciIsNotNull() {
            addCriterion("PCI is not null");
            return (Criteria) this;
        }

        public Criteria andPciEqualTo(String value) {
            addCriterion("PCI =", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotEqualTo(String value) {
            addCriterion("PCI <>", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciGreaterThan(String value) {
            addCriterion("PCI >", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciGreaterThanOrEqualTo(String value) {
            addCriterion("PCI >=", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciLessThan(String value) {
            addCriterion("PCI <", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciLessThanOrEqualTo(String value) {
            addCriterion("PCI <=", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciLike(String value) {
            addCriterion("PCI like", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotLike(String value) {
            addCriterion("PCI not like", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciIn(List<String> values) {
            addCriterion("PCI in", values, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotIn(List<String> values) {
            addCriterion("PCI not in", values, "pci");
            return (Criteria) this;
        }

        public Criteria andPciBetween(String value1, String value2) {
            addCriterion("PCI between", value1, value2, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotBetween(String value1, String value2) {
            addCriterion("PCI not between", value1, value2, "pci");
            return (Criteria) this;
        }

        public Criteria andSzclIsNull() {
            addCriterion("SZCL is null");
            return (Criteria) this;
        }

        public Criteria andSzclIsNotNull() {
            addCriterion("SZCL is not null");
            return (Criteria) this;
        }

        public Criteria andSzclEqualTo(String value) {
            addCriterion("SZCL =", value, "szcl");
            return (Criteria) this;
        }

        public Criteria andSzclNotEqualTo(String value) {
            addCriterion("SZCL <>", value, "szcl");
            return (Criteria) this;
        }

        public Criteria andSzclGreaterThan(String value) {
            addCriterion("SZCL >", value, "szcl");
            return (Criteria) this;
        }

        public Criteria andSzclGreaterThanOrEqualTo(String value) {
            addCriterion("SZCL >=", value, "szcl");
            return (Criteria) this;
        }

        public Criteria andSzclLessThan(String value) {
            addCriterion("SZCL <", value, "szcl");
            return (Criteria) this;
        }

        public Criteria andSzclLessThanOrEqualTo(String value) {
            addCriterion("SZCL <=", value, "szcl");
            return (Criteria) this;
        }

        public Criteria andSzclLike(String value) {
            addCriterion("SZCL like", value, "szcl");
            return (Criteria) this;
        }

        public Criteria andSzclNotLike(String value) {
            addCriterion("SZCL not like", value, "szcl");
            return (Criteria) this;
        }

        public Criteria andSzclIn(List<String> values) {
            addCriterion("SZCL in", values, "szcl");
            return (Criteria) this;
        }

        public Criteria andSzclNotIn(List<String> values) {
            addCriterion("SZCL not in", values, "szcl");
            return (Criteria) this;
        }

        public Criteria andSzclBetween(String value1, String value2) {
            addCriterion("SZCL between", value1, value2, "szcl");
            return (Criteria) this;
        }

        public Criteria andSzclNotBetween(String value1, String value2) {
            addCriterion("SZCL not between", value1, value2, "szcl");
            return (Criteria) this;
        }

        public Criteria andDstgsjIsNull() {
            addCriterion("DSTGSJ is null");
            return (Criteria) this;
        }

        public Criteria andDstgsjIsNotNull() {
            addCriterion("DSTGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDstgsjEqualTo(Date value) {
            addCriterion("DSTGSJ =", value, "dstgsj");
            return (Criteria) this;
        }

        public Criteria andDstgsjNotEqualTo(Date value) {
            addCriterion("DSTGSJ <>", value, "dstgsj");
            return (Criteria) this;
        }

        public Criteria andDstgsjGreaterThan(Date value) {
            addCriterion("DSTGSJ >", value, "dstgsj");
            return (Criteria) this;
        }

        public Criteria andDstgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("DSTGSJ >=", value, "dstgsj");
            return (Criteria) this;
        }

        public Criteria andDstgsjLessThan(Date value) {
            addCriterion("DSTGSJ <", value, "dstgsj");
            return (Criteria) this;
        }

        public Criteria andDstgsjLessThanOrEqualTo(Date value) {
            addCriterion("DSTGSJ <=", value, "dstgsj");
            return (Criteria) this;
        }

        public Criteria andDstgsjIn(List<Date> values) {
            addCriterion("DSTGSJ in", values, "dstgsj");
            return (Criteria) this;
        }

        public Criteria andDstgsjNotIn(List<Date> values) {
            addCriterion("DSTGSJ not in", values, "dstgsj");
            return (Criteria) this;
        }

        public Criteria andDstgsjBetween(Date value1, Date value2) {
            addCriterion("DSTGSJ between", value1, value2, "dstgsj");
            return (Criteria) this;
        }

        public Criteria andDstgsjNotBetween(Date value1, Date value2) {
            addCriterion("DSTGSJ not between", value1, value2, "dstgsj");
            return (Criteria) this;
        }

        public Criteria andShtimixlIsNull() {
            addCriterion("SHTIMIXL is null");
            return (Criteria) this;
        }

        public Criteria andShtimixlIsNotNull() {
            addCriterion("SHTIMIXL is not null");
            return (Criteria) this;
        }

        public Criteria andShtimixlEqualTo(String value) {
            addCriterion("SHTIMIXL =", value, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andShtimixlNotEqualTo(String value) {
            addCriterion("SHTIMIXL <>", value, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andShtimixlGreaterThan(String value) {
            addCriterion("SHTIMIXL >", value, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andShtimixlGreaterThanOrEqualTo(String value) {
            addCriterion("SHTIMIXL >=", value, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andShtimixlLessThan(String value) {
            addCriterion("SHTIMIXL <", value, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andShtimixlLessThanOrEqualTo(String value) {
            addCriterion("SHTIMIXL <=", value, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andShtimixlLike(String value) {
            addCriterion("SHTIMIXL like", value, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andShtimixlNotLike(String value) {
            addCriterion("SHTIMIXL not like", value, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andShtimixlIn(List<String> values) {
            addCriterion("SHTIMIXL in", values, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andShtimixlNotIn(List<String> values) {
            addCriterion("SHTIMIXL not in", values, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andShtimixlBetween(String value1, String value2) {
            addCriterion("SHTIMIXL between", value1, value2, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andShtimixlNotBetween(String value1, String value2) {
            addCriterion("SHTIMIXL not between", value1, value2, "shtimixl");
            return (Criteria) this;
        }

        public Criteria andZrzjgsIsNull() {
            addCriterion("ZRZJGS is null");
            return (Criteria) this;
        }

        public Criteria andZrzjgsIsNotNull() {
            addCriterion("ZRZJGS is not null");
            return (Criteria) this;
        }

        public Criteria andZrzjgsEqualTo(String value) {
            addCriterion("ZRZJGS =", value, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZrzjgsNotEqualTo(String value) {
            addCriterion("ZRZJGS <>", value, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZrzjgsGreaterThan(String value) {
            addCriterion("ZRZJGS >", value, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZrzjgsGreaterThanOrEqualTo(String value) {
            addCriterion("ZRZJGS >=", value, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZrzjgsLessThan(String value) {
            addCriterion("ZRZJGS <", value, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZrzjgsLessThanOrEqualTo(String value) {
            addCriterion("ZRZJGS <=", value, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZrzjgsLike(String value) {
            addCriterion("ZRZJGS like", value, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZrzjgsNotLike(String value) {
            addCriterion("ZRZJGS not like", value, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZrzjgsIn(List<String> values) {
            addCriterion("ZRZJGS in", values, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZrzjgsNotIn(List<String> values) {
            addCriterion("ZRZJGS not in", values, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZrzjgsBetween(String value1, String value2) {
            addCriterion("ZRZJGS between", value1, value2, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZrzjgsNotBetween(String value1, String value2) {
            addCriterion("ZRZJGS not between", value1, value2, "zrzjgs");
            return (Criteria) this;
        }

        public Criteria andZjzlIsNull() {
            addCriterion("ZJZL is null");
            return (Criteria) this;
        }

        public Criteria andZjzlIsNotNull() {
            addCriterion("ZJZL is not null");
            return (Criteria) this;
        }

        public Criteria andZjzlEqualTo(String value) {
            addCriterion("ZJZL =", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotEqualTo(String value) {
            addCriterion("ZJZL <>", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlGreaterThan(String value) {
            addCriterion("ZJZL >", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlGreaterThanOrEqualTo(String value) {
            addCriterion("ZJZL >=", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLessThan(String value) {
            addCriterion("ZJZL <", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLessThanOrEqualTo(String value) {
            addCriterion("ZJZL <=", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLike(String value) {
            addCriterion("ZJZL like", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotLike(String value) {
            addCriterion("ZJZL not like", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlIn(List<String> values) {
            addCriterion("ZJZL in", values, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotIn(List<String> values) {
            addCriterion("ZJZL not in", values, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlBetween(String value1, String value2) {
            addCriterion("ZJZL between", value1, value2, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotBetween(String value1, String value2) {
            addCriterion("ZJZL not between", value1, value2, "zjzl");
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