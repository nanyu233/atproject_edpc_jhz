package activetech.external.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspMdyDatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspMdyDatExample() {
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

        public Criteria andBedNumIsNull() {
            addCriterion("BED_NUM is null");
            return (Criteria) this;
        }

        public Criteria andBedNumIsNotNull() {
            addCriterion("BED_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andBedNumEqualTo(String value) {
            addCriterion("BED_NUM =", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotEqualTo(String value) {
            addCriterion("BED_NUM <>", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumGreaterThan(String value) {
            addCriterion("BED_NUM >", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumGreaterThanOrEqualTo(String value) {
            addCriterion("BED_NUM >=", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLessThan(String value) {
            addCriterion("BED_NUM <", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLessThanOrEqualTo(String value) {
            addCriterion("BED_NUM <=", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLike(String value) {
            addCriterion("BED_NUM like", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotLike(String value) {
            addCriterion("BED_NUM not like", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumIn(List<String> values) {
            addCriterion("BED_NUM in", values, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotIn(List<String> values) {
            addCriterion("BED_NUM not in", values, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumBetween(String value1, String value2) {
            addCriterion("BED_NUM between", value1, value2, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotBetween(String value1, String value2) {
            addCriterion("BED_NUM not between", value1, value2, "bedNum");
            return (Criteria) this;
        }

        public Criteria andDatTimIsNull() {
            addCriterion("DAT_TIM is null");
            return (Criteria) this;
        }

        public Criteria andDatTimIsNotNull() {
            addCriterion("DAT_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andDatTimEqualTo(Date value) {
            addCriterion("DAT_TIM =", value, "datTim");
            return (Criteria) this;
        }

        public Criteria andDatTimNotEqualTo(Date value) {
            addCriterion("DAT_TIM <>", value, "datTim");
            return (Criteria) this;
        }

        public Criteria andDatTimGreaterThan(Date value) {
            addCriterion("DAT_TIM >", value, "datTim");
            return (Criteria) this;
        }

        public Criteria andDatTimGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_TIM >=", value, "datTim");
            return (Criteria) this;
        }

        public Criteria andDatTimLessThan(Date value) {
            addCriterion("DAT_TIM <", value, "datTim");
            return (Criteria) this;
        }

        public Criteria andDatTimLessThanOrEqualTo(Date value) {
            addCriterion("DAT_TIM <=", value, "datTim");
            return (Criteria) this;
        }

        public Criteria andDatTimIn(List<Date> values) {
            addCriterion("DAT_TIM in", values, "datTim");
            return (Criteria) this;
        }

        public Criteria andDatTimNotIn(List<Date> values) {
            addCriterion("DAT_TIM not in", values, "datTim");
            return (Criteria) this;
        }

        public Criteria andDatTimBetween(Date value1, Date value2) {
            addCriterion("DAT_TIM between", value1, value2, "datTim");
            return (Criteria) this;
        }

        public Criteria andDatTimNotBetween(Date value1, Date value2) {
            addCriterion("DAT_TIM not between", value1, value2, "datTim");
            return (Criteria) this;
        }

        public Criteria andEcgIsNull() {
            addCriterion("ECG is null");
            return (Criteria) this;
        }

        public Criteria andEcgIsNotNull() {
            addCriterion("ECG is not null");
            return (Criteria) this;
        }

        public Criteria andEcgEqualTo(Short value) {
            addCriterion("ECG =", value, "ecg");
            return (Criteria) this;
        }

        public Criteria andEcgNotEqualTo(Short value) {
            addCriterion("ECG <>", value, "ecg");
            return (Criteria) this;
        }

        public Criteria andEcgGreaterThan(Short value) {
            addCriterion("ECG >", value, "ecg");
            return (Criteria) this;
        }

        public Criteria andEcgGreaterThanOrEqualTo(Short value) {
            addCriterion("ECG >=", value, "ecg");
            return (Criteria) this;
        }

        public Criteria andEcgLessThan(Short value) {
            addCriterion("ECG <", value, "ecg");
            return (Criteria) this;
        }

        public Criteria andEcgLessThanOrEqualTo(Short value) {
            addCriterion("ECG <=", value, "ecg");
            return (Criteria) this;
        }

        public Criteria andEcgIn(List<Short> values) {
            addCriterion("ECG in", values, "ecg");
            return (Criteria) this;
        }

        public Criteria andEcgNotIn(List<Short> values) {
            addCriterion("ECG not in", values, "ecg");
            return (Criteria) this;
        }

        public Criteria andEcgBetween(Short value1, Short value2) {
            addCriterion("ECG between", value1, value2, "ecg");
            return (Criteria) this;
        }

        public Criteria andEcgNotBetween(Short value1, Short value2) {
            addCriterion("ECG not between", value1, value2, "ecg");
            return (Criteria) this;
        }

        public Criteria andSpo2IsNull() {
            addCriterion("SPO2 is null");
            return (Criteria) this;
        }

        public Criteria andSpo2IsNotNull() {
            addCriterion("SPO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpo2EqualTo(Short value) {
            addCriterion("SPO2 =", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2NotEqualTo(Short value) {
            addCriterion("SPO2 <>", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2GreaterThan(Short value) {
            addCriterion("SPO2 >", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2GreaterThanOrEqualTo(Short value) {
            addCriterion("SPO2 >=", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2LessThan(Short value) {
            addCriterion("SPO2 <", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2LessThanOrEqualTo(Short value) {
            addCriterion("SPO2 <=", value, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2In(List<Short> values) {
            addCriterion("SPO2 in", values, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2NotIn(List<Short> values) {
            addCriterion("SPO2 not in", values, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2Between(Short value1, Short value2) {
            addCriterion("SPO2 between", value1, value2, "spo2");
            return (Criteria) this;
        }

        public Criteria andSpo2NotBetween(Short value1, Short value2) {
            addCriterion("SPO2 not between", value1, value2, "spo2");
            return (Criteria) this;
        }

        public Criteria andRespIsNull() {
            addCriterion("RESP is null");
            return (Criteria) this;
        }

        public Criteria andRespIsNotNull() {
            addCriterion("RESP is not null");
            return (Criteria) this;
        }

        public Criteria andRespEqualTo(Short value) {
            addCriterion("RESP =", value, "resp");
            return (Criteria) this;
        }

        public Criteria andRespNotEqualTo(Short value) {
            addCriterion("RESP <>", value, "resp");
            return (Criteria) this;
        }

        public Criteria andRespGreaterThan(Short value) {
            addCriterion("RESP >", value, "resp");
            return (Criteria) this;
        }

        public Criteria andRespGreaterThanOrEqualTo(Short value) {
            addCriterion("RESP >=", value, "resp");
            return (Criteria) this;
        }

        public Criteria andRespLessThan(Short value) {
            addCriterion("RESP <", value, "resp");
            return (Criteria) this;
        }

        public Criteria andRespLessThanOrEqualTo(Short value) {
            addCriterion("RESP <=", value, "resp");
            return (Criteria) this;
        }

        public Criteria andRespIn(List<Short> values) {
            addCriterion("RESP in", values, "resp");
            return (Criteria) this;
        }

        public Criteria andRespNotIn(List<Short> values) {
            addCriterion("RESP not in", values, "resp");
            return (Criteria) this;
        }

        public Criteria andRespBetween(Short value1, Short value2) {
            addCriterion("RESP between", value1, value2, "resp");
            return (Criteria) this;
        }

        public Criteria andRespNotBetween(Short value1, Short value2) {
            addCriterion("RESP not between", value1, value2, "resp");
            return (Criteria) this;
        }

        public Criteria andTempIsNull() {
            addCriterion("TEMP is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(Short value) {
            addCriterion("TEMP =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(Short value) {
            addCriterion("TEMP <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(Short value) {
            addCriterion("TEMP >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(Short value) {
            addCriterion("TEMP >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(Short value) {
            addCriterion("TEMP <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(Short value) {
            addCriterion("TEMP <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<Short> values) {
            addCriterion("TEMP in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<Short> values) {
            addCriterion("TEMP not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(Short value1, Short value2) {
            addCriterion("TEMP between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(Short value1, Short value2) {
            addCriterion("TEMP not between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andNibpSysIsNull() {
            addCriterion("NIBP_SYS is null");
            return (Criteria) this;
        }

        public Criteria andNibpSysIsNotNull() {
            addCriterion("NIBP_SYS is not null");
            return (Criteria) this;
        }

        public Criteria andNibpSysEqualTo(Short value) {
            addCriterion("NIBP_SYS =", value, "nibpSys");
            return (Criteria) this;
        }

        public Criteria andNibpSysNotEqualTo(Short value) {
            addCriterion("NIBP_SYS <>", value, "nibpSys");
            return (Criteria) this;
        }

        public Criteria andNibpSysGreaterThan(Short value) {
            addCriterion("NIBP_SYS >", value, "nibpSys");
            return (Criteria) this;
        }

        public Criteria andNibpSysGreaterThanOrEqualTo(Short value) {
            addCriterion("NIBP_SYS >=", value, "nibpSys");
            return (Criteria) this;
        }

        public Criteria andNibpSysLessThan(Short value) {
            addCriterion("NIBP_SYS <", value, "nibpSys");
            return (Criteria) this;
        }

        public Criteria andNibpSysLessThanOrEqualTo(Short value) {
            addCriterion("NIBP_SYS <=", value, "nibpSys");
            return (Criteria) this;
        }

        public Criteria andNibpSysIn(List<Short> values) {
            addCriterion("NIBP_SYS in", values, "nibpSys");
            return (Criteria) this;
        }

        public Criteria andNibpSysNotIn(List<Short> values) {
            addCriterion("NIBP_SYS not in", values, "nibpSys");
            return (Criteria) this;
        }

        public Criteria andNibpSysBetween(Short value1, Short value2) {
            addCriterion("NIBP_SYS between", value1, value2, "nibpSys");
            return (Criteria) this;
        }

        public Criteria andNibpSysNotBetween(Short value1, Short value2) {
            addCriterion("NIBP_SYS not between", value1, value2, "nibpSys");
            return (Criteria) this;
        }

        public Criteria andNibpDiaIsNull() {
            addCriterion("NIBP_DIA is null");
            return (Criteria) this;
        }

        public Criteria andNibpDiaIsNotNull() {
            addCriterion("NIBP_DIA is not null");
            return (Criteria) this;
        }

        public Criteria andNibpDiaEqualTo(Short value) {
            addCriterion("NIBP_DIA =", value, "nibpDia");
            return (Criteria) this;
        }

        public Criteria andNibpDiaNotEqualTo(Short value) {
            addCriterion("NIBP_DIA <>", value, "nibpDia");
            return (Criteria) this;
        }

        public Criteria andNibpDiaGreaterThan(Short value) {
            addCriterion("NIBP_DIA >", value, "nibpDia");
            return (Criteria) this;
        }

        public Criteria andNibpDiaGreaterThanOrEqualTo(Short value) {
            addCriterion("NIBP_DIA >=", value, "nibpDia");
            return (Criteria) this;
        }

        public Criteria andNibpDiaLessThan(Short value) {
            addCriterion("NIBP_DIA <", value, "nibpDia");
            return (Criteria) this;
        }

        public Criteria andNibpDiaLessThanOrEqualTo(Short value) {
            addCriterion("NIBP_DIA <=", value, "nibpDia");
            return (Criteria) this;
        }

        public Criteria andNibpDiaIn(List<Short> values) {
            addCriterion("NIBP_DIA in", values, "nibpDia");
            return (Criteria) this;
        }

        public Criteria andNibpDiaNotIn(List<Short> values) {
            addCriterion("NIBP_DIA not in", values, "nibpDia");
            return (Criteria) this;
        }

        public Criteria andNibpDiaBetween(Short value1, Short value2) {
            addCriterion("NIBP_DIA between", value1, value2, "nibpDia");
            return (Criteria) this;
        }

        public Criteria andNibpDiaNotBetween(Short value1, Short value2) {
            addCriterion("NIBP_DIA not between", value1, value2, "nibpDia");
            return (Criteria) this;
        }

        public Criteria andNibpMeaIsNull() {
            addCriterion("NIBP_MEA is null");
            return (Criteria) this;
        }

        public Criteria andNibpMeaIsNotNull() {
            addCriterion("NIBP_MEA is not null");
            return (Criteria) this;
        }

        public Criteria andNibpMeaEqualTo(Short value) {
            addCriterion("NIBP_MEA =", value, "nibpMea");
            return (Criteria) this;
        }

        public Criteria andNibpMeaNotEqualTo(Short value) {
            addCriterion("NIBP_MEA <>", value, "nibpMea");
            return (Criteria) this;
        }

        public Criteria andNibpMeaGreaterThan(Short value) {
            addCriterion("NIBP_MEA >", value, "nibpMea");
            return (Criteria) this;
        }

        public Criteria andNibpMeaGreaterThanOrEqualTo(Short value) {
            addCriterion("NIBP_MEA >=", value, "nibpMea");
            return (Criteria) this;
        }

        public Criteria andNibpMeaLessThan(Short value) {
            addCriterion("NIBP_MEA <", value, "nibpMea");
            return (Criteria) this;
        }

        public Criteria andNibpMeaLessThanOrEqualTo(Short value) {
            addCriterion("NIBP_MEA <=", value, "nibpMea");
            return (Criteria) this;
        }

        public Criteria andNibpMeaIn(List<Short> values) {
            addCriterion("NIBP_MEA in", values, "nibpMea");
            return (Criteria) this;
        }

        public Criteria andNibpMeaNotIn(List<Short> values) {
            addCriterion("NIBP_MEA not in", values, "nibpMea");
            return (Criteria) this;
        }

        public Criteria andNibpMeaBetween(Short value1, Short value2) {
            addCriterion("NIBP_MEA between", value1, value2, "nibpMea");
            return (Criteria) this;
        }

        public Criteria andNibpMeaNotBetween(Short value1, Short value2) {
            addCriterion("NIBP_MEA not between", value1, value2, "nibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmEcgIsNull() {
            addCriterion("ALM_ECG is null");
            return (Criteria) this;
        }

        public Criteria andAlmEcgIsNotNull() {
            addCriterion("ALM_ECG is not null");
            return (Criteria) this;
        }

        public Criteria andAlmEcgEqualTo(String value) {
            addCriterion("ALM_ECG =", value, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmEcgNotEqualTo(String value) {
            addCriterion("ALM_ECG <>", value, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmEcgGreaterThan(String value) {
            addCriterion("ALM_ECG >", value, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmEcgGreaterThanOrEqualTo(String value) {
            addCriterion("ALM_ECG >=", value, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmEcgLessThan(String value) {
            addCriterion("ALM_ECG <", value, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmEcgLessThanOrEqualTo(String value) {
            addCriterion("ALM_ECG <=", value, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmEcgLike(String value) {
            addCriterion("ALM_ECG like", value, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmEcgNotLike(String value) {
            addCriterion("ALM_ECG not like", value, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmEcgIn(List<String> values) {
            addCriterion("ALM_ECG in", values, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmEcgNotIn(List<String> values) {
            addCriterion("ALM_ECG not in", values, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmEcgBetween(String value1, String value2) {
            addCriterion("ALM_ECG between", value1, value2, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmEcgNotBetween(String value1, String value2) {
            addCriterion("ALM_ECG not between", value1, value2, "almEcg");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2IsNull() {
            addCriterion("ALM_SPO2 is null");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2IsNotNull() {
            addCriterion("ALM_SPO2 is not null");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2EqualTo(String value) {
            addCriterion("ALM_SPO2 =", value, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2NotEqualTo(String value) {
            addCriterion("ALM_SPO2 <>", value, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2GreaterThan(String value) {
            addCriterion("ALM_SPO2 >", value, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2GreaterThanOrEqualTo(String value) {
            addCriterion("ALM_SPO2 >=", value, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2LessThan(String value) {
            addCriterion("ALM_SPO2 <", value, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2LessThanOrEqualTo(String value) {
            addCriterion("ALM_SPO2 <=", value, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2Like(String value) {
            addCriterion("ALM_SPO2 like", value, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2NotLike(String value) {
            addCriterion("ALM_SPO2 not like", value, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2In(List<String> values) {
            addCriterion("ALM_SPO2 in", values, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2NotIn(List<String> values) {
            addCriterion("ALM_SPO2 not in", values, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2Between(String value1, String value2) {
            addCriterion("ALM_SPO2 between", value1, value2, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmSpo2NotBetween(String value1, String value2) {
            addCriterion("ALM_SPO2 not between", value1, value2, "almSpo2");
            return (Criteria) this;
        }

        public Criteria andAlmRespIsNull() {
            addCriterion("ALM_RESP is null");
            return (Criteria) this;
        }

        public Criteria andAlmRespIsNotNull() {
            addCriterion("ALM_RESP is not null");
            return (Criteria) this;
        }

        public Criteria andAlmRespEqualTo(String value) {
            addCriterion("ALM_RESP =", value, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmRespNotEqualTo(String value) {
            addCriterion("ALM_RESP <>", value, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmRespGreaterThan(String value) {
            addCriterion("ALM_RESP >", value, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmRespGreaterThanOrEqualTo(String value) {
            addCriterion("ALM_RESP >=", value, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmRespLessThan(String value) {
            addCriterion("ALM_RESP <", value, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmRespLessThanOrEqualTo(String value) {
            addCriterion("ALM_RESP <=", value, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmRespLike(String value) {
            addCriterion("ALM_RESP like", value, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmRespNotLike(String value) {
            addCriterion("ALM_RESP not like", value, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmRespIn(List<String> values) {
            addCriterion("ALM_RESP in", values, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmRespNotIn(List<String> values) {
            addCriterion("ALM_RESP not in", values, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmRespBetween(String value1, String value2) {
            addCriterion("ALM_RESP between", value1, value2, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmRespNotBetween(String value1, String value2) {
            addCriterion("ALM_RESP not between", value1, value2, "almResp");
            return (Criteria) this;
        }

        public Criteria andAlmTempIsNull() {
            addCriterion("ALM_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andAlmTempIsNotNull() {
            addCriterion("ALM_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andAlmTempEqualTo(String value) {
            addCriterion("ALM_TEMP =", value, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmTempNotEqualTo(String value) {
            addCriterion("ALM_TEMP <>", value, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmTempGreaterThan(String value) {
            addCriterion("ALM_TEMP >", value, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmTempGreaterThanOrEqualTo(String value) {
            addCriterion("ALM_TEMP >=", value, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmTempLessThan(String value) {
            addCriterion("ALM_TEMP <", value, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmTempLessThanOrEqualTo(String value) {
            addCriterion("ALM_TEMP <=", value, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmTempLike(String value) {
            addCriterion("ALM_TEMP like", value, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmTempNotLike(String value) {
            addCriterion("ALM_TEMP not like", value, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmTempIn(List<String> values) {
            addCriterion("ALM_TEMP in", values, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmTempNotIn(List<String> values) {
            addCriterion("ALM_TEMP not in", values, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmTempBetween(String value1, String value2) {
            addCriterion("ALM_TEMP between", value1, value2, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmTempNotBetween(String value1, String value2) {
            addCriterion("ALM_TEMP not between", value1, value2, "almTemp");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysIsNull() {
            addCriterion("ALM_NIBP_SYS is null");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysIsNotNull() {
            addCriterion("ALM_NIBP_SYS is not null");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysEqualTo(String value) {
            addCriterion("ALM_NIBP_SYS =", value, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysNotEqualTo(String value) {
            addCriterion("ALM_NIBP_SYS <>", value, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysGreaterThan(String value) {
            addCriterion("ALM_NIBP_SYS >", value, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysGreaterThanOrEqualTo(String value) {
            addCriterion("ALM_NIBP_SYS >=", value, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysLessThan(String value) {
            addCriterion("ALM_NIBP_SYS <", value, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysLessThanOrEqualTo(String value) {
            addCriterion("ALM_NIBP_SYS <=", value, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysLike(String value) {
            addCriterion("ALM_NIBP_SYS like", value, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysNotLike(String value) {
            addCriterion("ALM_NIBP_SYS not like", value, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysIn(List<String> values) {
            addCriterion("ALM_NIBP_SYS in", values, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysNotIn(List<String> values) {
            addCriterion("ALM_NIBP_SYS not in", values, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysBetween(String value1, String value2) {
            addCriterion("ALM_NIBP_SYS between", value1, value2, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpSysNotBetween(String value1, String value2) {
            addCriterion("ALM_NIBP_SYS not between", value1, value2, "almNibpSys");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaIsNull() {
            addCriterion("ALM_NIBP_DIA is null");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaIsNotNull() {
            addCriterion("ALM_NIBP_DIA is not null");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaEqualTo(String value) {
            addCriterion("ALM_NIBP_DIA =", value, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaNotEqualTo(String value) {
            addCriterion("ALM_NIBP_DIA <>", value, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaGreaterThan(String value) {
            addCriterion("ALM_NIBP_DIA >", value, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaGreaterThanOrEqualTo(String value) {
            addCriterion("ALM_NIBP_DIA >=", value, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaLessThan(String value) {
            addCriterion("ALM_NIBP_DIA <", value, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaLessThanOrEqualTo(String value) {
            addCriterion("ALM_NIBP_DIA <=", value, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaLike(String value) {
            addCriterion("ALM_NIBP_DIA like", value, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaNotLike(String value) {
            addCriterion("ALM_NIBP_DIA not like", value, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaIn(List<String> values) {
            addCriterion("ALM_NIBP_DIA in", values, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaNotIn(List<String> values) {
            addCriterion("ALM_NIBP_DIA not in", values, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaBetween(String value1, String value2) {
            addCriterion("ALM_NIBP_DIA between", value1, value2, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpDiaNotBetween(String value1, String value2) {
            addCriterion("ALM_NIBP_DIA not between", value1, value2, "almNibpDia");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaIsNull() {
            addCriterion("ALM_NIBP_MEA is null");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaIsNotNull() {
            addCriterion("ALM_NIBP_MEA is not null");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaEqualTo(String value) {
            addCriterion("ALM_NIBP_MEA =", value, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaNotEqualTo(String value) {
            addCriterion("ALM_NIBP_MEA <>", value, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaGreaterThan(String value) {
            addCriterion("ALM_NIBP_MEA >", value, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaGreaterThanOrEqualTo(String value) {
            addCriterion("ALM_NIBP_MEA >=", value, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaLessThan(String value) {
            addCriterion("ALM_NIBP_MEA <", value, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaLessThanOrEqualTo(String value) {
            addCriterion("ALM_NIBP_MEA <=", value, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaLike(String value) {
            addCriterion("ALM_NIBP_MEA like", value, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaNotLike(String value) {
            addCriterion("ALM_NIBP_MEA not like", value, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaIn(List<String> values) {
            addCriterion("ALM_NIBP_MEA in", values, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaNotIn(List<String> values) {
            addCriterion("ALM_NIBP_MEA not in", values, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaBetween(String value1, String value2) {
            addCriterion("ALM_NIBP_MEA between", value1, value2, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmNibpMeaNotBetween(String value1, String value2) {
            addCriterion("ALM_NIBP_MEA not between", value1, value2, "almNibpMea");
            return (Criteria) this;
        }

        public Criteria andAlmTecIsNull() {
            addCriterion("ALM_TEC is null");
            return (Criteria) this;
        }

        public Criteria andAlmTecIsNotNull() {
            addCriterion("ALM_TEC is not null");
            return (Criteria) this;
        }

        public Criteria andAlmTecEqualTo(String value) {
            addCriterion("ALM_TEC =", value, "almTec");
            return (Criteria) this;
        }

        public Criteria andAlmTecNotEqualTo(String value) {
            addCriterion("ALM_TEC <>", value, "almTec");
            return (Criteria) this;
        }

        public Criteria andAlmTecGreaterThan(String value) {
            addCriterion("ALM_TEC >", value, "almTec");
            return (Criteria) this;
        }

        public Criteria andAlmTecGreaterThanOrEqualTo(String value) {
            addCriterion("ALM_TEC >=", value, "almTec");
            return (Criteria) this;
        }

        public Criteria andAlmTecLessThan(String value) {
            addCriterion("ALM_TEC <", value, "almTec");
            return (Criteria) this;
        }

        public Criteria andAlmTecLessThanOrEqualTo(String value) {
            addCriterion("ALM_TEC <=", value, "almTec");
            return (Criteria) this;
        }

        public Criteria andAlmTecLike(String value) {
            addCriterion("ALM_TEC like", value, "almTec");
            return (Criteria) this;
        }

        public Criteria andAlmTecNotLike(String value) {
            addCriterion("ALM_TEC not like", value, "almTec");
            return (Criteria) this;
        }

        public Criteria andAlmTecIn(List<String> values) {
            addCriterion("ALM_TEC in", values, "almTec");
            return (Criteria) this;
        }

        public Criteria andAlmTecNotIn(List<String> values) {
            addCriterion("ALM_TEC not in", values, "almTec");
            return (Criteria) this;
        }

        public Criteria andAlmTecBetween(String value1, String value2) {
            addCriterion("ALM_TEC between", value1, value2, "almTec");
            return (Criteria) this;
        }

        public Criteria andAlmTecNotBetween(String value1, String value2) {
            addCriterion("ALM_TEC not between", value1, value2, "almTec");
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