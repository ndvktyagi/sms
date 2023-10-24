package com.tcs.sms.dto;

import jakarta.annotation.sql.DataSourceDefinition;
import lombok.Data;

@Data
public class TeacherDto {


    private int id;
    private String name;
    private String email;
    private long mobileNumber;
    private String qualifications;
    private int experience;
    private String specialization;

}
