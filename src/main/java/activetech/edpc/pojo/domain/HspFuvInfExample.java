package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspFuvInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspFuvInfExample() {
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

        public Criteria andFuvSeqIsNull() {
            addCriterion("FUV_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFuvSeqIsNotNull() {
            addCriterion("FUV_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFuvSeqEqualTo(String value) {
            addCriterion("FUV_SEQ =", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotEqualTo(String value) {
            addCriterion("FUV_SEQ <>", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqGreaterThan(String value) {
            addCriterion("FUV_SEQ >", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_SEQ >=", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqLessThan(String value) {
            addCriterion("FUV_SEQ <", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqLessThanOrEqualTo(String value) {
            addCriterion("FUV_SEQ <=", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqLike(String value) {
            addCriterion("FUV_SEQ like", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotLike(String value) {
            addCriterion("FUV_SEQ not like", value, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqIn(List<String> values) {
            addCriterion("FUV_SEQ in", values, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotIn(List<String> values) {
            addCriterion("FUV_SEQ not in", values, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqBetween(String value1, String value2) {
            addCriterion("FUV_SEQ between", value1, value2, "fuvSeq");
            return (Criteria) this;
        }

        public Criteria andFuvSeqNotBetween(String value1, String value2) {
            addCriterion("FUV_SEQ not between", value1, value2, "fuvSeq");
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

        public Criteria andOutTimIsNull() {
            addCriterion("OUT_TIM is null");
            return (Criteria) this;
        }

        public Criteria andOutTimIsNotNull() {
            addCriterion("OUT_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimEqualTo(Date value) {
            addCriterion("OUT_TIM =", value, "outTim");
            return (Criteria) this;
        }

        public Criteria andOutTimNotEqualTo(Date value) {
            addCriterion("OUT_TIM <>", value, "outTim");
            return (Criteria) this;
        }

        public Criteria andOutTimGreaterThan(Date value) {
            addCriterion("OUT_TIM >", value, "outTim");
            return (Criteria) this;
        }

        public Criteria andOutTimGreaterThanOrEqualTo(Date value) {
            addCriterion("OUT_TIM >=", value, "outTim");
            return (Criteria) this;
        }

        public Criteria andOutTimLessThan(Date value) {
            addCriterion("OUT_TIM <", value, "outTim");
            return (Criteria) this;
        }

        public Criteria andOutTimLessThanOrEqualTo(Date value) {
            addCriterion("OUT_TIM <=", value, "outTim");
            return (Criteria) this;
        }

        public Criteria andOutTimIn(List<Date> values) {
            addCriterion("OUT_TIM in", values, "outTim");
            return (Criteria) this;
        }

        public Criteria andOutTimNotIn(List<Date> values) {
            addCriterion("OUT_TIM not in", values, "outTim");
            return (Criteria) this;
        }

        public Criteria andOutTimBetween(Date value1, Date value2) {
            addCriterion("OUT_TIM between", value1, value2, "outTim");
            return (Criteria) this;
        }

        public Criteria andOutTimNotBetween(Date value1, Date value2) {
            addCriterion("OUT_TIM not between", value1, value2, "outTim");
            return (Criteria) this;
        }

        public Criteria andDiaRstIsNull() {
            addCriterion("DIA_RST is null");
            return (Criteria) this;
        }

        public Criteria andDiaRstIsNotNull() {
            addCriterion("DIA_RST is not null");
            return (Criteria) this;
        }

        public Criteria andDiaRstEqualTo(String value) {
            addCriterion("DIA_RST =", value, "diaRst");
            return (Criteria) this;
        }

        public Criteria andDiaRstNotEqualTo(String value) {
            addCriterion("DIA_RST <>", value, "diaRst");
            return (Criteria) this;
        }

        public Criteria andDiaRstGreaterThan(String value) {
            addCriterion("DIA_RST >", value, "diaRst");
            return (Criteria) this;
        }

        public Criteria andDiaRstGreaterThanOrEqualTo(String value) {
            addCriterion("DIA_RST >=", value, "diaRst");
            return (Criteria) this;
        }

        public Criteria andDiaRstLessThan(String value) {
            addCriterion("DIA_RST <", value, "diaRst");
            return (Criteria) this;
        }

        public Criteria andDiaRstLessThanOrEqualTo(String value) {
            addCriterion("DIA_RST <=", value, "diaRst");
            return (Criteria) this;
        }

        public Criteria andDiaRstLike(String value) {
            addCriterion("DIA_RST like", value, "diaRst");
            return (Criteria) this;
        }

        public Criteria andDiaRstNotLike(String value) {
            addCriterion("DIA_RST not like", value, "diaRst");
            return (Criteria) this;
        }

        public Criteria andDiaRstIn(List<String> values) {
            addCriterion("DIA_RST in", values, "diaRst");
            return (Criteria) this;
        }

        public Criteria andDiaRstNotIn(List<String> values) {
            addCriterion("DIA_RST not in", values, "diaRst");
            return (Criteria) this;
        }

        public Criteria andDiaRstBetween(String value1, String value2) {
            addCriterion("DIA_RST between", value1, value2, "diaRst");
            return (Criteria) this;
        }

        public Criteria andDiaRstNotBetween(String value1, String value2) {
            addCriterion("DIA_RST not between", value1, value2, "diaRst");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodIsNull() {
            addCriterion("FUV_WAY_COD is null");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodIsNotNull() {
            addCriterion("FUV_WAY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodEqualTo(String value) {
            addCriterion("FUV_WAY_COD =", value, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodNotEqualTo(String value) {
            addCriterion("FUV_WAY_COD <>", value, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodGreaterThan(String value) {
            addCriterion("FUV_WAY_COD >", value, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_WAY_COD >=", value, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodLessThan(String value) {
            addCriterion("FUV_WAY_COD <", value, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodLessThanOrEqualTo(String value) {
            addCriterion("FUV_WAY_COD <=", value, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodLike(String value) {
            addCriterion("FUV_WAY_COD like", value, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodNotLike(String value) {
            addCriterion("FUV_WAY_COD not like", value, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodIn(List<String> values) {
            addCriterion("FUV_WAY_COD in", values, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodNotIn(List<String> values) {
            addCriterion("FUV_WAY_COD not in", values, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodBetween(String value1, String value2) {
            addCriterion("FUV_WAY_COD between", value1, value2, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvWayCodNotBetween(String value1, String value2) {
            addCriterion("FUV_WAY_COD not between", value1, value2, "fuvWayCod");
            return (Criteria) this;
        }

        public Criteria andFuvTypIsNull() {
            addCriterion("FUV_TYP is null");
            return (Criteria) this;
        }

        public Criteria andFuvTypIsNotNull() {
            addCriterion("FUV_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andFuvTypEqualTo(String value) {
            addCriterion("FUV_TYP =", value, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTypNotEqualTo(String value) {
            addCriterion("FUV_TYP <>", value, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTypGreaterThan(String value) {
            addCriterion("FUV_TYP >", value, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTypGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_TYP >=", value, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTypLessThan(String value) {
            addCriterion("FUV_TYP <", value, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTypLessThanOrEqualTo(String value) {
            addCriterion("FUV_TYP <=", value, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTypLike(String value) {
            addCriterion("FUV_TYP like", value, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTypNotLike(String value) {
            addCriterion("FUV_TYP not like", value, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTypIn(List<String> values) {
            addCriterion("FUV_TYP in", values, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTypNotIn(List<String> values) {
            addCriterion("FUV_TYP not in", values, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTypBetween(String value1, String value2) {
            addCriterion("FUV_TYP between", value1, value2, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTypNotBetween(String value1, String value2) {
            addCriterion("FUV_TYP not between", value1, value2, "fuvTyp");
            return (Criteria) this;
        }

        public Criteria andFuvTimIsNull() {
            addCriterion("FUV_TIM is null");
            return (Criteria) this;
        }

        public Criteria andFuvTimIsNotNull() {
            addCriterion("FUV_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andFuvTimEqualTo(Date value) {
            addCriterion("FUV_TIM =", value, "fuvTim");
            return (Criteria) this;
        }

        public Criteria andFuvTimNotEqualTo(Date value) {
            addCriterion("FUV_TIM <>", value, "fuvTim");
            return (Criteria) this;
        }

        public Criteria andFuvTimGreaterThan(Date value) {
            addCriterion("FUV_TIM >", value, "fuvTim");
            return (Criteria) this;
        }

        public Criteria andFuvTimGreaterThanOrEqualTo(Date value) {
            addCriterion("FUV_TIM >=", value, "fuvTim");
            return (Criteria) this;
        }

        public Criteria andFuvTimLessThan(Date value) {
            addCriterion("FUV_TIM <", value, "fuvTim");
            return (Criteria) this;
        }

        public Criteria andFuvTimLessThanOrEqualTo(Date value) {
            addCriterion("FUV_TIM <=", value, "fuvTim");
            return (Criteria) this;
        }

        public Criteria andFuvTimIn(List<Date> values) {
            addCriterion("FUV_TIM in", values, "fuvTim");
            return (Criteria) this;
        }

        public Criteria andFuvTimNotIn(List<Date> values) {
            addCriterion("FUV_TIM not in", values, "fuvTim");
            return (Criteria) this;
        }

        public Criteria andFuvTimBetween(Date value1, Date value2) {
            addCriterion("FUV_TIM between", value1, value2, "fuvTim");
            return (Criteria) this;
        }

        public Criteria andFuvTimNotBetween(Date value1, Date value2) {
            addCriterion("FUV_TIM not between", value1, value2, "fuvTim");
            return (Criteria) this;
        }

        public Criteria andFuvGrpIsNull() {
            addCriterion("FUV_GRP is null");
            return (Criteria) this;
        }

        public Criteria andFuvGrpIsNotNull() {
            addCriterion("FUV_GRP is not null");
            return (Criteria) this;
        }

        public Criteria andFuvGrpEqualTo(String value) {
            addCriterion("FUV_GRP =", value, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNotEqualTo(String value) {
            addCriterion("FUV_GRP <>", value, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvGrpGreaterThan(String value) {
            addCriterion("FUV_GRP >", value, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvGrpGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_GRP >=", value, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvGrpLessThan(String value) {
            addCriterion("FUV_GRP <", value, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvGrpLessThanOrEqualTo(String value) {
            addCriterion("FUV_GRP <=", value, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvGrpLike(String value) {
            addCriterion("FUV_GRP like", value, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNotLike(String value) {
            addCriterion("FUV_GRP not like", value, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvGrpIn(List<String> values) {
            addCriterion("FUV_GRP in", values, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNotIn(List<String> values) {
            addCriterion("FUV_GRP not in", values, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvGrpBetween(String value1, String value2) {
            addCriterion("FUV_GRP between", value1, value2, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvGrpNotBetween(String value1, String value2) {
            addCriterion("FUV_GRP not between", value1, value2, "fuvGrp");
            return (Criteria) this;
        }

        public Criteria andFuvDocIsNull() {
            addCriterion("FUV_DOC is null");
            return (Criteria) this;
        }

        public Criteria andFuvDocIsNotNull() {
            addCriterion("FUV_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andFuvDocEqualTo(String value) {
            addCriterion("FUV_DOC =", value, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andFuvDocNotEqualTo(String value) {
            addCriterion("FUV_DOC <>", value, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andFuvDocGreaterThan(String value) {
            addCriterion("FUV_DOC >", value, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andFuvDocGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_DOC >=", value, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andFuvDocLessThan(String value) {
            addCriterion("FUV_DOC <", value, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andFuvDocLessThanOrEqualTo(String value) {
            addCriterion("FUV_DOC <=", value, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andFuvDocLike(String value) {
            addCriterion("FUV_DOC like", value, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andFuvDocNotLike(String value) {
            addCriterion("FUV_DOC not like", value, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andFuvDocIn(List<String> values) {
            addCriterion("FUV_DOC in", values, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andFuvDocNotIn(List<String> values) {
            addCriterion("FUV_DOC not in", values, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andFuvDocBetween(String value1, String value2) {
            addCriterion("FUV_DOC between", value1, value2, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andFuvDocNotBetween(String value1, String value2) {
            addCriterion("FUV_DOC not between", value1, value2, "fuvDoc");
            return (Criteria) this;
        }

        public Criteria andDgrStfIsNull() {
            addCriterion("DGR_STF is null");
            return (Criteria) this;
        }

        public Criteria andDgrStfIsNotNull() {
            addCriterion("DGR_STF is not null");
            return (Criteria) this;
        }

        public Criteria andDgrStfEqualTo(Short value) {
            addCriterion("DGR_STF =", value, "dgrStf");
            return (Criteria) this;
        }

        public Criteria andDgrStfNotEqualTo(Short value) {
            addCriterion("DGR_STF <>", value, "dgrStf");
            return (Criteria) this;
        }

        public Criteria andDgrStfGreaterThan(Short value) {
            addCriterion("DGR_STF >", value, "dgrStf");
            return (Criteria) this;
        }

        public Criteria andDgrStfGreaterThanOrEqualTo(Short value) {
            addCriterion("DGR_STF >=", value, "dgrStf");
            return (Criteria) this;
        }

        public Criteria andDgrStfLessThan(Short value) {
            addCriterion("DGR_STF <", value, "dgrStf");
            return (Criteria) this;
        }

        public Criteria andDgrStfLessThanOrEqualTo(Short value) {
            addCriterion("DGR_STF <=", value, "dgrStf");
            return (Criteria) this;
        }

        public Criteria andDgrStfIn(List<Short> values) {
            addCriterion("DGR_STF in", values, "dgrStf");
            return (Criteria) this;
        }

        public Criteria andDgrStfNotIn(List<Short> values) {
            addCriterion("DGR_STF not in", values, "dgrStf");
            return (Criteria) this;
        }

        public Criteria andDgrStfBetween(Short value1, Short value2) {
            addCriterion("DGR_STF between", value1, value2, "dgrStf");
            return (Criteria) this;
        }

        public Criteria andDgrStfNotBetween(Short value1, Short value2) {
            addCriterion("DGR_STF not between", value1, value2, "dgrStf");
            return (Criteria) this;
        }

        public Criteria andPatSymCodIsNull() {
            addCriterion("PAT_SYM_COD is null");
            return (Criteria) this;
        }

        public Criteria andPatSymCodIsNotNull() {
            addCriterion("PAT_SYM_COD is not null");
            return (Criteria) this;
        }

        public Criteria andPatSymCodEqualTo(String value) {
            addCriterion("PAT_SYM_COD =", value, "patSymCod");
            return (Criteria) this;
        }

        public Criteria andPatSymCodNotEqualTo(String value) {
            addCriterion("PAT_SYM_COD <>", value, "patSymCod");
            return (Criteria) this;
        }

        public Criteria andPatSymCodGreaterThan(String value) {
            addCriterion("PAT_SYM_COD >", value, "patSymCod");
            return (Criteria) this;
        }

        public Criteria andPatSymCodGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_SYM_COD >=", value, "patSymCod");
            return (Criteria) this;
        }

        public Criteria andPatSymCodLessThan(String value) {
            addCriterion("PAT_SYM_COD <", value, "patSymCod");
            return (Criteria) this;
        }

        public Criteria andPatSymCodLessThanOrEqualTo(String value) {
            addCriterion("PAT_SYM_COD <=", value, "patSymCod");
            return (Criteria) this;
        }

        public Criteria andPatSymCodLike(String value) {
            addCriterion("PAT_SYM_COD like", value, "patSymCod");
            return (Criteria) this;
        }

        public Criteria andPatSymCodNotLike(String value) {
            addCriterion("PAT_SYM_COD not like", value, "patSymCod");
            return (Criteria) this;
        }

        public Criteria andPatSymCodIn(List<String> values) {
            addCriterion("PAT_SYM_COD in", values, "patSymCod");
            return (Criteria) this;
        }

        public Criteria andPatSymCodNotIn(List<String> values) {
            addCriterion("PAT_SYM_COD not in", values, "patSymCod");
            return (Criteria) this;
        }

        public Criteria andPatSymCodBetween(String value1, String value2) {
            addCriterion("PAT_SYM_COD between", value1, value2, "patSymCod");
            return (Criteria) this;
        }

        public Criteria andPatSymCodNotBetween(String value1, String value2) {
            addCriterion("PAT_SYM_COD not between", value1, value2, "patSymCod");
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

        public Criteria andPatWgtEqualTo(Short value) {
            addCriterion("PAT_WGT =", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtNotEqualTo(Short value) {
            addCriterion("PAT_WGT <>", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtGreaterThan(Short value) {
            addCriterion("PAT_WGT >", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtGreaterThanOrEqualTo(Short value) {
            addCriterion("PAT_WGT >=", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtLessThan(Short value) {
            addCriterion("PAT_WGT <", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtLessThanOrEqualTo(Short value) {
            addCriterion("PAT_WGT <=", value, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtIn(List<Short> values) {
            addCriterion("PAT_WGT in", values, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtNotIn(List<Short> values) {
            addCriterion("PAT_WGT not in", values, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtBetween(Short value1, Short value2) {
            addCriterion("PAT_WGT between", value1, value2, "patWgt");
            return (Criteria) this;
        }

        public Criteria andPatWgtNotBetween(Short value1, Short value2) {
            addCriterion("PAT_WGT not between", value1, value2, "patWgt");
            return (Criteria) this;
        }

        public Criteria andSmkConIsNull() {
            addCriterion("SMK_CON is null");
            return (Criteria) this;
        }

        public Criteria andSmkConIsNotNull() {
            addCriterion("SMK_CON is not null");
            return (Criteria) this;
        }

        public Criteria andSmkConEqualTo(String value) {
            addCriterion("SMK_CON =", value, "smkCon");
            return (Criteria) this;
        }

        public Criteria andSmkConNotEqualTo(String value) {
            addCriterion("SMK_CON <>", value, "smkCon");
            return (Criteria) this;
        }

        public Criteria andSmkConGreaterThan(String value) {
            addCriterion("SMK_CON >", value, "smkCon");
            return (Criteria) this;
        }

        public Criteria andSmkConGreaterThanOrEqualTo(String value) {
            addCriterion("SMK_CON >=", value, "smkCon");
            return (Criteria) this;
        }

        public Criteria andSmkConLessThan(String value) {
            addCriterion("SMK_CON <", value, "smkCon");
            return (Criteria) this;
        }

        public Criteria andSmkConLessThanOrEqualTo(String value) {
            addCriterion("SMK_CON <=", value, "smkCon");
            return (Criteria) this;
        }

        public Criteria andSmkConLike(String value) {
            addCriterion("SMK_CON like", value, "smkCon");
            return (Criteria) this;
        }

        public Criteria andSmkConNotLike(String value) {
            addCriterion("SMK_CON not like", value, "smkCon");
            return (Criteria) this;
        }

        public Criteria andSmkConIn(List<String> values) {
            addCriterion("SMK_CON in", values, "smkCon");
            return (Criteria) this;
        }

        public Criteria andSmkConNotIn(List<String> values) {
            addCriterion("SMK_CON not in", values, "smkCon");
            return (Criteria) this;
        }

        public Criteria andSmkConBetween(String value1, String value2) {
            addCriterion("SMK_CON between", value1, value2, "smkCon");
            return (Criteria) this;
        }

        public Criteria andSmkConNotBetween(String value1, String value2) {
            addCriterion("SMK_CON not between", value1, value2, "smkCon");
            return (Criteria) this;
        }

        public Criteria andAlcConIsNull() {
            addCriterion("ALC_CON is null");
            return (Criteria) this;
        }

        public Criteria andAlcConIsNotNull() {
            addCriterion("ALC_CON is not null");
            return (Criteria) this;
        }

        public Criteria andAlcConEqualTo(String value) {
            addCriterion("ALC_CON =", value, "alcCon");
            return (Criteria) this;
        }

        public Criteria andAlcConNotEqualTo(String value) {
            addCriterion("ALC_CON <>", value, "alcCon");
            return (Criteria) this;
        }

        public Criteria andAlcConGreaterThan(String value) {
            addCriterion("ALC_CON >", value, "alcCon");
            return (Criteria) this;
        }

        public Criteria andAlcConGreaterThanOrEqualTo(String value) {
            addCriterion("ALC_CON >=", value, "alcCon");
            return (Criteria) this;
        }

        public Criteria andAlcConLessThan(String value) {
            addCriterion("ALC_CON <", value, "alcCon");
            return (Criteria) this;
        }

        public Criteria andAlcConLessThanOrEqualTo(String value) {
            addCriterion("ALC_CON <=", value, "alcCon");
            return (Criteria) this;
        }

        public Criteria andAlcConLike(String value) {
            addCriterion("ALC_CON like", value, "alcCon");
            return (Criteria) this;
        }

        public Criteria andAlcConNotLike(String value) {
            addCriterion("ALC_CON not like", value, "alcCon");
            return (Criteria) this;
        }

        public Criteria andAlcConIn(List<String> values) {
            addCriterion("ALC_CON in", values, "alcCon");
            return (Criteria) this;
        }

        public Criteria andAlcConNotIn(List<String> values) {
            addCriterion("ALC_CON not in", values, "alcCon");
            return (Criteria) this;
        }

        public Criteria andAlcConBetween(String value1, String value2) {
            addCriterion("ALC_CON between", value1, value2, "alcCon");
            return (Criteria) this;
        }

        public Criteria andAlcConNotBetween(String value1, String value2) {
            addCriterion("ALC_CON not between", value1, value2, "alcCon");
            return (Criteria) this;
        }

        public Criteria andFodConIsNull() {
            addCriterion("FOD_CON is null");
            return (Criteria) this;
        }

        public Criteria andFodConIsNotNull() {
            addCriterion("FOD_CON is not null");
            return (Criteria) this;
        }

        public Criteria andFodConEqualTo(String value) {
            addCriterion("FOD_CON =", value, "fodCon");
            return (Criteria) this;
        }

        public Criteria andFodConNotEqualTo(String value) {
            addCriterion("FOD_CON <>", value, "fodCon");
            return (Criteria) this;
        }

        public Criteria andFodConGreaterThan(String value) {
            addCriterion("FOD_CON >", value, "fodCon");
            return (Criteria) this;
        }

        public Criteria andFodConGreaterThanOrEqualTo(String value) {
            addCriterion("FOD_CON >=", value, "fodCon");
            return (Criteria) this;
        }

        public Criteria andFodConLessThan(String value) {
            addCriterion("FOD_CON <", value, "fodCon");
            return (Criteria) this;
        }

        public Criteria andFodConLessThanOrEqualTo(String value) {
            addCriterion("FOD_CON <=", value, "fodCon");
            return (Criteria) this;
        }

        public Criteria andFodConLike(String value) {
            addCriterion("FOD_CON like", value, "fodCon");
            return (Criteria) this;
        }

        public Criteria andFodConNotLike(String value) {
            addCriterion("FOD_CON not like", value, "fodCon");
            return (Criteria) this;
        }

        public Criteria andFodConIn(List<String> values) {
            addCriterion("FOD_CON in", values, "fodCon");
            return (Criteria) this;
        }

        public Criteria andFodConNotIn(List<String> values) {
            addCriterion("FOD_CON not in", values, "fodCon");
            return (Criteria) this;
        }

        public Criteria andFodConBetween(String value1, String value2) {
            addCriterion("FOD_CON between", value1, value2, "fodCon");
            return (Criteria) this;
        }

        public Criteria andFodConNotBetween(String value1, String value2) {
            addCriterion("FOD_CON not between", value1, value2, "fodCon");
            return (Criteria) this;
        }

        public Criteria andSltConCodIsNull() {
            addCriterion("SLT_CON_COD is null");
            return (Criteria) this;
        }

        public Criteria andSltConCodIsNotNull() {
            addCriterion("SLT_CON_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSltConCodEqualTo(String value) {
            addCriterion("SLT_CON_COD =", value, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSltConCodNotEqualTo(String value) {
            addCriterion("SLT_CON_COD <>", value, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSltConCodGreaterThan(String value) {
            addCriterion("SLT_CON_COD >", value, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSltConCodGreaterThanOrEqualTo(String value) {
            addCriterion("SLT_CON_COD >=", value, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSltConCodLessThan(String value) {
            addCriterion("SLT_CON_COD <", value, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSltConCodLessThanOrEqualTo(String value) {
            addCriterion("SLT_CON_COD <=", value, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSltConCodLike(String value) {
            addCriterion("SLT_CON_COD like", value, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSltConCodNotLike(String value) {
            addCriterion("SLT_CON_COD not like", value, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSltConCodIn(List<String> values) {
            addCriterion("SLT_CON_COD in", values, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSltConCodNotIn(List<String> values) {
            addCriterion("SLT_CON_COD not in", values, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSltConCodBetween(String value1, String value2) {
            addCriterion("SLT_CON_COD between", value1, value2, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSltConCodNotBetween(String value1, String value2) {
            addCriterion("SLT_CON_COD not between", value1, value2, "sltConCod");
            return (Criteria) this;
        }

        public Criteria andSptConWekIsNull() {
            addCriterion("SPT_CON_WEK is null");
            return (Criteria) this;
        }

        public Criteria andSptConWekIsNotNull() {
            addCriterion("SPT_CON_WEK is not null");
            return (Criteria) this;
        }

        public Criteria andSptConWekEqualTo(Short value) {
            addCriterion("SPT_CON_WEK =", value, "sptConWek");
            return (Criteria) this;
        }

        public Criteria andSptConWekNotEqualTo(Short value) {
            addCriterion("SPT_CON_WEK <>", value, "sptConWek");
            return (Criteria) this;
        }

        public Criteria andSptConWekGreaterThan(Short value) {
            addCriterion("SPT_CON_WEK >", value, "sptConWek");
            return (Criteria) this;
        }

        public Criteria andSptConWekGreaterThanOrEqualTo(Short value) {
            addCriterion("SPT_CON_WEK >=", value, "sptConWek");
            return (Criteria) this;
        }

        public Criteria andSptConWekLessThan(Short value) {
            addCriterion("SPT_CON_WEK <", value, "sptConWek");
            return (Criteria) this;
        }

        public Criteria andSptConWekLessThanOrEqualTo(Short value) {
            addCriterion("SPT_CON_WEK <=", value, "sptConWek");
            return (Criteria) this;
        }

        public Criteria andSptConWekIn(List<Short> values) {
            addCriterion("SPT_CON_WEK in", values, "sptConWek");
            return (Criteria) this;
        }

        public Criteria andSptConWekNotIn(List<Short> values) {
            addCriterion("SPT_CON_WEK not in", values, "sptConWek");
            return (Criteria) this;
        }

        public Criteria andSptConWekBetween(Short value1, Short value2) {
            addCriterion("SPT_CON_WEK between", value1, value2, "sptConWek");
            return (Criteria) this;
        }

        public Criteria andSptConWekNotBetween(Short value1, Short value2) {
            addCriterion("SPT_CON_WEK not between", value1, value2, "sptConWek");
            return (Criteria) this;
        }

        public Criteria andSptConTimIsNull() {
            addCriterion("SPT_CON_TIM is null");
            return (Criteria) this;
        }

        public Criteria andSptConTimIsNotNull() {
            addCriterion("SPT_CON_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andSptConTimEqualTo(Short value) {
            addCriterion("SPT_CON_TIM =", value, "sptConTim");
            return (Criteria) this;
        }

        public Criteria andSptConTimNotEqualTo(Short value) {
            addCriterion("SPT_CON_TIM <>", value, "sptConTim");
            return (Criteria) this;
        }

        public Criteria andSptConTimGreaterThan(Short value) {
            addCriterion("SPT_CON_TIM >", value, "sptConTim");
            return (Criteria) this;
        }

        public Criteria andSptConTimGreaterThanOrEqualTo(Short value) {
            addCriterion("SPT_CON_TIM >=", value, "sptConTim");
            return (Criteria) this;
        }

        public Criteria andSptConTimLessThan(Short value) {
            addCriterion("SPT_CON_TIM <", value, "sptConTim");
            return (Criteria) this;
        }

        public Criteria andSptConTimLessThanOrEqualTo(Short value) {
            addCriterion("SPT_CON_TIM <=", value, "sptConTim");
            return (Criteria) this;
        }

        public Criteria andSptConTimIn(List<Short> values) {
            addCriterion("SPT_CON_TIM in", values, "sptConTim");
            return (Criteria) this;
        }

        public Criteria andSptConTimNotIn(List<Short> values) {
            addCriterion("SPT_CON_TIM not in", values, "sptConTim");
            return (Criteria) this;
        }

        public Criteria andSptConTimBetween(Short value1, Short value2) {
            addCriterion("SPT_CON_TIM between", value1, value2, "sptConTim");
            return (Criteria) this;
        }

        public Criteria andSptConTimNotBetween(Short value1, Short value2) {
            addCriterion("SPT_CON_TIM not between", value1, value2, "sptConTim");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodIsNull() {
            addCriterion("MTL_SET_COD is null");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodIsNotNull() {
            addCriterion("MTL_SET_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodEqualTo(String value) {
            addCriterion("MTL_SET_COD =", value, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodNotEqualTo(String value) {
            addCriterion("MTL_SET_COD <>", value, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodGreaterThan(String value) {
            addCriterion("MTL_SET_COD >", value, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodGreaterThanOrEqualTo(String value) {
            addCriterion("MTL_SET_COD >=", value, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodLessThan(String value) {
            addCriterion("MTL_SET_COD <", value, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodLessThanOrEqualTo(String value) {
            addCriterion("MTL_SET_COD <=", value, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodLike(String value) {
            addCriterion("MTL_SET_COD like", value, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodNotLike(String value) {
            addCriterion("MTL_SET_COD not like", value, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodIn(List<String> values) {
            addCriterion("MTL_SET_COD in", values, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodNotIn(List<String> values) {
            addCriterion("MTL_SET_COD not in", values, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodBetween(String value1, String value2) {
            addCriterion("MTL_SET_COD between", value1, value2, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andMtlSetCodNotBetween(String value1, String value2) {
            addCriterion("MTL_SET_COD not between", value1, value2, "mtlSetCod");
            return (Criteria) this;
        }

        public Criteria andComActCodIsNull() {
            addCriterion("COM_ACT_COD is null");
            return (Criteria) this;
        }

        public Criteria andComActCodIsNotNull() {
            addCriterion("COM_ACT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andComActCodEqualTo(String value) {
            addCriterion("COM_ACT_COD =", value, "comActCod");
            return (Criteria) this;
        }

        public Criteria andComActCodNotEqualTo(String value) {
            addCriterion("COM_ACT_COD <>", value, "comActCod");
            return (Criteria) this;
        }

        public Criteria andComActCodGreaterThan(String value) {
            addCriterion("COM_ACT_COD >", value, "comActCod");
            return (Criteria) this;
        }

        public Criteria andComActCodGreaterThanOrEqualTo(String value) {
            addCriterion("COM_ACT_COD >=", value, "comActCod");
            return (Criteria) this;
        }

        public Criteria andComActCodLessThan(String value) {
            addCriterion("COM_ACT_COD <", value, "comActCod");
            return (Criteria) this;
        }

        public Criteria andComActCodLessThanOrEqualTo(String value) {
            addCriterion("COM_ACT_COD <=", value, "comActCod");
            return (Criteria) this;
        }

        public Criteria andComActCodLike(String value) {
            addCriterion("COM_ACT_COD like", value, "comActCod");
            return (Criteria) this;
        }

        public Criteria andComActCodNotLike(String value) {
            addCriterion("COM_ACT_COD not like", value, "comActCod");
            return (Criteria) this;
        }

        public Criteria andComActCodIn(List<String> values) {
            addCriterion("COM_ACT_COD in", values, "comActCod");
            return (Criteria) this;
        }

        public Criteria andComActCodNotIn(List<String> values) {
            addCriterion("COM_ACT_COD not in", values, "comActCod");
            return (Criteria) this;
        }

        public Criteria andComActCodBetween(String value1, String value2) {
            addCriterion("COM_ACT_COD between", value1, value2, "comActCod");
            return (Criteria) this;
        }

        public Criteria andComActCodNotBetween(String value1, String value2) {
            addCriterion("COM_ACT_COD not between", value1, value2, "comActCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodIsNull() {
            addCriterion("ASS_EXM_COD is null");
            return (Criteria) this;
        }

        public Criteria andAssExmCodIsNotNull() {
            addCriterion("ASS_EXM_COD is not null");
            return (Criteria) this;
        }

        public Criteria andAssExmCodEqualTo(String value) {
            addCriterion("ASS_EXM_COD =", value, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodNotEqualTo(String value) {
            addCriterion("ASS_EXM_COD <>", value, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodGreaterThan(String value) {
            addCriterion("ASS_EXM_COD >", value, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodGreaterThanOrEqualTo(String value) {
            addCriterion("ASS_EXM_COD >=", value, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodLessThan(String value) {
            addCriterion("ASS_EXM_COD <", value, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodLessThanOrEqualTo(String value) {
            addCriterion("ASS_EXM_COD <=", value, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodLike(String value) {
            addCriterion("ASS_EXM_COD like", value, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodNotLike(String value) {
            addCriterion("ASS_EXM_COD not like", value, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodIn(List<String> values) {
            addCriterion("ASS_EXM_COD in", values, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodNotIn(List<String> values) {
            addCriterion("ASS_EXM_COD not in", values, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodBetween(String value1, String value2) {
            addCriterion("ASS_EXM_COD between", value1, value2, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andAssExmCodNotBetween(String value1, String value2) {
            addCriterion("ASS_EXM_COD not between", value1, value2, "assExmCod");
            return (Criteria) this;
        }

        public Criteria andExmRstIsNull() {
            addCriterion("EXM_RST is null");
            return (Criteria) this;
        }

        public Criteria andExmRstIsNotNull() {
            addCriterion("EXM_RST is not null");
            return (Criteria) this;
        }

        public Criteria andExmRstEqualTo(String value) {
            addCriterion("EXM_RST =", value, "exmRst");
            return (Criteria) this;
        }

        public Criteria andExmRstNotEqualTo(String value) {
            addCriterion("EXM_RST <>", value, "exmRst");
            return (Criteria) this;
        }

        public Criteria andExmRstGreaterThan(String value) {
            addCriterion("EXM_RST >", value, "exmRst");
            return (Criteria) this;
        }

        public Criteria andExmRstGreaterThanOrEqualTo(String value) {
            addCriterion("EXM_RST >=", value, "exmRst");
            return (Criteria) this;
        }

        public Criteria andExmRstLessThan(String value) {
            addCriterion("EXM_RST <", value, "exmRst");
            return (Criteria) this;
        }

        public Criteria andExmRstLessThanOrEqualTo(String value) {
            addCriterion("EXM_RST <=", value, "exmRst");
            return (Criteria) this;
        }

        public Criteria andExmRstLike(String value) {
            addCriterion("EXM_RST like", value, "exmRst");
            return (Criteria) this;
        }

        public Criteria andExmRstNotLike(String value) {
            addCriterion("EXM_RST not like", value, "exmRst");
            return (Criteria) this;
        }

        public Criteria andExmRstIn(List<String> values) {
            addCriterion("EXM_RST in", values, "exmRst");
            return (Criteria) this;
        }

        public Criteria andExmRstNotIn(List<String> values) {
            addCriterion("EXM_RST not in", values, "exmRst");
            return (Criteria) this;
        }

        public Criteria andExmRstBetween(String value1, String value2) {
            addCriterion("EXM_RST between", value1, value2, "exmRst");
            return (Criteria) this;
        }

        public Criteria andExmRstNotBetween(String value1, String value2) {
            addCriterion("EXM_RST not between", value1, value2, "exmRst");
            return (Criteria) this;
        }

        public Criteria andMedConIsNull() {
            addCriterion("MED_CON is null");
            return (Criteria) this;
        }

        public Criteria andMedConIsNotNull() {
            addCriterion("MED_CON is not null");
            return (Criteria) this;
        }

        public Criteria andMedConEqualTo(String value) {
            addCriterion("MED_CON =", value, "medCon");
            return (Criteria) this;
        }

        public Criteria andMedConNotEqualTo(String value) {
            addCriterion("MED_CON <>", value, "medCon");
            return (Criteria) this;
        }

        public Criteria andMedConGreaterThan(String value) {
            addCriterion("MED_CON >", value, "medCon");
            return (Criteria) this;
        }

        public Criteria andMedConGreaterThanOrEqualTo(String value) {
            addCriterion("MED_CON >=", value, "medCon");
            return (Criteria) this;
        }

        public Criteria andMedConLessThan(String value) {
            addCriterion("MED_CON <", value, "medCon");
            return (Criteria) this;
        }

        public Criteria andMedConLessThanOrEqualTo(String value) {
            addCriterion("MED_CON <=", value, "medCon");
            return (Criteria) this;
        }

        public Criteria andMedConLike(String value) {
            addCriterion("MED_CON like", value, "medCon");
            return (Criteria) this;
        }

        public Criteria andMedConNotLike(String value) {
            addCriterion("MED_CON not like", value, "medCon");
            return (Criteria) this;
        }

        public Criteria andMedConIn(List<String> values) {
            addCriterion("MED_CON in", values, "medCon");
            return (Criteria) this;
        }

        public Criteria andMedConNotIn(List<String> values) {
            addCriterion("MED_CON not in", values, "medCon");
            return (Criteria) this;
        }

        public Criteria andMedConBetween(String value1, String value2) {
            addCriterion("MED_CON between", value1, value2, "medCon");
            return (Criteria) this;
        }

        public Criteria andMedConNotBetween(String value1, String value2) {
            addCriterion("MED_CON not between", value1, value2, "medCon");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodIsNull() {
            addCriterion("COO_MBT_COD is null");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodIsNotNull() {
            addCriterion("COO_MBT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodEqualTo(String value) {
            addCriterion("COO_MBT_COD =", value, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodNotEqualTo(String value) {
            addCriterion("COO_MBT_COD <>", value, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodGreaterThan(String value) {
            addCriterion("COO_MBT_COD >", value, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodGreaterThanOrEqualTo(String value) {
            addCriterion("COO_MBT_COD >=", value, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodLessThan(String value) {
            addCriterion("COO_MBT_COD <", value, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodLessThanOrEqualTo(String value) {
            addCriterion("COO_MBT_COD <=", value, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodLike(String value) {
            addCriterion("COO_MBT_COD like", value, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodNotLike(String value) {
            addCriterion("COO_MBT_COD not like", value, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodIn(List<String> values) {
            addCriterion("COO_MBT_COD in", values, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodNotIn(List<String> values) {
            addCriterion("COO_MBT_COD not in", values, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodBetween(String value1, String value2) {
            addCriterion("COO_MBT_COD between", value1, value2, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andCooMbtCodNotBetween(String value1, String value2) {
            addCriterion("COO_MBT_COD not between", value1, value2, "cooMbtCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodIsNull() {
            addCriterion("SCD_VST_COD is null");
            return (Criteria) this;
        }

        public Criteria andScdVstCodIsNotNull() {
            addCriterion("SCD_VST_COD is not null");
            return (Criteria) this;
        }

        public Criteria andScdVstCodEqualTo(String value) {
            addCriterion("SCD_VST_COD =", value, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodNotEqualTo(String value) {
            addCriterion("SCD_VST_COD <>", value, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodGreaterThan(String value) {
            addCriterion("SCD_VST_COD >", value, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodGreaterThanOrEqualTo(String value) {
            addCriterion("SCD_VST_COD >=", value, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodLessThan(String value) {
            addCriterion("SCD_VST_COD <", value, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodLessThanOrEqualTo(String value) {
            addCriterion("SCD_VST_COD <=", value, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodLike(String value) {
            addCriterion("SCD_VST_COD like", value, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodNotLike(String value) {
            addCriterion("SCD_VST_COD not like", value, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodIn(List<String> values) {
            addCriterion("SCD_VST_COD in", values, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodNotIn(List<String> values) {
            addCriterion("SCD_VST_COD not in", values, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodBetween(String value1, String value2) {
            addCriterion("SCD_VST_COD between", value1, value2, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andScdVstCodNotBetween(String value1, String value2) {
            addCriterion("SCD_VST_COD not between", value1, value2, "scdVstCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodIsNull() {
            addCriterion("TAK_MED_COD is null");
            return (Criteria) this;
        }

        public Criteria andTakMedCodIsNotNull() {
            addCriterion("TAK_MED_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTakMedCodEqualTo(String value) {
            addCriterion("TAK_MED_COD =", value, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodNotEqualTo(String value) {
            addCriterion("TAK_MED_COD <>", value, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodGreaterThan(String value) {
            addCriterion("TAK_MED_COD >", value, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodGreaterThanOrEqualTo(String value) {
            addCriterion("TAK_MED_COD >=", value, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodLessThan(String value) {
            addCriterion("TAK_MED_COD <", value, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodLessThanOrEqualTo(String value) {
            addCriterion("TAK_MED_COD <=", value, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodLike(String value) {
            addCriterion("TAK_MED_COD like", value, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodNotLike(String value) {
            addCriterion("TAK_MED_COD not like", value, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodIn(List<String> values) {
            addCriterion("TAK_MED_COD in", values, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodNotIn(List<String> values) {
            addCriterion("TAK_MED_COD not in", values, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodBetween(String value1, String value2) {
            addCriterion("TAK_MED_COD between", value1, value2, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andTakMedCodNotBetween(String value1, String value2) {
            addCriterion("TAK_MED_COD not between", value1, value2, "takMedCod");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgIsNull() {
            addCriterion("MED_RFT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgIsNotNull() {
            addCriterion("MED_RFT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgEqualTo(String value) {
            addCriterion("MED_RFT_FLG =", value, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgNotEqualTo(String value) {
            addCriterion("MED_RFT_FLG <>", value, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgGreaterThan(String value) {
            addCriterion("MED_RFT_FLG >", value, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgGreaterThanOrEqualTo(String value) {
            addCriterion("MED_RFT_FLG >=", value, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgLessThan(String value) {
            addCriterion("MED_RFT_FLG <", value, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgLessThanOrEqualTo(String value) {
            addCriterion("MED_RFT_FLG <=", value, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgLike(String value) {
            addCriterion("MED_RFT_FLG like", value, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgNotLike(String value) {
            addCriterion("MED_RFT_FLG not like", value, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgIn(List<String> values) {
            addCriterion("MED_RFT_FLG in", values, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgNotIn(List<String> values) {
            addCriterion("MED_RFT_FLG not in", values, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgBetween(String value1, String value2) {
            addCriterion("MED_RFT_FLG between", value1, value2, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andMedRftFlgNotBetween(String value1, String value2) {
            addCriterion("MED_RFT_FLG not between", value1, value2, "medRftFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgIsNull() {
            addCriterion("HAV_BLD_FLG is null");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgIsNotNull() {
            addCriterion("HAV_BLD_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgEqualTo(String value) {
            addCriterion("HAV_BLD_FLG =", value, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgNotEqualTo(String value) {
            addCriterion("HAV_BLD_FLG <>", value, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgGreaterThan(String value) {
            addCriterion("HAV_BLD_FLG >", value, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgGreaterThanOrEqualTo(String value) {
            addCriterion("HAV_BLD_FLG >=", value, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgLessThan(String value) {
            addCriterion("HAV_BLD_FLG <", value, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgLessThanOrEqualTo(String value) {
            addCriterion("HAV_BLD_FLG <=", value, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgLike(String value) {
            addCriterion("HAV_BLD_FLG like", value, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgNotLike(String value) {
            addCriterion("HAV_BLD_FLG not like", value, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgIn(List<String> values) {
            addCriterion("HAV_BLD_FLG in", values, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgNotIn(List<String> values) {
            addCriterion("HAV_BLD_FLG not in", values, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgBetween(String value1, String value2) {
            addCriterion("HAV_BLD_FLG between", value1, value2, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andHavBldFlgNotBetween(String value1, String value2) {
            addCriterion("HAV_BLD_FLG not between", value1, value2, "havBldFlg");
            return (Criteria) this;
        }

        public Criteria andAddExpIsNull() {
            addCriterion("ADD_EXP is null");
            return (Criteria) this;
        }

        public Criteria andAddExpIsNotNull() {
            addCriterion("ADD_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andAddExpEqualTo(String value) {
            addCriterion("ADD_EXP =", value, "addExp");
            return (Criteria) this;
        }

        public Criteria andAddExpNotEqualTo(String value) {
            addCriterion("ADD_EXP <>", value, "addExp");
            return (Criteria) this;
        }

        public Criteria andAddExpGreaterThan(String value) {
            addCriterion("ADD_EXP >", value, "addExp");
            return (Criteria) this;
        }

        public Criteria andAddExpGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_EXP >=", value, "addExp");
            return (Criteria) this;
        }

        public Criteria andAddExpLessThan(String value) {
            addCriterion("ADD_EXP <", value, "addExp");
            return (Criteria) this;
        }

        public Criteria andAddExpLessThanOrEqualTo(String value) {
            addCriterion("ADD_EXP <=", value, "addExp");
            return (Criteria) this;
        }

        public Criteria andAddExpLike(String value) {
            addCriterion("ADD_EXP like", value, "addExp");
            return (Criteria) this;
        }

        public Criteria andAddExpNotLike(String value) {
            addCriterion("ADD_EXP not like", value, "addExp");
            return (Criteria) this;
        }

        public Criteria andAddExpIn(List<String> values) {
            addCriterion("ADD_EXP in", values, "addExp");
            return (Criteria) this;
        }

        public Criteria andAddExpNotIn(List<String> values) {
            addCriterion("ADD_EXP not in", values, "addExp");
            return (Criteria) this;
        }

        public Criteria andAddExpBetween(String value1, String value2) {
            addCriterion("ADD_EXP between", value1, value2, "addExp");
            return (Criteria) this;
        }

        public Criteria andAddExpNotBetween(String value1, String value2) {
            addCriterion("ADD_EXP not between", value1, value2, "addExp");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgIsNull() {
            addCriterion("FUV_AGN_FLG is null");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgIsNotNull() {
            addCriterion("FUV_AGN_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgEqualTo(String value) {
            addCriterion("FUV_AGN_FLG =", value, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgNotEqualTo(String value) {
            addCriterion("FUV_AGN_FLG <>", value, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgGreaterThan(String value) {
            addCriterion("FUV_AGN_FLG >", value, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgGreaterThanOrEqualTo(String value) {
            addCriterion("FUV_AGN_FLG >=", value, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgLessThan(String value) {
            addCriterion("FUV_AGN_FLG <", value, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgLessThanOrEqualTo(String value) {
            addCriterion("FUV_AGN_FLG <=", value, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgLike(String value) {
            addCriterion("FUV_AGN_FLG like", value, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgNotLike(String value) {
            addCriterion("FUV_AGN_FLG not like", value, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgIn(List<String> values) {
            addCriterion("FUV_AGN_FLG in", values, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgNotIn(List<String> values) {
            addCriterion("FUV_AGN_FLG not in", values, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgBetween(String value1, String value2) {
            addCriterion("FUV_AGN_FLG between", value1, value2, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andFuvAgnFlgNotBetween(String value1, String value2) {
            addCriterion("FUV_AGN_FLG not between", value1, value2, "fuvAgnFlg");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimIsNull() {
            addCriterion("NXT_FUV_TIM is null");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimIsNotNull() {
            addCriterion("NXT_FUV_TIM is not null");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimEqualTo(Date value) {
            addCriterion("NXT_FUV_TIM =", value, "nxtFuvTim");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimNotEqualTo(Date value) {
            addCriterion("NXT_FUV_TIM <>", value, "nxtFuvTim");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimGreaterThan(Date value) {
            addCriterion("NXT_FUV_TIM >", value, "nxtFuvTim");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimGreaterThanOrEqualTo(Date value) {
            addCriterion("NXT_FUV_TIM >=", value, "nxtFuvTim");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimLessThan(Date value) {
            addCriterion("NXT_FUV_TIM <", value, "nxtFuvTim");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimLessThanOrEqualTo(Date value) {
            addCriterion("NXT_FUV_TIM <=", value, "nxtFuvTim");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimIn(List<Date> values) {
            addCriterion("NXT_FUV_TIM in", values, "nxtFuvTim");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimNotIn(List<Date> values) {
            addCriterion("NXT_FUV_TIM not in", values, "nxtFuvTim");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimBetween(Date value1, Date value2) {
            addCriterion("NXT_FUV_TIM between", value1, value2, "nxtFuvTim");
            return (Criteria) this;
        }

        public Criteria andNxtFuvTimNotBetween(Date value1, Date value2) {
            addCriterion("NXT_FUV_TIM not between", value1, value2, "nxtFuvTim");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpIsNull() {
            addCriterion("NXT_FUV_GRP is null");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpIsNotNull() {
            addCriterion("NXT_FUV_GRP is not null");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpEqualTo(String value) {
            addCriterion("NXT_FUV_GRP =", value, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpNotEqualTo(String value) {
            addCriterion("NXT_FUV_GRP <>", value, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpGreaterThan(String value) {
            addCriterion("NXT_FUV_GRP >", value, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpGreaterThanOrEqualTo(String value) {
            addCriterion("NXT_FUV_GRP >=", value, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpLessThan(String value) {
            addCriterion("NXT_FUV_GRP <", value, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpLessThanOrEqualTo(String value) {
            addCriterion("NXT_FUV_GRP <=", value, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpLike(String value) {
            addCriterion("NXT_FUV_GRP like", value, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpNotLike(String value) {
            addCriterion("NXT_FUV_GRP not like", value, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpIn(List<String> values) {
            addCriterion("NXT_FUV_GRP in", values, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpNotIn(List<String> values) {
            addCriterion("NXT_FUV_GRP not in", values, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpBetween(String value1, String value2) {
            addCriterion("NXT_FUV_GRP between", value1, value2, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvGrpNotBetween(String value1, String value2) {
            addCriterion("NXT_FUV_GRP not between", value1, value2, "nxtFuvGrp");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocIsNull() {
            addCriterion("NXT_FUV_DOC is null");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocIsNotNull() {
            addCriterion("NXT_FUV_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocEqualTo(String value) {
            addCriterion("NXT_FUV_DOC =", value, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocNotEqualTo(String value) {
            addCriterion("NXT_FUV_DOC <>", value, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocGreaterThan(String value) {
            addCriterion("NXT_FUV_DOC >", value, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocGreaterThanOrEqualTo(String value) {
            addCriterion("NXT_FUV_DOC >=", value, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocLessThan(String value) {
            addCriterion("NXT_FUV_DOC <", value, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocLessThanOrEqualTo(String value) {
            addCriterion("NXT_FUV_DOC <=", value, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocLike(String value) {
            addCriterion("NXT_FUV_DOC like", value, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocNotLike(String value) {
            addCriterion("NXT_FUV_DOC not like", value, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocIn(List<String> values) {
            addCriterion("NXT_FUV_DOC in", values, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocNotIn(List<String> values) {
            addCriterion("NXT_FUV_DOC not in", values, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocBetween(String value1, String value2) {
            addCriterion("NXT_FUV_DOC between", value1, value2, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andNxtFuvDocNotBetween(String value1, String value2) {
            addCriterion("NXT_FUV_DOC not between", value1, value2, "nxtFuvDoc");
            return (Criteria) this;
        }

        public Criteria andPatCooIsNull() {
            addCriterion("PAT_COO is null");
            return (Criteria) this;
        }

        public Criteria andPatCooIsNotNull() {
            addCriterion("PAT_COO is not null");
            return (Criteria) this;
        }

        public Criteria andPatCooEqualTo(Short value) {
            addCriterion("PAT_COO =", value, "patCoo");
            return (Criteria) this;
        }

        public Criteria andPatCooNotEqualTo(Short value) {
            addCriterion("PAT_COO <>", value, "patCoo");
            return (Criteria) this;
        }

        public Criteria andPatCooGreaterThan(Short value) {
            addCriterion("PAT_COO >", value, "patCoo");
            return (Criteria) this;
        }

        public Criteria andPatCooGreaterThanOrEqualTo(Short value) {
            addCriterion("PAT_COO >=", value, "patCoo");
            return (Criteria) this;
        }

        public Criteria andPatCooLessThan(Short value) {
            addCriterion("PAT_COO <", value, "patCoo");
            return (Criteria) this;
        }

        public Criteria andPatCooLessThanOrEqualTo(Short value) {
            addCriterion("PAT_COO <=", value, "patCoo");
            return (Criteria) this;
        }

        public Criteria andPatCooIn(List<Short> values) {
            addCriterion("PAT_COO in", values, "patCoo");
            return (Criteria) this;
        }

        public Criteria andPatCooNotIn(List<Short> values) {
            addCriterion("PAT_COO not in", values, "patCoo");
            return (Criteria) this;
        }

        public Criteria andPatCooBetween(Short value1, Short value2) {
            addCriterion("PAT_COO between", value1, value2, "patCoo");
            return (Criteria) this;
        }

        public Criteria andPatCooNotBetween(Short value1, Short value2) {
            addCriterion("PAT_COO not between", value1, value2, "patCoo");
            return (Criteria) this;
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