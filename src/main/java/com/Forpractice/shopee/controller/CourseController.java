//package com.Forpractice.shopee.controller;
//
//import com.Forpractice.shopee.Model.Course;
//import com.Forpractice.shopee.service.CourseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/Courses")
//public class CourseController {
//    @Autowired
//    private CourseService courseService;
//
//    @GetMapping("/allcourses")
//    public List<Course> getallcourses(){
//        return courseService.getallcourses();
//    }
//
//    @GetMapping("coures/courseName:/{cname}")
//    public Course getbyname(@PathVariable String cname){
//       return (Course) courseService.getbyname(cname);
//    }
//
//}
