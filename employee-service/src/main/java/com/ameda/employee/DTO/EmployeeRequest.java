package com.ameda.employee.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class EmployeeRequest {
    private String names;
    private String phoneNumber;
    private String career;
}
