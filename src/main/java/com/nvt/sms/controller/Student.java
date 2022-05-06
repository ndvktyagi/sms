package com.nvt.sms.controller;

import com.nvt.sms.beans.StudentBean;
import com.nvt.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Student {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/allStudent")
    public List<StudentBean> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping(value = "/getStudent/{studentRollNumber}")
    public  StudentBean getStudent(@PathVariable final Long studentRollNumber){
        return  studentService.studentGetDetails(studentRollNumber);
    }

    @PostMapping(value = "/addStudent")
    public String saveStudent(@RequestBody final StudentBean studentBean){
        return studentService.studentAdd(studentBean);
    }

    @PutMapping(value = "/updateStudent")
    public String updateStudent(@RequestBody final StudentBean studentBean){
        return studentService.studentUpdate(studentBean);
    }

    @DeleteMapping(value ="/deleteStudent/{studentRollNumber}" )
    public String deleteStudent(@PathVariable final Long studentRollNumber){
        return studentService.studentDelete(studentRollNumber);
    }

}
