package com.Forpractice.shopee.service;

import com.Forpractice.shopee.Model.Course;
import com.Forpractice.shopee.repo.CourseRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getallcourses()
    {
        return courseRepository.findAll();
    }

    public List<Course> getbyname(String cname) {
        return courseRepository.findByCname(cname);
    }


    public Course newcourse(Course course) {
        return courseRepository.save(course);
    }

    public void deletecourse(int cid){
        if(!courseRepository.existsById(cid)){
            throw new RuntimeException("id not found");
        }
        courseRepository.deleteById(cid);
    }

    public Course updatecourse(int cid, @NonNull Course course) {
        Course existingcourse=courseRepository.findById(cid)
                .orElseThrow(()->new RuntimeException("cid is not found"));
        existingcourse.setCname(existingcourse.getCname());
        existingcourse.setFees(existingcourse.getFees());
        Course save1=courseRepository.save(existingcourse);
        return save1;
    }
}
