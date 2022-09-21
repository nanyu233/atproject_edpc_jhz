package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspHealtheduInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspHealtheduInfExample() {
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

        public Criteria andEduSeqIsNull() {
            addCriterion("EDU_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andEduSeqIsNotNull() {
            addCriterion("EDU_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andEduSeqEqualTo(String value) {
            addCriterion("EDU_SEQ =", value, "eduSeq");
            return (Criteria) this;
        }

        public Criteria andEduSeqNotEqualTo(String value) {
            addCriterion("EDU_SEQ <>", value, "eduSeq");
            return (Criteria) this;
        }

        public Criteria andEduSeqGreaterThan(String value) {
            addCriterion("EDU_SEQ >", value, "eduSeq");
            return (Criteria) this;
        }

        public Criteria andEduSeqGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_SEQ >=", value, "eduSeq");
            return (Criteria) this;
        }

        public Criteria andEduSeqLessThan(String value) {
            addCriterion("EDU_SEQ <", value, "eduSeq");
            return (Criteria) this;
        }

        public Criteria andEduSeqLessThanOrEqualTo(String value) {
            addCriterion("EDU_SEQ <=", value, "eduSeq");
            return (Criteria) this;
        }

        public Criteria andEduSeqLike(String value) {
            addCriterion("EDU_SEQ like", value, "eduSeq");
            return (Criteria) this;
        }

        public Criteria andEduSeqNotLike(String value) {
            addCriterion("EDU_SEQ not like", value, "eduSeq");
            return (Criteria) this;
        }

        public Criteria andEduSeqIn(List<String> values) {
            addCriterion("EDU_SEQ in", values, "eduSeq");
            return (Criteria) this;
        }

        public Criteria andEduSeqNotIn(List<String> values) {
            addCriterion("EDU_SEQ not in", values, "eduSeq");
            return (Criteria) this;
        }

        public Criteria andEduSeqBetween(String value1, String value2) {
            addCriterion("EDU_SEQ between", value1, value2, "eduSeq");
            return (Criteria) this;
        }

        public Criteria andEduSeqNotBetween(String value1, String value2) {
            addCriterion("EDU_SEQ not between", value1, value2, "eduSeq");
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

        public Criteria andEduObjIsNull() {
            addCriterion("EDU_OBJ is null");
            return (Criteria) this;
        }

        public Criteria andEduObjIsNotNull() {
            addCriterion("EDU_OBJ is not null");
            return (Criteria) this;
        }

        public Criteria andEduObjEqualTo(String value) {
            addCriterion("EDU_OBJ =", value, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduObjNotEqualTo(String value) {
            addCriterion("EDU_OBJ <>", value, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduObjGreaterThan(String value) {
            addCriterion("EDU_OBJ >", value, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduObjGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_OBJ >=", value, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduObjLessThan(String value) {
            addCriterion("EDU_OBJ <", value, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduObjLessThanOrEqualTo(String value) {
            addCriterion("EDU_OBJ <=", value, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduObjLike(String value) {
            addCriterion("EDU_OBJ like", value, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduObjNotLike(String value) {
            addCriterion("EDU_OBJ not like", value, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduObjIn(List<String> values) {
            addCriterion("EDU_OBJ in", values, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduObjNotIn(List<String> values) {
            addCriterion("EDU_OBJ not in", values, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduObjBetween(String value1, String value2) {
            addCriterion("EDU_OBJ between", value1, value2, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduObjNotBetween(String value1, String value2) {
            addCriterion("EDU_OBJ not between", value1, value2, "eduObj");
            return (Criteria) this;
        }

        public Criteria andEduTimeIsNull() {
            addCriterion("EDU_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEduTimeIsNotNull() {
            addCriterion("EDU_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEduTimeEqualTo(String value) {
            addCriterion("EDU_TIME =", value, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduTimeNotEqualTo(String value) {
            addCriterion("EDU_TIME <>", value, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduTimeGreaterThan(String value) {
            addCriterion("EDU_TIME >", value, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduTimeGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_TIME >=", value, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduTimeLessThan(String value) {
            addCriterion("EDU_TIME <", value, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduTimeLessThanOrEqualTo(String value) {
            addCriterion("EDU_TIME <=", value, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduTimeLike(String value) {
            addCriterion("EDU_TIME like", value, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduTimeNotLike(String value) {
            addCriterion("EDU_TIME not like", value, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduTimeIn(List<String> values) {
            addCriterion("EDU_TIME in", values, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduTimeNotIn(List<String> values) {
            addCriterion("EDU_TIME not in", values, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduTimeBetween(String value1, String value2) {
            addCriterion("EDU_TIME between", value1, value2, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduTimeNotBetween(String value1, String value2) {
            addCriterion("EDU_TIME not between", value1, value2, "eduTime");
            return (Criteria) this;
        }

        public Criteria andEduContIsNull() {
            addCriterion("EDU_CONT is null");
            return (Criteria) this;
        }

        public Criteria andEduContIsNotNull() {
            addCriterion("EDU_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andEduContEqualTo(String value) {
            addCriterion("EDU_CONT =", value, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduContNotEqualTo(String value) {
            addCriterion("EDU_CONT <>", value, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduContGreaterThan(String value) {
            addCriterion("EDU_CONT >", value, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduContGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_CONT >=", value, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduContLessThan(String value) {
            addCriterion("EDU_CONT <", value, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduContLessThanOrEqualTo(String value) {
            addCriterion("EDU_CONT <=", value, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduContLike(String value) {
            addCriterion("EDU_CONT like", value, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduContNotLike(String value) {
            addCriterion("EDU_CONT not like", value, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduContIn(List<String> values) {
            addCriterion("EDU_CONT in", values, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduContNotIn(List<String> values) {
            addCriterion("EDU_CONT not in", values, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduContBetween(String value1, String value2) {
            addCriterion("EDU_CONT between", value1, value2, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduContNotBetween(String value1, String value2) {
            addCriterion("EDU_CONT not between", value1, value2, "eduCont");
            return (Criteria) this;
        }

        public Criteria andEduMethodIsNull() {
            addCriterion("EDU_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andEduMethodIsNotNull() {
            addCriterion("EDU_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andEduMethodEqualTo(String value) {
            addCriterion("EDU_METHOD =", value, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduMethodNotEqualTo(String value) {
            addCriterion("EDU_METHOD <>", value, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduMethodGreaterThan(String value) {
            addCriterion("EDU_METHOD >", value, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduMethodGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_METHOD >=", value, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduMethodLessThan(String value) {
            addCriterion("EDU_METHOD <", value, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduMethodLessThanOrEqualTo(String value) {
            addCriterion("EDU_METHOD <=", value, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduMethodLike(String value) {
            addCriterion("EDU_METHOD like", value, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduMethodNotLike(String value) {
            addCriterion("EDU_METHOD not like", value, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduMethodIn(List<String> values) {
            addCriterion("EDU_METHOD in", values, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduMethodNotIn(List<String> values) {
            addCriterion("EDU_METHOD not in", values, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduMethodBetween(String value1, String value2) {
            addCriterion("EDU_METHOD between", value1, value2, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduMethodNotBetween(String value1, String value2) {
            addCriterion("EDU_METHOD not between", value1, value2, "eduMethod");
            return (Criteria) this;
        }

        public Criteria andEduDatIsNull() {
            addCriterion("EDU_DAT is null");
            return (Criteria) this;
        }

        public Criteria andEduDatIsNotNull() {
            addCriterion("EDU_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andEduDatEqualTo(Date value) {
            addCriterion("EDU_DAT =", value, "eduDat");
            return (Criteria) this;
        }

        public Criteria andEduDatNotEqualTo(Date value) {
            addCriterion("EDU_DAT <>", value, "eduDat");
            return (Criteria) this;
        }

        public Criteria andEduDatGreaterThan(Date value) {
            addCriterion("EDU_DAT >", value, "eduDat");
            return (Criteria) this;
        }

        public Criteria andEduDatGreaterThanOrEqualTo(Date value) {
            addCriterion("EDU_DAT >=", value, "eduDat");
            return (Criteria) this;
        }

        public Criteria andEduDatLessThan(Date value) {
            addCriterion("EDU_DAT <", value, "eduDat");
            return (Criteria) this;
        }

        public Criteria andEduDatLessThanOrEqualTo(Date value) {
            addCriterion("EDU_DAT <=", value, "eduDat");
            return (Criteria) this;
        }

        public Criteria andEduDatIn(List<Date> values) {
            addCriterion("EDU_DAT in", values, "eduDat");
            return (Criteria) this;
        }

        public Criteria andEduDatNotIn(List<Date> values) {
            addCriterion("EDU_DAT not in", values, "eduDat");
            return (Criteria) this;
        }

        public Criteria andEduDatBetween(Date value1, Date value2) {
            addCriterion("EDU_DAT between", value1, value2, "eduDat");
            return (Criteria) this;
        }

        public Criteria andEduDatNotBetween(Date value1, Date value2) {
            addCriterion("EDU_DAT not between", value1, value2, "eduDat");
            return (Criteria) this;
        }

        public Criteria andEduResIsNull() {
            addCriterion("EDU_RES is null");
            return (Criteria) this;
        }

        public Criteria andEduResIsNotNull() {
            addCriterion("EDU_RES is not null");
            return (Criteria) this;
        }

        public Criteria andEduResEqualTo(String value) {
            addCriterion("EDU_RES =", value, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduResNotEqualTo(String value) {
            addCriterion("EDU_RES <>", value, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduResGreaterThan(String value) {
            addCriterion("EDU_RES >", value, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduResGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_RES >=", value, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduResLessThan(String value) {
            addCriterion("EDU_RES <", value, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduResLessThanOrEqualTo(String value) {
            addCriterion("EDU_RES <=", value, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduResLike(String value) {
            addCriterion("EDU_RES like", value, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduResNotLike(String value) {
            addCriterion("EDU_RES not like", value, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduResIn(List<String> values) {
            addCriterion("EDU_RES in", values, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduResNotIn(List<String> values) {
            addCriterion("EDU_RES not in", values, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduResBetween(String value1, String value2) {
            addCriterion("EDU_RES between", value1, value2, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduResNotBetween(String value1, String value2) {
            addCriterion("EDU_RES not between", value1, value2, "eduRes");
            return (Criteria) this;
        }

        public Criteria andEduOtherIsNull() {
            addCriterion("EDU_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andEduOtherIsNotNull() {
            addCriterion("EDU_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andEduOtherEqualTo(String value) {
            addCriterion("EDU_OTHER =", value, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduOtherNotEqualTo(String value) {
            addCriterion("EDU_OTHER <>", value, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduOtherGreaterThan(String value) {
            addCriterion("EDU_OTHER >", value, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduOtherGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_OTHER >=", value, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduOtherLessThan(String value) {
            addCriterion("EDU_OTHER <", value, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduOtherLessThanOrEqualTo(String value) {
            addCriterion("EDU_OTHER <=", value, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduOtherLike(String value) {
            addCriterion("EDU_OTHER like", value, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduOtherNotLike(String value) {
            addCriterion("EDU_OTHER not like", value, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduOtherIn(List<String> values) {
            addCriterion("EDU_OTHER in", values, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduOtherNotIn(List<String> values) {
            addCriterion("EDU_OTHER not in", values, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduOtherBetween(String value1, String value2) {
            addCriterion("EDU_OTHER between", value1, value2, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduOtherNotBetween(String value1, String value2) {
            addCriterion("EDU_OTHER not between", value1, value2, "eduOther");
            return (Criteria) this;
        }

        public Criteria andEduItemIsNull() {
            addCriterion("EDU_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andEduItemIsNotNull() {
            addCriterion("EDU_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andEduItemEqualTo(String value) {
            addCriterion("EDU_ITEM =", value, "eduItem");
            return (Criteria) this;
        }

        public Criteria andEduItemNotEqualTo(String value) {
            addCriterion("EDU_ITEM <>", value, "eduItem");
            return (Criteria) this;
        }

        public Criteria andEduItemGreaterThan(String value) {
            addCriterion("EDU_ITEM >", value, "eduItem");
            return (Criteria) this;
        }

        public Criteria andEduItemGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_ITEM >=", value, "eduItem");
            return (Criteria) this;
        }

        public Criteria andEduItemLessThan(String value) {
            addCriterion("EDU_ITEM <", value, "eduItem");
            return (Criteria) this;
        }

        public Criteria andEduItemLessThanOrEqualTo(String value) {
            addCriterion("EDU_ITEM <=", value, "eduItem");
            return (Criteria) this;
        }

        public Criteria andEduItemLike(String value) {
            addCriterion("EDU_ITEM like", value, "eduItem");
            return (Criteria) this;
        }

        public Criteria andEduItemNotLike(String value) {
            addCriterion("EDU_ITEM not like", value, "eduItem");
            return (Criteria) this;
        }

        public Criteria andEduItemIn(List<String> values) {
            addCriterion("EDU_ITEM in", values, "eduItem");
            return (Criteria) this;
        }

        public Criteria andEduItemNotIn(List<String> values) {
            addCriterion("EDU_ITEM not in", values, "eduItem");
            return (Criteria) this;
        }

        public Criteria andEduItemBetween(String value1, String value2) {
            addCriterion("EDU_ITEM between", value1, value2, "eduItem");
            return (Criteria) this;
        }

        public Criteria andEduItemNotBetween(String value1, String value2) {
            addCriterion("EDU_ITEM not between", value1, value2, "eduItem");
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