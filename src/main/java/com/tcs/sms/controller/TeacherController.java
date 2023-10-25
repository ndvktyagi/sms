package com.tcs.sms.controller;

import com.tcs.sms.dto.TeacherDto;
import com.tcs.sms.entity.TeacherEntity;
import com.tcs.sms.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/teachers")
    public TeacherEntity teacherRegistration(@RequestBody TeacherDto teacherDto){
        return teacherService.teacherRegistration(teacherDto);
    }

    @GetMapping("/teachers")
    public List<TeacherDto> getTeachers(){
        return teacherService.getTeachers();
    }

    @GetMapping("/teachers/{id}")
    public TeacherDto getTeacher(@PathVariable int id){
        return  teacherService.getTeacherById(id);
    }

    @DeleteMapping("/teachers/{id}")
    public String deleteTeacher(@PathVariable int id){
        return  teacherService.deleteById(id);
    }
}
