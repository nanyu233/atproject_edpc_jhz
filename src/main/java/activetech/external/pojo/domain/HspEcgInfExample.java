package activetech.external.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HspEcgInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspEcgInfExample() {
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

        public Criteria andEcgSeqIsNull() {
            addCriterion("ECG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andEcgSeqIsNotNull() {
            addCriterion("ECG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andEcgSeqEqualTo(String value) {
            addCriterion("ECG_SEQ =", value, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andEcgSeqNotEqualTo(String value) {
            addCriterion("ECG_SEQ <>", value, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andEcgSeqGreaterThan(String value) {
            addCriterion("ECG_SEQ >", value, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andEcgSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ECG_SEQ >=", value, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andEcgSeqLessThan(String value) {
            addCriterion("ECG_SEQ <", value, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andEcgSeqLessThanOrEqualTo(String value) {
            addCriterion("ECG_SEQ <=", value, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andEcgSeqLike(String value) {
            addCriterion("ECG_SEQ like", value, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andEcgSeqNotLike(String value) {
            addCriterion("ECG_SEQ not like", value, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andEcgSeqIn(List<String> values) {
            addCriterion("ECG_SEQ in", values, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andEcgSeqNotIn(List<String> values) {
            addCriterion("ECG_SEQ not in", values, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andEcgSeqBetween(String value1, String value2) {
            addCriterion("ECG_SEQ between", value1, value2, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andEcgSeqNotBetween(String value1, String value2) {
            addCriterion("ECG_SEQ not between", value1, value2, "ecgSeq");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNull() {
            addCriterion("REF_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("REF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(String value) {
            addCriterion("REF_ID =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(String value) {
            addCriterion("REF_ID <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(String value) {
            addCriterion("REF_ID >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("REF_ID >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(String value) {
            addCriterion("REF_ID <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(String value) {
            addCriterion("REF_ID <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLike(String value) {
            addCriterion("REF_ID like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotLike(String value) {
            addCriterion("REF_ID not like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<String> values) {
            addCriterion("REF_ID in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<String> values) {
            addCriterion("REF_ID not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(String value1, String value2) {
            addCriterion("REF_ID between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(String value1, String value2) {
            addCriterion("REF_ID not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andEcgTypeIsNull() {
            addCriterion("ECG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEcgTypeIsNotNull() {
            addCriterion("ECG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEcgTypeEqualTo(String value) {
            addCriterion("ECG_TYPE =", value, "ecgType");
            return (Criteria) this;
        }

        public Criteria andEcgTypeNotEqualTo(String value) {
            addCriterion("ECG_TYPE <>", value, "ecgType");
            return (Criteria) this;
        }

        public Criteria andEcgTypeGreaterThan(String value) {
            addCriterion("ECG_TYPE >", value, "ecgType");
            return (Criteria) this;
        }

        public Criteria andEcgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ECG_TYPE >=", value, "ecgType");
            return (Criteria) this;
        }

        public Criteria andEcgTypeLessThan(String value) {
            addCriterion("ECG_TYPE <", value, "ecgType");
            return (Criteria) this;
        }

        public Criteria andEcgTypeLessThanOrEqualTo(String value) {
            addCriterion("ECG_TYPE <=", value, "ecgType");
            return (Criteria) this;
        }

        public Criteria andEcgTypeLike(String value) {
            addCriterion("ECG_TYPE like", value, "ecgType");
            return (Criteria) this;
        }

        public Criteria andEcgTypeNotLike(String value) {
            addCriterion("ECG_TYPE not like", value, "ecgType");
            return (Criteria) this;
        }

        public Criteria andEcgTypeIn(List<String> values) {
            addCriterion("ECG_TYPE in", values, "ecgType");
            return (Criteria) this;
        }

        public Criteria andEcgTypeNotIn(List<String> values) {
            addCriterion("ECG_TYPE not in", values, "ecgType");
            return (Criteria) this;
        }

        public Criteria andEcgTypeBetween(String value1, String value2) {
            addCriterion("ECG_TYPE between", value1, value2, "ecgType");
            return (Criteria) this;
        }

        public Criteria andEcgTypeNotBetween(String value1, String value2) {
            addCriterion("ECG_TYPE not between", value1, value2, "ecgType");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileDateIsNull() {
            addCriterion("FILE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFileDateIsNotNull() {
            addCriterion("FILE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFileDateEqualTo(Date value) {
            addCriterion("FILE_DATE =", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateNotEqualTo(Date value) {
            addCriterion("FILE_DATE <>", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateGreaterThan(Date value) {
            addCriterion("FILE_DATE >", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FILE_DATE >=", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateLessThan(Date value) {
            addCriterion("FILE_DATE <", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateLessThanOrEqualTo(Date value) {
            addCriterion("FILE_DATE <=", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateIn(List<Date> values) {
            addCriterion("FILE_DATE in", values, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateNotIn(List<Date> values) {
            addCriterion("FILE_DATE not in", values, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateBetween(Date value1, Date value2) {
            addCriterion("FILE_DATE between", value1, value2, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateNotBetween(Date value1, Date value2) {
            addCriterion("FILE_DATE not between", value1, value2, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateIsNull() {
            addCriterion("FILE_TRS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateIsNotNull() {
            addCriterion("FILE_TRS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateEqualTo(Date value) {
            addCriterion("FILE_TRS_DATE =", value, "fileTrsDate");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateNotEqualTo(Date value) {
            addCriterion("FILE_TRS_DATE <>", value, "fileTrsDate");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateGreaterThan(Date value) {
            addCriterion("FILE_TRS_DATE >", value, "fileTrsDate");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FILE_TRS_DATE >=", value, "fileTrsDate");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateLessThan(Date value) {
            addCriterion("FILE_TRS_DATE <", value, "fileTrsDate");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateLessThanOrEqualTo(Date value) {
            addCriterion("FILE_TRS_DATE <=", value, "fileTrsDate");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateIn(List<Date> values) {
            addCriterion("FILE_TRS_DATE in", values, "fileTrsDate");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateNotIn(List<Date> values) {
            addCriterion("FILE_TRS_DATE not in", values, "fileTrsDate");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateBetween(Date value1, Date value2) {
            addCriterion("FILE_TRS_DATE between", value1, value2, "fileTrsDate");
            return (Criteria) this;
        }

        public Criteria andFileTrsDateNotBetween(Date value1, Date value2) {
            addCriterion("FILE_TRS_DATE not between", value1, value2, "fileTrsDate");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateIsNull() {
            addCriterion("FILE_DIA_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateIsNotNull() {
            addCriterion("FILE_DIA_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateEqualTo(Date value) {
            addCriterion("FILE_DIA_DATE =", value, "fileDiaDate");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateNotEqualTo(Date value) {
            addCriterion("FILE_DIA_DATE <>", value, "fileDiaDate");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateGreaterThan(Date value) {
            addCriterion("FILE_DIA_DATE >", value, "fileDiaDate");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FILE_DIA_DATE >=", value, "fileDiaDate");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateLessThan(Date value) {
            addCriterion("FILE_DIA_DATE <", value, "fileDiaDate");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateLessThanOrEqualTo(Date value) {
            addCriterion("FILE_DIA_DATE <=", value, "fileDiaDate");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateIn(List<Date> values) {
            addCriterion("FILE_DIA_DATE in", values, "fileDiaDate");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateNotIn(List<Date> values) {
            addCriterion("FILE_DIA_DATE not in", values, "fileDiaDate");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateBetween(Date value1, Date value2) {
            addCriterion("FILE_DIA_DATE between", value1, value2, "fileDiaDate");
            return (Criteria) this;
        }

        public Criteria andFileDiaDateNotBetween(Date value1, Date value2) {
            addCriterion("FILE_DIA_DATE not between", value1, value2, "fileDiaDate");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("FILE_PATH =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("FILE_PATH <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("FILE_PATH >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_PATH >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("FILE_PATH <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("FILE_PATH <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("FILE_PATH like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("FILE_PATH not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("FILE_PATH in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("FILE_PATH not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("FILE_PATH between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("FILE_PATH not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("FILE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("FILE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("FILE_TYPE =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("FILE_TYPE <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("FILE_TYPE >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_TYPE >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("FILE_TYPE <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("FILE_TYPE <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("FILE_TYPE like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("FILE_TYPE not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("FILE_TYPE in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("FILE_TYPE not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("FILE_TYPE between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("FILE_TYPE not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andAppNoIsNull() {
            addCriterion("APP_NO is null");
            return (Criteria) this;
        }

        public Criteria andAppNoIsNotNull() {
            addCriterion("APP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAppNoEqualTo(String value) {
            addCriterion("APP_NO =", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotEqualTo(String value) {
            addCriterion("APP_NO <>", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoGreaterThan(String value) {
            addCriterion("APP_NO >", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoGreaterThanOrEqualTo(String value) {
            addCriterion("APP_NO >=", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoLessThan(String value) {
            addCriterion("APP_NO <", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoLessThanOrEqualTo(String value) {
            addCriterion("APP_NO <=", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoLike(String value) {
            addCriterion("APP_NO like", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotLike(String value) {
            addCriterion("APP_NO not like", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoIn(List<String> values) {
            addCriterion("APP_NO in", values, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotIn(List<String> values) {
            addCriterion("APP_NO not in", values, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoBetween(String value1, String value2) {
            addCriterion("APP_NO between", value1, value2, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotBetween(String value1, String value2) {
            addCriterion("APP_NO not between", value1, value2, "appNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoIsNull() {
            addCriterion("MPI_NO is null");
            return (Criteria) this;
        }

        public Criteria andMpiNoIsNotNull() {
            addCriterion("MPI_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMpiNoEqualTo(String value) {
            addCriterion("MPI_NO =", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoNotEqualTo(String value) {
            addCriterion("MPI_NO <>", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoGreaterThan(String value) {
            addCriterion("MPI_NO >", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoGreaterThanOrEqualTo(String value) {
            addCriterion("MPI_NO >=", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoLessThan(String value) {
            addCriterion("MPI_NO <", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoLessThanOrEqualTo(String value) {
            addCriterion("MPI_NO <=", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoLike(String value) {
            addCriterion("MPI_NO like", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoNotLike(String value) {
            addCriterion("MPI_NO not like", value, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoIn(List<String> values) {
            addCriterion("MPI_NO in", values, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoNotIn(List<String> values) {
            addCriterion("MPI_NO not in", values, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoBetween(String value1, String value2) {
            addCriterion("MPI_NO between", value1, value2, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andMpiNoNotBetween(String value1, String value2) {
            addCriterion("MPI_NO not between", value1, value2, "mpiNo");
            return (Criteria) this;
        }

        public Criteria andSadIdIsNull() {
            addCriterion("SAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andSadIdIsNotNull() {
            addCriterion("SAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSadIdEqualTo(Integer value) {
            addCriterion("SAD_ID =", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdNotEqualTo(Integer value) {
            addCriterion("SAD_ID <>", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdGreaterThan(Integer value) {
            addCriterion("SAD_ID >", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAD_ID >=", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdLessThan(Integer value) {
            addCriterion("SAD_ID <", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdLessThanOrEqualTo(Integer value) {
            addCriterion("SAD_ID <=", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdIn(List<Integer> values) {
            addCriterion("SAD_ID in", values, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdNotIn(List<Integer> values) {
            addCriterion("SAD_ID not in", values, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdBetween(Integer value1, Integer value2) {
            addCriterion("SAD_ID between", value1, value2, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SAD_ID not between", value1, value2, "sadId");
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