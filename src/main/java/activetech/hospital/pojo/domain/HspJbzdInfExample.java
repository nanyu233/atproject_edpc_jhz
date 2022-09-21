package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspJbzdInfExample {
    /**
     * ZJYY.HSP_JBZD_INF
     */
    protected String orderByClause;

    /**
     * ZJYY.HSP_JBZD_INF
     */
    protected boolean distinct;

    /**
     * ZJYY.HSP_JBZD_INF
     */
    protected List<Criteria> oredCriteria;

    public HspJbzdInfExample() {
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

    /**
     * ZJYY.HSP_JBZD_INF 2020-06-16
     */
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

        public Criteria andJbzdSeqIsNull() {
            addCriterion("JBZD_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqIsNotNull() {
            addCriterion("JBZD_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqEqualTo(String value) {
            addCriterion("JBZD_SEQ =", value, "jbzdSeq");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqNotEqualTo(String value) {
            addCriterion("JBZD_SEQ <>", value, "jbzdSeq");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqGreaterThan(String value) {
            addCriterion("JBZD_SEQ >", value, "jbzdSeq");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqGreaterThanOrEqualTo(String value) {
            addCriterion("JBZD_SEQ >=", value, "jbzdSeq");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqLessThan(String value) {
            addCriterion("JBZD_SEQ <", value, "jbzdSeq");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqLessThanOrEqualTo(String value) {
            addCriterion("JBZD_SEQ <=", value, "jbzdSeq");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqLike(String value) {
            addCriterion("JBZD_SEQ like", value, "jbzdSeq");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqNotLike(String value) {
            addCriterion("JBZD_SEQ not like", value, "jbzdSeq");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqIn(List<String> values) {
            addCriterion("JBZD_SEQ in", values, "jbzdSeq");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqNotIn(List<String> values) {
            addCriterion("JBZD_SEQ not in", values, "jbzdSeq");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqBetween(String value1, String value2) {
            addCriterion("JBZD_SEQ between", value1, value2, "jbzdSeq");
            return (Criteria) this;
        }

        public Criteria andJbzdSeqNotBetween(String value1, String value2) {
            addCriterion("JBZD_SEQ not between", value1, value2, "jbzdSeq");
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

        public Criteria andJbzdTypeIsNull() {
            addCriterion("JBZD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeIsNotNull() {
            addCriterion("JBZD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeEqualTo(String value) {
            addCriterion("JBZD_TYPE =", value, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeNotEqualTo(String value) {
            addCriterion("JBZD_TYPE <>", value, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeGreaterThan(String value) {
            addCriterion("JBZD_TYPE >", value, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("JBZD_TYPE >=", value, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeLessThan(String value) {
            addCriterion("JBZD_TYPE <", value, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeLessThanOrEqualTo(String value) {
            addCriterion("JBZD_TYPE <=", value, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeLike(String value) {
            addCriterion("JBZD_TYPE like", value, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeNotLike(String value) {
            addCriterion("JBZD_TYPE not like", value, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeIn(List<String> values) {
            addCriterion("JBZD_TYPE in", values, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeNotIn(List<String> values) {
            addCriterion("JBZD_TYPE not in", values, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeBetween(String value1, String value2) {
            addCriterion("JBZD_TYPE between", value1, value2, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andJbzdTypeNotBetween(String value1, String value2) {
            addCriterion("JBZD_TYPE not between", value1, value2, "jbzdType");
            return (Criteria) this;
        }

        public Criteria andHzzdCodIsNull() {
            addCriterion("HZZD_COD is null");
            return (Criteria) this;
        }

        public Criteria andHzzdCodIsNotNull() {
            addCriterion("HZZD_COD is not null");
            return (Criteria) this;
        }

        public Criteria andHzzdCodEqualTo(String value) {
            addCriterion("HZZD_COD =", value, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andHzzdCodNotEqualTo(String value) {
            addCriterion("HZZD_COD <>", value, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andHzzdCodGreaterThan(String value) {
            addCriterion("HZZD_COD >", value, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andHzzdCodGreaterThanOrEqualTo(String value) {
            addCriterion("HZZD_COD >=", value, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andHzzdCodLessThan(String value) {
            addCriterion("HZZD_COD <", value, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andHzzdCodLessThanOrEqualTo(String value) {
            addCriterion("HZZD_COD <=", value, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andHzzdCodLike(String value) {
            addCriterion("HZZD_COD like", value, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andHzzdCodNotLike(String value) {
            addCriterion("HZZD_COD not like", value, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andHzzdCodIn(List<String> values) {
            addCriterion("HZZD_COD in", values, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andHzzdCodNotIn(List<String> values) {
            addCriterion("HZZD_COD not in", values, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andHzzdCodBetween(String value1, String value2) {
            addCriterion("HZZD_COD between", value1, value2, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andHzzdCodNotBetween(String value1, String value2) {
            addCriterion("HZZD_COD not between", value1, value2, "hzzdCod");
            return (Criteria) this;
        }

        public Criteria andJbzdCommIsNull() {
            addCriterion("JBZD_COMM is null");
            return (Criteria) this;
        }

        public Criteria andJbzdCommIsNotNull() {
            addCriterion("JBZD_COMM is not null");
            return (Criteria) this;
        }

        public Criteria andJbzdCommEqualTo(String value) {
            addCriterion("JBZD_COMM =", value, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andJbzdCommNotEqualTo(String value) {
            addCriterion("JBZD_COMM <>", value, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andJbzdCommGreaterThan(String value) {
            addCriterion("JBZD_COMM >", value, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andJbzdCommGreaterThanOrEqualTo(String value) {
            addCriterion("JBZD_COMM >=", value, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andJbzdCommLessThan(String value) {
            addCriterion("JBZD_COMM <", value, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andJbzdCommLessThanOrEqualTo(String value) {
            addCriterion("JBZD_COMM <=", value, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andJbzdCommLike(String value) {
            addCriterion("JBZD_COMM like", value, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andJbzdCommNotLike(String value) {
            addCriterion("JBZD_COMM not like", value, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andJbzdCommIn(List<String> values) {
            addCriterion("JBZD_COMM in", values, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andJbzdCommNotIn(List<String> values) {
            addCriterion("JBZD_COMM not in", values, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andJbzdCommBetween(String value1, String value2) {
            addCriterion("JBZD_COMM between", value1, value2, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andJbzdCommNotBetween(String value1, String value2) {
            addCriterion("JBZD_COMM not between", value1, value2, "jbzdComm");
            return (Criteria) this;
        }

        public Criteria andHzzdDatIsNull() {
            addCriterion("HZZD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andHzzdDatIsNotNull() {
            addCriterion("HZZD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andHzzdDatEqualTo(Date value) {
            addCriterion("HZZD_DAT =", value, "hzzdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdDatNotEqualTo(Date value) {
            addCriterion("HZZD_DAT <>", value, "hzzdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdDatGreaterThan(Date value) {
            addCriterion("HZZD_DAT >", value, "hzzdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdDatGreaterThanOrEqualTo(Date value) {
            addCriterion("HZZD_DAT >=", value, "hzzdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdDatLessThan(Date value) {
            addCriterion("HZZD_DAT <", value, "hzzdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdDatLessThanOrEqualTo(Date value) {
            addCriterion("HZZD_DAT <=", value, "hzzdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdDatIn(List<Date> values) {
            addCriterion("HZZD_DAT in", values, "hzzdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdDatNotIn(List<Date> values) {
            addCriterion("HZZD_DAT not in", values, "hzzdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdDatBetween(Date value1, Date value2) {
            addCriterion("HZZD_DAT between", value1, value2, "hzzdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdDatNotBetween(Date value1, Date value2) {
            addCriterion("HZZD_DAT not between", value1, value2, "hzzdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrIsNull() {
            addCriterion("HZZD_NUR_NBR is null");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrIsNotNull() {
            addCriterion("HZZD_NUR_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrEqualTo(String value) {
            addCriterion("HZZD_NUR_NBR =", value, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrNotEqualTo(String value) {
            addCriterion("HZZD_NUR_NBR <>", value, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrGreaterThan(String value) {
            addCriterion("HZZD_NUR_NBR >", value, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrGreaterThanOrEqualTo(String value) {
            addCriterion("HZZD_NUR_NBR >=", value, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrLessThan(String value) {
            addCriterion("HZZD_NUR_NBR <", value, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrLessThanOrEqualTo(String value) {
            addCriterion("HZZD_NUR_NBR <=", value, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrLike(String value) {
            addCriterion("HZZD_NUR_NBR like", value, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrNotLike(String value) {
            addCriterion("HZZD_NUR_NBR not like", value, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrIn(List<String> values) {
            addCriterion("HZZD_NUR_NBR in", values, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrNotIn(List<String> values) {
            addCriterion("HZZD_NUR_NBR not in", values, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrBetween(String value1, String value2) {
            addCriterion("HZZD_NUR_NBR between", value1, value2, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdNurNbrNotBetween(String value1, String value2) {
            addCriterion("HZZD_NUR_NBR not between", value1, value2, "hzzdNurNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatIsNull() {
            addCriterion("HZZD_UPD_DAT is null");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatIsNotNull() {
            addCriterion("HZZD_UPD_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatEqualTo(Date value) {
            addCriterion("HZZD_UPD_DAT =", value, "hzzdUpdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatNotEqualTo(Date value) {
            addCriterion("HZZD_UPD_DAT <>", value, "hzzdUpdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatGreaterThan(Date value) {
            addCriterion("HZZD_UPD_DAT >", value, "hzzdUpdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatGreaterThanOrEqualTo(Date value) {
            addCriterion("HZZD_UPD_DAT >=", value, "hzzdUpdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatLessThan(Date value) {
            addCriterion("HZZD_UPD_DAT <", value, "hzzdUpdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatLessThanOrEqualTo(Date value) {
            addCriterion("HZZD_UPD_DAT <=", value, "hzzdUpdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatIn(List<Date> values) {
            addCriterion("HZZD_UPD_DAT in", values, "hzzdUpdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatNotIn(List<Date> values) {
            addCriterion("HZZD_UPD_DAT not in", values, "hzzdUpdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatBetween(Date value1, Date value2) {
            addCriterion("HZZD_UPD_DAT between", value1, value2, "hzzdUpdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdDatNotBetween(Date value1, Date value2) {
            addCriterion("HZZD_UPD_DAT not between", value1, value2, "hzzdUpdDat");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrIsNull() {
            addCriterion("HZZD_UPD_NBR is null");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrIsNotNull() {
            addCriterion("HZZD_UPD_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrEqualTo(String value) {
            addCriterion("HZZD_UPD_NBR =", value, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrNotEqualTo(String value) {
            addCriterion("HZZD_UPD_NBR <>", value, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrGreaterThan(String value) {
            addCriterion("HZZD_UPD_NBR >", value, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrGreaterThanOrEqualTo(String value) {
            addCriterion("HZZD_UPD_NBR >=", value, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrLessThan(String value) {
            addCriterion("HZZD_UPD_NBR <", value, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrLessThanOrEqualTo(String value) {
            addCriterion("HZZD_UPD_NBR <=", value, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrLike(String value) {
            addCriterion("HZZD_UPD_NBR like", value, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrNotLike(String value) {
            addCriterion("HZZD_UPD_NBR not like", value, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrIn(List<String> values) {
            addCriterion("HZZD_UPD_NBR in", values, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrNotIn(List<String> values) {
            addCriterion("HZZD_UPD_NBR not in", values, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrBetween(String value1, String value2) {
            addCriterion("HZZD_UPD_NBR between", value1, value2, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andHzzdUpdNbrNotBetween(String value1, String value2) {
            addCriterion("HZZD_UPD_NBR not between", value1, value2, "hzzdUpdNbr");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgIsNull() {
            addCriterion("JBZD_FLG is null");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgIsNotNull() {
            addCriterion("JBZD_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgEqualTo(String value) {
            addCriterion("JBZD_FLG =", value, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgNotEqualTo(String value) {
            addCriterion("JBZD_FLG <>", value, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgGreaterThan(String value) {
            addCriterion("JBZD_FLG >", value, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgGreaterThanOrEqualTo(String value) {
            addCriterion("JBZD_FLG >=", value, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgLessThan(String value) {
            addCriterion("JBZD_FLG <", value, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgLessThanOrEqualTo(String value) {
            addCriterion("JBZD_FLG <=", value, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgLike(String value) {
            addCriterion("JBZD_FLG like", value, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgNotLike(String value) {
            addCriterion("JBZD_FLG not like", value, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgIn(List<String> values) {
            addCriterion("JBZD_FLG in", values, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgNotIn(List<String> values) {
            addCriterion("JBZD_FLG not in", values, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgBetween(String value1, String value2) {
            addCriterion("JBZD_FLG between", value1, value2, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdFlgNotBetween(String value1, String value2) {
            addCriterion("JBZD_FLG not between", value1, value2, "jbzdFlg");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixIsNull() {
            addCriterion("JBZD_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixIsNotNull() {
            addCriterion("JBZD_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixEqualTo(String value) {
            addCriterion("JBZD_PREFIX =", value, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixNotEqualTo(String value) {
            addCriterion("JBZD_PREFIX <>", value, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixGreaterThan(String value) {
            addCriterion("JBZD_PREFIX >", value, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("JBZD_PREFIX >=", value, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixLessThan(String value) {
            addCriterion("JBZD_PREFIX <", value, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixLessThanOrEqualTo(String value) {
            addCriterion("JBZD_PREFIX <=", value, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixLike(String value) {
            addCriterion("JBZD_PREFIX like", value, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixNotLike(String value) {
            addCriterion("JBZD_PREFIX not like", value, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixIn(List<String> values) {
            addCriterion("JBZD_PREFIX in", values, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixNotIn(List<String> values) {
            addCriterion("JBZD_PREFIX not in", values, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixBetween(String value1, String value2) {
            addCriterion("JBZD_PREFIX between", value1, value2, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdPrefixNotBetween(String value1, String value2) {
            addCriterion("JBZD_PREFIX not between", value1, value2, "jbzdPrefix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixIsNull() {
            addCriterion("JBZD_SUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixIsNotNull() {
            addCriterion("JBZD_SUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixEqualTo(String value) {
            addCriterion("JBZD_SUFFIX =", value, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixNotEqualTo(String value) {
            addCriterion("JBZD_SUFFIX <>", value, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixGreaterThan(String value) {
            addCriterion("JBZD_SUFFIX >", value, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("JBZD_SUFFIX >=", value, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixLessThan(String value) {
            addCriterion("JBZD_SUFFIX <", value, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixLessThanOrEqualTo(String value) {
            addCriterion("JBZD_SUFFIX <=", value, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixLike(String value) {
            addCriterion("JBZD_SUFFIX like", value, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixNotLike(String value) {
            addCriterion("JBZD_SUFFIX not like", value, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixIn(List<String> values) {
            addCriterion("JBZD_SUFFIX in", values, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixNotIn(List<String> values) {
            addCriterion("JBZD_SUFFIX not in", values, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixBetween(String value1, String value2) {
            addCriterion("JBZD_SUFFIX between", value1, value2, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdSuffixNotBetween(String value1, String value2) {
            addCriterion("JBZD_SUFFIX not between", value1, value2, "jbzdSuffix");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusIsNull() {
            addCriterion("JBZD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusIsNotNull() {
            addCriterion("JBZD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusEqualTo(String value) {
            addCriterion("JBZD_STATUS =", value, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusNotEqualTo(String value) {
            addCriterion("JBZD_STATUS <>", value, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusGreaterThan(String value) {
            addCriterion("JBZD_STATUS >", value, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusGreaterThanOrEqualTo(String value) {
            addCriterion("JBZD_STATUS >=", value, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusLessThan(String value) {
            addCriterion("JBZD_STATUS <", value, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusLessThanOrEqualTo(String value) {
            addCriterion("JBZD_STATUS <=", value, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusLike(String value) {
            addCriterion("JBZD_STATUS like", value, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusNotLike(String value) {
            addCriterion("JBZD_STATUS not like", value, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusIn(List<String> values) {
            addCriterion("JBZD_STATUS in", values, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusNotIn(List<String> values) {
            addCriterion("JBZD_STATUS not in", values, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusBetween(String value1, String value2) {
            addCriterion("JBZD_STATUS between", value1, value2, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdStatusNotBetween(String value1, String value2) {
            addCriterion("JBZD_STATUS not between", value1, value2, "jbzdStatus");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmIsNull() {
            addCriterion("JBZD_PYSM is null");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmIsNotNull() {
            addCriterion("JBZD_PYSM is not null");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmEqualTo(String value) {
            addCriterion("JBZD_PYSM =", value, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmNotEqualTo(String value) {
            addCriterion("JBZD_PYSM <>", value, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmGreaterThan(String value) {
            addCriterion("JBZD_PYSM >", value, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmGreaterThanOrEqualTo(String value) {
            addCriterion("JBZD_PYSM >=", value, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmLessThan(String value) {
            addCriterion("JBZD_PYSM <", value, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmLessThanOrEqualTo(String value) {
            addCriterion("JBZD_PYSM <=", value, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmLike(String value) {
            addCriterion("JBZD_PYSM like", value, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmNotLike(String value) {
            addCriterion("JBZD_PYSM not like", value, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmIn(List<String> values) {
            addCriterion("JBZD_PYSM in", values, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmNotIn(List<String> values) {
            addCriterion("JBZD_PYSM not in", values, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmBetween(String value1, String value2) {
            addCriterion("JBZD_PYSM between", value1, value2, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andJbzdPysmNotBetween(String value1, String value2) {
            addCriterion("JBZD_PYSM not between", value1, value2, "jbzdPysm");
            return (Criteria) this;
        }

        public Criteria andShowOrderIsNull() {
            addCriterion("SHOW_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andShowOrderIsNotNull() {
            addCriterion("SHOW_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andShowOrderEqualTo(String value) {
            addCriterion("SHOW_ORDER =", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderNotEqualTo(String value) {
            addCriterion("SHOW_ORDER <>", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderGreaterThan(String value) {
            addCriterion("SHOW_ORDER >", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_ORDER >=", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderLessThan(String value) {
            addCriterion("SHOW_ORDER <", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderLessThanOrEqualTo(String value) {
            addCriterion("SHOW_ORDER <=", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderLike(String value) {
            addCriterion("SHOW_ORDER like", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderNotLike(String value) {
            addCriterion("SHOW_ORDER not like", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderIn(List<String> values) {
            addCriterion("SHOW_ORDER in", values, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderNotIn(List<String> values) {
            addCriterion("SHOW_ORDER not in", values, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderBetween(String value1, String value2) {
            addCriterion("SHOW_ORDER between", value1, value2, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderNotBetween(String value1, String value2) {
            addCriterion("SHOW_ORDER not between", value1, value2, "showOrder");
            return (Criteria) this;
        }

        public Criteria andIcd10IsNull() {
            addCriterion("ICD10 is null");
            return (Criteria) this;
        }

        public Criteria andIcd10IsNotNull() {
            addCriterion("ICD10 is not null");
            return (Criteria) this;
        }

        public Criteria andIcd10EqualTo(String value) {
            addCriterion("ICD10 =", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotEqualTo(String value) {
            addCriterion("ICD10 <>", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10GreaterThan(String value) {
            addCriterion("ICD10 >", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10GreaterThanOrEqualTo(String value) {
            addCriterion("ICD10 >=", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10LessThan(String value) {
            addCriterion("ICD10 <", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10LessThanOrEqualTo(String value) {
            addCriterion("ICD10 <=", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10Like(String value) {
            addCriterion("ICD10 like", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotLike(String value) {
            addCriterion("ICD10 not like", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10In(List<String> values) {
            addCriterion("ICD10 in", values, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotIn(List<String> values) {
            addCriterion("ICD10 not in", values, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10Between(String value1, String value2) {
            addCriterion("ICD10 between", value1, value2, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotBetween(String value1, String value2) {
            addCriterion("ICD10 not between", value1, value2, "icd10");
            return (Criteria) this;
        }

        public Criteria andOnsetDatIsNull() {
            addCriterion("ONSET_DAT is null");
            return (Criteria) this;
        }

        public Criteria andOnsetDatIsNotNull() {
            addCriterion("ONSET_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andOnsetDatEqualTo(Date value) {
            addCriterion("ONSET_DAT =", value, "onsetDat");
            return (Criteria) this;
        }

        public Criteria andOnsetDatNotEqualTo(Date value) {
            addCriterion("ONSET_DAT <>", value, "onsetDat");
            return (Criteria) this;
        }

        public Criteria andOnsetDatGreaterThan(Date value) {
            addCriterion("ONSET_DAT >", value, "onsetDat");
            return (Criteria) this;
        }

        public Criteria andOnsetDatGreaterThanOrEqualTo(Date value) {
            addCriterion("ONSET_DAT >=", value, "onsetDat");
            return (Criteria) this;
        }

        public Criteria andOnsetDatLessThan(Date value) {
            addCriterion("ONSET_DAT <", value, "onsetDat");
            return (Criteria) this;
        }

        public Criteria andOnsetDatLessThanOrEqualTo(Date value) {
            addCriterion("ONSET_DAT <=", value, "onsetDat");
            return (Criteria) this;
        }

        public Criteria andOnsetDatIn(List<Date> values) {
            addCriterion("ONSET_DAT in", values, "onsetDat");
            return (Criteria) this;
        }

        public Criteria andOnsetDatNotIn(List<Date> values) {
            addCriterion("ONSET_DAT not in", values, "onsetDat");
            return (Criteria) this;
        }

        public Criteria andOnsetDatBetween(Date value1, Date value2) {
            addCriterion("ONSET_DAT between", value1, value2, "onsetDat");
            return (Criteria) this;
        }

        public Criteria andOnsetDatNotBetween(Date value1, Date value2) {
            addCriterion("ONSET_DAT not between", value1, value2, "onsetDat");
            return (Criteria) this;
        }
    }

    /**
     * ZJYY.HSP_JBZD_INF
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ZJYY.HSP_JBZD_INF 2020-06-16
     */
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