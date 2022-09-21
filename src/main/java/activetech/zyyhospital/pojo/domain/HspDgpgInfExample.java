package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HspDgpgInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDgpgInfExample() {
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

        public Criteria andDgpgJmdgFlgIsNull() {
            addCriterion("DGPG_JMDG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgIsNotNull() {
            addCriterion("DGPG_JMDG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgEqualTo(String value) {
            addCriterion("DGPG_JMDG_FLG =", value, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgNotEqualTo(String value) {
            addCriterion("DGPG_JMDG_FLG <>", value, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgGreaterThan(String value) {
            addCriterion("DGPG_JMDG_FLG >", value, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("DGPG_JMDG_FLG >=", value, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgLessThan(String value) {
            addCriterion("DGPG_JMDG_FLG <", value, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgLessThanOrEqualTo(String value) {
            addCriterion("DGPG_JMDG_FLG <=", value, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgLike(String value) {
            addCriterion("DGPG_JMDG_FLG like", value, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgNotLike(String value) {
            addCriterion("DGPG_JMDG_FLG not like", value, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgIn(List<String> values) {
            addCriterion("DGPG_JMDG_FLG in", values, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgNotIn(List<String> values) {
            addCriterion("DGPG_JMDG_FLG not in", values, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgBetween(String value1, String value2) {
            addCriterion("DGPG_JMDG_FLG between", value1, value2, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgJmdgFlgNotBetween(String value1, String value2) {
            addCriterion("DGPG_JMDG_FLG not between", value1, value2, "dgpgJmdgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgIsNull() {
            addCriterion("WZJM_TC_FLG is null");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgIsNotNull() {
            addCriterion("WZJM_TC_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgEqualTo(String value) {
            addCriterion("WZJM_TC_FLG =", value, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgNotEqualTo(String value) {
            addCriterion("WZJM_TC_FLG <>", value, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgGreaterThan(String value) {
            addCriterion("WZJM_TC_FLG >", value, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgGreaterThanOrEqualTo(String value) {
            addCriterion("WZJM_TC_FLG >=", value, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgLessThan(String value) {
            addCriterion("WZJM_TC_FLG <", value, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgLessThanOrEqualTo(String value) {
            addCriterion("WZJM_TC_FLG <=", value, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgLike(String value) {
            addCriterion("WZJM_TC_FLG like", value, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgNotLike(String value) {
            addCriterion("WZJM_TC_FLG not like", value, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgIn(List<String> values) {
            addCriterion("WZJM_TC_FLG in", values, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgNotIn(List<String> values) {
            addCriterion("WZJM_TC_FLG not in", values, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgBetween(String value1, String value2) {
            addCriterion("WZJM_TC_FLG between", value1, value2, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmTcFlgNotBetween(String value1, String value2) {
            addCriterion("WZJM_TC_FLG not between", value1, value2, "wzjmTcFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyIsNull() {
            addCriterion("WZJM_JWBYY is null");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyIsNotNull() {
            addCriterion("WZJM_JWBYY is not null");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyEqualTo(String value) {
            addCriterion("WZJM_JWBYY =", value, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyNotEqualTo(String value) {
            addCriterion("WZJM_JWBYY <>", value, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyGreaterThan(String value) {
            addCriterion("WZJM_JWBYY >", value, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyGreaterThanOrEqualTo(String value) {
            addCriterion("WZJM_JWBYY >=", value, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyLessThan(String value) {
            addCriterion("WZJM_JWBYY <", value, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyLessThanOrEqualTo(String value) {
            addCriterion("WZJM_JWBYY <=", value, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyLike(String value) {
            addCriterion("WZJM_JWBYY like", value, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyNotLike(String value) {
            addCriterion("WZJM_JWBYY not like", value, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyIn(List<String> values) {
            addCriterion("WZJM_JWBYY in", values, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyNotIn(List<String> values) {
            addCriterion("WZJM_JWBYY not in", values, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyBetween(String value1, String value2) {
            addCriterion("WZJM_JWBYY between", value1, value2, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmJwbyyNotBetween(String value1, String value2) {
            addCriterion("WZJM_JWBYY not between", value1, value2, "wzjmJwbyy");
            return (Criteria) this;
        }

        public Criteria andWzjmSdIsNull() {
            addCriterion("WZJM_SD is null");
            return (Criteria) this;
        }

        public Criteria andWzjmSdIsNotNull() {
            addCriterion("WZJM_SD is not null");
            return (Criteria) this;
        }

        public Criteria andWzjmSdEqualTo(String value) {
            addCriterion("WZJM_SD =", value, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmSdNotEqualTo(String value) {
            addCriterion("WZJM_SD <>", value, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmSdGreaterThan(String value) {
            addCriterion("WZJM_SD >", value, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmSdGreaterThanOrEqualTo(String value) {
            addCriterion("WZJM_SD >=", value, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmSdLessThan(String value) {
            addCriterion("WZJM_SD <", value, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmSdLessThanOrEqualTo(String value) {
            addCriterion("WZJM_SD <=", value, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmSdLike(String value) {
            addCriterion("WZJM_SD like", value, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmSdNotLike(String value) {
            addCriterion("WZJM_SD not like", value, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmSdIn(List<String> values) {
            addCriterion("WZJM_SD in", values, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmSdNotIn(List<String> values) {
            addCriterion("WZJM_SD not in", values, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmSdBetween(String value1, String value2) {
            addCriterion("WZJM_SD between", value1, value2, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmSdNotBetween(String value1, String value2) {
            addCriterion("WZJM_SD not between", value1, value2, "wzjmSd");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgIsNull() {
            addCriterion("WZJM_GRJX_FLG is null");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgIsNotNull() {
            addCriterion("WZJM_GRJX_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgEqualTo(String value) {
            addCriterion("WZJM_GRJX_FLG =", value, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgNotEqualTo(String value) {
            addCriterion("WZJM_GRJX_FLG <>", value, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgGreaterThan(String value) {
            addCriterion("WZJM_GRJX_FLG >", value, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgGreaterThanOrEqualTo(String value) {
            addCriterion("WZJM_GRJX_FLG >=", value, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgLessThan(String value) {
            addCriterion("WZJM_GRJX_FLG <", value, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgLessThanOrEqualTo(String value) {
            addCriterion("WZJM_GRJX_FLG <=", value, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgLike(String value) {
            addCriterion("WZJM_GRJX_FLG like", value, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgNotLike(String value) {
            addCriterion("WZJM_GRJX_FLG not like", value, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgIn(List<String> values) {
            addCriterion("WZJM_GRJX_FLG in", values, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgNotIn(List<String> values) {
            addCriterion("WZJM_GRJX_FLG not in", values, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgBetween(String value1, String value2) {
            addCriterion("WZJM_GRJX_FLG between", value1, value2, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmGrjxFlgNotBetween(String value1, String value2) {
            addCriterion("WZJM_GRJX_FLG not between", value1, value2, "wzjmGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgIsNull() {
            addCriterion("WZJM_SFBG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgIsNotNull() {
            addCriterion("WZJM_SFBG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgEqualTo(String value) {
            addCriterion("WZJM_SFBG_FLG =", value, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgNotEqualTo(String value) {
            addCriterion("WZJM_SFBG_FLG <>", value, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgGreaterThan(String value) {
            addCriterion("WZJM_SFBG_FLG >", value, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("WZJM_SFBG_FLG >=", value, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgLessThan(String value) {
            addCriterion("WZJM_SFBG_FLG <", value, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgLessThanOrEqualTo(String value) {
            addCriterion("WZJM_SFBG_FLG <=", value, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgLike(String value) {
            addCriterion("WZJM_SFBG_FLG like", value, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgNotLike(String value) {
            addCriterion("WZJM_SFBG_FLG not like", value, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgIn(List<String> values) {
            addCriterion("WZJM_SFBG_FLG in", values, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgNotIn(List<String> values) {
            addCriterion("WZJM_SFBG_FLG not in", values, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgBetween(String value1, String value2) {
            addCriterion("WZJM_SFBG_FLG between", value1, value2, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmSfbgFlgNotBetween(String value1, String value2) {
            addCriterion("WZJM_SFBG_FLG not between", value1, value2, "wzjmSfbgFlg");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoIsNull() {
            addCriterion("WZJM_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoIsNotNull() {
            addCriterion("WZJM_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoEqualTo(String value) {
            addCriterion("WZJM_MEMO =", value, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoNotEqualTo(String value) {
            addCriterion("WZJM_MEMO <>", value, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoGreaterThan(String value) {
            addCriterion("WZJM_MEMO >", value, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoGreaterThanOrEqualTo(String value) {
            addCriterion("WZJM_MEMO >=", value, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoLessThan(String value) {
            addCriterion("WZJM_MEMO <", value, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoLessThanOrEqualTo(String value) {
            addCriterion("WZJM_MEMO <=", value, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoLike(String value) {
            addCriterion("WZJM_MEMO like", value, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoNotLike(String value) {
            addCriterion("WZJM_MEMO not like", value, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoIn(List<String> values) {
            addCriterion("WZJM_MEMO in", values, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoNotIn(List<String> values) {
            addCriterion("WZJM_MEMO not in", values, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoBetween(String value1, String value2) {
            addCriterion("WZJM_MEMO between", value1, value2, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmMemoNotBetween(String value1, String value2) {
            addCriterion("WZJM_MEMO not between", value1, value2, "wzjmMemo");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodIsNull() {
            addCriterion("CVC_DGPG_CCTJ_COD is null");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodIsNotNull() {
            addCriterion("CVC_DGPG_CCTJ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodEqualTo(String value) {
            addCriterion("CVC_DGPG_CCTJ_COD =", value, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodNotEqualTo(String value) {
            addCriterion("CVC_DGPG_CCTJ_COD <>", value, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodGreaterThan(String value) {
            addCriterion("CVC_DGPG_CCTJ_COD >", value, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodGreaterThanOrEqualTo(String value) {
            addCriterion("CVC_DGPG_CCTJ_COD >=", value, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodLessThan(String value) {
            addCriterion("CVC_DGPG_CCTJ_COD <", value, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodLessThanOrEqualTo(String value) {
            addCriterion("CVC_DGPG_CCTJ_COD <=", value, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodLike(String value) {
            addCriterion("CVC_DGPG_CCTJ_COD like", value, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodNotLike(String value) {
            addCriterion("CVC_DGPG_CCTJ_COD not like", value, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodIn(List<String> values) {
            addCriterion("CVC_DGPG_CCTJ_COD in", values, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodNotIn(List<String> values) {
            addCriterion("CVC_DGPG_CCTJ_COD not in", values, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodBetween(String value1, String value2) {
            addCriterion("CVC_DGPG_CCTJ_COD between", value1, value2, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgpgCctjCodNotBetween(String value1, String value2) {
            addCriterion("CVC_DGPG_CCTJ_COD not between", value1, value2, "cvcDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodIsNull() {
            addCriterion("CVC_DGXH_COD is null");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodIsNotNull() {
            addCriterion("CVC_DGXH_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodEqualTo(String value) {
            addCriterion("CVC_DGXH_COD =", value, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodNotEqualTo(String value) {
            addCriterion("CVC_DGXH_COD <>", value, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodGreaterThan(String value) {
            addCriterion("CVC_DGXH_COD >", value, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodGreaterThanOrEqualTo(String value) {
            addCriterion("CVC_DGXH_COD >=", value, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodLessThan(String value) {
            addCriterion("CVC_DGXH_COD <", value, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodLessThanOrEqualTo(String value) {
            addCriterion("CVC_DGXH_COD <=", value, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodLike(String value) {
            addCriterion("CVC_DGXH_COD like", value, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodNotLike(String value) {
            addCriterion("CVC_DGXH_COD not like", value, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodIn(List<String> values) {
            addCriterion("CVC_DGXH_COD in", values, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodNotIn(List<String> values) {
            addCriterion("CVC_DGXH_COD not in", values, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodBetween(String value1, String value2) {
            addCriterion("CVC_DGXH_COD between", value1, value2, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcDgxhCodNotBetween(String value1, String value2) {
            addCriterion("CVC_DGXH_COD not between", value1, value2, "cvcDgxhCod");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdIsNull() {
            addCriterion("CVC_ZGSD is null");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdIsNotNull() {
            addCriterion("CVC_ZGSD is not null");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdEqualTo(String value) {
            addCriterion("CVC_ZGSD =", value, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdNotEqualTo(String value) {
            addCriterion("CVC_ZGSD <>", value, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdGreaterThan(String value) {
            addCriterion("CVC_ZGSD >", value, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdGreaterThanOrEqualTo(String value) {
            addCriterion("CVC_ZGSD >=", value, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdLessThan(String value) {
            addCriterion("CVC_ZGSD <", value, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdLessThanOrEqualTo(String value) {
            addCriterion("CVC_ZGSD <=", value, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdLike(String value) {
            addCriterion("CVC_ZGSD like", value, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdNotLike(String value) {
            addCriterion("CVC_ZGSD not like", value, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdIn(List<String> values) {
            addCriterion("CVC_ZGSD in", values, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdNotIn(List<String> values) {
            addCriterion("CVC_ZGSD not in", values, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdBetween(String value1, String value2) {
            addCriterion("CVC_ZGSD between", value1, value2, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcZgsdNotBetween(String value1, String value2) {
            addCriterion("CVC_ZGSD not between", value1, value2, "cvcZgsd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyIsNull() {
            addCriterion("CVC_JWBYY is null");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyIsNotNull() {
            addCriterion("CVC_JWBYY is not null");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyEqualTo(String value) {
            addCriterion("CVC_JWBYY =", value, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyNotEqualTo(String value) {
            addCriterion("CVC_JWBYY <>", value, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyGreaterThan(String value) {
            addCriterion("CVC_JWBYY >", value, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyGreaterThanOrEqualTo(String value) {
            addCriterion("CVC_JWBYY >=", value, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyLessThan(String value) {
            addCriterion("CVC_JWBYY <", value, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyLessThanOrEqualTo(String value) {
            addCriterion("CVC_JWBYY <=", value, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyLike(String value) {
            addCriterion("CVC_JWBYY like", value, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyNotLike(String value) {
            addCriterion("CVC_JWBYY not like", value, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyIn(List<String> values) {
            addCriterion("CVC_JWBYY in", values, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyNotIn(List<String> values) {
            addCriterion("CVC_JWBYY not in", values, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyBetween(String value1, String value2) {
            addCriterion("CVC_JWBYY between", value1, value2, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyyNotBetween(String value1, String value2) {
            addCriterion("CVC_JWBYY not between", value1, value2, "cvcJwbyy");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdIsNull() {
            addCriterion("CVC_JWBYY_SD is null");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdIsNotNull() {
            addCriterion("CVC_JWBYY_SD is not null");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdEqualTo(String value) {
            addCriterion("CVC_JWBYY_SD =", value, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdNotEqualTo(String value) {
            addCriterion("CVC_JWBYY_SD <>", value, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdGreaterThan(String value) {
            addCriterion("CVC_JWBYY_SD >", value, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdGreaterThanOrEqualTo(String value) {
            addCriterion("CVC_JWBYY_SD >=", value, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdLessThan(String value) {
            addCriterion("CVC_JWBYY_SD <", value, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdLessThanOrEqualTo(String value) {
            addCriterion("CVC_JWBYY_SD <=", value, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdLike(String value) {
            addCriterion("CVC_JWBYY_SD like", value, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdNotLike(String value) {
            addCriterion("CVC_JWBYY_SD not like", value, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdIn(List<String> values) {
            addCriterion("CVC_JWBYY_SD in", values, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdNotIn(List<String> values) {
            addCriterion("CVC_JWBYY_SD not in", values, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdBetween(String value1, String value2) {
            addCriterion("CVC_JWBYY_SD between", value1, value2, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcJwbyySdNotBetween(String value1, String value2) {
            addCriterion("CVC_JWBYY_SD not between", value1, value2, "cvcJwbyySd");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgIsNull() {
            addCriterion("CVC_GRJX_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgIsNotNull() {
            addCriterion("CVC_GRJX_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgEqualTo(String value) {
            addCriterion("CVC_GRJX_FLG =", value, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgNotEqualTo(String value) {
            addCriterion("CVC_GRJX_FLG <>", value, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgGreaterThan(String value) {
            addCriterion("CVC_GRJX_FLG >", value, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgGreaterThanOrEqualTo(String value) {
            addCriterion("CVC_GRJX_FLG >=", value, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgLessThan(String value) {
            addCriterion("CVC_GRJX_FLG <", value, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgLessThanOrEqualTo(String value) {
            addCriterion("CVC_GRJX_FLG <=", value, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgLike(String value) {
            addCriterion("CVC_GRJX_FLG like", value, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgNotLike(String value) {
            addCriterion("CVC_GRJX_FLG not like", value, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgIn(List<String> values) {
            addCriterion("CVC_GRJX_FLG in", values, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgNotIn(List<String> values) {
            addCriterion("CVC_GRJX_FLG not in", values, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgBetween(String value1, String value2) {
            addCriterion("CVC_GRJX_FLG between", value1, value2, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcGrjxFlgNotBetween(String value1, String value2) {
            addCriterion("CVC_GRJX_FLG not between", value1, value2, "cvcGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgIsNull() {
            addCriterion("CVC_HY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgIsNotNull() {
            addCriterion("CVC_HY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgEqualTo(String value) {
            addCriterion("CVC_HY_FLG =", value, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgNotEqualTo(String value) {
            addCriterion("CVC_HY_FLG <>", value, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgGreaterThan(String value) {
            addCriterion("CVC_HY_FLG >", value, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("CVC_HY_FLG >=", value, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgLessThan(String value) {
            addCriterion("CVC_HY_FLG <", value, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgLessThanOrEqualTo(String value) {
            addCriterion("CVC_HY_FLG <=", value, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgLike(String value) {
            addCriterion("CVC_HY_FLG like", value, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgNotLike(String value) {
            addCriterion("CVC_HY_FLG not like", value, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgIn(List<String> values) {
            addCriterion("CVC_HY_FLG in", values, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgNotIn(List<String> values) {
            addCriterion("CVC_HY_FLG not in", values, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgBetween(String value1, String value2) {
            addCriterion("CVC_HY_FLG between", value1, value2, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcHyFlgNotBetween(String value1, String value2) {
            addCriterion("CVC_HY_FLG not between", value1, value2, "cvcHyFlg");
            return (Criteria) this;
        }

        public Criteria andCvcMemoIsNull() {
            addCriterion("CVC_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andCvcMemoIsNotNull() {
            addCriterion("CVC_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andCvcMemoEqualTo(String value) {
            addCriterion("CVC_MEMO =", value, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andCvcMemoNotEqualTo(String value) {
            addCriterion("CVC_MEMO <>", value, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andCvcMemoGreaterThan(String value) {
            addCriterion("CVC_MEMO >", value, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andCvcMemoGreaterThanOrEqualTo(String value) {
            addCriterion("CVC_MEMO >=", value, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andCvcMemoLessThan(String value) {
            addCriterion("CVC_MEMO <", value, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andCvcMemoLessThanOrEqualTo(String value) {
            addCriterion("CVC_MEMO <=", value, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andCvcMemoLike(String value) {
            addCriterion("CVC_MEMO like", value, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andCvcMemoNotLike(String value) {
            addCriterion("CVC_MEMO not like", value, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andCvcMemoIn(List<String> values) {
            addCriterion("CVC_MEMO in", values, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andCvcMemoNotIn(List<String> values) {
            addCriterion("CVC_MEMO not in", values, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andCvcMemoBetween(String value1, String value2) {
            addCriterion("CVC_MEMO between", value1, value2, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andCvcMemoNotBetween(String value1, String value2) {
            addCriterion("CVC_MEMO not between", value1, value2, "cvcMemo");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhIsNull() {
            addCriterion("PICC_DGXH is null");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhIsNotNull() {
            addCriterion("PICC_DGXH is not null");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhEqualTo(String value) {
            addCriterion("PICC_DGXH =", value, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNotEqualTo(String value) {
            addCriterion("PICC_DGXH <>", value, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhGreaterThan(String value) {
            addCriterion("PICC_DGXH >", value, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhGreaterThanOrEqualTo(String value) {
            addCriterion("PICC_DGXH >=", value, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhLessThan(String value) {
            addCriterion("PICC_DGXH <", value, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhLessThanOrEqualTo(String value) {
            addCriterion("PICC_DGXH <=", value, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhLike(String value) {
            addCriterion("PICC_DGXH like", value, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNotLike(String value) {
            addCriterion("PICC_DGXH not like", value, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhIn(List<String> values) {
            addCriterion("PICC_DGXH in", values, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNotIn(List<String> values) {
            addCriterion("PICC_DGXH not in", values, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhBetween(String value1, String value2) {
            addCriterion("PICC_DGXH between", value1, value2, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNotBetween(String value1, String value2) {
            addCriterion("PICC_DGXH not between", value1, value2, "piccDgxh");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzIsNull() {
            addCriterion("PICC_DGXH_NZ is null");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzIsNotNull() {
            addCriterion("PICC_DGXH_NZ is not null");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzEqualTo(BigDecimal value) {
            addCriterion("PICC_DGXH_NZ =", value, "piccDgxhNz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzNotEqualTo(BigDecimal value) {
            addCriterion("PICC_DGXH_NZ <>", value, "piccDgxhNz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzGreaterThan(BigDecimal value) {
            addCriterion("PICC_DGXH_NZ >", value, "piccDgxhNz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PICC_DGXH_NZ >=", value, "piccDgxhNz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzLessThan(BigDecimal value) {
            addCriterion("PICC_DGXH_NZ <", value, "piccDgxhNz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PICC_DGXH_NZ <=", value, "piccDgxhNz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzIn(List<BigDecimal> values) {
            addCriterion("PICC_DGXH_NZ in", values, "piccDgxhNz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzNotIn(List<BigDecimal> values) {
            addCriterion("PICC_DGXH_NZ not in", values, "piccDgxhNz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PICC_DGXH_NZ between", value1, value2, "piccDgxhNz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhNzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PICC_DGXH_NZ not between", value1, value2, "piccDgxhNz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzIsNull() {
            addCriterion("PICC_DGXH_WZ is null");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzIsNotNull() {
            addCriterion("PICC_DGXH_WZ is not null");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzEqualTo(BigDecimal value) {
            addCriterion("PICC_DGXH_WZ =", value, "piccDgxhWz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzNotEqualTo(BigDecimal value) {
            addCriterion("PICC_DGXH_WZ <>", value, "piccDgxhWz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzGreaterThan(BigDecimal value) {
            addCriterion("PICC_DGXH_WZ >", value, "piccDgxhWz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PICC_DGXH_WZ >=", value, "piccDgxhWz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzLessThan(BigDecimal value) {
            addCriterion("PICC_DGXH_WZ <", value, "piccDgxhWz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PICC_DGXH_WZ <=", value, "piccDgxhWz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzIn(List<BigDecimal> values) {
            addCriterion("PICC_DGXH_WZ in", values, "piccDgxhWz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzNotIn(List<BigDecimal> values) {
            addCriterion("PICC_DGXH_WZ not in", values, "piccDgxhWz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PICC_DGXH_WZ between", value1, value2, "piccDgxhWz");
            return (Criteria) this;
        }

        public Criteria andPiccDgxhWzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PICC_DGXH_WZ not between", value1, value2, "piccDgxhWz");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodIsNull() {
            addCriterion("SYG_DGPG_CCTJ_COD is null");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodIsNotNull() {
            addCriterion("SYG_DGPG_CCTJ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodEqualTo(String value) {
            addCriterion("SYG_DGPG_CCTJ_COD =", value, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodNotEqualTo(String value) {
            addCriterion("SYG_DGPG_CCTJ_COD <>", value, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodGreaterThan(String value) {
            addCriterion("SYG_DGPG_CCTJ_COD >", value, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodGreaterThanOrEqualTo(String value) {
            addCriterion("SYG_DGPG_CCTJ_COD >=", value, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodLessThan(String value) {
            addCriterion("SYG_DGPG_CCTJ_COD <", value, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodLessThanOrEqualTo(String value) {
            addCriterion("SYG_DGPG_CCTJ_COD <=", value, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodLike(String value) {
            addCriterion("SYG_DGPG_CCTJ_COD like", value, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodNotLike(String value) {
            addCriterion("SYG_DGPG_CCTJ_COD not like", value, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodIn(List<String> values) {
            addCriterion("SYG_DGPG_CCTJ_COD in", values, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodNotIn(List<String> values) {
            addCriterion("SYG_DGPG_CCTJ_COD not in", values, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodBetween(String value1, String value2) {
            addCriterion("SYG_DGPG_CCTJ_COD between", value1, value2, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygDgpgCctjCodNotBetween(String value1, String value2) {
            addCriterion("SYG_DGPG_CCTJ_COD not between", value1, value2, "sygDgpgCctjCod");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgIsNull() {
            addCriterion("SYG_CCTJ_TC_FLG is null");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgIsNotNull() {
            addCriterion("SYG_CCTJ_TC_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgEqualTo(String value) {
            addCriterion("SYG_CCTJ_TC_FLG =", value, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgNotEqualTo(String value) {
            addCriterion("SYG_CCTJ_TC_FLG <>", value, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgGreaterThan(String value) {
            addCriterion("SYG_CCTJ_TC_FLG >", value, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgGreaterThanOrEqualTo(String value) {
            addCriterion("SYG_CCTJ_TC_FLG >=", value, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgLessThan(String value) {
            addCriterion("SYG_CCTJ_TC_FLG <", value, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgLessThanOrEqualTo(String value) {
            addCriterion("SYG_CCTJ_TC_FLG <=", value, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgLike(String value) {
            addCriterion("SYG_CCTJ_TC_FLG like", value, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgNotLike(String value) {
            addCriterion("SYG_CCTJ_TC_FLG not like", value, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgIn(List<String> values) {
            addCriterion("SYG_CCTJ_TC_FLG in", values, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgNotIn(List<String> values) {
            addCriterion("SYG_CCTJ_TC_FLG not in", values, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgBetween(String value1, String value2) {
            addCriterion("SYG_CCTJ_TC_FLG between", value1, value2, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygCctjTcFlgNotBetween(String value1, String value2) {
            addCriterion("SYG_CCTJ_TC_FLG not between", value1, value2, "sygCctjTcFlg");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyIsNull() {
            addCriterion("SYG_JWBYY is null");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyIsNotNull() {
            addCriterion("SYG_JWBYY is not null");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyEqualTo(String value) {
            addCriterion("SYG_JWBYY =", value, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyNotEqualTo(String value) {
            addCriterion("SYG_JWBYY <>", value, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyGreaterThan(String value) {
            addCriterion("SYG_JWBYY >", value, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyGreaterThanOrEqualTo(String value) {
            addCriterion("SYG_JWBYY >=", value, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyLessThan(String value) {
            addCriterion("SYG_JWBYY <", value, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyLessThanOrEqualTo(String value) {
            addCriterion("SYG_JWBYY <=", value, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyLike(String value) {
            addCriterion("SYG_JWBYY like", value, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyNotLike(String value) {
            addCriterion("SYG_JWBYY not like", value, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyIn(List<String> values) {
            addCriterion("SYG_JWBYY in", values, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyNotIn(List<String> values) {
            addCriterion("SYG_JWBYY not in", values, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyBetween(String value1, String value2) {
            addCriterion("SYG_JWBYY between", value1, value2, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygJwbyyNotBetween(String value1, String value2) {
            addCriterion("SYG_JWBYY not between", value1, value2, "sygJwbyy");
            return (Criteria) this;
        }

        public Criteria andSygSdIsNull() {
            addCriterion("SYG_SD is null");
            return (Criteria) this;
        }

        public Criteria andSygSdIsNotNull() {
            addCriterion("SYG_SD is not null");
            return (Criteria) this;
        }

        public Criteria andSygSdEqualTo(String value) {
            addCriterion("SYG_SD =", value, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygSdNotEqualTo(String value) {
            addCriterion("SYG_SD <>", value, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygSdGreaterThan(String value) {
            addCriterion("SYG_SD >", value, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygSdGreaterThanOrEqualTo(String value) {
            addCriterion("SYG_SD >=", value, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygSdLessThan(String value) {
            addCriterion("SYG_SD <", value, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygSdLessThanOrEqualTo(String value) {
            addCriterion("SYG_SD <=", value, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygSdLike(String value) {
            addCriterion("SYG_SD like", value, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygSdNotLike(String value) {
            addCriterion("SYG_SD not like", value, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygSdIn(List<String> values) {
            addCriterion("SYG_SD in", values, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygSdNotIn(List<String> values) {
            addCriterion("SYG_SD not in", values, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygSdBetween(String value1, String value2) {
            addCriterion("SYG_SD between", value1, value2, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygSdNotBetween(String value1, String value2) {
            addCriterion("SYG_SD not between", value1, value2, "sygSd");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgIsNull() {
            addCriterion("SYG_GRJX_FLG is null");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgIsNotNull() {
            addCriterion("SYG_GRJX_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgEqualTo(String value) {
            addCriterion("SYG_GRJX_FLG =", value, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgNotEqualTo(String value) {
            addCriterion("SYG_GRJX_FLG <>", value, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgGreaterThan(String value) {
            addCriterion("SYG_GRJX_FLG >", value, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgGreaterThanOrEqualTo(String value) {
            addCriterion("SYG_GRJX_FLG >=", value, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgLessThan(String value) {
            addCriterion("SYG_GRJX_FLG <", value, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgLessThanOrEqualTo(String value) {
            addCriterion("SYG_GRJX_FLG <=", value, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgLike(String value) {
            addCriterion("SYG_GRJX_FLG like", value, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgNotLike(String value) {
            addCriterion("SYG_GRJX_FLG not like", value, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgIn(List<String> values) {
            addCriterion("SYG_GRJX_FLG in", values, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgNotIn(List<String> values) {
            addCriterion("SYG_GRJX_FLG not in", values, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgBetween(String value1, String value2) {
            addCriterion("SYG_GRJX_FLG between", value1, value2, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygGrjxFlgNotBetween(String value1, String value2) {
            addCriterion("SYG_GRJX_FLG not between", value1, value2, "sygGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgIsNull() {
            addCriterion("SYG_DXZCC_FLG is null");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgIsNotNull() {
            addCriterion("SYG_DXZCC_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgEqualTo(String value) {
            addCriterion("SYG_DXZCC_FLG =", value, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgNotEqualTo(String value) {
            addCriterion("SYG_DXZCC_FLG <>", value, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgGreaterThan(String value) {
            addCriterion("SYG_DXZCC_FLG >", value, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgGreaterThanOrEqualTo(String value) {
            addCriterion("SYG_DXZCC_FLG >=", value, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgLessThan(String value) {
            addCriterion("SYG_DXZCC_FLG <", value, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgLessThanOrEqualTo(String value) {
            addCriterion("SYG_DXZCC_FLG <=", value, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgLike(String value) {
            addCriterion("SYG_DXZCC_FLG like", value, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgNotLike(String value) {
            addCriterion("SYG_DXZCC_FLG not like", value, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgIn(List<String> values) {
            addCriterion("SYG_DXZCC_FLG in", values, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgNotIn(List<String> values) {
            addCriterion("SYG_DXZCC_FLG not in", values, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgBetween(String value1, String value2) {
            addCriterion("SYG_DXZCC_FLG between", value1, value2, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygDxzccFlgNotBetween(String value1, String value2) {
            addCriterion("SYG_DXZCC_FLG not between", value1, value2, "sygDxzccFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgIsNull() {
            addCriterion("SYG_BDXZ_FLG is null");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgIsNotNull() {
            addCriterion("SYG_BDXZ_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgEqualTo(String value) {
            addCriterion("SYG_BDXZ_FLG =", value, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgNotEqualTo(String value) {
            addCriterion("SYG_BDXZ_FLG <>", value, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgGreaterThan(String value) {
            addCriterion("SYG_BDXZ_FLG >", value, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgGreaterThanOrEqualTo(String value) {
            addCriterion("SYG_BDXZ_FLG >=", value, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgLessThan(String value) {
            addCriterion("SYG_BDXZ_FLG <", value, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgLessThanOrEqualTo(String value) {
            addCriterion("SYG_BDXZ_FLG <=", value, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgLike(String value) {
            addCriterion("SYG_BDXZ_FLG like", value, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgNotLike(String value) {
            addCriterion("SYG_BDXZ_FLG not like", value, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgIn(List<String> values) {
            addCriterion("SYG_BDXZ_FLG in", values, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgNotIn(List<String> values) {
            addCriterion("SYG_BDXZ_FLG not in", values, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgBetween(String value1, String value2) {
            addCriterion("SYG_BDXZ_FLG between", value1, value2, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygBdxzFlgNotBetween(String value1, String value2) {
            addCriterion("SYG_BDXZ_FLG not between", value1, value2, "sygBdxzFlg");
            return (Criteria) this;
        }

        public Criteria andSygQtIsNull() {
            addCriterion("SYG_QT is null");
            return (Criteria) this;
        }

        public Criteria andSygQtIsNotNull() {
            addCriterion("SYG_QT is not null");
            return (Criteria) this;
        }

        public Criteria andSygQtEqualTo(String value) {
            addCriterion("SYG_QT =", value, "sygQt");
            return (Criteria) this;
        }

        public Criteria andSygQtNotEqualTo(String value) {
            addCriterion("SYG_QT <>", value, "sygQt");
            return (Criteria) this;
        }

        public Criteria andSygQtGreaterThan(String value) {
            addCriterion("SYG_QT >", value, "sygQt");
            return (Criteria) this;
        }

        public Criteria andSygQtGreaterThanOrEqualTo(String value) {
            addCriterion("SYG_QT >=", value, "sygQt");
            return (Criteria) this;
        }

        public Criteria andSygQtLessThan(String value) {
            addCriterion("SYG_QT <", value, "sygQt");
            return (Criteria) this;
        }

        public Criteria andSygQtLessThanOrEqualTo(String value) {
            addCriterion("SYG_QT <=", value, "sygQt");
            return (Criteria) this;
        }

        public Criteria andSygQtLike(String value) {
            addCriterion("SYG_QT like", value, "sygQt");
            return (Criteria) this;
        }

        public Criteria andSygQtNotLike(String value) {
            addCriterion("SYG_QT not like", value, "sygQt");
            return (Criteria) this;
        }

        public Criteria andSygQtIn(List<String> values) {
            addCriterion("SYG_QT in", values, "sygQt");
            return (Criteria) this;
        }

        public Criteria andSygQtNotIn(List<String> values) {
            addCriterion("SYG_QT not in", values, "sygQt");
            return (Criteria) this;
        }

        public Criteria andSygQtBetween(String value1, String value2) {
            addCriterion("SYG_QT between", value1, value2, "sygQt");
            return (Criteria) this;
        }

        public Criteria andSygQtNotBetween(String value1, String value2) {
            addCriterion("SYG_QT not between", value1, value2, "sygQt");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgIsNull() {
            addCriterion("DGPG_YLG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgIsNotNull() {
            addCriterion("DGPG_YLG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgEqualTo(String value) {
            addCriterion("DGPG_YLG_FLG =", value, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgNotEqualTo(String value) {
            addCriterion("DGPG_YLG_FLG <>", value, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgGreaterThan(String value) {
            addCriterion("DGPG_YLG_FLG >", value, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("DGPG_YLG_FLG >=", value, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgLessThan(String value) {
            addCriterion("DGPG_YLG_FLG <", value, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgLessThanOrEqualTo(String value) {
            addCriterion("DGPG_YLG_FLG <=", value, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgLike(String value) {
            addCriterion("DGPG_YLG_FLG like", value, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgNotLike(String value) {
            addCriterion("DGPG_YLG_FLG not like", value, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgIn(List<String> values) {
            addCriterion("DGPG_YLG_FLG in", values, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgNotIn(List<String> values) {
            addCriterion("DGPG_YLG_FLG not in", values, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgBetween(String value1, String value2) {
            addCriterion("DGPG_YLG_FLG between", value1, value2, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgYlgFlgNotBetween(String value1, String value2) {
            addCriterion("DGPG_YLG_FLG not between", value1, value2, "dgpgYlgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgIsNull() {
            addCriterion("YLG_GRJX_FLG is null");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgIsNotNull() {
            addCriterion("YLG_GRJX_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgEqualTo(String value) {
            addCriterion("YLG_GRJX_FLG =", value, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgNotEqualTo(String value) {
            addCriterion("YLG_GRJX_FLG <>", value, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgGreaterThan(String value) {
            addCriterion("YLG_GRJX_FLG >", value, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgGreaterThanOrEqualTo(String value) {
            addCriterion("YLG_GRJX_FLG >=", value, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgLessThan(String value) {
            addCriterion("YLG_GRJX_FLG <", value, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgLessThanOrEqualTo(String value) {
            addCriterion("YLG_GRJX_FLG <=", value, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgLike(String value) {
            addCriterion("YLG_GRJX_FLG like", value, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgNotLike(String value) {
            addCriterion("YLG_GRJX_FLG not like", value, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgIn(List<String> values) {
            addCriterion("YLG_GRJX_FLG in", values, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgNotIn(List<String> values) {
            addCriterion("YLG_GRJX_FLG not in", values, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgBetween(String value1, String value2) {
            addCriterion("YLG_GRJX_FLG between", value1, value2, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgGrjxFlgNotBetween(String value1, String value2) {
            addCriterion("YLG_GRJX_FLG not between", value1, value2, "ylgGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgIsNull() {
            addCriterion("YLG_BG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgIsNotNull() {
            addCriterion("YLG_BG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgEqualTo(String value) {
            addCriterion("YLG_BG_FLG =", value, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgNotEqualTo(String value) {
            addCriterion("YLG_BG_FLG <>", value, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgGreaterThan(String value) {
            addCriterion("YLG_BG_FLG >", value, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("YLG_BG_FLG >=", value, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgLessThan(String value) {
            addCriterion("YLG_BG_FLG <", value, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgLessThanOrEqualTo(String value) {
            addCriterion("YLG_BG_FLG <=", value, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgLike(String value) {
            addCriterion("YLG_BG_FLG like", value, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgNotLike(String value) {
            addCriterion("YLG_BG_FLG not like", value, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgIn(List<String> values) {
            addCriterion("YLG_BG_FLG in", values, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgNotIn(List<String> values) {
            addCriterion("YLG_BG_FLG not in", values, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgBetween(String value1, String value2) {
            addCriterion("YLG_BG_FLG between", value1, value2, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andYlgBgFlgNotBetween(String value1, String value2) {
            addCriterion("YLG_BG_FLG not between", value1, value2, "ylgBgFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoIsNull() {
            addCriterion("DGPG_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoIsNotNull() {
            addCriterion("DGPG_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoEqualTo(String value) {
            addCriterion("DGPG_MEMO =", value, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoNotEqualTo(String value) {
            addCriterion("DGPG_MEMO <>", value, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoGreaterThan(String value) {
            addCriterion("DGPG_MEMO >", value, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoGreaterThanOrEqualTo(String value) {
            addCriterion("DGPG_MEMO >=", value, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoLessThan(String value) {
            addCriterion("DGPG_MEMO <", value, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoLessThanOrEqualTo(String value) {
            addCriterion("DGPG_MEMO <=", value, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoLike(String value) {
            addCriterion("DGPG_MEMO like", value, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoNotLike(String value) {
            addCriterion("DGPG_MEMO not like", value, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoIn(List<String> values) {
            addCriterion("DGPG_MEMO in", values, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoNotIn(List<String> values) {
            addCriterion("DGPG_MEMO not in", values, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoBetween(String value1, String value2) {
            addCriterion("DGPG_MEMO between", value1, value2, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andDgpgMemoNotBetween(String value1, String value2) {
            addCriterion("DGPG_MEMO not between", value1, value2, "dgpgMemo");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtIsNull() {
            addCriterion("WZJM_GDT is null");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtIsNotNull() {
            addCriterion("WZJM_GDT is not null");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtEqualTo(String value) {
            addCriterion("WZJM_GDT =", value, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtNotEqualTo(String value) {
            addCriterion("WZJM_GDT <>", value, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtGreaterThan(String value) {
            addCriterion("WZJM_GDT >", value, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtGreaterThanOrEqualTo(String value) {
            addCriterion("WZJM_GDT >=", value, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtLessThan(String value) {
            addCriterion("WZJM_GDT <", value, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtLessThanOrEqualTo(String value) {
            addCriterion("WZJM_GDT <=", value, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtLike(String value) {
            addCriterion("WZJM_GDT like", value, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtNotLike(String value) {
            addCriterion("WZJM_GDT not like", value, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtIn(List<String> values) {
            addCriterion("WZJM_GDT in", values, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtNotIn(List<String> values) {
            addCriterion("WZJM_GDT not in", values, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtBetween(String value1, String value2) {
            addCriterion("WZJM_GDT between", value1, value2, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andWzjmGdtNotBetween(String value1, String value2) {
            addCriterion("WZJM_GDT not between", value1, value2, "wzjmGdt");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgIsNull() {
            addCriterion("DGPG_QT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgIsNotNull() {
            addCriterion("DGPG_QT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgEqualTo(String value) {
            addCriterion("DGPG_QT_FLG =", value, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgNotEqualTo(String value) {
            addCriterion("DGPG_QT_FLG <>", value, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgGreaterThan(String value) {
            addCriterion("DGPG_QT_FLG >", value, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgGreaterThanOrEqualTo(String value) {
            addCriterion("DGPG_QT_FLG >=", value, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgLessThan(String value) {
            addCriterion("DGPG_QT_FLG <", value, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgLessThanOrEqualTo(String value) {
            addCriterion("DGPG_QT_FLG <=", value, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgLike(String value) {
            addCriterion("DGPG_QT_FLG like", value, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgNotLike(String value) {
            addCriterion("DGPG_QT_FLG not like", value, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgIn(List<String> values) {
            addCriterion("DGPG_QT_FLG in", values, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgNotIn(List<String> values) {
            addCriterion("DGPG_QT_FLG not in", values, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgBetween(String value1, String value2) {
            addCriterion("DGPG_QT_FLG between", value1, value2, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andDgpgQtFlgNotBetween(String value1, String value2) {
            addCriterion("DGPG_QT_FLG not between", value1, value2, "dgpgQtFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgIsNull() {
            addCriterion("QT_GRJX_FLG is null");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgIsNotNull() {
            addCriterion("QT_GRJX_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgEqualTo(String value) {
            addCriterion("QT_GRJX_FLG =", value, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgNotEqualTo(String value) {
            addCriterion("QT_GRJX_FLG <>", value, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgGreaterThan(String value) {
            addCriterion("QT_GRJX_FLG >", value, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgGreaterThanOrEqualTo(String value) {
            addCriterion("QT_GRJX_FLG >=", value, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgLessThan(String value) {
            addCriterion("QT_GRJX_FLG <", value, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgLessThanOrEqualTo(String value) {
            addCriterion("QT_GRJX_FLG <=", value, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgLike(String value) {
            addCriterion("QT_GRJX_FLG like", value, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgNotLike(String value) {
            addCriterion("QT_GRJX_FLG not like", value, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgIn(List<String> values) {
            addCriterion("QT_GRJX_FLG in", values, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgNotIn(List<String> values) {
            addCriterion("QT_GRJX_FLG not in", values, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgBetween(String value1, String value2) {
            addCriterion("QT_GRJX_FLG between", value1, value2, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtGrjxFlgNotBetween(String value1, String value2) {
            addCriterion("QT_GRJX_FLG not between", value1, value2, "qtGrjxFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgIsNull() {
            addCriterion("QT_BG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgIsNotNull() {
            addCriterion("QT_BG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgEqualTo(String value) {
            addCriterion("QT_BG_FLG =", value, "qtBgFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgNotEqualTo(String value) {
            addCriterion("QT_BG_FLG <>", value, "qtBgFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgGreaterThan(String value) {
            addCriterion("QT_BG_FLG >", value, "qtBgFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgGreaterThanOrEqualTo(String value) {
            addCriterion("QT_BG_FLG >=", value, "qtBgFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgLessThan(String value) {
            addCriterion("QT_BG_FLG <", value, "qtBgFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgLessThanOrEqualTo(String value) {
            addCriterion("QT_BG_FLG <=", value, "qtBgFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgLike(String value) {
            addCriterion("QT_BG_FLG like", value, "qtBgFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgNotLike(String value) {
            addCriterion("QT_BG_FLG not like", value, "qtBgFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgIn(List<String> values) {
            addCriterion("QT_BG_FLG in", values, "qtBgFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgNotIn(List<String> values) {
            addCriterion("QT_BG_FLG not in", values, "qtBgFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgBetween(String value1, String value2) {
            addCriterion("QT_BG_FLG between", value1, value2, "qtBgFlg");
            return (Criteria) this;
        }

        public Criteria andQtBgFlgNotBetween(String value1, String value2) {
            addCriterion("QT_BG_FLG not between", value1, value2, "qtBgFlg");
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