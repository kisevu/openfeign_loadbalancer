package com.ameda.employee.controller;

import com.ameda.employee.DTO.EmployeeRequest;
import com.ameda.employee.entity.Employee;
import com.ameda.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
@Slf4j
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody EmployeeRequest employeeRequest){
        Employee employee = employeeService.register(employeeRequest);
        return new ResponseEntity<>(employee,HttpStatus.CREATED);
    }
    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<?> getEmployee(@PathVariable("employeeId") String employeeId){
        Employee employee = employeeService.getEmployee(employeeId);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }
}
