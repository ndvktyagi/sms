package com.nvt.sms.repository;

import com.nvt.sms.entityBeans.StudentEntityBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntityBean,Long>{

} ;

