package activetech.edpc.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspDbzlBasExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDbzlBasExample() {
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

        public Criteria andRegSeqIsNull() {
            addCriterion("REG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andRegSeqIsNotNull() {
            addCriterion("REG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRegSeqEqualTo(String value) {
            addCriterion("REG_SEQ =", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqNotEqualTo(String value) {
            addCriterion("REG_SEQ <>", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqGreaterThan(String value) {
            addCriterion("REG_SEQ >", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqGreaterThanOrEqualTo(String value) {
            addCriterion("REG_SEQ >=", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqLessThan(String value) {
            addCriterion("REG_SEQ <", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqLessThanOrEqualTo(String value) {
            addCriterion("REG_SEQ <=", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqLike(String value) {
            addCriterion("REG_SEQ like", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqNotLike(String value) {
            addCriterion("REG_SEQ not like", value, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqIn(List<String> values) {
            addCriterion("REG_SEQ in", values, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqNotIn(List<String> values) {
            addCriterion("REG_SEQ not in", values, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqBetween(String value1, String value2) {
            addCriterion("REG_SEQ between", value1, value2, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegSeqNotBetween(String value1, String value2) {
            addCriterion("REG_SEQ not between", value1, value2, "regSeq");
            return (Criteria) this;
        }

        public Criteria andRegTimIsNull() {
            addCriterion("REG_TIM is null");
            return (Criteria) this;
        }

        public Criteria andRegTimIsNotNull() {
            addCriterion("REG_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimEqualTo(Date value) {
            addCriterion("REG_TIM =", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimNotEqualTo(Date value) {
            addCriterion("REG_TIM <>", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimGreaterThan(Date value) {
            addCriterion("REG_TIM >", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimGreaterThanOrEqualTo(Date value) {
            addCriterion("REG_TIM >=", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimLessThan(Date value) {
            addCriterion("REG_TIM <", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimLessThanOrEqualTo(Date value) {
            addCriterion("REG_TIM <=", value, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimIn(List<Date> values) {
            addCriterion("REG_TIM in", values, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimNotIn(List<Date> values) {
            addCriterion("REG_TIM not in", values, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimBetween(Date value1, Date value2) {
            addCriterion("REG_TIM between", value1, value2, "regTim");
            return (Criteria) this;
        }

        public Criteria andRegTimNotBetween(Date value1, Date value2) {
            addCriterion("REG_TIM not between", value1, value2, "regTim");
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

        public Criteria andMpiIsNull() {
            addCriterion("MPI is null");
            return (Criteria) this;
        }

        public Criteria andMpiIsNotNull() {
            addCriterion("MPI is not null");
            return (Criteria) this;
        }

        public Criteria andMpiEqualTo(String value) {
            addCriterion("MPI =", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotEqualTo(String value) {
            addCriterion("MPI <>", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiGreaterThan(String value) {
            addCriterion("MPI >", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiGreaterThanOrEqualTo(String value) {
            addCriterion("MPI >=", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLessThan(String value) {
            addCriterion("MPI <", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLessThanOrEqualTo(String value) {
            addCriterion("MPI <=", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiLike(String value) {
            addCriterion("MPI like", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotLike(String value) {
            addCriterion("MPI not like", value, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiIn(List<String> values) {
            addCriterion("MPI in", values, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotIn(List<String> values) {
            addCriterion("MPI not in", values, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiBetween(String value1, String value2) {
            addCriterion("MPI between", value1, value2, "mpi");
            return (Criteria) this;
        }

        public Criteria andMpiNotBetween(String value1, String value2) {
            addCriterion("MPI not between", value1, value2, "mpi");
            return (Criteria) this;
        }

        public Criteria andPatTypIsNull() {
            addCriterion("PAT_TYP is null");
            return (Criteria) this;
        }

        public Criteria andPatTypIsNotNull() {
            addCriterion("PAT_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andPatTypEqualTo(String value) {
            addCriterion("PAT_TYP =", value, "patTyp");
            return (Criteria) this;
        }

        public Criteria andPatTypNotEqualTo(String value) {
            addCriterion("PAT_TYP <>", value, "patTyp");
            return (Criteria) this;
        }

        public Criteria andPatTypGreaterThan(String value) {
            addCriterion("PAT_TYP >", value, "patTyp");
            return (Criteria) this;
        }

        public Criteria andPatTypGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_TYP >=", value, "patTyp");
            return (Criteria) this;
        }

        public Criteria andPatTypLessThan(String value) {
            addCriterion("PAT_TYP <", value, "patTyp");
            return (Criteria) this;
        }

        public Criteria andPatTypLessThanOrEqualTo(String value) {
            addCriterion("PAT_TYP <=", value, "patTyp");
            return (Criteria) this;
        }

        public Criteria andPatTypLike(String value) {
            addCriterion("PAT_TYP like", value, "patTyp");
            return (Criteria) this;
        }

        public Criteria andPatTypNotLike(String value) {
            addCriterion("PAT_TYP not like", value, "patTyp");
            return (Criteria) this;
        }

        public Criteria andPatTypIn(List<String> values) {
            addCriterion("PAT_TYP in", values, "patTyp");
            return (Criteria) this;
        }

        public Criteria andPatTypNotIn(List<String> values) {
            addCriterion("PAT_TYP not in", values, "patTyp");
            return (Criteria) this;
        }

        public Criteria andPatTypBetween(String value1, String value2) {
            addCriterion("PAT_TYP between", value1, value2, "patTyp");
            return (Criteria) this;
        }

        public Criteria andPatTypNotBetween(String value1, String value2) {
            addCriterion("PAT_TYP not between", value1, value2, "patTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypIsNull() {
            addCriterion("WAY_TYP is null");
            return (Criteria) this;
        }

        public Criteria andWayTypIsNotNull() {
            addCriterion("WAY_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andWayTypEqualTo(String value) {
            addCriterion("WAY_TYP =", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypNotEqualTo(String value) {
            addCriterion("WAY_TYP <>", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypGreaterThan(String value) {
            addCriterion("WAY_TYP >", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypGreaterThanOrEqualTo(String value) {
            addCriterion("WAY_TYP >=", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypLessThan(String value) {
            addCriterion("WAY_TYP <", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypLessThanOrEqualTo(String value) {
            addCriterion("WAY_TYP <=", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypLike(String value) {
            addCriterion("WAY_TYP like", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypNotLike(String value) {
            addCriterion("WAY_TYP not like", value, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypIn(List<String> values) {
            addCriterion("WAY_TYP in", values, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypNotIn(List<String> values) {
            addCriterion("WAY_TYP not in", values, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypBetween(String value1, String value2) {
            addCriterion("WAY_TYP between", value1, value2, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andWayTypNotBetween(String value1, String value2) {
            addCriterion("WAY_TYP not between", value1, value2, "wayTyp");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("CARD_TYPE like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("CARD_TYPE not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andVstCadIsNull() {
            addCriterion("VST_CAD is null");
            return (Criteria) this;
        }

        public Criteria andVstCadIsNotNull() {
            addCriterion("VST_CAD is not null");
            return (Criteria) this;
        }

        public Criteria andVstCadEqualTo(String value) {
            addCriterion("VST_CAD =", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotEqualTo(String value) {
            addCriterion("VST_CAD <>", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadGreaterThan(String value) {
            addCriterion("VST_CAD >", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadGreaterThanOrEqualTo(String value) {
            addCriterion("VST_CAD >=", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLessThan(String value) {
            addCriterion("VST_CAD <", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLessThanOrEqualTo(String value) {
            addCriterion("VST_CAD <=", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadLike(String value) {
            addCriterion("VST_CAD like", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotLike(String value) {
            addCriterion("VST_CAD not like", value, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadIn(List<String> values) {
            addCriterion("VST_CAD in", values, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotIn(List<String> values) {
            addCriterion("VST_CAD not in", values, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadBetween(String value1, String value2) {
            addCriterion("VST_CAD between", value1, value2, "vstCad");
            return (Criteria) this;
        }

        public Criteria andVstCadNotBetween(String value1, String value2) {
            addCriterion("VST_CAD not between", value1, value2, "vstCad");
            return (Criteria) this;
        }

        public Criteria andCstNamIsNull() {
            addCriterion("CST_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCstNamIsNotNull() {
            addCriterion("CST_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCstNamEqualTo(String value) {
            addCriterion("CST_NAM =", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamNotEqualTo(String value) {
            addCriterion("CST_NAM <>", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamGreaterThan(String value) {
            addCriterion("CST_NAM >", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamGreaterThanOrEqualTo(String value) {
            addCriterion("CST_NAM >=", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamLessThan(String value) {
            addCriterion("CST_NAM <", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamLessThanOrEqualTo(String value) {
            addCriterion("CST_NAM <=", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamLike(String value) {
            addCriterion("CST_NAM like", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamNotLike(String value) {
            addCriterion("CST_NAM not like", value, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamIn(List<String> values) {
            addCriterion("CST_NAM in", values, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamNotIn(List<String> values) {
            addCriterion("CST_NAM not in", values, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamBetween(String value1, String value2) {
            addCriterion("CST_NAM between", value1, value2, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstNamNotBetween(String value1, String value2) {
            addCriterion("CST_NAM not between", value1, value2, "cstNam");
            return (Criteria) this;
        }

        public Criteria andCstSexCodIsNull() {
            addCriterion("CST_SEX_COD is null");
            return (Criteria) this;
        }

        public Criteria andCstSexCodIsNotNull() {
            addCriterion("CST_SEX_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCstSexCodEqualTo(String value) {
            addCriterion("CST_SEX_COD =", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodNotEqualTo(String value) {
            addCriterion("CST_SEX_COD <>", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodGreaterThan(String value) {
            addCriterion("CST_SEX_COD >", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodGreaterThanOrEqualTo(String value) {
            addCriterion("CST_SEX_COD >=", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodLessThan(String value) {
            addCriterion("CST_SEX_COD <", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodLessThanOrEqualTo(String value) {
            addCriterion("CST_SEX_COD <=", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodLike(String value) {
            addCriterion("CST_SEX_COD like", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodNotLike(String value) {
            addCriterion("CST_SEX_COD not like", value, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodIn(List<String> values) {
            addCriterion("CST_SEX_COD in", values, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodNotIn(List<String> values) {
            addCriterion("CST_SEX_COD not in", values, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodBetween(String value1, String value2) {
            addCriterion("CST_SEX_COD between", value1, value2, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andCstSexCodNotBetween(String value1, String value2) {
            addCriterion("CST_SEX_COD not between", value1, value2, "cstSexCod");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNbrIsNull() {
            addCriterion("ID_NBR is null");
            return (Criteria) this;
        }

        public Criteria andIdNbrIsNotNull() {
            addCriterion("ID_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andIdNbrEqualTo(String value) {
            addCriterion("ID_NBR =", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrNotEqualTo(String value) {
            addCriterion("ID_NBR <>", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrGreaterThan(String value) {
            addCriterion("ID_NBR >", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NBR >=", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrLessThan(String value) {
            addCriterion("ID_NBR <", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrLessThanOrEqualTo(String value) {
            addCriterion("ID_NBR <=", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrLike(String value) {
            addCriterion("ID_NBR like", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrNotLike(String value) {
            addCriterion("ID_NBR not like", value, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrIn(List<String> values) {
            addCriterion("ID_NBR in", values, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrNotIn(List<String> values) {
            addCriterion("ID_NBR not in", values, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrBetween(String value1, String value2) {
            addCriterion("ID_NBR between", value1, value2, "idNbr");
            return (Criteria) this;
        }

        public Criteria andIdNbrNotBetween(String value1, String value2) {
            addCriterion("ID_NBR not between", value1, value2, "idNbr");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodIsNull() {
            addCriterion("CST_AGE_COD is null");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodIsNotNull() {
            addCriterion("CST_AGE_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodEqualTo(String value) {
            addCriterion("CST_AGE_COD =", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodNotEqualTo(String value) {
            addCriterion("CST_AGE_COD <>", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodGreaterThan(String value) {
            addCriterion("CST_AGE_COD >", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodGreaterThanOrEqualTo(String value) {
            addCriterion("CST_AGE_COD >=", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodLessThan(String value) {
            addCriterion("CST_AGE_COD <", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodLessThanOrEqualTo(String value) {
            addCriterion("CST_AGE_COD <=", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodLike(String value) {
            addCriterion("CST_AGE_COD like", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodNotLike(String value) {
            addCriterion("CST_AGE_COD not like", value, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodIn(List<String> values) {
            addCriterion("CST_AGE_COD in", values, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodNotIn(List<String> values) {
            addCriterion("CST_AGE_COD not in", values, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodBetween(String value1, String value2) {
            addCriterion("CST_AGE_COD between", value1, value2, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeCodNotBetween(String value1, String value2) {
            addCriterion("CST_AGE_COD not between", value1, value2, "cstAgeCod");
            return (Criteria) this;
        }

        public Criteria andCstAgeIsNull() {
            addCriterion("CST_AGE is null");
            return (Criteria) this;
        }

        public Criteria andCstAgeIsNotNull() {
            addCriterion("CST_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andCstAgeEqualTo(String value) {
            addCriterion("CST_AGE =", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeNotEqualTo(String value) {
            addCriterion("CST_AGE <>", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeGreaterThan(String value) {
            addCriterion("CST_AGE >", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeGreaterThanOrEqualTo(String value) {
            addCriterion("CST_AGE >=", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeLessThan(String value) {
            addCriterion("CST_AGE <", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeLessThanOrEqualTo(String value) {
            addCriterion("CST_AGE <=", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeLike(String value) {
            addCriterion("CST_AGE like", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeNotLike(String value) {
            addCriterion("CST_AGE not like", value, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeIn(List<String> values) {
            addCriterion("CST_AGE in", values, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeNotIn(List<String> values) {
            addCriterion("CST_AGE not in", values, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeBetween(String value1, String value2) {
            addCriterion("CST_AGE between", value1, value2, "cstAge");
            return (Criteria) this;
        }

        public Criteria andCstAgeNotBetween(String value1, String value2) {
            addCriterion("CST_AGE not between", value1, value2, "cstAge");
            return (Criteria) this;
        }

        public Criteria andPatWgtIsNull() {
            addCriterion("PAT_WGT is null");
            return (Criteria) this;
        }

        public Criteria andPatWgtIsNotNull() {
            addCriterion("PAT_WGT is not null");
            return (Criteria) this;
        }

        public Criteria andPatWgtEqualTo(BigDecimal value) {
            addCriterion("PAT_WGT =", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtNotEqualTo(BigDecimal value) {
            addCriterion("PAT_WGT <>", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtGreaterThan(BigDecimal value) {
            addCriterion("PAT_WGT >", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAT_WGT >=", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtLessThan(BigDecimal value) {
            addCriterion("PAT_WGT <", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAT_WGT <=", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtIn(List<BigDecimal> values) {
            addCriterion("PAT_WGT in", values, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtNotIn(List<BigDecimal> values) {
            addCriterion("PAT_WGT not in", values, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAT_WGT between", value1, value2, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAT_WGT not between", value1, value2, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatHgtIsNull() {
            addCriterion("PAT_HGT is null");
            return (Criteria) this;
        }

        public Criteria andPatHgtIsNotNull() {
            addCriterion("PAT_HGT is not null");
            return (Criteria) this;
        }

        public Criteria andPatHgtEqualTo(BigDecimal value) {
            addCriterion("PAT_HGT =", value, "patHgt");
            return (Criteria) this;
        }

        public Criteria andPatHgtNotEqualTo(BigDecimal value) {
            addCriterion("PAT_HGT <>", value, "patHgt");
            return (Criteria) this;
        }

        public Criteria andPatHgtGreaterThan(BigDecimal value) {
            addCriterion("PAT_HGT >", value, "patHgt");
            return (Criteria) this;
        }

        public Criteria andPatHgtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAT_HGT >=", value, "patHgt");
            return (Criteria) this;
        }

        public Criteria andPatHgtLessThan(BigDecimal value) {
            addCriterion("PAT_HGT <", value, "patHgt");
            return (Criteria) this;
        }

        public Criteria andPatHgtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAT_HGT <=", value, "patHgt");
            return (Criteria) this;
        }

        public Criteria andPatHgtIn(List<BigDecimal> values) {
            addCriterion("PAT_HGT in", values, "patHgt");
            return (Criteria) this;
        }

        public Criteria andPatHgtNotIn(List<BigDecimal> values) {
            addCriterion("PAT_HGT not in", values, "patHgt");
            return (Criteria) this;
        }

        public Criteria andPatHgtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAT_HGT between", value1, value2, "patHgt");
            return (Criteria) this;
        }

        public Criteria andPatHgtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAT_HGT not between", value1, value2, "patHgt");
            return (Criteria) this;
        }

        public Criteria andBthDatIsNull() {
            addCriterion("BTH_DAT is null");
            return (Criteria) this;
        }

        public Criteria andBthDatIsNotNull() {
            addCriterion("BTH_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andBthDatEqualTo(Date value) {
            addCriterion("BTH_DAT =", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatNotEqualTo(Date value) {
            addCriterion("BTH_DAT <>", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatGreaterThan(Date value) {
            addCriterion("BTH_DAT >", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatGreaterThanOrEqualTo(Date value) {
            addCriterion("BTH_DAT >=", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatLessThan(Date value) {
            addCriterion("BTH_DAT <", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatLessThanOrEqualTo(Date value) {
            addCriterion("BTH_DAT <=", value, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatIn(List<Date> values) {
            addCriterion("BTH_DAT in", values, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatNotIn(List<Date> values) {
            addCriterion("BTH_DAT not in", values, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatBetween(Date value1, Date value2) {
            addCriterion("BTH_DAT between", value1, value2, "bthDat");
            return (Criteria) this;
        }

        public Criteria andBthDatNotBetween(Date value1, Date value2) {
            addCriterion("BTH_DAT not between", value1, value2, "bthDat");
            return (Criteria) this;
        }

        public Criteria andPheNbrIsNull() {
            addCriterion("PHE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andPheNbrIsNotNull() {
            addCriterion("PHE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andPheNbrEqualTo(String value) {
            addCriterion("PHE_NBR =", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrNotEqualTo(String value) {
            addCriterion("PHE_NBR <>", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrGreaterThan(String value) {
            addCriterion("PHE_NBR >", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrGreaterThanOrEqualTo(String value) {
            addCriterion("PHE_NBR >=", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrLessThan(String value) {
            addCriterion("PHE_NBR <", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrLessThanOrEqualTo(String value) {
            addCriterion("PHE_NBR <=", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrLike(String value) {
            addCriterion("PHE_NBR like", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrNotLike(String value) {
            addCriterion("PHE_NBR not like", value, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrIn(List<String> values) {
            addCriterion("PHE_NBR in", values, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrNotIn(List<String> values) {
            addCriterion("PHE_NBR not in", values, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrBetween(String value1, String value2) {
            addCriterion("PHE_NBR between", value1, value2, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andPheNbrNotBetween(String value1, String value2) {
            addCriterion("PHE_NBR not between", value1, value2, "pheNbr");
            return (Criteria) this;
        }

        public Criteria andCstAdrIsNull() {
            addCriterion("CST_ADR is null");
            return (Criteria) this;
        }

        public Criteria andCstAdrIsNotNull() {
            addCriterion("CST_ADR is not null");
            return (Criteria) this;
        }

        public Criteria andCstAdrEqualTo(String value) {
            addCriterion("CST_ADR =", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotEqualTo(String value) {
            addCriterion("CST_ADR <>", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrGreaterThan(String value) {
            addCriterion("CST_ADR >", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrGreaterThanOrEqualTo(String value) {
            addCriterion("CST_ADR >=", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrLessThan(String value) {
            addCriterion("CST_ADR <", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrLessThanOrEqualTo(String value) {
            addCriterion("CST_ADR <=", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrLike(String value) {
            addCriterion("CST_ADR like", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotLike(String value) {
            addCriterion("CST_ADR not like", value, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrIn(List<String> values) {
            addCriterion("CST_ADR in", values, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotIn(List<String> values) {
            addCriterion("CST_ADR not in", values, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrBetween(String value1, String value2) {
            addCriterion("CST_ADR between", value1, value2, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andCstAdrNotBetween(String value1, String value2) {
            addCriterion("CST_ADR not between", value1, value2, "cstAdr");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andEmgJobIsNull() {
            addCriterion("EMG_JOB is null");
            return (Criteria) this;
        }

        public Criteria andEmgJobIsNotNull() {
            addCriterion("EMG_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andEmgJobEqualTo(String value) {
            addCriterion("EMG_JOB =", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobNotEqualTo(String value) {
            addCriterion("EMG_JOB <>", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobGreaterThan(String value) {
            addCriterion("EMG_JOB >", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_JOB >=", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobLessThan(String value) {
            addCriterion("EMG_JOB <", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobLessThanOrEqualTo(String value) {
            addCriterion("EMG_JOB <=", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobLike(String value) {
            addCriterion("EMG_JOB like", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobNotLike(String value) {
            addCriterion("EMG_JOB not like", value, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobIn(List<String> values) {
            addCriterion("EMG_JOB in", values, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobNotIn(List<String> values) {
            addCriterion("EMG_JOB not in", values, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobBetween(String value1, String value2) {
            addCriterion("EMG_JOB between", value1, value2, "emgJob");
            return (Criteria) this;
        }

        public Criteria andEmgJobNotBetween(String value1, String value2) {
            addCriterion("EMG_JOB not between", value1, value2, "emgJob");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("MARITAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("MARITAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("MARITAL_STATUS =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("MARITAL_STATUS <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("MARITAL_STATUS >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("MARITAL_STATUS <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("MARITAL_STATUS like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("MARITAL_STATUS not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("MARITAL_STATUS in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("MARITAL_STATUS not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andCstEduIsNull() {
            addCriterion("CST_EDU is null");
            return (Criteria) this;
        }

        public Criteria andCstEduIsNotNull() {
            addCriterion("CST_EDU is not null");
            return (Criteria) this;
        }

        public Criteria andCstEduEqualTo(String value) {
            addCriterion("CST_EDU =", value, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andCstEduNotEqualTo(String value) {
            addCriterion("CST_EDU <>", value, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andCstEduGreaterThan(String value) {
            addCriterion("CST_EDU >", value, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andCstEduGreaterThanOrEqualTo(String value) {
            addCriterion("CST_EDU >=", value, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andCstEduLessThan(String value) {
            addCriterion("CST_EDU <", value, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andCstEduLessThanOrEqualTo(String value) {
            addCriterion("CST_EDU <=", value, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andCstEduLike(String value) {
            addCriterion("CST_EDU like", value, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andCstEduNotLike(String value) {
            addCriterion("CST_EDU not like", value, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andCstEduIn(List<String> values) {
            addCriterion("CST_EDU in", values, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andCstEduNotIn(List<String> values) {
            addCriterion("CST_EDU not in", values, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andCstEduBetween(String value1, String value2) {
            addCriterion("CST_EDU between", value1, value2, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andCstEduNotBetween(String value1, String value2) {
            addCriterion("CST_EDU not between", value1, value2, "cstEdu");
            return (Criteria) this;
        }

        public Criteria andLnkManIsNull() {
            addCriterion("LNK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andLnkManIsNotNull() {
            addCriterion("LNK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andLnkManEqualTo(String value) {
            addCriterion("LNK_MAN =", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManNotEqualTo(String value) {
            addCriterion("LNK_MAN <>", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManGreaterThan(String value) {
            addCriterion("LNK_MAN >", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManGreaterThanOrEqualTo(String value) {
            addCriterion("LNK_MAN >=", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManLessThan(String value) {
            addCriterion("LNK_MAN <", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManLessThanOrEqualTo(String value) {
            addCriterion("LNK_MAN <=", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManLike(String value) {
            addCriterion("LNK_MAN like", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManNotLike(String value) {
            addCriterion("LNK_MAN not like", value, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManIn(List<String> values) {
            addCriterion("LNK_MAN in", values, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManNotIn(List<String> values) {
            addCriterion("LNK_MAN not in", values, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManBetween(String value1, String value2) {
            addCriterion("LNK_MAN between", value1, value2, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkManNotBetween(String value1, String value2) {
            addCriterion("LNK_MAN not between", value1, value2, "lnkMan");
            return (Criteria) this;
        }

        public Criteria andLnkWayIsNull() {
            addCriterion("LNK_WAY is null");
            return (Criteria) this;
        }

        public Criteria andLnkWayIsNotNull() {
            addCriterion("LNK_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andLnkWayEqualTo(String value) {
            addCriterion("LNK_WAY =", value, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andLnkWayNotEqualTo(String value) {
            addCriterion("LNK_WAY <>", value, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andLnkWayGreaterThan(String value) {
            addCriterion("LNK_WAY >", value, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andLnkWayGreaterThanOrEqualTo(String value) {
            addCriterion("LNK_WAY >=", value, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andLnkWayLessThan(String value) {
            addCriterion("LNK_WAY <", value, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andLnkWayLessThanOrEqualTo(String value) {
            addCriterion("LNK_WAY <=", value, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andLnkWayLike(String value) {
            addCriterion("LNK_WAY like", value, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andLnkWayNotLike(String value) {
            addCriterion("LNK_WAY not like", value, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andLnkWayIn(List<String> values) {
            addCriterion("LNK_WAY in", values, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andLnkWayNotIn(List<String> values) {
            addCriterion("LNK_WAY not in", values, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andLnkWayBetween(String value1, String value2) {
            addCriterion("LNK_WAY between", value1, value2, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andLnkWayNotBetween(String value1, String value2) {
            addCriterion("LNK_WAY not between", value1, value2, "lnkWay");
            return (Criteria) this;
        }

        public Criteria andGrnChlIsNull() {
            addCriterion("GRN_CHL is null");
            return (Criteria) this;
        }

        public Criteria andGrnChlIsNotNull() {
            addCriterion("GRN_CHL is not null");
            return (Criteria) this;
        }

        public Criteria andGrnChlEqualTo(String value) {
            addCriterion("GRN_CHL =", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlNotEqualTo(String value) {
            addCriterion("GRN_CHL <>", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlGreaterThan(String value) {
            addCriterion("GRN_CHL >", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlGreaterThanOrEqualTo(String value) {
            addCriterion("GRN_CHL >=", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlLessThan(String value) {
            addCriterion("GRN_CHL <", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlLessThanOrEqualTo(String value) {
            addCriterion("GRN_CHL <=", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlLike(String value) {
            addCriterion("GRN_CHL like", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlNotLike(String value) {
            addCriterion("GRN_CHL not like", value, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlIn(List<String> values) {
            addCriterion("GRN_CHL in", values, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlNotIn(List<String> values) {
            addCriterion("GRN_CHL not in", values, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlBetween(String value1, String value2) {
            addCriterion("GRN_CHL between", value1, value2, "grnChl");
            return (Criteria) this;
        }

        public Criteria andGrnChlNotBetween(String value1, String value2) {
            addCriterion("GRN_CHL not between", value1, value2, "grnChl");
            return (Criteria) this;
        }

        public Criteria andSwChlIsNull() {
            addCriterion("SW_CHL is null");
            return (Criteria) this;
        }

        public Criteria andSwChlIsNotNull() {
            addCriterion("SW_CHL is not null");
            return (Criteria) this;
        }

        public Criteria andSwChlEqualTo(String value) {
            addCriterion("SW_CHL =", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlNotEqualTo(String value) {
            addCriterion("SW_CHL <>", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlGreaterThan(String value) {
            addCriterion("SW_CHL >", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlGreaterThanOrEqualTo(String value) {
            addCriterion("SW_CHL >=", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlLessThan(String value) {
            addCriterion("SW_CHL <", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlLessThanOrEqualTo(String value) {
            addCriterion("SW_CHL <=", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlLike(String value) {
            addCriterion("SW_CHL like", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlNotLike(String value) {
            addCriterion("SW_CHL not like", value, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlIn(List<String> values) {
            addCriterion("SW_CHL in", values, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlNotIn(List<String> values) {
            addCriterion("SW_CHL not in", values, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlBetween(String value1, String value2) {
            addCriterion("SW_CHL between", value1, value2, "swChl");
            return (Criteria) this;
        }

        public Criteria andSwChlNotBetween(String value1, String value2) {
            addCriterion("SW_CHL not between", value1, value2, "swChl");
            return (Criteria) this;
        }

        public Criteria andHspAraIsNull() {
            addCriterion("HSP_ARA is null");
            return (Criteria) this;
        }

        public Criteria andHspAraIsNotNull() {
            addCriterion("HSP_ARA is not null");
            return (Criteria) this;
        }

        public Criteria andHspAraEqualTo(String value) {
            addCriterion("HSP_ARA =", value, "hspAra");
            return (Criteria) this;
        }

        public Criteria andHspAraNotEqualTo(String value) {
            addCriterion("HSP_ARA <>", value, "hspAra");
            return (Criteria) this;
        }

        public Criteria andHspAraGreaterThan(String value) {
            addCriterion("HSP_ARA >", value, "hspAra");
            return (Criteria) this;
        }

        public Criteria andHspAraGreaterThanOrEqualTo(String value) {
            addCriterion("HSP_ARA >=", value, "hspAra");
            return (Criteria) this;
        }

        public Criteria andHspAraLessThan(String value) {
            addCriterion("HSP_ARA <", value, "hspAra");
            return (Criteria) this;
        }

        public Criteria andHspAraLessThanOrEqualTo(String value) {
            addCriterion("HSP_ARA <=", value, "hspAra");
            return (Criteria) this;
        }

        public Criteria andHspAraLike(String value) {
            addCriterion("HSP_ARA like", value, "hspAra");
            return (Criteria) this;
        }

        public Criteria andHspAraNotLike(String value) {
            addCriterion("HSP_ARA not like", value, "hspAra");
            return (Criteria) this;
        }

        public Criteria andHspAraIn(List<String> values) {
            addCriterion("HSP_ARA in", values, "hspAra");
            return (Criteria) this;
        }

        public Criteria andHspAraNotIn(List<String> values) {
            addCriterion("HSP_ARA not in", values, "hspAra");
            return (Criteria) this;
        }

        public Criteria andHspAraBetween(String value1, String value2) {
            addCriterion("HSP_ARA between", value1, value2, "hspAra");
            return (Criteria) this;
        }

        public Criteria andHspAraNotBetween(String value1, String value2) {
            addCriterion("HSP_ARA not between", value1, value2, "hspAra");
            return (Criteria) this;
        }

        public Criteria andYqxhIsNull() {
            addCriterion("YQXH is null");
            return (Criteria) this;
        }

        public Criteria andYqxhIsNotNull() {
            addCriterion("YQXH is not null");
            return (Criteria) this;
        }

        public Criteria andYqxhEqualTo(String value) {
            addCriterion("YQXH =", value, "yqxh");
            return (Criteria) this;
        }

        public Criteria andYqxhNotEqualTo(String value) {
            addCriterion("YQXH <>", value, "yqxh");
            return (Criteria) this;
        }

        public Criteria andYqxhGreaterThan(String value) {
            addCriterion("YQXH >", value, "yqxh");
            return (Criteria) this;
        }

        public Criteria andYqxhGreaterThanOrEqualTo(String value) {
            addCriterion("YQXH >=", value, "yqxh");
            return (Criteria) this;
        }

        public Criteria andYqxhLessThan(String value) {
            addCriterion("YQXH <", value, "yqxh");
            return (Criteria) this;
        }

        public Criteria andYqxhLessThanOrEqualTo(String value) {
            addCriterion("YQXH <=", value, "yqxh");
            return (Criteria) this;
        }

        public Criteria andYqxhLike(String value) {
            addCriterion("YQXH like", value, "yqxh");
            return (Criteria) this;
        }

        public Criteria andYqxhNotLike(String value) {
            addCriterion("YQXH not like", value, "yqxh");
            return (Criteria) this;
        }

        public Criteria andYqxhIn(List<String> values) {
            addCriterion("YQXH in", values, "yqxh");
            return (Criteria) this;
        }

        public Criteria andYqxhNotIn(List<String> values) {
            addCriterion("YQXH not in", values, "yqxh");
            return (Criteria) this;
        }

        public Criteria andYqxhBetween(String value1, String value2) {
            addCriterion("YQXH between", value1, value2, "yqxh");
            return (Criteria) this;
        }

        public Criteria andYqxhNotBetween(String value1, String value2) {
            addCriterion("YQXH not between", value1, value2, "yqxh");
            return (Criteria) this;
        }

        public Criteria andJzxhIsNull() {
            addCriterion("JZXH is null");
            return (Criteria) this;
        }

        public Criteria andJzxhIsNotNull() {
            addCriterion("JZXH is not null");
            return (Criteria) this;
        }

        public Criteria andJzxhEqualTo(Long value) {
            addCriterion("JZXH =", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhNotEqualTo(Long value) {
            addCriterion("JZXH <>", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhGreaterThan(Long value) {
            addCriterion("JZXH >", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhGreaterThanOrEqualTo(Long value) {
            addCriterion("JZXH >=", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhLessThan(Long value) {
            addCriterion("JZXH <", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhLessThanOrEqualTo(Long value) {
            addCriterion("JZXH <=", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhIn(List<Long> values) {
            addCriterion("JZXH in", values, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhNotIn(List<Long> values) {
            addCriterion("JZXH not in", values, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhBetween(Long value1, Long value2) {
            addCriterion("JZXH between", value1, value2, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhNotBetween(Long value1, Long value2) {
            addCriterion("JZXH not between", value1, value2, "jzxh");
            return (Criteria) this;
        }

        public Criteria andZyxhIsNull() {
            addCriterion("ZYXH is null");
            return (Criteria) this;
        }

        public Criteria andZyxhIsNotNull() {
            addCriterion("ZYXH is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhEqualTo(Long value) {
            addCriterion("ZYXH =", value, "zyxh");
            return (Criteria) this;
        }

        public Criteria andZyxhNotEqualTo(Long value) {
            addCriterion("ZYXH <>", value, "zyxh");
            return (Criteria) this;
        }

        public Criteria andZyxhGreaterThan(Long value) {
            addCriterion("ZYXH >", value, "zyxh");
            return (Criteria) this;
        }

        public Criteria andZyxhGreaterThanOrEqualTo(Long value) {
            addCriterion("ZYXH >=", value, "zyxh");
            return (Criteria) this;
        }

        public Criteria andZyxhLessThan(Long value) {
            addCriterion("ZYXH <", value, "zyxh");
            return (Criteria) this;
        }

        public Criteria andZyxhLessThanOrEqualTo(Long value) {
            addCriterion("ZYXH <=", value, "zyxh");
            return (Criteria) this;
        }

        public Criteria andZyxhIn(List<Long> values) {
            addCriterion("ZYXH in", values, "zyxh");
            return (Criteria) this;
        }

        public Criteria andZyxhNotIn(List<Long> values) {
            addCriterion("ZYXH not in", values, "zyxh");
            return (Criteria) this;
        }

        public Criteria andZyxhBetween(Long value1, Long value2) {
            addCriterion("ZYXH between", value1, value2, "zyxh");
            return (Criteria) this;
        }

        public Criteria andZyxhNotBetween(Long value1, Long value2) {
            addCriterion("ZYXH not between", value1, value2, "zyxh");
            return (Criteria) this;
        }

        public Criteria andDocDatIsNull() {
            addCriterion("DOC_DAT is null");
            return (Criteria) this;
        }

        public Criteria andDocDatIsNotNull() {
            addCriterion("DOC_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andDocDatEqualTo(Date value) {
            addCriterion("DOC_DAT =", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatNotEqualTo(Date value) {
            addCriterion("DOC_DAT <>", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatGreaterThan(Date value) {
            addCriterion("DOC_DAT >", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatGreaterThanOrEqualTo(Date value) {
            addCriterion("DOC_DAT >=", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatLessThan(Date value) {
            addCriterion("DOC_DAT <", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatLessThanOrEqualTo(Date value) {
            addCriterion("DOC_DAT <=", value, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatIn(List<Date> values) {
            addCriterion("DOC_DAT in", values, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatNotIn(List<Date> values) {
            addCriterion("DOC_DAT not in", values, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatBetween(Date value1, Date value2) {
            addCriterion("DOC_DAT between", value1, value2, "docDat");
            return (Criteria) this;
        }

        public Criteria andDocDatNotBetween(Date value1, Date value2) {
            addCriterion("DOC_DAT not between", value1, value2, "docDat");
            return (Criteria) this;
        }

        public Criteria andJzysIsNull() {
            addCriterion("JZYS is null");
            return (Criteria) this;
        }

        public Criteria andJzysIsNotNull() {
            addCriterion("JZYS is not null");
            return (Criteria) this;
        }

        public Criteria andJzysEqualTo(String value) {
            addCriterion("JZYS =", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysNotEqualTo(String value) {
            addCriterion("JZYS <>", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysGreaterThan(String value) {
            addCriterion("JZYS >", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysGreaterThanOrEqualTo(String value) {
            addCriterion("JZYS >=", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysLessThan(String value) {
            addCriterion("JZYS <", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysLessThanOrEqualTo(String value) {
            addCriterion("JZYS <=", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysLike(String value) {
            addCriterion("JZYS like", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysNotLike(String value) {
            addCriterion("JZYS not like", value, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysIn(List<String> values) {
            addCriterion("JZYS in", values, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysNotIn(List<String> values) {
            addCriterion("JZYS not in", values, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysBetween(String value1, String value2) {
            addCriterion("JZYS between", value1, value2, "jzys");
            return (Criteria) this;
        }

        public Criteria andJzysNotBetween(String value1, String value2) {
            addCriterion("JZYS not between", value1, value2, "jzys");
            return (Criteria) this;
        }

        public Criteria andYsxmIsNull() {
            addCriterion("YSXM is null");
            return (Criteria) this;
        }

        public Criteria andYsxmIsNotNull() {
            addCriterion("YSXM is not null");
            return (Criteria) this;
        }

        public Criteria andYsxmEqualTo(String value) {
            addCriterion("YSXM =", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmNotEqualTo(String value) {
            addCriterion("YSXM <>", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmGreaterThan(String value) {
            addCriterion("YSXM >", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmGreaterThanOrEqualTo(String value) {
            addCriterion("YSXM >=", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmLessThan(String value) {
            addCriterion("YSXM <", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmLessThanOrEqualTo(String value) {
            addCriterion("YSXM <=", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmLike(String value) {
            addCriterion("YSXM like", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmNotLike(String value) {
            addCriterion("YSXM not like", value, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmIn(List<String> values) {
            addCriterion("YSXM in", values, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmNotIn(List<String> values) {
            addCriterion("YSXM not in", values, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmBetween(String value1, String value2) {
            addCriterion("YSXM between", value1, value2, "ysxm");
            return (Criteria) this;
        }

        public Criteria andYsxmNotBetween(String value1, String value2) {
            addCriterion("YSXM not between", value1, value2, "ysxm");
            return (Criteria) this;
        }

        public Criteria andKsdmIsNull() {
            addCriterion("KSDM is null");
            return (Criteria) this;
        }

        public Criteria andKsdmIsNotNull() {
            addCriterion("KSDM is not null");
            return (Criteria) this;
        }

        public Criteria andKsdmEqualTo(String value) {
            addCriterion("KSDM =", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotEqualTo(String value) {
            addCriterion("KSDM <>", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmGreaterThan(String value) {
            addCriterion("KSDM >", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmGreaterThanOrEqualTo(String value) {
            addCriterion("KSDM >=", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmLessThan(String value) {
            addCriterion("KSDM <", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmLessThanOrEqualTo(String value) {
            addCriterion("KSDM <=", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmLike(String value) {
            addCriterion("KSDM like", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotLike(String value) {
            addCriterion("KSDM not like", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmIn(List<String> values) {
            addCriterion("KSDM in", values, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotIn(List<String> values) {
            addCriterion("KSDM not in", values, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmBetween(String value1, String value2) {
            addCriterion("KSDM between", value1, value2, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotBetween(String value1, String value2) {
            addCriterion("KSDM not between", value1, value2, "ksdm");
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

        public Criteria andCrtNoIsNull() {
            addCriterion("CRT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCrtNoIsNotNull() {
            addCriterion("CRT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNoEqualTo(String value) {
            addCriterion("CRT_NO =", value, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNoNotEqualTo(String value) {
            addCriterion("CRT_NO <>", value, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNoGreaterThan(String value) {
            addCriterion("CRT_NO >", value, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNoGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NO >=", value, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNoLessThan(String value) {
            addCriterion("CRT_NO <", value, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNoLessThanOrEqualTo(String value) {
            addCriterion("CRT_NO <=", value, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNoLike(String value) {
            addCriterion("CRT_NO like", value, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNoNotLike(String value) {
            addCriterion("CRT_NO not like", value, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNoIn(List<String> values) {
            addCriterion("CRT_NO in", values, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNoNotIn(List<String> values) {
            addCriterion("CRT_NO not in", values, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNoBetween(String value1, String value2) {
            addCriterion("CRT_NO between", value1, value2, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNoNotBetween(String value1, String value2) {
            addCriterion("CRT_NO not between", value1, value2, "crtNo");
            return (Criteria) this;
        }

        public Criteria andCrtNamIsNull() {
            addCriterion("CRT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andCrtNamIsNotNull() {
            addCriterion("CRT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andCrtNamEqualTo(String value) {
            addCriterion("CRT_NAM =", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotEqualTo(String value) {
            addCriterion("CRT_NAM <>", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamGreaterThan(String value) {
            addCriterion("CRT_NAM >", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_NAM >=", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLessThan(String value) {
            addCriterion("CRT_NAM <", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLessThanOrEqualTo(String value) {
            addCriterion("CRT_NAM <=", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamLike(String value) {
            addCriterion("CRT_NAM like", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotLike(String value) {
            addCriterion("CRT_NAM not like", value, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamIn(List<String> values) {
            addCriterion("CRT_NAM in", values, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotIn(List<String> values) {
            addCriterion("CRT_NAM not in", values, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamBetween(String value1, String value2) {
            addCriterion("CRT_NAM between", value1, value2, "crtNam");
            return (Criteria) this;
        }

        public Criteria andCrtNamNotBetween(String value1, String value2) {
            addCriterion("CRT_NAM not between", value1, value2, "crtNam");
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

        public Criteria andModNoIsNull() {
            addCriterion("MOD_NO is null");
            return (Criteria) this;
        }

        public Criteria andModNoIsNotNull() {
            addCriterion("MOD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andModNoEqualTo(String value) {
            addCriterion("MOD_NO =", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoNotEqualTo(String value) {
            addCriterion("MOD_NO <>", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoGreaterThan(String value) {
            addCriterion("MOD_NO >", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_NO >=", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoLessThan(String value) {
            addCriterion("MOD_NO <", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoLessThanOrEqualTo(String value) {
            addCriterion("MOD_NO <=", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoLike(String value) {
            addCriterion("MOD_NO like", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoNotLike(String value) {
            addCriterion("MOD_NO not like", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoIn(List<String> values) {
            addCriterion("MOD_NO in", values, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoNotIn(List<String> values) {
            addCriterion("MOD_NO not in", values, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoBetween(String value1, String value2) {
            addCriterion("MOD_NO between", value1, value2, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoNotBetween(String value1, String value2) {
            addCriterion("MOD_NO not between", value1, value2, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNamIsNull() {
            addCriterion("MOD_NAM is null");
            return (Criteria) this;
        }

        public Criteria andModNamIsNotNull() {
            addCriterion("MOD_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andModNamEqualTo(String value) {
            addCriterion("MOD_NAM =", value, "modNam");
            return (Criteria) this;
        }

        public Criteria andModNamNotEqualTo(String value) {
            addCriterion("MOD_NAM <>", value, "modNam");
            return (Criteria) this;
        }

        public Criteria andModNamGreaterThan(String value) {
            addCriterion("MOD_NAM >", value, "modNam");
            return (Criteria) this;
        }

        public Criteria andModNamGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_NAM >=", value, "modNam");
            return (Criteria) this;
        }

        public Criteria andModNamLessThan(String value) {
            addCriterion("MOD_NAM <", value, "modNam");
            return (Criteria) this;
        }

        public Criteria andModNamLessThanOrEqualTo(String value) {
            addCriterion("MOD_NAM <=", value, "modNam");
            return (Criteria) this;
        }

        public Criteria andModNamLike(String value) {
            addCriterion("MOD_NAM like", value, "modNam");
            return (Criteria) this;
        }

        public Criteria andModNamNotLike(String value) {
            addCriterion("MOD_NAM not like", value, "modNam");
            return (Criteria) this;
        }

        public Criteria andModNamIn(List<String> values) {
            addCriterion("MOD_NAM in", values, "modNam");
            return (Criteria) this;
        }

        public Criteria andModNamNotIn(List<String> values) {
            addCriterion("MOD_NAM not in", values, "modNam");
            return (Criteria) this;
        }

        public Criteria andModNamBetween(String value1, String value2) {
            addCriterion("MOD_NAM between", value1, value2, "modNam");
            return (Criteria) this;
        }

        public Criteria andModNamNotBetween(String value1, String value2) {
            addCriterion("MOD_NAM not between", value1, value2, "modNam");
            return (Criteria) this;
        }

        public Criteria andRcdStaIsNull() {
            addCriterion("RCD_STA is null");
            return (Criteria) this;
        }

        public Criteria andRcdStaIsNotNull() {
            addCriterion("RCD_STA is not null");
            return (Criteria) this;
        }

        public Criteria andRcdStaEqualTo(String value) {
            addCriterion("RCD_STA =", value, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andRcdStaNotEqualTo(String value) {
            addCriterion("RCD_STA <>", value, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andRcdStaGreaterThan(String value) {
            addCriterion("RCD_STA >", value, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andRcdStaGreaterThanOrEqualTo(String value) {
            addCriterion("RCD_STA >=", value, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andRcdStaLessThan(String value) {
            addCriterion("RCD_STA <", value, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andRcdStaLessThanOrEqualTo(String value) {
            addCriterion("RCD_STA <=", value, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andRcdStaLike(String value) {
            addCriterion("RCD_STA like", value, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andRcdStaNotLike(String value) {
            addCriterion("RCD_STA not like", value, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andRcdStaIn(List<String> values) {
            addCriterion("RCD_STA in", values, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andRcdStaNotIn(List<String> values) {
            addCriterion("RCD_STA not in", values, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andRcdStaBetween(String value1, String value2) {
            addCriterion("RCD_STA between", value1, value2, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andRcdStaNotBetween(String value1, String value2) {
            addCriterion("RCD_STA not between", value1, value2, "rcdSta");
            return (Criteria) this;
        }

        public Criteria andChkTimIsNull() {
            addCriterion("CHK_TIM is null");
            return (Criteria) this;
        }

        public Criteria andChkTimIsNotNull() {
            addCriterion("CHK_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andChkTimEqualTo(Date value) {
            addCriterion("CHK_TIM =", value, "chkTim");
            return (Criteria) this;
        }

        public Criteria andChkTimNotEqualTo(Date value) {
            addCriterion("CHK_TIM <>", value, "chkTim");
            return (Criteria) this;
        }

        public Criteria andChkTimGreaterThan(Date value) {
            addCriterion("CHK_TIM >", value, "chkTim");
            return (Criteria) this;
        }

        public Criteria andChkTimGreaterThanOrEqualTo(Date value) {
            addCriterion("CHK_TIM >=", value, "chkTim");
            return (Criteria) this;
        }

        public Criteria andChkTimLessThan(Date value) {
            addCriterion("CHK_TIM <", value, "chkTim");
            return (Criteria) this;
        }

        public Criteria andChkTimLessThanOrEqualTo(Date value) {
            addCriterion("CHK_TIM <=", value, "chkTim");
            return (Criteria) this;
        }

        public Criteria andChkTimIn(List<Date> values) {
            addCriterion("CHK_TIM in", values, "chkTim");
            return (Criteria) this;
        }

        public Criteria andChkTimNotIn(List<Date> values) {
            addCriterion("CHK_TIM not in", values, "chkTim");
            return (Criteria) this;
        }

        public Criteria andChkTimBetween(Date value1, Date value2) {
            addCriterion("CHK_TIM between", value1, value2, "chkTim");
            return (Criteria) this;
        }

        public Criteria andChkTimNotBetween(Date value1, Date value2) {
            addCriterion("CHK_TIM not between", value1, value2, "chkTim");
            return (Criteria) this;
        }

        public Criteria andChkNoIsNull() {
            addCriterion("CHK_NO is null");
            return (Criteria) this;
        }

        public Criteria andChkNoIsNotNull() {
            addCriterion("CHK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChkNoEqualTo(String value) {
            addCriterion("CHK_NO =", value, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNoNotEqualTo(String value) {
            addCriterion("CHK_NO <>", value, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNoGreaterThan(String value) {
            addCriterion("CHK_NO >", value, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNoGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_NO >=", value, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNoLessThan(String value) {
            addCriterion("CHK_NO <", value, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNoLessThanOrEqualTo(String value) {
            addCriterion("CHK_NO <=", value, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNoLike(String value) {
            addCriterion("CHK_NO like", value, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNoNotLike(String value) {
            addCriterion("CHK_NO not like", value, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNoIn(List<String> values) {
            addCriterion("CHK_NO in", values, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNoNotIn(List<String> values) {
            addCriterion("CHK_NO not in", values, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNoBetween(String value1, String value2) {
            addCriterion("CHK_NO between", value1, value2, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNoNotBetween(String value1, String value2) {
            addCriterion("CHK_NO not between", value1, value2, "chkNo");
            return (Criteria) this;
        }

        public Criteria andChkNamIsNull() {
            addCriterion("CHK_NAM is null");
            return (Criteria) this;
        }

        public Criteria andChkNamIsNotNull() {
            addCriterion("CHK_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andChkNamEqualTo(String value) {
            addCriterion("CHK_NAM =", value, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkNamNotEqualTo(String value) {
            addCriterion("CHK_NAM <>", value, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkNamGreaterThan(String value) {
            addCriterion("CHK_NAM >", value, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkNamGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_NAM >=", value, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkNamLessThan(String value) {
            addCriterion("CHK_NAM <", value, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkNamLessThanOrEqualTo(String value) {
            addCriterion("CHK_NAM <=", value, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkNamLike(String value) {
            addCriterion("CHK_NAM like", value, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkNamNotLike(String value) {
            addCriterion("CHK_NAM not like", value, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkNamIn(List<String> values) {
            addCriterion("CHK_NAM in", values, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkNamNotIn(List<String> values) {
            addCriterion("CHK_NAM not in", values, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkNamBetween(String value1, String value2) {
            addCriterion("CHK_NAM between", value1, value2, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkNamNotBetween(String value1, String value2) {
            addCriterion("CHK_NAM not between", value1, value2, "chkNam");
            return (Criteria) this;
        }

        public Criteria andChkMsgIsNull() {
            addCriterion("CHK_MSG is null");
            return (Criteria) this;
        }

        public Criteria andChkMsgIsNotNull() {
            addCriterion("CHK_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andChkMsgEqualTo(String value) {
            addCriterion("CHK_MSG =", value, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andChkMsgNotEqualTo(String value) {
            addCriterion("CHK_MSG <>", value, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andChkMsgGreaterThan(String value) {
            addCriterion("CHK_MSG >", value, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andChkMsgGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_MSG >=", value, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andChkMsgLessThan(String value) {
            addCriterion("CHK_MSG <", value, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andChkMsgLessThanOrEqualTo(String value) {
            addCriterion("CHK_MSG <=", value, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andChkMsgLike(String value) {
            addCriterion("CHK_MSG like", value, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andChkMsgNotLike(String value) {
            addCriterion("CHK_MSG not like", value, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andChkMsgIn(List<String> values) {
            addCriterion("CHK_MSG in", values, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andChkMsgNotIn(List<String> values) {
            addCriterion("CHK_MSG not in", values, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andChkMsgBetween(String value1, String value2) {
            addCriterion("CHK_MSG between", value1, value2, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andChkMsgNotBetween(String value1, String value2) {
            addCriterion("CHK_MSG not between", value1, value2, "chkMsg");
            return (Criteria) this;
        }

        public Criteria andStpFlgIsNull() {
            addCriterion("STP_FLG is null");
            return (Criteria) this;
        }

        public Criteria andStpFlgIsNotNull() {
            addCriterion("STP_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andStpFlgEqualTo(String value) {
            addCriterion("STP_FLG =", value, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpFlgNotEqualTo(String value) {
            addCriterion("STP_FLG <>", value, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpFlgGreaterThan(String value) {
            addCriterion("STP_FLG >", value, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpFlgGreaterThanOrEqualTo(String value) {
            addCriterion("STP_FLG >=", value, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpFlgLessThan(String value) {
            addCriterion("STP_FLG <", value, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpFlgLessThanOrEqualTo(String value) {
            addCriterion("STP_FLG <=", value, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpFlgLike(String value) {
            addCriterion("STP_FLG like", value, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpFlgNotLike(String value) {
            addCriterion("STP_FLG not like", value, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpFlgIn(List<String> values) {
            addCriterion("STP_FLG in", values, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpFlgNotIn(List<String> values) {
            addCriterion("STP_FLG not in", values, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpFlgBetween(String value1, String value2) {
            addCriterion("STP_FLG between", value1, value2, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpFlgNotBetween(String value1, String value2) {
            addCriterion("STP_FLG not between", value1, value2, "stpFlg");
            return (Criteria) this;
        }

        public Criteria andStpTimIsNull() {
            addCriterion("STP_TIM is null");
            return (Criteria) this;
        }

        public Criteria andStpTimIsNotNull() {
            addCriterion("STP_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andStpTimEqualTo(Date value) {
            addCriterion("STP_TIM =", value, "stpTim");
            return (Criteria) this;
        }

        public Criteria andStpTimNotEqualTo(Date value) {
            addCriterion("STP_TIM <>", value, "stpTim");
            return (Criteria) this;
        }

        public Criteria andStpTimGreaterThan(Date value) {
            addCriterion("STP_TIM >", value, "stpTim");
            return (Criteria) this;
        }

        public Criteria andStpTimGreaterThanOrEqualTo(Date value) {
            addCriterion("STP_TIM >=", value, "stpTim");
            return (Criteria) this;
        }

        public Criteria andStpTimLessThan(Date value) {
            addCriterion("STP_TIM <", value, "stpTim");
            return (Criteria) this;
        }

        public Criteria andStpTimLessThanOrEqualTo(Date value) {
            addCriterion("STP_TIM <=", value, "stpTim");
            return (Criteria) this;
        }

        public Criteria andStpTimIn(List<Date> values) {
            addCriterion("STP_TIM in", values, "stpTim");
            return (Criteria) this;
        }

        public Criteria andStpTimNotIn(List<Date> values) {
            addCriterion("STP_TIM not in", values, "stpTim");
            return (Criteria) this;
        }

        public Criteria andStpTimBetween(Date value1, Date value2) {
            addCriterion("STP_TIM between", value1, value2, "stpTim");
            return (Criteria) this;
        }

        public Criteria andStpTimNotBetween(Date value1, Date value2) {
            addCriterion("STP_TIM not between", value1, value2, "stpTim");
            return (Criteria) this;
        }

        public Criteria andStpNoIsNull() {
            addCriterion("STP_NO is null");
            return (Criteria) this;
        }

        public Criteria andStpNoIsNotNull() {
            addCriterion("STP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStpNoEqualTo(String value) {
            addCriterion("STP_NO =", value, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNoNotEqualTo(String value) {
            addCriterion("STP_NO <>", value, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNoGreaterThan(String value) {
            addCriterion("STP_NO >", value, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNoGreaterThanOrEqualTo(String value) {
            addCriterion("STP_NO >=", value, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNoLessThan(String value) {
            addCriterion("STP_NO <", value, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNoLessThanOrEqualTo(String value) {
            addCriterion("STP_NO <=", value, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNoLike(String value) {
            addCriterion("STP_NO like", value, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNoNotLike(String value) {
            addCriterion("STP_NO not like", value, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNoIn(List<String> values) {
            addCriterion("STP_NO in", values, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNoNotIn(List<String> values) {
            addCriterion("STP_NO not in", values, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNoBetween(String value1, String value2) {
            addCriterion("STP_NO between", value1, value2, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNoNotBetween(String value1, String value2) {
            addCriterion("STP_NO not between", value1, value2, "stpNo");
            return (Criteria) this;
        }

        public Criteria andStpNamIsNull() {
            addCriterion("STP_NAM is null");
            return (Criteria) this;
        }

        public Criteria andStpNamIsNotNull() {
            addCriterion("STP_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andStpNamEqualTo(String value) {
            addCriterion("STP_NAM =", value, "stpNam");
            return (Criteria) this;
        }

        public Criteria andStpNamNotEqualTo(String value) {
            addCriterion("STP_NAM <>", value, "stpNam");
            return (Criteria) this;
        }

        public Criteria andStpNamGreaterThan(String value) {
            addCriterion("STP_NAM >", value, "stpNam");
            return (Criteria) this;
        }

        public Criteria andStpNamGreaterThanOrEqualTo(String value) {
            addCriterion("STP_NAM >=", value, "stpNam");
            return (Criteria) this;
        }

        public Criteria andStpNamLessThan(String value) {
            addCriterion("STP_NAM <", value, "stpNam");
            return (Criteria) this;
        }

        public Criteria andStpNamLessThanOrEqualTo(String value) {
            addCriterion("STP_NAM <=", value, "stpNam");
            return (Criteria) this;
        }

        public Criteria andStpNamLike(String value) {
            addCriterion("STP_NAM like", value, "stpNam");
            return (Criteria) this;
        }

        public Criteria andStpNamNotLike(String value) {
            addCriterion("STP_NAM not like", value, "stpNam");
            return (Criteria) this;
        }

        public Criteria andStpNamIn(List<String> values) {
            addCriterion("STP_NAM in", values, "stpNam");
            return (Criteria) this;
        }

        public Criteria andStpNamNotIn(List<String> values) {
            addCriterion("STP_NAM not in", values, "stpNam");
            return (Criteria) this;
        }

        public Criteria andStpNamBetween(String value1, String value2) {
            addCriterion("STP_NAM between", value1, value2, "stpNam");
            return (Criteria) this;
        }

        public Criteria andStpNamNotBetween(String value1, String value2) {
            addCriterion("STP_NAM not between", value1, value2, "stpNam");
            return (Criteria) this;
        }

        public Criteria andSmtStaIsNull() {
            addCriterion("SMT_STA is null");
            return (Criteria) this;
        }

        public Criteria andSmtStaIsNotNull() {
            addCriterion("SMT_STA is not null");
            return (Criteria) this;
        }

        public Criteria andSmtStaEqualTo(String value) {
            addCriterion("SMT_STA =", value, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtStaNotEqualTo(String value) {
            addCriterion("SMT_STA <>", value, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtStaGreaterThan(String value) {
            addCriterion("SMT_STA >", value, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtStaGreaterThanOrEqualTo(String value) {
            addCriterion("SMT_STA >=", value, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtStaLessThan(String value) {
            addCriterion("SMT_STA <", value, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtStaLessThanOrEqualTo(String value) {
            addCriterion("SMT_STA <=", value, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtStaLike(String value) {
            addCriterion("SMT_STA like", value, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtStaNotLike(String value) {
            addCriterion("SMT_STA not like", value, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtStaIn(List<String> values) {
            addCriterion("SMT_STA in", values, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtStaNotIn(List<String> values) {
            addCriterion("SMT_STA not in", values, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtStaBetween(String value1, String value2) {
            addCriterion("SMT_STA between", value1, value2, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtStaNotBetween(String value1, String value2) {
            addCriterion("SMT_STA not between", value1, value2, "smtSta");
            return (Criteria) this;
        }

        public Criteria andSmtSeqIsNull() {
            addCriterion("SMT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSmtSeqIsNotNull() {
            addCriterion("SMT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSmtSeqEqualTo(String value) {
            addCriterion("SMT_SEQ =", value, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtSeqNotEqualTo(String value) {
            addCriterion("SMT_SEQ <>", value, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtSeqGreaterThan(String value) {
            addCriterion("SMT_SEQ >", value, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtSeqGreaterThanOrEqualTo(String value) {
            addCriterion("SMT_SEQ >=", value, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtSeqLessThan(String value) {
            addCriterion("SMT_SEQ <", value, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtSeqLessThanOrEqualTo(String value) {
            addCriterion("SMT_SEQ <=", value, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtSeqLike(String value) {
            addCriterion("SMT_SEQ like", value, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtSeqNotLike(String value) {
            addCriterion("SMT_SEQ not like", value, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtSeqIn(List<String> values) {
            addCriterion("SMT_SEQ in", values, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtSeqNotIn(List<String> values) {
            addCriterion("SMT_SEQ not in", values, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtSeqBetween(String value1, String value2) {
            addCriterion("SMT_SEQ between", value1, value2, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtSeqNotBetween(String value1, String value2) {
            addCriterion("SMT_SEQ not between", value1, value2, "smtSeq");
            return (Criteria) this;
        }

        public Criteria andSmtMsgIsNull() {
            addCriterion("SMT_MSG is null");
            return (Criteria) this;
        }

        public Criteria andSmtMsgIsNotNull() {
            addCriterion("SMT_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andSmtMsgEqualTo(String value) {
            addCriterion("SMT_MSG =", value, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtMsgNotEqualTo(String value) {
            addCriterion("SMT_MSG <>", value, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtMsgGreaterThan(String value) {
            addCriterion("SMT_MSG >", value, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtMsgGreaterThanOrEqualTo(String value) {
            addCriterion("SMT_MSG >=", value, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtMsgLessThan(String value) {
            addCriterion("SMT_MSG <", value, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtMsgLessThanOrEqualTo(String value) {
            addCriterion("SMT_MSG <=", value, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtMsgLike(String value) {
            addCriterion("SMT_MSG like", value, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtMsgNotLike(String value) {
            addCriterion("SMT_MSG not like", value, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtMsgIn(List<String> values) {
            addCriterion("SMT_MSG in", values, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtMsgNotIn(List<String> values) {
            addCriterion("SMT_MSG not in", values, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtMsgBetween(String value1, String value2) {
            addCriterion("SMT_MSG between", value1, value2, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtMsgNotBetween(String value1, String value2) {
            addCriterion("SMT_MSG not between", value1, value2, "smtMsg");
            return (Criteria) this;
        }

        public Criteria andSmtNoIsNull() {
            addCriterion("SMT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSmtNoIsNotNull() {
            addCriterion("SMT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSmtNoEqualTo(String value) {
            addCriterion("SMT_NO =", value, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNoNotEqualTo(String value) {
            addCriterion("SMT_NO <>", value, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNoGreaterThan(String value) {
            addCriterion("SMT_NO >", value, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNoGreaterThanOrEqualTo(String value) {
            addCriterion("SMT_NO >=", value, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNoLessThan(String value) {
            addCriterion("SMT_NO <", value, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNoLessThanOrEqualTo(String value) {
            addCriterion("SMT_NO <=", value, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNoLike(String value) {
            addCriterion("SMT_NO like", value, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNoNotLike(String value) {
            addCriterion("SMT_NO not like", value, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNoIn(List<String> values) {
            addCriterion("SMT_NO in", values, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNoNotIn(List<String> values) {
            addCriterion("SMT_NO not in", values, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNoBetween(String value1, String value2) {
            addCriterion("SMT_NO between", value1, value2, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNoNotBetween(String value1, String value2) {
            addCriterion("SMT_NO not between", value1, value2, "smtNo");
            return (Criteria) this;
        }

        public Criteria andSmtNamIsNull() {
            addCriterion("SMT_NAM is null");
            return (Criteria) this;
        }

        public Criteria andSmtNamIsNotNull() {
            addCriterion("SMT_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andSmtNamEqualTo(String value) {
            addCriterion("SMT_NAM =", value, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtNamNotEqualTo(String value) {
            addCriterion("SMT_NAM <>", value, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtNamGreaterThan(String value) {
            addCriterion("SMT_NAM >", value, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtNamGreaterThanOrEqualTo(String value) {
            addCriterion("SMT_NAM >=", value, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtNamLessThan(String value) {
            addCriterion("SMT_NAM <", value, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtNamLessThanOrEqualTo(String value) {
            addCriterion("SMT_NAM <=", value, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtNamLike(String value) {
            addCriterion("SMT_NAM like", value, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtNamNotLike(String value) {
            addCriterion("SMT_NAM not like", value, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtNamIn(List<String> values) {
            addCriterion("SMT_NAM in", values, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtNamNotIn(List<String> values) {
            addCriterion("SMT_NAM not in", values, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtNamBetween(String value1, String value2) {
            addCriterion("SMT_NAM between", value1, value2, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtNamNotBetween(String value1, String value2) {
            addCriterion("SMT_NAM not between", value1, value2, "smtNam");
            return (Criteria) this;
        }

        public Criteria andSmtTimIsNull() {
            addCriterion("SMT_TIM is null");
            return (Criteria) this;
        }

        public Criteria andSmtTimIsNotNull() {
            addCriterion("SMT_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andSmtTimEqualTo(Date value) {
            addCriterion("SMT_TIM =", value, "smtTim");
            return (Criteria) this;
        }

        public Criteria andSmtTimNotEqualTo(Date value) {
            addCriterion("SMT_TIM <>", value, "smtTim");
            return (Criteria) this;
        }

        public Criteria andSmtTimGreaterThan(Date value) {
            addCriterion("SMT_TIM >", value, "smtTim");
            return (Criteria) this;
        }

        public Criteria andSmtTimGreaterThanOrEqualTo(Date value) {
            addCriterion("SMT_TIM >=", value, "smtTim");
            return (Criteria) this;
        }

        public Criteria andSmtTimLessThan(Date value) {
            addCriterion("SMT_TIM <", value, "smtTim");
            return (Criteria) this;
        }

        public Criteria andSmtTimLessThanOrEqualTo(Date value) {
            addCriterion("SMT_TIM <=", value, "smtTim");
            return (Criteria) this;
        }

        public Criteria andSmtTimIn(List<Date> values) {
            addCriterion("SMT_TIM in", values, "smtTim");
            return (Criteria) this;
        }

        public Criteria andSmtTimNotIn(List<Date> values) {
            addCriterion("SMT_TIM not in", values, "smtTim");
            return (Criteria) this;
        }

        public Criteria andSmtTimBetween(Date value1, Date value2) {
            addCriterion("SMT_TIM between", value1, value2, "smtTim");
            return (Criteria) this;
        }

        public Criteria andSmtTimNotBetween(Date value1, Date value2) {
            addCriterion("SMT_TIM not between", value1, value2, "smtTim");
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