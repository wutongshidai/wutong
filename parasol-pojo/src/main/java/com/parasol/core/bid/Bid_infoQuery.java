package com.parasol.core.bid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bid_infoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public Bid_infoQuery() {
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

        public Criteria andComUseridIsNull() {
            addCriterion("com_userId is null");
            return (Criteria) this;
        }

        public Criteria andComUseridIsNotNull() {
            addCriterion("com_userId is not null");
            return (Criteria) this;
        }

        public Criteria andComUseridEqualTo(Integer value) {
            addCriterion("com_userId =", value, "comUserid");
            return (Criteria) this;
        }

        public Criteria andComUseridNotEqualTo(Integer value) {
            addCriterion("com_userId <>", value, "comUserid");
            return (Criteria) this;
        }

        public Criteria andComUseridGreaterThan(Integer value) {
            addCriterion("com_userId >", value, "comUserid");
            return (Criteria) this;
        }

        public Criteria andComUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_userId >=", value, "comUserid");
            return (Criteria) this;
        }

        public Criteria andComUseridLessThan(Integer value) {
            addCriterion("com_userId <", value, "comUserid");
            return (Criteria) this;
        }

        public Criteria andComUseridLessThanOrEqualTo(Integer value) {
            addCriterion("com_userId <=", value, "comUserid");
            return (Criteria) this;
        }

        public Criteria andComUseridIn(List<Integer> values) {
            addCriterion("com_userId in", values, "comUserid");
            return (Criteria) this;
        }

        public Criteria andComUseridNotIn(List<Integer> values) {
            addCriterion("com_userId not in", values, "comUserid");
            return (Criteria) this;
        }

        public Criteria andComUseridBetween(Integer value1, Integer value2) {
            addCriterion("com_userId between", value1, value2, "comUserid");
            return (Criteria) this;
        }

        public Criteria andComUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("com_userId not between", value1, value2, "comUserid");
            return (Criteria) this;
        }

        public Criteria andBidCompanyIsNull() {
            addCriterion("bid_company is null");
            return (Criteria) this;
        }

        public Criteria andBidCompanyIsNotNull() {
            addCriterion("bid_company is not null");
            return (Criteria) this;
        }

        public Criteria andBidCompanyEqualTo(String value) {
            addCriterion("bid_company =", value, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidCompanyNotEqualTo(String value) {
            addCriterion("bid_company <>", value, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidCompanyGreaterThan(String value) {
            addCriterion("bid_company >", value, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("bid_company >=", value, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidCompanyLessThan(String value) {
            addCriterion("bid_company <", value, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidCompanyLessThanOrEqualTo(String value) {
            addCriterion("bid_company <=", value, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidCompanyLike(String value) {
            addCriterion("bid_company like", value, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidCompanyNotLike(String value) {
            addCriterion("bid_company not like", value, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidCompanyIn(List<String> values) {
            addCriterion("bid_company in", values, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidCompanyNotIn(List<String> values) {
            addCriterion("bid_company not in", values, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidCompanyBetween(String value1, String value2) {
            addCriterion("bid_company between", value1, value2, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidCompanyNotBetween(String value1, String value2) {
            addCriterion("bid_company not between", value1, value2, "bidCompany");
            return (Criteria) this;
        }

        public Criteria andBidUserIsNull() {
            addCriterion("bid_user is null");
            return (Criteria) this;
        }

        public Criteria andBidUserIsNotNull() {
            addCriterion("bid_user is not null");
            return (Criteria) this;
        }

        public Criteria andBidUserEqualTo(String value) {
            addCriterion("bid_user =", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserNotEqualTo(String value) {
            addCriterion("bid_user <>", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserGreaterThan(String value) {
            addCriterion("bid_user >", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserGreaterThanOrEqualTo(String value) {
            addCriterion("bid_user >=", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserLessThan(String value) {
            addCriterion("bid_user <", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserLessThanOrEqualTo(String value) {
            addCriterion("bid_user <=", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserLike(String value) {
            addCriterion("bid_user like", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserNotLike(String value) {
            addCriterion("bid_user not like", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserIn(List<String> values) {
            addCriterion("bid_user in", values, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserNotIn(List<String> values) {
            addCriterion("bid_user not in", values, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserBetween(String value1, String value2) {
            addCriterion("bid_user between", value1, value2, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserNotBetween(String value1, String value2) {
            addCriterion("bid_user not between", value1, value2, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidPhoneIsNull() {
            addCriterion("bid_phone is null");
            return (Criteria) this;
        }

        public Criteria andBidPhoneIsNotNull() {
            addCriterion("bid_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBidPhoneEqualTo(String value) {
            addCriterion("bid_phone =", value, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andBidPhoneNotEqualTo(String value) {
            addCriterion("bid_phone <>", value, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andBidPhoneGreaterThan(String value) {
            addCriterion("bid_phone >", value, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andBidPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("bid_phone >=", value, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andBidPhoneLessThan(String value) {
            addCriterion("bid_phone <", value, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andBidPhoneLessThanOrEqualTo(String value) {
            addCriterion("bid_phone <=", value, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andBidPhoneLike(String value) {
            addCriterion("bid_phone like", value, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andBidPhoneNotLike(String value) {
            addCriterion("bid_phone not like", value, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andBidPhoneIn(List<String> values) {
            addCriterion("bid_phone in", values, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andBidPhoneNotIn(List<String> values) {
            addCriterion("bid_phone not in", values, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andBidPhoneBetween(String value1, String value2) {
            addCriterion("bid_phone between", value1, value2, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andBidPhoneNotBetween(String value1, String value2) {
            addCriterion("bid_phone not between", value1, value2, "bidPhone");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("creatTime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("creatTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterion("creatTime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterion("creatTime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterion("creatTime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatTime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterion("creatTime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("creatTime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterion("creatTime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterion("creatTime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterion("creatTime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("creatTime not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andBidMailIsNull() {
            addCriterion("bid_mail is null");
            return (Criteria) this;
        }

        public Criteria andBidMailIsNotNull() {
            addCriterion("bid_mail is not null");
            return (Criteria) this;
        }

        public Criteria andBidMailEqualTo(String value) {
            addCriterion("bid_mail =", value, "bidMail");
            return (Criteria) this;
        }

        public Criteria andBidMailNotEqualTo(String value) {
            addCriterion("bid_mail <>", value, "bidMail");
            return (Criteria) this;
        }

        public Criteria andBidMailGreaterThan(String value) {
            addCriterion("bid_mail >", value, "bidMail");
            return (Criteria) this;
        }

        public Criteria andBidMailGreaterThanOrEqualTo(String value) {
            addCriterion("bid_mail >=", value, "bidMail");
            return (Criteria) this;
        }

        public Criteria andBidMailLessThan(String value) {
            addCriterion("bid_mail <", value, "bidMail");
            return (Criteria) this;
        }

        public Criteria andBidMailLessThanOrEqualTo(String value) {
            addCriterion("bid_mail <=", value, "bidMail");
            return (Criteria) this;
        }

        public Criteria andBidMailLike(String value) {
            addCriterion("bid_mail like", value, "bidMail");
            return (Criteria) this;
        }

        public Criteria andBidMailNotLike(String value) {
            addCriterion("bid_mail not like", value, "bidMail");
            return (Criteria) this;
        }

        public Criteria andBidMailIn(List<String> values) {
            addCriterion("bid_mail in", values, "bidMail");
            return (Criteria) this;
        }

        public Criteria andBidMailNotIn(List<String> values) {
            addCriterion("bid_mail not in", values, "bidMail");
            return (Criteria) this;
        }

        public Criteria andBidMailBetween(String value1, String value2) {
            addCriterion("bid_mail between", value1, value2, "bidMail");
            return (Criteria) this;
        }

        public Criteria andBidMailNotBetween(String value1, String value2) {
            addCriterion("bid_mail not between", value1, value2, "bidMail");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNull() {
            addCriterion("referrer is null");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNotNull() {
            addCriterion("referrer is not null");
            return (Criteria) this;
        }

        public Criteria andReferrerEqualTo(String value) {
            addCriterion("referrer =", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotEqualTo(String value) {
            addCriterion("referrer <>", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThan(String value) {
            addCriterion("referrer >", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThanOrEqualTo(String value) {
            addCriterion("referrer >=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThan(String value) {
            addCriterion("referrer <", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThanOrEqualTo(String value) {
            addCriterion("referrer <=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLike(String value) {
            addCriterion("referrer like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotLike(String value) {
            addCriterion("referrer not like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerIn(List<String> values) {
            addCriterion("referrer in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotIn(List<String> values) {
            addCriterion("referrer not in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerBetween(String value1, String value2) {
            addCriterion("referrer between", value1, value2, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotBetween(String value1, String value2) {
            addCriterion("referrer not between", value1, value2, "referrer");
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