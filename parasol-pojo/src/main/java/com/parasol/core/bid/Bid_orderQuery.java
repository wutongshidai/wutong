package com.parasol.core.bid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bid_orderQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public Bid_orderQuery() {
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

        public Criteria andBidInfoidIsNull() {
            addCriterion("bid_infoId is null");
            return (Criteria) this;
        }

        public Criteria andBidInfoidIsNotNull() {
            addCriterion("bid_infoId is not null");
            return (Criteria) this;
        }

        public Criteria andBidInfoidEqualTo(Integer value) {
            addCriterion("bid_infoId =", value, "bidInfoid");
            return (Criteria) this;
        }

        public Criteria andBidInfoidNotEqualTo(Integer value) {
            addCriterion("bid_infoId <>", value, "bidInfoid");
            return (Criteria) this;
        }

        public Criteria andBidInfoidGreaterThan(Integer value) {
            addCriterion("bid_infoId >", value, "bidInfoid");
            return (Criteria) this;
        }

        public Criteria andBidInfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_infoId >=", value, "bidInfoid");
            return (Criteria) this;
        }

        public Criteria andBidInfoidLessThan(Integer value) {
            addCriterion("bid_infoId <", value, "bidInfoid");
            return (Criteria) this;
        }

        public Criteria andBidInfoidLessThanOrEqualTo(Integer value) {
            addCriterion("bid_infoId <=", value, "bidInfoid");
            return (Criteria) this;
        }

        public Criteria andBidInfoidIn(List<Integer> values) {
            addCriterion("bid_infoId in", values, "bidInfoid");
            return (Criteria) this;
        }

        public Criteria andBidInfoidNotIn(List<Integer> values) {
            addCriterion("bid_infoId not in", values, "bidInfoid");
            return (Criteria) this;
        }

        public Criteria andBidInfoidBetween(Integer value1, Integer value2) {
            addCriterion("bid_infoId between", value1, value2, "bidInfoid");
            return (Criteria) this;
        }

        public Criteria andBidInfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_infoId not between", value1, value2, "bidInfoid");
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

        public Criteria andTenderidIsNull() {
            addCriterion("tenderId is null");
            return (Criteria) this;
        }

        public Criteria andTenderidIsNotNull() {
            addCriterion("tenderId is not null");
            return (Criteria) this;
        }

        public Criteria andTenderidEqualTo(Integer value) {
            addCriterion("tenderId =", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidNotEqualTo(Integer value) {
            addCriterion("tenderId <>", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidGreaterThan(Integer value) {
            addCriterion("tenderId >", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tenderId >=", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidLessThan(Integer value) {
            addCriterion("tenderId <", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidLessThanOrEqualTo(Integer value) {
            addCriterion("tenderId <=", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidIn(List<Integer> values) {
            addCriterion("tenderId in", values, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidNotIn(List<Integer> values) {
            addCriterion("tenderId not in", values, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidBetween(Integer value1, Integer value2) {
            addCriterion("tenderId between", value1, value2, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidNotBetween(Integer value1, Integer value2) {
            addCriterion("tenderId not between", value1, value2, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenUseridIsNull() {
            addCriterion("ten_userId is null");
            return (Criteria) this;
        }

        public Criteria andTenUseridIsNotNull() {
            addCriterion("ten_userId is not null");
            return (Criteria) this;
        }

        public Criteria andTenUseridEqualTo(Integer value) {
            addCriterion("ten_userId =", value, "tenUserid");
            return (Criteria) this;
        }

        public Criteria andTenUseridNotEqualTo(Integer value) {
            addCriterion("ten_userId <>", value, "tenUserid");
            return (Criteria) this;
        }

        public Criteria andTenUseridGreaterThan(Integer value) {
            addCriterion("ten_userId >", value, "tenUserid");
            return (Criteria) this;
        }

        public Criteria andTenUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ten_userId >=", value, "tenUserid");
            return (Criteria) this;
        }

        public Criteria andTenUseridLessThan(Integer value) {
            addCriterion("ten_userId <", value, "tenUserid");
            return (Criteria) this;
        }

        public Criteria andTenUseridLessThanOrEqualTo(Integer value) {
            addCriterion("ten_userId <=", value, "tenUserid");
            return (Criteria) this;
        }

        public Criteria andTenUseridIn(List<Integer> values) {
            addCriterion("ten_userId in", values, "tenUserid");
            return (Criteria) this;
        }

        public Criteria andTenUseridNotIn(List<Integer> values) {
            addCriterion("ten_userId not in", values, "tenUserid");
            return (Criteria) this;
        }

        public Criteria andTenUseridBetween(Integer value1, Integer value2) {
            addCriterion("ten_userId between", value1, value2, "tenUserid");
            return (Criteria) this;
        }

        public Criteria andTenUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("ten_userId not between", value1, value2, "tenUserid");
            return (Criteria) this;
        }

        public Criteria andBidBondIsNull() {
            addCriterion("bid_bond is null");
            return (Criteria) this;
        }

        public Criteria andBidBondIsNotNull() {
            addCriterion("bid_bond is not null");
            return (Criteria) this;
        }

        public Criteria andBidBondEqualTo(Double value) {
            addCriterion("bid_bond =", value, "bidBond");
            return (Criteria) this;
        }

        public Criteria andBidBondNotEqualTo(Double value) {
            addCriterion("bid_bond <>", value, "bidBond");
            return (Criteria) this;
        }

        public Criteria andBidBondGreaterThan(Double value) {
            addCriterion("bid_bond >", value, "bidBond");
            return (Criteria) this;
        }

        public Criteria andBidBondGreaterThanOrEqualTo(Double value) {
            addCriterion("bid_bond >=", value, "bidBond");
            return (Criteria) this;
        }

        public Criteria andBidBondLessThan(Double value) {
            addCriterion("bid_bond <", value, "bidBond");
            return (Criteria) this;
        }

        public Criteria andBidBondLessThanOrEqualTo(Double value) {
            addCriterion("bid_bond <=", value, "bidBond");
            return (Criteria) this;
        }

        public Criteria andBidBondIn(List<Double> values) {
            addCriterion("bid_bond in", values, "bidBond");
            return (Criteria) this;
        }

        public Criteria andBidBondNotIn(List<Double> values) {
            addCriterion("bid_bond not in", values, "bidBond");
            return (Criteria) this;
        }

        public Criteria andBidBondBetween(Double value1, Double value2) {
            addCriterion("bid_bond between", value1, value2, "bidBond");
            return (Criteria) this;
        }

        public Criteria andBidBondNotBetween(Double value1, Double value2) {
            addCriterion("bid_bond not between", value1, value2, "bidBond");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Integer value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Integer value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Integer value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Integer value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Integer> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Integer> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
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

        public Criteria andRefundUserIsNull() {
            addCriterion("refund_user is null");
            return (Criteria) this;
        }

        public Criteria andRefundUserIsNotNull() {
            addCriterion("refund_user is not null");
            return (Criteria) this;
        }

        public Criteria andRefundUserEqualTo(Integer value) {
            addCriterion("refund_user =", value, "refundUser");
            return (Criteria) this;
        }

        public Criteria andRefundUserNotEqualTo(Integer value) {
            addCriterion("refund_user <>", value, "refundUser");
            return (Criteria) this;
        }

        public Criteria andRefundUserGreaterThan(Integer value) {
            addCriterion("refund_user >", value, "refundUser");
            return (Criteria) this;
        }

        public Criteria andRefundUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_user >=", value, "refundUser");
            return (Criteria) this;
        }

        public Criteria andRefundUserLessThan(Integer value) {
            addCriterion("refund_user <", value, "refundUser");
            return (Criteria) this;
        }

        public Criteria andRefundUserLessThanOrEqualTo(Integer value) {
            addCriterion("refund_user <=", value, "refundUser");
            return (Criteria) this;
        }

        public Criteria andRefundUserIn(List<Integer> values) {
            addCriterion("refund_user in", values, "refundUser");
            return (Criteria) this;
        }

        public Criteria andRefundUserNotIn(List<Integer> values) {
            addCriterion("refund_user not in", values, "refundUser");
            return (Criteria) this;
        }

        public Criteria andRefundUserBetween(Integer value1, Integer value2) {
            addCriterion("refund_user between", value1, value2, "refundUser");
            return (Criteria) this;
        }

        public Criteria andRefundUserNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_user not between", value1, value2, "refundUser");
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