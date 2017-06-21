package com.parasol.core.experts;

import java.util.ArrayList;
import java.util.List;

public class ExpertsMapper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public ExpertsMapper() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(Integer value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(Integer value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(Integer value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(Integer value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(Integer value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(Integer value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<Integer> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<Integer> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(Integer value1, Integer value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(Integer value1, Integer value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andFieldIsNull() {
            addCriterion("field is null");
            return (Criteria) this;
        }

        public Criteria andFieldIsNotNull() {
            addCriterion("field is not null");
            return (Criteria) this;
        }

        public Criteria andFieldEqualTo(Integer value) {
            addCriterion("field =", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotEqualTo(Integer value) {
            addCriterion("field <>", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThan(Integer value) {
            addCriterion("field >", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThanOrEqualTo(Integer value) {
            addCriterion("field >=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThan(Integer value) {
            addCriterion("field <", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThanOrEqualTo(Integer value) {
            addCriterion("field <=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldIn(List<Integer> values) {
            addCriterion("field in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotIn(List<Integer> values) {
            addCriterion("field not in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldBetween(Integer value1, Integer value2) {
            addCriterion("field between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotBetween(Integer value1, Integer value2) {
            addCriterion("field not between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andDateWorkeIsNull() {
            addCriterion("date_worke is null");
            return (Criteria) this;
        }

        public Criteria andDateWorkeIsNotNull() {
            addCriterion("date_worke is not null");
            return (Criteria) this;
        }

        public Criteria andDateWorkeEqualTo(Integer value) {
            addCriterion("date_worke =", value, "dateWorke");
            return (Criteria) this;
        }

        public Criteria andDateWorkeNotEqualTo(Integer value) {
            addCriterion("date_worke <>", value, "dateWorke");
            return (Criteria) this;
        }

        public Criteria andDateWorkeGreaterThan(Integer value) {
            addCriterion("date_worke >", value, "dateWorke");
            return (Criteria) this;
        }

        public Criteria andDateWorkeGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_worke >=", value, "dateWorke");
            return (Criteria) this;
        }

        public Criteria andDateWorkeLessThan(Integer value) {
            addCriterion("date_worke <", value, "dateWorke");
            return (Criteria) this;
        }

        public Criteria andDateWorkeLessThanOrEqualTo(Integer value) {
            addCriterion("date_worke <=", value, "dateWorke");
            return (Criteria) this;
        }

        public Criteria andDateWorkeIn(List<Integer> values) {
            addCriterion("date_worke in", values, "dateWorke");
            return (Criteria) this;
        }

        public Criteria andDateWorkeNotIn(List<Integer> values) {
            addCriterion("date_worke not in", values, "dateWorke");
            return (Criteria) this;
        }

        public Criteria andDateWorkeBetween(Integer value1, Integer value2) {
            addCriterion("date_worke between", value1, value2, "dateWorke");
            return (Criteria) this;
        }

        public Criteria andDateWorkeNotBetween(Integer value1, Integer value2) {
            addCriterion("date_worke not between", value1, value2, "dateWorke");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(Integer value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(Integer value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(Integer value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(Integer value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(Integer value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(Integer value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<Integer> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<Integer> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(Integer value1, Integer value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(Integer value1, Integer value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andFollowerIsNull() {
            addCriterion("follower is null");
            return (Criteria) this;
        }

        public Criteria andFollowerIsNotNull() {
            addCriterion("follower is not null");
            return (Criteria) this;
        }

        public Criteria andFollowerEqualTo(Integer value) {
            addCriterion("follower =", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotEqualTo(Integer value) {
            addCriterion("follower <>", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerGreaterThan(Integer value) {
            addCriterion("follower >", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("follower >=", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerLessThan(Integer value) {
            addCriterion("follower <", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerLessThanOrEqualTo(Integer value) {
            addCriterion("follower <=", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerIn(List<Integer> values) {
            addCriterion("follower in", values, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotIn(List<Integer> values) {
            addCriterion("follower not in", values, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerBetween(Integer value1, Integer value2) {
            addCriterion("follower between", value1, value2, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotBetween(Integer value1, Integer value2) {
            addCriterion("follower not between", value1, value2, "follower");
            return (Criteria) this;
        }

        public Criteria andAbstractsaIsNull() {
            addCriterion("abstractsa is null");
            return (Criteria) this;
        }

        public Criteria andAbstractsaIsNotNull() {
            addCriterion("abstractsa is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractsaEqualTo(String value) {
            addCriterion("abstractsa =", value, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andAbstractsaNotEqualTo(String value) {
            addCriterion("abstractsa <>", value, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andAbstractsaGreaterThan(String value) {
            addCriterion("abstractsa >", value, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andAbstractsaGreaterThanOrEqualTo(String value) {
            addCriterion("abstractsa >=", value, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andAbstractsaLessThan(String value) {
            addCriterion("abstractsa <", value, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andAbstractsaLessThanOrEqualTo(String value) {
            addCriterion("abstractsa <=", value, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andAbstractsaLike(String value) {
            addCriterion("abstractsa like", value, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andAbstractsaNotLike(String value) {
            addCriterion("abstractsa not like", value, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andAbstractsaIn(List<String> values) {
            addCriterion("abstractsa in", values, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andAbstractsaNotIn(List<String> values) {
            addCriterion("abstractsa not in", values, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andAbstractsaBetween(String value1, String value2) {
            addCriterion("abstractsa between", value1, value2, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andAbstractsaNotBetween(String value1, String value2) {
            addCriterion("abstractsa not between", value1, value2, "abstractsa");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(String value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(String value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(String value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(String value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(String value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLike(String value) {
            addCriterion("experience like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotLike(String value) {
            addCriterion("experience not like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<String> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<String> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(String value1, String value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(String value1, String value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andAchievementIsNull() {
            addCriterion("achievement is null");
            return (Criteria) this;
        }

        public Criteria andAchievementIsNotNull() {
            addCriterion("achievement is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementEqualTo(String value) {
            addCriterion("achievement =", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotEqualTo(String value) {
            addCriterion("achievement <>", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementGreaterThan(String value) {
            addCriterion("achievement >", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementGreaterThanOrEqualTo(String value) {
            addCriterion("achievement >=", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLessThan(String value) {
            addCriterion("achievement <", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLessThanOrEqualTo(String value) {
            addCriterion("achievement <=", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLike(String value) {
            addCriterion("achievement like", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotLike(String value) {
            addCriterion("achievement not like", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementIn(List<String> values) {
            addCriterion("achievement in", values, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotIn(List<String> values) {
            addCriterion("achievement not in", values, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementBetween(String value1, String value2) {
            addCriterion("achievement between", value1, value2, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotBetween(String value1, String value2) {
            addCriterion("achievement not between", value1, value2, "achievement");
            return (Criteria) this;
        }

        public Criteria andWritingsIsNull() {
            addCriterion("writings is null");
            return (Criteria) this;
        }

        public Criteria andWritingsIsNotNull() {
            addCriterion("writings is not null");
            return (Criteria) this;
        }

        public Criteria andWritingsEqualTo(String value) {
            addCriterion("writings =", value, "writings");
            return (Criteria) this;
        }

        public Criteria andWritingsNotEqualTo(String value) {
            addCriterion("writings <>", value, "writings");
            return (Criteria) this;
        }

        public Criteria andWritingsGreaterThan(String value) {
            addCriterion("writings >", value, "writings");
            return (Criteria) this;
        }

        public Criteria andWritingsGreaterThanOrEqualTo(String value) {
            addCriterion("writings >=", value, "writings");
            return (Criteria) this;
        }

        public Criteria andWritingsLessThan(String value) {
            addCriterion("writings <", value, "writings");
            return (Criteria) this;
        }

        public Criteria andWritingsLessThanOrEqualTo(String value) {
            addCriterion("writings <=", value, "writings");
            return (Criteria) this;
        }

        public Criteria andWritingsLike(String value) {
            addCriterion("writings like", value, "writings");
            return (Criteria) this;
        }

        public Criteria andWritingsNotLike(String value) {
            addCriterion("writings not like", value, "writings");
            return (Criteria) this;
        }

        public Criteria andWritingsIn(List<String> values) {
            addCriterion("writings in", values, "writings");
            return (Criteria) this;
        }

        public Criteria andWritingsNotIn(List<String> values) {
            addCriterion("writings not in", values, "writings");
            return (Criteria) this;
        }

        public Criteria andWritingsBetween(String value1, String value2) {
            addCriterion("writings between", value1, value2, "writings");
            return (Criteria) this;
        }

        public Criteria andWritingsNotBetween(String value1, String value2) {
            addCriterion("writings not between", value1, value2, "writings");
            return (Criteria) this;
        }

        public Criteria andWinningIsNull() {
            addCriterion("winning is null");
            return (Criteria) this;
        }

        public Criteria andWinningIsNotNull() {
            addCriterion("winning is not null");
            return (Criteria) this;
        }

        public Criteria andWinningEqualTo(String value) {
            addCriterion("winning =", value, "winning");
            return (Criteria) this;
        }

        public Criteria andWinningNotEqualTo(String value) {
            addCriterion("winning <>", value, "winning");
            return (Criteria) this;
        }

        public Criteria andWinningGreaterThan(String value) {
            addCriterion("winning >", value, "winning");
            return (Criteria) this;
        }

        public Criteria andWinningGreaterThanOrEqualTo(String value) {
            addCriterion("winning >=", value, "winning");
            return (Criteria) this;
        }

        public Criteria andWinningLessThan(String value) {
            addCriterion("winning <", value, "winning");
            return (Criteria) this;
        }

        public Criteria andWinningLessThanOrEqualTo(String value) {
            addCriterion("winning <=", value, "winning");
            return (Criteria) this;
        }

        public Criteria andWinningLike(String value) {
            addCriterion("winning like", value, "winning");
            return (Criteria) this;
        }

        public Criteria andWinningNotLike(String value) {
            addCriterion("winning not like", value, "winning");
            return (Criteria) this;
        }

        public Criteria andWinningIn(List<String> values) {
            addCriterion("winning in", values, "winning");
            return (Criteria) this;
        }

        public Criteria andWinningNotIn(List<String> values) {
            addCriterion("winning not in", values, "winning");
            return (Criteria) this;
        }

        public Criteria andWinningBetween(String value1, String value2) {
            addCriterion("winning between", value1, value2, "winning");
            return (Criteria) this;
        }

        public Criteria andWinningNotBetween(String value1, String value2) {
            addCriterion("winning not between", value1, value2, "winning");
            return (Criteria) this;
        }

        public Criteria andShowIsNull() {
            addCriterion("show is null");
            return (Criteria) this;
        }

        public Criteria andShowIsNotNull() {
            addCriterion("show is not null");
            return (Criteria) this;
        }

        public Criteria andShowEqualTo(String value) {
            addCriterion("show =", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowNotEqualTo(String value) {
            addCriterion("show <>", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowGreaterThan(String value) {
            addCriterion("show >", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowGreaterThanOrEqualTo(String value) {
            addCriterion("show >=", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowLessThan(String value) {
            addCriterion("show <", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowLessThanOrEqualTo(String value) {
            addCriterion("show <=", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowLike(String value) {
            addCriterion("show like", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowNotLike(String value) {
            addCriterion("show not like", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowIn(List<String> values) {
            addCriterion("show in", values, "show");
            return (Criteria) this;
        }

        public Criteria andShowNotIn(List<String> values) {
            addCriterion("show not in", values, "show");
            return (Criteria) this;
        }

        public Criteria andShowBetween(String value1, String value2) {
            addCriterion("show between", value1, value2, "show");
            return (Criteria) this;
        }

        public Criteria andShowNotBetween(String value1, String value2) {
            addCriterion("show not between", value1, value2, "show");
            return (Criteria) this;
        }

        public Criteria andShow1IsNull() {
            addCriterion("show1 is null");
            return (Criteria) this;
        }

        public Criteria andShow1IsNotNull() {
            addCriterion("show1 is not null");
            return (Criteria) this;
        }

        public Criteria andShow1EqualTo(String value) {
            addCriterion("show1 =", value, "show1");
            return (Criteria) this;
        }

        public Criteria andShow1NotEqualTo(String value) {
            addCriterion("show1 <>", value, "show1");
            return (Criteria) this;
        }

        public Criteria andShow1GreaterThan(String value) {
            addCriterion("show1 >", value, "show1");
            return (Criteria) this;
        }

        public Criteria andShow1GreaterThanOrEqualTo(String value) {
            addCriterion("show1 >=", value, "show1");
            return (Criteria) this;
        }

        public Criteria andShow1LessThan(String value) {
            addCriterion("show1 <", value, "show1");
            return (Criteria) this;
        }

        public Criteria andShow1LessThanOrEqualTo(String value) {
            addCriterion("show1 <=", value, "show1");
            return (Criteria) this;
        }

        public Criteria andShow1Like(String value) {
            addCriterion("show1 like", value, "show1");
            return (Criteria) this;
        }

        public Criteria andShow1NotLike(String value) {
            addCriterion("show1 not like", value, "show1");
            return (Criteria) this;
        }

        public Criteria andShow1In(List<String> values) {
            addCriterion("show1 in", values, "show1");
            return (Criteria) this;
        }

        public Criteria andShow1NotIn(List<String> values) {
            addCriterion("show1 not in", values, "show1");
            return (Criteria) this;
        }

        public Criteria andShow1Between(String value1, String value2) {
            addCriterion("show1 between", value1, value2, "show1");
            return (Criteria) this;
        }

        public Criteria andShow1NotBetween(String value1, String value2) {
            addCriterion("show1 not between", value1, value2, "show1");
            return (Criteria) this;
        }

        public Criteria andShow2IsNull() {
            addCriterion("show2 is null");
            return (Criteria) this;
        }

        public Criteria andShow2IsNotNull() {
            addCriterion("show2 is not null");
            return (Criteria) this;
        }

        public Criteria andShow2EqualTo(String value) {
            addCriterion("show2 =", value, "show2");
            return (Criteria) this;
        }

        public Criteria andShow2NotEqualTo(String value) {
            addCriterion("show2 <>", value, "show2");
            return (Criteria) this;
        }

        public Criteria andShow2GreaterThan(String value) {
            addCriterion("show2 >", value, "show2");
            return (Criteria) this;
        }

        public Criteria andShow2GreaterThanOrEqualTo(String value) {
            addCriterion("show2 >=", value, "show2");
            return (Criteria) this;
        }

        public Criteria andShow2LessThan(String value) {
            addCriterion("show2 <", value, "show2");
            return (Criteria) this;
        }

        public Criteria andShow2LessThanOrEqualTo(String value) {
            addCriterion("show2 <=", value, "show2");
            return (Criteria) this;
        }

        public Criteria andShow2Like(String value) {
            addCriterion("show2 like", value, "show2");
            return (Criteria) this;
        }

        public Criteria andShow2NotLike(String value) {
            addCriterion("show2 not like", value, "show2");
            return (Criteria) this;
        }

        public Criteria andShow2In(List<String> values) {
            addCriterion("show2 in", values, "show2");
            return (Criteria) this;
        }

        public Criteria andShow2NotIn(List<String> values) {
            addCriterion("show2 not in", values, "show2");
            return (Criteria) this;
        }

        public Criteria andShow2Between(String value1, String value2) {
            addCriterion("show2 between", value1, value2, "show2");
            return (Criteria) this;
        }

        public Criteria andShow2NotBetween(String value1, String value2) {
            addCriterion("show2 not between", value1, value2, "show2");
            return (Criteria) this;
        }

        public Criteria andShow3IsNull() {
            addCriterion("show3 is null");
            return (Criteria) this;
        }

        public Criteria andShow3IsNotNull() {
            addCriterion("show3 is not null");
            return (Criteria) this;
        }

        public Criteria andShow3EqualTo(String value) {
            addCriterion("show3 =", value, "show3");
            return (Criteria) this;
        }

        public Criteria andShow3NotEqualTo(String value) {
            addCriterion("show3 <>", value, "show3");
            return (Criteria) this;
        }

        public Criteria andShow3GreaterThan(String value) {
            addCriterion("show3 >", value, "show3");
            return (Criteria) this;
        }

        public Criteria andShow3GreaterThanOrEqualTo(String value) {
            addCriterion("show3 >=", value, "show3");
            return (Criteria) this;
        }

        public Criteria andShow3LessThan(String value) {
            addCriterion("show3 <", value, "show3");
            return (Criteria) this;
        }

        public Criteria andShow3LessThanOrEqualTo(String value) {
            addCriterion("show3 <=", value, "show3");
            return (Criteria) this;
        }

        public Criteria andShow3Like(String value) {
            addCriterion("show3 like", value, "show3");
            return (Criteria) this;
        }

        public Criteria andShow3NotLike(String value) {
            addCriterion("show3 not like", value, "show3");
            return (Criteria) this;
        }

        public Criteria andShow3In(List<String> values) {
            addCriterion("show3 in", values, "show3");
            return (Criteria) this;
        }

        public Criteria andShow3NotIn(List<String> values) {
            addCriterion("show3 not in", values, "show3");
            return (Criteria) this;
        }

        public Criteria andShow3Between(String value1, String value2) {
            addCriterion("show3 between", value1, value2, "show3");
            return (Criteria) this;
        }

        public Criteria andShow3NotBetween(String value1, String value2) {
            addCriterion("show3 not between", value1, value2, "show3");
            return (Criteria) this;
        }

        public Criteria andShow4IsNull() {
            addCriterion("show4 is null");
            return (Criteria) this;
        }

        public Criteria andShow4IsNotNull() {
            addCriterion("show4 is not null");
            return (Criteria) this;
        }

        public Criteria andShow4EqualTo(String value) {
            addCriterion("show4 =", value, "show4");
            return (Criteria) this;
        }

        public Criteria andShow4NotEqualTo(String value) {
            addCriterion("show4 <>", value, "show4");
            return (Criteria) this;
        }

        public Criteria andShow4GreaterThan(String value) {
            addCriterion("show4 >", value, "show4");
            return (Criteria) this;
        }

        public Criteria andShow4GreaterThanOrEqualTo(String value) {
            addCriterion("show4 >=", value, "show4");
            return (Criteria) this;
        }

        public Criteria andShow4LessThan(String value) {
            addCriterion("show4 <", value, "show4");
            return (Criteria) this;
        }

        public Criteria andShow4LessThanOrEqualTo(String value) {
            addCriterion("show4 <=", value, "show4");
            return (Criteria) this;
        }

        public Criteria andShow4Like(String value) {
            addCriterion("show4 like", value, "show4");
            return (Criteria) this;
        }

        public Criteria andShow4NotLike(String value) {
            addCriterion("show4 not like", value, "show4");
            return (Criteria) this;
        }

        public Criteria andShow4In(List<String> values) {
            addCriterion("show4 in", values, "show4");
            return (Criteria) this;
        }

        public Criteria andShow4NotIn(List<String> values) {
            addCriterion("show4 not in", values, "show4");
            return (Criteria) this;
        }

        public Criteria andShow4Between(String value1, String value2) {
            addCriterion("show4 between", value1, value2, "show4");
            return (Criteria) this;
        }

        public Criteria andShow4NotBetween(String value1, String value2) {
            addCriterion("show4 not between", value1, value2, "show4");
            return (Criteria) this;
        }

        public Criteria andShow5IsNull() {
            addCriterion("show5 is null");
            return (Criteria) this;
        }

        public Criteria andShow5IsNotNull() {
            addCriterion("show5 is not null");
            return (Criteria) this;
        }

        public Criteria andShow5EqualTo(String value) {
            addCriterion("show5 =", value, "show5");
            return (Criteria) this;
        }

        public Criteria andShow5NotEqualTo(String value) {
            addCriterion("show5 <>", value, "show5");
            return (Criteria) this;
        }

        public Criteria andShow5GreaterThan(String value) {
            addCriterion("show5 >", value, "show5");
            return (Criteria) this;
        }

        public Criteria andShow5GreaterThanOrEqualTo(String value) {
            addCriterion("show5 >=", value, "show5");
            return (Criteria) this;
        }

        public Criteria andShow5LessThan(String value) {
            addCriterion("show5 <", value, "show5");
            return (Criteria) this;
        }

        public Criteria andShow5LessThanOrEqualTo(String value) {
            addCriterion("show5 <=", value, "show5");
            return (Criteria) this;
        }

        public Criteria andShow5Like(String value) {
            addCriterion("show5 like", value, "show5");
            return (Criteria) this;
        }

        public Criteria andShow5NotLike(String value) {
            addCriterion("show5 not like", value, "show5");
            return (Criteria) this;
        }

        public Criteria andShow5In(List<String> values) {
            addCriterion("show5 in", values, "show5");
            return (Criteria) this;
        }

        public Criteria andShow5NotIn(List<String> values) {
            addCriterion("show5 not in", values, "show5");
            return (Criteria) this;
        }

        public Criteria andShow5Between(String value1, String value2) {
            addCriterion("show5 between", value1, value2, "show5");
            return (Criteria) this;
        }

        public Criteria andShow5NotBetween(String value1, String value2) {
            addCriterion("show5 not between", value1, value2, "show5");
            return (Criteria) this;
        }

        public Criteria andShow6IsNull() {
            addCriterion("show6 is null");
            return (Criteria) this;
        }

        public Criteria andShow6IsNotNull() {
            addCriterion("show6 is not null");
            return (Criteria) this;
        }

        public Criteria andShow6EqualTo(String value) {
            addCriterion("show6 =", value, "show6");
            return (Criteria) this;
        }

        public Criteria andShow6NotEqualTo(String value) {
            addCriterion("show6 <>", value, "show6");
            return (Criteria) this;
        }

        public Criteria andShow6GreaterThan(String value) {
            addCriterion("show6 >", value, "show6");
            return (Criteria) this;
        }

        public Criteria andShow6GreaterThanOrEqualTo(String value) {
            addCriterion("show6 >=", value, "show6");
            return (Criteria) this;
        }

        public Criteria andShow6LessThan(String value) {
            addCriterion("show6 <", value, "show6");
            return (Criteria) this;
        }

        public Criteria andShow6LessThanOrEqualTo(String value) {
            addCriterion("show6 <=", value, "show6");
            return (Criteria) this;
        }

        public Criteria andShow6Like(String value) {
            addCriterion("show6 like", value, "show6");
            return (Criteria) this;
        }

        public Criteria andShow6NotLike(String value) {
            addCriterion("show6 not like", value, "show6");
            return (Criteria) this;
        }

        public Criteria andShow6In(List<String> values) {
            addCriterion("show6 in", values, "show6");
            return (Criteria) this;
        }

        public Criteria andShow6NotIn(List<String> values) {
            addCriterion("show6 not in", values, "show6");
            return (Criteria) this;
        }

        public Criteria andShow6Between(String value1, String value2) {
            addCriterion("show6 between", value1, value2, "show6");
            return (Criteria) this;
        }

        public Criteria andShow6NotBetween(String value1, String value2) {
            addCriterion("show6 not between", value1, value2, "show6");
            return (Criteria) this;
        }

        public Criteria andShow7IsNull() {
            addCriterion("show7 is null");
            return (Criteria) this;
        }

        public Criteria andShow7IsNotNull() {
            addCriterion("show7 is not null");
            return (Criteria) this;
        }

        public Criteria andShow7EqualTo(String value) {
            addCriterion("show7 =", value, "show7");
            return (Criteria) this;
        }

        public Criteria andShow7NotEqualTo(String value) {
            addCriterion("show7 <>", value, "show7");
            return (Criteria) this;
        }

        public Criteria andShow7GreaterThan(String value) {
            addCriterion("show7 >", value, "show7");
            return (Criteria) this;
        }

        public Criteria andShow7GreaterThanOrEqualTo(String value) {
            addCriterion("show7 >=", value, "show7");
            return (Criteria) this;
        }

        public Criteria andShow7LessThan(String value) {
            addCriterion("show7 <", value, "show7");
            return (Criteria) this;
        }

        public Criteria andShow7LessThanOrEqualTo(String value) {
            addCriterion("show7 <=", value, "show7");
            return (Criteria) this;
        }

        public Criteria andShow7Like(String value) {
            addCriterion("show7 like", value, "show7");
            return (Criteria) this;
        }

        public Criteria andShow7NotLike(String value) {
            addCriterion("show7 not like", value, "show7");
            return (Criteria) this;
        }

        public Criteria andShow7In(List<String> values) {
            addCriterion("show7 in", values, "show7");
            return (Criteria) this;
        }

        public Criteria andShow7NotIn(List<String> values) {
            addCriterion("show7 not in", values, "show7");
            return (Criteria) this;
        }

        public Criteria andShow7Between(String value1, String value2) {
            addCriterion("show7 between", value1, value2, "show7");
            return (Criteria) this;
        }

        public Criteria andShow7NotBetween(String value1, String value2) {
            addCriterion("show7 not between", value1, value2, "show7");
            return (Criteria) this;
        }

        public Criteria andSpare1IsNull() {
            addCriterion("spare1 is null");
            return (Criteria) this;
        }

        public Criteria andSpare1IsNotNull() {
            addCriterion("spare1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare1EqualTo(String value) {
            addCriterion("spare1 =", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotEqualTo(String value) {
            addCriterion("spare1 <>", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1GreaterThan(String value) {
            addCriterion("spare1 >", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1GreaterThanOrEqualTo(String value) {
            addCriterion("spare1 >=", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1LessThan(String value) {
            addCriterion("spare1 <", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1LessThanOrEqualTo(String value) {
            addCriterion("spare1 <=", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1Like(String value) {
            addCriterion("spare1 like", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotLike(String value) {
            addCriterion("spare1 not like", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1In(List<String> values) {
            addCriterion("spare1 in", values, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotIn(List<String> values) {
            addCriterion("spare1 not in", values, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1Between(String value1, String value2) {
            addCriterion("spare1 between", value1, value2, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotBetween(String value1, String value2) {
            addCriterion("spare1 not between", value1, value2, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare2IsNull() {
            addCriterion("spare2 is null");
            return (Criteria) this;
        }

        public Criteria andSpare2IsNotNull() {
            addCriterion("spare2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare2EqualTo(String value) {
            addCriterion("spare2 =", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotEqualTo(String value) {
            addCriterion("spare2 <>", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2GreaterThan(String value) {
            addCriterion("spare2 >", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2GreaterThanOrEqualTo(String value) {
            addCriterion("spare2 >=", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2LessThan(String value) {
            addCriterion("spare2 <", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2LessThanOrEqualTo(String value) {
            addCriterion("spare2 <=", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2Like(String value) {
            addCriterion("spare2 like", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotLike(String value) {
            addCriterion("spare2 not like", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2In(List<String> values) {
            addCriterion("spare2 in", values, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotIn(List<String> values) {
            addCriterion("spare2 not in", values, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2Between(String value1, String value2) {
            addCriterion("spare2 between", value1, value2, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotBetween(String value1, String value2) {
            addCriterion("spare2 not between", value1, value2, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare3IsNull() {
            addCriterion("spare3 is null");
            return (Criteria) this;
        }

        public Criteria andSpare3IsNotNull() {
            addCriterion("spare3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare3EqualTo(String value) {
            addCriterion("spare3 =", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotEqualTo(String value) {
            addCriterion("spare3 <>", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3GreaterThan(String value) {
            addCriterion("spare3 >", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3GreaterThanOrEqualTo(String value) {
            addCriterion("spare3 >=", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3LessThan(String value) {
            addCriterion("spare3 <", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3LessThanOrEqualTo(String value) {
            addCriterion("spare3 <=", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3Like(String value) {
            addCriterion("spare3 like", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotLike(String value) {
            addCriterion("spare3 not like", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3In(List<String> values) {
            addCriterion("spare3 in", values, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotIn(List<String> values) {
            addCriterion("spare3 not in", values, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3Between(String value1, String value2) {
            addCriterion("spare3 between", value1, value2, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotBetween(String value1, String value2) {
            addCriterion("spare3 not between", value1, value2, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare4IsNull() {
            addCriterion("spare4 is null");
            return (Criteria) this;
        }

        public Criteria andSpare4IsNotNull() {
            addCriterion("spare4 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare4EqualTo(String value) {
            addCriterion("spare4 =", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4NotEqualTo(String value) {
            addCriterion("spare4 <>", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4GreaterThan(String value) {
            addCriterion("spare4 >", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4GreaterThanOrEqualTo(String value) {
            addCriterion("spare4 >=", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4LessThan(String value) {
            addCriterion("spare4 <", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4LessThanOrEqualTo(String value) {
            addCriterion("spare4 <=", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4Like(String value) {
            addCriterion("spare4 like", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4NotLike(String value) {
            addCriterion("spare4 not like", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4In(List<String> values) {
            addCriterion("spare4 in", values, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4NotIn(List<String> values) {
            addCriterion("spare4 not in", values, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4Between(String value1, String value2) {
            addCriterion("spare4 between", value1, value2, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4NotBetween(String value1, String value2) {
            addCriterion("spare4 not between", value1, value2, "spare4");
            return (Criteria) this;
        }

        public Criteria andAuditingIsNull() {
            addCriterion("auditing is null");
            return (Criteria) this;
        }

        public Criteria andAuditingIsNotNull() {
            addCriterion("auditing is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingEqualTo(Integer value) {
            addCriterion("auditing =", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingNotEqualTo(Integer value) {
            addCriterion("auditing <>", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingGreaterThan(Integer value) {
            addCriterion("auditing >", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditing >=", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingLessThan(Integer value) {
            addCriterion("auditing <", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingLessThanOrEqualTo(Integer value) {
            addCriterion("auditing <=", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingIn(List<Integer> values) {
            addCriterion("auditing in", values, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingNotIn(List<Integer> values) {
            addCriterion("auditing not in", values, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingBetween(Integer value1, Integer value2) {
            addCriterion("auditing between", value1, value2, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingNotBetween(Integer value1, Integer value2) {
            addCriterion("auditing not between", value1, value2, "auditing");
            return (Criteria) this;
        }

        public Criteria andEducationNumberIsNull() {
            addCriterion("education_number is null");
            return (Criteria) this;
        }

        public Criteria andEducationNumberIsNotNull() {
            addCriterion("education_number is not null");
            return (Criteria) this;
        }

        public Criteria andEducationNumberEqualTo(Integer value) {
            addCriterion("education_number =", value, "educationNumber");
            return (Criteria) this;
        }

        public Criteria andEducationNumberNotEqualTo(Integer value) {
            addCriterion("education_number <>", value, "educationNumber");
            return (Criteria) this;
        }

        public Criteria andEducationNumberGreaterThan(Integer value) {
            addCriterion("education_number >", value, "educationNumber");
            return (Criteria) this;
        }

        public Criteria andEducationNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("education_number >=", value, "educationNumber");
            return (Criteria) this;
        }

        public Criteria andEducationNumberLessThan(Integer value) {
            addCriterion("education_number <", value, "educationNumber");
            return (Criteria) this;
        }

        public Criteria andEducationNumberLessThanOrEqualTo(Integer value) {
            addCriterion("education_number <=", value, "educationNumber");
            return (Criteria) this;
        }

        public Criteria andEducationNumberIn(List<Integer> values) {
            addCriterion("education_number in", values, "educationNumber");
            return (Criteria) this;
        }

        public Criteria andEducationNumberNotIn(List<Integer> values) {
            addCriterion("education_number not in", values, "educationNumber");
            return (Criteria) this;
        }

        public Criteria andEducationNumberBetween(Integer value1, Integer value2) {
            addCriterion("education_number between", value1, value2, "educationNumber");
            return (Criteria) this;
        }

        public Criteria andEducationNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("education_number not between", value1, value2, "educationNumber");
            return (Criteria) this;
        }

        public Criteria andMajorNumberIsNull() {
            addCriterion("major_number is null");
            return (Criteria) this;
        }

        public Criteria andMajorNumberIsNotNull() {
            addCriterion("major_number is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNumberEqualTo(Integer value) {
            addCriterion("major_number =", value, "majorNumber");
            return (Criteria) this;
        }

        public Criteria andMajorNumberNotEqualTo(Integer value) {
            addCriterion("major_number <>", value, "majorNumber");
            return (Criteria) this;
        }

        public Criteria andMajorNumberGreaterThan(Integer value) {
            addCriterion("major_number >", value, "majorNumber");
            return (Criteria) this;
        }

        public Criteria andMajorNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_number >=", value, "majorNumber");
            return (Criteria) this;
        }

        public Criteria andMajorNumberLessThan(Integer value) {
            addCriterion("major_number <", value, "majorNumber");
            return (Criteria) this;
        }

        public Criteria andMajorNumberLessThanOrEqualTo(Integer value) {
            addCriterion("major_number <=", value, "majorNumber");
            return (Criteria) this;
        }

        public Criteria andMajorNumberIn(List<Integer> values) {
            addCriterion("major_number in", values, "majorNumber");
            return (Criteria) this;
        }

        public Criteria andMajorNumberNotIn(List<Integer> values) {
            addCriterion("major_number not in", values, "majorNumber");
            return (Criteria) this;
        }

        public Criteria andMajorNumberBetween(Integer value1, Integer value2) {
            addCriterion("major_number between", value1, value2, "majorNumber");
            return (Criteria) this;
        }

        public Criteria andMajorNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("major_number not between", value1, value2, "majorNumber");
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