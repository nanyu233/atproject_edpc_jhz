package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspConsultationRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspConsultationRecordsExample() {
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

        public Criteria andConsultationRecordsSeqIsNull() {
            addCriterion("CONSULTATION_RECORDS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqIsNotNull() {
            addCriterion("CONSULTATION_RECORDS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqEqualTo(String value) {
            addCriterion("CONSULTATION_RECORDS_SEQ =", value, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqNotEqualTo(String value) {
            addCriterion("CONSULTATION_RECORDS_SEQ <>", value, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqGreaterThan(String value) {
            addCriterion("CONSULTATION_RECORDS_SEQ >", value, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULTATION_RECORDS_SEQ >=", value, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqLessThan(String value) {
            addCriterion("CONSULTATION_RECORDS_SEQ <", value, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqLessThanOrEqualTo(String value) {
            addCriterion("CONSULTATION_RECORDS_SEQ <=", value, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqLike(String value) {
            addCriterion("CONSULTATION_RECORDS_SEQ like", value, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqNotLike(String value) {
            addCriterion("CONSULTATION_RECORDS_SEQ not like", value, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqIn(List<String> values) {
            addCriterion("CONSULTATION_RECORDS_SEQ in", values, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqNotIn(List<String> values) {
            addCriterion("CONSULTATION_RECORDS_SEQ not in", values, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqBetween(String value1, String value2) {
            addCriterion("CONSULTATION_RECORDS_SEQ between", value1, value2, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andConsultationRecordsSeqNotBetween(String value1, String value2) {
            addCriterion("CONSULTATION_RECORDS_SEQ not between", value1, value2, "consultationRecordsSeq");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrIsNull() {
            addCriterion("EMG_SEQ_CR is null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrIsNotNull() {
            addCriterion("EMG_SEQ_CR is not null");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrEqualTo(String value) {
            addCriterion("EMG_SEQ_CR =", value, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrNotEqualTo(String value) {
            addCriterion("EMG_SEQ_CR <>", value, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrGreaterThan(String value) {
            addCriterion("EMG_SEQ_CR >", value, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrGreaterThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ_CR >=", value, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrLessThan(String value) {
            addCriterion("EMG_SEQ_CR <", value, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrLessThanOrEqualTo(String value) {
            addCriterion("EMG_SEQ_CR <=", value, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrLike(String value) {
            addCriterion("EMG_SEQ_CR like", value, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrNotLike(String value) {
            addCriterion("EMG_SEQ_CR not like", value, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrIn(List<String> values) {
            addCriterion("EMG_SEQ_CR in", values, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrNotIn(List<String> values) {
            addCriterion("EMG_SEQ_CR not in", values, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrBetween(String value1, String value2) {
            addCriterion("EMG_SEQ_CR between", value1, value2, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andEmgSeqCrNotBetween(String value1, String value2) {
            addCriterion("EMG_SEQ_CR not between", value1, value2, "emgSeqCr");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateIsNull() {
            addCriterion("APPLY_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateIsNotNull() {
            addCriterion("APPLY_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateEqualTo(Date value) {
            addCriterion("APPLY_CREATE_DATE =", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateNotEqualTo(Date value) {
            addCriterion("APPLY_CREATE_DATE <>", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateGreaterThan(Date value) {
            addCriterion("APPLY_CREATE_DATE >", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_CREATE_DATE >=", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateLessThan(Date value) {
            addCriterion("APPLY_CREATE_DATE <", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_CREATE_DATE <=", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateIn(List<Date> values) {
            addCriterion("APPLY_CREATE_DATE in", values, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateNotIn(List<Date> values) {
            addCriterion("APPLY_CREATE_DATE not in", values, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateBetween(Date value1, Date value2) {
            addCriterion("APPLY_CREATE_DATE between", value1, value2, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_CREATE_DATE not between", value1, value2, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andInvitationDateIsNull() {
            addCriterion("INVITATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInvitationDateIsNotNull() {
            addCriterion("INVITATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationDateEqualTo(Date value) {
            addCriterion("INVITATION_DATE =", value, "invitationDate");
            return (Criteria) this;
        }

        public Criteria andInvitationDateNotEqualTo(Date value) {
            addCriterion("INVITATION_DATE <>", value, "invitationDate");
            return (Criteria) this;
        }

        public Criteria andInvitationDateGreaterThan(Date value) {
            addCriterion("INVITATION_DATE >", value, "invitationDate");
            return (Criteria) this;
        }

        public Criteria andInvitationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INVITATION_DATE >=", value, "invitationDate");
            return (Criteria) this;
        }

        public Criteria andInvitationDateLessThan(Date value) {
            addCriterion("INVITATION_DATE <", value, "invitationDate");
            return (Criteria) this;
        }

        public Criteria andInvitationDateLessThanOrEqualTo(Date value) {
            addCriterion("INVITATION_DATE <=", value, "invitationDate");
            return (Criteria) this;
        }

        public Criteria andInvitationDateIn(List<Date> values) {
            addCriterion("INVITATION_DATE in", values, "invitationDate");
            return (Criteria) this;
        }

        public Criteria andInvitationDateNotIn(List<Date> values) {
            addCriterion("INVITATION_DATE not in", values, "invitationDate");
            return (Criteria) this;
        }

        public Criteria andInvitationDateBetween(Date value1, Date value2) {
            addCriterion("INVITATION_DATE between", value1, value2, "invitationDate");
            return (Criteria) this;
        }

        public Criteria andInvitationDateNotBetween(Date value1, Date value2) {
            addCriterion("INVITATION_DATE not between", value1, value2, "invitationDate");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeIsNull() {
            addCriterion("INVITATION_DOC_NME is null");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeIsNotNull() {
            addCriterion("INVITATION_DOC_NME is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeEqualTo(String value) {
            addCriterion("INVITATION_DOC_NME =", value, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeNotEqualTo(String value) {
            addCriterion("INVITATION_DOC_NME <>", value, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeGreaterThan(String value) {
            addCriterion("INVITATION_DOC_NME >", value, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeGreaterThanOrEqualTo(String value) {
            addCriterion("INVITATION_DOC_NME >=", value, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeLessThan(String value) {
            addCriterion("INVITATION_DOC_NME <", value, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeLessThanOrEqualTo(String value) {
            addCriterion("INVITATION_DOC_NME <=", value, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeLike(String value) {
            addCriterion("INVITATION_DOC_NME like", value, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeNotLike(String value) {
            addCriterion("INVITATION_DOC_NME not like", value, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeIn(List<String> values) {
            addCriterion("INVITATION_DOC_NME in", values, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeNotIn(List<String> values) {
            addCriterion("INVITATION_DOC_NME not in", values, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeBetween(String value1, String value2) {
            addCriterion("INVITATION_DOC_NME between", value1, value2, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDocNmeNotBetween(String value1, String value2) {
            addCriterion("INVITATION_DOC_NME not between", value1, value2, "invitationDocNme");
            return (Criteria) this;
        }

        public Criteria andInvitationDepIsNull() {
            addCriterion("INVITATION_DEP is null");
            return (Criteria) this;
        }

        public Criteria andInvitationDepIsNotNull() {
            addCriterion("INVITATION_DEP is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationDepEqualTo(String value) {
            addCriterion("INVITATION_DEP =", value, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andInvitationDepNotEqualTo(String value) {
            addCriterion("INVITATION_DEP <>", value, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andInvitationDepGreaterThan(String value) {
            addCriterion("INVITATION_DEP >", value, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andInvitationDepGreaterThanOrEqualTo(String value) {
            addCriterion("INVITATION_DEP >=", value, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andInvitationDepLessThan(String value) {
            addCriterion("INVITATION_DEP <", value, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andInvitationDepLessThanOrEqualTo(String value) {
            addCriterion("INVITATION_DEP <=", value, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andInvitationDepLike(String value) {
            addCriterion("INVITATION_DEP like", value, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andInvitationDepNotLike(String value) {
            addCriterion("INVITATION_DEP not like", value, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andInvitationDepIn(List<String> values) {
            addCriterion("INVITATION_DEP in", values, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andInvitationDepNotIn(List<String> values) {
            addCriterion("INVITATION_DEP not in", values, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andInvitationDepBetween(String value1, String value2) {
            addCriterion("INVITATION_DEP between", value1, value2, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andInvitationDepNotBetween(String value1, String value2) {
            addCriterion("INVITATION_DEP not between", value1, value2, "invitationDep");
            return (Criteria) this;
        }

        public Criteria andApplyDocIsNull() {
            addCriterion("APPLY_DOC is null");
            return (Criteria) this;
        }

        public Criteria andApplyDocIsNotNull() {
            addCriterion("APPLY_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDocEqualTo(String value) {
            addCriterion("APPLY_DOC =", value, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andApplyDocNotEqualTo(String value) {
            addCriterion("APPLY_DOC <>", value, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andApplyDocGreaterThan(String value) {
            addCriterion("APPLY_DOC >", value, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andApplyDocGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DOC >=", value, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andApplyDocLessThan(String value) {
            addCriterion("APPLY_DOC <", value, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andApplyDocLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DOC <=", value, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andApplyDocLike(String value) {
            addCriterion("APPLY_DOC like", value, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andApplyDocNotLike(String value) {
            addCriterion("APPLY_DOC not like", value, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andApplyDocIn(List<String> values) {
            addCriterion("APPLY_DOC in", values, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andApplyDocNotIn(List<String> values) {
            addCriterion("APPLY_DOC not in", values, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andApplyDocBetween(String value1, String value2) {
            addCriterion("APPLY_DOC between", value1, value2, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andApplyDocNotBetween(String value1, String value2) {
            addCriterion("APPLY_DOC not between", value1, value2, "applyDoc");
            return (Criteria) this;
        }

        public Criteria andIllnessStateIsNull() {
            addCriterion("ILLNESS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andIllnessStateIsNotNull() {
            addCriterion("ILLNESS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andIllnessStateEqualTo(String value) {
            addCriterion("ILLNESS_STATE =", value, "illnessState");
            return (Criteria) this;
        }

        public Criteria andIllnessStateNotEqualTo(String value) {
            addCriterion("ILLNESS_STATE <>", value, "illnessState");
            return (Criteria) this;
        }

        public Criteria andIllnessStateGreaterThan(String value) {
            addCriterion("ILLNESS_STATE >", value, "illnessState");
            return (Criteria) this;
        }

        public Criteria andIllnessStateGreaterThanOrEqualTo(String value) {
            addCriterion("ILLNESS_STATE >=", value, "illnessState");
            return (Criteria) this;
        }

        public Criteria andIllnessStateLessThan(String value) {
            addCriterion("ILLNESS_STATE <", value, "illnessState");
            return (Criteria) this;
        }

        public Criteria andIllnessStateLessThanOrEqualTo(String value) {
            addCriterion("ILLNESS_STATE <=", value, "illnessState");
            return (Criteria) this;
        }

        public Criteria andIllnessStateLike(String value) {
            addCriterion("ILLNESS_STATE like", value, "illnessState");
            return (Criteria) this;
        }

        public Criteria andIllnessStateNotLike(String value) {
            addCriterion("ILLNESS_STATE not like", value, "illnessState");
            return (Criteria) this;
        }

        public Criteria andIllnessStateIn(List<String> values) {
            addCriterion("ILLNESS_STATE in", values, "illnessState");
            return (Criteria) this;
        }

        public Criteria andIllnessStateNotIn(List<String> values) {
            addCriterion("ILLNESS_STATE not in", values, "illnessState");
            return (Criteria) this;
        }

        public Criteria andIllnessStateBetween(String value1, String value2) {
            addCriterion("ILLNESS_STATE between", value1, value2, "illnessState");
            return (Criteria) this;
        }

        public Criteria andIllnessStateNotBetween(String value1, String value2) {
            addCriterion("ILLNESS_STATE not between", value1, value2, "illnessState");
            return (Criteria) this;
        }

        public Criteria andObjectiveIsNull() {
            addCriterion("OBJECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andObjectiveIsNotNull() {
            addCriterion("OBJECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andObjectiveEqualTo(String value) {
            addCriterion("OBJECTIVE =", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotEqualTo(String value) {
            addCriterion("OBJECTIVE <>", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveGreaterThan(String value) {
            addCriterion("OBJECTIVE >", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECTIVE >=", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveLessThan(String value) {
            addCriterion("OBJECTIVE <", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveLessThanOrEqualTo(String value) {
            addCriterion("OBJECTIVE <=", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveLike(String value) {
            addCriterion("OBJECTIVE like", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotLike(String value) {
            addCriterion("OBJECTIVE not like", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveIn(List<String> values) {
            addCriterion("OBJECTIVE in", values, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotIn(List<String> values) {
            addCriterion("OBJECTIVE not in", values, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveBetween(String value1, String value2) {
            addCriterion("OBJECTIVE between", value1, value2, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotBetween(String value1, String value2) {
            addCriterion("OBJECTIVE not between", value1, value2, "objective");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNull() {
            addCriterion("REPLY_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNotNull() {
            addCriterion("REPLY_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andReplyContentEqualTo(String value) {
            addCriterion("REPLY_CONTENT =", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotEqualTo(String value) {
            addCriterion("REPLY_CONTENT <>", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThan(String value) {
            addCriterion("REPLY_CONTENT >", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_CONTENT >=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThan(String value) {
            addCriterion("REPLY_CONTENT <", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThanOrEqualTo(String value) {
            addCriterion("REPLY_CONTENT <=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLike(String value) {
            addCriterion("REPLY_CONTENT like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotLike(String value) {
            addCriterion("REPLY_CONTENT not like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentIn(List<String> values) {
            addCriterion("REPLY_CONTENT in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotIn(List<String> values) {
            addCriterion("REPLY_CONTENT not in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentBetween(String value1, String value2) {
            addCriterion("REPLY_CONTENT between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotBetween(String value1, String value2) {
            addCriterion("REPLY_CONTENT not between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andConsultationDateIsNull() {
            addCriterion("CONSULTATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andConsultationDateIsNotNull() {
            addCriterion("CONSULTATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andConsultationDateEqualTo(Date value) {
            addCriterion("CONSULTATION_DATE =", value, "consultationDate");
            return (Criteria) this;
        }

        public Criteria andConsultationDateNotEqualTo(Date value) {
            addCriterion("CONSULTATION_DATE <>", value, "consultationDate");
            return (Criteria) this;
        }

        public Criteria andConsultationDateGreaterThan(Date value) {
            addCriterion("CONSULTATION_DATE >", value, "consultationDate");
            return (Criteria) this;
        }

        public Criteria andConsultationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONSULTATION_DATE >=", value, "consultationDate");
            return (Criteria) this;
        }

        public Criteria andConsultationDateLessThan(Date value) {
            addCriterion("CONSULTATION_DATE <", value, "consultationDate");
            return (Criteria) this;
        }

        public Criteria andConsultationDateLessThanOrEqualTo(Date value) {
            addCriterion("CONSULTATION_DATE <=", value, "consultationDate");
            return (Criteria) this;
        }

        public Criteria andConsultationDateIn(List<Date> values) {
            addCriterion("CONSULTATION_DATE in", values, "consultationDate");
            return (Criteria) this;
        }

        public Criteria andConsultationDateNotIn(List<Date> values) {
            addCriterion("CONSULTATION_DATE not in", values, "consultationDate");
            return (Criteria) this;
        }

        public Criteria andConsultationDateBetween(Date value1, Date value2) {
            addCriterion("CONSULTATION_DATE between", value1, value2, "consultationDate");
            return (Criteria) this;
        }

        public Criteria andConsultationDateNotBetween(Date value1, Date value2) {
            addCriterion("CONSULTATION_DATE not between", value1, value2, "consultationDate");
            return (Criteria) this;
        }

        public Criteria andReplyDepIsNull() {
            addCriterion("REPLY_DEP is null");
            return (Criteria) this;
        }

        public Criteria andReplyDepIsNotNull() {
            addCriterion("REPLY_DEP is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDepEqualTo(String value) {
            addCriterion("REPLY_DEP =", value, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDepNotEqualTo(String value) {
            addCriterion("REPLY_DEP <>", value, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDepGreaterThan(String value) {
            addCriterion("REPLY_DEP >", value, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDepGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_DEP >=", value, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDepLessThan(String value) {
            addCriterion("REPLY_DEP <", value, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDepLessThanOrEqualTo(String value) {
            addCriterion("REPLY_DEP <=", value, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDepLike(String value) {
            addCriterion("REPLY_DEP like", value, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDepNotLike(String value) {
            addCriterion("REPLY_DEP not like", value, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDepIn(List<String> values) {
            addCriterion("REPLY_DEP in", values, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDepNotIn(List<String> values) {
            addCriterion("REPLY_DEP not in", values, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDepBetween(String value1, String value2) {
            addCriterion("REPLY_DEP between", value1, value2, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDepNotBetween(String value1, String value2) {
            addCriterion("REPLY_DEP not between", value1, value2, "replyDep");
            return (Criteria) this;
        }

        public Criteria andReplyDocIsNull() {
            addCriterion("REPLY_DOC is null");
            return (Criteria) this;
        }

        public Criteria andReplyDocIsNotNull() {
            addCriterion("REPLY_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDocEqualTo(String value) {
            addCriterion("REPLY_DOC =", value, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyDocNotEqualTo(String value) {
            addCriterion("REPLY_DOC <>", value, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyDocGreaterThan(String value) {
            addCriterion("REPLY_DOC >", value, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyDocGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_DOC >=", value, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyDocLessThan(String value) {
            addCriterion("REPLY_DOC <", value, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyDocLessThanOrEqualTo(String value) {
            addCriterion("REPLY_DOC <=", value, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyDocLike(String value) {
            addCriterion("REPLY_DOC like", value, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyDocNotLike(String value) {
            addCriterion("REPLY_DOC not like", value, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyDocIn(List<String> values) {
            addCriterion("REPLY_DOC in", values, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyDocNotIn(List<String> values) {
            addCriterion("REPLY_DOC not in", values, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyDocBetween(String value1, String value2) {
            addCriterion("REPLY_DOC between", value1, value2, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyDocNotBetween(String value1, String value2) {
            addCriterion("REPLY_DOC not between", value1, value2, "replyDoc");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateIsNull() {
            addCriterion("REPLY_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateIsNotNull() {
            addCriterion("REPLY_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateEqualTo(Date value) {
            addCriterion("REPLY_CREATE_DATE =", value, "replyCreateDate");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateNotEqualTo(Date value) {
            addCriterion("REPLY_CREATE_DATE <>", value, "replyCreateDate");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateGreaterThan(Date value) {
            addCriterion("REPLY_CREATE_DATE >", value, "replyCreateDate");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REPLY_CREATE_DATE >=", value, "replyCreateDate");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateLessThan(Date value) {
            addCriterion("REPLY_CREATE_DATE <", value, "replyCreateDate");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("REPLY_CREATE_DATE <=", value, "replyCreateDate");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateIn(List<Date> values) {
            addCriterion("REPLY_CREATE_DATE in", values, "replyCreateDate");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateNotIn(List<Date> values) {
            addCriterion("REPLY_CREATE_DATE not in", values, "replyCreateDate");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateBetween(Date value1, Date value2) {
            addCriterion("REPLY_CREATE_DATE between", value1, value2, "replyCreateDate");
            return (Criteria) this;
        }

        public Criteria andReplyCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("REPLY_CREATE_DATE not between", value1, value2, "replyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocIsNull() {
            addCriterion("APPLY_UPDATE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocIsNotNull() {
            addCriterion("APPLY_UPDATE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocEqualTo(String value) {
            addCriterion("APPLY_UPDATE_DOC =", value, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocNotEqualTo(String value) {
            addCriterion("APPLY_UPDATE_DOC <>", value, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocGreaterThan(String value) {
            addCriterion("APPLY_UPDATE_DOC >", value, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_UPDATE_DOC >=", value, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocLessThan(String value) {
            addCriterion("APPLY_UPDATE_DOC <", value, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocLessThanOrEqualTo(String value) {
            addCriterion("APPLY_UPDATE_DOC <=", value, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocLike(String value) {
            addCriterion("APPLY_UPDATE_DOC like", value, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocNotLike(String value) {
            addCriterion("APPLY_UPDATE_DOC not like", value, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocIn(List<String> values) {
            addCriterion("APPLY_UPDATE_DOC in", values, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocNotIn(List<String> values) {
            addCriterion("APPLY_UPDATE_DOC not in", values, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocBetween(String value1, String value2) {
            addCriterion("APPLY_UPDATE_DOC between", value1, value2, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDocNotBetween(String value1, String value2) {
            addCriterion("APPLY_UPDATE_DOC not between", value1, value2, "applyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateIsNull() {
            addCriterion("APPLY_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateIsNotNull() {
            addCriterion("APPLY_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateEqualTo(Date value) {
            addCriterion("APPLY_UPDATE_DATE =", value, "applyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateNotEqualTo(Date value) {
            addCriterion("APPLY_UPDATE_DATE <>", value, "applyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateGreaterThan(Date value) {
            addCriterion("APPLY_UPDATE_DATE >", value, "applyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_UPDATE_DATE >=", value, "applyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateLessThan(Date value) {
            addCriterion("APPLY_UPDATE_DATE <", value, "applyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_UPDATE_DATE <=", value, "applyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateIn(List<Date> values) {
            addCriterion("APPLY_UPDATE_DATE in", values, "applyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateNotIn(List<Date> values) {
            addCriterion("APPLY_UPDATE_DATE not in", values, "applyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateBetween(Date value1, Date value2) {
            addCriterion("APPLY_UPDATE_DATE between", value1, value2, "applyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andApplyUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_UPDATE_DATE not between", value1, value2, "applyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocIsNull() {
            addCriterion("REPLY_UPDATE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocIsNotNull() {
            addCriterion("REPLY_UPDATE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocEqualTo(String value) {
            addCriterion("REPLY_UPDATE_DOC =", value, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocNotEqualTo(String value) {
            addCriterion("REPLY_UPDATE_DOC <>", value, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocGreaterThan(String value) {
            addCriterion("REPLY_UPDATE_DOC >", value, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_UPDATE_DOC >=", value, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocLessThan(String value) {
            addCriterion("REPLY_UPDATE_DOC <", value, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocLessThanOrEqualTo(String value) {
            addCriterion("REPLY_UPDATE_DOC <=", value, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocLike(String value) {
            addCriterion("REPLY_UPDATE_DOC like", value, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocNotLike(String value) {
            addCriterion("REPLY_UPDATE_DOC not like", value, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocIn(List<String> values) {
            addCriterion("REPLY_UPDATE_DOC in", values, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocNotIn(List<String> values) {
            addCriterion("REPLY_UPDATE_DOC not in", values, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocBetween(String value1, String value2) {
            addCriterion("REPLY_UPDATE_DOC between", value1, value2, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDocNotBetween(String value1, String value2) {
            addCriterion("REPLY_UPDATE_DOC not between", value1, value2, "replyUpdateDoc");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateIsNull() {
            addCriterion("REPLY_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateIsNotNull() {
            addCriterion("REPLY_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateEqualTo(Date value) {
            addCriterion("REPLY_UPDATE_DATE =", value, "replyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateNotEqualTo(Date value) {
            addCriterion("REPLY_UPDATE_DATE <>", value, "replyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateGreaterThan(Date value) {
            addCriterion("REPLY_UPDATE_DATE >", value, "replyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REPLY_UPDATE_DATE >=", value, "replyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateLessThan(Date value) {
            addCriterion("REPLY_UPDATE_DATE <", value, "replyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("REPLY_UPDATE_DATE <=", value, "replyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateIn(List<Date> values) {
            addCriterion("REPLY_UPDATE_DATE in", values, "replyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateNotIn(List<Date> values) {
            addCriterion("REPLY_UPDATE_DATE not in", values, "replyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateBetween(Date value1, Date value2) {
            addCriterion("REPLY_UPDATE_DATE between", value1, value2, "replyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andReplyUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("REPLY_UPDATE_DATE not between", value1, value2, "replyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andReplySrcIsNull() {
            addCriterion("REPLY_SRC is null");
            return (Criteria) this;
        }

        public Criteria andReplySrcIsNotNull() {
            addCriterion("REPLY_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andReplySrcEqualTo(String value) {
            addCriterion("REPLY_SRC =", value, "replySrc");
            return (Criteria) this;
        }

        public Criteria andReplySrcNotEqualTo(String value) {
            addCriterion("REPLY_SRC <>", value, "replySrc");
            return (Criteria) this;
        }

        public Criteria andReplySrcGreaterThan(String value) {
            addCriterion("REPLY_SRC >", value, "replySrc");
            return (Criteria) this;
        }

        public Criteria andReplySrcGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_SRC >=", value, "replySrc");
            return (Criteria) this;
        }

        public Criteria andReplySrcLessThan(String value) {
            addCriterion("REPLY_SRC <", value, "replySrc");
            return (Criteria) this;
        }

        public Criteria andReplySrcLessThanOrEqualTo(String value) {
            addCriterion("REPLY_SRC <=", value, "replySrc");
            return (Criteria) this;
        }

        public Criteria andReplySrcLike(String value) {
            addCriterion("REPLY_SRC like", value, "replySrc");
            return (Criteria) this;
        }

        public Criteria andReplySrcNotLike(String value) {
            addCriterion("REPLY_SRC not like", value, "replySrc");
            return (Criteria) this;
        }

        public Criteria andReplySrcIn(List<String> values) {
            addCriterion("REPLY_SRC in", values, "replySrc");
            return (Criteria) this;
        }

        public Criteria andReplySrcNotIn(List<String> values) {
            addCriterion("REPLY_SRC not in", values, "replySrc");
            return (Criteria) this;
        }

        public Criteria andReplySrcBetween(String value1, String value2) {
            addCriterion("REPLY_SRC between", value1, value2, "replySrc");
            return (Criteria) this;
        }

        public Criteria andReplySrcNotBetween(String value1, String value2) {
            addCriterion("REPLY_SRC not between", value1, value2, "replySrc");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodIsNull() {
            addCriterion("INVITATION_DOC_COD is null");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodIsNotNull() {
            addCriterion("INVITATION_DOC_COD is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodEqualTo(String value) {
            addCriterion("INVITATION_DOC_COD =", value, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodNotEqualTo(String value) {
            addCriterion("INVITATION_DOC_COD <>", value, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodGreaterThan(String value) {
            addCriterion("INVITATION_DOC_COD >", value, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodGreaterThanOrEqualTo(String value) {
            addCriterion("INVITATION_DOC_COD >=", value, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodLessThan(String value) {
            addCriterion("INVITATION_DOC_COD <", value, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodLessThanOrEqualTo(String value) {
            addCriterion("INVITATION_DOC_COD <=", value, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodLike(String value) {
            addCriterion("INVITATION_DOC_COD like", value, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodNotLike(String value) {
            addCriterion("INVITATION_DOC_COD not like", value, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodIn(List<String> values) {
            addCriterion("INVITATION_DOC_COD in", values, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodNotIn(List<String> values) {
            addCriterion("INVITATION_DOC_COD not in", values, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodBetween(String value1, String value2) {
            addCriterion("INVITATION_DOC_COD between", value1, value2, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andInvitationDocCodNotBetween(String value1, String value2) {
            addCriterion("INVITATION_DOC_COD not between", value1, value2, "invitationDocCod");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameIsNull() {
            addCriterion("APPLY_DOC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameIsNotNull() {
            addCriterion("APPLY_DOC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameEqualTo(String value) {
            addCriterion("APPLY_DOC_NAME =", value, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameNotEqualTo(String value) {
            addCriterion("APPLY_DOC_NAME <>", value, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameGreaterThan(String value) {
            addCriterion("APPLY_DOC_NAME >", value, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DOC_NAME >=", value, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameLessThan(String value) {
            addCriterion("APPLY_DOC_NAME <", value, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DOC_NAME <=", value, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameLike(String value) {
            addCriterion("APPLY_DOC_NAME like", value, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameNotLike(String value) {
            addCriterion("APPLY_DOC_NAME not like", value, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameIn(List<String> values) {
            addCriterion("APPLY_DOC_NAME in", values, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameNotIn(List<String> values) {
            addCriterion("APPLY_DOC_NAME not in", values, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameBetween(String value1, String value2) {
            addCriterion("APPLY_DOC_NAME between", value1, value2, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andApplyDocNameNotBetween(String value1, String value2) {
            addCriterion("APPLY_DOC_NAME not between", value1, value2, "applyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameIsNull() {
            addCriterion("REPLY_DOC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameIsNotNull() {
            addCriterion("REPLY_DOC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameEqualTo(String value) {
            addCriterion("REPLY_DOC_NAME =", value, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameNotEqualTo(String value) {
            addCriterion("REPLY_DOC_NAME <>", value, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameGreaterThan(String value) {
            addCriterion("REPLY_DOC_NAME >", value, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_DOC_NAME >=", value, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameLessThan(String value) {
            addCriterion("REPLY_DOC_NAME <", value, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameLessThanOrEqualTo(String value) {
            addCriterion("REPLY_DOC_NAME <=", value, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameLike(String value) {
            addCriterion("REPLY_DOC_NAME like", value, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameNotLike(String value) {
            addCriterion("REPLY_DOC_NAME not like", value, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameIn(List<String> values) {
            addCriterion("REPLY_DOC_NAME in", values, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameNotIn(List<String> values) {
            addCriterion("REPLY_DOC_NAME not in", values, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameBetween(String value1, String value2) {
            addCriterion("REPLY_DOC_NAME between", value1, value2, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andReplyDocNameNotBetween(String value1, String value2) {
            addCriterion("REPLY_DOC_NAME not between", value1, value2, "replyDocName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameIsNull() {
            addCriterion("QDHS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andQdhsNameIsNotNull() {
            addCriterion("QDHS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andQdhsNameEqualTo(String value) {
            addCriterion("QDHS_NAME =", value, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameNotEqualTo(String value) {
            addCriterion("QDHS_NAME <>", value, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameGreaterThan(String value) {
            addCriterion("QDHS_NAME >", value, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameGreaterThanOrEqualTo(String value) {
            addCriterion("QDHS_NAME >=", value, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameLessThan(String value) {
            addCriterion("QDHS_NAME <", value, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameLessThanOrEqualTo(String value) {
            addCriterion("QDHS_NAME <=", value, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameLike(String value) {
            addCriterion("QDHS_NAME like", value, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameNotLike(String value) {
            addCriterion("QDHS_NAME not like", value, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameIn(List<String> values) {
            addCriterion("QDHS_NAME in", values, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameNotIn(List<String> values) {
            addCriterion("QDHS_NAME not in", values, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameBetween(String value1, String value2) {
            addCriterion("QDHS_NAME between", value1, value2, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsNameNotBetween(String value1, String value2) {
            addCriterion("QDHS_NAME not between", value1, value2, "qdhsName");
            return (Criteria) this;
        }

        public Criteria andQdhsDateIsNull() {
            addCriterion("QDHS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andQdhsDateIsNotNull() {
            addCriterion("QDHS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andQdhsDateEqualTo(Date value) {
            addCriterion("QDHS_DATE =", value, "qdhsDate");
            return (Criteria) this;
        }

        public Criteria andQdhsDateNotEqualTo(Date value) {
            addCriterion("QDHS_DATE <>", value, "qdhsDate");
            return (Criteria) this;
        }

        public Criteria andQdhsDateGreaterThan(Date value) {
            addCriterion("QDHS_DATE >", value, "qdhsDate");
            return (Criteria) this;
        }

        public Criteria andQdhsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("QDHS_DATE >=", value, "qdhsDate");
            return (Criteria) this;
        }

        public Criteria andQdhsDateLessThan(Date value) {
            addCriterion("QDHS_DATE <", value, "qdhsDate");
            return (Criteria) this;
        }

        public Criteria andQdhsDateLessThanOrEqualTo(Date value) {
            addCriterion("QDHS_DATE <=", value, "qdhsDate");
            return (Criteria) this;
        }

        public Criteria andQdhsDateIn(List<Date> values) {
            addCriterion("QDHS_DATE in", values, "qdhsDate");
            return (Criteria) this;
        }

        public Criteria andQdhsDateNotIn(List<Date> values) {
            addCriterion("QDHS_DATE not in", values, "qdhsDate");
            return (Criteria) this;
        }

        public Criteria andQdhsDateBetween(Date value1, Date value2) {
            addCriterion("QDHS_DATE between", value1, value2, "qdhsDate");
            return (Criteria) this;
        }

        public Criteria andQdhsDateNotBetween(Date value1, Date value2) {
            addCriterion("QDHS_DATE not between", value1, value2, "qdhsDate");
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