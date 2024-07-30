package com.github.library_api.domain.model;

import java.time.LocalDateTime;

public class Lending {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String registration;
    private LocalDateTime deliveryDate;
    private LocalDateTime returnPeriod;

    private Student student;

    private Librarian librarian;
}
