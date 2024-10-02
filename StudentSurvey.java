package com.example.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentsurvey")
public class StudentSurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_FirstName")
    private String studentFirstName;

    @Column(name = "student_LastName")
    private String studentLastName;

    @Column(name = "student_StreetAddress")
    private String studentStreetAddress;

    @Column(name = "student_City")
    private String studentCity;

    @Column(name = "student_State")
    private String studentState;

    @Column(name = "student_Zip")
    private String studentZip;

    @Column(name = "student_PhoneNumber")
    private String studentPhoneNumber;

    @Column(name = "student_Email")
    private String studentEmail;

    @Column(name = "student_DateOfSurvey")
    private Date studentDateOfSurvey;

    @Column(name = "student_LikedMost")
    private String studentLikedMost;

    @Column(name = "student_InterestedIn")
    private String studentInterestedIn;

    @Column(name = "student_Likelihood")
    private String studentLikelihood;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentStreetAddress() {
        return studentStreetAddress;
    }

    public void setStudentStreetAddress(String studentStreetAddress) {
        this.studentStreetAddress = studentStreetAddress;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentState() {
        return studentState;
    }

    public void setStudentState(String studentState) {
        this.studentState = studentState;
    }

    public String getStudentZip() {
        return studentZip;
    }

    public void setStudentZip(String studentZip) {
        this.studentZip = studentZip;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Date getStudentDateOfSurvey() {
        return studentDateOfSurvey;
    }

    public void setStudentDateOfSurvey(Date studentDateOfSurvey) {
        this.studentDateOfSurvey = studentDateOfSurvey;
    }

    public String getStudentLikedMost() {
        return studentLikedMost;
    }

    public void setStudentLikedMost(String studentLikedMost) {
        this.studentLikedMost = studentLikedMost;
    }

    public String getStudentInterestedIn() {
        return studentInterestedIn;
    }

    public void setStudentInterestedIn(String studentInterestedIn) {
        this.studentInterestedIn = studentInterestedIn;
    }

    public String getStudentLikelihood() {
        return studentLikelihood;
    }

    public void setStudentLikelihood(String studentLikelihood) {
        this.studentLikelihood = studentLikelihood;
    }
}
