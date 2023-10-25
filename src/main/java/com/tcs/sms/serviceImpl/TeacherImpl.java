package com.tcs.sms.serviceImpl;

import com.tcs.sms.dto.TeacherDto;
import com.tcs.sms.entity.TeacherEntity;
import com.tcs.sms.repositry.TeacherRepository;
import com.tcs.sms.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherImpl implements TeacherService {


    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public TeacherEntity teacherRegistration(TeacherDto teacherDto){

        TeacherEntity teacherEntity=new TeacherEntity();

        teacherEntity.setName(teacherDto.getName());
        teacherEntity.setEmail(teacherDto.getEmail());
        teacherEntity.setMobileNumber(teacherDto.getMobileNumber());
        teacherEntity.setQualifications(teacherDto.getQualifications());
        teacherEntity.setSpecialization(teacherDto.getSpecialization());
        teacherEntity.setExperience(teacherDto.getExperience());
        return teacherRepository.save(teacherEntity);
    }

    @Override
    public List<TeacherDto> getTeachers(){

        List<TeacherEntity> teacherEntityList=teacherRepository.findAll();
        List<TeacherDto> teacherDtoList=new ArrayList<>();

        for (int i = 0; i <teacherEntityList.size() ; i++) {
            TeacherEntity teacherEntity=teacherEntityList.get(i);
            TeacherDto teacherDto=new TeacherDto();

            teacherDto.setId(teacherEntity.getId());
            teacherDto.setName(teacherEntity.getName());
            teacherDto.setEmail(teacherEntity.getEmail());
            teacherDto.setMobileNumber(teacherEntity.getMobileNumber());
            teacherDto.setQualifications(teacherEntity.getQualifications());
            teacherDto.setSpecialization(teacherEntity.getSpecialization());
            teacherDto.setExperience(teacherEntity.getExperience());

            teacherDtoList.add(teacherDto);
        }
        return teacherDtoList;
    }

    @Override
    public TeacherDto getTeacherById(int id){
        Optional<TeacherEntity> teacherEntityOptional=teacherRepository.findById(id);
        TeacherDto teacherDto=new TeacherDto();
        if(teacherEntityOptional.isPresent()){
            TeacherEntity teacherEntity=teacherEntityOptional.get();


            teacherDto.setId(teacherEntity.getId());
            teacherDto.setName(teacherEntity.getName());
            teacherDto.setEmail(teacherEntity.getEmail());
            teacherDto.setMobileNumber(teacherEntity.getMobileNumber());
            teacherDto.setQualifications(teacherEntity.getQualifications());
            teacherDto.setExperience(teacherEntity.getExperience());
            teacherDto.setSpecialization(teacherEntity.getSpecialization());


        }
        return  teacherDto;
    }

    @Override
    public String deleteById(int id){
        teacherRepository.deleteById(id);
        return "Teacher has been deleted successfully id:"+id;
    }
}
