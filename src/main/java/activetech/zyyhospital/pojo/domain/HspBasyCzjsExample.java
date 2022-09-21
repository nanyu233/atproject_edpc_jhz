package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspBasyCzjsExample {
    /**
     * ZJYY.HSP_BASY_CZJS
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_BASY_CZJS
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_BASY_CZJS
     */
    protected List<Criteria> oredCriteria;

    public HspBasyCzjsExample() {
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
     * ZJYY.HSP_BASY_CZJS 2020-07-08
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

        public Criteria andCzjsSeqIsNull() {
            addCriterion("CZJS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqIsNotNull() {
            addCriterion("CZJS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqEqualTo(String value) {
            addCriterion("CZJS_SEQ =", value, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqNotEqualTo(String value) {
            addCriterion("CZJS_SEQ <>", value, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqGreaterThan(String value) {
            addCriterion("CZJS_SEQ >", value, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqGreaterThanOrEqualTo(String value) {
            addCriterion("CZJS_SEQ >=", value, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqLessThan(String value) {
            addCriterion("CZJS_SEQ <", value, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqLessThanOrEqualTo(String value) {
            addCriterion("CZJS_SEQ <=", value, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqLike(String value) {
            addCriterion("CZJS_SEQ like", value, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqNotLike(String value) {
            addCriterion("CZJS_SEQ not like", value, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqIn(List<String> values) {
            addCriterion("CZJS_SEQ in", values, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqNotIn(List<String> values) {
            addCriterion("CZJS_SEQ not in", values, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqBetween(String value1, String value2) {
            addCriterion("CZJS_SEQ between", value1, value2, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andCzjsSeqNotBetween(String value1, String value2) {
            addCriterion("CZJS_SEQ not between", value1, value2, "czjsSeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqIsNull() {
            addCriterion("BASY_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBasySeqIsNotNull() {
            addCriterion("BASY_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBasySeqEqualTo(String value) {
            addCriterion("BASY_SEQ =", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqNotEqualTo(String value) {
            addCriterion("BASY_SEQ <>", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqGreaterThan(String value) {
            addCriterion("BASY_SEQ >", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqGreaterThanOrEqualTo(String value) {
            addCriterion("BASY_SEQ >=", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqLessThan(String value) {
            addCriterion("BASY_SEQ <", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqLessThanOrEqualTo(String value) {
            addCriterion("BASY_SEQ <=", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqLike(String value) {
            addCriterion("BASY_SEQ like", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqNotLike(String value) {
            addCriterion("BASY_SEQ not like", value, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqIn(List<String> values) {
            addCriterion("BASY_SEQ in", values, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqNotIn(List<String> values) {
            addCriterion("BASY_SEQ not in", values, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqBetween(String value1, String value2) {
            addCriterion("BASY_SEQ between", value1, value2, "basySeq");
            return (Criteria) this;
        }

        public Criteria andBasySeqNotBetween(String value1, String value2) {
            addCriterion("BASY_SEQ not between", value1, value2, "basySeq");
            return (Criteria) this;
        }

        public Criteria andInfocodeIsNull() {
            addCriterion("INFOCODE is null");
            return (Criteria) this;
        }

        public Criteria andInfocodeIsNotNull() {
            addCriterion("INFOCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInfocodeEqualTo(String value) {
            addCriterion("INFOCODE =", value, "infocode");
            return (Criteria) this;
        }

        public Criteria andInfocodeNotEqualTo(String value) {
            addCriterion("INFOCODE <>", value, "infocode");
            return (Criteria) this;
        }

        public Criteria andInfocodeGreaterThan(String value) {
            addCriterion("INFOCODE >", value, "infocode");
            return (Criteria) this;
        }

        public Criteria andInfocodeGreaterThanOrEqualTo(String value) {
            addCriterion("INFOCODE >=", value, "infocode");
            return (Criteria) this;
        }

        public Criteria andInfocodeLessThan(String value) {
            addCriterion("INFOCODE <", value, "infocode");
            return (Criteria) this;
        }

        public Criteria andInfocodeLessThanOrEqualTo(String value) {
            addCriterion("INFOCODE <=", value, "infocode");
            return (Criteria) this;
        }

        public Criteria andInfocodeLike(String value) {
            addCriterion("INFOCODE like", value, "infocode");
            return (Criteria) this;
        }

        public Criteria andInfocodeNotLike(String value) {
            addCriterion("INFOCODE not like", value, "infocode");
            return (Criteria) this;
        }

        public Criteria andInfocodeIn(List<String> values) {
            addCriterion("INFOCODE in", values, "infocode");
            return (Criteria) this;
        }

        public Criteria andInfocodeNotIn(List<String> values) {
            addCriterion("INFOCODE not in", values, "infocode");
            return (Criteria) this;
        }

        public Criteria andInfocodeBetween(String value1, String value2) {
            addCriterion("INFOCODE between", value1, value2, "infocode");
            return (Criteria) this;
        }

        public Criteria andInfocodeNotBetween(String value1, String value2) {
            addCriterion("INFOCODE not between", value1, value2, "infocode");
            return (Criteria) this;
        }

        public Criteria andDocNoIsNull() {
            addCriterion("DOC_NO is null");
            return (Criteria) this;
        }

        public Criteria andDocNoIsNotNull() {
            addCriterion("DOC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDocNoEqualTo(String value) {
            addCriterion("DOC_NO =", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotEqualTo(String value) {
            addCriterion("DOC_NO <>", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoGreaterThan(String value) {
            addCriterion("DOC_NO >", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_NO >=", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLessThan(String value) {
            addCriterion("DOC_NO <", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLessThanOrEqualTo(String value) {
            addCriterion("DOC_NO <=", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLike(String value) {
            addCriterion("DOC_NO like", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotLike(String value) {
            addCriterion("DOC_NO not like", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoIn(List<String> values) {
            addCriterion("DOC_NO in", values, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotIn(List<String> values) {
            addCriterion("DOC_NO not in", values, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoBetween(String value1, String value2) {
            addCriterion("DOC_NO between", value1, value2, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotBetween(String value1, String value2) {
            addCriterion("DOC_NO not between", value1, value2, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNamIsNull() {
            addCriterion("DOC_NAM is null");
            return (Criteria) this;
        }

        public Criteria andDocNamIsNotNull() {
            addCriterion("DOC_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andDocNamEqualTo(String value) {
            addCriterion("DOC_NAM =", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotEqualTo(String value) {
            addCriterion("DOC_NAM <>", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamGreaterThan(String value) {
            addCriterion("DOC_NAM >", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_NAM >=", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamLessThan(String value) {
            addCriterion("DOC_NAM <", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamLessThanOrEqualTo(String value) {
            addCriterion("DOC_NAM <=", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamLike(String value) {
            addCriterion("DOC_NAM like", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotLike(String value) {
            addCriterion("DOC_NAM not like", value, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamIn(List<String> values) {
            addCriterion("DOC_NAM in", values, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotIn(List<String> values) {
            addCriterion("DOC_NAM not in", values, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamBetween(String value1, String value2) {
            addCriterion("DOC_NAM between", value1, value2, "docNam");
            return (Criteria) this;
        }

        public Criteria andDocNamNotBetween(String value1, String value2) {
            addCriterion("DOC_NAM not between", value1, value2, "docNam");
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

        public Criteria andCrtUsrNoIsNull() {
            addCriterion("CRT_USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoIsNotNull() {
            addCriterion("CRT_USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoEqualTo(String value) {
            addCriterion("CRT_USR_NO =", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotEqualTo(String value) {
            addCriterion("CRT_USR_NO <>", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoGreaterThan(String value) {
            addCriterion("CRT_USR_NO >", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NO >=", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLessThan(String value) {
            addCriterion("CRT_USR_NO <", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NO <=", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoLike(String value) {
            addCriterion("CRT_USR_NO like", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotLike(String value) {
            addCriterion("CRT_USR_NO not like", value, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoIn(List<String> values) {
            addCriterion("CRT_USR_NO in", values, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotIn(List<String> values) {
            addCriterion("CRT_USR_NO not in", values, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoBetween(String value1, String value2) {
            addCriterion("CRT_USR_NO between", value1, value2, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNoNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_NO not between", value1, value2, "crtUsrNo");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamIsNull() {
            addCriterion("CRT_USR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamIsNotNull() {
            addCriterion("CRT_USR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamEqualTo(String value) {
            addCriterion("CRT_USR_NAM =", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamNotEqualTo(String value) {
            addCriterion("CRT_USR_NAM <>", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamGreaterThan(String value) {
            addCriterion("CRT_USR_NAM >", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NAM >=", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamLessThan(String value) {
            addCriterion("CRT_USR_NAM <", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NAM <=", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamLike(String value) {
            addCriterion("CRT_USR_NAM like", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamNotLike(String value) {
            addCriterion("CRT_USR_NAM not like", value, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamIn(List<String> values) {
            addCriterion("CRT_USR_NAM in", values, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamNotIn(List<String> values) {
            addCriterion("CRT_USR_NAM not in", values, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamBetween(String value1, String value2) {
            addCriterion("CRT_USR_NAM between", value1, value2, "crtUsrNam");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNamNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_NAM not between", value1, value2, "crtUsrNam");
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

        public Criteria andUpdUsrNoIsNull() {
            addCriterion("UPD_USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoIsNotNull() {
            addCriterion("UPD_USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoEqualTo(String value) {
            addCriterion("UPD_USR_NO =", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotEqualTo(String value) {
            addCriterion("UPD_USR_NO <>", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoGreaterThan(String value) {
            addCriterion("UPD_USR_NO >", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NO >=", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoLessThan(String value) {
            addCriterion("UPD_USR_NO <", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoLessThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NO <=", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoLike(String value) {
            addCriterion("UPD_USR_NO like", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotLike(String value) {
            addCriterion("UPD_USR_NO not like", value, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoIn(List<String> values) {
            addCriterion("UPD_USR_NO in", values, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotIn(List<String> values) {
            addCriterion("UPD_USR_NO not in", values, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoBetween(String value1, String value2) {
            addCriterion("UPD_USR_NO between", value1, value2, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNoNotBetween(String value1, String value2) {
            addCriterion("UPD_USR_NO not between", value1, value2, "updUsrNo");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamIsNull() {
            addCriterion("UPD_USR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamIsNotNull() {
            addCriterion("UPD_USR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamEqualTo(String value) {
            addCriterion("UPD_USR_NAM =", value, "updUsrNam");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamNotEqualTo(String value) {
            addCriterion("UPD_USR_NAM <>", value, "updUsrNam");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamGreaterThan(String value) {
            addCriterion("UPD_USR_NAM >", value, "updUsrNam");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NAM >=", value, "updUsrNam");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamLessThan(String value) {
            addCriterion("UPD_USR_NAM <", value, "updUsrNam");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamLessThanOrEqualTo(String value) {
            addCriterion("UPD_USR_NAM <=", value, "updUsrNam");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamLike(String value) {
            addCriterion("UPD_USR_NAM like", value, "updUsrNam");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamNotLike(String value) {
            addCriterion("UPD_USR_NAM not like", value, "updUsrNam");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamIn(List<String> values) {
            addCriterion("UPD_USR_NAM in", values, "updUsrNam");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamNotIn(List<String> values) {
            addCriterion("UPD_USR_NAM not in", values, "updUsrNam");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamBetween(String value1, String value2) {
            addCriterion("UPD_USR_NAM between", value1, value2, "updUsrNam");
            return (Criteria) this;
        }

        public Criteria andUpdUsrNamNotBetween(String value1, String value2) {
            addCriterion("UPD_USR_NAM not between", value1, value2, "updUsrNam");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_BASY_CZJS
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_BASY_CZJS 2020-07-08
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