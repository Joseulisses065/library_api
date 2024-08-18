package com.github.library_api.domain.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

public class Class {
    private int id;
    private String description;
    @OneToMany(mappedBy = "class", cascade = CascadeType.ALL)
    private List<Student> students;
}
