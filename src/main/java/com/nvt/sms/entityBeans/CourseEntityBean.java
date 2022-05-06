package com.nvt.sms.entityBeans;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="course")
public class CourseEntityBean {
    @Id
    @Column(name="course_id")
    Long courseId;

    @Column(name="course_name")
    String CourseName;
}
