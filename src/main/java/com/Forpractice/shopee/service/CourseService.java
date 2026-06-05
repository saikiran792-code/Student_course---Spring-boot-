//package com.Forpractice.shopee.service;
//
//import com.Forpractice.shopee.Model.Course;
//import com.Forpractice.shopee.repo.CourseRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//
//
//public class CourseService {
//    @Autowired
//    private CourseRepository courseRepository;
//
//    public List<Course> getallcourses() {
//        return courseRepository.findAll();
//    }
//
//    public List<Course> getClass(String cname) {
//
//        return courseRepository.getbyname(cname);
//    }
//}
