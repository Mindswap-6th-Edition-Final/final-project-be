package com.mindera.finalproject.be.entity;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSecondaryPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSecondarySortKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

import java.util.Objects;

@DynamoDbBean
public class Registration {

    private String PK;
    private String SK;
    private String personId;
    private String courseId;
    private String status;
    private Integer finalGrade;
    private Boolean active;
    private String aboutYou;
    private Boolean prevKnowledge;
    private Boolean prevExperience;

    public Registration() {
    }

    public Registration(String personId, String courseId, String status, Integer finalGrade, String aboutYou, Boolean prevKnowledge, Boolean prevExperience) {
        this.personId = personId;
        this.courseId = courseId;
        this.status = status;
        this.finalGrade = finalGrade;
        this.active = true;
        this.aboutYou = aboutYou;
        this.prevKnowledge = prevKnowledge;
        this.prevExperience = prevExperience;
    }

    @DynamoDbPartitionKey
    public String getPK() {
        return PK;
    }

    public void setPK(String PK) {
        this.PK = PK;
    }

    @DynamoDbSortKey
    public String getSK() {
        return SK;
    }

    public void setSK(String SK) {
        this.SK = SK;
    }

    @DynamoDbSecondaryPartitionKey(indexNames = {"GSIPK1"})
    @DynamoDbSecondarySortKey(indexNames = {"GSIPK2"})
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @DynamoDbSecondarySortKey(indexNames = {"GSIPK1"})
    @DynamoDbSecondaryPartitionKey(indexNames = {"GSIPK2"})
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Integer finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAboutYou() {
        return aboutYou;
    }

    public void setAboutYou(String aboutYou) {
        this.aboutYou = aboutYou;
    }

    public Boolean getPrevKnowledge() {
        return prevKnowledge;
    }

    public void setPrevKnowledge(Boolean prevKnowledge) {
        this.prevKnowledge = prevKnowledge;
    }

    public Boolean getPrevExperience() {
        return prevExperience;
    }

    public void setPrevExperience(Boolean prevExperience) {
        this.prevExperience = prevExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registration that = (Registration) o;
        return Objects.equals(PK, that.PK) && Objects.equals(SK, that.SK) && Objects.equals(personId, that.personId) && Objects.equals(courseId, that.courseId) && Objects.equals(status, that.status) && Objects.equals(finalGrade, that.finalGrade) && Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PK, SK, personId, courseId, status, finalGrade, active);
    }

    @Override
    public String toString() {
        return "Registration{" +
                "PK='" + PK + '\'' +
                ", SK='" + SK + '\'' +
                ", personId='" + personId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", status='" + status + '\'' +
                ", finalGrade='" + finalGrade + '\'' +
                ", active=" + active +
                '}';
    }
}