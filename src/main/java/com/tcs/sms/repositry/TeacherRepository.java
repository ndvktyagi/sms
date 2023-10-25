package com.tcs.sms.repositry;

import com.tcs.sms.dto.TeacherDto;
import com.tcs.sms.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity,Integer> {

}
