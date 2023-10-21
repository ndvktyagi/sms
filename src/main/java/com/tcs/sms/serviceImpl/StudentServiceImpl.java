package com.tcs.sms.serviceImpl;

import com.tcs.sms.dto.StudentDto;
import com.tcs.sms.entity.StudentEntity;
import com.tcs.sms.repositry.StudentRepository;
import com.tcs.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<StudentDto> getAllStudentDetails() {
        List<StudentEntity> studentEntityList = studentRepository.findAll();

        List<StudentDto> studentDtoList = new ArrayList<>();

        for (int i = 0; i < studentEntityList.size(); i++) {
            StudentEntity studentEntity = studentEntityList.get(i);
            StudentDto studentDto = new StudentDto();

            studentDto.setStudentId(studentEntity.getStudentId());
            studentDto.setStudentName(studentEntity.getStudentName());
            studentDto.setStudentEmail(studentEntity.getStudentEmail());
            studentDto.setStudentMobile(studentEntity.getStudentMobile());
            studentDto.setStudentSemester(studentEntity.getStudentSemester());
            studentDto.setStudentBranchId(studentEntity.getStudentBranchId());
            studentDto.setStudentCourseId(studentEntity.getStudentCourseId());

            studentDtoList.add(studentDto);
        }
        return studentDtoList;
    }

    public String updateStudentDetails(StudentDto studentDto) {
        Optional<StudentEntity> studentEntity = studentRepository.findById(studentDto.getStudentId());
        if (studentEntity.isPresent()) {
            if (studentDto.getStudentEmail() != null) {
                studentEntity.get().setStudentEmail(studentDto.getStudentEmail());
            }
            if (studentDto.getStudentName() != null) {
                studentEntity.get().setStudentName(studentDto.getStudentName());
            }
            if (studentDto.getStudentMobile() > 0) {
                studentEntity.get().setStudentMobile(studentDto.getStudentMobile());
            }
            if (studentDto.getStudentSemester() > 0) {
                studentEntity.get().setStudentSemester(studentDto.getStudentSemester());
            }
            if (studentDto.getStudentBranchId() > 0) {
                studentEntity.get().setStudentBranchId(studentDto.getStudentBranchId());
            }
            if (studentDto.getStudentCourseId() > 0) {
                studentEntity.get().setStudentCourseId(studentDto.getStudentCourseId());
            }

            studentRepository.save(studentEntity.get());
            return "Student has been updated successfully";

        } else {
            return "Student Record not found. So it can not be update";
        }

    }

    @Override
    public String deleteStudent(int studentId){
        studentRepository.deleteById(studentId);
        return "Student has been deleted successfully";
    }


}
