package activetech.hospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HspDevdataKmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HspDevdataKmExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDevnoIsNull() {
            addCriterion("DEVNO is null");
            return (Criteria) this;
        }

        public Criteria andDevnoIsNotNull() {
            addCriterion("DEVNO is not null");
            return (Criteria) this;
        }

        public Criteria andDevnoEqualTo(Integer value) {
            addCriterion("DEVNO =", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoNotEqualTo(Integer value) {
            addCriterion("DEVNO <>", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoGreaterThan(Integer value) {
            addCriterion("DEVNO >", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEVNO >=", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoLessThan(Integer value) {
            addCriterion("DEVNO <", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoLessThanOrEqualTo(Integer value) {
            addCriterion("DEVNO <=", value, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoIn(List<Integer> values) {
            addCriterion("DEVNO in", values, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoNotIn(List<Integer> values) {
            addCriterion("DEVNO not in", values, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoBetween(Integer value1, Integer value2) {
            addCriterion("DEVNO between", value1, value2, "devno");
            return (Criteria) this;
        }

        public Criteria andDevnoNotBetween(Integer value1, Integer value2) {
            addCriterion("DEVNO not between", value1, value2, "devno");
            return (Criteria) this;
        }

        public Criteria andCrtDatIsNull() {
            addCriterion("CRT_DAT is null");
            return (Criteria) this;
        }

        public Criteria andCrtDatIsNotNull() {
            addCriterion("CRT_DAT is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDatEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_DAT =", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_DAT <>", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatGreaterThan(Date value) {
            addCriterionForJDBCDate("CRT_DAT >", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_DAT >=", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatLessThan(Date value) {
            addCriterionForJDBCDate("CRT_DAT <", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_DAT <=", value, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_DAT in", values, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_DAT not in", values, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_DAT between", value1, value2, "crtDat");
            return (Criteria) this;
        }

        public Criteria andCrtDatNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_DAT not between", value1, value2, "crtDat");
            return (Criteria) this;
        }

        public Criteria andIyearIsNull() {
            addCriterion("IYEAR is null");
            return (Criteria) this;
        }

        public Criteria andIyearIsNotNull() {
            addCriterion("IYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andIyearEqualTo(Integer value) {
            addCriterion("IYEAR =", value, "iyear");
            return (Criteria) this;
        }

        public Criteria andIyearNotEqualTo(Integer value) {
            addCriterion("IYEAR <>", value, "iyear");
            return (Criteria) this;
        }

        public Criteria andIyearGreaterThan(Integer value) {
            addCriterion("IYEAR >", value, "iyear");
            return (Criteria) this;
        }

        public Criteria andIyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("IYEAR >=", value, "iyear");
            return (Criteria) this;
        }

        public Criteria andIyearLessThan(Integer value) {
            addCriterion("IYEAR <", value, "iyear");
            return (Criteria) this;
        }

        public Criteria andIyearLessThanOrEqualTo(Integer value) {
            addCriterion("IYEAR <=", value, "iyear");
            return (Criteria) this;
        }

        public Criteria andIyearIn(List<Integer> values) {
            addCriterion("IYEAR in", values, "iyear");
            return (Criteria) this;
        }

        public Criteria andIyearNotIn(List<Integer> values) {
            addCriterion("IYEAR not in", values, "iyear");
            return (Criteria) this;
        }

        public Criteria andIyearBetween(Integer value1, Integer value2) {
            addCriterion("IYEAR between", value1, value2, "iyear");
            return (Criteria) this;
        }

        public Criteria andIyearNotBetween(Integer value1, Integer value2) {
            addCriterion("IYEAR not between", value1, value2, "iyear");
            return (Criteria) this;
        }

        public Criteria andImonthIsNull() {
            addCriterion("IMONTH is null");
            return (Criteria) this;
        }

        public Criteria andImonthIsNotNull() {
            addCriterion("IMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andImonthEqualTo(Integer value) {
            addCriterion("IMONTH =", value, "imonth");
            return (Criteria) this;
        }

        public Criteria andImonthNotEqualTo(Integer value) {
            addCriterion("IMONTH <>", value, "imonth");
            return (Criteria) this;
        }

        public Criteria andImonthGreaterThan(Integer value) {
            addCriterion("IMONTH >", value, "imonth");
            return (Criteria) this;
        }

        public Criteria andImonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMONTH >=", value, "imonth");
            return (Criteria) this;
        }

        public Criteria andImonthLessThan(Integer value) {
            addCriterion("IMONTH <", value, "imonth");
            return (Criteria) this;
        }

        public Criteria andImonthLessThanOrEqualTo(Integer value) {
            addCriterion("IMONTH <=", value, "imonth");
            return (Criteria) this;
        }

        public Criteria andImonthIn(List<Integer> values) {
            addCriterion("IMONTH in", values, "imonth");
            return (Criteria) this;
        }

        public Criteria andImonthNotIn(List<Integer> values) {
            addCriterion("IMONTH not in", values, "imonth");
            return (Criteria) this;
        }

        public Criteria andImonthBetween(Integer value1, Integer value2) {
            addCriterion("IMONTH between", value1, value2, "imonth");
            return (Criteria) this;
        }

        public Criteria andImonthNotBetween(Integer value1, Integer value2) {
            addCriterion("IMONTH not between", value1, value2, "imonth");
            return (Criteria) this;
        }

        public Criteria andIdayIsNull() {
            addCriterion("IDAY is null");
            return (Criteria) this;
        }

        public Criteria andIdayIsNotNull() {
            addCriterion("IDAY is not null");
            return (Criteria) this;
        }

        public Criteria andIdayEqualTo(Integer value) {
            addCriterion("IDAY =", value, "iday");
            return (Criteria) this;
        }

        public Criteria andIdayNotEqualTo(Integer value) {
            addCriterion("IDAY <>", value, "iday");
            return (Criteria) this;
        }

        public Criteria andIdayGreaterThan(Integer value) {
            addCriterion("IDAY >", value, "iday");
            return (Criteria) this;
        }

        public Criteria andIdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDAY >=", value, "iday");
            return (Criteria) this;
        }

        public Criteria andIdayLessThan(Integer value) {
            addCriterion("IDAY <", value, "iday");
            return (Criteria) this;
        }

        public Criteria andIdayLessThanOrEqualTo(Integer value) {
            addCriterion("IDAY <=", value, "iday");
            return (Criteria) this;
        }

        public Criteria andIdayIn(List<Integer> values) {
            addCriterion("IDAY in", values, "iday");
            return (Criteria) this;
        }

        public Criteria andIdayNotIn(List<Integer> values) {
            addCriterion("IDAY not in", values, "iday");
            return (Criteria) this;
        }

        public Criteria andIdayBetween(Integer value1, Integer value2) {
            addCriterion("IDAY between", value1, value2, "iday");
            return (Criteria) this;
        }

        public Criteria andIdayNotBetween(Integer value1, Integer value2) {
            addCriterion("IDAY not between", value1, value2, "iday");
            return (Criteria) this;
        }

        public Criteria andIhourIsNull() {
            addCriterion("IHOUR is null");
            return (Criteria) this;
        }

        public Criteria andIhourIsNotNull() {
            addCriterion("IHOUR is not null");
            return (Criteria) this;
        }

        public Criteria andIhourEqualTo(Integer value) {
            addCriterion("IHOUR =", value, "ihour");
            return (Criteria) this;
        }

        public Criteria andIhourNotEqualTo(Integer value) {
            addCriterion("IHOUR <>", value, "ihour");
            return (Criteria) this;
        }

        public Criteria andIhourGreaterThan(Integer value) {
            addCriterion("IHOUR >", value, "ihour");
            return (Criteria) this;
        }

        public Criteria andIhourGreaterThanOrEqualTo(Integer value) {
            addCriterion("IHOUR >=", value, "ihour");
            return (Criteria) this;
        }

        public Criteria andIhourLessThan(Integer value) {
            addCriterion("IHOUR <", value, "ihour");
            return (Criteria) this;
        }

        public Criteria andIhourLessThanOrEqualTo(Integer value) {
            addCriterion("IHOUR <=", value, "ihour");
            return (Criteria) this;
        }

        public Criteria andIhourIn(List<Integer> values) {
            addCriterion("IHOUR in", values, "ihour");
            return (Criteria) this;
        }

        public Criteria andIhourNotIn(List<Integer> values) {
            addCriterion("IHOUR not in", values, "ihour");
            return (Criteria) this;
        }

        public Criteria andIhourBetween(Integer value1, Integer value2) {
            addCriterion("IHOUR between", value1, value2, "ihour");
            return (Criteria) this;
        }

        public Criteria andIhourNotBetween(Integer value1, Integer value2) {
            addCriterion("IHOUR not between", value1, value2, "ihour");
            return (Criteria) this;
        }

        public Criteria andIminuteIsNull() {
            addCriterion("IMINUTE is null");
            return (Criteria) this;
        }

        public Criteria andIminuteIsNotNull() {
            addCriterion("IMINUTE is not null");
            return (Criteria) this;
        }

        public Criteria andIminuteEqualTo(Integer value) {
            addCriterion("IMINUTE =", value, "iminute");
            return (Criteria) this;
        }

        public Criteria andIminuteNotEqualTo(Integer value) {
            addCriterion("IMINUTE <>", value, "iminute");
            return (Criteria) this;
        }

        public Criteria andIminuteGreaterThan(Integer value) {
            addCriterion("IMINUTE >", value, "iminute");
            return (Criteria) this;
        }

        public Criteria andIminuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMINUTE >=", value, "iminute");
            return (Criteria) this;
        }

        public Criteria andIminuteLessThan(Integer value) {
            addCriterion("IMINUTE <", value, "iminute");
            return (Criteria) this;
        }

        public Criteria andIminuteLessThanOrEqualTo(Integer value) {
            addCriterion("IMINUTE <=", value, "iminute");
            return (Criteria) this;
        }

        public Criteria andIminuteIn(List<Integer> values) {
            addCriterion("IMINUTE in", values, "iminute");
            return (Criteria) this;
        }

        public Criteria andIminuteNotIn(List<Integer> values) {
            addCriterion("IMINUTE not in", values, "iminute");
            return (Criteria) this;
        }

        public Criteria andIminuteBetween(Integer value1, Integer value2) {
            addCriterion("IMINUTE between", value1, value2, "iminute");
            return (Criteria) this;
        }

        public Criteria andIminuteNotBetween(Integer value1, Integer value2) {
            addCriterion("IMINUTE not between", value1, value2, "iminute");
            return (Criteria) this;
        }

        public Criteria andIsecondIsNull() {
            addCriterion("ISECOND is null");
            return (Criteria) this;
        }

        public Criteria andIsecondIsNotNull() {
            addCriterion("ISECOND is not null");
            return (Criteria) this;
        }

        public Criteria andIsecondEqualTo(Integer value) {
            addCriterion("ISECOND =", value, "isecond");
            return (Criteria) this;
        }

        public Criteria andIsecondNotEqualTo(Integer value) {
            addCriterion("ISECOND <>", value, "isecond");
            return (Criteria) this;
        }

        public Criteria andIsecondGreaterThan(Integer value) {
            addCriterion("ISECOND >", value, "isecond");
            return (Criteria) this;
        }

        public Criteria andIsecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISECOND >=", value, "isecond");
            return (Criteria) this;
        }

        public Criteria andIsecondLessThan(Integer value) {
            addCriterion("ISECOND <", value, "isecond");
            return (Criteria) this;
        }

        public Criteria andIsecondLessThanOrEqualTo(Integer value) {
            addCriterion("ISECOND <=", value, "isecond");
            return (Criteria) this;
        }

        public Criteria andIsecondIn(List<Integer> values) {
            addCriterion("ISECOND in", values, "isecond");
            return (Criteria) this;
        }

        public Criteria andIsecondNotIn(List<Integer> values) {
            addCriterion("ISECOND not in", values, "isecond");
            return (Criteria) this;
        }

        public Criteria andIsecondBetween(Integer value1, Integer value2) {
            addCriterion("ISECOND between", value1, value2, "isecond");
            return (Criteria) this;
        }

        public Criteria andIsecondNotBetween(Integer value1, Integer value2) {
            addCriterion("ISECOND not between", value1, value2, "isecond");
            return (Criteria) this;
        }

        public Criteria andIsysIsNull() {
            addCriterion("ISYS is null");
            return (Criteria) this;
        }

        public Criteria andIsysIsNotNull() {
            addCriterion("ISYS is not null");
            return (Criteria) this;
        }

        public Criteria andIsysEqualTo(Integer value) {
            addCriterion("ISYS =", value, "isys");
            return (Criteria) this;
        }

        public Criteria andIsysNotEqualTo(Integer value) {
            addCriterion("ISYS <>", value, "isys");
            return (Criteria) this;
        }

        public Criteria andIsysGreaterThan(Integer value) {
            addCriterion("ISYS >", value, "isys");
            return (Criteria) this;
        }

        public Criteria andIsysGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISYS >=", value, "isys");
            return (Criteria) this;
        }

        public Criteria andIsysLessThan(Integer value) {
            addCriterion("ISYS <", value, "isys");
            return (Criteria) this;
        }

        public Criteria andIsysLessThanOrEqualTo(Integer value) {
            addCriterion("ISYS <=", value, "isys");
            return (Criteria) this;
        }

        public Criteria andIsysIn(List<Integer> values) {
            addCriterion("ISYS in", values, "isys");
            return (Criteria) this;
        }

        public Criteria andIsysNotIn(List<Integer> values) {
            addCriterion("ISYS not in", values, "isys");
            return (Criteria) this;
        }

        public Criteria andIsysBetween(Integer value1, Integer value2) {
            addCriterion("ISYS between", value1, value2, "isys");
            return (Criteria) this;
        }

        public Criteria andIsysNotBetween(Integer value1, Integer value2) {
            addCriterion("ISYS not between", value1, value2, "isys");
            return (Criteria) this;
        }

        public Criteria andImeanIsNull() {
            addCriterion("IMEAN is null");
            return (Criteria) this;
        }

        public Criteria andImeanIsNotNull() {
            addCriterion("IMEAN is not null");
            return (Criteria) this;
        }

        public Criteria andImeanEqualTo(Integer value) {
            addCriterion("IMEAN =", value, "imean");
            return (Criteria) this;
        }

        public Criteria andImeanNotEqualTo(Integer value) {
            addCriterion("IMEAN <>", value, "imean");
            return (Criteria) this;
        }

        public Criteria andImeanGreaterThan(Integer value) {
            addCriterion("IMEAN >", value, "imean");
            return (Criteria) this;
        }

        public Criteria andImeanGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMEAN >=", value, "imean");
            return (Criteria) this;
        }

        public Criteria andImeanLessThan(Integer value) {
            addCriterion("IMEAN <", value, "imean");
            return (Criteria) this;
        }

        public Criteria andImeanLessThanOrEqualTo(Integer value) {
            addCriterion("IMEAN <=", value, "imean");
            return (Criteria) this;
        }

        public Criteria andImeanIn(List<Integer> values) {
            addCriterion("IMEAN in", values, "imean");
            return (Criteria) this;
        }

        public Criteria andImeanNotIn(List<Integer> values) {
            addCriterion("IMEAN not in", values, "imean");
            return (Criteria) this;
        }

        public Criteria andImeanBetween(Integer value1, Integer value2) {
            addCriterion("IMEAN between", value1, value2, "imean");
            return (Criteria) this;
        }

        public Criteria andImeanNotBetween(Integer value1, Integer value2) {
            addCriterion("IMEAN not between", value1, value2, "imean");
            return (Criteria) this;
        }

        public Criteria andIdiaIsNull() {
            addCriterion("IDIA is null");
            return (Criteria) this;
        }

        public Criteria andIdiaIsNotNull() {
            addCriterion("IDIA is not null");
            return (Criteria) this;
        }

        public Criteria andIdiaEqualTo(Integer value) {
            addCriterion("IDIA =", value, "idia");
            return (Criteria) this;
        }

        public Criteria andIdiaNotEqualTo(Integer value) {
            addCriterion("IDIA <>", value, "idia");
            return (Criteria) this;
        }

        public Criteria andIdiaGreaterThan(Integer value) {
            addCriterion("IDIA >", value, "idia");
            return (Criteria) this;
        }

        public Criteria andIdiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDIA >=", value, "idia");
            return (Criteria) this;
        }

        public Criteria andIdiaLessThan(Integer value) {
            addCriterion("IDIA <", value, "idia");
            return (Criteria) this;
        }

        public Criteria andIdiaLessThanOrEqualTo(Integer value) {
            addCriterion("IDIA <=", value, "idia");
            return (Criteria) this;
        }

        public Criteria andIdiaIn(List<Integer> values) {
            addCriterion("IDIA in", values, "idia");
            return (Criteria) this;
        }

        public Criteria andIdiaNotIn(List<Integer> values) {
            addCriterion("IDIA not in", values, "idia");
            return (Criteria) this;
        }

        public Criteria andIdiaBetween(Integer value1, Integer value2) {
            addCriterion("IDIA between", value1, value2, "idia");
            return (Criteria) this;
        }

        public Criteria andIdiaNotBetween(Integer value1, Integer value2) {
            addCriterion("IDIA not between", value1, value2, "idia");
            return (Criteria) this;
        }

        public Criteria andIfinishIsNull() {
            addCriterion("IFINISH is null");
            return (Criteria) this;
        }

        public Criteria andIfinishIsNotNull() {
            addCriterion("IFINISH is not null");
            return (Criteria) this;
        }

        public Criteria andIfinishEqualTo(Integer value) {
            addCriterion("IFINISH =", value, "ifinish");
            return (Criteria) this;
        }

        public Criteria andIfinishNotEqualTo(Integer value) {
            addCriterion("IFINISH <>", value, "ifinish");
            return (Criteria) this;
        }

        public Criteria andIfinishGreaterThan(Integer value) {
            addCriterion("IFINISH >", value, "ifinish");
            return (Criteria) this;
        }

        public Criteria andIfinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("IFINISH >=", value, "ifinish");
            return (Criteria) this;
        }

        public Criteria andIfinishLessThan(Integer value) {
            addCriterion("IFINISH <", value, "ifinish");
            return (Criteria) this;
        }

        public Criteria andIfinishLessThanOrEqualTo(Integer value) {
            addCriterion("IFINISH <=", value, "ifinish");
            return (Criteria) this;
        }

        public Criteria andIfinishIn(List<Integer> values) {
            addCriterion("IFINISH in", values, "ifinish");
            return (Criteria) this;
        }

        public Criteria andIfinishNotIn(List<Integer> values) {
            addCriterion("IFINISH not in", values, "ifinish");
            return (Criteria) this;
        }

        public Criteria andIfinishBetween(Integer value1, Integer value2) {
            addCriterion("IFINISH between", value1, value2, "ifinish");
            return (Criteria) this;
        }

        public Criteria andIfinishNotBetween(Integer value1, Integer value2) {
            addCriterion("IFINISH not between", value1, value2, "ifinish");
            return (Criteria) this;
        }

        public Criteria andIerrcodeIsNull() {
            addCriterion("IERRCODE is null");
            return (Criteria) this;
        }

        public Criteria andIerrcodeIsNotNull() {
            addCriterion("IERRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andIerrcodeEqualTo(Integer value) {
            addCriterion("IERRCODE =", value, "ierrcode");
            return (Criteria) this;
        }

        public Criteria andIerrcodeNotEqualTo(Integer value) {
            addCriterion("IERRCODE <>", value, "ierrcode");
            return (Criteria) this;
        }

        public Criteria andIerrcodeGreaterThan(Integer value) {
            addCriterion("IERRCODE >", value, "ierrcode");
            return (Criteria) this;
        }

        public Criteria andIerrcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IERRCODE >=", value, "ierrcode");
            return (Criteria) this;
        }

        public Criteria andIerrcodeLessThan(Integer value) {
            addCriterion("IERRCODE <", value, "ierrcode");
            return (Criteria) this;
        }

        public Criteria andIerrcodeLessThanOrEqualTo(Integer value) {
            addCriterion("IERRCODE <=", value, "ierrcode");
            return (Criteria) this;
        }

        public Criteria andIerrcodeIn(List<Integer> values) {
            addCriterion("IERRCODE in", values, "ierrcode");
            return (Criteria) this;
        }

        public Criteria andIerrcodeNotIn(List<Integer> values) {
            addCriterion("IERRCODE not in", values, "ierrcode");
            return (Criteria) this;
        }

        public Criteria andIerrcodeBetween(Integer value1, Integer value2) {
            addCriterion("IERRCODE between", value1, value2, "ierrcode");
            return (Criteria) this;
        }

        public Criteria andIerrcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("IERRCODE not between", value1, value2, "ierrcode");
            return (Criteria) this;
        }

        public Criteria andIprIsNull() {
            addCriterion("IPR is null");
            return (Criteria) this;
        }

        public Criteria andIprIsNotNull() {
            addCriterion("IPR is not null");
            return (Criteria) this;
        }

        public Criteria andIprEqualTo(Integer value) {
            addCriterion("IPR =", value, "ipr");
            return (Criteria) this;
        }

        public Criteria andIprNotEqualTo(Integer value) {
            addCriterion("IPR <>", value, "ipr");
            return (Criteria) this;
        }

        public Criteria andIprGreaterThan(Integer value) {
            addCriterion("IPR >", value, "ipr");
            return (Criteria) this;
        }

        public Criteria andIprGreaterThanOrEqualTo(Integer value) {
            addCriterion("IPR >=", value, "ipr");
            return (Criteria) this;
        }

        public Criteria andIprLessThan(Integer value) {
            addCriterion("IPR <", value, "ipr");
            return (Criteria) this;
        }

        public Criteria andIprLessThanOrEqualTo(Integer value) {
            addCriterion("IPR <=", value, "ipr");
            return (Criteria) this;
        }

        public Criteria andIprIn(List<Integer> values) {
            addCriterion("IPR in", values, "ipr");
            return (Criteria) this;
        }

        public Criteria andIprNotIn(List<Integer> values) {
            addCriterion("IPR not in", values, "ipr");
            return (Criteria) this;
        }

        public Criteria andIprBetween(Integer value1, Integer value2) {
            addCriterion("IPR between", value1, value2, "ipr");
            return (Criteria) this;
        }

        public Criteria andIprNotBetween(Integer value1, Integer value2) {
            addCriterion("IPR not between", value1, value2, "ipr");
            return (Criteria) this;
        }

        public Criteria andIsrcIsNull() {
            addCriterion("ISRC is null");
            return (Criteria) this;
        }

        public Criteria andIsrcIsNotNull() {
            addCriterion("ISRC is not null");
            return (Criteria) this;
        }

        public Criteria andIsrcEqualTo(Integer value) {
            addCriterion("ISRC =", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcNotEqualTo(Integer value) {
            addCriterion("ISRC <>", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcGreaterThan(Integer value) {
            addCriterion("ISRC >", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISRC >=", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcLessThan(Integer value) {
            addCriterion("ISRC <", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcLessThanOrEqualTo(Integer value) {
            addCriterion("ISRC <=", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcIn(List<Integer> values) {
            addCriterion("ISRC in", values, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcNotIn(List<Integer> values) {
            addCriterion("ISRC not in", values, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcBetween(Integer value1, Integer value2) {
            addCriterion("ISRC between", value1, value2, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcNotBetween(Integer value1, Integer value2) {
            addCriterion("ISRC not between", value1, value2, "isrc");
            return (Criteria) this;
        }

        public Criteria andBlleadoffIsNull() {
            addCriterion("BLLEADOFF is null");
            return (Criteria) this;
        }

        public Criteria andBlleadoffIsNotNull() {
            addCriterion("BLLEADOFF is not null");
            return (Criteria) this;
        }

        public Criteria andBlleadoffEqualTo(Integer value) {
            addCriterion("BLLEADOFF =", value, "blleadoff");
            return (Criteria) this;
        }

        public Criteria andBlleadoffNotEqualTo(Integer value) {
            addCriterion("BLLEADOFF <>", value, "blleadoff");
            return (Criteria) this;
        }

        public Criteria andBlleadoffGreaterThan(Integer value) {
            addCriterion("BLLEADOFF >", value, "blleadoff");
            return (Criteria) this;
        }

        public Criteria andBlleadoffGreaterThanOrEqualTo(Integer value) {
            addCriterion("BLLEADOFF >=", value, "blleadoff");
            return (Criteria) this;
        }

        public Criteria andBlleadoffLessThan(Integer value) {
            addCriterion("BLLEADOFF <", value, "blleadoff");
            return (Criteria) this;
        }

        public Criteria andBlleadoffLessThanOrEqualTo(Integer value) {
            addCriterion("BLLEADOFF <=", value, "blleadoff");
            return (Criteria) this;
        }

        public Criteria andBlleadoffIn(List<Integer> values) {
            addCriterion("BLLEADOFF in", values, "blleadoff");
            return (Criteria) this;
        }

        public Criteria andBlleadoffNotIn(List<Integer> values) {
            addCriterion("BLLEADOFF not in", values, "blleadoff");
            return (Criteria) this;
        }

        public Criteria andBlleadoffBetween(Integer value1, Integer value2) {
            addCriterion("BLLEADOFF between", value1, value2, "blleadoff");
            return (Criteria) this;
        }

        public Criteria andBlleadoffNotBetween(Integer value1, Integer value2) {
            addCriterion("BLLEADOFF not between", value1, value2, "blleadoff");
            return (Criteria) this;
        }

        public Criteria andIspo2IsNull() {
            addCriterion("ISPO2 is null");
            return (Criteria) this;
        }

        public Criteria andIspo2IsNotNull() {
            addCriterion("ISPO2 is not null");
            return (Criteria) this;
        }

        public Criteria andIspo2EqualTo(Integer value) {
            addCriterion("ISPO2 =", value, "ispo2");
            return (Criteria) this;
        }

        public Criteria andIspo2NotEqualTo(Integer value) {
            addCriterion("ISPO2 <>", value, "ispo2");
            return (Criteria) this;
        }

        public Criteria andIspo2GreaterThan(Integer value) {
            addCriterion("ISPO2 >", value, "ispo2");
            return (Criteria) this;
        }

        public Criteria andIspo2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ISPO2 >=", value, "ispo2");
            return (Criteria) this;
        }

        public Criteria andIspo2LessThan(Integer value) {
            addCriterion("ISPO2 <", value, "ispo2");
            return (Criteria) this;
        }

        public Criteria andIspo2LessThanOrEqualTo(Integer value) {
            addCriterion("ISPO2 <=", value, "ispo2");
            return (Criteria) this;
        }

        public Criteria andIspo2In(List<Integer> values) {
            addCriterion("ISPO2 in", values, "ispo2");
            return (Criteria) this;
        }

        public Criteria andIspo2NotIn(List<Integer> values) {
            addCriterion("ISPO2 not in", values, "ispo2");
            return (Criteria) this;
        }

        public Criteria andIspo2Between(Integer value1, Integer value2) {
            addCriterion("ISPO2 between", value1, value2, "ispo2");
            return (Criteria) this;
        }

        public Criteria andIspo2NotBetween(Integer value1, Integer value2) {
            addCriterion("ISPO2 not between", value1, value2, "ispo2");
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