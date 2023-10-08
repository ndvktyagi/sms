package com.tcs.sms.dto;

public class StudentDto {
    int studentId;
    String studentName;
    String studentEmail;
    long studentMobile;
    int studentCourseId;
    int studentBranchId;
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

    @Override
    public String toString() {
        return "StudentDto{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentMobile=" + studentMobile +
                ", studentCourseId=" + studentCourseId +
                ", studentBranchId=" + studentBranchId +
                ", studentSemester=" + studentSemester +
                '}';
    }
}
