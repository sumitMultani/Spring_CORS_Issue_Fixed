package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {

    private Long employeeId;
    private String employeeName;
    private String employeeDept;
    private Double employeeSalary;
    private String message;


    public Employee() {

    }

    public Employee(Long employeeId, String employeeName, String employeeDept, Double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDept = employeeDept;
        this.employeeSalary = employeeSalary;

    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDept() {
        return employeeDept;
    }

    public void setEmployeeDept(String employeeDept) {
        this.employeeDept = employeeDept;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDept='" + employeeDept + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", message='" + message + '\'' +
                '}';
    }
}
