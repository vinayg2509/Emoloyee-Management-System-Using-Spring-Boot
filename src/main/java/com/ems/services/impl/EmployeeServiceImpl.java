package com.ems.services.impl;

import com.ems.dto.EmployeeDto;
import com.ems.mapper.EmployeeMapper;
import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;
import com.ems.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

 private final   EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee= employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public List<EmployeeDto> getAllEmployee() {
       List<Employee> allEmployee= employeeRepository.findAll();
        return allEmployee.stream().map(EmployeeMapper::mapToEmployeeDto)
                .collect(Collectors.toList());
    }



}
