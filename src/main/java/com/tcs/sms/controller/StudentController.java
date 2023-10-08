package com.tcs.sms.controller;

import com.tcs.sms.dto.StudentDto;
import com.tcs.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping()
    public String studentDetails() {
        return "Student details found successfully";
    }

    @PostMapping("/create-student")
    public String studentRegistration(@RequestBody StudentDto studentDto) {
        System.out.println("StudentDto=" + studentDto);
        String result = studentService.studentRegistration(studentDto);
        return result;
    }

}
