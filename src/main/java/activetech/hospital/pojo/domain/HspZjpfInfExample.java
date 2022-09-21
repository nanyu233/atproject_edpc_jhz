package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspZjpfInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspZjpfInfExample() {
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

        public Criteria andZjpfSeqIsNull() {
            addCriterion("ZJPF_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqIsNotNull() {
            addCriterion("ZJPF_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqEqualTo(String value) {
            addCriterion("ZJPF_SEQ =", value, "zjpfSeq");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqNotEqualTo(String value) {
            addCriterion("ZJPF_SEQ <>", value, "zjpfSeq");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqGreaterThan(String value) {
            addCriterion("ZJPF_SEQ >", value, "zjpfSeq");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ZJPF_SEQ >=", value, "zjpfSeq");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqLessThan(String value) {
            addCriterion("ZJPF_SEQ <", value, "zjpfSeq");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqLessThanOrEqualTo(String value) {
            addCriterion("ZJPF_SEQ <=", value, "zjpfSeq");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqLike(String value) {
            addCriterion("ZJPF_SEQ like", value, "zjpfSeq");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqNotLike(String value) {
            addCriterion("ZJPF_SEQ not like", value, "zjpfSeq");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqIn(List<String> values) {
            addCriterion("ZJPF_SEQ in", values, "zjpfSeq");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqNotIn(List<String> values) {
            addCriterion("ZJPF_SEQ not in", values, "zjpfSeq");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqBetween(String value1, String value2) {
            addCriterion("ZJPF_SEQ between", value1, value2, "zjpfSeq");
            return (Criteria) this;
        }

        public Criteria andZjpfSeqNotBetween(String value1, String value2) {
            addCriterion("ZJPF_SEQ not between", value1, value2, "zjpfSeq");
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

        public Criteria andJlDatIsNull() {
            addCriterion("JL_DAT is null");
            return (Criteria) this;
        }

        public Criteria andJlDatIsNotNull() {
            addCriterion("JL_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andJlDatEqualTo(Date value) {
            addCriterion("JL_DAT =", value, "jlDat");
            return (Criteria) this;
        }

        public Criteria andJlDatNotEqualTo(Date value) {
            addCriterion("JL_DAT <>", value, "jlDat");
            return (Criteria) this;
        }

        public Criteria andJlDatGreaterThan(Date value) {
            addCriterion("JL_DAT >", value, "jlDat");
            return (Criteria) this;
        }

        public Criteria andJlDatGreaterThanOrEqualTo(Date value) {
            addCriterion("JL_DAT >=", value, "jlDat");
            return (Criteria) this;
        }

        public Criteria andJlDatLessThan(Date value) {
            addCriterion("JL_DAT <", value, "jlDat");
            return (Criteria) this;
        }

        public Criteria andJlDatLessThanOrEqualTo(Date value) {
            addCriterion("JL_DAT <=", value, "jlDat");
            return (Criteria) this;
        }

        public Criteria andJlDatIn(List<Date> values) {
            addCriterion("JL_DAT in", values, "jlDat");
            return (Criteria) this;
        }

        public Criteria andJlDatNotIn(List<Date> values) {
            addCriterion("JL_DAT not in", values, "jlDat");
            return (Criteria) this;
        }

        public Criteria andJlDatBetween(Date value1, Date value2) {
            addCriterion("JL_DAT between", value1, value2, "jlDat");
            return (Criteria) this;
        }

        public Criteria andJlDatNotBetween(Date value1, Date value2) {
            addCriterion("JL_DAT not between", value1, value2, "jlDat");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxIsNull() {
            addCriterion("ZJPFNRX is null");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxIsNotNull() {
            addCriterion("ZJPFNRX is not null");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxEqualTo(String value) {
            addCriterion("ZJPFNRX =", value, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxNotEqualTo(String value) {
            addCriterion("ZJPFNRX <>", value, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxGreaterThan(String value) {
            addCriterion("ZJPFNRX >", value, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxGreaterThanOrEqualTo(String value) {
            addCriterion("ZJPFNRX >=", value, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxLessThan(String value) {
            addCriterion("ZJPFNRX <", value, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxLessThanOrEqualTo(String value) {
            addCriterion("ZJPFNRX <=", value, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxLike(String value) {
            addCriterion("ZJPFNRX like", value, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxNotLike(String value) {
            addCriterion("ZJPFNRX not like", value, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxIn(List<String> values) {
            addCriterion("ZJPFNRX in", values, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxNotIn(List<String> values) {
            addCriterion("ZJPFNRX not in", values, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxBetween(String value1, String value2) {
            addCriterion("ZJPFNRX between", value1, value2, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfnrxNotBetween(String value1, String value2) {
            addCriterion("ZJPFNRX not between", value1, value2, "zjpfnrx");
            return (Criteria) this;
        }

        public Criteria andZjpfZfIsNull() {
            addCriterion("ZJPF_ZF is null");
            return (Criteria) this;
        }

        public Criteria andZjpfZfIsNotNull() {
            addCriterion("ZJPF_ZF is not null");
            return (Criteria) this;
        }

        public Criteria andZjpfZfEqualTo(Long value) {
            addCriterion("ZJPF_ZF =", value, "zjpfZf");
            return (Criteria) this;
        }

        public Criteria andZjpfZfNotEqualTo(Long value) {
            addCriterion("ZJPF_ZF <>", value, "zjpfZf");
            return (Criteria) this;
        }

        public Criteria andZjpfZfGreaterThan(Long value) {
            addCriterion("ZJPF_ZF >", value, "zjpfZf");
            return (Criteria) this;
        }

        public Criteria andZjpfZfGreaterThanOrEqualTo(Long value) {
            addCriterion("ZJPF_ZF >=", value, "zjpfZf");
            return (Criteria) this;
        }

        public Criteria andZjpfZfLessThan(Long value) {
            addCriterion("ZJPF_ZF <", value, "zjpfZf");
            return (Criteria) this;
        }

        public Criteria andZjpfZfLessThanOrEqualTo(Long value) {
            addCriterion("ZJPF_ZF <=", value, "zjpfZf");
            return (Criteria) this;
        }

        public Criteria andZjpfZfIn(List<Long> values) {
            addCriterion("ZJPF_ZF in", values, "zjpfZf");
            return (Criteria) this;
        }

        public Criteria andZjpfZfNotIn(List<Long> values) {
            addCriterion("ZJPF_ZF not in", values, "zjpfZf");
            return (Criteria) this;
        }

        public Criteria andZjpfZfBetween(Long value1, Long value2) {
            addCriterion("ZJPF_ZF between", value1, value2, "zjpfZf");
            return (Criteria) this;
        }

        public Criteria andZjpfZfNotBetween(Long value1, Long value2) {
            addCriterion("ZJPF_ZF not between", value1, value2, "zjpfZf");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andPfTypeIsNull() {
            addCriterion("PF_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPfTypeIsNotNull() {
            addCriterion("PF_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPfTypeEqualTo(String value) {
            addCriterion("PF_TYPE =", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeNotEqualTo(String value) {
            addCriterion("PF_TYPE <>", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeGreaterThan(String value) {
            addCriterion("PF_TYPE >", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PF_TYPE >=", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeLessThan(String value) {
            addCriterion("PF_TYPE <", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeLessThanOrEqualTo(String value) {
            addCriterion("PF_TYPE <=", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeLike(String value) {
            addCriterion("PF_TYPE like", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeNotLike(String value) {
            addCriterion("PF_TYPE not like", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeIn(List<String> values) {
            addCriterion("PF_TYPE in", values, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeNotIn(List<String> values) {
            addCriterion("PF_TYPE not in", values, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeBetween(String value1, String value2) {
            addCriterion("PF_TYPE between", value1, value2, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeNotBetween(String value1, String value2) {
            addCriterion("PF_TYPE not between", value1, value2, "pfType");
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

        public Criteria andCrtUsrNmeIsNull() {
            addCriterion("CRT_USR_NME is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeIsNotNull() {
            addCriterion("CRT_USR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeEqualTo(String value) {
            addCriterion("CRT_USR_NME =", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotEqualTo(String value) {
            addCriterion("CRT_USR_NME <>", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeGreaterThan(String value) {
            addCriterion("CRT_USR_NME >", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NME >=", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLessThan(String value) {
            addCriterion("CRT_USR_NME <", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_NME <=", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeLike(String value) {
            addCriterion("CRT_USR_NME like", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotLike(String value) {
            addCriterion("CRT_USR_NME not like", value, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeIn(List<String> values) {
            addCriterion("CRT_USR_NME in", values, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotIn(List<String> values) {
            addCriterion("CRT_USR_NME not in", values, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeBetween(String value1, String value2) {
            addCriterion("CRT_USR_NME between", value1, value2, "crtUsrNme");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNmeNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_NME not between", value1, value2, "crtUsrNme");
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