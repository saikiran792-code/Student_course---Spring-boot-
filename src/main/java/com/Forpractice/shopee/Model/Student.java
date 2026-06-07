package com.Forpractice.shopee.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    private String favSub;
    private double fees;
    @ManyToOne
    @JoinColumn(name = "c_id")
    @JsonBackReference
    private Course course;
}
