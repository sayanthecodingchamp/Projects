package com.universityerp.students;

import jakarta.persistence.*;


@Entity
@Table(name="studentdb")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sId;

    @Column(nullable = false,length = 70)
    private String firstName;

    @Column(nullable = false,length = 70)
    private String lastName;

    @Column(nullable = false,length = 70)
    private String fatherName;

    @Column(nullable = false,length = 70)
    private String motherName;

    @Column(nullable = false,length = 20,name = "Year_Of_Birth")
    private int yob; // Year of Birth

    @Column(nullable = false,length = 30)
    private String email;

    @Column(nullable = false,length = 10)
    private String mobNo;

    @Column(nullable = false,length = 30)
    private String courseName;

    @Column(nullable = false,length = 30)
    private String courseId;

    @Column(nullable = false,length = 30)
    private String city;

    @Column(nullable = false,length = 130)
    private String Address;

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", yob=" + yob +
                ", email='" + email + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseId='" + courseId + '\'' +
                ", city='" + city + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public Student(String firstName, String lastName, String fatherName, String motherName, int yob, String email, String mobNo, String courseName, String courseId, String city, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.yob = yob;
        this.email = email;
        this.mobNo = mobNo;
        this.courseName = courseName;
        this.courseId = courseId;
        this.city = city;
        Address = address;
    }

    public Student() {

    }

    public Student(Integer sId, String firstName, String lastName, String fatherName, String motherName, int yob, String email, String mobNo, String courseName, String courseId, String city, String address) {
        this.sId = sId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.yob = yob;
        this.email = email;
        this.mobNo = mobNo;
        this.courseName = courseName;
        this.courseId = courseId;
        this.city = city;
        Address = address;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
