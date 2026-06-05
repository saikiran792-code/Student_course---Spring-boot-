package com.Forpractice.shopee.repo;

import com.Forpractice.shopee.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{


}
