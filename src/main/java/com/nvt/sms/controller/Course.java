package com.nvt.sms.controller;

import com.nvt.sms.beans.CourseBean;
import com.nvt.sms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class Course {

    @Autowired
    CourseService courseService;

    @PostMapping(value = "/saveCourse")
    public String saveCourse(@RequestBody final CourseBean courseBean){
        return courseService.addCourse(courseBean);
    }

    @DeleteMapping(value = "/deleteCourse/{courseId}")
    public String deleteCourse(@PathVariable final Long courseId){
        return courseService.deleteCourse(courseId);
    }

    @GetMapping(value = "/getCourse/{courseId}")
    public CourseBean getCourse(@PathVariable final Long courseId){
        return courseService.getCourse(courseId);
    }

    @GetMapping(value = "/getAllCourses")
    public List<CourseBean> getAllCourses(){
        return courseService.getAllCourses();
    }
}
