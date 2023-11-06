package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table(name = "persons")
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String secondName;

    private String phoneNumber;

    @Transient
    private String salaryInEUR;
    @Transient
    private String salaryInRUB;
    @Transient
    private String salaryInIRR;
    @Transient
    private String salaryInFkp;
    @Transient
    private String salaryInRubNet;
    @Transient
    private String salaryInIrrNet;
    @Transient
    private String salaryInFkpNet;
}





