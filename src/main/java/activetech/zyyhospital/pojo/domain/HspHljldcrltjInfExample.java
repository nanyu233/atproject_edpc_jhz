package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspHljldcrltjInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspHljldcrltjInfExample() {
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

        public Criteria andHljldcrltjSeqIsNull() {
            addCriterion("HLJLDCRLTJ_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqIsNotNull() {
            addCriterion("HLJLDCRLTJ_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqEqualTo(String value) {
            addCriterion("HLJLDCRLTJ_SEQ =", value, "hljldcrltjSeq");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqNotEqualTo(String value) {
            addCriterion("HLJLDCRLTJ_SEQ <>", value, "hljldcrltjSeq");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqGreaterThan(String value) {
            addCriterion("HLJLDCRLTJ_SEQ >", value, "hljldcrltjSeq");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqGreaterThanOrEqualTo(String value) {
            addCriterion("HLJLDCRLTJ_SEQ >=", value, "hljldcrltjSeq");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqLessThan(String value) {
            addCriterion("HLJLDCRLTJ_SEQ <", value, "hljldcrltjSeq");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqLessThanOrEqualTo(String value) {
            addCriterion("HLJLDCRLTJ_SEQ <=", value, "hljldcrltjSeq");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqLike(String value) {
            addCriterion("HLJLDCRLTJ_SEQ like", value, "hljldcrltjSeq");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqNotLike(String value) {
            addCriterion("HLJLDCRLTJ_SEQ not like", value, "hljldcrltjSeq");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqIn(List<String> values) {
            addCriterion("HLJLDCRLTJ_SEQ in", values, "hljldcrltjSeq");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqNotIn(List<String> values) {
            addCriterion("HLJLDCRLTJ_SEQ not in", values, "hljldcrltjSeq");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqBetween(String value1, String value2) {
            addCriterion("HLJLDCRLTJ_SEQ between", value1, value2, "hljldcrltjSeq");
            return (Criteria) this;
        }

        public Criteria andHljldcrltjSeqNotBetween(String value1, String value2) {
            addCriterion("HLJLDCRLTJ_SEQ not between", value1, value2, "hljldcrltjSeq");
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

        public Criteria andStartDatIsNull() {
            addCriterion("START_DAT is null");
            return (Criteria) this;
        }

        public Criteria andStartDatIsNotNull() {
            addCriterion("START_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andStartDatEqualTo(Date value) {
            addCriterion("START_DAT =", value, "startDat");
            return (Criteria) this;
        }

        public Criteria andStartDatNotEqualTo(Date value) {
            addCriterion("START_DAT <>", value, "startDat");
            return (Criteria) this;
        }

        public Criteria andStartDatGreaterThan(Date value) {
            addCriterion("START_DAT >", value, "startDat");
            return (Criteria) this;
        }

        public Criteria andStartDatGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DAT >=", value, "startDat");
            return (Criteria) this;
        }

        public Criteria andStartDatLessThan(Date value) {
            addCriterion("START_DAT <", value, "startDat");
            return (Criteria) this;
        }

        public Criteria andStartDatLessThanOrEqualTo(Date value) {
            addCriterion("START_DAT <=", value, "startDat");
            return (Criteria) this;
        }

        public Criteria andStartDatIn(List<Date> values) {
            addCriterion("START_DAT in", values, "startDat");
            return (Criteria) this;
        }

        public Criteria andStartDatNotIn(List<Date> values) {
            addCriterion("START_DAT not in", values, "startDat");
            return (Criteria) this;
        }

        public Criteria andStartDatBetween(Date value1, Date value2) {
            addCriterion("START_DAT between", value1, value2, "startDat");
            return (Criteria) this;
        }

        public Criteria andStartDatNotBetween(Date value1, Date value2) {
            addCriterion("START_DAT not between", value1, value2, "startDat");
            return (Criteria) this;
        }

        public Criteria andEndDatIsNull() {
            addCriterion("END_DAT is null");
            return (Criteria) this;
        }

        public Criteria andEndDatIsNotNull() {
            addCriterion("END_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andEndDatEqualTo(Date value) {
            addCriterion("END_DAT =", value, "endDat");
            return (Criteria) this;
        }

        public Criteria andEndDatNotEqualTo(Date value) {
            addCriterion("END_DAT <>", value, "endDat");
            return (Criteria) this;
        }

        public Criteria andEndDatGreaterThan(Date value) {
            addCriterion("END_DAT >", value, "endDat");
            return (Criteria) this;
        }

        public Criteria andEndDatGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DAT >=", value, "endDat");
            return (Criteria) this;
        }

        public Criteria andEndDatLessThan(Date value) {
            addCriterion("END_DAT <", value, "endDat");
            return (Criteria) this;
        }

        public Criteria andEndDatLessThanOrEqualTo(Date value) {
            addCriterion("END_DAT <=", value, "endDat");
            return (Criteria) this;
        }

        public Criteria andEndDatIn(List<Date> values) {
            addCriterion("END_DAT in", values, "endDat");
            return (Criteria) this;
        }

        public Criteria andEndDatNotIn(List<Date> values) {
            addCriterion("END_DAT not in", values, "endDat");
            return (Criteria) this;
        }

        public Criteria andEndDatBetween(Date value1, Date value2) {
            addCriterion("END_DAT between", value1, value2, "endDat");
            return (Criteria) this;
        }

        public Criteria andEndDatNotBetween(Date value1, Date value2) {
            addCriterion("END_DAT not between", value1, value2, "endDat");
            return (Criteria) this;
        }

        public Criteria andSumRlIsNull() {
            addCriterion("SUM_RL is null");
            return (Criteria) this;
        }

        public Criteria andSumRlIsNotNull() {
            addCriterion("SUM_RL is not null");
            return (Criteria) this;
        }

        public Criteria andSumRlEqualTo(String value) {
            addCriterion("SUM_RL =", value, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumRlNotEqualTo(String value) {
            addCriterion("SUM_RL <>", value, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumRlGreaterThan(String value) {
            addCriterion("SUM_RL >", value, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumRlGreaterThanOrEqualTo(String value) {
            addCriterion("SUM_RL >=", value, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumRlLessThan(String value) {
            addCriterion("SUM_RL <", value, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumRlLessThanOrEqualTo(String value) {
            addCriterion("SUM_RL <=", value, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumRlLike(String value) {
            addCriterion("SUM_RL like", value, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumRlNotLike(String value) {
            addCriterion("SUM_RL not like", value, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumRlIn(List<String> values) {
            addCriterion("SUM_RL in", values, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumRlNotIn(List<String> values) {
            addCriterion("SUM_RL not in", values, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumRlBetween(String value1, String value2) {
            addCriterion("SUM_RL between", value1, value2, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumRlNotBetween(String value1, String value2) {
            addCriterion("SUM_RL not between", value1, value2, "sumRl");
            return (Criteria) this;
        }

        public Criteria andSumClIsNull() {
            addCriterion("SUM_CL is null");
            return (Criteria) this;
        }

        public Criteria andSumClIsNotNull() {
            addCriterion("SUM_CL is not null");
            return (Criteria) this;
        }

        public Criteria andSumClEqualTo(String value) {
            addCriterion("SUM_CL =", value, "sumCl");
            return (Criteria) this;
        }

        public Criteria andSumClNotEqualTo(String value) {
            addCriterion("SUM_CL <>", value, "sumCl");
            return (Criteria) this;
        }

        public Criteria andSumClGreaterThan(String value) {
            addCriterion("SUM_CL >", value, "sumCl");
            return (Criteria) this;
        }

        public Criteria andSumClGreaterThanOrEqualTo(String value) {
            addCriterion("SUM_CL >=", value, "sumCl");
            return (Criteria) this;
        }

        public Criteria andSumClLessThan(String value) {
            addCriterion("SUM_CL <", value, "sumCl");
            return (Criteria) this;
        }

        public Criteria andSumClLessThanOrEqualTo(String value) {
            addCriterion("SUM_CL <=", value, "sumCl");
            return (Criteria) this;
        }

        public Criteria andSumClLike(String value) {
            addCriterion("SUM_CL like", value, "sumCl");
            return (Criteria) this;
        }

        public Criteria andSumClNotLike(String value) {
            addCriterion("SUM_CL not like", value, "sumCl");
            return (Criteria) this;
        }

        public Criteria andSumClIn(List<String> values) {
            addCriterion("SUM_CL in", values, "sumCl");
            return (Criteria) this;
        }

        public Criteria andSumClNotIn(List<String> values) {
            addCriterion("SUM_CL not in", values, "sumCl");
            return (Criteria) this;
        }

        public Criteria andSumClBetween(String value1, String value2) {
            addCriterion("SUM_CL between", value1, value2, "sumCl");
            return (Criteria) this;
        }

        public Criteria andSumClNotBetween(String value1, String value2) {
            addCriterion("SUM_CL not between", value1, value2, "sumCl");
            return (Criteria) this;
        }

        public Criteria andTjNumIsNull() {
            addCriterion("TJ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTjNumIsNotNull() {
            addCriterion("TJ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTjNumEqualTo(String value) {
            addCriterion("TJ_NUM =", value, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNumNotEqualTo(String value) {
            addCriterion("TJ_NUM <>", value, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNumGreaterThan(String value) {
            addCriterion("TJ_NUM >", value, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNumGreaterThanOrEqualTo(String value) {
            addCriterion("TJ_NUM >=", value, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNumLessThan(String value) {
            addCriterion("TJ_NUM <", value, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNumLessThanOrEqualTo(String value) {
            addCriterion("TJ_NUM <=", value, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNumLike(String value) {
            addCriterion("TJ_NUM like", value, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNumNotLike(String value) {
            addCriterion("TJ_NUM not like", value, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNumIn(List<String> values) {
            addCriterion("TJ_NUM in", values, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNumNotIn(List<String> values) {
            addCriterion("TJ_NUM not in", values, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNumBetween(String value1, String value2) {
            addCriterion("TJ_NUM between", value1, value2, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNumNotBetween(String value1, String value2) {
            addCriterion("TJ_NUM not between", value1, value2, "tjNum");
            return (Criteria) this;
        }

        public Criteria andTjNamIsNull() {
            addCriterion("TJ_NAM is null");
            return (Criteria) this;
        }

        public Criteria andTjNamIsNotNull() {
            addCriterion("TJ_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andTjNamEqualTo(String value) {
            addCriterion("TJ_NAM =", value, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjNamNotEqualTo(String value) {
            addCriterion("TJ_NAM <>", value, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjNamGreaterThan(String value) {
            addCriterion("TJ_NAM >", value, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjNamGreaterThanOrEqualTo(String value) {
            addCriterion("TJ_NAM >=", value, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjNamLessThan(String value) {
            addCriterion("TJ_NAM <", value, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjNamLessThanOrEqualTo(String value) {
            addCriterion("TJ_NAM <=", value, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjNamLike(String value) {
            addCriterion("TJ_NAM like", value, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjNamNotLike(String value) {
            addCriterion("TJ_NAM not like", value, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjNamIn(List<String> values) {
            addCriterion("TJ_NAM in", values, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjNamNotIn(List<String> values) {
            addCriterion("TJ_NAM not in", values, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjNamBetween(String value1, String value2) {
            addCriterion("TJ_NAM between", value1, value2, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjNamNotBetween(String value1, String value2) {
            addCriterion("TJ_NAM not between", value1, value2, "tjNam");
            return (Criteria) this;
        }

        public Criteria andTjDatIsNull() {
            addCriterion("TJ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andTjDatIsNotNull() {
            addCriterion("TJ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andTjDatEqualTo(Date value) {
            addCriterion("TJ_DAT =", value, "tjDat");
            return (Criteria) this;
        }

        public Criteria andTjDatNotEqualTo(Date value) {
            addCriterion("TJ_DAT <>", value, "tjDat");
            return (Criteria) this;
        }

        public Criteria andTjDatGreaterThan(Date value) {
            addCriterion("TJ_DAT >", value, "tjDat");
            return (Criteria) this;
        }

        public Criteria andTjDatGreaterThanOrEqualTo(Date value) {
            addCriterion("TJ_DAT >=", value, "tjDat");
            return (Criteria) this;
        }

        public Criteria andTjDatLessThan(Date value) {
            addCriterion("TJ_DAT <", value, "tjDat");
            return (Criteria) this;
        }

        public Criteria andTjDatLessThanOrEqualTo(Date value) {
            addCriterion("TJ_DAT <=", value, "tjDat");
            return (Criteria) this;
        }

        public Criteria andTjDatIn(List<Date> values) {
            addCriterion("TJ_DAT in", values, "tjDat");
            return (Criteria) this;
        }

        public Criteria andTjDatNotIn(List<Date> values) {
            addCriterion("TJ_DAT not in", values, "tjDat");
            return (Criteria) this;
        }

        public Criteria andTjDatBetween(Date value1, Date value2) {
            addCriterion("TJ_DAT between", value1, value2, "tjDat");
            return (Criteria) this;
        }

        public Criteria andTjDatNotBetween(Date value1, Date value2) {
            addCriterion("TJ_DAT not between", value1, value2, "tjDat");
            return (Criteria) this;
        }

        public Criteria andSumPeeIsNull() {
            addCriterion("SUM_PEE is null");
            return (Criteria) this;
        }

        public Criteria andSumPeeIsNotNull() {
            addCriterion("SUM_PEE is not null");
            return (Criteria) this;
        }

        public Criteria andSumPeeEqualTo(String value) {
            addCriterion("SUM_PEE =", value, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSumPeeNotEqualTo(String value) {
            addCriterion("SUM_PEE <>", value, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSumPeeGreaterThan(String value) {
            addCriterion("SUM_PEE >", value, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSumPeeGreaterThanOrEqualTo(String value) {
            addCriterion("SUM_PEE >=", value, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSumPeeLessThan(String value) {
            addCriterion("SUM_PEE <", value, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSumPeeLessThanOrEqualTo(String value) {
            addCriterion("SUM_PEE <=", value, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSumPeeLike(String value) {
            addCriterion("SUM_PEE like", value, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSumPeeNotLike(String value) {
            addCriterion("SUM_PEE not like", value, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSumPeeIn(List<String> values) {
            addCriterion("SUM_PEE in", values, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSumPeeNotIn(List<String> values) {
            addCriterion("SUM_PEE not in", values, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSumPeeBetween(String value1, String value2) {
            addCriterion("SUM_PEE between", value1, value2, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSumPeeNotBetween(String value1, String value2) {
            addCriterion("SUM_PEE not between", value1, value2, "sumPee");
            return (Criteria) this;
        }

        public Criteria andSjcIsNull() {
            addCriterion("SJC is null");
            return (Criteria) this;
        }

        public Criteria andSjcIsNotNull() {
            addCriterion("SJC is not null");
            return (Criteria) this;
        }

        public Criteria andSjcEqualTo(String value) {
            addCriterion("SJC =", value, "sjc");
            return (Criteria) this;
        }

        public Criteria andSjcNotEqualTo(String value) {
            addCriterion("SJC <>", value, "sjc");
            return (Criteria) this;
        }

        public Criteria andSjcGreaterThan(String value) {
            addCriterion("SJC >", value, "sjc");
            return (Criteria) this;
        }

        public Criteria andSjcGreaterThanOrEqualTo(String value) {
            addCriterion("SJC >=", value, "sjc");
            return (Criteria) this;
        }

        public Criteria andSjcLessThan(String value) {
            addCriterion("SJC <", value, "sjc");
            return (Criteria) this;
        }

        public Criteria andSjcLessThanOrEqualTo(String value) {
            addCriterion("SJC <=", value, "sjc");
            return (Criteria) this;
        }

        public Criteria andSjcLike(String value) {
            addCriterion("SJC like", value, "sjc");
            return (Criteria) this;
        }

        public Criteria andSjcNotLike(String value) {
            addCriterion("SJC not like", value, "sjc");
            return (Criteria) this;
        }

        public Criteria andSjcIn(List<String> values) {
            addCriterion("SJC in", values, "sjc");
            return (Criteria) this;
        }

        public Criteria andSjcNotIn(List<String> values) {
            addCriterion("SJC not in", values, "sjc");
            return (Criteria) this;
        }

        public Criteria andSjcBetween(String value1, String value2) {
            addCriterion("SJC between", value1, value2, "sjc");
            return (Criteria) this;
        }

        public Criteria andSjcNotBetween(String value1, String value2) {
            addCriterion("SJC not between", value1, value2, "sjc");
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