package com.tcs.sms.serviceImpl;

import com.tcs.sms.dto.StudentDto;
import com.tcs.sms.entity.StudentEntity;
import com.tcs.sms.repositry.StudentRepository;
import com.tcs.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String studentRegistration(StudentDto studentDto) {

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setStudentName(studentDto.getStudentName());
        studentEntity.setStudentEmail(studentDto.getStudentEmail());
        studentEntity.setStudentMobile(studentDto.getStudentMobile());
        studentEntity.setStudentCourseId(studentDto.getStudentCourseId());
        studentEntity.setStudentBranchId(studentDto.getStudentBranchId());
        studentEntity.setStudentSemester(studentDto.getStudentSemester());

        studentRepository.save(studentEntity);

        return "Student has registered successfully";
    }
}
