package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.List;

public class HspCsabcDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCsabcDefExample() {
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

        public Criteria andAbcPrtIsNull() {
            addCriterion("ABC_PRT is null");
            return (Criteria) this;
        }

        public Criteria andAbcPrtIsNotNull() {
            addCriterion("ABC_PRT is not null");
            return (Criteria) this;
        }

        public Criteria andAbcPrtEqualTo(String value) {
            addCriterion("ABC_PRT =", value, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andAbcPrtNotEqualTo(String value) {
            addCriterion("ABC_PRT <>", value, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andAbcPrtGreaterThan(String value) {
            addCriterion("ABC_PRT >", value, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andAbcPrtGreaterThanOrEqualTo(String value) {
            addCriterion("ABC_PRT >=", value, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andAbcPrtLessThan(String value) {
            addCriterion("ABC_PRT <", value, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andAbcPrtLessThanOrEqualTo(String value) {
            addCriterion("ABC_PRT <=", value, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andAbcPrtLike(String value) {
            addCriterion("ABC_PRT like", value, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andAbcPrtNotLike(String value) {
            addCriterion("ABC_PRT not like", value, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andAbcPrtIn(List<String> values) {
            addCriterion("ABC_PRT in", values, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andAbcPrtNotIn(List<String> values) {
            addCriterion("ABC_PRT not in", values, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andAbcPrtBetween(String value1, String value2) {
            addCriterion("ABC_PRT between", value1, value2, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andAbcPrtNotBetween(String value1, String value2) {
            addCriterion("ABC_PRT not between", value1, value2, "abcPrt");
            return (Criteria) this;
        }

        public Criteria andFldTypIsNull() {
            addCriterion("FLD_TYP is null");
            return (Criteria) this;
        }

        public Criteria andFldTypIsNotNull() {
            addCriterion("FLD_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andFldTypEqualTo(String value) {
            addCriterion("FLD_TYP =", value, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldTypNotEqualTo(String value) {
            addCriterion("FLD_TYP <>", value, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldTypGreaterThan(String value) {
            addCriterion("FLD_TYP >", value, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldTypGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_TYP >=", value, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldTypLessThan(String value) {
            addCriterion("FLD_TYP <", value, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldTypLessThanOrEqualTo(String value) {
            addCriterion("FLD_TYP <=", value, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldTypLike(String value) {
            addCriterion("FLD_TYP like", value, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldTypNotLike(String value) {
            addCriterion("FLD_TYP not like", value, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldTypIn(List<String> values) {
            addCriterion("FLD_TYP in", values, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldTypNotIn(List<String> values) {
            addCriterion("FLD_TYP not in", values, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldTypBetween(String value1, String value2) {
            addCriterion("FLD_TYP between", value1, value2, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldTypNotBetween(String value1, String value2) {
            addCriterion("FLD_TYP not between", value1, value2, "fldTyp");
            return (Criteria) this;
        }

        public Criteria andFldCodIsNull() {
            addCriterion("FLD_COD is null");
            return (Criteria) this;
        }

        public Criteria andFldCodIsNotNull() {
            addCriterion("FLD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andFldCodEqualTo(String value) {
            addCriterion("FLD_COD =", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodNotEqualTo(String value) {
            addCriterion("FLD_COD <>", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodGreaterThan(String value) {
            addCriterion("FLD_COD >", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_COD >=", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodLessThan(String value) {
            addCriterion("FLD_COD <", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodLessThanOrEqualTo(String value) {
            addCriterion("FLD_COD <=", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodLike(String value) {
            addCriterion("FLD_COD like", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodNotLike(String value) {
            addCriterion("FLD_COD not like", value, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodIn(List<String> values) {
            addCriterion("FLD_COD in", values, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodNotIn(List<String> values) {
            addCriterion("FLD_COD not in", values, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodBetween(String value1, String value2) {
            addCriterion("FLD_COD between", value1, value2, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldCodNotBetween(String value1, String value2) {
            addCriterion("FLD_COD not between", value1, value2, "fldCod");
            return (Criteria) this;
        }

        public Criteria andFldNmeIsNull() {
            addCriterion("FLD_NME is null");
            return (Criteria) this;
        }

        public Criteria andFldNmeIsNotNull() {
            addCriterion("FLD_NME is not null");
            return (Criteria) this;
        }

        public Criteria andFldNmeEqualTo(String value) {
            addCriterion("FLD_NME =", value, "fldNme");
            return (Criteria) this;
        }

        public Criteria andFldNmeNotEqualTo(String value) {
            addCriterion("FLD_NME <>", value, "fldNme");
            return (Criteria) this;
        }

        public Criteria andFldNmeGreaterThan(String value) {
            addCriterion("FLD_NME >", value, "fldNme");
            return (Criteria) this;
        }

        public Criteria andFldNmeGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_NME >=", value, "fldNme");
            return (Criteria) this;
        }

        public Criteria andFldNmeLessThan(String value) {
            addCriterion("FLD_NME <", value, "fldNme");
            return (Criteria) this;
        }

        public Criteria andFldNmeLessThanOrEqualTo(String value) {
            addCriterion("FLD_NME <=", value, "fldNme");
            return (Criteria) this;
        }

        public Criteria andFldNmeLike(String value) {
            addCriterion("FLD_NME like", value, "fldNme");
            return (Criteria) this;
        }

        public Criteria andFldNmeNotLike(String value) {
            addCriterion("FLD_NME not like", value, "fldNme");
            return (Criteria) this;
        }

        public Criteria andFldNmeIn(List<String> values) {
            addCriterion("FLD_NME in", values, "fldNme");
            return (Criteria) this;
        }

        public Criteria andFldNmeNotIn(List<String> values) {
            addCriterion("FLD_NME not in", values, "fldNme");
            return (Criteria) this;
        }

        public Criteria andFldNmeBetween(String value1, String value2) {
            addCriterion("FLD_NME between", value1, value2, "fldNme");
            return (Criteria) this;
        }

        public Criteria andFldNmeNotBetween(String value1, String value2) {
            addCriterion("FLD_NME not between", value1, value2, "fldNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeIsNull() {
            addCriterion("LST_NME is null");
            return (Criteria) this;
        }

        public Criteria andLstNmeIsNotNull() {
            addCriterion("LST_NME is not null");
            return (Criteria) this;
        }

        public Criteria andLstNmeEqualTo(String value) {
            addCriterion("LST_NME =", value, "lstNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeNotEqualTo(String value) {
            addCriterion("LST_NME <>", value, "lstNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeGreaterThan(String value) {
            addCriterion("LST_NME >", value, "lstNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeGreaterThanOrEqualTo(String value) {
            addCriterion("LST_NME >=", value, "lstNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeLessThan(String value) {
            addCriterion("LST_NME <", value, "lstNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeLessThanOrEqualTo(String value) {
            addCriterion("LST_NME <=", value, "lstNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeLike(String value) {
            addCriterion("LST_NME like", value, "lstNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeNotLike(String value) {
            addCriterion("LST_NME not like", value, "lstNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeIn(List<String> values) {
            addCriterion("LST_NME in", values, "lstNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeNotIn(List<String> values) {
            addCriterion("LST_NME not in", values, "lstNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeBetween(String value1, String value2) {
            addCriterion("LST_NME between", value1, value2, "lstNme");
            return (Criteria) this;
        }

        public Criteria andLstNmeNotBetween(String value1, String value2) {
            addCriterion("LST_NME not between", value1, value2, "lstNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeIsNull() {
            addCriterion("VAR_NME is null");
            return (Criteria) this;
        }

        public Criteria andVarNmeIsNotNull() {
            addCriterion("VAR_NME is not null");
            return (Criteria) this;
        }

        public Criteria andVarNmeEqualTo(String value) {
            addCriterion("VAR_NME =", value, "varNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeNotEqualTo(String value) {
            addCriterion("VAR_NME <>", value, "varNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeGreaterThan(String value) {
            addCriterion("VAR_NME >", value, "varNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeGreaterThanOrEqualTo(String value) {
            addCriterion("VAR_NME >=", value, "varNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeLessThan(String value) {
            addCriterion("VAR_NME <", value, "varNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeLessThanOrEqualTo(String value) {
            addCriterion("VAR_NME <=", value, "varNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeLike(String value) {
            addCriterion("VAR_NME like", value, "varNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeNotLike(String value) {
            addCriterion("VAR_NME not like", value, "varNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeIn(List<String> values) {
            addCriterion("VAR_NME in", values, "varNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeNotIn(List<String> values) {
            addCriterion("VAR_NME not in", values, "varNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeBetween(String value1, String value2) {
            addCriterion("VAR_NME between", value1, value2, "varNme");
            return (Criteria) this;
        }

        public Criteria andVarNmeNotBetween(String value1, String value2) {
            addCriterion("VAR_NME not between", value1, value2, "varNme");
            return (Criteria) this;
        }

        public Criteria andMemCodIsNull() {
            addCriterion("MEM_COD is null");
            return (Criteria) this;
        }

        public Criteria andMemCodIsNotNull() {
            addCriterion("MEM_COD is not null");
            return (Criteria) this;
        }

        public Criteria andMemCodEqualTo(String value) {
            addCriterion("MEM_COD =", value, "memCod");
            return (Criteria) this;
        }

        public Criteria andMemCodNotEqualTo(String value) {
            addCriterion("MEM_COD <>", value, "memCod");
            return (Criteria) this;
        }

        public Criteria andMemCodGreaterThan(String value) {
            addCriterion("MEM_COD >", value, "memCod");
            return (Criteria) this;
        }

        public Criteria andMemCodGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_COD >=", value, "memCod");
            return (Criteria) this;
        }

        public Criteria andMemCodLessThan(String value) {
            addCriterion("MEM_COD <", value, "memCod");
            return (Criteria) this;
        }

        public Criteria andMemCodLessThanOrEqualTo(String value) {
            addCriterion("MEM_COD <=", value, "memCod");
            return (Criteria) this;
        }

        public Criteria andMemCodLike(String value) {
            addCriterion("MEM_COD like", value, "memCod");
            return (Criteria) this;
        }

        public Criteria andMemCodNotLike(String value) {
            addCriterion("MEM_COD not like", value, "memCod");
            return (Criteria) this;
        }

        public Criteria andMemCodIn(List<String> values) {
            addCriterion("MEM_COD in", values, "memCod");
            return (Criteria) this;
        }

        public Criteria andMemCodNotIn(List<String> values) {
            addCriterion("MEM_COD not in", values, "memCod");
            return (Criteria) this;
        }

        public Criteria andMemCodBetween(String value1, String value2) {
            addCriterion("MEM_COD between", value1, value2, "memCod");
            return (Criteria) this;
        }

        public Criteria andMemCodNotBetween(String value1, String value2) {
            addCriterion("MEM_COD not between", value1, value2, "memCod");
            return (Criteria) this;
        }

        public Criteria andAstTypIsNull() {
            addCriterion("AST_TYP is null");
            return (Criteria) this;
        }

        public Criteria andAstTypIsNotNull() {
            addCriterion("AST_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andAstTypEqualTo(String value) {
            addCriterion("AST_TYP =", value, "astTyp");
            return (Criteria) this;
        }

        public Criteria andAstTypNotEqualTo(String value) {
            addCriterion("AST_TYP <>", value, "astTyp");
            return (Criteria) this;
        }

        public Criteria andAstTypGreaterThan(String value) {
            addCriterion("AST_TYP >", value, "astTyp");
            return (Criteria) this;
        }

        public Criteria andAstTypGreaterThanOrEqualTo(String value) {
            addCriterion("AST_TYP >=", value, "astTyp");
            return (Criteria) this;
        }

        public Criteria andAstTypLessThan(String value) {
            addCriterion("AST_TYP <", value, "astTyp");
            return (Criteria) this;
        }

        public Criteria andAstTypLessThanOrEqualTo(String value) {
            addCriterion("AST_TYP <=", value, "astTyp");
            return (Criteria) this;
        }

        public Criteria andAstTypLike(String value) {
            addCriterion("AST_TYP like", value, "astTyp");
            return (Criteria) this;
        }

        public Criteria andAstTypNotLike(String value) {
            addCriterion("AST_TYP not like", value, "astTyp");
            return (Criteria) this;
        }

        public Criteria andAstTypIn(List<String> values) {
            addCriterion("AST_TYP in", values, "astTyp");
            return (Criteria) this;
        }

        public Criteria andAstTypNotIn(List<String> values) {
            addCriterion("AST_TYP not in", values, "astTyp");
            return (Criteria) this;
        }

        public Criteria andAstTypBetween(String value1, String value2) {
            addCriterion("AST_TYP between", value1, value2, "astTyp");
            return (Criteria) this;
        }

        public Criteria andAstTypNotBetween(String value1, String value2) {
            addCriterion("AST_TYP not between", value1, value2, "astTyp");
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