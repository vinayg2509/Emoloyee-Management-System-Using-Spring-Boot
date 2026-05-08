package com.ems.mapper;

import com.ems.dto.EmployeeDto;
import com.ems.model.Employee;

public class EmployeeMapper
{
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(employee.getId(),
                employee.getFullName(),employee.getLastName(),
                employee.getEmail());
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto)
    {
        return new Employee(employeeDto.getId(),
                employeeDto.getFullName(),employeeDto.getLastName(),employeeDto.getEmail());
    }
}
