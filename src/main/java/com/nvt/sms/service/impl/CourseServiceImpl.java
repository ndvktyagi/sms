package com.nvt.sms.service.impl;

import com.nvt.sms.beans.CourseBean;
import com.nvt.sms.entityBeans.CourseEntityBean;
import com.nvt.sms.repository.CourseRepository;
import com.nvt.sms.service.CourseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public String addCourse(CourseBean courseBean) {
        CourseEntityBean courseEntityBean = new CourseEntityBean();
        BeanUtils.copyProperties(courseBean,courseEntityBean);
        courseRepository.save(courseEntityBean);
        return "Course has been saved successfully.";
    }

    @Override
    public String deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
        return "Course has been deleted successfully.";
    }

    @Override
    public String updateCourse(Long courseId) {
        return null;
    }

    @Override
    public CourseBean getCourse(Long courseId) {
        Optional<CourseEntityBean> courseEntityBean = courseRepository.findById(courseId);
        CourseBean courseBean = new CourseBean();
        courseBean.setCourseId(courseEntityBean.get().getCourseId());
        courseBean.setCourseName(courseEntityBean.get().getCourseName());
        return courseBean;
    }

    @Override
    public List<CourseBean> getAllCourses() {
        List<CourseEntityBean> courseEntityBeanList = (List<CourseEntityBean>) courseRepository.findAll();
        List<CourseBean> courseBeanList = new ArrayList<>();
        for (CourseEntityBean courseEntityBean:courseEntityBeanList ) {
            CourseBean courseBean = new CourseBean();
            BeanUtils.copyProperties(courseEntityBean,courseBean);
            courseBeanList.add(courseBean);
        }
        return courseBeanList;
    }
}
