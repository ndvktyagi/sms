package com.nvt.sms.service.impl;

import com.nvt.sms.beans.StudentBean;
import com.nvt.sms.entityBeans.StudentEntityBean;
import com.nvt.sms.repository.StudentRepository;
import com.nvt.sms.service.StudentService;
import org.springframework.beans.BeanUtils;
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
    public String studentAdd(StudentBean studentBean) {
        StudentEntityBean studentEntityBean = new StudentEntityBean();
        BeanUtils.copyProperties(studentBean,studentEntityBean);
        studentRepository.save(studentEntityBean);
        return "Student Details saved Successfully";
    }

    @Override
    public String studentUpdate(StudentBean studentBean) {
        StudentEntityBean studentEntityBean = new StudentEntityBean();
        BeanUtils.copyProperties(studentBean,studentEntityBean);
        studentRepository.save(studentEntityBean);
        return "Student Details updated Successfully";
    }

    @Override
    public String studentDelete(long studentRollNumber) {
        studentRepository.deleteById(studentRollNumber);
        return "Student Details is deleted successfully";
    }

    @Override
    public StudentBean studentGetDetails(long studentRollNumber) {
        StudentBean studentBean = null;
        Optional<StudentEntityBean> studentEntityBean= studentRepository.findById(studentRollNumber);
        if(studentEntityBean.isPresent()) {
            studentBean=new StudentBean();
            studentBean.setStudentRollNumber(studentEntityBean.get().getStudentRollNumber());
            studentBean.setStudentName(studentEntityBean.get().getStudentName());
            studentBean.setStuEmail(studentEntityBean.get().getStuEmail());
            studentBean.setStuMobileNumber(studentEntityBean.get().getStuMobileNumber());
            studentBean.setStudentBranchId(studentEntityBean.get().getStudentBranchId());
            studentBean.setStudentCourseId(studentEntityBean.get().getStudentCourseId());
        }
        return studentBean;
    }

    @Override
    public List<StudentBean> getAllStudents() {
        List<StudentBean> studentBeanList = new ArrayList<>();
        List<StudentEntityBean> studentEntityBeanList= (List<StudentEntityBean>) studentRepository.findAll();
        for (StudentEntityBean studentEntityBean:studentEntityBeanList) {
            StudentBean studentBean = new StudentBean();
            BeanUtils.copyProperties(studentEntityBean,studentBean);
            studentBeanList.add(studentBean);
        }
        return studentBeanList;
    }
}
