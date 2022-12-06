package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspTimDiffHisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspTimDiffHisExample() {
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

        public Criteria andDatDatIsNull() {
            addCriterion("DAT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andDatDatIsNotNull() {
            addCriterion("DAT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andDatDatEqualTo(String value) {
            addCriterion("DAT_DAT =", value, "datDat");
            return (Criteria) this;
        }

        public Criteria andDatDatNotEqualTo(String value) {
            addCriterion("DAT_DAT <>", value, "datDat");
            return (Criteria) this;
        }

        public Criteria andDatDatGreaterThan(String value) {
            addCriterion("DAT_DAT >", value, "datDat");
            return (Criteria) this;
        }

        public Criteria andDatDatGreaterThanOrEqualTo(String value) {
            addCriterion("DAT_DAT >=", value, "datDat");
            return (Criteria) this;
        }

        public Criteria andDatDatLessThan(String value) {
            addCriterion("DAT_DAT <", value, "datDat");
            return (Criteria) this;
        }

        public Criteria andDatDatLessThanOrEqualTo(String value) {
            addCriterion("DAT_DAT <=", value, "datDat");
            return (Criteria) this;
        }

        public Criteria andDatDatLike(String value) {
            addCriterion("DAT_DAT like", value, "datDat");
            return (Criteria) this;
        }

        public Criteria andDatDatNotLike(String value) {
            addCriterion("DAT_DAT not like", value, "datDat");
            return (Criteria) this;
        }

        public Criteria andDatDatIn(List<String> values) {
            addCriterion("DAT_DAT in", values, "datDat");
            return (Criteria) this;
        }

        public Criteria andDatDatNotIn(List<String> values) {
            addCriterion("DAT_DAT not in", values, "datDat");
            return (Criteria) this;
        }

        public Criteria andDatDatBetween(String value1, String value2) {
            addCriterion("DAT_DAT between", value1, value2, "datDat");
            return (Criteria) this;
        }

        public Criteria andDatDatNotBetween(String value1, String value2) {
            addCriterion("DAT_DAT not between", value1, value2, "datDat");
            return (Criteria) this;
        }

        public Criteria andDisTypIsNull() {
            addCriterion("DIS_TYP is null");
            return (Criteria) this;
        }

        public Criteria andDisTypIsNotNull() {
            addCriterion("DIS_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andDisTypEqualTo(String value) {
            addCriterion("DIS_TYP =", value, "disTyp");
            return (Criteria) this;
        }

        public Criteria andDisTypNotEqualTo(String value) {
            addCriterion("DIS_TYP <>", value, "disTyp");
            return (Criteria) this;
        }

        public Criteria andDisTypGreaterThan(String value) {
            addCriterion("DIS_TYP >", value, "disTyp");
            return (Criteria) this;
        }

        public Criteria andDisTypGreaterThanOrEqualTo(String value) {
            addCriterion("DIS_TYP >=", value, "disTyp");
            return (Criteria) this;
        }

        public Criteria andDisTypLessThan(String value) {
            addCriterion("DIS_TYP <", value, "disTyp");
            return (Criteria) this;
        }

        public Criteria andDisTypLessThanOrEqualTo(String value) {
            addCriterion("DIS_TYP <=", value, "disTyp");
            return (Criteria) this;
        }

        public Criteria andDisTypLike(String value) {
            addCriterion("DIS_TYP like", value, "disTyp");
            return (Criteria) this;
        }

        public Criteria andDisTypNotLike(String value) {
            addCriterion("DIS_TYP not like", value, "disTyp");
            return (Criteria) this;
        }

        public Criteria andDisTypIn(List<String> values) {
            addCriterion("DIS_TYP in", values, "disTyp");
            return (Criteria) this;
        }

        public Criteria andDisTypNotIn(List<String> values) {
            addCriterion("DIS_TYP not in", values, "disTyp");
            return (Criteria) this;
        }

        public Criteria andDisTypBetween(String value1, String value2) {
            addCriterion("DIS_TYP between", value1, value2, "disTyp");
            return (Criteria) this;
        }

        public Criteria andDisTypNotBetween(String value1, String value2) {
            addCriterion("DIS_TYP not between", value1, value2, "disTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypIsNull() {
            addCriterion("OBJ_TYP is null");
            return (Criteria) this;
        }

        public Criteria andObjTypIsNotNull() {
            addCriterion("OBJ_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andObjTypEqualTo(String value) {
            addCriterion("OBJ_TYP =", value, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypNotEqualTo(String value) {
            addCriterion("OBJ_TYP <>", value, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypGreaterThan(String value) {
            addCriterion("OBJ_TYP >", value, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypGreaterThanOrEqualTo(String value) {
            addCriterion("OBJ_TYP >=", value, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypLessThan(String value) {
            addCriterion("OBJ_TYP <", value, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypLessThanOrEqualTo(String value) {
            addCriterion("OBJ_TYP <=", value, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypLike(String value) {
            addCriterion("OBJ_TYP like", value, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypNotLike(String value) {
            addCriterion("OBJ_TYP not like", value, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypIn(List<String> values) {
            addCriterion("OBJ_TYP in", values, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypNotIn(List<String> values) {
            addCriterion("OBJ_TYP not in", values, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypBetween(String value1, String value2) {
            addCriterion("OBJ_TYP between", value1, value2, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjTypNotBetween(String value1, String value2) {
            addCriterion("OBJ_TYP not between", value1, value2, "objTyp");
            return (Criteria) this;
        }

        public Criteria andObjEnmIsNull() {
            addCriterion("OBJ_ENM is null");
            return (Criteria) this;
        }

        public Criteria andObjEnmIsNotNull() {
            addCriterion("OBJ_ENM is not null");
            return (Criteria) this;
        }

        public Criteria andObjEnmEqualTo(String value) {
            addCriterion("OBJ_ENM =", value, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjEnmNotEqualTo(String value) {
            addCriterion("OBJ_ENM <>", value, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjEnmGreaterThan(String value) {
            addCriterion("OBJ_ENM >", value, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjEnmGreaterThanOrEqualTo(String value) {
            addCriterion("OBJ_ENM >=", value, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjEnmLessThan(String value) {
            addCriterion("OBJ_ENM <", value, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjEnmLessThanOrEqualTo(String value) {
            addCriterion("OBJ_ENM <=", value, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjEnmLike(String value) {
            addCriterion("OBJ_ENM like", value, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjEnmNotLike(String value) {
            addCriterion("OBJ_ENM not like", value, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjEnmIn(List<String> values) {
            addCriterion("OBJ_ENM in", values, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjEnmNotIn(List<String> values) {
            addCriterion("OBJ_ENM not in", values, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjEnmBetween(String value1, String value2) {
            addCriterion("OBJ_ENM between", value1, value2, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjEnmNotBetween(String value1, String value2) {
            addCriterion("OBJ_ENM not between", value1, value2, "objEnm");
            return (Criteria) this;
        }

        public Criteria andObjNamIsNull() {
            addCriterion("OBJ_NAM is null");
            return (Criteria) this;
        }

        public Criteria andObjNamIsNotNull() {
            addCriterion("OBJ_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andObjNamEqualTo(String value) {
            addCriterion("OBJ_NAM =", value, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjNamNotEqualTo(String value) {
            addCriterion("OBJ_NAM <>", value, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjNamGreaterThan(String value) {
            addCriterion("OBJ_NAM >", value, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjNamGreaterThanOrEqualTo(String value) {
            addCriterion("OBJ_NAM >=", value, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjNamLessThan(String value) {
            addCriterion("OBJ_NAM <", value, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjNamLessThanOrEqualTo(String value) {
            addCriterion("OBJ_NAM <=", value, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjNamLike(String value) {
            addCriterion("OBJ_NAM like", value, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjNamNotLike(String value) {
            addCriterion("OBJ_NAM not like", value, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjNamIn(List<String> values) {
            addCriterion("OBJ_NAM in", values, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjNamNotIn(List<String> values) {
            addCriterion("OBJ_NAM not in", values, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjNamBetween(String value1, String value2) {
            addCriterion("OBJ_NAM between", value1, value2, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjNamNotBetween(String value1, String value2) {
            addCriterion("OBJ_NAM not between", value1, value2, "objNam");
            return (Criteria) this;
        }

        public Criteria andObjDesIsNull() {
            addCriterion("OBJ_DES is null");
            return (Criteria) this;
        }

        public Criteria andObjDesIsNotNull() {
            addCriterion("OBJ_DES is not null");
            return (Criteria) this;
        }

        public Criteria andObjDesEqualTo(String value) {
            addCriterion("OBJ_DES =", value, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjDesNotEqualTo(String value) {
            addCriterion("OBJ_DES <>", value, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjDesGreaterThan(String value) {
            addCriterion("OBJ_DES >", value, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjDesGreaterThanOrEqualTo(String value) {
            addCriterion("OBJ_DES >=", value, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjDesLessThan(String value) {
            addCriterion("OBJ_DES <", value, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjDesLessThanOrEqualTo(String value) {
            addCriterion("OBJ_DES <=", value, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjDesLike(String value) {
            addCriterion("OBJ_DES like", value, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjDesNotLike(String value) {
            addCriterion("OBJ_DES not like", value, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjDesIn(List<String> values) {
            addCriterion("OBJ_DES in", values, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjDesNotIn(List<String> values) {
            addCriterion("OBJ_DES not in", values, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjDesBetween(String value1, String value2) {
            addCriterion("OBJ_DES between", value1, value2, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjDesNotBetween(String value1, String value2) {
            addCriterion("OBJ_DES not between", value1, value2, "objDes");
            return (Criteria) this;
        }

        public Criteria andObjOdrIsNull() {
            addCriterion("OBJ_ODR is null");
            return (Criteria) this;
        }

        public Criteria andObjOdrIsNotNull() {
            addCriterion("OBJ_ODR is not null");
            return (Criteria) this;
        }

        public Criteria andObjOdrEqualTo(Short value) {
            addCriterion("OBJ_ODR =", value, "objOdr");
            return (Criteria) this;
        }

        public Criteria andObjOdrNotEqualTo(Short value) {
            addCriterion("OBJ_ODR <>", value, "objOdr");
            return (Criteria) this;
        }

        public Criteria andObjOdrGreaterThan(Short value) {
            addCriterion("OBJ_ODR >", value, "objOdr");
            return (Criteria) this;
        }

        public Criteria andObjOdrGreaterThanOrEqualTo(Short value) {
            addCriterion("OBJ_ODR >=", value, "objOdr");
            return (Criteria) this;
        }

        public Criteria andObjOdrLessThan(Short value) {
            addCriterion("OBJ_ODR <", value, "objOdr");
            return (Criteria) this;
        }

        public Criteria andObjOdrLessThanOrEqualTo(Short value) {
            addCriterion("OBJ_ODR <=", value, "objOdr");
            return (Criteria) this;
        }

        public Criteria andObjOdrIn(List<Short> values) {
            addCriterion("OBJ_ODR in", values, "objOdr");
            return (Criteria) this;
        }

        public Criteria andObjOdrNotIn(List<Short> values) {
            addCriterion("OBJ_ODR not in", values, "objOdr");
            return (Criteria) this;
        }

        public Criteria andObjOdrBetween(Short value1, Short value2) {
            addCriterion("OBJ_ODR between", value1, value2, "objOdr");
            return (Criteria) this;
        }

        public Criteria andObjOdrNotBetween(Short value1, Short value2) {
            addCriterion("OBJ_ODR not between", value1, value2, "objOdr");
            return (Criteria) this;
        }

        public Criteria andTimBegCodIsNull() {
            addCriterion("TIM_BEG_COD is null");
            return (Criteria) this;
        }

        public Criteria andTimBegCodIsNotNull() {
            addCriterion("TIM_BEG_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTimBegCodEqualTo(String value) {
            addCriterion("TIM_BEG_COD =", value, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegCodNotEqualTo(String value) {
            addCriterion("TIM_BEG_COD <>", value, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegCodGreaterThan(String value) {
            addCriterion("TIM_BEG_COD >", value, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegCodGreaterThanOrEqualTo(String value) {
            addCriterion("TIM_BEG_COD >=", value, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegCodLessThan(String value) {
            addCriterion("TIM_BEG_COD <", value, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegCodLessThanOrEqualTo(String value) {
            addCriterion("TIM_BEG_COD <=", value, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegCodLike(String value) {
            addCriterion("TIM_BEG_COD like", value, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegCodNotLike(String value) {
            addCriterion("TIM_BEG_COD not like", value, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegCodIn(List<String> values) {
            addCriterion("TIM_BEG_COD in", values, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegCodNotIn(List<String> values) {
            addCriterion("TIM_BEG_COD not in", values, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegCodBetween(String value1, String value2) {
            addCriterion("TIM_BEG_COD between", value1, value2, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegCodNotBetween(String value1, String value2) {
            addCriterion("TIM_BEG_COD not between", value1, value2, "timBegCod");
            return (Criteria) this;
        }

        public Criteria andTimBegNamIsNull() {
            addCriterion("TIM_BEG_NAM is null");
            return (Criteria) this;
        }

        public Criteria andTimBegNamIsNotNull() {
            addCriterion("TIM_BEG_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andTimBegNamEqualTo(String value) {
            addCriterion("TIM_BEG_NAM =", value, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimBegNamNotEqualTo(String value) {
            addCriterion("TIM_BEG_NAM <>", value, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimBegNamGreaterThan(String value) {
            addCriterion("TIM_BEG_NAM >", value, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimBegNamGreaterThanOrEqualTo(String value) {
            addCriterion("TIM_BEG_NAM >=", value, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimBegNamLessThan(String value) {
            addCriterion("TIM_BEG_NAM <", value, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimBegNamLessThanOrEqualTo(String value) {
            addCriterion("TIM_BEG_NAM <=", value, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimBegNamLike(String value) {
            addCriterion("TIM_BEG_NAM like", value, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimBegNamNotLike(String value) {
            addCriterion("TIM_BEG_NAM not like", value, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimBegNamIn(List<String> values) {
            addCriterion("TIM_BEG_NAM in", values, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimBegNamNotIn(List<String> values) {
            addCriterion("TIM_BEG_NAM not in", values, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimBegNamBetween(String value1, String value2) {
            addCriterion("TIM_BEG_NAM between", value1, value2, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimBegNamNotBetween(String value1, String value2) {
            addCriterion("TIM_BEG_NAM not between", value1, value2, "timBegNam");
            return (Criteria) this;
        }

        public Criteria andTimEndCodIsNull() {
            addCriterion("TIM_END_COD is null");
            return (Criteria) this;
        }

        public Criteria andTimEndCodIsNotNull() {
            addCriterion("TIM_END_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTimEndCodEqualTo(String value) {
            addCriterion("TIM_END_COD =", value, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndCodNotEqualTo(String value) {
            addCriterion("TIM_END_COD <>", value, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndCodGreaterThan(String value) {
            addCriterion("TIM_END_COD >", value, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndCodGreaterThanOrEqualTo(String value) {
            addCriterion("TIM_END_COD >=", value, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndCodLessThan(String value) {
            addCriterion("TIM_END_COD <", value, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndCodLessThanOrEqualTo(String value) {
            addCriterion("TIM_END_COD <=", value, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndCodLike(String value) {
            addCriterion("TIM_END_COD like", value, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndCodNotLike(String value) {
            addCriterion("TIM_END_COD not like", value, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndCodIn(List<String> values) {
            addCriterion("TIM_END_COD in", values, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndCodNotIn(List<String> values) {
            addCriterion("TIM_END_COD not in", values, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndCodBetween(String value1, String value2) {
            addCriterion("TIM_END_COD between", value1, value2, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndCodNotBetween(String value1, String value2) {
            addCriterion("TIM_END_COD not between", value1, value2, "timEndCod");
            return (Criteria) this;
        }

        public Criteria andTimEndNamIsNull() {
            addCriterion("TIM_END_NAM is null");
            return (Criteria) this;
        }

        public Criteria andTimEndNamIsNotNull() {
            addCriterion("TIM_END_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andTimEndNamEqualTo(String value) {
            addCriterion("TIM_END_NAM =", value, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimEndNamNotEqualTo(String value) {
            addCriterion("TIM_END_NAM <>", value, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimEndNamGreaterThan(String value) {
            addCriterion("TIM_END_NAM >", value, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimEndNamGreaterThanOrEqualTo(String value) {
            addCriterion("TIM_END_NAM >=", value, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimEndNamLessThan(String value) {
            addCriterion("TIM_END_NAM <", value, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimEndNamLessThanOrEqualTo(String value) {
            addCriterion("TIM_END_NAM <=", value, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimEndNamLike(String value) {
            addCriterion("TIM_END_NAM like", value, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimEndNamNotLike(String value) {
            addCriterion("TIM_END_NAM not like", value, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimEndNamIn(List<String> values) {
            addCriterion("TIM_END_NAM in", values, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimEndNamNotIn(List<String> values) {
            addCriterion("TIM_END_NAM not in", values, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimEndNamBetween(String value1, String value2) {
            addCriterion("TIM_END_NAM between", value1, value2, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimEndNamNotBetween(String value1, String value2) {
            addCriterion("TIM_END_NAM not between", value1, value2, "timEndNam");
            return (Criteria) this;
        }

        public Criteria andTimDifIsNull() {
            addCriterion("TIM_DIF is null");
            return (Criteria) this;
        }

        public Criteria andTimDifIsNotNull() {
            addCriterion("TIM_DIF is not null");
            return (Criteria) this;
        }

        public Criteria andTimDifEqualTo(Integer value) {
            addCriterion("TIM_DIF =", value, "timDif");
            return (Criteria) this;
        }

        public Criteria andTimDifNotEqualTo(Integer value) {
            addCriterion("TIM_DIF <>", value, "timDif");
            return (Criteria) this;
        }

        public Criteria andTimDifGreaterThan(Integer value) {
            addCriterion("TIM_DIF >", value, "timDif");
            return (Criteria) this;
        }

        public Criteria andTimDifGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIM_DIF >=", value, "timDif");
            return (Criteria) this;
        }

        public Criteria andTimDifLessThan(Integer value) {
            addCriterion("TIM_DIF <", value, "timDif");
            return (Criteria) this;
        }

        public Criteria andTimDifLessThanOrEqualTo(Integer value) {
            addCriterion("TIM_DIF <=", value, "timDif");
            return (Criteria) this;
        }

        public Criteria andTimDifIn(List<Integer> values) {
            addCriterion("TIM_DIF in", values, "timDif");
            return (Criteria) this;
        }

        public Criteria andTimDifNotIn(List<Integer> values) {
            addCriterion("TIM_DIF not in", values, "timDif");
            return (Criteria) this;
        }

        public Criteria andTimDifBetween(Integer value1, Integer value2) {
            addCriterion("TIM_DIF between", value1, value2, "timDif");
            return (Criteria) this;
        }

        public Criteria andTimDifNotBetween(Integer value1, Integer value2) {
            addCriterion("TIM_DIF not between", value1, value2, "timDif");
            return (Criteria) this;
        }

        public Criteria andObjMemIsNull() {
            addCriterion("OBJ_MEM is null");
            return (Criteria) this;
        }

        public Criteria andObjMemIsNotNull() {
            addCriterion("OBJ_MEM is not null");
            return (Criteria) this;
        }

        public Criteria andObjMemEqualTo(String value) {
            addCriterion("OBJ_MEM =", value, "objMem");
            return (Criteria) this;
        }

        public Criteria andObjMemNotEqualTo(String value) {
            addCriterion("OBJ_MEM <>", value, "objMem");
            return (Criteria) this;
        }

        public Criteria andObjMemGreaterThan(String value) {
            addCriterion("OBJ_MEM >", value, "objMem");
            return (Criteria) this;
        }

        public Criteria andObjMemGreaterThanOrEqualTo(String value) {
            addCriterion("OBJ_MEM >=", value, "objMem");
            return (Criteria) this;
        }

        public Criteria andObjMemLessThan(String value) {
            addCriterion("OBJ_MEM <", value, "objMem");
            return (Criteria) this;
        }

        public Criteria andObjMemLessThanOrEqualTo(String value) {
            addCriterion("OBJ_MEM <=", value, "objMem");
            return (Criteria) this;
        }

        public Criteria andObjMemLike(String value) {
            addCriterion("OBJ_MEM like", value, "objMem");
            return (Criteria) this;
        }

        public Criteria andObjMemNotLike(String value) {
            addCriterion("OBJ_MEM not like", value, "objMem");
            return (Criteria) this;
        }

        public Criteria andObjMemIn(List<String> values) {
            addCriterion("OBJ_MEM in", values, "objMem");
            return (Criteria) this;
        }

        public Criteria andObjMemNotIn(List<String> values) {
            addCriterion("OBJ_MEM not in", values, "objMem");
            return (Criteria) this;
        }

        public Criteria andObjMemBetween(String value1, String value2) {
            addCriterion("OBJ_MEM between", value1, value2, "objMem");
            return (Criteria) this;
        }

        public Criteria andObjMemNotBetween(String value1, String value2) {
            addCriterion("OBJ_MEM not between", value1, value2, "objMem");
            return (Criteria) this;
        }

        public Criteria andChgTimIsNull() {
            addCriterion("CHG_TIM is null");
            return (Criteria) this;
        }

        public Criteria andChgTimIsNotNull() {
            addCriterion("CHG_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andChgTimEqualTo(Date value) {
            addCriterion("CHG_TIM =", value, "chgTim");
            return (Criteria) this;
        }

        public Criteria andChgTimNotEqualTo(Date value) {
            addCriterion("CHG_TIM <>", value, "chgTim");
            return (Criteria) this;
        }

        public Criteria andChgTimGreaterThan(Date value) {
            addCriterion("CHG_TIM >", value, "chgTim");
            return (Criteria) this;
        }

        public Criteria andChgTimGreaterThanOrEqualTo(Date value) {
            addCriterion("CHG_TIM >=", value, "chgTim");
            return (Criteria) this;
        }

        public Criteria andChgTimLessThan(Date value) {
            addCriterion("CHG_TIM <", value, "chgTim");
            return (Criteria) this;
        }

        public Criteria andChgTimLessThanOrEqualTo(Date value) {
            addCriterion("CHG_TIM <=", value, "chgTim");
            return (Criteria) this;
        }

        public Criteria andChgTimIn(List<Date> values) {
            addCriterion("CHG_TIM in", values, "chgTim");
            return (Criteria) this;
        }

        public Criteria andChgTimNotIn(List<Date> values) {
            addCriterion("CHG_TIM not in", values, "chgTim");
            return (Criteria) this;
        }

        public Criteria andChgTimBetween(Date value1, Date value2) {
            addCriterion("CHG_TIM between", value1, value2, "chgTim");
            return (Criteria) this;
        }

        public Criteria andChgTimNotBetween(Date value1, Date value2) {
            addCriterion("CHG_TIM not between", value1, value2, "chgTim");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoIsNull() {
            addCriterion("CHG_USR_NO is null");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoIsNotNull() {
            addCriterion("CHG_USR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoEqualTo(String value) {
            addCriterion("CHG_USR_NO =", value, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoNotEqualTo(String value) {
            addCriterion("CHG_USR_NO <>", value, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoGreaterThan(String value) {
            addCriterion("CHG_USR_NO >", value, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoGreaterThanOrEqualTo(String value) {
            addCriterion("CHG_USR_NO >=", value, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoLessThan(String value) {
            addCriterion("CHG_USR_NO <", value, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoLessThanOrEqualTo(String value) {
            addCriterion("CHG_USR_NO <=", value, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoLike(String value) {
            addCriterion("CHG_USR_NO like", value, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoNotLike(String value) {
            addCriterion("CHG_USR_NO not like", value, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoIn(List<String> values) {
            addCriterion("CHG_USR_NO in", values, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoNotIn(List<String> values) {
            addCriterion("CHG_USR_NO not in", values, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoBetween(String value1, String value2) {
            addCriterion("CHG_USR_NO between", value1, value2, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNoNotBetween(String value1, String value2) {
            addCriterion("CHG_USR_NO not between", value1, value2, "chgUsrNo");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamIsNull() {
            addCriterion("CHG_USR_NAM is null");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamIsNotNull() {
            addCriterion("CHG_USR_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamEqualTo(String value) {
            addCriterion("CHG_USR_NAM =", value, "chgUsrNam");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamNotEqualTo(String value) {
            addCriterion("CHG_USR_NAM <>", value, "chgUsrNam");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamGreaterThan(String value) {
            addCriterion("CHG_USR_NAM >", value, "chgUsrNam");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamGreaterThanOrEqualTo(String value) {
            addCriterion("CHG_USR_NAM >=", value, "chgUsrNam");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamLessThan(String value) {
            addCriterion("CHG_USR_NAM <", value, "chgUsrNam");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamLessThanOrEqualTo(String value) {
            addCriterion("CHG_USR_NAM <=", value, "chgUsrNam");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamLike(String value) {
            addCriterion("CHG_USR_NAM like", value, "chgUsrNam");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamNotLike(String value) {
            addCriterion("CHG_USR_NAM not like", value, "chgUsrNam");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamIn(List<String> values) {
            addCriterion("CHG_USR_NAM in", values, "chgUsrNam");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamNotIn(List<String> values) {
            addCriterion("CHG_USR_NAM not in", values, "chgUsrNam");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamBetween(String value1, String value2) {
            addCriterion("CHG_USR_NAM between", value1, value2, "chgUsrNam");
            return (Criteria) this;
        }

        public Criteria andChgUsrNamNotBetween(String value1, String value2) {
            addCriterion("CHG_USR_NAM not between", value1, value2, "chgUsrNam");
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