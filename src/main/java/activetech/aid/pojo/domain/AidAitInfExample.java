package activetech.aid.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AidAitInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AidAitInfExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andAitSeqIsNull() {
            addCriterion("AIT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andAitSeqIsNotNull() {
            addCriterion("AIT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andAitSeqEqualTo(String value) {
            addCriterion("AIT_SEQ =", value, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andAitSeqNotEqualTo(String value) {
            addCriterion("AIT_SEQ <>", value, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andAitSeqGreaterThan(String value) {
            addCriterion("AIT_SEQ >", value, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andAitSeqGreaterThanOrEqualTo(String value) {
            addCriterion("AIT_SEQ >=", value, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andAitSeqLessThan(String value) {
            addCriterion("AIT_SEQ <", value, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andAitSeqLessThanOrEqualTo(String value) {
            addCriterion("AIT_SEQ <=", value, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andAitSeqLike(String value) {
            addCriterion("AIT_SEQ like", value, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andAitSeqNotLike(String value) {
            addCriterion("AIT_SEQ not like", value, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andAitSeqIn(List<String> values) {
            addCriterion("AIT_SEQ in", values, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andAitSeqNotIn(List<String> values) {
            addCriterion("AIT_SEQ not in", values, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andAitSeqBetween(String value1, String value2) {
            addCriterion("AIT_SEQ between", value1, value2, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andAitSeqNotBetween(String value1, String value2) {
            addCriterion("AIT_SEQ not between", value1, value2, "aitSeq");
            return (Criteria) this;
        }

        public Criteria andSndTimIsNull() {
            addCriterion("SND_TIM is null");
            return (Criteria) this;
        }

        public Criteria andSndTimIsNotNull() {
            addCriterion("SND_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andSndTimEqualTo(Date value) {
            addCriterion("SND_TIM =", value, "sndTim");
            return (Criteria) this;
        }

        public Criteria andSndTimNotEqualTo(Date value) {
            addCriterion("SND_TIM <>", value, "sndTim");
            return (Criteria) this;
        }

        public Criteria andSndTimGreaterThan(Date value) {
            addCriterion("SND_TIM >", value, "sndTim");
            return (Criteria) this;
        }

        public Criteria andSndTimGreaterThanOrEqualTo(Date value) {
            addCriterion("SND_TIM >=", value, "sndTim");
            return (Criteria) this;
        }

        public Criteria andSndTimLessThan(Date value) {
            addCriterion("SND_TIM <", value, "sndTim");
            return (Criteria) this;
        }

        public Criteria andSndTimLessThanOrEqualTo(Date value) {
            addCriterion("SND_TIM <=", value, "sndTim");
            return (Criteria) this;
        }

        public Criteria andSndTimIn(List<Date> values) {
            addCriterion("SND_TIM in", values, "sndTim");
            return (Criteria) this;
        }

        public Criteria andSndTimNotIn(List<Date> values) {
            addCriterion("SND_TIM not in", values, "sndTim");
            return (Criteria) this;
        }

        public Criteria andSndTimBetween(Date value1, Date value2) {
            addCriterion("SND_TIM between", value1, value2, "sndTim");
            return (Criteria) this;
        }

        public Criteria andSndTimNotBetween(Date value1, Date value2) {
            addCriterion("SND_TIM not between", value1, value2, "sndTim");
            return (Criteria) this;
        }

        public Criteria andSndComIsNull() {
            addCriterion("SND_COM is null");
            return (Criteria) this;
        }

        public Criteria andSndComIsNotNull() {
            addCriterion("SND_COM is not null");
            return (Criteria) this;
        }

        public Criteria andSndComEqualTo(String value) {
            addCriterion("SND_COM =", value, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComNotEqualTo(String value) {
            addCriterion("SND_COM <>", value, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComGreaterThan(String value) {
            addCriterion("SND_COM >", value, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComGreaterThanOrEqualTo(String value) {
            addCriterion("SND_COM >=", value, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComLessThan(String value) {
            addCriterion("SND_COM <", value, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComLessThanOrEqualTo(String value) {
            addCriterion("SND_COM <=", value, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComLike(String value) {
            addCriterion("SND_COM like", value, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComNotLike(String value) {
            addCriterion("SND_COM not like", value, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComIn(List<String> values) {
            addCriterion("SND_COM in", values, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComNotIn(List<String> values) {
            addCriterion("SND_COM not in", values, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComBetween(String value1, String value2) {
            addCriterion("SND_COM between", value1, value2, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComNotBetween(String value1, String value2) {
            addCriterion("SND_COM not between", value1, value2, "sndCom");
            return (Criteria) this;
        }

        public Criteria andSndComNamIsNull() {
            addCriterion("SND_COM_NAM is null");
            return (Criteria) this;
        }

        public Criteria andSndComNamIsNotNull() {
            addCriterion("SND_COM_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andSndComNamEqualTo(String value) {
            addCriterion("SND_COM_NAM =", value, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndComNamNotEqualTo(String value) {
            addCriterion("SND_COM_NAM <>", value, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndComNamGreaterThan(String value) {
            addCriterion("SND_COM_NAM >", value, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndComNamGreaterThanOrEqualTo(String value) {
            addCriterion("SND_COM_NAM >=", value, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndComNamLessThan(String value) {
            addCriterion("SND_COM_NAM <", value, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndComNamLessThanOrEqualTo(String value) {
            addCriterion("SND_COM_NAM <=", value, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndComNamLike(String value) {
            addCriterion("SND_COM_NAM like", value, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndComNamNotLike(String value) {
            addCriterion("SND_COM_NAM not like", value, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndComNamIn(List<String> values) {
            addCriterion("SND_COM_NAM in", values, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndComNamNotIn(List<String> values) {
            addCriterion("SND_COM_NAM not in", values, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndComNamBetween(String value1, String value2) {
            addCriterion("SND_COM_NAM between", value1, value2, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndComNamNotBetween(String value1, String value2) {
            addCriterion("SND_COM_NAM not between", value1, value2, "sndComNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrIsNull() {
            addCriterion("SND_USR is null");
            return (Criteria) this;
        }

        public Criteria andSndUsrIsNotNull() {
            addCriterion("SND_USR is not null");
            return (Criteria) this;
        }

        public Criteria andSndUsrEqualTo(String value) {
            addCriterion("SND_USR =", value, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrNotEqualTo(String value) {
            addCriterion("SND_USR <>", value, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrGreaterThan(String value) {
            addCriterion("SND_USR >", value, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrGreaterThanOrEqualTo(String value) {
            addCriterion("SND_USR >=", value, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrLessThan(String value) {
            addCriterion("SND_USR <", value, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrLessThanOrEqualTo(String value) {
            addCriterion("SND_USR <=", value, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrLike(String value) {
            addCriterion("SND_USR like", value, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrNotLike(String value) {
            addCriterion("SND_USR not like", value, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrIn(List<String> values) {
            addCriterion("SND_USR in", values, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrNotIn(List<String> values) {
            addCriterion("SND_USR not in", values, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrBetween(String value1, String value2) {
            addCriterion("SND_USR between", value1, value2, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrNotBetween(String value1, String value2) {
            addCriterion("SND_USR not between", value1, value2, "sndUsr");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamIsNull() {
            addCriterion("SND_USR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamIsNotNull() {
            addCriterion("SND_USR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamEqualTo(String value) {
            addCriterion("SND_USR_NAM =", value, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamNotEqualTo(String value) {
            addCriterion("SND_USR_NAM <>", value, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamGreaterThan(String value) {
            addCriterion("SND_USR_NAM >", value, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamGreaterThanOrEqualTo(String value) {
            addCriterion("SND_USR_NAM >=", value, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamLessThan(String value) {
            addCriterion("SND_USR_NAM <", value, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamLessThanOrEqualTo(String value) {
            addCriterion("SND_USR_NAM <=", value, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamLike(String value) {
            addCriterion("SND_USR_NAM like", value, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamNotLike(String value) {
            addCriterion("SND_USR_NAM not like", value, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamIn(List<String> values) {
            addCriterion("SND_USR_NAM in", values, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamNotIn(List<String> values) {
            addCriterion("SND_USR_NAM not in", values, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamBetween(String value1, String value2) {
            addCriterion("SND_USR_NAM between", value1, value2, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andSndUsrNamNotBetween(String value1, String value2) {
            addCriterion("SND_USR_NAM not between", value1, value2, "sndUsrNam");
            return (Criteria) this;
        }

        public Criteria andAitTypIsNull() {
            addCriterion("AIT_TYP is null");
            return (Criteria) this;
        }

        public Criteria andAitTypIsNotNull() {
            addCriterion("AIT_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andAitTypEqualTo(String value) {
            addCriterion("AIT_TYP =", value, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitTypNotEqualTo(String value) {
            addCriterion("AIT_TYP <>", value, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitTypGreaterThan(String value) {
            addCriterion("AIT_TYP >", value, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitTypGreaterThanOrEqualTo(String value) {
            addCriterion("AIT_TYP >=", value, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitTypLessThan(String value) {
            addCriterion("AIT_TYP <", value, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitTypLessThanOrEqualTo(String value) {
            addCriterion("AIT_TYP <=", value, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitTypLike(String value) {
            addCriterion("AIT_TYP like", value, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitTypNotLike(String value) {
            addCriterion("AIT_TYP not like", value, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitTypIn(List<String> values) {
            addCriterion("AIT_TYP in", values, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitTypNotIn(List<String> values) {
            addCriterion("AIT_TYP not in", values, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitTypBetween(String value1, String value2) {
            addCriterion("AIT_TYP between", value1, value2, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitTypNotBetween(String value1, String value2) {
            addCriterion("AIT_TYP not between", value1, value2, "aitTyp");
            return (Criteria) this;
        }

        public Criteria andAitConIsNull() {
            addCriterion("AIT_CON is null");
            return (Criteria) this;
        }

        public Criteria andAitConIsNotNull() {
            addCriterion("AIT_CON is not null");
            return (Criteria) this;
        }

        public Criteria andAitConEqualTo(String value) {
            addCriterion("AIT_CON =", value, "aitCon");
            return (Criteria) this;
        }

        public Criteria andAitConNotEqualTo(String value) {
            addCriterion("AIT_CON <>", value, "aitCon");
            return (Criteria) this;
        }

        public Criteria andAitConGreaterThan(String value) {
            addCriterion("AIT_CON >", value, "aitCon");
            return (Criteria) this;
        }

        public Criteria andAitConGreaterThanOrEqualTo(String value) {
            addCriterion("AIT_CON >=", value, "aitCon");
            return (Criteria) this;
        }

        public Criteria andAitConLessThan(String value) {
            addCriterion("AIT_CON <", value, "aitCon");
            return (Criteria) this;
        }

        public Criteria andAitConLessThanOrEqualTo(String value) {
            addCriterion("AIT_CON <=", value, "aitCon");
            return (Criteria) this;
        }

        public Criteria andAitConLike(String value) {
            addCriterion("AIT_CON like", value, "aitCon");
            return (Criteria) this;
        }

        public Criteria andAitConNotLike(String value) {
            addCriterion("AIT_CON not like", value, "aitCon");
            return (Criteria) this;
        }

        public Criteria andAitConIn(List<String> values) {
            addCriterion("AIT_CON in", values, "aitCon");
            return (Criteria) this;
        }

        public Criteria andAitConNotIn(List<String> values) {
            addCriterion("AIT_CON not in", values, "aitCon");
            return (Criteria) this;
        }

        public Criteria andAitConBetween(String value1, String value2) {
            addCriterion("AIT_CON between", value1, value2, "aitCon");
            return (Criteria) this;
        }

        public Criteria andAitConNotBetween(String value1, String value2) {
            addCriterion("AIT_CON not between", value1, value2, "aitCon");
            return (Criteria) this;
        }

        public Criteria andRsvTelIsNull() {
            addCriterion("RSV_TEL is null");
            return (Criteria) this;
        }

        public Criteria andRsvTelIsNotNull() {
            addCriterion("RSV_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andRsvTelEqualTo(String value) {
            addCriterion("RSV_TEL =", value, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvTelNotEqualTo(String value) {
            addCriterion("RSV_TEL <>", value, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvTelGreaterThan(String value) {
            addCriterion("RSV_TEL >", value, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvTelGreaterThanOrEqualTo(String value) {
            addCriterion("RSV_TEL >=", value, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvTelLessThan(String value) {
            addCriterion("RSV_TEL <", value, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvTelLessThanOrEqualTo(String value) {
            addCriterion("RSV_TEL <=", value, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvTelLike(String value) {
            addCriterion("RSV_TEL like", value, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvTelNotLike(String value) {
            addCriterion("RSV_TEL not like", value, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvTelIn(List<String> values) {
            addCriterion("RSV_TEL in", values, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvTelNotIn(List<String> values) {
            addCriterion("RSV_TEL not in", values, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvTelBetween(String value1, String value2) {
            addCriterion("RSV_TEL between", value1, value2, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvTelNotBetween(String value1, String value2) {
            addCriterion("RSV_TEL not between", value1, value2, "rsvTel");
            return (Criteria) this;
        }

        public Criteria andRsvComIsNull() {
            addCriterion("RSV_COM is null");
            return (Criteria) this;
        }

        public Criteria andRsvComIsNotNull() {
            addCriterion("RSV_COM is not null");
            return (Criteria) this;
        }

        public Criteria andRsvComEqualTo(String value) {
            addCriterion("RSV_COM =", value, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComNotEqualTo(String value) {
            addCriterion("RSV_COM <>", value, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComGreaterThan(String value) {
            addCriterion("RSV_COM >", value, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComGreaterThanOrEqualTo(String value) {
            addCriterion("RSV_COM >=", value, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComLessThan(String value) {
            addCriterion("RSV_COM <", value, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComLessThanOrEqualTo(String value) {
            addCriterion("RSV_COM <=", value, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComLike(String value) {
            addCriterion("RSV_COM like", value, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComNotLike(String value) {
            addCriterion("RSV_COM not like", value, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComIn(List<String> values) {
            addCriterion("RSV_COM in", values, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComNotIn(List<String> values) {
            addCriterion("RSV_COM not in", values, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComBetween(String value1, String value2) {
            addCriterion("RSV_COM between", value1, value2, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComNotBetween(String value1, String value2) {
            addCriterion("RSV_COM not between", value1, value2, "rsvCom");
            return (Criteria) this;
        }

        public Criteria andRsvComNamIsNull() {
            addCriterion("RSV_COM_NAM is null");
            return (Criteria) this;
        }

        public Criteria andRsvComNamIsNotNull() {
            addCriterion("RSV_COM_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andRsvComNamEqualTo(String value) {
            addCriterion("RSV_COM_NAM =", value, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvComNamNotEqualTo(String value) {
            addCriterion("RSV_COM_NAM <>", value, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvComNamGreaterThan(String value) {
            addCriterion("RSV_COM_NAM >", value, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvComNamGreaterThanOrEqualTo(String value) {
            addCriterion("RSV_COM_NAM >=", value, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvComNamLessThan(String value) {
            addCriterion("RSV_COM_NAM <", value, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvComNamLessThanOrEqualTo(String value) {
            addCriterion("RSV_COM_NAM <=", value, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvComNamLike(String value) {
            addCriterion("RSV_COM_NAM like", value, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvComNamNotLike(String value) {
            addCriterion("RSV_COM_NAM not like", value, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvComNamIn(List<String> values) {
            addCriterion("RSV_COM_NAM in", values, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvComNamNotIn(List<String> values) {
            addCriterion("RSV_COM_NAM not in", values, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvComNamBetween(String value1, String value2) {
            addCriterion("RSV_COM_NAM between", value1, value2, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvComNamNotBetween(String value1, String value2) {
            addCriterion("RSV_COM_NAM not between", value1, value2, "rsvComNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrIsNull() {
            addCriterion("RSV_USR is null");
            return (Criteria) this;
        }

        public Criteria andRsvUsrIsNotNull() {
            addCriterion("RSV_USR is not null");
            return (Criteria) this;
        }

        public Criteria andRsvUsrEqualTo(String value) {
            addCriterion("RSV_USR =", value, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNotEqualTo(String value) {
            addCriterion("RSV_USR <>", value, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrGreaterThan(String value) {
            addCriterion("RSV_USR >", value, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrGreaterThanOrEqualTo(String value) {
            addCriterion("RSV_USR >=", value, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrLessThan(String value) {
            addCriterion("RSV_USR <", value, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrLessThanOrEqualTo(String value) {
            addCriterion("RSV_USR <=", value, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrLike(String value) {
            addCriterion("RSV_USR like", value, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNotLike(String value) {
            addCriterion("RSV_USR not like", value, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrIn(List<String> values) {
            addCriterion("RSV_USR in", values, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNotIn(List<String> values) {
            addCriterion("RSV_USR not in", values, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrBetween(String value1, String value2) {
            addCriterion("RSV_USR between", value1, value2, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNotBetween(String value1, String value2) {
            addCriterion("RSV_USR not between", value1, value2, "rsvUsr");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamIsNull() {
            addCriterion("RSV_USR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamIsNotNull() {
            addCriterion("RSV_USR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamEqualTo(String value) {
            addCriterion("RSV_USR_NAM =", value, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamNotEqualTo(String value) {
            addCriterion("RSV_USR_NAM <>", value, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamGreaterThan(String value) {
            addCriterion("RSV_USR_NAM >", value, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamGreaterThanOrEqualTo(String value) {
            addCriterion("RSV_USR_NAM >=", value, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamLessThan(String value) {
            addCriterion("RSV_USR_NAM <", value, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamLessThanOrEqualTo(String value) {
            addCriterion("RSV_USR_NAM <=", value, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamLike(String value) {
            addCriterion("RSV_USR_NAM like", value, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamNotLike(String value) {
            addCriterion("RSV_USR_NAM not like", value, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamIn(List<String> values) {
            addCriterion("RSV_USR_NAM in", values, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamNotIn(List<String> values) {
            addCriterion("RSV_USR_NAM not in", values, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamBetween(String value1, String value2) {
            addCriterion("RSV_USR_NAM between", value1, value2, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRsvUsrNamNotBetween(String value1, String value2) {
            addCriterion("RSV_USR_NAM not between", value1, value2, "rsvUsrNam");
            return (Criteria) this;
        }

        public Criteria andRetFlgIsNull() {
            addCriterion("RET_FLG is null");
            return (Criteria) this;
        }

        public Criteria andRetFlgIsNotNull() {
            addCriterion("RET_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andRetFlgEqualTo(String value) {
            addCriterion("RET_FLG =", value, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetFlgNotEqualTo(String value) {
            addCriterion("RET_FLG <>", value, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetFlgGreaterThan(String value) {
            addCriterion("RET_FLG >", value, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetFlgGreaterThanOrEqualTo(String value) {
            addCriterion("RET_FLG >=", value, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetFlgLessThan(String value) {
            addCriterion("RET_FLG <", value, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetFlgLessThanOrEqualTo(String value) {
            addCriterion("RET_FLG <=", value, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetFlgLike(String value) {
            addCriterion("RET_FLG like", value, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetFlgNotLike(String value) {
            addCriterion("RET_FLG not like", value, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetFlgIn(List<String> values) {
            addCriterion("RET_FLG in", values, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetFlgNotIn(List<String> values) {
            addCriterion("RET_FLG not in", values, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetFlgBetween(String value1, String value2) {
            addCriterion("RET_FLG between", value1, value2, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetFlgNotBetween(String value1, String value2) {
            addCriterion("RET_FLG not between", value1, value2, "retFlg");
            return (Criteria) this;
        }

        public Criteria andRetMemIsNull() {
            addCriterion("RET_MEM is null");
            return (Criteria) this;
        }

        public Criteria andRetMemIsNotNull() {
            addCriterion("RET_MEM is not null");
            return (Criteria) this;
        }

        public Criteria andRetMemEqualTo(String value) {
            addCriterion("RET_MEM =", value, "retMem");
            return (Criteria) this;
        }

        public Criteria andRetMemNotEqualTo(String value) {
            addCriterion("RET_MEM <>", value, "retMem");
            return (Criteria) this;
        }

        public Criteria andRetMemGreaterThan(String value) {
            addCriterion("RET_MEM >", value, "retMem");
            return (Criteria) this;
        }

        public Criteria andRetMemGreaterThanOrEqualTo(String value) {
            addCriterion("RET_MEM >=", value, "retMem");
            return (Criteria) this;
        }

        public Criteria andRetMemLessThan(String value) {
            addCriterion("RET_MEM <", value, "retMem");
            return (Criteria) this;
        }

        public Criteria andRetMemLessThanOrEqualTo(String value) {
            addCriterion("RET_MEM <=", value, "retMem");
            return (Criteria) this;
        }

        public Criteria andRetMemLike(String value) {
            addCriterion("RET_MEM like", value, "retMem");
            return (Criteria) this;
        }

        public Criteria andRetMemNotLike(String value) {
            addCriterion("RET_MEM not like", value, "retMem");
            return (Criteria) this;
        }

        public Criteria andRetMemIn(List<String> values) {
            addCriterion("RET_MEM in", values, "retMem");
            return (Criteria) this;
        }

        public Criteria andRetMemNotIn(List<String> values) {
            addCriterion("RET_MEM not in", values, "retMem");
            return (Criteria) this;
        }

        public Criteria andRetMemBetween(String value1, String value2) {
            addCriterion("RET_MEM between", value1, value2, "retMem");
            return (Criteria) this;
        }

        public Criteria andRetMemNotBetween(String value1, String value2) {
            addCriterion("RET_MEM not between", value1, value2, "retMem");
            return (Criteria) this;
        }

        public Criteria andOutPltIsNull() {
            addCriterion("OUT_PLT is null");
            return (Criteria) this;
        }

        public Criteria andOutPltIsNotNull() {
            addCriterion("OUT_PLT is not null");
            return (Criteria) this;
        }

        public Criteria andOutPltEqualTo(String value) {
            addCriterion("OUT_PLT =", value, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutPltNotEqualTo(String value) {
            addCriterion("OUT_PLT <>", value, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutPltGreaterThan(String value) {
            addCriterion("OUT_PLT >", value, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutPltGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_PLT >=", value, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutPltLessThan(String value) {
            addCriterion("OUT_PLT <", value, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutPltLessThanOrEqualTo(String value) {
            addCriterion("OUT_PLT <=", value, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutPltLike(String value) {
            addCriterion("OUT_PLT like", value, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutPltNotLike(String value) {
            addCriterion("OUT_PLT not like", value, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutPltIn(List<String> values) {
            addCriterion("OUT_PLT in", values, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutPltNotIn(List<String> values) {
            addCriterion("OUT_PLT not in", values, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutPltBetween(String value1, String value2) {
            addCriterion("OUT_PLT between", value1, value2, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutPltNotBetween(String value1, String value2) {
            addCriterion("OUT_PLT not between", value1, value2, "outPlt");
            return (Criteria) this;
        }

        public Criteria andOutSeqIsNull() {
            addCriterion("OUT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andOutSeqIsNotNull() {
            addCriterion("OUT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andOutSeqEqualTo(String value) {
            addCriterion("OUT_SEQ =", value, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutSeqNotEqualTo(String value) {
            addCriterion("OUT_SEQ <>", value, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutSeqGreaterThan(String value) {
            addCriterion("OUT_SEQ >", value, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutSeqGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_SEQ >=", value, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutSeqLessThan(String value) {
            addCriterion("OUT_SEQ <", value, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutSeqLessThanOrEqualTo(String value) {
            addCriterion("OUT_SEQ <=", value, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutSeqLike(String value) {
            addCriterion("OUT_SEQ like", value, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutSeqNotLike(String value) {
            addCriterion("OUT_SEQ not like", value, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutSeqIn(List<String> values) {
            addCriterion("OUT_SEQ in", values, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutSeqNotIn(List<String> values) {
            addCriterion("OUT_SEQ not in", values, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutSeqBetween(String value1, String value2) {
            addCriterion("OUT_SEQ between", value1, value2, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutSeqNotBetween(String value1, String value2) {
            addCriterion("OUT_SEQ not between", value1, value2, "outSeq");
            return (Criteria) this;
        }

        public Criteria andOutUsrIsNull() {
            addCriterion("OUT_USR is null");
            return (Criteria) this;
        }

        public Criteria andOutUsrIsNotNull() {
            addCriterion("OUT_USR is not null");
            return (Criteria) this;
        }

        public Criteria andOutUsrEqualTo(String value) {
            addCriterion("OUT_USR =", value, "outUsr");
            return (Criteria) this;
        }

        public Criteria andOutUsrNotEqualTo(String value) {
            addCriterion("OUT_USR <>", value, "outUsr");
            return (Criteria) this;
        }

        public Criteria andOutUsrGreaterThan(String value) {
            addCriterion("OUT_USR >", value, "outUsr");
            return (Criteria) this;
        }

        public Criteria andOutUsrGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_USR >=", value, "outUsr");
            return (Criteria) this;
        }

        public Criteria andOutUsrLessThan(String value) {
            addCriterion("OUT_USR <", value, "outUsr");
            return (Criteria) this;
        }

        public Criteria andOutUsrLessThanOrEqualTo(String value) {
            addCriterion("OUT_USR <=", value, "outUsr");
            return (Criteria) this;
        }

        public Criteria andOutUsrLike(String value) {
            addCriterion("OUT_USR like", value, "outUsr");
            return (Criteria) this;
        }

        public Criteria andOutUsrNotLike(String value) {
            addCriterion("OUT_USR not like", value, "outUsr");
            return (Criteria) this;
        }

        public Criteria andOutUsrIn(List<String> values) {
            addCriterion("OUT_USR in", values, "outUsr");
            return (Criteria) this;
        }

        public Criteria andOutUsrNotIn(List<String> values) {
            addCriterion("OUT_USR not in", values, "outUsr");
            return (Criteria) this;
        }

        public Criteria andOutUsrBetween(String value1, String value2) {
            addCriterion("OUT_USR between", value1, value2, "outUsr");
            return (Criteria) this;
        }

        public Criteria andOutUsrNotBetween(String value1, String value2) {
            addCriterion("OUT_USR not between", value1, value2, "outUsr");
            return (Criteria) this;
        }

        public Criteria andSndFlgIsNull() {
            addCriterion("SND_FLG is null");
            return (Criteria) this;
        }

        public Criteria andSndFlgIsNotNull() {
            addCriterion("SND_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andSndFlgEqualTo(String value) {
            addCriterion("SND_FLG =", value, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andSndFlgNotEqualTo(String value) {
            addCriterion("SND_FLG <>", value, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andSndFlgGreaterThan(String value) {
            addCriterion("SND_FLG >", value, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andSndFlgGreaterThanOrEqualTo(String value) {
            addCriterion("SND_FLG >=", value, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andSndFlgLessThan(String value) {
            addCriterion("SND_FLG <", value, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andSndFlgLessThanOrEqualTo(String value) {
            addCriterion("SND_FLG <=", value, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andSndFlgLike(String value) {
            addCriterion("SND_FLG like", value, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andSndFlgNotLike(String value) {
            addCriterion("SND_FLG not like", value, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andSndFlgIn(List<String> values) {
            addCriterion("SND_FLG in", values, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andSndFlgNotIn(List<String> values) {
            addCriterion("SND_FLG not in", values, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andSndFlgBetween(String value1, String value2) {
            addCriterion("SND_FLG between", value1, value2, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andSndFlgNotBetween(String value1, String value2) {
            addCriterion("SND_FLG not between", value1, value2, "sndFlg");
            return (Criteria) this;
        }

        public Criteria andBusSeqIsNull() {
            addCriterion("BUS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBusSeqIsNotNull() {
            addCriterion("BUS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBusSeqEqualTo(String value) {
            addCriterion("BUS_SEQ =", value, "busSeq");
            return (Criteria) this;
        }

        public Criteria andBusSeqNotEqualTo(String value) {
            addCriterion("BUS_SEQ <>", value, "busSeq");
            return (Criteria) this;
        }

        public Criteria andBusSeqGreaterThan(String value) {
            addCriterion("BUS_SEQ >", value, "busSeq");
            return (Criteria) this;
        }

        public Criteria andBusSeqGreaterThanOrEqualTo(String value) {
            addCriterion("BUS_SEQ >=", value, "busSeq");
            return (Criteria) this;
        }

        public Criteria andBusSeqLessThan(String value) {
            addCriterion("BUS_SEQ <", value, "busSeq");
            return (Criteria) this;
        }

        public Criteria andBusSeqLessThanOrEqualTo(String value) {
            addCriterion("BUS_SEQ <=", value, "busSeq");
            return (Criteria) this;
        }

        public Criteria andBusSeqLike(String value) {
            addCriterion("BUS_SEQ like", value, "busSeq");
            return (Criteria) this;
        }

        public Criteria andBusSeqNotLike(String value) {
            addCriterion("BUS_SEQ not like", value, "busSeq");
            return (Criteria) this;
        }

        public Criteria andBusSeqIn(List<String> values) {
            addCriterion("BUS_SEQ in", values, "busSeq");
            return (Criteria) this;
        }

        public Criteria andBusSeqNotIn(List<String> values) {
            addCriterion("BUS_SEQ not in", values, "busSeq");
            return (Criteria) this;
        }

        public Criteria andBusSeqBetween(String value1, String value2) {
            addCriterion("BUS_SEQ between", value1, value2, "busSeq");
            return (Criteria) this;
        }

        public Criteria andBusSeqNotBetween(String value1, String value2) {
            addCriterion("BUS_SEQ not between", value1, value2, "busSeq");
            return (Criteria) this;
        }

        public Criteria andAitParIsNull() {
            addCriterion("AIT_PAR is null");
            return (Criteria) this;
        }

        public Criteria andAitParIsNotNull() {
            addCriterion("AIT_PAR is not null");
            return (Criteria) this;
        }

        public Criteria andAitParEqualTo(String value) {
            addCriterion("AIT_PAR =", value, "aitPar");
            return (Criteria) this;
        }

        public Criteria andAitParNotEqualTo(String value) {
            addCriterion("AIT_PAR <>", value, "aitPar");
            return (Criteria) this;
        }

        public Criteria andAitParGreaterThan(String value) {
            addCriterion("AIT_PAR >", value, "aitPar");
            return (Criteria) this;
        }

        public Criteria andAitParGreaterThanOrEqualTo(String value) {
            addCriterion("AIT_PAR >=", value, "aitPar");
            return (Criteria) this;
        }

        public Criteria andAitParLessThan(String value) {
            addCriterion("AIT_PAR <", value, "aitPar");
            return (Criteria) this;
        }

        public Criteria andAitParLessThanOrEqualTo(String value) {
            addCriterion("AIT_PAR <=", value, "aitPar");
            return (Criteria) this;
        }

        public Criteria andAitParLike(String value) {
            addCriterion("AIT_PAR like", value, "aitPar");
            return (Criteria) this;
        }

        public Criteria andAitParNotLike(String value) {
            addCriterion("AIT_PAR not like", value, "aitPar");
            return (Criteria) this;
        }

        public Criteria andAitParIn(List<String> values) {
            addCriterion("AIT_PAR in", values, "aitPar");
            return (Criteria) this;
        }

        public Criteria andAitParNotIn(List<String> values) {
            addCriterion("AIT_PAR not in", values, "aitPar");
            return (Criteria) this;
        }

        public Criteria andAitParBetween(String value1, String value2) {
            addCriterion("AIT_PAR between", value1, value2, "aitPar");
            return (Criteria) this;
        }

        public Criteria andAitParNotBetween(String value1, String value2) {
            addCriterion("AIT_PAR not between", value1, value2, "aitPar");
            return (Criteria) this;
        }

        public Criteria andChlTypIsNull() {
            addCriterion("CHL_TYP is null");
            return (Criteria) this;
        }

        public Criteria andChlTypIsNotNull() {
            addCriterion("CHL_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andChlTypEqualTo(String value) {
            addCriterion("CHL_TYP =", value, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andChlTypNotEqualTo(String value) {
            addCriterion("CHL_TYP <>", value, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andChlTypGreaterThan(String value) {
            addCriterion("CHL_TYP >", value, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andChlTypGreaterThanOrEqualTo(String value) {
            addCriterion("CHL_TYP >=", value, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andChlTypLessThan(String value) {
            addCriterion("CHL_TYP <", value, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andChlTypLessThanOrEqualTo(String value) {
            addCriterion("CHL_TYP <=", value, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andChlTypLike(String value) {
            addCriterion("CHL_TYP like", value, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andChlTypNotLike(String value) {
            addCriterion("CHL_TYP not like", value, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andChlTypIn(List<String> values) {
            addCriterion("CHL_TYP in", values, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andChlTypNotIn(List<String> values) {
            addCriterion("CHL_TYP not in", values, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andChlTypBetween(String value1, String value2) {
            addCriterion("CHL_TYP between", value1, value2, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andChlTypNotBetween(String value1, String value2) {
            addCriterion("CHL_TYP not between", value1, value2, "chlTyp");
            return (Criteria) this;
        }

        public Criteria andAitSceIsNull() {
            addCriterion("AIT_SCE is null");
            return (Criteria) this;
        }

        public Criteria andAitSceIsNotNull() {
            addCriterion("AIT_SCE is not null");
            return (Criteria) this;
        }

        public Criteria andAitSceEqualTo(String value) {
            addCriterion("AIT_SCE =", value, "aitSce");
            return (Criteria) this;
        }

        public Criteria andAitSceNotEqualTo(String value) {
            addCriterion("AIT_SCE <>", value, "aitSce");
            return (Criteria) this;
        }

        public Criteria andAitSceGreaterThan(String value) {
            addCriterion("AIT_SCE >", value, "aitSce");
            return (Criteria) this;
        }

        public Criteria andAitSceGreaterThanOrEqualTo(String value) {
            addCriterion("AIT_SCE >=", value, "aitSce");
            return (Criteria) this;
        }

        public Criteria andAitSceLessThan(String value) {
            addCriterion("AIT_SCE <", value, "aitSce");
            return (Criteria) this;
        }

        public Criteria andAitSceLessThanOrEqualTo(String value) {
            addCriterion("AIT_SCE <=", value, "aitSce");
            return (Criteria) this;
        }

        public Criteria andAitSceLike(String value) {
            addCriterion("AIT_SCE like", value, "aitSce");
            return (Criteria) this;
        }

        public Criteria andAitSceNotLike(String value) {
            addCriterion("AIT_SCE not like", value, "aitSce");
            return (Criteria) this;
        }

        public Criteria andAitSceIn(List<String> values) {
            addCriterion("AIT_SCE in", values, "aitSce");
            return (Criteria) this;
        }

        public Criteria andAitSceNotIn(List<String> values) {
            addCriterion("AIT_SCE not in", values, "aitSce");
            return (Criteria) this;
        }

        public Criteria andAitSceBetween(String value1, String value2) {
            addCriterion("AIT_SCE between", value1, value2, "aitSce");
            return (Criteria) this;
        }

        public Criteria andAitSceNotBetween(String value1, String value2) {
            addCriterion("AIT_SCE not between", value1, value2, "aitSce");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(String value) {
            addCriterion("SYSTEM_ID =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(String value) {
            addCriterion("SYSTEM_ID <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(String value) {
            addCriterion("SYSTEM_ID >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(String value) {
            addCriterion("SYSTEM_ID <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLike(String value) {
            addCriterion("SYSTEM_ID like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotLike(String value) {
            addCriterion("SYSTEM_ID not like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<String> values) {
            addCriterion("SYSTEM_ID in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<String> values) {
            addCriterion("SYSTEM_ID not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID not between", value1, value2, "systemId");
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