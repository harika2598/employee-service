package com.employee.service.controller;

import com.employee.service.entities.Employee;
import com.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/employee/{empId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployee(@PathVariable int empId) {
        return employeeService.getEmpDetailsById(empId);
    }

}
