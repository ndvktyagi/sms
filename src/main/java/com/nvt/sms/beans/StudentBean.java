package com.nvt.sms.beans;

import com.nvt.sms.entityBeans.BranchEntityBean;
import lombok.Data;

@Data
public class StudentBean {
    long studentRollNumber;
    String studentName;
    String stuEmail;
    Long stuMobileNumber;
    Integer studentCourseId;
    Integer studentBranchId;
}
