package com.Forpractice.shopee.Model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String cname;
    private double fees;

    @OneToMany(mappedBy = "course",
            cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Student> students;
 }
