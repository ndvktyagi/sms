package com.tcs.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name="stu_deatils")
public class StudentEntity {

    @Id
    @Column(name="stu_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int studentId;

    @Column(name="stu_name")
    String studentName;

    @Column(name="stu_email")
    String studentEmail;

    @Column(name="stu_mobile")
    long studentMobile;

    @Column(name="stu_course_id")
    int studentCourseId;

    @Column(name="stu_branch_id")
    int studentBranchId;

    @Column(name="stu_sem")
    int studentSemester;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public long getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(long studentMobile) {
        this.studentMobile = studentMobile;
    }

    public int getStudentCourseId() {
        return studentCourseId;
    }

    public void setStudentCourseId(int studentCourseId) {
        this.studentCourseId = studentCourseId;
    }

    public int getStudentBranchId() {
        return studentBranchId;
    }

    public void setStudentBranchId(int studentBranchId) {
        this.studentBranchId = studentBranchId;
    }

    public int getStudentSemester() {
        return studentSemester;
    }

    public void setStudentSemester(int studentSemester) {
        this.studentSemester = studentSemester;
    }
}
