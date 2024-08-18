package com.github.library_api.domain.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class Lending {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String registration;
    private LocalDateTime deliveryDate;
    private LocalDateTime returnPeriod;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "librarian_id")
    private Librarian librarian;
}
