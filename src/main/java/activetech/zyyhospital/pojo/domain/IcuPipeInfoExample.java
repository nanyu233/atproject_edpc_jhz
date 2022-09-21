package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IcuPipeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcuPipeInfoExample() {
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

        public Criteria andPipeSeqIsNull() {
            addCriterion("PIPE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPipeSeqIsNotNull() {
            addCriterion("PIPE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPipeSeqEqualTo(String value) {
            addCriterion("PIPE_SEQ =", value, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeSeqNotEqualTo(String value) {
            addCriterion("PIPE_SEQ <>", value, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeSeqGreaterThan(String value) {
            addCriterion("PIPE_SEQ >", value, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeSeqGreaterThanOrEqualTo(String value) {
            addCriterion("PIPE_SEQ >=", value, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeSeqLessThan(String value) {
            addCriterion("PIPE_SEQ <", value, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeSeqLessThanOrEqualTo(String value) {
            addCriterion("PIPE_SEQ <=", value, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeSeqLike(String value) {
            addCriterion("PIPE_SEQ like", value, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeSeqNotLike(String value) {
            addCriterion("PIPE_SEQ not like", value, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeSeqIn(List<String> values) {
            addCriterion("PIPE_SEQ in", values, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeSeqNotIn(List<String> values) {
            addCriterion("PIPE_SEQ not in", values, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeSeqBetween(String value1, String value2) {
            addCriterion("PIPE_SEQ between", value1, value2, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeSeqNotBetween(String value1, String value2) {
            addCriterion("PIPE_SEQ not between", value1, value2, "pipeSeq");
            return (Criteria) this;
        }

        public Criteria andPipeNameIsNull() {
            addCriterion("PIPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPipeNameIsNotNull() {
            addCriterion("PIPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPipeNameEqualTo(String value) {
            addCriterion("PIPE_NAME =", value, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeNameNotEqualTo(String value) {
            addCriterion("PIPE_NAME <>", value, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeNameGreaterThan(String value) {
            addCriterion("PIPE_NAME >", value, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeNameGreaterThanOrEqualTo(String value) {
            addCriterion("PIPE_NAME >=", value, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeNameLessThan(String value) {
            addCriterion("PIPE_NAME <", value, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeNameLessThanOrEqualTo(String value) {
            addCriterion("PIPE_NAME <=", value, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeNameLike(String value) {
            addCriterion("PIPE_NAME like", value, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeNameNotLike(String value) {
            addCriterion("PIPE_NAME not like", value, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeNameIn(List<String> values) {
            addCriterion("PIPE_NAME in", values, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeNameNotIn(List<String> values) {
            addCriterion("PIPE_NAME not in", values, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeNameBetween(String value1, String value2) {
            addCriterion("PIPE_NAME between", value1, value2, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeNameNotBetween(String value1, String value2) {
            addCriterion("PIPE_NAME not between", value1, value2, "pipeName");
            return (Criteria) this;
        }

        public Criteria andPipeStatIsNull() {
            addCriterion("PIPE_STAT is null");
            return (Criteria) this;
        }

        public Criteria andPipeStatIsNotNull() {
            addCriterion("PIPE_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andPipeStatEqualTo(String value) {
            addCriterion("PIPE_STAT =", value, "pipeStat");
            return (Criteria) this;
        }

        public Criteria andPipeStatNotEqualTo(String value) {
            addCriterion("PIPE_STAT <>", value, "pipeStat");
            return (Criteria) this;
        }

        public Criteria andPipeStatGreaterThan(String value) {
            addCriterion("PIPE_STAT >", value, "pipeStat");
            return (Criteria) this;
        }

        public Criteria andPipeStatGreaterThanOrEqualTo(String value) {
            addCriterion("PIPE_STAT >=", value, "pipeStat");
            return (Criteria) this;
        }

        public Criteria andPipeStatLessThan(String value) {
            addCriterion("PIPE_STAT <", value, "pipeStat");
            return (Criteria) this;
        }

        public Criteria andPipeStatLessThanOrEqualTo(String value) {
            addCriterion("PIPE_STAT <=", value, "pipeStat");
            return (Criteria) this;
        }

        public Criteria andPipeStatLike(String value) {
            addCriterion("PIPE_STAT like", value, "pipeStat");
            return (Criteria) this;
        }

        public Criteria andPipeStatNotLike(String value) {
            addCriterion("PIPE_STAT not like", value, "pipeStat");
            return (Criteria) this;
        }

        public Criteria andPipeStatIn(List<String> values) {
            addCriterion("PIPE_STAT in", values, "pipeStat");
            return (Criteria) this;
        }

        public Criteria andPipeStatNotIn(List<String> values) {
            addCriterion("PIPE_STAT not in", values, "pipeStat");
            return (Criteria) this;
        }

        public Criteria andPipeStatBetween(String value1, String value2) {
            addCriterion("PIPE_STAT between", value1, value2, "pipeStat");
            return (Criteria) this;
        }

        public Criteria andPipeStatNotBetween(String value1, String value2) {
            addCriterion("PIPE_STAT not between", value1, value2, "pipeStat");
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

        public Criteria andPipeTypeIsNull() {
            addCriterion("PIPE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPipeTypeIsNotNull() {
            addCriterion("PIPE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPipeTypeEqualTo(String value) {
            addCriterion("PIPE_TYPE =", value, "pipeType");
            return (Criteria) this;
        }

        public Criteria andPipeTypeNotEqualTo(String value) {
            addCriterion("PIPE_TYPE <>", value, "pipeType");
            return (Criteria) this;
        }

        public Criteria andPipeTypeGreaterThan(String value) {
            addCriterion("PIPE_TYPE >", value, "pipeType");
            return (Criteria) this;
        }

        public Criteria andPipeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PIPE_TYPE >=", value, "pipeType");
            return (Criteria) this;
        }

        public Criteria andPipeTypeLessThan(String value) {
            addCriterion("PIPE_TYPE <", value, "pipeType");
            return (Criteria) this;
        }

        public Criteria andPipeTypeLessThanOrEqualTo(String value) {
            addCriterion("PIPE_TYPE <=", value, "pipeType");
            return (Criteria) this;
        }

        public Criteria andPipeTypeLike(String value) {
            addCriterion("PIPE_TYPE like", value, "pipeType");
            return (Criteria) this;
        }

        public Criteria andPipeTypeNotLike(String value) {
            addCriterion("PIPE_TYPE not like", value, "pipeType");
            return (Criteria) this;
        }

        public Criteria andPipeTypeIn(List<String> values) {
            addCriterion("PIPE_TYPE in", values, "pipeType");
            return (Criteria) this;
        }

        public Criteria andPipeTypeNotIn(List<String> values) {
            addCriterion("PIPE_TYPE not in", values, "pipeType");
            return (Criteria) this;
        }

        public Criteria andPipeTypeBetween(String value1, String value2) {
            addCriterion("PIPE_TYPE between", value1, value2, "pipeType");
            return (Criteria) this;
        }

        public Criteria andPipeTypeNotBetween(String value1, String value2) {
            addCriterion("PIPE_TYPE not between", value1, value2, "pipeType");
            return (Criteria) this;
        }

        public Criteria andBodyPartIsNull() {
            addCriterion("BODY_PART is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartIsNotNull() {
            addCriterion("BODY_PART is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartEqualTo(String value) {
            addCriterion("BODY_PART =", value, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andBodyPartNotEqualTo(String value) {
            addCriterion("BODY_PART <>", value, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andBodyPartGreaterThan(String value) {
            addCriterion("BODY_PART >", value, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andBodyPartGreaterThanOrEqualTo(String value) {
            addCriterion("BODY_PART >=", value, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andBodyPartLessThan(String value) {
            addCriterion("BODY_PART <", value, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andBodyPartLessThanOrEqualTo(String value) {
            addCriterion("BODY_PART <=", value, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andBodyPartLike(String value) {
            addCriterion("BODY_PART like", value, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andBodyPartNotLike(String value) {
            addCriterion("BODY_PART not like", value, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andBodyPartIn(List<String> values) {
            addCriterion("BODY_PART in", values, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andBodyPartNotIn(List<String> values) {
            addCriterion("BODY_PART not in", values, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andBodyPartBetween(String value1, String value2) {
            addCriterion("BODY_PART between", value1, value2, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andBodyPartNotBetween(String value1, String value2) {
            addCriterion("BODY_PART not between", value1, value2, "bodyPart");
            return (Criteria) this;
        }

        public Criteria andPipeModlIsNull() {
            addCriterion("PIPE_MODL is null");
            return (Criteria) this;
        }

        public Criteria andPipeModlIsNotNull() {
            addCriterion("PIPE_MODL is not null");
            return (Criteria) this;
        }

        public Criteria andPipeModlEqualTo(String value) {
            addCriterion("PIPE_MODL =", value, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeModlNotEqualTo(String value) {
            addCriterion("PIPE_MODL <>", value, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeModlGreaterThan(String value) {
            addCriterion("PIPE_MODL >", value, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeModlGreaterThanOrEqualTo(String value) {
            addCriterion("PIPE_MODL >=", value, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeModlLessThan(String value) {
            addCriterion("PIPE_MODL <", value, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeModlLessThanOrEqualTo(String value) {
            addCriterion("PIPE_MODL <=", value, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeModlLike(String value) {
            addCriterion("PIPE_MODL like", value, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeModlNotLike(String value) {
            addCriterion("PIPE_MODL not like", value, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeModlIn(List<String> values) {
            addCriterion("PIPE_MODL in", values, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeModlNotIn(List<String> values) {
            addCriterion("PIPE_MODL not in", values, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeModlBetween(String value1, String value2) {
            addCriterion("PIPE_MODL between", value1, value2, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeModlNotBetween(String value1, String value2) {
            addCriterion("PIPE_MODL not between", value1, value2, "pipeModl");
            return (Criteria) this;
        }

        public Criteria andPipeLengIsNull() {
            addCriterion("PIPE_LENG is null");
            return (Criteria) this;
        }

        public Criteria andPipeLengIsNotNull() {
            addCriterion("PIPE_LENG is not null");
            return (Criteria) this;
        }

        public Criteria andPipeLengEqualTo(String value) {
            addCriterion("PIPE_LENG =", value, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeLengNotEqualTo(String value) {
            addCriterion("PIPE_LENG <>", value, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeLengGreaterThan(String value) {
            addCriterion("PIPE_LENG >", value, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeLengGreaterThanOrEqualTo(String value) {
            addCriterion("PIPE_LENG >=", value, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeLengLessThan(String value) {
            addCriterion("PIPE_LENG <", value, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeLengLessThanOrEqualTo(String value) {
            addCriterion("PIPE_LENG <=", value, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeLengLike(String value) {
            addCriterion("PIPE_LENG like", value, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeLengNotLike(String value) {
            addCriterion("PIPE_LENG not like", value, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeLengIn(List<String> values) {
            addCriterion("PIPE_LENG in", values, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeLengNotIn(List<String> values) {
            addCriterion("PIPE_LENG not in", values, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeLengBetween(String value1, String value2) {
            addCriterion("PIPE_LENG between", value1, value2, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeLengNotBetween(String value1, String value2) {
            addCriterion("PIPE_LENG not between", value1, value2, "pipeLeng");
            return (Criteria) this;
        }

        public Criteria andPipeDpthIsNull() {
            addCriterion("PIPE_DPTH is null");
            return (Criteria) this;
        }

        public Criteria andPipeDpthIsNotNull() {
            addCriterion("PIPE_DPTH is not null");
            return (Criteria) this;
        }

        public Criteria andPipeDpthEqualTo(String value) {
            addCriterion("PIPE_DPTH =", value, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andPipeDpthNotEqualTo(String value) {
            addCriterion("PIPE_DPTH <>", value, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andPipeDpthGreaterThan(String value) {
            addCriterion("PIPE_DPTH >", value, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andPipeDpthGreaterThanOrEqualTo(String value) {
            addCriterion("PIPE_DPTH >=", value, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andPipeDpthLessThan(String value) {
            addCriterion("PIPE_DPTH <", value, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andPipeDpthLessThanOrEqualTo(String value) {
            addCriterion("PIPE_DPTH <=", value, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andPipeDpthLike(String value) {
            addCriterion("PIPE_DPTH like", value, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andPipeDpthNotLike(String value) {
            addCriterion("PIPE_DPTH not like", value, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andPipeDpthIn(List<String> values) {
            addCriterion("PIPE_DPTH in", values, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andPipeDpthNotIn(List<String> values) {
            addCriterion("PIPE_DPTH not in", values, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andPipeDpthBetween(String value1, String value2) {
            addCriterion("PIPE_DPTH between", value1, value2, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andPipeDpthNotBetween(String value1, String value2) {
            addCriterion("PIPE_DPTH not between", value1, value2, "pipeDpth");
            return (Criteria) this;
        }

        public Criteria andInTypeIsNull() {
            addCriterion("IN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInTypeIsNotNull() {
            addCriterion("IN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInTypeEqualTo(String value) {
            addCriterion("IN_TYPE =", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotEqualTo(String value) {
            addCriterion("IN_TYPE <>", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeGreaterThan(String value) {
            addCriterion("IN_TYPE >", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IN_TYPE >=", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLessThan(String value) {
            addCriterion("IN_TYPE <", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLessThanOrEqualTo(String value) {
            addCriterion("IN_TYPE <=", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLike(String value) {
            addCriterion("IN_TYPE like", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotLike(String value) {
            addCriterion("IN_TYPE not like", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeIn(List<String> values) {
            addCriterion("IN_TYPE in", values, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotIn(List<String> values) {
            addCriterion("IN_TYPE not in", values, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeBetween(String value1, String value2) {
            addCriterion("IN_TYPE between", value1, value2, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotBetween(String value1, String value2) {
            addCriterion("IN_TYPE not between", value1, value2, "inType");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNull() {
            addCriterion("IN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("IN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(Date value) {
            addCriterion("IN_TIME =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(Date value) {
            addCriterion("IN_TIME <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(Date value) {
            addCriterion("IN_TIME >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("IN_TIME >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(Date value) {
            addCriterion("IN_TIME <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(Date value) {
            addCriterion("IN_TIME <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<Date> values) {
            addCriterion("IN_TIME in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<Date> values) {
            addCriterion("IN_TIME not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(Date value1, Date value2) {
            addCriterion("IN_TIME between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(Date value1, Date value2) {
            addCriterion("IN_TIME not between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInUserIsNull() {
            addCriterion("IN_USER is null");
            return (Criteria) this;
        }

        public Criteria andInUserIsNotNull() {
            addCriterion("IN_USER is not null");
            return (Criteria) this;
        }

        public Criteria andInUserEqualTo(String value) {
            addCriterion("IN_USER =", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserNotEqualTo(String value) {
            addCriterion("IN_USER <>", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserGreaterThan(String value) {
            addCriterion("IN_USER >", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserGreaterThanOrEqualTo(String value) {
            addCriterion("IN_USER >=", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserLessThan(String value) {
            addCriterion("IN_USER <", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserLessThanOrEqualTo(String value) {
            addCriterion("IN_USER <=", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserLike(String value) {
            addCriterion("IN_USER like", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserNotLike(String value) {
            addCriterion("IN_USER not like", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserIn(List<String> values) {
            addCriterion("IN_USER in", values, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserNotIn(List<String> values) {
            addCriterion("IN_USER not in", values, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserBetween(String value1, String value2) {
            addCriterion("IN_USER between", value1, value2, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserNotBetween(String value1, String value2) {
            addCriterion("IN_USER not between", value1, value2, "inUser");
            return (Criteria) this;
        }

        public Criteria andInMemoIsNull() {
            addCriterion("IN_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andInMemoIsNotNull() {
            addCriterion("IN_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andInMemoEqualTo(String value) {
            addCriterion("IN_MEMO =", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoNotEqualTo(String value) {
            addCriterion("IN_MEMO <>", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoGreaterThan(String value) {
            addCriterion("IN_MEMO >", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoGreaterThanOrEqualTo(String value) {
            addCriterion("IN_MEMO >=", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoLessThan(String value) {
            addCriterion("IN_MEMO <", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoLessThanOrEqualTo(String value) {
            addCriterion("IN_MEMO <=", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoLike(String value) {
            addCriterion("IN_MEMO like", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoNotLike(String value) {
            addCriterion("IN_MEMO not like", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoIn(List<String> values) {
            addCriterion("IN_MEMO in", values, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoNotIn(List<String> values) {
            addCriterion("IN_MEMO not in", values, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoBetween(String value1, String value2) {
            addCriterion("IN_MEMO between", value1, value2, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoNotBetween(String value1, String value2) {
            addCriterion("IN_MEMO not between", value1, value2, "inMemo");
            return (Criteria) this;
        }

        public Criteria andChgNumbIsNull() {
            addCriterion("CHG_NUMB is null");
            return (Criteria) this;
        }

        public Criteria andChgNumbIsNotNull() {
            addCriterion("CHG_NUMB is not null");
            return (Criteria) this;
        }

        public Criteria andChgNumbEqualTo(Long value) {
            addCriterion("CHG_NUMB =", value, "chgNumb");
            return (Criteria) this;
        }

        public Criteria andChgNumbNotEqualTo(Long value) {
            addCriterion("CHG_NUMB <>", value, "chgNumb");
            return (Criteria) this;
        }

        public Criteria andChgNumbGreaterThan(Long value) {
            addCriterion("CHG_NUMB >", value, "chgNumb");
            return (Criteria) this;
        }

        public Criteria andChgNumbGreaterThanOrEqualTo(Long value) {
            addCriterion("CHG_NUMB >=", value, "chgNumb");
            return (Criteria) this;
        }

        public Criteria andChgNumbLessThan(Long value) {
            addCriterion("CHG_NUMB <", value, "chgNumb");
            return (Criteria) this;
        }

        public Criteria andChgNumbLessThanOrEqualTo(Long value) {
            addCriterion("CHG_NUMB <=", value, "chgNumb");
            return (Criteria) this;
        }

        public Criteria andChgNumbIn(List<Long> values) {
            addCriterion("CHG_NUMB in", values, "chgNumb");
            return (Criteria) this;
        }

        public Criteria andChgNumbNotIn(List<Long> values) {
            addCriterion("CHG_NUMB not in", values, "chgNumb");
            return (Criteria) this;
        }

        public Criteria andChgNumbBetween(Long value1, Long value2) {
            addCriterion("CHG_NUMB between", value1, value2, "chgNumb");
            return (Criteria) this;
        }

        public Criteria andChgNumbNotBetween(Long value1, Long value2) {
            addCriterion("CHG_NUMB not between", value1, value2, "chgNumb");
            return (Criteria) this;
        }

        public Criteria andChgTimeIsNull() {
            addCriterion("CHG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChgTimeIsNotNull() {
            addCriterion("CHG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChgTimeEqualTo(Date value) {
            addCriterion("CHG_TIME =", value, "chgTime");
            return (Criteria) this;
        }

        public Criteria andChgTimeNotEqualTo(Date value) {
            addCriterion("CHG_TIME <>", value, "chgTime");
            return (Criteria) this;
        }

        public Criteria andChgTimeGreaterThan(Date value) {
            addCriterion("CHG_TIME >", value, "chgTime");
            return (Criteria) this;
        }

        public Criteria andChgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHG_TIME >=", value, "chgTime");
            return (Criteria) this;
        }

        public Criteria andChgTimeLessThan(Date value) {
            addCriterion("CHG_TIME <", value, "chgTime");
            return (Criteria) this;
        }

        public Criteria andChgTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHG_TIME <=", value, "chgTime");
            return (Criteria) this;
        }

        public Criteria andChgTimeIn(List<Date> values) {
            addCriterion("CHG_TIME in", values, "chgTime");
            return (Criteria) this;
        }

        public Criteria andChgTimeNotIn(List<Date> values) {
            addCriterion("CHG_TIME not in", values, "chgTime");
            return (Criteria) this;
        }

        public Criteria andChgTimeBetween(Date value1, Date value2) {
            addCriterion("CHG_TIME between", value1, value2, "chgTime");
            return (Criteria) this;
        }

        public Criteria andChgTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHG_TIME not between", value1, value2, "chgTime");
            return (Criteria) this;
        }

        public Criteria andChgUserIsNull() {
            addCriterion("CHG_USER is null");
            return (Criteria) this;
        }

        public Criteria andChgUserIsNotNull() {
            addCriterion("CHG_USER is not null");
            return (Criteria) this;
        }

        public Criteria andChgUserEqualTo(String value) {
            addCriterion("CHG_USER =", value, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgUserNotEqualTo(String value) {
            addCriterion("CHG_USER <>", value, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgUserGreaterThan(String value) {
            addCriterion("CHG_USER >", value, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgUserGreaterThanOrEqualTo(String value) {
            addCriterion("CHG_USER >=", value, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgUserLessThan(String value) {
            addCriterion("CHG_USER <", value, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgUserLessThanOrEqualTo(String value) {
            addCriterion("CHG_USER <=", value, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgUserLike(String value) {
            addCriterion("CHG_USER like", value, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgUserNotLike(String value) {
            addCriterion("CHG_USER not like", value, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgUserIn(List<String> values) {
            addCriterion("CHG_USER in", values, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgUserNotIn(List<String> values) {
            addCriterion("CHG_USER not in", values, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgUserBetween(String value1, String value2) {
            addCriterion("CHG_USER between", value1, value2, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgUserNotBetween(String value1, String value2) {
            addCriterion("CHG_USER not between", value1, value2, "chgUser");
            return (Criteria) this;
        }

        public Criteria andChgMemoIsNull() {
            addCriterion("CHG_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andChgMemoIsNotNull() {
            addCriterion("CHG_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andChgMemoEqualTo(String value) {
            addCriterion("CHG_MEMO =", value, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andChgMemoNotEqualTo(String value) {
            addCriterion("CHG_MEMO <>", value, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andChgMemoGreaterThan(String value) {
            addCriterion("CHG_MEMO >", value, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andChgMemoGreaterThanOrEqualTo(String value) {
            addCriterion("CHG_MEMO >=", value, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andChgMemoLessThan(String value) {
            addCriterion("CHG_MEMO <", value, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andChgMemoLessThanOrEqualTo(String value) {
            addCriterion("CHG_MEMO <=", value, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andChgMemoLike(String value) {
            addCriterion("CHG_MEMO like", value, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andChgMemoNotLike(String value) {
            addCriterion("CHG_MEMO not like", value, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andChgMemoIn(List<String> values) {
            addCriterion("CHG_MEMO in", values, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andChgMemoNotIn(List<String> values) {
            addCriterion("CHG_MEMO not in", values, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andChgMemoBetween(String value1, String value2) {
            addCriterion("CHG_MEMO between", value1, value2, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andChgMemoNotBetween(String value1, String value2) {
            addCriterion("CHG_MEMO not between", value1, value2, "chgMemo");
            return (Criteria) this;
        }

        public Criteria andOutTypeIsNull() {
            addCriterion("OUT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOutTypeIsNotNull() {
            addCriterion("OUT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOutTypeEqualTo(String value) {
            addCriterion("OUT_TYPE =", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotEqualTo(String value) {
            addCriterion("OUT_TYPE <>", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeGreaterThan(String value) {
            addCriterion("OUT_TYPE >", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_TYPE >=", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeLessThan(String value) {
            addCriterion("OUT_TYPE <", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeLessThanOrEqualTo(String value) {
            addCriterion("OUT_TYPE <=", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeLike(String value) {
            addCriterion("OUT_TYPE like", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotLike(String value) {
            addCriterion("OUT_TYPE not like", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeIn(List<String> values) {
            addCriterion("OUT_TYPE in", values, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotIn(List<String> values) {
            addCriterion("OUT_TYPE not in", values, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeBetween(String value1, String value2) {
            addCriterion("OUT_TYPE between", value1, value2, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotBetween(String value1, String value2) {
            addCriterion("OUT_TYPE not between", value1, value2, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNull() {
            addCriterion("OUT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNotNull() {
            addCriterion("OUT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeEqualTo(Date value) {
            addCriterion("OUT_TIME =", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotEqualTo(Date value) {
            addCriterion("OUT_TIME <>", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThan(Date value) {
            addCriterion("OUT_TIME >", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OUT_TIME >=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThan(Date value) {
            addCriterion("OUT_TIME <", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("OUT_TIME <=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIn(List<Date> values) {
            addCriterion("OUT_TIME in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotIn(List<Date> values) {
            addCriterion("OUT_TIME not in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeBetween(Date value1, Date value2) {
            addCriterion("OUT_TIME between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("OUT_TIME not between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutUserIsNull() {
            addCriterion("OUT_USER is null");
            return (Criteria) this;
        }

        public Criteria andOutUserIsNotNull() {
            addCriterion("OUT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andOutUserEqualTo(String value) {
            addCriterion("OUT_USER =", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserNotEqualTo(String value) {
            addCriterion("OUT_USER <>", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserGreaterThan(String value) {
            addCriterion("OUT_USER >", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_USER >=", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserLessThan(String value) {
            addCriterion("OUT_USER <", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserLessThanOrEqualTo(String value) {
            addCriterion("OUT_USER <=", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserLike(String value) {
            addCriterion("OUT_USER like", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserNotLike(String value) {
            addCriterion("OUT_USER not like", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserIn(List<String> values) {
            addCriterion("OUT_USER in", values, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserNotIn(List<String> values) {
            addCriterion("OUT_USER not in", values, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserBetween(String value1, String value2) {
            addCriterion("OUT_USER between", value1, value2, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserNotBetween(String value1, String value2) {
            addCriterion("OUT_USER not between", value1, value2, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutMemoIsNull() {
            addCriterion("OUT_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andOutMemoIsNotNull() {
            addCriterion("OUT_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andOutMemoEqualTo(String value) {
            addCriterion("OUT_MEMO =", value, "outMemo");
            return (Criteria) this;
        }

        public Criteria andOutMemoNotEqualTo(String value) {
            addCriterion("OUT_MEMO <>", value, "outMemo");
            return (Criteria) this;
        }

        public Criteria andOutMemoGreaterThan(String value) {
            addCriterion("OUT_MEMO >", value, "outMemo");
            return (Criteria) this;
        }

        public Criteria andOutMemoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_MEMO >=", value, "outMemo");
            return (Criteria) this;
        }

        public Criteria andOutMemoLessThan(String value) {
            addCriterion("OUT_MEMO <", value, "outMemo");
            return (Criteria) this;
        }

        public Criteria andOutMemoLessThanOrEqualTo(String value) {
            addCriterion("OUT_MEMO <=", value, "outMemo");
            return (Criteria) this;
        }

        public Criteria andOutMemoLike(String value) {
            addCriterion("OUT_MEMO like", value, "outMemo");
            return (Criteria) this;
        }

        public Criteria andOutMemoNotLike(String value) {
            addCriterion("OUT_MEMO not like", value, "outMemo");
            return (Criteria) this;
        }

        public Criteria andOutMemoIn(List<String> values) {
            addCriterion("OUT_MEMO in", values, "outMemo");
            return (Criteria) this;
        }

        public Criteria andOutMemoNotIn(List<String> values) {
            addCriterion("OUT_MEMO not in", values, "outMemo");
            return (Criteria) this;
        }

        public Criteria andOutMemoBetween(String value1, String value2) {
            addCriterion("OUT_MEMO between", value1, value2, "outMemo");
            return (Criteria) this;
        }

        public Criteria andOutMemoNotBetween(String value1, String value2) {
            addCriterion("OUT_MEMO not between", value1, value2, "outMemo");
            return (Criteria) this;
        }

        public Criteria andVldDayIsNull() {
            addCriterion("VLD_DAY is null");
            return (Criteria) this;
        }

        public Criteria andVldDayIsNotNull() {
            addCriterion("VLD_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andVldDayEqualTo(Long value) {
            addCriterion("VLD_DAY =", value, "vldDay");
            return (Criteria) this;
        }

        public Criteria andVldDayNotEqualTo(Long value) {
            addCriterion("VLD_DAY <>", value, "vldDay");
            return (Criteria) this;
        }

        public Criteria andVldDayGreaterThan(Long value) {
            addCriterion("VLD_DAY >", value, "vldDay");
            return (Criteria) this;
        }

        public Criteria andVldDayGreaterThanOrEqualTo(Long value) {
            addCriterion("VLD_DAY >=", value, "vldDay");
            return (Criteria) this;
        }

        public Criteria andVldDayLessThan(Long value) {
            addCriterion("VLD_DAY <", value, "vldDay");
            return (Criteria) this;
        }

        public Criteria andVldDayLessThanOrEqualTo(Long value) {
            addCriterion("VLD_DAY <=", value, "vldDay");
            return (Criteria) this;
        }

        public Criteria andVldDayIn(List<Long> values) {
            addCriterion("VLD_DAY in", values, "vldDay");
            return (Criteria) this;
        }

        public Criteria andVldDayNotIn(List<Long> values) {
            addCriterion("VLD_DAY not in", values, "vldDay");
            return (Criteria) this;
        }

        public Criteria andVldDayBetween(Long value1, Long value2) {
            addCriterion("VLD_DAY between", value1, value2, "vldDay");
            return (Criteria) this;
        }

        public Criteria andVldDayNotBetween(Long value1, Long value2) {
            addCriterion("VLD_DAY not between", value1, value2, "vldDay");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("CRT_TIME =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("CRT_TIME <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("CRT_TIME >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("CRT_TIME <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("CRT_TIME in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("CRT_TIME not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNull() {
            addCriterion("CRT_USER is null");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNotNull() {
            addCriterion("CRT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUserEqualTo(String value) {
            addCriterion("CRT_USER =", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotEqualTo(String value) {
            addCriterion("CRT_USER <>", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThan(String value) {
            addCriterion("CRT_USER >", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USER >=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThan(String value) {
            addCriterion("CRT_USER <", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThanOrEqualTo(String value) {
            addCriterion("CRT_USER <=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLike(String value) {
            addCriterion("CRT_USER like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotLike(String value) {
            addCriterion("CRT_USER not like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserIn(List<String> values) {
            addCriterion("CRT_USER in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotIn(List<String> values) {
            addCriterion("CRT_USER not in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserBetween(String value1, String value2) {
            addCriterion("CRT_USER between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotBetween(String value1, String value2) {
            addCriterion("CRT_USER not between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("MOD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("MOD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("MOD_TIME =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("MOD_TIME <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("MOD_TIME >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("MOD_TIME <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("MOD_TIME in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("MOD_TIME not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModUserIsNull() {
            addCriterion("MOD_USER is null");
            return (Criteria) this;
        }

        public Criteria andModUserIsNotNull() {
            addCriterion("MOD_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModUserEqualTo(String value) {
            addCriterion("MOD_USER =", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotEqualTo(String value) {
            addCriterion("MOD_USER <>", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserGreaterThan(String value) {
            addCriterion("MOD_USER >", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USER >=", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLessThan(String value) {
            addCriterion("MOD_USER <", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLessThanOrEqualTo(String value) {
            addCriterion("MOD_USER <=", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLike(String value) {
            addCriterion("MOD_USER like", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotLike(String value) {
            addCriterion("MOD_USER not like", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserIn(List<String> values) {
            addCriterion("MOD_USER in", values, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotIn(List<String> values) {
            addCriterion("MOD_USER not in", values, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserBetween(String value1, String value2) {
            addCriterion("MOD_USER between", value1, value2, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotBetween(String value1, String value2) {
            addCriterion("MOD_USER not between", value1, value2, "modUser");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisIsNull() {
            addCriterion("PIPE_SEQ_HIS is null");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisIsNotNull() {
            addCriterion("PIPE_SEQ_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisEqualTo(String value) {
            addCriterion("PIPE_SEQ_HIS =", value, "pipeSeqHis");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisNotEqualTo(String value) {
            addCriterion("PIPE_SEQ_HIS <>", value, "pipeSeqHis");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisGreaterThan(String value) {
            addCriterion("PIPE_SEQ_HIS >", value, "pipeSeqHis");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisGreaterThanOrEqualTo(String value) {
            addCriterion("PIPE_SEQ_HIS >=", value, "pipeSeqHis");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisLessThan(String value) {
            addCriterion("PIPE_SEQ_HIS <", value, "pipeSeqHis");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisLessThanOrEqualTo(String value) {
            addCriterion("PIPE_SEQ_HIS <=", value, "pipeSeqHis");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisLike(String value) {
            addCriterion("PIPE_SEQ_HIS like", value, "pipeSeqHis");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisNotLike(String value) {
            addCriterion("PIPE_SEQ_HIS not like", value, "pipeSeqHis");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisIn(List<String> values) {
            addCriterion("PIPE_SEQ_HIS in", values, "pipeSeqHis");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisNotIn(List<String> values) {
            addCriterion("PIPE_SEQ_HIS not in", values, "pipeSeqHis");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisBetween(String value1, String value2) {
            addCriterion("PIPE_SEQ_HIS between", value1, value2, "pipeSeqHis");
            return (Criteria) this;
        }

        public Criteria andPipeSeqHisNotBetween(String value1, String value2) {
            addCriterion("PIPE_SEQ_HIS not between", value1, value2, "pipeSeqHis");
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