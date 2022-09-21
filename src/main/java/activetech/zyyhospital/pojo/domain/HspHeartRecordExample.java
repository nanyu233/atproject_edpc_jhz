package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspHeartRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspHeartRecordExample() {
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

        public Criteria andHeartSeqIsNull() {
            addCriterion("HEART_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andHeartSeqIsNotNull() {
            addCriterion("HEART_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andHeartSeqEqualTo(String value) {
            addCriterion("HEART_SEQ =", value, "heartSeq");
            return (Criteria) this;
        }

        public Criteria andHeartSeqNotEqualTo(String value) {
            addCriterion("HEART_SEQ <>", value, "heartSeq");
            return (Criteria) this;
        }

        public Criteria andHeartSeqGreaterThan(String value) {
            addCriterion("HEART_SEQ >", value, "heartSeq");
            return (Criteria) this;
        }

        public Criteria andHeartSeqGreaterThanOrEqualTo(String value) {
            addCriterion("HEART_SEQ >=", value, "heartSeq");
            return (Criteria) this;
        }

        public Criteria andHeartSeqLessThan(String value) {
            addCriterion("HEART_SEQ <", value, "heartSeq");
            return (Criteria) this;
        }

        public Criteria andHeartSeqLessThanOrEqualTo(String value) {
            addCriterion("HEART_SEQ <=", value, "heartSeq");
            return (Criteria) this;
        }

        public Criteria andHeartSeqLike(String value) {
            addCriterion("HEART_SEQ like", value, "heartSeq");
            return (Criteria) this;
        }

        public Criteria andHeartSeqNotLike(String value) {
            addCriterion("HEART_SEQ not like", value, "heartSeq");
            return (Criteria) this;
        }

        public Criteria andHeartSeqIn(List<String> values) {
            addCriterion("HEART_SEQ in", values, "heartSeq");
            return (Criteria) this;
        }

        public Criteria andHeartSeqNotIn(List<String> values) {
            addCriterion("HEART_SEQ not in", values, "heartSeq");
            return (Criteria) this;
        }

        public Criteria andHeartSeqBetween(String value1, String value2) {
            addCriterion("HEART_SEQ between", value1, value2, "heartSeq");
            return (Criteria) this;
        }

        public Criteria andHeartSeqNotBetween(String value1, String value2) {
            addCriterion("HEART_SEQ not between", value1, value2, "heartSeq");
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

        public Criteria andRescueTimeIsNull() {
            addCriterion("RESCUE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRescueTimeIsNotNull() {
            addCriterion("RESCUE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRescueTimeEqualTo(Date value) {
            addCriterion("RESCUE_TIME =", value, "rescueTime");
            return (Criteria) this;
        }

        public Criteria andRescueTimeNotEqualTo(Date value) {
            addCriterion("RESCUE_TIME <>", value, "rescueTime");
            return (Criteria) this;
        }

        public Criteria andRescueTimeGreaterThan(Date value) {
            addCriterion("RESCUE_TIME >", value, "rescueTime");
            return (Criteria) this;
        }

        public Criteria andRescueTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RESCUE_TIME >=", value, "rescueTime");
            return (Criteria) this;
        }

        public Criteria andRescueTimeLessThan(Date value) {
            addCriterion("RESCUE_TIME <", value, "rescueTime");
            return (Criteria) this;
        }

        public Criteria andRescueTimeLessThanOrEqualTo(Date value) {
            addCriterion("RESCUE_TIME <=", value, "rescueTime");
            return (Criteria) this;
        }

        public Criteria andRescueTimeIn(List<Date> values) {
            addCriterion("RESCUE_TIME in", values, "rescueTime");
            return (Criteria) this;
        }

        public Criteria andRescueTimeNotIn(List<Date> values) {
            addCriterion("RESCUE_TIME not in", values, "rescueTime");
            return (Criteria) this;
        }

        public Criteria andRescueTimeBetween(Date value1, Date value2) {
            addCriterion("RESCUE_TIME between", value1, value2, "rescueTime");
            return (Criteria) this;
        }

        public Criteria andRescueTimeNotBetween(Date value1, Date value2) {
            addCriterion("RESCUE_TIME not between", value1, value2, "rescueTime");
            return (Criteria) this;
        }

        public Criteria andSenStuCodIsNull() {
            addCriterion("SEN_STU_COD is null");
            return (Criteria) this;
        }

        public Criteria andSenStuCodIsNotNull() {
            addCriterion("SEN_STU_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSenStuCodEqualTo(String value) {
            addCriterion("SEN_STU_COD =", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodNotEqualTo(String value) {
            addCriterion("SEN_STU_COD <>", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodGreaterThan(String value) {
            addCriterion("SEN_STU_COD >", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodGreaterThanOrEqualTo(String value) {
            addCriterion("SEN_STU_COD >=", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodLessThan(String value) {
            addCriterion("SEN_STU_COD <", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodLessThanOrEqualTo(String value) {
            addCriterion("SEN_STU_COD <=", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodLike(String value) {
            addCriterion("SEN_STU_COD like", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodNotLike(String value) {
            addCriterion("SEN_STU_COD not like", value, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodIn(List<String> values) {
            addCriterion("SEN_STU_COD in", values, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodNotIn(List<String> values) {
            addCriterion("SEN_STU_COD not in", values, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodBetween(String value1, String value2) {
            addCriterion("SEN_STU_COD between", value1, value2, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andSenStuCodNotBetween(String value1, String value2) {
            addCriterion("SEN_STU_COD not between", value1, value2, "senStuCod");
            return (Criteria) this;
        }

        public Criteria andPupilLeftIsNull() {
            addCriterion("PUPIL_LEFT is null");
            return (Criteria) this;
        }

        public Criteria andPupilLeftIsNotNull() {
            addCriterion("PUPIL_LEFT is not null");
            return (Criteria) this;
        }

        public Criteria andPupilLeftEqualTo(String value) {
            addCriterion("PUPIL_LEFT =", value, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilLeftNotEqualTo(String value) {
            addCriterion("PUPIL_LEFT <>", value, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilLeftGreaterThan(String value) {
            addCriterion("PUPIL_LEFT >", value, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilLeftGreaterThanOrEqualTo(String value) {
            addCriterion("PUPIL_LEFT >=", value, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilLeftLessThan(String value) {
            addCriterion("PUPIL_LEFT <", value, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilLeftLessThanOrEqualTo(String value) {
            addCriterion("PUPIL_LEFT <=", value, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilLeftLike(String value) {
            addCriterion("PUPIL_LEFT like", value, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilLeftNotLike(String value) {
            addCriterion("PUPIL_LEFT not like", value, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilLeftIn(List<String> values) {
            addCriterion("PUPIL_LEFT in", values, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilLeftNotIn(List<String> values) {
            addCriterion("PUPIL_LEFT not in", values, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilLeftBetween(String value1, String value2) {
            addCriterion("PUPIL_LEFT between", value1, value2, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilLeftNotBetween(String value1, String value2) {
            addCriterion("PUPIL_LEFT not between", value1, value2, "pupilLeft");
            return (Criteria) this;
        }

        public Criteria andPupilRightIsNull() {
            addCriterion("PUPIL_RIGHT is null");
            return (Criteria) this;
        }

        public Criteria andPupilRightIsNotNull() {
            addCriterion("PUPIL_RIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andPupilRightEqualTo(String value) {
            addCriterion("PUPIL_RIGHT =", value, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilRightNotEqualTo(String value) {
            addCriterion("PUPIL_RIGHT <>", value, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilRightGreaterThan(String value) {
            addCriterion("PUPIL_RIGHT >", value, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilRightGreaterThanOrEqualTo(String value) {
            addCriterion("PUPIL_RIGHT >=", value, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilRightLessThan(String value) {
            addCriterion("PUPIL_RIGHT <", value, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilRightLessThanOrEqualTo(String value) {
            addCriterion("PUPIL_RIGHT <=", value, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilRightLike(String value) {
            addCriterion("PUPIL_RIGHT like", value, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilRightNotLike(String value) {
            addCriterion("PUPIL_RIGHT not like", value, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilRightIn(List<String> values) {
            addCriterion("PUPIL_RIGHT in", values, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilRightNotIn(List<String> values) {
            addCriterion("PUPIL_RIGHT not in", values, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilRightBetween(String value1, String value2) {
            addCriterion("PUPIL_RIGHT between", value1, value2, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilRightNotBetween(String value1, String value2) {
            addCriterion("PUPIL_RIGHT not between", value1, value2, "pupilRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftIsNull() {
            addCriterion("PUPIL_SIZE_LEFT is null");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftIsNotNull() {
            addCriterion("PUPIL_SIZE_LEFT is not null");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftEqualTo(String value) {
            addCriterion("PUPIL_SIZE_LEFT =", value, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftNotEqualTo(String value) {
            addCriterion("PUPIL_SIZE_LEFT <>", value, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftGreaterThan(String value) {
            addCriterion("PUPIL_SIZE_LEFT >", value, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftGreaterThanOrEqualTo(String value) {
            addCriterion("PUPIL_SIZE_LEFT >=", value, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftLessThan(String value) {
            addCriterion("PUPIL_SIZE_LEFT <", value, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftLessThanOrEqualTo(String value) {
            addCriterion("PUPIL_SIZE_LEFT <=", value, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftLike(String value) {
            addCriterion("PUPIL_SIZE_LEFT like", value, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftNotLike(String value) {
            addCriterion("PUPIL_SIZE_LEFT not like", value, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftIn(List<String> values) {
            addCriterion("PUPIL_SIZE_LEFT in", values, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftNotIn(List<String> values) {
            addCriterion("PUPIL_SIZE_LEFT not in", values, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftBetween(String value1, String value2) {
            addCriterion("PUPIL_SIZE_LEFT between", value1, value2, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeLeftNotBetween(String value1, String value2) {
            addCriterion("PUPIL_SIZE_LEFT not between", value1, value2, "pupilSizeLeft");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightIsNull() {
            addCriterion("PUPIL_SIZE_RIGHT is null");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightIsNotNull() {
            addCriterion("PUPIL_SIZE_RIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightEqualTo(String value) {
            addCriterion("PUPIL_SIZE_RIGHT =", value, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightNotEqualTo(String value) {
            addCriterion("PUPIL_SIZE_RIGHT <>", value, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightGreaterThan(String value) {
            addCriterion("PUPIL_SIZE_RIGHT >", value, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightGreaterThanOrEqualTo(String value) {
            addCriterion("PUPIL_SIZE_RIGHT >=", value, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightLessThan(String value) {
            addCriterion("PUPIL_SIZE_RIGHT <", value, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightLessThanOrEqualTo(String value) {
            addCriterion("PUPIL_SIZE_RIGHT <=", value, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightLike(String value) {
            addCriterion("PUPIL_SIZE_RIGHT like", value, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightNotLike(String value) {
            addCriterion("PUPIL_SIZE_RIGHT not like", value, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightIn(List<String> values) {
            addCriterion("PUPIL_SIZE_RIGHT in", values, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightNotIn(List<String> values) {
            addCriterion("PUPIL_SIZE_RIGHT not in", values, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightBetween(String value1, String value2) {
            addCriterion("PUPIL_SIZE_RIGHT between", value1, value2, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andPupilSizeRightNotBetween(String value1, String value2) {
            addCriterion("PUPIL_SIZE_RIGHT not between", value1, value2, "pupilSizeRight");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNull() {
            addCriterion("HRT_RTE is null");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNotNull() {
            addCriterion("HRT_RTE is not null");
            return (Criteria) this;
        }

        public Criteria andHrtRteEqualTo(String value) {
            addCriterion("HRT_RTE =", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotEqualTo(String value) {
            addCriterion("HRT_RTE <>", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThan(String value) {
            addCriterion("HRT_RTE >", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThanOrEqualTo(String value) {
            addCriterion("HRT_RTE >=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThan(String value) {
            addCriterion("HRT_RTE <", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThanOrEqualTo(String value) {
            addCriterion("HRT_RTE <=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLike(String value) {
            addCriterion("HRT_RTE like", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotLike(String value) {
            addCriterion("HRT_RTE not like", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteIn(List<String> values) {
            addCriterion("HRT_RTE in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotIn(List<String> values) {
            addCriterion("HRT_RTE not in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteBetween(String value1, String value2) {
            addCriterion("HRT_RTE between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotBetween(String value1, String value2) {
            addCriterion("HRT_RTE not between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmIsNull() {
            addCriterion("HRT_RHYTHM is null");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmIsNotNull() {
            addCriterion("HRT_RHYTHM is not null");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmEqualTo(String value) {
            addCriterion("HRT_RHYTHM =", value, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmNotEqualTo(String value) {
            addCriterion("HRT_RHYTHM <>", value, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmGreaterThan(String value) {
            addCriterion("HRT_RHYTHM >", value, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmGreaterThanOrEqualTo(String value) {
            addCriterion("HRT_RHYTHM >=", value, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmLessThan(String value) {
            addCriterion("HRT_RHYTHM <", value, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmLessThanOrEqualTo(String value) {
            addCriterion("HRT_RHYTHM <=", value, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmLike(String value) {
            addCriterion("HRT_RHYTHM like", value, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmNotLike(String value) {
            addCriterion("HRT_RHYTHM not like", value, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmIn(List<String> values) {
            addCriterion("HRT_RHYTHM in", values, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmNotIn(List<String> values) {
            addCriterion("HRT_RHYTHM not in", values, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmBetween(String value1, String value2) {
            addCriterion("HRT_RHYTHM between", value1, value2, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmNotBetween(String value1, String value2) {
            addCriterion("HRT_RHYTHM not between", value1, value2, "hrtRhythm");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgIsNull() {
            addCriterion("SBP_NBR_FLG is null");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgIsNotNull() {
            addCriterion("SBP_NBR_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgEqualTo(String value) {
            addCriterion("SBP_NBR_FLG =", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotEqualTo(String value) {
            addCriterion("SBP_NBR_FLG <>", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgGreaterThan(String value) {
            addCriterion("SBP_NBR_FLG >", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgGreaterThanOrEqualTo(String value) {
            addCriterion("SBP_NBR_FLG >=", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgLessThan(String value) {
            addCriterion("SBP_NBR_FLG <", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgLessThanOrEqualTo(String value) {
            addCriterion("SBP_NBR_FLG <=", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgLike(String value) {
            addCriterion("SBP_NBR_FLG like", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotLike(String value) {
            addCriterion("SBP_NBR_FLG not like", value, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgIn(List<String> values) {
            addCriterion("SBP_NBR_FLG in", values, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotIn(List<String> values) {
            addCriterion("SBP_NBR_FLG not in", values, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgBetween(String value1, String value2) {
            addCriterion("SBP_NBR_FLG between", value1, value2, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpNbrFlgNotBetween(String value1, String value2) {
            addCriterion("SBP_NBR_FLG not between", value1, value2, "sbpNbrFlg");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIsNull() {
            addCriterion("SBP_UP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIsNotNull() {
            addCriterion("SBP_UP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrEqualTo(String value) {
            addCriterion("SBP_UP_NBR =", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotEqualTo(String value) {
            addCriterion("SBP_UP_NBR <>", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrGreaterThan(String value) {
            addCriterion("SBP_UP_NBR >", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrGreaterThanOrEqualTo(String value) {
            addCriterion("SBP_UP_NBR >=", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLessThan(String value) {
            addCriterion("SBP_UP_NBR <", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLessThanOrEqualTo(String value) {
            addCriterion("SBP_UP_NBR <=", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrLike(String value) {
            addCriterion("SBP_UP_NBR like", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotLike(String value) {
            addCriterion("SBP_UP_NBR not like", value, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrIn(List<String> values) {
            addCriterion("SBP_UP_NBR in", values, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotIn(List<String> values) {
            addCriterion("SBP_UP_NBR not in", values, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrBetween(String value1, String value2) {
            addCriterion("SBP_UP_NBR between", value1, value2, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpUpNbrNotBetween(String value1, String value2) {
            addCriterion("SBP_UP_NBR not between", value1, value2, "sbpUpNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIsNull() {
            addCriterion("SBP_DOWN_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIsNotNull() {
            addCriterion("SBP_DOWN_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR =", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR <>", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrGreaterThan(String value) {
            addCriterion("SBP_DOWN_NBR >", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrGreaterThanOrEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR >=", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLessThan(String value) {
            addCriterion("SBP_DOWN_NBR <", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLessThanOrEqualTo(String value) {
            addCriterion("SBP_DOWN_NBR <=", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrLike(String value) {
            addCriterion("SBP_DOWN_NBR like", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotLike(String value) {
            addCriterion("SBP_DOWN_NBR not like", value, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrIn(List<String> values) {
            addCriterion("SBP_DOWN_NBR in", values, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotIn(List<String> values) {
            addCriterion("SBP_DOWN_NBR not in", values, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrBetween(String value1, String value2) {
            addCriterion("SBP_DOWN_NBR between", value1, value2, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andSbpDownNbrNotBetween(String value1, String value2) {
            addCriterion("SBP_DOWN_NBR not between", value1, value2, "sbpDownNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgIsNull() {
            addCriterion("BRE_NBR_FLG is null");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgIsNotNull() {
            addCriterion("BRE_NBR_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgEqualTo(String value) {
            addCriterion("BRE_NBR_FLG =", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotEqualTo(String value) {
            addCriterion("BRE_NBR_FLG <>", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgGreaterThan(String value) {
            addCriterion("BRE_NBR_FLG >", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgGreaterThanOrEqualTo(String value) {
            addCriterion("BRE_NBR_FLG >=", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgLessThan(String value) {
            addCriterion("BRE_NBR_FLG <", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgLessThanOrEqualTo(String value) {
            addCriterion("BRE_NBR_FLG <=", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgLike(String value) {
            addCriterion("BRE_NBR_FLG like", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotLike(String value) {
            addCriterion("BRE_NBR_FLG not like", value, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgIn(List<String> values) {
            addCriterion("BRE_NBR_FLG in", values, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotIn(List<String> values) {
            addCriterion("BRE_NBR_FLG not in", values, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgBetween(String value1, String value2) {
            addCriterion("BRE_NBR_FLG between", value1, value2, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrFlgNotBetween(String value1, String value2) {
            addCriterion("BRE_NBR_FLG not between", value1, value2, "breNbrFlg");
            return (Criteria) this;
        }

        public Criteria andBreNbrIsNull() {
            addCriterion("BRE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andBreNbrIsNotNull() {
            addCriterion("BRE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andBreNbrEqualTo(String value) {
            addCriterion("BRE_NBR =", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotEqualTo(String value) {
            addCriterion("BRE_NBR <>", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThan(String value) {
            addCriterion("BRE_NBR >", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrGreaterThanOrEqualTo(String value) {
            addCriterion("BRE_NBR >=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThan(String value) {
            addCriterion("BRE_NBR <", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLessThanOrEqualTo(String value) {
            addCriterion("BRE_NBR <=", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrLike(String value) {
            addCriterion("BRE_NBR like", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotLike(String value) {
            addCriterion("BRE_NBR not like", value, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrIn(List<String> values) {
            addCriterion("BRE_NBR in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotIn(List<String> values) {
            addCriterion("BRE_NBR not in", values, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrBetween(String value1, String value2) {
            addCriterion("BRE_NBR between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andBreNbrNotBetween(String value1, String value2) {
            addCriterion("BRE_NBR not between", value1, value2, "breNbr");
            return (Criteria) this;
        }

        public Criteria andXyFlgIsNull() {
            addCriterion("XY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andXyFlgIsNotNull() {
            addCriterion("XY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andXyFlgEqualTo(String value) {
            addCriterion("XY_FLG =", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotEqualTo(String value) {
            addCriterion("XY_FLG <>", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgGreaterThan(String value) {
            addCriterion("XY_FLG >", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgGreaterThanOrEqualTo(String value) {
            addCriterion("XY_FLG >=", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgLessThan(String value) {
            addCriterion("XY_FLG <", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgLessThanOrEqualTo(String value) {
            addCriterion("XY_FLG <=", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgLike(String value) {
            addCriterion("XY_FLG like", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotLike(String value) {
            addCriterion("XY_FLG not like", value, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgIn(List<String> values) {
            addCriterion("XY_FLG in", values, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotIn(List<String> values) {
            addCriterion("XY_FLG not in", values, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgBetween(String value1, String value2) {
            addCriterion("XY_FLG between", value1, value2, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyFlgNotBetween(String value1, String value2) {
            addCriterion("XY_FLG not between", value1, value2, "xyFlg");
            return (Criteria) this;
        }

        public Criteria andXyIsNull() {
            addCriterion("XY is null");
            return (Criteria) this;
        }

        public Criteria andXyIsNotNull() {
            addCriterion("XY is not null");
            return (Criteria) this;
        }

        public Criteria andXyEqualTo(String value) {
            addCriterion("XY =", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotEqualTo(String value) {
            addCriterion("XY <>", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyGreaterThan(String value) {
            addCriterion("XY >", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyGreaterThanOrEqualTo(String value) {
            addCriterion("XY >=", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLessThan(String value) {
            addCriterion("XY <", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLessThanOrEqualTo(String value) {
            addCriterion("XY <=", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLike(String value) {
            addCriterion("XY like", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotLike(String value) {
            addCriterion("XY not like", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyIn(List<String> values) {
            addCriterion("XY in", values, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotIn(List<String> values) {
            addCriterion("XY not in", values, "xy");
            return (Criteria) this;
        }

        public Criteria andXyBetween(String value1, String value2) {
            addCriterion("XY between", value1, value2, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotBetween(String value1, String value2) {
            addCriterion("XY not between", value1, value2, "xy");
            return (Criteria) this;
        }

        public Criteria andVentilationIsNull() {
            addCriterion("VENTILATION is null");
            return (Criteria) this;
        }

        public Criteria andVentilationIsNotNull() {
            addCriterion("VENTILATION is not null");
            return (Criteria) this;
        }

        public Criteria andVentilationEqualTo(String value) {
            addCriterion("VENTILATION =", value, "ventilation");
            return (Criteria) this;
        }

        public Criteria andVentilationNotEqualTo(String value) {
            addCriterion("VENTILATION <>", value, "ventilation");
            return (Criteria) this;
        }

        public Criteria andVentilationGreaterThan(String value) {
            addCriterion("VENTILATION >", value, "ventilation");
            return (Criteria) this;
        }

        public Criteria andVentilationGreaterThanOrEqualTo(String value) {
            addCriterion("VENTILATION >=", value, "ventilation");
            return (Criteria) this;
        }

        public Criteria andVentilationLessThan(String value) {
            addCriterion("VENTILATION <", value, "ventilation");
            return (Criteria) this;
        }

        public Criteria andVentilationLessThanOrEqualTo(String value) {
            addCriterion("VENTILATION <=", value, "ventilation");
            return (Criteria) this;
        }

        public Criteria andVentilationLike(String value) {
            addCriterion("VENTILATION like", value, "ventilation");
            return (Criteria) this;
        }

        public Criteria andVentilationNotLike(String value) {
            addCriterion("VENTILATION not like", value, "ventilation");
            return (Criteria) this;
        }

        public Criteria andVentilationIn(List<String> values) {
            addCriterion("VENTILATION in", values, "ventilation");
            return (Criteria) this;
        }

        public Criteria andVentilationNotIn(List<String> values) {
            addCriterion("VENTILATION not in", values, "ventilation");
            return (Criteria) this;
        }

        public Criteria andVentilationBetween(String value1, String value2) {
            addCriterion("VENTILATION between", value1, value2, "ventilation");
            return (Criteria) this;
        }

        public Criteria andVentilationNotBetween(String value1, String value2) {
            addCriterion("VENTILATION not between", value1, value2, "ventilation");
            return (Criteria) this;
        }

        public Criteria andItchyFlowIsNull() {
            addCriterion("ITCHY_FLOW is null");
            return (Criteria) this;
        }

        public Criteria andItchyFlowIsNotNull() {
            addCriterion("ITCHY_FLOW is not null");
            return (Criteria) this;
        }

        public Criteria andItchyFlowEqualTo(String value) {
            addCriterion("ITCHY_FLOW =", value, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andItchyFlowNotEqualTo(String value) {
            addCriterion("ITCHY_FLOW <>", value, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andItchyFlowGreaterThan(String value) {
            addCriterion("ITCHY_FLOW >", value, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andItchyFlowGreaterThanOrEqualTo(String value) {
            addCriterion("ITCHY_FLOW >=", value, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andItchyFlowLessThan(String value) {
            addCriterion("ITCHY_FLOW <", value, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andItchyFlowLessThanOrEqualTo(String value) {
            addCriterion("ITCHY_FLOW <=", value, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andItchyFlowLike(String value) {
            addCriterion("ITCHY_FLOW like", value, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andItchyFlowNotLike(String value) {
            addCriterion("ITCHY_FLOW not like", value, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andItchyFlowIn(List<String> values) {
            addCriterion("ITCHY_FLOW in", values, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andItchyFlowNotIn(List<String> values) {
            addCriterion("ITCHY_FLOW not in", values, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andItchyFlowBetween(String value1, String value2) {
            addCriterion("ITCHY_FLOW between", value1, value2, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andItchyFlowNotBetween(String value1, String value2) {
            addCriterion("ITCHY_FLOW not between", value1, value2, "itchyFlow");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamIsNull() {
            addCriterion("INTRAVENOUS_BOLUS_NAM is null");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamIsNotNull() {
            addCriterion("INTRAVENOUS_BOLUS_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_NAM =", value, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamNotEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_NAM <>", value, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamGreaterThan(String value) {
            addCriterion("INTRAVENOUS_BOLUS_NAM >", value, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamGreaterThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_NAM >=", value, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamLessThan(String value) {
            addCriterion("INTRAVENOUS_BOLUS_NAM <", value, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamLessThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_NAM <=", value, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamLike(String value) {
            addCriterion("INTRAVENOUS_BOLUS_NAM like", value, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamNotLike(String value) {
            addCriterion("INTRAVENOUS_BOLUS_NAM not like", value, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamIn(List<String> values) {
            addCriterion("INTRAVENOUS_BOLUS_NAM in", values, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamNotIn(List<String> values) {
            addCriterion("INTRAVENOUS_BOLUS_NAM not in", values, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_BOLUS_NAM between", value1, value2, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusNamNotBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_BOLUS_NAM not between", value1, value2, "intravenousBolusNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseIsNull() {
            addCriterion("INTRAVENOUS_BOLUS_DOSE is null");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseIsNotNull() {
            addCriterion("INTRAVENOUS_BOLUS_DOSE is not null");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE =", value, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseNotEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE <>", value, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseGreaterThan(String value) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE >", value, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseGreaterThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE >=", value, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseLessThan(String value) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE <", value, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseLessThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE <=", value, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseLike(String value) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE like", value, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseNotLike(String value) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE not like", value, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseIn(List<String> values) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE in", values, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseNotIn(List<String> values) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE not in", values, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE between", value1, value2, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusDoseNotBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_BOLUS_DOSE not between", value1, value2, "intravenousBolusDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameIsNull() {
            addCriterion("INTRAVENOUS_DRIP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameIsNotNull() {
            addCriterion("INTRAVENOUS_DRIP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_NAME =", value, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameNotEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_NAME <>", value, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameGreaterThan(String value) {
            addCriterion("INTRAVENOUS_DRIP_NAME >", value, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameGreaterThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_NAME >=", value, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameLessThan(String value) {
            addCriterion("INTRAVENOUS_DRIP_NAME <", value, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameLessThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_NAME <=", value, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameLike(String value) {
            addCriterion("INTRAVENOUS_DRIP_NAME like", value, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameNotLike(String value) {
            addCriterion("INTRAVENOUS_DRIP_NAME not like", value, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameIn(List<String> values) {
            addCriterion("INTRAVENOUS_DRIP_NAME in", values, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameNotIn(List<String> values) {
            addCriterion("INTRAVENOUS_DRIP_NAME not in", values, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_DRIP_NAME between", value1, value2, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripNameNotBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_DRIP_NAME not between", value1, value2, "intravenousDripName");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseIsNull() {
            addCriterion("INTRAVENOUS_DRIP_DOSE is null");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseIsNotNull() {
            addCriterion("INTRAVENOUS_DRIP_DOSE is not null");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_DOSE =", value, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseNotEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_DOSE <>", value, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseGreaterThan(String value) {
            addCriterion("INTRAVENOUS_DRIP_DOSE >", value, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseGreaterThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_DOSE >=", value, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseLessThan(String value) {
            addCriterion("INTRAVENOUS_DRIP_DOSE <", value, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseLessThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_DOSE <=", value, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseLike(String value) {
            addCriterion("INTRAVENOUS_DRIP_DOSE like", value, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseNotLike(String value) {
            addCriterion("INTRAVENOUS_DRIP_DOSE not like", value, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseIn(List<String> values) {
            addCriterion("INTRAVENOUS_DRIP_DOSE in", values, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseNotIn(List<String> values) {
            addCriterion("INTRAVENOUS_DRIP_DOSE not in", values, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_DRIP_DOSE between", value1, value2, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripDoseNotBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_DRIP_DOSE not between", value1, value2, "intravenousDripDose");
            return (Criteria) this;
        }

        public Criteria andRescueRecordIsNull() {
            addCriterion("RESCUE_RECORD is null");
            return (Criteria) this;
        }

        public Criteria andRescueRecordIsNotNull() {
            addCriterion("RESCUE_RECORD is not null");
            return (Criteria) this;
        }

        public Criteria andRescueRecordEqualTo(String value) {
            addCriterion("RESCUE_RECORD =", value, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRescueRecordNotEqualTo(String value) {
            addCriterion("RESCUE_RECORD <>", value, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRescueRecordGreaterThan(String value) {
            addCriterion("RESCUE_RECORD >", value, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRescueRecordGreaterThanOrEqualTo(String value) {
            addCriterion("RESCUE_RECORD >=", value, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRescueRecordLessThan(String value) {
            addCriterion("RESCUE_RECORD <", value, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRescueRecordLessThanOrEqualTo(String value) {
            addCriterion("RESCUE_RECORD <=", value, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRescueRecordLike(String value) {
            addCriterion("RESCUE_RECORD like", value, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRescueRecordNotLike(String value) {
            addCriterion("RESCUE_RECORD not like", value, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRescueRecordIn(List<String> values) {
            addCriterion("RESCUE_RECORD in", values, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRescueRecordNotIn(List<String> values) {
            addCriterion("RESCUE_RECORD not in", values, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRescueRecordBetween(String value1, String value2) {
            addCriterion("RESCUE_RECORD between", value1, value2, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRescueRecordNotBetween(String value1, String value2) {
            addCriterion("RESCUE_RECORD not between", value1, value2, "rescueRecord");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("RECORD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("RECORD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("RECORD_TIME =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("RECORD_TIME <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("RECORD_TIME >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECORD_TIME >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("RECORD_TIME <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECORD_TIME <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("RECORD_TIME in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("RECORD_TIME not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("RECORD_TIME between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECORD_TIME not between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordNamIsNull() {
            addCriterion("RECORD_NAM is null");
            return (Criteria) this;
        }

        public Criteria andRecordNamIsNotNull() {
            addCriterion("RECORD_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andRecordNamEqualTo(String value) {
            addCriterion("RECORD_NAM =", value, "recordNam");
            return (Criteria) this;
        }

        public Criteria andRecordNamNotEqualTo(String value) {
            addCriterion("RECORD_NAM <>", value, "recordNam");
            return (Criteria) this;
        }

        public Criteria andRecordNamGreaterThan(String value) {
            addCriterion("RECORD_NAM >", value, "recordNam");
            return (Criteria) this;
        }

        public Criteria andRecordNamGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_NAM >=", value, "recordNam");
            return (Criteria) this;
        }

        public Criteria andRecordNamLessThan(String value) {
            addCriterion("RECORD_NAM <", value, "recordNam");
            return (Criteria) this;
        }

        public Criteria andRecordNamLessThanOrEqualTo(String value) {
            addCriterion("RECORD_NAM <=", value, "recordNam");
            return (Criteria) this;
        }

        public Criteria andRecordNamLike(String value) {
            addCriterion("RECORD_NAM like", value, "recordNam");
            return (Criteria) this;
        }

        public Criteria andRecordNamNotLike(String value) {
            addCriterion("RECORD_NAM not like", value, "recordNam");
            return (Criteria) this;
        }

        public Criteria andRecordNamIn(List<String> values) {
            addCriterion("RECORD_NAM in", values, "recordNam");
            return (Criteria) this;
        }

        public Criteria andRecordNamNotIn(List<String> values) {
            addCriterion("RECORD_NAM not in", values, "recordNam");
            return (Criteria) this;
        }

        public Criteria andRecordNamBetween(String value1, String value2) {
            addCriterion("RECORD_NAM between", value1, value2, "recordNam");
            return (Criteria) this;
        }

        public Criteria andRecordNamNotBetween(String value1, String value2) {
            addCriterion("RECORD_NAM not between", value1, value2, "recordNam");
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

        public Criteria andCrtUsrIsNull() {
            addCriterion("CRT_USR is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIsNotNull() {
            addCriterion("CRT_USR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrEqualTo(String value) {
            addCriterion("CRT_USR =", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotEqualTo(String value) {
            addCriterion("CRT_USR <>", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrGreaterThan(String value) {
            addCriterion("CRT_USR >", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR >=", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLessThan(String value) {
            addCriterion("CRT_USR <", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR <=", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLike(String value) {
            addCriterion("CRT_USR like", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotLike(String value) {
            addCriterion("CRT_USR not like", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIn(List<String> values) {
            addCriterion("CRT_USR in", values, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotIn(List<String> values) {
            addCriterion("CRT_USR not in", values, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrBetween(String value1, String value2) {
            addCriterion("CRT_USR between", value1, value2, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotBetween(String value1, String value2) {
            addCriterion("CRT_USR not between", value1, value2, "crtUsr");
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

        public Criteria andModDatIsNull() {
            addCriterion("MOD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andModDatIsNotNull() {
            addCriterion("MOD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andModDatEqualTo(Date value) {
            addCriterion("MOD_DAT =", value, "modDat");
            return (Criteria) this;
        }

        public Criteria andModDatNotEqualTo(Date value) {
            addCriterion("MOD_DAT <>", value, "modDat");
            return (Criteria) this;
        }

        public Criteria andModDatGreaterThan(Date value) {
            addCriterion("MOD_DAT >", value, "modDat");
            return (Criteria) this;
        }

        public Criteria andModDatGreaterThanOrEqualTo(Date value) {
            addCriterion("MOD_DAT >=", value, "modDat");
            return (Criteria) this;
        }

        public Criteria andModDatLessThan(Date value) {
            addCriterion("MOD_DAT <", value, "modDat");
            return (Criteria) this;
        }

        public Criteria andModDatLessThanOrEqualTo(Date value) {
            addCriterion("MOD_DAT <=", value, "modDat");
            return (Criteria) this;
        }

        public Criteria andModDatIn(List<Date> values) {
            addCriterion("MOD_DAT in", values, "modDat");
            return (Criteria) this;
        }

        public Criteria andModDatNotIn(List<Date> values) {
            addCriterion("MOD_DAT not in", values, "modDat");
            return (Criteria) this;
        }

        public Criteria andModDatBetween(Date value1, Date value2) {
            addCriterion("MOD_DAT between", value1, value2, "modDat");
            return (Criteria) this;
        }

        public Criteria andModDatNotBetween(Date value1, Date value2) {
            addCriterion("MOD_DAT not between", value1, value2, "modDat");
            return (Criteria) this;
        }

        public Criteria andModUsrIsNull() {
            addCriterion("MOD_USR is null");
            return (Criteria) this;
        }

        public Criteria andModUsrIsNotNull() {
            addCriterion("MOD_USR is not null");
            return (Criteria) this;
        }

        public Criteria andModUsrEqualTo(String value) {
            addCriterion("MOD_USR =", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotEqualTo(String value) {
            addCriterion("MOD_USR <>", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrGreaterThan(String value) {
            addCriterion("MOD_USR >", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USR >=", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrLessThan(String value) {
            addCriterion("MOD_USR <", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrLessThanOrEqualTo(String value) {
            addCriterion("MOD_USR <=", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrLike(String value) {
            addCriterion("MOD_USR like", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotLike(String value) {
            addCriterion("MOD_USR not like", value, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrIn(List<String> values) {
            addCriterion("MOD_USR in", values, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotIn(List<String> values) {
            addCriterion("MOD_USR not in", values, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrBetween(String value1, String value2) {
            addCriterion("MOD_USR between", value1, value2, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNotBetween(String value1, String value2) {
            addCriterion("MOD_USR not between", value1, value2, "modUsr");
            return (Criteria) this;
        }

        public Criteria andModUsrNamIsNull() {
            addCriterion("MOD_USR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andModUsrNamIsNotNull() {
            addCriterion("MOD_USR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andModUsrNamEqualTo(String value) {
            addCriterion("MOD_USR_NAM =", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamNotEqualTo(String value) {
            addCriterion("MOD_USR_NAM <>", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamGreaterThan(String value) {
            addCriterion("MOD_USR_NAM >", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USR_NAM >=", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamLessThan(String value) {
            addCriterion("MOD_USR_NAM <", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamLessThanOrEqualTo(String value) {
            addCriterion("MOD_USR_NAM <=", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamLike(String value) {
            addCriterion("MOD_USR_NAM like", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamNotLike(String value) {
            addCriterion("MOD_USR_NAM not like", value, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamIn(List<String> values) {
            addCriterion("MOD_USR_NAM in", values, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamNotIn(List<String> values) {
            addCriterion("MOD_USR_NAM not in", values, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamBetween(String value1, String value2) {
            addCriterion("MOD_USR_NAM between", value1, value2, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andModUsrNamNotBetween(String value1, String value2) {
            addCriterion("MOD_USR_NAM not between", value1, value2, "modUsrNam");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherIsNull() {
            addCriterion("INTRAVENOUS_BOLUS_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherIsNotNull() {
            addCriterion("INTRAVENOUS_BOLUS_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER =", value, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherNotEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER <>", value, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherGreaterThan(String value) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER >", value, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherGreaterThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER >=", value, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherLessThan(String value) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER <", value, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherLessThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER <=", value, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherLike(String value) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER like", value, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherNotLike(String value) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER not like", value, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherIn(List<String> values) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER in", values, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherNotIn(List<String> values) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER not in", values, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER between", value1, value2, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousBolusOtherNotBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_BOLUS_OTHER not between", value1, value2, "intravenousBolusOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherIsNull() {
            addCriterion("INTRAVENOUS_DRIP_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherIsNotNull() {
            addCriterion("INTRAVENOUS_DRIP_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_OTHER =", value, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherNotEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_OTHER <>", value, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherGreaterThan(String value) {
            addCriterion("INTRAVENOUS_DRIP_OTHER >", value, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherGreaterThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_OTHER >=", value, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherLessThan(String value) {
            addCriterion("INTRAVENOUS_DRIP_OTHER <", value, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherLessThanOrEqualTo(String value) {
            addCriterion("INTRAVENOUS_DRIP_OTHER <=", value, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherLike(String value) {
            addCriterion("INTRAVENOUS_DRIP_OTHER like", value, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherNotLike(String value) {
            addCriterion("INTRAVENOUS_DRIP_OTHER not like", value, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherIn(List<String> values) {
            addCriterion("INTRAVENOUS_DRIP_OTHER in", values, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherNotIn(List<String> values) {
            addCriterion("INTRAVENOUS_DRIP_OTHER not in", values, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_DRIP_OTHER between", value1, value2, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andIntravenousDripOtherNotBetween(String value1, String value2) {
            addCriterion("INTRAVENOUS_DRIP_OTHER not between", value1, value2, "intravenousDripOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherIsNull() {
            addCriterion("SEN_STU_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherIsNotNull() {
            addCriterion("SEN_STU_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherEqualTo(String value) {
            addCriterion("SEN_STU_OTHER =", value, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherNotEqualTo(String value) {
            addCriterion("SEN_STU_OTHER <>", value, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherGreaterThan(String value) {
            addCriterion("SEN_STU_OTHER >", value, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherGreaterThanOrEqualTo(String value) {
            addCriterion("SEN_STU_OTHER >=", value, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherLessThan(String value) {
            addCriterion("SEN_STU_OTHER <", value, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherLessThanOrEqualTo(String value) {
            addCriterion("SEN_STU_OTHER <=", value, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherLike(String value) {
            addCriterion("SEN_STU_OTHER like", value, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherNotLike(String value) {
            addCriterion("SEN_STU_OTHER not like", value, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherIn(List<String> values) {
            addCriterion("SEN_STU_OTHER in", values, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherNotIn(List<String> values) {
            addCriterion("SEN_STU_OTHER not in", values, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherBetween(String value1, String value2) {
            addCriterion("SEN_STU_OTHER between", value1, value2, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andSenStuOtherNotBetween(String value1, String value2) {
            addCriterion("SEN_STU_OTHER not between", value1, value2, "senStuOther");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeIsNull() {
            addCriterion("OXYGEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeIsNotNull() {
            addCriterion("OXYGEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeEqualTo(String value) {
            addCriterion("OXYGEN_TYPE =", value, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeNotEqualTo(String value) {
            addCriterion("OXYGEN_TYPE <>", value, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeGreaterThan(String value) {
            addCriterion("OXYGEN_TYPE >", value, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OXYGEN_TYPE >=", value, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeLessThan(String value) {
            addCriterion("OXYGEN_TYPE <", value, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeLessThanOrEqualTo(String value) {
            addCriterion("OXYGEN_TYPE <=", value, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeLike(String value) {
            addCriterion("OXYGEN_TYPE like", value, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeNotLike(String value) {
            addCriterion("OXYGEN_TYPE not like", value, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeIn(List<String> values) {
            addCriterion("OXYGEN_TYPE in", values, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeNotIn(List<String> values) {
            addCriterion("OXYGEN_TYPE not in", values, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeBetween(String value1, String value2) {
            addCriterion("OXYGEN_TYPE between", value1, value2, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andOxygenTypeNotBetween(String value1, String value2) {
            addCriterion("OXYGEN_TYPE not between", value1, value2, "oxygenType");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherIsNull() {
            addCriterion("PUPIL_LEFT_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherIsNotNull() {
            addCriterion("PUPIL_LEFT_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherEqualTo(String value) {
            addCriterion("PUPIL_LEFT_OTHER =", value, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherNotEqualTo(String value) {
            addCriterion("PUPIL_LEFT_OTHER <>", value, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherGreaterThan(String value) {
            addCriterion("PUPIL_LEFT_OTHER >", value, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherGreaterThanOrEqualTo(String value) {
            addCriterion("PUPIL_LEFT_OTHER >=", value, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherLessThan(String value) {
            addCriterion("PUPIL_LEFT_OTHER <", value, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherLessThanOrEqualTo(String value) {
            addCriterion("PUPIL_LEFT_OTHER <=", value, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherLike(String value) {
            addCriterion("PUPIL_LEFT_OTHER like", value, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherNotLike(String value) {
            addCriterion("PUPIL_LEFT_OTHER not like", value, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherIn(List<String> values) {
            addCriterion("PUPIL_LEFT_OTHER in", values, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherNotIn(List<String> values) {
            addCriterion("PUPIL_LEFT_OTHER not in", values, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherBetween(String value1, String value2) {
            addCriterion("PUPIL_LEFT_OTHER between", value1, value2, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilLeftOtherNotBetween(String value1, String value2) {
            addCriterion("PUPIL_LEFT_OTHER not between", value1, value2, "pupilLeftOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherIsNull() {
            addCriterion("PUPIL_RIGHT_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherIsNotNull() {
            addCriterion("PUPIL_RIGHT_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherEqualTo(String value) {
            addCriterion("PUPIL_RIGHT_OTHER =", value, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherNotEqualTo(String value) {
            addCriterion("PUPIL_RIGHT_OTHER <>", value, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherGreaterThan(String value) {
            addCriterion("PUPIL_RIGHT_OTHER >", value, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherGreaterThanOrEqualTo(String value) {
            addCriterion("PUPIL_RIGHT_OTHER >=", value, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherLessThan(String value) {
            addCriterion("PUPIL_RIGHT_OTHER <", value, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherLessThanOrEqualTo(String value) {
            addCriterion("PUPIL_RIGHT_OTHER <=", value, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherLike(String value) {
            addCriterion("PUPIL_RIGHT_OTHER like", value, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherNotLike(String value) {
            addCriterion("PUPIL_RIGHT_OTHER not like", value, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherIn(List<String> values) {
            addCriterion("PUPIL_RIGHT_OTHER in", values, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherNotIn(List<String> values) {
            addCriterion("PUPIL_RIGHT_OTHER not in", values, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherBetween(String value1, String value2) {
            addCriterion("PUPIL_RIGHT_OTHER between", value1, value2, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andPupilRightOtherNotBetween(String value1, String value2) {
            addCriterion("PUPIL_RIGHT_OTHER not between", value1, value2, "pupilRightOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherIsNull() {
            addCriterion("HRT_RHYTHM_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherIsNotNull() {
            addCriterion("HRT_RHYTHM_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherEqualTo(String value) {
            addCriterion("HRT_RHYTHM_OTHER =", value, "hrtRhythmOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherNotEqualTo(String value) {
            addCriterion("HRT_RHYTHM_OTHER <>", value, "hrtRhythmOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherGreaterThan(String value) {
            addCriterion("HRT_RHYTHM_OTHER >", value, "hrtRhythmOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherGreaterThanOrEqualTo(String value) {
            addCriterion("HRT_RHYTHM_OTHER >=", value, "hrtRhythmOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherLessThan(String value) {
            addCriterion("HRT_RHYTHM_OTHER <", value, "hrtRhythmOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherLessThanOrEqualTo(String value) {
            addCriterion("HRT_RHYTHM_OTHER <=", value, "hrtRhythmOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherLike(String value) {
            addCriterion("HRT_RHYTHM_OTHER like", value, "hrtRhythmOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherNotLike(String value) {
            addCriterion("HRT_RHYTHM_OTHER not like", value, "hrtRhythmOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherIn(List<String> values) {
            addCriterion("HRT_RHYTHM_OTHER in", values, "hrtRhythmOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherNotIn(List<String> values) {
            addCriterion("HRT_RHYTHM_OTHER not in", values, "hrtRhythmOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherBetween(String value1, String value2) {
            addCriterion("HRT_RHYTHM_OTHER between", value1, value2, "hrtRhythmOther");
            return (Criteria) this;
        }

        public Criteria andHrtRhythmOtherNotBetween(String value1, String value2) {
            addCriterion("HRT_RHYTHM_OTHER not between", value1, value2, "hrtRhythmOther");
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