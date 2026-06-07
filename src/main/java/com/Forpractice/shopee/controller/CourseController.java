package com.Forpractice.shopee.controller;

import com.Forpractice.shopee.Model.Course;
import com.Forpractice.shopee.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/CourseApi")
public class CourseController {
    @Autowired
    private CourseService courseService;


    @GetMapping("/totalcourses")
    public List<Course> getallcourses(){
        return courseService.getallcourses();
    }

    @GetMapping("/coursename/{cname}")
    public List<Course> getbyname(@PathVariable String cname) {
        return courseService.getbyname(cname);
    }
    @PostMapping("/newCourse")
    public Course newcourse(@RequestBody Course course){
        return courseService.newcourse(course);
    }
    @DeleteMapping("/deletecourse/{cid}")
    public ResponseEntity<?> deletecourse(@PathVariable int cid){
        try{
            courseService.deletecourse(cid);
            return ResponseEntity.ok( "course was deleted");
        }catch (Exception e){
            return ResponseEntity.status (HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }
    @PutMapping("/updatecourse/{cid}")
    public ResponseEntity<?> updatecourse(@PathVariable int cid,@RequestBody Course course)
    {
        Course updatecourse=courseService.updatecourse(cid,course);
        return new ResponseEntity<>(updatecourse,HttpStatus.OK);
    }
}

