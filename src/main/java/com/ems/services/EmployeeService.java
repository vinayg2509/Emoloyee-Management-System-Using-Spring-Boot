package com.ems.services;


import com.ems.dto.EmployeeDto;
import com.ems.repository.EmployeeRepository;


public interface EmployeeService
{
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}
