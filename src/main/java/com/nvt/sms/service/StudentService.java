package com.nvt.sms.service;

import com.nvt.sms.beans.StudentBean;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {

    String studentAdd(StudentBean studentBean);
    String studentUpdate(StudentBean studentBean);
    String studentDelete(long studentRollNumber);
    StudentBean studentGetDetails(long studentRollNumber);
    List<StudentBean> getAllStudents();
}
