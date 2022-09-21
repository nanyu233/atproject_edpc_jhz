package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspFuvPlnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspFuvPlnExample() {
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

        public Criteria andPlnSeqIsNull() {
            addCriterion("PLN_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPlnSeqIsNotNull() {
            addCriterion("PLN_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPlnSeqEqualTo(String value) {
            addCriterion("PLN_SEQ =", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqNotEqualTo(String value) {
            addCriterion("PLN_SEQ <>", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqGreaterThan(String value) {
            addCriterion("PLN_SEQ >", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqGreaterThanOrEqualTo(String value) {
            addCriterion("PLN_SEQ >=", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqLessThan(String value) {
            addCriterion("PLN_SEQ <", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqLessThanOrEqualTo(String value) {
            addCriterion("PLN_SEQ <=", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqLike(String value) {
            addCriterion("PLN_SEQ like", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqNotLike(String value) {
            addCriterion("PLN_SEQ not like", value, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqIn(List<String> values) {
            addCriterion("PLN_SEQ in", values, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqNotIn(List<String> values) {
            addCriterion("PLN_SEQ not in", values, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqBetween(String value1, String value2) {
            addCriterion("PLN_SEQ between", value1, value2, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPlnSeqNotBetween(String value1, String value2) {
            addCriterion("PLN_SEQ not between", value1, value2, "plnSeq");
            return (Criteria) this;
        }

        public Criteria andPatIdIsNull() {
            addCriterion("PAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatIdIsNotNull() {
            addCriterion("PAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatIdEqualTo(String value) {
            addCriterion("PAT_ID =", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotEqualTo(String value) {
            addCriterion("PAT_ID <>", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdGreaterThan(String value) {
            addCriterion("PAT_ID >", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_ID >=", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLessThan(String value) {
            addCriterion("PAT_ID <", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLessThanOrEqualTo(String value) {
            addCriterion("PAT_ID <=", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLike(String value) {
            addCriterion("PAT_ID like", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotLike(String value) {
            addCriterion("PAT_ID not like", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdIn(List<String> values) {
            addCriterion("PAT_ID in", values, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotIn(List<String> values) {
            addCriterion("PAT_ID not in", values, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdBetween(String value1, String value2) {
            addCriterion("PAT_ID between", value1, value2, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotBetween(String value1, String value2) {
            addCriterion("PAT_ID not between", value1, value2, "patId");
            return (Criteria) this;
        }

        public Criteria andPlnStaIsNull() {
            addCriterion("PLN_STA is null");
            return (Criteria) this;
        }

        public Criteria andPlnStaIsNotNull() {
            addCriterion("PLN_STA is not null");
            return (Criteria) this;
        }

        public Criteria andPlnStaEqualTo(String value) {
            addCriterion("PLN_STA =", value, "plnSta");
            return (Criteria) this;
        }

        public Criteria andPlnStaNotEqualTo(String value) {
            addCriterion("PLN_STA <>", value, "plnSta");
            return (Criteria) this;
        }

        public Criteria andPlnStaGreaterThan(String value) {
            addCriterion("PLN_STA >", value, "plnSta");
            return (Criteria) this;
        }

        public Criteria andPlnStaGreaterThanOrEqualTo(String value) {
            addCriterion("PLN_STA >=", value, "plnSta");
            return (Criteria) this;
        }

        public Criteria andPlnStaLessThan(String value) {
            addCriterion("PLN_STA <", value, "plnSta");
            return (Criteria) this;
        }

        public Criteria andPlnStaLessThanOrEqualTo(String value) {
            addCriterion("PLN_STA <=", value, "plnSta");
            return (Criteria) this;
        }

        public Criteria andPlnStaLike(String value) {
            addCriterion("PLN_STA like", value, "plnSta");
            return (Criteria) this;
        }

        public Criteria andPlnStaNotLike(String value) {
            addCriterion("PLN_STA not like", value, "plnSta");
            return (Criteria) this;
        }

        public Criteria andPlnStaIn(List<String> values) {
            addCriterion("PLN_STA in", values, "plnSta");
            return (Criteria) this;
        }

        public Criteria andPlnStaNotIn(List<String> values) {
            addCriterion("PLN_STA not in", values, "plnSta");
            return (Criteria) this;
        }

        public Criteria andPlnStaBetween(String value1, String value2) {
            addCriterion("PLN_STA between", value1, value2, "plnSta");
            return (Criteria) this;
        }

        public Criteria andPlnStaNotBetween(String value1, String value2) {
            addCriterion("PLN_STA not between", value1, value2, "plnSta");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimIsNull() {
            addCriterion("LST_FUV_TIM is null");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimIsNotNull() {
            addCriterion("LST_FUV_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimEqualTo(Date value) {
            addCriterion("LST_FUV_TIM =", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimNotEqualTo(Date value) {
            addCriterion("LST_FUV_TIM <>", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimGreaterThan(Date value) {
            addCriterion("LST_FUV_TIM >", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimGreaterThanOrEqualTo(Date value) {
            addCriterion("LST_FUV_TIM >=", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimLessThan(Date value) {
            addCriterion("LST_FUV_TIM <", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimLessThanOrEqualTo(Date value) {
            addCriterion("LST_FUV_TIM <=", value, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimIn(List<Date> values) {
            addCriterion("LST_FUV_TIM in", values, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimNotIn(List<Date> values) {
            addCriterion("LST_FUV_TIM not in", values, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimBetween(Date value1, Date value2) {
            addCriterion("LST_FUV_TIM between", value1, value2, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andLstFuvTimNotBetween(Date value1, Date value2) {
            addCriterion("LST_FUV_TIM not between", value1, value2, "lstFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimIsNull() {
            addCriterion("PLN_FUV_TIM is null");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimIsNotNull() {
            addCriterion("PLN_FUV_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimEqualTo(Date value) {
            addCriterion("PLN_FUV_TIM =", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimNotEqualTo(Date value) {
            addCriterion("PLN_FUV_TIM <>", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimGreaterThan(Date value) {
            addCriterion("PLN_FUV_TIM >", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimGreaterThanOrEqualTo(Date value) {
            addCriterion("PLN_FUV_TIM >=", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimLessThan(Date value) {
            addCriterion("PLN_FUV_TIM <", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimLessThanOrEqualTo(Date value) {
            addCriterion("PLN_FUV_TIM <=", value, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimIn(List<Date> values) {
            addCriterion("PLN_FUV_TIM in", values, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimNotIn(List<Date> values) {
            addCriterion("PLN_FUV_TIM not in", values, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimBetween(Date value1, Date value2) {
            addCriterion("PLN_FUV_TIM between", value1, value2, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTimNotBetween(Date value1, Date value2) {
            addCriterion("PLN_FUV_TIM not between", value1, value2, "plnFuvTim");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoIsNull() {
            addCriterion("ALM_USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoIsNotNull() {
            addCriterion("ALM_USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoEqualTo(String value) {
            addCriterion("ALM_USR_NO =", value, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoNotEqualTo(String value) {
            addCriterion("ALM_USR_NO <>", value, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoGreaterThan(String value) {
            addCriterion("ALM_USR_NO >", value, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("ALM_USR_NO >=", value, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoLessThan(String value) {
            addCriterion("ALM_USR_NO <", value, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoLessThanOrEqualTo(String value) {
            addCriterion("ALM_USR_NO <=", value, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoLike(String value) {
            addCriterion("ALM_USR_NO like", value, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoNotLike(String value) {
            addCriterion("ALM_USR_NO not like", value, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoIn(List<String> values) {
            addCriterion("ALM_USR_NO in", values, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoNotIn(List<String> values) {
            addCriterion("ALM_USR_NO not in", values, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoBetween(String value1, String value2) {
            addCriterion("ALM_USR_NO between", value1, value2, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNoNotBetween(String value1, String value2) {
            addCriterion("ALM_USR_NO not between", value1, value2, "almUsrNo");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeIsNull() {
            addCriterion("ALM_USR_NME is null");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeIsNotNull() {
            addCriterion("ALM_USR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeEqualTo(String value) {
            addCriterion("ALM_USR_NME =", value, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeNotEqualTo(String value) {
            addCriterion("ALM_USR_NME <>", value, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeGreaterThan(String value) {
            addCriterion("ALM_USR_NME >", value, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeGreaterThanOrEqualTo(String value) {
            addCriterion("ALM_USR_NME >=", value, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeLessThan(String value) {
            addCriterion("ALM_USR_NME <", value, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeLessThanOrEqualTo(String value) {
            addCriterion("ALM_USR_NME <=", value, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeLike(String value) {
            addCriterion("ALM_USR_NME like", value, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeNotLike(String value) {
            addCriterion("ALM_USR_NME not like", value, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeIn(List<String> values) {
            addCriterion("ALM_USR_NME in", values, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeNotIn(List<String> values) {
            addCriterion("ALM_USR_NME not in", values, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeBetween(String value1, String value2) {
            addCriterion("ALM_USR_NME between", value1, value2, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andAlmUsrNmeNotBetween(String value1, String value2) {
            addCriterion("ALM_USR_NME not between", value1, value2, "almUsrNme");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimIsNull() {
            addCriterion("FUV_ALM_TIM is null");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimIsNotNull() {
            addCriterion("FUV_ALM_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimEqualTo(Date value) {
            addCriterion("FUV_ALM_TIM =", value, "fuvAlmTim");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimNotEqualTo(Date value) {
            addCriterion("FUV_ALM_TIM <>", value, "fuvAlmTim");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimGreaterThan(Date value) {
            addCriterion("FUV_ALM_TIM >", value, "fuvAlmTim");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimGreaterThanOrEqualTo(Date value) {
            addCriterion("FUV_ALM_TIM >=", value, "fuvAlmTim");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimLessThan(Date value) {
            addCriterion("FUV_ALM_TIM <", value, "fuvAlmTim");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimLessThanOrEqualTo(Date value) {
            addCriterion("FUV_ALM_TIM <=", value, "fuvAlmTim");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimIn(List<Date> values) {
            addCriterion("FUV_ALM_TIM in", values, "fuvAlmTim");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimNotIn(List<Date> values) {
            addCriterion("FUV_ALM_TIM not in", values, "fuvAlmTim");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimBetween(Date value1, Date value2) {
            addCriterion("FUV_ALM_TIM between", value1, value2, "fuvAlmTim");
            return (Criteria) this;
        }

        public Criteria andFuvAlmTimNotBetween(Date value1, Date value2) {
            addCriterion("FUV_ALM_TIM not between", value1, value2, "fuvAlmTim");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgIsNull() {
            addCriterion("ALM_RED_FLG is null");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgIsNotNull() {
            addCriterion("ALM_RED_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgEqualTo(String value) {
            addCriterion("ALM_RED_FLG =", value, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgNotEqualTo(String value) {
            addCriterion("ALM_RED_FLG <>", value, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgGreaterThan(String value) {
            addCriterion("ALM_RED_FLG >", value, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgGreaterThanOrEqualTo(String value) {
            addCriterion("ALM_RED_FLG >=", value, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgLessThan(String value) {
            addCriterion("ALM_RED_FLG <", value, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgLessThanOrEqualTo(String value) {
            addCriterion("ALM_RED_FLG <=", value, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgLike(String value) {
            addCriterion("ALM_RED_FLG like", value, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgNotLike(String value) {
            addCriterion("ALM_RED_FLG not like", value, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgIn(List<String> values) {
            addCriterion("ALM_RED_FLG in", values, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgNotIn(List<String> values) {
            addCriterion("ALM_RED_FLG not in", values, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgBetween(String value1, String value2) {
            addCriterion("ALM_RED_FLG between", value1, value2, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedFlgNotBetween(String value1, String value2) {
            addCriterion("ALM_RED_FLG not between", value1, value2, "almRedFlg");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimIsNull() {
            addCriterion("ALM_RED_TIM is null");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimIsNotNull() {
            addCriterion("ALM_RED_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimEqualTo(Date value) {
            addCriterion("ALM_RED_TIM =", value, "almRedTim");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimNotEqualTo(Date value) {
            addCriterion("ALM_RED_TIM <>", value, "almRedTim");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimGreaterThan(Date value) {
            addCriterion("ALM_RED_TIM >", value, "almRedTim");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimGreaterThanOrEqualTo(Date value) {
            addCriterion("ALM_RED_TIM >=", value, "almRedTim");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimLessThan(Date value) {
            addCriterion("ALM_RED_TIM <", value, "almRedTim");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimLessThanOrEqualTo(Date value) {
            addCriterion("ALM_RED_TIM <=", value, "almRedTim");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimIn(List<Date> values) {
            addCriterion("ALM_RED_TIM in", values, "almRedTim");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimNotIn(List<Date> values) {
            addCriterion("ALM_RED_TIM not in", values, "almRedTim");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimBetween(Date value1, Date value2) {
            addCriterion("ALM_RED_TIM between", value1, value2, "almRedTim");
            return (Criteria) this;
        }

        public Criteria andAlmRedTimNotBetween(Date value1, Date value2) {
            addCriterion("ALM_RED_TIM not between", value1, value2, "almRedTim");
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

        public Criteria andCrtTimIsNull() {
            addCriterion("CRT_TIM is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimIsNotNull() {
            addCriterion("CRT_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimEqualTo(Date value) {
            addCriterion("CRT_TIM =", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotEqualTo(Date value) {
            addCriterion("CRT_TIM <>", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimGreaterThan(Date value) {
            addCriterion("CRT_TIM >", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIM >=", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimLessThan(Date value) {
            addCriterion("CRT_TIM <", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIM <=", value, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimIn(List<Date> values) {
            addCriterion("CRT_TIM in", values, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotIn(List<Date> values) {
            addCriterion("CRT_TIM not in", values, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimBetween(Date value1, Date value2) {
            addCriterion("CRT_TIM between", value1, value2, "crtTim");
            return (Criteria) this;
        }

        public Criteria andCrtTimNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIM not between", value1, value2, "crtTim");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypIsNull() {
            addCriterion("PLN_FUV_TYP is null");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypIsNotNull() {
            addCriterion("PLN_FUV_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypEqualTo(String value) {
            addCriterion("PLN_FUV_TYP =", value, "plnFuvTyp");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypNotEqualTo(String value) {
            addCriterion("PLN_FUV_TYP <>", value, "plnFuvTyp");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypGreaterThan(String value) {
            addCriterion("PLN_FUV_TYP >", value, "plnFuvTyp");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypGreaterThanOrEqualTo(String value) {
            addCriterion("PLN_FUV_TYP >=", value, "plnFuvTyp");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypLessThan(String value) {
            addCriterion("PLN_FUV_TYP <", value, "plnFuvTyp");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypLessThanOrEqualTo(String value) {
            addCriterion("PLN_FUV_TYP <=", value, "plnFuvTyp");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypLike(String value) {
            addCriterion("PLN_FUV_TYP like", value, "plnFuvTyp");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypNotLike(String value) {
            addCriterion("PLN_FUV_TYP not like", value, "plnFuvTyp");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypIn(List<String> values) {
            addCriterion("PLN_FUV_TYP in", values, "plnFuvTyp");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypNotIn(List<String> values) {
            addCriterion("PLN_FUV_TYP not in", values, "plnFuvTyp");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypBetween(String value1, String value2) {
            addCriterion("PLN_FUV_TYP between", value1, value2, "plnFuvTyp");
            return (Criteria) this;
        }

        public Criteria andPlnFuvTypNotBetween(String value1, String value2) {
            addCriterion("PLN_FUV_TYP not between", value1, value2, "plnFuvTyp");
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