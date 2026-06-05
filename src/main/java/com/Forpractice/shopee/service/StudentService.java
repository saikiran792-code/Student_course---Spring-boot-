package com.Forpractice.shopee.service;

import com.Forpractice.shopee.Model.Student;
import com.Forpractice.shopee.repo.StudentRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void deleteStudent(int id) {

        if (!studentRepository.existsById(id)) {
            throw new RuntimeException("Student not found");
        }

        studentRepository.deleteById(id);
    }

    public List<Student> GetAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> GetById(int id) {
        return studentRepository.findById(id);
    }


    public Student AddStudent(Student student) {
        Student save = studentRepository.save(student);
        return save;
       }

    public Student UpdateStudent(int id, @NonNull Student student) {
        Student existingstudent = studentRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Student not found in records"));
        existingstudent.setName(student.getName());
        existingstudent.setAddress(student.getAddress());
        existingstudent.setFavSub(student.getFavSub());
        Student save = studentRepository.save(existingstudent);
        return save;
    }
}
