package com.tcs.sms.service;

import com.tcs.sms.dto.StudentDto;

import java.util.List;

public interface StudentService {
    String studentRegistration(StudentDto studentDto);
    List<StudentDto> getAllStudentDetails();
    String updateStudentDetails(StudentDto studentDto);
    String deleteStudent(int studentId);
}
