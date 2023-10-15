package com.tcs.sms.controller;

import com.tcs.sms.dto.StudentDto;
import com.tcs.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping()
    public List<StudentDto> studentDetails() {
        return studentService.getAllStudentDetails();
    }

    @PostMapping()
    public String studentRegistration(@RequestBody StudentDto studentDto) {
        System.out.println("StudentDto=" + studentDto);
        String result = studentService.studentRegistration(studentDto);
        return result;
    }

    @PutMapping()
    public String StudentUpdate(@RequestBody StudentDto studentDto){
        return studentService.updateStudentDetails(studentDto);
    }

}
