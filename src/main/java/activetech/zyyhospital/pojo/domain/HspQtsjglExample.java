package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HspQtsjglExample {
	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspQtsjglExample() {
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

        public Criteria andQtsjSeqIsNull() {
            addCriterion("QTSJ_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqIsNotNull() {
            addCriterion("QTSJ_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqEqualTo(String value) {
            addCriterion("QTSJ_SEQ =", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqNotEqualTo(String value) {
            addCriterion("QTSJ_SEQ <>", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqGreaterThan(String value) {
            addCriterion("QTSJ_SEQ >", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqGreaterThanOrEqualTo(String value) {
            addCriterion("QTSJ_SEQ >=", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqLessThan(String value) {
            addCriterion("QTSJ_SEQ <", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqLessThanOrEqualTo(String value) {
            addCriterion("QTSJ_SEQ <=", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqLike(String value) {
            addCriterion("QTSJ_SEQ like", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqNotLike(String value) {
            addCriterion("QTSJ_SEQ not like", value, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqIn(List<String> values) {
            addCriterion("QTSJ_SEQ in", values, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqNotIn(List<String> values) {
            addCriterion("QTSJ_SEQ not in", values, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqBetween(String value1, String value2) {
            addCriterion("QTSJ_SEQ between", value1, value2, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjSeqNotBetween(String value1, String value2) {
            addCriterion("QTSJ_SEQ not between", value1, value2, "qtsjSeq");
            return (Criteria) this;
        }

        public Criteria andQtsjNamIsNull() {
            addCriterion("QTSJ_NAM is null");
            return (Criteria) this;
        }

        public Criteria andQtsjNamIsNotNull() {
            addCriterion("QTSJ_NAM is not null");
            return (Criteria) this;
        }

        public Criteria andQtsjNamEqualTo(String value) {
            addCriterion("QTSJ_NAM =", value, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjNamNotEqualTo(String value) {
            addCriterion("QTSJ_NAM <>", value, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjNamGreaterThan(String value) {
            addCriterion("QTSJ_NAM >", value, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjNamGreaterThanOrEqualTo(String value) {
            addCriterion("QTSJ_NAM >=", value, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjNamLessThan(String value) {
            addCriterion("QTSJ_NAM <", value, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjNamLessThanOrEqualTo(String value) {
            addCriterion("QTSJ_NAM <=", value, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjNamLike(String value) {
            addCriterion("QTSJ_NAM like", value, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjNamNotLike(String value) {
            addCriterion("QTSJ_NAM not like", value, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjNamIn(List<String> values) {
            addCriterion("QTSJ_NAM in", values, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjNamNotIn(List<String> values) {
            addCriterion("QTSJ_NAM not in", values, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjNamBetween(String value1, String value2) {
            addCriterion("QTSJ_NAM between", value1, value2, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjNamNotBetween(String value1, String value2) {
            addCriterion("QTSJ_NAM not between", value1, value2, "qtsjNam");
            return (Criteria) this;
        }

        public Criteria andQtsjDatIsNull() {
            addCriterion("QTSJ_DAT is null");
            return (Criteria) this;
        }

        public Criteria andQtsjDatIsNotNull() {
            addCriterion("QTSJ_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andQtsjDatEqualTo(Date value) {
            addCriterion("QTSJ_DAT =", value, "qtsjDat");
            return (Criteria) this;
        }

        public Criteria andQtsjDatNotEqualTo(Date value) {
            addCriterion("QTSJ_DAT <>", value, "qtsjDat");
            return (Criteria) this;
        }

        public Criteria andQtsjDatGreaterThan(Date value) {
            addCriterion("QTSJ_DAT >", value, "qtsjDat");
            return (Criteria) this;
        }

        public Criteria andQtsjDatGreaterThanOrEqualTo(Date value) {
            addCriterion("QTSJ_DAT >=", value, "qtsjDat");
            return (Criteria) this;
        }

        public Criteria andQtsjDatLessThan(Date value) {
            addCriterion("QTSJ_DAT <", value, "qtsjDat");
            return (Criteria) this;
        }

        public Criteria andQtsjDatLessThanOrEqualTo(Date value) {
            addCriterion("QTSJ_DAT <=", value, "qtsjDat");
            return (Criteria) this;
        }

        public Criteria andQtsjDatIn(List<Date> values) {
            addCriterion("QTSJ_DAT in", values, "qtsjDat");
            return (Criteria) this;
        }

        public Criteria andQtsjDatNotIn(List<Date> values) {
            addCriterion("QTSJ_DAT not in", values, "qtsjDat");
            return (Criteria) this;
        }

        public Criteria andQtsjDatBetween(Date value1, Date value2) {
            addCriterion("QTSJ_DAT between", value1, value2, "qtsjDat");
            return (Criteria) this;
        }

        public Criteria andQtsjDatNotBetween(Date value1, Date value2) {
            addCriterion("QTSJ_DAT not between", value1, value2, "qtsjDat");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeIsNull() {
            addCriterion("QTSJ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeIsNotNull() {
            addCriterion("QTSJ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeEqualTo(String value) {
            addCriterion("QTSJ_TYPE =", value, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeNotEqualTo(String value) {
            addCriterion("QTSJ_TYPE <>", value, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeGreaterThan(String value) {
            addCriterion("QTSJ_TYPE >", value, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeGreaterThanOrEqualTo(String value) {
            addCriterion("QTSJ_TYPE >=", value, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeLessThan(String value) {
            addCriterion("QTSJ_TYPE <", value, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeLessThanOrEqualTo(String value) {
            addCriterion("QTSJ_TYPE <=", value, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeLike(String value) {
            addCriterion("QTSJ_TYPE like", value, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeNotLike(String value) {
            addCriterion("QTSJ_TYPE not like", value, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeIn(List<String> values) {
            addCriterion("QTSJ_TYPE in", values, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeNotIn(List<String> values) {
            addCriterion("QTSJ_TYPE not in", values, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeBetween(String value1, String value2) {
            addCriterion("QTSJ_TYPE between", value1, value2, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeNotBetween(String value1, String value2) {
            addCriterion("QTSJ_TYPE not between", value1, value2, "qtsjType");
            return (Criteria) this;
        }

        public Criteria andAdrrIsNull() {
            addCriterion("ADRR is null");
            return (Criteria) this;
        }

        public Criteria andAdrrIsNotNull() {
            addCriterion("ADRR is not null");
            return (Criteria) this;
        }

        public Criteria andAdrrEqualTo(String value) {
            addCriterion("ADRR =", value, "adrr");
            return (Criteria) this;
        }

        public Criteria andAdrrNotEqualTo(String value) {
            addCriterion("ADRR <>", value, "adrr");
            return (Criteria) this;
        }

        public Criteria andAdrrGreaterThan(String value) {
            addCriterion("ADRR >", value, "adrr");
            return (Criteria) this;
        }

        public Criteria andAdrrGreaterThanOrEqualTo(String value) {
            addCriterion("ADRR >=", value, "adrr");
            return (Criteria) this;
        }

        public Criteria andAdrrLessThan(String value) {
            addCriterion("ADRR <", value, "adrr");
            return (Criteria) this;
        }

        public Criteria andAdrrLessThanOrEqualTo(String value) {
            addCriterion("ADRR <=", value, "adrr");
            return (Criteria) this;
        }

        public Criteria andAdrrLike(String value) {
            addCriterion("ADRR like", value, "adrr");
            return (Criteria) this;
        }

        public Criteria andAdrrNotLike(String value) {
            addCriterion("ADRR not like", value, "adrr");
            return (Criteria) this;
        }

        public Criteria andAdrrIn(List<String> values) {
            addCriterion("ADRR in", values, "adrr");
            return (Criteria) this;
        }

        public Criteria andAdrrNotIn(List<String> values) {
            addCriterion("ADRR not in", values, "adrr");
            return (Criteria) this;
        }

        public Criteria andAdrrBetween(String value1, String value2) {
            addCriterion("ADRR between", value1, value2, "adrr");
            return (Criteria) this;
        }

        public Criteria andAdrrNotBetween(String value1, String value2) {
            addCriterion("ADRR not between", value1, value2, "adrr");
            return (Criteria) this;
        }

        public Criteria andJyjgIsNull() {
            addCriterion("JYJG is null");
            return (Criteria) this;
        }

        public Criteria andJyjgIsNotNull() {
            addCriterion("JYJG is not null");
            return (Criteria) this;
        }

        public Criteria andJyjgEqualTo(String value) {
            addCriterion("JYJG =", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgNotEqualTo(String value) {
            addCriterion("JYJG <>", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgGreaterThan(String value) {
            addCriterion("JYJG >", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgGreaterThanOrEqualTo(String value) {
            addCriterion("JYJG >=", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgLessThan(String value) {
            addCriterion("JYJG <", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgLessThanOrEqualTo(String value) {
            addCriterion("JYJG <=", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgLike(String value) {
            addCriterion("JYJG like", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgNotLike(String value) {
            addCriterion("JYJG not like", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgIn(List<String> values) {
            addCriterion("JYJG in", values, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgNotIn(List<String> values) {
            addCriterion("JYJG not in", values, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgBetween(String value1, String value2) {
            addCriterion("JYJG between", value1, value2, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgNotBetween(String value1, String value2) {
            addCriterion("JYJG not between", value1, value2, "jyjg");
            return (Criteria) this;
        }

        public Criteria andQjgcIsNull() {
            addCriterion("QJGC is null");
            return (Criteria) this;
        }

        public Criteria andQjgcIsNotNull() {
            addCriterion("QJGC is not null");
            return (Criteria) this;
        }

        public Criteria andQjgcEqualTo(String value) {
            addCriterion("QJGC =", value, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjgcNotEqualTo(String value) {
            addCriterion("QJGC <>", value, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjgcGreaterThan(String value) {
            addCriterion("QJGC >", value, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjgcGreaterThanOrEqualTo(String value) {
            addCriterion("QJGC >=", value, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjgcLessThan(String value) {
            addCriterion("QJGC <", value, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjgcLessThanOrEqualTo(String value) {
            addCriterion("QJGC <=", value, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjgcLike(String value) {
            addCriterion("QJGC like", value, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjgcNotLike(String value) {
            addCriterion("QJGC not like", value, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjgcIn(List<String> values) {
            addCriterion("QJGC in", values, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjgcNotIn(List<String> values) {
            addCriterion("QJGC not in", values, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjgcBetween(String value1, String value2) {
            addCriterion("QJGC between", value1, value2, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjgcNotBetween(String value1, String value2) {
            addCriterion("QJGC not between", value1, value2, "qjgc");
            return (Criteria) this;
        }

        public Criteria andQjxjIsNull() {
            addCriterion("QJXJ is null");
            return (Criteria) this;
        }

        public Criteria andQjxjIsNotNull() {
            addCriterion("QJXJ is not null");
            return (Criteria) this;
        }

        public Criteria andQjxjEqualTo(String value) {
            addCriterion("QJXJ =", value, "qjxj");
            return (Criteria) this;
        }

        public Criteria andQjxjNotEqualTo(String value) {
            addCriterion("QJXJ <>", value, "qjxj");
            return (Criteria) this;
        }

        public Criteria andQjxjGreaterThan(String value) {
            addCriterion("QJXJ >", value, "qjxj");
            return (Criteria) this;
        }

        public Criteria andQjxjGreaterThanOrEqualTo(String value) {
            addCriterion("QJXJ >=", value, "qjxj");
            return (Criteria) this;
        }

        public Criteria andQjxjLessThan(String value) {
            addCriterion("QJXJ <", value, "qjxj");
            return (Criteria) this;
        }

        public Criteria andQjxjLessThanOrEqualTo(String value) {
            addCriterion("QJXJ <=", value, "qjxj");
            return (Criteria) this;
        }

        public Criteria andQjxjLike(String value) {
            addCriterion("QJXJ like", value, "qjxj");
            return (Criteria) this;
        }

        public Criteria andQjxjNotLike(String value) {
            addCriterion("QJXJ not like", value, "qjxj");
            return (Criteria) this;
        }

        public Criteria andQjxjIn(List<String> values) {
            addCriterion("QJXJ in", values, "qjxj");
            return (Criteria) this;
        }

        public Criteria andQjxjNotIn(List<String> values) {
            addCriterion("QJXJ not in", values, "qjxj");
            return (Criteria) this;
        }

        public Criteria andQjxjBetween(String value1, String value2) {
            addCriterion("QJXJ between", value1, value2, "qjxj");
            return (Criteria) this;
        }

        public Criteria andQjxjNotBetween(String value1, String value2) {
            addCriterion("QJXJ not between", value1, value2, "qjxj");
            return (Criteria) this;
        }

        public Criteria andBgbmIsNull() {
            addCriterion("BGBM is null");
            return (Criteria) this;
        }

        public Criteria andBgbmIsNotNull() {
            addCriterion("BGBM is not null");
            return (Criteria) this;
        }

        public Criteria andBgbmEqualTo(String value) {
            addCriterion("BGBM =", value, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgbmNotEqualTo(String value) {
            addCriterion("BGBM <>", value, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgbmGreaterThan(String value) {
            addCriterion("BGBM >", value, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgbmGreaterThanOrEqualTo(String value) {
            addCriterion("BGBM >=", value, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgbmLessThan(String value) {
            addCriterion("BGBM <", value, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgbmLessThanOrEqualTo(String value) {
            addCriterion("BGBM <=", value, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgbmLike(String value) {
            addCriterion("BGBM like", value, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgbmNotLike(String value) {
            addCriterion("BGBM not like", value, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgbmIn(List<String> values) {
            addCriterion("BGBM in", values, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgbmNotIn(List<String> values) {
            addCriterion("BGBM not in", values, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgbmBetween(String value1, String value2) {
            addCriterion("BGBM between", value1, value2, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgbmNotBetween(String value1, String value2) {
            addCriterion("BGBM not between", value1, value2, "bgbm");
            return (Criteria) this;
        }

        public Criteria andBgrnamIsNull() {
            addCriterion("BGRNAM is null");
            return (Criteria) this;
        }

        public Criteria andBgrnamIsNotNull() {
            addCriterion("BGRNAM is not null");
            return (Criteria) this;
        }

        public Criteria andBgrnamEqualTo(String value) {
            addCriterion("BGRNAM =", value, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andBgrnamNotEqualTo(String value) {
            addCriterion("BGRNAM <>", value, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andBgrnamGreaterThan(String value) {
            addCriterion("BGRNAM >", value, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andBgrnamGreaterThanOrEqualTo(String value) {
            addCriterion("BGRNAM >=", value, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andBgrnamLessThan(String value) {
            addCriterion("BGRNAM <", value, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andBgrnamLessThanOrEqualTo(String value) {
            addCriterion("BGRNAM <=", value, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andBgrnamLike(String value) {
            addCriterion("BGRNAM like", value, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andBgrnamNotLike(String value) {
            addCriterion("BGRNAM not like", value, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andBgrnamIn(List<String> values) {
            addCriterion("BGRNAM in", values, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andBgrnamNotIn(List<String> values) {
            addCriterion("BGRNAM not in", values, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andBgrnamBetween(String value1, String value2) {
            addCriterion("BGRNAM between", value1, value2, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andBgrnamNotBetween(String value1, String value2) {
            addCriterion("BGRNAM not between", value1, value2, "bgrnam");
            return (Criteria) this;
        }

        public Criteria andDjdatIsNull() {
            addCriterion("DJDAT is null");
            return (Criteria) this;
        }

        public Criteria andDjdatIsNotNull() {
            addCriterion("DJDAT is not null");
            return (Criteria) this;
        }

        public Criteria andDjdatEqualTo(Date value) {
            addCriterion("DJDAT =", value, "djdat");
            return (Criteria) this;
        }

        public Criteria andDjdatNotEqualTo(Date value) {
            addCriterion("DJDAT <>", value, "djdat");
            return (Criteria) this;
        }

        public Criteria andDjdatGreaterThan(Date value) {
            addCriterion("DJDAT >", value, "djdat");
            return (Criteria) this;
        }

        public Criteria andDjdatGreaterThanOrEqualTo(Date value) {
            addCriterion("DJDAT >=", value, "djdat");
            return (Criteria) this;
        }

        public Criteria andDjdatLessThan(Date value) {
            addCriterion("DJDAT <", value, "djdat");
            return (Criteria) this;
        }

        public Criteria andDjdatLessThanOrEqualTo(Date value) {
            addCriterion("DJDAT <=", value, "djdat");
            return (Criteria) this;
        }

        public Criteria andDjdatIn(List<Date> values) {
            addCriterion("DJDAT in", values, "djdat");
            return (Criteria) this;
        }

        public Criteria andDjdatNotIn(List<Date> values) {
            addCriterion("DJDAT not in", values, "djdat");
            return (Criteria) this;
        }

        public Criteria andDjdatBetween(Date value1, Date value2) {
            addCriterion("DJDAT between", value1, value2, "djdat");
            return (Criteria) this;
        }

        public Criteria andDjdatNotBetween(Date value1, Date value2) {
            addCriterion("DJDAT not between", value1, value2, "djdat");
            return (Criteria) this;
        }

        public Criteria andDjrnamIsNull() {
            addCriterion("DJRNAM is null");
            return (Criteria) this;
        }

        public Criteria andDjrnamIsNotNull() {
            addCriterion("DJRNAM is not null");
            return (Criteria) this;
        }

        public Criteria andDjrnamEqualTo(String value) {
            addCriterion("DJRNAM =", value, "djrnam");
            return (Criteria) this;
        }

        public Criteria andDjrnamNotEqualTo(String value) {
            addCriterion("DJRNAM <>", value, "djrnam");
            return (Criteria) this;
        }

        public Criteria andDjrnamGreaterThan(String value) {
            addCriterion("DJRNAM >", value, "djrnam");
            return (Criteria) this;
        }

        public Criteria andDjrnamGreaterThanOrEqualTo(String value) {
            addCriterion("DJRNAM >=", value, "djrnam");
            return (Criteria) this;
        }

        public Criteria andDjrnamLessThan(String value) {
            addCriterion("DJRNAM <", value, "djrnam");
            return (Criteria) this;
        }

        public Criteria andDjrnamLessThanOrEqualTo(String value) {
            addCriterion("DJRNAM <=", value, "djrnam");
            return (Criteria) this;
        }

        public Criteria andDjrnamLike(String value) {
            addCriterion("DJRNAM like", value, "djrnam");
            return (Criteria) this;
        }

        public Criteria andDjrnamNotLike(String value) {
            addCriterion("DJRNAM not like", value, "djrnam");
            return (Criteria) this;
        }

        public Criteria andDjrnamIn(List<String> values) {
            addCriterion("DJRNAM in", values, "djrnam");
            return (Criteria) this;
        }

        public Criteria andDjrnamNotIn(List<String> values) {
            addCriterion("DJRNAM not in", values, "djrnam");
            return (Criteria) this;
        }

        public Criteria andDjrnamBetween(String value1, String value2) {
            addCriterion("DJRNAM between", value1, value2, "djrnam");
            return (Criteria) this;
        }

        public Criteria andDjrnamNotBetween(String value1, String value2) {
            addCriterion("DJRNAM not between", value1, value2, "djrnam");
            return (Criteria) this;
        }

        public Criteria andGlksIsNull() {
            addCriterion("GLKS is null");
            return (Criteria) this;
        }

        public Criteria andGlksIsNotNull() {
            addCriterion("GLKS is not null");
            return (Criteria) this;
        }

        public Criteria andGlksEqualTo(String value) {
            addCriterion("GLKS =", value, "glks");
            return (Criteria) this;
        }

        public Criteria andGlksNotEqualTo(String value) {
            addCriterion("GLKS <>", value, "glks");
            return (Criteria) this;
        }

        public Criteria andGlksGreaterThan(String value) {
            addCriterion("GLKS >", value, "glks");
            return (Criteria) this;
        }

        public Criteria andGlksGreaterThanOrEqualTo(String value) {
            addCriterion("GLKS >=", value, "glks");
            return (Criteria) this;
        }

        public Criteria andGlksLessThan(String value) {
            addCriterion("GLKS <", value, "glks");
            return (Criteria) this;
        }

        public Criteria andGlksLessThanOrEqualTo(String value) {
            addCriterion("GLKS <=", value, "glks");
            return (Criteria) this;
        }

        public Criteria andGlksLike(String value) {
            addCriterion("GLKS like", value, "glks");
            return (Criteria) this;
        }

        public Criteria andGlksNotLike(String value) {
            addCriterion("GLKS not like", value, "glks");
            return (Criteria) this;
        }

        public Criteria andGlksIn(List<String> values) {
            addCriterion("GLKS in", values, "glks");
            return (Criteria) this;
        }

        public Criteria andGlksNotIn(List<String> values) {
            addCriterion("GLKS not in", values, "glks");
            return (Criteria) this;
        }

        public Criteria andGlksBetween(String value1, String value2) {
            addCriterion("GLKS between", value1, value2, "glks");
            return (Criteria) this;
        }

        public Criteria andGlksNotBetween(String value1, String value2) {
            addCriterion("GLKS not between", value1, value2, "glks");
            return (Criteria) this;
        }

        public Criteria andYhryIsNull() {
            addCriterion("YHRY is null");
            return (Criteria) this;
        }

        public Criteria andYhryIsNotNull() {
            addCriterion("YHRY is not null");
            return (Criteria) this;
        }

        public Criteria andYhryEqualTo(String value) {
            addCriterion("YHRY =", value, "yhry");
            return (Criteria) this;
        }

        public Criteria andYhryNotEqualTo(String value) {
            addCriterion("YHRY <>", value, "yhry");
            return (Criteria) this;
        }

        public Criteria andYhryGreaterThan(String value) {
            addCriterion("YHRY >", value, "yhry");
            return (Criteria) this;
        }

        public Criteria andYhryGreaterThanOrEqualTo(String value) {
            addCriterion("YHRY >=", value, "yhry");
            return (Criteria) this;
        }

        public Criteria andYhryLessThan(String value) {
            addCriterion("YHRY <", value, "yhry");
            return (Criteria) this;
        }

        public Criteria andYhryLessThanOrEqualTo(String value) {
            addCriterion("YHRY <=", value, "yhry");
            return (Criteria) this;
        }

        public Criteria andYhryLike(String value) {
            addCriterion("YHRY like", value, "yhry");
            return (Criteria) this;
        }

        public Criteria andYhryNotLike(String value) {
            addCriterion("YHRY not like", value, "yhry");
            return (Criteria) this;
        }

        public Criteria andYhryIn(List<String> values) {
            addCriterion("YHRY in", values, "yhry");
            return (Criteria) this;
        }

        public Criteria andYhryNotIn(List<String> values) {
            addCriterion("YHRY not in", values, "yhry");
            return (Criteria) this;
        }

        public Criteria andYhryBetween(String value1, String value2) {
            addCriterion("YHRY between", value1, value2, "yhry");
            return (Criteria) this;
        }

        public Criteria andYhryNotBetween(String value1, String value2) {
            addCriterion("YHRY not between", value1, value2, "yhry");
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

        public Criteria andQtsjTypeOtherIsNull() {
            addCriterion("QTSJ_TYPE_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherIsNotNull() {
            addCriterion("QTSJ_TYPE_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherEqualTo(String value) {
            addCriterion("QTSJ_TYPE_OTHER =", value, "qtsjTypeOther");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherNotEqualTo(String value) {
            addCriterion("QTSJ_TYPE_OTHER <>", value, "qtsjTypeOther");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherGreaterThan(String value) {
            addCriterion("QTSJ_TYPE_OTHER >", value, "qtsjTypeOther");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherGreaterThanOrEqualTo(String value) {
            addCriterion("QTSJ_TYPE_OTHER >=", value, "qtsjTypeOther");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherLessThan(String value) {
            addCriterion("QTSJ_TYPE_OTHER <", value, "qtsjTypeOther");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherLessThanOrEqualTo(String value) {
            addCriterion("QTSJ_TYPE_OTHER <=", value, "qtsjTypeOther");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherLike(String value) {
            addCriterion("QTSJ_TYPE_OTHER like", value, "qtsjTypeOther");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherNotLike(String value) {
            addCriterion("QTSJ_TYPE_OTHER not like", value, "qtsjTypeOther");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherIn(List<String> values) {
            addCriterion("QTSJ_TYPE_OTHER in", values, "qtsjTypeOther");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherNotIn(List<String> values) {
            addCriterion("QTSJ_TYPE_OTHER not in", values, "qtsjTypeOther");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherBetween(String value1, String value2) {
            addCriterion("QTSJ_TYPE_OTHER between", value1, value2, "qtsjTypeOther");
            return (Criteria) this;
        }

        public Criteria andQtsjTypeOtherNotBetween(String value1, String value2) {
            addCriterion("QTSJ_TYPE_OTHER not between", value1, value2, "qtsjTypeOther");
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