package com.tcs.sms.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity()
@Table(name = "Teacher_details")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String email;

    private long mobileNumber;

    private String qualifications;

    private int experience;

    private String specialization;
}
