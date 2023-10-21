package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class Book {
    private Person author;
    private String title;
    private LocalDateTime dateOfCreation;
}

