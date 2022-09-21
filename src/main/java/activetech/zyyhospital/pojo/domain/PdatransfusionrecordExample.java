package activetech.zyyhospital.pojo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PdatransfusionrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PdatransfusionrecordExample() {
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

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(Short value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(Short value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(Short value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(Short value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(Short value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(Short value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<Short> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<Short> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(Short value1, Short value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(Short value1, Short value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andOutpatientidIsNull() {
            addCriterion("OUTPATIENTID is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientidIsNotNull() {
            addCriterion("OUTPATIENTID is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientidEqualTo(String value) {
            addCriterion("OUTPATIENTID =", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidNotEqualTo(String value) {
            addCriterion("OUTPATIENTID <>", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidGreaterThan(String value) {
            addCriterion("OUTPATIENTID >", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidGreaterThanOrEqualTo(String value) {
            addCriterion("OUTPATIENTID >=", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidLessThan(String value) {
            addCriterion("OUTPATIENTID <", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidLessThanOrEqualTo(String value) {
            addCriterion("OUTPATIENTID <=", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidLike(String value) {
            addCriterion("OUTPATIENTID like", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidNotLike(String value) {
            addCriterion("OUTPATIENTID not like", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidIn(List<String> values) {
            addCriterion("OUTPATIENTID in", values, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidNotIn(List<String> values) {
            addCriterion("OUTPATIENTID not in", values, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidBetween(String value1, String value2) {
            addCriterion("OUTPATIENTID between", value1, value2, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidNotBetween(String value1, String value2) {
            addCriterion("OUTPATIENTID not between", value1, value2, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidIsNull() {
            addCriterion("BLOODBAGID is null");
            return (Criteria) this;
        }

        public Criteria andBloodbagidIsNotNull() {
            addCriterion("BLOODBAGID is not null");
            return (Criteria) this;
        }

        public Criteria andBloodbagidEqualTo(String value) {
            addCriterion("BLOODBAGID =", value, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidNotEqualTo(String value) {
            addCriterion("BLOODBAGID <>", value, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidGreaterThan(String value) {
            addCriterion("BLOODBAGID >", value, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidGreaterThanOrEqualTo(String value) {
            addCriterion("BLOODBAGID >=", value, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidLessThan(String value) {
            addCriterion("BLOODBAGID <", value, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidLessThanOrEqualTo(String value) {
            addCriterion("BLOODBAGID <=", value, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidLike(String value) {
            addCriterion("BLOODBAGID like", value, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidNotLike(String value) {
            addCriterion("BLOODBAGID not like", value, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidIn(List<String> values) {
            addCriterion("BLOODBAGID in", values, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidNotIn(List<String> values) {
            addCriterion("BLOODBAGID not in", values, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidBetween(String value1, String value2) {
            addCriterion("BLOODBAGID between", value1, value2, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andBloodbagidNotBetween(String value1, String value2) {
            addCriterion("BLOODBAGID not between", value1, value2, "bloodbagid");
            return (Criteria) this;
        }

        public Criteria andInspectionidIsNull() {
            addCriterion("INSPECTIONID is null");
            return (Criteria) this;
        }

        public Criteria andInspectionidIsNotNull() {
            addCriterion("INSPECTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionidEqualTo(String value) {
            addCriterion("INSPECTIONID =", value, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andInspectionidNotEqualTo(String value) {
            addCriterion("INSPECTIONID <>", value, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andInspectionidGreaterThan(String value) {
            addCriterion("INSPECTIONID >", value, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andInspectionidGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECTIONID >=", value, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andInspectionidLessThan(String value) {
            addCriterion("INSPECTIONID <", value, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andInspectionidLessThanOrEqualTo(String value) {
            addCriterion("INSPECTIONID <=", value, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andInspectionidLike(String value) {
            addCriterion("INSPECTIONID like", value, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andInspectionidNotLike(String value) {
            addCriterion("INSPECTIONID not like", value, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andInspectionidIn(List<String> values) {
            addCriterion("INSPECTIONID in", values, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andInspectionidNotIn(List<String> values) {
            addCriterion("INSPECTIONID not in", values, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andInspectionidBetween(String value1, String value2) {
            addCriterion("INSPECTIONID between", value1, value2, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andInspectionidNotBetween(String value1, String value2) {
            addCriterion("INSPECTIONID not between", value1, value2, "inspectionid");
            return (Criteria) this;
        }

        public Criteria andCollatorIsNull() {
            addCriterion("COLLATOR is null");
            return (Criteria) this;
        }

        public Criteria andCollatorIsNotNull() {
            addCriterion("COLLATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCollatorEqualTo(String value) {
            addCriterion("COLLATOR =", value, "collator");
            return (Criteria) this;
        }

        public Criteria andCollatorNotEqualTo(String value) {
            addCriterion("COLLATOR <>", value, "collator");
            return (Criteria) this;
        }

        public Criteria andCollatorGreaterThan(String value) {
            addCriterion("COLLATOR >", value, "collator");
            return (Criteria) this;
        }

        public Criteria andCollatorGreaterThanOrEqualTo(String value) {
            addCriterion("COLLATOR >=", value, "collator");
            return (Criteria) this;
        }

        public Criteria andCollatorLessThan(String value) {
            addCriterion("COLLATOR <", value, "collator");
            return (Criteria) this;
        }

        public Criteria andCollatorLessThanOrEqualTo(String value) {
            addCriterion("COLLATOR <=", value, "collator");
            return (Criteria) this;
        }

        public Criteria andCollatorLike(String value) {
            addCriterion("COLLATOR like", value, "collator");
            return (Criteria) this;
        }

        public Criteria andCollatorNotLike(String value) {
            addCriterion("COLLATOR not like", value, "collator");
            return (Criteria) this;
        }

        public Criteria andCollatorIn(List<String> values) {
            addCriterion("COLLATOR in", values, "collator");
            return (Criteria) this;
        }

        public Criteria andCollatorNotIn(List<String> values) {
            addCriterion("COLLATOR not in", values, "collator");
            return (Criteria) this;
        }

        public Criteria andCollatorBetween(String value1, String value2) {
            addCriterion("COLLATOR between", value1, value2, "collator");
            return (Criteria) this;
        }

        public Criteria andCollatorNotBetween(String value1, String value2) {
            addCriterion("COLLATOR not between", value1, value2, "collator");
            return (Criteria) this;
        }

        public Criteria andWitnessIsNull() {
            addCriterion("WITNESS is null");
            return (Criteria) this;
        }

        public Criteria andWitnessIsNotNull() {
            addCriterion("WITNESS is not null");
            return (Criteria) this;
        }

        public Criteria andWitnessEqualTo(String value) {
            addCriterion("WITNESS =", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotEqualTo(String value) {
            addCriterion("WITNESS <>", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessGreaterThan(String value) {
            addCriterion("WITNESS >", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessGreaterThanOrEqualTo(String value) {
            addCriterion("WITNESS >=", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessLessThan(String value) {
            addCriterion("WITNESS <", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessLessThanOrEqualTo(String value) {
            addCriterion("WITNESS <=", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessLike(String value) {
            addCriterion("WITNESS like", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotLike(String value) {
            addCriterion("WITNESS not like", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessIn(List<String> values) {
            addCriterion("WITNESS in", values, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotIn(List<String> values) {
            addCriterion("WITNESS not in", values, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessBetween(String value1, String value2) {
            addCriterion("WITNESS between", value1, value2, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotBetween(String value1, String value2) {
            addCriterion("WITNESS not between", value1, value2, "witness");
            return (Criteria) this;
        }

        public Criteria andWritetimeIsNull() {
            addCriterion("WRITETIME is null");
            return (Criteria) this;
        }

        public Criteria andWritetimeIsNotNull() {
            addCriterion("WRITETIME is not null");
            return (Criteria) this;
        }

        public Criteria andWritetimeEqualTo(Date value) {
            addCriterion("WRITETIME =", value, "writetime");
            return (Criteria) this;
        }

        public Criteria andWritetimeNotEqualTo(Date value) {
            addCriterion("WRITETIME <>", value, "writetime");
            return (Criteria) this;
        }

        public Criteria andWritetimeGreaterThan(Date value) {
            addCriterion("WRITETIME >", value, "writetime");
            return (Criteria) this;
        }

        public Criteria andWritetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WRITETIME >=", value, "writetime");
            return (Criteria) this;
        }

        public Criteria andWritetimeLessThan(Date value) {
            addCriterion("WRITETIME <", value, "writetime");
            return (Criteria) this;
        }

        public Criteria andWritetimeLessThanOrEqualTo(Date value) {
            addCriterion("WRITETIME <=", value, "writetime");
            return (Criteria) this;
        }

        public Criteria andWritetimeIn(List<Date> values) {
            addCriterion("WRITETIME in", values, "writetime");
            return (Criteria) this;
        }

        public Criteria andWritetimeNotIn(List<Date> values) {
            addCriterion("WRITETIME not in", values, "writetime");
            return (Criteria) this;
        }

        public Criteria andWritetimeBetween(Date value1, Date value2) {
            addCriterion("WRITETIME between", value1, value2, "writetime");
            return (Criteria) this;
        }

        public Criteria andWritetimeNotBetween(Date value1, Date value2) {
            addCriterion("WRITETIME not between", value1, value2, "writetime");
            return (Criteria) this;
        }

        public Criteria andStepIsNull() {
            addCriterion("STEP is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("STEP is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(Short value) {
            addCriterion("STEP =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(Short value) {
            addCriterion("STEP <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(Short value) {
            addCriterion("STEP >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(Short value) {
            addCriterion("STEP >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(Short value) {
            addCriterion("STEP <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(Short value) {
            addCriterion("STEP <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<Short> values) {
            addCriterion("STEP in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<Short> values) {
            addCriterion("STEP not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(Short value1, Short value2) {
            addCriterion("STEP between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(Short value1, Short value2) {
            addCriterion("STEP not between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepnameIsNull() {
            addCriterion("STEPNAME is null");
            return (Criteria) this;
        }

        public Criteria andStepnameIsNotNull() {
            addCriterion("STEPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStepnameEqualTo(String value) {
            addCriterion("STEPNAME =", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotEqualTo(String value) {
            addCriterion("STEPNAME <>", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameGreaterThan(String value) {
            addCriterion("STEPNAME >", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameGreaterThanOrEqualTo(String value) {
            addCriterion("STEPNAME >=", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameLessThan(String value) {
            addCriterion("STEPNAME <", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameLessThanOrEqualTo(String value) {
            addCriterion("STEPNAME <=", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameLike(String value) {
            addCriterion("STEPNAME like", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotLike(String value) {
            addCriterion("STEPNAME not like", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameIn(List<String> values) {
            addCriterion("STEPNAME in", values, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotIn(List<String> values) {
            addCriterion("STEPNAME not in", values, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameBetween(String value1, String value2) {
            addCriterion("STEPNAME between", value1, value2, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotBetween(String value1, String value2) {
            addCriterion("STEPNAME not between", value1, value2, "stepname");
            return (Criteria) this;
        }

        public Criteria andIsreactionIsNull() {
            addCriterion("ISREACTION is null");
            return (Criteria) this;
        }

        public Criteria andIsreactionIsNotNull() {
            addCriterion("ISREACTION is not null");
            return (Criteria) this;
        }

        public Criteria andIsreactionEqualTo(Short value) {
            addCriterion("ISREACTION =", value, "isreaction");
            return (Criteria) this;
        }

        public Criteria andIsreactionNotEqualTo(Short value) {
            addCriterion("ISREACTION <>", value, "isreaction");
            return (Criteria) this;
        }

        public Criteria andIsreactionGreaterThan(Short value) {
            addCriterion("ISREACTION >", value, "isreaction");
            return (Criteria) this;
        }

        public Criteria andIsreactionGreaterThanOrEqualTo(Short value) {
            addCriterion("ISREACTION >=", value, "isreaction");
            return (Criteria) this;
        }

        public Criteria andIsreactionLessThan(Short value) {
            addCriterion("ISREACTION <", value, "isreaction");
            return (Criteria) this;
        }

        public Criteria andIsreactionLessThanOrEqualTo(Short value) {
            addCriterion("ISREACTION <=", value, "isreaction");
            return (Criteria) this;
        }

        public Criteria andIsreactionIn(List<Short> values) {
            addCriterion("ISREACTION in", values, "isreaction");
            return (Criteria) this;
        }

        public Criteria andIsreactionNotIn(List<Short> values) {
            addCriterion("ISREACTION not in", values, "isreaction");
            return (Criteria) this;
        }

        public Criteria andIsreactionBetween(Short value1, Short value2) {
            addCriterion("ISREACTION between", value1, value2, "isreaction");
            return (Criteria) this;
        }

        public Criteria andIsreactionNotBetween(Short value1, Short value2) {
            addCriterion("ISREACTION not between", value1, value2, "isreaction");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("TEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("TEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("TEMPERATURE =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("TEMPERATURE <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("TEMPERATURE >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPERATURE >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("TEMPERATURE <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("TEMPERATURE <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("TEMPERATURE like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("TEMPERATURE not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("TEMPERATURE in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("TEMPERATURE not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("TEMPERATURE between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("TEMPERATURE not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andXy1IsNull() {
            addCriterion("XY1 is null");
            return (Criteria) this;
        }

        public Criteria andXy1IsNotNull() {
            addCriterion("XY1 is not null");
            return (Criteria) this;
        }

        public Criteria andXy1EqualTo(String value) {
            addCriterion("XY1 =", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1NotEqualTo(String value) {
            addCriterion("XY1 <>", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1GreaterThan(String value) {
            addCriterion("XY1 >", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1GreaterThanOrEqualTo(String value) {
            addCriterion("XY1 >=", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1LessThan(String value) {
            addCriterion("XY1 <", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1LessThanOrEqualTo(String value) {
            addCriterion("XY1 <=", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1Like(String value) {
            addCriterion("XY1 like", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1NotLike(String value) {
            addCriterion("XY1 not like", value, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1In(List<String> values) {
            addCriterion("XY1 in", values, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1NotIn(List<String> values) {
            addCriterion("XY1 not in", values, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1Between(String value1, String value2) {
            addCriterion("XY1 between", value1, value2, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy1NotBetween(String value1, String value2) {
            addCriterion("XY1 not between", value1, value2, "xy1");
            return (Criteria) this;
        }

        public Criteria andXy2IsNull() {
            addCriterion("XY2 is null");
            return (Criteria) this;
        }

        public Criteria andXy2IsNotNull() {
            addCriterion("XY2 is not null");
            return (Criteria) this;
        }

        public Criteria andXy2EqualTo(String value) {
            addCriterion("XY2 =", value, "xy2");
            return (Criteria) this;
        }

        public Criteria andXy2NotEqualTo(String value) {
            addCriterion("XY2 <>", value, "xy2");
            return (Criteria) this;
        }

        public Criteria andXy2GreaterThan(String value) {
            addCriterion("XY2 >", value, "xy2");
            return (Criteria) this;
        }

        public Criteria andXy2GreaterThanOrEqualTo(String value) {
            addCriterion("XY2 >=", value, "xy2");
            return (Criteria) this;
        }

        public Criteria andXy2LessThan(String value) {
            addCriterion("XY2 <", value, "xy2");
            return (Criteria) this;
        }

        public Criteria andXy2LessThanOrEqualTo(String value) {
            addCriterion("XY2 <=", value, "xy2");
            return (Criteria) this;
        }

        public Criteria andXy2Like(String value) {
            addCriterion("XY2 like", value, "xy2");
            return (Criteria) this;
        }

        public Criteria andXy2NotLike(String value) {
            addCriterion("XY2 not like", value, "xy2");
            return (Criteria) this;
        }

        public Criteria andXy2In(List<String> values) {
            addCriterion("XY2 in", values, "xy2");
            return (Criteria) this;
        }

        public Criteria andXy2NotIn(List<String> values) {
            addCriterion("XY2 not in", values, "xy2");
            return (Criteria) this;
        }

        public Criteria andXy2Between(String value1, String value2) {
            addCriterion("XY2 between", value1, value2, "xy2");
            return (Criteria) this;
        }

        public Criteria andXy2NotBetween(String value1, String value2) {
            addCriterion("XY2 not between", value1, value2, "xy2");
            return (Criteria) this;
        }

        public Criteria andBloodpressureIsNull() {
            addCriterion("BLOODPRESSURE is null");
            return (Criteria) this;
        }

        public Criteria andBloodpressureIsNotNull() {
            addCriterion("BLOODPRESSURE is not null");
            return (Criteria) this;
        }

        public Criteria andBloodpressureEqualTo(String value) {
            addCriterion("BLOODPRESSURE =", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureNotEqualTo(String value) {
            addCriterion("BLOODPRESSURE <>", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureGreaterThan(String value) {
            addCriterion("BLOODPRESSURE >", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureGreaterThanOrEqualTo(String value) {
            addCriterion("BLOODPRESSURE >=", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureLessThan(String value) {
            addCriterion("BLOODPRESSURE <", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureLessThanOrEqualTo(String value) {
            addCriterion("BLOODPRESSURE <=", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureLike(String value) {
            addCriterion("BLOODPRESSURE like", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureNotLike(String value) {
            addCriterion("BLOODPRESSURE not like", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureIn(List<String> values) {
            addCriterion("BLOODPRESSURE in", values, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureNotIn(List<String> values) {
            addCriterion("BLOODPRESSURE not in", values, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureBetween(String value1, String value2) {
            addCriterion("BLOODPRESSURE between", value1, value2, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureNotBetween(String value1, String value2) {
            addCriterion("BLOODPRESSURE not between", value1, value2, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andHeartrateIsNull() {
            addCriterion("HEARTRATE is null");
            return (Criteria) this;
        }

        public Criteria andHeartrateIsNotNull() {
            addCriterion("HEARTRATE is not null");
            return (Criteria) this;
        }

        public Criteria andHeartrateEqualTo(String value) {
            addCriterion("HEARTRATE =", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateNotEqualTo(String value) {
            addCriterion("HEARTRATE <>", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateGreaterThan(String value) {
            addCriterion("HEARTRATE >", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateGreaterThanOrEqualTo(String value) {
            addCriterion("HEARTRATE >=", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateLessThan(String value) {
            addCriterion("HEARTRATE <", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateLessThanOrEqualTo(String value) {
            addCriterion("HEARTRATE <=", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateLike(String value) {
            addCriterion("HEARTRATE like", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateNotLike(String value) {
            addCriterion("HEARTRATE not like", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateIn(List<String> values) {
            addCriterion("HEARTRATE in", values, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateNotIn(List<String> values) {
            addCriterion("HEARTRATE not in", values, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateBetween(String value1, String value2) {
            addCriterion("HEARTRATE between", value1, value2, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateNotBetween(String value1, String value2) {
            addCriterion("HEARTRATE not between", value1, value2, "heartrate");
            return (Criteria) this;
        }

        public Criteria andBreatheIsNull() {
            addCriterion("BREATHE is null");
            return (Criteria) this;
        }

        public Criteria andBreatheIsNotNull() {
            addCriterion("BREATHE is not null");
            return (Criteria) this;
        }

        public Criteria andBreatheEqualTo(String value) {
            addCriterion("BREATHE =", value, "breathe");
            return (Criteria) this;
        }

        public Criteria andBreatheNotEqualTo(String value) {
            addCriterion("BREATHE <>", value, "breathe");
            return (Criteria) this;
        }

        public Criteria andBreatheGreaterThan(String value) {
            addCriterion("BREATHE >", value, "breathe");
            return (Criteria) this;
        }

        public Criteria andBreatheGreaterThanOrEqualTo(String value) {
            addCriterion("BREATHE >=", value, "breathe");
            return (Criteria) this;
        }

        public Criteria andBreatheLessThan(String value) {
            addCriterion("BREATHE <", value, "breathe");
            return (Criteria) this;
        }

        public Criteria andBreatheLessThanOrEqualTo(String value) {
            addCriterion("BREATHE <=", value, "breathe");
            return (Criteria) this;
        }

        public Criteria andBreatheLike(String value) {
            addCriterion("BREATHE like", value, "breathe");
            return (Criteria) this;
        }

        public Criteria andBreatheNotLike(String value) {
            addCriterion("BREATHE not like", value, "breathe");
            return (Criteria) this;
        }

        public Criteria andBreatheIn(List<String> values) {
            addCriterion("BREATHE in", values, "breathe");
            return (Criteria) this;
        }

        public Criteria andBreatheNotIn(List<String> values) {
            addCriterion("BREATHE not in", values, "breathe");
            return (Criteria) this;
        }

        public Criteria andBreatheBetween(String value1, String value2) {
            addCriterion("BREATHE between", value1, value2, "breathe");
            return (Criteria) this;
        }

        public Criteria andBreatheNotBetween(String value1, String value2) {
            addCriterion("BREATHE not between", value1, value2, "breathe");
            return (Criteria) this;
        }

        public Criteria andSpoIsNull() {
            addCriterion("SPO is null");
            return (Criteria) this;
        }

        public Criteria andSpoIsNotNull() {
            addCriterion("SPO is not null");
            return (Criteria) this;
        }

        public Criteria andSpoEqualTo(String value) {
            addCriterion("SPO =", value, "spo");
            return (Criteria) this;
        }

        public Criteria andSpoNotEqualTo(String value) {
            addCriterion("SPO <>", value, "spo");
            return (Criteria) this;
        }

        public Criteria andSpoGreaterThan(String value) {
            addCriterion("SPO >", value, "spo");
            return (Criteria) this;
        }

        public Criteria andSpoGreaterThanOrEqualTo(String value) {
            addCriterion("SPO >=", value, "spo");
            return (Criteria) this;
        }

        public Criteria andSpoLessThan(String value) {
            addCriterion("SPO <", value, "spo");
            return (Criteria) this;
        }

        public Criteria andSpoLessThanOrEqualTo(String value) {
            addCriterion("SPO <=", value, "spo");
            return (Criteria) this;
        }

        public Criteria andSpoLike(String value) {
            addCriterion("SPO like", value, "spo");
            return (Criteria) this;
        }

        public Criteria andSpoNotLike(String value) {
            addCriterion("SPO not like", value, "spo");
            return (Criteria) this;
        }

        public Criteria andSpoIn(List<String> values) {
            addCriterion("SPO in", values, "spo");
            return (Criteria) this;
        }

        public Criteria andSpoNotIn(List<String> values) {
            addCriterion("SPO not in", values, "spo");
            return (Criteria) this;
        }

        public Criteria andSpoBetween(String value1, String value2) {
            addCriterion("SPO between", value1, value2, "spo");
            return (Criteria) this;
        }

        public Criteria andSpoNotBetween(String value1, String value2) {
            addCriterion("SPO not between", value1, value2, "spo");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedIsNull() {
            addCriterion("DRIPPINGSPEED is null");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedIsNotNull() {
            addCriterion("DRIPPINGSPEED is not null");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedEqualTo(String value) {
            addCriterion("DRIPPINGSPEED =", value, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedNotEqualTo(String value) {
            addCriterion("DRIPPINGSPEED <>", value, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedGreaterThan(String value) {
            addCriterion("DRIPPINGSPEED >", value, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedGreaterThanOrEqualTo(String value) {
            addCriterion("DRIPPINGSPEED >=", value, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedLessThan(String value) {
            addCriterion("DRIPPINGSPEED <", value, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedLessThanOrEqualTo(String value) {
            addCriterion("DRIPPINGSPEED <=", value, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedLike(String value) {
            addCriterion("DRIPPINGSPEED like", value, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedNotLike(String value) {
            addCriterion("DRIPPINGSPEED not like", value, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedIn(List<String> values) {
            addCriterion("DRIPPINGSPEED in", values, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedNotIn(List<String> values) {
            addCriterion("DRIPPINGSPEED not in", values, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedBetween(String value1, String value2) {
            addCriterion("DRIPPINGSPEED between", value1, value2, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andDrippingspeedNotBetween(String value1, String value2) {
            addCriterion("DRIPPINGSPEED not between", value1, value2, "drippingspeed");
            return (Criteria) this;
        }

        public Criteria andNursrecordIsNull() {
            addCriterion("NURSRECORD is null");
            return (Criteria) this;
        }

        public Criteria andNursrecordIsNotNull() {
            addCriterion("NURSRECORD is not null");
            return (Criteria) this;
        }

        public Criteria andNursrecordEqualTo(String value) {
            addCriterion("NURSRECORD =", value, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andNursrecordNotEqualTo(String value) {
            addCriterion("NURSRECORD <>", value, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andNursrecordGreaterThan(String value) {
            addCriterion("NURSRECORD >", value, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andNursrecordGreaterThanOrEqualTo(String value) {
            addCriterion("NURSRECORD >=", value, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andNursrecordLessThan(String value) {
            addCriterion("NURSRECORD <", value, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andNursrecordLessThanOrEqualTo(String value) {
            addCriterion("NURSRECORD <=", value, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andNursrecordLike(String value) {
            addCriterion("NURSRECORD like", value, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andNursrecordNotLike(String value) {
            addCriterion("NURSRECORD not like", value, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andNursrecordIn(List<String> values) {
            addCriterion("NURSRECORD in", values, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andNursrecordNotIn(List<String> values) {
            addCriterion("NURSRECORD not in", values, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andNursrecordBetween(String value1, String value2) {
            addCriterion("NURSRECORD between", value1, value2, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andNursrecordNotBetween(String value1, String value2) {
            addCriterion("NURSRECORD not between", value1, value2, "nursrecord");
            return (Criteria) this;
        }

        public Criteria andReactioncontentIsNull() {
            addCriterion("REACTIONCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andReactioncontentIsNotNull() {
            addCriterion("REACTIONCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andReactioncontentEqualTo(String value) {
            addCriterion("REACTIONCONTENT =", value, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioncontentNotEqualTo(String value) {
            addCriterion("REACTIONCONTENT <>", value, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioncontentGreaterThan(String value) {
            addCriterion("REACTIONCONTENT >", value, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioncontentGreaterThanOrEqualTo(String value) {
            addCriterion("REACTIONCONTENT >=", value, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioncontentLessThan(String value) {
            addCriterion("REACTIONCONTENT <", value, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioncontentLessThanOrEqualTo(String value) {
            addCriterion("REACTIONCONTENT <=", value, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioncontentLike(String value) {
            addCriterion("REACTIONCONTENT like", value, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioncontentNotLike(String value) {
            addCriterion("REACTIONCONTENT not like", value, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioncontentIn(List<String> values) {
            addCriterion("REACTIONCONTENT in", values, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioncontentNotIn(List<String> values) {
            addCriterion("REACTIONCONTENT not in", values, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioncontentBetween(String value1, String value2) {
            addCriterion("REACTIONCONTENT between", value1, value2, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioncontentNotBetween(String value1, String value2) {
            addCriterion("REACTIONCONTENT not between", value1, value2, "reactioncontent");
            return (Criteria) this;
        }

        public Criteria andReactioindealIsNull() {
            addCriterion("REACTIOINDEAL is null");
            return (Criteria) this;
        }

        public Criteria andReactioindealIsNotNull() {
            addCriterion("REACTIOINDEAL is not null");
            return (Criteria) this;
        }

        public Criteria andReactioindealEqualTo(String value) {
            addCriterion("REACTIOINDEAL =", value, "reactioindeal");
            return (Criteria) this;
        }

        public Criteria andReactioindealNotEqualTo(String value) {
            addCriterion("REACTIOINDEAL <>", value, "reactioindeal");
            return (Criteria) this;
        }

        public Criteria andReactioindealGreaterThan(String value) {
            addCriterion("REACTIOINDEAL >", value, "reactioindeal");
            return (Criteria) this;
        }

        public Criteria andReactioindealGreaterThanOrEqualTo(String value) {
            addCriterion("REACTIOINDEAL >=", value, "reactioindeal");
            return (Criteria) this;
        }

        public Criteria andReactioindealLessThan(String value) {
            addCriterion("REACTIOINDEAL <", value, "reactioindeal");
            return (Criteria) this;
        }

        public Criteria andReactioindealLessThanOrEqualTo(String value) {
            addCriterion("REACTIOINDEAL <=", value, "reactioindeal");
            return (Criteria) this;
        }

        public Criteria andReactioindealLike(String value) {
            addCriterion("REACTIOINDEAL like", value, "reactioindeal");
            return (Criteria) this;
        }

        public Criteria andReactioindealNotLike(String value) {
            addCriterion("REACTIOINDEAL not like", value, "reactioindeal");
            return (Criteria) this;
        }

        public Criteria andReactioindealIn(List<String> values) {
            addCriterion("REACTIOINDEAL in", values, "reactioindeal");
            return (Criteria) this;
        }

        public Criteria andReactioindealNotIn(List<String> values) {
            addCriterion("REACTIOINDEAL not in", values, "reactioindeal");
            return (Criteria) this;
        }

        public Criteria andReactioindealBetween(String value1, String value2) {
            addCriterion("REACTIOINDEAL between", value1, value2, "reactioindeal");
            return (Criteria) this;
        }

        public Criteria andReactioindealNotBetween(String value1, String value2) {
            addCriterion("REACTIOINDEAL not between", value1, value2, "reactioindeal");
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