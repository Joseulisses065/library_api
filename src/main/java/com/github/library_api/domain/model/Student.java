package com.github.library_api.domain.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String registration;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @OneToMany(cascade = CascadeType.ALL)
    private Class classId;

}
