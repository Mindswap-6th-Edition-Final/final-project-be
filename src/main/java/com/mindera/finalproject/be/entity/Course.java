package com.mindera.finalproject.be.entity;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.*;

import java.math.BigDecimal;
import java.util.Objects;

@DynamoDbBean
public class Course {

    private String PK;
    private String SK;
    private String name;
    private Integer edition;
    private String teacherId;
    private String syllabus;
    private String program;
    private String schedule;
    private BigDecimal price;
    private Integer duration;
    private String location;
    private Boolean active;
    private Integer enrolledStudents;
    private Integer maxStudents;

    public Course() {
    }

    public Course(String name, Integer edition, String teacherId, String syllabus, String program, String schedule, BigDecimal price, Integer duration, String location) {
        this.name = name;
        this.edition = edition;
        this.teacherId = teacherId;
        this.syllabus = syllabus;
        this.program = program;
        this.schedule = schedule;
        this.price = price;
        this.duration = duration;
        this.location = location;
        this.active = true;
        this.enrolledStudents = 0;
    }

    @DynamoDbPartitionKey
    @DynamoDbAttribute("PK")
    @DynamoDbSecondarySortKey(indexNames = {"GSIPK1", "GSIPK3"})
    public String getPK() {
        return PK;
    }

    public void setPK(String pk) {
        this.PK = pk;
    }

    @DynamoDbSortKey
    @DynamoDbAttribute("SK")
    public String getSK() {
        return SK;
    }

    public void setSK(String sk) {
        this.SK = sk;
    }

    @DynamoDbAttribute("Name")
    @DynamoDbSecondaryPartitionKey(indexNames = {"GSIPK2"})
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DynamoDbAttribute("Edition")
    @DynamoDbSecondarySortKey(indexNames = {"GSIPK2"})
    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }


    @DynamoDbAttribute("TeacherId")
    @DynamoDbSecondaryPartitionKey(indexNames = {"GSIPK3"})
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @DynamoDbAttribute("Syllabus")
    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    @DynamoDbAttribute("Program")
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @DynamoDbAttribute("Schedule")
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @DynamoDbAttribute("Price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @DynamoDbAttribute("Duration")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @DynamoDbAttribute("Location")
    @DynamoDbSecondaryPartitionKey(indexNames = {"GSIPK1"})
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @DynamoDbAttribute("NumberOfApplications")
    public Integer getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(Integer enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @DynamoDbAttribute("MaxNumberOfApplications")
    public Integer getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(Integer maxStudents) {
        this.maxStudents = maxStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(PK, course.PK) && Objects.equals(SK, course.SK) && Objects.equals(name, course.name) && Objects.equals(edition, course.edition) && Objects.equals(teacherId, course.teacherId) && Objects.equals(syllabus, course.syllabus) && Objects.equals(program, course.program) && Objects.equals(schedule, course.schedule) && Objects.equals(price, course.price) && Objects.equals(duration, course.duration) && Objects.equals(location, course.location) && Objects.equals(active, course.active) && Objects.equals(enrolledStudents, course.enrolledStudents) && Objects.equals(maxStudents, course.maxStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PK, SK, name, edition, teacherId, syllabus, program, schedule, price, duration, location, active, enrolledStudents, maxStudents);
    }

    @Override
    public String toString() {
        return "Course{" +
                "PK='" + PK + '\'' +
                ", SK='" + SK + '\'' +
                ", name='" + name + '\'' +
                ", edition=" + edition +
                ", teacherId='" + teacherId + '\'' +
                ", syllabus='" + syllabus + '\'' +
                ", program='" + program + '\'' +
                ", schedule='" + schedule + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ", location='" + location + '\'' +
                ", active=" + active +
                ", numberOfApplications=" + enrolledStudents +
                ", maxNumberOfApplications=" + maxStudents +
                '}';
    }
}
