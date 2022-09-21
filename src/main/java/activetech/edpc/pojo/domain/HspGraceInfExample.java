package activetech.edpc.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspGraceInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspGraceInfExample() {
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

        public Criteria andGraceSeqIsNull() {
            addCriterion("GRACE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andGraceSeqIsNotNull() {
            addCriterion("GRACE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andGraceSeqEqualTo(String value) {
            addCriterion("GRACE_SEQ =", value, "graceSeq");
            return (Criteria) this;
        }

        public Criteria andGraceSeqNotEqualTo(String value) {
            addCriterion("GRACE_SEQ <>", value, "graceSeq");
            return (Criteria) this;
        }

        public Criteria andGraceSeqGreaterThan(String value) {
            addCriterion("GRACE_SEQ >", value, "graceSeq");
            return (Criteria) this;
        }

        public Criteria andGraceSeqGreaterThanOrEqualTo(String value) {
            addCriterion("GRACE_SEQ >=", value, "graceSeq");
            return (Criteria) this;
        }

        public Criteria andGraceSeqLessThan(String value) {
            addCriterion("GRACE_SEQ <", value, "graceSeq");
            return (Criteria) this;
        }

        public Criteria andGraceSeqLessThanOrEqualTo(String value) {
            addCriterion("GRACE_SEQ <=", value, "graceSeq");
            return (Criteria) this;
        }

        public Criteria andGraceSeqLike(String value) {
            addCriterion("GRACE_SEQ like", value, "graceSeq");
            return (Criteria) this;
        }

        public Criteria andGraceSeqNotLike(String value) {
            addCriterion("GRACE_SEQ not like", value, "graceSeq");
            return (Criteria) this;
        }

        public Criteria andGraceSeqIn(List<String> values) {
            addCriterion("GRACE_SEQ in", values, "graceSeq");
            return (Criteria) this;
        }

        public Criteria andGraceSeqNotIn(List<String> values) {
            addCriterion("GRACE_SEQ not in", values, "graceSeq");
            return (Criteria) this;
        }

        public Criteria andGraceSeqBetween(String value1, String value2) {
            addCriterion("GRACE_SEQ between", value1, value2, "graceSeq");
            return (Criteria) this;
        }

        public Criteria andGraceSeqNotBetween(String value1, String value2) {
            addCriterion("GRACE_SEQ not between", value1, value2, "graceSeq");
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

        public Criteria andWxysIsNull() {
            addCriterion("WXYS is null");
            return (Criteria) this;
        }

        public Criteria andWxysIsNotNull() {
            addCriterion("WXYS is not null");
            return (Criteria) this;
        }

        public Criteria andWxysEqualTo(String value) {
            addCriterion("WXYS =", value, "wxys");
            return (Criteria) this;
        }

        public Criteria andWxysNotEqualTo(String value) {
            addCriterion("WXYS <>", value, "wxys");
            return (Criteria) this;
        }

        public Criteria andWxysGreaterThan(String value) {
            addCriterion("WXYS >", value, "wxys");
            return (Criteria) this;
        }

        public Criteria andWxysGreaterThanOrEqualTo(String value) {
            addCriterion("WXYS >=", value, "wxys");
            return (Criteria) this;
        }

        public Criteria andWxysLessThan(String value) {
            addCriterion("WXYS <", value, "wxys");
            return (Criteria) this;
        }

        public Criteria andWxysLessThanOrEqualTo(String value) {
            addCriterion("WXYS <=", value, "wxys");
            return (Criteria) this;
        }

        public Criteria andWxysLike(String value) {
            addCriterion("WXYS like", value, "wxys");
            return (Criteria) this;
        }

        public Criteria andWxysNotLike(String value) {
            addCriterion("WXYS not like", value, "wxys");
            return (Criteria) this;
        }

        public Criteria andWxysIn(List<String> values) {
            addCriterion("WXYS in", values, "wxys");
            return (Criteria) this;
        }

        public Criteria andWxysNotIn(List<String> values) {
            addCriterion("WXYS not in", values, "wxys");
            return (Criteria) this;
        }

        public Criteria andWxysBetween(String value1, String value2) {
            addCriterion("WXYS between", value1, value2, "wxys");
            return (Criteria) this;
        }

        public Criteria andWxysNotBetween(String value1, String value2) {
            addCriterion("WXYS not between", value1, value2, "wxys");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjIsNull() {
            addCriterion("GRACEJGWTJ is null");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjIsNotNull() {
            addCriterion("GRACEJGWTJ is not null");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjEqualTo(String value) {
            addCriterion("GRACEJGWTJ =", value, "gracejgwtj");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjNotEqualTo(String value) {
            addCriterion("GRACEJGWTJ <>", value, "gracejgwtj");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjGreaterThan(String value) {
            addCriterion("GRACEJGWTJ >", value, "gracejgwtj");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjGreaterThanOrEqualTo(String value) {
            addCriterion("GRACEJGWTJ >=", value, "gracejgwtj");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjLessThan(String value) {
            addCriterion("GRACEJGWTJ <", value, "gracejgwtj");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjLessThanOrEqualTo(String value) {
            addCriterion("GRACEJGWTJ <=", value, "gracejgwtj");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjLike(String value) {
            addCriterion("GRACEJGWTJ like", value, "gracejgwtj");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjNotLike(String value) {
            addCriterion("GRACEJGWTJ not like", value, "gracejgwtj");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjIn(List<String> values) {
            addCriterion("GRACEJGWTJ in", values, "gracejgwtj");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjNotIn(List<String> values) {
            addCriterion("GRACEJGWTJ not in", values, "gracejgwtj");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjBetween(String value1, String value2) {
            addCriterion("GRACEJGWTJ between", value1, value2, "gracejgwtj");
            return (Criteria) this;
        }

        public Criteria andGracejgwtjNotBetween(String value1, String value2) {
            addCriterion("GRACEJGWTJ not between", value1, value2, "gracejgwtj");
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

        public Criteria andJgdbIsNull() {
            addCriterion("JGDB is null");
            return (Criteria) this;
        }

        public Criteria andJgdbIsNotNull() {
            addCriterion("JGDB is not null");
            return (Criteria) this;
        }

        public Criteria andJgdbEqualTo(String value) {
            addCriterion("JGDB =", value, "jgdb");
            return (Criteria) this;
        }

        public Criteria andJgdbNotEqualTo(String value) {
            addCriterion("JGDB <>", value, "jgdb");
            return (Criteria) this;
        }

        public Criteria andJgdbGreaterThan(String value) {
            addCriterion("JGDB >", value, "jgdb");
            return (Criteria) this;
        }

        public Criteria andJgdbGreaterThanOrEqualTo(String value) {
            addCriterion("JGDB >=", value, "jgdb");
            return (Criteria) this;
        }

        public Criteria andJgdbLessThan(String value) {
            addCriterion("JGDB <", value, "jgdb");
            return (Criteria) this;
        }

        public Criteria andJgdbLessThanOrEqualTo(String value) {
            addCriterion("JGDB <=", value, "jgdb");
            return (Criteria) this;
        }

        public Criteria andJgdbLike(String value) {
            addCriterion("JGDB like", value, "jgdb");
            return (Criteria) this;
        }

        public Criteria andJgdbNotLike(String value) {
            addCriterion("JGDB not like", value, "jgdb");
            return (Criteria) this;
        }

        public Criteria andJgdbIn(List<String> values) {
            addCriterion("JGDB in", values, "jgdb");
            return (Criteria) this;
        }

        public Criteria andJgdbNotIn(List<String> values) {
            addCriterion("JGDB not in", values, "jgdb");
            return (Criteria) this;
        }

        public Criteria andJgdbBetween(String value1, String value2) {
            addCriterion("JGDB between", value1, value2, "jgdb");
            return (Criteria) this;
        }

        public Criteria andJgdbNotBetween(String value1, String value2) {
            addCriterion("JGDB not between", value1, value2, "jgdb");
            return (Criteria) this;
        }

        public Criteria andKillipIsNull() {
            addCriterion("KILLIP is null");
            return (Criteria) this;
        }

        public Criteria andKillipIsNotNull() {
            addCriterion("KILLIP is not null");
            return (Criteria) this;
        }

        public Criteria andKillipEqualTo(String value) {
            addCriterion("KILLIP =", value, "killip");
            return (Criteria) this;
        }

        public Criteria andKillipNotEqualTo(String value) {
            addCriterion("KILLIP <>", value, "killip");
            return (Criteria) this;
        }

        public Criteria andKillipGreaterThan(String value) {
            addCriterion("KILLIP >", value, "killip");
            return (Criteria) this;
        }

        public Criteria andKillipGreaterThanOrEqualTo(String value) {
            addCriterion("KILLIP >=", value, "killip");
            return (Criteria) this;
        }

        public Criteria andKillipLessThan(String value) {
            addCriterion("KILLIP <", value, "killip");
            return (Criteria) this;
        }

        public Criteria andKillipLessThanOrEqualTo(String value) {
            addCriterion("KILLIP <=", value, "killip");
            return (Criteria) this;
        }

        public Criteria andKillipLike(String value) {
            addCriterion("KILLIP like", value, "killip");
            return (Criteria) this;
        }

        public Criteria andKillipNotLike(String value) {
            addCriterion("KILLIP not like", value, "killip");
            return (Criteria) this;
        }

        public Criteria andKillipIn(List<String> values) {
            addCriterion("KILLIP in", values, "killip");
            return (Criteria) this;
        }

        public Criteria andKillipNotIn(List<String> values) {
            addCriterion("KILLIP not in", values, "killip");
            return (Criteria) this;
        }

        public Criteria andKillipBetween(String value1, String value2) {
            addCriterion("KILLIP between", value1, value2, "killip");
            return (Criteria) this;
        }

        public Criteria andKillipNotBetween(String value1, String value2) {
            addCriterion("KILLIP not between", value1, value2, "killip");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Short value) {
            addCriterion("TOTAL =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Short value) {
            addCriterion("TOTAL <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Short value) {
            addCriterion("TOTAL >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Short value) {
            addCriterion("TOTAL >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Short value) {
            addCriterion("TOTAL <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Short value) {
            addCriterion("TOTAL <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Short> values) {
            addCriterion("TOTAL in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Short> values) {
            addCriterion("TOTAL not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Short value1, Short value2) {
            addCriterion("TOTAL between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Short value1, Short value2) {
            addCriterion("TOTAL not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNull() {
            addCriterion("CRT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNotNull() {
            addCriterion("CRT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDateEqualTo(Date value) {
            addCriterion("CRT_DATE =", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotEqualTo(Date value) {
            addCriterion("CRT_DATE <>", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThan(Date value) {
            addCriterion("CRT_DATE >", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_DATE >=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThan(Date value) {
            addCriterion("CRT_DATE <", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThanOrEqualTo(Date value) {
            addCriterion("CRT_DATE <=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateIn(List<Date> values) {
            addCriterion("CRT_DATE in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotIn(List<Date> values) {
            addCriterion("CRT_DATE not in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateBetween(Date value1, Date value2) {
            addCriterion("CRT_DATE between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotBetween(Date value1, Date value2) {
            addCriterion("CRT_DATE not between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNull() {
            addCriterion("CRT_USER is null");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNotNull() {
            addCriterion("CRT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUserEqualTo(String value) {
            addCriterion("CRT_USER =", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotEqualTo(String value) {
            addCriterion("CRT_USER <>", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThan(String value) {
            addCriterion("CRT_USER >", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USER >=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThan(String value) {
            addCriterion("CRT_USER <", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThanOrEqualTo(String value) {
            addCriterion("CRT_USER <=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLike(String value) {
            addCriterion("CRT_USER like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotLike(String value) {
            addCriterion("CRT_USER not like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserIn(List<String> values) {
            addCriterion("CRT_USER in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotIn(List<String> values) {
            addCriterion("CRT_USER not in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserBetween(String value1, String value2) {
            addCriterion("CRT_USER between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotBetween(String value1, String value2) {
            addCriterion("CRT_USER not between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andGraceTypeIsNull() {
            addCriterion("GRACE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGraceTypeIsNotNull() {
            addCriterion("GRACE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGraceTypeEqualTo(String value) {
            addCriterion("GRACE_TYPE =", value, "graceType");
            return (Criteria) this;
        }

        public Criteria andGraceTypeNotEqualTo(String value) {
            addCriterion("GRACE_TYPE <>", value, "graceType");
            return (Criteria) this;
        }

        public Criteria andGraceTypeGreaterThan(String value) {
            addCriterion("GRACE_TYPE >", value, "graceType");
            return (Criteria) this;
        }

        public Criteria andGraceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GRACE_TYPE >=", value, "graceType");
            return (Criteria) this;
        }

        public Criteria andGraceTypeLessThan(String value) {
            addCriterion("GRACE_TYPE <", value, "graceType");
            return (Criteria) this;
        }

        public Criteria andGraceTypeLessThanOrEqualTo(String value) {
            addCriterion("GRACE_TYPE <=", value, "graceType");
            return (Criteria) this;
        }

        public Criteria andGraceTypeLike(String value) {
            addCriterion("GRACE_TYPE like", value, "graceType");
            return (Criteria) this;
        }

        public Criteria andGraceTypeNotLike(String value) {
            addCriterion("GRACE_TYPE not like", value, "graceType");
            return (Criteria) this;
        }

        public Criteria andGraceTypeIn(List<String> values) {
            addCriterion("GRACE_TYPE in", values, "graceType");
            return (Criteria) this;
        }

        public Criteria andGraceTypeNotIn(List<String> values) {
            addCriterion("GRACE_TYPE not in", values, "graceType");
            return (Criteria) this;
        }

        public Criteria andGraceTypeBetween(String value1, String value2) {
            addCriterion("GRACE_TYPE between", value1, value2, "graceType");
            return (Criteria) this;
        }

        public Criteria andGraceTypeNotBetween(String value1, String value2) {
            addCriterion("GRACE_TYPE not between", value1, value2, "graceType");
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

        public Criteria andJzxhIsNull() {
            addCriterion("JZXH is null");
            return (Criteria) this;
        }

        public Criteria andJzxhIsNotNull() {
            addCriterion("JZXH is not null");
            return (Criteria) this;
        }

        public Criteria andJzxhEqualTo(Integer value) {
            addCriterion("JZXH =", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhNotEqualTo(Integer value) {
            addCriterion("JZXH <>", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhGreaterThan(Integer value) {
            addCriterion("JZXH >", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhGreaterThanOrEqualTo(Integer value) {
            addCriterion("JZXH >=", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhLessThan(Integer value) {
            addCriterion("JZXH <", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhLessThanOrEqualTo(Integer value) {
            addCriterion("JZXH <=", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhIn(List<Integer> values) {
            addCriterion("JZXH in", values, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhNotIn(List<Integer> values) {
            addCriterion("JZXH not in", values, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhBetween(Integer value1, Integer value2) {
            addCriterion("JZXH between", value1, value2, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhNotBetween(Integer value1, Integer value2) {
            addCriterion("JZXH not between", value1, value2, "jzxh");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNull() {
            addCriterion("HRT_RTE is null");
            return (Criteria) this;
        }

        public Criteria andHrtRteIsNotNull() {
            addCriterion("HRT_RTE is not null");
            return (Criteria) this;
        }

        public Criteria andHrtRteEqualTo(Short value) {
            addCriterion("HRT_RTE =", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotEqualTo(Short value) {
            addCriterion("HRT_RTE <>", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThan(Short value) {
            addCriterion("HRT_RTE >", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteGreaterThanOrEqualTo(Short value) {
            addCriterion("HRT_RTE >=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThan(Short value) {
            addCriterion("HRT_RTE <", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteLessThanOrEqualTo(Short value) {
            addCriterion("HRT_RTE <=", value, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteIn(List<Short> values) {
            addCriterion("HRT_RTE in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotIn(List<Short> values) {
            addCriterion("HRT_RTE not in", values, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteBetween(Short value1, Short value2) {
            addCriterion("HRT_RTE between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andHrtRteNotBetween(Short value1, Short value2) {
            addCriterion("HRT_RTE not between", value1, value2, "hrtRte");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrIsNull() {
            addCriterion("SBPUP_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrIsNotNull() {
            addCriterion("SBPUP_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrEqualTo(Short value) {
            addCriterion("SBPUP_NBR =", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrNotEqualTo(Short value) {
            addCriterion("SBPUP_NBR <>", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrGreaterThan(Short value) {
            addCriterion("SBPUP_NBR >", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrGreaterThanOrEqualTo(Short value) {
            addCriterion("SBPUP_NBR >=", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrLessThan(Short value) {
            addCriterion("SBPUP_NBR <", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrLessThanOrEqualTo(Short value) {
            addCriterion("SBPUP_NBR <=", value, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrIn(List<Short> values) {
            addCriterion("SBPUP_NBR in", values, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrNotIn(List<Short> values) {
            addCriterion("SBPUP_NBR not in", values, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrBetween(Short value1, Short value2) {
            addCriterion("SBPUP_NBR between", value1, value2, "sbpupNbr");
            return (Criteria) this;
        }

        public Criteria andSbpupNbrNotBetween(Short value1, Short value2) {
            addCriterion("SBPUP_NBR not between", value1, value2, "sbpupNbr");
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