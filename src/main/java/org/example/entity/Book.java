package org.example.entity;

import lombok.Data;
import org.example.entity.Person;

import java.time.LocalDateTime;

@Data
public class Book {
    private Person author;
    private String title;
    private LocalDateTime dateOfCreation;

    public Book(Person author, String title, LocalDateTime dateOfCreation) {
        this.author = author;
        this.title = title;
        this.dateOfCreation = dateOfCreation;
    }
}
