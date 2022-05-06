package com.nvt.sms.entityBeans;

import lombok.Data;
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

import javax.persistence.*;

@Data
@Entity
@Table(name="student")

public class StudentEntityBean {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="stu_roll_no")
    long studentRollNumber;

    @Column(name="stu_name")
    String studentName;

    @Column(name="stu_email")
    String stuEmail;

    @Column(name="stu_mobile")
    Long stuMobileNumber;

    @Column(name="stu_course")
    Integer studentCourseId;

    @Column(name="stu_branch")
    Integer studentBranchId;

}
