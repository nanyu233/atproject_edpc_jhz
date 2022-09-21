package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspJjbglInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspJjbglInfExample() {
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

        public Criteria andJjbglSeqIsNull() {
            addCriterion("JJBGL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqIsNotNull() {
            addCriterion("JJBGL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqEqualTo(String value) {
            addCriterion("JJBGL_SEQ =", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqNotEqualTo(String value) {
            addCriterion("JJBGL_SEQ <>", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqGreaterThan(String value) {
            addCriterion("JJBGL_SEQ >", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqGreaterThanOrEqualTo(String value) {
            addCriterion("JJBGL_SEQ >=", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqLessThan(String value) {
            addCriterion("JJBGL_SEQ <", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqLessThanOrEqualTo(String value) {
            addCriterion("JJBGL_SEQ <=", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqLike(String value) {
            addCriterion("JJBGL_SEQ like", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqNotLike(String value) {
            addCriterion("JJBGL_SEQ not like", value, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqIn(List<String> values) {
            addCriterion("JJBGL_SEQ in", values, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqNotIn(List<String> values) {
            addCriterion("JJBGL_SEQ not in", values, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqBetween(String value1, String value2) {
            addCriterion("JJBGL_SEQ between", value1, value2, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbglSeqNotBetween(String value1, String value2) {
            addCriterion("JJBGL_SEQ not between", value1, value2, "jjbglSeq");
            return (Criteria) this;
        }

        public Criteria andJjbtypeIsNull() {
            addCriterion("JJBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andJjbtypeIsNotNull() {
            addCriterion("JJBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andJjbtypeEqualTo(String value) {
            addCriterion("JJBTYPE =", value, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJjbtypeNotEqualTo(String value) {
            addCriterion("JJBTYPE <>", value, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJjbtypeGreaterThan(String value) {
            addCriterion("JJBTYPE >", value, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJjbtypeGreaterThanOrEqualTo(String value) {
            addCriterion("JJBTYPE >=", value, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJjbtypeLessThan(String value) {
            addCriterion("JJBTYPE <", value, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJjbtypeLessThanOrEqualTo(String value) {
            addCriterion("JJBTYPE <=", value, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJjbtypeLike(String value) {
            addCriterion("JJBTYPE like", value, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJjbtypeNotLike(String value) {
            addCriterion("JJBTYPE not like", value, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJjbtypeIn(List<String> values) {
            addCriterion("JJBTYPE in", values, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJjbtypeNotIn(List<String> values) {
            addCriterion("JJBTYPE not in", values, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJjbtypeBetween(String value1, String value2) {
            addCriterion("JJBTYPE between", value1, value2, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJjbtypeNotBetween(String value1, String value2) {
            addCriterion("JJBTYPE not between", value1, value2, "jjbtype");
            return (Criteria) this;
        }

        public Criteria andJiaoDatIsNull() {
            addCriterion("JIAO_DAT is null");
            return (Criteria) this;
        }

        public Criteria andJiaoDatIsNotNull() {
            addCriterion("JIAO_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoDatEqualTo(Date value) {
            addCriterion("JIAO_DAT =", value, "jiaoDat");
            return (Criteria) this;
        }

        public Criteria andJiaoDatNotEqualTo(Date value) {
            addCriterion("JIAO_DAT <>", value, "jiaoDat");
            return (Criteria) this;
        }

        public Criteria andJiaoDatGreaterThan(Date value) {
            addCriterion("JIAO_DAT >", value, "jiaoDat");
            return (Criteria) this;
        }

        public Criteria andJiaoDatGreaterThanOrEqualTo(Date value) {
            addCriterion("JIAO_DAT >=", value, "jiaoDat");
            return (Criteria) this;
        }

        public Criteria andJiaoDatLessThan(Date value) {
            addCriterion("JIAO_DAT <", value, "jiaoDat");
            return (Criteria) this;
        }

        public Criteria andJiaoDatLessThanOrEqualTo(Date value) {
            addCriterion("JIAO_DAT <=", value, "jiaoDat");
            return (Criteria) this;
        }

        public Criteria andJiaoDatIn(List<Date> values) {
            addCriterion("JIAO_DAT in", values, "jiaoDat");
            return (Criteria) this;
        }

        public Criteria andJiaoDatNotIn(List<Date> values) {
            addCriterion("JIAO_DAT not in", values, "jiaoDat");
            return (Criteria) this;
        }

        public Criteria andJiaoDatBetween(Date value1, Date value2) {
            addCriterion("JIAO_DAT between", value1, value2, "jiaoDat");
            return (Criteria) this;
        }

        public Criteria andJiaoDatNotBetween(Date value1, Date value2) {
            addCriterion("JIAO_DAT not between", value1, value2, "jiaoDat");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoIsNull() {
            addCriterion("JIAO_USRNO is null");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoIsNotNull() {
            addCriterion("JIAO_USRNO is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoEqualTo(String value) {
            addCriterion("JIAO_USRNO =", value, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoNotEqualTo(String value) {
            addCriterion("JIAO_USRNO <>", value, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoGreaterThan(String value) {
            addCriterion("JIAO_USRNO >", value, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoGreaterThanOrEqualTo(String value) {
            addCriterion("JIAO_USRNO >=", value, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoLessThan(String value) {
            addCriterion("JIAO_USRNO <", value, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoLessThanOrEqualTo(String value) {
            addCriterion("JIAO_USRNO <=", value, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoLike(String value) {
            addCriterion("JIAO_USRNO like", value, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoNotLike(String value) {
            addCriterion("JIAO_USRNO not like", value, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoIn(List<String> values) {
            addCriterion("JIAO_USRNO in", values, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoNotIn(List<String> values) {
            addCriterion("JIAO_USRNO not in", values, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoBetween(String value1, String value2) {
            addCriterion("JIAO_USRNO between", value1, value2, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnoNotBetween(String value1, String value2) {
            addCriterion("JIAO_USRNO not between", value1, value2, "jiaoUsrno");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamIsNull() {
            addCriterion("JIAO_USRNAM is null");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamIsNotNull() {
            addCriterion("JIAO_USRNAM is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamEqualTo(String value) {
            addCriterion("JIAO_USRNAM =", value, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamNotEqualTo(String value) {
            addCriterion("JIAO_USRNAM <>", value, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamGreaterThan(String value) {
            addCriterion("JIAO_USRNAM >", value, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamGreaterThanOrEqualTo(String value) {
            addCriterion("JIAO_USRNAM >=", value, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamLessThan(String value) {
            addCriterion("JIAO_USRNAM <", value, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamLessThanOrEqualTo(String value) {
            addCriterion("JIAO_USRNAM <=", value, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamLike(String value) {
            addCriterion("JIAO_USRNAM like", value, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamNotLike(String value) {
            addCriterion("JIAO_USRNAM not like", value, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamIn(List<String> values) {
            addCriterion("JIAO_USRNAM in", values, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamNotIn(List<String> values) {
            addCriterion("JIAO_USRNAM not in", values, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamBetween(String value1, String value2) {
            addCriterion("JIAO_USRNAM between", value1, value2, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andJiaoUsrnamNotBetween(String value1, String value2) {
            addCriterion("JIAO_USRNAM not between", value1, value2, "jiaoUsrnam");
            return (Criteria) this;
        }

        public Criteria andPthzsIsNull() {
            addCriterion("PTHZS is null");
            return (Criteria) this;
        }

        public Criteria andPthzsIsNotNull() {
            addCriterion("PTHZS is not null");
            return (Criteria) this;
        }

        public Criteria andPthzsEqualTo(String value) {
            addCriterion("PTHZS =", value, "pthzs");
            return (Criteria) this;
        }

        public Criteria andPthzsNotEqualTo(String value) {
            addCriterion("PTHZS <>", value, "pthzs");
            return (Criteria) this;
        }

        public Criteria andPthzsGreaterThan(String value) {
            addCriterion("PTHZS >", value, "pthzs");
            return (Criteria) this;
        }

        public Criteria andPthzsGreaterThanOrEqualTo(String value) {
            addCriterion("PTHZS >=", value, "pthzs");
            return (Criteria) this;
        }

        public Criteria andPthzsLessThan(String value) {
            addCriterion("PTHZS <", value, "pthzs");
            return (Criteria) this;
        }

        public Criteria andPthzsLessThanOrEqualTo(String value) {
            addCriterion("PTHZS <=", value, "pthzs");
            return (Criteria) this;
        }

        public Criteria andPthzsLike(String value) {
            addCriterion("PTHZS like", value, "pthzs");
            return (Criteria) this;
        }

        public Criteria andPthzsNotLike(String value) {
            addCriterion("PTHZS not like", value, "pthzs");
            return (Criteria) this;
        }

        public Criteria andPthzsIn(List<String> values) {
            addCriterion("PTHZS in", values, "pthzs");
            return (Criteria) this;
        }

        public Criteria andPthzsNotIn(List<String> values) {
            addCriterion("PTHZS not in", values, "pthzs");
            return (Criteria) this;
        }

        public Criteria andPthzsBetween(String value1, String value2) {
            addCriterion("PTHZS between", value1, value2, "pthzs");
            return (Criteria) this;
        }

        public Criteria andPthzsNotBetween(String value1, String value2) {
            addCriterion("PTHZS not between", value1, value2, "pthzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsIsNull() {
            addCriterion("WZHZS is null");
            return (Criteria) this;
        }

        public Criteria andWzhzsIsNotNull() {
            addCriterion("WZHZS is not null");
            return (Criteria) this;
        }

        public Criteria andWzhzsEqualTo(String value) {
            addCriterion("WZHZS =", value, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsNotEqualTo(String value) {
            addCriterion("WZHZS <>", value, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsGreaterThan(String value) {
            addCriterion("WZHZS >", value, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsGreaterThanOrEqualTo(String value) {
            addCriterion("WZHZS >=", value, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsLessThan(String value) {
            addCriterion("WZHZS <", value, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsLessThanOrEqualTo(String value) {
            addCriterion("WZHZS <=", value, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsLike(String value) {
            addCriterion("WZHZS like", value, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsNotLike(String value) {
            addCriterion("WZHZS not like", value, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsIn(List<String> values) {
            addCriterion("WZHZS in", values, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsNotIn(List<String> values) {
            addCriterion("WZHZS not in", values, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsBetween(String value1, String value2) {
            addCriterion("WZHZS between", value1, value2, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andWzhzsNotBetween(String value1, String value2) {
            addCriterion("WZHZS not between", value1, value2, "wzhzs");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoIsNull() {
            addCriterion("ZDJB_USRNO is null");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoIsNotNull() {
            addCriterion("ZDJB_USRNO is not null");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoEqualTo(String value) {
            addCriterion("ZDJB_USRNO =", value, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoNotEqualTo(String value) {
            addCriterion("ZDJB_USRNO <>", value, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoGreaterThan(String value) {
            addCriterion("ZDJB_USRNO >", value, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoGreaterThanOrEqualTo(String value) {
            addCriterion("ZDJB_USRNO >=", value, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoLessThan(String value) {
            addCriterion("ZDJB_USRNO <", value, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoLessThanOrEqualTo(String value) {
            addCriterion("ZDJB_USRNO <=", value, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoLike(String value) {
            addCriterion("ZDJB_USRNO like", value, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoNotLike(String value) {
            addCriterion("ZDJB_USRNO not like", value, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoIn(List<String> values) {
            addCriterion("ZDJB_USRNO in", values, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoNotIn(List<String> values) {
            addCriterion("ZDJB_USRNO not in", values, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoBetween(String value1, String value2) {
            addCriterion("ZDJB_USRNO between", value1, value2, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnoNotBetween(String value1, String value2) {
            addCriterion("ZDJB_USRNO not between", value1, value2, "zdjbUsrno");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamIsNull() {
            addCriterion("ZDJB_USRNAM is null");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamIsNotNull() {
            addCriterion("ZDJB_USRNAM is not null");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamEqualTo(String value) {
            addCriterion("ZDJB_USRNAM =", value, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamNotEqualTo(String value) {
            addCriterion("ZDJB_USRNAM <>", value, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamGreaterThan(String value) {
            addCriterion("ZDJB_USRNAM >", value, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamGreaterThanOrEqualTo(String value) {
            addCriterion("ZDJB_USRNAM >=", value, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamLessThan(String value) {
            addCriterion("ZDJB_USRNAM <", value, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamLessThanOrEqualTo(String value) {
            addCriterion("ZDJB_USRNAM <=", value, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamLike(String value) {
            addCriterion("ZDJB_USRNAM like", value, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamNotLike(String value) {
            addCriterion("ZDJB_USRNAM not like", value, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamIn(List<String> values) {
            addCriterion("ZDJB_USRNAM in", values, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamNotIn(List<String> values) {
            addCriterion("ZDJB_USRNAM not in", values, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamBetween(String value1, String value2) {
            addCriterion("ZDJB_USRNAM between", value1, value2, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andZdjbUsrnamNotBetween(String value1, String value2) {
            addCriterion("ZDJB_USRNAM not between", value1, value2, "zdjbUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieDatIsNull() {
            addCriterion("JIE_DAT is null");
            return (Criteria) this;
        }

        public Criteria andJieDatIsNotNull() {
            addCriterion("JIE_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andJieDatEqualTo(Date value) {
            addCriterion("JIE_DAT =", value, "jieDat");
            return (Criteria) this;
        }

        public Criteria andJieDatNotEqualTo(Date value) {
            addCriterion("JIE_DAT <>", value, "jieDat");
            return (Criteria) this;
        }

        public Criteria andJieDatGreaterThan(Date value) {
            addCriterion("JIE_DAT >", value, "jieDat");
            return (Criteria) this;
        }

        public Criteria andJieDatGreaterThanOrEqualTo(Date value) {
            addCriterion("JIE_DAT >=", value, "jieDat");
            return (Criteria) this;
        }

        public Criteria andJieDatLessThan(Date value) {
            addCriterion("JIE_DAT <", value, "jieDat");
            return (Criteria) this;
        }

        public Criteria andJieDatLessThanOrEqualTo(Date value) {
            addCriterion("JIE_DAT <=", value, "jieDat");
            return (Criteria) this;
        }

        public Criteria andJieDatIn(List<Date> values) {
            addCriterion("JIE_DAT in", values, "jieDat");
            return (Criteria) this;
        }

        public Criteria andJieDatNotIn(List<Date> values) {
            addCriterion("JIE_DAT not in", values, "jieDat");
            return (Criteria) this;
        }

        public Criteria andJieDatBetween(Date value1, Date value2) {
            addCriterion("JIE_DAT between", value1, value2, "jieDat");
            return (Criteria) this;
        }

        public Criteria andJieDatNotBetween(Date value1, Date value2) {
            addCriterion("JIE_DAT not between", value1, value2, "jieDat");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoIsNull() {
            addCriterion("JIE_USRNO is null");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoIsNotNull() {
            addCriterion("JIE_USRNO is not null");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoEqualTo(String value) {
            addCriterion("JIE_USRNO =", value, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoNotEqualTo(String value) {
            addCriterion("JIE_USRNO <>", value, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoGreaterThan(String value) {
            addCriterion("JIE_USRNO >", value, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoGreaterThanOrEqualTo(String value) {
            addCriterion("JIE_USRNO >=", value, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoLessThan(String value) {
            addCriterion("JIE_USRNO <", value, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoLessThanOrEqualTo(String value) {
            addCriterion("JIE_USRNO <=", value, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoLike(String value) {
            addCriterion("JIE_USRNO like", value, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoNotLike(String value) {
            addCriterion("JIE_USRNO not like", value, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoIn(List<String> values) {
            addCriterion("JIE_USRNO in", values, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoNotIn(List<String> values) {
            addCriterion("JIE_USRNO not in", values, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoBetween(String value1, String value2) {
            addCriterion("JIE_USRNO between", value1, value2, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnoNotBetween(String value1, String value2) {
            addCriterion("JIE_USRNO not between", value1, value2, "jieUsrno");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamIsNull() {
            addCriterion("JIE_USRNAM is null");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamIsNotNull() {
            addCriterion("JIE_USRNAM is not null");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamEqualTo(String value) {
            addCriterion("JIE_USRNAM =", value, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamNotEqualTo(String value) {
            addCriterion("JIE_USRNAM <>", value, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamGreaterThan(String value) {
            addCriterion("JIE_USRNAM >", value, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamGreaterThanOrEqualTo(String value) {
            addCriterion("JIE_USRNAM >=", value, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamLessThan(String value) {
            addCriterion("JIE_USRNAM <", value, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamLessThanOrEqualTo(String value) {
            addCriterion("JIE_USRNAM <=", value, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamLike(String value) {
            addCriterion("JIE_USRNAM like", value, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamNotLike(String value) {
            addCriterion("JIE_USRNAM not like", value, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamIn(List<String> values) {
            addCriterion("JIE_USRNAM in", values, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamNotIn(List<String> values) {
            addCriterion("JIE_USRNAM not in", values, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamBetween(String value1, String value2) {
            addCriterion("JIE_USRNAM between", value1, value2, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andJieUsrnamNotBetween(String value1, String value2) {
            addCriterion("JIE_USRNAM not between", value1, value2, "jieUsrnam");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andJiaoBcIsNull() {
            addCriterion("JIAO_BC is null");
            return (Criteria) this;
        }

        public Criteria andJiaoBcIsNotNull() {
            addCriterion("JIAO_BC is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoBcEqualTo(String value) {
            addCriterion("JIAO_BC =", value, "jiaoBc");
            return (Criteria) this;
        }

        public Criteria andJiaoBcNotEqualTo(String value) {
            addCriterion("JIAO_BC <>", value, "jiaoBc");
            return (Criteria) this;
        }

        public Criteria andJiaoBcGreaterThan(String value) {
            addCriterion("JIAO_BC >", value, "jiaoBc");
            return (Criteria) this;
        }

        public Criteria andJiaoBcGreaterThanOrEqualTo(String value) {
            addCriterion("JIAO_BC >=", value, "jiaoBc");
            return (Criteria) this;
        }

        public Criteria andJiaoBcLessThan(String value) {
            addCriterion("JIAO_BC <", value, "jiaoBc");
            return (Criteria) this;
        }

        public Criteria andJiaoBcLessThanOrEqualTo(String value) {
            addCriterion("JIAO_BC <=", value, "jiaoBc");
            return (Criteria) this;
        }

        public Criteria andJiaoBcLike(String value) {
            addCriterion("JIAO_BC like", value, "jiaoBc");
            return (Criteria) this;
        }

        public Criteria andJiaoBcNotLike(String value) {
            addCriterion("JIAO_BC not like", value, "jiaoBc");
            return (Criteria) this;
        }

        public Criteria andJiaoBcIn(List<String> values) {
            addCriterion("JIAO_BC in", values, "jiaoBc");
            return (Criteria) this;
        }

        public Criteria andJiaoBcNotIn(List<String> values) {
            addCriterion("JIAO_BC not in", values, "jiaoBc");
            return (Criteria) this;
        }

        public Criteria andJiaoBcBetween(String value1, String value2) {
            addCriterion("JIAO_BC between", value1, value2, "jiaoBc");
            return (Criteria) this;
        }

        public Criteria andJiaoBcNotBetween(String value1, String value2) {
            addCriterion("JIAO_BC not between", value1, value2, "jiaoBc");
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