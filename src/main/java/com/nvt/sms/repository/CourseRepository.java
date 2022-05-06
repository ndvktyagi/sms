package com.nvt.sms.repository;

import com.nvt.sms.entityBeans.CourseEntityBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<CourseEntityBean,Long> {
}
