package com.nvt.sms.entityBeans;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="branch")
public class BranchEntityBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="branch_id")
    Integer branchId;

    @Column(name="branch_name")
    String branchName;

}
