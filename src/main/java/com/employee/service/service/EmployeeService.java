package com.employee.service.service;

import com.employee.service.dao.EmployeeDao;
import com.employee.service.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao dao;

    public Employee getEmpDetailsById(int empId){
        return dao.getReferenceById(empId);
    }
}
