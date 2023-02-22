package activetech.aid.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AidApkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AidApkExample() {
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

        public Criteria andApkSeqIsNull() {
            addCriterion("APK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andApkSeqIsNotNull() {
            addCriterion("APK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andApkSeqEqualTo(String value) {
            addCriterion("APK_SEQ =", value, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkSeqNotEqualTo(String value) {
            addCriterion("APK_SEQ <>", value, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkSeqGreaterThan(String value) {
            addCriterion("APK_SEQ >", value, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkSeqGreaterThanOrEqualTo(String value) {
            addCriterion("APK_SEQ >=", value, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkSeqLessThan(String value) {
            addCriterion("APK_SEQ <", value, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkSeqLessThanOrEqualTo(String value) {
            addCriterion("APK_SEQ <=", value, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkSeqLike(String value) {
            addCriterion("APK_SEQ like", value, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkSeqNotLike(String value) {
            addCriterion("APK_SEQ not like", value, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkSeqIn(List<String> values) {
            addCriterion("APK_SEQ in", values, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkSeqNotIn(List<String> values) {
            addCriterion("APK_SEQ not in", values, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkSeqBetween(String value1, String value2) {
            addCriterion("APK_SEQ between", value1, value2, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkSeqNotBetween(String value1, String value2) {
            addCriterion("APK_SEQ not between", value1, value2, "apkSeq");
            return (Criteria) this;
        }

        public Criteria andApkIdIsNull() {
            addCriterion("APK_ID is null");
            return (Criteria) this;
        }

        public Criteria andApkIdIsNotNull() {
            addCriterion("APK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApkIdEqualTo(String value) {
            addCriterion("APK_ID =", value, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkIdNotEqualTo(String value) {
            addCriterion("APK_ID <>", value, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkIdGreaterThan(String value) {
            addCriterion("APK_ID >", value, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkIdGreaterThanOrEqualTo(String value) {
            addCriterion("APK_ID >=", value, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkIdLessThan(String value) {
            addCriterion("APK_ID <", value, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkIdLessThanOrEqualTo(String value) {
            addCriterion("APK_ID <=", value, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkIdLike(String value) {
            addCriterion("APK_ID like", value, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkIdNotLike(String value) {
            addCriterion("APK_ID not like", value, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkIdIn(List<String> values) {
            addCriterion("APK_ID in", values, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkIdNotIn(List<String> values) {
            addCriterion("APK_ID not in", values, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkIdBetween(String value1, String value2) {
            addCriterion("APK_ID between", value1, value2, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkIdNotBetween(String value1, String value2) {
            addCriterion("APK_ID not between", value1, value2, "apkId");
            return (Criteria) this;
        }

        public Criteria andApkVerIsNull() {
            addCriterion("APK_VER is null");
            return (Criteria) this;
        }

        public Criteria andApkVerIsNotNull() {
            addCriterion("APK_VER is not null");
            return (Criteria) this;
        }

        public Criteria andApkVerEqualTo(String value) {
            addCriterion("APK_VER =", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerNotEqualTo(String value) {
            addCriterion("APK_VER <>", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerGreaterThan(String value) {
            addCriterion("APK_VER >", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerGreaterThanOrEqualTo(String value) {
            addCriterion("APK_VER >=", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerLessThan(String value) {
            addCriterion("APK_VER <", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerLessThanOrEqualTo(String value) {
            addCriterion("APK_VER <=", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerLike(String value) {
            addCriterion("APK_VER like", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerNotLike(String value) {
            addCriterion("APK_VER not like", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerIn(List<String> values) {
            addCriterion("APK_VER in", values, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerNotIn(List<String> values) {
            addCriterion("APK_VER not in", values, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerBetween(String value1, String value2) {
            addCriterion("APK_VER between", value1, value2, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerNotBetween(String value1, String value2) {
            addCriterion("APK_VER not between", value1, value2, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkDirIsNull() {
            addCriterion("APK_DIR is null");
            return (Criteria) this;
        }

        public Criteria andApkDirIsNotNull() {
            addCriterion("APK_DIR is not null");
            return (Criteria) this;
        }

        public Criteria andApkDirEqualTo(String value) {
            addCriterion("APK_DIR =", value, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDirNotEqualTo(String value) {
            addCriterion("APK_DIR <>", value, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDirGreaterThan(String value) {
            addCriterion("APK_DIR >", value, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDirGreaterThanOrEqualTo(String value) {
            addCriterion("APK_DIR >=", value, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDirLessThan(String value) {
            addCriterion("APK_DIR <", value, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDirLessThanOrEqualTo(String value) {
            addCriterion("APK_DIR <=", value, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDirLike(String value) {
            addCriterion("APK_DIR like", value, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDirNotLike(String value) {
            addCriterion("APK_DIR not like", value, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDirIn(List<String> values) {
            addCriterion("APK_DIR in", values, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDirNotIn(List<String> values) {
            addCriterion("APK_DIR not in", values, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDirBetween(String value1, String value2) {
            addCriterion("APK_DIR between", value1, value2, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDirNotBetween(String value1, String value2) {
            addCriterion("APK_DIR not between", value1, value2, "apkDir");
            return (Criteria) this;
        }

        public Criteria andApkDesIsNull() {
            addCriterion("APK_DES is null");
            return (Criteria) this;
        }

        public Criteria andApkDesIsNotNull() {
            addCriterion("APK_DES is not null");
            return (Criteria) this;
        }

        public Criteria andApkDesEqualTo(String value) {
            addCriterion("APK_DES =", value, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkDesNotEqualTo(String value) {
            addCriterion("APK_DES <>", value, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkDesGreaterThan(String value) {
            addCriterion("APK_DES >", value, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkDesGreaterThanOrEqualTo(String value) {
            addCriterion("APK_DES >=", value, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkDesLessThan(String value) {
            addCriterion("APK_DES <", value, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkDesLessThanOrEqualTo(String value) {
            addCriterion("APK_DES <=", value, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkDesLike(String value) {
            addCriterion("APK_DES like", value, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkDesNotLike(String value) {
            addCriterion("APK_DES not like", value, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkDesIn(List<String> values) {
            addCriterion("APK_DES in", values, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkDesNotIn(List<String> values) {
            addCriterion("APK_DES not in", values, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkDesBetween(String value1, String value2) {
            addCriterion("APK_DES between", value1, value2, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkDesNotBetween(String value1, String value2) {
            addCriterion("APK_DES not between", value1, value2, "apkDes");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgIsNull() {
            addCriterion("APK_NEW_FLG is null");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgIsNotNull() {
            addCriterion("APK_NEW_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgEqualTo(String value) {
            addCriterion("APK_NEW_FLG =", value, "apkNewFlg");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgNotEqualTo(String value) {
            addCriterion("APK_NEW_FLG <>", value, "apkNewFlg");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgGreaterThan(String value) {
            addCriterion("APK_NEW_FLG >", value, "apkNewFlg");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgGreaterThanOrEqualTo(String value) {
            addCriterion("APK_NEW_FLG >=", value, "apkNewFlg");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgLessThan(String value) {
            addCriterion("APK_NEW_FLG <", value, "apkNewFlg");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgLessThanOrEqualTo(String value) {
            addCriterion("APK_NEW_FLG <=", value, "apkNewFlg");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgLike(String value) {
            addCriterion("APK_NEW_FLG like", value, "apkNewFlg");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgNotLike(String value) {
            addCriterion("APK_NEW_FLG not like", value, "apkNewFlg");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgIn(List<String> values) {
            addCriterion("APK_NEW_FLG in", values, "apkNewFlg");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgNotIn(List<String> values) {
            addCriterion("APK_NEW_FLG not in", values, "apkNewFlg");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgBetween(String value1, String value2) {
            addCriterion("APK_NEW_FLG between", value1, value2, "apkNewFlg");
            return (Criteria) this;
        }

        public Criteria andApkNewFlgNotBetween(String value1, String value2) {
            addCriterion("APK_NEW_FLG not between", value1, value2, "apkNewFlg");
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

        public Criteria andCrtUsrIsNull() {
            addCriterion("CRT_USR is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIsNotNull() {
            addCriterion("CRT_USR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrEqualTo(String value) {
            addCriterion("CRT_USR =", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotEqualTo(String value) {
            addCriterion("CRT_USR <>", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrGreaterThan(String value) {
            addCriterion("CRT_USR >", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR >=", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLessThan(String value) {
            addCriterion("CRT_USR <", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR <=", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLike(String value) {
            addCriterion("CRT_USR like", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotLike(String value) {
            addCriterion("CRT_USR not like", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIn(List<String> values) {
            addCriterion("CRT_USR in", values, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotIn(List<String> values) {
            addCriterion("CRT_USR not in", values, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrBetween(String value1, String value2) {
            addCriterion("CRT_USR between", value1, value2, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotBetween(String value1, String value2) {
            addCriterion("CRT_USR not between", value1, value2, "crtUsr");
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