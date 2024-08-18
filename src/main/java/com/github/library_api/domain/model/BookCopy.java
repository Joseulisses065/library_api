package com.github.library_api.domain.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class BookCopy {
    private int id;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}
