package com.nvt.sms.service;

import com.nvt.sms.beans.CourseBean;
import com.nvt.sms.entityBeans.CourseEntityBean;

import java.util.List;

public interface CourseService {
    String addCourse(CourseBean courseBean);
    String deleteCourse(Long courseId);
    String updateCourse(Long courseId);
    CourseBean getCourse(Long courseId);
    List<CourseBean> getAllCourses();
}
