package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspItemsInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspItemsInfExample() {
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

        public Criteria andItemsSeqIsNull() {
            addCriterion("ITEMS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andItemsSeqIsNotNull() {
            addCriterion("ITEMS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andItemsSeqEqualTo(String value) {
            addCriterion("ITEMS_SEQ =", value, "itemsSeq");
            return (Criteria) this;
        }

        public Criteria andItemsSeqNotEqualTo(String value) {
            addCriterion("ITEMS_SEQ <>", value, "itemsSeq");
            return (Criteria) this;
        }

        public Criteria andItemsSeqGreaterThan(String value) {
            addCriterion("ITEMS_SEQ >", value, "itemsSeq");
            return (Criteria) this;
        }

        public Criteria andItemsSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_SEQ >=", value, "itemsSeq");
            return (Criteria) this;
        }

        public Criteria andItemsSeqLessThan(String value) {
            addCriterion("ITEMS_SEQ <", value, "itemsSeq");
            return (Criteria) this;
        }

        public Criteria andItemsSeqLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_SEQ <=", value, "itemsSeq");
            return (Criteria) this;
        }

        public Criteria andItemsSeqLike(String value) {
            addCriterion("ITEMS_SEQ like", value, "itemsSeq");
            return (Criteria) this;
        }

        public Criteria andItemsSeqNotLike(String value) {
            addCriterion("ITEMS_SEQ not like", value, "itemsSeq");
            return (Criteria) this;
        }

        public Criteria andItemsSeqIn(List<String> values) {
            addCriterion("ITEMS_SEQ in", values, "itemsSeq");
            return (Criteria) this;
        }

        public Criteria andItemsSeqNotIn(List<String> values) {
            addCriterion("ITEMS_SEQ not in", values, "itemsSeq");
            return (Criteria) this;
        }

        public Criteria andItemsSeqBetween(String value1, String value2) {
            addCriterion("ITEMS_SEQ between", value1, value2, "itemsSeq");
            return (Criteria) this;
        }

        public Criteria andItemsSeqNotBetween(String value1, String value2) {
            addCriterion("ITEMS_SEQ not between", value1, value2, "itemsSeq");
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

        public Criteria andTimeTypIsNull() {
            addCriterion("TIME_TYP is null");
            return (Criteria) this;
        }

        public Criteria andTimeTypIsNotNull() {
            addCriterion("TIME_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTypEqualTo(String value) {
            addCriterion("TIME_TYP =", value, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andTimeTypNotEqualTo(String value) {
            addCriterion("TIME_TYP <>", value, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andTimeTypGreaterThan(String value) {
            addCriterion("TIME_TYP >", value, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andTimeTypGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_TYP >=", value, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andTimeTypLessThan(String value) {
            addCriterion("TIME_TYP <", value, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andTimeTypLessThanOrEqualTo(String value) {
            addCriterion("TIME_TYP <=", value, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andTimeTypLike(String value) {
            addCriterion("TIME_TYP like", value, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andTimeTypNotLike(String value) {
            addCriterion("TIME_TYP not like", value, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andTimeTypIn(List<String> values) {
            addCriterion("TIME_TYP in", values, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andTimeTypNotIn(List<String> values) {
            addCriterion("TIME_TYP not in", values, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andTimeTypBetween(String value1, String value2) {
            addCriterion("TIME_TYP between", value1, value2, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andTimeTypNotBetween(String value1, String value2) {
            addCriterion("TIME_TYP not between", value1, value2, "timeTyp");
            return (Criteria) this;
        }

        public Criteria andXcbCountIsNull() {
            addCriterion("XCB_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andXcbCountIsNotNull() {
            addCriterion("XCB_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andXcbCountEqualTo(Short value) {
            addCriterion("XCB_COUNT =", value, "xcbCount");
            return (Criteria) this;
        }

        public Criteria andXcbCountNotEqualTo(Short value) {
            addCriterion("XCB_COUNT <>", value, "xcbCount");
            return (Criteria) this;
        }

        public Criteria andXcbCountGreaterThan(Short value) {
            addCriterion("XCB_COUNT >", value, "xcbCount");
            return (Criteria) this;
        }

        public Criteria andXcbCountGreaterThanOrEqualTo(Short value) {
            addCriterion("XCB_COUNT >=", value, "xcbCount");
            return (Criteria) this;
        }

        public Criteria andXcbCountLessThan(Short value) {
            addCriterion("XCB_COUNT <", value, "xcbCount");
            return (Criteria) this;
        }

        public Criteria andXcbCountLessThanOrEqualTo(Short value) {
            addCriterion("XCB_COUNT <=", value, "xcbCount");
            return (Criteria) this;
        }

        public Criteria andXcbCountIn(List<Short> values) {
            addCriterion("XCB_COUNT in", values, "xcbCount");
            return (Criteria) this;
        }

        public Criteria andXcbCountNotIn(List<Short> values) {
            addCriterion("XCB_COUNT not in", values, "xcbCount");
            return (Criteria) this;
        }

        public Criteria andXcbCountBetween(Short value1, Short value2) {
            addCriterion("XCB_COUNT between", value1, value2, "xcbCount");
            return (Criteria) this;
        }

        public Criteria andXcbCountNotBetween(Short value1, Short value2) {
            addCriterion("XCB_COUNT not between", value1, value2, "xcbCount");
            return (Criteria) this;
        }

        public Criteria andDnbCountIsNull() {
            addCriterion("DNB_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andDnbCountIsNotNull() {
            addCriterion("DNB_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDnbCountEqualTo(Short value) {
            addCriterion("DNB_COUNT =", value, "dnbCount");
            return (Criteria) this;
        }

        public Criteria andDnbCountNotEqualTo(Short value) {
            addCriterion("DNB_COUNT <>", value, "dnbCount");
            return (Criteria) this;
        }

        public Criteria andDnbCountGreaterThan(Short value) {
            addCriterion("DNB_COUNT >", value, "dnbCount");
            return (Criteria) this;
        }

        public Criteria andDnbCountGreaterThanOrEqualTo(Short value) {
            addCriterion("DNB_COUNT >=", value, "dnbCount");
            return (Criteria) this;
        }

        public Criteria andDnbCountLessThan(Short value) {
            addCriterion("DNB_COUNT <", value, "dnbCount");
            return (Criteria) this;
        }

        public Criteria andDnbCountLessThanOrEqualTo(Short value) {
            addCriterion("DNB_COUNT <=", value, "dnbCount");
            return (Criteria) this;
        }

        public Criteria andDnbCountIn(List<Short> values) {
            addCriterion("DNB_COUNT in", values, "dnbCount");
            return (Criteria) this;
        }

        public Criteria andDnbCountNotIn(List<Short> values) {
            addCriterion("DNB_COUNT not in", values, "dnbCount");
            return (Criteria) this;
        }

        public Criteria andDnbCountBetween(Short value1, Short value2) {
            addCriterion("DNB_COUNT between", value1, value2, "dnbCount");
            return (Criteria) this;
        }

        public Criteria andDnbCountNotBetween(Short value1, Short value2) {
            addCriterion("DNB_COUNT not between", value1, value2, "dnbCount");
            return (Criteria) this;
        }

        public Criteria andJqbCountIsNull() {
            addCriterion("JQB_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andJqbCountIsNotNull() {
            addCriterion("JQB_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andJqbCountEqualTo(Short value) {
            addCriterion("JQB_COUNT =", value, "jqbCount");
            return (Criteria) this;
        }

        public Criteria andJqbCountNotEqualTo(Short value) {
            addCriterion("JQB_COUNT <>", value, "jqbCount");
            return (Criteria) this;
        }

        public Criteria andJqbCountGreaterThan(Short value) {
            addCriterion("JQB_COUNT >", value, "jqbCount");
            return (Criteria) this;
        }

        public Criteria andJqbCountGreaterThanOrEqualTo(Short value) {
            addCriterion("JQB_COUNT >=", value, "jqbCount");
            return (Criteria) this;
        }

        public Criteria andJqbCountLessThan(Short value) {
            addCriterion("JQB_COUNT <", value, "jqbCount");
            return (Criteria) this;
        }

        public Criteria andJqbCountLessThanOrEqualTo(Short value) {
            addCriterion("JQB_COUNT <=", value, "jqbCount");
            return (Criteria) this;
        }

        public Criteria andJqbCountIn(List<Short> values) {
            addCriterion("JQB_COUNT in", values, "jqbCount");
            return (Criteria) this;
        }

        public Criteria andJqbCountNotIn(List<Short> values) {
            addCriterion("JQB_COUNT not in", values, "jqbCount");
            return (Criteria) this;
        }

        public Criteria andJqbCountBetween(Short value1, Short value2) {
            addCriterion("JQB_COUNT between", value1, value2, "jqbCount");
            return (Criteria) this;
        }

        public Criteria andJqbCountNotBetween(Short value1, Short value2) {
            addCriterion("JQB_COUNT not between", value1, value2, "jqbCount");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountIsNull() {
            addCriterion("JPQQTZ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountIsNotNull() {
            addCriterion("JPQQTZ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountEqualTo(Short value) {
            addCriterion("JPQQTZ_COUNT =", value, "jpqqtzCount");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountNotEqualTo(Short value) {
            addCriterion("JPQQTZ_COUNT <>", value, "jpqqtzCount");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountGreaterThan(Short value) {
            addCriterion("JPQQTZ_COUNT >", value, "jpqqtzCount");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountGreaterThanOrEqualTo(Short value) {
            addCriterion("JPQQTZ_COUNT >=", value, "jpqqtzCount");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountLessThan(Short value) {
            addCriterion("JPQQTZ_COUNT <", value, "jpqqtzCount");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountLessThanOrEqualTo(Short value) {
            addCriterion("JPQQTZ_COUNT <=", value, "jpqqtzCount");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountIn(List<Short> values) {
            addCriterion("JPQQTZ_COUNT in", values, "jpqqtzCount");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountNotIn(List<Short> values) {
            addCriterion("JPQQTZ_COUNT not in", values, "jpqqtzCount");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountBetween(Short value1, Short value2) {
            addCriterion("JPQQTZ_COUNT between", value1, value2, "jpqqtzCount");
            return (Criteria) this;
        }

        public Criteria andJpqqtzCountNotBetween(Short value1, Short value2) {
            addCriterion("JPQQTZ_COUNT not between", value1, value2, "jpqqtzCount");
            return (Criteria) this;
        }

        public Criteria andHouzCountIsNull() {
            addCriterion("HOUZ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andHouzCountIsNotNull() {
            addCriterion("HOUZ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHouzCountEqualTo(Short value) {
            addCriterion("HOUZ_COUNT =", value, "houzCount");
            return (Criteria) this;
        }

        public Criteria andHouzCountNotEqualTo(Short value) {
            addCriterion("HOUZ_COUNT <>", value, "houzCount");
            return (Criteria) this;
        }

        public Criteria andHouzCountGreaterThan(Short value) {
            addCriterion("HOUZ_COUNT >", value, "houzCount");
            return (Criteria) this;
        }

        public Criteria andHouzCountGreaterThanOrEqualTo(Short value) {
            addCriterion("HOUZ_COUNT >=", value, "houzCount");
            return (Criteria) this;
        }

        public Criteria andHouzCountLessThan(Short value) {
            addCriterion("HOUZ_COUNT <", value, "houzCount");
            return (Criteria) this;
        }

        public Criteria andHouzCountLessThanOrEqualTo(Short value) {
            addCriterion("HOUZ_COUNT <=", value, "houzCount");
            return (Criteria) this;
        }

        public Criteria andHouzCountIn(List<Short> values) {
            addCriterion("HOUZ_COUNT in", values, "houzCount");
            return (Criteria) this;
        }

        public Criteria andHouzCountNotIn(List<Short> values) {
            addCriterion("HOUZ_COUNT not in", values, "houzCount");
            return (Criteria) this;
        }

        public Criteria andHouzCountBetween(Short value1, Short value2) {
            addCriterion("HOUZ_COUNT between", value1, value2, "houzCount");
            return (Criteria) this;
        }

        public Criteria andHouzCountNotBetween(Short value1, Short value2) {
            addCriterion("HOUZ_COUNT not between", value1, value2, "houzCount");
            return (Criteria) this;
        }

        public Criteria andHjmccCountIsNull() {
            addCriterion("HJMCC_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andHjmccCountIsNotNull() {
            addCriterion("HJMCC_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHjmccCountEqualTo(Short value) {
            addCriterion("HJMCC_COUNT =", value, "hjmccCount");
            return (Criteria) this;
        }

        public Criteria andHjmccCountNotEqualTo(Short value) {
            addCriterion("HJMCC_COUNT <>", value, "hjmccCount");
            return (Criteria) this;
        }

        public Criteria andHjmccCountGreaterThan(Short value) {
            addCriterion("HJMCC_COUNT >", value, "hjmccCount");
            return (Criteria) this;
        }

        public Criteria andHjmccCountGreaterThanOrEqualTo(Short value) {
            addCriterion("HJMCC_COUNT >=", value, "hjmccCount");
            return (Criteria) this;
        }

        public Criteria andHjmccCountLessThan(Short value) {
            addCriterion("HJMCC_COUNT <", value, "hjmccCount");
            return (Criteria) this;
        }

        public Criteria andHjmccCountLessThanOrEqualTo(Short value) {
            addCriterion("HJMCC_COUNT <=", value, "hjmccCount");
            return (Criteria) this;
        }

        public Criteria andHjmccCountIn(List<Short> values) {
            addCriterion("HJMCC_COUNT in", values, "hjmccCount");
            return (Criteria) this;
        }

        public Criteria andHjmccCountNotIn(List<Short> values) {
            addCriterion("HJMCC_COUNT not in", values, "hjmccCount");
            return (Criteria) this;
        }

        public Criteria andHjmccCountBetween(Short value1, Short value2) {
            addCriterion("HJMCC_COUNT between", value1, value2, "hjmccCount");
            return (Criteria) this;
        }

        public Criteria andHjmccCountNotBetween(Short value1, Short value2) {
            addCriterion("HJMCC_COUNT not between", value1, value2, "hjmccCount");
            return (Criteria) this;
        }

        public Criteria andGsqccCountIsNull() {
            addCriterion("GSQCC_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andGsqccCountIsNotNull() {
            addCriterion("GSQCC_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGsqccCountEqualTo(Short value) {
            addCriterion("GSQCC_COUNT =", value, "gsqccCount");
            return (Criteria) this;
        }

        public Criteria andGsqccCountNotEqualTo(Short value) {
            addCriterion("GSQCC_COUNT <>", value, "gsqccCount");
            return (Criteria) this;
        }

        public Criteria andGsqccCountGreaterThan(Short value) {
            addCriterion("GSQCC_COUNT >", value, "gsqccCount");
            return (Criteria) this;
        }

        public Criteria andGsqccCountGreaterThanOrEqualTo(Short value) {
            addCriterion("GSQCC_COUNT >=", value, "gsqccCount");
            return (Criteria) this;
        }

        public Criteria andGsqccCountLessThan(Short value) {
            addCriterion("GSQCC_COUNT <", value, "gsqccCount");
            return (Criteria) this;
        }

        public Criteria andGsqccCountLessThanOrEqualTo(Short value) {
            addCriterion("GSQCC_COUNT <=", value, "gsqccCount");
            return (Criteria) this;
        }

        public Criteria andGsqccCountIn(List<Short> values) {
            addCriterion("GSQCC_COUNT in", values, "gsqccCount");
            return (Criteria) this;
        }

        public Criteria andGsqccCountNotIn(List<Short> values) {
            addCriterion("GSQCC_COUNT not in", values, "gsqccCount");
            return (Criteria) this;
        }

        public Criteria andGsqccCountBetween(Short value1, Short value2) {
            addCriterion("GSQCC_COUNT between", value1, value2, "gsqccCount");
            return (Criteria) this;
        }

        public Criteria andGsqccCountNotBetween(Short value1, Short value2) {
            addCriterion("GSQCC_COUNT not between", value1, value2, "gsqccCount");
            return (Criteria) this;
        }

        public Criteria andEwyCountIsNull() {
            addCriterion("EWY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andEwyCountIsNotNull() {
            addCriterion("EWY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andEwyCountEqualTo(Short value) {
            addCriterion("EWY_COUNT =", value, "ewyCount");
            return (Criteria) this;
        }

        public Criteria andEwyCountNotEqualTo(Short value) {
            addCriterion("EWY_COUNT <>", value, "ewyCount");
            return (Criteria) this;
        }

        public Criteria andEwyCountGreaterThan(Short value) {
            addCriterion("EWY_COUNT >", value, "ewyCount");
            return (Criteria) this;
        }

        public Criteria andEwyCountGreaterThanOrEqualTo(Short value) {
            addCriterion("EWY_COUNT >=", value, "ewyCount");
            return (Criteria) this;
        }

        public Criteria andEwyCountLessThan(Short value) {
            addCriterion("EWY_COUNT <", value, "ewyCount");
            return (Criteria) this;
        }

        public Criteria andEwyCountLessThanOrEqualTo(Short value) {
            addCriterion("EWY_COUNT <=", value, "ewyCount");
            return (Criteria) this;
        }

        public Criteria andEwyCountIn(List<Short> values) {
            addCriterion("EWY_COUNT in", values, "ewyCount");
            return (Criteria) this;
        }

        public Criteria andEwyCountNotIn(List<Short> values) {
            addCriterion("EWY_COUNT not in", values, "ewyCount");
            return (Criteria) this;
        }

        public Criteria andEwyCountBetween(Short value1, Short value2) {
            addCriterion("EWY_COUNT between", value1, value2, "ewyCount");
            return (Criteria) this;
        }

        public Criteria andEwyCountNotBetween(Short value1, Short value2) {
            addCriterion("EWY_COUNT not between", value1, value2, "ewyCount");
            return (Criteria) this;
        }

        public Criteria andXtyCountIsNull() {
            addCriterion("XTY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andXtyCountIsNotNull() {
            addCriterion("XTY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andXtyCountEqualTo(Short value) {
            addCriterion("XTY_COUNT =", value, "xtyCount");
            return (Criteria) this;
        }

        public Criteria andXtyCountNotEqualTo(Short value) {
            addCriterion("XTY_COUNT <>", value, "xtyCount");
            return (Criteria) this;
        }

        public Criteria andXtyCountGreaterThan(Short value) {
            addCriterion("XTY_COUNT >", value, "xtyCount");
            return (Criteria) this;
        }

        public Criteria andXtyCountGreaterThanOrEqualTo(Short value) {
            addCriterion("XTY_COUNT >=", value, "xtyCount");
            return (Criteria) this;
        }

        public Criteria andXtyCountLessThan(Short value) {
            addCriterion("XTY_COUNT <", value, "xtyCount");
            return (Criteria) this;
        }

        public Criteria andXtyCountLessThanOrEqualTo(Short value) {
            addCriterion("XTY_COUNT <=", value, "xtyCount");
            return (Criteria) this;
        }

        public Criteria andXtyCountIn(List<Short> values) {
            addCriterion("XTY_COUNT in", values, "xtyCount");
            return (Criteria) this;
        }

        public Criteria andXtyCountNotIn(List<Short> values) {
            addCriterion("XTY_COUNT not in", values, "xtyCount");
            return (Criteria) this;
        }

        public Criteria andXtyCountBetween(Short value1, Short value2) {
            addCriterion("XTY_COUNT between", value1, value2, "xtyCount");
            return (Criteria) this;
        }

        public Criteria andXtyCountNotBetween(Short value1, Short value2) {
            addCriterion("XTY_COUNT not between", value1, value2, "xtyCount");
            return (Criteria) this;
        }

        public Criteria andXetzCountIsNull() {
            addCriterion("XETZ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andXetzCountIsNotNull() {
            addCriterion("XETZ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andXetzCountEqualTo(Short value) {
            addCriterion("XETZ_COUNT =", value, "xetzCount");
            return (Criteria) this;
        }

        public Criteria andXetzCountNotEqualTo(Short value) {
            addCriterion("XETZ_COUNT <>", value, "xetzCount");
            return (Criteria) this;
        }

        public Criteria andXetzCountGreaterThan(Short value) {
            addCriterion("XETZ_COUNT >", value, "xetzCount");
            return (Criteria) this;
        }

        public Criteria andXetzCountGreaterThanOrEqualTo(Short value) {
            addCriterion("XETZ_COUNT >=", value, "xetzCount");
            return (Criteria) this;
        }

        public Criteria andXetzCountLessThan(Short value) {
            addCriterion("XETZ_COUNT <", value, "xetzCount");
            return (Criteria) this;
        }

        public Criteria andXetzCountLessThanOrEqualTo(Short value) {
            addCriterion("XETZ_COUNT <=", value, "xetzCount");
            return (Criteria) this;
        }

        public Criteria andXetzCountIn(List<Short> values) {
            addCriterion("XETZ_COUNT in", values, "xetzCount");
            return (Criteria) this;
        }

        public Criteria andXetzCountNotIn(List<Short> values) {
            addCriterion("XETZ_COUNT not in", values, "xetzCount");
            return (Criteria) this;
        }

        public Criteria andXetzCountBetween(Short value1, Short value2) {
            addCriterion("XETZ_COUNT between", value1, value2, "xetzCount");
            return (Criteria) this;
        }

        public Criteria andXetzCountNotBetween(Short value1, Short value2) {
            addCriterion("XETZ_COUNT not between", value1, value2, "xetzCount");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountIsNull() {
            addCriterion("ZWXXDj_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountIsNotNull() {
            addCriterion("ZWXXDj_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountEqualTo(Short value) {
            addCriterion("ZWXXDj_COUNT =", value, "zwxxdjCount");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountNotEqualTo(Short value) {
            addCriterion("ZWXXDj_COUNT <>", value, "zwxxdjCount");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountGreaterThan(Short value) {
            addCriterion("ZWXXDj_COUNT >", value, "zwxxdjCount");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountGreaterThanOrEqualTo(Short value) {
            addCriterion("ZWXXDj_COUNT >=", value, "zwxxdjCount");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountLessThan(Short value) {
            addCriterion("ZWXXDj_COUNT <", value, "zwxxdjCount");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountLessThanOrEqualTo(Short value) {
            addCriterion("ZWXXDj_COUNT <=", value, "zwxxdjCount");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountIn(List<Short> values) {
            addCriterion("ZWXXDj_COUNT in", values, "zwxxdjCount");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountNotIn(List<Short> values) {
            addCriterion("ZWXXDj_COUNT not in", values, "zwxxdjCount");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountBetween(Short value1, Short value2) {
            addCriterion("ZWXXDj_COUNT between", value1, value2, "zwxxdjCount");
            return (Criteria) this;
        }

        public Criteria andZwxxdjCountNotBetween(Short value1, Short value2) {
            addCriterion("ZWXXDj_COUNT not between", value1, value2, "zwxxdjCount");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountIsNull() {
            addCriterion("CDWXDJ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountIsNotNull() {
            addCriterion("CDWXDJ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountEqualTo(Short value) {
            addCriterion("CDWXDJ_COUNT =", value, "cdwxdjCount");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountNotEqualTo(Short value) {
            addCriterion("CDWXDJ_COUNT <>", value, "cdwxdjCount");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountGreaterThan(Short value) {
            addCriterion("CDWXDJ_COUNT >", value, "cdwxdjCount");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountGreaterThanOrEqualTo(Short value) {
            addCriterion("CDWXDJ_COUNT >=", value, "cdwxdjCount");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountLessThan(Short value) {
            addCriterion("CDWXDJ_COUNT <", value, "cdwxdjCount");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountLessThanOrEqualTo(Short value) {
            addCriterion("CDWXDJ_COUNT <=", value, "cdwxdjCount");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountIn(List<Short> values) {
            addCriterion("CDWXDJ_COUNT in", values, "cdwxdjCount");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountNotIn(List<Short> values) {
            addCriterion("CDWXDJ_COUNT not in", values, "cdwxdjCount");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountBetween(Short value1, Short value2) {
            addCriterion("CDWXDJ_COUNT between", value1, value2, "cdwxdjCount");
            return (Criteria) this;
        }

        public Criteria andCdwxdjCountNotBetween(Short value1, Short value2) {
            addCriterion("CDWXDJ_COUNT not between", value1, value2, "cdwxdjCount");
            return (Criteria) this;
        }

        public Criteria andZybCountIsNull() {
            addCriterion("ZYB_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andZybCountIsNotNull() {
            addCriterion("ZYB_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andZybCountEqualTo(Short value) {
            addCriterion("ZYB_COUNT =", value, "zybCount");
            return (Criteria) this;
        }

        public Criteria andZybCountNotEqualTo(Short value) {
            addCriterion("ZYB_COUNT <>", value, "zybCount");
            return (Criteria) this;
        }

        public Criteria andZybCountGreaterThan(Short value) {
            addCriterion("ZYB_COUNT >", value, "zybCount");
            return (Criteria) this;
        }

        public Criteria andZybCountGreaterThanOrEqualTo(Short value) {
            addCriterion("ZYB_COUNT >=", value, "zybCount");
            return (Criteria) this;
        }

        public Criteria andZybCountLessThan(Short value) {
            addCriterion("ZYB_COUNT <", value, "zybCount");
            return (Criteria) this;
        }

        public Criteria andZybCountLessThanOrEqualTo(Short value) {
            addCriterion("ZYB_COUNT <=", value, "zybCount");
            return (Criteria) this;
        }

        public Criteria andZybCountIn(List<Short> values) {
            addCriterion("ZYB_COUNT in", values, "zybCount");
            return (Criteria) this;
        }

        public Criteria andZybCountNotIn(List<Short> values) {
            addCriterion("ZYB_COUNT not in", values, "zybCount");
            return (Criteria) this;
        }

        public Criteria andZybCountBetween(Short value1, Short value2) {
            addCriterion("ZYB_COUNT between", value1, value2, "zybCount");
            return (Criteria) this;
        }

        public Criteria andZybCountNotBetween(Short value1, Short value2) {
            addCriterion("ZYB_COUNT not between", value1, value2, "zybCount");
            return (Criteria) this;
        }

        public Criteria andPcCountIsNull() {
            addCriterion("PC_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPcCountIsNotNull() {
            addCriterion("PC_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPcCountEqualTo(Short value) {
            addCriterion("PC_COUNT =", value, "pcCount");
            return (Criteria) this;
        }

        public Criteria andPcCountNotEqualTo(Short value) {
            addCriterion("PC_COUNT <>", value, "pcCount");
            return (Criteria) this;
        }

        public Criteria andPcCountGreaterThan(Short value) {
            addCriterion("PC_COUNT >", value, "pcCount");
            return (Criteria) this;
        }

        public Criteria andPcCountGreaterThanOrEqualTo(Short value) {
            addCriterion("PC_COUNT >=", value, "pcCount");
            return (Criteria) this;
        }

        public Criteria andPcCountLessThan(Short value) {
            addCriterion("PC_COUNT <", value, "pcCount");
            return (Criteria) this;
        }

        public Criteria andPcCountLessThanOrEqualTo(Short value) {
            addCriterion("PC_COUNT <=", value, "pcCount");
            return (Criteria) this;
        }

        public Criteria andPcCountIn(List<Short> values) {
            addCriterion("PC_COUNT in", values, "pcCount");
            return (Criteria) this;
        }

        public Criteria andPcCountNotIn(List<Short> values) {
            addCriterion("PC_COUNT not in", values, "pcCount");
            return (Criteria) this;
        }

        public Criteria andPcCountBetween(Short value1, Short value2) {
            addCriterion("PC_COUNT between", value1, value2, "pcCount");
            return (Criteria) this;
        }

        public Criteria andPcCountNotBetween(Short value1, Short value2) {
            addCriterion("PC_COUNT not between", value1, value2, "pcCount");
            return (Criteria) this;
        }

        public Criteria andHhpcCountIsNull() {
            addCriterion("HHPC_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andHhpcCountIsNotNull() {
            addCriterion("HHPC_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHhpcCountEqualTo(Short value) {
            addCriterion("HHPC_COUNT =", value, "hhpcCount");
            return (Criteria) this;
        }

        public Criteria andHhpcCountNotEqualTo(Short value) {
            addCriterion("HHPC_COUNT <>", value, "hhpcCount");
            return (Criteria) this;
        }

        public Criteria andHhpcCountGreaterThan(Short value) {
            addCriterion("HHPC_COUNT >", value, "hhpcCount");
            return (Criteria) this;
        }

        public Criteria andHhpcCountGreaterThanOrEqualTo(Short value) {
            addCriterion("HHPC_COUNT >=", value, "hhpcCount");
            return (Criteria) this;
        }

        public Criteria andHhpcCountLessThan(Short value) {
            addCriterion("HHPC_COUNT <", value, "hhpcCount");
            return (Criteria) this;
        }

        public Criteria andHhpcCountLessThanOrEqualTo(Short value) {
            addCriterion("HHPC_COUNT <=", value, "hhpcCount");
            return (Criteria) this;
        }

        public Criteria andHhpcCountIn(List<Short> values) {
            addCriterion("HHPC_COUNT in", values, "hhpcCount");
            return (Criteria) this;
        }

        public Criteria andHhpcCountNotIn(List<Short> values) {
            addCriterion("HHPC_COUNT not in", values, "hhpcCount");
            return (Criteria) this;
        }

        public Criteria andHhpcCountBetween(Short value1, Short value2) {
            addCriterion("HHPC_COUNT between", value1, value2, "hhpcCount");
            return (Criteria) this;
        }

        public Criteria andHhpcCountNotBetween(Short value1, Short value2) {
            addCriterion("HHPC_COUNT not between", value1, value2, "hhpcCount");
            return (Criteria) this;
        }

        public Criteria andSygCountIsNull() {
            addCriterion("SYG_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andSygCountIsNotNull() {
            addCriterion("SYG_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSygCountEqualTo(Short value) {
            addCriterion("SYG_COUNT =", value, "sygCount");
            return (Criteria) this;
        }

        public Criteria andSygCountNotEqualTo(Short value) {
            addCriterion("SYG_COUNT <>", value, "sygCount");
            return (Criteria) this;
        }

        public Criteria andSygCountGreaterThan(Short value) {
            addCriterion("SYG_COUNT >", value, "sygCount");
            return (Criteria) this;
        }

        public Criteria andSygCountGreaterThanOrEqualTo(Short value) {
            addCriterion("SYG_COUNT >=", value, "sygCount");
            return (Criteria) this;
        }

        public Criteria andSygCountLessThan(Short value) {
            addCriterion("SYG_COUNT <", value, "sygCount");
            return (Criteria) this;
        }

        public Criteria andSygCountLessThanOrEqualTo(Short value) {
            addCriterion("SYG_COUNT <=", value, "sygCount");
            return (Criteria) this;
        }

        public Criteria andSygCountIn(List<Short> values) {
            addCriterion("SYG_COUNT in", values, "sygCount");
            return (Criteria) this;
        }

        public Criteria andSygCountNotIn(List<Short> values) {
            addCriterion("SYG_COUNT not in", values, "sygCount");
            return (Criteria) this;
        }

        public Criteria andSygCountBetween(Short value1, Short value2) {
            addCriterion("SYG_COUNT between", value1, value2, "sygCount");
            return (Criteria) this;
        }

        public Criteria andSygCountNotBetween(Short value1, Short value2) {
            addCriterion("SYG_COUNT not between", value1, value2, "sygCount");
            return (Criteria) this;
        }

        public Criteria andZtCountIsNull() {
            addCriterion("ZT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andZtCountIsNotNull() {
            addCriterion("ZT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andZtCountEqualTo(Short value) {
            addCriterion("ZT_COUNT =", value, "ztCount");
            return (Criteria) this;
        }

        public Criteria andZtCountNotEqualTo(Short value) {
            addCriterion("ZT_COUNT <>", value, "ztCount");
            return (Criteria) this;
        }

        public Criteria andZtCountGreaterThan(Short value) {
            addCriterion("ZT_COUNT >", value, "ztCount");
            return (Criteria) this;
        }

        public Criteria andZtCountGreaterThanOrEqualTo(Short value) {
            addCriterion("ZT_COUNT >=", value, "ztCount");
            return (Criteria) this;
        }

        public Criteria andZtCountLessThan(Short value) {
            addCriterion("ZT_COUNT <", value, "ztCount");
            return (Criteria) this;
        }

        public Criteria andZtCountLessThanOrEqualTo(Short value) {
            addCriterion("ZT_COUNT <=", value, "ztCount");
            return (Criteria) this;
        }

        public Criteria andZtCountIn(List<Short> values) {
            addCriterion("ZT_COUNT in", values, "ztCount");
            return (Criteria) this;
        }

        public Criteria andZtCountNotIn(List<Short> values) {
            addCriterion("ZT_COUNT not in", values, "ztCount");
            return (Criteria) this;
        }

        public Criteria andZtCountBetween(Short value1, Short value2) {
            addCriterion("ZT_COUNT between", value1, value2, "ztCount");
            return (Criteria) this;
        }

        public Criteria andZtCountNotBetween(Short value1, Short value2) {
            addCriterion("ZT_COUNT not between", value1, value2, "ztCount");
            return (Criteria) this;
        }

        public Criteria andQuiltCountIsNull() {
            addCriterion("QUILT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andQuiltCountIsNotNull() {
            addCriterion("QUILT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andQuiltCountEqualTo(Short value) {
            addCriterion("QUILT_COUNT =", value, "quiltCount");
            return (Criteria) this;
        }

        public Criteria andQuiltCountNotEqualTo(Short value) {
            addCriterion("QUILT_COUNT <>", value, "quiltCount");
            return (Criteria) this;
        }

        public Criteria andQuiltCountGreaterThan(Short value) {
            addCriterion("QUILT_COUNT >", value, "quiltCount");
            return (Criteria) this;
        }

        public Criteria andQuiltCountGreaterThanOrEqualTo(Short value) {
            addCriterion("QUILT_COUNT >=", value, "quiltCount");
            return (Criteria) this;
        }

        public Criteria andQuiltCountLessThan(Short value) {
            addCriterion("QUILT_COUNT <", value, "quiltCount");
            return (Criteria) this;
        }

        public Criteria andQuiltCountLessThanOrEqualTo(Short value) {
            addCriterion("QUILT_COUNT <=", value, "quiltCount");
            return (Criteria) this;
        }

        public Criteria andQuiltCountIn(List<Short> values) {
            addCriterion("QUILT_COUNT in", values, "quiltCount");
            return (Criteria) this;
        }

        public Criteria andQuiltCountNotIn(List<Short> values) {
            addCriterion("QUILT_COUNT not in", values, "quiltCount");
            return (Criteria) this;
        }

        public Criteria andQuiltCountBetween(Short value1, Short value2) {
            addCriterion("QUILT_COUNT between", value1, value2, "quiltCount");
            return (Criteria) this;
        }

        public Criteria andQuiltCountNotBetween(Short value1, Short value2) {
            addCriterion("QUILT_COUNT not between", value1, value2, "quiltCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountIsNull() {
            addCriterion("OTHER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andOtherCountIsNotNull() {
            addCriterion("OTHER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCountEqualTo(Short value) {
            addCriterion("OTHER_COUNT =", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountNotEqualTo(Short value) {
            addCriterion("OTHER_COUNT <>", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountGreaterThan(Short value) {
            addCriterion("OTHER_COUNT >", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountGreaterThanOrEqualTo(Short value) {
            addCriterion("OTHER_COUNT >=", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountLessThan(Short value) {
            addCriterion("OTHER_COUNT <", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountLessThanOrEqualTo(Short value) {
            addCriterion("OTHER_COUNT <=", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountIn(List<Short> values) {
            addCriterion("OTHER_COUNT in", values, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountNotIn(List<Short> values) {
            addCriterion("OTHER_COUNT not in", values, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountBetween(Short value1, Short value2) {
            addCriterion("OTHER_COUNT between", value1, value2, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountNotBetween(Short value1, Short value2) {
            addCriterion("OTHER_COUNT not between", value1, value2, "otherCount");
            return (Criteria) this;
        }

        public Criteria andVachar1IsNull() {
            addCriterion("VACHAR1 is null");
            return (Criteria) this;
        }

        public Criteria andVachar1IsNotNull() {
            addCriterion("VACHAR1 is not null");
            return (Criteria) this;
        }

        public Criteria andVachar1EqualTo(Short value) {
            addCriterion("VACHAR1 =", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1NotEqualTo(Short value) {
            addCriterion("VACHAR1 <>", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1GreaterThan(Short value) {
            addCriterion("VACHAR1 >", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1GreaterThanOrEqualTo(Short value) {
            addCriterion("VACHAR1 >=", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1LessThan(Short value) {
            addCriterion("VACHAR1 <", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1LessThanOrEqualTo(Short value) {
            addCriterion("VACHAR1 <=", value, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1In(List<Short> values) {
            addCriterion("VACHAR1 in", values, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1NotIn(List<Short> values) {
            addCriterion("VACHAR1 not in", values, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1Between(Short value1, Short value2) {
            addCriterion("VACHAR1 between", value1, value2, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar1NotBetween(Short value1, Short value2) {
            addCriterion("VACHAR1 not between", value1, value2, "vachar1");
            return (Criteria) this;
        }

        public Criteria andVachar2IsNull() {
            addCriterion("VACHAR2 is null");
            return (Criteria) this;
        }

        public Criteria andVachar2IsNotNull() {
            addCriterion("VACHAR2 is not null");
            return (Criteria) this;
        }

        public Criteria andVachar2EqualTo(Short value) {
            addCriterion("VACHAR2 =", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2NotEqualTo(Short value) {
            addCriterion("VACHAR2 <>", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2GreaterThan(Short value) {
            addCriterion("VACHAR2 >", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2GreaterThanOrEqualTo(Short value) {
            addCriterion("VACHAR2 >=", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2LessThan(Short value) {
            addCriterion("VACHAR2 <", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2LessThanOrEqualTo(Short value) {
            addCriterion("VACHAR2 <=", value, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2In(List<Short> values) {
            addCriterion("VACHAR2 in", values, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2NotIn(List<Short> values) {
            addCriterion("VACHAR2 not in", values, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2Between(Short value1, Short value2) {
            addCriterion("VACHAR2 between", value1, value2, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar2NotBetween(Short value1, Short value2) {
            addCriterion("VACHAR2 not between", value1, value2, "vachar2");
            return (Criteria) this;
        }

        public Criteria andVachar3IsNull() {
            addCriterion("VACHAR3 is null");
            return (Criteria) this;
        }

        public Criteria andVachar3IsNotNull() {
            addCriterion("VACHAR3 is not null");
            return (Criteria) this;
        }

        public Criteria andVachar3EqualTo(Short value) {
            addCriterion("VACHAR3 =", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3NotEqualTo(Short value) {
            addCriterion("VACHAR3 <>", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3GreaterThan(Short value) {
            addCriterion("VACHAR3 >", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3GreaterThanOrEqualTo(Short value) {
            addCriterion("VACHAR3 >=", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3LessThan(Short value) {
            addCriterion("VACHAR3 <", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3LessThanOrEqualTo(Short value) {
            addCriterion("VACHAR3 <=", value, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3In(List<Short> values) {
            addCriterion("VACHAR3 in", values, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3NotIn(List<Short> values) {
            addCriterion("VACHAR3 not in", values, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3Between(Short value1, Short value2) {
            addCriterion("VACHAR3 between", value1, value2, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar3NotBetween(Short value1, Short value2) {
            addCriterion("VACHAR3 not between", value1, value2, "vachar3");
            return (Criteria) this;
        }

        public Criteria andVachar4IsNull() {
            addCriterion("VACHAR4 is null");
            return (Criteria) this;
        }

        public Criteria andVachar4IsNotNull() {
            addCriterion("VACHAR4 is not null");
            return (Criteria) this;
        }

        public Criteria andVachar4EqualTo(Short value) {
            addCriterion("VACHAR4 =", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4NotEqualTo(Short value) {
            addCriterion("VACHAR4 <>", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4GreaterThan(Short value) {
            addCriterion("VACHAR4 >", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4GreaterThanOrEqualTo(Short value) {
            addCriterion("VACHAR4 >=", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4LessThan(Short value) {
            addCriterion("VACHAR4 <", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4LessThanOrEqualTo(Short value) {
            addCriterion("VACHAR4 <=", value, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4In(List<Short> values) {
            addCriterion("VACHAR4 in", values, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4NotIn(List<Short> values) {
            addCriterion("VACHAR4 not in", values, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4Between(Short value1, Short value2) {
            addCriterion("VACHAR4 between", value1, value2, "vachar4");
            return (Criteria) this;
        }

        public Criteria andVachar4NotBetween(Short value1, Short value2) {
            addCriterion("VACHAR4 not between", value1, value2, "vachar4");
            return (Criteria) this;
        }

        public Criteria andQmNbrIsNull() {
            addCriterion("QM_NBR is null");
            return (Criteria) this;
        }

        public Criteria andQmNbrIsNotNull() {
            addCriterion("QM_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andQmNbrEqualTo(String value) {
            addCriterion("QM_NBR =", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrNotEqualTo(String value) {
            addCriterion("QM_NBR <>", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrGreaterThan(String value) {
            addCriterion("QM_NBR >", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrGreaterThanOrEqualTo(String value) {
            addCriterion("QM_NBR >=", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrLessThan(String value) {
            addCriterion("QM_NBR <", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrLessThanOrEqualTo(String value) {
            addCriterion("QM_NBR <=", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrLike(String value) {
            addCriterion("QM_NBR like", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrNotLike(String value) {
            addCriterion("QM_NBR not like", value, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrIn(List<String> values) {
            addCriterion("QM_NBR in", values, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrNotIn(List<String> values) {
            addCriterion("QM_NBR not in", values, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrBetween(String value1, String value2) {
            addCriterion("QM_NBR between", value1, value2, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNbrNotBetween(String value1, String value2) {
            addCriterion("QM_NBR not between", value1, value2, "qmNbr");
            return (Criteria) this;
        }

        public Criteria andQmNamIsNull() {
            addCriterion("QM_NAM is null");
            return (Criteria) this;
        }

        public Criteria andQmNamIsNotNull() {
            addCriterion("QM_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andQmNamEqualTo(String value) {
            addCriterion("QM_NAM =", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamNotEqualTo(String value) {
            addCriterion("QM_NAM <>", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamGreaterThan(String value) {
            addCriterion("QM_NAM >", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamGreaterThanOrEqualTo(String value) {
            addCriterion("QM_NAM >=", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamLessThan(String value) {
            addCriterion("QM_NAM <", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamLessThanOrEqualTo(String value) {
            addCriterion("QM_NAM <=", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamLike(String value) {
            addCriterion("QM_NAM like", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamNotLike(String value) {
            addCriterion("QM_NAM not like", value, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamIn(List<String> values) {
            addCriterion("QM_NAM in", values, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamNotIn(List<String> values) {
            addCriterion("QM_NAM not in", values, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamBetween(String value1, String value2) {
            addCriterion("QM_NAM between", value1, value2, "qmNam");
            return (Criteria) this;
        }

        public Criteria andQmNamNotBetween(String value1, String value2) {
            addCriterion("QM_NAM not between", value1, value2, "qmNam");
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