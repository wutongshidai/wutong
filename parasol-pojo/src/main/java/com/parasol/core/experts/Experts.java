package com.parasol.core.experts;

import java.io.Serializable;

public class Experts implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 用户表ID
     */
    private Integer userId;

    /**
     * 职称,关联字典表
     */
    private Integer title;

    /**
     * 专业领域，关联字典表
     */
    private Integer field;

    /**
     * 工作年限
     */
    private Integer dateWorke;

    /**
     * 学历
     */
    private String education;

    /**
     * 专业
     */
    private Integer major;

    /**
     * 头像
     */
    private String photo;

    /**
     * 关注
     */
    private Integer follower;

    /**
     * 简介
     */
    private String abstractsa;

    /**
     * 工作经历
     */
    private String experience;

    /**
     * 主要业绩
     */
    private String achievement;

    /**
     * 个人著作
     */
    private String writings;

    /**
     * 获奖情况
     */
    private String winning;

    /**
     * 作品展示
     */
    private String show0;

    private String show1;

    private String show2;

    private String show3;

    private String show4;

    private String show5;

    private String show6;

    private String show7;

    private String spare1;

    private String spare2;

    private String spare3;

    private String spare4;

    private Integer auditing;

    private Integer educationNumber;

    private Integer majorNumber;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public Integer getDateWorke() {
        return dateWorke;
    }

    public void setDateWorke(Integer dateWorke) {
        this.dateWorke = dateWorke;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getFollower() {
        return follower;
    }

    public void setFollower(Integer follower) {
        this.follower = follower;
    }

    public String getAbstractsa() {
        return abstractsa;
    }

    public void setAbstractsa(String abstractsa) {
        this.abstractsa = abstractsa == null ? null : abstractsa.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement == null ? null : achievement.trim();
    }

    public String getWritings() {
        return writings;
    }

    public void setWritings(String writings) {
        this.writings = writings == null ? null : writings.trim();
    }

    public String getWinning() {
        return winning;
    }

    public void setWinning(String winning) {
        this.winning = winning == null ? null : winning.trim();
    }

    public String getShow0() {
        return show0;
    }

    public void setShow0(String show0) {
        this.show0 = show0 == null ? null : show0.trim();
    }

    public String getShow1() {
        return show1;
    }

    public void setShow1(String show1) {
        this.show1 = show1 == null ? null : show1.trim();
    }

    public String getShow2() {
        return show2;
    }

    public void setShow2(String show2) {
        this.show2 = show2 == null ? null : show2.trim();
    }

    public String getShow3() {
        return show3;
    }

    public void setShow3(String show3) {
        this.show3 = show3 == null ? null : show3.trim();
    }

    public String getShow4() {
        return show4;
    }

    public void setShow4(String show4) {
        this.show4 = show4 == null ? null : show4.trim();
    }

    public String getShow5() {
        return show5;
    }

    public void setShow5(String show5) {
        this.show5 = show5 == null ? null : show5.trim();
    }

    public String getShow6() {
        return show6;
    }

    public void setShow6(String show6) {
        this.show6 = show6 == null ? null : show6.trim();
    }

    public String getShow7() {
        return show7;
    }

    public void setShow7(String show7) {
        this.show7 = show7 == null ? null : show7.trim();
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1 == null ? null : spare1.trim();
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2 == null ? null : spare2.trim();
    }

    public String getSpare3() {
        return spare3;
    }

    public void setSpare3(String spare3) {
        this.spare3 = spare3 == null ? null : spare3.trim();
    }

    public String getSpare4() {
        return spare4;
    }

    public void setSpare4(String spare4) {
        this.spare4 = spare4 == null ? null : spare4.trim();
    }

    public Integer getAuditing() {
        return auditing;
    }

    public void setAuditing(Integer auditing) {
        this.auditing = auditing;
    }

    public Integer getEducationNumber() {
        return educationNumber;
    }

    public void setEducationNumber(Integer educationNumber) {
        this.educationNumber = educationNumber;
    }

    public Integer getMajorNumber() {
        return majorNumber;
    }

    public void setMajorNumber(Integer majorNumber) {
        this.majorNumber = majorNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", title=").append(title);
        sb.append(", field=").append(field);
        sb.append(", dateWorke=").append(dateWorke);
        sb.append(", education=").append(education);
        sb.append(", major=").append(major);
        sb.append(", photo=").append(photo);
        sb.append(", follower=").append(follower);
        sb.append(", abstractsa=").append(abstractsa);
        sb.append(", experience=").append(experience);
        sb.append(", achievement=").append(achievement);
        sb.append(", writings=").append(writings);
        sb.append(", winning=").append(winning);
        sb.append(", show=").append(show0);
        sb.append(", show1=").append(show1);
        sb.append(", show2=").append(show2);
        sb.append(", show3=").append(show3);
        sb.append(", show4=").append(show4);
        sb.append(", show5=").append(show5);
        sb.append(", show6=").append(show6);
        sb.append(", show7=").append(show7);
        sb.append(", spare1=").append(spare1);
        sb.append(", spare2=").append(spare2);
        sb.append(", spare3=").append(spare3);
        sb.append(", spare4=").append(spare4);
        sb.append(", auditing=").append(auditing);
        sb.append(", educationNumber=").append(educationNumber);
        sb.append(", majorNumber=").append(majorNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}