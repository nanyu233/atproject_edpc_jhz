package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HspSjxtpgInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspSjxtpgInfExample() {
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

        public Criteria andXtpgSeqIsNull() {
            addCriterion("XTPG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIsNotNull() {
            addCriterion("XTPG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqEqualTo(String value) {
            addCriterion("XTPG_SEQ =", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotEqualTo(String value) {
            addCriterion("XTPG_SEQ <>", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThan(String value) {
            addCriterion("XTPG_SEQ >", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqGreaterThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ >=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThan(String value) {
            addCriterion("XTPG_SEQ <", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLessThanOrEqualTo(String value) {
            addCriterion("XTPG_SEQ <=", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqLike(String value) {
            addCriterion("XTPG_SEQ like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotLike(String value) {
            addCriterion("XTPG_SEQ not like", value, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqIn(List<String> values) {
            addCriterion("XTPG_SEQ in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotIn(List<String> values) {
            addCriterion("XTPG_SEQ not in", values, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ between", value1, value2, "xtpgSeq");
            return (Criteria) this;
        }

        public Criteria andXtpgSeqNotBetween(String value1, String value2) {
            addCriterion("XTPG_SEQ not between", value1, value2, "xtpgSeq");
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

        public Criteria andSjxtpgYsCodIsNull() {
            addCriterion("SJXTPG_YS_COD is null");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodIsNotNull() {
            addCriterion("SJXTPG_YS_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodEqualTo(String value) {
            addCriterion("SJXTPG_YS_COD =", value, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodNotEqualTo(String value) {
            addCriterion("SJXTPG_YS_COD <>", value, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodGreaterThan(String value) {
            addCriterion("SJXTPG_YS_COD >", value, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodGreaterThanOrEqualTo(String value) {
            addCriterion("SJXTPG_YS_COD >=", value, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodLessThan(String value) {
            addCriterion("SJXTPG_YS_COD <", value, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodLessThanOrEqualTo(String value) {
            addCriterion("SJXTPG_YS_COD <=", value, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodLike(String value) {
            addCriterion("SJXTPG_YS_COD like", value, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodNotLike(String value) {
            addCriterion("SJXTPG_YS_COD not like", value, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodIn(List<String> values) {
            addCriterion("SJXTPG_YS_COD in", values, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodNotIn(List<String> values) {
            addCriterion("SJXTPG_YS_COD not in", values, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodBetween(String value1, String value2) {
            addCriterion("SJXTPG_YS_COD between", value1, value2, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYsCodNotBetween(String value1, String value2) {
            addCriterion("SJXTPG_YS_COD not between", value1, value2, "sjxtpgYsCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodIsNull() {
            addCriterion("SJXTPG_YSSUB_COD is null");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodIsNotNull() {
            addCriterion("SJXTPG_YSSUB_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodEqualTo(String value) {
            addCriterion("SJXTPG_YSSUB_COD =", value, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodNotEqualTo(String value) {
            addCriterion("SJXTPG_YSSUB_COD <>", value, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodGreaterThan(String value) {
            addCriterion("SJXTPG_YSSUB_COD >", value, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodGreaterThanOrEqualTo(String value) {
            addCriterion("SJXTPG_YSSUB_COD >=", value, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodLessThan(String value) {
            addCriterion("SJXTPG_YSSUB_COD <", value, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodLessThanOrEqualTo(String value) {
            addCriterion("SJXTPG_YSSUB_COD <=", value, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodLike(String value) {
            addCriterion("SJXTPG_YSSUB_COD like", value, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodNotLike(String value) {
            addCriterion("SJXTPG_YSSUB_COD not like", value, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodIn(List<String> values) {
            addCriterion("SJXTPG_YSSUB_COD in", values, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodNotIn(List<String> values) {
            addCriterion("SJXTPG_YSSUB_COD not in", values, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodBetween(String value1, String value2) {
            addCriterion("SJXTPG_YSSUB_COD between", value1, value2, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodNotBetween(String value1, String value2) {
            addCriterion("SJXTPG_YSSUB_COD not between", value1, value2, "sjxtpgYssubCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodIsNull() {
            addCriterion("SJXTPG_YY_COD is null");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodIsNotNull() {
            addCriterion("SJXTPG_YY_COD is not null");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodEqualTo(String value) {
            addCriterion("SJXTPG_YY_COD =", value, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodNotEqualTo(String value) {
            addCriterion("SJXTPG_YY_COD <>", value, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodGreaterThan(String value) {
            addCriterion("SJXTPG_YY_COD >", value, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodGreaterThanOrEqualTo(String value) {
            addCriterion("SJXTPG_YY_COD >=", value, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodLessThan(String value) {
            addCriterion("SJXTPG_YY_COD <", value, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodLessThanOrEqualTo(String value) {
            addCriterion("SJXTPG_YY_COD <=", value, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodLike(String value) {
            addCriterion("SJXTPG_YY_COD like", value, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodNotLike(String value) {
            addCriterion("SJXTPG_YY_COD not like", value, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodIn(List<String> values) {
            addCriterion("SJXTPG_YY_COD in", values, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodNotIn(List<String> values) {
            addCriterion("SJXTPG_YY_COD not in", values, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodBetween(String value1, String value2) {
            addCriterion("SJXTPG_YY_COD between", value1, value2, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYyCodNotBetween(String value1, String value2) {
            addCriterion("SJXTPG_YY_COD not between", value1, value2, "sjxtpgYyCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjIsNull() {
            addCriterion("TK_LEFTTK_ZJ is null");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjIsNotNull() {
            addCriterion("TK_LEFTTK_ZJ is not null");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjEqualTo(BigDecimal value) {
            addCriterion("TK_LEFTTK_ZJ =", value, "tkLefttkZj");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjNotEqualTo(BigDecimal value) {
            addCriterion("TK_LEFTTK_ZJ <>", value, "tkLefttkZj");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjGreaterThan(BigDecimal value) {
            addCriterion("TK_LEFTTK_ZJ >", value, "tkLefttkZj");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TK_LEFTTK_ZJ >=", value, "tkLefttkZj");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjLessThan(BigDecimal value) {
            addCriterion("TK_LEFTTK_ZJ <", value, "tkLefttkZj");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TK_LEFTTK_ZJ <=", value, "tkLefttkZj");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjIn(List<BigDecimal> values) {
            addCriterion("TK_LEFTTK_ZJ in", values, "tkLefttkZj");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjNotIn(List<BigDecimal> values) {
            addCriterion("TK_LEFTTK_ZJ not in", values, "tkLefttkZj");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TK_LEFTTK_ZJ between", value1, value2, "tkLefttkZj");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TK_LEFTTK_ZJ not between", value1, value2, "tkLefttkZj");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodIsNull() {
            addCriterion("TK_LEFTTK_ZT_COD is null");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodIsNotNull() {
            addCriterion("TK_LEFTTK_ZT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodEqualTo(String value) {
            addCriterion("TK_LEFTTK_ZT_COD =", value, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodNotEqualTo(String value) {
            addCriterion("TK_LEFTTK_ZT_COD <>", value, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodGreaterThan(String value) {
            addCriterion("TK_LEFTTK_ZT_COD >", value, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodGreaterThanOrEqualTo(String value) {
            addCriterion("TK_LEFTTK_ZT_COD >=", value, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodLessThan(String value) {
            addCriterion("TK_LEFTTK_ZT_COD <", value, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodLessThanOrEqualTo(String value) {
            addCriterion("TK_LEFTTK_ZT_COD <=", value, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodLike(String value) {
            addCriterion("TK_LEFTTK_ZT_COD like", value, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodNotLike(String value) {
            addCriterion("TK_LEFTTK_ZT_COD not like", value, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodIn(List<String> values) {
            addCriterion("TK_LEFTTK_ZT_COD in", values, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodNotIn(List<String> values) {
            addCriterion("TK_LEFTTK_ZT_COD not in", values, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodBetween(String value1, String value2) {
            addCriterion("TK_LEFTTK_ZT_COD between", value1, value2, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkLefttkZtCodNotBetween(String value1, String value2) {
            addCriterion("TK_LEFTTK_ZT_COD not between", value1, value2, "tkLefttkZtCod");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyIsNull() {
            addCriterion("LEFT_TB_DGFY is null");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyIsNotNull() {
            addCriterion("LEFT_TB_DGFY is not null");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyEqualTo(String value) {
            addCriterion("LEFT_TB_DGFY =", value, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyNotEqualTo(String value) {
            addCriterion("LEFT_TB_DGFY <>", value, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyGreaterThan(String value) {
            addCriterion("LEFT_TB_DGFY >", value, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyGreaterThanOrEqualTo(String value) {
            addCriterion("LEFT_TB_DGFY >=", value, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyLessThan(String value) {
            addCriterion("LEFT_TB_DGFY <", value, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyLessThanOrEqualTo(String value) {
            addCriterion("LEFT_TB_DGFY <=", value, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyLike(String value) {
            addCriterion("LEFT_TB_DGFY like", value, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyNotLike(String value) {
            addCriterion("LEFT_TB_DGFY not like", value, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyIn(List<String> values) {
            addCriterion("LEFT_TB_DGFY in", values, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyNotIn(List<String> values) {
            addCriterion("LEFT_TB_DGFY not in", values, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyBetween(String value1, String value2) {
            addCriterion("LEFT_TB_DGFY between", value1, value2, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftTbDgfyNotBetween(String value1, String value2) {
            addCriterion("LEFT_TB_DGFY not between", value1, value2, "leftTbDgfy");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjIsNull() {
            addCriterion("TK_RIGHTTK_ZJ is null");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjIsNotNull() {
            addCriterion("TK_RIGHTTK_ZJ is not null");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjEqualTo(BigDecimal value) {
            addCriterion("TK_RIGHTTK_ZJ =", value, "tkRighttkZj");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjNotEqualTo(BigDecimal value) {
            addCriterion("TK_RIGHTTK_ZJ <>", value, "tkRighttkZj");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjGreaterThan(BigDecimal value) {
            addCriterion("TK_RIGHTTK_ZJ >", value, "tkRighttkZj");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TK_RIGHTTK_ZJ >=", value, "tkRighttkZj");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjLessThan(BigDecimal value) {
            addCriterion("TK_RIGHTTK_ZJ <", value, "tkRighttkZj");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TK_RIGHTTK_ZJ <=", value, "tkRighttkZj");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjIn(List<BigDecimal> values) {
            addCriterion("TK_RIGHTTK_ZJ in", values, "tkRighttkZj");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjNotIn(List<BigDecimal> values) {
            addCriterion("TK_RIGHTTK_ZJ not in", values, "tkRighttkZj");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TK_RIGHTTK_ZJ between", value1, value2, "tkRighttkZj");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TK_RIGHTTK_ZJ not between", value1, value2, "tkRighttkZj");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodIsNull() {
            addCriterion("TK_RIGHTTK_ZT_COD is null");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodIsNotNull() {
            addCriterion("TK_RIGHTTK_ZT_COD is not null");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodEqualTo(String value) {
            addCriterion("TK_RIGHTTK_ZT_COD =", value, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodNotEqualTo(String value) {
            addCriterion("TK_RIGHTTK_ZT_COD <>", value, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodGreaterThan(String value) {
            addCriterion("TK_RIGHTTK_ZT_COD >", value, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodGreaterThanOrEqualTo(String value) {
            addCriterion("TK_RIGHTTK_ZT_COD >=", value, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodLessThan(String value) {
            addCriterion("TK_RIGHTTK_ZT_COD <", value, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodLessThanOrEqualTo(String value) {
            addCriterion("TK_RIGHTTK_ZT_COD <=", value, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodLike(String value) {
            addCriterion("TK_RIGHTTK_ZT_COD like", value, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodNotLike(String value) {
            addCriterion("TK_RIGHTTK_ZT_COD not like", value, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodIn(List<String> values) {
            addCriterion("TK_RIGHTTK_ZT_COD in", values, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodNotIn(List<String> values) {
            addCriterion("TK_RIGHTTK_ZT_COD not in", values, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodBetween(String value1, String value2) {
            addCriterion("TK_RIGHTTK_ZT_COD between", value1, value2, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andTkRighttkZtCodNotBetween(String value1, String value2) {
            addCriterion("TK_RIGHTTK_ZT_COD not between", value1, value2, "tkRighttkZtCod");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyIsNull() {
            addCriterion("RIGHT_TB_DGFY is null");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyIsNotNull() {
            addCriterion("RIGHT_TB_DGFY is not null");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyEqualTo(String value) {
            addCriterion("RIGHT_TB_DGFY =", value, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyNotEqualTo(String value) {
            addCriterion("RIGHT_TB_DGFY <>", value, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyGreaterThan(String value) {
            addCriterion("RIGHT_TB_DGFY >", value, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHT_TB_DGFY >=", value, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyLessThan(String value) {
            addCriterion("RIGHT_TB_DGFY <", value, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyLessThanOrEqualTo(String value) {
            addCriterion("RIGHT_TB_DGFY <=", value, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyLike(String value) {
            addCriterion("RIGHT_TB_DGFY like", value, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyNotLike(String value) {
            addCriterion("RIGHT_TB_DGFY not like", value, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyIn(List<String> values) {
            addCriterion("RIGHT_TB_DGFY in", values, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyNotIn(List<String> values) {
            addCriterion("RIGHT_TB_DGFY not in", values, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyBetween(String value1, String value2) {
            addCriterion("RIGHT_TB_DGFY between", value1, value2, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andRightTbDgfyNotBetween(String value1, String value2) {
            addCriterion("RIGHT_TB_DGFY not between", value1, value2, "rightTbDgfy");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodIsNull() {
            addCriterion("LEFTS_JZ_SZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodIsNotNull() {
            addCriterion("LEFTS_JZ_SZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodEqualTo(String value) {
            addCriterion("LEFTS_JZ_SZ_COD =", value, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodNotEqualTo(String value) {
            addCriterion("LEFTS_JZ_SZ_COD <>", value, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodGreaterThan(String value) {
            addCriterion("LEFTS_JZ_SZ_COD >", value, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodGreaterThanOrEqualTo(String value) {
            addCriterion("LEFTS_JZ_SZ_COD >=", value, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodLessThan(String value) {
            addCriterion("LEFTS_JZ_SZ_COD <", value, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodLessThanOrEqualTo(String value) {
            addCriterion("LEFTS_JZ_SZ_COD <=", value, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodLike(String value) {
            addCriterion("LEFTS_JZ_SZ_COD like", value, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodNotLike(String value) {
            addCriterion("LEFTS_JZ_SZ_COD not like", value, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodIn(List<String> values) {
            addCriterion("LEFTS_JZ_SZ_COD in", values, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodNotIn(List<String> values) {
            addCriterion("LEFTS_JZ_SZ_COD not in", values, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodBetween(String value1, String value2) {
            addCriterion("LEFTS_JZ_SZ_COD between", value1, value2, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsJzSzCodNotBetween(String value1, String value2) {
            addCriterion("LEFTS_JZ_SZ_COD not between", value1, value2, "leftsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodIsNull() {
            addCriterion("RIGHTS_JZ_SZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodIsNotNull() {
            addCriterion("RIGHTS_JZ_SZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodEqualTo(String value) {
            addCriterion("RIGHTS_JZ_SZ_COD =", value, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodNotEqualTo(String value) {
            addCriterion("RIGHTS_JZ_SZ_COD <>", value, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodGreaterThan(String value) {
            addCriterion("RIGHTS_JZ_SZ_COD >", value, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTS_JZ_SZ_COD >=", value, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodLessThan(String value) {
            addCriterion("RIGHTS_JZ_SZ_COD <", value, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodLessThanOrEqualTo(String value) {
            addCriterion("RIGHTS_JZ_SZ_COD <=", value, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodLike(String value) {
            addCriterion("RIGHTS_JZ_SZ_COD like", value, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodNotLike(String value) {
            addCriterion("RIGHTS_JZ_SZ_COD not like", value, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodIn(List<String> values) {
            addCriterion("RIGHTS_JZ_SZ_COD in", values, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodNotIn(List<String> values) {
            addCriterion("RIGHTS_JZ_SZ_COD not in", values, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodBetween(String value1, String value2) {
            addCriterion("RIGHTS_JZ_SZ_COD between", value1, value2, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightsJzSzCodNotBetween(String value1, String value2) {
            addCriterion("RIGHTS_JZ_SZ_COD not between", value1, value2, "rightsJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodIsNull() {
            addCriterion("LEFTX_JZ_SZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodIsNotNull() {
            addCriterion("LEFTX_JZ_SZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodEqualTo(String value) {
            addCriterion("LEFTX_JZ_SZ_COD =", value, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodNotEqualTo(String value) {
            addCriterion("LEFTX_JZ_SZ_COD <>", value, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodGreaterThan(String value) {
            addCriterion("LEFTX_JZ_SZ_COD >", value, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodGreaterThanOrEqualTo(String value) {
            addCriterion("LEFTX_JZ_SZ_COD >=", value, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodLessThan(String value) {
            addCriterion("LEFTX_JZ_SZ_COD <", value, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodLessThanOrEqualTo(String value) {
            addCriterion("LEFTX_JZ_SZ_COD <=", value, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodLike(String value) {
            addCriterion("LEFTX_JZ_SZ_COD like", value, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodNotLike(String value) {
            addCriterion("LEFTX_JZ_SZ_COD not like", value, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodIn(List<String> values) {
            addCriterion("LEFTX_JZ_SZ_COD in", values, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodNotIn(List<String> values) {
            addCriterion("LEFTX_JZ_SZ_COD not in", values, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodBetween(String value1, String value2) {
            addCriterion("LEFTX_JZ_SZ_COD between", value1, value2, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftxJzSzCodNotBetween(String value1, String value2) {
            addCriterion("LEFTX_JZ_SZ_COD not between", value1, value2, "leftxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodIsNull() {
            addCriterion("RIGHTX_JZ_SZ_COD is null");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodIsNotNull() {
            addCriterion("RIGHTX_JZ_SZ_COD is not null");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodEqualTo(String value) {
            addCriterion("RIGHTX_JZ_SZ_COD =", value, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodNotEqualTo(String value) {
            addCriterion("RIGHTX_JZ_SZ_COD <>", value, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodGreaterThan(String value) {
            addCriterion("RIGHTX_JZ_SZ_COD >", value, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTX_JZ_SZ_COD >=", value, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodLessThan(String value) {
            addCriterion("RIGHTX_JZ_SZ_COD <", value, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodLessThanOrEqualTo(String value) {
            addCriterion("RIGHTX_JZ_SZ_COD <=", value, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodLike(String value) {
            addCriterion("RIGHTX_JZ_SZ_COD like", value, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodNotLike(String value) {
            addCriterion("RIGHTX_JZ_SZ_COD not like", value, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodIn(List<String> values) {
            addCriterion("RIGHTX_JZ_SZ_COD in", values, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodNotIn(List<String> values) {
            addCriterion("RIGHTX_JZ_SZ_COD not in", values, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodBetween(String value1, String value2) {
            addCriterion("RIGHTX_JZ_SZ_COD between", value1, value2, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andRightxJzSzCodNotBetween(String value1, String value2) {
            addCriterion("RIGHTX_JZ_SZ_COD not between", value1, value2, "rightxJzSzCod");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlIsNull() {
            addCriterion("LEFTS_SJ_JZL is null");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlIsNotNull() {
            addCriterion("LEFTS_SJ_JZL is not null");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlEqualTo(String value) {
            addCriterion("LEFTS_SJ_JZL =", value, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlNotEqualTo(String value) {
            addCriterion("LEFTS_SJ_JZL <>", value, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlGreaterThan(String value) {
            addCriterion("LEFTS_SJ_JZL >", value, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlGreaterThanOrEqualTo(String value) {
            addCriterion("LEFTS_SJ_JZL >=", value, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlLessThan(String value) {
            addCriterion("LEFTS_SJ_JZL <", value, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlLessThanOrEqualTo(String value) {
            addCriterion("LEFTS_SJ_JZL <=", value, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlLike(String value) {
            addCriterion("LEFTS_SJ_JZL like", value, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlNotLike(String value) {
            addCriterion("LEFTS_SJ_JZL not like", value, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlIn(List<String> values) {
            addCriterion("LEFTS_SJ_JZL in", values, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlNotIn(List<String> values) {
            addCriterion("LEFTS_SJ_JZL not in", values, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlBetween(String value1, String value2) {
            addCriterion("LEFTS_SJ_JZL between", value1, value2, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftsSjJzlNotBetween(String value1, String value2) {
            addCriterion("LEFTS_SJ_JZL not between", value1, value2, "leftsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlIsNull() {
            addCriterion("RIGHTS_SJ_JZL is null");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlIsNotNull() {
            addCriterion("RIGHTS_SJ_JZL is not null");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlEqualTo(String value) {
            addCriterion("RIGHTS_SJ_JZL =", value, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlNotEqualTo(String value) {
            addCriterion("RIGHTS_SJ_JZL <>", value, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlGreaterThan(String value) {
            addCriterion("RIGHTS_SJ_JZL >", value, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTS_SJ_JZL >=", value, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlLessThan(String value) {
            addCriterion("RIGHTS_SJ_JZL <", value, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlLessThanOrEqualTo(String value) {
            addCriterion("RIGHTS_SJ_JZL <=", value, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlLike(String value) {
            addCriterion("RIGHTS_SJ_JZL like", value, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlNotLike(String value) {
            addCriterion("RIGHTS_SJ_JZL not like", value, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlIn(List<String> values) {
            addCriterion("RIGHTS_SJ_JZL in", values, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlNotIn(List<String> values) {
            addCriterion("RIGHTS_SJ_JZL not in", values, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlBetween(String value1, String value2) {
            addCriterion("RIGHTS_SJ_JZL between", value1, value2, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightsSjJzlNotBetween(String value1, String value2) {
            addCriterion("RIGHTS_SJ_JZL not between", value1, value2, "rightsSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlIsNull() {
            addCriterion("LEFTX_SJ_JZL is null");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlIsNotNull() {
            addCriterion("LEFTX_SJ_JZL is not null");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlEqualTo(String value) {
            addCriterion("LEFTX_SJ_JZL =", value, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlNotEqualTo(String value) {
            addCriterion("LEFTX_SJ_JZL <>", value, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlGreaterThan(String value) {
            addCriterion("LEFTX_SJ_JZL >", value, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlGreaterThanOrEqualTo(String value) {
            addCriterion("LEFTX_SJ_JZL >=", value, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlLessThan(String value) {
            addCriterion("LEFTX_SJ_JZL <", value, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlLessThanOrEqualTo(String value) {
            addCriterion("LEFTX_SJ_JZL <=", value, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlLike(String value) {
            addCriterion("LEFTX_SJ_JZL like", value, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlNotLike(String value) {
            addCriterion("LEFTX_SJ_JZL not like", value, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlIn(List<String> values) {
            addCriterion("LEFTX_SJ_JZL in", values, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlNotIn(List<String> values) {
            addCriterion("LEFTX_SJ_JZL not in", values, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlBetween(String value1, String value2) {
            addCriterion("LEFTX_SJ_JZL between", value1, value2, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andLeftxSjJzlNotBetween(String value1, String value2) {
            addCriterion("LEFTX_SJ_JZL not between", value1, value2, "leftxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlIsNull() {
            addCriterion("RIGHTX_SJ_JZL is null");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlIsNotNull() {
            addCriterion("RIGHTX_SJ_JZL is not null");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlEqualTo(String value) {
            addCriterion("RIGHTX_SJ_JZL =", value, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlNotEqualTo(String value) {
            addCriterion("RIGHTX_SJ_JZL <>", value, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlGreaterThan(String value) {
            addCriterion("RIGHTX_SJ_JZL >", value, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTX_SJ_JZL >=", value, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlLessThan(String value) {
            addCriterion("RIGHTX_SJ_JZL <", value, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlLessThanOrEqualTo(String value) {
            addCriterion("RIGHTX_SJ_JZL <=", value, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlLike(String value) {
            addCriterion("RIGHTX_SJ_JZL like", value, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlNotLike(String value) {
            addCriterion("RIGHTX_SJ_JZL not like", value, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlIn(List<String> values) {
            addCriterion("RIGHTX_SJ_JZL in", values, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlNotIn(List<String> values) {
            addCriterion("RIGHTX_SJ_JZL not in", values, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlBetween(String value1, String value2) {
            addCriterion("RIGHTX_SJ_JZL between", value1, value2, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andRightxSjJzlNotBetween(String value1, String value2) {
            addCriterion("RIGHTX_SJ_JZL not between", value1, value2, "rightxSjJzl");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoIsNull() {
            addCriterion("SJXTPG_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoIsNotNull() {
            addCriterion("SJXTPG_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoEqualTo(String value) {
            addCriterion("SJXTPG_MEMO =", value, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoNotEqualTo(String value) {
            addCriterion("SJXTPG_MEMO <>", value, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoGreaterThan(String value) {
            addCriterion("SJXTPG_MEMO >", value, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoGreaterThanOrEqualTo(String value) {
            addCriterion("SJXTPG_MEMO >=", value, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoLessThan(String value) {
            addCriterion("SJXTPG_MEMO <", value, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoLessThanOrEqualTo(String value) {
            addCriterion("SJXTPG_MEMO <=", value, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoLike(String value) {
            addCriterion("SJXTPG_MEMO like", value, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoNotLike(String value) {
            addCriterion("SJXTPG_MEMO not like", value, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoIn(List<String> values) {
            addCriterion("SJXTPG_MEMO in", values, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoNotIn(List<String> values) {
            addCriterion("SJXTPG_MEMO not in", values, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoBetween(String value1, String value2) {
            addCriterion("SJXTPG_MEMO between", value1, value2, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgMemoNotBetween(String value1, String value2) {
            addCriterion("SJXTPG_MEMO not between", value1, value2, "sjxtpgMemo");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbIsNull() {
            addCriterion("SJXTPG_YSSUB_CODB is null");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbIsNotNull() {
            addCriterion("SJXTPG_YSSUB_CODB is not null");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbEqualTo(String value) {
            addCriterion("SJXTPG_YSSUB_CODB =", value, "sjxtpgYssubCodb");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbNotEqualTo(String value) {
            addCriterion("SJXTPG_YSSUB_CODB <>", value, "sjxtpgYssubCodb");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbGreaterThan(String value) {
            addCriterion("SJXTPG_YSSUB_CODB >", value, "sjxtpgYssubCodb");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbGreaterThanOrEqualTo(String value) {
            addCriterion("SJXTPG_YSSUB_CODB >=", value, "sjxtpgYssubCodb");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbLessThan(String value) {
            addCriterion("SJXTPG_YSSUB_CODB <", value, "sjxtpgYssubCodb");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbLessThanOrEqualTo(String value) {
            addCriterion("SJXTPG_YSSUB_CODB <=", value, "sjxtpgYssubCodb");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbLike(String value) {
            addCriterion("SJXTPG_YSSUB_CODB like", value, "sjxtpgYssubCodb");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbNotLike(String value) {
            addCriterion("SJXTPG_YSSUB_CODB not like", value, "sjxtpgYssubCodb");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbIn(List<String> values) {
            addCriterion("SJXTPG_YSSUB_CODB in", values, "sjxtpgYssubCodb");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbNotIn(List<String> values) {
            addCriterion("SJXTPG_YSSUB_CODB not in", values, "sjxtpgYssubCodb");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbBetween(String value1, String value2) {
            addCriterion("SJXTPG_YSSUB_CODB between", value1, value2, "sjxtpgYssubCodb");
            return (Criteria) this;
        }

        public Criteria andSjxtpgYssubCodbNotBetween(String value1, String value2) {
            addCriterion("SJXTPG_YSSUB_CODB not between", value1, value2, "sjxtpgYssubCodb");
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