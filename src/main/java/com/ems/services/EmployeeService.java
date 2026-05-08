package com.ems.services;


import com.ems.dto.EmployeeDto;
import com.ems.repository.EmployeeRepository;

import java.util.List;


public interface EmployeeService
{
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto getById(Long id);
}
