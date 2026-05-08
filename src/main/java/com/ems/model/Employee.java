package com.ems.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.Pattern;

@Entity
@Getter
@Setter
@Table(name="employees")
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private Long id;

    @Column(name="first_name")
    @Pattern(regexp = "^[a-zA-Z ]{2,50}$", message = "Invalid name")
    private String firstName;

    @Pattern(regexp = "^[a-zA-Z ]{2,50}$", message = "Invalid name")
    @Column(name="last_name")
    private String lastName;


    @Column(name="email" ,nullable = false,unique = true)
    @Pattern(regexp = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")
    private String email;
}
