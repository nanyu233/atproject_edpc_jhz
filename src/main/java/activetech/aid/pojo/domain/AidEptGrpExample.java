package activetech.aid.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AidEptGrpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AidEptGrpExample() {
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

        public Criteria andGrpSeqIsNull() {
            addCriterion("GRP_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andGrpSeqIsNotNull() {
            addCriterion("GRP_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andGrpSeqEqualTo(String value) {
            addCriterion("GRP_SEQ =", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqNotEqualTo(String value) {
            addCriterion("GRP_SEQ <>", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqGreaterThan(String value) {
            addCriterion("GRP_SEQ >", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqGreaterThanOrEqualTo(String value) {
            addCriterion("GRP_SEQ >=", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqLessThan(String value) {
            addCriterion("GRP_SEQ <", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqLessThanOrEqualTo(String value) {
            addCriterion("GRP_SEQ <=", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqLike(String value) {
            addCriterion("GRP_SEQ like", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqNotLike(String value) {
            addCriterion("GRP_SEQ not like", value, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqIn(List<String> values) {
            addCriterion("GRP_SEQ in", values, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqNotIn(List<String> values) {
            addCriterion("GRP_SEQ not in", values, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqBetween(String value1, String value2) {
            addCriterion("GRP_SEQ between", value1, value2, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpSeqNotBetween(String value1, String value2) {
            addCriterion("GRP_SEQ not between", value1, value2, "grpSeq");
            return (Criteria) this;
        }

        public Criteria andGrpNoIsNull() {
            addCriterion("GRP_NO is null");
            return (Criteria) this;
        }

        public Criteria andGrpNoIsNotNull() {
            addCriterion("GRP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGrpNoEqualTo(String value) {
            addCriterion("GRP_NO =", value, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNoNotEqualTo(String value) {
            addCriterion("GRP_NO <>", value, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNoGreaterThan(String value) {
            addCriterion("GRP_NO >", value, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNoGreaterThanOrEqualTo(String value) {
            addCriterion("GRP_NO >=", value, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNoLessThan(String value) {
            addCriterion("GRP_NO <", value, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNoLessThanOrEqualTo(String value) {
            addCriterion("GRP_NO <=", value, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNoLike(String value) {
            addCriterion("GRP_NO like", value, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNoNotLike(String value) {
            addCriterion("GRP_NO not like", value, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNoIn(List<String> values) {
            addCriterion("GRP_NO in", values, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNoNotIn(List<String> values) {
            addCriterion("GRP_NO not in", values, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNoBetween(String value1, String value2) {
            addCriterion("GRP_NO between", value1, value2, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNoNotBetween(String value1, String value2) {
            addCriterion("GRP_NO not between", value1, value2, "grpNo");
            return (Criteria) this;
        }

        public Criteria andGrpNamIsNull() {
            addCriterion("GRP_NAM is null");
            return (Criteria) this;
        }

        public Criteria andGrpNamIsNotNull() {
            addCriterion("GRP_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andGrpNamEqualTo(String value) {
            addCriterion("GRP_NAM =", value, "grpNam");
            return (Criteria) this;
        }

        public Criteria andGrpNamNotEqualTo(String value) {
            addCriterion("GRP_NAM <>", value, "grpNam");
            return (Criteria) this;
        }

        public Criteria andGrpNamGreaterThan(String value) {
            addCriterion("GRP_NAM >", value, "grpNam");
            return (Criteria) this;
        }

        public Criteria andGrpNamGreaterThanOrEqualTo(String value) {
            addCriterion("GRP_NAM >=", value, "grpNam");
            return (Criteria) this;
        }

        public Criteria andGrpNamLessThan(String value) {
            addCriterion("GRP_NAM <", value, "grpNam");
            return (Criteria) this;
        }

        public Criteria andGrpNamLessThanOrEqualTo(String value) {
            addCriterion("GRP_NAM <=", value, "grpNam");
            return (Criteria) this;
        }

        public Criteria andGrpNamLike(String value) {
            addCriterion("GRP_NAM like", value, "grpNam");
            return (Criteria) this;
        }

        public Criteria andGrpNamNotLike(String value) {
            addCriterion("GRP_NAM not like", value, "grpNam");
            return (Criteria) this;
        }

        public Criteria andGrpNamIn(List<String> values) {
            addCriterion("GRP_NAM in", values, "grpNam");
            return (Criteria) this;
        }

        public Criteria andGrpNamNotIn(List<String> values) {
            addCriterion("GRP_NAM not in", values, "grpNam");
            return (Criteria) this;
        }

        public Criteria andGrpNamBetween(String value1, String value2) {
            addCriterion("GRP_NAM between", value1, value2, "grpNam");
            return (Criteria) this;
        }

        public Criteria andGrpNamNotBetween(String value1, String value2) {
            addCriterion("GRP_NAM not between", value1, value2, "grpNam");
            return (Criteria) this;
        }

        public Criteria andEptTypIsNull() {
            addCriterion("EPT_TYP is null");
            return (Criteria) this;
        }

        public Criteria andEptTypIsNotNull() {
            addCriterion("EPT_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andEptTypEqualTo(String value) {
            addCriterion("EPT_TYP =", value, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptTypNotEqualTo(String value) {
            addCriterion("EPT_TYP <>", value, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptTypGreaterThan(String value) {
            addCriterion("EPT_TYP >", value, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptTypGreaterThanOrEqualTo(String value) {
            addCriterion("EPT_TYP >=", value, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptTypLessThan(String value) {
            addCriterion("EPT_TYP <", value, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptTypLessThanOrEqualTo(String value) {
            addCriterion("EPT_TYP <=", value, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptTypLike(String value) {
            addCriterion("EPT_TYP like", value, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptTypNotLike(String value) {
            addCriterion("EPT_TYP not like", value, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptTypIn(List<String> values) {
            addCriterion("EPT_TYP in", values, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptTypNotIn(List<String> values) {
            addCriterion("EPT_TYP not in", values, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptTypBetween(String value1, String value2) {
            addCriterion("EPT_TYP between", value1, value2, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptTypNotBetween(String value1, String value2) {
            addCriterion("EPT_TYP not between", value1, value2, "eptTyp");
            return (Criteria) this;
        }

        public Criteria andEptNoIsNull() {
            addCriterion("EPT_NO is null");
            return (Criteria) this;
        }

        public Criteria andEptNoIsNotNull() {
            addCriterion("EPT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEptNoEqualTo(String value) {
            addCriterion("EPT_NO =", value, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptNoNotEqualTo(String value) {
            addCriterion("EPT_NO <>", value, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptNoGreaterThan(String value) {
            addCriterion("EPT_NO >", value, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptNoGreaterThanOrEqualTo(String value) {
            addCriterion("EPT_NO >=", value, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptNoLessThan(String value) {
            addCriterion("EPT_NO <", value, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptNoLessThanOrEqualTo(String value) {
            addCriterion("EPT_NO <=", value, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptNoLike(String value) {
            addCriterion("EPT_NO like", value, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptNoNotLike(String value) {
            addCriterion("EPT_NO not like", value, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptNoIn(List<String> values) {
            addCriterion("EPT_NO in", values, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptNoNotIn(List<String> values) {
            addCriterion("EPT_NO not in", values, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptNoBetween(String value1, String value2) {
            addCriterion("EPT_NO between", value1, value2, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptNoNotBetween(String value1, String value2) {
            addCriterion("EPT_NO not between", value1, value2, "eptNo");
            return (Criteria) this;
        }

        public Criteria andEptComIsNull() {
            addCriterion("EPT_COM is null");
            return (Criteria) this;
        }

        public Criteria andEptComIsNotNull() {
            addCriterion("EPT_COM is not null");
            return (Criteria) this;
        }

        public Criteria andEptComEqualTo(String value) {
            addCriterion("EPT_COM =", value, "eptCom");
            return (Criteria) this;
        }

        public Criteria andEptComNotEqualTo(String value) {
            addCriterion("EPT_COM <>", value, "eptCom");
            return (Criteria) this;
        }

        public Criteria andEptComGreaterThan(String value) {
            addCriterion("EPT_COM >", value, "eptCom");
            return (Criteria) this;
        }

        public Criteria andEptComGreaterThanOrEqualTo(String value) {
            addCriterion("EPT_COM >=", value, "eptCom");
            return (Criteria) this;
        }

        public Criteria andEptComLessThan(String value) {
            addCriterion("EPT_COM <", value, "eptCom");
            return (Criteria) this;
        }

        public Criteria andEptComLessThanOrEqualTo(String value) {
            addCriterion("EPT_COM <=", value, "eptCom");
            return (Criteria) this;
        }

        public Criteria andEptComLike(String value) {
            addCriterion("EPT_COM like", value, "eptCom");
            return (Criteria) this;
        }

        public Criteria andEptComNotLike(String value) {
            addCriterion("EPT_COM not like", value, "eptCom");
            return (Criteria) this;
        }

        public Criteria andEptComIn(List<String> values) {
            addCriterion("EPT_COM in", values, "eptCom");
            return (Criteria) this;
        }

        public Criteria andEptComNotIn(List<String> values) {
            addCriterion("EPT_COM not in", values, "eptCom");
            return (Criteria) this;
        }

        public Criteria andEptComBetween(String value1, String value2) {
            addCriterion("EPT_COM between", value1, value2, "eptCom");
            return (Criteria) this;
        }

        public Criteria andEptComNotBetween(String value1, String value2) {
            addCriterion("EPT_COM not between", value1, value2, "eptCom");
            return (Criteria) this;
        }

        public Criteria andWxpFlgIsNull() {
            addCriterion("WXP_FLG is null");
            return (Criteria) this;
        }

        public Criteria andWxpFlgIsNotNull() {
            addCriterion("WXP_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andWxpFlgEqualTo(String value) {
            addCriterion("WXP_FLG =", value, "wxpFlg");
            return (Criteria) this;
        }

        public Criteria andWxpFlgNotEqualTo(String value) {
            addCriterion("WXP_FLG <>", value, "wxpFlg");
            return (Criteria) this;
        }

        public Criteria andWxpFlgGreaterThan(String value) {
            addCriterion("WXP_FLG >", value, "wxpFlg");
            return (Criteria) this;
        }

        public Criteria andWxpFlgGreaterThanOrEqualTo(String value) {
            addCriterion("WXP_FLG >=", value, "wxpFlg");
            return (Criteria) this;
        }

        public Criteria andWxpFlgLessThan(String value) {
            addCriterion("WXP_FLG <", value, "wxpFlg");
            return (Criteria) this;
        }

        public Criteria andWxpFlgLessThanOrEqualTo(String value) {
            addCriterion("WXP_FLG <=", value, "wxpFlg");
            return (Criteria) this;
        }

        public Criteria andWxpFlgLike(String value) {
            addCriterion("WXP_FLG like", value, "wxpFlg");
            return (Criteria) this;
        }

        public Criteria andWxpFlgNotLike(String value) {
            addCriterion("WXP_FLG not like", value, "wxpFlg");
            return (Criteria) this;
        }

        public Criteria andWxpFlgIn(List<String> values) {
            addCriterion("WXP_FLG in", values, "wxpFlg");
            return (Criteria) this;
        }

        public Criteria andWxpFlgNotIn(List<String> values) {
            addCriterion("WXP_FLG not in", values, "wxpFlg");
            return (Criteria) this;
        }

        public Criteria andWxpFlgBetween(String value1, String value2) {
            addCriterion("WXP_FLG between", value1, value2, "wxpFlg");
            return (Criteria) this;
        }

        public Criteria andWxpFlgNotBetween(String value1, String value2) {
            addCriterion("WXP_FLG not between", value1, value2, "wxpFlg");
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

        public Criteria andModTimIsNull() {
            addCriterion("MOD_TIM is null");
            return (Criteria) this;
        }

        public Criteria andModTimIsNotNull() {
            addCriterion("MOD_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andModTimEqualTo(Date value) {
            addCriterion("MOD_TIM =", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotEqualTo(Date value) {
            addCriterion("MOD_TIM <>", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimGreaterThan(Date value) {
            addCriterion("MOD_TIM >", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimGreaterThanOrEqualTo(Date value) {
            addCriterion("MOD_TIM >=", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimLessThan(Date value) {
            addCriterion("MOD_TIM <", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimLessThanOrEqualTo(Date value) {
            addCriterion("MOD_TIM <=", value, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimIn(List<Date> values) {
            addCriterion("MOD_TIM in", values, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotIn(List<Date> values) {
            addCriterion("MOD_TIM not in", values, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimBetween(Date value1, Date value2) {
            addCriterion("MOD_TIM between", value1, value2, "modTim");
            return (Criteria) this;
        }

        public Criteria andModTimNotBetween(Date value1, Date value2) {
            addCriterion("MOD_TIM not between", value1, value2, "modTim");
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
    }

    /**
     */
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