package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeService {

    static List<Employee> list = Stream.of(
            new Employee(1l, "name1", "IT", 1000.00d),
            new Employee(2l, "name2", "CSE", 2000.00d),
            new Employee(3l, "name3", "IT", 3000.00d),
            new Employee(4l, "name4", "CSE", 4000.00d)
    )
            .collect(Collectors.toList());

    public List<Employee> getEmployees() {
        return list;
    }

    public Employee getEmployeeById(Long id) {
        Optional<Employee> employeeOpt = list.stream().filter(emp -> emp.getEmployeeId() == id).findFirst();
        if(employeeOpt.isPresent()){
            return employeeOpt.get();
        }
        else {
            return null;
        }
    }

    public Employee addEmployee(Employee employee) {
        Long id = list.get(list.size()-1).getEmployeeId();
        employee.setEmployeeId(id +1);
        list.add(employee);
        return getEmployeeResponseMessage("Employee added successfully.");
    }

    private Employee getEmployeeResponseMessage(String s) {
        Employee empRes = new Employee();
        empRes.setMessage(s);
        return empRes;
    }

    public Employee updateEmployee(Employee employee, Long id) {
        Optional<Employee> empResponseOpt = list.stream().filter(emp -> emp.getEmployeeId() == id).findFirst();
        if(empResponseOpt.isPresent()) {
            Employee empResponse = empResponseOpt.get();
            empResponse.setEmployeeDept(employee.getEmployeeDept());
            empResponse.setEmployeeName(employee.getEmployeeName());
            empResponse.setEmployeeSalary(employee.getEmployeeSalary());
            return getEmployeeResponseMessage("Employee Updated Successfully.");

        }
        return getEmployeeResponseMessage("Employee Not Found with ID : "+id);
    }

    public Employee deleteEmployee(Long id) {
        Optional<Employee> empResponseOpt = list.stream().filter(emp -> emp.getEmployeeId() == id).findFirst();
        if(empResponseOpt.isPresent()) {
            Employee empResponse = empResponseOpt.get();
            boolean isDeleted = list.remove(empResponse);
            return getEmployeeResponseMessage("Employee Deleted Successfully."+ isDeleted);
        }
        return getEmployeeResponseMessage("Employee Not Found with ID : "+id);
    }
}
