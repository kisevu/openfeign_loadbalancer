package com.ameda.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Employee {
    @Id
    private String employeeId;
    private String names;
    private String phoneNumber;
    private String career;
}
