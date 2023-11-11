package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    };

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long id){ return employeeService.updateEmployee(employee, id);};

    @DeleteMapping("/employee/{id}")
    public Employee deleteEmployee(@PathVariable Long id){ return employeeService.deleteEmployee(id);};
}
