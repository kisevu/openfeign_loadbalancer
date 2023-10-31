package com.ameda.employee.service;

import com.ameda.employee.DTO.EmployeeRequest;
import com.ameda.employee.entity.Employee;
import com.ameda.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public String setId(){
        return UUID.randomUUID().toString()
                .replace("-", "")
                .substring(0, 12);
    }
    public Employee register(EmployeeRequest employeeRequest) {
        Employee employee = Employee.builder()
                .employeeId(setId())
                .names(employeeRequest.getNames())
                .phoneNumber(employeeRequest.getPhoneNumber())
                .career(employeeRequest.getCareer())
                .build();
        return employeeRepository.save(employee);
    }
    public Employee getEmployee(String employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow();
        return employee;
    }
}
