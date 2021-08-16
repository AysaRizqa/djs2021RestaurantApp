package com.restaurant.reservationApp.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "employees")
public class Employee {
    @Transient
    public static final String SEQUENCE_NAME = "employees_sequence";
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String role;
}
