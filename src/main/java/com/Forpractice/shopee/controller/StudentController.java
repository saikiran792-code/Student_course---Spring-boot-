package com.Forpractice.shopee.controller;

import com.Forpractice.shopee.Model.Student;
import com.Forpractice.shopee.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/Allstudents")
    public List<Student> GetAllStudents() {
        return studentService.GetAllStudents();
    }

    @GetMapping("Student/{id}")
    public Student GetByID(@PathVariable int id) {
        Optional<Student> student = studentService.GetById(id);
        return student.orElse(null);
    }

    @PostMapping(value = "/newStudent")
    public ResponseEntity<?> AddStudent( @Validated @RequestBody Student student) {
        Student student1 = studentService.AddStudent(student);
        System.out.println(student1);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(student1);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id) {

        try {

            studentService.deleteStudent(id);
            return ResponseEntity.ok("Student deleted successfully");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }
    @PutMapping("/UpdateStudent/{id}")
    public ResponseEntity<?> UpdateStudent(
            @PathVariable int id,
            @RequestBody Student student
            ){
        Student updateStudent = studentService.UpdateStudent(id,student);
        return new ResponseEntity<>(updateStudent,HttpStatus.OK);
    }
    @GetMapping("/course/{cname}")
    public List<Student> getStudentsByCourse(@PathVariable String cname){
        return studentService.getStudentsByCourse(cname);
    }



}