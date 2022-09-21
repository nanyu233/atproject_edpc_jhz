package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspCxfxpgbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspCxfxpgbExample() {
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

        public Criteria andRiskSeqIsNull() {
            addCriterion("RISK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andRiskSeqIsNotNull() {
            addCriterion("RISK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRiskSeqEqualTo(String value) {
            addCriterion("RISK_SEQ =", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqNotEqualTo(String value) {
            addCriterion("RISK_SEQ <>", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqGreaterThan(String value) {
            addCriterion("RISK_SEQ >", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_SEQ >=", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqLessThan(String value) {
            addCriterion("RISK_SEQ <", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqLessThanOrEqualTo(String value) {
            addCriterion("RISK_SEQ <=", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqLike(String value) {
            addCriterion("RISK_SEQ like", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqNotLike(String value) {
            addCriterion("RISK_SEQ not like", value, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqIn(List<String> values) {
            addCriterion("RISK_SEQ in", values, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqNotIn(List<String> values) {
            addCriterion("RISK_SEQ not in", values, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqBetween(String value1, String value2) {
            addCriterion("RISK_SEQ between", value1, value2, "riskSeq");
            return (Criteria) this;
        }

        public Criteria andRiskSeqNotBetween(String value1, String value2) {
            addCriterion("RISK_SEQ not between", value1, value2, "riskSeq");
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

        public Criteria andHighrisk1IsNull() {
            addCriterion("HIGHRISK1 is null");
            return (Criteria) this;
        }

        public Criteria andHighrisk1IsNotNull() {
            addCriterion("HIGHRISK1 is not null");
            return (Criteria) this;
        }

        public Criteria andHighrisk1EqualTo(String value) {
            addCriterion("HIGHRISK1 =", value, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk1NotEqualTo(String value) {
            addCriterion("HIGHRISK1 <>", value, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk1GreaterThan(String value) {
            addCriterion("HIGHRISK1 >", value, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk1GreaterThanOrEqualTo(String value) {
            addCriterion("HIGHRISK1 >=", value, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk1LessThan(String value) {
            addCriterion("HIGHRISK1 <", value, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk1LessThanOrEqualTo(String value) {
            addCriterion("HIGHRISK1 <=", value, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk1Like(String value) {
            addCriterion("HIGHRISK1 like", value, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk1NotLike(String value) {
            addCriterion("HIGHRISK1 not like", value, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk1In(List<String> values) {
            addCriterion("HIGHRISK1 in", values, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk1NotIn(List<String> values) {
            addCriterion("HIGHRISK1 not in", values, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk1Between(String value1, String value2) {
            addCriterion("HIGHRISK1 between", value1, value2, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk1NotBetween(String value1, String value2) {
            addCriterion("HIGHRISK1 not between", value1, value2, "highrisk1");
            return (Criteria) this;
        }

        public Criteria andHighrisk2IsNull() {
            addCriterion("HIGHRISK2 is null");
            return (Criteria) this;
        }

        public Criteria andHighrisk2IsNotNull() {
            addCriterion("HIGHRISK2 is not null");
            return (Criteria) this;
        }

        public Criteria andHighrisk2EqualTo(String value) {
            addCriterion("HIGHRISK2 =", value, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andHighrisk2NotEqualTo(String value) {
            addCriterion("HIGHRISK2 <>", value, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andHighrisk2GreaterThan(String value) {
            addCriterion("HIGHRISK2 >", value, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andHighrisk2GreaterThanOrEqualTo(String value) {
            addCriterion("HIGHRISK2 >=", value, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andHighrisk2LessThan(String value) {
            addCriterion("HIGHRISK2 <", value, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andHighrisk2LessThanOrEqualTo(String value) {
            addCriterion("HIGHRISK2 <=", value, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andHighrisk2Like(String value) {
            addCriterion("HIGHRISK2 like", value, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andHighrisk2NotLike(String value) {
            addCriterion("HIGHRISK2 not like", value, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andHighrisk2In(List<String> values) {
            addCriterion("HIGHRISK2 in", values, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andHighrisk2NotIn(List<String> values) {
            addCriterion("HIGHRISK2 not in", values, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andHighrisk2Between(String value1, String value2) {
            addCriterion("HIGHRISK2 between", value1, value2, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andHighrisk2NotBetween(String value1, String value2) {
            addCriterion("HIGHRISK2 not between", value1, value2, "highrisk2");
            return (Criteria) this;
        }

        public Criteria andAssresultIsNull() {
            addCriterion("ASSRESULT is null");
            return (Criteria) this;
        }

        public Criteria andAssresultIsNotNull() {
            addCriterion("ASSRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAssresultEqualTo(String value) {
            addCriterion("ASSRESULT =", value, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssresultNotEqualTo(String value) {
            addCriterion("ASSRESULT <>", value, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssresultGreaterThan(String value) {
            addCriterion("ASSRESULT >", value, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssresultGreaterThanOrEqualTo(String value) {
            addCriterion("ASSRESULT >=", value, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssresultLessThan(String value) {
            addCriterion("ASSRESULT <", value, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssresultLessThanOrEqualTo(String value) {
            addCriterion("ASSRESULT <=", value, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssresultLike(String value) {
            addCriterion("ASSRESULT like", value, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssresultNotLike(String value) {
            addCriterion("ASSRESULT not like", value, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssresultIn(List<String> values) {
            addCriterion("ASSRESULT in", values, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssresultNotIn(List<String> values) {
            addCriterion("ASSRESULT not in", values, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssresultBetween(String value1, String value2) {
            addCriterion("ASSRESULT between", value1, value2, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssresultNotBetween(String value1, String value2) {
            addCriterion("ASSRESULT not between", value1, value2, "assresult");
            return (Criteria) this;
        }

        public Criteria andAssessDocIsNull() {
            addCriterion("ASSESS_DOC is null");
            return (Criteria) this;
        }

        public Criteria andAssessDocIsNotNull() {
            addCriterion("ASSESS_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andAssessDocEqualTo(String value) {
            addCriterion("ASSESS_DOC =", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotEqualTo(String value) {
            addCriterion("ASSESS_DOC <>", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocGreaterThan(String value) {
            addCriterion("ASSESS_DOC >", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_DOC >=", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocLessThan(String value) {
            addCriterion("ASSESS_DOC <", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_DOC <=", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocLike(String value) {
            addCriterion("ASSESS_DOC like", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotLike(String value) {
            addCriterion("ASSESS_DOC not like", value, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocIn(List<String> values) {
            addCriterion("ASSESS_DOC in", values, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotIn(List<String> values) {
            addCriterion("ASSESS_DOC not in", values, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocBetween(String value1, String value2) {
            addCriterion("ASSESS_DOC between", value1, value2, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNotBetween(String value1, String value2) {
            addCriterion("ASSESS_DOC not between", value1, value2, "assessDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDateIsNull() {
            addCriterion("ASSESS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAssessDateIsNotNull() {
            addCriterion("ASSESS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAssessDateEqualTo(String value) {
            addCriterion("ASSESS_DATE =", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotEqualTo(String value) {
            addCriterion("ASSESS_DATE <>", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateGreaterThan(String value) {
            addCriterion("ASSESS_DATE >", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_DATE >=", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateLessThan(String value) {
            addCriterion("ASSESS_DATE <", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_DATE <=", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateLike(String value) {
            addCriterion("ASSESS_DATE like", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotLike(String value) {
            addCriterion("ASSESS_DATE not like", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateIn(List<String> values) {
            addCriterion("ASSESS_DATE in", values, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotIn(List<String> values) {
            addCriterion("ASSESS_DATE not in", values, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateBetween(String value1, String value2) {
            addCriterion("ASSESS_DATE between", value1, value2, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotBetween(String value1, String value2) {
            addCriterion("ASSESS_DATE not between", value1, value2, "assessDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreateDocIsNull() {
            addCriterion("CREATE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andCreateDocIsNotNull() {
            addCriterion("CREATE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDocEqualTo(String value) {
            addCriterion("CREATE_DOC =", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotEqualTo(String value) {
            addCriterion("CREATE_DOC <>", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocGreaterThan(String value) {
            addCriterion("CREATE_DOC >", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DOC >=", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLessThan(String value) {
            addCriterion("CREATE_DOC <", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DOC <=", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocLike(String value) {
            addCriterion("CREATE_DOC like", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotLike(String value) {
            addCriterion("CREATE_DOC not like", value, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocIn(List<String> values) {
            addCriterion("CREATE_DOC in", values, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotIn(List<String> values) {
            addCriterion("CREATE_DOC not in", values, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocBetween(String value1, String value2) {
            addCriterion("CREATE_DOC between", value1, value2, "createDoc");
            return (Criteria) this;
        }

        public Criteria andCreateDocNotBetween(String value1, String value2) {
            addCriterion("CREATE_DOC not between", value1, value2, "createDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIsNull() {
            addCriterion("UPDATE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIsNotNull() {
            addCriterion("UPDATE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDocEqualTo(String value) {
            addCriterion("UPDATE_DOC =", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotEqualTo(String value) {
            addCriterion("UPDATE_DOC <>", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocGreaterThan(String value) {
            addCriterion("UPDATE_DOC >", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DOC >=", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLessThan(String value) {
            addCriterion("UPDATE_DOC <", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DOC <=", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocLike(String value) {
            addCriterion("UPDATE_DOC like", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotLike(String value) {
            addCriterion("UPDATE_DOC not like", value, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocIn(List<String> values) {
            addCriterion("UPDATE_DOC in", values, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotIn(List<String> values) {
            addCriterion("UPDATE_DOC not in", values, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocBetween(String value1, String value2) {
            addCriterion("UPDATE_DOC between", value1, value2, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andUpdateDocNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DOC not between", value1, value2, "updateDoc");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamIsNull() {
            addCriterion("ASSESS_DOC_NAM is null");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamIsNotNull() {
            addCriterion("ASSESS_DOC_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamEqualTo(String value) {
            addCriterion("ASSESS_DOC_NAM =", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamNotEqualTo(String value) {
            addCriterion("ASSESS_DOC_NAM <>", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamGreaterThan(String value) {
            addCriterion("ASSESS_DOC_NAM >", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_DOC_NAM >=", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamLessThan(String value) {
            addCriterion("ASSESS_DOC_NAM <", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_DOC_NAM <=", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamLike(String value) {
            addCriterion("ASSESS_DOC_NAM like", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamNotLike(String value) {
            addCriterion("ASSESS_DOC_NAM not like", value, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamIn(List<String> values) {
            addCriterion("ASSESS_DOC_NAM in", values, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamNotIn(List<String> values) {
            addCriterion("ASSESS_DOC_NAM not in", values, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamBetween(String value1, String value2) {
            addCriterion("ASSESS_DOC_NAM between", value1, value2, "assessDocNam");
            return (Criteria) this;
        }

        public Criteria andAssessDocNamNotBetween(String value1, String value2) {
            addCriterion("ASSESS_DOC_NAM not between", value1, value2, "assessDocNam");
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