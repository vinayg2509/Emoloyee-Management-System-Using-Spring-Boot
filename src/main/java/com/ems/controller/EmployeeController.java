package com.ems.controller;

import com.ems.dto.EmployeeDto;
import com.ems.mapper.EmployeeMapper;
import com.ems.model.Employee;
import com.ems.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto)
    {
        EmployeeDto savedEmployee=employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<EmployeeDto>> getAll()
    {
        List<EmployeeDto> allEmployee=employeeService.getAllEmployee();
       return ResponseEntity.ok(allEmployee);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<EmployeeDto> getById(@PathVariable("id") Long employeeId) {
        EmployeeDto employee = employeeService.getById(employeeId);
        return ResponseEntity.ok(employee);
    }

    @DeleteMapping("deleteById/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Long employeeId)
    {
        employeeService.deleteById(employeeId);
        return ResponseEntity.ok("Employee with id "+employeeId+" deleted Successfully");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDto> updateById(@PathVariable("id") Long employeeId , @RequestBody EmployeeDto employeeDto)
    {
        EmployeeDto updatedEmployee=employeeService.updateEmployeeById(employeeId,employeeDto);
        return ResponseEntity.ok(updatedEmployee);
    }

}
