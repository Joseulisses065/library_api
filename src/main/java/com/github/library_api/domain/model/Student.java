package com.github.library_api.domain.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String registration;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classId;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Lending> lendings;

}
