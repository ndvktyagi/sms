package com.tcs.sms.service;

import com.tcs.sms.dto.TeacherDto;
import com.tcs.sms.entity.TeacherEntity;

import java.util.List;


public interface TeacherService {
    public TeacherEntity teacherRegistration(TeacherDto teacherDto);

    List<TeacherDto> getTeachers();

    TeacherDto getTeacherById(int id);

    String deleteById(int id);
}
