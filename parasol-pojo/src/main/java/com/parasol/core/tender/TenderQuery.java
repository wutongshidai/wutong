package com.parasol.core.tender;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TenderQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public TenderQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTendereeIsNull() {
            addCriterion("tenderee is null");
            return (Criteria) this;
        }

        public Criteria andTendereeIsNotNull() {
            addCriterion("tenderee is not null");
            return (Criteria) this;
        }

        public Criteria andTendereeEqualTo(String value) {
            addCriterion("tenderee =", value, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTendereeNotEqualTo(String value) {
            addCriterion("tenderee <>", value, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTendereeGreaterThan(String value) {
            addCriterion("tenderee >", value, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTendereeGreaterThanOrEqualTo(String value) {
            addCriterion("tenderee >=", value, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTendereeLessThan(String value) {
            addCriterion("tenderee <", value, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTendereeLessThanOrEqualTo(String value) {
            addCriterion("tenderee <=", value, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTendereeLike(String value) {
            addCriterion("tenderee like", value, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTendereeNotLike(String value) {
            addCriterion("tenderee not like", value, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTendereeIn(List<String> values) {
            addCriterion("tenderee in", values, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTendereeNotIn(List<String> values) {
            addCriterion("tenderee not in", values, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTendereeBetween(String value1, String value2) {
            addCriterion("tenderee between", value1, value2, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTendereeNotBetween(String value1, String value2) {
            addCriterion("tenderee not between", value1, value2, "tenderee");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyIsNull() {
            addCriterion("tender_company is null");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyIsNotNull() {
            addCriterion("tender_company is not null");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyEqualTo(String value) {
            addCriterion("tender_company =", value, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyNotEqualTo(String value) {
            addCriterion("tender_company <>", value, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyGreaterThan(String value) {
            addCriterion("tender_company >", value, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("tender_company >=", value, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyLessThan(String value) {
            addCriterion("tender_company <", value, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyLessThanOrEqualTo(String value) {
            addCriterion("tender_company <=", value, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyLike(String value) {
            addCriterion("tender_company like", value, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyNotLike(String value) {
            addCriterion("tender_company not like", value, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyIn(List<String> values) {
            addCriterion("tender_company in", values, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyNotIn(List<String> values) {
            addCriterion("tender_company not in", values, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyBetween(String value1, String value2) {
            addCriterion("tender_company between", value1, value2, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andTenderCompanyNotBetween(String value1, String value2) {
            addCriterion("tender_company not between", value1, value2, "tenderCompany");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceIsNull() {
            addCriterion("agreement_price is null");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceIsNotNull() {
            addCriterion("agreement_price is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceEqualTo(Double value) {
            addCriterion("agreement_price =", value, "agreementPrice");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceNotEqualTo(Double value) {
            addCriterion("agreement_price <>", value, "agreementPrice");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceGreaterThan(Double value) {
            addCriterion("agreement_price >", value, "agreementPrice");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("agreement_price >=", value, "agreementPrice");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceLessThan(Double value) {
            addCriterion("agreement_price <", value, "agreementPrice");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceLessThanOrEqualTo(Double value) {
            addCriterion("agreement_price <=", value, "agreementPrice");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceIn(List<Double> values) {
            addCriterion("agreement_price in", values, "agreementPrice");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceNotIn(List<Double> values) {
            addCriterion("agreement_price not in", values, "agreementPrice");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceBetween(Double value1, Double value2) {
            addCriterion("agreement_price between", value1, value2, "agreementPrice");
            return (Criteria) this;
        }

        public Criteria andAgreementPriceNotBetween(Double value1, Double value2) {
            addCriterion("agreement_price not between", value1, value2, "agreementPrice");
            return (Criteria) this;
        }

        public Criteria andProjectLocationIsNull() {
            addCriterion("project_location is null");
            return (Criteria) this;
        }

        public Criteria andProjectLocationIsNotNull() {
            addCriterion("project_location is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLocationEqualTo(String value) {
            addCriterion("project_location =", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationNotEqualTo(String value) {
            addCriterion("project_location <>", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationGreaterThan(String value) {
            addCriterion("project_location >", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationGreaterThanOrEqualTo(String value) {
            addCriterion("project_location >=", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationLessThan(String value) {
            addCriterion("project_location <", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationLessThanOrEqualTo(String value) {
            addCriterion("project_location <=", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationLike(String value) {
            addCriterion("project_location like", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationNotLike(String value) {
            addCriterion("project_location not like", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationIn(List<String> values) {
            addCriterion("project_location in", values, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationNotIn(List<String> values) {
            addCriterion("project_location not in", values, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationBetween(String value1, String value2) {
            addCriterion("project_location between", value1, value2, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationNotBetween(String value1, String value2) {
            addCriterion("project_location not between", value1, value2, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNull() {
            addCriterion("schedule is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNotNull() {
            addCriterion("schedule is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleEqualTo(Integer value) {
            addCriterion("schedule =", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotEqualTo(Integer value) {
            addCriterion("schedule <>", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThan(Integer value) {
            addCriterion("schedule >", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule >=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThan(Integer value) {
            addCriterion("schedule <", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThanOrEqualTo(Integer value) {
            addCriterion("schedule <=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleIn(List<Integer> values) {
            addCriterion("schedule in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotIn(List<Integer> values) {
            addCriterion("schedule not in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleBetween(Integer value1, Integer value2) {
            addCriterion("schedule between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule not between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactMobileIsNull() {
            addCriterion("contact_mobile is null");
            return (Criteria) this;
        }

        public Criteria andContactMobileIsNotNull() {
            addCriterion("contact_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andContactMobileEqualTo(String value) {
            addCriterion("contact_mobile =", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotEqualTo(String value) {
            addCriterion("contact_mobile <>", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThan(String value) {
            addCriterion("contact_mobile >", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThanOrEqualTo(String value) {
            addCriterion("contact_mobile >=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThan(String value) {
            addCriterion("contact_mobile <", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThanOrEqualTo(String value) {
            addCriterion("contact_mobile <=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLike(String value) {
            addCriterion("contact_mobile like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotLike(String value) {
            addCriterion("contact_mobile not like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileIn(List<String> values) {
            addCriterion("contact_mobile in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotIn(List<String> values) {
            addCriterion("contact_mobile not in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileBetween(String value1, String value2) {
            addCriterion("contact_mobile between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotBetween(String value1, String value2) {
            addCriterion("contact_mobile not between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andTenderAddressIsNull() {
            addCriterion("tender_address is null");
            return (Criteria) this;
        }

        public Criteria andTenderAddressIsNotNull() {
            addCriterion("tender_address is not null");
            return (Criteria) this;
        }

        public Criteria andTenderAddressEqualTo(String value) {
            addCriterion("tender_address =", value, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderAddressNotEqualTo(String value) {
            addCriterion("tender_address <>", value, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderAddressGreaterThan(String value) {
            addCriterion("tender_address >", value, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tender_address >=", value, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderAddressLessThan(String value) {
            addCriterion("tender_address <", value, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderAddressLessThanOrEqualTo(String value) {
            addCriterion("tender_address <=", value, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderAddressLike(String value) {
            addCriterion("tender_address like", value, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderAddressNotLike(String value) {
            addCriterion("tender_address not like", value, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderAddressIn(List<String> values) {
            addCriterion("tender_address in", values, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderAddressNotIn(List<String> values) {
            addCriterion("tender_address not in", values, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderAddressBetween(String value1, String value2) {
            addCriterion("tender_address between", value1, value2, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderAddressNotBetween(String value1, String value2) {
            addCriterion("tender_address not between", value1, value2, "tenderAddress");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyIsNull() {
            addCriterion("tender_money is null");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyIsNotNull() {
            addCriterion("tender_money is not null");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyEqualTo(Double value) {
            addCriterion("tender_money =", value, "tenderMoney");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyNotEqualTo(Double value) {
            addCriterion("tender_money <>", value, "tenderMoney");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyGreaterThan(Double value) {
            addCriterion("tender_money >", value, "tenderMoney");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tender_money >=", value, "tenderMoney");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyLessThan(Double value) {
            addCriterion("tender_money <", value, "tenderMoney");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyLessThanOrEqualTo(Double value) {
            addCriterion("tender_money <=", value, "tenderMoney");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyIn(List<Double> values) {
            addCriterion("tender_money in", values, "tenderMoney");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyNotIn(List<Double> values) {
            addCriterion("tender_money not in", values, "tenderMoney");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyBetween(Double value1, Double value2) {
            addCriterion("tender_money between", value1, value2, "tenderMoney");
            return (Criteria) this;
        }

        public Criteria andTenderMoneyNotBetween(Double value1, Double value2) {
            addCriterion("tender_money not between", value1, value2, "tenderMoney");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNull() {
            addCriterion("contract_status is null");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNotNull() {
            addCriterion("contract_status is not null");
            return (Criteria) this;
        }

        public Criteria andContractStatusEqualTo(Integer value) {
            addCriterion("contract_status =", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotEqualTo(Integer value) {
            addCriterion("contract_status <>", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThan(Integer value) {
            addCriterion("contract_status >", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_status >=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThan(Integer value) {
            addCriterion("contract_status <", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThanOrEqualTo(Integer value) {
            addCriterion("contract_status <=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusIn(List<Integer> values) {
            addCriterion("contract_status in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotIn(List<Integer> values) {
            addCriterion("contract_status not in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusBetween(Integer value1, Integer value2) {
            addCriterion("contract_status between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_status not between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("bill_status is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(Integer value) {
            addCriterion("bill_status =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(Integer value) {
            addCriterion("bill_status <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(Integer value) {
            addCriterion("bill_status >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_status >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(Integer value) {
            addCriterion("bill_status <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(Integer value) {
            addCriterion("bill_status <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<Integer> values) {
            addCriterion("bill_status in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<Integer> values) {
            addCriterion("bill_status not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(Integer value1, Integer value2) {
            addCriterion("bill_status between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_status not between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIsNull() {
            addCriterion("price_status is null");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIsNotNull() {
            addCriterion("price_status is not null");
            return (Criteria) this;
        }

        public Criteria andPriceStatusEqualTo(Integer value) {
            addCriterion("price_status =", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotEqualTo(Integer value) {
            addCriterion("price_status <>", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusGreaterThan(Integer value) {
            addCriterion("price_status >", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_status >=", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusLessThan(Integer value) {
            addCriterion("price_status <", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("price_status <=", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIn(List<Integer> values) {
            addCriterion("price_status in", values, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotIn(List<Integer> values) {
            addCriterion("price_status not in", values, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusBetween(Integer value1, Integer value2) {
            addCriterion("price_status between", value1, value2, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("price_status not between", value1, value2, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andExplainlIsNull() {
            addCriterion("explainl is null");
            return (Criteria) this;
        }

        public Criteria andExplainlIsNotNull() {
            addCriterion("explainl is not null");
            return (Criteria) this;
        }

        public Criteria andExplainlEqualTo(String value) {
            addCriterion("explainl =", value, "explainl");
            return (Criteria) this;
        }

        public Criteria andExplainlNotEqualTo(String value) {
            addCriterion("explainl <>", value, "explainl");
            return (Criteria) this;
        }

        public Criteria andExplainlGreaterThan(String value) {
            addCriterion("explainl >", value, "explainl");
            return (Criteria) this;
        }

        public Criteria andExplainlGreaterThanOrEqualTo(String value) {
            addCriterion("explainl >=", value, "explainl");
            return (Criteria) this;
        }

        public Criteria andExplainlLessThan(String value) {
            addCriterion("explainl <", value, "explainl");
            return (Criteria) this;
        }

        public Criteria andExplainlLessThanOrEqualTo(String value) {
            addCriterion("explainl <=", value, "explainl");
            return (Criteria) this;
        }

        public Criteria andExplainlLike(String value) {
            addCriterion("explainl like", value, "explainl");
            return (Criteria) this;
        }

        public Criteria andExplainlNotLike(String value) {
            addCriterion("explainl not like", value, "explainl");
            return (Criteria) this;
        }

        public Criteria andExplainlIn(List<String> values) {
            addCriterion("explainl in", values, "explainl");
            return (Criteria) this;
        }

        public Criteria andExplainlNotIn(List<String> values) {
            addCriterion("explainl not in", values, "explainl");
            return (Criteria) this;
        }

        public Criteria andExplainlBetween(String value1, String value2) {
            addCriterion("explainl between", value1, value2, "explainl");
            return (Criteria) this;
        }

        public Criteria andExplainlNotBetween(String value1, String value2) {
            addCriterion("explainl not between", value1, value2, "explainl");
            return (Criteria) this;
        }

        public Criteria andTenderFileIsNull() {
            addCriterion("tender_file is null");
            return (Criteria) this;
        }

        public Criteria andTenderFileIsNotNull() {
            addCriterion("tender_file is not null");
            return (Criteria) this;
        }

        public Criteria andTenderFileEqualTo(String value) {
            addCriterion("tender_file =", value, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andTenderFileNotEqualTo(String value) {
            addCriterion("tender_file <>", value, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andTenderFileGreaterThan(String value) {
            addCriterion("tender_file >", value, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andTenderFileGreaterThanOrEqualTo(String value) {
            addCriterion("tender_file >=", value, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andTenderFileLessThan(String value) {
            addCriterion("tender_file <", value, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andTenderFileLessThanOrEqualTo(String value) {
            addCriterion("tender_file <=", value, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andTenderFileLike(String value) {
            addCriterion("tender_file like", value, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andTenderFileNotLike(String value) {
            addCriterion("tender_file not like", value, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andTenderFileIn(List<String> values) {
            addCriterion("tender_file in", values, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andTenderFileNotIn(List<String> values) {
            addCriterion("tender_file not in", values, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andTenderFileBetween(String value1, String value2) {
            addCriterion("tender_file between", value1, value2, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andTenderFileNotBetween(String value1, String value2) {
            addCriterion("tender_file not between", value1, value2, "tenderFile");
            return (Criteria) this;
        }

        public Criteria andBidFileIsNull() {
            addCriterion("bid_file is null");
            return (Criteria) this;
        }

        public Criteria andBidFileIsNotNull() {
            addCriterion("bid_file is not null");
            return (Criteria) this;
        }

        public Criteria andBidFileEqualTo(String value) {
            addCriterion("bid_file =", value, "bidFile");
            return (Criteria) this;
        }

        public Criteria andBidFileNotEqualTo(String value) {
            addCriterion("bid_file <>", value, "bidFile");
            return (Criteria) this;
        }

        public Criteria andBidFileGreaterThan(String value) {
            addCriterion("bid_file >", value, "bidFile");
            return (Criteria) this;
        }

        public Criteria andBidFileGreaterThanOrEqualTo(String value) {
            addCriterion("bid_file >=", value, "bidFile");
            return (Criteria) this;
        }

        public Criteria andBidFileLessThan(String value) {
            addCriterion("bid_file <", value, "bidFile");
            return (Criteria) this;
        }

        public Criteria andBidFileLessThanOrEqualTo(String value) {
            addCriterion("bid_file <=", value, "bidFile");
            return (Criteria) this;
        }

        public Criteria andBidFileLike(String value) {
            addCriterion("bid_file like", value, "bidFile");
            return (Criteria) this;
        }

        public Criteria andBidFileNotLike(String value) {
            addCriterion("bid_file not like", value, "bidFile");
            return (Criteria) this;
        }

        public Criteria andBidFileIn(List<String> values) {
            addCriterion("bid_file in", values, "bidFile");
            return (Criteria) this;
        }

        public Criteria andBidFileNotIn(List<String> values) {
            addCriterion("bid_file not in", values, "bidFile");
            return (Criteria) this;
        }

        public Criteria andBidFileBetween(String value1, String value2) {
            addCriterion("bid_file between", value1, value2, "bidFile");
            return (Criteria) this;
        }

        public Criteria andBidFileNotBetween(String value1, String value2) {
            addCriterion("bid_file not between", value1, value2, "bidFile");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(String value) {
            addCriterion("project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(String value) {
            addCriterion("project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(String value) {
            addCriterion("project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(String value) {
            addCriterion("project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(String value) {
            addCriterion("project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLike(String value) {
            addCriterion("project_type like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotLike(String value) {
            addCriterion("project_type not like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<String> values) {
            addCriterion("project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<String> values) {
            addCriterion("project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(String value1, String value2) {
            addCriterion("project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(String value1, String value2) {
            addCriterion("project_type not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andClassificationIsNull() {
            addCriterion("classification is null");
            return (Criteria) this;
        }

        public Criteria andClassificationIsNotNull() {
            addCriterion("classification is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationEqualTo(Integer value) {
            addCriterion("classification =", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotEqualTo(Integer value) {
            addCriterion("classification <>", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThan(Integer value) {
            addCriterion("classification >", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("classification >=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThan(Integer value) {
            addCriterion("classification <", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThanOrEqualTo(Integer value) {
            addCriterion("classification <=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationIn(List<Integer> values) {
            addCriterion("classification in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotIn(List<Integer> values) {
            addCriterion("classification not in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationBetween(Integer value1, Integer value2) {
            addCriterion("classification between", value1, value2, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotBetween(Integer value1, Integer value2) {
            addCriterion("classification not between", value1, value2, "classification");
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