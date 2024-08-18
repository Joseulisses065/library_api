package com.github.library_api.domain.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

public class Librarian {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @OneToMany(mappedBy = "librarian",cascade = CascadeType.ALL)
    private List<Lending> lendings;
}
